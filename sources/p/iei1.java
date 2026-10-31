package p;

import com.spotify.base.java.logging.Logger;
import java.util.Iterator;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class iei1 extends x7e0 {
    public final uu00 d;
    public final xdd0 e;
    public final q8n f;
    public xab1 g;
    public final bpb1 h;

    public iei1(uu00 uu00Var, xdd0 xdd0Var, q8n q8nVar) {
        this.d = uu00Var;
        this.e = xdd0Var;
        this.f = q8nVar;
        this.h = gio1.b(new fei1(xdd0Var.a, (String) null, (String) null, false));
    }

    public static String l(zei1 zei1Var) {
        Object next;
        Iterator it = zei1Var.e.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                yp70 yp70Var = (yp70) next;
                int i = yp70Var.c * yp70Var.b;
                do {
                    Object next2 = it.next();
                    yp70 yp70Var2 = (yp70) next2;
                    int i2 = yp70Var2.c * yp70Var2.b;
                    if (i < i2) {
                        next = next2;
                        i = i2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        yp70 yp70Var3 = (yp70) next;
        if (yp70Var3 != null) {
            return yp70Var3.a;
        }
        return null;
    }

    public final void e() {
        fei1 fei1Var = (fei1) this.h.getValue();
        if (fei1Var.b != null || fei1Var.d) {
            i();
        } else {
            j();
            this.g = fn31.T(smo1.e(this.f), (o8n) null, 0, new b0f1(this, (lnm) null, (byte) 26), 3);
        }
    }

    public final void f() {
        xab1 xab1Var = this.g;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
    }

    public final zob1 k() {
        return this.h;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object m(String str, onm onmVar) {
        hei1 hei1Var;
        String str2;
        if (onmVar instanceof hei1) {
            hei1Var = (hei1) onmVar;
            int i = hei1Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                hei1Var.e = i - Integer.MIN_VALUE;
            } else {
                hei1Var = new hei1(this, onmVar);
            }
        } else {
            hei1Var = new hei1(this, onmVar);
        }
        Object obj = hei1Var.c;
        int i2 = hei1Var.e;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                String strA = z6b1.a(str);
                ph11 ph11Var = new ph11(yoi1.g(this.d.b(new oi("listening-activity-user-metadata", false, new ysf1(strA, (byte) 20)))), (byte) 19);
                hei1Var.a = str;
                hei1Var.b = strA;
                hei1Var.e = 1;
                Object objI = b5p1.i(ph11Var, hei1Var);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
                obj = objI;
                str2 = strA;
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = hei1Var.b;
                str = hei1Var.a;
                hm5.M(obj);
            }
            zei1 zei1Var = ((uv00) obj).a(zei1.class, str2).b;
            if (zei1Var != null) {
                return new fei1(str, zei1Var.b, l(zei1Var), false);
            }
            Logger.k("BUZZ: UserProfileV2 extension data is null for username: " + str, new Object[0]);
            return new fei1(str, (String) null, (String) null, true);
        } catch (Exception e) {
            Logger.k(l1d.m("BUZZ: Failed to fetch user metadata for username: ", str), new Object[]{e});
            return new fei1(str, (String) null, (String) null, true);
        }
    }
}
