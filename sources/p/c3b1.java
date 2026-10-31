package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class c3b1 implements f3b1 {
    public static final Parcelable.Creator<c3b1> CREATOR = new nja1((byte) 12);
    public final zxf a;
    public final String b;

    public c3b1(zxf zxfVar, String str) {
        this.a = zxfVar;
        this.b = str;
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
        if (!(obj instanceof c3b1)) {
            return false;
        }
        c3b1 c3b1Var = (c3b1) obj;
        return u890.j(this.a, c3b1Var.a) && u890.j(this.b, c3b1Var.b);
    }

    public final zxf getSource() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
    }
}
