package p;

import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uc70 extends yxo1 {
    public final Bundle c;
    public final /* synthetic */ HubsImmutableComponentBundle d;

    public uc70(HubsImmutableComponentBundle hubsImmutableComponentBundle, Bundle bundle) {
        this.d = hubsImmutableComponentBundle;
        this.c = bundle;
    }

    public final yxo1 A(int i, String str) {
        HubsImmutableComponentBundle hubsImmutableComponentBundle = HubsImmutableComponentBundle.b;
        Integer num = (Integer) this.d.l(Integer.class, str);
        if (num != null && num.intValue() == i) {
            return this;
        }
        tc70 tc70Var = new tc70(this);
        tc70Var.c.putInt(str, i);
        return tc70Var;
    }

    public final boolean B() {
        return this.d.s().isEmpty();
    }

    public final yxo1 E(String str, long[] jArr) {
        HubsImmutableComponentBundle hubsImmutableComponentBundle = HubsImmutableComponentBundle.b;
        if (Arrays.equals((long[]) this.d.l(long[].class, str), jArr)) {
            return this;
        }
        tc70 tc70Var = new tc70(this);
        tc70Var.c.putLongArray(str, jArr);
        return tc70Var;
    }

    public final yxo1 F(long j, String str) {
        HubsImmutableComponentBundle hubsImmutableComponentBundle = HubsImmutableComponentBundle.b;
        Long l = (Long) this.d.l(Long.class, str);
        if (l != null && l.longValue() == j) {
            return this;
        }
        tc70 tc70Var = new tc70(this);
        tc70Var.c.putLong(str, j);
        return tc70Var;
    }

    public final yxo1 G(String str, Parcelable parcelable) {
        HubsImmutableComponentBundle hubsImmutableComponentBundle = HubsImmutableComponentBundle.b;
        if (u890.j(this.d.l(Parcelable.class, str), parcelable)) {
            return this;
        }
        tc70 tc70Var = new tc70(this);
        tc70Var.c.putParcelable(str, parcelable);
        return tc70Var;
    }

    public final yxo1 I(String str, Serializable serializable) {
        HubsImmutableComponentBundle hubsImmutableComponentBundle = HubsImmutableComponentBundle.b;
        if (u890.j(this.d.l(Serializable.class, str), serializable)) {
            return this;
        }
        tc70 tc70Var = new tc70(this);
        tc70Var.c.putSerializable(str, serializable);
        return tc70Var;
    }

    public final yxo1 J(String str, String str2) {
        HubsImmutableComponentBundle hubsImmutableComponentBundle = HubsImmutableComponentBundle.b;
        if (u890.j(this.d.l(String.class, str), str2)) {
            return this;
        }
        tc70 tc70Var = new tc70(this);
        tc70Var.c.putString(str, str2);
        return tc70Var;
    }

    public final tc70 K(String str, String[] strArr) {
        tc70 tc70Var = new tc70(this);
        tc70Var.c.putStringArray(str, strArr);
        return tc70Var;
    }

    public final Bundle M() {
        return this.c;
    }

    public final yxo1 m(String str, boolean z) {
        HubsImmutableComponentBundle hubsImmutableComponentBundle = HubsImmutableComponentBundle.b;
        if (u890.j(this.d.l(Boolean.class, str), Boolean.valueOf(z))) {
            return this;
        }
        tc70 tc70Var = new tc70(this);
        tc70Var.c.putBoolean(str, z);
        return tc70Var;
    }

    public final yxo1 n(String str, boolean[] zArr) {
        HubsImmutableComponentBundle hubsImmutableComponentBundle = HubsImmutableComponentBundle.b;
        if (Arrays.equals((boolean[]) this.d.l(boolean[].class, str), zArr)) {
            return this;
        }
        tc70 tc70Var = new tc70(this);
        tc70Var.c.putBooleanArray(str, zArr);
        return tc70Var;
    }

    public final HubsImmutableComponentBundle o() {
        return this.d;
    }

    public final yxo1 p(HubsImmutableComponentBundle hubsImmutableComponentBundle, String str) {
        HubsImmutableComponentBundle hubsImmutableComponentBundle2 = HubsImmutableComponentBundle.b;
        if (u890.j(this.d.l(HubsImmutableComponentBundle.class, str), hubsImmutableComponentBundle)) {
            return this;
        }
        tc70 tc70Var = new tc70(this);
        tc70Var.p(hubsImmutableComponentBundle, str);
        return tc70Var;
    }

    public final yxo1 q(String str, HubsImmutableComponentBundle[] hubsImmutableComponentBundleArr) {
        HubsImmutableComponentBundle hubsImmutableComponentBundle = HubsImmutableComponentBundle.b;
        if (Arrays.equals((Object[]) this.d.l(HubsImmutableComponentBundle[].class, str), hubsImmutableComponentBundleArr)) {
            return this;
        }
        tc70 tc70Var = new tc70(this);
        tc70Var.q(str, hubsImmutableComponentBundleArr);
        return tc70Var;
    }

    public final yxo1 v(String str, double[] dArr) {
        HubsImmutableComponentBundle hubsImmutableComponentBundle = HubsImmutableComponentBundle.b;
        if (Arrays.equals((double[]) this.d.l(double[].class, str), dArr)) {
            return this;
        }
        tc70 tc70Var = new tc70(this);
        tc70Var.c.putDoubleArray(str, dArr);
        return tc70Var;
    }

    public final yxo1 w(String str, double d) {
        HubsImmutableComponentBundle hubsImmutableComponentBundle = HubsImmutableComponentBundle.b;
        if (u890.g((Double) this.d.l(Double.class, str), d)) {
            return this;
        }
        tc70 tc70Var = new tc70(this);
        tc70Var.c.putDouble(str, d);
        return tc70Var;
    }
}
