package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tr3 implements Parcelable {
    public static final Parcelable.Creator<tr3> CREATOR = new i93((byte) 11);
    public final List a;
    public final sxc0 b;
    public final w7c0 c;
    public final boolean d;

    public tr3(List list, sxc0 sxc0Var, w7c0 w7c0Var, boolean z) {
        this.a = list;
        this.b = sxc0Var;
        this.c = w7c0Var;
        this.d = z;
    }

    public static tr3 b(tr3 tr3Var, List list, sxc0 sxc0Var, w7c0 w7c0Var, boolean z, int i) {
        if ((i & 1) != 0) {
            list = tr3Var.a;
        }
        if ((i & 2) != 0) {
            sxc0Var = tr3Var.b;
        }
        if ((i & 4) != 0) {
            w7c0Var = tr3Var.c;
        }
        if ((i & 8) != 0) {
            z = tr3Var.d;
        }
        tr3Var.getClass();
        return new tr3(list, sxc0Var, w7c0Var, z);
    }

    public final mml a() {
        return this.b.a.e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tr3)) {
            return false;
        }
        tr3 tr3Var = (tr3) obj;
        return this.a.equals(tr3Var.a) && u890.j(this.b, tr3Var.b) && u890.j(this.c, tr3Var.c) && this.d == tr3Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cy30.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM = kk0.m(parcel, this.a);
        while (itM.hasNext()) {
            parcel.writeString(((dia1) itM.next()).name());
        }
        this.b.writeToParcel(parcel, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
