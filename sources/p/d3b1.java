package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class d3b1 implements f3b1 {
    public static final Parcelable.Creator<d3b1> CREATOR = new nja1((byte) 13);
    public final zxf a;
    public final String b;
    public final String c;

    public d3b1(zxf zxfVar, String str, String str2) {
        this.a = zxfVar;
        this.b = str;
        this.c = str2;
    }

    public final String Z() {
        return this.b;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3b1)) {
            return false;
        }
        d3b1 d3b1Var = (d3b1) obj;
        return u890.j(this.a, d3b1Var.a) && u890.j(this.b, d3b1Var.b) && u890.j(this.c, d3b1Var.c);
    }

    public final zxf getSource() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
