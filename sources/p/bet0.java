package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bet0 implements qvy0 {
    public static final Parcelable.Creator<bet0> CREATOR = new r7t0((byte) 11);
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public bet0(int i, String str, String str2, String str3, String str4) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bet0)) {
            return false;
        }
        bet0 bet0Var = (bet0) obj;
        return this.a == bet0Var.a && u890.j(this.b, bet0Var.b) && u890.j(this.c, bet0Var.c) && u890.j(this.d, bet0Var.d) && u890.j(this.e, bet0Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return iD + (str == null ? 0 : str.hashCode());
    }

    @Override // p.qvy0
    public final int t0() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
