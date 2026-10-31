package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d670 {
    private static final e670 DUMMY = new tw20((byte) 13);

    private d670() {
    }

    public static e670 dummy() {
        return DUMMY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$single$2(String str, int i, y570 y570Var) {
        if (y570Var.h().a().equals(str)) {
            return i;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$0(y570 y570Var) {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$withFallback$1(e670 e670Var, e670 e670Var2, y570 y570Var) {
        int iH = e670Var.h(y570Var);
        return iH == 0 ? e670Var2.h(y570Var) : iH;
    }

    public static e670 single(String str, int i) {
        str.getClass();
        return new pwr(str, i, (byte) 1);
    }

    public static e670 withFallback(e670 e670Var, e670 e670Var2) {
        e670Var.getClass();
        e670Var2.getClass();
        e670 e670Var3 = DUMMY;
        if (e670Var == e670Var3) {
            return e670Var2;
        }
        return e670Var2 == e670Var3 ? e670Var : new uk4(e670Var, e670Var2, (byte) 28);
    }
}
