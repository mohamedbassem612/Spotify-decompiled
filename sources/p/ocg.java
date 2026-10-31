package p;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encoremobile.widgets.CancellableSeekBar;
import com.spotify.equalizer.uiusecases.equalizerpicker.EqualizerView;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ocg implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public ocg(rcg rcgVar, qcg qcgVar) {
        this.a = (byte) 0;
        this.c = rcgVar;
        this.b = qcgVar;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [android.view.View, android.widget.TextView, androidx.appcompat.widget.AppCompatTextView, java.lang.Object, p.keg1] */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ieg1 ieg1Var;
        SpannableString spannableString;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rcg rcgVar = (rcg) obj;
                qcg qcgVar = (qcg) obj2;
                rcg.d(fFloatValue, qcgVar);
                rcgVar.a(fFloatValue, qcgVar, false);
                rcgVar.invalidateSelf();
                break;
            case 1:
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ((tps) obj2).getClass();
                ((ConstraintLayout) obj).findViewById(2131430324).getBackground().setColorFilter(new PorterDuffColorFilter(iIntValue, PorterDuff.Mode.SRC));
                break;
            case 2:
                ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) obj2;
                layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ((RecyclerView) ((f0a) ((ver) obj).b).h).setLayoutParams(layoutParams);
                break;
            case 3:
                if (((ValueAnimator) obj2).isRunning()) {
                    qws qwsVar = (qws) obj;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    CancellableSeekBar cancellableSeekBar = qwsVar.c;
                    cancellableSeekBar.setSecondaryProgress(cancellableSeekBar.getProgress() + ((int) ((cancellableSeekBar.getMax() - cancellableSeekBar.getProgress()) * animatedFraction)));
                    ((Drawable) qwsVar.h.getValue()).setAlpha(255 - ((int) (animatedFraction * 255.0f)));
                }
                break;
            case 4:
                ((hfz) obj2).d.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
                int i = EqualizerView.Y0;
                ((EqualizerView) obj).z(false);
                break;
            default:
                long jLongValue = ((Long) valueAnimator.getAnimatedValue()).longValue();
                ?? r0 = (keg1) obj2;
                gku gkuVar = (gku) obj;
                jyv0 jyv0Var = gkuVar.e;
                r0.getClass();
                List list = jyv0Var.a;
                int iJ = p7h.J(list, new vfe1((byte) 6, jLongValue));
                ieg1 ieg1Var2 = ieg1.c;
                if (iJ < 0) {
                    ieg1Var = ieg1Var2;
                } else {
                    iyv0 iyv0Var = (iyv0) list.get(iJ);
                    ieg1Var = new ieg1(iyv0Var.a, iyv0Var.b);
                }
                boolean z = gkuVar.d;
                int i2 = r0.N0;
                int i3 = r0.O0;
                if (!ieg1Var.equals(r0.W0)) {
                    r0.W0 = ieg1Var;
                    if (ieg1Var.equals(ieg1Var2)) {
                        r0.X0 = null;
                        if (!r0.V0) {
                            r0.setVisibility(4);
                        }
                        break;
                    } else {
                        r0.setVisibility(0);
                        String str = ieg1Var.a;
                        if (str != r0.X0) {
                            r0.X0 = str;
                            int i4 = ieg1Var.b;
                            int i5 = r0.Q0;
                            int i6 = r0.P0;
                            if (r0.V0) {
                                if (z) {
                                    i5 = i6;
                                }
                                spannableString = new SpannableString(str);
                                spannableString.setSpan(new vag1(i5, r0.S0), 0, spannableString.length(), 33);
                                if (i4 > 0) {
                                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i3);
                                    int length = spannableString.length();
                                    if (i4 <= length) {
                                        length = i4;
                                    }
                                    spannableString.setSpan(foregroundColorSpan, 0, length, 33);
                                }
                                if (i4 < spannableString.length()) {
                                    ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(i2);
                                    int length2 = spannableString.length();
                                    if (i4 > length2) {
                                        i4 = length2;
                                    }
                                    spannableString.setSpan(foregroundColorSpan2, i4, spannableString.length(), 33);
                                }
                            } else {
                                SpannableString spannableString2 = new SpannableString(str);
                                spannableString2.setSpan(new peg1(z ? i6 : i5, r0.O0, r0.N0, r0.R0, r0.S0, i4), 0, spannableString2.length(), 33);
                                spannableString = spannableString2;
                            }
                            r0.setText(ihc1.e1(spannableString), TextView.BufferType.SPANNABLE);
                            break;
                        } else {
                            int i7 = ieg1Var.b;
                            CharSequence text = r0.getText();
                            Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
                            if (spannable != null) {
                                int length3 = spannable.length();
                                if (i7 <= length3) {
                                    length3 = i7;
                                }
                                if (r0.V0) {
                                    for (ForegroundColorSpan foregroundColorSpan3 : (ForegroundColorSpan[]) spannable.getSpans(0, spannable.length(), ForegroundColorSpan.class)) {
                                        spannable.removeSpan(foregroundColorSpan3);
                                    }
                                    if (length3 > 0) {
                                        spannable.setSpan(new ForegroundColorSpan(i3), 0, length3, 33);
                                    }
                                    if (length3 < spannable.length()) {
                                        spannable.setSpan(new ForegroundColorSpan(i2), length3, spannable.length(), 33);
                                    }
                                } else {
                                    peg1 peg1Var = (peg1) f46.k0(spannable.getSpans(0, spannable.length(), peg1.class));
                                    if (peg1Var != null) {
                                        peg1Var.f = i7;
                                        r0.invalidate();
                                    }
                                }
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ ocg(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
