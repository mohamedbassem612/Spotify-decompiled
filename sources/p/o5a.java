package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class o5a implements Parcelable {
    public static final Parcelable.Creator<o5a> CREATOR = new ux9(18);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public o5a(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5a)) {
            return false;
        }
        o5a o5aVar = (o5a) obj;
        return u890.j(this.a, o5aVar.a) && u890.j(this.b, o5aVar.b) && u890.j(this.c, o5aVar.c) && u890.j(this.d, o5aVar.d) && u890.j(this.e, o5aVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
