package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class fxn implements Parcelable {
    public final int a;
    public final int b;
    public final List c;
    public final String d;
    public final String e;
    public final String f;
    public final v29 g;
    public final boolean h;
    public final ro6 i;
    public static final exn Companion = new exn();
    public static final Parcelable.Creator<fxn> CREATOR = new upn((byte) 15);
    public static final znb0[] t = {null, null, dm5.S(2, lmm.U0), null, null, null, null, null, null};

    public /* synthetic */ fxn(int i, int i2, int i3, List list, String str, String str2, String str3, v29 v29Var, boolean z, ro6 ro6Var) {
        if ((i & 1) == 0) {
            this.a = 0;
        } else {
            this.a = i2;
        }
        if ((i & 2) == 0) {
            this.b = 0;
        } else {
            this.b = i3;
        }
        if ((i & 4) == 0) {
            this.c = z6x.a;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = v29Var;
        }
        if ((i & 128) == 0) {
            this.h = false;
        } else {
            this.h = z;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = ro6Var;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxn)) {
            return false;
        }
        fxn fxnVar = (fxn) obj;
        return this.a == fxnVar.a && this.b == fxnVar.b && u890.j(this.c, fxnVar.c) && u890.j(this.d, fxnVar.d) && u890.j(this.e, fxnVar.e) && u890.j(this.f, fxnVar.f) && u890.j(this.g, fxnVar.g) && this.h == fxnVar.h && u890.j(this.i, fxnVar.i);
    }

    public final int hashCode() {
        int iB = f4i1.b(kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
        String str = this.d;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        v29 v29Var = this.g;
        int iG = xcg1.g((iHashCode3 + (v29Var == null ? 0 : v29Var.hashCode())) * 31, 31, this.h);
        ro6 ro6Var = this.i;
        return iG + (ro6Var != null ? ro6Var.a.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        Iterator itM = kk0.m(parcel, this.c);
        while (itM.hasNext()) {
            ((zw70) itM.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        v29 v29Var = this.g;
        if (v29Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            v29Var.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.h ? 1 : 0);
        ro6 ro6Var = this.i;
        if (ro6Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ro6Var.writeToParcel(parcel, i);
        }
    }

    public fxn(int i, int i2, ArrayList arrayList, String str, String str2, String str3, v29 v29Var, boolean z, ro6 ro6Var) {
        this.a = i;
        this.b = i2;
        this.c = arrayList;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = v29Var;
        this.h = z;
        this.i = ro6Var;
    }
}
