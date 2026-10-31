package p;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ghd1 extends LinearLayout {
    public static final /* synthetic */ int O0 = 0;
    public final /* synthetic */ TabLayout N0;
    public dhd1 a;
    public TextView b;
    public ImageView c;
    public View d;
    public s1a e;
    public View f;
    public TextView g;
    public ImageView h;
    public Drawable i;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghd1(TabLayout tabLayout, Context context) {
        super(context);
        this.N0 = tabLayout;
        this.t = 2;
        f(context);
        int i = tabLayout.d;
        int i2 = tabLayout.e;
        int i3 = tabLayout.f;
        int i4 = tabLayout.g;
        WeakHashMap weakHashMap = b8k1.a;
        setPaddingRelative(i, i2, i3, i4);
        setGravity(17);
        setOrientation(!tabLayout.c1 ? 1 : 0);
        setClickable(true);
        t7k1.a(this, PointerIcon.getSystemIcon(getContext(), 1002));
    }

    private s1a getBadge() {
        return this.e;
    }

    private s1a getOrCreateBadge() {
        int iMax;
        if (this.e == null) {
            Context context = getContext();
            s1a s1aVar = new s1a(context);
            blo1.m(context, null, 2130968758, 2132018757);
            int[] iArr = omz0.c;
            blo1.n(context, null, iArr, 2130968758, 2132018757, new int[0]);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, iArr, 2130968758, 2132018757);
            int i = typedArrayObtainStyledAttributes.getInt(8, 4);
            r1a r1aVar = s1aVar.h;
            int i2 = r1aVar.e;
            d4e1 d4e1Var = s1aVar.c;
            if (i2 != i) {
                r1aVar.e = i;
                s1aVar.X = ((int) Math.pow(10.0d, ((double) i) - 1.0d)) - 1;
                d4e1Var.d = true;
                s1aVar.f();
                s1aVar.invalidateSelf();
            }
            if (typedArrayObtainStyledAttributes.hasValue(9) && r1aVar.d != (iMax = Math.max(0, typedArrayObtainStyledAttributes.getInt(9, 0)))) {
                r1aVar.d = iMax;
                d4e1Var.d = true;
                s1aVar.f();
                s1aVar.invalidateSelf();
            }
            int defaultColor = dgo1.i(context, typedArrayObtainStyledAttributes, 0).getDefaultColor();
            r1aVar.a = defaultColor;
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(defaultColor);
            gch0 gch0Var = s1aVar.b;
            if (gch0Var.a.c != colorStateListValueOf) {
                gch0Var.m(colorStateListValueOf);
                s1aVar.invalidateSelf();
            }
            if (typedArrayObtainStyledAttributes.hasValue(3)) {
                int defaultColor2 = dgo1.i(context, typedArrayObtainStyledAttributes, 3).getDefaultColor();
                r1aVar.b = defaultColor2;
                if (d4e1Var.a.getColor() != defaultColor2) {
                    d4e1Var.a.setColor(defaultColor2);
                    s1aVar.invalidateSelf();
                }
            }
            int i3 = typedArrayObtainStyledAttributes.getInt(1, 8388661);
            if (r1aVar.i != i3) {
                r1aVar.i = i3;
                WeakReference weakReference = s1aVar.O0;
                if (weakReference != null && weakReference.get() != null) {
                    View view = (View) s1aVar.O0.get();
                    WeakReference weakReference2 = s1aVar.P0;
                    s1aVar.e(view, weakReference2 != null ? (FrameLayout) weakReference2.get() : null);
                }
            }
            r1aVar.X = typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, 0);
            s1aVar.f();
            r1aVar.Y = typedArrayObtainStyledAttributes.getDimensionPixelOffset(10, 0);
            s1aVar.f();
            r1aVar.Z = typedArrayObtainStyledAttributes.getDimensionPixelOffset(7, r1aVar.X);
            s1aVar.f();
            r1aVar.N0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(11, r1aVar.Y);
            s1aVar.f();
            if (typedArrayObtainStyledAttributes.hasValue(2)) {
                s1aVar.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, (int) s1aVar.e);
            }
            if (typedArrayObtainStyledAttributes.hasValue(4)) {
                s1aVar.g = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, (int) s1aVar.g);
            }
            if (typedArrayObtainStyledAttributes.hasValue(5)) {
                s1aVar.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, (int) s1aVar.f);
            }
            typedArrayObtainStyledAttributes.recycle();
            this.e = s1aVar;
        }
        c();
        s1a s1aVar2 = this.e;
        if (s1aVar2 != null) {
            return s1aVar2;
        }
        eg.m("Unable to create badge");
        return null;
    }

    public final void b() {
        if (this.e != null) {
            setClipChildren(true);
            setClipToPadding(true);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            View view = this.d;
            if (view != null) {
                s1a s1aVar = this.e;
                if (s1aVar != null) {
                    WeakReference weakReference = s1aVar.P0;
                    if ((weakReference != null ? (FrameLayout) weakReference.get() : null) != null) {
                        WeakReference weakReference2 = s1aVar.P0;
                        (weakReference2 != null ? (FrameLayout) weakReference2.get() : null).setForeground(null);
                    } else {
                        view.getOverlay().remove(s1aVar);
                    }
                }
                this.d = null;
            }
        }
    }

    public final void c() {
        if (this.e != null) {
            if (this.f != null) {
                b();
                return;
            }
            TextView textView = this.b;
            if (textView == null || this.a == null) {
                b();
                return;
            }
            if (this.d == textView) {
                d(textView);
                return;
            }
            b();
            TextView textView2 = this.b;
            if (this.e == null || textView2 == null) {
                return;
            }
            setClipChildren(false);
            setClipToPadding(false);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
            }
            s1a s1aVar = this.e;
            Rect rect = new Rect();
            textView2.getDrawingRect(rect);
            s1aVar.setBounds(rect);
            s1aVar.e(textView2, null);
            WeakReference weakReference = s1aVar.P0;
            if ((weakReference != null ? (FrameLayout) weakReference.get() : null) != null) {
                WeakReference weakReference2 = s1aVar.P0;
                (weakReference2 != null ? (FrameLayout) weakReference2.get() : null).setForeground(s1aVar);
            } else {
                textView2.getOverlay().add(s1aVar);
            }
            this.d = textView2;
        }
    }

    public final void d(View view) {
        s1a s1aVar = this.e;
        if (s1aVar == null || view != this.d) {
            return;
        }
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        s1aVar.setBounds(rect);
        s1aVar.e(view, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.i;
        if ((drawable == null || !drawable.isStateful()) ? false : this.i.setState(drawableState)) {
            invalidate();
            this.N0.invalidate();
        }
    }

    public final void e() {
        dhd1 dhd1Var = this.a;
        View view = dhd1Var != null ? dhd1Var.c : null;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent != this) {
                if (parent != null) {
                    ((ViewGroup) parent).removeView(view);
                }
                addView(view);
            }
            this.f = view;
            TextView textView = this.b;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.c;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.c.setImageDrawable(null);
            }
            TextView textView2 = (TextView) view.findViewById(R.id.text1);
            this.g = textView2;
            if (textView2 != null) {
                this.t = textView2.getMaxLines();
            }
            this.h = (ImageView) view.findViewById(R.id.icon);
        } else {
            View view2 = this.f;
            if (view2 != null) {
                removeView(view2);
                this.f = null;
            }
            this.g = null;
            this.h = null;
        }
        boolean z = false;
        if (this.f == null) {
            if (this.c == null) {
                ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(2131624532, (ViewGroup) this, false);
                this.c = imageView2;
                addView(imageView2, 0);
            }
            if (this.b == null) {
                TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(2131624533, (ViewGroup) this, false);
                this.b = textView3;
                addView(textView3);
                this.t = this.b.getMaxLines();
            }
            TextView textView4 = this.b;
            TabLayout tabLayout = this.N0;
            textView4.setTextAppearance(tabLayout.h);
            ColorStateList colorStateList = tabLayout.i;
            if (colorStateList != null) {
                this.b.setTextColor(colorStateList);
            }
            g(this.b, this.c);
            c();
            ImageView imageView3 = this.c;
            if (imageView3 != null) {
                imageView3.addOnLayoutChangeListener(new fhd1(this, imageView3));
            }
            TextView textView5 = this.b;
            if (textView5 != null) {
                textView5.addOnLayoutChangeListener(new fhd1(this, textView5));
            }
        } else {
            TextView textView6 = this.g;
            if (textView6 != null || this.h != null) {
                g(textView6, this.h);
            }
        }
        if (dhd1Var != null && !TextUtils.isEmpty(null)) {
            setContentDescription(null);
        }
        if (dhd1Var != null) {
            TabLayout tabLayout2 = dhd1Var.d;
            if (tabLayout2 == null) {
                hhg1.n("Tab not attached to a TabLayout");
                return;
            }
            int selectedTabPosition = tabLayout2.getSelectedTabPosition();
            if (selectedTabPosition != -1 && selectedTabPosition == dhd1Var.b) {
                z = true;
            }
        }
        setSelected(z);
    }

    public final void f(Context context) {
        int colorForState;
        TabLayout tabLayout = this.N0;
        int i = tabLayout.S0;
        if (i != 0) {
            Drawable drawableJ = f0o1.j(context, i);
            this.i = drawableJ;
            if (drawableJ != null && drawableJ.isStateful()) {
                this.i.setState(getDrawableState());
            }
        } else {
            this.i = null;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        int colorForState2 = 0;
        gradientDrawable.setColor(0);
        Drawable rippleDrawable = gradientDrawable;
        if (tabLayout.N0 != null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(1.0E-5f);
            gradientDrawable2.setColor(-1);
            ColorStateList colorStateList = tabLayout.N0;
            if (colorStateList != null) {
                colorForState = colorStateList.getColorForState(y4o1.b, colorStateList.getDefaultColor());
            } else {
                colorForState = 0;
            }
            int iL = uah.l(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
            int[][] iArr = {y4o1.c, StateSet.NOTHING};
            if (colorStateList != null) {
                colorForState2 = colorStateList.getColorForState(y4o1.a, colorStateList.getDefaultColor());
            }
            ColorStateList colorStateList2 = new ColorStateList(iArr, new int[]{iL, uah.l(colorForState2, Math.min(Color.alpha(colorForState2) * 2, 255))});
            boolean z = tabLayout.g1;
            GradientDrawable gradientDrawable3 = gradientDrawable;
            if (z) {
                gradientDrawable3 = null;
            }
            rippleDrawable = new RippleDrawable(colorStateList2, gradientDrawable3, z ? null : gradientDrawable2);
        }
        WeakHashMap weakHashMap = b8k1.a;
        setBackground(rippleDrawable);
        tabLayout.invalidate();
    }

    public final void g(TextView textView, ImageView imageView) {
        dhd1 dhd1Var = this.a;
        CharSequence charSequence = dhd1Var != null ? dhd1Var.a : null;
        if (imageView != null) {
            imageView.setVisibility(8);
            imageView.setImageDrawable(null);
        }
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        if (textView != null) {
            if (zIsEmpty) {
                textView.setVisibility(8);
                textView.setText((CharSequence) null);
            } else {
                textView.setText(charSequence);
                this.a.getClass();
                textView.setVisibility(0);
                setVisibility(0);
            }
        }
        if (imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            int iX = (zIsEmpty || imageView.getVisibility() != 0) ? 0 : (int) o0c.x(getContext(), 8);
            if (this.N0.c1) {
                if (iX != marginLayoutParams.getMarginEnd()) {
                    marginLayoutParams.setMarginEnd(iX);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (iX != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = iX;
                marginLayoutParams.setMarginEnd(0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        e9k.z(this, zIsEmpty ? null : charSequence);
    }

    public int getContentHeight() {
        View[] viewArr = {this.b, this.c, this.f};
        int iMax = 0;
        int iMin = 0;
        boolean z = false;
        for (int i = 0; i < 3; i++) {
            View view = viewArr[i];
            if (view != null && view.getVisibility() == 0) {
                iMin = z ? Math.min(iMin, view.getTop()) : view.getTop();
                iMax = z ? Math.max(iMax, view.getBottom()) : view.getBottom();
                z = true;
            }
        }
        return iMax - iMin;
    }

    public int getContentWidth() {
        View[] viewArr = {this.b, this.c, this.f};
        int iMax = 0;
        int iMin = 0;
        boolean z = false;
        for (int i = 0; i < 3; i++) {
            View view = viewArr[i];
            if (view != null && view.getVisibility() == 0) {
                iMin = z ? Math.min(iMin, view.getLeft()) : view.getLeft();
                iMax = z ? Math.max(iMax, view.getRight()) : view.getRight();
                z = true;
            }
        }
        return iMax - iMin;
    }

    public dhd1 getTab() {
        return this.a;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        Context context;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        s1a s1aVar = this.e;
        if (s1aVar != null && s1aVar.isVisible()) {
            CharSequence contentDescription = getContentDescription();
            StringBuilder sb = new StringBuilder();
            sb.append((Object) contentDescription);
            sb.append(", ");
            s1a s1aVar2 = this.e;
            r1a r1aVar = s1aVar2.h;
            String quantityString = null;
            if (s1aVar2.isVisible()) {
                if (!s1aVar2.d()) {
                    quantityString = r1aVar.f;
                } else if (r1aVar.g > 0 && (context = (Context) s1aVar2.a.get()) != null) {
                    int iC = s1aVar2.c();
                    int i = s1aVar2.X;
                    quantityString = iC <= i ? context.getResources().getQuantityString(r1aVar.g, s1aVar2.c(), Integer.valueOf(s1aVar2.c())) : context.getString(r1aVar.h, Integer.valueOf(i));
                }
            }
            sb.append((Object) quantityString);
            accessibilityNodeInfo.setContentDescription(sb.toString());
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) jg.b(isSelected(), 0, 1, this.a.b, 1).a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) fg.g.a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(2131956885));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        TabLayout tabLayout = this.N0;
        int tabMaxWidth = tabLayout.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i = View.MeasureSpec.makeMeasureSpec(tabLayout.T0, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.b != null) {
            float f = tabLayout.Q0;
            int i3 = this.t;
            ImageView imageView = this.c;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.b;
                if (textView != null && textView.getLineCount() > 1) {
                    f = tabLayout.R0;
                }
            } else {
                i3 = 1;
            }
            float textSize = this.b.getTextSize();
            int lineCount = this.b.getLineCount();
            int maxLines = this.b.getMaxLines();
            if (f != textSize || (maxLines >= 0 && i3 != maxLines)) {
                if (tabLayout.b1 == 1 && f > textSize && lineCount == 1) {
                    Layout layout = this.b.getLayout();
                    if (layout == null) {
                        return;
                    }
                    if ((f / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                        return;
                    }
                }
                this.b.setTextSize(0, f);
                this.b.setMaxLines(i3);
                super.onMeasure(i, i2);
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean zPerformClick = super.performClick();
        if (this.a == null) {
            return zPerformClick;
        }
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        dhd1 dhd1Var = this.a;
        TabLayout tabLayout = dhd1Var.d;
        if (tabLayout != null) {
            tabLayout.j(dhd1Var, true);
            return true;
        }
        hhg1.n("Tab not attached to a TabLayout");
        return false;
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        TextView textView = this.b;
        if (textView != null) {
            textView.setSelected(z);
        }
        ImageView imageView = this.c;
        if (imageView != null) {
            imageView.setSelected(z);
        }
        View view = this.f;
        if (view != null) {
            view.setSelected(z);
        }
    }

    public void setTab(dhd1 dhd1Var) {
        if (dhd1Var != this.a) {
            this.a = dhd1Var;
            e();
        }
    }
}
