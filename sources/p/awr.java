package p;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager$MissingSchemeDataException;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.KeysExpiredException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class awr implements y8v {
    public zn00 A;
    public final List a;
    public final ao00 b;
    public final zfr c;
    public final her d;
    public final byte e;
    public final boolean f;
    public final boolean g;
    public final HashMap h;
    public final k4n i;
    public final ij81 j;
    public final dbu0 k;
    public final imh0 l;
    public final UUID m;
    public final Looper n;
    public final nj7 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f14p;
    public byte q;
    public int r;
    public HandlerThread s;
    public yvr t;
    public nco u;
    public DrmSession.DrmSessionException v;
    public byte[] w;
    public byte[] x;
    public xn00 y;
    public dg90 z;

    /* JADX WARN: Multi-variable type inference failed */
    public awr(UUID uuid, ao00 ao00Var, zfr zfrVar, her herVar, List list, int i, boolean z, boolean z2, byte[] bArr, HashMap map, imh0 imh0Var, Looper looper, ij81 ij81Var, dbu0 dbu0Var) {
        if (i == 1 || i == 3) {
            bArr.getClass();
        }
        this.m = uuid;
        this.c = zfrVar;
        this.d = herVar;
        this.b = ao00Var;
        this.e = i;
        this.f = z;
        this.g = z2;
        if (bArr != null) {
            this.x = bArr;
            this.a = null;
        } else {
            list.getClass();
            this.a = Collections.unmodifiableList(list);
        }
        this.h = map;
        this.l = imh0Var;
        this.i = new k4n();
        this.j = ij81Var;
        this.k = dbu0Var;
        this.q = (byte) 2;
        this.n = looper;
        this.o = new nj7(this, looper, (byte) 1);
        this.f14p = new Object();
    }

    @Override // p.y8v
    public final DrmSession.DrmSessionException a() {
        q();
        if (this.q == 1) {
            return this.v;
        }
        return null;
    }

    @Override // p.y8v
    public final UUID b() {
        q();
        return this.m;
    }

    @Override // p.y8v
    public final void c(b9v b9vVar) {
        q();
        int i = this.r;
        if (i <= 0) {
            oon1.v("release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.r = i2;
        if (i2 == 0) {
            this.q = (byte) 0;
            nj7 nj7Var = this.o;
            String str = zoi1.a;
            nj7Var.removeCallbacksAndMessages(null);
            yvr yvrVar = this.t;
            synchronized (yvrVar) {
                yvrVar.removeCallbacksAndMessages(null);
                yvrVar.a = true;
            }
            this.t = null;
            this.s.quit();
            this.s = null;
            this.u = null;
            this.v = null;
            this.y = null;
            synchronized (this.f14p) {
                this.z = null;
            }
            this.A = null;
            byte[] bArr = this.w;
            if (bArr != null) {
                this.b.k(bArr);
                this.w = null;
            }
        }
        if (b9vVar != null) {
            k4n k4nVar = this.i;
            synchronized (k4nVar.a) {
                try {
                    Integer num = (Integer) k4nVar.b.get(b9vVar);
                    if (num != null) {
                        ArrayList arrayList = new ArrayList(k4nVar.d);
                        arrayList.remove(b9vVar);
                        k4nVar.d = Collections.unmodifiableList(arrayList);
                        int iIntValue = num.intValue();
                        HashMap map = k4nVar.b;
                        if (iIntValue == 1) {
                            map.remove(b9vVar);
                            HashSet hashSet = new HashSet(k4nVar.c);
                            hashSet.remove(b9vVar);
                            k4nVar.c = Collections.unmodifiableSet(hashSet);
                        } else {
                            map.put(b9vVar, Integer.valueOf(num.intValue() - 1));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.i.b(b9vVar) == 0) {
                b9vVar.f();
            }
        }
        her herVar = this.d;
        int i3 = this.r;
        cwr cwrVar = (cwr) herVar.b;
        if (i3 == 1 && cwrVar.f29p > 0 && cwrVar.l != -9223372036854775807L) {
            cwrVar.o.add(this);
            Handler handler = cwrVar.u;
            handler.getClass();
            handler.postAtTime(new fe(this, (byte) 29), this, SystemClock.uptimeMillis() + ((long) cwrVar.l));
        } else if (i3 == 0) {
            cwrVar.m.remove(this);
            if (cwrVar.r == this) {
                cwrVar.r = null;
            }
            if (cwrVar.s == this) {
                cwrVar.s = null;
            }
            zfr zfrVar = cwrVar.i;
            HashSet hashSet2 = (HashSet) zfrVar.b;
            hashSet2.remove(this);
            if (((awr) zfrVar.c) == this) {
                zfrVar.c = null;
                if (!hashSet2.isEmpty()) {
                    awr awrVar = (awr) hashSet2.iterator().next();
                    zfrVar.c = awrVar;
                    zn00 zn00VarC = awrVar.b.c();
                    awrVar.A = zn00VarC;
                    yvr yvrVar2 = awrVar.t;
                    String str2 = zoi1.a;
                    zn00VarC.getClass();
                    yvrVar2.getClass();
                    yvrVar2.obtainMessage(1, new zvr(d2e0.h.getAndIncrement(), true, SystemClock.elapsedRealtime(), zn00VarC)).sendToTarget();
                }
            }
            if (cwrVar.l != -9223372036854775807L) {
                Handler handler2 = cwrVar.u;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                cwrVar.o.remove(this);
            }
        }
        cwrVar.k();
    }

    @Override // p.y8v
    public final boolean d() {
        q();
        return this.f;
    }

    @Override // p.y8v
    public final byte[] e() {
        q();
        return this.x;
    }

    @Override // p.y8v
    public final nco f() {
        q();
        return this.u;
    }

    @Override // p.y8v
    public final void g(b9v b9vVar) {
        q();
        if (this.r < 0) {
            oon1.v("Session reference count less than zero: " + this.r);
            this.r = 0;
        }
        if (b9vVar != null) {
            k4n k4nVar = this.i;
            synchronized (k4nVar.a) {
                try {
                    ArrayList arrayList = new ArrayList(k4nVar.d);
                    arrayList.add(b9vVar);
                    k4nVar.d = Collections.unmodifiableList(arrayList);
                    Integer num = (Integer) k4nVar.b.get(b9vVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(k4nVar.c);
                        hashSet.add(b9vVar);
                        k4nVar.c = Collections.unmodifiableSet(hashSet);
                    }
                    k4nVar.b.put(b9vVar, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        int i = this.r + 1;
        this.r = i;
        if (i == 1) {
            dm5.y(this.q == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.s = handlerThread;
            handlerThread.start();
            this.t = new yvr(this, this.s.getLooper());
            if (n()) {
                j(true);
            }
        } else if (b9vVar != null && k() && this.i.b(b9vVar) == 1) {
            b9vVar.d(this.q);
        }
        cwr cwrVar = (cwr) this.d.b;
        if (cwrVar.l != -9223372036854775807L) {
            cwrVar.o.remove(this);
            Handler handler = cwrVar.u;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // p.y8v
    public final int getState() {
        q();
        return this.q;
    }

    @Override // p.y8v
    public final Map h() {
        q();
        byte[] bArr = this.w;
        if (bArr == null) {
            return null;
        }
        return this.b.b(bArr);
    }

    @Override // p.y8v
    public final boolean i(String str) {
        q();
        byte[] bArr = this.w;
        bArr.getClass();
        return this.b.q(str, bArr);
    }

    public final void j(boolean z) {
        long j;
        Pair pair;
        long jMin;
        Set set;
        if (this.g) {
            return;
        }
        byte[] bArr = this.w;
        String str = zoi1.a;
        byte b = this.e;
        if (b != 0 && b != 1) {
            if (b == 2) {
                if (this.x == null || p()) {
                    o(2, z, bArr);
                    return;
                }
                return;
            }
            if (b != 3) {
                return;
            }
            this.x.getClass();
            this.w.getClass();
            o(3, z, this.x);
            return;
        }
        if (this.x == null) {
            o(1, z, bArr);
            return;
        }
        if (this.q == 4 || p()) {
            if (whc.e.equals(this.m)) {
                Map mapH = h();
                if (mapH == null) {
                    pair = null;
                } else {
                    long j2 = -9223372036854775807L;
                    try {
                        String str2 = (String) mapH.get("LicenseDurationRemaining");
                        j = str2 != null ? Long.parseLong(str2) : -9223372036854775807L;
                    } catch (NumberFormatException unused) {
                    }
                    Long lValueOf = Long.valueOf(j);
                    try {
                        String str3 = (String) mapH.get("PlaybackDurationRemaining");
                        if (str3 != null) {
                            j2 = Long.parseLong(str3);
                        }
                    } catch (NumberFormatException unused2) {
                    }
                    pair = new Pair(lValueOf, Long.valueOf(j2));
                }
                pair.getClass();
                jMin = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
            } else {
                jMin = Long.MAX_VALUE;
            }
            if (this.e == 0 && jMin <= 60) {
                oon1.s("Offline license has expired or will expire soon. Remaining seconds: " + jMin);
                o(2, z, bArr);
                return;
            }
            if (jMin <= 0) {
                l(2, new KeysExpiredException());
                return;
            }
            this.q = (byte) 4;
            k4n k4nVar = this.i;
            synchronized (k4nVar.a) {
                set = k4nVar.c;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((b9v) it.next()).c();
            }
        }
    }

    public final boolean k() {
        byte b = this.q;
        return b == 3 || b == 4;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final void l(int i, Throwable th) {
        int iE;
        Set set;
        if (th instanceof MediaDrm.MediaDrmStateException) {
            iE = zoi1.E(zoi1.F(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        } else if (th instanceof MediaDrmResetException) {
            iE = 6006;
        } else if ((th instanceof NotProvisionedException) || eth.D(th)) {
            iE = 6002;
        } else if (th instanceof DeniedByServerException) {
            iE = 6007;
        } else if (th instanceof UnsupportedDrmException) {
            iE = 6001;
        } else if (th instanceof DefaultDrmSessionManager$MissingSchemeDataException) {
            iE = 6003;
        } else if (th instanceof KeysExpiredException) {
            iE = 6008;
        } else if (i == 1) {
            iE = 6006;
        } else if (i == 2) {
            iE = 6004;
        } else {
            if (i != 3) {
                bhn0.q();
                return;
            }
            iE = 6002;
        }
        this.v = new DrmSession.DrmSessionException(iE, th);
        oon1.w("DRM session error", th);
        if (th instanceof Exception) {
            k4n k4nVar = this.i;
            synchronized (k4nVar.a) {
                set = k4nVar.c;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((b9v) it.next()).e((Exception) th);
            }
        } else if (!(th instanceof Error)) {
            k220.p("Unexpected Throwable subclass", th);
            return;
        } else if (!eth.E(th) && !eth.D(th)) {
            throw ((Error) th);
        }
        if (this.q != 4) {
            this.q = (byte) 1;
        }
    }

    public final void m(Throwable th, boolean z) {
        if ((th instanceof NotProvisionedException) || eth.D(th)) {
            this.c.u(this);
        } else {
            l(z ? 1 : 2, th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    public final boolean n() {
        Set set;
        if (k()) {
            return true;
        }
        try {
            byte[] bArrD = this.b.d();
            this.w = bArrD;
            this.b.m(bArrD, this.k);
            this.u = this.b.j(this.w);
            this.q = (byte) 3;
            k4n k4nVar = this.i;
            synchronized (k4nVar.a) {
                set = k4nVar.c;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((b9v) it.next()).d(3);
            }
            this.w.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            this.c.u(this);
            return false;
        } catch (Exception e) {
            e = e;
            if (eth.D(e)) {
                this.c.u(this);
                return false;
            }
            l(1, e);
            return false;
        } catch (NoSuchMethodError e2) {
            e = e2;
            if (eth.D(e)) {
                this.c.u(this);
                return false;
            }
            l(1, e);
            return false;
        }
    }

    public final void o(int i, boolean z, byte[] bArr) {
        try {
            synchronized (this.f14p) {
                try {
                    this.z = new dg90((byte) 3);
                    List list = this.a;
                    if (list != null) {
                        b380.p(list);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            xn00 xn00VarP = this.b.p(bArr, this.a, i, this.h);
            this.y = xn00VarP;
            yvr yvrVar = this.t;
            String str = zoi1.a;
            xn00VarP.getClass();
            yvrVar.getClass();
            yvrVar.obtainMessage(2, new zvr(d2e0.h.getAndIncrement(), z, SystemClock.elapsedRealtime(), xn00VarP)).sendToTarget();
        } catch (Exception | NoSuchMethodError e) {
            m(e, true);
        }
    }

    public final boolean p() {
        try {
            this.b.e(this.w, this.x);
            return true;
        } catch (Exception | NoSuchMethodError e) {
            l(1, e);
            return false;
        }
    }

    public final void q() {
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.n;
        if (threadCurrentThread != looper.getThread()) {
            oon1.I("DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
