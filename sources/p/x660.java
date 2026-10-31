package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class x660 {
    public static final x660 a;
    public static final x660 b;
    public static final x660 c;
    public static final x660 d;
    public static final /* synthetic */ x660[] e;

    static {
        x660 x660Var = new x660("SINGLE", 0);
        a = x660Var;
        x660 x660Var2 = new x660("IDENTITY", 1);
        b = x660Var2;
        x660 x660Var3 = new x660("MULTI_3", 2);
        c = x660Var3;
        x660 x660Var4 = new x660("MULTI_4", 3);
        d = x660Var4;
        e = new x660[]{x660Var, x660Var2, x660Var3, x660Var4};
    }

    public static x660 valueOf(String str) {
        return (x660) Enum.valueOf(x660.class, str);
    }

    public static x660[] values() {
        return (x660[]) e.clone();
    }
}
