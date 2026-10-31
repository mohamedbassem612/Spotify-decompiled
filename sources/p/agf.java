package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class agf implements Parcelable {
    public static final Parcelable.Creator<agf> CREATOR = new zbf((byte) 12);
    public final String a;
    public final String b;
    public final boolean c;

    public agf(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final String a() {
        return l1d.m("spotify:room:", this.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agf)) {
            return false;
        }
        agf agfVar = (agf) obj;
        return u890.j(this.a, agfVar.a) && u890.j(this.b, agfVar.b) && this.c == agfVar.c;
    }

    public final String getPageUri() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
