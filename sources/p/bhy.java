package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bhy extends mhy {
    public static final Parcelable.Creator<bhy> CREATOR = new utx((byte) 23);
    public final int a;
    public final ttm1 b;
    public final boolean c;
    public final as3 d;
    public final int e;
    public final boolean f;
    public final boolean g;

    public bhy(int i, ttm1 ttm1Var, boolean z, as3 as3Var, int i2, boolean z2, boolean z3) {
        this.a = i;
        this.b = ttm1Var;
        this.c = z;
        this.d = as3Var;
        this.e = i2;
        this.f = z2;
        this.g = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bhy)) {
            return false;
        }
        bhy bhyVar = (bhy) obj;
        return this.a == bhyVar.a && u890.j(this.b, bhyVar.b) && this.c == bhyVar.c && this.d == bhyVar.d && this.e == bhyVar.e && this.f == bhyVar.f && this.g == bhyVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + xcg1.g(kaa0.f(this.e, (this.d.hashCode() + xcg1.g((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c)) * 31, 31), 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        this.b.writeToParcel(parcel, i);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeString(this.d.name());
        parcel.writeInt(this.e);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
    }

    public /* synthetic */ bhy(int i, ttm1 ttm1Var, as3 as3Var, int i2) {
        this(i, ttm1Var, false, as3Var, i2, false, false);
    }
}
