package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fa81 implements Parcelable {
    public static final Parcelable.Creator<fa81> CREATOR = new ro71((byte) 8);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final boolean f;

    public fa81(String str, String str2, List list, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
        this.f = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa81)) {
            return false;
        }
        fa81 fa81Var = (fa81) obj;
        return u890.j(this.a, fa81Var.a) && u890.j(this.b, fa81Var.b) && u890.j(this.c, fa81Var.c) && u890.j(this.d, fa81Var.d) && this.e.equals(fa81Var.e) && this.f == fa81Var.f;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return Boolean.hashCode(this.f) + f4i1.b((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        Iterator itM = kk0.m(parcel, this.e);
        while (itM.hasNext()) {
            ((gp51) itM.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f ? 1 : 0);
    }
}
