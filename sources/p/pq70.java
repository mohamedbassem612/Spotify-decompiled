package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class pq70 implements ya61 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pq70(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // p.ya61
    public final void a(bb61 bb61Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                uq70 uq70Var = (uq70) obj;
                if (uq70Var.b() != null) {
                    w8p1.m();
                    wa61 wa61Var = uq70Var.t;
                    if (wa61Var != null) {
                        wa61Var.b();
                        uq70Var.t = null;
                    }
                    g280 g280Var = uq70Var.s;
                    if (g280Var != null) {
                        g280Var.a();
                        uq70Var.s = null;
                    }
                    uq70Var.o.c();
                    uq70Var.d();
                    xq70 xq70Var = (xq70) uq70Var.f;
                    i29 i29Var = uq70Var.g;
                    i29Var.getClass();
                    va61 va61VarB = uq70Var.B(xq70Var, i29Var);
                    uq70Var.r = va61VarB;
                    Object[] objArr = {va61VarB.c()};
                    ArrayList arrayList = new ArrayList(1);
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    arrayList.add(obj2);
                    uq70Var.A(Collections.unmodifiableList(arrayList));
                    uq70Var.n();
                    break;
                }
                break;
            case 1:
                pr70 pr70Var = (pr70) obj;
                if (pr70Var.b() != null) {
                    hpd1 hpd1Var = pr70Var.u;
                    hpd1Var.getClass();
                    w8p1.m();
                    hpd1Var.d = true;
                    pr70Var.B(true);
                    String strD = pr70Var.d();
                    qr70 qr70Var = (qr70) pr70Var.f;
                    i29 i29Var2 = pr70Var.g;
                    i29Var2.getClass();
                    va61 va61VarC = pr70Var.C(strD, qr70Var, i29Var2);
                    pr70Var.s = va61VarC;
                    Object[] objArr2 = {va61VarC.c()};
                    ArrayList arrayList2 = new ArrayList(1);
                    Object obj3 = objArr2[0];
                    Objects.requireNonNull(obj3);
                    arrayList2.add(obj3);
                    pr70Var.A(Collections.unmodifiableList(arrayList2));
                    pr70Var.n();
                    hpd1 hpd1Var2 = pr70Var.u;
                    hpd1Var2.getClass();
                    w8p1.m();
                    hpd1Var2.d = false;
                    hpd1Var2.c();
                    break;
                }
                break;
            case 2:
                toj0 toj0Var = (toj0) obj;
                toj0Var.c = toj0Var.k();
                h1d h1dVar = (h1d) toj0Var.f;
                if (h1dVar != null) {
                    p1d p1dVar = h1dVar.b;
                    try {
                        try {
                            if (((Boolean) upn1.t(new h1d(p1dVar, (byte) 2)).b.get()).booleanValue()) {
                                toj0 toj0Var2 = p1dVar.W0;
                                bb61 bb61Var2 = (bb61) toj0Var2.c;
                                soj0 soj0Var = (soj0) toj0Var2.d;
                                p1dVar.c.execute(new g1d(p1dVar, p1d.w(toj0Var2), bb61Var2, soj0Var, null, Collections.singletonList(k4i1.f), (byte) 0));
                                break;
                            }
                        } catch (ExecutionException e) {
                            e = e;
                            bhn0.o("Unable to check if MeteringRepeating is attached.", e);
                            return;
                        }
                    } catch (InterruptedException | ExecutionException e2) {
                        e = e2;
                    }
                }
                break;
            case 3:
                law0 law0Var = (law0) obj;
                if (law0Var.b() != null) {
                    law0Var.D((qbw0) law0Var.f, law0Var.g);
                    law0Var.n();
                    break;
                }
                break;
            default:
                Iterator it = ((za61) obj).l.iterator();
                while (it.hasNext()) {
                    ((ya61) it.next()).a(bb61Var);
                }
                break;
        }
    }
}
