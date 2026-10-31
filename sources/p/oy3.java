package p;

import android.content.Context;
import android.os.Bundle;
import com.google.protobuf.BoolValue;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.esperanto.esperantocosmos.CosmosTransport;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.CappingRule;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ClientMessage;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ConflictResolutionStrategy;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.Pacing;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.PacingTimeUnit;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ButtonIconAlignment;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ButtonStyle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ButtonType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ClickAction;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.EncoreFont;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Format;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Icon;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Signifier;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.BottomSheetTemplate;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.prefs.esperanto.proto.EsPrefs;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import spotify.restrictions.permissions.permissions_proto.PermissionsEsperanto;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class oy3 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ boolean c;
    public /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oy3(boolean z, boolean z2, Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = z;
        this.c = z2;
        this.d = obj;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new oy3(this.c, this.d, lnmVar, (byte) 0);
            case 1:
                return new oy3(this.d, this.c, lnmVar, (byte) 1);
            case 2:
                return new oy3(this.c, this.d, lnmVar, (byte) 2);
            case 3:
                return new oy3(this.d, this.c, lnmVar, (byte) 3);
            case 4:
                oy3 oy3Var = new oy3((vu30) this.d, lnmVar, (byte) 4);
                oy3Var.c = ((Boolean) obj).booleanValue();
                return oy3Var;
            case 5:
                oy3 oy3Var2 = new oy3((tm) this.d, lnmVar, (byte) 5);
                oy3Var2.c = ((Boolean) obj).booleanValue();
                return oy3Var2;
            case 6:
                return new oy3(this.d, this.c, lnmVar, (byte) 6);
            case 7:
                return new oy3(this.d, this.c, lnmVar, (byte) 7);
            case 8:
                return new oy3(this.d, this.c, lnmVar, (byte) 8);
            case 9:
                return new oy3(this.d, this.c, lnmVar, (byte) 9);
            case 10:
                return new oy3(this.d, this.c, lnmVar, (byte) 10);
            case 11:
                oy3 oy3Var3 = new oy3((u2o0) this.d, lnmVar, (byte) 11);
                oy3Var3.c = ((Boolean) obj).booleanValue();
                return oy3Var3;
            case 12:
                oy3 oy3Var4 = new oy3((y2o0) this.d, lnmVar, (byte) 12);
                oy3Var4.c = ((Boolean) obj).booleanValue();
                return oy3Var4;
            case 13:
                return new oy3(this.c, this.d, lnmVar, (byte) 13);
            case 14:
                return new oy3(this.d, this.c, lnmVar, (byte) 14);
            case 15:
                oy3 oy3Var5 = new oy3(this.c, lnmVar);
                oy3Var5.d = obj;
                return oy3Var5;
            case 16:
                return new oy3(this.b, this.c, (q401) this.d, lnmVar, (byte) 16);
            case 17:
                oy3 oy3Var6 = new oy3((im0) this.d, lnmVar, (byte) 17);
                oy3Var6.c = ((Boolean) obj).booleanValue();
                return oy3Var6;
            case 18:
                return new oy3(this.d, this.c, lnmVar, (byte) 18);
            case 19:
                return new oy3(this.d, this.c, lnmVar, (byte) 19);
            case 20:
                return new oy3(this.c, this.d, lnmVar, (byte) 20);
            case 21:
                return new oy3(this.b, this.c, (lz20) this.d, lnmVar, (byte) 21);
            case 22:
                return new oy3(this.c, this.d, lnmVar, (byte) 22);
            default:
                return new oy3(this.b, this.c, (dpo) this.d, lnmVar, (byte) 23);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return ((oy3) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 1:
                return ((oy3) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 2:
                return ((oy3) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 3:
                return ((oy3) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 4:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((oy3) create(bool, (lnm) obj2)).invokeSuspend(rih1Var);
            case 5:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((oy3) create(bool2, (lnm) obj2)).invokeSuspend(rih1Var);
            case 6:
                return ((oy3) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 7:
                return ((oy3) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 8:
                return ((oy3) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 9:
                return ((oy3) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 10:
                return ((oy3) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 11:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return ((oy3) create(bool3, (lnm) obj2)).invokeSuspend(rih1Var);
            case 12:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                return ((oy3) create(bool4, (lnm) obj2)).invokeSuspend(rih1Var);
            case 13:
                return ((oy3) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 14:
                return ((oy3) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 15:
                return ((oy3) create((vr20) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 16:
                ((oy3) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            case 17:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                return ((oy3) create(bool5, (lnm) obj2)).invokeSuspend(rih1Var);
            case 18:
                return ((oy3) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 19:
                return ((oy3) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 20:
                return ((oy3) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 21:
                ((oy3) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            case 22:
                return ((oy3) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            default:
                ((oy3) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:155:0x0303  */
    /* JADX WARN: Code duplicated, block: B:318:? A[RETURN, SYNTHETIC] */
    public final Object invokeSuspend(Object obj) {
        Object objC;
        Object objK;
        f94 f94Var;
        b1c1 b1c1Var;
        byte b = this.a;
        d9n d9nVar = rih1.a;
        d9n d9nVar2 = d9n.a;
        af5 af5VarA = null;
        switch (b) {
            case 0:
                drr0 drr0Var = (drr0) this.d;
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    if (!this.c) {
                        drr0Var.t(1.0f);
                        return d9nVar;
                    }
                    drr0Var.t(1.0f);
                    this.b = true;
                    if (hap1.i(300L, this) == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                drr0Var.t(0.3f);
                return d9nVar;
            case 1:
                rm9 rm9Var = (rm9) this.d;
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                yu3 yu3Var = rm9Var.h;
                kge kgeVarD = hu20.d(new mr20[]{hu20.e(new m441(new k96(yu3Var, (lnm) null, (byte) 25)), new eq9(this.c, yu3Var, (lnm) null)), new ik(new nf(yoi1.g(((zeu0) yu3Var.c).a()), (byte) 23), (byte) 16)});
                jm9 jm9Var = new jm9(rm9Var, (byte) 4);
                this.b = true;
                return kgeVarD.collect(jm9Var, this) == d9nVar2 ? d9nVar2 : d9nVar;
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
                zns0 zns0VarN = PermissionsEsperanto.SetBYOMRestrictionRequest.n();
                zns0VarN.n(this.c);
                PermissionsEsperanto.SetBYOMRestrictionRequest setBYOMRestrictionRequestBuild = zns0VarN.build();
                jn7 jn7Var = ((kr9) this.d).a;
                setBYOMRestrictionRequestBuild.getClass();
                this.b = true;
                Object objN0 = jn7Var.n0(setBYOMRestrictionRequestBuild, this);
                return objN0 == d9nVar2 ? d9nVar2 : objN0;
            case 3:
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                bqz bqzVar = new bqz(new pov0(new CosmosTransport(new sn0((RxRouter) ((xid) this.d).b, (byte) 6))));
                boolean z5 = this.c;
                iqz iqzVarR = EsPrefs.Value.r();
                iqzVarR.n(z5);
                EsPrefs.Value valueBuild = iqzVarR.build();
                valueBuild.getClass();
                Completable completableD = bqzVar.d("audio.car_mode", valueBuild);
                this.b = true;
                return fc11.i(completableD, this) == d9nVar2 ? d9nVar2 : d9nVar;
            case 4:
                boolean z6 = this.c;
                boolean z7 = this.b;
                if (z7) {
                    if (z7) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                vu30 vu30Var = (vu30) this.d;
                BoolValue boolValueP = BoolValue.p(z6);
                this.c = z6;
                this.b = true;
                return vu30Var.invoke(boolValueP, this) == d9nVar2 ? d9nVar2 : d9nVar;
            case 5:
                boolean z8 = this.c;
                boolean z9 = this.b;
                if (z9) {
                    if (z9) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (!z8) {
                    return d9nVar;
                }
                yjq yjqVar = (yjq) ((tm) this.d).c;
                this.c = z8;
                this.b = true;
                return yjqVar.J(this) == d9nVar2 ? d9nVar2 : d9nVar;
            case 6:
                boolean z10 = this.b;
                if (z10) {
                    if (z10) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                wz40 wz40Var = (wz40) this.d;
                ljg ljgVar = wz40Var.a;
                boolean z11 = this.c;
                String string = UUID.randomUUID().toString();
                Context context = wz40Var.g;
                Single singleC = ljg.c(ljgVar, "spotify:google-assistant-account-linking:v1", (TriggerType) null, (String) null, Collections.singletonList(new ClientMessage("google-assistant-account-linking-nudge", string, new Format.BottomSheet(new BottomSheetTemplate.RichBottomSheet((Signifier) null, "https://partner-account-linking-cdn.spotifycdn.com/google-assistant-link-128.png", context.getString(2131956331), context.getString(2131956327), new Button("link_account", new ButtonStyle(context.getString(2131956329), (String) null, (String) null, (Icon) null, ButtonType.PRIMARY, (EncoreFont) null, (ButtonIconAlignment) null, 96, (DefaultConstructorMarker) null), new ClickAction("DISMISS", (String) null, (Map) null, 4, (DefaultConstructorMarker) null)), new Button("not_now", new ButtonStyle(context.getString(2131959302), (String) null, (String) null, (Icon) null, ButtonType.TERTIARY, (EncoreFont) null, (ButtonIconAlignment) null, 96, (DefaultConstructorMarker) null), new ClickAction("DISMISS", (String) null, (Map) null, 4, (DefaultConstructorMarker) null)))), z11 ? w7x.a : Collections.singleton(new CappingRule.Impression(3)), z11 ? new Pacing(0, PacingTimeUnit.HOURS) : new Pacing(8, PacingTimeUnit.DAYS))), (tv80) null, (uy31) null, (DynamicTagsMetadata) null, ConflictResolutionStrategy.DISCARD_SELF, (d3j0) null, 374);
                this.b = true;
                Object objJ = fc11.j(singleC, this);
                return objJ == d9nVar2 ? d9nVar2 : objJ;
            case 7:
                boolean z12 = this.b;
                if (z12) {
                    if (z12) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                hj31 hj31Var = (hj31) ((uoq) ((fub0) this.d).a.get()).b.get();
                boolean z13 = this.c;
                this.b = true;
                Object objA = hj31Var.a(z13, this);
                return objA == d9nVar2 ? d9nVar2 : objA;
            case 8:
                mfc0 mfc0Var = (mfc0) this.d;
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
                rsc0 rsc0Var = mfc0Var.a;
                boolean z15 = this.c;
                iqz0 iqz0Var = new iqz0(0, 100);
                xj61 xj61Var = new xj61();
                xj61Var.add(sqc0.a);
                xj61Var.add(xqc0.a);
                if (!z15) {
                    xj61Var.add(yqc0.a);
                }
                xj61 xj61VarJ = cwl1.j(xj61Var);
                hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
                iou0 iou0VarV = PlaylistItemDecorationPolicy.v();
                iou0VarV.D(true);
                hru0VarS.v(iou0VarV);
                trc0 trc0Var = new trc0(hru0VarS.build(), (g3d0) null, xj61VarJ, false, (src0) null, iqz0Var, (prc0) null, 0, (List) null, 474);
                this.b = true;
                Object objF = rsc0Var.f("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ", trc0Var, this);
                return objF == d9nVar2 ? d9nVar2 : objF;
            case 9:
                boolean z16 = this.b;
                if (z16) {
                    if (z16) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ipe0 ipe0Var = (ipe0) this.d;
                kpe0 kpe0Var = ipe0Var.a;
                xt7 xt7Var = new xt7(this.c, ipe0Var, (byte) 5);
                this.b = true;
                return kpe0Var.a(xt7Var, this) == d9nVar2 ? d9nVar2 : d9nVar;
            case 10:
                exj0 exj0Var = (exj0) this.d;
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
                j5b0 j5b0Var = new j5b0(exj0Var.c.d(), (byte) 4);
                d7i0 d7i0Var = new d7i0(exj0Var, this.c, (lnm) null);
                this.b = true;
                Object objJ2 = b5p1.j(j5b0Var, d7i0Var, this);
                return objJ2 == d9nVar2 ? d9nVar2 : objJ2;
            case 11:
                boolean z18 = this.c;
                boolean z19 = this.b;
                if (z19) {
                    if (z19) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                u2o0 u2o0Var = (u2o0) this.d;
                this.c = z18;
                this.b = true;
                if (z18) {
                    objC = u2o0Var.c(this);
                    if (objC != d9nVar2) {
                    }
                    if (objC == d9nVar2) {
                        return d9nVar2;
                    }
                    return d9nVar;
                }
                String str = u2o0Var.g;
                if (str != null) {
                    u2o0Var.c.a(str);
                    u2o0Var.g = null;
                }
                objC = d9nVar;
                if (objC == d9nVar2) {
                    return d9nVar2;
                }
                return d9nVar;
            case 12:
                boolean z20 = this.c;
                boolean z21 = this.b;
                if (z21) {
                    if (z21) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                y2o0 y2o0Var = (y2o0) this.d;
                this.c = z20;
                this.b = true;
                return y2o0Var.c(z20, this) == d9nVar2 ? d9nVar2 : d9nVar;
            case 13:
                boolean z22 = this.b;
                if (z22) {
                    if (z22) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (!this.c) {
                    return d9nVar;
                }
                xtb0 xtb0Var = (xtb0) this.d;
                this.b = true;
                df41 df41Var = xtb0.y;
                return xtb0Var.k(0, 0, this) == d9nVar2 ? d9nVar2 : d9nVar;
            case 14:
                boolean z23 = this.b;
                if (!z23) {
                    hm5.M(obj);
                    sq61 sq61Var = ((gbr0) this.d).e;
                    jge jgeVarE = hu20.e(sq61Var.a().e(this.c), new af01((lnm) null, sq61Var, (byte) 14));
                    this.b = true;
                    objK = b5p1.k(jgeVarE, this);
                    if (objK == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (!z23) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objK = obj;
                }
                return Boolean.valueOf(u890.j(objK, Boolean.TRUE));
            case 15:
                vr20 vr20Var = (vr20) this.d;
                boolean z24 = this.b;
                if (z24) {
                    if (z24) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (!this.c) {
                    return d9nVar;
                }
                z6x z6xVar = z6x.a;
                fn0 fn0Var = new fn0(z6xVar, z6xVar, 0, 0, 0, 1, 3);
                this.d = null;
                this.b = true;
                return vr20Var.emit(fn0Var, this) == d9nVar2 ? d9nVar2 : d9nVar;
            case 16:
                hm5.M(obj);
                if (this.b && this.c) {
                    ((q401) this.d).a.a(ixb.b);
                }
                return d9nVar;
            case 17:
                boolean z25 = this.c;
                boolean z26 = this.b;
                if (z26) {
                    if (z26) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (!z25) {
                    return d9nVar;
                }
                poj0 poj0Var = (poj0) ((im0) this.d).g;
                this.c = z25;
                this.b = true;
                hq41 hq41Var = (hq41) poj0Var.b;
                Flowable flowable = (Flowable) poj0Var.d;
                vbm[] vbmVarArr = q601.a;
                sii0 sii0Var = new sii0(new sii0(z4p1.F(new kge(flowable), 1), poj0Var, (byte) 15), poj0Var, (byte) 16);
                ytw0 ytw0Var = jfv.b;
                Object objH = c921.H(hq41Var.d, new n641(hq41Var, new lt20(r4p1.w(sii0Var, fdg1.l0(300L, ngv.d)), new ob00(3, (lnm) null, (byte) 17), (byte) 0), Bundle.EMPTY, (lnm) null, (byte) 6), this);
                if (objH != d9nVar2) {
                    objH = d9nVar;
                }
                if (objH != d9nVar2) {
                    objH = d9nVar;
                }
                return objH == d9nVar2 ? d9nVar2 : d9nVar;
            case 18:
                boolean z27 = this.b;
                if (z27) {
                    if (z27) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                r961 r961Var = (r961) ((nl51) this.d).b;
                boolean z28 = this.c;
                this.b = true;
                v3u0 v3u0Var = ((p4u0) r961Var.d).b;
                j4u0 j4u0VarQ = PlaybackSettingsEsperantoService.SetSettingsRequest.q();
                d4u0 d4u0VarN = PlaybackSettingsEsperantoService.FieldUpdate.n();
                d4u0VarN.n(c4u0.h);
                e4u0 e4u0VarN = PlaybackSettingsEsperantoService.FieldValue.n();
                e4u0VarN.n(!z28);
                d4u0VarN.q(e4u0VarN.build());
                j4u0VarQ.r(d4u0VarN.build());
                Object objJ3 = fc11.j(v3u0Var.callSingle("spotify.playback_settings.esperanto.proto.PlaybackSettings", "SetSettings", j4u0VarQ.build()).map(ak20.V0), this);
                if (objJ3 != d9nVar2) {
                    objJ3 = d9nVar;
                }
                if (objJ3 != d9nVar2) {
                    objJ3 = d9nVar;
                }
                return objJ3 == d9nVar2 ? d9nVar2 : d9nVar;
            case 19:
                x6e1 x6e1Var = (x6e1) this.d;
                boolean z29 = this.b;
                if (z29) {
                    if (z29) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                boolean z30 = this.c;
                if (!nbe1.d(x6e1Var.l().b)) {
                    af5VarA = jch0.A(x6e1Var.l());
                    if (z30) {
                        int iF = nbe1.f(x6e1Var.l().b);
                        x6e1Var.c.invoke(x6e1.b(x6e1Var.l().a, e6p1.e(iF, iF)));
                        x6e1Var.r(zr50.a);
                    }
                }
                if (af5VarA == null || (f94Var = x6e1Var.g) == null) {
                    return d9nVar;
                }
                kmg kmgVarA = s1p1.A(af5VarA);
                this.b = true;
                f94Var.b(kmgVarA);
                return d9nVar == d9nVar2 ? d9nVar2 : d9nVar;
            case 20:
                boolean z31 = this.b;
                if (!z31) {
                    hm5.M(obj);
                    if (!this.c) {
                        return d9nVar;
                    }
                } else {
                    if (!z31) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                do {
                    b1c1Var = new b1c1((iu30) this.d, (byte) 17);
                    this.b = true;
                } while (s110.h(getContext()).D(b1c1Var, this) != d9nVar2);
                return d9nVar2;
            case 21:
                hm5.M(obj);
                if (this.b && this.c) {
                    try {
                        lz20.b((lz20) this.d);
                        break;
                    } catch (IllegalStateException unused) {
                    }
                }
                return d9nVar;
            case 22:
                boolean z32 = this.b;
                if (z32) {
                    if (z32) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (!this.c) {
                    return d9nVar;
                }
                vjr0 vjr0Var = (vjr0) this.d;
                this.b = true;
                vjr0Var.getClass();
                Object objS = smo1.s(new e3p0(vjr0Var, (lnm) null, (byte) 23), this);
                if (objS != d9nVar2) {
                    objS = d9nVar;
                }
                return objS == d9nVar2 ? d9nVar2 : d9nVar;
            default:
                hm5.M(obj);
                if (!this.b || !this.c) {
                    ((dpo) this.d).a();
                }
                return d9nVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oy3(Object obj, boolean z, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.c = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oy3(boolean z, Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = z;
        this.d = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oy3(boolean z, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 15;
        this.c = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oy3(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
    }
}
