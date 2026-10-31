package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class a6x extends t3k1 implements Parcelable {
    public static final Parcelable.Creator<a6x> CREATOR = new x7w((byte) 13);
    public final String b;
    public final String c;
    public final oxc d;

    public a6x(String str, String str2, oxc oxcVar) {
        this.b = str;
        this.c = str2;
        this.d = oxcVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6x)) {
            return false;
        }
        a6x a6xVar = (a6x) obj;
        return u890.j(this.b, a6xVar.b) && u890.j(this.c, a6xVar.c) && u890.j(this.d, a6xVar.d);
    }

    public final int hashCode() {
        int iD = cy30.d(this.b.hashCode() * 31, 31, this.c);
        oxc oxcVar = this.d;
        return iD + (oxcVar == null ? 0 : oxcVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        oxc oxcVar = this.d;
        if (oxcVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            oxcVar.writeToParcel(parcel, i);
        }
    }
}
