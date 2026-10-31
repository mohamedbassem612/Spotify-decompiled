package p;

import com.spotify.login.signupapi.services.model.MarketingMessagesOption;
import com.spotify.login.signupapi.services.model.PrivacyPolicyAcceptance;
import com.spotify.login.signupapi.services.model.TermsConditionAcceptance;
import com.spotify.login.signupapi.services.model.TermsData;
import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import com.spotify.mobius.extras.patterns.InnerUpdate;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lq81 implements Update {
    public final /* synthetic */ Update a;
    public final /* synthetic */ Update b;
    public final /* synthetic */ Update c;
    public final /* synthetic */ Update d;
    public final /* synthetic */ Update e;

    public lq81(Update update, Update update2, Update update3, Update update4, Update update5) {
        this.a = update;
        this.b = update2;
        this.c = update3;
        this.d = update4;
        this.e = update5;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0213  */
    /* JADX WARN: Code duplicated, block: B:102:0x021b  */
    /* JADX WARN: Code duplicated, block: B:103:0x021d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0225  */
    /* JADX WARN: Code duplicated, block: B:108:0x023c  */
    /* JADX WARN: Code duplicated, block: B:111:0x0255  */
    /* JADX WARN: Code duplicated, block: B:114:0x0267  */
    /* JADX WARN: Code duplicated, block: B:116:0x026f  */
    /* JADX WARN: Code duplicated, block: B:118:0x0275  */
    /* JADX WARN: Code duplicated, block: B:120:0x0279  */
    /* JADX WARN: Code duplicated, block: B:122:0x027d  */
    /* JADX WARN: Code duplicated, block: B:246:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:249:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:251:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:53:0x0127  */
    /* JADX WARN: Code duplicated, block: B:55:0x0132  */
    /* JADX WARN: Code duplicated, block: B:57:0x0136  */
    /* JADX WARN: Code duplicated, block: B:58:0x0139  */
    /* JADX WARN: Code duplicated, block: B:60:0x013d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0147  */
    /* JADX WARN: Code duplicated, block: B:63:0x014b  */
    /* JADX WARN: Code duplicated, block: B:64:0x0154  */
    /* JADX WARN: Code duplicated, block: B:66:0x0158  */
    /* JADX WARN: Code duplicated, block: B:69:0x0162  */
    /* JADX WARN: Code duplicated, block: B:70:0x016d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0171  */
    /* JADX WARN: Code duplicated, block: B:75:0x0196  */
    /* JADX WARN: Code duplicated, block: B:77:0x019c  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:87:0x01cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:89:0x01df  */
    /* JADX WARN: Code duplicated, block: B:92:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:93:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:95:0x0204  */
    /* JADX WARN: Code duplicated, block: B:96:0x0207  */
    /* JADX WARN: Code duplicated, block: B:98:0x020f  */
    public final Next a(Object obj, Object obj2) {
        ed bdVar;
        vjn0 vjn0Var;
        boolean z;
        wc rcVar;
        wc wcVar;
        hc ecVar;
        ub tbVar;
        qc ocVar;
        Boolean boolValueOf;
        Boolean bool;
        Boolean boolValueOf2;
        nc ncVarG;
        Boolean bool2;
        Boolean boolValueOf3;
        zc zcVarJ;
        Boolean boolValueOf4;
        String str;
        gm ylVar;
        hd40 hd40Var;
        int i;
        int i2;
        n5o n5oVar;
        String str2;
        bk8 bk8Var;
        em bmVar;
        qq81 qq81Var = (qq81) obj;
        eq81 eq81Var = (eq81) obj2;
        f0r0 f0r0Var = f0r0.c;
        pq81 pq81Var = qq81Var.a;
        wjn0 wjn0Var = qq81Var.f;
        int i3 = qq81Var.t;
        id40 id40Var = qq81Var.e;
        if (eq81Var instanceof rp81) {
            return ((InnerUpdate) this.a).a(qq81Var, eq81Var);
        }
        if (eq81Var instanceof yp81) {
            return ((InnerUpdate) this.b).a(qq81Var, eq81Var);
        }
        if (eq81Var instanceof kp81) {
            return ((InnerUpdate) this.c).a(qq81Var, eq81Var);
        }
        if (eq81Var instanceof tp81) {
            return ((InnerUpdate) this.d).a(qq81Var, eq81Var);
        }
        if (eq81Var instanceof xp81) {
            return ((InnerUpdate) this.e).a(qq81Var, eq81Var);
        }
        boolean zEquals = eq81Var.equals(gp81.a);
        ho81 ho81Var = ho81.c;
        if (zEquals) {
            return Next.a(Effects.a(new ho81[]{ho81Var}));
        }
        if (eq81Var instanceof hp81) {
            return Next.j();
        }
        if (!(eq81Var instanceof ip81)) {
            if (eq81Var instanceof op81) {
                return Next.j();
            }
            if (eq81Var.equals(sp81.a)) {
                return Next.a(Effects.a(new jo81[]{jo81.c}));
            }
            if (eq81Var instanceof up81) {
                jon1.x(qq81Var);
                if (wjn0Var.b) {
                    return Next.j();
                }
                return i3 == 0 ? Next.a(Effects.a(new ho81[]{ho81Var})) : Next.h(qq81.a(qq81Var, null, null, null, null, null, null, false, null, null, i3 - 1, null, 15871));
            }
            if (eq81Var instanceof vp81) {
                f0r0 f0r0Var2 = ((vp81) eq81Var).a;
                f0r0 f0r0VarX = jon1.x(qq81Var);
                if (f0r0Var2 != null && f0r0Var2 != f0r0VarX) {
                    return Next.j();
                }
                if (jon1.x(qq81Var) != f0r0Var) {
                    return Next.h(qq81.a(qq81Var, null, null, null, null, null, null, false, null, null, i3 + 1, null, 15871));
                }
                if (pq81Var instanceof oq81) {
                    return Next.h(qq81.a(qq81Var, null, null, null, null, null, null, false, null, null, i3 + 1, null, 15871));
                }
                return id40Var.e ? Next.j() : Next.i(qq81.a(qq81Var, null, null, null, null, id40.a(id40Var, null, false, false, false, true, 15), null, false, null, null, 0, null, 16367), Effects.a(new ko81[]{new ko81(true)}));
            }
            if (eq81Var instanceof wp81) {
                return Next.h(qq81.a(qq81Var, null, null, null, null, null, null, ((wp81) eq81Var).a, null, null, 0, null, 16319));
            }
            if (eq81Var instanceof aq81) {
                return Next.a(Effects.a(new lo81[]{new lo81(((aq81) eq81Var).a)}));
            }
            if (eq81Var.equals(cq81.a)) {
                qq81 qq81VarA = qq81.a(qq81Var, null, null, null, null, id40.a(qq81Var.e, null, false, false, false, false, 15), null, false, null, null, 0, null, 16367);
                if (jon1.x(qq81Var) == f0r0Var) {
                    return Next.i(qq81VarA, Effects.a(new s9p1[]{qq81Var.g ? xo81.c : wo81.c}));
                }
                return Next.h(qq81VarA);
            }
            if (!(eq81Var instanceof dq81)) {
                if (eq81Var.equals(np81.a)) {
                    return Next.a(Collections.singleton(qo81.c));
                }
                if (eq81Var.equals(qp81.a)) {
                    return Next.j();
                }
                if (eq81Var.equals(jp81.a)) {
                    return Next.j();
                }
                eg.o();
                return null;
            }
            dq81 dq81Var = (dq81) eq81Var;
            if (pq81Var instanceof oq81) {
                return Next.j();
            }
            fo81 fo81Var = dq81Var.a;
            boolean z2 = fo81Var.O0;
            MarketingMessagesOption marketingMessagesOption = fo81Var.Z;
            String str3 = fo81Var.P0;
            boolean z3 = fo81Var.a;
            TermsConditionAcceptance termsConditionAcceptance = fo81Var.X;
            zc ycVar = xc.a;
            if (z3) {
                int i4 = vb.a[termsConditionAcceptance.ordinal()];
                if (i4 == 1) {
                    ocVar = new oc(false);
                } else {
                    if (i4 != 2) {
                        eg.o();
                        return null;
                    }
                    ocVar = pc.a;
                }
                qc qcVar = ocVar;
                nc ncVarW = buo1.w(marketingMessagesOption, str3);
                hc gcVar = u890.j(str3, "KR") ? new gc(false, false, false) : new ec(false, false);
                boolean z4 = fo81Var.N0;
                if (z2) {
                    ycVar = new yc(false, false);
                }
                vjn0Var = null;
                tbVar = new sb(qcVar, ncVarW, gcVar, ycVar, z4);
            } else {
                if (u890.j(str3, "KR")) {
                    bdVar = new dd(false);
                } else {
                    int i5 = vb.a[termsConditionAcceptance.ordinal()];
                    if (i5 == 1) {
                        bdVar = new bd(false);
                    } else {
                        if (i5 != 2) {
                            eg.o();
                            return null;
                        }
                        bdVar = cd.a;
                    }
                }
                ed edVar = bdVar;
                PrivacyPolicyAcceptance privacyPolicyAcceptance = fo81Var.Y;
                vjn0Var = null;
                if (f46.S0(new String[]{"GB", "JE", "GG", "IM"}).contains(str3)) {
                    wcVar = vc.a;
                } else if (u890.j(str3, "KR")) {
                    wcVar = uc.a;
                } else {
                    int i6 = vb.b[privacyPolicyAcceptance.ordinal()];
                    if (i6 == 1) {
                        z = false;
                        rcVar = new rc(false);
                    } else if (i6 == 2) {
                        wcVar = sc.a;
                    } else {
                        if (i6 != 3) {
                            eg.o();
                            return null;
                        }
                        wcVar = tc.a;
                    }
                    nc ncVarW2 = buo1.w(marketingMessagesOption, str3);
                    if (z2) {
                        ycVar = new yc(z, z);
                    }
                    zc zcVar = ycVar;
                    if (u890.j(str3, "KR")) {
                        ecVar = new gc(z, z, z);
                    } else {
                        ecVar = new ec(z, z);
                    }
                    tbVar = new tb(edVar, rcVar, zcVar, ncVarW2, ecVar, fo81Var.N0);
                }
                rcVar = wcVar;
                z = false;
                nc ncVarW3 = buo1.w(marketingMessagesOption, str3);
                if (z2) {
                    ycVar = new yc(z, z);
                }
                zc zcVar2 = ycVar;
                if (u890.j(str3, "KR")) {
                    ecVar = new gc(z, z, z);
                } else {
                    ecVar = new ec(z, z);
                }
                tbVar = new tb(edVar, rcVar, zcVar2, ncVarW3, ecVar, fo81Var.N0);
            }
            qq81 qq81VarA2 = qq81.a(qq81Var, new oq81(fo81Var), null, null, th2.a(qq81Var.d, 0, 0, 0, vj2.a, false, false, 55), id40.a(qq81Var.e, null, fo81Var.b, fo81Var.c, fo81Var.d, false, 1), wjn0.a(wjn0Var, vjn0Var, false, tbVar, 7), false, null, null, 0, null, 16326);
            if (jon1.x(qq81Var) == f0r0Var && !(id40Var.a instanceof dd40)) {
                qq81VarA2 = qq81.a(qq81VarA2, null, null, null, null, null, null, false, null, null, i3 + 1, null, 15871);
            }
            return Next.h(qq81VarA2);
        }
        qq81 qq81VarA3 = qq81.a(qq81Var, null, null, null, null, null, wjn0.a(wjn0Var, null, false, null, 13), false, null, null, 0, null, 16351);
        Locale locale = Locale.US;
        th2 th2Var = qq81Var.d;
        v6s0 v6s0Var = qq81Var.c;
        String str4 = qq81Var.Z;
        nxw nxwVar = qq81Var.b;
        String str5 = String.format(locale, "%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(th2Var.c), Integer.valueOf(th2Var.b + 1), Integer.valueOf(th2Var.a)}, 3));
        hc hcVarB = wjn0Var.d.b();
        if (hcVarB instanceof gc) {
            boolValueOf = Boolean.valueOf(((gc) hcVarB).a);
        } else {
            if (!(hcVarB instanceof ec) && !(hcVarB instanceof fc)) {
                eg.o();
                return null;
            }
            boolValueOf = null;
        }
        ub ubVar = wjn0Var.d;
        hc hcVarB2 = ubVar.b();
        if (!(hcVarB2 instanceof gc)) {
            if (hcVarB2 instanceof ec) {
                boolValueOf2 = Boolean.valueOf(((ec) hcVarB2).a);
            } else {
                if (!(hcVarB2 instanceof fc)) {
                    eg.o();
                    return null;
                }
                bool = null;
            }
            ncVarG = ubVar.g();
            if (ncVarG instanceof mc) {
                boolValueOf3 = Boolean.valueOf(((mc) ncVarG).a);
            } else if (ncVarG instanceof ic) {
                boolValueOf3 = Boolean.TRUE;
            } else {
                if (ncVarG instanceof lc) {
                    if (ncVarG instanceof kc) {
                        boolValueOf3 = Boolean.valueOf(((kc) ncVarG).a);
                    } else {
                        if (ncVarG instanceof jc) {
                            eg.o();
                            return null;
                        }
                        bool2 = null;
                    }
                    zcVarJ = ubVar.j();
                    if (zcVarJ instanceof yc) {
                        boolValueOf4 = Boolean.valueOf(((yc) zcVarJ).a);
                    } else {
                        if (zcVarJ instanceof xc) {
                            eg.o();
                            return null;
                        }
                        boolValueOf4 = null;
                    }
                    TermsData termsData = new TermsData(true, boolValueOf, bool, bool2, boolValueOf4);
                    xl xlVar = new xl(true, termsData.getCollectPersonalInformation(), termsData.getThirdPartyDataProvision(), termsData.getEmailConsent(), termsData.getTailoredAdsConsent());
                    str = qq81Var.h;
                    if (str != null) {
                        str2 = qq81Var.N0;
                        if (str2 != null) {
                            bmVar = new dm(str2);
                        } else {
                            bk8Var = qq81Var.i;
                            if (bk8Var == bk8.g) {
                                bmVar = new cm(nxwVar.b());
                            } else if (bk8Var == bk8.O0) {
                                bmVar = new am(nxwVar.b());
                            } else {
                                bmVar = new bm(nxwVar.b());
                            }
                        }
                        ylVar = new fm(str, bmVar);
                    } else if (str4 != null) {
                        ylVar = new zl(nxwVar.b(), v6s0Var.b(), str4);
                    } else {
                        ylVar = new yl(nxwVar.b(), v6s0Var.b());
                    }
                    gm gmVar = ylVar;
                    hd40Var = id40Var.a;
                    if (u890.j(hd40Var, ad40.a)) {
                        i2 = 3;
                    } else if (u890.j(hd40Var, bd40.a)) {
                        i2 = 2;
                    } else {
                        if (u890.j(hd40Var, cd40.a)) {
                            i = 4;
                        } else if (u890.j(hd40Var, ed40.a)) {
                            i = 5;
                        } else {
                            if (u890.j(hd40Var, gd40.a)) {
                                if (u890.j(hd40Var, dd40.a)) {
                                    eg.m("Gender not selected");
                                    return null;
                                }
                                eg.o();
                                return null;
                            }
                            i = 6;
                        }
                        i2 = i;
                    }
                    hm hmVar = new hm(str5, i2, wjn0Var.a.getName(), xlVar, gmVar);
                    if (nxwVar.b().length() > 0 || v6s0Var.b().length() <= 0) {
                        n5oVar = null;
                    } else {
                        n5oVar = new n5o(nxwVar.b(), v6s0Var.b());
                    }
                    return Next.i(qq81VarA3, Effects.a(new zo81[]{new zo81(hmVar, n5oVar)}));
                }
                boolValueOf3 = Boolean.valueOf(!((lc) ncVarG).a);
            }
            bool2 = boolValueOf3;
            zcVarJ = ubVar.j();
            if (zcVarJ instanceof yc) {
                boolValueOf4 = Boolean.valueOf(((yc) zcVarJ).a);
            } else {
                if (zcVarJ instanceof xc) {
                    eg.o();
                    return null;
                }
                boolValueOf4 = null;
            }
            TermsData termsData2 = new TermsData(true, boolValueOf, bool, bool2, boolValueOf4);
            xl xlVar2 = new xl(true, termsData2.getCollectPersonalInformation(), termsData2.getThirdPartyDataProvision(), termsData2.getEmailConsent(), termsData2.getTailoredAdsConsent());
            str = qq81Var.h;
            if (str != null) {
                str2 = qq81Var.N0;
                if (str2 != null) {
                    bmVar = new dm(str2);
                } else {
                    bk8Var = qq81Var.i;
                    if (bk8Var == bk8.g) {
                        bmVar = new cm(nxwVar.b());
                    } else if (bk8Var == bk8.O0) {
                        bmVar = new am(nxwVar.b());
                    } else {
                        bmVar = new bm(nxwVar.b());
                    }
                }
                ylVar = new fm(str, bmVar);
            } else if (str4 != null) {
                ylVar = new zl(nxwVar.b(), v6s0Var.b(), str4);
            } else {
                ylVar = new yl(nxwVar.b(), v6s0Var.b());
            }
            gm gmVar2 = ylVar;
            hd40Var = id40Var.a;
            if (u890.j(hd40Var, ad40.a)) {
                i2 = 3;
            } else if (u890.j(hd40Var, bd40.a)) {
                i2 = 2;
            } else {
                if (u890.j(hd40Var, cd40.a)) {
                    i = 4;
                } else if (u890.j(hd40Var, ed40.a)) {
                    i = 5;
                } else {
                    if (u890.j(hd40Var, gd40.a)) {
                        if (u890.j(hd40Var, dd40.a)) {
                            eg.m("Gender not selected");
                            return null;
                        }
                        eg.o();
                        return null;
                    }
                    i = 6;
                }
                i2 = i;
            }
            hm hmVar2 = new hm(str5, i2, wjn0Var.a.getName(), xlVar2, gmVar2);
            if (nxwVar.b().length() > 0) {
                n5oVar = null;
            } else {
                n5oVar = null;
            }
            return Next.i(qq81VarA3, Effects.a(new zo81[]{new zo81(hmVar2, n5oVar)}));
        }
        boolValueOf2 = Boolean.valueOf(((gc) hcVarB2).b);
        bool = boolValueOf2;
        ncVarG = ubVar.g();
        if (ncVarG instanceof mc) {
            boolValueOf3 = Boolean.valueOf(((mc) ncVarG).a);
        } else if (ncVarG instanceof ic) {
            boolValueOf3 = Boolean.TRUE;
        } else {
            if (ncVarG instanceof lc) {
                if (ncVarG instanceof kc) {
                    boolValueOf3 = Boolean.valueOf(((kc) ncVarG).a);
                } else {
                    if (ncVarG instanceof jc) {
                        eg.o();
                        return null;
                    }
                    bool2 = null;
                }
                zcVarJ = ubVar.j();
                if (zcVarJ instanceof yc) {
                    boolValueOf4 = Boolean.valueOf(((yc) zcVarJ).a);
                } else {
                    if (zcVarJ instanceof xc) {
                        eg.o();
                        return null;
                    }
                    boolValueOf4 = null;
                }
                TermsData termsData3 = new TermsData(true, boolValueOf, bool, bool2, boolValueOf4);
                xl xlVar3 = new xl(true, termsData3.getCollectPersonalInformation(), termsData3.getThirdPartyDataProvision(), termsData3.getEmailConsent(), termsData3.getTailoredAdsConsent());
                str = qq81Var.h;
                if (str != null) {
                    str2 = qq81Var.N0;
                    if (str2 != null) {
                        bmVar = new dm(str2);
                    } else {
                        bk8Var = qq81Var.i;
                        if (bk8Var == bk8.g) {
                            bmVar = new cm(nxwVar.b());
                        } else if (bk8Var == bk8.O0) {
                            bmVar = new am(nxwVar.b());
                        } else {
                            bmVar = new bm(nxwVar.b());
                        }
                    }
                    ylVar = new fm(str, bmVar);
                } else if (str4 != null) {
                    ylVar = new zl(nxwVar.b(), v6s0Var.b(), str4);
                } else {
                    ylVar = new yl(nxwVar.b(), v6s0Var.b());
                }
                gm gmVar3 = ylVar;
                hd40Var = id40Var.a;
                if (u890.j(hd40Var, ad40.a)) {
                    i2 = 3;
                } else if (u890.j(hd40Var, bd40.a)) {
                    i2 = 2;
                } else {
                    if (u890.j(hd40Var, cd40.a)) {
                        i = 4;
                    } else if (u890.j(hd40Var, ed40.a)) {
                        i = 5;
                    } else {
                        if (u890.j(hd40Var, gd40.a)) {
                            if (u890.j(hd40Var, dd40.a)) {
                                eg.m("Gender not selected");
                                return null;
                            }
                            eg.o();
                            return null;
                        }
                        i = 6;
                    }
                    i2 = i;
                }
                hm hmVar3 = new hm(str5, i2, wjn0Var.a.getName(), xlVar3, gmVar3);
                if (nxwVar.b().length() > 0) {
                    n5oVar = null;
                } else {
                    n5oVar = null;
                }
                return Next.i(qq81VarA3, Effects.a(new zo81[]{new zo81(hmVar3, n5oVar)}));
            }
            boolValueOf3 = Boolean.valueOf(!((lc) ncVarG).a);
        }
        bool2 = boolValueOf3;
        zcVarJ = ubVar.j();
        if (zcVarJ instanceof yc) {
            boolValueOf4 = Boolean.valueOf(((yc) zcVarJ).a);
        } else {
            if (zcVarJ instanceof xc) {
                eg.o();
                return null;
            }
            boolValueOf4 = null;
        }
        TermsData termsData4 = new TermsData(true, boolValueOf, bool, bool2, boolValueOf4);
        xl xlVar4 = new xl(true, termsData4.getCollectPersonalInformation(), termsData4.getThirdPartyDataProvision(), termsData4.getEmailConsent(), termsData4.getTailoredAdsConsent());
        str = qq81Var.h;
        if (str != null) {
            str2 = qq81Var.N0;
            if (str2 != null) {
                bmVar = new dm(str2);
            } else {
                bk8Var = qq81Var.i;
                if (bk8Var == bk8.g) {
                    bmVar = new cm(nxwVar.b());
                } else if (bk8Var == bk8.O0) {
                    bmVar = new am(nxwVar.b());
                } else {
                    bmVar = new bm(nxwVar.b());
                }
            }
            ylVar = new fm(str, bmVar);
        } else if (str4 != null) {
            ylVar = new zl(nxwVar.b(), v6s0Var.b(), str4);
        } else {
            ylVar = new yl(nxwVar.b(), v6s0Var.b());
        }
        gm gmVar4 = ylVar;
        hd40Var = id40Var.a;
        if (u890.j(hd40Var, ad40.a)) {
            i2 = 3;
        } else if (u890.j(hd40Var, bd40.a)) {
            i2 = 2;
        } else {
            if (u890.j(hd40Var, cd40.a)) {
                i = 4;
            } else if (u890.j(hd40Var, ed40.a)) {
                i = 5;
            } else {
                if (u890.j(hd40Var, gd40.a)) {
                    if (u890.j(hd40Var, dd40.a)) {
                        eg.m("Gender not selected");
                        return null;
                    }
                    eg.o();
                    return null;
                }
                i = 6;
            }
            i2 = i;
        }
        hm hmVar4 = new hm(str5, i2, wjn0Var.a.getName(), xlVar4, gmVar4);
        if (nxwVar.b().length() > 0) {
            n5oVar = null;
        } else {
            n5oVar = null;
        }
        return Next.i(qq81VarA3, Effects.a(new zo81[]{new zo81(hmVar4, n5oVar)}));
    }
}
