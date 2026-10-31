package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gmi0 implements Parcelable, jik1 {
    public static final Parcelable.Creator<gmi0> CREATOR = new cyh0((byte) 25);
    public final String a;

    public gmi0(String str) {
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
        return (obj instanceof gmi0) && u890.j(this.a, ((gmi0) obj).a);
    }

    public final lik1 getViewUri() {
        return cfm0.i("spotify:account-management:member-details:update-birthday:", this.a, nik1.i0);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
