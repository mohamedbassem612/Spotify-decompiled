package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ymp0 implements Parcelable {
    public static final Parcelable.Creator<ymp0> CREATOR = new ump0((byte) 0);
    public static final ymp0 b = new ymp0(new vmp0(null));
    public final xmp0 a;

    public ymp0(xmp0 xmp0Var) {
        this.a = xmp0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ymp0) && u890.j(this.a, ((ymp0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
