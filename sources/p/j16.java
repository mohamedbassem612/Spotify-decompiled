package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class j16 {
    public static final j16 a;
    public static final j16 b;
    public static final j16 c;
    public static final /* synthetic */ j16[] d;

    static {
        j16 j16Var = new j16("JOIN", 0);
        a = j16Var;
        j16 j16Var2 = new j16("UPGRADE", 1);
        b = j16Var2;
        j16 j16Var3 = new j16("UNKNOWN", 2);
        c = j16Var3;
        d = new j16[]{j16Var, j16Var2, j16Var3};
    }

    public static j16 valueOf(String str) {
        return (j16) Enum.valueOf(j16.class, str);
    }

    public static j16[] values() {
        return (j16[]) d.clone();
    }
}
