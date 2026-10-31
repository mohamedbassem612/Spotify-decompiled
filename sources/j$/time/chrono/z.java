package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class z implements j {
    public static final z BEFORE_ROC;
    public static final z ROC;
    public static final /* synthetic */ z[] a;

    static {
        z zVar = new z("BEFORE_ROC", 0);
        BEFORE_ROC = zVar;
        z zVar2 = new z("ROC", 1);
        ROC = zVar2;
        a = new z[]{zVar, zVar2};
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) a.clone();
    }

    @Override // j$.time.chrono.j
    public final int getValue() {
        return ordinal();
    }
}
