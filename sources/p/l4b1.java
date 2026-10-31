package p;

import android.icu.text.UnicodeSet;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l4b1 extends hab0 implements Function0 {
    public static final l4b1 N0;
    public static final l4b1 O0;
    public static final l4b1 P0;
    public static final l4b1 Q0;
    public static final l4b1 R0;
    public static final l4b1 S0;
    public static final l4b1 T0;
    public static final l4b1 U0;
    public static final l4b1 V0;
    public static final l4b1 W0;
    public static final l4b1 X;
    public static final l4b1 X0;
    public static final l4b1 Y;
    public static final l4b1 Y0;
    public static final l4b1 Z;
    public static final l4b1 Z0;
    public static final l4b1 a1;
    public static final l4b1 b;
    public static final l4b1 b1;
    public static final l4b1 c;
    public static final l4b1 c1;
    public static final l4b1 d;
    public static final l4b1 d1;
    public static final l4b1 e;
    public static final l4b1 e1;
    public static final l4b1 f;
    public static final l4b1 g;
    public static final l4b1 h;
    public static final l4b1 i;
    public static final l4b1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 0;
        b = new l4b1(i2, (byte) 0);
        c = new l4b1(i2, (byte) 1);
        d = new l4b1(i2, (byte) 2);
        e = new l4b1(i2, (byte) 3);
        f = new l4b1(i2, (byte) 4);
        g = new l4b1(i2, (byte) 5);
        h = new l4b1(i2, (byte) 6);
        i = new l4b1(i2, (byte) 7);
        t = new l4b1(i2, (byte) 8);
        X = new l4b1(i2, (byte) 9);
        Y = new l4b1(i2, (byte) 10);
        Z = new l4b1(i2, (byte) 11);
        N0 = new l4b1(i2, (byte) 12);
        O0 = new l4b1(i2, (byte) 13);
        P0 = new l4b1(i2, (byte) 14);
        Q0 = new l4b1(i2, (byte) 15);
        R0 = new l4b1(i2, (byte) 16);
        S0 = new l4b1(i2, (byte) 17);
        T0 = new l4b1(i2, (byte) 18);
        U0 = new l4b1(i2, (byte) 19);
        V0 = new l4b1(i2, (byte) 20);
        W0 = new l4b1(i2, (byte) 21);
        X0 = new l4b1(i2, (byte) 22);
        Y0 = new l4b1(i2, (byte) 23);
        Z0 = new l4b1(i2, (byte) 24);
        a1 = new l4b1(i2, (byte) 25);
        b1 = new l4b1(i2, (byte) 26);
        c1 = new l4b1(i2, (byte) 27);
        d1 = new l4b1(i2, (byte) 28);
        e1 = new l4b1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l4b1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke() {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return new r36(chc1.a, (byte) 0);
            case 1:
                return new r36(chc1.a, (byte) 0);
            case 2:
                return new r36(chc1.a, (byte) 0);
            case 3:
                UnicodeSet unicodeSet = new UnicodeSet();
                unicodeSet.addAll(9, 10);
                unicodeSet.add(173);
                unicodeSet.add(13);
                unicodeSet.addAll(32, 126);
                unicodeSet.addAll(160, 172);
                unicodeSet.addAll(174, 311);
                unicodeSet.addAll(313, 328);
                unicodeSet.addAll(330, 382);
                unicodeSet.add(399);
                unicodeSet.addAll(416, 417);
                unicodeSet.addAll(431, 432);
                unicodeSet.addAll(461, 468);
                unicodeSet.addAll(486, 487);
                unicodeSet.addAll(500, 501);
                unicodeSet.addAll(506, 511);
                unicodeSet.addAll(536, 539);
                unicodeSet.addAll(550, 551);
                unicodeSet.addAll(562, 563);
                unicodeSet.add(567);
                unicodeSet.add(601);
                unicodeSet.add(700);
                unicodeSet.addAll(710, 711);
                unicodeSet.addAll(728, 733);
                unicodeSet.addAll(768, 772);
                unicodeSet.addAll(774, 780);
                unicodeSet.add(786);
                unicodeSet.add(795);
                unicodeSet.add(803);
                unicodeSet.addAll(806, 808);
                unicodeSet.addAll(821, 824);
                unicodeSet.add(3647);
                unicodeSet.addAll(7692, 7693);
                unicodeSet.addAll(7712, 7713);
                unicodeSet.addAll(7716, 7717);
                unicodeSet.addAll(7734, 7735);
                unicodeSet.addAll(7748, 7749);
                unicodeSet.addAll(7766, 7767);
                unicodeSet.addAll(7778, 7779);
                unicodeSet.addAll(7788, 7789);
                unicodeSet.addAll(7808, 7813);
                unicodeSet.addAll(7818, 7821);
                unicodeSet.addAll(7826, 7827);
                unicodeSet.add(7838);
                unicodeSet.addAll(7840, 7929);
                unicodeSet.addAll(8194, 8195);
                unicodeSet.addAll(8201, 8202);
                unicodeSet.addAll(8208, 8209);
                unicodeSet.addAll(8211, 8213);
                unicodeSet.addAll(8216, 8218);
                unicodeSet.addAll(8220, 8222);
                unicodeSet.addAll(8224, 8226);
                jup0.j(unicodeSet, 8230, 8232, 8233, 8239);
                unicodeSet.add(8240);
                unicodeSet.addAll(8242, 8243);
                unicodeSet.addAll(8249, 8250);
                unicodeSet.add(8260);
                unicodeSet.add(8304);
                unicodeSet.addAll(8308, 8313);
                unicodeSet.addAll(8320, 8329);
                jup0.j(unicodeSet, 8358, 8361, 8362, 8364);
                jup0.j(unicodeSet, 8372, 8376, 8378, 8381);
                unicodeSet.add(8383);
                unicodeSet.add(8467);
                unicodeSet.addAll(8470, 8471);
                unicodeSet.add(8482);
                unicodeSet.add(8486);
                unicodeSet.addAll(8544, 8553);
                unicodeSet.addAll(8556, 8559);
                unicodeSet.addAll(8592, 8595);
                unicodeSet.addAll(8598, 8601);
                unicodeSet.add(8706);
                unicodeSet.add(8710);
                jup0.j(unicodeSet, 8719, 8721, 8722, 8725);
                unicodeSet.add(8730);
                unicodeSet.add(8734);
                unicodeSet.add(8747);
                unicodeSet.add(8776);
                jup0.j(unicodeSet, 8800, 8804, 8805, 42889);
                unicodeSet.addAll(64257, 64258);
                return unicodeSet;
            case 4:
                return null;
            case 5:
                return new LinkedHashSet();
            case 6:
                return v8r.q(Boolean.FALSE);
            case 7:
                return "Exactly one title property must be populated.";
            case 8:
                return "Only one short title property may be populated.";
            case 9:
                return "Only one description property may be populated.";
            case 10:
                return "Only one note property may be populated.";
            case 11:
                WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 12:
                WorkRunners.MyThreadFactory myThreadFactory2 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 13:
                return b7x.a;
            case 14:
                return gio1.b(new ten("unknown"));
            case 15:
                return gio1.b(new uen("unknown"));
            case 16:
                r6h1 r6h1Var = r6h1.c;
                return new kwk0(new rrk0((byte) 3));
            case 17:
                return dia1.t;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new r36(aea.a, (byte) 0);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
            case 20:
            case 21:
                return rih1Var;
            case 22:
                return new r36(chc1.a, (byte) 0);
            case 23:
                return rih1Var;
            case 24:
                return new a1z("com.spotify.betamax.playerimpl.exo.model.SubtitleGenerationType", zpc1.values());
            case 25:
                return new a1z("com.spotify.betamax.playerimpl.exo.model.SubtitleSupplier", vqc1.values());
            case 26:
                return new a1z("com.spotify.betamax.playerimpl.exo.model.SubtitleType", hrc1.values());
            case 27:
                return hrc1.Companion.serializer();
            case 28:
                return vqc1.Companion.serializer();
            default:
                return zpc1.Companion.serializer();
        }
    }
}
