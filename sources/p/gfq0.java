package p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gfq0 implements Parcelable {
    public static final Parcelable.Creator<gfq0> CREATOR = new p7q0((byte) 6);
    public final String a;
    public final Bundle b;
    public final String c;

    public gfq0(String str, String str2, Bundle bundle) {
        this.a = str;
        this.b = bundle;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gfq0)) {
            return false;
        }
        gfq0 gfq0Var = (gfq0) obj;
        return u890.j(this.a, gfq0Var.a) && u890.j(this.b, gfq0Var.b) && u890.j(this.c, gfq0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Bundle bundle = this.b;
        int iHashCode2 = (iHashCode + (bundle == null ? 0 : bundle.hashCode())) * 31;
        String str = this.c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeBundle(this.b);
        parcel.writeString(this.c);
    }
}
