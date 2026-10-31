package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Objects;
import p.bb00;
import p.c13;
import p.cx5;
import p.dx5;
import p.ex5;
import p.fx5;
import p.j541;
import p.jrn1;
import p.l1d;
import p.u9;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class AppTheme extends u9 implements ReflectedParcelable {
    public static final Parcelable.Creator<AppTheme> CREATOR = new jrn1(9);
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public fx5 f;
    public ex5 g;
    public dx5 h;
    public cx5 i;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AppTheme)) {
                return false;
            }
            AppTheme appTheme = (AppTheme) obj;
            int i = this.b;
            if (i == 0) {
                i = 1;
            }
            int i2 = appTheme.b;
            if (i2 == 0) {
                i2 = 1;
            }
            if (i != i2) {
                return false;
            }
            int i3 = this.a;
            if (i3 == 0) {
                i3 = 1;
            }
            int i4 = appTheme.a;
            if (i4 == 0) {
                i4 = 1;
            }
            if (i3 != i4) {
                return false;
            }
            int i5 = this.c;
            if (i5 == 0) {
                i5 = 1;
            }
            int i6 = appTheme.c;
            if (i6 == 0) {
                i6 = 1;
            }
            if (i5 != i6) {
                return false;
            }
            int i7 = this.d;
            if (i7 == 0) {
                i7 = 3;
            }
            int i8 = appTheme.d;
            if (i7 != (i8 != 0 ? i8 : 3) || this.e != appTheme.e || !Objects.equals(this.f, appTheme.f) || !Objects.equals(this.g, appTheme.g) || !Objects.equals(this.h, appTheme.h) || !Objects.equals(this.i, appTheme.i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = this.b;
        if (i == 0) {
            i = 1;
        }
        int i2 = i * 31;
        int i3 = this.a;
        if (i3 == 0) {
            i3 = 1;
        }
        int i4 = (i3 + i2) * 31;
        int i5 = this.c;
        int i6 = ((i5 != 0 ? i5 : 1) + i4) * 31;
        int i7 = this.d;
        if (i7 == 0) {
            i7 = 3;
        }
        return ((((((((((i7 + i6) * 31) + this.e) * 31) + Objects.hashCode(this.f)) * 31) + Objects.hashCode(this.g)) * 31) + Objects.hashCode(this.h)) * 31) + Objects.hashCode(this.i);
    }

    public final String toString() {
        int i = this.e;
        int i2 = this.a;
        if (i2 == 0) {
            i2 = 1;
        }
        int i3 = this.b;
        if (i3 == 0) {
            i3 = 1;
        }
        int i4 = this.d;
        if (i4 == 0) {
            i4 = 3;
        }
        int i5 = this.c;
        if (i5 == 0) {
            i5 = 1;
        }
        String strValueOf = String.valueOf(this.f);
        String strValueOf2 = String.valueOf(this.g);
        String strValueOf3 = String.valueOf(this.h);
        String strValueOf4 = String.valueOf(this.i);
        int length = String.valueOf(i).length();
        int length2 = String.valueOf(i2).length();
        int length3 = String.valueOf(i3).length();
        int length4 = String.valueOf(i4).length();
        int length5 = String.valueOf(i5).length();
        int length6 = strValueOf.length();
        StringBuilder sb = new StringBuilder(length + 42 + length2 + 16 + length3 + 19 + length4 + 19 + length5 + 8 + length6 + 12 + strValueOf2.length() + 15 + strValueOf3.length() + 16 + strValueOf4.length() + 1);
        c13.n(i, i2, "AppTheme {deviceExperience =", ", colorTheme =", sb);
        c13.n(i3, i4, ", dynamicColor =", ", screenItemsSize =", sb);
        sb.append(", screenAlignment =");
        sb.append(i5);
        sb.append(", icon =");
        sb.append(strValueOf);
        bb00.j(sb, ", headline =", strValueOf2, ", description =", strValueOf3);
        return l1d.q(sb, ", callToAction =", strValueOf4, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        int i2 = this.a;
        if (i2 == 0) {
            i2 = 1;
        }
        j541.K(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = this.b;
        if (i3 == 0) {
            i3 = 1;
        }
        j541.K(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = this.c;
        int i5 = i4 != 0 ? i4 : 1;
        j541.K(parcel, 3, 4);
        parcel.writeInt(i5);
        int i6 = this.d;
        int i7 = i6 != 0 ? i6 : 3;
        j541.K(parcel, 4, 4);
        parcel.writeInt(i7);
        int i8 = this.e;
        j541.K(parcel, 5, 4);
        parcel.writeInt(i8);
        j541.E(parcel, 6, this.f, i);
        j541.E(parcel, 7, this.g, i);
        j541.E(parcel, 8, this.h, i);
        j541.E(parcel, 9, this.i, i);
        j541.M(iL, parcel);
    }
}
