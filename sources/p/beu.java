package p;

import java.io.Closeable;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TimeZone;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class beu implements Closeable, Flushable {
    public static final se11 T0 = new se11("[a-z0-9_-]{1,120}");
    public static final String U0 = "CLEAN";
    public static final String V0 = "DIRTY";
    public static final String W0 = "REMOVE";
    public static final String X0 = "READ";
    public boolean N0;
    public boolean O0;
    public boolean P0;
    public long Q0;
    public final hsd1 R0;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final s8s0 a;
    public final zdu b;
    public final long c;
    public final s8s0 d;
    public final s8s0 e;
    public final s8s0 f;
    public long g;
    public df01 h;
    public int t;
    public final LinkedHashMap i = new LinkedHashMap(0, 0.75f, true);
    public final ydu S0 = new ydu(0, this, l1d.n(z4n1.b, " Cache", new StringBuilder()));

    public beu(i520 i520Var, s8s0 s8s0Var, long j, isd1 isd1Var) {
        this.a = s8s0Var;
        this.b = new zdu(i520Var);
        this.c = j;
        this.R0 = isd1Var.d();
        if (j <= 0) {
            hhg1.n("maxSize <= 0");
            throw null;
        }
        this.d = s8s0Var.e("journal");
        this.e = s8s0Var.e("journal.tmp");
        this.f = s8s0Var.e("journal.bkp");
    }

    public static void q(String str) {
        if (T0.e(str)) {
            return;
        }
        hhg1.f(cy30.n("keys must match regex [a-z0-9_-]{1,120}: \"", str, '\"'));
    }

    public final synchronized void a() {
        if (this.N0) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized void c(y861 y861Var, boolean z) {
        udu uduVar = (udu) y861Var.b;
        if (!u890.j(uduVar.g, y861Var)) {
            throw new IllegalStateException("Check failed.");
        }
        if (z && !uduVar.e) {
            for (int i = 0; i < 2; i++) {
                boolean[] zArr = (boolean[]) y861Var.c;
                zArr.getClass();
                if (!zArr[i]) {
                    y861Var.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                zdu zduVar = this.b;
                s8s0 s8s0Var = (s8s0) uduVar.d.get(i);
                zduVar.getClass();
                if (!ero1.j(zduVar, s8s0Var)) {
                    y861Var.a();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < 2; i2++) {
            s8s0 s8s0Var2 = (s8s0) uduVar.d.get(i2);
            if (!z || uduVar.f) {
                zdu zduVar2 = this.b;
                byte[] bArr = w4n1.a;
                try {
                    zduVar2.e(s8s0Var2);
                } catch (FileNotFoundException unused) {
                }
            } else {
                zdu zduVar3 = this.b;
                zduVar3.getClass();
                if (ero1.j(zduVar3, s8s0Var2)) {
                    s8s0 s8s0Var3 = (s8s0) uduVar.c.get(i2);
                    this.b.c(s8s0Var2, s8s0Var3);
                    long j = uduVar.b[i2];
                    zdu zduVar4 = this.b;
                    zduVar4.getClass();
                    Long l = (Long) ero1.k(zduVar4, s8s0Var3).e;
                    long jLongValue = l != null ? l.longValue() : 0L;
                    uduVar.b[i2] = jLongValue;
                    this.g = (this.g - j) + jLongValue;
                }
            }
        }
        uduVar.g = null;
        if (uduVar.f) {
            o(uduVar);
            return;
        }
        this.t++;
        df01 df01Var = this.h;
        df01Var.getClass();
        if (uduVar.e || z) {
            uduVar.e = true;
            df01Var.Q(U0);
            df01Var.writeByte(32);
            df01Var.Q(uduVar.a);
            for (long j2 : uduVar.b) {
                df01Var.writeByte(32);
                df01Var.m0(j2);
            }
            df01Var.writeByte(10);
            if (z) {
                long j3 = this.Q0;
                this.Q0 = 1 + j3;
                uduVar.i = j3;
            }
        } else {
            this.i.remove(uduVar.a);
            df01Var.Q(W0);
            df01Var.writeByte(32);
            df01Var.Q(uduVar.a);
            df01Var.writeByte(10);
        }
        df01Var.flush();
        if (this.g > this.c || g()) {
            this.R0.d(this.S0, 0L);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.Z && !this.N0) {
                for (udu uduVar : (udu[]) this.i.values().toArray(new udu[0])) {
                    uduVar.getClass();
                    y861 y861Var = uduVar.g;
                    if (y861Var != null) {
                        y861Var.f();
                    }
                }
                p();
                df01 df01Var = this.h;
                if (df01Var != null) {
                    w4n1.b(df01Var);
                }
                this.h = null;
                this.N0 = true;
                return;
            }
            this.N0 = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized y861 d(long j, String str) {
        f();
        a();
        q(str);
        udu uduVar = (udu) this.i.get(str);
        if (j != -1 && (uduVar == null || uduVar.i != j)) {
            return null;
        }
        if ((uduVar != null ? uduVar.g : null) != null) {
            return null;
        }
        if (uduVar != null && uduVar.h != 0) {
            return null;
        }
        if (!this.O0 && !this.P0) {
            df01 df01Var = this.h;
            df01Var.getClass();
            df01Var.Q(V0);
            df01Var.writeByte(32);
            df01Var.Q(str);
            df01Var.writeByte(10);
            df01Var.flush();
            if (this.X) {
                return null;
            }
            if (uduVar == null) {
                uduVar = new udu(this, str);
                this.i.put(str, uduVar);
            }
            y861 y861Var = new y861(this, uduVar);
            uduVar.g = y861Var;
            return y861Var;
        }
        this.R0.d(this.S0, 0L);
        return null;
    }

    public final synchronized wdu e(String str) {
        f();
        a();
        q(str);
        udu uduVar = (udu) this.i.get(str);
        if (uduVar == null) {
            return null;
        }
        wdu wduVarA = uduVar.a();
        if (wduVarA == null) {
            return null;
        }
        this.t++;
        df01 df01Var = this.h;
        df01Var.getClass();
        df01Var.Q(X0);
        df01Var.writeByte(32);
        df01Var.Q(str);
        df01Var.writeByte(10);
        if (g()) {
            this.R0.d(this.S0, 0L);
        }
        return wduVarA;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0062 A[Catch: all -> 0x002b, TRY_ENTER, TryCatch #6 {all -> 0x002b, blocks: (B:3:0x0001, B:7:0x0009, B:9:0x0016, B:12:0x0027, B:15:0x002e, B:16:0x0033, B:37:0x0066, B:39:0x0075, B:49:0x00a1, B:43:0x0080, B:45:0x009a, B:47:0x009e, B:48:0x00a0, B:36:0x0062, B:52:0x00a8, B:27:0x0051, B:24:0x004c, B:44:0x0090, B:18:0x003f), top: B:64:0x0001, inners: #0, #4, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a8 A[Catch: all -> 0x002b, TRY_ENTER, TryCatch #6 {all -> 0x002b, blocks: (B:3:0x0001, B:7:0x0009, B:9:0x0016, B:12:0x0027, B:15:0x002e, B:16:0x0033, B:37:0x0066, B:39:0x0075, B:49:0x00a1, B:43:0x0080, B:45:0x009a, B:47:0x009e, B:48:0x00a0, B:36:0x0062, B:52:0x00a8, B:27:0x0051, B:24:0x004c, B:44:0x0090, B:18:0x003f), top: B:64:0x0001, inners: #0, #4, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final synchronized void f() {
        boolean z;
        zdu zduVar;
        s8s0 s8s0Var;
        try {
            TimeZone timeZone = z4n1.a;
            if (this.Z) {
                return;
            }
            zdu zduVar2 = this.b;
            s8s0 s8s0Var2 = this.f;
            zduVar2.getClass();
            if (ero1.j(zduVar2, s8s0Var2)) {
                zdu zduVar3 = this.b;
                s8s0 s8s0Var3 = this.d;
                zduVar3.getClass();
                boolean zJ = ero1.j(zduVar3, s8s0Var3);
                zdu zduVar4 = this.b;
                s8s0 s8s0Var4 = this.f;
                if (zJ) {
                    zduVar4.e(s8s0Var4);
                } else {
                    zduVar4.c(s8s0Var4, this.d);
                }
            }
            zdu zduVar5 = this.b;
            s8s0 s8s0Var5 = this.f;
            byte[] bArr = w4n1.a;
            c291 c291VarI = zduVar5.i(s8s0Var5, false);
            try {
                zduVar5.e(s8s0Var5);
                if (c291VarI != null) {
                    try {
                        c291VarI.close();
                    } catch (Throwable unused) {
                    }
                }
                z = true;
            } catch (IOException unused2) {
                if (c291VarI != null) {
                    try {
                        c291VarI.close();
                    } catch (Throwable th) {
                        th = th;
                        th = th;
                        if (th != null) {
                            throw th;
                        }
                        zduVar5.e(s8s0Var5);
                        z = false;
                        this.Y = z;
                        zduVar = this.b;
                        s8s0Var = this.d;
                        zduVar.getClass();
                        if (ero1.j(zduVar, s8s0Var)) {
                            try {
                                i();
                                h();
                                this.Z = true;
                                return;
                            } catch (IOException e) {
                                nct0 nct0Var = nct0.a;
                                nct0 nct0Var2 = nct0.a;
                                this.a.toString();
                                e.getMessage();
                                nct0Var2.i(5);
                                try {
                                    close();
                                    w4n1.c(this.b, this.a);
                                    this.N0 = false;
                                    m();
                                    this.Z = true;
                                } catch (Throwable th2) {
                                    this.N0 = false;
                                    throw th2;
                                }
                            }
                        }
                        m();
                        this.Z = true;
                    }
                }
                th = null;
                th = th;
                if (th != null) {
                    throw th;
                }
                zduVar5.e(s8s0Var5);
                z = false;
            } catch (Throwable th3) {
                th = th3;
                if (c291VarI != null) {
                    try {
                        c291VarI.close();
                    } catch (Throwable th4) {
                        j2h1.h(th, th4);
                    }
                }
                if (th != null) {
                    throw th;
                }
                zduVar5.e(s8s0Var5);
                z = false;
                this.Y = z;
                zduVar = this.b;
                s8s0Var = this.d;
                zduVar.getClass();
                if (ero1.j(zduVar, s8s0Var)) {
                    i();
                    h();
                    this.Z = true;
                    return;
                }
                m();
                this.Z = true;
            }
            this.Y = z;
            zduVar = this.b;
            s8s0Var = this.d;
            zduVar.getClass();
            if (ero1.j(zduVar, s8s0Var)) {
                i();
                h();
                this.Z = true;
                return;
            }
            m();
            this.Z = true;
        } catch (Throwable th5) {
            throw th5;
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.Z) {
            a();
            p();
            df01 df01Var = this.h;
            df01Var.getClass();
            df01Var.flush();
        }
    }

    public final boolean g() {
        int i = this.t;
        return i >= 2000 && i >= this.i.size();
    }

    public final void h() {
        zdu zduVar = this.b;
        s8s0 s8s0Var = this.e;
        byte[] bArr = w4n1.a;
        try {
            zduVar.e(s8s0Var);
        } catch (FileNotFoundException unused) {
        }
        Iterator it = this.i.values().iterator();
        while (it.hasNext()) {
            udu uduVar = (udu) it.next();
            int i = 0;
            if (uduVar.g == null) {
                while (i < 2) {
                    this.g += uduVar.b[i];
                    i++;
                }
            } else {
                uduVar.g = null;
                while (i < 2) {
                    try {
                        zduVar.e((s8s0) uduVar.c.get(i));
                    } catch (FileNotFoundException unused2) {
                    }
                    try {
                        zduVar.e((s8s0) uduVar.d.get(i));
                    } catch (FileNotFoundException unused3) {
                    }
                    i++;
                }
                it.remove();
            }
        }
    }

    public final void i() throws Throwable {
        zdu zduVar = this.b;
        i520 i520Var = zduVar.c;
        s8s0 s8s0Var = this.d;
        ff01 ff01VarG = sj1.g(i520Var.j(s8s0Var));
        try {
            String strP = ff01VarG.p(Long.MAX_VALUE);
            String strP2 = ff01VarG.p(Long.MAX_VALUE);
            String strP3 = ff01VarG.p(Long.MAX_VALUE);
            String strP4 = ff01VarG.p(Long.MAX_VALUE);
            String strP5 = ff01VarG.p(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strP) || !"1".equals(strP2) || !u890.j(String.valueOf(201105), strP3) || !u890.j(String.valueOf(2), strP4) || strP5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strP + ", " + strP2 + ", " + strP4 + ", " + strP5 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    j(ff01VarG.p(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.t = i - this.i.size();
                    if (ff01VarG.z0()) {
                        df01 df01Var = this.h;
                        if (df01Var != null) {
                            w4n1.b(df01Var);
                        }
                        this.h = sj1.f(new ml10(zduVar.c.a(s8s0Var), new j6(this, (byte) 22)));
                    } else {
                        m();
                    }
                    try {
                        ff01VarG.close();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                ff01VarG.close();
            } catch (Throwable th3) {
                j2h1.h(th, th3);
            }
        }
        if (th != null) {
            throw th;
        }
    }

    public final void j(String str) {
        String strSubstring;
        int iV0 = ihc1.v0(str, ' ', 0, 6);
        if (iV0 == -1) {
            k220.i("unexpected journal line: ".concat(str));
            return;
        }
        int i = iV0 + 1;
        int iV1 = ihc1.v0(str, ' ', i, 4);
        LinkedHashMap linkedHashMap = this.i;
        if (iV1 == -1) {
            strSubstring = str.substring(i);
            String str2 = W0;
            if (iV0 == str2.length() && nhc1.Y(str, str2, false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iV1);
        }
        udu uduVar = (udu) linkedHashMap.get(strSubstring);
        if (uduVar == null) {
            uduVar = new udu(this, strSubstring);
            linkedHashMap.put(strSubstring, uduVar);
        }
        if (iV1 != -1) {
            String str3 = U0;
            if (iV0 == str3.length() && nhc1.Y(str, str3, false)) {
                List listP0 = ihc1.P0(str.substring(iV1 + 1), new char[]{' '}, 6);
                uduVar.e = true;
                uduVar.g = null;
                int size = listP0.size();
                uduVar.j.getClass();
                if (size != 2) {
                    hhg1.l(listP0, "unexpected journal line: ");
                    return;
                }
                try {
                    int size2 = listP0.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        uduVar.b[i2] = Long.parseLong((String) listP0.get(i2));
                    }
                    return;
                } catch (NumberFormatException unused) {
                    hhg1.l(listP0, "unexpected journal line: ");
                    return;
                }
            }
        }
        if (iV1 == -1) {
            String str4 = V0;
            if (iV0 == str4.length() && nhc1.Y(str, str4, false)) {
                uduVar.g = new y861(this, uduVar);
                return;
            }
        }
        if (iV1 == -1) {
            String str5 = X0;
            if (iV0 == str5.length() && nhc1.Y(str, str5, false)) {
                return;
            }
        }
        k220.i("unexpected journal line: ".concat(str));
    }

    public final synchronized void m() {
        Throwable th;
        try {
            df01 df01Var = this.h;
            if (df01Var != null) {
                df01Var.close();
            }
            df01 df01VarF = sj1.f(this.b.i(this.e, false));
            try {
                df01VarF.Q("libcore.io.DiskLruCache");
                df01VarF.writeByte(10);
                df01VarF.Q("1");
                df01VarF.writeByte(10);
                df01VarF.m0(201105L);
                df01VarF.writeByte(10);
                df01VarF.m0(2L);
                df01VarF.writeByte(10);
                df01VarF.writeByte(10);
                for (udu uduVar : this.i.values()) {
                    if (uduVar.g != null) {
                        df01VarF.Q(V0);
                        df01VarF.writeByte(32);
                        df01VarF.Q(uduVar.a);
                        df01VarF.writeByte(10);
                    } else {
                        df01VarF.Q(U0);
                        df01VarF.writeByte(32);
                        df01VarF.Q(uduVar.a);
                        for (long j : uduVar.b) {
                            df01VarF.writeByte(32);
                            df01VarF.m0(j);
                        }
                        df01VarF.writeByte(10);
                    }
                }
                try {
                    df01VarF.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    df01VarF.close();
                } catch (Throwable th4) {
                    j2h1.h(th3, th4);
                }
                th = th3;
            }
            if (th != null) {
                throw th;
            }
            zdu zduVar = this.b;
            s8s0 s8s0Var = this.d;
            zduVar.getClass();
            boolean zJ = ero1.j(zduVar, s8s0Var);
            zdu zduVar2 = this.b;
            if (zJ) {
                zduVar2.c(this.d, this.f);
                this.b.c(this.e, this.d);
                zdu zduVar3 = this.b;
                s8s0 s8s0Var2 = this.f;
                byte[] bArr = w4n1.a;
                try {
                    zduVar3.e(s8s0Var2);
                } catch (FileNotFoundException unused) {
                }
            } else {
                zduVar2.c(this.e, this.d);
            }
            df01 df01Var2 = this.h;
            if (df01Var2 != null) {
                w4n1.b(df01Var2);
            }
            this.h = sj1.f(new ml10(this.b.c.a(this.d), new j6(this, (byte) 22)));
            this.X = false;
            this.P0 = false;
        } catch (Throwable th5) {
            throw th5;
        }
    }

    public final void o(udu uduVar) {
        df01 df01Var;
        String str = uduVar.a;
        if (!this.Y) {
            if (uduVar.h > 0 && (df01Var = this.h) != null) {
                df01Var.Q(V0);
                df01Var.writeByte(32);
                df01Var.Q(str);
                df01Var.writeByte(10);
                df01Var.flush();
            }
            if (uduVar.h > 0 || uduVar.g != null) {
                uduVar.f = true;
                return;
            }
        }
        y861 y861Var = uduVar.g;
        if (y861Var != null) {
            y861Var.f();
        }
        for (int i = 0; i < 2; i++) {
            zdu zduVar = this.b;
            s8s0 s8s0Var = (s8s0) uduVar.c.get(i);
            byte[] bArr = w4n1.a;
            try {
                zduVar.e(s8s0Var);
            } catch (FileNotFoundException unused) {
            }
            long j = this.g;
            long[] jArr = uduVar.b;
            this.g = j - jArr[i];
            jArr[i] = 0;
        }
        this.t++;
        df01 df01Var2 = this.h;
        if (df01Var2 != null) {
            df01Var2.Q(W0);
            df01Var2.writeByte(32);
            df01Var2.Q(str);
            df01Var2.writeByte(10);
        }
        this.i.remove(str);
        if (g()) {
            this.R0.d(this.S0, 0L);
        }
    }

    public final void p() {
        while (this.g > this.c) {
            for (udu uduVar : this.i.values()) {
                if (!uduVar.f) {
                    o(uduVar);
                }
            }
            return;
        }
        this.O0 = false;
    }
}
