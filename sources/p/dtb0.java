package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class dtb0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ftb0 b;

    public /* synthetic */ dtb0(ftb0 ftb0Var, byte b) {
        this.a = b;
        this.b = ftb0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        int i = 0;
        ftb0 ftb0Var = this.b;
        switch (b) {
            case 0:
                esb0 esb0Var = (esb0) ftb0Var.O0.invoke();
                int iA = esb0Var.a();
                while (i < iA) {
                    if (esb0Var.d(i).equals(obj)) {
                        return Integer.valueOf(i);
                    }
                    i++;
                }
                i = -1;
                return Integer.valueOf(i);
            default:
                int iIntValue = ((Integer) obj).intValue();
                esb0 esb0Var2 = (esb0) ftb0Var.O0.invoke();
                if (iIntValue < 0 || iIntValue >= esb0Var2.a()) {
                    tf80.a("Can't scroll to index " + iIntValue + ", it is out of bounds [0, " + esb0Var2.a() + ")");
                }
                fn31.T(ftb0Var.v1(), null, 0, new cy9(ftb0Var, iIntValue, (lnm) null, (byte) 9), 3);
                return Boolean.TRUE;
        }
    }
}
