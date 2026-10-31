package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ma61 implements Parcelable {
    public static final Parcelable.Creator<ma61> CREATOR = new ge51((byte) 26);
    public final stu0 a;
    public final ttu0 b;
    public final hlg1 c;
    public final Set d;
    public final k031 e;
    public final Set f;
    public final Set g;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ma61(stu0 stu0Var, ttu0 ttu0Var, int i) {
        int i2 = i & 1;
        w7x w7xVar = w7x.a;
        this(i2 != 0 ? new stu0(w7xVar) : stu0Var, (i & 2) != 0 ? new ttu0(w7xVar) : ttu0Var, new hlg1(), w7xVar, null, w7xVar, w7xVar);
    }

    public static ma61 a(ma61 ma61Var, stu0 stu0Var, ttu0 ttu0Var, hlg1 hlg1Var, Set set, k031 k031Var, Set set2, LinkedHashSet linkedHashSet, int i) {
        if ((i & 1) != 0) {
            stu0Var = ma61Var.a;
        }
        stu0 stu0Var2 = stu0Var;
        if ((i & 2) != 0) {
            ttu0Var = ma61Var.b;
        }
        ttu0 ttu0Var2 = ttu0Var;
        if ((i & 4) != 0) {
            hlg1Var = ma61Var.c;
        }
        hlg1 hlg1Var2 = hlg1Var;
        if ((i & 8) != 0) {
            set = ma61Var.d;
        }
        Set set3 = set;
        if ((i & 16) != 0) {
            k031Var = ma61Var.e;
        }
        k031 k031Var2 = k031Var;
        if ((i & 32) != 0) {
            set2 = ma61Var.f;
        }
        Set set4 = set2;
        Set set5 = linkedHashSet;
        if ((i & 64) != 0) {
            set5 = ma61Var.g;
        }
        ma61Var.getClass();
        return new ma61(stu0Var2, ttu0Var2, hlg1Var2, set3, k031Var2, set4, set5);
    }

    public final stu0 b() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ma61)) {
            return false;
        }
        ma61 ma61Var = (ma61) obj;
        return u890.j(this.a, ma61Var.a) && u890.j(this.b, ma61Var.b) && u890.j(this.c, ma61Var.c) && u890.j(this.d, ma61Var.d) && u890.j(this.e, ma61Var.e) && u890.j(this.f, ma61Var.f) && u890.j(this.g, ma61Var.g);
    }

    public final Set g() {
        return this.d;
    }

    public final boolean h() {
        if (!this.a.a.isEmpty() || !this.b.a.isEmpty()) {
            return true;
        }
        hlg1 hlg1Var = this.c;
        return (hlg1Var.a.isEmpty() && hlg1Var.b.isEmpty() && hlg1Var.d.isEmpty() && hlg1Var.e.isEmpty() && this.d.isEmpty()) ? false : true;
    }

    public final int hashCode() {
        int iC = gvg.c((this.c.hashCode() + gvg.c(this.a.a.hashCode() * 31, 31, this.b.a)) * 31, 31, this.d);
        k031 k031Var = this.e;
        return this.g.hashCode() + gvg.c((iC + (k031Var == null ? 0 : k031Var.hashCode())) * 31, 31, this.f);
    }

    public final ttu0 j() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        this.b.writeToParcel(parcel, i);
        this.c.writeToParcel(parcel, i);
        Iterator itH = k4s0.h(this.d, parcel);
        while (itH.hasNext()) {
            parcel.writeParcelable((Parcelable) itH.next(), i);
        }
        parcel.writeParcelable(this.e, i);
        Iterator itH2 = k4s0.h(this.f, parcel);
        while (itH2.hasNext()) {
            parcel.writeString((String) itH2.next());
        }
        Iterator itH3 = k4s0.h(this.g, parcel);
        while (itH3.hasNext()) {
            ((ajk1) itH3.next()).writeToParcel(parcel, i);
        }
    }

    public ma61(stu0 stu0Var, ttu0 ttu0Var, hlg1 hlg1Var, Set set, k031 k031Var, Set set2, Set set3) {
        this.a = stu0Var;
        this.b = ttu0Var;
        this.c = hlg1Var;
        this.d = set;
        this.e = k031Var;
        this.f = set2;
        this.g = set3;
    }
}
