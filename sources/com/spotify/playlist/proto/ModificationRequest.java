package com.spotify.playlist.proto;

import com.google.protobuf.h;
import com.spotify.list_collection.save_source.proto.SaveSource;
import p.a01;
import p.b290;
import p.bf40;
import p.c290;
import p.c9c;
import p.cjj0;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ModificationRequest extends h implements v2j0 {
    public static final int AFTER_FIELD_NUMBER = 3;
    public static final int ATTRIBUTES_FIELD_NUMBER = 6;
    public static final int ATTRIBUTES_TO_CLEAR_FIELD_NUMBER = 11;
    public static final int BEFORE_FIELD_NUMBER = 2;
    public static final int CONTENTS_FIELD_NUMBER = 9;
    public static final int CREATE_ITEM_KIND_FIELD_NUMBER = 12;
    public static final int CREATION_INFO_FIELD_NUMBER = 14;
    private static final ModificationRequest DEFAULT_INSTANCE;
    public static final int ITEM_ID_FIELD_NUMBER = 10;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int OPERATION_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYLIST_FIELD_NUMBER = 5;
    public static final int ROWS_FIELD_NUMBER = 8;
    public static final int SAVE_SOURCE_FIELD_NUMBER = 13;
    public static final int URIS_FIELD_NUMBER = 7;
    private static final c290 attributesToClear_converter_ = new c9c((byte) 16);
    private Attributes attributes_;
    private int bitField0_;
    private boolean contents_;
    private int createItemKind_;
    private CreationInfo creationInfo_;
    private boolean playlist_;
    private SaveSource saveSource_;
    private String operation_ = "";
    private String before_ = "";
    private String after_ = "";
    private String name_ = "";
    private h290 uris_ = h.emptyProtobufList();
    private h290 rows_ = h.emptyProtobufList();
    private String itemId_ = "";
    private b290 attributesToClear_ = h.emptyIntList();

    public static final class Attributes extends h implements v2j0 {
        public static final int AI_CURATION_REFERENCE_ID_FIELD_NUMBER = 7;
        public static final int COLLABORATIVE_FIELD_NUMBER = 2;
        private static final Attributes DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 4;
        public static final int IMAGEURI_FIELD_NUMBER = 5;
        public static final int NAME_FIELD_NUMBER = 3;
        private static volatile qzr0 PARSER = null;
        public static final int PICTURE_FIELD_NUMBER = 6;
        public static final int PUBLISHED_FIELD_NUMBER = 1;
        public static final int PUBLISHED_STATE_FIELD_NUMBER = 8;
        private int bitField0_;
        private boolean collaborative_;
        private int publishedState_;
        private boolean published_;
        private String name_ = "";
        private String description_ = "";
        private String imageUri_ = "";
        private String picture_ = "";
        private String aiCurationReferenceId_ = "";

        static {
            Attributes attributes = new Attributes();
            DEFAULT_INSTANCE = attributes;
            h.registerDefaultInstance(Attributes.class, attributes);
        }

        private Attributes() {
        }

        public static a n() {
            return (a) DEFAULT_INSTANCE.createBuilder();
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\b᠌\u0007", new Object[]{"bitField0_", "published_", "collaborative_", "name_", "description_", "imageUri_", "picture_", "aiCurationReferenceId_", "publishedState_", cjj0.o});
            }
            if (iOrdinal == 3) {
                return new Attributes();
            }
            if (iOrdinal == 4) {
                return new a(DEFAULT_INSTANCE);
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
            synchronized (Attributes.class) {
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

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final void o(String str) {
            this.bitField0_ |= 64;
            this.aiCurationReferenceId_ = str;
        }

        public final void p(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.description_ = str;
        }

        public final void q(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.name_ = str;
        }

        public final void r(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.picture_ = str;
        }

        public final void s(boolean z) {
            this.bitField0_ |= 1;
            this.published_ = z;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        ModificationRequest modificationRequest = new ModificationRequest();
        DEFAULT_INSTANCE = modificationRequest;
        h.registerDefaultInstance(ModificationRequest.class, modificationRequest);
    }

    private ModificationRequest() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static b r() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public final void A(boolean z) {
        this.bitField0_ |= 16;
        this.playlist_ = z;
    }

    public final void B(SaveSource saveSource) {
        this.saveSource_ = saveSource;
        this.bitField0_ |= 512;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007\u001a\b\u001a\tဇ\u0006\nဈ\u0007\u000bࠞ\f᠌\b\rဉ\t\u000eဉ\n", new Object[]{"bitField0_", "operation_", "before_", "after_", "name_", "playlist_", "attributes_", "uris_", "rows_", "contents_", "itemId_", "attributesToClear_", a01.k, "createItemKind_", a01.e, "saveSource_", "creationInfo_"});
        }
        if (iOrdinal == 3) {
            return new ModificationRequest();
        }
        if (iOrdinal == 4) {
            return new b(DEFAULT_INSTANCE);
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
        synchronized (ModificationRequest.class) {
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

    public final void n(Iterable iterable) {
        h290 h290VarMutableCopy = this.rows_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.rows_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(Iterable iterable) {
        h290 h290VarMutableCopy = this.uris_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.uris_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final void p(String str) {
        str.getClass();
        h290 h290VarMutableCopy = this.rows_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.rows_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(str);
    }

    public final void q(String str) {
        str.getClass();
        h290 h290VarMutableCopy = this.uris_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.uris_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(str);
    }

    public final void s(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.after_ = str;
    }

    public final void t(Attributes attributes) {
        attributes.getClass();
        this.attributes_ = attributes;
        this.bitField0_ |= 32;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.before_ = str;
    }

    public final void v(boolean z) {
        this.bitField0_ |= 64;
        this.contents_ = z;
    }

    public final void w(CreationInfo creationInfo) {
        this.creationInfo_ = creationInfo;
        this.bitField0_ |= 1024;
    }

    public final void x(String str) {
        str.getClass();
        this.bitField0_ |= 128;
        this.itemId_ = str;
    }

    public final void y(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.name_ = str;
    }

    public final void z(String str) {
        this.bitField0_ |= 1;
        this.operation_ = str;
    }
}
