package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ams0 {
    public static final ams0 a;
    public static final ams0 b;
    public static final /* synthetic */ ams0[] c;

    static {
        ams0 ams0Var = new ams0("GRANTED", 0);
        a = ams0Var;
        ams0 ams0Var2 = new ams0("DENIED", 1);
        b = ams0Var2;
        c = new ams0[]{ams0Var, ams0Var2, new ams0("PERMANENTLY_DENIED", 2)};
    }

    public static ams0 valueOf(String str) {
        return (ams0) Enum.valueOf(ams0.class, str);
    }

    public static ams0[] values() {
        return (ams0[]) c.clone();
    }
}
