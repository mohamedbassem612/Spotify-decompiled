package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s0d1 {
    public static final s0d1 a;
    public static final /* synthetic */ s0d1[] b;

    static {
        s0d1 s0d1Var = new s0d1("RowClicked", 0);
        a = s0d1Var;
        b = new s0d1[]{s0d1Var};
    }

    public static s0d1 valueOf(String str) {
        return (s0d1) Enum.valueOf(s0d1.class, str);
    }

    public static s0d1[] values() {
        return (s0d1[]) b.clone();
    }
}
