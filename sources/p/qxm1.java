package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qxm1 implements Parcelable {
    public static final Parcelable.Creator<qxm1> CREATOR = new ynm1((byte) 13);
    public final String a;
    public final String b;

    public qxm1(String str, String str2) {
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
        if (!(obj instanceof qxm1)) {
            return false;
        }
        qxm1 qxm1Var = (qxm1) obj;
        return u890.j(this.a, qxm1Var.a) && u890.j(this.b, qxm1Var.b);
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
