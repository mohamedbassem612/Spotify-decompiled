package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xse implements Parcelable {
    public static final Parcelable.Creator<xse> CREATOR = new zge((byte) 15);
    public final int a;
    public final String b;
    public final hux c;
    public final String d;
    public final boolean e;

    public xse(int i, String str, hux huxVar, String str2, boolean z) {
        this.a = i;
        this.b = str;
        this.c = huxVar;
        this.d = str2;
        this.e = z;
    }

    public final int a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xse)) {
            return false;
        }
        xse xseVar = (xse) obj;
        return this.a == xseVar.a && u890.j(this.b, xseVar.b) && u890.j(this.c, xseVar.c) && u890.j(this.d, xseVar.d) && this.e == xseVar.e;
    }

    public final String getUri() {
        return this.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + cy30.d(eqq.k(cy30.d(l1d.C(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(ktd.t(this.a));
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
    }
}
