package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class f0 implements j {
    public static final f0 BE;
    public static final f0 BEFORE_BE;
    public static final /* synthetic */ f0[] a;

    static {
        f0 f0Var = new f0("BEFORE_BE", 0);
        BEFORE_BE = f0Var;
        f0 f0Var2 = new f0("BE", 1);
        BE = f0Var2;
        a = new f0[]{f0Var, f0Var2};
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) a.clone();
    }

    @Override // j$.time.chrono.j
    public final int getValue() {
        return ordinal();
    }
}
