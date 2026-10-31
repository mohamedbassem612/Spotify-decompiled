package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ozc0 implements Parcelable {
    public static final Parcelable.Creator<ozc0> CREATOR = new bzc0((byte) 2);
    public final String a;
    public final String b;
    public final trc0 c;

    public ozc0(String str, String str2, trc0 trc0Var) {
        this.a = str;
        this.b = str2;
        this.c = trc0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ozc0)) {
            return false;
        }
        ozc0 ozc0Var = (ozc0) obj;
        return u890.j(this.a, ozc0Var.a) && u890.j(this.b, ozc0Var.b) && u890.j(this.c, ozc0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
    }
}
