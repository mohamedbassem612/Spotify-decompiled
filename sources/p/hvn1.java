package p;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hvn1 extends ggo1 {
    public static final Unsafe c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final long h;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new pkh1((byte) 3));
            }
            try {
                e = unsafe.objectFieldOffset(nvn1.class.getDeclaredField("c"));
                d = unsafe.objectFieldOffset(nvn1.class.getDeclaredField("b"));
                f = unsafe.objectFieldOffset(nvn1.class.getDeclaredField("a"));
                g = unsafe.objectFieldOffset(ivn1.class.getDeclaredField("a"));
                h = unsafe.objectFieldOffset(ivn1.class.getDeclaredField("b"));
                c = unsafe;
            } catch (NoSuchFieldException e2) {
                eg.j(e2);
            }
        } catch (PrivilegedActionException e3) {
            bhn0.o("Could not initialize intrinsics", e3.getCause());
        }
    }

    @Override // p.ggo1
    public final bvn1 Q(yyn1 yyn1Var) {
        bvn1 bvn1Var;
        bvn1 bvn1Var2 = bvn1.d;
        do {
            bvn1Var = yyn1Var.b;
            if (bvn1Var2 == bvn1Var) {
                break;
            }
        } while (!U(yyn1Var, bvn1Var, bvn1Var2));
        return bvn1Var;
    }

    @Override // p.ggo1
    public final ivn1 R(yyn1 yyn1Var) {
        ivn1 ivn1Var;
        ivn1 ivn1Var2 = ivn1.c;
        do {
            ivn1Var = yyn1Var.c;
            if (ivn1Var2 == ivn1Var) {
                break;
            }
        } while (!W(yyn1Var, ivn1Var, ivn1Var2));
        return ivn1Var;
    }

    @Override // p.ggo1
    public final void S(ivn1 ivn1Var, ivn1 ivn1Var2) {
        c.putObject(ivn1Var, h, ivn1Var2);
    }

    @Override // p.ggo1
    public final void T(ivn1 ivn1Var, Thread thread) {
        c.putObject(ivn1Var, g, thread);
    }

    @Override // p.ggo1
    public final boolean U(yyn1 yyn1Var, bvn1 bvn1Var, bvn1 bvn1Var2) {
        return mgo1.y(c, yyn1Var, d, bvn1Var, bvn1Var2);
    }

    @Override // p.ggo1
    public final boolean V(nvn1 nvn1Var, Object obj, Object obj2) {
        return mgo1.y(c, nvn1Var, f, obj, obj2);
    }

    @Override // p.ggo1
    public final boolean W(nvn1 nvn1Var, ivn1 ivn1Var, ivn1 ivn1Var2) {
        return mgo1.y(c, nvn1Var, e, ivn1Var, ivn1Var2);
    }
}
