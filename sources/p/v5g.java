package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v5g implements Parcelable {
    public static final Parcelable.Creator<v5g> CREATOR = new wxf((byte) 15);
    public final zxf a;
    public final String b;
    public final String c;

    public v5g(zxf zxfVar, String str, String str2) {
        this.a = zxfVar;
        this.b = str;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5g)) {
            return false;
        }
        v5g v5gVar = (v5g) obj;
        return u890.j(this.a, v5gVar.a) && u890.j(this.b, v5gVar.b) && u890.j(this.c, v5gVar.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
