package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ax01 {
    public static final ax01 a;
    public static final ax01 b;
    public static final ax01 c;
    public static final /* synthetic */ ax01[] d;

    static {
        ax01 ax01Var = new ax01("NOT_IN_LIST", 0);
        a = ax01Var;
        ax01 ax01Var2 = new ax01("IN_LIST", 1);
        b = ax01Var2;
        ax01 ax01Var3 = new ax01("IN_LIST_AS_RECOMMENDATION", 2);
        c = ax01Var3;
        d = new ax01[]{ax01Var, ax01Var2, ax01Var3};
    }

    public static ax01 valueOf(String str) {
        return (ax01) Enum.valueOf(ax01.class, str);
    }

    public static ax01[] values() {
        return (ax01[]) d.clone();
    }
}
