package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class eha1 {
    public static final eha1 a;
    public static final /* synthetic */ eha1[] b;

    static {
        eha1 eha1Var = new eha1("ShowSortDialogButtonClicked", 0);
        a = eha1Var;
        b = new eha1[]{eha1Var};
    }

    public static eha1 valueOf(String str) {
        return (eha1) Enum.valueOf(eha1.class, str);
    }

    public static eha1[] values() {
        return (eha1[]) b.clone();
    }
}
