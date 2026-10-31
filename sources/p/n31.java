package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class n31 extends r31 implements u21 {
    public static final Parcelable.Creator<n31> CREATOR = new t21((byte) 18);
    public final String a;
    public final String b;

    public n31(String str, String str2) {
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
        if (!(obj instanceof n31)) {
            return false;
        }
        n31 n31Var = (n31) obj;
        return u890.j(this.a, n31Var.a) && u890.j(this.b, n31Var.b);
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
