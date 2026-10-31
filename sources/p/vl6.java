package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vl6 {
    public static final vl6 a;
    public static final vl6 b;
    public static final vl6 c;
    public static final vl6 d;
    public static final /* synthetic */ vl6[] e;

    static {
        vl6 vl6Var = new vl6("RowClicked", 0);
        a = vl6Var;
        vl6 vl6Var2 = new vl6("FollowButtonClicked", 1);
        b = vl6Var2;
        vl6 vl6Var3 = new vl6("ConcertClicked", 2);
        c = vl6Var3;
        vl6 vl6Var4 = new vl6("ConcertSaveButtonClicked", 3);
        d = vl6Var4;
        e = new vl6[]{vl6Var, vl6Var2, vl6Var3, vl6Var4};
    }

    public static vl6 valueOf(String str) {
        return (vl6) Enum.valueOf(vl6.class, str);
    }

    public static vl6[] values() {
        return (vl6[]) e.clone();
    }
}
