package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p691 {
    public static final p691 a;
    public static final /* synthetic */ p691[] b;

    static {
        p691 p691Var = new p691("CONTENT_PICKER", 0);
        a = p691Var;
        b = new p691[]{p691Var, new p691("CAROUSEL", 1)};
    }

    public static p691 valueOf(String str) {
        return (p691) Enum.valueOf(p691.class, str);
    }

    public static p691[] values() {
        return (p691[]) b.clone();
    }
}
