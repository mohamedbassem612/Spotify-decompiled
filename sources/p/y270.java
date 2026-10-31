package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class y270 {
    public static final /* synthetic */ int a = 0;

    static {
        new rhc(ryn1.m("\"\\")).c = "\"\\";
        new rhc(ryn1.m("\t ,=")).c = "\t ,=";
    }

    public static final boolean a(ry21 ry21Var) {
        if (u890.j(ry21Var.a.b, "HEAD")) {
            return false;
        }
        int i = ry21Var.d;
        if (((i < 100 || i >= 200) && i != 204 && i != 304) || z4n1.e(ry21Var) != -1) {
            return true;
        }
        String strC = ry21Var.f.c("Transfer-Encoding");
        if (strC == null) {
            strC = null;
        }
        return "chunked".equalsIgnoreCase(strC);
    }
}
