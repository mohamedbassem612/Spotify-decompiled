package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bua1 implements dua1 {
    public static final Parcelable.Creator<bua1> CREATOR = new nja1((byte) 7);
    public final String a;
    public final String b;

    public bua1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bua1)) {
            return false;
        }
        bua1 bua1Var = (bua1) obj;
        return u890.j(this.a, bua1Var.a) && u890.j(this.b, bua1Var.b);
    }

    public final String getPageUri() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
