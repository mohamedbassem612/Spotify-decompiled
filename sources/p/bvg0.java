package p;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.messages.BetamaxPlaybackSession;
import com.spotify.player.model.ContextTrack$Metadata;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lp/bvg0;", "Lp/nzo;", "Lp/ug30;", "Lp/o6r0;", "Lp/cvg0;", "<init>", "()V", "p/w0o1", "src_main_java_com_spotify_marquee_marquee-marquee"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class bvg0 extends nzo implements ug30, o6r0, cvg0 {
    public f3q W1;
    public kt91 X1;
    public cyg0 Y1;
    public String Z1;
    public String a2;
    public String b2;
    public String c2;
    public String d2;
    public String e2;
    public String f2;
    public ytp0 g2;
    public AnimatorSet h2;
    public boolean i2;
    public final gn10 j2 = mno1.I;

    public final String A(Context context) {
        return "";
    }

    public final void D0() {
        ((zf30) this).h1 = true;
        AnimatorSet animatorSet = this.h2;
        if (animatorSet != null) {
            if (!animatorSet.isRunning()) {
                animatorSet = null;
            }
            if (animatorSet != null) {
                animatorSet.cancel();
            }
        }
    }

    public final void E0() {
        ((zf30) this).h1 = true;
        if (this.i2) {
            return;
        }
        i1(1, new avg0(this, (byte) 1));
    }

    public final void F0(Bundle bundle) {
        bundle.putBoolean("opt_out_animation_completed", this.i2);
        bundle.putFloat("opt_out_content_alpha", k1().getAlpha());
        bundle.putFloat("opt_out_content_translation_y", k1().getTranslationY());
        super/*p.t2u*/.F0(bundle);
    }

    /* JADX INFO: renamed from: Q, reason: from getter */
    public final gn10 getJ2() {
        return this.j2;
    }

    public final void V() {
        dg30 dg30VarF0 = f0();
        if (dg30VarF0 != null) {
            dg30VarF0.finish();
            if (Build.VERSION.SDK_INT < 34) {
                dg30VarF0.overridePendingTransition(0, 2130772031);
            } else {
                dg30VarF0.overrideActivityTransition(1, 0, 2130772031);
            }
        }
    }

    public final mir0 c() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new mir0(kx40.g(yon1.M2(), (qir0) null, 4));
    }

    public final Dialog c1(Bundle bundle) {
        CharSequence charSequence;
        p1f0 p1f0Var;
        Bundle bundleO0 = O0();
        this.Z1 = bundleO0.getString(ContextTrack$Metadata.KEY_ARTIST_URI, "");
        this.a2 = bundleO0.getString("lineitem_id", "");
        this.b2 = bundleO0.getString(ContextTrack$Metadata.KEY_AD_ID, "");
        this.c2 = bundleO0.getString("disclosure_text", "");
        this.d2 = bundleO0.getString("disclosure_cta_text", "");
        this.e2 = bundleO0.getString("optout_artist_text", "");
        this.f2 = bundleO0.getString("optout_marquee_text", "");
        this.i2 = bundle != null ? bundle.getBoolean("opt_out_animation_completed") : false;
        float f = bundle != null ? bundle.getFloat("opt_out_content_alpha", 1.0f) : 1.0f;
        float f2 = bundle != null ? bundle.getFloat("opt_out_content_translation_y") : 0.0f;
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(f0()).inflate(2131625347, (ViewGroup) null, false);
        int i = 2131430235;
        View viewT = m5n1.t(constraintLayoutInflate, 2131430235);
        if (viewT != null) {
            i = 2131430242;
            RecyclerView recyclerViewT = m5n1.t(constraintLayoutInflate, 2131430242);
            if (recyclerViewT != null) {
                i = 2131430243;
                TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131430243);
                if (textView != null) {
                    i = 2131430281;
                    LinearLayout linearLayout = (LinearLayout) m5n1.t(constraintLayoutInflate, 2131430281);
                    if (linearLayout != null) {
                        this.g2 = new ytp0((Object) constraintLayoutInflate, (Object) viewT, (Object) recyclerViewT, (Object) textView, (Object) linearLayout, (byte) 2);
                        k1().setAlpha(f);
                        k1().setTranslationY(f2);
                        int color = N0().getColor(2131104462);
                        String str = this.c2;
                        if (str == null) {
                            u890.C("disclosureText");
                            throw null;
                        }
                        String str2 = this.d2;
                        if (str2 == null) {
                            u890.C("disclosureCtaText");
                            throw null;
                        }
                        tzf0 tzf0Var = new tzf0(this, (byte) 18);
                        int length = str2.length();
                        SpannableString spannableString = new SpannableString(str2);
                        spannableString.setSpan(new wkc0(color, tzf0Var), 0, length, 17);
                        if (!jhc1.F(str)) {
                            charSequence = spannableString;
                            SpannableStringBuilder spannableStringBuilderAppend = SpannableStringBuilder.valueOf(str).append((CharSequence) " ").append((CharSequence) spannableString);
                            spannableStringBuilderAppend.getClass();
                            charSequence = spannableStringBuilderAppend;
                        }
                        charSequence = spannableString;
                        ytp0 ytp0Var = this.g2;
                        if (ytp0Var == null) {
                            u890.C("binding");
                            throw null;
                        }
                        ((TextView) ytp0Var.e).setHighlightColor(0);
                        ytp0 ytp0Var2 = this.g2;
                        if (ytp0Var2 == null) {
                            u890.C("binding");
                            throw null;
                        }
                        ((TextView) ytp0Var2.e).setMovementMethod(LinkMovementMethod.getInstance());
                        ytp0 ytp0Var3 = this.g2;
                        if (ytp0Var3 == null) {
                            u890.C("binding");
                            throw null;
                        }
                        ((TextView) ytp0Var3.e).setText(charSequence);
                        rs10 rs10Var = new rs10(this, N0(), (byte) 1);
                        ytp0 ytp0Var4 = this.g2;
                        if (ytp0Var4 == null) {
                            u890.C("binding");
                            throw null;
                        }
                        rs10Var.setContentView((View) ytp0Var4.b);
                        f3q f3qVar = this.W1;
                        if (f3qVar == null) {
                            u890.C("optOutOptionsHandlerFactory");
                            throw null;
                        }
                        String str3 = this.Z1;
                        if (str3 == null) {
                            u890.C("artistUri");
                            throw null;
                        }
                        String str4 = this.a2;
                        if (str4 == null) {
                            u890.C("lineItemId");
                            throw null;
                        }
                        String str5 = this.b2;
                        if (str5 == null) {
                            u890.C("adId");
                            throw null;
                        }
                        String str6 = this.e2;
                        if (str6 == null) {
                            u890.C("optOutArtistText");
                            throw null;
                        }
                        String str7 = this.f2;
                        if (str7 == null) {
                            u890.C("optOutMarqueeText");
                            throw null;
                        }
                        dg30 dg30VarN0 = N0();
                        switch (f3qVar.a) {
                            case 0:
                                bup bupVar = (bup) f3qVar.b;
                                p1f0Var = new p1f0(((s7q) bupVar.b).X2(), (cvg0) ((qqp) bupVar.c).d, str3, str4, str5, str6, str7, dg30VarN0);
                                break;
                            default:
                                bup bupVar2 = (bup) f3qVar.b;
                                p1f0Var = new p1f0(((uw0) bupVar2.b).u(), (cvg0) ((qqp) bupVar2.c).d, str3, str4, str5, str6, str7, dg30VarN0);
                                break;
                        }
                        ytp0 ytp0Var5 = this.g2;
                        if (ytp0Var5 == null) {
                            u890.C("binding");
                            throw null;
                        }
                        RecyclerView recyclerView = (RecyclerView) ytp0Var5.d;
                        f0();
                        recyclerView.setLayoutManager(new LinearLayoutManager(1));
                        ytp0 ytp0Var6 = this.g2;
                        if (ytp0Var6 == null) {
                            u890.C("binding");
                            throw null;
                        }
                        ((RecyclerView) ytp0Var6.d).setAdapter(new bk7(LayoutInflater.from(f0()), p1f0Var, (byte) 2));
                        ytp0 ytp0Var7 = this.g2;
                        if (ytp0Var7 == null) {
                            u890.C("binding");
                            throw null;
                        }
                        ConstraintLayout constraintLayout = (ConstraintLayout) ytp0Var7.b;
                        dj20 dj20Var = dj20.Z;
                        WeakHashMap weakHashMap = b8k1.a;
                        r7k1.c(constraintLayout, dj20Var);
                        return rs10Var;
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        return null;
    }

    public final n6r0 e() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return yon1.M2();
    }

    public final void i1(int i, avg0 avg0Var) {
        z6x z6xVarM;
        ytp0 ytp0Var = this.g2;
        if (ytp0Var == null) {
            u890.C("binding");
            throw null;
        }
        ObjectAnimator objectAnimatorX = j0o1.x((View) ytp0Var.c);
        ObjectAnimator objectAnimatorX2 = j0o1.x(k1());
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(k1(), (Property<LinearLayout, Float>) View.TRANSLATION_Y, 50.0f, 0.0f);
        int iC = l1d.C(i);
        if (iC != 0) {
            z6xVarM = iC != 3 ? z6x.a : p7h.M(new ObjectAnimator[]{objectAnimatorX2, objectAnimatorOfFloat});
        } else {
            z6xVarM = p7h.M(new ObjectAnimator[]{objectAnimatorX, objectAnimatorX2, objectAnimatorOfFloat});
        }
        l1(z6xVarM, avg0Var);
    }

    public final void j1(int i, iu30 iu30Var) {
        z6x z6xVarM;
        ytp0 ytp0Var = this.g2;
        if (ytp0Var == null) {
            u890.C("binding");
            throw null;
        }
        ObjectAnimator objectAnimatorY = j0o1.y((View) ytp0Var.c);
        ObjectAnimator objectAnimatorY2 = j0o1.y(k1());
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(k1(), (Property<LinearLayout, Float>) View.TRANSLATION_Y, 0.0f, 50.0f);
        int iC = l1d.C(i);
        if (iC != 1) {
            z6xVarM = iC != 2 ? z6x.a : p7h.M(new ObjectAnimator[]{objectAnimatorY2, objectAnimatorOfFloat});
        } else {
            z6xVarM = p7h.M(new ObjectAnimator[]{objectAnimatorY, objectAnimatorY2, objectAnimatorOfFloat});
        }
        l1(z6xVarM, iu30Var);
    }

    public final LinearLayout k1() {
        ytp0 ytp0Var = this.g2;
        if (ytp0Var != null) {
            return (LinearLayout) ytp0Var.f;
        }
        u890.C("binding");
        throw null;
    }

    public final void l1(List list, iu30 iu30Var) {
        AnimatorSet animatorSet = this.h2;
        if (animatorSet != null) {
            if (!animatorSet.isRunning()) {
                animatorSet = null;
            }
            if (animatorSet != null) {
                animatorSet.cancel();
            }
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(list);
        animatorSet2.setDuration(200L);
        if (iu30Var != null) {
            animatorSet2.addListener(new ss10(iu30Var, (byte) 1));
        }
        animatorSet2.start();
        this.h2 = animatorSet2;
    }

    public final String s() {
        return nik1.i2.a;
    }

    public final void u0(int i, int i2, Intent intent) {
        if (i2 == 1) {
            i1(4, null);
        }
    }
}
