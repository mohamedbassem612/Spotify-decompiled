package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class sqi0 implements Parcelable {
    public static final Parcelable.Creator<sqi0> CREATOR = new rqi0((byte) 0);
    public final String a;
    public final String b;

    public sqi0(String str, String str2) {
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
        if (!(obj instanceof sqi0)) {
            return false;
        }
        sqi0 sqi0Var = (sqi0) obj;
        return u890.j(this.a, sqi0Var.a) && u890.j(this.b, sqi0Var.b);
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
