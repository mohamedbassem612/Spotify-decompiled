package p;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class o8e1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8e1(hek1 hek1Var, iu30 iu30Var, pt ptVar, ven0 ven0Var) {
        super(0);
        this.a = (byte) 22;
        this.b = hek1Var;
        this.c = iu30Var;
        this.d = ven0Var;
    }

    public final Object invoke() {
        abu0 abu0Var;
        switch (this.a) {
            case 0:
                mjh mjhVar = (mjh) this.b;
                String str = ((k8e1) this.c).d;
                o0i o0iVar = (o0i) this.d;
                if (!ihc1.y0(str)) {
                    ((lzn0) mjhVar.d).a(str, bcl1.f(mjhVar.b, o0iVar.e, "text_header_body", zmo1.s(str), (String) null, new hqa1(str, (byte) 20), 8), (Bundle) null);
                }
                return rih1.a;
            case 1:
                if (((pxk0) this.b) != null) {
                    ((ven0) this.d).setValue(Boolean.TRUE);
                } else {
                    ((Function0) this.c).invoke();
                }
                return rih1.a;
            case 2:
                ven0 ven0Var = (ven0) this.d;
                lte1 lte1Var = (lte1) this.b;
                ven0Var.setValue(lte1Var.d != null ? Boolean.valueOf(lte1Var.e) : null);
                ((Function0) this.c).invoke();
                return rih1.a;
            case 3:
                String str2 = (String) ((iu30) this.c).invoke(Integer.valueOf(((err0) ((xtb0) this.b).e.b).s()));
                int length = str2.length();
                ven0 ven0Var2 = (ven0) this.d;
                if (length <= 0) {
                    return (String) ven0Var2.getValue();
                }
                ven0Var2.setValue(str2);
                return str2;
            case 4:
                q2f1 q2f1Var = (q2f1) this.c;
                xtb0 xtb0Var = ((z2f1) this.b).d;
                qtb0 qtb0Var = (qtb0) o7h.s0(xtb0Var.h().l);
                if (!u890.j(qtb0Var != null ? qtb0Var.l : null, "list_ux_platform_header") || q2f1Var.e) {
                    return Float.valueOf(1.0f);
                }
                float fX0 = ((wat) this.d).X0(64.0f);
                float f = q2f1Var.c - (q2f1Var.d ? 2.0f * fX0 : 0.0f);
                float f2 = fX0 / 2.0f;
                float f3 = f - f2;
                if (f3 < 0.0f) {
                    f3 = 0.0f;
                }
                float f4 = f + f2;
                if (f4 >= fX0) {
                    fX0 = f4;
                }
                return Float.valueOf(yoi1.o((((err0) xtb0Var.e.c).s() - f3) / (fX0 - f3), 0.0f, 1.0f));
            case 5:
                return Float.valueOf(((hjn) ((ven0) this.c).getValue()) == null ? ((drr0) this.d).s() : ((Number) ((tob1) this.b).getValue()).floatValue());
            case 6:
                if (((j7s) this.b).b) {
                    sam1.b((qam1) this.c);
                }
                ((Function0) this.d).invoke();
                return rih1.a;
            case 7:
                ((hrr0) this.b).setValue(((g7m1) this.c).d);
                ((hrr0) this.d).setValue(Boolean.TRUE);
                return rih1.a;
            case 8:
                mjh mjhVar2 = (mjh) this.b;
                bcl1 bcl1Var = mjhVar2.b;
                hp80 hp80Var = ((o0i) this.d).e;
                zlf1 zlf1Var = (zlf1) this.c;
                tv80 tv80VarF = bcl1.f(bcl1Var, hp80Var, "track_context_menu_button", zlf1Var.a.a, (String) null, udf1.U0, 8);
                ssf1 ssf1Var = (ssf1) mjhVar2.c;
                String str3 = zlf1Var.a.a;
                lik1 lik1Var = (lik1) mjhVar2.d;
                ssf1Var.b(new dmf1(str3, lik1Var, lik1Var.a, new vsf1((String) null, (String) null, false, (String) null, zlf1Var.d.length() > 0, false, true, false, false, true, (String) null, false, false, false, true, false, (ugo0) null, (ok51) null, false, (g371) null, false, false, false, false, false, false, false, false, (p860) null, (String) null, false, false, -33873, 63), (Map) null), tv80VarF);
                return rih1.a;
            case 9:
                cce cceVar = ((o2g1) this.b).X0;
                e1h e1hVar = (e1h) this.c;
                int i = e1hVar.c;
                String str4 = e1hVar.b.a;
                i8h1 i8h1Var = (i8h1) cceVar.b;
                x6h1 x6h1VarC = ((bqk0) cceVar.c).b.c();
                x6h1VarC.i.add(new a7h1("item_list", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                Integer numValueOf = Integer.valueOf(i);
                x6h1 x6h1VarC2 = y6h1VarA.c();
                x6h1VarC2.i.add(new a7h1("item", (String) null, numValueOf, str4, (String) null));
                x6h1VarC2.j = false;
                ((qka) this.d).invoke(new u1h(e1hVar, i8h1Var.m(new w7h1("", "", new z7h1("swipe", 1, b7x.a), new x7h1("add_item_to_queue", 1, Collections.singletonMap("item_to_add_to_queue", str4)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a));
                return rih1.a;
            case 10:
                r3g1 r3g1Var = (r3g1) this.b;
                r3g1Var.d = (ArrayList) this.c;
                Iterator it = ((ArrayList) this.d).iterator();
                while (it.hasNext()) {
                    r3g1Var.i(((Number) it.next()).intValue());
                }
                return rih1.a;
            case 11:
                r3g1 r3g1Var2 = (r3g1) this.b;
                r3g1Var2.d = (ArrayList) this.c;
                ((j4u) ((dg8) this.d).b).b(r3g1Var2);
                return rih1.a;
            case 12:
                Integer num = ((wcg1) this.b).b;
                if (num != null) {
                    fn31.T((c9n) this.c, (o8n) null, 0, new x0e((xtb0) this.d, num.intValue(), (lnm) null, (byte) 4), 3);
                }
                return rih1.a;
            case 13:
                ((ven0) this.d).setValue((Object) null);
                ((iu30) this.b).invoke((lbh1) this.c);
                return rih1.a;
            case 14:
                i8h1 i8h1Var2 = (i8h1) ((xq81) this.b).b;
                jrl0 jrl0Var = (jrl0) this.c;
                jrl0Var.getClass();
                x6h1 x6h1VarC3 = jrl0Var.a.c();
                x6h1VarC3.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                y6h1 y6h1VarA2 = x6h1VarC3.a();
                b7x b7xVar = b7x.a;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA2, r6h1.c, System.currentTimeMillis()), (xj61) null);
                ((Function0) this.d).invoke();
                return rih1.a;
            case 15:
                ((ven0) this.d).setValue(Boolean.FALSE);
                ((Function0) this.b).invoke();
                ((Context) this.c).startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://support.spotify.com/article/ai-usage-limits/")).addFlags(268435456));
                return rih1.a;
            case 16:
                ((w7i1) this.b).a.g((String) this.c, (hmf) this.d);
                return rih1.a;
            case 17:
                n9i1 n9i1Var = (n9i1) this.b;
                i8h1 i8h1Var3 = n9i1Var.a;
                x6h1 x6h1VarC4 = n9i1Var.d.b.c();
                x6h1VarC4.i.add(new a7h1("disclaimer_dialogue", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                x6h1 x6h1VarC5 = x6h1VarC4.a().c();
                x6h1VarC5.i.add(new a7h1("disclaimer_checkbox", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = false;
                y6h1 y6h1VarA3 = x6h1VarC5.a();
                b7x b7xVar2 = b7x.a;
                i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar2), new x7h1("ui_select", 1, b7xVar2), y6h1VarA3, r6h1.c, System.currentTimeMillis()), (xj61) null);
                w9i1 w9i1Var = (w9i1) this.c;
                boolean z = !((Boolean) ((ven0) this.d).getValue()).booleanValue();
                synchronized (w9i1Var.x1) {
                    if (!w9i1Var.w1 && !w9i1Var.C1) {
                        bpb1 bpb1Var = w9i1Var.i1;
                        Boolean boolValueOf = Boolean.valueOf(z);
                        bpb1Var.getClass();
                        bpb1Var.m((Object) null, boolValueOf);
                    }
                    break;
                }
                return rih1.a;
            case 18:
                az20.a((az20) this.b);
                b6t b6tVar = (k6a1) this.c;
                if (b6tVar != null) {
                    b6tVar.a();
                }
                ((DatePickerDialog) this.d).show();
                return rih1.a;
            case 19:
                fn31.T((c9n) this.b, (o8n) null, 0, new g((vy71) this.c, (lnm) null, (byte) 21), 3).L(new ceg1((iu30) this.d, (byte) 8));
                return rih1.a;
            case 20:
                xtm0 xtm0VarA = ((vtm0) this.b).a((a9l1) this.c);
                VideoSurfaceView videoSurfaceView = ((ffj1) this.d).a;
                if (videoSurfaceView != null) {
                    xtm0VarA.f = videoSurfaceView;
                    videoSurfaceView.setBufferingThrobberEnabled(false);
                    r091 r091Var = xtm0VarA.e;
                    if (r091Var != null) {
                        r091Var.i(videoSurfaceView);
                    }
                }
                return xtm0VarA;
            case 21:
                fn31.T((c9n) this.b, (o8n) null, 0, new yqm((o95) this.c, (o95) this.d, (lnm) null, (byte) 2), 3);
                return rih1.a;
            case 22:
                hek1 hek1Var = (hek1) this.b;
                boolean z2 = hek1Var.a && hek1Var.g && hek1Var.f;
                iu30 iu30Var = (iu30) this.c;
                if (z2) {
                    iu30Var.invoke(eek1.a);
                } else {
                    iu30Var.invoke(cek1.a);
                    if (pt.G(hek1Var)) {
                        ((ven0) this.d).setValue(Boolean.TRUE);
                    }
                }
                return rih1.a;
            case 23:
                ((ven0) this.d).setValue(Boolean.FALSE);
                ((px2) this.b).c.m((Object) null, (Locale) this.c);
                return rih1.a;
            case 24:
                psk1 psk1Var = (psk1) this.b;
                double d = psk1Var.a;
                xsk1 xsk1Var = (xsk1) this.c;
                ((p811) this.d).a = Next.i(xsk1.a(xsk1Var, (Double) null, Double.valueOf(psk1Var.a), (l0l) null, 0, (h06) null, false, 0, false, (Map) null, (Set) null, 2045), Effects.a(new jrk1[]{new jrk1("system_volume_observer", d, xsk1Var.b, xsk1Var.d)}));
                return rih1.a;
            case 25:
                xuq xuqVar = (xuq) this.b;
                rb3 rb3Var = (rb3) this.c;
                return new kpg0(new ldo((lzn0) rb3Var.c, (ttq) ((jmq) xuqVar.a.c).c), new hij1(rb3Var, (String) this.d, (byte) 18));
            case 26:
                iu30 iu30Var2 = (iu30) this.b;
                s271 s271Var = (s271) this.c;
                iu30Var2.invoke(new zxk1(s271Var.c, s271Var.d, ((r271) this.d).c));
                return rih1.a;
            case 27:
                ((ven0) this.c).setValue(Boolean.FALSE);
                zau0 zau0Var = (zau0) this.b;
                if (zau0Var != null && (abu0Var = (abu0) ((Function0) this.d).invoke()) != null) {
                    abu0Var.b(zau0Var);
                }
                return rih1.a;
            case 28:
                sd5 sd5Var = (sd5) this.b;
                o0i o0iVar2 = (o0i) this.d;
                lbl1 lbl1Var = (lbl1) this.c;
                kbl1 kbl1Var = lbl1Var.h;
                String str5 = lbl1Var.c;
                if (kbl1Var != null) {
                    bcl1.f((bcl1) sd5Var.c, o0iVar2.e, "survey_layout.skip_option", str5, (String) null, new hbl1(o0iVar2, (byte) 0), 8);
                }
                ((bih1) sd5Var.e).k();
                return rih1.a;
            default:
                m0i1 m0i1Var = (m0i1) this.b;
                m0i1Var.c = (yfl1) ((kly0) this.c).get();
                m0i1Var.d = (nrd) ((kly0) this.d).get();
                yfl1 yfl1Var = (yfl1) m0i1Var.c;
                if (yfl1Var == null) {
                    u890.C("wazeSdkManager");
                    throw null;
                }
                nrd nrdVar = (nrd) m0i1Var.d;
                if (nrdVar == null) {
                    u890.C("stickyLocalBroadcastManager");
                    throw null;
                }
                m0i1Var.e = new aia(yfl1Var, nrdVar);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.spotify.music.internal.waze.LAUNCH");
                intentFilter.addAction("com.spotify.music.internal.waze.WAKE_BY_MBS");
                intentFilter.addAction("com.spotify.music.internal.waze.STOP");
                nrd nrdVar2 = (nrd) m0i1Var.d;
                if (nrdVar2 == null) {
                    u890.C("stickyLocalBroadcastManager");
                    throw null;
                }
                aia aiaVar = (aia) m0i1Var.e;
                if (aiaVar == null) {
                    u890.C("broadcastReceiver");
                    throw null;
                }
                yt91 yt91Var = nrdVar2.a;
                ArrayList arrayList = new ArrayList(intentFilter.countActions());
                int iCountActions = intentFilter.countActions();
                for (int i2 = 0; i2 < iCountActions; i2++) {
                    Intent intent = (Intent) ((HashMap) yt91Var.d).get(intentFilter.getAction(i2));
                    if (intent != null) {
                        arrayList.add(intent);
                    }
                }
                ((zce0) yt91Var.c).b(aiaVar, intentFilter);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    aiaVar.onReceive((Context) yt91Var.b, (Intent) it2.next());
                }
                if (!arrayList.isEmpty()) {
                }
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o8e1(o1i o1iVar, o0i o0iVar, z0i z0iVar, byte b) {
        super(0);
        this.a = b;
        this.b = o1iVar;
        this.d = o0iVar;
        this.c = z0iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o8e1(Object obj, Object obj2, Object obj3, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
