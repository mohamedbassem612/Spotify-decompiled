package p;

import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.ViewFlipper;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.protobuf.h;
import com.spotify.assistedcuration.endpointsimpl.assistedcurationsearch.v1.SearchProto;
import com.spotify.mobius.Next;
import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;
import com.spotify.remoteconfig.commons.nebula.GetAttributesResponse;
import com.spotify.remoteconfig.internal.ProductStateProto;
import com.spotify.useraccount.v1.AccountAttribute;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rpv0 implements o2r0, Function, h4i1, Producer, qiw, ya, fq50 {
    public final /* synthetic */ byte a;
    public final Object b;

    public rpv0(xdn0 xdn0Var) {
        Object objE;
        this.a = (byte) 3;
        this.b = xdn0Var;
        Object objE2 = null;
        try {
            objE = xdn0Var.e(jrd1.s0);
        } catch (IllegalArgumentException unused) {
            objE = null;
        }
        Class cls = (Class) objE;
        if (cls != null && !cls.equals(law0.class)) {
            hhg1.i("Invalid target class configuration for ", this, ": ", cls);
            throw null;
        }
        ((xdn0) this.b).r(i4i1.I0, k4i1.b);
        xdn0 xdn0Var2 = (xdn0) this.b;
        xdn0Var2.r(jrd1.s0, law0.class);
        try {
            objE2 = xdn0Var2.e(jrd1.r0);
        } catch (IllegalArgumentException unused2) {
        }
        if (objE2 == null) {
            ((xdn0) this.b).r(jrd1.r0, law0.class.getCanonicalName() + "-" + UUID.randomUUID());
        }
        Object objE3 = -1;
        try {
            objE3 = xdn0Var.e(cx70.P);
        } catch (IllegalArgumentException unused3) {
        }
        if (((Integer) objE3).intValue() == -1) {
            xdn0Var.r(cx70.P, 2);
        }
    }

    public static void b(String str, ArrayList arrayList, ArrayList arrayList2, iu30 iu30Var) {
        if (arrayList2.isEmpty()) {
            return;
        }
        c1z c1zVarL = nmn1.l();
        c1zVarL.c = str;
        c1zVarL.g = str;
        c1zVarL.A = d1z.b;
        arrayList.add(c1zVarL.c());
        boolean z = false;
        while (!arrayList2.isEmpty() && ((Boolean) iu30Var.invoke(arrayList2.get(0))).booleanValue()) {
            arrayList.add(arrayList2.remove(0));
            z = true;
        }
        if (z) {
            return;
        }
        arrayList.remove(arrayList.size() - 1);
    }

    public Object a(Object obj) {
        return ((nma0) ((Map.Entry) obj).getValue()).getDescriptor().h();
    }

    public boolean accept(Object obj) {
        return ((ahu0) this.b).b && ((ksk) obj).b;
    }

    public Object apply(Object obj) {
        String str;
        Observable observableFlatMapObservable;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 1:
                return ((aru0) obj2).o((re70) obj);
            case 8:
                eqy0 eqy0Var = (eqy0) obj2;
                Integer num = (Integer) ((cma1) obj).a;
                int iIntValue = num != null ? num.intValue() : fqy0.b.ordinal();
                eqy0Var.getClass();
                dt50 dt50Var = (dt50) f46.n0(iIntValue, dt50.values());
                return dt50Var == null ? dt50.g : dt50Var;
            case 10:
                mmr0 mmr0Var = (mmr0) obj;
                Map map = (Map) mmr0Var.a;
                Boolean bool = (Boolean) mmr0Var.b;
                yaz0 yaz0Var = (yaz0) obj2;
                qns0 qns0Var = yaz0Var.d;
                return Observable.combineLatest(rqt0.F(qns0Var.a, new ons0(qns0Var, (lnm) null, (byte) 0)).toObservable(), rqt0.F(qns0Var.a, new ons0(qns0Var, (lnm) null, (byte) 2)).toObservable(), rqt0.F(qns0Var.a, new ons0(qns0Var, (lnm) null, (byte) 4)).toObservable(), new l0x0(yaz0Var, map, bool, (byte) 14));
            case 11:
                return (ry01) obj2;
            case 14:
                List list = (List) obj;
                kjf1 kjf1Var = (kjf1) o7h.s0(list);
                if (kjf1Var == null || (str = kjf1Var.f) == null) {
                    str = "";
                }
                gx01 gx01Var = (gx01) ((ytp0) obj2).e;
                List list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((kjf1) it.next()).a);
                }
                Set setP1 = o7h.p1(arrayList);
                q7j0 q7j0Var = gx01Var.h;
                if (q7j0Var.b(str)) {
                    g7h g7hVar = gx01Var.i;
                    List listL1 = o7h.l1(setP1);
                    q7j0Var.a();
                    observableFlatMapObservable = Observable.combineLatest(g7hVar.c("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ", listL1, false), (Observable) gx01Var.o.getValue(), new ex01(setP1));
                } else {
                    observableFlatMapObservable = q7j0.c(str) ? gx01Var.a(str).flatMapObservable(new uxy0(gx01Var, setP1, (byte) 9)) : gx01Var.b(setP1);
                }
                return observableFlatMapObservable.distinctUntilChanged().distinctUntilChanged().map(mgx0.d).onErrorReturnItem(new a011(b7x.a));
            case 15:
                Boolean bool2 = (Boolean) obj;
                z211 z211Var = (z211) obj2;
                if (!z211Var.a.A() || bool2.booleanValue()) {
                    return CompletableEmpty.a;
                }
                x211 x211Var = z211Var.b;
                yqg yqgVar = z211Var.e;
                Completable completableFlatMapCompletable = x211Var.a(sqg0.T(p7h.M(new mmr0[]{new mmr0("timestamp", String.valueOf(yqgVar.b())), new mmr0("timezone", yqgVar.g().getID())}))).map(new pob(z211Var, (byte) 22)).doOnSuccess(new y211(z211Var, (byte) 0)).doOnError(new y211(z211Var, (byte) 1)).onErrorReturn(h2x0.f).flatMapCompletable(new tz01(z211Var, (byte) 1));
                completableFlatMapCompletable.getClass();
                return completableFlatMapCompletable.o(Functions.h);
            case 16:
                vov0 vov0Var = (vov0) obj;
                return vov0Var instanceof tov0 ? ((a911) obj2).a.a() : Single.just(vov0Var);
            case 17:
                uqn uqnVar = (uqn) obj2;
                String str2 = ((o23) obj).a;
                if (str2.length() > 0) {
                    return uqnVar.b.d(str2).map(r5x0.f).toObservable();
                }
                hhg1.n("When refreshing a session, the sessionId must not be empty. ");
                return null;
            case 19:
                vz11 vz11Var = (vz11) obj2;
                if (((f3c1) obj) instanceof e3c1) {
                    return vz11Var.b().c(vz11Var.a(x020.b));
                }
                vz11Var.g.onNext(heh1.a);
                return CompletableEmpty.a;
            case 24:
                dwi0 dwi0Var = (ewi0) obj;
                if (dwi0Var instanceof dwi0) {
                    return new xrx0(dwi0Var);
                }
                if (dwi0Var instanceof cwi0) {
                    uqx0 uqx0Var = (uqx0) obj2;
                    return new urx0(cwi0.c((cwi0) dwi0Var, (String) null, uqx0Var.c, uqx0Var.d, 51));
                }
                if (dwi0Var instanceof xvi0) {
                    return new ssx0((xvi0) dwi0Var);
                }
                eg.o();
                return null;
            default:
                SearchProto.EntityViewUriResponse entityViewUriResponse = (SearchProto.EntityViewUriResponse) obj;
                return ((py41) obj2).a.a(entityViewUriResponse.getUrisList()).map(new tz01(entityViewUriResponse, (byte) 13));
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0053 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0051 -> B:20:0x0054). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object c(p.wbn r5, p.onm r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p.nxv0
            if (r0 == 0) goto L13
            r0 = r6
            p.nxv0 r0 = (p.nxv0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.nxv0 r0 = new p.nxv0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            java.util.Iterator r5 = r0.a
            p.hm5.M(r6)
            goto L54
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r4)
            r4 = 0
            return r4
        L2e:
            p.hm5.M(r6)
            java.util.List r5 = r5.a
            java.util.Iterator r5 = r5.iterator()
        L37:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L66
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r1 = r4.b
            p.gal r1 = (p.gal) r1
            r0.a = r5
            r0.d = r2
            java.lang.Object r6 = r1.h(r6, r0)
            p.d9n r1 = p.d9n.a
            if (r6 != r1) goto L54
            return r1
        L54:
            p.ymf1 r6 = (p.ymf1) r6
            if (r6 == 0) goto L37
            p.lcn r4 = new p.lcn
            java.lang.String r5 = r6.a
            java.lang.String r0 = r6.b
            java.lang.String r1 = r6.c
            int r6 = r6.d
            r4.<init>(r5, r0, r6, r1)
            return r4
        L66:
            p.scn r4 = p.scn.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p.rpv0.c(p.wbn, p.onm):java.lang.Object");
    }

    public law0 d() {
        qbw0 qbw0Var = new qbw0(eqq0.b((xdn0) this.b));
        cx70.C(qbw0Var);
        law0 law0Var = new law0(qbw0Var);
        law0Var.p = law0.w;
        return law0Var;
    }

    public xdn0 e() {
        return (xdn0) this.b;
    }

    public Iterator f() {
        return ((Iterable) this.b).iterator();
    }

    public j4m g(nhr0 nhr0Var, Bundle bundle) {
        return new qpv0();
    }

    public Object get() {
        return new DispatcherWorker(((nix0) this.b).d);
    }

    public i4i1 h() {
        return new qbw0(eqq0.b((xdn0) this.b));
    }

    public quw0 i(sy21 sy21Var) {
        h hVarBuild;
        ry21 ry21Var = sy21Var.a;
        if (ry21Var.d == 304) {
            return sa20.e1;
        }
        GetAttributesResponse getAttributesResponse = (GetAttributesResponse) sy21Var.b;
        if (!ry21Var.Q0 || getAttributesResponse == null) {
            return a020.e1;
        }
        zfo0 zfo0VarP = z0o1.p(getAttributesResponse);
        List list = zfo0VarP.b;
        LinkedHashMap linkedHashMap = zfo0VarP.a;
        if (linkedHashMap.isEmpty()) {
            return new ouw0(list);
        }
        utw0 utw0Var = ike1.a;
        utw0Var.y("RCS");
        utw0Var.o("Storing the product state on the disk", new Object[0]);
        ne neVar = (ne) this.b;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            rk rkVarQ = ((AccountAttribute) entry.getValue()).q();
            int i = rkVarQ == null ? -1 : dvw0.a[rkVarQ.ordinal()];
            if (i == 1) {
                qk qkVarQ = com.spotify.remoteconfig.internal.AccountAttribute.q();
                qkVarQ.n(((AccountAttribute) entry.getValue()).getBoolValue());
                hVarBuild = qkVarQ.build();
            } else if (i == 2) {
                qk qkVarQ2 = com.spotify.remoteconfig.internal.AccountAttribute.q();
                qkVarQ2.q(((AccountAttribute) entry.getValue()).p());
                hVarBuild = qkVarQ2.build();
            } else if (i != 3) {
                hVarBuild = com.spotify.remoteconfig.internal.AccountAttribute.q().build();
            } else {
                qk qkVarQ3 = com.spotify.remoteconfig.internal.AccountAttribute.q();
                qkVarQ3.r(((AccountAttribute) entry.getValue()).getStringValue());
                hVarBuild = qkVarQ3.build();
            }
            linkedHashMap2.put(key, (com.spotify.remoteconfig.internal.AccountAttribute) hVarBuild);
        }
        String strC = ry21Var.f.c("etag");
        if (strC == null) {
            strC = "";
        }
        ruw0 ruw0VarQ = ProductStateProto.q();
        ruw0VarQ.n(linkedHashMap2);
        ruw0VarQ.q(strC);
        ProductStateProto productStateProtoBuild = ruw0VarQ.build();
        productStateProtoBuild.getClass();
        neVar.b0(new sks0(productStateProtoBuild, (byte) 16));
        return new puw0(list);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object j(onm onmVar) {
        pa21 pa21Var;
        if (onmVar instanceof pa21) {
            pa21Var = (pa21) onmVar;
            int i = pa21Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pa21Var.c = i - Integer.MIN_VALUE;
            } else {
                pa21Var = new pa21(this, onmVar);
            }
        } else {
            pa21Var = new pa21(this, onmVar);
        }
        Object objD = pa21Var.a;
        int i2 = pa21Var.c;
        if (i2 == 0) {
            hm5.M(objD);
            k2b0 k2b0Var = (e2b0) this.b;
            pa21Var.c = 1;
            objD = k2b0Var.d(pa21Var);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objD);
        }
        ctr0 ctr0Var = (ctr0) objD;
        if (ctr0Var.c.equals(ejh1.c)) {
            return objD;
        }
        bhn0.g(ctr0Var.c, "Current account is not eligible to unlink its parent or guardian: ");
        return null;
    }

    public n2r k() {
        return (vyq0) this.b;
    }

    public Next l(z551 z551Var, g151 g151Var) {
        boolean zB;
        fw41 fw41Var = z551Var.f;
        String str = z551Var.a;
        tv80 tv80Var = g151Var.b;
        f951 f951Var = z551Var.d;
        di4 di4Var = (di4) this.b;
        boolean z = f951Var instanceof a951;
        u851 u851Var = u851.a;
        if (z || (f951Var instanceof r851)) {
            zB = true;
        } else if ((f951Var instanceof p851) || u890.j(f951Var, q851.a) || u890.j(f951Var, u851Var) || (f951Var instanceof w851) || u890.j(f951Var, y851.a) || (f951Var instanceof z851) || (f951Var instanceof b951)) {
            zB = false;
        } else {
            if (!(f951Var instanceof x851)) {
                eg.o();
                return null;
            }
            zB = di4Var.B();
        }
        if (!zB || str.length() <= 0 || !g151Var.a) {
            return Next.j();
        }
        String strF = ejb.f();
        return Next.i(z551.a(z551Var, null, null, 0, u851Var, null, null, null, se20.a, null, 0, null, null, false, new h1z0(null), false, 24435), Collections.singleton(di4Var.B() ? new mx41(str, strF, tv80Var, fw41Var.c) : new nx41(str, strF, tv80Var, fw41Var.c)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object m(String str, onm onmVar) {
        pt21 pt21Var;
        String str2;
        if (onmVar instanceof pt21) {
            pt21Var = (pt21) onmVar;
            int i = pt21Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                pt21Var.d = i - Integer.MIN_VALUE;
            } else {
                pt21Var = new pt21(this, onmVar);
            }
        } else {
            pt21Var = new pt21(this, onmVar);
        }
        Object objA = pt21Var.b;
        int i2 = pt21Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                String str3 = "spotify:gif:gp-" + str;
                rg31 rg31Var = (rg31) this.b;
                List listSingletonList = Collections.singletonList(str3);
                pt21Var.a = str3;
                pt21Var.d = 1;
                objA = rg31Var.a(listSingletonList, pt21Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
                str2 = str3;
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = pt21Var.a;
                hm5.M(objA);
            }
            Object obj = ((Map) objA).get(str2);
            lg31 lg31Var = obj instanceof lg31 ? (lg31) obj : null;
            if (lg31Var != null) {
                return lg31Var;
            }
            throw new IllegalStateException(("No GIF metadata resolved for " + str2).toString());
        } catch (Throwable th) {
            return new m231(th);
        }
    }

    public void v(Object obj) {
        int iF;
        switch (this.a) {
            case 7:
                svx0 svx0Var = (zvx0) obj;
                fvx0 fvx0Var = (fvx0) this.b;
                s24 s24Var = fvx0Var.d;
                ViewFlipper viewFlipper = (ViewFlipper) s24Var.i;
                if (svx0Var instanceof vvx0) {
                    p8p1.o(viewFlipper, (ScrollView) ((y441) s24Var.X).a);
                    fvx0Var.Y.getClass();
                    return;
                }
                if (svx0Var instanceof svx0) {
                    p8p1.o(viewFlipper, (ConstraintLayout) ((y441) s24Var.h).a);
                    fvx0Var.g.a(svx0Var);
                    return;
                }
                if (svx0Var instanceof tvx0) {
                    p8p1.o(viewFlipper, (ProgressBar) ((zgz0) s24Var.t).b);
                    fvx0Var.X.d();
                    return;
                }
                if (svx0Var instanceof uvx0) {
                    p8p1.o(viewFlipper, (ConstraintLayout) ((m021) s24Var.g).b);
                    fvx0Var.t.g.e((uvx0) svx0Var);
                    return;
                } else if (svx0Var instanceof yvx0) {
                    p8p1.o(viewFlipper, (ConstraintLayout) ((p1f0) s24Var.Z).a);
                    ((r4u) fvx0Var.i.f).e((yvx0) svx0Var);
                    return;
                } else {
                    if (!(svx0Var instanceof xvx0)) {
                        eg.o();
                        return;
                    }
                    p8p1.o(viewFlipper, (ConstraintLayout) ((bjx) s24Var.Y).b);
                    fvx0Var.h.a((xvx0) svx0Var);
                    return;
                }
            case 13:
                mmr0 mmr0Var = (mmr0) obj;
                boolean zBooleanValue = ((Boolean) mmr0Var.a).booleanValue();
                List list = (List) mmr0Var.b;
                if (zBooleanValue) {
                    ((hce1) this.b).w(list);
                    return;
                }
                return;
            default:
                od51 od51Var = (od51) obj;
                q450 q450Var = (q450) this.b;
                lw41 lw41Var = od51Var.a;
                e7r0 e7r0Var = od51Var.h;
                a851 a851Var = od51Var.f;
                y751 y751Var = (y751) q450Var.f;
                hc51 hc51Var = (hc51) q450Var.e;
                y751Var.getClass();
                Set set = z751.a;
                boolean zContains = set.contains(a851Var);
                if (a851Var == a851.X) {
                    iF = y751Var.f(hc51Var, lw41Var, a851Var);
                } else {
                    int iE = hc51Var.e(new k750((byte) 29, zContains)).d().e();
                    synchronized (y751Var) {
                        y751Var.c.m((Object) null, b7x.a);
                        y751Var.a.m((Object) null, new x751(lw41Var, iE, false, null));
                    }
                    if (zContains) {
                        hc51Var.e(new jt41(cc51.d, jh31.Q0, (byte) 6));
                        hc51Var.e(new jt41(cc51.e, jh31.S0, (byte) 6));
                    }
                    iF = iE;
                }
                boolean zContains2 = set.contains(a851Var);
                hc51 hc51Var2 = (hc51) q450Var.e;
                ConstraintLayout constraintLayout = (ConstraintLayout) ((g931) q450Var.i).b;
                AtomicReference atomicReference = hc51Var2.b;
                if (iF == ((ec51) atomicReference.get()).e) {
                    if (!constraintLayout.isAttachedToWindow()) {
                        constraintLayout.addOnAttachStateChangeListener(new gc51(constraintLayout, iF, hc51Var2));
                    } else if (iF == ((ec51) atomicReference.get()).e) {
                        hc51Var2.b();
                        hc51Var2.e = constraintLayout;
                        fc51 fc51Var = new fc51(hc51Var2, iF);
                        hc51Var2.f = fc51Var;
                        constraintLayout.addOnAttachStateChangeListener(fc51Var);
                    }
                }
                ((w651) q450Var.h).a(e7r0Var.b, e7r0Var.d);
                ((e8r0) q450Var.d).a = new l451(e7r0Var, (byte) 6);
                xb51 xb51Var = new xb51(iF);
                if (!zContains2) {
                    xb51Var = null;
                }
                wmy wmyVar = (wmy) ((g931) q450Var.i).d;
                if (wmyVar != null) {
                    if (!(lw41Var instanceof lw41)) {
                        eg.o();
                        return;
                    } else if (xb51Var == null) {
                        wmyVar.Q(lw41Var, (xb51) null);
                    } else {
                        wmyVar.Q(lw41Var, xb51Var);
                    }
                }
                if (q450Var.a && a851Var == a851.c) {
                    q450Var.a = false;
                    return;
                }
                return;
        }
    }

    public rpv0(di4 di4Var, ejb ejbVar) {
        this.a = (byte) 28;
        this.b = di4Var;
    }

    public rpv0(String str, waq0 waq0Var) {
        this.a = (byte) 25;
        this.b = new waq0(waq0Var, (byte) 9);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rpv0(byte b) {
        this(xdn0.d());
        this.a = b;
        switch (b) {
            case 3:
                break;
            default:
                this.b = new vyq0((byte) 11);
                break;
        }
    }

    public /* synthetic */ rpv0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
