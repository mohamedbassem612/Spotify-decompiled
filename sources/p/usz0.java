package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class usz0 {
    public static final usz0 a;
    public static final /* synthetic */ usz0[] b;

    static {
        usz0 usz0Var = new usz0("Clicked", 0);
        a = usz0Var;
        b = new usz0[]{usz0Var};
    }

    public static usz0 valueOf(String str) {
        return (usz0) Enum.valueOf(usz0.class, str);
    }

    public static usz0[] values() {
        return (usz0[]) b.clone();
    }
}
