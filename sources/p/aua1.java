package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class aua1 implements dua1 {
    public static final Parcelable.Creator<aua1> CREATOR = new nja1((byte) 6);
    public final String a;
    public final fua1 b;

    public aua1(String str, fua1 fua1Var) {
        this.a = str;
        this.b = fua1Var;
    }

    public final fua1 a() {
        return this.b;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aua1)) {
            return false;
        }
        aua1 aua1Var = (aua1) obj;
        return u890.j(this.a, aua1Var.a) && this.b == aua1Var.b;
    }

    public final String getPageUri() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b.name());
    }
}
