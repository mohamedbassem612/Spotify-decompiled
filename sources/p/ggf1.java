package p;

import android.os.Bundle;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import com.spotify.player.model.ContextTrack;
import com.spotify.scrollsita.v1.Section;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ggf1 extends hab0 implements vu30 {
    public static final ggf1 N0;
    public static final ggf1 O0;
    public static final ggf1 P0;
    public static final ggf1 Q0;
    public static final ggf1 R0;
    public static final ggf1 S0;
    public static final ggf1 T0;
    public static final ggf1 U0;
    public static final ggf1 V0;
    public static final ggf1 W0;
    public static final ggf1 X;
    public static final ggf1 X0;
    public static final ggf1 Y;
    public static final ggf1 Y0;
    public static final ggf1 Z;
    public static final ggf1 Z0;
    public static final ggf1 a1;
    public static final ggf1 b;
    public static final ggf1 b1;
    public static final ggf1 c;
    public static final ggf1 c1;
    public static final ggf1 d;
    public static final ggf1 d1;
    public static final ggf1 e;
    public static final ggf1 e1;
    public static final ggf1 f;
    public static final ggf1 g;
    public static final ggf1 h;
    public static final ggf1 i;
    public static final ggf1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new ggf1(i2, (byte) 0);
        c = new ggf1(i2, (byte) 1);
        d = new ggf1(i2, (byte) 2);
        e = new ggf1(i2, (byte) 3);
        f = new ggf1(i2, (byte) 4);
        g = new ggf1(i2, (byte) 5);
        h = new ggf1(i2, (byte) 6);
        i = new ggf1(i2, (byte) 7);
        t = new ggf1(i2, (byte) 8);
        X = new ggf1(i2, (byte) 9);
        Y = new ggf1(i2, (byte) 10);
        Z = new ggf1(i2, (byte) 11);
        N0 = new ggf1(i2, (byte) 12);
        O0 = new ggf1(i2, (byte) 13);
        P0 = new ggf1(i2, (byte) 14);
        Q0 = new ggf1(i2, (byte) 15);
        R0 = new ggf1(i2, (byte) 16);
        S0 = new ggf1(i2, (byte) 17);
        T0 = new ggf1(i2, (byte) 18);
        U0 = new ggf1(i2, (byte) 19);
        V0 = new ggf1(i2, (byte) 20);
        W0 = new ggf1(i2, (byte) 21);
        X0 = new ggf1(i2, (byte) 22);
        Y0 = new ggf1(i2, (byte) 23);
        Z0 = new ggf1(i2, (byte) 24);
        a1 = new ggf1(i2, (byte) 25);
        b1 = new ggf1(i2, (byte) 26);
        c1 = new ggf1(i2, (byte) 27);
        d1 = new ggf1(i2, (byte) 28);
        e1 = new ggf1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ggf1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:154:0x02d1  */
    public final Object invoke(Object obj, Object obj2) {
        b7x b7xVar;
        goj0 goj0VarA;
        mq70 mq70Var;
        up70 up70VarA;
        goj0 goj0VarA2;
        lpf1 lpf1Var;
        byte b2 = this.a;
        vp70 vp70Var = vp70.b;
        b7x b7xVar2 = "";
        z = false;
        boolean z = false;
        b7x b7xVar3 = null;
        switch (b2) {
            case 0:
                return zso1.c0(((kfr0) obj).f, (op80) obj2);
            case 1:
                ioj0 ioj0Var = (ioj0) obj2;
                String str = ((jif1) obj).a;
                hoj0 hoj0VarC = ioj0Var.c(xkk1.class, str);
                xkk1 xkk1Var = (hoj0VarC == null || (goj0VarA2 = hoj0VarC.a()) == null) ? null : (xkk1) goj0VarA2.a;
                String str2 = (xkk1Var == null || (mq70Var = xkk1Var.a) == null || (up70VarA = mq70Var.a(vp70Var)) == null) ? null : up70VarA.a.a;
                hoj0 hoj0VarC2 = ioj0Var.c(jo70.class, str);
                if (hoj0VarC2 != null && (goj0VarA = hoj0VarC2.a()) != null) {
                    b7xVar3 = (jo70) goj0VarA.a;
                }
                String strConcat = str.concat(":concerts");
                if (b7xVar3 != null && (b7xVar = ((jo70) b7xVar3).a) != null) {
                    b7xVar2 = b7xVar;
                }
                return new kif1(strConcat, b7xVar2, str2);
            case 2:
                return zso1.c0(((lfr0) obj).c, (op80) obj2);
            case 3:
                return new u7h(u7h.j);
            case 4:
                jo70 jo70Var = (jo70) obj;
                xkk1 xkk1Var2 = (xkk1) obj2;
                String str3 = jo70Var.a;
                String strY0 = o7h.y0(jo70Var.d, ", ", (String) null, (String) null, bpf1.t, 30);
                Iterator it = p7h.M(new vp70[]{vp70.c, vp70Var, vp70.d, vp70.e}).iterator();
                while (it.hasNext()) {
                    up70 up70VarA2 = xkk1Var2.a.a((vp70) it.next());
                    b7x b7xVar4 = up70VarA2 != null ? up70VarA2.a.a : null;
                    if (b7xVar4 != null) {
                        b7xVar3 = b7xVar4;
                        return new fof1(str3, strY0, b7xVar3 != null ? b7xVar3 : "");
                    }
                }
                return new fof1(str3, strY0, b7xVar3 != null ? b7xVar3 : "");
            case 5:
                rpf1 rpf1Var = (rpf1) obj2;
                ContextTrack contextTrack = rpf1Var.a;
                l4m l4mVar = rpf1Var.b;
                boolean z2 = rpf1Var.c;
                c2l c2lVar = rpf1Var.d;
                String strA0 = l4o1.P(contextTrack) ? l4o1.a0(contextTrack, "album_title") : l4o1.l(contextTrack);
                if (strA0 == null) {
                    strA0 = "";
                }
                b7x b7xVarF0 = l4o1.f0(contextTrack);
                b7xVar2 = b7xVarF0 != null ? b7xVarF0 : "";
                int i2 = spf1.a[l4mVar.ordinal()] == 1 ? 1 : 0;
                if ((c2lVar instanceof y1l) || (c2lVar instanceof z1l)) {
                    lpf1Var = kpf1.a;
                } else {
                    if (!(c2lVar instanceof a2l) && !c2lVar.equals(b2l.a)) {
                        eg.o();
                        return null;
                    }
                    lpf1Var = new lpf1(z2, strA0);
                }
                return new qpf1(lpf1Var instanceof kpf1 ? new npf1(i2, b7xVar2, strA0) : new opf1(i2, b7xVar2), lpf1Var);
            case 6:
                erf1 erf1Var = (erf1) obj2;
                erf1Var.getClass();
                return Next.h(new erf1((drf1) obj, erf1Var.b));
            case 7:
                return First.b(new erf1((drf1) obj));
            case 8:
                trf1 trf1Var = (trf1) obj;
                i1r i1rVar = (k1r) obj2;
                i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
                q9f q9fVar = i1rVar2 != null ? (q9f) i1rVar2.a : null;
                boolean zB = xsf.b(q9fVar);
                boolean z3 = !(i1rVar instanceof j1r);
                String str4 = q9fVar != null ? q9fVar.a : null;
                String str5 = q9fVar != null ? q9fVar.b : null;
                b7xVar3 = q9fVar != null ? q9fVar.c : null;
                if (b7xVar3 == null) {
                    b7xVar3 = b7x.a;
                }
                return new trf1(trf1Var.a, trf1Var.b, trf1Var.c, trf1Var.d, trf1Var.e, trf1Var.f, trf1Var.g, trf1Var.h, trf1Var.i, trf1Var.j, zB, z3, xsf.d(str4, str5, b7xVar3));
            case 9:
                dsf1 dsf1Var = (dsf1) obj2;
                return new csf1(dsf1Var.a, dsf1Var.c);
            case 10:
                fuf1 fuf1Var = (fuf1) obj;
                i091 i091Var = (i091) obj2;
                String str6 = fuf1Var.c;
                lsm0 lsm0Var = i091Var.a;
                boolean zJ = u890.j(lsm0Var != null ? lsm0Var.a : null, str6);
                return new guf1(fuf1Var.a, str6, fuf1Var.d, zJ, zJ && (ebp1.q(i091Var) || u890.j(i091Var.h, j091.a)) && !i091Var.g, i091Var);
            case 11:
                vnb1 vnb1Var = (vnb1) obj;
                qtt0 qtt0Var = (qtt0) obj2;
                if ((vnb1Var == null || !vnb1Var.b) && qtt0Var != qtt0.h) {
                    return (qtt0Var == null || qtt0Var == qtt0.b) ? j6u.a : l6u.a;
                }
                return m6u.a;
            case 12:
                return zso1.c0(((mfr0) obj).e, (op80) obj2);
            case 13:
                hjf1 hjf1Var = (hjf1) obj;
                return new kzf1(hjf1Var.b, hjf1Var.f, d9y0.x(hjf1Var, 1), hjf1Var.x, l4o1.C(hjf1Var.h), (iu30) obj2);
            case 14:
                gyf1 gyf1Var = (gyf1) obj;
                String str7 = gyf1Var.c;
                String str8 = gyf1Var.e;
                String str9 = gyf1Var.f;
                w19 w19Var = ((x910) obj2).a;
                String str10 = w19Var.a;
                return new lyf1(str7, str8, str9, (str10.length() > 0 && u890.j(str10, gyf1Var.g) && w19Var.a()) ? new eyf1(w19Var.e.longValue(), w19Var.f.longValue()) : fyf1.i, gyf1Var.h, gyf1Var.i);
            case 15:
                hjf1 hjf1Var2 = (hjf1) obj;
                return new nzf1(hjf1Var2.b, hjf1Var2.f, d9y0.x(hjf1Var2, 1), (iu30) obj2);
            case 16:
                d2g1 d2g1Var = (d2g1) obj2;
                return new e2g1(d2g1Var, ((Bundle) obj).getBoolean("expanded"), ot11.H(d2g1Var.f));
            case 17:
                return new d7g1((jo70) obj2, (xkk1) obj);
            case 18:
                q9g1 q9g1Var = (q9g1) obj2;
                q9g1Var.getClass();
                Next nextY = y9g1.y((m9g1) obj, q9g1Var);
                return First.c(nextY.f(q9g1Var), nextY.b());
            case 19:
                zag1 zag1Var = (zag1) obj2;
                if (!zag1Var.e && (!zag1Var.c || zag1Var.d)) {
                    z = true;
                }
                return new xag1(zag1Var.a, zag1Var.b, z);
            case 20:
                return null;
            case 21:
                return null;
            case 22:
                return null;
            case 23:
                return null;
            case 24:
                return null;
            case 25:
                return null;
            case 26:
                return null;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return null;
            case 28:
                return null;
            default:
                return null;
        }
    }
}
