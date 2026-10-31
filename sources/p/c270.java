package p;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class c270 implements Closeable {
    public static final Logger d = Logger.getLogger(o170.class.getName());
    public final ff01 a;
    public final b270 b;
    public final vy60 c;

    public c270(ff01 ff01Var) {
        this.a = ff01Var;
        b270 b270Var = new b270(ff01Var);
        this.b = b270Var;
        this.c = new vy60(b270Var);
    }

    public final boolean a(boolean z, y170 y170Var) throws Exception {
        int i;
        int i2;
        Object[] array;
        try {
            this.a.q(9L);
            int iN = w4n1.n(this.a);
            if (iN > 16384) {
                k220.i(f4i1.c(iN, "FRAME_SIZE_ERROR: "));
                return false;
            }
            int iD = this.a.d() & 255;
            byte bD = this.a.d();
            int i3 = bD & 255;
            int iG = this.a.g();
            int i4 = Integer.MAX_VALUE & iG;
            if (iD != 8) {
                Logger logger = d;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(o170.b(true, i4, iN, iD, i3));
                }
            }
            if (z && iD != 4) {
                k220.h(o170.a(iD), "Expected a SETTINGS frame but was ");
                return false;
            }
            switch (iD) {
                case 0:
                    c(y170Var, iN, i3, i4);
                    return true;
                case 1:
                    e(y170Var, iN, i3, i4);
                    return true;
                case 2:
                    if (iN != 5) {
                        k220.i(gvg.e(iN, "TYPE_PRIORITY length: ", " != 5"));
                        return false;
                    }
                    if (i4 == 0) {
                        k220.i("TYPE_PRIORITY streamId == 0");
                        return false;
                    }
                    ff01 ff01Var = this.a;
                    ff01Var.g();
                    ff01Var.d();
                    return true;
                case 3:
                    if (iN != 4) {
                        k220.i(gvg.e(iN, "TYPE_RST_STREAM length: ", " != 4"));
                        return false;
                    }
                    if (i4 == 0) {
                        k220.i("TYPE_RST_STREAM streamId == 0");
                        return false;
                    }
                    int iG2 = this.a.g();
                    int[] iArrH = l1d.H(14);
                    int length = iArrH.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 < length) {
                            i = iArrH[i5];
                            if (gvg.a(i) != iG2) {
                                i5++;
                            }
                        } else {
                            i = 0;
                        }
                    }
                    if (i == 0) {
                        k220.i(f4i1.c(iG2, "TYPE_RST_STREAM unexpected error code: "));
                        return false;
                    }
                    z170 z170Var = (z170) y170Var.c;
                    if (i4 != 0 && (iG & 1) == 0) {
                        hsd1.c(z170Var.i, z170Var.c + '[' + i4 + "] onReset", 0L, new u170(z170Var, i4, i), 6);
                        return true;
                    }
                    g270 g270VarD = z170Var.d(i4);
                    if (g270VarD != null) {
                        synchronized (g270VarD) {
                            if (g270VarD.f() == 0) {
                                g270VarD.Y = i;
                                g270VarD.notifyAll();
                            }
                            break;
                        }
                        return true;
                    }
                    return true;
                case 4:
                    ff01 ff01Var2 = this.a;
                    if (i4 != 0) {
                        k220.i("TYPE_SETTINGS streamId != 0");
                        return false;
                    }
                    if ((bD & 1) != 0) {
                        if (iN != 0) {
                            k220.i("FRAME_SIZE_ERROR ack frame should be empty!");
                            return false;
                        }
                        return true;
                    }
                    if (iN % 6 != 0) {
                        k220.i(f4i1.c(iN, "TYPE_SETTINGS length % 6 != 0: "));
                        return false;
                    }
                    im61 im61Var = new im61();
                    rr80 rr80VarO = yoi1.O(yoi1.Q(0, iN), 6);
                    int i6 = rr80VarO.a;
                    int i7 = rr80VarO.b;
                    int i8 = rr80VarO.c;
                    if ((i8 > 0 && i6 <= i7) || (i8 < 0 && i7 <= i6)) {
                        while (true) {
                            short sJ = ff01Var2.j();
                            byte[] bArr = w4n1.a;
                            int i9 = sJ & 65535;
                            int iG3 = ff01Var2.g();
                            if (i9 != 2) {
                                if (i9 != 4) {
                                    if (i9 == 5 && (iG3 < 16384 || iG3 > 16777215)) {
                                        k220.i(f4i1.c(iG3, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                                        return false;
                                    }
                                } else if (iG3 < 0) {
                                    k220.i("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                    return false;
                                }
                            } else if (iG3 != 0 && iG3 != 1) {
                                k220.i("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                return false;
                            }
                            im61Var.b(i9, iG3);
                            if (i6 != i7) {
                                i6 += i8;
                            }
                        }
                    }
                    z170 z170Var2 = (z170) y170Var.c;
                    hsd1.c(z170Var2.h, l1d.n(z170Var2.c, " applyAndAckSettings", new StringBuilder()), 0L, new og(y170Var, im61Var, (byte) 28), 6);
                    return true;
                case 5:
                    f(y170Var, iN, i3, i4);
                    return true;
                case 6:
                    if (iN != 8) {
                        k220.i(f4i1.c(iN, "TYPE_PING length != 8: "));
                        return false;
                    }
                    if (i4 != 0) {
                        k220.i("TYPE_PING streamId != 0");
                        return false;
                    }
                    int iG4 = this.a.g();
                    int iG5 = this.a.g();
                    i = (bD & 1) != 0 ? 1 : 0;
                    z170 z170Var3 = (z170) y170Var.c;
                    if (i == 0) {
                        hsd1.c(z170Var3.h, l1d.n(((z170) y170Var.c).c, " ping", new StringBuilder()), 0L, new r170((z170) y170Var.c, iG4, iG5, (byte) 1), 6);
                        return true;
                    }
                    synchronized (z170Var3) {
                        try {
                            if (iG4 == 1) {
                                z170Var3.Z++;
                            } else if (iG4 == 2) {
                                z170Var3.O0++;
                            } else if (iG4 == 3) {
                                z170Var3.notifyAll();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return true;
                case 7:
                    if (iN < 8) {
                        k220.i(f4i1.c(iN, "TYPE_GOAWAY length < 8: "));
                        return false;
                    }
                    if (i4 != 0) {
                        k220.i("TYPE_GOAWAY streamId != 0");
                        return false;
                    }
                    int iG6 = this.a.g();
                    int iG7 = this.a.g();
                    int i10 = iN - 8;
                    int[] iArrH2 = l1d.H(14);
                    int length2 = iArrH2.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 < length2) {
                            i2 = iArrH2[i11];
                            if (gvg.a(i2) != iG7) {
                                i11++;
                            }
                        } else {
                            i2 = 0;
                        }
                    }
                    if (i2 == 0) {
                        k220.i(f4i1.c(iG7, "TYPE_GOAWAY unexpected error code: "));
                        return false;
                    }
                    rhc rhcVarE = rhc.d;
                    if (i10 > 0) {
                        rhcVarE = this.a.e(i10);
                    }
                    rhcVarE.d();
                    z170 z170Var4 = (z170) y170Var.c;
                    synchronized (z170Var4) {
                        array = z170Var4.b.values().toArray(new g270[0]);
                        z170Var4.f = true;
                    }
                    for (g270 g270Var : (g270[]) array) {
                        if (g270Var.a > iG6 && g270Var.g()) {
                            synchronized (g270Var) {
                                if (g270Var.f() == 0) {
                                    g270Var.Y = 8;
                                    g270Var.notifyAll();
                                }
                                break;
                            }
                            ((z170) y170Var.c).d(g270Var.a);
                        }
                    }
                    return true;
                case 8:
                    try {
                        if (iN != 4) {
                            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + iN);
                        }
                        long jG = 2147483647L & ((long) this.a.g());
                        if (jG == 0) {
                            throw new IOException("windowSizeIncrement was 0");
                        }
                        Logger logger2 = d;
                        if (logger2.isLoggable(Level.FINE)) {
                            logger2.fine(o170.c(i4, iN, jG, true));
                        }
                        z170 z170Var5 = (z170) y170Var.c;
                        if (i4 == 0) {
                            synchronized (z170Var5) {
                                z170Var5.V0 += jG;
                                z170Var5.notifyAll();
                            }
                            return true;
                        }
                        g270 g270VarC = z170Var5.c(i4);
                        if (g270VarC != null) {
                            synchronized (g270VarC) {
                                g270VarC.e += jG;
                                if (jG > 0) {
                                    g270VarC.notifyAll();
                                }
                                break;
                            }
                            return true;
                        }
                        return true;
                    } catch (Exception e) {
                        d.fine(o170.b(true, i4, iN, 8, i3));
                        throw e;
                    }
                default:
                    this.a.skip(iN);
                    return true;
            }
        } catch (EOFException unused) {
        }
    }

    public final void c(y170 y170Var, int i, int i2, int i3) {
        int i4;
        boolean z;
        boolean z2;
        if (i3 == 0) {
            k220.i("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
            return;
        }
        boolean z3 = true;
        if ((i2 & 1) == 0) {
            z3 = false;
        }
        if ((i2 & 32) != 0) {
            k220.i("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
            return;
        }
        if ((i2 & 8) != 0) {
            byte bD = this.a.d();
            byte[] bArr = w4n1.a;
            i4 = bD & 255;
        } else {
            i4 = 0;
        }
        int iH = bmq0.H(i, i2, i4);
        ff01 ff01Var = this.a;
        z170 z170Var = (z170) y170Var.c;
        if (i3 != 0 && (i3 & 1) == 0) {
            nac nacVar = new nac();
            long j = iH;
            ff01Var.q(j);
            ff01Var.O0(nacVar, j);
            hsd1.c(z170Var.i, z170Var.c + '[' + i3 + "] onData", 0L, new s170(z170Var, i3, nacVar, iH, z3), 6);
        } else {
            g270 g270VarC = z170Var.c(i3);
            if (g270VarC == null) {
                ((z170) y170Var.c).h(i3, 2);
                long j2 = iH;
                ((z170) y170Var.c).f(j2);
                ff01Var.skip(j2);
            } else {
                TimeZone timeZone = z4n1.a;
                e270 e270Var = g270VarC.h;
                long j3 = iH;
                e270Var.getClass();
                long j4 = j3;
                while (true) {
                    g270 g270Var = e270Var.f;
                    if (j4 <= 0) {
                        TimeZone timeZone2 = z4n1.a;
                        g270Var.b.f(j3);
                        e270Var.f.b.Q0.getClass();
                        break;
                    }
                    synchronized (g270Var) {
                        z = e270Var.b;
                        z2 = e270Var.d.b + j4 > e270Var.a;
                    }
                    if (z2) {
                        ff01Var.skip(j4);
                        e270Var.f.e(4);
                        break;
                    }
                    if (z) {
                        ff01Var.skip(j4);
                        break;
                    }
                    long jO0 = ff01Var.O0(e270Var.c, j4);
                    if (jO0 == -1) {
                        eg.l();
                        return;
                    }
                    j4 -= jO0;
                    g270 g270Var2 = e270Var.f;
                    synchronized (g270Var2) {
                        try {
                            if (e270Var.e) {
                                e270Var.c.a();
                            } else {
                                nac nacVar2 = e270Var.d;
                                boolean z4 = nacVar2.b == 0;
                                nacVar2.B(e270Var.c);
                                if (z4) {
                                    g270Var2.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (z3) {
                    g270VarC.i(v360.b, true);
                }
            }
        }
        this.a.skip(i4);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    public final List d(int i, int i2, int i3, int i4) throws IOException {
        b270 b270Var = this.b;
        b270Var.e = i;
        b270Var.b = i;
        b270Var.f = i2;
        b270Var.c = i3;
        b270Var.d = i4;
        vy60 vy60Var = this.c;
        ff01 ff01Var = vy60Var.c;
        ArrayList arrayList = vy60Var.b;
        while (!ff01Var.z0()) {
            byte bD = ff01Var.d();
            byte[] bArr = w4n1.a;
            int i5 = bD & 255;
            if (i5 == 128) {
                k220.i("index == 0");
                return null;
            }
            if ((bD & 128) == 128) {
                int iE = vy60Var.e(i5, 127);
                int i6 = iE - 1;
                if (i6 >= 0) {
                    cv50[] cv50VarArr = xy60.a;
                    if (i6 <= cv50VarArr.length - 1) {
                        arrayList.add(cv50VarArr[i6]);
                    }
                }
                int length = vy60Var.e + 1 + (i6 - xy60.a.length);
                if (length >= 0) {
                    cv50[] cv50VarArr2 = vy60Var.d;
                    if (length < cv50VarArr2.length) {
                        cv50 cv50Var = cv50VarArr2[length];
                        cv50Var.getClass();
                        arrayList.add(cv50Var);
                    }
                }
                k220.i(f4i1.c(iE, "Header index too large "));
                return null;
            }
            if (i5 == 64) {
                cv50[] cv50VarArr3 = xy60.a;
                rhc rhcVarD = vy60Var.d();
                xy60.a(rhcVarD);
                vy60Var.c(new cv50(rhcVarD, vy60Var.d()));
            } else if ((bD & 64) == 64) {
                vy60Var.c(new cv50(vy60Var.b(vy60Var.e(i5, 63) - 1), vy60Var.d()));
            } else if ((bD & 32) == 32) {
                int iE2 = vy60Var.e(i5, 31);
                vy60Var.a = iE2;
                if (iE2 < 0 || iE2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + vy60Var.a);
                }
                int i7 = vy60Var.g;
                if (iE2 < i7) {
                    if (iE2 == 0) {
                        f46.h0(vy60Var.d, null);
                        vy60Var.e = vy60Var.d.length - 1;
                        vy60Var.f = 0;
                        vy60Var.g = 0;
                    } else {
                        vy60Var.a(i7 - iE2);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                cv50[] cv50VarArr4 = xy60.a;
                rhc rhcVarD2 = vy60Var.d();
                xy60.a(rhcVarD2);
                arrayList.add(new cv50(rhcVarD2, vy60Var.d()));
            } else {
                arrayList.add(new cv50(vy60Var.b(vy60Var.e(i5, 15) - 1), vy60Var.d()));
            }
        }
        List listL1 = o7h.l1(arrayList);
        arrayList.clear();
        return listL1;
    }

    public final void e(y170 y170Var, int i, int i2, int i3) throws Throwable {
        int i4;
        int i5;
        z170 z170Var;
        if (i3 == 0) {
            k220.i("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
            return;
        }
        boolean z = false;
        boolean z2 = true;
        if ((i2 & 1) == 0) {
            z2 = false;
        }
        if ((i2 & 8) != 0) {
            byte bD = this.a.d();
            byte[] bArr = w4n1.a;
            i4 = bD & 255;
        } else {
            i4 = 0;
        }
        if ((i2 & 32) != 0) {
            ff01 ff01Var = this.a;
            ff01Var.g();
            ff01Var.d();
            byte[] bArr2 = w4n1.a;
            i5 = i - 5;
        } else {
            i5 = i;
        }
        List listD = d(bmq0.H(i5, i2, i4), i4, i2, i3);
        z170 z170Var2 = (z170) y170Var.c;
        if (i3 != 0 && (i3 & 1) == 0) {
            z = true;
        }
        if (z) {
            hsd1.c(z170Var2.i, z170Var2.c + '[' + i3 + "] onHeaders", 0L, new t170(z170Var2, i3, listD, z2), 6);
            return;
        }
        synchronized (z170Var2) {
            try {
                g270 g270VarC = z170Var2.c(i3);
                if (g270VarC != null) {
                    g270VarC.i(z4n1.h(listD), z2);
                    return;
                }
                if (z170Var2.f) {
                    return;
                }
                if (i3 <= z170Var2.d) {
                    return;
                }
                if (i3 % 2 == z170Var2.e % 2) {
                    return;
                }
                z170Var = z170Var2;
                try {
                    g270 g270Var = new g270(i3, z170Var, false, z2, z4n1.h(listD));
                    z170Var.d = i3;
                    z170Var.b.put(Integer.valueOf(i3), g270Var);
                    hsd1.c(z170Var.g.d(), z170Var.c + '[' + i3 + "] onStream", 0L, new og(z170Var, g270Var, (byte) 27), 6);
                    return;
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
                z170Var = z170Var2;
            }
            Throwable th3 = th;
            throw th3;
        }
    }

    public final void f(y170 y170Var, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            k220.i("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
            return;
        }
        if ((i2 & 8) != 0) {
            byte bD = this.a.d();
            byte[] bArr = w4n1.a;
            i4 = bD & 255;
        } else {
            i4 = 0;
        }
        int iG = this.a.g() & Integer.MAX_VALUE;
        List listD = d(bmq0.H(i - 4, i2, i4), i4, i2, i3);
        z170 z170Var = (z170) y170Var.c;
        synchronized (z170Var) {
            if (z170Var.Z0.contains(Integer.valueOf(iG))) {
                z170Var.h(iG, 2);
                return;
            }
            z170Var.Z0.add(Integer.valueOf(iG));
            hsd1.c(z170Var.i, z170Var.c + '[' + iG + "] onRequest", 0L, new t170(z170Var, iG, listD), 6);
        }
    }
}
