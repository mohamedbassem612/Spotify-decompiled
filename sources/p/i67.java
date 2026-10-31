package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class i67 {
    public static final i67 a;
    public static final i67 b;
    public static final i67 c;
    public static final /* synthetic */ i67[] d;

    static {
        i67 i67Var = new i67("NOT_DOWNLOADED", 0);
        a = i67Var;
        i67 i67Var2 = new i67("DOWNLOADING", 1);
        b = i67Var2;
        i67 i67Var3 = new i67("DOWNLOADED", 2);
        c = i67Var3;
        d = new i67[]{i67Var, i67Var2, i67Var3};
    }

    public static i67 valueOf(String str) {
        return (i67) Enum.valueOf(i67.class, str);
    }

    public static i67[] values() {
        return (i67[]) d.clone();
    }
}
