package p;

import com.spotify.messages.BetamaxPlaybackSession;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jgh0 extends igh0 {
    public final int d;

    /* JADX WARN: Illegal instructions before constructor call */
    public jgh0(int i) {
        int i2 = 2131233605;
        switch (i) {
            case BetamaxPlaybackSession.KBYTES_FROM_CACHE_FIELD_NUMBER /* 50 */:
                i2 = 2131233600;
                break;
            case 60:
                i2 = 2131233601;
                break;
            case 70:
                i2 = 2131233602;
                break;
            case 80:
                i2 = 2131233603;
                break;
            case 90:
                i2 = 2131233604;
                break;
            case 110:
                i2 = 2131233606;
                break;
            case 120:
                i2 = 2131233607;
                break;
            case 130:
                i2 = 2131233608;
                break;
            case 140:
                i2 = 2131233609;
                break;
            case 150:
                i2 = 2131233610;
                break;
            case 160:
                i2 = 2131233611;
                break;
            case 170:
                i2 = 2131233612;
                break;
            case 180:
                i2 = 2131233613;
                break;
            case 190:
                i2 = 2131233614;
                break;
            case 200:
                i2 = 2131233615;
                break;
            case 210:
                i2 = 2131233616;
                break;
            case 220:
                i2 = 2131233617;
                break;
            case 230:
                i2 = 2131233618;
                break;
            case 240:
                i2 = 2131233619;
                break;
            case 250:
                i2 = 2131233620;
                break;
            case 260:
                i2 = 2131233621;
                break;
            case 270:
                i2 = 2131233622;
                break;
            case 280:
                i2 = 2131233623;
                break;
            case 290:
                i2 = 2131233624;
                break;
            case 300:
                i2 = 2131233625;
                break;
            case 310:
                i2 = 2131233626;
                break;
            case 320:
                i2 = 2131233627;
                break;
            case 330:
                i2 = 2131233628;
                break;
            case 340:
                i2 = 2131233629;
                break;
            case 350:
                i2 = 2131233630;
                break;
        }
        super(i2, 2131953522, "NEXT_PLAYBACK_SPEED");
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jgh0) && this.d == ((jgh0) obj).d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d);
    }
}
