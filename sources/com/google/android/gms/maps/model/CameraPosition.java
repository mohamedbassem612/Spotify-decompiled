package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import p.drj0;
import p.e9n1;
import p.j541;
import p.u9;
import p.zod;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class CameraPosition extends u9 implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new e9n1((byte) 11);
    public final LatLng a;
    public final float b;
    public final float c;
    public final float d;

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        zod.t(latLng, "camera target must not be null.");
        boolean z = false;
        if (f2 >= 0.0f && f2 <= 90.0f) {
            z = true;
        }
        zod.l(z, "Tilt needs to be between 0 and 90 inclusive: %s", new Object[]{Float.valueOf(f2)});
        this.a = latLng;
        this.b = f;
        this.c = f2 + 0.0f;
        this.d = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.a.equals(cameraPosition.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(cameraPosition.b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(cameraPosition.c) && Float.floatToIntBits(this.d) == Float.floatToIntBits(cameraPosition.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b), Float.valueOf(this.c), Float.valueOf(this.d)});
    }

    public final String toString() {
        drj0 drj0Var = new drj0(this);
        drj0Var.d(this.a, "target");
        drj0Var.d(Float.valueOf(this.b), "zoom");
        drj0Var.d(Float.valueOf(this.c), "tilt");
        drj0Var.d(Float.valueOf(this.d), "bearing");
        return drj0Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.E(parcel, 2, this.a, i);
        j541.K(parcel, 3, 4);
        parcel.writeFloat(this.b);
        j541.K(parcel, 4, 4);
        parcel.writeFloat(this.c);
        j541.K(parcel, 5, 4);
        parcel.writeFloat(this.d);
        j541.M(iL, parcel);
    }
}
