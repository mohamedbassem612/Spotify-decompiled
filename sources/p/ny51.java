package p;

import android.app.Activity;
import android.net.Uri;
import android.widget.TextView;
import androidx.compose.ui.geometry.Offset;
import com.spotify.collection.componentrecycler.ComponentRecyclerAdapter$DuplicateComponentProducerFound;
import com.spotify.encoreconsumermobile.elements.smartshufflebutton.SmartShuffleButtonView;
import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ny51 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ny51(Object obj, Object obj2, Object obj3, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        byte b2 = 2;
        byte b3 = 0;
        elb0 elb0Var = null;
        byte b4 = 1;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                cas casVar = (a7m0) obj;
                casVar.a = new my51((by51) obj3, (dx0) obj2, b4);
                casVar.d = oa41.d1;
                casVar.e = oa41.e1;
                casVar.b = (yce1) obj4;
                return rih1Var;
            case 1:
                return new fol0(new qgl0(new qgl0(Integer.valueOf(((vpu0) obj3).a), (String) obj2, ((i461) obj4).c), (short) 0));
            case 2:
                ove1 ove1Var = (ove1) obj4;
                jve1 jve1Var = (jve1) obj3;
                if (jfv.c(ove1Var.a(), jve1Var.b) < 0) {
                    long j = jve1Var.b;
                    AtomicReference atomicReference = ove1Var.b;
                    vfe1 vfe1Var = new vfe1((byte) 2, j);
                    while (true) {
                        Object obj5 = atomicReference.get();
                        Object objInvoke = vfe1Var.invoke(obj5);
                        do {
                            if (atomicReference.compareAndSet(obj5, objInvoke)) {
                            }
                        } while (atomicReference.get() == obj5);
                    }
                }
                fn31.T(ove1Var, (o8n) null, 0, new pz80((qz80) obj2, (lnm) null, (byte) 1), 3);
                return rih1Var;
            case 3:
                qqz0 qqz0Var = (qqz0) obj;
                vr61 vr61Var = (vr61) obj4;
                qqz0Var.a = vr61Var.a((mr61) obj3);
                jd11 jd11Var = rc11.a;
                qqz0.a(qqz0Var, jd11Var.b(a781.class), b781.a, new f38(vr61Var.d, (byte) 11));
                qqz0.a(qqz0Var, jd11Var.b(dgc0.class), dgc0.b, new f38(vr61Var.e, (byte) 12));
                qqz0.a(qqz0Var, jd11Var.b(fxg1.class), fxg1.c, new f38(vr61Var.f, (byte) 13));
                qqz0.a(qqz0Var, jd11Var.b(z360.class), z360.b, new f38(vr61Var.g, (byte) 14));
                qqz0.a(qqz0Var, jd11Var.b(u8c.class), u8c.b, new f38(vr61Var.h, (byte) 15));
                final tka0 tka0VarB = jd11Var.b(r9b0.class);
                a1i a1iVar = r9b0.c;
                v9b0 v9b0Var = vr61Var.i;
                qqz0Var.b(a1iVar, tka0VarB);
                LinkedHashMap linkedHashMap = qqz0Var.e;
                if (linkedHashMap.containsKey(tka0VarB)) {
                    throw new RuntimeException(tka0VarB) { // from class: com.spotify.collection.componentrecycler.ComponentRecyclerAdapter$DuplicateComponentViewWrapperFound
                        {
                            super("ComponentViewWrapper<AnyModel> instance for " + tka0VarB + " has already been supplied.");
                        }
                    };
                }
                linkedHashMap.put(tka0VarB, v9b0Var);
                final tka0 tka0VarB2 = jd11Var.b(xlu.class);
                a1i a1iVar2 = xlu.a;
                ylu yluVar = vr61Var.j;
                qqz0Var.b(a1iVar2, tka0VarB2);
                if (linkedHashMap.containsKey(tka0VarB2)) {
                    throw new RuntimeException(tka0VarB2) { // from class: com.spotify.collection.componentrecycler.ComponentRecyclerAdapter$DuplicateComponentViewWrapperFound
                        {
                            super("ComponentViewWrapper<AnyModel> instance for " + tka0VarB2 + " has already been supplied.");
                        }
                    };
                }
                linkedHashMap.put(tka0VarB2, yluVar);
                n881 n881Var = vr61Var.k;
                tka0 tka0VarB3 = jd11Var.b(c6t0.class);
                qqz0Var.b(new a1i(gsh.t, gsh.X), tka0VarB3);
                LinkedHashMap linkedHashMap2 = qqz0Var.c;
                if (linkedHashMap2.containsKey(tka0VarB3)) {
                    throw new ComponentRecyclerAdapter$DuplicateComponentProducerFound(tka0VarB3);
                }
                linkedHashMap2.put(tka0VarB3, n881Var);
                qqz0Var.f = new h5z((q961) obj2, (byte) 5);
                qqz0Var.g = new h5z(vr61Var, (byte) 6);
                return rih1Var;
            case 4:
                v071 v071Var = (w071) obj;
                iu30 iu30Var = (iu30) obj3;
                p1j0 p1j0Var = (p1j0) obj4;
                t1j0 t1j0Var = p1j0Var.k;
                String str = p1j0Var.e;
                if (v071Var.equals(p071.a)) {
                    if (t1j0Var instanceof s1j0) {
                        iu30Var.invoke(new o0j0(str));
                    }
                } else if (v071Var.equals(q071.a)) {
                    if ((t1j0Var instanceof s1j0) || (t1j0Var instanceof q1j0)) {
                        ((Function0) obj2).invoke();
                    }
                } else if (v071Var.equals(u071.a)) {
                    iu30Var.invoke(new s0j0(str));
                } else if (v071Var instanceof r071) {
                    iu30Var.invoke(new p0j0(str, ((r071) v071Var).a));
                } else if (v071Var instanceof v071) {
                    iu30Var.invoke(new t0j0(str, v071Var.a));
                } else if (v071Var instanceof t071) {
                    t071 t071Var = (t071) v071Var;
                    iu30Var.invoke(new r0j0(t071Var.a, t071Var.b));
                } else if (v071Var instanceof o071) {
                    iu30Var.invoke(new m0j0(str, ((o071) v071Var).a));
                } else {
                    if (!(v071Var instanceof s071)) {
                        eg.o();
                        return null;
                    }
                    iu30Var.invoke(new q0j0(str, ((s071) v071Var).a));
                }
                return rih1Var;
            case 5:
                ((qtr) obj).b(new woy((u7p0) obj4, (xh71) obj3, (mp8) obj2, (lnm) null));
                return rih1Var;
            case 6:
                qv00 qv00Var = (qv00) obj;
                Collection collection = (Collection) obj4;
                qv00Var.b(opa1.class, collection, false);
                qv00Var.b(bpf.class, (ArrayList) obj3, false);
                qv00Var.b(rz61.class, (Collection) obj2, false);
                qv00Var.b(hll.class, collection, false);
                ArrayList arrayList = new ArrayList();
                for (Object obj6 : collection) {
                    if (nzy.f((String) obj6)) {
                        arrayList.add(obj6);
                    }
                }
                qv00Var.b(hzy.class, arrayList, false);
                return rih1Var;
            case 7:
                nk20 nk20Var = (nk20) obj;
                nk20Var.a((ox1) obj4, new i2n0(vej0.class, (byte) 1));
                nk20Var.a((q3c) obj3, new i2n0(cbl1.class, (byte) 1));
                nk20Var.a((ccm1) obj2, new i2n0(dcm1.class, (byte) 1));
                return rih1Var;
            case 8:
                nk20 nk20Var2 = (nk20) obj;
                nk20Var2.a((fan0) obj4, new i2n0(gan0.class, (byte) 1));
                nk20Var2.a((b4x0) obj3, new i2n0(f5.class, (byte) 1));
                nk20Var2.a((xq81) obj2, new i2n0(yea1.class, (byte) 1));
                return rih1Var;
            case 9:
                List list = (List) obj4;
                ((rtb0) obj).e(list.size(), (iu30) null, new rw11(list, (byte) 11), new j2i(2039820996, new d311(b2, (ls71) obj3, (os71) obj2, list), true));
                return rih1Var;
            case 10:
                p5t0 p5t0Var = (p5t0) obj;
                elb0 elb0VarB = p5t0Var.b();
                if (elb0VarB != null) {
                    boolean zW = ((ifh0) obj4).W();
                    pv71 pv71Var = ((uv71) obj3).O0;
                    if (zW) {
                        pv71Var.f = elb0VarB;
                    } else {
                        pv71Var.e = elb0VarB;
                    }
                }
                p5t0Var.f((q5t0) obj2, 0, 0, 0.0f);
                return rih1Var;
            case 11:
                ((qtr) obj).b(new g381((iu30) obj4, (yqg) obj3, (ccc0) obj2, null));
                return rih1Var;
            case 12:
                ((y991) ((ke71) obj4).c).a((String) obj3, (d991) obj2, (tv80) obj);
                return rih1Var;
            case 13:
                SmartShuffleButtonView smartShuffleButtonView = (SmartShuffleButtonView) obj;
                smartShuffleButtonView.b(new ei91((lcc) obj4));
                if (((Boolean) ((ven0) ((tob1) obj2).getValue()).getValue()).booleanValue()) {
                    ((iu30) obj3).invoke(smartShuffleButtonView);
                }
                return rih1Var;
            case 14:
                w0o w0oVar = (w0o) obj4;
                r961 r961Var = (r961) w0oVar.d;
                wt91 wt91Var = (wt91) obj3;
                ((TextView) r961Var.d).setText(wt91Var.a);
                vt91 vt91Var = wt91Var.c;
                if (vt91Var != null) {
                    TextView textView = (TextView) r961Var.c;
                    textView.setVisibility(0);
                    textView.setText(vt91Var.a);
                    textView.setOnClickListener(new kw6(w0oVar, (o0i) obj2, vt91Var, (byte) 23));
                    textView.setContentDescription(vt91Var.c);
                }
                return rih1Var;
            case 15:
                rtb0 rtb0Var = (rtb0) obj;
                tw91 tw91Var = (tw91) obj3;
                rtb0.c(rtb0Var, "snooze_recommendation_header", new j2i(-183183252, new xw91((ers) obj4, tw91Var, b3), true), 2);
                rtb0.c(rtb0Var, "spacer", hjj.a, 2);
                rtb0.c(rtb0Var, "snooze_recommendation_button", new j2i(1395322932, new xw91((lrs) obj2, tw91Var, b4), true), 2);
                return rih1Var;
            case 16:
                oe41 oe41Var = (oe41) obj4;
                String str2 = (String) obj3;
                oe41Var.c(str2, new fda1(str2, (ven0) obj2));
                return new w9d0(oe41Var, str2, (byte) 18);
            case 17:
                pxg1 pxg1Var = (pxg1) obj2;
                xa5 xa5Var = (xa5) obj;
                int i = ((Boolean) ((iu30) obj4).invoke((sda1) obj3)).booleanValue() ? 4 : 5;
                return new p9m(xa5Var.g(i, pxg1Var), xa5Var.c(i, pxg1Var), 0.0f, (c391) null, 4);
            case 18:
                yxa1 yxa1Var = (yxa1) obj4;
                bpb1 bpb1Var = yxa1Var.o.a;
                Boolean bool = Boolean.TRUE;
                bpb1Var.getClass();
                bpb1Var.m((Object) null, bool);
                return new sg(yxa1Var, (w9u0) obj3, (ven0) obj2, (byte) 19);
            case 19:
                it0 it0Var = new it0((byte) 10, (uoa) obj3, (ven0) obj2);
                iac0 iac0Var = (iac0) obj4;
                iac0Var.getLifecycle().a(it0Var);
                return new w9d0(iac0Var, it0Var, (byte) 19);
            case 20:
                List list2 = (List) obj;
                q1m q1mVar = (q1m) obj4;
                try {
                    q1mVar.b(1);
                    ((em61) obj3).u(s7c0.d(mqn1.H(list2), (iph0) obj2));
                    break;
                } catch (IllegalStateException e) {
                    q1mVar.b(2);
                    n57.t("Failed to set item list of search results", e);
                }
                return rih1Var;
            case 21:
                elb0 elb0Var2 = (elb0) obj;
                g2z g2zVar = (g2z) obj4;
                if (!((Boolean) ((tob1) obj2).getValue()).booleanValue()) {
                    ((err0) g2zVar.c).t((int) (elb0Var2.b() & 4294967295L));
                    elb0 elb0Var3 = (elb0) g2zVar.f;
                    if (elb0Var3 != null) {
                        if (elb0Var3.a() && elb0Var2.a()) {
                            elb0Var = elb0Var3;
                        }
                        if (elb0Var != null) {
                            long jK = elb0Var.K(elb0Var2, 0L);
                            ((hrr0) g2zVar.e).setValue(new Offset((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jK >> 32)) + ((int) (elb0Var2.b() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jK & 4294967295L)))) & 4294967295L)));
                        }
                    }
                    ((iu30) obj3).invoke(new l160(((err0) g2zVar.c).s(), ((err0) g2zVar.d).s()));
                }
                return rih1Var;
            case 22:
                ((meb1) obj4).a.a(new yj90(((hwq) obj3).a, ((l7e0) obj2).a, new rj90(7, false), (tv80) obj));
                return rih1Var;
            case 23:
                Activity activity = (Activity) obj;
                bkb1 bkb1Var = (bkb1) obj3;
                yg8 yg8Var = ((th61) obj4).f;
                boolean z = yg8Var == yg8.X || yg8Var == yg8.Y;
                bkb1Var.b.a(new mhv0(bkb1Var.X0, "account_switching_close_button", ew80.c, (String) null));
                i8h1 i8h1Var = bkb1Var.d;
                r6h1 r6h1Var = r6h1.c;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-start-screen";
                x6h1VarI.f = "0.1.0";
                x6h1VarI.g = "22.0.0";
                x6h1 x6h1VarR = kk0.r(x6h1VarI, "start");
                x6h1VarR.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarR.j = false;
                y6h1 y6h1VarA = x6h1VarR.a();
                b7x b7xVar = b7x.a;
                i8h1Var.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1Var, System.currentTimeMillis()));
                if (!z) {
                    return u2f0.a(bkb1Var.O0, activity, activity.getIntent(), false, (Uri) null, 0, 1, 56);
                }
                dv dvVar = bkb1Var.Y;
                String str3 = (String) obj2;
                if (str3 == null) {
                    str3 = "";
                }
                return dv.b(dvVar, activity, str3);
            case 24:
                List list3 = ((xwb1) obj4).a;
                ((rtb0) obj).e(list3.size(), new rw11(list3, (byte) 16), new rw11(list3, (byte) 17), new j2i(802480018, new mqf0(list3, (tyq) obj3, (iu30) obj2), true));
                return rih1Var;
            case 25:
                qdf0 qdf0Var = (qdf0) obj4;
                qdf0Var.e((jdf0) obj3);
                qdf0Var.d((jdf0) obj2);
                return rih1Var;
            case 26:
                abc0 abc0Var = (abc0) obj;
                wbc1 wbc1Var = (wbc1) obj4;
                abc0Var.c = new ku91(wbc1Var, (o0i) obj3, (ubc1) obj2, (lnm) null, (byte) 7);
                abc0Var.a = new vbc1(wbc1Var, null, b3);
                return rih1Var;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                jwb jwbVar = (lwb) obj;
                ryf ryfVar = (ryf) obj2;
                lzn0 lzn0Var = (lzn0) obj3;
                Activity activity2 = (Activity) obj4;
                if (!jwbVar.equals(iwb.a)) {
                    boolean z2 = jwbVar instanceof jwb;
                    oxf oxfVar = oxf.b;
                    if (z2) {
                        String str4 = jwbVar.a.g;
                        if (activity2 != null && str4.length() != 0) {
                            huj.b(lzn0Var, activity2, ryfVar, oxfVar, str4, (tv80) null);
                        }
                    } else {
                        if (!(jwbVar instanceof kwb)) {
                            eg.o();
                            return null;
                        }
                        String str5 = ((kwb) jwbVar).a.X;
                        if (activity2 != null && str5.length() != 0) {
                            huj.b(lzn0Var, activity2, ryfVar, oxfVar, str5, (tv80) null);
                        }
                    }
                }
                return rih1Var;
            case 28:
                rtb0 rtb0Var2 = (rtb0) obj;
                iu30 iu30Var2 = (iu30) obj3;
                rtb0.f(rtb0Var2, "header", new j2i(1587880786, new t7i(iu30Var2, (byte) 13), true), 2);
                bsc1 bsc1Var = (bsc1) obj4;
                List list4 = bsc1Var.b;
                rtb0Var2.e(list4.size(), new rw11(list4, (byte) 18), new rw11(list4, (byte) 19), new j2i(802480018, new oi1(list4, (rwj) obj2, bsc1Var, iu30Var2, (byte) 14), true));
                rtb0.c(rtb0Var2, "off", new j2i(-1173731002, new xw91(bsc1Var, iu30Var2, (byte) 8), true), 2);
                return rih1Var;
            default:
                return d9y0.k(eqr0.B(ern1.x((qim0) obj, new ry71((ven0) obj4, (byte) 12)), new lws0((tob1) obj3, (byte) 20)), ((Number) ((tob1) obj2).getValue()).floatValue());
        }
    }
}
