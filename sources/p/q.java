package p;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class q implements dwo {
    public final /* synthetic */ byte a = 0;
    public Object b;

    public q(wbh wbhVar, ov20 ov20Var, tl4 tl4Var, mr20 mr20Var, q8n q8nVar) {
        wbh wbhVar2;
        llm llmVarE = smo1.e(q8nVar);
        this.b = llmVarE;
        if (tl4Var.a()) {
            wbhVar2 = wbhVar;
            l4p1.u(llmVarE, f5p1.q(f5p1.n(((bw20) ov20Var).b("allow-advertising-id-transmission")), new tbh(2, wbhVar2, wbh.class, "setUpComscore", "setUpComscore(Z)V", 4)));
        } else {
            wbhVar2 = wbhVar;
        }
        l4p1.u(llmVarE, f5p1.q(mr20Var, new mx(wbhVar2, null, (byte) 8)));
    }

    public final void shutdown() {
        switch (this.a) {
            case 0:
                ((Disposable) this.b).dispose();
                break;
            case 1:
                Iterator it = ((Set) this.b).iterator();
                while (it.hasNext()) {
                    ((yw0) it.next()).stop();
                }
                break;
            case 2:
                ((rku) this.b).a();
                break;
            case 3:
                smo1.q((llm) this.b);
                break;
            case 4:
                ((jvr) this.b).a();
                break;
            case 5:
                ((ezm0) ((bzm0) this.b)).c(azm0.b);
                break;
            case 6:
                ((flp0) this.b).a();
                break;
            case 7:
                vb41 vb41Var = (vb41) this.b;
                vb41Var.p = false;
                vb41Var.a();
                break;
            default:
                ((vtk1) this.b).a();
                break;
        }
    }

    public q(jvr jvrVar) {
        this.b = jvrVar;
        jvrVar.b();
    }

    public q(flp0 flp0Var) {
        this.b = flp0Var;
        flp0Var.b();
    }

    public q(vb41 vb41Var) {
        this.b = vb41Var;
        vb41Var.p = true;
        vb41Var.a();
    }

    public q(Set set) {
        this.b = set;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((yw0) it.next()).start();
        }
    }

    public q(vtk1 vtk1Var) {
        this.b = vtk1Var;
        vtk1Var.b();
    }

    public q(crd crdVar, kly0 kly0Var) {
        rku rkuVar = new rku();
        this.b = rkuVar;
        rkuVar.b(((drd) crdVar).b.subscribe(new mba(kly0Var, (byte) 17)));
    }

    public q(vhg0 vhg0Var, bzm0 bzm0Var, c3n0 c3n0Var, di8 di8Var, mc00 mc00Var) {
        this.b = bzm0Var;
        String str = di8Var.a;
        hma1 hma1VarEdit = c3n0Var.a.edit();
        hma1VarEdit.d(c3n0.b, str);
        hma1VarEdit.g();
        ((ezm0) bzm0Var).b(vhg0Var.e, azm0.b);
        ((lc00) mc00Var.a).b().a();
    }

    public /* synthetic */ q() {
    }
}
