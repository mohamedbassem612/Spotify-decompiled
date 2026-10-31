package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class b9e implements Parcelable {
    public static final Parcelable.Creator<b9e> CREATOR = new xud((byte) 18);
    public final String a;
    public final String b;
    public final hux c;

    public b9e(String str, String str2, hux huxVar) {
        this.a = str;
        this.b = str2;
        this.c = huxVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b9e)) {
            return false;
        }
        b9e b9eVar = (b9e) obj;
        return u890.j(this.a, b9eVar.a) && u890.j(this.b, b9eVar.b) && u890.j(this.c, b9eVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
    }
}
