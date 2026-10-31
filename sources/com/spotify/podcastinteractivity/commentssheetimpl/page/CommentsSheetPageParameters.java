package com.spotify.podcastinteractivity.commentssheetimpl.page;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.playlist4.proto.PlaylistSyncReasonProto;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.cy30;
import p.u890;
import p.v6h;
import p.xcg1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJD\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0016J\u0010\u0010 \u001a\u00020\fHÖ\u0001¢\u0006\u0004\b \u0010\u000eJ\u001a\u0010#\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b*\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010\u001c¨\u0006-"}, d2 = {"Lcom/spotify/podcastinteractivity/commentssheetimpl/page/CommentsSheetPageParameters;", "Landroid/os/Parcelable;", "", "viewUri", "entityUri", "", "disableInput", "showSensitiveComments", "Lcom/spotify/podcastinteractivity/commentssheetimpl/page/LaunchActionParams;", "launchAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLcom/spotify/podcastinteractivity/commentssheetimpl/page/LaunchActionParams;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/rih1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "component5", "()Lcom/spotify/podcastinteractivity/commentssheetimpl/page/LaunchActionParams;", "copy", "(Ljava/lang/String;Ljava/lang/String;ZZLcom/spotify/podcastinteractivity/commentssheetimpl/page/LaunchActionParams;)Lcom/spotify/podcastinteractivity/commentssheetimpl/page/CommentsSheetPageParameters;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getViewUri", "getEntityUri", "Z", "getDisableInput", "getShowSensitiveComments", "Lcom/spotify/podcastinteractivity/commentssheetimpl/page/LaunchActionParams;", "getLaunchAction", "src_main_java_com_spotify_podcastinteractivity_commentssheetimpl-commentssheetimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
public final /* data */ class CommentsSheetPageParameters implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<CommentsSheetPageParameters> CREATOR = new v6h((byte) 6);
    private final boolean disableInput;
    private final String entityUri;
    private final LaunchActionParams launchAction;
    private final boolean showSensitiveComments;
    private final String viewUri;

    public /* synthetic */ CommentsSheetPageParameters(String str, String str2, boolean z, boolean z2, LaunchActionParams launchActionParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : launchActionParams);
    }

    public static /* synthetic */ CommentsSheetPageParameters copy$default(CommentsSheetPageParameters commentsSheetPageParameters, String str, String str2, boolean z, boolean z2, LaunchActionParams launchActionParams, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commentsSheetPageParameters.viewUri;
        }
        if ((i & 2) != 0) {
            str2 = commentsSheetPageParameters.entityUri;
        }
        if ((i & 4) != 0) {
            z = commentsSheetPageParameters.disableInput;
        }
        if ((i & 8) != 0) {
            z2 = commentsSheetPageParameters.showSensitiveComments;
        }
        if ((i & 16) != 0) {
            launchActionParams = commentsSheetPageParameters.launchAction;
        }
        LaunchActionParams launchActionParams2 = launchActionParams;
        boolean z3 = z;
        return commentsSheetPageParameters.copy(str, str2, z3, z2, launchActionParams2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getViewUri() {
        return this.viewUri;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEntityUri() {
        return this.entityUri;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getDisableInput() {
        return this.disableInput;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getShowSensitiveComments() {
        return this.showSensitiveComments;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final LaunchActionParams getLaunchAction() {
        return this.launchAction;
    }

    public final CommentsSheetPageParameters copy(String viewUri, String entityUri, boolean disableInput, boolean showSensitiveComments, LaunchActionParams launchAction) {
        return new CommentsSheetPageParameters(viewUri, entityUri, disableInput, showSensitiveComments, launchAction);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommentsSheetPageParameters)) {
            return false;
        }
        CommentsSheetPageParameters commentsSheetPageParameters = (CommentsSheetPageParameters) other;
        return u890.j(this.viewUri, commentsSheetPageParameters.viewUri) && u890.j(this.entityUri, commentsSheetPageParameters.entityUri) && this.disableInput == commentsSheetPageParameters.disableInput && this.showSensitiveComments == commentsSheetPageParameters.showSensitiveComments && u890.j(this.launchAction, commentsSheetPageParameters.launchAction);
    }

    public final boolean getDisableInput() {
        return this.disableInput;
    }

    public final String getEntityUri() {
        return this.entityUri;
    }

    public final LaunchActionParams getLaunchAction() {
        return this.launchAction;
    }

    public final boolean getShowSensitiveComments() {
        return this.showSensitiveComments;
    }

    public final String getViewUri() {
        return this.viewUri;
    }

    public int hashCode() {
        int iG = xcg1.g(xcg1.g(cy30.d(this.viewUri.hashCode() * 31, 31, this.entityUri), 31, this.disableInput), 31, this.showSensitiveComments);
        LaunchActionParams launchActionParams = this.launchAction;
        return iG + (launchActionParams == null ? 0 : launchActionParams.hashCode());
    }

    public String toString() {
        return super.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.viewUri);
        dest.writeString(this.entityUri);
        dest.writeInt(this.disableInput ? 1 : 0);
        dest.writeInt(this.showSensitiveComments ? 1 : 0);
        dest.writeParcelable(this.launchAction, flags);
    }

    public CommentsSheetPageParameters(String str, String str2, boolean z, boolean z2, LaunchActionParams launchActionParams) {
        this.viewUri = str;
        this.entityUri = str2;
        this.disableInput = z;
        this.showSensitiveComments = z2;
        this.launchAction = launchActionParams;
    }
}
