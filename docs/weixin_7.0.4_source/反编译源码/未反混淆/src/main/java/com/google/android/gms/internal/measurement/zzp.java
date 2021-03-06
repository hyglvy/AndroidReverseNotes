package com.google.android.gms.internal.measurement;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;

public class zzp {
    private static final ClassLoader zzql = zzp.class.getClassLoader();

    static {
        AppMethodBeat.i(3534);
        AppMethodBeat.o(3534);
    }

    private zzp() {
    }

    public static <T extends Parcelable> T zza(Parcel parcel, Creator<T> creator) {
        AppMethodBeat.i(3530);
        if (parcel.readInt() == 0) {
            AppMethodBeat.o(3530);
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        AppMethodBeat.o(3530);
        return parcelable;
    }

    public static void zza(Parcel parcel, IInterface iInterface) {
        AppMethodBeat.i(3532);
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
            AppMethodBeat.o(3532);
            return;
        }
        parcel.writeStrongBinder(iInterface.asBinder());
        AppMethodBeat.o(3532);
    }

    public static void zza(Parcel parcel, Parcelable parcelable) {
        AppMethodBeat.i(3531);
        if (parcelable == null) {
            parcel.writeInt(0);
            AppMethodBeat.o(3531);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
        AppMethodBeat.o(3531);
    }

    public static void zza(Parcel parcel, boolean z) {
        AppMethodBeat.i(3529);
        parcel.writeInt(z ? 1 : 0);
        AppMethodBeat.o(3529);
    }

    public static boolean zza(Parcel parcel) {
        AppMethodBeat.i(3528);
        if (parcel.readInt() != 0) {
            AppMethodBeat.o(3528);
            return true;
        }
        AppMethodBeat.o(3528);
        return false;
    }

    public static HashMap zzb(Parcel parcel) {
        AppMethodBeat.i(3533);
        HashMap readHashMap = parcel.readHashMap(zzql);
        AppMethodBeat.o(3533);
        return readHashMap;
    }
}
