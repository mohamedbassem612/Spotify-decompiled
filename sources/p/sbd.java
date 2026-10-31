package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sbd {
    public static final sbd a;
    public static final /* synthetic */ sbd[] b;

    static {
        sbd sbdVar = new sbd("DirectMessaging", 0);
        a = sbdVar;
        b = new sbd[]{sbdVar};
    }

    public static sbd valueOf(String str) {
        return (sbd) Enum.valueOf(sbd.class, str);
    }

    public static sbd[] values() {
        return (sbd[]) b.clone();
    }
}
