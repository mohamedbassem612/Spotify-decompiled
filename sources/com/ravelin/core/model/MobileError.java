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
import p.h661;
import p.m0v0;
import p.m5n1;
import p.n9v;
import p.nma0;
import p.o5f0;
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
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u0000 +2\u00020\u0001:\u0002,-B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB'\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000eBK\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\n\u0010\u0013J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u000f¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u000f¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b%\u0010\"J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcom/ravelin/core/model/MobileError;", "Landroid/os/Parcelable;", "", "timestamp", "", "traceId", "source", "platformError", "Lcom/ravelin/core/model/ErrorMetadata;", "sdkError", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ravelin/core/model/ErrorMetadata;)V", "Lcom/ravelin/core/model/RavelinJSONError;", "ravelinJSONError", "(Lcom/ravelin/core/model/RavelinJSONError;Ljava/lang/String;Lcom/ravelin/core/model/ErrorMetadata;)V", "", "seen0", "Lp/p661;", "serializationConstructorMarker", "(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ravelin/core/model/ErrorMetadata;Lp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "lpt2", "(Lcom/ravelin/core/model/MobileError;Lp/z1k;Lp/h661;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Companion", "cOm9", "CoM4", "core_release"}, k = 1, mv = {2, 1, SplitInstallErrorCode.NO_ERROR}, xi = 48)
@o661
public final /* data */ class MobileError implements Parcelable {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final ErrorMetadata e;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<MobileError> CREATOR = new CoM6();

    /* JADX INFO: renamed from: com.ravelin.core.model.MobileError$CoM4, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final nma0 serializer() {
            return cOm9.lpt2;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.MissingFieldException */
    public /* synthetic */ MobileError(int i, long j, String str, String str2, String str3, ErrorMetadata errorMetadata, p661 p661Var) throws MissingFieldException {
        if (13 != (i & 13)) {
            o6p1.t(i, 13, cOm9.lpt2.getDescriptor());
            throw null;
        }
        this.a = j;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        this.c = str2;
        this.d = str3;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = errorMetadata;
        }
    }

    public static final /* synthetic */ void lpt2(MobileError self, z1k output, h661 serialDesc) {
        long j = self.a;
        ErrorMetadata errorMetadata = self.e;
        String str = self.b;
        output.l(serialDesc, 0, j);
        if (output.d0() || str != null) {
            output.s(serialDesc, 1, chc1.a, str);
        }
        chc1 chc1Var = chc1.a;
        output.s(serialDesc, 2, chc1Var, self.c);
        output.s(serialDesc, 3, chc1Var, self.d);
        if (!output.d0() && errorMetadata == null) {
            return;
        }
        output.s(serialDesc, 4, ErrorMetadata.cOm9.lpt2, errorMetadata);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileError)) {
            return false;
        }
        MobileError mobileError = (MobileError) other;
        return this.a == mobileError.a && u890.j(this.b, mobileError.b) && u890.j(this.c, mobileError.c) && u890.j(this.d, mobileError.d) && u890.j(this.e, mobileError.e);
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ErrorMetadata errorMetadata = this.e;
        return iHashCode4 + (errorMetadata != null ? errorMetadata.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MobileError(timestamp=");
        sb.append(this.a);
        sb.append(", traceId=");
        sb.append(this.b);
        bb00.j(sb, ", source=", this.c, ", platformError=", this.d);
        sb.append(", sdkError=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(this.a);
        dest.writeString(this.b);
        dest.writeString(this.c);
        dest.writeString(this.d);
        ErrorMetadata errorMetadata = this.e;
        if (errorMetadata == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            errorMetadata.writeToParcel(dest, flags);
        }
    }

    public static final class CoM6 implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final MobileError createFromParcel(Parcel parcel) {
            return new MobileError(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ErrorMetadata.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final MobileError[] newArray(int i) {
            return new MobileError[i];
        }
    }

    public MobileError(long j, String str, String str2, String str3, ErrorMetadata errorMetadata) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = errorMetadata;
    }

    public MobileError(RavelinJSONError ravelinJSONError, String str, ErrorMetadata errorMetadata) {
        this(ravelinJSONError.getTimestamp(), ravelinJSONError.getTraceId(), str, ravelinJSONError.getMessage(), errorMetadata);
    }

    public /* synthetic */ class cOm9 implements pf40 {
        public static final m0v0 a;
        public static final cOm9 lpt2;

        static {
            cOm9 com9 = new cOm9();
            lpt2 = com9;
            m0v0 m0v0Var = new m0v0("com.ravelin.core.model.MobileError", com9, 5);
            m0v0Var.j("timestamp", false);
            m0v0Var.j("traceId", true);
            m0v0Var.j("source", false);
            m0v0Var.j("error", false);
            m0v0Var.j("metadata", true);
            a = m0v0Var;
        }

        public final nma0[] childSerializers() {
            chc1 chc1Var = chc1.a;
            return new nma0[]{o5f0.a, m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(ErrorMetadata.cOm9.lpt2)};
        }

        public final h661 getDescriptor() {
            return a;
        }

        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final MobileError deserialize(dar darVar) {
            m0v0 m0v0Var = a;
            x1k x1kVarB = darVar.b(m0v0Var);
            x1kVarB.getClass();
            int i = 0;
            long jI0 = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            ErrorMetadata errorMetadata = null;
            boolean z = true;
            while (z) {
                int iP = x1kVarB.p(m0v0Var);
                if (iP == -1) {
                    z = false;
                } else if (iP == 0) {
                    jI0 = x1kVarB.i0(m0v0Var, 0);
                    i |= 1;
                } else if (iP == 1) {
                    str = (String) x1kVarB.B(m0v0Var, 1, chc1.a, str);
                    i |= 2;
                } else if (iP == 2) {
                    str2 = (String) x1kVarB.B(m0v0Var, 2, chc1.a, str2);
                    i |= 4;
                } else if (iP == 3) {
                    str3 = (String) x1kVarB.B(m0v0Var, 3, chc1.a, str3);
                    i |= 8;
                } else {
                    if (iP != 4) {
                        n9v.a(iP);
                        return null;
                    }
                    errorMetadata = (ErrorMetadata) x1kVarB.B(m0v0Var, 4, ErrorMetadata.cOm9.lpt2, errorMetadata);
                    i |= 16;
                }
            }
            x1kVarB.a(m0v0Var);
            return new MobileError(i, jI0, str, str2, str3, errorMetadata, null);
        }

        public /* bridge */ /* synthetic */ nma0[] typeParametersSerializers() {
            return z0o1.a;
        }

        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final void serialize(uax uaxVar, MobileError mobileError) {
            m0v0 m0v0Var = a;
            z1k z1kVarB = uaxVar.b(m0v0Var);
            MobileError.lpt2(mobileError, z1kVarB, m0v0Var);
            z1kVarB.a(m0v0Var);
        }
    }
}
