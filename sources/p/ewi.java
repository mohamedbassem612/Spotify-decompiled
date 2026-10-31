package p;

import android.graphics.Color;
import android.net.Uri;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ewi extends hab0 implements bv30 {
    public static final ewi N0;
    public static final ewi O0;
    public static final ewi P0;
    public static final ewi Q0;
    public static final ewi R0;
    public static final ewi S0;
    public static final ewi T0;
    public static final ewi U0;
    public static final ewi V0;
    public static final ewi W0;
    public static final ewi X;
    public static final ewi X0;
    public static final ewi Y;
    public static final ewi Y0;
    public static final ewi Z;
    public static final ewi Z0;
    public static final ewi a1;
    public static final ewi b;
    public static final ewi b1;
    public static final ewi c;
    public static final ewi c1;
    public static final ewi d;
    public static final ewi d1;
    public static final ewi e;
    public static final ewi e1;
    public static final ewi f;
    public static final ewi g;
    public static final ewi h;
    public static final ewi i;
    public static final ewi t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 5;
        b = new ewi(i2, (byte) 0);
        c = new ewi(i2, (byte) 1);
        d = new ewi(i2, (byte) 2);
        e = new ewi(i2, (byte) 3);
        f = new ewi(i2, (byte) 4);
        g = new ewi(i2, (byte) 5);
        h = new ewi(i2, (byte) 6);
        i = new ewi(i2, (byte) 7);
        t = new ewi(i2, (byte) 8);
        X = new ewi(i2, (byte) 9);
        Y = new ewi(i2, (byte) 10);
        Z = new ewi(i2, (byte) 11);
        N0 = new ewi(i2, (byte) 12);
        O0 = new ewi(i2, (byte) 13);
        P0 = new ewi(i2, (byte) 14);
        Q0 = new ewi(i2, (byte) 15);
        R0 = new ewi(i2, (byte) 16);
        S0 = new ewi(i2, (byte) 17);
        T0 = new ewi(i2, (byte) 18);
        U0 = new ewi(i2, (byte) 19);
        V0 = new ewi(i2, (byte) 20);
        W0 = new ewi(i2, (byte) 21);
        X0 = new ewi(i2, (byte) 22);
        Y0 = new ewi(i2, (byte) 23);
        Z0 = new ewi(i2, (byte) 24);
        a1 = new ewi(i2, (byte) 25);
        b1 = new ewi(i2, (byte) 26);
        c1 = new ewi(i2, (byte) 27);
        d1 = new ewi(i2, (byte) 28);
        e1 = new ewi(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ewi(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0164  */
    /* JADX WARN: Code duplicated, block: B:103:0x016c  */
    /* JADX WARN: Code duplicated, block: B:106:0x017a  */
    /* JADX WARN: Code duplicated, block: B:107:0x017d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0185  */
    /* JADX WARN: Code duplicated, block: B:112:0x018b  */
    /* JADX WARN: Code duplicated, block: B:113:0x018d  */
    /* JADX WARN: Code duplicated, block: B:117:0x0194  */
    /* JADX WARN: Code duplicated, block: B:118:0x0197  */
    /* JADX WARN: Code duplicated, block: B:120:0x019a  */
    /* JADX WARN: Code duplicated, block: B:122:0x019f  */
    /* JADX WARN: Code duplicated, block: B:124:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:125:0x01af  */
    /* JADX WARN: Code duplicated, block: B:128:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:131:0x01be  */
    /* JADX WARN: Code duplicated, block: B:133:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:136:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:139:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:140:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:142:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:144:0x0208  */
    /* JADX WARN: Code duplicated, block: B:146:0x020c  */
    /* JADX WARN: Code duplicated, block: B:147:0x0210  */
    /* JADX WARN: Code duplicated, block: B:149:0x0224  */
    /* JADX WARN: Code duplicated, block: B:151:0x022b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:158:0x0245  */
    /* JADX WARN: Code duplicated, block: B:160:0x024e  */
    /* JADX WARN: Code duplicated, block: B:162:0x0264  */
    /* JADX WARN: Code duplicated, block: B:164:0x0268  */
    /* JADX WARN: Code duplicated, block: B:165:0x026b  */
    /* JADX WARN: Code duplicated, block: B:167:0x027e  */
    /* JADX WARN: Code duplicated, block: B:169:0x0284  */
    /* JADX WARN: Code duplicated, block: B:171:0x0288  */
    /* JADX WARN: Code duplicated, block: B:172:0x028b  */
    /* JADX WARN: Code duplicated, block: B:174:0x029e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:175:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:179:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:180:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:182:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:185:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:187:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:188:0x02db  */
    /* JADX WARN: Code duplicated, block: B:190:0x02df  */
    /* JADX WARN: Code duplicated, block: B:192:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:193:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:194:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:196:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:198:0x0303  */
    /* JADX WARN: Code duplicated, block: B:200:0x0307  */
    /* JADX WARN: Code duplicated, block: B:201:0x030a  */
    /* JADX WARN: Code duplicated, block: B:202:0x030d  */
    /* JADX WARN: Code duplicated, block: B:204:0x0311  */
    /* JADX WARN: Code duplicated, block: B:205:0x0314  */
    /* JADX WARN: Code duplicated, block: B:219:0x0361  */
    /* JADX WARN: Code duplicated, block: B:220:0x0367  */
    /* JADX WARN: Code duplicated, block: B:222:0x036b  */
    /* JADX WARN: Code duplicated, block: B:224:0x0372  */
    /* JADX WARN: Code duplicated, block: B:226:0x0389  */
    /* JADX WARN: Code duplicated, block: B:227:0x038d  */
    /* JADX WARN: Code duplicated, block: B:229:0x0394  */
    /* JADX WARN: Code duplicated, block: B:236:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:237:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:249:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:252:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:257:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:260:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:262:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:265:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:268:0x0407  */
    /* JADX WARN: Code duplicated, block: B:270:0x040d  */
    /* JADX WARN: Code duplicated, block: B:274:0x0418  */
    /* JADX WARN: Code duplicated, block: B:276:0x0420  */
    /* JADX WARN: Code duplicated, block: B:279:0x0429  */
    /* JADX WARN: Code duplicated, block: B:282:0x042d  */
    /* JADX WARN: Code duplicated, block: B:283:0x042f  */
    /* JADX WARN: Code duplicated, block: B:291:0x0445  */
    /* JADX WARN: Code duplicated, block: B:293:0x0449  */
    /* JADX WARN: Code duplicated, block: B:294:0x044c  */
    /* JADX WARN: Code duplicated, block: B:297:0x0454  */
    /* JADX WARN: Code duplicated, block: B:299:0x045a  */
    /* JADX WARN: Code duplicated, block: B:300:0x0464  */
    /* JADX WARN: Code duplicated, block: B:303:0x0473 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:306:0x047a  */
    /* JADX WARN: Code duplicated, block: B:309:0x0481  */
    /* JADX WARN: Code duplicated, block: B:311:0x048f  */
    /* JADX WARN: Code duplicated, block: B:314:0x0496  */
    /* JADX WARN: Code duplicated, block: B:316:0x049b  */
    /* JADX WARN: Code duplicated, block: B:319:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:321:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:323:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:325:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:326:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:328:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:329:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:331:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:333:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:343:0x0529 A[PHI: r3
      0x0529: PHI (r3v99 p.iu30) = (r3v97 p.iu30), (r3v100 p.iu30) binds: [B:342:0x0527, B:338:0x0520] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:349:0x0536  */
    /* JADX WARN: Code duplicated, block: B:352:0x0554  */
    /* JADX WARN: Code duplicated, block: B:354:0x0558  */
    /* JADX WARN: Code duplicated, block: B:356:0x055c  */
    /* JADX WARN: Code duplicated, block: B:358:0x0560  */
    /* JADX WARN: Code duplicated, block: B:361:0x034d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:362:0x0349 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:363:0x0168 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:365:0x0345 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:366:0x0341 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:367:0x033d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00da  */
    /* JADX WARN: Code duplicated, block: B:69:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:71:0x0103  */
    /* JADX WARN: Code duplicated, block: B:82:0x0125  */
    /* JADX WARN: Code duplicated, block: B:84:0x012b  */
    /* JADX WARN: Code duplicated, block: B:86:0x012f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0131  */
    /* JADX WARN: Code duplicated, block: B:90:0x0139  */
    /* JADX WARN: Code duplicated, block: B:91:0x0140  */
    /* JADX WARN: Code duplicated, block: B:93:0x0146  */
    /* JADX WARN: Code duplicated, block: B:94:0x014f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0155  */
    /* JADX WARN: Code duplicated, block: B:98:0x015f  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        xsf0 xsf0Var;
        m4c m4cVar;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        ArrayList arrayList;
        Iterator it;
        int i2;
        int i3;
        srf0 srf0Var;
        bff0 bff0Var;
        dsf0 dsf0Var;
        boolean z5;
        usf0 ssf0Var;
        ArrayList arrayList2;
        int i4;
        usf0 usf0Var;
        vhc0 vhc0Var;
        boolean zJ;
        rsf0 qsf0Var;
        boolean z6;
        xrf0 xrf0Var;
        int i5;
        int iA;
        xlf0 xlf0Var;
        int length;
        String str;
        String str2;
        List list;
        String str3;
        boolean z7;
        lsf0 lsf0Var;
        float f2;
        int i6;
        int i7;
        Object next;
        int i8;
        xlf0 xlf0Var2;
        String str4;
        String str5;
        String str6;
        int iC;
        int i9;
        flb0 flb0Var;
        flb0 flb0Var2;
        flb0 flb0Var3;
        flb0 flb0Var4;
        int i10;
        int i11;
        String str7;
        flb0 flb0Var5;
        flb0 flb0Var6;
        boolean z8;
        boolean z9;
        krf0 krf0Var;
        boolean z10;
        jrf0 jrf0Var;
        lrf0 lrf0Var;
        long jE;
        int iG;
        ylf0 zlf0Var;
        int iG2;
        ylf0 ylf0Var;
        lrf0 lrf0Var2;
        long jE2;
        int iG3;
        mrf0 mrf0Var;
        Boolean boolValueOf;
        int i12;
        List list2;
        iu30 iu30Var;
        int i13;
        Object objT;
        gsf0 gsf0Var = (gsf0) obj2;
        iu30 iu30Var2 = (iu30) obj3;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar2 = fkj0.X;
        x340 x340Var = (b0k) obj4;
        boolean zG = x340Var.g(gsf0Var);
        Object objT2 = x340Var.T();
        if (zG || objT2 == m4cVar2) {
            boolean z11 = gsf0Var.N0;
            List list3 = gsf0Var.g;
            zrf0 zrf0Var = gsf0Var.X;
            srf0 srf0Var2 = gsf0Var.Y;
            dsf0 dsf0Var2 = gsf0Var.h;
            dsf0 dsf0Var3 = dsf0Var2 instanceof dsf0 ? dsf0Var2 : null;
            boolean z12 = (dsf0Var3 != null ? dsf0Var3.c : 0) == 3;
            boolean z13 = z11 && (srf0Var2.b instanceof qrf0) && (srf0Var2.a instanceof hrf0);
            rrf0 rrf0Var = srf0Var2.b;
            bff0 bff0Var2 = srf0Var2.c;
            mrf0 mrf0Var2 = srf0Var2.a;
            qrf0 qrf0Var = qrf0.a;
            boolean zJ2 = u890.j(rrf0Var, qrf0Var);
            prf0 prf0Var = prf0.a;
            orf0 orf0Var = orf0.a;
            if (zJ2 || u890.j(rrf0Var, orf0Var)) {
                xsf0Var = vsf0.a;
            } else {
                if (!u890.j(rrf0Var, prf0Var)) {
                    eg.o();
                    return null;
                }
                xsf0Var = wsf0.a;
            }
            xsf0 xsf0Var2 = xsf0Var;
            boolean z14 = gsf0Var.P0;
            boolean z15 = gsf0Var.S0 && z13;
            if (gsf0Var.T0 && (rrf0Var instanceof qrf0) && (mrf0Var2 instanceof hrf0)) {
                m4cVar = m4cVar2;
                if (gsf0Var.c == dhf0.d && !gsf0Var.e) {
                    z = true;
                }
                if (gsf0Var.U0 || !z13) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z12) {
                    z3 = gsf0Var.i;
                } else if (dsf0Var3.b) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                List list4 = list3;
                z4 = z3;
                arrayList = new ArrayList(q7h.U(list4, 10));
                it = list4.iterator();
                i2 = 0;
                while (it.hasNext()) {
                    next = it.next();
                    i8 = i2 + 1;
                    if (i2 >= 0) {
                        p7h.T();
                        throw null;
                    }
                    Iterator it2 = it;
                    xlf0Var2 = (xlf0) next;
                    int i14 = iIntValue;
                    if (dsf0Var3 != null || (list2 = dsf0Var3.a) == null) {
                        str4 = null;
                    } else {
                        str4 = (String) ((i2 < 0 || i2 >= list2.size()) ? "" : list2.get(i2));
                    }
                    if (str4 == null) {
                        str4 = "";
                    }
                    if (z12) {
                        str5 = str4;
                    } else {
                        str5 = xlf0Var2.b;
                    }
                    if (u890.j(rrf0Var, prf0Var)) {
                        str6 = str4;
                        i9 = 3;
                    } else if (u890.j(rrf0Var, orf0Var)) {
                        i9 = 4;
                        str6 = str4;
                    } else {
                        if (u890.j(rrf0Var, qrf0Var)) {
                            eg.o();
                            return null;
                        }
                        str6 = str4;
                        iC = l1d.C(gsf0Var.Z);
                        if (iC != 0) {
                            i9 = 1;
                        } else {
                            if (iC == 1) {
                                eg.o();
                                return null;
                            }
                            i9 = 2;
                        }
                    }
                    flb0Var = flb0.a;
                    flb0Var2 = flb0.b;
                    String str8 = str5;
                    if (z4) {
                        flb0Var3 = flb0Var2;
                    } else {
                        flb0Var3 = flb0Var;
                    }
                    if (u890.j(rrf0Var, prf0Var)) {
                        flb0Var4 = flb0Var;
                        int i15 = gsf0Var.O0 ? 3 : 5;
                        int i16 = i15;
                        if (dsf0Var3 != null) {
                            i10 = dsf0Var3.c;
                        } else {
                            i10 = 0;
                        }
                        if (i10 == 0) {
                            i11 = -1;
                        } else {
                            i11 = zsf0.a[l1d.C(i10)];
                        }
                        if (i11 == 1) {
                            str7 = str6;
                        } else {
                            str7 = "";
                        }
                        flb0Var5 = flb0Var4;
                        if (dsf0Var3 == null && dsf0Var3.b) {
                            flb0Var6 = flb0Var2;
                        } else {
                            flb0Var6 = flb0Var5;
                        }
                        if (!z12 || str6.length() <= 0) {
                            z8 = false;
                        } else {
                            z8 = true;
                        }
                        String str9 = xlf0Var2.b;
                        z9 = mrf0Var2 instanceof hrf0;
                        krf0Var = krf0.a;
                        if (z9) {
                            srf0Var2 = srf0Var2;
                            z9 = z9;
                            ylf0Var = ylf0.a;
                            dsf0Var3 = dsf0Var3;
                        } else {
                            z10 = mrf0Var2 instanceof irf0;
                            jrf0Var = jrf0.a;
                            if (z10) {
                                lrf0Var2 = (lrf0) ((irf0) mrf0Var2).a.get(new vhc0(i2));
                                if (u890.j(lrf0Var2, krf0Var)) {
                                    if (bff0Var2.f) {
                                        iG3 = bff0Var2.c;
                                    } else {
                                        uwr uwrVar = cbx.a;
                                        iG3 = z4p1.G(((vex) zex.a.e).f);
                                    }
                                    jE2 = z4p1.e(iG3);
                                } else {
                                    dsf0Var3 = dsf0Var3;
                                    if (u890.j(lrf0Var2, jrf0Var) && lrf0Var2 != null) {
                                        eg.o();
                                        return null;
                                    }
                                    uwr uwrVar2 = cbx.a;
                                    jE2 = ((vex) zex.a.e).h;
                                }
                                zlf0Var = new zlf0(jE2);
                            } else {
                                dsf0Var3 = dsf0Var3;
                                if (mrf0Var2 instanceof mrf0) {
                                    eg.o();
                                    return null;
                                }
                                lrf0Var = (lrf0) mrf0Var2.b.get(new vhc0(i2));
                                if (u890.j(lrf0Var, krf0Var)) {
                                    if (bff0Var2.f) {
                                        iG2 = bff0Var2.c;
                                    } else {
                                        uwr uwrVar3 = cbx.a;
                                        iG2 = z4p1.G(((vex) zex.a.e).f);
                                    }
                                    jE = z4p1.e(iG2);
                                } else if (u890.j(lrf0Var, jrf0Var)) {
                                    if (bff0Var2.f) {
                                        iG = bff0Var2.b;
                                    } else {
                                        uwr uwrVar4 = cbx.a;
                                        iG = z4p1.G(((vex) zex.a.e).b);
                                    }
                                    jE = z4p1.e(iG);
                                } else {
                                    if (lrf0Var == null) {
                                        eg.o();
                                        return null;
                                    }
                                    uwr uwrVar5 = cbx.a;
                                    jE = ((vex) zex.a.e).h;
                                }
                                zlf0Var = new zlf0(jE);
                            }
                            ylf0Var = zlf0Var;
                        }
                        if (mrf0Var2 instanceof mrf0) {
                            mrf0Var = mrf0Var2;
                        } else {
                            mrf0Var = null;
                        }
                        if (mrf0Var == null) {
                            boolValueOf = null;
                        } else {
                            if (!mrf0Var.c) {
                                mrf0Var = null;
                            }
                            if (mrf0Var != null) {
                                boolValueOf = Boolean.valueOf(u890.j(mrf0Var.b.get(new vhc0(i2)), krf0Var));
                            } else {
                                boolValueOf = null;
                            }
                        }
                        if (z9) {
                            if (zrf0Var instanceof asf0) {
                                i12 = bff0Var2.c;
                            } else {
                                i12 = bff0Var2.d;
                            }
                        } else {
                            if (mrf0Var2 instanceof grf0) {
                                eg.o();
                                return null;
                            }
                            if (u890.j(((grf0) mrf0Var2).f0().get(new vhc0(i2)), krf0Var)) {
                                if (bff0Var2.f) {
                                    i12 = bff0Var2.a;
                                } else {
                                    i12 = bff0Var2.c;
                                }
                            } else if (bff0Var2.f) {
                                i12 = bff0Var2.c;
                            } else {
                                i12 = bff0Var2.d;
                            }
                        }
                        arrayList.add(new bmf0(i2, str8, flb0Var3, i16, str7, flb0Var6, z8, z4p1.e(i12), z4p1.e(bff0Var2.c), ylf0Var, boolValueOf, i9, str9, z12));
                        bff0Var2 = bff0Var2;
                        dsf0Var3 = dsf0Var3;
                        i2 = i8;
                        it = it2;
                        srf0Var2 = srf0Var2;
                        iIntValue = i14;
                        x340Var = x340Var;
                    } else {
                        flb0Var4 = flb0Var;
                    }
                    int i17 = i15;
                    if (dsf0Var3 != null) {
                        i10 = dsf0Var3.c;
                    } else {
                        i10 = 0;
                    }
                    if (i10 == 0) {
                        i11 = -1;
                    } else {
                        i11 = zsf0.a[l1d.C(i10)];
                    }
                    if (i11 == 1) {
                        str7 = str6;
                    } else {
                        str7 = "";
                    }
                    flb0Var5 = flb0Var4;
                    if (dsf0Var3 == null) {
                        flb0Var6 = flb0Var5;
                    } else {
                        flb0Var6 = flb0Var5;
                    }
                    if (z12) {
                        z8 = false;
                    } else {
                        z8 = false;
                    }
                    String str10 = xlf0Var2.b;
                    z9 = mrf0Var2 instanceof hrf0;
                    krf0Var = krf0.a;
                    if (z9) {
                        srf0Var2 = srf0Var2;
                        z9 = z9;
                        ylf0Var = ylf0.a;
                        dsf0Var3 = dsf0Var3;
                    } else {
                        z10 = mrf0Var2 instanceof irf0;
                        jrf0Var = jrf0.a;
                        if (z10) {
                            lrf0Var2 = (lrf0) ((irf0) mrf0Var2).a.get(new vhc0(i2));
                            if (u890.j(lrf0Var2, krf0Var)) {
                                if (bff0Var2.f) {
                                    iG3 = bff0Var2.c;
                                } else {
                                    uwr uwrVar6 = cbx.a;
                                    iG3 = z4p1.G(((vex) zex.a.e).f);
                                }
                                jE2 = z4p1.e(iG3);
                            } else {
                                dsf0Var3 = dsf0Var3;
                                if (u890.j(lrf0Var2, jrf0Var)) {
                                }
                                uwr uwrVar7 = cbx.a;
                                jE2 = ((vex) zex.a.e).h;
                            }
                            zlf0Var = new zlf0(jE2);
                        } else {
                            dsf0Var3 = dsf0Var3;
                            if (mrf0Var2 instanceof mrf0) {
                                eg.o();
                                return null;
                            }
                            lrf0Var = (lrf0) mrf0Var2.b.get(new vhc0(i2));
                            if (u890.j(lrf0Var, krf0Var)) {
                                if (bff0Var2.f) {
                                    iG2 = bff0Var2.c;
                                } else {
                                    uwr uwrVar8 = cbx.a;
                                    iG2 = z4p1.G(((vex) zex.a.e).f);
                                }
                                jE = z4p1.e(iG2);
                            } else if (u890.j(lrf0Var, jrf0Var)) {
                                if (bff0Var2.f) {
                                    iG = bff0Var2.b;
                                } else {
                                    uwr uwrVar9 = cbx.a;
                                    iG = z4p1.G(((vex) zex.a.e).b);
                                }
                                jE = z4p1.e(iG);
                            } else {
                                if (lrf0Var == null) {
                                    eg.o();
                                    return null;
                                }
                                uwr uwrVar10 = cbx.a;
                                jE = ((vex) zex.a.e).h;
                            }
                            zlf0Var = new zlf0(jE);
                        }
                        ylf0Var = zlf0Var;
                    }
                    if (mrf0Var2 instanceof mrf0) {
                        mrf0Var = mrf0Var2;
                    } else {
                        mrf0Var = null;
                    }
                    if (mrf0Var == null) {
                        boolValueOf = null;
                    } else {
                        if (!mrf0Var.c) {
                            mrf0Var = null;
                        }
                        if (mrf0Var != null) {
                            boolValueOf = Boolean.valueOf(u890.j(mrf0Var.b.get(new vhc0(i2)), krf0Var));
                        } else {
                            boolValueOf = null;
                        }
                    }
                    if (z9) {
                        if (zrf0Var instanceof asf0) {
                            i12 = bff0Var2.c;
                        } else {
                            i12 = bff0Var2.d;
                        }
                    } else {
                        if (mrf0Var2 instanceof grf0) {
                            eg.o();
                            return null;
                        }
                        if (u890.j(((grf0) mrf0Var2).f0().get(new vhc0(i2)), krf0Var)) {
                            if (bff0Var2.f) {
                                i12 = bff0Var2.a;
                            } else {
                                i12 = bff0Var2.c;
                            }
                        } else if (bff0Var2.f) {
                            i12 = bff0Var2.c;
                        } else {
                            i12 = bff0Var2.d;
                        }
                    }
                    arrayList.add(new bmf0(i2, str8, flb0Var3, i17, str7, flb0Var6, z8, z4p1.e(i12), z4p1.e(bff0Var2.c), ylf0Var, boolValueOf, i9, str10, z12));
                    bff0Var2 = bff0Var2;
                    dsf0Var3 = dsf0Var3;
                    i2 = i8;
                    it = it2;
                    srf0Var2 = srf0Var2;
                    iIntValue = i14;
                    x340Var = x340Var;
                }
                i3 = iIntValue;
                srf0Var = srf0Var2;
                x340 x340Var2 = x340Var;
                bff0Var = bff0Var2;
                dsf0Var = dsf0Var3;
                z5 = mrf0Var2 instanceof irf0;
                ssf0Var = tsf0.a;
                if (z5) {
                    arrayList2 = arrayList;
                    usf0Var = ssf0Var;
                    i4 = 0;
                } else {
                    if (mrf0Var2 instanceof mrf0) {
                        vhc0Var = mrf0Var2.a;
                        if (vhc0Var != null) {
                            arrayList2 = arrayList;
                            i4 = 0;
                            ssf0Var = new ssf0(yoi1.p(vhc0Var.a, 0, list3.size() - 1), true, false);
                        } else {
                            arrayList2 = arrayList;
                            i4 = 0;
                        }
                    } else {
                        arrayList2 = arrayList;
                        i4 = 0;
                        if (mrf0Var2 instanceof hrf0) {
                            eg.o();
                            return null;
                        }
                        if (!(zrf0Var instanceof bsf0) && !(zrf0Var instanceof asf0)) {
                            if (zrf0Var instanceof zrf0) {
                                eg.o();
                                return null;
                            }
                            zrf0 zrf0Var2 = zrf0Var;
                            ssf0Var = new ssf0(zrf0Var2.a.a(), zrf0Var2.b, zrf0Var2.c);
                        }
                    }
                    usf0Var = ssf0Var;
                }
                zJ = u890.j(rrf0Var, qrf0Var);
                qsf0Var = osf0.a;
                if (!zJ || u890.j(rrf0Var, orf0Var)) {
                    z6 = zrf0Var instanceof bsf0;
                    rsf0 rsf0Var = psf0.a;
                    if (!z6 && !(zrf0Var instanceof asf0)) {
                        if (!(zrf0Var instanceof zrf0)) {
                            eg.o();
                            return null;
                        }
                        if (!(mrf0Var2 instanceof grf0)) {
                            if (!(mrf0Var2 instanceof hrf0)) {
                                eg.o();
                                return null;
                            }
                            xrf0Var = zrf0Var.a;
                            if (xrf0Var.a() >= 0) {
                                i5 = 1;
                                if (xrf0Var.a() <= list3.size() - 1) {
                                    iA = xrf0Var.a();
                                    if (!z12 || (xrf0Var instanceof wrf0)) {
                                        xlf0Var = (xlf0) o7h.t0(iA, list3);
                                        if (xlf0Var != null || (str3 = xlf0Var.b) == null) {
                                            length = i4;
                                        } else {
                                            length = str3.length();
                                        }
                                        if (z12) {
                                            if (dsf0Var != null || (list = dsf0Var.a) == null) {
                                                str = null;
                                            } else {
                                                str = (String) ((iA < 0 || iA >= list.size()) ? "" : list.get(iA));
                                            }
                                            if (str == null) {
                                                str2 = "";
                                            } else {
                                                str2 = str;
                                            }
                                            if (str2.length() > 0) {
                                                length = str2.length();
                                            }
                                        }
                                    } else {
                                        length = xrf0Var.b;
                                    }
                                    if (z11) {
                                        qsf0Var = new nsf0(xrf0Var.a(), length);
                                    } else {
                                        qsf0Var = new qsf0(xrf0Var.a(), length);
                                    }
                                }
                            }
                            if ((gsf0Var.t instanceof urf0) || z5) {
                                z7 = i4;
                            } else {
                                z7 = i5;
                            }
                            if (srf0Var.e) {
                                lsf0Var = new lsf0(gsf0Var.d.c, bff0Var.d);
                            } else {
                                lsf0Var = o810.N0;
                            }
                            lsf0 lsf0Var2 = lsf0Var;
                            if (rrf0Var instanceof prf0) {
                                f2 = 1.0f;
                            } else {
                                f2 = gsf0Var.R0;
                            }
                            float f3 = f2;
                            if (mrf0Var2 instanceof hrf0) {
                                if (u890.j(rrf0Var, qrf0Var)) {
                                    i6 = 16;
                                } else {
                                    if (u890.j(rrf0Var, orf0Var)) {
                                        i6 = 48;
                                    } else {
                                        if (!u890.j(rrf0Var, prf0Var)) {
                                            eg.o();
                                            return null;
                                        }
                                        i7 = i4;
                                    }
                                    objT2 = v8r.q(new ysf0(xsf0Var2, z13, arrayList2, usf0Var, qsf0Var, z7, lsf0Var2, f3, i7, gsf0Var.i, srf0Var.f, mrf0Var2 instanceof grf0, gsf0Var.Q0, gsf0Var.V0, gsf0Var.W0, z15, z, z2, srf0Var.g, z14));
                                    x340Var = x340Var2;
                                    x340Var.s0(objT2);
                                }
                            } else {
                                if (!(mrf0Var2 instanceof grf0)) {
                                    eg.o();
                                    return null;
                                }
                                i6 = 8;
                            }
                            i7 = i6;
                            objT2 = v8r.q(new ysf0(xsf0Var2, z13, arrayList2, usf0Var, qsf0Var, z7, lsf0Var2, f3, i7, gsf0Var.i, srf0Var.f, mrf0Var2 instanceof grf0, gsf0Var.Q0, gsf0Var.V0, gsf0Var.W0, z15, z, z2, srf0Var.g, z14));
                            x340Var = x340Var2;
                            x340Var.s0(objT2);
                        }
                    }
                    qsf0Var = rsf0Var;
                } else if (!u890.j(rrf0Var, prf0Var)) {
                    eg.o();
                    return null;
                }
                i5 = 1;
                if (gsf0Var.t instanceof urf0) {
                    z7 = i4;
                } else {
                    z7 = i4;
                }
                if (srf0Var.e) {
                    lsf0Var = new lsf0(gsf0Var.d.c, bff0Var.d);
                } else {
                    lsf0Var = o810.N0;
                }
                lsf0 lsf0Var3 = lsf0Var;
                if (rrf0Var instanceof prf0) {
                    f2 = gsf0Var.R0;
                } else {
                    f2 = 1.0f;
                }
                float f4 = f2;
                if (mrf0Var2 instanceof hrf0) {
                    if (u890.j(rrf0Var, qrf0Var)) {
                        i6 = 16;
                    } else {
                        if (u890.j(rrf0Var, orf0Var)) {
                            i6 = 48;
                        } else {
                            if (!u890.j(rrf0Var, prf0Var)) {
                                eg.o();
                                return null;
                            }
                            i7 = i4;
                        }
                        objT2 = v8r.q(new ysf0(xsf0Var2, z13, arrayList2, usf0Var, qsf0Var, z7, lsf0Var3, f4, i7, gsf0Var.i, srf0Var.f, mrf0Var2 instanceof grf0, gsf0Var.Q0, gsf0Var.V0, gsf0Var.W0, z15, z, z2, srf0Var.g, z14));
                        x340Var = x340Var2;
                        x340Var.s0(objT2);
                    }
                } else {
                    if (!(mrf0Var2 instanceof grf0)) {
                        eg.o();
                        return null;
                    }
                    i6 = 8;
                }
                i7 = i6;
                objT2 = v8r.q(new ysf0(xsf0Var2, z13, arrayList2, usf0Var, qsf0Var, z7, lsf0Var3, f4, i7, gsf0Var.i, srf0Var.f, mrf0Var2 instanceof grf0, gsf0Var.Q0, gsf0Var.V0, gsf0Var.W0, z15, z, z2, srf0Var.g, z14));
                x340Var = x340Var2;
                x340Var.s0(objT2);
            } else {
                m4cVar = m4cVar2;
            }
            z = false;
            if (gsf0Var.U0) {
                z2 = false;
            } else {
                z2 = false;
            }
            if (z12) {
                z3 = gsf0Var.i;
            } else if (dsf0Var3.b) {
                z3 = true;
            } else {
                z3 = false;
            }
            List list5 = list3;
            z4 = z3;
            arrayList = new ArrayList(q7h.U(list5, 10));
            it = list5.iterator();
            i2 = 0;
            while (it.hasNext()) {
                next = it.next();
                i8 = i2 + 1;
                if (i2 >= 0) {
                    p7h.T();
                    throw null;
                }
                Iterator it3 = it;
                xlf0Var2 = (xlf0) next;
                int i18 = iIntValue;
                if (dsf0Var3 != null) {
                    str4 = null;
                } else {
                    str4 = null;
                }
                if (str4 == null) {
                    str4 = "";
                }
                if (z12) {
                    str5 = str4;
                } else {
                    str5 = xlf0Var2.b;
                }
                if (u890.j(rrf0Var, prf0Var)) {
                    str6 = str4;
                    i9 = 3;
                } else if (u890.j(rrf0Var, orf0Var)) {
                    i9 = 4;
                    str6 = str4;
                } else {
                    if (u890.j(rrf0Var, qrf0Var)) {
                        eg.o();
                        return null;
                    }
                    str6 = str4;
                    iC = l1d.C(gsf0Var.Z);
                    if (iC != 0) {
                        i9 = 1;
                    } else {
                        if (iC == 1) {
                            eg.o();
                            return null;
                        }
                        i9 = 2;
                    }
                }
                flb0Var = flb0.a;
                flb0Var2 = flb0.b;
                String str11 = str5;
                if (z4) {
                    flb0Var3 = flb0Var2;
                } else {
                    flb0Var3 = flb0Var;
                }
                if (u890.j(rrf0Var, prf0Var)) {
                    flb0Var4 = flb0Var;
                    if (gsf0Var.O0) {
                    }
                    int i19 = i15;
                    if (dsf0Var3 != null) {
                        i10 = dsf0Var3.c;
                    } else {
                        i10 = 0;
                    }
                    if (i10 == 0) {
                        i11 = -1;
                    } else {
                        i11 = zsf0.a[l1d.C(i10)];
                    }
                    if (i11 == 1) {
                        str7 = str6;
                    } else {
                        str7 = "";
                    }
                    flb0Var5 = flb0Var4;
                    if (dsf0Var3 == null) {
                        flb0Var6 = flb0Var5;
                    } else {
                        flb0Var6 = flb0Var5;
                    }
                    if (z12) {
                        z8 = false;
                    } else {
                        z8 = false;
                    }
                    String str12 = xlf0Var2.b;
                    z9 = mrf0Var2 instanceof hrf0;
                    krf0Var = krf0.a;
                    if (z9) {
                        srf0Var2 = srf0Var2;
                        z9 = z9;
                        ylf0Var = ylf0.a;
                        dsf0Var3 = dsf0Var3;
                    } else {
                        z10 = mrf0Var2 instanceof irf0;
                        jrf0Var = jrf0.a;
                        if (z10) {
                            lrf0Var2 = (lrf0) ((irf0) mrf0Var2).a.get(new vhc0(i2));
                            if (u890.j(lrf0Var2, krf0Var)) {
                                if (bff0Var2.f) {
                                    iG3 = bff0Var2.c;
                                } else {
                                    uwr uwrVar11 = cbx.a;
                                    iG3 = z4p1.G(((vex) zex.a.e).f);
                                }
                                jE2 = z4p1.e(iG3);
                            } else {
                                dsf0Var3 = dsf0Var3;
                                if (u890.j(lrf0Var2, jrf0Var)) {
                                }
                                uwr uwrVar12 = cbx.a;
                                jE2 = ((vex) zex.a.e).h;
                            }
                            zlf0Var = new zlf0(jE2);
                        } else {
                            dsf0Var3 = dsf0Var3;
                            if (mrf0Var2 instanceof mrf0) {
                                eg.o();
                                return null;
                            }
                            lrf0Var = (lrf0) mrf0Var2.b.get(new vhc0(i2));
                            if (u890.j(lrf0Var, krf0Var)) {
                                if (bff0Var2.f) {
                                    iG2 = bff0Var2.c;
                                } else {
                                    uwr uwrVar13 = cbx.a;
                                    iG2 = z4p1.G(((vex) zex.a.e).f);
                                }
                                jE = z4p1.e(iG2);
                            } else if (u890.j(lrf0Var, jrf0Var)) {
                                if (bff0Var2.f) {
                                    iG = bff0Var2.b;
                                } else {
                                    uwr uwrVar14 = cbx.a;
                                    iG = z4p1.G(((vex) zex.a.e).b);
                                }
                                jE = z4p1.e(iG);
                            } else {
                                if (lrf0Var == null) {
                                    eg.o();
                                    return null;
                                }
                                uwr uwrVar15 = cbx.a;
                                jE = ((vex) zex.a.e).h;
                            }
                            zlf0Var = new zlf0(jE);
                        }
                        ylf0Var = zlf0Var;
                    }
                    if (mrf0Var2 instanceof mrf0) {
                        mrf0Var = mrf0Var2;
                    } else {
                        mrf0Var = null;
                    }
                    if (mrf0Var == null) {
                        boolValueOf = null;
                    } else {
                        if (!mrf0Var.c) {
                            mrf0Var = null;
                        }
                        if (mrf0Var != null) {
                            boolValueOf = Boolean.valueOf(u890.j(mrf0Var.b.get(new vhc0(i2)), krf0Var));
                        } else {
                            boolValueOf = null;
                        }
                    }
                    if (z9) {
                        if (zrf0Var instanceof asf0) {
                            i12 = bff0Var2.c;
                        } else {
                            i12 = bff0Var2.d;
                        }
                    } else {
                        if (mrf0Var2 instanceof grf0) {
                            eg.o();
                            return null;
                        }
                        if (u890.j(((grf0) mrf0Var2).f0().get(new vhc0(i2)), krf0Var)) {
                            if (bff0Var2.f) {
                                i12 = bff0Var2.a;
                            } else {
                                i12 = bff0Var2.c;
                            }
                        } else if (bff0Var2.f) {
                            i12 = bff0Var2.c;
                        } else {
                            i12 = bff0Var2.d;
                        }
                    }
                    arrayList.add(new bmf0(i2, str11, flb0Var3, i19, str7, flb0Var6, z8, z4p1.e(i12), z4p1.e(bff0Var2.c), ylf0Var, boolValueOf, i9, str12, z12));
                    bff0Var2 = bff0Var2;
                    dsf0Var3 = dsf0Var3;
                    i2 = i8;
                    it = it3;
                    srf0Var2 = srf0Var2;
                    iIntValue = i18;
                    x340Var = x340Var;
                } else {
                    flb0Var4 = flb0Var;
                }
                int i110 = i15;
                if (dsf0Var3 != null) {
                    i10 = dsf0Var3.c;
                } else {
                    i10 = 0;
                }
                if (i10 == 0) {
                    i11 = -1;
                } else {
                    i11 = zsf0.a[l1d.C(i10)];
                }
                if (i11 == 1) {
                    str7 = str6;
                } else {
                    str7 = "";
                }
                flb0Var5 = flb0Var4;
                if (dsf0Var3 == null) {
                    flb0Var6 = flb0Var5;
                } else {
                    flb0Var6 = flb0Var5;
                }
                if (z12) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                String str13 = xlf0Var2.b;
                z9 = mrf0Var2 instanceof hrf0;
                krf0Var = krf0.a;
                if (z9) {
                    srf0Var2 = srf0Var2;
                    z9 = z9;
                    ylf0Var = ylf0.a;
                    dsf0Var3 = dsf0Var3;
                } else {
                    z10 = mrf0Var2 instanceof irf0;
                    jrf0Var = jrf0.a;
                    if (z10) {
                        lrf0Var2 = (lrf0) ((irf0) mrf0Var2).a.get(new vhc0(i2));
                        if (u890.j(lrf0Var2, krf0Var)) {
                            if (bff0Var2.f) {
                                iG3 = bff0Var2.c;
                            } else {
                                uwr uwrVar16 = cbx.a;
                                iG3 = z4p1.G(((vex) zex.a.e).f);
                            }
                            jE2 = z4p1.e(iG3);
                        } else {
                            dsf0Var3 = dsf0Var3;
                            if (u890.j(lrf0Var2, jrf0Var)) {
                            }
                            uwr uwrVar17 = cbx.a;
                            jE2 = ((vex) zex.a.e).h;
                        }
                        zlf0Var = new zlf0(jE2);
                    } else {
                        dsf0Var3 = dsf0Var3;
                        if (mrf0Var2 instanceof mrf0) {
                            eg.o();
                            return null;
                        }
                        lrf0Var = (lrf0) mrf0Var2.b.get(new vhc0(i2));
                        if (u890.j(lrf0Var, krf0Var)) {
                            if (bff0Var2.f) {
                                iG2 = bff0Var2.c;
                            } else {
                                uwr uwrVar18 = cbx.a;
                                iG2 = z4p1.G(((vex) zex.a.e).f);
                            }
                            jE = z4p1.e(iG2);
                        } else if (u890.j(lrf0Var, jrf0Var)) {
                            if (bff0Var2.f) {
                                iG = bff0Var2.b;
                            } else {
                                uwr uwrVar19 = cbx.a;
                                iG = z4p1.G(((vex) zex.a.e).b);
                            }
                            jE = z4p1.e(iG);
                        } else {
                            if (lrf0Var == null) {
                                eg.o();
                                return null;
                            }
                            uwr uwrVar110 = cbx.a;
                            jE = ((vex) zex.a.e).h;
                        }
                        zlf0Var = new zlf0(jE);
                    }
                    ylf0Var = zlf0Var;
                }
                if (mrf0Var2 instanceof mrf0) {
                    mrf0Var = mrf0Var2;
                } else {
                    mrf0Var = null;
                }
                if (mrf0Var == null) {
                    boolValueOf = null;
                } else {
                    if (!mrf0Var.c) {
                        mrf0Var = null;
                    }
                    if (mrf0Var != null) {
                        boolValueOf = Boolean.valueOf(u890.j(mrf0Var.b.get(new vhc0(i2)), krf0Var));
                    } else {
                        boolValueOf = null;
                    }
                }
                if (z9) {
                    if (zrf0Var instanceof asf0) {
                        i12 = bff0Var2.c;
                    } else {
                        i12 = bff0Var2.d;
                    }
                } else {
                    if (mrf0Var2 instanceof grf0) {
                        eg.o();
                        return null;
                    }
                    if (u890.j(((grf0) mrf0Var2).f0().get(new vhc0(i2)), krf0Var)) {
                        if (bff0Var2.f) {
                            i12 = bff0Var2.a;
                        } else {
                            i12 = bff0Var2.c;
                        }
                    } else if (bff0Var2.f) {
                        i12 = bff0Var2.c;
                    } else {
                        i12 = bff0Var2.d;
                    }
                }
                arrayList.add(new bmf0(i2, str11, flb0Var3, i110, str7, flb0Var6, z8, z4p1.e(i12), z4p1.e(bff0Var2.c), ylf0Var, boolValueOf, i9, str13, z12));
                bff0Var2 = bff0Var2;
                dsf0Var3 = dsf0Var3;
                i2 = i8;
                it = it3;
                srf0Var2 = srf0Var2;
                iIntValue = i18;
                x340Var = x340Var;
            }
            i3 = iIntValue;
            srf0Var = srf0Var2;
            x340 x340Var3 = x340Var;
            bff0Var = bff0Var2;
            dsf0Var = dsf0Var3;
            z5 = mrf0Var2 instanceof irf0;
            ssf0Var = tsf0.a;
            if (z5) {
                arrayList2 = arrayList;
                usf0Var = ssf0Var;
                i4 = 0;
            } else {
                if (mrf0Var2 instanceof mrf0) {
                    vhc0Var = mrf0Var2.a;
                    if (vhc0Var != null) {
                        arrayList2 = arrayList;
                        i4 = 0;
                        ssf0Var = new ssf0(yoi1.p(vhc0Var.a, 0, list3.size() - 1), true, false);
                    } else {
                        arrayList2 = arrayList;
                        i4 = 0;
                    }
                } else {
                    arrayList2 = arrayList;
                    i4 = 0;
                    if (mrf0Var2 instanceof hrf0) {
                        eg.o();
                        return null;
                    }
                    if (!(zrf0Var instanceof bsf0)) {
                        if (zrf0Var instanceof zrf0) {
                            eg.o();
                            return null;
                        }
                        zrf0 zrf0Var3 = zrf0Var;
                        ssf0Var = new ssf0(zrf0Var3.a.a(), zrf0Var3.b, zrf0Var3.c);
                    }
                }
                usf0Var = ssf0Var;
            }
            zJ = u890.j(rrf0Var, qrf0Var);
            qsf0Var = osf0.a;
            if (zJ) {
                z6 = zrf0Var instanceof bsf0;
                rsf0 rsf0Var2 = psf0.a;
                if (!z6) {
                    if (!(zrf0Var instanceof zrf0)) {
                        eg.o();
                        return null;
                    }
                    if (!(mrf0Var2 instanceof grf0)) {
                        if (!(mrf0Var2 instanceof hrf0)) {
                            eg.o();
                            return null;
                        }
                        xrf0Var = zrf0Var.a;
                        if (xrf0Var.a() >= 0) {
                            i5 = 1;
                            if (xrf0Var.a() <= list3.size() - 1) {
                                iA = xrf0Var.a();
                                if (z12) {
                                    xlf0Var = (xlf0) o7h.t0(iA, list3);
                                    if (xlf0Var != null) {
                                        length = i4;
                                    } else {
                                        length = i4;
                                    }
                                    if (z12) {
                                        if (dsf0Var != null) {
                                            str = null;
                                        } else {
                                            str = null;
                                        }
                                        if (str == null) {
                                            str2 = "";
                                        } else {
                                            str2 = str;
                                        }
                                        if (str2.length() > 0) {
                                            length = str2.length();
                                        }
                                    }
                                } else {
                                    xlf0Var = (xlf0) o7h.t0(iA, list3);
                                    if (xlf0Var != null) {
                                        length = i4;
                                    } else {
                                        length = i4;
                                    }
                                    if (z12) {
                                        if (dsf0Var != null) {
                                            str = null;
                                        } else {
                                            str = null;
                                        }
                                        if (str == null) {
                                            str2 = "";
                                        } else {
                                            str2 = str;
                                        }
                                        if (str2.length() > 0) {
                                            length = str2.length();
                                        }
                                    }
                                }
                                if (z11) {
                                    qsf0Var = new nsf0(xrf0Var.a(), length);
                                } else {
                                    qsf0Var = new qsf0(xrf0Var.a(), length);
                                }
                            }
                        }
                    }
                }
                qsf0Var = rsf0Var2;
                i5 = 1;
            } else {
                z6 = zrf0Var instanceof bsf0;
                rsf0 rsf0Var3 = psf0.a;
                if (!z6) {
                    if (!(zrf0Var instanceof zrf0)) {
                        eg.o();
                        return null;
                    }
                    if (!(mrf0Var2 instanceof grf0)) {
                        if (!(mrf0Var2 instanceof hrf0)) {
                            eg.o();
                            return null;
                        }
                        xrf0Var = zrf0Var.a;
                        if (xrf0Var.a() >= 0) {
                            i5 = 1;
                            if (xrf0Var.a() <= list3.size() - 1) {
                                iA = xrf0Var.a();
                                if (z12) {
                                    xlf0Var = (xlf0) o7h.t0(iA, list3);
                                    if (xlf0Var != null) {
                                        length = i4;
                                    } else {
                                        length = i4;
                                    }
                                    if (z12) {
                                        if (dsf0Var != null) {
                                            str = null;
                                        } else {
                                            str = null;
                                        }
                                        if (str == null) {
                                            str2 = "";
                                        } else {
                                            str2 = str;
                                        }
                                        if (str2.length() > 0) {
                                            length = str2.length();
                                        }
                                    }
                                } else {
                                    xlf0Var = (xlf0) o7h.t0(iA, list3);
                                    if (xlf0Var != null) {
                                        length = i4;
                                    } else {
                                        length = i4;
                                    }
                                    if (z12) {
                                        if (dsf0Var != null) {
                                            str = null;
                                        } else {
                                            str = null;
                                        }
                                        if (str == null) {
                                            str2 = "";
                                        } else {
                                            str2 = str;
                                        }
                                        if (str2.length() > 0) {
                                            length = str2.length();
                                        }
                                    }
                                }
                                if (z11) {
                                    qsf0Var = new nsf0(xrf0Var.a(), length);
                                } else {
                                    qsf0Var = new qsf0(xrf0Var.a(), length);
                                }
                            }
                        }
                    }
                }
                qsf0Var = rsf0Var3;
                i5 = 1;
            }
            if (gsf0Var.t instanceof urf0) {
                z7 = i4;
            } else {
                z7 = i4;
            }
            if (srf0Var.e) {
                lsf0Var = new lsf0(gsf0Var.d.c, bff0Var.d);
            } else {
                lsf0Var = o810.N0;
            }
            lsf0 lsf0Var4 = lsf0Var;
            if (rrf0Var instanceof prf0) {
                f2 = gsf0Var.R0;
            } else {
                f2 = 1.0f;
            }
            float f5 = f2;
            if (mrf0Var2 instanceof hrf0) {
                if (u890.j(rrf0Var, qrf0Var)) {
                    i6 = 16;
                } else {
                    if (u890.j(rrf0Var, orf0Var)) {
                        i6 = 48;
                    } else {
                        if (!u890.j(rrf0Var, prf0Var)) {
                            eg.o();
                            return null;
                        }
                        i7 = i4;
                    }
                    objT2 = v8r.q(new ysf0(xsf0Var2, z13, arrayList2, usf0Var, qsf0Var, z7, lsf0Var4, f5, i7, gsf0Var.i, srf0Var.f, mrf0Var2 instanceof grf0, gsf0Var.Q0, gsf0Var.V0, gsf0Var.W0, z15, z, z2, srf0Var.g, z14));
                    x340Var = x340Var3;
                    x340Var.s0(objT2);
                }
            } else {
                if (!(mrf0Var2 instanceof grf0)) {
                    eg.o();
                    return null;
                }
                i6 = 8;
            }
            i7 = i6;
            objT2 = v8r.q(new ysf0(xsf0Var2, z13, arrayList2, usf0Var, qsf0Var, z7, lsf0Var4, f5, i7, gsf0Var.i, srf0Var.f, mrf0Var2 instanceof grf0, gsf0Var.Q0, gsf0Var.V0, gsf0Var.W0, z15, z, z2, srf0Var.g, z14));
            x340Var = x340Var3;
            x340Var.s0(objT2);
        } else {
            i3 = iIntValue;
            m4cVar = m4cVar2;
            i4 = 0;
            i5 = 1;
        }
        ven0 ven0Var = (ven0) objT2;
        Boolean bool = (Boolean) x340Var.k(sng1.a);
        vu30 vu30Var = (vu30) x340Var.k(g7a1.a);
        ysf0 ysf0Var = (ysf0) ven0Var.getValue();
        int i20 = i3;
        if (((i20 & 896) ^ 384) > 256) {
            iu30Var = iu30Var2;
            if (x340Var.g(iu30Var)) {
                i13 = i5;
            }
            objT = x340Var.T();
            if (i13 == 0 || objT == m4cVar) {
                objT = new cci(iu30Var, (byte) 26);
                x340Var.s0(objT);
            }
            i541.e(ysf0Var, (qim0) null, bool, vu30Var, (iu30) objT, ((ysf0) ven0Var.getValue()).o, x340Var, 0);
            return rih1.a;
        }
        iu30Var = iu30Var2;
        if ((i20 & 384) == 256) {
            i13 = i5;
        } else {
            i13 = i4;
        }
        objT = x340Var.T();
        if (i13 == 0) {
            objT = new cci(iu30Var, (byte) 26);
            x340Var.s0(objT);
        } else {
            objT = new cci(iu30Var, (byte) 26);
            x340Var.s0(objT);
        }
        i541.e(ysf0Var, (qim0) null, bool, vu30Var, (iu30) objT, ((ysf0) ven0Var.getValue()).o, x340Var, 0);
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        o2g0 o2g0Var = (o2g0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        boolean zA = ef.b(x340Var).a();
        xu30 xu30VarR = apo.r(1402202421, new ef8(o2g0Var, cwl1.n0(2131958054, new Object[]{o2g0Var.c}, x340Var), (byte) 24), x340Var);
        x340 x340Var2 = x340Var;
        uvx uvxVarB = uvx.b((uvx) x340Var2.k(vvx.a), 0, (tvx) null, (p3v) null, 30);
        xu30 xu30Var = !zA ? xu30VarR : null;
        xu30 xu30Var2 = zA ? xu30VarR : null;
        String strO0 = cwl1.o0(x340Var2, 2131958053);
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT = x340Var2.T();
        if (z || objT == m4cVar) {
            objT = new exi(iu30Var, (byte) 11);
            x340Var2.s0(objT);
        }
        Function0 function0 = (Function0) objT;
        if (ihc1.y0(strO0)) {
            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            return null;
        }
        gbx gbxVar = new gbx(new y50(strO0), function0);
        qim0 qim0VarF = u291.f(nim0.a, 1.0f);
        Object objT2 = x340Var2.T();
        if (objT2 == m4cVar) {
            objT2 = oqi.g;
            x340Var2.s0(objT2);
        }
        jto1.b(s161.b(qim0VarF, true, (iu30) objT2), uvxVarB, (max) null, false, (idn0) null, (ga80) null, gbxVar, (gbx) null, apo.r(2010200179, new kyi(o2g0Var, (byte) 0), x340Var2), (xu30) null, (xu30) null, xu30Var, (xu30) null, xu30Var2, (xu30) null, apo.r(1201368185, new kyi(o2g0Var, (byte) 1), x340Var2), x340Var2, 100663360, 196608, 22204);
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i2;
        y3g0 y3g0Var = (y3g0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 48) == 0) {
            i2 = (x340Var.g(y3g0Var) ? 32 : 16) | iIntValue;
        } else {
            i2 = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i2 & 1, (i2 & 1169) != 1168)) {
            boolean z = (i2 & 896) == 256;
            Object objT = x340Var2.T();
            if (z || objT == fkj0.X) {
                objT = new exi(iu30Var, (byte) 12);
                x340Var2.s0(objT);
            }
            w2g0.h((Function0) objT, apo.r(-723343163, new myi(y3g0Var, iu30Var), x340Var2), x340Var2, 48);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i2;
        jam jamVar;
        o7g0 o7g0Var = (o7g0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 48) == 0) {
            i2 = (x340Var.g(o7g0Var) ? 32 : 16) | iIntValue;
        } else {
            i2 = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i2 & 1, (i2 & 1169) != 1168)) {
            int iOrdinal = o7g0Var.a.ordinal();
            if (iOrdinal == 0) {
                ilx ilxVar = ilx.c;
                uwr uwrVar = cbx.a;
                jamVar = new jam(ilxVar, ((xex) ((gmt) zex.a.c).b).k, 2131958083, 2131958082);
            } else {
                if (iOrdinal != 1) {
                    eg.o();
                    return null;
                }
                pox poxVar = pox.c;
                uwr uwrVar2 = cbx.a;
                jamVar = new jam(poxVar, ((xex) ((gmt) zex.a.c).b).H, 2131958085, 2131958084);
            }
            String strO0 = cwl1.o0(x340Var2, jamVar.c);
            String strO1 = cwl1.o0(x340Var2, jamVar.d);
            boolean z = (i2 & 896) == 256;
            Object objT = x340Var2.T();
            if (z || objT == fkj0.X) {
                objT = new exi(iu30Var, (byte) 13);
                x340Var2.s0(objT);
            }
            don1.g(jamVar.a, jamVar.b, strO0, strO1, new gbx(z50.c, (Function0) objT), x340Var2, 8);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        String strK;
        x340 x340Var;
        jeg0 jeg0Var = (jeg0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var2 = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        a0g a0gVar = jeg0Var.a;
        boolean z = jeg0Var.b;
        gbx gbxVar = null;
        byte b2 = 0;
        if (z) {
            x340 x340Var3 = x340Var2;
            strK = x0d.k(x340Var3, 1242491370, 2131958172, x340Var3, false);
        } else {
            x340 x340Var4 = x340Var2;
            x340Var4.i0(1242582448);
            x340Var4.r(false);
            strK = null;
        }
        String strO0 = cwl1.o0(x340Var2, a0gVar.c ? 2131958170 : 2131958171);
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(x340Var2).b;
        cvx cvxVar2 = cbx.b(x340Var2).b;
        uvx uvxVar = new uvx(1, (pgx) null, 3, new zzq0(16.0f, 8.0f, 16.0f, 8.0f), (zzq0) null, (tvx) null, (hw61) null, 0, (p3v) null, 498);
        byte b3 = 1;
        if (z) {
            x340Var = x340Var2;
            x340Var.i0(1244160844);
        } else {
            x340Var = x340Var2;
            x340Var.i0(1244192495);
            boolean zI = ((((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256) | x340Var.i(a0gVar);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new dfi((Object) iu30Var, (Object) a0gVar, (byte) 14);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return null;
            }
            gbxVar = new gbx(new y50(strO0), function0);
        }
        x340Var.r(false);
        gbx gbxVar2 = gbxVar;
        qim0 qim0VarF = u291.f(nim0.a, 1.0f);
        x340 x340Var5 = x340Var2;
        boolean zI2 = x340Var5.i(a0gVar) | x340Var5.g(strK);
        Object objT2 = x340Var5.T();
        if (zI2 || objT2 == m4cVar) {
            objT2 = new puh(a0gVar, strK, (byte) 12);
            x340Var5.s0(objT2);
        }
        jto1.b(s161.b(qim0VarF, true, (iu30) objT2), uvxVar, (max) null, false, (idn0) null, (ga80) null, gbxVar2, (gbx) null, (xu30) null, apo.r(-1238267447, new bzi(a0gVar, b2), x340Var5), (xu30) null, (xu30) null, apo.r(-362041721, new ef8(a0gVar, strK, (byte) 25), x340Var5), (xu30) null, (xu30) null, apo.r(1029042788, new bzi(a0gVar, b3), x340Var5), x340Var5, 805306432, 196992, 28092);
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        meg0 meg0Var = (meg0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        String str = meg0Var.c;
        int i2 = meg0Var.d;
        Uri uri = meg0Var.e;
        int i3 = meg0Var.f;
        long j = meg0Var.g;
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new exi(iu30Var, (byte) 14);
            x340Var2.s0(objT);
        }
        hqn1.f(str, i2, uri, i3, j, (Function0) objT, x340Var2, 0);
        return rih1.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i2;
        egg0 egg0Var = (egg0) obj2;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 48) == 0) {
            iIntValue |= x340Var.g(egg0Var) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 1041) != 1040)) {
            if (egg0Var.b) {
                i2 = 2131951871;
            } else {
                i2 = egg0Var.a ? 2131958162 : 2131958161;
            }
            jto1.b((qim0) null, (uvx) null, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, apo.r(-1614721532, new f13(i2, (byte) 2), x340Var2), x340Var2, 0, 196608, 32767);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:92:0x01eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:94:0x0206  */
    /* JADX WARN: Code duplicated, block: B:96:0x020c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0217  */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        b0k b0kVar;
        String strO0;
        int i2;
        boolean z;
        int i3;
        String strK;
        int i4;
        byte b2 = this.a;
        z50 z50Var = z50.c;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        String strK2 = null;
        boolean z2 = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                ljd0 ljd0Var = (ljd0) obj2;
                iu30 iu30Var = (iu30) obj3;
                b0k b0kVar2 = (b0k) obj4;
                int iIntValue = ((Number) obj5).intValue();
                nim0 nim0Var2 = nim0.a;
                qim0 qim0VarF = u291.f(nim0Var2, 1.0f);
                mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
                x340 x340Var = (x340) b0kVar2;
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(b0kVar2, qim0VarF);
                hzj.A.getClass();
                x340 x340Var2 = (x340) b0kVar2;
                if (x340Var2.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(mbhVarA, b0kVar2, y580.O0);
                nko1.H(xos0VarM, b0kVar2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
                nko1.F(b0kVar2);
                nko1.H(qim0VarE, b0kVar2, y580.Y);
                if (ljd0Var.h) {
                    b0kVar = b0kVar2;
                    x340Var2.i0(1890397083);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(1889883909);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(b0kVar2).b;
                    op71.g(b0kVar2, u291.h(nim0Var2, 12.0f));
                    qim0 qim0VarB = uyn1.B(nim0Var2, cbx.b(b0kVar2).e.a, 0.0f, 0.0f, 0.0f, 14);
                    if (dwi.a[l1d.C(ljd0Var.b)] == 1) {
                        x340Var2.i0(60973065);
                        strO0 = cwl1.o0(b0kVar2, 2131957470);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(60975909);
                        strO0 = cwl1.o0(b0kVar2, 2131957464);
                        x340Var2.r(false);
                    }
                    uwo1.e(strO0, qim0VarB, cbx.d(b0kVar2).h, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2040);
                    b0kVar = b0kVar2;
                    x340Var2.r(false);
                }
                m0p1.i(ljd0Var.b, ljd0Var.c, ljd0Var.e, ljd0Var.f, false, false, ljd0Var.g, ljd0Var.d, iu30Var, u291.f(nim0Var2, 1.0f), b0kVar, ((iIntValue << 18) & 234881024) | 221184, 0);
                x340Var2.r(true);
                return rih1Var;
            case 1:
                bld0 bld0Var = (bld0) obj2;
                iu30 iu30Var2 = (iu30) obj3;
                x340 x340Var3 = (b0k) obj4;
                int iIntValue2 = ((Number) obj5).intValue();
                zkd0 zkd0Var = bld0Var.a;
                Integer num = bld0Var.b;
                if (num != null) {
                    i2 = uah.i(Color.argb(76, 0, 0, 0), num.intValue());
                } else {
                    i2 = -14145496;
                }
                if ((((iIntValue2 & 896) ^ 384) <= 256 || !x340Var3.g(iu30Var2)) && (iIntValue2 & 384) != 256) {
                    z2 = false;
                }
                x340 x340Var4 = x340Var3;
                Object objT = x340Var4.T();
                if (z2 || objT == fkj0.X) {
                    objT = new rri(iu30Var2, (byte) 27);
                    x340Var4.s0(objT);
                }
                m1p1.m(zkd0Var, i2, (Function0) objT, (qim0) null, x340Var4, 0);
                return rih1Var;
            case 2:
                b0k b0kVar3 = (b0k) obj4;
                ((Number) obj5).intValue();
                nyx.a(2, (wux) null, apo.r(1404915111, new l8i((jmd0) obj2, (byte) 18), b0kVar3), b0kVar3, 3078, 6);
                return rih1Var;
            case 3:
                smd0 smd0Var = (smd0) obj2;
                x340 x340Var5 = (b0k) obj4;
                ((Number) obj5).intValue();
                if (smd0Var.a) {
                    x340 x340Var6 = x340Var5;
                    x340Var6.i0(-613059341);
                    m4c m4cVar = fkj0.X;
                    View view = (View) x340Var6.k(AndroidCompositionLocals_androidKt.f);
                    x8c0 lifecycle = ((iac0) x340Var6.k(jfe0.a)).getLifecycle();
                    boolean zG = x340Var6.g(view) | x340Var6.g(lifecycle);
                    Object objT2 = x340Var6.T();
                    if (zG || objT2 == m4cVar) {
                        objT2 = c13.l(lifecycle.b().a(w8c0.d) && view.isShown(), x340Var6);
                    }
                    ven0 ven0Var = (ven0) objT2;
                    boolean zI = x340Var6.i(ven0Var) | x340Var6.i(lifecycle) | x340Var6.i(view);
                    Object objT3 = x340Var6.T();
                    if (zI || objT3 == m4cVar) {
                        objT3 = new lb50((Object) lifecycle, (Object) view, ven0Var, (byte) 22);
                        x340Var6.s0(objT3);
                    }
                    qxd0.h(view, lifecycle, (iu30) objT3, x340Var6);
                    boolean zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
                    Object objT4 = x340Var6.T();
                    if (objT4 == m4cVar) {
                        objT4 = oqi.e;
                        x340Var6.s0(objT4);
                    }
                    qim0 qim0VarA = s161.a(nim0Var, (iu30) objT4);
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode2 = Long.hashCode(x340Var6.T);
                    xos0 xos0VarM2 = x340Var6.m();
                    qim0 qim0VarE2 = zr7.E(x340Var6, qim0VarA);
                    hzj.A.getClass();
                    if (x340Var6.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var6.m0();
                    if (x340Var6.S) {
                        x340Var6.l(n4kVar);
                    } else {
                        x340Var6.v0();
                    }
                    nko1.H(gfh0VarC, x340Var6, y580.O0);
                    nko1.H(xos0VarM2, x340Var6, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var6, y580.R0);
                    nko1.F(x340Var6);
                    nko1.H(qim0VarE2, x340Var6, y580.Y);
                    i1k0.e(0, x340Var6, null, smd0Var.b && zBooleanValue);
                    x340Var6.r(true);
                    x340Var6.r(false);
                } else {
                    x340 x340Var7 = x340Var5;
                    x340Var7.i0(-612868102);
                    x340Var7.r(false);
                }
                return rih1Var;
            case 4:
                x340 x340Var8 = (b0k) obj4;
                ((Number) obj5).intValue();
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                gfh0 gfh0VarC2 = t1c.c(een.h, false);
                x340 x340Var9 = x340Var8;
                int iHashCode3 = Long.hashCode(x340Var9.T);
                xos0 xos0VarM3 = x340Var9.m();
                qim0 qim0VarE3 = zr7.E(x340Var8, qim0VarD);
                hzj.A.getClass();
                x340 x340Var10 = x340Var8;
                if (x340Var10.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var10.m0();
                if (x340Var10.S) {
                    x340Var10.l(n4kVar);
                } else {
                    x340Var10.v0();
                }
                nko1.H(gfh0VarC2, x340Var8, y580.O0);
                nko1.H(xos0VarM3, x340Var8, y580.N0);
                nko1.H(Integer.valueOf(iHashCode3), x340Var8, y580.R0);
                nko1.F(x340Var8);
                nko1.H(qim0VarE3, x340Var8, y580.Y);
                xto1.e((qim0) null, 0, 0L, 0L, x340Var8, 0, 15);
                x340Var10.r(true);
                return rih1Var;
            case 5:
                ((Number) obj5).intValue();
                nyx.a(0, (wux) null, ywi.a, (b0k) obj4, 3072, 7);
                return rih1Var;
            case 6:
                x340 x340Var11 = (b0k) obj4;
                int iIntValue3 = ((Number) obj5).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue3 & 1, (iIntValue3 & 1025) != 1024)) {
                    r6p1.g((qim0) null, x340Var12, 0);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 7:
                ((Number) obj5).intValue();
                guo1.w((b0k) obj4, 0);
                return rih1Var;
            case 8:
                iu30 iu30Var3 = (iu30) obj3;
                x340 x340Var13 = (b0k) obj4;
                int iIntValue4 = ((Number) obj5).intValue();
                String strO1 = cwl1.o0(x340Var13, 2131952883);
                dmx dmxVar = dmx.c;
                String str = ((the0) obj2).a;
                String str2 = str == null ? strO1 : str;
                if ((((iIntValue4 & 896) ^ 384) <= 256 || !x340Var13.g(iu30Var3)) && (iIntValue4 & 384) != 256) {
                    z2 = false;
                }
                x340 x340Var14 = x340Var13;
                Object objT5 = x340Var14.T();
                if (z2 || objT5 == fkj0.X) {
                    objT5 = new rri(iu30Var3, (byte) 28);
                    x340Var14.s0(objT5);
                }
                hqn1.h(dmxVar, str2, strO1, (Function0) objT5, anm1.N("artifact-page-location-button", nim0Var), 0L, false, false, (max) null, (vu30) null, x340Var14, dmx.d, 992);
                return rih1Var;
            case 9:
                iu30 iu30Var4 = (iu30) obj3;
                x340 x340Var15 = (b0k) obj4;
                int iIntValue5 = ((Number) obj5).intValue();
                m4c m4cVar2 = fkj0.X;
                aoe0 aoe0Var = ((eje0) obj2).a;
                int i5 = (iIntValue5 & 896) ^ 384;
                boolean z3 = (i5 > 256 && x340Var15.g(iu30Var4)) || (iIntValue5 & 384) == 256;
                x340 x340Var16 = x340Var15;
                Object objT6 = x340Var16.T();
                if (z3 || objT6 == m4cVar2) {
                    objT6 = new rri(iu30Var4, (byte) 29);
                    x340Var16.s0(objT6);
                }
                Function0 function0 = (Function0) objT6;
                if ((i5 <= 256 || !x340Var16.g(iu30Var4)) && (iIntValue5 & 384) != 256) {
                    z2 = false;
                }
                Object objT7 = x340Var16.T();
                if (z2 || objT7 == m4cVar2) {
                    objT7 = new exi(iu30Var4, (byte) 0);
                    x340Var16.s0(objT7);
                }
                z8p1.i(aoe0Var, function0, (Function0) objT7, (qim0) null, x340Var16, 0);
                return rih1Var;
            case 10:
                p9p1.n((ine0) obj2, (iu30) obj3, (qim0) null, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 126);
                return rih1Var;
            case 11:
                iu30 iu30Var5 = (iu30) obj3;
                x340 x340Var17 = (b0k) obj4;
                int iIntValue6 = ((Number) obj5).intValue();
                if ((iIntValue6 & 384) == 0) {
                    iIntValue6 |= x340Var17.i(iu30Var5) ? 256 : 128;
                }
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue6 & 1, (iIntValue6 & 1153) != 1152)) {
                    boolean z4 = (iIntValue6 & 896) == 256;
                    Object objT8 = x340Var18.T();
                    if (z4 || objT8 == fkj0.X) {
                        objT8 = new exi(iu30Var5, (byte) 1);
                        x340Var18.s0(objT8);
                    }
                    h0p1.g((Function0) objT8, x340Var18, 0);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 12:
                xxe0 xxe0Var = (xxe0) obj2;
                iu30 iu30Var6 = (iu30) obj3;
                x340 x340Var19 = (b0k) obj4;
                int iIntValue7 = ((Number) obj5).intValue();
                uwr uwrVar2 = cbx.a;
                cua cuaVar = cbx.b(x340Var19).f;
                qim0 qim0VarF2 = dug.f(i1p1.q(nim0Var, er31.b(4.0f)), cbx.a(x340Var19).a.b.a(), d4o1.a);
                if ((((iIntValue7 & 896) ^ 384) <= 256 || !x340Var19.g(iu30Var6)) && (iIntValue7 & 384) != 256) {
                    z2 = false;
                }
                x340 x340Var20 = x340Var19;
                Object objT9 = x340Var20.T();
                if (z2 || objT9 == fkj0.X) {
                    objT9 = new exi(iu30Var6, (byte) 2);
                    x340Var20.s0(objT9);
                }
                jto1.b(qim0VarF2, (uvx) null, (max) null, false, (idn0) null, (ga80) null, new gbx(z50Var, (Function0) objT9), (gbx) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, sxi.a, (xu30) null, (xu30) null, apo.r(-273039199, new okg(xxe0Var, (byte) 19), x340Var20), x340Var20, 0, 196992, 28606);
                return rih1Var;
            case 13:
                iu30 iu30Var7 = (iu30) obj3;
                x340 x340Var21 = (b0k) obj4;
                int iIntValue8 = ((Number) obj5).intValue();
                if ((iIntValue8 & 384) == 0) {
                    iIntValue8 |= x340Var21.i(iu30Var7) ? 256 : 128;
                }
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue8 & 1, (iIntValue8 & 1153) != 1152)) {
                    qim0 qim0VarZ = u291.z(u291.f(nim0Var, 1.0f), (fra) null, 3);
                    gfh0 gfh0VarC3 = t1c.c(een.d, false);
                    int iHashCode4 = Long.hashCode(x340Var22.T);
                    xos0 xos0VarM4 = x340Var22.m();
                    qim0 qim0VarE4 = zr7.E(x340Var22, qim0VarZ);
                    hzj.A.getClass();
                    if (x340Var22.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var22.m0();
                    if (x340Var22.S) {
                        x340Var22.l(n4kVar);
                    } else {
                        x340Var22.v0();
                    }
                    nko1.H(gfh0VarC3, x340Var22, y580.O0);
                    nko1.H(xos0VarM4, x340Var22, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode4), x340Var22, y580.R0);
                    nko1.F(x340Var22);
                    nko1.H(qim0VarE4, x340Var22, y580.Y);
                    z = (iIntValue8 & 896) == 256;
                    Object objT10 = x340Var22.T();
                    if (z || objT10 == fkj0.X) {
                        objT10 = new exi(iu30Var7, (byte) 3);
                        x340Var22.s0(objT10);
                    }
                    foo1.g(new gbx(z50Var, (Function0) objT10), anm1.N("login-options-row-button", h2c.a.a(nim0Var, een.h)), (max) null, yla.s(x340Var22), (idn0) null, (vu30) null, (vu30) null, uxi.a, x340Var22, 12582912, 116);
                    x340Var22.r(true);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 14:
                iu30 iu30Var8 = (iu30) obj3;
                x340 x340Var23 = (b0k) obj4;
                int iIntValue9 = ((Number) obj5).intValue();
                if ((iIntValue9 & 384) == 0) {
                    iIntValue9 |= x340Var23.i(iu30Var8) ? 256 : 128;
                }
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue9 & 1, (iIntValue9 & 1153) != 1152)) {
                    qim0 qim0VarZ2 = u291.z(u291.f(nim0Var, 1.0f), (fra) null, 3);
                    gfh0 gfh0VarC4 = t1c.c(een.d, false);
                    int iHashCode5 = Long.hashCode(x340Var24.T);
                    xos0 xos0VarM5 = x340Var24.m();
                    qim0 qim0VarE5 = zr7.E(x340Var24, qim0VarZ2);
                    hzj.A.getClass();
                    if (x340Var24.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var24.m0();
                    if (x340Var24.S) {
                        x340Var24.l(n4kVar);
                    } else {
                        x340Var24.v0();
                    }
                    nko1.H(gfh0VarC4, x340Var24, y580.O0);
                    nko1.H(xos0VarM5, x340Var24, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode5), x340Var24, y580.R0);
                    nko1.F(x340Var24);
                    nko1.H(qim0VarE5, x340Var24, y580.Y);
                    z = (iIntValue9 & 896) == 256;
                    Object objT11 = x340Var24.T();
                    if (z || objT11 == fkj0.X) {
                        objT11 = new exi(iu30Var8, (byte) 4);
                        x340Var24.s0(objT11);
                    }
                    foo1.c(new gbx(z50Var, (Function0) objT11), jdx.c, anm1.N("login-options-row-button", h2c.a.a(nim0Var, een.h)), (max) null, yla.s(x340Var24), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, vxi.a, x340Var24, 48, 48, 2008);
                    x340Var24.r(true);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case 15:
                iu30 iu30Var9 = (iu30) obj3;
                x340 x340Var25 = (b0k) obj4;
                int iIntValue10 = ((Number) obj5).intValue();
                qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
                uwr uwrVar3 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var25).b;
                cvx cvxVar3 = cbx.b(x340Var25).b;
                qim0 qim0VarY = uyn1.y(qim0VarF3, 12.0f, 4.0f);
                jw31 jw31VarA = ew31.a(h36.e, een.Z, x340Var25, 0);
                x340 x340Var26 = x340Var25;
                int iHashCode6 = Long.hashCode(x340Var26.T);
                xos0 xos0VarM6 = x340Var26.m();
                qim0 qim0VarE6 = zr7.E(x340Var25, qim0VarY);
                hzj.A.getClass();
                x340 x340Var27 = x340Var25;
                if (x340Var27.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var27.m0();
                if (x340Var27.S) {
                    x340Var27.l(n4kVar);
                } else {
                    x340Var27.v0();
                }
                nko1.H(jw31VarA, x340Var25, y580.O0);
                nko1.H(xos0VarM6, x340Var25, y580.N0);
                nko1.H(Integer.valueOf(iHashCode6), x340Var25, y580.R0);
                nko1.F(x340Var25);
                nko1.H(qim0VarE6, x340Var25, y580.Y);
                String strO2 = cwl1.o0(x340Var25, 2131954236);
                z = (((iIntValue10 & 896) ^ 384) > 256 && x340Var27.g(iu30Var9)) || (iIntValue10 & 384) == 256;
                Object objT12 = x340Var27.T();
                if (z || objT12 == fkj0.X) {
                    objT12 = new exi(iu30Var9, (byte) 5);
                    x340Var27.s0(objT12);
                }
                Function0 function1 = (Function0) objT12;
                if (ihc1.y0(strO2)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                foo1.c(new gbx(new y50(strO2), function1), new idx(), (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, wxi.a, x340Var25, 0, 48, 2044);
                x340Var27.r(true);
                return rih1Var;
            case 16:
                uqo uqoVar = (uqo) obj2;
                iu30 iu30Var10 = (iu30) obj3;
                x340 x340Var28 = (b0k) obj4;
                int iIntValue11 = ((Number) obj5).intValue();
                gra graVar = een.h;
                qim0 qim0VarF4 = u291.f(nim0Var, 1.0f);
                gfh0 gfh0VarC5 = t1c.c(graVar, false);
                x340 x340Var29 = x340Var28;
                int iHashCode7 = Long.hashCode(x340Var29.T);
                xos0 xos0VarM7 = x340Var29.m();
                qim0 qim0VarE7 = zr7.E(x340Var28, qim0VarF4);
                hzj.A.getClass();
                x340 x340Var30 = x340Var28;
                if (x340Var30.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var30.m0();
                if (x340Var30.S) {
                    x340Var30.l(n4kVar);
                } else {
                    x340Var30.v0();
                }
                nko1.H(gfh0VarC5, x340Var28, y580.O0);
                nko1.H(xos0VarM7, x340Var28, y580.N0);
                nko1.H(Integer.valueOf(iHashCode7), x340Var28, y580.R0);
                nko1.F(x340Var28);
                nko1.H(qim0VarE7, x340Var28, y580.Y);
                String strB = tro1.B(uqoVar, x340Var28, (iIntValue11 >> 3) & 14);
                z = (((iIntValue11 & 896) ^ 384) > 256 && x340Var30.g(iu30Var10)) || (iIntValue11 & 384) == 256;
                Object objT13 = x340Var30.T();
                if (z || objT13 == fkj0.X) {
                    objT13 = new exi(iu30Var10, (byte) 6);
                    x340Var30.s0(objT13);
                }
                Function0 function2 = (Function0) objT13;
                if (ihc1.y0(strB)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                foo1.c(new gbx(new y50(strB), function2), new idx(6), (qim0) null, (max) null, yla.s(x340Var28), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-689444903, new pji(strB, (byte) 4), x340Var28), x340Var28, 0, 48, 2012);
                x340Var30.r(true);
                return rih1Var;
            case 17:
                iu30 iu30Var11 = (iu30) obj3;
                x340 x340Var31 = (b0k) obj4;
                int iIntValue12 = ((Number) obj5).intValue();
                if ((((iIntValue12 & 896) ^ 384) <= 256 || !x340Var31.g(iu30Var11)) && (iIntValue12 & 384) != 256) {
                    z2 = false;
                }
                x340 x340Var32 = x340Var31;
                Object objT14 = x340Var32.T();
                if (z2 || objT14 == fkj0.X) {
                    objT14 = new exi(iu30Var11, (byte) 7);
                    x340Var32.s0(objT14);
                }
                yoi1.c(2131959952, 2131959951, 2131959950, (Function0) objT14, x340Var32, 0);
                return rih1Var;
            case 18:
                iu30 iu30Var12 = (iu30) obj3;
                x340 x340Var33 = (b0k) obj4;
                int iIntValue13 = ((Number) obj5).intValue();
                qim0 qim0VarF5 = u291.f(nim0Var, 1.0f);
                if ((((iIntValue13 & 896) ^ 384) <= 256 || !x340Var33.g(iu30Var12)) && (iIntValue13 & 384) != 256) {
                    z2 = false;
                }
                x340 x340Var34 = x340Var33;
                Object objT15 = x340Var34.T();
                if (z2 || objT15 == fkj0.X) {
                    objT15 = new exi(iu30Var12, (byte) 8);
                    x340Var34.s0(objT15);
                }
                lmt0.e(0, 0, (Function0) objT15, x340Var34, qim0VarF5);
                return rih1Var;
            case 19:
                return a(obj, obj2, obj3, obj4, obj5);
            case 20:
                gwf0 gwf0Var = (hwf0) obj2;
                iu30 iu30Var13 = (iu30) obj3;
                x340 x340Var35 = (b0k) obj4;
                int iIntValue14 = ((Number) obj5).intValue();
                if ((iIntValue14 & 48) == 0) {
                    i3 = iIntValue14 | ((iIntValue14 & 64) == 0 ? x340Var35.g(gwf0Var) : x340Var35.i(gwf0Var) ? 32 : 16);
                } else {
                    i3 = iIntValue14;
                }
                if ((iIntValue14 & 384) == 0) {
                    i3 |= x340Var35.i(iu30Var13) ? 256 : 128;
                }
                x340 x340Var36 = x340Var35;
                if (x340Var36.Y(i3 & 1, (i3 & 1169) != 1168)) {
                    String strO3 = cwl1.o0(x340Var36, 2131953759);
                    boolean z5 = gwf0Var instanceof gwf0;
                    if (z5) {
                        gwf0 gwf0Var2 = gwf0Var;
                        if (gwf0Var2.c) {
                            x340Var36.i0(-1250638390);
                            strK = cwl1.n0(2131953762, new Object[]{gwf0Var2.a}, x340Var36);
                            x340Var36.r(false);
                        } else if (z5) {
                            x340Var36.i0(-1250633835);
                            strK = cwl1.n0(2131953761, new Object[]{gwf0Var.a}, x340Var36);
                            x340Var36.r(false);
                        } else if (gwf0Var.a()) {
                            strK = x0d.k(x340Var36, -1250628846, 2131953763, x340Var36, false);
                        } else {
                            strK = x0d.k(x340Var36, -1250626245, 2131953764, x340Var36, false);
                        }
                    } else if (z5) {
                        x340Var36.i0(-1250633835);
                        strK = cwl1.n0(2131953761, new Object[]{gwf0Var.a}, x340Var36);
                        x340Var36.r(false);
                    } else if (gwf0Var.a()) {
                        strK = x0d.k(x340Var36, -1250628846, 2131953763, x340Var36, false);
                    } else {
                        strK = x0d.k(x340Var36, -1250626245, 2131953764, x340Var36, false);
                    }
                    String str3 = strK;
                    String strO4 = cwl1.o0(x340Var36, 2131953758);
                    z2 = (i3 & 896) == 256;
                    Object objT16 = x340Var36.T();
                    if (z2 || objT16 == fkj0.X) {
                        objT16 = new exi(iu30Var13, (byte) 9);
                        x340Var36.s0(objT16);
                    }
                    rwq.c(0, strO3, str3, strO4, (Function0) objT16, x340Var36, (qim0) null);
                } else {
                    x340Var36.b0();
                }
                return rih1Var;
            case 21:
                jxf0 jxf0Var = (jxf0) obj2;
                iu30 iu30Var14 = (iu30) obj3;
                x340 x340Var37 = (b0k) obj4;
                int iIntValue15 = ((Number) obj5).intValue();
                if ((iIntValue15 & 48) == 0) {
                    i4 = iIntValue15 | (x340Var37.g(jxf0Var) ? 32 : 16);
                } else {
                    i4 = iIntValue15;
                }
                if ((iIntValue15 & 384) == 0) {
                    i4 |= x340Var37.i(iu30Var14) ? 256 : 128;
                }
                x340 x340Var38 = x340Var37;
                if (x340Var38.Y(i4 & 1, (i4 & 1169) != 1168)) {
                    String strO5 = cwl1.o0(x340Var38, 2131958000);
                    if (jxf0Var.c) {
                        strK2 = x0d.k(x340Var38, -1738520532, 2131957999, x340Var38, false);
                    } else {
                        x340Var38.i0(1940490561);
                        x340Var38.r(false);
                    }
                    String str4 = strK2;
                    String strO6 = cwl1.o0(x340Var38, 2131957998);
                    z2 = (i4 & 896) == 256;
                    Object objT17 = x340Var38.T();
                    if (z2 || objT17 == fkj0.X) {
                        objT17 = new exi(iu30Var14, (byte) 10);
                        x340Var38.s0(objT17);
                    }
                    v8r.e(strO5, true, strO6, (Function0) objT17, null, str4, x340Var38, 48, 16);
                } else {
                    x340Var38.b0();
                }
                return rih1Var;
            case 22:
                return d(obj, obj2, obj3, obj4, obj5);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return e(obj, obj2, obj3, obj4, obj5);
            case 24:
                x340 x340Var39 = (b0k) obj4;
                int iIntValue16 = ((Number) obj5).intValue();
                x340 x340Var40 = x340Var39;
                if (x340Var40.Y(iIntValue16 & 1, (iIntValue16 & 1025) != 1024)) {
                    yxo1.a(cwl1.o0(x340Var40, 2131958116), cwl1.o0(x340Var40, 2131958115), (qim0) null, false, x340Var40, 0, 12);
                } else {
                    x340Var40.b0();
                }
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return f(obj, obj2, obj3, obj4, obj5);
            case 26:
                return g(obj, obj2, obj3, obj4, obj5);
            case 27:
                return h(obj, obj2, obj3, obj4, obj5);
            case 28:
                return i(obj, obj2, obj3, obj4, obj5);
            default:
                b0k b0kVar4 = (b0k) obj4;
                ((Number) obj5).intValue();
                nyx.a(2, (wux) null, apo.r(-169314780, new l8i((xtg0) obj2, (byte) 19), b0kVar4), b0kVar4, 3078, 6);
                return rih1Var;
        }
    }
}
