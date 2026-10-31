package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class iaj0 {
    public static final iaj0 a;
    public static final iaj0 b;
    public static final iaj0 c;
    public static final iaj0 d;
    public static final iaj0 e;
    public static final /* synthetic */ iaj0[] f;

    static {
        iaj0 iaj0Var = new iaj0("DialogDismissed", 0);
        a = iaj0Var;
        iaj0 iaj0Var2 = new iaj0("KeepCustomTransitionsClicked", 1);
        b = iaj0Var2;
        iaj0 iaj0Var3 = new iaj0("ReorderAllTracksClicked", 2);
        c = iaj0Var3;
        iaj0 iaj0Var4 = new iaj0("MoveTrackClicked", 3);
        d = iaj0Var4;
        iaj0 iaj0Var5 = new iaj0("CancelClicked", 4);
        e = iaj0Var5;
        f = new iaj0[]{iaj0Var, iaj0Var2, iaj0Var3, iaj0Var4, iaj0Var5};
    }

    public static iaj0 valueOf(String str) {
        return (iaj0) Enum.valueOf(iaj0.class, str);
    }

    public static iaj0[] values() {
        return (iaj0[]) f.clone();
    }
}
