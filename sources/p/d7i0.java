package p;

import android.view.View;
import com.spotify.address.endpoint.model.v1.proto.SubmitFormRequest;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.Loop;
import com.spotify.mobius.functions.Consumer;
import com.spotify.playlistmixing.proto.SetMixState;
import com.spotify.playlistmixing.proto.SignalData;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class d7i0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7i0(boolean z, List list, ss50 ss50Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 1;
        this.b = z;
        this.c = list;
        this.d = ss50Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                return new d7i0(this.c, obj2, lnmVar, (byte) 0);
            case 1:
                return new d7i0(this.b, (List) this.c, (ss50) obj2, lnmVar);
            case 2:
                return new d7i0(this.c, obj2, lnmVar, (byte) 2);
            case 3:
                return new d7i0(this.c, obj2, lnmVar, (byte) 3);
            case 4:
                d7i0 d7i0Var = new d7i0(obj2, lnmVar, (byte) 4);
                d7i0Var.c = obj;
                return d7i0Var;
            case 5:
                return new d7i0(this.c, obj2, lnmVar, (byte) 5);
            case 6:
                return new d7i0(this.c, obj2, lnmVar, (byte) 6);
            case 7:
                return new d7i0(this.c, obj2, lnmVar, (byte) 7);
            case 8:
                return new d7i0(this.c, obj2, lnmVar, (byte) 8);
            case 9:
                return new d7i0(this.c, obj2, lnmVar, (byte) 9);
            case 10:
                return new d7i0(this.c, obj2, lnmVar, (byte) 10);
            case 11:
                return new d7i0(this.c, obj2, lnmVar, (byte) 11);
            case 12:
                d7i0 d7i0Var2 = new d7i0(obj2, lnmVar, (byte) 12);
                d7i0Var2.c = obj;
                return d7i0Var2;
            case 13:
                return new d7i0(this.c, obj2, lnmVar, (byte) 13);
            case 14:
                return new d7i0(this.c, obj2, lnmVar, (byte) 14);
            case 15:
                return new d7i0(this.c, obj2, lnmVar, (byte) 15);
            case 16:
                return new d7i0(this.c, obj2, lnmVar, (byte) 16);
            case 17:
                d7i0 d7i0Var3 = new d7i0((exj0) obj2, this.b, lnmVar);
                d7i0Var3.c = obj;
                return d7i0Var3;
            case 18:
                d7i0 d7i0Var4 = new d7i0(obj2, lnmVar, (byte) 18);
                d7i0Var4.c = obj;
                return d7i0Var4;
            case 19:
                return new d7i0(this.c, obj2, lnmVar, (byte) 19);
            case 20:
                return new d7i0(this.c, obj2, lnmVar, (byte) 20);
            case 21:
                d7i0 d7i0Var5 = new d7i0(obj2, lnmVar, (byte) 21);
                d7i0Var5.c = obj;
                return d7i0Var5;
            case 22:
                d7i0 d7i0Var6 = new d7i0(obj2, lnmVar, (byte) 22);
                d7i0Var6.c = obj;
                return d7i0Var6;
            case 23:
                return new d7i0(this.c, obj2, lnmVar, (byte) 23);
            case 24:
                return new d7i0(this.c, obj2, lnmVar, (byte) 24);
            case 25:
                return new d7i0(this.c, obj2, lnmVar, (byte) 25);
            case 26:
                return new d7i0(this.c, obj2, lnmVar, (byte) 26);
            case 27:
                return new d7i0(this.c, obj2, lnmVar, (byte) 27);
            case 28:
                return new d7i0(this.c, obj2, lnmVar, (byte) 28);
            default:
                d7i0 d7i0Var7 = new d7i0(obj2, lnmVar, (byte) 29);
                d7i0Var7.c = obj;
                return d7i0Var7;
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
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((ty90) obj, (lnm) obj2).invokeSuspend(rih1Var);
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
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 17:
                return create((Map) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 18:
                return create((k1r) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 19:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 20:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 24:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
            case 25:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
            case 28:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Code duplicated, block: B:45:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00dc  */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        Object objI;
        Object objI2;
        String str;
        Object objS;
        utm0 utm0VarB;
        Object objJ;
        byte b = this.a;
        byte b2 = 7;
        byte b3 = 26;
        Serializable serializable = rih1.a;
        Serializable serializable2 = d9n.a;
        Object obj2 = this.d;
        lnm lnmVar = null;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return serializable;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                f7i0 f7i0Var = (f7i0) ((o3e0) this.c).b;
                jfe jfeVar = (jfe) f7i0Var.b.computeIfAbsent("media_trimmer_button_result", azt.f);
                iib iibVar = new iib(k4p1.B(jfeVar), new vv70(f7i0Var, jfeVar, (lnm) null), (byte) 6);
                p5b0 p5b0Var = new p5b0((x3i0) obj2, (byte) 18);
                this.b = true;
                return iibVar.collect(p5b0Var, this) == serializable2 ? serializable2 : serializable;
            case 1:
                hm5.M(obj);
                if (this.b && !((List) this.c).isEmpty()) {
                    ((ss50) obj2).a(27);
                }
                return serializable;
            case 2:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.b = true;
                    return ((tji0) this.c).b((String) obj2, this, true) == serializable2 ? serializable2 : serializable;
                }
                if (!z2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Object obj3 = ((e331) obj).a;
                return serializable;
            case 3:
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return serializable;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                gj10 gj10Var = (gj10) this.c;
                oki0 oki0Var = (oki0) obj2;
                String str2 = oki0Var.b;
                Boolean boolValueOf = Boolean.valueOf(!oki0Var.c);
                this.b = true;
                return gj10.j(gj10Var, str2, boolValueOf, (Boolean) null, (Boolean) null, (Boolean) null, this, 28) == serializable2 ? serializable2 : serializable;
            case 4:
                ty90 ty90Var = (ty90) this.c;
                boolean z4 = this.b;
                try {
                    if (!z4) {
                        hm5.M(obj);
                        this.c = null;
                        this.b = true;
                        if (((or90) obj2).a(ty90Var, this) == serializable2) {
                            serializable = serializable2;
                        }
                    } else {
                        if (!z4) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    return serializable;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    Logger.e(e2, "Failed to open the permission upgrade sheet", new Object[0]);
                    return serializable;
                }
            case 5:
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    iu30 iu30Var = (iu30) this.c;
                    this.b = true;
                    if (iu30Var.invoke(this) == serializable2) {
                        return serializable2;
                    }
                } else {
                    if (!z5) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                bpb1 bpb1Var = ((e4j0) obj2).h;
                bpb1Var.getClass();
                bpb1Var.m((Object) null, t3j0.b);
                return serializable;
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
                e4j0 e4j0Var = (e4j0) this.c;
                int i = e4j0.k;
                at71 at71Var = (at71) e4j0Var.e.getValue();
                hyg0 hyg0Var = new hyg0(obj2, lnmVar, (byte) 5);
                this.b = true;
                Object objJ2 = b5p1.j(at71Var, hyg0Var, this);
                return objJ2 == serializable2 ? serializable2 : objJ2;
            case 7:
                boolean z7 = this.b;
                if (!z7) {
                    hm5.M(obj);
                    if (((Boolean) ((ven0) obj2).getValue()).booleanValue()) {
                        return serializable;
                    }
                    this.b = true;
                    if (hap1.i(200L, this) == serializable2) {
                        return serializable2;
                    }
                } else {
                    if (!z7) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ((uk21) this.c).invoke();
                return serializable;
            case 8:
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
                mr20 mr20Var = (mr20) ((zc80) ((qn) this.c).b).b;
                ht3 ht3Var = new ht3((Consumer) obj2, (lnm) null, (byte) 2);
                this.b = true;
                Object objCollect = mr20Var.collect(new eu20(kfo0.a, ht3Var, (byte) 1), this);
                if (objCollect != serializable2) {
                    objCollect = serializable;
                }
                if (objCollect != serializable2) {
                    objCollect = serializable;
                }
                return objCollect == serializable2 ? serializable2 : serializable;
            case 9:
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
                m441 m441VarQ = rwq.q(new ime0((y7e1) this.c, (byte) 3));
                mp0 mp0Var = new mp0((ven0) obj2, (byte) 14);
                this.b = true;
                return m441VarQ.collect(mp0Var, this) == serializable2 ? serializable2 : serializable;
            case 10:
                boolean z10 = this.b;
                if (!z10) {
                    hm5.M(obj);
                    mr20 mr20VarB = ((kbd) ((kly0) ((ru9) this.c).d).get()).b();
                    this.b = true;
                    objI = b5p1.i(mr20VarB, this);
                    if (objI == serializable2) {
                        return serializable2;
                    }
                } else {
                    if (!z10) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objI = obj;
                }
                return !((Boolean) objI).booleanValue() ? crn0.a : new hrn0(obj0.class, new xcj0(((th61) obj2).a), new b6w0(false));
            case 11:
                boolean z11 = this.b;
                if (!z11) {
                    hm5.M(obj);
                    this.b = true;
                    Serializable serializableB = ((sjj0) this.c).e.b((List) obj2, this);
                    return serializableB == serializable2 ? serializable2 : serializableB;
                }
                if (z11) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                hrj0 hrj0Var = (hrj0) obj2;
                AtomicBoolean atomicBoolean = hrj0Var.b;
                vr20 vr20Var = (vr20) this.c;
                boolean z12 = this.b;
                try {
                    if (z12) {
                        if (!z12) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        atomicBoolean.set(false);
                        return serializable;
                    }
                    hm5.M(obj);
                    if (!atomicBoolean.compareAndSet(false, true)) {
                        eg.m("Only one mic permission page result observer can be active at a time");
                        return null;
                    }
                    mfe mfeVarB = k4p1.B(hrj0Var.a);
                    this.c = null;
                    this.b = true;
                    if (l4p1.s(vr20Var, mfeVarB, this) == serializable2) {
                        return serializable2;
                    }
                    atomicBoolean.set(false);
                    return serializable;
                } catch (Throwable th) {
                    atomicBoolean.set(false);
                    throw th;
                }
            case 13:
                boolean z13 = this.b;
                if (z13) {
                    if (z13) {
                        hm5.M(obj);
                        return serializable;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                tob1 tob1Var = (tob1) this.c;
                if (tob1Var == null) {
                    return serializable;
                }
                m441 m441VarQ2 = rwq.q(new bu2(tob1Var, (byte) 14));
                p5b0 p5b0Var2 = new p5b0((jfe) obj2, (byte) 20);
                this.b = true;
                return m441VarQ2.collect(p5b0Var2, this) == serializable2 ? serializable2 : serializable;
            case 14:
                boolean z14 = this.b;
                if (!z14) {
                    hm5.M(obj);
                    evz evzVarV = ((buj0) this.c).b.V((String) obj2);
                    this.b = true;
                    objI2 = b5p1.i(evzVarV, this);
                    if (objI2 == serializable2) {
                        return serializable2;
                    }
                } else {
                    if (!z14) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objI2 = obj;
                }
                return Boolean.valueOf(((cw8) objI2).a);
            case 15:
                duj0 duj0Var = (duj0) this.c;
                boolean z15 = this.b;
                if (!z15) {
                    hm5.M(obj);
                    this.b = true;
                    if (hap1.i(500L, this) == serializable2) {
                        return serializable2;
                    }
                } else {
                    if (!z15) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                fn31.T(cto1.q(duj0Var.a), duj0Var.b, 0, new hyg0(duj0Var, (View) obj2, lnmVar, b2), 2);
                return serializable;
            case 16:
                boolean z16 = this.b;
                if (!z16) {
                    hm5.M(obj);
                    ayc0 ayc0Var = new ayc0("mix-remove-opt-out", (phc) null, (phc) null, false, (String) null, 30);
                    this.b = true;
                    return iyc0.a(((huj0) this.c).b, (String) obj2, ayc0Var, this) == serializable2 ? serializable2 : serializable;
                }
                if (z16) {
                    hm5.M(obj);
                    return serializable;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 17:
                Map map = (Map) this.c;
                hm5.M(obj);
                return Boolean.valueOf(z6k0.b(map) == this.b);
            case 18:
                v8k0 v8k0Var = (v8k0) obj2;
                s24 s24Var = v8k0Var.e;
                k1r k1rVar = (k1r) this.c;
                boolean z17 = this.b;
                if (z17) {
                    if (z17) {
                        hm5.M(obj);
                        return d3p1.G(v8k0Var.d, new km1(s24Var, (byte) 22), serializable);
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (k1rVar instanceof j1r) {
                    return new huz(k1rVar, (byte) 10);
                }
                if (k1rVar instanceof h1r) {
                    return new huz(k1rVar, (byte) 10);
                }
                if (!(k1rVar instanceof i1r)) {
                    eg.o();
                    return null;
                }
                cbk0 cbk0Var = (cbk0) s24Var.c;
                if (cbk0Var.d != null && cbk0Var.a.length() == 0 && (str = cbk0Var.d) != null) {
                    mig1 mig1Var = (mig1) u890.k(((d0r) s24Var.b).b(((o3r) s24Var.h).a(str)), (d0r) null, (n4r) null);
                    lhg1 lhg1VarA = kkg1.a(mig1Var.f);
                    if (lhg1VarA == null) {
                        v8k0Var.h(new IllegalStateException("Failed to decode transition data"));
                        return r6x.a;
                    }
                    cbk0Var.i = lhg1VarA;
                    cbk0Var.j = mig1Var.g == 2;
                    ruq0 ruq0Var = lhg1VarA.b;
                    bt31 bt31Var = new bt31(ruq0Var.a, ruq0Var.g);
                    bt31 bt31Var2 = new bt31(ruq0Var.b, ruq0Var.h);
                    cbk0Var.a = mig1Var.c;
                    cbk0Var.b = bt31Var;
                    cbk0Var.c = bt31Var2;
                }
                this.c = null;
                this.b = true;
                if (s24Var.W(this) == serializable2) {
                    return serializable2;
                }
                return d3p1.G(v8k0Var.d, new km1(s24Var, (byte) 22), serializable);
            case 19:
                boolean z18 = this.b;
                if (z18) {
                    if (z18) {
                        hm5.M(obj);
                        return serializable;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarI = ((cir0) this.c).i();
                p5b0 p5b0Var3 = new p5b0((wik0) obj2, (byte) 22);
                this.b = true;
                return mr20VarI.collect(p5b0Var3, this) == serializable2 ? serializable2 : serializable;
            case 20:
                boolean z19 = this.b;
                if (!z19) {
                    hm5.M(obj);
                    xyc0 xyc0Var = ((ylk0) this.c).b;
                    pl81 pl81VarN = SignalData.n();
                    pl81VarN.n();
                    phc byteString = pl81VarN.build().toByteString();
                    uk61 uk61VarN = SetMixState.n();
                    uk61VarN.n(true);
                    List listSingletonList = Collections.singletonList(new ayc0("mix-state", byteString, uk61VarN.build().toByteString(), false, (String) null, 24));
                    List listSingletonList2 = Collections.singletonList("mix");
                    this.b = true;
                    objS = xyc0Var.s((String) obj2, listSingletonList, listSingletonList2, this);
                    if (objS == serializable2) {
                        return serializable2;
                    }
                } else {
                    if (!z19) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objS = obj;
                }
                return Boolean.valueOf(objS instanceof oy21);
            case 21:
                ssw0 ssw0Var = (ssw0) this.c;
                boolean z20 = this.b;
                if (z20) {
                    if (z20) {
                        hm5.M(obj);
                        return serializable;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                w7m0 w7m0Var = new w7m0(((Loop) obj2).b(new our(ssw0Var, (byte) 1)), (byte) 0);
                this.c = null;
                this.b = true;
                return jch0.s(ssw0Var, w7m0Var, this) == serializable2 ? serializable2 : serializable;
            case 22:
                vr20 vr20Var2 = (vr20) this.c;
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
                whm0 whm0Var = (whm0) obj2;
                if (whm0Var == null) {
                    return serializable;
                }
                this.c = null;
                this.b = true;
                return vr20Var2.emit(whm0Var, this) == serializable2 ? serializable2 : serializable;
            case 23:
                boolean z22 = this.b;
                if (!z22) {
                    hm5.M(obj);
                    this.b = true;
                    if (hap1.i(1000L, this) == serializable2) {
                        return serializable2;
                    }
                } else {
                    if (!z22) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return ((iu30) this.c).invoke((SubmitFormRequest) obj2);
            case 24:
                boolean z23 = this.b;
                if (z23) {
                    if (!z23) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        hm5.M(obj);
                    }
                    return null;
                }
                hm5.M(obj);
                zob1 zob1Var = (zob1) this.c;
                p5b0 p5b0Var4 = new p5b0((rmm0) obj2, (byte) 25);
                this.b = true;
                if (zob1Var.collect(p5b0Var4, this) == serializable2) {
                    return serializable2;
                }
                jah.d();
                return null;
            case 25:
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
                hl00 hl00Var = (hl00) ((pzx) this.c).b;
                String str3 = ((hti0) obj2).a;
                this.b = true;
                Object objA = hl00Var.a(str3, this);
                return objA == serializable2 ? serializable2 : objA;
            case 26:
                hsm0 hsm0Var = (hsm0) this.c;
                idd1 idd1Var = hsm0Var.h;
                String str4 = hsm0Var.a;
                boolean z25 = this.b;
                try {
                    if (!z25) {
                        hm5.M(obj);
                        hsm0Var.b();
                        r091 r091VarA = hsm0Var.e;
                        if (r091VarA == null) {
                            utm0VarB = hsm0Var.d;
                            if (utm0VarB == null) {
                                utm0VarB = ((osm0) hsm0Var.g.getValue()).b(new esm0(str4, fsm0.b), 3);
                                hsm0Var.d = utm0VarB;
                            }
                            utm0VarB.a((zau0) idd1Var.getValue());
                            r091VarA = ((zau0) idd1Var.getValue()).a();
                            hsm0Var.e = r091VarA;
                        } else {
                            if (((Boolean) r091VarA.e.b.getValue()).booleanValue()) {
                                r091VarA = null;
                            }
                            if (r091VarA == null) {
                                utm0VarB = hsm0Var.d;
                                if (utm0VarB == null) {
                                    utm0VarB = ((osm0) hsm0Var.g.getValue()).b(new esm0(str4, fsm0.b), 3);
                                    hsm0Var.d = utm0VarB;
                                }
                                utm0VarB.a((zau0) idd1Var.getValue());
                                r091VarA = ((zau0) idd1Var.getValue()).a();
                                hsm0Var.e = r091VarA;
                            }
                        }
                        if (r091VarA == null) {
                            return serializable;
                        }
                        r091VarA.b(new lsm0((String) obj2, new ksm0(fec1.c, null, null, str4, null, null, 502), false, false, (jsm0) null, 0L, (ism0) null, (String) null, true, 0, 1788));
                        r091VarA.k();
                        r091.f(r091VarA, (tv80) null, (Long) null, hjy0.a, 7);
                        bpb1 bpb1Var2 = r091VarA.g;
                        fca0 fca0Var = new fca0(2, (lnm) null, (byte) 26);
                        this.b = true;
                        objJ = b5p1.j(bpb1Var2, fca0Var, this);
                        if (objJ == serializable2) {
                            return serializable2;
                        }
                    } else {
                        if (!z25) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objJ = obj;
                    }
                    hsm0Var.b();
                    return serializable;
                } catch (Throwable th2) {
                    hsm0Var.b();
                    throw th2;
                }
            case 27:
                boolean z26 = this.b;
                if (z26) {
                    if (z26) {
                        throw l1d.v(obj);
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                bpb1 bpb1Var3 = ((fal1) this.c).d;
                mp0 mp0Var2 = new mp0((ven0) obj2, (byte) 16);
                this.b = true;
                bpb1Var3.collect(mp0Var2, this);
                return serializable2;
            case 28:
                boolean z27 = this.b;
                if (!z27) {
                    hm5.M(obj);
                    this.b = true;
                    return ((wxm0) this.c).b.invoke((tv80) obj2, this) == serializable2 ? serializable2 : serializable;
                }
                if (z27) {
                    hm5.M(obj);
                    return serializable;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                t0n0 t0n0Var = (t0n0) obj2;
                ssw0 ssw0Var2 = (ssw0) this.c;
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
                fmo fmoVar = new fmo(ssw0Var2, (byte) 4);
                t0n0Var.a.g(fmoVar);
                dvg0 dvg0Var = new dvg0(t0n0Var, fmoVar, b3);
                this.c = null;
                this.b = true;
                return jch0.s(ssw0Var2, dvg0Var, this) == serializable2 ? serializable2 : serializable;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d7i0(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7i0(exj0 exj0Var, boolean z, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 17;
        this.d = exj0Var;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d7i0(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
    }
}
