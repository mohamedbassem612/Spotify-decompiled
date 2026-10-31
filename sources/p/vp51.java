package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vp51 extends hab0 implements zu30 {
    public static final vp51 N0;
    public static final vp51 O0;
    public static final vp51 P0;
    public static final vp51 Q0;
    public static final vp51 R0;
    public static final vp51 S0;
    public static final vp51 T0;
    public static final vp51 U0;
    public static final vp51 V0;
    public static final vp51 W0;
    public static final vp51 X;
    public static final vp51 X0;
    public static final vp51 Y;
    public static final vp51 Y0;
    public static final vp51 Z;
    public static final vp51 Z0;
    public static final vp51 a1;
    public static final vp51 b;
    public static final vp51 b1;
    public static final vp51 c;
    public static final vp51 c1;
    public static final vp51 d;
    public static final vp51 d1;
    public static final vp51 e;
    public static final vp51 e1;
    public static final vp51 f;
    public static final vp51 g;
    public static final vp51 h;
    public static final vp51 i;
    public static final vp51 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new vp51(i2, (byte) 0);
        c = new vp51(i2, (byte) 1);
        d = new vp51(i2, (byte) 2);
        e = new vp51(i2, (byte) 3);
        f = new vp51(i2, (byte) 4);
        g = new vp51(i2, (byte) 5);
        h = new vp51(i2, (byte) 6);
        i = new vp51(i2, (byte) 7);
        t = new vp51(i2, (byte) 8);
        X = new vp51(i2, (byte) 9);
        Y = new vp51(i2, (byte) 10);
        Z = new vp51(i2, (byte) 11);
        N0 = new vp51(i2, (byte) 12);
        O0 = new vp51(i2, (byte) 13);
        P0 = new vp51(i2, (byte) 14);
        Q0 = new vp51(i2, (byte) 15);
        R0 = new vp51(i2, (byte) 16);
        S0 = new vp51(i2, (byte) 17);
        T0 = new vp51(i2, (byte) 18);
        U0 = new vp51(i2, (byte) 19);
        V0 = new vp51(i2, (byte) 20);
        W0 = new vp51(i2, (byte) 21);
        X0 = new vp51(i2, (byte) 22);
        Y0 = new vp51(i2, (byte) 23);
        Z0 = new vp51(i2, (byte) 24);
        a1 = new vp51(i2, (byte) 25);
        b1 = new vp51(i2, (byte) 26);
        c1 = new vp51(i2, (byte) 27);
        d1 = new vp51(i2, (byte) 28);
        e1 = new vp51(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vp51(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        byte b2 = this.a;
        b7x b7xVar = b7x.a;
        w7h1 w7h1Var4 = null;
        switch (b2) {
            case 0:
                jwl0 jwl0Var = (jwl0) obj;
                tp51 tp51Var = (tp51) obj2;
                if (((qp51) obj4).equals(qp51.a)) {
                    String str = tp51Var.a;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), jwl0Var.b, jwl0Var.a, System.currentTimeMillis());
                } else {
                    eg.o();
                }
                return w7h1Var4;
            case 1:
                ((Number) obj3).intValue();
                return new pil0((r6h1) obj4);
            case 2:
                pil0 pil0Var = (pil0) obj;
                qs51 qs51Var = (qs51) obj3;
                if (((ns51) obj4) instanceof is51) {
                    return pil0Var.e(Integer.valueOf((int) qs51Var.b), Integer.valueOf((int) qs51Var.c));
                }
                return null;
            case 3:
                ((Number) obj3).intValue();
                return new n5l0((r6h1) obj4);
            case 4:
                n5l0 n5l0Var = (n5l0) obj;
                jt51 jt51Var = (jt51) obj4;
                r6h1 r6h1Var = n5l0Var.a;
                y6h1 y6h1Var = n5l0Var.b;
                if (jt51Var instanceof it51) {
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), y6h1Var, r6h1Var, System.currentTimeMillis());
                } else {
                    if (!(jt51Var instanceof ht51)) {
                        eg.o();
                        return null;
                    }
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_deselect", 1, b7xVar), y6h1Var, r6h1Var, System.currentTimeMillis());
                }
                return w7h1Var;
            case 5:
                ((Number) obj3).intValue();
                return new kol0((r6h1) obj4);
            case 6:
                kol0 kol0Var = (kol0) obj;
                r6h1 r6h1Var2 = kol0Var.a;
                y6h1 y6h1Var2 = kol0Var.b;
                int iOrdinal = ((ut51) obj4).ordinal();
                if (iOrdinal == 0) {
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1Var2, r6h1Var2, System.currentTimeMillis());
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var2, r6h1Var2, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 7:
                int iIntValue = ((Number) obj3).intValue();
                r6h1 r6h1Var3 = (r6h1) obj4;
                wcv wcvVar = ((lv51) obj).a;
                if (wcvVar instanceof xcv) {
                    return new u4l0(Integer.valueOf(iIntValue), ((xcv) wcvVar).a, r6h1Var3);
                }
                if (wcvVar instanceof wcv) {
                    return new q4l0(Integer.valueOf(iIntValue), wcvVar.a, r6h1Var3);
                }
                eg.o();
                return null;
            case 8:
                u4l0 u4l0Var = (n8h1) obj;
                rcv rcvVar = (vcv) obj4;
                if (!(rcvVar instanceof rcv) || !(u4l0Var instanceof u4l0)) {
                    if (!(rcvVar instanceof ocv) || !(u4l0Var instanceof q4l0)) {
                        return null;
                    }
                    q4l0 q4l0Var = (q4l0) u4l0Var;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", ((ocv) rcvVar).a.a)), q4l0Var.b, q4l0Var.a, System.currentTimeMillis());
                }
                xcv xcvVar = rcvVar.a;
                boolean z = xcvVar.e;
                String str2 = xcvVar.a;
                if (z) {
                    u4l0 u4l0Var2 = u4l0Var;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("deselect_entity_in_list", 1, Collections.singletonMap("entity_to_be_deselected", str2 != null ? str2 : "")), u4l0Var2.b, u4l0Var2.a, System.currentTimeMillis());
                }
                u4l0 u4l0Var3 = u4l0Var;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("select_entity_in_list", 1, Collections.singletonMap("entity_to_be_selected", str2 != null ? str2 : "")), u4l0Var3.b, u4l0Var3.a, System.currentTimeMillis());
            case 9:
                sxl0 sxl0Var = (sxl0) obj;
                if (((fe00) obj4) instanceof be00) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), sxl0Var.a, r6h1.c, System.currentTimeMillis());
                }
                return null;
            case 10:
                ((Number) obj3).intValue();
                return new lwl0(((t361) obj2).a, (r6h1) obj4);
            case 11:
                lwl0 lwl0Var = (lwl0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), lwl0Var.b, lwl0Var.a, System.currentTimeMillis());
            case 12:
                k761 k761Var = (k761) obj;
                ((Number) obj3).intValue();
                return new dtk0(Integer.valueOf(k761Var.b), k761Var.a, new jpk0(new py9((r6h1) obj4, (byte) 18), 0));
            case 13:
                dtk0 dtk0Var = (dtk0) obj;
                qob1 qob1Var = (qob1) obj3;
                if (!(((m500) obj4) instanceof m500)) {
                    eg.o();
                } else if (qob1Var instanceof mmb1) {
                    String str3 = ((mmb1) qob1Var).a;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str3 != null ? str3 : "")), dtk0Var.a, dtk0Var.b.c.b, System.currentTimeMillis());
                }
                return w7h1Var4;
            case 14:
                return new ftk0(Integer.valueOf(((Number) obj3).intValue()), ((j861) obj).a, (r6h1) obj4);
            case 15:
                ftk0 ftk0Var = (ftk0) obj;
                j861 j861Var = (j861) obj2;
                if (((l500) obj4).equals(l500.a)) {
                    String str4 = j861Var.a;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str4 != null ? str4 : "")), ftk0Var.b, ftk0Var.a, System.currentTimeMillis());
                } else {
                    eg.o();
                }
                return w7h1Var4;
            case 16:
                n861 n861Var = (n861) obj2;
                ((Number) obj4).intValue();
                x340 x340Var = (b0k) obj3;
                x340Var.i0(-1893995802);
                ArrayList arrayList = n861Var.a;
                Object p861Var = arrayList.size() <= 1 ? o861.a : new p861(arrayList, n861Var.b);
                x340Var.r(false);
                return p861Var;
            case 17:
                return null;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                mwl0 mwl0Var = (mwl0) obj;
                return ioo1.E(((hc61) obj3).b) ? mwl0Var.h() : mwl0Var.i();
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                ((Number) obj3).intValue();
                return new ynl0((r6h1) obj4);
            case 20:
                ynl0 ynl0Var = (ynl0) obj;
                r6h1 r6h1Var4 = ynl0Var.a;
                y6h1 y6h1Var3 = ynl0Var.b;
                int iOrdinal2 = ((jc61) obj4).ordinal();
                if (iOrdinal2 == 0) {
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1Var3, r6h1Var4, System.currentTimeMillis());
                } else {
                    if (iOrdinal2 != 1) {
                        eg.o();
                        return null;
                    }
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var3, r6h1Var4, System.currentTimeMillis());
                }
                return w7h1Var3;
            case 21:
                mwl0 mwl0Var2 = (mwl0) obj;
                vc61 vc61Var = (vc61) obj3;
                yqb yqbVar = (yqb) obj4;
                if (yqbVar.equals(xqb.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:internal:magpie?config=EDIT")), mwl0Var2.a, mwl0Var2.b.c.b, System.currentTimeMillis());
                }
                if (yqbVar.equals(wqb.a)) {
                    return ioo1.E(vc61Var.b) ? mwl0Var2.h() : mwl0Var2.i();
                }
                eg.o();
                return null;
            case 22:
                mwl0 mwl0Var3 = (mwl0) obj;
                int iOrdinal3 = ((zc61) obj4).ordinal();
                if (iOrdinal3 == 0) {
                    return mwl0Var3.i();
                }
                if (iOrdinal3 == 1) {
                    return mwl0Var3.h();
                }
                eg.o();
                return null;
            case 23:
                ((Number) obj3).intValue();
                return new aml0(new fjl0((r6h1) obj4, (byte) 5));
            case 24:
                ((Number) obj3).intValue();
                r6h1 r6h1Var5 = (r6h1) obj4;
                vm61 vm61Var = ((gn61) obj).d;
                if (vm61Var instanceof vm61) {
                    return (n8h1) vm61Var.e.a.invoke(r6h1Var5);
                }
                if (vm61Var instanceof zm61) {
                    return (n8h1) ((zm61) vm61Var).h.a.invoke(r6h1Var5);
                }
                if (vm61Var instanceof xm61) {
                    return (n8h1) ((xm61) vm61Var).k.a.invoke(r6h1Var5);
                }
                eg.o();
                return null;
            case 25:
                jpl0 jpl0Var = (jpl0) obj;
                ep61 ep61Var = (ep61) obj3;
                if (((dp61) obj4).equals(ap61.b)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", ep61Var.b)), jpl0Var.b, jpl0Var.a, System.currentTimeMillis());
                }
                return null;
            case 26:
                ((Number) obj3).intValue();
                return new pml0(new fjl0((r6h1) obj4, (byte) 8));
            case 27:
                Integer numValueOf = Integer.valueOf(((Number) obj3).intValue());
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                return new ptl0(new qtl0(numValueOf, yon1.G1("READALONG", "readalong", 1626, "readalong").c, ((oy61) obj).a, (r6h1) obj4));
            case 28:
                ((Number) obj3).intValue();
                return new rxl0((r6h1) obj4);
            default:
                ptl0 ptl0Var = (ptl0) obj;
                if (((jy61) obj4).equals(jy61.a)) {
                    return ptl0Var.h();
                }
                eg.o();
                return null;
        }
    }
}
