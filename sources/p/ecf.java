package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ecf implements gcf {
    public static final Parcelable.Creator<ecf> CREATOR = new zbf((byte) 5);
    public final String a;
    public final tom b;

    public ecf(String str, tom tomVar) {
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
        if (!(obj instanceof ecf)) {
            return false;
        }
        ecf ecfVar = (ecf) obj;
        return u890.j(this.a, ecfVar.a) && u890.j(this.b, ecfVar.b);
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
