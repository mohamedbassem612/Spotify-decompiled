package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ofs0 implements pfs0 {
    public static final Parcelable.Creator<ofs0> CREATOR = new ybs0((byte) 21);
    public final String a;

    public ofs0(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ofs0) && u890.j(this.a, ((ofs0) obj).a);
    }

    @Override // p.pfs0
    public final String getEntityUri() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
