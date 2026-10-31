package com.spotify.liveevents.uiusecases.concertentityheader.elements;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.b8k1;
import p.bhn0;
import p.eg;
import p.jch0;
import p.l1d;
import p.lvx;
import p.qx21;
import p.t5b1;
import p.tlv;
import p.xwc;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/spotify/liveevents/uiusecases/concertentityheader/elements/CalendarIconView;", "", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "src_main_java_com_spotify_liveevents_uiusecases-uiusecases"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CalendarIconView extends LinearLayout implements tlv {
    public final boolean N0;
    public final float O0;
    public final float P0;
    public final Paint Q0;
    public final Paint R0;
    public boolean S0;
    public String T0;
    public String U0;
    public final TextView a;
    public final TextView b;
    public final Typeface c;
    public final Typeface d;
    public final Typeface e;
    public final Typeface f;
    public final Typeface g;
    public final int h;
    public final int i;
    public final boolean t;

    public CalendarIconView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint(1);
        Paint.Align align = Paint.Align.CENTER;
        paint.setTextAlign(align);
        this.Q0 = paint;
        Paint paint2 = new Paint(1);
        paint2.setTextAlign(align);
        this.R0 = paint2;
        this.T0 = "";
        this.U0 = "";
        View viewInflate = View.inflate(context, 2131624306, this);
        setOrientation(1);
        setGravity(17);
        setWillNotDraw(false);
        TextView textView = (TextView) b8k1.n(this, 2131428163);
        this.a = textView;
        TextView textView2 = (TextView) b8k1.n(this, 2131428161);
        this.b = textView2;
        textView.setGravity(17);
        textView2.setGravity(17);
        this.c = textView.getTypeface();
        this.d = textView2.getTypeface();
        this.e = qx21.b(context, 2131296269);
        this.f = qx21.b(context, 2131296262);
        this.g = qx21.b(context, 2131296277);
        this.h = textView.getCurrentTextColor();
        this.i = textView2.getCurrentTextColor();
        this.t = textView.getIncludeFontPadding();
        this.N0 = textView2.getIncludeFontPadding();
        this.O0 = textView.getLineSpacingExtra();
        this.P0 = textView2.getLineSpacingExtra();
        float dimension = context.getResources().getDimension(2131165532);
        viewInflate.getClass();
        lvx.t(viewInflate, dimension);
    }

    public final int a(int i) {
        return jch0.U(i * getResources().getDisplayMetrics().density);
    }

    public final void b(Canvas canvas, String str, Paint paint, float f, float f2) {
        if (str.length() == 0) {
            return;
        }
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        canvas.drawText(str, getWidth() / 2.0f, ((f2 / 2.0f) + f) - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f), paint);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void f(xwc xwcVar) {
        boolean z = xwcVar.g;
        boolean z2 = z && xwcVar.f;
        this.S0 = z2;
        String upperCase = xwcVar.a;
        if (z2) {
            upperCase = upperCase.toUpperCase(Locale.ROOT);
        }
        this.T0 = upperCase;
        this.U0 = xwcVar.b;
        TextView textView = this.a;
        textView.setText(upperCase);
        String str = this.U0;
        TextView textView2 = this.b;
        textView2.setText(str);
        textView.setVisibility(!this.S0 ? 0 : 8);
        textView2.setVisibility(this.S0 ? 8 : 0);
        Integer num = xwcVar.e;
        int iIntValue = this.i;
        int iIntValue2 = this.h;
        if (num != null) {
            textView.setTextColor(num.intValue());
            textView2.setTextColor(num.intValue());
        } else {
            textView.setTextColor(iIntValue2);
            textView2.setTextColor(iIntValue);
        }
        if (num != null) {
            iIntValue2 = num.intValue();
        }
        Paint paint = this.Q0;
        paint.setColor(iIntValue2);
        if (num != null) {
            iIntValue = num.intValue();
        }
        Paint paint2 = this.R0;
        paint2.setColor(iIntValue);
        if (this.S0) {
            Typeface typeface = this.g;
            if (typeface == null) {
                typeface = Typeface.DEFAULT_BOLD;
            }
            Context context = getContext();
            String str2 = this.T0;
            typeface.getClass();
            t5b1.a(paint, context, str2, typeface);
            t5b1.a(paint2, getContext(), this.U0, typeface);
        } else {
            Typeface typeface2 = this.d;
            Typeface typeface3 = this.c;
            if (z) {
                t5b1.c(textView);
                t5b1.c(textView2);
                Typeface typeface4 = this.e;
                if (typeface4 != null) {
                    typeface3 = typeface4;
                }
                textView.setTypeface(typeface3);
                Typeface typeface5 = this.f;
                if (typeface5 != null) {
                    typeface2 = typeface5;
                }
                textView2.setTypeface(typeface2);
            } else {
                t5b1.c(textView);
                t5b1.c(textView2);
                textView.setTypeface(typeface3);
                textView2.setTypeface(typeface2);
            }
        }
        if (z) {
            if (this.S0) {
                paint.setTextSize(getResources().getDisplayMetrics().density * 9.0f);
                paint2.setTextSize(getResources().getDisplayMetrics().density * 20.0f);
            }
            boolean z3 = this.S0;
            int i = z3 ? 1 : 2;
            textView.setTextSize(i, z3 ? 9.0f : 13.0f);
            textView2.setTextSize(i, this.S0 ? 20.0f : 18.0f);
        } else {
            int iC = l1d.C(xwcVar.h);
            if (iC == 0) {
                textView.setTextSize(2, 9.0f);
                textView2.setTextSize(2, 18.0f);
            } else if (iC != 1) {
                eg.o();
                return;
            } else {
                textView.setTextSize(2, 11.0f);
                textView2.setTextSize(2, 18.0f);
            }
        }
        textView.setIncludeFontPadding(this.S0 ? false : this.t);
        textView2.setIncludeFontPadding(this.S0 ? false : this.N0);
        if (this.S0) {
            setPadding(0, 0, 0, 0);
        } else {
            textView.setLineSpacing(this.O0, 1.0f);
            textView2.setLineSpacing(this.P0, 1.0f);
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams == null) {
                bhn0.i("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                return;
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.height = -2;
            layoutParams2.bottomMargin = 0;
            textView.setLayoutParams(layoutParams2);
            ViewGroup.LayoutParams layoutParams3 = textView2.getLayoutParams();
            if (layoutParams3 == null) {
                bhn0.i("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                return;
            }
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
            layoutParams4.height = -2;
            layoutParams4.bottomMargin = 0;
            textView2.setLayoutParams(layoutParams4);
            setPadding(0, 0, 0, 0);
        }
        Integer num2 = xwcVar.d;
        setBackgroundColor(num2 != null ? num2.intValue() : getContext().getColor(xwcVar.c));
        invalidate();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.S0) {
            b(canvas, this.T0, this.Q0, a(8), a(10));
            float fA = a(20);
            b(canvas, this.U0, this.R0, (getHeight() - a(7)) - fA, fA);
        }
    }

    public CalendarIconView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CalendarIconView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ CalendarIconView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
