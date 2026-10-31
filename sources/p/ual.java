package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ual {
    public static final ual a;
    public static final ual b;
    public static final /* synthetic */ ual[] c;

    static {
        ual ualVar = new ual("ONLINE", 0);
        a = ualVar;
        ual ualVar2 = new ual("OFFLINE", 1);
        b = ualVar2;
        c = new ual[]{ualVar, ualVar2};
    }

    public static ual valueOf(String str) {
        return (ual) Enum.valueOf(ual.class, str);
    }

    public static ual[] values() {
        return (ual[]) c.clone();
    }
}
