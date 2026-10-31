package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bpl implements kpl {
    public static final Parcelable.Creator<bpl> CREATOR = new pol((byte) 6);
    public final String a;
    public final String b;

    public bpl(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bpl)) {
            return false;
        }
        bpl bplVar = (bpl) obj;
        return u890.j(this.a, bplVar.a) && u890.j(this.b, bplVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
