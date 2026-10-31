package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mx01 {
    public static final mx01 a;
    public static final /* synthetic */ mx01[] b;

    static {
        mx01 mx01Var = new mx01("OnItemClicked", 0);
        a = mx01Var;
        b = new mx01[]{mx01Var};
    }

    public static mx01 valueOf(String str) {
        return (mx01) Enum.valueOf(mx01.class, str);
    }

    public static mx01[] values() {
        return (mx01[]) b.clone();
    }
}
