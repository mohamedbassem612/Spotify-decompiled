package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.LinearGradient;
import android.net.Uri;
import android.os.Build;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import com.spotify.login.credentialmanager.passkeys.PasskeysApiException;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class kto1 {
    public static b180 a;

    public static void A(ByteBuffer byteBuffer, c18 c18Var, ByteBuffer byteBuffer2, c18 c18Var2, nge ngeVar, int i, boolean z) {
        int i2 = ngeVar.b;
        boolean z2 = c18Var.c == 2;
        boolean z3 = c18Var2.c == 2;
        int i3 = ngeVar.a;
        float[] fArr = new float[i3];
        float[] fArr2 = new float[i2];
        for (int i4 = 0; i4 < i; i4++) {
            if (z) {
                int iPosition = byteBuffer2.position();
                for (int i5 = 0; i5 < i2; i5++) {
                    fArr2[i5] = x(byteBuffer2, z3, z3);
                }
                byteBuffer2.position(iPosition);
            }
            for (int i6 = 0; i6 < i3; i6++) {
                fArr[i6] = x(byteBuffer, z2, z3);
            }
            for (int i7 = 0; i7 < i2; i7++) {
                for (int i8 = 0; i8 < i3; i8++) {
                    fArr2[i7] = (ngeVar.c[(i8 * i2) + i7] * fArr[i8]) + fArr2[i7];
                }
                if (z3) {
                    byteBuffer2.putShort((short) zoi1.i(fArr2[i7], -32768.0f, 32767.0f));
                } else {
                    byteBuffer2.putFloat(zoi1.i(fArr2[i7], -1.0f, 1.0f));
                }
                fArr2[i7] = 0.0f;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public static final void C(String str, tka0 tka0Var) throws SerializationException {
        String string;
        String str2 = "in the polymorphic scope of '" + tka0Var.r() + '\'';
        if (str == null) {
            string = cy30.n("Class discriminator was missing and no default serializers were registered ", str2, '.');
        } else {
            StringBuilder sbN = gvg.n("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            bb00.j(sbN, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sbN.append(tka0Var.r());
            sbN.append("' has to be sealed and '@Serializable'.");
            string = sbN.toString();
        }
        throw new SerializationException(string);
    }

    public static final String D(yu60 yu60Var) {
        int i = yu60Var.a;
        String str = yu60Var.b;
        if (str == null) {
            str = "Unknown";
        }
        return i + ":" + str;
    }

    public static final int E(Throwable th) {
        if (th instanceof PasskeysApiException.CredentialNotFound) {
            return 1;
        }
        return ((th instanceof PasskeysApiException.ServiceUnavailable) || (th instanceof IOException)) ? 2 : 3;
    }

    public static List F() {
        return Collections.singletonList(fts0.a);
    }

    public static final void a(joi0 joi0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        max maxVar;
        m4c m4cVar = fkj0.X;
        boolean z = joi0Var.b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1902400840);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(joi0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 32;
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        boolean z2 = false;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            d36 d36Var = new d36(16.0f, true, new um5(false));
            qim0 qim0VarN = anm1.N("actions", qim0Var);
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
            x340Var.i0(-182436199);
            Iterator it = joi0Var.a.a.d.iterator();
            int i4 = 0;
            while (true) {
                boolean zHasNext = it.hasNext();
                nim0 nim0Var = nim0.a;
                max maxVar2 = jax.a;
                z50 z50Var = z50.c;
                if (!zHasNext) {
                    boolean z3 = z2;
                    x340Var.r(z3);
                    boolean z4 = (i2 & 112) == 32 ? true : z3;
                    Object objT = x340Var.T();
                    if (z4 || objT == m4cVar) {
                        objT = new edi0(iu30Var, (byte) 10);
                        x340Var.s0(objT);
                    }
                    gbx gbxVar = new gbx(z50Var, (Function0) objT);
                    jdx jdxVar = jdx.c;
                    if (z) {
                        x340Var.i0(-182407102);
                        x340Var.r(z3);
                        maxVar = maxVar2;
                    } else {
                        x340Var.i0(-182405562);
                        max haxVar = new hax(cwl1.o0(x340Var, 2131951799));
                        x340Var.r(z3);
                        maxVar = haxVar;
                    }
                    x340 x340Var2 = x340Var;
                    foo1.c(gbxVar, jdxVar, anm1.N("not_now_button", u291.f(nim0Var, 1.0f)), maxVar, null, null, null, null, null, null, j0j.a, x340Var2, 0, 48, 2024);
                    x340Var = x340Var2;
                    x340Var.r(true);
                    break;
                }
                Object next = it.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    p7h.T();
                    throw null;
                }
                l921 l921Var = (l921) next;
                boolean zI = ((i2 & 112) == i3 ? true : z2) | x340Var.i(l921Var);
                Object objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new dvg0(iu30Var, l921Var, (byte) 10);
                    x340Var.s0(objT2);
                }
                gbx gbxVar2 = new gbx(z50Var, (Function0) objT2);
                int i6 = i2;
                idx idxVar = new idx(13);
                qim0 qim0VarN2 = anm1.N("action_button_".concat(nhc1.W(l921Var.b, " ", "_").toLowerCase(Locale.ROOT)), u291.f(nim0Var, 1.0f));
                if (z) {
                    x340Var.i0(2101034629);
                    x340Var.r(z2);
                } else {
                    x340Var.i0(2101036233);
                    max haxVar2 = new hax(cwl1.o0(x340Var, 2131951799));
                    x340Var.r(z2);
                    maxVar2 = haxVar2;
                }
                max maxVar3 = maxVar2;
                x340 x340Var3 = x340Var;
                foo1.c(gbxVar2, idxVar, qim0VarN2, maxVar3, null, null, null, null, null, null, apo.r(-1954103056, new yih0(l921Var, (byte) 16), x340Var), x340Var3, 0, 48, 2024);
                z2 = z2;
                x340Var = x340Var3;
                i4 = i5;
                i2 = i6;
                i3 = 32;
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vqd0((Object) joi0Var, (Object) iu30Var, (Object) qim0Var, i, (byte) 21);
        }
    }

    public static final void b(jq70 jq70Var, qim0 qim0Var, b0k b0kVar, int i) {
        byte b;
        qim0 qim0Var2;
        qim0 qim0Var3;
        as80 as80Var = mif1.V0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-822815589);
        int i2 = (x340Var.g(jq70Var) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var4, 1.0f);
            if (jq70Var instanceof tp70) {
                x340Var.i0(-1120678165);
                cwl1.g(new yk4(((tp70) jq70Var).a), (String) null, qim0VarD, as80Var, 0, x340Var, 48, 232);
                x340Var.r(false);
                b = 0;
                qim0Var3 = qim0Var4;
            } else {
                if (!(jq70Var instanceof wp70)) {
                    throw p3d1.k(x340Var, -451794184, false);
                }
                x340Var.i0(-1120458468);
                qim0Var3 = qim0Var4;
                b = 0;
                cwl1.f(oi7.a(Uri.parse(((wp70) jq70Var).a), (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, false, (j6m) null, (iu30) null, (iu30) null, (iu30) null, 0L, x340Var, 0, 0, 131070), (String) null, qim0VarD, (tl3) null, as80Var, 0.0f, (ColorFilter) null, x340Var, 48, 104);
                x340Var = x340Var;
                x340Var.r(false);
            }
            qim0Var2 = qim0Var3;
        } else {
            b = 0;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nyc1(jq70Var, qim0Var2, i, b);
        }
    }

    public static final void c(jld0 jld0Var, qim0 qim0Var, b0k b0kVar, int i) {
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1487586237);
        int i2 = (x340Var.i(jld0Var) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
            boolean zG = x340Var.g(context);
            Object objT = x340Var.T();
            if (zG || objT == obj) {
                objT = new Locale(upn1.o(context, "_"));
                x340Var.s0(objT);
            }
            Locale locale = (Locale) objT;
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            float f = jld0Var.a ? 1.0f : 0.0f;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
            Object objT2 = x340Var.T();
            if (objT2 == obj) {
                objT2 = nve.W0;
                x340Var.s0(objT2);
            }
            qim0 qim0VarA = s161.a(qim0VarF2, (iu30) objT2);
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).b.a;
            zsc zscVar = zex.a;
            tto1.d(f, 0, 0, j, ((vex) zscVar.e).j, x340Var, qim0VarA);
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 4.0f));
            uwo1.e(n1p1.l(jld0Var.b, locale), null, lee1.a(cbx.d(x340Var).m, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, "tnum", 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777151), ((vex) zscVar.e).m, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new a7e(jld0Var, qim0Var, i, (byte) 13);
        }
    }

    public static final void d(jq70 jq70Var, qim0 qim0Var, b0k b0kVar, int i) {
        jq70 jq70Var2;
        qim0 qim0Var2 = qim0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(698110971);
        int i2 = i | (x340Var.g(jq70Var) ? 4 : 2) | (x340Var.i(qim0Var2) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = jq70Var instanceof wp70;
            isl islVar = isl.a;
            if (z) {
                x340Var.i0(1192411971);
                eso1.e(Uri.parse(((wp70) jq70Var).a), islVar, qim0Var2, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, ((i2 << 3) & 896) | 27696, 0, 4064);
                x340Var.r(false);
                jq70Var2 = jq70Var;
                qim0Var2 = qim0Var;
            } else {
                jq70Var2 = jq70Var;
                if (!(jq70Var2 instanceof tp70)) {
                    throw p3d1.k(x340Var, 869747719, false);
                }
                x340Var.i0(1192642549);
                qim0Var2 = qim0Var;
                eso1.f(new yk4(((tp70) jq70Var2).a), islVar, qim0Var2, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, x340Var, ((i2 << 3) & 896) | 27696, 480);
                x340Var.r(false);
            }
        } else {
            jq70Var2 = jq70Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nyc1(jq70Var2, qim0Var2, i, (byte) 1);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void e(jvx jvxVar, qim0 qim0Var, int i, uvx uvxVar, max maxVar, idn0 idn0Var, ga80 ga80Var, gbx gbxVar, gbx gbxVar2, xu30 xu30Var, xu30 xu30Var2, xu30 xu30Var3, xu30 xu30Var4, xu30 xu30Var5, xu30 xu30Var6, xu30 xu30Var7, j2i j2iVar, b0k b0kVar, int i2, int i3, int i4) throws NoWhenBranchMatchedException {
        max maxVar2;
        int i5;
        xu30 xu30Var8;
        int i6;
        int i7;
        b0k b0kVar2;
        idn0 idn0Var2;
        xu30 xu30Var9;
        max maxVar3;
        xu30 xu30Var10;
        ga80 ga80Var2;
        int i8;
        int i9;
        ga80 ga80Var3;
        max maxVar4;
        xu30 xu30Var11;
        idn0 idn0Var3;
        xu30 xu30Var12;
        int i10;
        hw61 hw61Var = jvxVar.b;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-824161642);
        int i11 = (b0kVar3.i(jvxVar) ? 4 : 2) | i2 | (b0kVar3.i(qim0Var) ? 32 : 16) | (b0kVar3.e(i == 0 ? -1 : l1d.C(i)) ? 256 : 128) | (b0kVar3.i(uvxVar) ? 2048 : 1024);
        if ((i2 & 24576) == 0) {
            if ((i4 & 16) == 0) {
                maxVar2 = maxVar;
                if (b0kVar3.i(maxVar2)) {
                    i10 = 16384;
                }
                i11 |= i10;
            } else {
                maxVar2 = maxVar;
            }
            i10 = 8192;
            i11 |= i10;
        } else {
            maxVar2 = maxVar;
        }
        int i12 = i11 | 589824 | (b0kVar3.i(gbxVar) ? 8388608 : 4194304) | (b0kVar3.i(gbxVar2) ? 67108864 : 33554432);
        if ((i2 & 805306368) == 0) {
            i12 |= b0kVar3.i(xu30Var) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (b0kVar3.i(xu30Var2) ? 4 : 2);
        } else {
            i5 = i3;
        }
        int i13 = i4 & 2048;
        if (i13 != 0) {
            i6 = i5 | 48;
            xu30Var8 = xu30Var3;
        } else {
            xu30Var8 = xu30Var3;
            i6 = i5 | (b0kVar3.i(xu30Var8) ? 32 : 16);
        }
        int i14 = i6 | (b0kVar3.i(xu30Var6) ? 16384 : 8192);
        int i15 = i4 & 32768;
        if (i15 != 0) {
            i7 = i14 | 196608;
        } else {
            i7 = i14 | (b0kVar3.i(xu30Var7) ? 131072 : 65536);
        }
        int i16 = i12;
        if (b0kVar3.Y(i16 & 1, ((i12 & 306783379) == 306783378 && (599187 & i7) == 599186) ? false : true)) {
            b0kVar3.d0();
            if ((i2 & 1) == 0 || b0kVar3.E()) {
                if ((i4 & 16) != 0) {
                    i8 = i16 & (-57345);
                    maxVar2 = jax.a;
                } else {
                    i8 = i16;
                }
                idn0 idn0VarY = zso1.Y(b0kVar3);
                b0kVar3.i0(-564112031);
                b0kVar3.r(false);
                ga80 ga80VarO = vno1.o(hw61Var, b0kVar3, 0);
                int i17 = i8 & (-4128769);
                if (i13 != 0) {
                    xu30Var8 = null;
                }
                if (i15 != 0) {
                    i9 = i17;
                    ga80Var3 = ga80VarO;
                    maxVar4 = maxVar2;
                    xu30Var11 = xu30Var8;
                    idn0Var3 = idn0VarY;
                    xu30Var12 = null;
                } else {
                    i9 = i17;
                    ga80Var3 = ga80VarO;
                    maxVar4 = maxVar2;
                    xu30Var11 = xu30Var8;
                    idn0Var3 = idn0VarY;
                    xu30Var12 = xu30Var7;
                }
            } else {
                b0kVar3.b0();
                idn0Var3 = idn0Var;
                ga80Var3 = ga80Var;
                xu30Var12 = xu30Var7;
                i9 = ((i4 & 16) != 0 ? i16 & (-57345) : i16) & (-4128769);
                maxVar4 = maxVar2;
                xu30Var11 = xu30Var8;
            }
            b0kVar3.s();
            hw61 hw61VarA = gto1.A(uvxVar, hw61Var, b0kVar3, 0);
            float fY = gto1.y(b0kVar3, uvxVar.c);
            int i18 = uvxVar.a;
            ngx ngxVar = ngx.e;
            int i19 = i9;
            idn0 idn0Var4 = idn0Var3;
            b0kVar2 = b0kVar3;
            cwl1.b(u291.b(0.0f, fY, 1, uyn1.w(qim0Var, uvxVar.e)), een.h, hw61VarA, ngxVar, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), maxVar4, false, idn0Var3, ga80Var3, gbxVar, gbxVar2, apo.r(1705861567, new vv1(new uvx(i18, ngxVar, uvxVar.c, uvxVar.d, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), uvxVar.f, uvxVar.g, uvxVar.h, uvxVar.i), jvxVar, i, idn0Var4, xu30Var, xu30Var2, xu30Var11, xu30Var4, xu30Var5, xu30Var6, xu30Var12, j2iVar), b0kVar3), b0kVar2, ((i19 << 3) & 458752) | ((i19 << 6) & 1879048192), ((i19 >> 24) & 14) | 48, 64);
            idn0Var2 = idn0Var4;
            xu30Var10 = xu30Var11;
            xu30Var9 = xu30Var12;
            maxVar3 = maxVar4;
            ga80Var2 = ga80Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            idn0Var2 = idn0Var;
            xu30Var9 = xu30Var7;
            maxVar3 = maxVar2;
            xu30Var10 = xu30Var8;
            ga80Var2 = ga80Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new wvx(jvxVar, qim0Var, i, uvxVar, maxVar3, idn0Var2, ga80Var2, gbxVar, gbxVar2, xu30Var, xu30Var2, xu30Var10, xu30Var4, xu30Var5, xu30Var6, xu30Var9, j2iVar, i2, i3, i4);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void f(v660 v660Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1881733496);
        int i2 = (x340Var.g(v660Var) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            w660 w660Var = null;
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
            x660 x660Var = v660Var.b;
            List list = v660Var.a;
            int iOrdinal = x660Var.ordinal();
            nim0 nim0Var = nim0.a;
            if (iOrdinal == 0) {
                x340Var.i0(-1763939620);
                jq70 jq70Var = (jq70) o7h.s0(list);
                if (jq70Var == null) {
                    x340Var.i0(-1763939621);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1763939620);
                    d(jq70Var, u291.c(nim0Var, 0.78125f), x340Var, 0);
                    x340Var.r(false);
                }
                x340Var.r(false);
            } else if (iOrdinal == 1) {
                x340Var.i0(-1763672059);
                jq70 jq70Var2 = (jq70) o7h.s0(list);
                if (jq70Var2 != null) {
                    x340Var.i0(-1763512378);
                    d(jq70Var2, i1p1.q(u291.c(nim0Var, 0.78125f), er31.a), x340Var, 0);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1763264192);
                    w660 w660Var2 = v660Var.d;
                    if (w660Var2 != null && !ihc1.y0(w660Var2.a)) {
                        w660Var = w660Var2;
                    }
                    if (w660Var == null) {
                        x340Var.i0(-1763264193);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(-1763264192);
                        i(w660Var, u291.c(nim0Var, 0.78125f), x340Var, 0);
                        x340Var.r(false);
                    }
                    x340Var.r(false);
                }
                x340Var.r(false);
            } else if (iOrdinal == 2) {
                x340Var.i0(-1763055004);
                g(list, u291.f(u291.c(nim0Var, 0.85546875f), 1.0f), x340Var, 0);
                x340Var.r(false);
            } else {
                if (iOrdinal != 3) {
                    throw p3d1.k(x340Var, 81643444, false);
                }
                x340Var.i0(-1762744508);
                h(list, u291.f(u291.c(nim0Var, 0.85546875f), 1.0f), x340Var, 0);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sdb1(v660Var, qim0Var, i, (byte) 10);
        }
    }

    public static final void g(List list, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2062579302);
        byte b = 4;
        int i2 = (x340Var.g(list) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0Var2 = qim0Var;
            w2g0.c(qim0Var2, een.h, apo.r(1806652932, new xhf(list, b), x340Var), x340Var, ((i2 >> 3) & 14) | 3072, 4);
        } else {
            qim0Var2 = qim0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zk6(list, qim0Var2, i, (byte) 1);
        }
    }

    public static final void h(List list, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-854661127);
        int i2 = (x340Var.g(list) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0Var2 = qim0Var;
            w2g0.c(qim0Var2, een.h, apo.r(-1280396189, new xhf(list, (byte) 5), x340Var), x340Var, ((i2 >> 3) & 14) | 3072, 4);
        } else {
            qim0Var2 = qim0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zk6(list, qim0Var2, i, (byte) 2);
        }
    }

    public static final void i(w660 w660Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(663066698);
        int i2 = (x340Var.g(w660Var) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            w2g0.c(dug.f(d7e.r(1.0f, qim0Var, false), z4p1.e(w660Var.b), er31.a), een.h, apo.r(-1721081036, new bxb1(w660Var, (byte) 15), x340Var), x340Var, 3072, 4);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sdb1(w660Var, qim0Var, i, (byte) 11);
        }
    }

    public static final LinearGradient j(int i, long j, long j2, List list, List list2) {
        return men1.a(i, j, j2, list, list2);
    }

    public static final void k(uji0 uji0Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-567749459);
        int i2 = i | (x340Var.i(uji0Var) ? 4 : 2) | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.b.a();
            cvx cvxVar = cbx.b(x340Var).b;
            cr31 cr31VarB = er31.b(16.0f);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = dug.f(qim0Var3, jA, cr31VarB);
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            cvx cvxVar4 = cbx.b(x340Var).b;
            cvx cvxVar5 = cbx.b(x340Var).b;
            qim0 qim0VarN = anm1.N("member_benefits", uyn1.A(qim0VarF, 16.0f, 12.0f, 16.0f, 16.0f));
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
            m(uji0Var.a, null, x340Var, 0);
            cvx cvxVar6 = cbx.b(x340Var).b;
            op71.g(x340Var, uyn1.z(0.0f, 8.0f, 1, qim0Var3));
            uwo1.e(uji0Var.b, anm1.N("benefits_header", qim0Var3), cbx.d(x340Var).j, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2040);
            cvx cvxVar7 = cbx.b(x340Var).b;
            qim0 qim0Var4 = qim0Var3;
            op71.g(x340Var, uyn1.B(qim0Var3, 0.0f, 12.0f, 0.0f, 0.0f, 13));
            x340Var.i0(-1405486965);
            int i3 = 0;
            for (Object obj : uji0Var.c) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    p7h.T();
                    throw null;
                }
                String strN0 = cwl1.n0(2131956824, new Object[]{(String) obj}, x340Var);
                uwr uwrVar2 = cbx.a;
                uwo1.e(strN0, anm1.N("benefit_" + i3, qim0Var4), cbx.d(x340Var).j, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2040);
                i3 = i4;
                qim0Var4 = qim0Var4;
            }
            qim0 qim0Var5 = qim0Var4;
            x340Var.r(false);
            uwr uwrVar3 = cbx.a;
            cvx cvxVar8 = cbx.b(x340Var).b;
            op71.g(x340Var, uyn1.B(qim0Var5, 0.0f, 12.0f, 0.0f, 0.0f, 13));
            uwo1.e(uji0Var.d, anm1.N("benefits_footer", qim0Var5), cbx.d(x340Var).j, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2040);
            x340Var.r(true);
            qim0Var2 = qim0Var5;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q0g0(uji0Var, qim0Var2, i, (byte) 29);
        }
    }

    public static final void l(joi0 joi0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        vni0 vni0Var = joi0Var.a.a;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(1975278122);
        int i2 = (b0kVar2.i(qim0Var) ? 256 : 128) | i | (b0kVar2.i(joi0Var) ? 4 : 2) | (b0kVar2.i(iu30Var) ? 32 : 16);
        if (b0kVar2.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarH = l6o1.H(qim0Var, l6o1.C(0, 0, 1, b0kVar2), false, 14);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarH);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            String str = vni0Var.a;
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(b0kVar2).d;
            nim0 nim0Var = nim0.a;
            uwo1.e(str, anm1.N("title", nim0Var), lee1Var, 0L, null, null, 2, false, null, 0, null, b0kVar2, 0, 0, 1976);
            cvx cvxVar = cbx.b(b0kVar2).b;
            op71.g(b0kVar2, uyn1.B(nim0Var, 0.0f, 8.0f, 0.0f, 0.0f, 13));
            long j = cbx.a(b0kVar2).c.e;
            ye5 ye5VarO = kk0.o(-1164399428, b0kVar2);
            ye5VarO.g(vni0Var.b);
            if (vni0Var.e) {
                b0kVar2.i0(-174735976);
                ye5VarO.g(cwl1.o0(b0kVar2, 2131961629));
                try {
                    int iO = ye5VarO.o(new zma1(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                    try {
                        ye5VarO.g(vni0Var.f);
                        ye5VarO.k(iO);
                    } catch (Throwable th) {
                        ye5VarO.k(iO);
                        throw th;
                    }
                } catch (NoSuchMethodError unused) {
                    ye5VarO.g(vni0Var.f);
                }
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(-174396743);
                b0kVar2.r(false);
            }
            af5 af5VarP = ye5VarO.p();
            b0kVar2.r(false);
            uwr uwrVar2 = cbx.a;
            uwo1.d(af5VarP, cbx.a(b0kVar2).b.b, anm1.N("description", nim0Var), cbx.d(b0kVar2).g, null, null, 2, false, null, 0, null, null, b0kVar2, 0, 0, 4016);
            b0kVar2 = b0kVar2;
            op71.g(b0kVar2, uyn1.B(nim0Var, 0.0f, cbx.b(b0kVar2).b.a, 0.0f, 0.0f, 13));
            uji0 uji0Var = vni0Var.c;
            if (uji0Var == null) {
                b0kVar2.i0(-1735874014);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(-1735874013);
                k(uji0Var, null, b0kVar2, 0);
                op71.g(b0kVar2, uyn1.B(nim0Var, 0.0f, cbx.b(b0kVar2).b.a, 0.0f, 0.0f, 13));
                b0kVar2.r(false);
            }
            a(joi0Var, iu30Var, u291.f(nim0Var, 1.0f), b0kVar2, i2 & 126);
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new rvg0(joi0Var, iu30Var, qim0Var, i, (byte) 18);
        }
    }

    public static final void m(tni0 tni0Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        String str = tni0Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1243316644);
        int i2 = (x340Var.i(tni0Var) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("profile_section", u291.f(qim0Var3, 1.0f));
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
            bmq0.a(Uri.parse(tni0Var.b), (qim0) null, hcx.e, (String) null, str, u7h.b(z4p1.e(tni0Var.c), 1.0f, 0.0f, 0.0f, 0.0f, 14), 0L, false, x340Var, 384, 202);
            uwo1.e(str, anm1.N("profile_display_name", qim0Var3), cbx.d(x340Var).g, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2040);
            x340Var = x340Var;
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new loi0(tni0Var, qim0Var2, i, (byte) 0);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    public static final void n(float f, jxc1 jxc1Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        qim0 qim0Var2;
        hdn0 hdn0Var;
        jxc1 jxc1Var2 = jxc1Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1867094028);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = i | (x340Var.d(f) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(jxc1Var2) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            int i4 = jxc1Var2.h;
            v660 v660Var = jxc1Var2.a;
            long jE = z4p1.e(i4);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = bb00.h(0, x340Var);
            }
            hdn0 hdn0Var2 = (hdn0) objT;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarR = i1p1.r(u291.d(qim0Var3, 1.0f));
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = ljc1.Z0;
                x340Var.s0(objT2);
            }
            qim0 qim0VarC = i541.C(qim0VarR, (iu30) objT2);
            gra graVar = een.e;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarC);
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
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            ?? r2 = 0;
            b(jxc1Var2.b, null, x340Var, 0);
            jq70 jq70Var = v660Var.c;
            if (jq70Var == null) {
                x340Var.i0(-1519389862);
                x340Var.r(false);
                hdn0Var = hdn0Var2;
            } else {
                x340Var.i0(-1519389861);
                int iU = jch0.U(f * 540.0f);
                int iU2 = jch0.U((((err0) hdn0Var2).s() * 540.0f) / 256.0f);
                if (iU2 >= iU) {
                    iU = iU2;
                }
                boolean zE = x340Var.e(iU) | x340Var.i(hdn0Var2);
                Object objT3 = x340Var.T();
                if (zE || objT3 == m4cVar) {
                    objT3 = new ut1(iU, (Object) hdn0Var2, (byte) 10);
                    x340Var.s0(objT3);
                }
                qim0 qim0VarX = j9k1.x(qim0Var3, (xu30) objT3);
                gfh0 gfh0VarC2 = t1c.c(graVar, false);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarX);
                x340Var.m0();
                hdn0Var = hdn0Var2;
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC2, x340Var, lljVar);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar4);
                r2 = 0;
                b(jq70Var, null, x340Var, 0);
                x340Var.r(true);
                x340Var.r(false);
            }
            jq70 jq70Var2 = jxc1Var2.Y;
            if (jq70Var2 == null) {
                x340Var.i0(-1518350556);
            } else {
                x340Var.i0(-1518350555);
                p(jq70Var2, null, x340Var, r2);
            }
            x340Var.r((boolean) r2);
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, (int) r2);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarD);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            qim0 qim0VarH = kx40.h(1.0f, u291.d(qim0Var3, 1.0f), true);
            hdn0 hdn0Var3 = hdn0Var;
            boolean zI = x340Var.i(hdn0Var3);
            Object objT4 = x340Var.T();
            if (zI || objT4 == m4cVar) {
                objT4 = new qsc1(hdn0Var3, (byte) 1);
                x340Var.s0(objT4);
            }
            f(v660Var, lrn1.u(qim0VarH, (iu30) objT4), x340Var, 0);
            int i5 = i3 & 14;
            qim0 qim0VarY = uyn1.y(u291.i(u291.f(qim0Var3, 1.0f), oto1.w(f, 388, x340Var), oto1.w(f, 616, x340Var)), oto1.w(f, 40, x340Var), oto1.w(f, 24, x340Var));
            era eraVar2 = een.Q0;
            mbh mbhVarA2 = jbh.a(h36.e, eraVar2, x340Var, 0);
            int iHashCode4 = Long.hashCode(x340Var.T);
            xos0 xos0VarM4 = x340Var.m();
            qim0 qim0VarE4 = zr7.E(x340Var, qim0VarY);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM4, x340Var, lljVar2);
            x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE4, x340Var, lljVar4);
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            mbh mbhVarA3 = jbh.a(f36Var, eraVar2, x340Var, 0);
            int iHashCode5 = Long.hashCode(x340Var.T);
            xos0 xos0VarM5 = x340Var.m();
            qim0 qim0VarE5 = zr7.E(x340Var, qim0VarF);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA3, x340Var, lljVar);
            nko1.H(xos0VarM5, x340Var, lljVar2);
            x0d.q(iHashCode5, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE5, x340Var, lljVar4);
            jxc1Var2 = jxc1Var;
            r4o1.B(f, jxc1Var2.c, jxc1Var2.d, jE, null, jxc1Var2.X, x340Var, i5);
            op71.g(x340Var, u291.h(qim0Var3, oto1.w(f, 40, x340Var)));
            r4o1.B(f, jxc1Var2.e, jxc1Var2.f, jE, null, jxc1Var2.X, x340Var, i5);
            x340Var.r(true);
            x340Var.r(true);
            r4o1.r(f, jE, jxc1Var2.g, uyn1.y(u291.h(qim0Var3, oto1.w(f, 88, x340Var)), oto1.w(f, 32, x340Var), oto1.w(f, 16, x340Var)), x340Var, i5);
            x340Var.r(true);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jh6((Object) jxc1Var2, f, (Object) qim0Var2, i, (byte) 6);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void o(float f, float f2, jxc1 jxc1Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(633298928);
        int i2 = (x340Var.d(f) ? 4 : 2) | i | (x340Var.d(f2) ? 32 : 16) | (x340Var.g(jxc1Var) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            float fMin = Math.min(f / oto1.x(540.0f, x340Var), f2 / oto1.x(960.0f, x340Var));
            qim0 qim0VarV = u291.v(u291.h(qim0Var, f2), f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarV);
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
            n(fMin, jxc1Var, null, x340Var, (i2 >> 3) & 112);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c3c((byte) 4, f, f2, i, jxc1Var, qim0Var);
        }
    }

    public static final void p(jq70 jq70Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var;
        byte b;
        jq70 jq70Var2;
        qim0 qim0Var2;
        Bitmap bitmap;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1529989462);
        int i2 = (x340Var2.g(jq70Var) ? 4 : 2) | i | 48;
        if (!x340Var2.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var = x340Var2;
            b = 2;
            jq70Var2 = jq70Var;
            x340Var.b0();
            qim0Var2 = qim0Var;
        } else {
            if (Build.VERSION.SDK_INT < 29) {
                h311 h311VarV = x340Var2.v();
                if (h311VarV != null) {
                    h311VarV.d = new pyc1(jq70Var, i, (byte) 0);
                    return;
                }
                return;
            }
            if (jq70Var instanceof tp70) {
                x340Var2.i0(1441067036);
                x340Var2.r(false);
                x340Var = x340Var2;
                bitmap = ((tp70) jq70Var).a;
            } else {
                if (!(jq70Var instanceof wp70)) {
                    throw p3d1.k(x340Var2, 1441065889, false);
                }
                x340Var2.i0(1723451100);
                x340Var = x340Var2;
                li7 li7Var = (mi7) rwq.h(oi7.a(Uri.parse(((wp70) jq70Var).a), (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, true, (j6m) null, (iu30) null, (iu30) null, (iu30) null, 0L, x340Var2, 805306368, 0, 130558).V0, x340Var, 0).getValue();
                li7 li7Var2 = li7Var instanceof li7 ? li7Var : null;
                oq70 oq70Var = li7Var2 != null ? li7Var2.b.a : null;
                boolean zG = x340Var.g(oq70Var);
                Object objT = x340Var.T();
                if (zG || objT == m4cVar) {
                    Bitmap bitmapQ = oq70Var != null ? x2p1.q(oq70Var) : null;
                    x340Var.s0(bitmapQ);
                    objT = bitmapQ;
                }
                bitmap = (Bitmap) objT;
                x340Var.r(false);
            }
            if (bitmap == null) {
                h311 h311VarV2 = x340Var.v();
                if (h311VarV2 != null) {
                    h311VarV2.d = new pyc1(jq70Var, i, (byte) 1);
                    return;
                }
                return;
            }
            jq70Var2 = jq70Var;
            boolean zG2 = x340Var.g(bitmap);
            Object objT2 = x340Var.T();
            if (zG2 || objT2 == m4cVar) {
                objT2 = new w9c(new BitmapShader(no80.m(new yk4(bitmap)), oon1.D(1), oon1.D(1)));
                x340Var.s0(objT2);
            }
            zv61 zv61Var = (zv61) objT2;
            qim0Var2 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var2, 1.0f);
            boolean zI = x340Var.i(zv61Var);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                b = 2;
                objT3 = new qwc1(zv61Var, (byte) 2);
                x340Var.s0(objT3);
            } else {
                b = 2;
            }
            op71.g(x340Var, exd0.q(qim0VarD, (iu30) objT3));
        }
        h311 h311VarV3 = x340Var.v();
        if (h311VarV3 != null) {
            h311VarV3.d = new nyc1(jq70Var2, qim0Var2, i, b);
        }
    }

    public static final void q(g1i g1iVar) {
        p420 p420Var = new p420();
        jd11 jd11Var = rc11.a;
        g1iVar.k(p420Var, jd11Var.b(File.class));
        g1iVar.j(new j67((byte) 7), jd11Var.b(j2i1.class));
        g1iVar.j(new j67((byte) 2), jd11Var.b(ByteBuffer.class));
    }

    public static boolean r(c18 c18Var) {
        if (c18Var.a == -1 || c18Var.b == -1) {
            return false;
        }
        int i = c18Var.c;
        return i == 2 || i == 4;
    }

    public static final Object u(zy70 zy70Var, jc10 jc10Var) {
        Object obj = zy70Var.s.a.get(jc10Var);
        if (obj != null) {
            return obj;
        }
        Object obj2 = zy70Var.u.n.a.get(jc10Var);
        return obj2 == null ? jc10Var.a : obj2;
    }

    public static final Object v(dqq0 dqq0Var, jc10 jc10Var) {
        Object obj = dqq0Var.j.a.get(jc10Var);
        return obj == null ? jc10Var.a : obj;
    }

    public static final Object w(kc10 kc10Var, jc10 jc10Var) {
        Object obj = kc10Var.a.get(jc10Var);
        return obj == null ? jc10Var.a : obj;
    }

    public static float x(ByteBuffer byteBuffer, boolean z, boolean z2) {
        if (z2) {
            if (z) {
                return byteBuffer.getShort();
            }
            float f = byteBuffer.getFloat();
            return zoi1.i(f * (f < 0.0f ? 32768 : 32767), -32768.0f, 32767.0f);
        }
        if (!z) {
            return byteBuffer.getFloat();
        }
        short s = byteBuffer.getShort();
        return s / (s < 0 ? 32768 : 32767);
    }

    public static final boolean y() {
        return q26.e().a.c();
    }

    public int B(int i, byte[] bArr, int i2) {
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            return 0;
        }
        while (i < i2) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                i = i3;
            } else if (b < -32) {
                if (i3 >= i2) {
                    return b;
                }
                if (b < -62) {
                    return -1;
                }
                i += 2;
                if (bArr[i3] > -65) {
                    return -1;
                }
            } else if (b < -16) {
                if (i3 >= i2 - 1) {
                    return uoi1.d(i3, bArr, i2);
                }
                int i4 = i + 2;
                byte b2 = bArr[i3];
                if (b2 > -65) {
                    return -1;
                }
                if (b == -32 && b2 < -96) {
                    return -1;
                }
                if (b == -19 && b2 >= -96) {
                    return -1;
                }
                i += 3;
                if (bArr[i4] > -65) {
                    return -1;
                }
            } else {
                if (i3 >= i2 - 2) {
                    return uoi1.d(i3, bArr, i2);
                }
                int i5 = i + 2;
                byte b3 = bArr[i3];
                if (b3 > -65) {
                    return -1;
                }
                if ((((b3 + 112) + (b << 28)) >> 30) != 0) {
                    return -1;
                }
                int i6 = i + 3;
                if (bArr[i5] > -65) {
                    return -1;
                }
                i += 4;
                if (bArr[i6] > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException */
    public String s(int i, byte[] bArr, int i2) throws InvalidProtocolBufferException {
        if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
            t8e1.n("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)});
            return null;
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = bArr[i];
            if (!zso1.x(b)) {
                break;
            }
            i++;
            zso1.A(b, cArr, i4);
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte b2 = bArr[i];
            if (zso1.x(b2)) {
                int i7 = i5 + 1;
                zso1.A(b2, cArr, i5);
                int i8 = i6;
                while (i8 < i3) {
                    byte b3 = bArr[i8];
                    if (!zso1.x(b3)) {
                        break;
                    }
                    i8++;
                    zso1.A(b3, cArr, i7);
                    i7++;
                }
                i5 = i7;
                i = i8;
            } else {
                if (!(b2 < -32)) {
                    if (b2 < -16) {
                        if (i6 >= i3 - 1) {
                            throw InvalidProtocolBufferException.a();
                        }
                        int i9 = i + 2;
                        i += 3;
                        zso1.N(b2, bArr[i6], bArr[i9], cArr, i5);
                        i5++;
                    } else {
                        if (i6 >= i3 - 2) {
                            throw InvalidProtocolBufferException.a();
                        }
                        byte b4 = bArr[i6];
                        int i10 = i + 3;
                        byte b5 = bArr[i + 2];
                        i += 4;
                        zso1.M(b2, b4, b5, bArr[i10], cArr, i5);
                        i5 += 2;
                    }
                } else {
                    if (i6 >= i3) {
                        throw InvalidProtocolBufferException.a();
                    }
                    i += 2;
                    zso1.Q(b2, bArr[i6], cArr, i5);
                    i5++;
                }
            }
        }
        return new String(cArr, 0, i5);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.noi1 */
    public int t(String str, byte[] bArr, int i, int i2) throws noi1 {
        int i3;
        int i4;
        char cCharAt;
        int length = str.length();
        int i5 = i2 + i;
        int i6 = 0;
        while (i6 < length && (i4 = i6 + i) < i5 && (cCharAt = str.charAt(i6)) < 128) {
            bArr[i4] = (byte) cCharAt;
            i6++;
        }
        if (i6 == length) {
            return i + length;
        }
        int i7 = i + i6;
        while (i6 < length) {
            char cCharAt2 = str.charAt(i6);
            if (cCharAt2 < 128 && i7 < i5) {
                bArr[i7] = (byte) cCharAt2;
                i7++;
            } else if (cCharAt2 < 2048 && i7 <= i5 - 2) {
                int i8 = i7 + 1;
                bArr[i7] = (byte) ((cCharAt2 >>> 6) | 960);
                i7 += 2;
                bArr[i8] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i7 > i5 - 3) {
                    if (i7 > i5 - 4) {
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i6 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i3)))) {
                            throw new noi1(i6, length);
                        }
                        hhg1.d(cCharAt2, i7);
                        return 0;
                    }
                    int i9 = i6 + 1;
                    if (i9 != str.length()) {
                        char cCharAt3 = str.charAt(i9);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i7] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i10 = i7 + 3;
                            bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i7 += 4;
                            bArr[i10] = (byte) ((codePoint & 63) | 128);
                            i6 = i9;
                        } else {
                            i6 = i9;
                        }
                    }
                    throw new noi1(i6 - 1, length);
                }
                bArr[i7] = (byte) ((cCharAt2 >>> '\f') | 480);
                int i11 = i7 + 2;
                bArr[i7 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                i7 += 3;
                bArr[i11] = (byte) ((cCharAt2 & '?') | 128);
            }
            i6++;
        }
        return i7;
    }

    public boolean z(int i, byte[] bArr, int i2) {
        return B(i, bArr, i2) == 0;
    }
}
