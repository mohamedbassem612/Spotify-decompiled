package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nre0 {
    public static final nre0 a;
    public static final nre0 b;
    public static final nre0 c;
    public static final nre0 d;
    public static final /* synthetic */ nre0[] e;

    static {
        nre0 nre0Var = new nre0("LOCKED", 0);
        a = nre0Var;
        nre0 nre0Var2 = new nre0("LOCKED_FOR_CHILD", 1);
        b = nre0Var2;
        nre0 nre0Var3 = new nre0("UNLOCKED", 2);
        c = nre0Var3;
        nre0 nre0Var4 = new nre0("UNKNOWN", 3);
        d = nre0Var4;
        e = new nre0[]{nre0Var, nre0Var2, nre0Var3, nre0Var4};
    }

    public static nre0 valueOf(String str) {
        return (nre0) Enum.valueOf(nre0.class, str);
    }

    public static nre0[] values() {
        return (nre0[]) e.clone();
    }
}
