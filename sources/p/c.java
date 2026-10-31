package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class c {
    public static final rhc a;
    public static final rhc b;
    public static final rhc c;
    public static final rhc d;
    public static final rhc e;

    static {
        rhc rhcVar = new rhc(ryn1.m("/"));
        rhcVar.c = "/";
        a = rhcVar;
        rhc rhcVar2 = new rhc(ryn1.m("\\"));
        rhcVar2.c = "\\";
        b = rhcVar2;
        rhc rhcVar3 = new rhc(ryn1.m("/\\"));
        rhcVar3.c = "/\\";
        c = rhcVar3;
        rhc rhcVar4 = new rhc(ryn1.m("."));
        rhcVar4.c = ".";
        d = rhcVar4;
        rhc rhcVar5 = new rhc(ryn1.m(".."));
        rhcVar5.c = "..";
        e = rhcVar5;
    }

    public static final s8s0 a(s8s0 s8s0Var, s8s0 s8s0Var2, boolean z) {
        if (c(s8s0Var2) != -1 || s8s0Var2.f() != null) {
            return s8s0Var2;
        }
        rhc rhcVarB = b(s8s0Var);
        if (rhcVarB == null && (rhcVarB = b(s8s0Var2)) == null) {
            rhcVarB = f(s8s0.b);
        }
        nac nacVar = new nac();
        nacVar.N(s8s0Var.a);
        if (nacVar.b > 0) {
            nacVar.N(rhcVarB);
        }
        nacVar.N(s8s0Var2.a);
        return d(nacVar, z);
    }

    public static final rhc b(s8s0 s8s0Var) {
        rhc rhcVar = s8s0Var.a;
        rhc rhcVar2 = a;
        if (rhc.g(rhcVar, rhcVar2) != -1) {
            return rhcVar2;
        }
        rhc rhcVar3 = s8s0Var.a;
        rhc rhcVar4 = b;
        if (rhc.g(rhcVar3, rhcVar4) != -1) {
            return rhcVar4;
        }
        return null;
    }

    public static final int c(s8s0 s8s0Var) {
        rhc rhcVar = s8s0Var.a;
        if (rhcVar.d() != 0) {
            if (rhcVar.i(0) != 47) {
                if (rhcVar.i(0) == 92) {
                    if (rhcVar.d() > 2 && rhcVar.i(1) == 92) {
                        int iF = rhcVar.f(b.h(), 2);
                        return iF == -1 ? rhcVar.d() : iF;
                    }
                } else if (rhcVar.d() > 2 && rhcVar.i(1) == 58 && rhcVar.i(2) == 92) {
                    char cI = (char) rhcVar.i(0);
                    if ('a' <= cI && cI < '{') {
                        return 3;
                    }
                    if ('A' <= cI && cI < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x011c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:83:0x0117 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0119  */
    /* JADX WARN: Code duplicated, block: B:88:0x012e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0110 A[EDGE_INSN: B:98:0x0110->B:81:0x0110 BREAK  A[LOOP:1: B:53:0x00ab->B:112:0x00ab], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x00fe A[SYNTHETIC] */
    public static final s8s0 d(nac nacVar, boolean z) {
        rhc rhcVar;
        long j;
        char cG;
        boolean z2;
        ArrayList arrayList;
        boolean zZ0;
        rhc rhcVar2;
        int size;
        int i;
        long jI;
        rhc rhcVarW;
        rhc rhcVar3;
        nac nacVar2 = new nac();
        rhc rhcVarE = null;
        int i2 = 0;
        while (true) {
            if (!nacVar.i0(0L, a)) {
                rhcVar = b;
                if (!nacVar.i0(0L, rhcVar)) {
                    break;
                }
            }
            byte bU = nacVar.u();
            if (rhcVarE == null) {
                rhcVarE = e(bU);
            }
            i2++;
        }
        boolean z3 = i2 >= 2 && u890.j(rhcVarE, rhcVar);
        rhc rhcVar4 = c;
        if (z3) {
            rhcVarE.getClass();
            nacVar2.N(rhcVarE);
            nacVar2.N(rhcVarE);
        } else {
            if (i2 <= 0) {
                long jI2 = nacVar.i(0L, rhcVar4);
                if (rhcVarE == null) {
                    rhcVarE = jI2 == -1 ? f(s8s0.b) : e(nacVar.g(jI2));
                }
                if (u890.j(rhcVarE, rhcVar) && nacVar.b >= 2) {
                    j = -1;
                    if (nacVar.g(1L) == 58 && (('a' <= (cG = (char) nacVar.g(0L)) && cG < '{') || ('A' <= cG && cG < '['))) {
                        if (jI2 == 2) {
                            nacVar2.B0(nacVar, 3L);
                        } else {
                            nacVar2.B0(nacVar, 2L);
                        }
                    }
                }
                if (nacVar2.b > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                arrayList = new ArrayList();
                while (true) {
                    zZ0 = nacVar.z0();
                    rhcVar2 = d;
                    if (!zZ0) {
                        break;
                    }
                    jI = nacVar.i(0L, rhcVar4);
                    if (jI == j) {
                        rhcVarW = nacVar.w(nacVar.b);
                    } else {
                        rhcVarW = nacVar.w(jI);
                        nacVar.u();
                    }
                    rhcVar3 = e;
                    if (rhcVarW.equals(rhcVar3)) {
                        if (z2 || !arrayList.isEmpty()) {
                            if (z || (!z2 && (arrayList.isEmpty() || u890.j(o7h.A0(arrayList), rhcVar3)))) {
                                arrayList.add(rhcVarW);
                            } else if (!z3 || arrayList.size() != 1) {
                                r7h.e0(arrayList);
                            }
                        }
                    } else if (rhcVarW.equals(rhcVar2) && !rhcVarW.equals(rhc.d)) {
                        arrayList.add(rhcVarW);
                    }
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    if (i > 0) {
                        nacVar2.N(rhcVarE);
                    }
                    nacVar2.N((rhc) arrayList.get(i));
                }
                if (nacVar2.b == 0) {
                    nacVar2.N(rhcVar2);
                }
                return new s8s0(nacVar2.w(nacVar2.b));
            }
            rhcVarE.getClass();
            nacVar2.N(rhcVarE);
        }
        j = -1;
        if (nacVar2.b > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        arrayList = new ArrayList();
        while (true) {
            zZ0 = nacVar.z0();
            rhcVar2 = d;
            if (!zZ0) {
                break;
                break;
            }
            jI = nacVar.i(0L, rhcVar4);
            if (jI == j) {
                rhcVarW = nacVar.w(nacVar.b);
            } else {
                rhcVarW = nacVar.w(jI);
                nacVar.u();
            }
            rhcVar3 = e;
            if (rhcVarW.equals(rhcVar3)) {
                if (z2) {
                }
                if (z) {
                }
                arrayList.add(rhcVarW);
            } else if (rhcVarW.equals(rhcVar2)) {
            }
        }
        size = arrayList.size();
        while (i < size) {
            if (i > 0) {
                nacVar2.N(rhcVarE);
            }
            nacVar2.N((rhc) arrayList.get(i));
        }
        if (nacVar2.b == 0) {
            nacVar2.N(rhcVar2);
        }
        return new s8s0(nacVar2.w(nacVar2.b));
    }

    public static final rhc e(byte b2) {
        if (b2 == 47) {
            return a;
        }
        if (b2 == 92) {
            return b;
        }
        hhg1.n(f4i1.c(b2, "not a directory separator: "));
        return null;
    }

    public static final rhc f(String str) {
        if (u890.j(str, "/")) {
            return a;
        }
        if (u890.j(str, "\\")) {
            return b;
        }
        hhg1.n(l1d.m("not a directory separator: ", str));
        return null;
    }
}
