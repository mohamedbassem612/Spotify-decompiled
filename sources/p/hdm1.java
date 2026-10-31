package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hdm1 {
    public static final hdm1 a;
    public static final hdm1 b;
    public static final hdm1 c;
    public static final /* synthetic */ hdm1[] d;

    static {
        hdm1 hdm1Var = new hdm1("THUMBNAIL", 0);
        a = hdm1Var;
        hdm1 hdm1Var2 = new hdm1("VIDEO", 1);
        b = hdm1Var2;
        hdm1 hdm1Var3 = new hdm1("ERROR", 2);
        c = hdm1Var3;
        d = new hdm1[]{hdm1Var, hdm1Var2, hdm1Var3};
    }

    public static hdm1 valueOf(String str) {
        return (hdm1) Enum.valueOf(hdm1.class, str);
    }

    public static hdm1[] values() {
        return (hdm1[]) d.clone();
    }
}
