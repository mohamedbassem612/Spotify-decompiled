package p;

import com.spotify.scrollsita.v1.Section;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zdg1 extends hab0 implements iu30 {
    public static final zdg1 N0;
    public static final zdg1 O0;
    public static final zdg1 P0;
    public static final zdg1 Q0;
    public static final zdg1 R0;
    public static final zdg1 S0;
    public static final zdg1 T0;
    public static final zdg1 U0;
    public static final zdg1 V0;
    public static final zdg1 W0;
    public static final zdg1 X;
    public static final zdg1 X0;
    public static final zdg1 Y;
    public static final zdg1 Y0;
    public static final zdg1 Z;
    public static final zdg1 Z0;
    public static final zdg1 a1;
    public static final zdg1 b;
    public static final zdg1 b1;
    public static final zdg1 c;
    public static final zdg1 c1;
    public static final zdg1 d;
    public static final zdg1 d1;
    public static final zdg1 e;
    public static final zdg1 e1;
    public static final zdg1 f;
    public static final zdg1 g;
    public static final zdg1 h;
    public static final zdg1 i;
    public static final zdg1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new zdg1(i2, (byte) 0);
        c = new zdg1(i2, (byte) 1);
        d = new zdg1(i2, (byte) 2);
        e = new zdg1(i2, (byte) 3);
        f = new zdg1(i2, (byte) 4);
        g = new zdg1(i2, (byte) 5);
        h = new zdg1(i2, (byte) 6);
        i = new zdg1(i2, (byte) 7);
        t = new zdg1(i2, (byte) 8);
        X = new zdg1(i2, (byte) 9);
        Y = new zdg1(i2, (byte) 10);
        Z = new zdg1(i2, (byte) 11);
        N0 = new zdg1(i2, (byte) 12);
        O0 = new zdg1(i2, (byte) 13);
        P0 = new zdg1(i2, (byte) 14);
        Q0 = new zdg1(i2, (byte) 15);
        R0 = new zdg1(i2, (byte) 16);
        S0 = new zdg1(i2, (byte) 17);
        T0 = new zdg1(i2, (byte) 18);
        U0 = new zdg1(i2, (byte) 19);
        V0 = new zdg1(i2, (byte) 20);
        W0 = new zdg1(i2, (byte) 21);
        X0 = new zdg1(i2, (byte) 22);
        Y0 = new zdg1(i2, (byte) 23);
        Z0 = new zdg1(i2, (byte) 24);
        a1 = new zdg1(i2, (byte) 25);
        b1 = new zdg1(i2, (byte) 26);
        c1 = new zdg1(i2, (byte) 27);
        d1 = new zdg1(i2, (byte) 28);
        e1 = new zdg1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zdg1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                if (obj != null) {
                    return (k8g1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.transcript.model.Transcript");
                return null;
            case 1:
                return Boolean.valueOf(obj instanceof k8g1);
            case 2:
                if (obj != null) {
                    return (k8g1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.transcript.model.Transcript");
                return null;
            case 3:
                reg1 reg1Var = (reg1) obj;
                return new qeg1(reg1Var.a, reg1Var.b, reg1Var.c);
            case 4:
                return Integer.valueOf(obj != null ? obj.hashCode() : 0);
            case 5:
                ((Number) obj).intValue();
                return null;
            case 6:
                return ((l7e0) obj).a();
            case 7:
                return Boolean.valueOf(((l7e0) obj).a().length() > 0);
            case 8:
                return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
            case 9:
                return new okg1((lhg1) null, "", false);
            case 10:
                return ihc1.Z0(((nkg1) obj).a, "?");
            case 11:
                return Boolean.valueOf(obj instanceof mig1);
            case 12:
                if (obj != null) {
                    return (mig1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.transitiondata.TransitionData");
                return null;
            case 13:
                return mno1.h(new mmr0[]{new mmr0("TRANSITION_SUBMIT_PAGE_MODEL", (bmg1) obj)});
            case 14:
                b261.t((e261) obj, 0);
                return rih1Var;
            case 15:
                b261.c((e261) obj);
                return rih1Var;
            case 16:
                return Integer.valueOf(((Number) obj).intValue());
            case 17:
                return Integer.valueOf(((Number) obj).intValue());
            case 18:
                return new vmg1(false, null);
            case 19:
                return ((umg1) obj).a;
            case 20:
                return new wmg1((ddz) obj);
            case 21:
                return Boolean.valueOf(obj instanceof ddz);
            case 22:
                if (obj != null) {
                    return (ddz) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.episodetranscripts.EpisodeTranscripts");
                return null;
            case 23:
                return Boolean.valueOf(obj instanceof k8g1);
            case 24:
                if (obj != null) {
                    return (k8g1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.transcript.model.Transcript");
                return null;
            case 25:
                return (ga01) obj;
            case 26:
                return (k8g1) obj;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new jha1((mr20) obj, (byte) 21);
            case 28:
                return (List) obj;
            default:
                return tpg1.a;
        }
    }
}
