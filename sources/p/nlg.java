package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nlg {
    public static final nlg a;
    public static final /* synthetic */ nlg[] b;

    static {
        nlg nlgVar = new nlg("CardClicked", 0);
        a = nlgVar;
        b = new nlg[]{nlgVar};
    }

    public static nlg valueOf(String str) {
        return (nlg) Enum.valueOf(nlg.class, str);
    }

    public static nlg[] values() {
        return (nlg[]) b.clone();
    }
}
