package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class n5o0 {
    public static final n5o0 N0;
    public static final n5o0 O0;
    public static final n5o0 P0;
    public static final n5o0 Q0;
    public static final n5o0 R0;
    public static final n5o0 S0;
    public static final n5o0 T0;
    public static final /* synthetic */ n5o0[] U0;
    public static final n5o0 X;
    public static final n5o0 Y;
    public static final n5o0 Z;
    public static final n5o0 a;
    public static final n5o0 b;
    public static final n5o0 c;
    public static final n5o0 d;
    public static final n5o0 e;
    public static final n5o0 f;
    public static final n5o0 g;
    public static final n5o0 h;
    public static final n5o0 i;
    public static final n5o0 t;

    /* JADX INFO: Fake field, exist only in values array */
    n5o0 EF1;

    static {
        n5o0 n5o0Var = new n5o0("UNSPECIFIED", 0);
        n5o0 n5o0Var2 = new n5o0("INCORRECT", 1);
        a = n5o0Var2;
        n5o0 n5o0Var3 = new n5o0("OFFENSIVE", 2);
        b = n5o0Var3;
        n5o0 n5o0Var4 = new n5o0("NOT_INTERESTING", 3);
        c = n5o0Var4;
        n5o0 n5o0Var5 = new n5o0("OUT_OF_DATE", 4);
        d = n5o0Var5;
        n5o0 n5o0Var6 = new n5o0("OTHER", 5);
        e = n5o0Var6;
        n5o0 n5o0Var7 = new n5o0("SONG_CREDITS_MISSING_CREDIT", 6);
        f = n5o0Var7;
        n5o0 n5o0Var8 = new n5o0("SONG_CREDITS_EXTRA_OR_DUPLICATE", 7);
        g = n5o0Var8;
        n5o0 n5o0Var9 = new n5o0("SONG_CREDITS_INCORRECT_ROLE", 8);
        h = n5o0Var9;
        n5o0 n5o0Var10 = new n5o0("SONG_CREDITS_MISSPELT", 9);
        i = n5o0Var10;
        n5o0 n5o0Var11 = new n5o0("SONG_CREDITS_OTHER", 10);
        t = n5o0Var11;
        n5o0 n5o0Var12 = new n5o0("SAMPLES_MISSING_SAMPLE_OR_INTERPOLATION", 11);
        X = n5o0Var12;
        n5o0 n5o0Var13 = new n5o0("SAMPLES_INCORRECT_SAMPLE_OR_INTERPOLATION", 12);
        Y = n5o0Var13;
        n5o0 n5o0Var14 = new n5o0("SAMPLES_MISSING_ORIGINAL_SONG", 13);
        Z = n5o0Var14;
        n5o0 n5o0Var15 = new n5o0("SAMPLES_INCORRECT_ORIGINAL_SONG", 14);
        N0 = n5o0Var15;
        n5o0 n5o0Var16 = new n5o0("SAMPLES_OTHER", 15);
        O0 = n5o0Var16;
        n5o0 n5o0Var17 = new n5o0("PLAYLIST_UNTRUE_OR_INACCURATE", 16);
        P0 = n5o0Var17;
        n5o0 n5o0Var18 = new n5o0("PLAYLIST_TASTE_MISMATCH", 17);
        Q0 = n5o0Var18;
        n5o0 n5o0Var19 = new n5o0("PLAYLIST_REPETITIVE_OR_BORING", 18);
        R0 = n5o0Var19;
        n5o0 n5o0Var20 = new n5o0("PLAYLIST_INACCURATE_TEXT", 19);
        S0 = n5o0Var20;
        n5o0 n5o0Var21 = new n5o0("PLAYLIST_OFFENSIVE", 20);
        T0 = n5o0Var21;
        U0 = new n5o0[]{n5o0Var, n5o0Var2, n5o0Var3, n5o0Var4, n5o0Var5, n5o0Var6, n5o0Var7, n5o0Var8, n5o0Var9, n5o0Var10, n5o0Var11, n5o0Var12, n5o0Var13, n5o0Var14, n5o0Var15, n5o0Var16, n5o0Var17, n5o0Var18, n5o0Var19, n5o0Var20, n5o0Var21};
    }

    public static n5o0 valueOf(String str) {
        return (n5o0) Enum.valueOf(n5o0.class, str);
    }

    public static n5o0[] values() {
        return (n5o0[]) U0.clone();
    }
}
