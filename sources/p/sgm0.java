package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.address.endpoint.model.v1.proto.AddressCollection;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sgm0 implements jhm0 {
    public static final Parcelable.Creator<sgm0> CREATOR = new fgm0((byte) 3);
    public final AddressCollection a;
    public final pgm0 b;
    public final boolean c;

    public sgm0(AddressCollection addressCollection, pgm0 pgm0Var, boolean z) {
        this.a = addressCollection;
        this.b = pgm0Var;
        this.c = z;
    }

    public static sgm0 a(sgm0 sgm0Var, pgm0 pgm0Var, boolean z, int i) {
        AddressCollection addressCollection = sgm0Var.a;
        if ((i & 4) != 0) {
            z = sgm0Var.c;
        }
        sgm0Var.getClass();
        return new sgm0(addressCollection, pgm0Var, z);
    }

    public final boolean b() {
        return this.a.q().n() && !this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sgm0)) {
            return false;
        }
        sgm0 sgm0Var = (sgm0) obj;
        return u890.j(this.a, sgm0Var.a) && u890.j(this.b, sgm0Var.b) && this.c == sgm0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.a.toByteArray());
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
