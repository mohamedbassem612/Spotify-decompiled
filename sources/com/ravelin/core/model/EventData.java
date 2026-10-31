package com.ravelin.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.MissingFieldException;
import p.chc1;
import p.dar;
import p.gg;
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
import p.w6n1;
import p.x1k;
import p.z0o1;
import p.z1k;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012*\u0010\u0007\u001a&\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004j\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u0001`\u0006¢\u0006\u0004\b\b\u0010\tB=\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010\u001dJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b#\u0010$¨\u0006("}, d2 = {"Lcom/ravelin/core/model/EventData;", "Landroid/os/Parcelable;", "", "eventName", "Ljava/util/LinkedHashMap;", "", "Lkotlin/collections/LinkedHashMap;", "properties", "<init>", "(Ljava/lang/String;Ljava/util/LinkedHashMap;)V", "", "seen0", "Lp/p661;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/LinkedHashMap;Lp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "lpt2", "(Lcom/ravelin/core/model/EventData;Lp/z1k;Lp/h661;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Companion", "cOm9", "CoM4", "core_release"}, k = 1, mv = {2, 1, SplitInstallErrorCode.NO_ERROR}, xi = 48)
@o661
public final /* data */ class EventData implements Parcelable {
    public final String a;
    public final LinkedHashMap b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<EventData> CREATOR = new CoM6();

    /* JADX INFO: renamed from: com.ravelin.core.model.EventData$CoM4, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final nma0 serializer() {
            return cOm9.lpt2;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.MissingFieldException */
    public /* synthetic */ EventData(int i, String str, LinkedHashMap linkedHashMap, p661 p661Var) throws MissingFieldException {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, cOm9.lpt2.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = linkedHashMap;
    }

    public static final /* synthetic */ void lpt2(EventData self, z1k output, h661 serialDesc) {
        output.G(serialDesc, 0, self.a);
        output.s(serialDesc, 1, w6n1.a, self.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventData)) {
            return false;
        }
        EventData eventData = (EventData) other;
        return u890.j(this.a, eventData.a) && u890.j(this.b, eventData.b);
    }

    public int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        LinkedHashMap linkedHashMap = this.b;
        return iHashCode + (linkedHashMap == null ? 0 : linkedHashMap.hashCode());
    }

    public String toString() {
        return "EventData(eventName=" + this.a + ", properties=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.a);
        dest.writeMap(this.b);
    }

    public static final class CoM6 implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final EventData createFromParcel(Parcel parcel) {
            return new EventData(parcel.readString(), gg.F(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final EventData[] newArray(int i) {
            return new EventData[i];
        }
    }

    public EventData(String str, LinkedHashMap linkedHashMap) {
        this.a = str;
        this.b = linkedHashMap;
    }

    public /* synthetic */ class cOm9 implements pf40 {
        public static final m0v0 a;
        public static final cOm9 lpt2;

        static {
            cOm9 com9 = new cOm9();
            lpt2 = com9;
            m0v0 m0v0Var = new m0v0("com.ravelin.core.model.EventData", com9, 2);
            m0v0Var.j("eventName", false);
            m0v0Var.j("properties", false);
            a = m0v0Var;
        }

        public final nma0[] childSerializers() {
            return new nma0[]{chc1.a, m5n1.z(w6n1.a)};
        }

        public final h661 getDescriptor() {
            return a;
        }

        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final EventData deserialize(dar darVar) {
            m0v0 m0v0Var = a;
            x1k x1kVarB = darVar.b(m0v0Var);
            x1kVarB.getClass();
            p661 p661Var = null;
            boolean z = true;
            int i = 0;
            String strF = null;
            LinkedHashMap linkedHashMap = null;
            while (z) {
                int iP = x1kVarB.p(m0v0Var);
                if (iP == -1) {
                    z = false;
                } else if (iP == 0) {
                    strF = x1kVarB.f(m0v0Var, 0);
                    i |= 1;
                } else {
                    if (iP != 1) {
                        n9v.a(iP);
                        return null;
                    }
                    linkedHashMap = (LinkedHashMap) x1kVarB.B(m0v0Var, 1, w6n1.a, linkedHashMap);
                    i |= 2;
                }
            }
            x1kVarB.a(m0v0Var);
            return new EventData(i, strF, linkedHashMap, p661Var);
        }

        public /* bridge */ /* synthetic */ nma0[] typeParametersSerializers() {
            return z0o1.a;
        }

        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final void serialize(uax uaxVar, EventData eventData) {
            m0v0 m0v0Var = a;
            z1k z1kVarB = uaxVar.b(m0v0Var);
            EventData.lpt2(eventData, z1kVarB, m0v0Var);
            z1kVarB.a(m0v0Var);
        }
    }
}
