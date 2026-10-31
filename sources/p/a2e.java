package p;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class a2e extends iti0 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public View N0;
    public View O0;
    public int P0;
    public boolean Q0;
    public boolean R0;
    public int S0;
    public int T0;
    public boolean V0;
    public oti0 W0;
    public ViewTreeObserver X0;
    public PopupWindow.OnDismissListener Y0;
    public boolean Z0;
    public final Context b;
    public final int c;
    public final int d;
    public final boolean e;
    public final Handler f;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final x22 i = new x22(this, (byte) 3);
    public final y22 t = new y22(this, (byte) 2);
    public final fp8 X = new fp8(this, (byte) 15);
    public int Y = 0;
    public int Z = 0;
    public boolean U0 = false;

    public a2e(Context context, View view, int i, boolean z) {
        this.b = context;
        this.N0 = view;
        this.d = i;
        this.e = z;
        this.P0 = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.f = new Handler();
    }

    @Override // p.gc81
    public final boolean a() {
        ArrayList arrayList = this.h;
        return arrayList.size() > 0 && ((z1e) arrayList.get(0)).a.Y0.isShowing();
    }

    @Override // p.pti0
    public final void b(msi0 msi0Var, boolean z) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (msi0Var == ((z1e) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((z1e) arrayList.get(i2)).b.d(false);
        }
        z1e z1eVar = (z1e) arrayList.remove(i);
        msi0 msi0Var2 = z1eVar.b;
        lti0 lti0Var = z1eVar.a;
        ik5 ik5Var = lti0Var.Y0;
        msi0Var2.t(this);
        if (this.Z0) {
            ik5Var.setExitTransition(null);
            ik5Var.setAnimationStyle(0);
        }
        lti0Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.P0 = ((z1e) arrayList.get(size2 - 1)).c;
        } else {
            this.P0 = this.N0.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((z1e) arrayList.get(0)).b.d(false);
                return;
            }
            return;
        }
        dismiss();
        oti0 oti0Var = this.W0;
        if (oti0Var != null) {
            oti0Var.b(msi0Var, true);
        }
        ViewTreeObserver viewTreeObserver = this.X0;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.X0.removeGlobalOnLayoutListener(this.i);
            }
            this.X0 = null;
        }
        this.O0.removeOnAttachStateChangeListener(this.t);
        this.Y0.onDismiss();
    }

    @Override // p.pti0
    public final void d(oti0 oti0Var) {
        this.W0 = oti0Var;
    }

    @Override // p.gc81
    public final void dismiss() {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        if (size > 0) {
            z1e[] z1eVarArr = (z1e[]) arrayList.toArray(new z1e[size]);
            for (int i = size - 1; i >= 0; i--) {
                z1e z1eVar = z1eVarArr[i];
                if (z1eVar.a.Y0.isShowing()) {
                    z1eVar.a.dismiss();
                }
            }
        }
    }

    @Override // p.pti0
    public final void e() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((z1e) it.next()).a.c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((jsi0) adapter).notifyDataSetChanged();
        }
    }

    @Override // p.pti0
    public final boolean h() {
        return false;
    }

    @Override // p.pti0
    public final boolean i(alc1 alc1Var) {
        for (z1e z1eVar : this.h) {
            if (alc1Var == z1eVar.b) {
                z1eVar.a.c.requestFocus();
                return true;
            }
        }
        if (!alc1Var.hasVisibleItems()) {
            return false;
        }
        j(alc1Var);
        oti0 oti0Var = this.W0;
        if (oti0Var != null) {
            oti0Var.g(alc1Var);
        }
        return true;
    }

    @Override // p.iti0
    public final void j(msi0 msi0Var) {
        msi0Var.c(this, this.b);
        if (a()) {
            u(msi0Var);
        } else {
            this.g.add(msi0Var);
        }
    }

    @Override // p.iti0
    public final void l(View view) {
        if (this.N0 != view) {
            this.N0 = view;
            this.Z = Gravity.getAbsoluteGravity(this.Y, view.getLayoutDirection());
        }
    }

    @Override // p.gc81
    public final void m() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            u((msi0) it.next());
        }
        arrayList.clear();
        View view = this.N0;
        this.O0 = view;
        if (view != null) {
            boolean z = this.X0 == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.X0 = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.i);
            }
            this.O0.addOnAttachStateChangeListener(this.t);
        }
    }

    @Override // p.gc81
    public final m9v n() {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((z1e) l1d.i(1, arrayList)).a.c;
    }

    @Override // p.iti0
    public final void o(boolean z) {
        this.U0 = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        z1e z1eVar;
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z1eVar = null;
                break;
            }
            z1eVar = (z1e) arrayList.get(i);
            if (!z1eVar.a.Y0.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (z1eVar != null) {
            z1eVar.b.d(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p.iti0
    public final void p(int i) {
        if (this.Y != i) {
            this.Y = i;
            this.Z = Gravity.getAbsoluteGravity(i, this.N0.getLayoutDirection());
        }
    }

    @Override // p.iti0
    public final void q(int i) {
        this.Q0 = true;
        this.S0 = i;
    }

    @Override // p.iti0
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.Y0 = onDismissListener;
    }

    @Override // p.iti0
    public final void s(boolean z) {
        this.V0 = z;
    }

    @Override // p.iti0
    public final void t(int i) {
        this.R0 = true;
        this.T0 = i;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0158  */
    /* JADX WARN: Code duplicated, block: B:69:0x015c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void u(msi0 msi0Var) {
        boolean z;
        int i;
        View childAt;
        z1e z1eVar;
        int i2;
        int i3;
        int i4;
        int width;
        MenuItem item;
        jsi0 jsi0Var;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.b;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        jsi0 jsi0Var2 = new jsi0(msi0Var, layoutInflaterFrom, this.e, 2131623947);
        int i5 = 0;
        if (!a() && this.U0) {
            jsi0Var2.c = true;
        } else if (a()) {
            int size = msi0Var.f.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    z = false;
                    break;
                }
                MenuItem item2 = msi0Var.getItem(i6);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z = true;
                    break;
                }
                i6++;
            }
            jsi0Var2.c = z;
        }
        int iK = iti0.k(jsi0Var2, context, this.c);
        lti0 lti0Var = new lti0(context, null, this.d, 0);
        lti0Var.b1 = this.X;
        lti0Var.P0 = this;
        ik5 ik5Var = lti0Var.Y0;
        ik5Var.setOnDismissListener(this);
        lti0Var.O0 = this.N0;
        lti0Var.Y = this.Z;
        lti0Var.X0 = true;
        ik5Var.setFocusable(true);
        ik5Var.setInputMethodMode(2);
        lti0Var.k(jsi0Var2);
        lti0Var.r(iK);
        lti0Var.Y = this.Z;
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            z1eVar = (z1e) l1d.i(1, arrayList);
            msi0 msi0Var2 = z1eVar.b;
            int size2 = msi0Var2.f.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size2) {
                    i = i5;
                    item = null;
                    break;
                }
                item = msi0Var2.getItem(i7);
                if (item.hasSubMenu()) {
                    i = i5;
                    if (msi0Var == item.getSubMenu()) {
                        break;
                    }
                } else {
                    i = i5;
                }
                i7++;
                i5 = i;
            }
            if (item == null) {
                childAt = null;
            } else {
                m9v m9vVar = z1eVar.a.c;
                ListAdapter adapter = m9vVar.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    jsi0Var = (jsi0) headerViewListAdapter.getWrappedAdapter();
                } else {
                    jsi0Var = (jsi0) adapter;
                    headersCount = i;
                }
                int count = jsi0Var.getCount();
                int i8 = i;
                while (true) {
                    if (i8 >= count) {
                        i8 = -1;
                        break;
                    } else if (item == jsi0Var.getItem(i8)) {
                        break;
                    } else {
                        i8++;
                    }
                }
                childAt = (i8 != -1 && (firstVisiblePosition = (i8 + headersCount) - m9vVar.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < m9vVar.getChildCount()) ? m9vVar.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            i = 0;
            childAt = null;
            z1eVar = null;
        }
        if (childAt != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = lti0.c1;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[1];
                        objArr[i] = Boolean.FALSE;
                        method.invoke(ik5Var, objArr);
                    } catch (Exception unused) {
                    }
                }
            } else {
                x74.q0(ik5Var);
            }
            ik5Var.setEnterTransition(null);
            m9v m9vVar2 = ((z1e) arrayList.get(arrayList.size() - 1)).a.c;
            int[] iArr = new int[2];
            m9vVar2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.O0.getWindowVisibleDisplayFrame(rect);
            if (this.P0 == 1) {
                if (m9vVar2.getWidth() + iArr[i] + iK > rect.right) {
                    i2 = i;
                } else {
                    i2 = 1;
                }
            } else if (iArr[i] - iK < 0) {
                i2 = 1;
            } else {
                i2 = i;
            }
            int i9 = i2 == 1 ? 1 : i;
            this.P0 = i2;
            if (Build.VERSION.SDK_INT >= 26) {
                lti0Var.O0 = childAt;
                i4 = i;
                i3 = i4;
            } else {
                int[] iArr2 = new int[2];
                this.N0.getLocationOnScreen(iArr2);
                int[] iArr3 = new int[2];
                childAt.getLocationOnScreen(iArr3);
                if ((this.Z & 7) == 5) {
                    iArr2[i] = this.N0.getWidth() + iArr2[i];
                    iArr3[i] = childAt.getWidth() + iArr3[i];
                }
                i3 = iArr3[i] - iArr2[i];
                i4 = iArr3[1] - iArr2[1];
            }
            if ((this.Z & 5) == 5) {
                width = i9 != 0 ? i3 + iK : i3 - childAt.getWidth();
            } else {
                width = i9 != 0 ? i3 + childAt.getWidth() : i3 - iK;
            }
            lti0Var.f = width;
            lti0Var.X = true;
            lti0Var.t = true;
            lti0Var.g(i4);
        } else {
            if (this.Q0) {
                lti0Var.f = this.S0;
            }
            if (this.R0) {
                lti0Var.g(this.T0);
            }
            Rect rect2 = this.a;
            lti0Var.W0 = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new z1e(lti0Var, msi0Var, this.P0));
        lti0Var.m();
        m9v m9vVar3 = lti0Var.c;
        m9vVar3.setOnKeyListener(this);
        if (z1eVar == null && this.V0 && msi0Var.m != null) {
            boolean z2 = i;
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(2131623954, m9vVar3, z2);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(z2);
            textView.setText(msi0Var.m);
            m9vVar3.addHeaderView(frameLayout, null, z2);
            lti0Var.m();
        }
    }
}
