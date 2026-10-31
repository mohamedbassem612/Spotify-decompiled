package p;

import android.media.ImageReader;
import android.util.LongSparseArray;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ekj0 implements ry70, xe30 {
    public int X;
    public final ArrayList Y;
    public final ArrayList Z;
    public final Object a;
    public final dkj0 b;
    public int c;
    public final c8d0 d;
    public boolean e;
    public final oi f;
    public qy70 g;
    public Executor h;
    public final LongSparseArray i;
    public final LongSparseArray t;

    public ekj0(int i, int i2, int i3, int i4) {
        oi oiVar = new oi(ImageReader.newInstance(i, i2, i3, i4));
        this.a = new Object();
        this.b = new dkj0(this, (byte) 0);
        this.c = 0;
        this.d = new c8d0(this, (byte) 28);
        this.e = false;
        this.i = new LongSparseArray();
        this.t = new LongSparseArray();
        this.Z = new ArrayList();
        this.f = oiVar;
        this.X = 0;
        this.Y = new ArrayList(h());
    }

    @Override // p.xe30
    public final void a(ye30 ye30Var) {
        synchronized (this.a) {
            b(ye30Var);
        }
    }

    public final void b(ye30 ye30Var) {
        synchronized (this.a) {
            try {
                int iIndexOf = this.Y.indexOf(ye30Var);
                if (iIndexOf >= 0) {
                    this.Y.remove(iIndexOf);
                    int i = this.X;
                    if (iIndexOf <= i) {
                        this.X = i - 1;
                    }
                }
                this.Z.remove(ye30Var);
                if (this.c > 0) {
                    i(this.f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zx70 c() {
        synchronized (this.a) {
            try {
                if (this.Y.isEmpty()) {
                    return null;
                }
                if (this.X >= this.Y.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < this.Y.size() - 1; i++) {
                    if (!this.Z.contains(this.Y.get(i))) {
                        arrayList.add((zx70) this.Y.get(i));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((zx70) it.next()).close();
                }
                int size = this.Y.size();
                ArrayList arrayList2 = this.Y;
                this.X = size;
                zx70 zx70Var = (zx70) arrayList2.get(size - 1);
                this.Z.add(zx70Var);
                return zx70Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void close() {
        synchronized (this.a) {
            try {
                if (this.e) {
                    return;
                }
                Iterator it = new ArrayList(this.Y).iterator();
                while (it.hasNext()) {
                    ((zx70) it.next()).close();
                }
                this.Y.clear();
                this.f.close();
                this.e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int d() {
        int iD;
        synchronized (this.a) {
            iD = this.f.d();
        }
        return iD;
    }

    public final void e() {
        synchronized (this.a) {
            this.f.e();
            this.g = null;
            this.h = null;
            this.c = 0;
        }
    }

    public final void f(fm61 fm61Var) {
        qy70 qy70Var;
        Executor executor;
        synchronized (this.a) {
            try {
                if (this.Y.size() < h()) {
                    fm61Var.a(this);
                    this.Y.add(fm61Var);
                    qy70Var = this.g;
                    executor = this.h;
                } else {
                    j2h1.o("TAG");
                    fm61Var.close();
                    qy70Var = null;
                    executor = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (qy70Var != null) {
            if (executor != null) {
                executor.execute(new zyh0(this, qy70Var, (byte) 7));
            } else {
                qy70Var.e(this);
            }
        }
    }

    public final void g(qy70 qy70Var, Executor executor) {
        synchronized (this.a) {
            qy70Var.getClass();
            this.g = qy70Var;
            executor.getClass();
            this.h = executor;
            this.f.g(this.d, executor);
        }
    }

    public final int getHeight() {
        int height;
        synchronized (this.a) {
            height = this.f.getHeight();
        }
        return height;
    }

    public final Surface getSurface() {
        Surface surface;
        synchronized (this.a) {
            surface = this.f.getSurface();
        }
        return surface;
    }

    public final int getWidth() {
        int width;
        synchronized (this.a) {
            width = this.f.getWidth();
        }
        return width;
    }

    public final int h() {
        int iH;
        synchronized (this.a) {
            iH = this.f.h();
        }
        return iH;
    }

    public final void i(ry70 ry70Var) {
        zx70 zx70VarM;
        synchronized (this.a) {
            try {
                if (this.e) {
                    return;
                }
                int size = this.t.size() + this.Y.size();
                if (size >= ry70Var.h()) {
                    j2h1.o("MetadataImageReader");
                    return;
                }
                do {
                    try {
                        zx70VarM = ry70Var.m();
                        if (zx70VarM != null) {
                            this.c--;
                            size++;
                            this.t.put(zx70VarM.Q0().getTimestamp(), zx70VarM);
                            j();
                        }
                    } catch (IllegalStateException unused) {
                        j2h1.z(3, j2h1.J("MetadataImageReader"));
                        zx70VarM = null;
                    }
                    if (zx70VarM == null || this.c <= 0) {
                        break;
                    }
                } while (size < ry70Var.h());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j() {
        synchronized (this.a) {
            try {
                for (int size = this.i.size() - 1; size >= 0; size--) {
                    rt70 rt70Var = (rt70) this.i.valueAt(size);
                    long timestamp = rt70Var.getTimestamp();
                    zx70 zx70Var = (zx70) this.t.get(timestamp);
                    if (zx70Var != null) {
                        this.t.remove(timestamp);
                        this.i.removeAt(size);
                        f(new fm61(zx70Var, null, rt70Var));
                    }
                }
                k();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k() {
        synchronized (this.a) {
            try {
                if (this.t.size() != 0 && this.i.size() != 0) {
                    long jKeyAt = this.t.keyAt(0);
                    Long lValueOf = Long.valueOf(jKeyAt);
                    long jKeyAt2 = this.i.keyAt(0);
                    o0c.l(!Long.valueOf(jKeyAt2).equals(lValueOf));
                    if (jKeyAt2 > jKeyAt) {
                        for (int size = this.t.size() - 1; size >= 0; size--) {
                            if (this.t.keyAt(size) < jKeyAt2) {
                                ((zx70) this.t.valueAt(size)).close();
                                this.t.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.i.size() - 1; size2 >= 0; size2--) {
                            if (this.i.keyAt(size2) < jKeyAt) {
                                this.i.removeAt(size2);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zx70 m() {
        synchronized (this.a) {
            try {
                if (this.Y.isEmpty()) {
                    return null;
                }
                if (this.X >= this.Y.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = this.Y;
                int i = this.X;
                this.X = i + 1;
                zx70 zx70Var = (zx70) arrayList.get(i);
                this.Z.add(zx70Var);
                return zx70Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
