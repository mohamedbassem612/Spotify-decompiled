package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w2f0 extends l3f0 {
    public static final Parcelable.Creator<w2f0> CREATOR = new rwe0((byte) 15);
    public final String a;
    public final String b;

    public w2f0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String b() {
        return this.a;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w2f0)) {
            return false;
        }
        w2f0 w2f0Var = (w2f0) obj;
        return u890.j(this.a, w2f0Var.a) && u890.j(this.b, w2f0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
