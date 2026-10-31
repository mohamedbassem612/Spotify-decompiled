package p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class cgd0 {
    public static final List a = p7h.M(new vp70[]{vp70.c, vp70.b, vp70.d, vp70.e});

    public static final String a(xkk1 xkk1Var) {
        String str;
        Iterator it = a.iterator();
        do {
            str = null;
            if (!it.hasNext()) {
                break;
            }
            up70 up70VarA = xkk1Var.a.a((vp70) it.next());
            if (up70VarA != null) {
                str = up70VarA.a.a;
            }
        } while (str == null);
        return str;
    }
}
