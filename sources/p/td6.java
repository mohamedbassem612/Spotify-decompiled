package p;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract /* synthetic */ class td6 {
    public static int[] _values() {
        return l1d.H(3);
    }

    public static int a(int i) {
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    public static /* synthetic */ int b(int i) {
        switch (i) {
            case 1:
                return 1500;
            case 2:
                return 2500;
            case 3:
                return 3500;
            case 4:
                return 5000;
            case 5:
                return 8000;
            case 6:
                return -1;
            default:
                throw null;
        }
    }

    public static /* synthetic */ String c(int i) {
        switch (i) {
            case 1:
                return "android-audio-focus";
            case 2:
                return "android-audio-focus-audiofocus";
            case 3:
                return "android-audio-focus-coreinternal";
            case 4:
                return "android-ubiquity-audio-focus-service";
            case 5:
                return "android-campaigns-audioplayerimpl";
            case 6:
                return "android-fullscreenstory-fullscreenstoryimpl";
            case 7:
                return "android-media-browser-service-mediabrowserservice";
            case 8:
                return "android-previewplayer-api";
            case 9:
                return "android-preview-previewapi";
            case 10:
                return "android-share-templates-entity";
            case 11:
                return "android-kids-playback-notification";
            case 12:
                return "test";
            default:
                throw null;
        }
    }

    public static /* synthetic */ byte d(int i) {
        if (i == 1) {
            return (byte) 0;
        }
        if (i == 2) {
            return (byte) 1;
        }
        if (i == 3) {
            return (byte) 2;
        }
        throw null;
    }

    public static /* synthetic */ String e(int i) {
        switch (i) {
            case 1:
                return "ADD_TO_CART";
            case 2:
                return "ADD_TO_WISHLIST";
            case 3:
                return "VIEW_CART";
            case 4:
                return "INITIATE_PURCHASE";
            case 5:
                return "ADD_PAYMENT_INFO";
            case 6:
                return "PURCHASE";
            case 7:
                return "SPEND_CREDITS";
            case 8:
                return "SEARCH";
            case 9:
                return "VIEW_ITEM";
            case 10:
                return "VIEW_ITEMS";
            case 11:
                return "RATE";
            case 12:
                return "SHARE";
            case 13:
                return "INITIATE_STREAM";
            case 14:
                return "COMPLETE_STREAM";
            case 15:
                return "COMPLETE_REGISTRATION";
            case 16:
                return "COMPLETE_TUTORIAL";
            case 17:
                return "ACHIEVE_LEVEL";
            case 18:
                return "UNLOCK_ACHIEVEMENT";
            case 19:
                return "INVITE";
            case 20:
                return "LOGIN";
            case 21:
                return "RESERVE";
            case 22:
                return "SUBSCRIBE";
            case 23:
                return "START_TRIAL";
            case 24:
                return "CLICK_AD";
            case 25:
                return "VIEW_AD";
            default:
                throw null;
        }
    }

    public static /* synthetic */ float f(int i) {
        if (i == 1) {
            return 1.6666666f;
        }
        if (i == 2) {
            return 0.0f;
        }
        throw null;
    }

    public static /* synthetic */ float g(int i) {
        if (i == 1) {
            return 1.6666666f;
        }
        if (i == 2) {
            return 2.5f;
        }
        throw null;
    }

    public static /* synthetic */ String h(int i) {
        if (i == 1) {
            return "top-tracks";
        }
        if (i == 2) {
            return "albums";
        }
        if (i == 3) {
            return "singles";
        }
        if (i == 4) {
            return "appears-on";
        }
        throw null;
    }

    public static /* synthetic */ String i(int i) {
        if (i == 1) {
            return "1:1";
        }
        if (i == 2) {
            return "16:9";
        }
        throw null;
    }

    public static /* synthetic */ String j(int i) {
        switch (i) {
            case 1:
                return "AirPlay";
            case 2:
                return "Bluetooth";
            case 3:
                return "Built-in";
            case 4:
                return "LineOut";
            case 5:
                return "CarProjected";
            case 6:
                return "Unknown";
            default:
                throw null;
        }
    }

    public static ClassCastException k(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static String l(StringBuilder sb, Object obj, String str) {
        sb.append(obj);
        sb.append(str);
        return sb.toString();
    }

    public static HashMap m(Class cls, rj7 rj7Var) {
        HashMap map = new HashMap();
        map.put(cls, rj7Var);
        return map;
    }

    public static Map n(HashMap map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }

    public static qim0 o(u85 u85Var, int i, nim0 nim0Var) {
        return too1.y(nim0Var, new bgc0(u85Var, i));
    }

    public static void p(int i, String str) {
        oon1.H(str + i);
    }

    public static /* synthetic */ String q(int i) {
        switch (i) {
            case 1:
                return "Load";
            case 2:
                return "ResolveCurationHandler";
            case 3:
                return "LoadSeeds";
            case 4:
                return "LoadCard";
            case 5:
                return "LoadCardEndpoint";
            case 6:
                return "LoadCardMetadata";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String r(int i) {
        if (i == 1) {
            return "TOKEN";
        }
        if (i == 2) {
            return "CODE";
        }
        if (i == 3) {
            return "NONE";
        }
        if (i == 4) {
            return "UNKNOWN";
        }
        throw null;
    }
}
