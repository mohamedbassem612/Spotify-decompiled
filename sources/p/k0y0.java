package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k0y0 implements Parcelable {
    public static final Parcelable.Creator<k0y0> CREATOR = new zzx0((byte) 2);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final String f;

    public k0y0(String str, String str2, String str3, String str4, String str5, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = arrayList;
        this.f = str5;
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
        if (!(obj instanceof k0y0)) {
            return false;
        }
        k0y0 k0y0Var = (k0y0) obj;
        return u890.j(this.a, k0y0Var.a) && u890.j(this.b, k0y0Var.b) && u890.j(this.c, k0y0Var.c) && u890.j(this.d, k0y0Var.d) && this.e.equals(k0y0Var.e) && u890.j(this.f, k0y0Var.f);
    }

    public final int hashCode() {
        int iB = f4i1.b(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        return iB + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeStringList(this.e);
        parcel.writeString(this.f);
    }
}
