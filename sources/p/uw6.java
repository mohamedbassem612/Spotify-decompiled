package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uw6 implements Parcelable {
    public static final Parcelable.Creator<uw6> CREATOR = new fp5((byte) 23);
    public final String a;
    public final rha1 b;

    public uw6(String str, rha1 rha1Var) {
        this.a = str;
        this.b = rha1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uw6)) {
            return false;
        }
        uw6 uw6Var = (uw6) obj;
        return u890.j(this.a, uw6Var.a) && this.b == uw6Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        rha1 rha1Var = this.b;
        return iHashCode + (rha1Var != null ? rha1Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        rha1 rha1Var = this.b;
        if (rha1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(rha1Var.name());
        }
    }
}
