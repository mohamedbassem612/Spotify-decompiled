package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ch90 implements hi90, Parcelable {
    public static final Parcelable.Creator<ch90> CREATOR = new qg90((byte) 2);
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final List e;
    public final List f;
    public final List g;
    public final List h;

    public ch90(String str, String str2, String str3, boolean z, ArrayList arrayList, ArrayList arrayList2, List list, ArrayList arrayList3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = arrayList;
        this.f = arrayList2;
        this.g = list;
        this.h = arrayList3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ch90)) {
            return false;
        }
        ch90 ch90Var = (ch90) obj;
        return u890.j(this.a, ch90Var.a) && u890.j(this.b, ch90Var.b) && u890.j(this.c, ch90Var.c) && this.d == ch90Var.d && this.e.equals(ch90Var.e) && this.f.equals(ch90Var.f) && u890.j(this.g, ch90Var.g) && this.h.equals(ch90Var.h);
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
        return this.h.hashCode() + f4i1.b(f4i1.b(f4i1.b(xcg1.g(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeStringList(this.e);
        parcel.writeStringList(this.f);
        parcel.writeStringList(this.g);
        parcel.writeStringList(this.h);
    }
}
