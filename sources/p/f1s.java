package p;

import android.net.Uri;
import android.os.SystemClock;
import androidx.car.app.model.Alert;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.HttpDataSource;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser$DeltaUpdateException;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker$PlaylistResetException;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker$PlaylistStuckException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class f1s implements d9e0 {
    public IOException X;
    public boolean Y;
    public final /* synthetic */ h1s Z;
    public final Uri a;
    public final HashSet b;
    public final eyh0 c;
    public final o2r d;
    public bl60 e;
    public long f;
    public long g;
    public long h;
    public long i;
    public boolean t;

    public f1s(h1s h1sVar, Uri uri, String str) {
        this.Z = h1sVar;
        this.a = uri;
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        hashSet.add(str);
        this.c = new eyh0("DefaultHlsPlaylistTracker:MediaPlaylist");
        this.d = h1sVar.a.a(4);
    }

    public final Uri a() {
        bl60 bl60Var = this.e;
        Uri uri = this.a;
        if (bl60Var != null) {
            al60 al60Var = bl60Var.v;
            if (al60Var.a != -9223372036854775807L || al60Var.e) {
                Uri.Builder builderBuildUpon = uri.buildUpon();
                bl60 bl60Var2 = this.e;
                if (bl60Var2.v.e) {
                    builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(bl60Var2.k + ((long) bl60Var2.r.size())));
                    bl60 bl60Var3 = this.e;
                    if (bl60Var3.n != -9223372036854775807L) {
                        b380 b380Var = bl60Var3.s;
                        int size = b380Var.size();
                        if (!b380Var.isEmpty() && ((wk60) hr80.r(b380Var)).Z) {
                            size--;
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                al60 al60Var2 = this.e.v;
                if (al60Var2.a != -9223372036854775807L) {
                    builderBuildUpon.appendQueryParameter("_HLS_skip", al60Var2.b ? "v2" : "YES");
                }
                return builderBuildUpon.build();
            }
        }
        return uri;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0053  */
    public final void b(Uri uri) {
        h1s h1sVar = this.Z;
        uzr0 uzr0VarD = h1sVar.b.d(h1sVar.X, this.e);
        Map map = Collections.EMPTY_MAP;
        dm5.s(uri, "The uri must be set.");
        tzr0 tzr0Var = new tzr0(this.d, new n3r(uri, 0L, 1, null, map, 0L, -1L, null, 1, null), uzr0VarD);
        mk60 mk60Var = h1sVar.Z;
        String str = null;
        if (mk60Var != null && mk60Var.k) {
            g1s g1sVar = (g1s) h1sVar.d.get(this.a);
            HashSet hashSet = this.b;
            if (g1sVar != null) {
                String str2 = g1sVar.a.d;
                if (hashSet.contains(str2)) {
                    str = str2;
                } else {
                    str = (String) hr80.q(hashSet, (Object) null);
                }
            } else {
                str = (String) hr80.q(hashSet, (Object) null);
            }
        }
        tzr0Var.e = str;
        vzr0 vzr0Var = new vzr0(tzr0Var);
        this.c.H(vzr0Var, this, h1sVar.c.m(vzr0Var.c));
    }

    public final void c(Uri uri) {
        this.i = 0L;
        if (this.t) {
            return;
        }
        eyh0 eyh0Var = this.c;
        if (eyh0Var.q() || eyh0Var.l()) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.h;
        if (jElapsedRealtime >= j) {
            b(uri);
        } else {
            this.t = true;
            this.Z.h.postDelayed(new e0i((Object) this, (Object) uri, (byte) 10), j - jElapsedRealtime);
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0284  */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:12:0x0032  */
    /* JADX WARN: Code duplicated, block: B:52:0x011f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0127  */
    /* JADX WARN: Code duplicated, block: B:55:0x012b  */
    /* JADX WARN: Code duplicated, block: B:56:0x012e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0131  */
    /* JADX WARN: Code duplicated, block: B:59:0x0133  */
    /* JADX WARN: Code duplicated, block: B:61:0x0140  */
    /* JADX WARN: Code duplicated, block: B:62:0x0147  */
    /* JADX WARN: Code duplicated, block: B:64:0x014a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.io.IOException, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.net.Uri, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    public final void d(bl60 bl60Var, d2e0 d2e0Var) {
        boolean z;
        boolean z2;
        long j;
        List list;
        long j2;
        long j3;
        bl60 bl60Var2;
        int i;
        int i2;
        b380 b380Var;
        yk60 yk60Var;
        int i3;
        bl60 bl60Var3;
        ?? r1;
        boolean z3;
        ?? hlsPlaylistTracker$PlaylistStuckException;
        HlsPlaylistTracker$PlaylistResetException hlsPlaylistTracker$PlaylistResetException;
        int size;
        int size2;
        int size3;
        boolean z4 = bl60Var.o;
        List list2 = bl60Var.r;
        long j4 = bl60Var.k;
        bl60 bl60Var4 = this.e;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f = jElapsedRealtime;
        h1s h1sVar = this.Z;
        CopyOnWriteArrayList copyOnWriteArrayList = h1sVar.e;
        if (bl60Var4 != null) {
            long j5 = bl60Var4.k;
            if (j4 <= j5 && (j4 < j5 || ((size = list2.size() - bl60Var4.r.size()) == 0 ? !((size2 = bl60Var.s.size()) > (size3 = bl60Var4.s.size()) || (size2 == size3 && z4 && !bl60Var4.o)) : size <= 0))) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = true;
        }
        b380 b380Var2 = bl60Var.r;
        long j6 = 0;
        if (z) {
            z2 = true;
            if (bl60Var.f16p) {
                j = bl60Var.h;
                list = list2;
            } else {
                bl60 bl60Var5 = h1sVar.S0;
                j = bl60Var5 != null ? bl60Var5.h : 0L;
                list = list2;
                if (bl60Var4 != null) {
                    long j7 = bl60Var4.h;
                    long j8 = bl60Var4.k;
                    b380 b380Var3 = bl60Var4.r;
                    int size4 = b380Var3.size();
                    j2 = j4;
                    int i4 = (int) (j2 - j8);
                    yk60 yk60Var2 = i4 < b380Var3.size() ? (yk60) b380Var3.get(i4) : null;
                    if (yk60Var2 != null) {
                        j3 = yk60Var2.e;
                    } else if (size4 == j2 - j8) {
                        j3 = bl60Var4.u;
                    }
                    j = j7 + j3;
                }
                long j9 = j;
                if (bl60Var.i) {
                    i3 = bl60Var.j;
                } else {
                    bl60Var2 = h1sVar.S0;
                    if (bl60Var2 != null) {
                        i = bl60Var2.j;
                    } else {
                        i = 0;
                    }
                    if (bl60Var4 == null) {
                        i2 = (int) (j2 - bl60Var4.k);
                        b380Var = bl60Var4.r;
                        if (i2 < b380Var.size()) {
                            yk60Var = (yk60) b380Var.get(i2);
                        } else {
                            yk60Var = null;
                        }
                        if (yk60Var != null) {
                            i = (bl60Var4.j + yk60Var.d) - ((yk60) b380Var2.get(0)).d;
                        }
                    }
                    i3 = i;
                }
                r1 = 0;
                bl60Var3 = new bl60(bl60Var.d, bl60Var.a, bl60Var.b, bl60Var.e, bl60Var.g, j9, true, i3, bl60Var.k, bl60Var.l, bl60Var.m, bl60Var.n, bl60Var.c, bl60Var.o, bl60Var.f16p, bl60Var.q, b380Var2, bl60Var.s, bl60Var.v, bl60Var.t, bl60Var.w, bl60Var.x);
            }
            j2 = j4;
            long j10 = j;
            if (bl60Var.i) {
                i3 = bl60Var.j;
            } else {
                bl60Var2 = h1sVar.S0;
                if (bl60Var2 != null) {
                    i = bl60Var2.j;
                } else {
                    i = 0;
                }
                if (bl60Var4 == null) {
                    i2 = (int) (j2 - bl60Var4.k);
                    b380Var = bl60Var4.r;
                    if (i2 < b380Var.size()) {
                        yk60Var = (yk60) b380Var.get(i2);
                    } else {
                        yk60Var = null;
                    }
                    if (yk60Var != null) {
                        i = (bl60Var4.j + yk60Var.d) - ((yk60) b380Var2.get(0)).d;
                    }
                }
                i3 = i;
            }
            r1 = 0;
            bl60Var3 = new bl60(bl60Var.d, bl60Var.a, bl60Var.b, bl60Var.e, bl60Var.g, j10, true, i3, bl60Var.k, bl60Var.l, bl60Var.m, bl60Var.n, bl60Var.c, bl60Var.o, bl60Var.f16p, bl60Var.q, b380Var2, bl60Var.s, bl60Var.v, bl60Var.t, bl60Var.w, bl60Var.x);
        } else if (!z4) {
            z2 = true;
            list = list2;
            j2 = j4;
            bl60Var3 = bl60Var4;
            r1 = 0;
        } else if (bl60Var4.o) {
            list = list2;
            j2 = j4;
            bl60Var3 = bl60Var4;
            r1 = 0;
            z2 = true;
        } else {
            z2 = true;
            list = list2;
            bl60Var3 = new bl60(bl60Var4.d, bl60Var4.a, bl60Var4.b, bl60Var4.e, bl60Var4.g, bl60Var4.h, bl60Var4.i, bl60Var4.j, bl60Var4.k, bl60Var4.l, bl60Var4.m, bl60Var4.n, bl60Var4.c, true, bl60Var4.f16p, bl60Var4.q, bl60Var4.r, bl60Var4.s, bl60Var4.v, bl60Var4.t, bl60Var4.w, bl60Var4.x);
            r1 = 0;
            j2 = j4;
        }
        this.e = bl60Var3;
        Uri uri = this.a;
        if (bl60Var3 != bl60Var4) {
            this.X = r1;
            this.g = jElapsedRealtime;
            if (uri.equals(h1sVar.T0)) {
                h1sVar.R0 = uri;
                h1sVar.T0 = r1;
            }
            if (uri.equals(h1sVar.R0)) {
                if (h1sVar.S0 == null) {
                    h1sVar.U0 = !bl60Var3.o;
                    h1sVar.V0 = bl60Var3.h;
                }
                h1sVar.S0 = bl60Var3;
                h1sVar.i.B(bl60Var3);
            }
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((kl60) it.next()).c();
            }
        } else if (!bl60Var3.o) {
            long size5 = j2 + ((long) list.size());
            bl60 bl60Var6 = this.e;
            if (size5 < bl60Var6.k) {
                hlsPlaylistTracker$PlaylistResetException = new HlsPlaylistTracker$PlaylistResetException();
                z3 = z2;
            } else {
                z3 = false;
                hlsPlaylistTracker$PlaylistStuckException = ((double) (jElapsedRealtime - this.g)) > ((double) zoi1.n0(bl60Var6.m)) * 3.5d ? new HlsPlaylistTracker$PlaylistStuckException() : r1;
            }
            if (hlsPlaylistTracker$PlaylistStuckException != 0) {
                hlsPlaylistTracker$PlaylistStuckException = hlsPlaylistTracker$PlaylistResetException;
                this.X = hlsPlaylistTracker$PlaylistStuckException;
                sw9 sw9Var = new sw9((Object) hlsPlaylistTracker$PlaylistStuckException, z2 ? 1 : 0, (byte) 18);
                Iterator it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    ((kl60) it2.next()).e(uri, sw9Var, z3);
                }
            }
        }
        hlsPlaylistTracker$PlaylistStuckException = hlsPlaylistTracker$PlaylistResetException;
        bl60 bl60Var7 = this.e;
        al60 al60Var = bl60Var7.v;
        long j11 = bl60Var7.m;
        if (al60Var.e) {
            if (bl60Var7 == bl60Var4) {
                long j12 = bl60Var7.n;
                if (j12 != -9223372036854775807L) {
                    j6 = j12 / 2;
                } else {
                    j11 /= 2;
                }
            }
            this.h = (zoi1.n0(j6) + jElapsedRealtime) - d2e0Var.f;
            if (this.e.o) {
            }
            if (!uri.equals(h1sVar.R0) || this.Y) {
                c(a());
            }
            return;
        }
        if (bl60Var7 == bl60Var4) {
            j11 /= 2;
        }
        j6 = j11;
        this.h = (zoi1.n0(j6) + jElapsedRealtime) - d2e0Var.f;
        if (this.e.o) {
            if (uri.equals(h1sVar.R0)) {
            }
            c(a());
        }
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
        this.Z.f.L(new d2e0(c2e0Var), vzr0Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    public final void j(f9e0 f9e0Var, long j, long j2) {
        vzr0 vzr0Var = (vzr0) f9e0Var;
        gl60 gl60Var = (gl60) vzr0Var.f;
        c2e0 c2e0Var = new c2e0(vzr0Var.a, vzr0Var.b, j);
        rsb1 rsb1Var = vzr0Var.d;
        c2e0Var.d = rsb1Var.c;
        c2e0Var.e = rsb1Var.d;
        c2e0Var.f = j2;
        c2e0Var.g = rsb1Var.b;
        d2e0 d2e0Var = new d2e0(c2e0Var);
        if (gl60Var instanceof bl60) {
            d((bl60) gl60Var, d2e0Var);
            this.Z.f.I(d2e0Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            IOException iOExceptionB = ParserException.b("Loaded playlist has unexpected type.");
            this.X = iOExceptionB;
            this.Z.f.K(d2e0Var, 4, iOExceptionB, true);
        }
        this.Z.c.getClass();
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
        h1s h1sVar = this.Z;
        h1sVar.c.getClass();
        h1sVar.f.H(d2e0Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final o4t o(f9e0 f9e0Var, long j, long j2, IOException iOException, int i) {
        vzr0 vzr0Var = (vzr0) f9e0Var;
        o4t o4tVar = eyh0.Y;
        long j3 = vzr0Var.a;
        byte b = vzr0Var.c;
        c2e0 c2e0Var = new c2e0(j3, vzr0Var.b, j);
        rsb1 rsb1Var = vzr0Var.d;
        c2e0Var.d = rsb1Var.c;
        c2e0Var.e = rsb1Var.d;
        c2e0Var.f = j2;
        c2e0Var.g = rsb1Var.b;
        d2e0 d2e0Var = new d2e0(c2e0Var);
        boolean z = rsb1Var.c.getQueryParameter("_HLS_msn") != null;
        boolean z2 = iOException instanceof HlsPlaylistParser$DeltaUpdateException;
        Uri uri = this.a;
        h1s h1sVar = this.Z;
        if (z || z2) {
            int i2 = iOException instanceof HttpDataSource.InvalidResponseCodeException ? ((HttpDataSource.InvalidResponseCodeException) iOException).d : Alert.DURATION_SHOW_INDEFINITELY;
            if (z2 || i2 == 400 || i2 == 503) {
                this.h = SystemClock.elapsedRealtime();
                c(uri);
                mgc mgcVar = h1sVar.f;
                String str = zoi1.a;
                mgcVar.K(d2e0Var, b, iOException, true);
                return o4tVar;
            }
        }
        sw9 sw9Var = new sw9(iOException, i, (byte) 18);
        Iterator it = h1sVar.e.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            z3 |= !((kl60) it.next()).e(uri, sw9Var, false);
        }
        ij81 ij81Var = h1sVar.c;
        if (z3) {
            ij81Var.getClass();
            long jN = ij81.n(sw9Var);
            o4tVar = jN != -9223372036854775807L ? new o4t(0, jN) : eyh0.Z;
        }
        boolean zE = o4tVar.e();
        h1sVar.f.K(d2e0Var, b, iOException, !zE);
        if (!zE) {
            ij81Var.getClass();
        }
        return o4tVar;
    }
}
