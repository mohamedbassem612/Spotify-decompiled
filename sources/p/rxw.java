package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rxw {
    public static final rxw a;
    public static final /* synthetic */ rxw[] b;

    static {
        rxw rxwVar = new rxw("EMAIL", 0);
        a = rxwVar;
        b = new rxw[]{rxwVar};
    }

    public static rxw valueOf(String str) {
        return (rxw) Enum.valueOf(rxw.class, str);
    }

    public static rxw[] values() {
        return (rxw[]) b.clone();
    }
}
