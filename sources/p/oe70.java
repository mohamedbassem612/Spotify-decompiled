package p;

import android.app.Activity;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class oe70 extends w470 {
    public final v470 a;
    public final GridLayoutManager b;
    public final RecyclerView c;
    public final RecyclerView d;
    public final int e;

    public oe70(Activity activity, sd70 sd70Var) {
        GridLayoutManager gridLayoutManagerCreate = sd70Var.create();
        this.b = gridLayoutManagerCreate;
        this.e = gridLayoutManagerCreate.h1;
        v470 v470Var = new v470(activity, (AttributeSet) null, 0);
        v470Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        v470Var.setId(2131429190);
        this.a = v470Var;
        RecyclerView recyclerViewA = w470.a(activity, true);
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(2131165373);
        h3n h3nVar = new h3n(-1, -1);
        h3nVar.b(new AppBarLayout.ScrollingViewBehavior());
        recyclerViewA.setClipToPadding(false);
        recyclerViewA.setPadding(0, dimensionPixelSize, 0, 0);
        recyclerViewA.setId(2131429007);
        recyclerViewA.setLayoutManager(gridLayoutManagerCreate);
        recyclerViewA.setLayoutParams(h3nVar);
        this.c = recyclerViewA;
        RecyclerView recyclerViewB = w470.b(activity);
        recyclerViewB.setId(2131429191);
        this.d = recyclerViewB;
        v470Var.addView(recyclerViewA);
        v470Var.addView(recyclerViewB);
    }

    public final RecyclerView c() {
        return this.c;
    }

    public final RecyclerView d() {
        return this.d;
    }

    public final View e() {
        return this.a;
    }

    public final void f(re70 re70Var) {
        w470.k(this.d, !re70Var.j().isEmpty());
        this.b.J1(this.e);
    }

    public final void g(Parcelable parcelable) {
        if (parcelable instanceof ud70) {
            a layoutManager = this.c.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.w0(((ud70) parcelable).a);
            }
            a layoutManager2 = this.d.getLayoutManager();
            if (layoutManager2 != null) {
                layoutManager2.w0(((ud70) parcelable).b);
            }
            Parcelable parcelable2 = ((ud70) parcelable).c;
            if (parcelable2 != null) {
                this.a.onRestoreInstanceState(parcelable2);
            }
        }
    }

    public final Parcelable h() {
        RecyclerView recyclerView = this.c;
        a layoutManager = recyclerView.getLayoutManager();
        Parcelable parcelableX0 = layoutManager != null ? layoutManager.x0() : null;
        a layoutManager2 = this.d.getLayoutManager();
        Parcelable parcelableX1 = layoutManager2 != null ? layoutManager2.x0() : null;
        Parcelable parcelableOnSaveInstanceState = this.a.onSaveInstanceState();
        boolean z = false;
        View childAt = recyclerView.getChildAt(0);
        if (childAt != null && (RecyclerView.R(childAt) != 0 || (recyclerView.getLayoutManager() != null && (recyclerView.getLayoutManager() == null || a.Q(childAt) != 0)))) {
            z = true;
        }
        return new ud70(parcelableX0, parcelableX1, parcelableOnSaveInstanceState, z);
    }

    public final void i(kz50 kz50Var) {
        ((oc70) kz50Var.d).registerObserver(new ic70(this, kz50Var, (byte) 1));
    }

    public final void j(int... iArr) {
        AppBarLayout appBarLayoutFindViewById;
        if (iArr.length != 0 && (appBarLayoutFindViewById = this.a.findViewById(2131429006)) != null) {
            if (iArr[0] == 0) {
                appBarLayoutFindViewById.e(true, false, true);
            } else {
                appBarLayoutFindViewById.e(false, false, true);
            }
        }
        super.j(Arrays.copyOf(iArr, iArr.length));
    }
}
