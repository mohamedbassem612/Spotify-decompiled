package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nfx0 {
    public static final nfx0 a;
    public static final nfx0 b;
    public static final /* synthetic */ nfx0[] c;

    static {
        nfx0 nfx0Var = new nfx0("THUMB", 0);
        a = nfx0Var;
        nfx0 nfx0Var2 = new nfx0("TRACK", 1);
        b = nfx0Var2;
        c = new nfx0[]{nfx0Var, nfx0Var2};
    }

    public static nfx0 valueOf(String str) {
        return (nfx0) Enum.valueOf(nfx0.class, str);
    }

    public static nfx0[] values() {
        return (nfx0[]) c.clone();
    }
}
