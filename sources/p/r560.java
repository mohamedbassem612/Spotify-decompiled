package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class r560 {
    public static final r560 a;
    public static final r560 b;
    public static final /* synthetic */ r560[] c;

    static {
        r560 r560Var = new r560("PLUGGED", 0);
        a = r560Var;
        r560 r560Var2 = new r560("UNPLUGGED", 1);
        b = r560Var2;
        c = new r560[]{r560Var, r560Var2};
    }

    public static r560 valueOf(String str) {
        return (r560) Enum.valueOf(r560.class, str);
    }

    public static r560[] values() {
        return (r560[]) c.clone();
    }
}
