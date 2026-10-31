package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lkf1 {
    public static final lkf1 a;
    public static final lkf1 b;
    public static final lkf1 c;
    public static final lkf1 d;
    public static final lkf1 e;
    public static final lkf1 f;
    public static final lkf1 g;
    public static final lkf1 h;
    public static final /* synthetic */ lkf1[] i;

    static {
        lkf1 lkf1Var = new lkf1("CanvasImage", 0);
        a = lkf1Var;
        lkf1 lkf1Var2 = new lkf1("CanvasVideo", 1);
        b = lkf1Var2;
        lkf1 lkf1Var3 = new lkf1("EmbeddedAdV2", 2);
        c = lkf1Var3;
        lkf1 lkf1Var4 = new lkf1("HorizontalVideo", 3);
        d = lkf1Var4;
        lkf1 lkf1Var5 = new lkf1("LiveTalkAudio", 4);
        e = lkf1Var5;
        lkf1 lkf1Var6 = new lkf1("Narration", 5);
        f = lkf1Var6;
        lkf1 lkf1Var7 = new lkf1("SquareCoverArt", 6);
        g = lkf1Var7;
        lkf1 lkf1Var8 = new lkf1("Transcript", 7);
        h = lkf1Var8;
        i = new lkf1[]{lkf1Var, lkf1Var2, lkf1Var3, lkf1Var4, lkf1Var5, lkf1Var6, lkf1Var7, lkf1Var8};
    }

    public static lkf1 valueOf(String str) {
        return (lkf1) Enum.valueOf(lkf1.class, str);
    }

    public static lkf1[] values() {
        return (lkf1[]) i.clone();
    }
}
