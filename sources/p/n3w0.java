package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@o661
public final class n3w0 implements Parcelable {
    public final String a;
    public final String b;
    public final List c;
    public final Boolean d;
    public final String e;
    public final boolean f;
    public static final m3w0 Companion = new m3w0();
    public static final Parcelable.Creator<n3w0> CREATOR = new g0v0(22);
    public static final znb0[] g = {null, null, dm5.S(2, tnt0.a1), null, null, null};

    public /* synthetic */ n3w0(int i, String str, String str2, List list, Boolean bool, String str3, boolean z) {
        if (6 != (i & 6)) {
            o6p1.t(i, 6, l3w0.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        this.b = str2;
        this.c = list;
        if ((i & 8) == 0) {
            this.d = Boolean.FALSE;
        } else {
            this.d = bool;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = false;
        } else {
            this.f = z;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3w0)) {
            return false;
        }
        n3w0 n3w0Var = (n3w0) obj;
        return u890.j(this.a, n3w0Var.a) && u890.j(this.b, n3w0Var.b) && u890.j(this.c, n3w0Var.c) && u890.j(this.d, n3w0Var.d) && u890.j(this.e, n3w0Var.e) && this.f == n3w0Var.f;
    }

    public final int hashCode() {
        String str = this.a;
        int iB = f4i1.b(cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
        Boolean bool = this.d;
        int iHashCode = (iB + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeStringList(this.c);
        Boolean bool = this.d;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            i3a.m(parcel, 1, bool);
        }
        parcel.writeString(this.e);
        parcel.writeInt(this.f ? 1 : 0);
    }

    public n3w0(String str, String str2, List list, Boolean bool, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = bool;
        this.e = str3;
        this.f = z;
    }
}
