package p;

import java.util.ArrayList;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class naa0 implements i980 {
    public static final /* synthetic */ long b;
    public static final /* synthetic */ long c;
    public static final /* synthetic */ long d;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;
    public final pdo0 a;

    static {
        Unsafe unsafe = avg.a;
        c = unsafe.objectFieldOffset(naa0.class.getDeclaredField("_isCompleting$volatile"));
        d = unsafe.objectFieldOffset(naa0.class.getDeclaredField("_rootCause$volatile"));
        b = unsafe.objectFieldOffset(naa0.class.getDeclaredField("_exceptionsHolder$volatile"));
    }

    public naa0(pdo0 pdo0Var, Throwable th) {
        this.a = pdo0Var;
        this._rootCause$volatile = th;
    }

    public final void a(Throwable th) {
        Throwable thC = c();
        if (thC == null) {
            avg.a.putObjectVolatile(this, d, th);
            return;
        }
        if (th == thC) {
            return;
        }
        Unsafe unsafe = avg.a;
        long j = b;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if (objectVolatile == null) {
            unsafe.putObjectVolatile(this, j, th);
            return;
        }
        if (!(objectVolatile instanceof Throwable)) {
            if (objectVolatile instanceof ArrayList) {
                ((ArrayList) objectVolatile).add(th);
                return;
            } else {
                eg.m(f4i1.d(objectVolatile, "State is "));
                return;
            }
        }
        if (th == objectVolatile) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(objectVolatile);
        arrayList.add(th);
        unsafe.putObjectVolatile(this, j, arrayList);
    }

    @Override // p.i980
    public final pdo0 b() {
        return this.a;
    }

    public final Throwable c() {
        return (Throwable) avg.a.getObjectVolatile(this, d);
    }

    public final boolean d() {
        return c() != null;
    }

    public final boolean e() {
        return avg.a.getIntVolatile(this, c) == 1;
    }

    public final ArrayList f(Throwable th) {
        ArrayList arrayList;
        Unsafe unsafe = avg.a;
        long j = b;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if (objectVolatile == null) {
            arrayList = new ArrayList(4);
        } else if (objectVolatile instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(objectVolatile);
            arrayList = arrayList2;
        } else {
            if (!(objectVolatile instanceof ArrayList)) {
                eg.m(f4i1.d(objectVolatile, "State is "));
                return null;
            }
            arrayList = (ArrayList) objectVolatile;
        }
        Throwable thC = c();
        if (thC != null) {
            arrayList.add(0, thC);
        }
        if (th != null && !th.equals(thC)) {
            arrayList.add(th);
        }
        unsafe.putObjectVolatile(this, j, j1e1.e);
        return arrayList;
    }

    @Override // p.i980
    public final boolean isActive() {
        return c() == null;
    }

    public final String toString() {
        return "Finishing[cancelling=" + d() + ", completing=" + e() + ", rootCause=" + c() + ", exceptions=" + avg.a.getObjectVolatile(this, b) + ", list=" + this.a + ']';
    }
}
