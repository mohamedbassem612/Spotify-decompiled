package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class by10 {
    public static final /* synthetic */ by10[] a;
    public static final /* synthetic */ t0z b;

    /* JADX INFO: Fake field, exist only in values array */
    by10 EF5;

    static {
        by10[] by10VarArr = {new by10("PlaybackIssue", 0), new by10("OfflineIssue", 1), new by10("SpotifyConnectIssue", 2), new by10("UXIssue", 3), new by10("Other", 4)};
        a = by10VarArr;
        b = new t0z(by10VarArr);
    }

    public static by10 valueOf(String str) {
        return (by10) Enum.valueOf(by10.class, str);
    }

    public static by10[] values() {
        return (by10[]) a.clone();
    }
}
