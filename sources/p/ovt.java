package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@o661
public final class ovt {
    public static final nvt Companion;
    public static final znb0 a;
    public static final ovt b;
    public static final /* synthetic */ ovt[] c;

    static {
        ovt ovtVar = new ovt("AMBIGUOUS_DEVICE", 0);
        b = ovtVar;
        c = new ovt[]{ovtVar, new ovt("NON_AMBIGUOUS_DEVICE", 1)};
        Companion = new nvt();
        a = dm5.S(2, u6t.Y);
    }

    public static ovt valueOf(String str) {
        return (ovt) Enum.valueOf(ovt.class, str);
    }

    public static ovt[] values() {
        return (ovt[]) c.clone();
    }
}
