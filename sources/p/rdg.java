package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rdg {
    public static final rdg a;
    public static final rdg b;
    public static final rdg c;
    public static final /* synthetic */ rdg[] d;

    static {
        rdg rdgVar = new rdg("RETRY", 0);
        a = rdgVar;
        rdg rdgVar2 = new rdg("CANCEL", 1);
        b = rdgVar2;
        rdg rdgVar3 = new rdg("DISMISSED", 2);
        c = rdgVar3;
        d = new rdg[]{rdgVar, rdgVar2, rdgVar3};
    }

    public static rdg valueOf(String str) {
        return (rdg) Enum.valueOf(rdg.class, str);
    }

    public static rdg[] values() {
        return (rdg[]) d.clone();
    }
}
