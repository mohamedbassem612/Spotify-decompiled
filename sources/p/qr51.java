package p;

import android.os.Bundle;
import androidx.compose.ui.geometry.Offset;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import com.spotify.scrollsita.v1.Section;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qr51 extends hab0 implements vu30 {
    public static final qr51 N0;
    public static final qr51 O0;
    public static final qr51 P0;
    public static final qr51 Q0;
    public static final qr51 R0;
    public static final qr51 S0;
    public static final qr51 T0;
    public static final qr51 U0;
    public static final qr51 V0;
    public static final qr51 W0;
    public static final qr51 X;
    public static final qr51 X0;
    public static final qr51 Y;
    public static final qr51 Y0;
    public static final qr51 Z;
    public static final qr51 Z0;
    public static final qr51 a1;
    public static final qr51 b;
    public static final qr51 b1;
    public static final qr51 c;
    public static final qr51 c1;
    public static final qr51 d;
    public static final qr51 d1;
    public static final qr51 e;
    public static final qr51 e1;
    public static final qr51 f;
    public static final qr51 g;
    public static final qr51 h;
    public static final qr51 i;
    public static final qr51 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new qr51(i2, (byte) 0);
        c = new qr51(i2, (byte) 1);
        d = new qr51(i2, (byte) 2);
        e = new qr51(i2, (byte) 3);
        f = new qr51(i2, (byte) 4);
        g = new qr51(i2, (byte) 5);
        h = new qr51(i2, (byte) 6);
        i = new qr51(i2, (byte) 7);
        t = new qr51(i2, (byte) 8);
        X = new qr51(i2, (byte) 9);
        Y = new qr51(i2, (byte) 10);
        Z = new qr51(i2, (byte) 11);
        N0 = new qr51(i2, (byte) 12);
        O0 = new qr51(i2, (byte) 13);
        P0 = new qr51(i2, (byte) 14);
        Q0 = new qr51(i2, (byte) 15);
        R0 = new qr51(i2, (byte) 16);
        S0 = new qr51(i2, (byte) 17);
        T0 = new qr51(i2, (byte) 18);
        U0 = new qr51(i2, (byte) 19);
        V0 = new qr51(i2, (byte) 20);
        W0 = new qr51(i2, (byte) 21);
        X0 = new qr51(i2, (byte) 22);
        Y0 = new qr51(i2, (byte) 23);
        Z0 = new qr51(i2, (byte) 24);
        a1 = new qr51(i2, (byte) 25);
        b1 = new qr51(i2, (byte) 26);
        c1 = new qr51(i2, (byte) 27);
        d1 = new qr51(i2, (byte) 28);
        e1 = new qr51(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qr51(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj, Object obj2) {
        long jC;
        long jC2;
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        b7x b7xVar = b7x.a;
        boolean z = false;
        b7x b7xVar2 = null;
        switch (b2) {
            case 0:
                long j = ((Offset) obj2).a;
                return rih1Var;
            case 1:
                os51 os51Var = (os51) obj;
                return Next.h(qs51.a((qs51) obj2, (String) null, 0L, 0L, 0L, false, false, false, false, os51Var.b, (List) null, 0L, 0L, os51Var.a, (agv) null, 12031));
            case 2:
                os51 os51Var2 = (os51) obj;
                return First.b(qs51.a((qs51) obj2, (String) null, 0L, 0L, 0L, false, false, false, false, os51Var2.b, (List) null, 0L, 0L, os51Var2.a, (agv) null, 12031));
            case 3:
                hi40 hi40Var = (hi40) obj;
                jo70 jo70Var = (jo70) obj2;
                b7xVar2 = jo70Var != null ? jo70Var.a : null;
                if (b7xVar2 == null) {
                    b7xVar2 = "";
                }
                return new rq51(hi40Var, b7xVar2);
            case 4:
                long j2 = ((Offset) obj2).a;
                return rih1Var;
            case 5:
                mt51 mt51Var = (mt51) obj2;
                return new lt51(mt51Var.a, mt51Var.b, mt51Var.c);
            case 6:
                return new rt51(((Boolean) obj2).booleanValue(), (crb) obj);
            case 7:
                return new wt51(((Boolean) obj2).booleanValue());
            case 8:
                l0l l0lVar = (l0l) obj;
                l0l l0lVar2 = (l0l) obj2;
                return Boolean.valueOf(u890.j(l0lVar != null ? l0lVar.d() : null, l0lVar2 != null ? l0lVar2.d() : null));
            case 9:
                return new u7h(((afx) obj).b.e);
            case 10:
                r361 r361Var = (r361) obj;
                return Next.h(new t361(r361Var.a, r361Var.b, r361Var.c, r361Var.d, false, r361Var.e, r361Var.f));
            case 11:
                return null;
            case 12:
                return new k861((jo70) obj, (xkk1) obj2);
            case 13:
                return null;
            case 14:
                icx icxVar = ((afx) obj).a;
                int iOrdinal = ((vux) obj2).ordinal();
                if (iOrdinal == 0) {
                    jC = icxVar.a.c();
                } else if (iOrdinal == 1) {
                    jC = icxVar.b.c();
                } else {
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    jC = icxVar.d;
                }
                return new u7h(jC);
            case 15:
                List list = (List) obj2;
                int iS = zno1.s(q7h.U(list, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (Object obj3 : list) {
                    linkedHashMap.put(((vb61) obj3).a, obj3);
                }
                return new wb61(linkedHashMap);
            case 16:
                icx icxVar2 = ((afx) obj).a;
                ixx ixxVar = icxVar2.a;
                int iOrdinal2 = ((vux) obj2).ordinal();
                if (iOrdinal2 == 0) {
                    jC2 = ixxVar.c();
                } else if (iOrdinal2 == 1) {
                    jC2 = icxVar2.b.c();
                } else {
                    if (iOrdinal2 != 2) {
                        eg.o();
                        return null;
                    }
                    jC2 = ixxVar.c();
                }
                return new u7h(jC2);
            case 17:
                qzm qzmVar = (qzm) obj2;
                return new hc61(qzmVar.a, (crb) obj, qzmVar.b);
            case 18:
                aqx0 aqx0Var = (aqx0) obj2;
                return new vc61(aqx0Var.a, (crb) obj, aqx0Var.b);
            case 19:
                return (bd61) obj2;
            case 20:
                return z6x.a;
            case 21:
                Set set = s4b1.f;
                String strZ = uic.A(uic.x(((cp11) obj).a).h()).z();
                strZ.getClass();
                return Next.h(ep61.a((ep61) obj2, false, strZ, 5));
            case 22:
                Set set2 = s4b1.f;
                String strZ2 = uic.A(uic.x(((cp11) obj).a).h()).z();
                strZ2.getClass();
                return First.b(ep61.a((ep61) obj2, false, strZ2, 5));
            case 23:
                return (lp61) obj2;
            case 24:
                Bundle bundle = (Bundle) obj;
                jp61 jp61Var = (jp61) obj2;
                gax gaxVar = (lax) jhc1.t(bundle, "enabledState", lax.class);
                if (gaxVar == null) {
                    gaxVar = new gax(2131961690, (String) null);
                }
                gax gaxVar2 = gaxVar;
                Serializable serializable = bundle.getSerializable("value");
                Serializable serializable2 = serializable == null ? null : serializable;
                Serializable serializable3 = bundle.getSerializable("valueEnabledStates");
                b7xVar2 = serializable3 instanceof Map ? (Map) serializable3 : null;
                return new lp61(jp61Var, (lax) gaxVar2, serializable2, (Map) (b7xVar2 == null ? b7xVar : b7xVar2), 8);
            case 25:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", (String) obj2)), ((rzl0) obj).a, r6h1.c, System.currentTimeMillis());
            case 26:
                my61 my61Var = (my61) obj2;
                b7xVar2 = my61Var != null ? my61Var.a : null;
                return ((my61Var == null || !my61Var.b) && b7xVar2 != null) ? new ry61(b7xVar2) : qy61.a;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                vn71 vn71Var = (vn71) obj;
                qfd qfdVar = (qfd) obj2;
                if (vn71Var != null) {
                    ArrayList arrayList = vn71Var.a;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj4 : arrayList) {
                        if (obj4 instanceof qc71) {
                            arrayList2.add(obj4);
                        }
                    }
                    qc71 qc71Var = (qc71) o7h.s0(arrayList2);
                    if (qc71Var != null) {
                        b7xVar2 = qc71Var.a;
                    }
                }
                if (qfdVar != null) {
                    ArrayList arrayList3 = qfdVar.e;
                    if (qfdVar.c == 3 || arrayList3.contains(l131.a) || arrayList3.contains(l131.c)) {
                        z = true;
                    }
                }
                return new my61(b7xVar2, z);
            case 28:
                return (p671) obj2;
            default:
                return new x671((s671) obj, (kby) obj2);
        }
    }
}
