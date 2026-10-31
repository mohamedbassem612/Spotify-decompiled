package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lt6 {
    public static final lt6 a;
    public static final /* synthetic */ lt6[] b;

    static {
        lt6 lt6Var = new lt6("CardClicked", 0);
        a = lt6Var;
        b = new lt6[]{lt6Var};
    }

    public static lt6 valueOf(String str) {
        return (lt6) Enum.valueOf(lt6.class, str);
    }

    public static lt6[] values() {
        return (lt6[]) b.clone();
    }
}
