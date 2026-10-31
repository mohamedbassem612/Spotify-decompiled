package p;

import app.rive.RiveFile;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jh31 extends hab0 implements vu30 {
    public static final jh31 N0;
    public static final jh31 O0;
    public static final jh31 P0;
    public static final jh31 Q0;
    public static final jh31 R0;
    public static final jh31 S0;
    public static final jh31 T0;
    public static final jh31 U0;
    public static final jh31 V0;
    public static final jh31 W0;
    public static final jh31 X;
    public static final jh31 X0;
    public static final jh31 Y;
    public static final jh31 Y0;
    public static final jh31 Z;
    public static final jh31 Z0;
    public static final jh31 a1;
    public static final jh31 b;
    public static final jh31 b1;
    public static final jh31 c;
    public static final jh31 c1;
    public static final jh31 d;
    public static final jh31 d1;
    public static final jh31 e;
    public static final jh31 e1;
    public static final jh31 f;
    public static final jh31 g;
    public static final jh31 h;
    public static final jh31 i;
    public static final jh31 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new jh31(i2, (byte) 0);
        c = new jh31(i2, (byte) 1);
        d = new jh31(i2, (byte) 2);
        e = new jh31(i2, (byte) 3);
        f = new jh31(i2, (byte) 4);
        g = new jh31(i2, (byte) 5);
        h = new jh31(i2, (byte) 6);
        i = new jh31(i2, (byte) 7);
        t = new jh31(i2, (byte) 8);
        X = new jh31(i2, (byte) 9);
        Y = new jh31(i2, (byte) 10);
        Z = new jh31(i2, (byte) 11);
        N0 = new jh31(i2, (byte) 12);
        O0 = new jh31(i2, (byte) 13);
        P0 = new jh31(i2, (byte) 14);
        Q0 = new jh31(i2, (byte) 15);
        R0 = new jh31(i2, (byte) 16);
        S0 = new jh31(i2, (byte) 17);
        T0 = new jh31(i2, (byte) 18);
        U0 = new jh31(i2, (byte) 19);
        V0 = new jh31(i2, (byte) 20);
        W0 = new jh31(i2, (byte) 21);
        X0 = new jh31(i2, (byte) 22);
        Y0 = new jh31(i2, (byte) 23);
        Z0 = new jh31(i2, (byte) 24);
        a1 = new jh31(i2, (byte) 25);
        b1 = new jh31(i2, (byte) 26);
        c1 = new jh31(i2, (byte) 27);
        d1 = new jh31(i2, (byte) 28);
        e1 = new jh31(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jh31(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj, Object obj2) {
        aq31 aq31Var;
        ac51 ac51Var;
        String str;
        ArrayList arrayList;
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return null;
            case 1:
                return new mmr0((RiveFile) obj, (Map) obj2);
            case 2:
                return sqg0.T(o7h.v1((List) obj2, (List) obj));
            case 3:
                rq31 rq31Var = (rq31) obj2;
                boolean z = ((gq31) obj).e;
                return z != rq31Var.e ? Next.h(rq31.a(rq31Var, (ArrayList) null, (uq31) null, z, 47)) : Next.j();
            case 4:
                rq31 rq31Var2 = (rq31) obj2;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                sq31 sq31Var = rq31Var2.c;
                sq31 sq31Var2 = sq31Var instanceof sq31 ? sq31Var : null;
                if (sq31Var2 != null) {
                    Long l = sq31Var2.b;
                    if (l == null || sq31Var2.c != null || sq31Var2.d) {
                        aq31Var = null;
                    } else {
                        long jLongValue = l.longValue();
                        k1z0 k1z0Var = sq31Var2.a;
                        aq31Var = new aq31(k1z0Var.a, jLongValue + k1z0Var.e);
                    }
                    if (aq31Var != null) {
                        linkedHashSet.add(aq31Var);
                    }
                }
                return First.c(rq31.a(rq31Var2, (ArrayList) null, (uq31) null, false, 31), linkedHashSet);
            case 5:
                ((o3x) obj).c = (gt40) obj2;
                return rih1Var;
            case 6:
                ((o3x) obj).e = ((ol3) obj2).a;
                return rih1Var;
            case 7:
                ((o3x) obj).d = ((ml3) obj2).a;
                return rih1Var;
            case 8:
                return new cc41(((bc41) obj).e, (String) null);
            case 9:
                return Next.j();
            case 10:
                xl41 xl41Var = (xl41) obj2;
                return First.c(xl41Var, Collections.singleton(new zk41(xl41Var.a)));
            case 11:
                Object[] objArr = (Object[]) obj2;
                Logger.b((String) obj, Arrays.copyOf(objArr, objArr.length));
                return rih1Var;
            case 12:
                return Boolean.valueOf(nr41.a((PlayerState) obj).equals(nr41.a((PlayerState) obj2)));
            case 13:
                ou41 ou41Var = (ou41) obj2;
                return new ru41(ou41Var.a, ou41Var.b);
            case 14:
                return (m251) obj2;
            case 15:
                return ((ac51) obj).b(((Number) obj2).longValue(), cc51.e);
            case 16:
                ec51 ec51Var = (ec51) obj;
                ((Number) obj2).longValue();
                int i2 = ec51Var.e + 1;
                return new yb51(ec51.a(ec51Var, 0, 0L, 0L, 0, i2, Integer.valueOf(i2), (ac51) null, 0L, 207), (zb51) null, 6);
            case 17:
                return ac51.a((ac51) obj, cc51.f, (Long) null, ((Number) obj2).longValue(), 0, (ArrayList) null, 0, (Long) null, (bc51) null, 2007);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                ec51 ec51Var2 = (ec51) obj;
                long jLongValue2 = ((Number) obj2).longValue();
                ac51 ac51VarA = ec51Var2.g;
                if (ac51VarA != null) {
                    int iOrdinal = ac51VarA.d.ordinal();
                    if (iOrdinal == 0) {
                        ac51VarA = ac51.a(ac51VarA, cc51.c, Long.valueOf(jLongValue2), jLongValue2, 1, (ArrayList) null, 0, (Long) null, (bc51) null, 1927);
                    } else if (iOrdinal == 1) {
                        ac51VarA = ac51.a(ac51VarA, (cc51) null, (Long) null, 0L, ac51VarA.g + 1, (ArrayList) null, 0, (Long) null, (bc51) null, 1471);
                    }
                    ac51Var = ac51VarA;
                } else {
                    ac51Var = null;
                }
                return new yb51(ec51.a(ec51Var2, 0, 0L, 0L, 0, 0, (Integer) null, ac51Var, 0L, 191), (zb51) null, 6);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return (te51) obj2;
            case 20:
                return null;
            case 21:
                return zso1.c0(((gfr0) obj).c, (op80) obj2);
            case 22:
                return (nj51) obj2;
            case 23:
                bk51 bk51Var = (bk51) obj;
                return new ck51(bk51Var.a, ((dk51) u890.k((k1r) obj2, (d0r) null, (n4r) null)).a, bk51Var.b, bk51Var.c);
            case 24:
                xl51 xl51Var = (xl51) obj2;
                return new yl51(xl51Var.a, xl51Var.b.disallowSeekingReasons().isEmpty(), xl51Var.c, xl51Var.d.a);
            case 25:
                mm51 mm51Var = (mm51) obj2;
                return new nm51(mm51Var.a, mm51Var.b.disallowSeekingReasons().isEmpty(), mm51Var.c, ((om51) obj).a, mm51Var.d.a);
            case 26:
                mmr0 mmr0Var = (mmr0) obj2;
                int i3 = ((un51) obj).a;
                String str2 = (String) mmr0Var.a;
                hu41 hu41Var = (ju41) mmr0Var.b;
                if (hu41Var instanceof iu41) {
                    return new wn51(i3, null, str2);
                }
                if (hu41Var instanceof hu41) {
                    return new wn51(i3, Integer.valueOf(hu41Var.a), str2);
                }
                if (hu41Var instanceof gu41) {
                    return new vn51(str2);
                }
                eg.o();
                return null;
            case 27:
                return f0g1.a((f0g1) obj2, ((lo51) obj).a);
            case 28:
                pp51 pp51Var = (pp51) obj2;
                return new pp51(pp51Var.a, pp51Var.b, ((op51) obj).b);
            default:
                qxc0 qxc0Var = (qxc0) obj;
                List list = (List) obj2;
                if (qxc0Var == null || (str = qxc0Var.a) == null) {
                    str = "";
                }
                if (list != null) {
                    List list2 = list;
                    arrayList = new ArrayList(q7h.U(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((pvc0) it.next()).c);
                    }
                } else {
                    arrayList = z6x.a;
                }
                return new pp51(str, arrayList, 1);
        }
    }
}
