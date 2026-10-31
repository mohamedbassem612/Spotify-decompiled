package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class cy8 implements iu30 {
    public static Integer a(sbh sbhVar) {
        int i;
        int iOrdinal = sbhVar.ordinal();
        if (iOrdinal == 0) {
            i = 20502;
        } else if (iOrdinal == 1) {
            i = 20501;
        } else {
            if (iOrdinal != 2) {
                eg.o();
                return null;
            }
            i = 20500;
        }
        return Integer.valueOf(i);
    }
}
