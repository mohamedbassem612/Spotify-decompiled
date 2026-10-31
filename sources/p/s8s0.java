package p;

import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class s8s0 implements Comparable {
    public static final String b = File.separator;
    public final rhc a;

    public s8s0(rhc rhcVar) {
        this.a = rhcVar;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int iC = c.c(this);
        rhc rhcVar = this.a;
        if (iC == -1) {
            iC = 0;
        } else if (iC < rhcVar.d() && rhcVar.i(iC) == 92) {
            iC++;
        }
        int iD = rhcVar.d();
        int i = iC;
        while (iC < iD) {
            if (rhcVar.i(iC) == 47 || rhcVar.i(iC) == 92) {
                arrayList.add(rhcVar.n(i, iC));
                i = iC + 1;
            }
            iC++;
        }
        if (i < rhcVar.d()) {
            arrayList.add(rhcVar.n(i, rhcVar.d()));
        }
        return arrayList;
    }

    public final String b() {
        rhc rhcVar = c.a;
        rhc rhcVarO = this.a;
        rhcVarO.getClass();
        int iJ = rhcVarO.j(rhcVar.h());
        if (iJ == -1) {
            rhc rhcVar2 = c.b;
            rhcVarO.getClass();
            iJ = rhcVarO.j(rhcVar2.h());
        }
        if (iJ != -1) {
            rhcVarO = rhc.o(rhcVarO, iJ + 1, 0, 2);
        } else if (f() != null && rhcVarO.d() == 2) {
            rhcVarO = rhc.d;
        }
        return rhcVarO.r();
    }

    public final s8s0 c() {
        rhc rhcVar = c.d;
        rhc rhcVar2 = this.a;
        if (u890.j(rhcVar2, rhcVar)) {
            return null;
        }
        rhc rhcVar3 = c.a;
        if (u890.j(rhcVar2, rhcVar3)) {
            return null;
        }
        rhc rhcVar4 = c.b;
        if (u890.j(rhcVar2, rhcVar4)) {
            return null;
        }
        rhc rhcVar5 = c.e;
        int iD = rhcVar2.d();
        byte[] bArr = rhcVar5.a;
        if (rhcVar2.k(iD - bArr.length, rhcVar5, bArr.length) && (rhcVar2.d() == 2 || rhcVar2.k(rhcVar2.d() - 3, rhcVar3, 1) || rhcVar2.k(rhcVar2.d() - 3, rhcVar4, 1))) {
            return null;
        }
        rhcVar2.getClass();
        int iJ = rhcVar2.j(rhcVar3.h());
        if (iJ == -1) {
            rhcVar2.getClass();
            iJ = rhcVar2.j(rhcVar4.h());
        }
        if (iJ == 2 && f() != null) {
            if (rhcVar2.d() == 3) {
                return null;
            }
            return new s8s0(rhc.o(rhcVar2, 0, 3, 1));
        }
        if (iJ == 1 && rhcVar2.k(0, rhcVar4, rhcVar4.d())) {
            return null;
        }
        if (iJ != -1 || f() == null) {
            if (iJ == -1) {
                return new s8s0(rhcVar);
            }
            return iJ == 0 ? new s8s0(rhc.o(rhcVar2, 0, 1, 1)) : new s8s0(rhc.o(rhcVar2, 0, iJ, 1));
        }
        if (rhcVar2.d() == 2) {
            return null;
        }
        return new s8s0(rhc.o(rhcVar2, 0, 2, 1));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a.compareTo(((s8s0) obj).a);
    }

    public final s8s0 d(s8s0 s8s0Var) {
        rhc rhcVar = s8s0Var.a;
        int iC = c.c(this);
        rhc rhcVar2 = this.a;
        s8s0 s8s0Var2 = iC == -1 ? null : new s8s0(rhcVar2.n(0, iC));
        int iC2 = c.c(s8s0Var);
        if (!u890.j(s8s0Var2, iC2 == -1 ? null : new s8s0(rhcVar.n(0, iC2)))) {
            bhn0.l("Paths of different roots cannot be relative to each other: ", this, " and ", s8s0Var);
            return null;
        }
        ArrayList arrayListA = a();
        ArrayList arrayListA2 = s8s0Var.a();
        int iMin = Math.min(arrayListA.size(), arrayListA2.size());
        int i = 0;
        while (i < iMin && u890.j(arrayListA.get(i), arrayListA2.get(i))) {
            i++;
        }
        if (i == iMin && rhcVar2.d() == rhcVar.d()) {
            return gtv0.f(".");
        }
        if (arrayListA2.subList(i, arrayListA2.size()).indexOf(c.e) != -1) {
            bhn0.l("Impossible relative path to resolve: ", this, " and ", s8s0Var);
            return null;
        }
        if (u890.j(rhcVar, c.d)) {
            return this;
        }
        nac nacVar = new nac();
        rhc rhcVarB = c.b(s8s0Var);
        if (rhcVarB == null && (rhcVarB = c.b(this)) == null) {
            rhcVarB = c.f(b);
        }
        int size = arrayListA2.size();
        for (int i2 = i; i2 < size; i2++) {
            nacVar.N(c.e);
            nacVar.N(rhcVarB);
        }
        int size2 = arrayListA.size();
        while (i < size2) {
            nacVar.N((rhc) arrayListA.get(i));
            nacVar.N(rhcVarB);
            i++;
        }
        return c.d(nacVar, false);
    }

    public final s8s0 e(String str) {
        nac nacVar = new nac();
        nacVar.Y(str);
        return c.a(this, c.d(nacVar, false), false);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof s8s0) && u890.j(((s8s0) obj).a, this.a);
    }

    public final Character f() {
        rhc rhcVar = c.a;
        rhc rhcVar2 = this.a;
        if (rhc.g(rhcVar2, rhcVar) != -1 || rhcVar2.d() < 2 || rhcVar2.i(1) != 58) {
            return null;
        }
        char cI = (char) rhcVar2.i(0);
        if (('a' > cI || cI >= '{') && ('A' > cI || cI >= '[')) {
            return null;
        }
        return Character.valueOf(cI);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final File toFile() {
        return new File(this.a.r());
    }

    public final String toString() {
        return this.a.r();
    }
}
