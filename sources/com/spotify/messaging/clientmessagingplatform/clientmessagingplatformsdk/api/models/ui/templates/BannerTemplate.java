package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.BackgroundColor;
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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.chc1;
import p.dm5;
import p.dsl0;
import p.eg;
import p.fv41;
import p.h661;
import p.hab0;
import p.i3a;
import p.jd11;
import p.kk0;
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
import p.z6x;
import p.znb0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00142\u00020\u0001:\b\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u0014B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0001\u0007\u001c\u001d\u001e\u001f !\"¨\u0006#"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BannerTemplate;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageTemplate;", "<init>", "()V", "", "seen0", "Lp/p661;", "serializationConstructorMarker", "(ILp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "write$Self", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BannerTemplate;Lp/z1k;Lp/h661;)V", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/BackgroundColor;", "standardizedBackground", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/BackgroundColor;", "Companion", "Undefined", "BasicBanner", "RichBanner", "SignifierBanner", "BaseBanner", "JitBanner", "CustomBanner", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BannerTemplate$BaseBanner;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BannerTemplate$BasicBanner;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BannerTemplate$CustomBanner;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BannerTemplate$JitBanner;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BannerTemplate$RichBanner;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BannerTemplate$SignifierBanner;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BannerTemplate$Undefined;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
@o661
public abstract class BannerTemplate implements MessageTemplate {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final znb0 $cachedSerializer$delegate = dm5.S(2, Companion.AnonymousClass1.INSTANCE);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BannerTemplate$Companion;", "", "<init>", "()V", "Lp/nma0;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BannerTemplate;", "serializer", "()Lp/nma0;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    public static final class Companion {

        /* JADX INFO: renamed from: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.BannerTemplate$Companion$1, reason: invalid class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
        public static final class AnonymousClass1 extends hab0 implements Function0 {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final nma0 invoke() {
                jd11 jd11Var = rc11.a;
                return new fv41("com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.BannerTemplate", jd11Var.b(BannerTemplate.class), new tka0[]{jd11Var.b(BaseBanner.class), jd11Var.b(BasicBanner.class), jd11Var.b(CustomBanner.class), jd11Var.b(JitBanner.class), jd11Var.b(RichBanner.class), jd11Var.b(SignifierBanner.class), jd11Var.b(Undefined.class)}, new nma0[]{BannerTemplate$BaseBanner$$serializer.INSTANCE, BannerTemplate$BasicBanner$$serializer.INSTANCE, new BannerTemplate$CustomBanner$.serializer(new tcv0(jd11Var.b(Object.class), new Annotation[0]), new tcv0(jd11Var.b(Object.class), new Annotation[0]), new tcv0(jd11Var.b(Object.class), new Annotation[0])), BannerTemplate$JitBanner$$serializer.INSTANCE, BannerTemplate$RichBanner$$serializer.INSTANCE, BannerTemplate$SignifierBanner$$serializer.INSTANCE, new pfp0("com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.BannerTemplate.Undefined", Undefined.INSTANCE, new Annotation[0])}, new Annotation[0]);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ nma0 get$cachedSerializer() {
            return (nma0) BannerTemplate.$cachedSerializer$delegate.getValue();
        }

        public final nma0 serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\r¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BannerTemplate$Undefined;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BannerTemplate;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/rih1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lp/nma0;", "serializer", "()Lp/nma0;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    @o661
    public static final class Undefined extends BannerTemplate {
        public static final int $stable = 0;
        public static final Undefined INSTANCE = new Undefined();
        public static final Parcelable.Creator<Undefined> CREATOR = new Creator();
        private static final /* synthetic */ znb0 $cachedSerializer$delegate = dm5.S(2, AnonymousClass1.INSTANCE);

        /* JADX INFO: renamed from: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.BannerTemplate$Undefined$1, reason: invalid class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
        public static final class AnonymousClass1 extends hab0 implements Function0 {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final nma0 invoke() {
                return new pfp0("com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.BannerTemplate.Undefined", Undefined.INSTANCE, new Annotation[0]);
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

    public /* synthetic */ BannerTemplate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final BackgroundColor standardizedBackground() {
        if (this instanceof BaseBanner) {
            return ((BaseBanner) this).getBackground();
        }
        if (this instanceof BasicBanner) {
            String backgroundColor = ((BasicBanner) this).getBackgroundColor();
            if (backgroundColor != null) {
                return new BackgroundColor.SolidBackgroundColor(backgroundColor);
            }
            return null;
        }
        if ((this instanceof CustomBanner) || (this instanceof JitBanner)) {
            return null;
        }
        if (this instanceof RichBanner) {
            String backgroundColor2 = ((RichBanner) this).getBackgroundColor();
            if (backgroundColor2 != null) {
                return new BackgroundColor.SolidBackgroundColor(backgroundColor2);
            }
            return null;
        }
        if (this instanceof SignifierBanner) {
            String backgroundColor3 = ((SignifierBanner) this).getBackgroundColor();
            if (backgroundColor3 != null) {
                return new BackgroundColor.SolidBackgroundColor(backgroundColor3);
            }
            return null;
        }
        if (equals(Undefined.INSTANCE)) {
            return null;
        }
        eg.o();
        return null;
    }

    private BannerTemplate() {
    }

    public /* synthetic */ BannerTemplate(int i, p661 p661Var) {
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0018J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J*\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b%\u0010\u001aJ\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\"¨\u00061"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BannerTemplate$JitBanner;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BannerTemplate;", "", "htmlString", "", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "buttons", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lp/p661;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BannerTemplate$JitBanner;Lp/z1k;Lp/h661;)V", "write$Self", "toString", "()Ljava/lang/String;", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BannerTemplate$JitBanner;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHtmlString", "Ljava/util/List;", "getButtons", "Companion", "$serializer", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    @o661
    public static final /* data */ class JitBanner extends BannerTemplate {
        public static final int $stable = 0;
        private final List<Button> buttons;
        private final String htmlString;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<JitBanner> CREATOR = new Creator();
        private static final znb0[] $childSerializers = {null, dm5.S(2, BannerTemplate$JitBanner$Companion$$childSerializers$1.INSTANCE)};

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BannerTemplate$JitBanner$Companion;", "", "<init>", "()V", "Lp/nma0;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BannerTemplate$JitBanner;", "serializer", "()Lp/nma0;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final nma0 serializer() {
                return BannerTemplate$JitBanner$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<JitBanner> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final JitBanner createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iD = 0;
                while (iD != i) {
                    iD = dsl0.d(Button.CREATOR, parcel, arrayList, iD, 1);
                }
                return new JitBanner(string, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final JitBanner[] newArray(int i) {
                return new JitBanner[i];
            }
        }

        public /* synthetic */ JitBanner(int i, String str, List list, p661 p661Var) {
            super(i, p661Var);
            this.htmlString = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.buttons = z6x.a;
            } else {
                this.buttons = list;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ JitBanner copy$default(JitBanner jitBanner, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = jitBanner.htmlString;
            }
            if ((i & 2) != 0) {
                list = jitBanner.buttons;
            }
            return jitBanner.copy(str, list);
        }

        public static final /* synthetic */ void write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk(JitBanner self, z1k output, h661 serialDesc) {
            BannerTemplate.write$Self(self, output, serialDesc);
            znb0[] znb0VarArr = $childSerializers;
            if (output.d0() || !u890.j(self.htmlString, "")) {
                output.G(serialDesc, 0, self.htmlString);
            }
            if (!output.d0() && u890.j(self.buttons, z6x.a)) {
                return;
            }
            output.k(serialDesc, 1, (nma0) znb0VarArr[1].getValue(), self.buttons);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getHtmlString() {
            return this.htmlString;
        }

        public final List<Button> component2() {
            return this.buttons;
        }

        public final JitBanner copy(String htmlString, List<Button> buttons) {
            return new JitBanner(htmlString, buttons);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof JitBanner)) {
                return false;
            }
            JitBanner jitBanner = (JitBanner) other;
            return u890.j(this.htmlString, jitBanner.htmlString) && u890.j(this.buttons, jitBanner.buttons);
        }

        public final List<Button> getButtons() {
            return this.buttons;
        }

        public final String getHtmlString() {
            return this.htmlString;
        }

        public int hashCode() {
            return this.buttons.hashCode() + (this.htmlString.hashCode() * 31);
        }

        public String toString() {
            return "JitBanner(htmlString=htmlString, buttons=" + this.buttons + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.htmlString);
            Iterator itM = kk0.m(dest, this.buttons);
            while (itM.hasNext()) {
                ((Button) itM.next()).writeToParcel(dest, flags);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public JitBanner() {
            this((String) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public JitBanner(String str, List<Button> list) {
            super(null);
            this.htmlString = str;
            this.buttons = list;
        }

        public /* synthetic */ JitBanner(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? z6x.a : list);
        }
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>=B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fBW\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010 \u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\r¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0012\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b)\u0010(J\u0012\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b*\u0010(JT\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010#J\u0010\u0010.\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b.\u0010\u001cJ\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b2\u00103R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b7\u0010%R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b8\u0010%R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b:\u0010(R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b;\u0010(R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b<\u0010(¨\u0006?"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BannerTemplate$BasicBanner;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BannerTemplate;", "", "backgroundColor", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;", "headline", "body", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "primaryButton", "closeButton", "secondaryButton", "<init>", "(Ljava/lang/String;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;)V", "", "seen0", "Lp/p661;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BannerTemplate$BasicBanner;Lp/z1k;Lp/h661;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;", "component3", "component4", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "component5", "component6", "copy", "(Ljava/lang/String;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BannerTemplate$BasicBanner;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBackgroundColor", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;", "getHeadline", "getBody", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "getPrimaryButton", "getCloseButton", "getSecondaryButton", "Companion", "$serializer", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    @o661
    public static final /* data */ class BasicBanner extends BannerTemplate {
        public static final int $stable = 0;
        private final String backgroundColor;
        private final MessageText body;
        private final Button closeButton;
        private final MessageText headline;
        private final Button primaryButton;
        private final Button secondaryButton;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<BasicBanner> CREATOR = new Creator();

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BannerTemplate$BasicBanner$Companion;", "", "<init>", "()V", "Lp/nma0;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BannerTemplate$BasicBanner;", "serializer", "()Lp/nma0;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final nma0 serializer() {
                return BannerTemplate$BasicBanner$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<BasicBanner> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BasicBanner createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                Parcelable.Creator<MessageText> creator = MessageText.CREATOR;
                return new BasicBanner(string, creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Button.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BasicBanner[] newArray(int i) {
                return new BasicBanner[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ BasicBanner(int i, String str, MessageText messageText, MessageText messageText2, Button button, Button button2, Button button3, p661 p661Var) {
            super(i, p661Var);
            if (63 != (i & 63)) {
                o6p1.t(i, 63, BannerTemplate$BasicBanner$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.backgroundColor = str;
            this.headline = messageText;
            this.body = messageText2;
            this.primaryButton = button;
            this.closeButton = button2;
            this.secondaryButton = button3;
        }

        public static /* synthetic */ BasicBanner copy$default(BasicBanner basicBanner, String str, MessageText messageText, MessageText messageText2, Button button, Button button2, Button button3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = basicBanner.backgroundColor;
            }
            if ((i & 2) != 0) {
                messageText = basicBanner.headline;
            }
            if ((i & 4) != 0) {
                messageText2 = basicBanner.body;
            }
            if ((i & 8) != 0) {
                button = basicBanner.primaryButton;
            }
            if ((i & 16) != 0) {
                button2 = basicBanner.closeButton;
            }
            if ((i & 32) != 0) {
                button3 = basicBanner.secondaryButton;
            }
            Button button4 = button2;
            Button button5 = button3;
            return basicBanner.copy(str, messageText, messageText2, button, button4, button5);
        }

        public static final /* synthetic */ void write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk(BasicBanner self, z1k output, h661 serialDesc) {
            BannerTemplate.write$Self(self, output, serialDesc);
            output.s(serialDesc, 0, chc1.a, self.backgroundColor);
            MessageText$$serializer messageText$$serializer = MessageText$$serializer.INSTANCE;
            output.k(serialDesc, 1, messageText$$serializer, self.headline);
            output.k(serialDesc, 2, messageText$$serializer, self.body);
            Button$$serializer button$$serializer = Button$$serializer.INSTANCE;
            output.s(serialDesc, 3, button$$serializer, self.primaryButton);
            output.s(serialDesc, 4, button$$serializer, self.closeButton);
            output.s(serialDesc, 5, button$$serializer, self.secondaryButton);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
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
        public final Button getPrimaryButton() {
            return this.primaryButton;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Button getCloseButton() {
            return this.closeButton;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Button getSecondaryButton() {
            return this.secondaryButton;
        }

        public final BasicBanner copy(String backgroundColor, MessageText headline, MessageText body, Button primaryButton, Button closeButton, Button secondaryButton) {
            return new BasicBanner(backgroundColor, headline, body, primaryButton, closeButton, secondaryButton);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BasicBanner)) {
                return false;
            }
            BasicBanner basicBanner = (BasicBanner) other;
            return u890.j(this.backgroundColor, basicBanner.backgroundColor) && u890.j(this.headline, basicBanner.headline) && u890.j(this.body, basicBanner.body) && u890.j(this.primaryButton, basicBanner.primaryButton) && u890.j(this.closeButton, basicBanner.closeButton) && u890.j(this.secondaryButton, basicBanner.secondaryButton);
        }

        public final String getBackgroundColor() {
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

        public final Button getSecondaryButton() {
            return this.secondaryButton;
        }

        public int hashCode() {
            String str = this.backgroundColor;
            int i = i3a.i(this.body, i3a.i(this.headline, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
            Button button = this.primaryButton;
            int iHashCode = (i + (button == null ? 0 : button.hashCode())) * 31;
            Button button2 = this.closeButton;
            int iHashCode2 = (iHashCode + (button2 == null ? 0 : button2.hashCode())) * 31;
            Button button3 = this.secondaryButton;
            return iHashCode2 + (button3 != null ? button3.hashCode() : 0);
        }

        public String toString() {
            return super.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.backgroundColor);
            this.headline.writeToParcel(dest, flags);
            this.body.writeToParcel(dest, flags);
            Button button = this.primaryButton;
            if (button == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                button.writeToParcel(dest, flags);
            }
            Button button2 = this.closeButton;
            if (button2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                button2.writeToParcel(dest, flags);
            }
            Button button3 = this.secondaryButton;
            if (button3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                button3.writeToParcel(dest, flags);
            }
        }

        public BasicBanner(String str, MessageText messageText, MessageText messageText2, Button button, Button button2, Button button3) {
            super(null);
            this.backgroundColor = str;
            this.headline = messageText;
            this.body = messageText2;
            this.primaryButton = button;
            this.closeButton = button2;
            this.secondaryButton = button3;
        }
    }

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0002DCBG\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eBa\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u000f¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\"\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u000f¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b(\u0010'J\u0010\u0010)\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b-\u0010,J\u0012\u0010.\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b.\u0010,J^\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b1\u0010%J\u0010\u00102\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b2\u0010\u001eJ\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u000103HÖ\u0003¢\u0006\u0004\b6\u00107R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b;\u0010'R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010:\u001a\u0004\b<\u0010'R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010=\u001a\u0004\b>\u0010*R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010?\u001a\u0004\b@\u0010,R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010?\u001a\u0004\bA\u0010,R\u0019\u0010\f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u0010?\u001a\u0004\bB\u0010,¨\u0006E"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BannerTemplate$RichBanner;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BannerTemplate;", "", "backgroundColor", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;", "headline", "body", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;", "accessoryContent", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "primaryButton", "closeButton", "secondaryButton", "<init>", "(Ljava/lang/String;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;)V", "", "seen0", "Lp/p661;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BannerTemplate$RichBanner;Lp/z1k;Lp/h661;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;", "component3", "component4", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;", "component5", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "component6", "component7", "copy", "(Ljava/lang/String;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BannerTemplate$RichBanner;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBackgroundColor", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;", "getHeadline", "getBody", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;", "getAccessoryContent", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "getPrimaryButton", "getCloseButton", "getSecondaryButton", "Companion", "$serializer", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    @o661
    public static final /* data */ class RichBanner extends BannerTemplate {
        public static final int $stable = 0;
        private final AccessoryContent accessoryContent;
        private final String backgroundColor;
        private final MessageText body;
        private final Button closeButton;
        private final MessageText headline;
        private final Button primaryButton;
        private final Button secondaryButton;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<RichBanner> CREATOR = new Creator();
        private static final znb0[] $childSerializers = {null, null, null, dm5.S(2, BannerTemplate$RichBanner$Companion$$childSerializers$1.INSTANCE), null, null, null};

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BannerTemplate$RichBanner$Companion;", "", "<init>", "()V", "Lp/nma0;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BannerTemplate$RichBanner;", "serializer", "()Lp/nma0;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final nma0 serializer() {
                return BannerTemplate$RichBanner$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<RichBanner> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RichBanner createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                Parcelable.Creator<MessageText> creator = MessageText.CREATOR;
                return new RichBanner(string, creator.createFromParcel(parcel), creator.createFromParcel(parcel), (AccessoryContent) parcel.readParcelable(RichBanner.class.getClassLoader()), parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Button.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RichBanner[] newArray(int i) {
                return new RichBanner[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ RichBanner(int i, String str, MessageText messageText, MessageText messageText2, AccessoryContent accessoryContent, Button button, Button button2, Button button3, p661 p661Var) {
            super(i, p661Var);
            if (127 != (i & 127)) {
                o6p1.t(i, 127, BannerTemplate$RichBanner$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.backgroundColor = str;
            this.headline = messageText;
            this.body = messageText2;
            this.accessoryContent = accessoryContent;
            this.primaryButton = button;
            this.closeButton = button2;
            this.secondaryButton = button3;
        }

        public static /* synthetic */ RichBanner copy$default(RichBanner richBanner, String str, MessageText messageText, MessageText messageText2, AccessoryContent accessoryContent, Button button, Button button2, Button button3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = richBanner.backgroundColor;
            }
            if ((i & 2) != 0) {
                messageText = richBanner.headline;
            }
            if ((i & 4) != 0) {
                messageText2 = richBanner.body;
            }
            if ((i & 8) != 0) {
                accessoryContent = richBanner.accessoryContent;
            }
            if ((i & 16) != 0) {
                button = richBanner.primaryButton;
            }
            if ((i & 32) != 0) {
                button2 = richBanner.closeButton;
            }
            if ((i & 64) != 0) {
                button3 = richBanner.secondaryButton;
            }
            Button button4 = button2;
            Button button5 = button3;
            Button button6 = button;
            MessageText messageText3 = messageText2;
            return richBanner.copy(str, messageText, messageText3, accessoryContent, button6, button4, button5);
        }

        public static final /* synthetic */ void write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk(RichBanner self, z1k output, h661 serialDesc) {
            BannerTemplate.write$Self(self, output, serialDesc);
            znb0[] znb0VarArr = $childSerializers;
            output.s(serialDesc, 0, chc1.a, self.backgroundColor);
            MessageText$$serializer messageText$$serializer = MessageText$$serializer.INSTANCE;
            output.k(serialDesc, 1, messageText$$serializer, self.headline);
            output.k(serialDesc, 2, messageText$$serializer, self.body);
            output.k(serialDesc, 3, (nma0) znb0VarArr[3].getValue(), self.accessoryContent);
            Button$$serializer button$$serializer = Button$$serializer.INSTANCE;
            output.s(serialDesc, 4, button$$serializer, self.primaryButton);
            output.s(serialDesc, 5, button$$serializer, self.closeButton);
            output.s(serialDesc, 6, button$$serializer, self.secondaryButton);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
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
        public final AccessoryContent getAccessoryContent() {
            return this.accessoryContent;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Button getPrimaryButton() {
            return this.primaryButton;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Button getCloseButton() {
            return this.closeButton;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Button getSecondaryButton() {
            return this.secondaryButton;
        }

        public final RichBanner copy(String backgroundColor, MessageText headline, MessageText body, AccessoryContent accessoryContent, Button primaryButton, Button closeButton, Button secondaryButton) {
            return new RichBanner(backgroundColor, headline, body, accessoryContent, primaryButton, closeButton, secondaryButton);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RichBanner)) {
                return false;
            }
            RichBanner richBanner = (RichBanner) other;
            return u890.j(this.backgroundColor, richBanner.backgroundColor) && u890.j(this.headline, richBanner.headline) && u890.j(this.body, richBanner.body) && u890.j(this.accessoryContent, richBanner.accessoryContent) && u890.j(this.primaryButton, richBanner.primaryButton) && u890.j(this.closeButton, richBanner.closeButton) && u890.j(this.secondaryButton, richBanner.secondaryButton);
        }

        public final AccessoryContent getAccessoryContent() {
            return this.accessoryContent;
        }

        public final String getBackgroundColor() {
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

        public final Button getSecondaryButton() {
            return this.secondaryButton;
        }

        public int hashCode() {
            String str = this.backgroundColor;
            int iHashCode = (this.accessoryContent.hashCode() + i3a.i(this.body, i3a.i(this.headline, (str == null ? 0 : str.hashCode()) * 31, 31), 31)) * 31;
            Button button = this.primaryButton;
            int iHashCode2 = (iHashCode + (button == null ? 0 : button.hashCode())) * 31;
            Button button2 = this.closeButton;
            int iHashCode3 = (iHashCode2 + (button2 == null ? 0 : button2.hashCode())) * 31;
            Button button3 = this.secondaryButton;
            return iHashCode3 + (button3 != null ? button3.hashCode() : 0);
        }

        public String toString() {
            return super.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.backgroundColor);
            this.headline.writeToParcel(dest, flags);
            this.body.writeToParcel(dest, flags);
            dest.writeParcelable(this.accessoryContent, flags);
            Button button = this.primaryButton;
            if (button == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                button.writeToParcel(dest, flags);
            }
            Button button2 = this.closeButton;
            if (button2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                button2.writeToParcel(dest, flags);
            }
            Button button3 = this.secondaryButton;
            if (button3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                button3.writeToParcel(dest, flags);
            }
        }

        public RichBanner(String str, MessageText messageText, MessageText messageText2, AccessoryContent accessoryContent, Button button, Button button2, Button button3) {
            super(null);
            this.backgroundColor = str;
            this.headline = messageText;
            this.body = messageText2;
            this.accessoryContent = accessoryContent;
            this.primaryButton = button;
            this.closeButton = button2;
            this.secondaryButton = button3;
        }
    }

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0002DCBG\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eBa\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u000f¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\"\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u000f¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b(\u0010'J\u0010\u0010)\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b-\u0010,J\u0012\u0010.\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b.\u0010,J^\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b1\u0010%J\u0010\u00102\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b2\u0010\u001eJ\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u000103HÖ\u0003¢\u0006\u0004\b6\u00107R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b;\u0010'R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010:\u001a\u0004\b<\u0010'R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010=\u001a\u0004\b>\u0010*R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010?\u001a\u0004\b@\u0010,R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010?\u001a\u0004\bA\u0010,R\u0019\u0010\f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u0010?\u001a\u0004\bB\u0010,¨\u0006E"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BannerTemplate$SignifierBanner;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BannerTemplate;", "", "backgroundColor", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;", "headline", "body", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Signifier;", "signifier", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "primaryButton", "closeButton", "secondaryButton", "<init>", "(Ljava/lang/String;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Signifier;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;)V", "", "seen0", "Lp/p661;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Signifier;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BannerTemplate$SignifierBanner;Lp/z1k;Lp/h661;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;", "component3", "component4", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Signifier;", "component5", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "component6", "component7", "copy", "(Ljava/lang/String;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Signifier;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BannerTemplate$SignifierBanner;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBackgroundColor", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;", "getHeadline", "getBody", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Signifier;", "getSignifier", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "getPrimaryButton", "getCloseButton", "getSecondaryButton", "Companion", "$serializer", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    @o661
    public static final /* data */ class SignifierBanner extends BannerTemplate {
        public static final int $stable = 0;
        private final String backgroundColor;
        private final MessageText body;
        private final Button closeButton;
        private final MessageText headline;
        private final Button primaryButton;
        private final Button secondaryButton;
        private final Signifier signifier;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<SignifierBanner> CREATOR = new Creator();

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BannerTemplate$SignifierBanner$Companion;", "", "<init>", "()V", "Lp/nma0;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BannerTemplate$SignifierBanner;", "serializer", "()Lp/nma0;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final nma0 serializer() {
                return BannerTemplate$SignifierBanner$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<SignifierBanner> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SignifierBanner createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                Parcelable.Creator<MessageText> creator = MessageText.CREATOR;
                return new SignifierBanner(string, creator.createFromParcel(parcel), creator.createFromParcel(parcel), Signifier.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Button.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SignifierBanner[] newArray(int i) {
                return new SignifierBanner[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ SignifierBanner(int i, String str, MessageText messageText, MessageText messageText2, Signifier signifier, Button button, Button button2, Button button3, p661 p661Var) {
            super(i, p661Var);
            if (127 != (i & 127)) {
                o6p1.t(i, 127, BannerTemplate$SignifierBanner$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.backgroundColor = str;
            this.headline = messageText;
            this.body = messageText2;
            this.signifier = signifier;
            this.primaryButton = button;
            this.closeButton = button2;
            this.secondaryButton = button3;
        }

        public static /* synthetic */ SignifierBanner copy$default(SignifierBanner signifierBanner, String str, MessageText messageText, MessageText messageText2, Signifier signifier, Button button, Button button2, Button button3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = signifierBanner.backgroundColor;
            }
            if ((i & 2) != 0) {
                messageText = signifierBanner.headline;
            }
            if ((i & 4) != 0) {
                messageText2 = signifierBanner.body;
            }
            if ((i & 8) != 0) {
                signifier = signifierBanner.signifier;
            }
            if ((i & 16) != 0) {
                button = signifierBanner.primaryButton;
            }
            if ((i & 32) != 0) {
                button2 = signifierBanner.closeButton;
            }
            if ((i & 64) != 0) {
                button3 = signifierBanner.secondaryButton;
            }
            Button button4 = button2;
            Button button5 = button3;
            Button button6 = button;
            MessageText messageText3 = messageText2;
            return signifierBanner.copy(str, messageText, messageText3, signifier, button6, button4, button5);
        }

        public static final /* synthetic */ void write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk(SignifierBanner self, z1k output, h661 serialDesc) {
            BannerTemplate.write$Self(self, output, serialDesc);
            output.s(serialDesc, 0, chc1.a, self.backgroundColor);
            MessageText$$serializer messageText$$serializer = MessageText$$serializer.INSTANCE;
            output.k(serialDesc, 1, messageText$$serializer, self.headline);
            output.k(serialDesc, 2, messageText$$serializer, self.body);
            output.k(serialDesc, 3, Signifier$$serializer.INSTANCE, self.signifier);
            Button$$serializer button$$serializer = Button$$serializer.INSTANCE;
            output.s(serialDesc, 4, button$$serializer, self.primaryButton);
            output.s(serialDesc, 5, button$$serializer, self.closeButton);
            output.s(serialDesc, 6, button$$serializer, self.secondaryButton);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
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
        public final Signifier getSignifier() {
            return this.signifier;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Button getPrimaryButton() {
            return this.primaryButton;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Button getCloseButton() {
            return this.closeButton;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Button getSecondaryButton() {
            return this.secondaryButton;
        }

        public final SignifierBanner copy(String backgroundColor, MessageText headline, MessageText body, Signifier signifier, Button primaryButton, Button closeButton, Button secondaryButton) {
            return new SignifierBanner(backgroundColor, headline, body, signifier, primaryButton, closeButton, secondaryButton);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SignifierBanner)) {
                return false;
            }
            SignifierBanner signifierBanner = (SignifierBanner) other;
            return u890.j(this.backgroundColor, signifierBanner.backgroundColor) && u890.j(this.headline, signifierBanner.headline) && u890.j(this.body, signifierBanner.body) && u890.j(this.signifier, signifierBanner.signifier) && u890.j(this.primaryButton, signifierBanner.primaryButton) && u890.j(this.closeButton, signifierBanner.closeButton) && u890.j(this.secondaryButton, signifierBanner.secondaryButton);
        }

        public final String getBackgroundColor() {
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

        public final Button getSecondaryButton() {
            return this.secondaryButton;
        }

        public final Signifier getSignifier() {
            return this.signifier;
        }

        public int hashCode() {
            String str = this.backgroundColor;
            int iHashCode = (this.signifier.hashCode() + i3a.i(this.body, i3a.i(this.headline, (str == null ? 0 : str.hashCode()) * 31, 31), 31)) * 31;
            Button button = this.primaryButton;
            int iHashCode2 = (iHashCode + (button == null ? 0 : button.hashCode())) * 31;
            Button button2 = this.closeButton;
            int iHashCode3 = (iHashCode2 + (button2 == null ? 0 : button2.hashCode())) * 31;
            Button button3 = this.secondaryButton;
            return iHashCode3 + (button3 != null ? button3.hashCode() : 0);
        }

        public String toString() {
            return super.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.backgroundColor);
            this.headline.writeToParcel(dest, flags);
            this.body.writeToParcel(dest, flags);
            this.signifier.writeToParcel(dest, flags);
            Button button = this.primaryButton;
            if (button == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                button.writeToParcel(dest, flags);
            }
            Button button2 = this.closeButton;
            if (button2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                button2.writeToParcel(dest, flags);
            }
            Button button3 = this.secondaryButton;
            if (button3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                button3.writeToParcel(dest, flags);
            }
        }

        public SignifierBanner(String str, MessageText messageText, MessageText messageText2, Signifier signifier, Button button, Button button2, Button button3) {
            super(null);
            this.backgroundColor = str;
            this.headline = messageText;
            this.body = messageText2;
            this.signifier = signifier;
            this.primaryButton = button;
            this.closeButton = button2;
            this.secondaryButton = button3;
        }
    }

    @Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 Z2\u00020\u0001:\u0002[ZBm\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u0089\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0016¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b+\u0010*J\u0012\u0010,\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b0\u0010/J\u0012\u00101\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b1\u0010/J\u0012\u00102\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b2\u0010/J\u0012\u00103\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b3\u00104J\u008a\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00108\u001a\u000207HÖ\u0001¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b:\u0010\u001cJ\u001a\u0010>\u001a\u00020=2\b\u0010<\u001a\u0004\u0018\u00010;HÖ\u0003¢\u0006\u0004\b>\u0010?J'\u0010G\u001a\u00020 2\u0006\u0010@\u001a\u00020\u00002\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020CH\u0001¢\u0006\u0004\bE\u0010FR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010H\u001a\u0004\bI\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010J\u001a\u0004\bK\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010L\u001a\u0004\bM\u0010(R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010N\u001a\u0004\bO\u0010*R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010N\u001a\u0004\bP\u0010*R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010Q\u001a\u0004\bR\u0010-R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010S\u001a\u0004\bT\u0010/R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010S\u001a\u0004\bU\u0010/R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0010\u0010S\u001a\u0004\bV\u0010/R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0011\u0010S\u001a\u0004\bW\u0010/R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010X\u001a\u0004\bY\u00104¨\u0006\\"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BannerTemplate$BaseBanner;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BannerTemplate;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/Alignment;", "alignment", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/BackgroundColor;", "background", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;", "accessoryContent", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;", "headline", "body", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/HeaderContent;", "headerContent", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "primaryButton", "secondaryButton", "dismissButton", "contentButton", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Disclaimer;", "disclaimer", "<init>", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/Alignment;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/BackgroundColor;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/HeaderContent;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Disclaimer;)V", "", "seen0", "Lp/p661;", "serializationConstructorMarker", "(ILcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/Alignment;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/BackgroundColor;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/HeaderContent;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Disclaimer;Lp/p661;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/rih1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/Alignment;", "component2", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/BackgroundColor;", "component3", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;", "component4", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;", "component5", "component6", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/HeaderContent;", "component7", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "component8", "component9", "component10", "component11", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Disclaimer;", "copy", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/Alignment;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/BackgroundColor;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/HeaderContent;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Disclaimer;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BannerTemplate$BaseBanner;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BannerTemplate$BaseBanner;Lp/z1k;Lp/h661;)V", "write$Self", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/Alignment;", "getAlignment", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/BackgroundColor;", "getBackground", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryContent;", "getAccessoryContent", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;", "getHeadline", "getBody", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/HeaderContent;", "getHeaderContent", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Button;", "getPrimaryButton", "getSecondaryButton", "getDismissButton", "getContentButton", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Disclaimer;", "getDisclaimer", "Companion", "$serializer", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    @o661
    public static final /* data */ class BaseBanner extends BannerTemplate {
        public static final int $stable = 0;
        private final AccessoryContent accessoryContent;
        private final Alignment alignment;
        private final BackgroundColor background;
        private final MessageText body;
        private final Button contentButton;
        private final Disclaimer disclaimer;
        private final Button dismissButton;
        private final HeaderContent headerContent;
        private final MessageText headline;
        private final Button primaryButton;
        private final Button secondaryButton;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<BaseBanner> CREATOR = new Creator();
        private static final znb0[] $childSerializers = {dm5.S(2, BannerTemplate$BaseBanner$Companion$$childSerializers$1.INSTANCE), dm5.S(2, BannerTemplate$BaseBanner$Companion$$childSerializers$2.INSTANCE), dm5.S(2, BannerTemplate$BaseBanner$Companion$$childSerializers$3.INSTANCE), null, null, dm5.S(2, BannerTemplate$BaseBanner$Companion$$childSerializers$4.INSTANCE), null, null, null, null, null};

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BannerTemplate$BaseBanner$Companion;", "", "<init>", "()V", "Lp/nma0;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/templates/BannerTemplate$BaseBanner;", "serializer", "()Lp/nma0;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final nma0 serializer() {
                return BannerTemplate$BaseBanner$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<BaseBanner> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BaseBanner createFromParcel(Parcel parcel) {
                Alignment alignment = (Alignment) Alignment.CREATOR.createFromParcel(parcel);
                BackgroundColor backgroundColor = (BackgroundColor) parcel.readParcelable(BaseBanner.class.getClassLoader());
                AccessoryContent accessoryContent = (AccessoryContent) parcel.readParcelable(BaseBanner.class.getClassLoader());
                Parcelable.Creator<MessageText> creator = MessageText.CREATOR;
                return new BaseBanner(alignment, backgroundColor, accessoryContent, creator.createFromParcel(parcel), creator.createFromParcel(parcel), (HeaderContent) parcel.readParcelable(BaseBanner.class.getClassLoader()), parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel), (Disclaimer) (parcel.readInt() != 0 ? Disclaimer.CREATOR.createFromParcel(parcel) : null));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BaseBanner[] newArray(int i) {
                return new BaseBanner[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ BaseBanner(int i, Alignment alignment, BackgroundColor backgroundColor, AccessoryContent accessoryContent, MessageText messageText, MessageText messageText2, HeaderContent headerContent, Button button, Button button2, Button button3, Button button4, Disclaimer disclaimer, p661 p661Var) {
            super(i, p661Var);
            if (2046 != (i & 2046)) {
                o6p1.t(i, 2046, BannerTemplate$BaseBanner$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            if ((i & 1) == 0) {
                this.alignment = Alignment.CENTER;
            } else {
                this.alignment = alignment;
            }
            this.background = backgroundColor;
            this.accessoryContent = accessoryContent;
            this.headline = messageText;
            this.body = messageText2;
            this.headerContent = headerContent;
            this.primaryButton = button;
            this.secondaryButton = button2;
            this.dismissButton = button3;
            this.contentButton = button4;
            this.disclaimer = disclaimer;
        }

        public static /* synthetic */ BaseBanner copy$default(BaseBanner baseBanner, Alignment alignment, BackgroundColor backgroundColor, AccessoryContent accessoryContent, MessageText messageText, MessageText messageText2, HeaderContent headerContent, Button button, Button button2, Button button3, Button button4, Disclaimer disclaimer, int i, Object obj) {
            if ((i & 1) != 0) {
                alignment = baseBanner.alignment;
            }
            if ((i & 2) != 0) {
                backgroundColor = baseBanner.background;
            }
            if ((i & 4) != 0) {
                accessoryContent = baseBanner.accessoryContent;
            }
            if ((i & 8) != 0) {
                messageText = baseBanner.headline;
            }
            if ((i & 16) != 0) {
                messageText2 = baseBanner.body;
            }
            if ((i & 32) != 0) {
                headerContent = baseBanner.headerContent;
            }
            if ((i & 64) != 0) {
                button = baseBanner.primaryButton;
            }
            if ((i & 128) != 0) {
                button2 = baseBanner.secondaryButton;
            }
            if ((i & 256) != 0) {
                button3 = baseBanner.dismissButton;
            }
            if ((i & 512) != 0) {
                button4 = baseBanner.contentButton;
            }
            if ((i & 1024) != 0) {
                disclaimer = baseBanner.disclaimer;
            }
            Button button5 = button4;
            Disclaimer disclaimer2 = disclaimer;
            Button button6 = button2;
            Button button7 = button3;
            HeaderContent headerContent2 = headerContent;
            Button button8 = button;
            MessageText messageText3 = messageText2;
            AccessoryContent accessoryContent2 = accessoryContent;
            return baseBanner.copy(alignment, backgroundColor, accessoryContent2, messageText, messageText3, headerContent2, button8, button6, button7, button5, disclaimer2);
        }

        public static final /* synthetic */ void write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk(BaseBanner self, z1k output, h661 serialDesc) {
            BannerTemplate.write$Self(self, output, serialDesc);
            znb0[] znb0VarArr = $childSerializers;
            if (output.d0() || self.alignment != Alignment.CENTER) {
                output.k(serialDesc, 0, (nma0) znb0VarArr[0].getValue(), self.alignment);
            }
            output.k(serialDesc, 1, (nma0) znb0VarArr[1].getValue(), self.background);
            output.k(serialDesc, 2, (nma0) znb0VarArr[2].getValue(), self.accessoryContent);
            MessageText$$serializer messageText$$serializer = MessageText$$serializer.INSTANCE;
            output.k(serialDesc, 3, messageText$$serializer, self.headline);
            output.k(serialDesc, 4, messageText$$serializer, self.body);
            output.s(serialDesc, 5, (nma0) znb0VarArr[5].getValue(), self.headerContent);
            Button$$serializer button$$serializer = Button$$serializer.INSTANCE;
            output.s(serialDesc, 6, button$$serializer, self.primaryButton);
            output.s(serialDesc, 7, button$$serializer, self.secondaryButton);
            output.s(serialDesc, 8, button$$serializer, self.dismissButton);
            output.s(serialDesc, 9, button$$serializer, self.contentButton);
            output.s(serialDesc, 10, Disclaimer$.serializer.INSTANCE, self.disclaimer);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Alignment getAlignment() {
            return this.alignment;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final Button getContentButton() {
            return this.contentButton;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final Disclaimer getDisclaimer() {
            return this.disclaimer;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final BackgroundColor getBackground() {
            return this.background;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final AccessoryContent getAccessoryContent() {
            return this.accessoryContent;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final MessageText getHeadline() {
            return this.headline;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final MessageText getBody() {
            return this.body;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final HeaderContent getHeaderContent() {
            return this.headerContent;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Button getPrimaryButton() {
            return this.primaryButton;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final Button getSecondaryButton() {
            return this.secondaryButton;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final Button getDismissButton() {
            return this.dismissButton;
        }

        public final BaseBanner copy(Alignment alignment, BackgroundColor background, AccessoryContent accessoryContent, MessageText headline, MessageText body, HeaderContent headerContent, Button primaryButton, Button secondaryButton, Button dismissButton, Button contentButton, Disclaimer disclaimer) {
            return new BaseBanner(alignment, background, accessoryContent, headline, body, headerContent, primaryButton, secondaryButton, dismissButton, contentButton, disclaimer);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BaseBanner)) {
                return false;
            }
            BaseBanner baseBanner = (BaseBanner) other;
            return this.alignment == baseBanner.alignment && u890.j(this.background, baseBanner.background) && u890.j(this.accessoryContent, baseBanner.accessoryContent) && u890.j(this.headline, baseBanner.headline) && u890.j(this.body, baseBanner.body) && u890.j(this.headerContent, baseBanner.headerContent) && u890.j(this.primaryButton, baseBanner.primaryButton) && u890.j(this.secondaryButton, baseBanner.secondaryButton) && u890.j(this.dismissButton, baseBanner.dismissButton) && u890.j(this.contentButton, baseBanner.contentButton) && u890.j(this.disclaimer, baseBanner.disclaimer);
        }

        public final AccessoryContent getAccessoryContent() {
            return this.accessoryContent;
        }

        public final Alignment getAlignment() {
            return this.alignment;
        }

        public final BackgroundColor getBackground() {
            return this.background;
        }

        public final MessageText getBody() {
            return this.body;
        }

        public final Button getContentButton() {
            return this.contentButton;
        }

        public final Disclaimer getDisclaimer() {
            return this.disclaimer;
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
            int i = i3a.i(this.body, i3a.i(this.headline, (this.accessoryContent.hashCode() + ((this.background.hashCode() + (this.alignment.hashCode() * 31)) * 31)) * 31, 31), 31);
            HeaderContent headerContent = this.headerContent;
            int iHashCode = (i + (headerContent == null ? 0 : headerContent.hashCode())) * 31;
            Button button = this.primaryButton;
            int iHashCode2 = (iHashCode + (button == null ? 0 : button.hashCode())) * 31;
            Button button2 = this.secondaryButton;
            int iHashCode3 = (iHashCode2 + (button2 == null ? 0 : button2.hashCode())) * 31;
            Button button3 = this.dismissButton;
            int iHashCode4 = (iHashCode3 + (button3 == null ? 0 : button3.hashCode())) * 31;
            Button button4 = this.contentButton;
            int iHashCode5 = (iHashCode4 + (button4 == null ? 0 : button4.hashCode())) * 31;
            Disclaimer disclaimer = this.disclaimer;
            return iHashCode5 + (disclaimer != null ? disclaimer.hashCode() : 0);
        }

        public String toString() {
            return super.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            this.alignment.writeToParcel(dest, flags);
            dest.writeParcelable(this.background, flags);
            dest.writeParcelable(this.accessoryContent, flags);
            this.headline.writeToParcel(dest, flags);
            this.body.writeToParcel(dest, flags);
            dest.writeParcelable(this.headerContent, flags);
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
            Button button3 = this.dismissButton;
            if (button3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                button3.writeToParcel(dest, flags);
            }
            Button button4 = this.contentButton;
            if (button4 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                button4.writeToParcel(dest, flags);
            }
            Disclaimer disclaimer = this.disclaimer;
            if (disclaimer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                disclaimer.writeToParcel(dest, flags);
            }
        }

        public BaseBanner(Alignment alignment, BackgroundColor backgroundColor, AccessoryContent accessoryContent, MessageText messageText, MessageText messageText2, HeaderContent headerContent, Button button, Button button2, Button button3, Button button4, Disclaimer disclaimer) {
            super(null);
            this.alignment = alignment;
            this.background = backgroundColor;
            this.accessoryContent = accessoryContent;
            this.headline = messageText;
            this.body = messageText2;
            this.headerContent = headerContent;
            this.primaryButton = button;
            this.secondaryButton = button2;
            this.dismissButton = button3;
            this.contentButton = button4;
            this.disclaimer = disclaimer;
        }

        public /* synthetic */ BaseBanner(Alignment alignment, BackgroundColor backgroundColor, AccessoryContent accessoryContent, MessageText messageText, MessageText messageText2, HeaderContent headerContent, Button button, Button button2, Button button3, Button button4, Disclaimer disclaimer, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Alignment.CENTER : alignment, backgroundColor, accessoryContent, messageText, messageText2, headerContent, button, button2, button3, button4, disclaimer);
        }
    }

    public static final /* synthetic */ void write$Self(BannerTemplate self, z1k output, h661 serialDesc) {
    }
}
