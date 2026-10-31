package com.ravelin.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.bb00;
import p.chc1;
import p.dar;
import p.dm5;
import p.gvg;
import p.h661;
import p.m0v0;
import p.m5n1;
import p.mf41;
import p.n9v;
import p.nma0;
import p.o661;
import p.p661;
import p.pf40;
import p.u890;
import p.uax;
import p.x1k;
import p.z0o1;
import p.z1k;
import p.znb0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0002()BI\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBS\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b!\u0010\u001eJ\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/ravelin/core/model/SharedPackages;", "Landroid/os/Parcelable;", "", "libVer", "platform", "appPackageName", "appVersion", "", "sharedAppPackages", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lp/p661;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "lpt2", "(Lcom/ravelin/core/model/SharedPackages;Lp/z1k;Lp/h661;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Companion", "cOm9", "CoM4", "core_release"}, k = 1, mv = {2, 1, SplitInstallErrorCode.NO_ERROR}, xi = 48)
@o661
public final /* data */ class SharedPackages implements Parcelable {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<SharedPackages> CREATOR = new CoM6();
    public static final znb0[] f = {null, null, null, null, dm5.S(2, new mf41((byte) 2))};

    /* JADX INFO: renamed from: com.ravelin.core.model.SharedPackages$CoM4, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final nma0 serializer() {
            return cOm9.lpt2;
        }
    }

    public /* synthetic */ SharedPackages(int i, String str, String str2, String str3, String str4, List list, p661 p661Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list;
        }
    }

    public static final /* synthetic */ void lpt2(SharedPackages self, z1k output, h661 serialDesc) {
        if (output.d0() || self.a != null) {
            output.s(serialDesc, 0, chc1.a, self.a);
        }
        if (output.d0() || self.b != null) {
            output.s(serialDesc, 1, chc1.a, self.b);
        }
        if (output.d0() || self.c != null) {
            output.s(serialDesc, 2, chc1.a, self.c);
        }
        if (output.d0() || self.d != null) {
            output.s(serialDesc, 3, chc1.a, self.d);
        }
        if (!output.d0() && self.e == null) {
            return;
        }
        output.s(serialDesc, 4, (nma0) f[4].getValue(), self.e);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SharedPackages)) {
            return false;
        }
        SharedPackages sharedPackages = (SharedPackages) other;
        return u890.j(this.a, sharedPackages.a) && u890.j(this.b, sharedPackages.b) && u890.j(this.c, sharedPackages.c) && u890.j(this.d, sharedPackages.d) && u890.j(this.e, sharedPackages.e);
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
        List list = this.e;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbN = gvg.n("SharedPackages(libVer=", this.a, ", platform=", this.b, ", appPackageName=");
        bb00.j(sbN, this.c, ", appVersion=", this.d, ", sharedAppPackages=");
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
        dest.writeStringList(this.e);
    }

    public static final class CoM6 implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final SharedPackages createFromParcel(Parcel parcel) {
            return new SharedPackages(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final SharedPackages[] newArray(int i) {
            return new SharedPackages[i];
        }
    }

    public SharedPackages(String str, String str2, String str3, String str4, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
    }

    public /* synthetic */ class cOm9 implements pf40 {
        public static final m0v0 a;
        public static final cOm9 lpt2;

        static {
            cOm9 com9 = new cOm9();
            lpt2 = com9;
            m0v0 m0v0Var = new m0v0("com.ravelin.core.model.SharedPackages", com9, 5);
            m0v0Var.j("libVer", true);
            m0v0Var.j("platform", true);
            m0v0Var.j("appPackageName", true);
            m0v0Var.j("appVer", true);
            m0v0Var.j("sharedAppPackages", true);
            a = m0v0Var;
        }

        public final nma0[] childSerializers() {
            znb0[] znb0VarArr = SharedPackages.f;
            chc1 chc1Var = chc1.a;
            return new nma0[]{m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z((nma0) znb0VarArr[4].getValue())};
        }

        public final h661 getDescriptor() {
            return a;
        }

        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final SharedPackages deserialize(dar darVar) {
            m0v0 m0v0Var = a;
            x1k x1kVarB = darVar.b(m0v0Var);
            znb0[] znb0VarArr = SharedPackages.f;
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
            return new SharedPackages(i, str, str2, str3, str4, list, null);
        }

        public /* bridge */ /* synthetic */ nma0[] typeParametersSerializers() {
            return z0o1.a;
        }

        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final void serialize(uax uaxVar, SharedPackages sharedPackages) {
            m0v0 m0v0Var = a;
            z1k z1kVarB = uaxVar.b(m0v0Var);
            SharedPackages.lpt2(sharedPackages, z1kVarB, m0v0Var);
            z1kVarB.a(m0v0Var);
        }
    }
}
