package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mqa extends nqa {
    public static final Parcelable.Creator<mqa> CREATOR = new ux9((byte) 27);
    public final int a;
    public final z771 b;
    public final ez61 c;
    public final wa71 d;
    public final String e;
    public final String f;
    public final String g;
    public final wkt h;

    public mqa(int i, z771 z771Var, ez61 ez61Var, wa71 wa71Var, String str, String str2, String str3, wkt wktVar) {
        this.a = i;
        this.b = z771Var;
        this.c = ez61Var;
        this.d = wa71Var;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = wktVar;
    }

    public static mqa n(mqa mqaVar, int i, wkt wktVar, int i2) {
        if ((i2 & 1) != 0) {
            i = mqaVar.a;
        }
        int i3 = i;
        z771 z771Var = mqaVar.b;
        ez61 ez61Var = mqaVar.c;
        wa71 wa71Var = mqaVar.d;
        String str = mqaVar.e;
        String str2 = mqaVar.f;
        String str3 = mqaVar.g;
        if ((i2 & 128) != 0) {
            wktVar = mqaVar.h;
        }
        return new mqa(i3, z771Var, ez61Var, wa71Var, str, str2, str3, wktVar);
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
        if (!(obj instanceof mqa)) {
            return false;
        }
        mqa mqaVar = (mqa) obj;
        return this.a == mqaVar.a && u890.j(this.b, mqaVar.b) && u890.j(this.c, mqaVar.c) && u890.j(this.d, mqaVar.d) && u890.j(this.e, mqaVar.e) && u890.j(this.f, mqaVar.f) && u890.j(this.g, mqaVar.g) && u890.j(this.h, mqaVar.h);
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
