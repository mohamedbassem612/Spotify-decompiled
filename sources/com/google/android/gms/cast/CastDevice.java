package com.google.android.gms.cast;

import android.net.Network;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import p.aqo1;
import p.gvg;
import p.hmo1;
import p.ho41;
import p.j541;
import p.kbn1;
import p.o4e;
import p.u9;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class CastDevice extends u9 implements ReflectedParcelable {
    public static final Parcelable.Creator<CastDevice> CREATOR = new hmo1((byte) 21);
    public final String N0;
    public final byte[] O0;
    public final String P0;
    public final boolean Q0;
    public final kbn1 R0;
    public final Integer S0;
    public final Boolean T0;
    public final Network U0;
    public final String X;
    public final String Y;
    public final int Z;
    public final String a;
    public final String b;
    public final InetAddress c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final List h;
    public final ho41 i;
    public final int t;

    public CastDevice(String str, String str2, String str3, String str4, String str5, int i, ArrayList arrayList, int i2, int i3, String str6, String str7, int i4, String str8, byte[] bArr, String str9, boolean z, kbn1 kbn1Var, Integer num, Boolean bool, Network network) {
        this.a = str == null ? "" : str;
        str2 = str2 == null ? "" : str2;
        this.b = str2;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.c = InetAddress.getByName(str2);
            } catch (UnknownHostException e) {
                new StringBuilder(this.b.length() + 48 + String.valueOf(e.getMessage()).length());
            }
        }
        this.d = str3 == null ? "" : str3;
        this.e = str4 == null ? "" : str4;
        this.f = str5 == null ? "" : str5;
        this.g = i;
        this.h = arrayList == null ? new ArrayList() : arrayList;
        this.t = i3;
        this.X = str6 == null ? "" : str6;
        this.Y = str7;
        this.Z = i4;
        this.N0 = str8;
        this.O0 = bArr;
        this.P0 = str9;
        this.Q0 = z;
        this.R0 = kbn1Var;
        this.S0 = num;
        this.T0 = bool;
        this.U0 = network;
        this.i = new ho41(i2);
    }

    public static CastDevice F(Bundle bundle) {
        ClassLoader classLoader;
        if (bundle == null || (classLoader = CastDevice.class.getClassLoader()) == null) {
            return null;
        }
        bundle.setClassLoader(classLoader);
        return (CastDevice) bundle.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE");
    }

    public final kbn1 a0() {
        kbn1 kbn1Var = this.R0;
        return (kbn1Var == null && this.i.i()) ? aqo1.C() : kbn1Var;
    }

    public final int c0() {
        ho41 ho41Var = this.i;
        if (ho41Var.c(64)) {
            return 4;
        }
        if (ho41Var.d()) {
            return 3;
        }
        if (ho41Var.i()) {
            return 5;
        }
        return ho41Var.c(1) ? 2 : 1;
    }

    public final boolean d0() {
        Boolean bool = this.T0;
        if (bool != null) {
            return bool.booleanValue();
        }
        int i = this.t;
        return i != -1 && (i & 2) > 0;
    }

    public final boolean equals(Object obj) {
        int i;
        byte[] bArr;
        if (obj != this) {
            if (obj instanceof CastDevice) {
                CastDevice castDevice = (CastDevice) obj;
                byte[] bArr2 = castDevice.O0;
                int i2 = castDevice.g;
                String str = castDevice.f;
                if (o4e.c(this.a, castDevice.a) && o4e.c(this.c, castDevice.c) && o4e.c(this.e, castDevice.e) && o4e.c(this.d, castDevice.d)) {
                    String str2 = this.f;
                    if (o4e.c(str2, str) && (i = this.g) == i2 && o4e.c(this.h, castDevice.h) && this.i.a() == castDevice.i.a() && this.t == castDevice.t && o4e.c(this.X, castDevice.X) && o4e.c(Integer.valueOf(this.Z), Integer.valueOf(castDevice.Z)) && o4e.c(this.N0, castDevice.N0) && o4e.c(this.Y, castDevice.Y) && o4e.c(str2, str) && i == i2 && ((((bArr = this.O0) == null && bArr2 == null) || Arrays.equals(bArr, bArr2)) && o4e.c(this.P0, castDevice.P0) && this.Q0 == castDevice.Q0 && o4e.c(a0(), castDevice.a0()))) {
                        if (o4e.c(Boolean.valueOf(d0()), Boolean.valueOf(castDevice.d0() && o4e.c(this.U0, castDevice.U0)))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String j() {
        String str = this.a;
        return str.startsWith("__cast_nearby__") ? str.substring(16) : str;
    }

    public final String toString() {
        String strConcat;
        ho41 ho41Var = this.i;
        if (ho41Var.c(64)) {
            strConcat = "[dynamic group]";
        } else if (ho41Var.d()) {
            strConcat = "[static group]";
        } else {
            strConcat = ho41Var.i() ? "[speaker pair]" : "";
        }
        if (ho41Var.c(262144)) {
            strConcat = strConcat.concat("[cast connect]");
        }
        Locale locale = Locale.ROOT;
        Pattern pattern = o4e.a;
        String str = this.d;
        if (!TextUtils.isEmpty(str)) {
            int length = str.length();
            if (length <= 2) {
                str = length == 2 ? "xx" : "x";
            } else {
                str = String.format(locale, "%c%d%c", Character.valueOf(str.charAt(0)), Integer.valueOf(length - 2), Character.valueOf(str.charAt(length - 1)));
            }
        }
        StringBuilder sbN = gvg.n("\"", str, "\" (", this.a, ") ");
        sbN.append(strConcat);
        return sbN.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = j541.j(parcel);
        j541.F(parcel, 2, this.a);
        j541.F(parcel, 3, this.b);
        j541.F(parcel, 4, this.d);
        j541.F(parcel, 5, this.e);
        j541.F(parcel, 6, this.f);
        j541.z(parcel, 7, this.g);
        j541.J(parcel, 8, Collections.unmodifiableList(this.h));
        j541.z(parcel, 9, this.i.a());
        j541.z(parcel, 10, this.t);
        j541.F(parcel, 11, this.X);
        j541.F(parcel, 12, this.Y);
        j541.z(parcel, 13, this.Z);
        j541.F(parcel, 14, this.N0);
        j541.v(parcel, 15, this.O0);
        j541.F(parcel, 16, this.P0);
        j541.s(parcel, 17, this.Q0);
        j541.E(parcel, 18, a0(), i);
        j541.B(parcel, 19, this.S0);
        j541.t(parcel, 20, Boolean.valueOf(d0()));
        j541.E(parcel, 21, this.U0, i);
        j541.n(iJ, parcel);
    }
}
