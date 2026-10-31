package p;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import com.spotify.legacyglue.gluelib.patterns.header.GlueHeaderLayout;
import com.spotify.legacyglue.gluelib.patterns.header.behavior.GlueNoHeaderBehavior;
import com.spotify.legacyglue.gluelib.patterns.header.behavior.GlueScrollingViewBehavior;
import com.spotify.legacyglue.gluelib.patterns.header.behavior.HeaderBehavior;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jc70 extends w470 {
    public final Context a;
    public final FrameLayout b;
    public final GlueHeaderLayout c;
    public final GridLayoutManager d;
    public final o860 e;
    public final RecyclerView f;
    public final RecyclerView g;
    public final int h;
    public final zf30 i;
    public final boolean j;
    public final int k;
    public re70 l = rd70.c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View, android.view.ViewGroup, com.spotify.legacyglue.gluelib.patterns.header.GlueHeaderLayout] */
    public jc70(Context context, l670 l670Var, sd70 sd70Var, sw9 sw9Var) {
        context.getClass();
        this.a = context;
        int i = sw9Var.b;
        if (i == 0) {
            throw null;
        }
        this.h = i;
        this.i = (zf30) sw9Var.c;
        this.j = true;
        RecyclerView recyclerViewA = w470.a(context, true);
        this.f = recyclerViewA;
        recyclerViewA.setId(2131429007);
        GridLayoutManager gridLayoutManagerCreate = sd70Var.create();
        this.d = gridLayoutManagerCreate;
        this.k = gridLayoutManagerCreate.h1;
        recyclerViewA.setLayoutManager(gridLayoutManagerCreate);
        recyclerViewA.m(ycc1.d);
        RecyclerView recyclerViewB = w470.b(context);
        this.g = recyclerViewB;
        recyclerViewB.setId(2131429191);
        ?? glueHeaderLayout = new GlueHeaderLayout(context);
        this.c = glueHeaderLayout;
        glueHeaderLayout.setWillNotDraw(true);
        h3n h3nVar = new h3n(-1, -1);
        h3nVar.b(new GlueScrollingViewBehavior());
        glueHeaderLayout.addView(recyclerViewA, h3nVar);
        l();
        this.e = new o860(l670Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setId(2131429190);
        frameLayout.addView((View) glueHeaderLayout, -1, -1);
        frameLayout.addView((View) recyclerViewB, -1, -1);
    }

    @Override // p.w470
    public final RecyclerView c() {
        return this.f;
    }

    @Override // p.w470
    public final RecyclerView d() {
        return this.g;
    }

    @Override // p.w470
    public final View e() {
        return this.b;
    }

    @Override // p.w470
    public final void f(re70 re70Var) {
        re70Var.getClass();
        this.l = re70Var;
        w470.k(this.g, re70Var.j().size() > 0);
        this.d.J1(this.k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View, com.spotify.legacyglue.gluelib.patterns.header.GlueHeaderLayout] */
    @Override // p.w470
    public final void g(Parcelable parcelable) {
        if (parcelable instanceof ia70) {
            ia70 ia70Var = (ia70) parcelable;
            a layoutManager = this.f.getLayoutManager();
            layoutManager.getClass();
            layoutManager.w0(((ne70) ia70Var).a);
            a layoutManager2 = this.g.getLayoutManager();
            layoutManager2.getClass();
            layoutManager2.w0(((ne70) ia70Var).b);
            Parcelable parcelable2 = ia70Var.c;
            ?? r1 = this.c;
            if (parcelable2 != null) {
                r1.onRestoreInstanceState(parcelable2);
            }
            if (ia70Var.d) {
                r1.post(new gv40(this, (byte) 2));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x003c  */
    @Override // p.w470
    public final Parcelable h() {
        RecyclerView recyclerView = this.f;
        a layoutManager = recyclerView.getLayoutManager();
        layoutManager.getClass();
        Parcelable parcelableX0 = layoutManager.x0();
        a layoutManager2 = this.g.getLayoutManager();
        layoutManager2.getClass();
        Parcelable parcelableX1 = layoutManager2.x0();
        Parcelable parcelableOnSaveInstanceState = this.c.onSaveInstanceState();
        boolean z = false;
        View childAt = recyclerView.getChildAt(0);
        if (childAt != null) {
            if (RecyclerView.R(childAt) == 0) {
                recyclerView.getLayoutManager().getClass();
                if (a.Q(childAt) != 0) {
                    z = true;
                }
            } else {
                z = true;
            }
        }
        return new ia70(parcelableX0, parcelableX1, parcelableOnSaveInstanceState, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // p.w470
    public final void j(int... iArr) {
        if (iArr.length > 0) {
            int i = iArr[0];
            CoordinatorLayout coordinatorLayout = this.c;
            if (i == 0) {
                KeyEvent.Callback callbackB = coordinatorLayout.B(false);
                callbackB.getClass();
                jw40 jw40Var = (jw40) callbackB;
                HeaderBehavior headerBehavior = jw40Var.getView().getLayoutParams().a;
                RecyclerView recyclerView = null;
                if (headerBehavior != null && headerBehavior.u() < 0) {
                    ValueAnimator valueAnimator = headerBehavior.j;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        headerBehavior.j = null;
                    }
                    View view = (View) jw40Var;
                    int iMax = Math.max(Integer.MIN_VALUE, Math.min(0, Integer.MAX_VALUE));
                    jw40 jw40Var2 = (jw40) view;
                    int i2 = (-jw40Var2.getTotalScrollRange()) - headerBehavior.k;
                    headerBehavior.x(view);
                    int iU = headerBehavior.u();
                    int iMax2 = Math.max(i2, Math.min(0, 0));
                    if (iU >= i2 && iU <= 0 && iU != iMax2) {
                        headerBehavior.u();
                        headerBehavior.v(iMax);
                        view.setAlpha(1.0f);
                        int iMin = Math.min(-iMax, jw40Var2.getTotalScrollRange());
                        ((xt41) view).a(iMin / jw40Var2.getTotalScrollRange(), iMin);
                        coordinatorLayout.f(view);
                    }
                }
                int childCount = coordinatorLayout.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = coordinatorLayout.getChildAt(i3);
                    if (childAt instanceof RecyclerView) {
                        recyclerView = (RecyclerView) childAt;
                        break;
                    }
                }
                if (recyclerView != null) {
                    LinearLayoutManager layoutManager = recyclerView.getLayoutManager();
                    if (layoutManager instanceof LinearLayoutManager) {
                        layoutManager.w1(0, 0);
                    } else {
                        recyclerView.u0(0);
                    }
                }
            } else {
                coordinatorLayout.A();
            }
        }
        super.j(iArr);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, com.spotify.legacyglue.gluelib.patterns.header.GlueHeaderLayout] */
    public final void l() {
        jx40 jx40Var = new jx40(this.a);
        GlueNoHeaderBehavior glueNoHeaderBehavior = new GlueNoHeaderBehavior();
        ?? r3 = this.c;
        r3.D(jx40Var, glueNoHeaderBehavior, true);
        r3.setWillNotDraw(true);
    }
}
