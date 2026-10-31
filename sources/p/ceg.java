package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class ceg extends y5 {
    public final n9r e;
    public final mka1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ceg(s1c1 s1c1Var, n9r n9rVar, ajn0 ajn0Var, mka1 mka1Var) {
        super(s1c1Var, ajn0Var);
        if (s1c1Var == null) {
            l0(0);
            throw null;
        }
        if (n9rVar == null) {
            l0(1);
            throw null;
        }
        if (ajn0Var == null) {
            l0(2);
            throw null;
        }
        this.e = n9rVar;
        this.f = mka1Var;
    }

    public static /* synthetic */ void l0(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = "source";
        } else if (i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p.p9r
    public final mka1 getSource() {
        mka1 mka1Var = this.f;
        if (mka1Var != null) {
            return mka1Var;
        }
        l0(5);
        throw null;
    }

    @Override // p.zji0
    public boolean isExternal() {
        return false;
    }

    @Override // p.n9r
    public final n9r k() {
        n9r n9rVar = this.e;
        if (n9rVar != null) {
            return n9rVar;
        }
        l0(4);
        throw null;
    }
}
