package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nxw implements Parcelable {
    public static final Parcelable.Creator<nxw> CREATOR = new x7w((byte) 5);
    public final hyw a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public nxw(hyw hywVar, boolean z, boolean z2, boolean z3) {
        this.a = hywVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public static nxw a(nxw nxwVar, hyw hywVar, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            hywVar = nxwVar.a;
        }
        if ((i & 2) != 0) {
            z = nxwVar.b;
        }
        boolean z3 = (i & 4) != 0 ? nxwVar.c : true;
        if ((i & 8) != 0) {
            z2 = nxwVar.d;
        }
        nxwVar.getClass();
        return new nxw(hywVar, z, z3, z2);
    }

    public final String b() {
        Object objInvoke;
        vrw vrwVar = vrw.t;
        vrw vrwVar2 = vrw.X;
        vrw vrwVar3 = vrw.Y;
        vrw vrwVar4 = vrw.Z;
        vrw vrwVar5 = vrw.N0;
        vrw vrwVar6 = vrw.O0;
        hyw hywVar = this.a;
        hywVar.getClass();
        if (hywVar instanceof byw) {
            objInvoke = vrwVar.invoke(hywVar);
        } else if (hywVar instanceof cyw) {
            objInvoke = vrwVar2.invoke(hywVar);
        } else if (hywVar instanceof dyw) {
            objInvoke = vrwVar3.invoke(hywVar);
        } else if (hywVar instanceof gyw) {
            objInvoke = vrwVar4.invoke(hywVar);
        } else if (hywVar instanceof eyw) {
            objInvoke = vrwVar5.invoke(hywVar);
        } else {
            if (!(hywVar instanceof fyw)) {
                eg.o();
                return null;
            }
            objInvoke = vrwVar6.invoke(hywVar);
        }
        return (String) objInvoke;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nxw)) {
            return false;
        }
        nxw nxwVar = (nxw) obj;
        return u890.j(this.a, nxwVar.a) && this.b == nxwVar.b && this.c == nxwVar.c && this.d == nxwVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "EmailModel(emailState=" + rc11.a.b(this.a.getClass()).r() + ", hasConnection=" + this.b + ", useHints=" + this.c + ", wasAutofillUsed=" + this.d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
    }

    public /* synthetic */ nxw(dyw dywVar, int i) {
        this((i & 1) != 0 ? byw.a : dywVar, true, false, false);
    }
}
