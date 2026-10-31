package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class i381 {
    public static final i381 a;
    public static final i381 b;
    public static final /* synthetic */ i381[] c;

    static {
        i381 i381Var = new i381("RowClicked", 0);
        a = i381Var;
        i381 i381Var2 = new i381("FollowButtonClicked", 1);
        b = i381Var2;
        c = new i381[]{i381Var, i381Var2};
    }

    public static i381 valueOf(String str) {
        return (i381) Enum.valueOf(i381.class, str);
    }

    public static i381[] values() {
        return (i381[]) c.clone();
    }
}
