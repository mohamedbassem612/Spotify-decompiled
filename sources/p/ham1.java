package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ham1 implements pam1 {
    public static final Parcelable.Creator<ham1> CREATOR = new w8m1((byte) 17);
    public final z0c1 a;
    public final String b;

    public ham1(z0c1 z0c1Var, String str) {
        this.a = z0c1Var;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ham1)) {
            return false;
        }
        ham1 ham1Var = (ham1) obj;
        return u890.j(this.a, ham1Var.a) && u890.j(this.b, ham1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
    }
}
