package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class s600 {
    public static final s600 a;
    public static final s600 b;
    public static final s600 c;
    public static final /* synthetic */ s600[] d;

    static {
        s600 s600Var = new s600("RowClicked", 0);
        a = s600Var;
        s600 s600Var2 = new s600("RowLongClicked", 1);
        b = s600Var2;
        s600 s600Var3 = new s600("AddToQueueSwiped", 2);
        c = s600Var3;
        d = new s600[]{s600Var, s600Var2, s600Var3};
    }

    public static s600 valueOf(String str) {
        return (s600) Enum.valueOf(s600.class, str);
    }

    public static s600[] values() {
        return (s600[]) d.clone();
    }
}
