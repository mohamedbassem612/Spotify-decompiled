package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lye1 implements pf51, Parcelable {
    public static final Parcelable.Creator<lye1> CREATOR = new lse1((byte) 17);
    public final String a;
    public final String b;

    public lye1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lye1)) {
            return false;
        }
        lye1 lye1Var = (lye1) obj;
        return u890.j(this.a, lye1Var.a) && u890.j(this.b, lye1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
