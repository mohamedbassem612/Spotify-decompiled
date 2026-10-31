package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class llg implements Parcelable {
    public static final Parcelable.Creator<llg> CREATOR = new i8g((byte) 19);
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;

    public llg(long j, long j2, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof llg)) {
            return false;
        }
        llg llgVar = (llg) obj;
        return u890.j(this.a, llgVar.a) && u890.j(this.b, llgVar.b) && u890.j(this.c, llgVar.c) && tve1.b(this.d, llgVar.d) && tve1.b(this.e, llgVar.e);
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + cy30.f(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), this.d, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeParcelable(new tve1(this.d), i);
        parcel.writeParcelable(new tve1(this.e), i);
    }
}
