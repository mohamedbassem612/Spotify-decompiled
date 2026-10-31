package p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class u7q0 implements Parcelable {
    public static final Parcelable.Creator<u7q0> CREATOR = new p7q0((byte) 2);
    public final Uri a;
    public final String b;
    public final String c;
    public final Integer d;

    public u7q0(Uri uri, String str, String str2, Integer num) {
        this.a = uri;
        this.b = str;
        this.c = str2;
        this.d = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7q0)) {
            return false;
        }
        u7q0 u7q0Var = (u7q0) obj;
        return u890.j(this.a, u7q0Var.a) && u890.j(this.b, u7q0Var.b) && u890.j(this.c, u7q0Var.c) && u890.j(this.d, u7q0Var.d);
    }

    public final int hashCode() {
        Uri uri = this.a;
        int iD = cy30.d(cy30.d((uri == null ? 0 : uri.hashCode()) * 31, 31, this.b), 31, this.c);
        Integer num = this.d;
        return iD + (num != null ? num.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        Integer num = this.d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
    }
}
