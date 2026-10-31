package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class crf1 implements Parcelable {
    public static final Parcelable.Creator<crf1> CREATOR = new r8f1(16);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final xxh f;
    public final d761 g;
    public final String h;

    public crf1(String str, String str2, String str3, String str4, String str5, xxh xxhVar, d761 d761Var, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = xxhVar;
        this.g = d761Var;
        this.h = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof crf1)) {
            return false;
        }
        crf1 crf1Var = (crf1) obj;
        return u890.j(this.a, crf1Var.a) && u890.j(this.b, crf1Var.b) && u890.j(this.c, crf1Var.c) && u890.j(this.d, crf1Var.d) && u890.j(this.e, crf1Var.e) && u890.j(this.f, crf1Var.f) && u890.j(this.g, crf1Var.g) && u890.j(this.h, crf1Var.h);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31;
        d761 d761Var = this.g;
        return this.h.hashCode() + ((iHashCode + (d761Var == null ? 0 : Arrays.hashCode(d761Var.a))) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeParcelable(this.f, i);
        parcel.writeParcelable(this.g, i);
        parcel.writeString(this.h);
    }
}
