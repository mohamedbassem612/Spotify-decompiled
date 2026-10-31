package p;

import android.util.SparseArray;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jv7 implements gd50 {
    public final c18 a;
    public final ConcurrentLinkedQueue b;
    public final ConcurrentLinkedQueue c;
    public final ConcurrentLinkedQueue d;
    public final AtomicLong e;
    public final lr81 f;
    public b18 g;
    public b18 h;
    public boolean i;
    public boolean j;
    public long k;
    public boolean l;
    public boolean m;
    public boolean n;

    public jv7(c18 c18Var, e4w e4wVar, ie30 ie30Var) throws AudioProcessor$UnhandledAudioFormatException {
        c18 c18Var2 = new c18(ie30Var);
        dm5.n((c18Var2.c == -1 || c18Var2.a == -1 || c18Var2.b == -1) ? false : true, c18Var2);
        this.b = new ConcurrentLinkedQueue();
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());
        for (int i = 0; i < 10; i++) {
            gar garVar = new gar(2);
            garVar.d = byteBufferOrder;
            this.b.add(garVar);
        }
        this.c = new ConcurrentLinkedQueue();
        this.d = new ConcurrentLinkedQueue();
        lr81 lr81Var = new lr81();
        c18 c18Var3 = c18.e;
        lr81Var.d = c18Var3;
        lr81Var.e = c18Var3;
        lr81Var.b = -9223372036854775807L;
        lr81Var.c = -9223372036854775807L;
        ByteBuffer byteBuffer = f18.a;
        lr81Var.f = byteBuffer;
        lr81Var.g = byteBuffer;
        lr81Var.h = byteBuffer;
        this.f = lr81Var;
        b18 b18Var = new b18(e4wVar.h);
        this.g = b18Var;
        c18 c18VarA = b18Var.a(c18Var2);
        b18 b18Var2 = this.g;
        e18 e18Var = e18.d;
        b18Var2.b(e18Var);
        b18 b18VarB = b(e4wVar, ie30Var.m, c18VarA, c18Var, lr81Var);
        this.h = b18VarB;
        b18VarB.b(e18Var);
        c18 c18Var4 = this.h.d;
        this.a = c18Var4;
        dm5.n(c18Var4.c == 2, c18Var4);
        this.e = new AtomicLong(-9223372036854775807L);
        this.k = -9223372036854775807L;
    }

    public static b18 b(e4w e4wVar, hjj0 hjj0Var, c18 c18Var, c18 c18Var2, lr81 lr81Var) throws AudioProcessor$UnhandledAudioFormatException {
        int i;
        v280 v280Var = new v280(4);
        v280Var.c(lr81Var);
        e4wVar.getClass();
        v280Var.e(e4wVar.f.a);
        int i2 = c18Var2.a;
        int i3 = c18Var2.b;
        if (i2 != -1) {
            sfa1 sfa1Var = new sfa1(false);
            dm5.m(i2 == -1 || i2 > 0);
            sfa1Var.c = i2;
            v280Var.c(sfa1Var);
        }
        if (i3 == 1 || i3 == 2) {
            mge mgeVar = new mge();
            SparseArray sparseArray = (SparseArray) mgeVar.j;
            nge ngeVarA = nge.a(1, i3);
            sparseArray.put(ngeVarA.a, ngeVarA);
            nge ngeVarA2 = nge.a(2, i3);
            sparseArray.put(ngeVarA2.a, ngeVarA2);
            v280Var.c(mgeVar);
        }
        b18 b18Var = new b18(v280Var.g());
        c18 c18VarA = b18Var.a(c18Var);
        if ((i2 == -1 || i2 == c18VarA.a) && ((i3 == -1 || i3 == c18VarA.b) && ((i = c18Var2.c) == -1 || i == c18VarA.c))) {
            return b18Var;
        }
        throw new AudioProcessor$UnhandledAudioFormatException("Audio can not be modified to match downstream format", c18Var);
    }

    @Override // p.p5q0
    public final void a(e4w e4wVar, long j, ie30 ie30Var, boolean z) {
        dm5.y(!this.m);
        if (ie30Var == null) {
            dm5.z(j != -9223372036854775807L, "Could not generate silent audio because duration is unknown.");
        } else {
            dm5.y(asj0.k(ie30Var.f66p));
            c18 c18Var = new c18(ie30Var);
            dm5.z((c18Var.c == -1 || c18Var.a == -1 || c18Var.b == -1) ? false : true, c18Var);
        }
        this.d.add(new iv7(e4wVar, j, ie30Var, z));
    }

    @Override // p.d541
    public final gar d() {
        dm5.y(!this.m);
        if (this.d.isEmpty()) {
            return (gar) this.b.peek();
        }
        return null;
    }

    @Override // p.d541
    public final boolean e() {
        dm5.y(!this.m);
        dm5.y(this.d.isEmpty());
        gar garVar = (gar) this.b.remove();
        this.c.add(garVar);
        this.e.compareAndSet(-9223372036854775807L, garVar.f);
        Integer.toHexString(hashCode());
        LinkedHashMap linkedHashMap = x8r.a;
        synchronized (x8r.class) {
        }
        return true;
    }

    public final ByteBuffer j() {
        ByteBuffer byteBufferK;
        ByteBuffer byteBufferD;
        ByteBuffer byteBufferL;
        hjj0 hjj0Var;
        boolean z;
        c18 c18Var;
        dm5.y(!this.m);
        if (this.i) {
            if (this.g.f()) {
                b18 b18Var = this.g;
                do {
                    byteBufferL = l();
                    if (!byteBufferL.hasRemaining()) {
                        if (!n()) {
                            break;
                        }
                        b18Var.h();
                        break;
                    }
                    b18Var.i(byteBufferL);
                } while (!byteBufferL.hasRemaining());
            }
            if (this.h.f()) {
                b18 b18Var2 = this.h;
                do {
                    byteBufferK = k();
                    if (!byteBufferK.hasRemaining()) {
                        if (!(this.g.f() ? this.g.e() : n())) {
                            break;
                        }
                        b18Var2.h();
                        break;
                    }
                    b18Var2.i(byteBufferK);
                } while (!byteBufferK.hasRemaining());
                byteBufferD = this.h.d();
            } else {
                byteBufferD = k();
            }
        } else {
            byteBufferD = f18.a;
        }
        if (byteBufferD.hasRemaining()) {
            Integer.toHexString(hashCode());
            byteBufferD.remaining();
            LinkedHashMap linkedHashMap = x8r.a;
            synchronized (x8r.class) {
            }
            return byteBufferD;
        }
        if (!m() && !this.d.isEmpty()) {
            lr81 lr81Var = this.f;
            c18 c18Var2 = this.a;
            iv7 iv7Var = (iv7) this.d.poll();
            iv7Var.getClass();
            long j = iv7Var.b;
            e4w e4wVar = iv7Var.a;
            this.l = iv7Var.d;
            ie30 ie30Var = iv7Var.c;
            if (ie30Var != null) {
                this.k = j;
                c18Var = new c18(ie30Var);
                hjj0Var = ie30Var.m;
                z = false;
            } else {
                if (e4wVar.f.a.isEmpty()) {
                    this.k = e4wVar.b(j);
                } else {
                    this.k = j;
                }
                this.e.compareAndSet(-9223372036854775807L, 0L);
                hjj0Var = null;
                z = true;
                c18Var = c18Var2;
            }
            long j2 = this.k;
            dm5.m(j2 >= 0 || j2 == -9223372036854775807L);
            lr81Var.c = j2;
            if (this.i) {
                b18 b18Var3 = new b18(e4wVar.h);
                this.g = b18Var3;
                this.h = b(e4wVar, hjj0Var, b18Var3.a(c18Var), c18Var2, lr81Var);
            }
            d18 d18Var = new d18((byte) 0);
            d18Var.a = 0L;
            e18 e18VarI = d18Var.i();
            this.g.b(e18VarI);
            this.h.b(e18VarI);
            this.j = false;
            this.i = true;
            if (z) {
                this.g.j();
                this.h.h();
            }
        }
        if (!this.n && o()) {
            Integer.toHexString(hashCode());
            LinkedHashMap linkedHashMap2 = x8r.a;
            synchronized (x8r.class) {
            }
            this.n = true;
        }
        return f18.a;
    }

    public final ByteBuffer k() {
        return this.g.f() ? this.g.d() : l();
    }

    public final ByteBuffer l() {
        while (true) {
            ConcurrentLinkedQueue concurrentLinkedQueue = this.c;
            gar garVar = (gar) concurrentLinkedQueue.peek();
            if (garVar == null) {
                return f18.a;
            }
            boolean zF = garVar.f(4);
            this.j = zF;
            ConcurrentLinkedQueue concurrentLinkedQueue2 = this.b;
            if (zF) {
                gar garVar2 = (gar) concurrentLinkedQueue.remove();
                garVar2.g();
                garVar2.f = 0L;
                concurrentLinkedQueue2.add(garVar2);
                return f18.a;
            }
            ByteBuffer byteBuffer = garVar.d;
            byteBuffer.getClass();
            if (byteBuffer.hasRemaining()) {
                return byteBuffer;
            }
            gar garVar3 = (gar) concurrentLinkedQueue.remove();
            garVar3.g();
            garVar3.f = 0L;
            concurrentLinkedQueue2.add(garVar3);
        }
    }

    public final boolean m() {
        if (!this.i) {
            return false;
        }
        if (!this.c.isEmpty()) {
            return true;
        }
        if (!this.h.f() || this.h.e()) {
            return this.g.f() && !this.g.e();
        }
        return true;
    }

    public final boolean n() {
        return this.j || !this.d.isEmpty();
    }

    public final boolean o() {
        if (this.m) {
            return true;
        }
        if (!m() && this.d.isEmpty()) {
            return this.k != -9223372036854775807L ? this.l : this.j;
        }
        return false;
    }
}
