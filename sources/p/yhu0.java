package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yhu0 {
    public static final yhu0 a;
    public static final yhu0 b;
    public static final yhu0 c;
    public static final yhu0 d;
    public static final yhu0 e;
    public static final yhu0 f;
    public static final /* synthetic */ yhu0[] g;

    static {
        yhu0 yhu0Var = new yhu0("SONG", 0);
        a = yhu0Var;
        yhu0 yhu0Var2 = new yhu0("EPISODE", 1);
        b = yhu0Var2;
        yhu0 yhu0Var3 = new yhu0("AUDIOBOOK", 2);
        c = yhu0Var3;
        yhu0 yhu0Var4 = new yhu0("PODCAST_CHAPTER", 3);
        d = yhu0Var4;
        yhu0 yhu0Var5 = new yhu0("CLIP", 4);
        e = yhu0Var5;
        yhu0 yhu0Var6 = new yhu0("OTHER", 5);
        f = yhu0Var6;
        g = new yhu0[]{yhu0Var, yhu0Var2, yhu0Var3, yhu0Var4, yhu0Var5, yhu0Var6};
    }

    public static yhu0 valueOf(String str) {
        return (yhu0) Enum.valueOf(yhu0.class, str);
    }

    public static yhu0[] values() {
        return (yhu0[]) g.clone();
    }
}
