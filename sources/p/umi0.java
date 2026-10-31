package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class umi0 implements Parcelable, jik1 {
    public static final Parcelable.Creator<umi0> CREATOR = new cyh0((byte) 27);
    public final String a;

    public umi0(String str) {
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
        return (obj instanceof umi0) && u890.j(this.a, ((umi0) obj).a);
    }

    public final lik1 getViewUri() {
        return cfm0.i("spotify:account-management:member-details:update-name:", this.a, nik1.j0);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
