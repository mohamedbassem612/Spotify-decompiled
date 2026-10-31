package p;

import android.app.ForegroundServiceStartNotAllowedException;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.base.java.logging.Logger;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.player.model.ContextTrack$Metadata;
import com.spotify.player.model.PlayOrigin;
import com.spotify.wrapped.v1.proto.StoryCard;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hh extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hh(ow3 ow3Var, ComponentName componentName, Context context, hh hhVar) {
        super(0);
        this.a = (byte) 14;
        this.b = componentName;
        this.c = context;
        this.d = hhVar;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x01f3  */
    public final Object invoke() {
        tv80 tv80VarM;
        ou80 ou80Var;
        String str;
        psk pskVar;
        String str2 = "";
        boolean z = false;
        switch (this.a) {
            case 0:
                AccessibilityManager accessibilityManager = (AccessibilityManager) this.b;
                accessibilityManager.removeAccessibilityStateChangeListener((ih) this.c);
                accessibilityManager.removeTouchExplorationStateChangeListener((zg) this.d);
                return rih1.a;
            case 1:
                String str3 = ((t7d1) this.b).b;
                l62 l62Var = (l62) this.c;
                a580 a580Var = new a580(str3, l62Var.t, l62Var.b, l62Var.X);
                an0 an0Var = (an0) this.d;
                an0Var.h.c(an0Var.i, a580Var);
                return rih1.a;
            case 2:
                v51 v51Var = (v51) this.b;
                i8h1 i8h1Var = v51Var.f;
                x6h1 x6h1VarC = ((h4l0) this.c).b.c();
                x6h1VarC.i.add(new a7h1("open_email_signup_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                w6b1 w6b1VarA = f7b1.a(blc0.Ea);
                String str4 = w6b1VarA != null ? (String) o7h.s0(w6b1VarA.c) : null;
                lsn0 lsn0Var = new lsn0((String) null, i8h1Var.j(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str4 != null ? str4 : "")), y6h1VarA, r6h1.c, System.currentTimeMillis())).a);
                PublishSubject publishSubject = v51Var.Z;
                un81 un81Var = un81.a;
                bk8 bk8Var = ((n51) this.d).e;
                if (bk8Var == null) {
                    bk8Var = bk8.a;
                }
                publishSubject.onNext(new b51(new eo81(un81Var, bk8Var), lsn0Var));
                return rih1.a;
            case 3:
                Uri.Builder builderAppendQueryParameter = new Uri.Builder().encodedPath("spotify:internal:contribution-notes-management:create").appendQueryParameter(ContextTrack$Metadata.KEY_CONTEXT_URI, (String) this.b).appendQueryParameter("item_uri", (String) this.c);
                String str5 = (String) this.d;
                if (str5 != null) {
                    builderAppendQueryParameter.appendQueryParameter("list_item_id", str5);
                }
                return builderAppendQueryParameter.build().toString();
            case 4:
                pk1 pk1Var = (pk1) this.b;
                return Float.valueOf(((Boolean) ((ven0) this.d).getValue()).booleanValue() ? (u890.j(pk1Var.e, rk1.c) && pk1Var.a == qk1.a) ? 0.0f : 1.0f : ((kbf0) this.c).f());
            case 5:
                el1 el1Var = (el1) this.b;
                o0i o0iVar = (o0i) this.c;
                String str6 = ((xk1) this.d).a;
                return bcl1.f(el1Var.c, o0iVar.e, "add_to_collection_button", str6, (String) null, new cl1(true, str6, (byte) 0), 8);
            case 6:
                return ((el1) this.b).c.e(((o0i) this.c).e, new v1((String) this.d, (byte) 13));
            case 7:
                d520 d520Var = (d520) this.b;
                eyh0 eyh0Var = (eyh0) d520Var.d;
                int i = ((rmy) this.c).d;
                String str7 = (String) this.d;
                b7x b7xVar = b7x.a;
                i8h1 i8h1Var2 = (i8h1) eyh0Var.b;
                y6h1 y6h1Var = eyh0Var.m(i, str7).b;
                if (i == 7 || i == 4 || i == 3) {
                    x6h1 x6h1VarC2 = y6h1Var.c();
                    x6h1VarC2.i.add(new a7h1("add_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    tv80VarM = i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("add_to_playlist", 2, sqg0.J(new mmr0[]{new mmr0("playlist", ""), new mmr0("item_to_be_added", str7)})), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                } else {
                    x6h1 x6h1VarC3 = y6h1Var.c();
                    x6h1VarC3.i.add(new a7h1("add_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    tv80VarM = i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("follow", 1, Collections.singletonMap("item_to_be_followed", str7)), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                }
                ((vku) d520Var.g).a(((oj3) d520Var.b).c(Collections.singletonList(str7), "", "", false, new gj3(27, tv80VarM)).ignoreElement().subscribe());
                vh3 vh3Var = (vh3) d520Var.h;
                if (vh3Var != null) {
                    vh3Var.dismiss();
                }
                return rih1.a;
            case 8:
                ((ven0) this.b).setValue(Boolean.FALSE);
                b6t b6tVar = (k6a1) this.c;
                if (b6tVar != null) {
                    b6tVar.a();
                }
                c4p1.q((y7e1) this.d);
                return rih1.a;
            case 9:
                ((iu30) this.b).invoke((tg2) this.c);
                ((ven0) this.d).setValue(Boolean.FALSE);
                return rih1.a;
            case 10:
                ven0 ven0Var = (ven0) this.c;
                o03 o03Var = (o03) this.b;
                ycc1 ycc1Var = o03Var.g;
                ven0Var.setValue(((m03) ycc1Var.c).b((i8h1) ycc1Var.b));
                ((ven0) this.d).setValue(Boolean.TRUE);
                q7r0 q7r0Var = o03Var.c;
                a1r0 a1r0Var = o03Var.d;
                if (u890.j((n2r0) q7r0Var.a.a.getValue(), n6x.a) && a1r0Var.h(o03Var.e)) {
                    a1r0Var.l();
                } else {
                    tv80 tv80Var = (tv80) ven0Var.getValue();
                    if (tv80Var != null && (ou80Var = tv80Var.a) != null && (str = ou80Var.a) != null) {
                        str2 = str;
                    }
                    q7r0Var.c(str2);
                }
                return rih1.a;
            case 11:
                zob1 zob1Var = (zob1) this.b;
                x83 x83Var = (x83) this.c;
                return t5p1.j(new x010(zob1Var, x83Var.j, new t83((wto) this.d, x83Var, (lnm) null, (byte) 0), (byte) 1), 3);
            case 12:
                if (((ohd) this.b).s() instanceof ago0) {
                    ((ec4) this.c).a();
                    try {
                        ec4 ec4Var = (ec4) this.c;
                        yo00 yo00VarA = ec4Var.c;
                        if (yo00VarA == null) {
                            yo00VarA = ec4Var.a.a();
                            ec4Var.c = yo00VarA;
                        }
                        ec4 ec4Var2 = (ec4) this.c;
                        ohd ohdVar = (ohd) this.b;
                        cc4 cc4Var = new cc4(ec4Var2, ohdVar);
                        ohdVar.n(new cc2(ec4Var2, cc4Var, (byte) 19));
                        ((ec4) this.c).d = (ohd) this.b;
                        ((ec4) this.c).e = cc4Var;
                        try {
                            yo00VarA.r(ec4.f, false);
                            yo00VarA.m.a(cc4Var);
                            yo00VarA.W0((akx0) this.d);
                            yo00VarA.e();
                            yo00VarA.M(true);
                        } catch (Exception e) {
                            ec4 ec4Var3 = (ec4) this.c;
                            ohd ohdVar2 = (ohd) this.b;
                            ec4Var3.getClass();
                            Logger.e(e, "AndroidCueAudioPlayer playback failed", new Object[0]);
                            ec4Var3.b(cc4Var, true);
                            if (ohdVar2.s() instanceof ago0) {
                                ohdVar2.resumeWith(new m231(e));
                            }
                        }
                    } catch (Exception e2) {
                        if (((ohd) this.b).s() instanceof ago0) {
                            ((ohd) this.b).resumeWith(new m231(e2));
                        }
                    }
                    break;
                }
                return rih1.a;
            case 13:
                ow3 ow3Var = (ow3) this.b;
                Function0 function0 = (Function0) this.c;
                String str8 = (String) this.d;
                l961 l961Var = (l961) ow3Var.c;
                try {
                    function0.invoke();
                    l961Var.a(2, str8);
                    break;
                } catch (ForegroundServiceStartNotAllowedException unused) {
                    l961Var.a(3, str8);
                }
                return rih1.a;
            case 14:
                ComponentName componentName = (ComponentName) this.b;
                Context context = (Context) this.c;
                yu3 yu3Var = new yu3((hh) this.d);
                ohh0 ohh0Var = new ohh0(context.getApplicationContext(), componentName, yu3Var);
                yu3Var.e = ohh0Var;
                ohh0Var.a.b.connect();
                return rih1.a;
            case 15:
                sd5 sd5Var = (sd5) this.b;
                String str9 = ((qd5) this.c).c;
                o0i o0iVar2 = (o0i) this.d;
                if (!ihc1.y0(str9)) {
                    ke71 ke71Var = ((q9l1) sd5Var.d).i;
                    hma1 hma1VarEdit = ((dma1) ke71Var.b).edit();
                    hma1VarEdit.a((bma1) ke71Var.c, true);
                    hma1VarEdit.g();
                    ((lzn0) sd5Var.b).a(str9, bcl1.f((bcl1) sd5Var.c, o0iVar2.e, "animation_header", zmo1.s(str9), (String) null, new wk3(str9, (byte) 5), 8), (Bundle) null);
                }
                return rih1.a;
            case 16:
                oo5 oo5Var = (oo5) this.b;
                do5 do5Var = (do5) this.c;
                uf0 uf0Var = oo5Var.b;
                do5Var.getClass();
                Context context2 = uf0Var.a;
                PackageManager packageManager = context2.getPackageManager();
                if (packageManager != null) {
                    packageManager.setComponentEnabledSetting(new ComponentName(context2, "com.spotify.music.MainActivity"), 1, 1);
                }
                ((BehaviorSubject) oo5Var.e.getValue()).onNext(do5Var);
                List listL1 = o7h.l1((Iterable) oo5Var.d.a.get());
                ArrayList arrayList = new ArrayList();
                for (Object obj : listL1) {
                    if (!((mo5) obj).a.equals(do5Var)) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    do5 do5Var2 = ((mo5) it.next()).a;
                    PackageManager packageManager2 = context2.getPackageManager();
                    if (packageManager2 != null) {
                        packageManager2.setComponentEnabledSetting(new ComponentName(context2, "com.spotify.music.MainActivity"), 2, 1);
                    }
                }
                ((SingleEmitter) this.d).onSuccess(new rn5(do5Var));
                return rih1.a;
            case 17:
                ((l96) this.b).e.c("spotify:internal:magpie?config=" + psk.b + "&uri=" + ((fa6) this.c).a.a);
                ((iu30) this.d).invoke(j76.a);
                return rih1.a;
            case 18:
                fa6 fa6Var = (fa6) this.c;
                if ((!((l96) this.b).g.j() || fa6Var.c == chr0.b) && (((pskVar = fa6Var.b) == psk.c || pskVar == psk.b) && !((Boolean) ((ven0) this.d).getValue()).booleanValue())) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 19:
                ((o86) this.b).e((String) this.c);
                ((Function0) this.d).invoke();
                return rih1.a;
            case 20:
                StoryCard storyCard = ((wgm1) ((tob1) this.b).getValue()).a;
                if (u890.j(storyCard != null ? storyCard.getId() : null, ((wh6) ((ji6) this.c).b).l) && !((Boolean) ((ven0) this.d).getValue()).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 21:
                String str10 = ((w5m) this.b).c;
                if (str10 != null) {
                    ((iu30) this.d).invoke(new pn6(str10, ((em3) this.c).s(new yt80(str10))));
                }
                return rih1.a;
            case 22:
                sd7 sd7Var = ((dg7) this.c).j;
                mg7 mg7Var = (mg7) this.b;
                Parcelable parcelable = mg7Var.S0;
                RecyclerView recyclerView = mg7Var.i;
                if (parcelable != null) {
                    recyclerView.post(new s10(mg7Var, (byte) 11));
                    mg7Var.X = new fg7(sd7Var.a, sd7Var.e);
                } else {
                    rp rpVar = (rp) this.d;
                    String str11 = sd7Var.a;
                    r620 r620Var = sd7Var.e;
                    mg7 mg7Var2 = (mg7) rpVar.b;
                    fg7 fg7Var = mg7Var2.X;
                    if (u890.j(fg7Var != null ? fg7Var.a : null, str11)) {
                        fg7 fg7Var2 = mg7Var2.X;
                        if ((fg7Var2 != null ? fg7Var2.b : null) != r620Var) {
                            recyclerView.getLayoutManager().w1(0, 0);
                            mg7Var.X = new fg7(sd7Var.a, sd7Var.e);
                        }
                    } else {
                        recyclerView.getLayoutManager().w1(0, 0);
                        mg7Var.X = new fg7(sd7Var.a, sd7Var.e);
                    }
                }
                return rih1.a;
            case 23:
                iu30 iu30Var = (iu30) this.d;
                qfu0 qfu0Var = ((q08) this.b).e;
                boolean z2 = qfu0Var instanceof qfu0;
                if (z2 || (qfu0Var instanceof jfu0)) {
                    qfu0 qfu0Var2 = z2 ? qfu0Var : null;
                    iu30Var.invoke(new l08(qfu0Var2 != null ? Long.valueOf((((y08) this.c).a.b() - qfu0Var2.e) + qfu0Var2.c) : null));
                } else {
                    iu30Var.invoke(k08.a);
                }
                return rih1.a;
            case 24:
                faa0 faa0Var = (faa0) ((AtomicReference) this.b).getAndSet(null);
                if (faa0Var != null) {
                    faa0Var.d((CancellationException) null);
                }
                ((ig01) this.d).b(1000, ((AtomicBoolean) this.c).get() ? null : "error");
                return rih1.a;
            case 25:
                a680 a680Var = (a680) this.b;
                zet0 zet0Var = (zet0) a680Var.b;
                p1f0 p1f0Var = (p1f0) this.c;
                return f6o1.A(zet0.a(zet0Var, (k740) p1f0Var.d, (stt0) p1f0Var.g, (gst0) p1f0Var.h, (iac0) this.d, (PlayOrigin) ((ynb0) a680Var.e).get()), new ViewGroup.LayoutParams(-2, -2), (ScrollCardType) null, 2);
            case 26:
                return ((Observable) this.b).firstOrError().map(new km3((ut71) this.c, (Context) this.d, (byte) 27));
            case 27:
                hn9 hn9Var = (hn9) this.b;
                r6h1 r6h1Var = hn9Var.X;
                if (r6h1Var != null) {
                    i8h1 i8h1Var3 = (i8h1) hn9Var.e.get();
                    String str12 = ((fn9) this.c).a;
                    fuk0 fuk0Var = (fuk0) this.d;
                    y6h1 y6h1Var2 = y6h1.i;
                    x6h1 x6h1VarI = i3o1.i();
                    x6h1VarI.h = "music";
                    x6h1VarI.a = "mobile-byom-playback-unavailable-snackbar";
                    x6h1VarI.f = "1.0.0";
                    x6h1VarI.g = "22.0.0";
                    x6h1VarI.b = fuk0Var.a;
                    x6h1VarI.d = str12;
                    y6h1 y6h1VarA2 = x6h1VarI.a();
                    k7h1 k7h1Var = new k7h1();
                    ((xjn) k7h1Var).a = y6h1VarA2;
                    ((xjn) k7h1Var).b = r6h1Var;
                    ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                    i8h1Var3.f(k7h1Var.a(), (Set) null);
                }
                return rih1.a;
            case 28:
                f8n f8nVar = (f8n) this.b;
                ven0 ven0Var2 = (ven0) this.d;
                if (f8nVar != ((f8n) ven0Var2.getValue())) {
                    ((iu30) this.c).invoke(new uo9((f8n) ven0Var2.getValue(), f8nVar));
                    ven0Var2.setValue(f8nVar);
                }
                return rih1.a;
            default:
                ic9 ic9Var = (ic9) this.b;
                i8h1 i8h1Var4 = (i8h1) ic9Var.b;
                x6h1 x6h1VarC4 = ((otk0) ic9Var.c).b.c();
                x6h1VarC4.i.add(new a7h1("vibe_chip", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                y6h1 y6h1VarA3 = x6h1VarC4.a();
                b7x b7xVar2 = b7x.a;
                i8h1Var4.m(new w7h1("", "", new z7h1("hit", 1, b7xVar2), new x7h1("ui_reveal", 1, b7xVar2), y6h1VarA3, r6h1.c, System.currentTimeMillis()), (xj61) null);
                iu30 iu30Var2 = (iu30) this.c;
                ea61 ea61Var = (ea61) this.d;
                iu30Var2.invoke(ea61Var != null ? ea61Var.b : null);
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hh(Object obj, Object obj2, Object obj3, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
