package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jsz0 {
    public static final jsz0 a;
    public static final /* synthetic */ jsz0[] b;

    static {
        jsz0 jsz0Var = new jsz0("Clicked", 0);
        a = jsz0Var;
        b = new jsz0[]{jsz0Var};
    }

    public static jsz0 valueOf(String str) {
        return (jsz0) Enum.valueOf(jsz0.class, str);
    }

    public static jsz0[] values() {
        return (jsz0[]) b.clone();
    }
}
