package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gzn implements nzn {
    public static final Parcelable.Creator<gzn> CREATOR = new upn((byte) 18);
    public final bzn a;
    public final ozn b;

    public gzn(bzn bznVar, ozn oznVar) {
        this.a = bznVar;
        this.b = oznVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gzn)) {
            return false;
        }
        gzn gznVar = (gzn) obj;
        return u890.j(this.a, gznVar.a) && u890.j(this.b, gznVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        this.b.writeToParcel(parcel, i);
    }
}
