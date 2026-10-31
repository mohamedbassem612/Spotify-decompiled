package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p.j541;
import p.k8p1;
import p.kio1;
import p.l1d;
import p.lbo1;
import p.u9;
import p.w2o1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class ConnectionConfiguration extends u9 implements ReflectedParcelable {
    public static final Parcelable.Creator<ConnectionConfiguration> CREATOR = new w2o1((byte) 16);
    public final boolean N0;
    public final kio1 O0;
    public final boolean P0;
    public final lbo1 Q0;
    public final int R0;
    public final int S0;
    public final boolean T0;
    public final int X;
    public final List Y;
    public final boolean Z;
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public volatile String g;
    public final boolean h;
    public final String i;
    public final String t;

    public ConnectionConfiguration(String str, String str2, int i, int i2, boolean z, boolean z2, String str3, boolean z3, String str4, String str5, int i3, ArrayList arrayList, boolean z4, boolean z5, kio1 kio1Var, boolean z6, lbo1 lbo1Var, int i4, int i5, boolean z7) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = z2;
        this.g = str3;
        this.h = z3;
        this.i = str4;
        this.t = str5;
        this.X = i3;
        this.Y = arrayList;
        this.Z = z4;
        this.N0 = z5;
        this.O0 = kio1Var;
        this.P0 = z6;
        this.Q0 = lbo1Var;
        this.R0 = i4;
        this.S0 = i5;
        this.T0 = z7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ConnectionConfiguration)) {
            return false;
        }
        ConnectionConfiguration connectionConfiguration = (ConnectionConfiguration) obj;
        return k8p1.h(this.a, connectionConfiguration.a) && k8p1.h(this.b, connectionConfiguration.b) && k8p1.h(Integer.valueOf(this.c), Integer.valueOf(connectionConfiguration.c)) && k8p1.h(Integer.valueOf(this.d), Integer.valueOf(connectionConfiguration.d)) && k8p1.h(Boolean.valueOf(this.e), Boolean.valueOf(connectionConfiguration.e)) && k8p1.h(Boolean.valueOf(this.h), Boolean.valueOf(connectionConfiguration.h)) && k8p1.h(Boolean.valueOf(this.Z), Boolean.valueOf(connectionConfiguration.Z)) && k8p1.h(Boolean.valueOf(this.N0), Boolean.valueOf(connectionConfiguration.N0));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d), Boolean.valueOf(this.e), Boolean.valueOf(this.h), Boolean.valueOf(this.Z), Boolean.valueOf(this.N0)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConnectionConfiguration[ Name=");
        sb.append(this.a);
        sb.append(", Address=");
        String str = this.b;
        String strConcat = "{invalid address}";
        if (str != null && str.length() == 17) {
            strConcat = "XX:XX:XX:XX:".concat(str.substring(12));
        }
        sb.append(strConcat);
        sb.append(", Type=");
        sb.append(this.c);
        sb.append(", Role=");
        sb.append(this.d);
        sb.append(", Enabled=");
        sb.append(this.e);
        sb.append(", IsConnected=");
        sb.append(this.f);
        sb.append(", PeerNodeId=");
        sb.append(this.g);
        sb.append(", BtlePriority=");
        sb.append(this.h);
        sb.append(", NodeId=");
        sb.append(this.i);
        sb.append(", PackageName=");
        sb.append(this.t);
        sb.append(", ConnectionRetryStrategy=");
        sb.append(this.X);
        sb.append(", allowedConfigPackages=");
        sb.append(this.Y);
        sb.append(", Migrating=");
        sb.append(this.Z);
        sb.append(", DataItemSyncEnabled=");
        sb.append(this.N0);
        sb.append(", ConnectionRestrictions=");
        sb.append(this.O0);
        sb.append(", removeConnectionWhenBondRemovedByUser=");
        sb.append(this.P0);
        sb.append(", maxSupportedRemoteAndroidSdkVersion=");
        sb.append(this.R0);
        sb.append(", runtimeType=");
        sb.append(this.S0);
        sb.append(", skipConnectingIfDeviceNotBonded=");
        return l1d.r(sb, this.T0, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iL = j541.L(20293, parcel);
        j541.F(parcel, 2, str);
        j541.F(parcel, 3, this.b);
        int i2 = this.c;
        j541.K(parcel, 4, 4);
        parcel.writeInt(i2);
        int i3 = this.d;
        j541.K(parcel, 5, 4);
        parcel.writeInt(i3);
        boolean z = this.e;
        j541.K(parcel, 6, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f;
        j541.K(parcel, 7, 4);
        parcel.writeInt(z2 ? 1 : 0);
        j541.F(parcel, 8, this.g);
        boolean z3 = this.h;
        j541.K(parcel, 9, 4);
        parcel.writeInt(z3 ? 1 : 0);
        j541.F(parcel, 10, this.i);
        j541.F(parcel, 11, this.t);
        int i4 = this.X;
        j541.K(parcel, 12, 4);
        parcel.writeInt(i4);
        j541.H(parcel, 13, this.Y);
        boolean z4 = this.Z;
        j541.K(parcel, 14, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z5 = this.N0;
        j541.K(parcel, 15, 4);
        parcel.writeInt(z5 ? 1 : 0);
        j541.E(parcel, 16, this.O0, i);
        boolean z6 = this.P0;
        j541.K(parcel, 17, 4);
        parcel.writeInt(z6 ? 1 : 0);
        j541.E(parcel, 18, this.Q0, i);
        int i5 = this.R0;
        j541.K(parcel, 19, 4);
        parcel.writeInt(i5);
        int i6 = this.S0;
        j541.K(parcel, 20, 4);
        parcel.writeInt(i6);
        boolean z7 = this.T0;
        j541.K(parcel, 21, 4);
        parcel.writeInt(z7 ? 1 : 0);
        j541.M(iL, parcel);
    }
}
