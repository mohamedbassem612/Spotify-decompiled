package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class njk implements Parcelable {
    public static final Parcelable.Creator<njk> CREATOR = new v6h((byte) 22);
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public njk(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof njk)) {
            return false;
        }
        njk njkVar = (njk) obj;
        return u890.j(this.a, njkVar.a) && u890.j(this.b, njkVar.b) && u890.j(this.c, njkVar.c) && this.d == njkVar.d;
    }

    public final String getUri() {
        return this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
