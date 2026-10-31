package p;

import android.content.Context;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class erw0 {
    public static final erw0 g = new erw0();
    public pzc b;
    public d5d d;
    public Context e;
    public final Object a = new Object();
    public final wp20 c = new wp20((byte) 15);
    public final HashMap f = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(iac0 iac0Var, u4d u4dVar, e4i1... e4i1VarArr) {
        boolean z;
        Trace.beginSection("CX:bindToLifecycle");
        try {
            d5d d5dVar = this.d;
            if (d5dVar == null) {
                z = 0;
            } else {
                e1d e1dVar = d5dVar.f;
                if (e1dVar == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                z = e1dVar.b.b;
            }
            if (z == 2) {
                throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
            }
            e(1);
            b(iac0Var, u4dVar, (e4i1[]) Arrays.copyOf(e4i1VarArr, e4i1VarArr.length));
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final i9c0 b(iac0 iac0Var, u4d u4dVar, e4i1... e4i1VarArr) {
        i9c0 i9c0VarO;
        Collection<i9c0> collectionUnmodifiableCollection;
        boolean zContains;
        Trace.beginSection("CX:bindToLifecycle-internal");
        try {
            w8p1.m();
            d5d d5dVar = this.d;
            d5dVar.getClass();
            n3d n3dVarC = u4dVar.c(d5dVar.a.g());
            n3dVarC.o(true);
            h031 h031VarD = d(u4dVar);
            wp20 wp20Var = this.c;
            my8 my8VarT = a5d.t(h031VarD, null);
            synchronized (wp20Var.a) {
                i9c0VarO = (i9c0) ((HashMap) wp20Var.b).get(new i19(iac0Var, my8VarT));
            }
            wp20 wp20Var2 = this.c;
            synchronized (wp20Var2.a) {
                collectionUnmodifiableCollection = Collections.unmodifiableCollection(((HashMap) wp20Var2.b).values());
            }
            for (e4i1 e4i1Var : f46.i0(e4i1VarArr)) {
                for (i9c0 i9c0Var : collectionUnmodifiableCollection) {
                    synchronized (i9c0Var.a) {
                        zContains = ((ArrayList) i9c0Var.c.w()).contains(e4i1Var);
                    }
                    if (zContains && !i9c0Var.equals(i9c0VarO)) {
                        throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{e4i1Var}, 1)));
                    }
                }
            }
            if (i9c0VarO == null) {
                wp20 wp20Var3 = this.c;
                d5d d5dVar2 = this.d;
                d5dVar2.getClass();
                e1d e1dVar = d5dVar2.f;
                if (e1dVar == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                fdc fdcVar = e1dVar.b;
                d5d d5dVar3 = this.d;
                d5dVar3.getClass();
                ic9 ic9Var = d5dVar3.g;
                if (ic9Var == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                d5d d5dVar4 = this.d;
                d5dVar4.getClass();
                b2d b2dVar = d5dVar4.h;
                if (b2dVar == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                i9c0VarO = wp20Var3.o(iac0Var, new a5d(n3dVarC, null, h031VarD, null, fdcVar, ic9Var, b2dVar));
            }
            if (e4i1VarArr.length != 0) {
                wp20 wp20Var4 = this.c;
                List listM = p7h.M(Arrays.copyOf(e4i1VarArr, e4i1VarArr.length));
                d5d d5dVar5 = this.d;
                d5dVar5.getClass();
                e1d e1dVar2 = d5dVar5.f;
                if (e1dVar2 == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                wp20Var4.j(i9c0VarO, listM, e1dVar2.b);
            }
            Trace.endSection();
            return i9c0VarO;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final z2d c(u4d u4dVar) {
        for (a3c0 a3c0Var : u4dVar.a) {
            a19 a19Var = a3c0.b;
            if (!u890.j(a19Var, a19Var)) {
                synchronized (mu00.a) {
                }
                this.e.getClass();
            }
        }
        return a3d.a;
    }

    public final h031 d(u4d u4dVar) {
        Object h031Var;
        Trace.beginSection("CX:getCameraInfo");
        try {
            d5d d5dVar = this.d;
            d5dVar.getClass();
            l3d l3dVarG = u4dVar.c(d5dVar.a.g()).g();
            z2d z2dVarC = c(u4dVar);
            my8 my8Var = new my8(l3dVarG.b(), z2dVarC.a);
            synchronized (this.a) {
                h031Var = this.f.get(my8Var);
                if (h031Var == null) {
                    h031Var = new h031(l3dVarG, z2dVarC);
                    this.f.put(my8Var, h031Var);
                }
            }
            h031 h031Var2 = (h031) h031Var;
            Trace.endSection();
            return h031Var2;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(int i) {
        d5d d5dVar = this.d;
        if (d5dVar == null) {
            return;
        }
        e1d e1dVar = d5dVar.f;
        if (e1dVar == null) {
            eg.m("CameraX not initialized yet.");
            return;
        }
        fdc fdcVar = e1dVar.b;
        if (i != fdcVar.b) {
            for (w4d w4dVar : (ArrayList) fdcVar.c) {
                boolean z = fdcVar.b;
                synchronized (w4dVar.b) {
                    boolean z2 = true;
                    w4dVar.c = i == 2 ? 2 : 1;
                    boolean z3 = z != 2 && i == 2;
                    if (z != 2 || i == 2) {
                        z2 = false;
                    }
                    if (z3 || z2) {
                        w4dVar.b();
                    }
                }
            }
        }
        if (fdcVar.b == 2 && i != 2) {
            ((ArrayList) fdcVar.e).clear();
        }
        fdcVar.b = i;
    }

    public final void f() {
        Trace.beginSection("CX:unbindAll");
        try {
            w8p1.m();
            e(0);
            this.c.Y();
        } finally {
            Trace.endSection();
        }
    }
}
