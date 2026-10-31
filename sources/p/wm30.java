package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wm30 implements Parcelable {
    public static final Parcelable.Creator<wm30> CREATOR = new ix20((byte) 22);
    public final String a;
    public final String b;
    public final String c;

    public wm30(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wm30)) {
            return false;
        }
        wm30 wm30Var = (wm30) obj;
        return u890.j(this.a, wm30Var.a) && u890.j(this.b, wm30Var.b) && u890.j(this.c, wm30Var.c);
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
