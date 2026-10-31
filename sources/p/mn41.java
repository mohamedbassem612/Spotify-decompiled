package p;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.google.protobuf.Empty;
import com.spotify.esperanto.esperantoimpl.SchedulingTransport;
import com.spotify.mobius.MobiusLoop;
import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mn41 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mn41(i461 i461Var, vpu0 vpu0Var) {
        super(1);
        this.a = (byte) 25;
        this.b = vpu0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj) {
        List listL1;
        byte b = 4;
        int i = 0;
        byte b2 = 1;
        switch (this.a) {
            case 0:
                qn41 qn41Var = (qn41) this.b;
                fn31.T(qn41Var.b, (o8n) null, 0, new p2z0(qn41Var, obj, (lnm) null, (byte) 29), 3);
                return rih1.a;
            case 1:
                Object obj2 = new Object();
                vn41 vn41Var = (vn41) this.b;
                synchronized (vn41Var.b) {
                    vn41Var.c = obj2;
                    listL1 = o7h.l1(vn41Var.d);
                }
                vn41 vn41Var2 = (vn41) this.b;
                Iterator it = listL1.iterator();
                while (it.hasNext()) {
                    vn41Var2.a.c(new sl21(vn41Var2, (un41) it.next(), obj2, (byte) 4));
                }
                return rih1.a;
            case 2:
                ei51 ei51Var = (ei51) obj;
                ei51 ei51Var2 = (ei51) this.b;
                return Boolean.valueOf(ei51Var.a == ei51Var2.a && u890.j(ei51Var.b, ei51Var2.b) && !(ei51Var.c.equals(ei51Var2.c) && ei51Var.d == ei51Var2.d));
            case 3:
                return Integer.valueOf((int) (((double) ((Number) obj).floatValue()) * ((ru41) this.b).a.b));
            case 4:
                return Boolean.valueOf(((hc51) this.b).c(((xb51) obj).a));
            case 5:
                qtr qtrVar = (qtr) obj;
                z72 z72Var = (z72) this.b;
                qtrVar.b(new k8y0(z72Var, (lnm) null, (byte) 12));
                qtrVar.d = new wp41(z72Var, (lnm) null, (byte) 1);
                qtrVar.c = true;
                return rih1.a;
            case 6:
                return new tu41((wen0) ((wdm) this.b).Z, (byte) 1);
            case 7:
                ji50 ji50Var = (ji50) obj;
                s880 s880Var = (s880) this.b;
                d9b0 d9b0Var = (d9b0) s880Var.c;
                y8b0 y8b0Var = new y8b0(d9b0Var, null == true ? 1 : 0);
                w7x w7xVar = w7x.a;
                u8b0 u8b0Var = u8b0.Q0;
                q8b0 q8b0Var = q8b0.W0;
                LinkedHashMap linkedHashMap = ji50Var.b;
                linkedHashMap.put(dm01.class, r4o1.Q(u8b0Var, w7xVar, y8b0Var, q8b0Var));
                linkedHashMap.put(zl01.class, r4o1.Q(u8b0.S0, w7xVar, new y8b0(d9b0Var, b2), q8b0.X0));
                esw eswVar = d9b0Var.a;
                iu30 iu30Var = d9b0Var.b;
                d0r d0rVar = ji50Var.a;
                jop jopVar = eswVar.c;
                wm01 wm01VarA = jopVar.a(d0rVar, iu30Var);
                nim0 nim0Var = nim0.a;
                byte b3 = 2;
                ku70 ku70VarH = cgj1.H(wm01VarA, u291.f(nim0Var, 1.0f), new FrameLayout.LayoutParams(-1, -2), 2);
                b9b0 b9b0Var = b9b0.a;
                c9b0 c9b0Var = c9b0.a;
                linkedHashMap.put(iu6.class, new r3r(new xzq(new ku70(ku70VarH), new z8b0(d9b0Var, (byte) 3)), a9b0.c, 4));
                linkedHashMap.put(ae3.class, new r3r(new xzq(new ku70(cgj1.H(jopVar.a(d0rVar, iu30Var), u291.f(nim0Var, 1.0f), new FrameLayout.LayoutParams(-1, -2), 2)), new z8b0(d9b0Var, (byte) 6)), a9b0.d, 4));
                linkedHashMap.put(yo8.class, new r3r(new xzq(new ku70(cgj1.H(jopVar.a(d0rVar, iu30Var), u291.f(nim0Var, 1.0f), new FrameLayout.LayoutParams(-1, -2), 2)), new z8b0(d9b0Var, (byte) 7)), a9b0.e, 4));
                linkedHashMap.put(kvf1.class, new r3r(new xzq(new ku70(cgj1.H(jopVar.a(d0rVar, iu30Var), u291.f(nim0Var, 1.0f), new FrameLayout.LayoutParams(-1, -2), 2)), new z8b0(d9b0Var, (byte) 8)), a9b0.f, 4));
                linkedHashMap.put(xqu0.class, new r3r(new xzq(new ku70(cgj1.H(jopVar.a(d0rVar, iu30Var), u291.f(nim0Var, 1.0f), new FrameLayout.LayoutParams(-1, -2), 2)), new z8b0(d9b0Var, (byte) 9)), q8b0.Y0, 4));
                linkedHashMap.put(w5v0.class, new r3r(new xzq(new ku70(cgj1.H(jopVar.a(d0rVar, iu30Var), u291.f(nim0Var, 1.0f), new FrameLayout.LayoutParams(-1, -2), 2)), new z5z((Object) d9b0Var, (byte) 28)), q8b0.Z0, 4));
                linkedHashMap.put(yi40.class, new r3r(new xzq(new ku70(cgj1.H(jopVar.a(d0rVar, iu30Var), u291.f(nim0Var, 1.0f), new FrameLayout.LayoutParams(-1, -2), 2)), new z5z((Object) d9b0Var, (byte) 29)), q8b0.a1, 4));
                linkedHashMap.put(s8z.class, new r3r(new xzq(new ku70(cgj1.H(jopVar.a(d0rVar, iu30Var), u291.f(nim0Var, 1.0f), new FrameLayout.LayoutParams(-1, -2), 2)), new z8b0(d9b0Var, (byte) 0)), q8b0.b1, 4));
                linkedHashMap.put(q2v0.class, new r3r(new xzq(new ku70(cgj1.H(jopVar.a(d0rVar, iu30Var), u291.f(nim0Var, 1.0f), new FrameLayout.LayoutParams(-1, -2), 2)), new z8b0(d9b0Var, (byte) 1)), q8b0.c1, 4));
                linkedHashMap.put(hdx0.class, new r3r(new xzq(new ku70(cgj1.H(jopVar.a(d0rVar, iu30Var), u291.f(nim0Var, 1.0f), new FrameLayout.LayoutParams(-1, -2), 2)), new z8b0(d9b0Var, (byte) 2)), q8b0.d1, 4));
                linkedHashMap.put(syi1.class, new r3r(new xzq(new ku70(cgj1.H(jopVar.a(d0rVar, iu30Var), u291.f(nim0Var, 1.0f), new FrameLayout.LayoutParams(-1, -2), 2)), new z8b0(d9b0Var, (byte) 4)), q8b0.e1, 4));
                linkedHashMap.put(iqk.class, new r3r(new xzq(new ku70(cgj1.H(jopVar.a(d0rVar, iu30Var), u291.f(nim0Var, 1.0f), new FrameLayout.LayoutParams(-1, -2), 2)), new z8b0(d9b0Var, (byte) 5)), a9b0.b, 4));
                p8b0 p8b0Var = (p8b0) s880Var.d;
                linkedHashMap.put(iwi0.class, r4o1.Q(t5b0.R0, w7xVar, new o8b0(p8b0Var, (byte) 0), ul90.b1));
                linkedHashMap.put(v211.class, r4o1.Q(t5b0.T0, w7xVar, new o8b0(p8b0Var, (byte) 1), ul90.c1));
                p8b0 p8b0Var2 = (p8b0) s880Var.g;
                linkedHashMap.put(xlf1.class, r4o1.P(h9b0.f, w7xVar, new g9b0(p8b0Var2, (byte) 5), a9b0.t));
                linkedHashMap.put(xl6.class, r4o1.P(h9b0.h, w7xVar, new g9b0(p8b0Var2, (byte) 8), a9b0.X));
                linkedHashMap.put(d73.class, r4o1.P(h9b0.t, w7xVar, new g9b0(p8b0Var2, (byte) 9), a9b0.Y));
                linkedHashMap.put(lhu0.class, r4o1.P(h9b0.Y, w7xVar, new g9b0(p8b0Var2, (byte) 10), a9b0.Z));
                byte b4 = 11;
                linkedHashMap.put(k381.class, r4o1.P(u8b0.U0, w7xVar, new g9b0(p8b0Var2, b4), a9b0.N0));
                linkedHashMap.put(u2z.class, r4o1.P(u8b0.W0, w7xVar, new g9b0(p8b0Var2, (byte) 0), a9b0.O0));
                linkedHashMap.put(e88.class, r4o1.P(u8b0.Y0, w7xVar, new g9b0(p8b0Var2, (byte) 1), a9b0.P0));
                linkedHashMap.put(un8.class, r4o1.P(u8b0.a1, w7xVar, new g9b0(p8b0Var2, b3), a9b0.Q0));
                linkedHashMap.put(u0x0.class, r4o1.P(u8b0.c1, w7xVar, new g9b0(p8b0Var2, (byte) 3), a9b0.R0));
                linkedHashMap.put(ui40.class, r4o1.P(u8b0.e1, w7xVar, new g9b0(p8b0Var2, b), a9b0.g));
                linkedHashMap.put(hfk.class, r4o1.P(h9b0.c, w7xVar, new g9b0(p8b0Var2, (byte) 6), a9b0.h));
                linkedHashMap.put(wvi1.class, r4o1.P(h9b0.e, w7xVar, new g9b0(p8b0Var2, (byte) 7), a9b0.i));
                w8b0 w8b0Var = (w8b0) s880Var.h;
                linkedHashMap.put(a431.class, r4o1.P(j9b0.e, w7xVar, new i9b0(w8b0Var, (byte) 5), a9b0.Y0));
                linkedHashMap.put(h0e.class, r4o1.P(j9b0.g, w7xVar, new i9b0(w8b0Var, b4), a9b0.Z0));
                linkedHashMap.put(tfj1.class, new r3r(new xzq(w8b0Var.a.H.d(w8b0Var.b), j9b0.h), a9b0.S0, 4));
                linkedHashMap.put(pao.class, r4o1.P(j9b0.t, w7xVar, new i9b0(w8b0Var, (byte) 12), a9b0.a1));
                linkedHashMap.put(gbo.class, r4o1.P(j9b0.Y, w7xVar, new i9b0(w8b0Var, (byte) 13), a9b0.b1));
                linkedHashMap.put(o8o.class, r4o1.P(h9b0.P0, w7xVar, new i9b0(w8b0Var, (byte) 0), a9b0.c1));
                linkedHashMap.put(fco.class, r4o1.P(h9b0.R0, w7xVar, new i9b0(w8b0Var, (byte) 1), a9b0.d1));
                linkedHashMap.put(xo80.class, r4o1.P(h9b0.T0, w7xVar, new i9b0(w8b0Var, b3), a9b0.e1));
                linkedHashMap.put(vo80.class, r4o1.P(h9b0.V0, w7xVar, new i9b0(w8b0Var, (byte) 3), k9b0.b));
                linkedHashMap.put(um11.class, r4o1.P(h9b0.X0, w7xVar, new i9b0(w8b0Var, b), k9b0.c));
                linkedHashMap.put(h2n.class, r4o1.P(h9b0.Z0, w7xVar, new i9b0(w8b0Var, (byte) 6), a9b0.T0));
                linkedHashMap.put(j2n.class, r4o1.P(h9b0.b1, w7xVar, new i9b0(w8b0Var, (byte) 7), a9b0.U0));
                linkedHashMap.put(l2g1.class, r4o1.P(h9b0.d1, w7xVar, new i9b0(w8b0Var, (byte) 8), a9b0.V0));
                linkedHashMap.put(ud60.class, r4o1.P(j9b0.b, w7xVar, new i9b0(w8b0Var, (byte) 9), a9b0.W0));
                linkedHashMap.put(w2v0.class, r4o1.P(j9b0.d, w7xVar, new i9b0(w8b0Var, (byte) 10), a9b0.X0));
                if (((di4) s880Var.b).B()) {
                    o860 o860Var = (o860) s880Var.e;
                    linkedHashMap.put(l39.class, r4o1.P(t5b0.W0, w7xVar, new gs90(o860Var, (byte) 19), q8b0.X));
                    linkedHashMap.put(to6.class, new r3r(o860Var.k(d0rVar), q8b0.d, (vu30) null));
                    linkedHashMap.put(k93.class, new r3r(o860Var.k(d0rVar), q8b0.e, (vu30) null));
                    linkedHashMap.put(eo8.class, new r3r(o860Var.k(d0rVar), q8b0.f, (vu30) null));
                    linkedHashMap.put(enf1.class, new r3r(o860Var.k(d0rVar), q8b0.g, (vu30) null));
                    linkedHashMap.put(zlu0.class, new r3r(o860Var.k(d0rVar), q8b0.h, (vu30) null));
                    linkedHashMap.put(v5v0.class, new r3r(o860Var.k(d0rVar), q8b0.i, (vu30) null));
                    linkedHashMap.put(u3z.class, new r3r(o860Var.k(d0rVar), q8b0.t, (vu30) null));
                    linkedHashMap.put(f7x0.class, new r3r(o860Var.k(d0rVar), ul90.d1, (vu30) null));
                    linkedHashMap.put(mxi1.class, new r3r(o860Var.k(d0rVar), ul90.e1, (vu30) null));
                    linkedHashMap.put(p2v0.class, new r3r(o860Var.k(d0rVar), q8b0.b, (vu30) null));
                    linkedHashMap.put(vi40.class, new r3r(o860Var.k(d0rVar), q8b0.c, (vu30) null));
                }
                w8b0 w8b0Var2 = (w8b0) s880Var.f;
                linkedHashMap.put(fnf1.class, r4o1.P(u8b0.i, w7xVar, new t8b0(w8b0Var2, b), q8b0.T0));
                linkedHashMap.put(uo6.class, r4o1.P(u8b0.Z, w7xVar, new t8b0(w8b0Var2, (byte) 9), q8b0.U0));
                linkedHashMap.put(l93.class, r4o1.P(u8b0.O0, w7xVar, new t8b0(w8b0Var2, (byte) 10), q8b0.V0));
                linkedHashMap.put(amu0.class, r4o1.P(t5b0.Z0, w7xVar, new t8b0(w8b0Var2, (byte) 0), q8b0.Y));
                linkedHashMap.put(a581.class, r4o1.P(t5b0.b1, w7xVar, new t8b0(w8b0Var2, (byte) 1), q8b0.Z));
                linkedHashMap.put(v3z.class, r4o1.P(t5b0.d1, w7xVar, new t8b0(w8b0Var2, b3), q8b0.N0));
                linkedHashMap.put(i98.class, r4o1.P(u8b0.b, w7xVar, new t8b0(w8b0Var2, (byte) 3), q8b0.O0));
                linkedHashMap.put(fo8.class, r4o1.P(u8b0.d, w7xVar, new t8b0(w8b0Var2, (byte) 5), q8b0.P0));
                linkedHashMap.put(g7x0.class, r4o1.P(u8b0.f, w7xVar, new t8b0(w8b0Var2, (byte) 6), q8b0.Q0));
                linkedHashMap.put(g39.class, r4o1.P(u8b0.h, w7xVar, new t8b0(w8b0Var2, (byte) 7), q8b0.R0));
                linkedHashMap.put(wi40.class, r4o1.P(u8b0.X, w7xVar, new t8b0(w8b0Var2, (byte) 8), q8b0.S0));
                d9b0 d9b0Var2 = (d9b0) s880Var.a;
                linkedHashMap.put(jh60.class, r4o1.P(j9b0.Q0, w7xVar, new l9b0(d9b0Var2, (byte) 1), k9b0.d));
                linkedHashMap.put(w6k1.class, r4o1.P(j9b0.S0, w7xVar, new l9b0(d9b0Var2, b3), k9b0.e));
                linkedHashMap.put(qvp0.class, r4o1.P(j9b0.U0, w7xVar, new l9b0(d9b0Var2, (byte) 3), k9b0.f));
                linkedHashMap.put(gpi1.class, r4o1.P(j9b0.W0, w7xVar, new l9b0(d9b0Var2, b), k9b0.g));
                linkedHashMap.put(owi0.class, r4o1.P(j9b0.N0, w7xVar, new l9b0(d9b0Var2, (byte) 5), k9b0.h));
                linkedHashMap.put(ona0.class, r4o1.P(j9b0.P0, w7xVar, new l9b0(d9b0Var2, (byte) 0), k9b0.i));
                return rih1.a;
            case 8:
                return new twm0((Context) obj, ((osm0) this.b).j);
            case 9:
                MobiusLoop mobiusLoop = ((db51) this.b).V0;
                if (mobiusLoop != null) {
                    mobiusLoop.dispose();
                    return rih1.a;
                }
                u890.C("mobiusLoop");
                throw null;
            case 10:
                oe51 oe51Var = (oe51) obj;
                ve51 ve51Var = (ve51) this.b;
                return new mpy0(d3p1.F(ve51Var.b, ve51Var.d, oe51Var), oe51Var, ve51Var, (byte) 10);
            case 11:
                int iIntValue = ((Number) obj).intValue();
                b8p1 b8p1Var = (b8p1) this.b;
                ((iu30) b8p1Var.e).invoke(Integer.valueOf(iIntValue + b8p1Var.b));
                return rih1.a;
            case 12:
                return new m441(new oj51((hj51) obj, (yxb0) this.b, (lnm) null));
            case 13:
                String strY = ((ok51) this.b).y();
                Set set = pcf.a;
                return new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:chat-message:".concat(strY))), ((g3l0) obj).a, r6h1.c, System.currentTimeMillis());
            case 14:
                rwq0.z((qtr) obj, new z821((am51) this.b, (byte) 18));
                return rih1.a;
            case 15:
                rwq0.z((qtr) obj, new z821((qm51) this.b, (byte) 19));
                return rih1.a;
            case 16:
                Resources resources = ((j0a) this.b).b.getResources();
                return new nhb1(resources.getString(2131961598), resources.getString(2131961597), resources.getString(2131961596), resources.getString(2131961595), false, (izh1) null, 96);
            case 17:
                return new vm61(2131953417, 2131953416, 2131953415, new ap51((c8u0) this.b, (lnm) null), new um61(new sl11(3, (byte) 7), new n601(th51.T0, (byte) 28), fft0.Z0));
            case 18:
                pcf.a(((cp51) this.b).b, pro1.t("chatFeatureSeenReceipts"), (tv80) obj, (Bundle) null);
                return rih1.a;
            case 19:
                ((qtr) obj).b(new psm((yp51) this.b, (lnm) null, (byte) 4));
                return rih1.a;
            case 20:
                ((gr51) this.b).S0 = Long.valueOf(((Number) obj).longValue());
                return rih1.a;
            case 21:
                ((qtr) obj).b(new eri0((tt51) this.b, (lnm) null, (byte) 13));
                return rih1.a;
            case 22:
                ((qtr) obj).b(new psm((ngs0) this.b, (lnm) null, (byte) 5));
                return rih1.a;
            case 23:
                return ((lz51) this.b).e;
            case 24:
                ((qv00) obj).a(((tz51) this.b).c, xkk1.class, false);
                return rih1.a;
            case 25:
                return new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", i461.j((vpu0) this.b))), ((fol0) obj).a, r6h1.c, System.currentTimeMillis());
            case 26:
                ((Number) obj).intValue();
                return ((etk0) this.b).b();
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                ArrayList arrayList = ((p861) this.b).a;
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                for (Object obj3 : arrayList) {
                    int i2 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    String str = (String) obj3;
                    arrayList2.add(new h8k1(new r861(str, i), str));
                    i = i2;
                }
                return new huz(new hj50(arrayList2, (ioj0) null), (byte) 10);
            case 28:
                ji50 ji50Var2 = (ji50) obj;
                xcq xcqVar = (xcq) ((smp0) this.b).d;
                d0r d0rVar2 = ji50Var2.a;
                r7q r7qVar = xcqVar.a;
                ji50Var2.b.put(r861.class, new r3r(new xzq(new qe31((byte) 1, d0rVar2, (gw70) r7qVar.b.d8.get(), (lzn0) r7qVar.d.i.get()), p761.e1), qr51.O0, 4));
                return rih1.a;
            default:
                SchedulingTransport schedulingTransport = ((nx9) obj).k().h;
                if (schedulingTransport != null) {
                    return new y48(schedulingTransport).callStream("spotify.time.esperanto.proto.ServerTimeProvider", "serverTime", Empty.n()).map(kuw0.e).map(new zgz0((t8r0) this.b, (byte) 23));
                }
                u890.C("serverTimeTransport");
                throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mn41(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }
}
