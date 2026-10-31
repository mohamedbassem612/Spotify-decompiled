package p;

import android.content.Context;
import android.net.Uri;
import android.text.Html;
import android.text.Spanned;
import android.text.format.DateFormat;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.wrapped.v1.proto.Paragraph;
import io.reactivex.rxjava3.subjects.Subject;
import j$.util.DesugarTimeZone;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class cuo1 {
    public static b180 a;

    public static byte[] A(String str, String str2, byte[] bArr, String str3) {
        if (bArr.length != 16) {
            hhg1.n("nonce must be exactly 16 bytes");
            return null;
        }
        Charset charset = nne.a;
        byte[] bytes = str.getBytes(charset);
        byte[] bytes2 = str2.getBytes(charset);
        byte[] bytes3 = str3.getBytes(charset);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bytes.length + 18 + bytes2.length + 4 + bArr.length + 4 + bytes3.length);
        byteBufferAllocate.put("sc-sig-v1\n".getBytes(charset));
        H(byteBufferAllocate, bytes);
        H(byteBufferAllocate, bytes2);
        H(byteBufferAllocate, bArr);
        H(byteBufferAllocate, bytes3);
        return byteBufferAllocate.array();
    }

    public static Spanned B(String str) {
        return Html.fromHtml(str, 0);
    }

    public static void C() {
        int i = mhc0.b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object D(g38 g38Var, onm onmVar) {
        l38 l38Var;
        if (onmVar instanceof l38) {
            l38Var = (l38) onmVar;
            int i = l38Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                l38Var.b = i - Integer.MIN_VALUE;
            } else {
                l38Var = new l38(onmVar);
            }
        } else {
            l38Var = new l38(onmVar);
        }
        Object objL = l38Var.a;
        int i2 = l38Var.b;
        if (i2 == 0) {
            hm5.M(objL);
            Subject subject = g38Var.k;
            l38Var.b = 1;
            objL = fc11.l(subject, 1, (Object) null, l38Var);
            d9n d9nVar = d9n.a;
            if (objL == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objL);
        }
        return objL;
    }

    public static final vdc E(e6p1 e6p1Var) {
        if (e6p1Var instanceof k281) {
            if (((k281) e6p1Var).f != null) {
                return new vdc(null);
            }
        } else if (e6p1Var instanceof n281) {
            return new vdc(((n281) e6p1Var).f);
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final uqt0 F(String str) {
        uqt0 uqt0Var = uqt0.b;
        if (str == null) {
            return uqt0Var;
        }
        switch (str.hashCode()) {
            case -1964138785:
                if (str.equals("clickside")) {
                    return uqt0.f;
                }
                return uqt0Var;
            case -1606406513:
                if (str.equals("endplay")) {
                    return uqt0.g;
                }
                return uqt0Var;
            case -1584223172:
                if (str.equals("interupted")) {
                    return uqt0.i;
                }
                return uqt0Var;
            case -1548612125:
                if (str.equals("offline")) {
                    return uqt0.T0;
                }
                return uqt0Var;
            case -1261817911:
                if (str.equals("fwdbtn")) {
                    return uqt0.h;
                }
                return uqt0Var;
            case -1097329270:
                if (str.equals("logout")) {
                    return uqt0.t;
                }
                return uqt0Var;
            case -934610874:
                if (str.equals("remote")) {
                    return uqt0.Z;
                }
                return uqt0Var;
            case -793229689:
                if (str.equals("appload")) {
                    return uqt0.c;
                }
                return uqt0Var;
            case -493570392:
                if (str.equals("playbtn")) {
                    return uqt0.X;
                }
                return uqt0Var;
            case -347210731:
                if (str.equals("backbtn")) {
                    return uqt0.d;
                }
                return uqt0Var;
            case -338178483:
                if (str.equals("backgrounded")) {
                    return uqt0.S0;
                }
                return uqt0Var;
            case -318184504:
                if (str.equals("preview")) {
                    return uqt0.Q0;
                }
                return uqt0Var;
            case -284840886:
                str.equals("unknown");
                return uqt0Var;
            case -172141130:
                if (str.equals("uriopen")) {
                    return uqt0.R0;
                }
                return uqt0Var;
            case 106852524:
                if (str.equals("popup")) {
                    return uqt0.Y;
                }
                return uqt0Var;
            case 730298189:
                if (str.equals("trackdone")) {
                    return uqt0.O0;
                }
                return uqt0Var;
            case 906471250:
                if (str.equals("clickrow")) {
                    return uqt0.e;
                }
                return uqt0Var;
            case 915894206:
                if (str.equals("switched-to-audio")) {
                    return uqt0.W0;
                }
                return uqt0Var;
            case 934930531:
                if (str.equals("switched-to-video")) {
                    return uqt0.X0;
                }
                return uqt0Var;
            case 990157655:
                if (str.equals("reconnect")) {
                    return uqt0.Y0;
                }
                return uqt0Var;
            case 1165424541:
                if (str.equals("trackerror")) {
                    return uqt0.P0;
                }
                return uqt0Var;
            case 1295399194:
                if (str.equals("unexpected-exit")) {
                    return uqt0.U0;
                }
                return uqt0Var;
            case 1535804951:
                if (str.equals("songdone")) {
                    return uqt0.N0;
                }
                return uqt0Var;
            case 1987278109:
                if (str.equals("unexpected-exit-while-paused")) {
                    return uqt0.V0;
                }
                return uqt0Var;
            default:
                return uqt0Var;
        }
    }

    public static final ti G(e6p1 e6p1Var) {
        if (!(e6p1Var instanceof k281)) {
            return e6p1Var instanceof n281 ? new vdc(((n281) e6p1Var).f) : new vdc("");
        }
        k281 k281Var = (k281) e6p1Var;
        String str = k281Var.f;
        String str2 = k281Var.e;
        return str == null ? new vdc(str2) : new wdc(Uri.parse(str), str2);
    }

    public static void H(ByteBuffer byteBuffer, byte[] bArr) {
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
        byteBuffer.putInt(bArr.length);
        byteBuffer.put(bArr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final igc1 I(String str) {
        igc1 igc1Var = igc1.b;
        if (str == null) {
            return igc1Var;
        }
        switch (str.hashCode()) {
            case -318184504:
                if (str.equals("preview")) {
                    return igc1.d;
                }
                return igc1Var;
            case 3387192:
                str.equals("none");
                return igc1Var;
            case 3649301:
                if (str.equals("wifi")) {
                    return igc1.e;
                }
                return igc1Var;
            case 241862647:
                if (str.equals("shuffle-mode")) {
                    return igc1.f;
                }
                return igc1Var;
            case 409102677:
                if (str.equals("dmca-radio")) {
                    return igc1.c;
                }
                return igc1Var;
            case 1142425971:
                if (str.equals("tablet-free")) {
                    return igc1.g;
                }
                return igc1Var;
            default:
                return igc1Var;
        }
    }

    public static final y47 J(ez61 ez61Var) {
        return new y47(ez61Var.b);
    }

    public static final x2k1 K(int i) {
        switch (l1d.C(i)) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return x2k1.b;
            case 1:
                return x2k1.c;
            case 2:
                return x2k1.d;
            case 3:
                return x2k1.e;
            case 4:
                return x2k1.f;
            case 5:
                return x2k1.g;
            case 6:
                return x2k1.h;
            case 7:
                return x2k1.i;
            default:
                eg.o();
                return null;
        }
    }

    public static final void a(s8a s8aVar, float f, float f2, qim0 qim0Var, b0k b0kVar, int i) {
        boolean z;
        boolean z2;
        mic0 mic0VarT;
        long jC;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2041801941);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(s8aVar) ? 4 : 2) | (x340Var.d(f) ? 32 : 16) | (x340Var.d(f2) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
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
            boolean z3 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
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
            Paragraph paragraph = s8aVar.f;
            List list = s8aVar.d;
            String str = s8aVar.c;
            float f3 = s8aVar.a;
            nim0 nim0Var = nim0.a;
            if (paragraph == null || f3 <= 0.0f) {
                x340Var.i0(-528307347);
                x340Var.r(false);
            } else {
                x340Var.i0(-528419784);
                b(s8aVar.f, x340Var, 0);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                x0d.s(nim0Var, 4.0f, x340Var, false);
            }
            cr31 cr31VarB = er31.b(f / 2.0f);
            if (f3 <= 0.0f) {
                x340Var.i0(-528223120);
                qim0 qim0VarH = u291.h(u291.v(nim0Var, f), f);
                uwr uwrVar2 = cbx.a;
                t1c.a(dug.f(qim0VarH, cbx.a(x340Var).a.b.c(), cr31VarB), x340Var, 0);
                x340Var.r(false);
                z2 = true;
            } else {
                x340Var.i0(-528008414);
                float f4 = ((f2 - f) * f3) + f;
                if (str != null) {
                    x340Var.i0(-527919940);
                    qim0 qim0VarQ = i1p1.q(u291.h(u291.v(nim0Var, f), f4), cr31VarB);
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode2 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM2 = x340Var.m();
                    qim0 qim0VarE2 = zr7.E(x340Var, qim0VarQ);
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
                    z = false;
                    z2 = true;
                    x340Var = x340Var;
                    cwl1.f(oi7.a(Uri.parse(str), (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, false, (j6m) null, (iu30) null, (iu30) null, (iu30) null, 0L, x340Var, 0, 0, 131070), (String) null, h2c.a.b(nim0Var), (tl3) null, mif1.P0, 0.0f, (ColorFilter) null, x340Var, 48, 104);
                    x340Var.r(true);
                    x340Var.r(false);
                } else {
                    z = false;
                    z2 = true;
                    x340Var.i0(-527577111);
                    List list2 = s8aVar.e;
                    if (list == null || list2 == null || list.size() < 2) {
                        mic0VarT = null;
                    } else {
                        ArrayList<mmr0> arrayListV1 = o7h.v1(list, list2);
                        ArrayList arrayList = new ArrayList(q7h.U(arrayListV1, 10));
                        for (mmr0 mmr0Var : arrayListV1) {
                            arrayList.add(new mmr0(Float.valueOf(((Number) mmr0Var.b).floatValue()), new u7h(ror0.e(u7h.j, (String) mmr0Var.a))));
                        }
                        mmr0[] mmr0VarArr = (mmr0[]) arrayList.toArray(new mmr0[0]);
                        mic0VarT = v9c.t((mmr0[]) Arrays.copyOf(mmr0VarArr, mmr0VarArr.length), 0.0f, 0.0f, 14);
                    }
                    String str2 = s8aVar.b;
                    u7h u7hVar = str2 != null ? new u7h(ror0.e(u7h.j, str2)) : null;
                    if (u7hVar == null) {
                        x340Var.i0(1645552702);
                        uwr uwrVar3 = cbx.a;
                        jC = cbx.a(x340Var).a.b.c();
                        x340Var.r(false);
                    } else {
                        x340Var.i0(1645550966);
                        x340Var.r(false);
                        jC = u7hVar.a;
                    }
                    t1c.a(u291.h(u291.v(nim0Var, f), f4).then(mic0VarT != null ? dug.e(nim0Var, mic0VarT, cr31VarB, 0.0f, 4) : dug.f(nim0Var, jC, cr31VarB)), x340Var, 0);
                    x340Var.r(false);
                }
                x340Var.r(z);
            }
            x340Var.r(z2);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c3c(s8aVar, f, f2, qim0Var, i, (byte) 2);
        }
    }

    public static final void b(Paragraph paragraph, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(842091586);
        int i2 = (x340Var.g(paragraph) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new x990(paragraph, (byte) 7);
                x340Var.s0(objT);
            }
            ejo1.l(0, 0, x340Var, (vu30) objT, qim0VarF);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x990(paragraph, i, (byte) 8);
        }
    }

    public static final void c(String str, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1570222926);
        int i2 = i | (x340Var.g(str) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarZ = uyn1.z(0.0f, 2.0f, 1, nim0Var);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
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
            cvx cvxVar2 = cbx.b(x340Var).b;
            t1c.a(dug.f(u291.r(nim0Var, 6.0f), cbx.a(x340Var).b.b, er31.a), x340Var, 0);
            cvx cvxVar3 = cbx.b(x340Var).b;
            uwo1.e(str, null, ktd.l(nim0Var, 8.0f, x340Var, x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, i2 & 14, 0, 2034);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new y5d0(str, i, (byte) 26);
        }
    }

    public static final void d(String str, c380 c380Var, b0k b0kVar, int i) {
        c380 c380Var2;
        x340 x340Var;
        byte b;
        String str2 = str;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-241548125);
        j06 j06Var = x340Var2.a;
        int i2 = i | (x340Var2.g(str2) ? 4 : 2) | (x340Var2.g(c380Var) ? 32 : 16);
        if (x340Var2.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var2).g;
            cvx cvxVar = cbx.b(x340Var2).b;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var2, 0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarF2);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            w0h1.a(rtx.c, isl.a, u291.r(nim0Var, 16.0f), cbx.a(x340Var2).b.b, 0L, true, x340Var2, rtx.d | 196656, 16);
            str2 = str;
            uwo1.e(str2, null, ktd.l(nim0Var, 12.0f, x340Var2, x340Var2).h, cbx.a(x340Var2).b.a, null, null, 0, false, null, 0, null, x340Var2, i2 & 14, 0, 2034);
            x340Var = x340Var2;
            b = 1;
            x340Var.r(true);
            cvx cvxVar2 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 8.0f));
            qim0 qim0VarB = uyn1.B(nim0Var, 28.0f, 0.0f, 0.0f, 0.0f, 14);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarB);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            c380Var2 = c380Var;
            Iterator itN = kk0.n(x340Var, qim0VarE3, lljVar4, -1748639289, c380Var2);
            while (itN.hasNext()) {
                c(((uri0) itN.next()).b, x340Var, 0);
            }
            us71.m(x340Var, false, true, true);
        } else {
            c380Var2 = c380Var;
            x340Var = x340Var2;
            b = 1;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new f850(str2, c380Var2, i, b);
        }
    }

    public static final void e(jj10 jj10Var, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        int i2 = jj10Var.f;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-358236162);
        j06 j06Var = x340Var.a;
        int i3 = i | (x340Var.g(jj10Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128);
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarY = uyn1.y(nim0Var, 16.0f, 12.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
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
            if (i2 == 3 || i2 == 1) {
                x340Var.i0(518586448);
                h(jj10Var, function0, function1, x340Var, i3 & 1022);
                x340Var.r(false);
            } else {
                x340Var.i0(518776292);
                w(jj10Var, x340Var, i3 & 14);
                x340Var.r(false);
            }
            if (i2 == 3 || i2 == 1 || (jj10Var.i == null && jj10Var.j == null)) {
                x340Var.i0(519572558);
                x340Var.r(false);
            } else {
                x340Var.i0(518935415);
                cvx cvxVar3 = cbx.b(x340Var).b;
                cvx cvxVar4 = cbx.b(x340Var).b;
                qim0 qim0VarF = u291.f(uyn1.B(nim0Var, 0.0f, 12.0f, 0.0f, 16.0f, 5), 1.0f);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF);
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
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                avw0 avw0Var = cbx.b(x340Var).c;
                t1c.a(anm1.N("StatusDivider", dug.f(u291.h(qim0VarF2, 1.0f), cbx.a(x340Var).d.b, d4o1.a)), x340Var, 0);
                x340Var.r(true);
                n(jj10Var, function0, function1, x340Var, i3 & 1022);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kj10(jj10Var, function0, function1, i, (byte) 0);
        }
    }

    public static final void f(Paragraph paragraph, int i, int i2, qim0 qim0Var, b0k b0kVar, int i3) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-837561108);
        int i4 = (x340Var.g(paragraph) ? 4 : 2) | i3 | (x340Var.e(i) ? 32 : 16) | (x340Var.e(i2) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i4 & 1, (i4 & 1171) != 1170)) {
            flb0 flb0Var = (flb0) x340Var.k(t4k.n);
            boolean zE = ((i4 & 14) == 4) | x340Var.e(flb0Var.ordinal()) | ((i4 & 896) == 256) | ((i4 & 112) == 32);
            Object objT = x340Var.T();
            if (zE || objT == fkj0.X) {
                objT = new hk2(flb0Var, i2, i, paragraph);
                x340Var.s0(objT);
            }
            ejo1.l((i4 >> 9) & 14, 0, x340Var, (vu30) objT, qim0Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hk2((byte) 15, i, i2, i3, paragraph, qim0Var);
        }
    }

    public static final void g(int i, j2i j2iVar, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1685600296);
        if (x340Var.Y(i & 1, (i & 3) != 2)) {
            irn1.u(null, eci.b, null, null, apo.r(543290449, new rv71(j2iVar, (byte) 6), x340Var), x340Var, 24624, 13);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pu2(j2iVar, i, (byte) 10);
        }
    }

    public static final void h(jj10 jj10Var, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1076524249);
        int i2 = (x340Var.g(jj10Var) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            if (jj10Var.f == 3) {
                x340Var.i0(-492969838);
                y(jj10Var, u291.v(nim0Var, 165.0f), x340Var, i2 & 14, 0);
                if (1.0f <= 0.0d) {
                    of80.a("invalid weight; must be greater than zero");
                }
                op71.g(x340Var, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                x340Var.r(false);
            } else {
                x340Var.i0(-492823828);
                if (1.0f <= 0.0d) {
                    of80.a("invalid weight; must be greater than zero");
                }
                y(jj10Var, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), x340Var, i2 & 14, 0);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                ab80.p(nim0Var, 12.0f, x340Var, false);
            }
            j(jj10Var, function0, function1, x340Var, i2 & 1022);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kj10(jj10Var, function0, function1, i, (byte) 1);
        }
    }

    public static final void i(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-623511034);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarJ = u291.j(65.0f, 0.0f, 2, u291.f(qim0Var3, 1.0f));
            gra graVar = een.h;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            zzq0 zzq0Var = new zzq0(8.0f, 8.0f, 8.0f, 8.0f);
            ogx ogxVar = ogx.e;
            if (ihc1.y0("Install on other device")) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                cwl1.b(qim0VarJ, graVar, (hw61) null, ogxVar, zzq0Var, (max) null, false, (idn0) null, (ga80) null, new gbx(new y50("Install on other device"), function0), (gbx) null, fhi.a, x340Var, 3120, 48, 1508);
                qim0Var2 = qim0Var3;
            }
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vd1(function0, qim0Var2, i, (byte) 20);
        }
    }

    public static final void j(jj10 jj10Var, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        h311 h311VarV;
        kj10 kj10Var;
        jax haxVar;
        idx idxVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1919080023);
        int i2 = (x340Var.g(jj10Var) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            String str = jj10Var.j;
            int i3 = jj10Var.f;
            if (str == null) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    kj10Var = new kj10(jj10Var, function0, function1, i, (byte) 3);
                }
            } else {
                if (i3 == 5 || i3 == 1) {
                    String str2 = jj10Var.i;
                    if (str2 == null) {
                        str2 = jj10Var.h;
                    }
                    haxVar = new hax(str2);
                } else {
                    haxVar = jax.a;
                }
                jax jaxVar = haxVar;
                Function0 function2 = i3 == 4 ? function1 : function0;
                switch (l1d.C(i3)) {
                    case SplitInstallErrorCode.NO_ERROR /* 0 */:
                    case 1:
                    case 2:
                    case 6:
                        idxVar = jdx.c;
                        break;
                    case 3:
                    case 4:
                    case 5:
                        idxVar = new idx(19);
                        break;
                    default:
                        eg.o();
                        return;
                }
                j2i j2iVarR = apo.r(1310390424, new sxj(str, function2, idxVar, jaxVar, jj10Var, (byte) 27), x340Var);
                switch (l1d.C(i3)) {
                    case SplitInstallErrorCode.NO_ERROR /* 0 */:
                    case 1:
                    case 2:
                    case 6:
                        x340Var.i0(-1001384704);
                        j2iVarR.invoke(x340Var, 6);
                        x340Var.r(false);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        x340Var.i0(-1001352433);
                        gfx.b(6, apo.r(1372602690, new pu2(j2iVarR, (byte) 29), x340Var), x340Var, 54);
                        x340Var.r(false);
                        break;
                    default:
                        eg.o();
                        return;
                }
            }
            h311VarV.d = kj10Var;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            kj10Var = new kj10(jj10Var, function0, function1, i, (byte) 2);
            h311VarV.d = kj10Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:55:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:82:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:92:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:95:0x0112  */
    /* JADX WARN: Code duplicated, block: B:98:0x011d  */
    public static final void k(hux huxVar, gbx gbxVar, jsl jslVar, qim0 qim0Var, idn0 idn0Var, b0k b0kVar, int i, int i2) {
        int i3;
        gbx gbxVar2;
        jsl jslVar2;
        qim0 qim0Var2;
        int i4;
        idn0 idn0Var2;
        int i5;
        int i6;
        boolean z;
        idn0 idn0Var3;
        qim0 qim0Var3;
        h311 h311VarV;
        idn0 idn0Var4;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Object objT;
        int i7;
        Object objT2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1489022113);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? x340Var.g(huxVar) : x340Var.i(huxVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            gbxVar2 = gbxVar;
            i3 |= x340Var.g(gbxVar2) ? 32 : 16;
        } else {
            gbxVar2 = gbxVar;
        }
        if ((i & 384) == 0) {
            jslVar2 = jslVar;
            i3 |= x340Var.g(jslVar2) ? 256 : 128;
        } else {
            jslVar2 = jslVar;
        }
        int i8 = i2 & 8;
        if (i8 == 0) {
            if ((i & 3072) == 0) {
                qim0Var2 = qim0Var;
                i3 |= x340Var.g(qim0Var2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    idn0Var2 = idn0Var;
                    if (x340Var.g(idn0Var2)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                i6 = i3;
                if ((i6 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i6 & 1, z)) {
                    if (i8 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if (i4 != 0) {
                        objT2 = x340Var.T();
                        if (objT2 == m4cVar) {
                            objT2 = ktd.n(x340Var);
                        }
                        idn0Var4 = (idn0) objT2;
                    } else {
                        idn0Var4 = idn0Var2;
                    }
                    if ((i6 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if ((57344 & i6) == 16384) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean z6 = z2 | z3;
                    if ((i6 & 14) != 4 || ((i6 & 8) != 0 && x340Var.i(huxVar))) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = z6 | z4 | ((i6 & 896) == 256);
                    objT = x340Var.T();
                    if (!z5 || objT == m4cVar) {
                        gbx gbxVar3 = gbxVar2;
                        jsl jslVar3 = jslVar2;
                        i7 = 0;
                        qfx qfxVar = new qfx(gbxVar3, idn0Var4, huxVar, jslVar3, (byte) 4);
                        x340Var.s0(qfxVar);
                        objT = qfxVar;
                    } else {
                        i7 = 0;
                    }
                    ejo1.l((i6 >> 9) & 14, i7, x340Var, (vu30) objT, qim0Var2);
                    idn0Var3 = idn0Var4;
                } else {
                    x340Var.b0();
                    idn0Var3 = idn0Var2;
                }
                qim0Var3 = qim0Var2;
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new j90(huxVar, gbxVar, jslVar, qim0Var3, idn0Var3, i, i2, (byte) 6);
                }
            }
            i3 |= 24576;
            idn0Var2 = idn0Var;
            i6 = i3;
            if ((i6 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i6 & 1, z)) {
                if (i8 != 0) {
                    qim0Var2 = nim0.a;
                }
                if (i4 != 0) {
                    objT2 = x340Var.T();
                    if (objT2 == m4cVar) {
                        objT2 = ktd.n(x340Var);
                    }
                    idn0Var4 = (idn0) objT2;
                } else {
                    idn0Var4 = idn0Var2;
                }
                if ((i6 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((57344 & i6) == 16384) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z7 = z2 | z3;
                if ((i6 & 14) != 4) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                z5 = z7 | z4 | ((i6 & 896) == 256);
                objT = x340Var.T();
                if (z5) {
                    gbx gbxVar4 = gbxVar2;
                    jsl jslVar4 = jslVar2;
                    i7 = 0;
                    qfx qfxVar2 = new qfx(gbxVar4, idn0Var4, huxVar, jslVar4, (byte) 4);
                    x340Var.s0(qfxVar2);
                    objT = qfxVar2;
                } else {
                    gbx gbxVar5 = gbxVar2;
                    jsl jslVar5 = jslVar2;
                    i7 = 0;
                    qfx qfxVar3 = new qfx(gbxVar5, idn0Var4, huxVar, jslVar5, (byte) 4);
                    x340Var.s0(qfxVar3);
                    objT = qfxVar3;
                }
                ejo1.l((i6 >> 9) & 14, i7, x340Var, (vu30) objT, qim0Var2);
                idn0Var3 = idn0Var4;
            } else {
                x340Var.b0();
                idn0Var3 = idn0Var2;
            }
            qim0Var3 = qim0Var2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new j90(huxVar, gbxVar, jslVar, qim0Var3, idn0Var3, i, i2, (byte) 6);
            }
        }
        i3 |= 3072;
        qim0Var2 = qim0Var;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                idn0Var2 = idn0Var;
                if (x340Var.g(idn0Var2)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            i6 = i3;
            if ((i6 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i6 & 1, z)) {
                if (i8 != 0) {
                    qim0Var2 = nim0.a;
                }
                if (i4 != 0) {
                    objT2 = x340Var.T();
                    if (objT2 == m4cVar) {
                        objT2 = ktd.n(x340Var);
                    }
                    idn0Var4 = (idn0) objT2;
                } else {
                    idn0Var4 = idn0Var2;
                }
                if ((i6 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((57344 & i6) == 16384) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z8 = z2 | z3;
                if ((i6 & 14) != 4) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                z5 = z8 | z4 | ((i6 & 896) == 256);
                objT = x340Var.T();
                if (z5) {
                    gbx gbxVar6 = gbxVar2;
                    jsl jslVar6 = jslVar2;
                    i7 = 0;
                    qfx qfxVar4 = new qfx(gbxVar6, idn0Var4, huxVar, jslVar6, (byte) 4);
                    x340Var.s0(qfxVar4);
                    objT = qfxVar4;
                } else {
                    gbx gbxVar7 = gbxVar2;
                    jsl jslVar7 = jslVar2;
                    i7 = 0;
                    qfx qfxVar5 = new qfx(gbxVar7, idn0Var4, huxVar, jslVar7, (byte) 4);
                    x340Var.s0(qfxVar5);
                    objT = qfxVar5;
                }
                ejo1.l((i6 >> 9) & 14, i7, x340Var, (vu30) objT, qim0Var2);
                idn0Var3 = idn0Var4;
            } else {
                x340Var.b0();
                idn0Var3 = idn0Var2;
            }
            qim0Var3 = qim0Var2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new j90(huxVar, gbxVar, jslVar, qim0Var3, idn0Var3, i, i2, (byte) 6);
            }
        }
        i3 |= 24576;
        idn0Var2 = idn0Var;
        i6 = i3;
        if ((i6 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i6 & 1, z)) {
            if (i8 != 0) {
                qim0Var2 = nim0.a;
            }
            if (i4 != 0) {
                objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = ktd.n(x340Var);
                }
                idn0Var4 = (idn0) objT2;
            } else {
                idn0Var4 = idn0Var2;
            }
            if ((i6 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((57344 & i6) == 16384) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z9 = z2 | z3;
            if ((i6 & 14) != 4) {
                z4 = true;
            } else {
                z4 = true;
            }
            z5 = z9 | z4 | ((i6 & 896) == 256);
            objT = x340Var.T();
            if (z5) {
                gbx gbxVar8 = gbxVar2;
                jsl jslVar8 = jslVar2;
                i7 = 0;
                qfx qfxVar6 = new qfx(gbxVar8, idn0Var4, huxVar, jslVar8, (byte) 4);
                x340Var.s0(qfxVar6);
                objT = qfxVar6;
            } else {
                gbx gbxVar9 = gbxVar2;
                jsl jslVar9 = jslVar2;
                i7 = 0;
                qfx qfxVar7 = new qfx(gbxVar9, idn0Var4, huxVar, jslVar9, (byte) 4);
                x340Var.s0(qfxVar7);
                objT = qfxVar7;
            }
            ejo1.l((i6 >> 9) & 14, i7, x340Var, (vu30) objT, qim0Var2);
            idn0Var3 = idn0Var4;
        } else {
            x340Var.b0();
            idn0Var3 = idn0Var2;
        }
        qim0Var3 = qim0Var2;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j90(huxVar, gbxVar, jslVar, qim0Var3, idn0Var3, i, i2, (byte) 6);
        }
    }

    public static final void l(jj10 jj10Var, String str, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-49568920);
        int i2 = i | (x340Var.g(jj10Var) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(4.0f, true, new um5(false)), een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
            if (jj10Var.l != null) {
                x340Var.i0(-1627780650);
                kiv kivVar = t4k.h;
                mod.b(kivVar.a(new xat(((wat) x340Var.k(kivVar)).h(), 1.0f)), apo.r(-1710170713, new lj10(jj10Var, (byte) 2), x340Var), x340Var, 56);
                x340Var.r(false);
            } else {
                x340Var.i0(-1626981098);
                x340Var.r(false);
            }
            if (str != null) {
                x340Var.i0(-1626926166);
                uwo1.e(str, anm1.N("EventEndedDate", nim0Var), cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 2, false, new cjc0(1), 0, null, x340Var, (i2 >> 3) & 14, 0, 1712);
                x340Var.r(false);
            } else {
                x340Var.i0(-1626631914);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g8(jj10Var, str, i, (byte) 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0227  */
    /* JADX WARN: Code duplicated, block: B:70:0x017e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0194  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:86:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e6  */
    public static final void m(jj10 jj10Var, Function0 function0, Function0 function1, Function0 function2, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        int i3;
        int i4;
        String str;
        int i5;
        String strY0;
        String str2;
        List listM;
        String strY1;
        boolean zG;
        Object objT;
        Object obj = fkj0.X;
        int i6 = jj10Var.f;
        String str3 = jj10Var.m;
        String str4 = jj10Var.n;
        long j = jj10Var.d;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-187746300);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(jj10Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(function2) ? 2048 : 1024;
        }
        int i7 = i2 | 24576;
        if (b0kVar3.Y(i7 & 1, (i7 & 9363) != 9362)) {
            Context context = (Context) b0kVar3.k(AndroidCompositionLocals_androidKt.b);
            boolean zG2 = b0kVar3.g(context);
            Object objT2 = b0kVar3.T();
            if (zG2 || objT2 == obj) {
                objT2 = Locale.forLanguageTag(upn1.o(context, "-"));
                b0kVar3.s0(objT2);
            }
            Locale locale = (Locale) objT2;
            boolean zG3 = b0kVar3.g(str4);
            Object objT3 = b0kVar3.T();
            if (zG3 || objT3 == obj) {
                objT3 = DesugarTimeZone.getTimeZone(str4);
                b0kVar3.s0(objT3);
            }
            TimeZone timeZone = (TimeZone) objT3;
            boolean zIs24HourFormat = DateFormat.is24HourFormat(context);
            String strO0 = cwl1.o0(b0kVar3, 2131955904);
            boolean zF = b0kVar3.f(j) | b0kVar3.g(locale) | b0kVar3.g(timeZone);
            Object objT4 = b0kVar3.T();
            if (zF || objT4 == obj) {
                locale.getClass();
                timeZone.getClass();
                Date date = new Date(j * 1000);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateFormat.getBestDateTimePattern(locale, "EEE, MMM d"), locale);
                simpleDateFormat.setTimeZone(timeZone);
                objT4 = simpleDateFormat.format(date);
                b0kVar3.s0(objT4);
            }
            String str5 = (String) objT4;
            boolean zF2 = b0kVar3.f(j) | b0kVar3.g(str5) | b0kVar3.h(zIs24HourFormat) | b0kVar3.g(locale) | b0kVar3.g(timeZone) | b0kVar3.g(strO0);
            Object objT5 = b0kVar3.T();
            if (zF2 || objT5 == obj) {
                locale.getClass();
                timeZone.getClass();
                Date date2 = new Date(j * 1000);
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(DateFormat.getBestDateTimePattern(locale, zIs24HourFormat ? "HH:mm" : "h:mm a"), locale);
                simpleDateFormat2.setTimeZone(timeZone);
                objT5 = String.format(locale, strO0, Arrays.copyOf(new Object[]{str5, simpleDateFormat2.format(date2)}, 2));
                b0kVar3.s0(objT5);
            }
            String str6 = (String) objT5;
            boolean zG4 = b0kVar3.g(str3) | b0kVar3.g(str5);
            Object objT6 = b0kVar3.T();
            if (zG4 || objT6 == obj) {
                if (str3 == null) {
                    objT6 = null;
                } else {
                    if (str3.length() <= 0) {
                        str3 = null;
                    }
                    if (str3 != null) {
                        objT6 = f4i1.f(str3, " ", str5);
                    } else {
                        objT6 = null;
                    }
                }
                b0kVar3.s0(objT6);
            }
            String str7 = (String) objT6;
            if (i6 != 3) {
                i3 = 1;
                if (i6 != 1) {
                    i4 = 0;
                }
                str = jj10Var.a;
                if (i6 == i3) {
                    strY0 = o7h.y0(o7h.o0(p7h.M(new String[]{jj10Var.l, str7})), " ", (String) null, (String) null, (iu30) null, 62);
                    if (strY0.length() <= 0) {
                        strY0 = null;
                    }
                    i5 = 1;
                } else {
                    i5 = i3;
                    strY0 = null;
                }
                if (i6 == i5) {
                    listM = p7h.M(new String[]{str, strY0});
                } else {
                    String str8 = jj10Var.b;
                    str2 = jj10Var.e;
                    if (str2.length() <= 0) {
                        str2 = null;
                    }
                    listM = p7h.M(new String[]{str8, str6, str2, str});
                }
                strY1 = o7h.y0(o7h.o0(o7h.N0(p7h.M(new String[]{jj10Var.g, jj10Var.h, i4 == 0 ? jj10Var.i : null, jj10Var.k, jj10Var.j}), listM)), ". ", (String) null, (String) null, (iu30) null, 62);
                qim0 qim0Var3 = nim0.a;
                qim0 qim0VarN = anm1.N("Card", u291.v(qim0Var3, 343.0f));
                zG = b0kVar3.g(strY1);
                objT = b0kVar3.T();
                if (zG || objT == obj) {
                    objT = new kq00(strY1, (byte) 13);
                    b0kVar3.s0(objT);
                }
                qim0 qim0VarX = bin.x(s161.b(qim0VarN, false, (iu30) objT), false, null, new pm31(0), null, function0, 11);
                mgx mgxVar = mgx.e;
                zzq0 zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                uwr uwrVar = cbx.a;
                cua cuaVar = cbx.b(b0kVar3).f;
                b0kVar2 = b0kVar3;
                cwl1.b(qim0VarX, (tl3) null, er31.b(16.0f), mgxVar, zzq0Var, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(710627309, new pih(jj10Var, function1, function2, str6, str7, locale, timeZone, (byte) 2), b0kVar3), b0kVar2, 0, 48, 2018);
                qim0Var2 = qim0Var3;
            } else {
                i3 = 1;
            }
            i4 = i3;
            str = jj10Var.a;
            if (i6 == i3) {
                strY0 = o7h.y0(o7h.o0(p7h.M(new String[]{jj10Var.l, str7})), " ", (String) null, (String) null, (iu30) null, 62);
                if (strY0.length() <= 0) {
                    strY0 = null;
                }
                i5 = 1;
            } else {
                i5 = i3;
                strY0 = null;
            }
            if (i6 == i5) {
                listM = p7h.M(new String[]{str, strY0});
            } else {
                String str9 = jj10Var.b;
                str2 = jj10Var.e;
                if (str2.length() <= 0) {
                    str2 = null;
                }
                listM = p7h.M(new String[]{str9, str6, str2, str});
            }
            strY1 = o7h.y0(o7h.o0(o7h.N0(p7h.M(new String[]{jj10Var.g, jj10Var.h, i4 == 0 ? jj10Var.i : null, jj10Var.k, jj10Var.j}), listM)), ". ", (String) null, (String) null, (iu30) null, 62);
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarN2 = anm1.N("Card", u291.v(qim0Var4, 343.0f));
            zG = b0kVar3.g(strY1);
            objT = b0kVar3.T();
            if (zG) {
                objT = new kq00(strY1, (byte) 13);
                b0kVar3.s0(objT);
            } else {
                objT = new kq00(strY1, (byte) 13);
                b0kVar3.s0(objT);
            }
            qim0 qim0VarX2 = bin.x(s161.b(qim0VarN2, false, (iu30) objT), false, null, new pm31(0), null, function0, 11);
            mgx mgxVar2 = mgx.e;
            zzq0 zzq0Var2 = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
            uwr uwrVar2 = cbx.a;
            cua cuaVar2 = cbx.b(b0kVar3).f;
            b0kVar2 = b0kVar3;
            cwl1.b(qim0VarX2, (tl3) null, er31.b(16.0f), mgxVar2, zzq0Var2, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(710627309, new pih(jj10Var, function1, function2, str6, str7, locale, timeZone, (byte) 2), b0kVar3), b0kVar2, 0, 48, 2018);
            qim0Var2 = qim0Var4;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new kyq((byte) 8, i, jj10Var, function0, function1, function2, qim0Var2);
        }
    }

    public static final void n(jj10 jj10Var, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1761515710);
        int i2 = i | (x340Var.g(jj10Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarN = anm1.N("FooterContent", u291.z(u291.f(nim0Var, 1.0f), (fra) null, 3));
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            String str = jj10Var.i;
            if (str != null) {
                x340Var.i0(-1166749571);
                if (1.0f <= 0.0d) {
                    of80.a("invalid weight; must be greater than zero");
                }
                o(0, str, x340Var, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                x340Var.r(false);
            } else {
                x340Var.i0(-1166669932);
                if (1.0f <= 0.0d) {
                    of80.a("invalid weight; must be greater than zero");
                }
                op71.g(x340Var, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                x340Var.r(false);
            }
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, u291.v(nim0Var, 4.0f));
            j(jj10Var, function0, function1, x340Var, i2 & 1022);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kj10(jj10Var, function0, function1, i, (byte) 4);
        }
    }

    public static final void o(int i, String str, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1087172668);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarN = anm1.N("FooterText", qim0Var);
            uwr uwrVar = cbx.a;
            uwo1.e(str, qim0VarN, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 2, false, new cjc0(2), 0, null, x340Var, i2 & 14, 0, 1712);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rj(str, qim0Var, i, (byte) 25);
        }
    }

    public static final void p(jj10 jj10Var, String str, String str2, Locale locale, TimeZone timeZone, b0k b0kVar, int i) {
        int i2;
        boolean z;
        String str3 = jj10Var.e;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1419131386);
        j06 j06Var = x340Var.a;
        int i3 = i | (x340Var.g(jj10Var) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.g(str2) ? 256 : 128) | (x340Var.g(locale) ? 2048 : 1024) | (x340Var.i(timeZone) ? 16384 : 8192);
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            d36 d36Var = new d36(16.0f, true, new um5(false));
            era eraVar = een.P0;
            mbh mbhVarA = jbh.a(d36Var, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
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
            if (jj10Var.f == 1) {
                x340Var.i0(826456182);
                l(jj10Var, str2, x340Var, (i3 & 14) | ((i3 >> 3) & 112));
                x340Var.r(false);
                i2 = 3;
                z = true;
            } else {
                x340Var.i0(826601231);
                cvx cvxVar2 = cbx.b(x340Var).b;
                jw31 jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), een.N0, x340Var, 0);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, nim0Var);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(jw31VarA, x340Var, lljVar);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar4);
                bxc bxcVarZ = qon1.z(jj10Var.d, locale, timeZone, x340Var, (i3 >> 6) & 1008, 0);
                qon1.b(bxcVarZ.b, bxcVarZ.a, null, locale, x340Var, i3 & 7168, 4);
                wnb0 wnb0Var = new wnb0(1.0f, true);
                mbh mbhVarA2 = jbh.a(h36.c, eraVar, x340Var, 0);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, wnb0Var);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA2, x340Var, lljVar);
                nko1.H(xos0VarM3, x340Var, lljVar2);
                x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE3, x340Var, lljVar4);
                i2 = 3;
                z = true;
                uwo1.e(jj10Var.b, anm1.N("EventSubtitle", nim0Var), cbx.d(x340Var).j, cbx.a(x340Var).b.a, null, null, 2, false, new cjc0(1), 0, null, x340Var, 0, 0, 1712);
                uwo1.e(str, anm1.N("EventDateTime", nim0Var), cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 2, false, new cjc0(2), 0, null, x340Var, (i3 >> 3) & 14, 0, 1712);
                x340Var = x340Var;
                if (str3.length() > 0) {
                    x340Var.i0(-1981338268);
                    uwo1.e(str3, anm1.N("EventLocation", nim0Var), cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 2, false, new cjc0(2), 0, null, x340Var, 0, 0, 1712);
                    x340Var = x340Var;
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1981003468);
                    x340Var.r(false);
                }
                us71.m(x340Var, z, z, false);
            }
            x340 x340Var2 = x340Var;
            uwo1.e(jj10Var.a, anm1.N("Title", nim0Var), cbx.d(x340Var).c, cbx.a(x340Var).b.a, null, null, 2, false, new cjc0(i2), 0, null, x340Var2, 0, 0, 1712);
            x340Var = x340Var2;
            x340Var.r(z);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sxj((byte) 28, i, (Object) jj10Var, (Object) str2, (Object) locale, (Object) timeZone, str);
        }
    }

    public static final void q(jj10 jj10Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        int i3 = jj10Var.f;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1978007958);
        int i4 = (x340Var.g(jj10Var) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i4 & 1, (i4 & 19) != 18)) {
            boolean zE = x340Var.e(l1d.C(i3));
            Object objT = x340Var.T();
            if (zE || objT == obj) {
                objT = Boolean.valueOf(i3 == 4);
                x340Var.s0(objT);
            }
            boolean zBooleanValue = ((Boolean) objT).booleanValue();
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarN = anm1.N("MainImage", u291.d(nim0Var, 1.0f));
            if (zBooleanValue) {
                qim0VarN = qim0VarN.then(fc11.n(nim0Var, 4.0f, 4.0f, d4o1.a));
            }
            cso1.d(Uri.parse(jj10Var.c), isl.a, qim0VarN, mif1.P0, null, null, null, x340Var, 48, 240);
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            boolean zH = x340Var.h(zBooleanValue);
            Object objT2 = x340Var.T();
            if (zH || objT2 == obj) {
                i2 = 0;
                objT2 = new mj10((byte) 0, zBooleanValue);
                x340Var.s0(objT2);
            } else {
                i2 = 0;
            }
            t1c.a(exd0.q(qim0VarD, (iu30) objT2), x340Var, i2);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xh00((Object) jj10Var, (Object) qim0Var, i, (byte) 4);
        }
    }

    public static final void r(zri0 zri0Var, iu30 iu30Var, iu30 iu30Var2, vu30 vu30Var, b0k b0kVar, int i) {
        iu30 iu30Var3;
        boolean z;
        m4c m4cVar = fkj0.X;
        String str = zri0Var.h;
        c380 c380Var = zri0Var.g;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(130054364);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(zri0Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(iu30Var2) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarY = voo1.y(l6o1.H(u291.f(nim0Var, 1.0f), l6o1.C(0, 0, 1, x340Var), false, 14), voo1.g);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarY2 = uyn1.y(qim0VarY, 16.0f, 16.0f);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY2);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
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
            vu30Var.invoke(x340Var, 6);
            cvx cvxVar3 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 16.0f));
            uwo1.e(zri0Var.e, null, cbx.d(x340Var).d, cbx.a(x340Var).b.a, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2018);
            op71.g(x340Var, u291.h(nim0Var, cbx.b(x340Var).b.b));
            if (c380Var.isEmpty()) {
                x340Var.i0(-1510443984);
                x340Var.r(false);
            } else {
                x340Var.i0(-1510600627);
                d(zri0Var.f, c380Var, x340Var, 0);
                x0d.s(nim0Var, cbx.b(x340Var).b.a, x340Var, false);
            }
            if (str.length() > 0) {
                x340Var.i0(-1510373397);
                z(str, x340Var, 0);
                x0d.s(nim0Var, cbx.b(x340Var).b.c, x340Var, false);
            } else {
                x340Var.i0(-1510245584);
                x340Var.r(false);
            }
            yri0 yri0Var = zri0Var.i;
            if (yri0Var instanceof xri0) {
                x340Var.i0(-1510095823);
                xri0 xri0Var = (xri0) yri0Var;
                String str2 = xri0Var.a;
                qim0 qim0VarD = u291.D(nim0Var, (era) null, 3);
                boolean zI = x340Var.i(yri0Var) | ((i2 & 112) == 32);
                Object objT = x340Var.T();
                if (zI || objT == m4cVar) {
                    objT = new sri0(iu30Var, yri0Var, (byte) 0);
                    x340Var.s0(objT);
                }
                xto1.n(384, 0, str2, (Function0) objT, x340Var, qim0VarD, true);
                cvx cvxVar4 = cbx.b(x340Var).b;
                op71.g(x340Var, u291.h(nim0Var, 16.0f));
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                jw31 jw31VarA = ew31.a(h36.e, een.Z, x340Var, 0);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(jw31VarA, x340Var, lljVar);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar4);
                uwo1.e(xri0Var.c, null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, new cjc0(1), 0, null, x340Var, 0, 0, 1778);
                x340Var = x340Var;
                String str3 = xri0Var.d;
                if (str3 == null) {
                    x340Var.i0(-1356690927);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1356690926);
                    cvx cvxVar5 = cbx.b(x340Var).b;
                    lee1 lee1Var = ktd.l(nim0Var, 4.0f, x340Var, x340Var).j;
                    long j = cbx.a(x340Var).b.g;
                    boolean zI2 = x340Var.i(yri0Var) | ((i2 & 896) == 256);
                    Object objT2 = x340Var.T();
                    if (zI2 || objT2 == m4cVar) {
                        objT2 = new sri0(yri0Var, iu30Var2);
                        x340Var.s0(objT2);
                    }
                    uwo1.e(str3, bin.x(nim0Var, false, null, null, null, (Function0) objT2, 15), lee1Var, j, null, null, 0, false, new cjc0(1), 0, null, x340Var, 0, 0, 1776);
                    x340Var = x340Var;
                    x340Var.r(false);
                }
                x340Var.r(true);
                x340Var.r(false);
            } else {
                if (yri0Var instanceof wri0) {
                    x340Var.i0(-1507376193);
                    uwo1.e(((wri0) yri0Var).a, null, cbx.d(x340Var).g, cbx.a(x340Var).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2018);
                    x340Var = x340Var;
                    x340Var.r(false);
                } else {
                    if (!(yri0Var instanceof vri0)) {
                        throw p3d1.k(x340Var, 1613854635, false);
                    }
                    x340Var.i0(-1507090745);
                    vri0 vri0Var = (vri0) yri0Var;
                    uwo1.e(vri0Var.c, null, cbx.d(x340Var).g, cbx.a(x340Var).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2018);
                    op71.g(x340Var, u291.h(nim0Var, cbx.b(x340Var).b.b));
                    String str4 = vri0Var.a;
                    qim0 qim0VarD2 = u291.D(nim0Var, (era) null, 3);
                    if ((i2 & 112) == 32) {
                        x340Var = x340Var;
                        z = true;
                    } else {
                        x340Var = x340Var;
                        z = false;
                    }
                    boolean zI3 = x340Var.i(yri0Var) | z;
                    Object objT3 = x340Var.T();
                    if (zI3 || objT3 == m4cVar) {
                        iu30Var3 = iu30Var;
                        objT3 = new sri0(iu30Var3, yri0Var, (byte) 2);
                        x340Var.s0(objT3);
                    } else {
                        iu30Var3 = iu30Var;
                    }
                    xto1.n(0, 4, str4, (Function0) objT3, x340Var, qim0VarD2, false);
                    x340Var.r(false);
                }
                x340Var.r(true);
            }
            iu30Var3 = iu30Var;
            x340Var.r(true);
        } else {
            iu30Var3 = iu30Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new w0f0(i, zri0Var, iu30Var3, iu30Var2, vu30Var, (byte) 17);
        }
    }

    public static final void s(fws0 fws0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        boolean z;
        String strN;
        Object obj;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-976765329);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(fws0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(qim0Var) ? 256 : 128;
        }
        int i3 = 0;
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            String str = fws0Var.h;
            List list = fws0Var.a;
            b0kVar3.f0(1926361957, str);
            upb0 upb0VarB = wpb0.b(b0kVar3);
            b0kVar3.r(false);
            jua0 jua0VarD0 = nyn1.d0(b0kVar3);
            Integer num = fws0Var.d;
            int i4 = i2 & 112;
            boolean zI = (i4 == 32) | b0kVar3.i(fws0Var) | b0kVar3.g(jua0VarD0) | b0kVar3.i(upb0VarB);
            Object objT = b0kVar3.T();
            if (zI || objT == m4cVar) {
                dk6 dk6Var = new dk6(fws0Var, jua0VarD0, upb0VarB, iu30Var, (lnm) null);
                b0kVar3.s0(dk6Var);
                objT = dk6Var;
            }
            qxd0.t(num, b0kVar3, (vu30) objT);
            float fM0 = ((wat) b0kVar3.k(t4k.h)).M0(fws0Var.e);
            boolean zG = b0kVar3.g(list);
            Object objT2 = b0kVar3.T();
            if (zG || objT2 == m4cVar) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                List list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                int i5 = 0;
                z = false;
                while (it.hasNext()) {
                    gxs0 gxs0Var = (jxs0) it.next();
                    Iterator it2 = it;
                    if (gxs0Var instanceof gxs0) {
                        strN = gxs0Var.c.getUri();
                        Object obj2 = linkedHashMap.get(strN);
                        if (obj2 == null) {
                            obj2 = 0;
                        }
                        int iIntValue = ((Number) obj2).intValue();
                        linkedHashMap.put(strN, Integer.valueOf(iIntValue + 1));
                        if (iIntValue != 0) {
                            strN = strN + "#" + iIntValue;
                        }
                    } else if (gxs0Var instanceof hxs0) {
                        strN = ab80.n("title_", "_", i5, ((hxs0) gxs0Var).a);
                        i5++;
                    } else if (!(gxs0Var instanceof ixs0)) {
                        eg.o();
                        return;
                    } else {
                        String strC = f4i1.c(i3, "separator_");
                        i3++;
                        strN = strC;
                    }
                    arrayList.add(strN);
                    it = it2;
                }
                b0kVar3.s0(arrayList);
                obj = arrayList;
            } else {
                z = false;
                obj = objT2;
            }
            List list3 = (List) obj;
            String str2 = fws0Var.g;
            qim0 qim0VarB = nim0.a;
            if (str2 != null) {
                b0kVar3.i0(-411715673);
                boolean zG2 = b0kVar3.g(str2) | (i4 == 32 ? true : z);
                Object objT3 = b0kVar3.T();
                if (zG2 || objT3 == m4cVar) {
                    objT3 = new mr3(str2, iu30Var, (byte) 5);
                    b0kVar3.s0(objT3);
                }
                boolean z2 = z;
                qim0VarB = s161.b(qim0VarB, z2, (iu30) objT3);
                b0kVar3.r(z2);
            } else {
                b0kVar3.i0(-411451491);
                b0kVar3.r(z);
            }
            int i6 = fws0Var.b;
            int i7 = fws0Var.c;
            pf50 pf50Var = new pf50((i6 / buo1.v(i6, i7)) * i7);
            qim0 qim0VarN = anm1.N("allboarding_picker_grid", qim0Var);
            zzq0 zzq0Var = new zzq0(16.0f, 8.0f, 16.0f, fM0);
            boolean zI2 = b0kVar3.i(fws0Var) | b0kVar3.i(list3) | b0kVar3.g(jua0VarD0) | (i4 == 32) | b0kVar3.i(qim0VarB);
            Object objT4 = b0kVar3.T();
            if (zI2 || objT4 == m4cVar) {
                tjf0 tjf0Var = new tjf0(fws0Var, list3, jua0VarD0, iu30Var, qim0VarB, (byte) 8);
                b0kVar3.s0(tjf0Var);
                objT4 = tjf0Var;
            }
            b0kVar2 = b0kVar3;
            dko1.g(pf50Var, qim0VarN, upb0VarB, zzq0Var, null, null, null, false, null, (iu30) objT4, b0kVar2, 0, 1008);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new jmk0(fws0Var, iu30Var, qim0Var, i, (byte) 19);
        }
    }

    public static final void t(fws0 fws0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1948373266);
        int i2 = (x340Var.i(fws0Var) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = fws0Var.f;
            qim0 qim0Var3 = nim0.a;
            if (z) {
                x340Var.i0(-1799746329);
                s(fws0Var, iu30Var, bmq0.L(u291.d(qim0Var3, 1.0f), k1o1.q(x340Var), (g6o0) null), x340Var, i2 & 126);
                x340Var.r(false);
            } else {
                x340Var.i0(-1799508497);
                s(fws0Var, iu30Var, u291.d(qim0Var3, 1.0f), x340Var, i2 & 126);
                x340Var.r(false);
            }
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tbs0(fws0Var, iu30Var, qim0Var2, i, (byte) 6);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void u(gxs0 gxs0Var, int i, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i2) throws NoWhenBranchMatchedException {
        int i3;
        int i4;
        int i5;
        gxs0 gxs0Var2 = gxs0Var;
        iu30 iu30Var2 = iu30Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-301870145);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.i(gxs0Var2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 = i;
            i3 |= x340Var.e(i4) ? 32 : 16;
        } else {
            i4 = i;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.i(iu30Var2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.i(qim0Var) ? 2048 : 1024;
        }
        int i6 = i3;
        if (x340Var.Y(i6 & 1, (i6 & 1171) != 1170)) {
            ckm0 ckm0Var = gxs0Var2.c;
            String uri = ckm0Var.getUri();
            int i7 = i6 & 896;
            boolean zI = ((i6 & 112) == 32) | (i7 == 256) | x340Var.i(gxs0Var2);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                i5 = i7;
                v2b v2bVar = new v2b(iu30Var2, gxs0Var2, i4, (lnm) null, (byte) 11);
                iu30Var2 = iu30Var2;
                gxs0Var2 = gxs0Var2;
                x340Var.s0(v2bVar);
                objT = v2bVar;
            } else {
                i5 = i7;
            }
            qxd0.t(uri, x340Var, (vu30) objT);
            boolean zI2 = (i5 == 256) | x340Var.i(gxs0Var2);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new shq0((byte) 21, gxs0Var2, iu30Var2);
                x340Var.s0(objT2);
            }
            Function0 function0 = (Function0) objT2;
            if (ckm0Var instanceof w4a) {
                x340Var.i0(1960579874);
                ows0.c(gxs0Var2, function0, qim0Var, x340Var, (i6 & 14) | ((i6 >> 3) & 896));
                x340Var.r(false);
            } else if (ckm0Var instanceof ckm0) {
                x340Var.i0(648534361);
                int iC = l1d.C(ckm0Var.h);
                if (iC == 0) {
                    x340Var.i0(1960587972);
                    ows0.i(gxs0Var2, function0, qim0Var, x340Var, (i6 & 14) | ((i6 >> 3) & 896));
                    x340Var.r(false);
                } else {
                    if (iC != 1) {
                        throw p3d1.k(x340Var, 1960583113, false);
                    }
                    x340Var.i0(1960584742);
                    ows0.b(gxs0Var2, function0, qim0Var, x340Var, (i6 & 14) | ((i6 >> 3) & 896));
                    x340Var.r(false);
                }
                x340Var.r(false);
            } else if (ckm0Var instanceof qpl) {
                x340Var.i0(648791041);
                int iC2 = l1d.C(((qpl) ckm0Var).X);
                if (iC2 == 0) {
                    x340Var.i0(1960596128);
                    ows0.h(gxs0Var2, function0, qim0Var, x340Var, (i6 & 14) | ((i6 >> 3) & 896));
                    x340Var.r(false);
                } else {
                    if (iC2 != 1) {
                        throw p3d1.k(x340Var, 1960591393, false);
                    }
                    x340Var.i0(1960593026);
                    ows0.a(gxs0Var2, function0, qim0Var, x340Var, (i6 & 14) | ((i6 >> 3) & 896));
                    x340Var.r(false);
                }
                x340Var.r(false);
            } else {
                x340Var.i0(1960599211);
                x340Var.r(false);
                n57.e("Unexpected signal type in picker grid: " + ckm0Var);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nk0(gxs0Var2, i, iu30Var2, qim0Var, i2, (byte) 12);
        }
    }

    public static final void v(ArrayList arrayList, String str, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1032786404);
        byte b = 4;
        int i2 = (x340Var.g(arrayList) ? 4 : 2) | i | (x340Var.g(str) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new q4z0(str, (byte) 11);
                x340Var.s0(objT);
            }
            qim0 qim0VarA = s161.a(qim0VarB, (iu30) objT);
            float f = cbx.b(x340Var).e.b;
            Set set = zj01.a;
            cvx cvxVar2 = cbx.b(x340Var).b;
            w2g0.c(uyn1.B(qim0VarA, f + 20.0f + 12.0f, 0.0f, cbx.b(x340Var).e.b, 0.0f, 10), (tl3) null, apo.r(997979450, new hf50(arrayList, b), x340Var), x340Var, 3072, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kpw0(arrayList, str, i, (byte) 22);
        }
    }

    public static final void w(jj10 jj10Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1296504342);
        int i2 = (x340Var.g(jj10Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarN = anm1.N("StatusContent", nim0.a);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), een.N0, x340Var, 0);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            x(jj10Var.f, x340Var, 0);
            y(jj10Var, null, x340Var, i2 & 14, 2);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lj10(jj10Var, i);
        }
    }

    public static final void x(int i, b0k b0kVar, int i2) {
        ktx ktxVar;
        long j;
        long jA;
        x340 x340Var = (x340) b0kVar;
        int i3 = (kk0.t(-1315919810, i, x340Var) ? 4 : 2) | i2;
        if (x340Var.Y(i3 & 1, (i3 & 3) != 2)) {
            switch (l1d.C(i)) {
                case SplitInstallErrorCode.NO_ERROR /* 0 */:
                case 5:
                    ktxVar = bnx.c;
                    break;
                case 1:
                    ktxVar = klx.c;
                    break;
                case 2:
                    ktxVar = bnx.c;
                    break;
                case 3:
                case 4:
                    ktxVar = pox.c;
                    break;
                case 6:
                    ktxVar = ktx.c;
                    break;
                default:
                    eg.o();
                    return;
            }
            if (i == 1) {
                x340Var.i0(-1878546139);
                uwr uwrVar = cbx.a;
                j = cbx.a(x340Var).b.b;
                x340Var.r(false);
            } else {
                x340Var.i0(-1878544926);
                uwr uwrVar2 = cbx.a;
                j = cbx.a(x340Var).b.a;
                x340Var.r(false);
            }
            int iC = l1d.C(i);
            if (iC == 0 || iC == 1 || iC == 2) {
                x340Var.i0(-1878540062);
                jA = cbx.a(x340Var).a.b.a();
                x340Var.r(false);
            } else {
                x340Var.i0(-1878538361);
                jA = cbx.a(x340Var).a.b.c();
                x340Var.r(false);
            }
            mta mtaVar = cbx.b(x340Var).d;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarR = u291.r(nim0Var, 48.0f);
            cua cuaVar = cbx.b(x340Var).f;
            cua cuaVar2 = cbx.b(x340Var).f;
            qim0 qim0VarN = anm1.N("StatusIcon", dug.f(i1p1.q(qim0VarR, new zvx()), jA, d4o1.a));
            gfh0 gfh0VarC = t1c.c(een.h, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(ktxVar, isl.a, u291.r(nim0Var, 24.0f), j, 0L, false, x340Var, 56, 48);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vx1((byte) 19, i, i2);
        }
    }

    public static final void y(jj10 jj10Var, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        qim0 qim0Var2;
        int i3;
        qim0 qim0Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-66410479);
        int i4 = i | (x340Var.g(jj10Var) ? 4 : 2);
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i3 = i4 | (x340Var.i(qim0Var2) ? 32 : 16);
        }
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            qim0 qim0Var4 = nim0.a;
            qim0 qim0Var5 = i5 != 0 ? qim0Var4 : qim0Var2;
            qim0 qim0VarN = anm1.N("StatusText", qim0Var5);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            qim0 qim0VarN2 = anm1.N("StatusTitle", qim0Var4);
            String str = jj10Var.g;
            uwr uwrVar = cbx.a;
            uwo1.e(str, qim0VarN2, cbx.d(x340Var).k, cbx.a(x340Var).b.a, null, null, 2, false, new cjc0(2), 0, null, x340Var, 0, 0, 1712);
            uwo1.e(jj10Var.h, anm1.N("StatusSubtitle", qim0Var4), cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 2, false, new cjc0(3), 0, null, x340Var, 0, 0, 1712);
            x340Var.r(true);
            qim0Var3 = qim0Var5;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g8(jj10Var, qim0Var3, i, i2, (byte) 8);
        }
    }

    public static final void z(String str, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1782170854);
        int i2 = i | (x340Var.g(str) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            xnx xnxVar = xnx.c;
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).b.b;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(xnxVar, isl.a, u291.r(nim0Var, 16.0f), j, 0L, true, x340Var, xnx.d | 196656, 16);
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.e(str, null, ktd.l(nim0Var, 12.0f, x340Var, x340Var).h, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, i2 & 14, 0, 2034);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new y5d0(str, i, (byte) 27);
        }
    }
}
