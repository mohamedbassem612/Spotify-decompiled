package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class aif implements Parcelable {
    public static final Parcelable.Creator<aif> CREATOR = new zbf((byte) 18);
    public final String a;
    public final String b;
    public final String c;

    public aif(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aif)) {
            return false;
        }
        aif aifVar = (aif) obj;
        return u890.j(this.a, aifVar.a) && u890.j(this.b, aifVar.b) && u890.j(this.c, aifVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
