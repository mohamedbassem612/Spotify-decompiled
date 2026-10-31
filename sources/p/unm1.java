package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class unm1 implements wnm1 {
    public static final Parcelable.Creator<unm1> CREATOR = new lfm1((byte) 27);
    public final String a;
    public final String b;
    public final Integer c;

    public unm1(String str, String str2, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof unm1)) {
            return false;
        }
        unm1 unm1Var = (unm1) obj;
        return u890.j(this.a, unm1Var.a) && u890.j(this.b, unm1Var.b) && u890.j(this.c, unm1Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        return iD + (num == null ? 0 : num.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        Integer num = this.c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
    }
}
