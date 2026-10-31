package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ca91 implements Parcelable {
    public static final Parcelable.Creator<ca91> CREATOR = new yx81((byte) 7);
    public final String a;
    public final d991 b;

    public ca91(String str, d991 d991Var) {
        this.a = str;
        this.b = d991Var;
    }

    public final d991 a() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ca91)) {
            return false;
        }
        ca91 ca91Var = (ca91) obj;
        return u890.j(this.a, ca91Var.a) && this.b == ca91Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b.name());
    }
}
