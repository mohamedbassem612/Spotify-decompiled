package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class swd1 {
    public static final /* synthetic */ swd1[] a;
    public static final /* synthetic */ t0z b;

    /* JADX INFO: Fake field, exist only in values array */
    swd1 EF5;

    static {
        swd1[] swd1VarArr = {new swd1("FREE", 0), new swd1("PREMIUM", 1)};
        a = swd1VarArr;
        b = new t0z(swd1VarArr);
    }

    public static swd1 valueOf(String str) {
        return (swd1) Enum.valueOf(swd1.class, str);
    }

    public static swd1[] values() {
        return (swd1[]) a.clone();
    }
}
