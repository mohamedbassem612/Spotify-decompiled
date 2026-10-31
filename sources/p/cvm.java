package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class cvm {
    public static final cvm a;
    public static final cvm b;
    public static final cvm c;
    public static final /* synthetic */ cvm[] d;
    public static final /* synthetic */ t0z e;

    static {
        cvm cvmVar = new cvm("USER", 0);
        a = cvmVar;
        cvm cvmVar2 = new cvm("EDITORIAL", 1);
        b = cvmVar2;
        cvm cvmVar3 = new cvm("UNKNOWN", 2);
        c = cvmVar3;
        cvm[] cvmVarArr = {cvmVar, cvmVar2, cvmVar3};
        d = cvmVarArr;
        e = new t0z(cvmVarArr);
    }

    public static cvm valueOf(String str) {
        return (cvm) Enum.valueOf(cvm.class, str);
    }

    public static cvm[] values() {
        return (cvm[]) d.clone();
    }
}
