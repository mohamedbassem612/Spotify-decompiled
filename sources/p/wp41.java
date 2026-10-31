package p;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import androidx.glance.session.SessionWorker;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.PlayerState;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.io.File;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wp41 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wp41(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                wp41 wp41Var = new wp41((xp41) obj2, lnmVar, (byte) 0);
                wp41Var.b = obj;
                return wp41Var;
            case 1:
                wp41 wp41Var2 = new wp41((z72) obj2, lnmVar, (byte) 1);
                wp41Var2.b = obj;
                return wp41Var2;
            case 2:
                return new wp41((iu30) this.b, (c220) obj2, lnmVar, (byte) 2);
            case 3:
                wp41 wp41Var3 = new wp41((zu51) obj2, lnmVar, (byte) 3);
                wp41Var3.b = obj;
                return wp41Var3;
            case 4:
                wp41 wp41Var4 = new wp41((SessionWorker) obj2, lnmVar, (byte) 4);
                wp41Var4.b = obj;
                return wp41Var4;
            case 5:
                return new wp41((r961) this.b, (String) obj2, lnmVar, (byte) 5);
            case 6:
                return new wp41((xtb0) this.b, (Function0) obj2, lnmVar, (byte) 6);
            case 7:
                return new wp41((ne) this.b, (Intent) obj2, lnmVar, (byte) 7);
            case 8:
                return new wp41((xs71) this.b, (ys71) obj2, lnmVar, (byte) 8);
            case 9:
                return new wp41((iw71) this.b, (qw71) obj2, lnmVar, (byte) 9);
            case 10:
                return new wp41((rw71) this.b, (dx71) obj2, lnmVar, (byte) 10);
            case 11:
                wp41 wp41Var5 = new wp41((r5l) obj2, lnmVar, (byte) 11);
                wp41Var5.b = ((e331) obj).a;
                return wp41Var5;
            case 12:
                return new wp41((nn61) this.b, (bfw) obj2, lnmVar, (byte) 12);
            case 13:
                return new wp41((ke71) this.b, (dfw) obj2, lnmVar, (byte) 13);
            case 14:
                return new wp41((r961) this.b, (er91) obj2, lnmVar, (byte) 14);
            case 15:
                return new wp41((ke71) this.b, (gfw) obj2, lnmVar, (byte) 15);
            case 16:
                wp41 wp41Var6 = new wp41((k981) obj2, lnmVar, (byte) 16);
                wp41Var6.b = obj;
                return wp41Var6;
            case 17:
                wp41 wp41Var7 = new wp41((uhk1) obj2, lnmVar, (byte) 17);
                wp41Var7.b = obj;
                return wp41Var7;
            case 18:
                wp41 wp41Var8 = new wp41((n381) obj2, lnmVar, (byte) 18);
                wp41Var8.b = obj;
                return wp41Var8;
            case 19:
                wp41 wp41Var9 = new wp41((vi11) obj2, lnmVar, (byte) 19);
                wp41Var9.b = obj;
                return wp41Var9;
            case 20:
                wp41 wp41Var10 = new wp41((mob1) obj2, lnmVar, (byte) 20);
                wp41Var10.b = obj;
                return wp41Var10;
            case 21:
                return new wp41((qr91) this.b, (er91) obj2, lnmVar, (byte) 21);
            case 22:
                return new wp41((wen0) this.b, (x8a1) obj2, lnmVar, (byte) 22);
            case 23:
                return new wp41((uoa) this.b, (ven0) obj2, lnmVar, (byte) 23);
            case 24:
                return new wp41((WebView) this.b, (String) obj2, lnmVar, (byte) 24);
            case 25:
                wp41 wp41Var11 = new wp41((kza1) obj2, lnmVar, (byte) 25);
                wp41Var11.b = obj;
                return wp41Var11;
            case 26:
                wp41 wp41Var12 = new wp41((v1b1) obj2, lnmVar, (byte) 26);
                wp41Var12.b = obj;
                return wp41Var12;
            case 27:
                return new wp41((s2b1) this.b, (Context) obj2, lnmVar, (byte) 27);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return new wp41((t6b1) this.b, (Context) obj2, lnmVar, (byte) 28);
            default:
                return new wp41((xb10) this.b, (res) obj2, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((tv80) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                create((m251) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((bg61) obj, (lnm) obj2).invokeSuspend(rih1Var);
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
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 9:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 10:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 11:
                Object obj3 = ((e331) obj).a;
                wp41 wp41Var = new wp41((r5l) this.c, (lnm) obj2, (byte) 11);
                wp41Var.b = obj3;
                return wp41Var.invokeSuspend(rih1Var);
            case 12:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 13:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 14:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 15:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 16:
                create((String) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 17:
                create((hwt) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 18:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 19:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 20:
                return create((mob1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 22:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 23:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 24:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 25:
                create((mmr0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 26:
                create((e961) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 27:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x021a  */
    public final Object invokeSuspend(Object obj) {
        String strA;
        boolean z;
        int i;
        int i2;
        boolean zEquals;
        boolean zEquals2;
        String string;
        String string2;
        String string3;
        Integer numValueOf;
        n3c n3cVar;
        String str;
        boolean zBooleanValue;
        ne neVar;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        u7h u7hVarQ;
        switch (this.a) {
            case 0:
                tv80 tv80Var = (tv80) this.b;
                hm5.M(obj);
                if (((Boolean) ((xp41) this.c).d.getValue()).booleanValue()) {
                    return new yxk1(tv80Var);
                }
                return null;
            case 1:
                m251 m251Var = (m251) this.b;
                hm5.M(obj);
                bpb1 bpb1Var = (bpb1) ((z72) this.c).X;
                m251 m251Var2 = new m251(m251Var.a, m251Var.b);
                bpb1Var.getClass();
                bpb1Var.m((Object) null, m251Var2);
                return rih1.a;
            case 2:
                hm5.M(obj);
                ((iu30) this.b).invoke(((c220) this.c).a);
                return rih1.a;
            case 3:
                c9n c9nVar = (c9n) this.b;
                hm5.M(obj);
                zu51 zu51Var = (zu51) this.c;
                fn31.T(c9nVar, (o8n) null, 0, new yu51(zu51Var, (lnm) null, (byte) 1), 3);
                return fn31.T(c9nVar, (o8n) null, 0, new yu51(zu51Var, (lnm) null, (byte) 2), 3);
            case 4:
                hm5.M(obj);
                return (cy5) ((bg61) this.b).a.get(((SessionWorker) this.c).k);
            case 5:
                hm5.M(obj);
                r961 r961Var = (r961) this.b;
                i8h1 i8h1Var = (i8h1) r961Var.b;
                ksk0 ksk0Var = (ksk0) r961Var.d;
                String str2 = (String) this.c;
                x6h1 x6h1VarC = ksk0Var.c.c();
                x6h1VarC.i.add(new a7h1("empty_view", (String) null, (Integer) null, (String) null, str2));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).b = ksk0Var.b;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var.e = ksk0Var.d;
                i8h1Var.f(k7h1Var.a(), (Set) null);
                return rih1.a;
            case 6:
                hm5.M(obj);
                if (((xtb0) this.b).j.b()) {
                    ((Function0) this.c).invoke();
                }
                return rih1.a;
            case 7:
                hm5.M(obj);
                ((dg30) ((ne) this.b).a).startActivityForResult((Intent) this.c, 0);
                return rih1.a;
            case 8:
                hm5.M(obj);
                xs71 xs71Var = (xs71) this.b;
                if (xs71Var.b().isEmpty()) {
                    xs71Var.b.i.remove(xs71Var.a);
                }
                return rih1.a;
            case 9:
                hm5.M(obj);
                ((iw71) this.b).e.h(((qw71) this.c).a);
                return rih1.a;
            case 10:
                dx71 dx71Var = (dx71) this.c;
                hm5.M(obj);
                int i3 = ((rw71) this.b).a;
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{Integer.valueOf(i3)});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                er91 er91Var = new er91((fs91) null, "", Integer.valueOf(i3), (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
                kt91 kt91Var = dx71Var.b;
                if (kt91Var.g()) {
                    kt91Var.k(er91Var);
                } else {
                    kt91Var.o(er91Var);
                }
                return rih1.a;
            case 11:
                Object obj2 = this.b;
                hm5.M(obj);
                Integer num = (Integer) (obj2 instanceof m231 ? null : obj2);
                return (num == null || num.intValue() >= 5) ? t181.a : new u181(((r5l) this.c).a);
            case 12:
                hm5.M(obj);
                vgm vgmVar = (vgm) ((nn61) this.b).b;
                bfw bfwVar = (bfw) this.c;
                vgm.b(vgmVar, bfwVar.a, (String) null, bfwVar.b, new tgm((String) null, false, false, false, false, false, false, (yh10) null, false, false, 0, false, false, false, false, false, (iu30) null, false, false, (g371) null, (c821) null, false, (String) null, (iu30) null, (p860) null, (mgo0) null, false, false, -1, 1), 2);
                return rih1.a;
            case 13:
                hm5.M(obj);
                vgm vgmVar2 = (vgm) ((ke71) this.b).b;
                dfw dfwVar = (dfw) this.c;
                vgm.b(vgmVar2, dfwVar.a, (String) null, dfwVar.b, new tgm((String) null, false, false, false, false, false, false, (yh10) null, false, false, 0, false, false, false, false, false, (iu30) null, false, false, (g371) null, (c821) null, false, (String) null, (iu30) null, (p860) null, (mgo0) null, false, false, -1, 1), 2);
                return rih1.a;
            case 14:
                hm5.M(obj);
                ((kt91) ((r961) this.b).c).k((er91) this.c);
                return rih1.a;
            case 15:
                hm5.M(obj);
                ((wr00) ((ke71) this.b).b).a(((gfw) this.c).a);
                return rih1.a;
            case 16:
                hm5.M(obj);
                return rih1.a;
            case 17:
                hwt hwtVar = (hwt) this.b;
                hm5.M(obj);
                ((uhk1) this.c).a = hwtVar.f && !hwtVar.e && hwtVar.d;
                return rih1.a;
            case 18:
                c9n c9nVar2 = (c9n) this.b;
                hm5.M(obj);
                n381 n381Var = (n381) this.c;
                fn31.T(c9nVar2, (o8n) null, 0, new vse0(n381Var, (lnm) null, (byte) 20), 3);
                return fn31.T(c9nVar2, (o8n) null, 0, new b751(n381Var, (lnm) null, (byte) 24), 3);
            case 19:
                c9n c9nVar3 = (c9n) this.b;
                hm5.M(obj);
                vi11 vi11Var = (vi11) this.c;
                fn31.T(c9nVar3, (o8n) null, 0, new vse0(vi11Var, (lnm) null, (byte) 21), 3);
                fn31.T(c9nVar3, (o8n) null, 0, new lu81(vi11Var, (lnm) null, (byte) 1), 3);
                return fn31.T(c9nVar3, (o8n) null, 0, new lu81(vi11Var, (lnm) null, (byte) 2), 3);
            case 20:
                hm5.M(obj);
                mob1 mob1Var = (mob1) this.b;
                mob1 mob1Var2 = (mob1) this.c;
                return Boolean.valueOf(((mob1Var2 instanceof kwq) || (mob1Var2 instanceof zf20) || mob1Var != mob1Var2) ? false : true);
            case 21:
                hm5.M(obj);
                qr91 qr91Var = (qr91) this.b;
                qr91Var.c.d.c.getLifecycle().a(new zh0(qr91Var, (er91) this.c, (byte) 10));
                return rih1.a;
            case 22:
                hm5.M(obj);
                bpb1 bpb1Var2 = (wen0) this.b;
                c380<sic1> c380Var = ((x8a1) this.c).c;
                ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
                for (sic1 sic1Var : c380Var) {
                    arrayList.add(new h8k1(sic1Var, sic1Var));
                }
                bpb1 bpb1Var3 = bpb1Var2;
                bpb1Var3.getClass();
                bpb1Var3.m((Object) null, arrayList);
                return rih1.a;
            case 23:
                uoa uoaVar = (uoa) this.b;
                hm5.M(obj);
                if (((Boolean) ((ven0) this.c).getValue()).booleanValue()) {
                    uoaVar.f();
                    uoaVar.p(3);
                }
                return rih1.a;
            case 24:
                hm5.M(obj);
                ((WebView) this.b).loadUrl((String) this.c);
                return rih1.a;
            case 25:
                mmr0 mmr0Var = (mmr0) this.b;
                hm5.M(obj);
                ji0 ji0Var = (ji0) mmr0Var.a;
                String strContextUri = ((PlayerState) mmr0Var.b).contextUri();
                if (strContextUri == null) {
                    strContextUri = "";
                }
                boolean zB = ((kza1) this.c).a.b(strContextUri);
                if (ji0Var.W0.equals("sponsored_playlist") != zB) {
                    xn0 xn0Var = ((kza1) this.c).d;
                    String str3 = ji0Var.h;
                    boolean zEquals3 = ji0Var.W0.equals("sponsored_playlist");
                    fza1 fza1Var = ((kza1) this.c).a;
                    boolean z2 = fza1Var.f;
                    boolean z3 = fza1Var.e != null;
                    Long l = fza1Var.i;
                    Long lValueOf = l != null ? Long.valueOf((fza1Var.c.e() - l.longValue()) / 1000) : null;
                    boolean z4 = fza1Var.j;
                    String str4 = fza1Var.k;
                    y1b1 y1b1Var = fza1Var.e;
                    boolean z5 = (y1b1Var != null ? y1b1Var.a(strContextUri) : null) != null;
                    y1b1 y1b1Var2 = fza1Var.e;
                    n1b1 n1b1VarA = y1b1Var2 != null ? y1b1Var2.a(strContextUri) : null;
                    if (n1b1VarA != null) {
                        v1b1 v1b1Var = fza1Var.a;
                        long jE = (v1b1Var.b.e() / 1000) + v1b1Var.c;
                        Long l2 = n1b1VarA.a;
                        if (l2 == null || l2.longValue() <= jE) {
                            Long l3 = n1b1VarA.b;
                            i2 = (l3 == null || l3.longValue() > jE) ? 1 : 3;
                        } else {
                            i2 = 2;
                        }
                        z = z4;
                        i = i2;
                    } else {
                        z = z4;
                        i = 0;
                    }
                    xn0Var.a(new gza1("Context uri:" + strContextUri + ", isSponsored:" + zB + ", showing ad lineItemId:" + str3 + ", isSponsored:" + zEquals3 + ", " + new q1b1(z2, z3, lValueOf, z, str4, z5, i), ji0Var.a, ji0Var.h, ji0Var.t, ji0Var.Y0.a));
                }
                kza1 kza1Var = (kza1) this.c;
                if (ji0Var.W0.equals("sponsored_playlist") && zB) {
                    String str5 = ji0Var.c;
                    if (str5.length() != 0 && (strA = kza1Var.a.a(strContextUri)) != null) {
                        String str6 = strA.length() == 0 ? null : strA;
                        if (str6 != null && !str5.equals(str6)) {
                            kza1Var.d.a(new gza1(rjx.o(gvg.n("Wrong sponsored context: playing ad for \"", str5, "\" (lineItemId:", ji0Var.h, ") in context sponsored by \""), str6, "\" (contextUri:", strContextUri, ")"), ji0Var.a, ji0Var.h, ji0Var.t, ji0Var.Y0.a));
                        }
                    }
                }
                return rih1.a;
            case 26:
                e961 e961Var = (e961) this.b;
                hm5.M(obj);
                spq0 spq0VarCall = e961Var.call();
                if (spq0VarCall.c()) {
                    v1b1 v1b1Var2 = (v1b1) this.c;
                    v1b1Var2.c = ((Number) spq0VarCall.b()).longValue() - (v1b1Var2.b.e() / 1000);
                }
                return rih1.a;
            case 27:
                hm5.M(obj);
                u3c u3cVar = (u3c) ((s2b1) this.b).a.get();
                r2b1 r2b1Var = (r2b1) ((s2b1) this.b).b.get();
                d2n0 d2n0Var = (d2n0) ((s2b1) this.b).c.get();
                if (!hzd1.a) {
                    u3cVar.getClass();
                    i1k0.u(new fna(u3cVar, (byte) 3));
                    i1k0.w();
                    i1k0.v();
                    i1k0.q("!SDK-VERSION-STRING!:io.branch.sdk.android:library:5.21.2");
                }
                u3cVar.getClass();
                n3c.e(true);
                n3c.s = true;
                n3c.q("https://links.tospotify.com");
                Context context = (Context) this.c;
                String strY = "key_live_pfaVQo61xda7Zq1zC1ca3igayxarnljw";
                if (n3c.t == null) {
                    i3b i3bVarC = i3b.c(context);
                    if (i3bVarC.g()) {
                        Boolean bool = Boolean.TRUE;
                        if (i3bVarC.h(5)) {
                            try {
                                boolValueOf2 = Boolean.valueOf(((JSONObject) i3bVarC.b).getBoolean("enableLogging"));
                            } catch (JSONException e) {
                                e.getMessage();
                                boolValueOf2 = Boolean.FALSE;
                            }
                        } else {
                            boolValueOf2 = null;
                        }
                        zEquals = bool.equals(boolValueOf2);
                    } else {
                        zEquals = false;
                    }
                    if (zEquals) {
                        i1k0.u((fna) null);
                        i1k0.w();
                        i1k0.v();
                        i1k0.q("!SDK-VERSION-STRING!:io.branch.sdk.android:library:5.21.2");
                    }
                    i3b i3bVarC2 = i3b.c(context);
                    if (i3bVarC2.g()) {
                        Boolean bool2 = Boolean.TRUE;
                        if (i3bVarC2.h(6)) {
                            try {
                                boolValueOf = Boolean.valueOf(((JSONObject) i3bVarC2.b).getBoolean("deferInitForPluginRuntime"));
                            } catch (JSONException e2) {
                                e2.getMessage();
                                boolValueOf = Boolean.FALSE;
                            }
                        } else {
                            boolValueOf = null;
                        }
                        zEquals2 = bool2.equals(boolValueOf);
                    } else {
                        zEquals2 = false;
                    }
                    i1k0.B("deferInitForPluginRuntime " + zEquals2);
                    n3c.u = zEquals2;
                    if (zEquals2) {
                        n3c.e(true);
                        if (n3c.h() != null) {
                            n3c.h().e.getClass();
                            n3c n3cVarH = n3c.h();
                            if (n3cVarH != null && (neVar = n3cVarH.b) != null) {
                                ((SharedPreferences.Editor) neVar.b).putBoolean("bnc_defer_init_for_plugin_runtime", true).apply();
                            }
                        }
                    }
                    JSONObject jSONObject = (JSONObject) i3b.c(context).b;
                    if (jSONObject != null) {
                        try {
                            string = jSONObject.has("apiUrl") ? jSONObject.getString("apiUrl") : null;
                        } catch (JSONException e3) {
                            e3.getMessage();
                        }
                    }
                    if (!TextUtils.isEmpty(string)) {
                        n3c.q(string);
                    }
                    JSONObject jSONObject2 = (JSONObject) i3b.c(context).b;
                    if (jSONObject2 != null) {
                        try {
                            string2 = jSONObject2.has("fbAppId") ? jSONObject2.getString("fbAppId") : null;
                        } catch (JSONException e4) {
                            e4.getMessage();
                        }
                    }
                    if (!TextUtils.isEmpty(string2)) {
                        n3c.t(string2);
                    }
                    JSONObject jSONObject3 = (JSONObject) i3b.c(context).b;
                    if (jSONObject3 != null) {
                        try {
                            string3 = jSONObject3.has("cppLevel") ? jSONObject3.getString("cppLevel") : null;
                        } catch (JSONException e5) {
                            e5.getMessage();
                        }
                    }
                    if (!TextUtils.isEmpty(string3)) {
                        n3c.h().s(gvg.E(string3));
                    }
                    i3b i3bVarC3 = i3b.c(context);
                    StringBuilder sb = new StringBuilder("getInstallReferrerFetchTimeout ");
                    JSONObject jSONObject4 = (JSONObject) i3bVarC3.b;
                    sb.append(jSONObject4);
                    i1k0.B(sb.toString());
                    if (jSONObject4 == null) {
                        numValueOf = null;
                    } else {
                        try {
                            if (jSONObject4.has("installReferrerFetchTimeout")) {
                                numValueOf = Integer.valueOf(jSONObject4.getInt("installReferrerFetchTimeout"));
                            } else {
                                numValueOf = null;
                            }
                        } catch (JSONException e6) {
                            e6.getMessage();
                        }
                    }
                    if (numValueOf != null && numValueOf.intValue() >= 0) {
                        ((SharedPreferences.Editor) ne.z(context).b).putInt("bnc_install_referrer_timeout", numValueOf.intValue()).apply();
                    }
                    if (!cwl1.a && cwl1.b == null) {
                        i3b i3bVarC4 = i3b.c(context);
                        if (i3bVarC4.h(4)) {
                            Boolean boolE = i3bVarC4.e();
                            zBooleanValue = boolE != null ? boolE.booleanValue() : false;
                            cwl1.a = zBooleanValue;
                        } else {
                            zBooleanValue = cwl1.a;
                            try {
                                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                                Bundle bundle = applicationInfo.metaData;
                                if (bundle == null || !bundle.containsKey("io.branch.sdk.TestMode")) {
                                    Resources resources = context.getResources();
                                    zBooleanValue = Boolean.parseBoolean(resources.getString(resources.getIdentifier("io.branch.sdk.TestMode", "string", context.getPackageName())));
                                } else {
                                    zBooleanValue = applicationInfo.metaData.getBoolean("io.branch.sdk.TestMode", false);
                                }
                                break;
                            } catch (Exception unused) {
                            }
                            cwl1.a = zBooleanValue;
                        }
                        cwl1.b = Boolean.valueOf(zBooleanValue);
                    }
                    boolean z6 = cwl1.a;
                    cwl1.a = z6;
                    if (!"key_live_pfaVQo61xda7Zq1zC1ca3igayxarnljw".startsWith(z6 ? "key_test_" : "key_")) {
                        i1k0.C("Warning, Invalid branch key passed! Branch key will be read from manifest instead!");
                        strY = cwl1.Y(context);
                    }
                    synchronized (n3c.class) {
                        if (n3c.t != null) {
                            i1k0.C("Warning, attempted to reinitialize Branch SDK singleton!");
                            n3cVar = n3c.t;
                        } else {
                            n3c.t = new n3c(context.getApplicationContext());
                            if (TextUtils.isEmpty(strY)) {
                                i1k0.C("Warning: Please enter your branch_key in your project's Manifest file!");
                                n3c.t.b.R("bnc_no_value");
                            } else {
                                n3c.t.b.R(strY);
                                if (!strY.equals(cwl1.Y(context))) {
                                    n3c.t.b.Z("bnc_branch_key_source", "init_function");
                                }
                            }
                            if (context instanceof Application) {
                                n3c.t.r((Application) context);
                            }
                            n3cVar = n3c.t;
                        }
                    }
                    n3c.t = n3cVar;
                    if (n3cVar != null) {
                        try {
                            str = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, "io.branch.preinstall.apps.path");
                        } catch (Exception unused2) {
                            str = null;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            new Thread((Runnable) new uu1(str, n3cVar, context, (byte) 4)).start();
                        }
                    }
                    break;
                }
                n3c n3cVar2 = n3c.t;
                if (!hzd1.a) {
                    n3c.x = u3cVar.b;
                }
                Bundle bundle2 = (Bundle) new kf10((Context) this.c).b.getValue();
                String string4 = bundle2 != null ? bundle2.getString("com.facebook.sdk.ApplicationId") : null;
                if (string4 == null) {
                    string4 = "";
                }
                n3c.t(string4);
                d2n0Var.getClass();
                ((SharedPreferences.Editor) ne.z(n3cVar2.d).b).putBoolean("bnc_ad_network_callouts_disabled", false).apply();
                JSONObject jSONObject5 = (JSONObject) n3cVar2.b.c;
                jSONObject5.has("APP");
                try {
                    jSONObject5.put("APP", "Spotify App");
                    break;
                } catch (JSONException unused3) {
                }
                PublishSubject publishSubject = r2b1Var.j;
                rih1 rih1Var = rih1.a;
                publishSubject.onNext(rih1Var);
                r2b1Var.k.c();
                return rih1Var;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                hm5.M(obj);
                Context context2 = (Context) this.c;
                bma1 bma1Var = t6b1.t;
                for (File file : context2.getExternalCacheDirs()) {
                    if (file != null) {
                        Logger.g("Cache dir=%s", new Object[]{file.getAbsolutePath()});
                    }
                }
                t6b1.h(context2);
                return rih1.a;
            default:
                rih1 rih1Var2 = rih1.a;
                hm5.M(obj);
                smr0 smr0VarA = ((xb10) this.b).a();
                if (smr0VarA != null && (u7hVarQ = ywo1.q(smr0VarA)) != null) {
                    ((wen0) ((res) this.c).e).m((Object) null, new Integer(z4p1.G(mue1.v(u7hVarQ.a))));
                }
                return rih1Var2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wp41(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
    }
}
