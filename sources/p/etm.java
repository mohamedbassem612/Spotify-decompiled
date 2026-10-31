package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class etm implements Parcelable {
    public static final Parcelable.Creator<etm> CREATOR = new ezl(27);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public etm(String str, String str2, String str3, String str4, String str5) {
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
        if (!(obj instanceof etm)) {
            return false;
        }
        etm etmVar = (etm) obj;
        return u890.j(this.a, etmVar.a) && u890.j(this.b, etmVar.b) && u890.j(this.c, etmVar.c) && u890.j(this.d, etmVar.d) && u890.j(this.e, etmVar.e);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return iD + (str == null ? 0 : str.hashCode());
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
