package p;

import android.view.ViewGroup;
import com.google.protobuf.Empty;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.device_location_service.proto.DeviceLocationServiceOuterClass;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFilter;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n1o extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n1o(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return new n1o((o1o) obj2, lnmVar, (byte) 0);
            case 1:
                return new n1o((umf0) obj2, lnmVar, (byte) 1);
            case 2:
                return new n1o((ooo) obj2, lnmVar, (byte) 2);
            case 3:
                n1o n1oVar = new n1o((k2q) obj2, lnmVar, (byte) 3);
                n1oVar.b = ((Boolean) obj).booleanValue();
                return n1oVar;
            case 4:
                return new n1o((vdr) obj2, lnmVar, (byte) 4);
            case 5:
                return new n1o((cfr) obj2, lnmVar, (byte) 5);
            case 6:
                return new n1o((sfr) obj2, lnmVar, (byte) 6);
            case 7:
                return new n1o((yfr) obj2, lnmVar, (byte) 7);
            case 8:
                return new n1o((hir) obj2, lnmVar, (byte) 8);
            case 9:
                return new n1o((njr) obj2, lnmVar, (byte) 9);
            case 10:
                return new n1o((vkr) obj2, lnmVar, (byte) 10);
            case 11:
                return new n1o((inr) obj2, lnmVar, (byte) 11);
            case 12:
                return new n1o((qor) obj2, lnmVar, (byte) 12);
            case 13:
                return new n1o((tor) obj2, lnmVar, (byte) 13);
            case 14:
                return new n1o((fpr) obj2, lnmVar, (byte) 14);
            case 15:
                return new n1o((itr) obj2, lnmVar, (byte) 15);
            case 16:
                return new n1o((mtr) obj2, lnmVar, (byte) 16);
            case 17:
                return new n1o((uwl) obj2, lnmVar, (byte) 17);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new n1o((tcs) obj2, lnmVar, (byte) 18);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new n1o((cks) obj2, lnmVar, (byte) 19);
            case 20:
                return new n1o((hks) obj2, lnmVar, (byte) 20);
            case 21:
                return new n1o((jks) obj2, lnmVar, (byte) 21);
            case 22:
                return new n1o((mxr) obj2, lnmVar, (byte) 22);
            case 23:
                return new n1o((lxg) obj2, lnmVar, (byte) 23);
            case 24:
                return new n1o((rhh) obj2, lnmVar, (byte) 24);
            case 25:
                return new n1o((rhh) obj2, lnmVar, (byte) 25);
            case 26:
                return new n1o((p9t) obj2, lnmVar, (byte) 26);
            case 27:
                return new n1o((tp7) obj2, lnmVar, (byte) 27);
            case 28:
                return new n1o((grt) obj2, lnmVar, (byte) 28);
            default:
                return new n1o((mrt) obj2, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return ((n1o) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 1:
                return ((n1o) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 2:
                return ((n1o) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 3:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((n1o) create(bool, (lnm) obj2)).invokeSuspend(rih1Var);
            case 4:
                return ((n1o) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 5:
                return ((n1o) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 6:
                return ((n1o) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 7:
                return ((n1o) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 8:
                return ((n1o) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 9:
                return ((n1o) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 10:
                return ((n1o) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 11:
                return ((n1o) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 12:
                ((n1o) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return d9n.a;
            case 13:
                return ((n1o) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 14:
                return ((n1o) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 15:
                return ((n1o) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 16:
                return ((n1o) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 17:
                return ((n1o) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return ((n1o) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return ((n1o) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 20:
                return ((n1o) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 21:
                return ((n1o) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 22:
                return ((n1o) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 23:
                return ((n1o) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 24:
                return ((n1o) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 25:
                return ((n1o) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 26:
                return ((n1o) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 27:
                return ((n1o) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 28:
                return ((n1o) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            default:
                return ((n1o) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        Object objC;
        byte b = 22;
        byte b2 = 27;
        byte b3 = 23;
        byte b4 = 2;
        irt irtVar = null;
        switch (this.a) {
            case 0:
                d9n d9nVar = d9n.a;
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    o1o o1oVar = (o1o) this.c;
                    mr20 mr20Var = o1oVar.a;
                    fdd fddVar = new fdd(o1oVar, b);
                    this.b = true;
                    if (mr20Var.collect(fddVar, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 1:
                d9n d9nVar2 = d9n.a;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    b7n b7nVar = (b7n) ((umf0) this.c).d;
                    e6n e6nVar = e6n.a;
                    Boolean bool = Boolean.TRUE;
                    this.b = true;
                    if (b7nVar.b(e6nVar, bool, this) == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 2:
                rih1 rih1Var = rih1.a;
                ooo oooVar = (ooo) this.c;
                d9n d9nVar3 = d9n.a;
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    qt20 qt20VarV = z4p1.v(rwq.q(new hx4(oooVar, (byte) 23)), 1);
                    fdd fddVar2 = new fdd(oooVar, b3);
                    this.b = true;
                    Object objCollect = qt20VarV.collect(new o010(fddVar2, (byte) 25), this);
                    if (objCollect != d9nVar3) {
                        objCollect = rih1Var;
                    }
                    if (objCollect == d9nVar3) {
                        return d9nVar3;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            case 3:
                boolean z4 = this.b;
                hm5.M(obj);
                return z4 ? new x1r(3) : w1r.a;
            case 4:
                vdr vdrVar = (vdr) this.c;
                d9n d9nVar4 = d9n.a;
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    mr20 mr20VarU = rqt0.u(new lt20(hu20.e(vdrVar.f, new b7c((lnm) irtVar, (Object) vdrVar, b)), new jk(3, (lnm) null, (byte) 23), (byte) 0));
                    fdd fddVar3 = new fdd(vdrVar, (byte) 25);
                    this.b = true;
                    if (mr20VarU.collect(fddVar3, this) == d9nVar4) {
                        return d9nVar4;
                    }
                } else {
                    if (!z5) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 5:
                d9n d9nVar5 = d9n.a;
                boolean z6 = this.b;
                if (z6) {
                    if (z6) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                cfr cfrVar = (cfr) this.c;
                this.b = true;
                ohd ohdVar = new ohd(1, aym.t(this));
                ohdVar.t();
                c78 c78Var = new c78(cfrVar, ohdVar, (byte) 1);
                cfrVar.c.a(c78Var);
                ohdVar.n(new y0o(cfrVar, c78Var, (byte) 13));
                Object objR = ohdVar.r();
                return objR == d9nVar5 ? d9nVar5 : objR;
            case 6:
                sfr sfrVar = (sfr) this.c;
                d9n d9nVar6 = d9n.a;
                boolean z7 = this.b;
                if (!z7) {
                    hm5.M(obj);
                    evz evzVar = new evz(new m441(new clo(sfrVar, irtVar, (byte) 10)), new yz0(4, (lnm) null, (byte) 1), (byte) 11);
                    fdd fddVar4 = new fdd(sfrVar, (byte) 26);
                    this.b = true;
                    if (evzVar.collect(fddVar4, this) == d9nVar6) {
                        return d9nVar6;
                    }
                } else {
                    if (!z7) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 7:
                yfr yfrVar = (yfr) this.c;
                d9n d9nVar7 = d9n.a;
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
                qer qerVar = new qer(yoi1.g(yfrVar.d.j()), yfrVar, (byte) 1);
                this.b = true;
                Object objI = b5p1.i(qerVar, this);
                return objI == d9nVar7 ? d9nVar7 : objI;
            case 8:
                d9n d9nVar8 = d9n.a;
                boolean z9 = this.b;
                if (!z9) {
                    hm5.M(obj);
                    hir hirVar = (hir) this.c;
                    mr20 mr20Var2 = hirVar.g;
                    fdd fddVar5 = new fdd(hirVar, b2);
                    this.b = true;
                    if (mr20Var2.collect(fddVar5, this) == d9nVar8) {
                        return d9nVar8;
                    }
                } else {
                    if (!z9) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 9:
                rih1 rih1Var2 = rih1.a;
                d9n d9nVar9 = d9n.a;
                boolean z10 = this.b;
                if (!z10) {
                    hm5.M(obj);
                    njr njrVar = (njr) this.c;
                    this.b = true;
                    SimpleDateFormat simpleDateFormat = njr.j;
                    Object objCollect2 = z4p1.v(rqt0.u(new wef(yoi1.g(njrVar.c.Y), (byte) 20)), 1).collect(new cff(njrVar, (byte) 4), this);
                    if (objCollect2 != d9nVar9) {
                        objCollect2 = rih1Var2;
                    }
                    if (objCollect2 == d9nVar9) {
                        return d9nVar9;
                    }
                } else {
                    if (!z10) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var2;
            case 10:
                vkr vkrVar = (vkr) this.c;
                rih1 rih1Var3 = rih1.a;
                d9n d9nVar10 = d9n.a;
                boolean z11 = this.b;
                if (!z11) {
                    hm5.M(obj);
                    mr20 mr20VarCallStream = vkrVar.b.a.callStream("spotify.connect.discovery.cast.esperanto.proto.CastService", "SubMessage", Empty.n());
                    skr skrVar = new skr(vkrVar, (byte) 0);
                    this.b = true;
                    Object objCollect3 = mr20VarCallStream.collect(new y3e(new l6z(skrVar, (byte) 7), (byte) 1), this);
                    if (objCollect3 != d9nVar10) {
                        objCollect3 = rih1Var3;
                    }
                    if (objCollect3 != d9nVar10) {
                        objCollect3 = rih1Var3;
                    }
                    if (objCollect3 == d9nVar10) {
                        return d9nVar10;
                    }
                } else {
                    if (!z11) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var3;
            case 11:
                d9n d9nVar11 = d9n.a;
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
                c3l c3lVar = (y2l) ((inr) this.c).a.get();
                this.b = true;
                c3l c3lVar2 = c3lVar;
                Object objY = fn31.Y(c3lVar2.b, new awe(c3lVar2, irtVar, (byte) 14), this);
                return objY == d9nVar11 ? d9nVar11 : objY;
            case 12:
                d9n d9nVar12 = d9n.a;
                boolean z13 = this.b;
                if (!z13) {
                    hm5.M(obj);
                    qor qorVar = (qor) this.c;
                    xe01 xe01Var = qorVar.d.b;
                    skr skrVar2 = new skr(qorVar, (byte) 2);
                    this.b = true;
                    if (xe01Var.a.collect(skrVar2, this) == d9nVar12) {
                        return d9nVar12;
                    }
                } else {
                    if (!z13) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                jah.d();
                return null;
            case 13:
                rih1 rih1Var4 = rih1.a;
                tor torVar = (tor) this.c;
                d9n d9nVar13 = d9n.a;
                boolean z14 = this.b;
                if (!z14) {
                    hm5.M(obj);
                    bpb1 bpb1VarB = torVar.a.i;
                    if (bpb1VarB == null) {
                        bpb1VarB = gio1.b(z6x.a);
                    }
                    mr20 mr20VarG = yoi1.g(torVar.b.j());
                    al3 al3Var = new al3(3, (lnm) null, (byte) 1);
                    skr skrVar3 = new skr(torVar, (byte) 3);
                    this.b = true;
                    Object objS = fc11.s(vrl.c, this, skrVar3, new ekv(al3Var, (lnm) null), new mr20[]{bpb1VarB, mr20VarG});
                    if (objS != d9nVar13) {
                        objS = rih1Var4;
                    }
                    if (objS == d9nVar13) {
                        return d9nVar13;
                    }
                } else {
                    if (!z14) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var4;
            case 14:
                fpr fprVar = (fpr) this.c;
                d9n d9nVar14 = d9n.a;
                boolean z15 = this.b;
                if (!z15) {
                    hm5.M(obj);
                    mr20 mr20VarU2 = rqt0.u(h5p1.s(yoi1.g(((c3s) fprVar.a.get()).e), ((iur) fprVar.b.get()).b, new mt(fprVar.g, (byte) 8), new dpr(4, null, (byte) 0)));
                    skr skrVar4 = new skr(fprVar, (byte) 4);
                    this.b = true;
                    if (mr20VarU2.collect(skrVar4, this) == d9nVar14) {
                        return d9nVar14;
                    }
                } else {
                    if (!z15) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 15:
                itr itrVar = (itr) this.c;
                d9n d9nVar15 = d9n.a;
                boolean z16 = this.b;
                if (!z16) {
                    hm5.M(obj);
                    n811 n811Var = new n811();
                    n811 n811Var2 = new n811();
                    n811 n811Var3 = new n811();
                    mr20 mr20VarC = itrVar.O0.c();
                    u60 u60Var = new u60(n811Var, n811Var2, n811Var3, itrVar, (byte) 16);
                    this.b = true;
                    if (mr20VarC.collect(u60Var, this) == d9nVar15) {
                        return d9nVar15;
                    }
                } else {
                    if (!z16) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 16:
                mtr mtrVar = (mtr) this.c;
                d9n d9nVar16 = d9n.a;
                boolean z17 = this.b;
                if (!z17) {
                    hm5.M(obj);
                    ezc ezcVarV = eth.V(mtrVar.a);
                    skr skrVar5 = new skr(mtrVar, (byte) 5);
                    this.b = true;
                    if (ezcVarV.collect(skrVar5, this) == d9nVar16) {
                        return d9nVar16;
                    }
                } else {
                    if (!z17) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 17:
                d9n d9nVar17 = d9n.a;
                boolean z18 = this.b;
                if (!z18) {
                    hm5.M(obj);
                    f1n0 f1n0Var = (f1n0) ((uwl) this.c).f;
                    this.b = true;
                    if (f1n0Var.a(this) == d9nVar17) {
                        return d9nVar17;
                    }
                } else {
                    if (!z18) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                rih1 rih1Var5 = rih1.a;
                tcs tcsVar = (tcs) this.c;
                d9n d9nVar18 = d9n.a;
                boolean z19 = this.b;
                if (!z19) {
                    hm5.M(obj);
                    long jE = tcsVar.i.e();
                    Flowable flowable = tcsVar.i1;
                    vbm[] vbmVarArr = q601.a;
                    kge kgeVar = new kge(flowable);
                    this.b = true;
                    Object objO = rc2.O(jE, new i2p0(kgeVar, (lnm) null, (byte) 27), this);
                    if (objO != d9nVar18) {
                        objO = rih1Var5;
                    }
                    if (objO == d9nVar18) {
                        return d9nVar18;
                    }
                } else {
                    if (!z19) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                tcsVar.d();
                return rih1Var5;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                d9n d9nVar19 = d9n.a;
                boolean z20 = this.b;
                if (z20) {
                    if (z20) {
                        hm5.M(obj);
                        return rih1.a;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                cks cksVar = (cks) this.c;
                e4t e4tVar = cksVar.t;
                ViewGroup viewGroupB = ((l1g0) cksVar.g.get()).b();
                this.b = true;
                e4tVar.a(viewGroupB, this);
                return d9nVar19;
            case 20:
                hks hksVar = (hks) this.c;
                d9n d9nVar20 = d9n.a;
                boolean z21 = this.b;
                if (!z21) {
                    hm5.M(obj);
                    ezc ezcVarF = h4p1.f(new hl0(hksVar, false, (lnm) null));
                    skr skrVar6 = new skr(hksVar, (byte) 11);
                    this.b = true;
                    if (ezcVarF.collect(skrVar6, this) == d9nVar20) {
                        return d9nVar20;
                    }
                } else {
                    if (!z21) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 21:
                jks jksVar = (jks) this.c;
                d9n d9nVar21 = d9n.a;
                boolean z22 = this.b;
                if (!z22) {
                    hm5.M(obj);
                    mr20 mr20VarU3 = rqt0.u(hu20.d(new mr20[]{h4p1.f(new n5s(jksVar, (lnm) null, (byte) 7)), jksVar.c.e()}));
                    skr skrVar7 = new skr(jksVar, (byte) 12);
                    this.b = true;
                    if (mr20VarU3.collect(skrVar7, this) == d9nVar21) {
                        return d9nVar21;
                    }
                } else {
                    if (!z22) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 22:
                d9n d9nVar22 = d9n.a;
                boolean z23 = this.b;
                if (z23) {
                    if (z23) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                q59 q59Var = (q59) ((mxr) this.c).b;
                this.b = true;
                Object objP = q59Var.p(this);
                return objP == d9nVar22 ? d9nVar22 : objP;
            case 23:
                d9n d9nVar23 = d9n.a;
                boolean z24 = this.b;
                if (!z24) {
                    hm5.M(obj);
                    i94 i94Var = (lxg) this.c;
                    this.b = true;
                    ohd ohdVar2 = new ohd(1, aym.t(this));
                    ohdVar2.t();
                    i94Var.d(new c4t(ohdVar2));
                    if (ohdVar2.r() == d9nVar23) {
                        return d9nVar23;
                    }
                } else {
                    if (!z24) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 24:
                d9n d9nVar24 = d9n.a;
                boolean z25 = this.b;
                if (!z25) {
                    hm5.M(obj);
                    rhh rhhVar = (rhh) this.c;
                    this.b = true;
                    if (rhhVar.invoke(this) == d9nVar24) {
                        return d9nVar24;
                    }
                } else {
                    if (!z25) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 25:
                d9n d9nVar25 = d9n.a;
                boolean z26 = this.b;
                if (!z26) {
                    hm5.M(obj);
                    rhh rhhVar2 = (rhh) this.c;
                    this.b = true;
                    if (rhhVar2.invoke(this) == d9nVar25) {
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
            case 26:
                rih1 rih1Var6 = rih1.a;
                p9t p9tVar = (p9t) this.c;
                d9n d9nVar26 = d9n.a;
                boolean z27 = this.b;
                if (!z27) {
                    hm5.M(obj);
                    jge jgeVarE = hu20.e(z4p1.F(new i0h(new pzs(rqt0.u(new i0h(new x72(p9tVar.b.d(), (byte) 16), (byte) 20)), p9tVar, (byte) 1), (byte) 21), 1), new uls((lnm) irtVar, (Object) p9tVar, b4));
                    skr skrVar8 = new skr(p9tVar, (byte) 15);
                    this.b = true;
                    Object objCollect4 = jgeVarE.collect(new k9t(skrVar8, (byte) 3), this);
                    if (objCollect4 != d9nVar26) {
                        objCollect4 = rih1Var6;
                    }
                    if (objCollect4 == d9nVar26) {
                        return d9nVar26;
                    }
                } else {
                    if (!z27) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var6;
            case 27:
                tp7 tp7Var = (tp7) this.c;
                d9n d9nVar27 = d9n.a;
                boolean z28 = this.b;
                if (!z28) {
                    hm5.M(obj);
                    FlowableFilter flowableFilter = (FlowableFilter) tp7Var.e;
                    vbm[] vbmVarArr2 = q601.a;
                    plu pluVarW = rqt0.w(new i0h(new xy0(new kge(flowableFilter), (byte) 16), (byte) 24), zlt.O0, rqt0.b);
                    skr skrVar9 = new skr(tp7Var, (byte) 16);
                    this.b = true;
                    if (pluVarW.collect(skrVar9, this) == d9nVar27) {
                        return d9nVar27;
                    }
                } else {
                    if (!z28) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 28:
                grt grtVar = (grt) this.c;
                d9n d9nVar28 = d9n.a;
                boolean z29 = this.b;
                if (!z29) {
                    hm5.M(obj);
                    ve01 ve01VarG = d5p1.g(grtVar.d.a);
                    skr skrVar10 = new skr(grtVar, (byte) 17);
                    this.b = true;
                    if (ve01VarG.a.collect(skrVar10, this) == d9nVar28) {
                        return d9nVar28;
                    }
                } else {
                    if (!z29) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            default:
                mrt mrtVar = (mrt) this.c;
                d9n d9nVar29 = d9n.a;
                boolean z30 = this.b;
                if (!z30) {
                    hm5.M(obj);
                    gtt gttVar = mrtVar.a;
                    this.b = true;
                    objC = gtt.c(gttVar, this, 3);
                    if (objC == d9nVar29) {
                        return d9nVar29;
                    }
                } else {
                    if (!z30) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objC = obj;
                }
                ctt cttVar = (ctt) objC;
                gtt gttVar2 = mrtVar.a;
                itt ittVar = itt.e;
                htt httVarN = DeviceLocationServiceOuterClass.DeviceLocationResponse.n();
                if ((cttVar instanceof btt) || (cttVar instanceof att)) {
                    irt irtVar2 = gttVar2.d.a;
                    if (irtVar2 != null && gttVar2.c.b() - irtVar2.b() < g5d0.a(1)) {
                        irtVar = irtVar2;
                    }
                    if (irtVar != null) {
                        httVarN.q(irtVar.a);
                        httVarN.r(irtVar.b);
                        httVarN.n(irtVar.c);
                        httVarN.t(irtVar.d);
                        ittVar = itt.b;
                    }
                } else if (cttVar instanceof zst) {
                    ittVar = itt.d;
                } else if (!(cttVar instanceof wst)) {
                    if (!(cttVar instanceof yst) && !(cttVar instanceof xst) && !(cttVar instanceof vst) && !(cttVar instanceof ust)) {
                        eg.o();
                        return null;
                    }
                    ittVar = itt.c;
                }
                httVarN.s(ittVar);
                return httVarN.build();
        }
    }
}
