package com.spotify.encoreconsumermobile.elements.seemoretextview;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.al51;
import p.bl51;
import p.cl51;
import p.dl51;
import p.eg;
import p.f46;
import p.gnz0;
import p.h5;
import p.hid0;
import p.i5;
import p.idd1;
import p.ike1;
import p.iu30;
import p.l1d;
import p.nhc1;
import p.tlv;
import p.wk51;
import p.xk51;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002'(B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0017R$\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00148\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010&\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"¨\u0006)"}, d2 = {"Lcom/spotify/encoreconsumermobile/elements/seemoretextview/SeeMoreTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View$OnClickListener;", "l", "Lp/rih1;", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "maxLines", "setMaxLines", "(I)V", "setExpandedMaxLines", "Lp/wk51;", "model", "setExpandedText", "(Lp/wk51;)V", "setCollapsedText", "value", "i", "Lp/wk51;", "getModel", "()Lp/wk51;", "Landroid/text/style/ClickableSpan;", "U0", "Lp/znb0;", "getSeeMoreSpan", "()Landroid/text/style/ClickableSpan;", "seeMoreSpan", "V0", "getSeeLessSpan", "seeLessSpan", "p/sjc0", "p/al51", "src_main_java_com_spotify_encoreconsumermobile_elements_seemoretextview-seemoretextview"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SeeMoreTextView extends AppCompatTextView implements tlv {
    public static final Pattern Y0 = Pattern.compile(" ");
    public iu30 N0;
    public final String O0;
    public final String P0;
    public final String Q0;
    public final String R0;
    public int S0;
    public int T0;
    public final idd1 U0;
    public final idd1 V0;
    public boolean W0;
    public boolean X0;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public wk51 model;
    public final String t;

    /* JADX WARN: Multi-variable type inference failed */
    public SeeMoreTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.model = new wk51(6, "");
        this.t = context.getString(2131961587);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gnz0.a, 0, 0);
        String string = typedArrayObtainStyledAttributes.getResources().getString(typedArrayObtainStyledAttributes.getResourceId(0, 2131961587));
        string.getClass();
        this.t = string;
        typedArrayObtainStyledAttributes.recycle();
        super/*android.view.View*/.setOnClickListener(new hid0(this, (byte) 28));
        this.O0 = "…";
        String string2 = getResources().getString(2131961589);
        Pattern pattern = Y0;
        this.P0 = l1d.m("… ", pattern.matcher(string2).replaceAll(" "));
        this.Q0 = l1d.m("…", pattern.matcher(this.t).replaceAll(" "));
        this.R0 = this.t;
        this.S0 = getMaxLines();
        this.T0 = Integer.MAX_VALUE;
        this.U0 = new idd1(new bl51(this, (byte) 1));
        this.V0 = new idd1(new bl51(this, (byte) 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClickableSpan getSeeLessSpan() {
        return (ClickableSpan) this.V0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClickableSpan getSeeMoreSpan() {
        return (ClickableSpan) this.U0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setCollapsedText(wk51 model) {
        super/*android.widget.TextView*/.setMaxLines(this.S0);
        C(model, new cl51(this, model, (byte) 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setExpandedText(wk51 model) {
        super/*android.widget.TextView*/.setMaxLines(Integer.MAX_VALUE);
        C(model, new cl51(this, model, (byte) 1));
    }

    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final void f(wk51 wk51Var) {
        this.W0 = true;
        this.model = wk51Var;
        int iOrdinal = wk51Var.b.ordinal();
        if (iOrdinal == 0) {
            setCollapsedText(wk51Var);
        } else if (iOrdinal == 1) {
            setExpandedText(wk51Var);
        } else {
            eg.o();
        }
    }

    public final SpannableStringBuilder B(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence);
        spannableStringBuilder.append('\n');
        y(spannableStringBuilder, this.R0, getSeeLessSpan());
        return spannableStringBuilder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C(wk51 wk51Var, Function0 function0) {
        CharSequence charSequence = wk51Var.a;
        boolean z = getWidth() > 0 && this.S0 > 0 && z(charSequence).getLineCount() > this.S0;
        if (z) {
            setMovementMethod(LinkMovementMethod.getInstance());
            setText((CharSequence) function0.invoke(), TextView.BufferType.NORMAL);
        } else {
            setMovementMethod(null);
            setText(charSequence);
        }
        post(new dl51(this, wk51Var, charSequence, z, function0));
    }

    public final SpannableStringBuilder D(SpannableString spannableString, int i, String str) {
        CharSequence charSequenceSubSequence;
        int length;
        CharSequence charSequenceSubSequence2 = spannableString.subSequence(0, z(spannableString).getLineEnd(i - 1));
        char[] cArr = {'\n'};
        int length2 = charSequenceSubSequence2.length() - 1;
        if (length2 < 0) {
            charSequenceSubSequence = "";
            break;
        }
        while (true) {
            int i2 = length2 - 1;
            if (!f46.K(cArr, charSequenceSubSequence2.charAt(length2))) {
                charSequenceSubSequence = charSequenceSubSequence2.subSequence(0, length2 + 1);
                break;
            }
            if (i2 < 0) {
                charSequenceSubSequence = "";
                break;
            }
            length2 = i2;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceSubSequence);
        while (true) {
            if (z(spannableStringBuilder.toString() + str).getLineCount() <= i || (length = spannableStringBuilder.length() - str.length()) <= 0 || length >= spannableStringBuilder.length()) {
                break;
            }
            spannableStringBuilder.delete(length, spannableStringBuilder.length());
        }
        return spannableStringBuilder;
    }

    public final wk51 getModel() {
        return this.model;
    }

    public final void n(iu30 iu30Var) {
        this.N0 = iu30Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof al51)) {
            super/*android.view.View*/.onRestoreInstanceState(parcelable);
            return;
        }
        al51 al51Var = (al51) parcelable;
        super/*android.view.View*/.onRestoreInstanceState(((i5) al51Var).a);
        xk51 xk51Var = al51Var.c;
        if (xk51Var != null) {
            wk51 wk51VarA = wk51.a(this.model, null, xk51Var, null, 5);
            this.model = wk51VarA;
            int iOrdinal = wk51VarA.b.ordinal();
            if (iOrdinal == 0) {
                setCollapsedText(wk51VarA);
            } else if (iOrdinal == 1) {
                setExpandedText(wk51VarA);
            } else {
                eg.o();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, p.al51, p.i5] */
    public final Parcelable onSaveInstanceState() {
        h5 h5VarOnSaveInstanceState = super/*android.view.View*/.onSaveInstanceState();
        if (h5VarOnSaveInstanceState == null) {
            h5VarOnSaveInstanceState = i5.b;
        }
        ?? al51Var = new al51(h5VarOnSaveInstanceState);
        al51Var.c = this.model.b;
        return al51Var;
    }

    public final void setExpandedMaxLines(int maxLines) {
        if (maxLines >= 0 && maxLines >= this.S0) {
            this.T0 = maxLines;
        }
        this.X0 = this.T0 != Integer.MAX_VALUE;
        if (this.W0) {
            f(this.model);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setMaxLines(int maxLines) {
        this.S0 = maxLines;
        if (this.W0) {
            f(this.model);
        } else {
            super/*android.widget.TextView*/.setMaxLines(maxLines);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setOnClickListener(View.OnClickListener l) {
        ike1.a.A("Use SeeMoreText.Events.DisplayTextClicked instead to gather general click events of this view", new Object[0]);
        super/*android.view.View*/.setOnClickListener(l);
    }

    public final void y(SpannableStringBuilder spannableStringBuilder, String str, ClickableSpan clickableSpan) {
        spannableStringBuilder.append((CharSequence) str);
        String str2 = this.O0;
        spannableStringBuilder.setSpan(clickableSpan, (spannableStringBuilder.length() - str.length()) + (nhc1.Y(str, str2, false) ? str2.length() : 0), spannableStringBuilder.length(), 33);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final StaticLayout z(CharSequence charSequence) {
        int measuredWidth = (getMeasuredWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight();
        Layout.Alignment alignment = getLayout() != null ? getLayout().getAlignment() : Layout.Alignment.ALIGN_NORMAL;
        alignment.getClass();
        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), getPaint(), measuredWidth).setAlignment(alignment).setTextDirection(TextDirectionHeuristics.ANYRTL_LTR).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).setIncludePad(getIncludeFontPadding()).setBreakStrategy(getBreakStrategy()).setHyphenationFrequency(getHyphenationFrequency());
        if (Build.VERSION.SDK_INT >= 26) {
            hyphenationFrequency.setJustificationMode(getJustificationMode());
        }
        return hyphenationFrequency.build();
    }

    public SeeMoreTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public SeeMoreTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ SeeMoreTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
