package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vkt extends wkt {
    public static final Parcelable.Creator<vkt> CREATOR = new qms((byte) 19);
    public final o571 a;
    public final s4b1 b;
    public final ou80 c;
    public final u6q0 d;
    public final c9 e = mqo1.s(new yy61[]{yy61.LINK});

    public vkt(o571 o571Var, s4b1 s4b1Var, ou80 ou80Var, u6q0 u6q0Var) {
        this.a = o571Var;
        this.b = s4b1Var;
        this.c = ou80Var;
        this.d = u6q0Var;
    }

    @Override // p.wkt
    public final o571 a() {
        return this.a;
    }

    @Override // p.wkt
    public final ou80 b() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vkt)) {
            return false;
        }
        vkt vktVar = (vkt) obj;
        return u890.j(this.a, vktVar.a) && u890.j(this.b, vktVar.b) && u890.j(this.c, vktVar.c) && u890.j(this.d, vktVar.d);
    }

    @Override // p.wkt
    public final c380 g() {
        return this.e;
    }

    public final int hashCode() {
        int iD = cy30.d(xvj1.j(this.b, this.a.hashCode() * 31, 31), 31, this.c.a);
        u6q0 u6q0Var = this.d;
        return iD + (u6q0Var == null ? 0 : u6q0Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        s4b1 s4b1Var = this.b;
        parcel.writeString(s4b1Var != null ? s4b1Var.z() : null);
        parcel.writeSerializable(this.c);
        parcel.writeParcelable(this.d, i);
    }
}
