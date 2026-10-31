package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fyo implements jly0 {
    public final /* synthetic */ byte a;

    public /* synthetic */ fyo(byte b) {
        this.a = b;
    }

    public final Object get() {
        switch (this.a) {
            case 0:
                return new xh61();
            case 1:
                return new jyo((byte) 0);
            case 2:
                return new szo();
            case 3:
                return new j0p();
            case 4:
                return new r2p();
            case 5:
                return new c3p();
            case 6:
                return Optional.of(BehaviorSubject.g(Boolean.FALSE));
            case 7:
                return new hz5((byte) 4);
            case 8:
                return new k6p();
            case 9:
                return new wnr();
            case 10:
                return new s8p((byte) 0);
            case 11:
                return new s8p((byte) 1);
            case 12:
                return new t8p();
            case 13:
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                return new cbr0(new dbr0[]{new bn70(yon1.G1("AUDIOBOOK_HYDE_GATE", "audiobook/hyde/gate", 203, "audiobook"), nik1.K1, (nar0) null)}, false);
            case 14:
                return new jhp();
            case 15:
                return new kip();
            case 16:
                return new qkh0();
            case 17:
                return new q8l0();
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new zsp();
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new jtp();
            case 20:
                return new jyo((byte) 2);
            case 21:
                return new ttp();
            case 22:
                return new cxp();
            case 23:
                return new ixp();
            case 24:
                return new loc1();
            case 25:
                return new slc0(UUID.randomUUID().toString());
            case 26:
                return new blq();
            case 27:
                return new mmq();
            case 28:
                return new fma1((hfb) null, false, "spotify_preferences");
            default:
                return new lqq();
        }
    }
}
