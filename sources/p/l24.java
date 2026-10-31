package p;

import android.net.Uri;
import android.util.Base64;
import android.view.View;
import com.google.protobuf.Duration;
import com.spotify.campfire.datasource.impl.proto.MuteHierarchyRequest;
import com.spotify.home.slotloading.SlotEffect$FetchLayout;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.passkeys.v1.FinishAuthenticationRequest;
import com.spotify.passkeys.v1.FinishRegistrationRequest;
import com.spotify.passkeys.v1.FinishRegistrationResponse;
import com.spotify.passkeys.v1.IdentityAssertionOptions;
import com.spotify.passkeys.v1.Signals;
import com.spotify.passkeys.v1.StartRegistrationResponse;
import com.spotify.player.model.Context;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import com.spotify.rcs.resolver.grpc.v0.ResolveRequest;
import com.spotify.remoteconfig.fetcherimpl.network.ResolveRequestFailedException;
import com.spotify.venueview.v1.GetVenuePageRequest;
import com.spotify.wrapped.v1.proto.SceneTemplate;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class l24 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l24(qj41 qj41Var, boolean z, ayg1 ayg1Var, SceneTemplate.WrappedTwinContent.IntroCard introCard, lnm lnmVar) {
        super(1, lnmVar);
        this.a = (byte) 27;
        this.e = qj41Var;
        this.b = z;
        this.c = ayg1Var;
        this.d = introCard;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                return new l24(this.e, this.c, obj2, lnmVar, (byte) 0);
            case 1:
                return new l24(this.e, this.c, obj2, lnmVar, (byte) 1);
            case 2:
                return new l24(this.e, obj, obj2, lnmVar, (byte) 2);
            case 3:
                return new l24(this.e, obj, obj2, lnmVar, (byte) 3);
            case 4:
                return new l24(obj, (n811) this.e, (fqb) obj2, lnmVar);
            case 5:
                return new l24(this.e, obj, obj2, lnmVar, (byte) 5);
            case 6:
                return new l24(this.e, obj, obj2, lnmVar, (byte) 6);
            case 7:
                return new l24(this.e, obj, obj2, lnmVar, (byte) 7);
            case 8:
                return new l24(this.e, obj, obj2, lnmVar, (byte) 8);
            case 9:
                return new l24(this.e, obj, obj2, lnmVar, (byte) 9);
            case 10:
                return new l24(this.e, obj, obj2, lnmVar, (byte) 10);
            case 11:
                return new l24(this.e, obj, obj2, lnmVar, (byte) 11);
            case 12:
                return new l24(this.e, obj, obj2, lnmVar, (byte) 12);
            case 13:
                return new l24(this.e, obj, obj2, lnmVar, (byte) 13);
            case 14:
                return new l24(this.e, obj, obj2, lnmVar, (byte) 14);
            case 15:
                return new l24(this.e, obj, obj2, lnmVar, (byte) 15);
            case 16:
                return new l24(this.e, obj, obj2, lnmVar, (byte) 16);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new l24(this.e, obj, obj2, lnmVar, (byte) 17);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new l24(this.e, obj, obj2, lnmVar, (byte) 18);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new l24(this.e, obj, obj2, lnmVar, (byte) 19);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new l24(this.e, obj, obj2, lnmVar, (byte) 20);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new l24(this.e, obj, obj2, lnmVar, (byte) 21);
            case 22:
                return new l24(obj, obj2, lnmVar, (byte) 22);
            case 23:
                return new l24(this.e, obj, obj2, lnmVar, (byte) 23);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new l24(this.e, obj, obj2, lnmVar, (byte) 24);
            case 25:
                return new l24(this.e, obj, obj2, lnmVar, (byte) 25);
            case 26:
                return new l24(this.e, obj, obj2, lnmVar, (byte) 26);
            case 27:
                return new l24((qj41) this.e, this.b, (ayg1) obj, (SceneTemplate.WrappedTwinContent.IntroCard) obj2, lnmVar);
            default:
                return new l24(obj, obj2, lnmVar, (byte) 28);
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
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                break;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                break;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                break;
            case 22:
                break;
            case 23:
                break;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                break;
        }
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) throws IOException, ResolveRequestFailedException {
        Object objB;
        Object objD;
        Object objK;
        Object objB2;
        Object objA;
        Object objA2;
        Object objA3;
        day0 day0Var;
        Object objA4;
        f2g1 f2g1Var;
        Object objB3;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        byte[] bArrC = null;
        switch (b) {
            case 0:
                s24 s24Var = (s24) this.e;
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
                s24Var.c0(obj3);
                c24 c24Var = new c24(s24Var, (byte) 3);
                c6 c6Var = new c6((zu30) obj2, s24Var, (lnm) null, (byte) 27);
                this.b = true;
                return lm5.s(c24Var, c6Var, this) == d9nVar ? d9nVar : rih1Var;
            case 1:
                t24 t24Var = (t24) this.e;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    t24Var.l.setValue(obj3);
                    d24 d24Var = new d24(t24Var, (byte) 3);
                    c6 c6Var2 = new c6((zu30) obj2, t24Var, (lnm) null, (byte) 28);
                    this.b = true;
                    if (wm5.F(d24Var, c6Var2, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                if (!((Boolean) t24Var.a.invoke(obj3)).booleanValue()) {
                    return rih1Var;
                }
                t24Var.n.a(t24Var.c().f(obj3), t24Var.k.s());
                t24Var.h.setValue(obj3);
                t24Var.g.setValue(obj3);
                return rih1Var;
            case 2:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    this.b = true;
                    objB = ((xg8) this.e).c.b((ResolveRequest) obj3, (String) obj2, this);
                    if (objB == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objB = obj;
                }
                sy21 sy21Var = (sy21) objB;
                if (e8d1.a.contains(new Integer(sy21Var.a.d))) {
                    return sy21Var;
                }
                throw new ResolveRequestFailedException(f4i1.c(sy21Var.a.d, "Resolve request failed: "), sy21Var);
            case 3:
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
                g4b g4bVar = ((t3b) this.e).c;
                this.b = true;
                Object objE = g4bVar.e(new no2(g4bVar, (String) obj3, (gzx0) obj2, (lnm) null), this);
                if (objE != d9nVar) {
                    objE = rih1Var;
                }
                return objE == d9nVar ? d9nVar : rih1Var;
            case 4:
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    hm5.M(obj3);
                    sy21 sy21Var2 = (sy21) obj3;
                    uz21 uz21Var = (uz21) sy21Var2.b;
                    if (uz21Var == null) {
                        uz21Var = sy21Var2.c;
                    }
                    uz21 uz21Var2 = uz21Var;
                    if (uz21Var2 != null) {
                        try {
                            bArrC = uz21Var2.c();
                            uz21Var2.close();
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                u890.p(uz21Var2, th);
                                throw th2;
                            }
                        }
                    }
                    ((n811) this.e).a = bArrC != null ? bArrC.length : 0;
                    int i = sy21Var2.a.d;
                    this.b = true;
                    objD = ((fqb) obj2).d(i, bArrC, this);
                    if (objD == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z5) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objD = ((e331) obj).a;
                }
                return new e331(objD);
            case 5:
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
                nad nadVar = ((bfd) this.e).b;
                jfv jfvVar = (jfv) obj2;
                this.b = true;
                pad padVar = nadVar.a;
                MuteHierarchyRequest.Builder hierarchyId = MuteHierarchyRequest.newBuilder().setHierarchyId((String) obj3);
                if (jfvVar != null) {
                    long j = jfvVar.a;
                    ifv ifvVarQ = Duration.q();
                    ifvVarQ.q(jfv.u(j, ngv.e));
                    hierarchyId.setDuration(ifvVarQ.build());
                }
                Object objL = padVar.l(hierarchyId.build(), this);
                if (objL != d9nVar) {
                    objL = rih1Var;
                }
                return objL == d9nVar ? d9nVar : rih1Var;
            case 6:
                boolean z7 = this.b;
                if (!z7) {
                    hm5.M(obj);
                    this.b = true;
                    return ((ijr) this.e).f((String) obj3, (String) obj2, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z7) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                boolean z8 = this.b;
                if (z8) {
                    if (z8) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                String sessionId = ((SlotEffect$FetchLayout) obj2).getSessionId();
                this.b = true;
                Object objY = ((ua91) ((w2z) this.e).b).y((qkg) obj3, sessionId, this);
                return objY == d9nVar ? d9nVar : objY;
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
                iir iirVar = (iir) ((yxb0) this.e).d;
                pv90 pv90Var = ((ov90) obj3).a;
                String str = pv90Var.a;
                eu90 eu90Var = ((lv90) obj2).b;
                String str2 = pv90Var.c;
                this.b = true;
                if (eu90Var instanceof du90) {
                    objK = iirVar.n(str, (du90) eu90Var, str2, this);
                } else if (eu90Var.equals(bu90.a)) {
                    objK = iirVar.k(new j4s(iirVar, str, (lnm) null, (byte) 0), this);
                    if (objK != d9nVar) {
                        objK = (dv90) objK;
                    }
                } else {
                    if (!eu90Var.equals(cu90.a)) {
                        eg.o();
                        return null;
                    }
                    objK = iirVar.k(new j4s(iirVar, str, (lnm) null, (byte) 1), this);
                    if (objK != d9nVar) {
                        objK = (dv90) objK;
                    }
                }
                return objK == d9nVar ? d9nVar : objK;
            case 9:
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
                p410 p410Var = (p410) this.e;
                this.b = true;
                Object objY2 = fn31.Y((q8n) p410Var.b, new rzu(p410Var, ((pp90) obj3).h.b.c, (ou80) obj2, null, (byte) 23), this);
                if (objY2 != d9nVar) {
                    objY2 = rih1Var;
                }
                return objY2 == d9nVar ? d9nVar : rih1Var;
            case 10:
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
                k0d0 k0d0Var = (k0d0) this.e;
                ur00 ur00Var = k0d0Var.c;
                String str3 = k0d0Var.a;
                t4u0 t4u0Var = k0d0Var.g;
                this.b = true;
                return ur00Var.x(str3, usc0.b, (tv80) obj3, (yjp1) obj2, t4u0Var, this) == d9nVar ? d9nVar : rih1Var;
            case 11:
                d1d0 d1d0Var = (d1d0) obj2;
                c1d0 c1d0Var = (c1d0) this.e;
                boolean z12 = this.b;
                try {
                    if (!z12) {
                        hm5.M(obj);
                        String str4 = (String) obj3;
                        boolean z13 = d1d0Var == d1d0.b;
                        this.b = true;
                        if (c1d0Var.c(str4, this, z13) == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z12) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    int i2 = (d1d0Var == d1d0.a ? 1 : 0) != 0 ? 2131960143 : 2131960142;
                    kt91 kt91Var = c1d0Var.e;
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{Integer.valueOf(i2)});
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                    kt91Var.k(new er91((fs91) null, "", Integer.valueOf(i2), (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                    return rih1Var;
                } catch (Exception unused) {
                }
                break;
            case 12:
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
                ouj0 ouj0Var = (ouj0) this.e;
                this.b = true;
                Object objW = o1p1.w(d3p1.F((d0r) obj3, ouj0Var.g, (String) obj2), this);
                return objW == d9nVar ? d9nVar : objW;
            case 13:
                san0 san0Var = (san0) this.e;
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
                orj1 orj1Var = (zqj1) san0Var.a.get();
                String str5 = ((gey0) obj3).a;
                tv80 tv80VarD = cvl1.d((tqw) obj2);
                this.b = true;
                orj1 orj1Var2 = orj1Var;
                muz muzVarD = orj1Var2.b.d();
                ou80 ou80Var = tv80VarD.a;
                kbp0 kbp0Var = new kbp0(orj1Var2, muzVarD, PlayCommand.builder(Context.fromUri(str5).toBuilder().metadata(sqg0.J(new mmr0[]{new mmr0("has_video", "true"), new mmr0("is_single_track_video_content", "true")})).build(), orj1Var2.c).loggingParams(LoggingParams.builder().interactionId(ou80Var.a).build()).options(PreparePlayOptions.builder().skipTo(SkipToTrack.builder().trackUri(str5).build()).build()).build(), str5, ou80Var, (byte) 21);
                ohd ohdVar = new ohd(1, aym.t(this));
                ohdVar.t();
                ohdVar.n(new vlb((Disposable) kbp0Var.invoke(), (byte) 4));
                Object objR = ohdVar.r();
                if (objR != d9nVar) {
                    objR = rih1Var;
                }
                if (objR != d9nVar) {
                    objR = rih1Var;
                }
                return objR == d9nVar ? d9nVar : rih1Var;
            case 14:
                tzr0 tzr0Var = (tzr0) this.e;
                boolean z16 = this.b;
                if (z16) {
                    if (z16) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                yrg0 yrg0Var = (yrg0) tzr0Var.e;
                j4s0 j4s0Var = (j4s0) obj3;
                String str6 = j4s0Var.a;
                String str7 = j4s0Var.b;
                String strB = ((jqt) tzr0Var.d).b();
                byte[] bArr = (byte[]) obj2;
                hhc hhcVar = phc.b;
                hhc hhcVarE = phc.e(0, bArr, bArr.length);
                fl8 fl8Var = (fl8) ((nfa0) yrg0Var.b).a(str6, fl8.Companion.serializer());
                hi20 hi20VarO = FinishAuthenticationRequest.o();
                hi20VarO.t(str7);
                String str8 = fl8Var.b;
                ak8 ak8Var = fl8Var.d;
                byte[] bArrDecode = Base64.decode(str8, 11);
                hi20VarO.r(phc.e(0, bArrDecode, bArrDecode.length));
                byte[] bArrDecode2 = Base64.decode(ak8Var.a, 11);
                hi20VarO.q(phc.e(0, bArrDecode2, bArrDecode2.length));
                byte[] bArrDecode3 = Base64.decode(ak8Var.b, 11);
                hi20VarO.n(phc.e(0, bArrDecode3, bArrDecode3.length));
                byte[] bArrDecode4 = Base64.decode(ak8Var.c, 11);
                hi20VarO.v(phc.e(0, bArrDecode4, bArrDecode4.length));
                an81 an81VarN = Signals.n();
                an81VarN.n(strB);
                hi20VarO.u((Signals) an81VarN.build());
                zn70 zn70VarN = IdentityAssertionOptions.n();
                zn70VarN.getClass();
                zn70VarN.n();
                zn70VarN.q(hhcVarE);
                hi20VarO.s(zn70VarN);
                String str9 = ak8Var.d;
                if (str9 != null && str9.length() != 0) {
                    byte[] bArrDecode5 = Base64.decode(ak8Var.d, 11);
                    hi20VarO.w(phc.e(0, bArrDecode5, bArrDecode5.length));
                }
                FinishAuthenticationRequest finishAuthenticationRequestBuild = hi20VarO.build();
                v4s0 v4s0Var = (v4s0) tzr0Var.c;
                this.b = true;
                Object objD2 = v4s0Var.d(finishAuthenticationRequestBuild, this);
                return objD2 == d9nVar ? d9nVar : objD2;
            case 15:
                tzr0 tzr0Var2 = (tzr0) this.e;
                boolean z17 = this.b;
                if (!z17) {
                    hm5.M(obj);
                    yrg0 yrg0Var2 = (yrg0) tzr0Var2.e;
                    String sessionId2 = ((StartRegistrationResponse) obj2).getSessionId();
                    String strB2 = ((jqt) tzr0Var2.d).b();
                    qf11 qf11Var = (qf11) ((nfa0) yrg0Var2.b).a((String) obj3, qf11.Companion.serializer());
                    ji20 ji20VarO = FinishRegistrationRequest.o();
                    ji20VarO.s(sessionId2);
                    String str10 = qf11Var.b;
                    mf11 mf11Var = qf11Var.d;
                    byte[] bArrDecode6 = Base64.decode(str10, 11);
                    ji20VarO.r(phc.e(0, bArrDecode6, bArrDecode6.length));
                    byte[] bArrDecode7 = Base64.decode(mf11Var.a, 11);
                    ji20VarO.q(phc.e(0, bArrDecode7, bArrDecode7.length));
                    byte[] bArrDecode8 = Base64.decode(mf11Var.b, 11);
                    ji20VarO.n(phc.e(0, bArrDecode8, bArrDecode8.length));
                    an81 an81VarN2 = Signals.n();
                    an81VarN2.n(strB2);
                    ji20VarO.t((Signals) an81VarN2.build());
                    FinishRegistrationRequest finishRegistrationRequestBuild = ji20VarO.build();
                    v4s0 v4s0Var2 = (v4s0) tzr0Var2.c;
                    this.b = true;
                    objB2 = v4s0Var2.b(finishRegistrationRequestBuild, this);
                    if (objB2 == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z17) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objB2 = obj;
                }
                return new m4s0(((FinishRegistrationResponse) objB2).n());
            case 16:
                boolean z18 = this.b;
                if (!z18) {
                    hm5.M(obj);
                    this.b = true;
                    Object objE2 = ((i5s0) this.e).e((u7g1) obj3, (vu30) obj2, this);
                    return objE2 == d9nVar ? d9nVar : objE2;
                }
                if (z18) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                boolean z19 = this.b;
                if (!z19) {
                    hm5.M(obj);
                    qhv0 qhv0Var = (qhv0) ((i0v0) this.e).a((shv0) obj3, (rhv0) obj2);
                    this.b = true;
                    return qhv0Var.a(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z19) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                f6h f6hVar = (f6h) obj2;
                q6h q6hVar = f6hVar.c;
                boolean z20 = this.b;
                if (!z20) {
                    hm5.M(obj);
                    t0c t0cVarF = lcc.F((llw0) obj3);
                    ez61 ez61Var = q6hVar.c;
                    this.b = true;
                    objA = bhf.a(t0cVarF, ez61Var);
                    if (objA == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z20) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objA = obj;
                }
                xgf xgfVar = (xgf) objA;
                Uri uri = f6hVar.e;
                return new wgf(xgfVar, uri != null ? new fhf(uri) : null, new r771(q6hVar.b));
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                yt30 yt30Var = ((nt30) obj2).a;
                boolean z21 = this.b;
                if (!z21) {
                    hm5.M(obj);
                    t0c t0cVarF2 = lcc.F((llw0) obj3);
                    ez61 ez61Var2 = yt30Var.c;
                    this.b = true;
                    objA2 = bhf.a(t0cVarF2, ez61Var2);
                    if (objA2 == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z21) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objA2 = obj;
                }
                return new wgf((xgf) objA2, (fhf) null, new r771(yt30Var.b));
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                lqa lqaVar = ((aqa) obj2).c;
                boolean z22 = this.b;
                if (!z22) {
                    hm5.M(obj);
                    t0c t0cVarF3 = lcc.F((llw0) obj3);
                    ez61 ez61Var3 = lqaVar.c;
                    this.b = true;
                    objA3 = bhf.a(t0cVarF3, ez61Var3);
                    if (objA3 == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z22) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objA3 = obj;
                }
                return new wgf((xgf) objA3, (fhf) null, new r771(lqaVar.b));
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                ogb1 ogb1Var = (ogb1) obj2;
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
                tzr0 tzr0Var3 = (tzr0) this.e;
                List listL1 = o7h.l1((c380) obj3);
                zgb1 zgb1Var = ogb1Var.a;
                x8d1 x8d1Var = (x8d1) o7h.t0(zgb1Var.Y, zgb1Var.X);
                Uri uri2 = ogb1Var.c;
                this.b = true;
                Object objO = tzr0Var3.o(listL1, x8d1Var, uri2, this);
                return objO == d9nVar ? d9nVar : objO;
            case 22:
                boolean z24 = this.b;
                if (z24) {
                    if (!z24) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    day0Var = (day0) this.e;
                    hm5.M(obj);
                    objA4 = obj;
                    return new wgf((xgf) objA4, (fhf) null, new r771(day0Var.a.a.b));
                }
                hm5.M(obj);
                day0Var = (day0) obj3;
                Uri uri3 = day0Var.d;
                if (uri3 != null) {
                    Object obj4 = ((tzr0) obj2).d;
                    bnt bntVar = new bnt(uri3);
                    ez61 ez61Var4 = day0Var.a.b.c;
                    this.e = day0Var;
                    this.b = true;
                    objA4 = bhf.a(bntVar, ez61Var4);
                    if (objA4 == d9nVar) {
                        return d9nVar;
                    }
                    return new wgf((xgf) objA4, (fhf) null, new r771(day0Var.a.a.b));
                }
                return null;
            case 23:
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
                x711 x711Var = (x711) this.e;
                this.b = true;
                Object objM = rc2.M(x711Var.g.a(), new sh6(x711Var, (String) obj2, (String) obj3, (lnm) null, (byte) 5), this);
                return objM == d9nVar ? d9nVar : objM;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
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
                qr11 qr11Var = (qr11) this.e;
                if (!qr11Var.b) {
                    return rih1Var;
                }
                w2s w2sVar = (w2s) obj3;
                q8n q8nVar = (q8n) w2sVar.h;
                i3y0 i3y0Var = new i3y0((Object) w2sVar, (Object) qr11Var, obj2, (lnm) null, (byte) 12);
                this.b = true;
                return fn31.Y(q8nVar, i3y0Var, this) == d9nVar ? d9nVar : rih1Var;
            case 25:
                jvy0 jvy0Var = (jvy0) obj3;
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
                nm31 nm31Var = (nm31) ((kdy0) this.e).c;
                String str11 = jvy0Var.a;
                String str12 = jvy0Var.b;
                str12.getClass();
                Completable completableC = nm31Var.c(str11, str12, jvy0Var.c, jvy0Var.d, jvy0Var.e, "android", jvy0Var.f, (ufz) obj2);
                this.b = true;
                return fc11.i(completableC, this) == d9nVar ? d9nVar : rih1Var;
            case 26:
                l041 l041Var = (l041) this.e;
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
                vp70 vp70Var = l041.h;
                long jW = jfv.w(voe1.a(((voe1) obj3).a));
                zz31 zz31Var = new zz31(l041Var, (String) obj2, (lnm) null, (byte) 2);
                this.b = true;
                Object objP = rc2.P(jW, zz31Var, this);
                return objP == d9nVar ? d9nVar : objP;
            case 27:
                hm5.M(obj);
                SceneTemplate.WrappedTwinContent.IntroCard introCard = (SceneTemplate.WrappedTwinContent.IntroCard) obj2;
                return p7h.M(new bk41[]{new bk41("twinIntroBackgroundLayer", Collections.singletonList((qj41) this.e)), new bk41("twinIntroLayer", Collections.singletonList(new fyg1(new cyg1(introCard, (byte) 0), new cyg1(introCard, (byte) 1), this.b, new hcf1(1, (ayg1) obj3, ayg1.class, "update", "update(F)V", 0, (byte) 6))))});
            default:
                boolean z29 = this.b;
                if (!z29) {
                    hm5.M(obj);
                    axi1 axi1Var = (axi1) obj3;
                    f2g1Var = axi1Var.f;
                    utw0 utw0Var = axi1Var.e;
                    this.e = f2g1Var;
                    this.b = true;
                    pr40 pr40VarN = GetVenuePageRequest.n();
                    pr40VarN.n((String) obj2);
                    GetVenuePageRequest getVenuePageRequestBuild = pr40VarN.build();
                    tyi1 tyi1Var = (tyi1) utw0Var.a;
                    getVenuePageRequestBuild.getClass();
                    objB3 = tyi1Var.b(getVenuePageRequestBuild, this);
                    if (objB3 == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z29) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f2g1Var = (f2g1) this.e;
                    hm5.M(obj);
                    objB3 = obj;
                }
                return f2g1Var.apply(objB3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l24(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l24(Object obj, n811 n811Var, fqb fqbVar, lnm lnmVar) {
        super(1, lnmVar);
        this.a = (byte) 4;
        this.c = obj;
        this.e = n811Var;
        this.d = fqbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l24(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.e = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
