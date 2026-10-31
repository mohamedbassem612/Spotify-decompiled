package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ot00 implements mfv0 {
    public final nql1 X;
    public final int a;
    public final ven0 b;
    public final od4 c;
    public final yz3 d;
    public final yz3 e;
    public final mql1 f;
    public final mql1 g;
    public final zz3 h;
    public final zz3 i;
    public final nql1 t;

    public ot00(wat watVar, int i, ven0 ven0Var, od4 od4Var) {
        int iI0 = watVar.i0(48.0f);
        this.a = i;
        this.b = ven0Var;
        this.c = od4Var;
        era eraVar = een.P0;
        this.d = new yz3(eraVar, eraVar, 0);
        era eraVar2 = een.R0;
        this.e = new yz3(eraVar2, eraVar2, 0);
        this.f = new mql1(dro.d);
        this.g = new mql1(dro.e);
        fra fraVar = een.Z;
        fra fraVar2 = een.O0;
        this.h = new zz3(fraVar, fraVar2, 0);
        this.i = new zz3(fraVar2, fraVar, 0);
        this.t = new nql1(fraVar, iI0);
        this.X = new nql1(fraVar2, iI0);
    }

    public final long a(ur80 ur80Var, long j, flb0 flb0Var, long j2) {
        ur80 ur80Var2;
        char c;
        long j3;
        int iA;
        ven0 ven0Var = this.b;
        if (ven0Var != null) {
            ven0Var.getValue();
        }
        char c2 = ' ';
        long j4 = 4294967295L;
        long j5 = (((long) ((int) (j >> 32))) << 32) | (((long) (((int) (j & 4294967295L)) + this.a)) & 4294967295L);
        int i = (int) (j5 >> 32);
        int i2 = 0;
        List listM = p7h.M(new mti0[]{this.d, this.e, ((int) (ur80Var.a() >> 32)) < i / 2 ? this.f : this.g});
        int size = listM.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                ur80Var2 = ur80Var;
                c = c2;
                j3 = j4;
                iA = 0;
                break;
            }
            c = c2;
            j3 = j4;
            int i4 = (int) (j2 >> c);
            int i5 = size;
            int i6 = i3;
            ur80Var2 = ur80Var;
            List list = listM;
            iA = ((mti0) listM.get(i3)).a(ur80Var2, j5, i4, flb0Var);
            if (i6 == p7h.L(list) || (iA >= 0 && i4 + iA <= i)) {
                break;
            }
            i3 = i6 + 1;
            listM = list;
            size = i5;
            c2 = c;
            j4 = j3;
        }
        int i7 = (int) (j5 & j3);
        List listM2 = p7h.M(new nti0[]{this.h, this.i, ((int) (ur80Var2.a() & j3)) < i7 / 2 ? this.t : this.X});
        int size2 = listM2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            int i9 = (int) (j2 & j3);
            int iA2 = ((nti0) listM2.get(i8)).a(ur80Var2, j5, i9);
            if (i8 == p7h.L(listM2) || (iA2 >= 0 && i9 + iA2 <= i7)) {
                i2 = iA2;
                break;
            }
        }
        long j6 = (((long) iA) << c) | (((long) i2) & j3);
        this.c.invoke(ur80Var2, hm5.e(j6, j2));
        return j6;
    }
}
