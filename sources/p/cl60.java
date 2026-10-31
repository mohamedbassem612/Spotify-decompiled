package p;

import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.common.ParserException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cl60 extends qba {
    public final boolean N0;
    public final boolean O0;
    public final h1s P0;
    public final long Q0;
    public roh0 R0;
    public yeg1 S0;
    public yoh0 T0;
    public final twb X;
    public final f9v Y;
    public final ij81 Z;
    public final d1s i;
    public final nk60 t;

    static {
        hph0.a("media3.exoplayer.hls");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public cl60(yoh0 yoh0Var, nk60 nk60Var, d1s d1sVar, twb twbVar, f9v f9vVar, ij81 ij81Var, h1s h1sVar, long j, boolean z, int i) {
        this.T0 = yoh0Var;
        this.R0 = yoh0Var.c;
        this.t = nk60Var;
        this.i = d1sVar;
        this.X = twbVar;
        this.Y = f9vVar;
        this.Z = ij81Var;
        this.P0 = h1sVar;
        this.Q0 = j;
        this.N0 = z;
        this.O0 = i;
    }

    public static wk60 A(long j, List list) {
        wk60 wk60Var = null;
        for (int i = 0; i < list.size(); i++) {
            wk60 wk60Var2 = (wk60) list.get(i);
            long j2 = wk60Var2.e;
            if (j2 > j || !wk60Var2.Y) {
                if (j2 > j) {
                    break;
                }
            } else {
                wk60Var = wk60Var2;
            }
        }
        return wk60Var;
    }

    public final void B(bl60 bl60Var) {
        long j;
        c091 c091Var;
        long jW;
        long j2;
        long jW2;
        long j3;
        long j4;
        boolean z = bl60Var.f16p;
        boolean z2 = bl60Var.g;
        b380 b380Var = bl60Var.r;
        long j5 = bl60Var.u;
        long jW3 = bl60Var.e;
        int i = bl60Var.d;
        long j6 = bl60Var.h;
        long jN0 = z ? zoi1.n0(j6) : -9223372036854775807L;
        long j7 = (i == 2 || i == 1) ? jN0 : -9223372036854775807L;
        h1s h1sVar = this.P0;
        h1sVar.X.getClass();
        ubc ubcVar = new ubc((byte) 12);
        if (h1sVar.U0) {
            al60 al60Var = bl60Var.v;
            long j8 = al60Var.c;
            long j9 = al60Var.d;
            long j10 = j6 - h1sVar.V0;
            boolean z3 = bl60Var.o;
            long j11 = z3 ? j10 + j5 : -9223372036854775807L;
            if (bl60Var.f16p) {
                String str = zoi1.a;
                long j12 = this.Q0;
                jW = zoi1.W(j12 == -9223372036854775807L ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + j12) - (j6 + j5);
            } else {
                jW = 0;
            }
            long j13 = this.R0.a;
            if (j13 != -9223372036854775807L) {
                jW2 = zoi1.W(j13);
            } else {
                if (jW3 != -9223372036854775807L) {
                    j2 = j5 - jW3;
                } else if (j9 == -9223372036854775807L || bl60Var.n == -9223372036854775807L) {
                    j2 = j8 != -9223372036854775807L ? j8 : 3 * bl60Var.m;
                } else {
                    j2 = j9;
                }
                jW2 = j2 + jW;
            }
            long j14 = j5 + jW;
            long jK = zoi1.k(jW2, jW, j14);
            roh0 roh0Var = m().c;
            boolean z4 = false;
            boolean z5 = roh0Var.d == -3.4028235E38f && roh0Var.e == -3.4028235E38f && j8 == -9223372036854775807L && j9 == -9223372036854775807L;
            qoh0 qoh0VarA = this.R0.a();
            qoh0VarA.a = zoi1.n0(jK);
            qoh0VarA.d = z5 ? 1.0f : this.R0.d;
            qoh0VarA.e = z5 ? 1.0f : this.R0.e;
            roh0 roh0Var2 = new roh0(qoh0VarA);
            this.R0 = roh0Var2;
            if (jW3 == -9223372036854775807L) {
                jW3 = j14 - zoi1.W(roh0Var2.a);
            }
            if (z2) {
                j4 = jW3;
            } else {
                wk60 wk60VarA = A(jW3, bl60Var.s);
                if (wk60VarA != null) {
                    j3 = wk60VarA.e;
                } else if (b380Var.isEmpty()) {
                    j4 = 0;
                } else {
                    yk60 yk60Var = (yk60) b380Var.get(zoi1.c(b380Var, Long.valueOf(jW3), true));
                    wk60 wk60VarA2 = A(jW3, yk60Var.Z);
                    j3 = wk60VarA2 != null ? wk60VarA2.e : yk60Var.e;
                }
                j4 = j3;
            }
            if (i == 2 && bl60Var.f) {
                z4 = true;
            }
            c091Var = new c091(j7, jN0, j11, bl60Var.u, j10, j4, true, !z3, z4, ubcVar, m(), this.R0);
        } else {
            if (jW3 == -9223372036854775807L || b380Var.isEmpty()) {
                j = 0;
            } else {
                if (!z2 && jW3 != j5) {
                    jW3 = ((yk60) b380Var.get(zoi1.c(b380Var, Long.valueOf(jW3), true))).e;
                }
                j = jW3;
            }
            long j15 = bl60Var.u;
            c091Var = new c091(j7, jN0, j15, j15, 0L, j, true, false, true, ubcVar, m(), null);
        }
        s(c091Var);
    }

    @Override // p.qba
    public final boolean c(yoh0 yoh0Var) {
        yoh0 yoh0VarM = m();
        soh0 soh0Var = yoh0VarM.b;
        soh0Var.getClass();
        soh0 soh0Var2 = yoh0Var.b;
        return soh0Var2 != null && soh0Var2.a.equals(soh0Var.a) && soh0Var2.e.equals(soh0Var.e) && Objects.equals(soh0Var2.c, soh0Var.c) && yoh0VarM.c.equals(yoh0Var.c);
    }

    @Override // p.qba
    public final arh0 f(p2i0 p2i0Var, hw3 hw3Var, long j) {
        mgc mgcVarE = e(p2i0Var);
        b9v b9vVar = new b9v(this.d.c, 0, p2i0Var);
        yeg1 yeg1Var = this.S0;
        dbu0 dbu0Var = this.g;
        dbu0Var.getClass();
        return new sk60(this.i, this.P0, this.t, yeg1Var, this.Y, b9vVar, this.Z, mgcVarE, hw3Var, this.X, this.N0, this.O0 ? 1 : 0, dbu0Var);
    }

    @Override // p.qba
    public final synchronized yoh0 m() {
        return this.T0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    @Override // p.qba
    public final void o() throws ParserException, IOException {
        h1s h1sVar = this.P0;
        eyh0 eyh0Var = h1sVar.g;
        if (eyh0Var != null) {
            eyh0Var.s();
        }
        ParserException parserException = h1sVar.Y;
        if (parserException != null) {
            throw parserException;
        }
        Uri uri = h1sVar.R0;
        if (uri != null) {
            h1sVar.k(uri);
        }
    }

    @Override // p.qba
    public final void r(yeg1 yeg1Var) {
        this.S0 = yeg1Var;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        dbu0 dbu0Var = this.g;
        dbu0Var.getClass();
        f9v f9vVar = this.Y;
        f9vVar.h(looperMyLooper, dbu0Var);
        f9vVar.e();
        mgc mgcVarE = e(null);
        soh0 soh0Var = m().b;
        soh0Var.getClass();
        Uri uri = soh0Var.a;
        o4a o4aVar = this.h;
        o4aVar.getClass();
        h1s h1sVar = this.P0;
        h1sVar.getClass();
        h1sVar.h = zoi1.r((lkh0) null);
        h1sVar.f = mgcVarE;
        h1sVar.i = this;
        h1sVar.t = o4aVar;
        Map map = Collections.EMPTY_MAP;
        dm5.s(uri, "The uri must be set.");
        vzr0 vzr0Var = new vzr0(h1sVar.a.a(4), new n3r(uri, 0L, 1, null, map, 0L, -1L, null, 1, null), 4, h1sVar.b.c());
        dm5.y(h1sVar.g == null);
        eyh0 eyh0Var = new eyh0("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        h1sVar.g = eyh0Var;
        eyh0Var.H(vzr0Var, h1sVar, h1sVar.c.m(vzr0Var.c));
    }

    @Override // p.qba
    public final void t(arh0 arh0Var) {
        sk60 sk60Var = (sk60) arh0Var;
        sk60Var.b.e.remove(sk60Var);
        for (rl60 rl60Var : sk60Var.T0) {
            if (rl60Var.d1) {
                for (ql60 ql60Var : rl60Var.V0) {
                    ql60Var.j();
                    y8v y8vVar = ql60Var.h;
                    if (y8vVar != null) {
                        y8vVar.c(ql60Var.e);
                        ql60Var.h = null;
                        ql60Var.g = null;
                    }
                }
            }
            lk60 lk60Var = rl60Var.d;
            int iR = lk60Var.s.r();
            h1s h1sVar = lk60Var.g;
            Uri uriB = lk60Var.e[iR].b();
            g1s g1sVar = (g1s) h1sVar.d.get(uriB);
            if (g1sVar != null) {
                HashMap map = g1sVar.b;
                dm5.y(map.containsKey(uriB));
                f1s f1sVar = (f1s) map.get(uriB);
                f1sVar.getClass();
                f1sVar.Y = false;
            }
            lk60Var.o = null;
            rl60Var.t.x(rl60Var);
            rl60Var.R0.removeCallbacksAndMessages(null);
            rl60Var.h1 = true;
            rl60Var.S0.clear();
        }
        sk60Var.Q0 = null;
    }

    @Override // p.qba
    public final void w() {
        h1s h1sVar = this.P0;
        HashMap map = h1sVar.d;
        h1sVar.R0 = null;
        h1sVar.S0 = null;
        h1sVar.X = null;
        mk60 mk60Var = h1sVar.Z;
        if (mk60Var != null) {
            mk60Var.f();
        }
        h1sVar.N0 = null;
        h1sVar.O0 = null;
        h1sVar.P0 = null;
        h1sVar.Q0 = null;
        h1sVar.Y = null;
        h1sVar.V0 = -9223372036854775807L;
        h1sVar.g.x(null);
        h1sVar.g = null;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((g1s) it.next()).b.values().iterator();
            while (it2.hasNext()) {
                ((f1s) it2.next()).c.x(null);
            }
        }
        h1sVar.h.removeCallbacksAndMessages(null);
        h1sVar.h = null;
        h1sVar.t = null;
        map.clear();
        this.Y.release();
    }

    @Override // p.qba
    public final synchronized void z(yoh0 yoh0Var) {
        this.T0 = yoh0Var;
    }
}
