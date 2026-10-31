package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kwm0 extends tn21 {
    public static final r8i0 e;
    public static final r8i0 f;
    public static final byte[] g;
    public static final byte[] h;
    public static final byte[] i;
    public final rhc a;
    public final List b;
    public final r8i0 c;
    public long d;

    static {
        se11 se11Var = r8i0.e;
        e = bmq0.w("multipart/mixed");
        bmq0.w("multipart/alternative");
        bmq0.w("multipart/digest");
        bmq0.w("multipart/parallel");
        f = bmq0.w("multipart/form-data");
        g = new byte[]{58, 32};
        h = new byte[]{13, 10};
        i = new byte[]{45, 45};
    }

    public kwm0(rhc rhcVar, r8i0 r8i0Var, List list) {
        this.a = rhcVar;
        this.b = list;
        se11 se11Var = r8i0.e;
        this.c = bmq0.w(r8i0Var + "; boundary=" + rhcVar.r());
        this.d = -1L;
    }

    public final long a() {
        long j = this.d;
        if (j != -1) {
            return j;
        }
        long jE = e(null, true);
        this.d = jE;
        return jE;
    }

    public final r8i0 b() {
        return this.c;
    }

    public final boolean c() {
        List list = this.b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((jwm0) it.next()).b.c()) {
                return true;
            }
        }
        return false;
    }

    public final void d(fbc fbcVar) {
        e(fbcVar, false);
    }

    public final long e(fbc fbcVar, boolean z) {
        fbc fbcVar2;
        fbc nacVar;
        if (z) {
            nacVar = new nac();
            fbcVar2 = nacVar;
        } else {
            fbcVar2 = null;
            nacVar = fbcVar;
        }
        List list = this.b;
        int size = list.size();
        long j = 0;
        int i2 = 0;
        while (true) {
            rhc rhcVar = this.a;
            byte[] bArr = i;
            byte[] bArr2 = h;
            if (i2 >= size) {
                nacVar.getClass();
                nacVar.write(bArr);
                nacVar.T0(rhcVar);
                nacVar.write(bArr);
                nacVar.write(bArr2);
                if (!z) {
                    return j;
                }
                fbcVar2.getClass();
                long j2 = j + ((nac) fbcVar2).b;
                fbcVar2.a();
                return j2;
            }
            jwm0 jwm0Var = (jwm0) list.get(i2);
            v360 v360Var = jwm0Var.a;
            tn21 tn21Var = jwm0Var.b;
            nacVar.getClass();
            nacVar.write(bArr);
            nacVar.T0(rhcVar);
            nacVar.write(bArr2);
            int size2 = v360Var.size();
            for (int i3 = 0; i3 < size2; i3++) {
                nacVar.Q(m5n1.h(v360Var, i3)).write(g).Q(m5n1.j(v360Var, i3)).write(bArr2);
            }
            r8i0 r8i0VarB = tn21Var.b();
            if (r8i0VarB != null) {
                nacVar.Q("Content-Type: ").Q(r8i0VarB.a).write(bArr2);
            }
            long jA = tn21Var.a();
            if (jA == -1 && z) {
                fbcVar2.getClass();
                fbcVar2.a();
                return -1L;
            }
            nacVar.write(bArr2);
            if (z) {
                j += jA;
            } else {
                tn21Var.d(nacVar);
            }
            nacVar.write(bArr2);
            i2++;
        }
    }
}
