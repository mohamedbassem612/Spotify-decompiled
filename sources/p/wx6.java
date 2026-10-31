package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wx6 {
    public static final wx6 a;
    public static final wx6 b;
    public static final /* synthetic */ wx6[] c;

    static {
        wx6 wx6Var = new wx6("RowClicked", 0);
        a = wx6Var;
        wx6 wx6Var2 = new wx6("FollowButtonClicked", 1);
        b = wx6Var2;
        c = new wx6[]{wx6Var, wx6Var2};
    }

    public static wx6 valueOf(String str) {
        return (wx6) Enum.valueOf(wx6.class, str);
    }

    public static wx6[] values() {
        return (wx6[]) c.clone();
    }
}
