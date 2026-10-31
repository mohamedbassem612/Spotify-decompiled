package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dcv {
    public static final dcv a;
    public static final dcv b;
    public static final /* synthetic */ dcv[] c;

    static {
        dcv dcvVar = new dcv("BackPressed", 0);
        a = dcvVar;
        dcv dcvVar2 = new dcv("SearchStarted", 1);
        b = dcvVar2;
        c = new dcv[]{dcvVar, dcvVar2};
    }

    public static dcv valueOf(String str) {
        return (dcv) Enum.valueOf(dcv.class, str);
    }

    public static dcv[] values() {
        return (dcv[]) c.clone();
    }
}
