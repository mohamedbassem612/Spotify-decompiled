package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yy30 {
    public static final yy30 a;
    public static final yy30 b;
    public static final yy30 c;
    public static final yy30 d;
    public static final /* synthetic */ yy30[] e;

    static {
        yy30 yy30Var = new yy30("LOADING", 0);
        a = yy30Var;
        yy30 yy30Var2 = new yy30("READY", 1);
        yy30 yy30Var3 = new yy30("PLAYING", 2);
        b = yy30Var3;
        yy30 yy30Var4 = new yy30("PAUSED", 3);
        yy30 yy30Var5 = new yy30("DYING", 4);
        c = yy30Var5;
        yy30 yy30Var6 = new yy30("GAME_OVER", 5);
        d = yy30Var6;
        e = new yy30[]{yy30Var, yy30Var2, yy30Var3, yy30Var4, yy30Var5, yy30Var6};
    }

    public static yy30 valueOf(String str) {
        return (yy30) Enum.valueOf(yy30.class, str);
    }

    public static yy30[] values() {
        return (yy30[]) e.clone();
    }
}
