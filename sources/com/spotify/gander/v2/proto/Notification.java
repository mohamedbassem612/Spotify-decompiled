package com.spotify.gander.v2.proto;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.ejo0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class Notification extends h implements v2j0 {
    public static final int ACTION_FIELD_NUMBER = 4;
    public static final int CREATED_TIMESTAMP_FIELD_NUMBER = 2;
    private static final Notification DEFAULT_INSTANCE;
    public static final int ENTITY_IMAGE_FIELD_NUMBER = 6;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int IS_NEW_FIELD_NUMBER = 8;
    public static final int MESSAGING_METADATA_FIELD_NUMBER = 10;
    public static final int MULTI_USER_IMAGE_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int STORAGE_ID_FIELD_NUMBER = 9;
    public static final int TITLE_FIELD_NUMBER = 3;
    public static final int USER_AND_ENTITY_IMAGE_FIELD_NUMBER = 7;
    private NotificationAction action_;
    private int bitField0_;
    private Timestamp createdTimestamp_;
    private Object image_;
    private boolean isNew_;
    private MessagingMetadata messagingMetadata_;
    private int imageCase_ = 0;
    private String id_ = "";
    private String title_ = "";
    private String storageId_ = "";

    static {
        Notification notification = new Notification();
        DEFAULT_INSTANCE = notification;
        h.registerDefaultInstance(Notification.class, notification);
    }

    private Notification() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static ejo0 x() {
        return (ejo0) DEFAULT_INSTANCE.createBuilder();
    }

    public final void A(EntityImage entityImage) {
        entityImage.getClass();
        this.image_ = entityImage;
        this.imageCase_ = 6;
    }

    public final void B(String str) {
        this.id_ = str;
    }

    public final void C(MessagingMetadata messagingMetadata) {
        messagingMetadata.getClass();
        this.messagingMetadata_ = messagingMetadata;
        this.bitField0_ |= 4;
    }

    public final void D(MultiUserImage multiUserImage) {
        multiUserImage.getClass();
        this.image_ = multiUserImage;
        this.imageCase_ = 5;
    }

    public final void E(String str) {
        this.storageId_ = str;
    }

    public final void F(String str) {
        this.title_ = str;
    }

    public final void G(UserAndEntityImage userAndEntityImage) {
        userAndEntityImage.getClass();
        this.image_ = userAndEntityImage;
        this.imageCase_ = 7;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0001\u0001\u0001\n\n\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ\u0004ဉ\u0001\u0005<\u0000\u0006<\u0000\u0007<\u0000\b\u0007\tȈ\nဉ\u0002", new Object[]{"image_", "imageCase_", "bitField0_", "id_", "createdTimestamp_", "title_", "action_", MultiUserImage.class, EntityImage.class, UserAndEntityImage.class, "isNew_", "storageId_", "messagingMetadata_"});
        }
        if (iOrdinal == 3) {
            return new Notification();
        }
        if (iOrdinal == 4) {
            return new ejo0(DEFAULT_INSTANCE);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        qzr0 qzr0Var = PARSER;
        if (qzr0Var != null) {
            return qzr0Var;
        }
        synchronized (Notification.class) {
            try {
                bf40Var = PARSER;
                if (bf40Var == null) {
                    bf40Var = new bf40(DEFAULT_INSTANCE);
                    PARSER = bf40Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bf40Var;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getId() {
        return this.id_;
    }

    public final boolean getIsNew() {
        return this.isNew_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final NotificationAction n() {
        NotificationAction notificationAction = this.action_;
        return notificationAction == null ? NotificationAction.n() : notificationAction;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Timestamp o() {
        Timestamp timestamp = this.createdTimestamp_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    public final EntityImage p() {
        return this.imageCase_ == 6 ? (EntityImage) this.image_ : EntityImage.n();
    }

    public final int q() {
        int i = this.imageCase_;
        if (i == 0) {
            return 4;
        }
        if (i == 5) {
            return 1;
        }
        if (i != 6) {
            return i != 7 ? 0 : 3;
        }
        return 2;
    }

    public final MessagingMetadata r() {
        MessagingMetadata messagingMetadata = this.messagingMetadata_;
        return messagingMetadata == null ? MessagingMetadata.n() : messagingMetadata;
    }

    public final MultiUserImage s() {
        return this.imageCase_ == 5 ? (MultiUserImage) this.image_ : MultiUserImage.o();
    }

    public final void setIsNew(boolean z) {
        this.isNew_ = z;
    }

    public final String t() {
        return this.storageId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final UserAndEntityImage u() {
        return this.imageCase_ == 7 ? (UserAndEntityImage) this.image_ : UserAndEntityImage.n();
    }

    public final boolean v() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean w() {
        return (this.bitField0_ & 1) != 0;
    }

    public final void y(NotificationAction notificationAction) {
        notificationAction.getClass();
        this.action_ = notificationAction;
        this.bitField0_ |= 2;
    }

    public final void z(Timestamp timestamp) {
        timestamp.getClass();
        this.createdTimestamp_ = timestamp;
        this.bitField0_ |= 1;
    }
}
