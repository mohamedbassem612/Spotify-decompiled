package p;

import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bju implements Function {
    public final zle1 a;
    public t45 b;

    public bju(zle1 zle1Var, String str) {
        this.a = zle1Var;
        t45 t45VarA = ((s45) zle1Var).a("prepare_wrapped_watch_feed_card");
        t45VarA.a("card_id", str);
        this.b = t45VarA;
    }

    public void a() {
        t45.m(this.b, "composition_creation", 4);
    }

    public Object apply(Object obj) {
        t45 t45Var;
        if ((((feh) obj) instanceof ceh) && (t45Var = this.b) != null) {
            t45Var.g("play-command");
            pne1 pne1VarE = t45Var.e();
            s45 s45Var = this.a;
            if (s45Var != null) {
                s45Var.b(pne1VarE);
            }
        }
        return CompletableEmpty.a;
    }

    public void b() {
        t45 t45Var = this.b;
        t45Var.a("outcome", "failure");
        t45Var.g("navigate");
        this.a.b(t45Var.e());
    }

    public Object c(String str, iu30 iu30Var, onm onmVar) {
        return t4n1.v(this.b, "image_loading-".concat(str), iu30Var, onmVar);
    }

    public Object d(String str, vu30 vu30Var, onm onmVar) {
        String strM = l1d.m("rive_loading-", str);
        return t4n1.v(this.b, strM, new ndm1(vu30Var, strM, this, null, (byte) 1), onmVar);
    }

    public Object e(String str, iu30 iu30Var, lnm lnmVar) {
        return t4n1.v(this.b, "image_loading-" + str, iu30Var, lnmVar);
    }

    public void f(int i) {
        String str;
        int iC = l1d.C(i);
        if (iC == 0) {
            str = "success";
        } else if (iC == 1) {
            str = "failure";
        } else {
            if (iC != 2) {
                eg.o();
                return;
            }
            str = "cancelled";
        }
        this.b.a("outcome", str);
    }

    public void g() {
        t45 t45Var = this.b;
        t45.m(t45Var, "navigate", 4);
        t45Var.a("page", vno1.p(2));
    }

    public void h(String str) {
        t45 t45Var = this.b;
        t45Var.a("outcome", "success");
        t45Var.b("destination", str);
        t45Var.g("navigate");
        this.a.b(t45Var.e());
    }

    public void i(int i) {
        t45 t45Var = this.b;
        t45Var.a("outcome", "cancelled");
        t45Var.b("timeout_value", String.valueOf(i));
        t45Var.g("navigate");
        this.a.b(t45Var.e());
    }

    public bju(zle1 zle1Var) {
        this.a = zle1Var;
        this.b = ((s45) zle1Var).a("cwp_page_load");
    }

    public bju(t45 t45Var, zle1 zle1Var) {
        this.b = t45Var;
        this.a = zle1Var;
    }
}
