package p;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.base.java.logging.Logger;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.textview.EncoreTextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gwa0 implements f4h1 {
    public final /* synthetic */ byte a = 0;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public gwa0(LayoutInflater layoutInflater, gni0 gni0Var, vnd1 vnd1Var, t2b t2bVar, hwa0 hwa0Var, gw70 gw70Var) {
        rih1 m231Var;
        this.b = gni0Var;
        this.c = vnd1Var;
        this.d = hwa0Var;
        this.e = gw70Var;
        View viewInflate = layoutInflater.inflate(2131625217, (ViewGroup) null, false);
        int i = 2131427513;
        ConstraintLayout constraintLayoutT = m5n1.t(viewInflate, 2131427513);
        if (constraintLayoutT != null) {
            i = 2131427515;
            EncoreTextView encoreTextViewT = m5n1.t(viewInflate, 2131427515);
            if (encoreTextViewT != null) {
                i = 2131427516;
                EncoreTextView encoreTextViewT2 = m5n1.t(viewInflate, 2131427516);
                if (encoreTextViewT2 != null) {
                    i = 2131428198;
                    LinearLayout linearLayout = (LinearLayout) m5n1.t(viewInflate, 2131428198);
                    if (linearLayout != null) {
                        i = 2131428830;
                        ImageView imageView = (ImageView) m5n1.t(viewInflate, 2131428830);
                        if (imageView != null) {
                            i = 2131429026;
                            View viewT = m5n1.t(viewInflate, 2131429026);
                            if (viewT != null) {
                                i = 2131429223;
                                ImageView imageView2 = (ImageView) m5n1.t(viewInflate, 2131429223);
                                if (imageView2 != null) {
                                    i = 2131429665;
                                    ConstraintLayout constraintLayoutT2 = m5n1.t(viewInflate, 2131429665);
                                    if (constraintLayoutT2 != null) {
                                        i = 2131429668;
                                        EncoreTextView encoreTextViewT3 = m5n1.t(viewInflate, 2131429668);
                                        if (encoreTextViewT3 != null) {
                                            i = 2131429669;
                                            EncoreTextView encoreTextViewT4 = m5n1.t(viewInflate, 2131429669);
                                            if (encoreTextViewT4 != null) {
                                                i = 2131430427;
                                                if (((ImageView) m5n1.t(viewInflate, 2131430427)) != null) {
                                                    i = 2131430778;
                                                    ScrollView scrollView = (ScrollView) m5n1.t(viewInflate, 2131430778);
                                                    if (scrollView != null) {
                                                        i = 2131430941;
                                                        if (((ImageView) m5n1.t(viewInflate, 2131430941)) != null) {
                                                            i = 2131431356;
                                                            EncoreTextView encoreTextViewT5 = m5n1.t(viewInflate, 2131431356);
                                                            if (encoreTextViewT5 != null) {
                                                                i = 2131431397;
                                                                View viewT2 = m5n1.t(viewInflate, 2131431397);
                                                                if (viewT2 != null) {
                                                                    i = 2131431406;
                                                                    View viewT3 = m5n1.t(viewInflate, 2131431406);
                                                                    if (viewT3 != null) {
                                                                        FrameLayout frameLayout = (FrameLayout) viewInflate;
                                                                        this.f = new h72(frameLayout, constraintLayoutT, encoreTextViewT, encoreTextViewT2, linearLayout, imageView, viewT, imageView2, constraintLayoutT2, encoreTextViewT3, encoreTextViewT4, scrollView, encoreTextViewT5, viewT2, viewT3);
                                                                        int i2 = kgr0.T0;
                                                                        FrameLayout frameLayoutA = xyn1.A(frameLayout, new z6h0(this, (byte) 24));
                                                                        this.g = frameLayoutA;
                                                                        scrollView.getViewTreeObserver().addOnScrollChangedListener(new cni0(scrollView, this, linearLayout.getPaddingTop(), (byte) 0));
                                                                        rwq0.s(linearLayout, gce0.Y);
                                                                        b8k1.q(encoreTextViewT5, true);
                                                                        encoreTextViewT5.setText(gni0Var.c);
                                                                        try {
                                                                            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor(gni0Var.a), frameLayoutA.getContext().getColor(2131101505)});
                                                                            gradientDrawable.setCornerRadius(0.0f);
                                                                            viewT.setBackground(gradientDrawable);
                                                                            m231Var = rih1.a;
                                                                        } catch (Throwable th) {
                                                                            m231Var = new m231(th);
                                                                        }
                                                                        if (e331.a(m231Var) != null) {
                                                                            Logger.d("Invalid colour supplied to the Member Invite Page", new Object[0]);
                                                                        }
                                                                        gni0 gni0Var2 = (gni0) this.b;
                                                                        ((gw70) this.e).f(gni0Var2.b).k((ImageView) ((h72) this.f).g, new sw9(this, l1d.C(gni0Var2.h) != 1 ? 2131231865 : 2131231938, (byte) 21));
                                                                        h72 h72Var = (h72) this.f;
                                                                        b8k1.p((ConstraintLayout) h72Var.h, new zdc((byte) 15));
                                                                        EncoreTextView encoreTextView = (EncoreTextView) h72Var.t;
                                                                        eni0 eni0Var = ((gni0) this.b).d;
                                                                        encoreTextView.setText(eni0Var.a);
                                                                        ((EncoreTextView) h72Var.i).setText(eni0Var.b);
                                                                        ((ConstraintLayout) h72Var.h).setOnClickListener(new bni0(this, (byte) 1));
                                                                        h72 h72Var2 = (h72) this.f;
                                                                        ConstraintLayout constraintLayout = (ConstraintLayout) h72Var2.b;
                                                                        b8k1.p(constraintLayout, new zdc((byte) 15));
                                                                        gni0 gni0Var3 = (gni0) this.b;
                                                                        boolean z = gni0Var3.f;
                                                                        eni0 eni0Var2 = gni0Var3.e;
                                                                        if (!z) {
                                                                            constraintLayout.setVisibility(8);
                                                                            return;
                                                                        }
                                                                        constraintLayout.setVisibility(0);
                                                                        ((EncoreTextView) h72Var2.d).setText(eni0Var2.a);
                                                                        ((EncoreTextView) h72Var2.c).setText(eni0Var2.b);
                                                                        constraintLayout.setOnClickListener(new bni0(this, (byte) 0));
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
        }
        bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final Object getView() {
        byte b = this.a;
        Object obj = this.g;
        switch (b) {
            case 0:
                return (FrameLayout) ((h72) obj).b;
            default:
                return (FrameLayout) obj;
        }
    }

    public final void start() {
        switch (this.a) {
            case 0:
                h72 h72Var = (h72) this.g;
                ((EncoreButton) h72Var.c).setOnClickListener(new ewa0(this, (byte) 1));
                zlc0 zlc0Var = (zlc0) this.f;
                FrameLayout frameLayout = (FrameLayout) h72Var.b;
                SpannableString spannableStringA = zlc0Var.a(frameLayout.getResources().getString(2131957019), new fwa0(this, (byte) 1));
                EncoreTextView encoreTextView = (EncoreTextView) h72Var.g;
                encoreTextView.setText(spannableStringA);
                encoreTextView.setMovementMethod(LinkMovementMethod.getInstance());
                SpannableString spannableStringA2 = zlc0Var.a(frameLayout.getResources().getString(2131957016), new fwa0(this, (byte) 0));
                EncoreTextView encoreTextView2 = (EncoreTextView) h72Var.f;
                encoreTextView2.setText(spannableStringA2);
                encoreTextView2.setMovementMethod(LinkMovementMethod.getInstance());
                b8k1.q((EncoreTextView) h72Var.t, true);
                b8k1.q((EncoreTextView) h72Var.d, true);
                b8k1.q((EncoreTextView) h72Var.h, true);
                b8k1.q((EncoreTextView) h72Var.i, true);
                break;
        }
    }

    public final void stop() {
        byte b = this.a;
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }

    public gwa0(LayoutInflater layoutInflater, int i, lzn0 lzn0Var, swa0 swa0Var, c8w c8wVar, t8w t8wVar, zlc0 zlc0Var, dg30 dg30Var, gw70 gw70Var) {
        String string;
        this.b = lzn0Var;
        this.c = swa0Var;
        this.d = c8wVar;
        this.e = t8wVar;
        this.f = zlc0Var;
        View viewInflate = layoutInflater.inflate(2131624668, (ViewGroup) null, false);
        int i2 = 2131427513;
        EncoreButton encoreButtonT = m5n1.t(viewInflate, 2131427513);
        if (encoreButtonT != null) {
            i2 = 2131427670;
            EncoreButton encoreButtonT2 = m5n1.t(viewInflate, 2131427670);
            if (encoreButtonT2 != null) {
                i2 = 2131428198;
                ConstraintLayout constraintLayoutT = m5n1.t(viewInflate, 2131428198);
                if (constraintLayoutT != null) {
                    i2 = 2131428898;
                    AppCompatImageView appCompatImageViewT = m5n1.t(viewInflate, 2131428898);
                    if (appCompatImageViewT != null) {
                        i2 = 2131428899;
                        if (m5n1.t(viewInflate, 2131428899) != null) {
                            i2 = 2131428900;
                            EncoreTextView encoreTextViewT = m5n1.t(viewInflate, 2131428900);
                            if (encoreTextViewT != null) {
                                i2 = 2131429089;
                                View viewT = m5n1.t(viewInflate, 2131429089);
                                if (viewT != null) {
                                    i2 = 2131429092;
                                    if (m5n1.t(viewInflate, 2131429092) != null) {
                                        i2 = 2131430289;
                                        EncoreTextView encoreTextViewT2 = m5n1.t(viewInflate, 2131430289);
                                        if (encoreTextViewT2 != null) {
                                            i2 = 2131430723;
                                            if (m5n1.t(viewInflate, 2131430723) != null) {
                                                i2 = 2131430724;
                                                EncoreTextView encoreTextViewT3 = m5n1.t(viewInflate, 2131430724);
                                                if (encoreTextViewT3 != null) {
                                                    i2 = 2131430778;
                                                    ScrollView scrollView = (ScrollView) m5n1.t(viewInflate, 2131430778);
                                                    if (scrollView != null) {
                                                        i2 = 2131430857;
                                                        AppCompatImageView appCompatImageViewT2 = m5n1.t(viewInflate, 2131430857);
                                                        if (appCompatImageViewT2 != null) {
                                                            i2 = 2131430858;
                                                            if (m5n1.t(viewInflate, 2131430858) != null) {
                                                                i2 = 2131430859;
                                                                EncoreTextView encoreTextViewT4 = m5n1.t(viewInflate, 2131430859);
                                                                if (encoreTextViewT4 != null) {
                                                                    i2 = 2131431115;
                                                                    EncoreTextView encoreTextViewT5 = m5n1.t(viewInflate, 2131431115);
                                                                    if (encoreTextViewT5 != null) {
                                                                        i2 = 2131431330;
                                                                        AppCompatImageView appCompatImageViewT3 = m5n1.t(viewInflate, 2131431330);
                                                                        if (appCompatImageViewT3 != null) {
                                                                            i2 = 2131431331;
                                                                            if (m5n1.t(viewInflate, 2131431331) != null) {
                                                                                i2 = 2131431332;
                                                                                EncoreTextView encoreTextViewT6 = m5n1.t(viewInflate, 2131431332);
                                                                                if (encoreTextViewT6 != null) {
                                                                                    i2 = 2131431356;
                                                                                    EncoreTextView encoreTextViewT7 = m5n1.t(viewInflate, 2131431356);
                                                                                    if (encoreTextViewT7 != null) {
                                                                                        i2 = 2131431397;
                                                                                        View viewT2 = m5n1.t(viewInflate, 2131431397);
                                                                                        if (viewT2 != null) {
                                                                                            i2 = 2131431400;
                                                                                            ConstraintLayout constraintLayoutT2 = m5n1.t(viewInflate, 2131431400);
                                                                                            if (constraintLayoutT2 != null) {
                                                                                                i2 = 2131431406;
                                                                                                View viewT3 = m5n1.t(viewInflate, 2131431406);
                                                                                                if (viewT3 != null) {
                                                                                                    FrameLayout frameLayout = (FrameLayout) viewInflate;
                                                                                                    this.g = new h72(frameLayout, encoreButtonT, encoreButtonT2, constraintLayoutT, appCompatImageViewT, encoreTextViewT, viewT, encoreTextViewT2, encoreTextViewT3, scrollView, appCompatImageViewT2, encoreTextViewT4, encoreTextViewT5, appCompatImageViewT3, encoreTextViewT6, encoreTextViewT7, viewT2, constraintLayoutT2, viewT3);
                                                                                                    rwq0.s(constraintLayoutT, j830.R0);
                                                                                                    rwq0.s(encoreTextViewT7, new j8a(encoreTextViewT7, (byte) 2));
                                                                                                    rwq0.s(constraintLayoutT2, rre1.U0);
                                                                                                    mmg1.a(scrollView, dg30Var, viewT2);
                                                                                                    encoreButtonT2.setOnClickListener(new ewa0(this, (byte) 0));
                                                                                                    encoreTextViewT5.setText(frameLayout.getResources().getString(2131957021, Integer.valueOf(i)));
                                                                                                    yxa0 yxa0Var = t8wVar.b;
                                                                                                    if (!u890.j(yxa0Var, txa0.a) && !(yxa0Var instanceof vxa0)) {
                                                                                                        if (!(yxa0Var instanceof wxa0) && !(yxa0Var instanceof uxa0)) {
                                                                                                            eg.o();
                                                                                                            throw null;
                                                                                                        }
                                                                                                        string = frameLayout.getResources().getString(2131957046);
                                                                                                    } else {
                                                                                                        string = frameLayout.getResources().getString(2131957015);
                                                                                                    }
                                                                                                    encoreButtonT.setText(string);
                                                                                                    gw70Var.f("https://cdn-spotify-gen-alpha.spotifycdn.com/kids-education/ParentalControls.png").k(appCompatImageViewT, (ird1) null);
                                                                                                    gw70Var.f("https://cdn-spotify-gen-alpha.spotifycdn.com/kids-education/SeparateAccounts.png").k(appCompatImageViewT2, (ird1) null);
                                                                                                    gw70Var.f("https://cdn-spotify-gen-alpha.spotifycdn.com/kids-education/WorldOfMusic.png").k(appCompatImageViewT3, (ird1) null);
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
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        throw null;
    }
}
