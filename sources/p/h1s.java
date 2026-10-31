package p;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class h1s implements d9e0 {
    public static final ofr W0 = new ofr((byte) 5);
    public b380 N0;
    public b380 O0;
    public b380 P0;
    public b380 Q0;
    public Uri R0;
    public bl60 S0;
    public Uri T0;
    public boolean U0;
    public fl60 X;
    public ParserException Y;
    public mk60 Z;
    public final nk60 a;
    public final il60 b;
    public final ij81 c;
    public mgc f;
    public eyh0 g;
    public Handler h;
    public cl60 i;
    public o4a t;
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();
    public long V0 = -9223372036854775807L;

    public h1s(nk60 nk60Var, ij81 ij81Var, il60 il60Var) {
        this.a = nk60Var;
        this.b = il60Var;
        this.c = ij81Var;
    }

    public final void a(List list, boolean z) {
        for (int i = 0; i < list.size(); i++) {
            ml60 ml60Var = (ml60) list.get(i);
            g1s g1sVar = new g1s(this, ml60Var, z);
            mjh1 mjh1VarK = t380.p(ml60Var.b.values()).k();
            while (mjh1VarK.hasNext()) {
                this.d.put((Uri) mjh1VarK.next(), g1sVar);
            }
        }
    }

    public final bl60 b(Uri uri, boolean z) {
        HashMap map = this.d;
        g1s g1sVar = (g1s) map.get(uri);
        if (g1sVar == null) {
            return null;
        }
        bl60 bl60VarB = g1sVar.b(uri);
        if (bl60VarB != null && z) {
            i(uri, false);
            g1s g1sVar2 = (g1s) map.get(uri);
            g1sVar2.getClass();
            HashMap map2 = g1sVar2.b;
            dm5.y(map2.containsKey(uri));
            f1s f1sVar = (f1s) map2.get(uri);
            f1sVar.getClass();
            if (!f1sVar.Y) {
                dm5.y(map2.containsKey(uri));
                f1s f1sVar2 = (f1s) map2.get(uri);
                f1sVar2.getClass();
                f1sVar2.Y = true;
                bl60 bl60VarB2 = g1sVar2.b(uri);
                if (bl60VarB2 != null && !bl60VarB2.o) {
                    g1sVar2.e(uri, true);
                }
            }
        }
        return bl60VarB;
    }

    public final b380 c(int i) {
        if (i == 0) {
            return this.N0;
        }
        if (i == 1) {
            return this.O0;
        }
        if (i == 2) {
            return this.P0;
        }
        if (i != 3) {
            return null;
        }
        return this.Q0;
    }

    public final Uri d(Uri uri) {
        xk60 xk60Var;
        bl60 bl60Var = this.S0;
        if (bl60Var == null || !bl60Var.v.e || (xk60Var = (xk60) bl60Var.t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(xk60Var.b));
        int i = xk60Var.c;
        if (i != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
        }
        return builderBuildUpon.build();
    }

    public final boolean e(Uri uri, long j) {
        g1s g1sVar = (g1s) this.d.get(uri);
        if (g1sVar != null) {
            return g1sVar.c(uri, j);
        }
        return false;
    }

    public final boolean f(ml60 ml60Var, long j) {
        g1s g1sVar = (g1s) this.d.get(ml60Var.b());
        if (g1sVar == null) {
            return false;
        }
        Iterator it = g1sVar.b.values().iterator();
        boolean z = true;
        while (it.hasNext()) {
            z &= j <= ((f1s) it.next()).i;
        }
        return z;
    }

    public final boolean g(Uri uri) {
        int i;
        g1s g1sVar = (g1s) this.d.get(uri);
        if (g1sVar == null) {
            return false;
        }
        HashMap map = g1sVar.b;
        dm5.y(map.containsKey(uri));
        f1s f1sVar = (f1s) map.get(uri);
        f1sVar.getClass();
        if (f1sVar.e == null) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMax = Math.max(30000L, zoi1.n0(f1sVar.e.u));
        bl60 bl60Var = f1sVar.e;
        return bl60Var.o || (i = bl60Var.d) == 2 || i == 1 || f1sVar.f + jMax > jElapsedRealtime;
    }

    public final void h(f9e0 f9e0Var, long j, long j2, int i) {
        vzr0 vzr0Var = (vzr0) f9e0Var;
        c2e0 c2e0Var = new c2e0(vzr0Var.a, vzr0Var.b, j);
        if (i != 0) {
            rsb1 rsb1Var = vzr0Var.d;
            c2e0Var.d = rsb1Var.c;
            c2e0Var.e = rsb1Var.d;
            c2e0Var.f = j2;
            c2e0Var.g = rsb1Var.b;
        }
        this.f.L(new d2e0(c2e0Var), vzr0Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    public final void i(Uri uri, boolean z) {
        if (uri.equals(this.R0)) {
            return;
        }
        HashMap map = this.d;
        g1s g1sVar = (g1s) map.get(uri);
        boolean z2 = false;
        if (g1sVar != null ? g1sVar.c : false) {
            bl60 bl60Var = this.S0;
            if (bl60Var == null || !bl60Var.o) {
                g1s g1sVar2 = (g1s) map.get(uri);
                g1sVar2.getClass();
                bl60 bl60VarB = g1sVar2.b(uri);
                if (bl60VarB != null && bl60VarB.o) {
                    z2 = true;
                }
                if (!z2 && z) {
                    g1sVar2.d(uri, d(uri));
                    this.T0 = uri;
                    return;
                }
                this.R0 = uri;
                if (!z2) {
                    g1sVar2.d(uri, d(uri));
                } else {
                    this.S0 = bl60VarB;
                    this.i.B(bl60VarB);
                }
            }
        }
    }

    public final void j(f9e0 f9e0Var, long j, long j2) {
        fl60 fl60Var;
        vzr0 vzr0Var = (vzr0) f9e0Var;
        gl60 gl60Var = (gl60) vzr0Var.f;
        boolean z = gl60Var instanceof bl60;
        if (z) {
            String str = gl60Var.a;
            fl60 fl60Var2 = fl60.o;
            Uri uri = Uri.parse(str);
            ge30 ge30Var = new ge30();
            ge30Var.a = "0";
            ge30Var.n = asj0.p("application/x-mpegURL");
            List listSingletonList = Collections.singletonList(new el60(uri, new ie30(ge30Var), null, null, null, null, null, null));
            List list = Collections.EMPTY_LIST;
            fl60Var = new fl60("", list, listSingletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list, null);
        } else {
            fl60Var = (fl60) gl60Var;
        }
        this.X = fl60Var;
        lgy lgyVar = new lgy();
        lgyVar.b = fl60Var;
        lgyVar.a = fl60Var.n != null;
        lgyVar.c = new HashMap();
        lgyVar.d = new HashMap();
        lgyVar.e = new HashMap();
        try {
            lgyVar.f();
            this.N0 = (b380) lgyVar.f;
            this.O0 = lgyVar.e(1);
            this.P0 = lgyVar.e(2);
            this.Q0 = lgyVar.e(3);
            dh30 dh30Var = this.X.n;
            if (dh30Var != null) {
                nk60 nk60Var = this.a;
                h9n h9nVar = new h9n(this, (byte) 13);
                o4a o4aVar = this.t;
                o4aVar.getClass();
                mk60 mk60Var = new mk60(nk60Var, this, h9nVar, o4aVar);
                this.Z = mk60Var;
                Uri uri2 = (Uri) dh30Var.b;
                String str2 = (String) dh30Var.c;
                mgc mgcVar = this.f;
                if (str2 != null) {
                    dm5.y(mk60Var.h.contains(str2));
                    mk60Var.l = str2;
                }
                mk60Var.k = true;
                mk60Var.c(-9223372036854775807L);
                w62 w62Var = mk60Var.a;
                dqu dquVar = new dqu(mk60Var, (byte) 27);
                w62Var.f = uri2;
                w62Var.g = dquVar;
                w62Var.h = mgcVar;
                w62Var.j = new wdd1(new Handler(zoi1.D(), null));
                w62Var.k = new eyh0("SteeringManifestTracker");
                w62Var.b = true;
                w62Var.h();
            }
            this.R0 = ((ml60) this.N0.get(0)).b();
            this.e.add(new e1s(this));
            a(this.N0, true);
            a(this.O0, false);
            a(this.P0, false);
            a(this.Q0, false);
            c2e0 c2e0Var = new c2e0(vzr0Var.a, vzr0Var.b, j);
            rsb1 rsb1Var = vzr0Var.d;
            c2e0Var.d = rsb1Var.c;
            c2e0Var.e = rsb1Var.d;
            c2e0Var.f = j2;
            c2e0Var.g = rsb1Var.b;
            d2e0 d2e0Var = new d2e0(c2e0Var);
            g1s g1sVar = (g1s) this.d.get(this.R0);
            g1sVar.getClass();
            if (z) {
                Uri uri3 = vzr0Var.d.c;
                HashMap map = g1sVar.b;
                dm5.y(map.containsKey(uri3));
                f1s f1sVar = (f1s) map.get(uri3);
                f1sVar.getClass();
                f1sVar.d((bl60) gl60Var, d2e0Var);
            } else {
                g1sVar.e(this.R0, false);
            }
            this.c.getClass();
            this.f.I(d2e0Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } catch (ParserException e) {
            this.Y = e;
        }
    }

    public final void k(Uri uri) {
        g1s g1sVar = (g1s) this.d.get(uri);
        if (g1sVar != null) {
            HashMap map = g1sVar.b;
            dm5.y(map.containsKey(uri));
            f1s f1sVar = (f1s) map.get(uri);
            f1sVar.getClass();
            f1sVar.c.s();
            IOException iOException = f1sVar.X;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    public final void n(f9e0 f9e0Var, long j, long j2, boolean z) {
        vzr0 vzr0Var = (vzr0) f9e0Var;
        c2e0 c2e0Var = new c2e0(vzr0Var.a, vzr0Var.b, j);
        rsb1 rsb1Var = vzr0Var.d;
        c2e0Var.d = rsb1Var.c;
        c2e0Var.e = rsb1Var.d;
        c2e0Var.f = j2;
        c2e0Var.g = rsb1Var.b;
        d2e0 d2e0Var = new d2e0(c2e0Var);
        this.c.getClass();
        this.f.H(d2e0Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final o4t o(f9e0 f9e0Var, long j, long j2, IOException iOException, int i) {
        long jMin;
        vzr0 vzr0Var = (vzr0) f9e0Var;
        c2e0 c2e0Var = new c2e0(vzr0Var.a, vzr0Var.b, j);
        rsb1 rsb1Var = vzr0Var.d;
        c2e0Var.d = rsb1Var.c;
        c2e0Var.e = rsb1Var.d;
        c2e0Var.f = j2;
        c2e0Var.g = rsb1Var.b;
        d2e0 d2e0Var = new d2e0(c2e0Var);
        byte b = vzr0Var.c;
        this.c.getClass();
        Throwable cause = iOException;
        while (true) {
            if (cause == null) {
                jMin = Math.min((i - 1) * 1000, 5000);
                break;
            }
            if ((cause instanceof ParserException) || (cause instanceof FileNotFoundException) || (cause instanceof HttpDataSource$CleartextNotPermittedException) || (cause instanceof Loader$UnexpectedLoaderException) || ((cause instanceof DataSourceException) && ((DataSourceException) cause).a == 2008)) {
                jMin = -9223372036854775807L;
                break;
            }
            cause = cause.getCause();
        }
        boolean z = jMin == -9223372036854775807L;
        this.f.K(d2e0Var, b, iOException, z);
        return z ? eyh0.Z : new o4t(0, jMin);
    }
}
