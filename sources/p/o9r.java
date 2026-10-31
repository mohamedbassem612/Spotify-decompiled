package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class o9r extends k9 implements n9r {
    public final ajn0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o9r(fg5 fg5Var, ajn0 ajn0Var) {
        super(fg5Var);
        if (fg5Var == null) {
            r0(0);
            throw null;
        }
        if (ajn0Var == null) {
            r0(1);
            throw null;
        }
        this.c = ajn0Var;
    }

    public static /* synthetic */ void r0(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 5 || i == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i != 2 && i != 3) {
            if (i == 4) {
                objArr[2] = "toString";
            } else if (i != 5 && i != 6) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static String v1(n9r n9rVar) {
        try {
            return cht.e.u(n9rVar) + "[" + n9rVar.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(n9rVar)) + "]";
        } catch (Throwable unused) {
            return n9rVar.getClass().getSimpleName() + " " + n9rVar.getName();
        }
    }

    @Override // p.n9r
    public final ajn0 getName() {
        ajn0 ajn0Var = this.c;
        if (ajn0Var != null) {
            return ajn0Var;
        }
        r0(2);
        throw null;
    }

    public String toString() {
        return v1(this);
    }

    /* JADX INFO: renamed from: a */
    public n9r w1() {
        return this;
    }
}
