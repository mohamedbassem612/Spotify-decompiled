package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class omi0 implements Parcelable {
    public static final Parcelable.Creator<omi0> CREATOR = new cyh0((byte) 26);
    public final String a;
    public final zgk1 b;

    public omi0(String str, zgk1 zgk1Var) {
        this.a = str;
        this.b = zgk1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof omi0)) {
            return false;
        }
        omi0 omi0Var = (omi0) obj;
        return u890.j(this.a, omi0Var.a) && u890.j(this.b, omi0Var.b);
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
