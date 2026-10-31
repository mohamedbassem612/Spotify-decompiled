package p;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class l441 implements lnm, e9n {
    public static final /* synthetic */ long b = avg.a.objectFieldOffset(l441.class.getDeclaredField("result"));
    public final lnm a;
    private volatile Object result;

    public l441(Object obj, lnm lnmVar) {
        this.a = lnmVar;
        this.result = obj;
    }

    public final Object a() throws Throwable {
        d9n d9nVar = d9n.a;
        Object obj = this.result;
        d9n d9nVar2 = d9n.b;
        if (obj == d9nVar2) {
            while (true) {
                l441 l441Var = this;
                if (avg.a.compareAndSwapObject(l441Var, b, d9nVar2, d9nVar)) {
                    return d9nVar;
                }
                if (avg.a.getObjectVolatile(l441Var, b) != d9nVar2) {
                    obj = l441Var.result;
                    break;
                }
                this = l441Var;
            }
        }
        if (obj == d9n.c) {
            return d9nVar;
        }
        if (obj instanceof m231) {
            throw ((m231) obj).a;
        }
        return obj;
    }

    @Override // p.e9n
    public final e9n getCallerFrame() {
        lnm lnmVar = this.a;
        if (lnmVar instanceof e9n) {
            return (e9n) lnmVar;
        }
        return null;
    }

    @Override // p.lnm
    public final o8n getContext() {
        return this.a.getContext();
    }

    @Override // p.lnm
    public final void resumeWith(Object obj) {
        l441 l441Var;
        Unsafe unsafe;
        long j;
        while (true) {
            Object obj2 = this.result;
            d9n d9nVar = d9n.b;
            if (obj2 == d9nVar) {
                while (true) {
                    Unsafe unsafe2 = avg.a;
                    long j2 = b;
                    l441Var = this;
                    if (unsafe2.compareAndSwapObject(l441Var, j2, d9nVar, obj)) {
                        return;
                    }
                    if (unsafe2.getObjectVolatile(l441Var, j2) != d9nVar) {
                        break;
                    } else {
                        this = l441Var;
                    }
                }
            } else {
                l441Var = this;
                d9n d9nVar2 = d9n.a;
                if (obj2 != d9nVar2) {
                    eg.m("Already resumed");
                    return;
                }
                d9n d9nVar3 = d9n.c;
                do {
                    unsafe = avg.a;
                    j = b;
                    if (unsafe.compareAndSwapObject(l441Var, j, d9nVar2, d9nVar3)) {
                        l441Var.a.resumeWith(obj);
                        return;
                    }
                } while (unsafe.getObjectVolatile(l441Var, j) == d9nVar2);
            }
            this = l441Var;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.a;
    }

    public l441(lnm lnmVar) {
        this(d9n.b, lnmVar);
    }
}
