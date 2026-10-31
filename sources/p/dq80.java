package p;

import com.spotify.mobius.First;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.Next;
import com.spotify.player.model.Context$Metadata;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dq80 implements MobiusLoop.Logger {
    public final ohv0 a;
    public final d7r0 b;
    public final i8h1 c;
    public final mwn0 d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public tv80 k;
    public final h4l0 l;
    public final h4l0 m;
    public final h4l0 n;
    public final h4l0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h4l0 f15p;
    public final h4l0 q;

    public dq80(ohv0 ohv0Var, d7r0 d7r0Var, i8h1 i8h1Var, mwn0 mwn0Var) {
        this.a = ohv0Var;
        this.b = d7r0Var;
        this.c = i8h1Var;
        this.d = mwn0Var;
        r6h1 r6h1Var = r6h1.c;
        this.l = new h4l0((byte) 12);
        this.m = new h4l0((byte) 11);
        this.n = new h4l0((byte) 10);
        this.o = new h4l0((byte) 14);
        this.f15p = new h4l0((byte) 9);
        this.q = new h4l0((byte) 7);
    }

    public final void a(Object obj, Object obj2, Next next) {
        String str;
        f0r0 f0r0Var = f0r0.c;
        y6h1 y6h1Var = this.m.b;
        qq81 qq81Var = (qq81) obj;
        eq81 eq81Var = (eq81) obj2;
        y6h1 y6h1Var2 = this.n.b;
        ew80 ew80Var = ew80.b;
        y6h1 y6h1Var3 = this.f15p.b;
        ew80 ew80Var2 = ew80.c;
        qq81 qq81Var2 = (qq81) next.f(qq81Var);
        v6s0 v6s0Var = qq81Var2.c;
        this.b.a(qq81Var2);
        boolean zEquals = eq81Var.equals(ip81.a);
        mwn0 mwn0Var = this.d;
        b7x b7xVar = b7x.a;
        i8h1 i8h1Var = this.c;
        ohv0 ohv0Var = this.a;
        if (zEquals) {
            ohv0Var.a(new mhv0("sign_up_display_name", "sign_up", ew80Var2, Context$Metadata.SHUFFLE_ALGORITHM_NONE));
            x6h1 x6h1VarC = y6h1Var3.c();
            x6h1VarC.i.add(new a7h1("create_account_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            y6h1 y6h1VarA = x6h1VarC.a();
            w6b1 w6b1VarA = f7b1.a(blc0.pa);
            String str2 = w6b1VarA != null ? (String) o7h.s0(w6b1VarA.c) : null;
            nyn1.Q(mwn0Var, new lsn0((String) null, i8h1Var.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2 != null ? str2 : "")), y6h1VarA, r6h1.c, System.currentTimeMillis())).a));
            return;
        }
        if (eq81Var instanceof kp81) {
            ph2 ph2Var = ((kp81) eq81Var).a;
            if (ph2Var instanceof oh2) {
                ohv0Var.a(new mhv0("sign_up_birthday", "next", ew80Var2, Context$Metadata.SHUFFLE_ALGORITHM_NONE));
                x6h1 x6h1VarC2 = y6h1Var2.c();
                x6h1VarC2.i.add(new a7h1("next_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                w6b1 w6b1VarA2 = f7b1.a(blc0.mh);
                String str3 = w6b1VarA2 != null ? (String) o7h.s0(w6b1VarA2.c) : null;
                this.k = i8h1Var.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str3 != null ? str3 : "")), y6h1VarA2, r6h1.c, System.currentTimeMillis()));
                return;
            }
            if (ph2Var instanceof qh2) {
                if (((qh2) ph2Var).a instanceof ai2) {
                    x6h1 x6h1VarC3 = y6h1Var2.c();
                    x6h1VarC3.i.add(new a7h1("next_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    y6h1 y6h1VarA3 = x6h1VarC3.a();
                    w6b1 w6b1VarA3 = f7b1.a(blc0.mh);
                    String str4 = w6b1VarA3 != null ? (String) o7h.s0(w6b1VarA3.c) : null;
                    this.k = i8h1Var.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str4 != null ? str4 : "")), y6h1VarA3, r6h1.c, System.currentTimeMillis()));
                }
                if (this.i) {
                    return;
                }
                this.i = true;
                ohv0Var.a(new mhv0("sign_up_birthday", "birth_date", ew80Var, (String) null));
                x6h1 x6h1VarC4 = y6h1Var2.c();
                x6h1VarC4.i.add(new a7h1("birth_date_field", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                i8h1Var.j(new w7h1("", "", new z7h1("scroll", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()));
                return;
            }
            if (!(ph2Var instanceof ph2)) {
                if (ph2Var.equals(nh2.a)) {
                    g();
                    return;
                } else if (ph2Var.equals(rh2.a)) {
                    h();
                    return;
                } else {
                    eg.o();
                    return;
                }
            }
            d0p1 d0p1Var = ph2Var.d;
            if (!(d0p1Var instanceof q2j1)) {
                if (!d0p1Var.equals(r2j1.c)) {
                    eg.o();
                    return;
                }
                tv80 tv80Var = this.k;
                if (tv80Var != null) {
                    nyn1.Q(mwn0Var, new lsn0((String) null, tv80Var.a));
                    this.k = null;
                    return;
                }
                return;
            }
            zb90 zb90Var = ((q2j1) d0p1Var).c;
            if (zb90Var instanceof ub90) {
                str = "too_old_age";
            } else if (zb90Var instanceof xb90) {
                str = "too_young_age";
            } else if (zb90Var instanceof yb90) {
                str = "age_generic";
            } else if (zb90Var instanceof wb90) {
                str = "invalid_country";
            } else {
                if (!(zb90Var instanceof vb90)) {
                    eg.o();
                    return;
                }
                str = "invalid_argument";
            }
            ohv0Var.a(new jhv0("sign_up_birthday", str, "birth_date", ""));
            return;
        }
        if (eq81Var instanceof op81) {
            ohv0Var.a(new mhv0("sign_up_email", "dismiss", ew80Var2, "email_already_exist"));
            return;
        }
        if (eq81Var instanceof rp81) {
            nxw nxwVar = qq81Var2.b;
            dxw dxwVar = ((rp81) eq81Var).a;
            yyw yywVar = new yyw(this, nxwVar, (byte) 1);
            cq80 cq80Var = new cq80(this, (byte) 0);
            cq80 cq80Var2 = new cq80(this, (byte) 1);
            if (dxwVar instanceof axw) {
                yywVar.accept(dxwVar);
                return;
            }
            if (dxwVar instanceof exw) {
                return;
            }
            if (!(dxwVar instanceof dxw)) {
                if (dxwVar instanceof cxw) {
                    cq80Var.accept(dxwVar);
                    return;
                } else if (dxwVar instanceof bxw) {
                    cq80Var2.accept(dxwVar);
                    return;
                } else {
                    if (dxwVar instanceof fxw) {
                        return;
                    }
                    eg.o();
                    return;
                }
            }
            qgo1 qgo1Var = dxwVar.a;
            if (qgo1Var instanceof tyw) {
                return;
            }
            if (!(qgo1Var instanceof syw)) {
                if (qgo1Var instanceof ryw) {
                    return;
                }
                eg.o();
                return;
            } else if (((syw) qgo1Var).d != 20) {
                ohv0Var.a(new jhv0("sign_up_email", "generic", "email", ""));
                return;
            } else {
                ohv0Var.a(new jhv0("sign_up_email", "email_already_exist", "email", ""));
                ohv0Var.a(new lhv0("sign_up_email", "email_already_exist"));
                return;
            }
        }
        if (eq81Var instanceof tp81) {
            zc40 zc40Var = ((tp81) eq81Var).a;
            cq80 cq80Var3 = new cq80(this, (byte) 2);
            if (zc40Var instanceof zc40) {
                cq80Var3.accept(zc40Var);
                return;
            } else {
                eg.o();
                return;
            }
        }
        if (eq81Var instanceof xp81) {
            qjn0 qjn0Var = ((xp81) eq81Var).a;
            if ((qjn0Var instanceof pjn0) && ((pjn0) qjn0Var).b && !this.j) {
                this.j = true;
                ohv0Var.a(new mhv0("sign_up_display_name", "display_name", ew80Var, (String) null));
                x6h1 x6h1VarC5 = y6h1Var3.c();
                x6h1VarC5.i.add(new a7h1("display_name_field", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = false;
                i8h1Var.j(new w7h1("", "", new z7h1("key_stroke", 1, b7xVar), new x7h1("text_edit", 1, Collections.singletonMap("field_to_be_changed", "")), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis()));
                return;
            }
            return;
        }
        if (eq81Var instanceof yp81) {
            j6s0 j6s0Var = ((yp81) eq81Var).a;
            if (j6s0Var instanceof e6s0) {
                if (3 == ((e6s0) j6s0Var).b) {
                    ohv0Var.a(new jhv0("sign_up_password", "too_weak_password", "password", ""));
                    return;
                }
                return;
            }
            if (j6s0Var instanceof f6s0) {
                if (!this.g) {
                    this.g = true;
                    ohv0Var.a(new mhv0("sign_up_password", "password", ew80Var, (String) null));
                    x6h1 x6h1VarC6 = y6h1Var.c();
                    x6h1VarC6.i.add(new a7h1("password_field", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    i8h1Var.j(new w7h1("", "", new z7h1("key_stroke", 1, b7xVar), new x7h1("text_edit", 1, Collections.singletonMap("field_to_be_changed", "")), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis()));
                }
                if (v6s0Var.c) {
                    ohv0Var.a(new khv0("sign_up_password", 4, (Map) null, "autofilled_password"));
                    return;
                }
                return;
            }
            if (!j6s0Var.equals(h6s0.a)) {
                if (j6s0Var instanceof i6s0) {
                    return;
                }
                if (!(j6s0Var instanceof g6s0)) {
                    eg.o();
                    return;
                }
                if (this.h) {
                    return;
                }
                this.h = true;
                x6h1 x6h1VarC7 = y6h1Var.c();
                x6h1VarC7.i.add(new a7h1("password_field", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC7.j = false;
                i8h1Var.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("focus_input_field", 1, b7xVar), x6h1VarC7.a(), r6h1.c, System.currentTimeMillis()));
                return;
            }
            u6s0 u6s0Var = v6s0Var.a;
            if (u6s0Var instanceof s6s0) {
                ohv0Var.a(new jhv0("sign_up_password", "too_short_password", "password", ""));
            } else if (!u890.j(u6s0Var, l6s0.b) && !(u6s0Var instanceof k6s0) && !(u6s0Var instanceof n6s0) && !(u6s0Var instanceof m6s0) && !(u6s0Var instanceof o6s0) && !(u6s0Var instanceof p6s0) && !(u6s0Var instanceof q6s0) && !(u6s0Var instanceof r6s0) && !(u6s0Var instanceof t6s0)) {
                eg.o();
                return;
            }
            ohv0Var.a(new mhv0("sign_up_password", "next", ew80Var2, Context$Metadata.SHUFFLE_ALGORITHM_NONE));
            x6h1 x6h1VarC8 = y6h1Var.c();
            x6h1VarC8.i.add(new a7h1("next_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC8.j = false;
            y6h1 y6h1VarA4 = x6h1VarC8.a();
            w6b1 w6b1VarA4 = f7b1.a(blc0.jh);
            String str5 = w6b1VarA4 != null ? (String) o7h.s0(w6b1VarA4.c) : null;
            nyn1.Q(mwn0Var, new lsn0((String) null, i8h1Var.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str5 != null ? str5 : "")), y6h1VarA4, r6h1.c, System.currentTimeMillis())).a));
            return;
        }
        if (eq81Var instanceof aq81) {
            ohv0Var.a(new mhv0("sign_up_email", "login", ew80Var2, "email_already_exist"));
            return;
        }
        String str6 = "sign_up_gender";
        if (eq81Var.equals(cq81.a)) {
            Set setB = next.b();
            if (jon1.x(qq81Var2) == f0r0Var) {
                if (setB.contains(xo81.c)) {
                    ohv0Var.a(new jhv0("sign_up_gender", "signup_configuration_fetch_failed", "gender", "0"));
                    return;
                } else {
                    if (setB.contains(wo81.c)) {
                        ohv0Var.a(new jhv0("sign_up_gender", "signup_configuration_fetch_failed", "gender", "1"));
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (!(eq81Var instanceof up81)) {
            if (eq81Var.equals(gp81.a) || (eq81Var instanceof hp81) || eq81Var.equals(sp81.a) || (eq81Var instanceof vp81) || (eq81Var instanceof wp81) || (eq81Var instanceof dq81)) {
                return;
            }
            if (eq81Var instanceof np81) {
                g();
                return;
            }
            if (eq81Var instanceof qp81) {
                h();
                return;
            } else if (eq81Var instanceof jp81) {
                ohv0Var.a(new lhv0("sign_up_birthday", "age_confirmation"));
                return;
            } else {
                eg.o();
                return;
            }
        }
        f0r0 f0r0Var2 = f0r0.d;
        f0r0 f0r0VarX = jon1.x(qq81Var);
        if (u890.j(f0r0VarX, f0r0.b)) {
            x6h1 x6h1VarC9 = this.l.b.c();
            x6h1VarC9.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC9.j = false;
            nyn1.Q(mwn0Var, new yrn0(i8h1Var.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC9.a(), r6h1.c, System.currentTimeMillis())).a));
            return;
        }
        if (u890.j(f0r0VarX, f0r0.e)) {
            x6h1 x6h1VarC10 = y6h1Var.c();
            x6h1VarC10.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC10.j = false;
            nyn1.Q(mwn0Var, new yrn0(i8h1Var.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC10.a(), r6h1.c, System.currentTimeMillis())).a));
            return;
        }
        if (u890.j(f0r0VarX, f0r0.a)) {
            x6h1 x6h1VarC11 = y6h1Var2.c();
            x6h1VarC11.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC11.j = false;
            nyn1.Q(mwn0Var, new yrn0(i8h1Var.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC11.a(), r6h1.c, System.currentTimeMillis())).a));
            return;
        }
        if (!u890.j(f0r0VarX, f0r0Var) && !u890.j(f0r0VarX, f0r0Var2)) {
            eg.o();
            return;
        }
        f0r0 f0r0VarX2 = jon1.x(qq81Var);
        if (!u890.j(f0r0VarX2, f0r0Var)) {
            if (!u890.j(f0r0VarX2, f0r0Var2)) {
                return;
            } else {
                str6 = "sign_up_display_name";
            }
        }
        ohv0Var.a(new mhv0(str6, "back_button", ew80Var2, (String) null));
        f0r0 f0r0VarX3 = jon1.x(qq81Var);
        if (u890.j(f0r0VarX3, f0r0Var)) {
            x6h1 x6h1VarC12 = this.o.b.c();
            x6h1VarC12.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC12.j = false;
            nyn1.Q(mwn0Var, new yrn0(i8h1Var.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC12.a(), r6h1.c, System.currentTimeMillis())).a));
            return;
        }
        if (u890.j(f0r0VarX3, f0r0Var2)) {
            x6h1 x6h1VarC13 = y6h1Var3.c();
            x6h1VarC13.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC13.j = false;
            nyn1.Q(mwn0Var, new yrn0(i8h1Var.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC13.a(), r6h1.c, System.currentTimeMillis())).a));
        }
    }

    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2, Exception exc) {
    }

    public final void c(Object obj, First first) {
        this.b.a((qq81) obj);
    }

    public final /* bridge */ /* synthetic */ void d(Object obj, Object obj2) {
    }

    public final /* bridge */ /* synthetic */ void e(Object obj) {
    }

    public final /* bridge */ /* synthetic */ void f(Object obj, Exception exc) {
    }

    public final void g() {
        this.a.a(new mhv0("sign_up_birthday", "confirm", ew80.c, "age_confirmation"));
        x6h1 x6h1VarC = this.q.b.c();
        x6h1VarC.i.add(new a7h1("confirm_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        w6b1 w6b1VarA = f7b1.a(blc0.J3);
        String str = w6b1VarA != null ? (String) o7h.s0(w6b1VarA.c) : null;
        if (str == null) {
            str = "";
        }
        nyn1.Q(this.d, new lsn0((String) null, this.c.j(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), y6h1VarA, r6h1.c, System.currentTimeMillis())).a));
    }

    public final void h() {
        this.a.a(new mhv0("sign_up_birthday", "edit", ew80.c, "age_confirmation"));
        x6h1 x6h1VarC = this.q.b.c();
        x6h1VarC.i.add(new a7h1("edit_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        this.c.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()));
    }
}
