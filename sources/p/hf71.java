package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hf71 implements Parcelable {
    public static final Parcelable.Creator<hf71> CREATOR = new ff71((byte) 1);
    public final String a;
    public final a580 b;

    public hf71(String str, a580 a580Var) {
        this.a = str;
        this.b = a580Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf71)) {
            return false;
        }
        hf71 hf71Var = (hf71) obj;
        return u890.j(this.a, hf71Var.a) && u890.j(this.b, hf71Var.b);
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
