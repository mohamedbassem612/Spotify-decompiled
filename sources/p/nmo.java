package p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nmo implements Parcelable {
    public static final Parcelable.Creator<nmo> CREATOR = new rco((byte) 8);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Uri e;
    public final String f;

    public nmo(Uri uri, String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = uri;
        this.f = str5;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nmo)) {
            return false;
        }
        nmo nmoVar = (nmo) obj;
        return u890.j(this.a, nmoVar.a) && u890.j(this.b, nmoVar.b) && u890.j(this.c, nmoVar.c) && u890.j(this.d, nmoVar.d) && u890.j(this.e, nmoVar.e) && u890.j(this.f, nmoVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + hrt.h(this.e, cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeParcelable(this.e, i);
        parcel.writeString(this.f);
    }
}
