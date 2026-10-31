package p;

import io.reactivex.rxjava3.core.Flowable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kxg1 implements nh91 {
    public final h6a X;
    public c9n Y;
    public final g0l a;
    public final uya b;
    public final v7p c;
    public final lur d;
    public final dma1 e;
    public final yqg f;
    public final q8n g;
    public final q8n h;
    public final dt71 i;
    public final dt71 t;

    public kxg1(Flowable flowable, g0l g0lVar, uya uyaVar, v7p v7pVar, lur lurVar, dma1 dma1Var, yqg yqgVar, q8n q8nVar, q8n q8nVar2) {
        this.a = g0lVar;
        this.b = uyaVar;
        this.c = v7pVar;
        this.d = lurVar;
        this.e = dma1Var;
        this.f = yqgVar;
        this.g = q8nVar;
        this.h = q8nVar2;
        dt71 dt71VarE = mgo1.e(0, 1, 0, 5);
        this.i = dt71VarE;
        this.t = dt71VarE;
        vbm[] vbmVarArr = q601.a;
        this.X = new h6a(z4p1.w(rqt0.u(new h801(new kge(flowable), (byte) 18)), new yy11((byte) 6)), (byte) 16);
        this.Y = l1d.x(q8nVar2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        gxg1 gxg1Var;
        inr inrVar;
        l0l l0lVarC;
        Map map;
        ArrayList arrayList;
        re9 re9Var;
        if (onmVar instanceof gxg1) {
            gxg1Var = (gxg1) onmVar;
            int i = gxg1Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                gxg1Var.e = i - Integer.MIN_VALUE;
            } else {
                gxg1Var = new gxg1(this, onmVar);
            }
        } else {
            gxg1Var = new gxg1(this, onmVar);
        }
        Object objH = gxg1Var.c;
        int i2 = gxg1Var.e;
        if (i2 == 0) {
            hm5.M(objH);
            if (this.f.b() - this.e.g(lxg1.a(), 0L) >= 43200000 && ((l0lVarC = (inrVar = (inr) this.a).c()) == null || l0lVarC.l())) {
                List listI = inrVar.i();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listI) {
                    l0l l0lVar = (l0l) obj;
                    if (!l0lVar.l() && !l0lVar.o() && l0lVar.n() && l0lVar.getType() == f0u.f) {
                        List listX = l0lVar.x();
                        if (!(listX instanceof Collection) || !listX.isEmpty()) {
                            Iterator it = listX.iterator();
                            while (it.hasNext()) {
                                if (nhc1.Y((String) it.next(), "video/", false)) {
                                    arrayList2.add(obj);
                                    break;
                                }
                            }
                        }
                    }
                }
                listI.size();
                arrayList2.size();
                if (!arrayList2.isEmpty()) {
                    map = (Map) this.b.a().getValue();
                    vbc1 vbc1Var = new vbc1(this, (lnm) null, (byte) 14);
                    gxg1Var.a = arrayList2;
                    gxg1Var.b = map;
                    gxg1Var.e = 1;
                    objH = c921.H(this.g, vbc1Var, gxg1Var);
                    d9n d9nVar = d9n.a;
                    if (objH == d9nVar) {
                        return d9nVar;
                    }
                    arrayList = arrayList2;
                }
            }
            return null;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        map = gxg1Var.b;
        arrayList = gxg1Var.a;
        hm5.M(objH);
        Map map2 = (Map) objH;
        lxg1.b(arrayList, map, map2);
        l0l l0lVar2 = (l0l) o7h.q0(o7h.a1(o7h.a1(arrayList, this.c.a(map2)), wqn1.C(map)));
        l0lVar2.getClass();
        nya nyaVar = (nya) map.get(l0lVar2.d());
        if (nyaVar != null && (re9Var = nyaVar.a) != null) {
            yah0.p(re9Var.b().a());
        }
        Objects.toString(map2.get(l0lVar2.j()));
        return new hh91(new cvg1(l0lVar2.getType(), l0lVar2.z(), l0lVar2.getName(), l0lVar2.d(), l0lVar2.G().a, iyk0.f), this);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // p.nh91
    public final void c(int i) throws NoWhenBranchMatchedException {
        int iC = l1d.C(i);
        dma1 dma1Var = this.e;
        if (iC == 0) {
            l1d.B(this.f, dma1Var.edit(), lxg1.a());
        } else if (iC != 1) {
            if (iC != 2) {
                eg.o();
                return;
            }
            hma1 hma1VarEdit = dma1Var.edit();
            hma1VarEdit.c(lxg1.a(), 0L);
            hma1VarEdit.g();
        }
    }

    @Override // p.nh91
    public final mr20 getState() {
        return this.t;
    }

    @Override // p.nh91
    public final void start() {
        c9n c9nVarV = qmo1.v(this.Y, new j4f1(this, (byte) 22));
        this.Y = c9nVarV;
        c921.y(c9nVarV, (o8n) null, 0, new b0f1(this, (lnm) null, (byte) 14), 3);
    }

    @Override // p.nh91
    public final void stop() {
        smo1.q(this.Y);
    }
}
