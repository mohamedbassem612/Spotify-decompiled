package p;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.textclassifier.TextClassifier;
import com.spotify.mobius.functions.Consumer;
import com.spotify.offline.playbacktimeout.DeadEndsPlaybackTimeoutEvent;
import com.spotify.player.model.PlayerState;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlistmixing.proto.SetMixState;
import com.spotify.playlistmixing.proto.SignalData;
import com.spotify.widgets.npvwidget.PlaybackCommandHandlerService;
import com.spotify.widgets.npvwidget.k;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f3t0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f3t0(Object obj, Object obj2, lnm lnmVar, byte b) {
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
                return new f3t0((g3t0) this.c, (a3t0) obj2, lnmVar, (byte) 0);
            case 1:
                f3t0 f3t0Var = new f3t0((yup0) obj2, lnmVar, (byte) 1);
                f3t0Var.c = obj;
                return f3t0Var;
            case 2:
                f3t0 f3t0Var2 = new f3t0((w4t0) obj2, lnmVar, (byte) 2);
                f3t0Var2.c = obj;
                return f3t0Var2;
            case 3:
                return new f3t0((kbt0) this.c, (cat0) obj2, lnmVar, (byte) 3);
            case 4:
                return new f3t0((TextClassifier) this.c, (vu30) obj2, lnmVar, (byte) 4);
            case 5:
                return new f3t0((get0) this.c, (String) obj2, lnmVar, (byte) 5);
            case 6:
                return new f3t0((zhq0) this.c, (rgt0) obj2, lnmVar, (byte) 6);
            case 7:
                return new f3t0((fkt0) this.c, (m210) obj2, lnmVar, (byte) 7);
            case 8:
                return new f3t0((hut0) this.c, (ArrayList) obj2, lnmVar, (byte) 8);
            case 9:
                f3t0 f3t0Var3 = new f3t0((yu8) obj2, lnmVar, (byte) 9);
                f3t0Var3.c = obj;
                return f3t0Var3;
            case 10:
                return new f3t0((PlaybackCommandHandlerService) this.c, (Intent) obj2, lnmVar, (byte) 10);
            case 11:
                f3t0 f3t0Var4 = new f3t0((g1u0) obj2, lnmVar, (byte) 11);
                f3t0Var4.c = obj;
                return f3t0Var4;
            case 12:
                return new f3t0((myq0) this.c, (String) obj2, lnmVar, (byte) 12);
            case 13:
                return new f3t0((y1u0) this.c, (Consumer) obj2, lnmVar, (byte) 13);
            case 14:
                return new f3t0((p3u0) this.c, (jgc1) obj2, lnmVar, (byte) 14);
            case 15:
                f3t0 f3t0Var5 = new f3t0((w6u0) obj2, lnmVar, (byte) 15);
                f3t0Var5.c = obj;
                return f3t0Var5;
            case 16:
                f3t0 f3t0Var6 = new f3t0((c7u0) obj2, lnmVar, (byte) 16);
                f3t0Var6.c = obj;
                return f3t0Var6;
            case 17:
                f3t0 f3t0Var7 = new f3t0((i8u0) obj2, lnmVar, (byte) 17);
                f3t0Var7.c = obj;
                return f3t0Var7;
            case 18:
                return new f3t0((ytp0) this.c, (String) obj2, lnmVar, (byte) 18);
            case 19:
                return new f3t0((iku0) this.c, (List) obj2, lnmVar, (byte) 19);
            case 20:
                return new f3t0((ytp0) this.c, (ArrayList) obj2, lnmVar, (byte) 20);
            case 21:
                return new f3t0((hlu0) this.c, (String) obj2, lnmVar, (byte) 21);
            case 22:
                return new f3t0((iyc0) this.c, (String) obj2, lnmVar, (byte) 22);
            case 23:
                return new f3t0((you0) this.c, (String) obj2, lnmVar, (byte) 23);
            case 24:
                return new f3t0((yeu0) this.c, (String) obj2, lnmVar, (byte) 24);
            case 25:
                return new f3t0((k4v0) this.c, (s4b1) obj2, lnmVar, (byte) 25);
            case 26:
                return new f3t0((zgv0) this.c, (String) obj2, lnmVar, (byte) 26);
            case 27:
                f3t0 f3t0Var8 = new f3t0((zgv0) obj2, lnmVar, (byte) 27);
                f3t0Var8.c = obj;
                return f3t0Var8;
            case 28:
                return new f3t0((dlv0) this.c, (fpo) obj2, lnmVar, (byte) 28);
            default:
                return new f3t0((n7w0) this.c, (tv80) obj2, lnmVar, (byte) 29);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invoke(Object obj, Object obj2) throws KotlinNothingValueException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
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
                return create((j5q0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((x0u0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((PlayerState) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 17:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 18:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 19:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 20:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9n.a;
            case 24:
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

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:158:0x040f -> B:160:0x0413). Please report as a decompilation issue!!! */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        Object objI;
        lnm lnmVar;
        evz huzVar;
        String str;
        huz m441Var;
        Object objK0;
        Object objU;
        Object objS;
        Object objF;
        Object objJ;
        Object objC;
        byte b = this.a;
        byte b2 = 21;
        byte b3 = 23;
        byte b4 = 2;
        byte b5 = 0;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.d;
        Serializable serializable = d9n.a;
        byte b6 = 1;
        lnm lnmVar2 = null;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    zo51 zo51VarB = ((g3t0) this.c).a.b();
                    this.b = true;
                    objI = b5p1.i(zo51VarB, this);
                    if (objI == serializable) {
                        return serializable;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objI = obj;
                }
                hma1 hma1VarEdit = ((dma1) objI).edit();
                hma1VarEdit.d(g3t0.d, ((a3t0) obj2).name());
                hma1VarEdit.h();
                return rih1Var;
            case 1:
                vr20 vr20Var = (vr20) this.c;
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Boolean boolValueOf = Boolean.valueOf(((gvs0) ((yup0) obj2).c).a());
                this.c = null;
                this.b = true;
                return vr20Var.emit(boolValueOf, this) == serializable ? serializable : rih1Var;
            case 2:
                w4t0 w4t0Var = (w4t0) obj2;
                c9n c9nVar = (c9n) this.c;
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    Object value = ((bpb1) w4t0Var.d.h).getValue();
                    if (value != null) {
                        p4t0 p4t0Var = (p4t0) value;
                        mr20 x010Var = new x010(p4t0Var.a, p4t0Var.b, new lok0(3, (lnm) null, (byte) 10), (byte) 1);
                        mr20 mr20Var = w4t0Var.X;
                        lok0 lok0Var = new lok0(3, (lnm) null, (byte) 9);
                        s4q0 s4q0Var = new s4q0(w4t0Var, c9nVar, (byte) 9);
                        this.c = null;
                        this.b = true;
                        Object objS2 = fc11.s(vrl.c, this, s4q0Var, new ekv(lok0Var, (lnm) null), new mr20[]{mr20Var, x010Var});
                        if (objS2 != serializable) {
                            objS2 = rih1Var;
                        }
                        return objS2 == serializable ? serializable : rih1Var;
                    }
                    hhg1.n("Required value was null.");
                } else {
                    if (z3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
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
                fv9 fv9Var = ((kbt0) this.c).c;
                boolean z5 = ((cat0) obj2).a;
                this.b = true;
                Object objC2 = fv9Var.c(z5, this);
                return objC2 == serializable ? serializable : objC2;
            case 4:
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
                TextClassifier textClassifier = (TextClassifier) this.c;
                if (textClassifier == null) {
                    return null;
                }
                this.b = true;
                Object objInvoke = ((vu30) obj2).invoke(textClassifier, this);
                return objInvoke == serializable ? serializable : objInvoke;
            case 5:
                boolean z7 = this.b;
                if (z7) {
                    if (z7) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                xyc0 xyc0Var = ((get0) this.c).b;
                this.b = true;
                Object objU2 = xyc0Var.u((String) obj2, ddd1.Y0, this);
                return objU2 == serializable ? serializable : objU2;
            case 6:
                zhq0 zhq0Var = (zhq0) this.c;
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
                if (!smo1.u((llm) zhq0Var.b)) {
                    return rih1Var;
                }
                this.b = true;
                return ((bbc) zhq0Var.c).b((rgt0) obj2, this) == serializable ? serializable : rih1Var;
            case 7:
                boolean z9 = this.b;
                if (!z9) {
                    hm5.M(obj);
                    this.b = true;
                    return ((fkt0) this.c).a((m210) obj2, this) == serializable ? serializable : rih1Var;
                }
                if (z9) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 8:
                boolean z10 = this.b;
                if (!z10) {
                    hm5.M(obj);
                    this.b = true;
                    Object objA = ((hut0) this.c).a((ArrayList) obj2, this);
                    return objA == serializable ? serializable : objA;
                }
                if (z10) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                yu8 yu8Var = (yu8) obj2;
                c9n c9nVar2 = (c9n) this.c;
                boolean z11 = this.b;
                if (z11) {
                    if (z11) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarU = rqt0.u(new j5b0(((koc0) yu8Var.f).d(), (byte) 15));
                fun0 fun0Var = new fun0(yu8Var, c9nVar2);
                this.c = null;
                this.b = true;
                return mr20VarU.collect(fun0Var, this) == serializable ? serializable : rih1Var;
            case 10:
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
                k kVar = ((PlaybackCommandHandlerService) this.c).a;
                if (kVar == null) {
                    u890.C("interactionHandler");
                    throw null;
                }
                Bundle extras = ((Intent) obj2).getExtras();
                if (extras == null) {
                    extras = Bundle.EMPTY;
                }
                extras.getClass();
                this.b = true;
                return kVar.a(extras, this) == serializable ? serializable : rih1Var;
            case 11:
                g1u0 g1u0Var = (g1u0) obj2;
                x0u0 x0u0Var = (x0u0) this.c;
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
                lnm lnmVar3 = null;
                if (x0u0Var != null) {
                    String str2 = x0u0Var.a;
                    m441 m441Var2 = new m441(new b1u0(g1u0Var, str2, lnmVar3, b5));
                    vbs vbsVar = g1u0Var.o;
                    m441 m441Var3 = vbsVar.a ? new m441(new b1u0(g1u0Var, str2, lnmVar3, b6)) : new huz(Boolean.FALSE, (byte) 10);
                    if (x0u0Var.b || (!vbsVar.c && vbsVar.a)) {
                        str = str2;
                        lnmVar = null;
                        m441Var = new m441(new k1e0(g1u0Var, str2, x0u0Var, (lnm) null, (byte) 22));
                    } else {
                        m441Var = new huz(new v0u0((jo70) null, 3), (byte) 10);
                        lnmVar = null;
                        str = str2;
                    }
                    huzVar = h5p1.r(m441Var2, m441Var3, m441Var, nhc1.Y(str, "spotify:local:", false) ? new m441(new b1u0(g1u0Var, str, lnmVar, b4)) : new huz(lnmVar, (byte) 10), new jaz(5, lnmVar, (byte) 25));
                } else {
                    lnmVar = null;
                    huzVar = new huz(new w0u0(), (byte) 10);
                }
                mr20 mr20VarU2 = rqt0.u(new ht20(huzVar, new pk50(2, lnmVar, (byte) 19)));
                s4q0 s4q0Var2 = new s4q0(g1u0Var, x0u0Var, (byte) 13);
                this.c = lnmVar;
                this.b = true;
                return mr20VarU2.collect(s4q0Var2, this) == serializable ? serializable : rih1Var;
            case 12:
                myq0 myq0Var = (myq0) this.c;
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
                Flowable flowable = (Flowable) myq0Var.c;
                vbm[] vbmVarArr = q601.a;
                kge kgeVar = new kge(flowable);
                rwm0 rwm0Var = new rwm0(myq0Var, (String) obj2, lnmVar2, b2);
                this.b = true;
                Object objJ2 = b5p1.j(kgeVar, rwm0Var, this);
                return objJ2 == serializable ? serializable : objJ2;
            case 13:
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
                qt20 qt20VarV = z4p1.v(rqt0.u(new dy20(((y1u0) this.c).c, (byte) 21)), 1);
                h8c h8cVar = new h8c((Consumer) obj2, (byte) 7);
                this.b = true;
                return qt20VarV.collect(h8cVar, this) == serializable ? serializable : rih1Var;
            case 14:
                p3u0 p3u0Var = (p3u0) this.c;
                boolean z16 = this.b;
                if (!z16) {
                    hm5.M(obj);
                    this.b = true;
                    objK0 = p3u0Var.k0(this);
                    if (objK0 == serializable) {
                        return serializable;
                    }
                } else {
                    if (!z16) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objK0 = obj;
                }
                jgc1 jgc1Var = (jgc1) objK0;
                if (jgc1Var == ((jgc1) obj2)) {
                    return rih1Var;
                }
                int i = p3u0Var.w1;
                if (p3u0Var.S0) {
                    p3u0Var.c.m0(new l3u0(p3u0Var, i, jgc1Var, (byte) 1));
                    return rih1Var;
                }
                p3u0Var.h.B(p3u0Var.i, i, jgc1Var);
                return rih1Var;
            case 15:
                w6u0 w6u0Var = (w6u0) obj2;
                PlayerState playerState = (PlayerState) this.c;
                boolean z17 = this.b;
                if (!z17) {
                    hm5.M(obj);
                    w6u0Var.e = (String) playerState.playbackId().e("absent");
                    if (!w6u0Var.d || !playerState.isPlaying() || playerState.isPaused() || playerState.isBuffering() || !playerState.playbackSpeed().c() || ((Number) playerState.playbackSpeed().b()).doubleValue() <= 0.0d) {
                        return rih1Var;
                    }
                    x6u0 x6u0Var = (x6u0) w6u0Var.b.get();
                    String str3 = w6u0Var.e;
                    t2j0 t2j0Var = x6u0Var.a;
                    a8r a8rVarN = DeadEndsPlaybackTimeoutEvent.n();
                    a8rVarN.n(str3);
                    a8rVarN.q(k4s0.f(5));
                    t2j0Var.a(a8rVarN.build());
                    dt71 dt71Var = w6u0Var.c;
                    this.c = null;
                    this.b = true;
                    if (dt71Var.emit(r6u0.a, this) == serializable) {
                        return serializable;
                    }
                } else {
                    if (!z17) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                w6u0Var.d = false;
                return rih1Var;
            case 16:
                c7u0 c7u0Var = (c7u0) obj2;
                c9n c9nVar3 = (c9n) this.c;
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
                lt20 lt20Var = new lt20(eth.t((xm41) c7u0Var.a.get(), r6x.a, fft0.d), new w1e0(3, (lnm) null, (byte) 14), (byte) 0);
                dvq0 dvq0Var = new dvq0(c9nVar3, c7u0Var, lnmVar2, b3);
                this.c = null;
                this.b = true;
                return l4p1.q(lt20Var, dvq0Var, this) == serializable ? serializable : rih1Var;
            case 17:
                i8u0 i8u0Var = (i8u0) obj2;
                c9n c9nVar4 = (c9n) this.c;
                boolean z19 = this.b;
                if (!z19) {
                    hm5.M(obj);
                    if (!smo1.u(c9nVar4) && i8u0Var.f == 2) {
                        long j = i8u0.n;
                        this.c = c9nVar4;
                        this.b = true;
                        if (hap1.j(j, this) == serializable) {
                            return serializable;
                        }
                    }
                } else {
                    if (!z19) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                int i2 = i8u0.o;
                i8u0Var.a();
                i8u0Var.c();
                return !smo1.u(c9nVar4) ? rih1Var : rih1Var;
            case 18:
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
                ytp0 ytp0Var = (ytp0) this.c;
                nu0 nu0Var = (nu0) ytp0Var.d;
                String str4 = ((ay0) ytp0Var.e).a.a;
                List listSingletonList = Collections.singletonList(iu0.f);
                this.b = true;
                return nu0.a(nu0Var, str4, (String) obj2, 3, 2, listSingletonList, this) == serializable ? serializable : rih1Var;
            case 19:
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
                iku0 iku0Var = (iku0) this.c;
                xyc0 xyc0Var2 = iku0Var.b;
                this.b = true;
                Object objL = xyc0Var2.l(iku0Var.g, (List) obj2, this, (tv80) null);
                return objL == serializable ? serializable : objL;
            case 20:
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
                sx3 sx3Var = (sx3) ((ytp0) this.c).c;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : (ArrayList) obj2) {
                    if (obj3 instanceof yh90) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : arrayList) {
                    if (((yh90) obj4).g) {
                        arrayList2.add(obj4);
                    }
                }
                ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((yh90) it.next()).a);
                }
                this.b = true;
                Serializable serializableB = sx3Var.b(arrayList3, this);
                return serializableB == serializable ? serializable : serializableB;
            case 21:
                boolean z23 = this.b;
                if (!z23) {
                    hm5.M(obj);
                    xyc0 xyc0Var3 = ((hlu0) this.c).b;
                    this.b = true;
                    objU = xyc0Var3.u((String) obj2, ddd1.S0, this);
                    if (objU == serializable) {
                        return serializable;
                    }
                } else {
                    if (!z23) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objU = obj;
                }
                return ((py21) objU).c();
            case 22:
                boolean z24 = this.b;
                if (!z24) {
                    hm5.M(obj);
                    xyc0 xyc0Var4 = (iyc0) this.c;
                    pl81 pl81VarN = SignalData.n();
                    pl81VarN.n();
                    phc byteString = pl81VarN.build().toByteString();
                    uk61 uk61VarN = SetMixState.n();
                    uk61VarN.n(true);
                    List listSingletonList2 = Collections.singletonList(new ayc0("mix-state", byteString, uk61VarN.build().toByteString(), false, (String) null, 24));
                    List listSingletonList3 = Collections.singletonList("mix");
                    this.b = true;
                    objS = xyc0Var4.s((String) obj2, listSingletonList2, listSingletonList3, this);
                    if (objS == serializable) {
                        return serializable;
                    }
                } else {
                    if (!z24) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objS = obj;
                }
                return Boolean.valueOf(objS instanceof oy21);
            case 23:
                you0 you0Var = (you0) this.c;
                boolean z25 = this.b;
                if (z25) {
                    if (z25) {
                        throw l1d.v(obj);
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                xmu0 xmu0Var = you0Var.d;
                ay8 ay8VarF = d3p1.F((d0r) xmu0Var.b, (o3r) xmu0Var.c, new rxc0((String) obj2));
                fun0 fun0Var2 = new fun0((Object) you0Var, (byte) 20);
                this.b = true;
                ay8VarF.collect(fun0Var2, this);
                return serializable;
            case 24:
                boolean z26 = this.b;
                if (!z26) {
                    hm5.M(obj);
                    yeu0 yeu0Var = (yeu0) this.c;
                    rsc0 rsc0Var = (xrc0) yeu0Var.b;
                    trc0 trc0Var = new trc0((PlaylistRequestDecorationPolicy) yeu0Var.c, (g3d0) null, (Set) null, false, (src0) null, jqz0.a, (prc0) null, 0, (List) null, 478);
                    this.b = true;
                    objF = rsc0Var.f((String) obj2, trc0Var, this);
                    if (objF == serializable) {
                        return serializable;
                    }
                } else {
                    if (!z26) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objF = obj;
                }
                return ((py21) objF).d();
            case 25:
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
                x2z x2zVar = ((k4v0) this.c).d;
                s4b1 s4b1Var = (s4b1) obj2;
                String strZ = s4b1Var.z();
                Maybe maybe = (!s4b1Var.v() || strZ == null) ? MaybeEmpty.a : x2zVar.a.b(new oi("GatedContentRouter", false, new kov(strZ, (byte) 24))).flatMap(new w2z(strZ, x2zVar, (byte) 0)).firstOrError().toMaybe();
                this.b = true;
                Object objM = fc11.m(maybe, this);
                return objM == serializable ? serializable : objM;
            case 26:
                boolean z28 = this.b;
                if (!z28) {
                    hm5.M(obj);
                    Single singleFirstOrError = ((v5n) ((zgv0) this.c).d.get()).c((String) obj2).firstOrError();
                    this.b = true;
                    objJ = fc11.j(singleFirstOrError, this);
                    if (objJ == serializable) {
                        return serializable;
                    }
                } else {
                    if (!z28) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objJ = obj;
                }
                return ((nmr0) objJ).b;
            case 27:
                zgv0 zgv0Var = (zgv0) obj2;
                c9n c9nVar5 = (c9n) this.c;
                boolean z29 = this.b;
                if (!z29) {
                    hm5.M(obj);
                    c9c0 c9c0Var = zgv0Var.a;
                    this.c = c9nVar5;
                    this.b = true;
                    objC = kr90.c(c9c0Var, this);
                    if (objC == serializable) {
                        return serializable;
                    }
                } else {
                    if (!z29) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objC = obj;
                }
                if (!((Boolean) objC).booleanValue()) {
                    return rih1Var;
                }
                l4p1.u(c9nVar5, hu20.e(rqt0.u(new k6e0(new c1v0(zgv0Var.c, (byte) 6), (byte) 29)), new t4o0((lnm) null, zgv0Var, (byte) 23)));
                return rih1Var;
            case 28:
                dlv0 dlv0Var = (dlv0) this.c;
                Context context = dlv0Var.a;
                ynb0 ynb0Var = dlv0Var.b;
                boolean z30 = this.b;
                if (!z30) {
                    hm5.M(obj);
                    kt91 kt91Var = (kt91) dlv0Var.d.get();
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131959062});
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                    kt91Var.k(new er91((fs91) null, "", 2131959062, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                    if (((dto0) ynb0Var.get()).a.g(context)) {
                        return rih1Var;
                    }
                    this.b = true;
                    if (hap1.i(1000L, this) == serializable) {
                        return serializable;
                    }
                } else {
                    if (!z30) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                dto0 dto0Var = (dto0) ynb0Var.get();
                ynb0 ynb0Var2 = dlv0Var.c;
                dto0Var.d((dg30) ynb0Var2.get(), new yro0(9, context.getString(2131959058), context.getString(2131959055), context.getString(2131959057), context.getString(2131959056)), new kqi0(cto1.q((iac0) ynb0Var2.get()), dlv0Var.f, (fpo) obj2, (byte) 29));
                return rih1Var;
            default:
                boolean z31 = this.b;
                if (z31) {
                    if (z31) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                n7w0 n7w0Var = (n7w0) this.c;
                String str5 = ((tv80) obj2).a.a;
                this.b = true;
                return n7w0Var.a(str5, this) == serializable ? serializable : rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f3t0(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
    }
}
