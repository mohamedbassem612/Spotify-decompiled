package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hm implements Parcelable {
    public static final Parcelable.Creator<hm> CREATOR = new hbn1((byte) 1);
    public final String a;
    public final int b;
    public final String c;
    public final xl d;
    public final gm e;

    public hm(String str, int i, String str2, xl xlVar, gm gmVar) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = xlVar;
        this.e = gmVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hm)) {
            return false;
        }
        hm hmVar = (hm) obj;
        return u890.j(this.a, hmVar.a) && this.b == hmVar.b && u890.j(this.c, hmVar.c) && u890.j(this.d, hmVar.d) && u890.j(this.e, hmVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + cy30.d(ab80.k(this.b, this.a.hashCode() * 31, 31), 31, this.c)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        switch (this.b) {
            case 1:
                str = "Unknown";
                break;
            case 2:
                str = "Male";
                break;
            case 3:
                str = "Female";
                break;
            case 4:
                str = "NonBinary";
                break;
            case 5:
                str = "Other";
                break;
            case 6:
                str = "PreferNotToSay";
                break;
            default:
                throw null;
        }
        parcel.writeString(str);
        parcel.writeString(this.c);
        this.d.writeToParcel(parcel, i);
        parcel.writeParcelable(this.e, i);
    }
}
