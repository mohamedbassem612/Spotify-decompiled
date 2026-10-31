package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.wrapped.v1.proto.CardShareConfiguration;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class c9m1 implements d9m1 {
    public static final Parcelable.Creator<c9m1> CREATOR = new w8m1(5);
    public final String a;
    public final int b;
    public final CardShareConfiguration c;
    public final Integer d;
    public final boolean e;

    public c9m1(String str, int i, CardShareConfiguration cardShareConfiguration, Integer num, boolean z) {
        this.a = str;
        this.b = i;
        this.c = cardShareConfiguration;
        this.d = num;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9m1)) {
            return false;
        }
        c9m1 c9m1Var = (c9m1) obj;
        return u890.j(this.a, c9m1Var.a) && this.b == c9m1Var.b && u890.j(this.c, c9m1Var.c) && u890.j(this.d, c9m1Var.d) && this.e == c9m1Var.e;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ab80.k(this.b, this.a.hashCode() * 31, 31)) * 31;
        Integer num = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        int i2 = this.b;
        if (i2 == 1) {
            str = "SCREENSHOT";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "BUTTON";
        }
        parcel.writeString(str);
        i371.c.u(this.c, parcel);
        Integer num = this.d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
        parcel.writeInt(this.e ? 1 : 0);
    }
}
