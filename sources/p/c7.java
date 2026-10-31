package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class c7 extends pa {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7(int i, int i2, fg5 fg5Var, n9r n9rVar, ajn0 ajn0Var, s1c1 s1c1Var, boolean z) {
        super(i, i2, fg5Var, n9rVar, ajn0Var, s1c1Var, z);
        if (s1c1Var == null) {
            r0(0);
            throw null;
        }
        if (n9rVar == null) {
            r0(1);
            throw null;
        }
        if (i != 0) {
        } else {
            r0(4);
            throw null;
        }
    }

    public static /* synthetic */ void r0(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // p.o9r
    public final String toString() {
        return (this.g ? "reified " : "") + (x() != 1 ? xcg1.q(x()).concat(" ") : "") + getName();
    }
}
