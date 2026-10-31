package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s2p0 {
    public static final s2p0 a;
    public static final s2p0 b;
    public static final /* synthetic */ s2p0[] c;

    static {
        s2p0 s2p0Var = new s2p0("STANDARD", 0);
        a = s2p0Var;
        s2p0 s2p0Var2 = new s2p0("FULLSCREEN_VIDEO", 1);
        b = s2p0Var2;
        c = new s2p0[]{s2p0Var, s2p0Var2};
    }

    public static s2p0 valueOf(String str) {
        return (s2p0) Enum.valueOf(s2p0.class, str);
    }

    public static s2p0[] values() {
        return (s2p0[]) c.clone();
    }
}
