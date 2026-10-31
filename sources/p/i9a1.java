package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i9a1 implements Parcelable {
    public static final Parcelable.Creator<i9a1> CREATOR = new yx81((byte) 15);
    public final String a;
    public final String b;
    public final Long c;

    public i9a1(Long l, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = l;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9a1)) {
            return false;
        }
        i9a1 i9a1Var = (i9a1) obj;
        return u890.j(this.a, i9a1Var.a) && u890.j(this.b, i9a1Var.b) && u890.j(this.c, i9a1Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        Long l = this.c;
        return iD + (l == null ? 0 : l.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        Long l = this.c;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            eqq.u(parcel, 1, l);
        }
    }
}
