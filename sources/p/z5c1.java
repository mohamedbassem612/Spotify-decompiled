package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.wrapped.v1.proto.Paragraph;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z5c1 implements Parcelable {
    public static final Parcelable.Creator<z5c1> CREATOR = new yub1(26);
    public final String a;
    public final Paragraph b;
    public final Paragraph c;
    public final int d;
    public final p5c1 e;
    public final p5c1 f;
    public final ff g;
    public final String h;
    public final x5c1 i;

    public z5c1(String str, Paragraph paragraph, Paragraph paragraph2, int i, p5c1 p5c1Var, p5c1 p5c1Var2, ff ffVar, String str2, x5c1 x5c1Var) {
        this.a = str;
        this.b = paragraph;
        this.c = paragraph2;
        this.d = i;
        this.e = p5c1Var;
        this.f = p5c1Var2;
        this.g = ffVar;
        this.h = str2;
        this.i = x5c1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5c1)) {
            return false;
        }
        z5c1 z5c1Var = (z5c1) obj;
        return u890.j(this.a, z5c1Var.a) && u890.j(this.b, z5c1Var.b) && u890.j(this.c, z5c1Var.c) && this.d == z5c1Var.d && u890.j(this.e, z5c1Var.e) && u890.j(this.f, z5c1Var.f) && u890.j(this.g, z5c1Var.g) && u890.j(this.h, z5c1Var.h) && u890.j(this.i, z5c1Var.i);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + ((this.e.hashCode() + ab80.k(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31)) * 31)) * 31;
        ff ffVar = this.g;
        return this.i.hashCode() + cy30.d((iHashCode + (ffVar == null ? 0 : ffVar.hashCode())) * 31, 31, this.h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        yor0 yor0Var = yor0.c;
        yor0Var.u(this.b, parcel);
        yor0Var.u(this.c, parcel);
        int i2 = this.d;
        if (i2 == 1) {
            str = "NONE";
        } else if (i2 == 2) {
            str = "PARTIAL";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "COMPLETE";
        }
        parcel.writeString(str);
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.f, i);
        ff ffVar = this.g;
        if (ffVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ffVar.writeToParcel(parcel, i);
        }
        parcel.writeString(this.h);
        this.i.writeToParcel(parcel, i);
    }
}
