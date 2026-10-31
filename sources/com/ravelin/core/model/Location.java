package com.ravelin.core.model;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.MissingFieldException;
import p.bb00;
import p.chc1;
import p.dar;
import p.gpb;
import p.gvg;
import p.h661;
import p.i3a;
import p.m0v0;
import p.m5n1;
import p.mb4;
import p.n9v;
import p.nma0;
import p.o661;
import p.o6p1;
import p.p661;
import p.pf40;
import p.u890;
import p.uax;
import p.x1k;
import p.z0o1;
import p.z1k;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0Bk\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB\u0013\b\u0017\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u000e\u0010\u0012B\u007f\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u000e\u0010\u0017J'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010#\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0013¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0013¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b)\u0010&J\u001a\u0010,\u001a\u00020\f2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-¨\u00061"}, d2 = {"Lcom/ravelin/core/model/Location;", "Landroid/os/Parcelable;", "", "accuracy", "altitude", "bearing", "elapsedRealtimeNanos", "latitude", "longitude", "provider", "speed", "time", "", "isMockLocation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "Landroid/location/Location;", "androidLocation", "(Landroid/location/Location;)V", "", "seen0", "Lp/p661;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "lpt2", "(Lcom/ravelin/core/model/Location;Lp/z1k;Lp/h661;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Companion", "cOm9", "CoM4", "core_release"}, k = 1, mv = {2, 1, SplitInstallErrorCode.NO_ERROR}, xi = 48)
@o661
public final /* data */ class Location implements Parcelable {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final Boolean t;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<Location> CREATOR = new CoM6();

    /* JADX INFO: renamed from: com.ravelin.core.model.Location$CoM4, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final nma0 serializer() {
            return cOm9.lpt2;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Location(android.location.Location location) {
        Boolean boolValueOf = null;
        String strValueOf = String.valueOf(location != null ? Float.valueOf(location.getAccuracy()) : null);
        String strValueOf2 = String.valueOf(location != null ? Double.valueOf(location.getAltitude()) : null);
        String strValueOf3 = String.valueOf(location != null ? Float.valueOf(location.getBearing()) : null);
        String strValueOf4 = String.valueOf(location != null ? Long.valueOf(location.getElapsedRealtimeNanos()) : null);
        String strValueOf5 = String.valueOf(location != null ? Double.valueOf(location.getLatitude()) : null);
        String strValueOf6 = String.valueOf(location != null ? Double.valueOf(location.getLongitude()) : null);
        String strValueOf7 = String.valueOf(location != null ? location.getProvider() : null);
        String strValueOf8 = String.valueOf(location != null ? Float.valueOf(location.getSpeed()) : null);
        String strValueOf9 = String.valueOf(location != null ? Long.valueOf(location.getTime()) : null);
        if (location != null) {
            boolValueOf = Boolean.valueOf(Build.VERSION.SDK_INT >= 31 ? mb4.x(location) : location.isFromMockProvider());
        }
        this(strValueOf, strValueOf2, strValueOf3, strValueOf4, strValueOf5, strValueOf6, strValueOf7, strValueOf8, strValueOf9, boolValueOf);
    }

    public static final /* synthetic */ void lpt2(Location self, z1k output, h661 serialDesc) {
        chc1 chc1Var = chc1.a;
        output.s(serialDesc, 0, chc1Var, self.a);
        output.s(serialDesc, 1, chc1Var, self.b);
        output.s(serialDesc, 2, chc1Var, self.c);
        output.s(serialDesc, 3, chc1Var, self.d);
        output.s(serialDesc, 4, chc1Var, self.e);
        output.s(serialDesc, 5, chc1Var, self.f);
        output.s(serialDesc, 6, chc1Var, self.g);
        output.s(serialDesc, 7, chc1Var, self.h);
        output.s(serialDesc, 8, chc1Var, self.i);
        output.s(serialDesc, 9, gpb.a, self.t);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Location)) {
            return false;
        }
        Location location = (Location) other;
        return u890.j(this.a, location.a) && u890.j(this.b, location.b) && u890.j(this.c, location.c) && u890.j(this.d, location.d) && u890.j(this.e, location.e) && u890.j(this.f, location.f) && u890.j(this.g, location.g) && u890.j(this.h, location.h) && u890.j(this.i, location.i) && u890.j(this.t, location.t);
    }

    public int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.g;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.h;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.i;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Boolean bool = this.t;
        return iHashCode9 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbN = gvg.n("Location(accuracy=", this.a, ", altitude=", this.b, ", bearing=");
        bb00.j(sbN, this.c, ", elapsedRealtimeNanos=", this.d, ", latitude=");
        bb00.j(sbN, this.e, ", longitude=", this.f, ", provider=");
        bb00.j(sbN, this.g, ", speed=", this.h, ", time=");
        sbN.append(this.i);
        sbN.append(", isMockLocation=");
        sbN.append(this.t);
        sbN.append(")");
        return sbN.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.a);
        dest.writeString(this.b);
        dest.writeString(this.c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.g);
        dest.writeString(this.h);
        dest.writeString(this.i);
        Boolean bool = this.t;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            i3a.m(dest, 1, bool);
        }
    }

    public static final class CoM6 implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final Location createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new Location(string, string2, string3, string4, string5, string6, string7, string8, string9, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final Location[] newArray(int i) {
            return new Location[i];
        }
    }

    public Location(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.t = bool;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.MissingFieldException */
    public /* synthetic */ Location(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, p661 p661Var) throws MissingFieldException {
        if (1023 != (i & 1023)) {
            o6p1.t(i, 1023, cOm9.lpt2.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.t = bool;
    }

    public /* synthetic */ class cOm9 implements pf40 {
        public static final m0v0 a;
        public static final cOm9 lpt2;

        static {
            cOm9 com9 = new cOm9();
            lpt2 = com9;
            m0v0 m0v0Var = new m0v0("com.ravelin.core.model.Location", com9, 10);
            m0v0Var.j("accuracy", false);
            m0v0Var.j("altitude", false);
            m0v0Var.j("bearing", false);
            m0v0Var.j("elapsedRealtimeNanos", false);
            m0v0Var.j("latitude", false);
            m0v0Var.j("longitude", false);
            m0v0Var.j("eventName", false);
            m0v0Var.j("speed", false);
            m0v0Var.j("time", false);
            m0v0Var.j("isMockLocation", false);
            a = m0v0Var;
        }

        public final nma0[] childSerializers() {
            chc1 chc1Var = chc1.a;
            return new nma0[]{m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(gpb.a)};
        }

        public final h661 getDescriptor() {
            return a;
        }

        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final Location deserialize(dar darVar) {
            m0v0 m0v0Var = a;
            x1k x1kVarB = darVar.b(m0v0Var);
            x1kVarB.getClass();
            Boolean bool = null;
            boolean z = true;
            String str = null;
            int i = 0;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            while (z) {
                int iP = x1kVarB.p(m0v0Var);
                switch (iP) {
                    case SplitInstallErrorCode.ACTIVE_SESSIONS_LIMIT_EXCEEDED /* -1 */:
                        z = false;
                        break;
                    case SplitInstallErrorCode.NO_ERROR /* 0 */:
                        str2 = (String) x1kVarB.B(m0v0Var, 0, chc1.a, str2);
                        i |= 1;
                        break;
                    case 1:
                        str3 = (String) x1kVarB.B(m0v0Var, 1, chc1.a, str3);
                        i |= 2;
                        break;
                    case 2:
                        str4 = (String) x1kVarB.B(m0v0Var, 2, chc1.a, str4);
                        i |= 4;
                        break;
                    case 3:
                        str5 = (String) x1kVarB.B(m0v0Var, 3, chc1.a, str5);
                        i |= 8;
                        break;
                    case 4:
                        str6 = (String) x1kVarB.B(m0v0Var, 4, chc1.a, str6);
                        i |= 16;
                        break;
                    case 5:
                        str7 = (String) x1kVarB.B(m0v0Var, 5, chc1.a, str7);
                        i |= 32;
                        break;
                    case 6:
                        str8 = (String) x1kVarB.B(m0v0Var, 6, chc1.a, str8);
                        i |= 64;
                        break;
                    case 7:
                        str9 = (String) x1kVarB.B(m0v0Var, 7, chc1.a, str9);
                        i |= 128;
                        break;
                    case 8:
                        str = (String) x1kVarB.B(m0v0Var, 8, chc1.a, str);
                        i |= 256;
                        break;
                    case 9:
                        bool = (Boolean) x1kVarB.B(m0v0Var, 9, gpb.a, bool);
                        i |= 512;
                        break;
                    default:
                        n9v.a(iP);
                        return null;
                }
            }
            x1kVarB.a(m0v0Var);
            return new Location(i, str2, str3, str4, str5, str6, str7, str8, str9, str, bool, null);
        }

        public /* bridge */ /* synthetic */ nma0[] typeParametersSerializers() {
            return z0o1.a;
        }

        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final void serialize(uax uaxVar, Location location) {
            m0v0 m0v0Var = a;
            z1k z1kVarB = uaxVar.b(m0v0Var);
            Location.lpt2(location, z1kVarB, m0v0Var);
            z1kVarB.a(m0v0Var);
        }
    }
}
