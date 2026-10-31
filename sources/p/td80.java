package p;

import androidx.media3.exoplayer.ExoPlayer;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class td80 extends hab0 implements iu30 {
    public static final td80 N0;
    public static final td80 O0;
    public static final td80 P0;
    public static final td80 Q0;
    public static final td80 R0;
    public static final td80 S0;
    public static final td80 T0;
    public static final td80 U0;
    public static final td80 V0;
    public static final td80 W0;
    public static final td80 X;
    public static final td80 X0;
    public static final td80 Y;
    public static final td80 Y0;
    public static final td80 Z;
    public static final td80 Z0;
    public static final td80 a1;
    public static final td80 b;
    public static final td80 b1;
    public static final td80 c;
    public static final td80 c1;
    public static final td80 d;
    public static final td80 d1;
    public static final td80 e;
    public static final td80 e1;
    public static final td80 f;
    public static final td80 g;
    public static final td80 h;
    public static final td80 i;
    public static final td80 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new td80(i2, (byte) 0);
        c = new td80(i2, (byte) 1);
        d = new td80(i2, (byte) 2);
        e = new td80(i2, (byte) 3);
        f = new td80(i2, (byte) 4);
        g = new td80(i2, (byte) 5);
        h = new td80(i2, (byte) 6);
        i = new td80(i2, (byte) 7);
        t = new td80(i2, (byte) 8);
        X = new td80(i2, (byte) 9);
        Y = new td80(i2, (byte) 10);
        Z = new td80(i2, (byte) 11);
        N0 = new td80(i2, (byte) 12);
        O0 = new td80(i2, (byte) 13);
        P0 = new td80(i2, (byte) 14);
        Q0 = new td80(i2, (byte) 15);
        R0 = new td80(i2, (byte) 16);
        S0 = new td80(i2, (byte) 17);
        T0 = new td80(i2, (byte) 18);
        U0 = new td80(i2, (byte) 19);
        V0 = new td80(i2, (byte) 20);
        W0 = new td80(i2, (byte) 21);
        X0 = new td80(i2, (byte) 22);
        Y0 = new td80(i2, (byte) 23);
        Z0 = new td80(i2, (byte) 24);
        a1 = new td80(i2, (byte) 25);
        b1 = new td80(i2, (byte) 26);
        c1 = new td80(i2, (byte) 27);
        d1 = new td80(i2, (byte) 28);
        e1 = new td80(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ td80(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x0039  */
    public final Object invoke(Object obj) {
        byte b2 = this.a;
        g5u0 g5u0Var = null;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return ((od80) obj).c;
            case 1:
                return obj;
            case 2:
                return Boolean.valueOf(obj instanceof go70);
            case 3:
                return ((go70) obj).a;
            case 4:
                return rih1Var;
            case 5:
                ((qtr) obj).b(new kr(5, (lnm) null, (byte) 21));
                return rih1Var;
            case 6:
                return ((hl80) obj).a.getEntityUri();
            case 7:
                return ((hl80) obj).a.getEntityUri();
            case 8:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 9:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 10:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 11:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 12:
                return rih1Var;
            case 13:
                return rih1Var;
            case 14:
                return rih1Var;
            case 15:
                return rih1Var;
            case 16:
                b261.B((e261) obj, "help-row");
                return rih1Var;
            case 17:
                b261.x((e261) obj, 0);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                w7x w7xVar = w7x.a;
                z6x z6xVar = z6x.a;
                return new bn80("", z6xVar, "", z6xVar, true, false, w7xVar, n8p1.t("", z6xVar, z6xVar));
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return Boolean.valueOf(nz80.a.contains(new toa0(mno1.d(((cpa0) obj).a.getKeyCode()))));
            case 20:
                return mno1.h(new mmr0[]{new mmr0("campfire_interceptor_model", (pnb1) obj)});
            case 21:
                j9a j9aVar = (ExoPlayer) obj;
                sqe1 sqe1VarD0 = j9aVar.d0();
                int iQ0 = j9aVar.Q0();
                if (sqe1VarD0.p() || iQ0 >= sqe1VarD0.o()) {
                    return null;
                }
                return sqe1VarD0.n(iQ0, new oqe1(), 0L);
            case 22:
                j9a j9aVar2 = (ExoPlayer) obj;
                long duration = -1;
                if (!j9aVar2.e1() && j9aVar2.getDuration() != -9223372036854775807L) {
                    duration = j9aVar2.getDuration();
                }
                return Long.valueOf(duration);
            case 23:
                return Boolean.valueOf(((ExoPlayer) obj).e1());
            case 24:
                ((ExoPlayer) obj).M(false);
                return rih1Var;
            case 25:
                return Boolean.valueOf(((ExoPlayer) obj).q());
            case 26:
                return Float.valueOf(((ExoPlayer) obj).l().a);
            case 27:
                int playbackState = ((ExoPlayer) obj).getPlaybackState();
                for (g5u0 g5u0Var2 : g5u0.values()) {
                    if (g5u0Var2.a == playbackState) {
                        g5u0Var = g5u0Var2;
                        if (g5u0Var == null) {
                            return g5u0.IDLE;
                        }
                        return g5u0Var;
                    }
                }
                if (g5u0Var == null) {
                    return g5u0.IDLE;
                }
                return g5u0Var;
            case 28:
                return Boolean.valueOf(((ExoPlayer) obj).getRepeatMode() != 0);
            default:
                ((ExoPlayer) obj).M(true);
                return rih1Var;
        }
    }
}
