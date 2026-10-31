package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hof1 {
    public static final hof1 a;
    public static final hof1 b;
    public static final /* synthetic */ hof1[] c;

    static {
        hof1 hof1Var = new hof1("TitleHit", 0);
        a = hof1Var;
        hof1 hof1Var2 = new hof1("SubtitleHit", 1);
        b = hof1Var2;
        c = new hof1[]{hof1Var, hof1Var2};
    }

    public static hof1 valueOf(String str) {
        return (hof1) Enum.valueOf(hof1.class, str);
    }

    public static hof1[] values() {
        return (hof1[]) c.clone();
    }
}
