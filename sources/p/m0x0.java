package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class m0x0 implements Parcelable {
    public static final Parcelable.Creator<m0x0> CREATOR = new wvw0((byte) 4);
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final String f;

    public m0x0(String str, String str2, String str3, String str4, boolean z, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = str4;
        this.f = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0x0)) {
            return false;
        }
        m0x0 m0x0Var = (m0x0) obj;
        return u890.j(this.a, m0x0Var.a) && u890.j(this.b, m0x0Var.b) && u890.j(this.c, m0x0Var.c) && this.d == m0x0Var.d && u890.j(this.e, m0x0Var.e) && u890.j(this.f, m0x0Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.f.hashCode() + cy30.d(xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }
}
