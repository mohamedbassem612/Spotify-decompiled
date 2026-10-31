package p;

import android.net.Uri;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.cache.Cache;
import java.io.InterruptedIOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xpc implements o2r {
    public long N0;
    public long O0;
    public aw81 P0;
    public boolean Q0;
    public boolean R0;
    public long S0;
    public n3r X;
    public o2r Y;
    public long Z;
    public final zv81 a;
    public final o2r b;
    public final yvd1 c;
    public final o2r d;
    public final pqc e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public Uri i;
    public n3r t;

    public xpc(zv81 zv81Var, o2r o2rVar, o2r o2rVar2, vpc vpcVar, pqc pqcVar, int i) {
        this.a = zv81Var;
        this.b = o2rVar2;
        this.e = pqcVar;
        this.f = (i & 1) != 0;
        this.g = false;
        this.h = false;
        if (o2rVar != null) {
            this.d = o2rVar;
            this.c = vpcVar != null ? new yvd1(o2rVar, vpcVar) : null;
        } else {
            this.d = h6t0.a;
            this.c = null;
        }
    }

    @Override // p.o2r
    public final void a(yeg1 yeg1Var) {
        yeg1Var.getClass();
        this.b.a(yeg1Var);
        this.d.a(yeg1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        zv81 zv81Var = this.a;
        o2r o2rVar = this.Y;
        if (o2rVar == null) {
            return;
        }
        try {
            o2rVar.close();
        } finally {
            this.X = null;
            this.Y = null;
            aw81 aw81Var = this.P0;
            if (aw81Var != null) {
                zv81Var.j(aw81Var);
                this.P0 = null;
            }
        }
    }

    @Override // p.o2r
    public final void close() {
        this.t = null;
        this.i = null;
        this.N0 = 0L;
        try {
            c();
        } catch (Throwable th) {
            if (this.Y == this.b || (th instanceof Cache.CacheException)) {
                this.Q0 = true;
            }
            throw th;
        }
    }

    @Override // p.o2r
    public final Map e() {
        return !(this.Y == this.b) ? this.d.e() : Collections.EMPTY_MAP;
    }

    @Override // p.o2r
    public final Uri getUri() {
        return this.i;
    }

    public final void i(n3r n3rVar, boolean z) throws InterruptedIOException {
        aw81 aw81VarN;
        long j;
        n3r n3rVarA;
        o2r o2rVar;
        String str = n3rVar.h;
        String str2 = zoi1.a;
        if (this.R0) {
            aw81VarN = null;
        } else {
            boolean z2 = this.f;
            zv81 zv81Var = this.a;
            long j2 = this.N0;
            if (z2) {
                try {
                    long j3 = this.O0;
                    synchronized (zv81Var) {
                        dm5.y(!zv81Var.i);
                        zv81Var.c();
                        while (true) {
                            aw81VarN = zv81Var.n(j2, j3, str);
                            if (aw81VarN != null) {
                                break;
                            } else {
                                zv81Var.wait();
                            }
                        }
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException();
                }
            } else {
                aw81VarN = zv81Var.n(j2, this.O0, str);
            }
        }
        if (aw81VarN == null) {
            o2rVar = this.d;
            m3r m3rVarA = n3rVar.a();
            m3rVarA.f = this.N0;
            m3rVarA.g = this.O0;
            n3rVarA = m3rVarA.a();
            j = -1;
        } else if (aw81VarN.d) {
            Uri uriFromFile = Uri.fromFile(aw81VarN.e);
            long j4 = aw81VarN.b;
            long j5 = this.N0 - j4;
            long jMin = aw81VarN.c - j5;
            j = -1;
            long j6 = this.O0;
            if (j6 != -1) {
                jMin = Math.min(jMin, j6);
            }
            m3r m3rVarA2 = n3rVar.a();
            m3rVarA2.a = uriFromFile;
            m3rVarA2.b = j4;
            m3rVarA2.f = j5;
            m3rVarA2.g = jMin;
            n3rVarA = m3rVarA2.a();
            o2rVar = this.b;
        } else {
            j = -1;
            long jMin2 = aw81VarN.c;
            long j7 = this.O0;
            if (jMin2 == -1) {
                jMin2 = j7;
            } else if (j7 != -1) {
                jMin2 = Math.min(jMin2, j7);
            }
            m3r m3rVarA3 = n3rVar.a();
            m3rVarA3.f = this.N0;
            m3rVarA3.g = jMin2;
            n3rVarA = m3rVarA3.a();
            o2rVar = this.c;
            if (o2rVar == null) {
                o2rVar = this.d;
                this.a.j(aw81VarN);
                aw81VarN = null;
            }
        }
        this.S0 = (this.R0 || o2rVar != this.d) ? Long.MAX_VALUE : this.N0 + 102400;
        if (z) {
            dm5.y(this.Y == this.d);
            if (o2rVar == this.d) {
                return;
            }
            try {
                c();
            } catch (Throwable th) {
                if (!aw81VarN.d) {
                    this.a.j(aw81VarN);
                }
                throw th;
            }
        }
        if (aw81VarN != null && !aw81VarN.d) {
            this.P0 = aw81VarN;
        }
        this.Y = o2rVar;
        this.X = n3rVarA;
        this.Z = 0L;
        long jT = o2rVar.t(n3rVarA);
        oql oqlVar = new oql((byte) 1);
        if (n3rVarA.g == j && jT != j) {
            this.O0 = jT;
            oqlVar.a(Long.valueOf(this.N0 + jT), "exo_len");
        }
        if (!(this.Y == this.b)) {
            Uri uri = o2rVar.getUri();
            this.i = uri;
            Uri uri2 = n3rVar.a.equals(uri) ? null : this.i;
            if (uri2 == null) {
                ((ArrayList) oqlVar.c).add("exo_redir");
                ((HashMap) oqlVar.b).remove("exo_redir");
            } else {
                oqlVar.a(uri2.toString(), "exo_redir");
            }
        }
        if (this.Y == this.c) {
            this.a.b(str, oqlVar);
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        long j;
        o2r o2rVar = this.b;
        if (i2 == 0) {
            return 0;
        }
        if (this.O0 == 0) {
            return -1;
        }
        n3r n3rVar = this.t;
        n3rVar.getClass();
        n3r n3rVar2 = this.X;
        n3rVar2.getClass();
        try {
            if (this.N0 >= this.S0) {
                i(n3rVar, true);
            }
            o2r o2rVar2 = this.Y;
            o2rVar2.getClass();
            int i4 = o2rVar2.read(bArr, i, i2);
            o2r o2rVar3 = this.Y;
            if (i4 != -1) {
                long j2 = i4;
                this.N0 += j2;
                this.Z += j2;
                long j3 = this.O0;
                if (j3 == -1) {
                    return i4;
                }
                this.O0 = j3 - j2;
                return i4;
            }
            if (!(o2rVar3 == o2rVar)) {
                j = -1;
                long j4 = n3rVar2.g;
                if (j4 != -1) {
                    i3 = i4;
                    if (this.Z < j4) {
                    }
                } else {
                    i3 = i4;
                }
                String str = n3rVar.h;
                String str2 = zoi1.a;
                this.O0 = 0L;
                if (!(o2rVar3 == this.c)) {
                    return i3;
                }
                oql oqlVar = new oql((byte) 1);
                oqlVar.a(Long.valueOf(this.N0), "exo_len");
                this.a.b(str, oqlVar);
                return i3;
            }
            i3 = i4;
            j = -1;
            long j5 = this.O0;
            if (j5 <= 0 && j5 != j) {
                return i3;
            }
            c();
            i(n3rVar, false);
            return read(bArr, i, i2);
        } catch (Throwable th) {
            if (this.Y == o2rVar || (th instanceof Cache.CacheException)) {
                this.Q0 = true;
            }
            throw th;
        }
    }

    @Override // p.o2r
    public final long t(n3r n3rVar) {
        long jA;
        zv81 zv81Var = this.a;
        try {
            String strA = this.e.a(n3rVar);
            m3r m3rVarA = n3rVar.a();
            long j = n3rVar.f;
            long j2 = n3rVar.g;
            m3rVarA.h = strA;
            n3r n3rVarA = m3rVarA.a();
            this.t = n3rVarA;
            Uri uri = n3rVarA.a;
            byte[] bArr = (byte[]) zv81Var.g(strA).b.get("exo_redir");
            Uri uri2 = null;
            String str = bArr != null ? new String(bArr, StandardCharsets.UTF_8) : null;
            if (str != null) {
                uri2 = Uri.parse(str);
            }
            if (uri2 != null) {
                uri = uri2;
            }
            this.i = uri;
            this.N0 = j;
            boolean z = (this.g && this.Q0) || (this.h && j2 == -1);
            this.R0 = z;
            if (z) {
                this.O0 = -1L;
                jA = -1;
            } else {
                jA = hyl.a(zv81Var.g(strA));
                this.O0 = jA;
                if (jA != -1) {
                    jA -= j;
                    this.O0 = jA;
                    if (jA < 0) {
                        throw new DataSourceException(2008);
                    }
                }
            }
            if (j2 != -1) {
                jA = jA == -1 ? j2 : Math.min(jA, j2);
                this.O0 = jA;
            }
            if (jA > 0 || jA == -1) {
                i(n3rVarA, false);
            }
            return j2 != -1 ? j2 : this.O0;
        } catch (Throwable th) {
            if (this.Y == this.b || (th instanceof Cache.CacheException)) {
                this.Q0 = true;
            }
            throw th;
        }
    }
}
