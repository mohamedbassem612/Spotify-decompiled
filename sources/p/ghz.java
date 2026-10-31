package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ghz implements rqw {
    public final /* synthetic */ byte a;
    public final Object b;

    public ghz(ba50 ba50Var) {
        this.a = (byte) 3;
        this.b = new tfl0(r6h1.c);
    }

    public final Object b(Object obj, Object obj2, Object obj3, op80 op80Var) {
        w7h1 w7h1Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        b7x b7xVar = b7x.a;
        Object obj4 = this.b;
        w7h1 w7h1Var2 = null;
        switch (b) {
            case 0:
                if (!((ahz) obj3).equals(ahz.a)) {
                    eg.o();
                    return null;
                }
                fhi1 fhi1Var = ((hhz) obj4).a;
                switch (fhi1Var.a) {
                    case 0:
                        l6m0 l6m0Var = fhi1Var.b;
                        x6h1 x6h1VarC = l6m0Var.b.c();
                        x6h1VarC.i.add(new a7h1("error_message_something_went_wrong", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC.j = true;
                        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), x6h1VarC.a(), l6m0Var.a, System.currentTimeMillis());
                    default:
                        x6h1 x6h1VarC2 = fhi1Var.b.a.c();
                        x6h1VarC2.i.add(new a7h1("error_message_fullscreen_something_went_wrong", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC2.j = true;
                        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
                }
            case 1:
                em10 em10Var = (em10) obj;
                sqk0 sqk0VarU = m4c.u(((hm10) obj4).a, em10Var.a.i, em10Var.b);
                return !((em10) obj2).c ? sqk0VarU.m() : sqk0VarU.l();
            case 2:
                lp20 lp20Var = (lp20) obj2;
                kp20 kp20Var = (kp20) obj3;
                ug3 ug3Var = (ug3) obj4;
                yxk0 yxk0Var = (yxk0) ug3Var.c;
                if (!(kp20Var instanceof ip20)) {
                    if (!kp20Var.equals(jp20.a)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC3 = yxk0Var.c.c();
                    x6h1VarC3.i.add(new a7h1("bottom_sheet", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = true;
                    return new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC3.a(), yxk0Var.b, System.currentTimeMillis());
                }
                x6h1 x6h1VarC4 = yxk0Var.c.c();
                x6h1VarC4.i.add(new a7h1("bottom_sheet", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = true;
                x6h1 x6h1VarC5 = x6h1VarC4.a().c();
                x6h1VarC5.i.add(new a7h1("continue_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = false;
                y6h1 y6h1VarA = x6h1VarC5.a();
                String strE = ug3Var.e(lp20Var);
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strE != null ? strE : "")), y6h1VarA, yxk0Var.b, System.currentTimeMillis());
            case 3:
                z950 z950Var = (z950) obj;
                if (!((x950) obj3).equals(x950.a)) {
                    eg.o();
                    return null;
                }
                tfl0 tfl0Var = (tfl0) obj4;
                x6h1 x6h1VarC6 = tfl0Var.b.c();
                x6h1VarC6.i.add(new a7h1("managed_group", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = false;
                x6h1 x6h1VarC7 = x6h1VarC6.a().c();
                x6h1VarC7.i.add(new a7h1("graduation_request_banner", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC7.j = true;
                x6h1 x6h1VarC8 = x6h1VarC7.a().c();
                x6h1VarC8.i.add(new a7h1("view_request_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC8.j = false;
                y6h1 y6h1VarA2 = x6h1VarC8.a();
                String str = cfm0.i("spotify:graduation:view-request:", z950Var.a, nik1.j4).a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), y6h1VarA2, tfl0Var.a, System.currentTimeMillis());
            case 4:
                aa50 aa50Var = (aa50) obj;
                if (((y950) obj3).equals(y950.a)) {
                    x6h1 x6h1VarC9 = ((o7l0) obj4).a.c();
                    x6h1VarC9.i.add(new a7h1("graduation_request_banner", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = true;
                    x6h1 x6h1VarC10 = x6h1VarC9.a().c();
                    x6h1VarC10.i.add(new a7h1("view_request_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC10.j = false;
                    y6h1 y6h1VarA3 = x6h1VarC10.a();
                    String str2 = nik1.j4.b("spotify:graduation:view-request:".concat(aa50Var.a)).a;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2 != null ? str2 : "")), y6h1VarA3, r6h1.c, System.currentTimeMillis());
                } else {
                    eg.o();
                }
                return w7h1Var2;
            case 5:
                return rih1Var;
            case 6:
                ssv0 ssv0Var = (ssv0) obj2;
                rsv0 rsv0Var = (rsv0) obj3;
                int i = ssv0Var.b;
                ktv0 ktv0Var = ssv0Var.a;
                if (rsv0Var.equals(qsv0.a)) {
                    return f(ktv0Var.n, i);
                }
                if (rsv0Var.equals(qsv0.b)) {
                    return f(ktv0Var.o, i);
                }
                if (rsv0Var instanceof psv0) {
                    return m4c.u((yxk0) ((dx0) obj4).b, ktv0Var.p, i).h(((psv0) rsv0Var).a);
                }
                eg.o();
                return null;
            case 7:
                xsv0 xsv0Var = (xsv0) obj;
                sqk0 sqk0VarU2 = m4c.u((yxk0) ((dx0) obj4).b, xsv0Var.a.d, xsv0Var.b);
                return !((xsv0) obj2).c ? sqk0VarU2.m() : sqk0VarU2.l();
            case 8:
                btv0 btv0Var = (btv0) obj;
                atv0 atv0Var = (atv0) obj3;
                ow50 ow50Var = btv0Var.a;
                if (atv0Var == atv0.a) {
                    return m4c.u((yxk0) ((rt01) obj4).f, ow50Var.e, btv0Var.b).h(ow50Var.c.b);
                }
                eg.o();
                return null;
            case 9:
                return rih1Var;
            case 10:
                mtv0 mtv0Var = (mtv0) obj2;
                ltv0 ltv0Var = (ltv0) obj3;
                int i2 = mtv0Var.b;
                ktv0 ktv0Var2 = mtv0Var.a;
                if (ltv0Var.equals(ltv0.a)) {
                    return g(ktv0Var2.n, i2);
                }
                if (ltv0Var.equals(ltv0.b)) {
                    return g(ktv0Var2.o, i2);
                }
                eg.o();
                return null;
            case 11:
                return rih1Var;
            case 12:
                return rih1Var;
            case 13:
                return rih1Var;
            default:
                fxv0 fxv0Var = (fxv0) obj;
                exv0 exv0Var = (exv0) obj3;
                sqk0 sqk0VarE = e(fxv0Var);
                y6h1 y6h1Var = sqk0VarE.b;
                yxk0 yxk0Var2 = sqk0VarE.c.c;
                ave0 ave0Var = fxv0Var.a.f;
                String str3 = ave0Var != null ? ave0Var.d : null;
                if (exv0Var.equals(dxv0.a)) {
                    return sqk0VarE.m();
                }
                if (exv0Var.equals(axv0.a)) {
                    return sqk0VarE.l();
                }
                if (exv0Var.equals(bxv0.a)) {
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("pause_entity", 1, Collections.singletonMap("entity_to_be_paused", str3 != null ? str3 : "")), y6h1Var, yxk0Var2.b, System.currentTimeMillis());
                } else {
                    if (!exv0Var.equals(cxv0.a)) {
                        eg.o();
                        return null;
                    }
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("resume_entity", 1, Collections.singletonMap("entity_to_be_resumed", str3 != null ? str3 : "")), y6h1Var, yxk0Var2.b, System.currentTimeMillis());
                }
                return w7h1Var;
        }
    }

    public final Object d(Object obj, Object obj2, op80 op80Var) {
        l7h1 l7h1VarA;
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                dhz dhzVar = (dhz) obj;
                fhi1 fhi1Var = ((hhz) obj3).a;
                int iC = l1d.C(dhzVar.g());
                int i = 2;
                xgz xgzVar = xgz.a;
                wgz wgzVar = wgz.a;
                if (iC == 0) {
                    ygz ygzVarJ = dhzVar.j();
                    if (u890.j(ygzVarJ, wgzVar)) {
                        i = 1;
                    } else if (!u890.j(ygzVarJ, xgzVar)) {
                        eg.o();
                        return null;
                    }
                    switch (fhi1Var.a) {
                        case 0:
                            l6m0 l6m0Var = fhi1Var.b;
                            x6h1 x6h1VarC = l6m0Var.b.c();
                            x6h1VarC.i.add(new a7h1("error_message_something_went_wrong", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC.j = true;
                            y6h1 y6h1VarA = x6h1VarC.a();
                            k7h1 k7h1Var = new k7h1();
                            ((xjn) k7h1Var).a = y6h1VarA;
                            ((xjn) k7h1Var).b = l6m0Var.a;
                            ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                            k7h1Var.e = l6m0Var.c;
                            l7h1VarA = k7h1Var.a();
                            break;
                        default:
                            y6h1 y6h1Var = fhi1Var.b.a;
                            int iC2 = l1d.C(i);
                            if (iC2 == 0) {
                                x6h1 x6h1VarC2 = y6h1Var.c();
                                x6h1VarC2.i.add(new a7h1("error_message_fullscreen_something_went_wrong", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC2.j = true;
                                y6h1 y6h1VarA2 = x6h1VarC2.a();
                                k7h1 k7h1Var2 = new k7h1();
                                ((xjn) k7h1Var2).a = y6h1VarA2;
                                ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                                return k7h1Var2.a();
                            }
                            if (iC2 != 1) {
                                eg.o();
                                return null;
                            }
                            x6h1 x6h1VarC3 = y6h1Var.c();
                            x6h1VarC3.i.add(new a7h1("error_message_inline_something_went_wrong", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC3.j = true;
                            y6h1 y6h1VarA3 = x6h1VarC3.a();
                            k7h1 k7h1Var3 = new k7h1();
                            ((xjn) k7h1Var3).a = y6h1VarA3;
                            ((xjn) k7h1Var3).c = Long.valueOf(System.currentTimeMillis());
                            return k7h1Var3.a();
                    }
                } else {
                    if (iC != 1) {
                        eg.o();
                        return null;
                    }
                    ygz ygzVarJ2 = dhzVar.j();
                    if (u890.j(ygzVarJ2, wgzVar)) {
                        i = 1;
                    } else if (!u890.j(ygzVarJ2, xgzVar)) {
                        eg.o();
                        return null;
                    }
                    switch (fhi1Var.a) {
                        case 0:
                            l6m0 l6m0Var2 = fhi1Var.b;
                            x6h1 x6h1VarC4 = l6m0Var2.b.c();
                            x6h1VarC4.i.add(new a7h1("error_message_offline", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC4.j = true;
                            y6h1 y6h1VarA4 = x6h1VarC4.a();
                            k7h1 k7h1Var4 = new k7h1();
                            ((xjn) k7h1Var4).a = y6h1VarA4;
                            ((xjn) k7h1Var4).b = l6m0Var2.a;
                            ((xjn) k7h1Var4).c = Long.valueOf(System.currentTimeMillis());
                            k7h1Var4.e = l6m0Var2.c;
                            l7h1VarA = (l7h1) k7h1Var4.a();
                            break;
                        default:
                            y6h1 y6h1Var2 = fhi1Var.b.a;
                            int iC3 = l1d.C(i);
                            if (iC3 == 0) {
                                x6h1 x6h1VarC5 = y6h1Var2.c();
                                x6h1VarC5.i.add(new a7h1("error_message_fullscreen_offline", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC5.j = true;
                                y6h1 y6h1VarA5 = x6h1VarC5.a();
                                k7h1 k7h1Var5 = new k7h1();
                                ((xjn) k7h1Var5).a = y6h1VarA5;
                                ((xjn) k7h1Var5).c = Long.valueOf(System.currentTimeMillis());
                                return k7h1Var5.a();
                            }
                            if (iC3 != 1) {
                                eg.o();
                                return null;
                            }
                            x6h1 x6h1VarC6 = y6h1Var2.c();
                            x6h1VarC6.i.add(new a7h1("error_message_inline_offline", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC6.j = true;
                            y6h1 y6h1VarA6 = x6h1VarC6.a();
                            k7h1 k7h1Var6 = new k7h1();
                            ((xjn) k7h1Var6).a = y6h1VarA6;
                            ((xjn) k7h1Var6).c = Long.valueOf(System.currentTimeMillis());
                            return k7h1Var6.a();
                    }
                }
                return l7h1VarA;
            case 1:
                em10 em10Var = (em10) obj;
                return m4c.u(((hm10) obj3).a, em10Var.a.i, em10Var.b).e();
            case 2:
                yxk0 yxk0Var = (yxk0) ((ug3) obj3).c;
                x6h1 x6h1VarC7 = yxk0Var.c.c();
                x6h1VarC7.i.add(new a7h1("bottom_sheet", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC7.j = true;
                y6h1 y6h1VarA7 = x6h1VarC7.a();
                k7h1 k7h1Var7 = new k7h1();
                ((xjn) k7h1Var7).a = y6h1VarA7;
                ((xjn) k7h1Var7).b = yxk0Var.b;
                ((xjn) k7h1Var7).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var7.e = yxk0Var.d;
                return k7h1Var7.a();
            case 3:
                tfl0 tfl0Var = (tfl0) obj3;
                x6h1 x6h1VarC8 = tfl0Var.b.c();
                x6h1VarC8.i.add(new a7h1("managed_group", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC8.j = false;
                x6h1 x6h1VarC9 = x6h1VarC8.a().c();
                x6h1VarC9.i.add(new a7h1("graduation_request_banner", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC9.j = true;
                y6h1 y6h1VarA8 = x6h1VarC9.a();
                k7h1 k7h1Var8 = new k7h1();
                ((xjn) k7h1Var8).a = y6h1VarA8;
                ((xjn) k7h1Var8).b = tfl0Var.a;
                ((xjn) k7h1Var8).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var8.a();
            case 4:
                o7l0 o7l0Var = (o7l0) obj3;
                x6h1 x6h1VarC10 = o7l0Var.a.c();
                x6h1VarC10.i.add(new a7h1("graduation_request_banner", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC10.j = true;
                y6h1 y6h1VarA9 = x6h1VarC10.a();
                k7h1 k7h1Var9 = new k7h1();
                ((xjn) k7h1Var9).a = y6h1VarA9;
                ((xjn) k7h1Var9).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var9.e = o7l0Var.b;
                return k7h1Var9.a();
            case 5:
                gqv0 gqv0Var = (gqv0) obj;
                return m4c.u((yxk0) ((rt01) obj3).d, gqv0Var.a.d, gqv0Var.b).e();
            case 6:
                ssv0 ssv0Var = (ssv0) obj;
                return m4c.u((yxk0) ((dx0) obj3).b, ssv0Var.a.p, ssv0Var.b).e();
            case 7:
                xsv0 xsv0Var = (xsv0) obj;
                return m4c.u((yxk0) ((dx0) obj3).b, xsv0Var.a.d, xsv0Var.b).e();
            case 8:
                btv0 btv0Var = (btv0) obj;
                return m4c.u((yxk0) ((rt01) obj3).f, btv0Var.a.e, btv0Var.b).e();
            case 9:
                ftv0 ftv0Var = (ftv0) obj;
                return m4c.u((yxk0) ((rt01) obj3).d, ftv0Var.a.f, ftv0Var.b).e();
            case 10:
                mtv0 mtv0Var = (mtv0) obj;
                return m4c.u((yxk0) ((rt01) obj3).f, mtv0Var.a.p, mtv0Var.b).e();
            case 11:
                yxk0 yxk0Var2 = (yxk0) ((u63) obj3).b;
                String str = ((iuv0) obj).a.a;
                x6h1 x6h1VarC11 = yxk0Var2.c.c();
                x6h1VarC11.i.add(new a7h1("error_state", (String) null, (Integer) null, (String) null, str));
                x6h1VarC11.j = true;
                y6h1 y6h1VarA10 = x6h1VarC11.a();
                k7h1 k7h1Var10 = new k7h1();
                ((xjn) k7h1Var10).a = y6h1VarA10;
                ((xjn) k7h1Var10).b = yxk0Var2.b;
                ((xjn) k7h1Var10).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var10.e = yxk0Var2.d;
                return k7h1Var10.a();
            case 12:
                return ((avv0) obj3).b.e();
            case 13:
                lwv0 lwv0Var = (lwv0) obj;
                return m4c.u((yxk0) ((rt01) obj3).d, lwv0Var.a.d, lwv0Var.b).e();
            default:
                return e((fxv0) obj).e();
        }
    }

    public sqk0 e(fxv0 fxv0Var) {
        String str;
        yxk0 yxk0Var = (yxk0) ((r8s) this.b).i;
        vuv0 vuv0Var = fxv0Var.a;
        ave0 ave0VarA = vuv0Var.f;
        uuv0 uuv0Var = vuv0Var.m;
        k760 k760Var = uuv0Var != null ? uuv0Var.a : null;
        if (!u890.j(k760Var, g760.a)) {
            str = u890.j(k760Var, i760.a) ? "VIDEO" : "IMAGE";
            return m4c.u(yxk0Var, ave0VarA, 1);
        }
        if (ave0VarA == null) {
            ave0VarA = new ave0(null, null, 0, null);
        }
        ave0VarA = ave0.a(ave0VarA, str);
        return m4c.u(yxk0Var, ave0VarA, 1);
    }

    public w7h1 f(htv0 htv0Var, int i) {
        dx0 dx0Var = (dx0) this.b;
        qp20 qp20Var = htv0Var != null ? htv0Var.d : null;
        String str = htv0Var != null ? htv0Var.b.b : null;
        if (qp20Var != null) {
            return m4c.u((yxk0) dx0Var.b, htv0Var.e, i).m();
        }
        if (str == null || str.length() == 0) {
            return m4c.u((yxk0) dx0Var.b, htv0Var != null ? htv0Var.e : null, i).i();
        }
        return m4c.u((yxk0) dx0Var.b, htv0Var.e, i).h(str);
    }

    public w7h1 g(htv0 htv0Var, int i) {
        rt01 rt01Var = (rt01) this.b;
        qp20 qp20Var = htv0Var != null ? htv0Var.d : null;
        String str = htv0Var != null ? htv0Var.b.b : null;
        if (qp20Var != null) {
            return m4c.u((yxk0) rt01Var.f, htv0Var.e, i).m();
        }
        if (str == null || str.length() == 0) {
            return m4c.u((yxk0) rt01Var.f, htv0Var != null ? htv0Var.e : null, i).i();
        }
        return m4c.u((yxk0) rt01Var.f, htv0Var.e, i).h(str);
    }

    public /* synthetic */ ghz(avl1 avl1Var, byte b) {
        this.a = b;
        this.b = avl1Var;
    }

    public ghz(ca50 ca50Var) {
        this.a = (byte) 4;
        this.b = new o7l0();
    }
}
