package p;

import io.reactivex.rxjava3.core.Flowable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class x8h1 {
    public final qb00 a;
    public final b6h1 b;
    public final y8h1 c;
    public final ArrayList d = new ArrayList();
    public int e = 1;

    public x8h1(qb00 qb00Var, Flowable flowable, b6h1 b6h1Var, y8h1 y8h1Var) {
        this.a = qb00Var;
        this.b = b6h1Var;
        this.c = y8h1Var;
        flowable.subscribe(new z2a1(this, (byte) 24), wx91.h);
    }

    public final void a(w8h1 w8h1Var) {
        boolean z;
        ((qgz) this.b.a(w8h1Var.a)).b("UbiPageViewsProcessor", "transformAndPublishNonAuthPageView", f4i1.f("page view: ", w8h1Var.b.b.a, "}"));
        y8h1 y8h1Var = this.c;
        synchronized (y8h1Var.a) {
            z = y8h1Var.b;
        }
        if (z) {
            w8h1Var.c = null;
            synchronized (y8h1Var.a) {
                y8h1Var.b = false;
            }
        }
        this.a.c(w8h1Var);
    }

    public final void b(w8h1 w8h1Var) {
        boolean z;
        boolean z2;
        qgz qgzVar = (qgz) this.b.a(w8h1Var.a);
        String str = w8h1Var.b.b.a;
        y8h1 y8h1Var = this.c;
        synchronized (y8h1Var.a) {
            z = y8h1Var.b;
        }
        qgzVar.b("UbiPageViewsProcessor", "transformAndPublishPageView", "page view: " + str + ", isFirstPageView: " + z);
        synchronized (y8h1Var.a) {
            z2 = y8h1Var.b;
        }
        if (z2) {
            w8h1Var.c = null;
            synchronized (y8h1Var.a) {
                y8h1Var.b = false;
            }
        }
        this.a.d(w8h1Var);
    }
}
