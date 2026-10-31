package p;

import android.app.Application;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.os.Build;
import com.spotify.base.java.logging.Logger;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.scrollsita.v1.Section;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qm extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qm(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return new qm((tm) obj2, lnmVar, (byte) 0);
            case 1:
                return new qm((e2b0) obj2, lnmVar, (byte) 1);
            case 2:
                return new qm((w9u0) obj2, lnmVar, (byte) 2);
            case 3:
                return new qm((vt0) obj2, lnmVar, (byte) 3);
            case 4:
                return new qm((ycc1) obj2, lnmVar, (byte) 4);
            case 5:
                return new qm((tz0) obj2, lnmVar, (byte) 5);
            case 6:
                return new qm((tm) obj2, lnmVar, (byte) 6);
            case 7:
                return new qm((jt1) obj2, lnmVar, (byte) 7);
            case 8:
                return new qm((km0) obj2, lnmVar, (byte) 8);
            case 9:
                return new qm((na2) obj2, lnmVar, (byte) 9);
            case 10:
                return new qm((ta2) obj2, lnmVar, (byte) 10);
            case 11:
                return new qm((wa2) obj2, lnmVar, (byte) 11);
            case 12:
                return new qm((pd2) obj2, lnmVar, (byte) 12);
            case 13:
                return new qm((ii2) obj2, lnmVar, (byte) 13);
            case 14:
                return new qm((ui2) obj2, lnmVar, (byte) 14);
            case 15:
                return new qm((rj2) obj2, lnmVar, (byte) 15);
            case 16:
                return new qm((eyh0) obj2, lnmVar, (byte) 16);
            case 17:
                return new qm((em0) obj2, lnmVar, (byte) 17);
            case 18:
                return new qm((qu2) obj2, lnmVar, (byte) 18);
            case 19:
                return new qm((bv2) obj2, lnmVar, (byte) 19);
            case 20:
                return new qm((ov2) obj2, lnmVar, (byte) 20);
            case 21:
                return new qm((gy2) obj2, lnmVar, (byte) 21);
            case 22:
                return new qm((yu3) obj2, lnmVar, (byte) 22);
            case 23:
                return new qm((m64) obj2, lnmVar, (byte) 23);
            case 24:
                return new qm((a84) obj2, lnmVar, (byte) 24);
            case 25:
                return new qm((d520) obj2, lnmVar, (byte) 25);
            case 26:
                return new qm((bj5) obj2, lnmVar, (byte) 26);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new qm((yv5) obj2, lnmVar, (byte) 27);
            default:
                return new qm((y66) obj2, lnmVar, (byte) 28);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
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
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((rih1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
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
            case 18:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
            case 19:
                return create((rih1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 20:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 24:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return create((String) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        Object objI;
        Object objJ;
        Single singleJust;
        Object objR;
        c9n c9nVar;
        byte b = this.a;
        byte b2 = 10;
        byte b3 = 0;
        Serializable serializable = rih1.a;
        Object obj2 = this.c;
        Serializable serializable2 = d9n.a;
        lnm lnmVar = null;
        switch (b) {
            case 0:
                tm tmVar = (tm) obj2;
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    any anyVar = new any(rwq.q(new g3(tmVar, (byte) 3)), (byte) 18);
                    this.b = true;
                    objI = b5p1.i(anyVar, this);
                    if (objI == serializable2) {
                        return serializable2;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objI = obj;
                }
                ((paj0) tmVar.c).c((MessageResponseToken) objI);
                return serializable;
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.b = true;
                    Serializable serializableA = ((e2b0) obj2).a(this);
                    return serializableA == serializable2 ? serializable2 : serializableA;
                }
                if (z2) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    Single singleA = ((w9u0) obj2).a(new g9u0("ads-playercontroller", false));
                    this.b = true;
                    return fc11.j(singleA, this) == serializable2 ? serializable2 : serializable;
                }
                if (z3) {
                    hm5.M(obj);
                    return serializable;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
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
                any anyVar2 = new any(((vt0) obj2).j, (byte) 18);
                this.b = true;
                Object objI2 = b5p1.i(anyVar2, this);
                return objI2 == serializable2 ? serializable2 : objI2;
            case 4:
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        hm5.M(obj);
                        return serializable;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                trd1 trd1Var = (trd1) ((ycc1) obj2).b;
                Map mapSingletonMap = Collections.singletonMap("focus", "true");
                this.b = true;
                return c921.H(trd1Var.b, new pec1(trd1Var, mapSingletonMap, lnmVar, b2), this) == serializable2 ? serializable2 : serializable;
            case 5:
                boolean z6 = this.b;
                if (!z6) {
                    hm5.M(obj);
                    eyh0 eyh0Var = ((tz0) obj2).a;
                    this.b = true;
                    return eyh0Var.p(this) == serializable2 ? serializable2 : serializable;
                }
                if (z6) {
                    hm5.M(obj);
                    return serializable;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                boolean z7 = this.b;
                if (!z7) {
                    hm5.M(obj);
                    zbr0 zbr0Var = (zbr0) ((tm) obj2).d;
                    this.b = true;
                    return zbr0Var.b(this) == serializable2 ? serializable2 : serializable;
                }
                if (z7) {
                    hm5.M(obj);
                    return serializable;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                boolean z8 = this.b;
                if (z8) {
                    if (z8) {
                        hm5.M(obj);
                        return serializable;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                so1 so1Var = ((jt1) obj2).I1;
                if (so1Var == null) {
                    u890.C("dataSource");
                    throw null;
                }
                ezc ezcVarG = yoi1.g(so1.o(so1Var).a);
                ft1 ft1Var = ft1.b;
                this.b = true;
                return ezcVarG.collect(ft1Var, this) == serializable2 ? serializable2 : serializable;
            case 8:
                boolean z9 = this.b;
                if (z9) {
                    if (z9) {
                        hm5.M(obj);
                        return serializable;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                this.b = true;
                trd1 trd1Var2 = (trd1) ((km0) obj2).c;
                Object objH = c921.H(trd1Var2.b, new pec1(trd1Var2, sqg0.J(new mmr0[]{new mmr0("submodel", Build.MODEL), new mmr0("make", Build.MANUFACTURER), new mmr0("os_version", String.valueOf(Build.VERSION.SDK_INT))}), lnmVar, b2), this);
                if (objH != serializable2) {
                    objH = serializable;
                }
                return objH == serializable2 ? serializable2 : serializable;
            case 9:
                boolean z10 = this.b;
                if (!z10) {
                    hm5.M(obj);
                    f1n0 f1n0Var = ((na2) obj2).h;
                    this.b = true;
                    return f1n0Var.a(this) == serializable2 ? serializable2 : serializable;
                }
                if (z10) {
                    hm5.M(obj);
                    return serializable;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 10:
                ta2 ta2Var = (ta2) obj2;
                boolean z11 = this.b;
                if (z11) {
                    if (z11) {
                        hm5.M(obj);
                        return serializable;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarC = ta2Var.b.c("aa-state", "UNSET");
                hb0 hb0Var = new hb0(ta2Var, (byte) 3);
                this.b = true;
                Object objCollect = mr20VarC.collect(new qkv0(hb0Var, (byte) 25), this);
                if (objCollect != serializable2) {
                    objCollect = serializable;
                }
                return objCollect == serializable2 ? serializable2 : serializable;
            case 11:
                wa2 wa2Var = (wa2) obj2;
                boolean z12 = this.b;
                if (z12) {
                    if (z12) {
                        hm5.M(obj);
                        return serializable;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarC2 = wa2Var.c.c("aa-state", "UNSET");
                vi viVar = new vi(wa2Var, (byte) 1);
                this.b = true;
                Object objCollect2 = mr20VarC2.collect(new qkv0(viVar, (byte) 25), this);
                if (objCollect2 != serializable2) {
                    objCollect2 = serializable;
                }
                return objCollect2 == serializable2 ? serializable2 : serializable;
            case 12:
                boolean z13 = this.b;
                if (!z13) {
                    hm5.M(obj);
                    this.b = true;
                    return ((pd2) obj2).a(5000L, this) == serializable2 ? serializable2 : serializable;
                }
                if (z13) {
                    hm5.M(obj);
                    return serializable;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                boolean z14 = this.b;
                if (z14) {
                    if (!z14) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        hm5.M(obj);
                    }
                    return null;
                }
                hm5.M(obj);
                ii2 ii2Var = (ii2) obj2;
                xe01 xe01Var = ii2Var.b.b;
                hb0 hb0Var2 = new hb0(ii2Var, (byte) 4);
                this.b = true;
                if (xe01Var.a.collect(hb0Var2, this) == serializable2) {
                    return serializable2;
                }
                jah.d();
                return null;
            case 14:
                ui2 ui2Var = (ui2) obj2;
                boolean z15 = this.b;
                if (z15) {
                    if (z15) {
                        hm5.M(obj);
                        return serializable;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarU = rqt0.u(new xr0(ui2Var.a.b, (byte) 3));
                hb0 hb0Var3 = new hb0(ui2Var, (byte) 5);
                this.b = true;
                return mr20VarU.collect(hb0Var3, this) == serializable2 ? serializable2 : serializable;
            case 15:
                rj2 rj2Var = (rj2) obj2;
                boolean z16 = this.b;
                try {
                    if (!z16) {
                        hm5.M(obj);
                        Context context = rj2Var.a;
                        af4 af4VarE = rj2Var.b.e(new qj2(new af4(true, false, 13, true, (feh1) null), (byte) 0));
                        mbo0 mbo0Var = rj2Var.e;
                        si8 si8Var = rj2Var.f;
                        context.getClass();
                        af4VarE.getClass();
                        mbo0Var.getClass();
                        eyh0 eyh0VarL = new kp5(context, af4VarE, mbo0Var, si8Var).l();
                        dt0 dt0Var = new dt0(rj2Var, (lnm) null, (byte) 6);
                        this.b = true;
                        objJ = eyh0VarL.J(dt0Var, this);
                        if (objJ == serializable2) {
                            return serializable2;
                        }
                    } else {
                        if (!z16) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objJ = obj;
                    }
                    rj2Var.a((gn2) objJ);
                    return serializable;
                } catch (Exception e) {
                    Logger.e(e, "Age verification failed with exception, allowing session to continue", new Object[0]);
                    return serializable;
                }
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
                hj2 hj2Var = (hj2) ((eyh0) obj2).b;
                this.b = true;
                Object objA = hj2Var.a(this);
                return objA == serializable2 ? serializable2 : objA;
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
                Flowable flowable = (Flowable) ((em0) obj2).c;
                vbm[] vbmVarArr = q601.a;
                kge kgeVar = new kge(flowable);
                this.b = true;
                Object objI3 = b5p1.i(kgeVar, this);
                return objI3 == serializable2 ? serializable2 : objI3;
            case 18:
                qu2 qu2Var = (qu2) obj2;
                boolean z19 = this.b;
                if (z19) {
                    if (!z19) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        hm5.M(obj);
                    }
                    return null;
                }
                hm5.M(obj);
                xe01 xe01Var2 = ((yo2) ((ynb0) qu2Var.d).get()).s;
                hb0 hb0Var4 = new hb0(qu2Var, (byte) 6);
                this.b = true;
                if (xe01Var2.a.collect(hb0Var4, this) == serializable2) {
                    return serializable2;
                }
                jah.d();
                return null;
            case 19:
                boolean z20 = this.b;
                if (!z20) {
                    hm5.M(obj);
                    this.b = true;
                    Object objA2 = ((bv2) obj2).a(this);
                    return objA2 == serializable2 ? serializable2 : objA2;
                }
                if (z20) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 20:
                boolean z21 = this.b;
                if (z21) {
                    if (z21) {
                        hm5.M(obj);
                        return serializable;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                this.b = true;
                int i = ov2.d;
                ((ov2) obj2).b(this);
                return serializable == serializable2 ? serializable2 : serializable;
            case 21:
                gy2 gy2Var = (gy2) obj2;
                AtomicBoolean atomicBoolean = gy2Var.d;
                boolean z22 = this.b;
                try {
                    if (!z22) {
                        hm5.M(obj);
                        Flowable flowable2 = gy2Var.a;
                        vbm[] vbmVarArr2 = q601.a;
                        lt20 lt20Var = new lt20(new fu20(new kge(flowable2), new hi2(gy2Var, (lnm) null, (byte) 6), (byte) 1), new jk(3, (lnm) null, (byte) 6), (byte) 0);
                        this.b = true;
                        if (l4p1.p(lt20Var, this) == serializable2) {
                            return serializable2;
                        }
                    } else {
                        if (!z22) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    atomicBoolean.set(false);
                    return serializable;
                } catch (Throwable th) {
                    atomicBoolean.set(false);
                    throw th;
                }
            case 22:
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
                yu3 yu3Var = (yu3) obj2;
                this.b = true;
                ohd ohdVar = new ohd(1, aym.t(this));
                ohdVar.t();
                xu3 xu3Var = new xu3(ohdVar, yu3Var);
                ((kt91) yu3Var.c).a(xu3Var);
                ohdVar.n(new cc2(yu3Var, xu3Var, (byte) 16));
                Object objR2 = ohdVar.r();
                return objR2 == serializable2 ? serializable2 : objR2;
            case 23:
                boolean z24 = this.b;
                if (z24) {
                    if (z24) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20Var = ((m64) obj2).b;
                s4 s4Var = new s4(2, (lnm) null, (byte) 12);
                this.b = true;
                Object objJ2 = b5p1.j(mr20Var, s4Var, this);
                return objJ2 == serializable2 ? serializable2 : objJ2;
            case 24:
                boolean z25 = this.b;
                if (z25) {
                    if (z25) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                a84 a84Var = (a84) obj2;
                Context context2 = a84Var.d;
                BluetoothAdapter bluetoothAdapter = a84Var.a;
                if (bluetoothAdapter == null || !a84Var.b.a()) {
                    singleJust = Single.just(z6x.a);
                } else {
                    singleJust = Build.VERSION.SDK_INT >= 33 ? Observable.combineLatest(j541.i(bluetoothAdapter, context2).toObservable(), Single.create(new em3(bluetoothAdapter, context2, (byte) 6)).toObservable(), ns80.i).firstOrError() : j541.i(bluetoothAdapter, context2).map(bya0.g);
                    singleJust.getClass();
                }
                this.b = true;
                Object objJ3 = fc11.j(singleJust, this);
                return objJ3 == serializable2 ? serializable2 : objJ3;
            case 25:
                d520 d520Var = (d520) obj2;
                boolean z26 = this.b;
                try {
                    if (!z26) {
                        hm5.M(obj);
                        this.b = true;
                        ohd ohdVar2 = new ohd(1, aym.t(this));
                        ohdVar2.t();
                        d520Var.e = ohdVar2;
                        d520Var.z().connect();
                        if (!((m85) d520Var.c).a()) {
                            ohdVar2.n(new ve3(d520Var, (byte) 8));
                        }
                        objR = ohdVar2.r();
                        if (objR == serializable2) {
                            return serializable2;
                        }
                    } else {
                        if (!z26) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objR = obj;
                    }
                    List list = (List) objR;
                    d520Var.e = null;
                    d520Var.i0();
                    return list;
                } catch (Throwable th2) {
                    d520Var.e = null;
                    d520Var.i0();
                    throw th2;
                }
            case 26:
                bj5 bj5Var = (bj5) obj2;
                boolean z27 = this.b;
                if (z27) {
                    if (z27) {
                        hm5.M(obj);
                        return serializable;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                fxh0 fxh0Var = (exh0) bj5Var.N0.get();
                Application application = bj5Var.g;
                this.b = true;
                fxh0 fxh0Var2 = fxh0Var;
                q8n q8nVar = fxh0Var2.a;
                v62 v62Var = fxh0Var2.c;
                q8nVar.getClass();
                Object objY = fn31.Y(flo1.l(q8nVar, v62Var), new hyg0(fxh0Var2, application, (lnm) null, (byte) 3), this);
                if (objY != serializable2) {
                    objY = serializable;
                }
                return objY == serializable2 ? serializable2 : serializable;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                boolean z28 = this.b;
                if (z28) {
                    if (z28) {
                        hm5.M(obj);
                        return serializable;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                yv5 yv5Var = (yv5) obj2;
                int i2 = yv5Var.t + 1;
                yv5Var.t = i2;
                ndi1 ndi1Var = yv5Var.e;
                Integer num = new Integer(i2);
                this.b = true;
                return ndi1Var.b(cw5.c, num, this) == serializable2 ? serializable2 : serializable;
            default:
                boolean z29 = this.b;
                if (z29) {
                    if (z29) {
                        hm5.M(obj);
                        return serializable;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                y66 y66Var = (y66) obj2;
                l96 l96Var = y66Var.k;
                String string = y66Var.a.getString(2131952434);
                this.b = true;
                if (l96Var.r != null && (c9nVar = l96Var.s) != null) {
                    fn31.T(c9nVar, (o8n) null, 0, new k96(l96Var, string, lnmVar, b3), 3);
                }
                return serializable == serializable2 ? serializable2 : serializable;
        }
    }
}
