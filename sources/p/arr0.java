package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class arr0 implements Parcelable {
    public static final Parcelable.Creator<arr0> CREATOR = new elr0((byte) 20);
    public final String a;
    public final String b;
    public final int c;

    public arr0(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof arr0)) {
            return false;
        }
        arr0 arr0Var = (arr0) obj;
        return u890.j(this.a, arr0Var.a) && u890.j(this.b, arr0Var.b) && this.c == arr0Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return l1d.C(this.c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(ywx0.p(this.c));
    }
}
