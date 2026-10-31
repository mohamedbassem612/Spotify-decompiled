package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tnn0 implements Comparable {
    public final vnn0 a;
    public final Bundle b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final int f;

    public tnn0(vnn0 vnn0Var, Bundle bundle, boolean z, int i, boolean z2, int i2) {
        this.a = vnn0Var;
        this.b = bundle;
        this.c = z;
        this.d = i;
        this.e = z2;
        this.f = i2;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(tnn0 tnn0Var) {
        boolean z = tnn0Var.e;
        boolean z2 = tnn0Var.c;
        Bundle bundle = tnn0Var.b;
        boolean z3 = this.c;
        if (z3 && !z2) {
            return 1;
        }
        if (!z3 && z2) {
            return -1;
        }
        int i = this.d - tnn0Var.d;
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        Bundle bundle2 = this.b;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            int size = bundle2.size();
            bundle.getClass();
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z4 = this.e;
        if (z4 && !z) {
            return 1;
        }
        if (z4 || !z) {
            return this.f - tnn0Var.f;
        }
        return -1;
    }
}
