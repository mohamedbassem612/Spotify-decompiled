package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class leu {
    public static final leu a;
    public static final leu b;
    public static final /* synthetic */ leu[] c;

    static {
        leu leuVar = new leu("DISMISS", 0);
        a = leuVar;
        leu leuVar2 = new leu("UNDO", 1);
        b = leuVar2;
        c = new leu[]{leuVar, leuVar2};
    }

    public static leu valueOf(String str) {
        return (leu) Enum.valueOf(leu.class, str);
    }

    public static leu[] values() {
        return (leu[]) c.clone();
    }
}
