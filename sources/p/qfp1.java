package p;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qfp1 extends too1 {
    public static final Unsafe b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e2) {
                bhn0.o("Could not initialize intrinsics", e2.getCause());
                return;
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(pkh1.c);
        }
        try {
            d = unsafe.objectFieldOffset(tfp1.class.getDeclaredField("c"));
            c = unsafe.objectFieldOffset(tfp1.class.getDeclaredField("b"));
            e = unsafe.objectFieldOffset(tfp1.class.getDeclaredField("a"));
            f = unsafe.objectFieldOffset(rfp1.class.getDeclaredField("a"));
            g = unsafe.objectFieldOffset(rfp1.class.getDeclaredField("b"));
            b = unsafe;
        } catch (NoSuchFieldException e3) {
            eg.j(e3);
        }
    }

    @Override // p.too1
    public final void A(rfp1 rfp1Var, rfp1 rfp1Var2) {
        b.putObject(rfp1Var, g, rfp1Var2);
    }

    @Override // p.too1
    public final boolean B(tfp1 tfp1Var, rfp1 rfp1Var, rfp1 rfp1Var2) {
        while (true) {
            Unsafe unsafe = b;
            long j = d;
            tfp1 tfp1Var2 = tfp1Var;
            rfp1 rfp1Var3 = rfp1Var;
            rfp1 rfp1Var4 = rfp1Var2;
            if (unsafe.compareAndSwapObject(tfp1Var2, j, rfp1Var3, rfp1Var4)) {
                return true;
            }
            if (unsafe.getObject(tfp1Var2, j) != rfp1Var3) {
                return false;
            }
            tfp1Var = tfp1Var2;
            rfp1Var = rfp1Var3;
            rfp1Var2 = rfp1Var4;
        }
    }

    @Override // p.too1
    public final boolean C(tfp1 tfp1Var, lfp1 lfp1Var, lfp1 lfp1Var2) {
        while (true) {
            Unsafe unsafe = b;
            long j = c;
            tfp1 tfp1Var2 = tfp1Var;
            lfp1 lfp1Var3 = lfp1Var;
            lfp1 lfp1Var4 = lfp1Var2;
            if (unsafe.compareAndSwapObject(tfp1Var2, j, lfp1Var3, lfp1Var4)) {
                return true;
            }
            if (unsafe.getObject(tfp1Var2, j) != lfp1Var3) {
                return false;
            }
            tfp1Var = tfp1Var2;
            lfp1Var = lfp1Var3;
            lfp1Var2 = lfp1Var4;
        }
    }

    @Override // p.too1
    public final rfp1 D(tfp1 tfp1Var) {
        rfp1 rfp1Var;
        rfp1 rfp1Var2 = rfp1.c;
        do {
            rfp1Var = tfp1Var.c;
            if (rfp1Var2 == rfp1Var) {
                break;
            }
        } while (!B(tfp1Var, rfp1Var, rfp1Var2));
        return rfp1Var;
    }

    @Override // p.too1
    public final lfp1 E(tfp1 tfp1Var) {
        lfp1 lfp1Var;
        lfp1 lfp1Var2 = lfp1.d;
        do {
            lfp1Var = tfp1Var.b;
            if (lfp1Var2 == lfp1Var) {
                break;
            }
        } while (!C(tfp1Var, lfp1Var, lfp1Var2));
        return lfp1Var;
    }

    @Override // p.too1
    public final boolean F(tfp1 tfp1Var, Object obj, Object obj2) {
        while (true) {
            Unsafe unsafe = b;
            long j = e;
            tfp1 tfp1Var2 = tfp1Var;
            Object obj3 = obj;
            Object obj4 = obj2;
            if (unsafe.compareAndSwapObject(tfp1Var2, j, obj3, obj4)) {
                return true;
            }
            if (unsafe.getObject(tfp1Var2, j) != obj3) {
                return false;
            }
            tfp1Var = tfp1Var2;
            obj = obj3;
            obj2 = obj4;
        }
    }

    @Override // p.too1
    public final void z(rfp1 rfp1Var, Thread thread) {
        b.putObject(rfp1Var, f, thread);
    }
}
