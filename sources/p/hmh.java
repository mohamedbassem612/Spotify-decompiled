package p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hmh implements Parcelable {
    public static final Parcelable.Creator<hmh> CREATOR = new v6h((byte) 5);
    public final String a;
    public final String b;

    public hmh(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String M() {
        Set set = s4b1.f;
        String str = this.b;
        String strZ = uic.C(str, (String) null).z();
        return strZ == null ? l1d.m("spotify:user:", Uri.encode(str)) : strZ;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hmh)) {
            return false;
        }
        hmh hmhVar = (hmh) obj;
        return u890.j(this.a, hmhVar.a) && u890.j(this.b, hmhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
