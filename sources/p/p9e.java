package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p9e implements Parcelable {
    public static final Parcelable.Creator<p9e> CREATOR = new xud((byte) 20);
    public final String a;
    public final String b;
    public final int c;

    public p9e(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p9e)) {
            return false;
        }
        p9e p9eVar = (p9e) obj;
        return u890.j(this.a, p9eVar.a) && u890.j(this.b, p9eVar.b) && this.c == p9eVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
    }
}
