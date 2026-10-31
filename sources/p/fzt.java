package p;

import com.spotify.devicepredictability.devicesuggestionprovider.events.proto.DeviceSuggestionProvided;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fzt {
    public final t2j0 a;

    public fzt(t2j0 t2j0Var) {
        this.a = t2j0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static String b(int i) throws NoWhenBranchMatchedException {
        int iC = l1d.C(i);
        if (iC == 0) {
            return "LOW";
        }
        if (iC == 1) {
            return "MEDIUM";
        }
        if (iC == 2) {
            return "HIGH";
        }
        if (iC == 3) {
            return "UNKNOWN";
        }
        eg.o();
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static String c(f0u f0uVar) throws NoWhenBranchMatchedException {
        switch (f0uVar.ordinal()) {
            case 0:
                return "UNKNOWN";
            case 1:
                return "COMPUTER";
            case 2:
                return "TABLET";
            case 3:
                return "SMARTPHONE";
            case 4:
                return "SPEAKER";
            case 5:
                return "TV";
            case 6:
                return "AVR";
            case 7:
                return "STB";
            case 8:
                return "AUDIO_DONGLE";
            case 9:
                return "GAME_CONSOLE";
            case 10:
                return "CAST_VIDEO";
            case 11:
                return "CAST_AUDIO";
            case 12:
                return "AUTOMOBILE";
            case 13:
                return "SMARTWATCH";
            case 14:
                return "CHROMEBOOK";
            case 15:
                return "UNKNOWN_SPOTIFY_HW";
            case 16:
                return "HOMETHING";
            case 17:
                return "GLASSES";
            default:
                eg.o();
                return null;
        }
    }

    public final void a(bxt bxtVar, iwc1 iwc1Var, List list) {
        String str;
        wwt wwtVarO = DeviceSuggestionProvided.o();
        wwtVarO.t(bxtVar.e());
        int iOrdinal = iwc1Var.ordinal();
        if (iOrdinal == 0) {
            str = "WHERE_TO_PLAY";
        } else if (iOrdinal == 1) {
            str = "GOOGLE_INTENT_ENGINE";
        } else {
            if (iOrdinal != 2) {
                eg.o();
                return;
            }
            str = "BLE_PROXIMITY";
        }
        wwtVarO.u(str);
        wwtVarO.q(b(bxtVar.a()));
        wwtVarO.s(c(bxtVar.getType()));
        wwtVarO.r(bxtVar.d());
        wwtVarO.n(list);
        int iA = this.a.a(wwtVarO.build());
        if (iA != 1) {
            n57.s("Failed to publish DeviceSuggestionProvided event with result: ".concat(cy30.B(iA)));
        }
    }
}
