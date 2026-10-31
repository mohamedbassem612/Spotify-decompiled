package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v9m1 implements pam1 {
    public static final Parcelable.Creator<v9m1> CREATOR = new w8m1((byte) 7);
    public final String a;
    public final x1c1 b;

    public v9m1(String str, x1c1 x1c1Var) {
        this.a = str;
        this.b = x1c1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9m1)) {
            return false;
        }
        v9m1 v9m1Var = (v9m1) obj;
        return u890.j(this.a, v9m1Var.a) && u890.j(this.b, v9m1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        x1c1 x1c1Var = this.b;
        return iHashCode + (x1c1Var == null ? 0 : x1c1Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
    }
}
