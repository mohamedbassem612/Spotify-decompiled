package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bcf implements gcf {
    public static final Parcelable.Creator<bcf> CREATOR = new zbf((byte) 2);
    public final String a;
    public final tom b;

    public bcf(String str, tom tomVar) {
        this.a = str;
        this.b = tomVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bcf)) {
            return false;
        }
        bcf bcfVar = (bcf) obj;
        return u890.j(this.a, bcfVar.a) && u890.j(this.b, bcfVar.b);
    }

    public final String getRequestId() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
    }
}
