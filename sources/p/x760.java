package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarProgressBar;
import androidx.car.app.model.CarProgressBarStyle;
import androidx.car.app.model.CarText;
import androidx.car.app.model.GridItem;
import androidx.car.app.model.OnClickDelegateImpl;
import androidx.car.app.model.Row;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import app.p000rive.semantics.SemanticState;
import com.comscore.streaming.ContentFeedType;
import com.comscore.streaming.ContentType;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;
import com.spotify.martini.martinidata.model.Mode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class x760 {
    public static final zbg a = new zbg((byte) 2);
    public static b180 b;
    public static b180 c;

    public static final oiw0 A(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, k4m k4mVar, boolean z4, boolean z5, zkm zkmVar, i091 i091Var, boolean z6, boolean z7) {
        String str6;
        boolean zV = p2o1.v(zkmVar, str2);
        if (zV) {
            return new niw0(str, z5, str4, z4);
        }
        if (!z6) {
            return new hiw0(str, str3, z5, z4, z3);
        }
        if (!z6) {
            return new iiw0(str, str3, z5, z4, z3, k4mVar);
        }
        if (i091Var == null) {
            return new iiw0(str, str3, z5, z4, z3, k4mVar);
        }
        if (zV) {
            return new niw0(str, z5, str4, z4);
        }
        k091 k091Var = i091Var.h;
        if (u890.j(k091Var, j091.a)) {
            return new jiw0(str, z5, z4);
        }
        if (k091Var instanceof k091) {
            h091 h091Var = k091Var.a;
            if (h091Var.equals(f091.a) || h091Var.equals(e091.a)) {
                return new liw0(str, z5, z4);
            }
            if (h091Var.equals(d091.a) || h091Var.equals(g091.a)) {
                return new kiw0(str, z5, z4);
            }
            eg.o();
            return null;
        }
        if (u890.j(k091Var, l091.a)) {
            return new iiw0(str, str3, z5, z4, z3, k4mVar);
        }
        if (!u890.j(k091Var, m091.a) && !u890.j(k091Var, n091.a)) {
            eg.o();
            return null;
        }
        if (i091Var.g || !ebp1.q(i091Var)) {
            return new iiw0(str, (z2 || str5 == null) ? str3 : str5, z5, z4, z3, k4mVar);
        }
        if (str5 == null) {
            str6 = z2 ? "USE_DEFAULT_PREVIEW_LABEL" : "";
        } else {
            str6 = str5;
        }
        return new miw0(str, str6, z5, z4, i091Var.e, i091Var.d, ebp1.q(i091Var), i091Var.c, z, z2, k4mVar, z7);
    }

    public static final void B(ou51 ou51Var, long j, iu30 iu30Var) {
        l8q0 l8q0Var = new l8q0(j);
        k8q0 k8q0Var = k8q0.a;
        w0h1.o(3, k8q0Var);
        mu51 mu51Var = new mu51(ou51Var, l8q0Var, k8q0Var, pu51.b, qu51.e, (a8d1) iu30Var, (xu30) null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ou51.f;
        ou51Var.h(mu51Var, false);
    }

    public static final void C(ou51 ou51Var, long j, ct20 ct20Var) {
        B(ou51Var, hap1.u(j), ct20Var);
    }

    public static Row D(nwc nwcVar, nwc nwcVar2, hvc hvcVar, Integer num, nwc nwcVar3, Boolean bool, Action action, boolean z, boolean z2, Float f, final Function0 function0, int i) {
        if ((i & 2) != 0) {
            nwcVar2 = null;
        }
        if ((i & 4) != 0) {
            hvcVar = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            nwcVar3 = null;
        }
        if ((i & 64) != 0) {
            bool = null;
        }
        if ((i & SemanticState.Focused) != 0) {
            action = null;
        }
        if ((i & SemanticState.Hidden) != 0) {
            z = true;
        }
        if ((i & 512) != 0) {
            z2 = true;
        }
        if ((i & SemanticState.ReadOnly) != 0) {
            f = null;
        }
        if ((i & SemanticState.Modal) != 0) {
            function0 = null;
        }
        at31 at31Var = new at31();
        CharSequence charSequenceB = nwcVar != null ? hon1.B(nwcVar) : null;
        if (charSequenceB == null || charSequenceB.length() == 0) {
            charSequenceB = null;
        }
        if (charSequenceB == null) {
            charSequenceB = " ";
        }
        CarText carTextCreate = CarText.create(charSequenceB);
        if (carTextCreate.isEmpty()) {
            hhg1.n("The title cannot be null or empty");
            return null;
        }
        trd.f.b(carTextCreate);
        at31Var.b = carTextCreate;
        at31Var.a = z;
        at31Var.j = z2;
        ArrayList arrayList = at31Var.c;
        if (nwcVar2 != null) {
            CharSequence charSequenceB2 = hon1.B(nwcVar2);
            Objects.requireNonNull(charSequenceB2);
            trd.h.b(CarText.create(charSequenceB2));
            arrayList.add(CarText.create(charSequenceB2));
        }
        if (nwcVar3 != null) {
            CharSequence charSequenceB3 = hon1.B(nwcVar3);
            Objects.requireNonNull(charSequenceB3);
            trd.h.b(CarText.create(charSequenceB3));
            arrayList.add(CarText.create(charSequenceB3));
        }
        if (hvcVar != null) {
            CarIcon carIconR = lnn1.r(hvcVar);
            int iIntValue = num != null ? num.intValue() : 2;
            yo31.e.j(carIconR);
            at31Var.d = carIconR;
            at31Var.i = iIntValue;
        }
        CarProgressBar carProgressBarE = E(f);
        if (carProgressBarE != null) {
            at31Var.k = carProgressBarE;
        }
        if (function0 != null) {
            final byte b2 = 0;
            at31Var.f = OnClickDelegateImpl.create(new f2q0() { // from class: p.ck90
                @Override // p.f2q0
                public final /* synthetic */ void onClick() {
                    byte b3 = b2;
                    Function0 function1 = function0;
                    switch (b3) {
                        case 0:
                            function1.invoke();
                            break;
                        default:
                            function1.invoke();
                            break;
                    }
                }
            });
        }
        if (bool != null && action == null) {
            at31Var.h = bool.booleanValue();
        }
        ArrayList arrayList2 = at31Var.e;
        if (action != null) {
            ArrayList arrayList3 = new ArrayList(arrayList2);
            arrayList3.add(action);
            v90.n.a(arrayList3);
            arrayList2.add(action);
        }
        if (at31Var.b == null) {
            eg.m("A title must be set on the row");
            return null;
        }
        if (at31Var.h) {
            if (at31Var.f == null) {
                eg.m("A browsable row must have its onClickListener set");
                return null;
            }
            if (!arrayList2.isEmpty()) {
                eg.m("A browsable row must not have a secondary action set");
                return null;
            }
        }
        return new Row(at31Var);
    }

    public static final CarProgressBar E(Float f) {
        if (f != null) {
            float fFloatValue = f.floatValue();
            if (Math.abs(fFloatValue) > Float.MAX_VALUE || fFloatValue <= 0.0f) {
                f = null;
            }
            if (f != null) {
                ord ordVar = new ord(yoi1.o(f.floatValue(), 0.0f, 1.0f));
                prd prdVar = new prd();
                CarColor carColorA = zuc.c.a();
                qpd.b.a(carColorA);
                prdVar.a = carColorA;
                ordVar.b = new CarProgressBarStyle(prdVar, 0);
                return new CarProgressBar(ordVar);
            }
        }
        return null;
    }

    public static int F(int i) {
        if (i == 404) {
            return 7;
        }
        if (i == 408 || i == 504) {
            return 2;
        }
        if (i >= 500) {
            return 6;
        }
        return i >= 400 ? 5 : 1;
    }

    public static void G(lac lacVar, byte[] bArr) {
        long j;
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = lacVar.e;
            int i2 = lacVar.f;
            int i3 = lacVar.g;
            if (bArr2 != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
            long j2 = lacVar.d;
            nac nacVar = lacVar.a;
            nacVar.getClass();
            if (j2 == nacVar.b) {
                eg.m("no more bytes");
                return;
            }
            j = lacVar.d;
        } while (lacVar.c(j == -1 ? 0L : j + ((long) (lacVar.g - lacVar.f))) != -1);
    }

    public static void H(int i) {
        String strQ = q(i);
        if (strQ == null) {
            return;
        }
        hhg1.f(strQ);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void a(r4w0 r4w0Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        b0k b0kVar2;
        long j;
        zsc zscVar;
        long j2;
        int i2 = r4w0Var.b;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(584523264);
        int i3 = i | (b0kVar3.g(r4w0Var) ? 4 : 2) | (b0kVar3.i(function0) ? 32 : 16) | (b0kVar3.i(qim0Var) ? SemanticState.Hidden : SemanticState.Focused);
        if (b0kVar3.Y(i3 & 1, (i3 & 147) != 146)) {
            Context context = (Context) b0kVar3.k(AndroidCompositionLocals_androidKt.b);
            boolean z = (i3 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new lj2(function0, (byte) 3);
                b0kVar3.s0(objT);
            }
            qim0 qim0VarX = bin.x(qim0Var, false, (String) null, (pm31) null, (idn0) null, (Function0) objT, 15);
            int iC = l1d.C(i2);
            if (iC == 0) {
                uwr uwrVar = cbx.a;
                j = ((vex) zex.a.b).b;
            } else {
                if (iC != 1) {
                    eg.o();
                    return;
                }
                j = u7h.j;
            }
            cr31 cr31Var = er31.a;
            qim0 qim0VarF = dug.f(qim0VarX, j, cr31Var);
            float f = i2 == 2 ? 1.0f : 0.0f;
            uwr uwrVar2 = cbx.a;
            qim0 qim0VarE = d1u.E(f, cbx.a(b0kVar3).c.b, qim0VarF, cr31Var);
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            qim0 qim0VarN = anm1.N("album_release_card_presave_button", uyn1.y(qim0VarE, 12.0f, 4.0f));
            jw31 jw31VarA = ew31.a(h36.e, een.N0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE2 = zr7.E(b0kVar3, qim0VarN);
            hzj.A.getClass();
            if (((x340) b0kVar3).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(hmb0.t1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(jw31VarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE2, b0kVar3, y580.Y);
            cjc0 cjc0Var = new cjc0(1);
            String str = r4w0Var.a;
            int iC2 = l1d.C(i2);
            if (iC2 == 0) {
                zscVar = zex.a;
                j2 = ((vex) zscVar.b).a;
            } else if (iC2 != 1) {
                eg.o();
                return;
            } else {
                zscVar = zex.a;
                j2 = ((vex) zscVar.b).b;
            }
            lee1 lee1Var = cbx.d(b0kVar3).k;
            cvx cvxVar3 = cbx.b(b0kVar3).b;
            nim0 nim0Var = nim0.a;
            b0kVar2 = b0kVar3;
            zsc zscVar2 = zscVar;
            uwo1.e(str, anm1.N("album_release_card_presave_button_text", uyn1.x(nim0Var, 4.0f)), lee1Var, j2, new a0e1(5), (iu30) null, 2, false, cjc0Var, 0, (qx8) null, b0kVar2, 0, 0, 1696);
            int iC3 = l1d.C(i2);
            if (iC3 == 0) {
                b0kVar2.i0(1845344168);
                String str2 = r4w0Var.a;
                long j3 = ((vex) zscVar2.b).a;
                qim0 qim0VarN2 = anm1.N("album_release_card_presave_button_icon", u291.s(nim0Var, 15.0f, 15.0f));
                cdf0 cdf0VarA = bqn1.A(context, 2131886212);
                nl70.a(new yk4(mno1.y(cdf0VarA, cdf0VarA.getIntrinsicWidth(), cdf0VarA.getIntrinsicHeight(), Bitmap.Config.ARGB_8888)), str2, qim0VarN2, j3, b0kVar2, 0, 0);
                b0kVar2.r(false);
            } else {
                if (iC3 != 1) {
                    throw p3d1.k(b0kVar2, -1187400522, false);
                }
                b0kVar2.i0(1845668893);
                String str3 = r4w0Var.a;
                qim0 qim0VarN3 = anm1.N("album_release_card_presave_button_icon", u291.s(nim0Var, 15.0f, 15.0f));
                cdf0 cdf0VarA2 = bqn1.A(context, 2131886216);
                nl70.a(new yk4(mno1.y(cdf0VarA2, cdf0VarA2.getIntrinsicWidth(), cdf0VarA2.getIntrinsicHeight(), Bitmap.Config.ARGB_8888)), str3, qim0VarN3, 0L, b0kVar2, 0, 8);
                b0kVar2.r(false);
            }
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new oj2(r4w0Var, function0, qim0Var, i, (byte) 11);
        }
    }

    public static final void b(swb swbVar, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        float f;
        boolean z;
        boolean z2 = swbVar.Y;
        String str = swbVar.c;
        String str2 = swbVar.b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1932912824);
        int i2 = i | (x340Var.i(swbVar) ? 4 : 2) | 48 | (x340Var.i(iu30Var) ? SemanticState.Hidden : SemanticState.Focused);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarA = uyn1.A(u291.f(qim0Var3, 1.0f), 16.0f, 24.0f, 16.0f, 32.0f);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            if (str2.length() > 0) {
                x340Var.i0(-251696568);
                g(swbVar.a, str2, z2, x340Var, 8);
                x340Var.r(false);
            } else {
                x340Var.i0(-251612000);
                x340Var.r(false);
            }
            if (str.length() > 0) {
                x340Var.i0(-251562772);
                if (str2.length() > 0) {
                    v8i0.i(16.0f, -251528827, x340Var, x340Var, qim0Var3);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-251472128);
                    x340Var.r(false);
                }
                f = 16.0f;
                pdp1.b(swbVar.c, anm1.N("img_hero", i1p1.q(u291.r(qim0Var3, 96.0f), er31.b(4.0f))), mif1.P0, x340Var, 48, 1976);
                x340Var.r(false);
            } else {
                f = 16.0f;
                x340Var.i0(-251236032);
                x340Var.r(false);
            }
            if (str2.length() <= 0 && str.length() <= 0) {
                x340Var.i0(-251058464);
                x340Var.r(false);
            } else {
                v8i0.i(f, -251111319, x340Var, x340Var, qim0Var3);
                x340Var.r(false);
            }
            String str3 = swbVar.d;
            uwr uwrVar = cbx.a;
            uwo1.e(str3, anm1.N("txt_title", u291.f(qim0Var3, 1.0f)), cbx.d(x340Var).d, cbx.a(x340Var).b.a, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2016);
            x340Var = x340Var;
            if (swbVar.e.length() > 0) {
                v8i0.i(8.0f, -250782285, x340Var, x340Var, qim0Var3);
                uwo1.e(swbVar.e, anm1.N("txt_body", u291.f(qim0Var3, 1.0f)), cbx.d(x340Var).g, cbx.a(x340Var).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2016);
                x340Var = x340Var;
                z = false;
                x340Var.r(false);
            } else {
                z = false;
                x340Var.i0(-250493024);
                x340Var.r(false);
            }
            if (swbVar.f.length() <= 0 && swbVar.i.length() <= 0) {
                x340Var.i0(-250247008);
                x340Var.r(z);
            } else {
                v8i0.i(24.0f, -250360406, x340Var, x340Var, qim0Var3);
                c(swbVar, iu30Var, z2, x340Var, 8 | (i2 & 14) | ((i2 >> 3) & ContentType.LONG_FORM_ON_DEMAND));
                x340Var.r(z);
            }
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zt6(swbVar, qim0Var2, iu30Var, i, (byte) 24);
        }
    }

    public static final void c(swb swbVar, iu30 iu30Var, boolean z, b0k b0kVar, int i) {
        int i2;
        int i3;
        boolean z2;
        qim0 qim0Var;
        byte b2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(922202904);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(swbVar) : x340Var.i(swbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.h(z) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            int length = swbVar.f.length();
            qim0 qim0Var2 = nim0.a;
            dzo1 dzo1Var = z50.c;
            if (length > 0) {
                x340Var.i0(-1558873048);
                if (z) {
                    x340Var.i0(-1558876303);
                    j(swbVar, iu30Var, x340Var, 8 | (i2 & 14) | (i2 & ContentType.LONG_FORM_ON_DEMAND));
                    x340Var.r(false);
                    i3 = i2;
                    z2 = false;
                    qim0Var = qim0Var2;
                } else {
                    x340Var.i0(-1558777258);
                    gdx gdxVarR = yla.r(x340Var);
                    qim0 qim0VarN = anm1.N("btn_primary", u291.f(qim0Var2, 1.0f));
                    boolean z3 = ((i2 & 14) == 4 || ((i2 & 8) != 0 && x340Var.i(swbVar))) | ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32);
                    Object objT = x340Var.T();
                    if (z3 || objT == m4cVar) {
                        objT = new wvb(iu30Var, swbVar, (byte) 0);
                        x340Var.s0(objT);
                    }
                    i3 = i2;
                    z2 = false;
                    qim0Var = qim0Var2;
                    foo1.c(new gbx(dzo1Var, (Function0) objT), new idx(4), qim0VarN, (max) null, gdxVarR, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, swbVar.h ? v9i.a : null, apo.r(1337693974, new xvb(swbVar, (byte) 0), x340Var), x340Var, 0, 48, 984);
                    x340Var = x340Var;
                    x340Var.r(false);
                }
                x340Var.r(z2);
            } else {
                i3 = i2;
                z2 = false;
                qim0Var = qim0Var2;
                dzo1Var = dzo1Var;
                x340Var.i0(-1557825558);
                x340Var.r(false);
            }
            if (swbVar.i.length() > 0) {
                x340Var.i0(-1557754785);
                if (swbVar.f.length() > 0) {
                    v8i0.i(8.0f, -1557726668, x340Var, x340Var, qim0Var);
                    x340Var.r(z2);
                } else {
                    x340Var.i0(-1557674774);
                    x340Var.r(z2);
                }
                gdx gdxVarR2 = yla.r(x340Var);
                qim0 qim0VarN2 = anm1.N("btn_secondary", u291.f(qim0Var, 1.0f));
                boolean z4 = (((i3 & 14) == 4 || ((i3 & 8) != 0 && x340Var.i(swbVar))) ? true : z2) | ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 32 ? true : z2);
                Object objT2 = x340Var.T();
                if (z4 || objT2 == m4cVar) {
                    b2 = 1;
                    objT2 = new wvb(iu30Var, swbVar, (byte) 1);
                    x340Var.s0(objT2);
                } else {
                    b2 = 1;
                }
                x340 x340Var2 = x340Var;
                foo1.c(new gbx(dzo1Var, (Function0) objT2), ldx.c, qim0VarN2, (max) null, gdxVarR2, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(1478180649, new xvb(swbVar, b2), x340Var), x340Var2, 0, 48, 2008);
                x340Var = x340Var2;
                x340Var.r(z2);
            } else {
                x340Var.i0(-1557067670);
                x340Var.r(z2);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e30(swbVar, iu30Var, z, i, (byte) 5);
        }
    }

    public static final void d(w7a1 w7a1Var, qim0 qim0Var, b0k b0kVar, int i) {
        String strU;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2046696107);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(w7a1Var) ? 4 : 2) | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarN = anm1.N("ContributorImage", i1p1.q(d7e.r(1.0f, u291.f(nim0Var, 1.0f), false), er31.a));
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = y5a1.N0;
                x340Var.s0(objT);
            }
            qim0 qim0VarA = s161.a(qim0VarN, (iu30) objT);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarA);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            String str = w7a1Var.d;
            Uri uri = str != null ? Uri.parse(str) : Uri.EMPTY;
            uri.getClass();
            jsl jslVar = new jsl(f4i1.e(w7a1Var.a, " image"));
            uwr uwrVar = cbx.a;
            cbx.a.getClass();
            ecx ecxVarA = uwr.a();
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            nkx nkxVar = nkx.c;
            eso1.e(uri, jslVar, qim0VarD, (p3v) null, (zvx) null, ecxVarA, (j6m) null, (tl3) null, (ColorFilter) null, new nux(nkxVar, nkxVar), false, false, x340Var, 1073744896, 0, 3536);
            x340Var.r(true);
            op71.g(x340Var, u291.h(nim0Var, 8.0f));
            uwo1.e(w7a1Var.a, anm1.N("ContributorName", nim0Var), cbx.d(x340Var).k, cbx.a(x340Var).b.a, new a0e1(3), (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, x340Var, 0, 0, 1696);
            op71.g(x340Var, u291.h(nim0Var, 4.0f));
            c380 c380Var = w7a1Var.c;
            int size = c380Var.size();
            if (size == 0) {
                x340Var.i0(-1159214625);
                x340Var.r(false);
                strU = "";
            } else if (size != 1) {
                x340Var.i0(-1159168960);
                String str2 = (String) o7h.q0(c380Var);
                int size2 = c380Var.size() - 1;
                strU = cwl1.U(2131820916, size2, new Object[]{str2, Integer.valueOf(size2)}, x340Var);
                x340Var.r(false);
            } else {
                x340Var.i0(1209532550);
                x340Var.r(false);
                strU = (String) o7h.q0(c380Var);
            }
            uwo1.e(strU, anm1.N("ContributorRoles", nim0Var), cbx.d(x340Var).j, 0L, new a0e1(3), (iu30) null, 0, false, new cjc0(2), 0, (qx8) null, x340Var, 0, 0, 1768);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q081(w7a1Var, qim0Var, i, (byte) 17);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void e(c380 c380Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        boolean z;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1101428500);
        j06 j06Var = x340Var.a;
        int i2 = (x340Var.g(c380Var) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        boolean z2 = false;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z3 = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z3 || objT == fkj0.X) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : c380Var) {
                    if (obj instanceof w7a1) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : c380Var) {
                    if (obj2 instanceof x7a1) {
                        arrayList2.add(obj2);
                    }
                }
                smc0 smc0VarN = k4p1.n();
                if (arrayList.isEmpty() || arrayList2.isEmpty()) {
                    smc0VarN.addAll(o7h.d1(c380Var, 2));
                } else {
                    smc0VarN.add(o7h.q0(arrayList));
                    smc0VarN.add(o7h.q0(arrayList2));
                }
                objT = k4p1.k(smc0VarN);
                x340Var.s0(objT);
            }
            List<w7a1> list = (List) objT;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(16.0f, true, new um5(false)), een.Z, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z4 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z4) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar4);
            nko1.H(xos0VarM, x340Var, lljVar3);
            x0d.q(iHashCode, x340Var, lljVar2, x340Var);
            nko1.H(qim0VarE, x340Var, lljVar);
            x340Var.i0(-314514540);
            for (w7a1 w7a1Var : list) {
                wnb0 wnb0Var = new wnb0(1.0f, true);
                gfh0 gfh0VarC = t1c.c(een.h, z2);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, wnb0Var);
                hzj.A.getClass();
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC, x340Var, lljVar4);
                nko1.H(xos0VarM2, x340Var, lljVar3);
                x0d.q(iHashCode2, x340Var, lljVar2, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar);
                boolean z5 = w7a1Var instanceof w7a1;
                nim0 nim0Var = nim0.a;
                if (z5) {
                    x340Var.i0(-784180351);
                    z = true;
                    z2 = false;
                    d(w7a1Var, anm1.N("ContributorBubble", u291.x(0.0f, 224.0f, 1, nim0Var)), x340Var, 0);
                    x340Var.r(false);
                } else {
                    z = true;
                    if (!(w7a1Var instanceof x7a1)) {
                        throw p3d1.k(x340Var, -784182585, false);
                    }
                    x340Var.i0(-784172210);
                    z2 = false;
                    k((x7a1) w7a1Var, anm1.N("SampleCard", u291.x(0.0f, 224.0f, 1, nim0Var)), x340Var, 0);
                    x340Var.r(false);
                }
                x340Var.r(z);
            }
            x340Var.r(z2);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e(c380Var, qim0Var, i, (byte) 9);
        }
    }

    public static final void f(String str, mr10 mr10Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1132459616);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(mr10Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : SemanticState.Focused;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(qim0Var) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new bb30(iu30Var, (byte) 19);
                x340Var.s0(objT);
            }
            z50 z50Var = z50.c;
            gbx gbxVar = new gbx(z50Var, (Function0) objT);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = bp30.Z0;
                x340Var.s0(objT2);
            }
            vu30 vu30Var = (vu30) objT2;
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            foo1.c(gbxVar, new hdx(0, (vu30) null, vu30Var, (vu30) null, er31.b(8.0f), 11), (qim0) null, (max) null, yla.s(x340Var), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, iqi.a, x340Var, 0, 48, 2012);
            op71.g(x340Var, u291.v(nim0.a, 8.0f));
            otw.c(mr10Var, new fr10(str, (String) null, true, Mode.PROMPTABLE_SECTION, (String) null, false, 106), (qim0) null, (ipb1) null, x340Var, (i2 >> 3) & 14, 12);
            boolean z2 = i3 == 256;
            Object objT3 = x340Var.T();
            if (z2 || objT3 == m4cVar) {
                objT3 = new bb30(iu30Var, (byte) 20);
                x340Var.s0(objT3);
            }
            gbx gbxVar2 = new gbx(z50Var, (Function0) objT3);
            ldx ldxVar = ldx.c;
            foo1.c(gbxVar2, ldxVar, (qim0) null, (max) null, yla.s(x340Var), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, iqi.b, x340Var, 0, 48, 2012);
            boolean z3 = i3 == 256;
            Object objT4 = x340Var.T();
            if (z3 || objT4 == m4cVar) {
                objT4 = new bb30(iu30Var, (byte) 21);
                x340Var.s0(objT4);
            }
            foo1.c(new gbx(z50Var, (Function0) objT4), ldxVar, (qim0) null, (max) null, yla.s(x340Var), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, iqi.c, x340Var, 0, 48, 2012);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ke20(i, str, mr10Var, iu30Var, qim0Var, (byte) 3);
        }
    }

    public static final void g(hux huxVar, String str, boolean z, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var;
        qim0 qim0Var2;
        String str2 = str;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-764983820);
        int i2 = i | (b0kVar3.i(huxVar) ? 4 : 2) | (b0kVar3.g(str2) ? 32 : 16) | (b0kVar3.h(z) ? SemanticState.Hidden : SemanticState.Focused);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = z ? k1o1.n(qim0Var3) : qim0Var3;
            jw31 jw31VarA = ew31.a(h36.a, een.N0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0Var3);
            hzj.A.getClass();
            if (((x340) b0kVar3).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(hmb0.t1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(jw31VarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            if (huxVar != null) {
                b0kVar3.i0(1369585306);
                qim0 qim0VarThen = u291.r(qim0Var3, 16.0f).then(qim0VarN);
                uwr uwrVar = cbx.a;
                qim0Var = qim0Var3;
                qim0Var2 = qim0VarN;
                w0h1.a(huxVar, isl.a, qim0VarThen, cbx.a(b0kVar3).b.c, 0L, false, b0kVar3, 56 | (i2 & 14), 48);
                ab80.p(qim0Var, 4.0f, b0kVar3, false);
            } else {
                qim0Var = qim0Var3;
                qim0Var2 = qim0VarN;
                b0kVar3.i0(1369846698);
                b0kVar3.r(false);
            }
            uwr uwrVar2 = cbx.a;
            b0kVar2 = b0kVar3;
            uwo1.e(str, anm1.N("txt_header", qim0Var).then(qim0Var2), cbx.d(b0kVar3).h, cbx.a(b0kVar3).b.c, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, (i2 >> 3) & 14, 0, 2032);
            str2 = str;
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new yvb(i, str2, huxVar, z);
        }
    }

    public static final void h(aff0 aff0Var, xpw xpwVar, xpw xpwVar2, xpw xpwVar3, xpw xpwVar4, qim0 qim0Var, xpw xpwVar5, iu30 iu30Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        qim0 qim0VarF;
        boolean z;
        qim0 qim0VarB;
        qim0 qim0Var3;
        boolean z2;
        boolean z3;
        m4c m4cVar = fkj0.X;
        boolean z4 = aff0Var.h;
        a9h a9hVar = aff0Var.a;
        fef0 fef0Var = a9hVar.a;
        yef0 yef0Var = aff0Var.i;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-81864717);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.i(aff0Var) ? 4 : 2) | (x340Var.i(xpwVar) ? 32 : 16) | (x340Var.i(xpwVar2) ? SemanticState.Hidden : SemanticState.Focused) | (x340Var.i(xpwVar3) ? SemanticState.Modal : SemanticState.ReadOnly) | (x340Var.i(xpwVar4) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline) | 196608 | (x340Var.i(xpwVar5) ? 1048576 : 524288) | (x340Var.i(iu30Var) ? 8388608 : 4194304);
        if (x340Var.Y(i2 & 1, (i2 & 4793491) != 4793490)) {
            float fM = dsa0.m(x340Var, 2131167225);
            float fM2 = dsa0.m(x340Var, 2131167226);
            float f = fM2 - 8.0f;
            float f2 = f < 0.0f ? 0.0f : f;
            String strK = aff0Var.j ? x0d.k(x340Var, 710361322, 2131957811, x340Var, false) : x0d.k(x340Var, 710435474, 2131957810, x340Var, false);
            uwr uwrVar = cbx.a;
            tob1 tob1VarA = w191.a(cbx.a(x340Var).a.c, irn1.o0(ContentFeedType.OTHER, 0, (dlv) null, 6), "background color", x340Var, 384, 8);
            tob1 tob1VarA2 = w191.a(cbx.a(x340Var).a.b.a(), irn1.o0(ContentFeedType.OTHER, 0, (dlv) null, 6), "background color", x340Var, 384, 8);
            boolean z5 = fef0Var.a.isEmpty() && (yef0Var instanceof xef0) && !z4;
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarZ = u291.z(u291.f(anm1.N("#LyricsCardTag", qim0Var4), 1.0f), (fra) null, 3);
            if (aff0Var.d.f) {
                u7h u7hVar = (u7h) tob1VarA.getValue();
                long j = u7hVar.a;
                u7h u7hVar2 = (u7h) tob1VarA2.getValue();
                long j2 = u7hVar2.a;
                qim0VarF = dug.e(qim0Var4, new mic0(0, 0L, 9187343241974906880L, p7h.M(new u7h[]{u7hVar, u7hVar2}), (List) null), er31.b(fM), 0.0f, 4);
            } else {
                qim0VarF = dug.f(qim0Var4, ((u7h) tob1VarA.getValue()).a, er31.b(fM));
            }
            qim0 qim0VarThen = qim0VarZ.then(qim0VarF);
            if (aff0Var.e) {
                x340Var.i0(711784749);
                String strO0 = cwl1.o0(x340Var, 2131957803);
                boolean z6 = (i2 & 29360128) == 8388608;
                Object objT = x340Var.T();
                if (z6 || objT == m4cVar) {
                    objT = new uef0(iu30Var, (byte) 0);
                    x340Var.s0(objT);
                }
                qim0VarB = bin.x(qim0Var4, false, strO0, (pm31) null, (idn0) null, (Function0) objT, 13);
                x340Var.r(false);
                z = true;
            } else {
                x340Var.i0(711979367);
                Object objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = z1f0.t;
                    x340Var.s0(objT2);
                }
                z = true;
                qim0VarB = s161.b(qim0Var4, true, (iu30) objT2);
                x340Var.r(false);
            }
            float f3 = f2;
            qim0 qim0VarB2 = uyn1.B(qim0VarThen.then(qim0VarB), 0.0f, f3, 0.0f, z5 ? f2 : fM2, 5);
            d36 d36Var = new d36(8.0f, z, new um5(false));
            era eraVar = een.P0;
            mbh mbhVarA = jbh.a(d36Var, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB2);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z7 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z7) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = v8r.q(i0f0.Y);
                x340Var.s0(objT3);
            }
            ven0 ven0Var = (ven0) objT3;
            boolean zG = x340Var.g(aff0Var);
            Object objT4 = x340Var.T();
            if (zG || objT4 == m4cVar) {
                objT4 = v8r.q(new frf0(new yqf0(aff0Var.b, aff0Var.c, a9hVar.a, dhf0.d, aff0Var.j), new erf0(zqf0.a, 1, a9hVar.b, aff0Var.k, false, false), z1f0.Y, new sqa0(ven0Var, (byte) 9)));
                x340Var.s0(objT4);
            }
            ven0 ven0Var2 = (ven0) objT4;
            gm50.f(xpwVar, (Function0) ven0Var.getValue(), aff0Var.e, aff0Var.f, aff0Var.g, strK, uyn1.B(qim0Var4, fM2, 0.0f, f3, 0.0f, 10), xpwVar5, x340Var, ((i2 >> 3) & 14) | ((i2 << 3) & 29360128));
            x340Var = x340Var;
            if (z5) {
                qim0Var3 = qim0Var4;
                z2 = true;
                x340Var.i0(1657621657);
                x340Var.r(false);
            } else {
                x340Var.i0(1656292594);
                qim0 qim0VarZ2 = uyn1.z(fM2, 0.0f, 2, qim0Var4);
                mbh mbhVarA2 = jbh.a(new d36(16.0f, true, new um5(false)), eraVar, x340Var, 0);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarZ2);
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA2, x340Var, lljVar);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar4);
                if (fef0Var.a.isEmpty()) {
                    qim0Var3 = qim0Var4;
                    z2 = true;
                    x340Var.i0(-1975965528);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1976256060);
                    qim0 qim0VarU = u291.u(qim0Var4, 0.0f, 0.0f, 0.0f, 256.0f, 7);
                    qim0Var3 = qim0Var4;
                    Object objT5 = x340Var.T();
                    if (objT5 == m4cVar) {
                        objT5 = z1f0.X;
                        x340Var.s0(objT5);
                    }
                    qim0 qim0VarA = s161.a(qim0VarU, (iu30) objT5);
                    z2 = true;
                    otw.c(xpwVar2, (frf0) ven0Var2.getValue(), qim0VarA, (ipb1) null, x340Var, ((i2 >> 6) & 14) | 64, 8);
                    x340Var.r(false);
                }
                if (yef0Var instanceof yef0) {
                    x340Var.i0(-1975879131);
                    yef0 yef0Var2 = yef0Var;
                    otw.c(xpwVar3, new zkf0(new dof1(yef0Var2.c, yef0Var2.b, yef0Var2.d, yef0Var2.a)), u291.f(qim0Var3, 1.0f), (ipb1) null, x340Var, (i2 >> 9) & 14, 8);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1975251288);
                    x340Var.r(false);
                }
                if (z4) {
                    x340Var.i0(-1975196170);
                    otw.c(xpwVar4, rih1.a, (qim0) null, (ipb1) null, x340Var, ((i2 >> 12) & 14) | 48, 12);
                    z3 = false;
                    x340Var.r(false);
                } else {
                    z3 = false;
                    x340Var.i0(-1975117368);
                    x340Var.r(false);
                }
                x340Var.r(z2);
                x340Var.r(z3);
            }
            x340Var.r(z2);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n(aff0Var, xpwVar, xpwVar2, xpwVar3, xpwVar4, qim0Var2, xpwVar5, iu30Var, i, (byte) 12);
        }
    }

    public static final void i(zff1 zff1Var, Integer num, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        long j;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1794875295);
        int i2 = i | (x340Var.i(zff1Var) ? 4 : 2) | (x340Var.g(num) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            xxh xxhVar = zff1Var.d;
            boolean z = xxhVar instanceof wxh;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarU = u291.u(qim0Var3, 24.0f, 0.0f, 0.0f, 0.0f, 14);
            mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarU);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            vxh vxhVar = vxh.a;
            if (!z || u890.j(xxhVar, vxhVar)) {
                x340Var.i0(951367243);
                x340Var.r(false);
            } else {
                x340Var.i0(951305739);
                lap1.a(xxhVar, (qim0) null, x340Var, 0);
                x340Var.r(false);
            }
            String str = zff1Var.b;
            u7h u7hVar = num != null ? new u7h(z4p1.e(num.intValue())) : null;
            if (u7hVar == null) {
                x340Var.i0(1277618907);
                uwr uwrVar = cbx.a;
                j = cbx.a(x340Var).b.a;
                x340Var.r(false);
            } else {
                x340Var.i0(1277617202);
                x340Var.r(false);
                j = u7hVar.a;
            }
            uwr uwrVar2 = cbx.a;
            uwo1.e(str, (qim0) null, cbx.d(x340Var).h, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
            if (z || u890.j(xxhVar, vxhVar)) {
                x340Var.i0(951669803);
                x340Var.r(false);
            } else {
                x340Var.i0(951608299);
                lap1.a(xxhVar, (qim0) null, x340Var, 0);
                x340Var.r(false);
            }
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new juc1(zff1Var, num, qim0Var2, i, (byte) 17);
        }
    }

    public static final void j(swb swbVar, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1255499519);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(swbVar) : x340Var.i(swbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            idn0 idn0VarY = zso1.Y(x340Var);
            cr31 cr31VarA = er31.a(50);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarA = da80.a(anm1.N("btn_primary", nim0Var), idn0VarY, new vch(vno1.o(cr31VarA, x340Var, 0)));
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            op71.g(x340Var, dug.f(k1o1.n(h2c.a.b(nim0Var)), u7h.b, cr31VarA));
            gfx.b(4, apo.r(254423548, new zt6(iu30Var, swbVar, idn0VarY, (byte) 25), x340Var), x340Var, 54);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g90(swbVar, iu30Var, i, (byte) 19);
        }
    }

    public static final void k(x7a1 x7a1Var, qim0 qim0Var, b0k b0kVar, int i) {
        String str = x7a1Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2098913389);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(x7a1Var) ? 4 : 2) | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarR = d7e.r(1.0f, u291.f(nim0Var, 1.0f), false);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarX = uyn1.x(qim0VarR, 8.0f);
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarN = anm1.N("SampleImage", i1p1.q(qim0VarX, er31.b(8.0f)));
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = y5a1.O0;
                x340Var.s0(objT);
            }
            qim0 qim0VarA = s161.a(qim0VarN, (iu30) objT);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarA);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            String str2 = x7a1Var.d;
            Uri uri = str2 != null ? Uri.parse(str2) : Uri.EMPTY;
            uri.getClass();
            jsl jslVar = new jsl(cwl1.n0(2131962709, new Object[]{str}, x340Var));
            cbx.a.getClass();
            ecx ecxVarA = uwr.a();
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            ltx ltxVar = ltx.c;
            eso1.e(uri, jslVar, qim0VarD, (p3v) null, (zvx) null, ecxVarA, (j6m) null, (tl3) null, (ColorFilter) null, new nux(ltxVar, ltxVar), false, false, x340Var, 1073744896, 0, 3536);
            x340Var.r(true);
            cvx cvxVar2 = cbx.b(x340Var).b;
            uwo1.e(str, anm1.N("SampleName", nim0Var), kk0.p(nim0Var, 8.0f, x340Var, x340Var).k, cbx.a(x340Var).b.a, new a0e1(3), (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, x340Var, 0, 0, 1696);
            cvx cvxVar3 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 4.0f));
            String str3 = x7a1Var.c;
            if (str3 == null) {
                str3 = "";
            }
            uwo1.e(str3, anm1.N("SampleMetadata", nim0Var), cbx.d(x340Var).j, cbx.a(x340Var).b.a, new a0e1(3), (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, x340Var, 0, 0, 1760);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q081(x7a1Var, qim0Var, i, (byte) 18);
        }
    }

    public static final void l(a8a1 a8a1Var, iu30 iu30Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-541031240);
        int i2 = (b0kVar3.g(a8a1Var) ? 4 : 2) | i | (b0kVar3.i(iu30Var) ? 32 : 16);
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            String strO0 = cwl1.o0(b0kVar3, 2131962705);
            boolean z = (i2 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object objT = b0kVar3.T();
            if (z || objT == m4cVar) {
                objT = new pc81(iu30Var, (byte) 23);
                b0kVar3.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strO0), function0);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(b0kVar3).f;
            cr31 cr31VarB = er31.b(16.0f);
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = yd81.b1;
                b0kVar3.s0(objT2);
            }
            kgx kgxVar = new kgx(0, (vu30) objT2, (vu30) null, (vu30) null, 13);
            vzq0.a.getClass();
            b0kVar2 = b0kVar3;
            cwl1.b(qim0VarF, (tl3) null, cr31VarB, kgxVar, uzq0.b, (max) null, false, (idn0) null, jtr.f, gbxVar, (gbx) null, apo.r(1452474209, new xw91(a8a1Var, iu30Var, (byte) 3), b0kVar3), b0kVar2, 0, 48, 1250);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new m7a1(a8a1Var, iu30Var, i);
        }
    }

    public static final void m(wff1 wff1Var, zff1 zff1Var, int i, Integer num, boolean z, srt0 srt0Var, iu30 iu30Var, qim0 qim0Var, iu30 iu30Var2, boolean z2, b0k b0kVar, int i2) {
        int i3;
        iu30 iu30Var3;
        b0k b0kVar2;
        qim0 qim0Var2;
        boolean z3 = z;
        String str = zff1Var.b;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-392557678);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? b0kVar3.g(wff1Var) : b0kVar3.i(wff1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? b0kVar3.g(zff1Var) : b0kVar3.i(zff1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= b0kVar3.e(i) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i2 & 3072) == 0) {
            i3 |= b0kVar3.g(num) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        if ((i2 & 24576) == 0) {
            i3 |= b0kVar3.h(z3) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline;
        }
        if ((196608 & i2) == 0) {
            i3 |= b0kVar3.i(srt0Var) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= b0kVar3.i(iu30Var) ? 1048576 : 524288;
        }
        int i4 = i3 | 12582912;
        if ((100663296 & i2) == 0) {
            iu30Var3 = iu30Var2;
            i4 |= b0kVar3.i(iu30Var3) ? 67108864 : 33554432;
        } else {
            iu30Var3 = iu30Var2;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= b0kVar3.h(z2) ? 536870912 : 268435456;
        }
        if (b0kVar3.Y(i4 & 1, (i4 & 306783379) != 306783378)) {
            String str2 = String.format(cwl1.o0(b0kVar3, 2131963309), Arrays.copyOf(new Object[]{str}, 1));
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            String str3 = String.format("top-chart-row-%s", Arrays.copyOf(new Object[]{str}, 1));
            boolean z4 = ((3670016 & i4) == 1048576) | ((i4 & 896) == 256);
            int i5 = i4 & ContentType.LONG_FORM_ON_DEMAND;
            boolean z5 = z4 | (i5 == 32 || ((i4 & 64) != 0 && b0kVar3.i(zff1Var)));
            Object objT = b0kVar3.T();
            if (z5 || objT == m4cVar) {
                objT = new ynd1(iu30Var, i, zff1Var, (byte) 2);
                b0kVar3.s0(objT);
            }
            qim0 qim0VarI = zr7.i(qim0VarF, new pa5(!z3, cwl1.o0(b0kVar3, zff1Var.f), (Function0) objT, str3, (byte) 0));
            boolean zG = (i5 == 32 || ((i4 & 64) != 0 && b0kVar3.i(zff1Var))) | ((i4 & 57344) == 16384) | b0kVar3.g(str2);
            Object objT2 = b0kVar3.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new wq01(z3, str2, zff1Var, (byte) 7);
                b0kVar3.s0(objT2);
            }
            qim0 qim0VarA = s161.a(qim0VarI, (iu30) objT2);
            uvx uvxVar = new uvx((pgx) null, 5, (tvx) null, new p3v(101.0f), 10);
            j2i j2iVarR = apo.r(886296648, new xw91(zff1Var, num, (byte) 23), b0kVar3);
            j2i j2iVarR2 = apo.r(-2142599863, new jff1(zff1Var, z3, (byte) 0), b0kVar3);
            j2i j2iVarR3 = apo.r(956830410, new jff1(zff1Var, z3, (byte) 1), b0kVar3);
            jjd0 jjd0Var = new jjd0(wff1Var, zff1Var, z3, i, iu30Var, iu30Var3, z2);
            z3 = z3;
            qim0Var2 = qim0Var3;
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarA, uvxVar, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, j2iVarR, j2iVarR2, (xu30) null, j2iVarR3, apo.r(-2072066101, jjd0Var, b0kVar3), (xu30) null, apo.r(460075469, new jff1(zff1Var, z3, (byte) 2), b0kVar3), apo.r(1726146254, new n8k0(zff1Var, srt0Var, z3, (byte) 17), b0kVar3), b0kVar2, 907542592, 221616, 9404);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new e8f1(wff1Var, zff1Var, i, num, z3, srt0Var, iu30Var, qim0Var2, iu30Var2, z2, i2);
        }
    }

    public static final void n(yff1 yff1Var, iu30 iu30Var, qim0 qim0Var, iu30 iu30Var2, boolean z, b0k b0kVar, int i) {
        wff1 wff1Var = yff1Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(454851789);
        int i2 = 2;
        iu30 iu30Var3 = iu30Var;
        iu30 iu30Var4 = iu30Var2;
        boolean z2 = z;
        int i3 = i | (x340Var.i(yff1Var) ? 4 : 2) | (x340Var.i(iu30Var3) ? 32 : 16) | (x340Var.i(qim0Var) ? SemanticState.Hidden : SemanticState.Focused) | (x340Var.i(iu30Var4) ? SemanticState.Modal : SemanticState.ReadOnly) | (x340Var.h(z2) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline);
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            d36 d36Var = new d36(8.0f, true, new um5(false));
            qim0 qim0VarN = anm1.N("top-tracks-container", u291.f(qim0Var, 1.0f));
            mbh mbhVarA = jbh.a(d36Var, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            x340Var.i0(805999901);
            int i4 = 0;
            for (Object obj : wff1Var.getItems()) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    p7h.T();
                    throw null;
                }
                zff1 zff1Var = (zff1) obj;
                Integer numO = wff1Var.o();
                int i6 = zff1Var.X;
                int i7 = i3 << 15;
                m(wff1Var, zff1Var, i4, numO, i6 != 0 && (i6 == i2 || !yff1Var.c), yff1Var.b, iu30Var3, null, iu30Var4, z2, x340Var, 64 | (i7 & 3670016) | (i7 & 234881024) | (i7 & 1879048192));
                iu30Var3 = iu30Var;
                iu30Var4 = iu30Var2;
                z2 = z;
                i4 = i5;
                i2 = 2;
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ofi0(yff1Var, iu30Var, qim0Var, iu30Var2, z, i, (byte) 20);
        }
    }

    public static final void o(zff1 zff1Var, srt0 srt0Var, qim0 qim0Var, boolean z, b0k b0kVar, int i) {
        qim0 qim0Var2;
        zkt0 zkt0Var;
        zkt0 zkt0Var2;
        long j;
        String str = zff1Var.e;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(812898154);
        int i2 = i | (x340Var.i(zff1Var) ? 4 : 2) | (x340Var.i(srt0Var) ? 32 : 16) | 384 | (x340Var.h(z) ? SemanticState.Modal : SemanticState.ReadOnly);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean zEquals = srt0Var.equals(new mrt0(str));
            zkt0 zkt0Var3 = zkt0.c;
            if (zEquals) {
                zkt0Var = zkt0.a;
            } else {
                zkt0Var = srt0Var.equals(new krt0(str)) ? zkt0.b : zkt0Var3;
            }
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var3);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            if (z || zkt0Var == zkt0Var3) {
                zkt0Var2 = zkt0Var;
                qim0Var2 = qim0Var3;
                x340Var.i0(1434661308);
                x340Var.r(false);
            } else {
                x340Var.i0(1434359554);
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(x340Var).g;
                zkt0 zkt0Var4 = zkt0Var;
                qim0Var2 = qim0Var3;
                zkt0Var2 = zkt0Var4;
                wkt0.a(zkt0Var2, anm1.N(String.format("play-indicator-%s", Arrays.copyOf(new Object[]{str}, 1)), u291.r(qim0Var3, 12.0f)), (ksl) null, 0L, false, x340Var, 0, 28);
                cvx cvxVar = cbx.b(x340Var).b;
                ab80.p(qim0Var2, 4.0f, x340Var, false);
            }
            String str2 = zff1Var.a;
            uwr uwrVar2 = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).g;
            zic0 zic0Var = new zic0(1);
            if (z || zkt0Var2 == zkt0Var3) {
                x340Var.i0(1154667085);
                j = ((u7h) x340Var.k(qgx.a)).a;
                x340Var.r(false);
            } else {
                x340Var.i0(1154668434);
                j = cbx.a(x340Var).b.c;
                x340Var.r(false);
            }
            uwo1.e(str2, x9p1.j(qim0Var2, z), lee1Var, j, (a0e1) null, (iu30) null, 2, false, zic0Var, 0, (qx8) null, x340Var, 0, 0, 1712);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zp51(zff1Var, srt0Var, qim0Var2, z, i);
        }
    }

    public static final void p(wff1 wff1Var, zff1 zff1Var, boolean z, int i, iu30 iu30Var, iu30 iu30Var2, boolean z2, b0k b0kVar, int i2) {
        int i3;
        qim0 qim0Var;
        boolean z3;
        int i4;
        int i5;
        int i6;
        char c2;
        boolean z4;
        String str = zff1Var.b;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1381632847);
        int i7 = i2 | (x340Var.g(wff1Var) ? 4 : 2) | (x340Var.i(zff1Var) ? 32 : 16) | (x340Var.h(z) ? SemanticState.Hidden : SemanticState.Focused) | (x340Var.e(i) ? SemanticState.Modal : SemanticState.ReadOnly) | (x340Var.i(iu30Var) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline) | (x340Var.i(iu30Var2) ? 131072 : 65536) | (x340Var.h(z2) ? 1048576 : 524288);
        if (x340Var.Y(i7 & 1, (599187 & i7) != 599186)) {
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var2);
            hzj.A.getClass();
            gbx gbxVar = null;
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            if (wff1Var instanceof xff1) {
                x340Var.i0(380392285);
                int i8 = zff1Var.X;
                List list = zff1Var.Y;
                if (i8 == 2) {
                    x340Var.i0(380422572);
                    fc11.a(mqo1.s(new phx[]{new phx(14, 0L, "", (String) null, (String) null)}), anm1.N(String.format("top-track-face-pile-%s", Arrays.copyOf(new Object[]{str}, 1)), qim0Var2), (hcx) null, ttx.c, false, 2, (gbx) null, (String) null, (idn0) null, x340Var, 196616 | (ttx.d << 9), 468);
                    x340Var = x340Var;
                    x340Var.r(false);
                    z3 = false;
                    i3 = i7;
                    qim0Var = qim0Var2;
                } else if (list.isEmpty()) {
                    z3 = false;
                    i3 = i7;
                    qim0Var = qim0Var2;
                    x340Var.i0(381702903);
                    x340Var.r(false);
                } else {
                    x340Var.i0(380776499);
                    if (list.size() != 1 || (!((vff1) o7h.q0(list)).e && z2)) {
                        i4 = 381032745;
                        i5 = 2131963613;
                    } else {
                        i4 = 380920556;
                        i5 = 2131963620;
                    }
                    String strK = x0d.k(x340Var, i4, i5, x340Var, false);
                    List<vff1> list2 = list;
                    ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                    for (vff1 vff1Var : list2) {
                        arrayList.add(new phx(10, 0L, vff1Var.a, (String) null, vff1Var.b));
                    }
                    c380 c380VarA = mqo1.A(arrayList);
                    qim0 qim0VarN = anm1.N(String.format("top-track-face-pile-%s", Arrays.copyOf(new Object[]{str}, 1)), qim0Var2);
                    iu30 iu30Var3 = (iu30Var2 == null || z) ? null : iu30Var2;
                    if (iu30Var3 == null) {
                        x340Var.i0(381563929);
                        z4 = false;
                        x340Var.r(false);
                        i6 = i7;
                        c2 = 2048;
                    } else {
                        x340Var.i0(381563930);
                        i6 = i7;
                        c2 = 2048;
                        boolean zG = ((i6 & 7168) == 2048) | x340Var.g(iu30Var3);
                        Object objT = x340Var.T();
                        if (zG || objT == m4cVar) {
                            objT = new f8f1(iu30Var3, i, (byte) 2);
                            x340Var.s0(objT);
                        }
                        Function0 function0 = (Function0) objT;
                        if (ihc1.y0(strK)) {
                            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                            return;
                        }
                        gbx gbxVar2 = new gbx(new y50(strK), function0);
                        z4 = false;
                        x340Var.r(false);
                        gbxVar = gbxVar2;
                    }
                    i3 = i6;
                    z3 = z4;
                    qim0Var = qim0Var2;
                    fc11.a(c380VarA, qim0VarN, (hcx) null, (hux) null, false, 2, gbxVar, (String) null, (idn0) null, x340Var, 196616, 412);
                    x340Var = x340Var;
                    x340Var.r(z3);
                }
                x340Var.r(z3);
            } else {
                i3 = i7;
                qim0Var = qim0Var2;
                z3 = false;
                x340Var.i0(381708855);
                x340Var.r(false);
            }
            String strO0 = cwl1.o0(x340Var, 2131963625);
            boolean z5 = ((57344 & i3) == 16384 ? true : z3) | ((i3 & 896) == 256 ? true : z3) | ((i3 & 7168) == 2048 ? true : z3) | (((i3 & ContentType.LONG_FORM_ON_DEMAND) == 32 || x340Var.i(zff1Var)) ? true : z3);
            Object objT2 = x340Var.T();
            if (z5 || objT2 == m4cVar) {
                objT2 = new zv1(z, iu30Var, i, zff1Var);
                x340Var.s0(objT2);
            }
            Function0 function1 = (Function0) objT2;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            x340 x340Var2 = x340Var;
            gbx gbxVar3 = new gbx(new y50(strO0), function1);
            ldx ldxVar = ldx.c;
            yla.r(x340Var2);
            yla.r(x340Var2);
            yla.r(x340Var2);
            wro1.h(gbxVar3, ldxVar, x9p1.j(anm1.N(String.format("top-chart-row-context-menu-%s", Arrays.copyOf(new Object[]{str}, 1)), qim0Var), z), (max) null, (gdx) null, uyn1.j(12.0f, 12.0f, 0.0f, 12.0f, 4), false, (idn0) null, (ga80) null, rnj.a, x340Var2, 0, 6, 952);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wag(wff1Var, zff1Var, z, i, iu30Var, iu30Var2, z2, i2, (byte) 10);
        }
    }

    public static String q(int i) {
        if (i < 1000 || i >= 5000) {
            return f4i1.c(i, "Code must be in range [1000,5000): ");
        }
        if ((1004 > i || i >= 1007) && (1015 > i || i >= 3000)) {
            return null;
        }
        return gvg.e(i, "Code ", " is reserved and may not be used.");
    }

    public static final int r(long j, long j2) {
        boolean zY = y(j);
        if (zY != y(j2)) {
            return zY ? -1 : 1;
        }
        int iSignum = (int) Math.signum(s(j) - s(j2));
        if (Math.min(s(j), s(j2)) >= 0.0f && x(j) != x(j2)) {
            return x(j) ? -1 : 1;
        }
        return iSignum;
    }

    public static final float s(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final it31 t(afh0 afh0Var) {
        Object objG = afh0Var.g();
        if (objG instanceof it31) {
            return (it31) objG;
        }
        return null;
    }

    public static final it31 u(q5t0 q5t0Var) {
        Object objG = q5t0Var.g();
        if (objG instanceof it31) {
            return (it31) objG;
        }
        return null;
    }

    public static final float v(it31 it31Var) {
        if (it31Var != null) {
            return it31Var.a;
        }
        return 0.0f;
    }

    public static GridItem w(nwc nwcVar, nwc nwcVar2, hvc hvcVar, Float f, f2q0 f2q0Var) {
        ag50 ag50Var = new ag50();
        CharSequence charSequenceB = nwcVar != null ? hon1.B(nwcVar) : null;
        if (charSequenceB == null || charSequenceB.length() == 0) {
            charSequenceB = null;
        }
        if (charSequenceB == null) {
            charSequenceB = " ";
        }
        CarText carTextCreate = CarText.create(charSequenceB);
        trd.f.b(carTextCreate);
        ag50Var.a = carTextCreate;
        CarProgressBar carProgressBarE = E(f);
        if (carProgressBarE != null) {
            ag50Var.e = carProgressBarE;
        } else if (nwcVar2 != null) {
            CharSequence charSequenceB2 = hon1.B(nwcVar2);
            Objects.requireNonNull(charSequenceB2);
            CarText carTextCreate2 = CarText.create(charSequenceB2);
            Objects.requireNonNull(carTextCreate2);
            ag50Var.b = carTextCreate2;
            trd.h.b(carTextCreate2);
        }
        CarIcon carIconR = lnn1.r(hvcVar);
        yo31.e.j(carIconR);
        ag50Var.c = carIconR;
        ag50Var.d = OnClickDelegateImpl.create(f2q0Var);
        if (ag50Var.c == null) {
            eg.m("When a grid item is loading, the image must not be set and vice versa");
            return null;
        }
        if (ag50Var.b == null || ag50Var.e == null) {
            return new GridItem(ag50Var);
        }
        eg.m("Both text and progress bar cannot be set on GridItem");
        return null;
    }

    public static final boolean x(long j) {
        return (j & 2) != 0;
    }

    public static final boolean y(long j) {
        return (j & 1) != 0;
    }

    public static final boolean z(o4w o4wVar, o4w o4wVar2) {
        List list = o4wVar.a;
        int size = list.size();
        List list2 = o4wVar2.a;
        if (Math.abs(size - list2.size()) != 1) {
            return false;
        }
        mmr0 mmr0Var = list.size() < list2.size() ? new mmr0(o4wVar, o4wVar2) : new mmr0(o4wVar2, o4wVar);
        o4w o4wVar3 = (o4w) mmr0Var.a;
        o4w o4wVar4 = (o4w) mmr0Var.b;
        List<xz3> list3 = o4wVar3.a;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            for (xz3 xz3Var : list3) {
                List<xz3> list4 = o4wVar4.a;
                if ((list4 instanceof Collection) && list4.isEmpty()) {
                    return false;
                }
                for (xz3 xz3Var2 : list4) {
                    c14 c14Var = xz3Var.b;
                    long j = xz3Var.a;
                    c14 c14Var2 = xz3Var2.b;
                    long j2 = xz3Var2.a;
                    if (c14Var != c14Var2 || xz3Var.c != xz3Var2.c || Math.abs(Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32))) > 1.0E-4f || Math.abs(Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L))) > 1.0E-4f) {
                    }
                }
                return false;
            }
        }
        return true;
    }
}
