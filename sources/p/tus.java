package p;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tus implements o5s {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tus(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void onDestroy(iac0 iac0Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((f0i) ((zus) obj).a).a.d(this);
                break;
            case 1:
                qzu0 qzu0Var = ((yyc0) obj).b;
                d3t d3tVar = qzu0Var.a;
                d3tVar.a = false;
                d3tVar.b = false;
                d3tVar.c = false;
                d3tVar.d = false;
                o860 o860Var = qzu0Var.F0;
                if (o860Var != null) {
                    ((rzq) o860Var.d).l();
                }
                dzp0 dzp0Var = qzu0Var.u0;
                dzp0Var.getClass();
                dzp0Var.b = null;
                dzp0Var.c = null;
                dzp0Var.d = null;
                qzu0Var.E.clear();
                qzu0Var.v0 = null;
                qzu0Var.x0 = new huz((Object) null, (byte) 10);
                qzu0Var.w0 = null;
                qzu0Var.y0 = null;
                qzu0Var.A0 = null;
                qzu0Var.G0 = null;
                qzu0Var.D0 = null;
                qzu0Var.F0 = null;
                qzu0Var.H0 = null;
                qzu0Var.I0 = null;
                qzu0Var.C0 = null;
                break;
            default:
                iac0Var.getLifecycle().d(this);
                break;
        }
    }

    public final void onStart(iac0 iac0Var) {
        Object value;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                zus zusVar = (zus) obj;
                bpb1 bpb1Var = zusVar.c.a;
                do {
                    value = bpb1Var.getValue();
                } while (!bpb1Var.k(value, dm61.x0(zusVar, (Set) value)));
                break;
            case 1:
                qzu0 qzu0Var = ((yyc0) obj).b;
                qzu0Var.d.c(h5d0.f, new jzu0(qzu0Var, (byte) 4));
                break;
            default:
                ((brw) obj).start();
                break;
        }
    }

    public final void onStop(iac0 iac0Var) {
        Object value;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                zus zusVar = (zus) obj;
                Iterator it = new HashMap((Map) zusVar.f.getValue()).entrySet().iterator();
                while (it.hasNext()) {
                    mus musVar = ((uus) ((Map.Entry) it.next()).getValue()).a;
                    zusVar.d();
                }
                zusVar.h.c(zus.i[0], zusVar, (Object) null);
                bpb1 bpb1Var = zusVar.c.a;
                do {
                    value = bpb1Var.getValue();
                } while (!bpb1Var.k(value, dm61.u0(zusVar, (Set) value)));
                break;
            case 1:
                qzu0 qzu0Var = ((yyc0) obj).b;
                d3t d3tVar = qzu0Var.a;
                ArrayList arrayListC = qzu0Var.c();
                if (d3tVar.c) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : arrayListC) {
                        if (obj2 instanceof anc0) {
                            arrayList.add(obj2);
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((anc0) it2.next()).a();
                    }
                    d3tVar.c = false;
                }
                d3tVar.b = false;
                xab1 xab1Var = qzu0Var.b.d;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                break;
            default:
                ((brw) obj).stop();
                break;
        }
    }
}
