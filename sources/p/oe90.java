package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class oe90 implements Parcelable {
    public static final Parcelable.Creator<oe90> CREATOR = new xl80((byte) 22);
    public final String a;
    public final w4i1 b;

    public oe90(String str, w4i1 w4i1Var) {
        this.a = str;
        this.b = w4i1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oe90)) {
            return false;
        }
        oe90 oe90Var = (oe90) obj;
        return u890.j(this.a, oe90Var.a) && u890.j(this.b, oe90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        this.b.writeToParcel(parcel, i);
    }
}
