package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.wrapped.v1.proto.Paragraph;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rj01 implements wj01 {
    public static final Parcelable.Creator<rj01> CREATOR = new erz0((byte) 29);
    public final String X;
    public final String Y;
    public final String a;
    public final Paragraph b;
    public final String c;
    public final int d;
    public final Paragraph e;
    public final Paragraph f;
    public final Paragraph g;
    public final String h;
    public final ArrayList i;
    public final String t;

    public rj01(String str, Paragraph paragraph, String str2, int i, Paragraph paragraph2, Paragraph paragraph3, Paragraph paragraph4, String str3, ArrayList arrayList, String str4, String str5, String str6) {
        this.a = str;
        this.b = paragraph;
        this.c = str2;
        this.d = i;
        this.e = paragraph2;
        this.f = paragraph3;
        this.g = paragraph4;
        this.h = str3;
        this.i = arrayList;
        this.t = str4;
        this.X = str5;
        this.Y = str6;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rj01)) {
            return false;
        }
        rj01 rj01Var = (rj01) obj;
        return u890.j(this.a, rj01Var.a) && u890.j(this.b, rj01Var.b) && u890.j(this.c, rj01Var.c) && this.d == rj01Var.d && u890.j(this.e, rj01Var.e) && u890.j(this.f, rj01Var.f) && u890.j(this.g, rj01Var.g) && u890.j(this.h, rj01Var.h) && this.i.equals(rj01Var.i) && u890.j(this.t, rj01Var.t) && u890.j(this.X, rj01Var.X) && u890.j(this.Y, rj01Var.Y);
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ab80.k(this.d, cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31)) * 31;
        Paragraph paragraph = this.f;
        return this.Y.hashCode() + cy30.d(cy30.d(p3d1.f(this.i, cy30.d((this.g.hashCode() + ((iHashCode + (paragraph == null ? 0 : paragraph.hashCode())) * 31)) * 31, 31, this.h), 31), 31, this.t), 31, this.X);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        yor0 yor0Var = yor0.c;
        yor0Var.u(this.b, parcel);
        parcel.writeString(this.c);
        int i2 = this.d;
        if (i2 == 1) {
            str = "SQUARE";
        } else if (i2 == 2) {
            str = "CIRCLE";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "ROUNDED";
        }
        parcel.writeString(str);
        yor0Var.u(this.e, parcel);
        yor0Var.u(this.f, parcel);
        yor0Var.u(this.g, parcel);
        parcel.writeString(this.h);
        Iterator itO = xvj1.o(this.i, parcel);
        while (itO.hasNext()) {
            ((s8a) itO.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.t);
        parcel.writeString(this.X);
        parcel.writeString(this.Y);
    }
}
