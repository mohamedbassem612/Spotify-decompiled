package p;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import app.rive.ViewModelInstance;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.base.java.logging.Logger;
import com.spotify.common_capping.esperanto.proto.CommonCappingOuterClass;
import com.spotify.recently_played_esperanto.proto.GetRecentlyPlayedTracksRequest;
import io.reactivex.rxjava3.core.Flowable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ic01 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic01(boolean z, oa11 oa11Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 8;
        this.b = z;
        this.c = oa11Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return new ic01((qb01) obj2, this.b, lnmVar, (byte) 0);
            case 1:
                return new ic01(obj2, lnmVar, (byte) 1);
            case 2:
                return new ic01(obj2, lnmVar, (byte) 2);
            case 3:
                return new ic01(obj2, lnmVar, (byte) 3);
            case 4:
                return new ic01(obj2, lnmVar, (byte) 4);
            case 5:
                return new ic01(obj2, lnmVar, (byte) 5);
            case 6:
                return new ic01(obj2, lnmVar, (byte) 6);
            case 7:
                return new ic01(obj2, lnmVar, (byte) 7);
            case 8:
                return new ic01(this.b, (oa11) obj2, lnmVar);
            case 9:
                return new ic01(obj2, lnmVar, (byte) 9);
            case 10:
                return new ic01(obj2, lnmVar, (byte) 10);
            case 11:
                return new ic01(obj2, lnmVar, (byte) 11);
            case 12:
                return new ic01(obj2, lnmVar, (byte) 12);
            case 13:
                return new ic01(obj2, lnmVar, (byte) 13);
            case 14:
                return new ic01((ca31) obj2, this.b, lnmVar, (byte) 14);
            case 15:
                return new ic01(obj2, lnmVar, (byte) 15);
            case 16:
                return new ic01((mk31) obj2, this.b, lnmVar, (byte) 16);
            case 17:
                return new ic01(obj2, lnmVar, (byte) 17);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new ic01(obj2, lnmVar, (byte) 18);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new ic01(obj2, lnmVar, (byte) 19);
            case 20:
                return new ic01(obj2, lnmVar, (byte) 20);
            case 21:
                return new ic01(obj2, lnmVar, (byte) 21);
            case 22:
                return new ic01(obj2, lnmVar, (byte) 22);
            case 23:
                return new ic01(obj2, lnmVar, (byte) 23);
            case 24:
                return new ic01(obj2, lnmVar, (byte) 24);
            case 25:
                return new ic01(obj2, lnmVar, (byte) 25);
            case 26:
                return new ic01(obj2, lnmVar, (byte) 26);
            case 27:
                return new ic01(obj2, lnmVar, (byte) 27);
            case 28:
                return new ic01(obj2, lnmVar, (byte) 28);
            default:
                return new ic01(obj2, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create(obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((uqo) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
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
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 15:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 17:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 20:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
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

    public final Object invokeSuspend(Object obj) {
        Object objK;
        Object objI;
        Object objU;
        Object objH;
        Object objA;
        int i = 2;
        byte b = 3;
        boolean z = false;
        lnm lnmVar = null;
        switch (this.a) {
            case 0:
                hm5.M(obj);
                qb01 qb01Var = (qb01) this.c;
                if (qb01Var.f) {
                    qb01Var.b(new nb01(qb01Var, !this.b, (lnm) null));
                }
                return rih1.a;
            case 1:
                d9n d9nVar = d9n.a;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    hd01 hd01Var = (hd01) this.c;
                    this.b = true;
                    if (hd01Var.a(this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 2:
                on01 on01Var = (on01) this.c;
                d9n d9nVar2 = d9n.a;
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    xyc0 xyc0Var = on01Var.b;
                    this.b = true;
                    objK = xyc0Var.k("spotify:playlist:37i9dQZF1Fs6Dvo6yu9lo4", this);
                    if (objK == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objK = obj;
                }
                ly21 ly21Var = (py21) objK;
                if (ly21Var instanceof ly21) {
                    String strM = l1d.m("Failed to delete all items. ", ly21Var.a.b());
                    blc0[] blc0VarArr = on01.f;
                    on01Var.a(3, (String) null, strM);
                }
                return rih1.a;
            case 3:
                d9n d9nVar3 = d9n.a;
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
                pp01 pp01Var = ((xp01) this.c).a;
                GetRecentlyPlayedTracksRequest getRecentlyPlayedTracksRequest = xp01.e;
                this.b = true;
                Object objA2 = pp01Var.a(getRecentlyPlayedTracksRequest, this);
                return objA2 == d9nVar3 ? d9nVar3 : objA2;
            case 4:
                d9n d9nVar4 = d9n.a;
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    n5f0 n5f0Var = (n5f0) this.c;
                    cqz0 cqz0Var = dqz0.a;
                    long jI = yoi1.I(n5f0Var);
                    this.b = true;
                    if (hap1.i(jI, this) == d9nVar4) {
                        return d9nVar4;
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
                d9n d9nVar5 = d9n.a;
                boolean z6 = this.b;
                if (!z6) {
                    hm5.M(obj);
                    vr01 vr01Var = ((vu01) this.c).X;
                    if (vr01Var != null) {
                        ezc ezcVarG = vr01Var.g();
                        this.b = true;
                        if (l4p1.p(ezcVarG, this) == d9nVar5) {
                            return d9nVar5;
                        }
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
                d9n d9nVar6 = d9n.a;
                boolean z7 = this.b;
                try {
                    if (!z7) {
                        hm5.M(obj);
                        xyc0 xyc0Var2 = (iyc0) ((g2z) this.c).b;
                        ddd1 ddd1Var = ddd1.d;
                        this.b = true;
                        if (xyc0Var2.u("spotify:list:recents:page", ddd1Var, this) == d9nVar6) {
                            return d9nVar6;
                        }
                    } else {
                        if (!z7) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    break;
                } catch (Exception e) {
                    Logger.e(e, "ChatContentPicker: Failed to synchronize recents", new Object[0]);
                }
                return rih1.a;
            case 7:
                d9n d9nVar7 = d9n.a;
                boolean z8 = this.b;
                if (!z8) {
                    hm5.M(obj);
                    lt20 lt20Var = ((o911) ((kly0) ((kdy0) this.c).b).get()).b;
                    this.b = true;
                    objI = b5p1.i(lt20Var, this);
                    if (objI == d9nVar7) {
                        return d9nVar7;
                    }
                } else {
                    if (!z8) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objI = obj;
                }
                qy21 qy21Var = (qy21) objI;
                if (qy21Var instanceof ny21) {
                    ny21 ny21Var = (ny21) qy21Var;
                    return new q911(ny21Var.a, ny21Var.b);
                }
                if (u890.j(qy21Var, ay21.a)) {
                    return q911.c;
                }
                eg.o();
                return null;
            case 8:
                hm5.M(obj);
                if (this.b) {
                    ((oa11) this.c).f();
                }
                return rih1.a;
            case 9:
                rih1 rih1Var = rih1.a;
                d9n d9nVar8 = d9n.a;
                boolean z9 = this.b;
                if (!z9) {
                    hm5.M(obj);
                    krh krhVar = (krh) ((ytp0) this.c).c;
                    this.b = true;
                    Object objC0 = krhVar.a.c0((CommonCappingOuterClass.RefreshRequest) CommonCappingOuterClass.RefreshRequest.n().build(), this);
                    if (objC0 != d9nVar8) {
                        objC0 = rih1Var;
                    }
                    if (objC0 == d9nVar8) {
                        return d9nVar8;
                    }
                } else {
                    if (!z9) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            case 10:
                d9n d9nVar9 = d9n.a;
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
                bpb1 bpb1Var = ((zf11) this.c).a;
                ga5 ga5Var = new ga5(i, lnmVar, (byte) 5);
                this.b = true;
                Object objJ = b5p1.j(bpb1Var, ga5Var, this);
                return objJ == d9nVar9 ? d9nVar9 : objJ;
            case 11:
                hi11 hi11Var = (hi11) this.c;
                d9n d9nVar10 = d9n.a;
                boolean z11 = this.b;
                if (!z11) {
                    hm5.M(obj);
                    Flowable flowableC = hi11Var.a.c();
                    vbm[] vbmVarArr = q601.a;
                    lt20 lt20Var2 = new lt20(new s1g(new fu20(new f5y0(new f5y0(rqt0.t(new kge(flowableC), new fk01(hi11Var, b)), hi11Var, (byte) 21), hi11Var, (byte) 20), new p2z0(hi11Var, (lnm) null, (byte) 15), (byte) 1), (byte) 13), new ob00(3, (lnm) null, (byte) 27), (byte) 0);
                    j0z0 j0z0Var = new j0z0((Object) hi11Var, (byte) 7);
                    this.b = true;
                    if (lt20Var2.collect(j0z0Var, this) == d9nVar10) {
                        return d9nVar10;
                    }
                } else {
                    if (!z11) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 12:
                d9n d9nVar11 = d9n.a;
                boolean z12 = this.b;
                if (!z12) {
                    hm5.M(obj);
                    wt20 wt20VarF = z4p1.F(((pe21) this.c).w, 2);
                    this.b = true;
                    if (l4p1.p(wt20VarF, this) == d9nVar11) {
                        return d9nVar11;
                    }
                } else {
                    if (!z12) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 13:
                d9n d9nVar12 = d9n.a;
                boolean z13 = this.b;
                if (z13) {
                    if (z13) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                k811 k811Var = (k811) this.c;
                xq81 xq81Var = (xq81) k811Var.b;
                String str = ((vtf) k811Var.d).a;
                this.b = true;
                Object objG = xq81Var.g(str, this);
                return objG == d9nVar12 ? d9nVar12 : objG;
            case 14:
                hm5.M(obj);
                ca31 ca31Var = (ca31) this.c;
                nt21 nt21Var = ca31Var.e;
                i8h1 i8h1Var = (i8h1) ((ykq) nt21Var.b).get();
                j4m0 j4m0Var = (j4m0) nt21Var.c;
                lik1 lik1Var = nik1.P5;
                String str2 = lik1Var.a;
                z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
                if (str2 == null) {
                    str2 = "";
                }
                tv80 tv80VarM = i8h1Var.m(new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), j4m0Var.a, r6h1.c, System.currentTimeMillis()), (xj61) null);
                ca31Var.c.f(new dwn0(lik1Var.a + "?startMuted=" + this.b, "", false, false, 0, 0, false, (a690) null, (Bundle) null, new bwn0(tv80VarM)));
                return rih1.a;
            case 15:
                d9n d9nVar13 = d9n.a;
                boolean z14 = this.b;
                if (!z14) {
                    hm5.M(obj);
                    x390 x390Var = (x390) this.c;
                    if (x390Var == null) {
                        return null;
                    }
                    this.b = true;
                    objU = x390Var.u(this);
                    if (objU == d9nVar13) {
                        return d9nVar13;
                    }
                } else {
                    if (!z14) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objU = obj;
                }
                return (cga1) objU;
            case 16:
                hm5.M(obj);
                mk31 mk31Var = (mk31) this.c;
                boolean z15 = this.b;
                try {
                    ViewModelInstance viewModelInstance = mk31Var.a;
                    if (viewModelInstance != null) {
                        viewModelInstance.setBoolean("isReducedMotion", z15);
                    }
                    break;
                } catch (Exception e2) {
                    Logger.e(e2, "Failed to set Rive reduced-motion property", new Object[0]);
                }
                return rih1.a;
            case 17:
                d9n d9nVar14 = d9n.a;
                boolean z16 = this.b;
                if (!z16) {
                    hm5.M(obj);
                    x550 x550Var = (x550) this.c;
                    this.b = true;
                    if (x550Var.b(this) == d9nVar14) {
                        return d9nVar14;
                    }
                } else {
                    if (!z16) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                d9n d9nVar15 = d9n.a;
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
                g931 g931Var = (g931) this.c;
                f741 f741Var = (f741) g931Var.b;
                Context context = (Context) g931Var.c;
                this.b = true;
                Object objH2 = c921.H(f741Var.a, new p2z0(f741Var, context, (lnm) null, (byte) 24), this);
                return objH2 == d9nVar15 ? d9nVar15 : objH2;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                nt21 nt21Var2 = (nt21) this.c;
                Context context2 = (Context) nt21Var2.b;
                d9n d9nVar16 = d9n.a;
                boolean z18 = this.b;
                if (!z18) {
                    hm5.M(obj);
                    try {
                        PackageInfo packageInfo = context2.getPackageManager().getPackageInfo("com.samsung.android.mobileservice", 0);
                        if ((Build.VERSION.SDK_INT >= 28 ? ph5.q(packageInfo) : packageInfo.versionCode) >= 1050000023) {
                            f741 f741Var2 = (f741) nt21Var2.c;
                            this.b = true;
                            objH = c921.H(f741Var2.a, new p2z0(f741Var2, context2, (lnm) null, (byte) 24), this);
                            if (objH == d9nVar16) {
                                return d9nVar16;
                            }
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    return Boolean.valueOf(z);
                }
                if (!z18) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                objH = obj;
                if (((Boolean) objH).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 20:
                d9n d9nVar17 = d9n.a;
                boolean z19 = this.b;
                if (z19) {
                    if (z19) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                nt21 nt21Var3 = (nt21) ((s6z0) this.c).b;
                this.b = true;
                Object objY = fn31.Y(b3s.c, new ic01((Object) nt21Var3, lnmVar, (byte) 19), this);
                return objY == d9nVar17 ? d9nVar17 : objY;
            case 21:
                d9n d9nVar18 = rih1.a;
                d9n d9nVar19 = d9n.a;
                boolean z20 = this.b;
                if (!z20) {
                    hm5.M(obj);
                    g841 g841Var = (g841) ((q741) this.c).b.get();
                    this.b = true;
                    g841Var.a.a();
                    if (d9nVar18 == d9nVar19) {
                        return d9nVar19;
                    }
                } else {
                    if (!z20) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return d9nVar18;
            case 22:
                rih1 rih1Var2 = rih1.a;
                d9n d9nVar20 = d9n.a;
                boolean z21 = this.b;
                if (!z21) {
                    hm5.M(obj);
                    l6s l6sVar = ((r741) this.c).a;
                    this.b = true;
                    goq goqVar = (goq) l6sVar.a;
                    Object objCollect = rqt0.u(rqt0.u(new qer((php0) goqVar.g, goqVar, (byte) 27))).collect(new x5s(new skr(l6sVar, (byte) 13), (byte) 15), this);
                    if (objCollect != d9nVar20) {
                        objCollect = rih1Var2;
                    }
                    if (objCollect != d9nVar20) {
                        objCollect = rih1Var2;
                    }
                    if (objCollect == d9nVar20) {
                        return d9nVar20;
                    }
                } else {
                    if (!z21) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var2;
            case 23:
                d9n d9nVar21 = d9n.a;
                boolean z22 = this.b;
                if (!z22) {
                    hm5.M(obj);
                    zuw0 zuw0Var = (zuw0) ((e821) this.c).c;
                    this.b = true;
                    if (zuw0Var.e(true, this) == d9nVar21) {
                        return d9nVar21;
                    }
                } else {
                    if (!z22) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 24:
                d9n d9nVar22 = d9n.a;
                boolean z23 = this.b;
                if (!z23) {
                    hm5.M(obj);
                    hn41 hn41Var = (hn41) this.c;
                    this.b = true;
                    objA = hn41Var.a(this);
                    if (objA == d9nVar22) {
                        return d9nVar22;
                    }
                } else {
                    if (!z23) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objA = ((pvg1) obj).a;
                }
                return new pvg1((String) objA);
            case 25:
                qn41 qn41Var = (qn41) this.c;
                AtomicReference atomicReference = qn41Var.e;
                d9n d9nVar23 = d9n.a;
                boolean z24 = this.b;
                if (!z24) {
                    hm5.M(obj);
                    if (atomicReference.get() != null) {
                        xgn0 xgn0Var = qn41Var.f;
                        this.b = true;
                        if (xgn0Var.a(this) == d9nVar23) {
                            return d9nVar23;
                        }
                    }
                } else {
                    if (!z24) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                atomicReference.set(null);
                return rih1.a;
            case 26:
                rih1 rih1Var3 = rih1.a;
                d9n d9nVar24 = d9n.a;
                boolean z25 = this.b;
                if (!z25) {
                    hm5.M(obj);
                    du40 du40Var = (du40) this.c;
                    hq41 hq41Var = (hq41) du40Var.d;
                    m441 m441Var = new m441(new q721(du40Var, (lnm) null));
                    this.b = true;
                    Object objH3 = c921.H(hq41Var.d, new n641(hq41Var, m441Var, Bundle.EMPTY, (lnm) null, (byte) 6), this);
                    if (objH3 != d9nVar24) {
                        objH3 = rih1Var3;
                    }
                    if (objH3 == d9nVar24) {
                        return d9nVar24;
                    }
                } else {
                    if (!z25) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var3;
            case 27:
                e821 e821Var = (e821) this.c;
                d9n d9nVar25 = d9n.a;
                boolean z26 = this.b;
                if (!z26) {
                    hm5.M(obj);
                    jge jgeVarE = hu20.e((otf) e821Var.a, new af01(lnmVar, (Object) e821Var, (byte) 11));
                    j0z0 j0z0Var2 = new j0z0((Object) e821Var, (byte) 14);
                    this.b = true;
                    if (jgeVarE.collect(j0z0Var2, this) == d9nVar25) {
                        return d9nVar25;
                    }
                } else {
                    if (!z26) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 28:
                d9n d9nVar26 = d9n.a;
                boolean z27 = this.b;
                if (!z27) {
                    hm5.M(obj);
                    long j = ((is41) this.c).d;
                    this.b = true;
                    if (hap1.i(j, this) == d9nVar26) {
                        return d9nVar26;
                    }
                } else {
                    if (!z27) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                is41 is41Var = (is41) this.c;
                g931 g931Var2 = is41Var.c;
                synchronized (g931Var2) {
                    try {
                        g931Var2.d = null;
                        Set setV0 = dm61.v0((Set) g931Var2.b, (LinkedHashSet) g931Var2.c);
                        if (!setV0.isEmpty()) {
                            Set set = setV0;
                            ArrayList arrayList = new ArrayList(q7h.U(set, 10));
                            Iterator it = set.iterator();
                            while (it.hasNext()) {
                                arrayList.add(new mmr0((jh5) it.next(), new h3r(new d3r("Scroll card loading timed out"))));
                            }
                            ((LinkedHashSet) g931Var2.c).addAll(setV0);
                            is41Var.b.invoke(arrayList);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return rih1.a;
            default:
                d9n d9nVar27 = d9n.a;
                boolean z28 = this.b;
                if (!z28) {
                    hm5.M(obj);
                    s551 s551Var = (s551) this.c;
                    jge jgeVarE2 = hu20.e(s551Var.d.b, new af01(lnmVar, (Object) s551Var, (byte) 12));
                    ft1 ft1Var = ft1.c;
                    this.b = true;
                    if (jgeVarE2.collect(ft1Var, this) == d9nVar27) {
                        return d9nVar27;
                    }
                } else {
                    if (!z28) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ic01(Object obj, boolean z, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ic01(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
    }
}
