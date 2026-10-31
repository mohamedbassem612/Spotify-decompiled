package p;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.spotify.mobius.functions.Consumer;
import com.spotify.offline.playbacktimeout.DeadEndsPlaybackTimeoutEvent;
import com.spotify.player.esperanto.proto.EsContextPlayerOptions;
import com.spotify.player.esperanto.proto.EsLoggingParams;
import com.spotify.player.esperanto.proto.EsOptional;
import com.spotify.player.esperanto.proto.EsPlayOptions;
import com.spotify.player.esperanto.proto.EsPlayOrigin;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ContextTrack$Metadata;
import com.spotify.player.model.ErrorType;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.PlayerError;
import com.spotify.player.model.PlayerState;
import com.spotify.wrapped.v1.proto.Image;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.completable.CompletableObserveOn;
import j$.net.URLEncoder;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dvq0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dvq0(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.c = obj2;
        this.e = obj3;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                return new dvq0(this.d, this.c, obj2, lnmVar, (byte) 0);
            case 1:
                return new dvq0(this.d, obj2, (ven0) this.c, lnmVar, (byte) 1);
            case 2:
                return new dvq0(this.d, this.c, obj2, lnmVar, (byte) 2);
            case 3:
                return new dvq0((iu30) this.c, (lp61) obj2, lnmVar, (byte) 3);
            case 4:
                return new dvq0(this.c, (vu30) obj2, lnmVar, (byte) 4);
            case 5:
                dvq0 dvq0Var = new dvq0((ArrayList) this.c, (vu30) obj2, lnmVar, (byte) 5);
                dvq0Var.d = obj;
                return dvq0Var;
            case 6:
                dvq0 dvq0Var2 = new dvq0((zhq0) this.c, (rgb) obj2, lnmVar, (byte) 6);
                dvq0Var2.d = obj;
                return dvq0Var2;
            case 7:
                dvq0 dvq0Var3 = new dvq0((Flowable) this.c, (g9r) obj2, lnmVar, (byte) 7);
                dvq0Var3.d = obj;
                return dvq0Var3;
            case 8:
                return new dvq0(this.d, this.c, obj2, lnmVar, (byte) 8);
            case 9:
                return new dvq0(this.d, this.c, obj2, lnmVar, (byte) 9);
            case 10:
                return new dvq0((iu30) this.c, (et90) obj2, lnmVar, (byte) 10);
            case 11:
                return new dvq0(this.d, this.c, obj2, lnmVar, (byte) 11);
            case 12:
                return new dvq0(this.d, this.c, obj2, lnmVar, (byte) 12);
            case 13:
                dvq0 dvq0Var4 = new dvq0((w4t0) this.c, (String) obj2, lnmVar, (byte) 13);
                dvq0Var4.d = obj;
                return dvq0Var4;
            case 14:
                return new dvq0(this.d, obj2, (ven0) this.c, lnmVar, (byte) 14);
            case 15:
                return new dvq0(this.d, this.c, obj2, lnmVar, (byte) 15);
            case 16:
                return new dvq0(this.d, this.c, obj2, lnmVar, (byte) 16);
            case 17:
                return new dvq0(this.d, this.c, obj2, lnmVar, (byte) 17);
            case 18:
                return new dvq0(this.d, this.c, obj2, lnmVar, (byte) 18);
            case 19:
                return new dvq0(this.d, this.c, obj2, lnmVar, (byte) 19);
            case 20:
                return new dvq0(this.d, this.c, obj2, lnmVar, (byte) 20);
            case 21:
                return new dvq0(this.d, this.c, obj2, lnmVar, (byte) 21);
            case 22:
                dvq0 dvq0Var5 = new dvq0((w6u0) obj2, lnmVar);
                dvq0Var5.c = obj;
                return dvq0Var5;
            case 23:
                dvq0 dvq0Var6 = new dvq0((c9n) this.c, (c7u0) obj2, lnmVar, (byte) 23);
                dvq0Var6.d = obj;
                return dvq0Var6;
            case 24:
                return new dvq0(this.d, this.c, obj2, lnmVar, (byte) 24);
            case 25:
                return new dvq0(this.d, this.c, obj2, lnmVar, (byte) 25);
            case 26:
                dvq0 dvq0Var7 = new dvq0((q9b) this.c, (qmn) obj2, lnmVar, (byte) 26);
                dvq0Var7.d = obj;
                return dvq0Var7;
            case 27:
                return new dvq0(this.d, this.c, obj2, lnmVar, (byte) 27);
            case 28:
                return new dvq0(this.d, this.c, obj2, lnmVar, (byte) 28);
            default:
                return new dvq0((hlu0) this.c, (String) obj2, lnmVar, (byte) 29);
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
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((l0l) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
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
                return create((PlayerError) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((t6u0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 24:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9n.a;
            case 26:
                return create((tv80) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Code duplicated, block: B:285:0x067a  */
    /* JADX WARN: Code duplicated, block: B:427:0x091c  */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        iu30 iu30Var;
        Object objInvoke;
        Object obj2;
        Object objInvoke2;
        Object objU;
        Object objJ;
        String str;
        CharSequence charSequence;
        String strQ;
        iu30 iu30Var2;
        Object objP;
        AccessibilityManager accessibilityManager;
        int iIntValue;
        e5t0 m231Var;
        t4t0 s4t0Var;
        Object objK;
        Object objB;
        Object s6u0Var;
        Object objI;
        String str2;
        Iterator it;
        byte b = this.a;
        byte b2 = 4;
        int i = 0;
        int i2 = 0;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.e;
        Serializable serializable = d9n.a;
        String str3 = null;
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
                war0 war0VarB0 = ((bbr0) this.d).b0(nxb.class);
                kiv kivVar = abr0.a;
                ezc ezcVarF = h4p1.f(new yar0(war0VarB0, null, (byte) 0));
                g27 g27Var = new g27((ven0) this.c, (ven0) obj3, (byte) 3);
                this.b = true;
                return ezcVarF.collect(g27Var, this) == serializable ? serializable : rih1Var;
            case 1:
                vy71 vy71Var = (vy71) this.d;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    if (vy71Var.i()) {
                        ((ven0) this.c).setValue(exb.a);
                        this.b = true;
                        if (vy71Var.h(this) == serializable) {
                            return serializable;
                        }
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ((Function0) obj3).invoke();
                return rih1Var;
            case 2:
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
                bju bjuVar = (bju) this.d;
                wj6 wj6Var = new wj6((Image) this.c, (gw70) obj3, (lnm) null, (byte) 2);
                this.b = true;
                Object objE = bjuVar.e("pack_wrapper_logo", wj6Var, this);
                return objE == serializable ? serializable : objE;
            case 3:
                boolean z4 = this.b;
                if (z4) {
                    if (!z4) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    iu30Var = (iu30) this.d;
                    hm5.M(obj);
                    objInvoke = obj;
                    String str4 = (String) objInvoke;
                    iu30Var.invoke(new sxn0(str4 != null ? str4 : ""));
                    return rih1Var;
                }
                hm5.M(obj);
                iu30Var = (iu30) this.c;
                nxn0 nxn0Var = ((lp61) obj3).f.b;
                this.d = iu30Var;
                this.b = true;
                if (nxn0Var instanceof nxn0) {
                    objInvoke = nxn0Var.a;
                } else if (nxn0Var instanceof oxn0) {
                    objInvoke = ((oxn0) nxn0Var).a;
                } else {
                    if (!(nxn0Var instanceof mxn0)) {
                        eg.o();
                        return null;
                    }
                    objInvoke = ((mxn0) nxn0Var).b.invoke(this);
                }
                if (objInvoke == serializable) {
                    return serializable;
                }
                String str5 = (String) objInvoke;
                iu30Var.invoke(new sxn0(str5 != null ? str5 : ""));
                return rih1Var;
            case 4:
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        obj2 = this.d;
                        hm5.M(obj);
                        objInvoke2 = obj;
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                obj2 = this.c;
                this.d = obj2;
                this.b = true;
                objInvoke2 = ((vu30) obj3).invoke(obj2, this);
                if (objInvoke2 == serializable) {
                    return serializable;
                }
                Object obj4 = obj2;
                if (((Boolean) objInvoke2).booleanValue()) {
                    return obj4;
                }
                return null;
            case 5:
                c9n c9nVar = (c9n) this.d;
                boolean z6 = this.b;
                if (!z6) {
                    hm5.M(obj);
                    ArrayList arrayList = (ArrayList) this.c;
                    vu30 vu30Var = (vu30) obj3;
                    ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(fn31.q(c9nVar, (o8n) null, 0, new dvq0(it2.next(), vu30Var, str3, b2), 3));
                    }
                    this.d = null;
                    this.b = true;
                    objU = o1p1.u(arrayList2, this);
                    if (objU == serializable) {
                        return serializable;
                    }
                } else {
                    if (!z6) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objU = obj;
                }
                return o7h.o0((Iterable) objU);
            case 6:
                ssw0 ssw0Var = (ssw0) this.d;
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
                b3s b3sVar = b3s.c;
                xd1 xd1Var = new xd1(ssw0Var, (rgb) obj3, (lnm) null, (byte) 17);
                this.d = null;
                this.b = true;
                return fn31.Y(b3sVar, xd1Var, this) == serializable ? serializable : rih1Var;
            case 7:
                l0l l0lVar = (l0l) this.d;
                boolean z8 = this.b;
                if (!z8) {
                    hm5.M(obj);
                    Single singleZ = ((Flowable) this.c).z();
                    this.d = l0lVar;
                    this.b = true;
                    objJ = fc11.j(singleZ, this);
                    if (objJ == serializable) {
                        return serializable;
                    }
                } else {
                    if (!z8) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objJ = obj;
                }
                kt91 kt91Var = (kt91) ((g9r) obj3).c;
                ContextTrack contextTrack = (ContextTrack) ((PlayerState) objJ).track().h();
                if (contextTrack == null) {
                    return rih1Var;
                }
                j380 j380VarMetadata = contextTrack.metadata();
                if (!u890.j(j380VarMetadata.get("pointer.npv_mode"), "standalone") || (str = (String) j380VarMetadata.get(ContextTrack$Metadata.KEY_POINTER_URI)) == null || !nhc1.Y(str, "spotify:clip:", false) || (charSequence = (CharSequence) j380VarMetadata.get(ContextTrack$Metadata.KEY_MEDIA_EXTERNAL_URL)) == null || ihc1.y0(charSequence) || l0lVar == null || (strQ = l0lVar.q()) == null) {
                    return rih1Var;
                }
                if (!nhc1.Y(strQ, "esdk:", false) && !nhc1.Y(strQ, "harmony:", false)) {
                    return rih1Var;
                }
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131959674});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                er91 er91Var = new er91((fs91) null, "", 2131959674, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
                if (kt91Var.g()) {
                    kt91Var.k(er91Var);
                    return rih1Var;
                }
                kt91Var.o(er91Var);
                return rih1Var;
            case 8:
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
                mr20 mr20Var = (mr20) this.d;
                s4q0 s4q0Var = new s4q0((ven0) this.c, (String) obj3, (byte) 5);
                this.b = true;
                return mr20Var.collect(s4q0Var, this) == serializable ? serializable : rih1Var;
            case 9:
                boolean z10 = this.b;
                if (!z10) {
                    hm5.M(obj);
                    this.b = true;
                    return ((ldj0) ((uon) this.d).c).c((String) this.c, (tv80) obj3, null, null, this) == serializable ? serializable : rih1Var;
                }
                if (z10) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 10:
                boolean z11 = this.b;
                if (!z11) {
                    hm5.M(obj);
                    iu30Var2 = (iu30) this.c;
                    this.d = iu30Var2;
                    this.b = true;
                    objP = ((et90) obj3).p(this);
                    if (objP == serializable) {
                        return serializable;
                    }
                } else {
                    if (!z11) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    iu30Var2 = (iu30) this.d;
                    hm5.M(obj);
                    objP = obj;
                }
                iu30Var2.invoke(objP);
                return rih1Var;
            case 11:
                boolean z12 = this.b;
                if (!z12) {
                    hm5.M(obj);
                    ovs0 ovs0Var = (ovs0) this.d;
                    if (!ovs0Var.e || ovs0Var.f == null || (accessibilityManager = (AccessibilityManager) ((Context) this.c).getSystemService(AccessibilityManager.class)) == null || !accessibilityManager.isTouchExplorationEnabled()) {
                        return rih1Var;
                    }
                    this.b = true;
                    if (hap1.i(300L, this) == serializable) {
                        return serializable;
                    }
                } else {
                    if (!z12) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                try {
                    lz20.b((lz20) obj3);
                    return rih1Var;
                } catch (IllegalStateException unused) {
                    return rih1Var;
                }
            case 12:
                xtb0 xtb0Var = (xtb0) this.c;
                boolean z13 = this.b;
                if (!z13) {
                    hm5.M(obj);
                    Integer num = ((wvs0) this.d).b;
                    if (num == null) {
                        return rih1Var;
                    }
                    List<qtb0> list = xtb0Var.h().l;
                    if ((list instanceof Collection) && list.isEmpty()) {
                        iIntValue = num.intValue();
                        this.b = true;
                        if (xtb0Var.f(iIntValue, 0, this) == serializable) {
                            return serializable;
                        }
                    } else {
                        for (qtb0 qtb0Var : list) {
                            if (qtb0Var.a != num.intValue() || qtb0Var.p < 0) {
                            }
                        }
                        iIntValue = num.intValue();
                        this.b = true;
                        if (xtb0Var.f(iIntValue, 0, this) == serializable) {
                            return serializable;
                        }
                    }
                } else {
                    if (!z13) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ((iu30) obj3).invoke(svs0.a);
                return rih1Var;
            case 13:
                String str6 = (String) obj3;
                w4t0 w4t0Var = (w4t0) this.c;
                bpb1 bpb1Var = w4t0Var.N0;
                bpb1 bpb1Var2 = w4t0Var.t;
                boolean z14 = this.b;
                try {
                    if (z14) {
                        if (z14) {
                            hm5.M(obj);
                            objK = obj;
                        } else {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                        }
                        return null;
                    }
                    hm5.M(obj);
                    bpb1Var.m((Object) null, z6x.a);
                    bpb1Var2.m((Object) null, zic1.a);
                    zhq0 zhq0Var = w4t0Var.e;
                    this.d = null;
                    this.b = true;
                    objK = zhq0Var.k(str6, this);
                    if (objK == serializable) {
                        return serializable;
                    }
                    m231Var = (e5t0) objK;
                    break;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                boolean z15 = m231Var instanceof m231;
                if (z15) {
                    Throwable thA = e331.a(m231Var);
                    if (thA == null) {
                        thA = new Throwable();
                    }
                    bpb1Var2.m((Object) null, new xic1(thA));
                    return rih1Var;
                }
                w4t0Var.P0 = str6;
                if (z15) {
                    m231Var = null;
                }
                if (m231Var != null) {
                    e5t0 e5t0Var = m231Var;
                    if (e5t0Var.d == null) {
                        e5t0Var = new e5t0(e5t0Var.a, e5t0Var.b, e5t0Var.c, w4t0Var.O0);
                    }
                    w4t0Var.O0 = e5t0Var.d;
                    w4t0Var.g.m((Object) null, new b5t0(e5t0Var));
                    smc0 smc0VarN = k4p1.n();
                    ArrayList arrayList3 = e5t0Var.b.b;
                    ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
                    for (Object obj5 : arrayList3) {
                        int i3 = i + 1;
                        if (i < 0) {
                            p7h.T();
                            throw null;
                        }
                        m4t0 m4t0Var = (n4t0) obj5;
                        k3h1 k3h1Var = new k3h1(i);
                        if (m4t0Var instanceof m4t0) {
                            m4t0 m4t0Var2 = m4t0Var;
                            String str7 = m4t0Var2.d;
                            String str8 = m4t0Var2.c;
                            String str9 = m4t0Var2.b;
                            String str10 = m4t0Var2.a;
                            int iC = l1d.C(m4t0Var2.e);
                            if (iC == 0) {
                                s4t0Var = new u4t0(str10, str9, str8, str7, k3h1Var, String.valueOf(i));
                            } else if (iC == 1) {
                                s4t0Var = new t4t0(str10, str9, str8, str7, k3h1Var, String.valueOf(i));
                            } else {
                                eg.o();
                            }
                            arrayList4.add(s4t0Var);
                            i = i3;
                        } else if (m4t0Var instanceof l4t0) {
                            l4t0 l4t0Var = (l4t0) m4t0Var;
                            s4t0Var = new s4t0(l4t0Var.a, l4t0Var.b, l4t0Var.c, l4t0Var.d, k3h1Var, String.valueOf(i));
                            arrayList4.add(s4t0Var);
                            i = i3;
                        } else {
                            eg.o();
                        }
                    }
                    smc0VarN.addAll(arrayList4);
                    bpb1Var.l(k4p1.k(smc0VarN));
                    bpb1Var2.m((Object) null, yic1.a);
                    return rih1Var;
                }
                hhg1.n("Required value was null.");
                return null;
            case 14:
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
                o95 o95Var = (o95) this.d;
                qr80 qr80Var = (qr80) ((ven0) this.c).getValue();
                long j = qr80Var.a;
                this.b = true;
                return o95.b(o95Var, qr80Var, (fe5) obj3, (Float) null, (iu30) null, this, 12) == serializable ? serializable : rih1Var;
            case 15:
                boolean z17 = this.b;
                if (!z17) {
                    hm5.M(obj);
                    this.b = true;
                    return ((yzc0) ((ynb0) ((t8r0) this.d).a).get()).d((wzc0) this.c, (String) obj3, this) == serializable ? serializable : rih1Var;
                }
                if (z17) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 16:
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
                oy1 oy1Var = (oy1) this.d;
                aas aasVar = oy1Var.b;
                String str11 = (String) this.c;
                y6r0 y6r0Var = oy1Var.c.get();
                str3 = y6r0Var != null ? y6r0Var.a : null;
                CompletableObserveOn completableObserveOnB = aasVar.b(str11, str3 != null ? str3 : "", 1, ((tv80) obj3).a.a);
                this.b = true;
                return fc11.i(completableObserveOnB, this) == serializable ? serializable : rih1Var;
            case 17:
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
                oy1 oy1Var2 = (oy1) this.d;
                aas aasVar2 = oy1Var2.b;
                List list2 = (List) this.c;
                y6r0 y6r0Var2 = oy1Var2.c.get();
                str3 = y6r0Var2 != null ? y6r0Var2.a : null;
                CompletableObserveOn completableObserveOnA = aasVar2.a(1, str3 != null ? str3 : "", ((tv80) obj3).a.a, list2);
                this.b = true;
                return fc11.i(completableObserveOnA, this) == serializable ? serializable : rih1Var;
            case 18:
                boolean z20 = this.b;
                if (!z20) {
                    hm5.M(obj);
                    yjp1 yjp1Var = cky0.a;
                    this.b = true;
                    return ((yzc0) this.d).h(new vzc0((String) this.c), (tv80) obj3, yjp1Var, this) == serializable ? serializable : rih1Var;
                }
                if (z20) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 19:
                String str12 = (String) this.c;
                boolean z21 = this.b;
                if (!z21) {
                    hm5.M(obj);
                    yzc0 yzc0VarA = ((g0d0) ((so) this.d).b).a(str12);
                    fns fnsVar = igu.a;
                    b3s b3sVar2 = b3s.c;
                    dvq0 dvq0Var = new dvq0((Object) yzc0VarA, (Object) str12, obj3, (lnm) null, (byte) 18);
                    this.b = true;
                    if (fn31.Y(b3sVar2, dvq0Var, this) == serializable) {
                        return serializable;
                    }
                } else {
                    if (!z21) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return l1w0.a;
            case 20:
                xut0 xut0Var = (xut0) this.d;
                boolean z22 = this.b;
                if (!z22) {
                    hm5.M(obj);
                    trc0 trc0VarA = xut0Var.a();
                    boolean z23 = ((sp91) this.c).a != rp91.a;
                    lqz lqzVarS = EsPreparePlayOptions.PreparePlayOptions.s();
                    imz imzVarO = EsContextPlayerOptions.ContextPlayerOptionOverrides.o();
                    ppz ppzVarN = EsOptional.OptionalBoolean.n();
                    ppzVarN.n(z23);
                    imzVarO.u(ppzVarN);
                    lqzVarS.x(imzVarO.build());
                    EsPreparePlayOptions.PreparePlayOptions preparePlayOptionsBuild = lqzVarS.build();
                    xrc0 xrc0Var = (xrc0) xut0Var.d.get();
                    String str13 = (String) xut0Var.i.getValue();
                    PlayOrigin playOrigin = (PlayOrigin) xut0Var.b.get();
                    zpz zpzVarY = EsPlayOrigin.PlayOrigin.y();
                    zpzVarY.s(playOrigin.featureIdentifier());
                    zpzVarY.u(playOrigin.referrerIdentifier());
                    EsPlayOrigin.PlayOrigin playOriginBuild = zpzVarY.build();
                    Map mapSingletonMap = Collections.singletonMap("fully_cached_files_only", "true");
                    EsLoggingParams.LoggingParams loggingParamsB = xut0Var.b((String) obj3);
                    this.b = true;
                    objB = xrc0.b(xrc0Var, str13, trc0VarA, preparePlayOptionsBuild, playOriginBuild, (EsPlayOptions.PlayOptions) null, mapSingletonMap, loggingParamsB, (ayc0) null, this, 144);
                    if (objB == serializable) {
                        return serializable;
                    }
                } else {
                    if (!z22) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objB = obj;
                }
                xut0Var.getClass();
                return xut0.d((py21) objB);
            case 21:
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
                mr20 mr20VarU = rqt0.u(hu20.e((bpb1) this.d, new t4o0((lnm) null, (y1u0) this.c, (byte) 19)));
                h8c h8cVar = new h8c((Consumer) obj3, (byte) 6);
                this.b = true;
                return mr20VarU.collect(h8cVar, this) == serializable ? serializable : rih1Var;
            case 22:
                w6u0 w6u0Var = (w6u0) obj3;
                PlayerError playerError = (PlayerError) this.c;
                boolean z25 = this.b;
                if (!z25) {
                    hm5.M(obj);
                    ErrorType errorTypeError = playerError.error();
                    Objects.toString(errorTypeError);
                    errorTypeError.getClass();
                    int[] iArr = v6u0.a;
                    int i4 = iArr[errorTypeError.ordinal()];
                    if (i4 == 1) {
                        i2 = 1;
                    } else if (i4 == 2) {
                        i2 = 2;
                    } else if (i4 == 3) {
                        i2 = 3;
                    } else if (i4 == 4) {
                        i2 = 4;
                    }
                    if (i2 != 0) {
                        x6u0 x6u0Var = (x6u0) w6u0Var.b.get();
                        String str14 = w6u0Var.e;
                        t2j0 t2j0Var = x6u0Var.a;
                        a8r a8rVarN = DeadEndsPlaybackTimeoutEvent.n();
                        a8rVarN.n(str14);
                        a8rVarN.q(k4s0.f(i2));
                        t2j0Var.a(a8rVarN.build());
                    }
                    int i5 = iArr[errorTypeError.ordinal()];
                    if (i5 == 1) {
                        s6u0Var = new s6u0(2, w6u0Var.e);
                    } else if (i5 != 2) {
                        s6u0Var = r6u0.a;
                        if (i5 != 3 && i5 != 4) {
                            s6u0Var = null;
                        }
                    } else {
                        s6u0Var = new s6u0(1, w6u0Var.e);
                    }
                    if (s6u0Var == null) {
                        return rih1Var;
                    }
                    dt71 dt71Var = w6u0Var.c;
                    this.c = null;
                    this.d = w6u0Var;
                    this.b = true;
                    if (dt71Var.emit(s6u0Var, this) == serializable) {
                        return serializable;
                    }
                } else {
                    if (!z25) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w6u0Var = (w6u0) this.d;
                    hm5.M(obj);
                }
                w6u0Var.d = true;
                return rih1Var;
            case 23:
                c7u0 c7u0Var = (c7u0) obj3;
                t6u0 t6u0Var = (t6u0) this.d;
                boolean z26 = this.b;
                if (!z26) {
                    hm5.M(obj);
                    if (!smo1.u((c9n) this.c) || !(t6u0Var instanceof s6u0)) {
                        return rih1Var;
                    }
                    this.d = t6u0Var;
                    this.b = true;
                    objI = b5p1.i(new lt20(new x010(((n3v) c7u0Var.c.get()).a(), ((lut0) c7u0Var.d.get()).c, new irp0(3, (lnm) null, (byte) 10), (byte) 1), new w1e0(3, (lnm) null, (byte) 13), (byte) 0), this);
                    if (objI == serializable) {
                        return serializable;
                    }
                } else {
                    if (!z26) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objI = obj;
                }
                if (!((Boolean) objI).booleanValue() || u890.j(t6u0Var, c7u0Var.g)) {
                    return rih1Var;
                }
                s6u0 s6u0Var2 = (s6u0) t6u0Var;
                int i6 = s6u0Var2.a;
                w6b1 w6b1VarA = f7b1.a(blc0.Vc);
                if (w6b1VarA != null && (str2 = (String) o7h.s0(w6b1VarA.c)) != null) {
                    int iC2 = l1d.C(s6u0Var2.a);
                    if (iC2 == 0) {
                        str3 = "start_slow";
                    } else if (iC2 == 1) {
                        str3 = "stuck";
                    } else {
                        eg.o();
                    }
                    a1r0.j((a1r0) c7u0Var.b.get(), f4i1.f(str2, "?reason=", URLEncoder.encode(str3, StandardCharsets.UTF_8.name())), (String) null, (Bundle) null, false, 12);
                }
                c7u0Var.g = t6u0Var;
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
                kge kgeVar = (kge) this.d;
                h8u0 h8u0Var = new h8u0((i8u0) this.c, (llm) obj3, (byte) 0);
                this.b = true;
                return kgeVar.collect(h8u0Var, this) == serializable ? serializable : rih1Var;
            case 25:
                boolean z28 = this.b;
                if (z28) {
                    if (z28) {
                        throw l1d.v(obj);
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                bpb1 bpb1Var3 = ((r091) this.d).g;
                h8u0 h8u0Var2 = new h8u0((i8u0) this.c, (llm) obj3, (byte) 1);
                this.b = true;
                bpb1Var3.collect(h8u0Var2, this);
                return serializable;
            case 26:
                tv80 tv80Var = (tv80) this.d;
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
                q9b q9bVar = (q9b) this.c;
                q8n q8nVar = (q8n) q9bVar.d;
                rwm0 rwm0Var = new rwm0((Object) q9bVar, obj3, (Object) tv80Var, (lnm) null, (byte) 22);
                this.d = null;
                this.b = true;
                return fn31.Y(q8nVar, rwm0Var, this) == serializable ? serializable : rih1Var;
            case 27:
                boolean z30 = this.b;
                if (z30) {
                    if (z30) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                fu20 fu20Var = new fu20(h4p1.l(new vs0((ArrayList) this.c, (f8b) ((ytp0) this.d).d, false, (lnm) null, (byte) 13)), new hak((p811) obj3, (lnm) null, (byte) 4), (byte) 1);
                zio0 zio0Var = new zio0(2, (lnm) null, (byte) 10);
                this.b = true;
                Object objJ2 = b5p1.j(fu20Var, zio0Var, this);
                return objJ2 == serializable ? serializable : objJ2;
            case 28:
                boolean z31 = this.b;
                if (!z31) {
                    hm5.M(obj);
                    this.b = true;
                    Serializable serializableI = ((ytp0) this.d).i(((wsc0) this.c).e, (ArrayList) obj3, this);
                    return serializableI == serializable ? serializable : serializableI;
                }
                if (z31) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                hlu0 hlu0Var = (hlu0) this.c;
                boolean z32 = this.b;
                if (!z32) {
                    hm5.M(obj);
                    it = hlu0Var.m.d.iterator();
                } else {
                    if (!z32) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (Iterator) this.d;
                    hm5.M(obj);
                }
                while (it.hasNext()) {
                    bqn bqnVar = (bqn) it.next();
                    this.d = it;
                    this.b = true;
                    if (hlu0Var.c((String) obj3, bqnVar, this) == serializable) {
                        return serializable;
                    }
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dvq0(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dvq0(Object obj, Object obj2, ven0 ven0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.c = ven0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvq0(w6u0 w6u0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 22;
        this.e = w6u0Var;
    }
}
