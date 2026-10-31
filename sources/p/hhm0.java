package p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hhm0 implements Parcelable {
    public static final Parcelable.Creator<hhm0> CREATOR = new w9k0((byte) 28);
    public final String a;
    public final boolean b;
    public final Uri c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final Set g;

    public /* synthetic */ hhm0(String str, boolean z, Uri uri, boolean z2, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? true : z, (i & 4) != 0 ? Uri.EMPTY : uri, (i & 8) == 0, null, (i & 32) != 0 ? false : z2, w7x.a);
    }

    public static hhm0 a(hhm0 hhm0Var, Uri uri, String str, LinkedHashSet linkedHashSet, int i) {
        String str2 = hhm0Var.a;
        boolean z = hhm0Var.b;
        if ((i & 4) != 0) {
            uri = hhm0Var.c;
        }
        Uri uri2 = uri;
        boolean z2 = hhm0Var.d;
        if ((i & 16) != 0) {
            str = hhm0Var.e;
        }
        String str3 = str;
        boolean z3 = hhm0Var.f;
        Set set = linkedHashSet;
        if ((i & 64) != 0) {
            set = hhm0Var.g;
        }
        return new hhm0(str2, z, uri2, z2, str3, z3, set);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hhm0)) {
            return false;
        }
        hhm0 hhm0Var = (hhm0) obj;
        return u890.j(this.a, hhm0Var.a) && this.b == hhm0Var.b && u890.j(this.c, hhm0Var.c) && this.d == hhm0Var.d && u890.j(this.e, hhm0Var.e) && this.f == hhm0Var.f && u890.j(this.g, hhm0Var.g);
    }

    public final int hashCode() {
        int iG = xcg1.g(hrt.h(this.c, xcg1.g(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
        String str = this.e;
        return this.g.hashCode() + xcg1.g((iG + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeString(this.e);
        parcel.writeInt(this.f ? 1 : 0);
        Iterator itH = k4s0.h(this.g, parcel);
        while (itH.hasNext()) {
            parcel.writeString((String) itH.next());
        }
    }

    public hhm0(String str, boolean z, Uri uri, boolean z2, String str2, boolean z3, Set set) {
        this.a = str;
        this.b = z;
        this.c = uri;
        this.d = z2;
        this.e = str2;
        this.f = z3;
        this.g = set;
    }
}
