package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.h661;
import p.o661;
import p.o6p1;
import p.p661;
import p.u890;
import p.z1k;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ$\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001dJ\u0010\u0010\"\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\"\u0010\u0016J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u001d¨\u0006-"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Text;", "Landroid/os/Parcelable;", "", "text", "textColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lp/p661;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Text;Lp/z1k;Lp/h661;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Text;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "getTextColor", "Companion", "$serializer", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
@o661
public final /* data */ class Text implements Parcelable {
    public static final int $stable = 0;
    private final String text;
    private final String textColor;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final Parcelable.Creator<Text> CREATOR = new Creator();

    public /* synthetic */ Text(int i, String str, String str2, p661 p661Var) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, Text$.serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.text = str;
        this.textColor = str2;
    }

    public static /* synthetic */ Text copy$default(Text text, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = text.text;
        }
        if ((i & 2) != 0) {
            str2 = text.textColor;
        }
        return text.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk(Text self, z1k output, h661 serialDesc) {
        output.G(serialDesc, 0, self.text);
        output.G(serialDesc, 1, self.textColor);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    public final Text copy(String text, String textColor) {
        return new Text(text, textColor);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Text)) {
            return false;
        }
        Text text = (Text) other;
        return u890.j(this.text, text.text) && u890.j(this.textColor, text.textColor);
    }

    public final String getText() {
        return this.text;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        return this.textColor.hashCode() + (this.text.hashCode() * 31);
    }

    public String toString() {
        return super.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.text);
        dest.writeString(this.textColor);
    }

    public Text(String str, String str2) {
        this.text = str;
        this.textColor = str2;
    }
}
