package p;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hh6 extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hh6(int i, int i2, ul7 ul7Var, p1d0 p1d0Var, iac0 iac0Var) {
        super(1);
        this.b = i;
        this.c = i2;
        this.d = ul7Var;
        this.e = p1d0Var;
        this.f = iac0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.c;
        int i2 = this.b;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                q5t0 q5t0Var = (q5t0) obj3;
                ((iu30) obj4).invoke(Float.valueOf(q5t0Var.b + i2 + ((n811) obj2).a));
                ((p5t0) obj).k(q5t0Var, (i - q5t0Var.a) / 2, i2, 0.0f);
                return rih1Var;
            case 1:
                RecyclerView recyclerView = new RecyclerView((Context) obj);
                recyclerView.setId(2131427915);
                recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                int i3 = i2 / 2;
                recyclerView.j(new j1e(i3, (byte) 13));
                recyclerView.setClipToPadding(false);
                recyclerView.setVisibility(4);
                recyclerView.setPaddingRelative(i3, recyclerView.getPaddingTop(), i3, i);
                y9l1 y9l1Var = new y9l1(recyclerView, new rm5(new m4d(recyclerView, (byte) 7), (byte) 13));
                iro1.j(y9l1Var, recyclerView);
                ((ul7) obj4).a = y9l1Var;
                ((p1d0) obj3).a(recyclerView, (iac0) obj2, new StaggeredGridLayoutManager(), false);
                return recyclerView;
            case 2:
                p5t0 p5t0Var = (p5t0) obj;
                Iterator it = ((ArrayList) obj4).iterator();
                while (it.hasNext()) {
                    p5t0Var.f((q5t0) it.next(), 0, 0, 0.0f);
                }
                Iterator it2 = ((List) obj3).iterator();
                while (it2.hasNext()) {
                    p5t0Var.f((q5t0) it2.next(), 0, i2, 0.0f);
                }
                int i4 = i2 + i;
                Iterator it3 = ((List) obj2).iterator();
                while (it3.hasNext()) {
                    p5t0Var.f((q5t0) it3.next(), 0, i4, 0.0f);
                }
                return rih1Var;
            default:
                return new b2s0((String) obj4, (uqo) obj, (t1s0) obj3, this.b, this.c, (h2s0) obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hh6(String str, t1s0 t1s0Var, int i, int i2, h2s0 h2s0Var) {
        super(1);
        this.d = str;
        this.e = t1s0Var;
        this.b = i;
        this.c = i2;
        this.f = h2s0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hh6(ArrayList arrayList, int i, List list, int i2, List list2) {
        super(1);
        this.d = arrayList;
        this.b = i;
        this.e = list;
        this.c = i2;
        this.f = list2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hh6(iu30 iu30Var, int i, q5t0 q5t0Var, n811 n811Var, int i2) {
        super(1);
        this.d = iu30Var;
        this.b = i;
        this.e = q5t0Var;
        this.f = n811Var;
        this.c = i2;
    }
}
