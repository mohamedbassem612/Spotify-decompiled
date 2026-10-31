package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s0a1 {
    public static final s0a1 a;
    public static final s0a1 b;
    public static final /* synthetic */ s0a1[] c;

    static {
        s0a1 s0a1Var = new s0a1("OnBack", 0);
        a = s0a1Var;
        s0a1 s0a1Var2 = new s0a1("OnDismiss", 1);
        b = s0a1Var2;
        c = new s0a1[]{s0a1Var, s0a1Var2};
    }

    public static s0a1 valueOf(String str) {
        return (s0a1) Enum.valueOf(s0a1.class, str);
    }

    public static s0a1[] values() {
        return (s0a1[]) c.clone();
    }
}
