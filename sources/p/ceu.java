package p;

import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ceu implements AutoCloseable {
    public static final se11 R0 = new se11("[a-z0-9_-]{1,120}");
    public boolean N0;
    public boolean O0;
    public boolean P0;
    public final aeu Q0;
    public df01 X;
    public boolean Y;
    public boolean Z;
    public final s8s0 a;
    public final long b;
    public final s8s0 c;
    public final s8s0 d;
    public final s8s0 e;
    public final LinkedHashMap f;
    public final llm g;
    public final Object h;
    public long i;
    public int t;

    public ceu(long j, i520 i520Var, s8s0 s8s0Var) {
        this.a = s8s0Var;
        this.b = j;
        if (j <= 0) {
            hhg1.n("maxSize <= 0");
            throw null;
        }
        this.c = s8s0Var.e("journal");
        this.d = s8s0Var.e("journal.tmp");
        this.e = s8s0Var.e("journal.bkp");
        this.f = new LinkedHashMap(0, 0.75f, true);
        j0d1 j0d1VarB = guo1.B();
        p8n p8nVar = q8n.b;
        fns fnsVar = igu.a;
        this.g = smo1.e(ha71.A(j0d1VarB, b3s.c.M(1)));
        this.h = new Object();
        this.Q0 = new aeu(i520Var);
    }

    public static void C(String str) {
        if (R0.e(str)) {
            return;
        }
        hhg1.f(cy30.n("keys must match regex [a-z0-9_-]{1,120}: \"", str, '\"'));
    }

    public static final boolean e(ceu ceuVar) {
        return ceuVar.t >= 2000;
    }

    public final void A() {
        while (this.i > this.b) {
            for (vdu vduVar : this.f.values()) {
                if (!vduVar.f) {
                    z(vduVar);
                }
            }
            return;
        }
        this.O0 = false;
    }

    public final void D() {
        synchronized (this.h) {
            try {
                df01 df01Var = this.X;
                if (df01Var != null) {
                    df01Var.close();
                }
                df01 df01Var2 = new df01(this.Q0.i(this.d, false));
                try {
                    df01Var2.Q("libcore.io.DiskLruCache");
                    df01Var2.writeByte(10);
                    df01Var2.Q("1");
                    df01Var2.writeByte(10);
                    df01Var2.m0(3L);
                    df01Var2.writeByte(10);
                    df01Var2.m0(2L);
                    df01Var2.writeByte(10);
                    df01Var2.writeByte(10);
                    for (vdu vduVar : this.f.values()) {
                        if (vduVar.g != null) {
                            df01Var2.Q("DIRTY");
                            df01Var2.writeByte(32);
                            df01Var2.Q(vduVar.a);
                            df01Var2.writeByte(10);
                        } else {
                            df01Var2.Q("CLEAN");
                            df01Var2.writeByte(32);
                            df01Var2.Q(vduVar.a);
                            for (long j : vduVar.b) {
                                df01Var2.writeByte(32);
                                df01Var2.m0(j);
                            }
                            df01Var2.writeByte(10);
                        }
                    }
                    try {
                        df01Var2.close();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        df01Var2.close();
                    } catch (Throwable th3) {
                        j2h1.h(th, th3);
                    }
                }
                if (th != null) {
                    throw th;
                }
                boolean zJ = ero1.j(this.Q0, this.c);
                aeu aeuVar = this.Q0;
                if (zJ) {
                    aeuVar.c(this.c, this.e);
                    this.Q0.c(this.d, this.c);
                    this.Q0.e(this.e);
                } else {
                    aeuVar.c(this.d, this.c);
                }
                this.X = new df01(new nl10(((we30) this.Q0).c.a(this.c), new j6(this, (byte) 23)));
                this.t = 0;
                this.Y = false;
                this.P0 = false;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.h) {
            try {
                if (this.Z && !this.N0) {
                    for (vdu vduVar : (vdu[]) this.f.values().toArray(new vdu[0])) {
                        rl1 rl1Var = vduVar.g;
                        if (rl1Var != null) {
                            vdu vduVar2 = (vdu) rl1Var.c;
                            if (u890.j(vduVar2.g, rl1Var)) {
                                vduVar2.f = true;
                            }
                        }
                    }
                    A();
                    smo1.p(this.g, (CancellationException) null);
                    df01 df01Var = this.X;
                    df01Var.getClass();
                    df01Var.close();
                    this.X = null;
                    this.N0 = true;
                    return;
                }
                this.N0 = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0111 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:8:0x0013, B:12:0x001a, B:14:0x0022, B:16:0x0032, B:24:0x0040, B:27:0x005a, B:29:0x0069, B:31:0x0079, B:33:0x0080, B:28:0x005e, B:37:0x00a0, B:39:0x00a7, B:42:0x00ac, B:44:0x00bd, B:47:0x00c2, B:52:0x00fd, B:54:0x0108, B:58:0x0111, B:48:0x00da, B:50:0x00ef, B:51:0x00fa, B:36:0x0090, B:61:0x0116, B:62:0x011d), top: B:65:0x0003 }] */
    public final void m(rl1 rl1Var, boolean z) {
        synchronized (this.h) {
            vdu vduVar = (vdu) rl1Var.c;
            if (!u890.j(vduVar.g, rl1Var)) {
                throw new IllegalStateException("Check failed.");
            }
            if (!z || vduVar.f) {
                for (int i = 0; i < 2; i++) {
                    this.Q0.e((s8s0) vduVar.d.get(i));
                }
            } else {
                for (int i2 = 0; i2 < 2; i2++) {
                    if (((boolean[]) rl1Var.d)[i2] && !ero1.j(this.Q0, (s8s0) vduVar.d.get(i2))) {
                        rl1Var.o(false);
                        return;
                    }
                }
                for (int i3 = 0; i3 < 2; i3++) {
                    s8s0 s8s0Var = (s8s0) vduVar.d.get(i3);
                    s8s0 s8s0Var2 = (s8s0) vduVar.c.get(i3);
                    boolean zJ = ero1.j(this.Q0, s8s0Var);
                    aeu aeuVar = this.Q0;
                    if (zJ) {
                        aeuVar.c(s8s0Var, s8s0Var2);
                    } else {
                        m5n1.m(aeuVar, (s8s0) vduVar.c.get(i3));
                    }
                    long j = vduVar.b[i3];
                    Long l = (Long) ero1.k(this.Q0, s8s0Var2).e;
                    long jLongValue = l != null ? l.longValue() : 0L;
                    vduVar.b[i3] = jLongValue;
                    this.i = (this.i - j) + jLongValue;
                }
            }
            vduVar.g = null;
            if (vduVar.f) {
                z(vduVar);
                return;
            }
            this.t++;
            df01 df01Var = this.X;
            df01Var.getClass();
            if (z || vduVar.e) {
                vduVar.e = true;
                df01Var.Q("CLEAN");
                df01Var.writeByte(32);
                df01Var.Q(vduVar.a);
                for (long j2 : vduVar.b) {
                    df01Var.writeByte(32);
                    df01Var.m0(j2);
                }
                df01Var.writeByte(10);
            } else {
                this.f.remove(vduVar.a);
                df01Var.Q("REMOVE");
                df01Var.writeByte(32);
                df01Var.Q(vduVar.a);
                df01Var.writeByte(10);
            }
            df01Var.flush();
            if (this.i > this.b) {
                u();
            } else if (this.t >= 2000) {
                u();
            }
        }
    }

    public final rl1 o(String str) {
        synchronized (this.h) {
            if (this.N0) {
                throw new IllegalStateException("cache is closed");
            }
            C(str);
            q();
            vdu vduVar = (vdu) this.f.get(str);
            if ((vduVar != null ? vduVar.g : null) != null) {
                return null;
            }
            if (vduVar != null && vduVar.h != 0) {
                return null;
            }
            if (!this.O0 && !this.P0) {
                df01 df01Var = this.X;
                df01Var.getClass();
                df01Var.Q("DIRTY");
                df01Var.writeByte(32);
                df01Var.Q(str);
                df01Var.writeByte(10);
                df01Var.flush();
                if (this.Y) {
                    return null;
                }
                if (vduVar == null) {
                    vduVar = new vdu(this, str);
                    this.f.put(str, vduVar);
                }
                rl1 rl1Var = new rl1(this, vduVar);
                vduVar.g = rl1Var;
                return rl1Var;
            }
            u();
            return null;
        }
    }

    public final xdu p(String str) {
        xdu xduVarA;
        synchronized (this.h) {
            if (this.N0) {
                throw new IllegalStateException("cache is closed");
            }
            C(str);
            q();
            vdu vduVar = (vdu) this.f.get(str);
            if (vduVar != null && (xduVarA = vduVar.a()) != null) {
                boolean z = true;
                this.t++;
                df01 df01Var = this.X;
                df01Var.getClass();
                df01Var.Q("READ");
                df01Var.writeByte(32);
                df01Var.Q(str);
                df01Var.writeByte(10);
                df01Var.flush();
                if (this.t < 2000) {
                    z = false;
                }
                if (z) {
                    u();
                }
                return xduVarA;
            }
            return null;
        }
    }

    public final void q() {
        synchronized (this.h) {
            try {
                if (this.Z) {
                    return;
                }
                this.Q0.e(this.d);
                if (ero1.j(this.Q0, this.e)) {
                    boolean zJ = ero1.j(this.Q0, this.c);
                    aeu aeuVar = this.Q0;
                    s8s0 s8s0Var = this.e;
                    if (zJ) {
                        aeuVar.e(s8s0Var);
                    } else {
                        aeuVar.c(s8s0Var, this.c);
                    }
                }
                if (ero1.j(this.Q0, this.c)) {
                    try {
                        w();
                        v();
                        this.Z = true;
                        return;
                    } catch (IOException unused) {
                        try {
                            close();
                            m5n1.q(this.Q0, this.a);
                            this.N0 = false;
                            D();
                            this.Z = true;
                        } catch (Throwable th) {
                            this.N0 = false;
                            throw th;
                        }
                    }
                }
                D();
                this.Z = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void u() {
        fn31.T(this.g, null, 0, new q82(this, (lnm) null, (byte) 6), 3);
    }

    public final void v() {
        Iterator it = this.f.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            vdu vduVar = (vdu) it.next();
            int i = 0;
            if (vduVar.g == null) {
                while (i < 2) {
                    j += vduVar.b[i];
                    i++;
                }
            } else {
                vduVar.g = null;
                while (i < 2) {
                    s8s0 s8s0Var = (s8s0) vduVar.c.get(i);
                    aeu aeuVar = this.Q0;
                    aeuVar.e(s8s0Var);
                    aeuVar.e((s8s0) vduVar.d.get(i));
                    i++;
                }
                it.remove();
            }
        }
        this.i = j;
    }

    public final void w() throws Throwable {
        aeu aeuVar = this.Q0;
        i520 i520Var = ((we30) aeuVar).c;
        s8s0 s8s0Var = this.c;
        ff01 ff01Var = new ff01(i520Var.j(s8s0Var));
        try {
            String strP = ff01Var.p(Long.MAX_VALUE);
            String strP2 = ff01Var.p(Long.MAX_VALUE);
            String strP3 = ff01Var.p(Long.MAX_VALUE);
            String strP4 = ff01Var.p(Long.MAX_VALUE);
            String strP5 = ff01Var.p(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strP) || !"1".equals(strP2) || !u890.j(String.valueOf(3), strP3) || !u890.j(String.valueOf(2), strP4) || strP5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strP + ", " + strP2 + ", " + strP3 + ", " + strP4 + ", " + strP5 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    y(ff01Var.p(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.t = i - this.f.size();
                    if (ff01Var.z0()) {
                        this.X = new df01(new nl10(((we30) aeuVar).c.a(s8s0Var), new j6(this, (byte) 23)));
                    } else {
                        D();
                    }
                    try {
                        ff01Var.close();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                ff01Var.close();
            } catch (Throwable th3) {
                j2h1.h(th, th3);
            }
        }
        if (th != null) {
            throw th;
        }
    }

    public final void y(String str) {
        String strSubstring;
        int iV0 = ihc1.v0(str, ' ', 0, 6);
        if (iV0 == -1) {
            k220.i("unexpected journal line: ".concat(str));
            return;
        }
        int i = iV0 + 1;
        int iV1 = ihc1.v0(str, ' ', i, 4);
        LinkedHashMap linkedHashMap = this.f;
        if (iV1 == -1) {
            strSubstring = str.substring(i);
            if (iV0 == 6 && nhc1.Y(str, "REMOVE", false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iV1);
        }
        Object vduVar = linkedHashMap.get(strSubstring);
        if (vduVar == null) {
            vduVar = new vdu(this, strSubstring);
            linkedHashMap.put(strSubstring, vduVar);
        }
        vdu vduVar2 = (vdu) vduVar;
        if (iV1 == -1 || iV0 != 5 || !nhc1.Y(str, "CLEAN", false)) {
            if (iV1 == -1 && iV0 == 5 && nhc1.Y(str, "DIRTY", false)) {
                vduVar2.g = new rl1(this, vduVar2);
                return;
            } else {
                if (iV1 == -1 && iV0 == 4 && nhc1.Y(str, "READ", false)) {
                    return;
                }
                k220.i("unexpected journal line: ".concat(str));
                return;
            }
        }
        List listP0 = ihc1.P0(str.substring(iV1 + 1), new char[]{' '}, 6);
        vduVar2.e = true;
        vduVar2.g = null;
        if (listP0.size() != 2) {
            hhg1.l(listP0, "unexpected journal line: ");
            return;
        }
        try {
            int size = listP0.size();
            for (int i2 = 0; i2 < size; i2++) {
                vduVar2.b[i2] = Long.parseLong((String) listP0.get(i2));
            }
        } catch (NumberFormatException unused) {
            hhg1.l(listP0, "unexpected journal line: ");
        }
    }

    public final void z(vdu vduVar) {
        df01 df01Var;
        int i = vduVar.h;
        String str = vduVar.a;
        if (i > 0 && (df01Var = this.X) != null) {
            df01Var.Q("DIRTY");
            df01Var.writeByte(32);
            df01Var.Q(str);
            df01Var.writeByte(10);
            df01Var.flush();
        }
        if (vduVar.h > 0 || vduVar.g != null) {
            vduVar.f = true;
            return;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            this.Q0.e((s8s0) vduVar.c.get(i2));
            long j = this.i;
            long[] jArr = vduVar.b;
            this.i = j - jArr[i2];
            jArr[i2] = 0;
        }
        this.t++;
        df01 df01Var2 = this.X;
        if (df01Var2 != null) {
            df01Var2.Q("REMOVE");
            df01Var2.writeByte(32);
            df01Var2.Q(str);
            df01Var2.writeByte(10);
            df01Var2.flush();
        }
        this.f.remove(str);
        if (this.t >= 2000) {
            u();
        }
    }
}
