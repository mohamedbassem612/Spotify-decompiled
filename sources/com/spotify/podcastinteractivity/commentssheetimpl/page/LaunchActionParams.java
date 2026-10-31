package com.spotify.podcastinteractivity.commentssheetimpl.page;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.playlist4.proto.PlaylistSyncReasonProto;
import kotlin.Metadata;
import p.djb0;
import p.ejb0;
import p.fjb0;
import p.gjb0;
import p.hjb0;
import p.njb0;
import p.tv80;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\t\n\u000b\f\rJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0005\u000e\u000f\u0010\u0011\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Lcom/spotify/podcastinteractivity/commentssheetimpl/page/LaunchActionParams;", "Landroid/os/Parcelable;", "Lp/njb0;", "toDomainLaunchAction", "()Lp/njb0;", "", "getCommentUri", "()Ljava/lang/String;", "commentUri", "ShowKeyboard", "ReplyToComment", "ExpandThread", "ShowSingleCommentThread", "ShowContextMenu", "Lcom/spotify/podcastinteractivity/commentssheetimpl/page/LaunchActionParams$ExpandThread;", "Lcom/spotify/podcastinteractivity/commentssheetimpl/page/LaunchActionParams$ReplyToComment;", "Lcom/spotify/podcastinteractivity/commentssheetimpl/page/LaunchActionParams$ShowContextMenu;", "Lcom/spotify/podcastinteractivity/commentssheetimpl/page/LaunchActionParams$ShowKeyboard;", "Lcom/spotify/podcastinteractivity/commentssheetimpl/page/LaunchActionParams$ShowSingleCommentThread;", "src_main_java_com_spotify_podcastinteractivity_commentssheetimpl-commentssheetimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
public interface LaunchActionParams extends Parcelable {

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0013J\u0010\u0010\u0017\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000bJ\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0013R\u0014\u0010 \u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0013¨\u0006!"}, d2 = {"Lcom/spotify/podcastinteractivity/commentssheetimpl/page/LaunchActionParams$ExpandThread;", "Lcom/spotify/podcastinteractivity/commentssheetimpl/page/LaunchActionParams;", "", "rootCommentUri", "<init>", "(Ljava/lang/String;)V", "Lp/njb0;", "toDomainLaunchAction", "()Lp/njb0;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/rih1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/spotify/podcastinteractivity/commentssheetimpl/page/LaunchActionParams$ExpandThread;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRootCommentUri", "getCommentUri", "commentUri", "src_main_java_com_spotify_podcastinteractivity_commentssheetimpl-commentssheetimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
    public static final /* data */ class ExpandThread implements LaunchActionParams {
        public static final int $stable = 0;
        public static final Parcelable.Creator<ExpandThread> CREATOR = new Creator();
        private final String rootCommentUri;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
        public static final class Creator implements Parcelable.Creator<ExpandThread> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ExpandThread createFromParcel(Parcel parcel) {
                return new ExpandThread(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ExpandThread[] newArray(int i) {
                return new ExpandThread[i];
            }
        }

        public ExpandThread(String str) {
            this.rootCommentUri = str;
        }

        public static /* synthetic */ ExpandThread copy$default(ExpandThread expandThread, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = expandThread.rootCommentUri;
            }
            return expandThread.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getRootCommentUri() {
            return this.rootCommentUri;
        }

        public final ExpandThread copy(String rootCommentUri) {
            return new ExpandThread(rootCommentUri);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ExpandThread) && u890.j(this.rootCommentUri, ((ExpandThread) other).rootCommentUri);
        }

        @Override // com.spotify.podcastinteractivity.commentssheetimpl.page.LaunchActionParams
        public String getCommentUri() {
            return this.rootCommentUri;
        }

        public final String getRootCommentUri() {
            return this.rootCommentUri;
        }

        public int hashCode() {
            return this.rootCommentUri.hashCode();
        }

        @Override // com.spotify.podcastinteractivity.commentssheetimpl.page.LaunchActionParams
        public njb0 toDomainLaunchAction() {
            return new djb0(this.rootCommentUri);
        }

        public String toString() {
            return super.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.rootCommentUri);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0013J\u0010\u0010\u0017\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000bJ\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/spotify/podcastinteractivity/commentssheetimpl/page/LaunchActionParams$ReplyToComment;", "Lcom/spotify/podcastinteractivity/commentssheetimpl/page/LaunchActionParams;", "", "commentUri", "<init>", "(Ljava/lang/String;)V", "Lp/njb0;", "toDomainLaunchAction", "()Lp/njb0;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/rih1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/spotify/podcastinteractivity/commentssheetimpl/page/LaunchActionParams$ReplyToComment;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCommentUri", "src_main_java_com_spotify_podcastinteractivity_commentssheetimpl-commentssheetimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
    public static final /* data */ class ReplyToComment implements LaunchActionParams {
        public static final int $stable = 0;
        public static final Parcelable.Creator<ReplyToComment> CREATOR = new Creator();
        private final String commentUri;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
        public static final class Creator implements Parcelable.Creator<ReplyToComment> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ReplyToComment createFromParcel(Parcel parcel) {
                return new ReplyToComment(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ReplyToComment[] newArray(int i) {
                return new ReplyToComment[i];
            }
        }

        public ReplyToComment(String str) {
            this.commentUri = str;
        }

        public static /* synthetic */ ReplyToComment copy$default(ReplyToComment replyToComment, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = replyToComment.commentUri;
            }
            return replyToComment.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCommentUri() {
            return this.commentUri;
        }

        public final ReplyToComment copy(String commentUri) {
            return new ReplyToComment(commentUri);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ReplyToComment) && u890.j(this.commentUri, ((ReplyToComment) other).commentUri);
        }

        @Override // com.spotify.podcastinteractivity.commentssheetimpl.page.LaunchActionParams
        public String getCommentUri() {
            return this.commentUri;
        }

        public int hashCode() {
            return this.commentUri.hashCode();
        }

        @Override // com.spotify.podcastinteractivity.commentssheetimpl.page.LaunchActionParams
        public njb0 toDomainLaunchAction() {
            return new ejb0(getCommentUri());
        }

        public String toString() {
            return super.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.commentUri);
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ0\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0017J\u0010\u0010\u001f\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u000fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u001b¨\u0006+"}, d2 = {"Lcom/spotify/podcastinteractivity/commentssheetimpl/page/LaunchActionParams$ShowContextMenu;", "Lcom/spotify/podcastinteractivity/commentssheetimpl/page/LaunchActionParams;", "", "commentUri", "Lcom/spotify/podcastinteractivity/commentssheetimpl/page/ContextMenuAuthor;", "author", "Lp/tv80;", "interactionLoggingResult", "<init>", "(Ljava/lang/String;Lcom/spotify/podcastinteractivity/commentssheetimpl/page/ContextMenuAuthor;Lp/tv80;)V", "Lp/njb0;", "toDomainLaunchAction", "()Lp/njb0;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/rih1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/spotify/podcastinteractivity/commentssheetimpl/page/ContextMenuAuthor;", "component3", "()Lp/tv80;", "copy", "(Ljava/lang/String;Lcom/spotify/podcastinteractivity/commentssheetimpl/page/ContextMenuAuthor;Lp/tv80;)Lcom/spotify/podcastinteractivity/commentssheetimpl/page/LaunchActionParams$ShowContextMenu;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCommentUri", "Lcom/spotify/podcastinteractivity/commentssheetimpl/page/ContextMenuAuthor;", "getAuthor", "Lp/tv80;", "getInteractionLoggingResult", "src_main_java_com_spotify_podcastinteractivity_commentssheetimpl-commentssheetimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
    public static final /* data */ class ShowContextMenu implements LaunchActionParams {
        public static final int $stable = 8;
        public static final Parcelable.Creator<ShowContextMenu> CREATOR = new Creator();
        private final ContextMenuAuthor author;
        private final String commentUri;
        private final tv80 interactionLoggingResult;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
        public static final class Creator implements Parcelable.Creator<ShowContextMenu> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShowContextMenu createFromParcel(Parcel parcel) {
                return new ShowContextMenu(parcel.readString(), (ContextMenuAuthor) parcel.readParcelable(ShowContextMenu.class.getClassLoader()), parcel.readParcelable(ShowContextMenu.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShowContextMenu[] newArray(int i) {
                return new ShowContextMenu[i];
            }
        }

        public ShowContextMenu(String str, ContextMenuAuthor contextMenuAuthor, tv80 tv80Var) {
            this.commentUri = str;
            this.author = contextMenuAuthor;
            this.interactionLoggingResult = tv80Var;
        }

        public static /* synthetic */ ShowContextMenu copy$default(ShowContextMenu showContextMenu, String str, ContextMenuAuthor contextMenuAuthor, tv80 tv80Var, int i, Object obj) {
            if ((i & 1) != 0) {
                str = showContextMenu.commentUri;
            }
            if ((i & 2) != 0) {
                contextMenuAuthor = showContextMenu.author;
            }
            if ((i & 4) != 0) {
                tv80Var = showContextMenu.interactionLoggingResult;
            }
            return showContextMenu.copy(str, contextMenuAuthor, tv80Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCommentUri() {
            return this.commentUri;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ContextMenuAuthor getAuthor() {
            return this.author;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final tv80 getInteractionLoggingResult() {
            return this.interactionLoggingResult;
        }

        public final ShowContextMenu copy(String commentUri, ContextMenuAuthor author, tv80 interactionLoggingResult) {
            return new ShowContextMenu(commentUri, author, interactionLoggingResult);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowContextMenu)) {
                return false;
            }
            ShowContextMenu showContextMenu = (ShowContextMenu) other;
            return u890.j(this.commentUri, showContextMenu.commentUri) && u890.j(this.author, showContextMenu.author) && u890.j(this.interactionLoggingResult, showContextMenu.interactionLoggingResult);
        }

        public final ContextMenuAuthor getAuthor() {
            return this.author;
        }

        @Override // com.spotify.podcastinteractivity.commentssheetimpl.page.LaunchActionParams
        public String getCommentUri() {
            return this.commentUri;
        }

        public final tv80 getInteractionLoggingResult() {
            return this.interactionLoggingResult;
        }

        public int hashCode() {
            int iHashCode = (this.author.hashCode() + (this.commentUri.hashCode() * 31)) * 31;
            tv80 tv80Var = this.interactionLoggingResult;
            return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
        }

        @Override // com.spotify.podcastinteractivity.commentssheetimpl.page.LaunchActionParams
        public njb0 toDomainLaunchAction() {
            return new fjb0(getCommentUri(), this.author.toCommentMenuBuilderAuthor(), this.interactionLoggingResult);
        }

        public String toString() {
            return super.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.commentUri);
            dest.writeParcelable(this.author, flags);
            dest.writeParcelable(this.interactionLoggingResult, flags);
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0013\u0010\tJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/spotify/podcastinteractivity/commentssheetimpl/page/LaunchActionParams$ShowKeyboard;", "Lcom/spotify/podcastinteractivity/commentssheetimpl/page/LaunchActionParams;", "<init>", "()V", "Lp/njb0;", "toDomainLaunchAction", "()Lp/njb0;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/rih1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "src_main_java_com_spotify_podcastinteractivity_commentssheetimpl-commentssheetimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
    public static final /* data */ class ShowKeyboard implements LaunchActionParams {
        public static final int $stable = 0;
        public static final ShowKeyboard INSTANCE = new ShowKeyboard();
        public static final Parcelable.Creator<ShowKeyboard> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
        public static final class Creator implements Parcelable.Creator<ShowKeyboard> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShowKeyboard createFromParcel(Parcel parcel) {
                parcel.readInt();
                return ShowKeyboard.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShowKeyboard[] newArray(int i) {
                return new ShowKeyboard[i];
            }
        }

        private ShowKeyboard() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ShowKeyboard);
        }

        public int hashCode() {
            return 1994985549;
        }

        @Override // com.spotify.podcastinteractivity.commentssheetimpl.page.LaunchActionParams
        public njb0 toDomainLaunchAction() {
            return gjb0.a;
        }

        public String toString() {
            return "ShowKeyboard";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0013J\u0010\u0010\u0017\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000bJ\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/spotify/podcastinteractivity/commentssheetimpl/page/LaunchActionParams$ShowSingleCommentThread;", "Lcom/spotify/podcastinteractivity/commentssheetimpl/page/LaunchActionParams;", "", "commentUri", "<init>", "(Ljava/lang/String;)V", "Lp/njb0;", "toDomainLaunchAction", "()Lp/njb0;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/rih1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/spotify/podcastinteractivity/commentssheetimpl/page/LaunchActionParams$ShowSingleCommentThread;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCommentUri", "src_main_java_com_spotify_podcastinteractivity_commentssheetimpl-commentssheetimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
    public static final /* data */ class ShowSingleCommentThread implements LaunchActionParams {
        public static final int $stable = 0;
        public static final Parcelable.Creator<ShowSingleCommentThread> CREATOR = new Creator();
        private final String commentUri;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
        public static final class Creator implements Parcelable.Creator<ShowSingleCommentThread> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShowSingleCommentThread createFromParcel(Parcel parcel) {
                return new ShowSingleCommentThread(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShowSingleCommentThread[] newArray(int i) {
                return new ShowSingleCommentThread[i];
            }
        }

        public ShowSingleCommentThread(String str) {
            this.commentUri = str;
        }

        public static /* synthetic */ ShowSingleCommentThread copy$default(ShowSingleCommentThread showSingleCommentThread, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = showSingleCommentThread.commentUri;
            }
            return showSingleCommentThread.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCommentUri() {
            return this.commentUri;
        }

        public final ShowSingleCommentThread copy(String commentUri) {
            return new ShowSingleCommentThread(commentUri);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowSingleCommentThread) && u890.j(this.commentUri, ((ShowSingleCommentThread) other).commentUri);
        }

        @Override // com.spotify.podcastinteractivity.commentssheetimpl.page.LaunchActionParams
        public String getCommentUri() {
            return this.commentUri;
        }

        public int hashCode() {
            return this.commentUri.hashCode();
        }

        @Override // com.spotify.podcastinteractivity.commentssheetimpl.page.LaunchActionParams
        public njb0 toDomainLaunchAction() {
            return new hjb0(getCommentUri());
        }

        public String toString() {
            return super.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.commentUri);
        }
    }

    default String getCommentUri() {
        return null;
    }

    njb0 toDomainLaunchAction();
}
