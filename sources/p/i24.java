package p;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import androidx.car.app.navigation.model.Maneuver;
import com.spotify.base.java.logging.Logger;
import com.spotify.connect.esperanto.proto.CommonMessages;
import com.spotify.connect.esperanto.proto.ConnectMessages;
import com.spotify.rcs.resolver.grpc.v0.ResolveRequest;
import com.spotify.remoteconfig.fetcherimpl.network.NebulaRequestFailedException;
import com.spotify.wrapped.v1.proto.Image;
import com.spotify.wrapped.v1.proto.SceneTemplate;
import com.spotify.wrapped.v1.proto.StoryCard;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class i24 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Object c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i24(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.d = obj;
        this.c = obj2;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                return new i24((s24) this.d, (xu30) obj, lnmVar, (byte) 0);
            case 1:
                return new i24((t24) this.d, (xu30) obj, lnmVar, (byte) 1);
            case 2:
                return new i24((d45) this.d, (g3e1) obj, lnmVar, (byte) 2);
            case 3:
                return new i24((SceneTemplate.ArtistCardsContent.TradingCard) this.d, (oe6) obj, lnmVar, (byte) 3);
            case 4:
                return new i24((SceneTemplate.ArtistCardsContent.TopSong) this.d, (gw70) obj, lnmVar, (byte) 4);
            case 5:
                return new i24((SceneTemplate.ArtistCardsContent.ArtistCard) this.d, (gw70) obj, lnmVar, (byte) 5);
            case 6:
                return new i24((ai7) this.d, (a930) obj, lnmVar, (byte) 6);
            case 7:
                return new i24((xg8) this.d, (String) obj, lnmVar, (byte) 7);
            case 8:
                return new i24((a680) this.d, (String) obj, lnmVar, (byte) 8);
            case 9:
                return new i24((gea) this.d, (fea) obj, lnmVar, (byte) 9);
            case 10:
                return new i24((t3b) this.d, (String) obj, lnmVar, (byte) 10);
            case 11:
                return new i24((t3b) this.d, (ea61) obj, lnmVar, (byte) 11);
            case 12:
                return new i24((g4b) this.d, (String) obj, lnmVar, (byte) 12);
            case 13:
                return new i24((g4b) obj, lnmVar);
            case 14:
                return new i24((fqb) this.d, (ResolveRequest) obj, lnmVar, (byte) 14);
            case 15:
                return new i24((cke) this.d, (ahe) obj, lnmVar, (byte) 15);
            case 16:
                return new i24((em31) this.d, (jto1) obj, lnmVar, (byte) 16);
            case 17:
                return new i24((sbg) this.d, (Context) obj, lnmVar, (byte) 17);
            case 18:
                return new i24((ajq0) this.d, (String) obj, lnmVar, (byte) 18);
            case 19:
                return new i24((k3k) this.d, (gw70) obj, lnmVar, (byte) 19);
            case 20:
                return new i24((g4k) this.d, (StoryCard) obj, lnmVar, (byte) 20);
            case 21:
                return new i24((c3l) this.d, (ConnectMessages.AddDeviceToGroupRequest) obj, lnmVar, (byte) 21);
            case 22:
                return new i24((c3l) this.d, (ConnectMessages.LogoutRequest) obj, lnmVar, (byte) 22);
            case 23:
                return new i24((c3l) this.d, (ConnectMessages.PullRequest) obj, lnmVar, (byte) 23);
            case 24:
                return new i24((c3l) this.d, (ConnectMessages.RemoveDeviceFromGroupRequest) obj, lnmVar, (byte) 24);
            case 25:
                return new i24((c3l) this.d, (t4l) obj, lnmVar, (byte) 25);
            case 26:
                return new i24((c3l) this.d, (ConnectMessages.TransferRequest) obj, lnmVar, (byte) 26);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new i24((gal) this.d, (fvk) obj, lnmVar, (byte) 27);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new i24((rpn) this.d, (dqn) obj, lnmVar, (byte) 28);
            default:
                return new i24((cco) this.d, (kbo) obj, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                break;
            case 26:
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                break;
        }
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invokeSuspend(Object obj) throws NebulaRequestFailedException {
        a45 a45Var;
        Object objA;
        bpb1 bpb1Var;
        Object objP;
        Object objO;
        Object objA2;
        Object objX;
        Object objE0;
        Object objG0;
        Object objY;
        qpn qpnVar;
        Object objV;
        Object objN;
        byte b = this.a;
        final byte b2 = 2;
        psh pshVar = psh.b;
        u3k u3kVar = u3k.a;
        boolean z = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        rih1 rih1Var = rih1.a;
        Enum r9 = d9n.a;
        Object obj2 = this.c;
        byte b3 = 1;
        i2n i2nVar = null;
        switch (b) {
            case 0:
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
                s24 s24Var = (s24) this.d;
                c24 c24Var = new c24(s24Var, (byte) 2);
                c6 c6Var = new c6((xu30) obj2, s24Var, (lnm) null, (byte) 25);
                this.b = true;
                return lm5.s(c24Var, c6Var, this) == r9 ? r9 : rih1Var;
            case 1:
                final t24 t24Var = (t24) this.d;
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    Function0 function0 = new Function0() { // from class: p.d24
                        public final Object invoke() {
                            byte b4 = b2;
                            t24 t24Var2 = t24Var;
                            switch (b4) {
                                case 0:
                                    Object value = t24Var2.l.getValue();
                                    if (value != null) {
                                        return value;
                                    }
                                    float fS = t24Var2.j.s();
                                    hrr0 hrr0Var = t24Var2.g;
                                    if (Float.isNaN(fS)) {
                                        return hrr0Var.getValue();
                                    }
                                    float f = t24Var2.c().f(hrr0Var.getValue());
                                    if (Float.isNaN(f) || fS == f) {
                                        return hrr0Var.getValue();
                                    }
                                    Object objA3 = t24Var2.c().a(fS);
                                    return objA3 == null ? hrr0Var.getValue() : objA3;
                                case 1:
                                    float f2 = t24Var2.c().f(t24Var2.h.getValue());
                                    float f3 = t24Var2.c().f(t24Var2.i.getValue()) - f2;
                                    float fAbs = Math.abs(f3);
                                    float f4 = 1.0f;
                                    if (!Float.isNaN(fAbs) && fAbs > 1.0E-6f) {
                                        float fG = (t24Var2.g() - f2) / f3;
                                        if (fG < 1.0E-6f) {
                                            f4 = 0.0f;
                                        } else if (fG <= 0.999999f) {
                                            f4 = fG;
                                        }
                                    }
                                    return Float.valueOf(f4);
                                case 2:
                                    return t24Var2.c();
                                default:
                                    return new mmr0(t24Var2.c(), t24Var2.i.getValue());
                            }
                        }
                    };
                    c6 c6Var2 = new c6((xu30) obj2, t24Var, (lnm) null, (byte) 26);
                    this.b = true;
                    if (wm5.F(function0, c6Var2, this) == r9) {
                        return r9;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                wvr wvrVarC = t24Var.c();
                drr0 drr0Var = t24Var.j;
                Object objA3 = wvrVarC.a(drr0Var.s());
                if (objA3 == null) {
                    return rih1Var;
                }
                if (Math.abs(drr0Var.s() - t24Var.c().f(objA3)) >= 0.5f || !((Boolean) t24Var.a.invoke(objA3)).booleanValue()) {
                    return rih1Var;
                }
                t24Var.h.setValue(objA3);
                t24Var.g.setValue(objA3);
                return rih1Var;
            case 2:
                d45 d45Var = (d45) this.d;
                Handler handler = d45Var.e;
                View view = d45Var.a;
                boolean z4 = this.b;
                byte b4 = 3;
                try {
                    if (!z4) {
                        hm5.M(obj);
                        b45 b45Var = new b45();
                        g3e1 g3e1Var = (g3e1) obj2;
                        a45 a45Var2 = new a45(b45Var, new y35(d45Var, g3e1Var, objArr2 == true ? 1 : 0), new y35(d45Var, g3e1Var, b3), view);
                        iu30 iu30Var = d45Var.b;
                        if (iu30Var != null && (a45Var = (a45) iu30Var.invoke(a45Var2)) != null) {
                            a45Var2 = a45Var;
                        }
                        Looper looperMyLooper = Looper.myLooper();
                        Handler handler2 = view.getHandler();
                        if (looperMyLooper != (handler2 != null ? handler2.getLooper() : null)) {
                            c45 c45Var = d45Var.i;
                            if (c45Var == null) {
                                c45Var = new c45((Object) d45Var, (Object) a45Var2, (Object) b45Var, (byte) (objArr == true ? 1 : 0));
                                d45Var.i = c45Var;
                            }
                            view.post(c45Var);
                        } else {
                            ActionMode actionModeStartActionMode = view.startActionMode(new jr20(a45Var2), 1);
                            if (actionModeStartActionMode == null) {
                                return rih1Var;
                            }
                            d45Var.h = actionModeStartActionMode;
                        }
                        this.b = true;
                        Object objR = b45Var.a.r(this);
                        if (objR != r9) {
                            objR = rih1Var;
                        }
                        if (objR == r9) {
                            return r9;
                        }
                    } else {
                        if (!z4) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    handler.a();
                    Looper looperMyLooper2 = Looper.myLooper();
                    handler = view.getHandler();
                    if (looperMyLooper2 != (handler != null ? handler.getLooper() : null)) {
                        Runnable feVar = d45Var.j;
                        if (feVar == null) {
                            feVar = new fe(d45Var, b4);
                            d45Var.j = feVar;
                        }
                        view.post(feVar);
                    } else {
                        ActionMode actionMode = d45Var.h;
                        if (actionMode != null) {
                            actionMode.finish();
                        }
                    }
                    Runnable runnable = d45Var.i;
                    if (runnable != null) {
                        view.removeCallbacks(runnable);
                    }
                    d45Var.h = null;
                    return rih1Var;
                } catch (Throwable th) {
                    handler.a();
                    Looper looperMyLooper3 = Looper.myLooper();
                    Handler handler3 = view.getHandler();
                    if (looperMyLooper3 != (handler3 != null ? handler3.getLooper() : null)) {
                        Runnable feVar2 = d45Var.j;
                        if (feVar2 == null) {
                            feVar2 = new fe(d45Var, b4);
                            d45Var.j = feVar2;
                        }
                        view.post(feVar2);
                    } else {
                        ActionMode actionMode2 = d45Var.h;
                        if (actionMode2 != null) {
                            actionMode2.finish();
                        }
                    }
                    Runnable runnable2 = d45Var.i;
                    if (runnable2 != null) {
                        view.removeCallbacks(runnable2);
                    }
                    d45Var.h = null;
                    throw th;
                }
            case 3:
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
                Image imageO = ((SceneTemplate.ArtistCardsContent.TradingCard) this.d).o();
                gw70 gw70Var = (gw70) ((oe6) obj2).g;
                this.b = true;
                Object objK = u3kVar.k(imageO, gw70Var, this);
                return objK == r9 ? r9 : objK;
            case 4:
                boolean z6 = this.b;
                if (!z6) {
                    hm5.M(obj);
                    this.b = true;
                    Object objK2 = u3kVar.k(((SceneTemplate.ArtistCardsContent.TopSong) this.d).n(), (gw70) obj2, this);
                    return objK2 == r9 ? r9 : objK2;
                }
                if (z6) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                boolean z7 = this.b;
                if (!z7) {
                    hm5.M(obj);
                    this.b = true;
                    Object objK3 = u3kVar.k(((SceneTemplate.ArtistCardsContent.ArtistCard) this.d).n().n(), (gw70) obj2, this);
                    return objK3 == r9 ? r9 : objK3;
                }
                if (z7) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                boolean z8 = this.b;
                if (!z8) {
                    hm5.M(obj);
                    this.b = true;
                    Object objD = ((ai7) this.d).d((a930) obj2, this);
                    return objD == r9 ? r9 : objD;
                }
                if (z8) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                boolean z9 = this.b;
                if (!z9) {
                    hm5.M(obj);
                    this.b = true;
                    objA = ((xg8) this.d).c.a((String) obj2, this);
                    if (objA == r9) {
                        return r9;
                    }
                } else {
                    if (!z9) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objA = obj;
                }
                sy21 sy21Var = (sy21) objA;
                if (e8d1.a.contains(new Integer(sy21Var.a.d))) {
                    return sy21Var;
                }
                throw new NebulaRequestFailedException(f4i1.c(sy21Var.a.d, "Nebula request failed: "), sy21Var);
            case 8:
                boolean z10 = this.b;
                if (!z10) {
                    hm5.M(obj);
                    this.b = true;
                    return ((ijr) ((a680) this.d).b).a((String) obj2, this) == r9 ? r9 : rih1Var;
                }
                if (z10) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                fea feaVar = (fea) obj2;
                hrr0 hrr0Var = ((gea) this.d).c;
                boolean z11 = this.b;
                try {
                    if (!z11) {
                        hm5.M(obj);
                        hrr0Var.setValue(feaVar);
                        this.b = true;
                        Object objR2 = feaVar.b.r(this);
                        if (objR2 != r9) {
                            objR2 = rih1Var;
                        }
                        if (objR2 == r9) {
                            return r9;
                        }
                    } else {
                        if (!z11) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    hrr0Var.setValue((Object) null);
                    return rih1Var;
                } catch (Throwable th2) {
                    hrr0Var.setValue((Object) null);
                    throw th2;
                }
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
                g4b g4bVar = ((t3b) this.d).c;
                this.b = true;
                Object objE = g4bVar.e(new i24(g4bVar, (String) obj2, i2nVar, (byte) 12), this);
                if (objE != r9) {
                    objE = rih1Var;
                }
                return objE == r9 ? r9 : rih1Var;
            case 11:
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
                g4b g4bVar2 = ((t3b) this.d).c;
                String str = ((ea61) obj2).a;
                this.b = true;
                Object objE2 = g4bVar2.e(new e4b(g4bVar2, str, (lnm) null, (byte) 0), this);
                if (objE2 != r9) {
                    objE2 = rih1Var;
                }
                return objE2 == r9 ? r9 : rih1Var;
            case 12:
                boolean z14 = this.b;
                if (!z14) {
                    hm5.M(obj);
                    this.b = true;
                    return ((g4b) this.d).b((String) obj2, this) == r9 ? r9 : rih1Var;
                }
                if (z14) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                g4b g4bVar3 = (g4b) obj2;
                boolean z15 = this.b;
                if (!z15) {
                    hm5.M(obj);
                    bpb1Var = g4bVar3.f;
                    n4b n4bVar = g4bVar3.b;
                    String str2 = g4bVar3.e;
                    this.d = bpb1Var;
                    this.b = true;
                    objP = n4bVar.p(str2, this);
                    if (objP == r9) {
                        return r9;
                    }
                } else {
                    if (!z15) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bpb1 bpb1Var2 = (bpb1) this.d;
                    hm5.M(obj);
                    bpb1Var = bpb1Var2;
                    objP = obj;
                }
                bpb1Var.l(objP);
                g4bVar3.h.m((Object) null, sob1.b);
                return rih1Var;
            case 14:
                boolean z16 = this.b;
                if (!z16) {
                    hm5.M(obj);
                    this.b = true;
                    Object objA4 = ((opb) ((fqb) this.d).b).a((ResolveRequest) obj2, this);
                    return objA4 == r9 ? r9 : objA4;
                }
                if (z16) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
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
                cke ckeVar = (cke) this.d;
                String str3 = ((ahe) obj2).a;
                this.b = true;
                Enum enumJ = mmo1.J(ckeVar, str3, this);
                return enumJ == r9 ? r9 : enumJ;
            case 16:
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
                em31 em31Var = (em31) this.d;
                String str4 = ((jto1) obj2).b;
                this.b = true;
                Object objA5 = em31Var.a(str4, this);
                return objA5 == r9 ? r9 : objA5;
            case 17:
                boolean z19 = this.b;
                if (!z19) {
                    hm5.M(obj);
                    this.b = true;
                    Object objQ = ((sbg) this.d).d.q((Context) obj2, this);
                    return objQ == r9 ? r9 : objQ;
                }
                if (z19) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 18:
                boolean z20 = this.b;
                try {
                    if (!z20) {
                        hm5.M(obj);
                        xyc0 xyc0Var = (iyc0) ((ajq0) this.d).d;
                        List listSingletonList = Collections.singletonList((String) obj2);
                        wls0 wls0Var = wls0.d;
                        Integer num = new Integer(3500);
                        this.b = true;
                        objO = xyc0Var.o(listSingletonList, wls0Var, num, this);
                        if (objO == r9) {
                            return r9;
                        }
                    } else {
                        if (!z20) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objO = obj;
                    }
                    ((py21) objO).d();
                    z = true;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception unused) {
                }
                return Boolean.valueOf(z);
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
                k3k k3kVar = (k3k) this.d;
                boolean z22 = k3kVar.c;
                this.b = true;
                Object objG = u3kVar.g(k3kVar.a, (gw70) obj2, z22, this);
                return objG == r9 ? r9 : objG;
            case 20:
                boolean z23 = this.b;
                if (!z23) {
                    hm5.M(obj);
                    this.b = true;
                    Object objA6 = ((g4k) this.d).a.a((StoryCard) obj2, this);
                    return objA6 == r9 ? r9 : objA6;
                }
                if (z23) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 21:
                boolean z24 = this.b;
                if (!z24) {
                    hm5.M(obj);
                    jn7 jn7Var = ((c3l) this.d).a;
                    ConnectMessages.AddDeviceToGroupRequest addDeviceToGroupRequest = (ConnectMessages.AddDeviceToGroupRequest) obj2;
                    addDeviceToGroupRequest.getClass();
                    this.b = true;
                    objA2 = jn7Var.a(addDeviceToGroupRequest, this);
                    if (objA2 == r9) {
                        return r9;
                    }
                } else {
                    if (!z24) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objA2 = obj;
                }
                ConnectMessages.AddDeviceToGroupResponse addDeviceToGroupResponse = (ConnectMessages.AddDeviceToGroupResponse) objA2;
                if (addDeviceToGroupResponse.o()) {
                    return rih1Var;
                }
                Logger.d("Add device to group failure: " + addDeviceToGroupResponse.n(), new Object[0]);
                return rih1Var;
            case 22:
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
                jn7 jn7Var2 = ((c3l) this.d).a;
                ConnectMessages.LogoutRequest logoutRequest = (ConnectMessages.LogoutRequest) obj2;
                logoutRequest.getClass();
                this.b = true;
                Object objK4 = jn7Var2.K(logoutRequest, this);
                return objK4 == r9 ? r9 : objK4;
            case 23:
                c3l c3lVar = (c3l) this.d;
                boolean z26 = this.b;
                if (!z26) {
                    hm5.M(obj);
                    jn7 jn7Var3 = c3lVar.a;
                    ConnectMessages.PullRequest pullRequest = (ConnectMessages.PullRequest) obj2;
                    pullRequest.getClass();
                    this.b = true;
                    objX = jn7Var3.X(pullRequest, this);
                    if (objX == r9) {
                        return r9;
                    }
                } else {
                    if (!z26) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objX = obj;
                }
                CommonMessages.StatusResponse statusResponse = (CommonMessages.StatusResponse) objX;
                if (statusResponse.n() != pshVar) {
                    Logger.d("Pull playback failure " + statusResponse.n(), new Object[0]);
                }
                return c3l.h(statusResponse.n());
            case 24:
                boolean z27 = this.b;
                if (!z27) {
                    hm5.M(obj);
                    jn7 jn7Var4 = ((c3l) this.d).a;
                    ConnectMessages.RemoveDeviceFromGroupRequest removeDeviceFromGroupRequest = (ConnectMessages.RemoveDeviceFromGroupRequest) obj2;
                    removeDeviceFromGroupRequest.getClass();
                    this.b = true;
                    objE0 = jn7Var4.e0(removeDeviceFromGroupRequest, this);
                    if (objE0 == r9) {
                        return r9;
                    }
                } else {
                    if (!z27) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objE0 = obj;
                }
                ConnectMessages.RemoveDeviceFromGroupResponse removeDeviceFromGroupResponse = (ConnectMessages.RemoveDeviceFromGroupResponse) objE0;
                if (removeDeviceFromGroupResponse.o()) {
                    return rih1Var;
                }
                Logger.d("Remove device from group failure: " + removeDeviceFromGroupResponse.n(), new Object[0]);
                return rih1Var;
            case 25:
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
                jn7 jn7Var5 = ((c3l) this.d).a;
                ConnectMessages.SetPreferredIncarnationRequest setPreferredIncarnationRequestBuild = ((t4l) obj2).build();
                this.b = true;
                Object objS0 = jn7Var5.s0(setPreferredIncarnationRequestBuild, this);
                return objS0 == r9 ? r9 : objS0;
            case 26:
                c3l c3lVar2 = (c3l) this.d;
                boolean z29 = this.b;
                if (!z29) {
                    hm5.M(obj);
                    jn7 jn7Var6 = c3lVar2.a;
                    ConnectMessages.TransferRequest transferRequest = (ConnectMessages.TransferRequest) obj2;
                    transferRequest.getClass();
                    this.b = true;
                    objG0 = jn7Var6.G0(transferRequest, this);
                    if (objG0 == r9) {
                        return r9;
                    }
                } else {
                    if (!z29) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objG0 = obj;
                }
                CommonMessages.StatusResponse statusResponse2 = (CommonMessages.StatusResponse) objG0;
                if (statusResponse2.n() != pshVar) {
                    Logger.d("Transfer playback failure " + statusResponse2.n(), new Object[0]);
                }
                psh pshVarN = statusResponse2.n();
                c3lVar2.getClass();
                return c3l.h(pshVarN);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                fvk fvkVar = (fvk) obj2;
                boolean z30 = this.b;
                if (!z30) {
                    hm5.M(obj);
                    gal galVar = (gal) this.d;
                    q8n q8nVar = (q8n) galVar.c;
                    cuk cukVar = new cuk(galVar, fvkVar, (lnm) null, (byte) 26);
                    this.b = true;
                    objY = fn31.Y(q8nVar, cukVar, this);
                    if (objY == r9) {
                        return r9;
                    }
                } else {
                    if (!z30) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objY = obj;
                }
                son sonVar = (son) objY;
                return new dwk(sonVar.a, sonVar.b, sonVar.c, fvkVar.c, sonVar.d);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
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
                rpn rpnVar = (rpn) this.d;
                zpn zpnVar = ((dqn) obj2).b.c;
                if (zpnVar instanceof zpn) {
                    zpn zpnVar2 = zpnVar;
                    qpnVar = new qpn(zpnVar2.b, (String) o7h.s0(zpnVar2.e));
                } else {
                    if (!(zpnVar instanceof vpn)) {
                        eg.o();
                        return null;
                    }
                    qpnVar = ppn.a;
                }
                this.b = true;
                if (qpnVar instanceof ppn) {
                    objV = rpnVar.a.a.getString(2131954626);
                } else {
                    if (!(qpnVar instanceof qpn)) {
                        eg.o();
                        return null;
                    }
                    qpn qpnVar2 = qpnVar;
                    objV = rpnVar.b.v(qpnVar2.b, this, qpnVar2.a);
                }
                return objV == r9 ? r9 : objV;
            default:
                kbo kboVar = (kbo) obj2;
                d8r0 d8r0Var = kboVar.c;
                cco ccoVar = (cco) this.d;
                boolean z32 = this.b;
                if (!z32) {
                    hm5.M(obj);
                    g1i g1iVar = ccoVar.c;
                    String str5 = kboVar.a;
                    String str6 = kboVar.b;
                    this.b = true;
                    objN = g1iVar.n(str5, str6, this);
                    if (objN == r9) {
                        return r9;
                    }
                } else {
                    if (!z32) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objN = obj;
                }
                ax2 ax2Var = (ax2) objN;
                if (ax2Var != null) {
                    g931 g931Var = (g931) ccoVar.d.b;
                    Object objS1 = o7h.s0(g931Var.s(ax2Var.c, ax2Var.b, kboVar.d, d8r0Var, ax2Var.a, kboVar.a, kboVar.e, kboVar.f, kboVar.g, kboVar.h));
                    wul wulVar = objS1 instanceof wul ? (wul) objS1 : null;
                    if (wulVar != null) {
                        sbo sboVar = wulVar.a;
                        yf51 yf51Var = ax2Var.d;
                        if (yf51Var != null) {
                            String str7 = ax2Var.e;
                            if (str7 == null) {
                                str7 = "";
                            }
                            Object objS2 = o7h.s0(g931Var.s(yf51Var, str7, kboVar.d, d8r0Var, ax2Var.a, kboVar.a, kboVar.e, kboVar.f, kboVar.g, kboVar.h));
                            sul sulVar = objS2 instanceof sul ? (sul) objS2 : null;
                            if (sulVar != null) {
                                i2nVar = sulVar.a;
                            }
                        }
                        return new mbo(sboVar, i2nVar);
                    }
                }
                return lbo.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i24(g4b g4bVar, lnm lnmVar) {
        super(1, lnmVar);
        this.a = (byte) 13;
        this.c = g4bVar;
    }
}
