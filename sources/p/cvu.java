package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cvu {
    public static final cvu a;
    public static final cvu b;
    public static final /* synthetic */ cvu[] c;

    static {
        cvu cvuVar = new cvu("OnDownloadClicked", 0);
        a = cvuVar;
        cvu cvuVar2 = new cvu("OnRemoveDownloadClicked", 1);
        b = cvuVar2;
        c = new cvu[]{cvuVar, cvuVar2};
    }

    public static cvu valueOf(String str) {
        return (cvu) Enum.valueOf(cvu.class, str);
    }

    public static cvu[] values() {
        return (cvu[]) c.clone();
    }
}
