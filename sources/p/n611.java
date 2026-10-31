package p;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class n611 {
    public final ArrayList a;
    public ArrayList b;
    public final ArrayList c;
    public final List d;
    public int e;
    public int f;
    public m611 g;
    public final /* synthetic */ RecyclerView h;

    public n611(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = null;
        this.c = new ArrayList();
        this.d = Collections.unmodifiableList(arrayList);
        this.e = 2;
        this.f = 2;
    }

    public final void a(w611 w611Var, boolean z) {
        RecyclerView.o(w611Var);
        View view = w611Var.a;
        RecyclerView recyclerView = this.h;
        y611 y611Var = recyclerView.O1;
        if (y611Var != null) {
            x611 x611VarA = y611Var.a();
            b8k1.p(view, x611VarA != null ? x611VarA.a(view) : null);
        }
        if (z) {
            ArrayList arrayList = recyclerView.R0;
            if (arrayList.size() > 0) {
                pze0.m(arrayList.get(0));
                throw null;
            }
            z511 z511Var = recyclerView.P0;
            if (z511Var != null) {
                z511Var.v(w611Var);
            }
            if (recyclerView.H1 != null) {
                recyclerView.g.G(w611Var);
            }
            if (RecyclerView.c2) {
                Objects.toString(w611Var);
            }
        }
        w611Var.S0 = null;
        w611Var.R0 = null;
        m611 m611VarC = c();
        m611VarC.getClass();
        int i = w611Var.f;
        ArrayList arrayList2 = m611VarC.a(i).a;
        if (((l611) m611VarC.a.get(i)).b <= arrayList2.size()) {
            p9p1.s(view);
        } else if (RecyclerView.b2 && arrayList2.contains(w611Var)) {
            hhg1.n("this scrap item already exists");
        } else {
            w611Var.A();
            arrayList2.add(w611Var);
        }
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.h;
        s611 s611Var = recyclerView.H1;
        if (i >= 0 && i < s611Var.b()) {
            return !s611Var.g ? i : recyclerView.e.m(i);
        }
        StringBuilder sbR = cy30.r(i, "invalid position ", ". State item count is ");
        sbR.append(s611Var.b());
        sbR.append(recyclerView.G());
        throw new IndexOutOfBoundsException(sbR.toString());
    }

    public final m611 c() {
        if (this.g == null) {
            this.g = new m611();
            e();
        }
        return this.g;
    }

    public final View d(int i) {
        return m(i, Long.MAX_VALUE).a;
    }

    public final void e() {
        RecyclerView recyclerView;
        z511 z511Var;
        m611 m611Var = this.g;
        if (m611Var == null || (z511Var = (recyclerView = this.h).P0) == null || !recyclerView.V0) {
            return;
        }
        m611Var.c.add(z511Var);
    }

    public final void f(z511 z511Var, boolean z) {
        m611 m611Var = this.g;
        if (m611Var != null) {
            SparseArray sparseArray = m611Var.a;
            Set set = m611Var.c;
            set.remove(z511Var);
            if (set.size() != 0 || z) {
                return;
            }
            for (int i = 0; i < sparseArray.size(); i++) {
                ArrayList arrayList = ((l611) sparseArray.get(sparseArray.keyAt(i))).a;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    p9p1.s(((w611) arrayList.get(i2)).a);
                }
            }
        }
    }

    public final void g() {
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h(size);
        }
        arrayList.clear();
        if (RecyclerView.h2) {
            this.h.G1.i();
        }
    }

    public final void h(int i) {
        boolean z = RecyclerView.b2;
        ArrayList arrayList = this.c;
        w611 w611Var = (w611) arrayList.get(i);
        if (RecyclerView.c2) {
            Objects.toString(w611Var);
        }
        a(w611Var, true);
        arrayList.remove(i);
    }

    public final void i(View view) {
        w611 w611VarU = RecyclerView.U(view);
        boolean zX = w611VarU.x();
        RecyclerView recyclerView = this.h;
        if (zX) {
            recyclerView.removeDetachedView(view, false);
        }
        if (w611VarU.w()) {
            w611VarU.N0.n(w611VarU);
        } else if (w611VarU.D()) {
            w611VarU.t &= -33;
        }
        j(w611VarU);
        if (recyclerView.p1 == null || w611VarU.u()) {
            return;
        }
        recyclerView.p1.f(w611VarU);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    public final void j(w611 w611Var) {
        boolean z;
        boolean z2;
        RecyclerView recyclerView = this.h;
        a9a a9aVar = recyclerView.G1;
        boolean zW = w611Var.w();
        View view = w611Var.a;
        boolean z3 = false;
        boolean z4 = true;
        if (zW || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(w611Var.w());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.G());
            throw new IllegalArgumentException(sb.toString());
        }
        if (w611Var.x()) {
            StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            sb2.append(w611Var);
            q58.i(recyclerView.G(), sb2);
            return;
        }
        if (w611Var.C()) {
            hhg1.n("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.".concat(recyclerView.G()));
            return;
        }
        if ((w611Var.t & 16) == 0) {
            WeakHashMap weakHashMap = b8k1.a;
            if (view.hasTransientState()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        z511 z511Var = recyclerView.P0;
        boolean z5 = z511Var != null && z && z511Var.s(w611Var);
        boolean z6 = RecyclerView.b2;
        ArrayList arrayList = this.c;
        if (z6 && arrayList.contains(w611Var)) {
            StringBuilder sb3 = new StringBuilder("cached view received recycle internal? ");
            sb3.append(w611Var);
            q58.i(recyclerView.G(), sb3);
            return;
        }
        if (z5 || w611Var.u()) {
            if (this.f <= 0 || (w611Var.t & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_RESET_CONTEXT_FAILED) != 0) {
                z2 = false;
            } else {
                int size = arrayList.size();
                if (size >= this.f && size > 0) {
                    h(0);
                    size--;
                }
                if (RecyclerView.h2 && size > 0 && !a9aVar.p(w611Var.c)) {
                    int i = size - 1;
                    while (i >= 0 && a9aVar.p(((w611) arrayList.get(i)).c)) {
                        i--;
                    }
                    size = i + 1;
                }
                arrayList.add(size, w611Var);
                z2 = true;
            }
            if (z2) {
                z4 = false;
            } else {
                a(w611Var, true);
            }
            z3 = z2;
        } else {
            if (RecyclerView.c2) {
                recyclerView.G();
            }
            z4 = false;
        }
        recyclerView.g.G(w611Var);
        if (z3 || z4 || !z) {
            return;
        }
        p9p1.s(view);
        w611Var.S0 = null;
        w611Var.R0 = null;
    }

    public final void k(View view) {
        e611 e611Var;
        w611 w611VarU = RecyclerView.U(view);
        int i = w611VarU.t & 12;
        RecyclerView recyclerView = this.h;
        if (i == 0 && w611VarU.y() && (e611Var = recyclerView.p1) != null && !e611Var.c(w611VarU, w611VarU.p())) {
            ArrayList arrayList = this.b;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.b = arrayList;
            }
            w611VarU.N0 = this;
            w611VarU.O0 = true;
            arrayList.add(w611VarU);
            return;
        }
        if (w611VarU.t() && !w611VarU.v() && !recyclerView.P0.b) {
            hhg1.n("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.G()));
            return;
        }
        w611VarU.N0 = this;
        w611VarU.O0 = false;
        this.a.add(w611VarU);
    }

    public final boolean l(w611 w611Var, int i, int i2, long j) {
        w611Var.S0 = null;
        View view = w611Var.a;
        RecyclerView recyclerView = this.h;
        w611Var.R0 = recyclerView;
        int i3 = w611Var.f;
        long nanoTime = recyclerView.getNanoTime();
        boolean z = false;
        if (j != Long.MAX_VALUE) {
            long j2 = this.g.a(i3).d;
            if (j2 != 0 && j2 + nanoTime >= j) {
                return false;
            }
        }
        if (w611Var.x()) {
            recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
            z = true;
        }
        recyclerView.P0.b(i, w611Var);
        if (z) {
            recyclerView.detachViewFromParent(view);
        }
        long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
        l611 l611VarA = this.g.a(w611Var.f);
        long j3 = l611VarA.d;
        if (j3 != 0) {
            nanoTime2 = (nanoTime2 / 4) + ((j3 / 4) * 3);
        }
        l611VarA.d = nanoTime2;
        AccessibilityManager accessibilityManager = recyclerView.e1;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            WeakHashMap weakHashMap = b8k1.a;
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            y611 y611Var = recyclerView.O1;
            if (y611Var != null) {
                x611 x611VarA = y611Var.a();
                if (x611VarA != null) {
                    x611VarA.b(view);
                }
                b8k1.p(view, x611VarA);
            }
        }
        if (recyclerView.H1.g) {
            w611Var.g = i2;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:114:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:121:0x01df  */
    /* JADX WARN: Code duplicated, block: B:123:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:124:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:126:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:128:0x0205  */
    /* JADX WARN: Code duplicated, block: B:131:0x0223  */
    /* JADX WARN: Code duplicated, block: B:133:0x0227  */
    /* JADX WARN: Code duplicated, block: B:181:0x030e A[EDGE_INSN: B:181:0x030e->B:182:0x030f BREAK  A[LOOP:4: B:176:0x02f6->B:180:0x030b]] */
    /* JADX WARN: Code duplicated, block: B:217:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:223:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:225:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:234:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:242:0x041c  */
    /* JADX WARN: Code duplicated, block: B:243:0x0426  */
    /* JADX WARN: Code duplicated, block: B:245:0x042c  */
    /* JADX WARN: Code duplicated, block: B:246:0x0436  */
    /* JADX WARN: Code duplicated, block: B:249:0x043c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:251:0x0441  */
    /* JADX WARN: Code duplicated, block: B:262:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:282:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x007c A[EDGE_INSN: B:35:0x007c->B:36:0x007d BREAK  A[LOOP:0: B:14:0x0024->B:20:0x003e]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0089  */
    /* JADX WARN: Code duplicated, block: B:44:0x0090  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:72:0x0105  */
    /* JADX WARN: Code duplicated, block: B:74:0x0114 A[EDGE_INSN: B:74:0x0114->B:95:0x0189 BREAK  A[LOOP:1: B:43:0x008e->B:55:0x00ba]] */
    /* JADX WARN: Code duplicated, block: B:75:0x012e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0140  */
    /* JADX WARN: Code duplicated, block: B:79:0x0154  */
    /* JADX WARN: Code duplicated, block: B:81:0x015a  */
    /* JADX WARN: Code duplicated, block: B:83:0x0161  */
    /* JADX WARN: Code duplicated, block: B:96:0x018b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0191  */
    /* JADX WARN: Instruction removed from duplicated block: B:77:0x0140, please report this as an issue */
    public final w611 m(int i, long j) {
        w611 w611VarC;
        boolean z;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z2;
        boolean z3;
        View view;
        boolean z4;
        w611 w611Var;
        boolean zL;
        ViewGroup.LayoutParams layoutParams;
        g611 g611Var;
        boolean z5;
        int iM;
        RecyclerView recyclerViewM;
        w611 w611Var2;
        int size;
        int i2;
        ArrayList arrayList3;
        int size2;
        int i3;
        View view2;
        int size3;
        int i4;
        w611 w611Var3;
        w611 w611VarU;
        p0g p0gVar;
        o0g o0gVar;
        int iR;
        int iE;
        w611 w611VarQ;
        int i5;
        boolean z6;
        w611 w611Var4;
        int size4;
        int iM2;
        RecyclerView recyclerView = this.h;
        s611 s611Var = recyclerView.H1;
        if (i < 0 || i >= s611Var.b()) {
            StringBuilder sbQ = cy30.q(i, i, "Invalid item position ", "(", "). Item count:");
            sbQ.append(s611Var.b());
            sbQ.append(recyclerView.G());
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
        if (s611Var.g) {
            ArrayList arrayList4 = this.b;
            if (arrayList4 != null && (size4 = arrayList4.size()) != 0) {
                int i6 = 0;
                while (true) {
                    if (i6 >= size4) {
                        if (recyclerView.P0.b && (iM2 = recyclerView.e.m(i)) > 0 && iM2 < recyclerView.P0.e()) {
                            long jF = recyclerView.P0.f(iM2);
                            int i7 = 0;
                            while (true) {
                                if (i7 >= size4) {
                                    w611VarC = null;
                                    break;
                                }
                                w611 w611Var5 = (w611) this.b.get(i7);
                                if (!w611Var5.D() && w611Var5.e == jF) {
                                    w611Var5.j(32);
                                    w611VarC = w611Var5;
                                    break;
                                }
                                i7++;
                            }
                        } else {
                            w611VarC = null;
                            break;
                        }
                    } else {
                        w611VarC = (w611) this.b.get(i6);
                        if (!w611VarC.D() && w611VarC.o() == i) {
                            w611VarC.j(32);
                            break;
                        }
                        i6++;
                    }
                }
            } else {
                w611VarC = null;
                break;
            }
            if (w611VarC != null) {
                z = true;
            }
            arrayList = this.a;
            arrayList2 = this.c;
            if (w611VarC == null) {
                size = arrayList.size();
                i2 = 0;
                while (true) {
                    if (i2 < size) {
                        arrayList3 = recyclerView.f.c;
                        size2 = arrayList3.size();
                        i3 = 0;
                        while (true) {
                            if (i3 < size2) {
                                z2 = true;
                                view2 = null;
                                break;
                            }
                            view2 = (View) arrayList3.get(i3);
                            w611VarQ = vqv0.q(view2);
                            z2 = true;
                            if (w611VarQ.o() != i && !w611VarQ.t() && !w611VarQ.v()) {
                                break;
                            }
                            i3++;
                        }
                        if (view2 != null) {
                            size3 = arrayList2.size();
                            i4 = 0;
                            while (true) {
                                if (i4 < size3) {
                                    w611VarC = null;
                                    break;
                                }
                                w611Var3 = (w611) arrayList2.get(i4);
                                if (w611Var3.t() && w611Var3.o() == i && !w611Var3.r()) {
                                    arrayList2.remove(i4);
                                    if (RecyclerView.c2) {
                                        w611Var3.toString();
                                    }
                                    w611VarC = w611Var3;
                                    break;
                                }
                                i4++;
                            }
                        } else {
                            w611VarU = RecyclerView.U(view2);
                            p0gVar = recyclerView.f;
                            o0gVar = p0gVar.b;
                            iR = p0gVar.a.r(view2);
                            if (iR >= 0) {
                                hhg1.g(view2, "view is not a child, cannot hide ");
                                return null;
                            }
                            if (o0gVar.C(iR)) {
                                throw new RuntimeException("trying to unhide a view that was not hidden" + view2);
                            }
                            o0gVar.y(iR);
                            p0gVar.g(view2);
                            iE = recyclerView.f.e(view2);
                            if (iE != -1) {
                                StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                                sb.append(w611VarU);
                                bhn0.h(recyclerView.G(), sb);
                                return null;
                            }
                            p0g p0gVar2 = recyclerView.f;
                            int iD = p0gVar2.d(iE);
                            p0gVar2.b.L(iD);
                            p0gVar2.a.l(iD);
                            k(view2);
                            w611VarU.j(8224);
                            w611VarC = w611VarU;
                            break;
                        }
                    } else {
                        w611Var4 = (w611) arrayList.get(i2);
                        if (w611Var4.D() && w611Var4.o() == i && !w611Var4.t() && (s611Var.g || !w611Var4.v())) {
                            w611Var4.j(32);
                            w611VarC = w611Var4;
                            z2 = true;
                            break;
                        }
                        i2++;
                    }
                }
                if (w611VarC != null) {
                    if (w611VarC.v()) {
                        i5 = w611VarC.c;
                        if (i5 >= 0 || i5 >= recyclerView.P0.e()) {
                            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + w611VarC + recyclerView.G());
                        }
                        if (s611Var.g || recyclerView.P0.g(w611VarC.c) == w611VarC.f) {
                            z511 z511Var = recyclerView.P0;
                            if (!z511Var.b || w611VarC.e == z511Var.f(w611VarC.c)) {
                                z6 = z2;
                            } else {
                                z6 = false;
                            }
                        } else {
                            z6 = false;
                        }
                    } else {
                        if (!RecyclerView.b2 && !s611Var.g) {
                            eg.m("should not receive a removed view unless it is pre layout".concat(recyclerView.G()));
                            return null;
                        }
                        z6 = s611Var.g;
                    }
                    if (z6) {
                        z = z2;
                    } else {
                        w611VarC.j(4);
                        if (w611VarC.w()) {
                            recyclerView.removeDetachedView(w611VarC.a, false);
                            w611VarC.N0.n(w611VarC);
                        } else if (w611VarC.D()) {
                            w611VarC.t &= -33;
                        }
                        j(w611VarC);
                        w611VarC = null;
                    }
                }
            } else {
                z2 = true;
            }
            if (w611VarC == null) {
                iM = recyclerView.e.m(i);
                if (iM >= 0 || iM >= recyclerView.P0.e()) {
                    StringBuilder sbQ2 = cy30.q(i, iM, "Inconsistency detected. Invalid item position ", "(offset:", ").state:");
                    sbQ2.append(s611Var.b());
                    sbQ2.append(recyclerView.G());
                    throw new IndexOutOfBoundsException(sbQ2.toString());
                }
                int iG = recyclerView.P0.g(iM);
                z511 z511Var2 = recyclerView.P0;
                if (z511Var2.b) {
                    long jF2 = z511Var2.f(iM);
                    int size5 = arrayList.size() - 1;
                    while (true) {
                        if (size5 < 0) {
                            int size6 = arrayList2.size() - 1;
                            while (true) {
                                if (size6 >= 0) {
                                    w611 w611Var6 = (w611) arrayList2.get(size6);
                                    if (w611Var6.e != jF2 || w611Var6.r()) {
                                        size6--;
                                    } else {
                                        if (iG == w611Var6.f) {
                                            arrayList2.remove(size6);
                                            w611VarC = w611Var6;
                                            break;
                                        }
                                        h(size6);
                                    }
                                }
                                w611VarC = null;
                                break;
                            }
                        }
                        w611 w611Var7 = (w611) arrayList.get(size5);
                        RecyclerView recyclerView2 = recyclerView;
                        long j2 = w611Var7.e;
                        View view3 = w611Var7.a;
                        if (j2 != jF2 || w611Var7.D()) {
                            recyclerView = recyclerView2;
                        } else {
                            if (iG == w611Var7.f) {
                                w611Var7.j(32);
                                if (w611Var7.v() && !s611Var.g) {
                                    w611Var7.t = (w611Var7.t & (-15)) | 2;
                                }
                                w611VarC = w611Var7;
                                recyclerView = recyclerView2;
                                break;
                            }
                            arrayList.remove(size5);
                            recyclerView = recyclerView2;
                            recyclerView.removeDetachedView(view3, false);
                            w611 w611VarU2 = RecyclerView.U(view3);
                            w611VarU2.N0 = null;
                            w611VarU2.O0 = false;
                            w611VarU2.t &= -33;
                            j(w611VarU2);
                        }
                        size5--;
                    }
                    if (w611VarC != null) {
                        w611VarC.c = iM;
                        z = z2;
                    }
                }
                if (w611VarC == null) {
                    boolean z7 = RecyclerView.b2;
                    l611 l611Var = (l611) c().a.get(iG);
                    if (l611Var == null) {
                        w611Var2 = null;
                        break;
                    }
                    ArrayList arrayList5 = l611Var.a;
                    if (!arrayList5.isEmpty()) {
                        int size7 = arrayList5.size() - 1;
                        while (true) {
                            if (size7 < 0) {
                                w611Var2 = null;
                                break;
                            }
                            if (!((w611) arrayList5.get(size7)).r()) {
                                w611Var2 = (w611) arrayList5.remove(size7);
                                break;
                            }
                            size7--;
                        }
                    } else {
                        w611Var2 = null;
                        break;
                    }
                    if (w611Var2 != null) {
                        w611Var2.A();
                        boolean z8 = RecyclerView.b2;
                    }
                    w611VarC = w611Var2;
                }
                if (w611VarC == null) {
                    long nanoTime = recyclerView.getNanoTime();
                    if (j != Long.MAX_VALUE) {
                        long j3 = this.g.a(iG).c;
                        if (j3 != 0 && j3 + nanoTime >= j) {
                            return null;
                        }
                    }
                    w611VarC = recyclerView.P0.c(iG, recyclerView);
                    if (RecyclerView.h2 && (recyclerViewM = RecyclerView.M(w611VarC.a)) != null) {
                        w611VarC.b = new WeakReference(recyclerViewM);
                    }
                    long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                    l611 l611VarA = this.g.a(iG);
                    long j4 = l611VarA.c;
                    if (j4 != 0) {
                        nanoTime2 = (nanoTime2 / 4) + ((j4 / 4) * 3);
                    }
                    l611VarA.c = nanoTime2;
                }
            }
            z3 = z;
            view = w611VarC.a;
            if (z3 || s611Var.g) {
                z4 = false;
            } else {
                int i8 = w611VarC.t;
                if ((i8 & 8192) != 0) {
                    w611VarC.t = i8 & (-8193);
                    if (s611Var.j) {
                        e611.b(w611VarC);
                        e611 e611Var = recyclerView.p1;
                        w611VarC.p();
                        e611Var.getClass();
                        z4 = false;
                        f3a f3aVar = new f3a(false);
                        f3aVar.m(w611VarC);
                        recyclerView.k0(w611VarC, f3aVar);
                    } else {
                        z4 = false;
                    }
                } else {
                    z4 = false;
                }
            }
            if (s611Var.g || !w611VarC.s()) {
                if (w611VarC.s() || (w611VarC.t & 2) != 0 || w611VarC.t()) {
                    if (!RecyclerView.b2 && w611VarC.v()) {
                        StringBuilder sb2 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                        sb2.append(w611VarC);
                        bhn0.h(recyclerView.G(), sb2);
                        return null;
                    }
                    w611Var = w611VarC;
                    zL = l(w611Var, recyclerView.e.m(i), i, j);
                }
                layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    g611Var = (g611) recyclerView.generateDefaultLayoutParams();
                    view.setLayoutParams(g611Var);
                } else if (recyclerView.checkLayoutParams(layoutParams)) {
                    g611Var = (g611) layoutParams;
                } else {
                    g611Var = (g611) recyclerView.generateLayoutParams(layoutParams);
                    view.setLayoutParams(g611Var);
                }
                g611Var.a = w611Var;
                if (z3 || !zL) {
                    z5 = z4;
                } else {
                    z5 = z2;
                }
                g611Var.d = z5;
                return w611Var;
            }
            w611VarC.g = i;
            zL = z4;
            w611Var = w611VarC;
            layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                g611Var = (g611) recyclerView.generateDefaultLayoutParams();
                view.setLayoutParams(g611Var);
            } else if (recyclerView.checkLayoutParams(layoutParams)) {
                g611Var = (g611) recyclerView.generateLayoutParams(layoutParams);
                view.setLayoutParams(g611Var);
            } else {
                g611Var = (g611) layoutParams;
            }
            g611Var.a = w611Var;
            if (z3) {
                z5 = z4;
            } else {
                z5 = z4;
            }
            g611Var.d = z5;
            return w611Var;
        }
        w611VarC = null;
        z = false;
        arrayList = this.a;
        arrayList2 = this.c;
        if (w611VarC == null) {
            size = arrayList.size();
            i2 = 0;
            while (true) {
                if (i2 < size) {
                    arrayList3 = recyclerView.f.c;
                    size2 = arrayList3.size();
                    i3 = 0;
                    while (true) {
                        if (i3 < size2) {
                            z2 = true;
                            view2 = null;
                            break;
                        }
                        view2 = (View) arrayList3.get(i3);
                        w611VarQ = vqv0.q(view2);
                        z2 = true;
                        if (w611VarQ.o() != i) {
                        }
                        i3++;
                    }
                    if (view2 != null) {
                        size3 = arrayList2.size();
                        i4 = 0;
                        while (true) {
                            if (i4 < size3) {
                                w611VarC = null;
                                break;
                            }
                            w611Var3 = (w611) arrayList2.get(i4);
                            if (w611Var3.t()) {
                            }
                            i4++;
                        }
                    } else {
                        w611VarU = RecyclerView.U(view2);
                        p0gVar = recyclerView.f;
                        o0gVar = p0gVar.b;
                        iR = p0gVar.a.r(view2);
                        if (iR >= 0) {
                            hhg1.g(view2, "view is not a child, cannot hide ");
                            return null;
                        }
                        if (o0gVar.C(iR)) {
                            throw new RuntimeException("trying to unhide a view that was not hidden" + view2);
                        }
                        o0gVar.y(iR);
                        p0gVar.g(view2);
                        iE = recyclerView.f.e(view2);
                        if (iE != -1) {
                            StringBuilder sb3 = new StringBuilder("layout index should not be -1 after unhiding a view:");
                            sb3.append(w611VarU);
                            bhn0.h(recyclerView.G(), sb3);
                            return null;
                        }
                        p0g p0gVar3 = recyclerView.f;
                        int iD2 = p0gVar3.d(iE);
                        p0gVar3.b.L(iD2);
                        p0gVar3.a.l(iD2);
                        k(view2);
                        w611VarU.j(8224);
                        w611VarC = w611VarU;
                        break;
                    }
                } else {
                    w611Var4 = (w611) arrayList.get(i2);
                    if (w611Var4.D()) {
                    }
                    i2++;
                }
            }
            if (w611VarC != null) {
                if (w611VarC.v()) {
                    i5 = w611VarC.c;
                    if (i5 >= 0) {
                    }
                    throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + w611VarC + recyclerView.G());
                }
                if (!RecyclerView.b2) {
                }
                z6 = s611Var.g;
                if (z6) {
                    w611VarC.j(4);
                    if (w611VarC.w()) {
                        recyclerView.removeDetachedView(w611VarC.a, false);
                        w611VarC.N0.n(w611VarC);
                    } else if (w611VarC.D()) {
                        w611VarC.t &= -33;
                    }
                    j(w611VarC);
                    w611VarC = null;
                } else {
                    z = z2;
                }
            }
        } else {
            z2 = true;
        }
        if (w611VarC == null) {
            iM = recyclerView.e.m(i);
            if (iM >= 0) {
            }
            StringBuilder sbQ3 = cy30.q(i, iM, "Inconsistency detected. Invalid item position ", "(offset:", ").state:");
            sbQ3.append(s611Var.b());
            sbQ3.append(recyclerView.G());
            throw new IndexOutOfBoundsException(sbQ3.toString());
        }
        z3 = z;
        view = w611VarC.a;
        if (z3) {
            z4 = false;
        } else {
            z4 = false;
        }
        if (s611Var.g) {
            if (w611VarC.s()) {
            }
            if (!RecyclerView.b2) {
            }
            w611Var = w611VarC;
            zL = l(w611Var, recyclerView.e.m(i), i, j);
        } else {
            if (w611VarC.s()) {
            }
            if (!RecyclerView.b2) {
            }
            w611Var = w611VarC;
            zL = l(w611Var, recyclerView.e.m(i), i, j);
        }
        layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            g611Var = (g611) recyclerView.generateDefaultLayoutParams();
            view.setLayoutParams(g611Var);
        } else if (recyclerView.checkLayoutParams(layoutParams)) {
            g611Var = (g611) recyclerView.generateLayoutParams(layoutParams);
            view.setLayoutParams(g611Var);
        } else {
            g611Var = (g611) layoutParams;
        }
        g611Var.a = w611Var;
        if (z3) {
            z5 = z4;
        } else {
            z5 = z4;
        }
        g611Var.d = z5;
        return w611Var;
    }

    public final void n(w611 w611Var) {
        if (w611Var.O0) {
            this.b.remove(w611Var);
        } else {
            this.a.remove(w611Var);
        }
        w611Var.N0 = null;
        w611Var.O0 = false;
        w611Var.t &= -33;
    }

    public final void o() {
        a aVar = this.h.Q0;
        this.f = this.e + (aVar != null ? aVar.X : 0);
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f; size--) {
            h(size);
        }
    }
}
