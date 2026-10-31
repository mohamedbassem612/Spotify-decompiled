package p;

import com.google.protobuf.Empty;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.base.java.logging.Logger;
import com.spotify.connect.esperanto.proto.ConnectMessages;
import com.spotify.decipher.agent.v1.ActionRequest;
import com.spotify.decipher.agent.v1.ClientSideEventRequest;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableOnErrorComplete;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class clo extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ clo(Object obj, Object obj2, lnm lnmVar, byte b) {
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
                clo cloVar = new clo((dlo) obj2, lnmVar, (byte) 0);
                cloVar.c = obj;
                return cloVar;
            case 1:
                return new clo((asn) this.c, (String) obj2, lnmVar, (byte) 1);
            case 2:
                clo cloVar2 = new clo((gal) obj2, lnmVar, (byte) 2);
                cloVar2.c = obj;
                return cloVar2;
            case 3:
                return new clo((dpo) this.c, (cpo) obj2, lnmVar, (byte) 3);
            case 4:
                return new clo((ven0) this.c, (o95) obj2, lnmVar, (byte) 4);
            case 5:
                clo cloVar3 = new clo((jnd0) obj2, lnmVar, (byte) 5);
                cloVar3.c = obj;
                return cloVar3;
            case 6:
                return new clo((List) this.c, (w0r) obj2, lnmVar, (byte) 6);
            case 7:
                return new clo((iu30) this.c, (y7r) obj2, lnmVar, (byte) 7);
            case 8:
                return new clo((g9r) this.c, (i9r) obj2, lnmVar, (byte) 8);
            case 9:
                return new clo((wj3) this.c, (String) obj2, lnmVar, (byte) 9);
            case 10:
                clo cloVar4 = new clo((sfr) obj2, lnmVar, (byte) 10);
                cloVar4.c = obj;
                return cloVar4;
            case 11:
                return new clo((yfr) this.c, (String) obj2, lnmVar, (byte) 11);
            case 12:
                return new clo((mhr) this.c, (String) obj2, lnmVar, (byte) 12);
            case 13:
                clo cloVar5 = new clo((clr) obj2, lnmVar, (byte) 13);
                cloVar5.c = obj;
                return cloVar5;
            case 14:
                return new clo((pnr) this.c, (s1l) obj2, lnmVar, (byte) 14);
            case 15:
                return new clo((zor) this.c, (String) obj2, lnmVar, (byte) 15);
            case 16:
                return new clo((gh91) this.c, (wpr) obj2, lnmVar, (byte) 16);
            case 17:
                return new clo((ln41) this.c, (mtr) obj2, lnmVar, (byte) 17);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new clo((mtr) this.c, (ActionRequest) obj2, lnmVar, (byte) 18);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new clo((mtr) this.c, (ClientSideEventRequest) obj2, lnmVar, (byte) 19);
            case 20:
                clo cloVar6 = new clo((k9r) obj2, lnmVar, (byte) 20);
                cloVar6.c = obj;
                return cloVar6;
            case 21:
                return new clo((vvr) this.c, (zlo) obj2, lnmVar, (byte) 21);
            case 22:
                return new clo((xvr) this.c, (swn) obj2, lnmVar, (byte) 22);
            case 23:
                clo cloVar7 = new clo((rk20) obj2, lnmVar, (byte) 23);
                cloVar7.c = obj;
                return cloVar7;
            case 24:
                return new clo((wzr) this.c, (upb0) obj2, lnmVar, (byte) 24);
            case 25:
                return new clo((nl9) this.c, (String) obj2, lnmVar, (byte) 25);
            case 26:
                return new clo((x1s) this.c, (wi70) obj2, lnmVar, (byte) 26);
            case 27:
                return new clo((o3s) this.c, (String) obj2, lnmVar, (byte) 27);
            case 28:
                clo cloVar8 = new clo((gz51) obj2, lnmVar, (byte) 28);
                cloVar8.c = obj;
                return cloVar8;
            default:
                return new clo((vu30) this.c, (k9r) obj2, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((mmr0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((String) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((k1r) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 17:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 20:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 24:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9n.a;
            case 25:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((d0r) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        Object objG;
        jge jgeVarE;
        String str;
        n4l n4lVar;
        o4l o4lVar;
        Object objC;
        sk20 sk20Var;
        byte b = 0;
        lnm lnmVar = null;
        switch (this.a) {
            case 0:
                mmr0 mmr0Var = (mmr0) this.c;
                d9n d9nVar = d9n.a;
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    String str2 = (String) mmr0Var.a;
                    i10 i10Var = (i10) mmr0Var.b;
                    dlo dloVar = (dlo) this.d;
                    q8n q8nVar = dloVar.b;
                    hxn hxnVar = new hxn(i10Var, dloVar, str2, (lnm) null, (byte) 3);
                    this.c = null;
                    this.b = true;
                    if (fn31.Y(q8nVar, hxnVar, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 1:
                d9n d9nVar2 = d9n.a;
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
                asn asnVar = (asn) this.c;
                ay8 ay8VarF = d3p1.F((d0r) asnVar.a, (o3r) asnVar.c, (String) this.d);
                jte jteVar = new jte(2, (lnm) null, (byte) 12);
                this.b = true;
                Object objJ = b5p1.j(ay8VarF, jteVar, this);
                return objJ == d9nVar2 ? d9nVar2 : objJ;
            case 2:
                String str3 = (String) this.c;
                d9n d9nVar3 = d9n.a;
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    if (str3 != null) {
                        return str3;
                    }
                    mdd0 mdd0Var = (vcd0) ((gal) this.d).c;
                    this.c = null;
                    this.b = true;
                    objG = mdd0Var.g(this);
                    if (objG == d9nVar3) {
                        return d9nVar3;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objG = obj;
                }
                tcd0 tcd0Var = (tcd0) objG;
                if (tcd0Var != null) {
                    return tcd0Var.a;
                }
                return null;
            case 3:
                dpo dpoVar = (dpo) this.c;
                d9n d9nVar4 = d9n.a;
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    dpoVar.getClass();
                    this.b = true;
                    if (hap1.i(2000L, this) == d9nVar4) {
                        return d9nVar4;
                    }
                } else {
                    if (!z4) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                if (u890.j(dpoVar.c(), (cpo) this.d)) {
                    dpoVar.b.setValue((Object) null);
                }
                return rih1.a;
            case 4:
                d9n d9nVar5 = d9n.a;
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    float fIntValue = ((Number) ((ven0) this.c).getValue()).intValue();
                    o95 o95Var = (o95) this.d;
                    Float f = new Float(fIntValue);
                    pxg1 pxg1VarO0 = irn1.o0(200, 0, (dlv) null, 6);
                    this.b = true;
                    if (o95.b(o95Var, f, pxg1VarO0, (Float) null, (iu30) null, this, 12) == d9nVar5) {
                        return d9nVar5;
                    }
                } else {
                    if (!z5) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 5:
                k1r k1rVar = (k1r) this.c;
                d9n d9nVar6 = d9n.a;
                boolean z6 = this.b;
                if (!z6) {
                    hm5.M(obj);
                    jnd0 jnd0Var = (jnd0) this.d;
                    this.c = null;
                    this.b = true;
                    if (jnd0Var.a(k1rVar, this) == d9nVar6) {
                        return d9nVar6;
                    }
                } else {
                    if (!z6) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 6:
                d9n d9nVar7 = d9n.a;
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
                u0r u0rVar = new u0r((List) this.c, (w0r) this.d, lnmVar, b);
                this.b = true;
                Object objS = smo1.s(u0rVar, this);
                return objS == d9nVar7 ? d9nVar7 : objS;
            case 7:
                d9n d9nVar8 = d9n.a;
                boolean z8 = this.b;
                try {
                    if (!z8) {
                        hm5.M(obj);
                        iu30 iu30Var = (iu30) this.c;
                        this.b = true;
                        if (iu30Var.invoke(this) == d9nVar8) {
                            return d9nVar8;
                        }
                    } else {
                        if (!z8) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    y7r y7rVar = (y7r) this.d;
                    synchronized (y7rVar.a) {
                        y7rVar.b = null;
                    }
                    return rih1.a;
                } catch (Throwable th) {
                    y7r y7rVar2 = (y7r) this.d;
                    synchronized (y7rVar2.a) {
                        y7rVar2.b = null;
                        throw th;
                    }
                }
            case 8:
                d9n d9nVar9 = d9n.a;
                boolean z9 = this.b;
                if (!z9) {
                    hm5.M(obj);
                    g9r g9rVar = (g9r) this.c;
                    i9r i9rVar = (i9r) this.d;
                    this.b = true;
                    if (g9rVar.h(i9rVar, this) == d9nVar9) {
                        return d9nVar9;
                    }
                } else {
                    if (!z9) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 9:
                d9n d9nVar10 = d9n.a;
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
                rsc0 rsc0Var = (xrc0) ((wj3) this.c).c;
                String str4 = (String) this.d;
                jqz0 jqz0Var = jqz0.a;
                hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
                sku0 sku0VarP = PlaylistDecorationPolicy.p();
                sku0VarP.k0();
                hru0VarS.w(sku0VarP.build());
                trc0 trc0Var = new trc0(hru0VarS.build(), (g3d0) null, (Set) null, false, (src0) null, jqz0Var, (prc0) null, 0, (List) null, 478);
                this.b = true;
                Object objF = rsc0Var.f(str4, trc0Var, this);
                return objF == d9nVar10 ? d9nVar10 : objF;
            case 10:
                vr20 vr20Var = (vr20) this.c;
                d9n d9nVar11 = d9n.a;
                boolean z11 = this.b;
                if (!z11) {
                    hm5.M(obj);
                    zfr zfrVar = ((sfr) this.d).a;
                    if (((jo20) zfrVar.b).isEnabled()) {
                        g23 g23Var = (g23) zfrVar.c;
                        jgeVarE = hu20.e((xe01) ((kr60) g23Var.d).b, new qt((lnm) null, g23Var, (byte) 11));
                    } else {
                        jgeVarE = r6x.a;
                    }
                    this.c = null;
                    this.b = true;
                    if (l4p1.s(vr20Var, jgeVarE, this) == d9nVar11) {
                        return d9nVar11;
                    }
                } else {
                    if (!z11) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 11:
                d9n d9nVar12 = d9n.a;
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
                tfr tfrVar = ((yfr) this.c).c;
                int i = Integer.parseInt((String) this.d);
                this.b = true;
                zfr zfrVar2 = tfrVar.a;
                Object objF2 = ((jo20) zfrVar2.b).isEnabled() ? ((g23) zfrVar2.c).f(i, this) : new oz5(fz5.X, "Feature is disabled", 4);
                return objF2 == d9nVar12 ? d9nVar12 : objF2;
            case 12:
                String str5 = (String) this.d;
                mhr mhrVar = (mhr) this.c;
                d9n d9nVar13 = d9n.a;
                boolean z13 = this.b;
                if (!z13) {
                    hm5.M(obj);
                    ccc0 ccc0Var = mhrVar.a;
                    this.b = true;
                    if (ccc0.b(ccc0Var, str5, false, (ubc0) null, this, 6) == d9nVar13) {
                        return d9nVar13;
                    }
                } else {
                    if (!z13) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                mmr0 mmr0Var2 = mhrVar.n;
                if (mmr0Var2 != null && (str = (String) mmr0Var2.a) != null) {
                    i8h1 i8h1Var = mhrVar.i.a;
                    y6h1 y6h1Var = y6h1.i;
                    x6h1 x6h1VarI = i3o1.i();
                    x6h1VarI.h = "music";
                    x6h1VarI.a = "mobile-your-library-audiobook-progress-nudge";
                    x6h1VarI.f = "2.0.0";
                    x6h1VarI.g = "22.0.0";
                    x6h1VarI.d = str;
                    x6h1 x6h1VarR = kk0.r(x6h1VarI, "any");
                    x6h1VarR.i.add(new a7h1("action_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarR.j = false;
                    i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("like", 1, Collections.singletonMap("item_to_be_liked", str)), x6h1VarR.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                }
                vku vkuVar = mhrVar.l;
                qhr qhrVar = mhrVar.h;
                vkuVar.a(qhrVar.a.map(new acn1(qhrVar, str5)).ignoreElement().subscribe());
                mmr0 mmr0Var3 = mhrVar.n;
                if (mmr0Var3 != null) {
                    mhrVar.g.b((String) mmr0Var3.b, DismissReason.ProgrammaticDismissal.INSTANCE);
                }
                mhrVar.n = null;
                return rih1.a;
            case 13:
                clr clrVar = (clr) this.d;
                p7s p7sVar = clrVar.b;
                ssw0 ssw0Var = (ssw0) this.c;
                d9n d9nVar14 = d9n.a;
                boolean z14 = this.b;
                if (!z14) {
                    hm5.M(obj);
                    w2z w2zVar = new w2z(ssw0Var);
                    c921.y(p7sVar.c, (o8n) null, 0, new gke(p7sVar, clrVar.c, w2zVar, null, (byte) 25), 3);
                    ssw0Var.l(new xyc(clrVar.e.b(), p7sVar.d()));
                    sqm sqmVar = new sqm((Object) clrVar, (Object) w2zVar, (byte) 25);
                    this.c = null;
                    this.b = true;
                    if (jch0.s(ssw0Var, sqmVar, this) == d9nVar14) {
                        return d9nVar14;
                    }
                } else {
                    if (!z14) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 14:
                rih1 rih1Var = rih1.a;
                d9n d9nVar15 = d9n.a;
                boolean z15 = this.b;
                if (!z15) {
                    hm5.M(obj);
                    c3l c3lVar = (y2l) ((pnr) this.c).b.get();
                    s1l s1lVar = (s1l) this.d;
                    this.b = true;
                    c3l c3lVar2 = c3lVar;
                    c3lVar2.getClass();
                    m4l m4lVarN = ConnectMessages.NotifyAudioRouteChangedRequest.n();
                    String str6 = s1lVar.a;
                    if (str6 != null) {
                        m4lVarN.t(str6);
                    }
                    int i2 = s1lVar.d;
                    if (i2 != 0) {
                        int iC = l1d.C(i2);
                        if (iC == 0) {
                            o4lVar = o4l.b;
                        } else if (iC == 1) {
                            o4lVar = o4l.c;
                        } else if (iC == 2) {
                            o4lVar = o4l.d;
                        } else if (iC == 3) {
                            o4lVar = o4l.e;
                        } else if (iC == 4) {
                            o4lVar = o4l.f;
                        } else {
                            if (iC != 5) {
                                eg.o();
                                return null;
                            }
                            o4lVar = o4l.g;
                        }
                        m4lVarN.r(o4lVar);
                    }
                    String str7 = s1lVar.b;
                    if (str7 != null) {
                        m4lVarN.n(str7);
                    }
                    String str8 = s1lVar.c;
                    if (str8 != null) {
                        m4lVarN.s(str8);
                    }
                    int i3 = s1lVar.e;
                    if (i3 != 0) {
                        switch (l1d.C(i3)) {
                            case 0:
                                n4lVar = n4l.b;
                                break;
                            case 1:
                                n4lVar = n4l.c;
                                break;
                            case 2:
                                n4lVar = n4l.d;
                                break;
                            case 3:
                                n4lVar = n4l.e;
                                break;
                            case 4:
                                n4lVar = n4l.f;
                                break;
                            case 5:
                                n4lVar = n4l.g;
                                break;
                            case 6:
                                n4lVar = n4l.h;
                                break;
                            default:
                                eg.o();
                                return null;
                        }
                        m4lVarN.q(n4lVar);
                    }
                    Object objY = fn31.Y(c3lVar2.b, new cuk(c3lVar2, m4lVarN.build(), (lnm) null, (byte) 3), this);
                    if (objY != d9nVar15) {
                        objY = rih1Var;
                    }
                    if (objY == d9nVar15) {
                        return d9nVar15;
                    }
                } else {
                    if (!z15) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            case 15:
                d9n d9nVar16 = d9n.a;
                boolean z16 = this.b;
                if (!z16) {
                    hm5.M(obj);
                    zor zorVar = (zor) this.c;
                    xor xorVar = new xor(zorVar, (String) this.d, null, (byte) 0);
                    this.b = true;
                    objC = zorVar.c(xorVar, this);
                    if (objC == d9nVar16) {
                        return d9nVar16;
                    }
                } else {
                    if (!z16) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objC = obj;
                }
                return rih1.a;
            case 16:
                d9n d9nVar17 = d9n.a;
                boolean z17 = this.b;
                if (!z17) {
                    hm5.M(obj);
                    gh91 gh91Var = (gh91) this.c;
                    mr20 mr20Var = gh91Var.e;
                    t0l t0lVar = new t0l((wpr) this.d, gh91Var, (byte) 24);
                    this.b = true;
                    if (mr20Var.collect(t0lVar, this) == d9nVar17) {
                        return d9nVar17;
                    }
                } else {
                    if (!z17) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 17:
                d9n d9nVar18 = d9n.a;
                boolean z18 = this.b;
                if (!z18) {
                    hm5.M(obj);
                    m441 m441Var = ((kb61) ((ln41) this.c).a).v().a.i;
                    vi viVar = new vi((mtr) this.d, (byte) 3);
                    this.b = true;
                    if (m441Var.collect(viVar, this) == d9nVar18) {
                        return d9nVar18;
                    }
                } else {
                    if (!z18) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                d9n d9nVar19 = d9n.a;
                boolean z19 = this.b;
                try {
                    if (!z19) {
                        hm5.M(obj);
                        jn7 jn7Var = ((mtr) this.c).e;
                        ActionRequest actionRequest = (ActionRequest) this.d;
                        actionRequest.getClass();
                        this.b = true;
                        if (jn7Var.l0(actionRequest, this) == d9nVar19) {
                            return d9nVar19;
                        }
                    } else {
                        if (!z19) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    break;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception unused) {
                    Logger.d("Decipher: failed to send navigate action", new Object[0]);
                }
                return rih1.a;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                d9n d9nVar20 = d9n.a;
                boolean z20 = this.b;
                try {
                    if (!z20) {
                        hm5.M(obj);
                        jn7 jn7Var2 = ((mtr) this.c).e;
                        ClientSideEventRequest clientSideEventRequest = (ClientSideEventRequest) this.d;
                        clientSideEventRequest.getClass();
                        this.b = true;
                        if (jn7Var2.m0(clientSideEventRequest, this) == d9nVar20) {
                            return d9nVar20;
                        }
                    } else {
                        if (!z20) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    break;
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Exception unused2) {
                    Logger.d("Decipher: failed to send playable item tapped event", new Object[0]);
                }
                return rih1.a;
            case 20:
                rih1 rih1Var2 = rih1.a;
                vr20 vr20Var2 = (vr20) this.c;
                d9n d9nVar21 = d9n.a;
                boolean z21 = this.b;
                if (!z21) {
                    hm5.M(obj);
                    k9r k9rVar = (k9r) this.d;
                    zeu zeuVar = new zeu((dn3) k9rVar.c);
                    mr20 mr20VarCallStream = ((oqp0) k9rVar.b).callStream("spotify.offline_esperanto.proto.Offline", "SubscribeTotalProgress", Empty.n());
                    t0l t0lVar2 = new t0l(vr20Var2, zeuVar, (byte) 29);
                    this.c = null;
                    this.b = true;
                    Object objCollect = mr20VarCallStream.collect(new j4p0(t0lVar2, (byte) 29), this);
                    if (objCollect != d9nVar21) {
                        objCollect = rih1Var2;
                    }
                    if (objCollect == d9nVar21) {
                        return d9nVar21;
                    }
                } else {
                    if (!z21) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var2;
            case 21:
                d9n d9nVar22 = d9n.a;
                boolean z22 = this.b;
                if (!z22) {
                    hm5.M(obj);
                    vvr vvrVar = (vvr) this.c;
                    pfn0 pfn0Var = vvrVar.c;
                    uvr uvrVar = vvrVar.b;
                    hfn0 hfn0Var = hfn0.b;
                    zlo zloVar = (zlo) this.d;
                    this.b = true;
                    pfn0Var.getClass();
                    if (smo1.s(new ofn0(hfn0Var, pfn0Var, zloVar, uvrVar, (lnm) null), this) == d9nVar22) {
                        return d9nVar22;
                    }
                } else {
                    if (!z22) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 22:
                d9n d9nVar23 = d9n.a;
                boolean z23 = this.b;
                if (!z23) {
                    hm5.M(obj);
                    xvr xvrVar = (xvr) this.c;
                    pfn0 pfn0Var2 = xvrVar.c;
                    p24 p24Var = xvrVar.b;
                    hfn0 hfn0Var2 = hfn0.b;
                    swn swnVar = (swn) this.d;
                    this.b = true;
                    pfn0Var2.getClass();
                    if (smo1.s(new ofn0(hfn0Var2, pfn0Var2, swnVar, p24Var, (lnm) null), this) == d9nVar23) {
                        return d9nVar23;
                    }
                } else {
                    if (!z23) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 23:
                vr20 vr20Var3 = (vr20) this.c;
                d9n d9nVar24 = d9n.a;
                boolean z24 = this.b;
                if (!z24) {
                    hm5.M(obj);
                    Set set = s4b1.f;
                    int iOrdinal = uic.x(((rk20) this.d).a).c.ordinal();
                    if (iOrdinal == 844) {
                        sk20Var = sk20.b;
                    } else if (iOrdinal != 860) {
                        sk20Var = iOrdinal != 926 ? sk20.d : sk20.c;
                    } else {
                        sk20Var = sk20.a;
                    }
                    this.c = null;
                    this.b = true;
                    if (vr20Var3.emit(sk20Var, this) == d9nVar24) {
                        return d9nVar24;
                    }
                } else {
                    if (!z24) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 24:
                d9n d9nVar25 = d9n.a;
                boolean z25 = this.b;
                if (!z25) {
                    hm5.M(obj);
                    wzr wzrVar = (wzr) this.c;
                    bpb1 bpb1Var = wzrVar.X;
                    hxn hxnVar2 = new hxn((upb0) this.d, wzrVar, false, (lnm) null, (byte) 10);
                    this.b = true;
                    if (l4p1.q(bpb1Var, hxnVar2, this) == d9nVar25) {
                        return d9nVar25;
                    }
                } else {
                    if (!z25) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                eg.m("SharedFlow never completes, this call should never return.");
                return null;
            case 25:
                d9n d9nVar26 = d9n.a;
                boolean z26 = this.b;
                if (!z26) {
                    hm5.M(obj);
                    zxm1 zxm1Var = (zxm1) ((nl9) this.c).h;
                    String str9 = (String) this.d;
                    Completable completableIgnoreElement = zxm1Var.a(str9).firstOrError().flatMap(new zxl1(zxm1Var, str9, (byte) 8)).ignoreElement();
                    completableIgnoreElement.getClass();
                    CompletableOnErrorComplete completableOnErrorCompleteO = completableIgnoreElement.o(Functions.h);
                    this.b = true;
                    if (fc11.i(completableOnErrorCompleteO, this) == d9nVar26) {
                        return d9nVar26;
                    }
                } else {
                    if (!z26) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 26:
                d9n d9nVar27 = d9n.a;
                boolean z27 = this.b;
                if (!z27) {
                    hm5.M(obj);
                    ats atsVar = ((x1s) this.c).h;
                    this.b = true;
                    if (atsVar.b(true, this) == d9nVar27) {
                        return d9nVar27;
                    }
                } else {
                    if (!z27) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 27:
                d9n d9nVar28 = d9n.a;
                boolean z28 = this.b;
                if (!z28) {
                    hm5.M(obj);
                    c3l c3lVar3 = ((o3s) this.c).a;
                    String str10 = (String) this.d;
                    this.b = true;
                    if (c3lVar3.d(str10, this) == d9nVar28) {
                        return d9nVar28;
                    }
                } else {
                    if (!z28) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 28:
                rih1 rih1Var3 = rih1.a;
                d0r d0rVar = (d0r) this.c;
                d9n d9nVar29 = d9n.a;
                boolean z29 = this.b;
                if (!z29) {
                    hm5.M(obj);
                    pwc0 pwc0Var = pwc0.D;
                    dz51 dz51Var = new dz51((gz51) this.d);
                    this.c = null;
                    this.b = true;
                    d0rVar.getClass();
                    if (d0r.d(d0rVar, pwc0Var, rih1Var3, dz51Var, this) == d9nVar29) {
                        return d9nVar29;
                    }
                } else {
                    if (!z29) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var3;
            default:
                d9n d9nVar30 = d9n.a;
                boolean z30 = this.b;
                if (!z30) {
                    hm5.M(obj);
                    vu30 vu30Var = (vu30) this.c;
                    d0r d0rVar2 = (d0r) ((k9r) this.d).b;
                    this.b = true;
                    if (vu30Var.invoke(d0rVar2, this) == d9nVar30) {
                        return d9nVar30;
                    }
                } else {
                    if (!z30) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ clo(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
    }
}
