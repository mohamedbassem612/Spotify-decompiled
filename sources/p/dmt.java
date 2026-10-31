package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dmt implements Parcelable {
    public static final Parcelable.Creator<dmt> CREATOR = new qms((byte) 21);
    public final boolean a;
    public final boolean b;

    public /* synthetic */ dmt(int i) {
        this(false, (i & 2) == 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmt)) {
            return false;
        }
        dmt dmtVar = (dmt) obj;
        return this.a == dmtVar.a && this.b == dmtVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
    }

    public dmt(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
