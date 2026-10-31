package p;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.Uri;
import com.spotify.apprater.appraterdialog.AppRaterActivity;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.base.java.logging.Logger;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kk extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kk(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = obj;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return new kk((lk) obj2, lnmVar, (byte) 0);
            case 1:
                return new kk((iz0) obj2, lnmVar, (byte) 1);
            case 2:
                return new kk((ov1) obj2, lnmVar, (byte) 2);
            case 3:
                return new kk((dx1) obj2, lnmVar, (byte) 3);
            case 4:
                return new kk((i42) obj2, lnmVar, (byte) 4);
            case 5:
                return new kk((ra2) obj2, lnmVar, (byte) 5);
            case 6:
                return new kk((em0) obj2, lnmVar, (byte) 6);
            case 7:
                return new kk((y7e1) obj2, lnmVar, (byte) 7);
            case 8:
                return new kk((ps3) obj2, lnmVar, (byte) 8);
            case 9:
                return new kk((hz3) obj2, lnmVar, (byte) 9);
            case 10:
                return new kk((s45) obj2, lnmVar, (byte) 10);
            case 11:
                return new kk((s6b1) obj2, lnmVar, (byte) 11);
            case 12:
                return new kk((RuntimeException) obj2, lnmVar, (byte) 12);
            case 13:
                return new kk((yv5) obj2, lnmVar, (byte) 13);
            case 14:
                return new kk((wo5) obj2, lnmVar, (byte) 14);
            case 15:
                return new kk((w46) obj2, lnmVar, (byte) 15);
            case 16:
                return new kk((vv6) obj2, lnmVar, (byte) 16);
            case 17:
                return new kk((dj7) obj2, lnmVar, (byte) 17);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new kk((bo8) obj2, lnmVar, (byte) 18);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new kk((ca9) obj2, lnmVar, (byte) 19);
            case 20:
                return new kk((ro9) obj2, lnmVar, (byte) 20);
            case 21:
                return new kk((w5f1) obj2, lnmVar, (byte) 21);
            case 22:
                return new kk((yna) obj2, lnmVar, (byte) 22);
            case 23:
                return new kk((uya) obj2, lnmVar, (byte) 23);
            case 24:
                return new kk((xya) obj2, lnmVar, (byte) 24);
            case 25:
                return new kk((it8) obj2, lnmVar, (byte) 25);
            case 26:
                return new kk((ic9) obj2, lnmVar, (byte) 26);
            case 27:
                return new kk((fb3) obj2, lnmVar, (byte) 27);
            case 28:
                return new kk((cgb) obj2, lnmVar, (byte) 28);
            default:
                return new kk((ggb) obj2, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((kk) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                ((kk) create((String) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                ((kk) create((wo1) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                ((kk) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            case 4:
                ((kk) create((j7p0) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            case 5:
                ((kk) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            case 6:
                ((kk) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            case 7:
                ((kk) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            case 8:
                ((kk) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            case 9:
                return ((kk) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 10:
                ((kk) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            case 11:
                ((kk) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            case 12:
                ((kk) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            case 13:
                ((kk) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            case 14:
                ((kk) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            case 15:
                ((kk) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            case 16:
                return ((kk) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 17:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((kk) create(bool, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return ((kk) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return ((kk) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 20:
                ((kk) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            case 21:
                ((kk) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            case 22:
                ((kk) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            case 23:
                ((kk) create((rih1) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            case 24:
                ((kk) create((rih1) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            case 25:
                ((kk) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            case 26:
                ((kk) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            case 27:
                ((kk) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            case 28:
                return ((kk) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            default:
                ((kk) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    public final Object invokeSuspend(Object obj) {
        aab1 aab1Var;
        a2c1 a2c1Var;
        Object value;
        LinkedHashMap linkedHashMap;
        Object value2;
        LinkedHashMap linkedHashMap2;
        switch (this.a) {
            case 0:
                hm5.M(obj);
                ((lk) this.b).c();
                return rih1.a;
            case 1:
                hm5.M(obj);
                ((iz0) this.b).b = false;
                return rih1.a;
            case 2:
                hm5.M(obj);
                ov1 ov1Var = (ov1) this.b;
                ov1Var.f.setValue(Boolean.TRUE);
                fsg fsgVar = (fsg) ov1Var.d.get();
                x6c0 x6c0Var = fxu0.d;
                lzn0 lzn0Var = fsgVar.b;
                dg30 dg30Var = fsgVar.a;
                if (lzn0Var.j(dg30Var)) {
                    lzn0Var.b(x6c0Var);
                } else {
                    dg30 dg30Var2 = dg30Var instanceof dg30 ? dg30Var : null;
                    th30 th30VarE0 = dg30Var2 != null ? dg30Var2.e0() : null;
                    zf30 zf30VarG = th30VarE0 != null ? th30VarE0.G("AddToPlaylistFragment") : null;
                    if (zf30VarG != null) {
                        th30VarE0.getClass();
                        nu9 nu9Var = new nu9(th30VarE0);
                        nu9Var.m(zf30VarG);
                        nu9Var.g(true, true);
                    } else {
                        fsgVar.c.b(x6c0Var);
                    }
                }
                return rih1.a;
            case 3:
                hm5.M(obj);
                ((dx1) this.b).b.a.l(gu1.a);
                return rih1.a;
            case 4:
                hm5.M(obj);
                w4b1 w4b1Var = ((i42) this.b).d;
                if (w4b1Var != null) {
                    ((e7p0) w4b1Var.b).c();
                } else {
                    Logger.k("No display strategy registered, skipping ad break experience", new Object[0]);
                }
                return rih1.a;
            case 5:
                hm5.M(obj);
                ra2 ra2Var = (ra2) this.b;
                lwq0 lwq0Var = (lwq0) ra2Var.e.invoke();
                if ((lwq0Var == null || !lwq0.a(lwq0Var)) && (aab1Var = (aab1) ra2Var.d.invoke()) != null) {
                    aab1Var.a(ra2Var.f);
                }
                return rih1.a;
            case 6:
                hm5.M(obj);
                ((e7p0) ((em0) this.b).i).c();
                return rih1.a;
            case 7:
                hm5.M(obj);
                y7e1 y7e1Var = (y7e1) this.b;
                if (y7e1Var.d().d.length() > 500) {
                    h4e1 h4e1VarH = y7e1Var.h();
                    try {
                        ihc1.b1(500, y7e1Var.d().d);
                        y7e1Var.a(h4e1VarH);
                    } finally {
                        y7e1Var.c();
                    }
                }
                return rih1.a;
            case 8:
                hm5.M(obj);
                ((ks3) ((ps3) this.b).c).d("unavailable_screen");
                return rih1.a;
            case 9:
                hz3 hz3Var = (hz3) this.b;
                hm5.M(obj);
                try {
                    Cursor cursorQuery = hz3Var.a.query(hz3Var.b, null, null, null, null);
                    if (cursorQuery == null) {
                        return hz3.b(hz3Var, 1);
                    }
                    try {
                        c2c1 c2c1VarD = hz3Var.d(cursorQuery);
                        cursorQuery.close();
                        return c2c1VarD;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            u890.p(cursorQuery, th);
                            throw th2;
                        }
                    }
                } catch (IllegalArgumentException e) {
                    Uri uri = hz3.e;
                    a2c1Var = new a2c1(5, 3, e);
                    return a2c1Var;
                } catch (SecurityException e2) {
                    Uri uri2 = hz3.e;
                    a2c1Var = new a2c1(3, 3, e2);
                    return a2c1Var;
                } catch (Exception e3) {
                    Uri uri3 = hz3.e;
                    a2c1Var = new a2c1(6, 3, e3);
                    return a2c1Var;
                }
            case 10:
                hm5.M(obj);
                s45 s45Var = (s45) this.b;
                ooe1 ooe1Var = s45Var.c;
                if (ooe1Var != null) {
                    for (pne1 pne1Var : s45Var.e.values()) {
                        pne1Var.getClass();
                        ooe1Var.b(pne1Var);
                    }
                    s45Var.e.clear();
                }
                return rih1.a;
            case 11:
                hm5.M(obj);
                ((s6b1) this.b).c();
                return rih1.a;
            case 12:
                hm5.M(obj);
                n57.q((RuntimeException) this.b);
                return rih1.a;
            case 13:
                hm5.M(obj);
                Context context = ((yv5) this.b).a;
                int i = AppRaterActivity.g1;
                context.startActivity(new Intent(context, (Class<?>) AppRaterActivity.class).addFlags(268435456));
                return rih1.a;
            case 14:
                hm5.M(obj);
                try {
                    ((f85) ((wo5) this.b).c).invoke();
                    break;
                } catch (Exception e4) {
                    n57.t("Failed to prepare AppWidgetManager", e4);
                }
                return rih1.a;
            case 15:
                hm5.M(obj);
                ((w46) this.b).invoke();
                return rih1.a;
            case 16:
                hm5.M(obj);
                vv6 vv6Var = (vv6) this.b;
                return vv6Var.n((String) vv6Var.a.a.getValue());
            case 17:
                hm5.M(obj);
                dj7 dj7Var = (dj7) this.b;
                synchronized (dj7Var.b) {
                    synchronized (dj7Var.c) {
                        synchronized (dj7Var.d) {
                            try {
                                if (!dj7Var.e) {
                                    dj7Var.a.a(dj7Var.b);
                                    dj7Var.b.clear();
                                    Iterator it = dj7Var.c.iterator();
                                    while (it.hasNext()) {
                                        dj7Var.a.b((String) it.next());
                                    }
                                    dj7Var.c.clear();
                                    Iterator it2 = dj7Var.d.iterator();
                                    while (it2.hasNext()) {
                                        dj7Var.a.c((Throwable) it2.next());
                                    }
                                    dj7Var.d.clear();
                                    dj7Var.e = true;
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                }
                return rih1.a;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                hm5.M(obj);
                return ((bo8) this.b).g.d();
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                hm5.M(obj);
                return Boolean.valueOf(((ca9) this.b).e.a().a(true));
            case 20:
                hm5.M(obj);
                ((ro9) this.b).i.setValue(Boolean.TRUE);
                return rih1.a;
            case 21:
                hm5.M(obj);
                ((w5f1) this.b).dismiss();
                return rih1.a;
            case 22:
                hm5.M(obj);
                dqu dquVar = ((yna) this.b).a.a;
                dquVar.g(1, (String) null);
                cq21 cq21Var = new cq21(0);
                xxu xxuVar = (xxu) dquVar.b;
                if (!cq21Var.equals((cq21) xxuVar.l.d)) {
                    at7 at7Var = xxuVar.l;
                    Context context2 = (Context) at7Var.f;
                    jlb jlbVar = (jlb) at7Var.g;
                    jlbVar.getClass();
                    context2.unregisterReceiver(jlbVar);
                    at7Var.g = null;
                    if (((eq21) at7Var.h) != null) {
                        ConnectivityManager connectivityManager = (ConnectivityManager) context2.getSystemService("connectivity");
                        connectivityManager.getClass();
                        eq21 eq21Var = (eq21) at7Var.h;
                        eq21Var.getClass();
                        connectivityManager.unregisterNetworkCallback((ConnectivityManager.NetworkCallback) eq21Var);
                        at7Var.h = null;
                    }
                    at7 at7Var2 = new at7(xxuVar.a, xxuVar.d, cq21Var);
                    xxuVar.l = at7Var2;
                    xxuVar.b(xxuVar.l, at7Var2.l());
                }
                xxuVar.getClass();
                if (xxuVar.h != 1) {
                    xxuVar.h = (byte) 1;
                    xxuVar.f++;
                    xxuVar.c.obtainMessage(5, 1, 0).sendToTarget();
                }
                return rih1.a;
            case 23:
                hm5.M(obj);
                uya uyaVar = (uya) this.b;
                bpb1 bpb1Var = uyaVar.g;
                do {
                    value = bpb1Var.getValue();
                    linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : ((Map) value).entrySet()) {
                        if (uyaVar.d.b() < ((nya) entry.getValue()).b + ((long) uyaVar.c.c())) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                } while (!bpb1Var.k(value, linkedHashMap));
                return rih1.a;
            case 24:
                hm5.M(obj);
                xya xyaVar = (xya) this.b;
                bpb1 bpb1Var2 = xyaVar.f;
                do {
                    value2 = bpb1Var2.getValue();
                    linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry entry2 : ((Map) value2).entrySet()) {
                        if (xyaVar.c.b() < ((gi9) entry2.getValue()).f + ((long) ((Number) xyaVar.b.j.b()).intValue())) {
                            linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                } while (!bpb1Var2.k(value2, linkedHashMap2));
                return rih1.a;
            case 25:
                hm5.M(obj);
                it8 it8Var = (it8) this.b;
                ((i8h1) it8Var.b).f(((otk0) it8Var.c).e(), (Set) null);
                return rih1.a;
            case 26:
                hm5.M(obj);
                ic9 ic9Var = (ic9) this.b;
                ((i8h1) ic9Var.b).f(((otk0) ic9Var.c).e(), (Set) null);
                return rih1.a;
            case 27:
                hm5.M(obj);
                q59 q59Var = (q59) ((fb3) this.b).c;
                ((i8h1) q59Var.b).f(((otk0) q59Var.c).e(), (Set) null);
                return rih1.a;
            case 28:
                hm5.M(obj);
                cgb cgbVar = (cgb) this.b;
                bma1 bma1Var = cgb.i;
                return cgbVar.a();
            default:
                hm5.M(obj);
                Iterator it3 = ((Set) ((ggb) this.b).c.getValue()).iterator();
                while (it3.hasNext()) {
                    ((akb) it3.next()).start();
                }
                return rih1.a;
        }
    }
}
