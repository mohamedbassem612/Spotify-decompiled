package p;

import android.net.Uri;
import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hyl1 implements nwq {
    public final /* synthetic */ String a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ bbc c;

    public hyl1(f2g1 f2g1Var, String str, iu30 iu30Var, bbc bbcVar) {
        this.a = str;
        this.b = iu30Var;
        this.c = bbcVar;
    }

    public final void b(zyq zyqVar) {
        owq owqVar = new owq(zyqVar);
        while (owqVar.hasNext()) {
            a1o1 a1o1Var = (a1o1) owqVar.next();
            int i = a1o1Var.d;
            DataHolder dataHolder = ((pwq) a1o1Var).a;
            if (a1o1Var.b() == 1) {
                int i2 = ((pwq) a1o1Var).b;
                zod.s(dataHolder);
                zod.w(i2 >= 0 && i2 < dataHolder.h);
                int iJ = dataHolder.j(i2);
                dataHolder.a0(i2, "path");
                String path = Uri.parse(dataHolder.d[iJ].getString(i2, dataHolder.c.getInt("path"))).getPath();
                if (path == null) {
                    path = "";
                }
                if (nhc1.Y(path, this.a, false)) {
                    y561 y561Var = (y561) this.b.invoke(new z2o1(dataHolder, ((pwq) a1o1Var).b, i));
                    if (y561Var != null) {
                        this.c.l(y561Var);
                    }
                }
            }
        }
    }
}
