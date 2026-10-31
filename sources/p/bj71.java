package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bj71 implements Parcelable {
    public static final Parcelable.Creator<bj71> CREATOR = new ff71(13);
    public final Set a;
    public final boolean b;
    public final String c;

    public /* synthetic */ bj71(Set set, boolean z, String str, int i) {
        this((i & 1) != 0 ? w7x.a : set, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : str);
    }

    public static bj71 a(bj71 bj71Var, LinkedHashSet linkedHashSet) {
        boolean z = bj71Var.b;
        String str = bj71Var.c;
        bj71Var.getClass();
        return new bj71(linkedHashSet, z, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bj71)) {
            return false;
        }
        bj71 bj71Var = (bj71) obj;
        return u890.j(this.a, bj71Var.a) && this.b == bj71Var.b && u890.j(this.c, bj71Var.c);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iG + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itH = k4s0.h(this.a, parcel);
        while (itH.hasNext()) {
            parcel.writeParcelable((Parcelable) itH.next(), i);
        }
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeString(this.c);
    }

    public bj71(Set set, boolean z, String str) {
        this.a = set;
        this.b = z;
        this.c = str;
    }
}
