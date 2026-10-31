package com.google.android.gms.maps;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import p.agm0;
import p.drj0;
import p.j541;
import p.jhc1;
import p.u9;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class GoogleMapOptions extends u9 implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new agm0((byte) 19);
    public final Float N0;
    public final Float O0;
    public final LatLngBounds P0;
    public final Boolean Q0;
    public final Integer R0;
    public final String S0;
    public Boolean X;
    public final Boolean Y;
    public final Boolean Z;
    public final Boolean a;
    public final Boolean b;
    public final int c;
    public final CameraPosition d;
    public final Boolean e;
    public final Boolean f;
    public final Boolean g;
    public final Boolean h;
    public final Boolean i;
    public final Boolean t;

    static {
        Color.argb(255, 236, 233, 225);
    }

    public GoogleMapOptions(byte b, byte b2, int i, CameraPosition cameraPosition, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11, Float f, Float f2, LatLngBounds latLngBounds, byte b12, Integer num, String str) {
        this.c = -1;
        this.N0 = null;
        this.O0 = null;
        this.P0 = null;
        this.R0 = null;
        this.S0 = null;
        this.a = jhc1.N(b);
        this.b = jhc1.N(b2);
        this.c = i;
        this.d = cameraPosition;
        this.e = jhc1.N(b3);
        this.f = jhc1.N(b4);
        this.g = jhc1.N(b5);
        this.h = jhc1.N(b6);
        this.i = jhc1.N(b7);
        this.t = jhc1.N(b8);
        this.X = jhc1.N(b9);
        this.Y = jhc1.N(b10);
        this.Z = jhc1.N(b11);
        this.N0 = f;
        this.O0 = f2;
        this.P0 = latLngBounds;
        this.Q0 = jhc1.N(b12);
        this.R0 = num;
        this.S0 = str;
    }

    public final String toString() {
        drj0 drj0Var = new drj0(this);
        drj0Var.d(Integer.valueOf(this.c), "MapType");
        drj0Var.d(this.X, "LiteMode");
        drj0Var.d(this.d, "Camera");
        drj0Var.d(this.f, "CompassEnabled");
        drj0Var.d(this.e, "ZoomControlsEnabled");
        drj0Var.d(this.g, "ScrollGesturesEnabled");
        drj0Var.d(this.h, "ZoomGesturesEnabled");
        drj0Var.d(this.i, "TiltGesturesEnabled");
        drj0Var.d(this.t, "RotateGesturesEnabled");
        drj0Var.d(this.Q0, "ScrollGesturesEnabledDuringRotateOrZoom");
        drj0Var.d(this.Y, "MapToolbarEnabled");
        drj0Var.d(this.Z, "AmbientEnabled");
        drj0Var.d(this.N0, "MinZoomPreference");
        drj0Var.d(this.O0, "MaxZoomPreference");
        drj0Var.d(this.R0, "BackgroundColor");
        drj0Var.d(this.P0, "LatLngBoundsForCameraTarget");
        drj0Var.d(this.a, "ZOrderOnTop");
        drj0Var.d(this.b, "UseViewLifecycleInFragment");
        return drj0Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        byte bL = jhc1.L(this.a);
        j541.K(parcel, 2, 4);
        parcel.writeInt(bL);
        byte bL2 = jhc1.L(this.b);
        j541.K(parcel, 3, 4);
        parcel.writeInt(bL2);
        j541.K(parcel, 4, 4);
        parcel.writeInt(this.c);
        j541.E(parcel, 5, this.d, i);
        byte bL3 = jhc1.L(this.e);
        j541.K(parcel, 6, 4);
        parcel.writeInt(bL3);
        byte bL4 = jhc1.L(this.f);
        j541.K(parcel, 7, 4);
        parcel.writeInt(bL4);
        byte bL5 = jhc1.L(this.g);
        j541.K(parcel, 8, 4);
        parcel.writeInt(bL5);
        byte bL6 = jhc1.L(this.h);
        j541.K(parcel, 9, 4);
        parcel.writeInt(bL6);
        byte bL7 = jhc1.L(this.i);
        j541.K(parcel, 10, 4);
        parcel.writeInt(bL7);
        byte bL8 = jhc1.L(this.t);
        j541.K(parcel, 11, 4);
        parcel.writeInt(bL8);
        byte bL9 = jhc1.L(this.X);
        j541.K(parcel, 12, 4);
        parcel.writeInt(bL9);
        byte bL10 = jhc1.L(this.Y);
        j541.K(parcel, 14, 4);
        parcel.writeInt(bL10);
        byte bL11 = jhc1.L(this.Z);
        j541.K(parcel, 15, 4);
        parcel.writeInt(bL11);
        j541.x(parcel, 16, this.N0);
        j541.x(parcel, 17, this.O0);
        j541.E(parcel, 18, this.P0, i);
        byte bL12 = jhc1.L(this.Q0);
        j541.K(parcel, 19, 4);
        parcel.writeInt(bL12);
        j541.B(parcel, 20, this.R0);
        j541.F(parcel, 21, this.S0);
        j541.M(iL, parcel);
    }

    public GoogleMapOptions() {
        this.c = -1;
        this.N0 = null;
        this.O0 = null;
        this.P0 = null;
        this.R0 = null;
        this.S0 = null;
    }
}
