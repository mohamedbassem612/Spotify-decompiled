package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rfo {
    public static final rfo a;
    public static final /* synthetic */ rfo[] b;

    static {
        rfo rfoVar = new rfo("ActionClicked", 0);
        a = rfoVar;
        b = new rfo[]{rfoVar};
    }

    public static rfo valueOf(String str) {
        return (rfo) Enum.valueOf(rfo.class, str);
    }

    public static rfo[] values() {
        return (rfo[]) b.clone();
    }
}
