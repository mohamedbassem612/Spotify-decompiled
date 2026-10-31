package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class e7g0 implements Parcelable {
    public static final Parcelable.Creator<e7g0> CREATOR = new isf0((byte) 16);
    public final String a;
    public final lik1 b;
    public final iyr0 c;
    public final String d;
    public final p6r0 e;

    public e7g0(String str, lik1 lik1Var, iyr0 iyr0Var, String str2) {
        p6r0 p6r0VarG1;
        this.a = str;
        this.b = lik1Var;
        this.c = iyr0Var;
        this.d = str2;
        int iOrdinal = iyr0Var.ordinal();
        if (iOrdinal == 0) {
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            p6r0VarG1 = yon1.G1("PARENTAL_CONTROL_MANAGE_APPROVED_CONTENT", "parental-control/manage-approved-content", 1408, "parental-control");
        } else {
            if (iOrdinal != 1) {
                eg.o();
                throw null;
            }
            AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
            p6r0VarG1 = yon1.G1("PARENTAL_CONTROL_MANAGE_BLOCKED_CONTENT", "parental-control/manage-blocked-content", 1410, "parental-control");
        }
        this.e = p6r0VarG1;
    }

    public final lik1 a() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final p6r0 e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e7g0)) {
            return false;
        }
        e7g0 e7g0Var = (e7g0) obj;
        return u890.j(this.a, e7g0Var.a) && u890.j(this.b, e7g0Var.b) && this.c == e7g0Var.c && u890.j(this.d, e7g0Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b.a)) * 31;
        String str = this.d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeString(this.d);
    }
}
