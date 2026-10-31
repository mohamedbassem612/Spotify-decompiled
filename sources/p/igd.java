package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class igd {
    public static final igd a;
    public static final /* synthetic */ igd[] b;

    static {
        igd igdVar = new igd("CancelRequestClicked", 0);
        a = igdVar;
        b = new igd[]{igdVar};
    }

    public static igd valueOf(String str) {
        return (igd) Enum.valueOf(igd.class, str);
    }

    public static igd[] values() {
        return (igd[]) b.clone();
    }
}
