package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rfc {
    public static final rfc a;
    public static final /* synthetic */ rfc[] b;

    static {
        rfc rfcVar = new rfc("ButtonClicked", 0);
        a = rfcVar;
        b = new rfc[]{rfcVar};
    }

    public static rfc valueOf(String str) {
        return (rfc) Enum.valueOf(rfc.class, str);
    }

    public static rfc[] values() {
        return (rfc[]) b.clone();
    }
}
