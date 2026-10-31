package p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sa2 implements Parcelable {
    public static final Parcelable.Creator<sa2> CREATOR = new ev1((byte) 18);
    public final String a;
    public final Bundle b;

    public sa2(String str, Bundle bundle) {
        this.a = str;
        this.b = bundle;
    }

    public final Bundle a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sa2)) {
            return false;
        }
        sa2 sa2Var = (sa2) obj;
        return u890.j(this.a, sa2Var.a) && u890.j(this.b, sa2Var.b);
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
