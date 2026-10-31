package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ga20 implements Parcelable {
    public static final Parcelable.Creator<ga20> CREATOR = new u220((byte) 20);
    public final fa20 a;
    public final s69 b;
    public final s69 c;
    public final s69 d;
    public final s69 e;
    public final s69 f;
    public final s69 g;

    public ga20(fa20 fa20Var, s69 s69Var, s69 s69Var2, s69 s69Var3, s69 s69Var4, s69 s69Var5, s69 s69Var6) {
        this.a = fa20Var;
        this.b = s69Var;
        this.c = s69Var2;
        this.d = s69Var3;
        this.e = s69Var4;
        this.f = s69Var5;
        this.g = s69Var6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ga20)) {
            return false;
        }
        ga20 ga20Var = (ga20) obj;
        return u890.j(this.a, ga20Var.a) && u890.j(this.b, ga20Var.b) && u890.j(this.c, ga20Var.c) && u890.j(this.d, ga20Var.d) && u890.j(this.e, ga20Var.e) && u890.j(this.f, ga20Var.f) && u890.j(this.g, ga20Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + v8i0.h(this.f, v8i0.h(this.e, v8i0.h(this.d, v8i0.h(this.c, v8i0.h(this.b, this.a.a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        this.b.writeToParcel(parcel, i);
        this.c.writeToParcel(parcel, i);
        this.d.writeToParcel(parcel, i);
        this.e.writeToParcel(parcel, i);
        this.f.writeToParcel(parcel, i);
        this.g.writeToParcel(parcel, i);
    }
}
