package com.ravelin.core.model;

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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'(B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b!\u0010\u001eJ\u001a\u0010$\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lcom/ravelin/core/model/CarrierInfo;", "Landroid/os/Parcelable;", "", "carrierName", "carrierId", "simCountry", "simOperator", "", "worldPhone", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "", "seen0", "Lp/p661;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "lpt2", "(Lcom/ravelin/core/model/CarrierInfo;Lp/z1k;Lp/h661;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Companion", "cOm9", "CoM4", "core_release"}, k = 1, mv = {2, 1, SplitInstallErrorCode.NO_ERROR}, xi = 48)
@o661
public final /* data */ class CarrierInfo implements Parcelable {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Boolean e;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<CarrierInfo> CREATOR = new CoM6();

    /* JADX INFO: renamed from: com.ravelin.core.model.CarrierInfo$CoM4, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final nma0 serializer() {
            return cOm9.lpt2;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.MissingFieldException */
    public /* synthetic */ CarrierInfo(int i, String str, String str2, String str3, String str4, Boolean bool, p661 p661Var) throws MissingFieldException {
        if (31 != (i & 31)) {
            o6p1.t(i, 31, cOm9.lpt2.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = bool;
    }

    public static final /* synthetic */ void lpt2(CarrierInfo self, z1k output, h661 serialDesc) {
        chc1 chc1Var = chc1.a;
        output.s(serialDesc, 0, chc1Var, self.a);
        output.s(serialDesc, 1, chc1Var, self.b);
        output.s(serialDesc, 2, chc1Var, self.c);
        output.s(serialDesc, 3, chc1Var, self.d);
        output.s(serialDesc, 4, gpb.a, self.e);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CarrierInfo)) {
            return false;
        }
        CarrierInfo carrierInfo = (CarrierInfo) other;
        return u890.j(this.a, carrierInfo.a) && u890.j(this.b, carrierInfo.b) && u890.j(this.c, carrierInfo.c) && u890.j(this.d, carrierInfo.d) && u890.j(this.e, carrierInfo.e);
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
        Boolean bool = this.e;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbN = gvg.n("CarrierInfo(carrierName=", this.a, ", carrierId=", this.b, ", simCountry=");
        bb00.j(sbN, this.c, ", simOperator=", this.d, ", worldPhone=");
        sbN.append(this.e);
        sbN.append(")");
        return sbN.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.a);
        dest.writeString(this.b);
        dest.writeString(this.c);
        dest.writeString(this.d);
        Boolean bool = this.e;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            i3a.m(dest, 1, bool);
        }
    }

    public CarrierInfo(String str, String str2, String str3, String str4, Boolean bool) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = bool;
    }

    public static final class CoM6 implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final CarrierInfo createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CarrierInfo(string, string2, string3, string4, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final CarrierInfo[] newArray(int i) {
            return new CarrierInfo[i];
        }
    }

    public /* synthetic */ class cOm9 implements pf40 {
        public static final m0v0 a;
        public static final cOm9 lpt2;

        static {
            cOm9 com9 = new cOm9();
            lpt2 = com9;
            m0v0 m0v0Var = new m0v0("com.ravelin.core.model.CarrierInfo", com9, 5);
            m0v0Var.j("carrierName", false);
            m0v0Var.j("carrierId", false);
            m0v0Var.j("simCountry", false);
            m0v0Var.j("simOperator", false);
            m0v0Var.j("worldPhone", false);
            a = m0v0Var;
        }

        public final nma0[] childSerializers() {
            chc1 chc1Var = chc1.a;
            return new nma0[]{m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(gpb.a)};
        }

        public final h661 getDescriptor() {
            return a;
        }

        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final CarrierInfo deserialize(dar darVar) {
            m0v0 m0v0Var = a;
            x1k x1kVarB = darVar.b(m0v0Var);
            x1kVarB.getClass();
            boolean z = true;
            int i = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Boolean bool = null;
            while (z) {
                int iP = x1kVarB.p(m0v0Var);
                if (iP == -1) {
                    z = false;
                } else if (iP == 0) {
                    str = (String) x1kVarB.B(m0v0Var, 0, chc1.a, str);
                    i |= 1;
                } else if (iP == 1) {
                    str2 = (String) x1kVarB.B(m0v0Var, 1, chc1.a, str2);
                    i |= 2;
                } else if (iP == 2) {
                    str3 = (String) x1kVarB.B(m0v0Var, 2, chc1.a, str3);
                    i |= 4;
                } else if (iP == 3) {
                    str4 = (String) x1kVarB.B(m0v0Var, 3, chc1.a, str4);
                    i |= 8;
                } else {
                    if (iP != 4) {
                        n9v.a(iP);
                        return null;
                    }
                    bool = (Boolean) x1kVarB.B(m0v0Var, 4, gpb.a, bool);
                    i |= 16;
                }
            }
            x1kVarB.a(m0v0Var);
            return new CarrierInfo(i, str, str2, str3, str4, bool, null);
        }

        public /* bridge */ /* synthetic */ nma0[] typeParametersSerializers() {
            return z0o1.a;
        }

        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final void serialize(uax uaxVar, CarrierInfo carrierInfo) {
            m0v0 m0v0Var = a;
            z1k z1kVarB = uaxVar.b(m0v0Var);
            CarrierInfo.lpt2(carrierInfo, z1kVarB, m0v0Var);
            z1kVarB.a(m0v0Var);
        }
    }
}
