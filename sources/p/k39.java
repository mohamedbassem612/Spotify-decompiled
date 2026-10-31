package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class k39 extends ei90 {
    public static final Parcelable.Creator<k39> CREATOR = new so8((byte) 5);
    public final String a;
    public final kw91 b;

    public k39(String str, kw91 kw91Var) {
        this.a = str;
        this.b = kw91Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k39)) {
            return false;
        }
        k39 k39Var = (k39) obj;
        return u890.j(this.a, k39Var.a) && u890.j(this.b, k39Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        this.b.writeToParcel(parcel, i);
    }
}
