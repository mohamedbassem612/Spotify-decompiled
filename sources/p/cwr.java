package p;

import android.media.ResourceBusyException;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager$MissingSchemeDataException;
import androidx.media3.exoplayer.drm.DrmSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cwr implements f9v {
    public final UUID b;
    public final yn00 c;
    public final imh0 d;
    public final HashMap e;
    public final boolean f;
    public final int[] g;
    public final boolean h;
    public final zfr i;
    public final ij81 j;
    public final her k;
    public final int l;
    public final ArrayList m;
    public final Set n;
    public final Set o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f29p;
    public ao00 q;
    public awr r;
    public awr s;
    public Looper t;
    public Handler u;
    public byte v;
    public byte[] w;
    public dbu0 x;
    public volatile nj7 y;

    public cwr(UUID uuid, yn00 yn00Var, imh0 imh0Var, HashMap map, boolean z, int[] iArr, boolean z2, ij81 ij81Var) {
        uuid.getClass();
        dm5.n(!whc.c.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.b = uuid;
        this.c = yn00Var;
        this.d = imh0Var;
        this.e = map;
        this.f = z;
        this.g = iArr;
        this.h = z2;
        this.j = ij81Var;
        this.i = new zfr((byte) 7);
        this.k = new her(this, (byte) 6);
        this.v = (byte) 0;
        this.m = new ArrayList();
        this.n = Collections.newSetFromMap(new IdentityHashMap());
        this.o = Collections.newSetFromMap(new IdentityHashMap());
        this.l = 300000;
    }

    public static boolean b(awr awrVar) {
        awrVar.q();
        if (awrVar.q != 1) {
            return false;
        }
        DrmSession.DrmSessionException drmSessionExceptionA = awrVar.a();
        drmSessionExceptionA.getClass();
        Throwable cause = drmSessionExceptionA.getCause();
        return (cause instanceof ResourceBusyException) || eth.E(cause);
    }

    public static ArrayList j(x8v x8vVar, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(x8vVar.d);
        for (int i = 0; i < x8vVar.d; i++) {
            w8v w8vVar = x8vVar.a[i];
            if ((w8vVar.a(uuid) || (whc.d.equals(uuid) && w8vVar.a(whc.c))) && (w8vVar.e != null || z)) {
                arrayList.add(w8vVar);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    /* JADX WARN: Code duplicated, block: B:18:0x0035 A[LOOP:0: B:13:0x002c->B:18:0x0035, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x0057  */
    /* JADX WARN: Code duplicated, block: B:58:0x0039 A[EDGE_INSN: B:58:0x0039->B:20:0x0039 BREAK  A[LOOP:0: B:13:0x002c->B:18:0x0035], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0038 A[SYNTHETIC] */
    public final y8v a(Looper looper, b9v b9vVar, ie30 ie30Var, boolean z) {
        ArrayList arrayListJ;
        int[] iArr;
        awr awrVar;
        if (this.y == null) {
            this.y = new nj7(this, looper, (byte) 2);
        }
        x8v x8vVar = ie30Var.t;
        int i = 0;
        awr awrVar2 = null;
        if (x8vVar != null) {
            if (this.w == null) {
                arrayListJ = j(x8vVar, this.b, false);
                if (arrayListJ.isEmpty()) {
                    DefaultDrmSessionManager$MissingSchemeDataException defaultDrmSessionManager$MissingSchemeDataException = new DefaultDrmSessionManager$MissingSchemeDataException(eqq.m("Media does not support uuid: ", this.b));
                    oon1.w("DRM error", defaultDrmSessionManager$MissingSchemeDataException);
                    if (b9vVar != null) {
                        b9vVar.e(defaultDrmSessionManager$MissingSchemeDataException);
                    }
                    return new ljz(new DrmSession.DrmSessionException(6003, defaultDrmSessionManager$MissingSchemeDataException));
                }
            } else {
                arrayListJ = null;
            }
            if (this.f) {
                for (awr awrVar3 : this.m) {
                    if (Objects.equals(awrVar3.a, arrayListJ)) {
                        awrVar2 = awrVar3;
                        break;
                    }
                }
            } else {
                awrVar2 = this.s;
            }
            if (awrVar2 != null) {
                awrVar2.g(b9vVar);
                return awrVar2;
            }
            awr awrVarD = d(arrayListJ, false, b9vVar, z);
            if (!this.f) {
                this.s = awrVarD;
            }
            this.m.add(awrVarD);
            return awrVarD;
        }
        int i2 = asj0.i(ie30Var.f66p);
        ao00 ao00Var = this.q;
        ao00Var.getClass();
        if (ao00Var.g() == 2) {
            HashSet hashSet = hph0.a;
            if (!mk30.c) {
                iArr = this.g;
                while (true) {
                    if (i < iArr.length) {
                        i = -1;
                        break;
                    }
                    if (iArr[i] == i2) {
                        break;
                    }
                    i++;
                }
                if (i != -1 && ao00Var.g() != 1) {
                    awrVar = this.r;
                    if (awrVar == null) {
                        w280 w280Var = b380.b;
                        awr awrVarD2 = d(bg11.e, true, null, z);
                        this.m.add(awrVarD2);
                        this.r = awrVarD2;
                    } else {
                        awrVar.g(null);
                    }
                    return this.r;
                }
            }
        } else {
            iArr = this.g;
            while (true) {
                if (i < iArr.length) {
                    i = -1;
                    break;
                }
                if (iArr[i] == i2) {
                    break;
                    break;
                }
                i++;
            }
            if (i != -1) {
                awrVar = this.r;
                if (awrVar == null) {
                    w280 w280Var2 = b380.b;
                    awr awrVarD3 = d(bg11.e, true, null, z);
                    this.m.add(awrVarD3);
                    this.r = awrVarD3;
                } else {
                    awrVar.g(null);
                }
                return this.r;
            }
        }
        return null;
    }

    public final awr c(List list, boolean z, b9v b9vVar) {
        this.q.getClass();
        boolean z2 = this.h | z;
        ao00 ao00Var = this.q;
        byte b = this.v;
        byte[] bArr = this.w;
        Looper looper = this.t;
        looper.getClass();
        dbu0 dbu0Var = this.x;
        dbu0Var.getClass();
        awr awrVar = new awr(this.b, ao00Var, this.i, this.k, list, b, z2, z, bArr, this.e, this.d, looper, this.j, dbu0Var);
        awrVar.g(b9vVar);
        if (this.l != -9223372036854775807L) {
            awrVar.g(null);
        }
        return awrVar;
    }

    public final awr d(List list, boolean z, b9v b9vVar, boolean z2) {
        awr awrVarC = c(list, z, b9vVar);
        boolean zB = b(awrVarC);
        int i = this.l;
        Set set = this.o;
        if (zB && !set.isEmpty()) {
            mjh1 mjh1VarK = t380.p(set).k();
            while (mjh1VarK.hasNext()) {
                ((y8v) mjh1VarK.next()).c(null);
            }
            awrVarC.c(b9vVar);
            if (i != -9223372036854775807L) {
                awrVarC.c(null);
            }
            awrVarC = c(list, z, b9vVar);
        }
        if (b(awrVarC) && z2) {
            Set set2 = this.n;
            if (!set2.isEmpty()) {
                mjh1 mjh1VarK2 = t380.p(set2).k();
                while (mjh1VarK2.hasNext()) {
                    ((bwr) mjh1VarK2.next()).release();
                }
                if (!set.isEmpty()) {
                    mjh1 mjh1VarK3 = t380.p(set).k();
                    while (mjh1VarK3.hasNext()) {
                        ((y8v) mjh1VarK3.next()).c(null);
                    }
                }
                awrVarC.c(b9vVar);
                if (i != -9223372036854775807L) {
                    awrVarC.c(null);
                }
                return c(list, z, b9vVar);
            }
        }
        return awrVarC;
    }

    @Override // p.f9v
    public final void e() {
        m(true);
        int i = this.f29p;
        this.f29p = i + 1;
        if (i != 0) {
            return;
        }
        if (this.q == null) {
            ao00 ao00VarR = this.c.r(this.b);
            this.q = ao00VarR;
            ao00VarR.i(new sun(this, (byte) 10));
        } else {
            if (this.l == -9223372036854775807L) {
                return;
            }
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.m;
                if (i2 >= arrayList.size()) {
                    return;
                }
                ((awr) arrayList.get(i2)).g(null);
                i2++;
            }
        }
    }

    @Override // p.f9v
    public final e9v f(b9v b9vVar, ie30 ie30Var) {
        dm5.y(this.f29p > 0);
        this.t.getClass();
        bwr bwrVar = new bwr(this, b9vVar);
        Handler handler = this.u;
        handler.getClass();
        handler.post(new e0i((Object) bwrVar, (Object) ie30Var, (byte) 9));
        return bwrVar;
    }

    @Override // p.f9v
    public final int g(ie30 ie30Var) {
        m(false);
        ao00 ao00Var = this.q;
        ao00Var.getClass();
        int iG = ao00Var.g();
        x8v x8vVar = ie30Var.t;
        if (x8vVar == null) {
            int i = asj0.i(ie30Var.f66p);
            int i2 = 0;
            while (true) {
                int[] iArr = this.g;
                if (i2 >= iArr.length) {
                    i2 = -1;
                    break;
                }
                if (iArr[i2] == i) {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                return 0;
            }
        } else if (this.w == null) {
            UUID uuid = this.b;
            if (j(x8vVar, uuid, true).isEmpty()) {
                if (x8vVar.d == 1 && x8vVar.a[0].a(whc.c)) {
                    oon1.H("DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = x8vVar.c;
            if (str != null && !"cenc".equals(str) && (!"cbcs".equals(str) ? "cbc1".equals(str) || "cens".equals(str) : Build.VERSION.SDK_INT < 25)) {
                return 1;
            }
        }
        return iG;
    }

    @Override // p.f9v
    public final void h(Looper looper, dbu0 dbu0Var) {
        synchronized (this) {
            try {
                Looper looper2 = this.t;
                if (looper2 == null) {
                    this.t = looper;
                    this.u = new Handler(looper);
                } else {
                    dm5.y(looper2 == looper);
                    this.u.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.x = dbu0Var;
    }

    @Override // p.f9v
    public final y8v i(b9v b9vVar, ie30 ie30Var) {
        m(false);
        dm5.y(this.f29p > 0);
        this.t.getClass();
        return a(this.t, b9vVar, ie30Var, true);
    }

    public final void k() {
        if (this.q != null && this.f29p == 0 && this.m.isEmpty() && this.n.isEmpty()) {
            ao00 ao00Var = this.q;
            ao00Var.getClass();
            ao00Var.release();
            this.q = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(byte[] bArr, int i) {
        dm5.y(this.m.isEmpty());
        if (i == 1 || i == 3) {
            bArr.getClass();
        }
        this.v = i;
        this.w = bArr;
    }

    public final void m(boolean z) {
        if (z && this.t == null) {
            oon1.I("DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.t;
        looper.getClass();
        if (threadCurrentThread != looper.getThread()) {
            oon1.I("DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.t.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // p.f9v
    public final void release() {
        m(true);
        int i = this.f29p - 1;
        this.f29p = i;
        if (i != 0) {
            return;
        }
        if (this.l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.m);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((awr) arrayList.get(i2)).c(null);
            }
        }
        mjh1 mjh1VarK = t380.p(this.n).k();
        while (mjh1VarK.hasNext()) {
            ((bwr) mjh1VarK.next()).release();
        }
        k();
    }
}
