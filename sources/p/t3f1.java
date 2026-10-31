package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class t3f1 implements jar {
    public final Toolbar a;
    public int b;
    public final View c;
    public Drawable d;
    public Drawable e;
    public Drawable f;
    public final boolean g;
    public CharSequence h;
    public final CharSequence i;
    public final CharSequence j;
    public Window.Callback k;
    public boolean l;
    public g60 m;
    public final int n;
    public final Drawable o;

    public t3f1(Toolbar toolbar, boolean z) {
        Drawable drawable;
        this.n = 0;
        this.a = toolbar;
        this.h = toolbar.getTitle();
        this.i = toolbar.getSubtitle();
        this.g = this.h != null;
        this.f = toolbar.getNavigationIcon();
        lvc1 lvc1VarE = lvc1.E(toolbar.getContext(), null, moz0.a, 2130968584);
        TypedArray typedArray = (TypedArray) lvc1VarE.c;
        int i = 15;
        this.o = lvc1VarE.k(15);
        if (z) {
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                this.g = true;
                this.h = text;
                if ((this.b & 8) != 0) {
                    toolbar.setTitle(text);
                    if (this.g) {
                        b8k1.r(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                this.i = text2;
                if ((this.b & 8) != 0) {
                    toolbar.setSubtitle(text2);
                }
            }
            Drawable drawableK = lvc1VarE.k(20);
            if (drawableK != null) {
                this.e = drawableK;
                c();
            }
            Drawable drawableK2 = lvc1VarE.k(17);
            if (drawableK2 != null) {
                this.d = drawableK2;
                c();
            }
            if (this.f == null && (drawable = this.o) != null) {
                this.f = drawable;
                if ((this.b & 4) != 0) {
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                View view = this.c;
                if (view != null && (this.b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.c = viewInflate;
                if (viewInflate != null && (this.b & 16) != 0) {
                    toolbar.addView(viewInflate);
                }
                a(this.b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                py31 py31Var = toolbar.W0;
                if (py31Var == null) {
                    py31Var = new py31();
                    toolbar.W0 = py31Var;
                }
                py31Var.g(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = toolbar.getContext();
                toolbar.O0 = resourceId2;
                AppCompatTextView appCompatTextView = toolbar.b;
                if (appCompatTextView != null) {
                    appCompatTextView.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.P0 = resourceId3;
                AppCompatTextView appCompatTextView2 = toolbar.c;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.o = toolbar.getNavigationIcon();
            } else {
                i = 11;
            }
            this.b = i;
        }
        lvc1VarE.I();
        if (2131951625 != this.n) {
            this.n = 2131951625;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i2 = this.n;
                this.j = i2 != 0 ? toolbar.getContext().getString(i2) : null;
                b();
            }
        }
        this.j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new wa21(this));
    }

    public final void a(int i) {
        View view;
        int i2 = this.b ^ i;
        this.b = i;
        if (i2 != 0) {
            int i3 = i2 & 4;
            Toolbar toolbar = this.a;
            if (i3 != 0) {
                if ((i & 4) != 0) {
                    b();
                }
                if ((this.b & 4) != 0) {
                    Drawable drawable = this.f;
                    if (drawable == null) {
                        drawable = this.o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                c();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    toolbar.setTitle(this.h);
                    toolbar.setSubtitle(this.i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.c) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    public final void b() {
        if ((this.b & 4) != 0) {
            CharSequence charSequence = this.j;
            boolean zIsEmpty = TextUtils.isEmpty(charSequence);
            Toolbar toolbar = this.a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.n);
            } else {
                toolbar.setNavigationContentDescription(charSequence);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i = this.b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.e) == null) {
            drawable = this.d;
        }
        this.a.setLogo(drawable);
    }
}
