package p;

import com.spotify.allboarding.allboardingimpl.presentation.carousel.CarouselFragment;
import com.spotify.allboarding.allboardingimpl.presentation.contentpicker.ContentPickerFragment;
import com.spotify.allboarding.allboardingimpl.presentation.error.ErrorFragment;
import com.spotify.allboarding.contextualaudio.presentation.ContextualAudioFragment;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.blend.tastematch.BlendTasteMatchFragment;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class h21 implements ni30 {
    public final /* synthetic */ byte a;
    public final ynb0 b;

    public /* synthetic */ h21(ynb0 ynb0Var, byte b) {
        this.a = b;
        this.b = ynb0Var;
    }

    public final zf30 a() {
        switch (this.a) {
            case 0:
                return new b21(new g21(this, (byte) 0));
            case 1:
                return new jt1(new g21(this, (byte) 5));
            case 2:
                return new lx1(new g21(this, (byte) 6));
            case 3:
                return new h22(new g21(this, (byte) 7));
            case 4:
                return new n42(new g21(this, (byte) 8));
            case 5:
                return new fi2(new g21(this, (byte) 11));
            case 6:
                return new dj8(new vq6(this, (byte) 6));
            case 7:
                return new hn8(new vq6(this, (byte) 7));
            case 8:
                return new BlendTasteMatchFragment(new vq6(this, (byte) 24));
            case 9:
                return new zdb(new vq6(this, (byte) 25));
            case 10:
                return new CarouselFragment(new lpd(this, (byte) 1));
            case 11:
                return new k5e(new lpd(this, (byte) 2));
            case 12:
                return new y7e(new lpd(this, (byte) 3));
            case 13:
                return new nwe(new lpd(this, (byte) 7));
            case 14:
                return new pyf(new lpd(this, (byte) 8));
            case 15:
                return new kph(new lpd(this, (byte) 16));
            case 16:
                return new auk(new lpd(this, (byte) 20));
            case 17:
                return new p2l(new lpd(this, (byte) 21));
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new w2l(new lpd(this, (byte) 22));
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new ContentPickerFragment(new lpd(this, (byte) 24));
            case 20:
                return new rfm(new lpd(this, (byte) 25));
            case 21:
                return new ContextualAudioFragment(new lpd(this, (byte) 27));
            case 22:
                return new odu(new thn(this, (byte) 12));
            case 23:
                return new mpv(new thn(this, (byte) 19));
            case 24:
                return new w8w(new thn(this, (byte) 21));
            case 25:
                return new evw(new thn(this, (byte) 23));
            case 26:
                return new mxw(new thn(this, (byte) 24));
            case 27:
                return new b0y(new thn(this, (byte) 27));
            case 28:
                return new j3y(new thn(this, (byte) 29));
            default:
                return new ErrorFragment(new nay(this, (byte) 5));
        }
    }
}
