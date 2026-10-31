package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pmf implements Parcelable {
    public static final Parcelable.Creator<pmf> CREATOR = new zbf((byte) 19);
    public final String a;
    public final String b;
    public final String c;

    public pmf(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pmf)) {
            return false;
        }
        pmf pmfVar = (pmf) obj;
        return u890.j(this.a, pmfVar.a) && u890.j(this.b, pmfVar.b) && u890.j(this.c, pmfVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
