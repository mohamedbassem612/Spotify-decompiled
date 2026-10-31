package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class c3d1 {
    public static final c3d1 a;
    public static final c3d1 b;
    public static final c3d1 c;
    public static final c3d1 d;
    public static final /* synthetic */ c3d1[] e;

    static {
        c3d1 c3d1Var = new c3d1("TRANSITION_READ_ONLY", 0);
        a = c3d1Var;
        c3d1 c3d1Var2 = new c3d1("CUSTOM_TRANSITION", 1);
        b = c3d1Var2;
        c3d1 c3d1Var3 = new c3d1("ADJUSTED_TRACK_SPEED", 2);
        c = c3d1Var3;
        c3d1 c3d1Var4 = new c3d1("DISPLAY_FREQUENCY", 3);
        d = c3d1Var4;
        e = new c3d1[]{c3d1Var, c3d1Var2, c3d1Var3, c3d1Var4};
    }

    public static c3d1 valueOf(String str) {
        return (c3d1) Enum.valueOf(c3d1.class, str);
    }

    public static c3d1[] values() {
        return (c3d1[]) e.clone();
    }
}
