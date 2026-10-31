package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class iib0 implements Parcelable {
    public static final Parcelable.Creator<iib0> CREATOR = new jca0((byte) 27);
    public final String a;
    public final hib0 b;
    public final String c;

    public iib0(String str, hib0 hib0Var, String str2) {
        this.a = str;
        this.b = hib0Var;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iib0)) {
            return false;
        }
        iib0 iib0Var = (iib0) obj;
        return u890.j(this.a, iib0Var.a) && u890.j(this.b, iib0Var.b) && u890.j(this.c, iib0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        this.b.writeToParcel(parcel, i);
        parcel.writeString(this.c);
    }
}
