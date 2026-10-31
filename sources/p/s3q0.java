package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s3q0 {
    public static final s3q0 a;
    public static final s3q0 b;
    public static final s3q0 c;
    public static final /* synthetic */ s3q0[] d;

    static {
        s3q0 s3q0Var = new s3q0("UNKNOWN", 0);
        a = s3q0Var;
        s3q0 s3q0Var2 = new s3q0("ACTIVE", 1);
        b = s3q0Var2;
        s3q0 s3q0Var3 = new s3q0("INACTIVE", 2);
        c = s3q0Var3;
        d = new s3q0[]{s3q0Var, s3q0Var2, s3q0Var3};
    }

    public static s3q0 valueOf(String str) {
        return (s3q0) Enum.valueOf(s3q0.class, str);
    }

    public static s3q0[] values() {
        return (s3q0[]) d.clone();
    }
}
