package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class r3g0 {
    public static final r3g0 a;
    public static final r3g0 b;
    public static final r3g0 c;
    public static final /* synthetic */ r3g0[] d;

    static {
        r3g0 r3g0Var = new r3g0("Public", 0);
        a = r3g0Var;
        r3g0 r3g0Var2 = new r3g0("Private", 1);
        b = r3g0Var2;
        r3g0 r3g0Var3 = new r3g0("Collaborators", 2);
        c = r3g0Var3;
        d = new r3g0[]{r3g0Var, r3g0Var2, r3g0Var3};
    }

    public static r3g0 valueOf(String str) {
        return (r3g0) Enum.valueOf(r3g0.class, str);
    }

    public static r3g0[] values() {
        return (r3g0[]) d.clone();
    }
}
