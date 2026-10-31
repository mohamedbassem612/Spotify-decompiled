package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ix {
    public static final ix a;
    public static final /* synthetic */ ix[] b;

    static {
        ix ixVar = new ix("RowClicked", 0);
        a = ixVar;
        b = new ix[]{ixVar};
    }

    public static ix valueOf(String str) {
        return (ix) Enum.valueOf(ix.class, str);
    }

    public static ix[] values() {
        return (ix[]) b.clone();
    }
}
