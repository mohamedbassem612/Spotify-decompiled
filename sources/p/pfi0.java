package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pfi0 extends hab0 implements iu30 {
    public static final pfi0 N0;
    public static final pfi0 O0;
    public static final pfi0 P0;
    public static final pfi0 Q0;
    public static final pfi0 R0;
    public static final pfi0 S0;
    public static final pfi0 T0;
    public static final pfi0 U0;
    public static final pfi0 V0;
    public static final pfi0 W0;
    public static final pfi0 X;
    public static final pfi0 X0;
    public static final pfi0 Y;
    public static final pfi0 Y0;
    public static final pfi0 Z;
    public static final pfi0 Z0;
    public static final pfi0 a1;
    public static final pfi0 b;
    public static final pfi0 b1;
    public static final pfi0 c;
    public static final pfi0 c1;
    public static final pfi0 d;
    public static final pfi0 d1;
    public static final pfi0 e;
    public static final pfi0 e1;
    public static final pfi0 f;
    public static final pfi0 g;
    public static final pfi0 h;
    public static final pfi0 i;
    public static final pfi0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new pfi0(i2, (byte) 0);
        c = new pfi0(i2, (byte) 1);
        d = new pfi0(i2, (byte) 2);
        e = new pfi0(i2, (byte) 3);
        f = new pfi0(i2, (byte) 4);
        g = new pfi0(i2, (byte) 5);
        h = new pfi0(i2, (byte) 6);
        i = new pfi0(i2, (byte) 7);
        t = new pfi0(i2, (byte) 8);
        X = new pfi0(i2, (byte) 9);
        Y = new pfi0(i2, (byte) 10);
        Z = new pfi0(i2, (byte) 11);
        N0 = new pfi0(i2, (byte) 12);
        O0 = new pfi0(i2, (byte) 13);
        P0 = new pfi0(i2, (byte) 14);
        Q0 = new pfi0(i2, (byte) 15);
        R0 = new pfi0(i2, (byte) 16);
        S0 = new pfi0(i2, (byte) 17);
        T0 = new pfi0(i2, (byte) 18);
        U0 = new pfi0(i2, (byte) 19);
        V0 = new pfi0(i2, (byte) 20);
        W0 = new pfi0(i2, (byte) 21);
        X0 = new pfi0(i2, (byte) 22);
        Y0 = new pfi0(i2, (byte) 23);
        Z0 = new pfi0(i2, (byte) 24);
        a1 = new pfi0(i2, (byte) 25);
        b1 = new pfi0(i2, (byte) 26);
        c1 = new pfi0(i2, (byte) 27);
        d1 = new pfi0(i2, (byte) 28);
        e1 = new pfi0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pfi0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        int i2 = 0;
        switch (b2) {
            case 0:
                return rih1Var;
            case 1:
                return rih1Var;
            case 2:
                ihi0 ihi0Var = (ihi0) obj;
                String str = ihi0Var.a;
                hvl1 hvl1Var = new hvl1(ihi0Var.b, 254, (String) null, (String) null, false, (String) null);
                List list = ihi0Var.c;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                for (Object obj2 : list) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        p7h.T();
                        throw null;
                    }
                    String str2 = (String) obj2;
                    arrayList.add(new ggi0(str + "-" + i2, str + "-" + i2, str2, str2));
                    i2 = i3;
                }
                return new hgi0(str, str, hvl1Var, arrayList, false, (String) null, 112);
            case 3:
                return o7h.p1(((ihi0) obj).c);
            case 4:
                return ((rt50) obj).a();
            case 5:
                return ((rt50) obj).a();
            case 6:
                rt50 rt50Var = (rt50) obj;
                ArrayList arrayList2 = rt50Var.a().d;
                ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((ggi0) it.next()).c);
                }
                mmr0 mmr0Var = new mmr0(1, o7h.p1(arrayList3));
                ArrayList arrayList4 = rt50Var.a().d;
                ArrayList arrayList5 = new ArrayList(q7h.U(arrayList4, 10));
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    arrayList5.add(((ggi0) it2.next()).d);
                }
                return sqg0.J(new mmr0[]{mmr0Var, new mmr0(2, o7h.p1(arrayList5))});
            case 7:
                ((qtr) obj).b(new gp9(5, (lnm) null, (byte) 6));
                return rih1Var;
            case 8:
                mhi0 mhi0Var = (mhi0) obj;
                return sqg0.J(new mmr0[]{new mmr0(1, Collections.singleton(mhi0Var.b().d)), new mmr0(2, Collections.singleton(mhi0Var.b().c))});
            case 9:
                return ((mhi0) obj).b().c;
            case 10:
                return n9p1.l((mey0) obj);
            case 11:
                return ((mey0) obj).c;
            case 12:
                return ((mey0) obj).d;
            case 13:
                return ((mey0) obj).c;
            case 14:
                return ((mey0) obj).c;
            case 15:
                return ((mey0) obj).c;
            case 16:
                return ((mey0) obj).c;
            case 17:
                return ((mey0) obj).c;
            case 18:
                return Boolean.valueOf((obj instanceof prl) || (obj instanceof rih1));
            case 19:
                if (obj instanceof rih1) {
                    return null;
                }
                return (prl) obj;
            case 20:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            case 21:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 22:
                return Boolean.valueOf((obj instanceof e2k1) || (obj instanceof rih1));
            case 23:
                if (obj instanceof rih1) {
                    return null;
                }
                return (e2k1) obj;
            case 24:
                return Boolean.valueOf((obj instanceof pjw0) || (obj instanceof rih1));
            case 25:
                if (obj instanceof rih1) {
                    return null;
                }
                return (pjw0) obj;
            case 26:
                return Boolean.valueOf(obj instanceof nbw0);
            case 27:
                if (obj != null) {
                    return (nbw0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.previewcardtrait.PreviewCardTrait");
                return null;
            case 28:
                return Boolean.valueOf(obj instanceof nbw0);
            default:
                if (obj != null) {
                    return (nbw0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.previewcardtrait.PreviewCardTrait");
                return null;
        }
    }
}
