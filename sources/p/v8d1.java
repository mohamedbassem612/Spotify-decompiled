package p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class v8d1 extends x8d1 {
    public static final Parcelable.Creator<v8d1> CREATOR = new pxc1((byte) 24);
    public final Uri a;
    public final String b;

    public v8d1(Uri uri, String str) {
        this.a = uri;
        this.b = str;
    }

    @Override // p.x8d1
    public final String b() {
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
        if (!(obj instanceof v8d1)) {
            return false;
        }
        v8d1 v8d1Var = (v8d1) obj;
        return u890.j(this.a, v8d1Var.a) && u890.j(this.b, v8d1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
    }
}
