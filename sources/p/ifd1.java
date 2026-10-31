package p;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ifd1 implements q570, o570 {
    public final esa1 a;
    public final pic b;
    public final wnd1 c;
    public final gw70 d;
    public iod1 e;
    public ViewPager2 f;
    public Integer g;
    public final vku h = new vku();

    public ifd1(esa1 esa1Var, pic picVar, wnd1 wnd1Var, gw70 gw70Var) {
        this.a = esa1Var;
        this.b = picVar;
        this.c = wnd1Var;
        this.d = gw70Var;
    }

    public final int a() {
        return 2131428333;
    }

    public final View b(ViewGroup viewGroup, l670 l670Var) {
        iod1 iod1Var = new iod1(viewGroup.getContext());
        this.e = iod1Var;
        iod1Var.setImageLoader(this.d);
        this.f = (ViewPager2) LayoutInflater.from(viewGroup.getContext()).inflate(2131626229, viewGroup, false);
        g().setUserInputEnabled(false);
        AppBarLayout appBarLayout = (AppBarLayout) pwo1.k(viewGroup.getRootView(), AppBarLayout.class);
        if (appBarLayout != null) {
            iod1 iod1Var2 = this.e;
            if (iod1Var2 == null) {
                u890.C("tabsSectionHeading");
                throw null;
            }
            appBarLayout.addView(iod1Var2);
        }
        this.b.a();
        g().addOnAttachStateChangeListener(new y22(this, (byte) 18));
        return g();
    }

    public final EnumSet c() {
        return EnumSet.of(ix40.h);
    }

    public final void d(View view, y570 y570Var, l670 l670Var, yfu yfuVar) {
        Parcelable parcelableE = yfuVar.e(y570Var);
        Bundle bundle = parcelableE instanceof Bundle ? (Bundle) parcelableE : null;
        wnd1 wnd1Var = this.c;
        if (bundle != null) {
            if (bundle.containsKey("activeTab")) {
                wnd1Var.b().onNext(new shd1(bundle.getInt("activeTab")));
            }
            if (bundle.containsKey("scrollState")) {
                wnd1Var.d((Parcelable) jhc1.t(bundle, "scrollState", Parcelable.class));
            }
        }
        if (this.g == null) {
            this.g = Integer.valueOf(y570Var.g().n(0, "activeTab"));
        }
        wnd1Var.c(new m551(this, y570Var, yfuVar, (byte) 29));
        if (g().getAdapter() == null) {
            g().setAdapter(new s470(l670Var));
        }
        s470 adapter = g().getAdapter();
        adapter.B(y570Var.s());
        adapter.h();
        int currentItem = g().getCurrentItem();
        Integer num = this.g;
        if (num == null || currentItem != num.intValue()) {
            ViewPager2 viewPager2G = g();
            Integer num2 = this.g;
            viewPager2G.d(num2 != null ? num2.intValue() : 0, false);
        }
        f(y570Var);
        this.h.a(wnd1Var.b().distinctUntilChanged().subscribe(new hfd1(this, y570Var, yfuVar, (byte) 0)));
    }

    public final void e(View view, y570 y570Var, int[] iArr) {
        pwo1.t(g(), Arrays.copyOf(iArr, iArr.length));
    }

    public final void f(y570 y570Var) {
        List listS = y570Var.s();
        iod1 iod1Var = this.e;
        if (iod1Var == null) {
            u890.C("tabsSectionHeading");
            throw null;
        }
        List list = listS;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            y570 y570Var2 = (y570) obj;
            String strA = y570Var2.n().a();
            if (strA == null) {
                strA = "";
            }
            ld70 ld70VarA = y570Var2.k().a();
            arrayList.add(new fod1(strA, ld70VarA != null ? ld70VarA.b() : null, new wv1(i, listS, this, (byte) 29)));
            i = i2;
        }
        iod1Var.setTabContentList(arrayList);
        iod1 iod1Var2 = this.e;
        if (iod1Var2 == null) {
            u890.C("tabsSectionHeading");
            throw null;
        }
        Integer num = this.g;
        iod1Var2.setSelectedTabIndex(num != null ? num.intValue() : 0);
    }

    public final ViewPager2 g() {
        ViewPager2 viewPager2 = this.f;
        if (viewPager2 != null) {
            return viewPager2;
        }
        u890.C("viewPager");
        throw null;
    }

    public final void h(y570 y570Var, yfu yfuVar) {
        Integer num = this.g;
        yfuVar.r(y570Var, mno1.h(oqn1.n("activeTab", Integer.valueOf(num != null ? num.intValue() : 0)), oqn1.n("scrollState", this.c.a())));
    }
}
