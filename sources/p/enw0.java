package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class enw0 {
    public static final enw0 a;
    public static final enw0 b;
    public static final /* synthetic */ enw0[] c;

    static {
        enw0 enw0Var = new enw0("AskToJoinClicked", 0);
        a = enw0Var;
        enw0 enw0Var2 = new enw0("JoinClicked", 1);
        b = enw0Var2;
        c = new enw0[]{enw0Var, enw0Var2};
    }

    public static enw0 valueOf(String str) {
        return (enw0) Enum.valueOf(enw0.class, str);
    }

    public static enw0[] values() {
        return (enw0[]) c.clone();
    }
}
