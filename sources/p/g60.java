package p;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class g60 implements pti0 {
    public int N0;
    public boolean O0;
    public d60 Q0;
    public d60 R0;
    public nx30 S0;
    public e60 T0;
    public boolean X;
    public int Y;
    public int Z;
    public final Context a;
    public Context b;
    public msi0 c;
    public final LayoutInflater d;
    public oti0 e;
    public sti0 f;
    public f60 g;
    public Drawable h;
    public boolean i;
    public boolean t;
    public final SparseBooleanArray P0 = new SparseBooleanArray();
    public final bv40 U0 = new bv40(this, 3);

    public g60(Context context) {
        this.a = context;
        this.d = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View a(ysi0 ysi0Var, View view, ViewGroup viewGroup) {
        View actionView = ysi0Var.getActionView();
        if (actionView == null || ysi0Var.e()) {
            rti0 rti0Var = view instanceof rti0 ? (rti0) view : (rti0) this.d.inflate(2131623938, viewGroup, false);
            rti0Var.d(ysi0Var);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) rti0Var;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f);
            e60 e60Var = this.T0;
            if (e60Var == null) {
                e60Var = new e60(this);
                this.T0 = e60Var;
            }
            actionMenuItemView.setPopupCallback(e60Var);
            actionView = (View) rti0Var;
        }
        actionView.setVisibility(ysi0Var.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof i60)) {
            actionView.setLayoutParams(ActionMenuView.l(layoutParams));
        }
        return actionView;
    }

    @Override // p.pti0
    public final void b(msi0 msi0Var, boolean z) {
        j();
        d60 d60Var = this.R0;
        if (d60Var != null && d60Var.b()) {
            ((iti0) d60Var.i).dismiss();
        }
        oti0 oti0Var = this.e;
        if (oti0Var != null) {
            oti0Var.b(msi0Var, z);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p.pti0
    public final void c(Context context, msi0 msi0Var) {
        this.b = context;
        LayoutInflater.from(context);
        this.c = msi0Var;
        Resources resources = context.getResources();
        if (!this.X) {
            this.t = true;
        }
        int i = 2;
        this.Y = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.N0 = i;
        int measuredWidth = this.Y;
        if (this.t) {
            if (this.g == null) {
                f60 f60Var = new f60(this, this.a);
                this.g = f60Var;
                if (this.i) {
                    f60Var.setImageDrawable(this.h);
                    this.h = null;
                    this.i = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.g.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.g.getMeasuredWidth();
        } else {
            this.g = null;
        }
        this.Z = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // p.pti0
    public final void d(oti0 oti0Var) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.pti0
    public final void e() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.f;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            msi0 msi0Var = this.c;
            if (msi0Var != null) {
                msi0Var.j();
                ArrayList arrayListM = this.c.m();
                int size = arrayListM.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    ysi0 ysi0Var = (ysi0) arrayListM.get(i2);
                    if ((ysi0Var.x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        ysi0 itemData = childAt instanceof rti0 ? ((rti0) childAt).getItemData() : null;
                        View viewA = a(ysi0Var, childAt, viewGroup);
                        if (ysi0Var != itemData) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewA.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewA);
                            }
                            ((ViewGroup) this.f).addView(viewA, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.g) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.f).requestLayout();
        msi0 msi0Var2 = this.c;
        if (msi0Var2 != null) {
            msi0Var2.j();
            ArrayList arrayList2 = msi0Var2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                z60 z60Var = ((ysi0) arrayList2.get(i3)).A;
            }
        }
        msi0 msi0Var3 = this.c;
        if (msi0Var3 != null) {
            msi0Var3.j();
            arrayList = msi0Var3.j;
        }
        if (this.t && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((ysi0) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z = true;
            }
        }
        AppCompatImageView appCompatImageView = this.g;
        AppCompatImageView appCompatImageView2 = appCompatImageView;
        if (z) {
            if (appCompatImageView == null) {
                f60 f60Var = new f60(this, this.a);
                this.g = f60Var;
                appCompatImageView2 = f60Var;
            }
            ViewGroup viewGroup3 = (ViewGroup) appCompatImageView2.getParent();
            if (viewGroup3 != this.f) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.g);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f;
                AppCompatImageView appCompatImageView3 = this.g;
                actionMenuView.getClass();
                i60 i60VarK = ActionMenuView.k();
                i60VarK.a = true;
                actionMenuView.addView((View) appCompatImageView3, (ViewGroup.LayoutParams) i60VarK);
            }
        } else if (appCompatImageView != null) {
            Object parent = appCompatImageView.getParent();
            Object obj = this.f;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.g);
            }
        }
        ((ActionMenuView) this.f).setOverflowReserved(this.t);
    }

    @Override // p.pti0
    public final boolean f(ysi0 ysi0Var) {
        return false;
    }

    @Override // p.pti0
    public final boolean g(ysi0 ysi0Var) {
        return false;
    }

    @Override // p.pti0
    public final boolean h() {
        int size;
        ArrayList arrayListM;
        int i;
        boolean z;
        g60 g60Var = this;
        msi0 msi0Var = g60Var.c;
        if (msi0Var != null) {
            arrayListM = msi0Var.m();
            size = arrayListM.size();
        } else {
            size = 0;
            arrayListM = null;
        }
        int i2 = g60Var.N0;
        int i3 = g60Var.Z;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) g60Var.f;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            ysi0 ysi0Var = (ysi0) arrayListM.get(i4);
            int i7 = ysi0Var.y;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (g60Var.O0 && ysi0Var.C) {
                i2 = 0;
            }
            i4++;
        }
        if (g60Var.t && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = g60Var.P0;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            ysi0 ysi0Var2 = (ysi0) arrayListM.get(i9);
            int i11 = ysi0Var2.y;
            boolean z3 = (i11 & 2) == i ? z : false;
            int i12 = ysi0Var2.b;
            if (z3) {
                View viewA = g60Var.a(ysi0Var2, null, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                ysi0Var2.g(z);
            } else {
                if ((i11 & 1) == z) {
                    boolean z4 = sparseBooleanArray.get(i12);
                    boolean z5 = ((i8 > 0 || z4) && i3 > 0) ? z : false;
                    if (z5) {
                        View viewA2 = g60Var.a(ysi0Var2, null, viewGroup);
                        viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewA2.getMeasuredWidth();
                        i3 -= measuredWidth2;
                        if (i10 == 0) {
                            i10 = measuredWidth2;
                        }
                        z5 &= i3 + i10 > 0;
                    }
                    if (z5 && i12 != 0) {
                        sparseBooleanArray.put(i12, true);
                    } else if (z4) {
                        sparseBooleanArray.put(i12, false);
                        for (int i13 = 0; i13 < i9; i13++) {
                            ysi0 ysi0Var3 = (ysi0) arrayListM.get(i13);
                            if (ysi0Var3.b == i12) {
                                if ((ysi0Var3.x & 32) == 32) {
                                    i8++;
                                }
                                ysi0Var3.g(false);
                            }
                        }
                    }
                    if (z5) {
                        i8--;
                    }
                    ysi0Var2.g(z5);
                } else {
                    ysi0Var2.g(false);
                }
                i9++;
                i = 2;
                g60Var = this;
                z = true;
            }
            i9++;
            i = 2;
            g60Var = this;
            z = true;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.pti0
    public final boolean i(alc1 alc1Var) {
        boolean z;
        if (alc1Var.hasVisibleItems()) {
            alc1 alc1Var2 = alc1Var;
            while (true) {
                msi0 msi0Var = alc1Var2.z;
                if (msi0Var == this.c) {
                    break;
                }
                alc1Var2 = (alc1) msi0Var;
            }
            ysi0 ysi0Var = alc1Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.f;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof rti0) && ((rti0) childAt).getItemData() == ysi0Var) {
                        view = childAt;
                        break;
                    }
                }
            }
            if (view != null) {
                int size = alc1Var.f.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = alc1Var.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                d60 d60Var = new d60(this, this.b, alc1Var, view);
                this.R0 = d60Var;
                d60Var.b = z;
                iti0 iti0Var = (iti0) d60Var.i;
                if (iti0Var != null) {
                    iti0Var.o(z);
                }
                d60 d60Var2 = this.R0;
                if (!d60Var2.b()) {
                    if (((View) d60Var2.g) == null) {
                        eg.m("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                    d60Var2.g(0, 0, false, false);
                }
                oti0 oti0Var = this.e;
                if (oti0Var != null) {
                    oti0Var.g(alc1Var);
                }
                return true;
            }
        }
        return false;
    }

    public final boolean j() {
        Object obj;
        nx30 nx30Var = this.S0;
        if (nx30Var != null && (obj = this.f) != null) {
            ((View) obj).removeCallbacks(nx30Var);
            this.S0 = null;
            return true;
        }
        d60 d60Var = this.Q0;
        if (d60Var == null) {
            return false;
        }
        if (d60Var.b()) {
            ((iti0) d60Var.i).dismiss();
        }
        return true;
    }

    public final boolean k() {
        d60 d60Var = this.Q0;
        return d60Var != null && d60Var.b();
    }

    public final boolean l() {
        msi0 msi0Var;
        boolean z = false;
        if (this.t && !k() && (msi0Var = this.c) != null && this.f != null && this.S0 == null) {
            msi0Var.j();
            if (!msi0Var.j.isEmpty()) {
                nx30 nx30Var = new nx30(this, new d60(this, this.b, this.c, (View) this.g), z, (byte) 1);
                this.S0 = nx30Var;
                ((View) this.f).post(nx30Var);
                return true;
            }
        }
        return false;
    }
}
