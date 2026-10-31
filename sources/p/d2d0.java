package p;

import android.content.Intent;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.messages.ListRouting;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class d2d0 implements it80 {
    public final /* synthetic */ byte a = 1;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public d2d0(dg30 dg30Var, RetrofitMaker retrofitMaker, Scheduler scheduler, e7p0 e7p0Var, y3n0 y3n0Var, t8u0 t8u0Var) {
        this.b = retrofitMaker;
        this.c = scheduler;
        this.d = e7p0Var;
        this.e = y3n0Var;
        this.f = t8u0Var.a(((f0i) dg30Var).a).d();
    }

    public static String d(s4b1 s4b1Var) {
        String strE = s4b1Var.E();
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(strE);
        v5b1 v5b1Var = s4b1VarX.d;
        if (u890.j(v5b1Var != null ? v5b1Var.getType() : null, wyu0.f)) {
            strE = uic.y(s4b1VarX.h()).z();
        }
        return strE == null ? "<missing-uri>" : strE;
    }

    @Override // p.it80
    public final void a(ajq0 ajq0Var) {
        switch (this.a) {
            case 0:
                hl00 hl00Var = new hl00(this, (byte) 27);
                ajq0Var.L(nyu0.e, "List Entity: V2 Playlist URIs", hl00Var);
                ajq0Var.L(wyu0.f, "List Entity: V1 Playlist URIs", hl00Var);
                ajq0Var.L(jxu0.f, "List Entity: List URIs", hl00Var);
                ajq0Var.E(new os80(new dw81(this, (byte) 27), (byte) 1), "List Entity: Personal Playlist Lookup URI", hl00Var);
                for (qq21 qq21Var : ((uxy0) this.b).v()) {
                    if (qq21Var instanceof oq21) {
                        oq21 oq21Var = (oq21) qq21Var;
                        ajq0Var.K(oq21Var.a, "List Entity: ".concat(oq21Var.b), hl00Var);
                    } else if (!(qq21Var instanceof pq21)) {
                        eg.o();
                    } else {
                        ajq0Var.E(((pq21) qq21Var).a, "List Entity: Audio Mime for Local Files", hl00Var);
                    }
                    break;
                }
                wmo1.q(ajq0Var, new m6d((byte) 4), "List Entity: Autoplay/deeplinking", new c2d0(this, null));
                break;
            default:
                ajq0Var.J(cpn1.w(blc0.LIVE_EVENT), "Play live stream and navigate to NPV", new eea0(this, (byte) 10));
                break;
        }
    }

    public void b(a2d0 a2d0Var, Intent intent, String str) {
        t2j0 t2j0Var = (t2j0) this.e;
        e2d0 e2d0VarN = ListRouting.n();
        e2d0VarN.t(kaa0.b(a2d0Var.getReason()));
        if (str == null) {
            str = "";
        }
        e2d0VarN.s(str);
        String dataString = intent.getDataString();
        if (dataString == null) {
            dataString = "";
        }
        e2d0VarN.r(dataString);
        e2d0VarN.q(a2d0Var instanceof y1d0);
        String strA = ((gdr) this.f).a(fdr.d);
        e2d0VarN.n(strA != null ? strA : "");
        t2j0Var.a(e2d0VarN.build());
    }

    public x1d0 c(Intent intent, String str, String str2) {
        kq21 kq21VarX = ((uxy0) this.b).x(str, intent);
        if (kq21VarX instanceof kq21) {
            kq21 kq21Var = kq21VarX;
            b(new y1d0(1), intent, kq21Var.a());
            return new v1d0(kq21Var.b());
        }
        if (kq21VarX instanceof lq21) {
            return new w1d0(((lq21) kq21VarX).a());
        }
        if (kq21VarX.equals(mq21.a)) {
            return new w1d0(str2);
        }
        eg.o();
        return null;
    }

    public d2d0(uxy0 uxy0Var, xrc0 xrc0Var, q8n q8nVar, t2j0 t2j0Var, gdr gdrVar) {
        this.b = uxy0Var;
        this.c = xrc0Var;
        this.d = q8nVar;
        this.e = t2j0Var;
        this.f = gdrVar;
    }
}
