package com.ravelin.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.MissingFieldException;
import p.dar;
import p.dm5;
import p.f4i1;
import p.h661;
import p.m0v0;
import p.n9v;
import p.nma0;
import p.o661;
import p.o6p1;
import p.p661;
import p.pf40;
import p.uax;
import p.x1k;
import p.xh3;
import p.z0o1;
import p.z1k;
import p.znb0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\b\u0081\b\u0018\u0000 -2\u00020\u0001:\u0002./B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0002H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010!\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0007¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0007¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b+\u0010,\u001a\u0004\b)\u0010*¨\u00060"}, d2 = {"Lcom/ravelin/core/model/Events;", "Landroid/os/Parcelable;", "", "Lcom/ravelin/core/model/Payload;", "events", "<init>", "([Lcom/ravelin/core/model/Payload;)V", "", "seen0", "Lp/p661;", "serializationConstructorMarker", "(I[Lcom/ravelin/core/model/Payload;Lp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "lpt2", "(Lcom/ravelin/core/model/Events;Lp/z1k;Lp/h661;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lcom/ravelin/core/model/ResponsePayload;", "Com8", "()[Lcom/ravelin/core/model/ResponsePayload;", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "", "toString", "()Ljava/lang/String;", "a", "[Lcom/ravelin/core/model/Payload;", "COM7", "()[Lcom/ravelin/core/model/Payload;", "getEvents$annotations", "()V", "Companion", "cOm9", "CoM4", "core_release"}, k = 1, mv = {2, 1, SplitInstallErrorCode.NO_ERROR}, xi = 48)
@o661
public final /* data */ class Events implements Parcelable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final Payload[] events;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<Events> CREATOR = new CoM6();
    public static final znb0[] b = {dm5.S(2, new xh3((byte) 26))};

    /* JADX INFO: renamed from: com.ravelin.core.model.Events$CoM4, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final nma0 serializer() {
            return cOm9.lpt2;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.MissingFieldException */
    public /* synthetic */ Events(int i, Payload[] payloadArr, p661 p661Var) throws MissingFieldException {
        if (1 == (i & 1)) {
            this.events = payloadArr;
        } else {
            o6p1.t(i, 1, cOm9.lpt2.getDescriptor());
            throw null;
        }
    }

    public static final /* synthetic */ void lpt2(Events self, z1k output, h661 serialDesc) {
        output.k(serialDesc, 0, (nma0) b[0].getValue(), self.events);
    }

    /* JADX INFO: renamed from: COM7, reason: from getter */
    public final Payload[] getEvents() {
        return this.events;
    }

    public final ResponsePayload[] Com8() {
        Payload[] payloadArr = this.events;
        ArrayList arrayList = new ArrayList(payloadArr.length);
        for (Payload payload : payloadArr) {
            arrayList.add(payload.COM7());
        }
        return (ResponsePayload[]) arrayList.toArray(new ResponsePayload[0]);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (Events.class.equals(other != null ? other.getClass() : null)) {
            return Arrays.equals(this.events, ((Events) other).events);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.events);
    }

    public String toString() {
        return f4i1.f("Events(events=", Arrays.toString(this.events), ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Payload[] payloadArr = this.events;
        int length = payloadArr.length;
        dest.writeInt(length);
        for (int i = 0; i != length; i++) {
            payloadArr[i].writeToParcel(dest, flags);
        }
    }

    public Events(Payload[] payloadArr) {
        this.events = payloadArr;
    }

    public static final class CoM6 implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final Events createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            Payload[] payloadArr = new Payload[i];
            for (int i2 = 0; i2 != i; i2++) {
                payloadArr[i2] = Payload.CREATOR.createFromParcel(parcel);
            }
            return new Events(payloadArr);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final Events[] newArray(int i) {
            return new Events[i];
        }
    }

    public /* synthetic */ class cOm9 implements pf40 {
        public static final m0v0 a;
        public static final cOm9 lpt2;

        static {
            cOm9 com9 = new cOm9();
            lpt2 = com9;
            m0v0 m0v0Var = new m0v0("com.ravelin.core.model.Events", com9, 1);
            m0v0Var.j("events", false);
            a = m0v0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final nma0[] childSerializers() {
            return new nma0[]{Events.b[0].getValue()};
        }

        public final h661 getDescriptor() {
            return a;
        }

        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final Events deserialize(dar darVar) {
            m0v0 m0v0Var = a;
            x1k x1kVarB = darVar.b(m0v0Var);
            znb0[] znb0VarArr = Events.b;
            x1kVarB.getClass();
            p661 p661Var = null;
            boolean z = true;
            int i = 0;
            Payload[] payloadArr = null;
            while (z) {
                int iP = x1kVarB.p(m0v0Var);
                if (iP == -1) {
                    z = false;
                } else {
                    if (iP != 0) {
                        n9v.a(iP);
                        return null;
                    }
                    payloadArr = (Payload[]) x1kVarB.A(m0v0Var, 0, (nma0) znb0VarArr[0].getValue(), payloadArr);
                    i = 1;
                }
            }
            x1kVarB.a(m0v0Var);
            return new Events(i, payloadArr, p661Var);
        }

        public /* bridge */ /* synthetic */ nma0[] typeParametersSerializers() {
            return z0o1.a;
        }

        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final void serialize(uax uaxVar, Events events) {
            m0v0 m0v0Var = a;
            z1k z1kVarB = uaxVar.b(m0v0Var);
            Events.lpt2(events, z1kVarB, m0v0Var);
            z1kVarB.a(m0v0Var);
        }
    }
}
