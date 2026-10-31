package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fpl implements kpl {
    public static final Parcelable.Creator<fpl> CREATOR = new pol((byte) 9);
    public final String a;
    public final long b;
    public final long c;
    public final epl d;

    public fpl(String str, long j, long j2, epl eplVar) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = eplVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fpl)) {
            return false;
        }
        fpl fplVar = (fpl) obj;
        return u890.j(this.a, fplVar.a) && this.b == fplVar.b && this.c == fplVar.c && u890.j(this.d, fplVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.f(cy30.f(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeParcelable(this.d, i);
    }
}
