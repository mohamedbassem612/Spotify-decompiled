package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class epv0 implements Parcelable {
    public static final Parcelable.Creator<epv0> CREATOR = new g0v0((byte) 11);
    public final String a;
    public final String b;

    public epv0(String str, String str2) {
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
        if (!(obj instanceof epv0)) {
            return false;
        }
        epv0 epv0Var = (epv0) obj;
        return u890.j(this.a, epv0Var.a) && u890.j(this.b, epv0Var.b);
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
