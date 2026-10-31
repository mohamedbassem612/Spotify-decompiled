package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class um8 implements k260 {
    public static final um8 a;
    public static final /* synthetic */ um8[] b;

    static {
        um8 um8Var = new um8("Share", 0);
        a = um8Var;
        b = new um8[]{um8Var};
    }

    public static um8 valueOf(String str) {
        return (um8) Enum.valueOf(um8.class, str);
    }

    public static um8[] values() {
        return (um8[]) b.clone();
    }
}
