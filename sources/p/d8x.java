package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d8x {
    public static final d8x a;
    public static final /* synthetic */ d8x[] b;

    static {
        d8x d8xVar = new d8x("BUTTON_CLICKED", 0);
        a = d8xVar;
        b = new d8x[]{d8xVar};
    }

    public static d8x valueOf(String str) {
        return (d8x) Enum.valueOf(d8x.class, str);
    }

    public static d8x[] values() {
        return (d8x[]) b.clone();
    }
}
