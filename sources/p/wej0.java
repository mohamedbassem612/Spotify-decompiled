package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wej0 {
    public static final wej0 a;
    public static final wej0 b;
    public static final /* synthetic */ wej0[] c;

    static {
        wej0 wej0Var = new wej0("OnShuffleAnywayClicked", 0);
        a = wej0Var;
        wej0 wej0Var2 = new wej0("OnTurnOffShuffleClicked", 1);
        b = wej0Var2;
        c = new wej0[]{wej0Var, wej0Var2};
    }

    public static wej0 valueOf(String str) {
        return (wej0) Enum.valueOf(wej0.class, str);
    }

    public static wej0[] values() {
        return (wej0[]) c.clone();
    }
}
