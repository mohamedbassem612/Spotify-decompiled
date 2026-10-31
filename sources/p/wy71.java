package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wy71 {
    public static final wy71 a;
    public static final wy71 b;
    public static final wy71 c;
    public static final /* synthetic */ wy71[] d;

    static {
        wy71 wy71Var = new wy71("Peek", 0);
        a = wy71Var;
        wy71 wy71Var2 = new wy71("Expanded", 1);
        b = wy71Var2;
        wy71 wy71Var3 = new wy71("Hidden", 2);
        c = wy71Var3;
        d = new wy71[]{wy71Var, wy71Var2, wy71Var3};
    }

    public static wy71 valueOf(String str) {
        return (wy71) Enum.valueOf(wy71.class, str);
    }

    public static wy71[] values() {
        return (wy71[]) d.clone();
    }
}
