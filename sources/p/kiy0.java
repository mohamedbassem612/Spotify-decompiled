package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kiy0 {
    public static final kiy0 a;
    public static final /* synthetic */ kiy0[] b;

    static {
        kiy0 kiy0Var = new kiy0("DEFAULT", 0);
        a = kiy0Var;
        b = new kiy0[]{kiy0Var, new kiy0("SIGNED", 1), new kiy0("FIXED", 2)};
    }

    public static kiy0 valueOf(String str) {
        return (kiy0) Enum.valueOf(kiy0.class, str);
    }

    public static kiy0[] values() {
        return (kiy0[]) b.clone();
    }
}
