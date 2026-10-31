package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class l6k implements Parcelable {
    public static final Parcelable.Creator<l6k> CREATOR = new v6h((byte) 15);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final iek e;
    public final String f;

    public l6k(String str, String str2, String str3, String str4, String str5, iek iekVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = iekVar;
        this.f = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6k)) {
            return false;
        }
        l6k l6kVar = (l6k) obj;
        return u890.j(this.a, l6kVar.a) && u890.j(this.b, l6kVar.b) && u890.j(this.c, l6kVar.c) && u890.j(this.d, l6kVar.d) && u890.j(this.e, l6kVar.e) && u890.j(this.f, l6kVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
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
