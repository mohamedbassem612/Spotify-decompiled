package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dhy extends ehy {
    public static final Parcelable.Creator<dhy> CREATOR = new utx((byte) 25);
    public final String a;
    public final n6c0 b;

    public dhy(String str, n6c0 n6c0Var) {
        this.a = str;
        this.b = n6c0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhy)) {
            return false;
        }
        dhy dhyVar = (dhy) obj;
        return u890.j(this.a, dhyVar.a) && u890.j(this.b, dhyVar.b);
    }

    @Override // p.ehy
    public final String getId() {
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
