package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class sbh {
    public static final sbh a;
    public static final /* synthetic */ sbh[] b;

    /* JADX INFO: Fake field, exist only in values array */
    sbh EF0;

    static {
        sbh sbhVar = new sbh("DISABLED", 0);
        sbh sbhVar2 = new sbh("FOREGROUND_AND_BACKGROUND", 1);
        a = sbhVar2;
        b = new sbh[]{sbhVar, sbhVar2, new sbh("FOREGROUND_ONLY", 2)};
    }

    public static sbh valueOf(String str) {
        return (sbh) Enum.valueOf(sbh.class, str);
    }

    public static sbh[] values() {
        return (sbh[]) b.clone();
    }
}
