package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class j7c implements Parcelable {
    public static final Parcelable.Creator<j7c> CREATOR = new yyb((byte) 4);
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public j7c(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7c)) {
            return false;
        }
        j7c j7cVar = (j7c) obj;
        return u890.j(this.a, j7cVar.a) && u890.j(this.b, j7cVar.b) && u890.j(this.c, j7cVar.c) && u890.j(this.d, j7cVar.d);
    }

    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
