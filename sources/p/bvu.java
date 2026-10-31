package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bvu {
    public static final bvu a;
    public static final bvu b;
    public static final /* synthetic */ bvu[] c;

    static {
        bvu bvuVar = new bvu("OnDownloadClicked", 0);
        a = bvuVar;
        bvu bvuVar2 = new bvu("OnRemoveDownloadClicked", 1);
        b = bvuVar2;
        c = new bvu[]{bvuVar, bvuVar2};
    }

    public static bvu valueOf(String str) {
        return (bvu) Enum.valueOf(bvu.class, str);
    }

    public static bvu[] values() {
        return (bvu[]) c.clone();
    }
}
