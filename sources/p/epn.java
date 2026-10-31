package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class epn {
    public static final epn a;
    public static final /* synthetic */ epn[] b;

    static {
        epn epnVar = new epn("TRY_AGAIN", 0);
        a = epnVar;
        b = new epn[]{epnVar};
    }

    public static epn valueOf(String str) {
        return (epn) Enum.valueOf(epn.class, str);
    }

    public static epn[] values() {
        return (epn[]) b.clone();
    }
}
