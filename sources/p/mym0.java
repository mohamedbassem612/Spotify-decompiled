package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.SparseArray;
import android.view.Surface;
import androidx.media3.common.VideoFrameProcessingException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mym0 implements npj1 {
    public final Context a;
    public final x8h b;
    public final bnj0 c;
    public final mpj1 d;
    public final Executor e;
    public final ScheduledExecutorService g;
    public final yys h;
    public final ArrayDeque i;
    public final SparseArray j;
    public final boolean k;
    public List l;
    public m9x0 m;
    public azs n;
    public rys o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public l291 f97p;
    public boolean q;
    public boolean r;
    public volatile boolean t;
    public long s = -9223372036854775807L;
    public final SparseArray f = new SparseArray();

    public mym0(Context context, yys yysVar, x8h x8hVar, mpj1 mpj1Var, Executor executor, boolean z) {
        this.a = context;
        this.b = x8hVar;
        this.d = mpj1Var;
        this.e = executor;
        this.k = z;
        String str = zoi1.a;
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new ask("Effect:MultipleInputVideoGraph:Thread", (byte) 2));
        this.g = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        bnj0 bnj0Var = new bnj0();
        this.c = bnj0Var;
        yys yysVarA = yysVar.a();
        yysVarA.b = bnj0Var;
        yysVarA.c = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.h = new yys(!yysVarA.a, bnj0Var, scheduledExecutorServiceNewSingleThreadScheduledExecutor, yysVarA.d, yysVarA.e, yysVarA.f, yysVarA.g);
        this.i = new ArrayDeque();
        this.j = new SparseArray();
        this.f97p = l291.c;
        w280 w280Var = b380.b;
        this.l = bg11.e;
        this.m = m9x0.W0;
    }

    public final voj1 a(int i) {
        String str = zoi1.a;
        SparseArray sparseArray = this.f;
        dm5.y(sparseArray.indexOfKey(i) >= 0);
        return (voj1) sparseArray.get(i);
    }

    @Override // p.npj1
    public final void b() {
        throw new UnsupportedOperationException();
    }

    @Override // p.npj1
    public final boolean c(int i) {
        return ((azs) a(i)).g();
    }

    @Override // p.npj1
    public final boolean d(int i, Bitmap bitmap, rgl rglVar) {
        return ((azs) a(i)).f(bitmap, rglVar);
    }

    @Override // p.npj1
    public final void e(List list) {
        this.l = list;
    }

    @Override // p.npj1
    public final Surface f(int i) {
        SparseArray sparseArray = ((azs) a(i)).f.g;
        String str = zoi1.a;
        dm5.y(sparseArray.indexOfKey(1) >= 0);
        return ((yj80) sparseArray.get(1)).a.r();
    }

    @Override // p.npj1
    public final void flush() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f;
            if (i >= sparseArray.size()) {
                return;
            }
            ((azs) ((voj1) sparseArray.get(sparseArray.keyAt(i)))).e();
            i++;
        }
    }

    @Override // p.npj1
    public final void g(long j) {
        azs azsVar = this.n;
        azsVar.getClass();
        dm5.z(!azsVar.j, "Calling this method is not allowed when renderFramesAutomatically is enabled");
        azsVar.g.g(new nys(azsVar, j, (byte) 1));
    }

    @Override // p.npj1
    public final void h(m9x0 m9x0Var) {
        this.m = m9x0Var;
        rys rysVar = this.o;
        if (rysVar != null) {
            rysVar.k = m9x0Var;
        }
    }

    @Override // p.npj1
    public final boolean i() {
        return this.t;
    }

    @Override // p.npj1
    public final void j() throws VideoFrameProcessingException {
        dm5.y(this.f.size() == 0 && this.o == null && this.n == null && !this.r);
        azs azsVarB = this.h.b(this.a, this.b, this.k, l5u.a, new yfc0((Object) this, (byte) 20));
        this.n = azsVarB;
        hym0 hym0Var = new hym0(this);
        SparseArray sparseArray = azsVarB.f.g;
        dm5.y(sparseArray.indexOfKey(3) >= 0);
        ((yj80) sparseArray.get(3)).a.J(hym0Var);
        rys rysVar = new rys(this.a, this.c, this.g, new z8c0(this, (byte) 20), new hym0(this));
        this.o = rysVar;
        rysVar.k = this.m;
    }

    @Override // p.npj1
    public final int k(int i) {
        o5 o5Var = ((azs) a(i)).f.j;
        if (o5Var != null) {
            return o5Var.t();
        }
        return 0;
    }

    @Override // p.npj1
    public final void l(int i) {
        SparseArray sparseArray = this.f;
        String str = zoi1.a;
        dm5.y(!(sparseArray.indexOfKey(i) >= 0));
        rys rysVar = this.o;
        rysVar.getClass();
        synchronized (rysVar) {
            dm5.y(!zoi1.l(rysVar.f, i));
            rysVar.f.put(i, new qys());
            if (rysVar.o == -1) {
                rysVar.o = i;
            }
        }
        yys yysVarA = this.h.a();
        mp5 mp5Var = new mp5((Object) this, i, (byte) 7);
        yysVarA.d = mp5Var;
        yysVarA.e = (byte) 2;
        this.f.put(i, new yys(!yysVarA.a, yysVarA.b, yysVarA.c, mp5Var, 2, yysVarA.f, yysVarA.g).b(this.a, this.b, true, this.e, new sw9(this, i, (byte) 22)));
    }

    @Override // p.npj1
    public final void m(o3d1 o3d1Var) {
        azs azsVar = this.n;
        azsVar.getClass();
        azsVar.j(o3d1Var);
    }

    @Override // p.npj1
    public final void n(int i) {
        ((azs) a(i)).k();
    }

    @Override // p.npj1
    public final void o(int i, int i2, ie30 ie30Var, List list, long j) {
        ((azs) a(i)).h(i2, j, list, ie30Var);
    }

    public final void p() {
        ype1 ype1Var = (ype1) this.i.peek();
        if (ype1Var == null) {
            return;
        }
        azs azsVar = this.n;
        azsVar.getClass();
        ss40 ss40Var = ype1Var.a;
        int i = ss40Var.c;
        int i2 = ss40Var.d;
        l291 l291Var = this.f97p;
        if (i != l291Var.a || i2 != l291Var.b) {
            ge30 ge30Var = new ge30();
            ge30Var.G = this.b;
            ge30Var.v = i;
            ge30Var.w = i2;
            azsVar.h(3, 0L, this.l, new ie30(ge30Var));
            this.f97p = new l291(i, i2);
        }
        int i3 = ype1Var.a.a;
        long j = ype1Var.b;
        dm5.y(!azsVar.w);
        if (!azsVar.m.e() || azsVar.x) {
            return;
        }
        o5 o5Var = azsVar.f.j;
        o5Var.getClass();
        o5Var.C(i3, j);
        this.i.remove();
        if (this.q && this.i.isEmpty()) {
            azsVar.k();
        }
    }

    @Override // p.npj1
    public final void release() {
        if (this.r) {
            return;
        }
        byte b = 0;
        for (int i = 0; i < this.f.size(); i++) {
            SparseArray sparseArray = this.f;
            ((azs) ((voj1) sparseArray.get(sparseArray.keyAt(i)))).i();
        }
        rys rysVar = this.o;
        if (rysVar != null) {
            synchronized (rysVar) {
                try {
                    rysVar.e.e(new mys(rysVar, b));
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw new IllegalStateException(e);
                }
            }
            this.o = null;
        }
        azs azsVar = this.n;
        if (azsVar != null) {
            azsVar.i();
            this.n = null;
        }
        this.g.submit(new gv40(this, (byte) 22));
        this.g.shutdown();
        try {
            this.g.awaitTermination(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            oon1.v("Thread interrupted while waiting for executor service termination");
        }
        this.r = true;
    }
}
