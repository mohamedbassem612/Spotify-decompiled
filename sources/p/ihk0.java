package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ihk0 implements Parcelable {
    public static final Parcelable.Creator<ihk0> CREATOR = new w9k0((byte) 5);
    public final String a;
    public final String b;

    public ihk0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ihk0)) {
            return false;
        }
        ihk0 ihk0Var = (ihk0) obj;
        return u890.j(this.a, ihk0Var.a) && u890.j(this.b, ihk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
