package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jx00 {
    public static final jx00 a;
    public static final jx00 b;
    public static final jx00 c;
    public static final /* synthetic */ jx00[] d;

    static {
        jx00 jx00Var = new jx00("Idle", 0);
        a = jx00Var;
        jx00 jx00Var2 = new jx00("Paused", 1);
        b = jx00Var2;
        jx00 jx00Var3 = new jx00("Playing", 2);
        c = jx00Var3;
        d = new jx00[]{jx00Var, jx00Var2, jx00Var3};
    }

    public static jx00 valueOf(String str) {
        return (jx00) Enum.valueOf(jx00.class, str);
    }

    public static jx00[] values() {
        return (jx00[]) d.clone();
    }
}
