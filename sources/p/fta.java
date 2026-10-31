package p;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.ImageView;
import com.google.protobuf.h;
import com.spotify.adshome.events.proto.AdFeedbackEvent;
import com.spotify.adshome.events.proto.EmbeddedHomeAdEvent;
import com.spotify.campaigns.paragraph.view.ParagraphView;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fta implements r6b0, s6b0, k8x0, cy81, Function {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public fta(q8n q8nVar, pbr0 pbr0Var, add addVar, cir0 cir0Var) {
        this.a = (byte) 26;
        this.b = q8nVar;
        this.c = pbr0Var;
        this.d = addVar;
        this.e = cir0Var.h().a(uj1.l, new wj1(this, (byte) 6));
    }

    public static final /* synthetic */ ic9 o(fta ftaVar) {
        return (ic9) ftaVar.d;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0179, code lost:
    
        if (r1 == r10) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A(java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, p.onm r33) {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.fta.A(java.lang.String, java.lang.String, java.lang.String, java.lang.String, p.onm):java.lang.Object");
    }

    public void B(String str, String str2, tv80 tv80Var, nk51 nk51Var) {
        lik1 lik1Var = new lik1(str2);
        fm6 fm6Var = new fm6(str, lik1Var, (String) null, new bm6(false, false, true, false, false, nk51Var, false, (p860) null, 1779));
        if (((em6) this.e).a.a()) {
            ((yhm) this.d).a(fm6Var, tv80Var);
            return;
        }
        mfm mfmVarA = ((i4q) this.c).a(lik1Var);
        Observable observableA = ((js6) this.b).a(fm6Var);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        mfm.b(mfmVarA, observableA, yon1.V0(), new bjm(4, str, str2), tv80Var, 16);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if (p.fn31.Y(r12, r5, r0) == r4) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object C(android.content.Intent r12, p.onm r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof p.l7d
            if (r0 == 0) goto L13
            r0 = r13
            p.l7d r0 = (p.l7d) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.l7d r0 = new p.l7d
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            p.d9n r4 = p.d9n.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            p.hm5.M(r13)
            goto L70
        L2a:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r11)
            r11 = 0
            return r11
        L31:
            android.content.Intent r12 = r0.a
            p.hm5.M(r13)
            goto L4f
        L37:
            p.hm5.M(r13)
            java.lang.Object r13 = r11.b
            p.k7d r13 = (p.k7d) r13
            r0.a = r12
            r0.d = r3
            p.xe4 r13 = r13.b
            int r13 = r13.a()
            java.lang.Integer r13 = p.yah0.p(r13)
            if (r13 != r4) goto L4f
            goto L6f
        L4f:
            java.lang.Number r13 = (java.lang.Number) r13
            int r7 = r13.intValue()
            p.tv80 r8 = p.gg.l(r12)
            java.lang.Object r12 = r11.d
            p.q8n r12 = (p.q8n) r12
            p.v2b r5 = new p.v2b
            r10 = 1
            r9 = 0
            r6 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            r0.a = r9
            r0.d = r2
            java.lang.Object r11 = p.fn31.Y(r12, r5, r0)
            if (r11 != r4) goto L70
        L6f:
            return r4
        L70:
            p.crn0 r11 = p.crn0.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p.fta.C(android.content.Intent, p.onm):java.lang.Object");
    }

    public void a() {
        switch (this.a) {
            case 2:
                ((d520) this.c).a();
                ((ArrayList) ((fta) this.d).b).add(new dg5((pf5) o7h.V0((ArrayList) this.e)));
                break;
            default:
                d520 d520Var = (d520) this.e;
                ajn0 ajn0Var = (ajn0) this.d;
                ArrayList arrayList = (ArrayList) this.b;
                tsi1 tsi1VarW = rc2.w(ajn0Var, (beg) d520Var.e);
                if (tsi1VarW != null) {
                    ((HashMap) d520Var.c).put(ajn0Var, new q1h1(h4p1.h(arrayList), tsi1VarW.getType()));
                    break;
                } else if (((p2o0) d520Var.d).F((heg) d520Var.f) && u890.j(ajn0Var.b(), "value")) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (obj instanceof dg5) {
                            arrayList2.add(obj);
                        }
                    }
                    List list = (List) d520Var.g;
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        list.add((pf5) ((sgl) ((dg5) it.next())).a);
                    }
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    /* JADX WARN: Code duplicated, block: B:33:0x008c  */
    public Object apply(Object obj) {
        t45 t45Var;
        rg7 rg7Var;
        t45 t45Var2;
        switch (this.a) {
            case 12:
                mmr0 mmr0Var = (mmr0) obj;
                Map map = (Map) mmr0Var.a;
                Boolean bool = (Boolean) mmr0Var.b;
                boolean zL = y7y0.L(map);
                u7c u7cVar = (u7c) this.b;
                boolean zC = rh11.c(map);
                r9c r9cVar = (r9c) this.c;
                String str = r9cVar.b;
                p210 p210Var = q210.Companion;
                m210 m210Var = (m210) this.d;
                p210Var.getClass();
                return Single.zip(u7cVar.d.g().flatMap(new fta(this.e, (Object) u7cVar, (Object) str, (Object) new k510(p210.a(m210Var), r9cVar.n, bool), (byte) 13)), yoi1.i(u7cVar.i.a, o6x.a).firstOrError(), new m3c(u7cVar, r9cVar, zL, zC, (byte) 1));
            case 13:
                return ((r310) this.b).b((Map) obj, d7r.a(((u7c) this.c).c.d()), (String) this.d, h510.a((k510) this.e)).map(drm0.Z);
            case 14:
                p210 p210Var2 = q210.Companion;
                m210 m210Var2 = (m210) this.b;
                p210Var2.getClass();
                k510 k510Var = new k510(p210.a(m210Var2), ((r9c) this.c).n, (Boolean) obj);
                v7c v7cVar = (v7c) this.d;
                return v7cVar.b.g().flatMap(new cab((r310) this.e, v7cVar, k510Var, (byte) 7)).map(pbo1.Y).map(new it8(v7cVar, m210Var2, (byte) 20));
            default:
                Object[] objArr = (Object[]) obj;
                yvd yvdVar = (yvd) this.c;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.b;
                Collection collectionValues = concurrentHashMap.values();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : collectionValues) {
                    if (((wvd) obj2).a) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.isEmpty()) {
                    t45Var = yvdVar.c.b;
                    if (t45Var != null) {
                        rg7.b("Load", t45Var);
                        t45Var.a("outcome", "Success");
                    }
                } else {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t45Var = yvdVar.c.b;
                            if (t45Var != null) {
                                rg7.b("Load", t45Var);
                                t45Var.a("outcome", "Success");
                            }
                        } else if (!((wvd) it.next()).b) {
                        }
                    }
                }
                Collection collectionValues2 = concurrentHashMap.values();
                if (collectionValues2.isEmpty()) {
                    rg7Var = yvdVar.c;
                    t45Var2 = rg7Var.b;
                    if (t45Var2 != null) {
                        rg7Var.a.b(t45Var2.e());
                    }
                    rg7Var.b = null;
                } else {
                    Iterator it2 = collectionValues2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            rg7Var = yvdVar.c;
                            t45Var2 = rg7Var.b;
                            if (t45Var2 != null) {
                                rg7Var.a.b(t45Var2.e());
                            }
                            rg7Var.b = null;
                        } else if (!((wvd) it2.next()).b) {
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList(objArr.length);
                for (Object obj3 : objArr) {
                    arrayList2.add((Iterable) obj3);
                }
                ArrayList arrayListV = q7h.V(arrayList2);
                q0p q0pVar = yvdVar.b;
                List list = ((il51) this.d).a;
                djo djoVar = (djo) this.e;
                boolean z = yvdVar.f.e;
                q0pVar.getClass();
                return o7h.a1(arrayListV, new gvd(list, djoVar, z));
        }
    }

    public String b() {
        return ((Activity) this.b).getResources().getString(2131960536);
    }

    public void c(jeg jegVar) {
        ((ArrayList) this.b).add(new fla0(jegVar));
    }

    public void d(Object obj) {
        ArrayList arrayList = (ArrayList) this.b;
        p2o0 p2o0Var = (p2o0) this.c;
        ajn0 ajn0Var = (ajn0) this.d;
        ckz ckzVarB = cxo1.b(obj, (ajm0) p2o0Var.d);
        if (ckzVarB == null) {
            ckzVarB = new ckz("Unsupported annotation argument: " + ajn0Var);
        }
        arrayList.add(ckzVarB);
    }

    public void e(ajn0 ajn0Var, Object obj) {
        ((d520) this.b).e(ajn0Var, obj);
    }

    public void f(ajn0 ajn0Var, heg hegVar, ajn0 ajn0Var2) {
        ((d520) this.b).f(ajn0Var, hegVar, ajn0Var2);
    }

    public void g(heg hegVar, ajn0 ajn0Var) {
        ((ArrayList) this.b).add(new b1z(hegVar, ajn0Var));
    }

    public r6b0 h(heg hegVar, ajn0 ajn0Var) {
        return ((d520) this.b).h(hegVar, ajn0Var);
    }

    public Observable i(j8x0 j8x0Var) {
        j0a1 j0a1Var = (j0a1) this.d;
        Observable map = j0a1Var.d().r((String) this.c, j8x0Var.c, j8x0Var.f).toObservable().filter(zhm0.X).map(drm0.Y);
        tzr0 tzr0Var = (tzr0) this.e;
        return map.compose(new fex0(tzr0Var, (byte) 2)).compose(new fex0(tzr0Var, (byte) 6)).map(new jc9(j8x0Var, (byte) 6));
    }

    public String j() {
        return ((Activity) this.b).getResources().getString(2131960538);
    }

    public r6b0 k(heg hegVar) {
        ArrayList arrayList = new ArrayList();
        p2o0 p2o0Var = (p2o0) this.c;
        return new fta(new d520(p2o0Var, x1p1.j((ajm0) p2o0Var.d, hegVar, (poj0) p2o0Var.e), hegVar, arrayList, mka1.m0), this, arrayList);
    }

    public String l() {
        return ((Activity) this.b).getResources().getString(2131960537);
    }

    public s6b0 m(ajn0 ajn0Var) {
        return ((d520) this.b).m(ajn0Var);
    }

    public void n(ajn0 ajn0Var, jeg jegVar) {
        ((d520) this.b).n(ajn0Var, jegVar);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00af, code lost:
    
        if (r15 == r6) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object p(p.tvv r14, p.onm r15) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.fta.p(p.tvv, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object q(String str, String str2, onm onmVar) {
        f6b f6bVar;
        sy21 m231Var;
        if (onmVar instanceof f6b) {
            f6bVar = (f6b) onmVar;
            int i = f6bVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                f6bVar.c = i - Integer.MIN_VALUE;
            } else {
                f6bVar = new f6b(this, onmVar);
            }
        } else {
            f6bVar = new f6b(this, onmVar);
        }
        Object objJ = f6bVar.a;
        int i2 = f6bVar.c;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                Single singleSubscribeOn = ((l7b) this.d).a(str, str2).subscribeOn((Scheduler) this.e);
                f6bVar.c = 1;
                objJ = fc11.j(singleSubscribeOn, f6bVar);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objJ);
            }
            m231Var = (sy21) objJ;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null) {
            n57.g("Failed to block user", thA);
        }
        if (m231Var instanceof m231) {
            return null;
        }
        return m231Var;
    }

    public kl1 r() {
        dsn1 dsn1VarM;
        ArrayList arrayList = (ArrayList) this.d;
        boolean z = true;
        boolean z2 = (arrayList == null || arrayList.isEmpty()) ? false : true;
        nta ntaVar = null;
        if (!z2) {
            hhg1.n("Details of the products must be provided.");
            return null;
        }
        ArrayList arrayList2 = (ArrayList) this.d;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                if (((ota) it.next()) == null) {
                    hhg1.n("ProductDetailsParams cannot be null.");
                    return null;
                }
            }
        }
        kl1 kl1Var = new kl1();
        kl1Var.a = z2 && !((ota) ((ArrayList) this.d).get(0)).b.b.optString("packageName").isEmpty();
        kl1Var.b = (String) this.b;
        kl1Var.c = (String) this.c;
        d1s d1sVar = (d1s) this.e;
        if (TextUtils.isEmpty((String) d1sVar.c) && TextUtils.isEmpty(null)) {
            z = false;
        }
        boolean zIsEmpty = TextUtils.isEmpty(null);
        if (z && !zIsEmpty) {
            hhg1.n("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
        } else if (d1sVar.a || z || !zIsEmpty) {
            ntaVar = new nta();
            ntaVar.a = (String) d1sVar.c;
            ntaVar.b = d1sVar.b;
        } else {
            hhg1.n("Old SKU purchase information(token/id) or original external transaction id must be provided.");
        }
        kl1Var.d = ntaVar;
        kl1Var.f = new ArrayList();
        ArrayList arrayList3 = (ArrayList) this.d;
        if (arrayList3 != null) {
            dsn1VarM = dsn1.m(arrayList3);
        } else {
            vrn1 vrn1Var = dsn1.b;
            dsn1VarM = ttn1.e;
        }
        kl1Var.e = dsn1VarM;
        return kl1Var;
    }

    public dx81 s() {
        return new dx81(new dof(this), new m4d(this, (byte) 26), qz70.O0, rmf.d);
    }

    public f78 t(String str) {
        Context context = (Context) this.b;
        return new f78(str, context.getString(2131952586), context.getString(2131952584), context.getString(2131952585), "", (String) null, (String) null, "");
    }

    public int type() {
        return 5;
    }

    public Object u(Intent intent, irn0 irn0Var, a8d1 a8d1Var) {
        return fn31.Y((q8n) this.e, new kv1(intent, this, irn0Var, (lnm) null, (byte) 4), a8d1Var);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0099  */
    public void v(en60 en60Var, ji0 ji0Var) {
        String str;
        p57 p57Var;
        h hVarBuild;
        ao0 ao0Var = (ao0) this.e;
        String str2 = ji0Var.a;
        String str3 = ji0Var.t;
        if (en60Var instanceof sm60) {
            sm60 sm60Var = (sm60) en60Var;
            String str4 = sm60Var.a;
            if (sm60Var.equals(mm60.d)) {
                rp0 rp0VarN = AdFeedbackEvent.n();
                rp0VarN.v(ji0Var.h);
                rp0VarN.s(ji0Var.i);
                rp0VarN.q(str3);
                rp0VarN.n(str2);
                rp0VarN.r(ji0Var.c);
                rp0VarN.u(ji0Var.Z.getValue());
                rp0VarN.t(str4);
                hVarBuild = rp0VarN.build();
            } else {
                o2x o2xVarN = EmbeddedHomeAdEvent.n();
                o2xVarN.n(str2);
                o2xVarN.q(str3);
                o2xVarN.r(str4);
                hVarBuild = o2xVarN.build();
            }
            t2j0 t2j0Var = (t2j0) this.c;
            hVarBuild.getClass();
            t2j0Var.a(hVarBuild);
            if (sm60Var.equals(qm60.d)) {
                ((jjh1) this.b).b(ji0Var);
                return;
            }
            return;
        }
        if (!(en60Var instanceof dn60)) {
            eg.o();
            return;
        }
        um60 um60Var = (dn60) en60Var;
        if (!(um60Var instanceof um60)) {
            LinkedHashMap linkedHashMap = co0.b;
            co0 co0Var = (co0) co0.b.get(um60Var.a);
            if (co0Var == null) {
                co0Var = co0.n1;
            }
            ao0.a(ao0Var, co0Var, ji0Var.a, (Long) null, (String) null, (String) null, 124);
            return;
        }
        um60 um60Var2 = um60Var;
        String str5 = um60Var2.a;
        gq70 gq70Var = (gq70) o7h.s0(ji0Var.g.a);
        if (gq70Var == null || (p57Var = gq70Var.c) == null) {
            str = null;
        } else {
            str = p57Var instanceof p57 ? p57Var.a : null;
            if (str == null) {
                str = null;
            }
        }
        String str6 = str == null ? "" : str;
        String str7 = ji0Var.h;
        String str8 = ji0Var.a;
        String str9 = ji0Var.t;
        Exception exc = um60Var2.f;
        String message = exc != null ? exc.getMessage() : null;
        ((xn0) this.d).a(new ijh1(str8, str7, str5, message == null ? "" : message, str9, str6, "home"));
        LinkedHashMap linkedHashMap2 = co0.b;
        co0 co0Var2 = (co0) co0.b.get(str5);
        if (co0Var2 == null) {
            co0Var2 = co0.n1;
        }
        ao0.a(ao0Var, co0Var2, ji0Var.a, (Long) null, um60Var2.e, (String) null, 116);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object w(d1g d1gVar, onm onmVar) {
        e1g e1gVar;
        if (onmVar instanceof e1g) {
            e1gVar = (e1g) onmVar;
            int i = e1gVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                e1gVar.c = i - Integer.MIN_VALUE;
            } else {
                e1gVar = new e1g(this, onmVar);
            }
        } else {
            e1gVar = new e1g(this, onmVar);
        }
        Object objB = e1gVar.a;
        int i2 = e1gVar.c;
        try {
            if (i2 == 0) {
                hm5.M(objB);
                bza0 bza0Var = (bza0) this.b;
                String str = d1gVar.a;
                Boolean bool = d1gVar.b;
                e1gVar.c = 1;
                objB = bza0Var.b(str, bool, e1gVar);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objB);
            }
            u1f0 u1f0Var = (u1f0) objB;
            if (u1f0Var != null) {
                return new l1g(u1f0Var.b);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        return k1g.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable x(String str, String str2, onm onmVar) {
        fte fteVar;
        String m231Var;
        if (onmVar instanceof fte) {
            fteVar = (fte) onmVar;
            int i = fteVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fteVar.c = i - Integer.MIN_VALUE;
            } else {
                fteVar = new fte(this, onmVar);
            }
        } else {
            fteVar = new fte(this, onmVar);
        }
        Object objQ = fteVar.a;
        int i2 = fteVar.c;
        try {
            if (i2 == 0) {
                hm5.M(objQ);
                bfd bfdVar = (bfd) this.c;
                List listM = p7h.M(new String[]{str, str2});
                fteVar.c = 1;
                objQ = bfdVar.q(listM, false, fteVar);
                d9n d9nVar = d9n.a;
                if (objQ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objQ);
            }
            m231Var = ((goe) objQ).a;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (m231Var instanceof m231) {
            return null;
        }
        return m231Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object y(onm onmVar) {
        ite iteVar;
        if (onmVar instanceof ite) {
            iteVar = (ite) onmVar;
            int i = iteVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                iteVar.c = i - Integer.MIN_VALUE;
            } else {
                iteVar = new ite(this, onmVar);
            }
        } else {
            iteVar = new ite(this, onmVar);
        }
        Object objJ = iteVar.a;
        int i2 = iteVar.c;
        if (i2 == 0) {
            hm5.M(objJ);
            Flowable flowable = (Flowable) this.e;
            vbm[] vbmVarArr = q601.a;
            ik ikVar = new ik(new xy0(new kge(flowable), (byte) 6), (byte) 28);
            jte jteVar = new jte(2, null, (byte) 0);
            iteVar.c = 1;
            objJ = b5p1.j(ikVar, jteVar, iteVar);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        String str = (String) objJ;
        return new w4i1(str, str, 12, (String) null);
    }

    public void z() {
        ImageView imageView = (ImageView) this.b;
        imageView.setVisibility(0);
        f2c f2cVar = (f2c) this.c;
        imageView.setImageBitmap(f2cVar.j);
        imageView.setScaleX(0.0f);
        imageView.setScaleY(0.0f);
        imageView.setTranslationY(jon1.j(178, imageView));
        ParagraphView paragraphView = (ParagraphView) this.d;
        paragraphView.setVisibility(0);
        paragraphView.x(f2cVar.h);
        paragraphView.setAlpha(0.0f);
        ParagraphView paragraphView2 = (ParagraphView) this.e;
        paragraphView2.setVisibility(0);
        paragraphView2.x(f2cVar.i);
        paragraphView2.setAlpha(0.0f);
    }

    public /* synthetic */ fta(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ fta(lzn0 lzn0Var, Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.e = lzn0Var;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public fta(String str, Activity activity, j0a1 j0a1Var, tzr0 tzr0Var) {
        this.a = (byte) 7;
        this.c = str;
        this.b = activity;
        this.d = j0a1Var;
        this.e = tzr0Var;
    }

    public fta(Context context, xs80 xs80Var, q8n q8nVar) {
        this.a = (byte) 16;
        this.b = context;
        this.c = xs80Var;
        this.d = q8nVar;
        this.e = new z11(this, (byte) 6);
    }

    public fta(bza0 bza0Var, lzn0 lzn0Var, ajq0 ajq0Var, q8n q8nVar) {
        this.a = (byte) 29;
        this.b = bza0Var;
        this.e = lzn0Var;
        this.c = ajq0Var;
        this.d = q8nVar;
    }

    public fta(lik1 lik1Var, String str, c380 c380Var, aod aodVar, dnc0 dnc0Var, i3b i3bVar) {
        this.a = (byte) 24;
        this.b = str;
        this.c = c380Var;
        this.d = aodVar;
        this.e = i3bVar;
    }

    public fta(xvo xvoVar, f1n0 f1n0Var) {
        this.a = (byte) 11;
        this.b = xvoVar;
        this.c = f1n0Var;
        this.d = gio1.b(Boolean.FALSE);
    }

    public fta(p2o0 p2o0Var, ajn0 ajn0Var, d520 d520Var) {
        this.a = (byte) 3;
        this.c = p2o0Var;
        this.d = ajn0Var;
        this.e = d520Var;
        this.b = new ArrayList();
    }

    public fta(d520 d520Var, fta ftaVar, ArrayList arrayList) {
        this.a = (byte) 2;
        this.c = d520Var;
        this.d = ftaVar;
        this.e = arrayList;
        this.b = d520Var;
    }
}
