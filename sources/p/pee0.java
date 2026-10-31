package p;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.base.java.logging.Logger;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.mobius.Connection;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.functions.Consumer;
import com.spotify.nowplaying.scroll.ScrollCardType;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class pee0 implements Connection {
    public final /* synthetic */ byte a;
    public final Object b;
    public final /* synthetic */ Object c;

    public pee0(ku1 ku1Var) {
        this.a = (byte) 4;
        this.c = ku1Var;
        this.b = new rku();
    }

    private final void a(Object obj) {
        Object m1w0Var;
        Object s1w0Var;
        int i;
        Object x1w0Var;
        Object g2w0Var;
        z1w0 z1w0Var;
        w7h1 w7h1Var;
        w1w0 w1w0Var;
        u1w0 u1w0Var;
        h2w0 h2w0Var = (h2w0) obj;
        Consumer consumer = (Consumer) this.b;
        bfz bfzVar = (bfz) this.c;
        zok0 zok0Var = (zok0) bfzVar.c;
        y6h1 y6h1Var = zok0Var.b;
        boolean z = h2w0Var instanceof j1w0;
        b7x b7xVar = b7x.a;
        tv80 tv80VarM = null;
        if (z) {
            i8h1 i8h1VarA = bfzVar.a();
            x6h1 x6h1VarC = y6h1Var.c();
            x6h1VarC.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            x6h1 x6h1VarC2 = x6h1VarC.a().c();
            x6h1VarC2.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = false;
            i8h1VarA.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
            x1w0Var = (j1w0) h2w0Var;
        } else {
            if (h2w0Var instanceof k1w0) {
                k1w0 k1w0Var = (k1w0) h2w0Var;
                i8h1 i8h1VarA2 = bfzVar.a();
                x6h1 x6h1VarC3 = y6h1Var.c();
                x6h1VarC3.i.add(new a7h1("track_list", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                y6h1 y6h1VarA = x6h1VarC3.a();
                String str = k1w0Var.a;
                x6h1 x6h1VarC4 = y6h1VarA.c();
                x6h1VarC4.i.add(new a7h1("track_row", (String) null, (Integer) null, str, (String) null));
                x6h1VarC4.j = false;
                x6h1 x6h1VarC5 = x6h1VarC4.a().c();
                x6h1VarC5.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = false;
                m1w0Var = new c2w0(k1w0Var.a, k1w0Var.b, i8h1VarA2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis()), (xj61) null));
            } else if (!(h2w0Var instanceof l1w0) && !(h2w0Var instanceof n1w0)) {
                String str2 = "";
                if (h2w0Var instanceof o1w0) {
                    t2w0 t2w0Var = (t2w0) bfzVar.d;
                    if (t2w0Var != null) {
                        List list = t2w0Var.b.m;
                        if (list.size() == 1) {
                            String str3 = ((nyv0) list.get(0)).a;
                            i8h1 i8h1VarA3 = bfzVar.a();
                            x6h1 x6h1VarC6 = y6h1Var.c();
                            x6h1VarC6.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC6.j = false;
                            x6h1 x6h1VarC7 = x6h1VarC6.a().c();
                            x6h1VarC7.i.add(new a7h1("creator_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC7.j = false;
                            y6h1 y6h1VarA2 = x6h1VarC7.a();
                            z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                            if (str3 != null) {
                                x1w0Var = h2w0Var;
                                x1w0Var = h2w0Var;
                                str2 = str3;
                            }
                            x1w0Var = h2w0Var;
                            x1w0Var = h2w0Var;
                            x1w0Var = new o1w0(i8h1VarA3.m(new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), y6h1VarA2, r6h1.c, System.currentTimeMillis()), (xj61) null));
                        } else {
                            x1w0Var = h2w0Var;
                            x1w0Var = h2w0Var;
                            i8h1 i8h1VarA4 = bfzVar.a();
                            x6h1 x6h1VarC8 = y6h1Var.c();
                            x6h1VarC8.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC8.j = false;
                            x6h1 x6h1VarC9 = x6h1VarC8.a().c();
                            x6h1VarC9.i.add(new a7h1("creator_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC9.j = false;
                            x1w0Var = new o1w0(i8h1VarA4.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC9.a(), r6h1.c, System.currentTimeMillis()), (xj61) null));
                        }
                    } else {
                        x1w0Var = h2w0Var;
                        x1w0Var = h2w0Var;
                        x1w0Var = (o1w0) h2w0Var;
                    }
                } else if (h2w0Var instanceof p1w0) {
                    x1w0Var = h2w0Var;
                    x1w0Var = h2w0Var;
                    bfzVar.a().f(zok0Var.e(), (Set) null);
                    x1w0Var = h2w0Var;
                } else if (h2w0Var instanceof q1w0) {
                    t2w0 t2w0Var2 = (t2w0) bfzVar.d;
                    if (t2w0Var2 != null) {
                        x1w0Var = h2w0Var;
                        x1w0Var = h2w0Var;
                        String str4 = t2w0Var2.b.i;
                        i8h1 i8h1VarA5 = bfzVar.a();
                        x6h1 x6h1VarC10 = y6h1Var.c();
                        x6h1VarC10.i.add(new a7h1("presave_button", "Listen Now", (Integer) null, (String) null, "Listen Now"));
                        x6h1VarC10.j = true;
                        x1w0Var = new q1w0(i8h1VarA5.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str4)), x6h1VarC10.a(), r6h1.c, System.currentTimeMillis()), (xj61) null));
                    } else {
                        x1w0Var = h2w0Var;
                        x1w0Var = h2w0Var;
                        x1w0Var = (q1w0) h2w0Var;
                    }
                } else {
                    if (h2w0Var instanceof t1w0) {
                        x1w0Var = h2w0Var;
                        x1w0Var = h2w0Var;
                        t1w0 t1w0Var = (t1w0) h2w0Var;
                        String str5 = t1w0Var.c;
                        String str6 = t1w0Var.a;
                        i8h1 i8h1VarA6 = bfzVar.a();
                        x6h1 x6h1VarC11 = y6h1Var.c();
                        x6h1VarC11.i.add(new a7h1("merch_carousel", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC11.j = true;
                        y6h1 y6h1VarA3 = x6h1VarC11.a();
                        int i2 = t1w0Var.b;
                        Integer numValueOf = Integer.valueOf(i2);
                        x6h1 x6h1VarC12 = y6h1VarA3.c();
                        x6h1VarC12.i.add(new a7h1("merch_item", str6, numValueOf, str5, (String) null));
                        x6h1VarC12.j = true;
                        g2w0Var = new t1w0(i2, str6, str5, i8h1VarA6.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", str5)), x6h1VarC12.a(), r6h1.c, System.currentTimeMillis()), (xj61) null));
                    } else if (h2w0Var instanceof u1w0) {
                        u1w0Var = (u1w0) h2w0Var;
                        if (((t2w0) bfzVar.d) != null) {
                            if (u1w0Var.b) {
                                x1w0Var = h2w0Var;
                                x1w0Var = h2w0Var;
                                x1w0Var = u1w0Var;
                                i8h1 i8h1VarA7 = bfzVar.a();
                                x6h1 x6h1VarC13 = y6h1Var.c();
                                x6h1VarC13.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC13.j = false;
                                y6h1 y6h1VarA4 = x6h1VarC13.a();
                                String str7 = u1w0Var.a;
                                x6h1 x6h1VarC14 = y6h1VarA4.c();
                                x6h1VarC14.i.add(new a7h1("mute_button", (String) null, (Integer) null, str7, (String) null));
                                x6h1VarC14.j = false;
                                i8h1VarA7.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("mute_playback", 1, b7xVar), x6h1VarC14.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                                x1w0Var = u1w0Var;
                            } else {
                                x1w0Var = h2w0Var;
                                x1w0Var = h2w0Var;
                                x1w0Var = u1w0Var;
                                i8h1 i8h1VarA8 = bfzVar.a();
                                x6h1 x6h1VarC15 = y6h1Var.c();
                                x6h1VarC15.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC15.j = false;
                                y6h1 y6h1VarA5 = x6h1VarC15.a();
                                String str8 = u1w0Var.a;
                                x6h1 x6h1VarC16 = y6h1VarA5.c();
                                x6h1VarC16.i.add(new a7h1("mute_button", (String) null, (Integer) null, str8, (String) null));
                                x6h1VarC16.j = false;
                                i8h1VarA8.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("unmute_playback", 1, b7xVar), x6h1VarC16.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                                x1w0Var = u1w0Var;
                            }
                        }
                    } else if (!(h2w0Var instanceof v1w0)) {
                        if (h2w0Var instanceof w1w0) {
                            t2w0 t2w0Var3 = (t2w0) bfzVar.d;
                            w1w0Var = (w1w0) h2w0Var;
                            if (t2w0Var3 != null) {
                                int i3 = w1w0Var.a;
                                String str9 = ((a3w0) t2w0Var3.e.get(i3)).a;
                                i8h1 i8h1VarA9 = bfzVar.a();
                                x6h1 x6h1VarC17 = y6h1Var.c();
                                x6h1VarC17.i.add(new a7h1("playlist_carousel", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC17.j = false;
                                y6h1 y6h1VarA6 = x6h1VarC17.a();
                                Integer numValueOf2 = Integer.valueOf(i3);
                                x6h1 x6h1VarC18 = y6h1VarA6.c();
                                x6h1VarC18.i.add(new a7h1("playlist_item", (String) null, numValueOf2, str9, (String) null));
                                x6h1VarC18.j = false;
                                y6h1 y6h1VarA7 = x6h1VarC18.a();
                                z7h1 z7h1Var2 = new z7h1("hit", 1, b7xVar);
                                if (str9 != null) {
                                    x1w0Var = h2w0Var;
                                    x1w0Var = h2w0Var;
                                    x1w0Var = h2w0Var;
                                    x1w0Var = w1w0Var;
                                    str2 = str9;
                                }
                                x1w0Var = h2w0Var;
                                x1w0Var = h2w0Var;
                                x1w0Var = h2w0Var;
                                x1w0Var = w1w0Var;
                                m1w0Var = new w1w0(i3, i8h1VarA9.m(new w7h1("", "", z7h1Var2, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), y6h1VarA7, r6h1.c, System.currentTimeMillis()), (xj61) null));
                            }
                        } else if (h2w0Var instanceof z1w0) {
                            t2w0 t2w0Var4 = (t2w0) bfzVar.d;
                            z1w0Var = (z1w0) h2w0Var;
                            if (t2w0Var4 != null) {
                                String str10 = t2w0Var4.a;
                                String strM = l1d.m("spotify:prerelease:", str10);
                                if (z1w0Var.a) {
                                    x6h1 x6h1VarC19 = y6h1Var.c();
                                    x6h1VarC19.i.add(new a7h1("presave_button", "Presave", (Integer) null, (String) null, "Presave"));
                                    x6h1VarC19.j = true;
                                    y6h1 y6h1VarA8 = x6h1VarC19.a();
                                    z7h1 z7h1Var3 = new z7h1("hit", 1, b7xVar);
                                    if (str10 != null) {
                                        x1w0Var = h2w0Var;
                                        x1w0Var = h2w0Var;
                                        x1w0Var = h2w0Var;
                                        x1w0Var = z1w0Var;
                                        str2 = str10;
                                    }
                                    x1w0Var = h2w0Var;
                                    x1w0Var = h2w0Var;
                                    x1w0Var = h2w0Var;
                                    x1w0Var = z1w0Var;
                                    w7h1Var = new w7h1("", "", z7h1Var3, new x7h1("presave", 1, sqg0.J(new mmr0[]{new mmr0("prerelease_id", str2), new mmr0("item_to_be_presaved", strM), new mmr0("context_uri", strM)})), y6h1VarA8, r6h1.c, System.currentTimeMillis());
                                } else {
                                    x6h1 x6h1VarC20 = y6h1Var.c();
                                    x6h1VarC20.i.add(new a7h1("presave_button", "Presaved", (Integer) null, (String) null, "Presaved"));
                                    x6h1VarC20.j = true;
                                    y6h1 y6h1VarA9 = x6h1VarC20.a();
                                    z7h1 z7h1Var4 = new z7h1("hit", 1, b7xVar);
                                    if (str10 != null) {
                                        x1w0Var = h2w0Var;
                                        x1w0Var = h2w0Var;
                                        x1w0Var = h2w0Var;
                                        x1w0Var = z1w0Var;
                                        str2 = str10;
                                    }
                                    x1w0Var = h2w0Var;
                                    x1w0Var = h2w0Var;
                                    x1w0Var = h2w0Var;
                                    x1w0Var = z1w0Var;
                                    w7h1Var = new w7h1("", "", z7h1Var4, new x7h1("remove_presave", 1, sqg0.J(new mmr0[]{new mmr0("prerelease_id", str2), new mmr0("item_to_be_removed_from_presaved", strM), new mmr0("context_uri", strM)})), y6h1VarA9, r6h1.c, System.currentTimeMillis());
                                }
                                bfzVar.a().m(w7h1Var, (xj61) null);
                                x1w0Var = z1w0Var;
                            }
                        } else if (h2w0Var instanceof b2w0) {
                            x1w0Var = h2w0Var;
                            x1w0Var = h2w0Var;
                            x1w0Var = h2w0Var;
                            i8h1 i8h1VarA10 = bfzVar.a();
                            x6h1 x6h1VarC21 = y6h1Var.c();
                            x6h1VarC21.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC21.j = false;
                            x6h1 x6h1VarC22 = x6h1VarC21.a().c();
                            x6h1VarC22.i.add(new a7h1("share_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC22.j = false;
                            x1w0Var = new b2w0(i8h1VarA10.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC22.a(), r6h1.c, System.currentTimeMillis()), (xj61) null));
                        } else if (!(h2w0Var instanceof d2w0) && !(h2w0Var instanceof e2w0)) {
                            if (h2w0Var instanceof f2w0) {
                                String str11 = ((f2w0) h2w0Var).a;
                                i8h1 i8h1VarA11 = bfzVar.a();
                                x6h1 x6h1VarC23 = y6h1Var.c();
                                x6h1VarC23.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC23.j = false;
                                x6h1 x6h1VarC24 = x6h1VarC23.a().c();
                                x6h1VarC24.i.add(new a7h1("banner_image", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC24.j = false;
                                y6h1 y6h1VarA10 = x6h1VarC24.a();
                                z7h1 z7h1Var5 = new z7h1("hit", 1, b7xVar);
                                if (str11 != null) {
                                    x1w0Var = h2w0Var;
                                    x1w0Var = h2w0Var;
                                    x1w0Var = h2w0Var;
                                    x1w0Var = h2w0Var;
                                    x1w0Var = h2w0Var;
                                    str2 = str11;
                                }
                                x1w0Var = h2w0Var;
                                x1w0Var = h2w0Var;
                                x1w0Var = h2w0Var;
                                x1w0Var = h2w0Var;
                                x1w0Var = h2w0Var;
                                m1w0Var = new f2w0(str11, i8h1VarA11.m(new w7h1("", "", z7h1Var5, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), y6h1VarA10, r6h1.c, System.currentTimeMillis()), (xj61) null));
                            } else if (h2w0Var instanceof g2w0) {
                                g2w0 g2w0Var2 = (g2w0) h2w0Var;
                                String str12 = g2w0Var2.c;
                                i8h1 i8h1VarA12 = bfzVar.a();
                                x6h1 x6h1VarC25 = y6h1Var.c();
                                x6h1VarC25.i.add(new a7h1("video_carousel", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC25.j = false;
                                y6h1 y6h1VarA11 = x6h1VarC25.a();
                                int i4 = g2w0Var2.b;
                                Integer numValueOf3 = Integer.valueOf(i4);
                                String str13 = g2w0Var2.a;
                                x6h1 x6h1VarC26 = y6h1VarA11.c();
                                x6h1VarC26.i.add(new a7h1("video_card", str12, numValueOf3, str13, (String) null));
                                x6h1VarC26.j = true;
                                y6h1 y6h1VarA12 = x6h1VarC26.a();
                                String str14 = g2w0Var2.a;
                                z7h1 z7h1Var6 = new z7h1("hit", 1, b7xVar);
                                if (str14 != null) {
                                    x1w0Var = h2w0Var;
                                    x1w0Var = h2w0Var;
                                    x1w0Var = h2w0Var;
                                    x1w0Var = h2w0Var;
                                    x1w0Var = h2w0Var;
                                    str2 = str14;
                                }
                                x1w0Var = h2w0Var;
                                x1w0Var = h2w0Var;
                                x1w0Var = h2w0Var;
                                x1w0Var = h2w0Var;
                                x1w0Var = h2w0Var;
                                g2w0Var = new g2w0(i4, str14, str12, i8h1VarA12.m(new w7h1("", "", z7h1Var6, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), y6h1VarA12, r6h1.c, System.currentTimeMillis()), (xj61) null));
                            } else if (!(h2w0Var instanceof a2w0)) {
                                if (h2w0Var instanceof i1w0) {
                                    t2w0 t2w0Var5 = (t2w0) bfzVar.d;
                                    if (t2w0Var5 != null) {
                                        x1w0Var = h2w0Var;
                                        x1w0Var = h2w0Var;
                                        x1w0Var = h2w0Var;
                                        x1w0Var = h2w0Var;
                                        x1w0Var = h2w0Var;
                                        x1w0Var = h2w0Var;
                                        String strM2 = l1d.m("spotify:prerelease:", t2w0Var5.a);
                                        i8h1 i8h1VarA13 = bfzVar.a();
                                        x6h1 x6h1VarC27 = y6h1Var.c();
                                        x6h1VarC27.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
                                        x6h1VarC27.j = false;
                                        x6h1 x6h1VarC28 = x6h1VarC27.a().c();
                                        x6h1VarC28.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, strM2, (String) null));
                                        x6h1VarC28.j = false;
                                        x1w0Var = new i1w0(i8h1VarA13.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC28.a(), r6h1.c, System.currentTimeMillis()), (xj61) null));
                                    } else {
                                        x1w0Var = h2w0Var;
                                        x1w0Var = h2w0Var;
                                        x1w0Var = h2w0Var;
                                        x1w0Var = h2w0Var;
                                        x1w0Var = h2w0Var;
                                        x1w0Var = h2w0Var;
                                        x1w0Var = (i1w0) h2w0Var;
                                    }
                                } else {
                                    if (h2w0Var instanceof r1w0) {
                                        String str15 = ((r1w0) h2w0Var).a;
                                        wcl0 wcl0Var = (wcl0) bfzVar.e;
                                        if (wcl0Var != null) {
                                            x1w0Var = h2w0Var;
                                            x1w0Var = h2w0Var;
                                            x1w0Var = h2w0Var;
                                            x1w0Var = h2w0Var;
                                            x1w0Var = h2w0Var;
                                            x1w0Var = h2w0Var;
                                            tv80VarM = bfzVar.a().m(wcl0Var.a(str15), (xj61) null);
                                        }
                                        x1w0Var = h2w0Var;
                                        x1w0Var = h2w0Var;
                                        x1w0Var = h2w0Var;
                                        x1w0Var = h2w0Var;
                                        x1w0Var = h2w0Var;
                                        x1w0Var = h2w0Var;
                                        s1w0Var = new r1w0(str15, tv80VarM);
                                    } else if (h2w0Var instanceof s1w0) {
                                        s1w0 s1w0Var2 = (s1w0) h2w0Var;
                                        String str16 = s1w0Var2.a;
                                        boolean z2 = s1w0Var2.b;
                                        wcl0 wcl0Var2 = (wcl0) bfzVar.e;
                                        if (wcl0Var2 != null) {
                                            i8h1 i8h1VarA14 = bfzVar.a();
                                            x6h1 x6h1VarC29 = wcl0Var2.b.c();
                                            x6h1VarC29.i.add(new a7h1("room_description", (String) null, (Integer) null, (String) null, (String) null));
                                            x6h1VarC29.j = false;
                                            y6h1 y6h1VarA13 = x6h1VarC29.a();
                                            if (z2) {
                                                x1w0Var = h2w0Var;
                                                x1w0Var = h2w0Var;
                                                x1w0Var = h2w0Var;
                                                x1w0Var = h2w0Var;
                                                x1w0Var = h2w0Var;
                                                x1w0Var = h2w0Var;
                                                i = 1;
                                            } else {
                                                x1w0Var = h2w0Var;
                                                x1w0Var = h2w0Var;
                                                x1w0Var = h2w0Var;
                                                x1w0Var = h2w0Var;
                                                x1w0Var = h2w0Var;
                                                x1w0Var = h2w0Var;
                                                i = 2;
                                            }
                                            x6h1 x6h1VarC30 = y6h1VarA13.c();
                                            x6h1VarC30.i.add(new a7h1("primary_action_button", z9l0.e(i), (Integer) null, (String) null, (String) null));
                                            x6h1VarC30.j = false;
                                            tv80VarM = i8h1VarA14.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str16 != null ? str16 : "")), x6h1VarC30.a(), wcl0Var2.a, System.currentTimeMillis()), (xj61) null);
                                        }
                                        x1w0Var = h2w0Var;
                                        x1w0Var = h2w0Var;
                                        x1w0Var = h2w0Var;
                                        x1w0Var = h2w0Var;
                                        x1w0Var = h2w0Var;
                                        x1w0Var = h2w0Var;
                                        s1w0Var = new s1w0(str16, tv80VarM, z2);
                                    } else if (h2w0Var instanceof m1w0) {
                                        String str17 = ((m1w0) h2w0Var).a;
                                        i8h1 i8h1VarA15 = bfzVar.a();
                                        x6h1 x6h1VarC31 = y6h1Var.c();
                                        x6h1VarC31.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
                                        x6h1VarC31.j = false;
                                        x6h1 x6h1VarC32 = x6h1VarC31.a().c();
                                        x6h1VarC32.i.add(new a7h1("countdown_timer", (String) null, (Integer) null, (String) null, (String) null));
                                        x6h1VarC32.j = false;
                                        x6h1 x6h1VarC33 = x6h1VarC32.a().c();
                                        x6h1VarC33.i.add(new a7h1("bloom_image", (String) null, (Integer) null, (String) null, (String) null));
                                        x6h1VarC33.j = true;
                                        y6h1 y6h1VarA14 = x6h1VarC33.a();
                                        z7h1 z7h1Var7 = new z7h1("hit", 1, b7xVar);
                                        if (str17 != null) {
                                            x1w0Var = h2w0Var;
                                            x1w0Var = h2w0Var;
                                            x1w0Var = h2w0Var;
                                            x1w0Var = h2w0Var;
                                            x1w0Var = h2w0Var;
                                            x1w0Var = h2w0Var;
                                            str2 = str17;
                                        }
                                        x1w0Var = h2w0Var;
                                        x1w0Var = h2w0Var;
                                        x1w0Var = h2w0Var;
                                        x1w0Var = h2w0Var;
                                        x1w0Var = h2w0Var;
                                        x1w0Var = h2w0Var;
                                        m1w0Var = new m1w0(str17, i8h1VarA15.m(new w7h1("", "", z7h1Var7, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), y6h1VarA14, r6h1.c, System.currentTimeMillis()), (xj61) null));
                                    } else if (h2w0Var instanceof x1w0) {
                                        x1w0Var = h2w0Var;
                                        x1w0Var = h2w0Var;
                                        x1w0Var = h2w0Var;
                                        x1w0Var = h2w0Var;
                                        x1w0Var = h2w0Var;
                                        x1w0Var = h2w0Var;
                                        x6h1 x6h1VarC34 = y6h1Var.c();
                                        x6h1VarC34.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
                                        x6h1VarC34.j = false;
                                        x6h1 x6h1VarC35 = x6h1VarC34.a().c();
                                        x6h1VarC35.i.add(new a7h1("countdown_timer", (String) null, (Integer) null, (String) null, (String) null));
                                        x6h1VarC35.j = false;
                                        y6h1 y6h1VarA15 = x6h1VarC35.a();
                                        r6h1 r6h1Var = r6h1.c;
                                        r6h1 r6h1Var2 = new r6h1(kk0.l(y6h1VarA15), (u8h1) null);
                                        y6h1 y6h1Var2 = y6h1.i;
                                        x6h1 x6h1VarI = i3o1.i();
                                        x6h1VarI.h = "music";
                                        x6h1VarI.a = "mobile-prerelease-page-early-access-upsell";
                                        x6h1VarI.f = "1.0.0";
                                        x6h1VarI.g = "22.0.0";
                                        y6h1 y6h1VarA16 = x6h1VarI.a();
                                        i8h1 i8h1VarA16 = bfzVar.a();
                                        x6h1 x6h1VarC36 = y6h1VarA16.c();
                                        x6h1VarC36.i.add(new a7h1("early_access_upsell", (String) null, (Integer) null, (String) null, (String) null));
                                        x6h1VarC36.j = true;
                                        x1w0Var = new x1w0(i8h1VarA16.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", bbm.a(1))), x6h1VarC36.a(), r6h1Var2, System.currentTimeMillis()), (xj61) null));
                                    } else if (h2w0Var instanceof y1w0) {
                                        x1w0Var = h2w0Var;
                                        x1w0Var = h2w0Var;
                                        x1w0Var = h2w0Var;
                                        x1w0Var = h2w0Var;
                                        x1w0Var = h2w0Var;
                                        x1w0Var = h2w0Var;
                                        x6h1 x6h1VarC37 = y6h1Var.c();
                                        x6h1VarC37.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
                                        x6h1VarC37.j = false;
                                        x6h1 x6h1VarC38 = x6h1VarC37.a().c();
                                        x6h1VarC38.i.add(new a7h1("countdown_timer", (String) null, (Integer) null, (String) null, (String) null));
                                        x6h1VarC38.j = false;
                                        y6h1 y6h1VarA17 = x6h1VarC38.a();
                                        r6h1 r6h1Var3 = r6h1.c;
                                        r6h1 r6h1Var4 = new r6h1(kk0.l(y6h1VarA17), (u8h1) null);
                                        y6h1 y6h1Var3 = y6h1.i;
                                        x6h1 x6h1VarI2 = i3o1.i();
                                        x6h1VarI2.h = "music";
                                        x6h1VarI2.a = "mobile-prerelease-page-early-access-upsell";
                                        x6h1VarI2.f = "1.0.0";
                                        x6h1VarI2.g = "22.0.0";
                                        y6h1 y6h1VarA18 = x6h1VarI2.a();
                                        i8h1 i8h1VarA17 = bfzVar.a();
                                        x6h1 x6h1VarC39 = y6h1VarA18.c();
                                        x6h1VarC39.i.add(new a7h1("early_access_upsell", (String) null, (Integer) null, (String) null, (String) null));
                                        x6h1VarC39.j = true;
                                        y6h1 y6h1VarA19 = x6h1VarC39.a();
                                        k7h1 k7h1Var = new k7h1();
                                        ((xjn) k7h1Var).a = y6h1VarA19;
                                        ((xjn) k7h1Var).b = r6h1Var4;
                                        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                                        i8h1VarA17.f(k7h1Var.a(), (Set) null);
                                        x1w0Var = (y1w0) h2w0Var;
                                    } else if (!(h2w0Var instanceof c2w0)) {
                                        x1w0Var = h2w0Var;
                                        x1w0Var = h2w0Var;
                                        x1w0Var = h2w0Var;
                                        x1w0Var = h2w0Var;
                                        x1w0Var = h2w0Var;
                                        x1w0Var = h2w0Var;
                                        x1w0Var = h2w0Var;
                                        eg.o();
                                        return;
                                    }
                                    x1w0Var = s1w0Var;
                                }
                            }
                        }
                    }
                    x1w0Var = g2w0Var;
                }
            }
            x1w0Var = m1w0Var;
        }
        x1w0Var = h2w0Var;
        x1w0Var = h2w0Var;
        x1w0Var = h2w0Var;
        x1w0Var = h2w0Var;
        x1w0Var = h2w0Var;
        x1w0Var = h2w0Var;
        x1w0Var = h2w0Var;
        x1w0Var = h2w0Var;
        x1w0Var = h2w0Var;
        x1w0Var = h2w0Var;
        x1w0Var = h2w0Var;
        x1w0Var = h2w0Var;
        x1w0Var = h2w0Var;
        x1w0Var = h2w0Var;
        x1w0Var = h2w0Var;
        x1w0Var = h2w0Var;
        x1w0Var = h2w0Var;
        x1w0Var = h2w0Var;
        x1w0Var = h2w0Var;
        x1w0Var = h2w0Var;
        x1w0Var = h2w0Var;
        x1w0Var = h2w0Var;
        x1w0Var = h2w0Var;
        x1w0Var = h2w0Var;
        x1w0Var = h2w0Var;
        x1w0Var = z1w0Var;
        x1w0Var = h2w0Var;
        x1w0Var = h2w0Var;
        x1w0Var = h2w0Var;
        x1w0Var = w1w0Var;
        x1w0Var = h2w0Var;
        x1w0Var = h2w0Var;
        x1w0Var = h2w0Var;
        x1w0Var = h2w0Var;
        x1w0Var = h2w0Var;
        x1w0Var = u1w0Var;
        x1w0Var = h2w0Var;
        x1w0Var = h2w0Var;
        x1w0Var = h2w0Var;
        consumer.accept(x1w0Var);
    }

    /* JADX WARN: Code duplicated, block: B:142:0x02d1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v34, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v28, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v29, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v33, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v34, types: [java.util.List] */
    public final void accept(Object obj) {
        Map map;
        w7h1 w7h1VarA;
        w7h1 w7h1VarA2;
        w7h1 w7h1Var;
        cyq0 cyq0Var;
        String str;
        ?? arrayList;
        v9x0 v9x0Var;
        switch (this.a) {
            case 0:
                jee0 jee0Var = (jee0) obj;
                see0 see0Var = (see0) this.c;
                Activity activity = see0Var.a;
                if (jee0Var instanceof iee0) {
                    ((ArrayList) this.b).add(fn31.T(smo1.e(see0Var.d), (o8n) null, 0, new p6d0(see0Var, (lnm) null, (byte) 9), 3));
                    return;
                }
                if (jee0Var instanceof hee0) {
                    hqn1.q(see0Var.b, see0Var.g, ((hee0) jee0Var).a, (Bundle) null);
                    return;
                }
                if (jee0Var instanceof fee0) {
                    see0Var.f.invoke(see0Var.h);
                    return;
                }
                if (!(jee0Var instanceof gee0)) {
                    eg.o();
                    return;
                }
                Intent intent = new Intent();
                intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", activity.getPackageName(), null));
                activity.startActivity(intent);
                return;
            case 1:
                fxf0 fxf0Var = (fxf0) obj;
                hxf0 hxf0Var = (hxf0) this.b;
                TextView textView = hxf0Var.Z;
                ProgressBar progressBar = hxf0Var.Q0;
                EditText editText = hxf0Var.P0;
                Button button = hxf0Var.X;
                String str2 = fxf0Var.a;
                if (str2.length() > 0 && !u890.j(editText.getText().toString(), str2)) {
                    editText.setText(str2);
                }
                zwf0 zwf0Var = fxf0Var.e;
                if (zwf0Var instanceof axf0) {
                    String str3 = fxf0Var.b;
                    if (str2.length() <= 0) {
                        if (str3.length() <= 0) {
                            button.setEnabled(false);
                            return;
                        } else {
                            textView.setText(str3);
                            button.setEnabled(false);
                            return;
                        }
                    }
                    if (fxf0Var.c) {
                        hxf0Var.b(true);
                        return;
                    }
                    if (str3.length() > 0) {
                        textView.setText(str3);
                        button.setVisibility(4);
                        editText.setSelection(editText.getText().toString().length());
                        return;
                    } else if (fxf0Var.g()) {
                        button.setEnabled(true);
                        return;
                    } else {
                        button.setEnabled(false);
                        return;
                    }
                }
                if (zwf0Var instanceof cxf0) {
                    button.setEnabled(fxf0Var.g());
                    button.setVisibility(0);
                    progressBar.setVisibility(4);
                    if (hxf0Var.S0) {
                        return;
                    }
                    hxf0Var.b.a(new xp80());
                    hxf0Var.S0 = true;
                    return;
                }
                if (zwf0Var instanceof bxf0) {
                    button.setEnabled(false);
                    progressBar.setVisibility(0);
                    button.setVisibility(4);
                    return;
                }
                if (!(zwf0Var instanceof zwf0)) {
                    if (zwf0Var instanceof dxf0) {
                        hxf0Var.b(((dxf0) zwf0Var).a);
                        return;
                    } else {
                        eg.o();
                        return;
                    }
                }
                progressBar.setVisibility(4);
                button.setVisibility(0);
                button.setEnabled(false);
                rs21 rs21Var = zwf0Var.a;
                if (rs21Var instanceof ns21) {
                    textView.setText(2131958010);
                    return;
                }
                if (rs21Var instanceof os21) {
                    textView.setText(2131958010);
                    return;
                }
                if (rs21Var instanceof ps21) {
                    textView.setText(2131958008);
                    return;
                } else if (!(rs21Var instanceof qs21)) {
                    eg.o();
                    return;
                } else {
                    textView.setTextColor(hxf0Var.i.getContext().getColor(2131101180));
                    textView.setText(2131958011);
                    return;
                }
            case 2:
                int i = 5;
                wzo0 c0p0Var = (g0p0) obj;
                Consumer consumer = (Consumer) this.b;
                cr6 cr6Var = (cr6) this.c;
                Map map2 = b7x.a;
                h0p0 h0p0Var = (h0p0) cr6Var.c;
                y6h1 y6h1Var = h0p0Var.a;
                i8h1 i8h1Var = (i8h1) cr6Var.b;
                s1p0 s1p0Var = (s1p0) cr6Var.g;
                if (s1p0Var != null) {
                    if (c0p0Var instanceof wzo0) {
                        rzo0 rzo0Var = (rzo0) cr6Var.d;
                        d7l d7lVar = s1p0Var.c;
                        n0u n0uVar = (n0u) ((tzo) rzo0Var.b).b;
                        if (!(d7lVar instanceof a7l)) {
                            if (d7lVar instanceof y6l) {
                                i = 4;
                            } else if (d7lVar instanceof x6l) {
                                i = 2;
                            } else {
                                if (!(d7lVar instanceof w6l)) {
                                    eg.o();
                                    return;
                                }
                                i = 3;
                            }
                        }
                        String str4 = ((p6r0) rzo0Var.c).c;
                        String str5 = ((lik1) rzo0Var.d).a;
                        r6h1 r6h1Var = r6h1.c;
                        y6h1 y6h1Var2 = y6h1.i;
                        x6h1 x6h1VarI = i3o1.i();
                        x6h1VarI.h = "music";
                        x6h1VarI.a = "mobile-connect-devices-available";
                        x6h1VarI.f = "4.0.0";
                        x6h1VarI.g = "22.0.0";
                        x6h1VarI.d = str4;
                        y6h1 y6h1VarA = x6h1VarI.a();
                        Collections.singletonList("any");
                        int iC = l1d.C(i);
                        if (iC == 0) {
                            x6h1 x6h1VarC = y6h1VarA.c();
                            x6h1VarC.i.add(new a7h1("connect_button_unavailable", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC.j = false;
                            w7h1Var = new w7h1("", "", new z7h1("hit", 1, map2), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str5)), x6h1VarC.a(), r6h1Var, System.currentTimeMillis());
                        } else if (iC == 1) {
                            x6h1 x6h1VarC2 = y6h1VarA.c();
                            x6h1VarC2.i.add(new a7h1("connect_button_connecting", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC2.j = false;
                            w7h1Var = new w7h1("", "", new z7h1("hit", 1, map2), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str5)), x6h1VarC2.a(), r6h1Var, System.currentTimeMillis());
                        } else if (iC == 2) {
                            x6h1 x6h1VarC3 = y6h1VarA.c();
                            x6h1VarC3.i.add(new a7h1("connect_button_connected", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC3.j = false;
                            w7h1Var = new w7h1("", "", new z7h1("hit", 1, map2), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str5)), x6h1VarC3.a(), r6h1Var, System.currentTimeMillis());
                        } else if (iC != 3) {
                            if (iC != 4) {
                                eg.o();
                                return;
                            }
                            x6h1 x6h1VarC4 = y6h1VarA.c();
                            x6h1VarC4.i.add(new a7h1("connect_button_unavailable", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC4.j = false;
                            w7h1Var = new w7h1("", "", new z7h1("hit", 1, map2), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str5)), x6h1VarC4.a(), r6h1Var, System.currentTimeMillis());
                        } else {
                            x6h1 x6h1VarC5 = y6h1VarA.c();
                            x6h1VarC5.i.add(new a7h1("connect_button_available", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC5.j = false;
                            w7h1Var = new w7h1("", "", new z7h1("hit", 1, map2), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str5)), x6h1VarC5.a(), r6h1Var, System.currentTimeMillis());
                        }
                        n0uVar.a.m(w7h1Var, (xj61) null);
                        x6h1 x6h1VarC6 = y6h1Var.c();
                        x6h1VarC6.i.add(new a7h1("horizontal_layout", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC6.j = false;
                        x6h1 x6h1VarC7 = x6h1VarC6.a().c();
                        x6h1VarC7.i.add(new a7h1("connect_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC7.j = false;
                        c0p0Var = new wzo0(i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, map2), new x7h1("ui_reveal", 1, map2), x6h1VarC7.a(), r6h1Var, System.currentTimeMillis()), (xj61) null).a.a);
                    } else if (c0p0Var instanceof yzo0) {
                        if (cr6Var.b()) {
                            w7h1VarA2 = h0p0Var.e();
                        } else {
                            AtomicReferenceArray atomicReferenceArray = p6r0.e;
                            w7h1VarA2 = h0p0Var.a(yon1.X2().c);
                        }
                        c0p0Var = new yzo0(i8h1Var.m(w7h1VarA2, (xj61) null).a);
                    } else if (c0p0Var instanceof c0p0) {
                        if (cr6Var.b()) {
                            w7h1VarA = h0p0Var.e();
                        } else {
                            AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                            w7h1VarA = h0p0Var.a(yon1.X2().c);
                        }
                        c0p0Var = new c0p0(i8h1Var.m(w7h1VarA, (xj61) null).a);
                    } else if (!(c0p0Var instanceof d0p0) && !(c0p0Var instanceof zzo0) && !(c0p0Var instanceof xzo0) && !(c0p0Var instanceof a0p0) && !(c0p0Var instanceof b0p0)) {
                        if (c0p0Var instanceof e0p0) {
                            c0p0Var = (e0p0) c0p0Var;
                            int i2 = ((e0p0) c0p0Var).b;
                            int i3 = ((e0p0) c0p0Var).c;
                            z7h1 z7h1Var = new z7h1("drag", 1, map2);
                            String strValueOf = String.valueOf(i2);
                            if (strValueOf == null) {
                                strValueOf = "";
                            }
                            mmr0 mmr0Var = new mmr0("start_size_px", strValueOf);
                            String strValueOf2 = String.valueOf(i3);
                            i8h1Var.m(new w7h1("", "", z7h1Var, new x7h1("ui_resize", 2, sqg0.J(new mmr0[]{mmr0Var, new mmr0("end_size_px", strValueOf2 != null ? strValueOf2 : "")})), y6h1Var, r6h1.c, System.currentTimeMillis()), (xj61) null);
                            x5j1 x5j1Var = (x5j1) cr6Var.f;
                            boolean z = ((e0p0) c0p0Var).a;
                            s1p0 s1p0Var2 = (s1p0) cr6Var.g;
                            if (s1p0Var2 != null && (map = s1p0Var2.d) != null) {
                                map2 = map;
                            }
                            String str6 = (String) map2.get("ad_id");
                            if (str6 != null) {
                                ao0.c((ao0) x5j1Var.b, z ? co0.t : co0.e, str6, (Long) null, (String) null, (String) null, (String) null, (String) null, 124);
                            }
                        } else if (!(c0p0Var instanceof f0p0)) {
                            eg.o();
                            return;
                        }
                    }
                }
                consumer.accept(c0p0Var);
                return;
            case 3:
                e2p0 e2p0Var = (f2p0) obj;
                boolean z2 = e2p0Var instanceof e2p0;
                j2p0 j2p0Var = (j2p0) this.b;
                xzf xzfVar = j2p0Var.c;
                cr6 cr6Var2 = j2p0Var.e;
                if (!z2) {
                    j2p0Var.f((doj0) null, false);
                    cr6Var2.g = null;
                    xzfVar.accept((Object) null);
                    return;
                }
                e2p0 e2p0Var2 = e2p0Var;
                cr6Var2.g = e2p0Var2.i;
                j2p0Var.e1.e(e2p0Var);
                j2p0Var.f(e2p0Var2.d, e2p0Var2.k);
                dtw dtwVar = j2p0Var.Z0;
                if (dtwVar != null) {
                    xzfVar.accept((View) dtwVar.w.getParent());
                    return;
                } else {
                    u890.C("connectButtonVH");
                    throw null;
                }
            case 4:
                if (((c2v0) obj) == c2v0.a) {
                    ((rku) this.b).b(((hx7) ((ku1) this.c).b).b().doOnSuccess(nm.R0).ignoreElement().subscribe());
                    return;
                } else {
                    eg.o();
                    return;
                }
            case 5:
                cyq0 cyq0Var2 = dyq0.a;
                wva0 wva0Var = (wva0) this.b;
                svv0 svv0Var = ((lvv0) obj).c;
                cyq0 cyq0Var3 = byq0.a;
                if (svv0Var instanceof pvv0) {
                    cyq0Var = new eyq0(((pvv0) svv0Var).a);
                } else if (svv0Var instanceof rvv0) {
                    if (((rvv0) svv0Var).a) {
                        cyq0Var = cyq0Var2;
                    } else {
                        cyq0Var = cyq0Var3;
                    }
                } else if ((svv0Var instanceof qvv0) || (svv0Var instanceof nvv0)) {
                    cyq0Var = cyq0Var3;
                } else {
                    if (!(svv0Var instanceof ovv0)) {
                        eg.o();
                        return;
                    }
                    switch (((ovv0) svv0Var).a) {
                        case 1:
                            str = "OFFLINE";
                            break;
                        case 2:
                            str = "SERVER_FAILURE";
                            break;
                        case 3:
                            str = "NO_PREVIEW_LANGUAGES";
                            break;
                        case 4:
                            str = "PREVIEW_LOAD_FAILED";
                            break;
                        case 5:
                            str = "JSON_PARSING_FAILURE";
                            break;
                        case 6:
                            str = "RESPONSE_MAPPING_FAILURE";
                            break;
                        case 7:
                            str = "HEADER_TRANSFORM_FAILURE";
                            break;
                        case 8:
                            str = "UNKNOWN";
                            break;
                        default:
                            throw null;
                    }
                    cyq0Var = new cyq0(str);
                }
                mzr0 mzr0Var = (mzr0) wva0Var.c;
                if (cyq0Var.equals(cyq0Var3)) {
                    wva0Var.c(true);
                } else if (cyq0Var instanceof cyq0) {
                    wva0Var.c(false);
                    FrameLayout frameLayout = (FrameLayout) mzr0Var.b;
                    frameLayout.setVisibility(0);
                    tka0 tka0Var = dtw.C;
                    Context context = frameLayout.getContext();
                    ((myp) wva0Var.h).getClass();
                    dtw dtwVarB = mhc.b(context, frameLayout, new u63(new yxk0((byte) 1)), new iuv0(cyq0Var), (ipb1) null, 112);
                    frameLayout.removeAllViews();
                    frameLayout.addView(dtwVarB.w);
                } else if (cyq0Var.equals(cyq0Var2)) {
                    wva0Var.c(true);
                } else {
                    if (!(cyq0Var instanceof eyq0)) {
                        eg.o();
                        return;
                    }
                    wva0Var.c(false);
                    mvv0 mvv0Var = ((eyq0) cyq0Var).a;
                    uvv0 uvv0Var = (uvv0) wva0Var.e;
                    ((FrameLayout) mzr0Var.b).setVisibility(8);
                    rrv0 rrv0Var = (rrv0) wva0Var.i;
                    ayq0 ayq0Var = mvv0Var.a;
                    if (ayq0Var instanceof vuv0) {
                        vuv0 vuv0Var = (vuv0) ayq0Var;
                        String str7 = vuv0Var.e;
                        if (str7 == null || ihc1.y0(str7)) {
                            synchronized (rrv0Var) {
                                rrv0Var.h("absent", false);
                            }
                        }
                        tka0 tka0Var2 = dtw.C;
                        LinearLayout linearLayout = (LinearLayout) mzr0Var.e;
                        Context context2 = linearLayout.getContext();
                        lyp lypVar = (lyp) wva0Var.g;
                        xe01 xe01Var = uvv0Var.d;
                        esv0 esv0Var = new esv0(wva0Var, (byte) 0);
                        esv0 esv0Var2 = new esv0(wva0Var, (byte) 1);
                        ywp ywpVar = lypVar.a;
                        gw70 gw70Var = (gw70) ((xrv0) ((e93) ywpVar.c).b).y.get();
                        c8o.l(gw70Var);
                        e93 e93Var = (e93) ywpVar.c;
                        xrv0 xrv0Var = (xrv0) e93Var.b;
                        woa woaVar = (woa) xrv0Var.w.get();
                        c8o.l(woaVar);
                        kma kmaVar = (kma) xrv0Var.x.get();
                        c8o.l(kmaVar);
                        yxk0 yxk0Var = new yxk0((byte) 1);
                        m4c m4cVar = new m4c((byte) 20);
                        pe peVar = (pe) xrv0Var.B.get();
                        c8o.l(peVar);
                        ov20 ov20Var = (ov20) xrv0Var.i.get();
                        c8o.l(ov20Var);
                        dtw dtwVarB2 = mhc.b(context2, linearLayout, f6o1.A(new r8s(xe01Var, esv0Var, esv0Var2, gw70Var, woaVar, kmaVar, yxk0Var, m4cVar, peVar, ov20Var, (ywp) e93Var.h, (ywp) e93Var.i), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new fxv0(vuv0Var), (ipb1) null, 112);
                        linearLayout.removeAllViews();
                        linearLayout.addView(dtwVarB2.w);
                    } else {
                        synchronized (rrv0Var) {
                            rrv0Var.h("absent", false);
                        }
                        synchronized (rrv0Var) {
                            rrv0Var.i("absent", false);
                        }
                    }
                    uvv0Var.c.m(mvv0Var.b);
                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) mzr0Var.a;
                    aiq0.a(coordinatorLayout, new uu1(coordinatorLayout, wva0Var, mvv0Var, (byte) 27));
                }
                vh3 vh3Var = wva0Var.t;
                if (vh3Var != null && vh3Var.isShowing()) {
                    vh3 vh3Var2 = wva0Var.t;
                    if (vh3Var2 == null) {
                        u890.C("languageDialog");
                        throw null;
                    }
                    vh3Var2.dismiss();
                }
                if (svv0Var instanceof nvv0) {
                    Consumer consumer2 = (Consumer) this.c;
                    Context context3 = (Context) wva0Var.b;
                    String[] strArr = (String[]) ((nvv0) svv0Var).a.toArray(new String[0]);
                    vh3 vh3VarCreate = new uh3(context3).setTitle("Multiple languages for this config.").a(strArr, new ln5(consumer2, strArr, (byte) 19)).create();
                    wva0Var.t = vh3VarCreate;
                    boolean zIsShowing = vh3VarCreate.isShowing();
                    vh3 vh3Var3 = wva0Var.t;
                    if (zIsShowing) {
                        if (vh3Var3 != null) {
                            vh3Var3.dismiss();
                            return;
                        } else {
                            u890.C("languageDialog");
                            throw null;
                        }
                    }
                    if (vh3Var3 != null) {
                        vh3Var3.show();
                        return;
                    } else {
                        u890.C("languageDialog");
                        throw null;
                    }
                }
                return;
            case 6:
                a(obj);
                return;
            case 7:
                pcw0 zbw0Var = (pcw0) obj;
                Connection connection = (Connection) this.b;
                pdw0 pdw0Var = (pdw0) this.c;
                AtomicLong atomicLong = pdw0Var.O0;
                if (zbw0Var instanceof zbw0) {
                    zbw0 zbw0Var2 = (zbw0) zbw0Var;
                    zbw0Var = new zbw0(zbw0Var2.a, zbw0Var2.b, zbw0Var2.c, zbw0Var2.d, zbw0Var2.e, zbw0Var2.f, zbw0Var2.g, atomicLong.incrementAndGet());
                } else if (zbw0Var.equals(mcw0.a) || zbw0Var.equals(ecw0.a)) {
                    pdw0Var.P0.set(atomicLong.get());
                    pdw0Var.T0 = null;
                }
                connection.accept(zbw0Var);
                return;
            case 8:
                qbx0 qbx0Var = (qbx0) obj;
                r830 r830Var = qbx0Var.j;
                j8x0 j8x0Var = qbx0Var.e;
                g1b g1bVar = (g1b) this.b;
                idd1 idd1Var = (idd1) g1bVar.t;
                i8x0 i8x0Var = (i8x0) g1bVar.b;
                RecyclerView recyclerView = (RecyclerView) g1bVar.e;
                int i4 = qbx0Var.b;
                i8x0Var.a1 = i4;
                boolean z3 = qbx0Var.f;
                if (i8x0Var.P0 != z3) {
                    i8x0Var.P0 = z3;
                    i8x0Var.h();
                }
                boolean z4 = qbx0Var.l;
                if (i8x0Var.Q0 != z4) {
                    i8x0Var.Q0 = z4;
                    i8x0Var.h();
                }
                int iC2 = l1d.C(i4);
                if (iC2 != 1) {
                    if (iC2 != 5) {
                        arrayList = j8x0Var.b;
                    } else {
                        List list = j8x0Var.b;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : list) {
                            if (obj2 instanceof obx0) {
                                arrayList2.add(obj2);
                            }
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : arrayList2) {
                            nbx0 nbx0Var = ((obx0) obj3).a;
                            if (u890.j(nbx0Var, fbx0.a) || u890.j(nbx0Var, hbx0.a) || u890.j(nbx0Var, gbx0.a)) {
                                arrayList3.add(obj3);
                            }
                        }
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            linkedHashSet.add(((obx0) it.next()).b);
                        }
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj4 : list) {
                            v9x0 v9x0Var2 = (v9x0) obj4;
                            if (v9x0Var2 instanceof obx0) {
                                obx0 obx0Var = (obx0) v9x0Var2;
                                if (!(obx0Var.a instanceof kbx0) || !linkedHashSet.contains(obx0Var.b)) {
                                }
                            }
                            arrayList4.add(obj4);
                        }
                        arrayList = new ArrayList();
                        int i5 = 0;
                        for (Object obj5 : arrayList4) {
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                p7h.T();
                                throw null;
                            }
                            if (!(((v9x0) obj5) instanceof zbx0) || ((v9x0Var = (v9x0) o7h.t0(i6, arrayList4)) != null && !(v9x0Var instanceof zbx0))) {
                                arrayList.add(obj5);
                            }
                            i5 = i6;
                        }
                    }
                } else if (qbx0Var.b()) {
                    List list2 = j8x0Var.b;
                    arrayList = new ArrayList();
                    for (Object obj6 : list2) {
                        v9x0 v9x0Var3 = (v9x0) obj6;
                        if ((v9x0Var3 instanceof obx0) && u890.j(((obx0) v9x0Var3).a, r830Var.a)) {
                            arrayList.add(obj6);
                        }
                    }
                } else {
                    arrayList = j8x0Var.b;
                }
                if (!i8x0Var.N0.equals(arrayList)) {
                    i8x0Var.N0 = arrayList;
                    i8x0Var.h();
                }
                ((hrr0) g1bVar.h).setValue(r830Var);
                Set set = s4b1.f;
                String strZ = uic.C(qbx0Var.c, (String) null).z();
                strZ.getClass();
                if (!u890.j(i8x0Var.O0, strZ)) {
                    i8x0Var.O0 = strZ;
                    i8x0Var.h();
                }
                ((ComposeView) g1bVar.g).setVisibility(qbx0Var.b() ? 0 : 8);
                FrameLayout frameLayout2 = (FrameLayout) g1bVar.f;
                String str8 = qbx0Var.h;
                String str9 = qbx0Var.g;
                if (!j8x0Var.b.isEmpty() || str9 == null || str9.length() == 0 || str8 == null || str8.length() == 0) {
                    frameLayout2.setVisibility(8);
                } else {
                    frameLayout2.setVisibility(0);
                    ((vw40) idd1Var.getValue()).setTitle(str9);
                    ((vw40) idd1Var.getValue()).setSubtitle(str8);
                }
                if (recyclerView.getAdapter() == null && j8x0Var.a == 3) {
                    recyclerView.setAdapter(i8x0Var);
                    if (i4 == 5 || i4 == 6) {
                        recyclerView.m((zl7) this.c);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                zo61 zo61Var = (zo61) obj;
                if (!(zo61Var instanceof yo61)) {
                    if (zo61Var instanceof xo61) {
                        ((y1c1) this.c).T(yt8.a);
                        return;
                    } else {
                        eg.o();
                        return;
                    }
                }
                yo61 yo61Var = (yo61) zo61Var;
                tv80 tv80Var = yo61Var.b;
                lzn0 lzn0Var = (lzn0) this.b;
                String str10 = yo61Var.a;
                if (tv80Var != null) {
                    lzn0Var.a(str10, tv80Var, (Bundle) null);
                    return;
                } else {
                    lzn0Var.h(str10);
                    return;
                }
            case 10:
                ((v9c1) this.b).t.e((b9c1) obj);
                return;
            case 11:
                ((r4u) ((he7) this.b).t).e((lbc1) obj);
                return;
            case 12:
                ((Connection) this.b).accept((eli1) obj);
                return;
            default:
                ((Connection) this.b).accept((g0m1) obj);
                return;
        }
    }

    public final void dispose() {
        ValueAnimator valueAnimator;
        switch (this.a) {
            case 0:
                ArrayList<faa0> arrayList = (ArrayList) this.b;
                for (faa0 faa0Var : arrayList) {
                    if (faa0Var.isActive()) {
                        faa0Var.d((CancellationException) null);
                    }
                }
                arrayList.clear();
                return;
            case 1:
                ((CompositeDisposable) this.c).dispose();
                return;
            case 2:
                return;
            case 3:
                j2p0 j2p0Var = (j2p0) this.b;
                j2p0Var.c.accept((Object) null);
                j2p0Var.Z.setOnClickListener(null);
                j2p0Var.R0.w.setOnClickListener(null);
                j2p0Var.T0.setOnClickListener(null);
                c1p0 c1p0Var = j2p0Var.O0;
                if (c1p0Var != null) {
                    c1p0Var.setOnEvent((iu30) null);
                }
                l0x0 l0x0Var = j2p0Var.X0;
                Choreographer.FrameCallback frameCallback = (od5) l0x0Var.d;
                if (frameCallback != null) {
                    ((Choreographer) l0x0Var.c).removeFrameCallback(frameCallback);
                    l0x0Var.d = null;
                }
                tp7 tp7Var = j2p0Var.d1;
                xab1 xab1Var = (xab1) tp7Var.j;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                tp7Var.j = null;
                tp7Var.k = null;
                ((imx0) tp7Var.h).c();
                b2p0 b2p0Var = j2p0Var.P0;
                if (b2p0Var != null && (valueAnimator = b2p0Var.f) != null) {
                    valueAnimator.cancel();
                }
                VideoSurfaceView videoSurfaceView = j2p0Var.S0;
                if (videoSurfaceView != null) {
                    j2p0Var.b.f(videoSurfaceView);
                }
                faa0 faa0Var2 = (faa0) this.c;
                if (faa0Var2 != null) {
                    faa0Var2.d((CancellationException) null);
                    return;
                }
                return;
            case 4:
                ((rku) this.b).a();
                return;
            case 5:
                wva0 wva0Var = (wva0) this.b;
                Disposable disposable = (Disposable) ((mzr0) wva0Var.d).e;
                if (disposable != null && !disposable.isDisposed()) {
                    disposable.dispose();
                }
                ((rrv0) wva0Var.i).e();
                return;
            case 6:
                return;
            case 7:
                ((Connection) this.b).dispose();
                return;
            case 8:
                g1b g1bVar = (g1b) this.b;
                ArrayList arrayList2 = ((RecyclerView) g1bVar.e).J1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                g1bVar.i = null;
                return;
            case 9:
                return;
            case 10:
                ((cx30) this.c).dispose();
                return;
            case 11:
                ((cx30) this.c).dispose();
                return;
            case 12:
                ((Connection) this.b).dispose();
                jdu jduVar = ((cmi1) this.c).t;
                synchronized (jduVar) {
                    try {
                        MobiusLoop mobiusLoop = jduVar.f;
                        if (mobiusLoop != null) {
                            mobiusLoop.dispose();
                        }
                        jduVar.f = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                p1f0 p1f0Var = (p1f0) this.c;
                ((Connection) this.b).dispose();
                try {
                    ((n2t) ((tzo) p1f0Var.h).b).c(vt7.d, 800);
                } catch (Exception e) {
                    Logger.e(e, "Error stopping ducking on dispose", new Object[0]);
                }
                try {
                    ((ec4) p1f0Var.d).e();
                    return;
                } catch (Exception e2) {
                    Logger.e(e2, "Error stopping cue player on dispose", new Object[0]);
                    return;
                }
        }
    }

    public /* synthetic */ pee0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public pee0(see0 see0Var) {
        this.a = (byte) 0;
        this.c = see0Var;
        this.b = new ArrayList();
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }
}
