package com.ravelin.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.MissingFieldException;
import p.bb00;
import p.chc1;
import p.cy30;
import p.dar;
import p.h661;
import p.hrt;
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
import p.wr80;
import p.x1k;
import p.z0o1;
import p.z1k;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fB_\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001fJ\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lcom/ravelin/core/model/ErrorMetadata;", "Landroid/os/Parcelable;", "", "errorCode", "", "errorType", "errorDescription", "fileName", "stackTrace", "methodName", "lineNumber", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "seen0", "Lp/p661;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "lpt2", "(Lcom/ravelin/core/model/ErrorMetadata;Lp/z1k;Lp/h661;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Companion", "cOm9", "CoM4", "core_release"}, k = 1, mv = {2, 1, SplitInstallErrorCode.NO_ERROR}, xi = 48)
@o661
public final /* data */ class ErrorMetadata implements Parcelable {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Integer g;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ErrorMetadata> CREATOR = new CoM6();

    /* JADX INFO: renamed from: com.ravelin.core.model.ErrorMetadata$CoM4, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final nma0 serializer() {
            return cOm9.lpt2;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.MissingFieldException */
    public /* synthetic */ ErrorMetadata(int i, int i2, String str, String str2, String str3, String str4, String str5, Integer num, p661 p661Var) throws MissingFieldException {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, cOm9.lpt2.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = str;
        this.c = str2;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str5;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num;
        }
    }

    public static final /* synthetic */ void lpt2(ErrorMetadata self, z1k output, h661 serialDesc) {
        int i = self.a;
        Integer num = self.g;
        String str = self.f;
        String str2 = self.e;
        String str3 = self.d;
        output.e(0, i, serialDesc);
        output.G(serialDesc, 1, self.b);
        output.G(serialDesc, 2, self.c);
        if (output.d0() || str3 != null) {
            output.s(serialDesc, 3, chc1.a, str3);
        }
        if (output.d0() || str2 != null) {
            output.s(serialDesc, 4, chc1.a, str2);
        }
        if (output.d0() || str != null) {
            output.s(serialDesc, 5, chc1.a, str);
        }
        if (!output.d0() && num == null) {
            return;
        }
        output.s(serialDesc, 6, wr80.a, num);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorMetadata)) {
            return false;
        }
        ErrorMetadata errorMetadata = (ErrorMetadata) other;
        return this.a == errorMetadata.a && u890.j(this.b, errorMetadata.b) && u890.j(this.c, errorMetadata.c) && u890.j(this.d, errorMetadata.d) && u890.j(this.e, errorMetadata.e) && u890.j(this.f, errorMetadata.f) && u890.j(this.g, errorMetadata.g);
    }

    public int hashCode() {
        int iD = cy30.d(cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.g;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ErrorMetadata(errorCode=");
        sb.append(this.a);
        sb.append(", errorType=");
        sb.append(this.b);
        sb.append(", errorDescription=");
        bb00.j(sb, this.c, ", fileName=", this.d, ", stackTrace=");
        bb00.j(sb, this.e, ", methodName=", this.f, ", lineNumber=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.a);
        dest.writeString(this.b);
        dest.writeString(this.c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        Integer num = this.g;
        if (num == null) {
            dest.writeInt(0);
        } else {
            hrt.l(dest, 1, num);
        }
    }

    public static final class CoM6 implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final ErrorMetadata createFromParcel(Parcel parcel) {
            return new ErrorMetadata(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final ErrorMetadata[] newArray(int i) {
            return new ErrorMetadata[i];
        }
    }

    public ErrorMetadata(int i, String str, String str2, String str3, String str4, String str5, Integer num) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = num;
    }

    public /* synthetic */ ErrorMetadata(int i, String str, String str2, String str3, String str4, String str5, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : num);
    }

    public /* synthetic */ class cOm9 implements pf40 {
        public static final m0v0 a;
        public static final cOm9 lpt2;

        static {
            cOm9 com9 = new cOm9();
            lpt2 = com9;
            m0v0 m0v0Var = new m0v0("com.ravelin.core.model.ErrorMetadata", com9, 7);
            m0v0Var.j("errorCode", false);
            m0v0Var.j("errorType", false);
            m0v0Var.j("errorDescription", false);
            m0v0Var.j("fileName", true);
            m0v0Var.j("className", true);
            m0v0Var.j("methodName", true);
            m0v0Var.j("lineNumber", true);
            a = m0v0Var;
        }

        public final nma0[] childSerializers() {
            nma0 nma0Var = wr80.a;
            nma0 nma0Var2 = chc1.a;
            return new nma0[]{nma0Var, nma0Var2, nma0Var2, m5n1.z(nma0Var2), m5n1.z(nma0Var2), m5n1.z(nma0Var2), m5n1.z(nma0Var)};
        }

        public final h661 getDescriptor() {
            return a;
        }

        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final ErrorMetadata deserialize(dar darVar) {
            m0v0 m0v0Var = a;
            x1k x1kVarB = darVar.b(m0v0Var);
            x1kVarB.getClass();
            boolean z = true;
            int i = 0;
            int iO = 0;
            String strF = null;
            String strF2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            Integer num = null;
            while (z) {
                int iP = x1kVarB.p(m0v0Var);
                switch (iP) {
                    case SplitInstallErrorCode.ACTIVE_SESSIONS_LIMIT_EXCEEDED /* -1 */:
                        z = false;
                        break;
                    case SplitInstallErrorCode.NO_ERROR /* 0 */:
                        iO = x1kVarB.o(m0v0Var, 0);
                        i |= 1;
                        break;
                    case 1:
                        strF = x1kVarB.f(m0v0Var, 1);
                        i |= 2;
                        break;
                    case 2:
                        strF2 = x1kVarB.f(m0v0Var, 2);
                        i |= 4;
                        break;
                    case 3:
                        str = (String) x1kVarB.B(m0v0Var, 3, chc1.a, str);
                        i |= 8;
                        break;
                    case 4:
                        str2 = (String) x1kVarB.B(m0v0Var, 4, chc1.a, str2);
                        i |= 16;
                        break;
                    case 5:
                        str3 = (String) x1kVarB.B(m0v0Var, 5, chc1.a, str3);
                        i |= 32;
                        break;
                    case 6:
                        num = (Integer) x1kVarB.B(m0v0Var, 6, wr80.a, num);
                        i |= 64;
                        break;
                    default:
                        n9v.a(iP);
                        return null;
                }
            }
            x1kVarB.a(m0v0Var);
            return new ErrorMetadata(i, iO, strF, strF2, str, str2, str3, num, (p661) null);
        }

        public /* bridge */ /* synthetic */ nma0[] typeParametersSerializers() {
            return z0o1.a;
        }

        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final void serialize(uax uaxVar, ErrorMetadata errorMetadata) {
            m0v0 m0v0Var = a;
            z1k z1kVarB = uaxVar.b(m0v0Var);
            ErrorMetadata.lpt2(errorMetadata, z1kVarB, m0v0Var);
            z1kVarB.a(m0v0Var);
        }
    }
}
