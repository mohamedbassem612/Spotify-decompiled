package p;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class p3e extends u9 {
    public static final Parcelable.Creator<p3e> CREATOR;
    public static final bmo1 S0 = new bmo1(false);
    public static final uso1 T0 = new uso1(0);
    public static final h3e U0;
    public final boolean N0;
    public final bmo1 O0;
    public uso1 P0;
    public final boolean Q0;
    public final boolean R0;
    public final boolean X;
    public final List Y;
    public final boolean Z;
    public final String a;
    public final ArrayList b;
    public final boolean c;
    public final ckb0 d;
    public final boolean e;
    public final h3e f;
    public final boolean g;
    public final double h;
    public final boolean i;
    public final boolean t;

    static {
        lls0 lls0Var = new lls0((byte) 10);
        lls0Var.x();
        lls0Var.y();
        U0 = lls0Var.i();
        CREATOR = new hmo1((byte) 12);
    }

    public p3e(String str, ArrayList arrayList, boolean z, ckb0 ckb0Var, boolean z2, h3e h3eVar, boolean z3, double d, boolean z4, boolean z5, boolean z6, ArrayList arrayList2, boolean z7, boolean z8, bmo1 bmo1Var, uso1 uso1Var, boolean z9, boolean z10) {
        this.a = true == TextUtils.isEmpty(str) ? "" : str;
        int size = arrayList == null ? 0 : arrayList.size();
        ArrayList arrayList3 = new ArrayList(size);
        this.b = arrayList3;
        if (size > 0) {
            arrayList3.addAll(arrayList);
        }
        this.c = z;
        this.d = ckb0Var == null ? new ckb0() : ckb0Var;
        this.e = z2;
        this.f = h3eVar;
        this.g = z3;
        this.h = d;
        this.i = z4;
        this.t = z5;
        this.X = z6;
        this.Y = arrayList2;
        this.Z = z7;
        this.N0 = z8;
        this.O0 = bmo1Var;
        this.P0 = uso1Var;
        this.Q0 = z9;
        this.R0 = z10;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = j541.j(parcel);
        j541.F(parcel, 2, this.a);
        j541.H(parcel, 3, Collections.unmodifiableList(this.b));
        j541.s(parcel, 4, this.c);
        j541.E(parcel, 5, this.d, i);
        j541.s(parcel, 6, this.e);
        j541.E(parcel, 7, this.f, i);
        j541.s(parcel, 8, this.g);
        j541.w(parcel, this.h);
        j541.s(parcel, 10, this.i);
        j541.s(parcel, 11, this.t);
        j541.s(parcel, 12, this.X);
        j541.H(parcel, 13, Collections.unmodifiableList(this.Y));
        j541.s(parcel, 14, this.Z);
        j541.z(parcel, 15, 0);
        j541.s(parcel, 16, this.N0);
        j541.E(parcel, 17, this.O0, i);
        j541.E(parcel, 18, this.P0, i);
        j541.s(parcel, 19, this.Q0);
        j541.s(parcel, 20, this.R0);
        j541.n(iJ, parcel);
    }
}
