package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kxh0 {
    public static final kxh0 N0;
    public static final /* synthetic */ kxh0[] O0;
    public static final kxh0 X;
    public static final kxh0 Y;
    public static final kxh0 Z;
    public static final kxh0 a;
    public static final kxh0 b;
    public static final kxh0 c;
    public static final kxh0 d;
    public static final kxh0 e;
    public static final kxh0 f;
    public static final kxh0 g;
    public static final kxh0 h;
    public static final kxh0 i;
    public static final kxh0 t;

    static {
        kxh0 kxh0Var = new kxh0("STOP", 0);
        a = kxh0Var;
        kxh0 kxh0Var2 = new kxh0("PAUSE", 1);
        b = kxh0Var2;
        kxh0 kxh0Var3 = new kxh0("PLAY", 2);
        c = kxh0Var3;
        kxh0 kxh0Var4 = new kxh0("SKIP_TO_PREVIOUS", 3);
        d = kxh0Var4;
        kxh0 kxh0Var5 = new kxh0("SKIP_TO_NEXT", 4);
        e = kxh0Var5;
        kxh0 kxh0Var6 = new kxh0("SET_RATING", 5);
        f = kxh0Var6;
        kxh0 kxh0Var7 = new kxh0("SEEK_TO", 6);
        g = kxh0Var7;
        kxh0 kxh0Var8 = new kxh0("PLAY_FROM_MEDIA_ID", 7);
        h = kxh0Var8;
        kxh0 kxh0Var9 = new kxh0("PLAY_FROM_SEARCH", 8);
        i = kxh0Var9;
        kxh0 kxh0Var10 = new kxh0("SKIP_TO_QUEUE_ITEM", 9);
        t = kxh0Var10;
        kxh0 kxh0Var11 = new kxh0("PLAY_FROM_URI", 10);
        X = kxh0Var11;
        kxh0 kxh0Var12 = new kxh0("PREPARE_FROM_URI", 11);
        Y = kxh0Var12;
        kxh0 kxh0Var13 = new kxh0("SET_REPEAT_MODE", 12);
        Z = kxh0Var13;
        kxh0 kxh0Var14 = new kxh0("SET_SHUFFLE_MODE", 13);
        N0 = kxh0Var14;
        O0 = new kxh0[]{kxh0Var, kxh0Var2, kxh0Var3, kxh0Var4, kxh0Var5, kxh0Var6, kxh0Var7, kxh0Var8, kxh0Var9, kxh0Var10, kxh0Var11, kxh0Var12, kxh0Var13, kxh0Var14};
    }

    public static kxh0 valueOf(String str) {
        return (kxh0) Enum.valueOf(kxh0.class, str);
    }

    public static kxh0[] values() {
        return (kxh0[]) O0.clone();
    }
}
