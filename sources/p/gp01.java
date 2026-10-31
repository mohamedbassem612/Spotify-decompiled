package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gp01 {
    public static final gp01 a;
    public static final gp01 b;
    public static final gp01 c;
    public static final gp01 d;
    public static final /* synthetic */ gp01[] e;

    static {
        gp01 gp01Var = new gp01("MIXED_SHOWS", 0);
        a = gp01Var;
        gp01 gp01Var2 = new gp01("AUDIO_SHOWS", 1);
        b = gp01Var2;
        gp01 gp01Var3 = new gp01("VIDEO_SHOWS", 2);
        c = gp01Var3;
        gp01 gp01Var4 = new gp01("TRACKS", 3);
        d = gp01Var4;
        e = new gp01[]{gp01Var, gp01Var2, gp01Var3, gp01Var4};
    }

    public static gp01 valueOf(String str) {
        return (gp01) Enum.valueOf(gp01.class, str);
    }

    public static gp01[] values() {
        return (gp01[]) e.clone();
    }
}
