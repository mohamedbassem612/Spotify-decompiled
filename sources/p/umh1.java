package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class umh1 {
    public static final umh1 a;
    public static final /* synthetic */ umh1[] b;

    static {
        umh1 umh1Var = new umh1("Swiped", 0);
        a = umh1Var;
        b = new umh1[]{umh1Var};
    }

    public static umh1 valueOf(String str) {
        return (umh1) Enum.valueOf(umh1.class, str);
    }

    public static umh1[] values() {
        return (umh1[]) b.clone();
    }
}
