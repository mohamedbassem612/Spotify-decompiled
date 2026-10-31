package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class m320 implements n320 {
    public static final Parcelable.Creator<m320> CREATOR = new u220((byte) 6);
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public m320(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final String a() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m320)) {
            return false;
        }
        m320 m320Var = (m320) obj;
        return u890.j(this.a, m320Var.a) && u890.j(this.b, m320Var.b) && u890.j(this.c, m320Var.c) && u890.j(this.d, m320Var.d);
    }

    public final String getLabel() {
        return this.b;
    }

    public final String getText() {
        return this.d;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
