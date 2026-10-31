package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lvb implements Parcelable {
    public static final Parcelable.Creator<lvb> CREATOR = new mra((byte) 16);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public lvb(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lvb)) {
            return false;
        }
        lvb lvbVar = (lvb) obj;
        return u890.j(this.a, lvbVar.a) && u890.j(this.b, lvbVar.b) && u890.j(this.c, lvbVar.c) && u890.j(this.d, lvbVar.d) && u890.j(this.e, lvbVar.e) && u890.j(this.f, lvbVar.f) && u890.j(this.g, lvbVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
    }
}
