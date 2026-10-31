package p;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tdk1 extends LinearLayoutManager {
    public final /* synthetic */ ViewPager2 g1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tdk1(ViewPager2 viewPager2) {
        super(1);
        this.g1 = viewPager2;
    }

    public final boolean E0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    public final void U0(s611 s611Var, int[] iArr) {
        ViewPager2 viewPager2 = this.g1;
        int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
        if (offscreenPageLimit == -1) {
            super.U0(s611Var, iArr);
            return;
        }
        int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
        iArr[0] = pageSize;
        iArr[1] = pageSize;
    }

    public final void k0(n611 n611Var, s611 s611Var, kg kgVar) {
        super/*androidx.recyclerview.widget.a*/.k0(n611Var, s611Var, kgVar);
        this.g1.W0.getClass();
    }

    public final void m0(n611 n611Var, s611 s611Var, View view, kg kgVar) {
        int iV;
        int iV2;
        ViewPager2 viewPager2 = this.g1.W0.d;
        if (viewPager2.getOrientation() == 1) {
            viewPager2.g.getClass();
            iV = a.V(view);
        } else {
            iV = 0;
        }
        if (viewPager2.getOrientation() == 0) {
            viewPager2.g.getClass();
            iV2 = a.V(view);
        } else {
            iV2 = 0;
        }
        kgVar.n(jg.b(false, iV, 1, iV2, 1));
    }

    public final boolean z0(n611 n611Var, s611 s611Var, int i, Bundle bundle) {
        this.g1.W0.getClass();
        return super/*androidx.recyclerview.widget.a*/.z0(n611Var, s611Var, i, bundle);
    }
}
