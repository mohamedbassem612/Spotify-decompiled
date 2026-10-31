package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ok71 extends qk71 {
    public static final Parcelable.Creator<ok71> CREATOR = new ff71((byte) 15);
    public final c380 a;
    public final ela1 b;
    public final hl71 c;
    public final te71 d;
    public final boolean e;
    public final Boolean f;

    public ok71(c380 c380Var, ela1 ela1Var, hl71 hl71Var, te71 te71Var, boolean z, Boolean bool) {
        this.a = c380Var;
        this.b = ela1Var;
        this.c = hl71Var;
        this.d = te71Var;
        this.e = z;
        this.f = bool;
    }

    public static ok71 a(ok71 ok71Var, c9 c9Var, hl71 hl71Var, te71 te71Var, Boolean bool, int i) {
        if ((i & 1) != 0) {
            c9Var = ok71Var.a;
        }
        c9 c9Var2 = c9Var;
        ela1 ela1Var = ok71Var.b;
        if ((i & 4) != 0) {
            hl71Var = ok71Var.c;
        }
        hl71 hl71Var2 = hl71Var;
        if ((i & 8) != 0) {
            te71Var = ok71Var.d;
        }
        te71 te71Var2 = te71Var;
        boolean z = (i & 16) != 0 ? ok71Var.e : true;
        if ((i & 32) != 0) {
            bool = ok71Var.f;
        }
        return new ok71(c9Var2, ela1Var, hl71Var2, te71Var2, z, bool);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ok71)) {
            return false;
        }
        ok71 ok71Var = (ok71) obj;
        return u890.j(this.a, ok71Var.a) && u890.j(this.b, ok71Var.b) && u890.j(this.c, ok71Var.c) && u890.j(this.d, ok71Var.d) && this.e == ok71Var.e && u890.j(this.f, ok71Var.f);
    }

    public final int hashCode() {
        int iG = xcg1.g((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e);
        Boolean bool = this.f;
        return iG + (bool == null ? 0 : bool.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itL = x0d.l(this.a, parcel);
        while (itL.hasNext()) {
            parcel.writeParcelable((Parcelable) itL.next(), i);
        }
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeInt(this.e ? 1 : 0);
        Boolean bool = this.f;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            i3a.m(parcel, 1, bool);
        }
    }
}
