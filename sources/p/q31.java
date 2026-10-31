package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class q31 extends r31 implements u21 {
    public static final Parcelable.Creator<q31> CREATOR = new t21((byte) 21);
    public final String a;
    public final String b;

    public q31(String str, String str2) {
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
        if (!(obj instanceof q31)) {
            return false;
        }
        q31 q31Var = (q31) obj;
        return u890.j(this.a, q31Var.a) && u890.j(this.b, q31Var.b);
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
