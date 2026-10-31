package p;

import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bpe0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(bpe0.class, Object.class, "_next$volatile");
    public static final jm f;
    public static final /* synthetic */ long g;
    public static final /* synthetic */ long h;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;

    static {
        Unsafe unsafe = avg.a;
        g = unsafe.objectFieldOffset(bpe0.class.getDeclaredField("_next$volatile"));
        h = unsafe.objectFieldOffset(bpe0.class.getDeclaredField("_state$volatile"));
        f = new jm("REMOVE_FROZEN", (byte) 5);
    }

    public bpe0(int i, boolean z) {
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            eg.m("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        eg.m("Check failed.");
        throw null;
    }

    public final int a(Object obj) {
        bpe0 bpe0Var = this;
        while (true) {
            Unsafe unsafe = avg.a;
            long j = h;
            long longVolatile = unsafe.getLongVolatile(bpe0Var, j);
            if ((3458764513820540928L & longVolatile) != 0) {
                return v9p1.v(longVolatile);
            }
            int i = (int) (1073741823 & longVolatile);
            int i2 = (int) ((1152921503533105152L & longVolatile) >> 30);
            int i3 = bpe0Var.c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = bpe0Var.b;
            AtomicReferenceArray atomicReferenceArray = bpe0Var.d;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                if (unsafe.compareAndSwapLong(bpe0Var, h, longVolatile, v9p1.R((i2 + 1) & 1073741823, longVolatile))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    bpe0 bpe0VarC = this;
                    while ((avg.a.getLongVolatile(bpe0VarC, j) & 1152921504606846976L) != 0) {
                        bpe0VarC = bpe0VarC.c();
                        AtomicReferenceArray atomicReferenceArray2 = bpe0VarC.d;
                        int i4 = bpe0VarC.c & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof ape0) && ((ape0) obj2).a == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            bpe0VarC = null;
                        }
                        if (bpe0VarC == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                bpe0Var = this;
            } else {
                int i5 = bpe0Var.a;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        while (true) {
            long longVolatile = avg.a.getLongVolatile(this, h);
            if ((longVolatile & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & longVolatile) != 0) {
                return false;
            }
            bpe0 bpe0Var = this;
            if (avg.a.compareAndSwapLong(bpe0Var, h, longVolatile, longVolatile | 2305843009213693952L)) {
                return true;
            }
            this = bpe0Var;
        }
    }

    public final bpe0 c() {
        long longVolatile;
        bpe0 bpe0Var;
        while (true) {
            Unsafe unsafe = avg.a;
            long j = h;
            longVolatile = unsafe.getLongVolatile(this, j);
            if ((longVolatile & 1152921504606846976L) != 0) {
                bpe0Var = this;
                break;
            }
            long j2 = 1152921504606846976L | longVolatile;
            bpe0Var = this;
            if (unsafe.compareAndSwapLong(bpe0Var, j, longVolatile, j2)) {
                longVolatile = j2;
                break;
            }
            this = bpe0Var;
        }
        while (true) {
            bpe0 bpe0Var2 = (bpe0) avg.a.getObjectVolatile(bpe0Var, g);
            if (bpe0Var2 != null) {
                return bpe0Var2;
            }
            bpe0 bpe0Var3 = new bpe0(bpe0Var.a * 2, bpe0Var.b);
            int i = (int) (1073741823 & longVolatile);
            int i2 = (int) ((1152921503533105152L & longVolatile) >> 30);
            while (true) {
                int i3 = bpe0Var.c;
                int i4 = i & i3;
                if (i4 != (i3 & i2)) {
                    Object ape0Var = bpe0Var.d.get(i4);
                    if (ape0Var == null) {
                        ape0Var = new ape0(i);
                    }
                    bpe0Var3.d.set(bpe0Var3.c & i, ape0Var);
                    i++;
                }
            }
            avg.a.putLongVolatile(bpe0Var3, h, v9p1.S(longVolatile));
            g5d0.i(bpe0Var, bpe0Var3);
        }
    }

    public final Object d() {
        bpe0 bpe0VarC = this;
        while (true) {
            Unsafe unsafe = avg.a;
            long j = h;
            long longVolatile = unsafe.getLongVolatile(bpe0VarC, j);
            if ((longVolatile & 1152921504606846976L) != 0) {
                return f;
            }
            int i = (int) (longVolatile & 1073741823);
            int i2 = bpe0VarC.c;
            int i3 = ((int) ((1152921503533105152L & longVolatile) >> 30)) & i2;
            int i4 = i2 & i;
            if (i3 != i4) {
                AtomicReferenceArray atomicReferenceArray = bpe0VarC.d;
                Object obj = atomicReferenceArray.get(i4);
                boolean z = bpe0VarC.b;
                if (obj == null) {
                    if (z) {
                    }
                } else if (!(obj instanceof ape0)) {
                    int i5 = 1073741823 & (i + 1);
                    if (unsafe.compareAndSwapLong(bpe0VarC, j, longVolatile, v9p1.Q(i5, longVolatile))) {
                        atomicReferenceArray.set(i4, null);
                        return obj;
                    }
                    bpe0VarC = this;
                    if (z) {
                        while (true) {
                            Unsafe unsafe2 = avg.a;
                            long j2 = h;
                            long longVolatile2 = unsafe2.getLongVolatile(bpe0VarC, j2);
                            int i6 = (int) (longVolatile2 & 1073741823);
                            if ((longVolatile2 & 1152921504606846976L) != 0) {
                                bpe0VarC = bpe0VarC.c();
                            } else {
                                if (unsafe2.compareAndSwapLong(bpe0VarC, j2, longVolatile2, v9p1.Q(i5, longVolatile2))) {
                                    bpe0VarC.d.set(bpe0VarC.c & i6, null);
                                    bpe0VarC = null;
                                } else {
                                    continue;
                                }
                            }
                            if (bpe0VarC == null) {
                                return obj;
                            }
                        }
                    }
                }
            }
            return null;
        }
    }
}
