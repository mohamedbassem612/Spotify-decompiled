package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jdf0 implements idf0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ohd b;

    public /* synthetic */ jdf0(ohd ohdVar, byte b) {
        this.a = b;
        this.b = ohdVar;
    }

    public final void onResult(Object obj) {
        byte b = this.a;
        ohd ohdVar = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                if (ohdVar.s() instanceof ago0) {
                    th.getClass();
                    ohdVar.resumeWith(new m231(th));
                }
                break;
            case 1:
                fcf0 fcf0Var = (fcf0) obj;
                if (ohdVar.s() instanceof ago0) {
                    ohdVar.resumeWith(fcf0Var);
                }
                break;
            case 2:
                Throwable th2 = (Throwable) obj;
                if (ohdVar.s() instanceof ago0) {
                    th2.getClass();
                    ohdVar.resumeWith(new m231(th2));
                }
                break;
            case 3:
                fcf0 fcf0Var2 = (fcf0) obj;
                if (ohdVar.s() instanceof ago0) {
                    ohdVar.resumeWith(fcf0Var2);
                }
                break;
            case 4:
                if (!ohdVar.w()) {
                    ohdVar.resumeWith(obj);
                }
                break;
            case 5:
                Throwable th3 = (Throwable) obj;
                if (!ohdVar.w()) {
                    th3.getClass();
                    ohdVar.resumeWith(new m231(th3));
                }
                break;
            case 6:
                Throwable th4 = (Throwable) obj;
                if (ohdVar.s() instanceof ago0) {
                    ohdVar.resumeWith(new m231(new RuntimeException("Error loading Lottie composition", th4)));
                }
                break;
            default:
                fcf0 fcf0Var3 = (fcf0) obj;
                if (ohdVar.s() instanceof ago0) {
                    ohdVar.resumeWith(fcf0Var3);
                }
                break;
        }
    }
}
