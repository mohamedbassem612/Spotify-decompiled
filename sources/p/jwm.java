package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jwm implements Parcelable {
    public static final Parcelable.Creator<jwm> CREATOR = new rtm((byte) 8);
    public final w4i1 a;
    public final bwm b;
    public final gwm c;
    public final w4i1 d;

    public /* synthetic */ jwm(int i, w4i1 w4i1Var) {
        this(w4i1Var, (i & 2) != 0 ? awm.a : zvm.a, cwm.a, null);
    }

    public static jwm a(jwm jwmVar, w4i1 w4i1Var, w4i1 w4i1Var2, int i) {
        bwm bwmVar = jwmVar.b;
        gwm gwmVar = jwmVar.c;
        if ((i & 8) != 0) {
            w4i1Var2 = jwmVar.d;
        }
        jwmVar.getClass();
        return new jwm(w4i1Var, bwmVar, gwmVar, w4i1Var2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jwm)) {
            return false;
        }
        jwm jwmVar = (jwm) obj;
        return u890.j(this.a, jwmVar.a) && u890.j(this.b, jwmVar.b) && u890.j(this.c, jwmVar.c) && u890.j(this.d, jwmVar.d);
    }

    public final String getDisplayName() {
        return this.a.b;
    }

    public final String getUsername() {
        return this.a.a;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        w4i1 w4i1Var = this.d;
        return iHashCode + (w4i1Var == null ? 0 : w4i1Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        w4i1 w4i1Var = this.d;
        if (w4i1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            w4i1Var.writeToParcel(parcel, i);
        }
    }

    public jwm(w4i1 w4i1Var, bwm bwmVar, gwm gwmVar, w4i1 w4i1Var2) {
        this.a = w4i1Var;
        this.b = bwmVar;
        this.c = gwmVar;
        this.d = w4i1Var2;
    }
}
