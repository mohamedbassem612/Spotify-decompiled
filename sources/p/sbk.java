package p;

import io.reactivex.rxjava3.core.Flowable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sbk implements wpw {
    public final Object X;
    public final Object Y;
    public final /* synthetic */ byte a;
    public final nsw b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object t;

    public sbk(Flowable flowable, w9u0 w9u0Var, ip91 ip91Var, mzr0 mzr0Var, jo91 jo91Var, sas sasVar, fcs fcsVar, g7h g7hVar) {
        this.a = (byte) 2;
        this.c = flowable;
        this.d = w9u0Var;
        this.e = ip91Var;
        this.f = mzr0Var;
        this.g = jo91Var;
        this.h = sasVar;
        this.i = fcsVar;
        this.t = g7hVar;
        this.X = y3o1.Y(flowable.s(cj20.Q0).X(new m4e0(this, (byte) 16)), htn0.Q0, b5n0.Y0, new y3o0(this, (byte) 1), 8);
        this.Y = eth.a0((vu30) null, new qsn0(this, (byte) 3), 1);
        this.b = jch0.j(new r5o0(this, (byte) 1));
    }

    public static final /* synthetic */ pe e(sbk sbkVar) {
        return (pe) sbkVar.i;
    }

    public static final /* synthetic */ aod f(sbk sbkVar) {
        return (aod) sbkVar.g;
    }

    public static final /* synthetic */ zob1 h(sbk sbkVar) {
        return (zob1) sbkVar.f;
    }

    public static final /* synthetic */ acq i(sbk sbkVar) {
        return (acq) sbkVar.d;
    }

    public static final /* synthetic */ iu30 j(sbk sbkVar) {
        return (u830) sbkVar.t;
    }

    public static final /* synthetic */ ce60 k(sbk sbkVar) {
        return (ce60) sbkVar.h;
    }

    public static final /* synthetic */ String l(sbk sbkVar) {
        return (String) sbkVar.c;
    }

    public static ArrayList m(c3f1 c3f1Var) {
        List<c3f1> list = c3f1Var.f;
        ArrayList arrayList = new ArrayList();
        for (c3f1 c3f1Var2 : list) {
            r7h.W(o7h.N0(m(c3f1Var2), Collections.singletonList(c3f1Var2)), arrayList);
        }
        return arrayList;
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                return (ia00) this.X;
            case 1:
                return (u7h1) this.Y;
            default:
                return (u7h1) this.Y;
        }
    }

    public final rsw c() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.b;
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                return (js20) this.Y;
            case 1:
                return (rey0) this.X;
            default:
                return (poy0) this.X;
        }
    }

    public sbk(String str, acq acqVar, c4z c4zVar, zob1 zob1Var, aod aodVar, ce60 ce60Var, boolean z, boolean z2, boolean z3, pe peVar, u830 u830Var) {
        this.a = (byte) 1;
        this.c = str;
        this.d = acqVar;
        this.e = c4zVar;
        this.f = zob1Var;
        this.g = aodVar;
        this.h = ce60Var;
        this.i = peVar;
        this.t = u830Var;
        this.b = jch0.j(new wy50(this, z, z2, z3));
        this.X = new rey0(new gn50(this, (byte) 4));
        this.Y = eth.a0((vu30) null, new itl(this), 1);
    }

    public sbk(gw70 gw70Var, lzn0 lzn0Var, y1t0 y1t0Var, i4q i4qVar, f971 f971Var, sd41 sd41Var, lbs lbsVar, d0r d0rVar) {
        this.a = (byte) 0;
        this.c = gw70Var;
        this.d = lzn0Var;
        this.e = y1t0Var;
        this.f = i4qVar;
        this.g = f971Var;
        this.h = sd41Var;
        this.i = lbsVar;
        this.t = d0rVar;
        this.X = n3o1.q(this).a(c9k.d, c9k.e);
        this.Y = w3p1.q(new rbk(this, (byte) 0), c6k.f, yzj.f, (o8n) null, new rbk(this, (byte) 1), 8);
        this.b = jch0.j(new zee(this, (byte) 23));
    }
}
