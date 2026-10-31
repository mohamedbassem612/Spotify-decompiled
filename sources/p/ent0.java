package p;

import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ent0 extends hab0 implements iu30 {
    public static final ent0 N0;
    public static final ent0 O0;
    public static final ent0 P0;
    public static final ent0 Q0;
    public static final ent0 R0;
    public static final ent0 S0;
    public static final ent0 T0;
    public static final ent0 U0;
    public static final ent0 V0;
    public static final ent0 W0;
    public static final ent0 X;
    public static final ent0 X0;
    public static final ent0 Y;
    public static final ent0 Y0;
    public static final ent0 Z;
    public static final ent0 Z0;
    public static final ent0 a1;
    public static final ent0 b;
    public static final ent0 b1;
    public static final ent0 c;
    public static final ent0 c1;
    public static final ent0 d;
    public static final ent0 d1;
    public static final ent0 e;
    public static final ent0 e1;
    public static final ent0 f;
    public static final ent0 g;
    public static final ent0 h;
    public static final ent0 i;
    public static final ent0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new ent0(i2, (byte) 0);
        c = new ent0(i2, (byte) 1);
        d = new ent0(i2, (byte) 2);
        e = new ent0(i2, (byte) 3);
        f = new ent0(i2, (byte) 4);
        g = new ent0(i2, (byte) 5);
        h = new ent0(i2, (byte) 6);
        i = new ent0(i2, (byte) 7);
        t = new ent0(i2, (byte) 8);
        X = new ent0(i2, (byte) 9);
        Y = new ent0(i2, (byte) 10);
        Z = new ent0(i2, (byte) 11);
        N0 = new ent0(i2, (byte) 12);
        O0 = new ent0(i2, (byte) 13);
        P0 = new ent0(i2, (byte) 14);
        Q0 = new ent0(i2, (byte) 15);
        R0 = new ent0(i2, (byte) 16);
        S0 = new ent0(i2, (byte) 17);
        T0 = new ent0(i2, (byte) 18);
        U0 = new ent0(i2, (byte) 19);
        V0 = new ent0(i2, (byte) 20);
        W0 = new ent0(i2, (byte) 21);
        X0 = new ent0(i2, (byte) 22);
        Y0 = new ent0(i2, (byte) 23);
        Z0 = new ent0(i2, (byte) 24);
        a1 = new ent0(i2, (byte) 25);
        b1 = new ent0(i2, (byte) 26);
        c1 = new ent0(i2, (byte) 27);
        d1 = new ent0(i2, (byte) 28);
        e1 = new ent0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ent0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        switch (b2) {
            case 0:
                return Collections.singletonMap(1, Collections.singleton(((dmt0) obj).c.a));
            case 1:
                return Boolean.valueOf(obj instanceof ont0);
            case 2:
                if (obj != null) {
                    return (ont0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.playlinkcardtrait.PlayLinkCardTrait");
                return null;
            case 3:
                return ((lnt0) obj).a;
            case 4:
                return (ont0) obj;
            case 5:
                return ((rnt0) obj).a();
            case 6:
                return Collections.singletonMap(1, Collections.singleton(((emt0) obj).c.a));
            case 7:
                return new p1l0((i3l0) obj);
            case 8:
                return new p1l0((i3l0) obj);
            case 9:
                return new iot0(((hot0) obj).c, null, false);
            case 10:
                ipt0 ipt0Var = ((jpt0) obj).a;
                if (u890.j(ipt0Var, gpt0.a)) {
                    ipt0Var = fpt0.a;
                }
                return new ept0("", false, ipt0Var, 48);
            case 11:
                return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
            case 12:
                kqt0 kqt0Var = (kqt0) obj;
                return new lqt0(kqt0Var.a, kqt0Var.b, "", kqt0Var.c);
            case 13:
                ((qtr) obj).b(new eri0(5, (lnm) null, (byte) 6));
                return rih1Var;
            case 14:
                return new tqt0((sqt0) obj, new hix0(false, 0L));
            case 15:
                h1q0 h1q0Var = (j1q0) obj;
                if (h1q0Var instanceof e1q0) {
                    return new loa0(((e1q0) h1q0Var).a);
                }
                if (h1q0Var instanceof h1q0) {
                    h1q0 h1q0Var2 = h1q0Var;
                    return new noa0(h1q0Var2.a, h1q0Var2.b, h1q0Var2.c);
                }
                if (h1q0Var instanceof g1q0) {
                    return new moa0(((g1q0) h1q0Var).a);
                }
                if (h1q0Var instanceof i1q0) {
                    return null;
                }
                eg.o();
                return null;
            case 16:
                if (((j1q0) obj) instanceof f1q0) {
                    return rih1Var;
                }
                return null;
            case 17:
                if (!(obj instanceof cob1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 18:
                if (obj instanceof rih1) {
                    return null;
                }
                return (cob1) obj;
            case 19:
                if (!(obj instanceof umo) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 20:
                if (obj instanceof rih1) {
                    return null;
                }
                return (umo) obj;
            case 21:
                return nvt0.a;
            case 22:
                return ((lvt0) obj).a;
            case 23:
                return ((lvt0) obj).a;
            case 24:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 25:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 26:
                return Boolean.valueOf(obj instanceof jo70);
            case 27:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 28:
                return (String) obj;
            default:
                return (String) obj;
        }
    }
}
