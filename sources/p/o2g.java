package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class o2g extends xl81 implements hv51 {
    public static final Parcelable.Creator<o2g> CREATOR = new wxf((byte) 11);
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;

    public o2g(String str, String str2, boolean z, String str3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2g)) {
            return false;
        }
        o2g o2gVar = (o2g) obj;
        return u890.j(this.a, o2gVar.a) && u890.j(this.b, o2gVar.b) && this.c == o2gVar.c && u890.j(this.d, o2gVar.d);
    }

    public final boolean f() {
        return this.c;
    }

    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeString(this.d);
    }
}
