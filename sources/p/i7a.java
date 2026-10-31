package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i7a implements k260 {
    public static final i7a a;
    public static final /* synthetic */ i7a[] b;

    static {
        i7a i7aVar = new i7a("ArtistHeadline", 0);
        a = i7aVar;
        b = new i7a[]{i7aVar};
    }

    public static i7a valueOf(String str) {
        return (i7a) Enum.valueOf(i7a.class, str);
    }

    public static i7a[] values() {
        return (i7a[]) b.clone();
    }
}
