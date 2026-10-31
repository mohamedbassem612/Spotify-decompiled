package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mph1 implements Parcelable, jik1 {
    public static final Parcelable.Creator<mph1> CREATOR = new gwg1((byte) 11);
    public final String a;

    public mph1(String str) {
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
        return (obj instanceof mph1) && u890.j(this.a, ((mph1) obj).a);
    }

    public final lik1 getViewUri() {
        return cfm0.i("spotify:internal:parental-control:update-birthday:", this.a, nik1.t0);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
