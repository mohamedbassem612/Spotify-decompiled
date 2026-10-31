package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nd90 {
    public static final nd90 a;
    public static final nd90 b;
    public static final /* synthetic */ nd90[] c;

    static {
        nd90 nd90Var = new nd90("Transient", 0);
        a = nd90Var;
        nd90 nd90Var2 = new nd90("Permanent", 1);
        b = nd90Var2;
        c = new nd90[]{nd90Var, nd90Var2};
    }

    public static nd90 valueOf(String str) {
        return (nd90) Enum.valueOf(nd90.class, str);
    }

    public static nd90[] values() {
        return (nd90[]) c.clone();
    }
}
