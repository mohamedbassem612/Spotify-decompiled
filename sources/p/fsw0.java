package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fsw0 {
    public static final fsw0 a;
    public static final fsw0 b;
    public static final fsw0 c;
    public static final /* synthetic */ fsw0[] d;

    static {
        fsw0 fsw0Var = new fsw0("MAIN", 0);
        a = fsw0Var;
        fsw0 fsw0Var2 = new fsw0("GDBPROCESS", 1);
        b = fsw0Var2;
        fsw0 fsw0Var3 = new fsw0("UNKNOWN", 2);
        c = fsw0Var3;
        d = new fsw0[]{fsw0Var, fsw0Var2, fsw0Var3};
        new khc((byte) 20);
    }

    public static fsw0 valueOf(String str) {
        return (fsw0) Enum.valueOf(fsw0.class, str);
    }

    public static fsw0[] values() {
        return (fsw0[]) d.clone();
    }
}
