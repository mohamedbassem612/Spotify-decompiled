package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ghy extends mhy {
    public static final Parcelable.Creator<ghy> CREATOR = new utx((byte) 27);
    public final int a;
    public final String b;
    public final boolean c;
    public final as3 d;

    public ghy(int i, String str, boolean z, as3 as3Var) {
        this.a = i;
        this.b = str;
        this.c = z;
        this.d = as3Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ghy)) {
            return false;
        }
        ghy ghyVar = (ghy) obj;
        return this.a == ghyVar.a && u890.j(this.b, ghyVar.b) && this.c == ghyVar.c && this.d == ghyVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g(cy30.d(l1d.C(this.a) * 31, 31, this.b), 31, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(rjx.D(this.a));
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeString(this.d.name());
    }
}
