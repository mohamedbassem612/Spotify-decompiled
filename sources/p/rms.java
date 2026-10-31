package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rms implements lio {
    public static final Parcelable.Creator<rms> CREATOR = new qms((byte) 0);
    public final ak3 a;
    public final String b;

    public rms(String str, ak3 ak3Var) {
        this.a = ak3Var;
        this.b = str;
    }

    @Override // p.vo1
    public final tu1 N(tu1 tu1Var) {
        String str = this.b;
        if (!u890.j(str, "atp")) {
            List listB = tu1Var.b();
            if (!(listB instanceof Collection) || !listB.isEmpty()) {
                Iterator it = listB.iterator();
                while (it.hasNext()) {
                    ru1 ru1VarT = rwo1.t(((su1) it.next()).b);
                    if (u890.j(ru1VarT != null ? ru1VarT.a : null, str)) {
                    }
                }
            }
            return super.N(tu1Var);
        }
        return tu1Var;
    }

    @Override // p.lio
    public final ru1 S0() {
        return new ru1(this.b, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rms)) {
            return false;
        }
        rms rmsVar = (rms) obj;
        return this.a == rmsVar.a && u890.j(this.b, rmsVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.name());
        parcel.writeString(this.b);
    }
}
