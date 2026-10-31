package com.spotify.campfire.datasource.impl.proto;

import com.google.protobuf.g;
import com.google.protobuf.h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p.bf40;
import p.jf40;
import p.lwg;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.r8;
import p.s2j0;
import p.s8;
import p.uz00;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ChatEventType extends h implements ChatEventTypeOrBuilder {
    public static final int CREATE_EVENT_FIELD_NUMBER = 1;
    private static final ChatEventType DEFAULT_INSTANCE;
    public static final int INVITE_LINK_FIELD_NUMBER = 9;
    public static final int JOIN_EVENT_FIELD_NUMBER = 3;
    public static final int LEAVE_EVENT_FIELD_NUMBER = 4;
    public static final int NAME_CHANGE_FIELD_NUMBER = 5;
    public static final int NEW_ADMIN_EVENT_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int PHOTO_CHANGE_FIELD_NUMBER = 7;
    public static final int REMOVE_USER_FIELD_NUMBER = 8;
    public static final int REPORT_CHAT_EVENT_FIELD_NUMBER = 10;
    public static final int USER_INVITE_FIELD_NUMBER = 2;
    private int cetCase_ = 0;
    private Object cet_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.ChatEventType$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[jf40.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        ChatEventType chatEventType = new ChatEventType();
        DEFAULT_INSTANCE = chatEventType;
        h.registerDefaultInstance(ChatEventType.class, chatEventType);
    }

    private ChatEventType() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCet() {
        this.cetCase_ = 0;
        this.cet_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreateEvent() {
        if (this.cetCase_ == 1) {
            this.cetCase_ = 0;
            this.cet_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInviteLink() {
        if (this.cetCase_ == 9) {
            this.cetCase_ = 0;
            this.cet_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJoinEvent() {
        if (this.cetCase_ == 3) {
            this.cetCase_ = 0;
            this.cet_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLeaveEvent() {
        if (this.cetCase_ == 4) {
            this.cetCase_ = 0;
            this.cet_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNameChange() {
        if (this.cetCase_ == 5) {
            this.cetCase_ = 0;
            this.cet_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNewAdminEvent() {
        if (this.cetCase_ == 6) {
            this.cetCase_ = 0;
            this.cet_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPhotoChange() {
        if (this.cetCase_ == 7) {
            this.cetCase_ = 0;
            this.cet_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRemoveUser() {
        if (this.cetCase_ == 8) {
            this.cetCase_ = 0;
            this.cet_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportChatEvent() {
        if (this.cetCase_ == 10) {
            this.cetCase_ = 0;
            this.cet_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserInvite() {
        if (this.cetCase_ == 2) {
            this.cetCase_ = 0;
            this.cet_ = null;
        }
    }

    public static ChatEventType getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCreateEvent(CreateEvent createEvent) {
        createEvent.getClass();
        if (this.cetCase_ != 1 || this.cet_ == CreateEvent.getDefaultInstance()) {
            this.cet_ = createEvent;
        } else {
            this.cet_ = ((CreateEvent.Builder) CreateEvent.newBuilder((CreateEvent) this.cet_).mergeFrom(createEvent)).buildPartial();
        }
        this.cetCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInviteLink(InviteLinkEvent inviteLinkEvent) {
        inviteLinkEvent.getClass();
        if (this.cetCase_ != 9 || this.cet_ == InviteLinkEvent.getDefaultInstance()) {
            this.cet_ = inviteLinkEvent;
        } else {
            this.cet_ = ((InviteLinkEvent.Builder) InviteLinkEvent.newBuilder((InviteLinkEvent) this.cet_).mergeFrom(inviteLinkEvent)).buildPartial();
        }
        this.cetCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeJoinEvent(JoinEvent joinEvent) {
        joinEvent.getClass();
        if (this.cetCase_ != 3 || this.cet_ == JoinEvent.getDefaultInstance()) {
            this.cet_ = joinEvent;
        } else {
            this.cet_ = ((JoinEvent.Builder) JoinEvent.newBuilder((JoinEvent) this.cet_).mergeFrom(joinEvent)).buildPartial();
        }
        this.cetCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLeaveEvent(LeaveEvent leaveEvent) {
        leaveEvent.getClass();
        if (this.cetCase_ != 4 || this.cet_ == LeaveEvent.getDefaultInstance()) {
            this.cet_ = leaveEvent;
        } else {
            this.cet_ = ((LeaveEvent.Builder) LeaveEvent.newBuilder((LeaveEvent) this.cet_).mergeFrom(leaveEvent)).buildPartial();
        }
        this.cetCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNameChange(NameChangeEvent nameChangeEvent) {
        nameChangeEvent.getClass();
        if (this.cetCase_ != 5 || this.cet_ == NameChangeEvent.getDefaultInstance()) {
            this.cet_ = nameChangeEvent;
        } else {
            this.cet_ = ((NameChangeEvent.Builder) NameChangeEvent.newBuilder((NameChangeEvent) this.cet_).mergeFrom(nameChangeEvent)).buildPartial();
        }
        this.cetCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNewAdminEvent(NewAdminEvent newAdminEvent) {
        newAdminEvent.getClass();
        if (this.cetCase_ != 6 || this.cet_ == NewAdminEvent.getDefaultInstance()) {
            this.cet_ = newAdminEvent;
        } else {
            this.cet_ = ((NewAdminEvent.Builder) NewAdminEvent.newBuilder((NewAdminEvent) this.cet_).mergeFrom(newAdminEvent)).buildPartial();
        }
        this.cetCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePhotoChange(PhotoChangeEvent photoChangeEvent) {
        photoChangeEvent.getClass();
        if (this.cetCase_ != 7 || this.cet_ == PhotoChangeEvent.getDefaultInstance()) {
            this.cet_ = photoChangeEvent;
        } else {
            this.cet_ = ((PhotoChangeEvent.Builder) PhotoChangeEvent.newBuilder((PhotoChangeEvent) this.cet_).mergeFrom(photoChangeEvent)).buildPartial();
        }
        this.cetCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRemoveUser(RemoveUserEvent removeUserEvent) {
        removeUserEvent.getClass();
        if (this.cetCase_ != 8 || this.cet_ == RemoveUserEvent.getDefaultInstance()) {
            this.cet_ = removeUserEvent;
        } else {
            this.cet_ = ((RemoveUserEvent.Builder) RemoveUserEvent.newBuilder((RemoveUserEvent) this.cet_).mergeFrom(removeUserEvent)).buildPartial();
        }
        this.cetCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReportChatEvent(ReportChatEvent reportChatEvent) {
        reportChatEvent.getClass();
        if (this.cetCase_ != 10 || this.cet_ == ReportChatEvent.getDefaultInstance()) {
            this.cet_ = reportChatEvent;
        } else {
            this.cet_ = ((ReportChatEvent.Builder) ReportChatEvent.newBuilder((ReportChatEvent) this.cet_).mergeFrom(reportChatEvent)).buildPartial();
        }
        this.cetCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserInvite(InviteEvent inviteEvent) {
        inviteEvent.getClass();
        if (this.cetCase_ != 2 || this.cet_ == InviteEvent.getDefaultInstance()) {
            this.cet_ = inviteEvent;
        } else {
            this.cet_ = ((InviteEvent.Builder) InviteEvent.newBuilder((InviteEvent) this.cet_).mergeFrom(inviteEvent)).buildPartial();
        }
        this.cetCase_ = 2;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ChatEventType parseDelimitedFrom(InputStream inputStream) {
        return (ChatEventType) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ChatEventType parseFrom(ByteBuffer byteBuffer) {
        return (ChatEventType) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreateEvent(CreateEvent createEvent) {
        createEvent.getClass();
        this.cet_ = createEvent;
        this.cetCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInviteLink(InviteLinkEvent inviteLinkEvent) {
        inviteLinkEvent.getClass();
        this.cet_ = inviteLinkEvent;
        this.cetCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJoinEvent(JoinEvent joinEvent) {
        joinEvent.getClass();
        this.cet_ = joinEvent;
        this.cetCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLeaveEvent(LeaveEvent leaveEvent) {
        leaveEvent.getClass();
        this.cet_ = leaveEvent;
        this.cetCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameChange(NameChangeEvent nameChangeEvent) {
        nameChangeEvent.getClass();
        this.cet_ = nameChangeEvent;
        this.cetCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewAdminEvent(NewAdminEvent newAdminEvent) {
        newAdminEvent.getClass();
        this.cet_ = newAdminEvent;
        this.cetCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhotoChange(PhotoChangeEvent photoChangeEvent) {
        photoChangeEvent.getClass();
        this.cet_ = photoChangeEvent;
        this.cetCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemoveUser(RemoveUserEvent removeUserEvent) {
        removeUserEvent.getClass();
        this.cet_ = removeUserEvent;
        this.cetCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportChatEvent(ReportChatEvent reportChatEvent) {
        reportChatEvent.getClass();
        this.cet_ = reportChatEvent;
        this.cetCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserInvite(InviteEvent inviteEvent) {
        inviteEvent.getClass();
        this.cet_ = inviteEvent;
        this.cetCase_ = 2;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0001\u0000\u0001\n\n\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000", new Object[]{"cet_", "cetCase_", CreateEvent.class, InviteEvent.class, JoinEvent.class, LeaveEvent.class, NameChangeEvent.class, NewAdminEvent.class, PhotoChangeEvent.class, RemoveUserEvent.class, InviteLinkEvent.class, ReportChatEvent.class});
        }
        if (iOrdinal == 3) {
            return new ChatEventType();
        }
        if (iOrdinal == 4) {
            return new Builder(0);
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
        synchronized (ChatEventType.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
    public CetCase getCetCase() {
        return CetCase.forNumber(this.cetCase_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
    public CreateEvent getCreateEvent() {
        return this.cetCase_ == 1 ? (CreateEvent) this.cet_ : CreateEvent.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
    public InviteLinkEvent getInviteLink() {
        return this.cetCase_ == 9 ? (InviteLinkEvent) this.cet_ : InviteLinkEvent.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
    public JoinEvent getJoinEvent() {
        return this.cetCase_ == 3 ? (JoinEvent) this.cet_ : JoinEvent.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
    public LeaveEvent getLeaveEvent() {
        return this.cetCase_ == 4 ? (LeaveEvent) this.cet_ : LeaveEvent.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
    public NameChangeEvent getNameChange() {
        return this.cetCase_ == 5 ? (NameChangeEvent) this.cet_ : NameChangeEvent.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
    public NewAdminEvent getNewAdminEvent() {
        return this.cetCase_ == 6 ? (NewAdminEvent) this.cet_ : NewAdminEvent.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
    public PhotoChangeEvent getPhotoChange() {
        return this.cetCase_ == 7 ? (PhotoChangeEvent) this.cet_ : PhotoChangeEvent.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
    public RemoveUserEvent getRemoveUser() {
        return this.cetCase_ == 8 ? (RemoveUserEvent) this.cet_ : RemoveUserEvent.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
    public ReportChatEvent getReportChatEvent() {
        return this.cetCase_ == 10 ? (ReportChatEvent) this.cet_ : ReportChatEvent.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
    public InviteEvent getUserInvite() {
        return this.cetCase_ == 2 ? (InviteEvent) this.cet_ : InviteEvent.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
    public boolean hasCreateEvent() {
        return this.cetCase_ == 1;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
    public boolean hasInviteLink() {
        return this.cetCase_ == 9;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
    public boolean hasJoinEvent() {
        return this.cetCase_ == 3;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
    public boolean hasLeaveEvent() {
        return this.cetCase_ == 4;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
    public boolean hasNameChange() {
        return this.cetCase_ == 5;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
    public boolean hasNewAdminEvent() {
        return this.cetCase_ == 6;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
    public boolean hasPhotoChange() {
        return this.cetCase_ == 7;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
    public boolean hasRemoveUser() {
        return this.cetCase_ == 8;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
    public boolean hasReportChatEvent() {
        return this.cetCase_ == 10;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
    public boolean hasUserInvite() {
        return this.cetCase_ == 2;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements ChatEventTypeOrBuilder {
        private Builder() {
            super(ChatEventType.DEFAULT_INSTANCE);
        }

        public /* bridge */ /* synthetic */ s2j0 build() {
            return build();
        }

        public /* bridge */ /* synthetic */ s2j0 buildPartial() {
            return super.buildPartial();
        }

        public /* bridge */ /* synthetic */ r2j0 clear() {
            return clear();
        }

        public Builder clearCet() {
            copyOnWrite();
            ((ChatEventType) ((g) this).instance).clearCet();
            return this;
        }

        public Builder clearCreateEvent() {
            copyOnWrite();
            ((ChatEventType) ((g) this).instance).clearCreateEvent();
            return this;
        }

        public Builder clearInviteLink() {
            copyOnWrite();
            ((ChatEventType) ((g) this).instance).clearInviteLink();
            return this;
        }

        public Builder clearJoinEvent() {
            copyOnWrite();
            ((ChatEventType) ((g) this).instance).clearJoinEvent();
            return this;
        }

        public Builder clearLeaveEvent() {
            copyOnWrite();
            ((ChatEventType) ((g) this).instance).clearLeaveEvent();
            return this;
        }

        public Builder clearNameChange() {
            copyOnWrite();
            ((ChatEventType) ((g) this).instance).clearNameChange();
            return this;
        }

        public Builder clearNewAdminEvent() {
            copyOnWrite();
            ((ChatEventType) ((g) this).instance).clearNewAdminEvent();
            return this;
        }

        public Builder clearPhotoChange() {
            copyOnWrite();
            ((ChatEventType) ((g) this).instance).clearPhotoChange();
            return this;
        }

        public Builder clearRemoveUser() {
            copyOnWrite();
            ((ChatEventType) ((g) this).instance).clearRemoveUser();
            return this;
        }

        public Builder clearReportChatEvent() {
            copyOnWrite();
            ((ChatEventType) ((g) this).instance).clearReportChatEvent();
            return this;
        }

        public Builder clearUserInvite() {
            copyOnWrite();
            ((ChatEventType) ((g) this).instance).clearUserInvite();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
        public CetCase getCetCase() {
            return ((ChatEventType) ((g) this).instance).getCetCase();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
        public CreateEvent getCreateEvent() {
            return ((ChatEventType) ((g) this).instance).getCreateEvent();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
        public InviteLinkEvent getInviteLink() {
            return ((ChatEventType) ((g) this).instance).getInviteLink();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
        public JoinEvent getJoinEvent() {
            return ((ChatEventType) ((g) this).instance).getJoinEvent();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
        public LeaveEvent getLeaveEvent() {
            return ((ChatEventType) ((g) this).instance).getLeaveEvent();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
        public NameChangeEvent getNameChange() {
            return ((ChatEventType) ((g) this).instance).getNameChange();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
        public NewAdminEvent getNewAdminEvent() {
            return ((ChatEventType) ((g) this).instance).getNewAdminEvent();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
        public PhotoChangeEvent getPhotoChange() {
            return ((ChatEventType) ((g) this).instance).getPhotoChange();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
        public RemoveUserEvent getRemoveUser() {
            return ((ChatEventType) ((g) this).instance).getRemoveUser();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
        public ReportChatEvent getReportChatEvent() {
            return ((ChatEventType) ((g) this).instance).getReportChatEvent();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
        public InviteEvent getUserInvite() {
            return ((ChatEventType) ((g) this).instance).getUserInvite();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
        public boolean hasCreateEvent() {
            return ((ChatEventType) ((g) this).instance).hasCreateEvent();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
        public boolean hasInviteLink() {
            return ((ChatEventType) ((g) this).instance).hasInviteLink();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
        public boolean hasJoinEvent() {
            return ((ChatEventType) ((g) this).instance).hasJoinEvent();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
        public boolean hasLeaveEvent() {
            return ((ChatEventType) ((g) this).instance).hasLeaveEvent();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
        public boolean hasNameChange() {
            return ((ChatEventType) ((g) this).instance).hasNameChange();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
        public boolean hasNewAdminEvent() {
            return ((ChatEventType) ((g) this).instance).hasNewAdminEvent();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
        public boolean hasPhotoChange() {
            return ((ChatEventType) ((g) this).instance).hasPhotoChange();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
        public boolean hasRemoveUser() {
            return ((ChatEventType) ((g) this).instance).hasRemoveUser();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
        public boolean hasReportChatEvent() {
            return ((ChatEventType) ((g) this).instance).hasReportChatEvent();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ChatEventTypeOrBuilder
        public boolean hasUserInvite() {
            return ((ChatEventType) ((g) this).instance).hasUserInvite();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        public Builder mergeCreateEvent(CreateEvent createEvent) {
            copyOnWrite();
            ((ChatEventType) ((g) this).instance).mergeCreateEvent(createEvent);
            return this;
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m89mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder mergeInviteLink(InviteLinkEvent inviteLinkEvent) {
            copyOnWrite();
            ((ChatEventType) ((g) this).instance).mergeInviteLink(inviteLinkEvent);
            return this;
        }

        public Builder mergeJoinEvent(JoinEvent joinEvent) {
            copyOnWrite();
            ((ChatEventType) ((g) this).instance).mergeJoinEvent(joinEvent);
            return this;
        }

        public Builder mergeLeaveEvent(LeaveEvent leaveEvent) {
            copyOnWrite();
            ((ChatEventType) ((g) this).instance).mergeLeaveEvent(leaveEvent);
            return this;
        }

        public Builder mergeNameChange(NameChangeEvent nameChangeEvent) {
            copyOnWrite();
            ((ChatEventType) ((g) this).instance).mergeNameChange(nameChangeEvent);
            return this;
        }

        public Builder mergeNewAdminEvent(NewAdminEvent newAdminEvent) {
            copyOnWrite();
            ((ChatEventType) ((g) this).instance).mergeNewAdminEvent(newAdminEvent);
            return this;
        }

        public Builder mergePhotoChange(PhotoChangeEvent photoChangeEvent) {
            copyOnWrite();
            ((ChatEventType) ((g) this).instance).mergePhotoChange(photoChangeEvent);
            return this;
        }

        public Builder mergeRemoveUser(RemoveUserEvent removeUserEvent) {
            copyOnWrite();
            ((ChatEventType) ((g) this).instance).mergeRemoveUser(removeUserEvent);
            return this;
        }

        public Builder mergeReportChatEvent(ReportChatEvent reportChatEvent) {
            copyOnWrite();
            ((ChatEventType) ((g) this).instance).mergeReportChatEvent(reportChatEvent);
            return this;
        }

        public Builder mergeUserInvite(InviteEvent inviteEvent) {
            copyOnWrite();
            ((ChatEventType) ((g) this).instance).mergeUserInvite(inviteEvent);
            return this;
        }

        public Builder setCreateEvent(CreateEvent.Builder builder) {
            copyOnWrite();
            ((ChatEventType) ((g) this).instance).setCreateEvent((CreateEvent) builder.build());
            return this;
        }

        public Builder setInviteLink(InviteLinkEvent.Builder builder) {
            copyOnWrite();
            ((ChatEventType) ((g) this).instance).setInviteLink((InviteLinkEvent) builder.build());
            return this;
        }

        public Builder setJoinEvent(JoinEvent.Builder builder) {
            copyOnWrite();
            ((ChatEventType) ((g) this).instance).setJoinEvent((JoinEvent) builder.build());
            return this;
        }

        public Builder setLeaveEvent(LeaveEvent.Builder builder) {
            copyOnWrite();
            ((ChatEventType) ((g) this).instance).setLeaveEvent((LeaveEvent) builder.build());
            return this;
        }

        public Builder setNameChange(NameChangeEvent.Builder builder) {
            copyOnWrite();
            ((ChatEventType) ((g) this).instance).setNameChange((NameChangeEvent) builder.build());
            return this;
        }

        public Builder setNewAdminEvent(NewAdminEvent.Builder builder) {
            copyOnWrite();
            ((ChatEventType) ((g) this).instance).setNewAdminEvent((NewAdminEvent) builder.build());
            return this;
        }

        public Builder setPhotoChange(PhotoChangeEvent.Builder builder) {
            copyOnWrite();
            ((ChatEventType) ((g) this).instance).setPhotoChange((PhotoChangeEvent) builder.build());
            return this;
        }

        public Builder setRemoveUser(RemoveUserEvent.Builder builder) {
            copyOnWrite();
            ((ChatEventType) ((g) this).instance).setRemoveUser((RemoveUserEvent) builder.build());
            return this;
        }

        public Builder setReportChatEvent(ReportChatEvent.Builder builder) {
            copyOnWrite();
            ((ChatEventType) ((g) this).instance).setReportChatEvent((ReportChatEvent) builder.build());
            return this;
        }

        public Builder setUserInvite(InviteEvent.Builder builder) {
            copyOnWrite();
            ((ChatEventType) ((g) this).instance).setUserInvite((InviteEvent) builder.build());
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m88clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m90mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m87clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m91mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
            return super.mergeFrom(bArr, i, i2, uz00Var);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
            return super/*p.r8*/.mergeFrom(inputStream);
        }

        public /* synthetic */ Builder(int i) {
            this();
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
            return super/*p.r8*/.mergeFrom(phcVar);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
            return super/*p.r8*/.mergeFrom(lwgVar);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
            return super/*p.r8*/.mergeFrom(s2j0Var);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
            return super/*p.r8*/.mergeFrom(bArr);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
            return super.mergeFrom(bArr, i, i2, uz00Var);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(bArr, uz00Var);
        }

        public Builder setCreateEvent(CreateEvent createEvent) {
            copyOnWrite();
            ((ChatEventType) ((g) this).instance).setCreateEvent(createEvent);
            return this;
        }

        public Builder setInviteLink(InviteLinkEvent inviteLinkEvent) {
            copyOnWrite();
            ((ChatEventType) ((g) this).instance).setInviteLink(inviteLinkEvent);
            return this;
        }

        public Builder setJoinEvent(JoinEvent joinEvent) {
            copyOnWrite();
            ((ChatEventType) ((g) this).instance).setJoinEvent(joinEvent);
            return this;
        }

        public Builder setLeaveEvent(LeaveEvent leaveEvent) {
            copyOnWrite();
            ((ChatEventType) ((g) this).instance).setLeaveEvent(leaveEvent);
            return this;
        }

        public Builder setNameChange(NameChangeEvent nameChangeEvent) {
            copyOnWrite();
            ((ChatEventType) ((g) this).instance).setNameChange(nameChangeEvent);
            return this;
        }

        public Builder setNewAdminEvent(NewAdminEvent newAdminEvent) {
            copyOnWrite();
            ((ChatEventType) ((g) this).instance).setNewAdminEvent(newAdminEvent);
            return this;
        }

        public Builder setPhotoChange(PhotoChangeEvent photoChangeEvent) {
            copyOnWrite();
            ((ChatEventType) ((g) this).instance).setPhotoChange(photoChangeEvent);
            return this;
        }

        public Builder setRemoveUser(RemoveUserEvent removeUserEvent) {
            copyOnWrite();
            ((ChatEventType) ((g) this).instance).setRemoveUser(removeUserEvent);
            return this;
        }

        public Builder setReportChatEvent(ReportChatEvent reportChatEvent) {
            copyOnWrite();
            ((ChatEventType) ((g) this).instance).setReportChatEvent(reportChatEvent);
            return this;
        }

        public Builder setUserInvite(InviteEvent inviteEvent) {
            copyOnWrite();
            ((ChatEventType) ((g) this).instance).setUserInvite(inviteEvent);
            return this;
        }
    }

    public enum CetCase {
        CREATE_EVENT(1),
        USER_INVITE(2),
        JOIN_EVENT(3),
        LEAVE_EVENT(4),
        NAME_CHANGE(5),
        NEW_ADMIN_EVENT(6),
        PHOTO_CHANGE(7),
        REMOVE_USER(8),
        INVITE_LINK(9),
        REPORT_CHAT_EVENT(10),
        CET_NOT_SET(0);

        private final int value;

        CetCase(int i) {
            this.value = i;
        }

        public static CetCase forNumber(int i) {
            switch (i) {
                case 0:
                    return CET_NOT_SET;
                case 1:
                    return CREATE_EVENT;
                case 2:
                    return USER_INVITE;
                case 3:
                    return JOIN_EVENT;
                case 4:
                    return LEAVE_EVENT;
                case 5:
                    return NAME_CHANGE;
                case 6:
                    return NEW_ADMIN_EVENT;
                case 7:
                    return PHOTO_CHANGE;
                case 8:
                    return REMOVE_USER;
                case 9:
                    return INVITE_LINK;
                case 10:
                    return REPORT_CHAT_EVENT;
                default:
                    return null;
            }
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static CetCase valueOf(int i) {
            return forNumber(i);
        }
    }

    public static Builder newBuilder(ChatEventType chatEventType) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(chatEventType);
    }

    public static ChatEventType parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (ChatEventType) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ChatEventType parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (ChatEventType) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static ChatEventType parseFrom(phc phcVar) {
        return (ChatEventType) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static ChatEventType parseFrom(phc phcVar, uz00 uz00Var) {
        return (ChatEventType) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static ChatEventType parseFrom(byte[] bArr) {
        return (ChatEventType) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ChatEventType parseFrom(byte[] bArr, uz00 uz00Var) {
        return (ChatEventType) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static ChatEventType parseFrom(InputStream inputStream) {
        return (ChatEventType) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ChatEventType parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (ChatEventType) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ChatEventType parseFrom(lwg lwgVar) {
        return (ChatEventType) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static ChatEventType parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (ChatEventType) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
