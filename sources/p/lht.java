package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lht {
    public final o60 a;
    public final /* synthetic */ byte b;

    public lht(o60 o60Var, byte b) {
        this.b = b;
        this.a = o60Var;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014a  */
    /* JADX WARN: Code duplicated, block: B:109:0x0175 A[LOOP:1: B:97:0x0145->B:109:0x0175, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:118:0x017b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0145 A[ADDED_TO_REGION, LOOP:1: B:97:0x0145->B:109:0x0175, LOOP_START, PHI: r8
      0x0145: PHI (r8v1 p.n9r) = (r8v0 p.n9r), (r8v2 p.n9r) binds: [B:95:0x0142, B:109:0x0175] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:98:0x0147 A[DONT_INVERT] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [p.n9r] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r7v0, types: [p.n9r, p.s9r] */
    /* JADX WARN: Type inference failed for: r7v1, types: [p.n9r] */
    /* JADX WARN: Type inference failed for: r7v2, types: [p.n9r] */
    /* JADX WARN: Type inference failed for: r7v3, types: [p.n9r] */
    public final boolean a(yl01 yl01Var, s9r s9rVar, n9r n9rVar) {
        n9r n9rVarH;
        beg begVar;
        switch (this.b) {
            case 0:
                if (iht.p(s9rVar) && iht.e(n9rVar) != e4x0.P0) {
                    return mht.d(s9rVar, n9rVar);
                }
                if (s9rVar instanceof pjl) {
                    ((pjl) s9rVar).k();
                }
                while (s9rVar != 0) {
                    s9rVar = s9rVar.k();
                    if (((s9rVar instanceof beg) && !iht.k(s9rVar)) || (s9rVar instanceof dzq0)) {
                        if (s9rVar != 0) {
                            while (n9rVar != null) {
                                if (s9rVar == n9rVar) {
                                    return true;
                                }
                                if (n9rVar instanceof dzq0) {
                                    n9rVar = n9rVar.k();
                                } else if ((s9rVar instanceof dzq0) && ((ezq0) ((dzq0) s9rVar)).f.equals(((ezq0) ((dzq0) n9rVar)).f) && iht.c(n9rVar).equals(iht.c(s9rVar))) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                }
                if (s9rVar != 0) {
                    while (n9rVar != null) {
                        if (s9rVar == n9rVar) {
                            return true;
                        }
                        if (n9rVar instanceof dzq0) {
                            n9rVar = n9rVar.k();
                        } else if (s9rVar instanceof dzq0) {
                            return true;
                        }
                    }
                }
                return false;
            case 1:
                if (mht.a.a(yl01Var, s9rVar, n9rVar)) {
                    if (yl01Var == mht.m) {
                        return true;
                    }
                    if (yl01Var != mht.l && (n9rVarH = iht.h(s9rVar, beg.class, true)) != null && (yl01Var instanceof w380)) {
                        return ((w380) yl01Var).a.w1().equals(n9rVarH.w1());
                    }
                }
                return false;
            case 2:
                if (n9rVar == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3", "isVisible"));
                }
                beg begVar2 = (beg) iht.h(s9rVar, beg.class, true);
                beg begVar3 = (beg) iht.h(n9rVar, beg.class, false);
                if (begVar3 != null) {
                    if (begVar2 != null && iht.k(begVar2) && (begVar = (beg) iht.h(begVar2, beg.class, true)) != null && iht.o(begVar3.m(), begVar.w1())) {
                        return true;
                    }
                    ?? Q = s9rVar instanceof jyc ? iht.q((jyc) s9rVar) : s9rVar;
                    beg begVar4 = (beg) iht.h(Q, beg.class, true);
                    if (begVar4 != null) {
                        if (iht.o(begVar3.m(), begVar4.w1()) && yl01Var != mht.n) {
                            if (!(Q instanceof jyc) || (Q instanceof pjl) || yl01Var == mht.m) {
                                return true;
                            }
                            if (yl01Var != mht.l && yl01Var != null) {
                                a8b0 type = yl01Var.getType();
                                if (iht.o(type, begVar3)) {
                                    return true;
                                }
                                type.w0();
                            }
                        }
                        return a(yl01Var, s9rVar, begVar3.k());
                    }
                }
                return false;
            case 3:
                if (!iht.c(n9rVar).P(iht.c(s9rVar))) {
                    return false;
                }
                mht.o.getClass();
                return true;
            case 4:
                return true;
            case 5:
                throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
            case 6:
                throw new IllegalStateException("Visibility is unknown yet");
            case 7:
            case 8:
                return false;
            case 9:
                return y7a0.a(s9rVar, n9rVar);
            case 10:
                return y7a0.b(yl01Var, s9rVar, n9rVar);
            default:
                return y7a0.b(yl01Var, s9rVar, n9rVar);
        }
    }

    public final String toString() {
        return this.a.e();
    }
}
