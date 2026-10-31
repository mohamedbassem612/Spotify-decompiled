package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class q39 implements Parcelable {
    public static final Parcelable.Creator<q39> CREATOR = new so8((byte) 6);
    public final String a;
    public final b49 b;

    public q39(String str, b49 b49Var) {
        this.a = str;
        this.b = b49Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q39)) {
            return false;
        }
        q39 q39Var = (q39) obj;
        return u890.j(this.a, q39Var.a) && u890.j(this.b, q39Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
    }
}
