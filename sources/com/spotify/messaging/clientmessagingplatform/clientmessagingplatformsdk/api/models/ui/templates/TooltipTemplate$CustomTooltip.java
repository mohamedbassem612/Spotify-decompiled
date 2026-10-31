package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.aqw;
import p.h661;
import p.m0v0;
import p.nma0;
import p.o661;
import p.p661;
import p.pf40;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 3*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u00020\u0004:\u000243B%\u0012\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u0087\u0001\u0010\u001b\u001a\u00020\u0018\"\n\b\u0003\u0010\u0001*\u0004\u0018\u00010\u000e\"\n\b\u0004\u0010\u0002*\u0004\u0018\u00010\u000e\"\n\b\u0005\u0010\u0003*\u0004\u0018\u00010\u000e2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00030\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00040\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00050\u0014H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010!\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\t¢\u0006\u0004\b!\u0010\"J$\u0010#\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b#\u0010$J@\u0010%\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b*\u0010\u001dJ\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b-\u0010.R4\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010/\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010$¨\u00065"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/TooltipTemplate$CustomTooltip;", "P", "S", "E", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/TooltipTemplate;", "Lp/aqw;", "elementAndProps", "<init>", "(Lp/aqw;)V", "", "seen0", "Lp/p661;", "serializationConstructorMarker", "(ILp/p661;)V", "", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/nma0;", "typeSerial0", "typeSerial1", "typeSerial2", "Lp/rih1;", "write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/TooltipTemplate$CustomTooltip;Lp/z1k;Lp/h661;Lp/nma0;Lp/nma0;Lp/nma0;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lp/aqw;", "copy", "(Lp/aqw;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/TooltipTemplate$CustomTooltip;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lp/aqw;", "getElementAndProps", "getElementAndProps$annotations", "()V", "Companion", "$serializer", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
@o661
public final /* data */ class TooltipTemplate$CustomTooltip<P, S, E> extends TooltipTemplate {
    public static final int $stable = 0;
    private final aqw elementAndProps;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<TooltipTemplate$CustomTooltip<?, ?, ?>> CREATOR = new Creator();
    private static final h661 $cachedDescriptor = new m0v0("com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.TooltipTemplate.CustomTooltip", (pf40) null, 0);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ja\u0010\f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u000b0\u0007\"\u0004\b\u0003\u0010\u0004\"\u0004\b\u0004\u0010\u0005\"\u0004\b\u0005\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00030\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00040\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00050\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/TooltipTemplate$CustomTooltip$Companion;", "", "<init>", "()V", "P", "S", "E", "Lp/nma0;", "typeSerial0", "typeSerial1", "typeSerial2", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/TooltipTemplate$CustomTooltip;", "serializer", "(Lp/nma0;Lp/nma0;Lp/nma0;)Lp/nma0;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <P, S, E> nma0 serializer(nma0 typeSerial0, nma0 typeSerial1, nma0 typeSerial2) {
            return new TooltipTemplate$CustomTooltip$$serializer(typeSerial0, typeSerial1, typeSerial2);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
    public static final class Creator implements Parcelable.Creator<TooltipTemplate$CustomTooltip<?, ?, ?>> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TooltipTemplate$CustomTooltip<?, ?, ?> createFromParcel(Parcel parcel) {
            parcel.readInt();
            aqw aqwVar = null;
            return new TooltipTemplate$CustomTooltip<>(aqwVar, 1, aqwVar);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TooltipTemplate$CustomTooltip<?, ?, ?>[] newArray(int i) {
            return new TooltipTemplate$CustomTooltip[i];
        }
    }

    public /* synthetic */ TooltipTemplate$CustomTooltip(aqw aqwVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : aqwVar);
    }

    public static /* synthetic */ TooltipTemplate$CustomTooltip copy$default(TooltipTemplate$CustomTooltip tooltipTemplate$CustomTooltip, aqw aqwVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aqwVar = tooltipTemplate$CustomTooltip.elementAndProps;
        }
        return tooltipTemplate$CustomTooltip.copy(aqwVar);
    }

    public static /* synthetic */ void getElementAndProps$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final aqw getElementAndProps() {
        return this.elementAndProps;
    }

    public final TooltipTemplate$CustomTooltip<P, S, E> copy(aqw elementAndProps) {
        return new TooltipTemplate$CustomTooltip<>(elementAndProps);
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TooltipTemplate$CustomTooltip) && u890.j(this.elementAndProps, ((TooltipTemplate$CustomTooltip) other).elementAndProps);
    }

    public final aqw getElementAndProps() {
        return this.elementAndProps;
    }

    public int hashCode() {
        aqw aqwVar = this.elementAndProps;
        if (aqwVar == null) {
            return 0;
        }
        return aqwVar.hashCode();
    }

    public String toString() {
        return super/*java.lang.Object*/.toString();
    }

    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(1);
    }

    public /* synthetic */ TooltipTemplate$CustomTooltip(int i, p661 p661Var) {
        super(i, p661Var);
        this.elementAndProps = null;
    }

    public TooltipTemplate$CustomTooltip(aqw aqwVar) {
        super((DefaultConstructorMarker) null);
        this.elementAndProps = aqwVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TooltipTemplate$CustomTooltip() {
        aqw aqwVar = null;
        this(aqwVar, 1, aqwVar);
    }
}
