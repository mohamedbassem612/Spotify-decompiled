package p;

import android.content.Context;
import android.text.format.Formatter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class x0v extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ p0v c;
    public final /* synthetic */ r0v d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0v(boolean z, p0v p0vVar, r0v r0vVar) {
        super(3);
        this.a = (byte) 1;
        this.b = z;
        this.c = p0vVar;
        this.d = r0vVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        x340 x340Var;
        b0k b0kVar;
        int i;
        String str;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        p0v p0vVar = this.c;
        r0v r0vVar = this.d;
        boolean z = this.b;
        switch (b) {
            case 0:
                x340 x340Var2 = (b0k) obj2;
                ((Number) obj3).intValue();
                if (z) {
                    x340 x340Var3 = x340Var2;
                    x340Var3.i0(1687578170);
                    qxy0.b(x340Var3, 0);
                    x340Var3.r(false);
                } else {
                    x340 x340Var4 = x340Var2;
                    x340Var4.i0(1687623461);
                    qxy0.a(p0vVar.c, 0, r0vVar != null ? r0vVar.b : null, x340Var4);
                    x340Var4.r(false);
                }
                return rih1Var;
            case 1:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
                x340 x340Var5 = (x340) b0kVar2;
                int iHashCode = Long.hashCode(x340Var5.T);
                xos0 xos0VarM = x340Var5.m();
                qim0 qim0VarE = zr7.E(b0kVar2, nim0.a);
                hzj.A.getClass();
                x340 x340Var6 = (x340) b0kVar2;
                if (x340Var6.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var6.m0();
                if (x340Var6.S) {
                    x340Var6.l(hmb0.t1);
                } else {
                    x340Var6.v0();
                }
                nko1.H(mbhVarA, b0kVar2, y580.O0);
                nko1.H(xos0VarM, b0kVar2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
                nko1.F(b0kVar2);
                nko1.H(qim0VarE, b0kVar2, y580.Y);
                if (z) {
                    x340Var6.i0(-1290406947);
                    uwr uwrVar = cbx.a;
                    qxy0.n(0.4f, 6, cbx.b(b0kVar2).a.c, b0kVar2);
                    x340Var6.r(false);
                    b0kVar = b0kVar2;
                    x340Var = x340Var6;
                } else {
                    x340Var6.i0(-1290276499);
                    Context context = (Context) x340Var6.k(AndroidCompositionLocals_androidKt.b);
                    Long l = p0vVar.d;
                    String shortFileSize = l != null ? Formatter.formatShortFileSize(context, l.longValue()) : null;
                    if (shortFileSize == null) {
                        shortFileSize = "";
                    }
                    String strO0 = r0vVar != null ? r0vVar.d : null;
                    if (strO0 == null) {
                        x340Var6.i0(-1046812187);
                        int iC = l1d.C(p0vVar.c);
                        if (iC == 0) {
                            i = 2131955073;
                        } else if (iC == 1) {
                            i = 2131955071;
                        } else if (iC == 2) {
                            i = 2131955074;
                        } else {
                            if (iC != 3) {
                                eg.o();
                                return null;
                            }
                            i = 2131955072;
                        }
                        strO0 = cwl1.o0(x340Var6, i);
                    } else {
                        x340Var6.i0(-1046812900);
                    }
                    x340Var6.r(false);
                    String str2 = r0vVar != null ? r0vVar.c : null;
                    List listM = p7h.M(new String[]{shortFileSize, strO0, str2 != null ? str2 : ""});
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : listM) {
                        if (!ihc1.y0((String) obj4)) {
                            arrayList.add(obj4);
                        }
                    }
                    String strY0 = o7h.y0(arrayList, " • ", (String) null, (String) null, (iu30) null, 62);
                    uwr uwrVar2 = cbx.a;
                    x340Var = x340Var6;
                    uwo1.e(strY0, (qim0) null, cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar2, 0, 0, 1714);
                    b0kVar = b0kVar2;
                    x340Var.r(false);
                }
                qxy0.j(p0vVar.e, b0kVar, 0);
                x340Var.r(true);
                return rih1Var;
            default:
                x340 x340Var7 = (b0k) obj2;
                ((Number) obj3).intValue();
                if (z) {
                    x340 x340Var8 = x340Var7;
                    x340Var8.i0(-1184906122);
                    uwr uwrVar3 = cbx.a;
                    qxy0.n(0.6f, 6, cbx.b(x340Var8).a.d, x340Var8);
                    x340Var8.r(false);
                } else {
                    x340 x340Var9 = x340Var7;
                    x340Var9.i0(-1184788198);
                    if (r0vVar == null || (str = r0vVar.a) == null) {
                        str = p0vVar.b;
                    }
                    uwo1.e(str, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var9, 0, 0, 1726);
                    x340Var9.r(false);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0v(boolean z, r0v r0vVar, p0v p0vVar, byte b) {
        super(3);
        this.a = b;
        this.b = z;
        this.d = r0vVar;
        this.c = p0vVar;
    }
}
