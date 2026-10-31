package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class c14 {
    public static final c14 a;
    public static final c14 b;
    public static final c14 c;
    public static final /* synthetic */ c14[] d;

    static {
        c14 c14Var = new c14("START", 0);
        a = c14Var;
        c14 c14Var2 = new c14("JUNCTION", 1);
        b = c14Var2;
        c14 c14Var3 = new c14("END", 2);
        c = c14Var3;
        d = new c14[]{c14Var, c14Var2, c14Var3};
    }

    public static c14 valueOf(String str) {
        return (c14) Enum.valueOf(c14.class, str);
    }

    public static c14[] values() {
        return (c14[]) d.clone();
    }
}
