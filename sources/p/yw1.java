package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yw1 implements r331 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;

    public /* synthetic */ yw1(ven0 ven0Var, byte b) {
        this.a = b;
        this.b = ven0Var;
    }

    public final void e(d331 d331Var) {
        String str;
        byte b = this.a;
        ven0 ven0Var = this.b;
        switch (b) {
            case 0:
                if (!(d331Var instanceof y231)) {
                    ((iu30) ven0Var.getValue()).invoke(bs1.a);
                } else {
                    iu30 iu30Var = (iu30) ven0Var.getValue();
                    eqn eqnVar = ((y231) d331Var).a;
                    iu30Var.invoke(new ps1(eqnVar.a, eqnVar.b));
                }
                break;
            case 1:
                if (d331Var instanceof y231) {
                    ven0Var.setValue(Boolean.valueOf(((y231) d331Var).a.a));
                }
                break;
            case 2:
                if (d331Var instanceof y231) {
                    ((iu30) ven0Var.getValue()).invoke(new pcv(((y231) d331Var).a.a));
                }
                break;
            case 3:
                if (d331Var instanceof y231) {
                    Object obj = ((y231) d331Var).a.a.get(new jvb1("artifact-page-location"));
                    String str2 = null;
                    xne0 xne0Var = obj instanceof xne0 ? (xne0) obj : null;
                    if (xne0Var != null && (str = xne0Var.a) != null && !ihc1.y0(str)) {
                        str2 = str;
                    }
                    if (str2 != null) {
                        ((iu30) ven0Var.getValue()).invoke(new qne0(str2));
                    }
                }
                break;
            default:
                ((iu30) ven0Var.getValue()).invoke(srs0.a);
                break;
        }
    }
}
