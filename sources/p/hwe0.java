package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hwe0 implements Parcelable {
    public static final Parcelable.Creator<hwe0> CREATOR = new lbe0((byte) 21);
    public final String a;
    public final of8 b;

    public hwe0(String str, of8 of8Var) {
        this.a = str;
        this.b = of8Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hwe0)) {
            return false;
        }
        hwe0 hwe0Var = (hwe0) obj;
        return u890.j(this.a, hwe0Var.a) && u890.j(this.b, hwe0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
    }
}
