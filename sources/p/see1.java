package p;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class see1 extends u9 {
    public static final Parcelable.Creator<see1> CREATOR = new jrn1((byte) 25);
    public int X;
    public String Y;
    public JSONObject Z;
    public float a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public String i;
    public int t;

    public see1(float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, String str, int i8, int i9, String str2) {
        this.a = f;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = str;
        this.t = i8;
        this.X = i9;
        this.Y = str2;
        if (str2 == null) {
            this.Z = null;
            return;
        }
        try {
            this.Z = new JSONObject(this.Y);
        } catch (JSONException unused) {
            this.Z = null;
            this.Y = null;
        }
    }

    public static final int j(String str) {
        if (str != null && str.length() == 9 && str.charAt(0) == '#') {
            try {
                return Color.argb(Integer.parseInt(str.substring(7, 9), 16), Integer.parseInt(str.substring(1, 3), 16), Integer.parseInt(str.substring(3, 5), 16), Integer.parseInt(str.substring(5, 7), 16));
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof see1)) {
            return false;
        }
        see1 see1Var = (see1) obj;
        JSONObject jSONObject = this.Z;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = see1Var.Z;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || oha0.a(jSONObject, jSONObject2)) && this.a == see1Var.a && this.b == see1Var.b && this.c == see1Var.c && this.d == see1Var.d && this.e == see1Var.e && this.f == see1Var.f && this.g == see1Var.g && this.h == see1Var.h && o4e.c(this.i, see1Var.i) && this.t == see1Var.t && this.X == see1Var.X;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h), this.i, Integer.valueOf(this.t), Integer.valueOf(this.X), String.valueOf(this.Z)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.Z;
        this.Y = jSONObject == null ? null : jSONObject.toString();
        int iL = j541.L(20293, parcel);
        float f = this.a;
        j541.K(parcel, 2, 4);
        parcel.writeFloat(f);
        int i2 = this.b;
        j541.K(parcel, 3, 4);
        parcel.writeInt(i2);
        int i3 = this.c;
        j541.K(parcel, 4, 4);
        parcel.writeInt(i3);
        int i4 = this.d;
        j541.K(parcel, 5, 4);
        parcel.writeInt(i4);
        int i5 = this.e;
        j541.K(parcel, 6, 4);
        parcel.writeInt(i5);
        int i6 = this.f;
        j541.K(parcel, 7, 4);
        parcel.writeInt(i6);
        int i7 = this.g;
        j541.K(parcel, 8, 4);
        parcel.writeInt(i7);
        int i8 = this.h;
        j541.K(parcel, 9, 4);
        parcel.writeInt(i8);
        j541.F(parcel, 10, this.i);
        int i9 = this.t;
        j541.K(parcel, 11, 4);
        parcel.writeInt(i9);
        int i10 = this.X;
        j541.K(parcel, 12, 4);
        parcel.writeInt(i10);
        j541.F(parcel, 13, this.Y);
        j541.M(iL, parcel);
    }
}
