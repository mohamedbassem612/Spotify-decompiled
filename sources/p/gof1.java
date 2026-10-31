package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gof1 {
    public static final gof1 a;
    public static final gof1 b;
    public static final /* synthetic */ gof1[] c;

    static {
        gof1 gof1Var = new gof1("TitleHit", 0);
        a = gof1Var;
        gof1 gof1Var2 = new gof1("SubtitleHit", 1);
        b = gof1Var2;
        c = new gof1[]{gof1Var, gof1Var2};
    }

    public static gof1 valueOf(String str) {
        return (gof1) Enum.valueOf(gof1.class, str);
    }

    public static gof1[] values() {
        return (gof1[]) c.clone();
    }
}
