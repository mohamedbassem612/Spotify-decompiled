package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button$$serializer;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Disclaimer;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Disclaimer$;
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
import p.chc1;
import p.cy30;
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
import p.tcv0;
import p.tka0;
import p.u890;
import p.z1k;
import p.znb0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00122\u00020\u00012\u00020\u0002:\u0007\u0013\u0014\u0015\u0016\u0017\u0018\u0012B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004B\u001b\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0003\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0001\u0006\u0019\u001a\u001b\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BottomSheetTemplate;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageTemplate;", "Landroid/os/Parcelable;", "<init>", "()V", "", "seen0", "Lp/p661;", "serializationConstructorMarker", "(ILp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "write$Self", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BottomSheetTemplate;Lp/z1k;Lp/h661;)V", "Companion", "Undefined", "BaseBottomSheet", "BasicBottomSheet", "RichBottomSheet", "FullBleedBottomSheet", "CustomBottomSheet", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BottomSheetTemplate$BaseBottomSheet;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BottomSheetTemplate$BasicBottomSheet;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BottomSheetTemplate$CustomBottomSheet;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BottomSheetTemplate$FullBleedBottomSheet;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BottomSheetTemplate$RichBottomSheet;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BottomSheetTemplate$Undefined;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
@o661
public abstract class BottomSheetTemplate implements MessageTemplate, Parcelable {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final znb0 $cachedSerializer$delegate = dm5.S(2, Companion.AnonymousClass1.INSTANCE);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BottomSheetTemplate$Companion;", "", "<init>", "()V", "Lp/nma0;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BottomSheetTemplate;", "serializer", "()Lp/nma0;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    public static final class Companion {

        /* JADX INFO: renamed from: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.BottomSheetTemplate$Companion$1, reason: invalid class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
        public static final class AnonymousClass1 extends hab0 implements Function0 {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final nma0 invoke() {
                jd11 jd11Var = rc11.a;
                return new fv41("com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.BottomSheetTemplate", jd11Var.b(BottomSheetTemplate.class), new tka0[]{jd11Var.b(BaseBottomSheet.class), jd11Var.b(BasicBottomSheet.class), jd11Var.b(CustomBottomSheet.class), jd11Var.b(FullBleedBottomSheet.class), jd11Var.b(RichBottomSheet.class), jd11Var.b(Undefined.class)}, new nma0[]{BottomSheetTemplate$BaseBottomSheet$$serializer.INSTANCE, BottomSheetTemplate$BasicBottomSheet$$serializer.INSTANCE, new BottomSheetTemplate$CustomBottomSheet$.serializer(new tcv0(jd11Var.b(Object.class), new Annotation[0]), new tcv0(jd11Var.b(Object.class), new Annotation[0]), new tcv0(jd11Var.b(Object.class), new Annotation[0])), BottomSheetTemplate$FullBleedBottomSheet$$serializer.INSTANCE, BottomSheetTemplate$RichBottomSheet$$serializer.INSTANCE, new pfp0("com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.BottomSheetTemplate.Undefined", Undefined.INSTANCE, new Annotation[0])}, new Annotation[0]);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ nma0 get$cachedSerializer() {
            return (nma0) BottomSheetTemplate.$cachedSerializer$delegate.getValue();
        }

        public final nma0 serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\r¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BottomSheetTemplate$Undefined;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BottomSheetTemplate;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/rih1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lp/nma0;", "serializer", "()Lp/nma0;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    @o661
    public static final class Undefined extends BottomSheetTemplate {
        public static final int $stable = 0;
        public static final Undefined INSTANCE = new Undefined();
        public static final Parcelable.Creator<Undefined> CREATOR = new Creator();
        private static final /* synthetic */ znb0 $cachedSerializer$delegate = dm5.S(2, AnonymousClass1.INSTANCE);

        /* JADX INFO: renamed from: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.BottomSheetTemplate$Undefined$1, reason: invalid class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
        public static final class AnonymousClass1 extends hab0 implements Function0 {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final nma0 invoke() {
                return new pfp0("com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.BottomSheetTemplate.Undefined", Undefined.INSTANCE, new Annotation[0]);
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

    public /* synthetic */ BottomSheetTemplate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private BottomSheetTemplate() {
    }

    public /* synthetic */ BottomSheetTemplate(int i, p661 p661Var) {
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b$\u0010#J<\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010 J\u0010\u0010(\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b(\u0010\u0019J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b2\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b3\u0010#¨\u00066"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BottomSheetTemplate$BasicBottomSheet;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BottomSheetTemplate;", "", "headline", "body", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "primaryButton", "secondaryButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;)V", "", "seen0", "Lp/p661;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BottomSheetTemplate$BasicBottomSheet;Lp/z1k;Lp/h661;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BottomSheetTemplate$BasicBottomSheet;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHeadline", "getBody", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "getPrimaryButton", "getSecondaryButton", "Companion", "$serializer", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    @o661
    public static final /* data */ class BasicBottomSheet extends BottomSheetTemplate {
        public static final int $stable = 0;
        private final String body;
        private final String headline;
        private final Button primaryButton;
        private final Button secondaryButton;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<BasicBottomSheet> CREATOR = new Creator();

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BottomSheetTemplate$BasicBottomSheet$Companion;", "", "<init>", "()V", "Lp/nma0;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BottomSheetTemplate$BasicBottomSheet;", "serializer", "()Lp/nma0;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final nma0 serializer() {
                return BottomSheetTemplate$BasicBottomSheet$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<BasicBottomSheet> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BasicBottomSheet createFromParcel(Parcel parcel) {
                return new BasicBottomSheet(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Button.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BasicBottomSheet[] newArray(int i) {
                return new BasicBottomSheet[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ BasicBottomSheet(int i, String str, String str2, Button button, Button button2, p661 p661Var) {
            super(i, p661Var);
            if (15 != (i & 15)) {
                o6p1.t(i, 15, BottomSheetTemplate$BasicBottomSheet$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.headline = str;
            this.body = str2;
            this.primaryButton = button;
            this.secondaryButton = button2;
        }

        public static /* synthetic */ BasicBottomSheet copy$default(BasicBottomSheet basicBottomSheet, String str, String str2, Button button, Button button2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = basicBottomSheet.headline;
            }
            if ((i & 2) != 0) {
                str2 = basicBottomSheet.body;
            }
            if ((i & 4) != 0) {
                button = basicBottomSheet.primaryButton;
            }
            if ((i & 8) != 0) {
                button2 = basicBottomSheet.secondaryButton;
            }
            return basicBottomSheet.copy(str, str2, button, button2);
        }

        public static final /* synthetic */ void write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk(BasicBottomSheet self, z1k output, h661 serialDesc) {
            BottomSheetTemplate.write$Self(self, output, serialDesc);
            output.G(serialDesc, 0, self.headline);
            output.G(serialDesc, 1, self.body);
            Button$$serializer button$$serializer = Button$$serializer.INSTANCE;
            output.s(serialDesc, 2, button$$serializer, self.primaryButton);
            output.s(serialDesc, 3, button$$serializer, self.secondaryButton);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getHeadline() {
            return this.headline;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getBody() {
            return this.body;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Button getPrimaryButton() {
            return this.primaryButton;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Button getSecondaryButton() {
            return this.secondaryButton;
        }

        public final BasicBottomSheet copy(String headline, String body, Button primaryButton, Button secondaryButton) {
            return new BasicBottomSheet(headline, body, primaryButton, secondaryButton);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BasicBottomSheet)) {
                return false;
            }
            BasicBottomSheet basicBottomSheet = (BasicBottomSheet) other;
            return u890.j(this.headline, basicBottomSheet.headline) && u890.j(this.body, basicBottomSheet.body) && u890.j(this.primaryButton, basicBottomSheet.primaryButton) && u890.j(this.secondaryButton, basicBottomSheet.secondaryButton);
        }

        public final String getBody() {
            return this.body;
        }

        public final String getHeadline() {
            return this.headline;
        }

        public final Button getPrimaryButton() {
            return this.primaryButton;
        }

        public final Button getSecondaryButton() {
            return this.secondaryButton;
        }

        public int hashCode() {
            int iD = cy30.d(this.headline.hashCode() * 31, 31, this.body);
            Button button = this.primaryButton;
            int iHashCode = (iD + (button == null ? 0 : button.hashCode())) * 31;
            Button button2 = this.secondaryButton;
            return iHashCode + (button2 != null ? button2.hashCode() : 0);
        }

        public String toString() {
            return super.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.headline);
            dest.writeString(this.body);
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
        }

        public BasicBottomSheet(String str, String str2, Button button, Button button2) {
            super(null);
            this.headline = str;
            this.body = str2;
            this.primaryButton = button;
            this.secondaryButton = button2;
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0012\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b&\u0010%JF\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010!J\u0010\u0010*\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b*\u0010\u001aJ\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010!R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b3\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010%R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b6\u0010%¨\u00069"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BottomSheetTemplate$FullBleedBottomSheet;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BottomSheetTemplate;", "", "headline", "body", "imageUrl", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "primaryButton", "secondaryButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;)V", "", "seen0", "Lp/p661;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BottomSheetTemplate$FullBleedBottomSheet;Lp/z1k;Lp/h661;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BottomSheetTemplate$FullBleedBottomSheet;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHeadline", "getBody", "getImageUrl", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "getPrimaryButton", "getSecondaryButton", "Companion", "$serializer", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    @o661
    public static final /* data */ class FullBleedBottomSheet extends BottomSheetTemplate {
        public static final int $stable = 0;
        private final String body;
        private final String headline;
        private final String imageUrl;
        private final Button primaryButton;
        private final Button secondaryButton;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<FullBleedBottomSheet> CREATOR = new Creator();

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BottomSheetTemplate$FullBleedBottomSheet$Companion;", "", "<init>", "()V", "Lp/nma0;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BottomSheetTemplate$FullBleedBottomSheet;", "serializer", "()Lp/nma0;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final nma0 serializer() {
                return BottomSheetTemplate$FullBleedBottomSheet$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<FullBleedBottomSheet> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FullBleedBottomSheet createFromParcel(Parcel parcel) {
                return new FullBleedBottomSheet(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Button.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FullBleedBottomSheet[] newArray(int i) {
                return new FullBleedBottomSheet[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ FullBleedBottomSheet(int i, String str, String str2, String str3, Button button, Button button2, p661 p661Var) {
            super(i, p661Var);
            if (31 != (i & 31)) {
                o6p1.t(i, 31, BottomSheetTemplate$FullBleedBottomSheet$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.headline = str;
            this.body = str2;
            this.imageUrl = str3;
            this.primaryButton = button;
            this.secondaryButton = button2;
        }

        public static /* synthetic */ FullBleedBottomSheet copy$default(FullBleedBottomSheet fullBleedBottomSheet, String str, String str2, String str3, Button button, Button button2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fullBleedBottomSheet.headline;
            }
            if ((i & 2) != 0) {
                str2 = fullBleedBottomSheet.body;
            }
            if ((i & 4) != 0) {
                str3 = fullBleedBottomSheet.imageUrl;
            }
            if ((i & 8) != 0) {
                button = fullBleedBottomSheet.primaryButton;
            }
            if ((i & 16) != 0) {
                button2 = fullBleedBottomSheet.secondaryButton;
            }
            Button button3 = button2;
            String str4 = str3;
            return fullBleedBottomSheet.copy(str, str2, str4, button, button3);
        }

        public static final /* synthetic */ void write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk(FullBleedBottomSheet self, z1k output, h661 serialDesc) {
            BottomSheetTemplate.write$Self(self, output, serialDesc);
            output.G(serialDesc, 0, self.headline);
            output.G(serialDesc, 1, self.body);
            output.G(serialDesc, 2, self.imageUrl);
            Button$$serializer button$$serializer = Button$$serializer.INSTANCE;
            output.s(serialDesc, 3, button$$serializer, self.primaryButton);
            output.s(serialDesc, 4, button$$serializer, self.secondaryButton);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getHeadline() {
            return this.headline;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getBody() {
            return this.body;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Button getPrimaryButton() {
            return this.primaryButton;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Button getSecondaryButton() {
            return this.secondaryButton;
        }

        public final FullBleedBottomSheet copy(String headline, String body, String imageUrl, Button primaryButton, Button secondaryButton) {
            return new FullBleedBottomSheet(headline, body, imageUrl, primaryButton, secondaryButton);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FullBleedBottomSheet)) {
                return false;
            }
            FullBleedBottomSheet fullBleedBottomSheet = (FullBleedBottomSheet) other;
            return u890.j(this.headline, fullBleedBottomSheet.headline) && u890.j(this.body, fullBleedBottomSheet.body) && u890.j(this.imageUrl, fullBleedBottomSheet.imageUrl) && u890.j(this.primaryButton, fullBleedBottomSheet.primaryButton) && u890.j(this.secondaryButton, fullBleedBottomSheet.secondaryButton);
        }

        public final String getBody() {
            return this.body;
        }

        public final String getHeadline() {
            return this.headline;
        }

        public final String getImageUrl() {
            return this.imageUrl;
        }

        public final Button getPrimaryButton() {
            return this.primaryButton;
        }

        public final Button getSecondaryButton() {
            return this.secondaryButton;
        }

        public int hashCode() {
            int iD = cy30.d(cy30.d(this.headline.hashCode() * 31, 31, this.body), 31, this.imageUrl);
            Button button = this.primaryButton;
            int iHashCode = (iD + (button == null ? 0 : button.hashCode())) * 31;
            Button button2 = this.secondaryButton;
            return iHashCode + (button2 != null ? button2.hashCode() : 0);
        }

        public String toString() {
            return super.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.headline);
            dest.writeString(this.body);
            dest.writeString(this.imageUrl);
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
        }

        public FullBleedBottomSheet(String str, String str2, String str3, Button button, Button button2) {
            super(null);
            this.headline = str;
            this.body = str2;
            this.imageUrl = str3;
            this.primaryButton = button;
            this.secondaryButton = button2;
        }
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>=B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fBW\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010 \u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\r¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0010\u0010'\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b'\u0010%J\u0012\u0010(\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b*\u0010)JT\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b-\u0010%J\u0010\u0010.\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b.\u0010\u001cJ\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b2\u00103R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010#R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b7\u0010%R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b8\u0010%R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b9\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b;\u0010)R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\b<\u0010)¨\u0006?"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BottomSheetTemplate$RichBottomSheet;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BottomSheetTemplate;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Signifier;", "signifier", "", "imageUrl", "headline", "body", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "primaryButton", "secondaryButton", "<init>", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Signifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;)V", "", "seen0", "Lp/p661;", "serializationConstructorMarker", "(ILcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Signifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BottomSheetTemplate$RichBottomSheet;Lp/z1k;Lp/h661;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Signifier;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "component6", "copy", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Signifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BottomSheetTemplate$RichBottomSheet;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Signifier;", "getSignifier", "Ljava/lang/String;", "getImageUrl", "getHeadline", "getBody", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "getPrimaryButton", "getSecondaryButton", "Companion", "$serializer", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    @o661
    public static final /* data */ class RichBottomSheet extends BottomSheetTemplate {
        public static final int $stable = 0;
        private final String body;
        private final String headline;
        private final String imageUrl;
        private final Button primaryButton;
        private final Button secondaryButton;
        private final Signifier signifier;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<RichBottomSheet> CREATOR = new Creator();

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BottomSheetTemplate$RichBottomSheet$Companion;", "", "<init>", "()V", "Lp/nma0;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BottomSheetTemplate$RichBottomSheet;", "serializer", "()Lp/nma0;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final nma0 serializer() {
                return BottomSheetTemplate$RichBottomSheet$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<RichBottomSheet> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RichBottomSheet createFromParcel(Parcel parcel) {
                return new RichBottomSheet(parcel.readInt() == 0 ? null : Signifier.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Button.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RichBottomSheet[] newArray(int i) {
                return new RichBottomSheet[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ RichBottomSheet(int i, Signifier signifier, String str, String str2, String str3, Button button, Button button2, p661 p661Var) {
            super(i, p661Var);
            if (63 != (i & 63)) {
                o6p1.t(i, 63, BottomSheetTemplate$RichBottomSheet$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.signifier = signifier;
            this.imageUrl = str;
            this.headline = str2;
            this.body = str3;
            this.primaryButton = button;
            this.secondaryButton = button2;
        }

        public static /* synthetic */ RichBottomSheet copy$default(RichBottomSheet richBottomSheet, Signifier signifier, String str, String str2, String str3, Button button, Button button2, int i, Object obj) {
            if ((i & 1) != 0) {
                signifier = richBottomSheet.signifier;
            }
            if ((i & 2) != 0) {
                str = richBottomSheet.imageUrl;
            }
            if ((i & 4) != 0) {
                str2 = richBottomSheet.headline;
            }
            if ((i & 8) != 0) {
                str3 = richBottomSheet.body;
            }
            if ((i & 16) != 0) {
                button = richBottomSheet.primaryButton;
            }
            if ((i & 32) != 0) {
                button2 = richBottomSheet.secondaryButton;
            }
            Button button3 = button;
            Button button4 = button2;
            return richBottomSheet.copy(signifier, str, str2, str3, button3, button4);
        }

        public static final /* synthetic */ void write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk(RichBottomSheet self, z1k output, h661 serialDesc) {
            BottomSheetTemplate.write$Self(self, output, serialDesc);
            output.s(serialDesc, 0, Signifier$$serializer.INSTANCE, self.signifier);
            output.s(serialDesc, 1, chc1.a, self.imageUrl);
            output.G(serialDesc, 2, self.headline);
            output.G(serialDesc, 3, self.body);
            Button$$serializer button$$serializer = Button$$serializer.INSTANCE;
            output.s(serialDesc, 4, button$$serializer, self.primaryButton);
            output.s(serialDesc, 5, button$$serializer, self.secondaryButton);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Signifier getSignifier() {
            return this.signifier;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getHeadline() {
            return this.headline;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getBody() {
            return this.body;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Button getPrimaryButton() {
            return this.primaryButton;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Button getSecondaryButton() {
            return this.secondaryButton;
        }

        public final RichBottomSheet copy(Signifier signifier, String imageUrl, String headline, String body, Button primaryButton, Button secondaryButton) {
            return new RichBottomSheet(signifier, imageUrl, headline, body, primaryButton, secondaryButton);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RichBottomSheet)) {
                return false;
            }
            RichBottomSheet richBottomSheet = (RichBottomSheet) other;
            return u890.j(this.signifier, richBottomSheet.signifier) && u890.j(this.imageUrl, richBottomSheet.imageUrl) && u890.j(this.headline, richBottomSheet.headline) && u890.j(this.body, richBottomSheet.body) && u890.j(this.primaryButton, richBottomSheet.primaryButton) && u890.j(this.secondaryButton, richBottomSheet.secondaryButton);
        }

        public final String getBody() {
            return this.body;
        }

        public final String getHeadline() {
            return this.headline;
        }

        public final String getImageUrl() {
            return this.imageUrl;
        }

        public final Button getPrimaryButton() {
            return this.primaryButton;
        }

        public final Button getSecondaryButton() {
            return this.secondaryButton;
        }

        public final Signifier getSignifier() {
            return this.signifier;
        }

        public int hashCode() {
            Signifier signifier = this.signifier;
            int iHashCode = (signifier == null ? 0 : signifier.hashCode()) * 31;
            String str = this.imageUrl;
            int iD = cy30.d(cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.headline), 31, this.body);
            Button button = this.primaryButton;
            int iHashCode2 = (iD + (button == null ? 0 : button.hashCode())) * 31;
            Button button2 = this.secondaryButton;
            return iHashCode2 + (button2 != null ? button2.hashCode() : 0);
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
            dest.writeString(this.imageUrl);
            dest.writeString(this.headline);
            dest.writeString(this.body);
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
        }

        public RichBottomSheet(Signifier signifier, String str, String str2, String str3, Button button, Button button2) {
            super(null);
            this.signifier = signifier;
            this.imageUrl = str;
            this.headline = str2;
            this.body = str3;
            this.primaryButton = button;
            this.secondaryButton = button2;
        }
    }

    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 H2\u00020\u0001:\u0002IHBI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBa\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010#\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b+\u0010*J\u0012\u0010,\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b.\u0010-J\u0012\u0010/\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b/\u00100J`\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00104\u001a\u000203HÖ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b6\u0010\u001fJ\u001a\u0010:\u001a\u0002092\b\u00108\u001a\u0004\u0018\u000107HÖ\u0003¢\u0006\u0004\b:\u0010;R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010<\u001a\u0004\b=\u0010&R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010>\u001a\u0004\b?\u0010(R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010@\u001a\u0004\bA\u0010*R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010@\u001a\u0004\bB\u0010*R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010C\u001a\u0004\bD\u0010-R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010C\u001a\u0004\bE\u0010-R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010F\u001a\u0004\bG\u00100¨\u0006J"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BottomSheetTemplate$BaseBottomSheet;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BottomSheetTemplate;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/HeaderContent;", "headerContent", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;", "accessoryContent", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;", "headline", "body", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "primaryButton", "secondaryButton", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Disclaimer;", "disclaimer", "<init>", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/HeaderContent;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Disclaimer;)V", "", "seen0", "Lp/p661;", "serializationConstructorMarker", "(ILcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/HeaderContent;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Disclaimer;Lp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BottomSheetTemplate$BaseBottomSheet;Lp/z1k;Lp/h661;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/HeaderContent;", "component2", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;", "component3", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;", "component4", "component5", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "component6", "component7", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Disclaimer;", "copy", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/HeaderContent;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Disclaimer;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BottomSheetTemplate$BaseBottomSheet;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/HeaderContent;", "getHeaderContent", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;", "getAccessoryContent", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;", "getHeadline", "getBody", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "getPrimaryButton", "getSecondaryButton", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Disclaimer;", "getDisclaimer", "Companion", "$serializer", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    @o661
    public static final /* data */ class BaseBottomSheet extends BottomSheetTemplate {
        public static final int $stable = 0;
        private final AccessoryContent accessoryContent;
        private final MessageText body;
        private final Disclaimer disclaimer;
        private final HeaderContent headerContent;
        private final MessageText headline;
        private final Button primaryButton;
        private final Button secondaryButton;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<BaseBottomSheet> CREATOR = new Creator();
        private static final znb0[] $childSerializers = {dm5.S(2, BottomSheetTemplate$BaseBottomSheet$Companion$$childSerializers$1.INSTANCE), dm5.S(2, BottomSheetTemplate$BaseBottomSheet$Companion$$childSerializers$2.INSTANCE), null, null, null, null, null};

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BottomSheetTemplate$BaseBottomSheet$Companion;", "", "<init>", "()V", "Lp/nma0;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BottomSheetTemplate$BaseBottomSheet;", "serializer", "()Lp/nma0;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final nma0 serializer() {
                return BottomSheetTemplate$BaseBottomSheet$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<BaseBottomSheet> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BaseBottomSheet createFromParcel(Parcel parcel) {
                HeaderContent headerContent = (HeaderContent) parcel.readParcelable(BaseBottomSheet.class.getClassLoader());
                AccessoryContent accessoryContent = (AccessoryContent) parcel.readParcelable(BaseBottomSheet.class.getClassLoader());
                Parcelable.Creator<MessageText> creator = MessageText.CREATOR;
                return new BaseBottomSheet(headerContent, accessoryContent, creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel), (Disclaimer) (parcel.readInt() != 0 ? Disclaimer.CREATOR.createFromParcel(parcel) : null));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BaseBottomSheet[] newArray(int i) {
                return new BaseBottomSheet[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ BaseBottomSheet(int i, HeaderContent headerContent, AccessoryContent accessoryContent, MessageText messageText, MessageText messageText2, Button button, Button button2, Disclaimer disclaimer, p661 p661Var) {
            super(i, p661Var);
            if (127 != (i & 127)) {
                o6p1.t(i, 127, BottomSheetTemplate$BaseBottomSheet$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.headerContent = headerContent;
            this.accessoryContent = accessoryContent;
            this.headline = messageText;
            this.body = messageText2;
            this.primaryButton = button;
            this.secondaryButton = button2;
            this.disclaimer = disclaimer;
        }

        public static /* synthetic */ BaseBottomSheet copy$default(BaseBottomSheet baseBottomSheet, HeaderContent headerContent, AccessoryContent accessoryContent, MessageText messageText, MessageText messageText2, Button button, Button button2, Disclaimer disclaimer, int i, Object obj) {
            if ((i & 1) != 0) {
                headerContent = baseBottomSheet.headerContent;
            }
            if ((i & 2) != 0) {
                accessoryContent = baseBottomSheet.accessoryContent;
            }
            if ((i & 4) != 0) {
                messageText = baseBottomSheet.headline;
            }
            if ((i & 8) != 0) {
                messageText2 = baseBottomSheet.body;
            }
            if ((i & 16) != 0) {
                button = baseBottomSheet.primaryButton;
            }
            if ((i & 32) != 0) {
                button2 = baseBottomSheet.secondaryButton;
            }
            if ((i & 64) != 0) {
                disclaimer = baseBottomSheet.disclaimer;
            }
            Button button3 = button2;
            Disclaimer disclaimer2 = disclaimer;
            Button button4 = button;
            MessageText messageText3 = messageText;
            return baseBottomSheet.copy(headerContent, accessoryContent, messageText3, messageText2, button4, button3, disclaimer2);
        }

        public static final /* synthetic */ void write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk(BaseBottomSheet self, z1k output, h661 serialDesc) {
            BottomSheetTemplate.write$Self(self, output, serialDesc);
            znb0[] znb0VarArr = $childSerializers;
            output.s(serialDesc, 0, (nma0) znb0VarArr[0].getValue(), self.headerContent);
            output.s(serialDesc, 1, (nma0) znb0VarArr[1].getValue(), self.accessoryContent);
            MessageText$$serializer messageText$$serializer = MessageText$$serializer.INSTANCE;
            output.k(serialDesc, 2, messageText$$serializer, self.headline);
            output.k(serialDesc, 3, messageText$$serializer, self.body);
            Button$$serializer button$$serializer = Button$$serializer.INSTANCE;
            output.s(serialDesc, 4, button$$serializer, self.primaryButton);
            output.s(serialDesc, 5, button$$serializer, self.secondaryButton);
            output.s(serialDesc, 6, Disclaimer$.serializer.INSTANCE, self.disclaimer);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final HeaderContent getHeaderContent() {
            return this.headerContent;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final AccessoryContent getAccessoryContent() {
            return this.accessoryContent;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final MessageText getHeadline() {
            return this.headline;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final MessageText getBody() {
            return this.body;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Button getPrimaryButton() {
            return this.primaryButton;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Button getSecondaryButton() {
            return this.secondaryButton;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Disclaimer getDisclaimer() {
            return this.disclaimer;
        }

        public final BaseBottomSheet copy(HeaderContent headerContent, AccessoryContent accessoryContent, MessageText headline, MessageText body, Button primaryButton, Button secondaryButton, Disclaimer disclaimer) {
            return new BaseBottomSheet(headerContent, accessoryContent, headline, body, primaryButton, secondaryButton, disclaimer);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BaseBottomSheet)) {
                return false;
            }
            BaseBottomSheet baseBottomSheet = (BaseBottomSheet) other;
            return u890.j(this.headerContent, baseBottomSheet.headerContent) && u890.j(this.accessoryContent, baseBottomSheet.accessoryContent) && u890.j(this.headline, baseBottomSheet.headline) && u890.j(this.body, baseBottomSheet.body) && u890.j(this.primaryButton, baseBottomSheet.primaryButton) && u890.j(this.secondaryButton, baseBottomSheet.secondaryButton) && u890.j(this.disclaimer, baseBottomSheet.disclaimer);
        }

        public final AccessoryContent getAccessoryContent() {
            return this.accessoryContent;
        }

        public final MessageText getBody() {
            return this.body;
        }

        public final Disclaimer getDisclaimer() {
            return this.disclaimer;
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
            HeaderContent headerContent = this.headerContent;
            int iHashCode = (headerContent == null ? 0 : headerContent.hashCode()) * 31;
            AccessoryContent accessoryContent = this.accessoryContent;
            int i = i3a.i(this.body, i3a.i(this.headline, (iHashCode + (accessoryContent == null ? 0 : accessoryContent.hashCode())) * 31, 31), 31);
            Button button = this.primaryButton;
            int iHashCode2 = (i + (button == null ? 0 : button.hashCode())) * 31;
            Button button2 = this.secondaryButton;
            int iHashCode3 = (iHashCode2 + (button2 == null ? 0 : button2.hashCode())) * 31;
            Disclaimer disclaimer = this.disclaimer;
            return iHashCode3 + (disclaimer != null ? disclaimer.hashCode() : 0);
        }

        public String toString() {
            return super.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.headerContent, flags);
            dest.writeParcelable(this.accessoryContent, flags);
            this.headline.writeToParcel(dest, flags);
            this.body.writeToParcel(dest, flags);
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
            Disclaimer disclaimer = this.disclaimer;
            if (disclaimer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                disclaimer.writeToParcel(dest, flags);
            }
        }

        public BaseBottomSheet(HeaderContent headerContent, AccessoryContent accessoryContent, MessageText messageText, MessageText messageText2, Button button, Button button2, Disclaimer disclaimer) {
            super(null);
            this.headerContent = headerContent;
            this.accessoryContent = accessoryContent;
            this.headline = messageText;
            this.body = messageText2;
            this.primaryButton = button;
            this.secondaryButton = button2;
            this.disclaimer = disclaimer;
        }
    }

    public static final /* synthetic */ void write$Self(BottomSheetTemplate self, z1k output, h661 serialDesc) {
    }
}
