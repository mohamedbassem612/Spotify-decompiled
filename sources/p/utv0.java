package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class utv0 {
    public static final utv0 a;
    public static final utv0 b;
    public static final /* synthetic */ utv0[] c;

    static {
        utv0 utv0Var = new utv0("CTAClicked", 0);
        a = utv0Var;
        utv0 utv0Var2 = new utv0("SecondaryCTAClicked", 1);
        b = utv0Var2;
        c = new utv0[]{utv0Var, utv0Var2};
    }

    public static utv0 valueOf(String str) {
        return (utv0) Enum.valueOf(utv0.class, str);
    }

    public static utv0[] values() {
        return (utv0[]) c.clone();
    }
}
