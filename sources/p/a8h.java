package p;

import com.spotify.scrollsita.v1.Section;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class a8h extends hab0 implements zu30 {
    public static final a8h N0;
    public static final a8h O0;
    public static final a8h P0;
    public static final a8h Q0;
    public static final a8h R0;
    public static final a8h S0;
    public static final a8h T0;
    public static final a8h U0;
    public static final a8h V0;
    public static final a8h W0;
    public static final a8h X;
    public static final a8h X0;
    public static final a8h Y;
    public static final a8h Y0;
    public static final a8h Z;
    public static final a8h Z0;
    public static final a8h a1;
    public static final a8h b;
    public static final a8h b1;
    public static final a8h c;
    public static final a8h c1;
    public static final a8h d;
    public static final a8h d1;
    public static final a8h e;
    public static final a8h e1;
    public static final a8h f;
    public static final a8h g;
    public static final a8h h;
    public static final a8h i;
    public static final a8h t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new a8h(i2, (byte) 0);
        c = new a8h(i2, (byte) 1);
        d = new a8h(i2, (byte) 2);
        e = new a8h(i2, (byte) 3);
        f = new a8h(i2, (byte) 4);
        g = new a8h(i2, (byte) 5);
        h = new a8h(i2, (byte) 6);
        i = new a8h(i2, (byte) 7);
        t = new a8h(i2, (byte) 8);
        X = new a8h(i2, (byte) 9);
        Y = new a8h(i2, (byte) 10);
        Z = new a8h(i2, (byte) 11);
        N0 = new a8h(i2, (byte) 12);
        O0 = new a8h(i2, (byte) 13);
        P0 = new a8h(i2, (byte) 14);
        Q0 = new a8h(i2, (byte) 15);
        R0 = new a8h(i2, (byte) 16);
        S0 = new a8h(i2, (byte) 17);
        T0 = new a8h(i2, (byte) 18);
        U0 = new a8h(i2, (byte) 19);
        V0 = new a8h(i2, (byte) 20);
        W0 = new a8h(i2, (byte) 21);
        X0 = new a8h(i2, (byte) 22);
        Y0 = new a8h(i2, (byte) 23);
        Z0 = new a8h(i2, (byte) 24);
        a1 = new a8h(i2, (byte) 25);
        b1 = new a8h(i2, (byte) 26);
        c1 = new a8h(i2, (byte) 27);
        d1 = new a8h(i2, (byte) 28);
        e1 = new a8h(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a8h(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i2;
        fs40 fs40Var = (fs40) obj;
        iu30 iu30Var = (iu30) obj2;
        x340 x340Var = (b0k) obj3;
        int iIntValue = ((Number) obj4).intValue();
        m4c m4cVar = fkj0.X;
        if ((iIntValue & 6) == 0) {
            i2 = (x340Var.g(fs40Var) ? 4 : 2) | iIntValue;
        } else {
            i2 = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objT = x340Var2.T();
            if (z || objT == m4cVar) {
                objT = new xei(iu30Var, (byte) 28);
                x340Var2.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            boolean z2 = i3 == 32;
            Object objT2 = x340Var2.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new xei(iu30Var, (byte) 29);
                x340Var2.s0(objT2);
            }
            rqt0.e(fs40Var, function0, (Function0) objT2, (qim0) null, (idn0) null, x340Var2, i2 & 14);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
        w7h1 w7h1Var;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        byte b2 = this.a;
        b7x b7xVar = b7x.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                ((Number) obj3).intValue();
                return new t5l0((r6h1) obj4);
            case 1:
                dxk0 dxk0Var = (dxk0) obj;
                bfh bfhVar = (bfh) obj3;
                seh sehVar = (afh) obj4;
                r6h1 r6h1Var = dxk0Var.a;
                y6h1 y6h1Var = dxk0Var.b;
                if (sehVar instanceof reh) {
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var, r6h1Var, System.currentTimeMillis());
                } else if (sehVar instanceof teh) {
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("comment_input_field", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC.a(), r6h1Var, System.currentTimeMillis());
                } else if (sehVar instanceof seh) {
                    String str = sehVar.a;
                    x6h1 x6h1VarC2 = y6h1Var.c();
                    x6h1VarC2.i.add(new a7h1("comment_row", "unpinned", (Integer) null, str, (String) null));
                    x6h1VarC2.j = false;
                    x6h1 x6h1VarC3 = x6h1VarC2.a().c();
                    x6h1VarC3.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC3.a(), r6h1Var, System.currentTimeMillis());
                } else if (sehVar instanceof weh) {
                    x6h1 x6h1VarC4 = y6h1Var.c();
                    x6h1VarC4.i.add(new a7h1("sensitive_comments_disclaimer", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = true;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC4.a(), r6h1Var, System.currentTimeMillis());
                } else if (sehVar instanceof ueh) {
                    String str2 = ((ueh) sehVar).a;
                    x6h1 x6h1VarC5 = y6h1Var.c();
                    x6h1VarC5.i.add(new a7h1("comment_row", "unpinned", (Integer) null, str2, (String) null));
                    x6h1VarC5.j = false;
                    x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                    x6h1VarC6.i.add(new a7h1("reply_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC6.a(), r6h1Var, System.currentTimeMillis());
                } else if (sehVar instanceof veh) {
                    String str3 = ((veh) sehVar).a;
                    x6h1 x6h1VarC7 = y6h1Var.c();
                    x6h1VarC7.i.add(new a7h1("comment_row", "unpinned", (Integer) null, str3, (String) null));
                    x6h1VarC7.j = false;
                    x6h1 x6h1VarC8 = x6h1VarC7.a().c();
                    x6h1VarC8.i.add(new a7h1("reply_preview", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC8.a(), r6h1Var, System.currentTimeMillis());
                } else {
                    if (!(sehVar instanceof yeh)) {
                        if (sehVar.equals(xeh.a) || (sehVar instanceof zeh)) {
                            return null;
                        }
                        eg.o();
                        return null;
                    }
                    yeh yehVar = (yeh) sehVar;
                    String str4 = yehVar.a;
                    x6h1 x6h1VarC9 = y6h1Var.c();
                    x6h1VarC9.i.add(new a7h1("comment_row", "unpinned", (Integer) null, str4, (String) null));
                    x6h1VarC9.j = false;
                    y6h1 y6h1VarA = x6h1VarC9.a();
                    String strM = ab80.m(yehVar.c, yehVar.d, ":");
                    x6h1 x6h1VarC10 = y6h1VarA.c();
                    x6h1VarC10.i.add(new a7h1("timestamp", (String) null, (Integer) null, (String) null, strM));
                    x6h1VarC10.j = true;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", bfhVar.a)), x6h1VarC10.a(), r6h1Var, System.currentTimeMillis());
                }
                return w7h1Var;
            case 2:
                ((Number) obj3).intValue();
                return new gxk0(((rph) obj2).a);
            case 3:
                ((Number) obj3).intValue();
                return new gxk0(((vnh) obj2).b);
            case 4:
                ((Number) obj3).intValue();
                return new yrk0(((zth) obj).a, (r6h1) obj4);
            case 5:
                yrk0 yrk0Var = (yrk0) obj;
                zth zthVar = (zth) obj2;
                if (!((cuh) obj4).equals(cuh.a)) {
                    eg.o();
                    return null;
                }
                String str5 = zthVar.a;
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                if (str5 == null) {
                    str5 = "";
                }
                return new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str5)), yrk0Var.b, yrk0Var.a, System.currentTimeMillis());
            case 6:
                ((Number) obj3).intValue();
                return new htk0((r6h1) obj4);
            case 7:
                htk0 htk0Var = (htk0) obj;
                x6h1 x6h1VarC11 = htk0Var.b.c();
                x6h1VarC11.i.add(new a7h1("companion_content_items", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC11.j = false;
                x6h1 x6h1VarC12 = x6h1VarC11.a().c();
                x6h1VarC12.i.add(new a7h1("image_item", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC12.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC12.a(), htk0Var.a, System.currentTimeMillis());
            case 8:
                x6h1 x6h1VarC13 = ((uvk0) obj).a.c();
                x6h1VarC13.i.add(new a7h1("compliance_disclaimer", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC13.j = false;
                x6h1VarC13.a();
                String str6 = ((wyh) obj4).a;
                new z7h1("hit", 1, b7xVar);
                new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", str6));
                r6h1 r6h1Var2 = r6h1.c;
                System.currentTimeMillis();
                return null;
            case 9:
                wc1 wc1Var = (wc1) obj;
                int iIntValue = ((Number) obj4).intValue();
                wc1Var.getClass();
                h5p1.a(wc1Var, (iu30) obj2, (qim0) null, (b0k) obj3, iIntValue & 112);
                return rih1Var;
            case 10:
                i73 i73Var = (i73) obj;
                iu30 iu30Var = (iu30) obj2;
                x340 x340Var = (b0k) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i2 = iIntValue2 | (x340Var.g(i73Var) ? 4 : 2);
                } else {
                    i2 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i2 |= x340Var.i(iu30Var) ? 32 : 16;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    cvx cvxVar2 = cbx.b(x340Var2).b;
                    up30.a(i73Var, uyn1.B(nim0.a, 0.0f, 16.0f, 0.0f, 16.0f, 5), iu30Var, x340Var2, ((i2 << 3) & 896) | (i2 & 14));
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 11:
                cw3 cw3Var = (cw3) obj;
                iu30 iu30Var2 = (iu30) obj2;
                x340 x340Var3 = (b0k) obj3;
                int iIntValue3 = ((Number) obj4).intValue();
                m4c m4cVar = fkj0.X;
                if ((iIntValue3 & 6) == 0) {
                    i3 = iIntValue3 | (x340Var3.g(cw3Var) ? 4 : 2);
                } else {
                    i3 = iIntValue3;
                }
                if ((iIntValue3 & 48) == 0) {
                    i3 |= x340Var3.i(iu30Var2) ? 32 : 16;
                }
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(i3 & 1, (i3 & 147) != 146)) {
                    int i12 = i3 & 112;
                    boolean z2 = i12 == 32;
                    Object objT = x340Var4.T();
                    if (z2 || objT == m4cVar) {
                        objT = new a6i(iu30Var2, (byte) 4);
                        x340Var4.s0(objT);
                    }
                    Function0 function0 = (Function0) objT;
                    z = i12 == 32;
                    Object objT2 = x340Var4.T();
                    if (z || objT2 == m4cVar) {
                        objT2 = new a6i(iu30Var2, (byte) 5);
                        x340Var4.s0(objT2);
                    }
                    rwq0.a(cw3Var, function0, (Function0) objT2, x340Var4, i3 & 14);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 12:
                ((Boolean) obj2).booleanValue();
                x340 x340Var5 = (b0k) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue4 & 1, (iIntValue4 & 129) != 128)) {
                    x340Var6.b0();
                }
                return rih1Var;
            case 13:
                qzf qzfVar = (qzf) obj;
                iu30 iu30Var3 = (iu30) obj2;
                x340 x340Var7 = (b0k) obj3;
                int iIntValue5 = ((Number) obj4).intValue();
                if ((iIntValue5 & 6) == 0) {
                    i4 = iIntValue5 | (x340Var7.g(qzfVar) ? 4 : 2);
                } else {
                    i4 = iIntValue5;
                }
                if ((iIntValue5 & 48) == 0) {
                    i4 |= x340Var7.i(iu30Var3) ? 32 : 16;
                }
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(i4 & 1, (i4 & 147) != 146)) {
                    irn1.u((qim0) null, (vu30) null, (vu30) null, (erl1) null, apo.r(-339129365, new ef8((Object) qzfVar, (Object) iu30Var3, (byte) 23), x340Var8), x340Var8, 24576, 15);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 14:
                kyo1.i((((Number) obj4).intValue() >> 3) & 14, (String) obj2, (b0k) obj3, (qim0) null);
                return rih1Var;
            case 15:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                x340 x340Var9 = (b0k) obj3;
                ((Number) obj4).intValue();
                if (zBooleanValue) {
                    x340 x340Var10 = x340Var9;
                    x340Var10.i0(-185484775);
                    w0h1.a(spx.c, new jsl(cwl1.o0(x340Var10, 2131958440)), (qim0) null, 0L, 0L, false, x340Var10, spx.d, 60);
                    x340Var10.r(false);
                } else {
                    x340 x340Var11 = x340Var9;
                    x340Var11.i0(-185197157);
                    w0h1.a(xpx.c, new jsl(cwl1.o0(x340Var11, 2131958441)), (qim0) null, 0L, 0L, false, x340Var11, xpx.d, 60);
                    x340Var11.r(false);
                }
                return rih1Var;
            case 16:
                wzg wzgVar = (a0h) obj;
                iu30 iu30Var4 = (iu30) obj2;
                x340 x340Var12 = (b0k) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                m4c m4cVar2 = fkj0.X;
                if ((iIntValue6 & 6) == 0) {
                    i5 = iIntValue6 | ((iIntValue6 & 8) == 0 ? x340Var12.g(wzgVar) : x340Var12.i(wzgVar) ? 4 : 2);
                } else {
                    i5 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i5 |= x340Var12.i(iu30Var4) ? 32 : 16;
                }
                x340 x340Var13 = x340Var12;
                if (!x340Var13.Y(i5 & 1, (i5 & 147) != 146)) {
                    x340Var13.b0();
                } else if (wzgVar instanceof wzg) {
                    x340Var13.i0(-1068915873);
                    wzg wzgVar2 = wzgVar;
                    z = (i5 & 112) == 32;
                    Object objT3 = x340Var13.T();
                    if (z || objT3 == m4cVar2) {
                        objT3 = new tbi(iu30Var4, (byte) 21);
                        x340Var13.s0(objT3);
                    }
                    myo1.a(wzgVar2, (Function0) objT3, (qim0) null, x340Var13, i5 & 14);
                    x340Var13.r(false);
                } else if (wzgVar instanceof yzg) {
                    x340Var13.i0(-1068911748);
                    yzg yzgVar = (yzg) wzgVar;
                    z = (i5 & 112) == 32;
                    Object objT4 = x340Var13.T();
                    if (z || objT4 == m4cVar2) {
                        objT4 = new tbi(iu30Var4, (byte) 22);
                        x340Var13.s0(objT4);
                    }
                    ouo1.l(yzgVar, (Function0) objT4, (qim0) null, x340Var13, i5 & 14);
                    x340Var13.r(false);
                } else {
                    if (!(wzgVar instanceof zzg)) {
                        throw p3d1.k(x340Var13, -1068917792, false);
                    }
                    x340Var13.i0(-1068907386);
                    zzg zzgVar = (zzg) wzgVar;
                    z = (i5 & 112) == 32;
                    Object objT5 = x340Var13.T();
                    if (z || objT5 == m4cVar2) {
                        objT5 = new tbi(iu30Var4, (byte) 23);
                        x340Var13.s0(objT5);
                    }
                    j1p1.k(zzgVar, (Function0) objT5, (qim0) null, x340Var13, i5 & 14);
                    x340Var13.r(false);
                }
                return rih1Var;
            case 17:
                ((Number) obj4).intValue();
                return rih1Var;
            case 18:
                iu30 iu30Var5 = (iu30) obj2;
                x340 x340Var14 = (b0k) obj3;
                int iIntValue7 = ((Number) obj4).intValue();
                m4c m4cVar3 = fkj0.X;
                pfl pflVarR = ob51.r((uel) obj);
                int i13 = (iIntValue7 & 112) ^ 48;
                boolean z3 = (i13 > 32 && x340Var14.g(iu30Var5)) || (iIntValue7 & 48) == 32;
                x340 x340Var15 = x340Var14;
                Object objT6 = x340Var15.T();
                if (z3 || objT6 == m4cVar3) {
                    objT6 = new cci(iu30Var5, (byte) 4);
                    x340Var15.s0(objT6);
                }
                iu30 iu30Var6 = (iu30) objT6;
                boolean z4 = (i13 > 32 && x340Var15.g(iu30Var5)) || (iIntValue7 & 48) == 32;
                Object objT7 = x340Var15.T();
                if (z4 || objT7 == m4cVar3) {
                    objT7 = new cci(iu30Var5, (byte) 5);
                    x340Var15.s0(objT7);
                }
                iu30 iu30Var7 = (iu30) objT7;
                if ((i13 <= 32 || !x340Var15.g(iu30Var5)) && (iIntValue7 & 48) != 32) {
                    z = false;
                }
                Object objT8 = x340Var15.T();
                if (z || objT8 == m4cVar3) {
                    objT8 = new sm(iu30Var5, (byte) 25);
                    x340Var15.s0(objT8);
                }
                i541.b(pflVarR, iu30Var6, iu30Var7, (vu30) objT8, (qim0) null, x340Var15, 0);
                return rih1Var;
            case 19:
                xpn1.h((maa) obj, obj2, (b0k) obj3, ((Number) obj4).intValue() & 126);
                return rih1Var;
            case 20:
                xpn1.i((laa) obj, obj2, (b0k) obj3, ((Number) obj4).intValue() & 126);
                return rih1Var;
            case 21:
                ((Number) obj2).intValue();
                x340 x340Var16 = (b0k) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                x340 x340Var17 = x340Var16;
                if (x340Var17.Y(iIntValue8 & 1, (iIntValue8 & 129) != 128)) {
                    x2p1.b(x340Var17, 0);
                } else {
                    x340Var17.b0();
                }
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                x340 x340Var18 = (b0k) obj3;
                int iIntValue9 = ((Number) obj4).intValue();
                x340 x340Var19 = x340Var18;
                if (!x340Var19.Y(iIntValue9 & 1, (iIntValue9 & 129) != 128)) {
                    x340Var19.b0();
                }
                return rih1Var;
            case 23:
                cy cyVar = (cy) obj;
                iu30 iu30Var8 = (iu30) obj2;
                x340 x340Var20 = (b0k) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                if ((iIntValue10 & 6) == 0) {
                    i6 = iIntValue10 | (x340Var20.g(cyVar) ? 4 : 2);
                } else {
                    i6 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i6 |= x340Var20.i(iu30Var8) ? 32 : 16;
                }
                x340 x340Var21 = x340Var20;
                if (x340Var21.Y(i6 & 1, (i6 & 147) != 146)) {
                    z = (i6 & 112) == 32;
                    Object objT9 = x340Var21.T();
                    if (z || objT9 == fkj0.X) {
                        objT9 = new xei(iu30Var8, (byte) 18);
                        x340Var21.s0(objT9);
                    }
                    nyo1.a(cyVar, (Function0) objT9, (qim0) null, (idn0) null, x340Var21, i6 & 14);
                } else {
                    x340Var21.b0();
                }
                return rih1Var;
            case 24:
                ee3 ee3Var = (ee3) obj;
                iu30 iu30Var9 = (iu30) obj2;
                x340 x340Var22 = (b0k) obj3;
                int iIntValue11 = ((Number) obj4).intValue();
                if ((iIntValue11 & 6) == 0) {
                    i7 = iIntValue11 | (x340Var22.g(ee3Var) ? 4 : 2);
                } else {
                    i7 = iIntValue11;
                }
                if ((iIntValue11 & 48) == 0) {
                    i7 |= x340Var22.i(iu30Var9) ? 32 : 16;
                }
                x340 x340Var23 = x340Var22;
                if (x340Var23.Y(i7 & 1, (i7 & 147) != 146)) {
                    c680.a(ee3Var, iu30Var9, (qim0) null, (yqg) null, (idn0) null, x340Var23, i7 & 126);
                } else {
                    x340Var23.b0();
                }
                return rih1Var;
            case 25:
                wo6 wo6Var = (wo6) obj;
                iu30 iu30Var10 = (iu30) obj2;
                x340 x340Var24 = (b0k) obj3;
                int iIntValue12 = ((Number) obj4).intValue();
                m4c m4cVar4 = fkj0.X;
                if ((iIntValue12 & 6) == 0) {
                    i8 = iIntValue12 | (x340Var24.g(wo6Var) ? 4 : 2);
                } else {
                    i8 = iIntValue12;
                }
                if ((iIntValue12 & 48) == 0) {
                    i8 |= x340Var24.i(iu30Var10) ? 32 : 16;
                }
                x340 x340Var25 = x340Var24;
                if (x340Var25.Y(i8 & 1, (i8 & 147) != 146)) {
                    int i14 = i8 & 112;
                    boolean z5 = i14 == 32;
                    Object objT10 = x340Var25.T();
                    if (z5 || objT10 == m4cVar4) {
                        objT10 = new xei(iu30Var10, (byte) 19);
                        x340Var25.s0(objT10);
                    }
                    Function0 function1 = (Function0) objT10;
                    z = i14 == 32;
                    Object objT11 = x340Var25.T();
                    if (z || objT11 == m4cVar4) {
                        objT11 = new xei(iu30Var10, (byte) 20);
                        x340Var25.s0(objT11);
                    }
                    iko1.a(wo6Var, function1, (Function0) objT11, (qim0) null, (idn0) null, x340Var25, i8 & 14);
                } else {
                    x340Var25.b0();
                }
                return rih1Var;
            case 26:
                gka gkaVar = (gka) obj;
                iu30 iu30Var11 = (iu30) obj2;
                x340 x340Var26 = (b0k) obj3;
                int iIntValue13 = ((Number) obj4).intValue();
                m4c m4cVar5 = fkj0.X;
                if ((iIntValue13 & 6) == 0) {
                    i9 = iIntValue13 | (x340Var26.g(gkaVar) ? 4 : 2);
                } else {
                    i9 = iIntValue13;
                }
                if ((iIntValue13 & 48) == 0) {
                    i9 |= x340Var26.i(iu30Var11) ? 32 : 16;
                }
                x340 x340Var27 = x340Var26;
                if (x340Var27.Y(i9 & 1, (i9 & 147) != 146)) {
                    int i15 = i9 & 112;
                    boolean z6 = i15 == 32;
                    Object objT12 = x340Var27.T();
                    if (z6 || objT12 == m4cVar5) {
                        objT12 = new xei(iu30Var11, (byte) 21);
                        x340Var27.s0(objT12);
                    }
                    Function0 function2 = (Function0) objT12;
                    z = i15 == 32;
                    Object objT13 = x340Var27.T();
                    if (z || objT13 == m4cVar5) {
                        objT13 = new xei(iu30Var11, (byte) 22);
                        x340Var27.s0(objT13);
                    }
                    z8p1.c(gkaVar, function2, (Function0) objT13, (qim0) null, x340Var27, i9 & 14);
                } else {
                    x340Var27.b0();
                }
                return rih1Var;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                jj10 jj10Var = (jj10) obj;
                iu30 iu30Var12 = (iu30) obj2;
                x340 x340Var28 = (b0k) obj3;
                int iIntValue14 = ((Number) obj4).intValue();
                m4c m4cVar6 = fkj0.X;
                if ((iIntValue14 & 6) == 0) {
                    i10 = iIntValue14 | (x340Var28.g(jj10Var) ? 4 : 2);
                } else {
                    i10 = iIntValue14;
                }
                if ((iIntValue14 & 48) == 0) {
                    i10 |= x340Var28.i(iu30Var12) ? 32 : 16;
                }
                x340 x340Var29 = x340Var28;
                if (x340Var29.Y(i10 & 1, (i10 & 147) != 146)) {
                    int i16 = i10 & 112;
                    boolean z7 = i16 == 32;
                    Object objT14 = x340Var29.T();
                    if (z7 || objT14 == m4cVar6) {
                        objT14 = new xei(iu30Var12, (byte) 25);
                        x340Var29.s0(objT14);
                    }
                    Function0 function3 = (Function0) objT14;
                    boolean z8 = i16 == 32;
                    Object objT15 = x340Var29.T();
                    if (z8 || objT15 == m4cVar6) {
                        objT15 = new xei(iu30Var12, (byte) 26);
                        x340Var29.s0(objT15);
                    }
                    Function0 function4 = (Function0) objT15;
                    z = i16 == 32;
                    Object objT16 = x340Var29.T();
                    if (z || objT16 == m4cVar6) {
                        objT16 = new xei(iu30Var12, (byte) 27);
                        x340Var29.s0(objT16);
                    }
                    cuo1.m(jj10Var, function3, function4, (Function0) objT16, (qim0) null, x340Var29, i10 & 14);
                } else {
                    x340Var29.b0();
                }
                return rih1Var;
            case 28:
                return a(obj, obj2, obj3, obj4);
            default:
                ckd0 ckd0Var = (ckd0) obj;
                iu30 iu30Var13 = (iu30) obj2;
                x340 x340Var30 = (b0k) obj3;
                int iIntValue15 = ((Number) obj4).intValue();
                m4c m4cVar7 = fkj0.X;
                if ((iIntValue15 & 6) == 0) {
                    i11 = iIntValue15 | (x340Var30.g(ckd0Var) ? 4 : 2);
                } else {
                    i11 = iIntValue15;
                }
                if ((iIntValue15 & 48) == 0) {
                    i11 |= x340Var30.i(iu30Var13) ? 32 : 16;
                }
                x340 x340Var31 = x340Var30;
                if (x340Var31.Y(i11 & 1, (i11 & 147) != 146)) {
                    int i17 = i11 & 112;
                    boolean z9 = i17 == 32;
                    Object objT17 = x340Var31.T();
                    if (z9 || objT17 == m4cVar7) {
                        objT17 = new jii(iu30Var13, (byte) 0);
                        x340Var31.s0(objT17);
                    }
                    Function0 function5 = (Function0) objT17;
                    boolean z10 = i17 == 32;
                    Object objT18 = x340Var31.T();
                    if (z10 || objT18 == m4cVar7) {
                        objT18 = new jii(iu30Var13, (byte) 1);
                        x340Var31.s0(objT18);
                    }
                    Function0 function6 = (Function0) objT18;
                    z = i17 == 32;
                    Object objT19 = x340Var31.T();
                    if (z || objT19 == m4cVar7) {
                        objT19 = new jii(iu30Var13, (byte) 2);
                        x340Var31.s0(objT19);
                    }
                    i1p1.i(ckd0Var, function5, function6, (Function0) objT19, (qim0) null, x340Var31, i11 & 14, 16);
                } else {
                    x340Var31.b0();
                }
                return rih1Var;
        }
    }
}
