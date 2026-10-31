package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lqh {
    public static final lqh a;
    public static final /* synthetic */ lqh[] b;

    static {
        lqh lqhVar = new lqh("PRODUCTION", 0);
        a = lqhVar;
        b = new lqh[]{lqhVar, new lqh("TESTING", 1)};
    }

    public static lqh valueOf(String str) {
        return (lqh) Enum.valueOf(lqh.class, str);
    }

    public static lqh[] values() {
        return (lqh[]) b.clone();
    }
}
