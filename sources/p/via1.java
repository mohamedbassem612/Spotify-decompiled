package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class via1 {
    public static final via1 a;
    public static final /* synthetic */ via1[] b;

    static {
        via1 via1Var = new via1("RowClicked", 0);
        a = via1Var;
        b = new via1[]{via1Var};
    }

    public static via1 valueOf(String str) {
        return (via1) Enum.valueOf(via1.class, str);
    }

    public static via1[] values() {
        return (via1[]) b.clone();
    }
}
