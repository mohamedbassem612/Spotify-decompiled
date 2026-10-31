package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class m5f {
    public static final m5f a;
    public static final m5f b;
    public static final m5f c;
    public static final m5f d;
    public static final /* synthetic */ m5f[] e;

    static {
        m5f m5fVar = new m5f("SongsAndMore", 0);
        a = m5fVar;
        m5f m5fVar2 = new m5f("PhotosAndVideos", 1);
        b = m5fVar2;
        m5f m5fVar3 = new m5f("LyricsStickers", 2);
        c = m5fVar3;
        m5f m5fVar4 = new m5f("Gifs", 3);
        d = m5fVar4;
        e = new m5f[]{m5fVar, m5fVar2, m5fVar3, m5fVar4};
    }

    public static m5f valueOf(String str) {
        return (m5f) Enum.valueOf(m5f.class, str);
    }

    public static m5f[] values() {
        return (m5f[]) e.clone();
    }
}
