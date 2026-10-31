package p;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nt01 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nt01(Object obj, Object obj2, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke(Object obj) {
        ou80 ou80Var;
        byte b = this.a;
        boolean z = false;
        String str = null;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                ((qzh) obj2).f((eq01) obj3);
                return rih1Var;
            case 1:
                c380 c380Var = (c380) obj2;
                fv01 fv01Var = (fv01) obj3;
                ((rtb0) obj).e(c380Var.size(), new svb0(new fk01(fv01Var, (byte) 1), c380Var, (byte) 5), new iio0(c380Var, (byte) 28), new j2i(2039820996, new ot(c380Var, fv01Var, (byte) 17), true));
                return rih1Var;
            case 2:
                ((y2s) obj).b(q601.b((bpb1) obj2), new ak01((rt01) obj3, (byte) 5));
                return rih1Var;
            case 3:
                c311 c311Var = (c311) obj2;
                c380 c380Var2 = c311Var.b;
                ((pub0) obj).P(c380Var2.size(), (iu30) null, new iio0(c380Var2, (byte) 29), (gv20) null, new j2i(-1466459515, new d311((byte) 0, (ufd) obj3, c311Var, c380Var2), true));
                return rih1Var;
            case 4:
                String str2 = (String) obj;
                Context context = ((d511) obj2).a.a;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                    break;
                } catch (Exception unused) {
                }
                ((iu30) obj3).invoke(new z411(str2));
                return rih1Var;
            case 5:
                ((iae) obj2).a.a((String) obj3, (tv80) obj, (Bundle) null);
                return rih1Var;
            case 6:
                sc11 sc11Var = (sc11) obj2;
                ven0 ven0Var = (ven0) obj3;
                ven0Var.setValue(((Boolean) obj).booleanValue() ? dm61.x0(sc11Var, (Set) ven0Var.getValue()) : dm61.u0(sc11Var, (Set) ven0Var.getValue()));
                return rih1Var;
            case 7:
                ((Boolean) obj).getClass();
                iu30 iu30Var = (iu30) obj3;
                xr11 xr11Var = (xr11) obj2;
                if (xr11Var instanceof ur11) {
                    iu30Var.invoke(ir11.a);
                } else if (xr11Var instanceof vr11) {
                    iu30Var.invoke(new jr11(((vr11) xr11Var).a));
                } else if (xr11Var instanceof wr11) {
                    iu30Var.invoke(new jr11(((wr11) xr11Var).a));
                } else {
                    boolean z2 = xr11Var instanceof sr11;
                    hr11 hr11Var = hr11.a;
                    if (z2 || (xr11Var instanceof tr11)) {
                        iu30Var.invoke(hr11Var);
                    }
                }
                return rih1Var;
            case 8:
                return l6o1.A(new jpg0(((azo) ((zl5) obj2).l).a((kko) obj3, true), br11.t));
            case 9:
                uv11 uv11Var = (uv11) obj3;
                return (t6g1) ((xu30) obj2).invoke(uv11Var.a, uv11Var.b, (ioj0) obj);
            case 10:
                return l6o1.A(new jpg0(((nt11) obj2).c.a(((xk00) obj3).a, true), ss11.U0));
            case 11:
                c380 c380Var3 = (c380) obj2;
                ((rtb0) obj).e(c380Var3.size(), new rw11(c380Var3, (byte) 0), new rw11(c380Var3, (byte) 1), new j2i(802480018, new ot(c380Var3, (rwj) obj3, (byte) 18), true));
                return rih1Var;
            case 12:
                d221 d221Var = (f221) ((k221) obj3).c.get(((Number) obj).intValue());
                ((hyy0) obj2).getClass();
                if (d221Var instanceof d221) {
                    return d221Var.a.c.c;
                }
                if (u890.j(d221Var, e221.a)) {
                    return "warning_message";
                }
                eg.o();
                return null;
            case 13:
                String str3 = (String) obj2;
                Bundle bundleH = mno1.h(new mmr0[]{new mmr0("entity-uri", str3)});
                dwn0 dwn0Var = new dwn0(nik1.p5.a, str3, false, false, 0, 0, false, (a690) null, (Bundle) null, new bwn0((tv80) obj));
                k811 k811Var = (k811) obj3;
                lzn0 lzn0Var = (lzn0) k811Var.b;
                if (lzn0Var.j((dg30) k811Var.c)) {
                    lzn0Var.i(dwn0Var, bundleH);
                } else {
                    a1r0.e((a1r0) k811Var.d, dwn0Var, bundleH, 4);
                }
                return rih1Var;
            case 14:
                e261 e261Var = (e261) obj;
                if (((px31) obj2) instanceof lx31) {
                    b261.A(e261Var, (String) obj3);
                    b261.a(e261Var);
                }
                return rih1Var;
            case 15:
                k811 k811Var2 = (k811) obj2;
                fn31.T(cto1.q((dg30) k811Var2.b), (o8n) null, 0, new m311(k811Var2, (String) obj3, (lnm) null, (byte) 6), 3);
                return rih1Var;
            case 16:
                ((agc0) ((k811) obj3).d).getClass();
                return ((v1l0) obj).e((String) obj2, "spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ");
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                vi11 vi11Var = (vi11) obj2;
                fn31.T(cto1.q((dg30) vi11Var.b), (q8n) vi11Var.e, 0, new elu0(vi11Var, (String) obj3, (tv80) obj, null, (byte) 18), 2);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                String str4 = (String) obj;
                k811 k811Var3 = (k811) obj2;
                i8h1 i8h1Var = (i8h1) ((idd1) k811Var3.c).getValue();
                x6h1 x6h1VarC = ((h7l0) k811Var3.d).b.c();
                x6h1VarC.i.add(new a7h1("support_site_link", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", str4)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                ((iu30) obj3).invoke(new rb21(str4));
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                ((f3b) obj2).a.a("spotify:internal:your-library:messaging", (tv80) obj, mno1.h(new mmr0[]{new mmr0("extra_bottom_sheet_message", new csm1((String) obj3))}));
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                oe21 oe21Var = (oe21) obj;
                oe21 oe21Var2 = (oe21) obj3;
                pe21 pe21Var = (pe21) obj2;
                if (pe21Var.t.contains(oe21Var.a.l)) {
                    int iC = l1d.C(pe21Var.i);
                    if (iC == 0) {
                        int iOrdinal = pe21Var.d().ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal != 1) {
                                eg.o();
                                return null;
                            }
                            if (((int) (oe21Var.a() & 4294967295L)) == ((int) (4294967295L & oe21Var2.a()))) {
                            }
                        } else if (((int) (oe21Var.a() >> 32)) == ((int) (oe21Var2.a() >> 32))) {
                        }
                    } else if (iC != 1) {
                        eg.o();
                        return null;
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                dt30 dt30Var = (dt30) obj2;
                return dt30Var.c() ? new tj4((byte) 15) : new xwm0(new vk21(dt30Var, (Function0) obj3), (byte) 20);
            case 22:
                m021 m021Var = (m021) obj2;
                uxy0 uxy0Var = (uxy0) m021Var.b;
                th30 th30Var = (th30) uxy0Var.b;
                uww0 uww0Var = (uww0) uxy0Var.c;
                String str5 = (String) m021Var.c;
                String str6 = (String) obj3;
                if (!th30Var.U()) {
                    y901 y901VarA = uww0Var.a();
                    y901VarA.T0(mno1.h(new mmr0[]{new mmr0("episode_uri", str5), new mmr0("transcript_uri", str6)}));
                    y901VarA.g1(th30Var, "read_along_report_issue_dialog");
                }
                return rih1Var;
            case 23:
                qc40 qc40Var = (qc40) obj;
                if (qc40Var.equals(pc40.a)) {
                    ne neVar = (ne) obj2;
                    nm21 nm21Var = (nm21) obj3;
                    neVar.getClass();
                    ((mm21) neVar.d).a((Application) neVar.a, nm21Var.a, hap1.p(nm21Var.a));
                } else if (!qc40Var.equals(oc40.a)) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                String str7 = ((yl21) obj2).c;
                Set set = wl21.a;
                String string = Uri.parse(str7).buildUpon().appendEncodedPath((String) obj).build().toString();
                if (wl21.c(string)) {
                    ((WebView) obj3).loadUrl(string);
                }
                return rih1Var;
            case 25:
                tv80 tv80Var = (tv80) obj;
                ven0 ven0Var2 = (ven0) obj3;
                if (!((Boolean) ven0Var2.getValue()).booleanValue()) {
                    ven0Var2.setValue(Boolean.TRUE);
                    q7r0 q7r0Var = ((or21) obj2).c;
                    if (tv80Var != null && (ou80Var = tv80Var.a) != null) {
                        str = ou80Var.a;
                    }
                    if (str == null) {
                        str = "";
                    }
                    q7r0Var.c(str);
                }
                return rih1Var;
            case 26:
                ((iu30) obj2).invoke((fr21) obj3);
                return rih1Var;
            case 27:
                d631 d631Var = (d631) obj3;
                ((s531) obj2).e.i(d631Var.v, d631Var.p, d631Var.q, z4p1.G(d631Var.f.a()), d631Var.a, d631Var.x, d631Var.y, 1, (tv80) obj);
                return rih1Var;
            case 28:
                return (c931) ((vu30) obj2).invoke((q7r0) obj3, (Bundle) obj);
            default:
                ps11 ps11Var = new ps11((hpc) obj3, (byte) 22);
                xt21 xt21Var = xt21.U0;
                rs11 rs11Var = rs11.b1;
                LinkedHashMap linkedHashMap = ((ji50) obj).b;
                linkedHashMap.put(vga1.class, r4o1.Q(xt21Var, w7x.a, ps11Var, rs11Var));
                wrw wrwVar = (wrw) obj2;
                if (wrwVar != null) {
                    linkedHashMap.put(yd60.class, wrwVar);
                }
                return rih1Var;
        }
    }
}
