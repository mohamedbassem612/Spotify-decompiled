package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class epg {
    public static final epg a;
    public static final /* synthetic */ epg[] b;

    static {
        epg epgVar = new epg("CardClicked", 0);
        a = epgVar;
        b = new epg[]{epgVar};
    }

    public static epg valueOf(String str) {
        return (epg) Enum.valueOf(epg.class, str);
    }

    public static epg[] values() {
        return (epg[]) b.clone();
    }
}
