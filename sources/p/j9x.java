package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class j9x {
    public static final j9x a;
    public static final /* synthetic */ j9x[] b;

    static {
        j9x j9xVar = new j9x("ADD_EPISODES_CLICKED", 0);
        a = j9xVar;
        b = new j9x[]{j9xVar};
    }

    public static j9x valueOf(String str) {
        return (j9x) Enum.valueOf(j9x.class, str);
    }

    public static j9x[] values() {
        return (j9x[]) b.clone();
    }
}
