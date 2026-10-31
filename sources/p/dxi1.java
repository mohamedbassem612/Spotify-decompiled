package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dxi1 implements Parcelable {
    public static final Parcelable.Creator<dxi1> CREATOR = new xbi1((byte) 15);
    public final String a;
    public final String b;

    public dxi1(String str, String str2) {
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
        if (!(obj instanceof dxi1)) {
            return false;
        }
        dxi1 dxi1Var = (dxi1) obj;
        return u890.j(this.a, dxi1Var.a) && u890.j(this.b, dxi1Var.b);
    }

    public final String getUri() {
        return this.a;
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
