package p;

import com.google.protobuf.h;
import com.spotify.base.java.logging.Logger;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoContainsResponse;
import com.spotify.connectivity.websocket.esperanto.proto.EsWebsocketEvent;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.io.IOException;
import java.util.Collections;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rf2 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ vr20 c;
    public /* synthetic */ Throwable d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rf2(byte b) {
        super(3, (lnm) null);
        this.a = b;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = 3;
        vr20 vr20Var = (vr20) obj;
        Throwable th = (Throwable) obj2;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                rf2 rf2Var = new rf2(b2, lnmVar, (byte) 0);
                rf2Var.c = vr20Var;
                rf2Var.d = th;
                return rf2Var.invokeSuspend(rih1Var);
            case 1:
                rf2 rf2Var2 = new rf2(b2, lnmVar, (byte) 1);
                rf2Var2.c = vr20Var;
                rf2Var2.d = th;
                return rf2Var2.invokeSuspend(rih1Var);
            case 2:
                rf2 rf2Var3 = new rf2(b2, lnmVar, (byte) 2);
                rf2Var3.c = vr20Var;
                rf2Var3.d = th;
                return rf2Var3.invokeSuspend(rih1Var);
            case 3:
                rf2 rf2Var4 = new rf2(b2, lnmVar, b2);
                rf2Var4.c = vr20Var;
                rf2Var4.d = th;
                return rf2Var4.invokeSuspend(rih1Var);
            case 4:
                rf2 rf2Var5 = new rf2(b2, lnmVar, (byte) 4);
                rf2Var5.c = vr20Var;
                rf2Var5.d = th;
                return rf2Var5.invokeSuspend(rih1Var);
            case 5:
                rf2 rf2Var6 = new rf2(b2, lnmVar, (byte) 5);
                rf2Var6.c = vr20Var;
                rf2Var6.d = th;
                return rf2Var6.invokeSuspend(rih1Var);
            case 6:
                rf2 rf2Var7 = new rf2(b2, lnmVar, (byte) 6);
                rf2Var7.c = vr20Var;
                rf2Var7.d = th;
                return rf2Var7.invokeSuspend(rih1Var);
            case 7:
                rf2 rf2Var8 = new rf2(b2, lnmVar, (byte) 7);
                rf2Var8.c = vr20Var;
                rf2Var8.d = th;
                return rf2Var8.invokeSuspend(rih1Var);
            case 8:
                rf2 rf2Var9 = new rf2(b2, lnmVar, (byte) 8);
                rf2Var9.c = vr20Var;
                rf2Var9.d = th;
                return rf2Var9.invokeSuspend(rih1Var);
            case 9:
                rf2 rf2Var10 = new rf2(b2, lnmVar, (byte) 9);
                rf2Var10.c = vr20Var;
                rf2Var10.d = th;
                return rf2Var10.invokeSuspend(rih1Var);
            case 10:
                rf2 rf2Var11 = new rf2(b2, lnmVar, (byte) 10);
                rf2Var11.c = vr20Var;
                rf2Var11.d = th;
                return rf2Var11.invokeSuspend(rih1Var);
            case 11:
                rf2 rf2Var12 = new rf2(b2, lnmVar, (byte) 11);
                rf2Var12.c = vr20Var;
                rf2Var12.d = th;
                return rf2Var12.invokeSuspend(rih1Var);
            case 12:
                rf2 rf2Var13 = new rf2(b2, lnmVar, (byte) 12);
                rf2Var13.c = vr20Var;
                rf2Var13.d = th;
                return rf2Var13.invokeSuspend(rih1Var);
            case 13:
                rf2 rf2Var14 = new rf2(b2, lnmVar, (byte) 13);
                rf2Var14.c = vr20Var;
                rf2Var14.d = th;
                return rf2Var14.invokeSuspend(rih1Var);
            case 14:
                rf2 rf2Var15 = new rf2(b2, lnmVar, (byte) 14);
                rf2Var15.c = vr20Var;
                rf2Var15.d = th;
                return rf2Var15.invokeSuspend(rih1Var);
            case 15:
                rf2 rf2Var16 = new rf2(b2, lnmVar, (byte) 15);
                rf2Var16.c = vr20Var;
                rf2Var16.d = th;
                return rf2Var16.invokeSuspend(rih1Var);
            case 16:
                rf2 rf2Var17 = new rf2(b2, lnmVar, (byte) 16);
                rf2Var17.c = vr20Var;
                rf2Var17.d = th;
                return rf2Var17.invokeSuspend(rih1Var);
            case 17:
                rf2 rf2Var18 = new rf2(b2, lnmVar, (byte) 17);
                rf2Var18.c = vr20Var;
                rf2Var18.d = th;
                return rf2Var18.invokeSuspend(rih1Var);
            case 18:
                rf2 rf2Var19 = new rf2(b2, lnmVar, (byte) 18);
                rf2Var19.c = vr20Var;
                rf2Var19.d = th;
                return rf2Var19.invokeSuspend(rih1Var);
            case 19:
                rf2 rf2Var20 = new rf2(b2, lnmVar, (byte) 19);
                rf2Var20.c = vr20Var;
                rf2Var20.d = th;
                return rf2Var20.invokeSuspend(rih1Var);
            case 20:
                rf2 rf2Var21 = new rf2(b2, lnmVar, (byte) 20);
                rf2Var21.c = vr20Var;
                rf2Var21.d = th;
                return rf2Var21.invokeSuspend(rih1Var);
            case 21:
                rf2 rf2Var22 = new rf2(b2, lnmVar, (byte) 21);
                rf2Var22.c = vr20Var;
                rf2Var22.d = th;
                return rf2Var22.invokeSuspend(rih1Var);
            case 22:
                rf2 rf2Var23 = new rf2(b2, lnmVar, (byte) 22);
                rf2Var23.c = vr20Var;
                rf2Var23.d = th;
                return rf2Var23.invokeSuspend(rih1Var);
            case 23:
                rf2 rf2Var24 = new rf2(b2, lnmVar, (byte) 23);
                rf2Var24.c = vr20Var;
                rf2Var24.d = th;
                return rf2Var24.invokeSuspend(rih1Var);
            case 24:
                rf2 rf2Var25 = new rf2(b2, lnmVar, (byte) 24);
                rf2Var25.c = vr20Var;
                rf2Var25.d = th;
                return rf2Var25.invokeSuspend(rih1Var);
            case 25:
                rf2 rf2Var26 = new rf2(b2, lnmVar, (byte) 25);
                rf2Var26.c = vr20Var;
                rf2Var26.d = th;
                return rf2Var26.invokeSuspend(rih1Var);
            case 26:
                rf2 rf2Var27 = new rf2(b2, lnmVar, (byte) 26);
                rf2Var27.c = vr20Var;
                rf2Var27.d = th;
                return rf2Var27.invokeSuspend(rih1Var);
            case 27:
                rf2 rf2Var28 = new rf2(b2, lnmVar, (byte) 27);
                rf2Var28.c = vr20Var;
                rf2Var28.d = th;
                return rf2Var28.invokeSuspend(rih1Var);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                rf2 rf2Var29 = new rf2(b2, lnmVar, (byte) 28);
                rf2Var29.c = vr20Var;
                rf2Var29.d = th;
                return rf2Var29.invokeSuspend(rih1Var);
            default:
                rf2 rf2Var30 = new rf2(b2, lnmVar, (byte) 29);
                rf2Var30.c = vr20Var;
                rf2Var30.d = th;
                return rf2Var30.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                vr20 vr20Var = this.c;
                Throwable th = this.d;
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
                Logger.e(th, "Error getting the video playability", new Object[0]);
                Boolean bool = Boolean.FALSE;
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var.emit(bool, this) == d9nVar ? d9nVar : rih1Var;
            case 1:
                vr20 vr20Var2 = this.c;
                Throwable th2 = this.d;
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
                if (th2 instanceof CancellationException) {
                    throw th2;
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var2.emit(b7xVar, this) == d9nVar ? d9nVar : rih1Var;
            case 2:
                vr20 vr20Var3 = this.c;
                Throwable th3 = this.d;
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
                if (th3 instanceof CancellationException) {
                    throw th3;
                }
                Boolean bool2 = Boolean.FALSE;
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var3.emit(bool2, this) == d9nVar ? d9nVar : rih1Var;
            case 3:
                vr20 vr20Var4 = this.c;
                Throwable th4 = this.d;
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
                Logger.d("Caught exception: " + th4, new Object[0]);
                if (!(th4 instanceof IOException)) {
                    n57.s("Exception of type " + th4.getClass().getName() + " with message \"" + th4.getMessage() + "\" thrown during websocket connection.");
                }
                ysz yszVarN = EsWebsocketEvent.WebSocketEvent.n();
                yszVarN.s(xsz.kTransportFailure);
                h hVarBuild = yszVarN.build();
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var4.emit(hVarBuild, this) == d9nVar ? d9nVar : rih1Var;
            case 4:
                vr20 vr20Var5 = this.c;
                Throwable th5 = this.d;
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
                if (th5 != null) {
                    return rih1Var;
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var5.emit(cr9.c, this) == d9nVar ? d9nVar : rih1Var;
            case 5:
                vr20 vr20Var6 = this.c;
                Throwable th6 = this.d;
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
                Logger.e(th6, "Failed to observe show base permissions", new Object[0]);
                wba wbaVar = new wba(wls0.b);
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var6.emit(wbaVar, this) == d9nVar ? d9nVar : rih1Var;
            case 6:
                vr20 vr20Var7 = this.c;
                Throwable th7 = this.d;
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
                Logger.d("Reachability monitoring error", new Object[]{th7});
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var7.emit(sbl.a, this) == d9nVar ? d9nVar : rih1Var;
            case 7:
                vr20 vr20Var8 = this.c;
                Throwable th8 = this.d;
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
                if (!(th8 instanceof IOException)) {
                    throw th8;
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var8.emit((Object) null, this) == d9nVar ? d9nVar : rih1Var;
            case 8:
                vr20 vr20Var9 = this.c;
                Throwable th9 = this.d;
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
                Logger.e(th9, "Error getting Age Assurance state for Social", new Object[0]);
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var9.emit(j7d.d, this) == d9nVar ? d9nVar : rih1Var;
            case 9:
                vr20 vr20Var10 = this.c;
                Throwable th10 = this.d;
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
                Logger.e(th10, "Failed to observe cellular download restriction", new Object[0]);
                lae laeVar = new lae(true);
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var10.emit(laeVar, this) == d9nVar ? d9nVar : rih1Var;
            case 10:
                vr20 vr20Var11 = this.c;
                Throwable th11 = this.d;
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
                Logger.e(th11, "Failed to observe cellular download setting", new Object[0]);
                Boolean bool3 = Boolean.FALSE;
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var11.emit(bool3, this) == d9nVar ? d9nVar : rih1Var;
            case 11:
                vr20 vr20Var12 = this.c;
                Throwable th12 = this.d;
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
                Logger.e(th12, "[CAL] ChapterListEffectHandler: failed to fetch chapters", new Object[0]);
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var12.emit(gie.a, this) == d9nVar ? d9nVar : rih1Var;
            case 12:
                vr20 vr20Var13 = this.c;
                Throwable th13 = this.d;
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
                ocm1 ocm1Var = new ocm1(th13);
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var13.emit(ocm1Var, this) == d9nVar ? d9nVar : rih1Var;
            case 13:
                vr20 vr20Var14 = this.c;
                Throwable th14 = this.d;
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
                n57.e(th14.toString());
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var14.emit(b7xVar, this) == d9nVar ? d9nVar : rih1Var;
            case 14:
                vr20 vr20Var15 = this.c;
                Throwable th15 = this.d;
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
                Logger.l(th15, "Network state monitoring failed, assuming connected", new Object[0]);
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var15.emit(a9l.g, this) == d9nVar ? d9nVar : rih1Var;
            case 15:
                vr20 vr20Var16 = this.c;
                Throwable th16 = this.d;
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
                Logger.e(th16, "Failed to check show curation eligibility", new Object[0]);
                mio mioVar = new mio(true);
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var16.emit(mioVar, this) == d9nVar ? d9nVar : rih1Var;
            case 16:
                vr20 vr20Var17 = this.c;
                Throwable th17 = this.d;
                boolean z17 = this.b;
                if (z17) {
                    if (z17) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Logger.e(th17, "Failed to resolve listening activity entity URI for prompt", new Object[0]);
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var17.emit((Object) null, this) == d9nVar ? d9nVar : rih1Var;
            case 17:
                vr20 vr20Var18 = this.c;
                Throwable th18 = this.d;
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
                Logger.e(th18, "GOS->Artisanal Cast snapshot subscription failed", new Object[0]);
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var18.emit((Object) null, this) == d9nVar ? d9nVar : rih1Var;
            case 18:
                vr20 vr20Var19 = this.c;
                Throwable th19 = this.d;
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
                if (!(th19 instanceof IOException)) {
                    throw th19;
                }
                cen0 cen0VarC = j82.C();
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var19.emit(cen0VarC, this) == d9nVar ? d9nVar : rih1Var;
            case 19:
                vr20 vr20Var20 = this.c;
                Throwable th20 = this.d;
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
                if (th20 != null) {
                    return rih1Var;
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var20.emit(ly60.a, this) == d9nVar ? d9nVar : rih1Var;
            case 20:
                vr20 vr20Var21 = this.c;
                Throwable th21 = this.d;
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
                tu81 tu81Var = new tu81(th21);
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var21.emit(tu81Var, this) == d9nVar ? d9nVar : rih1Var;
            case 21:
                vr20 vr20Var22 = this.c;
                Throwable th22 = this.d;
                boolean z22 = this.b;
                if (z22) {
                    if (z22) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                vfz vfzVar = new vfz(th22);
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var22.emit(vfzVar, this) == d9nVar ? d9nVar : rih1Var;
            case 22:
                vr20 vr20Var23 = this.c;
                Throwable th23 = this.d;
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
                qz81 qz81Var = new qz81(Collections.singletonList(th23));
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var23.emit(qz81Var, this) == d9nVar ? d9nVar : rih1Var;
            case 23:
                vr20 vr20Var24 = this.c;
                Throwable th24 = this.d;
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
                Logger.e(th24, "Failed to subscribe to listening activity", new Object[0]);
                y1f y1fVar = new y1f(b7xVar);
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var24.emit(y1fVar, this) == d9nVar ? d9nVar : rih1Var;
            case 24:
                vr20 vr20Var25 = this.c;
                Throwable th25 = this.d;
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
                n57.t("Failed to observe listening activity prompt visibility", th25);
                x1f x1fVar = new x1f(false);
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var25.emit(x1fVar, this) == d9nVar ? d9nVar : rih1Var;
            case 25:
                vr20 vr20Var26 = this.c;
                Throwable th26 = this.d;
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
                Logger.e(th26, "Failed to load entity visual identity for prompt artwork", new Object[0]);
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var26.emit((Object) null, this) == d9nVar ? d9nVar : rih1Var;
            case 26:
                vr20 vr20Var27 = this.c;
                Throwable th27 = this.d;
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
                n57.e(th27.toString());
                CollectionPlatformEsperantoContainsResponse collectionPlatformEsperantoContainsResponseP = CollectionPlatformEsperantoContainsResponse.p();
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var27.emit(collectionPlatformEsperantoContainsResponseP, this) == d9nVar ? d9nVar : rih1Var;
            case 27:
                vr20 vr20Var28 = this.c;
                Throwable th28 = this.d;
                boolean z28 = this.b;
                if (z28) {
                    if (z28) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                String message = th28.getMessage();
                h5i1 h5i1Var = new h5i1(message != null ? message : "Unknown error");
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var28.emit(h5i1Var, this) == d9nVar ? d9nVar : rih1Var;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                vr20 vr20Var29 = this.c;
                Throwable th29 = this.d;
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
                String message2 = th29.getMessage();
                zv00 zv00Var = new zv00(message2 != null ? message2 : "Unknown error");
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var29.emit(zv00Var, this) == d9nVar ? d9nVar : rih1Var;
            default:
                vr20 vr20Var30 = this.c;
                Throwable th30 = this.d;
                boolean z30 = this.b;
                if (z30) {
                    if (z30) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                String message3 = th30.getMessage();
                h5i1 h5i1Var2 = new h5i1(message3 != null ? message3 : "Unknown error");
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var30.emit(h5i1Var2, this) == d9nVar ? d9nVar : rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rf2(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }
}
