package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nqo implements Parcelable {
    public static final Parcelable.Creator<nqo> CREATOR = new rco((byte) 11);
    public final String a;
    public final nfm0 b;

    public nqo(String str, nfm0 nfm0Var) {
        this.a = str;
        this.b = nfm0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nqo)) {
            return false;
        }
        nqo nqoVar = (nqo) obj;
        return u890.j(this.a, nqoVar.a) && u890.j(this.b, nqoVar.b);
    }

    public final String getPageUri() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
    }
}
