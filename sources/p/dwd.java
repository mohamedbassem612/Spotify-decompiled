package p;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.protobuf.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dwd extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dwd(Object obj, byte b) {
        super(3);
        this.a = b;
        this.b = obj;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        fux fuxVar = fux.c;
        String strO0 = cwl1.o0(x340Var, 2131960755);
        ggg gggVar = (ggg) this.b;
        x340 x340Var2 = x340Var;
        boolean zI = x340Var2.i(gggVar);
        Object objT = x340Var2.T();
        if (zI || objT == fkj0.X) {
            objT = new lwe(gggVar, (byte) 18);
            x340Var2.s0(objT);
        }
        myo1.c(fux.d, strO0, (Function0) objT, x340Var2, fuxVar, (qim0) null);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:103:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:104:0x03eb  */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        ou80 ou80Var;
        String uri;
        Object obj4;
        jwm jwmVar;
        float fE;
        Object obj5;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        byte b2 = 1;
        rih1 rih1Var = rih1.a;
        String str = null;
        Object obj6 = null;
        str = null;
        Object obj7 = this.b;
        switch (b) {
            case 0:
                bwd bwdVar = (bwd) obj2;
                tqw tqwVar = (tqw) obj3;
                if (tqwVar != null) {
                    ((lzn0) ((umf0) obj7).e).a(bwdVar.a, n3o1.y(tqwVar), (Bundle) null);
                }
                return rih1Var;
            case 1:
                ((ewd) obj7).a.invoke(((fwd) obj2).a);
                return rih1Var;
            case 2:
                if (((xzd) obj2).equals(xzd.a)) {
                    ((zzd) obj7).b.invoke();
                    return rih1Var;
                }
                eg.o();
                return null;
            case 3:
                tqw tqwVar2 = (tqw) obj3;
                qy71 qy71Var = (qy71) ((qj0) obj7).e;
                pu6 pu6Var = ((m8e) obj2).a;
                tv80 tv80VarY = tqwVar2 != null ? n3o1.y(tqwVar2) : null;
                b431 b431Var = qy71Var.b;
                if (tv80VarY != null && (ou80Var = tv80VarY.a) != null) {
                    str = ou80Var.a;
                }
                b431Var.a(pu6Var, str);
                return rih1Var;
            case 4:
                bfe bfeVar = (bfe) obj7;
                vz80 vz80Var = bfeVar.c;
                xee xeeVar = bfeVar.b;
                String str2 = ((yee) obj2).d;
                int iOrdinal = ((vee) obj3).ordinal();
                if (iOrdinal == 0) {
                    return xeeVar.d(str2, vz80Var.b);
                }
                if (iOrdinal == 1) {
                    return xeeVar.e(str2, vz80Var.b);
                }
                eg.o();
                return null;
            case 5:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                nox noxVar = nox.c;
                jsl jslVar = new jsl(((oje) obj7).a);
                uwr uwrVar = cbx.a;
                long j = cbx.a(b0kVar).b.a;
                zov0 zov0Var = cbx.b(b0kVar).g;
                w0h1.a(noxVar, jslVar, u291.r(nim0Var, 16.0f), j, 0L, false, b0kVar, nox.d, 48);
                return rih1Var;
            case 6:
                uje ujeVar = (vje) obj;
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                wje wjeVar = (wje) obj7;
                q7r0 q7r0Var = wjeVar.c;
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? x340Var.g(ujeVar) : x340Var.i(ujeVar) ? 4 : 2;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                    d0r d0rVarC = cwl1.C(q7r0Var);
                    x8c0 lifecycle = q7r0Var.d.c.getLifecycle();
                    if (ujeVar instanceof uje) {
                        x340Var2.i0(-580953233);
                        Object objT = x340Var2.T();
                        if (objT == m4cVar) {
                            p2o0 p2o0Var = (p2o0) wjeVar.e.a.c;
                            pp11 pp11Var = (pp11) ((xje) p2o0Var.b).f.get();
                            c8o.l(pp11Var);
                            c591 c591Var = new c591(pp11Var, p2o0Var.y(), new myq0((q7r0) p2o0Var.c).get(), d0rVarC, lifecycle);
                            x340Var2.s0(c591Var);
                            objT = c591Var;
                        }
                        uje ujeVar2 = ujeVar;
                        otw.c((c591) objT, new z491(ujeVar2.a, ujeVar2.c, ujeVar2.b), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                        x340Var2.r(false);
                    } else {
                        if (!(ujeVar instanceof tje)) {
                            throw p3d1.k(x340Var2, 2059467890, false);
                        }
                        x340Var2.i0(-580478530);
                        Object objT2 = x340Var2.T();
                        if (objT2 == m4cVar) {
                            o4p o4pVar = wjeVar.f;
                            boolean z = wjeVar.g;
                            p2o0 p2o0Var2 = (p2o0) o4pVar.a.c;
                            pp11 pp11Var2 = (pp11) ((xje) p2o0Var2.b).f.get();
                            c8o.l(pp11Var2);
                            zf21 zf21Var = new zf21(pp11Var2, p2o0Var2.y(), new myq0((q7r0) p2o0Var2.c).get(), d0rVarC, z, lifecycle);
                            x340Var2.s0(zf21Var);
                            objT2 = zf21Var;
                        }
                        tje tjeVar = (tje) ujeVar;
                        otw.b((zf21) objT2, new wf21(tjeVar.a, tjeVar.c, tjeVar.b), new joa0("replay_confirmation"), (qim0) null, x340Var2, 0, 8);
                        x340Var2.r(false);
                    }
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 7:
                ((Function0) ((umf0) obj7).e).invoke();
                return rih1Var;
            case 8:
                buy buyVar = (buy) obj;
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= (iIntValue2 & 8) == 0 ? x340Var3.g(buyVar) : x340Var3.i(buyVar) ? 4 : 2;
                }
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    ske skeVar = (ske) obj7;
                    skeVar.d(skeVar.d.a, mqo1.A(((gwq) rwq.h(buyVar.g, x340Var4, 0).getValue()).a), (qim0) null, x340Var4, 0);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 9:
                yle yleVar = (yle) obj;
                x340 x340Var5 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= (iIntValue3 & 8) == 0 ? x340Var5.g(yleVar) : x340Var5.i(yleVar) ? 4 : 2;
                }
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    ((eme) obj7).c(yleVar, (qim0) null, x340Var6, iIntValue3 & 14);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 10:
                wre wreVar = (wre) obj;
                qre qreVar = (qre) obj2;
                tqw tqwVar3 = (tqw) obj3;
                kre kreVar = (kre) obj7;
                lzn0 lzn0Var = kreVar.a;
                if (qreVar.equals(lre.a)) {
                    String strM = l1d.m("spotify:listening-party:chat:", new y6b1(wreVar.a, false).e);
                    Bundle bundleH = mno1.h(new mmr0[]{new mmr0("com.spotify.liveroom.listeningpartychat.SHOW_ENHANCED_CHAT", Boolean.valueOf(((qq4) kreVar.e.get()).j()))});
                    if (tqwVar3 != null) {
                        lzn0Var.a(strM, n3o1.y(tqwVar3), bundleH);
                        return rih1Var;
                    }
                    lzn0Var.g(bundleH, strM);
                    return rih1Var;
                }
                if (qreVar.equals(pre.a)) {
                    String str3 = wreVar.d;
                    String str4 = ihc1.y0(str3) ? null : str3;
                    if (str4 == null) {
                        return rih1Var;
                    }
                    z710.d(kreVar.b, str4, false, 6);
                    return rih1Var;
                }
                if (qreVar.equals(mre.a) || qreVar.equals(ore.a)) {
                    lzn0Var.h("spotify:upsell:premium_in_app_destination?displayReason=kpop_upsell:listening_parties");
                    return rih1Var;
                }
                if (qreVar.equals(nre.a)) {
                    return rih1Var;
                }
                eg.o();
                return null;
            case 11:
                tqw tqwVar4 = (tqw) obj3;
                lzn0 lzn0Var2 = ((sve) obj7).b;
                String str5 = ((rve) obj).a;
                Set set = pcf.a;
                pcf.a(lzn0Var2, "spotify:chat-settings:".concat(str5), tqwVar4 != null ? n3o1.y(tqwVar4) : null, (Bundle) null);
                return rih1Var;
            case 12:
                wve wveVar = (wve) obj;
                vve vveVar = (vve) obj2;
                tqw tqwVar5 = (tqw) obj3;
                yve yveVar = (yve) obj7;
                String str6 = wveVar.b;
                if (vveVar.equals(uve.a)) {
                    pcf.a(yveVar.a, str6, cvl1.d(tqwVar5), (Bundle) null);
                    return rih1Var;
                }
                if (vveVar.equals(tve.a)) {
                    yveVar.c.b(nzy.k(str6), yveVar.d, yveVar.e, wveVar.c, cvl1.d(tqwVar5));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 13:
                if (((x0f) obj2).equals(x0f.a)) {
                    ((y0f) obj7).a.invoke();
                    return rih1Var;
                }
                eg.o();
                return null;
            case 14:
                b5f b5fVar = (d5f) obj;
                z4f z4fVar = (z4f) obj2;
                tqw tqwVar6 = (tqw) obj3;
                f5f f5fVar = (f5f) obj7;
                String str7 = f5fVar.b;
                lzn0 lzn0Var3 = f5fVar.a;
                boolean z2 = b5fVar instanceof b5f;
                x4f x4fVar = x4f.a;
                if (z2) {
                    if (z4fVar instanceof y4f) {
                        pcf.a(lzn0Var3, b5fVar.a.e, tqwVar6 != null ? n3o1.y(tqwVar6) : null, (Bundle) null);
                        return rih1Var;
                    }
                    if (z4fVar.equals(x4fVar)) {
                        return rih1Var;
                    }
                    eg.o();
                } else if (b5fVar instanceof c5f) {
                    if (z4fVar instanceof y4f) {
                        return rih1Var;
                    }
                    if (z4fVar.equals(x4fVar)) {
                        if (str7.length() <= 0) {
                            return rih1Var;
                        }
                        Set set2 = pcf.a;
                        pcf.a(lzn0Var3, "spotify:chat-details:".concat(str7), tqwVar6 != null ? n3o1.y(tqwVar6) : null, (Bundle) null);
                        return rih1Var;
                    }
                    eg.o();
                } else {
                    if (b5fVar instanceof a5f) {
                        return rih1Var;
                    }
                    eg.o();
                }
                return null;
            case 15:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                w4i1 w4i1Var = (w4i1) obj7;
                c380 c380VarA = mqo1.A(Collections.singletonList(w4i1Var));
                Parcelable.Creator creator = w4i1.CREATOR;
                aqo1.f(6, 4, b0kVar2, hcx.e, c380VarA, (qim0) null);
                String str8 = w4i1Var.b;
                uwr uwrVar2 = cbx.a;
                lee1 lee1Var = cbx.d(b0kVar2).e;
                long j2 = cbx.a(b0kVar2).b.a;
                cjc0 cjc0Var = new cjc0(1);
                cvx cvxVar = cbx.b(b0kVar2).b;
                uwo1.e(str8, uyn1.z(0.0f, 8.0f, 1, nim0Var), lee1Var, j2, (a0e1) null, (iu30) null, 2, false, cjc0Var, 0, (qx8) null, b0kVar2, 0, 0, 1712);
                return rih1Var;
            case 16:
                t6f t6fVar = (t6f) obj2;
                v5f v5fVar = (r6f) obj3;
                h7f h7fVar = (h7f) obj7;
                boolean zEquals = v5fVar.equals(p6f.a);
                b7x b7xVar = b7x.a;
                if (zEquals) {
                    ovk0 ovk0VarE = h7fVar.e();
                    ovk0VarE.getClass();
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("focus_input_field", 1, b7xVar), ovk0VarE.a, r6h1.c, System.currentTimeMillis());
                }
                if (v5fVar.equals(e6f.a)) {
                    t7q0 t7q0Var = t6fVar.a;
                    if (t7q0Var == null || (uri = t7q0Var.getUri()) == null) {
                        return null;
                    }
                    ovk0 ovk0VarE2 = h7fVar.e();
                    ovk0VarE2.getClass();
                    x6h1 x6h1VarC = ovk0VarE2.a.c();
                    x6h1VarC.i.add(new a7h1("attachment", (String) null, (Integer) null, uri, (String) null));
                    x6h1VarC.j = true;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_entity_in_list", 1, Collections.singletonMap("entity_to_be_removed", uri)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
                }
                if (v5fVar instanceof f6f) {
                    ovk0 ovk0VarE3 = h7fVar.e();
                    ovk0VarE3.getClass();
                    x6h1 x6h1VarC2 = ovk0VarE3.a.c();
                    x6h1VarC2.i.add(new a7h1("send_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("send_message", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
                }
                if (v5fVar instanceof y5f) {
                    ovk0 ovk0VarE4 = h7fVar.e();
                    ovk0VarE4.getClass();
                    x6h1 x6h1VarC3 = ovk0VarE4.a.c();
                    x6h1VarC3.i.add(new a7h1("share_entity_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
                }
                if (v5fVar instanceof b6f) {
                    ovk0 ovk0VarE5 = h7fVar.e();
                    ovk0VarE5.getClass();
                    x6h1 x6h1VarC4 = ovk0VarE5.a.c();
                    x6h1VarC4.i.add(new a7h1("media_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
                }
                if (v5fVar instanceof c6f) {
                    ovk0 ovk0VarE6 = h7fVar.e();
                    ovk0VarE6.getClass();
                    x6h1 x6h1VarC5 = ovk0VarE6.a.c();
                    x6h1VarC5.i.add(new a7h1("sticker_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis());
                }
                if (v5fVar.equals(t5f.a)) {
                    ovk0 ovk0VarE7 = h7fVar.e();
                    ovk0VarE7.getClass();
                    x6h1 x6h1VarC6 = ovk0VarE7.a.c();
                    x6h1VarC6.i.add(new a7h1("share_entity_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis());
                }
                if (!(v5fVar instanceof v5f)) {
                    if (v5fVar.equals(u5f.a) || v5fVar.equals(a6f.a) || v5fVar.equals(z5f.a) || (v5fVar instanceof x5f) || (v5fVar instanceof h6f) || (v5fVar instanceof g6f) || (v5fVar instanceof i6f) || (v5fVar instanceof n6f) || (v5fVar instanceof o6f) || (v5fVar instanceof q6f) || (v5fVar instanceof d6f) || (v5fVar instanceof l6f) || (v5fVar instanceof m6f) || (v5fVar instanceof k6f) || (v5fVar instanceof j6f) || v5fVar.equals(w5f.a)) {
                        return null;
                    }
                    eg.o();
                    return null;
                }
                int iOrdinal2 = v5fVar.a.ordinal();
                if (iOrdinal2 == 0) {
                    ovk0 ovk0VarE8 = h7fVar.e();
                    ovk0VarE8.getClass();
                    x6h1 x6h1VarC7 = ovk0VarE8.a.c();
                    x6h1VarC7.i.add(new a7h1("share_entity_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC7.a(), r6h1.c, System.currentTimeMillis());
                }
                if (iOrdinal2 == 1) {
                    ovk0 ovk0VarE9 = h7fVar.e();
                    ovk0VarE9.getClass();
                    x6h1 x6h1VarC8 = ovk0VarE9.a.c();
                    x6h1VarC8.i.add(new a7h1("media_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC8.a(), r6h1.c, System.currentTimeMillis());
                }
                if (iOrdinal2 != 2 && iOrdinal2 != 3) {
                    eg.o();
                    return null;
                }
                ovk0 ovk0VarE10 = h7fVar.e();
                ovk0VarE10.getClass();
                x6h1 x6h1VarC9 = ovk0VarE10.a.c();
                x6h1VarC9.i.add(new a7h1("sticker_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC9.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC9.a(), r6h1.c, System.currentTimeMillis());
            case 17:
                xaf xafVar = (xaf) obj;
                x340 x340Var7 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                yaf yafVar = (yaf) obj7;
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= (iIntValue4 & 8) == 0 ? x340Var7.g(xafVar) : x340Var7.i(xafVar) ? 4 : 2;
                }
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    Object objT3 = x340Var8.T();
                    m4c m4cVar2 = fkj0.X;
                    if (objT3 == m4cVar2) {
                        obj4 = objT3;
                        r6h1 r6h1VarB = yafVar.j.b();
                        x340Var8.s0(r6h1VarB);
                        obj4 = r6h1VarB;
                    }
                    obj4 = objT3;
                    r6h1 r6h1Var = (r6h1) obj4;
                    boolean zI = x340Var8.i(r6h1Var);
                    Object objT4 = x340Var8.T();
                    Object obj8 = objT4;
                    if (zI || objT4 == m4cVar2) {
                        s20 s20Var = new s20(r6h1Var, (byte) 3);
                        x340Var8.s0(s20Var);
                        obj8 = s20Var;
                    }
                    dgo1.c("chatMembersPage", (iu30) obj8, apo.r(950351138, new a7e(xafVar, yafVar, (byte) 10), x340Var8), x340Var8, 390);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 18:
                ((yhf) obj7).c((goe) obj, (b0k) obj2, ((Number) obj3).intValue() & 14);
                return rih1Var;
            case 19:
                ijf ijfVar = (ijf) obj2;
                tqw tqwVar7 = (tqw) obj3;
                njf njfVar = (njf) obj7;
                lzn0 lzn0Var4 = njfVar.b;
                tv80 tv80VarY2 = tqwVar7 != null ? n3o1.y(tqwVar7) : null;
                if (ijfVar.equals(gjf.a)) {
                    pcf.a(lzn0Var4, (String) njfVar.f.getValue(), tv80VarY2, (Bundle) null);
                    return rih1Var;
                }
                if (ijfVar.equals(hjf.a)) {
                    pcf.a(lzn0Var4, nik1.e1.a, tv80VarY2, (Bundle) null);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 20:
                goe goeVar = (goe) obj;
                ((Number) obj3).intValue();
                List list = goeVar.e;
                x340 x340Var9 = (b0k) obj2;
                cir0 cir0Var = (cir0) x340Var9.k(k2r0.a);
                iac0 iac0Var = cir0Var.g().d.c;
                nmf nmfVar = (nmf) obj7;
                pmf pmfVar = nmfVar.c;
                Object objT5 = x340Var9.T();
                m4c m4cVar3 = fkj0.X;
                if (objT5 == m4cVar3) {
                    i5p i5pVar = nmfVar.d;
                    g431 g431VarH = cir0Var.h();
                    u9c0 u9c0VarQ = cto1.q(iac0Var);
                    wzn wznVar = (wzn) i5pVar.a.c;
                    String str9 = ((pmf) wznVar.b).c;
                    c8o.m(str9);
                    ewo ewoVar = (ewo) wznVar.c;
                    omf omfVar = (omf) wznVar.a;
                    bfd bfdVar = (bfd) ewoVar.get();
                    r630 r630Var = (r630) omfVar.d.get();
                    c8o.l(r630Var);
                    vcd0 vcd0Var = (vcd0) omfVar.e.get();
                    c8o.l(vcd0Var);
                    add addVar = (add) omfVar.c.get();
                    c8o.l(addVar);
                    jed0 jed0Var = (jed0) omfVar.f.get();
                    c8o.l(jed0Var);
                    lzn0 lzn0Var5 = (lzn0) omfVar.a.get();
                    c8o.l(lzn0Var5);
                    t6t t6tVar = (t6t) omfVar.g.get();
                    c8o.l(t6tVar);
                    jyb0 jyb0Var = (jyb0) omfVar.h.get();
                    c8o.l(jyb0Var);
                    bxb0 bxb0Var = (bxb0) omfVar.i.get();
                    c8o.l(bxb0Var);
                    k7b k7bVar = (k7b) omfVar.j.get();
                    c8o.l(k7bVar);
                    ngh1 ngh1Var = (ngh1) omfVar.k.get();
                    c8o.l(ngh1Var);
                    jl21 jl21Var = (jl21) omfVar.l.get();
                    c8o.l(jl21Var);
                    objT5 = new mmf(g431VarH, str9, bfdVar, r630Var, vcd0Var, addVar, jed0Var, lzn0Var5, t6tVar, jyb0Var, bxb0Var, k7bVar, ngh1Var, jl21Var, u9c0VarQ, iac0Var);
                    x340Var9.s0(objT5);
                }
                mmf mmfVar = (mmf) objT5;
                boolean zG = x340Var9.g(list);
                Object objT6 = x340Var9.T();
                Object obj9 = objT6;
                if (zG || objT6 == m4cVar3) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj10 : list) {
                        if (!u890.j(((jwm) obj10).a.a, pmfVar.c)) {
                            arrayList.add(obj10);
                        }
                    }
                    x340Var9.s0(arrayList);
                    obj9 = arrayList;
                }
                List list2 = (List) obj9;
                boolean zG2 = x340Var9.g(list);
                Object objT7 = x340Var9.T();
                if (zG2 || objT7 == m4cVar3) {
                    for (Object obj11 : list) {
                        if (u890.j(((jwm) obj11).a.a, pmfVar.c)) {
                            obj6 = obj11;
                            jwmVar = (jwm) obj6;
                            if (jwmVar == null) {
                                objT7 = new jwm(14, w4i1.f);
                            } else {
                                objT7 = jwmVar;
                            }
                            x340Var9.s0(objT7);
                        }
                    }
                    jwmVar = (jwm) obj6;
                    if (jwmVar == null) {
                        objT7 = new jwm(14, w4i1.f);
                    } else {
                        objT7 = jwmVar;
                    }
                    x340Var9.s0(objT7);
                }
                cuo1.g(6, apo.r(-836120102, new hwd(goeVar, list2, (jwm) objT7, mmfVar, (byte) 8), x340Var9), x340Var9);
                return rih1Var;
            case 21:
                ((smf) obj7).c((goe) obj, (b0k) obj2, ((Number) obj3).intValue() & 14);
                return rih1Var;
            case 22:
                ((yd91) obj7).b.invoke((yyq) obj, (b0k) obj2, Integer.valueOf(((Number) obj3).intValue() & 14));
                return rih1Var;
            case 23:
                w4g w4gVar = (w4g) obj;
                v4g v4gVar = (v4g) obj2;
                tqw tqwVar8 = (tqw) obj3;
                br0 br0Var = (br0) obj7;
                if (v4gVar instanceof t4g) {
                    return rih1Var;
                }
                if (v4gVar instanceof u4g) {
                    y4g y4gVar = w4gVar.c;
                    if (y4gVar instanceof y4g) {
                        xf60 xf60Var = (xf60) br0Var.c;
                        y4g y4gVar2 = y4gVar;
                        cmt cmtVar = y4gVar2.a;
                        String str10 = y4gVar2.b;
                        String str11 = w4gVar.d;
                        Timestamp timestamp = w4gVar.e;
                        xf60Var.a(cmtVar, str10, new uf60(timestamp.q(), timestamp.p(), str11), tqwVar8 != null ? n3o1.y(tqwVar8) : null);
                        return rih1Var;
                    }
                    if (y4gVar instanceof z4g) {
                        ((bpb1) ((u6x) br0Var.d).b).m((Object) null, Boolean.TRUE);
                        return rih1Var;
                    }
                    if (y4gVar instanceof x4g) {
                        return rih1Var;
                    }
                    eg.o();
                } else {
                    eg.o();
                }
                return null;
            case 24:
                tqw tqwVar9 = (tqw) obj3;
                lzn0 lzn0Var6 = ((r9g) obj7).a;
                String str12 = ((q9g) obj).a;
                if (!((p9g) obj2).equals(p9g.a)) {
                    eg.o();
                    return null;
                }
                if (tqwVar9 == null) {
                    lzn0Var6.h("spotify:internal:regular-member-sub-account-details:video-settings:" + str12);
                    return rih1Var;
                }
                lzn0Var6.a("spotify:internal:regular-member-sub-account-details:video-settings:" + str12, n3o1.y(tqwVar9), (Bundle) null);
                return rih1Var;
            case 25:
                ubg ubgVar = (ubg) obj;
                int iIntValue5 = ((Number) obj3).intValue();
                m4c m4cVar4 = fkj0.X;
                x340 x340Var10 = (b0k) obj2;
                Context context = (Context) x340Var10.k(AndroidCompositionLocals_androidKt.b);
                sbg sbgVar = (sbg) obj7;
                boolean zI2 = x340Var10.i(sbgVar);
                Object objT8 = x340Var10.T();
                Object obj12 = objT8;
                if (zI2 || objT8 == m4cVar4) {
                    awe aweVar = new awe(sbgVar, (lnm) null, (byte) 5);
                    x340Var10.s0(aweVar);
                    obj12 = aweVar;
                }
                qxd0.t(rih1Var, x340Var10, (vu30) obj12);
                boolean zI3 = x340Var10.i(sbgVar) | x340Var10.i(context);
                Object objT9 = x340Var10.T();
                Object obj13 = objT9;
                if (zI3 || objT9 == m4cVar4) {
                    rbg rbgVar = new rbg(sbgVar, context, (byte) 0);
                    x340Var10.s0(rbgVar);
                    obj13 = rbgVar;
                }
                q3p1.b(0, 1, (Function0) obj13, x340Var10, false);
                ulc ulcVar = sbgVar.c;
                boolean zI4 = x340Var10.i(sbgVar) | x340Var10.i(context);
                Object objT10 = x340Var10.T();
                Object obj14 = objT10;
                if (zI4 || objT10 == m4cVar4) {
                    rbg rbgVar2 = new rbg(sbgVar, context, (byte) 1);
                    x340Var10.s0(rbgVar2);
                    obj14 = rbgVar2;
                }
                Function0 function0 = (Function0) obj14;
                boolean zI5 = x340Var10.i(sbgVar) | x340Var10.i(context);
                Object objT11 = x340Var10.T();
                Object obj15 = objT11;
                if (zI5 || objT11 == m4cVar4) {
                    i24 i24Var = new i24(sbgVar, context, (lnm) null, (byte) 17);
                    x340Var10.s0(i24Var);
                    obj15 = i24Var;
                }
                ulcVar.c(ubgVar, function0, (iu30) obj15, x340Var10, (iIntValue5 & 14) | 48);
                return rih1Var;
            case 26:
                x340 x340Var11 = (b0k) obj2;
                ((Number) obj3).intValue();
                tfg tfgVar = (tfg) obj7;
                if (tfgVar.getState().c) {
                    x340 x340Var12 = x340Var11;
                    fE = z5c.e(x340Var12, -1046470468, 2131165398, x340Var12, false);
                } else {
                    x340 x340Var13 = x340Var11;
                    fE = z5c.e(x340Var13, -1046391387, 2131165397, x340Var13, false);
                }
                nyx.a(2, (wux) null, apo.r(1739880809, new rz2(tfgVar, fE, b2), x340Var11), x340Var11, 3078, 6);
                return rih1Var;
            case 27:
                x340 x340Var14 = (b0k) obj2;
                ((Number) obj3).intValue();
                String strO0 = cwl1.o0(x340Var14, 2131960754);
                vfg vfgVar = (vfg) obj7;
                x340 x340Var15 = x340Var14;
                boolean zI6 = x340Var15.i(vfgVar);
                Object objT12 = x340Var15.T();
                if (zI6 || objT12 == fkj0.X) {
                    obj5 = objT12;
                    lwe lweVar = new lwe(vfgVar, (byte) 16);
                    x340Var15.s0(lweVar);
                    obj5 = lweVar;
                }
                obj5 = objT12;
                Function0 function1 = (Function0) obj5;
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                foo1.c(new gbx(new y50(strO0), function1), ldx.c, (qim0) null, (max) null, yla.s(x340Var15), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, rci.a, x340Var15, 0, 48, 2012);
                return rih1Var;
            case 28:
                return a(obj, obj2, obj3);
            default:
                gat gatVar = (iat) obj2;
                tqw tqwVar10 = (tqw) obj3;
                if (gatVar instanceof gat) {
                    qhg qhgVar = (qhg) obj7;
                    vvm1.v(qhgVar.b, qhgVar.a, gatVar.a, tqwVar10 != null ? n3o1.y(tqwVar10) : null);
                }
                return rih1Var;
        }
    }
}
