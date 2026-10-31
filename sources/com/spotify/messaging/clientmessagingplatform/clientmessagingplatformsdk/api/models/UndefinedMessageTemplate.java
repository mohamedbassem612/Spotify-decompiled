package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.dm5;
import p.hab0;
import p.nma0;
import p.o661;
import p.pfp0;
import p.znb0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\r¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/UndefinedMessageTemplate;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageTemplate;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/rih1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lp/nma0;", "serializer", "()Lp/nma0;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
@o661
public final class UndefinedMessageTemplate implements MessageTemplate {
    public static final int $stable = 0;
    public static final UndefinedMessageTemplate INSTANCE = new UndefinedMessageTemplate();
    public static final Parcelable.Creator<UndefinedMessageTemplate> CREATOR = new Creator();
    private static final /* synthetic */ znb0 $cachedSerializer$delegate = dm5.S(2, AnonymousClass1.INSTANCE);

    /* JADX INFO: renamed from: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.UndefinedMessageTemplate$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    public static final class AnonymousClass1 extends hab0 implements Function0 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final nma0 invoke() {
            return new pfp0("com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.UndefinedMessageTemplate", UndefinedMessageTemplate.INSTANCE, new Annotation[0]);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    public static final class Creator implements Parcelable.Creator<UndefinedMessageTemplate> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UndefinedMessageTemplate createFromParcel(Parcel parcel) {
            parcel.readInt();
            return UndefinedMessageTemplate.INSTANCE;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UndefinedMessageTemplate[] newArray(int i) {
            return new UndefinedMessageTemplate[i];
        }
    }

    private UndefinedMessageTemplate() {
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
