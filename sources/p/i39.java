package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class i39 implements Parcelable {
    public static final Parcelable.Creator<i39> CREATOR = new so8((byte) 3);
    public final String a;
    public final j39 b;

    public i39(String str, j39 j39Var) {
        this.a = str;
        this.b = j39Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i39)) {
            return false;
        }
        i39 i39Var = (i39) obj;
        return u890.j(this.a, i39Var.a) && u890.j(this.b, i39Var.b);
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
