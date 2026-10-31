package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xzg {
    public static final xzg a;
    public static final /* synthetic */ xzg[] b;

    static {
        xzg xzgVar = new xzg("CardClicked", 0);
        a = xzgVar;
        b = new xzg[]{xzgVar};
    }

    public static xzg valueOf(String str) {
        return (xzg) Enum.valueOf(xzg.class, str);
    }

    public static xzg[] values() {
        return (xzg[]) b.clone();
    }
}
