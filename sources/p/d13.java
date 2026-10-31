package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d13 {
    public static final d13 a;
    public static final d13 b;
    public static final /* synthetic */ d13[] c;

    static {
        d13 d13Var = new d13("Confirmed", 0);
        a = d13Var;
        d13 d13Var2 = new d13("Likely", 1);
        b = d13Var2;
        c = new d13[]{d13Var, d13Var2};
    }

    public static d13 valueOf(String str) {
        return (d13) Enum.valueOf(d13.class, str);
    }

    public static d13[] values() {
        return (d13[]) c.clone();
    }
}
