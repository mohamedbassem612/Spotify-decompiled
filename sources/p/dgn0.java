package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dgn0 implements Parcelable {
    public static final Parcelable.Creator<dgn0> CREATOR = new dan0((byte) 2);
    public final String a;
    public final String b;

    public dgn0(String str, String str2) {
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
        if (!(obj instanceof dgn0)) {
            return false;
        }
        dgn0 dgn0Var = (dgn0) obj;
        return u890.j(this.a, dgn0Var.a) && u890.j(this.b, dgn0Var.b);
    }

    public final String getPageUri() {
        return this.b;
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
