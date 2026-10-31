package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class h06 {
    public static final h06 a;
    public static final h06 b;
    public static final /* synthetic */ h06[] c;

    static {
        h06 h06Var = new h06("FOREGROUND", 0);
        a = h06Var;
        h06 h06Var2 = new h06("BACKGROUND", 1);
        b = h06Var2;
        c = new h06[]{h06Var, h06Var2};
    }

    public static h06 valueOf(String str) {
        return (h06) Enum.valueOf(h06.class, str);
    }

    public static h06[] values() {
        return (h06[]) c.clone();
    }
}
