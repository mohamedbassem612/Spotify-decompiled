package p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kkh1 implements Parcelable {
    public static final Parcelable.Creator<kkh1> CREATOR = new gwg1((byte) 9);
    public final String a;
    public final Bundle b;

    public kkh1(String str, Bundle bundle) {
        this.a = str;
        this.b = bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kkh1)) {
            return false;
        }
        kkh1 kkh1Var = (kkh1) obj;
        return u890.j(this.a, kkh1Var.a) && u890.j(this.b, kkh1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Bundle bundle = this.b;
        return iHashCode + (bundle == null ? 0 : bundle.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeBundle(this.b);
    }
}
