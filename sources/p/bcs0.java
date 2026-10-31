package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bcs0 implements ecs0 {
    public static final Parcelable.Creator<bcs0> CREATOR = new ybs0((byte) 2);
    public final String a;
    public final String b;
    public final c380 c;
    public final String d;
    public final v7u e;
    public final String f;

    public bcs0(String str, String str2, c380 c380Var, String str3, v7u v7uVar, String str4) {
        this.a = str;
        this.b = str2;
        this.c = c380Var;
        this.d = str3;
        this.e = v7uVar;
        this.f = str4;
    }

    public static bcs0 a(bcs0 bcs0Var, String str, c380 c380Var, String str2, v7u v7uVar, int i) {
        String str3 = bcs0Var.a;
        if ((i & 2) != 0) {
            str = bcs0Var.b;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            c380Var = bcs0Var.c;
        }
        c380 c380Var2 = c380Var;
        if ((i & 8) != 0) {
            str2 = bcs0Var.d;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            v7uVar = bcs0Var.e;
        }
        return new bcs0(str3, str4, c380Var2, str5, v7uVar, bcs0Var.f);
    }

    public final String L() {
        return this.d;
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0037  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bcs0)) {
            return false;
        }
        bcs0 bcs0Var = (bcs0) obj;
        if (!u890.j(this.a, bcs0Var.a) || !u890.j(this.b, bcs0Var.b) || !u890.j(this.c, bcs0Var.c)) {
            return false;
        }
        String str = bcs0Var.d;
        String str2 = this.d;
        if (str2 == null) {
            if (str == null) {
                zEquals = true;
            } else {
                zEquals = false;
            }
        } else if (str == null) {
            zEquals = false;
        } else {
            zEquals = str2.equals(str);
        }
        return zEquals && u890.j(this.e, bcs0Var.e) && u890.j(this.f, bcs0Var.f);
    }

    public final int hashCode() {
        int iF = kk0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
        String str = this.d;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        v7u v7uVar = this.e;
        int iHashCode2 = (iHashCode + (v7uVar == null ? 0 : v7uVar.a.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String q() {
        return this.a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        Iterator itL = x0d.l(this.c, parcel);
        while (itL.hasNext()) {
            parcel.writeParcelable((Parcelable) itL.next(), i);
        }
        String str = this.d;
        parcel.writeParcelable(str != null ? new ei31(str) : null, i);
        parcel.writeParcelable(this.e, i);
        parcel.writeString(this.f);
    }
}
