package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class n6k0 {
    public static final n6k0 a;
    public static final n6k0 b;
    public static final n6k0 c;
    public static final n6k0 d;
    public static final n6k0 e;
    public static final n6k0 f;
    public static final n6k0 g;
    public static final /* synthetic */ n6k0[] h;

    static {
        n6k0 n6k0Var = new n6k0("OnSaveClicked", 0);
        a = n6k0Var;
        n6k0 n6k0Var2 = new n6k0("OnCancelClicked", 1);
        b = n6k0Var2;
        n6k0 n6k0Var3 = new n6k0("OnSaveReadOnlyClicked", 2);
        c = n6k0Var3;
        n6k0 n6k0Var4 = new n6k0("OnMoreButtonClicked", 3);
        d = n6k0Var4;
        n6k0 n6k0Var5 = new n6k0("OnEducationVideosClicked", 4);
        e = n6k0Var5;
        n6k0 n6k0Var6 = new n6k0("OnUndoClicked", 5);
        f = n6k0Var6;
        n6k0 n6k0Var7 = new n6k0("OnRedoClicked", 6);
        g = n6k0Var7;
        h = new n6k0[]{n6k0Var, n6k0Var2, n6k0Var3, n6k0Var4, n6k0Var5, n6k0Var6, n6k0Var7};
    }

    public static n6k0 valueOf(String str) {
        return (n6k0) Enum.valueOf(n6k0.class, str);
    }

    public static n6k0[] values() {
        return (n6k0[]) h.clone();
    }
}
