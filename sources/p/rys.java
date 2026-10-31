package p;

import android.content.Context;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.util.SparseArray;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rys implements us40 {
    public final z8c0 a;
    public final hym0 b;
    public final bnj0 c;
    public final k9r d;
    public final roj1 e;
    public boolean g;
    public x8h l;
    public EGLDisplay m;
    public EGLSurface n;
    public int o = -1;
    public final SparseArray f = new SparseArray();
    public final dfe1 h = new dfe1(1, false);
    public final v4f0 i = new v4f0(1);
    public final v4f0 j = new v4f0(1);
    public m9x0 k = m9x0.W0;

    public rys(Context context, bnj0 bnj0Var, ScheduledExecutorService scheduledExecutorService, z8c0 z8c0Var, hym0 hym0Var) {
        this.a = z8c0Var;
        this.b = hym0Var;
        this.c = bnj0Var;
        this.d = new k9r(context);
        roj1 roj1Var = new roj1(scheduledExecutorService, false, new thn(z8c0Var, (byte) 9));
        this.e = roj1Var;
        roj1Var.f(new mys(this, (byte) 1), true);
    }

    public final synchronized bg11 a() {
        if (this.h.d() == 0) {
            w280 w280Var = b380.b;
            return bg11.e;
        }
        for (int i = 0; i < this.f.size(); i++) {
            if (((qys) this.f.valueAt(i)).a.isEmpty()) {
                w280 w280Var2 = b380.b;
                return bg11.e;
            }
        }
        v280 v280Var = new v280(4);
        pys pysVar = (pys) ((qys) this.f.get(this.o)).a.element();
        v280Var.c(pysVar);
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            if (this.f.keyAt(i2) != this.o) {
                qys qysVar = (qys) this.f.valueAt(i2);
                if (qysVar.a.size() == 1 && !qysVar.b) {
                    w280 w280Var3 = b380.b;
                    return bg11.e;
                }
                Iterator it = qysVar.a.iterator();
                long j = Long.MAX_VALUE;
                pys pysVar2 = null;
                while (it.hasNext()) {
                    pys pysVar3 = (pys) it.next();
                    long j2 = pysVar3.b.b;
                    long jAbs = Math.abs(j2 - pysVar.b.b);
                    if (jAbs < j) {
                        pysVar2 = pysVar3;
                        j = jAbs;
                    }
                    if (j2 > pysVar.b.b || (!it.hasNext() && qysVar.b)) {
                        pysVar2.getClass();
                        v280Var.c(pysVar2);
                        break;
                    }
                }
            }
        }
        bg11 bg11VarG = v280Var.g();
        if (bg11VarG.d == this.f.size()) {
            return bg11VarG;
        }
        w280 w280Var4 = b380.b;
        return bg11.e;
    }

    public final synchronized void b() {
        try {
            bg11 bg11VarA = a();
            if (bg11VarA.isEmpty()) {
                return;
            }
            pys pysVar = (pys) bg11VarA.get(this.o);
            n3p1.j(4, "initialCapacity");
            Object[] objArrCopyOf = new Object[4];
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i2 < bg11VarA.d) {
                ss40 ss40Var = ((pys) bg11VarA.get(i2)).b.a;
                l291 l291Var = new l291(ss40Var.c, ss40Var.d);
                int i4 = i3 + 1;
                int iB = o280.b(objArrCopyOf.length, i4);
                if (iB > objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iB);
                }
                objArrCopyOf[i3] = l291Var;
                i2++;
                i3 = i4;
            }
            m9x0 m9x0Var = this.k;
            bg11 bg11VarL = b380.l(i3, objArrCopyOf);
            m9x0Var.getClass();
            l291 l291Var2 = (l291) bg11VarL.get(0);
            this.h.c(this.c, l291Var2.a, l291Var2.b);
            ss40 ss40VarF = this.h.f();
            long j = pysVar.b.b;
            this.i.a(j);
            n3p1.j(4, "initialCapacity");
            Object[] objArrCopyOf2 = new Object[4];
            int i5 = 0;
            while (i < bg11VarA.d) {
                is40 is40Var = new is40(((pys) bg11VarA.get(i)).b.a, ((pys) bg11VarA.get(i)).c);
                int i6 = i5 + 1;
                int iB2 = o280.b(objArrCopyOf2.length, i6);
                if (iB2 > objArrCopyOf2.length) {
                    objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, iB2);
                }
                objArrCopyOf2[i5] = is40Var;
                i++;
                i5 = i6;
            }
            this.d.o(b380.l(i5, objArrCopyOf2), ss40VarF);
            this.j.a(fn31.F());
            this.b.b(this, ss40VarF, j);
            qys qysVar = (qys) this.f.get(this.o);
            f(qysVar, 1);
            c();
            if (this.g && qysVar.a.isEmpty()) {
                this.a.j();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        for (int i = 0; i < this.f.size(); i++) {
            if (this.f.keyAt(i) != this.o) {
                d((qys) this.f.valueAt(i));
            }
        }
    }

    public final synchronized void d(qys qysVar) {
        int iZ;
        qys qysVar2 = (qys) this.f.get(this.o);
        if (qysVar2.a.isEmpty() && qysVar2.b) {
            f(qysVar, qysVar.a.size());
            return;
        }
        pys pysVar = (pys) qysVar2.a.peek();
        final long j = pysVar != null ? pysVar.b.b : -9223372036854775807L;
        Collection wn90Var = new wn90(qysVar.a, new omv0() { // from class: p.oys
            public final boolean apply(Object obj) {
                return ((pys) obj).b.b <= j;
            }
        }, (byte) 0);
        if (wn90Var instanceof Collection) {
            iZ = wn90Var.size();
        } else {
            ao90 it = wn90Var.iterator();
            long j2 = 0;
            while (true) {
                ao90 ao90Var = it;
                if (!ao90Var.hasNext()) {
                    break;
                }
                ao90Var.next();
                j2++;
            }
            iZ = bmq0.Z(j2);
        }
        f(qysVar, Math.max(iZ - 1, 0));
    }

    @Override // p.us40
    public final void e(long j) {
        this.e.f(new nys(this, j, (byte) 0), true);
    }

    public final synchronized void f(qys qysVar, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            pys pysVar = (pys) qysVar.a.remove();
            pysVar.a.e(pysVar.b.b);
        }
    }
}
