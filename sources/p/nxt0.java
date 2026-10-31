package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nxt0 {
    public static final nxt0 a;
    public static final nxt0 b;
    public static final /* synthetic */ nxt0[] c;

    static {
        nxt0 nxt0Var = new nxt0("Shuffle", 0);
        a = nxt0Var;
        nxt0 nxt0Var2 = new nxt0("Repeat", 1);
        b = nxt0Var2;
        c = new nxt0[]{nxt0Var, nxt0Var2, new nxt0("PlaybackSpeed", 2), new nxt0("SleepTimer", 3)};
    }

    public static nxt0 valueOf(String str) {
        return (nxt0) Enum.valueOf(nxt0.class, str);
    }

    public static nxt0[] values() {
        return (nxt0[]) c.clone();
    }
}
