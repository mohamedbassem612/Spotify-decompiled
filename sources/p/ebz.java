package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ebz {
    public static final ebz a;
    public static final ebz b;
    public static final /* synthetic */ ebz[] c;

    static {
        ebz ebzVar = new ebz("RowClicked", 0);
        a = ebzVar;
        ebz ebzVar2 = new ebz("AddToLibraryClicked", 1);
        b = ebzVar2;
        c = new ebz[]{ebzVar, ebzVar2};
    }

    public static ebz valueOf(String str) {
        return (ebz) Enum.valueOf(ebz.class, str);
    }

    public static ebz[] values() {
        return (ebz[]) c.clone();
    }
}
