package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ujn0 extends vjn0 {
    public static final Parcelable.Creator<ujn0> CREATOR = new dan0((byte) 9);
    public final String b;

    public ujn0(String str) {
        super(str);
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
        return (obj instanceof ujn0) && u890.j(this.b, ((ujn0) obj).b);
    }

    @Override // p.vjn0
    public final String getName() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
    }
}
