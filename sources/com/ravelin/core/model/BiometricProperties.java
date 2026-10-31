package com.ravelin.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.dar;
import p.dm5;
import p.gpb;
import p.h661;
import p.i3a;
import p.m0v0;
import p.m5n1;
import p.n9v;
import p.nma0;
import p.o661;
import p.p661;
import p.pf40;
import p.u890;
import p.uax;
import p.x1k;
import p.xh3;
import p.z0o1;
import p.z1k;
import p.znb0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B%\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001cJ\u001a\u0010\"\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/ravelin/core/model/BiometricProperties;", "Landroid/os/Parcelable;", "", "biometricEnabled", "", "", "biometricTypes", "<init>", "(Ljava/lang/Boolean;[Ljava/lang/String;)V", "", "seen0", "Lp/p661;", "serializationConstructorMarker", "(ILjava/lang/Boolean;[Ljava/lang/String;Lp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "lpt2", "(Lcom/ravelin/core/model/BiometricProperties;Lp/z1k;Lp/h661;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Companion", "cOm9", "CoM4", "core_release"}, k = 1, mv = {2, 1, SplitInstallErrorCode.NO_ERROR}, xi = 48)
@o661
public final /* data */ class BiometricProperties implements Parcelable {
    public final Boolean a;
    public final String[] b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<BiometricProperties> CREATOR = new CoM6();
    public static final znb0[] c = {null, dm5.S(2, new xh3((byte) 14))};

    /* JADX INFO: renamed from: com.ravelin.core.model.BiometricProperties$CoM4, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final nma0 serializer() {
            return cOm9.lpt2;
        }
    }

    public /* synthetic */ BiometricProperties(int i, Boolean bool, String[] strArr, p661 p661Var) {
        this.a = (i & 1) == 0 ? Boolean.FALSE : bool;
        if ((i & 2) == 0) {
            this.b = new String[]{"unknown"};
        } else {
            this.b = strArr;
        }
    }

    public static final /* synthetic */ void lpt2(BiometricProperties self, z1k output, h661 serialDesc) {
        if (output.d0() || !u890.j(self.a, Boolean.FALSE)) {
            output.s(serialDesc, 0, gpb.a, self.a);
        }
        if (!output.d0() && u890.j(self.b, new String[]{"unknown"})) {
            return;
        }
        output.s(serialDesc, 1, (nma0) c[1].getValue(), self.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BiometricProperties)) {
            return false;
        }
        BiometricProperties biometricProperties = (BiometricProperties) other;
        return u890.j(this.a, biometricProperties.a) && u890.j(this.b, biometricProperties.b);
    }

    public int hashCode() {
        Boolean bool = this.a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String[] strArr = this.b;
        return iHashCode + (strArr != null ? Arrays.hashCode(strArr) : 0);
    }

    public String toString() {
        return "BiometricProperties(biometricEnabled=" + this.a + ", biometricTypes=" + Arrays.toString(this.b) + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Boolean bool = this.a;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            i3a.m(dest, 1, bool);
        }
        dest.writeStringArray(this.b);
    }

    public BiometricProperties(Boolean bool, String[] strArr) {
        this.a = bool;
        this.b = strArr;
    }

    public static final class CoM6 implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final BiometricProperties createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BiometricProperties(boolValueOf, parcel.createStringArray());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final BiometricProperties[] newArray(int i) {
            return new BiometricProperties[i];
        }
    }

    public /* synthetic */ class cOm9 implements pf40 {
        public static final m0v0 a;
        public static final cOm9 lpt2;

        static {
            cOm9 com9 = new cOm9();
            lpt2 = com9;
            m0v0 m0v0Var = new m0v0("com.ravelin.core.model.BiometricProperties", com9, 2);
            m0v0Var.j("biometricEnabled", true);
            m0v0Var.j("biometricTypes", true);
            a = m0v0Var;
        }

        public final nma0[] childSerializers() {
            return new nma0[]{m5n1.z(gpb.a), m5n1.z((nma0) BiometricProperties.c[1].getValue())};
        }

        public final h661 getDescriptor() {
            return a;
        }

        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final BiometricProperties deserialize(dar darVar) {
            m0v0 m0v0Var = a;
            x1k x1kVarB = darVar.b(m0v0Var);
            znb0[] znb0VarArr = BiometricProperties.c;
            x1kVarB.getClass();
            p661 p661Var = null;
            boolean z = true;
            int i = 0;
            Boolean bool = null;
            String[] strArr = null;
            while (z) {
                int iP = x1kVarB.p(m0v0Var);
                if (iP == -1) {
                    z = false;
                } else if (iP == 0) {
                    bool = (Boolean) x1kVarB.B(m0v0Var, 0, gpb.a, bool);
                    i |= 1;
                } else {
                    if (iP != 1) {
                        n9v.a(iP);
                        return null;
                    }
                    strArr = (String[]) x1kVarB.B(m0v0Var, 1, (nma0) znb0VarArr[1].getValue(), strArr);
                    i |= 2;
                }
            }
            x1kVarB.a(m0v0Var);
            return new BiometricProperties(i, bool, strArr, p661Var);
        }

        public /* bridge */ /* synthetic */ nma0[] typeParametersSerializers() {
            return z0o1.a;
        }

        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final void serialize(uax uaxVar, BiometricProperties biometricProperties) {
            m0v0 m0v0Var = a;
            z1k z1kVarB = uaxVar.b(m0v0Var);
            BiometricProperties.lpt2(biometricProperties, z1kVarB, m0v0Var);
            z1kVarB.a(m0v0Var);
        }
    }
}
