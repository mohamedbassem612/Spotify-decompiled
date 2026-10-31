package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.encoreconsumermobile.elements.contextmenu.ContextMenuButton;
import com.spotify.encoreconsumermobile.elements.playbutton.PlayButtonView;
import com.spotify.nowplaying.scroll.ScrollCardType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mfj1 implements isw, drj1 {
    public final r4u N0;
    public zej1 O0;
    public final ConstraintLayout P0;
    public final idd1 X;
    public final idd1 Y;
    public final idd1 Z;
    public final x191 a;
    public final gw70 b;
    public final Context c;
    public final iu30 d;
    public final br0 e;
    public final xho f;
    public final njv0 g;
    public final f0a h;
    public final short i;
    public final pho t;

    public mfj1(x191 x191Var, gw70 gw70Var, Context context, gn10 gn10Var, iu30 iu30Var, br0 br0Var, xho xhoVar, njv0 njv0Var) {
        this.a = x191Var;
        this.b = gw70Var;
        this.c = context;
        this.d = iu30Var;
        this.e = br0Var;
        this.f = xhoVar;
        this.g = njv0Var;
        byte b = 0;
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131626299, (ViewGroup) null, false);
        int i = 2131427622;
        AppCompatImageView appCompatImageViewT = m5n1.t(constraintLayoutInflate, 2131427622);
        if (appCompatImageViewT != null) {
            i = 2131427659;
            FrameLayout frameLayout = (FrameLayout) m5n1.t(constraintLayoutInflate, 2131427659);
            if (frameLayout != null) {
                i = 2131427854;
                ContextMenuButton contextMenuButtonT = m5n1.t(constraintLayoutInflate, 2131427854);
                if (contextMenuButtonT != null) {
                    i = 2131428222;
                    ContentRestrictionBadgeView contentRestrictionBadgeViewT = m5n1.t(constraintLayoutInflate, 2131428222);
                    if (contentRestrictionBadgeViewT != null) {
                        i = 2131428540;
                        TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131428540);
                        if (textView != null) {
                            i = 2131429948;
                            CardView cardViewT = m5n1.t(constraintLayoutInflate, 2131429948);
                            if (cardViewT != null) {
                                ConstraintLayout constraintLayout = constraintLayoutInflate;
                                i = 2131430349;
                                TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate, 2131430349);
                                if (textView2 != null) {
                                    i = 2131430403;
                                    PlayButtonView playButtonViewT = m5n1.t(constraintLayoutInflate, 2131430403);
                                    if (playButtonViewT != null) {
                                        i = 2131430632;
                                        TextView textView3 = (TextView) m5n1.t(constraintLayoutInflate, 2131430632);
                                        if (textView3 != null) {
                                            i = 2131431115;
                                            TextView textView4 = (TextView) m5n1.t(constraintLayoutInflate, 2131431115);
                                            if (textView4 != null) {
                                                i = 2131431125;
                                                if (((LinearLayout) m5n1.t(constraintLayoutInflate, 2131431125)) != null) {
                                                    i = 2131431356;
                                                    TextView textView5 = (TextView) m5n1.t(constraintLayoutInflate, 2131431356);
                                                    if (textView5 != null) {
                                                        i = 2131431373;
                                                        ConstraintLayout constraintLayoutT = m5n1.t(constraintLayoutInflate, 2131431373);
                                                        if (constraintLayoutT != null) {
                                                            i = 2131431501;
                                                            FrameLayout frameLayout2 = (FrameLayout) m5n1.t(constraintLayoutInflate, 2131431501);
                                                            if (frameLayout2 != null) {
                                                                i = 2131431581;
                                                                VideoSurfaceView videoSurfaceViewT = m5n1.t(constraintLayoutInflate, 2131431581);
                                                                if (videoSurfaceViewT != null) {
                                                                    this.h = new f0a(constraintLayout, appCompatImageViewT, frameLayout, contextMenuButtonT, contentRestrictionBadgeViewT, textView, cardViewT, constraintLayout, textView2, playButtonViewT, textView3, textView4, textView5, constraintLayoutT, frameLayout2, videoSurfaceViewT, (byte) 12);
                                                                    this.i = (short) 300;
                                                                    this.t = new pho(true, new hdx(18, (vu30) null, zhi1.V0, (vu30) null, (hw61) null, 26), false);
                                                                    this.X = new idd1(new hfj1(this, (byte) 1));
                                                                    this.Y = new idd1(new hfj1(this, (byte) 2));
                                                                    this.Z = new idd1(new hfj1(this, (byte) 3));
                                                                    this.N0 = r4u.c(new r4u[]{r4u.d(r6x0.W0, r4u.a(new f2g1((Object) this, (byte) 8))), r4u.d(new bvn(ifj1.b, (byte) 6), r4u.a(new zb91(this, (byte) 27))), r4u.d(new bvn(jfj1.b, (byte) 6), new r4u(y6x0.V0, new ezb1(this, (byte) 19)))});
                                                                    this.P0 = constraintLayout;
                                                                    videoSurfaceViewT.setScaleType(b3k1.c);
                                                                    videoSurfaceViewT.setBufferingThrobberEnabled(false);
                                                                    playButtonViewT.B(new cet0(false, new vft0(false), (String) null, 4));
                                                                    hfj1 hfj1Var = new hfj1(this, b);
                                                                    p811 p811Var = new p811();
                                                                    p811 p811Var2 = new p811();
                                                                    vgu vguVar = new vgu(p811Var, new zw3(p811Var, p811Var2, constraintLayout, (byte) 4), hfj1Var, (byte) 5);
                                                                    p811Var2.a = vguVar;
                                                                    constraintLayout.addOnAttachStateChangeListener(vguVar);
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }

    public static dtw d(xpw xpwVar, ViewGroup viewGroup, Object obj) {
        tka0 tka0Var = dtw.C;
        return mhc.b(viewGroup.getContext(), viewGroup, f6o1.A(xpwVar, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), obj, (ipb1) null, 112);
    }

    public final void a(Object obj, ysw yswVar) {
        zej1 zej1Var;
        zej1 zej1Var2 = (zej1) obj;
        zej1 zej1Var3 = this.O0;
        if (!u890.j(zej1Var3 != null ? zej1Var3.g : null, zej1Var2.g) || (zej1Var = this.O0) == null || zej1Var.n != zej1Var2.n) {
            this.b.d((AppCompatImageView) this.h.c);
        }
        this.O0 = zej1Var2;
        this.N0.e(zej1Var2);
    }

    public final void b() {
        g(300L);
    }

    public final void c() {
        zej1 zej1Var = this.O0;
        boolean z = false;
        if (zej1Var != null && zej1Var.n) {
            z = true;
        }
        long j = this.i;
        f0a f0aVar = this.h;
        if (((AppCompatImageView) f0aVar.c).getAlpha() != 1.0f || z) {
            return;
        }
        ((AppCompatImageView) f0aVar.c).animate().alpha(0.0f).setDuration(j).start();
        ((VideoSurfaceView) f0aVar.Q0).animate().setDuration(j).alpha(1.0f).setDuration(j).start();
    }

    public final void e(x191 x191Var, zej1 zej1Var) {
        if (zej1Var.n || zej1Var.s) {
            return;
        }
        if (zej1Var.d.length() == 0) {
            x191Var.stop();
        } else {
            x191Var.f(this);
            x191Var.b((VideoSurfaceView) this.h.Q0, zej1Var.d, zej1Var.h, zej1Var.i, zej1Var.e, zej1Var.u, zej1Var.f);
        }
    }

    public final void f(zej1 zej1Var) {
        k4m k4mVar;
        String string;
        String str = zej1Var.f57p;
        String str2 = zej1Var.c;
        String str3 = zej1Var.a;
        boolean z = str != null;
        f0a f0aVar = this.h;
        FrameLayout frameLayout = (FrameLayout) f0aVar.P0;
        ContextMenuButton contextMenuButton = (ContextMenuButton) f0aVar.e;
        ConstraintLayout constraintLayout = (ConstraintLayout) f0aVar.O0;
        TextView textView = (TextView) f0aVar.Z;
        frameLayout.removeAllViews();
        if (z) {
            dtw dtwVar = (dtw) this.Z.getValue();
            if (dtwVar != null) {
                dtwVar.f(new uiv0(2, zej1Var.q, zej1Var.e, 2));
                frameLayout.addView(dtwVar.w);
                frameLayout.setVisibility(0);
            }
        } else {
            frameLayout.setVisibility(8);
        }
        TextView textView2 = (TextView) f0aVar.Y;
        Context context = this.c;
        if (str != null) {
            textView2.setText(context.getString(2131963774, str));
            textView2.setVisibility(0);
            boolean z2 = ((FrameLayout) f0aVar.P0).getVisibility() == 0;
            qhl layoutParams = textView2.getLayoutParams();
            if (layoutParams == null) {
                bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                return;
            } else {
                qhl qhlVar = layoutParams;
                qhlVar.i = z2 ? 2131431501 : -1;
                textView2.setLayoutParams(qhlVar);
            }
        } else {
            textView2.setVisibility(8);
        }
        boolean z3 = zej1Var.b;
        TextView textView3 = (TextView) f0aVar.N0;
        textView3.setMaxLines(z3 ? 2 : 1);
        ((TextView) f0aVar.t).setMinLines(textView.getMaxLines() + textView3.getMaxLines());
        textView3.setText(str3);
        textView.setText(str2);
        ContentRestrictionBadgeView contentRestrictionBadgeView = (ContentRestrictionBadgeView) f0aVar.f;
        int iOrdinal = zej1Var.m.ordinal();
        if (iOrdinal == 0) {
            k4mVar = k4m.a;
        } else if (iOrdinal == 1) {
            k4mVar = k4m.b;
        } else {
            if (iOrdinal != 2) {
                eg.o();
                return;
            }
            k4mVar = k4m.d;
        }
        contentRestrictionBadgeView.c(k4mVar);
        if (ihc1.y0(str3)) {
            string = context.getString(2131963771);
        } else {
            string = ihc1.y0(str2) ? context.getString(2131963772, str3) : context.getString(2131963770, str3, str2);
        }
        string.getClass();
        ((ConstraintLayout) f0aVar.i).setContentDescription(string);
        constraintLayout.setContentDescription(null);
        contextMenuButton.setEnabled(true);
        contextMenuButton.setContentDescription(contextMenuButton.getResources().getString(2131962420, str3));
        String str4 = zej1Var.e;
        String str5 = zej1Var.k;
        m4m m4mVar = zej1Var.m;
        boolean z4 = zej1Var.n;
        String str6 = zej1Var.t;
        boolean z5 = zej1Var.v;
        gdv gdvVar = new gdv((byte) 7, this, str4, str6, str5, m4mVar, z5 && str6.length() > 0);
        this.P0.setOnClickListener(new gl61(gdvVar, (byte) 15));
        ((VideoSurfaceView) f0aVar.Q0).setOnClickListener(new gl61(gdvVar, (byte) 15));
        ((PlayButtonView) f0aVar.X).setOnClickListener(new gl61(gdvVar, (byte) 15));
        contextMenuButton.setOnClickListener(new kfj1(this, str4, z4, z5));
        if (str6.length() > 0) {
            constraintLayout.setOnClickListener(new lfj1(this, str6, str4, (byte) 0));
        } else {
            constraintLayout.setOnClickListener(null);
            constraintLayout.setClickable(false);
        }
    }

    public final void g(long j) {
        f0a f0aVar = this.h;
        if (((AppCompatImageView) f0aVar.c).getAlpha() == 0.0f) {
            ((AppCompatImageView) f0aVar.c).animate().alpha(1.0f).setDuration(j).start();
            ((VideoSurfaceView) f0aVar.Q0).animate().alpha(0.0f).setDuration(j).start();
        }
    }

    public final View getView() {
        return this.P0;
    }
}
