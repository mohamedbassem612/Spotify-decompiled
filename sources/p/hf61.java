package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hf61 {
    public static final /* synthetic */ hf61[] X;
    public static final hf61 a;
    public static final hf61 b;
    public static final hf61 c;
    public static final hf61 d;
    public static final hf61 e;
    public static final hf61 f;
    public static final hf61 g;
    public static final hf61 h;
    public static final hf61 i;
    public static final hf61 t;

    static {
        hf61 hf61Var = new hf61("BASE", 0);
        a = hf61Var;
        hf61 hf61Var2 = new hf61("ANDROID_AUTO", 1);
        b = hf61Var2;
        hf61 hf61Var3 = new hf61("VOICE_ASSISTANT", 2);
        c = hf61Var3;
        hf61 hf61Var4 = new hf61("WAZE", 3);
        d = hf61Var4;
        hf61 hf61Var5 = new hf61("PME", 4);
        e = hf61Var5;
        hf61 hf61Var6 = new hf61("AI_PARTNER", 5);
        f = hf61Var6;
        hf61 hf61Var7 = new hf61("TRANSSION", 6);
        g = hf61Var7;
        hf61 hf61Var8 = new hf61("XIAOMI", 7);
        h = hf61Var8;
        hf61 hf61Var9 = new hf61("SAMSUNG", 8);
        i = hf61Var9;
        hf61 hf61Var10 = new hf61("SNAP_SPECS", 9);
        t = hf61Var10;
        X = new hf61[]{hf61Var, hf61Var2, hf61Var3, hf61Var4, hf61Var5, hf61Var6, hf61Var7, hf61Var8, hf61Var9, hf61Var10};
    }

    public static hf61 valueOf(String str) {
        return (hf61) Enum.valueOf(hf61.class, str);
    }

    public static hf61[] values() {
        return (hf61[]) X.clone();
    }
}
