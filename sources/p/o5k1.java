package p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class o5k1 implements q5k1 {
    public static final Parcelable.Creator<o5k1> CREATOR = new nhj1((byte) 10);
    public final Uri a;
    public final String b;
    public final wkt c;

    public o5k1(Uri uri, String str, wkt wktVar) {
        this.a = uri;
        this.b = str;
        this.c = wktVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5k1)) {
            return false;
        }
        o5k1 o5k1Var = (o5k1) obj;
        return u890.j(this.a, o5k1Var.a) && u890.j(this.b, o5k1Var.b) && u890.j(this.c, o5k1Var.c);
    }

    public final int hashCode() {
        Uri uri = this.a;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        wkt wktVar = this.c;
        return iHashCode2 + (wktVar != null ? wktVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
    }
}
