package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class i3f1 {
    public static final i3f1 a;
    public static final i3f1 b;
    public static final i3f1 c;
    public static final i3f1 d;
    public static final /* synthetic */ i3f1[] e;

    static {
        i3f1 i3f1Var = new i3f1("Refresh", 0);
        a = i3f1Var;
        i3f1 i3f1Var2 = new i3f1("OpenInBrowser", 1);
        b = i3f1Var2;
        i3f1 i3f1Var3 = new i3f1("CopyLink", 2);
        c = i3f1Var3;
        i3f1 i3f1Var4 = new i3f1("Share", 3);
        d = i3f1Var4;
        e = new i3f1[]{i3f1Var, i3f1Var2, i3f1Var3, i3f1Var4};
    }

    public static i3f1 valueOf(String str) {
        return (i3f1) Enum.valueOf(i3f1.class, str);
    }

    public static i3f1[] values() {
        return (i3f1[]) e.clone();
    }
}
