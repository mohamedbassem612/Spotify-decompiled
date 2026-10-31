package p;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c30 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c30(c380 c380Var, iu30 iu30Var, boolean z) {
        super(1);
        this.a = (byte) 24;
        this.d = c380Var;
        this.c = iu30Var;
        this.b = z;
    }

    public final Object invoke(Object obj) {
        float fSin;
        long jA;
        w7h1 w7h1Var;
        int i;
        int i2;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        boolean z = this.b;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                ((Boolean) obj).getClass();
                if (!z) {
                    ((iu30) obj3).invoke(((l7x0) obj2).c ? q7x0.X : q7x0.h);
                }
                return rih1Var;
            case 1:
                u961 u961Var = (u961) obj3;
                fn31.T(cto1.q((dg30) u961Var.a), (o8n) null, 0, new hl1(this.b, (a1q) obj2, u961Var, (lnm) null, (byte) 0), 3);
                return rih1Var;
            case 2:
                pn1 pn1Var = (pn1) obj3;
                fn31.T(cto1.q(pn1Var.a), (o8n) null, 0, new on1(pn1Var, (String) obj2, this.b, (tv80) obj, (lnm) null), 3);
                return rih1Var;
            case 3:
                DrawScope drawScope = (DrawScope) obj;
                float fFloatValue = ((Number) ((tob1) obj3).getValue()).floatValue();
                float f = hrt.f(drawScope, 24.0f);
                u7h u7hVar = (u7h) obj2;
                rmc0 rmc0VarListIterator = yt2.g.listIterator(0);
                while (true) {
                    rmc0 rmc0Var = rmc0VarListIterator;
                    if (!rmc0Var.hasNext()) {
                        return rih1Var;
                    }
                    xt2 xt2Var = (xt2) rmc0Var.next();
                    if (z) {
                        long jB = yt2.b(xt2Var);
                        int i3 = (int) (jB >> 32);
                        int i4 = (int) (jB & 4294967295L);
                        fSin = (((float) Math.sin((0.31f * fFloatValue) + ((Float.intBitsToFloat(i3) * 0.51f) - (Float.intBitsToFloat(i4) * 0.21f)))) * 0.3f) + (((float) Math.sin((0.55f * fFloatValue) + us71.e(i4, 0.39f, Float.intBitsToFloat(i3) * 0.27f))) * 0.5f);
                    } else {
                        fSin = 0.0f;
                    }
                    long j = yt2.e;
                    if (u7hVar != null) {
                        jA = u7hVar.a;
                    } else {
                        float fO = yoi1.o(yt2.a(xt2Var) - (0.15f * fSin), 0.0f, 1.0f);
                        jA = fO < 0.5f ? z4p1.A(fO / 0.5f, yt2.d, j) : z4p1.A((fO - 0.5f) / 0.5f, j, yt2.f);
                    }
                    DrawScope.b0(drawScope, jA, (Math.max(((fSin * 0.35f) + 1.0f) * Math.max((1.0f - yt2.a(xt2Var)) * 6.0f, 0.6666667f), 0.6666667f) / 2.0f) * f, k4k.r(xt2Var, f), 0.0f, (DrawStyle) null, 120);
                }
                break;
            case 4:
                qv00 qv00Var = (qv00) obj;
                String str = (String) obj2;
                Iterator it = ((mta) ((u961) obj3).a).m().iterator();
                while (it.hasNext()) {
                    qv00Var.a(str, (Class) ((aq21) it.next()).getKey(), false);
                }
                if (z) {
                    qv00Var.a(str, f7l1.class, false);
                }
                return rih1Var;
            case 5:
                wq50 wq50Var = (wq50) obj2;
                if (!z) {
                    return new tj4((byte) 2);
                }
                Object systemService = ((Context) obj3).getSystemService("sensor");
                SensorManager sensorManager = systemService instanceof SensorManager ? (SensorManager) systemService : null;
                if (sensorManager == null) {
                    return new tj4((byte) 3);
                }
                Sensor defaultSensor = sensorManager.getDefaultSensor(15);
                if (defaultSensor == null && (defaultSensor = sensorManager.getDefaultSensor(11)) == null) {
                    return new tj4((byte) 4);
                }
                ud6 ud6Var = new ud6(new float[9], new float[3], wq50Var);
                sensorManager.registerListener((SensorEventListener) ud6Var, defaultSensor, 1);
                return new sg(sensorManager, ud6Var, wq50Var, (byte) 3);
            case 6:
                c380 c380Var = ((aa9) obj3).c;
                ((rtb0) obj).e(c380Var.size(), new qf1(c380Var, (byte) 18), new qf1(c380Var, (byte) 19), new j2i(2039820996, new fa9(c380Var, (h7t0) obj2, z, (byte) 0), true));
                return rih1Var;
            case 7:
                c380 c380Var2 = ((aa9) obj3).b;
                ((rtb0) obj).e(c380Var2.size(), new qf1(c380Var2, (byte) 22), new qf1(c380Var2, (byte) 23), new j2i(2039820996, new fa9(c380Var2, (q2c1) obj2, z, (byte) 1), true));
                return rih1Var;
            case 8:
                if (z) {
                    ((Function0) obj3).invoke();
                }
                return new aub((Function0) obj2, z);
            case 9:
                ((goq) ((rmr) obj3).b).c((tom) obj2, z);
                return rih1Var;
            case 10:
                a680 a680Var = (a680) obj3;
                pbh0 pbh0Var = new pbh0((dg30) a680Var.d, 0);
                pbh0Var.f(2131962957);
                pbh0Var.b(2131962956);
                pbh0Var.d(2131962954, new t621((byte) 2, a680Var, (String) obj2, z)).c(2131962955, new oad(a680Var, (byte) 11)).create().show();
                return rih1Var;
            case 11:
                hnn0 hnn0Var = (hnn0) obj3;
                z2u z2uVar = new z2u(z, (List) obj2, hnn0Var);
                hnn0Var.h.a(z2uVar);
                return new ht0(hnn0Var, z2uVar, (byte) 16);
            case 12:
                String str2 = (String) obj2;
                ayl aylVar = (ayl) ((her) obj3).b;
                if (z) {
                    ayl.c(aylVar, str2, (String) null, 6);
                } else {
                    ayl.b(aylVar, str2, (String) null, 6);
                }
                return rih1Var;
            case 13:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj4 : (Set) obj) {
                    String entityUri = ((gsy) obj4).getEntityUri();
                    Object objH = linkedHashMap.get(entityUri);
                    if (objH == null) {
                        objH = cfm0.h(entityUri, linkedHashMap);
                    }
                    ((List) objH).add(obj4);
                }
                Collection<List> collectionValues = linkedHashMap.values();
                uvy uvyVar = (uvy) obj3;
                hre1 hre1Var = (hre1) obj2;
                ArrayList arrayList = new ArrayList(q7h.U(collectionValues, 10));
                for (List list : collectionValues) {
                    arrayList.add(new lt20(new m441(new ml1(list, uvyVar, hre1Var, this.b, (lnm) null)), new uls(list, (lnm) null, (byte) 12), (byte) 0));
                }
                mr20[] mr20VarArr = (mr20[]) arrayList.toArray(new mr20[0]);
                return hu20.d((mr20[]) Arrays.copyOf(mr20VarArr, mr20VarArr.length));
            case 14:
                sp00 sp00Var = (sp00) obj3;
                fn31.T((u9c0) sp00Var.e, (q8n) sp00Var.d, 0, new kv1(this.b, sp00Var, (String) obj2, new ubc0((tv80) obj), (lnm) null, (byte) 9), 2);
                return rih1Var;
            case 15:
                String str3 = (String) obj2;
                y6h1 y6h1Var = ((aol0) obj3).a;
                if (z) {
                    z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                    if (str3 == null) {
                        str3 = "";
                    }
                    w7h1Var = new w7h1("", "", z7h1Var, new x7h1("unfollow", 1, Collections.singletonMap("item_to_be_unfollowed", str3)), y6h1Var, r6h1.c, System.currentTimeMillis());
                } else {
                    z7h1 z7h1Var2 = new z7h1("hit", 1, b7xVar);
                    if (str3 == null) {
                        str3 = "";
                    }
                    w7h1Var = new w7h1("", "", z7h1Var2, new x7h1("follow", 1, Collections.singletonMap("item_to_be_followed", str3)), y6h1Var, r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var;
            case 16:
                u961 u961Var2 = (u961) obj3;
                fn31.T(cto1.q((dg30) u961Var2.a), (o8n) null, 0, new kv1(this.b, u961Var2, (String) obj2, new ubc0((tv80) obj), (lnm) null, (byte) 10), 3);
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                e261 e261Var = (e261) obj;
                ap30 ap30Var = (ap30) obj3;
                String strF = ap30Var.c;
                if (z) {
                    strF = f4i1.f(ap30Var.a, ", ", strF);
                }
                b261.n(e261Var, strF);
                b261.g(e261Var, (String) null, new iwr((ven0) obj2, (byte) 21));
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                dhl dhlVar = (dhl) obj;
                ihl ihlVar = dhlVar.c;
                int length = ((zx30) obj3).c.length();
                ube ubeVar = dhlVar.e;
                if (length > 0) {
                    i = 4;
                    yf.p(ubeVar, ((ihl) obj2).g, 16.0f, 4);
                } else {
                    i = 4;
                    yf.p(ubeVar, ihlVar.e, 16.0f, 4);
                }
                xid.r(dhlVar.d, ihlVar.d, 16.0f, i);
                xid xidVar = dhlVar.f;
                thl thlVar = ihlVar.f;
                if (z) {
                    xid.r(xidVar, thlVar, 80.0f, i);
                } else {
                    xid.r(xidVar, thlVar, 16.0f, i);
                }
                dhlVar.g(new e5u((p3v) null, "spread"));
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                b261.n((e261) obj, z ? (String) obj3 : ((dwb0) obj2).f);
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                haa0 haa0Var = (haa0) obj3;
                fn31.T(cto1.q((dg30) haa0Var.b), (o8n) null, 0, new f1d0(z, haa0Var, (String) obj2, null), 3);
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                tv80 tv80Var = (tv80) obj;
                o3e0 o3e0Var = (o3e0) obj2;
                List list2 = (List) obj3;
                if (list2 != null) {
                    if (!z) {
                        List<nbb0> list3 = list2;
                        ArrayList arrayList2 = new ArrayList(q7h.U(list3, 10));
                        for (nbb0 nbb0Var : list3) {
                            arrayList2.add(new nbb0(nbb0Var.a, false, nbb0Var.b, nbb0Var.d));
                        }
                        list2 = arrayList2;
                    }
                    ((ecb0) o3e0Var.c).a.n(nik1.T0.a, tv80Var.a.a, mno1.h(new mmr0[]{new mmr0("language_picker_parameters", new fcb0(list2, ((Context) o3e0Var.d).getString(2131957814), 2))}), false);
                } else {
                    hma1 hma1VarEdit = ((aqs0) o3e0Var.b).a.edit();
                    hma1VarEdit.a(aqs0.c, !z);
                    hma1VarEdit.g();
                }
                return rih1Var;
            case 22:
                fad0 fad0Var = (fad0) obj3;
                String str4 = (String) obj2;
                ((zxl) fad0Var.b).a.j(new String[]{str4}, true);
                if (z) {
                    ((c7s) fad0Var.c).a(str4, new bsc0(fad0Var, str4, (byte) 28));
                }
                return rih1Var;
            case 23:
                yge0 yge0Var = (yge0) obj3;
                ((zxl) yge0Var.b).a((String) obj2);
                if (z) {
                    kt91 kt91Var = ((c7s) yge0Var.c).b;
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131962620});
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                    kt91Var.k(new er91((fs91) null, "", 2131962620, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                c380 c380Var3 = (c380) obj2;
                ((rtb0) obj).e(c380Var3.size(), (iu30) null, new ehf0(c380Var3, (byte) 11), new j2i(2039820996, new mxb0((List) c380Var3, (Object) c380Var3, obj3, this.b, (byte) 1), true));
                return rih1Var;
            case 25:
                String str5 = (String) obj;
                qri0 qri0Var = (qri0) obj3;
                kqi0 kqi0Var = qri0Var.g;
                lzn0 lzn0Var = qri0Var.c;
                yri0 yri0Var = ((zri0) obj2).i;
                i8h1 i8h1Var = (i8h1) kqi0Var.b;
                n1m0 n1m0Var = (n1m0) ((idd1) kqi0Var.c).getValue();
                if (yri0Var instanceof xri0) {
                    i2 = 4;
                } else if (yri0Var instanceof wri0) {
                    i2 = 2;
                } else {
                    if (!(yri0Var instanceof vri0)) {
                        eg.o();
                        return null;
                    }
                    i2 = 1;
                }
                n1m0Var.getClass();
                x6h1 x6h1VarC = n1m0Var.a.c();
                x6h1VarC.i.add(new a7h1("memberships_upsell_bottomsheet_container", wzl0.a(i2), (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("cta_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str5)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                if (z) {
                    lzn0Var.e();
                    if (str5.length() > 0) {
                        lzn0Var.f(new dwn0(str5, "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null));
                    }
                } else {
                    if (str5.length() > 0) {
                        qri0Var.d.b(qri0Var.e, new lyf(kxf.b, new jyf((String) null), Uri.parse(str5)));
                    }
                    lzn0Var.e();
                }
                return rih1Var;
            case 26:
                e261 e261Var2 = (e261) obj;
                String str6 = (String) obj3;
                if (str6 != null) {
                    b261.n(e261Var2, str6);
                }
                b261.x(e261Var2, 3);
                b261.y(e261Var2, z);
                if (((lax) obj2) instanceof gax) {
                    b261.a(e261Var2);
                }
                return rih1Var;
            case 27:
                qv00 qv00Var2 = (qv00) obj;
                Iterator it2 = ((List) obj3).iterator();
                while (it2.hasNext()) {
                    qv00Var2.a((String) it2.next(), mdz.class, false);
                }
                if (z) {
                    Iterator it3 = ((List) obj2).iterator();
                    while (it3.hasNext()) {
                        qv00Var2.a((String) it3.next(), d7u0.class, false);
                    }
                }
                return rih1Var;
            case 28:
                if (z && (((iu30) obj3).invoke(obj) instanceof og90)) {
                    return (String) ((iu30) obj2).invoke(obj);
                }
                return null;
            default:
                ((Number) obj).longValue();
                p3u0 p3u0Var = (p3u0) obj3;
                lgy lgyVar = p3u0Var.h;
                m0u0 m0u0Var = p3u0Var.i;
                q590 q590Var = p3u0Var.c;
                lgyVar.D(m0u0Var, this.b, q590Var.c0(), q590Var.D(), (VideoSurfaceView) obj2);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c30(Object obj, boolean z, Object obj2, byte b) {
        super(1);
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c30(Object obj, Object obj2, boolean z, byte b) {
        super(1);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c30(boolean z, Object obj, Object obj2, byte b) {
        super(1);
        this.a = b;
        this.b = z;
        this.c = obj;
        this.d = obj2;
    }
}
