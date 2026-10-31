package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ixz0 {
    public static final ixz0 a;
    public static final /* synthetic */ ixz0[] b;

    static {
        ixz0 ixz0Var = new ixz0("OnClicked", 0);
        a = ixz0Var;
        b = new ixz0[]{ixz0Var};
    }

    public static ixz0 valueOf(String str) {
        return (ixz0) Enum.valueOf(ixz0.class, str);
    }

    public static ixz0[] values() {
        return (ixz0[]) b.clone();
    }
}
