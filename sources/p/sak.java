package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.spotify.mobius.EventSource;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sak implements i8l {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public sak(nwa nwaVar, yqg yqgVar, yge0 yge0Var, gmi0 gmi0Var, lzn0 lzn0Var, kt91 kt91Var) {
        this.a = (byte) 2;
        this.b = nwaVar;
        this.g = yqgVar;
        this.c = yge0Var;
        this.d = gmi0Var;
        this.e = lzn0Var;
        this.f = kt91Var;
    }

    @Override // p.i8l
    public final h8l a(Context context, Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        byte b = this.a;
        Object obj = this.g;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                q7r0 q7r0Var = (q7r0) obj3;
                return new rak(layoutInflater, (g7p) obj6, (nak) obj5, (p2o0) obj4, cwl1.C(q7r0Var), q7r0Var, (d520) obj2, (yqg) obj, bundle);
            case 1:
                View viewInflate = layoutInflater.inflate(2131625354, viewGroup, false);
                int i = 2131427588;
                AppBarLayout appBarLayoutT = m5n1.t(viewInflate, 2131427588);
                if (appBarLayoutT != null) {
                    i = 2131428266;
                    RecyclerView recyclerViewT = m5n1.t(viewInflate, 2131428266);
                    if (recyclerViewT != null) {
                        i = 2131428868;
                        SearchView searchViewT = m5n1.t(viewInflate, 2131428868);
                        if (searchViewT != null) {
                            i = 2131431397;
                            Toolbar toolbarT = m5n1.t(viewInflate, 2131431397);
                            if (toolbarT != null) {
                                return new jbn(new phi0((FrameLayout) viewInflate, appBarLayoutT, recyclerViewT, searchViewT, toolbarT, (byte) 6), (cir0) obj6, (EventSource) obj5, (m021) obj4, (amy0) obj3, (i8h1) obj2, (gik1) obj);
                            }
                        }
                    }
                }
                bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
                return null;
            case 2:
                return new spk(layoutInflater, (nwa) obj6, (yge0) obj5, ((gmi0) obj4).getViewUri(), (lzn0) obj3, (kt91) obj2, (yqg) obj);
            default:
                return new a901(layoutInflater.inflate(2131625572, viewGroup, false), (cir0) obj6, (e7q) obj5, (cx0) obj4, (xwt0) obj3, (sma1) obj2, (p901) obj);
        }
    }

    public /* synthetic */ sak(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }
}
