package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lak0 {
    public static final lak0 a;
    public static final lak0 b;
    public static final lak0 c;
    public static final /* synthetic */ lak0[] d;

    static {
        lak0 lak0Var = new lak0("OnAddToPlaylistClicked", 0);
        a = lak0Var;
        lak0 lak0Var2 = new lak0("OnShareClicked", 1);
        b = lak0Var2;
        lak0 lak0Var3 = new lak0("OnDismissRequest", 2);
        c = lak0Var3;
        d = new lak0[]{lak0Var, lak0Var2, lak0Var3};
    }

    public static lak0 valueOf(String str) {
        return (lak0) Enum.valueOf(lak0.class, str);
    }

    public static lak0[] values() {
        return (lak0[]) d.clone();
    }
}
