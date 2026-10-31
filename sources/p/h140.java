package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class h140 implements Parcelable {
    public static final Parcelable.Creator<h140> CREATOR = new xt30((byte) 9);
    public final String a;
    public final String b;
    public final String c;

    public h140(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h140)) {
            return false;
        }
        h140 h140Var = (h140) obj;
        return u890.j(this.a, h140Var.a) && u890.j(this.b, h140Var.b) && u890.j(this.c, h140Var.c);
    }

    public final String getUsername() {
        return this.c;
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
