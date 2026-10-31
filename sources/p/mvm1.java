package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mvm1 {
    public static final mvm1 a;
    public static final mvm1 b;
    public static final mvm1 c;
    public static final mvm1 d;
    public static final mvm1 e;
    public static final mvm1 f;
    public static final /* synthetic */ mvm1[] g;

    static {
        mvm1 mvm1Var = new mvm1("AvatarClicked", 0);
        a = mvm1Var;
        mvm1 mvm1Var2 = new mvm1("HeaderTextClicked", 1);
        b = mvm1Var2;
        mvm1 mvm1Var3 = new mvm1("CreateButtonClicked", 2);
        c = mvm1Var3;
        mvm1 mvm1Var4 = new mvm1("SearchButtonClicked", 3);
        d = mvm1Var4;
        mvm1 mvm1Var5 = new mvm1("RecentsButtonClicked", 4);
        e = mvm1Var5;
        mvm1 mvm1Var6 = new mvm1("DownloadCenterButtonClicked", 5);
        f = mvm1Var6;
        g = new mvm1[]{mvm1Var, mvm1Var2, mvm1Var3, mvm1Var4, mvm1Var5, mvm1Var6};
    }

    public static mvm1 valueOf(String str) {
        return (mvm1) Enum.valueOf(mvm1.class, str);
    }

    public static mvm1[] values() {
        return (mvm1[]) g.clone();
    }
}
