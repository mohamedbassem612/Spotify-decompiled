package p;

import com.spotify.campfire.chatcontentpickerpage.search.domain.EntityType;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ijz0 extends hab0 implements Function0 {
    public static final ijz0 N0;
    public static final ijz0 O0;
    public static final ijz0 P0;
    public static final ijz0 Q0;
    public static final ijz0 R0;
    public static final ijz0 S0;
    public static final ijz0 T0;
    public static final ijz0 U0;
    public static final ijz0 V0;
    public static final ijz0 W0;
    public static final ijz0 X;
    public static final ijz0 X0;
    public static final ijz0 Y;
    public static final ijz0 Y0;
    public static final ijz0 Z;
    public static final ijz0 Z0;
    public static final ijz0 a1;
    public static final ijz0 b;
    public static final ijz0 b1;
    public static final ijz0 c;
    public static final ijz0 c1;
    public static final ijz0 d;
    public static final ijz0 d1;
    public static final ijz0 e;
    public static final ijz0 e1;
    public static final ijz0 f;
    public static final ijz0 g;
    public static final ijz0 h;
    public static final ijz0 i;
    public static final ijz0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 0;
        b = new ijz0(i2, (byte) 0);
        c = new ijz0(i2, (byte) 1);
        d = new ijz0(i2, (byte) 2);
        e = new ijz0(i2, (byte) 3);
        f = new ijz0(i2, (byte) 4);
        g = new ijz0(i2, (byte) 5);
        h = new ijz0(i2, (byte) 6);
        i = new ijz0(i2, (byte) 7);
        t = new ijz0(i2, (byte) 8);
        X = new ijz0(i2, (byte) 9);
        Y = new ijz0(i2, (byte) 10);
        Z = new ijz0(i2, (byte) 11);
        N0 = new ijz0(i2, (byte) 12);
        O0 = new ijz0(i2, (byte) 13);
        P0 = new ijz0(i2, (byte) 14);
        Q0 = new ijz0(i2, (byte) 15);
        R0 = new ijz0(i2, (byte) 16);
        S0 = new ijz0(i2, (byte) 17);
        T0 = new ijz0(i2, (byte) 18);
        U0 = new ijz0(i2, (byte) 19);
        V0 = new ijz0(i2, (byte) 20);
        W0 = new ijz0(i2, (byte) 21);
        X0 = new ijz0(i2, (byte) 22);
        Y0 = new ijz0(i2, (byte) 23);
        Z0 = new ijz0(i2, (byte) 24);
        a1 = new ijz0(i2, (byte) 25);
        b1 = new ijz0(i2, (byte) 26);
        c1 = new ijz0(i2, (byte) 27);
        d1 = new ijz0(i2, (byte) 28);
        e1 = new ijz0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ijz0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke() {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return nik1.b2.a;
            case 1:
                throw new IllegalStateException("LocalQuizTheme not provided. Wrap your content with CompositionLocalProvider.");
            case 2:
                return slz0.Companion.serializer();
            case 3:
                return new a1z("com.spotify.audiobookpremium.cappingdatasource.models.dto.QuotaType", slz0.values());
            case 4:
                chc1 chc1Var = chc1.a;
                return new r36(new nlc0(chc1Var, chc1Var), (byte) 0);
            case 5:
                r6h1 r6h1Var = r6h1.c;
                return new vcl0();
            case 6:
                return v8r.q(Boolean.TRUE);
            case 7:
            case 8:
                return rih1Var;
            case 9:
                return fc11.v("com.spotify.betamax.contextplayercoordinatorimpl.cosmos.Reason", sg01.values(), new String[]{"finished", "unplayable"}, new Annotation[][]{null, null});
            case 10:
            case 11:
            case 12:
                return rih1Var;
            case 13:
                return new a1z("com.spotify.campfire.chatcontentpickerpage.search.domain.EntityType", EntityType.values());
            case 14:
                chc1 chc1Var2 = chc1.a;
                return new nlc0(chc1Var2, chc1Var2);
            case 15:
                return new r36(ro01.a, (byte) 0);
            case 16:
                return new r36(chc1.a, (byte) 0);
            case 17:
                return new r36(chc1.a, (byte) 1);
            case 18:
                return new r36(chc1.a, (byte) 1);
            case 19:
                return new r36(w411.a, (byte) 0);
            case 20:
                return new r36(l411.a, (byte) 0);
            case 21:
                return new r36(f411.a, (byte) 0);
            case 22:
                return v8r.q(Boolean.FALSE);
            case 23:
                a3i1 a3i1Var = new a3i1();
                for (t2i1 t2i1Var : nj11.b) {
                    a3i1Var.b(t2i1Var.a, t2i1Var.b);
                }
                return a3i1Var;
            case 24:
                return new r36(chc1.a, (byte) 0);
            case 25:
                return new tgm((String) null, false, false, false, false, false, false, (yh10) null, false, false, 0, false, false, false, false, false, (iu30) null, false, false, (g371) null, (c821) null, false, (String) null, (iu30) null, (p860) null, (mgo0) null, false, false, -11, 1);
            case 26:
            case 27:
            case 28:
            default:
                return rih1Var;
        }
    }
}
