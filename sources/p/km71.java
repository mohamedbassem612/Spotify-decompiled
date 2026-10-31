package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class km71 implements Parcelable {
    public static final Parcelable.Creator<km71> CREATOR = new ff71((byte) 23);
    public final List a;
    public final int b;

    public km71(List list, int i) {
        this.a = list;
        this.b = i;
    }

    public static km71 a(km71 km71Var, ArrayList arrayList, int i, int i2) {
        List list = arrayList;
        if ((i2 & 1) != 0) {
            list = km71Var.a;
        }
        if ((i2 & 2) != 0) {
            i = km71Var.b;
        }
        return new km71(list, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km71)) {
            return false;
        }
        km71 km71Var = (km71) obj;
        return u890.j(this.a, km71Var.a) && this.b == km71Var.b;
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
