package p;

import j$.util.DesugarTimeZone;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class z4n1 {
    public static final TimeZone a;
    public static final String b;

    static {
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        timeZone.getClass();
        a = timeZone;
        b = ihc1.J0(ihc1.H0(azp0.class.getName(), "okhttp3."), "Client");
    }

    public static final boolean a(l370 l370Var, l370 l370Var2) {
        return u890.j(l370Var.d, l370Var2.d) && l370Var.e == l370Var2.e && u890.j(l370Var.a, l370Var2.a);
    }

    public static final int b(String str, long j, TimeUnit timeUnit) {
        if (j < 0) {
            bhn0.f(str.concat(" < 0"));
            return 0;
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            hhg1.f(str.concat(" too large"));
            return 0;
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        hhg1.f(str.concat(" too small"));
        return 0;
    }

    public static final void c(Socket socket) {
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!u890.j(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    public static final String d(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final long e(ry21 ry21Var) {
        String strC = ry21Var.f.c("Content-Length");
        if (strC == null) {
            return -1L;
        }
        byte[] bArr = w4n1.a;
        try {
            return Long.parseLong(strC);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final Charset f(gbc gbcVar, Charset charset) {
        int iS0 = gbcVar.s0(w4n1.b);
        if (iS0 == -1) {
            return charset;
        }
        if (iS0 == 0) {
            return nne.a;
        }
        if (iS0 == 1) {
            return nne.b;
        }
        if (iS0 == 2) {
            Charset charset2 = nne.a;
            Charset charset3 = nne.f;
            if (charset3 != null) {
                return charset3;
            }
            Charset charsetForName = Charset.forName("UTF-32LE");
            nne.f = charsetForName;
            return charsetForName;
        }
        if (iS0 == 3) {
            return nne.c;
        }
        if (iS0 != 4) {
            hhg1.c();
            return null;
        }
        Charset charset4 = nne.a;
        Charset charset5 = nne.g;
        if (charset5 != null) {
            return charset5;
        }
        Charset charsetForName2 = Charset.forName("UTF-32BE");
        nne.g = charsetForName2;
        return charsetForName2;
    }

    public static final boolean g(fka1 fka1Var, int i) {
        long jNanoTime = System.nanoTime();
        long jC = fka1Var.l().e() ? fka1Var.l().c() - jNanoTime : Long.MAX_VALUE;
        fka1Var.l().d(Math.min(jC, TimeUnit.MILLISECONDS.toNanos(i)) + jNanoTime);
        try {
            nac nacVar = new nac();
            while (fka1Var.O0(nacVar, 8192L) != -1) {
                nacVar.a();
            }
            if (jC == Long.MAX_VALUE) {
                fka1Var.l().a();
                return true;
            }
            fka1Var.l().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                fka1Var.l().a();
                return false;
            }
            fka1Var.l().d(jNanoTime + jC);
            return false;
        } catch (Throwable th) {
            if (jC == Long.MAX_VALUE) {
                fka1Var.l().a();
            } else {
                fka1Var.l().d(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static final v360 h(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cv50 cv50Var = (cv50) it.next();
            rhc rhcVar = cv50Var.a;
            rhc rhcVar2 = cv50Var.b;
            String strR = rhcVar.r();
            String strR2 = rhcVar2.r();
            arrayList.add(strR);
            arrayList.add(ihc1.e1(strR2).toString());
        }
        return new v360((String[]) arrayList.toArray(new String[0]));
    }

    public static final String i(l370 l370Var, boolean z) {
        int i;
        int i2 = l370Var.e;
        String strN = l370Var.d;
        if (ihc1.h0(strN, ":", false)) {
            strN = cy30.n("[", strN, ']');
        }
        if (!z) {
            String str = l370Var.a;
            if (str.equals("http")) {
                i = 80;
            } else {
                i = str.equals(m3i1.b) ? 443 : -1;
            }
            if (i2 == i) {
                return strN;
            }
        }
        return strN + ':' + i2;
    }

    public static final List j(List list) {
        if (list.isEmpty()) {
            return z6x.a;
        }
        return list.size() == 1 ? Collections.singletonList(list.get(0)) : Collections.unmodifiableList(f46.H(list.toArray()));
    }

    public static final List k(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return z6x.a;
        }
        return objArr.length == 1 ? Collections.singletonList(objArr[0]) : Collections.unmodifiableList(f46.H((Object[]) objArr.clone()));
    }
}
