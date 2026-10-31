package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class skk1 implements Parcelable {
    public static final Parcelable.Creator<skk1> CREATOR = new tfk1((byte) 27);
    public final h67 a;
    public final String b;

    public skk1(h67 h67Var, String str) {
        this.a = h67Var;
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
        if (!(obj instanceof skk1)) {
            return false;
        }
        skk1 skk1Var = (skk1) obj;
        return u890.j(this.a, skk1Var.a) && u890.j(this.b, skk1Var.b);
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
