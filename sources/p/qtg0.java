package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qtg0 extends u9 {
    public static final Parcelable.Creator<qtg0> CREATOR = new sao1((byte) 18);
    public float N0;
    public float X;
    public float Y;
    public float Z;
    public LatLng a;
    public String b;
    public String c;
    public zwa d;
    public float e;
    public float f;
    public boolean g;
    public boolean h;
    public boolean i;
    public float t;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.E(parcel, 2, this.a, i);
        j541.F(parcel, 3, this.b);
        j541.F(parcel, 4, this.c);
        zwa zwaVar = this.d;
        j541.y(parcel, 5, zwaVar == null ? null : ((vh70) zwaVar.b).asBinder());
        float f = this.e;
        j541.K(parcel, 6, 4);
        parcel.writeFloat(f);
        float f2 = this.f;
        j541.K(parcel, 7, 4);
        parcel.writeFloat(f2);
        boolean z = this.g;
        j541.K(parcel, 8, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.h;
        j541.K(parcel, 9, 4);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = this.i;
        j541.K(parcel, 10, 4);
        parcel.writeInt(z3 ? 1 : 0);
        float f3 = this.t;
        j541.K(parcel, 11, 4);
        parcel.writeFloat(f3);
        float f4 = this.X;
        j541.K(parcel, 12, 4);
        parcel.writeFloat(f4);
        float f5 = this.Y;
        j541.K(parcel, 13, 4);
        parcel.writeFloat(f5);
        float f6 = this.Z;
        j541.K(parcel, 14, 4);
        parcel.writeFloat(f6);
        float f7 = this.N0;
        j541.K(parcel, 15, 4);
        parcel.writeFloat(f7);
        j541.M(iL, parcel);
    }
}
