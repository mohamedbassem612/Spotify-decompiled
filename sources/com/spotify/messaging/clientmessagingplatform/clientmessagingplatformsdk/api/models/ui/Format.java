package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.UndefinedMessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.BannerTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.BottomSheetTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.FullscreenTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.InlineCardTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.ModalTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.SnackBarTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.TooltipAnchorView;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.TooltipArrowDirection;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.TooltipTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.WebViewTemplate;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.dm5;
import p.fv41;
import p.h661;
import p.hab0;
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
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00152\u00020\u0001:\n\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\t\u001f !\"#$%&'¨\u0006("}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format;", "Landroid/os/Parcelable;", "<init>", "()V", "", "seen0", "Lp/p661;", "serializationConstructorMarker", "(ILp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "write$Self", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format;Lp/z1k;Lp/h661;)V", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageTemplate;", "getTemplate", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageTemplate;", "template", "Companion", "Modal", "Fullscreen", "Banner", "Tooltip", "SnackBar", "BottomSheet", "InlineCard", "WebView", "UndefinedFormat", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$Banner;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$BottomSheet;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$Fullscreen;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$InlineCard;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$Modal;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$SnackBar;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$Tooltip;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$UndefinedFormat;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$WebView;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
@o661
public abstract class Format implements Parcelable {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final znb0 $cachedSerializer$delegate = dm5.S(2, Companion.AnonymousClass1.INSTANCE);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$Companion;", "", "<init>", "()V", "Lp/nma0;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format;", "serializer", "()Lp/nma0;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    public static final class Companion {

        /* JADX INFO: renamed from: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Format$Companion$1, reason: invalid class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
        public static final class AnonymousClass1 extends hab0 implements Function0 {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final nma0 invoke() {
                jd11 jd11Var = rc11.a;
                return new fv41("com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Format", jd11Var.b(Format.class), new tka0[]{jd11Var.b(Banner.class), jd11Var.b(BottomSheet.class), jd11Var.b(Fullscreen.class), jd11Var.b(InlineCard.class), jd11Var.b(Modal.class), jd11Var.b(SnackBar.class), jd11Var.b(Tooltip.class), jd11Var.b(UndefinedFormat.class), jd11Var.b(WebView.class)}, new nma0[]{Format$Banner$$serializer.INSTANCE, Format$BottomSheet$$serializer.INSTANCE, Format$Fullscreen$$serializer.INSTANCE, Format$InlineCard$$serializer.INSTANCE, Format$Modal$$serializer.INSTANCE, Format$SnackBar$$serializer.INSTANCE, Format$Tooltip$$serializer.INSTANCE, new pfp0("com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Format.UndefinedFormat", UndefinedFormat.INSTANCE, new Annotation[0]), Format$WebView$$serializer.INSTANCE}, new Annotation[0]);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ nma0 get$cachedSerializer() {
            return (nma0) Format.$cachedSerializer$delegate.getValue();
        }

        public final nma0 serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    public /* synthetic */ Format(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract MessageTemplate getTemplate();

    private Format() {
    }

    public /* synthetic */ Format(int i, p661 p661Var) {
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010\u0015J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001c¨\u0006,"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$Banner;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BannerTemplate;", "template", "<init>", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BannerTemplate;)V", "", "seen0", "Lp/p661;", "serializationConstructorMarker", "(ILcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BannerTemplate;Lp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$Banner;Lp/z1k;Lp/h661;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BannerTemplate;", "copy", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BannerTemplate;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$Banner;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BannerTemplate;", "getTemplate", "Companion", "$serializer", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    @o661
    public static final /* data */ class Banner extends Format {
        public static final int $stable = 0;
        private final BannerTemplate template;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Banner> CREATOR = new Creator();
        private static final znb0[] $childSerializers = {dm5.S(2, Format$Banner$Companion$$childSerializers$1.INSTANCE)};

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$Banner$Companion;", "", "<init>", "()V", "Lp/nma0;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$Banner;", "serializer", "()Lp/nma0;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final nma0 serializer() {
                return Format$Banner$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<Banner> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Banner createFromParcel(Parcel parcel) {
                return new Banner((BannerTemplate) parcel.readParcelable(Banner.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Banner[] newArray(int i) {
                return new Banner[i];
            }
        }

        public /* synthetic */ Banner(int i, BannerTemplate bannerTemplate, p661 p661Var) {
            super(i, p661Var);
            if ((i & 1) == 0) {
                this.template = BannerTemplate.Undefined.INSTANCE;
            } else {
                this.template = bannerTemplate;
            }
        }

        public static /* synthetic */ Banner copy$default(Banner banner, BannerTemplate bannerTemplate, int i, Object obj) {
            if ((i & 1) != 0) {
                bannerTemplate = banner.template;
            }
            return banner.copy(bannerTemplate);
        }

        public static final /* synthetic */ void write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk(Banner self, z1k output, h661 serialDesc) {
            Format.write$Self(self, output, serialDesc);
            znb0[] znb0VarArr = $childSerializers;
            if (!output.d0() && u890.j(self.getTemplate(), BannerTemplate.Undefined.INSTANCE)) {
                return;
            }
            output.k(serialDesc, 0, (nma0) znb0VarArr[0].getValue(), self.getTemplate());
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final BannerTemplate getTemplate() {
            return this.template;
        }

        public final Banner copy(BannerTemplate template) {
            return new Banner(template);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Banner) && u890.j(this.template, ((Banner) other).template);
        }

        public int hashCode() {
            return this.template.hashCode();
        }

        public String toString() {
            return super.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.template, flags);
        }

        @Override // com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Format
        public BannerTemplate getTemplate() {
            return this.template;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Banner() {
            this((BannerTemplate) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public Banner(BannerTemplate bannerTemplate) {
            super(null);
            this.template = bannerTemplate;
        }

        public /* synthetic */ Banner(BannerTemplate bannerTemplate, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? BannerTemplate.Undefined.INSTANCE : bannerTemplate);
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010\u0015J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001c¨\u0006,"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$BottomSheet;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BottomSheetTemplate;", "template", "<init>", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BottomSheetTemplate;)V", "", "seen0", "Lp/p661;", "serializationConstructorMarker", "(ILcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BottomSheetTemplate;Lp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$BottomSheet;Lp/z1k;Lp/h661;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BottomSheetTemplate;", "copy", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BottomSheetTemplate;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$BottomSheet;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BottomSheetTemplate;", "getTemplate", "Companion", "$serializer", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    @o661
    public static final /* data */ class BottomSheet extends Format {
        public static final int $stable = 0;
        private final BottomSheetTemplate template;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<BottomSheet> CREATOR = new Creator();
        private static final znb0[] $childSerializers = {dm5.S(2, Format$BottomSheet$Companion$$childSerializers$1.INSTANCE)};

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$BottomSheet$Companion;", "", "<init>", "()V", "Lp/nma0;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$BottomSheet;", "serializer", "()Lp/nma0;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final nma0 serializer() {
                return Format$BottomSheet$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<BottomSheet> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BottomSheet createFromParcel(Parcel parcel) {
                return new BottomSheet((BottomSheetTemplate) parcel.readParcelable(BottomSheet.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BottomSheet[] newArray(int i) {
                return new BottomSheet[i];
            }
        }

        public /* synthetic */ BottomSheet(int i, BottomSheetTemplate bottomSheetTemplate, p661 p661Var) {
            super(i, p661Var);
            if ((i & 1) == 0) {
                this.template = BottomSheetTemplate.Undefined.INSTANCE;
            } else {
                this.template = bottomSheetTemplate;
            }
        }

        public static /* synthetic */ BottomSheet copy$default(BottomSheet bottomSheet, BottomSheetTemplate bottomSheetTemplate, int i, Object obj) {
            if ((i & 1) != 0) {
                bottomSheetTemplate = bottomSheet.template;
            }
            return bottomSheet.copy(bottomSheetTemplate);
        }

        public static final /* synthetic */ void write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk(BottomSheet self, z1k output, h661 serialDesc) {
            Format.write$Self(self, output, serialDesc);
            znb0[] znb0VarArr = $childSerializers;
            if (!output.d0() && u890.j(self.getTemplate(), BottomSheetTemplate.Undefined.INSTANCE)) {
                return;
            }
            output.k(serialDesc, 0, (nma0) znb0VarArr[0].getValue(), self.getTemplate());
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final BottomSheetTemplate getTemplate() {
            return this.template;
        }

        public final BottomSheet copy(BottomSheetTemplate template) {
            return new BottomSheet(template);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BottomSheet) && u890.j(this.template, ((BottomSheet) other).template);
        }

        public int hashCode() {
            return this.template.hashCode();
        }

        public String toString() {
            return super.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.template, flags);
        }

        @Override // com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Format
        public BottomSheetTemplate getTemplate() {
            return this.template;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public BottomSheet() {
            this((BottomSheetTemplate) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public BottomSheet(BottomSheetTemplate bottomSheetTemplate) {
            super(null);
            this.template = bottomSheetTemplate;
        }

        public /* synthetic */ BottomSheet(BottomSheetTemplate bottomSheetTemplate, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? BottomSheetTemplate.Undefined.INSTANCE : bottomSheetTemplate);
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010\u0015J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001c¨\u0006,"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$Fullscreen;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/FullscreenTemplate;", "template", "<init>", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/FullscreenTemplate;)V", "", "seen0", "Lp/p661;", "serializationConstructorMarker", "(ILcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/FullscreenTemplate;Lp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$Fullscreen;Lp/z1k;Lp/h661;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/FullscreenTemplate;", "copy", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/FullscreenTemplate;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$Fullscreen;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/FullscreenTemplate;", "getTemplate", "Companion", "$serializer", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    @o661
    public static final /* data */ class Fullscreen extends Format {
        public static final int $stable = 0;
        private final FullscreenTemplate template;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Fullscreen> CREATOR = new Creator();
        private static final znb0[] $childSerializers = {dm5.S(2, Format$Fullscreen$Companion$$childSerializers$1.INSTANCE)};

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$Fullscreen$Companion;", "", "<init>", "()V", "Lp/nma0;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$Fullscreen;", "serializer", "()Lp/nma0;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final nma0 serializer() {
                return Format$Fullscreen$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<Fullscreen> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Fullscreen createFromParcel(Parcel parcel) {
                return new Fullscreen((FullscreenTemplate) parcel.readParcelable(Fullscreen.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Fullscreen[] newArray(int i) {
                return new Fullscreen[i];
            }
        }

        public /* synthetic */ Fullscreen(int i, FullscreenTemplate fullscreenTemplate, p661 p661Var) {
            super(i, p661Var);
            if ((i & 1) == 0) {
                this.template = FullscreenTemplate.Undefined.INSTANCE;
            } else {
                this.template = fullscreenTemplate;
            }
        }

        public static /* synthetic */ Fullscreen copy$default(Fullscreen fullscreen, FullscreenTemplate fullscreenTemplate, int i, Object obj) {
            if ((i & 1) != 0) {
                fullscreenTemplate = fullscreen.template;
            }
            return fullscreen.copy(fullscreenTemplate);
        }

        public static final /* synthetic */ void write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk(Fullscreen self, z1k output, h661 serialDesc) {
            Format.write$Self(self, output, serialDesc);
            znb0[] znb0VarArr = $childSerializers;
            if (!output.d0() && u890.j(self.getTemplate(), FullscreenTemplate.Undefined.INSTANCE)) {
                return;
            }
            output.k(serialDesc, 0, (nma0) znb0VarArr[0].getValue(), self.getTemplate());
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final FullscreenTemplate getTemplate() {
            return this.template;
        }

        public final Fullscreen copy(FullscreenTemplate template) {
            return new Fullscreen(template);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Fullscreen) && u890.j(this.template, ((Fullscreen) other).template);
        }

        public int hashCode() {
            return this.template.hashCode();
        }

        public String toString() {
            return super.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.template, flags);
        }

        @Override // com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Format
        public FullscreenTemplate getTemplate() {
            return this.template;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Fullscreen() {
            this((FullscreenTemplate) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public Fullscreen(FullscreenTemplate fullscreenTemplate) {
            super(null);
            this.template = fullscreenTemplate;
        }

        public /* synthetic */ Fullscreen(FullscreenTemplate fullscreenTemplate, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? FullscreenTemplate.Undefined.INSTANCE : fullscreenTemplate);
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010\u0015J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001c¨\u0006,"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$InlineCard;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/InlineCardTemplate;", "template", "<init>", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/InlineCardTemplate;)V", "", "seen0", "Lp/p661;", "serializationConstructorMarker", "(ILcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/InlineCardTemplate;Lp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$InlineCard;Lp/z1k;Lp/h661;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/InlineCardTemplate;", "copy", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/InlineCardTemplate;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$InlineCard;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/InlineCardTemplate;", "getTemplate", "Companion", "$serializer", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    @o661
    public static final /* data */ class InlineCard extends Format {
        public static final int $stable = 0;
        private final InlineCardTemplate template;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<InlineCard> CREATOR = new Creator();
        private static final znb0[] $childSerializers = {dm5.S(2, Format$InlineCard$Companion$$childSerializers$1.INSTANCE)};

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$InlineCard$Companion;", "", "<init>", "()V", "Lp/nma0;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$InlineCard;", "serializer", "()Lp/nma0;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final nma0 serializer() {
                return Format$InlineCard$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<InlineCard> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InlineCard createFromParcel(Parcel parcel) {
                return new InlineCard((InlineCardTemplate) parcel.readParcelable(InlineCard.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InlineCard[] newArray(int i) {
                return new InlineCard[i];
            }
        }

        public /* synthetic */ InlineCard(int i, InlineCardTemplate inlineCardTemplate, p661 p661Var) {
            super(i, p661Var);
            if ((i & 1) == 0) {
                this.template = InlineCardTemplate.Undefined.INSTANCE;
            } else {
                this.template = inlineCardTemplate;
            }
        }

        public static /* synthetic */ InlineCard copy$default(InlineCard inlineCard, InlineCardTemplate inlineCardTemplate, int i, Object obj) {
            if ((i & 1) != 0) {
                inlineCardTemplate = inlineCard.template;
            }
            return inlineCard.copy(inlineCardTemplate);
        }

        public static final /* synthetic */ void write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk(InlineCard self, z1k output, h661 serialDesc) {
            Format.write$Self(self, output, serialDesc);
            znb0[] znb0VarArr = $childSerializers;
            if (!output.d0() && u890.j(self.getTemplate(), InlineCardTemplate.Undefined.INSTANCE)) {
                return;
            }
            output.k(serialDesc, 0, (nma0) znb0VarArr[0].getValue(), self.getTemplate());
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final InlineCardTemplate getTemplate() {
            return this.template;
        }

        public final InlineCard copy(InlineCardTemplate template) {
            return new InlineCard(template);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InlineCard) && u890.j(this.template, ((InlineCard) other).template);
        }

        public int hashCode() {
            return this.template.hashCode();
        }

        public String toString() {
            return super.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.template, flags);
        }

        @Override // com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Format
        public InlineCardTemplate getTemplate() {
            return this.template;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public InlineCard() {
            this((InlineCardTemplate) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public InlineCard(InlineCardTemplate inlineCardTemplate) {
            super(null);
            this.template = inlineCardTemplate;
        }

        public /* synthetic */ InlineCard(InlineCardTemplate inlineCardTemplate, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? InlineCardTemplate.Undefined.INSTANCE : inlineCardTemplate);
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010\u0015J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001c¨\u0006,"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$Modal;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/ModalTemplate;", "template", "<init>", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/ModalTemplate;)V", "", "seen0", "Lp/p661;", "serializationConstructorMarker", "(ILcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/ModalTemplate;Lp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$Modal;Lp/z1k;Lp/h661;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/ModalTemplate;", "copy", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/ModalTemplate;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$Modal;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/ModalTemplate;", "getTemplate", "Companion", "$serializer", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    @o661
    public static final /* data */ class Modal extends Format {
        public static final int $stable = 0;
        private final ModalTemplate template;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Modal> CREATOR = new Creator();
        private static final znb0[] $childSerializers = {dm5.S(2, Format$Modal$Companion$$childSerializers$1.INSTANCE)};

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$Modal$Companion;", "", "<init>", "()V", "Lp/nma0;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$Modal;", "serializer", "()Lp/nma0;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final nma0 serializer() {
                return Format$Modal$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<Modal> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Modal createFromParcel(Parcel parcel) {
                return new Modal((ModalTemplate) parcel.readParcelable(Modal.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Modal[] newArray(int i) {
                return new Modal[i];
            }
        }

        public /* synthetic */ Modal(int i, ModalTemplate modalTemplate, p661 p661Var) {
            super(i, p661Var);
            if ((i & 1) == 0) {
                this.template = ModalTemplate.Undefined.INSTANCE;
            } else {
                this.template = modalTemplate;
            }
        }

        public static /* synthetic */ Modal copy$default(Modal modal, ModalTemplate modalTemplate, int i, Object obj) {
            if ((i & 1) != 0) {
                modalTemplate = modal.template;
            }
            return modal.copy(modalTemplate);
        }

        public static final /* synthetic */ void write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk(Modal self, z1k output, h661 serialDesc) {
            Format.write$Self(self, output, serialDesc);
            znb0[] znb0VarArr = $childSerializers;
            if (!output.d0() && u890.j(self.getTemplate(), ModalTemplate.Undefined.INSTANCE)) {
                return;
            }
            output.k(serialDesc, 0, (nma0) znb0VarArr[0].getValue(), self.getTemplate());
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ModalTemplate getTemplate() {
            return this.template;
        }

        public final Modal copy(ModalTemplate template) {
            return new Modal(template);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Modal) && u890.j(this.template, ((Modal) other).template);
        }

        public int hashCode() {
            return this.template.hashCode();
        }

        public String toString() {
            return super.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.template, flags);
        }

        @Override // com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Format
        public ModalTemplate getTemplate() {
            return this.template;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Modal() {
            this((ModalTemplate) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public Modal(ModalTemplate modalTemplate) {
            super(null);
            this.template = modalTemplate;
        }

        public /* synthetic */ Modal(ModalTemplate modalTemplate, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ModalTemplate.Undefined.INSTANCE : modalTemplate);
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J$\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b&\u0010\u0017J\u001a\u0010)\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010 ¨\u00061"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$SnackBar;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/SnackBarTemplate;", "template", "", "autoDismissEnabled", "<init>", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/SnackBarTemplate;Z)V", "", "seen0", "Lp/p661;", "serializationConstructorMarker", "(ILcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/SnackBarTemplate;ZLp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$SnackBar;Lp/z1k;Lp/h661;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/SnackBarTemplate;", "component2", "()Z", "copy", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/SnackBarTemplate;Z)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$SnackBar;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/SnackBarTemplate;", "getTemplate", "Z", "getAutoDismissEnabled", "Companion", "$serializer", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    @o661
    public static final /* data */ class SnackBar extends Format {
        public static final int $stable = 0;
        private final boolean autoDismissEnabled;
        private final SnackBarTemplate template;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<SnackBar> CREATOR = new Creator();
        private static final znb0[] $childSerializers = {dm5.S(2, Format$SnackBar$Companion$$childSerializers$1.INSTANCE), null};

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$SnackBar$Companion;", "", "<init>", "()V", "Lp/nma0;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$SnackBar;", "serializer", "()Lp/nma0;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final nma0 serializer() {
                return Format$SnackBar$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<SnackBar> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SnackBar createFromParcel(Parcel parcel) {
                return new SnackBar((SnackBarTemplate) parcel.readParcelable(SnackBar.class.getClassLoader()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SnackBar[] newArray(int i) {
                return new SnackBar[i];
            }
        }

        public /* synthetic */ SnackBar(int i, SnackBarTemplate snackBarTemplate, boolean z, p661 p661Var) {
            super(i, p661Var);
            this.template = (i & 1) == 0 ? SnackBarTemplate.Undefined.INSTANCE : snackBarTemplate;
            if ((i & 2) == 0) {
                this.autoDismissEnabled = true;
            } else {
                this.autoDismissEnabled = z;
            }
        }

        public static /* synthetic */ SnackBar copy$default(SnackBar snackBar, SnackBarTemplate snackBarTemplate, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                snackBarTemplate = snackBar.template;
            }
            if ((i & 2) != 0) {
                z = snackBar.autoDismissEnabled;
            }
            return snackBar.copy(snackBarTemplate, z);
        }

        public static final /* synthetic */ void write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk(SnackBar self, z1k output, h661 serialDesc) {
            Format.write$Self(self, output, serialDesc);
            znb0[] znb0VarArr = $childSerializers;
            if (output.d0() || !u890.j(self.getTemplate(), SnackBarTemplate.Undefined.INSTANCE)) {
                output.k(serialDesc, 0, (nma0) znb0VarArr[0].getValue(), self.getTemplate());
            }
            if (!output.d0() && self.autoDismissEnabled) {
                return;
            }
            output.E(serialDesc, 1, self.autoDismissEnabled);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final SnackBarTemplate getTemplate() {
            return this.template;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getAutoDismissEnabled() {
            return this.autoDismissEnabled;
        }

        public final SnackBar copy(SnackBarTemplate template, boolean autoDismissEnabled) {
            return new SnackBar(template, autoDismissEnabled);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SnackBar)) {
                return false;
            }
            SnackBar snackBar = (SnackBar) other;
            return u890.j(this.template, snackBar.template) && this.autoDismissEnabled == snackBar.autoDismissEnabled;
        }

        public final boolean getAutoDismissEnabled() {
            return this.autoDismissEnabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.autoDismissEnabled) + (this.template.hashCode() * 31);
        }

        public String toString() {
            return super.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.template, flags);
            dest.writeInt(this.autoDismissEnabled ? 1 : 0);
        }

        @Override // com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Format
        public SnackBarTemplate getTemplate() {
            return this.template;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SnackBar() {
            this((SnackBarTemplate) null, false, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public SnackBar(SnackBarTemplate snackBarTemplate, boolean z) {
            super(null);
            this.template = snackBarTemplate;
            this.autoDismissEnabled = z;
        }

        public /* synthetic */ SnackBar(SnackBarTemplate snackBarTemplate, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? SnackBarTemplate.Undefined.INSTANCE : snackBarTemplate, (i & 2) != 0 ? true : z);
        }
    }

    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=<B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBA\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b'\u0010(J8\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b.\u0010\u001bJ\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b2\u00103R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b7\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b9\u0010&R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b;\u0010(¨\u0006>"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$Tooltip;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/TooltipTemplate;", "template", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/TooltipAnchorView;", "anchorView", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/TooltipArrowDirection;", "tooltipDirection", "", "durationMillis", "<init>", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/TooltipTemplate;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/TooltipAnchorView;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/TooltipArrowDirection;J)V", "", "seen0", "Lp/p661;", "serializationConstructorMarker", "(ILcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/TooltipTemplate;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/TooltipAnchorView;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/TooltipArrowDirection;JLp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$Tooltip;Lp/z1k;Lp/h661;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/TooltipTemplate;", "component2", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/TooltipAnchorView;", "component3", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/TooltipArrowDirection;", "component4", "()J", "copy", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/TooltipTemplate;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/TooltipAnchorView;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/TooltipArrowDirection;J)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$Tooltip;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/TooltipTemplate;", "getTemplate", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/TooltipAnchorView;", "getAnchorView", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/TooltipArrowDirection;", "getTooltipDirection", "J", "getDurationMillis", "Companion", "$serializer", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    @o661
    public static final /* data */ class Tooltip extends Format {
        public static final int $stable = 0;
        private final TooltipAnchorView anchorView;
        private final long durationMillis;
        private final TooltipTemplate template;
        private final TooltipArrowDirection tooltipDirection;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Tooltip> CREATOR = new Creator();
        private static final znb0[] $childSerializers = {dm5.S(2, Format$Tooltip$Companion$$childSerializers$1.INSTANCE), dm5.S(2, Format$Tooltip$Companion$$childSerializers$2.INSTANCE), dm5.S(2, Format$Tooltip$Companion$$childSerializers$3.INSTANCE), null};

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$Tooltip$Companion;", "", "<init>", "()V", "Lp/nma0;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$Tooltip;", "serializer", "()Lp/nma0;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final nma0 serializer() {
                return Format$Tooltip$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<Tooltip> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Tooltip createFromParcel(Parcel parcel) {
                return new Tooltip((TooltipTemplate) parcel.readParcelable(Tooltip.class.getClassLoader()), parcel.readParcelable(Tooltip.class.getClassLoader()), (TooltipArrowDirection) TooltipArrowDirection.CREATOR.createFromParcel(parcel), parcel.readLong());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Tooltip[] newArray(int i) {
                return new Tooltip[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Tooltip(int i, TooltipTemplate tooltipTemplate, TooltipAnchorView tooltipAnchorView, TooltipArrowDirection tooltipArrowDirection, long j, p661 p661Var) {
            super(i, p661Var);
            if (2 != (i & 2)) {
                o6p1.t(i, 2, Format$Tooltip$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.template = (i & 1) == 0 ? TooltipTemplate.Undefined.INSTANCE : tooltipTemplate;
            this.anchorView = tooltipAnchorView;
            if ((i & 4) == 0) {
                this.tooltipDirection = TooltipArrowDirection.BOTTOM;
            } else {
                this.tooltipDirection = tooltipArrowDirection;
            }
            if ((i & 8) == 0) {
                this.durationMillis = 5000L;
            } else {
                this.durationMillis = j;
            }
        }

        public static /* synthetic */ Tooltip copy$default(Tooltip tooltip, TooltipTemplate tooltipTemplate, TooltipAnchorView tooltipAnchorView, TooltipArrowDirection tooltipArrowDirection, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                tooltipTemplate = tooltip.template;
            }
            if ((i & 2) != 0) {
                tooltipAnchorView = tooltip.anchorView;
            }
            if ((i & 4) != 0) {
                tooltipArrowDirection = tooltip.tooltipDirection;
            }
            if ((i & 8) != 0) {
                j = tooltip.durationMillis;
            }
            TooltipArrowDirection tooltipArrowDirection2 = tooltipArrowDirection;
            return tooltip.copy(tooltipTemplate, tooltipAnchorView, tooltipArrowDirection2, j);
        }

        public static final /* synthetic */ void write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk(Tooltip self, z1k output, h661 serialDesc) {
            Format.write$Self(self, output, serialDesc);
            znb0[] znb0VarArr = $childSerializers;
            if (output.d0() || !u890.j(self.getTemplate(), TooltipTemplate.Undefined.INSTANCE)) {
                output.k(serialDesc, 0, (nma0) znb0VarArr[0].getValue(), self.getTemplate());
            }
            output.k(serialDesc, 1, (nma0) znb0VarArr[1].getValue(), self.anchorView);
            if (output.d0() || self.tooltipDirection != TooltipArrowDirection.BOTTOM) {
                output.k(serialDesc, 2, (nma0) znb0VarArr[2].getValue(), self.tooltipDirection);
            }
            if (!output.d0() && self.durationMillis == 5000) {
                return;
            }
            output.l(serialDesc, 3, self.durationMillis);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final TooltipTemplate getTemplate() {
            return this.template;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final TooltipAnchorView getAnchorView() {
            return this.anchorView;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final TooltipArrowDirection getTooltipDirection() {
            return this.tooltipDirection;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final long getDurationMillis() {
            return this.durationMillis;
        }

        public final Tooltip copy(TooltipTemplate template, TooltipAnchorView anchorView, TooltipArrowDirection tooltipDirection, long durationMillis) {
            return new Tooltip(template, anchorView, tooltipDirection, durationMillis);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Tooltip)) {
                return false;
            }
            Tooltip tooltip = (Tooltip) other;
            return u890.j(this.template, tooltip.template) && u890.j(this.anchorView, tooltip.anchorView) && this.tooltipDirection == tooltip.tooltipDirection && this.durationMillis == tooltip.durationMillis;
        }

        public final TooltipAnchorView getAnchorView() {
            return this.anchorView;
        }

        public final long getDurationMillis() {
            return this.durationMillis;
        }

        public final TooltipArrowDirection getTooltipDirection() {
            return this.tooltipDirection;
        }

        public int hashCode() {
            return Long.hashCode(this.durationMillis) + ((this.tooltipDirection.hashCode() + ((this.anchorView.hashCode() + (this.template.hashCode() * 31)) * 31)) * 31);
        }

        public String toString() {
            return super.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.template, flags);
            dest.writeParcelable(this.anchorView, flags);
            this.tooltipDirection.writeToParcel(dest, flags);
            dest.writeLong(this.durationMillis);
        }

        @Override // com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Format
        public TooltipTemplate getTemplate() {
            return this.template;
        }

        public Tooltip(TooltipTemplate tooltipTemplate, TooltipAnchorView tooltipAnchorView, TooltipArrowDirection tooltipArrowDirection, long j) {
            super(null);
            this.template = tooltipTemplate;
            this.anchorView = tooltipAnchorView;
            this.tooltipDirection = tooltipArrowDirection;
            this.durationMillis = j;
        }

        public /* synthetic */ Tooltip(TooltipTemplate tooltipTemplate, TooltipAnchorView tooltipAnchorView, TooltipArrowDirection tooltipArrowDirection, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? TooltipTemplate.Undefined.INSTANCE : tooltipTemplate, tooltipAnchorView, (i & 4) != 0 ? TooltipArrowDirection.BOTTOM : tooltipArrowDirection, (i & 8) != 0 ? 5000L : j);
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0006J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$UndefinedFormat;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/rih1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lp/nma0;", "serializer", "()Lp/nma0;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/UndefinedMessageTemplate;", "template", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/UndefinedMessageTemplate;", "getTemplate", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/UndefinedMessageTemplate;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    @o661
    public static final /* data */ class UndefinedFormat extends Format {
        public static final int $stable = 0;
        public static final UndefinedFormat INSTANCE = new UndefinedFormat();
        private static final UndefinedMessageTemplate template = UndefinedMessageTemplate.INSTANCE;
        public static final Parcelable.Creator<UndefinedFormat> CREATOR = new Creator();
        private static final /* synthetic */ znb0 $cachedSerializer$delegate = dm5.S(2, 1.INSTANCE);

        @Metadata(k = 3, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<UndefinedFormat> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UndefinedFormat createFromParcel(Parcel parcel) {
                parcel.readInt();
                return UndefinedFormat.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UndefinedFormat[] newArray(int i) {
                return new UndefinedFormat[i];
            }
        }

        private UndefinedFormat() {
            super(null);
        }

        private final /* synthetic */ nma0 get$cachedSerializer() {
            return (nma0) $cachedSerializer$delegate.getValue();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof UndefinedFormat);
        }

        public int hashCode() {
            return 440685293;
        }

        public final nma0 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "UndefinedFormat";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Override // com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Format
        public UndefinedMessageTemplate getTemplate() {
            return template;
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010\u0015J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001c¨\u0006,"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$WebView;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/WebViewTemplate;", "template", "<init>", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/WebViewTemplate;)V", "", "seen0", "Lp/p661;", "serializationConstructorMarker", "(ILcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/WebViewTemplate;Lp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$WebView;Lp/z1k;Lp/h661;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/WebViewTemplate;", "copy", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/WebViewTemplate;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$WebView;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/WebViewTemplate;", "getTemplate", "Companion", "$serializer", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    @o661
    public static final /* data */ class WebView extends Format {
        public static final int $stable = 0;
        private final WebViewTemplate template;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<WebView> CREATOR = new Creator();
        private static final znb0[] $childSerializers = {dm5.S(2, Format$WebView$Companion$$childSerializers$1.INSTANCE)};

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$WebView$Companion;", "", "<init>", "()V", "Lp/nma0;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format$WebView;", "serializer", "()Lp/nma0;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final nma0 serializer() {
                return Format$WebView$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<WebView> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WebView createFromParcel(Parcel parcel) {
                return new WebView((WebViewTemplate) parcel.readParcelable(WebView.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WebView[] newArray(int i) {
                return new WebView[i];
            }
        }

        public /* synthetic */ WebView(int i, WebViewTemplate webViewTemplate, p661 p661Var) {
            super(i, p661Var);
            if ((i & 1) == 0) {
                this.template = WebViewTemplate.Undefined.INSTANCE;
            } else {
                this.template = webViewTemplate;
            }
        }

        public static /* synthetic */ WebView copy$default(WebView webView, WebViewTemplate webViewTemplate, int i, Object obj) {
            if ((i & 1) != 0) {
                webViewTemplate = webView.template;
            }
            return webView.copy(webViewTemplate);
        }

        public static final /* synthetic */ void write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk(WebView self, z1k output, h661 serialDesc) {
            Format.write$Self(self, output, serialDesc);
            znb0[] znb0VarArr = $childSerializers;
            if (!output.d0() && u890.j(self.getTemplate(), WebViewTemplate.Undefined.INSTANCE)) {
                return;
            }
            output.k(serialDesc, 0, (nma0) znb0VarArr[0].getValue(), self.getTemplate());
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final WebViewTemplate getTemplate() {
            return this.template;
        }

        public final WebView copy(WebViewTemplate template) {
            return new WebView(template);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof WebView) && u890.j(this.template, ((WebView) other).template);
        }

        public int hashCode() {
            return this.template.hashCode();
        }

        public String toString() {
            return super.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.template, flags);
        }

        @Override // com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Format
        public WebViewTemplate getTemplate() {
            return this.template;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public WebView() {
            this((WebViewTemplate) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public WebView(WebViewTemplate webViewTemplate) {
            super(null);
            this.template = webViewTemplate;
        }

        public /* synthetic */ WebView(WebViewTemplate webViewTemplate, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? WebViewTemplate.Undefined.INSTANCE : webViewTemplate);
        }
    }

    public static final /* synthetic */ void write$Self(Format self, z1k output, h661 serialDesc) {
    }
}
