package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class y981 {
    public static final y981 a;
    public static final /* synthetic */ y981[] b;

    static {
        y981 y981Var = new y981("RowClicked", 0);
        a = y981Var;
        b = new y981[]{y981Var};
    }

    public static y981 valueOf(String str) {
        return (y981) Enum.valueOf(y981.class, str);
    }

    public static y981[] values() {
        return (y981[]) b.clone();
    }
}
