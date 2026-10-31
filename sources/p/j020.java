package p;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.party.mobile.v2.GetUpcomingListeningPartyExtendedMarketingCardsRequest;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.core.Observable;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import spotify.your_library.esperanto.proto.YourLibraryRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j020 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j020(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return new j020((h0y) obj2, lnmVar, (byte) 0);
            case 1:
                return new j020((bk1) obj2, lnmVar, (byte) 1);
            case 2:
                return new j020((jf01) obj2, lnmVar, (byte) 2);
            case 3:
                return new j020((si20) obj2, lnmVar, (byte) 3);
            case 4:
                return new j020((qx20) obj2, lnmVar, (byte) 4);
            case 5:
                return new j020((rx20) obj2, lnmVar, (byte) 5);
            case 6:
                return new j020((l030) obj2, lnmVar, (byte) 6);
            case 7:
                return new j020((p410) obj2, lnmVar, (byte) 7);
            case 8:
                return new j020((y730) obj2, lnmVar, (byte) 8);
            case 9:
                return new j020((ai7) obj2, lnmVar, (byte) 9);
            case 10:
                return new j020((wc30) obj2, lnmVar, (byte) 10);
            case 11:
                return new j020((ul30) obj2, lnmVar, (byte) 11);
            case 12:
                return new j020((is30) obj2, lnmVar, (byte) 12);
            case 13:
                return new j020((k740) obj2, lnmVar, (byte) 13);
            case 14:
                return new j020((pg40) obj2, lnmVar, (byte) 14);
            case 15:
                return new j020((it40) obj2, lnmVar, (byte) 15);
            case 16:
                return new j020((tm) obj2, lnmVar, (byte) 16);
            case 17:
                return new j020((hfp1) obj2, lnmVar, (byte) 17);
            case 18:
                return new j020((u250) obj2, lnmVar, (byte) 18);
            case 19:
                return new j020((y250) obj2, lnmVar, (byte) 19);
            case 20:
                return new j020((h950) obj2, lnmVar, (byte) 20);
            case 21:
                return new j020((de50) obj2, lnmVar, (byte) 21);
            case 22:
                return new j020((i160) obj2, lnmVar, (byte) 22);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new j020((drr0) obj2, lnmVar, (byte) 23);
            case 24:
                return new j020((bp60) obj2, lnmVar, (byte) 24);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new j020((bx60) obj2, lnmVar, (byte) 25);
            case 26:
                return new j020((hx60) obj2, lnmVar, (byte) 26);
            case 27:
                return new j020((ty60) obj2, lnmVar, (byte) 27);
            case 28:
                return new j020((oj70) obj2, lnmVar, (byte) 28);
            default:
                return new j020((rj70) obj2, lnmVar, (byte) 29);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invoke(Object obj, Object obj2) throws KotlinNothingValueException {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 1:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 2:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 3:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 4:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 5:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return d9nVar;
            case 6:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 7:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 8:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 9:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 10:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 11:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return d9nVar;
            case 12:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 13:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 14:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 15:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 16:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 17:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 18:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 19:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 20:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 21:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 22:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return d9nVar;
            case 24:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 26:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 27:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 28:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            default:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        Object objU;
        Object objI;
        Object objE;
        Object objK;
        r850 r850Var;
        qg6 qg6Var;
        Object objC;
        Object objC2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        rih1 rih1Var2 = d9n.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarC = ((ov20) ((h0y) obj2).b).c("dj-language", "not-set");
                this.b = true;
                Object objI2 = b5p1.i(mr20VarC, this);
                return objI2 == rih1Var2 ? rih1Var2 : objI2;
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
                ymh1 ymh1Var = (ymh1) ((bk1) obj2).b;
                ar40 ar40VarN = GetUpcomingListeningPartyExtendedMarketingCardsRequest.n();
                ar40VarN.n();
                GetUpcomingListeningPartyExtendedMarketingCardsRequest getUpcomingListeningPartyExtendedMarketingCardsRequest = (GetUpcomingListeningPartyExtendedMarketingCardsRequest) ar40VarN.build();
                this.b = true;
                Object objA = ymh1Var.a(getUpcomingListeningPartyExtendedMarketingCardsRequest, this);
                return objA == rih1Var2 ? rih1Var2 : objA;
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
                this.b = true;
                ohd ohdVar = new ohd(1, aym.t(this));
                ohdVar.t();
                ((jf01) obj2).d(new d420(ohdVar));
                Object objR = ohdVar.r();
                return objR == rih1Var2 ? rih1Var2 : objR;
            case 3:
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    this.b = true;
                    Object objB = ((si20) obj2).b(this);
                    return objB == rih1Var2 ? rih1Var2 : objB;
                }
                if (z4) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
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
                qx20 qx20Var = (qx20) obj2;
                dt71 dt71Var = qx20Var.a;
                xp10 xp10Var = new xp10(qx20Var, (byte) 3);
                this.b = true;
                dt71Var.collect(xp10Var, this);
                return rih1Var2;
            case 5:
                boolean z6 = this.b;
                if (z6) {
                    if (z6) {
                        throw l1d.v(obj);
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                rx20 rx20Var = (rx20) obj2;
                dt71 dt71Var2 = rx20Var.a.b;
                xp10 xp10Var2 = new xp10(rx20Var, (byte) 4);
                this.b = true;
                dt71Var2.collect(xp10Var2, this);
                return rih1Var2;
            case 6:
                boolean z7 = this.b;
                if (!z7) {
                    hm5.M(obj);
                    this.b = true;
                    return u7n0.t((l030) obj2, null, this) == rih1Var2 ? rih1Var2 : rih1Var;
                }
                if (z7) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                boolean z8 = this.b;
                if (!z8) {
                    hm5.M(obj);
                    xyc0 xyc0Var = (iyc0) ((p410) obj2).d;
                    this.b = true;
                    objU = xyc0Var.u("spotify:list:whats-new:podcasts", ddd1.t, this);
                    if (objU == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z8) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objU = obj;
                }
                ((py21) objU).d();
                return rih1Var;
            case 8:
                boolean z9 = this.b;
                if (z9) {
                    if (z9) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                vwm1 vwm1Var = ((y730) obj2).a;
                YourLibraryRequest yourLibraryRequest = y730.d;
                this.b = true;
                Object objA2 = vwm1Var.a(yourLibraryRequest, this);
                return objA2 == rih1Var2 ? rih1Var2 : objA2;
            case 9:
                boolean z10 = this.b;
                if (!z10) {
                    hm5.M(obj);
                    this.b = true;
                    return ((ai7) obj2).c(this) == rih1Var2 ? rih1Var2 : rih1Var;
                }
                if (z10) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 10:
                wc30 wc30Var = (wc30) obj2;
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
                mr20 mr20VarU = rqt0.u(r4p1.m(new evz(qqn1.f(wc30Var.a.b0(tc30.class)), wc30Var, (byte) 21), m830.O0));
                xp10 xp10Var3 = new xp10(wc30Var, (byte) 5);
                this.b = true;
                return mr20VarU.collect(xp10Var3, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 11:
                ul30 ul30Var = (ul30) obj2;
                boolean z12 = this.b;
                if (z12) {
                    if (!z12) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        hm5.M(obj);
                    }
                    return null;
                }
                hm5.M(obj);
                zob1 zob1VarCurrent = ul30Var.b.b.current();
                h210 h210Var = new h210(ul30Var, (lnm) null, (byte) 12);
                this.b = true;
                if (l4p1.q(zob1VarCurrent, h210Var, this) == rih1Var2) {
                    return rih1Var2;
                }
                eg.m("SharedFlow never completes, this call should never return.");
                return null;
            case 12:
                is30 is30Var = (is30) obj2;
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
                mr20 mr20Var = is30Var.l;
                mr20 mr20Var2 = is30Var.m;
                ce2 ce2Var = new ce2(3, (lnm) null, (byte) 19);
                xp10 xp10Var4 = new xp10(is30Var, (byte) 6);
                this.b = true;
                Object objS = fc11.s(vrl.c, this, xp10Var4, new ekv(ce2Var, (lnm) null), new mr20[]{mr20Var, mr20Var2});
                if (objS != rih1Var2) {
                    objS = rih1Var;
                }
                return objS == rih1Var2 ? rih1Var2 : rih1Var;
            case 13:
                k740 k740Var = (k740) obj2;
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
                jge jgeVarE = hu20.e(k740Var.d, new uls((lnm) null, k740Var, (byte) 22));
                xp10 xp10Var5 = new xp10(k740Var, (byte) 8);
                this.b = true;
                return jgeVarE.collect(xp10Var5, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 14:
                pg40 pg40Var = (pg40) obj2;
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
                mfe mfeVarB = k4p1.B(pg40Var.c.a);
                vi viVar = new vi(pg40Var, (byte) 7);
                this.b = true;
                return mfeVarB.collect(viVar, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 15:
                boolean z16 = this.b;
                try {
                    if (!z16) {
                        hm5.M(obj);
                        it40 it40Var = (it40) obj2;
                        kx5 kx5Var = new kx5(it40Var.b);
                        this.b = true;
                        if (it40Var.b(kx5Var, this) == rih1Var2) {
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
                } catch (ClosedSendChannelException e) {
                    return new Integer(Log.e("GlanceRemoteViewService", "Error when trying to start session for list items", e));
                }
            case 16:
                tm tmVar = (tm) obj2;
                boolean z17 = this.b;
                if (!z17) {
                    hm5.M(obj);
                    any anyVar = new any(rwq.q(new f710(tmVar, (byte) 27)), (byte) 18);
                    this.b = true;
                    objI = b5p1.i(anyVar, this);
                    if (objI == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z17) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objI = obj;
                }
                ((paj0) tmVar.c).c((MessageResponseToken) objI);
                return rih1Var;
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
                hfp1 hfp1Var = (hfp1) obj2;
                this.b = true;
                ohd ohdVar2 = new ohd(1, aym.t(this));
                ohdVar2.t();
                hfp1Var.n(new c1u(ohdVar2));
                hfp1Var.m(new d420(ohdVar2));
                hfp1Var.a(dsd1.a, new ux40(ohdVar2));
                Object objR2 = ohdVar2.r();
                return objR2 == rih1Var2 ? rih1Var2 : objR2;
            case 18:
                u250 u250Var = (u250) obj2;
                boolean z19 = this.b;
                if (z19) {
                    if (z19) {
                        hm5.M(obj);
                        objE = obj;
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                u250Var.k1();
                oql oqlVar = u250Var.b2;
                if (oqlVar == null) {
                    u890.C("credentialManagerGoogleSignInApi");
                    throw null;
                }
                this.b = true;
                r5o r5oVar = (r5o) oqlVar.c;
                r5oVar.b.a(new khv0(r5oVar.a.a, 4, (Map) null, "credential_manager_google_sign_in"));
                objE = ((w5o) oqlVar.b).e(this);
                if (objE == rih1Var2) {
                    return rih1Var2;
                }
                m450 m450Var = (m450) objE;
                if (!(m450Var instanceof j450)) {
                    if (!(m450Var instanceof k450)) {
                        if (!u890.j(m450Var, l450.a)) {
                            eg.o();
                            return null;
                        }
                        r5o r5oVarI1 = u250Var.i1();
                        r5oVarI1.b.a(new khv0(r5oVarI1.a.a, 4, (Map) null, "credential_manager_google_unsupported_method"));
                        u250Var.j1().a(true);
                        return rih1Var;
                    }
                    r5o r5oVarI2 = u250Var.i1();
                    Exception exc = ((k450) m450Var).a;
                    r5oVarI2.c(exc.toString());
                    if (exc instanceof GetCredentialCancellationException) {
                        u250Var.j1().a(true);
                        return rih1Var;
                    }
                    u250Var.j2.setValue(y1a1.A(u250Var.P0(), new t250(u250Var, (byte) 0), new t250(u250Var, (byte) 1), new t250(u250Var, (byte) 2)));
                    return rih1Var;
                }
                r5o r5oVarI3 = u250Var.i1();
                r5oVarI3.b.a(new khv0(r5oVarI3.a.a, 4, (Map) null, "credential_manager_google_sign_in_success"));
                x250 x250Var = u250Var.W1;
                if (x250Var == null) {
                    u890.C("viewBinderListener");
                    throw null;
                }
                r250 r250Var = ((j450) m450Var).a;
                String string = ((Bundle) ((yf) r250Var).b).getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID");
                if (string != null) {
                    x250Var.d.d(new yit(new b3f0(new o450(r250Var.c), string, r250Var.d), bk8.e, (n5o) null, 12), true);
                    return rih1Var;
                }
                View view = x250Var.a.h2;
                if (view == null) {
                    u890.C("loadingView");
                    throw null;
                }
                view.setVisibility(8);
                x250Var.c();
                r5o r5oVar2 = x250Var.c;
                r5oVar2.b.a(new jhv0(r5oVar2.a.a, "third_party_auth_no_email", "google_auth_button", "credential_manager_api"));
                return rih1Var;
            case 19:
                y250 y250Var = (y250) obj2;
                boolean z20 = this.b;
                if (!z20) {
                    hm5.M(obj);
                    mr20 mr20VarD = y250Var.d();
                    this.b = true;
                    objK = b5p1.k(mr20VarD, this);
                    if (objK == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z20) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objK = obj;
                }
                l2s0 l2s0Var = (l2s0) objK;
                if (l2s0Var == null || !(l2s0Var instanceof j2s0)) {
                    return rih1Var;
                }
                lag lagVar = y250Var.c;
                fn31.T((u9c0) lagVar.c, (o8n) null, 0, new hff(lagVar, e3s0.d, ((j2s0) l2s0Var).a, (lnm) null, (byte) 20), 3);
                return rih1Var;
            case 20:
                h950 h950Var = (h950) obj2;
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
                ezc ezcVarG = yoi1.g(h950Var.c);
                xp10 xp10Var6 = new xp10(h950Var, (byte) 11);
                this.b = true;
                return ezcVarG.collect(xp10Var6, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 21:
                boolean z22 = this.b;
                if (z22 && !z22) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                do {
                    long j = ((de50) obj2).a.u;
                    if (((int) (j >> 32)) != 0 && ((int) (j & 4294967295L)) != 0) {
                        return Boolean.TRUE;
                    }
                    r850Var = r850.O0;
                    this.b = true;
                } while (s110.h(getContext()).D(r850Var, this) != rih1Var2);
                return rih1Var2;
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
                i160 i160Var = (i160) obj2;
                ijr ijrVar = i160Var.h;
                String str = i160Var.b;
                this.b = true;
                return ijrVar.e(str, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                boolean z24 = this.b;
                if (z24 && !z24) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                do {
                    qg6Var = new qg6((drr0) obj2, (byte) 16);
                    this.b = true;
                } while (k5p1.x(qg6Var, this) != rih1Var2);
                return rih1Var2;
            case 24:
                bp60 bp60Var = (bp60) obj2;
                boolean z25 = this.b;
                if (z25) {
                    if (z25) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                foc1 foc1VarJ = bp60Var.d.j();
                xp10 xp10Var7 = new xp10(bp60Var, (byte) 15);
                this.b = true;
                foc1VarJ.collect(new uk50(xp10Var7, (byte) 21), this);
                return rih1Var2;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
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
                hur hurVar = (hur) ((bx60) obj2).b;
                this.b = true;
                zfr zfrVar = (zfr) hurVar.b;
                Object objCollect = hu20.e(new dkm((mr20) zfrVar.c, (byte) 29), new b7c((lnm) null, zfrVar, (byte) 25)).collect(new skr(hurVar, (byte) 7), this);
                if (objCollect != rih1Var2) {
                    objCollect = rih1Var;
                }
                return objCollect == rih1Var2 ? rih1Var2 : rih1Var;
            case 26:
                hx60 hx60Var = (hx60) obj2;
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
                ay8 ay8VarF = d3p1.F(hx60Var.d, hx60Var.g, hx60Var.e);
                xp10 xp10Var8 = new xp10(hx60Var, (byte) 17);
                this.b = true;
                ay8VarF.collect(new gw60(xp10Var8, (byte) 2), this);
                return rih1Var2;
            case 27:
                ty60 ty60Var = (ty60) obj2;
                boolean z28 = this.b;
                if (!z28) {
                    hm5.M(obj);
                    ty60Var.g();
                    this.b = true;
                    return ty60Var.a(this) == rih1Var2 ? rih1Var2 : rih1Var;
                }
                if (z28) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 28:
                oj70 oj70Var = (oj70) obj2;
                boolean z29 = this.b;
                if (!z29) {
                    hm5.M(obj);
                    c9c0 c9c0Var = oj70Var.b;
                    this.b = true;
                    objC = kr90.c(c9c0Var, this);
                    if (objC == rih1Var2) {
                        return rih1Var2;
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
                z1s z1sVar = (z1s) oj70Var.d;
                z1sVar.j.b(Observable.combineLatest(z1sVar.c.startWithItem(k8c0.ON_DESTROY), z1sVar.h, vf61.O0).filter(q9w.X0).map(s9w.W0).subscribe(new xu(z1sVar, (byte) 21)));
                return rih1Var;
            default:
                rj70 rj70Var = (rj70) obj2;
                boolean z30 = this.b;
                if (!z30) {
                    hm5.M(obj);
                    c9c0 c9c0Var2 = rj70Var.l;
                    this.b = true;
                    objC2 = kr90.c(c9c0Var2, this);
                    if (objC2 == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z30) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objC2 = obj;
                }
                if (!((Boolean) objC2).booleanValue()) {
                    return rih1Var;
                }
                int iOrdinal = hqq0.l0(rj70Var.g.a.a).ordinal();
                if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 14) {
                    rj70Var.f.a.onNext(Boolean.TRUE);
                }
                rj70Var.q.b(rj70Var.m.switchMap(new jl00(rj70Var, (byte) 17)).compose(new so(rj70Var.i, new ft30(1, rj70Var, rj70.class, "debounceAmount", "debounceAmount(Lcom/spotify/jam/features/notificationcenter/api/IPLNotificationCenter$Notification;)J", 0, (byte) 8), (byte) 16)).observeOn(rj70Var.n).subscribe(new od30(rj70Var, (byte) 20)));
                return rih1Var;
        }
    }
}
