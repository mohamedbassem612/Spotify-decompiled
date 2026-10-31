package p;

import android.view.View;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformItemsRequest;
import com.spotify.concertcampaignview.v1.CampaignActionResponse;
import com.spotify.mobius.functions.Consumer;
import com.spotify.player.esperanto.proto.EsGetStateRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bag extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bag(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                return new bag((ajq0) this.c, (String) obj2, lnmVar, (byte) 0);
            case 1:
                return new bag((fie0) this.c, (kag) obj2, lnmVar, (byte) 1);
            case 2:
                return new bag((ajq0) this.c, (mag) obj2, lnmVar, (byte) 2);
            case 3:
                return new bag((qng) this.c, (String) obj2, lnmVar, (byte) 3);
            case 4:
                return new bag((ay8) this.c, (sng) obj2, lnmVar, (byte) 4);
            case 5:
                return new bag((xpg) this.c, (uha1) obj2, lnmVar, (byte) 5);
            case 6:
                return new bag((xe01) this.c, (tsg) obj2, lnmVar, (byte) 6);
            case 7:
                return new bag((mr20) this.c, (tsg) obj2, lnmVar, (byte) 7);
            case 8:
                return new bag((ajq0) this.c, (String) obj2, lnmVar, (byte) 8);
            case 9:
                bag bagVar = new bag((k0h) obj2, lnmVar, (byte) 9);
                bagVar.c = obj;
                return bagVar;
            case 10:
                return new bag((u9c) this.c, (ArrayList) obj2, lnmVar, (byte) 10);
            case 11:
                bag bagVar2 = new bag((qt20) obj2, lnmVar, (byte) 11);
                bagVar2.c = obj;
                return bagVar2;
            case 12:
                return new bag((c0c) this.c, (Consumer) obj2, lnmVar, (byte) 12);
            case 13:
                return new bag((nqh) this.c, (el30) obj2, lnmVar, (byte) 13);
            case 14:
                return new bag((jha1) this.c, (ajq0) obj2, lnmVar, (byte) 14);
            case 15:
                return new bag((pt) this.c, (swh) obj2, lnmVar, (byte) 15);
            case 16:
                return new bag((cce) this.c, (String) obj2, lnmVar, (byte) 16);
            case 17:
                return new bag((y7e1) this.c, (rb51) obj2, lnmVar, (byte) 17);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new bag((tw81) this.c, (iu30) obj2, lnmVar, (byte) 18);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new bag((tuj) this.c, (List) obj2, lnmVar, (byte) 19);
            case 20:
                return new bag((xxj) this.c, (Runnable) obj2, lnmVar, (byte) 20);
            case 21:
                bag bagVar3 = new bag((rgn0) obj2, lnmVar, (byte) 21);
                bagVar3.c = obj;
                return bagVar3;
            case 22:
                bag bagVar4 = new bag((z2k) obj2, lnmVar, (byte) 22);
                bagVar4.c = obj;
                return bagVar4;
            case 23:
                return new bag((g4k) obj2, lnmVar, (byte) 23);
            case 24:
                return new bag((k9k) this.c, (nak) obj2, lnmVar, (byte) 24);
            case 25:
                return new bag((d520) this.c, (ArrayList) obj2, lnmVar, (byte) 25);
            case 26:
                return new bag((tck) this.c, (String) obj2, lnmVar, (byte) 26);
            case 27:
                return new bag((bhk) this.c, (List) obj2, lnmVar, (byte) 27);
            case 28:
                bag bagVar5 = new bag((fu20) obj2, lnmVar, (byte) 28);
                bagVar5.c = obj;
                return bagVar5;
            default:
                bag bagVar6 = new bag((stk) obj2, lnmVar, (byte) 29);
                bagVar6.c = obj;
                return bagVar6;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invoke(Object obj, Object obj2) throws KotlinNothingValueException {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
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
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 17:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 20:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
            case 23:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 24:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((ztc) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        Object objC;
        Object objT;
        Object objU;
        Object objR;
        Iterator it;
        boolean z;
        Object objM;
        byte b = this.a;
        w5h w5hVar = w5h.f;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.d;
        rih1 rih1Var2 = d9n.a;
        byte b2 = 1;
        switch (b) {
            case 0:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.b = true;
                    return ((ajq0) this.c).z((String) obj2, this) == rih1Var2 ? rih1Var2 : rih1Var;
                }
                if (z2) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    if (!u890.j((fie0) this.c, die0.a)) {
                        return rih1Var;
                    }
                    gtt gttVar = ((kag) obj2).d;
                    this.b = true;
                    objC = gtt.c(gttVar, this, 3);
                    if (objC == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objC = obj;
                }
                if (!(((ctt) objC) instanceof att)) {
                    return rih1Var;
                }
                qjm1.a.toString();
                return rih1Var;
            case 2:
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
                j3v j3vVar = (j3v) ((ajq0) this.c).a;
                evz evzVar = new evz(((jn7) j3vVar.b).E(EsGetStateRequest.GetStateRequest.n()), j3vVar, (byte) 0);
                pid pidVar = new pid((mag) obj2, (lnm) null, (byte) 15);
                this.b = true;
                Object objJ = b5p1.j(evzVar, pidVar, this);
                return objJ == rih1Var2 ? rih1Var2 : objJ;
            case 3:
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    this.b = true;
                    return ((qng) this.c).g((String) obj2, this) == rih1Var2 ? rih1Var2 : rih1Var;
                }
                if (z5) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                boolean z6 = this.b;
                if (z6) {
                    if (z6) {
                        throw l1d.v(obj);
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ay8 ay8Var = (ay8) this.c;
                fdd fddVar = new fdd((sng) obj2, (byte) 8);
                this.b = true;
                ay8Var.collect(fddVar, this);
                return rih1Var2;
            case 5:
                boolean z7 = this.b;
                if (z7) {
                    if (z7) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                xpg xpgVar = (xpg) this.c;
                d0r d0rVar = xpgVar.b.b;
                pwc0 pwc0Var = pwc0.e;
                g4d0 g4d0Var = new g4d0(xpgVar.a);
                uha1 uha1Var = (uha1) obj2;
                qha1 qha1Var = uha1Var.d;
                boolean z8 = (qha1Var != null ? qha1Var.a : 0) == 2;
                e4d0 e4d0Var = new e4d0(spg.a[uha1Var.b.ordinal()] == 1 ? new m2d0(z8) : new m2d0(z8));
                this.b = true;
                return d0r.d(d0rVar, pwc0Var, g4d0Var, e4d0Var, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 6:
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
                xe01 xe01Var = (xe01) this.c;
                ssg ssgVar = new ssg((tsg) obj2, null == true ? 1 : 0);
                this.b = true;
                return xe01Var.a.collect(ssgVar, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 7:
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
                mr20 mr20Var = (mr20) this.c;
                ssg ssgVar2 = new ssg((tsg) obj2, b2);
                this.b = true;
                return mr20Var.collect(ssgVar2, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 8:
                ajq0 ajq0Var = (ajq0) this.c;
                boolean z11 = this.b;
                if (!z11) {
                    hm5.M(obj);
                    this.b = true;
                    objT = ajq0Var.T((String) obj2, this);
                    if (objT == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z11) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objT = obj;
                }
                if (!((Boolean) objT).booleanValue()) {
                    return rih1Var;
                }
                kt91 kt91Var = (kt91) ajq0Var.e;
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131960144});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var.k(new er91((fs91) null, "", 2131960144, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return rih1Var;
            case 9:
                boolean z12 = this.b;
                try {
                    if (!z12) {
                        hm5.M(obj);
                        k0h k0hVar = (k0h) obj2;
                        xyc0 xyc0Var = k0hVar.b;
                        String str = k0hVar.e;
                        ddd1 ddd1Var = ddd1.Q0;
                        this.c = null;
                        this.b = true;
                        objU = xyc0Var.u(str, ddd1Var, this);
                        if (objU == rih1Var2) {
                            return rih1Var2;
                        }
                    } else {
                        if (!z12) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objU = obj;
                    }
                    return rih1Var;
                } catch (Throwable unused) {
                    return rih1Var;
                }
            case 10:
                boolean z13 = this.b;
                if (!z13) {
                    hm5.M(obj);
                    this.b = true;
                    Object objC2 = ((n6g1) ((u9c) this.c).d).c((ArrayList) obj2, this);
                    return objC2 == rih1Var2 ? rih1Var2 : objC2;
                }
                if (z13) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 11:
                ssw0 ssw0Var = (ssw0) this.c;
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
                cu cuVar = new cu(ssw0Var, (byte) 2);
                this.c = null;
                this.b = true;
                return ((qt20) obj2).collect(cuVar, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 12:
                boolean z15 = this.b;
                if (z15) {
                    if (!z15) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        hm5.M(obj);
                    }
                    return null;
                }
                hm5.M(obj);
                at71 at71VarA = ((urm) ((c0c) this.c).b).a();
                h8c h8cVar = new h8c((Consumer) obj2, (byte) 1);
                this.b = true;
                if (at71VarA.collect(h8cVar, this) == rih1Var2) {
                    return rih1Var2;
                }
                jah.d();
                return null;
            case 13:
                boolean z16 = this.b;
                try {
                    if (!z16) {
                        hm5.M(obj);
                        this.b = true;
                        if (((nqh) this.c).a.a((el30) obj2, this) == rih1Var2) {
                            rih1Var = rih1Var2;
                        }
                    } else {
                        if (!z16) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    return rih1Var;
                } catch (Exception e) {
                    n57.t("Failed to send fraud collection data!", e);
                    return rih1Var;
                }
            case 14:
                boolean z17 = this.b;
                if (!z17) {
                    hm5.M(obj);
                    jha1 jha1Var = (jha1) this.c;
                    ga5 ga5Var = new ga5(2, null, (byte) 1);
                    this.b = true;
                    if (b5p1.j(jha1Var, ga5Var, this) == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z17) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ((hrr0) ((ajq0) obj2).b).setValue(Boolean.TRUE);
                return rih1Var;
            case 15:
                boolean z18 = this.b;
                if (z18) {
                    if (z18) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                lc20 lc20Var = (lc20) ((pt) this.c).i;
                String str2 = ((swh) obj2).a;
                this.b = true;
                return lc20Var.q(str2, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 16:
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
                bxh bxhVar = (uwh) ((cce) this.c).b;
                this.b = true;
                Object objC3 = bxhVar.c((String) obj2, this);
                return objC3 == rih1Var2 ? rih1Var2 : objC3;
            case 17:
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
                mr20 mr20VarU = rqt0.u(z4p1.v(rwq.q(new tr1((y7e1) this.c, (byte) 18)), 1));
                zti ztiVar = new zti((rb51) obj2, (lnm) null, (byte) 2);
                this.b = true;
                return l4p1.q(mr20VarU, ztiVar, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                boolean z21 = this.b;
                if (z21) {
                    if (z21) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                dt71 dt71Var = (dt71) ((tw81) this.c).c.c;
                qv7 qv7Var = new qv7((iu30) obj2, (byte) 7);
                this.b = true;
                dt71Var.collect(qv7Var, this);
                return rih1Var2;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                tuj tujVar = (tuj) this.c;
                boolean z22 = this.b;
                if (!z22) {
                    hm5.M(obj);
                    this.b = true;
                    objR = tujVar.k.r((List) obj2, this);
                    if (objR == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z22) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objR = obj;
                }
                Integer num = ((qbr) objR).a;
                if (num == null) {
                    return rih1Var;
                }
                tujVar.n.n.setValue(Integer.valueOf(num.intValue()));
                acr acrVar = tujVar.e;
                acrVar.a = fzc0.a(acrVar.a, (String) null, azc0.a, 3);
                return rih1Var;
            case 20:
                xxj xxjVar = (xxj) this.c;
                boolean z23 = this.b;
                if (!z23) {
                    hm5.M(obj);
                    p8a p8aVar = xxjVar.f;
                    this.b = true;
                    Object objC4 = p8aVar.c(0.0f - p8aVar.b, this);
                    if (objC4 != rih1Var2) {
                        objC4 = rih1Var;
                    }
                    if (objC4 == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z23) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ((hrr0) xxjVar.c.b).setValue(Boolean.FALSE);
                ((Runnable) obj2).run();
                return rih1Var;
            case 21:
                vr20 vr20Var = (vr20) this.c;
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
                Boolean boolValueOf = Boolean.valueOf(((rgn0) obj2).b.getValue() instanceof ngn0);
                this.c = null;
                this.b = true;
                return vr20Var.emit(boolValueOf, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 22:
                z2k z2kVar = (z2k) obj2;
                c9n c9nVar = (c9n) this.c;
                boolean z25 = this.b;
                if (z25) {
                    if (z25) {
                        throw l1d.v(obj);
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                fn31.T(c9nVar, (o8n) null, 0, new mx(z2kVar, (lnm) null, (byte) 9), 3);
                fn31.T(c9nVar, (o8n) null, 0, new u2k(z2kVar, null, (byte) 0), 3);
                fn31.T(c9nVar, (o8n) null, 0, new u2k(z2kVar, null, (byte) 1), 3);
                this.c = null;
                this.b = true;
                hap1.f(this);
                return rih1Var2;
            case 23:
                g4k g4kVar = (g4k) obj2;
                boolean z26 = this.b;
                if (!z26) {
                    hm5.M(obj);
                    it = g4kVar.d.values().iterator();
                } else {
                    if (!z26) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (Iterator) this.c;
                    hm5.M(obj);
                }
                while (it.hasNext()) {
                    c4k c4kVar = (c4k) it.next();
                    this.c = it;
                    this.b = true;
                    if (c4kVar.a(this) == rih1Var2) {
                        return rih1Var2;
                    }
                }
                smo1.p(g4kVar.b, (CancellationException) null);
                return rih1Var;
            case 24:
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
                dg8 dg8Var = (dg8) ((k9k) this.c).c;
                List listSingletonList = Collections.singletonList(((nak) obj2).b);
                this.b = true;
                w4h w4hVar = (w4h) dg8Var.b;
                u4h u4hVarQ = CollectionPlatformItemsRequest.q();
                u4hVarQ.n(listSingletonList);
                u4hVarQ.t(w5hVar);
                Object objI = fc11.i(w4hVar.b(u4hVarQ.build()).ignoreElement(), this);
                if (objI != rih1Var2) {
                    objI = rih1Var;
                }
                if (objI != rih1Var2) {
                    objI = rih1Var;
                }
                return objI == rih1Var2 ? rih1Var2 : rih1Var;
            case 25:
                boolean z28 = this.b;
                if (!z28) {
                    hm5.M(obj);
                    this.b = true;
                    return ((dg8) ((d520) this.c).c).h((ArrayList) obj2, this) == rih1Var2 ? rih1Var2 : rih1Var;
                }
                if (z28) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 26:
                tck tckVar = (tck) this.c;
                kt91 kt91Var2 = (kt91) tckVar.f;
                boolean z29 = this.b;
                try {
                    if (!z29) {
                        hm5.M(obj);
                        this.b = true;
                        objM = ((rm5) tckVar.e).m((String) obj2, this);
                        if (objM == rih1Var2) {
                            return rih1Var2;
                        }
                    } else {
                        if (!z29) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objM = obj;
                    }
                    CampaignActionResponse campaignActionResponse = (CampaignActionResponse) objM;
                    if (campaignActionResponse.getMessage().length() <= 0) {
                        return rih1Var;
                    }
                    z = false;
                    try {
                        kt91Var2.k(new er91((fs91) null, campaignActionResponse.getMessage(), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                        return rih1Var;
                    } catch (Exception unused2) {
                    }
                } catch (Exception unused3) {
                    z = false;
                }
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131956594});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var2.k(new er91((fs91) null, "", 2131956594, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, z));
                return rih1Var;
            case 27:
                boolean z30 = this.b;
                if (z30) {
                    if (z30) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                dg8 dg8Var2 = ((bhk) this.c).d;
                this.b = true;
                w4h w4hVar2 = (w4h) dg8Var2.b;
                u4h u4hVarQ2 = CollectionPlatformItemsRequest.q();
                u4hVarQ2.n((List) obj2);
                u4hVarQ2.t(w5hVar);
                Object objI2 = fc11.i(w4hVar2.b(u4hVarQ2.build()).ignoreElement(), this);
                if (objI2 != rih1Var2) {
                    objI2 = rih1Var;
                }
                if (objI2 != rih1Var2) {
                    objI2 = rih1Var;
                }
                return objI2 == rih1Var2 ? rih1Var2 : rih1Var;
            case 28:
                vr20 vr20Var2 = (vr20) this.c;
                boolean z31 = this.b;
                if (!z31) {
                    gbh gbhVar = new gbh(l1d.y(obj), vr20Var2, (byte) 1);
                    this.c = null;
                    this.b = true;
                    return ((fu20) obj2).collect(gbhVar, this) == rih1Var2 ? rih1Var2 : rih1Var;
                }
                if (z31) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                ztc ztcVar = (ztc) this.c;
                boolean z32 = this.b;
                if (z32) {
                    if (z32) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (!ztcVar.c.isEmpty()) {
                    return rih1Var;
                }
                xv51 xv51Var = ((stk) obj2).a;
                this.c = null;
                this.b = true;
                return xv51Var.a(this) == rih1Var2 ? rih1Var2 : rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bag(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
    }
}
