package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y2y0 implements Parcelable {
    public static final Parcelable.Creator<y2y0> CREATOR = new zzx0((byte) 4);
    public final String a;
    public final String b;

    public y2y0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2y0)) {
            return false;
        }
        y2y0 y2y0Var = (y2y0) obj;
        return u890.j(this.a, y2y0Var.a) && u890.j(this.b, y2y0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
