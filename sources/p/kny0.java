package p;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kny0 {
    public static final rhc b = new rhc(Arrays.copyOf(new byte[]{42}, 1));
    public static final List c = Collections.singletonList("*");
    public static final kny0 d = new kny0(new p2o0());
    public final p2o0 a;

    public kny0(p2o0 p2o0Var) {
        this.a = p2o0Var;
    }

    public static List b(String str) {
        List listP0 = ihc1.P0(str, new char[]{'.'}, 6);
        return u890.j(o7h.A0(listP0), "") ? o7h.l0(1, listP0) : listP0;
    }

    public final String a(String str) {
        String strK;
        String strK2;
        String strK3;
        List listP0;
        int size;
        int size2;
        String unicode = IDN.toUnicode(str);
        unicode.getClass();
        List listB = b(unicode);
        p2o0 p2o0Var = this.a;
        AtomicBoolean atomicBoolean = (AtomicBoolean) p2o0Var.b;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            try {
                ((CountDownLatch) p2o0Var.c).await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        p2o0Var.N();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z = true;
                    } catch (IOException e) {
                        p2o0Var.f = e;
                        if (z) {
                        }
                    }
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        if (((rhc) p2o0Var.d) == null) {
            StringBuilder sb = new StringBuilder("Unable to load ");
            sb.append(p2o0Var.g);
            sb.append(" resource.");
            IllegalStateException illegalStateException = new IllegalStateException(sb.toString());
            illegalStateException.initCause((IOException) p2o0Var.f);
            throw illegalStateException;
        }
        int size3 = listB.size();
        rhc[] rhcVarArr = new rhc[size3];
        for (int i = 0; i < size3; i++) {
            String str2 = (String) listB.get(i);
            rhc rhcVar = new rhc(str2.getBytes(nne.a));
            rhcVar.c = str2;
            rhcVarArr[i] = rhcVar;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= size3) {
                strK = null;
                break;
            }
            rhc rhcVar2 = (rhc) p2o0Var.d;
            if (rhcVar2 == null) {
                u890.C("bytes");
                throw null;
            }
            strK = s3o1.k(rhcVar2, rhcVarArr, i2);
            if (strK != null) {
                break;
            }
            i2++;
        }
        if (size3 <= 1) {
            strK2 = null;
            break;
        }
        rhc[] rhcVarArr2 = (rhc[]) rhcVarArr.clone();
        int length = rhcVarArr2.length - 1;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                strK2 = null;
                break;
            }
            rhcVarArr2[i3] = b;
            rhc rhcVar3 = (rhc) p2o0Var.d;
            if (rhcVar3 == null) {
                u890.C("bytes");
                throw null;
            }
            strK2 = s3o1.k(rhcVar3, rhcVarArr2, i3);
            if (strK2 != null) {
                break;
            }
            i3++;
        }
        if (strK2 == null) {
            strK3 = null;
            break;
        }
        int i4 = size3 - 1;
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                strK3 = null;
                break;
            }
            rhc rhcVar4 = (rhc) p2o0Var.e;
            if (rhcVar4 == null) {
                u890.C("exceptionBytes");
                throw null;
            }
            strK3 = s3o1.k(rhcVar4, rhcVarArr, i5);
            if (strK3 != null) {
                break;
            }
            i5++;
        }
        if (strK3 != null) {
            listP0 = ihc1.P0("!".concat(strK3), new char[]{'.'}, 6);
        } else if (strK == null && strK2 == null) {
            listP0 = c;
        } else {
            List listP1 = z6x.a;
            List listP2 = strK != null ? ihc1.P0(strK, new char[]{'.'}, 6) : listP1;
            if (strK2 != null) {
                listP1 = ihc1.P0(strK2, new char[]{'.'}, 6);
            }
            listP0 = listP2.size() > listP1.size() ? listP2 : listP1;
        }
        if (listB.size() == listP0.size() && ((String) listP0.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listP0.get(0)).charAt(0) == '!') {
            size = listB.size();
            size2 = listP0.size();
        } else {
            size = listB.size();
            size2 = listP0.size() + 1;
        }
        return z561.d0(z561.S(new i46(b(str), (byte) 1), size - size2), ".");
    }
}
