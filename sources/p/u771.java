package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class u771 implements Parcelable {
    public static final Parcelable.Creator<u771> CREATOR = new o471((byte) 28);
    public final t771 a;
    public final pz61 b;
    public final bj71 c;

    public /* synthetic */ u771(t771 t771Var, pz61 pz61Var) {
        this(t771Var, pz61Var, new bj71((Set) null, false, (String) null, 7));
    }

    public static u771 a(u771 u771Var, t771 t771Var, pz61 pz61Var, bj71 bj71Var, int i) {
        if ((i & 1) != 0) {
            t771Var = u771Var.a;
        }
        if ((i & 2) != 0) {
            pz61Var = u771Var.b;
        }
        if ((i & 4) != 0) {
            bj71Var = u771Var.c;
        }
        u771Var.getClass();
        return new u771(t771Var, pz61Var, bj71Var);
    }

    public final c871 b() {
        c871 c871VarA = this.b.a();
        if (c871VarA != null) {
            return c871VarA;
        }
        hhg1.n("No params in share format");
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u771)) {
            return false;
        }
        u771 u771Var = (u771) obj;
        return u890.j(this.a, u771Var.a) && u890.j(this.b, u771Var.b) && u890.j(this.c, u771Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        this.b.writeToParcel(parcel, i);
        this.c.writeToParcel(parcel, i);
    }

    public u771(t771 t771Var, pz61 pz61Var, bj71 bj71Var) {
        this.a = t771Var;
        this.b = pz61Var;
        this.c = bj71Var;
    }
}
