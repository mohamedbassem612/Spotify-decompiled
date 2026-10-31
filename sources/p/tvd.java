package p;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.legacyglue.viewgroup.PasteLinearLayout;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tvd extends PasteLinearLayout {
    public final ImageView e;
    public final TextView f;
    public final TextView g;
    public asd h;
    public boolean i;
    public float t;

    /* JADX WARN: Multi-variable type inference failed */
    public tvd(Context context) {
        super(context, (AttributeSet) null, 0);
        this.i = false;
        this.t = 1.0f;
        setOrientation(1);
        LayoutInflater.from(getContext()).inflate(2131625017, (ViewGroup) this);
        ImageView imageView = (ImageView) findViewById(R.id.icon);
        this.e = imageView;
        TextView textView = (TextView) findViewById(2131431356);
        this.f = textView;
        TextView textView2 = (TextView) findViewById(2131431115);
        this.g = textView2;
        setGravity(1);
        TextView[] textViewArr = {textView, textView2};
        r6p1.y(textViewArr);
        r6p1.x(textViewArr);
        r6p1.w(this);
        setClickable(true);
        v9w0 v9w0VarP = b2u.p(this);
        Collections.addAll(v9w0VarP.d, imageView);
        Collections.addAll(v9w0VarP.c, textView, textView2);
        v9w0VarP.a();
        if (isInEditMode()) {
            return;
        }
        textView2.setVisibility(8);
    }

    public static int b(TextView textView, int i) {
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
        return (((fontMetricsInt.bottom - fontMetricsInt.top) + fontMetricsInt.leading) * i) + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        float f = i;
        int iRound = Math.round(this.t * f);
        int iRound2 = Math.round(((this.t * 0.5f) + 0.5f) * f);
        this.f.measure(View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824), iMakeMeasureSpec);
        this.g.measure(View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824), iMakeMeasureSpec);
        this.e.measure(View.MeasureSpec.makeMeasureSpec(iRound, 1073741824), iMakeMeasureSpec);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d() {
        TextView textView;
        TextView textView2;
        if (this.i || (textView = this.f) == null || (textView2 = this.g) == null) {
            return;
        }
        super/*android.view.View*/.setContentDescription(f4i1.f(String.valueOf(textView.getText()), "\n", String.valueOf(textView2.getText())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void dispatchDraw(Canvas canvas) {
        super/*android.view.View*/.dispatchDraw(canvas);
        asd asdVar = this.h;
        if (asdVar != null) {
            int i = asdVar.j;
            int i2 = asdVar.k;
            canvas.save();
            boolean zT = bno1.t(this);
            ImageView imageView = this.e;
            if (zT) {
                canvas.translate(Math.round(((1.0f - this.t) * getMeasuredWidth()) / 2.0f) + i2, (imageView.getMeasuredHeight() - i) - i2);
            } else {
                canvas.translate(((canvas.getWidth() - i) - i2) - Math.round(((1.0f - this.t) * getMeasuredWidth()) / 2.0f), (imageView.getMeasuredHeight() - i) - i2);
            }
            asdVar.draw(canvas);
            canvas.restore();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void drawableStateChanged() {
        super/*android.view.View*/.drawableStateChanged();
        boolean z = false;
        for (int i : getDrawableState()) {
            z |= i == -16842910;
        }
        if (z) {
            setAlpha(0.4f);
        }
    }

    public float getCardImageWidthRatio() {
        return this.t;
    }

    public ImageView getImageView() {
        return this.e;
    }

    public TextView getSubtitleView() {
        return this.g;
    }

    public TextView getTitleView() {
        return this.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth() / 2;
        ImageView imageView = this.e;
        int measuredWidth2 = measuredWidth - (imageView.getMeasuredWidth() / 2);
        int measuredWidth3 = imageView.getMeasuredWidth() + measuredWidth2;
        int measuredWidth4 = getMeasuredWidth() / 2;
        TextView textView = this.f;
        int measuredWidth5 = measuredWidth4 - (textView.getMeasuredWidth() / 2);
        int measuredWidth6 = textView.getMeasuredWidth() + measuredWidth5;
        int measuredHeight = imageView.getMeasuredHeight();
        imageView.layout(measuredWidth2, 0, measuredWidth3, measuredHeight);
        if (textView.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
            int i5 = measuredHeight + marginLayoutParams.topMargin;
            textView.layout(measuredWidth5, i5, measuredWidth6, textView.getMeasuredHeight() + i5);
            measuredHeight = textView.getMeasuredHeight() + i5 + marginLayoutParams.bottomMargin;
        }
        TextView textView2 = this.g;
        if (textView2.getVisibility() != 8) {
            int i6 = measuredHeight + ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).topMargin;
            textView2.layout(measuredWidth5, i6, measuredWidth6, textView2.getMeasuredHeight() + i6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int measuredHeight2 = 0;
        int maxLines = 1;
        if (View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == 1073741824) {
            dm5.m(size2 < size);
            a(size2);
            setMeasuredDimension(size2, size);
            return;
        }
        Object[] objArr = View.MeasureSpec.getMode(i) == 0;
        Object[] objArr2 = View.MeasureSpec.getMode(i2) == 0;
        if (objArr == objArr2) {
            super/*android.view.View*/.onMeasure(i, i2);
            return;
        }
        ImageView imageView = this.e;
        TextView textView = this.f;
        TextView textView2 = this.g;
        if (objArr2 == true) {
            a(size2);
        } else {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int maxLines2 = textView2.getMaxLines();
            if (textView.getVisibility() == 8 && maxLines2 == 2) {
                maxLines2 = 1;
            } else {
                maxLines = textView.getMaxLines();
            }
            int iRound = Math.round(((size - b(textView, maxLines)) - b(textView2, maxLines2)) / this.t);
            float f = iRound;
            int iRound2 = Math.round(this.t * f);
            int iRound3 = Math.round(((this.t * 0.5f) + 0.5f) * f);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iRound3, 1073741824);
            textView.measure(iMakeMeasureSpec3, iMakeMeasureSpec);
            textView2.measure(iMakeMeasureSpec3, iMakeMeasureSpec);
            imageView.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
            size2 = iRound;
        }
        int measuredHeight3 = imageView.getMeasuredHeight();
        if (textView.getVisibility() != 8) {
            if (textView.getVisibility() == 8) {
                measuredHeight = 0;
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                measuredHeight = textView.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            }
            measuredHeight3 += measuredHeight;
        }
        if (textView2.getVisibility() != 8) {
            if (textView2.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) textView2.getLayoutParams();
                measuredHeight2 = textView2.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
            }
            measuredHeight3 += measuredHeight2;
        }
        setMeasuredDimension(size2, measuredHeight3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAccessoryDrawable(asd asdVar) {
        this.h = asdVar;
        postInvalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAppearance(jsd jsdVar) {
        int iOrdinal = jsdVar.ordinal();
        TextView textView = this.g;
        TextView textView2 = this.f;
        switch (iOrdinal) {
            case 0:
                textView2.setVisibility(4);
                textView.setVisibility(4);
                break;
            case 1:
                textView2.setVisibility(0);
                textView.setVisibility(4);
                break;
            case 2:
                foo1.F(getContext(), textView, 2130970009);
                textView2.setVisibility(0);
                textView.setTextColor(getContext().getColor(2131102468));
                textView.setVisibility(0);
                break;
            case 3:
                foo1.F(getContext(), textView, 2130970019);
                textView2.setVisibility(0);
                textView.setTextColor(getContext().getColor(2131102468));
                textView.setVisibility(0);
                break;
            case 4:
                foo1.F(getContext(), textView2, 2130970007);
                textView2.setVisibility(0);
                textView2.setTextColor(getContext().getColor(2131102468));
                textView.setVisibility(8);
                this.t = 0.66f;
                setTextLayout(vrd.b);
                textView2.setTag(2131427698, Integer.valueOf(a8o.y(24.0f, getResources())));
                textView2.setTag(2131427697, Integer.valueOf(a8o.y(8.0f, getResources())));
                break;
            case 5:
                textView2.setVisibility(8);
                textView.setVisibility(8);
                this.t = 0.66f;
                break;
            case 6:
                foo1.F(getContext(), textView2, 2130970009);
                textView2.setVisibility(0);
                textView2.setTextColor(getContext().getColor(2131102468));
                textView.setVisibility(8);
                setTextLayout(vrd.b);
                textView2.setTag(2131427698, Integer.valueOf(a8o.y(24.0f, getResources())));
                textView2.setTag(2131427697, Integer.valueOf(a8o.y(8.0f, getResources())));
                break;
            case 7:
                textView2.setVisibility(8);
                textView.setTag(2131427698, Integer.valueOf(a8o.y(20.0f, getResources())));
                foo1.F(getContext(), textView, 2130970009);
                textView.setTextColor(getContext().getColor(2131102468));
                textView.setMaxLines(2);
                textView.setVisibility(0);
                break;
            default:
                hhg1.n("Unsupported CardAppearance: ".concat(String.valueOf(jsdVar)));
                return;
        }
        r6p1.w(this);
    }

    public void setCardImageWidthRatio(float f) {
        dm5.m(((double) f) >= 0.5d && f <= 1.0f);
        this.t = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setContentDescription(CharSequence charSequence) {
        super/*android.view.View*/.setContentDescription(charSequence);
        this.i = charSequence != null;
        d();
    }

    public void setImageResource(int i) {
        this.e.setImageResource(i);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.g.setText(charSequence);
        d();
    }

    public void setTextLayout(vrd vrdVar) {
        int iOrdinal = vrdVar.ordinal();
        TextView textView = this.g;
        TextView textView2 = this.f;
        if (iOrdinal == 0) {
            textView2.setMaxLines(1);
            textView.setMaxLines(1);
        } else if (iOrdinal == 1) {
            textView2.setMaxLines(3);
            textView.setMaxLines(1);
        } else {
            if (iOrdinal != 2) {
                return;
            }
            textView2.setMaxLines(1);
            textView.setMaxLines(2);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f.setText(charSequence);
        d();
    }
}
