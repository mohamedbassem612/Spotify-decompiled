package p;

import com.google.android.recaptcha.internal.zzhm;
import com.spotify.player.esperanto.proto.EsLoggingParams;
import com.spotify.player.esperanto.proto.EsPlayOptions;
import com.spotify.player.esperanto.proto.EsPlayOrigin;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class g1y extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1y(boolean z, gj90 gj90Var, c9 c9Var, ven0 ven0Var, vu30 vu30Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 5;
        this.b = z;
        this.c = gj90Var;
        this.d = c9Var;
        this.e = ven0Var;
        this.f = vu30Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.e;
        Object obj3 = this.f;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                return new g1y(this.c, obj4, obj2, obj3, lnmVar, (byte) 0);
            case 1:
                return new g1y((gnv0) obj4, (vu30) obj2, (l1q0) obj3, lnmVar, (byte) 1);
            case 2:
                return new g1y(this.c, obj4, obj2, obj3, lnmVar, (byte) 2);
            case 3:
                g1y g1yVar = new g1y((ne) obj4, (qkg) obj2, (String) obj3, lnmVar, (byte) 3);
                g1yVar.c = obj;
                return g1yVar;
            case 4:
                return new g1y(this.c, obj4, obj2, obj3, lnmVar, (byte) 4);
            case 5:
                return new g1y(this.b, (gj90) this.c, (c9) obj4, (ven0) obj2, (vu30) obj3, lnmVar);
            case 6:
                g1y g1yVar2 = new g1y((bek1) obj4, (ima1) obj2, (bma1) obj3, lnmVar, (byte) 6);
                g1yVar2.c = obj;
                return g1yVar2;
            case 7:
                return new g1y((dzp0) obj4, (rvo1) obj2, (xmn1) obj3, lnmVar, (byte) 7);
            default:
                g1y g1yVar3 = new g1y((x5o1) obj4, (String) obj3, (sln1) obj2, lnmVar);
                g1yVar3.c = obj;
                return g1yVar3;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzhm */
    public final Object invoke(Object obj, Object obj2) throws zzhm {
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
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 6:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((zwo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzhm */
    public final Object invokeSuspend(Object obj) throws zzhm {
        l811 l811Var;
        Object objA;
        Object objE;
        byte b = this.a;
        p811 p811Var = "call to 'resume' before 'invoke' with coroutine";
        rih1 rih1Var = rih1.a;
        Object obj2 = this.f;
        rih1 rih1Var2 = d9n.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
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
                hm5.M(obj);
                xrc0 xrc0Var = ((h1y) this.c).b;
                EsPlayOrigin.PlayOrigin playOrigin = (EsPlayOrigin.PlayOrigin) obj4;
                playOrigin.getClass();
                EsLoggingParams.LoggingParams loggingParams = (EsLoggingParams.LoggingParams) obj3;
                loggingParams.getClass();
                trc0 trc0Var = new trc0((PlaylistRequestDecorationPolicy) null, (g3d0) null, (Set) null, false, (src0) null, hqz0.a, (prc0) null, 0, (List) null, 479);
                this.b = true;
                return xrc0.b(xrc0Var, (String) obj2, trc0Var, (EsPreparePlayOptions.PreparePlayOptions) null, playOrigin, (EsPlayOptions.PlayOptions) null, (Map) null, loggingParams, (ayc0) null, this, 180) == rih1Var2 ? rih1Var2 : rih1Var;
            case 1:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        l811Var = (l811) this.c;
                        hm5.M(obj);
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                if (!((gnv0) obj4).a) {
                    return rih1Var;
                }
                l811Var = new l811();
                iib iibVarA0 = u4p1.a0(k4p1.l((bbc) ((l1q0) obj2).b), new qye0(l811Var, (lnm) null, (byte) 1));
                this.c = l811Var;
                this.b = true;
                if (((vu30) obj3).invoke(iibVarA0, this) == rih1Var2) {
                    return rih1Var2;
                }
                if (l811Var.a) {
                    return rih1Var;
                }
                eg.m("You must collect the progress flow");
                return null;
            case 2:
                ContextTrack contextTrack = (ContextTrack) obj4;
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ijr ijrVarE = im0.e((im0) this.c);
                String strUri = contextTrack.uri();
                String strContextUri = ((PlayerState) obj3).contextUri();
                fly0 fly0Var = new fly0(contextTrack.provider());
                this.b = true;
                return ijrVarE.b(strUri, strContextUri, true, fly0Var, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 3:
                boolean z4 = this.b;
                try {
                    if (!z4) {
                        hm5.M(obj);
                        qkg qkgVar = (qkg) obj3;
                        String str = (String) obj2;
                        se91 se91Var = (se91) ((ne) obj4).a;
                        String str2 = qkgVar.b;
                        this.c = null;
                        this.b = true;
                        objA = se91Var.a("", str2, str, this);
                        if (objA == rih1Var2) {
                            return rih1Var2;
                        }
                    } else {
                        if (!z4) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objA = obj;
                    }
                    return rih1Var;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable unused) {
                    return rih1Var;
                }
            case 4:
                voa0 voa0Var = (voa0) obj4;
                boolean z5 = this.b;
                try {
                    if (!z5) {
                        hm5.M(obj);
                        mr20 mr20VarK = ((zsc) this.c).k(voa0Var.d);
                        cff cffVar = new cff((kd8) obj2, (byte) 22);
                        this.b = true;
                        if (mr20VarK.collect(cffVar, this) == rih1Var2) {
                            rih1Var = rih1Var2;
                        }
                    } else {
                        if (!z5) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    return rih1Var;
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th) {
                    ((hj8) obj3).invoke(voa0Var.d, th);
                    return rih1Var;
                }
            case 5:
                c9 c9Var = (c9) obj4;
                vu30 vu30Var = (vu30) obj2;
                ven0 ven0Var = (ven0) obj3;
                hm5.M(obj);
                if (this.b) {
                    Set setP1 = o7h.p1(((gj90) this.c).a(c9Var));
                    Set setV0 = dm61.v0(setP1, (Iterable) ven0Var.getValue());
                    Set setV1 = dm61.v0((Set) ven0Var.getValue(), setP1);
                    Iterator it = setV0.iterator();
                    while (it.hasNext()) {
                        vu30Var.invoke((String) it.next(), yah0.m(true));
                    }
                    Iterator it2 = setV1.iterator();
                    while (it2.hasNext()) {
                        vu30Var.invoke((String) it2.next(), yah0.m(false));
                    }
                    ven0Var.setValue(setP1);
                } else {
                    Iterator it3 = dm61.y0((Set) ven0Var.getValue(), c9Var).iterator();
                    while (it3.hasNext()) {
                        vu30Var.invoke((String) it3.next(), yah0.m(false));
                    }
                    ven0Var.setValue(w7x.a);
                }
                return rih1Var;
            case 6:
                vr20 vr20Var = (vr20) this.c;
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
                Object objInvoke = ((bek1) obj4).invoke(((ima1) obj3).a((bma1) obj2));
                this.c = null;
                this.b = true;
                return vr20Var.emit(objInvoke, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 7:
                dzp0 dzp0Var = (dzp0) obj4;
                try {
                    try {
                        if (this.b) {
                            p811Var = (p811) this.c;
                            hm5.M(obj);
                            objE = obj;
                        } else {
                            p811 p811VarU = cy30.u(obj);
                            try {
                                m1o1 m1o1Var = new m1o1((rvo1) obj3, dzp0Var, (xmn1) obj2, p811VarU, null, (byte) 0);
                                p811Var = p811VarU;
                                this.c = p811Var;
                                this.b = true;
                                objE = h2x0.e(10000L, m1o1Var, this);
                                if (objE == rih1Var2) {
                                    return rih1Var2;
                                }
                            } catch (Exception e3) {
                                e = e3;
                                p811Var = p811VarU;
                                e.getMessage();
                                zzhm zzhmVar = (zzhm) p811Var.a;
                                if (zzhmVar == null) {
                                    throw dzp0.h(dzp0Var, e);
                                }
                                throw zzhmVar;
                            }
                        }
                        return (ymn1) objE;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } catch (Exception e4) {
                    e = e4;
                }
                break;
            default:
                boolean z7 = this.b;
                hm5.M(obj);
                if (z7) {
                    return obj;
                }
                bj81 bj81Var = new bj81((x5o1) obj4, (String) obj2, (zwo1) this.c, (sln1) obj3, (lnm) null, (byte) 21);
                this.b = true;
                Object objS = smo1.s(bj81Var, this);
                return objS == rih1Var2 ? rih1Var2 : objS;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1y(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1y(x5o1 x5o1Var, String str, sln1 sln1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 8;
        this.d = x5o1Var;
        this.f = str;
        this.e = sln1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1y(Object obj, Object obj2, Object obj3, Object obj4, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }
}
