package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class k221 implements Parcelable {
    public static final Parcelable.Creator<k221> CREATOR = new e211((byte) 27);
    public final String a;
    public final boolean b;
    public final c380 c;
    public final int d;
    public final m0u e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final o331 i;

    public k221(String str, boolean z, c380 c380Var, int i, m0u m0uVar, boolean z2, boolean z3, boolean z4, o331 o331Var) {
        this.a = str;
        this.b = z;
        this.c = c380Var;
        this.d = i;
        this.e = m0uVar;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = o331Var;
    }

    public static k221 a(k221 k221Var, boolean z, c380 c380Var, int i, m0u m0uVar, boolean z2, boolean z3, boolean z4, w131 w131Var, int i2) {
        boolean z5 = z;
        String str = k221Var.a;
        if ((i2 & 2) != 0) {
            z5 = k221Var.b;
        }
        if ((i2 & 4) != 0) {
            c380Var = k221Var.c;
        }
        if ((i2 & 8) != 0) {
            i = k221Var.d;
        }
        if ((i2 & 16) != 0) {
            m0uVar = k221Var.e;
        }
        if ((i2 & 32) != 0) {
            z2 = k221Var.f;
        }
        if ((i2 & 64) != 0) {
            z3 = k221Var.g;
        }
        if ((i2 & 128) != 0) {
            z4 = k221Var.h;
        }
        o331 o331Var = w131Var;
        if ((i2 & 256) != 0) {
            o331Var = k221Var.i;
        }
        o331 o331Var2 = o331Var;
        k221Var.getClass();
        boolean z6 = z4;
        boolean z7 = z3;
        boolean z8 = z2;
        m0u m0uVar2 = m0uVar;
        int i3 = i;
        return new k221(str, z5, c380Var, i3, m0uVar2, z8, z7, z6, o331Var2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k221)) {
            return false;
        }
        k221 k221Var = (k221) obj;
        return u890.j(this.a, k221Var.a) && this.b == k221Var.b && u890.j(this.c, k221Var.c) && this.d == k221Var.d && u890.j(this.e, k221Var.e) && this.f == k221Var.f && this.g == k221Var.g && this.h == k221Var.h && u890.j(this.i, k221Var.i);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.d, kk0.f(this.c, xcg1.g(this.a.hashCode() * 31, 31, this.b), 31), 31);
        m0u m0uVar = this.e;
        return this.i.hashCode() + xcg1.g(xcg1.g(xcg1.g((iF + (m0uVar == null ? 0 : m0uVar.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        Iterator itL = x0d.l(this.c, parcel);
        while (itL.hasNext()) {
            parcel.writeParcelable((Parcelable) itL.next(), i);
        }
        parcel.writeInt(this.d);
        parcel.writeParcelable(this.e, i);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeParcelable(this.i, i);
    }
}
