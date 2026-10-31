package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class d1q0 {
    public static final d1q0 a;
    public static final d1q0 b;
    public static final d1q0 c;
    public static final d1q0 d;
    public static final d1q0 e;
    public static final d1q0 f;
    public static final d1q0 g;
    public static final d1q0 h;
    public static final d1q0 i;
    public static final /* synthetic */ d1q0[] t;

    static {
        d1q0 d1q0Var = new d1q0("TRACK", 0);
        a = d1q0Var;
        d1q0 d1q0Var2 = new d1q0("ALBUM", 1);
        b = d1q0Var2;
        d1q0 d1q0Var3 = new d1q0("PLAYLIST", 2);
        c = d1q0Var3;
        d1q0 d1q0Var4 = new d1q0("ARTIST", 3);
        d = d1q0Var4;
        d1q0 d1q0Var5 = new d1q0("EPISODE", 4);
        e = d1q0Var5;
        d1q0 d1q0Var6 = new d1q0("CHAPTER", 5);
        f = d1q0Var6;
        d1q0 d1q0Var7 = new d1q0("CLIP", 6);
        g = d1q0Var7;
        d1q0 d1q0Var8 = new d1q0("SHOW", 7);
        h = d1q0Var8;
        d1q0 d1q0Var9 = new d1q0("UNKNOWN", 8);
        i = d1q0Var9;
        t = new d1q0[]{d1q0Var, d1q0Var2, d1q0Var3, d1q0Var4, d1q0Var5, d1q0Var6, d1q0Var7, d1q0Var8, d1q0Var9};
    }

    public static d1q0 valueOf(String str) {
        return (d1q0) Enum.valueOf(d1q0.class, str);
    }

    public static d1q0[] values() {
        return (d1q0[]) t.clone();
    }
}
