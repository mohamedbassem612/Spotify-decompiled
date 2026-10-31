package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.mobius.Next;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p83 extends hab0 implements vu30 {
    public static final p83 N0;
    public static final p83 O0;
    public static final p83 P0;
    public static final p83 Q0;
    public static final p83 R0;
    public static final p83 S0;
    public static final p83 T0;
    public static final p83 U0;
    public static final p83 V0;
    public static final p83 W0;
    public static final p83 X;
    public static final p83 X0;
    public static final p83 Y;
    public static final p83 Y0;
    public static final p83 Z;
    public static final p83 Z0;
    public static final p83 a1;
    public static final p83 b;
    public static final p83 b1;
    public static final p83 c;
    public static final p83 c1;
    public static final p83 d;
    public static final p83 d1;
    public static final p83 e;
    public static final p83 e1;
    public static final p83 f;
    public static final p83 g;
    public static final p83 h;
    public static final p83 i;
    public static final p83 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new p83(i2, (byte) 0);
        c = new p83(i2, (byte) 1);
        d = new p83(i2, (byte) 2);
        e = new p83(i2, (byte) 3);
        f = new p83(i2, (byte) 4);
        g = new p83(i2, (byte) 5);
        h = new p83(i2, (byte) 6);
        i = new p83(i2, (byte) 7);
        t = new p83(i2, (byte) 8);
        X = new p83(i2, (byte) 9);
        Y = new p83(i2, (byte) 10);
        Z = new p83(i2, (byte) 11);
        N0 = new p83(i2, (byte) 12);
        O0 = new p83(i2, (byte) 13);
        P0 = new p83(i2, (byte) 14);
        Q0 = new p83(i2, (byte) 15);
        R0 = new p83(i2, (byte) 16);
        S0 = new p83(i2, (byte) 17);
        T0 = new p83(i2, (byte) 18);
        U0 = new p83(i2, (byte) 19);
        V0 = new p83(i2, (byte) 20);
        W0 = new p83(i2, (byte) 21);
        X0 = new p83(i2, (byte) 22);
        Y0 = new p83(i2, (byte) 23);
        Z0 = new p83(i2, (byte) 24);
        a1 = new p83(i2, (byte) 25);
        b1 = new p83(i2, (byte) 26);
        c1 = new p83(i2, (byte) 27);
        d1 = new p83(i2, (byte) 28);
        e1 = new p83(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p83(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x013a  */
    public final Object invoke(Object obj, Object obj2) {
        goj0 goj0VarA;
        hll hllVar;
        List list;
        goj0 goj0VarA2;
        jo70 jo70Var;
        List list2;
        Object next;
        ho70 ho70Var;
        String str = null;
        switch (this.a) {
            case 0:
                return new ka10((String) obj, ((Boolean) obj2).booleanValue());
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return null;
            case 6:
                return null;
            case 7:
                return null;
            case 8:
                return null;
            case 9:
                return null;
            case 10:
                return null;
            case 11:
                f7l1 f7l1Var = (f7l1) obj;
                String str2 = f7l1Var != null ? f7l1Var.a : null;
                str = str2 instanceof y6l1 ? (y6l1) str2 : null;
                return str != null ? new b7e0("album_page:entity_explorer", str) : c7e0.a;
            case 12:
                return new ka10((String) obj, ((Boolean) obj2).booleanValue());
            case 13:
                return new ka10((szv0) obj, ((Boolean) obj2).booleanValue());
            case 14:
                wcm wcmVar = (wcm) obj;
                ioj0 ioj0Var = (ioj0) obj2;
                String str3 = wcmVar.a;
                hoj0 hoj0VarC = ioj0Var.c(jo70.class, str3);
                if (hoj0VarC != null && (goj0VarA2 = hoj0VarC.a()) != null && (jo70Var = (jo70) goj0VarA2.a) != null && (list2 = jo70Var.d) != null) {
                    Iterator it = list2.iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                            Set set = s4b1.f;
                        } else {
                            next = null;
                        }
                        ho70Var = (ho70) next;
                        if (ho70Var != null) {
                            str = ho70Var.b;
                        }
                    } while (!uic.g(((ho70) next).b, blc0.u1));
                    ho70Var = (ho70) next;
                    if (ho70Var != null) {
                        str = ho70Var.b;
                    }
                }
                String str4 = str;
                hoj0 hoj0VarC2 = ioj0Var.c(hll.class, str3);
                return new ka10(wcm.a(wcmVar, (Function0) null, (nx2) null, (hoj0VarC2 == null || (goj0VarA = hoj0VarC2.a()) == null || (hllVar = (hll) goj0VarA.a) == null || (list = hllVar.b) == null || !list.contains(ell.b)) ? false : true, str4, 447), true);
            case 15:
                return new t93((List) obj2);
            case 16:
                return new z93((qxc0) obj, (jo70) obj2);
            case 17:
                Boolean bool = (Boolean) obj2;
                return new la3((qxc0) obj, bool != null ? bool.booleanValue() : false);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return null;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return null;
            case 20:
                oc3 oc3Var = (oc3) obj2;
                hpe0 hpe0Var = oc3Var.b;
                if (hpe0Var != null) {
                    return new qc3(hpe0Var);
                }
                ed3 ed3Var = oc3Var.a;
                if (ed3Var instanceof bd3) {
                    return new rc3(((bd3) ed3Var).a);
                }
                if (ed3Var instanceof cd3) {
                    return sc3.a;
                }
                if (ed3Var instanceof dd3) {
                    return tc3.a;
                }
                eg.o();
                return null;
            case 21:
                return zso1.c0(((eer0) obj).d, (op80) obj2);
            case 22:
                tf3 tf3Var = (tf3) obj;
                w810 w810Var = (w810) obj2;
                return new uf3(tf3Var.b, tf3Var.c, tf3Var.d, tf3Var.e, w810Var.a, tf3Var.j, w810Var.b, tf3Var.k, tf3Var.l, tf3Var.m);
            case 23:
                return ((Boolean) obj2).booleanValue() ? qg3.a : pg3.a;
            case 24:
                return Next.j();
            case 25:
                return ((Number) obj).intValue() + "_" + ((h951) obj2).c;
            case 26:
                if (obj instanceof qu3) {
                    return new zv3((qu3) obj);
                }
                if (obj instanceof xv3) {
                    return new bw3(((xv3) obj).a);
                }
                eg.m(gvg.g(obj, "Unexpected data was loaded: "));
                return null;
            case 27:
                return Next.j();
            case 28:
                return null;
            default:
                return null;
        }
    }
}
