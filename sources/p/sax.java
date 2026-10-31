package p;

import androidx.media3.session.legacy.PlaybackStateCompat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sax extends h541 implements gd50 {
    public static final ByteBuffer q = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());
    public final ie30 e;
    public final long f;
    public final AtomicLong g;
    public final ConcurrentLinkedQueue h;
    public final ConcurrentLinkedQueue i;
    public volatile boolean j;
    public long k;
    public boolean l;
    public boolean m;
    public long n;
    public gar o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f133p;

    public sax(ie30 ie30Var, zfg1 zfg1Var, dhn0 dhn0Var, yjq yjqVar, long j) {
        super(ie30Var, dhn0Var);
        this.e = ie30Var;
        this.f = j;
        this.g = new AtomicLong();
        this.h = new ConcurrentLinkedQueue();
        this.i = new ConcurrentLinkedQueue();
        yjqVar.w(zfg1Var);
    }

    @Override // p.p5q0
    public final void a(e4w e4wVar, long j, ie30 ie30Var, boolean z) {
        AtomicLong atomicLong = this.g;
        this.k = atomicLong.get();
        this.l = z;
        atomicLong.addAndGet(j);
        this.f133p = false;
    }

    @Override // p.d541
    public final gar d() {
        if (this.o == null) {
            gar garVar = (gar) this.h.poll();
            this.o = garVar;
            if (!this.m) {
                if (garVar == null) {
                    gar garVar2 = new gar(2);
                    this.o = garVar2;
                    garVar2.d = q;
                } else {
                    long j = this.n;
                    ByteBuffer byteBuffer = garVar.d;
                    byteBuffer.getClass();
                    this.n = j - ((long) byteBuffer.capacity());
                }
            }
        }
        return this.o;
    }

    @Override // p.d541
    public final boolean e() {
        gar garVar = this.o;
        garVar.getClass();
        this.o = null;
        if (garVar.f(4)) {
            this.j = true;
        } else {
            long j = this.k + this.f + garVar.f;
            garVar.f = j;
            if (!this.l && j >= this.g.get() + this.f) {
                this.f133p = true;
            }
            if (this.f133p) {
                garVar.g();
                garVar.f = 0L;
                this.h.add(garVar);
            } else {
                this.i.add(garVar);
            }
        }
        if (!this.m) {
            int size = this.i.size() + this.h.size();
            long j2 = this.n;
            ByteBuffer byteBuffer = garVar.d;
            byteBuffer.getClass();
            long jCapacity = j2 + ((long) byteBuffer.capacity());
            this.n = jCapacity;
            this.m = size >= 10 && (size >= 200 || jCapacity >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE);
        }
        return true;
    }

    @Override // p.h541
    public final gar k() {
        return (gar) this.i.peek();
    }

    @Override // p.h541
    public final ie30 l() {
        return this.e;
    }

    @Override // p.h541
    public final boolean m() {
        return this.j && this.i.isEmpty();
    }

    @Override // p.h541
    public final void p() {
        gar garVar = (gar) this.i.remove();
        garVar.g();
        garVar.f = 0L;
        this.h.add(garVar);
    }

    @Override // p.h541
    public final gd50 j(e4w e4wVar, ie30 ie30Var, int i) {
        return this;
    }
}
