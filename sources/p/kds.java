package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kds extends hab0 implements zu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kds(Object obj, byte b) {
        super(4);
        this.a = b;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        tf50 tf50Var = (tf50) obj;
        ((Number) obj3).intValue();
        return new bfl0(new sqk0(new tdl0((byte) 3), Integer.valueOf(tf50Var.a)), tf50Var.c, Integer.valueOf(tf50Var.b), tf50Var.f ? 1 : 2);
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        ryl0 ryl0Var = (ryl0) obj;
        aw70 aw70Var = (aw70) obj2;
        n600 n600Var = (n600) obj4;
        if (n600Var instanceof wzz) {
            return ryl0Var.a(aw70Var.h);
        }
        if (n600Var instanceof yzz) {
            return ryl0Var.g();
        }
        eg.o();
        return null;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        k5m0 k5m0Var = (k5m0) obj;
        idc0 idc0Var = (idc0) obj4;
        uqk0 uqk0Var = k5m0Var.b.c;
        y6h1 y6h1Var = k5m0Var.a;
        Map map = ((ndc0) obj3).a;
        boolean zEquals = idc0Var.equals(gdc0.a);
        b7x b7xVar = b7x.a;
        if (zEquals) {
            x6h1 x6h1VarC = y6h1Var.c();
            x6h1VarC.i.add(new a7h1("clear_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = true;
            return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("clear_filter", 1, b7xVar), x6h1VarC.a(), uqk0Var.b, System.currentTimeMillis());
        }
        if (idc0Var instanceof fdc0) {
            fdc0 fdc0Var = (fdc0) idc0Var;
            kdc0 kdc0Var = (ldc0) map.get(fdc0Var.a);
            if (kdc0Var instanceof kdc0) {
                String strE = zdc0.e(kdc0Var.b);
                Integer numValueOf = Integer.valueOf(fdc0Var.b);
                x6h1 x6h1VarC2 = y6h1Var.c();
                x6h1VarC2.i.add(new a7h1("filter_chip", strE, numValueOf, (String) null, (String) null));
                x6h1VarC2.j = true;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("filter", 1, b7xVar), x6h1VarC2.a(), uqk0Var.b, System.currentTimeMillis());
            }
        } else if (idc0Var instanceof edc0) {
            edc0 edc0Var = (edc0) idc0Var;
            kdc0 kdc0Var2 = (ldc0) map.get(edc0Var.a);
            if (kdc0Var2 instanceof kdc0) {
                String strE2 = zdc0.e(kdc0Var2.b);
                Integer numValueOf2 = Integer.valueOf(edc0Var.b);
                x6h1 x6h1VarC3 = y6h1Var.c();
                x6h1VarC3.i.add(new a7h1("filter_chip", strE2, numValueOf2, (String) null, (String) null));
                x6h1VarC3.j = true;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("clear_filter", 1, b7xVar), x6h1VarC3.a(), uqk0Var.b, System.currentTimeMillis());
            }
        } else if (!(idc0Var instanceof hdc0)) {
            eg.o();
            return null;
        }
        return null;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        v4m0 v4m0Var = (v4m0) obj;
        e8d0 e8d0Var = (e8d0) obj2;
        if (!((d8d0) obj4).equals(d8d0.a)) {
            eg.o();
            return null;
        }
        x6h1 x6h1VarC = v4m0Var.b.c();
        x6h1VarC.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("actions", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        y6h1 y6h1VarA = x6h1VarC2.a();
        String str = e8d0Var.a;
        x6h1 x6h1VarC3 = y6h1VarA.c();
        x6h1VarC3.i.add(new a7h1("edit_button", (String) null, (Integer) null, str, (String) null));
        x6h1VarC3.j = false;
        return new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", ktv.c(e8d0Var.a))), x6h1VarC3.a(), v4m0Var.a, System.currentTimeMillis());
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        ((Number) obj3).intValue();
        lrn1 lrn1Var = ((xnb1) obj2).d;
        if (lrn1Var instanceof vzg1) {
            i = 2;
        } else {
            if (!lrn1Var.equals(wzg1.c) && !(lrn1Var instanceof uzg1)) {
                eg.o();
                return null;
            }
            i = 1;
        }
        return new l7l0(i, r6h1.c);
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        ((Number) obj3).intValue();
        lrn1 lrn1Var = ((xnb1) obj2).d;
        if (lrn1Var instanceof vzg1) {
            i = 2;
        } else {
            if (!lrn1Var.equals(wzg1.c) && !(lrn1Var instanceof uzg1)) {
                eg.o();
                return null;
            }
            i = 1;
        }
        return new l7l0(i, r6h1.c);
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        n8h1 n8h1Var = (n8h1) obj;
        o7g0 o7g0Var = (o7g0) obj2;
        if (!((n7g0) obj4).equals(n7g0.a)) {
            eg.o();
            return null;
        }
        String strF = umf0.f(o7g0Var);
        int iOrdinal = o7g0Var.a.ordinal();
        b7x b7xVar = b7x.a;
        if (iOrdinal == 0) {
            o8l0 o8l0Var = (o8l0) n8h1Var;
            z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
            if (strF == null) {
                strF = "";
            }
            return new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strF)), o8l0Var.a, r6h1.c, System.currentTimeMillis());
        }
        if (iOrdinal != 1) {
            eg.o();
            return null;
        }
        p8l0 p8l0Var = (p8l0) n8h1Var;
        z7h1 z7h1Var2 = new z7h1("hit", 1, b7xVar);
        if (strF == null) {
            strF = "";
        }
        return new w7h1("", "", z7h1Var2, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strF)), p8l0Var.a, r6h1.c, System.currentTimeMillis());
    }

    private final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        dkl0 dkl0Var = (dkl0) obj;
        aok0 aok0Var = (bok0) obj4;
        y6h1 y6h1Var = dkl0Var.b;
        lhg1 lhg1Var = ((cok0) obj2).a;
        boolean z = aok0Var instanceof aok0;
        b7x b7xVar = b7x.a;
        if (z) {
            aok0 aok0Var2 = aok0Var;
            int i = aok0Var2.b;
            int i2 = aok0Var2.e;
            if (!aok0Var2.c) {
                boolean z2 = aok0Var2.d;
                ijf1 ijf1Var = aok0Var2.a;
                if (!z2) {
                    int iOrdinal = ijf1Var.ordinal();
                    if (iOrdinal == 0) {
                        String str = lhg1Var.b.c;
                        x6h1 x6h1VarC = y6h1Var.c();
                        x6h1VarC.i.add(new a7h1("track_a_waveform", (String) null, (Integer) null, str, (String) null));
                        x6h1VarC.j = false;
                        y6h1 y6h1VarA = x6h1VarC.a();
                        z7h1 z7h1Var = new z7h1("swipe", 1, b7xVar);
                        String strValueOf = String.valueOf(i);
                        return new w7h1("", "", z7h1Var, new x7h1("seek_to_time", 1, Collections.singletonMap("ms_to_seek_to", strValueOf != null ? strValueOf : "")), y6h1VarA, dkl0Var.a, System.currentTimeMillis());
                    }
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    String str2 = lhg1Var.b.d;
                    x6h1 x6h1VarC2 = y6h1Var.c();
                    x6h1VarC2.i.add(new a7h1("track_b_waveform", (String) null, (Integer) null, str2, (String) null));
                    x6h1VarC2.j = false;
                    y6h1 y6h1VarA2 = x6h1VarC2.a();
                    z7h1 z7h1Var2 = new z7h1("swipe", 1, b7xVar);
                    String strValueOf2 = String.valueOf(i);
                    return new w7h1("", "", z7h1Var2, new x7h1("seek_to_time", 1, Collections.singletonMap("ms_to_seek_to", strValueOf2 != null ? strValueOf2 : "")), y6h1VarA2, dkl0Var.a, System.currentTimeMillis());
                }
                int iOrdinal2 = ijf1Var.ordinal();
                if (iOrdinal2 == 0) {
                    String str3 = lhg1Var.b.c;
                    x6h1 x6h1VarC3 = y6h1Var.c();
                    x6h1VarC3.i.add(new a7h1("track_a_waveform", (String) null, (Integer) null, str3, (String) null));
                    x6h1VarC3.j = false;
                    x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                    x6h1VarC4.i.add(new a7h1("jog_control_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    y6h1 y6h1VarA3 = x6h1VarC4.a();
                    z7h1 z7h1Var3 = new z7h1("hit", 1, b7xVar);
                    String strValueOf3 = String.valueOf(i2);
                    return new w7h1("", "", z7h1Var3, new x7h1("seek_by_time", 1, Collections.singletonMap("ms_seeked_offset", strValueOf3 != null ? strValueOf3 : "")), y6h1VarA3, dkl0Var.a, System.currentTimeMillis());
                }
                if (iOrdinal2 != 1) {
                    eg.o();
                    return null;
                }
                String str4 = lhg1Var.b.d;
                x6h1 x6h1VarC5 = y6h1Var.c();
                x6h1VarC5.i.add(new a7h1("track_b_waveform", (String) null, (Integer) null, str4, (String) null));
                x6h1VarC5.j = false;
                x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                x6h1VarC6.i.add(new a7h1("jog_control_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = false;
                y6h1 y6h1VarA4 = x6h1VarC6.a();
                z7h1 z7h1Var4 = new z7h1("hit", 1, b7xVar);
                String strValueOf4 = String.valueOf(i2);
                return new w7h1("", "", z7h1Var4, new x7h1("seek_by_time", 1, Collections.singletonMap("ms_seeked_offset", strValueOf4 != null ? strValueOf4 : "")), y6h1VarA4, dkl0Var.a, System.currentTimeMillis());
            }
        } else if (!(aok0Var instanceof wnk0)) {
            if (aok0Var instanceof znk0) {
                r6h1 r6h1VarB = dkl0Var.b();
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-playlist-mixing-edit-curves";
                x6h1VarI.f = "1.0.0";
                x6h1VarI.g = "22.0.0";
                y6h1 y6h1VarA5 = x6h1VarI.a();
                znk0 znk0Var = (znk0) aok0Var;
                int iG = psy.g(znk0Var.d);
                int iF = psy.f(znk0Var.c);
                x6h1 x6h1VarC7 = y6h1VarA5.c();
                x6h1VarC7.i.add(new a7h1("curve_node", knl0.d(iG), (Integer) null, (String) null, knl0.e(iF)));
                x6h1VarC7.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC7.a(), r6h1VarB, System.currentTimeMillis());
            }
            if (aok0Var instanceof tnk0) {
                r6h1 r6h1VarB2 = dkl0Var.b();
                y6h1 y6h1Var3 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-playlist-mixing-edit-curves";
                x6h1VarI2.f = "1.0.0";
                x6h1VarI2.g = "22.0.0";
                y6h1 y6h1VarA6 = x6h1VarI2.a();
                tnk0 tnk0Var = (tnk0) aok0Var;
                int iG2 = psy.g(tnk0Var.d);
                int iF2 = psy.f(tnk0Var.c);
                x6h1 x6h1VarC8 = y6h1VarA6.c();
                x6h1VarC8.i.add(new a7h1("curve_node", knl0.d(iG2), (Integer) null, (String) null, knl0.e(iF2)));
                x6h1VarC8.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC8.a(), r6h1VarB2, System.currentTimeMillis());
            }
            if (aok0Var instanceof unk0) {
                r6h1 r6h1VarB3 = dkl0Var.b();
                y6h1 y6h1Var4 = y6h1.i;
                x6h1 x6h1VarI3 = i3o1.i();
                x6h1VarI3.h = "music";
                x6h1VarI3.a = "mobile-playlist-mixing-edit-curves";
                x6h1VarI3.f = "1.0.0";
                x6h1VarI3.g = "22.0.0";
                y6h1 y6h1VarA7 = x6h1VarI3.a();
                unk0 unk0Var = (unk0) aok0Var;
                int iG3 = psy.g(unk0Var.d);
                int iF3 = psy.f(unk0Var.c);
                x6h1 x6h1VarC9 = y6h1VarA7.c();
                x6h1VarC9.i.add(new a7h1("curve_node", knl0.d(iG3), (Integer) null, (String) null, knl0.e(iF3)));
                x6h1VarC9.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC9.a(), r6h1VarB3, System.currentTimeMillis());
            }
            if (aok0Var instanceof vnk0) {
                r6h1 r6h1VarB4 = dkl0Var.b();
                y6h1 y6h1Var5 = y6h1.i;
                x6h1 x6h1VarI4 = i3o1.i();
                x6h1VarI4.h = "music";
                x6h1VarI4.a = "mobile-playlist-mixing-edit-curves";
                x6h1VarI4.f = "1.0.0";
                x6h1VarI4.g = "22.0.0";
                y6h1 y6h1VarA8 = x6h1VarI4.a();
                vnk0 vnk0Var = (vnk0) aok0Var;
                int iG4 = psy.g(vnk0Var.d);
                int iF4 = psy.f(vnk0Var.c);
                x6h1 x6h1VarC10 = y6h1VarA8.c();
                x6h1VarC10.i.add(new a7h1("curve_node", knl0.d(iG4), (Integer) null, (String) null, knl0.e(iF4)));
                x6h1VarC10.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC10.a(), r6h1VarB4, System.currentTimeMillis());
            }
            if (!(aok0Var instanceof ynk0)) {
                if (!(aok0Var instanceof xnk0)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC11 = y6h1Var.c();
                x6h1VarC11.i.add(new a7h1("transition_window", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC11.j = false;
                y6h1 y6h1VarA9 = x6h1VarC11.a();
                int i3 = ((xnk0) aok0Var).a;
                z7h1 z7h1Var5 = new z7h1("swipe", 1, b7xVar);
                String strValueOf5 = String.valueOf(i3);
                return new w7h1("", "", z7h1Var5, new x7h1("seek_by_time", 1, Collections.singletonMap("ms_seeked_offset", strValueOf5 != null ? strValueOf5 : "")), y6h1VarA9, dkl0Var.a, System.currentTimeMillis());
            }
            x6h1 x6h1VarC12 = y6h1Var.c();
            x6h1VarC12.i.add(new a7h1("transition_window", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC12.j = false;
            y6h1 y6h1VarA10 = x6h1VarC12.a();
            ynk0 ynk0Var = (ynk0) aok0Var;
            int i4 = ynk0Var.a;
            int i5 = ynk0Var.b;
            z7h1 z7h1Var6 = new z7h1("pinch", 1, b7xVar);
            String strValueOf6 = String.valueOf(i4);
            if (strValueOf6 == null) {
                strValueOf6 = "";
            }
            mmr0 mmr0Var = new mmr0("start_integer", strValueOf6);
            String strValueOf7 = String.valueOf(i5);
            if (strValueOf7 == null) {
                strValueOf7 = "";
            }
            return new w7h1("", "", z7h1Var6, new x7h1("set_integer_range", 1, sqg0.J(new mmr0[]{mmr0Var, new mmr0("end_integer", strValueOf7), new mmr0("min_integer", ""), new mmr0("max_integer", "")})), y6h1VarA10, dkl0Var.a, System.currentTimeMillis());
        }
        return null;
    }

    private final Object k(Object obj, Object obj2, Object obj3, Object obj4) {
        uhn0 uhn0Var = (whn0) obj4;
        y6h1 y6h1Var = ((x8l0) obj).a;
        c380 c380Var = ((xhn0) obj2).a;
        boolean z = uhn0Var instanceof uhn0;
        int i = 2;
        b7x b7xVar = b7x.a;
        if (z) {
            shn0 shn0Var = uhn0Var.a;
            int iOrdinal = shn0Var.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    eg.o();
                    return null;
                }
                i = 1;
            }
            Integer numValueOf = Integer.valueOf(c380Var.indexOf(shn0Var));
            x6h1 x6h1VarC = y6h1Var.c();
            x6h1VarC.i.add(new a7h1("filter_chip", s7l0.d(i), numValueOf, (String) null, (String) null));
            x6h1VarC.j = false;
            return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("filter", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
        }
        if (!(uhn0Var instanceof thn0)) {
            if (!uhn0Var.equals(vhn0.a)) {
                eg.o();
                return null;
            }
            x6h1 x6h1VarC2 = y6h1Var.c();
            x6h1VarC2.i.add(new a7h1("clear_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = false;
            return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("clear_filter", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
        }
        shn0 shn0Var2 = ((thn0) uhn0Var).a;
        int iOrdinal2 = shn0Var2.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 != 1) {
                eg.o();
                return null;
            }
            i = 1;
        }
        Integer numValueOf2 = Integer.valueOf(c380Var.indexOf(shn0Var2));
        x6h1 x6h1VarC3 = y6h1Var.c();
        x6h1VarC3.i.add(new a7h1("filter_chip", s7l0.d(i), numValueOf2, (String) null, (String) null));
        x6h1VarC3.j = false;
        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("clear_filter", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
    }

    private final Object m(Object obj, Object obj2, Object obj3, Object obj4) {
        p7l0 p7l0Var = (p7l0) obj;
        jjn0 jjn0Var = (jjn0) obj2;
        if (!((ijn0) obj4).equals(ijn0.a)) {
            eg.o();
            return null;
        }
        x6h1 x6h1VarC = p7l0Var.b.c();
        x6h1VarC.i.add(new a7h1("name_row", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        String strG = kjn0.g(jjn0Var.a, jjn0Var.b);
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (strG == null) {
            strG = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strG)), y6h1VarA, p7l0Var.a, System.currentTimeMillis());
    }

    private final Object n(Object obj, Object obj2, Object obj3, Object obj4) {
        tfl0 tfl0Var = (tfl0) obj;
        bkn0 bkn0Var = ((ekn0) obj2).b;
        if (!((dkn0) obj4).equals(dkn0.a)) {
            eg.o();
            return null;
        }
        if (!(bkn0Var instanceof bkn0)) {
            return null;
        }
        x6h1 x6h1VarC = tfl0Var.b.c();
        x6h1VarC.i.add(new a7h1("managed_group", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("name_row", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        y6h1 y6h1VarA = x6h1VarC2.a();
        String strE = fkn0.e(bkn0Var.c);
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (strE == null) {
            strE = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strE)), y6h1VarA, tfl0Var.a, System.currentTimeMillis());
    }

    private final Object o(Object obj, Object obj2, Object obj3, Object obj4) {
        h2m0 h2m0Var = (h2m0) obj;
        btn0 btn0Var = ((tsn0) obj4).a;
        mtn0 mtn0Var = btn0Var.d;
        if (mtn0Var != null) {
            iu30 iu30Var = mtn0Var.a;
            vu30 vu30Var = mtn0Var.b;
            n8h1 n8h1Var = (n8h1) iu30Var.invoke(h2m0Var);
            atn0 atn0Var = btn0Var.f;
            lik1 lik1Var = btn0Var.c;
            if (atn0Var instanceof zsn0) {
                return (w7h1) vu30Var.invoke(n8h1Var, lik1Var.a);
            }
            if (atn0Var instanceof xsn0) {
                w7h1 w7h1Var = (w7h1) mtn0Var.c.invoke(n8h1Var);
                return w7h1Var == null ? (w7h1) vu30Var.invoke(n8h1Var, lik1Var.a) : w7h1Var;
            }
            if (!(atn0Var instanceof ysn0)) {
                eg.o();
            }
        }
        return null;
    }

    private final Object p(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj3).intValue();
        return new utk0(new xok0((byte) 8), twb.j(((l3o0) obj).e));
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        Object obj5;
        Object obj6;
        w7h1 w7h1Var2;
        char c;
        String str;
        w7h1 w7h1Var3;
        String str2;
        String str3;
        String str4;
        String str5;
        Object obj7;
        w7h1 w7h1Var4;
        w7h1 w7h1Var5;
        w7h1 w7h1Var6;
        String str6;
        byte b = this.a;
        char c2 = 4;
        char c3 = 3;
        b7x b7xVar = b7x.a;
        int i = 2;
        int i2 = 1;
        switch (b) {
            case 0:
                r6h1 r6h1Var = (r6h1) obj4;
                Integer numValueOf = Integer.valueOf(((Number) obj3).intValue());
                int i3 = ((gbq0) obj).a;
                int iC = l1d.C(i3);
                if (iC == 0) {
                    i = 1;
                } else if (iC != 1) {
                    if (iC == 2) {
                        i = 13;
                    } else {
                        if (iC != 3) {
                            eg.o();
                            return null;
                        }
                        i = 14;
                    }
                }
                return new c5m0(ab80.e(i), numValueOf, null, br0.g(i3), r6h1Var);
            case 1:
                c5m0 c5m0Var = (c5m0) obj;
                gbq0 gbq0Var = (gbq0) obj2;
                if (lds.a[((fbq0) obj4).ordinal()] == 1) {
                    return c5m0Var.a(br0.g(gbq0Var.a));
                }
                eg.o();
                return null;
            case 2:
                r6h1 r6h1Var2 = (r6h1) obj4;
                Integer numValueOf2 = Integer.valueOf(((Number) obj3).intValue());
                int i4 = ((ggq0) obj).a;
                int iC2 = l1d.C(i4);
                if (iC2 == 0) {
                    i = 1;
                } else if (iC2 != 1) {
                    if (iC2 == 2) {
                        i = 13;
                    } else {
                        if (iC2 != 3) {
                            eg.o();
                            return null;
                        }
                        i = 14;
                    }
                }
                return new c5m0(ab80.e(i), numValueOf2, null, umf0.g(i4), r6h1Var2);
            case 3:
                c5m0 c5m0Var2 = (c5m0) obj;
                ggq0 ggq0Var = (ggq0) obj2;
                if (tds.a[((fgq0) obj4).ordinal()] == 1) {
                    return c5m0Var2.a(umf0.g(ggq0Var.a));
                }
                eg.o();
                return null;
            case 4:
                ((Number) obj3).intValue();
                mjl0 mjl0Var = new mjl0(new j3m0((r6h1) obj4));
                int iC3 = l1d.C(((rwk1) obj).getType());
                if (iC3 != 0) {
                    if (iC3 == 1) {
                        i2 = 5;
                    } else if (iC3 == 2) {
                        i2 = 2;
                    } else if (iC3 == 3) {
                        i2 = 3;
                    } else if (iC3 == 4) {
                        i2 = 6;
                    } else {
                        if (iC3 != 5) {
                            eg.o();
                            return null;
                        }
                        i2 = 4;
                    }
                }
                return new h3m0(mjl0Var, i2);
            case 5:
                x6h1 x6h1VarC = ((o7l0) obj).a.c();
                x6h1VarC.i.add(new a7h1("delete_account_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                String str7 = nik1.X3.b("spotify:internal:parental-control:delete-account:".concat(((j6t) obj2).a)).a;
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                if (str7 == null) {
                    str7 = "";
                }
                return new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str7)), y6h1VarA, r6h1.c, System.currentTimeMillis());
            case 6:
                a8x a8xVar = (a8x) obj;
                ((Number) obj3).intValue();
                return new x5m0(new mjl0(new c4m0((r6h1) obj4, (byte) 6), a8xVar.d, Integer.valueOf(a8xVar.e)), a8xVar.f);
            case 7:
                ((Number) obj3).intValue();
                return new a6l0(new g5l0((r6h1) obj4, (byte) 1), (String) ihc1.Q0(((cgy) obj).a.f, new String[]{"?"}, 0, 6).get(0));
            case 8:
                tfl0 tfl0Var = (tfl0) obj;
                nli0 nli0Var = (nli0) obj4;
                y6h1 y6h1Var = tfl0Var.b;
                int iC4 = l1d.C(((ds00) obj2).a);
                String str8 = "explicit_content_off";
                if (iC4 != 0) {
                    if (iC4 != 1) {
                        eg.o();
                        return null;
                    }
                    if (!(nli0Var instanceof nli0)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC2 = y6h1Var.c();
                    x6h1VarC2.i.add(new a7h1("self_managed_group", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    x6h1 x6h1VarC3 = x6h1VarC2.a().c();
                    x6h1VarC3.i.add(new a7h1("play_explicit_content_row", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    y6h1 y6h1VarA2 = x6h1VarC3.a();
                    boolean z = nli0Var.a;
                    char c4 = z ? (char) 1 : (char) 2;
                    char c5 = z ? (char) 2 : (char) 1;
                    z7h1 z7h1Var2 = new z7h1("hit", 1, b7xVar);
                    if (c4 == 1) {
                        obj6 = "explicit_content_off";
                    } else {
                        if (c4 != 2) {
                            throw null;
                        }
                        obj6 = "explicit_content_on";
                    }
                    mmr0 mmr0Var = new mmr0("state_before_toggle", obj6);
                    if (c5 != 1) {
                        if (c5 != 2) {
                            throw null;
                        }
                        str8 = "explicit_content_on";
                    }
                    w7h1Var = new w7h1("", "", z7h1Var2, new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{mmr0Var, new mmr0("state_after_toggle", str8)})), y6h1VarA2, tfl0Var.a, System.currentTimeMillis());
                } else {
                    if (!(nli0Var instanceof nli0)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC4 = y6h1Var.c();
                    x6h1VarC4.i.add(new a7h1("managed_group", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    x6h1 x6h1VarC5 = x6h1VarC4.a().c();
                    x6h1VarC5.i.add(new a7h1("play_explicit_content_row", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    y6h1 y6h1VarA3 = x6h1VarC5.a();
                    boolean z2 = nli0Var.a;
                    char c6 = z2 ? (char) 1 : (char) 2;
                    char c7 = z2 ? (char) 2 : (char) 1;
                    z7h1 z7h1Var3 = new z7h1("hit", 1, b7xVar);
                    if (c6 == 1) {
                        obj5 = "explicit_content_off";
                    } else {
                        if (c6 != 2) {
                            throw null;
                        }
                        obj5 = "explicit_content_on";
                    }
                    mmr0 mmr0Var2 = new mmr0("state_before_toggle", obj5);
                    if (c7 != 1) {
                        if (c7 != 2) {
                            throw null;
                        }
                        str8 = "explicit_content_on";
                    }
                    w7h1Var = new w7h1("", "", z7h1Var3, new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{mmr0Var2, new mmr0("state_after_toggle", str8)})), y6h1VarA3, tfl0Var.a, System.currentTimeMillis());
                }
                return w7h1Var;
            case 9:
                m2m0 m2m0Var = (n8h1) obj;
                dv10 dv10Var = (rv10) obj4;
                uv10 uv10Var = ((vv10) obj2).a;
                if (uv10Var instanceof sv10) {
                    y6h1 y6h1Var2 = m2m0Var.a;
                    if (dv10Var instanceof iv10) {
                        x6h1 x6h1VarC6 = y6h1Var2.c();
                        x6h1VarC6.i.add(new a7h1("edit_text_field", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC6.j = false;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis());
                    } else if (dv10Var instanceof xu10) {
                        x6h1 x6h1VarC7 = y6h1Var2.c();
                        x6h1VarC7.i.add(new a7h1("context_menu", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC7.j = false;
                        x6h1 x6h1VarC8 = x6h1VarC7.a().c();
                        x6h1VarC8.i.add(new a7h1("edit_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC8.j = false;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC8.a(), r6h1.c, System.currentTimeMillis());
                    } else if (dv10Var instanceof hv10) {
                        x6h1 x6h1VarC9 = y6h1Var2.c();
                        x6h1VarC9.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC9.j = false;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC9.a(), r6h1.c, System.currentTimeMillis());
                    } else if (dv10Var instanceof tu10) {
                        x6h1 x6h1VarC10 = y6h1Var2.c();
                        x6h1VarC10.i.add(new a7h1("context_menu", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC10.j = false;
                        x6h1 x6h1VarC11 = x6h1VarC10.a().c();
                        x6h1VarC11.i.add(new a7h1("delete_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC11.j = false;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC11.a(), r6h1.c, System.currentTimeMillis());
                    } else if (dv10Var instanceof fv10) {
                        x6h1 x6h1VarC12 = y6h1Var2.c();
                        x6h1VarC12.i.add(new a7h1("undo_edit_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC12.j = false;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("discard_changes", 1, b7xVar), x6h1VarC12.a(), r6h1.c, System.currentTimeMillis());
                    } else if (dv10Var instanceof jv10) {
                        x6h1 x6h1VarC13 = y6h1Var2.c();
                        x6h1VarC13.i.add(new a7h1("submit_edit_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC13.j = false;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC13.a(), r6h1.c, System.currentTimeMillis());
                    } else if (dv10Var instanceof su10) {
                        x6h1 x6h1VarC14 = y6h1Var2.c();
                        x6h1VarC14.i.add(new a7h1("delete_confirmation_dialog", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC14.j = false;
                        x6h1 x6h1VarC15 = x6h1VarC14.a().c();
                        x6h1VarC15.i.add(new a7h1("confirm_delete_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC15.j = false;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC15.a(), r6h1.c, System.currentTimeMillis());
                    } else if (dv10Var instanceof ou10) {
                        x6h1 x6h1VarC16 = y6h1Var2.c();
                        x6h1VarC16.i.add(new a7h1("delete_confirmation_dialog", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC16.j = false;
                        x6h1 x6h1VarC17 = x6h1VarC16.a().c();
                        x6h1VarC17.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC17.j = false;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC17.a(), r6h1.c, System.currentTimeMillis());
                    } else if (dv10Var instanceof qv10) {
                        x6h1 x6h1VarC18 = y6h1Var2.c();
                        x6h1VarC18.i.add(new a7h1("error_chip", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC18.j = false;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC18.a(), r6h1.c, System.currentTimeMillis());
                    } else {
                        if (!(dv10Var instanceof vu10)) {
                            return null;
                        }
                        x6h1 x6h1VarC19 = y6h1Var2.c();
                        x6h1VarC19.i.add(new a7h1("error_bottom_sheet", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC19.j = false;
                        x6h1 x6h1VarC20 = x6h1VarC19.a().c();
                        x6h1VarC20.i.add(new a7h1("edit_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC20.j = false;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC20.a(), r6h1.c, System.currentTimeMillis());
                    }
                } else {
                    if (!(uv10Var instanceof tv10)) {
                        eg.o();
                        return null;
                    }
                    y6h1 y6h1Var3 = ((l2m0) m2m0Var).a;
                    if (dv10Var instanceof kv10) {
                        x6h1 x6h1VarC21 = y6h1Var3.c();
                        x6h1VarC21.i.add(new a7h1("create_note_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC21.j = false;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC21.a(), r6h1.c, System.currentTimeMillis());
                    } else if (dv10Var instanceof dv10) {
                        if (!dv10Var.a) {
                            return null;
                        }
                        x6h1 x6h1VarC22 = y6h1Var3.c();
                        x6h1VarC22.i.add(new a7h1("input_text_field", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC22.j = false;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC22.a(), r6h1.c, System.currentTimeMillis());
                    } else if (dv10Var instanceof uu10) {
                        x6h1 x6h1VarC23 = y6h1Var3.c();
                        x6h1VarC23.i.add(new a7h1("legal_disclaimer_link", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC23.j = false;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", ((uu10) dv10Var).a)), x6h1VarC23.a(), r6h1.c, System.currentTimeMillis());
                    } else if (dv10Var instanceof qv10) {
                        x6h1 x6h1VarC24 = y6h1Var3.c();
                        x6h1VarC24.i.add(new a7h1("error_chip", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC24.j = false;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC24.a(), r6h1.c, System.currentTimeMillis());
                    } else if (dv10Var instanceof vu10) {
                        x6h1 x6h1VarC25 = y6h1Var3.c();
                        x6h1VarC25.i.add(new a7h1("error_bottom_sheet", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC25.j = false;
                        x6h1 x6h1VarC26 = x6h1VarC25.a().c();
                        x6h1VarC26.i.add(new a7h1("edit_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC26.j = false;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC26.a(), r6h1.c, System.currentTimeMillis());
                    } else if (dv10Var instanceof wu10) {
                        y6h1 y6h1Var4 = y6h1.i;
                        x6h1 x6h1VarI = i3o1.i();
                        x6h1VarI.h = "music";
                        x6h1VarI.a = "mobile-taste-profile";
                        x6h1VarI.f = "3.1.0";
                        x6h1VarI.g = "22.0.0";
                        y6h1 y6h1VarA4 = x6h1VarI.a();
                        Collections.singletonList("tasteprofile");
                        x6h1 x6h1VarC27 = y6h1VarA4.c();
                        x6h1VarC27.i.add(new a7h1("taste_bottom_sheet", "first_note_message", (Integer) null, (String) null, (String) null));
                        x6h1VarC27.j = true;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC27.a(), r6h1.c, System.currentTimeMillis());
                    } else {
                        if (!(dv10Var instanceof av10)) {
                            return null;
                        }
                        y6h1 y6h1Var5 = y6h1.i;
                        x6h1 x6h1VarI2 = i3o1.i();
                        x6h1VarI2.h = "music";
                        x6h1VarI2.a = "mobile-taste-profile";
                        x6h1VarI2.f = "3.1.0";
                        x6h1VarI2.g = "22.0.0";
                        y6h1 y6h1VarA5 = x6h1VarI2.a();
                        Collections.singletonList("tasteprofile");
                        x6h1 x6h1VarC28 = y6h1VarA5.c();
                        x6h1VarC28.i.add(new a7h1("taste_bottom_sheet", "first_note_message", (Integer) null, (String) null, (String) null));
                        x6h1VarC28.j = true;
                        x6h1 x6h1VarC29 = x6h1VarC28.a().c();
                        x6h1VarC29.i.add(new a7h1("bottom_sheet_button", "acknowledge_first_note", (Integer) null, (String) null, (String) null));
                        x6h1VarC29.j = false;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC29.a(), r6h1.c, System.currentTimeMillis());
                    }
                }
                return w7h1Var2;
            case 10:
                a720 a720Var = (a720) obj2;
                z620 z620Var = (z620) obj4;
                y6h1 y6h1Var6 = ((q6l0) obj).a;
                if (z620Var instanceof v620) {
                    x6h1 x6h1VarC30 = y6h1Var6.c();
                    x6h1VarC30.i.add(new a7h1("apply_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC30.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC30.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (!(z620Var instanceof w620)) {
                        if (z620Var instanceof x620) {
                            qa20 qa20Var = ((x620) z620Var).a;
                            pa20 pa20Var = qa20Var.c;
                            char c8 = a720Var.a ? (char) 2 : (char) 1;
                            x6h1 x6h1VarC31 = y6h1Var6.c();
                            if (c8 == 1) {
                                str4 = "multi_select";
                            } else {
                                if (c8 != 2) {
                                    throw null;
                                }
                                str4 = "single_select";
                            }
                            x6h1VarC31.i.add(new a7h1("filters", (String) null, (Integer) null, (String) null, str4));
                            x6h1VarC31.j = false;
                            y6h1 y6h1VarA6 = x6h1VarC31.a();
                            if (pa20Var instanceof na20) {
                                c3 = 5;
                            } else if (!(pa20Var instanceof ma20)) {
                                if (pa20Var instanceof ka20) {
                                    c3 = 1;
                                } else if (pa20Var instanceof oa20) {
                                    c3 = 6;
                                } else {
                                    if (!(pa20Var instanceof la20)) {
                                        eg.o();
                                        return null;
                                    }
                                    c3 = 2;
                                }
                            }
                            x6h1 x6h1VarC32 = y6h1VarA6.c();
                            switch (c3) {
                                case 1:
                                    str5 = "downloaded";
                                    break;
                                case 2:
                                    str5 = "finished";
                                    break;
                                case 3:
                                    str5 = "in_progress";
                                    break;
                                case 4:
                                    str5 = "no_filter";
                                    break;
                                case 5:
                                    str5 = "unplayed";
                                    break;
                                case 6:
                                    str5 = "video";
                                    break;
                                default:
                                    throw null;
                            }
                            x6h1VarC32.i.add(new a7h1("filter_toggle", str5, (Integer) null, (String) null, (String) null));
                            x6h1VarC32.j = false;
                            y6h1 y6h1VarA7 = x6h1VarC32.a();
                            boolean z3 = qa20Var.b;
                            char c9 = z3 ? (char) 1 : (char) 2;
                            char c10 = z3 ? (char) 2 : (char) 1;
                            z7h1 z7h1Var4 = new z7h1("hit", 1, b7xVar);
                            String str9 = "off";
                            if (c9 == 1) {
                                obj7 = "off";
                            } else {
                                if (c9 != 2) {
                                    throw null;
                                }
                                obj7 = "on";
                            }
                            mmr0 mmr0Var3 = new mmr0("state_before_toggle", obj7);
                            if (c10 != 1) {
                                if (c10 != 2) {
                                    throw null;
                                }
                                str9 = "on";
                            }
                            w7h1Var3 = new w7h1("", "", z7h1Var4, new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{mmr0Var3, new mmr0("state_after_toggle", str9)})), y6h1VarA7, r6h1.c, System.currentTimeMillis());
                        } else {
                            if (!(z620Var instanceof y620)) {
                                eg.o();
                                return null;
                            }
                            y620 y620Var = (y620) z620Var;
                            uha1 uha1Var = y620Var.a;
                            sha1 sha1Var = uha1Var.b;
                            x6h1 x6h1VarC33 = y6h1Var6.c();
                            x6h1VarC33.i.add(new a7h1("sort_options", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC33.j = false;
                            y6h1 y6h1VarA8 = x6h1VarC33.a();
                            int iOrdinal = sha1Var.ordinal();
                            if (iOrdinal == 0) {
                                c = 4;
                            } else if (iOrdinal == 1) {
                                c = 1;
                            } else if (iOrdinal == 2) {
                                c = 3;
                            } else {
                                if (iOrdinal != 3) {
                                    eg.o();
                                    return null;
                                }
                                c = 2;
                            }
                            Integer numValueOf3 = Integer.valueOf(y620Var.b);
                            x6h1 x6h1VarC34 = y6h1VarA8.c();
                            if (c == 1) {
                                str = "added_date";
                            } else if (c == 2) {
                                str = "custom";
                            } else if (c == 3) {
                                str = "release_date";
                            } else {
                                if (c != 4) {
                                    throw null;
                                }
                                str = "show_name";
                            }
                            x6h1VarC34.i.add(new a7h1("sort_option_row", str, numValueOf3, (String) null, (String) null));
                            x6h1VarC34.j = false;
                            y6h1 y6h1VarA9 = x6h1VarC34.a();
                            qha1 qha1Var = uha1Var.d;
                            char c11 = (qha1Var != null ? qha1Var.a : 0) == 1 ? (char) 2 : (char) 1;
                            char c12 = (qha1Var != null ? qha1Var.a : 0) == 1 ? (char) 1 : (char) 2;
                            z7h1 z7h1Var5 = new z7h1("hit", 1, b7xVar);
                            if (c11 == 1) {
                                str2 = "ascending";
                            } else {
                                if (c11 != 2) {
                                    throw null;
                                }
                                str2 = "descending";
                            }
                            mmr0 mmr0Var4 = new mmr0("state_before_toggle", str2);
                            if (c12 == 1) {
                                str3 = "ascending";
                            } else {
                                if (c12 != 2) {
                                    throw null;
                                }
                                str3 = "descending";
                            }
                            w7h1Var3 = new w7h1("", "", z7h1Var5, new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{mmr0Var4, new mmr0("state_after_toggle", str3)})), y6h1VarA9, r6h1.c, System.currentTimeMillis());
                        }
                        return w7h1Var3;
                    }
                    x6h1 x6h1VarC35 = y6h1Var6.c();
                    x6h1VarC35.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC35.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC35.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var4;
            case 11:
                qd20 qd20Var = (qd20) obj3;
                od20 od20Var = (od20) obj4;
                y6h1 y6h1Var7 = ((iwl0) obj).a;
                if (od20Var instanceof gd20) {
                    aa80 aa80VarA = qd20Var.a(((gd20) od20Var).a);
                    if (aa80VarA == null) {
                        return null;
                    }
                    String str10 = ulc.j((xo20) aa80VarA.b).c;
                    Integer numValueOf4 = Integer.valueOf(aa80VarA.a);
                    x6h1 x6h1VarC36 = y6h1Var7.c();
                    x6h1VarC36.i.add(new a7h1("filter", str10, numValueOf4, (String) null, (String) null));
                    x6h1VarC36.j = false;
                    w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("filter", 1, b7xVar), x6h1VarC36.a(), r6h1.c, System.currentTimeMillis());
                } else if (od20Var instanceof hd20) {
                    x6h1 x6h1VarC37 = y6h1Var7.c();
                    x6h1VarC37.i.add(new a7h1("clear_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC37.j = false;
                    w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("clear_filter", 1, b7xVar), x6h1VarC37.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (!(od20Var instanceof id20)) {
                        eg.o();
                        return null;
                    }
                    aa80 aa80VarA2 = qd20Var.a(((id20) od20Var).a);
                    if (aa80VarA2 == null) {
                        return null;
                    }
                    String str11 = ulc.j((xo20) aa80VarA2.b).c;
                    Integer numValueOf5 = Integer.valueOf(aa80VarA2.a);
                    x6h1 x6h1VarC38 = y6h1Var7.c();
                    x6h1VarC38.i.add(new a7h1("filter", str11, numValueOf5, (String) null, (String) null));
                    x6h1VarC38.j = false;
                    w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("clear_filter", 1, b7xVar), x6h1VarC38.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var5;
            case 12:
                qwl0 qwl0Var = (n8h1) obj;
                pb30 pb30Var = (pb30) obj4;
                hq61 hq61Var = ((lq61) obj2).g;
                kq61 kq61Var = pb30Var.a;
                String str12 = pb30Var.b;
                if (!(hq61Var instanceof gq61)) {
                    if (hq61Var instanceof fq61) {
                        return (w7h1) ((fq61) hq61Var).b.invoke(qwl0Var, str12);
                    }
                    eg.o();
                    return null;
                }
                qwl0 qwl0Var2 = qwl0Var;
                y6h1 y6h1Var8 = qwl0Var2.a;
                r6h1 r6h1Var3 = qwl0Var2.b.b;
                if (kq61Var instanceof jq61) {
                    w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", str12)), y6h1Var8, r6h1Var3, System.currentTimeMillis());
                } else {
                    if (!(kq61Var instanceof iq61)) {
                        eg.o();
                        return null;
                    }
                    w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str12)), y6h1Var8, r6h1Var3, System.currentTimeMillis());
                }
                return w7h1Var6;
            case 13:
                ((Number) obj3).intValue();
                a140 a140Var = ((f140) obj).a;
                String str13 = a140Var.d;
                z040 z040Var = a140Var.c;
                if (!z040Var.equals(y040.a)) {
                    if (!(z040Var instanceof x040)) {
                        eg.o();
                        return null;
                    }
                    i = 1;
                }
                return new isl0(i, str13);
            case 14:
                v9l0 v9l0Var = (v9l0) obj;
                Integer num = ((tc50) obj4).a;
                if (num != null) {
                    int iIntValue = num.intValue();
                    if (iIntValue != 1) {
                        if (iIntValue == 2) {
                            c2 = 6;
                        } else if (iIntValue == 3) {
                            c2 = 5;
                        } else if (iIntValue == 4) {
                            c2 = 2;
                        } else if (iIntValue == 5) {
                            c2 = 1;
                        }
                    }
                    c3 = c2;
                }
                x6h1 x6h1VarC39 = v9l0Var.b.c();
                switch (c3) {
                    case 1:
                        str6 = "five_stars";
                        break;
                    case 2:
                        str6 = "four_stars";
                        break;
                    case 3:
                        str6 = "no_selection";
                        break;
                    case 4:
                        str6 = "one_star";
                        break;
                    case 5:
                        str6 = "three_stars";
                        break;
                    case 6:
                        str6 = "two_stars";
                        break;
                    default:
                        throw null;
                }
                x6h1VarC39.i.add(new a7h1("stars", str6, (Integer) null, (String) null, (String) null));
                x6h1VarC39.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC39.a(), v9l0Var.a, System.currentTimeMillis());
            case 15:
                return a(obj, obj2, obj3, obj4);
            case 16:
                return null;
            case 17:
                return d(obj, obj2, obj3, obj4);
            case 18:
                return e(obj, obj2, obj3, obj4);
            case 19:
                return f(obj, obj2, obj3, obj4);
            case 20:
                return g(obj, obj2, obj3, obj4);
            case 21:
                return h(obj, obj2, obj3, obj4);
            case 22:
                return i(obj, obj2, obj3, obj4);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return j(obj, obj2, obj3, obj4);
            case 24:
                return k(obj, obj2, obj3, obj4);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return m(obj, obj2, obj3, obj4);
            case 26:
                return n(obj, obj2, obj3, obj4);
            case 27:
                return o(obj, obj2, obj3, obj4);
            case 28:
                return p(obj, obj2, obj3, obj4);
            default:
                ((Number) obj3).intValue();
                return new utk0(new xok0((byte) 8), twb.j(((v3o0) obj).e));
        }
    }
}
