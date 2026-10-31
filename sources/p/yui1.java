package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yui1 {
    public static final yui1 a;
    public static final /* synthetic */ yui1[] b;

    static {
        yui1 yui1Var = new yui1("RowClicked", 0);
        a = yui1Var;
        b = new yui1[]{yui1Var};
    }

    public static yui1 valueOf(String str) {
        return (yui1) Enum.valueOf(yui1.class, str);
    }

    public static yui1[] values() {
        return (yui1[]) b.clone();
    }
}
