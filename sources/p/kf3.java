package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kf3 {
    public static final kf3 a;
    public static final /* synthetic */ kf3[] b;

    static {
        kf3 kf3Var = new kf3("RowClicked", 0);
        a = kf3Var;
        b = new kf3[]{kf3Var};
    }

    public static kf3 valueOf(String str) {
        return (kf3) Enum.valueOf(kf3.class, str);
    }

    public static kf3[] values() {
        return (kf3[]) b.clone();
    }
}
