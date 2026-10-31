package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import p.drj0;
import p.j541;
import p.u9;
import p.w2o1;
import p.zod;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class LatLngBounds extends u9 implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new w2o1(14);
    public final LatLng a;
    public final LatLng b;

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        zod.t(latLng, "southwest must not be null.");
        zod.t(latLng2, "northeast must not be null.");
        double d = latLng2.a;
        double d2 = latLng.a;
        zod.l(d >= d2, "southern latitude exceeds northern latitude (%s > %s)", new Object[]{Double.valueOf(d2), Double.valueOf(d)});
        this.a = latLng;
        this.b = latLng2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.a.equals(latLngBounds.a) && this.b.equals(latLngBounds.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        drj0 drj0Var = new drj0(this);
        drj0Var.d(this.a, "southwest");
        drj0Var.d(this.b, "northeast");
        return drj0Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.E(parcel, 2, this.a, i);
        j541.E(parcel, 3, this.b, i);
        j541.M(iL, parcel);
    }
}
