package p;

import android.content.ComponentName;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cng1 {
    public final Context a;
    public final int b;
    public final boolean c;
    public final dlb0 d;
    public final int e;
    public final boolean f;
    public final AtomicInteger g;
    public final lk80 h;
    public final AtomicBoolean i;
    public final long j;
    public final int k;
    public final boolean l;
    public final Integer m;
    public final ComponentName n;

    public cng1(Context context, int i, boolean z, dlb0 dlb0Var, int i2, boolean z2, AtomicInteger atomicInteger, lk80 lk80Var, AtomicBoolean atomicBoolean, long j, int i3, boolean z3, Integer num, ComponentName componentName) {
        this.a = context;
        this.b = i;
        this.c = z;
        this.d = dlb0Var;
        this.e = i2;
        this.f = z2;
        this.g = atomicInteger;
        this.h = lk80Var;
        this.i = atomicBoolean;
        this.j = j;
        this.k = i3;
        this.l = z3;
        this.m = num;
        this.n = componentName;
    }

    public static cng1 a(cng1 cng1Var, int i, AtomicInteger atomicInteger, lk80 lk80Var, AtomicBoolean atomicBoolean, long j, Integer num, int i2) {
        return new cng1(cng1Var.a, cng1Var.b, cng1Var.c, cng1Var.d, (i2 & 16) != 0 ? cng1Var.e : i, (i2 & 32) != 0 ? cng1Var.f : true, (i2 & 64) != 0 ? cng1Var.g : atomicInteger, (i2 & 128) != 0 ? cng1Var.h : lk80Var, (i2 & 256) != 0 ? cng1Var.i : atomicBoolean, (i2 & 512) != 0 ? cng1Var.j : j, (i2 & 1024) != 0 ? cng1Var.k : 0, (i2 & 4096) != 0 ? cng1Var.l : true, (i2 & 8192) != 0 ? cng1Var.m : num, cng1Var.n);
    }

    public final cng1 b(lk80 lk80Var, int i) {
        return a(this, i, null, lk80Var, null, 0L, null, 32623);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cng1) {
            cng1 cng1Var = (cng1) obj;
            if (this.a.equals(cng1Var.a) && this.b == cng1Var.b && this.c == cng1Var.c && this.d == cng1Var.d && this.e == cng1Var.e && this.f == cng1Var.f && u890.j(this.g, cng1Var.g) && u890.j(this.h, cng1Var.h) && u890.j(this.i, cng1Var.i) && this.j == cng1Var.j && this.k == cng1Var.k && this.l == cng1Var.l && u890.j(this.m, cng1Var.m) && u890.j(this.n, cng1Var.n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iG = xcg1.g(kaa0.f(-1, kaa0.f(this.k, cy30.f((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + xcg1.g(kaa0.f(this.e, (this.d.hashCode() + xcg1.g(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c)) * 31, 31), 31, this.f)) * 31)) * 31)) * 31, this.j, 31), 31), 31), 31, this.l);
        Integer num = this.m;
        int iHashCode = (iG + (num == null ? 0 : num.hashCode())) * 31;
        ComponentName componentName = this.n;
        return iHashCode + (componentName != null ? componentName.hashCode() : 0);
    }

    public final String toString() {
        return "TranslationContext(context=" + this.a + ", appWidgetId=" + this.b + ", isRtl=" + this.c + ", layoutConfiguration=" + this.d + ", itemPosition=" + this.e + ", isLazyCollectionDescendant=" + this.f + ", lastViewId=" + this.g + ", parentContext=" + this.h + ", isBackgroundSpecified=" + this.i + ", layoutSize=" + ((Object) s3v.c(this.j)) + ", layoutCollectionViewId=" + this.k + ", layoutCollectionItemId=-1, canUseSelectableGroup=" + this.l + ", actionTargetId=" + this.m + ", actionBroadcastReceiver=" + this.n + ')';
    }
}
