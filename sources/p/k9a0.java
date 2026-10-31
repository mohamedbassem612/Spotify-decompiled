package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class k9a0 extends o60 {
    public static final k9a0 N0;
    public static final k9a0 O0;
    public static final k9a0 X;
    public static final k9a0 Y;
    public static final k9a0 Z;
    public static final k9a0 f;
    public static final k9a0 g;
    public static final k9a0 h;
    public static final k9a0 i;
    public static final k9a0 t;
    public final /* synthetic */ byte d;
    public static final k9a0 e = new k9a0("package", false, 0);
    public static final k9a0 P0 = new k9a0("unknown", false, 11);

    static {
        boolean z = true;
        f = new k9a0("protected_and_package", z, (byte) 1);
        g = new k9a0("protected_static", z, (byte) 2);
        boolean z2 = false;
        h = new k9a0("inherited", z2, (byte) 3);
        i = new k9a0("internal", z2, (byte) 4);
        t = new k9a0("invisible_fake", z2, (byte) 5);
        X = new k9a0("local", z2, (byte) 6);
        Y = new k9a0("private", z2, (byte) 7);
        Z = new k9a0("private_to_this", z2, (byte) 8);
        boolean z3 = true;
        N0 = new k9a0("protected", z3, (byte) 9);
        O0 = new k9a0("public", z3, (byte) 10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k9a0(String str, boolean z, byte b) {
        super(str, z, (byte) 2);
        this.d = b;
    }

    public Integer a(o60 o60Var) {
        byte b = this.d;
        k9a0 k9a0Var = Z;
        k9a0 k9a0Var2 = Y;
        switch (b) {
            case 0:
                if (this == o60Var) {
                    return 0;
                }
                xkg0 xkg0Var = mjk1.a;
                return (o60Var == k9a0Var2 || o60Var == k9a0Var) ? 1 : -1;
            case 1:
                if (this == o60Var) {
                    return 0;
                }
                if (o60Var == i) {
                    return null;
                }
                xkg0 xkg0Var2 = mjk1.a;
                return (o60Var == k9a0Var2 || o60Var == k9a0Var) ? 1 : -1;
            default:
                return super.a(o60Var);
        }
    }

    public String e() {
        switch (this.d) {
            case 0:
                return "public/*package*/";
            case 1:
                return "protected/*protected and package*/";
            case 2:
                return "protected/*protected static*/";
            case 8:
                return "private/*private to this*/";
            default:
                return super.e();
        }
    }

    public o60 m() {
        byte b = this.d;
        k9a0 k9a0Var = N0;
        switch (b) {
            case 0:
            case 1:
            case 2:
                return k9a0Var;
            default:
                return this;
        }
    }
}
