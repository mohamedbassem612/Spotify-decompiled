package com.spotify.socialrecs.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.hye1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class Track extends h implements v2j0 {
    public static final int ARTIST_NAMES_FIELD_NUMBER = 3;
    public static final int ATTRIBUTED_MEMBERS_FIELD_NUMBER = 8;
    private static final Track DEFAULT_INSTANCE;
    public static final int EXPLICIT_FIELD_NUMBER = 5;
    public static final int IMAGE_URI_FIELD_NUMBER = 4;
    public static final int MOGEF19_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int PREVIEW_ID_FIELD_NUMBER = 7;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private boolean explicit_;
    private boolean mogef19_;
    private String uri_ = "";
    private String title_ = "";
    private h290 artistNames_ = h.emptyProtobufList();
    private String imageUri_ = "";
    private String previewId_ = "";
    private h290 attributedMembers_ = h.emptyProtobufList();

    static {
        Track track = new Track();
        DEFAULT_INSTANCE = track;
        h.registerDefaultInstance(Track.class, track);
    }

    private Track() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003Ț\u0004Ȉ\u0005\u0007\u0006\u0007\u0007Ȉ\b\u001b", new Object[]{"uri_", "title_", "artistNames_", "imageUri_", "explicit_", "mogef19_", "previewId_", "attributedMembers_", Member.class});
        }
        if (iOrdinal == 3) {
            return new Track();
        }
        if (iOrdinal == 4) {
            return new hye1(DEFAULT_INSTANCE, (byte) 29);
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
        synchronized (Track.class) {
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

    public final String getUri() {
        return this.uri_;
    }

    public final h290 n() {
        return this.attributedMembers_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
