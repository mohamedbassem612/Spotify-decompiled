package p;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.base.java.logging.Logger;
import com.spotify.encoreconsumermobile.elements.addtobutton.EncoreAddToButtonView;
import com.spotify.marquee.marquee.ui.OverlayBackgroundView;
import com.spotify.messages.BetamaxPlaybackSession;
import io.reactivex.rxjava3.android.plugins.RxAndroidPlugins;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lp/mwg0;", "Lp/zf30;", "Lp/ug30;", "Lp/o6r0;", "<init>", "()V", "p/zud0", "p/eg7", "src_main_java_com_spotify_marquee_marquee-marquee"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class mwg0 extends zf30 implements ug30, o6r0 {
    public View F1;
    public OverlayBackgroundView G1;
    public TextView H1;
    public ImageView I1;
    public TextView J1;
    public TextView K1;
    public Button L1;
    public TextView M1;
    public View N1;
    public View O1;
    public TextView P1;
    public h72 Q1;
    public EncoreAddToButtonView R1;
    public boolean S1;
    public gw70 T1;
    public ivg0 U1;
    public final zud0 V1 = new zud0(this, (byte) 8);
    public final eg7 W1 = new eg7(this, (byte) 18);
    public final gn10 X1 = mno1.I;

    public final String A(Context context) {
        return "";
    }

    public final void D0() {
        ((zf30) this).h1 = true;
        h72 h72Var = this.Q1;
        if (h72Var != null) {
            h72Var.p();
        } else {
            u890.C("animationHelper");
            throw null;
        }
    }

    public final void E0() {
        ((zf30) this).h1 = true;
        if (this.S1) {
            return;
        }
        h72 h72Var = this.Q1;
        if (h72Var == null) {
            u890.C("animationHelper");
            throw null;
        }
        h72Var.Q(p7h.M(new ObjectAnimator[]{(ObjectAnimator) h72Var.b, (ObjectAnimator) h72Var.d, (ObjectAnimator) h72Var.h, (ObjectAnimator) h72Var.f, (ObjectAnimator) h72Var.t}), new d20(this, (byte) 8), hlv.b, 350L);
    }

    public final void F0(Bundle bundle) {
        bundle.putBoolean("animation_completed", this.S1);
    }

    /* JADX WARN: Code duplicated, block: B:144:0x0240  */
    /* JADX WARN: Code duplicated, block: B:146:0x0244 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:147:0x0246  */
    /* JADX WARN: Code duplicated, block: B:150:0x024b  */
    /* JADX WARN: Code duplicated, block: B:152:0x0253  */
    /* JADX WARN: Code duplicated, block: B:154:0x025c  */
    /* JADX WARN: Code duplicated, block: B:155:0x0261  */
    /* JADX WARN: Code duplicated, block: B:158:0x026c  */
    /* JADX WARN: Code duplicated, block: B:160:0x027c  */
    /* JADX WARN: Code duplicated, block: B:162:0x0280  */
    /* JADX WARN: Code duplicated, block: B:163:0x028d  */
    /* JADX WARN: Code duplicated, block: B:165:0x0293  */
    /* JADX WARN: Code duplicated, block: B:167:0x0299  */
    /* JADX WARN: Code duplicated, block: B:169:0x029f  */
    /* JADX WARN: Code duplicated, block: B:171:0x02a5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v23, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r9v6, types: [android.graphics.drawable.Drawable] */
    public final void G0() throws Throwable {
        int color;
        Throwable th;
        mwg0 mwg0Var;
        TextView textView;
        ?? r6;
        Context contextP0;
        int color2;
        TextView textView2;
        TextView textView3;
        ?? r2;
        ?? r7;
        ((zf30) this).h1 = true;
        ivg0 ivg0VarZ0 = Z0();
        vku vkuVar = ivg0VarZ0.q;
        ivg0VarZ0.n = this;
        iug0 iug0Var = ivg0VarZ0.a;
        String str = iug0Var.O0;
        String str2 = iug0Var.c;
        twg0 twg0Var = iug0Var.P0;
        if (str != null) {
            try {
                color = Color.parseColor(str);
            } catch (IllegalArgumentException e) {
                Logger.e(e, "Color is not parcelable", new Object[0]);
                color = -7829368;
            }
            OverlayBackgroundView overlayBackgroundView = this.G1;
            if (overlayBackgroundView == null) {
                u890.C("modalBackgroundView");
                throw null;
            }
            overlayBackgroundView.a(color, false);
        } else {
            mgc mgcVar = ivg0VarZ0.m;
            OverlayBackgroundView overlayBackgroundView2 = this.G1;
            if (overlayBackgroundView2 == null) {
                u890.C("modalBackgroundView");
                throw null;
            }
            ((gw70) mgcVar.d).f((String) mgcVar.c).g(new jm1(overlayBackgroundView2, (byte) 18), new cc2(overlayBackgroundView2, mgcVar, (byte) 4));
        }
        twg0 twg0Var2 = twg0.DARK;
        if (twg0Var != null) {
            mwg0 mwg0Var2 = ivg0VarZ0.n;
            th = null;
            if (mwg0Var2 == null) {
                u890.C("viewBinder");
                throw null;
            }
            int i = twg0Var == twg0Var2 ? -16777216 : -1;
            Context contextP1 = mwg0Var2.P0();
            int color3 = twg0Var == twg0Var2 ? contextP1.getColor(2131102457) : contextP1.getColor(2131102468);
            TextView textView4 = mwg0Var2.H1;
            if (textView4 == null) {
                u890.C("newReleaseDescriptionView");
                throw null;
            }
            textView4.setTextColor(i);
            TextView textView5 = mwg0Var2.J1;
            if (textView5 == null) {
                u890.C("titleView");
                throw null;
            }
            textView5.setTextColor(i);
            TextView textView6 = mwg0Var2.K1;
            if (textView6 == null) {
                u890.C("artistNameView");
                throw null;
            }
            textView6.setTextColor(color3);
            TextView textView7 = mwg0Var2.M1;
            if (textView7 == null) {
                u890.C("legalTextView");
                throw null;
            }
            textView7.setTextColor(color3);
            if (twg0Var == twg0Var2) {
                Button button = mwg0Var2.L1;
                if (button == null) {
                    u890.C("callToActionButton");
                    throw null;
                }
                button.setTextColor(-1);
                ColorStateList colorStateListE = x74.E(mwg0Var2.P0(), 2131100263);
                Button button2 = mwg0Var2.L1;
                if (button2 == null) {
                    u890.C("callToActionButton");
                    throw null;
                }
                button2.setBackgroundTintList(colorStateListE);
            }
        } else {
            th = null;
        }
        mwg0 mwg0Var3 = ivg0VarZ0.n;
        if (mwg0Var3 == null) {
            u890.C("viewBinder");
            throw th;
        }
        String str3 = iug0Var.d;
        gw70 gw70Var = mwg0Var3.T1;
        if (gw70Var == null) {
            u890.C("imageLoader");
            throw th;
        }
        ixg ixgVarF = gw70Var.f(str3);
        ImageView imageView = mwg0Var3.I1;
        if (imageView == null) {
            u890.C("coverImageView");
            throw th;
        }
        ixgVarF.k(imageView, new mre0(mwg0Var3, (byte) 5));
        mwg0 mwg0Var4 = ivg0VarZ0.n;
        if (mwg0Var4 == null) {
            u890.C("viewBinder");
            throw th;
        }
        String str4 = iug0Var.b;
        TextView textView8 = mwg0Var4.H1;
        if (textView8 == null) {
            u890.C("newReleaseDescriptionView");
            throw th;
        }
        textView8.setText(str4);
        mwg0 mwg0Var5 = ivg0VarZ0.n;
        if (mwg0Var5 == null) {
            u890.C("viewBinder");
            throw th;
        }
        String str5 = iug0Var.h;
        Button button3 = mwg0Var5.L1;
        if (button3 == null) {
            u890.C("callToActionButton");
            throw th;
        }
        button3.setText(str5);
        mwg0 mwg0Var6 = ivg0VarZ0.n;
        if (mwg0Var6 == null) {
            u890.C("viewBinder");
            throw th;
        }
        String str6 = iug0Var.e;
        TextView textView9 = mwg0Var6.J1;
        if (textView9 == null) {
            u890.C("titleView");
            throw th;
        }
        textView9.setText(str6);
        mwg0 mwg0Var7 = ivg0VarZ0.n;
        if (mwg0Var7 == null) {
            u890.C("viewBinder");
            throw th;
        }
        String str7 = iug0Var.f;
        TextView textView10 = mwg0Var7.K1;
        if (textView10 == null) {
            u890.C("artistNameView");
            throw null;
        }
        textView10.setText(str7);
        Observable observableA = ivg0VarZ0.f.a(iug0Var.Y);
        Scheduler scheduler = AndroidSchedulers.a;
        RxAndroidPlugins.b(scheduler);
        vkuVar.a(observableA.observeOn(scheduler).subscribe(new rwa0(ivg0VarZ0, (byte) 24), zzc0.h));
        if (str2 != null) {
            ?? r0 = str2.length() > 0 ? str2 : th;
            if (r0 != 0) {
                String str8 = iug0Var.Q0;
                twg0 twg0Var3 = twg0.LIGHT;
                if (str8 == null) {
                    mwg0Var = ivg0VarZ0.n;
                    if (mwg0Var != null) {
                        u890.C("viewBinder");
                        throw null;
                    }
                    if (twg0Var == null) {
                        twg0Var = twg0Var3;
                    }
                    textView = mwg0Var.P1;
                    if (textView != null) {
                        u890.C("subheaderView");
                        throw null;
                    }
                    textView.setVisibility(0);
                    r6 = mwg0Var.P1;
                    if (r6 != 0) {
                        u890.C("subheaderView");
                        throw null;
                    }
                    r6.setText(r0);
                    contextP0 = mwg0Var.P0();
                    if (twg0Var == twg0Var2) {
                        color2 = contextP0.getColor(2131102457);
                    } else {
                        color2 = contextP0.getColor(2131102468);
                    }
                    textView2 = mwg0Var.P1;
                    if (textView2 != null) {
                        u890.C("subheaderView");
                        throw null;
                    }
                    textView2.setTextColor(color2);
                    if (mwg0Var.k0().getConfiguration().orientation == 1) {
                        textView3 = mwg0Var.H1;
                        if (textView3 != null) {
                            u890.C("newReleaseDescriptionView");
                            throw null;
                        }
                        ((ViewGroup.MarginLayoutParams) textView3.getLayoutParams()).topMargin = mwg0Var.Y0(24.0f);
                    }
                } else {
                    if (!ihc1.h0(str8, "icon", true)) {
                        r2 = str8;
                        r2 = th;
                    }
                    if (r2 != 0) {
                        eyg0[] eyg0VarArrValues = eyg0.values();
                        int length = eyg0VarArrValues.length;
                        int i2 = 0;
                        while (i2 < length) {
                            eyg0 eyg0Var = eyg0VarArrValues[i2];
                            if (!r2.equalsIgnoreCase(eyg0Var.a)) {
                                i2++;
                                th = null;
                            } else if (eyg0.ICON_RELEASED == eyg0Var) {
                                mwg0 mwg0Var8 = ivg0VarZ0.n;
                                if (mwg0Var8 == null) {
                                    u890.C("viewBinder");
                                    throw th;
                                }
                                if (twg0Var == null) {
                                    twg0Var = twg0Var3;
                                }
                                TextView textView11 = mwg0Var8.P1;
                                if (textView11 == null) {
                                    u890.C("subheaderView");
                                    throw th;
                                }
                                textView11.setVisibility(0);
                                TextView textView12 = mwg0Var8.P1;
                                if (textView12 == null) {
                                    u890.C("subheaderView");
                                    throw th;
                                }
                                textView12.setText(str2);
                                int iY0 = mwg0Var8.Y0(12.0f);
                                Context contextP2 = mwg0Var8.P0();
                                int color4 = twg0Var == twg0Var2 ? contextP2.getColor(2131102457) : contextP2.getColor(2131102468);
                                Drawable drawable = mwg0Var8.P0().getDrawable(2131232508);
                                if (drawable != null) {
                                    drawable.setTint(color4);
                                    drawable.setBounds(0, 0, iY0, iY0);
                                    r7 = drawable;
                                } else {
                                    r7 = th;
                                }
                                ?? r3 = mwg0Var8.P1;
                                if (r3 == 0) {
                                    u890.C("subheaderView");
                                    throw th;
                                }
                                ?? r9 = th;
                                r3.setCompoundDrawablesRelative(r7, r9, r9, r9);
                                TextView textView13 = mwg0Var8.P1;
                                if (textView13 == null) {
                                    u890.C("subheaderView");
                                    throw null;
                                }
                                textView13.setCompoundDrawablePadding(4);
                                TextView textView14 = mwg0Var8.P1;
                                if (textView14 == null) {
                                    u890.C("subheaderView");
                                    throw null;
                                }
                                textView14.setTextColor(color4);
                                if (mwg0Var8.k0().getConfiguration().orientation == 1) {
                                    TextView textView15 = mwg0Var8.H1;
                                    if (textView15 == null) {
                                        u890.C("newReleaseDescriptionView");
                                        throw null;
                                    }
                                    ((ViewGroup.MarginLayoutParams) textView15.getLayoutParams()).topMargin = mwg0Var8.Y0(24.0f);
                                }
                            }
                        }
                        hhg1.n(f4i1.f("MarqueeVisualsType ", (String) r2, " not recognized"));
                        return;
                    }
                    mwg0Var = ivg0VarZ0.n;
                    if (mwg0Var != null) {
                        u890.C("viewBinder");
                        throw null;
                    }
                    if (twg0Var == null) {
                        twg0Var = twg0Var3;
                    }
                    textView = mwg0Var.P1;
                    if (textView != null) {
                        u890.C("subheaderView");
                        throw null;
                    }
                    textView.setVisibility(0);
                    r6 = mwg0Var.P1;
                    if (r6 != 0) {
                        u890.C("subheaderView");
                        throw null;
                    }
                    r6.setText(r0);
                    contextP0 = mwg0Var.P0();
                    if (twg0Var == twg0Var2) {
                        color2 = contextP0.getColor(2131102457);
                    } else {
                        color2 = contextP0.getColor(2131102468);
                    }
                    textView2 = mwg0Var.P1;
                    if (textView2 != null) {
                        u890.C("subheaderView");
                        throw null;
                    }
                    textView2.setTextColor(color2);
                    if (mwg0Var.k0().getConfiguration().orientation == 1) {
                        textView3 = mwg0Var.H1;
                        if (textView3 != null) {
                            u890.C("newReleaseDescriptionView");
                            throw null;
                        }
                        ((ViewGroup.MarginLayoutParams) textView3.getLayoutParams()).topMargin = mwg0Var.Y0(24.0f);
                    }
                }
            }
        }
        vkuVar.a(yoi1.i(ivg0VarZ0.b.a(), o6x.a).take(1L).observeOn(ivg0VarZ0.c).subscribe(new w090(ivg0VarZ0, this, (byte) 14)));
    }

    public final void H0() {
        ((zf30) this).h1 = true;
        Z0().q.c();
    }

    /* JADX INFO: renamed from: Q, reason: from getter */
    public final gn10 getX1() {
        return this.X1;
    }

    public final int Y0(float f) {
        return jch0.U(f * k0().getDisplayMetrics().density);
    }

    public final ivg0 Z0() {
        ivg0 ivg0Var = this.U1;
        if (ivg0Var != null) {
            return ivg0Var;
        }
        u890.C("presenter");
        throw null;
    }

    public final void a1(Function0 function0) {
        h72 h72Var = this.Q1;
        if (h72Var == null) {
            u890.C("animationHelper");
            throw null;
        }
        h72Var.Q(p7h.M(new ObjectAnimator[]{(ObjectAnimator) h72Var.c, (ObjectAnimator) h72Var.e, (ObjectAnimator) h72Var.i, (ObjectAnimator) h72Var.g, (ObjectAnimator) h72Var.X}), new lwg0(function0, this, (byte) 0), hlv.a, 300L);
    }

    public final mir0 c() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new mir0(kx40.g(yon1.M2(), (qir0) null, 4));
    }

    public final n6r0 e() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return yon1.M2();
    }

    public final String s() {
        return nik1.i2.a;
    }

    public final void v0(Context context) {
        nmn1.p(this);
        super.v0(context);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        byte b = 0;
        if (bundle != null) {
            this.S1 = bundle.getBoolean("animation_completed", false);
        }
        View viewInflate = layoutInflater.inflate(2131625179, viewGroup, false);
        this.F1 = b8k1.n(viewInflate, 2131429905);
        View viewN = b8k1.n(viewInflate, 2131429900);
        ConstraintLayout constraintLayoutN = b8k1.n(viewInflate, 2131429901);
        float fY0 = Y0(8.0f);
        this.N1 = b8k1.n(viewInflate, 2131429903);
        OverlayBackgroundView overlayBackgroundView = (OverlayBackgroundView) b8k1.n(viewInflate, 2131429895);
        this.G1 = overlayBackgroundView;
        overlayBackgroundView.setRadius(fY0);
        byte b2 = 1;
        overlayBackgroundView.a(P0().getColor(2131102102), true);
        View view = this.F1;
        if (view == null) {
            u890.C("overlayView");
            throw null;
        }
        overlayBackgroundView.setOnTouchListener(new rvq0(view, this.V1));
        this.H1 = (TextView) b8k1.n(viewInflate, 2131429897);
        this.I1 = (ImageView) b8k1.n(viewInflate, 2131429896);
        this.R1 = b8k1.n(viewInflate, 2131429907);
        this.J1 = (TextView) b8k1.n(viewInflate, 2131429898);
        this.K1 = (TextView) b8k1.n(viewInflate, 2131429891);
        this.P1 = (TextView) b8k1.n(viewInflate, 2131429908);
        Button button = (Button) b8k1.n(viewInflate, 2131429892);
        this.L1 = button;
        button.setOnClickListener(new kwg0(this, b));
        EncoreAddToButtonView encoreAddToButtonView = this.R1;
        if (encoreAddToButtonView == null) {
            u890.C("saveButton");
            throw null;
        }
        encoreAddToButtonView.n(new e4f0(this, (byte) 26));
        this.M1 = (TextView) b8k1.n(viewInflate, 2131429904);
        View viewN2 = b8k1.n(viewInflate, 2131429902);
        this.O1 = viewN2;
        viewN2.setOnClickListener(new kwg0(this, b2));
        View view2 = this.N1;
        if (view2 == null) {
            u890.C("header");
            throw null;
        }
        View view3 = this.O1;
        if (view3 == null) {
            u890.C("footer");
            throw null;
        }
        this.Q1 = new h72(view2, view3, viewN, constraintLayoutN);
        View view4 = this.F1;
        if (view4 == null) {
            u890.C("overlayView");
            throw null;
        }
        view4.addOnLayoutChangeListener(this.W1);
        N0().J().a(n0(), new ydb(this, (byte) 15));
        viewInflate.getClass();
        return viewInflate;
    }
}
