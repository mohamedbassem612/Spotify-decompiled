package p;

import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tc70 extends yxo1 {
    public final Bundle c;

    public tc70(uc70 uc70Var) {
        this.c = new Bundle(uc70Var.c);
    }

    public final yxo1 A(int i, String str) {
        this.c.putInt("capping_maxImpressions", i);
        return this;
    }

    public final boolean B() {
        return this.c.isEmpty();
    }

    public final yxo1 E(String str, long[] jArr) {
        this.c.putLongArray(str, jArr);
        return this;
    }

    public final yxo1 F(long j, String str) {
        this.c.putLong(str, j);
        return this;
    }

    public final yxo1 G(String str, Parcelable parcelable) {
        this.c.putParcelable(str, parcelable);
        return this;
    }

    public final yxo1 I(String str, Serializable serializable) {
        this.c.putSerializable(str, serializable);
        return this;
    }

    public final yxo1 J(String str, String str2) {
        this.c.putString(str, str2);
        return this;
    }

    public final tc70 K(String str, String[] strArr) {
        this.c.putStringArray(str, strArr);
        return this;
    }

    public final yxo1 m(String str, boolean z) {
        this.c.putBoolean(str, z);
        return this;
    }

    public final yxo1 n(String str, boolean[] zArr) {
        this.c.putBooleanArray(str, zArr);
        return this;
    }

    public final HubsImmutableComponentBundle o() {
        HubsImmutableComponentBundle hubsImmutableComponentBundle = HubsImmutableComponentBundle.b;
        return new HubsImmutableComponentBundle(new Bundle(this.c));
    }

    public final yxo1 p(HubsImmutableComponentBundle hubsImmutableComponentBundle, String str) {
        HubsImmutableComponentBundle hubsImmutableComponentBundle2 = HubsImmutableComponentBundle.b;
        this.c.putParcelable(str, lqc.v(hubsImmutableComponentBundle));
        return this;
    }

    public final yxo1 q(String str, HubsImmutableComponentBundle[] hubsImmutableComponentBundleArr) {
        HubsImmutableComponentBundle[] hubsImmutableComponentBundleArr2;
        if (hubsImmutableComponentBundleArr != null) {
            ArrayList arrayList = new ArrayList(hubsImmutableComponentBundleArr.length);
            for (HubsImmutableComponentBundle hubsImmutableComponentBundle : hubsImmutableComponentBundleArr) {
                arrayList.add(hubsImmutableComponentBundle);
            }
            hubsImmutableComponentBundleArr2 = (HubsImmutableComponentBundle[]) arrayList.toArray(new HubsImmutableComponentBundle[0]);
        } else if (hubsImmutableComponentBundleArr != null) {
            ArrayList arrayList2 = new ArrayList(hubsImmutableComponentBundleArr.length);
            for (HubsImmutableComponentBundle hubsImmutableComponentBundle2 : hubsImmutableComponentBundleArr) {
                HubsImmutableComponentBundle hubsImmutableComponentBundle3 = HubsImmutableComponentBundle.b;
                arrayList2.add(lqc.v(hubsImmutableComponentBundle2));
            }
            hubsImmutableComponentBundleArr2 = (HubsImmutableComponentBundle[]) arrayList2.toArray(new HubsImmutableComponentBundle[0]);
        } else {
            hubsImmutableComponentBundleArr2 = null;
        }
        this.c.putParcelableArray(str, (Parcelable[]) hubsImmutableComponentBundleArr2);
        return this;
    }

    public final yxo1 v(String str, double[] dArr) {
        this.c.putDoubleArray(str, dArr);
        return this;
    }

    public final yxo1 w(String str, double d) {
        this.c.putDouble(str, d);
        return this;
    }
}
