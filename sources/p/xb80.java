package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xb80 {
    public static final xb80 a;
    public static final /* synthetic */ xb80[] b;

    static {
        xb80 xb80Var = new xb80("CloseClicked", 0);
        a = xb80Var;
        b = new xb80[]{xb80Var};
    }

    public static xb80 valueOf(String str) {
        return (xb80) Enum.valueOf(xb80.class, str);
    }

    public static xb80[] values() {
        return (xb80[]) b.clone();
    }
}
