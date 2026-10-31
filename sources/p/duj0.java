package p;

import android.view.View;
import com.spotify.player.esperanto.proto.EsGetStateRequest;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class duj0 implements x4l, o5s {
    public final gj5 a;
    public final q8n b;
    public final q8n c;
    public final ytj0 d;
    public final goq e;
    public final PublishSubject f = new PublishSubject();

    public duj0(gj5 gj5Var, q8n q8nVar, q8n q8nVar2, ytj0 ytj0Var, goq goqVar) {
        this.a = gj5Var;
        this.b = q8nVar;
        this.c = q8nVar2;
        this.d = ytj0Var;
        this.e = goqVar;
        ((f0i) gj5Var).a.a(this);
    }

    public final void a(View view) {
        fn31.T(cto1.q(this.a), this.c, 0, new d7i0(this, view, (lnm) null, (byte) 15), 2);
    }

    public final void b() {
        this.f.onNext(j5.a);
    }

    public final void onCreate(iac0 iac0Var) {
        ytj0 ytj0Var = this.d;
        l4p1.u(cto1.q(this.a), new fu20(hu20.e(new j5b0(new any(rqt0.u(h5p1.s(rqt0.t(yoi1.g(ytj0Var.a.d()), m2j0.Y), rqt0.t(yoi1.g(k4p1.z(ytj0Var.b.callStream("spotify.player.esperanto.proto.ContextPlayer", "GetState", EsGetStateRequest.GetStateRequest.n()).map(qz70.S0), ytj0Var.g, ytj0Var.h)), m2j0.Z), ytj0Var.e.a, new w63(ytj0Var, (lnm) null, (byte) 12))), (byte) 18), (byte) 3), new gg00(this, (lnm) null, (byte) 2)), new hyg0(this, (lnm) null, (byte) 8), (byte) 1));
    }

    public final void onDestroy(iac0 iac0Var) {
        goq goqVar = this.e;
        ((vku) goqVar.d).c();
        goqVar.f = null;
    }
}
