package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pgm1 implements vgm1 {
    public static final Parcelable.Creator<pgm1> CREATOR = new lfm1((byte) 15);
    public final z0c1 a;
    public final String b;

    public pgm1(z0c1 z0c1Var, String str) {
        this.a = z0c1Var;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pgm1)) {
            return false;
        }
        pgm1 pgm1Var = (pgm1) obj;
        return u890.j(this.a, pgm1Var.a) && u890.j(this.b, pgm1Var.b);
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
