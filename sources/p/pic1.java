package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pic1 implements sic1 {
    public static final Parcelable.Creator<pic1> CREATOR = new y7c1((byte) 17);
    public final String a;
    public final jic1 b;

    public pic1(String str, jic1 jic1Var) {
        this.a = str;
        this.b = jic1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pic1)) {
            return false;
        }
        pic1 pic1Var = (pic1) obj;
        return u890.j(this.a, pic1Var.a) && u890.j(this.b, pic1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        this.b.writeToParcel(parcel, i);
    }
}
