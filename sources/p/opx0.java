package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class opx0 implements Parcelable {
    public static final Parcelable.Creator<opx0> CREATOR = new wvw0((byte) 26);
    public final String a;
    public final String b;
    public final int c;

    public opx0(int i, String str, String str2) {
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
        if (!(obj instanceof opx0)) {
            return false;
        }
        opx0 opx0Var = (opx0) obj;
        return u890.j(this.a, opx0Var.a) && u890.j(this.b, opx0Var.b) && this.c == opx0Var.c;
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
