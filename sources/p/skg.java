package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class skg {
    public static final skg a;
    public static final skg b;
    public static final skg c;
    public static final skg d;
    public static final /* synthetic */ skg[] e;

    static {
        skg skgVar = new skg("PlaylistEntity", 0);
        a = skgVar;
        skg skgVar2 = new skg("LikedSongsEntity", 1);
        b = skgVar2;
        skg skgVar3 = new skg("NowPlayingView", 2);
        c = skgVar3;
        skg skgVar4 = new skg("Unknown", 3);
        d = skgVar4;
        e = new skg[]{skgVar, skgVar2, skgVar3, skgVar4};
    }

    public static skg valueOf(String str) {
        return (skg) Enum.valueOf(skg.class, str);
    }

    public static skg[] values() {
        return (skg[]) e.clone();
    }
}
