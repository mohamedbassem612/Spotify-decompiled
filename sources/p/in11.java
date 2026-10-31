package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class in11 {
    public static final in11 a;
    public static final in11 b;
    public static final in11 c;
    public static final /* synthetic */ in11[] d;

    static {
        in11 in11Var = new in11("OVER19ONLY", 0);
        a = in11Var;
        in11 in11Var2 = new in11("EXPLICIT", 1);
        b = in11Var2;
        in11 in11Var3 = new in11("NONE", 2);
        c = in11Var3;
        d = new in11[]{in11Var, in11Var2, in11Var3};
    }

    public static in11 valueOf(String str) {
        return (in11) Enum.valueOf(in11.class, str);
    }

    public static in11[] values() {
        return (in11[]) d.clone();
    }
}
