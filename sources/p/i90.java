package p;

import com.spotify.pam.v2.Action;
import com.spotify.pam.v2.ActionTypeMap;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i90 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c380 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i90(c380 c380Var, byte b) {
        super(2);
        this.a = b;
        this.b = c380Var;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:71:0x014c  */
    /* JADX WARN: Code duplicated, block: B:95:0x01c5  */
    public final Object invoke(Object obj, Object obj2) {
        String str;
        ActionTypeMap actionTypeMap;
        Action actionN;
        String title;
        ActionTypeMap actionTypeMap2;
        String str2;
        Action actionN2;
        String title2;
        String str3;
        ActionTypeMap actionTypeMap3;
        Action actionN3;
        String title3;
        String str4;
        ActionTypeMap actionTypeMap4;
        Action actionN4;
        String title4;
        byte b = this.a;
        Object obj3 = null;
        c380 c380Var = this.b;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Iterator it = c380Var.iterator();
                    while (it.hasNext()) {
                        m0p1.f((c90) it.next(), (qim0) null, x340Var2, 0, 2);
                    }
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    vyo1.j(c380Var, x340Var4, 8);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                vyo1.i(c380Var, (b0k) obj, czo1.p(9));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                vyo1.i(c380Var, (b0k) obj, czo1.p(9));
                return rih1Var;
            case 4:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    shx.a(this.b, (qim0) null, hcx.e, (idn0) null, x340Var6, 392, 58);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                vyo1.j(c380Var, (b0k) obj, czo1.p(9));
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                qxy0.l(c380Var, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                qxy0.l(c380Var, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                tm80.h(c380Var, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                tm80.n(c380Var, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                tm80.n(c380Var, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 11:
                return c380Var.get(((Number) obj).intValue());
            case 12:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var8).b;
                    m0p1.b(this.b, anm1.N("selection_actions", nim0.a), (l90) null, (xtb0) null, uyn1.h(2, 12.0f, 0.0f), 1, x340Var8, 196656, 12);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 13:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    fc11.a(this.b, (qim0) null, hcx.b, (hux) null, false, 0, (gbx) null, (String) null, (idn0) null, x340Var10, 392, 506);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                lgo1.m(c380Var, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 15:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    if (c380Var != null) {
                        for (Object obj4 : c380Var) {
                            if (((ActionTypeMap) obj4).o() == s80.Q0) {
                                obj3 = obj4;
                                actionTypeMap = (ActionTypeMap) obj3;
                                if (actionTypeMap != null || (actionN = actionTypeMap.n()) == null || (title = actionN.getTitle()) == null) {
                                    str = "";
                                } else {
                                    str = title;
                                }
                            }
                        }
                        actionTypeMap = (ActionTypeMap) obj3;
                        if (actionTypeMap != null) {
                            str = "";
                        } else {
                            str = "";
                        }
                    } else {
                        str = "";
                    }
                    uwr uwrVar2 = cbx.a;
                    uwo1.e(str, (qim0) null, cbx.d(x340Var12).k, 0L, (a0e1) null, (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, x340Var12, 12582912, 0, 1658);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 16:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    for (Object obj5 : c380Var) {
                        if (((ActionTypeMap) obj5).o() == s80.R0) {
                            obj3 = obj5;
                            actionTypeMap2 = (ActionTypeMap) obj3;
                            if (actionTypeMap2 != null || (actionN2 = actionTypeMap2.n()) == null || (title2 = actionN2.getTitle()) == null) {
                                str2 = "";
                            } else {
                                str2 = title2;
                            }
                            uwr uwrVar3 = cbx.a;
                            uwo1.e(str2, (qim0) null, cbx.d(x340Var14).k, 0L, (a0e1) null, (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, x340Var14, 12582912, 0, 1658);
                        }
                    }
                    actionTypeMap2 = (ActionTypeMap) obj3;
                    if (actionTypeMap2 != null) {
                        str2 = "";
                    } else {
                        str2 = "";
                    }
                    uwr uwrVar4 = cbx.a;
                    uwo1.e(str2, (qim0) null, cbx.d(x340Var14).k, 0L, (a0e1) null, (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, x340Var14, 12582912, 0, 1658);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 17:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    if (c380Var != null) {
                        for (Object obj6 : c380Var) {
                            if (((ActionTypeMap) obj6).o() == s80.P0) {
                                obj3 = obj6;
                                actionTypeMap3 = (ActionTypeMap) obj3;
                                if (actionTypeMap3 != null || (actionN3 = actionTypeMap3.n()) == null || (title3 = actionN3.getTitle()) == null) {
                                    str3 = "";
                                } else {
                                    str3 = title3;
                                }
                            }
                        }
                        actionTypeMap3 = (ActionTypeMap) obj3;
                        if (actionTypeMap3 != null) {
                            str3 = "";
                        } else {
                            str3 = "";
                        }
                    } else {
                        str3 = "";
                    }
                    uwr uwrVar5 = cbx.a;
                    uwo1.e(str3, (qim0) null, cbx.d(x340Var16).k, 0L, (a0e1) null, (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, x340Var16, 12582912, 0, 1658);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            default:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    if (c380Var != null) {
                        for (Object obj7 : c380Var) {
                            if (((ActionTypeMap) obj7).o() == s80.O0) {
                                obj3 = obj7;
                                actionTypeMap4 = (ActionTypeMap) obj3;
                                if (actionTypeMap4 != null || (actionN4 = actionTypeMap4.n()) == null || (title4 = actionN4.getTitle()) == null) {
                                    str4 = "";
                                } else {
                                    str4 = title4;
                                }
                            }
                        }
                        actionTypeMap4 = (ActionTypeMap) obj3;
                        if (actionTypeMap4 != null) {
                            str4 = "";
                        } else {
                            str4 = "";
                        }
                    } else {
                        str4 = "";
                    }
                    uwr uwrVar6 = cbx.a;
                    uwo1.e(str4, (qim0) null, cbx.d(x340Var18).k, 0L, (a0e1) null, (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, x340Var18, 12582912, 0, 1658);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i90(c380 c380Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = c380Var;
    }
}
