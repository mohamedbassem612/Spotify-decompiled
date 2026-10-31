package p;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.subjects.CompletableSubject;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wqd0 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public wqd0(e6u0 e6u0Var, b6u0 b6u0Var) {
        this.a = (byte) 17;
        this.b = e6u0Var;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ((Consumer) this.b).accept(atd0.a);
                break;
            case 1:
                if (!((mrd0) this.b).f1) {
                    ((mrd0) this.b).R0.onNext(drd0.a);
                    ((mrd0) this.b).e1 = null;
                }
                mrd0 mrd0Var = (mrd0) this.b;
                mrd0Var.g1.a(mrd0Var.f.c(new an90(mrd0Var, (byte) 6)));
                break;
            case 2:
                ((h4e0) this.b).c.onNext(rih1.a);
                break;
            case 3:
                ((bge0) this.b).b.a = "";
                break;
            case 4:
                Toast.makeText((Context) ((lm30) this.b).b, 2131957840, 0).show();
                break;
            case 5:
                ((a1r0) ((uw0) this.b).d).g();
                break;
            case 6:
                ((g931) this.b).o(1);
                break;
            case 7:
                ((sam0) this.b).i.a(fam0.a);
                break;
            case 8:
                p1o0 p1o0Var = (p1o0) this.b;
                th30 th30Var = p1o0Var.b;
                if (!p1o0Var.f) {
                    p1o0Var.f = true;
                    th30Var.j0("bluetooth-permission-flow-fragment-request", p1o0Var.a, new ruc0(p1o0Var, (byte) 20));
                    if (th30Var.G("bluetooth-permission-flow-fragment") != null) {
                        eg.m("Check failed.");
                    } else {
                        th30Var.getClass();
                        nu9 nu9Var = new nu9(th30Var);
                        nu9Var.k(0, new hx81(), "bluetooth-permission-flow-fragment", 1);
                        nu9Var.f();
                    }
                    break;
                }
                break;
            case 9:
                iu30 iu30Var = (iu30) this.b;
                if (iu30Var != null) {
                    iu30Var.invoke(gs41.e);
                }
                break;
            case 10:
                kp00 kp00Var = ((qzo0) this.b).e;
                ((Single) kp00Var.c).flatMapCompletable(new ouz(kp00Var, (byte) 8));
                break;
            case 11:
                ((m1p0) this.b).d.setCollapsed(true);
                break;
            case 12:
                ((x3p0) this.b).c.e();
                break;
            case 13:
                ((eur) ((hgo) this.b).c).a("PUFFIN");
                break;
            case 14:
                ((rku) ((p1f0) this.b).g).a();
                break;
            case 15:
                d6s0 d6s0Var = (d6s0) this.b;
                y6s0 y6s0Var = d6s0Var.b;
                if (y6s0Var != null) {
                    ryn1.v(y6s0Var.e);
                }
                d6s0Var.c.V0.onNext(new vp81(f0r0.e));
                break;
            case 16:
                ((tks0) this.b).a.a();
                break;
            case 17:
                ((e6u0) this.b).b.getValue();
                break;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                bqv0 bqv0Var = (bqv0) this.b;
                if (bqv0Var.a.a()) {
                    hma1 hma1VarEdit = bqv0Var.c.a.edit();
                    hma1VarEdit.a(m2a.d, true);
                    hma1VarEdit.g();
                    jkp0 jkp0Var = bqv0Var.h;
                    if (jkp0Var != null) {
                        ((ssw0) jkp0Var.b).l(Boolean.FALSE);
                    }
                }
                break;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                a550 a550Var = ((qil1) this.b).a;
                if (a550Var.a.a.b()) {
                    j7m0 j7m0Var = a550Var.b;
                    Single.zip(lmt0.u(j7m0Var.h.firstOrError(), 3), lmt0.u(j7m0Var.e.a().map(njx0.h), 1), new t2b((byte) 23)).doOnSubscribe(new ekg(j7m0Var, (byte) 7)).subscribe(new ekg(j7m0Var, (byte) 8), zzc0.Z);
                    break;
                }
                break;
            case 20:
                mzr0 mzr0Var = (mzr0) this.b;
                ((HashMap) mzr0Var.c).remove((Uri) mzr0Var.a);
                break;
            case 21:
                s880 s880Var = (s880) this.b;
                Disposable disposable = (Disposable) s880Var.g;
                if (disposable != null) {
                    disposable.dispose();
                }
                s880Var.g = null;
                break;
            case 22:
                ((lzw0) this.b).d.set(false);
                break;
            case 23:
                ((CompletableSubject) this.b).onComplete();
                break;
            case 24:
                ((edx0) this.b).i();
                break;
            case 25:
                ((sdx0) this.b).j.onNext(Boolean.FALSE);
                break;
            case 26:
                ((a1r0) ((l0x0) this.b).b).g();
                break;
            case 27:
                ((a1r0) ((pux0) this.b).b).g();
                break;
            case 28:
                t6z0 t6z0Var = (t6z0) this.b;
                rzo0 rzo0Var = t6z0Var.g;
                i8h1 i8h1VarA = rzo0Var.A();
                x6h1 x6h1VarC = ((xrl0) rzo0Var.c).a.c();
                x6h1VarC.i.add(new a7h1("top_bar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("about_recommendations", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA = x6h1VarC2.a();
                b7x b7xVar = b7x.a;
                ou80 ou80Var = i8h1VarA.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null).a;
                amx0 amx0Var = t6z0Var.d;
                a1r0.j(amx0Var.a, "spotify:promo-disclosure", ou80Var.a, (Bundle) null, true, 4);
                break;
            default:
                ((qbz0) this.b).invoke();
                break;
        }
    }

    public /* synthetic */ wqd0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
