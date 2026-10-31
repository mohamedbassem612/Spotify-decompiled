package j$.time.zone;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class d {
    public static final d STANDARD;
    public static final d UTC;
    public static final d WALL;
    public static final /* synthetic */ d[] a;

    static {
        d dVar = new d("UTC", 0);
        UTC = dVar;
        d dVar2 = new d("WALL", 1);
        WALL = dVar2;
        d dVar3 = new d("STANDARD", 2);
        STANDARD = dVar3;
        a = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) a.clone();
    }
}
