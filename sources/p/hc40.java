package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hc40 implements Parcelable, jik1 {
    public static final Parcelable.Creator<hc40> CREATOR = new xt30((byte) 19);
    public final gc40 a;
    public final lik1 b;
    public final p6r0 c;
    public final String d;

    public hc40(gc40 gc40Var) {
        lik1 lik1VarI;
        p6r0 p6r0VarG1;
        String strM;
        this.a = gc40Var;
        boolean z = gc40Var instanceof ec40;
        if (z) {
            lik1VarI = cfm0.i("spotify:internal:parental-control:blocking:artist:", ((ec40) gc40Var).a, nik1.r0);
        } else {
            if (!(gc40Var instanceof fc40)) {
                eg.o();
                throw null;
            }
            lik1VarI = cfm0.i("spotify:internal:parental-control:blocking:track:", ((fc40) gc40Var).a, nik1.s0);
        }
        this.b = lik1VarI;
        if (z) {
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            p6r0VarG1 = yon1.G1("KID_PARENTAL_BLOCKING_ARTIST", "kid-parental-blocking/artist", 900, "kid-parental-blocking");
        } else {
            if (!(gc40Var instanceof fc40)) {
                eg.o();
                throw null;
            }
            AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
            p6r0VarG1 = yon1.G1("KID_PARENTAL_BLOCKING_TRACK", "kid-parental-blocking/track", 901, "kid-parental-blocking");
        }
        this.c = p6r0VarG1;
        if (z) {
            strM = l1d.m("spotify:artist:", ((ec40) gc40Var).a);
        } else {
            if (!(gc40Var instanceof fc40)) {
                eg.o();
                throw null;
            }
            strM = l1d.m("spotify:track:", ((fc40) gc40Var).a);
        }
        this.d = strM;
    }

    public final n6r0 a() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hc40) && u890.j(this.a, ((hc40) obj).a);
    }

    public final lik1 getViewUri() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
