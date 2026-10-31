package p;

import android.os.Parcel;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.MessageText;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract /* synthetic */ class i3a {
    public static int a(int i) {
        if (i == 0) {
            return 5;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    return i != 6 ? 0 : 4;
                }
            }
        }
        return i2;
    }

    public static int b(int i) {
        if (i == 0) {
            return 5;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    return i != 6 ? 0 : 4;
                }
            }
        }
        return i2;
    }

    public static final int c(int i) {
        return g(i);
    }

    public static int d(String str) {
        if (str == null) {
            bhn0.i("Name is null");
            return 0;
        }
        if (str.equals("UNSPECIFIED")) {
            return 1;
        }
        if (str.equals("ALBUM")) {
            return 2;
        }
        if (str.equals("SINGLE")) {
            return 3;
        }
        if (str.equals("EP")) {
            return 4;
        }
        hhg1.n("No enum constant com.spotify.extendedmetadata.extensions.companioncontent.Body.EntityComponent.Entity.Album.AlbumType.".concat(str));
        return 0;
    }

    public static int e(String str) {
        if (str == null) {
            bhn0.i("Name is null");
            return 0;
        }
        if (str.equals("UNSPECIFIED")) {
            return 1;
        }
        if (str.equals("ARTWORK")) {
            return 2;
        }
        if (str.equals("FULL_SCREEN")) {
            return 3;
        }
        hhg1.n("No enum constant com.spotify.extendedmetadata.extensions.companioncontent.Body.ViewMode.".concat(str));
        return 0;
    }

    public static /* synthetic */ String f(int i) {
        switch (i) {
            case 1:
                return "audio.equalizer.low_shelf_gain_v2";
            case 2:
                return "audio.equalizer.low_peak_gain_v2";
            case 3:
                return "audio.equalizer.low_mid_peak_gain_v2";
            case 4:
                return "audio.equalizer.high_mid_peak_gain_v2";
            case 5:
                return "audio.equalizer.high_peak_gain_v2";
            case 6:
                return "audio.equalizer.high_shelf_gain_v2";
            default:
                throw null;
        }
    }

    public static /* synthetic */ byte g(int i) {
        byte b = 1;
        if (i != 1) {
            b = 2;
            if (i != 2) {
                b = 3;
                if (i != 3) {
                    b = 4;
                    if (i != 4) {
                        if (i == 5) {
                            return (byte) 5;
                        }
                        throw null;
                    }
                }
            }
        }
        return b;
    }

    public static /* synthetic */ String h(int i) {
        if (i == 1) {
            return "periodic";
        }
        if (i == 2) {
            return "active_device_changed";
        }
        throw null;
    }

    public static int i(MessageText messageText, int i, int i2) {
        return (messageText.hashCode() + i) * i2;
    }

    public static String j(String str, Throwable th) {
        return str + th;
    }

    public static llm k(q8n q8nVar) {
        return smo1.e(flo1.l(q8nVar, guo1.B()));
    }

    public static void l(int i, b0k b0kVar, llj lljVar, b0k b0kVar2) {
        nko1.H(Integer.valueOf(i), b0kVar, lljVar);
        nko1.F(b0kVar2);
    }

    public static void m(Parcel parcel, int i, Boolean bool) {
        parcel.writeInt(i);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void n(cab cabVar, long j) {
        cabVar.p().i();
        cabVar.D(j);
    }

    public static /* synthetic */ boolean o(AtomicReference atomicReference, Object obj) {
        while (!atomicReference.compareAndSet(null, obj)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean p(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean q(AtomicReference atomicReference, Throwable th) {
        while (!atomicReference.compareAndSet(null, th)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ String r(int i) {
        if (i == 1) {
            return "SERVICE_DATA";
        }
        if (i == 2) {
            return "LOCAL_NAME";
        }
        if (i == 3) {
            return "OVERFLOW_AREA";
        }
        throw null;
    }

    public static /* synthetic */ String s(int i) {
        switch (i) {
            case 1:
                return "COMMERCE_AUCTION";
            case 2:
                return "COMMERCE_BUSINESS";
            case 3:
                return "COMMERCE_OTHER";
            case 4:
                return "COMMERCE_PRODUCT";
            case 5:
                return "COMMERCE_RESTAURANT";
            case 6:
                return "COMMERCE_SERVICE";
            case 7:
                return "COMMERCE_TRAVEL_FLIGHT";
            case 8:
                return "COMMERCE_TRAVEL_HOTEL";
            case 9:
                return "COMMERCE_TRAVEL_OTHER";
            case 10:
                return "GAME_STATE";
            case 11:
                return "MEDIA_IMAGE";
            case 12:
                return "MEDIA_MIXED";
            case 13:
                return "MEDIA_MUSIC";
            case 14:
                return "MEDIA_OTHER";
            case 15:
                return "MEDIA_VIDEO";
            case 16:
                return "OTHER";
            case 17:
                return "TEXT_ARTICLE";
            case 18:
                return "TEXT_BLOG";
            case 19:
                return "TEXT_OTHER";
            case 20:
                return "TEXT_RECIPE";
            case 21:
                return "TEXT_REVIEW";
            case 22:
                return "TEXT_SEARCH_RESULTS";
            case 23:
                return "TEXT_STORY";
            case 24:
                return "TEXT_TECHNICAL_DOC";
            default:
                throw null;
        }
    }
}
