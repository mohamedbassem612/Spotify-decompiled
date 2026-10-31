package p;

import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface$SurfaceUnavailableException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class j4d1 {
    public final Object a = new Object();
    public final Size b;
    public final liv c;
    public final n3d d;
    public final boolean e;
    public final pzc f;
    public final mzc g;
    public final pzc h;
    public final mzc i;
    public final mzc j;
    public final g280 k;
    public o29 l;
    public i4d1 m;
    public Executor n;

    static {
        Range range = i29.f;
    }

    public j4d1(Size size, n3d n3dVar, boolean z, liv livVar, k3d1 k3d1Var) {
        this.b = size;
        this.d = n3dVar;
        this.e = z;
        this.c = livVar;
        String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        AtomicReference atomicReference = new AtomicReference(null);
        mzc mzcVar = new mzc();
        mzcVar.c = new it21();
        pzc pzcVar = new pzc(mzcVar);
        mzcVar.b = pzcVar;
        mzcVar.a = x0d.class;
        try {
            atomicReference.set(mzcVar);
            mzcVar.a = str.concat("-cancellation");
        } catch (Exception e) {
            pzcVar.a(e);
        }
        mzc mzcVar2 = (mzc) atomicReference.get();
        mzcVar2.getClass();
        this.j = mzcVar2;
        AtomicReference atomicReference2 = new AtomicReference(null);
        mzc mzcVar3 = new mzc();
        mzcVar3.c = new it21();
        pzc pzcVar2 = new pzc(mzcVar3);
        mzcVar3.b = pzcVar2;
        mzcVar3.a = x0d.class;
        try {
            atomicReference2.set(mzcVar3);
            mzcVar3.a = str.concat("-status");
        } catch (Exception e2) {
            pzcVar2.a(e2);
        }
        this.h = pzcVar2;
        hp91 hp91Var = new hp91(mzcVar2, pzcVar, (byte) 26);
        byte b = 0;
        pzcVar2.b(new nx30(pzcVar2, hp91Var, b), n5u.a());
        mzc mzcVar4 = (mzc) atomicReference2.get();
        mzcVar4.getClass();
        AtomicReference atomicReference3 = new AtomicReference(null);
        mzc mzcVar5 = new mzc();
        mzcVar5.c = new it21();
        pzc pzcVar3 = new pzc(mzcVar5);
        mzcVar5.b = pzcVar3;
        mzcVar5.a = x0d.class;
        try {
            atomicReference3.set(mzcVar5);
            mzcVar5.a = str.concat("-Surface");
        } catch (Exception e3) {
            pzcVar3.a(e3);
        }
        this.f = pzcVar3;
        mzc mzcVar6 = (mzc) atomicReference3.get();
        mzcVar6.getClass();
        this.g = mzcVar6;
        g280 g280Var = new g280(this, size);
        this.k = g280Var;
        n8d0 n8d0VarF = poz0.F(g280Var.e);
        pzcVar3.b(new nx30(pzcVar3, new lvc1((Object) n8d0VarF, (Object) mzcVar4, (Object) str, (byte) 3), b), n5u.a());
        n8d0VarF.b(new qts(this, (byte) 1), n5u.a());
        n5u n5uVarA = n5u.a();
        AtomicReference atomicReference4 = new AtomicReference(null);
        pzc pzcVarT = upn1.t(new h341((Object) this, (Object) atomicReference4, (byte) 13));
        pzcVarT.b(new nx30(pzcVarT, new xq81(k3d1Var, (byte) 15), b), n5uVarA);
        mzc mzcVar7 = (mzc) atomicReference4.get();
        mzcVar7.getClass();
        this.i = mzcVar7;
    }

    public final void a(final Surface surface, Executor executor, final dkl dklVar) {
        final byte b = 0;
        if (!this.g.b(surface)) {
            pzc pzcVar = this.f;
            if (!pzcVar.isCancelled()) {
                o0c.q((String) null, pzcVar.b.isDone());
                try {
                    pzcVar.get();
                    executor.execute(new Runnable() { // from class: p.g4d1
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b2 = b;
                            Surface surface2 = surface;
                            dkl dklVar2 = dklVar;
                            switch (b2) {
                                case 0:
                                    dklVar2.accept(new n29(3, surface2));
                                    break;
                                default:
                                    dklVar2.accept(new n29(4, surface2));
                                    break;
                            }
                        }
                    });
                    return;
                } catch (InterruptedException | ExecutionException unused) {
                    final byte b2 = 1;
                    executor.execute(new Runnable() { // from class: p.g4d1
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b3 = b2;
                            Surface surface2 = surface;
                            dkl dklVar2 = dklVar;
                            switch (b3) {
                                case 0:
                                    dklVar2.accept(new n29(3, surface2));
                                    break;
                                default:
                                    dklVar2.accept(new n29(4, surface2));
                                    break;
                            }
                        }
                    });
                    return;
                }
            }
        }
        r2a1 r2a1Var = new r2a1(dklVar, surface, (byte) 27);
        pzc pzcVar2 = this.h;
        pzcVar2.b(new nx30(pzcVar2, r2a1Var, b), executor);
    }

    public final void b(Executor executor, i4d1 i4d1Var) {
        o29 o29Var;
        synchronized (this.a) {
            this.m = i4d1Var;
            this.n = executor;
            o29Var = this.l;
        }
        if (o29Var != null) {
            executor.execute(new f4d1(i4d1Var, o29Var, (byte) 0));
        }
    }

    public final void c() {
        this.g.c(new DeferrableSurface$SurfaceUnavailableException("Surface request will not complete."));
    }
}
