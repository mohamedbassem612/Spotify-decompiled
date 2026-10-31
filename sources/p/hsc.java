package p;

import android.content.ComponentName;
import android.content.Context;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.base.java.logging.Logger;
import com.spotify.campfire.datasource.impl.proto.HierarchyUserParticipationStatus;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hsc extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hsc(Object obj, Object obj2, lnm lnmVar, byte b) {
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
                return new hsc((isc) this.c, (String) obj2, lnmVar, (byte) 0);
            case 1:
                return new hsc((ktc) this.c, (ComponentName) obj2, lnmVar, (byte) 1);
            case 2:
                return new hsc((euc) this.c, (ztc) obj2, lnmVar, (byte) 2);
            case 3:
                return new hsc((vvc) this.c, (ComponentName) obj2, lnmVar, (byte) 3);
            case 4:
                return new hsc((xvc) this.c, (i8h1) obj2, lnmVar, (byte) 4);
            case 5:
                hsc hscVar = new hsc((q4d) obj2, lnmVar, (byte) 5);
                hscVar.c = obj;
                return hscVar;
            case 6:
                hsc hscVar2 = new hsc((bfd) obj2, lnmVar, (byte) 6);
                hscVar2.c = obj;
                return hscVar2;
            case 7:
                hsc hscVar3 = new hsc((age) obj2, lnmVar, (byte) 7);
                hscVar3.c = obj;
                return hscVar3;
            case 8:
                hsc hscVar4 = new hsc((gge) obj2, lnmVar, (byte) 8);
                hscVar4.c = obj;
                return hscVar4;
            case 9:
                return new hsc((mr20) this.c, (d561) obj2, lnmVar, (byte) 9);
            case 10:
                return new hsc((cke) this.c, (String) obj2, lnmVar, (byte) 10);
            case 11:
                hsc hscVar5 = new hsc((ela) obj2, lnmVar, (byte) 11);
                hscVar5.c = obj;
                return hscVar5;
            case 12:
                hsc hscVar6 = new hsc((kp5) obj2, lnmVar, (byte) 12);
                hscVar6.c = obj;
                return hscVar6;
            case 13:
                return new hsc((ske) this.c, (ven0) obj2, lnmVar, (byte) 13);
            case 14:
                return new hsc((w3f) this.c, (String) obj2, lnmVar, (byte) 14);
            case 15:
                return new hsc((baf) this.c, (th61) obj2, lnmVar, (byte) 15);
            case 16:
                return new hsc((qbf) this.c, (qn50) obj2, lnmVar, (byte) 16);
            case 17:
                return new hsc((qto0) this.c, (qbf) obj2, lnmVar, (byte) 17);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new hsc((bfd) this.c, (b9w) obj2, lnmVar, (byte) 18);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new hsc((bfd) this.c, (Cnew) obj2, lnmVar, (byte) 19);
            case 20:
                hsc hscVar7 = new hsc((fpf) obj2, lnmVar, (byte) 20);
                hscVar7.c = obj;
                return hscVar7;
            case 21:
                return new hsc((sen0) this.c, (iu30) obj2, lnmVar, (byte) 21);
            case 22:
                return new hsc((y7e1) this.c, (wen0) obj2, lnmVar, (byte) 22);
            case 23:
                return new hsc((y7e1) this.c, (es41) obj2, lnmVar, (byte) 23);
            case 24:
                return new hsc((sen0) this.c, (String) obj2, lnmVar, (byte) 24);
            case 25:
                return new hsc((ArrayList) this.c, (asf) obj2, lnmVar, (byte) 25);
            case 26:
                hsc hscVar8 = new hsc((ll3) obj2, lnmVar, (byte) 26);
                hscVar8.c = obj;
                return hscVar8;
            case 27:
                return new hsc((uq8) this.c, (zbq0) obj2, lnmVar, (byte) 27);
            case 28:
                hsc hscVar9 = new hsc((cce) obj2, lnmVar, (byte) 28);
                hscVar9.c = obj;
                return hscVar9;
            default:
                return new hsc((y0g) this.c, (z0g) obj2, lnmVar, (byte) 29);
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
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((List) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
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
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
            case 22:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 24:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((rih1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Code duplicated, block: B:74:0x0180  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        Object objU;
        Object objF;
        Observable observableJust;
        Observable observableJust2;
        Object objY;
        Object objJ;
        Object objI;
        Object objF2;
        mmr0 mmr0Var;
        String str;
        byte b = this.a;
        byte b2 = 0;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.d;
        rih1 rih1Var2 = d9n.a;
        byte b3 = 1;
        Object obj3 = null;
        Object[] objArr = 0;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    xyc0 xyc0Var = ((isc) this.c).a;
                    this.b = true;
                    objU = xyc0Var.u((String) obj2, ddd1.b1, this);
                    if (objU == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objU = obj;
                }
                ((py21) objU).d();
                return rih1Var;
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
                d520 d520VarA = ((ktc) this.c).b.a((ComponentName) obj2);
                this.b = true;
                Object objO = d520VarA.o(this);
                return objO == rih1Var2 ? rih1Var2 : objO;
            case 2:
                euc eucVar = (euc) this.c;
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        objF = obj;
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                rsc0 rsc0Var = eucVar.a;
                ((upp0) eucVar.b.get()).getClass();
                String strA = upp0.a();
                trc0 trc0VarB = euc.b((ztc) obj2);
                this.b = true;
                objF = rsc0Var.f(strA, trc0VarB, this);
                if (objF == rih1Var2) {
                    return rih1Var2;
                }
                oy21 oy21Var = (py21) objF;
                if (oy21Var instanceof oy21) {
                    return kln1.B((wsc0) oy21Var.a);
                }
                if (oy21Var instanceof ly21) {
                    return fuc.f;
                }
                eg.o();
                return null;
            case 3:
                vvc vvcVar = (vvc) this.c;
                kly0 kly0Var = vvcVar.a;
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
                o84 o84Var = (o84) kly0Var.get();
                if (o84Var.c != null) {
                    observableJust = ((Observable) o84Var.e.getValue()).map(olj0.g).distinctUntilChanged();
                    observableJust.getClass();
                } else {
                    observableJust = Observable.just(o84Var.a);
                    observableJust.getClass();
                }
                mr20 mr20VarG = yoi1.g(observableJust);
                o84 o84Var2 = (o84) kly0Var.get();
                if (o84Var2.c != null) {
                    observableJust2 = ((Observable) o84Var2.e.getValue()).map(pzs0.g).distinctUntilChanged();
                    observableJust2.getClass();
                } else {
                    observableJust2 = Observable.just(Integer.valueOf(o84Var2.b));
                    observableJust2.getClass();
                }
                mr20 mr20VarG2 = yoi1.g(observableJust2);
                uvc uvcVar = new uvc(3, (lnm) null, (byte) 0);
                mib mibVar = new mib(vvcVar, (ComponentName) obj2, (byte) 1);
                this.b = true;
                Object objS = fc11.s(vrl.c, this, mibVar, new ekv(uvcVar, (lnm) null), new mr20[]{mr20VarG, mr20VarG2});
                if (objS != rih1Var2) {
                    objS = rih1Var;
                }
                return objS == rih1Var2 ? rih1Var2 : rih1Var;
            case 4:
                xvc xvcVar = (xvc) this.c;
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
                w7h1 w7h1Var = (w7h1) xvcVar.e().invoke();
                ou80 ou80Var = ((i8h1) obj2).m(w7h1Var, (xj61) null).a;
                xvcVar.i.a(w7h1Var, ou80Var);
                qzn0 qzn0Var = xvcVar.h;
                this.b = true;
                qzn0Var.getClass();
                yrn0 yrn0Var = new yrn0(ou80Var);
                mwn0 mwn0Var = qzn0Var.c;
                mwn0Var.e(yrn0Var);
                mwn0Var.f(yrn0Var);
                Object objY2 = fn31.Y(qzn0Var.a, new ozn0(qzn0Var, (lnm) null, (byte) 1), this);
                if (objY2 != rih1Var2) {
                    objY2 = rih1Var;
                }
                return objY2 == rih1Var2 ? rih1Var2 : rih1Var;
            case 5:
                q4d q4dVar = (q4d) obj2;
                zhq0 zhq0Var = q4dVar.a;
                ssw0 ssw0Var = (ssw0) this.c;
                boolean z6 = this.b;
                if (z6) {
                    if (z6) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                p4d p4dVar = new p4d(ssw0Var, q4dVar);
                ((gzj) q4dVar.b.b).b.add(p4dVar);
                if (zhq0Var.d("android.permission.CAMERA").equals(cat.b)) {
                    zhq0Var.s(new String[]{"android.permission.CAMERA"});
                }
                ft0 ft0Var = new ft0(q4dVar, p4dVar, (byte) 6);
                this.c = null;
                this.b = true;
                return jch0.s(ssw0Var, ft0Var, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 6:
                bfd bfdVar = (bfd) obj2;
                c9n c9nVar = (c9n) this.c;
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
                jge jgeVarE = hu20.e(bfdVar.Y.b(), new b7c((lnm) (objArr == true ? 1 : 0), (Object) bfdVar, b3));
                fdd fddVar = new fdd(c9nVar, bfdVar, b2);
                this.c = null;
                this.b = true;
                return jgeVarE.collect(fddVar, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 7:
                ssw0 ssw0Var2 = (ssw0) this.c;
                boolean z8 = this.b;
                if (!z8) {
                    hm5.M(obj);
                    this.c = null;
                    this.b = true;
                    return ((age) obj2).g(ssw0Var2, this) == rih1Var2 ? rih1Var2 : rih1Var;
                }
                if (z8) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 8:
                vr20 vr20Var = (vr20) this.c;
                boolean z9 = this.b;
                if (!z9) {
                    hm5.M(obj);
                    this.c = null;
                    this.b = true;
                    return ((gge) obj2).k(vr20Var, this) == rih1Var2 ? rih1Var2 : rih1Var;
                }
                if (z9) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                boolean z10 = this.b;
                if (!z10) {
                    hm5.M(obj);
                    this.b = true;
                    return ((mr20) this.c).collect((d561) obj2, this) == rih1Var2 ? rih1Var2 : rih1Var;
                }
                if (z10) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
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
                any anyVar = new any(((cke) this.c).y((String) obj2), (byte) 18);
                this.b = true;
                Object objI2 = b5p1.i(anyVar, this);
                return objI2 == rih1Var2 ? rih1Var2 : objI2;
            case 11:
                boolean z12 = this.b;
                try {
                    if (!z12) {
                        hm5.M(obj);
                        ela elaVar = (ela) obj2;
                        this.c = null;
                        this.b = true;
                        if (elaVar.invoke(this) == rih1Var2) {
                            rih1Var = rih1Var2;
                        }
                    } else {
                        if (!z12) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    return rih1Var;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable unused) {
                    return rih1Var;
                }
            case 12:
                List list = (List) this.c;
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
                kp5 kp5Var = (kp5) obj2;
                qix0 qix0Var = (qix0) kp5Var.e;
                m4d m4dVar = new m4d(kp5Var, (byte) 20);
                this.c = null;
                this.b = true;
                qix0Var.getClass();
                if (list.isEmpty() || (objY = fn31.Y(qix0Var.c, new sew0(list, qix0Var, m4dVar, (lnm) null, (byte) 1), this)) != rih1Var2) {
                    objY = rih1Var;
                }
                return objY == rih1Var2 ? rih1Var2 : rih1Var;
            case 13:
                aod aodVar = ((ske) this.c).j;
                ven0 ven0Var = (ven0) obj2;
                boolean z14 = this.b;
                if (z14) {
                    if (z14) {
                        throw l1d.v(obj);
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                String str2 = (String) ven0Var.getValue();
                if (str2 != null) {
                    ((bpb1) aodVar.b).m((Object) null, str2);
                }
                bpb1 bpb1Var = (bpb1) aodVar.c;
                mp0 mp0Var = new mp0(ven0Var, (byte) 4);
                this.b = true;
                bpb1Var.collect(mp0Var, this);
                return rih1Var2;
            case 14:
                boolean z15 = this.b;
                try {
                    if (!z15) {
                        hm5.M(obj);
                        this.b = true;
                        objJ = ((w3f) this.c).b.j((String) obj2, this);
                        if (objJ == rih1Var2) {
                            objJ = rih1Var2;
                        }
                    } else {
                        if (!z15) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objJ = obj;
                    }
                    return objJ;
                } catch (Exception unused2) {
                    Logger.d("Deleting empty chat failed with exception", new Object[0]);
                    return rih1Var;
                }
            case 15:
                boolean z16 = this.b;
                if (!z16) {
                    hm5.M(obj);
                    mr20 mr20VarB = ((kbd) ((baf) this.c).b.get()).b();
                    this.b = true;
                    objI = b5p1.i(mr20VarB, this);
                    if (objI == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z16) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objI = obj;
                }
                return ((Boolean) objI).booleanValue() ? new hrn0(y9f.class, new aaf(((th61) obj2).a), a6w0.a) : crn0.a;
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
                qbf qbfVar = (qbf) this.c;
                nbc nbcVar = qbfVar.e;
                dc31 dc31Var = qbfVar.c;
                Context context = qbfVar.d;
                gb9 gb9Var = ((qn50) obj2).b;
                this.b = true;
                Object objN = tro1.n(nbcVar, dc31Var, context, gb9Var, (String) null, this);
                return objN == rih1Var2 ? rih1Var2 : objN;
            case 17:
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
                qto0 qto0Var = (qto0) this.c;
                hvp0 hvp0Var = ((qbf) obj2).g;
                this.b = true;
                Object objA = tro1.A(qto0Var, hvp0Var, this);
                return objA == rih1Var2 ? rih1Var2 : objA;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
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
                bfd bfdVar2 = (bfd) this.c;
                String str3 = ((b9w) obj2).c;
                this.b = true;
                Object objF3 = bfdVar2.b.F(str3, HierarchyUserParticipationStatus.HIERARCHY_USER_PARTICIPATION_STATUS_ACCEPTED, this);
                return objF3 == rih1Var2 ? rih1Var2 : objF3;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
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
                bfd bfdVar3 = (bfd) this.c;
                String str4 = ((Cnew) obj2).c;
                this.b = true;
                Object objF4 = bfdVar3.b.F(str4, HierarchyUserParticipationStatus.HIERARCHY_USER_PARTICIPATION_STATUS_REJECTED, this);
                return objF4 == rih1Var2 ? rih1Var2 : objF4;
            case 20:
                vr20 vr20Var2 = (vr20) this.c;
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
                bma1 bma1Var = fpf.d;
                dma1 dma1Var = ((fpf) obj2).b;
                bma1 bma1Var2 = fpf.h;
                w7x w7xVar = w7x.a;
                w7x w7xVarB = dma1Var.b(bma1Var2, w7xVar);
                if (w7xVarB != null) {
                    w7xVar = w7xVarB;
                }
                this.c = null;
                this.b = true;
                return vr20Var2.emit(w7xVar, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 21:
                boolean z22 = this.b;
                if (z22) {
                    if (!z22) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        hm5.M(obj);
                    }
                    return null;
                }
                hm5.M(obj);
                sen0 sen0Var = (sen0) this.c;
                qv7 qv7Var = new qv7((iu30) obj2, (byte) 6);
                this.b = true;
                if (sen0Var.collect(qv7Var, this) == rih1Var2) {
                    return rih1Var2;
                }
                jah.d();
                return null;
            case 22:
                boolean z23 = this.b;
                if (z23) {
                    if (z23) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarK = r4p1.k(rwq.q(new tr1((y7e1) this.c, (byte) 13)), 300L);
                lw9 lw9Var = new lw9((wen0) obj2, (lnm) null, (byte) 1);
                this.b = true;
                return l4p1.q(mr20VarK, lw9Var, this) == rih1Var2 ? rih1Var2 : rih1Var;
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
                m441 m441VarQ = rwq.q(new tr1((y7e1) this.c, (byte) 15));
                uqf uqfVar = new uqf((es41) obj2, null, (byte) 0);
                this.b = true;
                return l4p1.q(m441VarQ, uqfVar, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 24:
                boolean z25 = this.b;
                if (!z25) {
                    hm5.M(obj);
                    this.b = true;
                    return ((sen0) this.c).emit((String) obj2, this) == rih1Var2 ? rih1Var2 : rih1Var;
                }
                if (z25) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 25:
                ArrayList arrayList = (ArrayList) this.c;
                boolean z26 = this.b;
                if (!z26) {
                    hm5.M(obj);
                    ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add((String) ((mmr0) it.next()).a);
                    }
                    mdd0 mdd0Var = ((asf) obj2).e;
                    this.b = true;
                    objF2 = mdd0Var.f(arrayList2, this);
                    if (objF2 == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z26) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objF2 = obj;
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : (List) objF2) {
                    tcd0 tcd0Var = ((ucd0) obj4).b;
                    if (tcd0Var != null && tcd0Var.c) {
                        arrayList3.add(obj4);
                    }
                }
                int size = arrayList3.size();
                if (size == 0) {
                    return bhd0.a;
                }
                if (size != 1) {
                    return new chd0(arrayList3.size());
                }
                String str5 = ((ucd0) o7h.q0(arrayList3)).a;
                for (Object obj5 : arrayList) {
                    if (u890.j(((mmr0) obj5).a, str5)) {
                        obj3 = obj5;
                        mmr0Var = (mmr0) obj3;
                        if (mmr0Var != null || (str = (String) mmr0Var.b) == null) {
                            str = "";
                        }
                        return new dhd0(str);
                    }
                }
                mmr0Var = (mmr0) obj3;
                if (mmr0Var != null) {
                    str = "";
                } else {
                    str = "";
                }
                return new dhd0(str);
            case 26:
                vr20 vr20Var3 = (vr20) this.c;
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
                mr20 mr20VarB2 = ((kbd) ((ll3) obj2).b.get()).b();
                this.c = null;
                this.b = true;
                return l4p1.s(vr20Var3, mr20VarB2, this) == rih1Var2 ? rih1Var2 : rih1Var;
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
                Single singleFirstOrError = ((byp0) ((uq8) this.c).b).d(((zbq0) obj2).b).firstOrError();
                this.b = true;
                Object objJ2 = fc11.j(singleFirstOrError, this);
                return objJ2 == rih1Var2 ? rih1Var2 : objJ2;
            case 28:
                cce cceVar = (cce) obj2;
                ssw0 ssw0Var3 = (ssw0) this.c;
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
                ((fzw) cceVar.c).a(new mtf(ssw0Var3, (byte) 0));
                lwe lweVar = new lwe(cceVar, (byte) 9);
                this.c = null;
                this.b = true;
                return jch0.s(ssw0Var3, lweVar, this) == rih1Var2 ? rih1Var2 : rih1Var;
            default:
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
                y0g y0gVar = (y0g) this.c;
                String str6 = ((z0g) obj2).b;
                this.b = true;
                return y0gVar.a(str6, this) == rih1Var2 ? rih1Var2 : rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hsc(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
    }
}
