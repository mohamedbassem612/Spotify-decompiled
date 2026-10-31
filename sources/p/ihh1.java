package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ihh1 {
    public static final ihh1 a;
    public static final ihh1 b;
    public static final ihh1 c;
    public static final /* synthetic */ ihh1[] d;

    static {
        ihh1 ihh1Var = new ihh1("HIDDEN", 0);
        a = ihh1Var;
        ihh1 ihh1Var2 = new ihh1("HEADER", 1);
        b = ihh1Var2;
        ihh1 ihh1Var3 = new ihh1("WAVEFORM", 2);
        c = ihh1Var3;
        d = new ihh1[]{ihh1Var, ihh1Var2, ihh1Var3};
    }

    public static ihh1 valueOf(String str) {
        return (ihh1) Enum.valueOf(ihh1.class, str);
    }

    public static ihh1[] values() {
        return (ihh1[]) d.clone();
    }
}
