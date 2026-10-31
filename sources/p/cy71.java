package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class cy71 {
    public static final cy71 a;
    public static final cy71 b;
    public static final cy71 c;
    public static final /* synthetic */ cy71[] d;

    static {
        cy71 cy71Var = new cy71("START", 0);
        a = cy71Var;
        cy71 cy71Var2 = new cy71("STOP", 1);
        b = cy71Var2;
        cy71 cy71Var3 = new cy71("STOP_AND_RESET_REPLAY_CACHE", 2);
        c = cy71Var3;
        d = new cy71[]{cy71Var, cy71Var2, cy71Var3};
    }

    public static cy71 valueOf(String str) {
        return (cy71) Enum.valueOf(cy71.class, str);
    }

    public static cy71[] values() {
        return (cy71[]) d.clone();
    }
}
