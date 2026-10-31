package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class itv0 {
    public static final itv0 a;
    public static final /* synthetic */ itv0[] b;

    static {
        itv0 itv0Var = new itv0("Click", 0);
        a = itv0Var;
        b = new itv0[]{itv0Var};
    }

    public static itv0 valueOf(String str) {
        return (itv0) Enum.valueOf(itv0.class, str);
    }

    public static itv0[] values() {
        return (itv0[]) b.clone();
    }
}
