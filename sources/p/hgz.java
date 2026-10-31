package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hgz {
    public static final hgz a;
    public static final /* synthetic */ hgz[] b;

    static {
        hgz hgzVar = new hgz("RetryButtonClicked", 0);
        a = hgzVar;
        b = new hgz[]{hgzVar};
    }

    public static hgz valueOf(String str) {
        return (hgz) Enum.valueOf(hgz.class, str);
    }

    public static hgz[] values() {
        return (hgz[]) b.clone();
    }
}
