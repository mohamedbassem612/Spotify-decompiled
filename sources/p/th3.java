package p;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class th3 {
    public final int A;
    public final int B;
    public final int C;
    public final boolean D;
    public final rh3 E;
    public final Context a;
    public final vh3 b;
    public final Window c;
    public CharSequence d;
    public CharSequence e;
    public AlertController$RecycleListView f;
    public View g;
    public Button i;
    public CharSequence j;
    public Message k;
    public Button l;
    public CharSequence m;
    public Message n;
    public Button o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f139p;
    public Message q;
    public NestedScrollView r;
    public Drawable s;
    public ImageView t;
    public TextView u;
    public TextView v;
    public View w;
    public ListAdapter x;
    public final int z;
    public boolean h = false;
    public int y = -1;
    public final c20 F = new c20(this, 3);

    public th3(Context context, vh3 vh3Var, Window window) {
        this.a = context;
        this.b = vh3Var;
        this.c = window;
        rh3 rh3Var = new rh3();
        rh3Var.b = new WeakReference(vh3Var);
        this.E = rh3Var;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, moz0.e, 2130968623, 0);
        this.z = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.A = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.B = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.C = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.D = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        vh3Var.d().g(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static ViewGroup e(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void b() {
        int i;
        ListAdapter listAdapter;
        View viewFindViewById;
        this.b.setContentView(this.z);
        Window window = this.c;
        View viewFindViewById2 = window.findViewById(2131430284);
        View viewFindViewById3 = viewFindViewById2.findViewById(2131431418);
        View viewFindViewById4 = viewFindViewById2.findViewById(2131428204);
        View viewFindViewById5 = viewFindViewById2.findViewById(2131427843);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(2131428349);
        View view = this.g;
        if (view == null) {
            view = null;
        }
        boolean z = view != null;
        if (!z || !a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(2131428347);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.h) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (this.f != null) {
                ((LinearLayout.LayoutParams) ((ric0) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(2131431418);
        View viewFindViewById7 = viewGroup.findViewById(2131428204);
        View viewFindViewById8 = viewGroup.findViewById(2131427843);
        ViewGroup viewGroupE = e(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupE2 = e(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupE3 = e(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollViewFindViewById = window.findViewById(2131430776);
        this.r = nestedScrollViewFindViewById;
        nestedScrollViewFindViewById.setFocusable(false);
        this.r.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupE2.findViewById(R.id.message);
        this.v = textView;
        if (textView != null) {
            CharSequence charSequence = this.e;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                this.r.removeView(this.v);
                if (this.f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) this.r.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(this.r);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(this.f, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupE2.setVisibility(8);
                }
            }
        }
        Button button = (Button) viewGroupE3.findViewById(R.id.button1);
        this.i = button;
        c20 c20Var = this.F;
        button.setOnClickListener(c20Var);
        boolean zIsEmpty = TextUtils.isEmpty(this.j);
        Button button2 = this.i;
        if (zIsEmpty) {
            button2.setVisibility(8);
            i = 0;
        } else {
            button2.setText(this.j);
            this.i.setVisibility(0);
            i = 1;
        }
        Button button3 = (Button) viewGroupE3.findViewById(R.id.button2);
        this.l = button3;
        button3.setOnClickListener(c20Var);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.m);
        Button button4 = this.l;
        if (zIsEmpty2) {
            button4.setVisibility(8);
        } else {
            button4.setText(this.m);
            this.l.setVisibility(0);
            i |= 2;
        }
        Button button5 = (Button) viewGroupE3.findViewById(R.id.button3);
        this.o = button5;
        button5.setOnClickListener(c20Var);
        boolean zIsEmpty3 = TextUtils.isEmpty(this.f139p);
        Button button6 = this.o;
        if (zIsEmpty3) {
            button6.setVisibility(8);
        } else {
            button6.setText(this.f139p);
            this.o.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        this.a.getTheme().resolveAttribute(2130968622, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button7 = this.i;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button7.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button7.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button8 = this.l;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button8.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button8.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button9 = this.o;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button9.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button9.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupE3.setVisibility(8);
        }
        if (this.w != null) {
            viewGroupE.addView(this.w, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(2131431384).setVisibility(8);
        } else {
            this.t = (ImageView) window.findViewById(R.id.icon);
            if (TextUtils.isEmpty(this.d) || !this.D) {
                window.findViewById(2131431384).setVisibility(8);
                this.t.setVisibility(8);
                viewGroupE.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(2131427557);
                this.u = textView2;
                textView2.setText(this.d);
                Drawable drawable = this.s;
                if (drawable != null) {
                    this.t.setImageDrawable(drawable);
                } else {
                    this.u.setPadding(this.t.getPaddingLeft(), this.t.getPaddingTop(), this.t.getPaddingRight(), this.t.getPaddingBottom());
                    this.t.setVisibility(8);
                }
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i2 = (viewGroupE == null || viewGroupE.getVisibility() == 8) ? 0 : 1;
        boolean z3 = viewGroupE3.getVisibility() != 8;
        if (!z3 && (viewFindViewById = viewGroupE2.findViewById(2131431262)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView = this.r;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View viewFindViewById9 = (this.e == null && this.f == null) ? null : viewGroupE.findViewById(2131431359);
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupE2.findViewById(2131431263);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = this.f;
        if (alertController$RecycleListView != null && (!z3 || i2 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.a, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.b);
        }
        if (!z2) {
            NestedScrollView nestedScrollView2 = this.f;
            if (nestedScrollView2 == null) {
                nestedScrollView2 = this.r;
            }
            if (nestedScrollView2 != null) {
                int i3 = i2 | (z3 ? 2 : 0);
                View viewFindViewById11 = window.findViewById(2131430774);
                View viewFindViewById12 = window.findViewById(2131430773);
                WeakHashMap weakHashMap = b8k1.a;
                nestedScrollView2.setScrollIndicators(i3, 3);
                if (viewFindViewById11 != null) {
                    viewGroupE2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupE2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = this.f;
        if (alertController$RecycleListView2 == null || (listAdapter = this.x) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i4 = this.y;
        if (i4 > -1) {
            alertController$RecycleListView2.setItemChecked(i4, true);
            alertController$RecycleListView2.setSelection(i4);
        }
    }

    public final boolean c(KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.r;
        return nestedScrollView != null && nestedScrollView.q(keyEvent);
    }

    public final boolean d(KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.r;
        return nestedScrollView != null && nestedScrollView.q(keyEvent);
    }

    public final void f(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message messageObtainMessage = onClickListener != null ? this.E.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.f139p = charSequence;
            this.q = messageObtainMessage;
        } else if (i == -2) {
            this.m = charSequence;
            this.n = messageObtainMessage;
        } else if (i != -1) {
            hhg1.n("Button does not exist");
        } else {
            this.j = charSequence;
            this.k = messageObtainMessage;
        }
    }

    public final void g(CharSequence charSequence) {
        this.d = charSequence;
        TextView textView = this.u;
        if (textView != null) {
            textView.setText(charSequence);
        }
        this.c.setTitle(charSequence);
    }
}
