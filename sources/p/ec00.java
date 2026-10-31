package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ec00 {
    public static final ec00 a;
    public static final ec00 b;
    public static final ec00 c;
    public static final /* synthetic */ ec00[] d;

    static {
        ec00 ec00Var = new ec00("READ_FAILED", 0);
        a = ec00Var;
        ec00 ec00Var2 = new ec00("WRITE_FAILED", 1);
        b = ec00Var2;
        ec00 ec00Var3 = new ec00("QUEUE_PERMANENTLY_STOPPED", 2);
        c = ec00Var3;
        d = new ec00[]{ec00Var, ec00Var2, ec00Var3};
    }

    public static ec00 valueOf(String str) {
        return (ec00) Enum.valueOf(ec00.class, str);
    }

    public static ec00[] values() {
        return (ec00[]) d.clone();
    }
}
