package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nb1 implements Parcelable {
    public static final Parcelable.Creator<nb1> CREATOR = new d41((byte) 12);
    public final String a;
    public final lik1 b;
    public final iyr0 c;
    public final p6r0 d;

    public nb1(String str, lik1 lik1Var, iyr0 iyr0Var) {
        p6r0 p6r0VarG1;
        this.a = str;
        this.b = lik1Var;
        this.c = iyr0Var;
        int iOrdinal = iyr0Var.ordinal();
        if (iOrdinal == 0) {
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            p6r0VarG1 = yon1.G1("PARENTAL_CONTROL_MANAGE_APPROVED_CONTENT_SEARCH", "parental-control/manage-approved-content/search", 1409, "parental-control");
        } else {
            if (iOrdinal != 1) {
                eg.o();
                throw null;
            }
            AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
            p6r0VarG1 = yon1.G1("PARENTAL_CONTROL_MANAGE_BLOCKED_CONTENT_SEARCH", "parental-control/manage-blocked-content/search", 1411, "parental-control");
        }
        this.d = p6r0VarG1;
    }

    public final String a() {
        return this.a;
    }

    public final iyr0 b() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final p6r0 e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nb1)) {
            return false;
        }
        nb1 nb1Var = (nb1) obj;
        return u890.j(this.a, nb1Var.a) && u890.j(this.b, nb1Var.b) && this.c == nb1Var.c;
    }

    public final lik1 g() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
    }
}
