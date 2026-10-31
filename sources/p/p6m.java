package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p6m implements Parcelable {
    public static final Parcelable.Creator<p6m> CREATOR = new ezl((byte) 9);
    public final String a;
    public final int b;

    public p6m(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6m)) {
            return false;
        }
        p6m p6mVar = (p6m) obj;
        return u890.j(this.a, p6mVar.a) && this.b == p6mVar.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        int i2 = this.b;
        if (i2 == 1) {
            str = "CIRCLE";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "SQUARE";
        }
        parcel.writeString(str);
    }
}
