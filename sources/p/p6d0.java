package p;

import android.app.Activity;
import com.google.protobuf.Empty;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class p6d0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6d0(boolean z, sdd0 sdd0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 1;
        this.b = z;
        this.c = sdd0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return new p6d0(obj2, lnmVar, (byte) 0);
            case 1:
                return new p6d0(this.b, (sdd0) obj2, lnmVar);
            case 2:
                return new p6d0(obj2, lnmVar, (byte) 2);
            case 3:
                return new p6d0(obj2, lnmVar, (byte) 3);
            case 4:
                return new p6d0(obj2, lnmVar, (byte) 4);
            case 5:
                return new p6d0(obj2, lnmVar, (byte) 5);
            case 6:
                return new p6d0(obj2, lnmVar, (byte) 6);
            case 7:
                return new p6d0(obj2, lnmVar, (byte) 7);
            case 8:
                return new p6d0(obj2, lnmVar, (byte) 8);
            case 9:
                return new p6d0(obj2, lnmVar, (byte) 9);
            case 10:
                return new p6d0(obj2, lnmVar, (byte) 10);
            case 11:
                return new p6d0(obj2, lnmVar, (byte) 11);
            case 12:
                return new p6d0(obj2, lnmVar, (byte) 12);
            case 13:
                return new p6d0(obj2, lnmVar, (byte) 13);
            case 14:
                return new p6d0(obj2, lnmVar, (byte) 14);
            case 15:
                return new p6d0(obj2, lnmVar, (byte) 15);
            case 16:
                return new p6d0(obj2, lnmVar, (byte) 16);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new p6d0(obj2, lnmVar, (byte) 17);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new p6d0(obj2, lnmVar, (byte) 18);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new p6d0(obj2, lnmVar, (byte) 19);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new p6d0(obj2, lnmVar, (byte) 20);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new p6d0(obj2, lnmVar, (byte) 21);
            case 22:
                return new p6d0(obj2, lnmVar, (byte) 22);
            case 23:
                return new p6d0(obj2, lnmVar, (byte) 23);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new p6d0(obj2, lnmVar, (byte) 24);
            case 25:
                return new p6d0(obj2, lnmVar, (byte) 25);
            case 26:
                return new p6d0(obj2, lnmVar, (byte) 26);
            case 27:
                return new p6d0(obj2, lnmVar, (byte) 27);
            case 28:
                return new p6d0(obj2, lnmVar, (byte) 28);
            default:
                return new p6d0(obj2, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9n.a;
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
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
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
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
                return create((uqo) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        Object objM;
        Object objF;
        Object objI;
        byte b = this.a;
        eye0 eye0Var = eye0.a;
        ql10 ql10Var = ql10.c;
        byte b2 = 14;
        byte b3 = 9;
        byte b4 = 15;
        byte b5 = 16;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj2 = this.c;
        lnm lnmVar = null;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    x6d0 x6d0Var = ((q6d0) obj2).d;
                    this.b = true;
                    return x6d0Var.b(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                hm5.M(obj);
                if (this.b) {
                    ((sdd0) obj2).l.a(ixb.b);
                }
                return rih1Var;
            case 2:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    Flowable flowable = ((ngd0) obj2).c;
                    this.b = true;
                    objM = u890.m(flowable, 1, this);
                    if (objM == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objM = obj;
                }
                return ((th61) objM).a;
            case 3:
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
                up90 up90Var = ((xqd0) obj2).b;
                this.b = true;
                Object objE = up90Var.e(mjb1.a, new ejb1(new kx91(new jx91(), new ix91())), this);
                return objE == d9nVar ? d9nVar : objE;
            case 4:
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
                mrd0 mrd0Var = (mrd0) obj2;
                mr20 mr20Var = mrd0Var.Y;
                e9c0 e9c0Var = new e9c0(mrd0Var, lnmVar, (byte) 10);
                this.b = true;
                Object objCollect = mr20Var.collect(new eu20(jrd0.a, e9c0Var, (byte) 1), this);
                if (objCollect != d9nVar) {
                    objCollect = rih1Var;
                }
                return objCollect == d9nVar ? d9nVar : rih1Var;
            case 5:
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
                b1e0 b1e0Var = (b1e0) obj2;
                Observable map = b1e0Var.a.b(b1e0Var.d).map(zz10.X);
                this.b = true;
                Object objL = fc11.l(map, 1, (Object) null, this);
                return objL == d9nVar ? d9nVar : objL;
            case 6:
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
                Observable observable = ((z3e0) obj2).c.a;
                this.b = true;
                Object objL2 = fc11.l(observable, 1, (Object) null, this);
                return objL2 == d9nVar ? d9nVar : objL2;
            case 7:
                boolean z7 = this.b;
                if (!z7) {
                    hm5.M(obj);
                    ak1 ak1Var = (ak1) obj2;
                    sxz0 sxz0Var = ak1Var.b;
                    frd1 frd1Var = ak1Var.c;
                    this.b = true;
                    objF = sxz0Var.f(frd1Var, this);
                    if (objF == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z7) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objF = obj;
                }
                return new w401(mqo1.A((List) objF));
            case 8:
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
                mr20 mr20VarIsEnabled = ((rde0) obj2).d.isEnabled();
                this.b = true;
                Object objK = b5p1.k(mr20VarIsEnabled, this);
                return objK == d9nVar ? d9nVar : objK;
            case 9:
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
                eee0 eee0Var = ((see0) obj2).c;
                Empty emptyBuild = Empty.o().build();
                this.b = true;
                return eee0Var.c(emptyBuild, this) == d9nVar ? d9nVar : rih1Var;
            case 10:
                boolean z10 = this.b;
                if (z10) {
                    if (!z10) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        hm5.M(obj);
                    }
                    return null;
                }
                hm5.M(obj);
                oie0 oie0Var = (oie0) obj2;
                ve01 ve01Var = oie0Var.d.a.d;
                p5b0 p5b0Var = new p5b0(oie0Var, (byte) 5);
                this.b = true;
                if (ve01Var.a.collect(p5b0Var, this) == d9nVar) {
                    return d9nVar;
                }
                jah.d();
                return null;
            case 11:
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
                lre0 lre0Var = ((kpe0) obj2).b;
                this.b = true;
                Object objA = lre0Var.a(this);
                return objA == d9nVar ? d9nVar : objA;
            case 12:
                fqe0 fqe0Var = (fqe0) obj2;
                Activity activity = fqe0Var.a;
                boolean z12 = this.b;
                if (!z12) {
                    hm5.M(obj);
                    activity.getWindow().getDecorView().announceForAccessibility(activity.getString(2131957660));
                    this.b = true;
                    return fqe0Var.a(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z12) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                dre0 dre0Var = (dre0) obj2;
                boolean z13 = this.b;
                if (z13) {
                    if (z13) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarU = rqt0.u(new x010(new s1g(f5p1.q(dre0Var.a.a.c("client-locked-state", ""), new fca0()), (byte) 5), dre0Var.b.a(), new cre0(3, (lnm) null, (byte) 0), (byte) 1));
                p5b0 p5b0Var2 = new p5b0(dre0Var, (byte) 6);
                this.b = true;
                return mr20VarU.collect(p5b0Var2, this) == d9nVar ? d9nVar : rih1Var;
            case 14:
                yse0 yse0Var = (yse0) obj2;
                boolean z14 = this.b;
                if (z14) {
                    if (z14) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarU2 = rqt0.u(new zx60(yoi1.g(Observable.defer(new o900(yse0Var, (byte) 1))), (byte) 16));
                p5b0 p5b0Var3 = new p5b0(yse0Var, (byte) 7);
                this.b = true;
                return mr20VarU2.collect(p5b0Var3, this) == d9nVar ? d9nVar : rih1Var;
            case 15:
                byp bypVar = (byp) obj2;
                boolean z15 = this.b;
                if (z15) {
                    if (z15) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ((lzn0) bypVar.b).e();
                hye0 hye0Var = (fye0) bypVar.c;
                this.b = true;
                Object objEmit = hye0Var.a.emit(eye0Var, this);
                if (objEmit != d9nVar) {
                    objEmit = rih1Var;
                }
                return objEmit == d9nVar ? d9nVar : rih1Var;
            case 16:
                o3e0 o3e0Var = (o3e0) obj2;
                boolean z16 = this.b;
                if (z16) {
                    if (z16) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ((lzn0) o3e0Var.b).e();
                hye0 hye0Var2 = (fye0) o3e0Var.c;
                this.b = true;
                Object objEmit2 = hye0Var2.a.emit(eye0Var, this);
                if (objEmit2 != d9nVar) {
                    objEmit2 = rih1Var;
                }
                return objEmit2 == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
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
                mnc0 mnc0Var = new mnc0(((p2f0) obj2).b, (byte) 28);
                this.b = true;
                Object objI2 = b5p1.i(mnc0Var, this);
                return objI2 == d9nVar ? d9nVar : objI2;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                boolean z18 = this.b;
                if (!z18) {
                    hm5.M(obj);
                    n4f0 n4f0Var = (n4f0) obj2;
                    nl51 nl51Var = n4f0Var.f;
                    String str = n4f0Var.d.a;
                    this.b = true;
                    if (nl51Var.p(str, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z18) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return Boolean.TRUE;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                i5f0 i5f0Var = (i5f0) obj2;
                boolean z19 = this.b;
                if (z19) {
                    if (z19) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarJ = o4p1.j(i5f0Var.O0.c(), 2, 2);
                p5b0 p5b0Var4 = new p5b0(i5f0Var, (byte) 8);
                this.b = true;
                return mr20VarJ.collect(p5b0Var4, this) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
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
                w9f0 w9f0Var = ((k9f0) obj2).a;
                this.b = true;
                w9f0Var.getClass();
                return w9f0Var.a(this) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
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
                zwz0 zwz0Var = ((ykf0) obj2).b;
                this.b = true;
                zwz0Var.getClass();
                Object objI3 = b5p1.i(zwz0Var.b(), this);
                return objI3 == d9nVar ? d9nVar : objI3;
            case 22:
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
                krh krhVar = ((pnf0) obj2).e;
                this.b = true;
                Object objB = krhVar.b(ql10Var, this);
                return objB == d9nVar ? d9nVar : objB;
            case 23:
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
                krh krhVar2 = ((itf0) obj2).d;
                this.b = true;
                Object objB2 = krhVar2.b(ql10Var, this);
                return objB2 == d9nVar ? d9nVar : objB2;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                ur00 ur00Var = (ur00) obj2;
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
                jge jgeVarE = hu20.e(new b8d0(rqt0.u(yoi1.g(((xvo) ur00Var.b).a(true))), ur00Var, b4), new zz90(lnmVar, ur00Var, b2));
                p5b0 p5b0Var5 = new p5b0(ur00Var, b3);
                this.b = true;
                return jgeVarE.collect(p5b0Var5, this) == d9nVar ? d9nVar : rih1Var;
            case 25:
                c3g0 c3g0Var = (c3g0) obj2;
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
                phd phdVarL = o4p1.l(new lt20(rqt0.u(new b8d0(hu20.e(rqt0.u(new ht20(yoi1.g(c3g0Var.a.e), new tfe0(c3g0Var, (lnm) null, (byte) 15))), new zz90(lnmVar, c3g0Var, b4)), c3g0Var, (byte) 18)), new ob00(3, (lnm) null, (byte) 8), (byte) 0));
                p5b0 p5b0Var6 = new p5b0(c3g0Var, (byte) 13);
                this.b = true;
                return phdVarL.collect(p5b0Var6, this) == d9nVar ? d9nVar : rih1Var;
            case 26:
                f3g0 f3g0Var = (f3g0) obj2;
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
                phd phdVarL2 = o4p1.l(new lt20(rqt0.u(hu20.e(rqt0.u(new ht20(yoi1.g(f3g0Var.a.e), new tfe0(f3g0Var, (lnm) null, (byte) 16))), new zz90(lnmVar, f3g0Var, b5))), new ob00(3, (lnm) null, (byte) 9), (byte) 0));
                p5b0 p5b0Var7 = new p5b0(f3g0Var, b2);
                this.b = true;
                return phdVarL2.collect(p5b0Var7, this) == d9nVar ? d9nVar : rih1Var;
            case 27:
                boolean z27 = this.b;
                if (!z27) {
                    hm5.M(obj);
                    this.b = true;
                    return ((s4g0) obj2).a(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z27) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 28:
                boolean z28 = this.b;
                if (z28) {
                    if (z28) {
                        hm5.M(obj);
                        objI = obj;
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                ve01 ve01Var2 = ((czr0) ((o3e0) obj2).c).d;
                this.b = true;
                objI = b5p1.i(ve01Var2, this);
                if (objI == d9nVar) {
                    return d9nVar;
                }
                gzr0 gzr0Var = (gzr0) objI;
                if (gzr0Var instanceof fzr0) {
                    return new xfg0(((fzr0) gzr0Var).a);
                }
                if (gzr0Var instanceof ezr0) {
                    return wfg0.a;
                }
                eg.o();
                return null;
            default:
                boolean z29 = this.b;
                if (z29) {
                    if (z29) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                be91 be91Var = ((qug0) obj2).b;
                jx0 jx0Var = jx0.d;
                this.b = true;
                Object objH = c921.H(be91Var.e, new ciw0(jx0Var, be91Var, lnmVar, (byte) 22), this);
                return objH == d9nVar ? d9nVar : objH;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p6d0(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
    }
}
