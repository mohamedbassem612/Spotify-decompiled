package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l1o implements Parcelable {
    public static final Parcelable.Creator<l1o> CREATOR = new upn((byte) 26);
    public final String a;
    public final int b;
    public final String c;
    public final String d;

    public l1o(String str, String str2, int i, String str3) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
    }

    public final int a() {
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
        if (!(obj instanceof l1o)) {
            return false;
        }
        l1o l1oVar = (l1o) obj;
        return u890.j(this.a, l1oVar.a) && this.b == l1oVar.b && u890.j(this.c, l1oVar.c) && u890.j(this.d, l1oVar.d);
    }

    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        int iD = cy30.d(ab80.k(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        String str = this.d;
        return iD + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        int i2 = this.b;
        if (i2 == 1) {
            str = "ARTIST";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "AUTHOR";
        }
        parcel.writeString(str);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
