package p;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hp implements Parcelable {
    public static final Parcelable.Creator<hp> CREATOR = new gp((byte) 0);
    public final List a;
    public final Intent b;
    public final run0 c;
    public final hwe0 d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public hp(List list, Intent intent, run0 run0Var, hwe0 hwe0Var, boolean z, boolean z2, boolean z3) {
        this.a = list;
        this.b = intent;
        this.c = run0Var;
        this.d = hwe0Var;
        this.e = z;
        this.f = z2;
        this.g = z3;
    }

    public static hp a(hp hpVar, run0 run0Var, hwe0 hwe0Var, boolean z, boolean z2, int i) {
        List list = hpVar.a;
        Intent intent = hpVar.b;
        if ((i & 4) != 0) {
            run0Var = hpVar.c;
        }
        run0 run0Var2 = run0Var;
        if ((i & 8) != 0) {
            hwe0Var = hpVar.d;
        }
        hwe0 hwe0Var2 = hwe0Var;
        if ((i & 16) != 0) {
            z = hpVar.e;
        }
        boolean z3 = z;
        boolean z4 = hpVar.f;
        if ((i & 64) != 0) {
            z2 = hpVar.g;
        }
        return new hp(list, intent, run0Var2, hwe0Var2, z3, z4, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hp)) {
            return false;
        }
        hp hpVar = (hp) obj;
        return this.a.equals(hpVar.a) && u890.j(this.b, hpVar.b) && u890.j(this.c, hpVar.c) && u890.j(this.d, hpVar.d) && this.e == hpVar.e && this.f == hpVar.f && this.g == hpVar.g;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        hwe0 hwe0Var = this.d;
        return Boolean.hashCode(this.g) + xcg1.g(xcg1.g((iHashCode + (hwe0Var == null ? 0 : hwe0Var.hashCode())) * 31, 31, this.e), 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM = kk0.m(parcel, this.a);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
    }
}
