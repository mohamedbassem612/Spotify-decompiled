package p;

import android.util.SparseLongArray;
import androidx.compose.ui.geometry.Offset;
import com.google.android.gms.common.api.ApiException;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class o0g implements Function, l6u0, fc10, gc10, wjh0, ird1, d5q0 {
    public final /* synthetic */ byte a;
    public long b;
    public Object c;

    public o0g(byte b) {
        this.a = b;
        switch (b) {
            case 12:
                this.c = new LinkedHashMap();
                break;
            case 17:
                this.c = new SparseLongArray();
                break;
            default:
                this.b = 0L;
                break;
        }
    }

    public static long G(o0g o0gVar, long j, float f) {
        long jG = Offset.g(o0gVar.b, j);
        o0gVar.b = jG;
        float fD = ((qqq0) o0gVar.c) == null ? Offset.d(jG) : Math.abs(o0gVar.J(jG));
        if (fD <= 0.0f || fD < f) {
            return 9205357640488583168L;
        }
        qqq0 qqq0Var = (qqq0) o0gVar.c;
        long j2 = o0gVar.b;
        if (qqq0Var == null) {
            return Offset.f(o0gVar.b, Offset.h(f, Offset.b(Offset.d(j2), j2)));
        }
        float fJ = o0gVar.J(j2) - (Math.signum(o0gVar.J(o0gVar.b)) * f);
        long j3 = o0gVar.b;
        qqq0 qqq0Var2 = (qqq0) o0gVar.c;
        qqq0 qqq0Var3 = qqq0.b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (qqq0Var2 == qqq0Var3 ? j3 & 4294967295L : j3 >> 32));
        if (((qqq0) o0gVar.c) == qqq0Var3) {
            return (((long) Float.floatToRawIntBits(fJ)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(fJ)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
    }

    public static q3c K() {
        return new q3c();
    }

    public static void O(o0g o0gVar) {
        o0gVar.b = 0L;
    }

    public void A(mlw0 mlw0Var) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
        q3c q3cVar = (q3c) mlw0Var.b;
        if (linkedHashMap.get(q3cVar) == mlw0Var) {
            linkedHashMap.remove(q3cVar);
        }
    }

    public void B() {
        if (((o0g) this.c) == null) {
            this.c = new o0g((byte) 0);
        }
    }

    public boolean C(int i) {
        if (i < 64) {
            return ((1 << i) & this.b) != 0;
        }
        B();
        return ((o0g) this.c).C(i - 64);
    }

    public long D() {
        return this.b;
    }

    public l3q0 E() {
        return (l3q0) this.c;
    }

    public long F() {
        return this.b;
    }

    public void H(int i, boolean z) {
        if (i >= 64) {
            B();
            ((o0g) this.c).H(i - 64, z);
            return;
        }
        long j = this.b;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.b = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            P(i);
        } else {
            y(i);
        }
        if (z2 || ((o0g) this.c) != null) {
            B();
            ((o0g) this.c).H(0, z2);
        }
    }

    public boolean I() {
        return !((LinkedHashMap) this.c).isEmpty();
    }

    public float J(long j) {
        return Float.intBitsToFloat((int) (((qqq0) this.c) == qqq0.b ? j >> 32 : j & 4294967295L));
    }

    public boolean L(int i) {
        if (i >= 64) {
            B();
            return ((o0g) this.c).L(i - 64);
        }
        long j = 1 << i;
        long j2 = this.b;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.b = j3;
        long j4 = j - 1;
        this.b = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        o0g o0gVar = (o0g) this.c;
        if (o0gVar != null) {
            if (o0gVar.C(0)) {
                P(63);
            }
            ((o0g) this.c).L(0);
        }
        return z;
    }

    public void M() {
        switch (this.a) {
            case 0:
                this.b = 0L;
                o0g o0gVar = (o0g) this.c;
                if (o0gVar != null) {
                    o0gVar.M();
                }
                break;
            default:
                this.b++;
                ((LinkedHashMap) this.c).clear();
                break;
        }
    }

    public void N(long j) {
        this.b = j;
    }

    public void P(int i) {
        if (i < 64) {
            this.b |= 1 << i;
        } else {
            B();
            ((o0g) this.c).P(i - 64);
        }
    }

    public void Q(qqq0 qqq0Var) {
        this.c = qqq0Var;
    }

    public void R(int i, long j) {
        SparseLongArray sparseLongArray = (SparseLongArray) this.c;
        long j2 = sparseLongArray.get(i, -9223372036854775807L);
        if (j2 == -9223372036854775807L || j > j2) {
            sparseLongArray.put(i, j);
            if (j2 == -9223372036854775807L || j2 == this.b) {
                String str = zoi1.a;
                if (sparseLongArray.size() == 0) {
                    hhg1.k();
                    return;
                }
                long jMin = Long.MAX_VALUE;
                for (int i2 = 0; i2 < sparseLongArray.size(); i2++) {
                    jMin = Math.min(jMin, sparseLongArray.valueAt(i2));
                }
                this.b = jMin;
            }
        }
    }

    public Object apply(Object obj) {
        t3s0 t3s0Var;
        switch (this.a) {
            case 1:
                x3s0 x3s0Var = (x3s0) obj;
                long jA = x3s0Var.a() - this.b;
                long j = ((n4t) this.c).b;
                if (jA > j) {
                    jA = j;
                }
                return Completable.u(jA, TimeUnit.MILLISECONDS, Schedulers.b).d(Observable.just(x3s0Var));
            case 2:
                return ((bkv) this.c).a.c().j(this.b, (spq0) obj);
            case 3:
                return Long.valueOf(((Number) ((PlayerState) obj).position(((g710) this.c).c.b()).e(0L)).longValue() + this.b);
            case 4:
                if (((Boolean) obj).booleanValue()) {
                    return ((a9c0) this.c).c.a(this.b);
                }
                Observable observableEmpty = Observable.empty();
                observableEmpty.getClass();
                return observableEmpty;
            case 5:
                p9c0 p9c0Var = (t9c0) obj;
                rkd0 rkd0Var = (rkd0) this.c;
                long j2 = this.b;
                rkd0Var.getClass();
                if (p9c0Var instanceof p9c0) {
                    p9c0 p9c0Var2 = p9c0Var;
                    t3s0Var = new t3s0(k1p1.r(p9c0Var2.a().a) - j2, p9c0Var2.a.b);
                } else {
                    t3s0Var = null;
                }
                if (t3s0Var != null) {
                    return t3s0Var;
                }
                eg.m("only expecting ClosePartyEvent");
                return null;
            case 6:
                return ((x610) ((s24) this.c).b).c().i(this.b, spq0.d((LoggingParams) obj));
            case 7:
            default:
                ytw0 ytw0Var = jfv.b;
                return yoi1.l(new jfv(fdg1.l0(this.b - ((lw81) this.c).a.b(), ngv.d)), new jfv(0L));
            case 8:
                d3o0 d3o0Var = (d3o0) this.c;
                hma1 hma1VarEdit = d3o0Var.a.b(d3o0Var.h, (String) obj).edit();
                hma1VarEdit.c(bma1.b.n("key_tap_bt_permissions_timestamp"), this.b);
                hma1VarEdit.g();
                return CompletableEmpty.a;
        }
    }

    public boolean b(int i, boolean z) {
        return ((fc10) this.c).b(i, true);
    }

    public void c(fn51 fn51Var) {
        ((gc10) this.c).c(new wjb1(this, fn51Var, fn51Var));
    }

    public boolean d(byte[] bArr, int i, int i2, boolean z) {
        return ((fc10) this.c).d(bArr, i, i2, z);
    }

    public void f() {
        ((fc10) this.c).f();
    }

    public boolean g(byte[] bArr, int i, int i2, boolean z) {
        return ((fc10) this.c).g(bArr, 0, i2, z);
    }

    public long getLength() {
        return ((fc10) this.c).getLength() - this.b;
    }

    public long getPosition() {
        return ((fc10) this.c).getPosition() - this.b;
    }

    public void h(int i, byte[] bArr, int i2) {
        ((fc10) this.c).h(i, bArr, i2);
    }

    public void i(Exception exc) {
        switch (this.a) {
            case 19:
                int statusCode = exc instanceof ApiException ? ((ApiException) exc).getStatusCode() : 13;
                long j = this.b;
                Iterator it = ((sxn1) ((e321) ((zrj1) this.c).d).c).d.iterator();
                while (it.hasNext()) {
                    ((mon1) it.next()).d(j, statusCode, (den1) null);
                }
                break;
            default:
                ((AtomicLong) ((zxl1) this.c).c).set(this.b);
                break;
        }
    }

    public long j() {
        return ((fc10) this.c).j() - this.b;
    }

    public void k(int i) {
        ((fc10) this.c).k(i);
    }

    public k2u0 l() {
        return k2u0.d;
    }

    public void o(Exception exc) {
        ywv0 seekFramePrefetcher = ((VideoSurfaceView) this.c).getSeekFramePrefetcher();
        if (seekFramePrefetcher != null) {
            seekFramePrefetcher.i(this.b);
        }
    }

    public void onSuccess() {
        VideoSurfaceView videoSurfaceView = (VideoSurfaceView) this.c;
        if (!videoSurfaceView.t1) {
            videoSurfaceView.t1 = true;
        }
        ywv0 seekFramePrefetcher = videoSurfaceView.getSeekFramePrefetcher();
        if (seekFramePrefetcher != null) {
            seekFramePrefetcher.i(this.b);
        }
    }

    public long p() {
        return this.b;
    }

    public int q(int i, byte[] bArr, int i2) {
        return ((fc10) this.c).q(i, bArr, i2);
    }

    public int r(int i) {
        return ((fc10) this.c).r(i);
    }

    public int read(byte[] bArr, int i, int i2) {
        return ((fc10) this.c).read(bArr, i, i2);
    }

    public void readFully(byte[] bArr, int i, int i2) {
        ((fc10) this.c).readFully(bArr, i, i2);
    }

    public void s() {
        ((gc10) this.c).s();
    }

    public String toString() {
        switch (this.a) {
            case 0:
                if (((o0g) this.c) == null) {
                    return Long.toBinaryString(this.b);
                }
                return ((o0g) this.c).toString() + "xx" + Long.toBinaryString(this.b);
            default:
                return super.toString();
        }
    }

    public void u(int i) {
        ((fc10) this.c).u(i);
    }

    public boolean v(int i, boolean z) {
        return ((fc10) this.c).v(i, true);
    }

    public gtf1 w(int i, int i2) {
        return ((gc10) this.c).w(i, i2);
    }

    public mlw0 x(q3c q3cVar, long j) {
        if (j != this.b) {
            return null;
        }
        mlw0 mlw0Var = new mlw0(q3cVar, (byte) 27);
        ((LinkedHashMap) this.c).put(q3cVar, mlw0Var);
        return mlw0Var;
    }

    public void y(int i) {
        if (i < 64) {
            this.b &= ~(1 << i);
            return;
        }
        o0g o0gVar = (o0g) this.c;
        if (o0gVar != null) {
            o0gVar.y(i - 64);
        }
    }

    public int z(int i) {
        o0g o0gVar = (o0g) this.c;
        if (o0gVar == null) {
            long j = this.b;
            return i >= 64 ? Long.bitCount(j) : Long.bitCount(((1 << i) - 1) & j);
        }
        if (i < 64) {
            return Long.bitCount(((1 << i) - 1) & this.b);
        }
        return Long.bitCount(this.b) + o0gVar.z(i - 64);
    }

    public void m(k2u0 k2u0Var) {
    }

    public /* synthetic */ o0g(Object obj, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o0g(qqq0 qqq0Var) {
        this((Object) qqq0Var, 0L, (byte) 16);
        this.a = (byte) 16;
    }

    public o0g(fc10 fc10Var, long j) {
        this.a = (byte) 14;
        this.c = fc10Var;
        dm5.m(fc10Var.getPosition() >= j);
        this.b = j;
    }

    public /* synthetic */ o0g(long j, Object obj, byte b) {
        this.a = b;
        this.b = j;
        this.c = obj;
    }

    public void apply(long j) {
        Map map;
        String str = null;
        switch (this.a) {
            case 10:
                long j2 = 50 + j;
                long j3 = this.b;
                ohd ohdVar = (ohd) this.c;
                if (j2 < j3) {
                    ohdVar.resumeWith((Object) null);
                } else {
                    ohdVar.resumeWith(Long.valueOf(j));
                }
                break;
            default:
                phi0 phi0Var = (phi0) this.c;
                m9n m9nVar = (m9n) phi0Var.b;
                sg01 sg01Var = sg01.b;
                m0u0 m0u0Var = (m0u0) phi0Var.f;
                if (m0u0Var != null && (map = m0u0Var.a.d) != null) {
                    str = (String) map.get("playback_id");
                }
                m9nVar.b(new crj1(sg01Var, (yjh1) null, str, Long.valueOf(this.b), 2));
                break;
        }
    }
}
