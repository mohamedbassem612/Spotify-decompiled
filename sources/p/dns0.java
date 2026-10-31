package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dns0 implements Parcelable {
    public static final Parcelable.Creator<dns0> CREATOR = new bis0((byte) 10);
    public String a;
    public String b;
    public String c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dns0)) {
            return false;
        }
        dns0 dns0Var = (dns0) obj;
        return u890.j(this.a, dns0Var.a) && u890.j(this.b, dns0Var.b) && u890.j(this.c, dns0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
