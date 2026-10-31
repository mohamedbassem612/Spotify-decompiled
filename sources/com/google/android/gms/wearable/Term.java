package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p.hmo1;
import p.j541;
import p.u9;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class Term extends u9 implements ReflectedParcelable {
    public static final Parcelable.Creator<Term> CREATOR = new hmo1(20);
    public final int a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final int f;

    public Term(int i, int i2, String str, String str2, String str3, boolean z) {
        this.a = i;
        this.d = str2;
        this.c = z;
        this.b = str;
        this.e = str3;
        this.f = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.K(parcel, 1, 4);
        parcel.writeInt(this.a);
        j541.F(parcel, 2, this.b);
        j541.K(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        j541.F(parcel, 4, this.d);
        j541.F(parcel, 5, this.e);
        j541.K(parcel, 6, 4);
        parcel.writeInt(this.f);
        j541.M(iL, parcel);
    }
}
