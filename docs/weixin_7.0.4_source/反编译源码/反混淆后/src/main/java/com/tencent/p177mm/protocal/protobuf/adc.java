package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.C6092b;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.adc */
public final class adc extends C1331a {
    public acv wkV;
    public LinkedList<String> wkW = new LinkedList();

    public adc() {
        AppMethodBeat.m2504i(112432);
        AppMethodBeat.m2505o(112432);
    }

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(112433);
        C6092b c6092b;
        int ix;
        byte[] bArr;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.wkV == null) {
                c6092b = new C6092b("Not all required fields were included: GameItem");
                AppMethodBeat.m2505o(112433);
                throw c6092b;
            }
            if (this.wkV != null) {
                c6093a.mo13479iy(1, this.wkV.computeSize());
                this.wkV.writeFields(c6093a);
            }
            c6093a.mo13474e(2, 1, this.wkW);
            AppMethodBeat.m2505o(112433);
            return 0;
        } else if (i == 1) {
            if (this.wkV != null) {
                ix = C6087a.m9557ix(1, this.wkV.computeSize()) + 0;
            } else {
                ix = 0;
            }
            int c = ix + C6087a.m9552c(2, 1, this.wkW);
            AppMethodBeat.m2505o(112433);
            return c;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.wkW.clear();
            C6086a c6086a = new C6086a(bArr, unknownTagHandler);
            for (ix = C1331a.getNextFieldNumber(c6086a); ix > 0; ix = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, ix)) {
                    c6086a.ems();
                }
            }
            if (this.wkV == null) {
                c6092b = new C6092b("Not all required fields were included: GameItem");
                AppMethodBeat.m2505o(112433);
                throw c6092b;
            }
            AppMethodBeat.m2505o(112433);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            adc adc = (adc) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList Vh = c6086a2.mo13445Vh(intValue);
                    int size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        acv acv = new acv();
                        C6086a c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = acv.populateBuilderWithField(c6086a3, acv, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        adc.wkV = acv;
                    }
                    AppMethodBeat.m2505o(112433);
                    return 0;
                case 2:
                    adc.wkW.add(c6086a2.BTU.readString());
                    AppMethodBeat.m2505o(112433);
                    return 0;
                default:
                    AppMethodBeat.m2505o(112433);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(112433);
            return -1;
        }
    }
}
