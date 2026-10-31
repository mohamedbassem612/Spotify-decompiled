package p;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class fae implements rpc1 {
    public final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    public final ArrayDeque c;
    public dae d;
    public long e;
    public long f;
    public long g;

    public fae() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new dae(1));
        }
        this.b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            ArrayDeque arrayDeque = this.b;
            lpd lpdVar = new lpd(this, (byte) 5);
            eae eaeVar = new eae();
            eaeVar.g = lpdVar;
            arrayDeque.add(eaeVar);
        }
        this.c = new ArrayDeque();
        this.g = -9223372036854775807L;
    }

    @Override // p.rpc1
    public final void a(long j) {
        this.e = j;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    @Override // p.ear
    public final void c(bqc1 bqc1Var) {
        dm5.m(bqc1Var == this.d);
        dae daeVar = (dae) bqc1Var;
        if (daeVar.f(4)) {
            long j = this.f;
            this.f = 1 + j;
            daeVar.t = j;
            this.c.add(daeVar);
        } else {
            long j2 = daeVar.f;
            if (j2 != Long.MIN_VALUE) {
                long j3 = this.g;
                if (j3 == -9223372036854775807L || j2 >= j3) {
                    long j4 = this.f;
                    this.f = 1 + j4;
                    daeVar.t = j4;
                    this.c.add(daeVar);
                } else {
                    daeVar.g();
                    this.a.add(daeVar);
                }
            } else {
                long j5 = this.f;
                this.f = 1 + j5;
                daeVar.t = j5;
                this.c.add(daeVar);
            }
        }
        this.d = null;
    }

    @Override // p.ear
    public final void d(long j) {
        this.g = j;
    }

    @Override // p.ear
    public final Object e() {
        dm5.y(this.d == null);
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        dae daeVar = (dae) arrayDeque.pollFirst();
        this.d = daeVar;
        return daeVar;
    }

    public abstract gae f();

    @Override // p.ear
    public void flush() {
        ArrayDeque arrayDeque;
        this.f = 0L;
        this.e = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.c;
            boolean zIsEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.a;
            if (zIsEmpty) {
                break;
            }
            dae daeVar = (dae) arrayDeque2.poll();
            String str = zoi1.a;
            daeVar.g();
            arrayDeque.add(daeVar);
        }
        dae daeVar2 = this.d;
        if (daeVar2 != null) {
            daeVar2.g();
            arrayDeque.add(daeVar2);
            this.d = null;
        }
    }

    public abstract void g(dae daeVar);

    @Override // p.ear
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public eae b() {
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.c;
            if (arrayDeque2.isEmpty()) {
                return null;
            }
            dae daeVar = (dae) arrayDeque2.peek();
            String str = zoi1.a;
            if (daeVar.f > this.e) {
                return null;
            }
            dae daeVar2 = (dae) arrayDeque2.poll();
            boolean zF = daeVar2.f(4);
            ArrayDeque arrayDeque3 = this.a;
            if (zF) {
                eae eaeVar = (eae) arrayDeque.pollFirst();
                eaeVar.e(4);
                daeVar2.g();
                arrayDeque3.add(daeVar2);
                return eaeVar;
            }
            g(daeVar2);
            if (i()) {
                gae gaeVarF = f();
                eae eaeVar2 = (eae) arrayDeque.pollFirst();
                long j = daeVar2.f;
                eaeVar2.b = j;
                eaeVar2.d = gaeVarF;
                eaeVar2.e = j;
                daeVar2.g();
                arrayDeque3.add(daeVar2);
                return eaeVar2;
            }
            daeVar2.g();
            arrayDeque3.add(daeVar2);
        }
    }

    public abstract boolean i();

    @Override // p.ear
    public void release() {
    }
}
