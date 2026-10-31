package p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kn61 implements Parcelable {
    public static final Parcelable.Creator<kn61> CREATOR = new ge51(29);
    public final String a;
    public final String b;
    public final Bundle c;
    public final boolean d;

    public kn61(String str, String str2, Bundle bundle, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = bundle;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn61)) {
            return false;
        }
        kn61 kn61Var = (kn61) obj;
        return u890.j(this.a, kn61Var.a) && u890.j(this.b, kn61Var.b) && u890.j(this.c, kn61Var.c) && this.d == kn61Var.d;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        Bundle bundle = this.c;
        return Boolean.hashCode(this.d) + ((iD + (bundle == null ? 0 : bundle.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeBundle(this.c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
