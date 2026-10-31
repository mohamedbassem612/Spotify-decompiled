package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class z740 implements Parcelable {
    public static final Parcelable.Creator<z740> CREATOR = new hbn1((byte) 23);
    public final String a;
    public final String b;
    public final int c;

    public z740(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z740)) {
            return false;
        }
        z740 z740Var = (z740) obj;
        return u890.j(this.a, z740Var.a) && u890.j(this.b, z740Var.b) && this.c == z740Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        int i2 = this.c;
        if (i2 == 1) {
            str = "CAPPED";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "ENTITLEMENT_MISSING";
        }
        parcel.writeString(str);
    }

    public /* synthetic */ z740(String str, String str2, int i, int i2) {
        this(i, str, str2);
    }
}
