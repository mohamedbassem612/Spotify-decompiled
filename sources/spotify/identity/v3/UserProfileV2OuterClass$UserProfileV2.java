package spotify.identity.v3;

import com.google.protobuf.Int32Value;
import com.google.protobuf.StringValue;
import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8i1;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class UserProfileV2OuterClass$UserProfileV2 extends h implements v2j0 {
    public static final int ACCOUNT_ID_FIELD_NUMBER = 24;
    public static final int COLOR_FIELD_NUMBER = 11;
    private static final UserProfileV2OuterClass$UserProfileV2 DEFAULT_INSTANCE;
    public static final int IMAGES_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int SOCIAL_HANDLE_FIELD_NUMBER = 22;
    public static final int USERNAME_FIELD_NUMBER = 1;
    private StringValue accountId_;
    private int bitField0_;
    private Int32Value color_;
    private h290 images_ = h.emptyProtobufList();
    private StringValue name_;
    private StringValue socialHandle_;
    private StringValue username_;

    static {
        UserProfileV2OuterClass$UserProfileV2 userProfileV2OuterClass$UserProfileV2 = new UserProfileV2OuterClass$UserProfileV2();
        DEFAULT_INSTANCE = userProfileV2OuterClass$UserProfileV2;
        h.registerDefaultInstance(UserProfileV2OuterClass$UserProfileV2.class, userProfileV2OuterClass$UserProfileV2);
    }

    private UserProfileV2OuterClass$UserProfileV2() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static UserProfileV2OuterClass$UserProfileV2 t(byte[] bArr) {
        return (UserProfileV2OuterClass$UserProfileV2) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0018\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u000bဉ\u0002\u0016ဉ\u0003\u0018ဉ\u0004", new Object[]{"bitField0_", "username_", "name_", "images_", UserProfileV2OuterClass$Image.class, "color_", "socialHandle_", "accountId_"});
        }
        if (iOrdinal == 3) {
            return new UserProfileV2OuterClass$UserProfileV2();
        }
        if (iOrdinal == 4) {
            return new s8i1(DEFAULT_INSTANCE, (byte) 5);
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
        synchronized (UserProfileV2OuterClass$UserProfileV2.class) {
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

    public final Int32Value getColor() {
        Int32Value int32Value = this.color_;
        return int32Value == null ? Int32Value.o() : int32Value;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final boolean hasColor() {
        return (this.bitField0_ & 4) != 0;
    }

    public final StringValue n() {
        StringValue stringValue = this.accountId_;
        return stringValue == null ? StringValue.o() : stringValue;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.images_;
    }

    public final StringValue p() {
        StringValue stringValue = this.name_;
        return stringValue == null ? StringValue.o() : stringValue;
    }

    public final StringValue q() {
        StringValue stringValue = this.socialHandle_;
        return stringValue == null ? StringValue.o() : stringValue;
    }

    public final StringValue r() {
        StringValue stringValue = this.username_;
        return stringValue == null ? StringValue.o() : stringValue;
    }

    public final boolean s() {
        return (this.bitField0_ & 8) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
