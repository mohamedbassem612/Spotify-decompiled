package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bp30 extends hab0 implements vu30 {
    public static final bp30 N0;
    public static final bp30 O0;
    public static final bp30 P0;
    public static final bp30 Q0;
    public static final bp30 R0;
    public static final bp30 S0;
    public static final bp30 T0;
    public static final bp30 U0;
    public static final bp30 V0;
    public static final bp30 W0;
    public static final bp30 X;
    public static final bp30 X0;
    public static final bp30 Y;
    public static final bp30 Y0;
    public static final bp30 Z;
    public static final bp30 Z0;
    public static final bp30 a1;
    public static final bp30 b;
    public static final bp30 b1;
    public static final bp30 c;
    public static final bp30 c1;
    public static final bp30 d;
    public static final bp30 d1;
    public static final bp30 e;
    public static final bp30 e1;
    public static final bp30 f;
    public static final bp30 g;
    public static final bp30 h;
    public static final bp30 i;
    public static final bp30 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new bp30(i2, (byte) 0);
        c = new bp30(i2, (byte) 1);
        d = new bp30(i2, (byte) 2);
        e = new bp30(i2, (byte) 3);
        f = new bp30(i2, (byte) 4);
        g = new bp30(i2, (byte) 5);
        h = new bp30(i2, (byte) 6);
        i = new bp30(i2, (byte) 7);
        t = new bp30(i2, (byte) 8);
        X = new bp30(i2, (byte) 9);
        Y = new bp30(i2, (byte) 10);
        Z = new bp30(i2, (byte) 11);
        N0 = new bp30(i2, (byte) 12);
        O0 = new bp30(i2, (byte) 13);
        P0 = new bp30(i2, (byte) 14);
        Q0 = new bp30(i2, (byte) 15);
        R0 = new bp30(i2, (byte) 16);
        S0 = new bp30(i2, (byte) 17);
        T0 = new bp30(i2, (byte) 18);
        U0 = new bp30(i2, (byte) 19);
        V0 = new bp30(i2, (byte) 20);
        W0 = new bp30(i2, (byte) 21);
        X0 = new bp30(i2, (byte) 22);
        Y0 = new bp30(i2, (byte) 23);
        Z0 = new bp30(i2, (byte) 24);
        a1 = new bp30(i2, (byte) 25);
        b1 = new bp30(i2, (byte) 26);
        c1 = new bp30(i2, (byte) 27);
        d1 = new bp30(i2, (byte) 28);
        e1 = new bp30(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bp30(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj, Object obj2) {
        String str;
        mq70 mq70Var;
        up70 up70VarA;
        mq70 mq70Var2;
        up70 up70VarA2;
        zt30 zt30VarN;
        mq70 mq70Var3;
        up70 up70VarA3;
        String str2 = null;
        switch (this.a) {
            case 0:
                zo30 zo30Var = (zo30) obj;
                return new ap30(zo30Var.a, zo30Var.b, zo30Var.c);
            case 1:
                return null;
            case 2:
                return First.c((fq30) obj2, Collections.singleton(new vp30((mp30) obj)));
            case 3:
                return Next.j();
            case 4:
                return First.b((oq30) obj2);
            case 5:
                vq30 vq30Var = (vq30) obj2;
                return new yq30(((xq30) obj).a, vq30Var.b, vq30Var.c, vq30Var.a);
            case 6:
                jo70 jo70Var = (jo70) obj;
                xkk1 xkk1Var = (xkk1) obj2;
                vp70 vp70Var = vp70.d;
                String str3 = (xkk1Var == null || (mq70Var2 = xkk1Var.b) == null || (up70VarA2 = mq70Var2.a(vp70Var)) == null) ? null : up70VarA2.a.a;
                if (xkk1Var != null && (mq70Var = xkk1Var.a) != null && (up70VarA = mq70Var.a(vp70Var)) != null) {
                    str2 = up70VarA.a.a;
                }
                if (jo70Var == null || (str = jo70Var.a) == null) {
                    str = "";
                }
                if (str3 != null) {
                    str2 = str3;
                }
                return new vq30(str, str2, str3 != null);
            case 7:
                return new tr30(((ur30) obj).a, (s2p0) obj2);
            case 8:
                vt30 vt30Var = (vt30) obj;
                wt30 wt30Var = (au30) obj2;
                int i2 = vt30Var.a;
                if (wt30Var instanceof zt30) {
                    zt30VarN = zt30.n((zt30) wt30Var, i2, null, 126);
                } else if (wt30Var instanceof wt30) {
                    zt30VarN = wt30.n(wt30Var, i2, (wkt) null, 126);
                } else {
                    if (!(wt30Var instanceof yt30)) {
                        eg.o();
                        return null;
                    }
                    zt30VarN = yt30.n((yt30) wt30Var, vt30Var.a, (wkt) null, (String) null, (String) null, (String) null, 0, (llw0) null, (List) null, (cuu0) null, 16382);
                }
                return Next.h(zt30VarN);
            case 9:
                yt30 yt30Var = (au30) obj2;
                if (yt30Var instanceof yt30) {
                    return First.c(yt30Var, r2p1.o(yt30Var.N0, ht30.a, (on71) null));
                }
                if (yt30Var instanceof wt30) {
                    return First.b(new zt30(yt30Var.j(), yt30Var.h(), yt30Var.a(), yt30Var.k(), null, yt30Var.g(), yt30Var.b()));
                }
                if (yt30Var instanceof zt30) {
                    return First.b(yt30Var);
                }
                eg.o();
                return null;
            case 10:
                f040 f040Var = (f040) obj;
                return Next.h(g040.a((g040) obj2, f040Var.a, f040Var.b, f040Var.c, (upf) null, (qtg) null, f040Var.d, f040Var.e, f040Var.f, 24));
            case 11:
                f040 f040Var2 = (f040) obj;
                g040 g040Var = (g040) obj2;
                sqe sqeVar = f040Var2.a;
                return First.c(g040.a(g040Var, sqeVar, f040Var2.b, f040Var2.c, (upf) null, (qtg) null, f040Var2.d, f040Var2.e, f040Var2.f, 24), sqeVar instanceof ez30 ? Collections.singleton(pz30.c) : w7x.a);
            case 12:
                return (s140) obj2;
            case 13:
                return (e340) obj;
            case 14:
                long j = ((yr80) obj).a;
                long j2 = ((yr80) obj2).a;
                return irn1.j0();
            case 15:
                return new m540((c98) obj, (xkk1) obj2);
            case 16:
                return new n540((w281) obj, (xkk1) obj2);
            case 17:
                return eso1.z((q640) obj2);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                w281 w281Var = (w281) obj;
                xkk1 xkk1Var2 = (xkk1) obj2;
                boolean z = w281Var != null && (w281Var.c ^ true);
                if (xkk1Var2 != null && (mq70Var3 = xkk1Var2.a) != null && (up70VarA3 = mq70Var3.a(vp70.b)) != null) {
                    str2 = up70VarA3.a.a;
                }
                return new g640(z, str2);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return eso1.z((q640) obj2);
            case 20:
                return null;
            case 21:
                return null;
            case 22:
                return null;
            case 23:
                yd40 yd40Var = (yd40) obj;
                return Next.h(zd40.a((zd40) obj2, false, yd40Var.a, yd40Var.b, false, 9));
            case 24:
                return new u7h(((afx) obj).a.b.a());
            case 25:
                mg40 mg40Var = (mg40) obj;
                return new ng40(mg40Var.a, mg40Var.b, mg40Var.c);
            case 26:
                bm50 bm50Var = (bm50) obj;
                return Next.h(new cm50(bm50Var.a, bm50Var.e, bm50Var.b, bm50Var.c, false, bm50Var.d));
            case 27:
                return Next.h(cn50.a((cn50) obj2, 0, 0, false, 14));
            case 28:
                return First.b(cn50.a((cn50) obj2, 0, 0, false, 14));
            default:
                return Next.j();
        }
    }
}
