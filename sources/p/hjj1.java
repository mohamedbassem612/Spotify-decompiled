package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hjj1 {
    public static final hjj1 a;
    public static final /* synthetic */ hjj1[] b;

    static {
        hjj1 hjj1Var = new hjj1("ActionPressed", 0);
        a = hjj1Var;
        b = new hjj1[]{hjj1Var};
    }

    public static hjj1 valueOf(String str) {
        return (hjj1) Enum.valueOf(hjj1.class, str);
    }

    public static hjj1[] values() {
        return (hjj1[]) b.clone();
    }
}
