package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yrt0 {
    public static final yrt0 a;
    public static final yrt0 b;
    public static final yrt0 c;
    public static final /* synthetic */ yrt0[] d;

    static {
        yrt0 yrt0Var = new yrt0("PLAYING", 0);
        a = yrt0Var;
        yrt0 yrt0Var2 = new yrt0("INACTIVE", 1);
        b = yrt0Var2;
        yrt0 yrt0Var3 = new yrt0("PAUSED", 2);
        c = yrt0Var3;
        d = new yrt0[]{yrt0Var, yrt0Var2, yrt0Var3};
    }

    public static yrt0 valueOf(String str) {
        return (yrt0) Enum.valueOf(yrt0.class, str);
    }

    public static yrt0[] values() {
        return (yrt0[]) d.clone();
    }
}
