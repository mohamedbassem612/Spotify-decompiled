package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class p4w0 {
    public static final p4w0 a;
    public static final /* synthetic */ p4w0[] b;

    static {
        p4w0 p4w0Var = new p4w0("ButtonClicked", 0);
        a = p4w0Var;
        b = new p4w0[]{p4w0Var};
    }

    public static p4w0 valueOf(String str) {
        return (p4w0) Enum.valueOf(p4w0.class, str);
    }

    public static p4w0[] values() {
        return (p4w0[]) b.clone();
    }
}
