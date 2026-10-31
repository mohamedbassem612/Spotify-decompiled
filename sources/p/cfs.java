package p;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.car.app.navigation.model.Maneuver;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.spotify.base.java.logging.Logger;
import com.spotify.home.explicitfeedback.proto.FeedbackList;
import com.spotify.login.loginflowimpl.DelegatingLoginActivity;
import com.spotify.music.loggers.events.proto.DeviceIdentifier;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.functions.Consumer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cfs implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public cfs(r9v r9vVar, List list) {
        this.a = (byte) 15;
        this.b = list;
    }

    /* JADX WARN: Code duplicated, block: B:200:0x0691  */
    /* JADX WARN: Code duplicated, block: B:202:0x069b  */
    public final void accept(Object obj) {
        Drawable drawableMutate;
        ni30 ni30Var;
        boolean z;
        mus musVarE;
        String str;
        String id;
        Context context;
        int i = 3;
        t2u t2uVar = null;
        switch (this.a) {
            case 0:
                ((vgr) this.b).a = ((Boolean) obj).booleanValue();
                return;
            case 1:
                ((ifs) this.b).d.onNext((l0u) obj);
                return;
            case 2:
                p5x0 p5x0Var = p5x0.W0;
                p8v0 p8v0Var = (p8v0) obj;
                tjq tjqVar = (tjq) this.b;
                c8v0 c8v0Var = p8v0Var.e;
                p410 p410Var = (p410) tjqVar.c;
                ((TextView) p410Var.e).setText(p8v0Var.c.c);
                TextView textView = (TextView) p410Var.f;
                String str2 = p8v0Var.b;
                f8v0 f8v0Var = p8v0Var.d;
                textView.setText(f8v0Var.c);
                Drawable drawable = (Drawable) ((idd1) tjqVar.a).getValue();
                if (drawable == null || (drawableMutate = drawable.mutate()) == null) {
                    drawableMutate = null;
                } else {
                    drawableMutate.setTintList(textView.getTextColors());
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableMutate, (Drawable) null);
                textView.setOnClickListener(new kw6(tjqVar, f8v0Var, str2, (byte) 5));
                if (c8v0Var != null) {
                    rt8 rt8Var = (rt8) ((idd1) tjqVar.d).getValue();
                    y0o y0oVar = (y0o) tjqVar.e;
                    if (y0oVar == null) {
                        u890.C("eventHandler");
                        throw null;
                    }
                    ComposeView composeView = rt8Var.c;
                    TextView textView2 = rt8Var.b;
                    textView2.setOnClickListener(null);
                    boolean z2 = c8v0Var instanceof c8v0;
                    ConstraintLayout constraintLayout = rt8Var.a;
                    if (z2) {
                        constraintLayout.setEnabled(true);
                        textView2.setEnabled(true);
                        boolean z3 = c8v0Var.d;
                        oo6 oo6Var = new oo6(y0oVar, str2, c8v0Var, (byte) 7);
                        composeView.setViewCompositionStrategy(p5x0Var);
                        composeView.setContent(new j2i(-1552322649, new st8(true, z3, oo6Var, (byte) 0), true));
                        textView2.setOnClickListener(new kw6(y0oVar, c8v0Var, str2, (byte) 2));
                    } else {
                        constraintLayout.setEnabled(false);
                        textView2.setEnabled(false);
                        composeView.setViewCompositionStrategy(p5x0Var);
                        composeView.setContent(new j2i(-1552322649, new st8(false, false, (iu30) null, (byte) 0), true));
                    }
                }
                i8p1 i8p1Var = p8v0Var.f;
                ComposeView composeView2 = (ComposeView) p410Var.h;
                composeView2.setViewCompositionStrategy(p5x0Var);
                if (i8p1Var instanceof n8v0) {
                    composeView2.setVisibility(0);
                    composeView2.setContent(new j2i(-1588447540, new hgs(i8p1Var, tjqVar, str2, (byte) 1), true));
                } else {
                    if (!(i8p1Var instanceof o8v0)) {
                        eg.o();
                        return;
                    }
                    composeView2.setVisibility(8);
                }
                m8v0 m8v0Var = p8v0Var.g;
                ComposeView composeView3 = (ComposeView) p410Var.g;
                composeView3.setViewCompositionStrategy(p5x0Var);
                if (m8v0Var instanceof l8v0) {
                    composeView3.setVisibility(0);
                    composeView3.setContent(new j2i(-1079373942, new ggs(m8v0Var, tjqVar, str2, (byte) 1), true));
                } else {
                    if (!(m8v0Var instanceof h8v0)) {
                        eg.o();
                        return;
                    }
                    composeView3.setVisibility(8);
                }
                boolean z4 = p8v0Var.h;
                ComposeView composeView4 = (ComposeView) p410Var.d;
                composeView4.setViewCompositionStrategy(p5x0Var);
                if (!z4) {
                    composeView4.setVisibility(8);
                    return;
                } else {
                    composeView4.setVisibility(0);
                    composeView4.setContent(new j2i(1645998218, new fgs(tjqVar, str2, (byte) 1), true));
                    return;
                }
            case 3:
                yjq yjqVar = (yjq) this.b;
                if (((c3s) yjqVar.c).d()) {
                    return;
                }
                th30 th30Var = (th30) yjqVar.b;
                if (th30Var.L || th30Var.U() || th30Var.G("RemoteVolumeWidgetFragment") != null) {
                    return;
                }
                ((uww0) yjqVar.e).a().g1(th30Var, "RemoteVolumeWidgetFragment");
                return;
            case 4:
                l0l l0lVar = (l0l) obj;
                yrs yrsVar = (yrs) this.b;
                yrsVar.d.a = false;
                boolean zL = l0lVar.l();
                zor zorVar = yrsVar.c;
                if (zL) {
                    zor.i(zorVar, (String) null, 6);
                    return;
                } else {
                    zor.k(zorVar, l0lVar.j(), (String) null, 28);
                    return;
                }
            case 5:
                mmr0 mmr0Var = (mmr0) obj;
                mss mssVar = (mss) mmr0Var.a;
                Integer num = (Integer) mmr0Var.b;
                sta1 sta1Var = mssVar.a.b;
                ip31 ip31Var = (ip31) this.b;
                iy4 iy4Var = (iy4) ip31Var.g;
                gg11 gg11Var = (gg11) ip31Var.b;
                if (iy4Var.a() && sta1Var == null) {
                    int iIntValue = num.intValue();
                    Bundle bundle = new Bundle();
                    bundle.putInt("initialSpeed", iIntValue);
                    a1r0.j((rta1) ip31Var.h, "spotify:internal:speed-control", (String) null, bundle, false, 10);
                    return;
                }
                if (sta1Var != null) {
                    Context context2 = (Context) ip31Var.f;
                    if (context2.getResources().getDimensionPixelOffset(2131167042) / context2.getResources().getDisplayMetrics().widthPixels < 0.7f) {
                        ni30 ni30Var2 = (ni30) gg11Var.get(fva1.class);
                        if (ni30Var2 != null) {
                            t2u t2uVarA = ni30Var2.a();
                            t2uVarA.T0(mno1.h(new mmr0[]{new mmr0("initialSpeed", num), new mmr0("anchorRect", new Rect(sta1Var.a, sta1Var.b, sta1Var.c, sta1Var.d))}));
                            t2uVar = t2uVarA;
                        }
                    } else {
                        ni30Var = (ni30) gg11Var.get(lqa1.class);
                        if (ni30Var != null) {
                            t2u t2uVarA2 = ni30Var.a();
                            t2uVarA2.T0(mno1.h(new mmr0[]{new mmr0("initialSpeed", num)}));
                            t2uVar = t2uVarA2;
                        }
                    }
                } else {
                    ni30Var = (ni30) gg11Var.get(lqa1.class);
                    if (ni30Var != null) {
                        t2u t2uVarA3 = ni30Var.a();
                        t2uVarA3.T0(mno1.h(new mmr0[]{new mmr0("initialSpeed", num)}));
                        t2uVar = t2uVarA3;
                    }
                }
                if (t2uVar != null) {
                    t2uVar.h1((th30) ip31Var.c, "speedControlFragment");
                    return;
                } else {
                    n57.s("Speed control fragment not found");
                    return;
                }
            case 6:
                dms0 dms0Var = ((mts) this.b).b;
                Intent intent = new Intent("android.intent.action.VIEW", (Uri) obj);
                Activity activity = dms0Var.a;
                if (intent.resolveActivity(activity.getPackageManager()) != null) {
                    activity.startActivity(intent);
                    return;
                }
                return;
            case 7:
                q5f1 q5f1Var = (q5f1) obj;
                pus pusVar = (pus) this.b;
                if (!(q5f1Var instanceof p5f1)) {
                    if (!(q5f1Var instanceof o5f1)) {
                        eg.o();
                        return;
                    }
                    Logger.b("DefaultTooltipAttacher request: " + q5f1Var, new Object[0]);
                    pusVar.a().e.d();
                    return;
                }
                p5f1 p5f1Var = (p5f1) q5f1Var;
                qtg qtgVar = p5f1Var.b;
                String str3 = p5f1Var.a;
                View view = (View) qtgVar.k().get();
                if (view == null) {
                    pusVar.b(2, str3);
                    return;
                }
                if ((view instanceof ComposeView) || (((z = qtgVar instanceof f690)) && (((f690) qtgVar).d.a instanceof ComposeView))) {
                    n57.s("ComposeView is not supported by the MessagingPlatform as of now for either the anchorView or the contentView. If your feature is using ComposeView, please use the EncoreTooltipBox.");
                    pusVar.b(4, str3);
                    return;
                }
                if (!view.isShown()) {
                    pusVar.b(2, str3);
                    return;
                }
                if (z) {
                    pusVar.a();
                    gj5 gj5Var = pusVar.a().a;
                    f690 f690Var = (f690) qtgVar;
                    oh31 oh31Var = new oh31();
                    nh31 nh31Var = f690Var.d;
                    oh31Var.h = nh31Var.a;
                    ((l5f1) oh31Var).a = 0;
                    ((l5f1) oh31Var).f = false;
                    ((l5f1) oh31Var).e = loo1.D(nh31Var.b);
                    ((l5f1) oh31Var).b = new m110(f690Var, (byte) 0);
                    ((l5f1) oh31Var).c = new m110(f690Var, (byte) 1);
                    ((l5f1) oh31Var).d = new opg(f690Var, (byte) 11);
                    ((l5f1) oh31Var).g = 10000L;
                    musVarE = t2b.e(gj5Var, str3, oh31Var);
                } else {
                    if (!(qtgVar instanceof g690)) {
                        eg.o();
                        return;
                    }
                    pusVar.a();
                    gj5 gj5Var2 = pusVar.a().a;
                    g690 g690Var = (g690) qtgVar;
                    px81 px81Var = new px81();
                    mx81 mx81Var = g690Var.d;
                    px81Var.i = mx81Var.a;
                    ((l5f1) px81Var).a = mx81Var.d;
                    ((l5f1) px81Var).f = mx81Var.c;
                    ((l5f1) px81Var).e = loo1.D(mx81Var.b);
                    px81Var.j = mx81Var.e;
                    ((l5f1) px81Var).b = new l110(g690Var, (byte) 0);
                    ((l5f1) px81Var).c = new l110(g690Var, (byte) 1);
                    ((l5f1) px81Var).d = new opg(g690Var, (byte) 10);
                    ((l5f1) px81Var).g = mx81Var.f;
                    musVarE = t2b.e(gj5Var2, str3, px81Var);
                }
                mus musVar = musVarE;
                pusVar.a().e.e(musVar, view, new d3j0(a3j0.a, x2j0.a), new vt1(pusVar, view, qtgVar.l(), str3, musVar, (byte) 11), new jzm(pusVar, str3, musVar, qtgVar.m(), (byte) 4), new wrs(pusVar, str3, (byte) 1));
                return;
            case 8:
                DelegatingLoginActivity delegatingLoginActivity = (DelegatingLoginActivity) this.b;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                int i2 = DelegatingLoginActivity.f1;
                delegatingLoginActivity.runOnUiThread(new c57(delegatingLoginActivity, zBooleanValue, (byte) 4));
                return;
            case 9:
                a2t a2tVar = (a2t) ((efr) this.b).b;
                c921.y(cto1.q(a2tVar.a), (o8n) null, 0, new z1t(a2tVar, ((l0n1) obj).c, (lnm) null, (byte) 0), 3);
                return;
            case 10:
                ((y9t) this.b).q = ((Boolean) obj).booleanValue();
                return;
            case 11:
                Boolean bool = (Boolean) obj;
                l6s l6sVar = (l6s) ((j7p) ((km0) this.b).c).get();
                jqt jqtVar = (jqt) l6sVar.a;
                jqtVar.getClass();
                synchronized (jqt.f) {
                    str = jqtVar.d;
                    if (str == null) {
                        dma1 dma1Var = jqtVar.b;
                        bma1 bma1Var = jqt.e;
                        String strK = dma1Var.k(bma1Var);
                        jqtVar.d = strK;
                        if (TextUtils.isEmpty(strK)) {
                            String string = new BigInteger(130, new SecureRandom()).toString(32);
                            jqtVar.d = string;
                            string.getClass();
                            hma1 hma1VarEdit = jqtVar.b.edit();
                            hma1VarEdit.d(bma1Var, string);
                            hma1VarEdit.g();
                        }
                        str = jqtVar.d;
                        str.getClass();
                    }
                    break;
                }
                String strA = ((jqt) l6sVar.a).a();
                iz40 iz40Var = (iz40) l6sVar.c;
                while (true) {
                    if (i > 0) {
                        try {
                            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(iz40Var.a);
                            if (advertisingIdInfo.isLimitAdTrackingEnabled()) {
                                i = 0;
                            } else {
                                id = advertisingIdInfo.getId();
                            }
                        } catch (GooglePlayServicesRepairableException unused) {
                            i--;
                        } catch (IOException | GooglePlayServicesNotAvailableException unused2) {
                        }
                    } else {
                        id = "";
                    }
                }
                oqt oqtVarN = DeviceIdentifier.n();
                oqtVarN.n(strA);
                oqtVarN.q(str);
                oqtVarN.s();
                if (bool.booleanValue()) {
                    oqtVarN.r(id);
                }
                ((t2j0) l6sVar.b).a(oqtVarN.build());
                return;
            case 12:
                ((mvr) ((hur) this.b).c).b.onNext(Boolean.TRUE);
                return;
            case 13:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                wpu wpuVar = (wpu) ((km0) this.b).c;
                wpuVar.b = zBooleanValue2;
                for (Activity activity2 : wpuVar.a) {
                    activity2.getClass();
                    wpuVar.a(activity2);
                }
                return;
            case 14:
                ((vt1) this.b).invoke();
                return;
            case 15:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                List list = (List) this.b;
                TextView textView3 = (TextView) o7h.s0(list);
                if (textView3 == null || (context = textView3.getContext()) == null) {
                    return;
                }
                int color = zBooleanValue3 ? context.getColor(2131100258) : context.getColor(2131100253);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((TextView) it.next()).setShadowLayer(7.0f, 0.0f, 3.0f, color);
                }
                return;
            case 16:
                ((kh0) this.b).a(new yxs0(((uyv) obj).b));
                return;
            case 17:
                r0w r0wVar = (r0w) this.b;
                i8h1 i8h1Var = r0wVar.a;
                x6h1 x6h1VarC = r0wVar.b.b.c();
                x6h1VarC.i.add(new a7h1("toolbar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA = x6h1VarC2.a();
                b7x b7xVar = b7x.a;
                String str4 = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null).a.a;
                return;
            case 18:
                f3x f3xVar = (f3x) this.b;
                if (Boolean.parseBoolean((String) ((ContextTrack) obj).metadata().get("podcast.contains_sponsored_content"))) {
                    xu4 xu4Var = f3xVar.e;
                    kt91 kt91Var = f3xVar.b;
                    if (xu4Var.a() || !kt91Var.g()) {
                        return;
                    }
                    kt91Var.k(new er91((fs91) null, f3xVar.d.getString(2131956669), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                    f3xVar.c.b();
                    return;
                }
                return;
            case 19:
                ((qzh) this.b).f((hxf1) obj);
                return;
            case 20:
                z7y z7yVar = (z7y) obj;
                a8y a8yVar = (a8y) this.b;
                qzh qzhVar = a8yVar.d;
                if (z7yVar.b.length() <= 0 || z7yVar.c.length() <= 0 || z7yVar.e.length() <= 0) {
                    a8yVar.f.e();
                    return;
                }
                a8yVar.g.setText(z7yVar.g);
                String str5 = z7yVar.b;
                String str6 = z7yVar.c;
                String str7 = z7yVar.d;
                String str8 = z7yVar.i;
                qzhVar.f(new f640(str8 != null ? Uri.parse(str8) : null, str5, str6, str7, z7yVar.e, z7yVar.f));
                qzhVar.n(new w3w(a8yVar, z7yVar, (byte) 18));
                return;
            case 21:
                a8y a8yVar2 = (a8y) ((yjq) this.b).e;
                if (a8yVar2 == null) {
                    u890.C("viewBinder");
                    throw null;
                }
                a8yVar2.f.e();
                a8yVar2.e.k(new er91((fs91) null, a8yVar2.a.getResources().getString(2131955512), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return;
            case 22:
                CompositeException compositeException = (Throwable) obj;
                fc00 fc00Var = (fc00) this.b;
                zq4 zq4Var = fc00Var.c;
                zia ziaVar = fc00Var.f;
                if (compositeException instanceof FileNotFoundException) {
                    ziaVar.accept(Boolean.TRUE);
                    zq4Var.a();
                    return;
                }
                if (compositeException instanceof CompositeException) {
                    List list2 = compositeException.a;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (!(((Throwable) it2.next()) instanceof FileNotFoundException)) {
                            }
                        }
                    }
                    ziaVar.accept(Boolean.TRUE);
                    zq4Var.a();
                    return;
                }
                ziaVar.accept(Boolean.FALSE);
                fc00Var.e.invoke(ec00.a);
                zq4Var.e("Error while reading from disk.", compositeException);
                return;
            case 23:
                ((xc00) this.b).e.e("EventSender heartbeat event fatal error", (Throwable) obj);
                return;
            case 24:
                ((vwz0) this.b).invoke();
                return;
            case 25:
                hs00 hs00Var = (hs00) this.b;
                ((ConcurrentLinkedQueue) hs00Var.f.c).addAll(((FeedbackList) obj).q());
                t7y t7yVar = hs00Var.f;
                t7yVar.k(new rr10(t7yVar, (byte) 0));
                ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) t7yVar.c;
                int size = concurrentLinkedQueue.size();
                if (size > 500) {
                    int i3 = size - 500;
                    for (int i4 = 0; i4 < i3; i4++) {
                        concurrentLinkedQueue.poll();
                    }
                }
                hs00Var.e.set(true);
                hs00Var.h.onNext(o7h.l1(concurrentLinkedQueue));
                return;
            case 26:
                djx djxVar = (djx) this.b;
                uv00 m231Var = new m231((Throwable) obj);
                nif1 nif1Var = (nif1) djxVar.c;
                if (((AtomicBoolean) djxVar.b).compareAndSet(false, true)) {
                    nif1Var.e("await_final_response");
                    nif1Var.stop();
                    kj41 kj41Var = (kj41) djxVar.d;
                    kj41Var.setAttribute("outcome", e331.a(m231Var) == null ? m231Var.c() ? "success" : "partial" : "error");
                    kj41Var.stop();
                    return;
                }
                return;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                ((p68) this.b).a();
                Logger.e((Throwable) obj, "Loading web token failed", new Object[0]);
                return;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                pqd0 pqd0Var = (rqd0) obj;
                id31 id31Var = ((ns10) this.b).c;
                if (!pqd0Var.equals(oqd0.a)) {
                    if (pqd0Var instanceof pqd0) {
                        id31Var.b(pqd0Var.a);
                        return;
                    } else {
                        eg.o();
                        return;
                    }
                }
                switch (id31Var.a) {
                    case 0:
                        eh30 eh30Var = (eh30) id31Var.b;
                        a1r0 a1r0Var = eh30Var.d;
                        if (((pq4) eh30Var.e.get()).a()) {
                            if (a1r0Var.h(eh30Var.c)) {
                                a1r0Var.g();
                                return;
                            }
                            return;
                        } else {
                            t2u t2uVarG = eh30Var.a.a.e0().G("LivestreamErrorDialog");
                            t2uVar = t2uVarG instanceof t2u ? t2uVarG : null;
                            if (t2uVar != null) {
                                t2uVar.dismiss();
                                return;
                            }
                            return;
                        }
                    default:
                        return;
                }
            default:
                Logger.e((Throwable) obj, "Error fetching data for " + ((pc20) this.b), new Object[0]);
                return;
        }
    }

    public /* synthetic */ cfs(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
