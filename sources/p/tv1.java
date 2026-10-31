package p;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.functions.Consumer;
import com.spotify.wrapped.v1.proto.Outline;
import com.spotify.wrapped.v1.proto.SceneTemplate;
import io.reactivex.rxjava3.core.ObservableSource;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tv1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public int c;
    public Object d;
    public Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tv1(int i, xtb0 xtb0Var, ven0 ven0Var, hdn0 hdn0Var, tob1 tob1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 10;
        this.c = i;
        this.d = xtb0Var;
        this.e = ven0Var;
        this.f = hdn0Var;
        this.g = tob1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.g;
        Object obj3 = this.f;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new tv1(this.d, this.e, obj3, this.c, obj2, lnmVar, (byte) 0);
            case 1:
                return new tv1((iu30) this.d, (iu30) this.e, (mu10) obj3, (Consumer) obj2, this.c, lnmVar);
            case 2:
                tv1 tv1Var = new tv1(this.e, obj3, this.c, obj2, lnmVar, (byte) 2);
                tv1Var.d = obj;
                return tv1Var;
            case 3:
                tv1 tv1Var2 = new tv1((jkr0) this.d, (iu30) this.e, (hdn0) obj3, (ven0) obj2, lnmVar);
                tv1Var2.c = ((Number) obj).intValue();
                return tv1Var2;
            case 4:
                return new tv1((rfo0) this.d, this.c, (km61) this.e, (Integer) obj3, (tv80) obj2, lnmVar);
            case 5:
                return new tv1((b1t0) obj3, (sen0) obj2, lnmVar);
            case 6:
                return new tv1(this.c, this.d, lnmVar, (gw70) this.e, (bju) obj3, (SceneTemplate.Quiz) obj2);
            case 7:
                tv1 tv1Var3 = new tv1(this.e, obj3, this.c, obj2, lnmVar, (byte) 7);
                tv1Var3.d = obj;
                return tv1Var3;
            case 8:
                return new tv1(this.d, this.e, this.c, obj3, obj2, lnmVar, (byte) 8);
            case 9:
                return new tv1(this.d, this.e, obj3, this.c, obj2, lnmVar, (byte) 9);
            case 10:
                return new tv1(this.c, (xtb0) this.d, (ven0) this.e, (hdn0) obj3, (tob1) obj2, lnmVar);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return new tv1(this.d, this.e, this.c, obj3, obj2, lnmVar, (byte) 11);
            case grn1.d /* 12 */:
                return new tv1(this.d, this.e, this.c, obj3, obj2, lnmVar, (byte) 12);
            case 13:
                tv1 tv1Var4 = new tv1(this.e, obj3, this.c, obj2, lnmVar, (byte) 13);
                tv1Var4.d = obj;
                return tv1Var4;
            default:
                return new tv1((gpj1) obj3, this.c, (Long) obj2, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create(Integer.valueOf(((Number) obj).intValue()), (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case grn1.d /* 12 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    /* JADX WARN: Code duplicated, block: B:186:0x03da  */
    /* JADX WARN: Code duplicated, block: B:283:0x03ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:285:? A[LOOP:0: B:184:0x03d4->B:285:?, LOOP_END, SYNTHETIC] */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objInvoke;
        String str;
        Object objK;
        List listM;
        Iterator it;
        sen0 sen0Var;
        int i;
        czs0 czs0Var;
        Object objA;
        String str2;
        xgn0 xgn0Var;
        gpj1 gpj1Var;
        mmr0 mmr0Var;
        byte b = this.a;
        Map map = b7x.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.g;
        rih1 rih1Var2 = d9n.a;
        Object obj3 = this.f;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ((mj11) this.d).getClass();
                int i2 = ((Activity) this.e).getResources().getDisplayMetrics().heightPixels;
                if (!((dx1) obj3).e && this.c < i2) {
                    return rih1Var;
                }
                upo upoVar = (upo) obj2;
                this.b = true;
                n8b1 n8b1Var = upo.l;
                hrr0 hrr0Var = upoVar.f;
                wy71 wy71Var = wy71.b;
                hrr0Var.setValue(wy71Var);
                Object objA2 = upoVar.a(upoVar.g(wy71Var), n8b1Var, this);
                if (objA2 != rih1Var2) {
                    objA2 = rih1Var;
                }
                return objA2 == rih1Var2 ? rih1Var2 : rih1Var;
            case 1:
                Consumer consumer = (Consumer) obj2;
                mu10 mu10Var = (mu10) obj3;
                iu30 iu30Var = (iu30) this.e;
                iu30 iu30Var2 = (iu30) this.d;
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        objInvoke = obj;
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                this.b = true;
                objInvoke = iu30Var2.invoke(this);
                if (objInvoke == rih1Var2) {
                    return rih1Var2;
                }
                tw10 tw10Var = (uw10) objInvoke;
                if (tw10Var instanceof tw10) {
                    if (!((Boolean) iu30Var.invoke(tw10Var)).booleanValue() || (str = tw10Var.b) == null) {
                        return rih1Var;
                    }
                    mu10Var.c.k(new er91((fs91) null, str, (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                    return rih1Var;
                }
                if (!(tw10Var instanceof sw10)) {
                    eg.o();
                    return null;
                }
                sw10 sw10Var = (sw10) tw10Var;
                boolean z3 = sw10Var.a;
                if (z3) {
                    mu10Var.a(consumer, this.c, iu30Var2, iu30Var);
                }
                consumer.accept(new zu10(z3, sw10Var.b));
                return rih1Var;
            case 2:
                kaa kaaVar = (kaa) this.e;
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
                c9n c9nVar = (c9n) this.d;
                int i3 = kaa.e;
                kaaVar.h((Context) obj3, c9nVar);
                div divVarB = kaaVar.b();
                int i4 = this.c;
                Bundle bundle = (Bundle) obj2;
                this.b = true;
                v291 v291Var = divVarB.j;
                Object objB = ((ws40) divVarB).a.b(new xd1((Context) obj3, new kx5(i4), divVarB, bundle, new ew0(bundle, (lnm) null, (byte) 24), (lnm) null, (byte) 10), this);
                if (objB != rih1Var2) {
                    objB = rih1Var;
                }
                if (objB != rih1Var2) {
                    objB = rih1Var;
                }
                return objB == rih1Var2 ? rih1Var2 : rih1Var;
            case 3:
                int i5 = this.c;
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    if (i5 == ((hdn0) obj3).s()) {
                        return rih1Var;
                    }
                    jkr0 jkr0Var = (jkr0) this.d;
                    this.c = i5;
                    this.b = true;
                    if (jkr0.s(jkr0Var, i5, this) == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z5) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                if (((Boolean) ((ven0) obj2).getValue()).booleanValue()) {
                    return rih1Var;
                }
                ((iu30) this.e).invoke(new us70(i5));
                return rih1Var;
            case 4:
                Integer num = (Integer) obj3;
                int i6 = this.c;
                rfo0 rfo0Var = (rfo0) this.d;
                boolean z6 = this.b;
                if (!z6) {
                    hm5.M(obj);
                    ezc ezcVarG = yoi1.g((ObservableSource) rfo0Var.e.invoke());
                    this.b = true;
                    objK = b5p1.k(ezcVarG, this);
                    if (objK == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z6) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objK = obj;
                }
                if (u890.j(objK, Boolean.TRUE) && i6 != rfo0.h.a) {
                    km61.a((km61) this.e, "nonQuietLevel", mno1.h(new mmr0[]{new mmr0("oldValue", num), new mmr0("newValue", new Integer(i6))}), false, 4);
                    return rih1Var;
                }
                qxm0 qxm0Var = rfo0.h;
                rfo0Var.c.a(rc11.a.b(tfo0.class), rih1Var).a(num, Integer.valueOf(i6), (tv80) obj2);
                return rih1Var;
            case 5:
                boolean z7 = this.b;
                if (z7) {
                    if (!z7) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i7 = this.c;
                    it = (Iterator) this.e;
                    sen0Var = (sen0) this.d;
                    hm5.M(obj);
                    i = i7;
                    while (it.hasNext()) {
                        czs0Var = (czs0) it.next();
                        this.d = sen0Var;
                        this.e = it;
                        this.c = i;
                        this.b = true;
                        if (sen0Var.emit(czs0Var, this) == rih1Var2) {
                            return rih1Var2;
                        }
                    }
                    return rih1Var;
                }
                hm5.M(obj);
                n1t0 n1t0Var = ((b1t0) obj3).a;
                boolean z8 = n1t0Var instanceof g1t0;
                czs0 czs0Var2 = bzs0.a;
                if (z8) {
                    listM = Collections.singletonList(czs0Var2);
                } else {
                    boolean z9 = n1t0Var instanceof l1t0;
                    czs0 czs0Var3 = azs0.a;
                    if (z9 || (n1t0Var instanceof m1t0)) {
                        listM = Collections.singletonList(czs0Var3);
                    } else {
                        boolean z10 = n1t0Var instanceof i1t0;
                        czs0 czs0Var4 = xys0.a;
                        if (z10) {
                            listM = p7h.M(new czs0[]{czs0Var4, czs0Var3});
                        } else {
                            if (!(n1t0Var instanceof k1t0)) {
                                eg.o();
                                return null;
                            }
                            listM = p7h.M(new czs0[]{czs0Var4, czs0Var2});
                        }
                    }
                }
                it = listM.iterator();
                sen0Var = (sen0) obj2;
                i = 0;
                while (it.hasNext()) {
                    czs0Var = (czs0) it.next();
                    this.d = sen0Var;
                    this.e = it;
                    this.c = i;
                    this.b = true;
                    if (sen0Var.emit(czs0Var, this) == rih1Var2) {
                        return rih1Var2;
                    }
                }
                return rih1Var;
            case 6:
                SceneTemplate.Quiz quiz = (SceneTemplate.Quiz) obj2;
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
                int i8 = this.c;
                SceneTemplate.Quiz.Item item = (SceneTemplate.Quiz.Item) this.d;
                item.getClass();
                ohz0 ohz0VarB = ukz0.b(quiz.n(), "#1ED760");
                ohz0 ohz0VarB2 = ukz0.b(quiz.u(), "#E91429");
                String strR = quiz.r();
                Outline outlineY = quiz.y();
                this.b = true;
                Object objD = ukz0.d(item, i8, (gw70) this.e, (bju) obj3, ohz0VarB, ohz0VarB2, strR, outlineY, this);
                return objD == rih1Var2 ? rih1Var2 : objD;
            case 7:
                Set set = (Set) obj3;
                l0x0 l0x0Var = (l0x0) this.e;
                ssw0 ssw0Var = (ssw0) this.d;
                boolean z12 = this.b;
                if (z12) {
                    if (z12) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                cmh1 cmh1VarC = ((opm) l0x0Var.b).a().c(new fu(this.c, l0x0Var, (LinkedHashMap) obj2, ssw0Var, (byte) 13));
                try {
                    cmh1VarC.b(set);
                    cmh1VarC.a(set);
                    break;
                } catch (Exception e) {
                    l0x0Var.y("Failed to fetch reaction contributions: " + e.getMessage());
                    ssw0Var.l(new bbr(map));
                    ssw0Var.c().H((Throwable) null);
                }
                vwz0 vwz0Var = new vwz0(cmh1VarC, (byte) 3);
                this.d = null;
                this.b = true;
                return jch0.s(ssw0Var, vwz0Var, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 8:
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
                this.b = true;
                vp70 vp70Var = l041.h;
                Object objI = ((l041) this.d).i((String) this.e, this.c, (hkm1) obj3, (voe1) obj2, this);
                return objI == rih1Var2 ? rih1Var2 : objI;
            case 9:
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
                mr20 mr20Var = (mr20) ((iu30) this.d).invoke(this.e);
                rn41 rn41Var = new rn41((AtomicInteger) obj3, this.c, (ssw0) obj2, (byte) 0);
                this.b = true;
                return mr20Var.collect(rn41Var, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 10:
                err0 err0Var = (hdn0) obj3;
                int i9 = this.c;
                ven0 ven0Var = (ven0) this.e;
                boolean z15 = this.b;
                if (!z15) {
                    hm5.M(obj);
                    int i10 = kv61.r;
                    if (((Boolean) ven0Var.getValue()).booleanValue() && i9 > err0Var.s()) {
                        xtb0 xtb0Var = (xtb0) this.d;
                        this.b = true;
                        df41 df41Var = xtb0.y;
                        if (xtb0Var.k(0, 0, this) == rih1Var2) {
                            return rih1Var2;
                        }
                    }
                } else {
                    if (!z15) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                int i11 = kv61.r;
                Boolean bool = (Boolean) ((tob1) obj2).getValue();
                bool.booleanValue();
                ven0Var.setValue(bool);
                err0Var.t(i9);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                boolean z16 = this.b;
                if (!z16) {
                    hm5.M(obj);
                    if (!u890.j(((ok71) this.d).f, Boolean.FALSE) || ((c380) this.e).size() <= 1) {
                        return rih1Var;
                    }
                    if (this.c == 0) {
                        this.b = true;
                        if (c2p1.A((xtb0) obj3, this) == rih1Var2) {
                            return rih1Var2;
                        }
                    }
                } else {
                    if (!z16) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ((iu30) obj2).invoke(ek71.a);
                return rih1Var;
            case grn1.d /* 12 */:
                boolean z17 = this.b;
                if (z17) {
                    if (z17) {
                        hm5.M(obj);
                        objA = obj;
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                peu0 peu0Var = ((vna1) this.d).d;
                String strUri = ((com.spotify.player.model.Context) this.e).uri();
                int i12 = this.c;
                this.b = true;
                objA = peu0Var.a(i12, strUri, this);
                if (objA == rih1Var2) {
                    return rih1Var2;
                }
                feu0 feu0Var = (heu0) objA;
                if (u890.j(feu0Var, eeu0.a)) {
                    t45 t45Var = (t45) obj3;
                    if (t45Var != null) {
                        t45Var.a("outcome", "cancel");
                        t45Var.g("command_to_player_start");
                    }
                    ((k7a1) obj2).invoke();
                    return rih1Var;
                }
                if (u890.j(feu0Var, geu0.a)) {
                    return rih1Var;
                }
                if (feu0Var instanceof feu0) {
                    Logger.e(feu0Var.a, "Error observing context change", new Object[0]);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 13:
                int i13 = this.c;
                c9n c9nVar2 = (c9n) this.d;
                boolean z18 = this.b;
                try {
                    if (!z18) {
                        hm5.M(obj);
                        xob1 xob1Var = ((bqb1) this.e).a;
                        this.d = c9nVar2;
                        this.b = true;
                        Object objY = fn31.Y(xob1Var.b, new sb91((Map) obj3, xob1Var, (lnm) null, (byte) 24), this);
                        if (objY != rih1Var2) {
                            objY = rih1Var;
                        }
                        if (objY == rih1Var2) {
                            rih1Var = rih1Var2;
                        }
                    } else {
                        if (!z18) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    return rih1Var;
                } catch (Throwable th) {
                    smo1.t(c9nVar2);
                    String str3 = (String) obj2;
                    StringBuilder sb = new StringBuilder("State Poster - Failed to report event ");
                    if (i13 == 1) {
                        str2 = "VIEW_URI";
                    } else if (i13 == 2) {
                        str2 = "FOCUS";
                    } else if (i13 == 3) {
                        str2 = "SCREEN_LOCK";
                    } else if (i13 != 4) {
                        str2 = i13 != 5 ? "null" : "MOVING";
                    } else {
                        str2 = "ACTIVE_CONNECTED_DEVICE";
                    }
                    sb.append(str2);
                    sb.append(" with data (");
                    sb.append(str3);
                    sb.append("), error: ");
                    sb.append(th);
                    sb.append(".message");
                    Logger.d(sb.toString(), new Object[0]);
                    return rih1Var;
                }
            default:
                gpj1 gpj1Var2 = (gpj1) obj3;
                boolean z19 = this.b;
                if (!z19) {
                    hm5.M(obj);
                    xgn0Var = gpj1Var2.c;
                    this.d = xgn0Var;
                    this.e = gpj1Var2;
                    this.b = true;
                    if (xgn0Var.a(this) == rih1Var2) {
                        return rih1Var2;
                    }
                    gpj1Var = gpj1Var2;
                } else {
                    if (!z19) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gpj1Var = (gpj1) this.e;
                    xgn0Var = (xgn0) this.d;
                    hm5.M(obj);
                }
                try {
                    if (!gpj1Var.f) {
                        gpj1Var.f = true;
                        mmr0Var = new mmr0(gpj1Var.f(), gpj1Var.e);
                        break;
                    } else {
                        mmr0Var = null;
                    }
                    xgn0Var.c((Object) null);
                    if (mmr0Var == null) {
                        return Boolean.FALSE;
                    }
                    List list = (List) mmr0Var.a;
                    String str4 = (String) mmr0Var.b;
                    dk31 dk31Var = gpj1Var2.b;
                    int i14 = this.c;
                    Map mapSingletonMap = str4 != null ? Collections.singletonMap("video_duration_seconds", str4) : null;
                    if (mapSingletonMap == null) {
                        mapSingletonMap = map;
                    }
                    Long l = (Long) obj2;
                    Map mapSingletonMap2 = l != null ? Collections.singletonMap("video_file_size", String.valueOf(l.longValue() / 1024)) : null;
                    if (mapSingletonMap2 != null) {
                        map = mapSingletonMap2;
                    }
                    return Boolean.valueOf(dk31Var.f(i14, mapSingletonMap, map, list));
                } catch (Throwable th2) {
                    xgn0Var.c((Object) null);
                    throw th2;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tv1(int i, Object obj, lnm lnmVar, gw70 gw70Var, bju bjuVar, SceneTemplate.Quiz quiz) {
        super(2, lnmVar);
        this.a = (byte) 6;
        this.c = i;
        this.d = obj;
        this.e = gw70Var;
        this.f = bjuVar;
        this.g = quiz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tv1(Object obj, Object obj2, int i, Object obj3, Object obj4, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.c = i;
        this.f = obj3;
        this.g = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tv1(Object obj, Object obj2, int i, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.c = i;
        this.g = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tv1(Object obj, Object obj2, Object obj3, int i, Object obj4, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.c = i;
        this.g = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tv1(iu30 iu30Var, iu30 iu30Var2, mu10 mu10Var, Consumer consumer, int i, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 1;
        this.d = iu30Var;
        this.e = iu30Var2;
        this.f = mu10Var;
        this.g = consumer;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tv1(rfo0 rfo0Var, int i, km61 km61Var, Integer num, tv80 tv80Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 4;
        this.d = rfo0Var;
        this.c = i;
        this.e = km61Var;
        this.f = num;
        this.g = tv80Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tv1(jkr0 jkr0Var, iu30 iu30Var, hdn0 hdn0Var, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 3;
        this.d = jkr0Var;
        this.e = iu30Var;
        this.f = hdn0Var;
        this.g = ven0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tv1(b1t0 b1t0Var, sen0 sen0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 5;
        this.f = b1t0Var;
        this.g = sen0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tv1(gpj1 gpj1Var, int i, Long l, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 14;
        this.f = gpj1Var;
        this.c = i;
        this.g = l;
    }
}
