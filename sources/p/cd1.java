package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cd1 implements Parcelable {
    public static final Parcelable.Creator<cd1> CREATOR = new d41((byte) 14);
    public final String a;
    public final wxn0 b;

    public cd1(String str, wxn0 wxn0Var) {
        this.a = str;
        this.b = wxn0Var;
    }

    public final String a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cd1)) {
            return false;
        }
        cd1 cd1Var = (cd1) obj;
        return u890.j(this.a, cd1Var.a) && this.b == cd1Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b.name());
    }
}
