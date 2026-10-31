package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kqa extends nqa {
    public static final Parcelable.Creator<kqa> CREATOR = new ux9((byte) 25);
    public final int a;
    public final z771 b;
    public final ez61 c;
    public final wa71 d;
    public final String e;
    public final String f;
    public final String g;
    public final wkt h;

    public kqa(int i, z771 z771Var, ez61 ez61Var, wa71 wa71Var, String str, String str2, String str3, wkt wktVar) {
        this.a = i;
        this.b = z771Var;
        this.c = ez61Var;
        this.d = wa71Var;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = wktVar;
    }

    public static kqa n(kqa kqaVar, int i, wkt wktVar, int i2) {
        if ((i2 & 1) != 0) {
            i = kqaVar.a;
        }
        int i3 = i;
        z771 z771Var = kqaVar.b;
        ez61 ez61Var = kqaVar.c;
        wa71 wa71Var = kqaVar.d;
        String str = kqaVar.e;
        String str2 = kqaVar.f;
        String str3 = kqaVar.g;
        if ((i2 & 128) != 0) {
            wktVar = kqaVar.h;
        }
        return new kqa(i3, z771Var, ez61Var, wa71Var, str, str2, str3, wktVar);
    }

    public final ez61 a() {
        return this.c;
    }

    public final String b() {
        return this.g;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kqa)) {
            return false;
        }
        kqa kqaVar = (kqa) obj;
        return this.a == kqaVar.a && u890.j(this.b, kqaVar.b) && u890.j(this.c, kqaVar.c) && u890.j(this.d, kqaVar.d) && u890.j(this.e, kqaVar.e) && u890.j(this.f, kqaVar.f) && u890.j(this.g, kqaVar.g) && u890.j(this.h, kqaVar.h);
    }

    public final String g() {
        return this.e;
    }

    public final String getDescription() {
        return this.f;
    }

    public final z771 h() {
        return this.b;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d((this.d.hashCode() + pze0.f(this.c, xvj1.j(this.b.a, l1d.C(this.a) * 31, 31), 31)) * 31, 31, this.e), 31, this.f);
        String str = this.g;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        wkt wktVar = this.h;
        return iHashCode + (wktVar != null ? wktVar.hashCode() : 0);
    }

    public final int j() {
        return this.a;
    }

    public final wa71 k() {
        return this.d;
    }

    public final wkt l() {
        return this.h;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(lf51.q(this.a));
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
    }
}
