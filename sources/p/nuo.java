package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nuo {
    public static final nuo a;
    public static final nuo b;
    public static final /* synthetic */ nuo[] c;

    static {
        nuo nuoVar = new nuo("Selected", 0);
        a = nuoVar;
        nuo nuoVar2 = new nuo("PreviewTapped", 1);
        b = nuoVar2;
        c = new nuo[]{nuoVar, nuoVar2};
    }

    public static nuo valueOf(String str) {
        return (nuo) Enum.valueOf(nuo.class, str);
    }

    public static nuo[] values() {
        return (nuo[]) c.clone();
    }
}
