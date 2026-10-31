package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.BackgroundColor;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button$$serializer;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.HeaderContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.MessageText;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.MessageText$$serializer;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Signifier;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Signifier$$serializer;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.dm5;
import p.fv41;
import p.h661;
import p.hab0;
import p.i3a;
import p.jd11;
import p.nma0;
import p.o661;
import p.o6p1;
import p.p661;
import p.pfp0;
import p.rc11;
import p.tka0;
import p.u890;
import p.z1k;
import p.znb0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\u0006\u0012\u0013\u0014\u0015\u0016\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0005\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/InlineCardTemplate;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageTemplate;", "<init>", "()V", "", "seen0", "Lp/p661;", "serializationConstructorMarker", "(ILp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "write$Self", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/InlineCardTemplate;Lp/z1k;Lp/h661;)V", "Companion", "Undefined", "StandardInlineCard", "CompactInlineCard", "MicroCompactInlineCard", "BaseInlineCard", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/InlineCardTemplate$BaseInlineCard;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/InlineCardTemplate$CompactInlineCard;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/InlineCardTemplate$MicroCompactInlineCard;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/InlineCardTemplate$StandardInlineCard;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/InlineCardTemplate$Undefined;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
@o661
public abstract class InlineCardTemplate implements MessageTemplate {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final znb0 $cachedSerializer$delegate = dm5.S(2, Companion.AnonymousClass1.INSTANCE);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/InlineCardTemplate$Companion;", "", "<init>", "()V", "Lp/nma0;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/InlineCardTemplate;", "serializer", "()Lp/nma0;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    public static final class Companion {

        /* JADX INFO: renamed from: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.InlineCardTemplate$Companion$1, reason: invalid class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
        public static final class AnonymousClass1 extends hab0 implements Function0 {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final nma0 invoke() {
                jd11 jd11Var = rc11.a;
                return new fv41("com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.InlineCardTemplate", jd11Var.b(InlineCardTemplate.class), new tka0[]{jd11Var.b(BaseInlineCard.class), jd11Var.b(CompactInlineCard.class), jd11Var.b(MicroCompactInlineCard.class), jd11Var.b(StandardInlineCard.class), jd11Var.b(Undefined.class)}, new nma0[]{InlineCardTemplate$BaseInlineCard$$serializer.INSTANCE, InlineCardTemplate$CompactInlineCard$$serializer.INSTANCE, InlineCardTemplate$MicroCompactInlineCard$$serializer.INSTANCE, InlineCardTemplate$StandardInlineCard$$serializer.INSTANCE, new pfp0("com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.InlineCardTemplate.Undefined", Undefined.INSTANCE, new Annotation[0])}, new Annotation[0]);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ nma0 get$cachedSerializer() {
            return (nma0) InlineCardTemplate.$cachedSerializer$delegate.getValue();
        }

        public final nma0 serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\r¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/InlineCardTemplate$Undefined;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/InlineCardTemplate;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/rih1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lp/nma0;", "serializer", "()Lp/nma0;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    @o661
    public static final class Undefined extends InlineCardTemplate {
        public static final int $stable = 0;
        public static final Undefined INSTANCE = new Undefined();
        public static final Parcelable.Creator<Undefined> CREATOR = new Creator();
        private static final /* synthetic */ znb0 $cachedSerializer$delegate = dm5.S(2, AnonymousClass1.INSTANCE);

        /* JADX INFO: renamed from: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.InlineCardTemplate$Undefined$1, reason: invalid class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
        public static final class AnonymousClass1 extends hab0 implements Function0 {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final nma0 invoke() {
                return new pfp0("com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.InlineCardTemplate.Undefined", Undefined.INSTANCE, new Annotation[0]);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<Undefined> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Undefined createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Undefined.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Undefined[] newArray(int i) {
                return new Undefined[i];
            }
        }

        private Undefined() {
            super(null);
        }

        private final /* synthetic */ nma0 get$cachedSerializer() {
            return (nma0) $cachedSerializer$delegate.getValue();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final nma0 serializer() {
            return get$cachedSerializer();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }
    }

    public /* synthetic */ InlineCardTemplate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private InlineCardTemplate() {
    }

    public /* synthetic */ InlineCardTemplate(int i, p661 p661Var) {
    }

    @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0002CBB3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rBM\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010!\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u000e¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b+\u0010,JF\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b2\u0010\u001dJ\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u000103HÖ\u0003¢\u0006\u0004\b6\u00107R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b;\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010<\u001a\u0004\b=\u0010(R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\b?\u0010*R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010@\u001a\u0004\bA\u0010,¨\u0006D"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/InlineCardTemplate$MicroCompactInlineCard;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/InlineCardTemplate;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Signifier;", "signifier", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;", "headline", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/BackgroundColor;", "backgroundColor", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;", "accessoryContent", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "cardButton", "<init>", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Signifier;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/BackgroundColor;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;)V", "", "seen0", "Lp/p661;", "serializationConstructorMarker", "(ILcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Signifier;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/BackgroundColor;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/InlineCardTemplate$MicroCompactInlineCard;Lp/z1k;Lp/h661;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Signifier;", "component2", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;", "component3", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/BackgroundColor;", "component4", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;", "component5", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "copy", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Signifier;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/BackgroundColor;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/InlineCardTemplate$MicroCompactInlineCard;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Signifier;", "getSignifier", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;", "getHeadline", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/BackgroundColor;", "getBackgroundColor", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;", "getAccessoryContent", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "getCardButton", "Companion", "$serializer", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    @o661
    public static final /* data */ class MicroCompactInlineCard extends InlineCardTemplate {
        public static final int $stable = 0;
        private final AccessoryContent accessoryContent;
        private final BackgroundColor backgroundColor;
        private final Button cardButton;
        private final MessageText headline;
        private final Signifier signifier;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<MicroCompactInlineCard> CREATOR = new Creator();
        private static final znb0[] $childSerializers = {null, null, dm5.S(2, InlineCardTemplate$MicroCompactInlineCard$Companion$$childSerializers$1.INSTANCE), dm5.S(2, InlineCardTemplate$MicroCompactInlineCard$Companion$$childSerializers$2.INSTANCE), null};

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/InlineCardTemplate$MicroCompactInlineCard$Companion;", "", "<init>", "()V", "Lp/nma0;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/InlineCardTemplate$MicroCompactInlineCard;", "serializer", "()Lp/nma0;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final nma0 serializer() {
                return InlineCardTemplate$MicroCompactInlineCard$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<MicroCompactInlineCard> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MicroCompactInlineCard createFromParcel(Parcel parcel) {
                return new MicroCompactInlineCard(parcel.readInt() == 0 ? null : Signifier.CREATOR.createFromParcel(parcel), MessageText.CREATOR.createFromParcel(parcel), (BackgroundColor) parcel.readParcelable(MicroCompactInlineCard.class.getClassLoader()), (AccessoryContent) parcel.readParcelable(MicroCompactInlineCard.class.getClassLoader()), Button.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MicroCompactInlineCard[] newArray(int i) {
                return new MicroCompactInlineCard[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ MicroCompactInlineCard(int i, Signifier signifier, MessageText messageText, BackgroundColor backgroundColor, AccessoryContent accessoryContent, Button button, p661 p661Var) {
            super(i, p661Var);
            if (31 != (i & 31)) {
                o6p1.t(i, 31, InlineCardTemplate$MicroCompactInlineCard$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.signifier = signifier;
            this.headline = messageText;
            this.backgroundColor = backgroundColor;
            this.accessoryContent = accessoryContent;
            this.cardButton = button;
        }

        public static /* synthetic */ MicroCompactInlineCard copy$default(MicroCompactInlineCard microCompactInlineCard, Signifier signifier, MessageText messageText, BackgroundColor backgroundColor, AccessoryContent accessoryContent, Button button, int i, Object obj) {
            if ((i & 1) != 0) {
                signifier = microCompactInlineCard.signifier;
            }
            if ((i & 2) != 0) {
                messageText = microCompactInlineCard.headline;
            }
            if ((i & 4) != 0) {
                backgroundColor = microCompactInlineCard.backgroundColor;
            }
            if ((i & 8) != 0) {
                accessoryContent = microCompactInlineCard.accessoryContent;
            }
            if ((i & 16) != 0) {
                button = microCompactInlineCard.cardButton;
            }
            Button button2 = button;
            BackgroundColor backgroundColor2 = backgroundColor;
            return microCompactInlineCard.copy(signifier, messageText, backgroundColor2, accessoryContent, button2);
        }

        public static final /* synthetic */ void write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk(MicroCompactInlineCard self, z1k output, h661 serialDesc) {
            InlineCardTemplate.write$Self(self, output, serialDesc);
            znb0[] znb0VarArr = $childSerializers;
            output.s(serialDesc, 0, Signifier$$serializer.INSTANCE, self.signifier);
            output.k(serialDesc, 1, MessageText$$serializer.INSTANCE, self.headline);
            output.k(serialDesc, 2, (nma0) znb0VarArr[2].getValue(), self.backgroundColor);
            output.s(serialDesc, 3, (nma0) znb0VarArr[3].getValue(), self.accessoryContent);
            output.k(serialDesc, 4, Button$$serializer.INSTANCE, self.cardButton);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Signifier getSignifier() {
            return this.signifier;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final MessageText getHeadline() {
            return this.headline;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final BackgroundColor getBackgroundColor() {
            return this.backgroundColor;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final AccessoryContent getAccessoryContent() {
            return this.accessoryContent;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Button getCardButton() {
            return this.cardButton;
        }

        public final MicroCompactInlineCard copy(Signifier signifier, MessageText headline, BackgroundColor backgroundColor, AccessoryContent accessoryContent, Button cardButton) {
            return new MicroCompactInlineCard(signifier, headline, backgroundColor, accessoryContent, cardButton);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MicroCompactInlineCard)) {
                return false;
            }
            MicroCompactInlineCard microCompactInlineCard = (MicroCompactInlineCard) other;
            return u890.j(this.signifier, microCompactInlineCard.signifier) && u890.j(this.headline, microCompactInlineCard.headline) && u890.j(this.backgroundColor, microCompactInlineCard.backgroundColor) && u890.j(this.accessoryContent, microCompactInlineCard.accessoryContent) && u890.j(this.cardButton, microCompactInlineCard.cardButton);
        }

        public final AccessoryContent getAccessoryContent() {
            return this.accessoryContent;
        }

        public final BackgroundColor getBackgroundColor() {
            return this.backgroundColor;
        }

        public final Button getCardButton() {
            return this.cardButton;
        }

        public final MessageText getHeadline() {
            return this.headline;
        }

        public final Signifier getSignifier() {
            return this.signifier;
        }

        public int hashCode() {
            Signifier signifier = this.signifier;
            int iHashCode = (this.backgroundColor.hashCode() + i3a.i(this.headline, (signifier == null ? 0 : signifier.hashCode()) * 31, 31)) * 31;
            AccessoryContent accessoryContent = this.accessoryContent;
            return this.cardButton.hashCode() + ((iHashCode + (accessoryContent != null ? accessoryContent.hashCode() : 0)) * 31);
        }

        public String toString() {
            return super.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Signifier signifier = this.signifier;
            if (signifier == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                signifier.writeToParcel(dest, flags);
            }
            this.headline.writeToParcel(dest, flags);
            dest.writeParcelable(this.backgroundColor, flags);
            dest.writeParcelable(this.accessoryContent, flags);
            this.cardButton.writeToParcel(dest, flags);
        }

        public MicroCompactInlineCard(Signifier signifier, MessageText messageText, BackgroundColor backgroundColor, AccessoryContent accessoryContent, Button button) {
            super(null);
            this.signifier = signifier;
            this.headline = messageText;
            this.backgroundColor = backgroundColor;
            this.accessoryContent = accessoryContent;
            this.cardButton = button;
        }
    }

    @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 E2\u00020\u0001:\u0002FEB=\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eBW\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u000f¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\"\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u000f¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b(\u0010'J\u0010\u0010)\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b-\u0010.JR\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00102\u001a\u000201HÖ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b4\u0010\u001eJ\u001a\u00108\u001a\u0002072\b\u00106\u001a\u0004\u0018\u000105HÖ\u0003¢\u0006\u0004\b8\u00109R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010<\u001a\u0004\b=\u0010'R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010<\u001a\u0004\b>\u0010'R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010?\u001a\u0004\b@\u0010*R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010A\u001a\u0004\bB\u0010,R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010C\u001a\u0004\bD\u0010.¨\u0006G"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/InlineCardTemplate$CompactInlineCard;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/InlineCardTemplate;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Signifier;", "signifier", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;", "headline", "body", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/BackgroundColor;", "backgroundColor", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;", "accessoryContent", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "cardButton", "<init>", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Signifier;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/BackgroundColor;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;)V", "", "seen0", "Lp/p661;", "serializationConstructorMarker", "(ILcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Signifier;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/BackgroundColor;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/InlineCardTemplate$CompactInlineCard;Lp/z1k;Lp/h661;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Signifier;", "component2", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;", "component3", "component4", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/BackgroundColor;", "component5", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;", "component6", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "copy", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Signifier;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/BackgroundColor;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/InlineCardTemplate$CompactInlineCard;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Signifier;", "getSignifier", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;", "getHeadline", "getBody", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/BackgroundColor;", "getBackgroundColor", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;", "getAccessoryContent", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "getCardButton", "Companion", "$serializer", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    @o661
    public static final /* data */ class CompactInlineCard extends InlineCardTemplate {
        public static final int $stable = 0;
        private final AccessoryContent accessoryContent;
        private final BackgroundColor backgroundColor;
        private final MessageText body;
        private final Button cardButton;
        private final MessageText headline;
        private final Signifier signifier;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<CompactInlineCard> CREATOR = new Creator();
        private static final znb0[] $childSerializers = {null, null, null, dm5.S(2, InlineCardTemplate$CompactInlineCard$Companion$$childSerializers$1.INSTANCE), dm5.S(2, InlineCardTemplate$CompactInlineCard$Companion$$childSerializers$2.INSTANCE), null};

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/InlineCardTemplate$CompactInlineCard$Companion;", "", "<init>", "()V", "Lp/nma0;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/InlineCardTemplate$CompactInlineCard;", "serializer", "()Lp/nma0;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final nma0 serializer() {
                return InlineCardTemplate$CompactInlineCard$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<CompactInlineCard> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CompactInlineCard createFromParcel(Parcel parcel) {
                Signifier signifierCreateFromParcel = parcel.readInt() == 0 ? null : Signifier.CREATOR.createFromParcel(parcel);
                Parcelable.Creator<MessageText> creator = MessageText.CREATOR;
                return new CompactInlineCard(signifierCreateFromParcel, creator.createFromParcel(parcel), parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null, (BackgroundColor) parcel.readParcelable(CompactInlineCard.class.getClassLoader()), (AccessoryContent) parcel.readParcelable(CompactInlineCard.class.getClassLoader()), Button.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CompactInlineCard[] newArray(int i) {
                return new CompactInlineCard[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ CompactInlineCard(int i, Signifier signifier, MessageText messageText, MessageText messageText2, BackgroundColor backgroundColor, AccessoryContent accessoryContent, Button button, p661 p661Var) {
            super(i, p661Var);
            if (63 != (i & 63)) {
                o6p1.t(i, 63, InlineCardTemplate$CompactInlineCard$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.signifier = signifier;
            this.headline = messageText;
            this.body = messageText2;
            this.backgroundColor = backgroundColor;
            this.accessoryContent = accessoryContent;
            this.cardButton = button;
        }

        public static /* synthetic */ CompactInlineCard copy$default(CompactInlineCard compactInlineCard, Signifier signifier, MessageText messageText, MessageText messageText2, BackgroundColor backgroundColor, AccessoryContent accessoryContent, Button button, int i, Object obj) {
            if ((i & 1) != 0) {
                signifier = compactInlineCard.signifier;
            }
            if ((i & 2) != 0) {
                messageText = compactInlineCard.headline;
            }
            if ((i & 4) != 0) {
                messageText2 = compactInlineCard.body;
            }
            if ((i & 8) != 0) {
                backgroundColor = compactInlineCard.backgroundColor;
            }
            if ((i & 16) != 0) {
                accessoryContent = compactInlineCard.accessoryContent;
            }
            if ((i & 32) != 0) {
                button = compactInlineCard.cardButton;
            }
            AccessoryContent accessoryContent2 = accessoryContent;
            Button button2 = button;
            return compactInlineCard.copy(signifier, messageText, messageText2, backgroundColor, accessoryContent2, button2);
        }

        public static final /* synthetic */ void write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk(CompactInlineCard self, z1k output, h661 serialDesc) {
            InlineCardTemplate.write$Self(self, output, serialDesc);
            znb0[] znb0VarArr = $childSerializers;
            output.s(serialDesc, 0, Signifier$$serializer.INSTANCE, self.signifier);
            MessageText$$serializer messageText$$serializer = MessageText$$serializer.INSTANCE;
            output.k(serialDesc, 1, messageText$$serializer, self.headline);
            output.s(serialDesc, 2, messageText$$serializer, self.body);
            output.k(serialDesc, 3, (nma0) znb0VarArr[3].getValue(), self.backgroundColor);
            output.s(serialDesc, 4, (nma0) znb0VarArr[4].getValue(), self.accessoryContent);
            output.k(serialDesc, 5, Button$$serializer.INSTANCE, self.cardButton);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Signifier getSignifier() {
            return this.signifier;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final MessageText getHeadline() {
            return this.headline;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final MessageText getBody() {
            return this.body;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final BackgroundColor getBackgroundColor() {
            return this.backgroundColor;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final AccessoryContent getAccessoryContent() {
            return this.accessoryContent;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Button getCardButton() {
            return this.cardButton;
        }

        public final CompactInlineCard copy(Signifier signifier, MessageText headline, MessageText body, BackgroundColor backgroundColor, AccessoryContent accessoryContent, Button cardButton) {
            return new CompactInlineCard(signifier, headline, body, backgroundColor, accessoryContent, cardButton);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CompactInlineCard)) {
                return false;
            }
            CompactInlineCard compactInlineCard = (CompactInlineCard) other;
            return u890.j(this.signifier, compactInlineCard.signifier) && u890.j(this.headline, compactInlineCard.headline) && u890.j(this.body, compactInlineCard.body) && u890.j(this.backgroundColor, compactInlineCard.backgroundColor) && u890.j(this.accessoryContent, compactInlineCard.accessoryContent) && u890.j(this.cardButton, compactInlineCard.cardButton);
        }

        public final AccessoryContent getAccessoryContent() {
            return this.accessoryContent;
        }

        public final BackgroundColor getBackgroundColor() {
            return this.backgroundColor;
        }

        public final MessageText getBody() {
            return this.body;
        }

        public final Button getCardButton() {
            return this.cardButton;
        }

        public final MessageText getHeadline() {
            return this.headline;
        }

        public final Signifier getSignifier() {
            return this.signifier;
        }

        public int hashCode() {
            Signifier signifier = this.signifier;
            int i = i3a.i(this.headline, (signifier == null ? 0 : signifier.hashCode()) * 31, 31);
            MessageText messageText = this.body;
            int iHashCode = (this.backgroundColor.hashCode() + ((i + (messageText == null ? 0 : messageText.hashCode())) * 31)) * 31;
            AccessoryContent accessoryContent = this.accessoryContent;
            return this.cardButton.hashCode() + ((iHashCode + (accessoryContent != null ? accessoryContent.hashCode() : 0)) * 31);
        }

        public String toString() {
            return super.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Signifier signifier = this.signifier;
            if (signifier == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                signifier.writeToParcel(dest, flags);
            }
            this.headline.writeToParcel(dest, flags);
            MessageText messageText = this.body;
            if (messageText == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                messageText.writeToParcel(dest, flags);
            }
            dest.writeParcelable(this.backgroundColor, flags);
            dest.writeParcelable(this.accessoryContent, flags);
            this.cardButton.writeToParcel(dest, flags);
        }

        public CompactInlineCard(Signifier signifier, MessageText messageText, MessageText messageText2, BackgroundColor backgroundColor, AccessoryContent accessoryContent, Button button) {
            super(null);
            this.signifier = signifier;
            this.headline = messageText;
            this.body = messageText2;
            this.backgroundColor = backgroundColor;
            this.accessoryContent = accessoryContent;
            this.cardButton = button;
        }
    }

    @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 H2\u00020\u0001:\u0002IHBE\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fBa\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010#\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b)\u0010(J\u0010\u0010*\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b0\u0010/J\\\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00104\u001a\u000203HÖ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b6\u0010\u001fJ\u001a\u0010:\u001a\u0002092\b\u00108\u001a\u0004\u0018\u000107HÖ\u0003¢\u0006\u0004\b:\u0010;R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010<\u001a\u0004\b=\u0010&R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010>\u001a\u0004\b?\u0010(R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010>\u001a\u0004\b@\u0010(R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010A\u001a\u0004\bB\u0010+R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010C\u001a\u0004\bD\u0010-R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010E\u001a\u0004\bF\u0010/R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010E\u001a\u0004\bG\u0010/¨\u0006J"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/InlineCardTemplate$StandardInlineCard;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/InlineCardTemplate;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Signifier;", "signifier", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;", "headline", "body", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/BackgroundColor;", "backgroundColor", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;", "accessoryContent", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "primaryButton", "closeButton", "<init>", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Signifier;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/BackgroundColor;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;)V", "", "seen0", "Lp/p661;", "serializationConstructorMarker", "(ILcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Signifier;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/BackgroundColor;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/InlineCardTemplate$StandardInlineCard;Lp/z1k;Lp/h661;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Signifier;", "component2", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;", "component3", "component4", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/BackgroundColor;", "component5", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;", "component6", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "component7", "copy", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Signifier;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/BackgroundColor;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/InlineCardTemplate$StandardInlineCard;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Signifier;", "getSignifier", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;", "getHeadline", "getBody", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/BackgroundColor;", "getBackgroundColor", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;", "getAccessoryContent", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "getPrimaryButton", "getCloseButton", "Companion", "$serializer", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    @o661
    public static final /* data */ class StandardInlineCard extends InlineCardTemplate {
        public static final int $stable = 0;
        private final AccessoryContent accessoryContent;
        private final BackgroundColor backgroundColor;
        private final MessageText body;
        private final Button closeButton;
        private final MessageText headline;
        private final Button primaryButton;
        private final Signifier signifier;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<StandardInlineCard> CREATOR = new Creator();
        private static final znb0[] $childSerializers = {null, null, null, dm5.S(2, InlineCardTemplate$StandardInlineCard$Companion$$childSerializers$1.INSTANCE), dm5.S(2, InlineCardTemplate$StandardInlineCard$Companion$$childSerializers$2.INSTANCE), null, null};

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/InlineCardTemplate$StandardInlineCard$Companion;", "", "<init>", "()V", "Lp/nma0;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/InlineCardTemplate$StandardInlineCard;", "serializer", "()Lp/nma0;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final nma0 serializer() {
                return InlineCardTemplate$StandardInlineCard$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<StandardInlineCard> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StandardInlineCard createFromParcel(Parcel parcel) {
                Signifier signifierCreateFromParcel = parcel.readInt() == 0 ? null : Signifier.CREATOR.createFromParcel(parcel);
                Parcelable.Creator<MessageText> creator = MessageText.CREATOR;
                MessageText messageTextCreateFromParcel = creator.createFromParcel(parcel);
                MessageText messageTextCreateFromParcel2 = creator.createFromParcel(parcel);
                BackgroundColor backgroundColor = (BackgroundColor) parcel.readParcelable(StandardInlineCard.class.getClassLoader());
                AccessoryContent accessoryContent = (AccessoryContent) parcel.readParcelable(StandardInlineCard.class.getClassLoader());
                Parcelable.Creator<Button> creator2 = Button.CREATOR;
                return new StandardInlineCard(signifierCreateFromParcel, messageTextCreateFromParcel, messageTextCreateFromParcel2, backgroundColor, accessoryContent, creator2.createFromParcel(parcel), parcel.readInt() != 0 ? creator2.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StandardInlineCard[] newArray(int i) {
                return new StandardInlineCard[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ StandardInlineCard(int i, Signifier signifier, MessageText messageText, MessageText messageText2, BackgroundColor backgroundColor, AccessoryContent accessoryContent, Button button, Button button2, p661 p661Var) {
            super(i, p661Var);
            if (127 != (i & 127)) {
                o6p1.t(i, 127, InlineCardTemplate$StandardInlineCard$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.signifier = signifier;
            this.headline = messageText;
            this.body = messageText2;
            this.backgroundColor = backgroundColor;
            this.accessoryContent = accessoryContent;
            this.primaryButton = button;
            this.closeButton = button2;
        }

        public static /* synthetic */ StandardInlineCard copy$default(StandardInlineCard standardInlineCard, Signifier signifier, MessageText messageText, MessageText messageText2, BackgroundColor backgroundColor, AccessoryContent accessoryContent, Button button, Button button2, int i, Object obj) {
            if ((i & 1) != 0) {
                signifier = standardInlineCard.signifier;
            }
            if ((i & 2) != 0) {
                messageText = standardInlineCard.headline;
            }
            if ((i & 4) != 0) {
                messageText2 = standardInlineCard.body;
            }
            if ((i & 8) != 0) {
                backgroundColor = standardInlineCard.backgroundColor;
            }
            if ((i & 16) != 0) {
                accessoryContent = standardInlineCard.accessoryContent;
            }
            if ((i & 32) != 0) {
                button = standardInlineCard.primaryButton;
            }
            if ((i & 64) != 0) {
                button2 = standardInlineCard.closeButton;
            }
            Button button3 = button;
            Button button4 = button2;
            AccessoryContent accessoryContent2 = accessoryContent;
            MessageText messageText3 = messageText2;
            return standardInlineCard.copy(signifier, messageText, messageText3, backgroundColor, accessoryContent2, button3, button4);
        }

        public static final /* synthetic */ void write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk(StandardInlineCard self, z1k output, h661 serialDesc) {
            InlineCardTemplate.write$Self(self, output, serialDesc);
            znb0[] znb0VarArr = $childSerializers;
            output.s(serialDesc, 0, Signifier$$serializer.INSTANCE, self.signifier);
            MessageText$$serializer messageText$$serializer = MessageText$$serializer.INSTANCE;
            output.k(serialDesc, 1, messageText$$serializer, self.headline);
            output.k(serialDesc, 2, messageText$$serializer, self.body);
            output.k(serialDesc, 3, (nma0) znb0VarArr[3].getValue(), self.backgroundColor);
            output.s(serialDesc, 4, (nma0) znb0VarArr[4].getValue(), self.accessoryContent);
            Button$$serializer button$$serializer = Button$$serializer.INSTANCE;
            output.k(serialDesc, 5, button$$serializer, self.primaryButton);
            output.s(serialDesc, 6, button$$serializer, self.closeButton);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Signifier getSignifier() {
            return this.signifier;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final MessageText getHeadline() {
            return this.headline;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final MessageText getBody() {
            return this.body;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final BackgroundColor getBackgroundColor() {
            return this.backgroundColor;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final AccessoryContent getAccessoryContent() {
            return this.accessoryContent;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Button getPrimaryButton() {
            return this.primaryButton;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Button getCloseButton() {
            return this.closeButton;
        }

        public final StandardInlineCard copy(Signifier signifier, MessageText headline, MessageText body, BackgroundColor backgroundColor, AccessoryContent accessoryContent, Button primaryButton, Button closeButton) {
            return new StandardInlineCard(signifier, headline, body, backgroundColor, accessoryContent, primaryButton, closeButton);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StandardInlineCard)) {
                return false;
            }
            StandardInlineCard standardInlineCard = (StandardInlineCard) other;
            return u890.j(this.signifier, standardInlineCard.signifier) && u890.j(this.headline, standardInlineCard.headline) && u890.j(this.body, standardInlineCard.body) && u890.j(this.backgroundColor, standardInlineCard.backgroundColor) && u890.j(this.accessoryContent, standardInlineCard.accessoryContent) && u890.j(this.primaryButton, standardInlineCard.primaryButton) && u890.j(this.closeButton, standardInlineCard.closeButton);
        }

        public final AccessoryContent getAccessoryContent() {
            return this.accessoryContent;
        }

        public final BackgroundColor getBackgroundColor() {
            return this.backgroundColor;
        }

        public final MessageText getBody() {
            return this.body;
        }

        public final Button getCloseButton() {
            return this.closeButton;
        }

        public final MessageText getHeadline() {
            return this.headline;
        }

        public final Button getPrimaryButton() {
            return this.primaryButton;
        }

        public final Signifier getSignifier() {
            return this.signifier;
        }

        public int hashCode() {
            Signifier signifier = this.signifier;
            int iHashCode = (this.backgroundColor.hashCode() + i3a.i(this.body, i3a.i(this.headline, (signifier == null ? 0 : signifier.hashCode()) * 31, 31), 31)) * 31;
            AccessoryContent accessoryContent = this.accessoryContent;
            int iHashCode2 = (this.primaryButton.hashCode() + ((iHashCode + (accessoryContent == null ? 0 : accessoryContent.hashCode())) * 31)) * 31;
            Button button = this.closeButton;
            return iHashCode2 + (button != null ? button.hashCode() : 0);
        }

        public String toString() {
            return super.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Signifier signifier = this.signifier;
            if (signifier == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                signifier.writeToParcel(dest, flags);
            }
            this.headline.writeToParcel(dest, flags);
            this.body.writeToParcel(dest, flags);
            dest.writeParcelable(this.backgroundColor, flags);
            dest.writeParcelable(this.accessoryContent, flags);
            this.primaryButton.writeToParcel(dest, flags);
            Button button = this.closeButton;
            if (button == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                button.writeToParcel(dest, flags);
            }
        }

        public StandardInlineCard(Signifier signifier, MessageText messageText, MessageText messageText2, BackgroundColor backgroundColor, AccessoryContent accessoryContent, Button button, Button button2) {
            super(null);
            this.signifier = signifier;
            this.headline = messageText;
            this.body = messageText2;
            this.backgroundColor = backgroundColor;
            this.accessoryContent = accessoryContent;
            this.primaryButton = button;
            this.closeButton = button2;
        }
    }

    @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 N2\u00020\u0001:\u0002ONB]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0010\u0010\u0011Bu\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010 \u001a\u00020\u0012¢\u0006\u0004\b \u0010!J\u001d\u0010%\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0012¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010(J\u0012\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b2\u00101J\u0012\u00103\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b3\u00101J\u0012\u00104\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b4\u00101Jx\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00108\u001a\u000207HÖ\u0001¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b:\u0010!J\u001a\u0010>\u001a\u00020=2\b\u0010<\u001a\u0004\u0018\u00010;HÖ\u0003¢\u0006\u0004\b>\u0010?R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010@\u001a\u0004\bA\u0010(R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010@\u001a\u0004\bB\u0010(R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010C\u001a\u0004\bD\u0010+R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010E\u001a\u0004\bF\u0010-R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010G\u001a\u0004\bH\u0010/R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010I\u001a\u0004\bJ\u00101R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010I\u001a\u0004\bK\u00101R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010I\u001a\u0004\bL\u00101R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010I\u001a\u0004\bM\u00101¨\u0006P"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/InlineCardTemplate$BaseInlineCard;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/InlineCardTemplate;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;", "headline", "body", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/HeaderContent;", "headerContent", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/BackgroundColor;", "backgroundColor", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;", "accessoryContent", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "primaryButton", "secondaryButton", "cardButton", "dismissButton", "<init>", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/HeaderContent;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/BackgroundColor;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;)V", "", "seen0", "Lp/p661;", "serializationConstructorMarker", "(ILcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/HeaderContent;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/BackgroundColor;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/InlineCardTemplate$BaseInlineCard;Lp/z1k;Lp/h661;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;", "component2", "component3", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/HeaderContent;", "component4", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/BackgroundColor;", "component5", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;", "component6", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "component7", "component8", "component9", "copy", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/HeaderContent;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/BackgroundColor;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/InlineCardTemplate$BaseInlineCard;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;", "getHeadline", "getBody", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/HeaderContent;", "getHeaderContent", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/BackgroundColor;", "getBackgroundColor", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;", "getAccessoryContent", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "getPrimaryButton", "getSecondaryButton", "getCardButton", "getDismissButton", "Companion", "$serializer", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    @o661
    public static final /* data */ class BaseInlineCard extends InlineCardTemplate {
        public static final int $stable = 0;
        private final AccessoryContent accessoryContent;
        private final BackgroundColor backgroundColor;
        private final MessageText body;
        private final Button cardButton;
        private final Button dismissButton;
        private final HeaderContent headerContent;
        private final MessageText headline;
        private final Button primaryButton;
        private final Button secondaryButton;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<BaseInlineCard> CREATOR = new Creator();
        private static final znb0[] $childSerializers = {null, null, dm5.S(2, InlineCardTemplate$BaseInlineCard$Companion$$childSerializers$1.INSTANCE), dm5.S(2, InlineCardTemplate$BaseInlineCard$Companion$$childSerializers$2.INSTANCE), dm5.S(2, InlineCardTemplate$BaseInlineCard$Companion$$childSerializers$3.INSTANCE), null, null, null, null};

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/InlineCardTemplate$BaseInlineCard$Companion;", "", "<init>", "()V", "Lp/nma0;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/InlineCardTemplate$BaseInlineCard;", "serializer", "()Lp/nma0;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final nma0 serializer() {
                return InlineCardTemplate$BaseInlineCard$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<BaseInlineCard> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BaseInlineCard createFromParcel(Parcel parcel) {
                Parcelable.Creator<MessageText> creator = MessageText.CREATOR;
                return new BaseInlineCard(creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), (HeaderContent) parcel.readParcelable(BaseInlineCard.class.getClassLoader()), (BackgroundColor) parcel.readParcelable(BaseInlineCard.class.getClassLoader()), (AccessoryContent) parcel.readParcelable(BaseInlineCard.class.getClassLoader()), parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Button.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BaseInlineCard[] newArray(int i) {
                return new BaseInlineCard[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ BaseInlineCard(int i, MessageText messageText, MessageText messageText2, HeaderContent headerContent, BackgroundColor backgroundColor, AccessoryContent accessoryContent, Button button, Button button2, Button button3, Button button4, p661 p661Var) {
            super(i, p661Var);
            if (511 != (i & 511)) {
                o6p1.t(i, 511, InlineCardTemplate$BaseInlineCard$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.headline = messageText;
            this.body = messageText2;
            this.headerContent = headerContent;
            this.backgroundColor = backgroundColor;
            this.accessoryContent = accessoryContent;
            this.primaryButton = button;
            this.secondaryButton = button2;
            this.cardButton = button3;
            this.dismissButton = button4;
        }

        public static /* synthetic */ BaseInlineCard copy$default(BaseInlineCard baseInlineCard, MessageText messageText, MessageText messageText2, HeaderContent headerContent, BackgroundColor backgroundColor, AccessoryContent accessoryContent, Button button, Button button2, Button button3, Button button4, int i, Object obj) {
            if ((i & 1) != 0) {
                messageText = baseInlineCard.headline;
            }
            if ((i & 2) != 0) {
                messageText2 = baseInlineCard.body;
            }
            if ((i & 4) != 0) {
                headerContent = baseInlineCard.headerContent;
            }
            if ((i & 8) != 0) {
                backgroundColor = baseInlineCard.backgroundColor;
            }
            if ((i & 16) != 0) {
                accessoryContent = baseInlineCard.accessoryContent;
            }
            if ((i & 32) != 0) {
                button = baseInlineCard.primaryButton;
            }
            if ((i & 64) != 0) {
                button2 = baseInlineCard.secondaryButton;
            }
            if ((i & 128) != 0) {
                button3 = baseInlineCard.cardButton;
            }
            if ((i & 256) != 0) {
                button4 = baseInlineCard.dismissButton;
            }
            Button button5 = button3;
            Button button6 = button4;
            Button button7 = button;
            Button button8 = button2;
            AccessoryContent accessoryContent2 = accessoryContent;
            HeaderContent headerContent2 = headerContent;
            return baseInlineCard.copy(messageText, messageText2, headerContent2, backgroundColor, accessoryContent2, button7, button8, button5, button6);
        }

        public static final /* synthetic */ void write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk(BaseInlineCard self, z1k output, h661 serialDesc) {
            InlineCardTemplate.write$Self(self, output, serialDesc);
            znb0[] znb0VarArr = $childSerializers;
            MessageText$$serializer messageText$$serializer = MessageText$$serializer.INSTANCE;
            output.k(serialDesc, 0, messageText$$serializer, self.headline);
            output.s(serialDesc, 1, messageText$$serializer, self.body);
            output.s(serialDesc, 2, (nma0) znb0VarArr[2].getValue(), self.headerContent);
            output.k(serialDesc, 3, (nma0) znb0VarArr[3].getValue(), self.backgroundColor);
            output.s(serialDesc, 4, (nma0) znb0VarArr[4].getValue(), self.accessoryContent);
            Button$$serializer button$$serializer = Button$$serializer.INSTANCE;
            output.s(serialDesc, 5, button$$serializer, self.primaryButton);
            output.s(serialDesc, 6, button$$serializer, self.secondaryButton);
            output.s(serialDesc, 7, button$$serializer, self.cardButton);
            output.s(serialDesc, 8, button$$serializer, self.dismissButton);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final MessageText getHeadline() {
            return this.headline;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final MessageText getBody() {
            return this.body;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final HeaderContent getHeaderContent() {
            return this.headerContent;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final BackgroundColor getBackgroundColor() {
            return this.backgroundColor;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final AccessoryContent getAccessoryContent() {
            return this.accessoryContent;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Button getPrimaryButton() {
            return this.primaryButton;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Button getSecondaryButton() {
            return this.secondaryButton;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final Button getCardButton() {
            return this.cardButton;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final Button getDismissButton() {
            return this.dismissButton;
        }

        public final BaseInlineCard copy(MessageText headline, MessageText body, HeaderContent headerContent, BackgroundColor backgroundColor, AccessoryContent accessoryContent, Button primaryButton, Button secondaryButton, Button cardButton, Button dismissButton) {
            return new BaseInlineCard(headline, body, headerContent, backgroundColor, accessoryContent, primaryButton, secondaryButton, cardButton, dismissButton);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BaseInlineCard)) {
                return false;
            }
            BaseInlineCard baseInlineCard = (BaseInlineCard) other;
            return u890.j(this.headline, baseInlineCard.headline) && u890.j(this.body, baseInlineCard.body) && u890.j(this.headerContent, baseInlineCard.headerContent) && u890.j(this.backgroundColor, baseInlineCard.backgroundColor) && u890.j(this.accessoryContent, baseInlineCard.accessoryContent) && u890.j(this.primaryButton, baseInlineCard.primaryButton) && u890.j(this.secondaryButton, baseInlineCard.secondaryButton) && u890.j(this.cardButton, baseInlineCard.cardButton) && u890.j(this.dismissButton, baseInlineCard.dismissButton);
        }

        public final AccessoryContent getAccessoryContent() {
            return this.accessoryContent;
        }

        public final BackgroundColor getBackgroundColor() {
            return this.backgroundColor;
        }

        public final MessageText getBody() {
            return this.body;
        }

        public final Button getCardButton() {
            return this.cardButton;
        }

        public final Button getDismissButton() {
            return this.dismissButton;
        }

        public final HeaderContent getHeaderContent() {
            return this.headerContent;
        }

        public final MessageText getHeadline() {
            return this.headline;
        }

        public final Button getPrimaryButton() {
            return this.primaryButton;
        }

        public final Button getSecondaryButton() {
            return this.secondaryButton;
        }

        public int hashCode() {
            int iHashCode = this.headline.hashCode() * 31;
            MessageText messageText = this.body;
            int iHashCode2 = (iHashCode + (messageText == null ? 0 : messageText.hashCode())) * 31;
            HeaderContent headerContent = this.headerContent;
            int iHashCode3 = (this.backgroundColor.hashCode() + ((iHashCode2 + (headerContent == null ? 0 : headerContent.hashCode())) * 31)) * 31;
            AccessoryContent accessoryContent = this.accessoryContent;
            int iHashCode4 = (iHashCode3 + (accessoryContent == null ? 0 : accessoryContent.hashCode())) * 31;
            Button button = this.primaryButton;
            int iHashCode5 = (iHashCode4 + (button == null ? 0 : button.hashCode())) * 31;
            Button button2 = this.secondaryButton;
            int iHashCode6 = (iHashCode5 + (button2 == null ? 0 : button2.hashCode())) * 31;
            Button button3 = this.cardButton;
            int iHashCode7 = (iHashCode6 + (button3 == null ? 0 : button3.hashCode())) * 31;
            Button button4 = this.dismissButton;
            return iHashCode7 + (button4 != null ? button4.hashCode() : 0);
        }

        public String toString() {
            return super.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            this.headline.writeToParcel(dest, flags);
            MessageText messageText = this.body;
            if (messageText == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                messageText.writeToParcel(dest, flags);
            }
            dest.writeParcelable(this.headerContent, flags);
            dest.writeParcelable(this.backgroundColor, flags);
            dest.writeParcelable(this.accessoryContent, flags);
            Button button = this.primaryButton;
            if (button == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                button.writeToParcel(dest, flags);
            }
            Button button2 = this.secondaryButton;
            if (button2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                button2.writeToParcel(dest, flags);
            }
            Button button3 = this.cardButton;
            if (button3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                button3.writeToParcel(dest, flags);
            }
            Button button4 = this.dismissButton;
            if (button4 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                button4.writeToParcel(dest, flags);
            }
        }

        public BaseInlineCard(MessageText messageText, MessageText messageText2, HeaderContent headerContent, BackgroundColor backgroundColor, AccessoryContent accessoryContent, Button button, Button button2, Button button3, Button button4) {
            super(null);
            this.headline = messageText;
            this.body = messageText2;
            this.headerContent = headerContent;
            this.backgroundColor = backgroundColor;
            this.accessoryContent = accessoryContent;
            this.primaryButton = button;
            this.secondaryButton = button2;
            this.cardButton = button3;
            this.dismissButton = button4;
        }
    }

    public static final /* synthetic */ void write$Self(InlineCardTemplate self, z1k output, h661 serialDesc) {
    }
}
