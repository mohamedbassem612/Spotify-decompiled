package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class w21 extends r31 implements u21 {
    public static final Parcelable.Creator<w21> CREATOR = new t21((byte) 2);
    public final String a;
    public final String b;

    public w21(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String b() {
        return this.b;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w21)) {
            return false;
        }
        w21 w21Var = (w21) obj;
        return u890.j(this.a, w21Var.a) && u890.j(this.b, w21Var.b);
    }

    public final String getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
