package p;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.c;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zbh0<S> extends zvs0 {
    public int G1;
    public vwc H1;
    public tjm0 I1;
    public int J1;
    public cab K1;
    public RecyclerView L1;
    public RecyclerView M1;
    public View N1;
    public View O1;

    public final void F0(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.G1);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.H1);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.I1);
    }

    public final void Z0(tjm0 tjm0Var) {
        c cVar = (c) this.M1.getAdapter();
        int iK = cVar.e.a.k(tjm0Var);
        int iK2 = iK - cVar.e.a.k(this.I1);
        boolean z = Math.abs(iK2) > 3;
        boolean z2 = iK2 > 0;
        this.I1 = tjm0Var;
        if (z && z2) {
            this.M1.u0(iK - 3);
            this.M1.post(new ukd(this, iK, (byte) 3));
            return;
        }
        RecyclerView recyclerView = this.M1;
        if (!z) {
            recyclerView.post(new ukd(this, iK, (byte) 3));
        } else {
            recyclerView.u0(iK + 3);
            this.M1.post(new ukd(this, iK, (byte) 3));
        }
    }

    public final void a1(int i) {
        this.J1 = i;
        if (i == 2) {
            this.L1.getLayoutManager().H0(this.I1.c - ((cnm1) this.L1.getAdapter()).d.H1.a.c);
            this.N1.setVisibility(0);
            this.O1.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.N1.setVisibility(8);
            this.O1.setVisibility(0);
            Z0(this.I1);
        }
    }

    public final void w0(Bundle bundle) {
        super.w0(bundle);
        if (bundle == null) {
            bundle = ((zf30) this).f;
        }
        this.G1 = bundle.getInt("THEME_RES_ID_KEY");
        this.H1 = (vwc) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.I1 = (tjm0) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(h0(), this.G1);
        this.K1 = new cab(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        tjm0 tjm0Var = this.H1.a;
        if (ech0.k1(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = 2131625269;
            i2 = 1;
        } else {
            i = 2131625264;
            i2 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        Resources resources = P0().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(2131166606) + resources.getDimensionPixelOffset(2131166608) + resources.getDimensionPixelSize(2131166607);
        int dimensionPixelSize = resources.getDimensionPixelSize(2131166591);
        int i3 = ujm0.d;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(2131166605) * (i3 - 1)) + (resources.getDimensionPixelSize(2131166586) * i3) + resources.getDimensionPixelOffset(2131166583));
        GridView gridView = (GridView) viewInflate.findViewById(2131430068);
        b8k1.p(gridView, new wbh0());
        gridView.setAdapter((ListAdapter) new x7r());
        gridView.setNumColumns(tjm0Var.d);
        gridView.setEnabled(false);
        this.M1 = viewInflate.findViewById(2131430071);
        this.M1.setLayoutManager(new xbh0(this, i2, i2));
        this.M1.setTag("MONTHS_VIEW_GROUP_TAG");
        c cVar = new c(contextThemeWrapper, this.H1, new zc80(this, (byte) 21));
        this.M1.setAdapter(cVar);
        int integer = contextThemeWrapper.getResources().getInteger(2131492940);
        RecyclerView recyclerViewFindViewById = viewInflate.findViewById(2131430074);
        this.L1 = recyclerViewFindViewById;
        if (recyclerViewFindViewById != null) {
            recyclerViewFindViewById.setHasFixedSize(true);
            this.L1.setLayoutManager(new GridLayoutManager(integer, 0));
            this.L1.setAdapter(new cnm1(this));
            this.L1.j(new fyd(this));
        }
        if (viewInflate.findViewById(2131429995) != null) {
            MaterialButton materialButtonFindViewById = viewInflate.findViewById(2131429995);
            materialButtonFindViewById.setTag("SELECTOR_TOGGLE_TAG");
            b8k1.p(materialButtonFindViewById, new h8v(this));
            MaterialButton materialButtonFindViewById2 = viewInflate.findViewById(2131429997);
            materialButtonFindViewById2.setTag("NAVIGATION_PREV_TAG");
            MaterialButton materialButtonFindViewById3 = viewInflate.findViewById(2131429996);
            materialButtonFindViewById3.setTag("NAVIGATION_NEXT_TAG");
            this.N1 = viewInflate.findViewById(2131430074);
            this.O1 = viewInflate.findViewById(2131430067);
            a1(1);
            materialButtonFindViewById.setText(this.I1.j(viewInflate.getContext()));
            this.M1.m(new z4x(this, cVar, materialButtonFindViewById));
            materialButtonFindViewById.setOnClickListener(new hid0(this, (byte) 3));
            materialButtonFindViewById3.setOnClickListener(new ybh0(this, cVar, (byte) 0));
            materialButtonFindViewById2.setOnClickListener(new ybh0(this, cVar, (byte) 1));
        }
        if (!ech0.k1(contextThemeWrapper, R.attr.windowFullscreen)) {
            new xic0((byte) 1).b(this.M1);
        }
        this.M1.u0(cVar.e.a.k(this.I1));
        return viewInflate;
    }
}
