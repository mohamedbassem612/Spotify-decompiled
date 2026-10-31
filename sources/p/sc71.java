package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sc71 {
    public static final sc71 a;
    public static final /* synthetic */ sc71[] b;

    static {
        sc71 sc71Var = new sc71("ShareSheetError", 0);
        a = sc71Var;
        b = new sc71[]{sc71Var, new sc71("ShareLinkClicked", 1), new sc71("ShowQrCodeClicked", 2), new sc71("FindPeopleLinkClicked", 3)};
    }

    public static sc71 valueOf(String str) {
        return (sc71) Enum.valueOf(sc71.class, str);
    }

    public static sc71[] values() {
        return (sc71[]) b.clone();
    }
}
