package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yv11 {
    public static final yv11 a;
    public static final yv11 b;
    public static final yv11 c;
    public static final /* synthetic */ yv11[] d;

    static {
        yv11 yv11Var = new yv11("UNKNOWN", 0);
        a = yv11Var;
        yv11 yv11Var2 = new yv11("LATEST_RELEASE", 1);
        b = yv11Var2;
        yv11 yv11Var3 = new yv11("PRE_RELEASE", 2);
        c = yv11Var3;
        d = new yv11[]{yv11Var, yv11Var2, yv11Var3};
    }

    public static yv11 valueOf(String str) {
        return (yv11) Enum.valueOf(yv11.class, str);
    }

    public static yv11[] values() {
        return (yv11[]) d.clone();
    }
}
