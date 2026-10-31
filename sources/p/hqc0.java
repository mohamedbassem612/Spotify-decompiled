package p;

import android.os.Parcelable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hqc0 extends k611 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public /* synthetic */ hqc0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public void c(RecyclerView recyclerView, int i) {
        m551 m551Var;
        switch (this.a) {
            case 2:
                if (i == 0 && (m551Var = ((wnd1) ((xed1) this.b).b).c) != null) {
                    m551Var.invoke();
                    break;
                }
                break;
        }
    }

    public final void h(RecyclerView recyclerView, int i, int i2) {
        byte b = this.a;
        Parcelable tr80Var = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ic9 ic9Var = (ic9) ((b14) obj2).c;
                int iC1 = ((RecyclerView) ic9Var.c).getLayoutManager().c1();
                int iG1 = ((RecyclerView) ic9Var.c).getLayoutManager().g1();
                if (iC1 != -1) {
                    ((iu30) obj).invoke(new ppc0(new tr80(iC1, iG1, 1), new yvg1(Integer.valueOf(i2), Integer.valueOf(iC1), Boolean.valueOf(!recyclerView.canScrollVertically(-1)))));
                    break;
                }
                break;
            case 1:
                List list = ((emc0) ((lcb0) obj)).d.f;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (obj3 instanceof wv31) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((wv31) it.next()).a.a);
                }
                LinearLayoutManager layoutManager = recyclerView.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? layoutManager : null;
                if (linearLayoutManager != null) {
                    int iF1 = linearLayoutManager.f1();
                    int iH1 = linearLayoutManager.h1();
                    if (iF1 != -1 && iH1 != -1) {
                        tr80Var = new tr80(iF1, iH1, 1);
                    }
                }
                if (tr80Var != null) {
                    nd51 nd51Var = (nd51) obj2;
                    int i3 = (((rr80) tr80Var).a + ((rr80) tr80Var).b) / 2;
                    aek1 aek1Var = nd51Var.b;
                    boolean z = aek1Var.c == null;
                    aek1Var.c = Integer.valueOf(arrayList2.size());
                    boolean zB = aek1Var.b(i3);
                    if (zB) {
                        aek1Var.a(i3);
                    }
                    if (zB || z) {
                        x5b0 x5b0Var = nd51Var.a;
                        int i4 = aek1Var.d;
                        int i5 = i4 >= 0 ? i4 : 0;
                        int i6 = i5 + 50;
                        int size = arrayList2.size();
                        if (i6 > size) {
                            i6 = size;
                        }
                        if (i5 > i6) {
                            i5 = i6;
                        }
                        x5b0Var.a("Search", arrayList2.subList(i5, i6));
                    }
                }
                break;
            default:
                wnd1 wnd1Var = (wnd1) ((xed1) obj2).b;
                a layoutManager2 = ((RecyclerView) obj).getLayoutManager();
                wnd1Var.b = layoutManager2 != null ? layoutManager2.x0() : null;
                break;
        }
    }
}
