package p;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class a65 implements rjm0 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public a65(rjm0 rjm0Var) {
        this.a = (byte) 1;
        this.b = rjm0Var;
        this.c = new y861();
    }

    public final m8n A(n8n n8nVar) {
        switch (this.a) {
            case 0:
                break;
        }
        return ilo1.u(this, n8nVar);
    }

    public final o8n C(n8n n8nVar) {
        switch (this.a) {
            case 0:
                break;
        }
        return ilo1.z(this, n8nVar);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    public final Object D(iu30 iu30Var, lnm lnmVar) {
        w9s0 w9s0Var;
        boolean z;
        Object objR;
        switch (this.a) {
            case 0:
                w55 w55Var = (w55) this.c;
                ohd ohdVar = new ohd(1, aym.t(lnmVar));
                ohdVar.t();
                y55 y55Var = new y55(ohdVar, this, iu30Var);
                if (u890.j(w55Var.c, (Choreographer) this.b)) {
                    synchronized (w55Var.e) {
                        w55Var.g.add(y55Var);
                        if (!w55Var.t) {
                            w55Var.t = true;
                            w55Var.c.postFrameCallback(w55Var.X);
                        }
                        break;
                    }
                    ohdVar.n(new da(w55Var, y55Var, (byte) 5));
                } else {
                    ((Choreographer) this.b).postFrameCallback(y55Var);
                    ohdVar.n(new da(this, y55Var, (byte) 7));
                }
                return ohdVar.r();
            default:
                if (lnmVar instanceof w9s0) {
                    w9s0Var = (w9s0) lnmVar;
                    int i = w9s0Var.d;
                    if ((i & os00.INVALID_ID) != 0) {
                        w9s0Var.d = i - os00.INVALID_ID;
                    } else {
                        w9s0Var = new w9s0(this, lnmVar);
                    }
                } else {
                    w9s0Var = new w9s0(this, lnmVar);
                }
                Object obj = w9s0Var.b;
                d9n d9nVar = d9n.a;
                int i2 = w9s0Var.d;
                if (i2 == 0) {
                    hm5.M(obj);
                    y861 y861Var = (y861) this.c;
                    w9s0Var.a = iu30Var;
                    w9s0Var.d = 1;
                    synchronized (y861Var.b) {
                        z = y861Var.a;
                    }
                    if (z) {
                        objR = rih1.a;
                    } else {
                        ohd ohdVar2 = new ohd(1, aym.t(w9s0Var));
                        ohdVar2.t();
                        synchronized (y861Var.b) {
                            ((ArrayList) y861Var.c).add(ohdVar2);
                        }
                        ohdVar2.n(new wgb0(y861Var, ohdVar2, (byte) 0));
                        objR = ohdVar2.r();
                        if (objR != d9nVar) {
                            objR = rih1.a;
                        }
                    }
                    if (objR != d9nVar) {
                    }
                    return d9nVar;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                iu30Var = w9s0Var.a;
                hm5.M(obj);
                rjm0 rjm0Var = (rjm0) this.b;
                w9s0Var.a = null;
                w9s0Var.d = 2;
                Object objD = rjm0Var.D(iu30Var, w9s0Var);
                if (objD != d9nVar) {
                    return objD;
                }
                return d9nVar;
        }
    }

    public final Object o(Object obj, vu30 vu30Var) {
        switch (this.a) {
            case 0:
                break;
        }
        return vu30Var.invoke(obj, this);
    }

    public final o8n y(o8n o8nVar) {
        switch (this.a) {
            case 0:
                break;
        }
        return flo1.l(this, o8nVar);
    }

    public a65(Choreographer choreographer, w55 w55Var) {
        this.a = (byte) 0;
        this.b = choreographer;
        this.c = w55Var;
    }
}
