package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ssg implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tsg b;

    public /* synthetic */ ssg(tsg tsgVar, byte b) {
        this.a = b;
        this.b = tsgVar;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                if (!this.b.f) {
                    boolean z = !u890.j(this.b.e, str);
                    tsg tsgVar = this.b;
                    tsgVar.e = str;
                    tsgVar.c(z);
                }
                break;
            default:
                svj1 svj1Var = (svj1) obj;
                if (!this.b.f) {
                    ntg ntgVar = this.b.b;
                    if (!ntgVar.X) {
                        ntgVar.h = new stg(svj1Var.c, svj1Var.b);
                        Iterator it = ntgVar.i.iterator();
                        while (it.hasNext()) {
                            ntgVar.a((String) it.next());
                        }
                    }
                }
                break;
        }
        return rih1.a;
    }
}
