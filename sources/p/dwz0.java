package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dwz0 extends fwz0 {
    public static final Parcelable.Creator<dwz0> CREATOR = new erz0((byte) 7);
    public final String a;
    public final String b;
    public final g4a c;

    public dwz0(String str, String str2, g4a g4aVar) {
        this.a = str;
        this.b = str2;
        this.c = g4aVar;
    }

    public static dwz0 b(dwz0 dwz0Var, g4a g4aVar) {
        String str = dwz0Var.a;
        String str2 = dwz0Var.b;
        dwz0Var.getClass();
        return new dwz0(str, str2, g4aVar);
    }

    @Override // p.fwz0
    public final g4a a() {
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
        if (!(obj instanceof dwz0)) {
            return false;
        }
        dwz0 dwz0Var = (dwz0) obj;
        return u890.j(this.a, dwz0Var.a) && u890.j(this.b, dwz0Var.b) && this.c == dwz0Var.c;
    }

    @Override // p.fwz0
    public final String getUri() {
        return this.b;
    }

    @Override // p.fwz0
    public final String getUuid() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c.name());
    }
}
