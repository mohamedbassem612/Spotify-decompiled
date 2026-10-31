package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.rx3.RxConnectables;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kfh implements wpw {
    public final boolean a;
    public final cwe1 b;
    public final wpw c;
    public final e7m0 d;
    public final eih1 e;
    public final nsw f;

    public kfh(boolean z, cwe1 cwe1Var, muz muzVar, i8h1 i8h1Var, EventSource eventSource, ObservableTransformer observableTransformer, fwp fwpVar) {
        ffh ffhVar;
        ffh ffhVar2;
        this.a = z;
        this.b = cwe1Var;
        switch (fwpVar.a) {
            case 0:
                nwp nwpVar = (nwp) ((gbp) fwpVar.b).c;
                ruz ruzVarA = ((cyp) nwpVar.b0.get()).a();
                iwp iwpVar = (iwp) nwpVar.c0.get();
                em0 em0Var = nwpVar.a;
                tmh tmhVar = (tmh) ((teq) em0Var.c).B2.get();
                c8o.l(tmhVar);
                jqh jqhVar = (jqh) ((teq) em0Var.c).n2.get();
                c8o.l(jqhVar);
                vlh vlhVar = (vlh) ((teq) em0Var.c).c2.get();
                c8o.l(vlhVar);
                ffhVar = new ffh(muzVar, i8h1Var, ruzVarA, iwpVar, tmhVar, jqhVar, vlhVar);
                ffhVar2 = ffhVar;
                break;
            case 1:
                v5q v5qVar = (v5q) ((thq) fwpVar.b).c;
                ffhVar = new ffh(muzVar, i8h1Var, ((cyp) v5qVar.M6.get()).a(), (iwp) v5qVar.p2.get(), (tmh) v5qVar.N6.get(), (jqh) v5qVar.u2.get(), (vlh) v5qVar.o2.get());
                ffhVar2 = ffhVar;
                break;
            default:
                teq teqVar = ((thq) fwpVar.b).c;
                ffhVar2 = new ffh(muzVar, i8h1Var, ((cyp) teqVar.a.R6.get()).a(), (iwp) teqVar.d2.get(), (tmh) teqVar.B2.get(), (jqh) teqVar.n2.get(), (vlh) teqVar.c2.get());
                break;
        }
        this.c = ffhVar2;
        this.d = sbl.z(new tfh("", rmh.c, new pbe0()), n4.x, RxConnectables.a(observableTransformer), rng.S0, new jfh(eventSource, (byte) 0));
        this.e = new eih1();
        this.f = jch0.j(new zee(this, (byte) 18));
    }

    public final rqw a() {
        return this.e;
    }

    public final rsw c() {
        return this.f;
    }

    public final mqw getBehavior() {
        return this.d;
    }
}
