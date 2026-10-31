package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kav implements mfv0 {
    public final zz3 X;
    public final nql1 Y;
    public final nql1 Z;
    public final long a;
    public final wat b;
    public final int c;
    public final od4 d;
    public final yz3 e;
    public final yz3 f;
    public final mql1 g;
    public final mql1 h;
    public final zz3 i;
    public final zz3 t;

    public kav(long j, wat watVar, od4 od4Var) {
        int iI0 = watVar.i0(48.0f);
        this.a = j;
        this.b = watVar;
        this.c = iI0;
        this.d = od4Var;
        int iI1 = watVar.i0(r3v.a(j));
        era eraVar = een.P0;
        this.e = new yz3(eraVar, eraVar, iI1);
        era eraVar2 = een.R0;
        this.f = new yz3(eraVar2, eraVar2, iI1);
        this.g = new mql1(dro.d);
        this.h = new mql1(dro.e);
        int iI2 = watVar.i0(r3v.b(j));
        fra fraVar = een.Z;
        fra fraVar2 = een.O0;
        this.i = new zz3(fraVar, fraVar2, iI2);
        this.t = new zz3(fraVar2, fraVar, iI2);
        this.X = new zz3(een.N0, fraVar, iI2);
        this.Y = new nql1(fraVar, iI0);
        this.Z = new nql1(fraVar2, iI0);
    }

    public final long a(ur80 ur80Var, long j, flb0 flb0Var, long j2) {
        ur80 ur80Var2;
        long j3;
        char c;
        int iA;
        int i;
        char c2 = ' ';
        int i2 = (int) (j >> 32);
        int i3 = 0;
        List listM = p7h.M(new mti0[]{this.e, this.f, ((int) (ur80Var.a() >> 32)) < i2 / 2 ? this.g : this.h});
        int size = listM.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                ur80Var2 = ur80Var;
                j3 = j;
                c = c2;
                iA = 0;
                break;
            }
            mti0 mti0Var = (mti0) listM.get(i4);
            int i5 = (int) (j2 >> c2);
            int i6 = size;
            c = c2;
            j3 = j;
            int i7 = i4;
            ur80Var2 = ur80Var;
            iA = mti0Var.a(ur80Var2, j3, i5, flb0Var);
            if (i7 == p7h.L(listM) || (iA >= 0 && i5 + iA <= i2)) {
                break;
            }
            i4 = i7 + 1;
            size = i6;
            c2 = c;
        }
        int i8 = (int) (j3 & 4294967295L);
        List listM2 = p7h.M(new nti0[]{this.i, this.t, this.X, ((int) (ur80Var2.a() & 4294967295L)) < i8 / 2 ? this.Y : this.Z});
        int size2 = listM2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            int i10 = (int) (j2 & 4294967295L);
            int iA2 = ((nti0) listM2.get(i9)).a(ur80Var2, j3, i10);
            if (i9 == p7h.L(listM2) || (iA2 >= (i = this.c) && i10 + iA2 <= i8 - i)) {
                i3 = iA2;
                break;
            }
        }
        long j4 = (((long) iA) << c) | (((long) i3) & 4294967295L);
        this.d.invoke(ur80Var2, hm5.e(j4, j2));
        return j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kav) {
            kav kavVar = (kav) obj;
            return this.a == kavVar.a && u890.j(this.b, kavVar.b) && this.c == kavVar.c && this.d == kavVar.d;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + kaa0.f(this.c, (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31);
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) r3v.c(this.a)) + ", density=" + this.b + ", verticalMargin=" + this.c + ", onPositionCalculated=" + this.d + ')';
    }
}
