package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sqg {
    public static final sqg a;
    public static final sqg b;
    public static final sqg c;
    public static final /* synthetic */ sqg[] d;

    static {
        sqg sqgVar = new sqg("Loading", 0);
        a = sqgVar;
        sqg sqgVar2 = new sqg("Loaded", 1);
        b = sqgVar2;
        sqg sqgVar3 = new sqg("Error", 2);
        c = sqgVar3;
        d = new sqg[]{sqgVar, sqgVar2, sqgVar3};
    }

    public static sqg valueOf(String str) {
        return (sqg) Enum.valueOf(sqg.class, str);
    }

    public static sqg[] values() {
        return (sqg[]) d.clone();
    }
}
