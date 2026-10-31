package p;

import android.app.Activity;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.esperanto.esperantocosmos.CosmosTransport;
import com.spotify.player.model.PlayOrigin;
import com.spotify.pses.v1.proto.Header;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class i8p implements jly0 {
    public final /* synthetic */ byte a;
    public final boolean b;
    public final Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ i8p(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    public final Object get() {
        byte b = this.a;
        byte b2 = 3;
        byte b3 = 2;
        Object obj = this.c;
        boolean z = this.b;
        String gmnVar = null;
        switch (b) {
            case 0:
                if (!z) {
                    return new g8p(this);
                }
                if (z) {
                    return new h8p(this);
                }
                jah.e(z ? 1 : 0);
                return null;
            case 1:
                mo9 mo9Var = mo9.P0;
                c21 c21Var = (c21) ((x2p) obj).c;
                if (z) {
                    if (!z) {
                        jah.e(z ? 1 : 0);
                        return null;
                    }
                    yqg yqgVar = (yqg) c21Var.e;
                    c8o.l(yqgVar);
                    Flowable flowable = (Flowable) c21Var.b;
                    c8o.l(flowable);
                    Scheduler scheduler = (Scheduler) ((mp8) c21Var.t).b;
                    c8o.m(scheduler);
                    m021 m021Var = new m021(flowable, scheduler, (byte) 7);
                    Flowable flowable2 = (Flowable) c21Var.b;
                    c8o.l(flowable2);
                    return new o6v0(yqgVar, m021Var, flowable2.j(mo9Var));
                }
                muz muzVar = (muz) c21Var.i;
                tgt0 tgt0Var = new tgt0((PlayOrigin) c21Var.g);
                ruz ruzVar = (ruz) c21Var.h;
                b7r0 b7r0Var = (b7r0) c21Var.d;
                c8o.l(b7r0Var);
                Flowable flowable3 = (Flowable) c21Var.b;
                c8o.l(flowable3);
                Flowable flowableJ = flowable3.j(mo9.N0);
                Flowable flowable4 = (Flowable) c21Var.b;
                c8o.l(flowable4);
                Flowable flowableJ2 = flowable4.j(mo9Var);
                Flowable flowable5 = (Flowable) c21Var.b;
                c8o.l(flowable5);
                Flowable flowableJ3 = flowable5.j(mo9.X);
                dy4 dy4Var = (dy4) c21Var.c;
                c8o.l(dy4Var);
                return new s8u0(muzVar, tgt0Var, ruzVar, b7r0Var, flowableJ, flowableJ2, flowableJ3, dy4Var.a(), (z281) c21Var.f);
            case 2:
                t7p t7pVar = (t7p) obj;
                if (!z) {
                    return pzm.h((mos) ((gtm) t7pVar.b).a.get());
                }
                if (z) {
                    return cwl1.C((q7r0) t7pVar.c);
                }
                jah.e(z ? 1 : 0);
                return null;
            case 3:
                t7p t7pVar2 = (t7p) obj;
                if (!z) {
                    return pzm.h((mos) ((xtm) t7pVar2.b).a.get());
                }
                if (z) {
                    return cwl1.C((q7r0) t7pVar2.c);
                }
                jah.e(z ? 1 : 0);
                return null;
            case 4:
                kzp kzpVar = (kzp) ((x2p) obj).c;
                if (!z) {
                    return new v1p(this, b3);
                }
                if (!z) {
                    jah.e(z ? 1 : 0);
                    return null;
                }
                lzn0 lzn0Var = (lzn0) kzpVar.b.i.get();
                c8o.l(lzn0Var);
                a1r0 a1r0Var = (a1r0) kzpVar.b.V0.get();
                c8o.l(a1r0Var);
                Activity activity = (Activity) kzpVar.b.f.a;
                c8o.l(activity);
                return new et90(activity, lzn0Var, a1r0Var);
            case 5:
                q7r0 q7r0Var = ((w8p) obj).a;
                if (!z) {
                    return cwl1.C(q7r0Var);
                }
                if (!z) {
                    jah.e(z ? 1 : 0);
                    return null;
                }
                ttm0 ttm0VarE = cwl1.E(q7r0Var);
                c8o.m(ttm0VarE);
                return ttm0VarE;
            case 6:
                cp31 cp31Var = (cp31) obj;
                lnn lnnVar = (lnn) cp31Var.d;
                hmn hmnVar = (hmn) cp31Var.a;
                if (!z) {
                    yqg yqgVarA = hmnVar.a();
                    c8o.l(yqgVarA);
                    lzn0 lzn0VarC = hmnVar.c();
                    c8o.l(lzn0VarC);
                    ldo ldoVar = new ldo(yqgVarA, lzn0VarC);
                    ym81 ym81VarD = hmnVar.d();
                    c8o.l(ym81VarD);
                    List list = (List) lnnVar.a.get();
                    c8o.l(list);
                    return new gmn(ldoVar, ym81VarD, list);
                }
                if (!z) {
                    jah.e(z ? 1 : 0);
                    return null;
                }
                yqg yqgVarA2 = hmnVar.a();
                c8o.l(yqgVarA2);
                lzn0 lzn0VarC2 = hmnVar.c();
                c8o.l(lzn0VarC2);
                ldo ldoVar2 = new ldo(yqgVarA2, lzn0VarC2);
                imn imnVarB = hmnVar.b();
                c8o.l(imnVarB);
                ym81 ym81VarD2 = hmnVar.d();
                c8o.l(ym81VarD2);
                List list2 = (List) lnnVar.b.get();
                c8o.l(list2);
                return new yxb0(ldoVar2, imnVarB, ym81VarD2, list2);
            case 7:
                k9k k9kVar = (k9k) obj;
                mpn mpnVar = (mpn) k9kVar.d;
                lpn lpnVar = (lpn) k9kVar.b;
                hmn hmnVar2 = (hmn) k9kVar.c;
                if (!z) {
                    yqg yqgVarA3 = hmnVar2.a();
                    c8o.l(yqgVarA3);
                    lzn0 lzn0VarC3 = hmnVar2.c();
                    c8o.l(lzn0VarC3);
                    ldo ldoVar3 = new ldo(yqgVarA3, lzn0VarC3);
                    ym81 ym81VarD3 = hmnVar2.d();
                    c8o.l(ym81VarD3);
                    List list3 = (List) lpnVar.b.get();
                    c8o.l(list3);
                    List list4 = list3;
                    List list5 = (List) lpnVar.d.get();
                    c8o.l(list5);
                    List list6 = list5;
                    if (mpnVar.c) {
                        list4 = list6;
                    }
                    gmnVar = new gmn(ldoVar3, ym81VarD3, list4);
                } else if (z) {
                    yqg yqgVarA4 = hmnVar2.a();
                    c8o.l(yqgVarA4);
                    lzn0 lzn0VarC4 = hmnVar2.c();
                    c8o.l(lzn0VarC4);
                    ldo ldoVar4 = new ldo(yqgVarA4, lzn0VarC4);
                    imn imnVarB2 = hmnVar2.b();
                    c8o.l(imnVarB2);
                    ym81 ym81VarD4 = hmnVar2.d();
                    c8o.l(ym81VarD4);
                    List list7 = (List) lpnVar.c.get();
                    c8o.l(list7);
                    List list8 = list7;
                    List list9 = (List) lpnVar.e.get();
                    c8o.l(list9);
                    List list10 = list9;
                    if (mpnVar.c) {
                        list8 = list10;
                    }
                    gmnVar = new yxb0(ldoVar4, imnVarB2, ym81VarD4, list8);
                } else {
                    jah.e(z ? 1 : 0);
                }
                return gmnVar;
            case 8:
                if (!z) {
                    return new v9p(this);
                }
                if (z) {
                    return new w9p(this);
                }
                jah.e(z ? 1 : 0);
                return null;
            case 9:
                t7p t7pVar3 = (t7p) obj;
                if (z) {
                    if (z) {
                        return pzm.h((mos) ((b7o) t7pVar3.c).h.get());
                    }
                    jah.e(z ? 1 : 0);
                    return null;
                }
                String str = ((c7o) t7pVar3.b).a;
                if (str == null || str.length() == 0) {
                    eg.m(l1d.m("Attempt to create CreditsPage with invalid URI: ", str));
                    return null;
                }
                kik1 kik1Var = nik1.O6;
                if (kik1Var.a(str)) {
                    return kik1Var.b(str);
                }
                eg.m("Attempt to create CreditsPage with invalid URI: ".concat(str));
                return null;
            case 10:
                mqo mqoVar = (mqo) ((x2p) obj).c;
                if (!z) {
                    return pzm.h((mos) mqoVar.j.get());
                }
                if (!z) {
                    jah.e(z ? 1 : 0);
                    return null;
                }
                cm01 cm01Var = (cm01) mqoVar.h.get();
                c8o.l(cm01Var);
                return cm01Var;
            case 11:
                ans ansVar = ((vap) obj).a;
                if (!z) {
                    r2r r2rVar = ansVar.f;
                    c8o.l(r2rVar);
                    j3r j3rVar = rzq.y;
                    return l2p1.f(r2rVar.a("android-yourlibrary-settings-defaultsavelocation-impl", ywq.O0));
                }
                if (!z) {
                    jah.e(z ? 1 : 0);
                    return null;
                }
                bl3 bl3Var = ansVar.a;
                c8o.l(bl3Var);
                q8n q8nVar = ansVar.c;
                c8o.l(q8nVar);
                return new oms(bl3Var, q8nVar);
            case 12:
                if (!z) {
                    return new bx7();
                }
                if (z) {
                    return new obp(this);
                }
                jah.e(z ? 1 : 0);
                return null;
            case 13:
                x2p x2pVar = (x2p) obj;
                bzu bzuVar = (bzu) x2pVar.c;
                if (!z) {
                    return pzm.h((mos) bzuVar.b.get());
                }
                if (!z) {
                    jah.e(z ? 1 : 0);
                    return null;
                }
                lzn0 lzn0Var2 = (lzn0) bzuVar.a.get();
                c8o.l(lzn0Var2);
                los losVar = (los) x2pVar.b.get();
                q8n q8nVar2 = (q8n) bzuVar.d.get();
                c8o.l(q8nVar2);
                return new br0(new tdo(q8nVar2, losVar, lzn0Var2));
            case 14:
                t7p t7pVar4 = (t7p) obj;
                if (!z) {
                    return pzm.h((mos) ((t7w) t7pVar4.b).a.get());
                }
                if (z) {
                    return u1n0.z((q7r0) t7pVar4.c);
                }
                jah.e(z ? 1 : 0);
                return null;
            case 15:
                t7p t7pVar5 = (t7p) obj;
                d5y d5yVar = (d5y) t7pVar5.b;
                if (!z) {
                    t8u0 t8u0Var = (t8u0) d5yVar.g.get();
                    c8o.l(t8u0Var);
                    return kmq0.x((q7r0) t7pVar5.c, t8u0Var);
                }
                if (!z) {
                    jah.e(z ? 1 : 0);
                    return null;
                }
                a18 a18Var = (a18) d5yVar.j.get();
                c8o.l(a18Var);
                return a18Var;
            case 16:
                kzp kzpVar2 = (kzp) ((t7p) obj).c;
                if (!z) {
                    return new bzo(this, b2);
                }
                if (!z) {
                    jah.e(z ? 1 : 0);
                    return null;
                }
                woa woaVar = (woa) kzpVar2.a.W8.get();
                c8o.l(woaVar);
                kma kmaVar = (kma) kzpVar2.a.a.Z1.get();
                c8o.l(kmaVar);
                fpa fpaVar = (fpa) kzpVar2.a.X8.get();
                c8o.l(fpaVar);
                pe peVar = (pe) kzpVar2.a.p9.get();
                c8o.l(peVar);
                boolean zBooleanValue = ((Boolean) kzpVar2.a.a.N1.get()).booleanValue();
                zle1 zle1Var = (zle1) kzpVar2.a.a3.get();
                c8o.l(zle1Var);
                return new k0t(woaVar, kmaVar, fpaVar, peVar, zBooleanValue, zle1Var);
            case 17:
                if (!z) {
                    return new sdp(this, (byte) 1);
                }
                if (z) {
                    return new rdp(this, (byte) 2);
                }
                jah.e(z ? 1 : 0);
                return null;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                if (!z) {
                    return new udp(this, (byte) 1);
                }
                if (z) {
                    return new qdp(this, (byte) 2);
                }
                jah.e(z ? 1 : 0);
                return null;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                ozp ozpVar = (ozp) ((t7p) obj).c;
                if (!z) {
                    return new v1p(this, b2);
                }
                if (!z) {
                    jah.e(z ? 1 : 0);
                    return null;
                }
                lzn0 lzn0Var3 = (lzn0) ozpVar.b.i.get();
                c8o.l(lzn0Var3);
                a1r0 a1r0Var2 = (a1r0) ozpVar.b.V0.get();
                c8o.l(a1r0Var2);
                Activity activity2 = (Activity) ozpVar.b.f.a;
                c8o.l(activity2);
                return new et90(activity2, lzn0Var3, a1r0Var2);
            case 20:
                wep wepVar = (wep) obj;
                if (!z) {
                    return new bqz((pov0) wepVar.b.get());
                }
                if (z) {
                    return new pov0(new CosmosTransport(new sn0((RxRouter) wepVar.a.a.get(), (byte) 19)));
                }
                jah.e(z ? 1 : 0);
                return null;
            case 21:
                t7p t7pVar6 = (t7p) obj;
                if (!z) {
                    gw70 gw70VarB = ((ryj) t7pVar6.b).b();
                    c8o.l(gw70VarB);
                    return gw70VarB;
                }
                if (z) {
                    return pzm.h((mos) ((ik10) t7pVar6.c).d.get());
                }
                jah.e(z ? 1 : 0);
                return null;
            case 22:
                vh50 vh50Var = (vh50) ((x2p) obj).c;
                if (z) {
                    if (z) {
                        return new gjp(this);
                    }
                    jah.e(z ? 1 : 0);
                    return null;
                }
                jh50 jh50Var = (jh50) vh50Var.m.get();
                c8o.l(jh50Var);
                String str2 = (String) vh50Var.o.get();
                c8o.l(str2);
                String str3 = (String) vh50Var.o.get();
                c8o.l(str3);
                hf4 hf4Var = (hf4) vh50Var.g.get();
                c8o.l(hf4Var);
                return jh50Var.a.b(str2).map(new j3v(new dh30(str3, hf4Var, (byte) 12), (byte) 26));
            case 23:
                af70 af70Var = (af70) ((qjp) obj).b;
                if (!z) {
                    fmy0 fmy0Var = (fmy0) af70Var.g.get();
                    c8o.l(fmy0Var);
                    return fmy0Var.b();
                }
                if (!z) {
                    jah.e(z ? 1 : 0);
                    return null;
                }
                wab wabVar = (wab) af70Var.b.get();
                c8o.l(wabVar);
                jkb1 jkb1Var = new jkb1();
                Header header = wabVar.c;
                jkb1Var.a = header != null ? header.getImageUrl() : null;
                return jkb1Var;
            case 24:
                vzp vzpVar = (vzp) ((qjp) obj).b;
                if (z) {
                    if (z) {
                        return new o3p(this, b3);
                    }
                    jah.e(z ? 1 : 0);
                    return null;
                }
                woa woaVar2 = (woa) vzpVar.b.W8.get();
                c8o.l(woaVar2);
                kma kmaVar2 = (kma) vzpVar.b.a.Z1.get();
                c8o.l(kmaVar2);
                fpa fpaVar2 = (fpa) vzpVar.b.X8.get();
                c8o.l(fpaVar2);
                pe peVar2 = (pe) vzpVar.b.p9.get();
                c8o.l(peVar2);
                boolean zBooleanValue2 = ((Boolean) vzpVar.b.a.N1.get()).booleanValue();
                zle1 zle1Var2 = (zle1) vzpVar.b.a3.get();
                c8o.l(zle1Var2);
                return new k0t(woaVar2, kmaVar2, fpaVar2, peVar2, zBooleanValue2, zle1Var2);
            case 25:
                qjp qjpVar = (qjp) obj;
                if (!z) {
                    return new a4n((i8p) qjpVar.c, new h7l0((byte) 2));
                }
                if (z) {
                    return u1n0.z((q7r0) qjpVar.b);
                }
                jah.e(z ? 1 : 0);
                return null;
            case 26:
                qjp qjpVar2 = (qjp) obj;
                if (z) {
                    if (z) {
                        return u1n0.z((q7r0) qjpVar2.b);
                    }
                    jah.e(z ? 1 : 0);
                    return null;
                }
                i8p i8pVar = (i8p) qjpVar2.c;
                h7l0 h7l0Var = new h7l0((byte) 3);
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-gen-alpha-kid-account-creation-legal-consent";
                x6h1VarI.f = "4.1.0";
                x6h1VarI.g = "22.0.0";
                y6h1 y6h1VarA = x6h1VarI.a();
                p7h.M(new String[]{"kid-account-creation/legal-consent", "kid-account-transition/legal-consent"});
                r6h1 r6h1Var = r6h1.c;
                return new k2c0(i8pVar, h7l0Var, new b7l0(new r6h1(kk0.l(y6h1VarA), (u8h1) null)));
            case 27:
                if (!z) {
                    return new clp(this);
                }
                if (z) {
                    return new xjn0(u1n0.z((q7r0) ((g1i) obj).d), new h7l0((byte) 4));
                }
                jah.e(z ? 1 : 0);
                return null;
            case 28:
                qjp qjpVar3 = (qjp) obj;
                if (z) {
                    if (z) {
                        return u1n0.z((q7r0) qjpVar3.b);
                    }
                    jah.e(z ? 1 : 0);
                    return null;
                }
                i8p i8pVar2 = (i8p) qjpVar3.c;
                h7l0 h7l0Var2 = new h7l0((byte) 5);
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-gen-alpha-kid-account-creation-parental-control";
                x6h1VarI2.f = "3.0.0";
                x6h1VarI2.g = "22.0.0";
                y6h1 y6h1VarA2 = x6h1VarI2.a();
                p7h.M(new String[]{"kid-account-creation/parental-control", "kid-account-transition/parental-control"});
                r6h1 r6h1Var2 = r6h1.c;
                return new qwr0(i8pVar2, h7l0Var2, new b7l0(new r6h1(kk0.l(y6h1VarA2), (u8h1) null)));
            default:
                qjp qjpVar4 = (qjp) obj;
                if (z) {
                    if (z) {
                        return u1n0.z((q7r0) qjpVar4.b);
                    }
                    jah.e(z ? 1 : 0);
                    return null;
                }
                i8p i8pVar3 = (i8p) qjpVar4.c;
                h7l0 h7l0Var3 = new h7l0((byte) 6);
                y6h1 y6h1Var3 = y6h1.i;
                x6h1 x6h1VarI3 = i3o1.i();
                x6h1VarI3.h = "music";
                x6h1VarI3.a = "mobile-gen-alpha-kid-account-creation-pin";
                x6h1VarI3.f = "3.1.0";
                x6h1VarI3.g = "22.0.0";
                y6h1 y6h1VarA3 = x6h1VarI3.a();
                p7h.M(new String[]{"kid-account-creation/pin", "kid-account-transition/pin"});
                r6h1 r6h1Var3 = r6h1.c;
                return new v1t0(i8pVar3, h7l0Var3, new b7l0(new r6h1(kk0.l(y6h1VarA3), (u8h1) null)));
        }
    }
}
