package p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dth0 implements Parcelable {
    public static final Parcelable.Creator<dth0> CREATOR = new hug0((byte) 29);
    public final Uri a;
    public final int b;

    public dth0(int i, Uri uri) {
        this.a = uri;
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
        if (!(obj instanceof dth0)) {
            return false;
        }
        dth0 dth0Var = (dth0) obj;
        return u890.j(this.a, dth0Var.a) && this.b == dth0Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeParcelable(this.a, i);
        int i2 = this.b;
        if (i2 == 1) {
            str = "IMAGE";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "VIDEO";
        }
        parcel.writeString(str);
    }
}
