package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class i61 {
    public static final i61 a;
    public static final i61 b;
    public static final i61 c;
    public static final i61 d;
    public static final i61 e;
    public static final i61 f;
    public static final i61 g;
    public static final i61 h;
    public static final /* synthetic */ i61[] i;

    static {
        i61 i61Var = new i61("HeaderClickArea", 0);
        a = i61Var;
        i61 i61Var2 = new i61("Title", 1);
        b = i61Var2;
        i61 i61Var3 = new i61("Subtitle", 2);
        c = i61Var3;
        i61 i61Var4 = new i61("SubtitleWithSeeMore", 3);
        d = i61Var4;
        i61 i61Var5 = new i61("SubtitleTruncated", 4);
        e = i61Var5;
        i61 i61Var6 = new i61("Body", 5);
        f = i61Var6;
        i61 i61Var7 = new i61("Footer", 6);
        g = i61Var7;
        i61 i61Var8 = new i61("Chevron", 7);
        h = i61Var8;
        i = new i61[]{i61Var, i61Var2, i61Var3, i61Var4, i61Var5, i61Var6, i61Var7, i61Var8};
    }

    public static i61 valueOf(String str) {
        return (i61) Enum.valueOf(i61.class, str);
    }

    public static i61[] values() {
        return (i61[]) i.clone();
    }
}
