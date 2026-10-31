package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class bnb1 implements pnb1 {
    public static final Parcelable.Creator<bnb1> CREATOR = new olb1((byte) 13);
    public final String a;
    public final wmp0 b;

    public bnb1(String str, wmp0 wmp0Var) {
        this.a = str;
        this.b = wmp0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bnb1)) {
            return false;
        }
        bnb1 bnb1Var = (bnb1) obj;
        return u890.j(this.a, bnb1Var.a) && u890.j(this.b, bnb1Var.b);
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
