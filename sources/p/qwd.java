package p;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import com.google.android.material.tabs.TabLayout;
import com.spotify.culturalmoments.hubscomponents.carousel.CarouselComponent$ViewHolder$linearLayoutManager$1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qwd extends l570 {
    public final owd X;
    public final asn b;
    public final uzd c;
    public y570 d;
    public yfu e;
    public final int f;
    public final c711 g;
    public final zl7 h;
    public final pwd i;
    public final CarouselComponent$ViewHolder$linearLayoutManager$1 t;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r4v8, types: [com.spotify.culturalmoments.hubscomponents.carousel.CarouselComponent$ViewHolder$linearLayoutManager$1] */
    public qwd(asn asnVar, uzd uzdVar, l670 l670Var) {
        LinearLayout linearLayout = (LinearLayout) asnVar.a;
        super(linearLayout);
        this.b = asnVar;
        this.c = uzdVar;
        this.f = (int) linearLayout.getContext().getResources().getDimension(2131165426);
        this.g = new c711(this, (byte) 1);
        this.h = new zl7(this, (byte) 1);
        this.i = new pwd(this, (byte) 0);
        RecyclerView recyclerView = (RecyclerView) asnVar.b;
        recyclerView.getContext();
        this.t = new LinearLayoutManager() { // from class: com.spotify.culturalmoments.hubscomponents.carousel.CarouselComponent$ViewHolder$linearLayoutManager$1
            public final int g1;

            {
                super(1);
                this.g1 = (int) ((LinearLayout) this.h1.b.a).getContext().getResources().getDimension(2131165427);
                x1(0);
            }

            public final void c0(View view, int i) {
                int iV = a.V(view);
                int iR = R() - 1;
                int i2 = this.g1;
                if (iV != iR) {
                    i2 += this.h1.f;
                }
                super/*androidx.recyclerview.widget.a*/.c0(view, i2);
            }
        };
        this.X = new owd(l670Var, (int) linearLayout.getContext().getResources().getDimension(2131165422));
        new sm90().b(recyclerView);
    }

    public final void a(y570 y570Var, l670 l670Var, yfu yfuVar) {
        this.d = y570Var;
        this.e = yfuVar;
        List listS = y570Var.s();
        owd owdVar = this.X;
        owdVar.B(listS);
        asn asnVar = this.b;
        ((RecyclerView) asnVar.b).setAdapter(owdVar);
        RecyclerView recyclerView = (RecyclerView) asnVar.b;
        recyclerView.setLayoutManager(this.t);
        c711 c711Var = this.g;
        recyclerView.n0(c711Var);
        zl7 zl7Var = this.h;
        recyclerView.p0(zl7Var);
        TabLayout tabLayout = (TabLayout) asnVar.c;
        ArrayList arrayList = tabLayout.j1;
        pwd pwdVar = this.i;
        arrayList.remove(pwdVar);
        tabLayout.i();
        int iE = owdVar.e();
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= iE) {
                break;
            }
            dhd1 dhd1VarH = tabLayout.h();
            if (i != 0) {
                z = false;
            }
            tabLayout.b(dhd1VarH, z);
            i++;
        }
        Bundle bundleC = c();
        int i2 = bundleC != null ? bundleC.getInt("LIST_SCROLL_POSITION") : 0;
        recyclerView.u0(i2);
        ((TabLayout) asnVar.c).j(((TabLayout) asnVar.c).g(i2), true);
        recyclerView.j(c711Var);
        recyclerView.m(zl7Var);
        tabLayout.a(pwdVar);
        owdVar.h();
    }

    public final Bundle c() {
        yfu yfuVar = this.e;
        if (yfuVar == null) {
            u890.C("state");
            throw null;
        }
        y570 y570Var = this.d;
        if (y570Var == null) {
            u890.C("data");
            throw null;
        }
        Parcelable parcelableE = yfuVar.e(y570Var);
        if (parcelableE instanceof Bundle) {
            return (Bundle) parcelableE;
        }
        return null;
    }

    public final void b(int... iArr) {
    }
}
