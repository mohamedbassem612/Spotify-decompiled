package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zh80 {
    public static final zh80 a;
    public static final zh80 b;
    public static final /* synthetic */ zh80[] c;

    static {
        zh80 zh80Var = new zh80("INPUT", 0);
        a = zh80Var;
        zh80 zh80Var2 = new zh80("TTS_SPEAKING", 1);
        b = zh80Var2;
        c = new zh80[]{zh80Var, zh80Var2};
    }

    public static zh80 valueOf(String str) {
        return (zh80) Enum.valueOf(zh80.class, str);
    }

    public static zh80[] values() {
        return (zh80[]) c.clone();
    }
}
