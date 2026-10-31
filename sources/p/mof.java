package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mof implements pof {
    public static final Parcelable.Creator<mof> CREATOR = new zbf((byte) 21);
    public final String a;
    public final String b;
    public final int c;

    public mof(int i, String str, String str2) {
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
        if (!(obj instanceof mof)) {
            return false;
        }
        mof mofVar = (mof) obj;
        return u890.j(this.a, mofVar.a) && u890.j(this.b, mofVar.b) && this.c == mofVar.c;
    }

    @Override // p.pof
    public final String getViewUri() {
        return this.a;
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
