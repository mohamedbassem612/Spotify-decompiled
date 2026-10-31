package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class nn41 {
    public static final nn41 a;
    public static final nn41 b;
    public static final nn41 c;
    public static final /* synthetic */ nn41[] d;

    static {
        nn41 nn41Var = new nn41("PENDING", 0);
        a = nn41Var;
        nn41 nn41Var2 = new nn41("RUNNING", 1);
        b = nn41Var2;
        nn41 nn41Var3 = new nn41("DROPPED", 2);
        c = nn41Var3;
        d = new nn41[]{nn41Var, nn41Var2, nn41Var3};
    }

    public static nn41 valueOf(String str) {
        return (nn41) Enum.valueOf(nn41.class, str);
    }

    public static nn41[] values() {
        return (nn41[]) d.clone();
    }
}
