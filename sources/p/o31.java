package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class o31 extends r31 implements u21 {
    public static final Parcelable.Creator<o31> CREATOR = new t21((byte) 19);
    public final String a;
    public final String b;

    public o31(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String b() {
        return this.b;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o31)) {
            return false;
        }
        o31 o31Var = (o31) obj;
        return u890.j(this.a, o31Var.a) && u890.j(this.b, o31Var.b);
    }

    public final String getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
