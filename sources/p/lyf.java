package p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lyf implements Parcelable {
    public static final Parcelable.Creator<lyf> CREATOR = new wxf((byte) 3);
    public final zxf a;
    public final kyf b;
    public final Uri c;

    public lyf(zxf zxfVar, kyf kyfVar, Uri uri) {
        this.a = zxfVar;
        this.b = kyfVar;
        this.c = uri;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lyf)) {
            return false;
        }
        lyf lyfVar = (lyf) obj;
        return u890.j(this.a, lyfVar.a) && u890.j(this.b, lyfVar.b) && u890.j(this.c, lyfVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
    }
}
