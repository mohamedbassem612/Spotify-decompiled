package p;

import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.nowplayingqueue.bottomsheet.view.layoutmanager.StickyHeaderLinearLayoutManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pn extends b611 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pn(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public void a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                t5o0 t5o0Var = (t5o0) obj;
                t5o0Var.e = t5o0Var.c.e();
                m5f1 m5f1Var = t5o0Var.d;
                ((m5k) m5f1Var.a).h();
                m5f1Var.a();
                break;
            case 2:
                ((e7x0) obj).a();
                break;
            case 3:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.n((String) null);
                recyclerView.H1.f = true;
                recyclerView.j0(true);
                if (!recyclerView.e.w()) {
                    recyclerView.requestLayout();
                }
                break;
            case 4:
                ((v751) obj).a();
                break;
            case 5:
                StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager = (StickyHeaderLinearLayoutManager) obj;
                ArrayList arrayList = stickyHeaderLinearLayoutManager.i1;
                arrayList.clear();
                int iE = stickyHeaderLinearLayoutManager.g1.e();
                for (int i = 0; i < iE; i++) {
                    if (((Boolean) stickyHeaderLinearLayoutManager.h1.invoke(Integer.valueOf(i))).booleanValue()) {
                        arrayList.add(Integer.valueOf(i));
                    }
                }
                if (stickyHeaderLinearLayoutManager.j1 != null && !arrayList.contains(Integer.valueOf(stickyHeaderLinearLayoutManager.k1))) {
                    stickyHeaderLinearLayoutManager.K1(null);
                    break;
                }
                break;
            case 6:
                ((vrv0) obj).j();
                break;
        }
    }

    public void b(int i, int i2) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                t5o0 t5o0Var = (t5o0) obj;
                m5f1 m5f1Var = t5o0Var.d;
                ((z511) ((m5k) m5f1Var.a)).a.d(i + m5f1Var.b(t5o0Var), i2, (Object) null);
                return;
            case 2:
            case 3:
            case 5:
            default:
                return;
            case 4:
                ((v751) obj).a();
                return;
            case 6:
                ((vrv0) obj).j();
                return;
            case 7:
                oyd1 oyd1Var = (oyd1) obj;
                cyd1 cyd1Var = oyd1Var.e2;
                if (cyd1Var == null) {
                    u890.C("termsAdapter");
                    throw null;
                }
                List list = ((emc0) cyd1Var).d.f;
                boolean z = true;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (!((fyd1) it.next()).c) {
                            z = false;
                        }
                    }
                }
                ua91 ua91Var = oyd1Var.g2;
                if (ua91Var != null) {
                    ((EncoreButton) ua91Var.c).setEnabled(z);
                    return;
                } else {
                    u890.C("binding");
                    throw null;
                }
        }
    }

    public void c(int i, int i2, Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 1:
                t5o0 t5o0Var = (t5o0) obj2;
                m5f1 m5f1Var = t5o0Var.d;
                ((z511) ((m5k) m5f1Var.a)).a.d(i + m5f1Var.b(t5o0Var), i2, obj);
                break;
            case 2:
            case 5:
            default:
                super.c(i, i2, obj);
                break;
            case 3:
                RecyclerView recyclerView = (RecyclerView) obj2;
                recyclerView.n((String) null);
                t01 t01Var = recyclerView.e;
                ArrayList arrayList = (ArrayList) t01Var.c;
                if (i2 >= 1) {
                    arrayList.add(t01Var.y(obj, 4, i, i2));
                    t01Var.a |= 4;
                    if (arrayList.size() == 1) {
                        h();
                    }
                    break;
                }
                break;
            case 4:
                ((v751) obj2).a();
                break;
            case 6:
                ((vrv0) obj2).j();
                break;
        }
    }

    public void d(int i, int i2) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (i == 0) {
                    ((RecyclerView) ((u961) ((qn) obj).b).c).u0(0);
                }
                break;
            case 1:
                t5o0 t5o0Var = (t5o0) obj;
                t5o0Var.e += i2;
                m5f1 m5f1Var = t5o0Var.d;
                ((m5k) m5f1Var.a).k(i + m5f1Var.b(t5o0Var), i2);
                if (t5o0Var.e > 0 && t5o0Var.c.c == 2) {
                    m5f1Var.a();
                    break;
                }
                break;
            case 3:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.n((String) null);
                t01 t01Var = recyclerView.e;
                ArrayList arrayList = (ArrayList) t01Var.c;
                if (i2 >= 1) {
                    arrayList.add(t01Var.y(null, 1, i, i2));
                    t01Var.a |= 1;
                    if (arrayList.size() == 1) {
                        h();
                    }
                    break;
                }
                break;
            case 4:
                ((v751) obj).a();
                break;
            case 5:
                a();
                break;
            case 6:
                ((vrv0) obj).j();
                break;
        }
    }

    public void e(int i, int i2) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                t5o0 t5o0Var = (t5o0) obj;
                m5f1 m5f1Var = t5o0Var.d;
                int iB = m5f1Var.b(t5o0Var);
                ((m5k) m5f1Var.a).j(i + iB, i2 + iB);
                break;
            case 3:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.n((String) null);
                t01 t01Var = recyclerView.e;
                ArrayList arrayList = (ArrayList) t01Var.c;
                if (i != i2) {
                    arrayList.add(t01Var.y(null, 8, i, i2));
                    t01Var.a |= 8;
                    if (arrayList.size() == 1) {
                        h();
                    }
                    break;
                }
                break;
            case 4:
                ((v751) obj).a();
                break;
            case 5:
                a();
                break;
            case 6:
                ((vrv0) obj).j();
                break;
        }
    }

    public void f(int i, int i2) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                t5o0 t5o0Var = (t5o0) obj;
                t5o0Var.e -= i2;
                m5f1 m5f1Var = t5o0Var.d;
                ((m5k) m5f1Var.a).l(i + m5f1Var.b(t5o0Var), i2);
                if (t5o0Var.e < 1 && t5o0Var.c.c == 2) {
                    m5f1Var.a();
                    break;
                }
                break;
            case 3:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.n((String) null);
                t01 t01Var = recyclerView.e;
                ArrayList arrayList = (ArrayList) t01Var.c;
                if (i2 >= 1) {
                    arrayList.add(t01Var.y(null, 2, i, i2));
                    t01Var.a |= 2;
                    if (arrayList.size() == 1) {
                        h();
                    }
                    break;
                }
                break;
            case 4:
                ((v751) obj).a();
                break;
            case 5:
                a();
                break;
            case 6:
                ((vrv0) obj).j();
                break;
        }
    }

    public void g() {
        z511 z511Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                ((t5o0) obj).d.a();
                break;
            case 3:
                RecyclerView recyclerView = (RecyclerView) obj;
                if (recyclerView.d != null && (z511Var = recyclerView.P0) != null) {
                    int iC = l1d.C(z511Var.c);
                    if (iC != 1) {
                        if (iC == 2) {
                        }
                    } else if (z511Var.e() <= 0) {
                    }
                    recyclerView.requestLayout();
                }
                break;
        }
    }

    public void h() {
        RecyclerView recyclerView = (RecyclerView) this.b;
        if (!RecyclerView.g2 || !recyclerView.W0 || !recyclerView.V0) {
            recyclerView.d1 = true;
            recyclerView.requestLayout();
        } else {
            g54 g54Var = recyclerView.i;
            WeakHashMap weakHashMap = b8k1.a;
            recyclerView.postOnAnimation(g54Var);
        }
    }
}
