package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class o2g0 implements Parcelable {
    public static final Parcelable.Creator<o2g0> CREATOR = new isf0((byte) 12);
    public final hux a;
    public final String b;
    public final String c;

    public o2g0(String str, String str2, hux huxVar) {
        this.a = huxVar;
        this.b = str;
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
        if (!(obj instanceof o2g0)) {
            return false;
        }
        o2g0 o2g0Var = (o2g0) obj;
        return u890.j(this.a, o2g0Var.a) && u890.j(this.b, o2g0Var.b) && u890.j(this.c, o2g0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
