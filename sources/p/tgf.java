package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tgf implements Parcelable {
    public static final Parcelable.Creator<tgf> CREATOR = new zbf((byte) 13);
    public final String a;
    public final sgf b;
    public final String c;
    public final String d;
    public final t7q0 e;
    public final jqf f;
    public final boolean g;

    public /* synthetic */ tgf(String str, sgf sgfVar, String str2, String str3, t7q0 t7q0Var, jqf jqfVar, int i) {
        this(str, sgfVar, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : t7q0Var, (i & 32) != 0 ? jqf.a : jqfVar, (i & 64) == 0);
    }

    public final String a() {
        return this.c;
    }

    public final boolean b() {
        return this.g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tgf)) {
            return false;
        }
        tgf tgfVar = (tgf) obj;
        return u890.j(this.a, tgfVar.a) && u890.j(this.b, tgfVar.b) && u890.j(this.c, tgfVar.c) && u890.j(this.d, tgfVar.d) && u890.j(this.e, tgfVar.e) && this.f == tgfVar.f && this.g == tgfVar.g;
    }

    public final int hashCode() {
        int iD = cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        t7q0 t7q0Var = this.e;
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + ((iHashCode + (t7q0Var != null ? t7q0Var.hashCode() : 0)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeParcelable(this.e, i);
        parcel.writeString(this.f.name());
        parcel.writeInt(this.g ? 1 : 0);
    }

    public tgf(String str, sgf sgfVar, String str2, String str3, t7q0 t7q0Var, jqf jqfVar, boolean z) {
        this.a = str;
        this.b = sgfVar;
        this.c = str2;
        this.d = str3;
        this.e = t7q0Var;
        this.f = jqfVar;
        this.g = z;
    }
}
