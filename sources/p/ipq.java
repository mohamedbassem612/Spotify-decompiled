package p;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.esperanto.esperantocosmos.CosmosCoroutineTransport;
import com.spotify.player.model.PlayOrigin;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableElementAtSingle;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ipq implements jly0 {
    public final /* synthetic */ byte a;
    public final byte b;
    public final Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ipq(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    public static /* bridge */ /* synthetic */ ip31 a(ipq ipqVar) {
        return (ip31) ipqVar.c;
    }

    private final Object b() {
        z9p z9pVar = (z9p) this.c;
        byte b = 16;
        byte b2 = this.b;
        switch (b2) {
            case 0:
                ud71 ud71Var = (ud71) z9pVar.j;
                yqg yqgVar = ud71Var.d;
                dy71 dy71Var = (dy71) ud71Var.s.createWebgateService(dy71.class, "android-fandomcollectibles-share");
                fns fnsVar = igu.a;
                b3s b3sVar = b3s.c;
                return new x371(dy71Var, yqgVar);
            case 1:
                ud71 ud71Var2 = (ud71) z9pVar.j;
                uu00 uu00Var = ud71Var2.x;
                wh71 wh71Var = ud71Var2.f;
                c8o.l(wh71Var);
                return new z4(new d4(uu00Var, wh71Var, (byte) 1));
            case 2:
                ud71 ud71Var3 = (ud71) z9pVar.j;
                wh71 wh71Var2 = ud71Var3.f;
                c8o.l(wh71Var2);
                q8n q8nVar = ud71Var3.L;
                uu00 uu00Var2 = ud71Var3.x;
                uvy uvyVar = ud71Var3.O;
                hre1 hre1Var = ud71Var3.P;
                boolean z = ud71Var3.Q;
                vr51 vr51Var = new vr51(((ud71) z9pVar.j).S, (byte) 5);
                Context context = ud71Var3.g;
                ol71 ol71Var = ud71Var3.f0;
                c8o.l(ol71Var);
                return new vq7(new z1(wh71Var2, r7r.D(), new wh41(uvyVar, new x2z(uu00Var2), hre1Var, z, (byte) 3), vr51Var, context, ol71Var, q8nVar, (byte) 2));
            case 3:
                ud71 ud71Var4 = (ud71) z9pVar.j;
                s6v0 s6v0Var = ud71Var4.k;
                wh71 wh71Var3 = ud71Var4.f;
                c8o.l(wh71Var3);
                return new zs7(new at7(s6v0Var, wh71Var3, ud71Var4.e, ud71Var4.g, new vr51(((ud71) z9pVar.j).S, (byte) 5), ud71Var4.J, ud71Var4.G, (byte) 0));
            case 4:
                k3i0 k3i0VarE = z9pVar.e();
                ud71 ud71Var5 = (ud71) z9pVar.j;
                wh71 wh71Var4 = ud71Var5.f;
                c8o.l(wh71Var4);
                Context context2 = ud71Var5.g;
                boolean z2 = ud71Var5.F;
                q8n q8nVar2 = ud71Var5.J;
                return new d0a(new qz9(ud71Var5.M, new dg90(k3i0VarE, (byte) 9), ud71Var5.u, r7r.D(), q8nVar2, z2, wh71Var4, context2));
            case 5:
                ud71 ud71Var6 = (ud71) z9pVar.j;
                Context context3 = ud71Var6.g;
                uu00 uu00Var3 = ud71Var6.x;
                bhf bhfVar = ud71Var6.u;
                wh71 wh71Var5 = ud71Var6.f;
                c8o.l(wh71Var5);
                q8n q8nVar3 = ud71Var6.J;
                return new sqa(new uqa(context3, ud71Var6.j, uu00Var3, bhfVar, wh71Var5, r7r.D(), new aru0(ud71Var6.m, new a0b((byte) 19), new dc31(context3, ud71Var6.l, (byte) 25)), q8nVar3, (byte) 0));
            case 6:
                ud71 ud71Var7 = (ud71) z9pVar.j;
                Context context4 = ud71Var7.g;
                uu00 uu00Var4 = ud71Var7.x;
                bhf bhfVar2 = ud71Var7.u;
                wh71 wh71Var6 = ud71Var7.f;
                c8o.l(wh71Var6);
                q8n q8nVar4 = ud71Var7.J;
                return new x6h(new uqa(context4, ud71Var7.j, uu00Var4, bhfVar2, wh71Var6, r7r.D(), new aru0(ud71Var7.m, new a0b((byte) 19), new dc31(context4, ud71Var7.l, (byte) 25)), q8nVar4, (byte) 1));
            case 7:
                ud71 ud71Var8 = (ud71) z9pVar.j;
                wh71 wh71Var7 = ud71Var8.f;
                c8o.l(wh71Var7);
                g2z g2zVar = ud71Var8.M;
                return new fgo(new ggh(new n4b((Object) g2zVar, (byte) 20), new ulc((byte) 3), ud71Var8.J, wh71Var7, (byte) 13));
            case 8:
                ud71 ud71Var9 = (ud71) z9pVar.j;
                Context context5 = ud71Var9.g;
                g871 g871Var = ud71Var9.i;
                iyc0 iyc0Var = ud71Var9.m;
                s6v0 s6v0Var2 = ud71Var9.k;
                me30 me30Var = ud71Var9.l;
                k3i0 k3i0VarE2 = z9pVar.e();
                zid zidVar = ud71Var9.n;
                lid lidVar = ud71Var9.o;
                lo71 lo71Var = ud71Var9.f69p;
                qwe1 qwe1Var = ud71Var9.e;
                xmu0 xmu0Var = ud71Var9.r;
                RetrofitMaker retrofitMaker = ud71Var9.s;
                zwz0 zwz0Var = ud71Var9.t;
                wh71 wh71Var8 = ud71Var9.f;
                c8o.l(wh71Var8);
                ol71 ol71Var2 = ud71Var9.f0;
                c8o.l(ol71Var2);
                boolean z3 = ud71Var9.F;
                q8n q8nVar5 = ud71Var9.J;
                g2z g2zVar2 = ud71Var9.M;
                bhf bhfVar3 = ud71Var9.u;
                i6b i6bVar = new i6b((Object) new tjq(context5, g871Var, iyc0Var, s6v0Var2, me30Var, k3i0VarE2, zidVar, lidVar, lo71Var, qwe1Var, xmu0Var, retrofitMaker, zwz0Var, wh71Var8, ol71Var2, z3, q8nVar5, g2zVar2, bhfVar3), (byte) 26);
                yjd yjdVar = new yjd((byte) 0);
                yjd yjdVar2 = new yjd((byte) 2);
                yjd yjdVar3 = new yjd((byte) 1);
                oey oeyVar = new oey(p7h.M(new mmr0[]{new mmr0(yjdVar, new oey(i6bVar.p(), (byte) 2)), new mmr0(yjdVar2, new oey(i6bVar.p(), (byte) 1)), new mmr0(yjdVar3, new oey(i6bVar.p(), (byte) 0))}), (byte) 3);
                yjd yjdVar4 = new yjd((byte) 0);
                yjd yjdVar5 = new yjd((byte) 1);
                yjd yjdVar6 = new yjd((byte) 2);
                cxy cxyVar = new cxy(new ic9(r7r.D(), lo71Var, (byte) 29), (byte) 1);
                ney neyVar = new ney(r7r.D(), z3, s6v0Var2, qwe1Var);
                return new zwy(new v3r(q8nVar5, oeyVar, new cxy(p7h.M(new mmr0[]{new mmr0(yjdVar4, cxyVar), new mmr0(yjdVar6, new mku0(r7r.D(), new aru0(iyc0Var, new a0b((byte) 19), new dc31(context5, me30Var, (byte) 25)))), new mmr0(yjdVar5, neyVar)}), (byte) 0), new eb80(k3i0VarE2, (byte) 10), new o4t(), new ekb((byte) 9), bhfVar3, new lhc((byte) 27), new t8r0(zwz0Var, g871Var), wh71Var8, ol71Var2, g2zVar2, (byte) 2));
            case 9:
                ud71 ud71Var10 = (ud71) z9pVar.j;
                Context context6 = ud71Var10.g;
                g871 g871Var2 = ud71Var10.i;
                k3i0 k3i0VarE3 = z9pVar.e();
                xmu0 xmu0Var2 = ud71Var10.r;
                RetrofitMaker retrofitMaker2 = ud71Var10.s;
                zwz0 zwz0Var2 = ud71Var10.t;
                wh71 wh71Var9 = ud71Var10.f;
                c8o.l(wh71Var9);
                return new i7n0(new qi1(ud71Var10.J, context6, new r961(new i2i1((kq71) retrofitMaker2.createWebgateService(kq71.class, "android-share-shareables-impl"), (byte) 10), new mhc((byte) 9), new wb00(xmu0Var2, (byte) 17), (byte) 8), r7r.D(), k3i0VarE3, new t8r0(zwz0Var2, g871Var2), wh71Var9, ud71Var10.M, (byte) 7));
            case 10:
                ud71 ud71Var11 = (ud71) z9pVar.j;
                Context context7 = ud71Var11.g;
                uu00 uu00Var5 = ud71Var11.x;
                xrc0 xrc0Var = ud71Var11.j;
                iyc0 iyc0Var2 = ud71Var11.m;
                me30 me30Var2 = ud71Var11.l;
                bhf bhfVar4 = ud71Var11.u;
                wh71 wh71Var10 = ud71Var11.f;
                c8o.l(wh71Var10);
                q8n q8nVar6 = ud71Var11.J;
                return new du30(new vd6(new lb(context7), bhfVar4, wh71Var10, r7r.D(), new aru0(iyc0Var2, new a0b((byte) 19), new dc31(context7, me30Var2, (byte) 25)), q8nVar6, context7, xrc0Var, uu00Var5, (byte) 5));
            case 11:
                ud71 ud71Var12 = (ud71) z9pVar.j;
                ykf0 ykf0Var = ud71Var12.v;
                t2j0 t2j0Var = ud71Var12.w;
                wh71 wh71Var11 = ud71Var12.f;
                c8o.l(wh71Var11);
                flw0 flw0Var = ud71Var12.N;
                c8o.l(flw0Var);
                return new znf0(new e4f0(new j7s(ykf0Var, t2j0Var, wh71Var11, flw0Var, ud71Var12.I, ud71Var12.c0), (byte) 10));
            case 12:
                ud71 ud71Var13 = (ud71) z9pVar.j;
                wh71 wh71Var12 = ud71Var13.f;
                c8o.l(wh71Var12);
                return new iq30(new djx(r7r.D(), wh71Var12, ud71Var13.J, (byte) 25));
            case 13:
                ud71 ud71Var14 = (ud71) z9pVar.j;
                Context context8 = ud71Var14.g;
                bjd bjdVarT = mid.t(ud71Var14.o);
                bhf bhfVar5 = ud71Var14.u;
                wh71 wh71Var13 = ud71Var14.f;
                c8o.l(wh71Var13);
                q8n q8nVar7 = ud71Var14.J;
                g2z g2zVar3 = ud71Var14.M;
                return new ghb1(new l690(context8, bjdVarT, bhfVar5, wh71Var13, r7r.D(), z9pVar.e(), new aru0(ud71Var14.m, new a0b((byte) 19), new dc31(context8, ud71Var14.l, (byte) 25)), q8nVar7, g2zVar3, new lb(context8), (byte) 5));
            case 14:
                ud71 ud71Var15 = (ud71) z9pVar.j;
                uu00 uu00Var6 = ud71Var15.x;
                dc31 dc31Var = new dc31(new x2z(uu00Var6), new u271(uu00Var6, (byte) 1), (byte) 24);
                Context context9 = ud71Var15.g;
                s6v0 s6v0Var3 = ud71Var15.k;
                ggv ggvVar = ud71Var15.S;
                vr51 vr51Var2 = new vr51(ggvVar, (byte) 5);
                bhf bhfVar6 = ud71Var15.u;
                wh71 wh71Var14 = ud71Var15.f;
                c8o.l(wh71Var14);
                lag1 lag1Var = ud71Var15.R;
                q8n q8nVar8 = ud71Var15.J;
                int i = ud71Var15.G;
                ol71 ol71Var3 = ud71Var15.f0;
                c8o.l(ol71Var3);
                return new x1e1(new b3e1(new esa1(r7r.D(), bhfVar6, new o0g1(i, s6v0Var3, ud71Var15.e, vr51Var2, context9, (byte) 15)), wh71Var14, lag1Var, q8nVar8, i, dc31Var, new xid((Object) context9, (Object) new vr51(ggvVar, (byte) 5), (byte) 13), ol71Var3, context9, vr51Var2));
            case 15:
                ud71 ud71Var16 = (ud71) z9pVar.j;
                luk lukVar = ud71Var16.b;
                wh71 wh71Var15 = ud71Var16.f;
                c8o.l(wh71Var15);
                gm31 gm31Var = ud71Var16.T;
                e4p e4pVar = ud71Var16.U;
                o771 o771Var = ud71Var16.q;
                g871 g871Var3 = ud71Var16.i;
                yqg yqgVar2 = ud71Var16.d;
                hyl0 hyl0Var = ud71Var16.e0;
                c8o.l(hyl0Var);
                return new kfm1(new p2j1(lukVar, wh71Var15, gm31Var, e4pVar, o771Var, g871Var3, yqgVar2, hyl0Var, ud71Var16.g0, ud71Var16.h));
            case 16:
                ud71 ud71Var17 = (ud71) z9pVar.j;
                wh71 wh71Var16 = ud71Var17.f;
                c8o.l(wh71Var16);
                q8n q8nVar9 = ud71Var17.L;
                zxa zxaVar = ud71Var17.a;
                bbb1 bbb1Var = ud71Var17.D;
                Context context10 = ud71Var17.g;
                g871 g871Var4 = ud71Var17.i;
                lag1 lag1Var2 = ud71Var17.R;
                u8v u8vVar = ud71Var17.C;
                RetrofitMaker retrofitMaker3 = ud71Var17.s;
                uu00 uu00Var7 = ud71Var17.x;
                uvy uvyVar2 = ud71Var17.O;
                hre1 hre1Var2 = ud71Var17.P;
                boolean z4 = ud71Var17.Q;
                vr51 vr51Var3 = new vr51(((ud71) z9pVar.j).S, (byte) 5);
                qns0 qns0Var = ud71Var17.X;
                ol71 ol71Var4 = ud71Var17.f0;
                c8o.l(ol71Var4);
                lbq lbqVar = new lbq(new sgj1(wh71Var16, q8nVar9, zxaVar, bbb1Var, context10, g871Var4, lag1Var2, u8vVar, retrofitMaker3, uu00Var7, uvyVar2, hre1Var2, z4, vr51Var3, qns0Var, ol71Var4));
                return new rgj1(new vd6(wh71Var16, r7r.D(), new wh41(uvyVar2, new x2z(uu00Var7), hre1Var2, z4, (byte) 3), d1j1.q((luq) ((jly0) lbqVar.c).get()), vr51Var3, new u271(uu00Var7, (byte) 0), context10, ol71Var4, q8nVar9, (byte) 10));
            case 17:
                ud71 ud71Var18 = (ud71) z9pVar.j;
                uu00 uu00Var8 = ud71Var18.x;
                dc31 dc31Var2 = new dc31(new x2z(uu00Var8), new u271(uu00Var8, (byte) 1), (byte) 24);
                s6v0 s6v0Var4 = ud71Var18.k;
                wh71 wh71Var17 = ud71Var18.f;
                c8o.l(wh71Var17);
                q8n q8nVar10 = ud71Var18.L;
                q8n q8nVar11 = ud71Var18.J;
                q8n q8nVar12 = ud71Var18.K;
                zxa zxaVar2 = ud71Var18.a;
                ggv ggvVar2 = ud71Var18.S;
                gw70 gw70Var = ud71Var18.c;
                bbb1 bbb1Var2 = ud71Var18.D;
                Context context11 = ud71Var18.g;
                g871 g871Var5 = ud71Var18.i;
                lag1 lag1Var3 = ud71Var18.R;
                vr51 vr51Var4 = new vr51(((ud71) z9pVar.j).S, (byte) 5);
                int i2 = ud71Var18.G;
                drj0 drj0Var = ud71Var18.E;
                Set set = ud71Var18.H;
                u8v u8vVar2 = ud71Var18.C;
                RetrofitMaker retrofitMaker4 = ud71Var18.s;
                t2j0 t2j0Var2 = ud71Var18.w;
                b8g1 b8g1Var = ud71Var18.z;
                hqc1 hqc1Var = ud71Var18.A;
                p771 p771Var = ud71Var18.B;
                yqg yqgVar3 = ud71Var18.d;
                qwe1 qwe1Var2 = ud71Var18.e;
                pqc1 pqc1Var = ud71Var18.V;
                boolean z5 = ud71Var18.W;
                qns0 qns0Var2 = ud71Var18.X;
                ol71 ol71Var5 = ud71Var18.f0;
                c8o.l(ol71Var5);
                lbq lbqVar2 = new lbq(new sgj1(dc31Var2, s6v0Var4, wh71Var17, q8nVar10, q8nVar11, q8nVar12, zxaVar2, ggvVar2, gw70Var, bbb1Var2, context11, g871Var5, lag1Var3, vr51Var4, i2, drj0Var, set, u8vVar2, retrofitMaker4, t2j0Var2, b8g1Var, hqc1Var, p771Var, yqgVar3, qwe1Var2, pqc1Var, z5, qns0Var2, ol71Var5), (byte) 0);
                gqg gqgVarD = r7r.D();
                Object obj = lbqVar2.c;
                vi11 vi11VarR = d1j1.r((luq) ((jly0) obj).get());
                ptf1 ptf1VarQ = d1j1.q((luq) ((jly0) obj).get());
                zog zogVar = new zog(z5, i2, q8nVar11, q8nVar10, new qo71(context11, b8g1Var, p771Var, q8nVar12, z5, pqc1Var, hqc1Var), new dmr(t2j0Var2), new ltf1(((luq) ((jly0) obj).get()).a.d, (byte) 12), yqgVar3, drj0Var);
                jij1 jij1Var = ((luq) ((jly0) obj).get()).a;
                u8v u8vVar3 = jij1Var.f;
                RetrofitMaker retrofitMaker5 = jij1Var.g;
                zrj1 zrj1Var = new zrj1(u8vVar3, new fna((smg) retrofitMaker5.createWebgateService(smg.class, "android-share-formats-common-video-impl"), (byte) 14), new ltf1(jij1Var.d, (byte) 12), (byte) 4);
                o0g1 o0g1Var = new o0g1(i2, s6v0Var4, qwe1Var2, vr51Var4, context11, (byte) 15);
                xid xidVar = new xid((Object) context11, (Object) new vr51(ggvVar2, (byte) 5), (byte) 13);
                ytw0 ytw0Var = jfv.b;
                return new h4k1(new t5k1(zogVar, jfv.h(fdg1.k0(i2, ngv.e)), z5, q8nVar10, zrj1Var, set, wh71Var17, ptf1VarQ, vi11VarR, dc31Var2, xidVar, ol71Var5, gqgVarD, o0g1Var, vr51Var4, context11));
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                ud71 ud71Var19 = (ud71) z9pVar.j;
                wh71 wh71Var18 = ud71Var19.f;
                c8o.l(wh71Var18);
                q8n q8nVar13 = ud71Var19.L;
                xrc0 xrc0Var2 = ud71Var19.j;
                iyc0 iyc0Var3 = ud71Var19.m;
                uu00 uu00Var9 = ud71Var19.x;
                return new u9y0(new z1(q8nVar13, wh71Var18, r7r.D(), ud71Var19.u, iyc0Var3, xrc0Var2, uu00Var9, (byte) 18));
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                ud71 ud71Var20 = (ud71) z9pVar.j;
                Context context12 = ud71Var20.g;
                bhf bhfVar7 = ud71Var20.u;
                wh71 wh71Var19 = ud71Var20.f;
                c8o.l(wh71Var19);
                xrc0 xrc0Var3 = ud71Var20.j;
                uu00 uu00Var10 = ud71Var20.x;
                gw70 gw70Var2 = ud71Var20.c;
                q8n q8nVar14 = ud71Var20.J;
                return new oby0(new qi1(xrc0Var3, uu00Var10, new m27(gw70Var2, q8nVar14), context12, bhfVar7, wh71Var19, r7r.D(), q8nVar14, (byte) 9));
            case 20:
                ud71 ud71Var21 = (ud71) z9pVar.j;
                wh71 wh71Var20 = ud71Var21.f;
                c8o.l(wh71Var20);
                xrc0 xrc0Var4 = ud71Var21.j;
                uu00 uu00Var11 = ud71Var21.x;
                gw70 gw70Var3 = ud71Var21.c;
                l041 l041Var = new l041(xrc0Var4, uu00Var11, new xaz0(gw70Var3, (byte) 16), new xpv0((byte) 18), new nju(), new ytw0((byte) 21), ud71Var21.d);
                fns fnsVar2 = igu.a;
                b3s b3sVar2 = b3s.c;
                return new sz31(new hf31(wh71Var20, new dc31(l041Var, new lz31(xrc0Var4, gw70Var3), (byte) 3), (byte) 11));
            case 21:
                ud71 ud71Var22 = (ud71) z9pVar.j;
                qke qkeVar = ud71Var22.Z;
                vke vkeVar = ud71Var22.a0;
                hyl0 hyl0Var2 = ud71Var22.e0;
                c8o.l(hyl0Var2);
                return new ble(new fta(qkeVar, vkeVar, hyl0Var2, ud71Var22.L, (byte) 25));
            case 22:
                hyl0 hyl0Var3 = ((ud71) z9pVar.j).e0;
                c8o.l(hyl0Var3);
                return new vyg(new fna(hyl0Var3, b));
            case 23:
                ud71 ud71Var23 = (ud71) z9pVar.j;
                return new kgf0(new w6e0(ud71Var23.L, ud71Var23.K, ud71Var23.b0, ud71Var23.d0, (byte) 10), ud71Var23.c0, ud71Var23.I);
            case 24:
                ud71 ud71Var24 = (ud71) z9pVar.j;
                r6i0 r6i0Var = ud71Var24.Y;
                f7i0 f7i0Var = ud71Var24.y;
                q8n q8nVar15 = ud71Var24.L;
                hyl0 hyl0Var4 = ud71Var24.e0;
                c8o.l(hyl0Var4);
                return new x7i0(new w6e0(r6i0Var, f7i0Var, q8nVar15, hyl0Var4, (byte) 21));
            case 25:
                hyl0 hyl0Var5 = ((ud71) z9pVar.j).e0;
                c8o.l(hyl0Var5);
                return new i9d1(new y281(hyl0Var5, (byte) 19));
            default:
                jah.e(b2);
                return null;
        }
    }

    private final Object c() {
        pug pugVar = (pug) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                ug71 ug71Var = (ug71) ((jly0) pugVar.b).get();
                ixp ixpVar = (ixp) iy81.a(new fyo((byte) 23)).get();
                c8o.m(ixpVar);
                return new ej71(ug71Var, ixpVar, (zpq) ((jly0) pugVar.v).get());
            case 1:
                ua71 ua71Var = (ua71) ((jly0) pugVar.a).get();
                return new ug71(new ela1(ua71Var.a, ua71Var.b, ua71Var.c), ua71Var.d);
            case 2:
                ua71 ua71Var2 = ((gj71) pugVar.h).a;
                c8o.m(ua71Var2);
                return ua71Var2;
            case 3:
                return new zpq(this);
            case 4:
                ya71 ya71Var = (ya71) ((jly0) new k2q(new n67((Map) ((jly0) pugVar.l).get())).c).get();
                c8o.m(ya71Var);
                return ya71Var;
            case 5:
                zxa zxaVarB = pugVar.b();
                fj71 fj71Var = (fj71) pugVar.u;
                kly0 kly0Var = fj71Var.D;
                kly0 kly0Var2 = fj71Var.z;
                kly0 kly0Var3 = fj71Var.b;
                luk lukVar = (luk) fj71Var.v.get();
                c8o.l(lukVar);
                ryj ryjVar = (ryj) pugVar.g;
                gw70 gw70VarB = ryjVar.b();
                c8o.l(gw70VarB);
                yqg yqgVar = (yqg) kly0Var3.get();
                c8o.l(yqgVar);
                qwe1 qwe1Var = (qwe1) fj71Var.o.get();
                c8o.l(qwe1Var);
                wh71 wh71Var = (wh71) ((jly0) pugVar.d).get();
                Context contextA = fj71Var.a();
                c8o.l(contextA);
                Activity activity = (Activity) fj71Var.d.get();
                c8o.l(activity);
                g871 g871VarQ = pugVar.q();
                xrc0 xrc0Var = (xrc0) fj71Var.H.get();
                c8o.l(xrc0Var);
                s6v0 s6v0Var = (s6v0) fj71Var.I.get();
                c8o.l(s6v0Var);
                me30 me30Var = (me30) fj71Var.J.get();
                c8o.l(me30Var);
                iyc0 iyc0Var = (iyc0) fj71Var.K.get();
                c8o.l(iyc0Var);
                zid zidVar = (zid) fj71Var.L.get();
                c8o.l(zidVar);
                lid lidVar = (lid) fj71Var.M.get();
                c8o.l(lidVar);
                lo71 lo71Var = (lo71) fj71Var.N.get();
                c8o.l(lo71Var);
                o771 o771VarP = pugVar.p();
                yx61.g((xpq) ((jly0) pugVar.c).get());
                xmu0 xmu0Var = new xmu0(yx61.k((xpq) ((jly0) pugVar.c).get()), pugVar.p(), (byte) 2);
                RetrofitMaker retrofitMakerC = fj71Var.c();
                c8o.l(retrofitMakerC);
                zwz0 zwz0Var = (zwz0) fj71Var.s.get();
                c8o.l(zwz0Var);
                bhf bhfVar = (bhf) fj71Var.O.get();
                c8o.l(bhfVar);
                ykf0 ykf0Var = (ykf0) fj71Var.P.get();
                c8o.l(ykf0Var);
                t2j0 t2j0Var = (t2j0) fj71Var.C.get();
                c8o.l(t2j0Var);
                uu00 uu00Var = (uu00) fj71Var.u.get();
                c8o.l(uu00Var);
                f7i0 f7i0Var = (f7i0) fj71Var.Q.get();
                c8o.l(f7i0Var);
                b8g1 b8g1Var = (b8g1) fj71Var.U.get();
                c8o.l(b8g1Var);
                hqc1 hqc1Var = (hqc1) fj71Var.V.get();
                c8o.l(hqc1Var);
                p771 p771Var = (p771) fj71Var.W.get();
                c8o.l(p771Var);
                u8v u8vVar = (u8v) fj71Var.X.get();
                c8o.l(u8vVar);
                bbb1 bbb1Var = (bbb1) fj71Var.Y.get();
                c8o.l(bbb1Var);
                drj0 drj0VarG = pugVar.e().g();
                boolean zI = pugVar.a().i();
                int iE = pugVar.a().e();
                Set setC = pugVar.c().c(u571.c);
                boolean zJ = pugVar.a().j();
                q8n q8nVarB = fj71Var.b();
                c8o.l(q8nVarB);
                q8n q8nVar = (q8n) kly0Var2.get();
                c8o.l(q8nVar);
                q8n q8nVar2 = (q8n) kly0Var.get();
                c8o.l(q8nVar2);
                q8n q8nVar3 = (q8n) kly0Var2.get();
                c8o.l(q8nVar3);
                q8n q8nVar4 = (q8n) kly0Var.get();
                c8o.l(q8nVar4);
                yqg yqgVar2 = (yqg) kly0Var3.get();
                c8o.l(yqgVar2);
                kma kmaVar = (kma) fj71Var.r.get();
                c8o.l(kmaVar);
                woa woaVar = (woa) fj71Var.p.get();
                c8o.l(woaVar);
                gw70 gw70VarB2 = ryjVar.b();
                c8o.l(gw70VarB2);
                g2z g2zVarW = yx61.w(new mzr0(q8nVar3, q8nVar4, yqgVar2, kmaVar, woaVar, gw70VarB2, ((cyp) ((jly0) pugVar.e).get()).a()));
                flw0 flw0Var = (flw0) ((jly0) pugVar.f).get();
                uvy uvyVar = (uvy) fj71Var.h0.get();
                c8o.l(uvyVar);
                hre1 hre1Var = (hre1) fj71Var.j0.get();
                c8o.l(hre1Var);
                boolean zBooleanValue = ((Boolean) fj71Var.k0.get()).booleanValue();
                lag1 lag1Var = (lag1) fj71Var.l0.get();
                c8o.l(lag1Var);
                ggv ggvVar = (ggv) fj71Var.m0.get();
                c8o.l(ggvVar);
                gm31 gm31Var = (gm31) fj71Var.n0.get();
                c8o.l(gm31Var);
                e4p e4pVar = (e4p) fj71Var.o0.get();
                c8o.l(e4pVar);
                pqc1 pqc1Var = (pqc1) fj71Var.r0.get();
                c8o.l(pqc1Var);
                boolean zH = pugVar.a().h();
                qns0 qns0Var = (qns0) fj71Var.v0.get();
                c8o.l(qns0Var);
                r6i0 r6i0Var = (r6i0) fj71Var.R.get();
                c8o.l(r6i0Var);
                qke qkeVar = (qke) fj71Var.S.get();
                c8o.l(qkeVar);
                vke vkeVar = (vke) fj71Var.T.get();
                c8o.l(vkeVar);
                ekb ekbVar = new ekb((byte) 15);
                boolean zBooleanValue2 = ((Boolean) fj71Var.s0.get()).booleanValue();
                b9y b9yVar = (b9y) fj71Var.t0.get();
                c8o.l(b9yVar);
                z9p z9pVar = new z9p(new ud71(zxaVarB, lukVar, gw70VarB, yqgVar, qwe1Var, wh71Var, contextA, activity, g871VarQ, xrc0Var, s6v0Var, me30Var, iyc0Var, zidVar, lidVar, lo71Var, o771VarP, xmu0Var, retrofitMakerC, zwz0Var, bhfVar, ykf0Var, t2j0Var, uu00Var, f7i0Var, b8g1Var, hqc1Var, p771Var, u8vVar, bbb1Var, drj0VarG, zI, iE, setC, zJ, q8nVarB, q8nVar, q8nVar2, g2zVarW, flw0Var, uvyVar, hre1Var, zBooleanValue, lag1Var, ggvVar, gm31Var, e4pVar, pqc1Var, zH, qns0Var, r6i0Var, qkeVar, vkeVar, ekbVar, zBooleanValue2, b9yVar, (hyl0) ((jly0) pugVar.j).get(), (ol71) ((jly0) pugVar.k).get(), u1n0.z((q7r0) pugVar.t)));
                cwq cwqVar = new cwq(26);
                cwqVar.b(x371.class, (ipq) z9pVar.k);
                cwqVar.b(z4.class, (ipq) z9pVar.a);
                cwqVar.b(vq7.class, (ipq) z9pVar.b);
                cwqVar.b(zs7.class, (ipq) z9pVar.c);
                cwqVar.b(d0a.class, (ipq) z9pVar.d);
                cwqVar.b(sqa.class, (ipq) z9pVar.e);
                cwqVar.b(x6h.class, (ipq) z9pVar.f);
                cwqVar.b(fgo.class, (ipq) z9pVar.g);
                cwqVar.b(zwy.class, (ipq) z9pVar.h);
                cwqVar.b(i7n0.class, (ipq) z9pVar.i);
                cwqVar.b(du30.class, (ipq) z9pVar.l);
                cwqVar.b(ynf0.class, (ipq) z9pVar.m);
                cwqVar.b(iq30.class, (ipq) z9pVar.n);
                cwqVar.b(ghb1.class, (ipq) z9pVar.o);
                cwqVar.b(x1e1.class, (ipq) z9pVar.f87p);
                cwqVar.b(kfm1.class, (ipq) z9pVar.q);
                cwqVar.b(rgj1.class, (ipq) z9pVar.r);
                cwqVar.b(h4k1.class, (ipq) z9pVar.s);
                cwqVar.b(u9y0.class, (ipq) z9pVar.t);
                cwqVar.b(oby0.class, (ipq) z9pVar.u);
                cwqVar.b(sz31.class, (ipq) z9pVar.v);
                cwqVar.b(ble.class, (ipq) z9pVar.w);
                cwqVar.b(vyg.class, (ipq) z9pVar.x);
                cwqVar.b(kgf0.class, (ipq) z9pVar.y);
                cwqVar.b(x7i0.class, (ipq) z9pVar.z);
                cwqVar.b(i9d1.class, (ipq) z9pVar.A);
                LinkedHashMap linkedHashMap = cwqVar.a;
                Map mapUnmodifiableMap = linkedHashMap.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(linkedHashMap);
                c8o.m(mapUnmodifiableMap);
                return mapUnmodifiableMap;
            case 6:
                fj71 fj71Var2 = (fj71) pugVar.u;
                Context contextA2 = fj71Var2.a();
                c8o.l(contextA2);
                Context contextA3 = fj71Var2.a();
                c8o.l(contextA3);
                Context applicationContext = contextA3.getApplicationContext();
                g420 g420Var = (g420) fj71Var2.h.get();
                c8o.l(g420Var);
                ajg ajgVar = (ajg) fj71Var2.u0.get();
                c8o.l(ajgVar);
                cxc cxcVar = (cxc) fj71Var2.p0.get();
                c8o.l(cxcVar);
                yqg yqgVar3 = (yqg) fj71Var2.b.get();
                c8o.l(yqgVar3);
                q8n q8nVarB2 = fj71Var2.b();
                c8o.l(q8nVarB2);
                return new xpq(new mzr0(contextA2, applicationContext, g420Var, ajgVar, cxcVar, yqgVar3, q8nVarB2));
            case 7:
                q8n q8nVar5 = (q8n) ((fj71) pugVar.u).D.get();
                c8o.l(q8nVar5);
                return new wh71(q8nVar5);
            case 8:
                t8u0 t8u0Var = (t8u0) ((fj71) pugVar.u).Z.get();
                c8o.l(t8u0Var);
                return kmq0.x((q7r0) pugVar.t, t8u0Var);
            case 9:
                return new flw0();
            case 10:
                return new hyl0(((xxl0) ((jly0) pugVar.i).get()).b());
            case 11:
                return new xxl0((String) null);
            case 12:
                boolean zM = pugVar.a().m();
                hhp0 hhp0Var = hhp0.a;
                return new ol71(zM);
            case 13:
                smc0 smc0VarN = pugVar.n();
                new yjq(pugVar.r());
                smc0 smc0VarD = pugVar.d();
                pugVar.r();
                smc0 smc0VarN2 = pugVar.n();
                new yjq(pugVar.r());
                ArrayList<sl71> arrayListN0 = o7h.N0(pugVar.d(), o7h.N0(z6x.a, smc0VarN2));
                int iS = zno1.s(q7h.U(arrayListN0, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS);
                for (sl71 sl71Var : arrayListN0) {
                    linkedHashMap2.put(rc11.a.b(sl71Var.a.getClass()), sl71Var.a);
                }
                return new qqq(new dzp0(smc0VarN, smc0VarD, linkedHashMap2, (byte) 11));
            case 14:
                return new aqq(this);
            case 15:
                a1r0 a1r0Var = (a1r0) ((fj71) pugVar.u).t.get();
                c8o.l(a1r0Var);
                return new kjz(a1r0Var);
            case 16:
                return new bqq(this);
            case 17:
                return new cqq();
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return (ol71) ((jly0) pugVar.k).get();
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object d() {
        hqq hqqVar = (hqq) this.c;
        byte b = 7;
        byte b2 = this.b;
        switch (b2) {
            case 0:
                ipq ipqVar = hqqVar.c;
                l481 l481Var = hqqVar.a;
                boolean zM = ((gi4) ipqVar.get()).m();
                etq0 etq0Var = (etq0) hqqVar.p.get();
                ioc iocVar = (ioc) hqqVar.q.get();
                iyc0 iyc0Var = (iyc0) l481Var.y0.get();
                c8o.l(iyc0Var);
                svh0 svh0Var = new svh0((Bundle) hqqVar.d.get(), iocVar, (rob) hqqVar.s.get(), etq0Var, hqqVar.b, iyc0Var, hqqVar.f());
                r1n0 r1n0Var = (r1n0) l481Var.f.get();
                c8o.l(r1n0Var);
                i1n0 i1n0Var = (i1n0) l481Var.g.get();
                c8o.l(i1n0Var);
                mto mtoVar = new mto(svh0Var, r1n0Var, i1n0Var, hqqVar.b, (fqq) hqqVar.u.get(), hqqVar.e());
                dtq0 dtq0Var = (dtq0) hqqVar.L.get();
                r1n0 r1n0Var2 = (r1n0) l481Var.f.get();
                c8o.l(r1n0Var2);
                i1n0 i1n0Var2 = (i1n0) l481Var.g.get();
                c8o.l(i1n0Var2);
                return zM ? new mto(dtq0Var, r1n0Var2, i1n0Var2, hqqVar.b, (fqq) hqqVar.u.get(), hqqVar.e()) : mtoVar;
            case 1:
                luk lukVarB = hqqVar.a.b();
                c8o.l(lukVarB);
                return new gi4(lukVarB);
            case 2:
                hqqVar.getClass();
                l481 l481Var2 = hqqVar.a;
                luk lukVarB2 = l481Var2.b();
                c8o.l(lukVarB2);
                boolean zE = new kh4(false, false, true, false, false, false, true, false, false, false, false, false, false, false, lukVarB2).e();
                qfs qfsVar = (qfs) hqqVar.g.get();
                xtc xtcVar = (xtc) l481Var2.q.get();
                c8o.l(xtcVar);
                rfs rfsVar = (rfs) hqqVar.o.get();
                String strF = hqqVar.f();
                t881 t881VarL = new m980((byte) 7, ((Boolean) l481Var2.f37p.get()).booleanValue()).l();
                e481 e481Var = new e481(new m980((byte) 7, ((Boolean) l481Var2.f37p.get()).booleanValue()).l(), (nia1) null, (nqz0) null, 262137);
                n8z n8zVar = new n8z(0);
                h620 h620Var = (p620) qfsVar.e.h();
                if (h620Var == null) {
                    h620Var = h620.b;
                }
                xfa1 xfa1Var = (xfa1) qfsVar.g.h();
                if (xfa1Var == null) {
                    xfa1Var = xfa1.a;
                }
                w8v0 w8v0Var = new w8v0(h620Var, xfa1Var, n8zVar);
                r7q r7qVar = xtcVar.b.a;
                teq teqVar = r7qVar.d;
                ydq ydqVar = (ydq) teqVar.e3.get();
                daq daqVar = r7qVar.b;
                return new ntc(xtcVar.a, new cdh(w8v0Var, rfsVar, strF, t881VarL, e481Var, zE, ydqVar, (Scheduler) daqVar.A2.get(), (o241) daqVar.u4.get(), (fuw0) teqVar.g3.get(), (RxRouter) daqVar.G1.get()));
            case 3:
                jly0 jly0Var = hqqVar.e;
                l481 l481Var3 = hqqVar.a;
                String str = (String) jly0Var.get();
                x881 x881Var = (x881) l481Var3.j.get();
                c8o.l(x881Var);
                rps rpsVarA = x881Var.a(str);
                String str2 = (String) hqqVar.e.get();
                w881 w881Var = (w881) l481Var3.k.get();
                c8o.l(w881Var);
                y441 y441VarA = w881Var.a.a(str2);
                nfa0 nfa0Var = (nfa0) y441VarA.b;
                c8o.l(nfa0Var);
                Context context = (Context) y441VarA.a;
                c8o.l(context);
                String str3 = (String) y441VarA.d;
                c8o.l(str3);
                gma1 gma1Var = (gma1) y441VarA.c;
                c8o.l(gma1Var);
                mps mpsVar = new mps(nfa0Var, gma1Var.a().b(context, str3));
                p241 p241Var = (o241) l481Var3.o.get();
                c8o.l(p241Var);
                return new qfs(rpsVarA, mpsVar, ((Boolean) p241Var.a.map(ud20.b1).blockingFirst()).booleanValue(), hqqVar.f(), (vf20) hqqVar.f.get());
            case 4:
                String string = ((Bundle) hqqVar.d.get()).getString("username");
                string.getClass();
                return string;
            case 5:
                return sd30.p(hqqVar.b);
            case 6:
                return new vf20((Bundle) hqqVar.d.get());
            case 7:
                return new rfs((lik1) hqqVar.h.get(), new tzo((byte) 13), (pfs) hqqVar.i.get(), (sfs) hqqVar.m.get(), (eqo) hqqVar.j.get(), (qhe0) hqqVar.n.get());
            case 8:
                return d8.c(hqqVar.b);
            case 9:
                return new pfs((lik1) hqqVar.h.get(), new tzo((byte) 13));
            case 10:
                return new sfs((n6r0) hqqVar.l.get(), (lik1) hqqVar.h.get(), hqqVar.g());
            case 11:
                return kmq0.p((o6r0) hqqVar.k.get());
            case 12:
                return new mae0((eqo) hqqVar.j.get());
            case 13:
                return new eqo();
            case 14:
                c2r0 c2r0Var = (c2r0) hqqVar.a.f1.get();
                c8o.l(c2r0Var);
                return c2r0Var.b(((o6r0) hqqVar.k.get()).e(), nik1.X.b(hqqVar.f()).a());
            case 15:
                s45 s45Var = (zle1) hqqVar.a.t0.get();
                c8o.l(s45Var);
                return new joc(s45Var.a("cwp_page_load"), s45Var, UUID.randomUUID().toString(), 1, hqqVar.b);
            case 16:
                f1n0 f1n0Var = (f1n0) hqqVar.a.x.get();
                c8o.l(f1n0Var);
                return new rob(f1n0Var, (Intent) hqqVar.r.get(), hqqVar.b);
            case 17:
                gj5 gj5Var = (gj5) hqqVar.a.t.get();
                c8o.l(gj5Var);
                return gj5Var.getIntent();
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new fqq(this);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                i8h1 i8h1Var = (i8h1) hqqVar.a.v.get();
                c8o.l(i8h1Var);
                return i8h1Var;
            case 20:
                l481 l481Var4 = hqqVar.a;
                l481 l481Var5 = hqqVar.a;
                yix0 yix0Var = (yix0) l481Var4.h.get();
                c8o.l(yix0Var);
                n6r0 n6r0Var = (n6r0) hqqVar.l.get();
                k481 k481Var = hqqVar.b;
                c8o.l(l481Var5.d());
                String strF2 = hqqVar.f();
                luk lukVarB3 = l481Var5.b();
                c8o.l(lukVarB3);
                jy4 jy4Var = new jy4(lukVarB3);
                eqs eqsVar = (eqs) hqqVar.v.get();
                c8o.l(l481Var5.c());
                yix0Var.a(n6r0Var);
                k481Var.g0();
                cto1.q(k481Var);
                return new m591(jy4Var.d(), eqsVar, strF2);
            case 21:
                CallbackRouter callbackRouter = (CallbackRouter) hqqVar.a.e1.get();
                c8o.l(callbackRouter);
                return new eqs(new z3u0(new CosmosCoroutineTransport(new q7v0(callbackRouter, (byte) 4))));
            case 22:
                hqqVar.f();
                jjm jjmVar = new jjm((i8h1) hqqVar.t.get(), (pfs) hqqVar.i.get());
                new ArrayList(8);
                z5g1 z5g1Var = new z5g1((i8h1) hqqVar.t.get(), (pfs) hqqVar.i.get());
                String str4 = ((lik1) hqqVar.h.get()).a;
                r6h1 r6h1Var = r6h1.c;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-locked-audiobook";
                x6h1VarI.f = "1.0.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.d = str4;
                x6h1VarI.a();
                hqqVar.f();
                return new f4v0(jjmVar, z5g1Var);
            case 23:
                l1q l1qVar = (l1q) hqqVar.a.x1.get();
                c8o.l(l1qVar);
                return l1qVar;
            case 24:
                uu00 uu00Var = (uu00) hqqVar.a.W0.get();
                c8o.l(uu00Var);
                l481 l481Var6 = hqqVar.a;
                kh5 kh5Var = (kh5) l481Var6.W.get();
                c8o.l(kh5Var);
                luk lukVarB4 = l481Var6.b();
                c8o.l(lukVarB4);
                ye90 ye90Var = new ye90(kh5Var, new co4(lukVarB4), (byte) 17);
                t2j0 t2j0Var = (t2j0) l481Var6.c0.get();
                c8o.l(t2j0Var);
                return new x32(uu00Var, new x390(ye90Var, new rdo(t2j0Var), (byte) 22));
            case 25:
                lzn0 lzn0VarD = hqqVar.a.d();
                c8o.l(lzn0VarD);
                i8h1 i8h1Var2 = (i8h1) hqqVar.t.get();
                pfs pfsVar = (pfs) hqqVar.i.get();
                return new orn0(lzn0VarD, new j2e0(i8h1Var2, new gfl0(((n6r0) hqqVar.l.get()).path(), pfsVar.a().b()), (byte) 16), hqqVar.f(), (byte) 0);
            case 26:
                return Boolean.valueOf(((Bundle) hqqVar.d.get()).getBoolean("isNewFragmentInstance", true));
            case 27:
                return new s1p(this, b);
            case 28:
                return new t1p(this, (byte) 6);
            case 29:
                return new pep(this, (byte) 1);
            case 30:
                t8u0 t8u0Var = (t8u0) hqqVar.a.A.get();
                c8o.l(t8u0Var);
                return t8u0Var.a(((zf30) hqqVar.b).s1);
            case 31:
                b2r0 b2r0Var = (b2r0) hqqVar.G.get();
                return new l8h1(b2r0Var, b2r0Var, b2r0Var);
            case 32:
                return (qhe0) hqqVar.n.get();
            case 33:
                hto htoVar = (hto) hqqVar.a.c1.get();
                c8o.l(htoVar);
                return hto.b(htoVar, (mae0) hqqVar.k.get());
            case 34:
                rfs rfsVar2 = (rfs) hqqVar.o.get();
                String strF3 = hqqVar.f();
                gqq gqqVar = (gqq) hqqVar.K.get();
                ioc iocVar2 = (ioc) hqqVar.q.get();
                return new dtq0(new r8v0(gqqVar, rfsVar2, strF3), (tjf0) null, new v3v0(1, (rob) hqqVar.s.get(), rob.class, "handle", "handle(Ljava/lang/Throwable;)Z", 0, (byte) 4), iocVar2, new dp5(iocVar2.b(), (byte) 23), 10);
            case 35:
                return new gqq(this);
            case 36:
                return new f210((rzq) hqqVar.I.get());
            case 37:
                ipq ipqVar2 = hqqVar.t;
                ipq ipqVar3 = hqqVar.l;
                ipq ipqVar4 = hqqVar.h;
                jly0 jly0Var2 = hqqVar.g;
                iga1 iga1Var = new iga1();
                iga1Var.a = ipqVar2;
                iga1Var.b = ipqVar3;
                iga1Var.c = ipqVar4;
                iga1Var.d = jly0Var2;
                return iga1Var;
            case 38:
                return (qhe0) hqqVar.n.get();
            default:
                jah.e(b2);
                return null;
        }
    }

    private final Object e() {
        goq goqVar = (goq) this.c;
        byte b = this.b;
        if (b == 0) {
            return new mir0(((b2r0) ((jly0) goqVar.b).get()).a());
        }
        if (b == 1) {
            c2r0 c2r0Var = (c2r0) ((lk81) goqVar.g).h.get();
            c8o.l(c2r0Var);
            kk81 kk81Var = (kk81) goqVar.h;
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            return c2r0Var.e(kk81Var, yon1.G1("CHILD_LED_SIGNUP_REQUEST_PARENTAL_CONSENT", "child-led-signup/request-parental-consent", 342, "child-led-signup"), nik1.a7.a());
        }
        if (b == 2) {
            return new mk81((b2r0) ((jly0) goqVar.b).get(), (f7l0) ((jly0) goqVar.d).get(), (d7l0) ((jly0) goqVar.e).get());
        }
        if (b == 3) {
            r6h1 r6h1Var = r6h1.c;
            return new f7l0();
        }
        if (b == 4) {
            return new d7l0(((f7l0) ((jly0) goqVar.d).get()).b());
        }
        jah.e(b);
        return null;
    }

    private final Object f() {
        h72 h72Var = (h72) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                c8o.l((Activity) ((gq81) h72Var.b).b.get());
                eyd1 eyd1Var = new eyd1();
                return eyd1Var;
            case 1:
                return new kqq(this);
            case 2:
                return (qhe0) ((jly0) h72Var.e).get();
            case 3:
                c2r0 c2r0Var = (c2r0) ((gq81) h72Var.b).n.get();
                c8o.l(c2r0Var);
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                return c2r0Var.b(yon1.m5(), (qir0) null);
            case 4:
                ohv0 ohv0Var = (ohv0) ((gq81) h72Var.b).h.get();
                c8o.l(ohv0Var);
                return new d7r0(ohv0Var, (wnh1) ((jly0) h72Var.g).get());
            case 5:
                return (qhe0) ((jly0) h72Var.e).get();
            case 6:
                c2r0 c2r0Var2 = (c2r0) ((gq81) h72Var.b).n.get();
                c8o.l(c2r0Var2);
                AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                return c2r0Var2.d(yon1.G1("SIGNUP_AGECONFIRMATION", "signup/ageconfirmation", 1884, "signup"), (qir0) null);
            case 7:
                return new mir0(((qhe0) ((jly0) h72Var.e).get()).a());
            case 8:
                return (qhe0) ((jly0) h72Var.e).get();
            case 9:
                r6h1 r6h1Var = r6h1.c;
                return new vzl0();
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object g() {
        ip31 ip31Var = (ip31) this.c;
        z0q z0qVar = (z0q) ip31Var.c;
        byte b = this.b;
        if (b == 0) {
            return new rqq(this);
        }
        if (b == 1) {
            yx11 yx11Var = new yx11((il91) ip31Var.b);
            sqq sqqVar = (sqq) ((jly0) ip31Var.d).get();
            kt91 kt91Var = (kt91) z0qVar.a.f8.get();
            c8o.l(kt91Var);
            return new ri91(yx11Var, sqqVar, new yx11(kt91Var), (tqq) ((jly0) ip31Var.e).get(), new yx11(z0qVar.d()));
        }
        if (b == 2) {
            return new sqq(this);
        }
        if (b == 3) {
            return new tqq();
        }
        if (b == 4) {
            return new bj91((uqq) ((jly0) ip31Var.g).get());
        }
        if (b == 5) {
            return new uqq(this);
        }
        jah.e(b);
        return null;
    }

    private final Object h() {
        gex0 gex0Var = gex0.N0;
        f0a f0aVar = (f0a) this.c;
        lnm lnmVar = null;
        byte b = this.b;
        switch (b) {
            case 0:
                z0q z0qVar = (z0q) f0aVar.b;
                z0q z0qVar2 = (z0q) f0aVar.b;
                jo91 jo91Var = (jo91) z0qVar.a.r7.get();
                c8o.l(jo91Var);
                ynb0 ynb0VarA = xqu.a((ipq) f0aVar.O0);
                ynb0 ynb0VarA2 = xqu.a((ipq) f0aVar.P0);
                jj91 jj91Var = (jj91) ((jly0) f0aVar.N0).get();
                Scheduler schedulerB = z0qVar2.b();
                c8o.l(schedulerB);
                Scheduler schedulerA = z0qVar2.a();
                c8o.l(schedulerA);
                Scheduler scheduler = (Scheduler) z0qVar2.a.z1.get();
                c8o.l(scheduler);
                return new il91(jo91Var, ynb0VarA, ynb0VarA2, jj91Var, schedulerB, schedulerA, scheduler, new nn61((byte) 27));
            case 1:
                jly0 jly0Var = (jly0) f0aVar.c;
                z0q z0qVar3 = (z0q) f0aVar.b;
                yx11 yx11Var = new yx11((pf81) jly0Var.get(), (byte) 6);
                daq daqVar = z0qVar3.a;
                a201 a201Var = new a201(((o241) daqVar.u4.get()).a.distinctUntilChanged().map(gex0Var));
                hn91 hn91Var = (hn91) daqVar.C7.get();
                c8o.l(hn91Var);
                mf81 mf81Var = (mf81) ((jly0) f0aVar.h).get();
                soc0 soc0Var = (soc0) ((jly0) f0aVar.Z).get();
                pf81 pf81Var = (pf81) ((jly0) f0aVar.c).get();
                agc0 agc0Var = (agc0) daqVar.B7.get();
                c8o.l(agc0Var);
                fip0 fip0Var = new fip0(a201Var, hn91Var, mf81Var, soc0Var, pf81Var, new q7j0(agc0Var));
                iyc0 iyc0Var = (iyc0) z0qVar3.a.g5.get();
                c8o.l(iyc0Var);
                ax8 ax8Var = new ax8(iyc0Var);
                yx11 yx11Var2 = new yx11(new n801((ujm) z0qVar3.a.x7.get(), (byte) 27));
                ip91 ip91Var = (ip91) z0qVar3.a.g8.get();
                c8o.l(ip91Var);
                yx11 yx11Var3 = new yx11(ip91Var);
                co91 co91Var = (co91) z0qVar3.a.ma.get();
                cp81 cp81Var = new cp81(co91Var.a.a(co91Var.b, co91Var.c));
                yqg yqgVar = (yqg) z0qVar3.a.J1.get();
                c8o.l(yqgVar);
                yx11 yx11Var4 = new yx11(yqgVar, (byte) 8);
                yqg yqgVar2 = (yqg) z0qVar3.a.J1.get();
                c8o.l(yqgVar2);
                Scheduler schedulerA2 = z0qVar3.a();
                c8o.l(schedulerA2);
                yx11 yx11Var5 = new yx11(yqgVar2, schedulerA2);
                Scheduler schedulerA3 = z0qVar3.a();
                c8o.l(schedulerA3);
                yx11 yx11Var6 = new yx11(schedulerA3);
                tr41 tr41Var = new tr41((jj91) ((jly0) f0aVar.N0).get(), (byte) 16);
                tr41 tr41Var2 = new tr41((jj91) ((jly0) f0aVar.N0).get(), (byte) 17);
                tr41 tr41Var3 = new tr41((jj91) ((jly0) f0aVar.N0).get(), (byte) 18);
                tr41 tr41Var4 = new tr41((jj91) ((jly0) f0aVar.N0).get(), (byte) 21);
                io91 io91VarC = z0qVar3.c();
                c8o.l(io91VarC);
                bk1 bk1Var = new bk1((byte) 22, z0qVar3.e(), io91VarC);
                io91 io91VarC2 = z0qVar3.c();
                c8o.l(io91VarC2);
                bk1 bk1Var2 = new bk1((byte) 23, z0qVar3.e(), io91VarC2);
                daq daqVar2 = z0qVar3.a;
                return new dk91(yx11Var, fip0Var, ax8Var, yx11Var2, yx11Var3, cp81Var, yx11Var4, yx11Var5, yx11Var6, tr41Var, tr41Var2, tr41Var3, tr41Var4, bk1Var, bk1Var2, new rwa0(new ke71((agc0) daqVar2.B7.get(), (t2j0) daqVar2.f2.get(), (byte) 25)));
            case 2:
                z0q z0qVar4 = (z0q) f0aVar.b;
                z0q z0qVar5 = (z0q) f0aVar.b;
                c8o.l((jo91) z0qVar4.a.r7.get());
                inm inmVar = (inm) z0qVar5.a.Zt.get();
                c8o.l(inmVar);
                io91 io91VarC3 = z0qVar5.c();
                c8o.l(io91VarC3);
                p4u0 p4u0Var = (p4u0) z0qVar5.a.gt.get();
                c8o.l(p4u0Var);
                return new pf81(inmVar, io91VarC3, p4u0Var, z0qVar5.e());
            case 3:
                return new mf81(xqu.a((ipq) f0aVar.d), xqu.a((ipq) f0aVar.e), xqu.a((ipq) f0aVar.f), xqu.a((ipq) f0aVar.g));
            case 4:
                jo91 jo91Var2 = (jo91) ((z0q) f0aVar.b).a.r7.get();
                c8o.l(jo91Var2);
                return new ni10(jo91Var2);
            case 5:
                return new lvs0((byte) 0);
            case 6:
                return new lvs0((byte) 1);
            case 7:
                return new ni10(((o241) ((z0q) f0aVar.b).a.u4.get()).a.distinctUntilChanged().map(gex0Var));
            case 8:
                return new soc0(xqu.a((ipq) f0aVar.i), xqu.a((ipq) f0aVar.t), xqu.a((ipq) f0aVar.X), xqu.a((ipq) f0aVar.Y));
            case 9:
                z0q z0qVar6 = (z0q) f0aVar.b;
                z0q z0qVar7 = (z0q) f0aVar.b;
                jo91 jo91Var3 = (jo91) z0qVar6.a.r7.get();
                c8o.l(jo91Var3);
                xrc0 xrc0Var = (xrc0) z0qVar7.a.f5.get();
                c8o.l(xrc0Var);
                me30 me30Var = (me30) z0qVar7.a.w7.get();
                c8o.l(me30Var);
                return new v2q0(jo91Var3, xrc0Var, me30Var);
            case 10:
                xrc0 xrc0Var2 = (xrc0) ((z0q) f0aVar.b).a.f5.get();
                c8o.l(xrc0Var2);
                return new ci10(xrc0Var2, (byte) 1);
            case 11:
                xrc0 xrc0Var3 = (xrc0) ((z0q) f0aVar.b).a.f5.get();
                c8o.l(xrc0Var3);
                return new ci10(xrc0Var3, (byte) 2);
            case 12:
                xrc0 xrc0Var4 = (xrc0) ((z0q) f0aVar.b).a.f5.get();
                c8o.l(xrc0Var4);
                return new ci10(xrc0Var4, (byte) 0);
            case 13:
                return new jj91();
            case 14:
                z0q z0qVar8 = (z0q) f0aVar.b;
                z0q z0qVar9 = (z0q) f0aVar.b;
                Observable observable = (Observable) z0qVar8.a.y7.get();
                c8o.l(observable);
                kdu0 kdu0Var = new kdu0(observable);
                tu41 tu41Var = new tu41(((c9c0) z0qVar9.a.Ed.get()).b.current(), (byte) 28);
                o6x o6xVar = o6x.a;
                pf90 pf90Var = new pf90(yoi1.i(tu41Var, o6xVar).distinctUntilChanged(), (byte) 7);
                pf90 pf90Var2 = new pf90(((xvo) z0qVar9.a.H8.get()).a(true).distinctUntilChanged(), (byte) 1);
                pf90 pf90Var3 = new pf90(((c3s) z0qVar9.a.e6.get()).e.distinctUntilChanged(), (byte) 0);
                FlowableElementAtSingle flowableElementAtSingleE = z0qVar9.e();
                io91 io91VarC4 = z0qVar9.c();
                c8o.l(io91VarC4);
                pf90 pf90Var4 = new pf90((byte) 3, flowableElementAtSingleE, io91VarC4);
                FlowableElementAtSingle flowableElementAtSingleE2 = z0qVar9.e();
                io91 io91VarC5 = z0qVar9.c();
                c8o.l(io91VarC5);
                pf90 pf90Var5 = new pf90((byte) 4, flowableElementAtSingleE2, io91VarC5);
                r961 r961VarZ1 = z0qVar9.a.Z1();
                Observable observableI = yoi1.i(hu20.e(rqt0.u(new x010((ezc) r961VarZ1.b, (ezc) r961VarZ1.c, new irp0(3, (lnm) null, (byte) 17), (byte) 1)), new af01(lnmVar, (Object) r961VarZ1, (byte) 25)), o6xVar);
                c8o.m(observableI);
                return new zk91(kdu0Var, pf90Var, pf90Var2, pf90Var3, pf90Var4, pf90Var5, new pf90(observableI, (byte) 5), new pf90(z0qVar9.d()));
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object i() {
        h72 h72Var = (h72) this.c;
        byte b = 1;
        byte b2 = this.b;
        switch (b2) {
            case 0:
                return new wqq(this);
            case 1:
                return new pnq(this, b);
            case 2:
                return new qnq((byte) 1);
            case 3:
                oo91 oo91Var = (oo91) h72Var.b;
                oo91 oo91Var2 = (oo91) h72Var.b;
                Flowable flowableF = oo91Var.f();
                c8o.l(flowableF);
                hn91 hn91VarU = oo91Var2.u();
                c8o.l(hn91VarU);
                Scheduler schedulerY0 = oo91Var2.y0();
                c8o.l(schedulerY0);
                xrc0 xrc0VarL = oo91Var2.l();
                c8o.l(xrc0VarL);
                return new bru0(flowableF, hn91VarU, schedulerY0, xrc0VarL);
            case 4:
                oo91 oo91Var3 = (oo91) h72Var.b;
                yqg yqgVarA = oo91Var3.a();
                c8o.l(yqgVarA);
                lik1 lik1VarE = oo91Var3.e();
                c8o.l(lik1VarE);
                ccc0 ccc0VarO = oo91Var3.o();
                c8o.l(ccc0VarO);
                xrc0 xrc0VarL2 = oo91Var3.l();
                c8o.l(xrc0VarL2);
                iyc0 iyc0VarX = oo91Var3.x();
                c8o.l(iyc0VarX);
                Scheduler schedulerY1 = oo91Var3.y0();
                c8o.l(schedulerY1);
                ip91 ip91VarH = oo91Var3.h();
                c8o.l(ip91VarH);
                agc0 agc0VarM = ((oo91) h72Var.b).m();
                c8o.l(agc0VarM);
                q7j0 q7j0Var = new q7j0(agc0VarM);
                g7h g7hVarE0 = oo91Var3.e0();
                c8o.l(g7hVarE0);
                q8n q8nVarD = oo91Var3.d();
                c8o.l(q8nVarD);
                q8n q8nVarG = oo91Var3.g();
                c8o.l(q8nVarG);
                return new gx01(yqgVarA, lik1VarE, ccc0VarO, xrc0VarL2, iyc0VarX, schedulerY1, ip91VarH, q7j0Var, g7hVarE0, q8nVarD, q8nVarG);
            case 5:
                return new xqq(this);
            case 6:
                return new snq((byte) 1);
            case 7:
                return new tnq((byte) 1);
            case 8:
                return new unq(this, b);
            case 9:
                return new vnq(this, b);
            default:
                jah.e(b2);
                return null;
        }
    }

    private final Object j() {
        toj0 toj0Var = (toj0) this.c;
        tq91 tq91Var = (tq91) toj0Var.b;
        byte b = this.b;
        if (b == 0) {
            ohv0 ohv0Var = (ohv0) tq91Var.b.get();
            c8o.l(ohv0Var);
            i8h1 i8h1Var = (i8h1) ((jly0) toj0Var.e).get();
            yqg yqgVar = (yqg) tq91Var.e.get();
            c8o.l(yqgVar);
            b2r0 b2r0Var = (b2r0) ((jly0) toj0Var.d).get();
            g1f0 g1f0Var = (g1f0) tq91Var.f.get();
            c8o.l(g1f0Var);
            mwn0 mwn0Var = (mwn0) tq91Var.h.get();
            c8o.l(mwn0Var);
            return new rq91(ohv0Var, i8h1Var, yqgVar, b2r0Var, g1f0Var, mwn0Var);
        }
        if (b == 1) {
            return (b2r0) ((jly0) toj0Var.d).get();
        }
        if (b != 2) {
            if (b == 3) {
                return new mir0(((b2r0) ((jly0) toj0Var.d).get()).a());
            }
            jah.e(b);
            return null;
        }
        c2r0 c2r0Var = (c2r0) tq91Var.g.get();
        c8o.l(c2r0Var);
        qq91 qq91Var = (qq91) toj0Var.c;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return c2r0Var.e(qq91Var, yon1.G1("PHONENUMBER_VALIDATEOTP", "phonenumber/validateotp", 1438, "phonenumber"), (qir0) null);
    }

    private final Object k() {
        p2o0 p2o0Var = (p2o0) this.c;
        byte b = this.b;
        if (b == 0) {
            return pzm.h((mos) ((yw91) p2o0Var.b).g.get());
        }
        if (b == 1) {
            return u1n0.z((q7r0) p2o0Var.c);
        }
        if (b == 2) {
            return new yqq(this);
        }
        if (b == 3) {
            return new zqq(this);
        }
        jah.e(b);
        return null;
    }

    private final Object l() {
        goq goqVar = (goq) this.c;
        i9a1 i9a1Var = (i9a1) goqVar.f;
        q7r0 q7r0Var = (q7r0) goqVar.h;
        v8a1 v8a1Var = (v8a1) goqVar.g;
        byte b = this.b;
        if (b != 0) {
            if (b == 1) {
                ttm0 ttm0VarE = cwl1.E(q7r0Var);
                c8o.m(ttm0VarE);
                return ttm0VarE;
            }
            if (b == 2) {
                return new k0p(this, (byte) 1);
            }
            if (b != 3) {
                jah.e(b);
                return null;
            }
            d0r d0rVarC = cwl1.C(q7r0Var);
            z8a1 z8a1Var = (z8a1) ((jly0) goqVar.d).get();
            q8n q8nVar = (q8n) v8a1Var.a.get();
            c8o.l(q8nVar);
            return new c8a1(z8a1Var.b, exd0.x(i9a1Var), d0rVarC, q8nVar);
        }
        a7a1 a7a1Var = (a7a1) v8a1Var.h.get();
        c8o.l(a7a1Var);
        lik1 lik1VarB = nik1.E6.b(i9a1Var.b);
        d0r d0rVarC2 = cwl1.C(q7r0Var);
        hvp0 hvp0Var = new hvp0(q7r0Var, (byte) 4);
        ttm0 ttm0Var = (ttm0) ((jly0) goqVar.b).get();
        xyf1 xyf1Var = (xyf1) v8a1Var.e.get();
        c8o.l(xyf1Var);
        wks wksVar = (wks) v8a1Var.f.get();
        c8o.l(wksVar);
        yyf1 yyf1Var = (yyf1) v8a1Var.c.get();
        c8o.l(yyf1Var);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarG1 = yon1.G1("SONG_DNA", "song-dna", 1917, "song-dna");
        String str = i9a1Var.b;
        c8o.m(str);
        String str2 = p6r0VarG1.c;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-song-dna-track-page";
        x6h1VarI.f = "3.0.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.b = str2;
        x6h1VarI.d = str;
        y6h1 y6h1VarA = x6h1VarI.a();
        Collections.singletonList("song-dna");
        r6h1 r6h1Var = r6h1.c;
        r6h1 r6h1Var2 = new r6h1(kk0.l(y6h1VarA), (u8h1) null);
        x6a1 x6a1Var = (x6a1) v8a1Var.d.get();
        c8o.l(x6a1Var);
        rea1 rea1Var = (rea1) v8a1Var.g.get();
        c8o.l(rea1Var);
        k0p k0pVar = (k0p) ((jly0) goqVar.c).get();
        njm njmVar = new njm(q7r0Var);
        ngs0 ngs0Var = new ngs0(new njm(q7r0Var));
        lzn0 lzn0Var = (lzn0) v8a1Var.i.get();
        c8o.l(lzn0Var);
        na9 na9Var = new na9(lzn0Var, (byte) 3);
        p6r0 p6r0VarG2 = yon1.G1("SONG_DNA", "song-dna", 1917, "song-dna");
        String str3 = i9a1Var.b;
        c8o.m(str3);
        return new z8a1(a7a1Var, lik1VarB, d0rVarC2, hvp0Var, ttm0Var, xyf1Var, wksVar, yyf1Var, r6h1Var2, x6a1Var, rea1Var, k0pVar.a(str3), njmVar, ngs0Var, na9Var, new b9u0("song-dna", q7r0Var.a(), (String) null), p6r0VarG2.c);
    }

    private final Object m() {
        byte b = this.b;
        if (b == 0) {
            return new brq(this);
        }
        if (b == 1) {
            return new jyo((byte) 4);
        }
        if (b == 2) {
            return new crq(this);
        }
        jah.e(b);
        return null;
    }

    private final Object n() {
        String str;
        h72 h72Var = (h72) this.c;
        q7r0 q7r0Var = (q7r0) h72Var.c;
        qda1 qda1Var = (qda1) h72Var.b;
        byte b = this.b;
        switch (b) {
            case 0:
                d830 d830Var = new d830(new xp01((pp01) ((jly0) h72Var.d).get(), h72Var.T()), (byte) 3);
                d830 d830Var2 = new d830(new y730((vwm1) ((jly0) h72Var.e).get()), (byte) 0);
                xrc0 xrc0Var = (xrc0) qda1Var.g.get();
                c8o.l(xrc0Var);
                agc0 agc0Var = (agc0) qda1Var.i.get();
                c8o.l(agc0Var);
                b7n b7nVar = (b7n) qda1Var.h.get();
                c8o.l(b7nVar);
                Set setS0 = f46.S0(new d830[]{d830Var, d830Var2, new d830(new mfc0(xrc0Var, agc0Var, b7nVar, h72Var.T()), (byte) 1), new d830(new kmm0((emm0) ((jly0) h72Var.f).get(), h72Var.T()), (byte) 2)});
                int iS = zno1.s(q7h.U(setS0, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (Object obj : setS0) {
                    switch (((d830) obj).a) {
                        case 0:
                            str = "followed_artists";
                            break;
                        case 1:
                            str = "liked_songs";
                            break;
                        case 2:
                            str = "most_played";
                            break;
                        default:
                            str = "recently_played";
                            break;
                    }
                    linkedHashMap.put(new aea1(str), obj);
                }
                q8n q8nVar = (q8n) qda1Var.l.get();
                c8o.l(q8nVar);
                return new yba1(linkedHashMap, q8nVar);
            case 1:
                CallbackRouter callbackRouter = (CallbackRouter) qda1Var.b.get();
                c8o.l(callbackRouter);
                return new pp01(new CosmosCoroutineTransport(new q7v0(callbackRouter, (byte) 5)));
            case 2:
                CallbackRouter callbackRouter2 = (CallbackRouter) qda1Var.b.get();
                c8o.l(callbackRouter2);
                return new vwm1(new CosmosCoroutineTransport(new q7v0(callbackRouter2, (byte) 6)));
            case 3:
                RetrofitMaker retrofitMaker = (RetrofitMaker) qda1Var.c.get();
                c8o.l(retrofitMaker);
                return (emm0) retrofitMaker.createWebgateService(emm0.class, "android-songdna-searchcontent");
            case 4:
                kea1 kea1Var = (kea1) ((jly0) h72Var.h).get();
                yqg yqgVar = (yqg) qda1Var.k.get();
                c8o.l(yqgVar);
                m021 m021Var = new m021(kea1Var, yqgVar, (byte) 21);
                q8n q8nVar2 = (q8n) qda1Var.l.get();
                c8o.l(q8nVar2);
                return new dda1(m021Var, q8nVar2);
            case 5:
                RetrofitMaker retrofitMaker2 = (RetrofitMaker) qda1Var.c.get();
                c8o.l(retrofitMaker2);
                return (kea1) retrofitMaker2.createWebgateService(kea1.class, "android-songdna-searchclient");
            case 6:
                return cwl1.C(q7r0Var);
            case 7:
                return u1n0.z(q7r0Var);
            case 8:
                return pzm.h((mos) qda1Var.j.get());
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object o() {
        goq goqVar = (goq) this.c;
        zta1 zta1Var = (zta1) goqVar.e;
        byte b = this.b;
        if (b == 0) {
            return pzm.h((mos) zta1Var.b.get());
        }
        if (b == 1) {
            return u1n0.z((q7r0) goqVar.f);
        }
        if (b != 2) {
            if (b != 3) {
                jah.e(b);
                return null;
            }
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            return new cbr0(new dbr0[]{new yxe1(new ehc1("")), new bn70(yon1.G1("SPEED_CONTROL_MESSAGING", "speed-control/messaging", 1929, "speed-control"), new lik1(((dua1) goqVar.g).getPageUri()), (nar0) null), new t1r0(true), new nxb((Integer) null, ixb.b, (Integer) null, 1, (mxb) null, (los) ((jly0) goqVar.b).get(), false, true, false, (nsm0) null, 3925)}, false);
        }
        f9q f9qVar = (f9q) zta1Var.e.get();
        c8o.l(f9qVar);
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-playlist-speed-control-messaging-sheet";
        x6h1VarI.f = "2.0.0";
        x6h1VarI.g = "22.0.0";
        y6h1 y6h1VarA = x6h1VarI.a();
        Collections.singletonList("speed-control/messaging");
        r6h1 r6h1Var = r6h1.c;
        return f9qVar.a(new r6h1(kk0.l(y6h1VarA), (u8h1) null));
    }

    private final Object p() {
        wdm wdmVar = (wdm) this.c;
        rua1 rua1Var = (rua1) wdmVar.d;
        byte b = this.b;
        switch (b) {
            case 0:
                return cwl1.C((q7r0) wdmVar.c);
            case 1:
                return pzm.h((mos) rua1Var.h.get());
            case 2:
                f9q f9qVar = (f9q) rua1Var.o.get();
                c8o.l(f9qVar);
                String str = ((xua1) wdmVar.b).a;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-playlist-speed-control-bottom-sheet";
                x6h1VarI.f = "1.0.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.d = str;
                y6h1 y6h1VarA = x6h1VarI.a();
                Collections.singletonList("playlist/speed-control-bottom-sheet");
                r6h1 r6h1Var = r6h1.c;
                return f9qVar.a(new r6h1(kk0.l(y6h1VarA), (u8h1) null));
            case 3:
                return new hrq();
            case 4:
                return new irq();
            case 5:
                return new jrq();
            case 6:
                return new krq(this);
            case 7:
                return new lrq();
            case 8:
                return new mrq();
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object q() {
        prq prqVar = (prq) this.c;
        bz11 bz11Var = prqVar.a;
        byte b = this.b;
        if (b == 0) {
            dma1 dma1Var = (dma1) bz11Var.i;
            c8o.l(dma1Var);
            yqg yqgVar = (yqg) bz11Var.h;
            c8o.l(yqgVar);
            return new n2b1(yqgVar, dma1Var);
        }
        pc4 pc4Var = pc4.b;
        if (b == 1) {
            wcr wcrVar = (wcr) bz11Var.g;
            luk lukVarH = bz11Var.h();
            c8o.l(lukVarH);
            return new u3c(new cab(wcrVar, new qc4(pc4Var, false, lukVarH)), new bb01((ae5) bz11Var.e, (byte) 25));
        }
        if (b != 2) {
            if (b == 3) {
                return (d2n0) bz11Var.j;
            }
            if (b != 4) {
                jah.e(b);
                return null;
            }
            o241 o241Var = (o241) bz11Var.a;
            c8o.l(o241Var);
            return o241Var;
        }
        u3c u3cVar = (u3c) prqVar.c.get();
        d2n0 d2n0Var = (d2n0) prqVar.d.get();
        onv0 onv0Var = (onv0) bz11Var.d;
        em3 em3Var = (em3) bz11Var.c;
        ipq ipqVar = prqVar.e;
        luk lukVarH2 = bz11Var.h();
        c8o.l(lukVarH2);
        qc4 qc4Var = new qc4(pc4Var, false, lukVarH2);
        q8n q8nVar = (q8n) bz11Var.b;
        c8o.l(q8nVar);
        return new r2b1(u3cVar, d2n0Var, onv0Var, em3Var, ipqVar, qc4Var, q8nVar, (v3c) bz11Var.k);
    }

    private final Object r() {
        byte b = this.b;
        if (b == 0) {
            return new trq(this);
        }
        if (b == 1) {
            return new pop((byte) 1);
        }
        if (b == 2) {
            return new lmq(this, (byte) 1);
        }
        if (b != 3) {
            jah.e(b);
            return null;
        }
        pch1 pch1Var = (pch1) ((k0q) ((goq) this.c).f).b.m8.get();
        c8o.l(pch1Var);
        return pch1Var;
    }

    private final Object s() {
        k42 k42Var = (k42) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                fib1 fib1Var = (fib1) k42Var.a;
                gib1 gib1Var = (gib1) k42Var.b;
                ohv0 ohv0Var = (ohv0) ((ipq) k42Var.c).get();
                b2r0 b2r0Var = (b2r0) ((jly0) k42Var.d).get();
                i8h1 i8h1Var = (i8h1) ((ipq) k42Var.e).get();
                yqg yqgVar = (yqg) gib1Var.h.get();
                c8o.l(yqgVar);
                wab wabVar = (wab) ((ipq) k42Var.f).get();
                Context context = (Context) gib1Var.e.a;
                c8o.l(context);
                f741 f741Var = (f741) gib1Var.z.get();
                c8o.l(f741Var);
                fns fnsVar = igu.a;
                b3s b3sVar = b3s.c;
                s6z0 s6z0Var = new s6z0(new nt21(context, f741Var));
                w5b1 w5b1Var = (w5b1) gib1Var.C.get();
                c8o.l(w5b1Var);
                nfa0 nfa0Var = (nfa0) gib1Var.p.get();
                c8o.l(nfa0Var);
                yfu yfuVar = new yfu(w5b1Var, nfa0Var, (byte) 1);
                l841 l841Var = (l841) gib1Var.A.get();
                c8o.l(l841Var);
                pnw pnwVar = new pnw(s6z0Var, yfuVar, l841Var);
                Scheduler scheduler = (Scheduler) gib1Var.o.get();
                c8o.l(scheduler);
                Scheduler scheduler2 = (Scheduler) gib1Var.s.get();
                c8o.l(scheduler2);
                yzu yzuVar = new yzu();
                yzuVar.b = new rku();
                yzuVar.a = pnwVar;
                yzuVar.c = scheduler;
                yzuVar.d = scheduler2;
                g1f0 g1f0Var = (g1f0) ((ipq) k42Var.g).get();
                jly0 jly0Var = (jly0) k42Var.i;
                kg0 kg0Var = (kg0) ((ipq) k42Var.j).get();
                Single single = (Single) gib1Var.c.get();
                c8o.l(single);
                dv dvVar = (dv) gib1Var.b.get();
                c8o.l(dvVar);
                wbd1 wbd1Var = (wbd1) gib1Var.a.get();
                c8o.l(wbd1Var);
                Flowable flowable = (Flowable) gib1Var.B.get();
                c8o.l(flowable);
                u2f0 u2f0Var = (u2f0) gib1Var.r.get();
                c8o.l(u2f0Var);
                Scheduler scheduler3 = (Scheduler) gib1Var.s.get();
                c8o.l(scheduler3);
                return new bkb1(fib1Var, ohv0Var, b2r0Var, i8h1Var, yqgVar, wabVar, yzuVar, g1f0Var, jly0Var, kg0Var, single, dvVar, wbd1Var, flowable, u2f0Var, scheduler3, (fib1) k42Var.a, (t0i) ((ipq) k42Var.k).get());
            case 1:
                ohv0 ohv0Var2 = (ohv0) ((gib1) k42Var.b).x.get();
                c8o.l(ohv0Var2);
                return ohv0Var2;
            case 2:
                c2r0 c2r0Var = (c2r0) ((gib1) k42Var.b).u.get();
                c8o.l(c2r0Var);
                fib1 fib1Var2 = (fib1) k42Var.a;
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                return c2r0Var.e(fib1Var2, yon1.G1("START", "start", 1978, "start"), (qir0) null);
            case 3:
                i8h1 i8h1Var2 = (i8h1) ((gib1) k42Var.b).E.get();
                c8o.l(i8h1Var2);
                return i8h1Var2;
            case 4:
                wab wabVar2 = (wab) ((gib1) k42Var.b).g.get();
                c8o.l(wabVar2);
                return wabVar2;
            case 5:
                g1f0 g1f0Var2 = (g1f0) ((gib1) k42Var.b).q.get();
                c8o.l(g1f0Var2);
                return g1f0Var2;
            case 6:
                gib1 gib1Var2 = (gib1) k42Var.b;
                gib1 gib1Var3 = (gib1) k42Var.b;
                Context context2 = (Context) gib1Var2.i.a;
                c8o.l(context2);
                Activity activity = (Activity) ((ipq) k42Var.h).get();
                g1f0 g1f0Var3 = (g1f0) ((ipq) k42Var.g).get();
                g7h1 g7h1Var = (g7h1) gib1Var3.D.get();
                c8o.l(g7h1Var);
                w5o w5oVar = new w5o(activity, g1f0Var3, g7h1Var);
                q8n q8nVarX = brt.x();
                r5o r5oVar = new r5o(gp41.b, (ohv0) ((ipq) k42Var.c).get());
                g1f0 g1f0Var4 = (g1f0) ((ipq) k42Var.g).get();
                v4s0 v4s0Var = (v4s0) gib1Var3.v.get();
                c8o.l(v4s0Var);
                jqt jqtVar = (jqt) gib1Var3.k.get();
                c8o.l(jqtVar);
                nfa0 nfa0Var2 = (nfa0) gib1Var3.n.get();
                c8o.l(nfa0Var2);
                return new q5o(context2, w5oVar, q8nVarX, r5oVar, new tzr0(g1f0Var4, v4s0Var, jqtVar, new yrg0(nfa0Var2, (byte) 5), (byte) 2), (g1f0) ((ipq) k42Var.g).get());
            case 7:
                Activity activity2 = (Activity) ((gib1) k42Var.b).d.a;
                c8o.l(activity2);
                return activity2;
            case 8:
                kg0 kg0Var2 = (kg0) ((gib1) k42Var.b).F.get();
                c8o.l(kg0Var2);
                return kg0Var2;
            case 9:
                g3g1 g3g1Var = (g3g1) ((gib1) k42Var.b).l.get();
                c8o.l(g3g1Var);
                return new t0i(g3g1Var);
            case 10:
                return mw60.f((ipq) k42Var.m, (ipq) k42Var.f, (ipq) k42Var.n, (ipq) k42Var.o, (ipq) k42Var.k, (ipq) k42Var.p, (ipq) k42Var.q, (ipq) k42Var.c, (ipq) k42Var.e, (ipq) k42Var.r, (ipq) k42Var.j, (ipq) k42Var.g);
            case 11:
                u0i u0iVar = (u0i) ((gib1) k42Var.b).f.get();
                c8o.l(u0iVar);
                return u0iVar;
            case 12:
                gw70 gw70Var = (gw70) ((gib1) k42Var.b).m.get();
                c8o.l(gw70Var);
                return gw70Var;
            case 13:
                o8r o8rVar = (o8r) ((gib1) k42Var.b).j.get();
                c8o.l(o8rVar);
                return o8rVar;
            case 14:
                gks0 gks0Var = (gks0) ((gib1) k42Var.b).w.get();
                c8o.l(gks0Var);
                return gks0Var;
            case 15:
                fmy0 fmy0Var = (fmy0) ((gib1) k42Var.b).y.get();
                c8o.l(fmy0Var);
                return fmy0Var;
            case 16:
                mwn0 mwn0Var = (mwn0) ((gib1) k42Var.b).t.get();
                c8o.l(mwn0Var);
                return mwn0Var;
            case 17:
                return new mir0(((b2r0) ((jly0) k42Var.d).get()).a());
            default:
                jah.e(b);
                return null;
        }
    }

    public final Object get() {
        byte b = this.a;
        byte b2 = 13;
        byte b3 = 3;
        Object obj = this.c;
        byte b4 = this.b;
        switch (b) {
            case 0:
                wdm wdmVar = (wdm) obj;
                ra61 ra61Var = (ra61) wdmVar.b;
                switch (b4) {
                    case 0:
                        return sdl.q(wdmVar.o());
                    case 1:
                        bfs bfsVar = ra61Var.e;
                        c8o.l(bfsVar);
                        return bfsVar.c().map(new ypa((byte) 15, false)).replay(1).f();
                    case 2:
                        bfs bfsVar2 = ra61Var.e;
                        c8o.l(bfsVar2);
                        return Observable.combineLatest(new ObservableFromPublisher(bfsVar2.a.j(mo9.N0)), bfsVar2.d(), drm0.V0).skipWhile(cq41.W0).distinctUntilChanged().map(new lqc((byte) 22)).replay(1).f();
                    case 3:
                        Context context = ra61Var.f;
                        c8o.l(context);
                        gma1 gma1Var = ra61Var.c;
                        c8o.l(gma1Var);
                        gn20 gn20VarD = hl20.D(gma1Var);
                        Flowable flowable = ra61Var.g;
                        c8o.l(flowable);
                        vbm[] vbmVarArr = q601.a;
                        kge kgeVar = new kge(flowable);
                        fns fnsVar = igu.a;
                        b3s b3sVar = b3s.c;
                        return new y4m1(context, gn20VarD, kgeVar, smo1.e(flo1.l(guo1.B(), b3sVar)), b3sVar);
                    case 4:
                        return (mx3) ra61Var.h.get();
                    case 5:
                        return (zip0) ra61Var.i.get();
                    case 6:
                        return (l3s0) ra61Var.j.get();
                    case 7:
                        return (mya1) ra61Var.k.get();
                    case 8:
                        luk lukVar = ra61Var.b;
                        c8o.l(lukVar);
                        return new qq4(lukVar);
                    default:
                        jah.e(b4);
                        return null;
                }
            case 1:
                if (b4 == 0) {
                    return new jpq();
                }
                if (b4 == 1) {
                    return new kpq(this);
                }
                if (b4 == 2) {
                    return new lpq(this);
                }
                jah.e(b4);
                return null;
            case 2:
                wj3 wj3Var = (wj3) obj;
                switch (b4) {
                    case 0:
                        zr61 zr61Var = (zr61) wj3Var.c;
                        zr61 zr61Var2 = (zr61) wj3Var.c;
                        lzn0 lzn0Var = (lzn0) zr61Var.g.get();
                        c8o.l(lzn0Var);
                        i8h1 i8h1VarZ = u1n0.z((q7r0) wj3Var.d);
                        ov20 ov20Var = (ov20) zr61Var2.h.get();
                        c8o.l(ov20Var);
                        gu61 gu61Var = ((os61) wj3Var.b).b;
                        c8o.m(gu61Var);
                        ipq ipqVar = (ipq) wj3Var.e;
                        ipq ipqVar2 = (ipq) wj3Var.f;
                        ipq ipqVar3 = (ipq) wj3Var.h;
                        ipq ipqVar4 = (ipq) wj3Var.i;
                        ipq ipqVar5 = (ipq) wj3Var.X;
                        ipq ipqVar6 = (ipq) wj3Var.Z;
                        ipq ipqVar7 = (ipq) wj3Var.N0;
                        nu71 nu71Var = (nu71) zr61Var2.k.get();
                        c8o.l(nu71Var);
                        kv61 kv61Var = new kv61(ov20Var, gu61Var, ipqVar, ipqVar2, ipqVar3, ipqVar4, ipqVar5, ipqVar6, new y441(ipqVar7, new ogr(nu71Var, (byte) 17)));
                        ix81 ix81VarA = zr61Var2.a();
                        c8o.l(ix81VarA);
                        gw70 gw70VarB = zr61Var2.b();
                        c8o.l(gw70VarB);
                        pe peVarH = zr61Var2.h();
                        c8o.l(peVarH);
                        c8o.l(zr61Var2.f());
                        return new su61(lzn0Var, i8h1VarZ, kv61Var, new qyj(ix81VarA, new q3b1(gw70VarB, peVarH)));
                    case 1:
                        return new xlc1();
                    case 2:
                        return new g460();
                    case 3:
                        zr61 zr61Var3 = (zr61) wj3Var.c;
                        lzn0 lzn0Var2 = (lzn0) zr61Var3.g.get();
                        c8o.l(lzn0Var2);
                        g341 g341Var = (g341) zr61Var3.i.get();
                        c8o.l(g341Var);
                        no5 no5VarN = wj3Var.n();
                        z710 z710Var = (z710) ((ipq) wj3Var.g).get();
                        i9i1 i9i1Var = (i9i1) zr61Var3.l.get();
                        c8o.l(i9i1Var);
                        return new w9r0(new wp20(lzn0Var2, g341Var, no5VarN, z710Var, i9i1Var));
                    case 4:
                        z710 z710Var2 = (z710) ((zr61) wj3Var.c).f.get();
                        c8o.l(z710Var2);
                        return z710Var2;
                    case 5:
                        no5 no5VarN2 = wj3Var.n();
                        i9i1 i9i1Var2 = (i9i1) ((zr61) wj3Var.c).l.get();
                        c8o.l(i9i1Var2);
                        return new i0r0(new ycc1(no5VarN2, i9i1Var2, (byte) 5));
                    case 6:
                        zr61 zr61Var4 = (zr61) wj3Var.c;
                        b7n b7nVar = (b7n) zr61Var4.d.get();
                        c8o.l(b7nVar);
                        no5 no5VarN3 = wj3Var.n();
                        xv61 xv61Var = (xv61) zr61Var4.j.get();
                        c8o.l(xv61Var);
                        pcl pclVar = (pcl) zr61Var4.b.get();
                        c8o.l(pclVar);
                        i9i1 i9i1Var3 = (i9i1) zr61Var4.l.get();
                        c8o.l(i9i1Var3);
                        return new igr0(new d520(b7nVar, no5VarN3, xv61Var, pclVar, i9i1Var3, (teo0) ((jly0) wj3Var.t).get()));
                    case 7:
                        return new r8p((byte) 4);
                    case 8:
                        zr61 zr61Var5 = (zr61) wj3Var.c;
                        b7n b7nVar2 = (b7n) zr61Var5.d.get();
                        c8o.l(b7nVar2);
                        no5 no5VarN4 = wj3Var.n();
                        xv61 xv61Var2 = (xv61) zr61Var5.j.get();
                        c8o.l(xv61Var2);
                        pcl pclVar2 = (pcl) zr61Var5.b.get();
                        c8o.l(pclVar2);
                        i9i1 i9i1Var4 = (i9i1) zr61Var5.l.get();
                        c8o.l(i9i1Var4);
                        return new u9r0(new a680(b7nVar2, no5VarN4, xv61Var2, pclVar2, i9i1Var4, (teo0) ((jly0) wj3Var.Y).get()), ((Boolean) ((zr61) wj3Var.c).e.get()).booleanValue());
                    case 9:
                        return new r8p((byte) 5);
                    case 10:
                        Context context2 = (Context) ((zr61) wj3Var.c).c.get();
                        c8o.l(context2);
                        nu71 nu71Var2 = (nu71) ((zr61) wj3Var.c).k.get();
                        c8o.l(nu71Var2);
                        return new jn61(context2, new ogr(nu71Var2, (byte) 17));
                    case 11:
                        return new rb30((ipq) wj3Var.g);
                    default:
                        jah.e(b4);
                        return null;
                }
            case 3:
                upq upqVar = (upq) obj;
                switch (b4) {
                    case 0:
                        return new vs61((aep) ((jly0) upqVar.d).get(), (npq) ((jly0) upqVar.x).get(), (tpq) ((jly0) upqVar.y).get(), (ufz0) ((jly0) upqVar.w).get());
                    case 1:
                        return new aep((byte) 1);
                    case 2:
                        return new npq(this);
                    case 3:
                        return new vr61((jr61) ((jly0) upqVar.e).get(), (qs61) ((jly0) upqVar.f).get(), (opq) ((jly0) upqVar.i).get(), (ppq) ((jly0) upqVar.l).get(), (qpq) ((jly0) upqVar.n).get(), (rpq) ((jly0) upqVar.p).get(), (spq) ((jly0) upqVar.r).get(), (v9b0) ((jly0) upqVar.s).get(), (ylu) ((jly0) upqVar.t).get(), (n881) ((jly0) upqVar.u).get());
                    case 4:
                        Context context3 = (Context) ((as61) upqVar.b).a.get();
                        c8o.l(context3);
                        return new jr61(context3.getApplicationContext());
                    case 5:
                        return new qs61();
                    case 6:
                        return new opq(this);
                    case 7:
                        xfx xfxVar = (xfx) ((as61) upqVar.b).j.get();
                        c8o.l(xfxVar);
                        return new zfx(xfxVar.c, (byte) 13);
                    case 8:
                        ps61 ps61Var = (ps61) upqVar.a;
                        AtomicReferenceArray atomicReferenceArray = p6r0.e;
                        return new t4m0(yon1.I0().c, ps61Var.a);
                    case 9:
                        return new ppq(this);
                    case 10:
                        xfx xfxVar2 = (xfx) ((as61) upqVar.b).j.get();
                        c8o.l(xfxVar2);
                        return new igx(xfxVar2.c, (byte) 2);
                    case 11:
                        return new kr61(xqu.a((ipq) upqVar.K), (t4m0) ((jly0) upqVar.h).get());
                    case 12:
                        return u1n0.z((q7r0) upqVar.c);
                    case 13:
                        return new qpq(this);
                    case 14:
                        xfx xfxVar3 = (xfx) ((as61) upqVar.b).j.get();
                        c8o.l(xfxVar3);
                        return new ofx(xfxVar3.a, (byte) 2);
                    case 15:
                        return new rpq(this);
                    case 16:
                        xfx xfxVar4 = (xfx) ((as61) upqVar.b).j.get();
                        c8o.l(xfxVar4);
                        return new yfx(xfxVar4.e, (byte) 1);
                    case 17:
                        return new spq(this);
                    case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                        xfx xfxVar5 = (xfx) ((as61) upqVar.b).j.get();
                        c8o.l(xfxVar5);
                        return new ofx(xfxVar5.a, (byte) 3);
                    case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                        return new v9b0();
                    case 20:
                        return new ylu();
                    case 21:
                        return new n881((u0i) ((jly0) upqVar.g).get());
                    case 22:
                        dgz0 dgz0Var = (dgz0) ((as61) upqVar.b).i.get();
                        c8o.l(dgz0Var);
                        return new ufz0(dgz0Var);
                    case 23:
                        return new tpq(this);
                    case 24:
                        u5v0 u5v0Var = (u5v0) ((jly0) upqVar.A).get();
                        as61 as61Var = (as61) upqVar.b;
                        lzn0 lzn0Var3 = (lzn0) as61Var.c.get();
                        c8o.l(lzn0Var3);
                        nt8 nt8Var = (nt8) ((jly0) upqVar.B).get();
                        dq61 dq61Var = (dq61) ((jly0) upqVar.F).get();
                        cs61 cs61Var = (cs61) ((jly0) upqVar.I).get();
                        Scheduler scheduler = (Scheduler) as61Var.e.get();
                        c8o.l(scheduler);
                        return new ms61(new fs61(u5v0Var, lzn0Var3, nt8Var, dq61Var, cs61Var, scheduler), (nr61) ((jly0) upqVar.E).get());
                    case 25:
                        Activity activity = (Activity) ((as61) upqVar.b).b.get();
                        c8o.l(activity);
                        an3 an3Var = (an3) ((as61) upqVar.b).h.get();
                        c8o.l(an3Var);
                        return new u5v0(activity, an3Var);
                    case 26:
                        mt8 mt8Var = (mt8) ((as61) upqVar.b).l.get();
                        c8o.l(mt8Var);
                        uu00 uu00Var = (uu00) ((as61) upqVar.b).m.get();
                        c8o.l(uu00Var);
                        return new nt8(mt8Var, uu00Var);
                    case 27:
                        return new dq61((nt8) ((jly0) upqVar.B).get(), (nr61) ((jly0) upqVar.E).get());
                    case 28:
                        nt8 nt8Var2 = (nt8) ((jly0) upqVar.B).get();
                        ov20 ov20Var2 = (ov20) ((as61) upqVar.b).g.get();
                        c8o.l(ov20Var2);
                        return new nr61(nt8Var2, ov20Var2, (Observable) ((jly0) upqVar.C).get(), (Observable) ((jly0) upqVar.D).get());
                    case 29:
                        p241 p241Var = (o241) ((as61) upqVar.b).f.get();
                        c8o.l(p241Var);
                        return p241Var.b("offline").map(icx0.t);
                    case 30:
                        b7n b7nVar3 = (b7n) ((as61) upqVar.b).d.get();
                        c8o.l(b7nVar3);
                        Observable observableI = yoi1.i(new tu41(b7nVar3.a(j6n.a), (byte) 7), o6x.a);
                        c8o.m(observableI);
                        return observableI;
                    case 31:
                        kt8 kt8Var = (kt8) ((as61) upqVar.b).o.get();
                        c8o.l(kt8Var);
                        nuu nuuVar = (nuu) ((as61) upqVar.b).n.get();
                        c8o.l(nuuVar);
                        return new cs61(kt8Var, nuuVar, (ax7) ((jly0) upqVar.H).get());
                    case 32:
                        return new ax7(xqu.a((ipq) upqVar.K), (uol0) ((jly0) upqVar.G).get());
                    case 33:
                        return new uol0(((t4m0) ((jly0) upqVar.h).get()).b());
                    default:
                        jah.e(b4);
                        return null;
                }
            case 4:
                kp5 kp5Var = (kp5) obj;
                q7r0 q7r0Var = (q7r0) kp5Var.b;
                mt61 mt61Var = (mt61) kp5Var.c;
                lt61 lt61Var = (lt61) kp5Var.a;
                if (b4 != 0) {
                    if (b4 == 1) {
                        return new vpq(this);
                    }
                    if (b4 == 2) {
                        return (qv01) ((jly0) kp5Var.d).get();
                    }
                    if (b4 == 3) {
                        nu71 nu71Var3 = (nu71) lt61Var.d.get();
                        c8o.l(nu71Var3);
                        return new qv01(mt61Var, nu71Var3);
                    }
                    if (b4 == 4) {
                        return new ot61();
                    }
                    jah.e(b4);
                    return null;
                }
                lzn0 lzn0Var4 = (lzn0) lt61Var.a.get();
                c8o.l(lzn0Var4);
                i8h1 i8h1VarZ2 = u1n0.z(q7r0Var);
                ix81 ix81VarA2 = lt61Var.a();
                c8o.l(ix81VarA2);
                gw70 gw70VarB2 = lt61Var.b();
                c8o.l(gw70VarB2);
                pe peVarH2 = lt61Var.h();
                c8o.l(peVarH2);
                c8o.l(lt61Var.f());
                qyj qyjVar = new qyj(ix81VarA2, new q3b1(gw70VarB2, peVarH2));
                r961 r961Var = new r961(u1n0.z(q7r0Var), (vpq) ((jly0) kp5Var.g).get());
                ynb0 ynb0VarA = xqu.a((ipq) kp5Var.e);
                ss61 ss61Var = (ss61) lt61Var.c.get();
                c8o.l(ss61Var);
                ov20 ov20Var3 = (ov20) lt61Var.b.get();
                c8o.l(ov20Var3);
                return new vt61(lzn0Var4, i8h1VarZ2, qyjVar, r961Var, mt61Var, ynb0VarA, new rzo0(ss61Var, ov20Var3), (ipq) kp5Var.f);
            case 5:
                s24 s24Var = (s24) obj;
                switch (b4) {
                    case 0:
                        ku61 ku61Var = (ku61) s24Var.b;
                        lu61 lu61Var = (lu61) s24Var.c;
                        ku61 ku61Var2 = (ku61) s24Var.b;
                        Activity activity2 = (Activity) ku61Var.a.get();
                        c8o.l(activity2);
                        lzn0 lzn0Var5 = (lzn0) ku61Var2.j.get();
                        c8o.l(lzn0Var5);
                        ov20 ov20Var4 = (ov20) ku61Var2.k.get();
                        c8o.l(ov20Var4);
                        gu61 gu61Var2 = lu61Var.b;
                        c8o.m(gu61Var2);
                        ipq ipqVar8 = (ipq) s24Var.d;
                        ipq ipqVar9 = (ipq) s24Var.e;
                        ipq ipqVar10 = (ipq) s24Var.f;
                        ipq ipqVar11 = (ipq) s24Var.g;
                        ipq ipqVar12 = (ipq) s24Var.i;
                        ipq ipqVar13 = (ipq) s24Var.X;
                        ipq ipqVar14 = (ipq) s24Var.Y;
                        nu71 nu71Var4 = (nu71) ku61Var2.n.get();
                        c8o.l(nu71Var4);
                        kv61 kv61Var2 = new kv61(ov20Var4, gu61Var2, ipqVar8, ipqVar9, ipqVar10, ipqVar11, ipqVar12, ipqVar13, new y441(ipqVar14, new ogr(nu71Var4, (byte) 17)));
                        ix81 ix81VarA3 = ku61Var2.a();
                        c8o.l(ix81VarA3);
                        gw70 gw70VarB3 = ku61Var2.b();
                        c8o.l(gw70VarB3);
                        pe peVarH3 = ku61Var2.h();
                        c8o.l(peVarH3);
                        c8o.l(ku61Var2.f());
                        qyj qyjVar2 = new qyj(ix81VarA3, new q3b1(gw70VarB3, peVarH3));
                        a1r0 a1r0Var = (a1r0) ku61Var2.b.get();
                        c8o.l(a1r0Var);
                        return new pu61(activity2, lzn0Var5, kv61Var2, qyjVar2, lu61Var, a1r0Var, (los) ((jly0) s24Var.Z).get());
                    case 1:
                        return new xlc1();
                    case 2:
                        return new g460();
                    case 3:
                        ku61 ku61Var3 = (ku61) s24Var.b;
                        lzn0 lzn0Var6 = (lzn0) ku61Var3.j.get();
                        c8o.l(lzn0Var6);
                        g341 g341Var2 = (g341) ku61Var3.l.get();
                        c8o.l(g341Var2);
                        no5 no5VarD0 = s24Var.d0();
                        z710 z710Var3 = (z710) ku61Var3.i.get();
                        c8o.l(z710Var3);
                        i9i1 i9i1Var5 = (i9i1) ku61Var3.o.get();
                        c8o.l(i9i1Var5);
                        return new w9r0(new wp20(lzn0Var6, g341Var2, no5VarD0, z710Var3, i9i1Var5));
                    case 4:
                        no5 no5VarD1 = s24Var.d0();
                        i9i1 i9i1Var6 = (i9i1) ((ku61) s24Var.b).o.get();
                        c8o.l(i9i1Var6);
                        return new i0r0(new ycc1(no5VarD1, i9i1Var6, (byte) 5));
                    case 5:
                        ku61 ku61Var4 = (ku61) s24Var.b;
                        b7n b7nVar4 = (b7n) ku61Var4.g.get();
                        c8o.l(b7nVar4);
                        no5 no5VarD2 = s24Var.d0();
                        xv61 xv61Var3 = (xv61) ku61Var4.m.get();
                        c8o.l(xv61Var3);
                        pcl pclVar3 = (pcl) ku61Var4.e.get();
                        c8o.l(pclVar3);
                        i9i1 i9i1Var7 = (i9i1) ku61Var4.o.get();
                        c8o.l(i9i1Var7);
                        return new igr0(new d520(b7nVar4, no5VarD2, xv61Var3, pclVar3, i9i1Var7, (teo0) ((jly0) s24Var.h).get()));
                    case 6:
                        return new r8p((byte) 6);
                    case 7:
                        ku61 ku61Var5 = (ku61) s24Var.b;
                        b7n b7nVar5 = (b7n) ku61Var5.g.get();
                        c8o.l(b7nVar5);
                        no5 no5VarD3 = s24Var.d0();
                        xv61 xv61Var4 = (xv61) ku61Var5.m.get();
                        c8o.l(xv61Var4);
                        pcl pclVar4 = (pcl) ku61Var5.e.get();
                        c8o.l(pclVar4);
                        i9i1 i9i1Var8 = (i9i1) ku61Var5.o.get();
                        c8o.l(i9i1Var8);
                        return new u9r0(new a680(b7nVar5, no5VarD3, xv61Var4, pclVar4, i9i1Var8, (teo0) ((jly0) s24Var.t).get()), ((Boolean) ((ku61) s24Var.b).h.get()).booleanValue());
                    case 8:
                        return new r8p((byte) 7);
                    case 9:
                        Context context4 = (Context) ((ku61) s24Var.b).f.get();
                        c8o.l(context4);
                        nu71 nu71Var5 = (nu71) ((ku61) s24Var.b).n.get();
                        c8o.l(nu71Var5);
                        return new jn61(context4, new ogr(nu71Var5, (byte) 17));
                    case 10:
                        return pzm.h((mos) ((ku61) s24Var.b).d.get());
                    default:
                        jah.e(b4);
                        return null;
                }
            case 6:
                wdm wdmVar2 = (wdm) obj;
                switch (b4) {
                    case 0:
                        r4p r4pVar = (r4p) wdmVar2.b;
                        q8n q8nVar = (q8n) r4pVar.k;
                        q8n q8nVar2 = (q8n) r4pVar.j;
                        yqg yqgVar = (yqg) r4pVar.g;
                        kma kmaVar = (kma) r4pVar.f;
                        woa woaVar = (woa) r4pVar.e;
                        gw70 gw70Var = (gw70) r4pVar.l;
                        ruz ruzVar = (ruz) r4pVar.m;
                        return new tq7(new c0a(yx61.w(new mzr0(q8nVar, q8nVar2, yqgVar, kmaVar, woaVar, gw70Var, ruzVar)), (zxa) r4pVar.n), new pdx0((byte) 29));
                    case 1:
                        r4p r4pVar2 = (r4p) wdmVar2.b;
                        Context context5 = (Context) r4pVar2.o;
                        ggv ggvVar = (ggv) r4pVar2.f56p;
                        return new tq7(new sq7(new aq7(szq.a(), (wh41) r4pVar2.r, new vr51(ggvVar, (byte) 5), context5)), new i2x0((byte) 29));
                    case 2:
                        r4p r4pVar3 = (r4p) wdmVar2.b;
                        Context context6 = (Context) r4pVar3.o;
                        ggv ggvVar2 = (ggv) r4pVar3.f56p;
                        dc31 dc31Var = (dc31) r4pVar3.s;
                        return new tq7(new ls7(new wr7(szq.a(), new xid(context6, new vr51(ggvVar2, (byte) 5), b2), dc31Var, new vr51(ggvVar2, (byte) 5))), new r3x0((byte) 29));
                    case 3:
                        r4p r4pVar4 = (r4p) wdmVar2.b;
                        Context context7 = (Context) r4pVar4.o;
                        return new tq7(new hq30(new rp30(szq.a(), new vr51((ggv) r4pVar4.f56p, (byte) 5), context7)), new nbc((byte) 11));
                    case 4:
                        r4p r4pVar5 = (r4p) wdmVar2.b;
                        yqg yqgVar2 = (yqg) r4pVar5.g;
                        n1k n1kVar = (n1k) r4pVar5.a;
                        c8o.l(n1kVar);
                        oj3 oj3Var = (oj3) r4pVar5.A;
                        rzo rzoVar = (rzo) r4pVar5.B;
                        c8o.l(rzoVar);
                        return new tq7(new wbn0(yqgVar2, n1kVar, wg0.r(new ycc1(oj3Var, rzoVar, (byte) 14)), (ycm) r4pVar5.C, new br0((aas) r4pVar5.D), new o15(false, (luk) r4pVar5.q)), new mzy((byte) 1));
                    case 5:
                        r4p r4pVar6 = (r4p) wdmVar2.b;
                        return new tq7(new o9y0(new b9y0(new pux0((xrc0) r4pVar6.c, (uu00) r4pVar6.d, b3))), new fza((byte) 21));
                    case 6:
                        r4p r4pVar7 = (r4p) wdmVar2.b;
                        Context context8 = (Context) r4pVar7.o;
                        ggv ggvVar3 = (ggv) r4pVar7.f56p;
                        dc31 dc31Var2 = (dc31) r4pVar7.s;
                        return new tq7(new v1e1(new g1e1(szq.a(), new xid(context8, new vr51(ggvVar3, (byte) 5), b2), dc31Var2)), new hfb((byte) 27));
                    case 7:
                        r4p r4pVar8 = (r4p) wdmVar2.b;
                        Context context9 = (Context) r4pVar8.o;
                        ggv ggvVar4 = (ggv) r4pVar8.f56p;
                        zxa zxaVar = (zxa) r4pVar8.n;
                        gw70 gw70Var2 = (gw70) r4pVar8.l;
                        dc31 dc31Var3 = (dc31) r4pVar8.s;
                        ewn0 ewn0Var = (ewn0) r4pVar8.t;
                        k2q k2qVar = new k2q(new jij1(context9, ggvVar4, zxaVar, gw70Var2, dc31Var3, ewn0Var, (bbb1) r4pVar8.u, (g871) r4pVar8.v, (lag1) r4pVar8.w, (u8v) r4pVar8.x, (RetrofitMaker) r4pVar8.y, (qns0) r4pVar8.z));
                        xid xidVar = new xid(context9, new vr51(ggvVar4, (byte) 5), b2);
                        Object obj2 = k2qVar.c;
                        return new tq7(new f4k1(new p3k1(szq.a(), dc31Var3, xidVar, ewn0Var, d1j1.r((luq) ((jly0) obj2).get()), d1j1.q((luq) ((jly0) obj2).get()), context9)), new jxa((byte) 29));
                    case 8:
                        r4p r4pVar9 = (r4p) wdmVar2.b;
                        Context context10 = (Context) r4pVar9.o;
                        ggv ggvVar5 = (ggv) r4pVar9.f56p;
                        return new tq7(new qgj1(new zfj1(szq.a(), (wh41) r4pVar9.r, new vr51(ggvVar5, (byte) 5), context10)), new mta((byte) 29));
                    case 9:
                        return new g7g1(new f7g1(), new mzy((byte) 0));
                    case 10:
                        r4p r4pVar10 = (r4p) wdmVar2.b;
                        return new rhf(new phf((woa) r4pVar10.e, (kma) r4pVar10.f, (yqg) r4pVar10.g, (gm31) r4pVar10.h, (em31) r4pVar10.i, (q8n) r4pVar10.j, (q8n) r4pVar10.k), new ubc((byte) 1));
                    default:
                        jah.e(b4);
                        return null;
                }
            case 7:
                vi11 vi11Var = (vi11) ((tjq) obj).b;
                if (b4 == 0) {
                    cex0 cex0Var = (cex0) vi11Var.b;
                    c8o.l(cex0Var);
                    return cex0Var;
                }
                if (b4 == 1) {
                    mu2 mu2Var = (mu2) vi11Var.c;
                    c8o.l(mu2Var);
                    return mu2Var;
                }
                if (b4 != 2) {
                    if (b4 == 3) {
                        return (kbd) ((kly0) vi11Var.f).get();
                    }
                    jah.e(b4);
                    return null;
                }
                add addVar = (add) vi11Var.d;
                c8o.l(addVar);
                pni1 pni1Var = (pni1) vi11Var.e;
                c8o.l(pni1Var);
                return new pki1(addVar, pni1Var);
            case 8:
                return b();
            case 9:
                bf71 bf71Var = (bf71) ((yjq) obj).c;
                if (b4 == 0) {
                    g871 g871Var = bf71Var.a;
                    xm41 xm41Var = bf71Var.b;
                    m971 m971Var = bf71Var.c;
                    k7d k7dVar = bf71Var.d;
                    add addVar2 = bf71Var.e;
                    i8h1 i8h1Var = bf71Var.f;
                    xxl0 xxl0Var = bf71Var.g;
                    c8o.l(xxl0Var);
                    Context context11 = bf71Var.h;
                    a1r0 a1r0Var2 = bf71Var.i;
                    i3j0 i3j0Var = bf71Var.j;
                    lzn0 lzn0Var7 = bf71Var.k;
                    dg30 dg30Var = bf71Var.l;
                    wh71 wh71Var = bf71Var.v;
                    c8o.l(wh71Var);
                    fjb fjbVar = bf71Var.o;
                    q8n q8nVar3 = bf71Var.t;
                    pni1 pni1Var2 = bf71Var.A;
                    ol71 ol71Var = bf71Var.B;
                    c8o.l(ol71Var);
                    return new axp(new i7d(g871Var, xm41Var, m971Var, k7dVar, addVar2, i8h1Var, xxl0Var, context11, a1r0Var2, i3j0Var, lzn0Var7, dg30Var, wh71Var, fjbVar, q8nVar3, pni1Var2, ol71Var));
                }
                if (b4 != 1) {
                    if (b4 != 2) {
                        if (b4 == 3) {
                            return new zap(new vun(bf71Var.y, (byte) 27));
                        }
                        jah.e(b4);
                        return null;
                    }
                    hyl0 hyl0Var = bf71Var.w;
                    c8o.l(hyl0Var);
                    q8n q8nVar4 = bf71Var.s;
                    flw0 flw0Var = bf71Var.u;
                    c8o.l(flw0Var);
                    wh71 wh71Var2 = bf71Var.v;
                    c8o.l(wh71Var2);
                    return new vyp(new wmy(hyl0Var, q8nVar4, flw0Var, wh71Var2, bf71Var.r, bf71Var.z));
                }
                i8h1 i8h1Var2 = bf71Var.f;
                g871 g871Var2 = bf71Var.a;
                Context context12 = bf71Var.h;
                drj0 drj0Var = bf71Var.n;
                xxl0 xxl0Var2 = bf71Var.g;
                c8o.l(xxl0Var2);
                u690 u690Var = bf71Var.f2p;
                RetrofitMaker retrofitMaker = bf71Var.q;
                za71 za71Var = bf71Var.r;
                it8 it8Var = bf71Var.m;
                q8n q8nVar5 = bf71Var.t;
                wh71 wh71Var3 = bf71Var.v;
                c8o.l(wh71Var3);
                Set set = bf71Var.x;
                ol71 ol71Var2 = bf71Var.B;
                c8o.l(ol71Var2);
                return new pwp(new s24(i8h1Var2, g871Var2, context12, drj0Var, xxl0Var2, u690Var, retrofitMaker, za71Var, it8Var, q8nVar5, wh71Var3, set, ol71Var2, (byte) 16));
            case 10:
                return c();
            case 11:
                return d();
            case 12:
                a680 a680Var = (a680) obj;
                if (b4 == 0) {
                    return new mir0(((b2r0) ((jly0) a680Var.c).get()).a());
                }
                if (b4 == 1) {
                    c2r0 c2r0Var = (c2r0) ((sj81) a680Var.a).f.get();
                    c8o.l(c2r0Var);
                    uj81 uj81Var = (uj81) a680Var.b;
                    AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                    return c2r0Var.e(uj81Var, yon1.G1("CHILD_LED_SIGNUP_PARENTAL_CONSENT_EDUCATION", "child-led-signup/parental-consent-education", 341, "child-led-signup"), nik1.b7.a());
                }
                if (b4 == 2) {
                    return new wj81((b2r0) ((jly0) a680Var.c).get(), (e7l0) ((jly0) a680Var.e).get());
                }
                if (b4 == 3) {
                    r6h1 r6h1Var = r6h1.c;
                    return new e7l0();
                }
                jah.e(b4);
                return null;
            case 13:
                return e();
            case 14:
                tjq tjqVar = (tjq) obj;
                if (b4 == 0) {
                    return new zxo(this, (byte) 1);
                }
                if (b4 != 1) {
                    if (b4 == 2) {
                        return new mir0(((b2r0) ((jly0) tjqVar.a).get()).a());
                    }
                    jah.e(b4);
                    return null;
                }
                c2r0 c2r0Var2 = (c2r0) ((rk81) tjqVar.b).c.get();
                c8o.l(c2r0Var2);
                qk81 qk81Var = (qk81) tjqVar.c;
                AtomicReferenceArray atomicReferenceArray3 = p6r0.e;
                return c2r0Var2.e(qk81Var, yon1.G1("CHILD_LED_SIGNUP_SHARE_PARENTAL_CONSENT", "child-led-signup/share-parental-consent", 343, "child-led-signup"), nik1.c7.a());
            case 15:
                return f();
            case 16:
                return g();
            case 17:
                return h();
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return i();
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return j();
            case 20:
                return k();
            case 21:
                return l();
            case 22:
                return m();
            case 23:
                return n();
            case 24:
                return o();
            case 25:
                return p();
            case 26:
                return q();
            case 27:
                return r();
            case 28:
                return s();
            default:
                uw0 uw0Var = (uw0) obj;
                switch (b4) {
                    case 0:
                        return new isq(this);
                    case 1:
                        return new axo((byte) 2);
                    case 2:
                        return new bxo((byte) 2);
                    case 3:
                        return new jsq(this);
                    case 4:
                        PlayOrigin playOrigin = new myq0((q7r0) uw0Var.e).get();
                        return PlayOrigin.builder("page_match").featureVersion(playOrigin.featureVersion()).viewUri(playOrigin.viewUri()).referrerIdentifier(playOrigin.referrerIdentifier()).build();
                    case 5:
                        return new ksq(this);
                    case 6:
                        return new a931(new CosmosCoroutineTransport(new r8c((CallbackRouter) ((isc1) uw0Var.d).c.get(), (byte) 12)));
                    case 7:
                        return ((t8u0) ((isc1) uw0Var.d).n.get()).a(((q7r0) uw0Var.e).d.c.getLifecycle()).a();
                    case 8:
                        return new cxo((byte) 2);
                    case 9:
                        return new hlp((byte) 1);
                    case 10:
                        return new uep((byte) 1);
                    case 11:
                        six0 six0Var = (six0) ((isc1) uw0Var.d).k.get();
                        AtomicReferenceArray atomicReferenceArray4 = p6r0.e;
                        return new e5b0(30, Collections.singletonList(six0.b(six0Var, yon1.G1("PAGE_MATCH_SUCCESS", "page-match/success", 1396, "page-match"), 2)), (List) null);
                    default:
                        jah.e(b4);
                        return null;
                }
        }
    }
}
