package p;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.comscore.streaming.ContentFeedType;
import com.comscore.streaming.WindowState;
import com.spotify.betamax.player.VideoSurfaceView;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rpr extends hab0 implements vu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ byte a = 6;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rpr(String str, boolean z, String str2, int i, Function0 function0, j2i j2iVar, Function0 function1, qim0 qim0Var, String str3, String str4, String str5, String str6, int i2) {
        super(2);
        this.d = str;
        this.c = z;
        this.e = str2;
        this.f = i;
        this.b = function0;
        this.g = j2iVar;
        this.h = function1;
        this.i = qim0Var;
        this.t = str3;
        this.X = str4;
        this.Y = str5;
        this.Z = str6;
    }

    /* JADX WARN: Code duplicated, block: B:89:0x03c9  */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [boolean, int] */
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        mmr0 mmr0Var;
        int i;
        ?? r7;
        bby bbyVarA;
        ln00 ln00VarA;
        vu30 vu30Var;
        byte b = this.a;
        boolean z = this.c;
        int i2 = this.f;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.Z;
        Object obj5 = this.Y;
        Object obj6 = this.X;
        Object obj7 = this.t;
        Object obj8 = this.i;
        Object obj9 = this.h;
        Object obj10 = this.g;
        Object obj11 = this.e;
        Object obj12 = this.d;
        Object obj13 = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    int iI0 = ((wat) x340Var2.k(t4k.h)).i0(20.0f);
                    if (z) {
                        Rect rect = (Rect) obj12;
                        ur80 ur80Var = (ur80) ((ven0) obj13).getValue();
                        if (rect == null || rect.width() <= 0 || rect.height() <= 0) {
                            obj3 = obj6;
                        } else {
                            float fD = ur80Var.d();
                            obj3 = obj6;
                            float fB = ur80Var.b();
                            if (fD > 0.0f && fB > 0.0f) {
                                mmr0Var = new mmr0(Float.valueOf((yoi1.o(rect.height() / fB, 0.05f, 1.0f) + yoi1.o(rect.width() / fD, 0.05f, 1.0f)) / 2.0f), new ofg1(sgc1.u((rect.centerX() - ur80Var.a) / fD, (rect.centerY() - ur80Var.b) / fB)));
                            }
                        }
                        mmr0Var = null;
                    } else {
                        obj3 = obj6;
                        mmr0Var = null;
                    }
                    zen0 zen0Var = (zen0) obj11;
                    qim0 qim0VarX = nim0.a;
                    if (z && i2 > 0) {
                        qim0VarX = j9k1.x(qim0VarX, new f13(i2, (byte) 7));
                    }
                    qim0 qim0Var = qim0VarX;
                    if (mmr0Var != null) {
                        x340Var2.i0(747947069);
                        x340Var2.r(false);
                        n8b1 n8b1VarL0 = irn1.l0(0.8f, 400.0f, (Object) null, 4);
                        float fFloatValue = ((Number) mmr0Var.a).floatValue();
                        long j = ((ofg1) mmr0Var.b).a;
                        tzg1 tzg1Var = xay.a;
                        i = 2;
                        r7 = 0;
                        bbyVarA = new bby(new oig1((qg10) null, (eb91) null, (cfe) null, new eg41(fFloatValue, 0, j, n8b1VarL0), (LinkedHashMap) null, 119)).a(xay.e(2, irn1.o0(175, 0, mlv.d, 2)));
                    } else {
                        x340Var2.i0(748485601);
                        ceo ceoVar = mlv.b;
                        pxg1 pxg1VarO0 = irn1.o0(WindowState.NORMAL, 0, ceoVar, 2);
                        boolean zE = x340Var2.e(iI0);
                        Object objT = x340Var2.T();
                        if (zE || objT == m4cVar) {
                            objT = new uv4(iI0, (byte) 15);
                            x340Var2.s0(objT);
                        }
                        bby bbyVarO = xay.o(pxg1VarO0, (iu30) objT);
                        i = 2;
                        r7 = 0;
                        bbyVarA = bbyVarO.a(xay.e(2, irn1.o0(WindowState.NORMAL, 0, ceoVar, 2)));
                        x340Var2.r(false);
                    }
                    bby bbyVar = bbyVarA;
                    if (mmr0Var != null) {
                        x340Var2.i0(748986933);
                        x340Var2.r((boolean) r7);
                        ceo ceoVar2 = mlv.b;
                        ln00VarA = new ln00(new oig1((qg10) null, (eb91) null, (cfe) null, new eg41(((Number) mmr0Var.a).floatValue(), 0, ((ofg1) mmr0Var.b).a, irn1.o0(ContentFeedType.OTHER, (int) r7, ceoVar2, i)), (LinkedHashMap) null, 119)).a(xay.f(2, irn1.o0(ContentFeedType.OTHER, 0, ceoVar2, 2)));
                    } else {
                        x340Var2.i0(749471742);
                        ceo ceoVar3 = mlv.c;
                        pxg1 pxg1VarO1 = irn1.o0(ContentFeedType.OTHER, (int) r7, ceoVar3, i);
                        boolean zE2 = x340Var2.e(iI0);
                        Object objT2 = x340Var2.T();
                        if (zE2 || objT2 == m4cVar) {
                            objT2 = new uv4(iI0, (byte) 16);
                            x340Var2.s0(objT2);
                        }
                        ln00VarA = xay.s(pxg1VarO1, (iu30) objT2).a(xay.f(2, irn1.o0(ContentFeedType.OTHER, 0, ceoVar3, 2)));
                        x340Var2.r(false);
                    }
                    fq7.d(zen0Var, qim0Var, bbyVar, ln00VarA, (String) null, apo.r(-229852815, new pih((bnl) obj9, (o95) obj8, (ven0) obj10, (iu30) obj7, (tob1) obj3, (tob1) obj5, (ah91) obj4), x340Var2), x340Var2, 196608, 16);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    ah91 ah91Var = (ah91) ((ven0) obj13).getValue();
                    if (ah91Var != null) {
                        x340Var4.i0(-1436419373);
                        spr sprVar = (spr) obj4;
                        Rect rect2 = (Rect) obj12;
                        zen0 zen0Var2 = (zen0) obj11;
                        ven0 ven0Var = (ven0) obj10;
                        bnl bnlVar = (bnl) obj9;
                        o95 o95Var = (o95) obj8;
                        ven0 ven0Var2 = (ven0) obj13;
                        iu30 iu30Var = (iu30) obj7;
                        tob1 tob1Var = (tob1) obj6;
                        tob1 tob1Var2 = (tob1) obj5;
                        View view = (View) x340Var4.k(AndroidCompositionLocals_androidKt.f);
                        Object objT3 = x340Var4.T();
                        m4c m4cVar2 = fkj0.X;
                        if (objT3 == m4cVar2) {
                            objT3 = new e3h1((l6h1) sprVar.e.get(), (n7h1) null, (i8h1) sprVar.d.get());
                            x340Var4.s0(objT3);
                        }
                        e3h1 e3h1Var = (e3h1) objT3;
                        boolean zG = x340Var4.g(view);
                        Object objT4 = x340Var4.T();
                        if (zG || objT4 == m4cVar2) {
                            jp80 jp80Var = new jp80(view);
                            eq80 eq80Var = new eq80(e3h1Var);
                            wch wchVar = q6x.b;
                            if (jp80Var.equals(wchVar) && eq80Var.equals(wchVar)) {
                                objT4 = wchVar;
                            } else if (jp80Var.equals(wchVar)) {
                                objT4 = eq80Var;
                            } else if (eq80Var.equals(wchVar)) {
                                objT4 = jp80Var;
                            } else {
                                wchVar = new wch(jp80Var, eq80Var);
                                objT4 = wchVar;
                            }
                            x340Var4.s0(objT4);
                        }
                        op80 op80Var = (op80) objT4;
                        boolean zI = x340Var4.i(op80Var);
                        Object objT5 = x340Var4.T();
                        if (zI || objT5 == m4cVar2) {
                            objT5 = new qpr(op80Var, (byte) 0);
                            x340Var4.s0(objT5);
                        }
                        dgo1.c(op80Var, (iu30) objT5, apo.r(384670537, new rpr(this.c, rect2, zen0Var2, this.f, ven0Var, bnlVar, o95Var, ven0Var2, iu30Var, tob1Var, tob1Var2, ah91Var), x340Var4), x340Var4, 384);
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(-1436419374);
                        x340Var4.r(false);
                    }
                }
                break;
            case 2:
                ((Number) obj2).intValue();
                k4k.f(this.c, (a140) obj12, (String) obj11, (String) obj13, (sqe) obj10, (yhv) obj9, (yhv) obj8, (w140) obj7, (j040) obj6, (pbf0) obj5, (pbf0) obj4, (b0k) obj, czo1.p(i2 | 1));
                break;
            case 3:
                ((Number) obj2).intValue();
                vby0.g((b9l1) obj12, (q9l1) obj11, (m0t) obj13, (VideoSurfaceView) obj10, (o0i) obj9, (clj1) obj8, this.c, (Function0) obj6, (iu30) obj7, (c2u0) obj5, (String) obj4, (b0k) obj, czo1.p(i2 | 1));
                break;
            case 4:
                ((Number) obj2).intValue();
                poz0.h((b9l1) obj12, (q9l1) obj11, (fal1) obj13, (m0t) obj10, (vm70) obj9, (o0i) obj8, (gij1) obj6, this.c, (vu30) obj5, (iu30) obj7, (c2u0) obj4, (b0k) obj, czo1.p(i2 | 1));
                break;
            case 5:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                zba1 zba1Var = (zba1) obj8;
                sda1 sda1Var = (sda1) obj6;
                m4c m4cVar3 = fkj0.X;
                wat watVar = (wat) obj13;
                erl1 erl1Var = (erl1) obj11;
                pda1 pda1Var = (pda1) obj12;
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    int iS = pda1Var.p.s();
                    boolean zI2 = x340Var6.i(erl1Var) | x340Var6.i(watVar);
                    Object objT6 = x340Var6.T();
                    if (zI2 || objT6 == m4cVar3) {
                        objT6 = new yv10(erl1Var, watVar, (byte) 2);
                        x340Var6.s0(objT6);
                    }
                    Function0 function0 = (Function0) objT6;
                    xtb0 xtb0Var = (xtb0) obj10;
                    h3h1 h3h1Var = (h3h1) obj9;
                    j2i j2iVarR = apo.r(-961790335, new um81((vba1) obj7, pda1Var, i2, sda1Var), x340Var6);
                    if (z) {
                        x340Var6.i0(608327166);
                        vu30 vu30VarR = apo.r(-891965339, new gh61((c1m0) obj5, sda1Var, pda1Var, (qba1) obj4, (byte) 18), x340Var6);
                        x340Var6.r(false);
                        vu30Var = vu30VarR;
                    } else {
                        x340Var6.i0(609225391);
                        x340Var6.r(false);
                        vu30Var = null;
                    }
                    boolean zH = x340Var6.h(z) | x340Var6.i(zba1Var);
                    Object objT7 = x340Var6.T();
                    if (zH || objT7 == m4cVar3) {
                        objT7 = new cb8(z, zba1Var, (byte) 19);
                        x340Var6.s0(objT7);
                    }
                    lmt0.n(iS, (qim0) null, function0, xtb0Var, h3h1Var, j2iVarR, vu30Var, (iu30) objT7, x340Var6, 196608);
                }
                break;
            default:
                ((Number) obj2).intValue();
                o6i1.b((String) obj12, this.c, (String) obj11, this.f, (Function0) obj13, (j2i) obj10, (Function0) obj9, (qim0) obj8, (String) obj7, (String) obj6, (String) obj5, (String) obj4, (b0k) obj, czo1.p(196609));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rpr(ven0 ven0Var, spr sprVar, boolean z, Rect rect, zen0 zen0Var, int i, ven0 ven0Var2, bnl bnlVar, o95 o95Var, iu30 iu30Var, tob1 tob1Var, tob1 tob1Var2) {
        super(2);
        this.b = ven0Var;
        this.Z = sprVar;
        this.c = z;
        this.d = rect;
        this.e = zen0Var;
        this.f = i;
        this.g = ven0Var2;
        this.h = bnlVar;
        this.i = o95Var;
        this.t = iu30Var;
        this.X = tob1Var;
        this.Y = tob1Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rpr(pda1 pda1Var, erl1 erl1Var, wat watVar, xtb0 xtb0Var, h3h1 h3h1Var, boolean z, zba1 zba1Var, vba1 vba1Var, int i, sda1 sda1Var, c1m0 c1m0Var, qba1 qba1Var) {
        super(2);
        this.d = pda1Var;
        this.e = erl1Var;
        this.b = watVar;
        this.g = xtb0Var;
        this.h = h3h1Var;
        this.c = z;
        this.i = zba1Var;
        this.t = vba1Var;
        this.f = i;
        this.X = sda1Var;
        this.Y = c1m0Var;
        this.Z = qba1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rpr(b9l1 b9l1Var, q9l1 q9l1Var, m0t m0tVar, VideoSurfaceView videoSurfaceView, o0i o0iVar, clj1 clj1Var, boolean z, Function0 function0, iu30 iu30Var, c2u0 c2u0Var, String str, int i) {
        super(2);
        this.d = b9l1Var;
        this.e = q9l1Var;
        this.b = m0tVar;
        this.g = videoSurfaceView;
        this.h = o0iVar;
        this.i = clj1Var;
        this.c = z;
        this.X = function0;
        this.t = iu30Var;
        this.Y = c2u0Var;
        this.Z = str;
        this.f = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rpr(b9l1 b9l1Var, q9l1 q9l1Var, fal1 fal1Var, m0t m0tVar, vm70 vm70Var, o0i o0iVar, gij1 gij1Var, boolean z, vu30 vu30Var, iu30 iu30Var, c2u0 c2u0Var, int i) {
        super(2);
        this.d = b9l1Var;
        this.e = q9l1Var;
        this.b = fal1Var;
        this.g = m0tVar;
        this.h = vm70Var;
        this.i = o0iVar;
        this.X = gij1Var;
        this.c = z;
        this.Y = vu30Var;
        this.t = iu30Var;
        this.Z = c2u0Var;
        this.f = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rpr(boolean z, Rect rect, zen0 zen0Var, int i, ven0 ven0Var, bnl bnlVar, o95 o95Var, ven0 ven0Var2, iu30 iu30Var, tob1 tob1Var, tob1 tob1Var2, ah91 ah91Var) {
        super(2);
        this.c = z;
        this.d = rect;
        this.e = zen0Var;
        this.f = i;
        this.b = ven0Var;
        this.h = bnlVar;
        this.i = o95Var;
        this.g = ven0Var2;
        this.t = iu30Var;
        this.X = tob1Var;
        this.Y = tob1Var2;
        this.Z = ah91Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rpr(boolean z, a140 a140Var, String str, String str2, sqe sqeVar, yhv yhvVar, yhv yhvVar2, w140 w140Var, j040 j040Var, pbf0 pbf0Var, pbf0 pbf0Var2, int i) {
        super(2);
        this.c = z;
        this.d = a140Var;
        this.e = str;
        this.b = str2;
        this.g = sqeVar;
        this.h = yhvVar;
        this.i = yhvVar2;
        this.t = w140Var;
        this.X = j040Var;
        this.Y = pbf0Var;
        this.Z = pbf0Var2;
        this.f = i;
    }
}
