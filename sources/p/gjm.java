package p;

import android.graphics.Typeface;
import android.text.Spannable;
import android.view.View;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class gjm implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gjm(Function0 function0, iu30 iu30Var) {
        this.a = (byte) 1;
        this.c = function0;
        this.b = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = false;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                iu30 iu30Var = (iu30) obj6;
                mdm mdmVar = (mdm) obj5;
                b0k b0kVar = (b0k) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                b0k b0kVar2 = (x340) b0kVar;
                if (b0kVar2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    Object objT = b0kVar2.T();
                    if (objT == fkj0.X) {
                        obj4 = objT;
                        uim uimVar = new uim();
                        b0kVar2.s0(uimVar);
                        obj4 = uimVar;
                    }
                    obj4 = objT;
                    uim uimVar2 = (uim) obj4;
                    uimVar2.a.clear();
                    iu30Var.invoke(uimVar2);
                    uimVar2.a(mdmVar, b0kVar2, 0);
                } else {
                    b0kVar2.b0();
                }
                return rih1Var;
            case 1:
                Function0 function0 = (Function0) obj5;
                iu30 iu30Var2 = (iu30) obj6;
                ((Integer) obj3).getClass();
                x340 x340Var = (b0k) obj2;
                x340Var.i0(759876635);
                Object objT2 = x340Var.T();
                m4c m4cVar = fkj0.X;
                Object obj7 = objT2;
                if (objT2 == m4cVar) {
                    mdt mdtVarA = yv91.a(function0);
                    x340Var.s0(mdtVarA);
                    obj7 = mdtVarA;
                }
                tob1 tob1Var = (tob1) obj7;
                Object objT3 = x340Var.T();
                Object obj8 = objT3;
                if (objT3 == m4cVar) {
                    Offset offset = (Offset) tob1Var.getValue();
                    long j = offset.a;
                    o95 o95Var = new o95(offset, vy51.b, new Offset(vy51.c), 8);
                    x340Var.s0(o95Var);
                    obj8 = o95Var;
                }
                o95 o95Var2 = (o95) obj8;
                boolean zI = x340Var.i(o95Var2);
                Object objT4 = x340Var.T();
                Object obj9 = objT4;
                if (zI || objT4 == m4cVar) {
                    n641 n641Var = new n641(tob1Var, o95Var2, (lnm) null, (byte) 17);
                    x340Var.s0(n641Var);
                    obj9 = n641Var;
                }
                qxd0.t(rih1Var, x340Var, (vu30) obj9);
                final ie5 ie5Var = o95Var2.c;
                boolean zG = x340Var.g(ie5Var);
                Object objT5 = x340Var.T();
                Object obj10 = objT5;
                if (zG || objT5 == m4cVar) {
                    final boolean z2 = z ? 1 : 0;
                    Function0 function1 = new Function0() { // from class: p.uy51
                        public final Object invoke() {
                            byte b2 = z2;
                            tob1 tob1Var2 = ie5Var;
                            switch (b2) {
                                case 0:
                                    Offset offset2 = (Offset) tob1Var2.getValue();
                                    long j2 = offset2.a;
                                    return offset2;
                                case 1:
                                    le5 le5Var = vy51.a;
                                    Offset offset3 = (Offset) tob1Var2.getValue();
                                    long j3 = offset3.a;
                                    return offset3;
                                case 2:
                                    return Boolean.valueOf(((Number) tob1Var2.getValue()).floatValue() > 0.0f);
                                default:
                                    return Boolean.valueOf(((Number) tob1Var2.getValue()).floatValue() > 0.0f);
                            }
                        }
                    };
                    x340Var.s0(function1);
                    obj10 = function1;
                }
                qim0 qim0Var = (qim0) iu30Var2.invoke((Function0) obj10);
                x340Var.r(false);
                return qim0Var;
            case 2:
                Spannable spannable = (Spannable) obj6;
                qw4 qw4Var = (qw4) obj5;
                zma1 zma1Var = (zma1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int iIntValue3 = ((Integer) obj3).intValue();
                FontFamily fontFamily = zma1Var.f;
                FontWeight fontWeight = zma1Var.c;
                if (fontWeight == null) {
                    fontWeight = FontWeight.t;
                }
                FontStyle fontStyle = zma1Var.d;
                FontStyle fontStyle2 = new FontStyle(fontStyle != null ? fontStyle.a : 0);
                FontSynthesis fontSynthesis = zma1Var.e;
                spannable.setSpan(new qlg((Typeface) qw4Var.J(fontFamily, fontWeight, fontStyle2, new FontSynthesis(fontSynthesis != null ? fontSynthesis.a : 65535)), (byte) 2), iIntValue2, iIntValue3, 33);
                return rih1Var;
            case 3:
                m6e1 m6e1Var = (m6e1) obj6;
                idn0 idn0Var = (idn0) obj5;
                ((Integer) obj3).getClass();
                x340 x340Var2 = (b0k) obj2;
                x340Var2.i0(-102778667);
                Object objT6 = x340Var2.T();
                m4c m4cVar2 = fkj0.X;
                Object obj11 = objT6;
                if (objT6 == m4cVar2) {
                    c9n c9nVarM = qxd0.M(o6x.a, x340Var2);
                    x340Var2.s0(c9nVarM);
                    obj11 = c9nVarM;
                }
                c9n c9nVar = (c9n) obj11;
                Object objT7 = x340Var2.T();
                Object obj12 = objT7;
                if (objT7 == m4cVar2) {
                    hrr0 hrr0VarQ = v8r.q((Object) null);
                    x340Var2.s0(hrr0VarQ);
                    obj12 = hrr0VarQ;
                }
                ven0 ven0Var = (ven0) obj12;
                ven0 ven0VarS = v8r.s(m6e1Var, x340Var2);
                boolean zG2 = x340Var2.g(idn0Var);
                Object objT8 = x340Var2.T();
                Object obj13 = objT8;
                if (zG2 || objT8 == m4cVar2) {
                    gub0 gub0Var = new gub0(ven0Var, idn0Var, (byte) 26);
                    x340Var2.s0(gub0Var);
                    obj13 = gub0Var;
                }
                qxd0.i(idn0Var, (iu30) obj13, x340Var2);
                boolean zI2 = x340Var2.i(c9nVar) | x340Var2.g(idn0Var) | x340Var2.g(ven0VarS);
                Object objT9 = x340Var2.T();
                if (zI2 || objT9 == m4cVar2) {
                    gqf gqfVar = new gqf(c9nVar, ven0Var, idn0Var, ven0VarS, (byte) 3);
                    x340Var2.s0(gqfVar);
                    objT9 = gqfVar;
                }
                qim0 qim0VarB = f8d1.b(nim0.a, idn0Var, (PointerInputEventHandler) objT9);
                x340Var2.r(false);
                return qim0VarB;
            default:
                yye1 yye1Var = (yye1) obj6;
                hsl1 hsl1Var = (hsl1) obj2;
                yye1Var.e.bottomMargin = yye1Var.f + hsl1Var.a.i(527).d;
                ((View) obj5).requestLayout();
                return hsl1Var;
        }
    }

    public /* synthetic */ gjm(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
