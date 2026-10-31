package p;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class csk {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(csk.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b;
    public static final /* synthetic */ long c;
    public static final /* synthetic */ long d;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Unsafe unsafe = avg.a;
        c = unsafe.objectFieldOffset(csk.class.getDeclaredField("_next$volatile"));
        b = AtomicReferenceFieldUpdater.newUpdater(csk.class, Object.class, "_prev$volatile");
        d = unsafe.objectFieldOffset(csk.class.getDeclaredField("_prev$volatile"));
    }

    public csk(hp51 hp51Var) {
        this._prev$volatile = hp51Var;
    }

    public final void b() {
        avg.a.putObjectVolatile(this, d, (Object) null);
    }

    public final csk c() {
        Object objectVolatile = avg.a.getObjectVolatile(this, c);
        if (objectVolatile == lvx.a) {
            return null;
        }
        return (csk) objectVolatile;
    }

    public abstract boolean d();

    public final void e() {
        Unsafe unsafe;
        Object objectVolatile;
        csk cskVarC;
        if (c() == null) {
            return;
        }
        while (true) {
            Unsafe unsafe2 = avg.a;
            long j = d;
            csk cskVar = (csk) unsafe2.getObjectVolatile(this, j);
            while (cskVar != null && cskVar.d()) {
                cskVar = (csk) avg.a.getObjectVolatile(cskVar, j);
            }
            csk cskVarC2 = c();
            cskVarC2.getClass();
            while (cskVarC2.d() && (cskVarC = cskVarC2.c()) != null) {
                cskVarC2 = cskVarC;
            }
            do {
                unsafe = avg.a;
                objectVolatile = unsafe.getObjectVolatile(cskVarC2, j);
            } while (!ydh.o(cskVarC2, objectVolatile, ((csk) objectVolatile) == null ? null : cskVar));
            if (cskVar != null) {
                unsafe.putObjectVolatile(cskVar, c, cskVarC2);
            }
            if (!cskVarC2.d() || cskVarC2.c() == null) {
                if (cskVar == null || !cskVar.d()) {
                    return;
                }
            }
        }
    }
}
