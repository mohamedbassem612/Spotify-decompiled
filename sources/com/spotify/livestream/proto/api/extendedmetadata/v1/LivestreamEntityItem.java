package com.spotify.livestream.proto.api.extendedmetadata.v1;

import com.google.protobuf.h;
import p.bf40;
import p.dvd0;
import p.evd0;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.uid0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class LivestreamEntityItem extends h implements v2j0 {
    public static final int CAN_OBSERVE_FIELD_NUMBER = 16;
    public static final int CTA_DISPLAY_FIELD_NUMBER = 18;
    public static final int DEEPLINK_URL_FIELD_NUMBER = 6;
    private static final LivestreamEntityItem DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    public static final int END_TIMESTAMP_FIELD_NUMBER = 5;
    public static final int ENTITY_URIS_FIELD_NUMBER = 8;
    public static final int HOSTS_FIELD_NUMBER = 3;
    public static final int IMAGE_URL_FIELD_NUMBER = 11;
    public static final int IS_LISTEN_ONLY_FIELD_NUMBER = 19;
    public static final int OPTED_IN_FIELD_NUMBER = 13;
    public static final int PARENT_FIELD_NUMBER = 12;
    private static volatile qzr0 PARSER = null;
    public static final int PARTY_ACCESS_RESTRICTED_FIELD_NUMBER = 15;
    public static final int ROOM_STATE_FIELD_NUMBER = 10;
    public static final int ROOM_URI_FIELD_NUMBER = 7;
    public static final int RSVP_STATUS_FIELD_NUMBER = 17;
    public static final int START_TIMESTAMP_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int USER_RSVPED_FIELD_NUMBER = 14;
    public static final int VOTING_ROOT_URI_FIELD_NUMBER = 20;
    private boolean canObserve_;
    private int ctaDisplay_;
    private long endTimestamp_;
    private boolean isListenOnly_;
    private boolean optedIn_;
    private boolean partyAccessRestricted_;
    private int roomState_;
    private int rsvpStatus_;
    private long startTimestamp_;
    private boolean userRsvped_;
    private String title_ = "";
    private String description_ = "";
    private h290 hosts_ = h.emptyProtobufList();
    private String deeplinkUrl_ = "";
    private String roomUri_ = "";
    private h290 entityUris_ = h.emptyProtobufList();
    private String imageUrl_ = "";
    private h290 parent_ = h.emptyProtobufList();
    private String votingRootUri_ = "";

    static {
        LivestreamEntityItem livestreamEntityItem = new LivestreamEntityItem();
        DEFAULT_INSTANCE = livestreamEntityItem;
        h.registerDefaultInstance(LivestreamEntityItem.class, livestreamEntityItem);
    }

    private LivestreamEntityItem() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static LivestreamEntityItem r() {
        return DEFAULT_INSTANCE;
    }

    public final String A() {
        return this.votingRootUri_;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0013\u0000\u0000\u0001\u0014\u0013\u0000\u0003\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\u0002\u0005\u0002\u0006Ȉ\u0007Ȉ\bȚ\n\f\u000bȈ\f\u001b\r\u0007\u000e\u0007\u000f\u0007\u0010\u0007\u0011\f\u0012\f\u0013\u0007\u0014Ȉ", new Object[]{"title_", "description_", "hosts_", LivestreamHost.class, "startTimestamp_", "endTimestamp_", "deeplinkUrl_", "roomUri_", "entityUris_", "roomState_", "imageUrl_", "parent_", ParentInfo.class, "optedIn_", "userRsvped_", "partyAccessRestricted_", "canObserve_", "rsvpStatus_", "ctaDisplay_", "isListenOnly_", "votingRootUri_"});
        }
        if (iOrdinal == 3) {
            return new LivestreamEntityItem();
        }
        if (iOrdinal == 4) {
            return new uid0((byte) 17);
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
        synchronized (LivestreamEntityItem.class) {
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

    public final String getDescription() {
        return this.description_;
    }

    public final String getImageUrl() {
        return this.imageUrl_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.canObserve_;
    }

    public final dvd0 p() {
        dvd0 dvd0VarA = dvd0.a(this.ctaDisplay_);
        return dvd0VarA == null ? dvd0.t : dvd0VarA;
    }

    public final String q() {
        return this.deeplinkUrl_;
    }

    public final long s() {
        return this.endTimestamp_;
    }

    public final h290 t() {
        return this.entityUris_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final h290 u() {
        return this.hosts_;
    }

    public final boolean v() {
        return this.isListenOnly_;
    }

    public final h290 w() {
        return this.parent_;
    }

    public final evd0 x() {
        evd0 evd0VarA = evd0.a(this.roomState_);
        return evd0VarA == null ? evd0.f : evd0VarA;
    }

    public final String y() {
        return this.roomUri_;
    }

    public final long z() {
        return this.startTimestamp_;
    }
}
