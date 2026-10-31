package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class edr {
    public static final edr a;
    public static final edr b;
    public static final edr c;
    public static final /* synthetic */ edr[] d;

    static {
        edr edrVar = new edr("Routable", 0);
        a = edrVar;
        edr edrVar2 = new edr("NotRoutable", 1);
        b = edrVar2;
        edr edrVar3 = new edr("Unknown", 2);
        c = edrVar3;
        d = new edr[]{edrVar, edrVar2, edrVar3};
    }

    public static edr valueOf(String str) {
        return (edr) Enum.valueOf(edr.class, str);
    }

    public static edr[] values() {
        return (edr[]) d.clone();
    }
}
