package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class agk1 implements cgk1 {
    public static final Parcelable.Creator<agk1> CREATOR = new tfk1((byte) 7);
    public final String a;
    public final String b;

    public agk1(String str, String str2) {
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
        if (!(obj instanceof agk1)) {
            return false;
        }
        agk1 agk1Var = (agk1) obj;
        return u890.j(this.a, agk1Var.a) && u890.j(this.b, agk1Var.b);
    }

    @Override // p.cgk1
    public final String getLabel() {
        return this.a;
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
