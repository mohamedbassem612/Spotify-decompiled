package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class b9c1 implements Parcelable {
    public static final Parcelable.Creator<b9c1> CREATOR = new y7c1(2);
    public final int a;
    public final b8c1 b;
    public final int c;
    public final kas0 d;
    public final u6c1 e;

    public /* synthetic */ b9c1(int i) {
        this(i, z7c1.a, 0, kas0.b, new u6c1(2));
    }

    public static b9c1 a(b9c1 b9c1Var, b8c1 b8c1Var, int i, kas0 kas0Var, u6c1 u6c1Var, int i2) {
        b8c1 b8c1Var2 = b8c1Var;
        int i3 = b9c1Var.a;
        if ((i2 & 2) != 0) {
            b8c1Var2 = b9c1Var.b;
        }
        if ((i2 & 4) != 0) {
            i = b9c1Var.c;
        }
        if ((i2 & 8) != 0) {
            kas0Var = b9c1Var.d;
        }
        if ((i2 & 16) != 0) {
            u6c1Var = b9c1Var.e;
        }
        u6c1 u6c1Var2 = u6c1Var;
        kas0 kas0Var2 = kas0Var;
        return new b9c1(i3, b8c1Var2, i, kas0Var2, u6c1Var2);
    }

    public final kas0 b() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b9c1)) {
            return false;
        }
        b9c1 b9c1Var = (b9c1) obj;
        return this.a == b9c1Var.a && u890.j(this.b, b9c1Var.b) && this.c == b9c1Var.c && this.d == b9c1Var.d && u890.j(this.e, b9c1Var.e);
    }

    public final u6c1 g() {
        return this.e;
    }

    public final int hashCode() {
        return l1d.C(this.e.a) + ((this.d.hashCode() + kaa0.f(this.c, (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c);
        parcel.writeString(this.d.name());
        this.e.writeToParcel(parcel, i);
    }

    public b9c1(int i, b8c1 b8c1Var, int i2, kas0 kas0Var, u6c1 u6c1Var) {
        this.a = i;
        this.b = b8c1Var;
        this.c = i2;
        this.d = kas0Var;
        this.e = u6c1Var;
    }
}
