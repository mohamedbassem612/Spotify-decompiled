package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatTextView;
import p.b60;
import p.c60;
import p.e9k;
import p.h60;
import p.lsi0;
import p.moz0;
import p.msi0;
import p.rti0;
import p.ysi0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class ActionMenuItemView extends AppCompatTextView implements rti0, View.OnClickListener, h60 {
    public Drawable N0;
    public lsi0 O0;
    public b60 P0;
    public c60 Q0;
    public boolean R0;
    public boolean S0;
    public final int T0;
    public int U0;
    public final int V0;
    public ysi0 i;
    public CharSequence t;

    /* JADX WARN: Multi-variable type inference failed */
    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.R0 = w();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, moz0.c, i, 0);
        this.T0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.V0 = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.U0 = -1;
        setSaveEnabled(false);
    }

    @Override // p.h60
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // p.h60
    public final boolean b() {
        return !TextUtils.isEmpty(getText()) && this.i.getIcon() == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.rti0
    public final void d(ysi0 ysi0Var) {
        this.i = ysi0Var;
        setIcon(ysi0Var.getIcon());
        setTitle(ysi0Var.getTitleCondensed());
        setId(ysi0Var.a);
        setVisibility(ysi0Var.isVisible() ? 0 : 8);
        setEnabled(ysi0Var.isEnabled());
        if (ysi0Var.hasSubMenu() && this.P0 == null) {
            this.P0 = new b60(this);
        }
    }

    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // p.rti0
    public ysi0 getItemData() {
        return this.i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        lsi0 lsi0Var = this.O0;
        if (lsi0Var != null) {
            lsi0Var.a(this.i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onConfigurationChanged(Configuration configuration) {
        super/*android.view.View*/.onConfigurationChanged(configuration);
        this.R0 = w();
        x();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i3 = this.U0) >= 0) {
            super/*android.view.View*/.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.T0;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (!zIsEmpty || this.N0 == null) {
            return;
        }
        super/*android.view.View*/.setPadding((getMeasuredWidth() - this.N0.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super/*android.view.View*/.onRestoreInstanceState(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b60 b60Var;
        if (this.i.hasSubMenu() && (b60Var = this.P0) != null && b60Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super/*android.view.View*/.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.S0 != z) {
            this.S0 = z;
            ysi0 ysi0Var = this.i;
            if (ysi0Var != null) {
                msi0 msi0Var = ysi0Var.n;
                msi0Var.k = true;
                msi0Var.q(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.N0 = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.V0;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        x();
    }

    public void setItemInvoker(lsi0 lsi0Var) {
        this.O0 = lsi0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.U0 = i;
        super/*android.view.View*/.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(c60 c60Var) {
        this.Q0 = c60Var;
    }

    public void setTitle(CharSequence charSequence) {
        this.t = charSequence;
        x();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean w() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.t);
        if (this.N0 != null && ((this.i.y & 4) != 4 || (!this.R0 && !this.S0))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.t : null);
        CharSequence charSequence = this.i.q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.i.e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.i.r;
        if (TextUtils.isEmpty(charSequence2)) {
            e9k.z(this, z3 ? null : this.i.e);
        } else {
            e9k.z(this, charSequence2);
        }
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }
}
