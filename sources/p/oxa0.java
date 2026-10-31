package p;

import com.spotify.liveeventslocation.v1.userlocation.GetUserLocationRequest;
import com.spotify.liveeventslocation.v1.userlocation.GetUserLocationResponse;
import com.spotify.liveeventslocation.v1.userlocation.Location;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableSource;
import java.io.Serializable;
import java.util.Date;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oxa0 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oxa0(Object obj, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = obj;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                return new oxa0((qxa0) obj, lnmVar, (byte) 0);
            case 1:
                return new oxa0((oya0) obj, lnmVar, (byte) 1);
            case 2:
                return new oxa0((fib0) obj, lnmVar, (byte) 2);
            case 3:
                return new oxa0((uwb0) obj, lnmVar, (byte) 3);
            case 4:
                return new oxa0((p9d0) obj, lnmVar, (byte) 4);
            case 5:
                return new oxa0((ane0) obj, lnmVar, (byte) 5);
            case 6:
                return new oxa0((ire0) obj, lnmVar, (byte) 6);
            case 7:
                return new oxa0((nye0) obj, lnmVar, (byte) 7);
            case 8:
                return new oxa0((sze0) obj, lnmVar, (byte) 8);
            case 9:
                return new oxa0((t0f0) obj, lnmVar, (byte) 9);
            case 10:
                return new oxa0((d9g0) obj, lnmVar, (byte) 10);
            case 11:
                return new oxa0((qfg0) obj, lnmVar, (byte) 11);
            case 12:
                return new oxa0((ahg0) obj, lnmVar, (byte) 12);
            case 13:
                return new oxa0((qah0) obj, lnmVar, (byte) 13);
            case 14:
                return new oxa0((hpi0) obj, lnmVar, (byte) 14);
            case 15:
                return new oxa0((obj0) obj, lnmVar, (byte) 15);
            case 16:
                return new oxa0((arj0) obj, lnmVar, (byte) 16);
            case 17:
                return new oxa0((v5k0) obj, lnmVar, (byte) 17);
            case 18:
                return new oxa0((din0) obj, lnmVar, (byte) 18);
            case 19:
                return new oxa0((a1o0) obj, lnmVar, (byte) 19);
            case 20:
                return new oxa0((kyo0) obj, lnmVar, (byte) 20);
            case 21:
                return new oxa0((x5p0) obj, lnmVar, (byte) 21);
            case 22:
                return new oxa0((osq0) obj, lnmVar, (byte) 22);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new oxa0((urr0) obj, lnmVar, (byte) 23);
            case 24:
                return new oxa0((nsr0) obj, lnmVar, (byte) 24);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new oxa0((wtr0) obj, lnmVar, (byte) 25);
            case 26:
                return new oxa0((our0) obj, lnmVar, (byte) 26);
            case 27:
                return new oxa0((b3s0) obj, lnmVar, (byte) 27);
            case 28:
                return new oxa0((g9r) obj, lnmVar, (byte) 28);
            default:
                return new oxa0((c4t0) obj, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                break;
            case 24:
                break;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                break;
            case 26:
                break;
            case 27:
                break;
            case 28:
                break;
        }
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) throws Exception {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.c;
        Serializable serializable = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                haa0 haa0Var = ((qxa0) obj2).f;
                this.b = true;
                Object objD = haa0Var.d(this);
                return objD == serializable ? serializable : objD;
            case 1:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                haa0 haa0Var2 = ((oya0) obj2).d;
                this.b = true;
                Object objK = haa0Var2.k(this);
                return objK == serializable ? serializable : objK;
            case 2:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    m441 m441Var = ((fib0) obj2).b.d;
                    this.b = true;
                    obj = b5p1.i(m441Var, this);
                    if (obj == serializable) {
                        return serializable;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return new dib0((wsc0) obj);
            case 3:
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                axd1 axd1Var = ((uwb0) obj2).c;
                this.b = true;
                Object objB = axd1Var.b(this);
                return objB == serializable ? serializable : objB;
            case 4:
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mdd0 mdd0Var = ((p9d0) obj2).e;
                this.b = true;
                Serializable serializableB = mdd0Var.b(this);
                return serializableB == serializable ? serializable : serializableB;
            case 5:
                ane0 ane0Var = (ane0) obj2;
                boolean z6 = this.b;
                cov0 cov0Var = cov0.d;
                try {
                    if (!z6) {
                        hm5.M(obj);
                        uo5 uo5Var = ane0Var.d;
                        this.b = true;
                        kr40 kr40VarN = GetUserLocationRequest.n();
                        kr40VarN.n();
                        GetUserLocationRequest getUserLocationRequestBuild = kr40VarN.build();
                        cpd0 cpd0Var = (cpd0) uo5Var.b;
                        getUserLocationRequestBuild.getClass();
                        obj = cpd0Var.a(getUserLocationRequestBuild, this);
                        if (obj == serializable) {
                            return serializable;
                        }
                    } else {
                        if (!z6) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    GetUserLocationResponse getUserLocationResponse = (GetUserLocationResponse) obj;
                    int i = yme0.a[getUserLocationResponse.o().ordinal()];
                    if (i == 1 || i == 2) {
                        Location locationN = getUserLocationResponse.n();
                        String name = locationN.getName();
                        Integer numC0 = nhc1.c0(locationN.o());
                        return new cov0(new jj40(name, numC0 != null ? numC0.intValue() : 0), 2, false);
                    }
                    if (i == 3) {
                        Location locationN2 = getUserLocationResponse.n();
                        String name2 = locationN2.getName();
                        Integer numC1 = nhc1.c0(locationN2.o());
                        return new cov0(new jj40(name2, numC1 != null ? numC1.intValue() : 0), 3, false);
                    }
                    return cov0Var;
                } catch (Exception unused) {
                }
                break;
            case 6:
                boolean z7 = this.b;
                if (z7) {
                    if (z7) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                yge0 yge0Var = ((ire0) obj2).c;
                this.b = true;
                Object objE = yge0Var.e(this);
                return objE == serializable ? serializable : objE;
            case 7:
                boolean z8 = this.b;
                if (z8) {
                    if (z8) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                nye0 nye0Var = (nye0) obj2;
                bza0 bza0Var = nye0Var.b;
                String str = nye0Var.e.a;
                this.b = true;
                Object objC = bza0Var.c(str, this);
                return objC == serializable ? serializable : objC;
            case 8:
                boolean z9 = this.b;
                if (!z9) {
                    hm5.M(obj);
                    sze0 sze0Var = (sze0) obj2;
                    bza0 bza0Var2 = sze0Var.d;
                    String str2 = sze0Var.a.a;
                    this.b = true;
                    obj = bza0Var2.b(str2, (Boolean) null, this);
                    if (obj == serializable) {
                        return serializable;
                    }
                } else {
                    if (!z9) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return (u1f0) obj;
            case 9:
                boolean z10 = this.b;
                if (!z10) {
                    hm5.M(obj);
                    t0f0 t0f0Var = (t0f0) obj2;
                    bza0 bza0Var3 = t0f0Var.d;
                    y0f0 y0f0Var = t0f0Var.a;
                    String str3 = y0f0Var.a;
                    Boolean bool = y0f0Var.c;
                    this.b = true;
                    obj = bza0Var3.b(str3, bool, this);
                    if (obj == serializable) {
                        return serializable;
                    }
                } else {
                    if (!z10) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return (u1f0) obj;
            case 10:
                boolean z11 = this.b;
                if (z11) {
                    if (z11) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                d9g0 d9g0Var = (d9g0) obj2;
                a2b0 a2b0Var = d9g0Var.a;
                String str4 = d9g0Var.d.a;
                this.b = true;
                Object objF = a2b0Var.f(str4, this);
                return objF == serializable ? serializable : objF;
            case 11:
                boolean z12 = this.b;
                if (z12) {
                    if (z12) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                qfg0 qfg0Var = (qfg0) obj2;
                n2b0 n2b0Var = qfg0Var.c;
                sfg0 sfg0Var = qfg0Var.b;
                String str5 = sfg0Var.a;
                ibg0 ibg0Var = sfg0Var.b;
                this.b = true;
                Object objA = n2b0Var.a(str5, ibg0Var, this);
                return objA == serializable ? serializable : objA;
            case 12:
                boolean z13 = this.b;
                if (z13) {
                    if (z13) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                a2b0 a2b0Var2 = ((ahg0) obj2).c;
                this.b = true;
                Serializable serializableD = a2b0Var2.d(this);
                return serializableD == serializable ? serializable : serializableD;
            case 13:
                boolean z14 = this.b;
                if (z14) {
                    if (z14) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                m9h0 m9h0Var = ((qah0) obj2).b;
                this.b = true;
                Object objB2 = m9h0Var.b(this);
                return objB2 == serializable ? serializable : objB2;
            case 14:
                boolean z15 = this.b;
                if (z15) {
                    if (z15) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                hpi0 hpi0Var = (hpi0) obj2;
                mev mevVar = hpi0Var.c;
                kpi0 kpi0Var = hpi0Var.b;
                String str6 = kpi0Var.a;
                wxn0 wxn0Var = kpi0Var.b;
                this.b = true;
                Object objG = mevVar.g(str6, wxn0Var, this);
                return objG == serializable ? serializable : objG;
            case 15:
                boolean z16 = this.b;
                if (!z16) {
                    hm5.M(obj);
                    this.b = true;
                    Object objC2 = ((obj0) obj2).c(this);
                    return objC2 == serializable ? serializable : objC2;
                }
                if (z16) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 16:
                boolean z17 = this.b;
                if (z17) {
                    if (z17) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                arj0 arj0Var = (arj0) obj2;
                nmk1 nmk1Var = arj0Var.c;
                gms0 gms0Var = arj0Var.k;
                brj0 brj0Var = arj0Var.a.a;
                this.b = true;
                Object objA2 = nmk1Var.a(gms0Var, brj0Var, this);
                return objA2 == serializable ? serializable : objA2;
            case 17:
                boolean z18 = this.b;
                if (!z18) {
                    hm5.M(obj);
                    ve01 ve01Var = ((v5k0) obj2).b.a;
                    this.b = true;
                    obj = b5p1.i(ve01Var, this);
                    if (obj == serializable) {
                        return serializable;
                    }
                } else {
                    if (!z18) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return new t5k0((wsc0) ((s4k0) obj).a.d());
            case 18:
                boolean z19 = this.b;
                if (z19) {
                    if (z19) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                a2b0 a2b0Var3 = ((din0) obj2).a;
                this.b = true;
                Object objE2 = a2b0Var3.e(this);
                return objE2 == serializable ? serializable : objE2;
            case 19:
                boolean z20 = this.b;
                if (z20) {
                    if (z20) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                drj0 drj0Var = (drj0) ((a1o0) obj2).d;
                this.b = true;
                d3o0 d3o0Var = (d3o0) drj0Var.c;
                CompletableSource completableSourceFlatMapCompletable = d3o0Var.b().map(new yfc0(d3o0Var, (byte) 23)).flatMapCompletable(new m4e0(drj0Var, (byte) 14));
                CompletableSource completableSourceFlatMapCompletable2 = d3o0Var.b().flatMapCompletable(new o0g(d3o0Var, new Date().getTime(), (byte) 8));
                q1o0 q1o0Var = (q1o0) drj0Var.b;
                CompletableSource completableSourceM = Completable.m(new CompletableSource[]{completableSourceFlatMapCompletable2, q1o0Var.b().flatMapCompletable(new d4e0((Object) q1o0Var, (byte) 19))});
                completableSourceM.getClass();
                Object objI = fc11.i(Completable.m(new CompletableSource[]{completableSourceM, completableSourceFlatMapCompletable}), this);
                if (objI != serializable) {
                    objI = rih1Var;
                }
                return objI == serializable ? serializable : rih1Var;
            case 20:
                boolean z21 = this.b;
                if (z21) {
                    if (z21) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                uji1 uji1Var = ((kyo0) obj2).j;
                this.b = true;
                Object objI2 = b5p1.i(uji1Var, this);
                return objI2 == serializable ? serializable : objI2;
            case 21:
                boolean z22 = this.b;
                if (z22) {
                    if (z22) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                long j = x5p0.g;
                o5p0 o5p0Var = new o5p0((x5p0) obj2, (lnm) null, (byte) 0);
                this.b = true;
                Object objP = rc2.P(j, o5p0Var, this);
                return objP == serializable ? serializable : objP;
            case 22:
                boolean z23 = this.b;
                if (!z23) {
                    hm5.M(obj);
                    n9r0 n9r0Var = ((osq0) obj2).N0;
                    this.b = true;
                    return n9r0Var.b(this) == serializable ? serializable : rih1Var;
                }
                if (z23) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                urr0 urr0Var = (urr0) obj2;
                boolean z24 = this.b;
                if (!z24) {
                    hm5.M(obj);
                    if (!ihc1.y0(urr0Var.d.a)) {
                        axd1 axd1Var2 = urr0Var.g;
                        this.b = true;
                        Object objB3 = axd1Var2.b(this);
                        return objB3 == serializable ? serializable : objB3;
                    }
                    eg.m("Check failed.");
                } else {
                    if (z24) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 24:
                boolean z25 = this.b;
                if (!z25) {
                    hm5.M(obj);
                    this.b = true;
                    Object objC3 = ((nsr0) obj2).c(this);
                    return objC3 == serializable ? serializable : objC3;
                }
                if (z25) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                boolean z26 = this.b;
                if (z26) {
                    if (z26) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                myq0 myq0Var = ((wtr0) obj2).f;
                this.b = true;
                Object objI3 = myq0Var.i(this);
                return objI3 == serializable ? serializable : objI3;
            case 26:
                boolean z27 = this.b;
                if (z27) {
                    if (z27) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ytp0 ytp0Var = ((our0) obj2).e;
                this.b = true;
                Object objX = ytp0Var.x(this);
                return objX == serializable ? serializable : objX;
            case 27:
                boolean z28 = this.b;
                if (z28) {
                    if (z28) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                p68 p68Var = ((b3s0) obj2).i;
                this.b = true;
                Object objL = p68Var.l(this);
                return objL == serializable ? serializable : objL;
            case 28:
                boolean z29 = this.b;
                if (z29) {
                    if (z29) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                g9r g9rVar = (g9r) obj2;
                lt20 lt20Var = new lt20(hu20.b(hu20.a, (kge) g9rVar.d, new e3p0(g9rVar, (lnm) null, (byte) 25)), new ob00(3, (lnm) null, (byte) 18), (byte) 0);
                this.b = true;
                return l4p1.p(lt20Var, this) == serializable ? serializable : rih1Var;
            default:
                boolean z30 = this.b;
                if (z30) {
                    if (z30) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                c4t0 c4t0Var = (c4t0) obj2;
                ytp0 ytp0Var2 = c4t0Var.b;
                abu abuVar = c4t0Var.d;
                String strA = abuVar.a();
                this.b = true;
                Object objW = ytp0Var2.w(abuVar, strA, this);
                return objW == serializable ? serializable : objW;
        }
    }
}
