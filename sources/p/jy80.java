package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jy80 {
    public static final jy80 a;
    public static final jy80 b;
    public static final jy80 c;
    public static final /* synthetic */ jy80[] d;

    static {
        jy80 jy80Var = new jy80("OPEN", 0);
        a = jy80Var;
        jy80 jy80Var2 = new jy80("THINKING", 1);
        b = jy80Var2;
        jy80 jy80Var3 = new jy80("REALTIME_VOICE", 2);
        c = jy80Var3;
        d = new jy80[]{jy80Var, jy80Var2, jy80Var3};
    }

    public static jy80 valueOf(String str) {
        return (jy80) Enum.valueOf(jy80.class, str);
    }

    public static jy80[] values() {
        return (jy80[]) d.clone();
    }
}
