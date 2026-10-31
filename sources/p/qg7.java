package p;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RemoteViews;
import androidx.compose.ui.platform.ComposeView;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.base.java.logging.Logger;
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import com.spotify.libs.bluetooth.events.proto.SocialRadarCharacteristicWriteFailed;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.userinteractivityservice.usercomments.v1.proto.GetCommentCardResponse;
import com.spotify.widget.widget.widgetimpl.SpotifyWidget;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.operators.completable.CompletableAndThenCompletable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qg7 implements Consumer {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public /* synthetic */ qg7(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    private final void a(Object obj) {
        w7b1 w7b1Var;
        RemoteViews remoteViewsD;
        int color;
        PlayerState playerState;
        g591 g591Var;
        mxa1 mxa1Var = (mxa1) this.b;
        PlayerState playerState2 = (PlayerState) this.c;
        Bitmap bitmap = (Bitmap) this.d;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Context context = (Context) mxa1Var.b;
        try {
            PendingIntent pendingIntent = (PendingIntent) ((xs80) mxa1Var.d).d.getValue();
            boolean zA = ((e26) mxa1Var.c).a();
            int i = Build.VERSION.SDK_INT;
            v7b1 v7b1Var = new v7b1(zBooleanValue);
            g591 g591Var2 = f591.n;
            boolean z = zA && i >= 31;
            boolean zC = playerState2.track().c();
            m1p1 xot0Var = yot0.c;
            if (zC) {
                try {
                    color = Color.parseColor("#" + ((String) ((ContextTrack) playerState2.track().b()).metadata().get("extracted_color")));
                } catch (IllegalArgumentException unused) {
                    color = context.getResources().getColor(2131101504);
                }
                int iJ = vno1.j(0.5f, color);
                int iJ2 = vno1.j(0.6f, color);
                String strF0 = l4o1.f0((ContextTrack) playerState2.track().b());
                if (strF0 == null) {
                    strF0 = "";
                }
                String strA0 = l4o1.P((ContextTrack) playerState2.track().b()) ? l4o1.a0((ContextTrack) playerState2.track().b(), "album_title") : (String) ((ContextTrack) playerState2.track().b()).metadata().get("artist_name");
                String str = strA0 != null ? strA0 : "";
                if (playerState2.restrictions().disallowSkippingPrevReasons().isEmpty()) {
                    int i2 = SpotifyWidget.j;
                    Intent intent = new Intent(context, (Class<?>) SpotifyWidget.class);
                    playerState = playerState2;
                    intent.setAction("com.spotify.mobile.android.ui.widget.PREVIOUS");
                    intent.putExtra("paused", playerState.isPaused());
                    g591Var = new g591(intent);
                } else {
                    playerState = playerState2;
                    g591Var = g591Var2;
                }
                if (!playerState.isPaused() || playerState.restrictions().disallowResumingReasons().isEmpty()) {
                    if (playerState.isPaused()) {
                        int i3 = SpotifyWidget.j;
                        Intent intent2 = new Intent(context, (Class<?>) SpotifyWidget.class);
                        intent2.setAction("com.spotify.mobile.android.ui.widget.RESUME");
                        intent2.putExtra("paused", true);
                        xot0Var = new zot0(intent2);
                    } else if (playerState.restrictions().disallowPausingReasons().isEmpty()) {
                        int i4 = SpotifyWidget.j;
                        Intent intent3 = new Intent(context, (Class<?>) SpotifyWidget.class);
                        intent3.setAction("com.spotify.mobile.android.ui.widget.PAUSE");
                        intent3.putExtra("paused", false);
                        xot0Var = new xot0(intent3);
                    } else {
                        xot0Var = wot0.c;
                    }
                }
                if (playerState.restrictions().disallowSkippingNextReasons().isEmpty()) {
                    int i5 = SpotifyWidget.j;
                    Intent intent4 = new Intent(context, (Class<?>) SpotifyWidget.class);
                    intent4.setAction("com.spotify.mobile.android.ui.widget.NEXT");
                    intent4.putExtra("paused", playerState.isPaused());
                    g591Var2 = new g591(intent4);
                }
                w7b1Var = new w7b1(bitmap, iJ, iJ2, strF0, str, g591Var, xot0Var, g591Var2, pendingIntent, z, v7b1Var);
            } else {
                w7b1Var = new w7b1((Bitmap) null, context.getResources().getColor(2131101502), context.getResources().getColor(2131102457), context.getString(2131963864), "", g591Var2, xot0Var, g591Var2, pendingIntent, z, v7b1Var);
            }
            r2a1 r2a1Var = (r2a1) mxa1Var.f;
            if (w7b1Var.k.a) {
                Boolean boolA = ((wpt) r2a1Var.c).a();
                if (boolA != null ? boolA.booleanValue() : true) {
                    try {
                        Context context2 = ((u8g) r2a1Var.b).a;
                        int i6 = SpotifyWidget.j;
                        Intent intent5 = new Intent(context2, (Class<?>) SpotifyWidget.class);
                        intent5.setAction("com.spotify.widget.widget.PROMO_ADD_NEW_WIDGET");
                        PendingIntent broadcast = PendingIntent.getBroadcast(context2, -1228835662, intent5, 201326592);
                        remoteViewsD = new RemoteViews(context.getPackageName(), 2131625465);
                        remoteViewsD.setOnClickPendingIntent(2131430542, broadcast);
                    } catch (SecurityException unused2) {
                        remoteViewsD = r2a1.d(context, w7b1Var);
                    }
                } else {
                    remoteViewsD = new RemoteViews(context.getPackageName(), 2131625465);
                    remoteViewsD.setViewVisibility(2131430542, 8);
                }
            } else {
                remoteViewsD = r2a1.d(context, w7b1Var);
            }
            p2o1.L(context, new t7b1(remoteViewsD, (byte) 1));
        } catch (SecurityException unused3) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a2  */
    public final void accept(Object obj) {
        Object value;
        pir pirVar;
        String str;
        String str2;
        String str3;
        mmr0 mmr0Var;
        j3r h3rVar;
        mtd0 mtd0Var;
        long j;
        CompletableAndThenCompletable completableAndThenCompletableA;
        z = false;
        boolean z = false;
        zAreNotificationsEnabled = false;
        boolean zAreNotificationsEnabled = false;
        switch (this.a) {
            case 0:
                t45 t45Var = ((rg7) this.b).b;
                if (t45Var != null) {
                    rg7.b((String) this.c, t45Var);
                }
                ((Function0) this.d).invoke();
                return;
            case 1:
                ri9 ri9Var = (ri9) obj;
                UUID uuid = ri9Var.b;
                String str4 = ri9Var.c;
                sir sirVar = (sir) this.b;
                if (sirVar.b.isEnabled()) {
                    bpb1 bpb1Var = sirVar.c;
                    do {
                        value = bpb1Var.getValue();
                        pirVar = (pir) value;
                    } while (!bpb1Var.k(value, pir.a(pirVar, 0, 0, 0, pirVar.e + 1, 0, 0, 495)));
                }
                ii9 ii9Var = (ii9) this.c;
                fi9 fi9Var = ri9Var.d;
                t2j0 t2j0Var = ii9Var.a;
                q5a1 q5a1VarN = SocialRadarCharacteristicWriteFailed.n();
                q5a1VarN.r(str4);
                q5a1VarN.n(uuid.toString());
                q5a1VarN.q(fi9Var.a());
                t2j0Var.a(q5a1VarN.build());
                ((xir) this.d).e.onNext(new ke9(ri9Var.a, uuid, str4));
                return;
            case 2:
                List list = (List) obj;
                ((nba) this.b).i.a((fdc) this.c, list.isEmpty() ? 2 : 1, 1);
                ((iu30) this.d).invoke(list);
                return;
            case 3:
                i8h1 i8h1Var = (i8h1) this.b;
                x6h1 x6h1VarC = ((tdl0) this.c).b.c();
                x6h1VarC.i.add(new a7h1("language_preference_row", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                ((lzn0) this.d).a("spotify:settings:notifications:language-preference", i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:settings:notifications:language-preference")), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null), (Bundle) null);
                return;
            case 4:
                GetCommentCardResponse getCommentCardResponse = (GetCommentCardResponse) obj;
                tjh tjhVar = (tjh) this.b;
                if (tjhVar.d.a() > 0) {
                    tjhVar.e.put((ojh) this.c, new pjh(getCommentCardResponse, tjhVar.b.b()));
                }
                ((SingleEmitter) this.d).onSuccess(getCommentCardResponse);
                return;
            case 5:
                String str5 = (String) obj;
                hma1 hma1VarEdit = ((rhn) this.b).b.edit();
                qhn.a.getClass();
                hma1VarEdit.d(phn.b, (String) this.c);
                hma1VarEdit.d(phn.c, str5);
                hma1VarEdit.g();
                ((h5z) this.d).accept(str5);
                return;
            case 6:
                if80 if80Var = (jf80) obj;
                w2s w2sVar = (w2s) this.c;
                ViewGroup viewGroup = (ViewGroup) ((u3) this.b).c;
                if (if80Var instanceof if80) {
                    viewGroup.removeAllViews();
                    ef80 ef80Var = if80Var.a;
                    viewGroup.addView(ef80Var.d().b, new ViewGroup.LayoutParams(-1, -2));
                    w2sVar.t = ef80Var.d().b;
                    return;
                }
                if (if80Var instanceof hf80) {
                    DismissReason.MessageButtonTapped messageButtonTapped = ((hf80) if80Var).a;
                    fhy fhyVar = (fhy) this.d;
                    u2s u2sVar = new u2s(w2sVar, fhyVar);
                    v2s v2sVar = new v2s(w2sVar, fhyVar);
                    if (messageButtonTapped instanceof DismissReason.MessageButtonTapped) {
                        DismissReason.MessageButtonTapped messageButtonTapped2 = messageButtonTapped;
                        if (messageButtonTapped2.getButton().isCloseButton()) {
                            u2sVar.invoke(messageButtonTapped2.getButton());
                            return;
                        } else {
                            v2sVar.invoke(messageButtonTapped2.getButton());
                            return;
                        }
                    }
                    return;
                }
                return;
            case 7:
                umb umbVar = (umb) obj;
                if ((umbVar instanceof rmb) || (umbVar instanceof smb) || umbVar.equals(tmb.a)) {
                    ((vt1) this.b).invoke();
                    return;
                } else if (umbVar instanceof qmb) {
                    ((i1r0) ((mxr) this.d).b).a((String) this.c);
                    return;
                } else {
                    eg.o();
                    return;
                }
            case 8:
                r0w r0wVar = (r0w) this.b;
                i8h1 i8h1Var2 = r0wVar.a;
                x6h1 x6h1VarC2 = r0wVar.b.b.c();
                x6h1VarC2.i.add(new a7h1("toolbar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                x6h1 x6h1VarC3 = x6h1VarC2.a().c();
                x6h1VarC3.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                y6h1 y6h1VarA = x6h1VarC3.a();
                b7x b7xVar = b7x.a;
                String str6 = i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null).a.a;
                st60 st60Var = (st60) this.c;
                l420 l420VarN = ((oi) st60Var.c).n(((dg30) st60Var.d).getCacheDir(), "profile");
                try {
                    l420[] l420VarArrB = l420VarN.b();
                    if (l420VarArrB != null) {
                        for (l420 l420Var : l420VarArrB) {
                            if (!l420Var.delete()) {
                                Logger.k("Error deleting file: %s", new Object[]{l420Var.b.getName()});
                            }
                        }
                    }
                    if (!l420VarN.delete()) {
                        Logger.d("Error deleting directory: %s", new Object[]{l420VarN.b.getName()});
                    }
                    break;
                } catch (SecurityException e) {
                    Logger.d("Error deleting directory: %s: %s", new Object[]{e.getClass().getCanonicalName(), e.getMessage()});
                }
                ((lzn0) ((a2w) this.d).g.b).e();
                return;
            case 9:
                r0w r0wVar2 = (r0w) this.b;
                i8h1 i8h1Var3 = r0wVar2.a;
                x6h1 x6h1VarC4 = r0wVar2.b.b.c();
                x6h1VarC4.i.add(new a7h1("user_social_handle_text", knl0.a(2), (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                y6h1 y6h1VarA2 = x6h1VarC4.a();
                b7x b7xVar2 = b7x.a;
                i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar2), new x7h1("ui_reveal", 1, b7xVar2), y6h1VarA2, r6h1.c, System.currentTimeMillis()), (xj61) null);
                dg30 dg30Var = (dg30) this.c;
                lrz0 lrz0Var = ((dzv) obj).b;
                StringBuilder sb = new StringBuilder();
                int i = lrz0Var.a;
                int i2 = lrz0Var.c;
                int i3 = lrz0Var.b;
                if (i <= 0 || i3 <= 0) {
                    sb.append(dg30Var.getString(2131955349));
                } else {
                    Resources resources = dg30Var.getResources();
                    int i4 = lrz0Var.a;
                    sb.append(resources.getQuantityString(2131820673, i4, Integer.valueOf(i4), Integer.valueOf(i3)));
                }
                int i5 = i3 >= 2 ? i3 : 2;
                if (1 <= i2 && i2 <= i5) {
                    sb.append(dg30Var.getResources().getQuantityString(2131820674, i2, Integer.valueOf(i2)));
                }
                String string = sb.toString();
                lls0 lls0Var = (lls0) this.d;
                dg30 dg30Var2 = (dg30) lls0Var.c;
                if (lls0Var.b) {
                    return;
                }
                lls0Var.b = true;
                ViewGroup viewGroup2 = (ViewGroup) dg30Var2.getWindow().getDecorView();
                ComposeView composeView = new ComposeView(dg30Var2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                composeView.setViewCompositionStrategy(p5x0.W0);
                composeView.setContent(new j2i(-1277598027, new n7m(lls0Var, viewGroup2, composeView, string, (byte) 15), true));
                viewGroup2.addView(composeView);
                return;
            case 10:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                p7w p7wVar = (p7w) this.b;
                rrr rrrVar = (rrr) this.c;
                rrr rrrVar2 = (rrr) this.d;
                if (zBooleanValue) {
                    rrrVar.b.invoke(p7wVar);
                    return;
                } else {
                    rrrVar2.b.invoke(p7wVar);
                    return;
                }
            case 11:
                Boolean bool = (Boolean) obj;
                ((l811) this.b).a = bool.booleanValue();
                obx obxVar = (obx) this.c;
                y570 y570Var = (y570) this.d;
                String str7 = bool.booleanValue() ? "followButtonTextFollowedState" : "followButtonTextUnfollowedState";
                ld70 ld70Var = y570Var.k().a.c;
                if (ld70Var == null || (str2 = ld70Var.a.c) == null) {
                    ld70 ld70Var2 = y570Var.k().a.c;
                    str = ld70Var2 != null ? ld70Var2.a.d : null;
                    str2 = str == null ? "" : str;
                }
                String str8 = y570Var.n().a.a;
                if (str8 == null) {
                    str8 = "";
                }
                String strB = y570Var.g().B(str7);
                obxVar.c.f(new wo6(str2, str8, strB != null ? strB : ""));
                return;
            case 12:
                wv00 wv00Var = (uv00) obj;
                ArrayList<ev00> arrayList = (ArrayList) this.b;
                ArrayList<mmr0> arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                for (ev00 ev00Var : arrayList) {
                    jh5 jh5Var = new jh5(ev00Var.c, ev00Var.a);
                    wdg wdgVar = ev00Var.b;
                    String str9 = ev00Var.a;
                    boolean z2 = wv00Var.f;
                    tv00 tv00VarA = wv00Var.a(wdgVar.n(), str9);
                    ez00 ez00Var = tv00VarA.b;
                    if (ez00Var != null) {
                        h3rVar = new j3r(ez00Var);
                    } else {
                        sv00 sv00Var = tv00VarA.c;
                        int i6 = sv00Var.b;
                        h3rVar = ((i6 == 4 || i6 == 5) && sv00Var.a) ? h3r.b : z2 ? i3r.a : new h3r(new d3r(l1d.m("Missing extension data for ", tv00VarA.a)));
                    }
                    arrayList2.add(new mmr0(jh5Var, h3rVar));
                }
                fv00 fv00Var = (fv00) this.c;
                ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                for (mmr0 mmr0Var2 : arrayList2) {
                    jh5 jh5Var2 = (jh5) mmr0Var2.a;
                    j3r j3rVar = (k3r) mmr0Var2.b;
                    if (j3rVar instanceof j3r) {
                        fv00Var.k.put(jh5Var2, j3rVar.a);
                        mmr0Var = new mmr0(jh5Var2, j3rVar);
                    } else if ((j3rVar instanceof h3r) && (((h3r) j3rVar).a instanceof c3r)) {
                        fv00Var.k.remove(jh5Var2);
                        Object obj2 = fv00Var.j.get(jh5Var2);
                        mmr0Var = obj2 != null ? new mmr0(jh5Var2, new j3r(obj2)) : new mmr0(jh5Var2, j3rVar);
                    } else {
                        Object obj3 = fv00Var.k.get(jh5Var2);
                        if (obj3 == null) {
                            obj3 = fv00Var.j.get(jh5Var2);
                        }
                        mmr0Var = obj3 != null ? new mmr0(jh5Var2, new j3r(obj3)) : new mmr0(jh5Var2, j3rVar);
                    }
                    arrayList3.add(mmr0Var);
                }
                ((fv00) this.c).d.invoke(arrayList3);
                fv00 fv00Var2 = (fv00) this.c;
                if (fv00Var2.b || (str3 = (Disposable) ((p811) this.d).a) == null) {
                    return;
                }
                str = wv00Var.f ? null : str3;
                if (str != null) {
                    synchronized (fv00Var2.g) {
                        fv00Var2.h.remove(str);
                    }
                    str.dispose();
                    return;
                }
                return;
            case 13:
                vb50 vb50Var = (vb50) obj;
                String str10 = vb50Var.a;
                tbr0 tbr0Var = (tbr0) this.b;
                boolean z3 = vb50Var.b;
                tbr0Var.a(new y231(new oc50(z3)));
                kt91 kt91Var = (kt91) this.c;
                Resources resources2 = (Resources) this.d;
                String string2 = z3 ? resources2.getString(2131956428, str10) : resources2.getString(2131956430, str10);
                string2.getClass();
                kt91Var.k(new er91((fs91) null, string2, (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return;
            case 14:
                lkb0 lkb0Var = (lkb0) this.b;
                HubsImmutableComponentBundle hubsImmutableComponentBundleR = ((u570) this.d).b.r();
                String str11 = (String) this.c;
                x6h1 x6h1VarG = y1a1.G(hubsImmutableComponentBundleR, lkb0Var.d.getViewUri().a);
                x6h1VarG.g = "22.0.0";
                lkb0Var.a.a((String) obj, lkb0Var.b.m(new x5j1(x6h1VarG.a(), (byte) 12).f().n(str11), (xj61) null), (Bundle) null);
                return;
            case 15:
                mmr0 mmr0Var3 = (mmr0) obj;
                w2h w2hVar = (w2h) this.d;
                xqd0 xqd0Var = (xqd0) w2hVar.d;
                t8r0 t8r0Var = ((xqd0) this.b).t;
                com.spotify.mobius.functions.Consumer consumer = (com.spotify.mobius.functions.Consumer) this.c;
                jsd0 jsd0Var = (psd0) mmr0Var3.a;
                bp90 bp90Var = (bp90) mmr0Var3.b;
                Logger.b("[LiveSharing] Handling state: " + jsd0Var + " in the connectable.", new Object[0]);
                boolean z4 = jsd0Var instanceof zrd0;
                if (z4 || (jsd0Var instanceof asd0) || (jsd0Var instanceof osd0)) {
                    if (!((z4 || (jsd0Var instanceof osd0)) ? bp90Var.c : jsd0Var instanceof asd0 ? bp90Var.e : true)) {
                        consumer.accept(new ktd0(z4 || (jsd0Var instanceof osd0)));
                        return;
                    }
                }
                if ((jsd0Var instanceof asd0) || z4 || (jsd0Var instanceof osd0) || (jsd0Var instanceof ksd0)) {
                    consumer.accept(new ysd0(jsd0Var, ((lx91) t8r0Var.a).k.e().b));
                    return;
                }
                if (jsd0Var instanceof jsd0) {
                    ((vku) w2hVar.b).a(yoi1.i(xqd0Var.f.a(), o6x.a).subscribeOn(xqd0Var.c).subscribe(new w090((com.spotify.mobius.functions.Consumer) w2hVar.e, xqd0Var, (byte) 7)));
                    String str12 = ((lx91) t8r0Var.a).k.e().g;
                    str = str12.length() != 0 ? str12 : null;
                    String str13 = jsd0Var.a;
                    if (u890.j(str, str13)) {
                        consumer.accept(new ysd0(new jsd0(str13), ((lx91) t8r0Var.a).k.e().b));
                        return;
                    } else {
                        try {
                            ((up90) xqd0Var.t.b).e.p.onNext(new v3a1(str13, true, new wea0(xea0.g), Collections.singleton(ko90.d), 1));
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                if (jsd0Var instanceof nsd0) {
                    nsd0 nsd0Var = (nsd0) jsd0Var;
                    if (nsd0Var instanceof lsd0) {
                        mtd0Var = mtd0.a;
                    } else {
                        if (!(nsd0Var instanceof msd0)) {
                            eg.o();
                            return;
                        }
                        mtd0Var = ntd0.a;
                    }
                    consumer.accept(mtd0Var);
                    return;
                }
                if (jsd0Var instanceof dsd0) {
                    consumer.accept(ltd0.a);
                    return;
                }
                if ((jsd0Var instanceof bsd0) || (jsd0Var instanceof csd0)) {
                    consumer.accept(jtd0.a);
                    return;
                }
                if (jsd0Var instanceof isd0) {
                    isd0 isd0Var = (isd0) jsd0Var;
                    if (isd0Var instanceof gsd0) {
                        consumer.accept(new itd0(((gsd0) jsd0Var).a));
                        return;
                    }
                    if (isd0Var instanceof hsd0) {
                        Logger.b("[LiveSharing] Failed to end live-sharing.", new Object[0]);
                        return;
                    } else if (isd0Var instanceof fsd0) {
                        consumer.accept(htd0.a);
                        return;
                    } else {
                        eg.o();
                        return;
                    }
                }
                return;
            case 16:
                Context context = (Context) this.d;
                eur eurVar = (eur) this.c;
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                km0 km0Var = (km0) this.b;
                if (zBooleanValue2) {
                    km0Var.b = eurVar.b(new fwi0(ywi0.b, context.getString(2131958895), context.getString(2131958894), (vvi0) null, 120), k8b0.O0);
                    return;
                }
                String str14 = (String) km0Var.b;
                if (str14 != null) {
                    eurVar.a(str14);
                    return;
                }
                return;
            case 17:
                arp0 arp0Var = (arp0) obj;
                ((drp0) this.c).e.a(wdu0.a(arp0Var.a, arp0Var.b, (n2v) this.b), (tv80) this.d, (Bundle) null);
                return;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                rcd1 rcd1Var = (rcd1) obj;
                if (rcd1Var instanceof pcd1) {
                    pcd1 pcd1Var = (pcd1) rcd1Var;
                    ((nso0) this.b).invoke(pcd1Var.a, Boolean.valueOf(pcd1Var.b));
                    return;
                } else if (!rcd1Var.equals(qcd1.a)) {
                    eg.o();
                    return;
                } else {
                    ((exp0) this.c).b("sampled_idle");
                    ((gpc) this.d).invoke();
                    return;
                }
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                ygw ygwVar = (ygw) this.d;
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.setData((Uri) obj);
                qbs0 qbs0Var = (qbs0) this.b;
                String str15 = (String) this.c;
                if (str15 == null) {
                    str15 = ygwVar.b;
                }
                qbs0Var.b1(str15, intent);
                try {
                    pf30 pf30Var = qbs0Var.K1;
                    if (pf30Var != null) {
                        pf30Var.a(intent);
                        return;
                    } else {
                        u890.C("launcher");
                        throw null;
                    }
                } catch (Exception e2) {
                    qbs0Var.Z0().U(new x300(ygwVar.a, e2));
                    return;
                }
            case 20:
                bds0 bds0Var = (bds0) obj;
                cds0 cds0Var = bds0Var.a;
                String str16 = cds0Var.a;
                String str17 = (String) this.c;
                if (str17 == null) {
                    str17 = cds0Var.b;
                }
                ((y5v0) this.b).c(str16, cds0Var.c, str17, cds0Var.d, cds0Var.e, (String) this.d, cds0Var.f, bds0Var.b.a, cds0Var.g);
                return;
            case 21:
                x4x0 x4x0Var = (x4x0) obj;
                oxi0 oxi0Var = (oxi0) this.b;
                String str18 = x4x0Var.d;
                oxi0Var.a(pcf.g(str18), false);
                ((wmy) this.c).J(str18, x4x0Var.e, ((c4n0) this.d).getViewUri().a);
                return;
            case 22:
                m6w m6wVar = (o6w) obj;
                sdx0 sdx0Var = (sdx0) this.b;
                if (!(m6wVar instanceof m6w) || !m6wVar.a) {
                    sdx0Var.j.onNext(Boolean.FALSE);
                    return;
                }
                List list2 = (List) this.c;
                udx0 udx0Var = (udx0) this.d;
                bpb1 bpb1Var2 = sdx0Var.g;
                for (odx0 odx0Var : ((Map) bpb1Var2.getValue()).values()) {
                    sdx0Var.e.C(odx0Var.b());
                    odx0Var.stop();
                }
                bpb1Var2.m((Object) null, b7x.a);
                sdx0Var.h.b(sdx0Var.a(list2, true, udx0Var).n(sdx0Var.b).subscribe(new wqd0(sdx0Var, (byte) 25), new lyw0(sdx0Var, (byte) 7)));
                return;
            case 23:
                nnh nnhVar = (nnh) obj;
                NotificationManager notificationManager = (NotificationManager) this.d;
                if (Build.VERSION.SDK_INT < 33) {
                    zAreNotificationsEnabled = notificationManager.areNotificationsEnabled();
                } else if (x74.j((Context) this.c, "android.permission.POST_NOTIFICATIONS") == 0 && notificationManager.areNotificationsEnabled()) {
                    zAreNotificationsEnabled = true;
                }
                gpo0 gpo0Var = (gpo0) this.b;
                String str19 = nnhVar.a;
                if (!gpo0Var.c.c()) {
                    gpo0Var.e.post(new jg0(gpo0Var.d.a(), gpo0Var, zAreNotificationsEnabled, str19));
                    return;
                }
                Set set = s4b1.f;
                String strZ = uic.x("spotify:internal:comments:notification-opt-in").z();
                if (strZ == null) {
                    return;
                }
                a1r0.j(gpo0Var.a, strZ, (String) null, mno1.h(new mmr0[]{new mmr0("granted", Boolean.valueOf(zAreNotificationsEnabled)), new mmr0("page_uri", str19)}), true, 2);
                return;
            case 24:
                i0w0 i0w0Var = (i0w0) obj;
                Parcelable.Creator creator = lik1.CREATOR;
                Set set2 = s4b1.f;
                String str20 = ((w2w0) this.b).a;
                String strZ2 = uic.x(str20).z();
                if (strZ2 == null) {
                    strZ2 = "";
                }
                String str21 = strZ2;
                lik1 lik1Var = new lik1(str21);
                Observable observableJust = Observable.just(((rd3) this.c).a(i0w0Var.d, i0w0Var.f, i0w0Var.e, new sd3(i0w0Var.h, (ok51) null, 2), i0w0Var.g, lik1Var, str21));
                mfm mfmVarA = ((i4q) this.d).a(lik1Var);
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                mfm.b(mfmVarA, observableJust, yon1.G1("CONTEXTMENU_ALBUMPRERELEASE", "contextmenu/albumprerelease", 417, "contextmenu"), new bjm(6, str20, (String) null), i0w0Var.i, 16);
                return;
            case 25:
                oxd0 oxd0Var = (oxd0) obj;
                int iC = l1d.C(oxd0Var.c);
                if (iC == 0 || iC == 1) {
                    j = 0;
                } else if (iC != 2) {
                    if (iC != 3) {
                        eg.o();
                        return;
                    }
                    j = 0;
                } else {
                    j = 500;
                }
                if (j > 0) {
                    ((Scheduler) this.d).d(new aih0(this, oxd0Var, false, (byte) 24), j, TimeUnit.MILLISECONDS);
                    return;
                } else {
                    c(oxd0Var);
                    return;
                }
            case 26:
                nf81 nf81Var = (nf81) obj;
                spq0 spq0Var = nf81Var.a;
                spq0 spq0Var2 = nf81Var.b;
                rku rkuVar = (rku) this.b;
                pf81 pf81Var = (pf81) this.d;
                String str22 = (String) this.c;
                pf81Var.getClass();
                spq0 spq0Var3 = nf81Var.c;
                if (spq0Var3.c() && str22.length() > 0 && ((((u3u0) spq0Var3.b()).a == null || ((u3u0) spq0Var3.b()).b == null) && (spq0Var.c() || spq0Var2.c()))) {
                    Boolean bool2 = Boolean.FALSE;
                    Boolean bool3 = (Boolean) spq0Var.e(spq0Var2.e(bool2));
                    if (bool3.booleanValue() && ((Boolean) spq0Var2.e(bool2)).booleanValue()) {
                        z = true;
                    }
                    completableAndThenCompletableA = pf81Var.a(str22, bool3.booleanValue(), z, true);
                } else {
                    completableAndThenCompletableA = CompletableEmpty.a;
                    completableAndThenCompletableA.getClass();
                }
                rkuVar.b(completableAndThenCompletableA.subscribe());
                return;
            case 27:
                ((xx91) this.b).p.onNext(new j3a1((Boolean) this.c, (kx91) this.d));
                return;
            case 28:
                a(obj);
                return;
            default:
                mac1 mac1Var = (mac1) obj;
                zhq0 zhq0Var = ((qy7) this.b).f;
                if (zhq0Var == null) {
                    u890.C("playCommandHandler");
                    throw null;
                }
                zhq0Var.o(pgt0.a);
                h5a1 h5a1Var = (h5a1) this.c;
                int i7 = mac1Var.c;
                th30 th30Var = (th30) ((he7) h5a1Var.b).c;
                k7c1 k7c1VarF = th30Var.F(2131431098);
                if (k7c1VarF instanceof k7c1) {
                    k7c1 k7c1Var = k7c1VarF;
                    if (k7c1Var.Y0() == i7) {
                        k7b1 k7b1Var = k7c1Var.G1;
                        if (k7b1Var == null) {
                            u890.C("storyStateProvider");
                            throw null;
                        }
                        n9c1 n9c1Var = (n9c1) k7b1Var.invoke(Integer.valueOf(k7c1Var.Y0()));
                        v9c1 v9c1Var = k7c1Var.M1;
                        if (v9c1Var != null) {
                            ViewGroup viewGroup3 = v9c1Var.e;
                            if ((n9c1Var instanceof l9c1) && ((zf30) k7c1Var).s1.i.a(w8c0.e)) {
                                int iY0 = k7c1Var.Y0();
                                a6c1 a6c1Var = v9c1Var.h;
                                if (a6c1Var != null) {
                                    viewGroup3.removeViewAt(0);
                                    fn31.T(v9c1Var.Y, (o8n) null, 0, new xba1(a6c1Var, (lnm) null, (byte) 15), 3);
                                    v9c1Var.i = false;
                                    View viewE = a6c1Var.e(v9c1Var.d, v9c1Var.c);
                                    aiq0.a(viewE, new cv70(viewE, a6c1Var, v9c1Var, iY0, (byte) 2));
                                    viewGroup3.addView(viewE, 0);
                                    v9c1Var.a(kas0.b);
                                }
                            }
                        }
                    } else {
                        nu9 nu9Var = new nu9(th30Var);
                        k7c1 k7c1Var2 = new k7c1();
                        Bundle bundle = new Bundle();
                        bundle.putInt("story_index", i7);
                        k7c1Var2.T0(bundle);
                        nu9Var.n(2131431098, k7c1Var2, (String) null);
                        nu9Var.f();
                    }
                } else {
                    nu9 nu9Var2 = new nu9(th30Var);
                    k7c1 k7c1Var3 = new k7c1();
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("story_index", i7);
                    k7c1Var3.T0(bundle2);
                    nu9Var2.n(2131431098, k7c1Var3, (String) null);
                    nu9Var2.f();
                }
                ((ptj) this.d).invoke(new i5c1(i7));
                return;
        }
    }

    public void c(oxd0 oxd0Var) {
        mmr0 mmr0Var;
        String str;
        Context context = (Context) this.b;
        int i = oxd0Var.c;
        a0e0 a0e0Var = oxd0Var.a;
        int iC = l1d.C(i);
        if (iC == 0 || iC == 1) {
            mmr0Var = new mmr0(2131957616, 2131957615);
        } else if (iC != 2) {
            if (iC != 3) {
                eg.o();
                return;
            }
            mmr0Var = new mmr0(2131957616, 2131957615);
        } else {
            mmr0Var = new mmr0(2131957636, 2131957635);
        }
        int iIntValue = ((Number) mmr0Var.a).intValue();
        int iIntValue2 = ((Number) mmr0Var.b).intValue();
        String string = context.getString(iIntValue);
        String string2 = context.getString(iIntValue2);
        String str2 = a0e0Var.a;
        String str3 = a0e0Var.c;
        String string3 = context.getString(2131957614);
        String str4 = a0e0Var.b;
        String string4 = context.getString(2131957634);
        int iC2 = l1d.C(i);
        if (iC2 == 0) {
            str = "locked_play_button";
        } else if (iC2 == 1) {
            str = "locked_notify_me";
        } else if (iC2 == 2) {
            str = "notify_me_free_user";
        } else {
            if (iC2 != 3) {
                eg.o();
                return;
            }
            str = "";
        }
        dzh1 dzh1Var = new dzh1(string, string2, str2, str3, string3, str4, "spotify:upsell:premium_in_app_destination?displayReason=kpop_upsell:listening_parties", string4, str);
        tv80 tv80Var = oxd0Var.b;
        ezh1 ezh1Var = (ezh1) this.c;
        if (tv80Var != null) {
            ezh1Var.a(dzh1Var, tv80Var, true);
        } else {
            ezh1Var.b(dzh1Var, true);
        }
    }

    public /* synthetic */ qg7(Object obj, Object obj2, String str, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = str;
    }

    public /* synthetic */ qg7(String str, Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = str;
        this.b = obj;
        this.d = obj2;
    }
}
