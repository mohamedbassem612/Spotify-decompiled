package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@o661
public final class qcl1 implements Parcelable {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public static final pcl1 Companion = new pcl1();
    public static final Parcelable.Creator<qcl1> CREATOR = new ylk1((byte) 18);

    public /* synthetic */ qcl1(int i, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, ocl1.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z2;
        }
        if ((i & 32) == 0) {
            this.f = false;
        } else {
            this.f = z3;
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
        if (!(obj instanceof qcl1)) {
            return false;
        }
        qcl1 qcl1Var = (qcl1) obj;
        return u890.j(this.a, qcl1Var.a) && u890.j(this.b, qcl1Var.b) && u890.j(this.c, qcl1Var.c) && this.d == qcl1Var.d && this.e == qcl1Var.e && this.f == qcl1Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + xcg1.g(xcg1.g(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
    }

    public qcl1(String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }
}
