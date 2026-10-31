package p;

import com.spotify.cosmos.cosmosmodels.ContextTrackSerializer;
import com.spotify.cosmos.cosmosmodels.PlayOriginSerializer;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uyf1 extends hab0 implements iu30 {
    public static final uyf1 N0;
    public static final uyf1 O0;
    public static final uyf1 P0;
    public static final uyf1 Q0;
    public static final uyf1 R0;
    public static final uyf1 S0;
    public static final uyf1 T0;
    public static final uyf1 U0;
    public static final uyf1 V0;
    public static final uyf1 W0;
    public static final uyf1 X;
    public static final uyf1 X0;
    public static final uyf1 Y;
    public static final uyf1 Y0;
    public static final uyf1 Z;
    public static final uyf1 Z0;
    public static final uyf1 a1;
    public static final uyf1 b;
    public static final uyf1 b1;
    public static final uyf1 c;
    public static final uyf1 c1;
    public static final uyf1 d;
    public static final uyf1 d1;
    public static final uyf1 e;
    public static final uyf1 e1;
    public static final uyf1 f;
    public static final uyf1 g;
    public static final uyf1 h;
    public static final uyf1 i;
    public static final uyf1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new uyf1(i2, (byte) 0);
        c = new uyf1(i2, (byte) 1);
        d = new uyf1(i2, (byte) 2);
        e = new uyf1(i2, (byte) 3);
        f = new uyf1(i2, (byte) 4);
        g = new uyf1(i2, (byte) 5);
        h = new uyf1(i2, (byte) 6);
        i = new uyf1(i2, (byte) 7);
        t = new uyf1(i2, (byte) 8);
        X = new uyf1(i2, (byte) 9);
        Y = new uyf1(i2, (byte) 10);
        Z = new uyf1(i2, (byte) 11);
        N0 = new uyf1(i2, (byte) 12);
        O0 = new uyf1(i2, (byte) 13);
        P0 = new uyf1(i2, (byte) 14);
        Q0 = new uyf1(i2, (byte) 15);
        R0 = new uyf1(i2, (byte) 16);
        S0 = new uyf1(i2, (byte) 17);
        T0 = new uyf1(i2, (byte) 18);
        U0 = new uyf1(i2, (byte) 19);
        V0 = new uyf1(i2, (byte) 20);
        W0 = new uyf1(i2, (byte) 21);
        X0 = new uyf1(i2, (byte) 22);
        Y0 = new uyf1(i2, (byte) 23);
        Z0 = new uyf1(i2, (byte) 24);
        a1 = new uyf1(i2, (byte) 25);
        b1 = new uyf1(i2, (byte) 26);
        c1 = new uyf1(i2, (byte) 27);
        d1 = new uyf1(i2, (byte) 28);
        e1 = new uyf1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uyf1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:77:0x01eb  */
    public final Object invoke(Object obj) {
        xjy xjyVar;
        xjy vjyVar;
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return Boolean.valueOf((obj instanceof jo70) || (obj instanceof rih1));
            case 1:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 2:
                return Boolean.valueOf((obj instanceof hll) || (obj instanceof rih1));
            case 3:
                if (obj instanceof rih1) {
                    return null;
                }
                return (hll) obj;
            case 4:
                return Boolean.valueOf((obj instanceof a7q0) || (obj instanceof rih1));
            case 5:
                if (obj instanceof rih1) {
                    return null;
                }
                return (a7q0) obj;
            case 6:
                return Boolean.valueOf((obj instanceof zoy0) || (obj instanceof rih1));
            case 7:
                if (obj instanceof rih1) {
                    return null;
                }
                return (zoy0) obj;
            case 8:
                return Boolean.valueOf((obj instanceof qtt0) || (obj instanceof rih1));
            case 9:
                gyf1 gyf1Var = (gyf1) obj;
                return new lyf1(gyf1Var.c, gyf1Var.e, gyf1Var.f, dyf1.i, gyf1Var.h, gyf1Var.i);
            case 10:
                return ((f) obj).b;
            case 11:
                lyf1 lyf1Var = (lyf1) obj;
                lky lkyVar = new lky(lyf1Var.a, 10, true);
                pjy pjyVar = new pjy(lyf1Var.c);
                eyf1 eyf1Var = lyf1Var.d;
                if (!eyf1Var.equals(fyf1.i)) {
                    if (eyf1Var instanceof eyf1) {
                        eyf1 eyf1Var2 = eyf1Var;
                        float f2 = eyf1Var2.i;
                        long j = eyf1Var2.j;
                        vjyVar = new vjy(j, f2 / j);
                    } else {
                        if (!eyf1Var.equals(dyf1.i)) {
                            eg.o();
                            return null;
                        }
                        xjyVar = null;
                    }
                    aky akyVar = new aky(pjyVar, (ujy) null, (njy) null, xjyVar, (rjy) null, 22);
                    kky kkyVar = new kky(lyf1Var.b);
                    boolean z = lyf1Var.e;
                    return new cky(lkyVar, akyVar, (fky) null, kkyVar, (!z || lyf1Var.f) ? new oky(new oiy(new liy(z), 6), 2) : null, (wiy) null, (bky) null, new piy(Collections.singleton(siy.a)), (cjy) null, 15844);
                }
                vjyVar = xjy.a;
                xjyVar = vjyVar;
                aky akyVar2 = new aky(pjyVar, (ujy) null, (njy) null, xjyVar, (rjy) null, 22);
                kky kkyVar2 = new kky(lyf1Var.b);
                boolean z2 = lyf1Var.e;
                return new cky(lkyVar, akyVar2, (fky) null, kkyVar2, (!z2 || lyf1Var.f) ? new oky(new oiy(new liy(z2), 6), 2) : null, (wiy) null, (bky) null, new piy(Collections.singleton(siy.a)), (cjy) null, 15844);
            case 12:
                ljy ljyVar = (ljy) obj;
                if (ljyVar instanceof kjy) {
                    niy niyVar = ((kjy) ljyVar).a;
                    liy liyVar = niyVar instanceof liy ? (liy) niyVar : null;
                    return (liyVar == null || !liyVar.a) ? vxf1.a : sxf1.a;
                }
                if ((ljyVar instanceof ijy) || (ljyVar instanceof hjy) || (ljyVar instanceof gjy)) {
                    return yxf1.a;
                }
                return null;
            case 13:
                return ((kzf1) obj).a;
            case 14:
                return ((kzf1) obj).c;
            case 15:
                return new jzf1((fzf1) obj);
            case 16:
                return ((nzf1) obj).c;
            case 17:
                return new mzf1((fzf1) obj);
            case 18:
                return new l2l0((i3l0) obj);
            case 19:
                return new a3l0((i3l0) obj);
            case 20:
                b7x b7xVar = b7x.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), ((a3l0) obj).a, r6h1.c, System.currentTimeMillis());
            case 21:
                d2g1 d2g1Var = (d2g1) obj;
                return new e2g1(d2g1Var, false, ot11.H(d2g1Var.f));
            case 22:
                return mno1.h(new mmr0[]{new mmr0("expanded", Boolean.valueOf(((e2g1) obj).b))});
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ((xas) obj).a(X0, ggf1.R0);
                return rih1Var;
            case 24:
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                eqc eqcVar = (eqc) obj;
                return eqcVar.b(new ibf1(new qoz0(Math.max(Float.intBitsToFloat((int) (eqcVar.a.j() >> 32)), Float.intBitsToFloat((int) (eqcVar.a.j() & 4294967295L))), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (eqcVar.a.j() >> 32)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (eqcVar.a.j() & 4294967295L)))) & 4294967295L), p7h.M(new u7h[]{new u7h(u7h.j), new u7h(u7h.b(u7h.b, 0.2f, 0.0f, 0.0f, 0.0f, 14))}), (List) null), (byte) 19));
            case 26:
                neg negVar = (neg) obj;
                neg.b(negVar, "play_origin", PlayOriginSerializer.INSTANCE.getDescriptor(), 4);
                qnw0 qnw0Var = pma.b;
                neg.b(negVar, "playback_id", qnw0Var, 4);
                neg.b(negVar, "context_uri", qnw0Var, 4);
                neg.b(negVar, "track", ContextTrackSerializer.INSTANCE.getDescriptor(), 4);
                return rih1Var;
            case 27:
                return ((j1q0) obj).c();
            case 28:
                return (iix0) obj;
            default:
                return Boolean.valueOf((obj instanceof iix0) || (obj instanceof rih1));
        }
    }
}
