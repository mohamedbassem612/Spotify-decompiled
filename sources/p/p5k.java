package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class p5k implements Parcelable {
    public static final Parcelable.Creator<p5k> CREATOR = new hbn1((byte) 9);
    public final String a;
    public final String b;
    public final String c;

    public p5k(String str, String str2, String str3) {
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
        if (!(obj instanceof p5k)) {
            return false;
        }
        p5k p5kVar = (p5k) obj;
        return u890.j(this.a, p5kVar.a) && u890.j(this.b, p5kVar.b) && u890.j(this.c, p5kVar.c);
    }

    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    public /* synthetic */ p5k(String str, String str2) {
        this(str, str2, null);
    }
}
