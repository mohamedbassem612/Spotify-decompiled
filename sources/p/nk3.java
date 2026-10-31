package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nk3 {
    public static final nk3 a;
    public static final nk3 b;
    public static final nk3 c;
    public static final nk3 d;
    public static final nk3 e;
    public static final nk3 f;
    public static final nk3 g;
    public static final /* synthetic */ nk3[] h;

    static {
        nk3 nk3Var = new nk3("Track", 0);
        a = nk3Var;
        nk3 nk3Var2 = new nk3("Episode", 1);
        b = nk3Var2;
        nk3 nk3Var3 = new nk3("Podcast", 2);
        c = nk3Var3;
        nk3 nk3Var4 = new nk3("Audiobook", 3);
        d = nk3Var4;
        nk3 nk3Var5 = new nk3("Highlight", 4);
        e = nk3Var5;
        nk3 nk3Var6 = new nk3("Unsupported", 5);
        f = nk3Var6;
        nk3 nk3Var7 = new nk3("PodcastChapter", 6);
        g = nk3Var7;
        h = new nk3[]{nk3Var, nk3Var2, nk3Var3, nk3Var4, nk3Var5, nk3Var6, nk3Var7};
    }

    public static nk3 valueOf(String str) {
        return (nk3) Enum.valueOf(nk3.class, str);
    }

    public static nk3[] values() {
        return (nk3[]) h.clone();
    }
}
