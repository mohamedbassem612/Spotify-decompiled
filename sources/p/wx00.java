package p;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wx00 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wx00(Object obj, byte b) {
        super(4);
        this.a = b;
        this.b = obj;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj2).intValue();
        ((Number) obj4).intValue();
        otw.c((gf60) ((df60) this.b).d.getValue(), ef60.a, (qim0) null, (ipb1) null, (b0k) obj3, 48, 12);
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        qnl0 qnl0Var = (qnl0) obj;
        if (fh60.a[((ch60) obj4).ordinal()] == 1) {
            return new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", t5p1.q((String) ((tm) this.b).c))), qnl0Var.b, qnl0Var.a, System.currentTimeMillis());
        }
        eg.o();
        return null;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj3).intValue();
        d8r0 d8r0Var = ((bj60) obj).a;
        return new nvl0(new pvl0(new lvl0(new mjl0(new mjl0((urk0) ((ug3) this.b).c, d8r0Var.b, d8r0Var.a, d8r0Var.e), ""), (byte) 1), (byte) 0));
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        ug3 ug3Var = (ug3) this.b;
        return new p9c((Context) obj2, (iac0) ug3Var.b, (yfu) ug3Var.c, (Function0) ug3Var.e, (sjf1) ug3Var.d);
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj3).intValue();
        return (vbl0) ((cm0) this.b).i;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        ox00 ox00Var;
        w7h1 w7h1Var;
        ox00 ox00Var2;
        boolean z;
        jx00 jx00Var;
        Object obj5;
        w7h1 w7h1Var2;
        char c;
        String str;
        w7h1 w7h1Var3;
        int i;
        int i2;
        k1u ic40Var;
        int i3;
        int i4;
        int i5;
        int i6;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        boolean z2 = true;
        lnm lnmVar = null;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                qcl0 qcl0Var = (qcl0) obj;
                sx00 sx00Var = (tx00) obj3;
                ww00 ww00Var = (ww00) obj4;
                yqg yqgVar = ((zx00) obj6).f;
                r6h1 r6h1Var = qcl0Var.a;
                y6h1 y6h1Var = qcl0Var.b;
                if (ww00Var instanceof vw00) {
                    yw00 yw00VarA = sx00Var.a();
                    return yw00VarA instanceof yw00 ? qcl0Var.a(yw00VarA.a) : qcl0Var.h(((vw00) ww00Var).a);
                }
                if (ww00Var instanceof jw00) {
                    if (sx00Var instanceof sx00) {
                        jx00Var = sx00Var.f;
                    } else if (sx00Var instanceof rx00) {
                        jx00Var = ((rx00) sx00Var).g;
                    } else {
                        if (!(sx00Var instanceof qx00)) {
                            eg.o();
                            return null;
                        }
                        jx00Var = jx00.a;
                    }
                    int iOrdinal = jx00Var.ordinal();
                    if (iOrdinal == 0) {
                        x6h1 x6h1VarC = y6h1Var.c();
                        x6h1VarC.i.add(new a7h1("play_pause_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC.j = false;
                        y6h1 y6h1VarA = x6h1VarC.a();
                        String entityUri = sx00Var.getEntityUri();
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", entityUri != null ? entityUri : "")), y6h1VarA, r6h1Var, System.currentTimeMillis());
                    } else if (iOrdinal == 1) {
                        x6h1 x6h1VarC2 = y6h1Var.c();
                        x6h1VarC2.i.add(new a7h1("play_pause_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC2.j = false;
                        y6h1 y6h1VarA2 = x6h1VarC2.a();
                        String entityUri2 = sx00Var.getEntityUri();
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("resume", 1, Collections.singletonMap("item_to_be_resumed", entityUri2 != null ? entityUri2 : "")), y6h1VarA2, r6h1Var, System.currentTimeMillis());
                    } else {
                        if (iOrdinal != 2) {
                            eg.o();
                            return null;
                        }
                        x6h1 x6h1VarC3 = y6h1Var.c();
                        x6h1VarC3.i.add(new a7h1("play_pause_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC3.j = false;
                        y6h1 y6h1VarA3 = x6h1VarC3.a();
                        String entityUri3 = sx00Var.getEntityUri();
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("pause", 1, Collections.singletonMap("item_to_be_paused", entityUri3 != null ? entityUri3 : "")), y6h1VarA3, r6h1Var, System.currentTimeMillis());
                    }
                } else if (ww00Var instanceof iw00) {
                    x6h1 x6h1VarC4 = y6h1Var.c();
                    x6h1VarC4.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC4.a(), r6h1Var, System.currentTimeMillis());
                } else {
                    if (ww00Var instanceof cw00) {
                        return null;
                    }
                    if (ww00Var instanceof rw00) {
                        if (sx00Var instanceof sx00) {
                            z = sx00Var.e;
                        } else if (sx00Var instanceof rx00) {
                            z = ((rx00) sx00Var).f;
                        } else {
                            if (!(sx00Var instanceof qx00)) {
                                eg.o();
                                return null;
                            }
                            z = false;
                        }
                        if (z) {
                            x6h1 x6h1VarC5 = y6h1Var.c();
                            x6h1VarC5.i.add(new a7h1("add_to_queue_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC5.j = false;
                            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:now-playing:queue")), x6h1VarC5.a(), r6h1Var, System.currentTimeMillis());
                        } else {
                            x6h1 x6h1VarC6 = y6h1Var.c();
                            x6h1VarC6.i.add(new a7h1("add_to_queue_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC6.j = false;
                            y6h1 y6h1VarA4 = x6h1VarC6.a();
                            String entityUri4 = sx00Var.getEntityUri();
                            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("add_item_to_queue", 1, Collections.singletonMap("item_to_add_to_queue", entityUri4 != null ? entityUri4 : "")), y6h1VarA4, r6h1Var, System.currentTimeMillis());
                        }
                    } else if (ww00Var instanceof mw00) {
                        if (sx00Var instanceof sx00) {
                            ox00Var2 = null;
                        } else if (sx00Var instanceof rx00) {
                            ox00Var2 = ((rx00) sx00Var).e;
                        } else {
                            if (!(sx00Var instanceof qx00)) {
                                eg.o();
                                return null;
                            }
                            ox00Var2 = null;
                        }
                        if (ox00Var2 instanceof kx00) {
                            x6h1 x6h1VarC7 = y6h1Var.c();
                            x6h1VarC7.i.add(new a7h1("preview_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC7.j = false;
                            y6h1 y6h1VarA5 = x6h1VarC7.a();
                            int iB = (int) (yqgVar.b() - ((kx00) ox00Var2).b);
                            z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                            String strValueOf = String.valueOf(iB);
                            w7h1Var = new w7h1("", "", z7h1Var, new x7h1("stop_preview", 1, Collections.singletonMap("duration_ms", strValueOf != null ? strValueOf : "")), y6h1VarA5, r6h1Var, System.currentTimeMillis());
                        } else {
                            if (!(ox00Var2 instanceof mx00)) {
                                return null;
                            }
                            x6h1 x6h1VarC8 = y6h1Var.c();
                            x6h1VarC8.i.add(new a7h1("preview_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC8.j = false;
                            y6h1 y6h1VarA6 = x6h1VarC8.a();
                            String entityUri5 = sx00Var.getEntityUri();
                            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play_preview", 1, Collections.singletonMap("item_to_be_previewed", entityUri5 != null ? entityUri5 : "")), y6h1VarA6, r6h1Var, System.currentTimeMillis());
                        }
                    } else {
                        if (!(ww00Var instanceof ow00)) {
                            return null;
                        }
                        if (sx00Var instanceof sx00) {
                            ox00Var = null;
                        } else if (sx00Var instanceof rx00) {
                            ox00Var = ((rx00) sx00Var).e;
                        } else {
                            if (!(sx00Var instanceof qx00)) {
                                eg.o();
                                return null;
                            }
                            ox00Var = null;
                        }
                        if (!(ox00Var instanceof kx00)) {
                            return null;
                        }
                        x6h1 x6h1VarC9 = y6h1Var.c();
                        x6h1VarC9.i.add(new a7h1("preview_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC9.j = false;
                        y6h1 y6h1VarA7 = x6h1VarC9.a();
                        int iB2 = (int) (yqgVar.b() - ((kx00) ox00Var).b);
                        z7h1 z7h1Var2 = new z7h1("hit", 1, b7xVar);
                        String strValueOf2 = String.valueOf(iB2);
                        w7h1Var = new w7h1("", "", z7h1Var2, new x7h1("stop_preview", 1, Collections.singletonMap("duration_ms", strValueOf2 != null ? strValueOf2 : "")), y6h1VarA7, r6h1Var, System.currentTimeMillis());
                    }
                }
                return w7h1Var;
            case 1:
                ((Number) obj3).intValue();
                az00 az00Var = (az00) obj6;
                return new pnl0(az00Var.b.path(), az00Var.a.a, (r6h1) obj4);
            case 2:
                return new vh((Context) obj2, (ViewGroup) obj3, (rt01) obj6);
            case 3:
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var = (b0k) obj3;
                ((Number) obj4).intValue();
                qim0 qim0VarD = u291.D(nim0.a, (era) null, 3);
                uwr uwrVar = cbx.a;
                zsc zscVar = zex.a;
                long j = ((vex) zscVar.e).i;
                cua cuaVar = cbx.b(x340Var).f;
                qim0 qim0VarX = uyn1.x(dug.f(qim0VarD, j, er31.b(8.0f)), cbx.b(x340Var).e.b);
                c380 c380Var = (c380) obj6;
                gfh0 gfh0VarC = t1c.c(een.h, false);
                x340 x340Var2 = x340Var;
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
                hzj.A.getClass();
                x340 x340Var3 = x340Var;
                if (x340Var3.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(hmb0.t1);
                } else {
                    x340Var3.v0();
                }
                nko1.H(gfh0VarC, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                if (iIntValue < 0 || iIntValue >= c380Var.size()) {
                    obj5 = (String) o7h.s0(c380Var);
                    if (obj5 == null) {
                        obj5 = "";
                    }
                } else {
                    obj5 = c380Var.get(iIntValue);
                }
                uwo1.e((String) obj5, (qim0) null, cbx.d(x340Var).g, ((vex) zscVar.e).m, new a0e1(3), (iu30) null, 0, false, new cjc0(2), 0, new px8(fc11.G(8), fc11.G(16), 0L, (mx8) null, 12), x340Var, 0, 8, 738);
                x340Var3.r(true);
                return rih1Var;
            case 4:
                lk10 lk10Var = (lk10) obj3;
                uj10 uj10Var = (vj10) obj4;
                txk0 txk0Var = ((mk10) obj).a;
                y6h1 y6h1Var2 = txk0Var.b;
                if (uj10Var.equals(qj10.a)) {
                    x6h1 x6h1VarC10 = y6h1Var2.c();
                    x6h1VarC10.i.add(new a7h1("code_input_field", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC10.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("focus_input_field", 1, b7xVar), x6h1VarC10.a(), r6h1.c, System.currentTimeMillis());
                } else if (uj10Var.equals(tj10.a)) {
                    x6h1 x6h1VarC11 = y6h1Var2.c();
                    x6h1VarC11.i.add(new a7h1("redeem_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC11.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("submit", 1, b7xVar), x6h1VarC11.a(), r6h1.c, System.currentTimeMillis());
                } else if (uj10Var.equals(rj10.a)) {
                    int iC = l1d.C(lk10Var.b);
                    if (iC == 0 || iC == 1 || iC == 2) {
                        c = 2;
                    } else {
                        if (iC != 3) {
                            eg.o();
                            return null;
                        }
                        c = 1;
                    }
                    x6h1 x6h1VarC12 = y6h1Var2.c();
                    if (c == 1) {
                        str = "already_redeemed";
                    } else {
                        if (c != 2) {
                            throw null;
                        }
                        str = "success";
                    }
                    x6h1VarC12.i.add(new a7h1("done_button", str, (Integer) null, (String) null, (String) null));
                    x6h1VarC12.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC12.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (uj10Var.equals(sj10.a)) {
                        i8h1 i8h1Var = (i8h1) ((pt) obj6).i;
                        int iA = fuo1.A(lk10Var);
                        int iB3 = fuo1.B(lk10Var);
                        x6h1 x6h1VarC13 = y6h1Var2.c();
                        x6h1VarC13.i.add(new a7h1("redemption_state", z0l0.b(iA), (Integer) null, (String) null, z0l0.c(iB3)));
                        x6h1VarC13.j = true;
                        y6h1 y6h1VarA8 = x6h1VarC13.a();
                        k7h1 k7h1Var = new k7h1();
                        ((xjn) k7h1Var).a = y6h1VarA8;
                        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                        k7h1Var.e = txk0Var.c;
                        i8h1Var.f(k7h1Var.a(), (Set) null);
                        return null;
                    }
                    if (!(uj10Var instanceof uj10)) {
                        if (uj10Var instanceof pj10) {
                            return null;
                        }
                        eg.o();
                        return null;
                    }
                    int iC2 = l1d.C(uj10Var.a);
                    if (iC2 == 0) {
                        int iD = fuo1.D(lk10Var);
                        x6h1 x6h1VarC14 = y6h1Var2.c();
                        x6h1VarC14.i.add(new a7h1("system_dismiss", z0l0.d(iD), (Integer) null, (String) null, (String) null));
                        x6h1VarC14.j = false;
                        w7h1Var2 = new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC14.a(), r6h1.c, System.currentTimeMillis());
                    } else {
                        if (iC2 != 1 && iC2 != 2) {
                            eg.o();
                            return null;
                        }
                        int iD2 = fuo1.D(lk10Var);
                        x6h1 x6h1VarC15 = y6h1Var2.c();
                        x6h1VarC15.i.add(new a7h1("system_dismiss", z0l0.d(iD2), (Integer) null, (String) null, (String) null));
                        x6h1VarC15.j = false;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC15.a(), r6h1.c, System.currentTimeMillis());
                    }
                }
                return w7h1Var2;
            case 5:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                x340 x340Var4 = (b0k) obj3;
                ((Number) obj4).intValue();
                osv0 osv0Var = (osv0) obj6;
                if (zBooleanValue) {
                    x340 x340Var5 = x340Var4;
                    x340Var5.i0(684393624);
                    pwo1.b(osv0Var, x340Var5, 48);
                    x340Var5.r(false);
                } else {
                    x340 x340Var6 = x340Var4;
                    x340Var6.i0(684478874);
                    pwo1.c(osv0Var, x340Var6, 48);
                    x340Var6.r(false);
                }
                return rih1Var;
            case 6:
                oyk0 oyk0Var = (oyk0) obj;
                fr10 fr10Var = (fr10) obj2;
                ar10 ar10Var = (er10) obj4;
                r6h1 r6h1Var2 = oyk0Var.a;
                y6h1 y6h1Var3 = oyk0Var.b;
                cy10 cy10Var = ((hr10) obj3).a.d;
                if (ar10Var instanceof vq10) {
                    x6h1 x6h1VarC16 = y6h1Var3.c();
                    x6h1VarC16.i.add(new a7h1("copy_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC16.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("copy_to_clipboard", 1, b7xVar), x6h1VarC16.a(), r6h1Var2, System.currentTimeMillis());
                } else if (ar10Var instanceof ar10) {
                    if (cy10Var == cy10.b) {
                        x6h1 x6h1VarC17 = y6h1Var3.c();
                        x6h1VarC17.i.add(new a7h1("thumbs_down_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC17.j = false;
                        w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_deselect", 1, b7xVar), x6h1VarC17.a(), r6h1Var2, System.currentTimeMillis());
                    } else {
                        x6h1 x6h1VarC18 = y6h1Var3.c();
                        x6h1VarC18.i.add(new a7h1("thumbs_down_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC18.j = false;
                        w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", hyo1.l(ar10Var.a, ((mr10) obj6).d.a, fr10Var.e))), x6h1VarC18.a(), r6h1Var2, System.currentTimeMillis());
                    }
                } else if (ar10Var instanceof dr10) {
                    if (cy10Var == cy10.a) {
                        x6h1 x6h1VarC19 = y6h1Var3.c();
                        x6h1VarC19.i.add(new a7h1("thumbs_up_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC19.j = false;
                        w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_deselect", 1, b7xVar), x6h1VarC19.a(), r6h1Var2, System.currentTimeMillis());
                    } else {
                        x6h1 x6h1VarC20 = y6h1Var3.c();
                        x6h1VarC20.i.add(new a7h1("thumbs_up_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC20.j = false;
                        w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC20.a(), r6h1Var2, System.currentTimeMillis());
                    }
                } else {
                    if (!(ar10Var instanceof wq10)) {
                        return null;
                    }
                    x6h1 x6h1VarC21 = y6h1Var3.c();
                    x6h1VarC21.i.add(new a7h1("ai_disclaimer_link", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC21.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC21.a(), r6h1Var2, System.currentTimeMillis());
                }
                return w7h1Var3;
            case 7:
                ((Number) obj3).intValue();
                td20 td20Var = (td20) obj6;
                urk0 urk0Var = td20Var.a;
                e8r0 e8r0Var = td20Var.b;
                return new iwl0(new qgl0(new mjl0(urk0Var, e8r0Var.a().b, e8r0Var.a().a, e8r0Var.a().e)));
            case 8:
                al20 al20Var = (al20) obj;
                iu30 iu30Var = (iu30) obj2;
                x340 x340Var7 = (b0k) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (x340Var7.g(al20Var) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= x340Var7.i(iu30Var) ? 32 : 16;
                }
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(i & 1, (i & 147) != 146)) {
                    ((cl20) obj6).a.g(al20Var, iu30Var, x340Var8, i & 126);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 9:
                return new b14((Context) obj2, (ViewGroup) obj3, (ug3) obj6, (iu30) obj4);
            case 10:
                return new wc3((Context) obj2, (dx0) obj6);
            case 11:
                ((Number) obj3).intValue();
                return new cpl0(((h730) obj6).f.path(), (r6h1) obj4);
            case 12:
                ((Number) obj3).intValue();
                return (w3l0) ((rt01) obj6).d;
            case 13:
                jjm0 jjm0Var = (jjm0) obj;
                int iIntValue3 = ((Number) obj4).intValue();
                x340 x340Var9 = (b0k) obj3;
                x340Var9.i0(445308078);
                ven0 ven0VarS = v8r.s((lq61) obj2, x340Var9);
                rb30 rb30Var = (rb30) obj6;
                boolean zI = x340Var9.i(rb30Var);
                Object objT = x340Var9.T();
                if (zI || objT == fkj0.X) {
                    objT = new r20((Object) rb30Var, lnmVar, (byte) 19);
                    x340Var9.s0(objT);
                }
                jjm0Var.a((zu30) objT, x340Var9, (iIntValue3 << 3) & 112);
                lq61 lq61Var = (lq61) ven0VarS.getValue();
                qb30 qb30Var = new qb30(lq61Var.e, lq61Var.f);
                x340Var9.r(false);
                return qb30Var;
            case 14:
                wb40 wb40Var = (wb40) obj;
                iu30 iu30Var2 = (iu30) obj2;
                b0k b0kVar = (b0k) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                nlm nlmVar = ((zb40) obj6).b;
                wb40Var.getClass();
                Resources resources = nlmVar.a;
                Map map = wb40Var.d;
                List list = wb40Var.c;
                if (!wb40Var.e) {
                    if (list.isEmpty()) {
                        ic40Var = new jc40(nlmVar.b(wb40Var));
                    } else {
                        String strB = nlmVar.b(wb40Var);
                        String strA = nlmVar.a(wb40Var);
                        String strA2 = nlmVar.a(wb40Var);
                        String string = resources.getString(2131956165);
                        int iW0 = ihc1.w0(strA2, string, 0, false, 6);
                        tr80 tr80Var = new tr80(iW0, string.length() + iW0, 1);
                        String str2 = wb40Var.f;
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            lc40 lc40Var = (lc40) it.next();
                            Boolean bool = (Boolean) map.get(lc40Var.a);
                            boolean zBooleanValue2 = bool != null ? bool.booleanValue() : lc40Var.d;
                            boolean z3 = z2;
                            String str3 = lc40Var.a;
                            Map map2 = map;
                            String str4 = lc40Var.c;
                            String str5 = strB;
                            String str6 = lc40Var.b;
                            arrayList.add(new r8b(str3, new t8b(new s8b(str4, str6, lc40Var.e), str6, resources.getString(2131956172), !zBooleanValue2)));
                            it = it;
                            iIntValue4 = iIntValue4;
                            strB = str5;
                            map = map2;
                            z2 = z3;
                        }
                        i2 = iIntValue4;
                        ic40Var = new ic40(strB, strA, tr80Var, arrayList, !map.isEmpty(), str2);
                    }
                    d1u.o(ic40Var, iu30Var2, b0kVar, i2 & 112);
                    return rih1Var;
                }
                ic40Var = new kc40(nlmVar.b(wb40Var));
                i2 = iIntValue4;
                d1u.o(ic40Var, iu30Var2, b0kVar, i2 & 112);
                return rih1Var;
            case 15:
                p750 p750Var = (p750) obj;
                iu30 iu30Var3 = (iu30) obj2;
                x340 x340Var10 = (b0k) obj3;
                int iIntValue5 = ((Number) obj4).intValue();
                if ((iIntValue5 & 6) == 0) {
                    i3 = iIntValue5 | (x340Var10.g(p750Var) ? 4 : 2);
                } else {
                    i3 = iIntValue5;
                }
                if ((iIntValue5 & 48) == 0) {
                    i3 |= x340Var10.i(iu30Var3) ? 32 : 16;
                }
                x340 x340Var11 = x340Var10;
                if (x340Var11.Y(i3 & 1, (i3 & 147) != 146)) {
                    p750Var.getClass();
                    cgj1.g(p750Var, ((y750) obj6).c, iu30Var3, x340Var11, (i3 << 3) & 896);
                } else {
                    x340Var11.b0();
                }
                return rih1Var;
            case 16:
                p850 p850Var = (p850) obj;
                iu30 iu30Var4 = (iu30) obj2;
                x340 x340Var12 = (b0k) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i4 = iIntValue6 | ((iIntValue6 & 8) == 0 ? x340Var12.g(p850Var) : x340Var12.i(p850Var) ? 4 : 2);
                } else {
                    i4 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i4 |= x340Var12.i(iu30Var4) ? 32 : 16;
                }
                x340 x340Var13 = x340Var12;
                if (x340Var13.Y(i4 & 1, (i4 & 147) != 146)) {
                    p850Var.getClass();
                    j9k1.f(p850Var, ((s850) obj6).c, iu30Var4, x340Var13, (i4 << 3) & 896);
                } else {
                    x340Var13.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                c950 c950Var = (c950) obj;
                iu30 iu30Var5 = (iu30) obj2;
                x340 x340Var14 = (b0k) obj3;
                int iIntValue7 = ((Number) obj4).intValue();
                if ((iIntValue7 & 6) == 0) {
                    i5 = iIntValue7 | (x340Var14.g(c950Var) ? 4 : 2);
                } else {
                    i5 = iIntValue7;
                }
                if ((iIntValue7 & 48) == 0) {
                    i5 |= x340Var14.i(iu30Var5) ? 32 : 16;
                }
                x340 x340Var15 = x340Var14;
                if (x340Var15.Y(i5 & 1, (i5 & 147) != 146)) {
                    dem1.f(c950Var, ((e950) obj6).c, iu30Var5, x340Var15, ((i5 << 3) & 896) | (i5 & 14));
                } else {
                    x340Var15.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                s950 s950Var = (s950) obj;
                iu30 iu30Var6 = (iu30) obj2;
                x340 x340Var16 = (b0k) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                if ((iIntValue8 & 6) == 0) {
                    i6 = iIntValue8 | (x340Var16.g(s950Var) ? 4 : 2);
                } else {
                    i6 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i6 |= x340Var16.i(iu30Var6) ? 32 : 16;
                }
                x340 x340Var17 = x340Var16;
                if (x340Var17.Y(i6 & 1, (i6 & 147) != 146)) {
                    s950Var.getClass();
                    kln1.d(s950Var, ((u950) obj6).c, iu30Var6, x340Var17, (i6 << 3) & 896);
                } else {
                    x340Var17.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                iu30 iu30Var7 = (iu30) obj2;
                x340 x340Var18 = (b0k) obj3;
                int iIntValue9 = ((Number) obj4).intValue();
                if ((iIntValue9 & 48) == 0) {
                    iIntValue9 |= x340Var18.i(iu30Var7) ? 32 : 16;
                }
                x340 x340Var19 = x340Var18;
                if (x340Var19.Y(iIntValue9 & 1, (iIntValue9 & 145) != 144)) {
                    lnn1.a(((gb50) obj6).c, iu30Var7, x340Var19, iIntValue9 & 112);
                } else {
                    x340Var19.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                int iIntValue10 = ((Number) obj4).intValue();
                don1.c((qb50) obj, ((sb50) obj6).c, (iu30) obj2, (b0k) obj3, ((iIntValue10 << 3) & 896) | (iIntValue10 & 14));
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                int iIntValue11 = ((Number) obj4).intValue();
                fdg1.f((jc50) obj, ((lc50) obj6).e, (iu30) obj2, (b0k) obj3, ((iIntValue11 << 3) & 896) | (iIntValue11 & 14));
                return rih1Var;
            case 22:
                kq50 kq50Var = (kq50) obj;
                return new lpl0(new fjl0(((n6r0) ((umf0) obj6).d).path(), kq50Var.b, (r6h1) obj4), Integer.valueOf(((Number) obj3).intValue()), kq50Var.a.b);
            case 23:
                return a(obj, obj2, obj3, obj4);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return d(obj, obj2, obj3, obj4);
            case 25:
                return e(obj, obj2, obj3, obj4);
            case 26:
                return f(obj, obj2, obj3, obj4);
            case 27:
                ((Number) obj3).intValue();
                return ((xv60) obj6).d;
            case 28:
                return g(obj, obj2, obj3, obj4);
            default:
                yql0 yql0Var = (yql0) obj;
                if (((km70) obj4).equals(km70.a)) {
                    return yql0Var.a(((tm) obj6).h());
                }
                eg.o();
                return null;
        }
    }
}
