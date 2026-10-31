package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ufk1 implements wgk1 {
    public static final Parcelable.Creator<ufk1> CREATOR = new tfk1((byte) 0);
    public final String a;
    public final hn90 b;

    public ufk1(String str, hn90 hn90Var) {
        this.a = str;
        this.b = hn90Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ufk1)) {
            return false;
        }
        ufk1 ufk1Var = (ufk1) obj;
        return u890.j(this.a, ufk1Var.a) && u890.j(this.b, ufk1Var.b);
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
