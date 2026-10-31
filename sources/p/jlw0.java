package p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jlw0 extends llw0 {
    public static final Parcelable.Creator<jlw0> CREATOR = new w7w0((byte) 17);
    public final String a;
    public final String b;

    public jlw0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jlw0)) {
            return false;
        }
        jlw0 jlw0Var = (jlw0) obj;
        return u890.j(this.a, jlw0Var.a) && u890.j(this.b, jlw0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }

    public jlw0(Uri uri, String str) {
        this(uri.toString(), str);
    }
}
