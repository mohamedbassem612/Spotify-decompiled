package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class aq10 {
    public static final aq10 a;
    public static final aq10 b;
    public static final aq10 c;
    public static final /* synthetic */ aq10[] d;

    static {
        aq10 aq10Var = new aq10("NEW_RELEASES", 0);
        a = aq10Var;
        aq10 aq10Var2 = new aq10("WRAPPED", 1);
        b = aq10Var2;
        aq10 aq10Var3 = new aq10("AUDIOBOOKS", 2);
        c = aq10Var3;
        d = new aq10[]{aq10Var, aq10Var2, aq10Var3};
    }

    public static aq10 valueOf(String str) {
        return (aq10) Enum.valueOf(aq10.class, str);
    }

    public static aq10[] values() {
        return (aq10[]) d.clone();
    }
}
