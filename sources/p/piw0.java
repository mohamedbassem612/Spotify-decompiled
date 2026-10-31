package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class piw0 {
    public static final piw0 a;
    public static final piw0 b;
    public static final /* synthetic */ piw0[] c;

    static {
        piw0 piw0Var = new piw0("Play", 0);
        a = piw0Var;
        piw0 piw0Var2 = new piw0("Stop", 1);
        b = piw0Var2;
        c = new piw0[]{piw0Var, piw0Var2};
    }

    public static piw0 valueOf(String str) {
        return (piw0) Enum.valueOf(piw0.class, str);
    }

    public static piw0[] values() {
        return (piw0[]) c.clone();
    }
}
