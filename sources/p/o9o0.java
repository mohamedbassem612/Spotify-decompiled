package p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class o9o0 implements Parcelable {
    public static final Parcelable.Creator<o9o0> CREATOR = new b4o0((byte) 6);
    public final String a;
    public final Bundle b;

    public o9o0(String str, Bundle bundle) {
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
        if (!(obj instanceof o9o0)) {
            return false;
        }
        o9o0 o9o0Var = (o9o0) obj;
        return u890.j(this.a, o9o0Var.a) && u890.j(this.b, o9o0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeBundle(this.b);
    }
}
