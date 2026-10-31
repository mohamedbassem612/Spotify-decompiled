package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.messages.WorkoutSessionStarted;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class l2w extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l2w(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                return new l2w(this.c, obj3, obj2, lnmVar, (byte) 0);
            case 1:
                return new l2w(this.c, obj3, obj2, lnmVar, (byte) 1);
            case 2:
                l2w l2wVar = new l2w(obj3, obj2, lnmVar, (byte) 2);
                l2wVar.c = obj;
                return l2wVar;
            case 3:
                l2w l2wVar2 = new l2w(obj3, lnmVar, obj2, (byte) 3);
                l2wVar2.c = obj;
                return l2wVar2;
            case 4:
                l2w l2wVar3 = new l2w(obj3, lnmVar, obj2, (byte) 4);
                l2wVar3.c = obj;
                return l2wVar3;
            case 5:
                return new l2w(this.c, obj3, obj2, lnmVar, (byte) 5);
            case 6:
                return new l2w(this.c, obj3, obj2, lnmVar, (byte) 6);
            case 7:
                l2w l2wVar4 = new l2w(obj3, lnmVar, obj2, (byte) 7);
                l2wVar4.c = obj;
                return l2wVar4;
            case 8:
                return new l2w(this.c, obj3, obj2, lnmVar, (byte) 8);
            case 9:
                return new l2w(this.c, obj3, obj2, lnmVar, (byte) 9);
            case 10:
                return new l2w(this.c, obj3, obj2, lnmVar, (byte) 10);
            case 11:
                return new l2w(this.c, obj3, obj2, lnmVar, (byte) 11);
            case 12:
                l2w l2wVar5 = new l2w(obj3, obj2, lnmVar, (byte) 12);
                l2wVar5.c = obj;
                return l2wVar5;
            case 13:
                l2w l2wVar6 = new l2w(obj3, obj2, lnmVar, (byte) 13);
                l2wVar6.c = obj;
                return l2wVar6;
            case 14:
                l2w l2wVar7 = new l2w(obj3, lnmVar, obj2, (byte) 14);
                l2wVar7.c = obj;
                return l2wVar7;
            case 15:
                l2w l2wVar8 = new l2w(obj3, obj2, lnmVar, (byte) 15);
                l2wVar8.c = obj;
                return l2wVar8;
            case 16:
                return new l2w(this.c, obj3, obj2, lnmVar, (byte) 16);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new l2w(this.c, obj3, obj2, lnmVar, (byte) 17);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new l2w(this.c, obj3, obj2, lnmVar, (byte) 18);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new l2w(this.c, obj3, obj2, lnmVar, (byte) 19);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new l2w(this.c, obj3, obj2, lnmVar, (byte) 20);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new l2w(this.c, obj3, obj2, lnmVar, (byte) 21);
            case 22:
                l2w l2wVar9 = new l2w(obj3, obj2, lnmVar, (byte) 22);
                l2wVar9.c = obj;
                return l2wVar9;
            case 23:
                return new l2w(this.c, obj3, obj2, lnmVar, (byte) 23);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new l2w(this.c, obj3, obj2, lnmVar, (byte) 24);
            case 25:
                return new l2w((y7e1) this.c, obj2, (iu30) obj3, lnmVar, (byte) 25);
            case 26:
                return new l2w((y7e1) this.c, obj2, (iu30) obj3, lnmVar, (byte) 26);
            case 27:
                return new l2w(this.c, obj3, obj2, lnmVar, (byte) 27);
            case 28:
                l2w l2wVar10 = new l2w(obj3, obj2, lnmVar, (byte) 28);
                l2wVar10.c = obj;
                return l2wVar10;
            default:
                return new l2w(this.c, obj3, obj2, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((k1r) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:164:0x0378  */
    /* JADX WARN: Code duplicated, block: B:392:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x01ea  */
    public final Object invokeSuspend(Object obj) {
        Object objC;
        t1m1 t1m1Var;
        Object objI;
        Object objE;
        Object objE2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        d9n d9nVar = d9n.a;
        Integer num = null;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                l811 l811VarY = l1d.y(obj);
                l811VarY.a = true;
                m441 m441VarQ = rwq.q(new tr1((y7e1) this.c, (byte) 21));
                wem wemVar = new wem((iu30) obj3, l811VarY, (jut) obj2, (byte) 9);
                this.b = true;
                return m441VarQ.collect(wemVar, this) == d9nVar ? d9nVar : rih1Var;
            case 1:
                s7w s7wVar = (s7w) this.c;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.b = true;
                    if (f1n0.f(s7wVar.e, ((bxn) obj3).a, (tv80) obj2, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                s7wVar.c.a(ixb.c);
                return rih1Var;
            case 2:
                c9n c9nVar = (c9n) this.c;
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                List list = (List) obj3;
                ezw ezwVar = (ezw) obj2;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(fn31.q(c9nVar, (o8n) null, 0, new ymu(ezwVar, (hj0) it.next(), (lnm) null, (byte) 16), 3));
                }
                this.c = null;
                this.b = true;
                Object objU = o1p1.u(arrayList, this);
                return objU == d9nVar ? d9nVar : objU;
            case 3:
                vr20 vr20Var = (vr20) this.c;
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                t1x t1xVar = new t1x(vr20Var, (z1x) obj2, (byte) 0);
                this.c = null;
                this.b = true;
                return ((kge) obj3).collect(t1xVar, this) == d9nVar ? d9nVar : rih1Var;
            case 4:
                vr20 vr20Var2 = (vr20) this.c;
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                t1x t1xVar2 = new t1x(vr20Var2, (z1x) obj2, (byte) 1);
                this.c = null;
                this.b = true;
                return ((ve1) obj3).collect(t1xVar2, this) == d9nVar ? d9nVar : rih1Var;
            case 5:
                boolean z6 = this.b;
                try {
                    if (!z6) {
                        hm5.M(obj);
                        vy71 vy71Var = (vy71) this.c;
                        this.b = true;
                        if (vy71Var.h(this) == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z6) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    Function0 function0 = (Function0) ((q811) obj3).a;
                    if (function0 == null) {
                        return rih1Var;
                    }
                    function0.invoke();
                    return rih1Var;
                } catch (CancellationException e) {
                    ((scx) obj2).a.setValue(Boolean.FALSE);
                    throw e;
                }
            case 6:
                boolean z7 = this.b;
                if (z7) {
                    if (z7) {
                        hm5.M(obj);
                        objC = obj;
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                bs91 bs91Var = (bs91) this.c;
                String str = ((bu91) obj3).b;
                this.b = true;
                objC = bs91.c(bs91Var, str, this, 14);
                if (objC == d9nVar) {
                    return d9nVar;
                }
                int iOrdinal = ((zt91) objC).ordinal();
                if (iOrdinal == 0) {
                    ((Function0) obj2).invoke();
                    return rih1Var;
                }
                if (iOrdinal == 1) {
                    return rih1Var;
                }
                eg.o();
                return null;
            case 7:
                boolean z8 = this.b;
                if (z8) {
                    if (!z8) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    return rih1Var;
                }
                hm5.M(obj);
                vr20 vr20Var3 = (vr20) this.c;
                ij01 ij01Var = (ij01) obj2;
                this.c = null;
                this.b = true;
                return ij01Var.h((d4y) obj3, vr20Var3, this) == d9nVar ? d9nVar : rih1Var;
            case 8:
                cir0 cir0Var = (cir0) obj3;
                boolean z9 = this.b;
                if (z9) {
                    if (z9) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                rtm0 rtm0Var = (rtm0) this.c;
                if (rtm0Var == null) {
                    return rih1Var;
                }
                x8c0 lifecycle = cir0Var.e().getLifecycle();
                mr20 mr20VarF = cir0Var.f();
                d7v d7vVar = new d7v((ven0) obj2, (byte) 13);
                this.b = true;
                Object objT = z8p1.t(lifecycle, w8c0.d, new wkk0(mr20VarF, d7vVar, rtm0Var, (lnm) null, (byte) 23), this);
                if (objT != d9nVar) {
                    objT = rih1Var;
                }
                return objT == d9nVar ? d9nVar : rih1Var;
            case 9:
                boolean z10 = this.b;
                if (z10) {
                    if (z10) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                bpb1 bpb1Var = ((d0r) this.c).c(sqy.t.a((String) obj3)).a().a;
                oqy oqyVar = new oqy((kdn0) obj2, (byte) 0);
                this.b = true;
                bpb1Var.collect(new w0x(oqyVar, (byte) 18), this);
                return d9nVar;
            case 10:
                wzl1 wzl1Var = (wzl1) obj3;
                yjq yjqVar = (yjq) this.c;
                boolean z11 = this.b;
                if (!z11) {
                    hm5.M(obj);
                    c38 c38Var = new c38((zxh) obj2, (lnm) null, (byte) 3);
                    this.b = true;
                    if (rc2.O(1500L, c38Var, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z11) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                v1m1 v1m1VarG = ((vi11) yjqVar.d).G(wzl1Var.a);
                if (v1m1VarG != null && (t1m1Var = v1m1VarG.a) != null) {
                    num = t1m1Var.a;
                }
                ((vi11) yjqVar.d).p(wzl1Var.a);
                yjqVar.z(wzl1Var, num);
                return rih1Var;
            case 11:
                xzl1 xzl1Var = (xzl1) obj3;
                String str2 = xzl1Var.a;
                yjq yjqVar2 = (yjq) this.c;
                boolean z12 = this.b;
                if (!z12) {
                    hm5.M(obj);
                    vi11 vi11Var = (vi11) yjqVar2.d;
                    this.b = true;
                    objI = vi11Var.i(str2, this);
                    if (objI == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z12) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objI = obj;
                }
                v1m1 v1m1Var = (v1m1) objI;
                t1m1 t1m1Var2 = v1m1Var.a;
                u1m1 u1m1VarN = WorkoutSessionStarted.n();
                u1m1VarN.x(str2);
                u1m1VarN.s(xzl1Var.b);
                u1m1VarN.z(xzl1Var.c);
                Boolean bool = v1m1Var.b;
                if (bool != null) {
                    u1m1VarN.r(bool.booleanValue());
                }
                Integer num2 = t1m1Var2.a;
                if (num2 != null) {
                    u1m1VarN.w(num2.intValue());
                }
                gzl1 gzl1Var = t1m1Var2.b;
                if (gzl1Var != null) {
                    u1m1VarN.t(gzl1Var.a);
                }
                Boolean bool2 = t1m1Var2.c;
                if (bool2 != null) {
                    u1m1VarN.q(bool2.booleanValue());
                }
                Boolean bool3 = t1m1Var2.d;
                if (bool3 != null) {
                    u1m1VarN.n(bool3.booleanValue());
                }
                Integer num3 = t1m1Var2.e;
                if (num3 != null) {
                    u1m1VarN.y(num3.intValue());
                }
                Boolean bool4 = t1m1Var2.f;
                if (bool4 != null) {
                    u1m1VarN.u(bool4.booleanValue());
                }
                String str3 = v1m1Var.c;
                if (str3 != null) {
                    u1m1VarN.v(str3);
                }
                WorkoutSessionStarted workoutSessionStartedBuild = u1m1VarN.build();
                t2j0 t2j0Var = (t2j0) yjqVar2.c;
                workoutSessionStartedBuild.getClass();
                t2j0Var.a(workoutSessionStartedBuild);
                ((ayh) obj2).m0(rih1Var);
                return rih1Var;
            case 12:
                boolean z13 = this.b;
                if (!z13) {
                    hm5.M(obj);
                    vr20 vr20Var4 = (vr20) this.c;
                    this.c = null;
                    this.b = true;
                    return ((db3) obj3).invoke(vr20Var4, obj2, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (!z13) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                return rih1Var;
            case 13:
                boolean z14 = this.b;
                if (!z14) {
                    hm5.M(obj);
                    vr20 vr20Var5 = (vr20) this.c;
                    this.c = null;
                    this.b = true;
                    return ((gg00) obj3).invoke(vr20Var5, obj2, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (!z14) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                return rih1Var;
            case 14:
                boolean z15 = this.b;
                if (!z15) {
                    hm5.M(obj);
                    u9u0 u9u0Var = ((ig00) obj2).b;
                    this.c = null;
                    this.b = true;
                    d3p1 d3p1Var = ((qf00) obj3).e;
                    if (d3p1Var instanceof v8u0) {
                        objE = u9u0Var.c(((v8u0) d3p1Var).c, this);
                        if (objE != d9nVar) {
                            objE = rih1Var;
                        }
                    } else if (d3p1Var instanceof x8u0) {
                        x8u0 x8u0Var = (x8u0) d3p1Var;
                        objE = u9u0Var.d(x8u0Var.c, x8u0Var.d, this);
                        if (objE != d9nVar) {
                            objE = rih1Var;
                        }
                    } else if (d3p1Var instanceof z8u0) {
                        objE = u9u0Var.e(((z8u0) d3p1Var).c, this);
                        if (objE != d9nVar) {
                            objE = rih1Var;
                        }
                    } else {
                        eg.o();
                    }
                    if (objE != d9nVar) {
                        objE = rih1Var;
                    }
                    return objE == d9nVar ? d9nVar : rih1Var;
                }
                if (z15) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                boolean z16 = this.b;
                if (!z16) {
                    hm5.M(obj);
                    vr20 vr20Var6 = (vr20) this.c;
                    this.c = null;
                    this.b = true;
                    return ((hg00) obj3).invoke(vr20Var6, obj2, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (!z16) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                return rih1Var;
            case 16:
                ven0 ven0Var = (ven0) obj2;
                boolean z17 = this.b;
                if (!z17) {
                    hm5.M(obj);
                    if (((Boolean) ven0Var.getValue()).booleanValue()) {
                        return rih1Var;
                    }
                    ven0Var.setValue(Boolean.TRUE);
                    o95 o95Var = (o95) this.c;
                    Float f = new Float(1.0f);
                    n8b1 n8b1VarL0 = irn1.l0(0.75f, 200.0f, (Object) null, 4);
                    this.b = true;
                    if (o95.b(o95Var, f, n8b1VarL0, (Float) null, (iu30) null, this, 12) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z17) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ((Function0) obj3).invoke();
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                String str4 = (String) obj2;
                boolean z18 = this.b;
                if (z18) {
                    if (z18) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Single singleFirstOrError = ((uu00) ((jl00) this.c).b).b(new oi((String) obj3, false, new kq00(str4, (byte) 2))).filter(new k9p1(str4, (byte) 9)).firstOrError();
                this.b = true;
                Object objJ = fc11.j(singleFirstOrError, this);
                return objJ == d9nVar ? d9nVar : objJ;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
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
                Single singleF = g510.f(((y210) this.c).a, y210.c, (String) obj3, (w7h1) null, ((tv80) obj2).a, 20);
                this.b = true;
                Object objJ2 = fc11.j(singleF, this);
                return objJ2 == d9nVar ? d9nVar : objJ2;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                boolean z20 = this.b;
                if (z20) {
                    if (z20) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                rsc0 rsc0Var = ((q410) this.c).b;
                this.b = true;
                rsc0 rsc0Var2 = rsc0Var;
                Object objH = c921.H(rsc0Var2.c, new asc0(rsc0Var2, (String) obj3, (String) obj2, null, (byte) 1), this);
                return objH == d9nVar ? d9nVar : objH;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
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
                rsc0 rsc0Var3 = ((q410) this.c).b;
                this.b = true;
                Object objF = rsc0Var3.f((String) obj3, (trc0) obj2, this);
                return objF == d9nVar ? d9nVar : objF;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                boolean z22 = this.b;
                if (z22) {
                    if (z22) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                r5s r5sVar = ((g610) this.c).e;
                String str5 = (String) obj3;
                String str6 = (String) obj2;
                this.b = true;
                if (str6.length() > 0 && !u890.j(str5, str6)) {
                    objE2 = r5sVar.a.e(str5, str6, "", this);
                    if (objE2 != d9nVar) {
                    }
                    if (objE2 == d9nVar) {
                        return d9nVar;
                    }
                    return rih1Var;
                }
                n57.e("banInContext should be used for banning on a given context, if you need a global ban, use banGlobally instead, itemUri " + str5 + ",contextUri: " + str6);
                objE2 = rih1Var;
                if (objE2 == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            case 22:
                k1r k1rVar = (k1r) this.c;
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
                this.c = null;
                this.b = true;
                Object objA = ((yc10) obj3).a((String) obj2, k1rVar, this);
                return objA == d9nVar ? d9nVar : objA;
            case 23:
                boolean z24 = this.b;
                if (z24) {
                    if (z24) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ve01 ve01Var = (ve01) this.c;
                u5z u5zVar = new u5z((String) obj3, (mr10) obj2, (byte) 10);
                this.b = true;
                return ve01Var.a.collect(u5zVar, this) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                boolean z25 = this.b;
                if (z25) {
                    if (z25) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ve01 ve01Var2 = (ve01) this.c;
                u5z u5zVar2 = new u5z((hr10) obj3, (mr10) obj2, (byte) 11);
                this.b = true;
                return ve01Var2.a.collect(u5zVar2, this) == d9nVar ? d9nVar : rih1Var;
            case 25:
                boolean z26 = this.b;
                if (z26) {
                    if (z26) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarU = rqt0.u(rwq.q(new tr1((y7e1) this.c, (byte) 23)));
                piu piuVar = new piu((nho0) obj2, (iu30) obj3, null, (byte) 15);
                this.b = true;
                return l4p1.q(mr20VarU, piuVar, this) == d9nVar ? d9nVar : rih1Var;
            case 26:
                boolean z27 = this.b;
                if (z27) {
                    if (z27) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarU2 = rqt0.u(rwq.q(new tr1((y7e1) this.c, (byte) 24)));
                u5z u5zVar3 = new u5z((Function0) obj2, (iu30) obj3, (byte) 12);
                this.b = true;
                return mr20VarU2.collect(u5zVar3, this) == d9nVar ? d9nVar : rih1Var;
            case 27:
                boolean z28 = this.b;
                if (z28) {
                    if (z28) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20Var = (mr20) ((iu30) ((qn) this.c).b).invoke(new any((bpb1) obj3, (byte) 18));
                h8c h8cVar = new h8c((Consumer) obj2, (byte) 3);
                this.b = true;
                return mr20Var.collect(h8cVar, this) == d9nVar ? d9nVar : rih1Var;
            case 28:
                c9n c9nVar2 = (c9n) this.c;
                boolean z29 = this.b;
                if (!z29) {
                    hm5.M(obj);
                    this.c = null;
                    this.b = true;
                    return ((xu30) obj3).invoke(c9nVar2, (vr20) obj2, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z29) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z30 = this.b;
                if (!z30) {
                    hm5.M(obj);
                    this.b = true;
                    if (((idn0) this.c).b((ty20) obj3, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z30) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                qku qkuVar = (qku) obj2;
                if (qkuVar == null) {
                    return rih1Var;
                }
                qkuVar.dispose();
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l2w(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l2w(Object obj, lnm lnmVar, Object obj2, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l2w(y7e1 y7e1Var, Object obj, iu30 iu30Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = y7e1Var;
        this.e = obj;
        this.d = iu30Var;
    }
}
