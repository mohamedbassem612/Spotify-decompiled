package org.chromium.net.httpflags;

import com.google.protobuf.g;
import com.google.protobuf.h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import p.bf40;
import p.bhn0;
import p.dng0;
import p.jf40;
import p.k220;
import p.kul1;
import p.lwg;
import p.phc;
import p.qng0;
import p.qzr0;
import p.uz00;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class Flags extends h implements FlagsOrBuilder {
    private static final Flags DEFAULT_INSTANCE;
    public static final int FLAGS_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private qng0 flags_ = qng0.b;

    /* JADX INFO: renamed from: org.chromium.net.httpflags.Flags$1, reason: invalid class name */
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

    public static final class FlagsDefaultEntryHolder {
        static final dng0 defaultEntry = new dng0(kul1.g, "", kul1.i, FlagValue.getDefaultInstance());

        private FlagsDefaultEntryHolder() {
        }
    }

    static {
        Flags flags = new Flags();
        DEFAULT_INSTANCE = flags;
        h.registerDefaultInstance(Flags.class, flags);
    }

    private Flags() {
    }

    public static Flags getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, FlagValue> getMutableFlagsMap() {
        return internalGetMutableFlags();
    }

    private qng0 internalGetFlags() {
        return this.flags_;
    }

    private qng0 internalGetMutableFlags() {
        qng0 qng0Var = this.flags_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.flags_ = qng0VarH;
        return qng0VarH;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Flags parseDelimitedFrom(InputStream inputStream) {
        return (Flags) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Flags parseFrom(ByteBuffer byteBuffer) {
        return (Flags) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // org.chromium.net.httpflags.FlagsOrBuilder
    public boolean containsFlags(String str) {
        str.getClass();
        return internalGetFlags().containsKey(str);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        switch (jf40Var.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"flags_", FlagsDefaultEntryHolder.defaultEntry});
            case 3:
                return new Flags();
            case 4:
                return new Builder(0);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                qzr0 qzr0Var = PARSER;
                if (qzr0Var != null) {
                    return qzr0Var;
                }
                synchronized (Flags.class) {
                    try {
                        bf40Var = PARSER;
                        if (bf40Var == null) {
                            bf40Var = new bf40(DEFAULT_INSTANCE);
                            PARSER = bf40Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return bf40Var;
            default:
                k220.c();
                return null;
        }
    }

    @Override // org.chromium.net.httpflags.FlagsOrBuilder
    @Deprecated
    public Map<String, FlagValue> getFlags() {
        return getFlagsMap();
    }

    @Override // org.chromium.net.httpflags.FlagsOrBuilder
    public int getFlagsCount() {
        return internalGetFlags().size();
    }

    @Override // org.chromium.net.httpflags.FlagsOrBuilder
    public Map<String, FlagValue> getFlagsMap() {
        return Collections.unmodifiableMap(internalGetFlags());
    }

    @Override // org.chromium.net.httpflags.FlagsOrBuilder
    public FlagValue getFlagsOrDefault(String str, FlagValue flagValue) {
        str.getClass();
        qng0 qng0VarInternalGetFlags = internalGetFlags();
        return qng0VarInternalGetFlags.containsKey(str) ? (FlagValue) qng0VarInternalGetFlags.get(str) : flagValue;
    }

    @Override // org.chromium.net.httpflags.FlagsOrBuilder
    public FlagValue getFlagsOrThrow(String str) {
        str.getClass();
        qng0 qng0VarInternalGetFlags = internalGetFlags();
        if (qng0VarInternalGetFlags.containsKey(str)) {
            return (FlagValue) qng0VarInternalGetFlags.get(str);
        }
        bhn0.q();
        return null;
    }

    public static final class Builder extends g implements FlagsOrBuilder {
        private Builder() {
            super(Flags.DEFAULT_INSTANCE);
        }

        public Builder clearFlags() {
            copyOnWrite();
            ((Flags) ((g) this).instance).getMutableFlagsMap().clear();
            return this;
        }

        @Override // org.chromium.net.httpflags.FlagsOrBuilder
        public boolean containsFlags(String str) {
            str.getClass();
            return ((Flags) ((g) this).instance).getFlagsMap().containsKey(str);
        }

        @Override // org.chromium.net.httpflags.FlagsOrBuilder
        @Deprecated
        public Map<String, FlagValue> getFlags() {
            return getFlagsMap();
        }

        @Override // org.chromium.net.httpflags.FlagsOrBuilder
        public int getFlagsCount() {
            return ((Flags) ((g) this).instance).getFlagsMap().size();
        }

        @Override // org.chromium.net.httpflags.FlagsOrBuilder
        public Map<String, FlagValue> getFlagsMap() {
            return Collections.unmodifiableMap(((Flags) ((g) this).instance).getFlagsMap());
        }

        @Override // org.chromium.net.httpflags.FlagsOrBuilder
        public FlagValue getFlagsOrDefault(String str, FlagValue flagValue) {
            str.getClass();
            Map<String, FlagValue> flagsMap = ((Flags) ((g) this).instance).getFlagsMap();
            return flagsMap.containsKey(str) ? flagsMap.get(str) : flagValue;
        }

        @Override // org.chromium.net.httpflags.FlagsOrBuilder
        public FlagValue getFlagsOrThrow(String str) {
            str.getClass();
            Map<String, FlagValue> flagsMap = ((Flags) ((g) this).instance).getFlagsMap();
            if (flagsMap.containsKey(str)) {
                return flagsMap.get(str);
            }
            bhn0.q();
            return null;
        }

        public Builder putAllFlags(Map<String, FlagValue> map) {
            copyOnWrite();
            ((Flags) ((g) this).instance).getMutableFlagsMap().putAll(map);
            return this;
        }

        public Builder putFlags(String str, FlagValue flagValue) {
            str.getClass();
            flagValue.getClass();
            copyOnWrite();
            ((Flags) ((g) this).instance).getMutableFlagsMap().put(str, flagValue);
            return this;
        }

        public Builder removeFlags(String str) {
            str.getClass();
            copyOnWrite();
            ((Flags) ((g) this).instance).getMutableFlagsMap().remove(str);
            return this;
        }

        public /* synthetic */ Builder(int i) {
            this();
        }
    }

    public static Builder newBuilder(Flags flags) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(flags);
    }

    public static Flags parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (Flags) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static Flags parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (Flags) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static Flags parseFrom(phc phcVar) {
        return (Flags) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static Flags parseFrom(phc phcVar, uz00 uz00Var) {
        return (Flags) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static Flags parseFrom(byte[] bArr) {
        return (Flags) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Flags parseFrom(byte[] bArr, uz00 uz00Var) {
        return (Flags) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static Flags parseFrom(InputStream inputStream) {
        return (Flags) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Flags parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (Flags) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static Flags parseFrom(lwg lwgVar) {
        return (Flags) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static Flags parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (Flags) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
