package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class il01 implements Update {
    public static final il01 a = new il01();

    public final Next a(Object obj, Object obj2) {
        hl01 hl01Var = (hl01) obj;
        xk01 xk01Var = (xk01) obj2;
        if (xk01Var instanceof sk01) {
            if (hl01Var instanceof gl01) {
                sk01 sk01Var = (sk01) xk01Var;
                return Next.h(new fl01(((gl01) hl01Var).a, sk01Var.a, sk01Var.b, sk01Var.c, sk01Var.d, -1, false, 0, 0));
            }
            if ((hl01Var instanceof fl01) || (hl01Var instanceof el01)) {
                return Next.j();
            }
            eg.o();
            return null;
        }
        if (xk01Var instanceof rk01) {
            if (hl01Var instanceof gl01) {
                gl01 gl01Var = (gl01) hl01Var;
                return Next.h(new el01(gl01Var.a, gl01Var.b + 1, ((rk01) xk01Var).a));
            }
            if ((hl01Var instanceof fl01) || (hl01Var instanceof el01)) {
                return Next.j();
            }
            eg.o();
            return null;
        }
        if (xk01Var instanceof wk01) {
            if (hl01Var instanceof el01) {
                el01 el01Var = (el01) hl01Var;
                String str = el01Var.a;
                int i = el01Var.b;
                return Next.i(new gl01(str, i), Collections.singleton(new gk01(str, Math.min((long) (Math.pow(2.0d, i - 1) * 200.0d), 3200L))));
            }
            if ((hl01Var instanceof gl01) || (hl01Var instanceof fl01)) {
                return Next.j();
            }
            eg.o();
            return null;
        }
        if (xk01Var instanceof qk01) {
            if (!(hl01Var instanceof fl01)) {
                if ((hl01Var instanceof gl01) || (hl01Var instanceof el01)) {
                    return Next.j();
                }
                eg.o();
                return null;
            }
            fl01 fl01Var = (fl01) hl01Var;
            int i2 = fl01Var.f;
            int i3 = ((qk01) xk01Var).a;
            if (i2 == i3) {
                i3 = -1;
            }
            return Next.h(fl01.a(fl01Var, i3, false, 0, 0, 479));
        }
        if (xk01Var instanceof vk01) {
            if (hl01Var instanceof fl01) {
                fl01 fl01Var2 = (fl01) hl01Var;
                boolean z = fl01Var2.g;
                boolean z2 = ((vk01) xk01Var).a;
                return z == z2 ? Next.j() : Next.h(fl01.a(fl01Var2, 0, z2, 0, 0, 447));
            }
            if ((hl01Var instanceof gl01) || (hl01Var instanceof el01)) {
                return Next.j();
            }
            eg.o();
            return null;
        }
        if (!(xk01Var instanceof uk01)) {
            if (!(xk01Var instanceof tk01)) {
                eg.o();
                return null;
            }
            if (hl01Var instanceof fl01) {
                return Next.a(Collections.singleton(hk01.a));
            }
            if ((hl01Var instanceof gl01) || (hl01Var instanceof el01)) {
                return Next.j();
            }
            eg.o();
            return null;
        }
        if (hl01Var instanceof fl01) {
            fl01 fl01Var3 = (fl01) hl01Var;
            int i4 = fl01Var3.h;
            uk01 uk01Var = (uk01) xk01Var;
            int i5 = uk01Var.a;
            return (i4 == i5 && fl01Var3.i == uk01Var.b) ? Next.j() : Next.h(fl01.a(fl01Var3, 0, false, i5, uk01Var.b, 127));
        }
        if ((hl01Var instanceof gl01) || (hl01Var instanceof el01)) {
            return Next.j();
        }
        eg.o();
        return null;
    }
}
