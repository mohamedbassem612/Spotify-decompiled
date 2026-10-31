package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fcf implements gcf {
    public static final Parcelable.Creator<fcf> CREATOR = new zbf((byte) 6);
    public final String a;
    public final tom b;

    public fcf(String str, tom tomVar) {
        this.a = str;
        this.b = tomVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fcf)) {
            return false;
        }
        fcf fcfVar = (fcf) obj;
        return u890.j(this.a, fcfVar.a) && u890.j(this.b, fcfVar.b);
    }

    @Override // p.gcf
    public final String getRequestId() {
        return this.a;
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
