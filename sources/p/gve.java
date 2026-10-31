package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gve implements Parcelable {
    public static final Parcelable.Creator<gve> CREATOR = new zge((byte) 20);
    public final String a;
    public final String b;
    public final String c;

    public gve(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gve)) {
            return false;
        }
        gve gveVar = (gve) obj;
        return u890.j(this.a, gveVar.a) && u890.j(this.b, gveVar.b) && u890.j(this.c, gveVar.c);
    }

    public final String g() {
        return this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
