package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class q9r extends o9r implements p9r {
    public final n9r d;
    public final mka1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9r(n9r n9rVar, fg5 fg5Var, ajn0 ajn0Var, mka1 mka1Var) {
        super(fg5Var, ajn0Var);
        if (n9rVar == null) {
            r0(0);
            throw null;
        }
        if (fg5Var == null) {
            r0(1);
            throw null;
        }
        if (ajn0Var == null) {
            r0(2);
            throw null;
        }
        if (mka1Var == null) {
            r0(3);
            throw null;
        }
        this.d = n9rVar;
        this.e = mka1Var;
    }

    public static /* synthetic */ void r0(int i) {
        String str = (i == 4 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 4) {
            objArr[1] = "getOriginal";
        } else if (i == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5 && i != 6) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public mka1 getSource() {
        mka1 mka1Var = this.e;
        if (mka1Var != null) {
            return mka1Var;
        }
        r0(6);
        throw null;
    }

    public n9r k() {
        n9r n9rVar = this.d;
        if (n9rVar != null) {
            return n9rVar;
        }
        r0(5);
        throw null;
    }

    @Override // p.o9r, p.n9r, p.jfg
    public p9r w1() {
        return this;
    }
}
