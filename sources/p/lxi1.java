package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lxi1 implements nb10 {
    public static final Parcelable.Creator<lxi1> CREATOR = new xbi1((byte) 16);
    public final String a;
    public final String b;

    public lxi1(String str, String str2) {
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
        if (!(obj instanceof lxi1)) {
            return false;
        }
        lxi1 lxi1Var = (lxi1) obj;
        return u890.j(this.a, lxi1Var.a) && u890.j(this.b, lxi1Var.b);
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
