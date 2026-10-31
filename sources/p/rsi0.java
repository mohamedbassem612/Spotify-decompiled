package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rsi0 {
    public static final rsi0 N0;
    public static final rsi0 O0;
    public static final /* synthetic */ rsi0[] P0;
    public static final rsi0 X;
    public static final rsi0 Y;
    public static final rsi0 Z;
    public static final rsi0 a;
    public static final rsi0 b;
    public static final rsi0 c;
    public static final rsi0 d;
    public static final rsi0 e;
    public static final rsi0 f;
    public static final rsi0 g;
    public static final rsi0 h;
    public static final rsi0 i;
    public static final rsi0 t;

    static {
        rsi0 rsi0Var = new rsi0("BOOK", 0);
        a = rsi0Var;
        rsi0 rsi0Var2 = new rsi0("SHOW", 1);
        b = rsi0Var2;
        rsi0 rsi0Var3 = new rsi0("ALBUM", 2);
        c = rsi0Var3;
        rsi0 rsi0Var4 = new rsi0("EVENT", 3);
        d = rsi0Var4;
        rsi0 rsi0Var5 = new rsi0("VENUE", 4);
        e = rsi0Var5;
        rsi0 rsi0Var6 = new rsi0("COURSE", 5);
        f = rsi0Var6;
        rsi0 rsi0Var7 = new rsi0("ARTIST", 6);
        g = rsi0Var7;
        rsi0 rsi0Var8 = new rsi0("AUTHOR", 7);
        h = rsi0Var8;
        rsi0 rsi0Var9 = new rsi0("FOLDER", 8);
        i = rsi0Var9;
        rsi0 rsi0Var10 = new rsi0("UNKNOWN", 9);
        t = rsi0Var10;
        rsi0 rsi0Var11 = new rsi0("PLAYLIST", 10);
        X = rsi0Var11;
        rsi0 rsi0Var12 = new rsi0("PRERELEASE", 11);
        Y = rsi0Var12;
        rsi0 rsi0Var13 = new rsi0("LIKED_SONGS", 12);
        Z = rsi0Var13;
        rsi0 rsi0Var14 = new rsi0("LOCAL_FILES", 13);
        rsi0 rsi0Var15 = new rsi0("NEW_EPISODES", 14);
        N0 = rsi0Var15;
        rsi0 rsi0Var16 = new rsi0("CONCERT_CAMPAIGN", 15);
        O0 = rsi0Var16;
        P0 = new rsi0[]{rsi0Var, rsi0Var2, rsi0Var3, rsi0Var4, rsi0Var5, rsi0Var6, rsi0Var7, rsi0Var8, rsi0Var9, rsi0Var10, rsi0Var11, rsi0Var12, rsi0Var13, rsi0Var14, rsi0Var15, rsi0Var16};
    }

    public static rsi0 valueOf(String str) {
        return (rsi0) Enum.valueOf(rsi0.class, str);
    }

    public static rsi0[] values() {
        return (rsi0[]) P0.clone();
    }
}
