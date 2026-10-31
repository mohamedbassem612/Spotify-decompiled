package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class z5 extends ma {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(s1c1 s1c1Var) {
        super(s1c1Var);
        if (s1c1Var != null) {
        } else {
            i(0);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    public static /* synthetic */ void i(int i) {
        String str = (i == 1 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 3 || i == 4) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else if (i == 2) {
            objArr[0] = "classifier";
        } else if (i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 1) {
            objArr[1] = "getBuiltIns";
        } else if (i == 3 || i == 4) {
            objArr[1] = "getAdditionalNeighboursInSupertypeGraph";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        }
        if (i != 1) {
            if (i == 2) {
                objArr[2] = "isSameClassifier";
            } else if (i != 3 && i != 4) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 3 && i != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p.ma
    public final a8b0 b() {
        if (g6b0.H(s())) {
            return null;
        }
        return e().f();
    }

    public final g6b0 e() {
        g6b0 g6b0VarE = kht.e(s());
        if (g6b0VarE != null) {
            return g6b0VarE;
        }
        i(1);
        throw null;
    }

    @Override // p.ma
    public final boolean g(jfg jfgVar) {
        boolean z;
        if (jfgVar instanceof beg) {
            beg begVarS = s();
            if (!u890.j(begVarS.getName(), jfgVar.getName())) {
                z = false;
                break;
            }
            n9r n9rVarK = begVarS.k();
            n9r n9rVarK2 = jfgVar.k();
            while (true) {
                if (n9rVarK != null && n9rVarK2 != null) {
                    if (!(n9rVarK instanceof zim0)) {
                        if (!(n9rVarK2 instanceof zim0)) {
                            if (n9rVarK instanceof dzq0) {
                                if (!(n9rVarK2 instanceof dzq0) || !u890.j(((ezq0) ((dzq0) n9rVarK)).f, ((ezq0) ((dzq0) n9rVarK2)).f)) {
                                    break;
                                }
                            } else if (!(n9rVarK2 instanceof dzq0) && u890.j(n9rVarK.getName(), n9rVarK2.getName())) {
                                n9rVarK = n9rVarK.k();
                                n9rVarK2 = n9rVarK2.k();
                            }
                        }
                        z = false;
                        break;
                    }
                    z = n9rVarK2 instanceof zim0;
                    break;
                }
                z = true;
                break;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public abstract beg s();
}
