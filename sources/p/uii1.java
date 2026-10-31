package p;

import android.content.Intent;
import android.net.Uri;
import io.reactivex.rxjava3.core.Single;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class uii1 implements it80 {
    public final of60 a;
    public final boolean b;
    public final boolean c;

    public uii1(of60 of60Var, boolean z, boolean z2) {
        this.a = of60Var;
        this.b = z;
        this.c = z2;
    }

    @Override // p.it80
    public final void a(ajq0 ajq0Var) {
        ajq0Var.D(l6o1.o(new jbh0[]{ucp1.k(), tii1.a}), "Transform spotify.com/www.spotify.com listeningstats URLs to open.spotify.com", zov0.i);
        if (!this.b && !this.c) {
            ajq0Var.J(cpn1.w(blc0.LISTENING_STATS), "", new ltf1(this, (byte) 9));
        }
        ajq0Var.J(cpn1.w(blc0.LISTENING_STATS_SHARE), "", new f2g1(this, (byte) 6));
        ajq0Var.J(cpn1.w(blc0.LISTENING_STATS_INSTANCE_SHARE), "", new zb91(this, (byte) 25));
    }

    public final Single b(Intent intent) {
        String dataString = intent.getDataString();
        String str = "";
        if (dataString != null) {
            Set set = s4b1.f;
            s4b1 s4b1VarX = uic.x(dataString);
            String strJ = s4b1VarX.j();
            if (strJ == null) {
                String strN = s4b1VarX.n("shareId");
                if (strN != null) {
                    str = strN;
                }
            } else {
                str = strJ;
            }
        }
        Uri data = intent.getData();
        return this.a.b().firstOrError().map(new dlg1(str, data != null ? data.getEncodedQuery() : null, intent)).onErrorReturn(icx0.U0);
    }
}
