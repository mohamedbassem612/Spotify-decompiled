package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class b9m1 implements d9m1 {
    public static final Parcelable.Creator<b9m1> CREATOR = new w8m1(4);
    public final z0c1 a;
    public final String b;

    public b9m1(z0c1 z0c1Var, String str) {
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
        if (!(obj instanceof b9m1)) {
            return false;
        }
        b9m1 b9m1Var = (b9m1) obj;
        return u890.j(this.a, b9m1Var.a) && u890.j(this.b, b9m1Var.b);
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
