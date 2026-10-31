package p;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.zxing.WriterException;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.concertcampaignview.v1.CtaType;
import com.spotify.mainlayout.ui.view.MainLayout;
import com.spotify.mainlayout.ui.view.containers.MainLayoutContentContainerView;
import io.reactivex.rxjava3.functions.Function;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class c9c implements jrn0, au11, n8n, Function, z1g0, c290, vjm1, mka1, rz3 {
    public final /* synthetic */ byte a;

    public static final u7h C(c9c c9cVar, yzp0 yzp0Var, mf30 mf30Var, int i) {
        mf30 mf30VarZ = z(10.0d, 5.0d, new ym(i, yzp0Var, c9cVar), new qwc1(c9cVar, mf30Var, (byte) 26));
        if (mf30VarZ != null) {
            return new u7h(D(mf30VarZ));
        }
        return null;
    }

    public static long D(mf30 mf30Var) {
        return z4p1.f(jch0.S(yoi1.n(mf30Var.a, 0.0d, 1.0d) * 255.0d), jch0.S(yoi1.n(mf30Var.b, 0.0d, 1.0d) * 255.0d), jch0.S(yoi1.n(mf30Var.c, 0.0d, 1.0d) * 255.0d), 255);
    }

    public static vic0 E(mf30 mf30Var) {
        return new vic0(G(mf30Var.a), G(mf30Var.b), G(mf30Var.c));
    }

    public static vic0 F(yzp0 yzp0Var) {
        double d = yzp0Var.b;
        double d2 = yzp0Var.c;
        double dCos = Math.cos(d2) * d;
        double dSin = Math.sin(d2) * d;
        double d3 = yzp0Var.a;
        double d4 = (0.2158037573d * dSin) + (0.3963377774d * dCos) + d3;
        double d5 = d4 * d4 * d4;
        double d6 = (d3 - (0.1055613458d * dCos)) - (0.0638541728d * dSin);
        double d7 = d6 * d6 * d6;
        double d8 = (d3 - (dCos * 0.0894841775d)) - (dSin * 1.291485548d);
        double d9 = d8 * d8 * d8;
        return new vic0((0.2309699292d * d9) + ((4.0767416621d * d5) - (3.3077115913d * d7)), ((2.6097574011d * d7) + ((-1.2684380046d) * d5)) - (0.3413193965d * d9), (d9 * 1.707614701d) + ((d5 * (-0.0041960863d)) - (d7 * 0.7034186147d)));
    }

    public static final double G(double d) {
        return d <= 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
    }

    public static final boolean f(String str) {
        List listX;
        List listX2;
        int i;
        int i2;
        Pattern patternCompile = Pattern.compile("\\.");
        ihc1.N0(0);
        Matcher matcher = patternCompile.matcher("4.19.0.901");
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iEnd = 0;
            do {
                arrayList.add("4.19.0.901".subSequence(iEnd, matcher.start()).toString());
                iEnd = matcher.end();
            } while (matcher.find());
            arrayList.add("4.19.0.901".subSequence(iEnd, 10).toString());
            listX = arrayList;
        } else {
            listX = k4p1.x("4.19.0.901");
        }
        String[] strArr = (String[]) listX.toArray(new String[0]);
        Pattern patternCompile2 = Pattern.compile("\\.");
        ihc1.N0(0);
        Matcher matcher2 = patternCompile2.matcher(str);
        if (matcher2.find()) {
            ArrayList arrayList2 = new ArrayList(10);
            int iEnd2 = 0;
            do {
                arrayList2.add(str.subSequence(iEnd2, matcher2.start()).toString());
                iEnd2 = matcher2.end();
            } while (matcher2.find());
            arrayList2.add(str.subSequence(iEnd2, str.length()).toString());
            listX2 = arrayList2;
        } else {
            listX2 = k4p1.x(str.toString());
        }
        String[] strArr2 = (String[]) listX2.toArray(new String[0]);
        int length = strArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (strArr2.length - 1 < i3 || (i2 = Integer.parseInt(strArr2[i3])) < (i = Integer.parseInt(strArr[i3]))) {
                return false;
            }
            if (i2 > i) {
                break;
            }
        }
        return true;
    }

    public static final bma1 g(int i) {
        bma1 bma1Var = zoo0.f;
        return bma1.b.n("chat_page_nudge_dismissed_v" + i);
    }

    public static final bma1 i(int i, String str) {
        bma1 bma1Var = zoo0.f;
        return bma1.b.n(str + "_v" + i);
    }

    public static double m(mf30 mf30Var, mf30 mf30Var2) {
        double dPow;
        double dPow2;
        double dN = n(mf30Var);
        double dN2 = n(mf30Var2);
        if (dN > dN2) {
            dPow = Math.pow(dN, 0.56d);
            dPow2 = Math.pow(dN2, 0.57d);
        } else {
            dPow = Math.pow(dN, 0.65d);
            dPow2 = Math.pow(dN2, 0.62d);
        }
        double d = (dPow - dPow2) * 1.14d;
        if (Math.abs(d) < 0.1d) {
            return 0.0d;
        }
        return (Math.abs(d) - 0.027d) * 100.0d;
    }

    public static double n(mf30 mf30Var) {
        double dPow = (Math.pow(mf30Var.c, 2.4d) * 0.072175d) + (Math.pow(mf30Var.b, 2.4d) * 0.7151522d) + (Math.pow(mf30Var.a, 2.4d) * 0.2126729d);
        return dPow < 0.022d ? Math.pow(0.022d - dPow, 1.414d) + dPow : dPow;
    }

    public static qwa o(byte[][] bArr, int i) {
        int i2 = i * 2;
        int length = bArr[0].length + i2;
        int length2 = bArr.length + i2;
        qwa qwaVar = new qwa(length, length2);
        int[] iArr = qwaVar.d;
        int length3 = iArr.length;
        for (int i3 = 0; i3 < length3; i3++) {
            iArr[i3] = 0;
        }
        int i4 = (length2 - i) - 1;
        int i5 = 0;
        while (i5 < bArr.length) {
            byte[] bArr2 = bArr[i5];
            for (int i6 = 0; i6 < bArr[0].length; i6++) {
                if (bArr2[i6] == 1) {
                    qwaVar.b(i6 + i, i4);
                }
            }
            i5++;
            i4--;
        }
        return qwaVar;
    }

    public static final boolean q(c9c c9cVar, long j, long j2) {
        vic0 vic0VarE = E(u(j2));
        double d = (vic0VarE.c * 0.0722d) + (vic0VarE.b * 0.7152d) + (vic0VarE.a * 0.2126d) + 0.05d;
        vic0 vic0VarE2 = E(u(j));
        double d2 = (vic0VarE2.c * 0.0722d) + (vic0VarE2.b * 0.7152d) + (vic0VarE2.a * 0.2126d) + 0.05d;
        return ((d > d2 ? 1 : (d == d2 ? 0 : -1)) > 0 ? d / d2 : d2 / d) >= 4.5d && m(u(j2), u(j)) >= 60.0d;
    }

    public static double r(yzp0 yzp0Var, yzp0 yzp0Var2) {
        double d = yzp0Var.a - yzp0Var2.a;
        double d2 = yzp0Var.b;
        double d3 = yzp0Var.c;
        double dCos = Math.cos(d3) * d2;
        double d4 = yzp0Var2.b;
        double d5 = yzp0Var2.c;
        double dCos2 = dCos - (Math.cos(d5) * d4);
        double dSin = (Math.sin(d3) * d2) - (Math.sin(d5) * d4);
        return Math.sqrt((dSin * dSin) + (dCos2 * dCos2) + (d * d));
    }

    public static mf30 s(vic0 vic0Var) {
        return new mf30(t(vic0Var.a), t(vic0Var.b), t(vic0Var.c));
    }

    public static final double t(double d) {
        double dN = yoi1.n(d, 0.0d, 1.0d);
        return dN <= 0.0031308d ? dN * 12.92d : (Math.pow(dN, 0.4166666666666667d) * 1.055d) - 0.055d;
    }

    public static mf30 u(long j) {
        return new mf30(u7h.g(j), u7h.f(j), u7h.d(j));
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0098  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b2 A[SYNTHETIC] */
    public static vic0 w(yzp0 yzp0Var, double d) {
        double dR;
        double d2 = 1.0d;
        if (d >= 1.0d) {
            return new vic0(1.0d, 1.0d, 1.0d);
        }
        double d3 = 0.0d;
        if (d <= 0.0d) {
            return new vic0(0.0d, 0.0d, 0.0d);
        }
        yzp0 yzp0Var2 = new yzp0(d, yzp0Var.b, yzp0Var.c);
        vic0 vic0VarA = F(yzp0Var2).a();
        if (r(yzp0Var2, x(vic0VarA)) < 0.02d) {
            return vic0VarA;
        }
        double d4 = yzp0Var.b;
        boolean z = true;
        double d5 = 0.0d;
        while (d4 - d5 > 1.0E-4d) {
            double d6 = (d5 + d4) / 2.0d;
            double d7 = d2;
            yzp0 yzp0Var3 = new yzp0(d, d6, yzp0Var.c);
            vic0 vic0VarF = F(yzp0Var3);
            d3 = d3;
            if (z) {
                double d8 = vic0VarF.a;
                if (d3 > d8 || d8 > d7) {
                    vic0VarA = vic0VarF.a();
                    dR = r(yzp0Var3, x(vic0VarA));
                    if (dR >= 0.02d) {
                        d4 = d6;
                    } else {
                        if (0.02d - dR < 1.0E-4d) {
                            return vic0VarA;
                        }
                        z = false;
                        d5 = d6;
                    }
                } else {
                    double d9 = vic0VarF.b;
                    if (d3 > d9 || d9 > d7) {
                        vic0VarA = vic0VarF.a();
                        dR = r(yzp0Var3, x(vic0VarA));
                        if (dR >= 0.02d) {
                            d4 = d6;
                        } else {
                            if (0.02d - dR < 1.0E-4d) {
                                return vic0VarA;
                            }
                            z = false;
                            d5 = d6;
                        }
                    } else {
                        double d10 = vic0VarF.c;
                        if (d3 > d10 || d10 > d7) {
                            vic0VarA = vic0VarF.a();
                            dR = r(yzp0Var3, x(vic0VarA));
                            if (dR >= 0.02d) {
                                d4 = d6;
                            } else {
                                if (0.02d - dR < 1.0E-4d) {
                                    return vic0VarA;
                                }
                                z = false;
                                d5 = d6;
                            }
                        } else {
                            d5 = d6;
                        }
                    }
                }
            } else {
                vic0VarA = vic0VarF.a();
                dR = r(yzp0Var3, x(vic0VarA));
                if (dR >= 0.02d) {
                    d4 = d6;
                } else {
                    if (0.02d - dR < 1.0E-4d) {
                        return vic0VarA;
                    }
                    z = false;
                    d5 = d6;
                }
            }
            d2 = d7;
        }
        return vic0VarA;
    }

    public static yzp0 x(vic0 vic0Var) {
        double d = vic0Var.a;
        double d2 = vic0Var.b;
        double d3 = vic0Var.c;
        double dCbrt = Math.cbrt((0.0514459929d * d3) + (0.5363325363d * d2) + (0.4122214708d * d));
        double dCbrt2 = Math.cbrt((0.1073969566d * d3) + (0.6806995451d * d2) + (0.2119034982d * d));
        double d4 = d3 * 0.6299787005d;
        double dCbrt3 = Math.cbrt(d4 + (d2 * 0.2817188376d) + (d * 0.0883024619d));
        double d5 = (0.4505937099d * dCbrt3) + ((1.9779984951d * dCbrt) - (2.428592205d * dCbrt2));
        double d6 = ((0.7827717662d * dCbrt2) + (0.0259040371d * dCbrt)) - (0.808675766d * dCbrt3);
        return new yzp0(((dCbrt2 * 0.793617785d) + (dCbrt * 0.2104542553d)) - (dCbrt3 * 0.0040720468d), Math.hypot(d5, d6), Math.atan2(d6, d5));
    }

    public static byte[][] y(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, bArr[0].length, bArr.length);
        for (int i = 0; i < bArr.length; i++) {
            int length = (bArr.length - i) - 1;
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                bArr2[i2][length] = bArr[i][i2];
            }
        }
        return bArr2;
    }

    public static mf30 z(double d, double d2, iu30 iu30Var, iu30 iu30Var2) {
        double d3 = 1.0d;
        Object objInvoke = iu30Var.invoke(Double.valueOf(1.0d));
        double d4 = Double.POSITIVE_INFINITY;
        double d5 = 0.0d;
        boolean z = false;
        for (int i = 0; i < 50; i++) {
            double d6 = (d5 + d3) / 2.0d;
            mf30 mf30Var = (mf30) iu30Var.invoke(Double.valueOf(d6));
            double dDoubleValue = ((Number) iu30Var2.invoke(mf30Var)).doubleValue() - d;
            if (dDoubleValue >= 0.0d && dDoubleValue < d4) {
                if (dDoubleValue <= 0.01d) {
                    return mf30Var;
                }
                z = true;
                objInvoke = mf30Var;
                d4 = dDoubleValue;
            }
            if (dDoubleValue < 0.0d) {
                d5 = d6;
            } else {
                d3 = d6;
            }
        }
        if (!z || d4 >= d2) {
            objInvoke = null;
        }
        return (mf30) objInvoke;
    }

    public mf30 A(mf30 mf30Var) {
        mf30 mf30VarZ;
        Double dValueOf = Double.valueOf(1.0d);
        yzp0 yzp0VarX = x(E(mf30Var));
        if (m(mf30Var, uxe1.f) >= 60.0d) {
            mf30VarZ = mf30Var;
        } else {
            txe1 txe1Var = new txe1(this, yzp0VarX, (byte) 1);
            mf30VarZ = z(60.0d, Double.POSITIVE_INFINITY, txe1Var, new qd81(this, (byte) 28));
            if (mf30VarZ == null) {
                mf30VarZ = (mf30) txe1Var.invoke(dValueOf);
            }
        }
        yzp0 yzp0VarX2 = x(E(mf30VarZ));
        double d = (((yzp0VarX2.c * 180.0d) / 3.141592653589793d) + 360.0d) % 360.0d;
        isg isgVar = uxe1.g;
        Double dValueOf2 = Double.valueOf(d);
        isgVar.getClass();
        double dDoubleValue = dValueOf2.doubleValue();
        double dMin = Math.min(yzp0VarX2.b, dDoubleValue >= 120.0d && dDoubleValue <= 170.0d ? 0.075d : 0.1d);
        double d2 = yzp0VarX2.a;
        txe1 txe1Var2 = new txe1(this, x(E(s(w(new yzp0(d2, dMin, yzp0VarX2.c), d2)))), (byte) 0);
        mf30 mf30VarZ2 = z(30.0d, Double.POSITIVE_INFINITY, txe1Var2, new qd81(this, (byte) 28));
        return mf30VarZ2 == null ? (mf30) txe1Var2.invoke(dValueOf) : mf30VarZ2;
    }

    public long B(int i, long j, long j2) {
        int i2;
        mf30 mf30VarU = u(j);
        yzp0 yzp0VarX = x(E(u(j)));
        int iC = l1d.C(i);
        if (iC != 0) {
            i2 = 1;
            if (iC != 1) {
                eg.o();
                return 0L;
            }
        } else {
            i2 = 2;
        }
        u7h u7hVarC = C(this, yzp0VarX, mf30VarU, i);
        if (u7hVarC != null) {
            return u7hVarC.a;
        }
        u7h u7hVarC2 = C(this, yzp0VarX, mf30VarU, i2);
        return u7hVarC2 != null ? u7hVarC2.a : j2;
    }

    public void a(MainLayout mainLayout, b2g0 b2g0Var) {
        i2g0 i2g0Var = (i2g0) b2g0Var;
        boolean z = i2g0Var.b;
        View navigationContainerTop = mainLayout.getNavigationContainerTop();
        boolean z2 = i2g0Var.a;
        navigationContainerTop.setVisibility(z2 ? 0 : 8);
        Iterator it = mainLayout.getNowPlayingViews().iterator();
        while (it.hasNext()) {
            ((ViewGroup) it.next()).setVisibility(z ? 0 : 8);
        }
        mainLayout.getBannerContainer().setVisibility(i2g0Var.c ? 0 : 8);
        boolean z3 = z2 || z;
        Iterator it2 = mainLayout.getBottomGradientViews().iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).setVisibility(z3 ? 0 : 8);
        }
        mainLayout.getLimitedExperienceIndicatorContainer().setVisibility(z2 ? 0 : 8);
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 3:
                zsq0 zsq0Var = (atq0) obj;
                zsq0 zsq0Var2 = zsq0Var instanceof zsq0 ? zsq0Var : null;
                c481 c481Var = zsq0Var2 != null ? (c481) zsq0Var2.a : null;
                cma cmaVar = cma.a;
                if (c481Var == null) {
                    return cmaVar;
                }
                g281 g281Var = c481Var.a;
                List list = c481Var.b;
                if (msn.a(c481Var) && list.size() == 1) {
                    return cmaVar;
                }
                n4v0 n4v0VarA = g281Var.y.a(n4v0.class);
                String str = n4v0VarA != null ? n4v0VarA.b : null;
                if (str != null && str.length() != 0) {
                    n4v0 n4v0VarA2 = g281Var.y.a(n4v0.class);
                    String str2 = n4v0VarA2 != null ? n4v0VarA2.b : null;
                    str2.getClass();
                    return new bma(str2);
                }
                d281 d281Var = g281Var.u;
                if (d281Var == d281.b || d281Var == d281.d || d281Var == d281.a) {
                    return new bma(((i1z) o7h.q0(list)).a);
                }
                d281 d281Var2 = d281.c;
                if (d281Var != d281Var2 || msn.a(c481Var)) {
                    return (g281Var.u == d281Var2 && msn.a(c481Var)) ? new bma(((i1z) o7h.A0(list)).a) : cmaVar;
                }
                return new bma(((i1z) o7h.q0(list)).a);
            case 7:
                return new ez41(false);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return new gru(1, !u890.j((String) ((Map) obj).get("nft-disabled"), "1"));
            default:
                return qw41.b.get(obj);
        }
    }

    public void b(hhm0 hhm0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-439813632);
        if ((i & 48) == 0) {
            i2 = i | (x340Var.i(iu30Var) ? 32 : 16);
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 17) != 16)) {
            boolean z = false;
            ldx ldxVar = ldx.c;
            qim0 qim0VarN = anm1.N("CHANGE_COVER_IMAGE", nim0.a);
            String strO0 = cwl1.o0(x340Var, 2131955198);
            if ((i2 & 112) == 32) {
                z = true;
            }
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new q7u(iu30Var, (byte) 11);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            foo1.c(new gbx(new y50(strO0), function0), ldxVar, qim0VarN, null, null, null, null, null, null, null, xki.a, x340Var, 432, 48, 2040);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x8t(this, hhm0Var, iu30Var, i, (byte) 13);
        }
    }

    public Object convert(int i) {
        switch (this.a) {
            case 16:
                hmc0 hmc0VarA = hmc0.a(i);
                return hmc0VarA == null ? hmc0.b : hmc0VarA;
            default:
                c4u0 c4u0VarA = c4u0.a(i);
                return c4u0VarA == null ? c4u0.Z0 : c4u0VarA;
        }
    }

    public void d(Bundle bundle) {
        Log.isLoggable("FirebaseCrashlytics", 3);
    }

    public b2g0 e(c2g0 c2g0Var) {
        ggr0 ggr0Var = c2g0Var.a;
        if (ggr0Var instanceof dgr0) {
            return new i2g0(true, c2g0Var.b, true);
        }
        if (ggr0Var instanceof egr0) {
            return new i2g0(false, false, false);
        }
        if (ggr0Var instanceof fgr0) {
            return new i2g0(true, false, true);
        }
        eg.o();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002d  */
    public List h(MainLayout mainLayout, b2g0 b2g0Var, a2g0 a2g0Var) {
        boolean z;
        i2g0 i2g0Var = (i2g0) b2g0Var;
        boolean z2 = i2g0Var.a != (mainLayout.getNavigationContainerTop().getVisibility() == 0);
        MainLayoutContentContainerView nowPlayingViewContainer = mainLayout.getNowPlayingViewContainer();
        if (nowPlayingViewContainer != null) {
            if (i2g0Var.b == (nowPlayingViewContainer.getVisibility() == 0)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (!z && !z2) {
            jhg1 pg10Var = new pg10();
            Iterator it = mainLayout.getNowPlayingViews().iterator();
            while (it.hasNext()) {
                pg10Var.b((View) it.next());
            }
            Iterator it2 = mainLayout.getBottomGradientViews().iterator();
            while (it2.hasNext()) {
                pg10Var.b((View) it2.next());
            }
            jhg1 rceVar = new rce();
            rceVar.b(mainLayout.getThinkingAgentContainer());
            return p7h.M(new jhg1[]{pg10Var, rceVar});
        }
        jhg1 ogc0Var = new ogc0(80);
        ogc0Var.b(mainLayout.getNavigationContainerTop());
        ogc0Var.b(mainLayout.getLimitedExperienceIndicatorContainer());
        Iterator it3 = mainLayout.getBottomGradientViews().iterator();
        while (it3.hasNext()) {
            ogc0Var.b((View) it3.next());
        }
        if (!z) {
            Iterator it4 = mainLayout.getNowPlayingViews().iterator();
            while (it4.hasNext()) {
                ogc0Var.b((View) it4.next());
            }
        }
        jhg1 ogc0Var2 = new ogc0(48);
        ogc0Var2.b(mainLayout.getBannerContainer());
        jhg1 rceVar2 = new rce();
        if (z && z2) {
            Iterator it5 = mainLayout.getNowPlayingViews().iterator();
            while (it5.hasNext()) {
                rceVar2.b((View) it5.next());
            }
        }
        rceVar2.b(mainLayout.getThinkingAgentContainer());
        return p7h.M(new jhg1[]{ogc0Var, ogc0Var2, rceVar2});
    }

    /* JADX WARN: Code duplicated, block: B:176:0x031f  */
    /* JADX WARN: Code duplicated, block: B:216:0x0429 A[LOOP:12: B:215:0x0427->B:216:0x0429, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:219:0x0444  */
    /* JADX WARN: Code duplicated, block: B:220:0x044d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
    public qwa j(String str, int i, int i2, int i3, Map map) throws WriterException {
        int i4;
        hne hneVar;
        boolean z;
        String str2;
        char c;
        char c2;
        boolean z2;
        int iF;
        int i5;
        int[][] iArr;
        int i6;
        int[][] iArr2;
        int i7;
        boolean z3;
        String str3;
        int i8;
        int i9;
        int i10;
        if (i != 11) {
            hhg1.n("Can only encode PDF_417, but got ".concat(l1d.D(i)));
            return null;
        }
        EnumMap enumMap = (EnumMap) map;
        qax qaxVar = qax.g;
        boolean zBooleanValue = enumMap.containsKey(qaxVar) ? Boolean.valueOf(enumMap.get(qaxVar).toString()).booleanValue() : false;
        qax qaxVar2 = qax.h;
        if (enumMap.containsKey(qaxVar2)) {
            String string = enumMap.get(qaxVar2).toString();
            if (string == null) {
                bhn0.i("Name is null");
            } else if (string.equals("AUTO")) {
                i4 = 1;
            } else if (string.equals("TEXT")) {
                i4 = 2;
            } else if (string.equals("BYTE")) {
                i4 = 3;
            } else if (string.equals("NUMERIC")) {
                i4 = 4;
            } else {
                hhg1.n("No enum constant com.google.zxing.pdf417.encoder.Compaction.".concat(string));
            }
            i4 = 0;
        } else {
            i4 = 1;
        }
        qax qaxVar3 = qax.i;
        if (enumMap.containsKey(qaxVar3)) {
            enumMap.get(qaxVar3).getClass();
            bhn0.d();
            return null;
        }
        qax qaxVar4 = qax.f;
        int i11 = enumMap.containsKey(qaxVar4) ? Integer.parseInt(enumMap.get(qaxVar4).toString()) : 30;
        qax qaxVar5 = qax.a;
        int i12 = enumMap.containsKey(qaxVar5) ? Integer.parseInt(enumMap.get(qaxVar5).toString()) : 2;
        qax qaxVar6 = qax.b;
        Charset charsetForName = enumMap.containsKey(qaxVar6) ? Charset.forName(enumMap.get(qaxVar6).toString()) : null;
        String str4 = "Error correction level must be between 0 and 8!";
        if (i12 < 0 || i12 > 8) {
            hhg1.n("Error correction level must be between 0 and 8!");
            return null;
        }
        int i13 = 1 << (i12 + 1);
        Charset charset = zxq0.e;
        StringBuilder sb = new StringBuilder(str.length());
        if (charsetForName == null) {
            charsetForName = charset;
        } else if (!charset.equals(charsetForName) && (hneVar = (hne) hne.d.get(charsetForName.name())) != null) {
            int i14 = hneVar.a[0];
            if (i14 >= 0 && i14 < 900) {
                sb.append((char) 927);
                sb.append((char) i14);
            } else if (i14 < 810900) {
                sb.append((char) 926);
                sb.append((char) ((i14 / 900) - 1));
                sb.append((char) (i14 % 900));
            } else {
                if (i14 >= 811800) {
                    throw new WriterException("ECI number not in valid range from 0..811799, but was ".concat(String.valueOf(i14)));
                }
                sb.append((char) 925);
                sb.append((char) (810900 - i14));
            }
        }
        int length = str.length();
        int iC = l1d.C(i4);
        if (iC == 1) {
            z = zBooleanValue;
            str2 = "Error correction level must be between 0 and 8!";
            zxq0.c(str, 0, length, sb, 0);
        } else if (iC == 2) {
            z = zBooleanValue;
            str2 = "Error correction level must be between 0 and 8!";
            byte[] bytes = str.getBytes(charsetForName);
            zxq0.a(bytes.length, 1, sb, bytes);
        } else if (iC != 3) {
            int i15 = 0;
            int i16 = 0;
            int iC2 = 0;
            while (i15 < length) {
                int length2 = str.length();
                char c3 = '0';
                if (i15 < length2) {
                    int i17 = i15;
                    char cCharAt = str.charAt(i15);
                    int i18 = 0;
                    while (cCharAt >= '0' && cCharAt <= '9' && i17 < length2) {
                        i18++;
                        i17++;
                        if (i17 < length2) {
                            cCharAt = str.charAt(i17);
                        }
                    }
                    i7 = i18;
                } else {
                    i7 = 0;
                }
                if (i7 >= 13) {
                    sb.append((char) 902);
                    zxq0.b(sb, str, i15, i7);
                    i15 += i7;
                    i16 = 2;
                    iC2 = 0;
                } else {
                    int length3 = str.length();
                    int i19 = i15;
                    while (true) {
                        if (i19 < length3) {
                            str3 = str4;
                            char cCharAt2 = str.charAt(i19);
                            z3 = zBooleanValue;
                            int i20 = 0;
                            while (i20 < 13 && cCharAt2 >= c3 && cCharAt2 <= '9' && i19 < length3) {
                                i20++;
                                i19++;
                                if (i19 < length3) {
                                    cCharAt2 = str.charAt(i19);
                                }
                                c3 = '0';
                            }
                            if (i20 >= 13) {
                                i8 = (i19 - i15) - i20;
                                break;
                            }
                            if (i20 <= 0) {
                                char cCharAt3 = str.charAt(i19);
                                if (cCharAt3 == '\t' || cCharAt3 == '\n' || cCharAt3 == '\r' || (cCharAt3 >= ' ' && cCharAt3 <= '~')) {
                                    i19++;
                                }
                            }
                            zBooleanValue = z3;
                            str4 = str3;
                            c3 = '0';
                        } else {
                            z3 = zBooleanValue;
                            str3 = str4;
                        }
                        i8 = i19 - i15;
                        break;
                    }
                    if (i8 >= 5 || i7 == length) {
                        if (i16 != 0) {
                            sb.append((char) 900);
                            i9 = 0;
                            i16 = 0;
                        } else {
                            i9 = iC2;
                        }
                        iC2 = zxq0.c(str, i15, i8, sb, i9);
                        i15 += i8;
                    } else {
                        CharsetEncoder charsetEncoderNewEncoder = charsetForName.newEncoder();
                        int length4 = str.length();
                        int i21 = i15;
                        while (i21 < length4) {
                            char cCharAt4 = str.charAt(i21);
                            int i22 = 0;
                            while (true) {
                                if (i22 >= 13 || cCharAt4 < '0') {
                                    break;
                                }
                                if (cCharAt4 > '9' || (i10 = i21 + (i22 = i22 + 1)) >= length4) {
                                    break;
                                }
                                cCharAt4 = str.charAt(i10);
                            }
                            if (i22 >= 13) {
                                break;
                            }
                            char cCharAt5 = str.charAt(i21);
                            if (!charsetEncoderNewEncoder.canEncode(cCharAt5)) {
                                throw new WriterException("Non-encodable character detected: " + cCharAt5 + " (Unicode: " + ((int) cCharAt5) + ')');
                            }
                            i21++;
                        }
                        int i23 = i21 - i15;
                        if (i23 == 0) {
                            i23 = 1;
                        }
                        int i24 = i15 + i23;
                        byte[] bytes2 = str.substring(i15, i24).getBytes(charsetForName);
                        if (bytes2.length == 1 && i16 == 0) {
                            zxq0.a(1, 0, sb, bytes2);
                        } else {
                            zxq0.a(bytes2.length, i16, sb, bytes2);
                            i16 = 1;
                            iC2 = 0;
                        }
                        i15 = i24;
                    }
                    zBooleanValue = z3;
                    str4 = str3;
                }
            }
            z = zBooleanValue;
            str2 = str4;
        } else {
            z = zBooleanValue;
            str2 = "Error correction level must be between 0 and 8!";
            sb.append((char) 902);
            zxq0.b(sb, str, 0, length);
        }
        String string2 = sb.toString();
        int length5 = string2.length();
        float f = 0.0f;
        int[] iArr3 = null;
        for (int i25 = 2; i25 <= 30; i25++) {
            int i26 = length5 + 1 + i13;
            int i27 = i26 / i25;
            int i28 = i27 + 1;
            if (i25 * i28 < i26 + i25) {
                i27 = i28;
            }
            if (i27 < 2) {
                break;
            }
            if (i27 <= 30) {
                float f2 = (((i25 * 17) + 69) * 0.357f) / (i27 * 2.0f);
                if (iArr3 == null || Math.abs(f2 - 3.0f) <= Math.abs(f - 3.0f)) {
                    iArr3 = new int[]{i25, i27};
                    f = f2;
                }
            }
        }
        if (iArr3 == null) {
            int i29 = length5 + 1 + i13;
            int i30 = i29 / 2;
            int i31 = i30 + 1;
            if (2 * i31 < i29 + 2) {
                i30 = i31;
            }
            if (i30 < 2) {
                c = 0;
                c2 = 1;
                iArr3 = new int[]{2, 2};
            } else {
                c = 0;
                c2 = 1;
            }
        } else {
            c = 0;
            c2 = 1;
        }
        if (iArr3 == null) {
            throw new WriterException("Unable to fit message in columns");
        }
        int i32 = iArr3[c];
        int i33 = iArr3[c2];
        int i34 = (i32 * i33) - i13;
        int i35 = i34 > length5 + 1 ? (i34 - length5) - 1 : 0;
        if (length5 + i13 + 1 > 929) {
            throw new WriterException("Encoded message contains too many code words, message too big (" + str.length() + " bytes)");
        }
        int i36 = length5 + i35 + 1;
        StringBuilder sb2 = new StringBuilder(i36);
        sb2.append((char) i36);
        sb2.append(string2);
        for (int i37 = 0; i37 < i35; i37++) {
            sb2.append((char) 900);
        }
        String string3 = sb2.toString();
        if (i12 < 0 || i12 > 8) {
            hhg1.n(str2);
            return null;
        }
        char[] cArr = new char[i13];
        int length6 = string3.length();
        for (int i38 = 0; i38 < length6; i38++) {
            int i39 = i13 - 1;
            int iCharAt = (string3.charAt(i38) + cArr[i39]) % 929;
            while (true) {
                iArr2 = ryn1.a;
                if (i39 > 0) {
                    cArr[i39] = (char) ((cArr[i39 - 1] + (929 - ((iArr2[i12][i39] * iCharAt) % 929))) % 929);
                    i39--;
                }
            }
            cArr[0] = (char) ((929 - ((iCharAt * iArr2[i12][0]) % 929)) % 929);
        }
        StringBuilder sb3 = new StringBuilder(i13);
        for (int i40 = i13 - 1; i40 >= 0; i40--) {
            char c4 = cArr[i40];
            if (c4 != 0) {
                cArr[i40] = (char) (929 - c4);
            }
            sb3.append(cArr[i40]);
        }
        String string4 = sb3.toString();
        a9a a9aVar = new a9a(i33, i32);
        String strConcat = string3.concat(string4);
        int i41 = 0;
        for (int i42 = 0; i42 < i33; i42++) {
            int i43 = i42 % 3;
            a9aVar.b++;
            nyn1.a0(130728, 17, a9aVar.k());
            if (i43 == 0) {
                int i44 = (i42 / 3) * 30;
                iF = l1d.f(i33, 1, 3, i44);
                i5 = (i32 - 1) + i44;
            } else {
                if (i43 == 1) {
                    int i45 = (i42 / 3) * 30;
                    int i46 = i33 - 1;
                    iF = (i46 % 3) + (i12 * 3) + i45;
                    i5 = (i46 / 3) + i45;
                } else {
                    int i47 = (i42 / 3) * 30;
                    iF = (i32 - 1) + i47;
                    i5 = ((i33 - 1) % 3) + (i12 * 3) + i47;
                }
                iArr = nyn1.a;
                nyn1.a0(iArr[i43][iF], 17, a9aVar.k());
                for (i6 = 0; i6 < i32; i6++) {
                    nyn1.a0(iArr[i43][strConcat.charAt(i41)], 17, a9aVar.k());
                    i41++;
                }
                if (z) {
                    nyn1.a0(260649, 1, a9aVar.k());
                } else {
                    nyn1.a0(iArr[i43][i5], 17, a9aVar.k());
                    nyn1.a0(260649, 18, a9aVar.k());
                }
            }
            iArr = nyn1.a;
            nyn1.a0(iArr[i43][iF], 17, a9aVar.k());
            while (i6 < i32) {
                nyn1.a0(iArr[i43][strConcat.charAt(i41)], 17, a9aVar.k());
                i41++;
            }
            if (z) {
                nyn1.a0(260649, 1, a9aVar.k());
            } else {
                nyn1.a0(iArr[i43][i5], 17, a9aVar.k());
                nyn1.a0(260649, 18, a9aVar.k());
            }
        }
        byte[][] bArrO = a9aVar.o(1, 4);
        if (bArrO[0].length < bArrO.length) {
            bArrO = y(bArrO);
            z2 = true;
        } else {
            z2 = false;
        }
        int length7 = CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER / bArrO[0].length;
        int length8 = CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER / bArrO.length;
        if (length7 >= length8) {
            length7 = length8;
        }
        if (length7 <= 1) {
            return o(bArrO, i11);
        }
        byte[][] bArrO2 = a9aVar.o(length7, length7 << 2);
        if (z2) {
            bArrO2 = y(bArrO2);
        }
        return o(bArrO2, i11);
    }

    public lu11 k(fe00 fe00Var, unb1 unb1Var) {
        byte b = this.a;
        iu11 iu11Var = iu11.a;
        ce00 ce00Var = ce00.a;
        be00 be00Var = be00.a;
        switch (b) {
            case 1:
                if (fe00Var.equals(be00Var)) {
                    return eu11.a;
                }
                if (fe00Var.equals(ce00Var)) {
                    return iu11Var;
                }
                return null;
            default:
                if (fe00Var.equals(be00Var)) {
                    return gu11.a;
                }
                if (fe00Var.equals(ce00Var)) {
                    return iu11Var;
                }
                return null;
        }
    }

    public irn0 l(Intent intent, th61 th61Var) {
        return new hrn0(h7c.class, new j7c("spotify:made-for-you", th61Var.a, "spotify:page:0JQ5DAt0tbjZptfcdMSKl3", "spotify:genre:0JQ5DAt0tbjZptfcdMSKl3"), a6w0.a);
    }

    public long p(int i, long j, long j2) {
        double d;
        if (q(this, j2, j)) {
            return j;
        }
        yzp0 yzp0VarX = x(E(u(j)));
        sxe1 sxe1Var = new sxe1(this, j2);
        double d2 = yzp0VarX.a;
        if (i == 1) {
            d = 0.0d;
        } else {
            if (i != 2) {
                throw null;
            }
            d = 1.0d;
        }
        for (int i2 = 0; i2 < 20; i2++) {
            double d3 = (d2 + d) / 2.0d;
            if (((Boolean) sxe1Var.invoke(new u7h(D(s(w(yzp0VarX, d3)))))).booleanValue()) {
                d = d3;
            } else {
                d2 = d3;
            }
        }
        return D(s(w(yzp0VarX, d)));
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "CompositionErrorContext";
            case 25:
                return "NO_SOURCE";
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x009c  */
    /* JADX WARN: Code duplicated, block: B:18:0x00af  */
    /* JADX WARN: Code duplicated, block: B:20:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:23:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:28:0x00e9  */
    public rxe1 v(int i, int i2, int i3) {
        long jP;
        long jP2;
        long j;
        long jP3;
        int iC;
        long j2;
        int iC2;
        long jE = z4p1.e(i);
        long jH = z4p1.h(u7h.g(jE), u7h.f(jE), u7h.d(jE), 1.0f, 16);
        int iG = z4p1.G(D(A(u(jH))));
        long j3 = uxe1.a;
        long jP4 = p(1, jH, j3);
        int iC3 = l1d.C(i2);
        int i4 = 1;
        if (iC3 != 0) {
            if (iC3 == 1) {
                i4 = 1;
                jP2 = p(1, jP4, D(A(u(jH))));
            } else {
                if (iC3 != 2) {
                    eg.o();
                    return null;
                }
                jP = p(1, p(1, jP4, D(A(u(jH)))), uxe1.b);
            }
            j = uxe1.c;
            jP3 = p(2, jH, j);
            iC = l1d.C(i2);
            if (iC != 0) {
                if (iC != i4) {
                    jP3 = p(2, jP3, uxe1.d);
                } else {
                    if (iC == 2) {
                        eg.o();
                        return null;
                    }
                    jP3 = p(2, p(2, jP3, uxe1.d), uxe1.e);
                }
            }
            j2 = jP3;
            iC2 = l1d.C(i3);
            if (iC2 != 0) {
                return new rxe1(z4p1.G(jP2), z4p1.G(j2), iG);
            }
            if (iC2 == i4) {
                return new rxe1(z4p1.G(B(1, jP2, j3)), z4p1.G(B(2, j2, j)), iG);
            }
            eg.o();
            return null;
        }
        jP = jP4;
        jP2 = jP;
        j = uxe1.c;
        jP3 = p(2, jH, j);
        iC = l1d.C(i2);
        if (iC != 0) {
            if (iC != i4) {
                jP3 = p(2, jP3, uxe1.d);
            } else {
                if (iC == 2) {
                    eg.o();
                    return null;
                }
                jP3 = p(2, p(2, jP3, uxe1.d), uxe1.e);
            }
        }
        j2 = jP3;
        iC2 = l1d.C(i3);
        if (iC2 != 0) {
            return new rxe1(z4p1.G(jP2), z4p1.G(j2), iG);
        }
        if (iC2 == i4) {
            return new rxe1(z4p1.G(B(1, jP2, j3)), z4p1.G(B(2, j2, j)), iG);
        }
        eg.o();
        return null;
    }
}
