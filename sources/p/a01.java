package p;

import com.spotify.messages.BetamaxPlaybackSession;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a01 implements z190 {
    public final /* synthetic */ byte a;
    public static final a01 b = new a01(0);
    public static final a01 c = new a01(1);
    public static final a01 d = new a01(2);
    public static final a01 e = new a01(3);
    public static final a01 f = new a01(4);
    public static final a01 g = new a01(5);
    public static final a01 h = new a01(6);
    public static final a01 i = new a01(7);
    public static final a01 j = new a01(8);
    public static final a01 k = new a01(9);
    public static final a01 l = new a01(10);
    public static final a01 m = new a01(11);
    public static final a01 n = new a01(12);
    public static final a01 o = new a01(13);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a01 f1p = new a01(14);
    public static final a01 q = new a01(15);
    public static final a01 r = new a01(16);
    public static final a01 s = new a01(17);
    public static final a01 t = new a01(18);
    public static final a01 u = new a01(19);
    public static final a01 v = new a01(20);
    public static final a01 w = new a01(21);
    public static final a01 x = new a01(22);
    public static final a01 y = new a01(23);
    public static final a01 z = new a01(24);
    public static final a01 A = new a01(25);
    public static final a01 B = new a01(26);
    public static final a01 C = new a01(27);
    public static final a01 D = new a01(28);
    public static final a01 E = new a01(29);

    public /* synthetic */ a01(byte b2) {
        this.a = b2;
    }

    public final boolean isInRange(int i2) {
        hsn hsnVar = null;
        switch (this.a) {
            case 0:
                return b01.a(i2) != null;
            case 1:
                return d01.a(i2) != null;
            case 2:
                switch (i2) {
                    case 0:
                        hsnVar = em7.KIND_UNSPECIFIED;
                        break;
                    case 1:
                        hsnVar = em7.KIND_URI;
                        break;
                    case 3:
                        hsnVar = em7.KIND_NAME;
                        break;
                    case 4:
                        hsnVar = em7.KIND_DESCRIPTION;
                        break;
                    case 5:
                        hsnVar = em7.KIND_UPDATED_AT;
                        break;
                    case 6:
                        hsnVar = em7.KIND_ADDED_BY_USERNAME;
                        break;
                    case 7:
                        hsnVar = em7.KIND_OWNER_USERNAME;
                        break;
                    case 8:
                        hsnVar = em7.KIND_CREATED_AT;
                        break;
                    case 9:
                        hsnVar = em7.KIND_CAPABILITIES;
                        break;
                    case 10:
                        hsnVar = em7.KIND_GEOBLOCK;
                        break;
                    case 11:
                        hsnVar = em7.KIND_SEEN_AT;
                        break;
                    case 12:
                        hsnVar = em7.KIND_ABUSE_REPORTING_ENABLED;
                        break;
                    case 13:
                        hsnVar = em7.KIND_APPROXIMATE_LENGTH;
                        break;
                    case 14:
                        hsnVar = em7.KIND_AVAILABLE_SIGNALS;
                        break;
                    case 15:
                        hsnVar = em7.KIND_PUBLISHED_TO_PROFILE;
                        break;
                    case 16:
                        hsnVar = em7.KIND_RECOMMENDATION_INFO;
                        break;
                    case 17:
                        hsnVar = em7.KIND_AI_CURATION;
                        break;
                    case 18:
                        hsnVar = em7.KIND_ADDED_AT;
                        break;
                    case 19:
                        hsnVar = em7.KIND_DELETED_BY_OWNER;
                        break;
                    case 20:
                        hsnVar = em7.KIND_PICTURE_FILE_ID;
                        break;
                    case 21:
                        hsnVar = em7.KIND_PICTURE_SIZES;
                        break;
                    case 22:
                        hsnVar = em7.KIND_CLIENT_ID;
                        break;
                    case 23:
                        hsnVar = em7.KIND_FORMAT;
                        break;
                    case 24:
                        hsnVar = em7.KIND_FORMAT_LIST_ATTRIBUTES;
                        break;
                    case 25:
                        hsnVar = em7.KIND_ITEM_ID_ALGORITHM;
                        break;
                    case 26:
                        hsnVar = em7.KIND_RECOVERABLE;
                        break;
                    case 27:
                        hsnVar = em7.KIND_SOURCE_LENS;
                        break;
                    case 28:
                        hsnVar = em7.KIND_SAVE_SOURCE;
                        break;
                }
                return hsnVar != null;
            case 3:
                if (i2 == 0) {
                    hsnVar = vln.CREATE_ITEM_KIND_UNSPECIFIED;
                } else if (i2 == 1) {
                    hsnVar = vln.CREATE_ITEM_KIND_PLAYLIST;
                } else if (i2 == 2) {
                    hsnVar = vln.CREATE_ITEM_KIND_FOLDER;
                }
                return hsnVar != null;
            case 4:
                if (i2 == 0) {
                    hsnVar = hsn.b;
                } else if (i2 == 1) {
                    hsnVar = hsn.c;
                } else if (i2 == 2) {
                    hsnVar = hsn.d;
                } else if (i2 == 3) {
                    hsnVar = hsn.e;
                }
                return hsnVar != null;
            case 5:
                return v6z.a(i2) != null;
            case 6:
                return w6z.a(i2) != null;
            case 7:
                return r730.a(i2) != null;
            case 8:
                return clc0.a(i2) != null;
            case 9:
                return hmc0.a(i2) != null;
            case 10:
                switch (i2) {
                    case 1:
                        hsnVar = fij0.ALBUM;
                        break;
                    case 2:
                        hsnVar = fij0.SINGLE;
                        break;
                    case 3:
                        hsnVar = fij0.COMPILATION;
                        break;
                    case 4:
                        hsnVar = fij0.EP;
                        break;
                    case 5:
                        hsnVar = fij0.AUDIOBOOK;
                        break;
                    case 6:
                        hsnVar = fij0.PODCAST;
                        break;
                }
                return hsnVar != null;
            case 11:
                return gij0.a(i2) != null;
            case 12:
                switch (i2) {
                    case 0:
                        hsnVar = hij0.ARTIST_ROLE_UNKNOWN;
                        break;
                    case 1:
                        hsnVar = hij0.ARTIST_ROLE_MAIN_ARTIST;
                        break;
                    case 2:
                        hsnVar = hij0.ARTIST_ROLE_FEATURED_ARTIST;
                        break;
                    case 3:
                        hsnVar = hij0.ARTIST_ROLE_REMIXER;
                        break;
                    case 4:
                        hsnVar = hij0.ARTIST_ROLE_ACTOR;
                        break;
                    case 5:
                        hsnVar = hij0.ARTIST_ROLE_COMPOSER;
                        break;
                    case 6:
                        hsnVar = hij0.ARTIST_ROLE_CONDUCTOR;
                        break;
                    case 7:
                        hsnVar = hij0.ARTIST_ROLE_ORCHESTRA;
                        break;
                }
                return hsnVar != null;
            case 13:
                return iij0.a(i2) != null;
            case 14:
                if (i2 == 0) {
                    hsnVar = jij0.UNKNOWN;
                } else if (i2 == 1) {
                    hsnVar = jij0.DEFAULT;
                } else if (i2 == 2) {
                    hsnVar = jij0.PARROT;
                }
                return hsnVar != null;
            case 15:
                if (i2 == 16) {
                    hsnVar = kij0.FLAC_FLAC;
                } else if (i2 != 22) {
                    switch (i2) {
                        case 0:
                            hsnVar = kij0.OGG_VORBIS_96;
                            break;
                        case 1:
                            hsnVar = kij0.OGG_VORBIS_160;
                            break;
                        case 2:
                            hsnVar = kij0.OGG_VORBIS_320;
                            break;
                        case 3:
                            hsnVar = kij0.MP3_256;
                            break;
                        case 4:
                            hsnVar = kij0.MP3_320;
                            break;
                        case 5:
                            hsnVar = kij0.MP3_160;
                            break;
                        case 6:
                            hsnVar = kij0.MP3_96;
                            break;
                        case 7:
                            hsnVar = kij0.MP3_160_ENC;
                            break;
                        case 8:
                            hsnVar = kij0.AAC_24;
                            break;
                        case 9:
                            hsnVar = kij0.AAC_48;
                            break;
                        default:
                            switch (i2) {
                                case 18:
                                    hsnVar = kij0.XHE_AAC_24;
                                    break;
                                case 19:
                                    hsnVar = kij0.XHE_AAC_16;
                                    break;
                                case 20:
                                    hsnVar = kij0.XHE_AAC_12;
                                    break;
                                default:
                                    switch (i2) {
                                        case BetamaxPlaybackSession.PLAYBACK_ID_FIELD_NUMBER /* 54 */:
                                            hsnVar = kij0.PHONO_LOW;
                                            break;
                                        case BetamaxPlaybackSession.PLAYER_ID_FIELD_NUMBER /* 55 */:
                                            hsnVar = kij0.PHONO_HIGH;
                                            break;
                                        case BetamaxPlaybackSession.MS_PLAYED_NOMINAL_INTERNAL_FIELD_NUMBER /* 56 */:
                                            hsnVar = kij0.PHONO_CLEAR;
                                            break;
                                        case 57:
                                            hsnVar = kij0.FLAC_FLAC_PETREL;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    hsnVar = kij0.FLAC_FLAC_24BIT;
                }
                return hsnVar != null;
            case 16:
                return lij0.a(i2) != null;
            case 17:
                if (i2 == 0) {
                    hsnVar = mij0.TOTAL;
                } else if (i2 == 1) {
                    hsnVar = mij0.COVERARTCP;
                }
                return hsnVar != null;
            case 18:
                if (i2 == 0) {
                    hsnVar = oij0.P;
                } else if (i2 == 1) {
                    hsnVar = oij0.C;
                }
                return hsnVar != null;
            case 19:
                if (i2 == 0) {
                    hsnVar = pij0.P;
                } else if (i2 == 1) {
                    hsnVar = pij0.C;
                }
                return hsnVar != null;
            case 20:
                if (i2 == 0) {
                    hsnVar = sij0.FULL;
                } else if (i2 == 1) {
                    hsnVar = sij0.TRAILER;
                } else if (i2 == 2) {
                    hsnVar = sij0.BONUS;
                }
                return hsnVar != null;
            case 21:
                return tij0.a(i2) != null;
            case 22:
                if (i2 == 0) {
                    hsnVar = uij0.DEFAULT;
                } else if (i2 == 1) {
                    hsnVar = uij0.SMALL;
                } else if (i2 == 2) {
                    hsnVar = uij0.LARGE;
                } else if (i2 == 3) {
                    hsnVar = uij0.XLARGE;
                }
                return hsnVar != null;
            case 23:
                return vij0.a(i2) != null;
            case 24:
                return wij0.a(i2) != null;
            case 25:
                return xij0.a(i2) != null;
            case 26:
                return (i2 == 0 ? yij0.a : null) != null;
            case 27:
                return (i2 == 0 ? zij0.a : null) != null;
            case 28:
                if (i2 == 1) {
                    hsnVar = ajj0.SEQUENTIAL;
                } else if (i2 == 2) {
                    hsnVar = ajj0.EPISODIC;
                } else if (i2 == 3) {
                    hsnVar = ajj0.RECENT;
                }
                return hsnVar != null;
            default:
                return bjj0.a(i2) != null;
        }
    }
}
