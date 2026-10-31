package p;

import android.content.Context;
import android.content.Intent;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.nativeadshomeformats.nativeadshomeformats.impl.help.HelpWebViewActivity;
import java.util.Optional;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class eri0 extends a8d1 implements bv30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eri0(avl1 avl1Var, lnm lnmVar, byte b) {
        super(5, lnmVar);
        this.a = b;
        this.c = avl1Var;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        byte b = this.a;
        byte b2 = 5;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                eri0 eri0Var = new eri0((avl1) this.c, (lnm) obj5, (byte) 0);
                eri0Var.b = (cri0) obj2;
                eri0Var.invokeSuspend(rih1Var);
                break;
            case 1:
                eri0 eri0Var2 = new eri0((avl1) this.c, (lnm) obj5, (byte) 1);
                eri0Var2.b = (kri0) obj2;
                eri0Var2.invokeSuspend(rih1Var);
                break;
            case 2:
                eri0 eri0Var3 = new eri0((avl1) this.c, (lnm) obj5, (byte) 2);
                eri0Var3.b = (uvj0) obj3;
                eri0Var3.invokeSuspend(rih1Var);
                break;
            case 3:
                eri0 eri0Var4 = new eri0((avl1) this.c, (lnm) obj5, (byte) 3);
                eri0Var4.b = (ikk0) obj3;
                eri0Var4.invokeSuspend(rih1Var);
                break;
            case 4:
                eri0 eri0Var5 = new eri0((avl1) this.c, (lnm) obj5, (byte) 4);
                eri0Var5.b = (llk0) obj3;
                eri0Var5.invokeSuspend(rih1Var);
                break;
            case 5:
                eri0 eri0Var6 = new eri0((avl1) this.c, (lnm) obj5, b2);
                eri0Var6.b = (dls0) obj3;
                eri0Var6.invokeSuspend(rih1Var);
                break;
            case 6:
                eri0 eri0Var7 = new eri0((int) b2, (lnm) obj5, (byte) 6);
                eri0Var7.b = (kqt0) obj;
                eri0Var7.c = (iqt0) obj3;
                eri0Var7.invokeSuspend(rih1Var);
                break;
            case 7:
                eri0 eri0Var8 = new eri0((int) b2, (lnm) obj5, (byte) 7);
                eri0Var8.b = (dnu0) obj;
                eri0Var8.c = (cnu0) obj3;
                eri0Var8.invokeSuspend(rih1Var);
                break;
            case 8:
                eri0 eri0Var9 = new eri0((int) b2, (lnm) obj5, (byte) 8);
                eri0Var9.b = (dvu0) obj;
                eri0Var9.c = (xuu0) obj3;
                eri0Var9.invokeSuspend(rih1Var);
                break;
            case 9:
                eri0 eri0Var10 = new eri0((avl1) this.c, (lnm) obj5, (byte) 9);
                eri0Var10.b = (gaz0) obj2;
                eri0Var10.invokeSuspend(rih1Var);
                break;
            case 10:
                eri0 eri0Var11 = new eri0((avl1) this.c, (lnm) obj5, (byte) 10);
                eri0Var11.b = (riz0) obj3;
                eri0Var11.invokeSuspend(rih1Var);
                break;
            case 11:
                eri0 eri0Var12 = new eri0((avl1) this.c, (lnm) obj5, (byte) 11);
                eri0Var12.b = (jsz0) obj3;
                eri0Var12.invokeSuspend(rih1Var);
                break;
            case 12:
                eri0 eri0Var13 = new eri0((avl1) this.c, (lnm) obj5, (byte) 12);
                eri0Var13.b = (jt51) obj3;
                eri0Var13.invokeSuspend(rih1Var);
                break;
            case 13:
                eri0 eri0Var14 = new eri0((avl1) this.c, (lnm) obj5, (byte) 13);
                eri0Var14.b = (tqw) obj4;
                eri0Var14.invokeSuspend(rih1Var);
                break;
            case 14:
                eri0 eri0Var15 = new eri0((avl1) this.c, (lnm) obj5, (byte) 14);
                eri0Var15.b = (td81) obj3;
                eri0Var15.invokeSuspend(rih1Var);
                break;
            case 15:
                eri0 eri0Var16 = new eri0((avl1) this.c, (lnm) obj5, (byte) 15);
                eri0Var16.b = (w0b1) obj3;
                eri0Var16.invokeSuspend(rih1Var);
                break;
            case 16:
                eri0 eri0Var17 = new eri0((int) b2, (lnm) obj5, (byte) 16);
                eri0Var17.b = (zyb1) obj;
                eri0Var17.c = (yyb1) obj3;
                eri0Var17.invokeSuspend(rih1Var);
                break;
            case 17:
                eri0 eri0Var18 = new eri0((avl1) this.c, (lnm) obj5, (byte) 17);
                eri0Var18.b = (qpd1) obj3;
                eri0Var18.invokeSuspend(rih1Var);
                break;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                eri0 eri0Var19 = new eri0((avl1) this.c, (lnm) obj5, (byte) 18);
                eri0Var19.b = (srf1) obj3;
                eri0Var19.invokeSuspend(rih1Var);
                break;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                eri0 eri0Var20 = new eri0((int) b2, (lnm) obj5, (byte) 19);
                eri0Var20.b = (kzf1) obj;
                eri0Var20.c = (jzf1) obj3;
                eri0Var20.invokeSuspend(rih1Var);
                break;
            case 20:
                eri0 eri0Var21 = new eri0((int) b2, (lnm) obj5, (byte) 20);
                eri0Var21.b = (tph1) obj;
                eri0Var21.c = (sph1) obj3;
                eri0Var21.invokeSuspend(rih1Var);
                break;
            case 21:
                eri0 eri0Var22 = new eri0((avl1) this.c, (lnm) obj5, (byte) 21);
                eri0Var22.b = (cxc0) obj;
                eri0Var22.invokeSuspend(rih1Var);
                break;
            case 22:
                eri0 eri0Var23 = new eri0((avl1) this.c, (lnm) obj5, (byte) 22);
                eri0Var23.b = (g3j1) obj3;
                eri0Var23.invokeSuspend(rih1Var);
                break;
            case 23:
                eri0 eri0Var24 = new eri0((avl1) this.c, (lnm) obj5, (byte) 23);
                eri0Var24.b = (lzj1) obj;
                eri0Var24.invokeSuspend(rih1Var);
                break;
            case 24:
                eri0 eri0Var25 = new eri0((int) b2, (lnm) obj5, (byte) 24);
                eri0Var25.b = (cak1) obj;
                eri0Var25.c = (bak1) obj3;
                eri0Var25.invokeSuspend(rih1Var);
                break;
            case 25:
                eri0 eri0Var26 = new eri0((int) b2, (lnm) obj5, (byte) 25);
                eri0Var26.b = (jak1) obj;
                eri0Var26.c = (iak1) obj3;
                eri0Var26.invokeSuspend(rih1Var);
                break;
            default:
                eri0 eri0Var27 = new eri0((int) b2, (lnm) obj5, (byte) 26);
                eri0Var27.b = (xpk1) obj;
                eri0Var27.c = (wpk1) obj3;
                eri0Var27.invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        l2k0 t1k0Var = q2k0.a;
        byte b2 = 1;
        byte b3 = 0;
        lnm lnmVar = null;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                Optional optional = (Optional) ((jd6) this.c).f;
                cri0 cri0Var = (cri0) this.b;
                hm5.M(obj);
                jri0 jri0Var = cri0Var.a;
                if ((jri0Var instanceof jri0) && optional.isPresent()) {
                    ((ori0) optional.get()).a(jri0Var.d);
                }
                return rih1Var;
            case 1:
                Optional optional2 = (Optional) ((ng20) this.c).b;
                jri0 jri0Var2 = (kri0) this.b;
                hm5.M(obj);
                if ((jri0Var2 instanceof jri0) && optional2.isPresent()) {
                    ((ori0) optional2.get()).a(jri0Var2.d);
                }
                return rih1Var;
            case 2:
                tvj0 tvj0Var = (uvj0) this.b;
                hm5.M(obj);
                r7j0 r7j0Var = (r7j0) ((qlb) this.c).e;
                if (tvj0Var instanceof tvj0) {
                    t1k0Var = new l2k0(tvj0Var.a);
                } else if (tvj0Var instanceof qvj0) {
                    t1k0Var = new w1k0((s69) null, (s69) null, (duk1) null);
                } else if (tvj0Var instanceof nvj0) {
                    t1k0Var = new f2k0(((nvj0) tvj0Var).a);
                } else if (tvj0Var instanceof svj0) {
                    t1k0Var = new h2k0(((svj0) tvj0Var).a);
                } else if (tvj0Var instanceof pvj0) {
                    t1k0Var = new u1k0((r920) null, (r920) null, (ha20) null);
                } else if (tvj0Var instanceof rvj0) {
                    t1k0Var = new g2k0(((rvj0) tvj0Var).a);
                } else if (tvj0Var instanceof ovj0) {
                    t1k0Var = new t1k0((gez) null, (gez) null, (jez) null);
                } else if (!u890.j(tvj0Var, mvj0.a)) {
                    eg.o();
                    return null;
                }
                r7j0Var.invoke(t1k0Var);
                return rih1Var;
            case 3:
                hkk0 hkk0Var = (ikk0) this.b;
                hm5.M(obj);
                r7j0 r7j0Var2 = (r7j0) ((el9) this.c).g;
                if (hkk0Var instanceof hkk0) {
                    t1k0Var = new l2k0(hkk0Var.a);
                } else if (hkk0Var instanceof bkk0) {
                    bkk0 bkk0Var = (bkk0) hkk0Var;
                    t1k0Var = new w1k0(bkk0Var.a, bkk0Var.b, bkk0Var.d);
                } else if (hkk0Var instanceof ckk0) {
                    t1k0Var = new g2k0(((ckk0) hkk0Var).a);
                } else if (hkk0Var instanceof yjk0) {
                    yjk0 yjk0Var = (yjk0) hkk0Var;
                    t1k0Var = new t1k0(yjk0Var.a, yjk0Var.b, yjk0Var.d);
                } else if (hkk0Var instanceof dkk0) {
                    t1k0Var = new h2k0(((dkk0) hkk0Var).a);
                } else if (hkk0Var instanceof zjk0) {
                    zjk0 zjk0Var = (zjk0) hkk0Var;
                    t1k0Var = new u1k0(zjk0Var.a, zjk0Var.b, zjk0Var.d);
                } else if (hkk0Var instanceof ekk0) {
                    t1k0Var = new i2k0(((ekk0) hkk0Var).a);
                } else if (hkk0Var instanceof akk0) {
                    akk0 akk0Var = (akk0) hkk0Var;
                    t1k0Var = new v1k0(akk0Var.a, akk0Var.b, akk0Var.d);
                } else if (hkk0Var instanceof gkk0) {
                    t1k0Var = new k2k0(((gkk0) hkk0Var).a);
                } else if (hkk0Var instanceof fkk0) {
                    t1k0Var = new j2k0(((fkk0) hkk0Var).a);
                } else if (hkk0Var instanceof xjk0) {
                    t1k0Var = new s3k0(((xjk0) hkk0Var).a.d);
                } else if (!u890.j(hkk0Var, wjk0.a)) {
                    eg.o();
                    return null;
                }
                r7j0Var2.invoke(t1k0Var);
                return rih1Var;
            case 4:
                iu30 iu30Var = (iu30) ((nm1) this.c).f;
                llk0 llk0Var = (llk0) this.b;
                hm5.M(obj);
                if (u890.j(llk0Var, jlk0.a) || u890.j(llk0Var, klk0.a)) {
                    iu30Var.invoke(llk0Var);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 5:
                kls0 kls0Var = (kls0) this.c;
                llm llmVar = (llm) kls0Var.e;
                fg60 fg60Var = (fg60) kls0Var.b;
                bpb1 bpb1Var = (bpb1) kls0Var.f;
                dls0 dls0Var = (dls0) this.b;
                hm5.M(obj);
                if (u890.j(dls0Var, als0.a)) {
                    if (fg60Var.a()) {
                        if (((Boolean) fg60Var.d.a.getValue()).booleanValue()) {
                            fn31.T(llmVar, (o8n) null, 0, new ils0(kls0Var, lnmVar, b3), 3);
                        } else {
                            bpb1Var.m((Object) null, Boolean.TRUE);
                        }
                    }
                } else if (u890.j(dls0Var, bls0.a)) {
                    bpb1Var.m((Object) null, Boolean.FALSE);
                    if (fg60Var.a()) {
                        fn31.T(llmVar, (o8n) null, 0, new ils0(kls0Var, lnmVar, b2), 3);
                    }
                } else {
                    if (!u890.j(dls0Var, cls0.a)) {
                        eg.o();
                        return null;
                    }
                    bpb1Var.m((Object) null, Boolean.FALSE);
                }
                return rih1Var;
            case 6:
                kqt0 kqt0Var = (kqt0) this.b;
                iqt0 iqt0Var = (iqt0) this.c;
                hm5.M(obj);
                if (!(iqt0Var instanceof iqt0)) {
                    eg.o();
                    return null;
                }
                if (!iqt0Var.a) {
                    kqt0Var.d.invoke();
                }
                return rih1Var;
            case 7:
                dnu0 dnu0Var = (dnu0) this.b;
                cnu0 cnu0Var = (cnu0) this.c;
                hm5.M(obj);
                dnu0Var.h.invoke(cnu0Var);
                return rih1Var;
            case 8:
                dvu0 dvu0Var = (dvu0) this.b;
                xuu0 xuu0Var = (xuu0) this.c;
                hm5.M(obj);
                dvu0Var.c.invoke(xuu0Var);
                return rih1Var;
            case 9:
                gaz0 gaz0Var = (gaz0) this.b;
                hm5.M(obj);
                nl9 nl9Var = (nl9) this.c;
                xab1 xab1Var = (xab1) nl9Var.t;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                nl9Var.t = fn31.T(smo1.e((q8n) nl9Var.i), (o8n) null, 0, new ian0(nl9Var, gaz0Var, (lnm) null, (byte) 21), 3);
                return rih1Var;
            case 10:
                xiz0 xiz0Var = (xiz0) this.c;
                qiz0 qiz0Var = (riz0) this.b;
                hm5.M(obj);
                if (!u890.j(qiz0Var, oiz0.a)) {
                    if (u890.j(qiz0Var, piz0.a)) {
                        xiz0Var.b.e();
                    } else {
                        if (!(qiz0Var instanceof qiz0)) {
                            eg.o();
                            return null;
                        }
                        rgn0 rgn0Var = xiz0Var.d;
                        if (rgn0Var != null) {
                            rgn0Var.a.m((Object) null, qiz0Var.a ? ngn0.a : new ogn0(false));
                        }
                    }
                }
                return rih1Var;
            case 11:
                jsz0 jsz0Var = (jsz0) this.b;
                hm5.M(obj);
                if (btz0.a[jsz0Var.ordinal()] == 1) {
                    return rih1Var;
                }
                eg.o();
                return null;
            case 12:
                s061 s061Var = (s061) ((ngs0) this.c).d;
                jt51 jt51Var = (jt51) this.b;
                hm5.M(obj);
                if (jt51Var instanceof it51) {
                    s061Var.a.l(s061Var.e.a.getValue());
                } else {
                    if (!(jt51Var instanceof ht51)) {
                        eg.o();
                        return null;
                    }
                    s061Var.a();
                }
                return rih1Var;
            case 13:
                tqw tqwVar = (tqw) this.b;
                hm5.M(obj);
                tt51 tt51Var = (tt51) this.c;
                fn31.T(tt51Var.b, (o8n) null, 0, new lc41(tt51Var, tqwVar, lnmVar, (byte) 19), 3);
                return rih1Var;
            case 14:
                td81 td81Var = (td81) this.b;
                hm5.M(obj);
                if (!u890.j(td81Var, td81.a)) {
                    eg.o();
                    return null;
                }
                Context context = ((zd81) this.c).c;
                int i = HelpWebViewActivity.g1;
                context.startActivity(new Intent(context, (Class<?>) HelpWebViewActivity.class));
                return rih1Var;
            case 15:
                w0b1 w0b1Var = (w0b1) this.b;
                hm5.M(obj);
                if (w0b1Var != null) {
                    ao0.a(((c1b1) this.c).b, co0.Z, w0b1Var.a, (Long) null, (String) null, (String) null, 124);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 16:
                zyb1 zyb1Var = (zyb1) this.b;
                yyb1 yyb1Var = (yyb1) this.c;
                hm5.M(obj);
                if (fzb1.a[yyb1Var.ordinal()] == 1) {
                    zyb1Var.a.invoke();
                    return rih1Var;
                }
                eg.o();
                return null;
            case 17:
                qpd1 qpd1Var = (qpd1) this.b;
                hm5.M(obj);
                if (qpd1Var != null) {
                    ((q4h0) ((t6k0) this.c).g).invoke(qpd1Var);
                    return rih1Var;
                }
                eg.o();
                return null;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                q4h0 q4h0Var = (q4h0) ((tva1) this.c).c;
                srf1 srf1Var = (srf1) this.b;
                hm5.M(obj);
                if ((srf1Var instanceof prf1) || (srf1Var instanceof orf1) || (srf1Var instanceof qrf1) || (srf1Var instanceof nrf1) || (srf1Var instanceof rrf1)) {
                    q4h0Var.invoke(srf1Var);
                    return rih1Var;
                }
                eg.o();
                return null;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                kzf1 kzf1Var = (kzf1) this.b;
                jzf1 jzf1Var = (jzf1) this.c;
                hm5.M(obj);
                kzf1Var.f.invoke(jzf1Var.a);
                return rih1Var;
            case 20:
                tph1 tph1Var = (tph1) this.b;
                sph1 sph1Var = (sph1) this.c;
                hm5.M(obj);
                if (u890.j(sph1Var, sph1.a)) {
                    tph1Var.c.invoke();
                    return rih1Var;
                }
                eg.o();
                return null;
            case 21:
                cxc0 cxc0Var = (cxc0) this.b;
                hm5.M(obj);
                drp0 drp0Var = (drp0) ((smp0) this.c).c;
                String str = cxc0Var.f.a;
                if (str.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") || str.equals("spotify:collection:tracks") || str.equals("spotify:internal:collection:tracks") || (nhc1.Y(str, "spotify:user:", false) && nhc1.R(str, ":collection", false))) {
                    b2 = 3;
                }
                drp0Var.g(b2, cxc0Var.f.a);
                return rih1Var;
            case 22:
                f3j1 f3j1Var = (g3j1) this.b;
                hm5.M(obj);
                if (!(f3j1Var instanceof c3j1) && !(f3j1Var instanceof d3j1)) {
                    if (f3j1Var instanceof f3j1) {
                        z710.d((z710) ((hw2) this.c).f, f3j1Var.a, false, 6);
                    } else if (!(f3j1Var instanceof e3j1)) {
                        eg.o();
                        return null;
                    }
                }
                return rih1Var;
            case 23:
                lzj1 lzj1Var = (lzj1) this.b;
                hm5.M(obj);
                ((pzj1) this.c).c.invoke(lzj1Var.b);
                return rih1Var;
            case 24:
                cak1 cak1Var = (cak1) this.b;
                bak1 bak1Var = (bak1) this.c;
                hm5.M(obj);
                if (u890.j(bak1Var, bak1.a)) {
                    cak1Var.a.invoke();
                    return rih1Var;
                }
                eg.o();
                return null;
            case 25:
                jak1 jak1Var = (jak1) this.b;
                iak1 iak1Var = (iak1) this.c;
                hm5.M(obj);
                if (u890.j(iak1Var, iak1.a)) {
                    jak1Var.a.invoke();
                    return rih1Var;
                }
                eg.o();
                return null;
            default:
                xpk1 xpk1Var = (xpk1) this.b;
                wpk1 wpk1Var = (wpk1) this.c;
                hm5.M(obj);
                if (u890.j(wpk1Var, wpk1.a)) {
                    xpk1Var.b.invoke();
                    return rih1Var;
                }
                eg.o();
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eri0(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }
}
