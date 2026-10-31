package spotify.your_library.proto;

import com.google.protobuf.h;
import p.bf40;
import p.btm1;
import p.dnm1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class YourLibraryDecoratedEntityOuterClass$YourLibraryAlbumExtraInfo extends h implements v2j0 {
    public static final int ARTIST_NAME_FIELD_NUMBER = 1;
    public static final int ARTIST_URI_FIELD_NUMBER = 2;
    private static final YourLibraryDecoratedEntityOuterClass$YourLibraryAlbumExtraInfo DEFAULT_INSTANCE;
    public static final int IS_PREMIUM_ONLY_FIELD_NUMBER = 4;
    public static final int NEW_RELEASE_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int RELEASE_DATE_FIELD_NUMBER = 6;
    public static final int TYPE_FIELD_NUMBER = 3;
    private String artistName_ = "";
    private String artistUri_ = "";
    private boolean isPremiumOnly_;
    private boolean newRelease_;
    private long releaseDate_;
    private int type_;

    static {
        YourLibraryDecoratedEntityOuterClass$YourLibraryAlbumExtraInfo yourLibraryDecoratedEntityOuterClass$YourLibraryAlbumExtraInfo = new YourLibraryDecoratedEntityOuterClass$YourLibraryAlbumExtraInfo();
        DEFAULT_INSTANCE = yourLibraryDecoratedEntityOuterClass$YourLibraryAlbumExtraInfo;
        h.registerDefaultInstance(YourLibraryDecoratedEntityOuterClass$YourLibraryAlbumExtraInfo.class, yourLibraryDecoratedEntityOuterClass$YourLibraryAlbumExtraInfo);
    }

    private YourLibraryDecoratedEntityOuterClass$YourLibraryAlbumExtraInfo() {
    }

    public static YourLibraryDecoratedEntityOuterClass$YourLibraryAlbumExtraInfo o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004\u0007\u0005\u0007\u0006\u0002", new Object[]{"artistName_", "artistUri_", "type_", "isPremiumOnly_", "newRelease_", "releaseDate_"});
        }
        if (iOrdinal == 3) {
            return new YourLibraryDecoratedEntityOuterClass$YourLibraryAlbumExtraInfo();
        }
        if (iOrdinal == 4) {
            return new dnm1(DEFAULT_INSTANCE, (byte) 8);
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
        synchronized (YourLibraryDecoratedEntityOuterClass$YourLibraryAlbumExtraInfo.class) {
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

    public final boolean getIsPremiumOnly() {
        return this.isPremiumOnly_;
    }

    public final String n() {
        return this.artistName_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean p() {
        return this.newRelease_;
    }

    public final btm1 q() {
        btm1 btm1Var;
        int i = this.type_;
        if (i == 0) {
            btm1Var = btm1.ALBUM;
        } else if (i == 1) {
            btm1Var = btm1.SINGLE;
        } else if (i != 2) {
            btm1Var = i != 3 ? null : btm1.EP;
        } else {
            btm1Var = btm1.COMPILATION;
        }
        return btm1Var == null ? btm1.UNRECOGNIZED : btm1Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
