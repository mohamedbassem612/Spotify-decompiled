package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lp {
    public static final lp a;
    public static final /* synthetic */ lp[] b;

    static {
        lp lpVar = new lp("RowClicked", 0);
        a = lpVar;
        b = new lp[]{lpVar};
    }

    public static lp valueOf(String str) {
        return (lp) Enum.valueOf(lp.class, str);
    }

    public static lp[] values() {
        return (lp[]) b.clone();
    }
}
