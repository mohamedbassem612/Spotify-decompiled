package com.spotify.widgets.widgetstate;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.voiceassistants.playermodels.ParsedQueryKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.cy30;
import p.eg;
import p.f4i1;
import p.hhg1;
import p.iko;
import p.kk0;
import p.l1d;
import p.nmo;
import p.r0z;
import p.t0z;
import p.u011;
import p.u890;
import p.x0d;
import p.xcg1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00142\u00020\u0001:\f\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001fBI\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\n\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0011\u0082\u0001\b !\"#$%&'¨\u0006("}, d2 = {"Lcom/spotify/widgets/widgetstate/WidgetState;", "Landroid/os/Parcelable;", "loggingReason", "", "instrumentationValue", "widgetCategory", "isCoverScreenWidget", "", "shouldPlayRecommendations", "shouldOpenEntityPage", "isWorkProfile", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZ)V", "getLoggingReason", "()Ljava/lang/String;", "getInstrumentationValue", "getWidgetCategory", "()Z", "getShouldPlayRecommendations", "getShouldOpenEntityPage", "Companion", WidgetState.TapToReload_ID, WidgetState.LoadingState_ID, WidgetState.Unauthenticated_ID, "PlayPauseState", "ContentType", "LeftButtonConfiguration", "ActiveSession", WidgetState.InactiveSession_ID, WidgetState.Custom_ID, WidgetState.WrappedPlaylist_ID, WidgetState.WrappedStory_ID, "Lcom/spotify/widgets/widgetstate/WidgetState$ActiveSession;", "Lcom/spotify/widgets/widgetstate/WidgetState$Custom;", "Lcom/spotify/widgets/widgetstate/WidgetState$InactiveSession;", "Lcom/spotify/widgets/widgetstate/WidgetState$LoadingState;", "Lcom/spotify/widgets/widgetstate/WidgetState$TapToReload;", "Lcom/spotify/widgets/widgetstate/WidgetState$Unauthenticated;", "Lcom/spotify/widgets/widgetstate/WidgetState$WrappedPlaylist;", "Lcom/spotify/widgets/widgetstate/WidgetState$WrappedStory;", "src_main_java_com_spotify_widgets_widgetstate-widgetstate"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class WidgetState implements Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String Custom_ID = "Custom";
    private static final String InactiveSession_ID = "InactiveSession";
    private static final String LoadingState_ID = "LoadingState";
    private static final String MusicActiveSessionWithoutRecommendations_ID = "MusicActiveSessionWithoutRecommendations";
    private static final String MusicActiveSession_ID = "MusicActiveSession";
    private static final String TalkActiveSessionWithoutRecommendations_ID = "TalkActiveSessionWithoutRecommendations";
    private static final String TalkActiveSession_ID = "TalkActiveSession";
    private static final String TapToReload_ID = "TapToReload";
    private static final String UnauthenticatedWithoutRecommendations_ID = "UnauthenticatedWithoutRecommendations";
    private static final String Unauthenticated_ID = "Unauthenticated";
    private static final String WrappedPlaylist_ID = "WrappedPlaylist";
    private static final String WrappedStory_ID = "WrappedStory";
    private final String instrumentationValue;
    private final boolean isCoverScreenWidget;
    private final boolean isWorkProfile;
    private final String loggingReason;
    private final boolean shouldOpenEntityPage;
    private final boolean shouldPlayRecommendations;
    private final String widgetCategory;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000eR\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000eR\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000eR\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000eR\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/spotify/widgets/widgetstate/WidgetState$Companion;", "", "<init>", "()V", "", "reasonSuffix", "addSuffix", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/spotify/widgets/widgetstate/WidgetState;", "fallback", "Lp/rih1;", "requireNonWrappedFallback", "(Lcom/spotify/widgets/widgetstate/WidgetState;)V", "Unauthenticated_ID", "Ljava/lang/String;", "UnauthenticatedWithoutRecommendations_ID", "LoadingState_ID", "TapToReload_ID", "MusicActiveSession_ID", "MusicActiveSessionWithoutRecommendations_ID", "TalkActiveSession_ID", "TalkActiveSessionWithoutRecommendations_ID", "InactiveSession_ID", "Custom_ID", "WrappedPlaylist_ID", "WrappedStory_ID", "src_main_java_com_spotify_widgets_widgetstate-widgetstate"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String addSuffix(String reasonSuffix) {
            return l1d.m("user-clicked-widget#", reasonSuffix);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void requireNonWrappedFallback(WidgetState fallback) {
            if ((fallback instanceof WrappedPlaylist) || (fallback instanceof WrappedStory)) {
                hhg1.f(l1d.m("Wrapped fallback must not be a Wrapped state, was ", fallback.getInstrumentationValue()));
            }
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/spotify/widgets/widgetstate/WidgetState$ContentType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "MUSIC", "TALK", "AD", "src_main_java_com_spotify_widgets_widgetstate-widgetstate"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum ContentType {
        MUSIC("music"),
        TALK("talk"),
        AD("ad");

        private static final /* synthetic */ r0z $ENTRIES = new t0z(values());
        private final String value;

        ContentType(String str) {
            this.value = str;
        }

        public static r0z getEntries() {
            return $ENTRIES;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/widgets/widgetstate/WidgetState$LeftButtonConfiguration;", "Landroid/os/Parcelable;", "<init>", "()V", "Previous", "Save", "Lcom/spotify/widgets/widgetstate/WidgetState$LeftButtonConfiguration$Previous;", "Lcom/spotify/widgets/widgetstate/WidgetState$LeftButtonConfiguration$Save;", "src_main_java_com_spotify_widgets_widgetstate-widgetstate"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class LeftButtonConfiguration implements Parcelable {

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\bJ\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u0003\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/spotify/widgets/widgetstate/WidgetState$LeftButtonConfiguration$Previous;", "Lcom/spotify/widgets/widgetstate/WidgetState$LeftButtonConfiguration;", "", "isDisabled", "<init>", "(Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/rih1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Z", "copy", "(Z)Lcom/spotify/widgets/widgetstate/WidgetState$LeftButtonConfiguration$Previous;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "src_main_java_com_spotify_widgets_widgetstate-widgetstate"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Previous extends LeftButtonConfiguration {
            public static final Parcelable.Creator<Previous> CREATOR = new Creator();
            private final boolean isDisabled;

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Previous> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Previous createFromParcel(Parcel parcel) {
                    return new Previous(parcel.readInt() != 0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Previous[] newArray(int i) {
                    return new Previous[i];
                }
            }

            public Previous(boolean z) {
                super(null);
                this.isDisabled = z;
            }

            public static /* synthetic */ Previous copy$default(Previous previous, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = previous.isDisabled;
                }
                return previous.copy(z);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final boolean getIsDisabled() {
                return this.isDisabled;
            }

            public final Previous copy(boolean isDisabled) {
                return new Previous(isDisabled);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Previous) && this.isDisabled == ((Previous) other).isDisabled;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isDisabled);
            }

            public final boolean isDisabled() {
                return this.isDisabled;
            }

            public String toString() {
                return super.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeInt(this.isDisabled ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/spotify/widgets/widgetstate/WidgetState$LeftButtonConfiguration$Save;", "Lcom/spotify/widgets/widgetstate/WidgetState$LeftButtonConfiguration;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/rih1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "src_main_java_com_spotify_widgets_widgetstate-widgetstate"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Save extends LeftButtonConfiguration {
            public static final Save INSTANCE = new Save();
            public static final Parcelable.Creator<Save> CREATOR = new Creator();

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Save> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Save createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Save.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Save[] newArray(int i) {
                    return new Save[i];
                }
            }

            private Save() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Save);
            }

            public int hashCode() {
                return 168375376;
            }

            public String toString() {
                return "Save";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeInt(1);
            }
        }

        public /* synthetic */ LeftButtonConfiguration(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private LeftButtonConfiguration() {
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/spotify/widgets/widgetstate/WidgetState$LoadingState;", "Lcom/spotify/widgets/widgetstate/WidgetState;", "", "category", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/rih1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/spotify/widgets/widgetstate/WidgetState$LoadingState;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCategory", "src_main_java_com_spotify_widgets_widgetstate-widgetstate"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadingState extends WidgetState {
        public static final Parcelable.Creator<LoadingState> CREATOR = new Creator();
        private final String category;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LoadingState> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LoadingState createFromParcel(Parcel parcel) {
                return new LoadingState(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LoadingState[] newArray(int i) {
                return new LoadingState[i];
            }
        }

        public LoadingState(String str) {
            super(WidgetStateKt.DEFAULT_REASON, WidgetState.LoadingState_ID, str, false, false, false, false, 120, null);
            this.category = str;
        }

        public static /* synthetic */ LoadingState copy$default(LoadingState loadingState, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loadingState.category;
            }
            return loadingState.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCategory() {
            return this.category;
        }

        public final LoadingState copy(String category) {
            return new LoadingState(category);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LoadingState) && u890.j(this.category, ((LoadingState) other).category);
        }

        public final String getCategory() {
            return this.category;
        }

        public int hashCode() {
            return this.category.hashCode();
        }

        public String toString() {
            return super.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.category);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/widgets/widgetstate/WidgetState$PlayPauseState;", "", "<init>", "(Ljava/lang/String;I)V", ParsedQueryKt.INTENT_PLAY, "PAUSE", "PLAY_DISABLED", "PAUSE_DISABLED", "src_main_java_com_spotify_widgets_widgetstate-widgetstate"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum PlayPauseState {
        PLAY,
        PAUSE,
        PLAY_DISABLED,
        PAUSE_DISABLED;

        private static final /* synthetic */ r0z $ENTRIES = new t0z(values());

        public static r0z getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/spotify/widgets/widgetstate/WidgetState$TapToReload;", "Lcom/spotify/widgets/widgetstate/WidgetState;", "", "category", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/rih1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/spotify/widgets/widgetstate/WidgetState$TapToReload;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCategory", "src_main_java_com_spotify_widgets_widgetstate-widgetstate"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TapToReload extends WidgetState {
        public static final Parcelable.Creator<TapToReload> CREATOR = new Creator();
        private final String category;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<TapToReload> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TapToReload createFromParcel(Parcel parcel) {
                return new TapToReload(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TapToReload[] newArray(int i) {
                return new TapToReload[i];
            }
        }

        public TapToReload(String str) {
            super(WidgetStateKt.DEFAULT_REASON, WidgetState.TapToReload_ID, str, false, false, false, false, 120, null);
            this.category = str;
        }

        public static /* synthetic */ TapToReload copy$default(TapToReload tapToReload, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tapToReload.category;
            }
            return tapToReload.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCategory() {
            return this.category;
        }

        public final TapToReload copy(String category) {
            return new TapToReload(category);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TapToReload) && u890.j(this.category, ((TapToReload) other).category);
        }

        public final String getCategory() {
            return this.category;
        }

        public int hashCode() {
            return this.category.hashCode();
        }

        public String toString() {
            return super.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.category);
        }
    }

    public /* synthetic */ WidgetState(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? false : z3, (i & 64) != 0 ? false : z4, null);
    }

    public String getInstrumentationValue() {
        return this.instrumentationValue;
    }

    public final String getLoggingReason() {
        return this.loggingReason;
    }

    public final boolean getShouldOpenEntityPage() {
        return this.shouldOpenEntityPage;
    }

    public final boolean getShouldPlayRecommendations() {
        return this.shouldPlayRecommendations;
    }

    public String getWidgetCategory() {
        return this.widgetCategory;
    }

    /* JADX INFO: renamed from: isCoverScreenWidget, reason: from getter */
    public final boolean getIsCoverScreenWidget() {
        return this.isCoverScreenWidget;
    }

    /* JADX INFO: renamed from: isWorkProfile, reason: from getter */
    public boolean getIsWorkProfile() {
        return this.isWorkProfile;
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bJ\u001a\u0010\u001c\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b\u0006\u0010\u0015¨\u0006!"}, d2 = {"Lcom/spotify/widgets/widgetstate/WidgetState$Custom;", "Lcom/spotify/widgets/widgetstate/WidgetState;", "Landroid/os/Parcelable;", "", "widgetCategory", "", "isWorkProfile", "<init>", "(Ljava/lang/String;Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/rih1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/spotify/widgets/widgetstate/WidgetState$Custom;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getWidgetCategory", "Z", "src_main_java_com_spotify_widgets_widgetstate-widgetstate"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Custom extends WidgetState implements Parcelable {
        public static final Parcelable.Creator<Custom> CREATOR = new Creator();
        private final boolean isWorkProfile;
        private final String widgetCategory;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Custom> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Custom createFromParcel(Parcel parcel) {
                return new Custom(parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Custom[] newArray(int i) {
                return new Custom[i];
            }
        }

        public Custom(String str, boolean z) {
            super(WidgetState.INSTANCE.addSuffix(WidgetState.Custom_ID), WidgetState.Custom_ID, str, false, false, false, z, 56, null);
            this.widgetCategory = str;
            this.isWorkProfile = z;
        }

        public static /* synthetic */ Custom copy$default(Custom custom, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = custom.widgetCategory;
            }
            if ((i & 2) != 0) {
                z = custom.isWorkProfile;
            }
            return custom.copy(str, z);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getWidgetCategory() {
            return this.widgetCategory;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsWorkProfile() {
            return this.isWorkProfile;
        }

        public final Custom copy(String widgetCategory, boolean isWorkProfile) {
            return new Custom(widgetCategory, isWorkProfile);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Custom)) {
                return false;
            }
            Custom custom = (Custom) other;
            return u890.j(this.widgetCategory, custom.widgetCategory) && this.isWorkProfile == custom.isWorkProfile;
        }

        @Override // com.spotify.widgets.widgetstate.WidgetState
        public String getWidgetCategory() {
            return this.widgetCategory;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isWorkProfile) + (this.widgetCategory.hashCode() * 31);
        }

        @Override // com.spotify.widgets.widgetstate.WidgetState
        /* JADX INFO: renamed from: isWorkProfile */
        public boolean getIsWorkProfile() {
            return this.isWorkProfile;
        }

        public String toString() {
            return super.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.widgetCategory);
            dest.writeInt(this.isWorkProfile ? 1 : 0);
        }

        public /* synthetic */ Custom(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? false : z);
        }
    }

    private WidgetState(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        this.loggingReason = str;
        this.instrumentationValue = str2;
        this.widgetCategory = str3;
        this.isCoverScreenWidget = z;
        this.shouldPlayRecommendations = z2;
        this.shouldOpenEntityPage = z3;
        this.isWorkProfile = z4;
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001+B1\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J>\u0010\u001d\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001bJ\u0010\u0010 \u001a\u00020\rHÖ\u0001¢\u0006\u0004\b \u0010\u000fJ\u001a\u0010#\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0019R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010\u001bR\u001a\u0010\n\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b\n\u0010\u0019¨\u0006,"}, d2 = {"Lcom/spotify/widgets/widgetstate/WidgetState$Unauthenticated;", "Lcom/spotify/widgets/widgetstate/WidgetState;", "Landroid/os/Parcelable;", "", "Lp/u011;", "recommendations", "", "useThemedColors", "", "widgetCategory", "isWorkProfile", "<init>", "(Ljava/util/List;ZLjava/lang/String;Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/rih1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/util/List;", "component2", "()Z", "component3", "()Ljava/lang/String;", "component4", "copy", "(Ljava/util/List;ZLjava/lang/String;Z)Lcom/spotify/widgets/widgetstate/WidgetState$Unauthenticated;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getRecommendations", "Z", "getUseThemedColors", "Ljava/lang/String;", "getWidgetCategory", "Companion", "src_main_java_com_spotify_widgets_widgetstate-widgetstate"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Unauthenticated extends WidgetState implements Parcelable {
        private final boolean isWorkProfile;
        private final List<u011> recommendations;
        private final boolean useThemedColors;
        private final String widgetCategory;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Unauthenticated> CREATOR = new Creator();

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/spotify/widgets/widgetstate/WidgetState$Unauthenticated$Companion;", "", "<init>", "()V", "", "Lp/u011;", "recommendations", "", "getInstrumentationValue", "(Ljava/util/List;)Ljava/lang/String;", "src_main_java_com_spotify_widgets_widgetstate-widgetstate"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final String getInstrumentationValue(List<u011> recommendations) {
                return recommendations.isEmpty() ? WidgetState.UnauthenticatedWithoutRecommendations_ID : WidgetState.Unauthenticated_ID;
            }

            private Companion() {
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Unauthenticated> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Unauthenticated createFromParcel(Parcel parcel) {
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iH = 0;
                while (iH != i) {
                    iH = x0d.h(Unauthenticated.class, parcel, arrayList, iH, 1);
                }
                return new Unauthenticated(arrayList, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Unauthenticated[] newArray(int i) {
                return new Unauthenticated[i];
            }
        }

        public Unauthenticated(List<u011> list, boolean z, String str, boolean z2) {
            super(WidgetState.INSTANCE.addSuffix(WidgetState.Unauthenticated_ID), INSTANCE.getInstrumentationValue(list), str, false, false, false, z2, 56, null);
            this.recommendations = list;
            this.useThemedColors = z;
            this.widgetCategory = str;
            this.isWorkProfile = z2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Unauthenticated copy$default(Unauthenticated unauthenticated, List list, boolean z, String str, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = unauthenticated.recommendations;
            }
            if ((i & 2) != 0) {
                z = unauthenticated.useThemedColors;
            }
            if ((i & 4) != 0) {
                str = unauthenticated.widgetCategory;
            }
            if ((i & 8) != 0) {
                z2 = unauthenticated.isWorkProfile;
            }
            return unauthenticated.copy(list, z, str, z2);
        }

        public final List<u011> component1() {
            return this.recommendations;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getUseThemedColors() {
            return this.useThemedColors;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getWidgetCategory() {
            return this.widgetCategory;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getIsWorkProfile() {
            return this.isWorkProfile;
        }

        public final Unauthenticated copy(List<u011> recommendations, boolean useThemedColors, String widgetCategory, boolean isWorkProfile) {
            return new Unauthenticated(recommendations, useThemedColors, widgetCategory, isWorkProfile);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Unauthenticated)) {
                return false;
            }
            Unauthenticated unauthenticated = (Unauthenticated) other;
            return u890.j(this.recommendations, unauthenticated.recommendations) && this.useThemedColors == unauthenticated.useThemedColors && u890.j(this.widgetCategory, unauthenticated.widgetCategory) && this.isWorkProfile == unauthenticated.isWorkProfile;
        }

        public final List<u011> getRecommendations() {
            return this.recommendations;
        }

        public final boolean getUseThemedColors() {
            return this.useThemedColors;
        }

        @Override // com.spotify.widgets.widgetstate.WidgetState
        public String getWidgetCategory() {
            return this.widgetCategory;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isWorkProfile) + cy30.d(xcg1.g(this.recommendations.hashCode() * 31, 31, this.useThemedColors), 31, this.widgetCategory);
        }

        @Override // com.spotify.widgets.widgetstate.WidgetState
        /* JADX INFO: renamed from: isWorkProfile */
        public boolean getIsWorkProfile() {
            return this.isWorkProfile;
        }

        public String toString() {
            return super.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Iterator itM = kk0.m(dest, this.recommendations);
            while (itM.hasNext()) {
                dest.writeParcelable((Parcelable) itM.next(), flags);
            }
            dest.writeInt(this.useThemedColors ? 1 : 0);
            dest.writeString(this.widgetCategory);
            dest.writeInt(this.isWorkProfile ? 1 : 0);
        }

        public /* synthetic */ Unauthenticated(List list, boolean z, String str, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? false : z, str, (i & 8) != 0 ? false : z2);
        }
    }

    public /* synthetic */ WidgetState(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, z, z2, z3, z4);
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BM\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b#\u0010!J\u0010\u0010$\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b$\u0010!J\\\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b'\u0010\u001fJ\u0010\u0010(\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b(\u0010\u0013J\u001a\u0010+\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b.\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u001dR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b4\u0010!R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b5\u0010!R\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b\r\u0010!R\u001a\u0010\u000e\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u00103\u001a\u0004\b\u000e\u0010!¨\u00066"}, d2 = {"Lcom/spotify/widgets/widgetstate/WidgetState$InactiveSession;", "Lcom/spotify/widgets/widgetstate/WidgetState;", "Landroid/os/Parcelable;", "Lp/nmo;", "metadata", "", "Lp/u011;", "recommendations", "", "widgetCategory", "", "playRecommendations", "openEntityPage", "isCoverScreen", "isWorkProfile", "<init>", "(Lp/nmo;Ljava/util/List;Ljava/lang/String;ZZZZ)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/rih1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lp/nmo;", "component2", "()Ljava/util/List;", "component3", "()Ljava/lang/String;", "component4", "()Z", "component5", "component6", "component7", "copy", "(Lp/nmo;Ljava/util/List;Ljava/lang/String;ZZZZ)Lcom/spotify/widgets/widgetstate/WidgetState$InactiveSession;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lp/nmo;", "getMetadata", "Ljava/util/List;", "getRecommendations", "Ljava/lang/String;", "getWidgetCategory", "Z", "getPlayRecommendations", "getOpenEntityPage", "src_main_java_com_spotify_widgets_widgetstate-widgetstate"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InactiveSession extends WidgetState implements Parcelable {
        public static final Parcelable.Creator<InactiveSession> CREATOR = new Creator();
        private final boolean isCoverScreen;
        private final boolean isWorkProfile;
        private final nmo metadata;
        private final boolean openEntityPage;
        private final boolean playRecommendations;
        private final List<u011> recommendations;
        private final String widgetCategory;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InactiveSession> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InactiveSession createFromParcel(Parcel parcel) {
                boolean z;
                nmo nmoVarCreateFromParcel = nmo.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iH = 0;
                while (true) {
                    z = true;
                    if (iH == i) {
                        break;
                    }
                    iH = x0d.h(InactiveSession.class, parcel, arrayList, iH, 1);
                }
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    z = false;
                }
                return new InactiveSession(nmoVarCreateFromParcel, arrayList, string, z, parcel.readInt() != 0, parcel.readInt() != 0 ? z : false, parcel.readInt() != 0 ? z : false);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InactiveSession[] newArray(int i) {
                return new InactiveSession[i];
            }
        }

        public InactiveSession(nmo nmoVar, List<u011> list, String str, boolean z, boolean z2, boolean z3, boolean z4) {
            super(WidgetState.INSTANCE.addSuffix(WidgetState.InactiveSession_ID), WidgetState.InactiveSession_ID, str, z3, z, z2, z4, null);
            this.metadata = nmoVar;
            this.recommendations = list;
            this.widgetCategory = str;
            this.playRecommendations = z;
            this.openEntityPage = z2;
            this.isCoverScreen = z3;
            this.isWorkProfile = z4;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InactiveSession copy$default(InactiveSession inactiveSession, nmo nmoVar, List list, String str, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
            if ((i & 1) != 0) {
                nmoVar = inactiveSession.metadata;
            }
            if ((i & 2) != 0) {
                list = inactiveSession.recommendations;
            }
            if ((i & 4) != 0) {
                str = inactiveSession.widgetCategory;
            }
            if ((i & 8) != 0) {
                z = inactiveSession.playRecommendations;
            }
            if ((i & 16) != 0) {
                z2 = inactiveSession.openEntityPage;
            }
            if ((i & 32) != 0) {
                z3 = inactiveSession.isCoverScreen;
            }
            if ((i & 64) != 0) {
                z4 = inactiveSession.isWorkProfile;
            }
            boolean z5 = z3;
            boolean z6 = z4;
            boolean z7 = z2;
            String str2 = str;
            return inactiveSession.copy(nmoVar, list, str2, z, z7, z5, z6);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final nmo getMetadata() {
            return this.metadata;
        }

        public final List<u011> component2() {
            return this.recommendations;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getWidgetCategory() {
            return this.widgetCategory;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getPlayRecommendations() {
            return this.playRecommendations;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getOpenEntityPage() {
            return this.openEntityPage;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final boolean getIsCoverScreen() {
            return this.isCoverScreen;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final boolean getIsWorkProfile() {
            return this.isWorkProfile;
        }

        public final InactiveSession copy(nmo metadata, List<u011> recommendations, String widgetCategory, boolean playRecommendations, boolean openEntityPage, boolean isCoverScreen, boolean isWorkProfile) {
            return new InactiveSession(metadata, recommendations, widgetCategory, playRecommendations, openEntityPage, isCoverScreen, isWorkProfile);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InactiveSession)) {
                return false;
            }
            InactiveSession inactiveSession = (InactiveSession) other;
            return u890.j(this.metadata, inactiveSession.metadata) && u890.j(this.recommendations, inactiveSession.recommendations) && u890.j(this.widgetCategory, inactiveSession.widgetCategory) && this.playRecommendations == inactiveSession.playRecommendations && this.openEntityPage == inactiveSession.openEntityPage && this.isCoverScreen == inactiveSession.isCoverScreen && this.isWorkProfile == inactiveSession.isWorkProfile;
        }

        public final nmo getMetadata() {
            return this.metadata;
        }

        public final boolean getOpenEntityPage() {
            return this.openEntityPage;
        }

        public final boolean getPlayRecommendations() {
            return this.playRecommendations;
        }

        public final List<u011> getRecommendations() {
            return this.recommendations;
        }

        @Override // com.spotify.widgets.widgetstate.WidgetState
        public String getWidgetCategory() {
            return this.widgetCategory;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isWorkProfile) + xcg1.g(xcg1.g(xcg1.g(cy30.d(f4i1.b(this.metadata.hashCode() * 31, 31, this.recommendations), 31, this.widgetCategory), 31, this.playRecommendations), 31, this.openEntityPage), 31, this.isCoverScreen);
        }

        public final boolean isCoverScreen() {
            return this.isCoverScreen;
        }

        @Override // com.spotify.widgets.widgetstate.WidgetState
        /* JADX INFO: renamed from: isWorkProfile */
        public boolean getIsWorkProfile() {
            return this.isWorkProfile;
        }

        public String toString() {
            return super.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            this.metadata.writeToParcel(dest, flags);
            Iterator itM = kk0.m(dest, this.recommendations);
            while (itM.hasNext()) {
                dest.writeParcelable((Parcelable) itM.next(), flags);
            }
            dest.writeString(this.widgetCategory);
            dest.writeInt(this.playRecommendations ? 1 : 0);
            dest.writeInt(this.openEntityPage ? 1 : 0);
            dest.writeInt(this.isCoverScreen ? 1 : 0);
            dest.writeInt(this.isWorkProfile ? 1 : 0);
        }

        public /* synthetic */ InactiveSession(nmo nmoVar, List list, String str, boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(nmoVar, list, str, (i & 8) != 0 ? false : z, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? false : z3, (i & 64) != 0 ? false : z4);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B[\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0010\u0010 \u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJ\u0010\u0010\"\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b%\u0010&Jt\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b)\u0010\u001bJ\u0010\u0010*\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b*\u0010\u0013J\u001a\u0010-\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b0\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b1\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b2\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b3\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b4\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b5\u0010\u001bR\u001a\u0010\n\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b6\u0010\u001bR\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b\f\u0010#R\u0017\u0010\r\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b8\u0010\u001bR\u0017\u0010\u000e\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\b:\u0010&¨\u0006;"}, d2 = {"Lcom/spotify/widgets/widgetstate/WidgetState$WrappedPlaylist;", "Lcom/spotify/widgets/widgetstate/WidgetState;", "Landroid/os/Parcelable;", "", "title", "buttonText", "dismissButtonText", "playlistCoverUrl", "backgroundImageUrl", "deeplink", "widgetCategory", "", "isWorkProfile", "backgroundGrainUrl", "fallback", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/spotify/widgets/widgetstate/WidgetState;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/rih1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()Z", "component9", "component10", "()Lcom/spotify/widgets/widgetstate/WidgetState;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/spotify/widgets/widgetstate/WidgetState;)Lcom/spotify/widgets/widgetstate/WidgetState$WrappedPlaylist;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getButtonText", "getDismissButtonText", "getPlaylistCoverUrl", "getBackgroundImageUrl", "getDeeplink", "getWidgetCategory", "Z", "getBackgroundGrainUrl", "Lcom/spotify/widgets/widgetstate/WidgetState;", "getFallback", "src_main_java_com_spotify_widgets_widgetstate-widgetstate"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class WrappedPlaylist extends WidgetState implements Parcelable {
        public static final Parcelable.Creator<WrappedPlaylist> CREATOR = new Creator();
        private final String backgroundGrainUrl;
        private final String backgroundImageUrl;
        private final String buttonText;
        private final String deeplink;
        private final String dismissButtonText;
        private final WidgetState fallback;
        private final boolean isWorkProfile;
        private final String playlistCoverUrl;
        private final String title;
        private final String widgetCategory;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<WrappedPlaylist> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WrappedPlaylist createFromParcel(Parcel parcel) {
                return new WrappedPlaylist(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), (WidgetState) parcel.readParcelable(WrappedPlaylist.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WrappedPlaylist[] newArray(int i) {
                return new WrappedPlaylist[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public WrappedPlaylist(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, WidgetState widgetState) {
            Companion companion = WidgetState.INSTANCE;
            super(companion.addSuffix(WidgetState.WrappedPlaylist_ID), WidgetState.WrappedPlaylist_ID, str7, false, false, false, z, 56, null);
            this.title = str;
            this.buttonText = str2;
            this.dismissButtonText = str3;
            this.playlistCoverUrl = str4;
            this.backgroundImageUrl = str5;
            this.deeplink = str6;
            this.widgetCategory = str7;
            this.isWorkProfile = z;
            this.backgroundGrainUrl = str8;
            this.fallback = widgetState;
            companion.requireNonWrappedFallback(widgetState);
        }

        public static /* synthetic */ WrappedPlaylist copy$default(WrappedPlaylist wrappedPlaylist, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, WidgetState widgetState, int i, Object obj) {
            if ((i & 1) != 0) {
                str = wrappedPlaylist.title;
            }
            if ((i & 2) != 0) {
                str2 = wrappedPlaylist.buttonText;
            }
            if ((i & 4) != 0) {
                str3 = wrappedPlaylist.dismissButtonText;
            }
            if ((i & 8) != 0) {
                str4 = wrappedPlaylist.playlistCoverUrl;
            }
            if ((i & 16) != 0) {
                str5 = wrappedPlaylist.backgroundImageUrl;
            }
            if ((i & 32) != 0) {
                str6 = wrappedPlaylist.deeplink;
            }
            if ((i & 64) != 0) {
                str7 = wrappedPlaylist.widgetCategory;
            }
            if ((i & 128) != 0) {
                z = wrappedPlaylist.isWorkProfile;
            }
            if ((i & 256) != 0) {
                str8 = wrappedPlaylist.backgroundGrainUrl;
            }
            if ((i & 512) != 0) {
                widgetState = wrappedPlaylist.fallback;
            }
            String str9 = str8;
            WidgetState widgetState2 = widgetState;
            String str10 = str7;
            boolean z2 = z;
            String str11 = str5;
            String str12 = str6;
            return wrappedPlaylist.copy(str, str2, str3, str4, str11, str12, str10, z2, str9, widgetState2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final WidgetState getFallback() {
            return this.fallback;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getButtonText() {
            return this.buttonText;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getDismissButtonText() {
            return this.dismissButtonText;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getPlaylistCoverUrl() {
            return this.playlistCoverUrl;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getBackgroundImageUrl() {
            return this.backgroundImageUrl;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getWidgetCategory() {
            return this.widgetCategory;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final boolean getIsWorkProfile() {
            return this.isWorkProfile;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getBackgroundGrainUrl() {
            return this.backgroundGrainUrl;
        }

        public final WrappedPlaylist copy(String title, String buttonText, String dismissButtonText, String playlistCoverUrl, String backgroundImageUrl, String deeplink, String widgetCategory, boolean isWorkProfile, String backgroundGrainUrl, WidgetState fallback) {
            return new WrappedPlaylist(title, buttonText, dismissButtonText, playlistCoverUrl, backgroundImageUrl, deeplink, widgetCategory, isWorkProfile, backgroundGrainUrl, fallback);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WrappedPlaylist)) {
                return false;
            }
            WrappedPlaylist wrappedPlaylist = (WrappedPlaylist) other;
            return u890.j(this.title, wrappedPlaylist.title) && u890.j(this.buttonText, wrappedPlaylist.buttonText) && u890.j(this.dismissButtonText, wrappedPlaylist.dismissButtonText) && u890.j(this.playlistCoverUrl, wrappedPlaylist.playlistCoverUrl) && u890.j(this.backgroundImageUrl, wrappedPlaylist.backgroundImageUrl) && u890.j(this.deeplink, wrappedPlaylist.deeplink) && u890.j(this.widgetCategory, wrappedPlaylist.widgetCategory) && this.isWorkProfile == wrappedPlaylist.isWorkProfile && u890.j(this.backgroundGrainUrl, wrappedPlaylist.backgroundGrainUrl) && u890.j(this.fallback, wrappedPlaylist.fallback);
        }

        public final String getBackgroundGrainUrl() {
            return this.backgroundGrainUrl;
        }

        public final String getBackgroundImageUrl() {
            return this.backgroundImageUrl;
        }

        public final String getButtonText() {
            return this.buttonText;
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public final String getDismissButtonText() {
            return this.dismissButtonText;
        }

        public final WidgetState getFallback() {
            return this.fallback;
        }

        public final String getPlaylistCoverUrl() {
            return this.playlistCoverUrl;
        }

        public final String getTitle() {
            return this.title;
        }

        @Override // com.spotify.widgets.widgetstate.WidgetState
        public String getWidgetCategory() {
            return this.widgetCategory;
        }

        public int hashCode() {
            return this.fallback.hashCode() + cy30.d(xcg1.g(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.title.hashCode() * 31, 31, this.buttonText), 31, this.dismissButtonText), 31, this.playlistCoverUrl), 31, this.backgroundImageUrl), 31, this.deeplink), 31, this.widgetCategory), 31, this.isWorkProfile), 31, this.backgroundGrainUrl);
        }

        @Override // com.spotify.widgets.widgetstate.WidgetState
        /* JADX INFO: renamed from: isWorkProfile */
        public boolean getIsWorkProfile() {
            return this.isWorkProfile;
        }

        public String toString() {
            return super.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.title);
            dest.writeString(this.buttonText);
            dest.writeString(this.dismissButtonText);
            dest.writeString(this.playlistCoverUrl);
            dest.writeString(this.backgroundImageUrl);
            dest.writeString(this.deeplink);
            dest.writeString(this.widgetCategory);
            dest.writeInt(this.isWorkProfile ? 1 : 0);
            dest.writeString(this.backgroundGrainUrl);
            dest.writeParcelable(this.fallback, flags);
        }

        public /* synthetic */ WrappedPlaylist(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, WidgetState widgetState, int i, DefaultConstructorMarker defaultConstructorMarker) {
            String str9;
            WidgetState loadingState;
            boolean z2 = (i & 128) != 0 ? false : z;
            if ((i & 512) != 0) {
                str9 = str7;
                loadingState = new LoadingState(str9);
            } else {
                str9 = str7;
                loadingState = widgetState;
            }
            this(str, str2, str3, str4, str5, str6, str9, z2, str8, loadingState);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bs\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0010\u0010#\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0010\u0010%\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b%\u0010\u001eJ\u0010\u0010&\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b(\u0010\u001eJ\u0010\u0010)\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b)\u0010\u001eJ\u0010\u0010*\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b*\u0010\u001eJ\u0010\u0010+\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0092\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b/\u0010\u001eJ\u0010\u00100\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b0\u0010\u0016J\u001a\u00103\u001a\u00020\f2\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b3\u00104R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u00105\u001a\u0004\b6\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b7\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b8\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b9\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b:\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b;\u0010\u001eR\u0017\u0010\n\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b<\u0010\u001eR\u001a\u0010\u000b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b=\u0010\u001eR\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\b\r\u0010'R\u0017\u0010\u000e\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\b?\u0010\u001eR\u0017\u0010\u000f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u00105\u001a\u0004\b@\u0010\u001eR\u0017\u0010\u0010\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u00105\u001a\u0004\bA\u0010\u001eR\u0017\u0010\u0011\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0011\u0010B\u001a\u0004\bC\u0010,¨\u0006D"}, d2 = {"Lcom/spotify/widgets/widgetstate/WidgetState$WrappedStory;", "Lcom/spotify/widgets/widgetstate/WidgetState;", "Landroid/os/Parcelable;", "", "title", "titleSmall", "subtitle", "buttonText", "dismissButtonText", "backgroundImageUrl", "deeplink", "widgetCategory", "", "isWorkProfile", "backgroundGrainUrl", "ringsImageUrl", "logoImageUrl", "fallback", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/spotify/widgets/widgetstate/WidgetState;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/rih1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()Z", "component10", "component11", "component12", "component13", "()Lcom/spotify/widgets/widgetstate/WidgetState;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/spotify/widgets/widgetstate/WidgetState;)Lcom/spotify/widgets/widgetstate/WidgetState$WrappedStory;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitleSmall", "getSubtitle", "getButtonText", "getDismissButtonText", "getBackgroundImageUrl", "getDeeplink", "getWidgetCategory", "Z", "getBackgroundGrainUrl", "getRingsImageUrl", "getLogoImageUrl", "Lcom/spotify/widgets/widgetstate/WidgetState;", "getFallback", "src_main_java_com_spotify_widgets_widgetstate-widgetstate"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class WrappedStory extends WidgetState implements Parcelable {
        public static final Parcelable.Creator<WrappedStory> CREATOR = new Creator();
        private final String backgroundGrainUrl;
        private final String backgroundImageUrl;
        private final String buttonText;
        private final String deeplink;
        private final String dismissButtonText;
        private final WidgetState fallback;
        private final boolean isWorkProfile;
        private final String logoImageUrl;
        private final String ringsImageUrl;
        private final String subtitle;
        private final String title;
        private final String titleSmall;
        private final String widgetCategory;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<WrappedStory> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WrappedStory createFromParcel(Parcel parcel) {
                return new WrappedStory(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), (WidgetState) parcel.readParcelable(WrappedStory.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WrappedStory[] newArray(int i) {
                return new WrappedStory[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public WrappedStory(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, String str9, String str10, String str11, WidgetState widgetState) {
            Companion companion = WidgetState.INSTANCE;
            super(companion.addSuffix(WidgetState.WrappedStory_ID), WidgetState.WrappedStory_ID, str8, false, false, false, z, 56, null);
            this.title = str;
            this.titleSmall = str2;
            this.subtitle = str3;
            this.buttonText = str4;
            this.dismissButtonText = str5;
            this.backgroundImageUrl = str6;
            this.deeplink = str7;
            this.widgetCategory = str8;
            this.isWorkProfile = z;
            this.backgroundGrainUrl = str9;
            this.ringsImageUrl = str10;
            this.logoImageUrl = str11;
            this.fallback = widgetState;
            companion.requireNonWrappedFallback(widgetState);
        }

        public static /* synthetic */ WrappedStory copy$default(WrappedStory wrappedStory, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, String str9, String str10, String str11, WidgetState widgetState, int i, Object obj) {
            if ((i & 1) != 0) {
                str = wrappedStory.title;
            }
            return wrappedStory.copy(str, (i & 2) != 0 ? wrappedStory.titleSmall : str2, (i & 4) != 0 ? wrappedStory.subtitle : str3, (i & 8) != 0 ? wrappedStory.buttonText : str4, (i & 16) != 0 ? wrappedStory.dismissButtonText : str5, (i & 32) != 0 ? wrappedStory.backgroundImageUrl : str6, (i & 64) != 0 ? wrappedStory.deeplink : str7, (i & 128) != 0 ? wrappedStory.widgetCategory : str8, (i & 256) != 0 ? wrappedStory.isWorkProfile : z, (i & 512) != 0 ? wrappedStory.backgroundGrainUrl : str9, (i & 1024) != 0 ? wrappedStory.ringsImageUrl : str10, (i & 2048) != 0 ? wrappedStory.logoImageUrl : str11, (i & 4096) != 0 ? wrappedStory.fallback : widgetState);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getBackgroundGrainUrl() {
            return this.backgroundGrainUrl;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final String getRingsImageUrl() {
            return this.ringsImageUrl;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        public final String getLogoImageUrl() {
            return this.logoImageUrl;
        }

        /* JADX INFO: renamed from: component13, reason: from getter */
        public final WidgetState getFallback() {
            return this.fallback;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTitleSmall() {
            return this.titleSmall;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getButtonText() {
            return this.buttonText;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getDismissButtonText() {
            return this.dismissButtonText;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getBackgroundImageUrl() {
            return this.backgroundImageUrl;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getWidgetCategory() {
            return this.widgetCategory;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final boolean getIsWorkProfile() {
            return this.isWorkProfile;
        }

        public final WrappedStory copy(String title, String titleSmall, String subtitle, String buttonText, String dismissButtonText, String backgroundImageUrl, String deeplink, String widgetCategory, boolean isWorkProfile, String backgroundGrainUrl, String ringsImageUrl, String logoImageUrl, WidgetState fallback) {
            return new WrappedStory(title, titleSmall, subtitle, buttonText, dismissButtonText, backgroundImageUrl, deeplink, widgetCategory, isWorkProfile, backgroundGrainUrl, ringsImageUrl, logoImageUrl, fallback);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WrappedStory)) {
                return false;
            }
            WrappedStory wrappedStory = (WrappedStory) other;
            return u890.j(this.title, wrappedStory.title) && u890.j(this.titleSmall, wrappedStory.titleSmall) && u890.j(this.subtitle, wrappedStory.subtitle) && u890.j(this.buttonText, wrappedStory.buttonText) && u890.j(this.dismissButtonText, wrappedStory.dismissButtonText) && u890.j(this.backgroundImageUrl, wrappedStory.backgroundImageUrl) && u890.j(this.deeplink, wrappedStory.deeplink) && u890.j(this.widgetCategory, wrappedStory.widgetCategory) && this.isWorkProfile == wrappedStory.isWorkProfile && u890.j(this.backgroundGrainUrl, wrappedStory.backgroundGrainUrl) && u890.j(this.ringsImageUrl, wrappedStory.ringsImageUrl) && u890.j(this.logoImageUrl, wrappedStory.logoImageUrl) && u890.j(this.fallback, wrappedStory.fallback);
        }

        public final String getBackgroundGrainUrl() {
            return this.backgroundGrainUrl;
        }

        public final String getBackgroundImageUrl() {
            return this.backgroundImageUrl;
        }

        public final String getButtonText() {
            return this.buttonText;
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public final String getDismissButtonText() {
            return this.dismissButtonText;
        }

        public final WidgetState getFallback() {
            return this.fallback;
        }

        public final String getLogoImageUrl() {
            return this.logoImageUrl;
        }

        public final String getRingsImageUrl() {
            return this.ringsImageUrl;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getTitleSmall() {
            return this.titleSmall;
        }

        @Override // com.spotify.widgets.widgetstate.WidgetState
        public String getWidgetCategory() {
            return this.widgetCategory;
        }

        public int hashCode() {
            return this.fallback.hashCode() + cy30.d(cy30.d(cy30.d(xcg1.g(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.title.hashCode() * 31, 31, this.titleSmall), 31, this.subtitle), 31, this.buttonText), 31, this.dismissButtonText), 31, this.backgroundImageUrl), 31, this.deeplink), 31, this.widgetCategory), 31, this.isWorkProfile), 31, this.backgroundGrainUrl), 31, this.ringsImageUrl), 31, this.logoImageUrl);
        }

        @Override // com.spotify.widgets.widgetstate.WidgetState
        /* JADX INFO: renamed from: isWorkProfile */
        public boolean getIsWorkProfile() {
            return this.isWorkProfile;
        }

        public String toString() {
            return super.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.title);
            dest.writeString(this.titleSmall);
            dest.writeString(this.subtitle);
            dest.writeString(this.buttonText);
            dest.writeString(this.dismissButtonText);
            dest.writeString(this.backgroundImageUrl);
            dest.writeString(this.deeplink);
            dest.writeString(this.widgetCategory);
            dest.writeInt(this.isWorkProfile ? 1 : 0);
            dest.writeString(this.backgroundGrainUrl);
            dest.writeString(this.ringsImageUrl);
            dest.writeString(this.logoImageUrl);
            dest.writeParcelable(this.fallback, flags);
        }

        public /* synthetic */ WrappedStory(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, String str9, String str10, String str11, WidgetState widgetState, int i, DefaultConstructorMarker defaultConstructorMarker) {
            String str12;
            WidgetState loadingState;
            boolean z2 = (i & 256) != 0 ? false : z;
            if ((i & 4096) != 0) {
                str12 = str8;
                loadingState = new LoadingState(str12);
            } else {
                str12 = str8;
                loadingState = widgetState;
            }
            this(str, str2, str3, str4, str5, str6, str7, str12, z2, str9, str10, str11, loadingState);
        }
    }

    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0087\b\u0018\u0000 Y2\u00020\u00012\u00020\u0002:\u0001YB\u0097\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0012¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001d¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b6\u00105J\u0012\u00107\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b7\u00103J\u0010\u00108\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b8\u00105J\u0010\u00109\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b9\u00105J\u0010\u0010:\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b:\u00105J\u0010\u0010;\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b;\u00105J\u0010\u0010<\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b<\u00105J®\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00122\b\b\u0002\u0010\u0018\u001a\u00020\u00122\b\b\u0002\u0010\u0019\u001a\u00020\u00122\b\b\u0002\u0010\u001a\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b?\u00103J\u0010\u0010@\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b@\u0010\u001fJ\u001a\u0010C\u001a\u00020\u00122\b\u0010B\u001a\u0004\u0018\u00010AHÖ\u0003¢\u0006\u0004\bC\u0010DR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010E\u001a\u0004\bF\u0010'R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010G\u001a\u0004\bH\u0010)R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010I\u001a\u0004\bJ\u0010+R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010K\u001a\u0004\bL\u0010-R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010M\u001a\u0004\bN\u0010/R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010O\u001a\u0004\bP\u00101R\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010Q\u001a\u0004\bR\u00103R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010S\u001a\u0004\bT\u00105R\u0017\u0010\u0014\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010S\u001a\u0004\b\u0014\u00105R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0015\u0010Q\u001a\u0004\bU\u00103R\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0016\u0010S\u001a\u0004\bV\u00105R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0017\u0010S\u001a\u0004\bW\u00105R\u0017\u0010\u0018\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0018\u0010S\u001a\u0004\b\u0018\u00105R\u0017\u0010\u0019\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0019\u0010S\u001a\u0004\bX\u00105R\u001a\u0010\u001a\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010S\u001a\u0004\b\u001a\u00105¨\u0006Z"}, d2 = {"Lcom/spotify/widgets/widgetstate/WidgetState$ActiveSession;", "Lcom/spotify/widgets/widgetstate/WidgetState;", "Landroid/os/Parcelable;", "Lcom/spotify/widgets/widgetstate/CurrentTrackMetadata;", "metadata", "", "Lp/u011;", "recommendations", "Lcom/spotify/widgets/widgetstate/WidgetState$ContentType;", "contentType", "Lcom/spotify/widgets/widgetstate/WidgetState$PlayPauseState;", "playPauseState", "Lcom/spotify/widgets/widgetstate/WidgetState$LeftButtonConfiguration;", "leftButtonConfiguration", "Lp/iko;", "curationState", "", "widgetCategory", "", "disableNext", "isEnhancedRecommendation", "tooltip", "playRecommendations", "openEntityPage", "isCoverScreen", "hideSkipButtonsInCompactFormat", "isWorkProfile", "<init>", "(Lcom/spotify/widgets/widgetstate/CurrentTrackMetadata;Ljava/util/List;Lcom/spotify/widgets/widgetstate/WidgetState$ContentType;Lcom/spotify/widgets/widgetstate/WidgetState$PlayPauseState;Lcom/spotify/widgets/widgetstate/WidgetState$LeftButtonConfiguration;Lp/iko;Ljava/lang/String;ZZLjava/lang/String;ZZZZZ)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/rih1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/spotify/widgets/widgetstate/CurrentTrackMetadata;", "component2", "()Ljava/util/List;", "component3", "()Lcom/spotify/widgets/widgetstate/WidgetState$ContentType;", "component4", "()Lcom/spotify/widgets/widgetstate/WidgetState$PlayPauseState;", "component5", "()Lcom/spotify/widgets/widgetstate/WidgetState$LeftButtonConfiguration;", "component6", "()Lp/iko;", "component7", "()Ljava/lang/String;", "component8", "()Z", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Lcom/spotify/widgets/widgetstate/CurrentTrackMetadata;Ljava/util/List;Lcom/spotify/widgets/widgetstate/WidgetState$ContentType;Lcom/spotify/widgets/widgetstate/WidgetState$PlayPauseState;Lcom/spotify/widgets/widgetstate/WidgetState$LeftButtonConfiguration;Lp/iko;Ljava/lang/String;ZZLjava/lang/String;ZZZZZ)Lcom/spotify/widgets/widgetstate/WidgetState$ActiveSession;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/spotify/widgets/widgetstate/CurrentTrackMetadata;", "getMetadata", "Ljava/util/List;", "getRecommendations", "Lcom/spotify/widgets/widgetstate/WidgetState$ContentType;", "getContentType", "Lcom/spotify/widgets/widgetstate/WidgetState$PlayPauseState;", "getPlayPauseState", "Lcom/spotify/widgets/widgetstate/WidgetState$LeftButtonConfiguration;", "getLeftButtonConfiguration", "Lp/iko;", "getCurationState", "Ljava/lang/String;", "getWidgetCategory", "Z", "getDisableNext", "getTooltip", "getPlayRecommendations", "getOpenEntityPage", "getHideSkipButtonsInCompactFormat", "Companion", "src_main_java_com_spotify_widgets_widgetstate-widgetstate"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ActiveSession extends WidgetState implements Parcelable {
        private final ContentType contentType;
        private final iko curationState;
        private final boolean disableNext;
        private final boolean hideSkipButtonsInCompactFormat;
        private final boolean isCoverScreen;
        private final boolean isEnhancedRecommendation;
        private final boolean isWorkProfile;
        private final LeftButtonConfiguration leftButtonConfiguration;
        private final CurrentTrackMetadata metadata;
        private final boolean openEntityPage;
        private final PlayPauseState playPauseState;
        private final boolean playRecommendations;
        private final List<u011> recommendations;
        private final String tooltip;
        private final String widgetCategory;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<ActiveSession> CREATOR = new Creator();

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/spotify/widgets/widgetstate/WidgetState$ActiveSession$Companion;", "", "<init>", "()V", "Lcom/spotify/widgets/widgetstate/WidgetState$ContentType;", "contentType", "", "Lp/u011;", "recommendations", "", "getInstrumentationValue", "(Lcom/spotify/widgets/widgetstate/WidgetState$ContentType;Ljava/util/List;)Ljava/lang/String;", "getReasonSuffix", "(Lcom/spotify/widgets/widgetstate/WidgetState$ContentType;)Ljava/lang/String;", "src_main_java_com_spotify_widgets_widgetstate-widgetstate"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ContentType.values().length];
                    try {
                        iArr[ContentType.MUSIC.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ContentType.AD.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ContentType.TALK.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final String getInstrumentationValue(ContentType contentType, List<u011> recommendations) {
                if (recommendations.isEmpty()) {
                    int i = WhenMappings.$EnumSwitchMapping$0[contentType.ordinal()];
                    if (i == 1 || i == 2) {
                        return WidgetState.MusicActiveSessionWithoutRecommendations_ID;
                    }
                    if (i == 3) {
                        return WidgetState.TalkActiveSessionWithoutRecommendations_ID;
                    }
                    eg.o();
                    return null;
                }
                int i2 = WhenMappings.$EnumSwitchMapping$0[contentType.ordinal()];
                if (i2 == 1 || i2 == 2) {
                    return WidgetState.MusicActiveSession_ID;
                }
                if (i2 == 3) {
                    return WidgetState.TalkActiveSession_ID;
                }
                eg.o();
                return null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final String getReasonSuffix(ContentType contentType) {
                int i = WhenMappings.$EnumSwitchMapping$0[contentType.ordinal()];
                if (i == 1 || i == 2) {
                    return WidgetState.MusicActiveSession_ID;
                }
                if (i == 3) {
                    return WidgetState.TalkActiveSession_ID;
                }
                eg.o();
                return null;
            }

            private Companion() {
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ActiveSession> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ActiveSession createFromParcel(Parcel parcel) {
                CurrentTrackMetadata currentTrackMetadataCreateFromParcel = CurrentTrackMetadata.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iH = 0;
                while (iH != i) {
                    iH = x0d.h(ActiveSession.class, parcel, arrayList, iH, 1);
                }
                return new ActiveSession(currentTrackMetadataCreateFromParcel, arrayList, ContentType.valueOf(parcel.readString()), PlayPauseState.valueOf(parcel.readString()), (LeftButtonConfiguration) parcel.readParcelable(ActiveSession.class.getClassLoader()), iko.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ActiveSession[] newArray(int i) {
                return new ActiveSession[i];
            }
        }

        public /* synthetic */ ActiveSession(CurrentTrackMetadata currentTrackMetadata, List list, ContentType contentType, PlayPauseState playPauseState, LeftButtonConfiguration leftButtonConfiguration, iko ikoVar, String str, boolean z, boolean z2, String str2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(currentTrackMetadata, list, contentType, playPauseState, leftButtonConfiguration, ikoVar, str, (i & 128) != 0 ? false : z, (i & 256) != 0 ? false : z2, (i & 512) != 0 ? null : str2, (i & 1024) != 0 ? false : z3, (i & 2048) != 0 ? true : z4, (i & 4096) != 0 ? false : z5, (i & 8192) != 0 ? false : z6, (i & 16384) != 0 ? false : z7);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final CurrentTrackMetadata getMetadata() {
            return this.metadata;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getTooltip() {
            return this.tooltip;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final boolean getPlayRecommendations() {
            return this.playRecommendations;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        public final boolean getOpenEntityPage() {
            return this.openEntityPage;
        }

        /* JADX INFO: renamed from: component13, reason: from getter */
        public final boolean getIsCoverScreen() {
            return this.isCoverScreen;
        }

        /* JADX INFO: renamed from: component14, reason: from getter */
        public final boolean getHideSkipButtonsInCompactFormat() {
            return this.hideSkipButtonsInCompactFormat;
        }

        /* JADX INFO: renamed from: component15, reason: from getter */
        public final boolean getIsWorkProfile() {
            return this.isWorkProfile;
        }

        public final List<u011> component2() {
            return this.recommendations;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final ContentType getContentType() {
            return this.contentType;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final PlayPauseState getPlayPauseState() {
            return this.playPauseState;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final LeftButtonConfiguration getLeftButtonConfiguration() {
            return this.leftButtonConfiguration;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final iko getCurationState() {
            return this.curationState;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getWidgetCategory() {
            return this.widgetCategory;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final boolean getDisableNext() {
            return this.disableNext;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final boolean getIsEnhancedRecommendation() {
            return this.isEnhancedRecommendation;
        }

        public final ActiveSession copy(CurrentTrackMetadata metadata, List<u011> recommendations, ContentType contentType, PlayPauseState playPauseState, LeftButtonConfiguration leftButtonConfiguration, iko curationState, String widgetCategory, boolean disableNext, boolean isEnhancedRecommendation, String tooltip, boolean playRecommendations, boolean openEntityPage, boolean isCoverScreen, boolean hideSkipButtonsInCompactFormat, boolean isWorkProfile) {
            return new ActiveSession(metadata, recommendations, contentType, playPauseState, leftButtonConfiguration, curationState, widgetCategory, disableNext, isEnhancedRecommendation, tooltip, playRecommendations, openEntityPage, isCoverScreen, hideSkipButtonsInCompactFormat, isWorkProfile);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActiveSession)) {
                return false;
            }
            ActiveSession activeSession = (ActiveSession) other;
            return u890.j(this.metadata, activeSession.metadata) && u890.j(this.recommendations, activeSession.recommendations) && this.contentType == activeSession.contentType && this.playPauseState == activeSession.playPauseState && u890.j(this.leftButtonConfiguration, activeSession.leftButtonConfiguration) && this.curationState == activeSession.curationState && u890.j(this.widgetCategory, activeSession.widgetCategory) && this.disableNext == activeSession.disableNext && this.isEnhancedRecommendation == activeSession.isEnhancedRecommendation && u890.j(this.tooltip, activeSession.tooltip) && this.playRecommendations == activeSession.playRecommendations && this.openEntityPage == activeSession.openEntityPage && this.isCoverScreen == activeSession.isCoverScreen && this.hideSkipButtonsInCompactFormat == activeSession.hideSkipButtonsInCompactFormat && this.isWorkProfile == activeSession.isWorkProfile;
        }

        public final ContentType getContentType() {
            return this.contentType;
        }

        public final iko getCurationState() {
            return this.curationState;
        }

        public final boolean getDisableNext() {
            return this.disableNext;
        }

        public final boolean getHideSkipButtonsInCompactFormat() {
            return this.hideSkipButtonsInCompactFormat;
        }

        public final LeftButtonConfiguration getLeftButtonConfiguration() {
            return this.leftButtonConfiguration;
        }

        public final CurrentTrackMetadata getMetadata() {
            return this.metadata;
        }

        public final boolean getOpenEntityPage() {
            return this.openEntityPage;
        }

        public final PlayPauseState getPlayPauseState() {
            return this.playPauseState;
        }

        public final boolean getPlayRecommendations() {
            return this.playRecommendations;
        }

        public final List<u011> getRecommendations() {
            return this.recommendations;
        }

        public final String getTooltip() {
            return this.tooltip;
        }

        @Override // com.spotify.widgets.widgetstate.WidgetState
        public String getWidgetCategory() {
            return this.widgetCategory;
        }

        public int hashCode() {
            int iG = xcg1.g(xcg1.g(cy30.d((this.curationState.hashCode() + ((this.leftButtonConfiguration.hashCode() + ((this.playPauseState.hashCode() + ((this.contentType.hashCode() + f4i1.b(this.metadata.hashCode() * 31, 31, this.recommendations)) * 31)) * 31)) * 31)) * 31, 31, this.widgetCategory), 31, this.disableNext), 31, this.isEnhancedRecommendation);
            String str = this.tooltip;
            return Boolean.hashCode(this.isWorkProfile) + xcg1.g(xcg1.g(xcg1.g(xcg1.g((iG + (str == null ? 0 : str.hashCode())) * 31, 31, this.playRecommendations), 31, this.openEntityPage), 31, this.isCoverScreen), 31, this.hideSkipButtonsInCompactFormat);
        }

        public final boolean isCoverScreen() {
            return this.isCoverScreen;
        }

        public final boolean isEnhancedRecommendation() {
            return this.isEnhancedRecommendation;
        }

        @Override // com.spotify.widgets.widgetstate.WidgetState
        /* JADX INFO: renamed from: isWorkProfile */
        public boolean getIsWorkProfile() {
            return this.isWorkProfile;
        }

        public String toString() {
            return super.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            this.metadata.writeToParcel(dest, flags);
            Iterator itM = kk0.m(dest, this.recommendations);
            while (itM.hasNext()) {
                dest.writeParcelable((Parcelable) itM.next(), flags);
            }
            dest.writeString(this.contentType.name());
            dest.writeString(this.playPauseState.name());
            dest.writeParcelable(this.leftButtonConfiguration, flags);
            dest.writeString(this.curationState.name());
            dest.writeString(this.widgetCategory);
            dest.writeInt(this.disableNext ? 1 : 0);
            dest.writeInt(this.isEnhancedRecommendation ? 1 : 0);
            dest.writeString(this.tooltip);
            dest.writeInt(this.playRecommendations ? 1 : 0);
            dest.writeInt(this.openEntityPage ? 1 : 0);
            dest.writeInt(this.isCoverScreen ? 1 : 0);
            dest.writeInt(this.hideSkipButtonsInCompactFormat ? 1 : 0);
            dest.writeInt(this.isWorkProfile ? 1 : 0);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public ActiveSession(CurrentTrackMetadata currentTrackMetadata, List<u011> list, ContentType contentType, PlayPauseState playPauseState, LeftButtonConfiguration leftButtonConfiguration, iko ikoVar, String str, boolean z, boolean z2, String str2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
            Companion companion = WidgetState.INSTANCE;
            Companion companion2 = INSTANCE;
            super(companion.addSuffix(companion2.getReasonSuffix(contentType)), companion2.getInstrumentationValue(contentType, list), str, z5, z3, z4, z7, null);
            this.metadata = currentTrackMetadata;
            this.recommendations = list;
            this.contentType = contentType;
            this.playPauseState = playPauseState;
            this.leftButtonConfiguration = leftButtonConfiguration;
            this.curationState = ikoVar;
            this.widgetCategory = str;
            this.disableNext = z;
            this.isEnhancedRecommendation = z2;
            this.tooltip = str2;
            this.playRecommendations = z3;
            this.openEntityPage = z4;
            this.isCoverScreen = z5;
            this.hideSkipButtonsInCompactFormat = z6;
            this.isWorkProfile = z7;
        }
    }
}
