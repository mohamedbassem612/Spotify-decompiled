package p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hvo implements Parcelable {
    public static final Parcelable.Creator<hvo> CREATOR = new rco((byte) 18);
    public final String a;
    public final Bundle b;
    public final String c;

    public hvo(String str, String str2, Bundle bundle) {
        this.a = str;
        this.b = bundle;
        this.c = str2;
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
        if (!(obj instanceof hvo)) {
            return false;
        }
        hvo hvoVar = (hvo) obj;
        return u890.j(this.a, hvoVar.a) && u890.j(this.b, hvoVar.b) && u890.j(this.c, hvoVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Bundle bundle = this.b;
        return this.c.hashCode() + ((iHashCode + (bundle == null ? 0 : bundle.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeBundle(this.b);
        parcel.writeString(this.c);
    }
}
