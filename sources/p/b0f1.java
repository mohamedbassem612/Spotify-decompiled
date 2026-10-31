package p;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.esperanto.esperanto.Transport;
import com.spotify.upcomingreleases.v1.GetUpcomingReleasesPageRequest;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class b0f1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0f1(boolean z, scx scxVar, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 27;
        this.b = z;
        this.c = scxVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return new b0f1(obj2, lnmVar, (byte) 0);
            case 1:
                return new b0f1(obj2, lnmVar, (byte) 1);
            case 2:
                return new b0f1(obj2, lnmVar, (byte) 2);
            case 3:
                return new b0f1((gdf1) obj2, this.b, lnmVar, (byte) 3);
            case 4:
                return new b0f1(obj2, lnmVar, (byte) 4);
            case 5:
                return new b0f1(obj2, lnmVar, (byte) 5);
            case 6:
                return new b0f1(obj2, lnmVar, (byte) 6);
            case 7:
                return new b0f1(obj2, lnmVar, (byte) 7);
            case 8:
                return new b0f1(obj2, lnmVar, (byte) 8);
            case 9:
                return new b0f1((q9g1) obj2, this.b, lnmVar, (byte) 9);
            case 10:
                return new b0f1(obj2, lnmVar, (byte) 10);
            case 11:
                return new b0f1(obj2, lnmVar, (byte) 11);
            case 12:
                return new b0f1(obj2, lnmVar, (byte) 12);
            case 13:
                return new b0f1(obj2, lnmVar, (byte) 13);
            case 14:
                return new b0f1(obj2, lnmVar, (byte) 14);
            case 15:
                return new b0f1(obj2, lnmVar, (byte) 15);
            case 16:
                return new b0f1(obj2, lnmVar, (byte) 16);
            case 17:
                return new b0f1(obj2, lnmVar, (byte) 17);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new b0f1(obj2, lnmVar, (byte) 18);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new b0f1(obj2, lnmVar, (byte) 19);
            case 20:
                return new b0f1(obj2, lnmVar, (byte) 20);
            case 21:
                return new b0f1(obj2, lnmVar, (byte) 21);
            case 22:
                return new b0f1(obj2, lnmVar, (byte) 22);
            case 23:
                return new b0f1(obj2, lnmVar, (byte) 23);
            case 24:
                return new b0f1(obj2, lnmVar, (byte) 24);
            case 25:
                b0f1 b0f1Var = new b0f1(obj2, lnmVar, (byte) 25);
                b0f1Var.b = ((Boolean) obj).booleanValue();
                return b0f1Var;
            case 26:
                return new b0f1(obj2, lnmVar, (byte) 26);
            case 27:
                return new b0f1(this.b, (scx) obj2, lnmVar);
            case 28:
                return new b0f1(obj2, lnmVar, (byte) 28);
            default:
                return new b0f1(obj2, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return ((b0f1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 1:
                return ((b0f1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 2:
                return ((b0f1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 3:
                ((b0f1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            case 4:
                return ((b0f1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 5:
                return ((b0f1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 6:
                return ((b0f1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 7:
                return ((b0f1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 8:
                return ((b0f1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 9:
                ((b0f1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            case 10:
                return ((b0f1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 11:
                return ((b0f1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 12:
                return ((b0f1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 13:
                return ((b0f1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 14:
                return ((b0f1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 15:
                return ((b0f1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 16:
                ((b0f1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return d9n.a;
            case 17:
                return ((b0f1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return ((b0f1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return ((b0f1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 20:
                return ((b0f1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 21:
                return ((b0f1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 22:
                return ((b0f1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 23:
                return ((b0f1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 24:
                return ((b0f1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 25:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((b0f1) create(bool, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            case 26:
                return ((b0f1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 27:
                ((b0f1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            case 28:
                return ((b0f1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            default:
                return ((b0f1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Type inference failed for: r1v106, types: [p.j9i1] */
    public final Object invokeSuspend(Object obj) {
        Object objA;
        p3u0 p3u0Var;
        Object objL;
        bpb1 bpb1Var;
        i091 i091Var;
        Object objM;
        switch (this.a) {
            case 0:
                d9n d9nVar = d9n.a;
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    e0f1 e0f1Var = ((c0f1) this.c).a;
                    this.b = true;
                    objA = e0f1Var.a(this);
                    if (objA == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objA = obj;
                }
                Transport transport = (Transport) objA;
                if (transport != null) {
                    return new a0f1(transport);
                }
                eg.m("TokenExchangeTransport is not available");
                return null;
            case 1:
                rih1 rih1Var = rih1.a;
                h5f1 h5f1Var = (h5f1) this.c;
                d9n d9nVar2 = d9n.a;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    mr20 mr20Var = h5f1Var.o;
                    mr20 mr20Var2 = h5f1Var.n;
                    irp0 irp0Var = new irp0(3, (lnm) null, (byte) 22);
                    bda1 bda1Var = new bda1(h5f1Var, (byte) 10);
                    this.b = true;
                    Object objS = fc11.s(vrl.c, this, bda1Var, new ekv(irp0Var, (lnm) null), new mr20[]{mr20Var, mr20Var2});
                    if (objS != d9nVar2) {
                        objS = rih1Var;
                    }
                    if (objS == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            case 2:
                d9n d9nVar3 = d9n.a;
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    l8t0 l8t0Var = (l8t0) this.c;
                    this.b = true;
                    if (l8t0Var.invoke(this) == d9nVar3) {
                        return d9nVar3;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 3:
                hm5.M(obj);
                if (((gdf1) this.c).g() && this.b) {
                    gdf1 gdf1Var = (gdf1) this.c;
                    if ((gdf1Var.f || !gdf1Var.l) && (p3u0Var = ((gdf1) this.c).c.d().f) != null) {
                        p3u0Var.J0(0L, false);
                    }
                }
                return rih1.a;
            case 4:
                d9n d9nVar4 = d9n.a;
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    Observable observableE = ((jwf1) this.c).h.e();
                    this.b = true;
                    objL = fc11.l(observableE, 1, (Object) null, this);
                    if (objL == d9nVar4) {
                        return d9nVar4;
                    }
                } else {
                    if (!z4) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objL = obj;
                }
                return Boolean.valueOf(!((Boolean) objL).booleanValue());
            case 5:
                d9n d9nVar5 = d9n.a;
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
                mr20 mr20VarU = rqt0.u(new p3t(((qwf1) this.c).e.a, (byte) 23));
                this.b = true;
                Object objI = b5p1.i(mr20VarU, this);
                return objI == d9nVar5 ? d9nVar5 : objI;
            case 6:
                d9n d9nVar6 = d9n.a;
                boolean z6 = this.b;
                if (!z6) {
                    hm5.M(obj);
                    v4g1 v4g1Var = (v4g1) this.c;
                    b0i0 b0i0Var = new b0i0(v4g1Var.c, v4g1Var);
                    this.b = true;
                    if (smo1.s(new h4g1(b0i0Var, null, (byte) 1), this) == d9nVar6) {
                        return d9nVar6;
                    }
                } else {
                    if (!z6) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 7:
                d9n d9nVar7 = d9n.a;
                boolean z7 = this.b;
                if (!z7) {
                    hm5.M(obj);
                    faa0 faa0VarZ = op71.z(((llm) this.c).a);
                    this.b = true;
                    if (op71.p(faa0VarZ, this) == d9nVar7) {
                        return d9nVar7;
                    }
                } else {
                    if (!z7) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 8:
                d9n d9nVar8 = d9n.a;
                boolean z8 = this.b;
                if (z8) {
                    if (z8) {
                        hm5.M(obj);
                        return rih1.a;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                o7g1 o7g1Var = (o7g1) this.c;
                this.b = true;
                gaa0 gaa0Var = o7g1.k;
                o7g1Var.h(this);
                return d9nVar8;
            case 9:
                hm5.M(obj);
                iu30 iu30Var = ((q9g1) this.c).k;
                if (iu30Var != null) {
                    iu30Var.invoke(Boolean.valueOf(this.b));
                }
                return rih1.a;
            case 10:
                lu51 lu51Var = (lu51) this.c;
                d9n d9nVar9 = d9n.a;
                boolean z9 = this.b;
                if (!z9) {
                    hm5.M(obj);
                    lt20 lt20Var = new lt20(o4p1.l(new xkb1(new pya(((jks) lu51Var.d).c(), (byte) 5), (byte) 4)), new bi61(3, null, (byte) 3), (byte) 0);
                    bda1 bda1Var2 = new bda1(lu51Var, (byte) 15);
                    this.b = true;
                    if (lt20Var.collect(bda1Var2, this) == d9nVar9) {
                        return d9nVar9;
                    }
                } else {
                    if (!z9) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 11:
                d9n d9nVar10 = d9n.a;
                boolean z10 = this.b;
                if (!z10) {
                    hm5.M(obj);
                    ldk0 ldk0Var = ((skg1) this.c).c;
                    this.b = true;
                    if (ldk0Var.h(this) == d9nVar10) {
                        return d9nVar10;
                    }
                } else {
                    if (!z10) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 12:
                d9n d9nVar11 = d9n.a;
                boolean z11 = this.b;
                if (!z11) {
                    hm5.M(obj);
                    ldk0 ldk0Var2 = (cdk0) ((alg1) this.c).d;
                    this.b = true;
                    if (ldk0Var2.h(this) == d9nVar11) {
                        return d9nVar11;
                    }
                } else {
                    if (!z11) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 13:
                d9n d9nVar12 = d9n.a;
                boolean z12 = this.b;
                if (!z12) {
                    hm5.M(obj);
                    bvg1 bvg1Var = (bvg1) this.c;
                    this.b = true;
                    if (bvg1Var.f(this) == d9nVar12) {
                        return d9nVar12;
                    }
                } else {
                    if (!z12) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 14:
                d9n d9nVar13 = d9n.a;
                boolean z13 = this.b;
                if (!z13) {
                    hm5.M(obj);
                    kxg1 kxg1Var = (kxg1) this.c;
                    h6a h6aVar = kxg1Var.X;
                    bda1 bda1Var3 = new bda1(kxg1Var, (byte) 16);
                    this.b = true;
                    if (h6aVar.collect(bda1Var3, this) == d9nVar13) {
                        return d9nVar13;
                    }
                } else {
                    if (!z13) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 15:
                d9n d9nVar14 = d9n.a;
                boolean z14 = this.b;
                if (!z14) {
                    hm5.M(obj);
                    this.b = true;
                    if (hap1.i(5000L, this) == d9nVar14) {
                        return d9nVar14;
                    }
                } else {
                    if (!z14) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ((t4h1) this.c).q.setValue(Boolean.FALSE);
                return rih1.a;
            case 16:
                j5h1 j5h1Var = (j5h1) this.c;
                d9n d9nVar15 = d9n.a;
                boolean z15 = this.b;
                if (z15 && !z15) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                do {
                    r091 r091Var = j5h1Var.g;
                    if (r091Var != null && (bpb1Var = r091Var.g) != null && (i091Var = (i091) bpb1Var.getValue()) != null) {
                        j5h1Var.c(i091Var);
                    }
                    this.b = true;
                } while (hap1.i(1000L, this) != d9nVar15);
                return d9nVar15;
            case 17:
                rih1 rih1Var2 = rih1.a;
                d9n d9nVar16 = d9n.a;
                boolean z16 = this.b;
                if (!z16) {
                    hm5.M(obj);
                    ceh1 ceh1Var = (ceh1) this.c;
                    this.b = true;
                    Object objCollect = rqt0.u(new any(new x010(ezt.g((ezt) ceh1Var.a.get(), "umo"), new pya(((jks) ceh1Var.c.get()).c(), (byte) 3), new jmd1(ceh1Var, (lnm) null, (byte) 2), (byte) 1), (byte) 18)).collect(new bda1(ceh1Var, (byte) 18), this);
                    if (objCollect != d9nVar16) {
                        objCollect = rih1Var2;
                    }
                    if (objCollect == d9nVar16) {
                        return d9nVar16;
                    }
                } else {
                    if (!z16) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var2;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                d9n d9nVar17 = d9n.a;
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
                mr20 mr20Var3 = ((rfh1) this.c).c;
                this.b = true;
                Object objI2 = b5p1.i(mr20Var3, this);
                return objI2 == d9nVar17 ? d9nVar17 : objI2;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                bmh1 bmh1Var = (bmh1) this.c;
                drr0 drr0Var = bmh1Var.d;
                d9n d9nVar18 = d9n.a;
                boolean z18 = this.b;
                if (!z18) {
                    hm5.M(obj);
                    float fS = drr0Var.s();
                    n8b1 n8b1VarL0 = irn1.l0(0.0f, 0.0f, (Object) null, 7);
                    wcf1 wcf1Var = new wcf1(bmh1Var, (byte) 24);
                    this.b = true;
                    if (wwo1.t(fS, 0.0f, n8b1VarL0, wcf1Var, this, 4) == d9nVar18) {
                        return d9nVar18;
                    }
                } else {
                    if (!z18) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                drr0Var.t(0.0f);
                return rih1.a;
            case 20:
                d9n d9nVar19 = d9n.a;
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
                qnh1 qnh1Var = (qnh1) ((bih1) this.c).b;
                br40 br40VarN = GetUpcomingReleasesPageRequest.n();
                br40VarN.n();
                GetUpcomingReleasesPageRequest getUpcomingReleasesPageRequest = (GetUpcomingReleasesPageRequest) br40VarN.build();
                this.b = true;
                Object objA2 = qnh1Var.a(getUpcomingReleasesPageRequest, this);
                return objA2 == d9nVar19 ? d9nVar19 : objA2;
            case 21:
                wph1 wph1Var = (wph1) this.c;
                d9n d9nVar20 = d9n.a;
                boolean z20 = this.b;
                if (!z20) {
                    hm5.M(obj);
                    mfe mfeVarB = k4p1.B(wph1Var.c.a);
                    vi viVar = new vi(wph1Var, (byte) 18);
                    this.b = true;
                    if (mfeVarB.collect(viVar, this) == d9nVar20) {
                        return d9nVar20;
                    }
                } else {
                    if (!z20) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 22:
                d9n d9nVar21 = d9n.a;
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
                alg1 alg1Var = (alg1) this.c;
                this.b = true;
                Object objE = alg1Var.e(this);
                return objE == d9nVar21 ? d9nVar21 : objE;
            case 23:
                rih1 rih1Var3 = rih1.a;
                pt ptVar = (pt) this.c;
                d9n d9nVar22 = d9n.a;
                boolean z22 = this.b;
                if (!z22) {
                    hm5.M(obj);
                    xe01 xe01VarH = d5p1.h(((f0i) ((dg30) ptVar.e)).a.j);
                    bda1 bda1Var4 = new bda1(ptVar, (byte) 19);
                    this.b = true;
                    Object objCollect2 = xe01VarH.a.collect(new yhg1(bda1Var4, (byte) 25), this);
                    if (objCollect2 != d9nVar22) {
                        objCollect2 = rih1Var3;
                    }
                    if (objCollect2 == d9nVar22) {
                        return d9nVar22;
                    }
                } else {
                    if (!z22) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var3;
            case 24:
                w6i1 w6i1Var = (w6i1) this.c;
                d9n d9nVar23 = d9n.a;
                boolean z23 = this.b;
                if (!z23) {
                    hm5.M(obj);
                    mr20 mr20VarU2 = rqt0.u(new any(d5p1.h(((uba) w6i1Var.g).g.s), (byte) 18));
                    bda1 bda1Var5 = new bda1(w6i1Var, (byte) 20);
                    this.b = true;
                    if (mr20VarU2.collect(bda1Var5, this) == d9nVar23) {
                        return d9nVar23;
                    }
                } else {
                    if (!z23) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 25:
                boolean z24 = this.b;
                hm5.M(obj);
                l9i1 l9i1Var = (l9i1) this.c;
                wh41 wh41Var = l9i1Var.a;
                if (z24) {
                    final sjf1 sjf1Var = l9i1Var.k;
                    ?? r1 = new iv30() { // from class: p.j9i1
                        public final void a() {
                            sjf1Var.invoke();
                        }

                        public final boolean equals(Object obj2) {
                            if (obj2 instanceof j9i1) {
                                return u890.j(getFunctionDelegate(), ((iv30) obj2).getFunctionDelegate());
                            }
                            return false;
                        }

                        public final cv30 getFunctionDelegate() {
                            return sjf1Var;
                        }

                        public final int hashCode() {
                            return getFunctionDelegate().hashCode();
                        }
                    };
                    SensorEventListener sensorEventListener = (fw61) wh41Var.c;
                    ((fw61) sensorEventListener).b = r1;
                    Sensor sensor = (Sensor) wh41Var.e;
                    if (sensor != null && !wh41Var.b) {
                        ((SensorManager) wh41Var.d).registerListener(sensorEventListener, sensor, 3);
                        wh41Var.b = true;
                    }
                } else {
                    ((fw61) wh41Var.c).b = null;
                    wh41Var.n();
                }
                return rih1.a;
            case 26:
                iei1 iei1Var = (iei1) this.c;
                d9n d9nVar24 = d9n.a;
                boolean z25 = this.b;
                if (!z25) {
                    hm5.M(obj);
                    String str = iei1Var.e.a;
                    this.b = true;
                    objM = iei1Var.m(str, this);
                    if (objM == d9nVar24) {
                        return d9nVar24;
                    }
                } else {
                    if (!z25) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objM = obj;
                }
                iei1Var.h.l((fei1) objM);
                iei1Var.i();
                return rih1.a;
            case 27:
                hm5.M(obj);
                if (!this.b) {
                    ((scx) this.c).a();
                }
                return rih1.a;
            case 28:
                d9n d9nVar25 = d9n.a;
                boolean z26 = this.b;
                if (!z26) {
                    hm5.M(obj);
                    k4j1 k4j1Var = (k4j1) this.c;
                    this.b = true;
                    if (k4j1Var.b(this) == d9nVar25) {
                        return d9nVar25;
                    }
                } else {
                    if (!z26) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            default:
                d9n d9nVar26 = d9n.a;
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
                any anyVar = ((fv0) this.c).d;
                q1c1 q1c1Var = new q1c1(2, (lnm) null, (byte) 20);
                this.b = true;
                Object objJ = b5p1.j(anyVar, q1c1Var, this);
                return objJ == d9nVar26 ? d9nVar26 : objJ;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0f1(Object obj, boolean z, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0f1(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
    }
}
