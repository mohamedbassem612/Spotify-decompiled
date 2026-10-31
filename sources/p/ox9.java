package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ox9 implements Parcelable {
    public static final Parcelable.Creator<ox9> CREATOR = new so8((byte) 29);
    public final yx9 a;
    public final String b;

    public ox9(yx9 yx9Var, String str) {
        this.a = yx9Var;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ox9)) {
            return false;
        }
        ox9 ox9Var = (ox9) obj;
        return u890.j(this.a, ox9Var.a) && u890.j(this.b, ox9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
    }
}
