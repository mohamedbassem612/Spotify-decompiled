package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lmc {
    public static final lmc a;
    public static final lmc b;
    public static final /* synthetic */ lmc[] c;

    static {
        lmc lmcVar = new lmc("START_STOP", 0);
        a = lmcVar;
        lmc lmcVar2 = new lmc("CREATE_DESTROY", 1);
        b = lmcVar2;
        c = new lmc[]{lmcVar, lmcVar2};
    }

    public static lmc valueOf(String str) {
        return (lmc) Enum.valueOf(lmc.class, str);
    }

    public static lmc[] values() {
        return (lmc[]) c.clone();
    }
}
