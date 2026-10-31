package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qi50 implements Parcelable {
    public static final Parcelable.Creator<qi50> CREATOR = new n750((byte) 24);
    public final bi90 a;
    public final String b;
    public final String c;

    public qi50(bi90 bi90Var, String str, String str2) {
        this.a = bi90Var;
        this.b = str;
        this.c = str2;
    }

    public final bi90 a() {
        return this.a;
    }

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
        if (!(obj instanceof qi50)) {
            return false;
        }
        qi50 qi50Var = (qi50) obj;
        return u890.j(this.a, qi50Var.a) && u890.j(this.b, qi50Var.b) && u890.j(this.c, qi50Var.c);
    }

    public final int hashCode() {
        bi90 bi90Var = this.a;
        int iHashCode = (bi90Var == null ? 0 : bi90Var.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
