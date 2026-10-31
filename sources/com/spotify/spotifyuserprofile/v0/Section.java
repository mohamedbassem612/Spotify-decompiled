package com.spotify.spotifyuserprofile.v0;

import com.google.protobuf.h;
import java.util.List;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.z451;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class Section extends h implements v2j0 {
    public static final int CONTENT_FIELD_NUMBER = 2;
    private static final Section DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 7;
    public static final int HINT_TEXT_FIELD_NUMBER = 5;
    public static final int NOTES_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int PROMPT_SUGGESTIONS_FIELD_NUMBER = 6;
    public static final int SECTION_ID_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private String title_ = "";
    private h290 content_ = h.emptyProtobufList();
    private String sectionId_ = "";
    private h290 notes_ = h.emptyProtobufList();
    private String hintText_ = "";
    private h290 promptSuggestions_ = h.emptyProtobufList();
    private String description_ = "";

    static {
        Section section = new Section();
        DEFAULT_INSTANCE = section;
        h.registerDefaultInstance(Section.class, section);
    }

    private Section() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001ለ\u0000\u0002\u001b\u0003Ȉ\u0004\u001b\u0005Ȉ\u0006Ț\u0007Ȉ", new Object[]{"bitField0_", "title_", "content_", SectionContent.class, "sectionId_", "notes_", Note.class, "hintText_", "promptSuggestions_", "description_"});
        }
        if (iOrdinal == 3) {
            return new Section();
        }
        if (iOrdinal == 4) {
            return new z451(DEFAULT_INSTANCE, (byte) 10);
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
        synchronized (Section.class) {
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

    public final List getContentList() {
        return this.content_;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getDescription() {
        return this.description_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final String n() {
        return this.hintText_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.notes_;
    }

    public final h290 p() {
        return this.promptSuggestions_;
    }

    public final String q() {
        return this.sectionId_;
    }

    public final boolean r() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
