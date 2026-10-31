package com.ravelin.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.MissingFieldException;
import p.chc1;
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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001bJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/ravelin/core/model/TimezoneInfo;", "Landroid/os/Parcelable;", "", "timeOffset", "", "timeZone", "timeOffsetMinutes", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V", "seen0", "Lp/p661;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Lp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "lpt2", "(Lcom/ravelin/core/model/TimezoneInfo;Lp/z1k;Lp/h661;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Companion", "cOm9", "CoM4", "core_release"}, k = 1, mv = {2, 1, SplitInstallErrorCode.NO_ERROR}, xi = 48)
@o661
public final /* data */ class TimezoneInfo implements Parcelable {
    public final Integer a;
    public final String b;
    public final Integer c;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<TimezoneInfo> CREATOR = new CoM6();

    /* JADX INFO: renamed from: com.ravelin.core.model.TimezoneInfo$CoM4, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final nma0 serializer() {
            return cOm9.lpt2;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.MissingFieldException */
    public /* synthetic */ TimezoneInfo(int i, Integer num, String str, Integer num2, p661 p661Var) throws MissingFieldException {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, cOm9.lpt2.getDescriptor());
            throw null;
        }
        this.a = num;
        this.b = str;
        this.c = num2;
    }

    public static final /* synthetic */ void lpt2(TimezoneInfo self, z1k output, h661 serialDesc) {
        wr80 wr80Var = wr80.a;
        output.s(serialDesc, 0, wr80Var, self.a);
        output.s(serialDesc, 1, chc1.a, self.b);
        output.s(serialDesc, 2, wr80Var, self.c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimezoneInfo)) {
            return false;
        }
        TimezoneInfo timezoneInfo = (TimezoneInfo) other;
        return u890.j(this.a, timezoneInfo.a) && u890.j(this.b, timezoneInfo.b) && u890.j(this.c, timezoneInfo.c);
    }

    public int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.c;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "TimezoneInfo(timeOffset=" + this.a + ", timeZone=" + this.b + ", timeOffsetMinutes=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Integer num = this.a;
        if (num == null) {
            dest.writeInt(0);
        } else {
            hrt.l(dest, 1, num);
        }
        dest.writeString(this.b);
        Integer num2 = this.c;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            hrt.l(dest, 1, num2);
        }
    }

    public TimezoneInfo(Integer num, String str, Integer num2) {
        this.a = num;
        this.b = str;
        this.c = num2;
    }

    public static final class CoM6 implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final TimezoneInfo createFromParcel(Parcel parcel) {
            return new TimezoneInfo(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final TimezoneInfo[] newArray(int i) {
            return new TimezoneInfo[i];
        }
    }

    public /* synthetic */ class cOm9 implements pf40 {
        public static final m0v0 a;
        public static final cOm9 lpt2;

        static {
            cOm9 com9 = new cOm9();
            lpt2 = com9;
            m0v0 m0v0Var = new m0v0("com.ravelin.core.model.TimezoneInfo", com9, 3);
            m0v0Var.j("timeOffset", false);
            m0v0Var.j("timeZone", false);
            m0v0Var.j("timeOffsetMinutes", false);
            a = m0v0Var;
        }

        public final nma0[] childSerializers() {
            wr80 wr80Var = wr80.a;
            return new nma0[]{m5n1.z(wr80Var), m5n1.z(chc1.a), m5n1.z(wr80Var)};
        }

        public final h661 getDescriptor() {
            return a;
        }

        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final TimezoneInfo deserialize(dar darVar) {
            m0v0 m0v0Var = a;
            x1k x1kVarB = darVar.b(m0v0Var);
            x1kVarB.getClass();
            boolean z = true;
            int i = 0;
            Integer num = null;
            String str = null;
            Integer num2 = null;
            while (z) {
                int iP = x1kVarB.p(m0v0Var);
                if (iP == -1) {
                    z = false;
                } else if (iP == 0) {
                    num = (Integer) x1kVarB.B(m0v0Var, 0, wr80.a, num);
                    i |= 1;
                } else if (iP == 1) {
                    str = (String) x1kVarB.B(m0v0Var, 1, chc1.a, str);
                    i |= 2;
                } else {
                    if (iP != 2) {
                        n9v.a(iP);
                        return null;
                    }
                    num2 = (Integer) x1kVarB.B(m0v0Var, 2, wr80.a, num2);
                    i |= 4;
                }
            }
            x1kVarB.a(m0v0Var);
            return new TimezoneInfo(i, num, str, num2, null);
        }

        public /* bridge */ /* synthetic */ nma0[] typeParametersSerializers() {
            return z0o1.a;
        }

        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final void serialize(uax uaxVar, TimezoneInfo timezoneInfo) {
            m0v0 m0v0Var = a;
            z1k z1kVarB = uaxVar.b(m0v0Var);
            TimezoneInfo.lpt2(timezoneInfo, z1kVarB, m0v0Var);
            z1kVarB.a(m0v0Var);
        }
    }
}
