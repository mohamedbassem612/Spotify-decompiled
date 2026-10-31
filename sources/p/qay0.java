package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qay0 implements Parcelable {
    public static final Parcelable.Creator<qay0> CREATOR = new zzx0(10);
    public final String a;
    public final oay0 b;
    public final u771 c;
    public final wkt d;

    public qay0(String str, oay0 oay0Var, u771 u771Var, wkt wktVar) {
        this.a = str;
        this.b = oay0Var;
        this.c = u771Var;
        this.d = wktVar;
    }

    public static qay0 a(qay0 qay0Var, oay0 oay0Var, wkt wktVar, int i) {
        String str = qay0Var.a;
        if ((i & 2) != 0) {
            oay0Var = qay0Var.b;
        }
        u771 u771Var = qay0Var.c;
        if ((i & 8) != 0) {
            wktVar = qay0Var.d;
        }
        return new qay0(str, oay0Var, u771Var, wktVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qay0)) {
            return false;
        }
        qay0 qay0Var = (qay0) obj;
        return u890.j(this.a, qay0Var.a) && u890.j(this.b, qay0Var.b) && u890.j(this.c, qay0Var.c) && u890.j(this.d, qay0Var.d);
    }

    public final int hashCode() {
        int iG = cfm0.g(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
        wkt wktVar = this.d;
        return iG + (wktVar == null ? 0 : wktVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
    }

    public /* synthetic */ qay0(String str, oay0 oay0Var, u771 u771Var, int i) {
        this(str, (i & 2) != 0 ? nay0.a : oay0Var, u771Var, (wkt) null);
    }
}
