package com.spotify.corex.readalongtranscript.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class TextSentence extends h implements v2j0 {
    private static final TextSentence DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SENTENCE_FIELD_NUMBER = 1;
    private int bitField0_;
    private Sentence sentence_;

    public static final class Sentence extends h implements v2j0 {
        private static final Sentence DEFAULT_INSTANCE;
        public static final int HIGHLIGHT_FIELD_NUMBER = 3;
        private static volatile qzr0 PARSER = null;
        public static final int START_MS_FIELD_NUMBER = 1;
        public static final int TEXT_FIELD_NUMBER = 2;
        private int startMs_;
        private String text_ = "";
        private h290 highlight_ = h.emptyProtobufList();

        static {
            Sentence sentence = new Sentence();
            DEFAULT_INSTANCE = sentence;
            h.registerDefaultInstance(Sentence.class, sentence);
        }

        private Sentence() {
        }

        public static Sentence n() {
            return DEFAULT_INSTANCE;
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003\u001b", new Object[]{"startMs_", "text_", "highlight_", TextRange.class});
            }
            if (iOrdinal == 3) {
                return new Sentence();
            }
            if (iOrdinal == 4) {
                return new d(DEFAULT_INSTANCE);
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
            synchronized (Sentence.class) {
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

        public final h290 o() {
            return this.highlight_;
        }

        public final int p() {
            return this.startMs_;
        }

        public final String q() {
            return this.text_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        TextSentence textSentence = new TextSentence();
        DEFAULT_INSTANCE = textSentence;
        h.registerDefaultInstance(TextSentence.class, textSentence);
    }

    private TextSentence() {
    }

    public static TextSentence n() {
        return DEFAULT_INSTANCE;
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "sentence_"});
        }
        if (iOrdinal == 3) {
            return new TextSentence();
        }
        if (iOrdinal == 4) {
            return new c(DEFAULT_INSTANCE);
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
        synchronized (TextSentence.class) {
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

    public final Sentence o() {
        Sentence sentence = this.sentence_;
        return sentence == null ? Sentence.n() : sentence;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
