package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class f1h1 extends e1h1 {
    public final int a;
    public final a8b0 b;

    public f1h1(int i, a8b0 a8b0Var) {
        if (i == 0) {
            e(0);
            throw null;
        }
        if (a8b0Var == null) {
            e(1);
            throw null;
        }
        this.a = i;
        this.b = a8b0Var;
    }

    public static /* synthetic */ void e(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i == 3) {
            objArr[2] = "replaceType";
        } else if (i != 4 && i != 5) {
            if (i != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p.e1h1
    public final int a() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        e(4);
        throw null;
    }

    @Override // p.e1h1
    public final a8b0 b() {
        a8b0 a8b0Var = this.b;
        if (a8b0Var != null) {
            return a8b0Var;
        }
        e(5);
        throw null;
    }

    @Override // p.e1h1
    public final boolean c() {
        return false;
    }

    @Override // p.e1h1
    public final e1h1 d(g8b0 g8b0Var) {
        return new f1h1(this.a, this.b);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f1h1(a8b0 a8b0Var) {
        this(1, a8b0Var);
        if (a8b0Var != null) {
        } else {
            e(2);
            throw null;
        }
    }
}
