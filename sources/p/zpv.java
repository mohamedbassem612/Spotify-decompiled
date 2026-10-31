package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zpv implements Parcelable {
    public static final Parcelable.Creator<zpv> CREATOR = new s5v((byte) 12);
    public final String a;
    public final String b;

    public zpv(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zpv)) {
            return false;
        }
        zpv zpvVar = (zpv) obj;
        return u890.j(this.a, zpvVar.a) && u890.j(this.b, zpvVar.b);
    }

    public final String getPageUri() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
