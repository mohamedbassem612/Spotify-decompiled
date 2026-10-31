package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nop0 {
    public static final nop0 a;
    public static final nop0 b;
    public static final /* synthetic */ nop0[] c;

    static {
        nop0 nop0Var = new nop0("OnCurateClicked", 0);
        a = nop0Var;
        nop0 nop0Var2 = new nop0("OnUncurateClicked", 1);
        b = nop0Var2;
        c = new nop0[]{nop0Var, nop0Var2};
    }

    public static nop0 valueOf(String str) {
        return (nop0) Enum.valueOf(nop0.class, str);
    }

    public static nop0[] values() {
        return (nop0[]) c.clone();
    }
}
