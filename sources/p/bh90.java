package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bh90 implements hi90, Parcelable {
    public static final Parcelable.Creator<bh90> CREATOR = new qg90((byte) 1);
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final List f;
    public final int g;
    public final List h;

    public bh90(int i, String str, String str2, String str3, List list, List list2, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = list;
        this.g = i;
        this.h = list2;
    }

    public static bh90 a(bh90 bh90Var, int i) {
        return new bh90(i, bh90Var.a, bh90Var.b, bh90Var.c, bh90Var.f, bh90Var.h, bh90Var.d, bh90Var.e);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bh90)) {
            return false;
        }
        bh90 bh90Var = (bh90) obj;
        return u890.j(this.a, bh90Var.a) && u890.j(this.b, bh90Var.b) && u890.j(this.c, bh90Var.c) && this.d == bh90Var.d && this.e == bh90Var.e && u890.j(this.f, bh90Var.f) && this.g == bh90Var.g && u890.j(this.h, bh90Var.h);
    }

    @Override // p.hi90
    public final String getImageUri() {
        return this.c;
    }

    @Override // p.hi90
    public final String getName() {
        return this.b;
    }

    @Override // p.hi90
    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        return this.h.hashCode() + ab80.k(this.g, f4i1.b(xcg1.g(xcg1.g(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeStringList(this.f);
        int i2 = this.g;
        if (i2 == 1) {
            str = "NOT_APPLICABLE";
        } else if (i2 == 2) {
            str = "ALBUM";
        } else if (i2 == 3) {
            str = "SINGLE";
        } else {
            if (i2 != 4) {
                throw null;
            }
            str = "APPEARS_ON";
        }
        parcel.writeString(str);
        parcel.writeStringList(this.h);
    }
}
