package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ft6 {
    public static final ft6 a;
    public static final /* synthetic */ ft6[] b;

    static {
        ft6 ft6Var = new ft6("CardClicked", 0);
        a = ft6Var;
        b = new ft6[]{ft6Var};
    }

    public static ft6 valueOf(String str) {
        return (ft6) Enum.valueOf(ft6.class, str);
    }

    public static ft6[] values() {
        return (ft6[]) b.clone();
    }
}
