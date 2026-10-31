package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class eac implements Parcelable {
    public static final Parcelable.Creator<eac> CREATOR = new yyb((byte) 7);
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;

    public eac(int i, String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eac)) {
            return false;
        }
        eac eacVar = (eac) obj;
        return u890.j(this.a, eacVar.a) && u890.j(this.b, eacVar.b) && this.c == eacVar.c && u890.j(this.d, eacVar.d) && u890.j(this.e, eacVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(ab80.k(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        int i2 = this.c;
        if (i2 == 1) {
            str = "Small";
        } else if (i2 == 2) {
            str = "Medium";
        } else if (i2 == 3) {
            str = "Large";
        } else {
            if (i2 != 4) {
                throw null;
            }
            str = "XLarge";
        }
        parcel.writeString(str);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
