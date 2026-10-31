package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bt31 implements Parcelable {
    public static final Parcelable.Creator<bt31> CREATOR = new agm0((byte) 14);
    public final String a;
    public final String b;
    public final double c;

    public bt31(String str, String str2, double d) {
        this.a = str;
        this.b = str2;
        this.c = d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bt31)) {
            return false;
        }
        bt31 bt31Var = (bt31) obj;
        return u890.j(this.a, bt31Var.a) && u890.j(this.b, bt31Var.b) && Double.compare(this.c, bt31Var.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeDouble(this.c);
    }

    public /* synthetic */ bt31(String str, String str2) {
        this(str, str2, 0.0d);
    }
}
