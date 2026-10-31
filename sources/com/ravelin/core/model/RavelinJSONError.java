package com.ravelin.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.MissingFieldException;
import p.chc1;
import p.cy30;
import p.dar;
import p.h661;
import p.m0v0;
import p.n9v;
import p.nma0;
import p.o5f0;
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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0081\b\u0018\u0000 62\u00020\u0001:\u000278B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u001dJ\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u001dR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b-\u0010*\u001a\u0004\b\u0015\u0010\u001fR \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b.\u0010,\u0012\u0004\b0\u0010*\u001a\u0004\b/\u0010\u001fR \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u00102\u0012\u0004\b5\u0010*\u001a\u0004\b3\u00104¨\u00069"}, d2 = {"Lcom/ravelin/core/model/RavelinJSONError;", "Landroid/os/Parcelable;", "", "status", "", "message", "traceId", "", "timestamp", "<init>", "(ILjava/lang/String;Ljava/lang/String;J)V", "seen0", "Lp/p661;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;JLp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "lpt2", "(Lcom/ravelin/core/model/RavelinJSONError;Lp/z1k;Lp/h661;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "Lpt5", "getStatus$annotations", "()V", "b", "Ljava/lang/String;", "getMessage$annotations", "c", "Com8", "getTraceId$annotations", "d", "J", "COM7", "()J", "getTimestamp$annotations", "Companion", "cOm9", "CoM4", "core_release"}, k = 1, mv = {2, 1, SplitInstallErrorCode.NO_ERROR}, xi = 48)
@o661
public final /* data */ class RavelinJSONError implements Parcelable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int status;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String message;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String traceId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final long timestamp;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<RavelinJSONError> CREATOR = new CoM6();

    /* JADX INFO: renamed from: com.ravelin.core.model.RavelinJSONError$CoM4, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final nma0 serializer() {
            return cOm9.lpt2;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.MissingFieldException */
    public /* synthetic */ RavelinJSONError(int i, int i2, String str, String str2, long j, p661 p661Var) throws MissingFieldException {
        if (9 != (i & 9)) {
            o6p1.t(i, 9, cOm9.lpt2.getDescriptor());
            throw null;
        }
        this.status = i2;
        if ((i & 2) == 0) {
            this.message = "";
        } else {
            this.message = str;
        }
        if ((i & 4) == 0) {
            this.traceId = "";
        } else {
            this.traceId = str2;
        }
        this.timestamp = j;
    }

    public static final /* synthetic */ void lpt2(RavelinJSONError self, z1k output, h661 serialDesc) {
        int i = self.status;
        String str = self.traceId;
        String str2 = self.message;
        output.e(0, i, serialDesc);
        if (output.d0() || !u890.j(str2, "")) {
            output.G(serialDesc, 1, str2);
        }
        if (output.d0() || !u890.j(str, "")) {
            output.G(serialDesc, 2, str);
        }
        output.l(serialDesc, 3, self.timestamp);
    }

    /* JADX INFO: renamed from: COM7, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: Com8, reason: from getter */
    public final String getTraceId() {
        return this.traceId;
    }

    /* JADX INFO: renamed from: Lpt5, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RavelinJSONError)) {
            return false;
        }
        RavelinJSONError ravelinJSONError = (RavelinJSONError) other;
        return this.status == ravelinJSONError.status && u890.j(this.message, ravelinJSONError.message) && u890.j(this.traceId, ravelinJSONError.traceId) && this.timestamp == ravelinJSONError.timestamp;
    }

    public int hashCode() {
        return Long.hashCode(this.timestamp) + cy30.d(cy30.d(Integer.hashCode(this.status) * 31, 31, this.message), 31, this.traceId);
    }

    public String toString() {
        return "RavelinJSONError(status=" + this.status + ", message=" + this.message + ", traceId=" + this.traceId + ", timestamp=" + this.timestamp + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.status);
        dest.writeString(this.message);
        dest.writeString(this.traceId);
        dest.writeLong(this.timestamp);
    }

    public static final class CoM6 implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final RavelinJSONError createFromParcel(Parcel parcel) {
            return new RavelinJSONError(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final RavelinJSONError[] newArray(int i) {
            return new RavelinJSONError[i];
        }
    }

    public RavelinJSONError(int i, String str, String str2, long j) {
        this.status = i;
        this.message = str;
        this.traceId = str2;
        this.timestamp = j;
    }

    public /* synthetic */ RavelinJSONError(int i, String str, String str2, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, j);
    }

    /* JADX INFO: renamed from: lpt2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public /* synthetic */ class cOm9 implements pf40 {
        public static final m0v0 a;
        public static final cOm9 lpt2;

        static {
            cOm9 com9 = new cOm9();
            lpt2 = com9;
            m0v0 m0v0Var = new m0v0("com.ravelin.core.model.RavelinJSONError", com9, 4);
            m0v0Var.j("status", false);
            m0v0Var.j("message", true);
            m0v0Var.j("traceId", true);
            m0v0Var.j("timestamp", false);
            a = m0v0Var;
        }

        public final nma0[] childSerializers() {
            chc1 chc1Var = chc1.a;
            return new nma0[]{wr80.a, chc1Var, chc1Var, o5f0.a};
        }

        public final h661 getDescriptor() {
            return a;
        }

        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final RavelinJSONError deserialize(dar darVar) {
            m0v0 m0v0Var = a;
            x1k x1kVarB = darVar.b(m0v0Var);
            x1kVarB.getClass();
            int i = 0;
            int iO = 0;
            String strF = null;
            String strF2 = null;
            long jI0 = 0;
            boolean z = true;
            while (z) {
                int iP = x1kVarB.p(m0v0Var);
                if (iP == -1) {
                    z = false;
                } else if (iP == 0) {
                    iO = x1kVarB.o(m0v0Var, 0);
                    i |= 1;
                } else if (iP == 1) {
                    strF = x1kVarB.f(m0v0Var, 1);
                    i |= 2;
                } else if (iP == 2) {
                    strF2 = x1kVarB.f(m0v0Var, 2);
                    i |= 4;
                } else {
                    if (iP != 3) {
                        n9v.a(iP);
                        return null;
                    }
                    jI0 = x1kVarB.i0(m0v0Var, 3);
                    i |= 8;
                }
            }
            x1kVarB.a(m0v0Var);
            return new RavelinJSONError(i, iO, strF, strF2, jI0, (p661) null);
        }

        public /* bridge */ /* synthetic */ nma0[] typeParametersSerializers() {
            return z0o1.a;
        }

        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final void serialize(uax uaxVar, RavelinJSONError ravelinJSONError) {
            m0v0 m0v0Var = a;
            z1k z1kVarB = uaxVar.b(m0v0Var);
            RavelinJSONError.lpt2(ravelinJSONError, z1kVarB, m0v0Var);
            z1kVarB.a(m0v0Var);
        }
    }
}
