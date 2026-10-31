package p;

import com.google.protobuf.h;
import com.spotify.agentgateway.v1.InteractionReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class bs2 {
    public static final r8i0 a;
    public static final byte[] b;

    static {
        se11 se11Var = r8i0.e;
        a = bmq0.w("application/x-protobuf");
        b = new byte[]{-8, -15, 4, 0};
    }

    public static final void a(wjn wjnVar, dt2 dt2Var) {
        if (dt2Var != null) {
            g(dt2Var, new yr2(wjnVar, (byte) 0), new yr2(wjnVar, (byte) 1), new yr2(wjnVar, (byte) 2));
        }
    }

    public static final void b(hm40 hm40Var, dt2 dt2Var) {
        if (dt2Var != null) {
            g(dt2Var, new xr2(hm40Var, (byte) 0), new xr2(hm40Var, (byte) 1), new xr2(hm40Var, (byte) 2));
        }
    }

    public static final void c(h461 h461Var, dt2 dt2Var) {
        if (dt2Var != null) {
            g(dt2Var, new zr2(h461Var, (byte) 0), new zr2(h461Var, (byte) 1), new zr2(h461Var, (byte) 2));
        }
    }

    public static final void d(k461 k461Var, dt2 dt2Var) {
        if (dt2Var != null) {
            g(dt2Var, new as2(k461Var, (byte) 0), new as2(k461Var, (byte) 1), new as2(k461Var, (byte) 2));
        }
    }

    public static final sn21 e(h hVar) {
        byte[] byteArray = hVar.toByteArray();
        byteArray.getClass();
        if (byteArray.length == 0) {
            byteArray = b;
        }
        byteArray.getClass();
        return zov0.d(6, a, byteArray);
    }

    public static final InteractionReference f(us2 us2Var) {
        dw80 dw80VarN = InteractionReference.n();
        String str = us2Var.a;
        if (str != null) {
            if (ihc1.y0(str)) {
                str = null;
            }
            if (str != null) {
                dw80VarN.q(str);
            }
        }
        dw80VarN.n(us2Var.b.booleanValue());
        String str2 = us2Var.c;
        if (str2 != null) {
            String str3 = ihc1.y0(str2) ? null : str2;
            if (str3 != null) {
                dw80VarN.r(str3);
            }
        }
        Integer num = us2Var.d;
        if (num != null) {
            dw80VarN.s(num.intValue());
        }
        return (InteractionReference) dw80VarN.build();
    }

    public static final void g(dt2 dt2Var, iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3) {
        String str = dt2Var.a;
        if (str != null) {
            if (ihc1.y0(str)) {
                str = null;
            }
            if (str != null) {
                iu30Var.invoke(str);
            }
        }
        String str2 = dt2Var.b;
        if (str2 != null) {
            if (ihc1.y0(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                iu30Var2.invoke(str2);
            }
        }
        String str3 = dt2Var.c;
        if (str3 != null) {
            String str4 = ihc1.y0(str3) ? null : str3;
            if (str4 != null) {
                iu30Var3.invoke(str4);
            }
        }
    }
}
