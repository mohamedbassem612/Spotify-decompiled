package p;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.StatFs;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.base.java.logging.Logger;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wba1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wba1(Object obj, Object obj2, Object obj3, Object obj4, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                return new wba1((yt91) this.b, (Integer) obj4, (lz20) obj3, (k6a1) obj2, lnmVar, (byte) 0);
            case 1:
                return new wba1((o2u0) this.b, (s24) obj4, (uoa) obj3, (tob1) obj2, lnmVar, (byte) 1);
            case 2:
                return new wba1((w62) this.b, (JSONObject) obj4, (Intent) obj3, (String) obj2, lnmVar, (byte) 2);
            case 3:
                return new wba1((nl9) this.b, (String) obj4, (iu30) obj3, (ven0) obj2, lnmVar, (byte) 3);
            case 4:
                return new wba1((kkz0) this.b, (kes) obj4, (qam1) obj3, (hdn0) obj2, lnmVar, (byte) 4);
            case 5:
                wba1 wba1Var = new wba1((wgd1) obj4, (lhd1) obj3, (pxg1) obj2, lnmVar, (byte) 5);
                wba1Var.b = obj;
                return wba1Var;
            case 6:
                return new wba1((rk41) this.b, (ve8) obj4, (Function0) obj3, (ven0) obj2, lnmVar, (byte) 6);
            case 7:
                return new wba1((ven0) this.b, (ven0) obj4, (ven0) obj3, (hdn0) obj2, lnmVar, (byte) 7);
            case 8:
                wba1 wba1Var2 = new wba1((w0o) obj4, (ry71) obj3, (ry71) obj2, lnmVar, (byte) 8);
                wba1Var2.b = obj;
                return wba1Var2;
            case 9:
                return new wba1((String) this.b, (String) obj4, (ven0) obj3, (tob1) obj2, lnmVar, (byte) 9);
            case 10:
                return new wba1((q9g1) this.b, (iu30) obj4, (i2c) obj3, (xdt0) obj2, lnmVar, (byte) 10);
            case 11:
                return new wba1((mvh1) this.b, (wph1) obj4, (vph1) obj3, (ven0) obj2, lnmVar, (byte) 11);
            case 12:
                return new wba1((yxb0) this.b, (Context) obj4, (Uri) obj3, (iu30) obj2, lnmVar, (byte) 12);
            case 13:
                wba1 wba1Var3 = new wba1(obj4, lnmVar, (r630) obj3, (kt91) obj2);
                wba1Var3.b = obj;
                return wba1Var3;
            case 14:
                wba1 wba1Var4 = new wba1((List) obj4, (tai1) obj3, (List) obj2, lnmVar, (byte) 14);
                wba1Var4.b = obj;
                return wba1Var4;
            case 15:
                return new wba1((i8h1) this.b, (String) obj4, (z2a) obj3, (qn30) obj2, lnmVar, (byte) 15);
            case 16:
                return new wba1((i8h1) this.b, (String) obj4, (ArrayList) obj3, (Set) obj2, lnmVar, (byte) 16);
            case 17:
                wba1 wba1Var5 = new wba1((x8j1) obj4, (n2o) obj3, (ViewGroup) obj2, lnmVar, (byte) 17);
                wba1Var5.b = obj;
                return wba1Var5;
            case 18:
                return new wba1((n6k1) this.b, (ffj1) obj4, (i3b) obj3, (Context) obj2, lnmVar, (byte) 18);
            case 19:
                return new wba1((ven0) this.b, (zeu) obj4, (n511) obj3, (ven0) obj2, lnmVar, (byte) 19);
            case 20:
                return new wba1((jkr0) this.b, (Function0) obj4, (ven0) obj3, (ven0) obj2, lnmVar, (byte) 20);
            case 21:
                wba1 wba1Var6 = new wba1((p5j1) obj4, (ven0) obj3, (ven0) obj2, lnmVar, (byte) 21);
                wba1Var6.b = obj;
                return wba1Var6;
            case 22:
                return new wba1((iu30) this.b, (hdn0) obj4, (ven0) obj3, (hdn0) obj2, lnmVar, (byte) 22);
            default:
                wba1 wba1Var7 = new wba1((iu30) obj4, (c8m1) obj3, (iu30) obj2, lnmVar, (byte) 23);
                wba1Var7.b = obj;
                return wba1Var7;
        }
    }

    public final Object invoke(Object obj, Object obj2) throws IOException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 4:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 5:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 6:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 7:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 10:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 11:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 12:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 13:
                create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 14:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 15:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 16:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 17:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 18:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 19:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 20:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 21:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 22:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                create((k8m1) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Iterable, java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.util.List] */
    public final Object invokeSuspend(Object obj) throws IOException {
        String string;
        bm41 bm41Var;
        Bundle bundleE;
        t480 string2;
        vrk0 vrk0Var;
        n7h1 n7h1VarG;
        byte b = this.a;
        t480 lastPathSegment = null;
        int i = 0;
        int i2 = 0;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.e;
        Object obj3 = this.c;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                hm5.M(obj);
                yt91 yt91Var = (yt91) this.b;
                if (yt91Var != null) {
                    int iS = ((err0) yt91Var.c).s();
                    Integer num = (Integer) obj3;
                    if (num == null || iS != num.intValue()) {
                        lz20.b((lz20) obj4);
                        b6t b6tVar = (k6a1) obj2;
                        if (b6tVar != null) {
                            b6tVar.a();
                        }
                    }
                }
                return rih1Var;
            case 1:
                s24 s24Var = (s24) obj3;
                hm5.M(obj);
                o2u0 o2u0Var = (o2u0) this.b;
                if (o2u0Var != null && !o2u0Var.equals((o2u0) s24Var.X) && !o2u0Var.equals((o2u0) s24Var.g) && ((Boolean) ((tob1) obj2).getValue()).booleanValue()) {
                    s24Var.X = o2u0Var;
                    ((uoa) obj4).h(o2u0Var, new oot0(0L, 0L, false, false, (hu7) null, (tne1) null, false, 243));
                }
                return rih1Var;
            case 2:
                String str = (String) obj2;
                JSONObject jSONObject = (JSONObject) obj3;
                Intent intent = (Intent) obj4;
                hm5.M(obj);
                w62 w62Var = (w62) this.b;
                wcr wcrVar = (wcr) w62Var.h;
                if (!((Activity) w62Var.g).isDestroyed()) {
                    try {
                        try {
                            string = jSONObject.getString("~referring_link");
                        } catch (ActivityNotFoundException unused) {
                            wcrVar.c(4, intent, jhc1.K("Cannot navigate on branch link.\n                       |Link properties:\n                       |" + jSONObject + "\n                    "));
                        }
                    } catch (JSONException unused2) {
                        string = null;
                    }
                    Bundle bundleE2 = j82.E(intent, string, "BranchIO");
                    dwn0 dwn0Var = new dwn0(str, "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null);
                    if (((jnq) w62Var.f).c(dwn0Var, bundleE2) == edr.b) {
                        wcrVar.c(5, intent, "No app route for resolved Branch link");
                    }
                    String dataString = intent.getDataString();
                    String dataString2 = intent.getDataString();
                    Logger.b("[SpotifyBranchRouting] Navigating to resolved link: originalLink=%s, resolvedUrl=%s, shortlinkSessionId=%s", new Object[]{dataString, str, dataString2 != null ? m5n1.C(dataString2) : null});
                    ((lzn0) w62Var.e).i(dwn0Var, bundleE2);
                    break;
                }
                return rih1Var;
            case 3:
                hm5.M(obj);
                nl9 nl9Var = (nl9) this.b;
                j1c1 j1c1Var = (j1c1) ((ven0) obj2).getValue();
                String str2 = (String) obj3;
                List list = j1c1Var.b;
                Long lT = str2 != null ? ((c681) nl9Var.i).t(str2) : null;
                List list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    lax gaxVar = iax.a;
                    if (!zHasNext) {
                        ((iu30) obj4).invoke(j1c1.a(j1c1.a(j1c1Var, arrayList, null, null, null, 29), null, null, gaxVar, null, 23));
                        return rih1Var;
                    }
                    k1c1 k1c1Var = (k1c1) it.next();
                    String str3 = k1c1Var.a;
                    boolean z = k1c1Var.c;
                    try {
                        StatFs statFs = new StatFs(str3);
                        long blockSizeLong = statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
                        long blockSizeLong2 = statFs.getBlockSizeLong() * statFs.getBlockCountLong();
                        if (!z) {
                            if (lT == null) {
                                gaxVar = new gax(2131961689, (String) null);
                            } else if (lT.longValue() + 52428800 > blockSizeLong) {
                                gaxVar = new gax(2131962035, (String) null);
                            }
                        }
                        arrayList.add(k1c1.a(k1c1Var, false, z ? lT : null, str2 != null && nhc1.Y(str2, k1c1Var.a, false), Long.valueOf(blockSizeLong), Long.valueOf(blockSizeLong2), gaxVar, 7));
                    } catch (RuntimeException e) {
                        throw new IOException(e);
                    }
                }
                break;
            case 4:
                err0 err0Var = (hdn0) obj2;
                kes kesVar = (kes) obj3;
                hm5.M(obj);
                kkz0 kkz0Var = (kkz0) this.b;
                iu30 iu30Var = (iu30) kkz0Var.e;
                if (iu30Var != null) {
                    iu30Var.invoke(new Integer(kesVar.o()));
                }
                err0 err0Var2 = err0Var;
                if (err0Var2.s() != kesVar.o()) {
                    if (((mxc1) kkz0Var.d).f) {
                        k5k k5kVar = sam1.a;
                        ((qam1) obj4).a(4);
                    }
                    err0Var2.t(kesVar.o());
                }
                return rih1Var;
            case 5:
                c9n c9nVar = (c9n) this.b;
                hm5.M(obj);
                wgd1 wgd1Var = (wgd1) obj3;
                lhd1 lhd1Var = (lhd1) obj4;
                pxg1 pxg1Var = (pxg1) obj2;
                fn31.T(c9nVar, (o8n) null, 0, new vgd1(wgd1Var, lhd1Var, pxg1Var, null, (byte) 0), 3);
                fn31.T(c9nVar, (o8n) null, 0, new vgd1(wgd1Var, lhd1Var, pxg1Var, null, (byte) 1), 3);
                return rih1Var;
            case 6:
                hrr0 hrr0Var = (hrr0) ((ve8) obj3).e;
                hm5.M(obj);
                if (((Boolean) ((ven0) obj2).getValue()).booleanValue() && !((rk41) this.b).a && !((Boolean) hrr0Var.getValue()).booleanValue()) {
                    hrr0Var.setValue(Boolean.TRUE);
                    ((Function0) obj4).invoke();
                }
                return rih1Var;
            case 7:
                err0 err0Var3 = (hdn0) obj2;
                hm5.M(obj);
                ven0 ven0Var = (ven0) this.b;
                if (!u890.j((Integer) ven0Var.getValue(), (Integer) ((ven0) obj3).getValue())) {
                    ((ven0) obj4).setValue((Integer) ven0Var.getValue());
                    ydh.m(err0Var3, 1);
                }
                return rih1Var;
            case 8:
                c9n c9nVar2 = (c9n) this.b;
                hm5.M(obj);
                w0o w0oVar = (w0o) obj3;
                fn31.T(c9nVar2, (o8n) null, 0, new pec1(w0oVar, (ry71) obj4, lastPathSegment, (byte) 24), 3);
                return fn31.T(c9nVar2, (o8n) null, 0, new pec1(w0oVar, (ry71) obj2, lastPathSegment, (byte) 25), 3);
            case 9:
                tob1 tob1Var = (tob1) obj2;
                hm5.M(obj);
                if (((Boolean) ((ven0) obj4).getValue()).booleanValue()) {
                    r091 r091Var = (r091) tob1Var.getValue();
                    if (r091Var != null) {
                        r091Var.b(new lsm0((String) obj3, new ksm0(fec1.c, (String) this.b, (String) null, "reinvent-free-track-preview-upsell", (String) null, (String) null, 500), false, false, (jsm0) null, 0L, (ism0) null, (String) null, false, 0, 2044));
                    }
                    r091 r091Var2 = (r091) tob1Var.getValue();
                    if (r091Var2 != null) {
                        r091.f(r091Var2, (tv80) null, (Long) null, gky0.a, 7);
                    }
                    r091 r091Var3 = (r091) tob1Var.getValue();
                    if (r091Var3 != null) {
                        r091Var3.k();
                    }
                }
                return rih1Var;
            case 10:
                hm5.M(obj);
                q9g1 q9g1Var = (q9g1) this.b;
                if (q9g1Var.f.a == 0) {
                    ((iu30) obj3).invoke(new c9g1(new gcg1(hjl.i(((i2c) obj4).b), q9g1Var.j ? 4 : 1, (xdt0) obj2)));
                }
                return rih1Var;
            case 11:
                hm5.M(obj);
                mvh1 mvh1Var = (mvh1) this.b;
                ven0 ven0Var2 = (ven0) obj2;
                int iOrdinal = ((ea6) ven0Var2.getValue()).a.ordinal();
                if (iOrdinal == 0) {
                    bm41Var = bm41.a;
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    bm41Var = bm41.a;
                } else {
                    bm41Var = bm41.b;
                }
                jrr0 jrr0VarY = iko1.y(mvh1Var, bm41Var);
                boolean z2 = ((ea6) ven0Var2.getValue()).a == rxx0.b;
                a1r0 a1r0Var = ((wph1) obj3).b;
                if (z2) {
                    bundleE = i7w0.e(jrr0VarY);
                    bundleE.putParcelable("update_schedule_result_receiver", (vph1) obj4);
                } else {
                    bundleE = i7w0.e(jrr0VarY);
                }
                a1r0.j(a1r0Var, "spotify:internal:magpie:update-cadence", (String) null, bundleE, z2, 2);
                return rih1Var;
            case 12:
                hm5.M(obj);
                Uri uri = (Uri) obj4;
                try {
                    Cursor cursorQuery = ((Context) obj3).getContentResolver().query(uri, null, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (!cursorQuery.moveToFirst() || (string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_display_name"))) == null || ihc1.y0(string2)) {
                                string2 = null;
                            }
                            cursorQuery.close();
                            lastPathSegment = string2;
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                u890.p(cursorQuery, th);
                                throw th2;
                            }
                        }
                    }
                } catch (Exception unused3) {
                }
                if (lastPathSegment == null && (lastPathSegment = uri.getLastPathSegment()) == null) {
                    lastPathSegment = "";
                }
                ((iu30) obj2).invoke(new swh1(uri, lastPathSegment));
                return rih1Var;
            case 13:
                hm5.M(obj);
                String str4 = ((z6i1) obj3).a;
                r630 r630Var = (r630) obj4;
                if (r630Var.c(str4) == null) {
                    r630Var.a(new i430(str4, 26, false));
                }
                r630Var.j(str4, false);
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131959456});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                ((kt91) obj2).k(new er91((fs91) null, "", 2131959456, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return rih1Var;
            case 14:
                List list3 = (List) obj2;
                tai1 tai1Var = (tai1) obj4;
                c9n c9nVar3 = (c9n) this.b;
                hm5.M(obj);
                List list4 = (List) obj3;
                if (list4.contains("title")) {
                    fn31.T(c9nVar3, (o8n) null, 0, new rai1(tai1Var, list3, null, (byte) 0), 3);
                }
                if (list4.contains("start_offset")) {
                    fn31.T(c9nVar3, (o8n) null, 0, new rai1(tai1Var, list3, null, (byte) 1), 3);
                    fn31.T(c9nVar3, (o8n) null, 0, new rai1(tai1Var, list3, null, (byte) 2), 3);
                }
                return rih1Var;
            case 15:
                hm5.M(obj);
                i8h1 i8h1Var = (i8h1) this.b;
                z2a z2aVar = (z2a) obj4;
                qn30 qn30Var = (qn30) obj2;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-artist-badges-bottom-sheet";
                x6h1VarI.f = "0.0.1";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.d = (String) obj3;
                y6h1 y6h1VarA = x6h1VarI.a();
                List listSingletonList = Collections.singletonList("artist");
                if (!(z2aVar instanceof w2a)) {
                    int iW = h0p1.w(z2aVar);
                    x6h1 x6h1VarC = y6h1VarA.c();
                    x6h1VarC.i.add(new a7h1("badge_card", v8i0.g(iW), 0, (String) null, (String) null));
                    x6h1VarC.j = true;
                    y6h1 y6h1VarA2 = x6h1VarC.a();
                    k7h1 k7h1Var = new k7h1();
                    ((xjn) k7h1Var).a = y6h1VarA2;
                    ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                    k7h1Var.e = listSingletonList;
                    i8h1Var.f(k7h1Var.a(), (Set) null);
                    i = 1;
                }
                if (qn30Var != null) {
                    Integer numValueOf = Integer.valueOf(i);
                    x6h1 x6h1VarC2 = y6h1VarA.c();
                    x6h1VarC2.i.add(new a7h1("badge_card", "fresh_finds_forward", numValueOf, (String) null, (String) null));
                    x6h1VarC2.j = true;
                    y6h1 y6h1VarA3 = x6h1VarC2.a();
                    k7h1 k7h1Var2 = new k7h1();
                    ((xjn) k7h1Var2).a = y6h1VarA3;
                    ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                    k7h1Var2.e = listSingletonList;
                    i8h1Var.f(k7h1Var2.a(), (Set) null);
                }
                return rih1Var;
            case 16:
                hm5.M(obj);
                i8h1 i8h1Var2 = (i8h1) this.b;
                ?? A1 = (ArrayList) obj4;
                Set set = (Set) obj2;
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-artist-badges-bottom-sheet";
                x6h1VarI2.f = "0.0.1";
                x6h1VarI2.g = "22.0.0";
                x6h1VarI2.d = (String) obj3;
                y6h1 y6h1VarA4 = x6h1VarI2.a();
                List listSingletonList2 = Collections.singletonList("artist");
                if (!A1.isEmpty()) {
                    Iterator it2 = A1.iterator();
                    while (it2.hasNext()) {
                        if (((io6) it2.next()).a == mo6.AI_PERSONA) {
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj5 : A1) {
                                if (((io6) obj5).a != mo6.VERIFIED_BY_SPOTIFY) {
                                    arrayList2.add(obj5);
                                }
                            }
                            A1 = o7h.a1(arrayList2, new be21((byte) 29));
                        }
                    }
                }
                for (Object obj6 : (Iterable) A1) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        p7h.T();
                        throw null;
                    }
                    switch (((io6) obj6).a.ordinal()) {
                        case 0:
                        case 5:
                            vrk0Var = null;
                            break;
                        case 1:
                            vrk0Var = vrk0.RELEASES;
                            break;
                        case 2:
                            vrk0Var = vrk0.PLAYLISTED;
                            break;
                        case 3:
                            vrk0Var = vrk0.EDITORIAL_PLAYLIST;
                            break;
                        case 4:
                            vrk0Var = vrk0.REGISTERED_IN_SPOTIFY;
                            break;
                        case 6:
                            vrk0Var = vrk0.CONCERTS;
                            break;
                        case 7:
                            vrk0Var = vrk0.TOURS;
                            break;
                        case 8:
                            vrk0Var = vrk0.FRESH_FINDS_FORWARD;
                            break;
                        case 9:
                            vrk0Var = vrk0.UNKNOWN;
                            break;
                        default:
                            eg.o();
                            return null;
                    }
                    if (vrk0Var != null && set.add(new mmr0(vrk0Var, Integer.valueOf(i2)))) {
                        Integer numValueOf2 = Integer.valueOf(i2);
                        x6h1 x6h1VarC3 = y6h1VarA4.c();
                        x6h1VarC3.i.add(new a7h1("artist_detail_row", vrk0Var.a, numValueOf2, (String) null, (String) null));
                        x6h1VarC3.j = true;
                        y6h1 y6h1VarA5 = x6h1VarC3.a();
                        k7h1 k7h1Var3 = new k7h1();
                        ((xjn) k7h1Var3).a = y6h1VarA5;
                        ((xjn) k7h1Var3).c = Long.valueOf(System.currentTimeMillis());
                        k7h1Var3.e = listSingletonList2;
                        i8h1Var2.f(k7h1Var3.a(), (Set) null);
                    }
                    i2 = i3;
                }
                return rih1Var;
            case 17:
                c9n c9nVar4 = (c9n) this.b;
                hm5.M(obj);
                x8j1 x8j1Var = (x8j1) obj3;
                q8n q8nVar = x8j1Var.a;
                n2o n2oVar = (n2o) obj4;
                ViewGroup viewGroup = (ViewGroup) obj2;
                fn31.T(c9nVar4, q8nVar, 0, new w8j1(x8j1Var, n2oVar, viewGroup, (lnm) null, (byte) 0), 2);
                fn31.T(c9nVar4, q8nVar, 0, new w8j1(x8j1Var, n2oVar, viewGroup, (lnm) null, (byte) 1), 2);
                fn31.T(c9nVar4, q8nVar, 0, new w8j1(x8j1Var, n2oVar, viewGroup, (lnm) null, (byte) 2), 2);
                fn31.T(c9nVar4, q8nVar, 0, new w8j1(x8j1Var, n2oVar, viewGroup, (lnm) null, (byte) 3), 2);
                fn31.T(c9nVar4, q8nVar, 0, new w8j1(x8j1Var, n2oVar, viewGroup, (lnm) null, (byte) 4), 2);
                return rih1Var;
            case 18:
                hm5.M(obj);
                n6k1 n6k1Var = (n6k1) this.b;
                ffj1 ffj1Var = (ffj1) obj3;
                if (n6k1Var.b) {
                    m6k1 m6k1Var = n6k1Var.a;
                    zau0 zau0Var = m6k1Var.d;
                    i3b i3bVar = (i3b) obj4;
                    t7l1 t7l1Var = m6k1Var.a;
                    s7l1 s7l1Var = t7l1Var.b;
                    ljj1 ljj1Var = s7l1Var.a;
                    boolean z3 = xoi1.b((Context) obj2) ? false : s7l1Var.c;
                    String str5 = s7l1Var.b;
                    w75 w75Var = (w75) i3bVar.b;
                    sqj1 sqj1Var = new sqj1(ljj1Var, z3, str5, new rqj1("watch-feed-entrypoint-video-card", w75Var.b(), w75Var.a(), w75Var.c()), String.valueOf(t7l1Var.hashCode()));
                    if (zau0Var != null) {
                        ffj1Var.d = Boolean.TRUE;
                        ((xtm0) ffj1Var.c.getValue()).a(zau0Var, sqj1Var, oky0.a);
                    } else {
                        ffj1Var.d = Boolean.FALSE;
                        idd1 idd1Var = ffj1Var.b;
                        ((k0t) idd1Var.getValue()).c(new vxz(sqj1Var));
                        ((k0t) idd1Var.getValue()).c(zyz.e);
                    }
                } else {
                    Boolean bool = ffj1Var.d;
                    if (bool != null) {
                        if (bool.booleanValue()) {
                            ((xtm0) ffj1Var.c.getValue()).b();
                        } else {
                            ((k0t) ffj1Var.b.getValue()).c(zyz.f);
                        }
                    }
                }
                return rih1Var;
            case 19:
                hm5.M(obj);
                n511 n511Var = (n511) ((ven0) this.b).getValue();
                if (n511Var != null) {
                    zeu zeuVar = (zeu) obj3;
                    q7r0 q7r0Var = (q7r0) zeuVar.a;
                    ven0 ven0Var3 = (ven0) obj2;
                    n511 n511VarJ = ((n511) obj4).j(n511Var);
                    float fO = 0.0f;
                    if (!n511VarJ.k()) {
                        float f = (n511Var.d - n511Var.b) * (n511Var.c - n511Var.a);
                        if (f != 0.0f) {
                            fO = yoi1.o(((n511VarJ.d - n511VarJ.b) * (n511VarJ.c - n511VarJ.a)) / f, 0.0f, 1.0f);
                        }
                    }
                    int i4 = fO < 0.5f ? 0 : 1;
                    if (i4 != 0 && ((t480) ven0Var3.getValue()) == null) {
                        l7h1 l7h1VarE = ((rrk0) zeuVar.c).e();
                        n7h1 n7h1VarG2 = cwl1.G(q7r0Var);
                        ven0Var3.setValue(n7h1VarG2 != null ? n7h1VarG2.h(l7h1VarE) : null);
                    } else if (i4 == 0 && ((t480) ven0Var3.getValue()) != null) {
                        t480 t480Var = (t480) ven0Var3.getValue();
                        if (t480Var != null && (n7h1VarG = cwl1.G(q7r0Var)) != null) {
                            n7h1VarG.e(t480Var);
                        }
                        ven0Var3.setValue((Object) null);
                    }
                }
                return rih1Var;
            case 20:
                jkr0 jkr0Var = (jkr0) this.b;
                hm5.M(obj);
                ven0 ven0Var4 = (ven0) obj4;
                if (((Integer) ven0Var4.getValue()) != null) {
                    int iO = jkr0Var.o();
                    Integer num2 = (Integer) ven0Var4.getValue();
                    if (num2 == null || iO != num2.intValue()) {
                        ((Function0) obj3).invoke();
                    }
                } else if (((Boolean) ((ven0) obj2).getValue()).booleanValue()) {
                    ven0Var4.setValue(new Integer(((err0) jkr0Var.d.c).s()));
                }
                return rih1Var;
            case 21:
                c9n c9nVar5 = (c9n) this.b;
                hm5.M(obj);
                fn31.T(c9nVar5, (o8n) null, 0, new z0i1((p5j1) obj3, (ven0) obj4, (ven0) obj2, (lnm) null, (byte) 3), 3);
                return rih1Var;
            case 22:
                hm5.M(obj);
                err0 err0Var4 = (hdn0) obj3;
                if (err0Var4.s() != 0) {
                    ((ven0) obj4).setValue(Boolean.TRUE);
                    err0 err0Var5 = (hdn0) obj2;
                    err0Var5.t(err0Var4.s() + err0Var5.s());
                    ((iu30) this.b).invoke(new Integer(err0Var4.s()));
                    err0Var4.t(0);
                }
                return rih1Var;
            default:
                c8m1 c8m1Var = (c8m1) obj4;
                k8m1 k8m1Var = (k8m1) this.b;
                hm5.M(obj);
                n1i n1iVar = k8m1Var.b;
                n1i n1iVar2 = k8m1Var.a;
                n1i n1iVar3 = n1i.d;
                if (n1iVar == n1iVar3 && n1iVar != n1iVar2) {
                    ((iu30) obj3).invoke(c8m1Var.c);
                } else if (n1iVar2 == n1iVar3 && n1iVar2 != n1iVar) {
                    ((iu30) obj2).invoke(c8m1Var.c);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wba1(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wba1(Object obj, lnm lnmVar, r630 r630Var, kt91 kt91Var) {
        super(2, lnmVar);
        this.a = (byte) 13;
        this.c = obj;
        this.d = r630Var;
        this.e = kt91Var;
    }
}
