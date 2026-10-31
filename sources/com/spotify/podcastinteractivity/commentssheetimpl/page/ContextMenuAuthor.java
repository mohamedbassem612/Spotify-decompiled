package com.spotify.podcastinteractivity.commentssheetimpl.page;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.playlist4.proto.PlaylistSyncReasonProto;
import kotlin.Metadata;
import p.cy30;
import p.u890;
import p.wgh;
import p.xgh;
import p.ygh;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\t\nJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\u000b\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lcom/spotify/podcastinteractivity/commentssheetimpl/page/ContextMenuAuthor;", "Landroid/os/Parcelable;", "Lp/ygh;", "toCommentMenuBuilderAuthor", "()Lp/ygh;", "", "getDisplayName", "()Ljava/lang/String;", "displayName", "User", "Show", "Lcom/spotify/podcastinteractivity/commentssheetimpl/page/ContextMenuAuthor$Show;", "Lcom/spotify/podcastinteractivity/commentssheetimpl/page/ContextMenuAuthor$User;", "src_main_java_com_spotify_podcastinteractivity_commentssheetimpl-commentssheetimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
public interface ContextMenuAuthor extends Parcelable {

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J$\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0014J\u0010\u0010\u0019\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0019\u0010\fJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\u0014R\u0014\u0010#\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0014¨\u0006$"}, d2 = {"Lcom/spotify/podcastinteractivity/commentssheetimpl/page/ContextMenuAuthor$Show;", "Lcom/spotify/podcastinteractivity/commentssheetimpl/page/ContextMenuAuthor;", "", "showName", "imageUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Lp/ygh;", "toCommentMenuBuilderAuthor", "()Lp/ygh;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/rih1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/spotify/podcastinteractivity/commentssheetimpl/page/ContextMenuAuthor$Show;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getShowName", "getImageUri", "getDisplayName", "displayName", "src_main_java_com_spotify_podcastinteractivity_commentssheetimpl-commentssheetimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
    public static final /* data */ class Show implements ContextMenuAuthor {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Show> CREATOR = new Creator();
        private final String imageUri;
        private final String showName;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
        public static final class Creator implements Parcelable.Creator<Show> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Show createFromParcel(Parcel parcel) {
                return new Show(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Show[] newArray(int i) {
                return new Show[i];
            }
        }

        public Show(String str, String str2) {
            this.showName = str;
            this.imageUri = str2;
        }

        public static /* synthetic */ Show copy$default(Show show, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = show.showName;
            }
            if ((i & 2) != 0) {
                str2 = show.imageUri;
            }
            return show.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getShowName() {
            return this.showName;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getImageUri() {
            return this.imageUri;
        }

        public final Show copy(String showName, String imageUri) {
            return new Show(showName, imageUri);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Show)) {
                return false;
            }
            Show show = (Show) other;
            return u890.j(this.showName, show.showName) && u890.j(this.imageUri, show.imageUri);
        }

        @Override // com.spotify.podcastinteractivity.commentssheetimpl.page.ContextMenuAuthor
        public String getDisplayName() {
            return this.showName;
        }

        public final String getImageUri() {
            return this.imageUri;
        }

        public final String getShowName() {
            return this.showName;
        }

        public int hashCode() {
            return this.imageUri.hashCode() + (this.showName.hashCode() * 31);
        }

        @Override // com.spotify.podcastinteractivity.commentssheetimpl.page.ContextMenuAuthor
        public ygh toCommentMenuBuilderAuthor() {
            return new wgh(this.imageUri, this.showName);
        }

        public String toString() {
            return super.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.showName);
            dest.writeString(this.imageUri);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J.\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0015J\u0010\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\rJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b$\u0010\u0015¨\u0006%"}, d2 = {"Lcom/spotify/podcastinteractivity/commentssheetimpl/page/ContextMenuAuthor$User;", "Lcom/spotify/podcastinteractivity/commentssheetimpl/page/ContextMenuAuthor;", "", "username", "displayName", "imageUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lp/ygh;", "toCommentMenuBuilderAuthor", "()Lp/ygh;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/rih1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/spotify/podcastinteractivity/commentssheetimpl/page/ContextMenuAuthor$User;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUsername", "getDisplayName", "getImageUri", "src_main_java_com_spotify_podcastinteractivity_commentssheetimpl-commentssheetimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
    public static final /* data */ class User implements ContextMenuAuthor {
        public static final int $stable = 0;
        public static final Parcelable.Creator<User> CREATOR = new Creator();
        private final String displayName;
        private final String imageUri;
        private final String username;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
        public static final class Creator implements Parcelable.Creator<User> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final User createFromParcel(Parcel parcel) {
                return new User(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final User[] newArray(int i) {
                return new User[i];
            }
        }

        public User(String str, String str2, String str3) {
            this.username = str;
            this.displayName = str2;
            this.imageUri = str3;
        }

        public static /* synthetic */ User copy$default(User user, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = user.username;
            }
            if ((i & 2) != 0) {
                str2 = user.displayName;
            }
            if ((i & 4) != 0) {
                str3 = user.imageUri;
            }
            return user.copy(str, str2, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUsername() {
            return this.username;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getDisplayName() {
            return this.displayName;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getImageUri() {
            return this.imageUri;
        }

        public final User copy(String username, String displayName, String imageUri) {
            return new User(username, displayName, imageUri);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof User)) {
                return false;
            }
            User user = (User) other;
            return u890.j(this.username, user.username) && u890.j(this.displayName, user.displayName) && u890.j(this.imageUri, user.imageUri);
        }

        @Override // com.spotify.podcastinteractivity.commentssheetimpl.page.ContextMenuAuthor
        public String getDisplayName() {
            return this.displayName;
        }

        public final String getImageUri() {
            return this.imageUri;
        }

        public final String getUsername() {
            return this.username;
        }

        public int hashCode() {
            return this.imageUri.hashCode() + cy30.d(this.username.hashCode() * 31, 31, this.displayName);
        }

        @Override // com.spotify.podcastinteractivity.commentssheetimpl.page.ContextMenuAuthor
        public ygh toCommentMenuBuilderAuthor() {
            return new xgh(this.username, getDisplayName(), this.imageUri);
        }

        public String toString() {
            return super.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.username);
            dest.writeString(this.displayName);
            dest.writeString(this.imageUri);
        }
    }

    String getDisplayName();

    ygh toCommentMenuBuilderAuthor();
}
