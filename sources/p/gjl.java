package p;

import android.net.NetworkRequest;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gjl {
    public static final gjl j = new gjl(15);
    public final int a;
    public final e8o0 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final long h;
    public final Set i;

    public gjl(int i) {
        int i2 = (i & 1) != 0 ? 1 : 3;
        boolean z = (i & 4) == 0;
        this.b = new e8o0(null);
        this.a = i2;
        this.c = false;
        this.d = false;
        this.e = z;
        this.f = false;
        this.g = -1L;
        this.h = -1L;
        this.i = w7x.a;
    }

    public final NetworkRequest a() {
        return (NetworkRequest) this.b.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !gjl.class.equals(obj.getClass())) {
            return false;
        }
        gjl gjlVar = (gjl) obj;
        if (this.c == gjlVar.c && this.d == gjlVar.d && this.e == gjlVar.e && this.f == gjlVar.f && this.g == gjlVar.g && this.h == gjlVar.h && u890.j(a(), gjlVar.a()) && this.a == gjlVar.a) {
            return this.i.equals(gjlVar.i);
        }
        return false;
    }

    public final int hashCode() {
        int iC = ((((((((l1d.C(this.a) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31;
        long j2 = this.g;
        int i = (iC + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.h;
        int iC2 = gvg.c((i + ((int) (j3 ^ (j3 >>> 32)))) * 31, 31, this.i);
        NetworkRequest networkRequestA = a();
        return iC2 + (networkRequestA != null ? networkRequestA.hashCode() : 0);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + cy30.A(this.a) + ", requiresCharging=" + this.c + ", requiresDeviceIdle=" + this.d + ", requiresBatteryNotLow=" + this.e + ", requiresStorageNotLow=" + this.f + ", contentTriggerUpdateDelayMillis=" + this.g + ", contentTriggerMaxDelayMillis=" + this.h + ", contentUriTriggers=" + this.i + ", }";
    }

    public gjl(e8o0 e8o0Var, int i, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, Set set) {
        this.b = e8o0Var;
        this.a = i;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = j2;
        this.h = j3;
        this.i = set;
    }

    public gjl(gjl gjlVar) {
        this.c = gjlVar.c;
        this.d = gjlVar.d;
        this.b = gjlVar.b;
        this.a = gjlVar.a;
        this.e = gjlVar.e;
        this.f = gjlVar.f;
        this.i = gjlVar.i;
        this.g = gjlVar.g;
        this.h = gjlVar.h;
    }
}
