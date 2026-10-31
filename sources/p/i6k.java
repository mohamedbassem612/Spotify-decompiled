package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class i6k extends ei90 {
    public static final Parcelable.Creator<i6k> CREATOR = new v6h((byte) 14);
    public final String a;
    public final j7r b;
    public final String c;
    public final String d;

    public i6k(String str, j7r j7rVar, String str2, String str3) {
        this.a = str;
        this.b = j7rVar;
        this.c = str2;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i6k)) {
            return false;
        }
        i6k i6kVar = (i6k) obj;
        return u890.j(this.a, i6kVar.a) && u890.j(this.b, i6kVar.b) && u890.j(this.c, i6kVar.c) && u890.j(this.d, i6kVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        this.b.writeToParcel(parcel, i);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
