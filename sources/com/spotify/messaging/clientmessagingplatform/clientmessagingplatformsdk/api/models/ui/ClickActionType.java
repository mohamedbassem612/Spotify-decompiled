package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.a1z;
import p.dm5;
import p.hab0;
import p.nma0;
import p.o661;
import p.r0z;
import p.t0z;
import p.znb0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \b\u0087\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*¨\u0006+"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/ClickActionType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/rih1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Companion", "UNSPECIFIED", "DISMISS", "CREATE_PLAYLIST", "EMAIL_VERIFICATION", "OPT_OUT_BRAND_LIFT", "OPEN_PUSH_PERMISSIONS_DIALOG", "OPEN_SYSTEM_SETTINGS_SPOTIFY_APP_PAGE", "SELECT_OPTION", "PRESENT_SSO_EMAIL_COLLECTION", "URL", "EXTERNAL_URL", "INTERNAL_WEBVIEW", "PDP_URL", "ADD_TO_PLAYLIST", "ADD_TO_QUEUE", "ADD_TO_YOUR_EPISODES", "DOWNLOAD_ENTITY", "ENABLE_ALL_NOTIFICATION_PREFERENCE_CATEGORIES_V2", "SAVE_ENTITY", "SAVE_AND_NAVIGATE", "SHARE_CONTENT", "SHARE_ENTITY", "START_PLAYBACK", "OPT_IN", "OPT_OUT", "TOGGLE_NOTIFICATION_PREFERENCE", "OPEN_ADS_TRACKING_PERMISSIONS_DIALOG", "IAP", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
@o661
public enum ClickActionType implements Parcelable {
    UNSPECIFIED,
    DISMISS,
    CREATE_PLAYLIST,
    EMAIL_VERIFICATION,
    OPT_OUT_BRAND_LIFT,
    OPEN_PUSH_PERMISSIONS_DIALOG,
    OPEN_SYSTEM_SETTINGS_SPOTIFY_APP_PAGE,
    SELECT_OPTION,
    PRESENT_SSO_EMAIL_COLLECTION,
    URL,
    EXTERNAL_URL,
    INTERNAL_WEBVIEW,
    PDP_URL,
    ADD_TO_PLAYLIST,
    ADD_TO_QUEUE,
    ADD_TO_YOUR_EPISODES,
    DOWNLOAD_ENTITY,
    ENABLE_ALL_NOTIFICATION_PREFERENCE_CATEGORIES_V2,
    SAVE_ENTITY,
    SAVE_AND_NAVIGATE,
    SHARE_CONTENT,
    SHARE_ENTITY,
    START_PLAYBACK,
    OPT_IN,
    OPT_OUT,
    TOGGLE_NOTIFICATION_PREFERENCE,
    OPEN_ADS_TRACKING_PERMISSIONS_DIALOG,
    IAP;

    private static final /* synthetic */ r0z $ENTRIES = new t0z(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ClickActionType> CREATOR = new Parcelable.Creator<ClickActionType>() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ClickActionType.Creator
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ClickActionType createFromParcel(Parcel parcel) {
            return ClickActionType.valueOf(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ClickActionType[] newArray(int i) {
            return new ClickActionType[i];
        }
    };
    private static final znb0 $cachedSerializer$delegate = dm5.S(2, Companion.AnonymousClass1.INSTANCE);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/ClickActionType$Companion;", "", "<init>", "()V", "Lp/nma0;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/ClickActionType;", "serializer", "()Lp/nma0;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ClickActionType$Companion$1, reason: invalid class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class AnonymousClass1 extends hab0 implements Function0 {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            public final nma0 invoke() {
                return new a1z("com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ClickActionType", ClickActionType.values());
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ nma0 get$cachedSerializer() {
            return (nma0) ClickActionType.$cachedSerializer$delegate.getValue();
        }

        public final nma0 serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    public static r0z getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name());
    }
}
