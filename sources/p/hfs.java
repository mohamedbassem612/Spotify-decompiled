package p;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hfs {
    public static final p58 h = new p58((byte) 3);
    public static final Random i = new Random();
    public q3u0 d;
    public String f;
    public final oqe1 a = new oqe1();
    public final dqe1 b = new dqe1();
    public final HashMap c = new HashMap();
    public sqe1 e = sqe1.a;
    public long g = -1;

    public final synchronized boolean a(tz3 tz3Var, String str) {
        gfs gfsVar = (gfs) this.c.get(str);
        if (gfsVar == null) {
            return false;
        }
        gfsVar.c(tz3Var.c, tz3Var.d);
        return gfsVar.a(tz3Var.c, tz3Var.d);
    }

    public final void b(gfs gfsVar) {
        long j = gfsVar.c;
        if (j != -1 && gfsVar.e) {
            this.g = j;
        }
        this.f = null;
    }

    public final synchronized void c(tz3 tz3Var) {
        q3u0 q3u0Var;
        try {
            String str = this.f;
            if (str != null) {
                gfs gfsVar = (gfs) this.c.get(str);
                gfsVar.getClass();
                b(gfsVar);
            }
            Iterator it = this.c.values().iterator();
            while (it.hasNext()) {
                gfs gfsVar2 = (gfs) it.next();
                it.remove();
                if (gfsVar2.e && (q3u0Var = this.d) != null) {
                    q3u0Var.f(tz3Var, gfsVar2.a, false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final gfs d(int i2, p2i0 p2i0Var) {
        HashMap map = this.c;
        gfs gfsVar = null;
        long j = Long.MAX_VALUE;
        for (gfs gfsVar2 : map.values()) {
            gfsVar2.c(i2, p2i0Var);
            if (gfsVar2.a(i2, p2i0Var)) {
                long j2 = gfsVar2.c;
                if (j2 == -1 || j2 < j) {
                    gfsVar = gfsVar2;
                    j = j2;
                } else if (j2 == j) {
                    String str = zoi1.a;
                    if (gfsVar.d != null && gfsVar2.d != null) {
                        gfsVar = gfsVar2;
                    }
                }
            }
        }
        if (gfsVar != null) {
            return gfsVar;
        }
        String str2 = (String) h.get();
        gfs gfsVar3 = new gfs(this, str2, i2, p2i0Var);
        map.put(str2, gfsVar3);
        return gfsVar3;
    }

    public final synchronized String e(sqe1 sqe1Var, p2i0 p2i0Var) {
        return d(sqe1Var.g(p2i0Var.a, this.b).c, p2i0Var).a;
    }

    public final void f(tz3 tz3Var) {
        p2i0 p2i0Var;
        sqe1 sqe1Var = tz3Var.b;
        int i2 = tz3Var.c;
        p2i0 p2i0Var2 = tz3Var.d;
        boolean zP = sqe1Var.p();
        String str = this.f;
        HashMap map = this.c;
        if (zP) {
            if (str != null) {
                gfs gfsVar = (gfs) map.get(str);
                gfsVar.getClass();
                b(gfsVar);
                return;
            }
            return;
        }
        gfs gfsVar2 = (gfs) map.get(str);
        this.f = d(i2, p2i0Var2).a;
        g(tz3Var);
        if (p2i0Var2 != null) {
            long j = p2i0Var2.d;
            if (p2i0Var2.c()) {
                if (gfsVar2 != null && gfsVar2.c == j && (p2i0Var = gfsVar2.d) != null && p2i0Var.b == p2i0Var2.b && p2i0Var.c == p2i0Var2.c) {
                    return;
                }
                this.d.a(d(i2, new p2i0(j, p2i0Var2.a)).a);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0033 A[Catch: all -> 0x0058, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0005, B:8:0x0014, B:10:0x0018, B:12:0x0020, B:14:0x002c, B:17:0x0033, B:23:0x003e, B:25:0x004a, B:27:0x0050, B:33:0x005b, B:35:0x0067, B:36:0x006b, B:38:0x0070, B:40:0x0076, B:42:0x008d, B:43:0x00df, B:45:0x00e3, B:46:0x00ed, B:48:0x00f7, B:50:0x00fb), top: B:55:0x0005 }] */
    public final synchronized void g(tz3 tz3Var) {
        long j;
        this.d.getClass();
        if (tz3Var.b.p()) {
            return;
        }
        p2i0 p2i0Var = tz3Var.d;
        if (p2i0Var != null) {
            long j2 = p2i0Var.d;
            if (j2 != -1) {
                gfs gfsVar = (gfs) this.c.get(this.f);
                if (gfsVar != null) {
                    j = gfsVar.c;
                    if (j == -1) {
                        j = this.g + 1;
                    }
                } else {
                    j = this.g + 1;
                }
                if (j2 < j) {
                    return;
                }
            }
            gfs gfsVar2 = (gfs) this.c.get(this.f);
            if (gfsVar2 != null && gfsVar2.c == -1 && gfsVar2.b != tz3Var.c) {
                return;
            }
        }
        gfs gfsVarD = d(tz3Var.c, tz3Var.d);
        if (this.f == null) {
            this.f = gfsVarD.a;
        }
        p2i0 p2i0Var2 = tz3Var.d;
        if (p2i0Var2 != null && p2i0Var2.c()) {
            p2i0 p2i0Var3 = tz3Var.d;
            p2i0 p2i0Var4 = new p2i0(p2i0Var3.a, p2i0Var3.d, p2i0Var3.b);
            gfs gfsVarD2 = d(tz3Var.c, p2i0Var4);
            if (!gfsVarD2.e) {
                gfsVarD2.e = true;
                tz3Var.b.g(tz3Var.d.a, this.b);
                this.d.h(new tz3(tz3Var.a, tz3Var.b, tz3Var.c, p2i0Var4, Math.max(0L, zoi1.n0(this.b.d(tz3Var.d.b)) + zoi1.n0(this.b.e)), tz3Var.f, tz3Var.g, tz3Var.h, tz3Var.i, tz3Var.j), gfsVarD2.a);
            }
        }
        if (!gfsVarD.e) {
            gfsVarD.e = true;
            this.d.h(tz3Var, gfsVarD.a);
        }
        if (gfsVarD.a.equals(this.f) && !gfsVarD.f) {
            gfsVarD.f = true;
            this.d.g(tz3Var, gfsVarD.a);
        }
    }

    public final synchronized void h(int i2, tz3 tz3Var) {
        try {
            this.d.getClass();
            boolean z = i2 == 0;
            Iterator it = this.c.values().iterator();
            while (it.hasNext()) {
                gfs gfsVar = (gfs) it.next();
                if (gfsVar.b(tz3Var)) {
                    it.remove();
                    boolean zEquals = gfsVar.a.equals(this.f);
                    if (zEquals) {
                        b(gfsVar);
                    }
                    if (gfsVar.e) {
                        this.d.f(tz3Var, gfsVar.a, z && zEquals && gfsVar.f);
                    }
                }
            }
            f(tz3Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void i(tz3 tz3Var) {
        try {
            this.d.getClass();
            sqe1 sqe1Var = this.e;
            this.e = tz3Var.b;
            Iterator it = this.c.values().iterator();
            while (it.hasNext()) {
                gfs gfsVar = (gfs) it.next();
                if (!gfsVar.d(sqe1Var, this.e) || gfsVar.b(tz3Var)) {
                    it.remove();
                    if (gfsVar.a.equals(this.f)) {
                        b(gfsVar);
                    }
                    if (gfsVar.e) {
                        this.d.f(tz3Var, gfsVar.a, false);
                    }
                }
            }
            f(tz3Var);
        } catch (Throwable th) {
            throw th;
        }
    }
}
