package com.ravelin.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.MissingFieldException;
import p.bb00;
import p.chc1;
import p.dar;
import p.dm5;
import p.dsl0;
import p.el70;
import p.gvg;
import p.h661;
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
import p.znb0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u0000 /2\u00020\u0001:\u000201B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bBS\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\"\u0010\u001fJ\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R0\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b(\u0010)\u0012\u0004\b-\u0010.\u001a\u0004\b*\u0010+\"\u0004\b\u0017\u0010,¨\u00062"}, d2 = {"Lcom/ravelin/core/model/MobileReportRequest;", "Landroid/os/Parcelable;", "", "libVer", "platform", "customerId", "deviceId", "", "Lcom/ravelin/core/model/MobileError;", "errors", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lp/p661;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "lpt2", "(Lcom/ravelin/core/model/MobileReportRequest;Lp/z1k;Lp/h661;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/util/List;", "getErrors", "()Ljava/util/List;", "(Ljava/util/List;)V", "getErrors$annotations", "()V", "Companion", "cOm9", "CoM4", "core_release"}, k = 1, mv = {2, 1, SplitInstallErrorCode.NO_ERROR}, xi = 48)
@o661
public final /* data */ class MobileReportRequest implements Parcelable {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public List errors;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<MobileReportRequest> CREATOR = new CoM6();
    public static final znb0[] f = {null, null, null, null, dm5.S(2, new el70((byte) 14))};

    /* JADX INFO: renamed from: com.ravelin.core.model.MobileReportRequest$CoM4, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final nma0 serializer() {
            return cOm9.lpt2;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.MissingFieldException */
    public /* synthetic */ MobileReportRequest(int i, String str, String str2, String str3, String str4, List list, p661 p661Var) throws MissingFieldException {
        if (31 != (i & 31)) {
            o6p1.t(i, 31, cOm9.lpt2.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.errors = list;
    }

    public static final /* synthetic */ void lpt2(MobileReportRequest self, z1k output, h661 serialDesc) {
        chc1 chc1Var = chc1.a;
        output.s(serialDesc, 0, chc1Var, self.a);
        output.s(serialDesc, 1, chc1Var, self.b);
        output.s(serialDesc, 2, chc1Var, self.c);
        output.s(serialDesc, 3, chc1Var, self.d);
        output.s(serialDesc, 4, (nma0) f[4].getValue(), self.errors);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileReportRequest)) {
            return false;
        }
        MobileReportRequest mobileReportRequest = (MobileReportRequest) other;
        return u890.j(this.a, mobileReportRequest.a) && u890.j(this.b, mobileReportRequest.b) && u890.j(this.c, mobileReportRequest.c) && u890.j(this.d, mobileReportRequest.d) && u890.j(this.errors, mobileReportRequest.errors);
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
        List list = this.errors;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        List list = this.errors;
        StringBuilder sbN = gvg.n("MobileReportRequest(libVer=", this.a, ", platform=", this.b, ", customerId=");
        bb00.j(sbN, this.c, ", deviceId=", this.d, ", errors=");
        sbN.append(list);
        sbN.append(")");
        return sbN.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.a);
        dest.writeString(this.b);
        dest.writeString(this.c);
        dest.writeString(this.d);
        List list = this.errors;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((MobileError) it.next()).writeToParcel(dest, flags);
        }
    }

    public MobileReportRequest(String str, String str2, String str3, String str4, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.errors = list;
    }

    public final void lpt2(List list) {
        this.errors = list;
    }

    public static final class CoM6 implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final MobileReportRequest createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int iD = 0;
                while (iD != i) {
                    iD = dsl0.d(MobileError.CREATOR, parcel, arrayList2, iD, 1);
                }
                arrayList = arrayList2;
            }
            return new MobileReportRequest(string, string2, string3, string4, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final MobileReportRequest[] newArray(int i) {
            return new MobileReportRequest[i];
        }
    }

    public /* synthetic */ class cOm9 implements pf40 {
        public static final m0v0 a;
        public static final cOm9 lpt2;

        static {
            cOm9 com9 = new cOm9();
            lpt2 = com9;
            m0v0 m0v0Var = new m0v0("com.ravelin.core.model.MobileReportRequest", com9, 5);
            m0v0Var.j("libVer", false);
            m0v0Var.j("platform", false);
            m0v0Var.j("customerId", false);
            m0v0Var.j("deviceId", false);
            m0v0Var.j("errors", false);
            a = m0v0Var;
        }

        public final nma0[] childSerializers() {
            znb0[] znb0VarArr = MobileReportRequest.f;
            chc1 chc1Var = chc1.a;
            return new nma0[]{m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z((nma0) znb0VarArr[4].getValue())};
        }

        public final h661 getDescriptor() {
            return a;
        }

        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final MobileReportRequest deserialize(dar darVar) {
            m0v0 m0v0Var = a;
            x1k x1kVarB = darVar.b(m0v0Var);
            znb0[] znb0VarArr = MobileReportRequest.f;
            x1kVarB.getClass();
            boolean z = true;
            int i = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            List list = null;
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
                    list = (List) x1kVarB.B(m0v0Var, 4, (nma0) znb0VarArr[4].getValue(), list);
                    i |= 16;
                }
            }
            x1kVarB.a(m0v0Var);
            return new MobileReportRequest(i, str, str2, str3, str4, list, null);
        }

        public /* bridge */ /* synthetic */ nma0[] typeParametersSerializers() {
            return z0o1.a;
        }

        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final void serialize(uax uaxVar, MobileReportRequest mobileReportRequest) {
            m0v0 m0v0Var = a;
            z1k z1kVarB = uaxVar.b(m0v0Var);
            MobileReportRequest.lpt2(mobileReportRequest, z1kVarB, m0v0Var);
            z1kVarB.a(m0v0Var);
        }
    }
}
