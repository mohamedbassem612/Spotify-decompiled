package p;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mi0 extends u9 {
    public static final Parcelable.Creator<mi0> CREATOR = new agm0((byte) 18);
    public final String X;
    public final jti1 Y;
    public final String a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final long t;

    public mi0(String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, String str8, long j2, String str9, jti1 jti1Var) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.t = j2;
        this.X = str9;
        this.Y = jti1Var;
        if (TextUtils.isEmpty(str6)) {
            new JSONObject();
            return;
        }
        try {
            new JSONObject(str6);
        } catch (JSONException e) {
            Locale locale = Locale.ROOT;
            new StringBuilder("Error creating AdBreakClipInfo: ").append(e.getMessage());
            this.g = null;
            new JSONObject();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mi0)) {
            return false;
        }
        mi0 mi0Var = (mi0) obj;
        return o4e.c(this.a, mi0Var.a) && o4e.c(this.b, mi0Var.b) && this.c == mi0Var.c && o4e.c(this.d, mi0Var.d) && o4e.c(this.e, mi0Var.e) && o4e.c(this.f, mi0Var.f) && o4e.c(this.g, mi0Var.g) && o4e.c(this.h, mi0Var.h) && o4e.c(this.i, mi0Var.i) && this.t == mi0Var.t && o4e.c(this.X, mi0Var.X) && o4e.c(this.Y, mi0Var.Y);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c), this.d, this.e, this.f, this.g, this.h, this.i, Long.valueOf(this.t), this.X, this.Y});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.F(parcel, 2, this.a);
        j541.F(parcel, 3, this.b);
        j541.K(parcel, 4, 8);
        parcel.writeLong(this.c);
        j541.F(parcel, 5, this.d);
        j541.F(parcel, 6, this.e);
        j541.F(parcel, 7, this.f);
        j541.F(parcel, 8, this.g);
        j541.F(parcel, 9, this.h);
        j541.F(parcel, 10, this.i);
        j541.K(parcel, 11, 8);
        parcel.writeLong(this.t);
        j541.F(parcel, 12, this.X);
        j541.E(parcel, 13, this.Y, i);
        j541.M(iL, parcel);
    }
}
