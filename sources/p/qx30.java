package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qx30 implements Parcelable {
    public static final Parcelable.Creator<qx30> CREATOR = new xt30((byte) 6);
    public final px30 a;
    public final s69 b;
    public final s69 c;
    public final s69 d;
    public final s69 e;
    public final s69 f;
    public final s69 g;

    public qx30(px30 px30Var, s69 s69Var, s69 s69Var2, s69 s69Var3, s69 s69Var4, s69 s69Var5, s69 s69Var6) {
        this.a = px30Var;
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
        if (!(obj instanceof qx30)) {
            return false;
        }
        qx30 qx30Var = (qx30) obj;
        return u890.j(this.a, qx30Var.a) && u890.j(this.b, qx30Var.b) && u890.j(this.c, qx30Var.c) && u890.j(this.d, qx30Var.d) && u890.j(this.e, qx30Var.e) && u890.j(this.f, qx30Var.f) && u890.j(this.g, qx30Var.g);
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
