package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class m0u implements Parcelable {
    public static final Parcelable.Creator<m0u> CREATOR = new zrt((byte) 4);
    public final boolean a;
    public final boolean b;
    public final ept c;
    public final rw21 d;
    public final boolean e;
    public final boolean f;
    public final long g;

    public m0u(boolean z, boolean z2, ept eptVar, rw21 rw21Var, boolean z3, boolean z4, long j) {
        this.a = z;
        this.b = z2;
        this.c = eptVar;
        this.d = rw21Var;
        this.e = z3;
        this.f = z4;
        this.g = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0u)) {
            return false;
        }
        m0u m0uVar = (m0u) obj;
        return this.a == m0uVar.a && this.b == m0uVar.b && u890.j(this.c, m0uVar.c) && u890.j(this.d, m0uVar.d) && this.e == m0uVar.e && this.f == m0uVar.f && this.g == m0uVar.g;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + xcg1.g(xcg1.g((this.d.hashCode() + ((this.c.hashCode() + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31, 31, this.e), 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        this.c.writeToParcel(parcel, i);
        this.d.writeToParcel(parcel, i);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeLong(this.g);
    }
}
