package p;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class d440 implements Runnable {
    public static final ThreadLocal e = new ThreadLocal();
    public static final cvt f = new cvt((byte) 10);
    public ArrayList a;
    public long b;
    public long c;
    public ArrayList d;

    public static w611 c(RecyclerView recyclerView, int i, long j) {
        int iP = recyclerView.f.a.p();
        for (int i2 = 0; i2 < iP; i2++) {
            w611 w611VarU = RecyclerView.U(recyclerView.f.a.o(i2));
            if (w611VarU.c == i && !w611VarU.t()) {
                return null;
            }
        }
        n611 n611Var = recyclerView.c;
        try {
            recyclerView.c0();
            w611 w611VarM = n611Var.m(i, j);
            if (w611VarM != null) {
                if (!w611VarM.s() || w611VarM.t()) {
                    n611Var.a(w611VarM, false);
                } else {
                    n611Var.i(w611VarM.a);
                }
            }
            return w611VarM;
        } finally {
            recyclerView.d0(false);
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.V0) {
            if (RecyclerView.b2 && !this.a.contains(recyclerView)) {
                eg.m("attempting to post unregistered view!");
                return;
            } else if (this.b == 0) {
                this.b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        recyclerView.G1.r(i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00ca  */
    public final void b(long j) {
        c440 c440Var;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        c440 c440Var2;
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i2);
            int windowVisibility = recyclerView3.getWindowVisibility();
            a9a a9aVar = recyclerView3.G1;
            if (windowVisibility == 0) {
                a9aVar.j(recyclerView3, false);
                i += a9aVar.d;
            }
        }
        arrayList.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList2.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                a9a a9aVar2 = recyclerView4.G1;
                int iAbs = Math.abs(a9aVar2.c) + Math.abs(a9aVar2.b);
                for (int i5 = 0; i5 < a9aVar2.d * 2; i5 += 2) {
                    if (i3 >= arrayList.size()) {
                        c440Var2 = new c440();
                        arrayList.add(c440Var2);
                    } else {
                        c440Var2 = (c440) arrayList.get(i3);
                    }
                    int[] iArr = (int[]) a9aVar2.e;
                    int i6 = iArr[i5 + 1];
                    c440Var2.a = i6 <= iAbs;
                    c440Var2.b = iAbs;
                    c440Var2.c = i6;
                    c440Var2.d = recyclerView4;
                    c440Var2.e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList, f);
        for (int i7 = 0; i7 < arrayList.size() && (recyclerView = (c440Var = (c440) arrayList.get(i7)).d) != null; i7++) {
            w611 w611VarC = c(recyclerView, c440Var.e, c440Var.a ? Long.MAX_VALUE : j);
            if (w611VarC != null && w611VarC.b != null && w611VarC.s() && !w611VarC.t() && (recyclerView2 = (RecyclerView) w611VarC.b.get()) != null) {
                if (recyclerView2.g1 && recyclerView2.f.a.p() != 0) {
                    n611 n611Var = recyclerView2.c;
                    e611 e611Var = recyclerView2.p1;
                    if (e611Var != null) {
                        e611Var.g();
                    }
                    a aVar = recyclerView2.Q0;
                    if (aVar != null) {
                        aVar.B0(n611Var);
                        recyclerView2.Q0.C0(n611Var);
                    }
                    n611Var.a.clear();
                    n611Var.g();
                }
                a9a a9aVar3 = recyclerView2.G1;
                a9aVar3.j(recyclerView2, true);
                if (a9aVar3.d != 0) {
                    try {
                        int i8 = pif1.a;
                        Trace.beginSection("RV Nested Prefetch");
                        s611 s611Var = recyclerView2.H1;
                        z511 z511Var = recyclerView2.P0;
                        s611Var.d = (byte) 1;
                        s611Var.e = z511Var.e();
                        s611Var.g = false;
                        s611Var.h = false;
                        s611Var.i = false;
                        for (int i9 = 0; i9 < a9aVar3.d * 2; i9 += 2) {
                            c(recyclerView2, ((int[]) a9aVar3.e)[i9], j);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        int i10 = pif1.a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            c440Var.a();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.a;
        try {
            int i = pif1.a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i2);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.c);
                }
            }
            this.b = 0L;
        } finally {
            this.b = 0L;
            int i3 = pif1.a;
            Trace.endSection();
        }
    }
}
