package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;

public final class gc extends a {
    public String pbn;
    public String vId;
    public String vIe;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(96199);
        int f;
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            if (this.vId != null) {
                aVar.e(1, this.vId);
            }
            if (this.vIe != null) {
                aVar.e(2, this.vIe);
            }
            if (this.pbn != null) {
                aVar.e(3, this.pbn);
            }
            AppMethodBeat.o(96199);
            return 0;
        } else if (i == 1) {
            if (this.vId != null) {
                f = e.a.a.b.b.a.f(1, this.vId) + 0;
            } else {
                f = 0;
            }
            if (this.vIe != null) {
                f += e.a.a.b.b.a.f(2, this.vIe);
            }
            if (this.pbn != null) {
                f += e.a.a.b.b.a.f(3, this.pbn);
            }
            AppMethodBeat.o(96199);
            return f;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (f = a.getNextFieldNumber(aVar2); f > 0; f = a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, f)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(96199);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            gc gcVar = (gc) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    gcVar.vId = aVar3.BTU.readString();
                    AppMethodBeat.o(96199);
                    return 0;
                case 2:
                    gcVar.vIe = aVar3.BTU.readString();
                    AppMethodBeat.o(96199);
                    return 0;
                case 3:
                    gcVar.pbn = aVar3.BTU.readString();
                    AppMethodBeat.o(96199);
                    return 0;
                default:
                    AppMethodBeat.o(96199);
                    return -1;
            }
        } else {
            AppMethodBeat.o(96199);
            return -1;
        }
    }
}
