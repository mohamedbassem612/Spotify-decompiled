package p;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.accessory.categorizer.BluetoothCategorizer;
import com.spotify.accessory.categorizer.CategorizerResponse;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.completable.CompletableObserveOn;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class q4 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q4(Object obj, Object obj2, lnm lnmVar, byte b) {
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
                q4 q4Var = new q4((x4) obj2, lnmVar, (byte) 0);
                q4Var.c = obj;
                return q4Var;
            case 1:
                return new q4((idn0) this.c, (dy60) obj2, lnmVar, (byte) 1);
            case 2:
                return new q4((idn0) this.c, (ey60) obj2, lnmVar, (byte) 2);
            case 3:
                return new q4((hi) this.c, (BluetoothCategorizer) obj2, lnmVar, (byte) 3);
            case 4:
                q4 q4Var2 = new q4((kly0) obj2, lnmVar, (byte) 4);
                q4Var2.c = obj;
                return q4Var2;
            case 5:
                q4 q4Var3 = new q4((gu) obj2, lnmVar, (byte) 5);
                q4Var3.c = obj;
                return q4Var3;
            case 6:
                return new q4((Intent) this.c, (Context) obj2, lnmVar, (byte) 6);
            case 7:
                q4 q4Var4 = new q4((jb0) obj2, lnmVar, (byte) 7);
                q4Var4.c = obj;
                return q4Var4;
            case 8:
                q4 q4Var5 = new q4((ug0) obj2, lnmVar, (byte) 8);
                q4Var5.c = obj;
                return q4Var5;
            case 9:
                q4 q4Var6 = new q4((tk0) obj2, lnmVar, (byte) 9);
                q4Var6.c = obj;
                return q4Var6;
            case 10:
                return new q4((il0) obj2, lnmVar, (byte) 10);
            case 11:
                q4 q4Var7 = new q4((il0) obj2, lnmVar, (byte) 11);
                q4Var7.c = obj;
                return q4Var7;
            case 12:
                q4 q4Var8 = new q4((km0) obj2, lnmVar, (byte) 12);
                q4Var8.c = obj;
                return q4Var8;
            case 13:
                return new q4((rn0) this.c, (jn0) obj2, lnmVar, (byte) 13);
            case 14:
                q4 q4Var9 = new q4((nt0) obj2, lnmVar, (byte) 14);
                q4Var9.c = obj;
                return q4Var9;
            case 15:
                q4 q4Var10 = new q4((gv0) obj2, lnmVar, (byte) 15);
                q4Var10.c = obj;
                return q4Var10;
            case 16:
                q4 q4Var11 = new q4((dy0) obj2, lnmVar, (byte) 16);
                q4Var11.c = obj;
                return q4Var11;
            case 17:
                return new q4((u11) this.c, (b1f0) obj2, lnmVar, (byte) 17);
            case 18:
                return new q4((zd1) this.c, (f9w) obj2, lnmVar, (byte) 18);
            case 19:
                return new q4((ak1) this.c, (g401) obj2, lnmVar, (byte) 19);
            case 20:
                return new q4((ven0) this.c, (bhd) obj2, lnmVar, (byte) 20);
            case 21:
                return new q4((upo) this.c, (mj11) obj2, lnmVar, (byte) 21);
            case 22:
                return new q4((fu1) this.c, (upo) obj2, lnmVar, (byte) 22);
            case 23:
                return new q4((e4b1) this.c, (yr01) obj2, lnmVar, (byte) 23);
            case 24:
                q4 q4Var12 = new q4((w62) obj2, lnmVar, (byte) 24);
                q4Var12.c = obj;
                return q4Var12;
            case 25:
                return new q4((u961) this.c, (String) obj2, lnmVar, (byte) 25);
            case 26:
                q4 q4Var13 = new q4((qns0) obj2, lnmVar, (byte) 26);
                q4Var13.c = obj;
                return q4Var13;
            case 27:
                return new q4((iac0) this.c, (pd2) obj2, lnmVar, (byte) 27);
            case 28:
                return new q4((af2) this.c, (ma2) obj2, lnmVar, (byte) 28);
            default:
                return new q4((vf2) this.c, (String) obj2, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return ((q4) create((iud) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 1:
                return ((q4) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 2:
                return ((q4) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 3:
                return ((q4) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 4:
                return ((q4) create((vr20) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 5:
                return ((q4) create((ssw0) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 6:
                return ((q4) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 7:
                return ((q4) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 8:
                return ((q4) create((ssw0) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 9:
                return ((q4) create((vr20) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 10:
                return ((q4) create((vr20) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 11:
                return ((q4) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 12:
                return ((q4) create((Boolean) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 13:
                return ((q4) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 14:
                return ((q4) create((tv80) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 15:
                return ((q4) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 16:
                return ((q4) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 17:
                return ((q4) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 18:
                return ((q4) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 19:
                return ((q4) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 20:
                return ((q4) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 21:
                return ((q4) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 22:
                return ((q4) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 23:
                return ((q4) create((vr20) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 24:
                return ((q4) create((bn70) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 25:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((q4) create(bool, (lnm) obj2)).invokeSuspend(rih1Var);
            case 26:
                return ((q4) create((vr20) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 27:
                return ((q4) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 28:
                return ((q4) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            default:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((q4) create(bool2, (lnm) obj2)).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        Object objI;
        int i;
        bpb1 bpb1Var;
        Object objY;
        zxc0 m231Var;
        Object objB;
        Long lA;
        Long l;
        Object objD;
        wo1 wo1Var;
        Object objA;
        byte b = this.a;
        int i2 = 4;
        String str = "";
        rih1 rih1Var = rih1.a;
        Object obj2 = this.d;
        rih1 rih1Var2 = d9n.a;
        zxc0 zxc0Var = null;
        switch (b) {
            case 0:
                aud audVar = (iud) this.c;
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    if (audVar instanceof aud) {
                        return new i4(audVar.a);
                    }
                    if (audVar instanceof ztd) {
                        wh71 wh71Var = ((x4) obj2).b;
                        ztd ztdVar = (ztd) audVar;
                        dlw0 dlw0Var = new dlw0(ztdVar.b, ztdVar.c);
                        this.c = null;
                        this.b = true;
                        if (wh71Var.a(dlw0Var, this) == rih1Var2) {
                            return rih1Var2;
                        }
                    }
                } else if (z) {
                    hm5.M(obj);
                } else {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.b = true;
                    return ((idn0) this.c).b((dy60) obj2, this) == rih1Var2 ? rih1Var2 : rih1Var;
                }
                if (z2) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    this.b = true;
                    return ((idn0) this.c).b((ey60) obj2, this) == rih1Var2 ? rih1Var2 : rih1Var;
                }
                if (z3) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                qi qiVar = (hi) this.c;
                boolean z4 = this.b;
                try {
                    if (!z4) {
                        hm5.M(obj);
                        if (!u890.j(qiVar.h, ji.b)) {
                            Objects.toString(qiVar);
                            return qiVar;
                        }
                        Objects.toString(qiVar);
                        BluetoothCategorizer bluetoothCategorizer = (BluetoothCategorizer) obj2;
                        String strB = qiVar.b;
                        if (strB != null || (strB = qiVar.b()) != null) {
                            str = strB;
                        }
                        mr20 mr20VarCategorizeAndUpdateCaches = bluetoothCategorizer.categorizeAndUpdateCaches(str);
                        this.b = true;
                        objI = b5p1.i(mr20VarCategorizeAndUpdateCaches, this);
                        if (objI == rih1Var2) {
                            return rih1Var2;
                        }
                    } else {
                        if (!z4) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objI = obj;
                    }
                    CategorizerResponse categorizerResponse = (CategorizerResponse) objI;
                    String category = categorizerResponse.getCategory();
                    if (u890.j(category, "app")) {
                        i = 1;
                    } else if (u890.j(category, "car")) {
                        i = 2;
                    } else if (u890.j(category, "headphones")) {
                        i = 3;
                    } else if (u890.j(category, "speaker")) {
                        i = i2;
                    } else {
                        if (u890.j(category, "wearable")) {
                            i2 = 5;
                        } else if (u890.j(category, "face_wearable")) {
                            i = 6;
                        } else {
                            i2 = 7;
                        }
                        i = i2;
                    }
                    qi qiVarC = qi.c(qiVar, (String) null, (String) null, (String) null, (List) null, (Boolean) null, new ii(categorizerResponse.getCompany(), i, categorizerResponse.getModel(), categorizerResponse.getVersion(), categorizerResponse.isInterapp(), categorizerResponse.getDiplayName()), (cn70) null, 191);
                    qiVarC.toString();
                    return qiVarC;
                } catch (Exception e) {
                    Logger.e(e, "Error categorizing accessory: " + qiVar, new Object[0]);
                }
                break;
            case 4:
                vr20 vr20Var = (vr20) this.c;
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
                wi wiVar = new wi(((dxz0) ((kly0) obj2).get()).b().d, ri.b);
                this.c = null;
                this.b = true;
                return vr20Var.emit(wiVar, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 5:
                gu guVar = (gu) obj2;
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
                fn31.T(ssw0Var, (o8n) null, 0, new bu(guVar, (lnm) null, (byte) 0), 3);
                mr20 mr20VarE = ((jq) guVar.c.get()).e();
                cu cuVar = new cu(ssw0Var, (byte) 0);
                this.c = null;
                this.b = true;
                return mr20VarE.collect(cuVar, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 6:
                Intent intent = (Intent) this.c;
                boolean z7 = this.b;
                try {
                    if (z7) {
                        if (z7) {
                            hm5.M(obj);
                            return rih1Var;
                        }
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    Bundle extras = intent.getExtras();
                    if (extras == null) {
                        throw new IllegalArgumentException("The intent must have action parameters extras.");
                    }
                    Bundle bundle = extras.getBundle("ActionCallbackBroadcastReceiver:parameters");
                    if (bundle == null) {
                        throw new IllegalArgumentException("The intent must contain a parameters bundle using extra: ActionCallbackBroadcastReceiver:parameters");
                    }
                    scn0 scn0VarA = w0h1.A(new y60[0]);
                    for (String str2 : bundle.keySet()) {
                        scn0VarA.a(new x60(str2), bundle.get(str2));
                    }
                    if (extras.containsKey("android.widget.extra.CHECKED")) {
                        scn0VarA.a(omo1.a, Boolean.valueOf(extras.getBoolean("android.widget.extra.CHECKED")));
                    }
                    String string = extras.getString("ActionCallbackBroadcastReceiver:callbackClass");
                    if (string == null) {
                        throw new IllegalArgumentException("The intent must contain a work class name string using extra: ActionCallbackBroadcastReceiver:callbackClass");
                    }
                    if (!intent.hasExtra("ActionCallbackBroadcastReceiver:appWidgetId")) {
                        throw new IllegalArgumentException("To update the widget, the intent must contain the AppWidgetId integer using extra: ActionCallbackBroadcastReceiver:appWidgetId");
                    }
                    extras.getInt("ActionCallbackBroadcastReceiver:appWidgetId");
                    this.b = true;
                    i1k0.t((Context) obj2, string, scn0VarA);
                    return rih1Var == rih1Var2 ? rih1Var2 : rih1Var;
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable unused) {
                    return rih1Var;
                }
            case 7:
                jb0 jb0Var = (jb0) obj2;
                c9n c9nVar = (c9n) this.c;
                boolean z8 = this.b;
                if (z8) {
                    if (z8) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                plu pluVarW = rqt0.w(new nf(yoi1.g(jb0Var.a.d()), (byte) 4), ft.W0, rqt0.b);
                hb0 hb0Var = new hb0(c9nVar, jb0Var);
                this.c = null;
                this.b = true;
                return pluVarW.collect(hb0Var, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 8:
                ug0 ug0Var = (ug0) obj2;
                ssw0 ssw0Var2 = (ssw0) this.c;
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
                tg0 tg0Var = new tg0(ug0Var, ssw0Var2);
                ug0Var.a.g(tg0Var);
                y4 y4Var = new y4(ug0Var, tg0Var, (byte) 9);
                this.c = null;
                this.b = true;
                return jch0.s(ssw0Var2, y4Var, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 9:
                vr20 vr20Var2 = (vr20) this.c;
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
                Object obj3 = ((tk0) obj2).a.get();
                this.c = null;
                this.b = true;
                return vr20Var2.emit(obj3, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 10:
                boolean z11 = this.b;
                if (!z11) {
                    hm5.M(obj);
                    il0 il0Var = (il0) obj2;
                    bpb1Var = il0Var.b;
                    this.c = bpb1Var;
                    this.b = true;
                    fns fnsVar = igu.a;
                    objY = fn31.Y(b3s.c, new q4(il0Var, zxc0Var, (byte) 11), this);
                    if (objY == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z11) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bpb1Var = (bpb1) this.c;
                    hm5.M(obj);
                    objY = obj;
                }
                bpb1Var.l(objY);
                return rih1Var;
            case 11:
                boolean z12 = this.b;
                try {
                    if (!z12) {
                        hm5.M(obj);
                        j72 j72Var = ((il0) obj2).a;
                        this.c = null;
                        this.b = true;
                        objB = j72Var.b(this);
                        if (objB == rih1Var2) {
                            return rih1Var2;
                        }
                    } else {
                        if (!z12) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objB = obj;
                    }
                    m231Var = (jk40) objB;
                    break;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                jk40 jk40Var = (jk40) (m231Var instanceof m231 ? null : m231Var);
                return jk40Var != null ? new it61(jk40Var) : new ht61(new Integer(2131961689), 0);
            case 12:
                Boolean bool = (Boolean) this.c;
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
                if (!bool.booleanValue()) {
                    return rih1Var;
                }
                this.c = null;
                this.b = true;
                return ((km0) obj2).i(this) == rih1Var2 ? rih1Var2 : rih1Var;
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
                rn0 rn0Var = (rn0) this.c;
                Single map = rn0Var.a.a(((jn0) obj2).build()).map(new o9x0(rn0Var));
                this.b = true;
                Object objJ = fc11.j(map, this);
                return objJ == rih1Var2 ? rih1Var2 : objJ;
            case 14:
                nt0 nt0Var = (nt0) obj2;
                tv80 tv80Var = (tv80) this.c;
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
                nt0Var.o.b(6);
                this.c = null;
                this.b = true;
                return nt0Var.c(tv80Var, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 15:
                c9n c9nVar2 = (c9n) this.c;
                boolean z16 = this.b;
                if (z16 && !z16) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                while (smo1.u(c9nVar2)) {
                    gv0 gv0Var = (gv0) obj2;
                    int i3 = gv0.P0;
                    k5u0 k5u0VarA = gv0Var.a();
                    if (k5u0VarA != null && (lA = k5u0VarA.a(gv0Var.X.b())) != null && (l = k5u0VarA.d) != null) {
                        bpb1 bpb1Var2 = gv0Var.Z;
                        mmr0 mmr0Var = new mmr0(lA, l);
                        bpb1Var2.getClass();
                        bpb1Var2.m((Object) null, mmr0Var);
                    }
                    long j = hzd1.a ? 10000L : 32L;
                    this.c = c9nVar2;
                    this.b = true;
                    if (hap1.i(j, this) == rih1Var2) {
                        return rih1Var2;
                    }
                }
                return rih1Var;
            case 16:
                c9n c9nVar3 = (c9n) this.c;
                boolean z17 = this.b;
                try {
                    if (!z17) {
                        hm5.M(obj);
                        me91 me91Var = ((dy0) obj2).a;
                        jx0 jx0Var = jx0.e;
                        this.c = c9nVar3;
                        this.b = true;
                        if (me91Var.a(jx0Var, this) == rih1Var2) {
                            rih1Var = rih1Var2;
                        }
                    } else {
                        if (!z17) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    return rih1Var;
                } catch (Exception e3) {
                    smo1.t(c9nVar3);
                    Logger.e(e3, "Error in SPL subscription", new Object[0]);
                    return rih1Var;
                }
            case 17:
                boolean z18 = this.b;
                if (!z18) {
                    hm5.M(obj);
                    hj01 hj01Var = ((u11) this.c).j;
                    b1f0 b1f0Var = (b1f0) obj2;
                    long j2 = b1f0Var.d;
                    boolean z19 = !b1f0Var.e;
                    this.b = true;
                    objD = hj01Var.d(j2, z19, this);
                    if (objD == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z18) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objD = ((e331) obj).a;
                }
                return new e331(objD);
            case 18:
                f9w f9wVar = (f9w) obj2;
                zd1 zd1Var = (zd1) this.c;
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
                xyc0 xyc0Var = (iyc0) zd1Var.d;
                String str3 = f9wVar.d;
                List listSingletonList = Collections.singletonList(f9wVar.b);
                String str4 = ((lik1) zd1Var.b).a;
                String str5 = f9wVar.c;
                tv80 tv80Var2 = f9wVar.e;
                zxc0Var = tv80Var2 != null ? new zxc0(tv80Var2.a) : null;
                this.b = true;
                Object objE = xyc0Var.e(str3, listSingletonList, "end", str4, str5, zxc0Var, this);
                return objE == rih1Var2 ? rih1Var2 : objE;
            case 19:
                String str6 = ((g401) obj2).a;
                boolean z21 = this.b;
                if (!z21) {
                    hm5.M(obj);
                    ak1 ak1Var = (ak1) this.c;
                    sxz0 sxz0Var = ak1Var.b;
                    frd1 frd1Var = ak1Var.c;
                    this.b = true;
                    if (sxz0Var.b(frd1Var, str6, this) == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z21) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return new s401(str6);
            case 20:
                boolean z22 = this.b;
                if (!z22) {
                    hm5.M(obj);
                    vu30 vu30Var = (vu30) ((ven0) this.c).getValue();
                    bhd bhdVar = (bhd) obj2;
                    if (bhdVar.equals(ygd.a)) {
                        wo1Var = wo1.c;
                    } else if (bhdVar.equals(zgd.a)) {
                        wo1Var = wo1.b;
                    } else if (bhdVar.equals(ahd.a)) {
                        wo1Var = wo1.a;
                    } else {
                        eg.o();
                    }
                    this.b = true;
                    return vu30Var.invoke(wo1Var, this) == rih1Var2 ? rih1Var2 : rih1Var;
                }
                if (z22) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 21:
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
                qt20 qt20VarV = z4p1.v(rwq.q(new rr1((upo) this.c, (byte) 2)), 1);
                hb0 hb0Var2 = new hb0((mj11) obj2, (byte) 2);
                this.b = true;
                Object objCollect = qt20VarV.collect(new pl1(hb0Var2, (byte) 3), this);
                if (objCollect != rih1Var2) {
                    objCollect = rih1Var;
                }
                return objCollect == rih1Var2 ? rih1Var2 : rih1Var;
            case 22:
                fu1 fu1Var = (fu1) this.c;
                fo1 fo1Var = fu1Var.b;
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
                if (!fo1Var.b() || fu1Var.e == 1 || ((yv51) fo1Var.b.get("atp")) == null) {
                    return rih1Var;
                }
                this.b = true;
                return upo.e((upo) obj2, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 23:
                yr01 yr01Var = (yr01) obj2;
                String str7 = yr01Var.c;
                boolean z25 = this.b;
                try {
                    if (!z25) {
                        hm5.M(obj);
                        aas aasVar = (aas) ((e4b1) this.c).b;
                        String str8 = yr01Var.d;
                        String str9 = yr01Var.e;
                        if (str9 != null) {
                            str = str9;
                        }
                        CompletableObserveOn completableObserveOnB = aasVar.b(str7, str8, 2, str);
                        this.b = true;
                        if (fc11.i(completableObserveOnB, this) == rih1Var2) {
                            rih1Var = rih1Var2;
                        }
                    } else {
                        if (!z25) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    return rih1Var;
                } catch (CancellationException e4) {
                    throw e4;
                } catch (Exception e5) {
                    Logger.e(e5, "Recents :: failed to add %s to queue", new Object[]{str7});
                    return rih1Var;
                }
            case 24:
                w62 w62Var = (w62) obj2;
                bn70 bn70Var = (bn70) this.c;
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
                rm5 rm5Var = (rm5) w62Var.d;
                String str10 = bn70Var.b.a;
                if (!str10.equals((String) rm5Var.a)) {
                    rm5Var.a = str10;
                    ((bqb1) rm5Var.b).a(1, str10);
                }
                q62 q62Var = (q62) w62Var.c;
                String str11 = bn70Var.b.a;
                this.c = null;
                this.b = true;
                return q62Var.a(str11, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 25:
                boolean z27 = this.b;
                if (!z27) {
                    hm5.M(obj);
                    qns0 qns0Var = (qns0) ((ynb0) ((u961) this.c).c).get();
                    List listSingletonList2 = Collections.singletonList((String) obj2);
                    this.b = true;
                    objA = qns0Var.a("age_assurance_controller_:observer_can_play_content", listSingletonList2, this, true);
                    if (objA == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z27) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objA = obj;
                }
                return o7h.q0((List) objA);
            case 26:
                vr20 vr20Var3 = (vr20) this.c;
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
                mr20 mr20VarC = ((qns0) obj2).c();
                this.c = null;
                this.b = true;
                return l4p1.s(vr20Var3, mr20VarC, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 27:
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
                iac0 iac0Var = (iac0) this.c;
                qm qmVar = new qm((pd2) obj2, (lnm) null, (byte) 12);
                this.b = true;
                return z8p1.u(iac0Var, w8c0.e, qmVar, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 28:
                af2 af2Var = (af2) this.c;
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
                mr20 mr20VarC2 = af2Var.e.c("aa-state", "UNSET");
                vt vtVar = new vt(af2Var, (ma2) obj2, (byte) 14);
                this.b = true;
                Object objCollect2 = mr20VarC2.collect(new qkv0(vtVar, (byte) 25), this);
                if (objCollect2 != rih1Var2) {
                    objCollect2 = rih1Var;
                }
                return objCollect2 == rih1Var2 ? rih1Var2 : rih1Var;
            default:
                boolean z31 = this.b;
                if (z31) {
                    if (z31) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Single map2 = ((qns0) ((vf2) this.c).c).b("age_assurance_video_blocker_service:should_block_video", Collections.singletonList((String) obj2), false).map(o9p1.e);
                this.b = true;
                Object objJ2 = fc11.j(map2, this);
                return objJ2 == rih1Var2 ? rih1Var2 : objJ2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q4(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
    }
}
