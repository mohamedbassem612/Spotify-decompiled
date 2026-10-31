package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class htg1 {
    public static final htg1 a;
    public static final htg1 b;
    public static final htg1 c;
    public static final htg1 d;
    public static final htg1 e;
    public static final htg1 f;
    public static final /* synthetic */ htg1[] g;

    static {
        htg1 htg1Var = new htg1("DOWNLOADS_SNACKBAR", 0);
        a = htg1Var;
        htg1 htg1Var2 = new htg1("OFFLINE_BANNER", 1);
        b = htg1Var2;
        htg1 htg1Var3 = new htg1("AUDIO_QUALITY_BANNER", 2);
        c = htg1Var3;
        htg1 htg1Var4 = new htg1("JAM_BANNER", 3);
        d = htg1Var4;
        htg1 htg1Var5 = new htg1("QUEUE_BANNER", 4);
        e = htg1Var5;
        htg1 htg1Var6 = new htg1("SHUFFLE_SNACKBAR", 5);
        f = htg1Var6;
        g = new htg1[]{htg1Var, htg1Var2, htg1Var3, htg1Var4, htg1Var5, htg1Var6};
    }

    public static htg1 valueOf(String str) {
        return (htg1) Enum.valueOf(htg1.class, str);
    }

    public static htg1[] values() {
        return (htg1[]) g.clone();
    }
}
