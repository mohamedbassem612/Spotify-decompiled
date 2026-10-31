package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hh5 implements Parcelable {
    public static final Parcelable.Creator<hh5> CREATOR = new i93((byte) 27);
    public final List a;
    public final int b;

    public hh5(List list, int i) {
        this.a = list;
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
        if (!(obj instanceof hh5)) {
            return false;
        }
        hh5 hh5Var = (hh5) obj;
        return this.a.equals(hh5Var.a) && this.b == hh5Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.a);
        parcel.writeInt(this.b);
    }
}
