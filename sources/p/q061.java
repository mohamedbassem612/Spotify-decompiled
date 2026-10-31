package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class q061 {
    public static final q061 a;
    public static final q061 b;
    public static final q061 c;
    public static final /* synthetic */ q061[] d;

    static {
        q061 q061Var = new q061("SELECTED", 0);
        a = q061Var;
        q061 q061Var2 = new q061("SELECTABLE", 1);
        b = q061Var2;
        q061 q061Var3 = new q061("UNSELECTED", 2);
        c = q061Var3;
        d = new q061[]{q061Var, q061Var2, q061Var3};
    }

    public static q061 valueOf(String str) {
        return (q061) Enum.valueOf(q061.class, str);
    }

    public static q061[] values() {
        return (q061[]) d.clone();
    }
}
