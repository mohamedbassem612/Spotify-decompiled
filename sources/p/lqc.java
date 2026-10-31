package p;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import androidx.compose.ui.graphics.Brush;
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
import com.spotify.base.java.logging.Logger;
import com.spotify.encoreconsumermobile.elements.story.CircularVideoPreviewSpinner;
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.PlayerState;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lqc implements m7b1, c290, fae0, Function, jrn0, b8x0, Predicate, Init, ya {
    public final /* synthetic */ byte a;

    public lqc(daq daqVar, teq teqVar) {
        this.a = (byte) 4;
    }

    public static final boolean p(Object obj, Object obj2) {
        HubsImmutableComponentBundle hubsImmutableComponentBundle = HubsImmutableComponentBundle.b;
        Class<?> componentType = obj.getClass().getComponentType();
        if (!u890.j(componentType, obj2 != null ? obj2.getClass().getComponentType() : null)) {
            return false;
        }
        if (u890.j(componentType, String.class)) {
            return Arrays.equals((String[]) obj, (String[]) obj2);
        }
        if (u890.j(componentType, Long.TYPE)) {
            return Arrays.equals((long[]) obj, (long[]) obj2);
        }
        if (u890.j(componentType, Double.TYPE)) {
            return Arrays.equals((double[]) obj, (double[]) obj2);
        }
        if (u890.j(componentType, Boolean.TYPE)) {
            return Arrays.equals((boolean[]) obj, (boolean[]) obj2);
        }
        if (u890.j(componentType, Integer.TYPE)) {
            return Arrays.equals((int[]) obj, (int[]) obj2);
        }
        if (u890.j(componentType, Float.TYPE)) {
            return Arrays.equals((float[]) obj, (float[]) obj2);
        }
        return u890.j(componentType, Byte.TYPE) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : Arrays.equals((Object[]) obj, (Object[]) obj2);
    }

    public static final int q(Object obj) {
        int iHashCode;
        HubsImmutableComponentBundle hubsImmutableComponentBundle = HubsImmutableComponentBundle.b;
        Class<?> componentType = obj.getClass().getComponentType();
        if (u890.j(componentType, String.class)) {
            iHashCode = Arrays.hashCode((String[]) obj);
        } else if (u890.j(componentType, Long.TYPE)) {
            iHashCode = Arrays.hashCode((long[]) obj);
        } else if (u890.j(componentType, Double.TYPE)) {
            iHashCode = Arrays.hashCode((double[]) obj);
        } else if (u890.j(componentType, Boolean.TYPE)) {
            iHashCode = Arrays.hashCode((boolean[]) obj);
        } else if ((obj instanceof Object[]) && (((Object[]) obj) instanceof HubsImmutableComponentBundle[])) {
            iHashCode = Arrays.hashCode((HubsImmutableComponentBundle[]) obj);
        } else if (u890.j(componentType, Integer.TYPE)) {
            iHashCode = Arrays.hashCode((int[]) obj);
        } else {
            iHashCode = u890.j(componentType, Float.TYPE) ? Arrays.hashCode((float[]) obj) : obj.hashCode();
        }
        return 31 + iHashCode;
    }

    public static final l420 r(Activity activity, utw0 utw0Var) {
        File cacheDir = activity.getCacheDir();
        String absolutePath = (cacheDir != null && ((cacheDir.isDirectory() && cacheDir.canWrite()) || (cacheDir.mkdirs() && cacheDir.isDirectory() && cacheDir.canWrite()))) ? cacheDir.getAbsolutePath() : null;
        if (absolutePath != null) {
            return ((oi) utw0Var.a).o(absolutePath, "pses_configuration");
        }
        eg.m("unable to access application cache directory");
        return null;
    }

    public static final float[] s(hah hahVar, hah hahVar2, int i) {
        float[] fArrA = dm5.f;
        if (i != 3) {
            return null;
        }
        boolean zX = jch0.x(hahVar.b, 12884901888L);
        boolean zX2 = jch0.x(hahVar2.b, 12884901888L);
        if (zX && zX2) {
            return null;
        }
        if (!zX && !zX2) {
            return null;
        }
        if (!zX) {
            hahVar = hahVar2;
        }
        fol1 fol1Var = ((je31) hahVar).d;
        float[] fArrA2 = zX ? fol1Var.a() : fArrA;
        if (zX2) {
            fArrA = fol1Var.a();
        }
        return new float[]{fArrA2[0] / fArrA[0], fArrA2[1] / fArrA[1], fArrA2[2] / fArrA[2]};
    }

    public static PendingIntent t(Context context) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(new ComponentName(context.getPackageName(), "com.spotify.mediasession.mediasession.receiver.MediaButtonReceiver"));
        intent.setPackage(context.getPackageName());
        try {
            return PendingIntent.getBroadcast(context.getApplicationContext(), 0, intent, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
        } catch (SecurityException e) {
            Logger.e(e, "Unable to create media button PendingIntent", new Object[0]);
            return null;
        }
    }

    public static HubsImmutableComponentBundle u() {
        return new HubsImmutableComponentBundle();
    }

    public static HubsImmutableComponentBundle v(HubsImmutableComponentBundle hubsImmutableComponentBundle) {
        return hubsImmutableComponentBundle == null ? new HubsImmutableComponentBundle() : hubsImmutableComponentBundle;
    }

    public static float w(float f) {
        int i = CircularVideoPreviewSpinner.f;
        return 1.0f - ((float) Math.pow(Math.abs(Math.sin((((double) f) * 3.141592653589793d) / 2.0d)), 2.0d));
    }

    public static scl x(hah hahVar) {
        return new scl(hahVar, hahVar, 1);
    }

    public boolean accept(Object obj) {
        return ((ksk) obj).c == le30.s1;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 16:
                int iOrdinal = ((sp91) obj).a.ordinal();
                if (iOrdinal == 0) {
                    return s7n0.a;
                }
                if (iOrdinal == 1) {
                    return s7n0.b;
                }
                if (iOrdinal == 2) {
                    return s7n0.c;
                }
                eg.o();
                return null;
            case 22:
                return ((Boolean) obj).booleanValue() ? r321.a : r321.b;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return o751.f((Throwable) obj);
            case 24:
                c481 c481Var = (c481) obj;
                List list = c481Var.b;
                int size = list.size();
                int i = c481Var.e;
                if (size > i) {
                    size = i;
                }
                return new c481(c481Var.a, list, c481Var.c, c481Var.d, c481Var.e, new t4z(size - list.size(), size), c481Var.g, c481Var.h, c481Var.i, c481Var.j);
            default:
                mmr0 mmr0Var = (mmr0) obj;
                return mtf1.b((PlayerState) mmr0Var.a, ((Boolean) mmr0Var.b).booleanValue(), true);
        }
    }

    public long c() {
        return 0L;
    }

    public Object convert(int i) {
        tp10 tp10Var = null;
        switch (this.a) {
            case 9:
                if (i == 0) {
                    tp10Var = rqz.b;
                } else if (i == 1) {
                    tp10Var = rqz.c;
                }
                return tp10Var == null ? rqz.d : tp10Var;
            case 10:
            default:
                clc0 clc0VarA = clc0.a(i);
                return clc0VarA == null ? clc0.N0 : clc0VarA;
            case 11:
                if (i == 0) {
                    tp10Var = tp10.FEED_ENTITY_SOURCE_UNSPECIFIED;
                } else if (i == 1) {
                    tp10Var = tp10.FEED_ENTITY_SOURCE_DM;
                } else if (i == 2) {
                    tp10Var = tp10.FEED_ENTITY_SOURCE_GROUP;
                } else if (i == 3) {
                    tp10Var = tp10.FEED_ENTITY_SOURCE_FOLLOWING;
                }
                return tp10Var == null ? tp10.UNRECOGNIZED : tp10Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:56:0x011d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0121  */
    /* JADX WARN: Code duplicated, block: B:86:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:89:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:91:0x0304  */
    /* JADX WARN: Code duplicated, block: B:94:0x0310  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    public void e(pst pstVar, Function0 function0, qim0 qim0Var, float f, b0k b0kVar, int i, int i2) {
        float f2;
        boolean z;
        qim0 qim0Var2;
        float f3;
        h311 h311VarV;
        qim0 qim0Var3;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z2;
        n4k n4kVar;
        String strO0;
        Integer num;
        af5 af5Var;
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(280241533);
        j06 j06Var = x340Var.a;
        int i4 = (i & 6) == 0 ? ((i & 8) == 0 ? x340Var.g(pstVar) : x340Var.i(pstVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= x340Var.i(function0) ? 32 : 16;
        }
        int i5 = i4 | 384;
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 3072) == 0) {
                f2 = f;
                i5 |= x340Var.d(f2) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if (x340Var.g(this)) {
                    i3 = 16384;
                } else {
                    i3 = 8192;
                }
                i5 |= i3;
            }
            if ((i5 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i5 & 1, z)) {
                if (i6 != 0) {
                    f2 = 1.0f;
                }
                qim0Var3 = nim0.a;
                qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
                uwr uwrVar = cbx.a;
                qim0 qim0VarB = uyn1.B(qim0VarF, cbx.b(x340Var).b.b * f2, cbx.b(x340Var).b.a * f2, cbx.b(x340Var).b.b * f2, 0.0f, 8);
                mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarB);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                z2 = x340Var.S;
                n4kVar = hmb0.t1;
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
                qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
                jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF2);
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
                hux huxVar = pstVar.a;
                zov0 zov0Var = cbx.b(x340Var).g;
                w0h1.a(huxVar, isl.a, u291.r(qim0Var3, 16.0f * f2), cbx.a(x340Var).b.a, 0L, false, x340Var, 56, 48);
                cvx cvxVar = cbx.b(x340Var).b;
                uwo1.e(cwl1.o0(x340Var, pstVar.b), uyn1.B(qim0Var3, 8.0f * f2, 0.0f, 0.0f, 0.0f, 14), cbx.d(x340Var).g, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
                x340Var.r(true);
                strO0 = cwl1.o0(x340Var, pstVar.c);
                num = pstVar.d;
                if (num == null && ihc1.h0(strO0, "{{LINK}}", false)) {
                    x340Var.i0(-1236360622);
                    String strO1 = cwl1.o0(x340Var, num.intValue());
                    int i7 = ((i5 >> 3) & 7168) | ((i5 << 3) & 896);
                    x340Var.i0(-2123285558);
                    StringBuilder sb = new StringBuilder(16);
                    ArrayList arrayListM = xvj1.m();
                    new ArrayList();
                    String strW = nhc1.W(strO0, "{{LINK}}", strO1);
                    int iW0 = ihc1.w0(strW, strO1, 0, false, 6);
                    if (strO1.length() == 0 || iW0 == -1) {
                        sb.append(strW);
                    } else {
                        int length = strO1.length() + iW0;
                        sb.append(strW);
                        pae1 pae1Var = new pae1(new zma1(cbx.a(x340Var).b.b, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.c, (Shadow) null, (PlatformSpanStyle) null, 61438), (zma1) null, 14);
                        boolean z3 = (((i7 & 896) ^ 384) > 256 && x340Var.g(function0)) || (i7 & 384) == 256;
                        Object objT = x340Var.T();
                        if (z3 || objT == fkj0.X) {
                            objT = new nbg(function0, (byte) 1);
                            x340Var.s0(objT);
                        }
                        arrayListM.add(new xe5(iW0, length, 8, new kjc0(strO1, pae1Var, (rjc0) objT), (String) null));
                    }
                    String string = sb.toString();
                    ArrayList arrayList = new ArrayList(arrayListM.size());
                    for (int iG = 0; iG < arrayListM.size(); iG = c13.g(sb, (xe5) arrayListM.get(iG), arrayList, iG, 1)) {
                    }
                    af5Var = new af5(string, arrayList);
                    x340Var.r(false);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1236171584);
                    x340Var.r(false);
                    af5Var = new af5(strO0);
                }
                uwr uwrVar2 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var).b;
                uwo1.d(af5Var, cbx.a(x340Var).b.b, uyn1.B(qim0Var3, 0.0f, 4.0f * f2, 0.0f, 0.0f, 13), cbx.d(x340Var).g, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var, 0, 0, 4080);
                x340Var = x340Var;
                x340Var.r(true);
                qim0Var2 = qim0Var3;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
            }
            f3 = f2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new fst(this, pstVar, function0, qim0Var2, f3, i, i2, (byte) 0);
            }
        }
        i5 = i4 | 3456;
        f2 = f;
        if ((i & 24576) != 0) {
            if (x340Var.g(this)) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            i5 |= i3;
        }
        if ((i5 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i5 & 1, z)) {
            if (i6 != 0) {
                f2 = 1.0f;
            }
            qim0Var3 = nim0.a;
            qim0 qim0VarF3 = u291.f(qim0Var3, 1.0f);
            uwr uwrVar3 = cbx.a;
            qim0 qim0VarB2 = uyn1.B(qim0VarF3, cbx.b(x340Var).b.b * f2, cbx.b(x340Var).b.a * f2, cbx.b(x340Var).b.b * f2, 0.0f, 8);
            mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0VarB2);
            hzj.A.getClass();
            if (j06Var != null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            z2 = x340Var.S;
            n4kVar = hmb0.t1;
            if (z2) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar5 = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar5);
            llj lljVar6 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar6);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            llj lljVar7 = y580.R0;
            nko1.H(numValueOf2, x340Var, lljVar7);
            nko1.F(x340Var);
            llj lljVar8 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar8);
            qim0 qim0VarF4 = u291.f(qim0Var3, 1.0f);
            jw31 jw31VarA2 = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarF4);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA2, x340Var, lljVar5);
            nko1.H(xos0VarM3, x340Var, lljVar6);
            x0d.q(iHashCode3, x340Var, lljVar7, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar8);
            hux huxVar2 = pstVar.a;
            zov0 zov0Var2 = cbx.b(x340Var).g;
            w0h1.a(huxVar2, isl.a, u291.r(qim0Var3, 16.0f * f2), cbx.a(x340Var).b.a, 0L, false, x340Var, 56, 48);
            cvx cvxVar3 = cbx.b(x340Var).b;
            uwo1.e(cwl1.o0(x340Var, pstVar.b), uyn1.B(qim0Var3, 8.0f * f2, 0.0f, 0.0f, 0.0f, 14), cbx.d(x340Var).g, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
            x340Var.r(true);
            strO0 = cwl1.o0(x340Var, pstVar.c);
            num = pstVar.d;
            if (num == null) {
                x340Var.i0(-1236171584);
                x340Var.r(false);
                af5Var = new af5(strO0);
            } else {
                x340Var.i0(-1236171584);
                x340Var.r(false);
                af5Var = new af5(strO0);
            }
            uwr uwrVar4 = cbx.a;
            cvx cvxVar4 = cbx.b(x340Var).b;
            uwo1.d(af5Var, cbx.a(x340Var).b.b, uyn1.B(qim0Var3, 0.0f, 4.0f * f2, 0.0f, 0.0f, 13), cbx.d(x340Var).g, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var, 0, 0, 4080);
            x340Var = x340Var;
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        f3 = f2;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new fst(this, pstVar, function0, qim0Var2, f3, i, i2, (byte) 0);
        }
    }

    public First e0(Object obj) {
        return s9x0.g((rqe1) obj);
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:74:0x0138  */
    /* JADX WARN: Code duplicated, block: B:75:0x013a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0143  */
    /* JADX WARN: Code duplicated, block: B:82:0x0191  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:87:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:88:0x01db  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:94:0x021f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0224  */
    /* JADX WARN: Code duplicated, block: B:99:0x022f  */
    public void f(tst tstVar, iu30 iu30Var, boolean z, qim0 qim0Var, float f, b0k b0kVar, int i, int i2) {
        int i3;
        float f2;
        boolean z2;
        x340 x340Var;
        float f3;
        h311 h311VarV;
        float f4;
        String strO0;
        boolean z3;
        boolean zG;
        Object objT;
        max maxVar;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        int i4;
        boolean z4;
        Object objT2;
        float f5;
        boolean z5;
        Object objT3;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-972938358);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? x340Var2.g(tstVar) : x340Var2.i(tstVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var2.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var2.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= x340Var2.i(qim0Var) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 == 0) {
            if ((i & 24576) == 0) {
                f2 = f;
                i3 |= x340Var2.d(f2) ? 16384 : 8192;
            }
            if ((i3 & 9363) != 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var2.Y(i3 & 1, z2)) {
                if (i5 != 0) {
                    f4 = 1.0f;
                } else {
                    f4 = f2;
                }
                strO0 = cwl1.o0(x340Var2, 2131954955);
                if ((i3 & 896) == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zG = z3 | x340Var2.g(strO0);
                objT = x340Var2.T();
                if (zG || objT == m4cVar) {
                    if (z) {
                        objT = jax.a;
                    } else {
                        objT = new hax(strO0);
                    }
                    x340Var2.s0(objT);
                }
                maxVar = (max) objT;
                mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
                iHashCode = Long.hashCode(x340Var2.T);
                xos0VarM = x340Var2.m();
                qim0VarE = zr7.E(x340Var2, qim0Var);
                hzj.A.getClass();
                if (x340Var2.a != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(hmb0.t1);
                } else {
                    x340Var2.v0();
                }
                nko1.H(mbhVarA, x340Var2, y580.O0);
                nko1.H(xos0VarM, x340Var2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                nko1.F(x340Var2);
                nko1.H(qim0VarE, x340Var2, y580.Y);
                idx idxVar = new idx();
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                nim0 nim0Var = nim0.a;
                qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, 8.0f * f4, 0.0f, 0.0f, 13);
                era eraVar = een.Q0;
                qim0 qim0VarM = ktd.m(eraVar, qim0VarB);
                i4 = i3 & 112;
                if (i4 == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objT2 = x340Var2.T();
                if (z4 || objT2 == m4cVar) {
                    objT2 = new hbs(iu30Var, (byte) 23);
                    x340Var2.s0(objT2);
                }
                z50 z50Var = z50.c;
                foo1.c(new gbx(z50Var, (Function0) objT2), idxVar, qim0VarM, maxVar, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(315451967, new gst(tstVar, (byte) 0), x340Var2), x340Var2, 0, 48, 2024);
                if (f4 < 1.0f) {
                    x340Var2.i0(1321803071);
                    cvx cvxVar2 = cbx.b(x340Var2).b;
                    f5 = 16.0f * f4;
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(1321875146);
                    f5 = cbx.b(x340Var2).b.e;
                    x340Var2.r(false);
                }
                float f6 = f5;
                ldx ldxVar = ldx.c;
                cvx cvxVar3 = cbx.b(x340Var2).b;
                qim0 qim0VarM2 = ktd.m(eraVar, uyn1.B(nim0Var, 0.0f, 4.0f * f4, 0.0f, f6, 5));
                if (i4 == 32) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                objT3 = x340Var2.T();
                if (z5 || objT3 == m4cVar) {
                    objT3 = new hbs(iu30Var, (byte) 24);
                    x340Var2.s0(objT3);
                }
                foo1.c(new gbx(z50Var, (Function0) objT3), ldxVar, qim0VarM2, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(1001983286, new gst(tstVar, (byte) 1), x340Var2), x340Var2, 0, 48, 2040);
                x340Var = x340Var2;
                x340Var.r(true);
                f3 = f4;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                f3 = f2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new hst(this, tstVar, iu30Var, z, qim0Var, f3, i, i2);
            }
        }
        i3 |= 24576;
        f2 = f;
        if ((i3 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (x340Var2.Y(i3 & 1, z2)) {
            if (i5 != 0) {
                f4 = 1.0f;
            } else {
                f4 = f2;
            }
            strO0 = cwl1.o0(x340Var2, 2131954955);
            if ((i3 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            zG = z3 | x340Var2.g(strO0);
            objT = x340Var2.T();
            if (zG) {
                if (z) {
                    objT = jax.a;
                } else {
                    objT = new hax(strO0);
                }
                x340Var2.s0(objT);
            } else {
                if (z) {
                    objT = jax.a;
                } else {
                    objT = new hax(strO0);
                }
                x340Var2.s0(objT);
            }
            maxVar = (max) objT;
            mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            iHashCode = Long.hashCode(x340Var2.T);
            xos0VarM = x340Var2.m();
            qim0VarE = zr7.E(x340Var2, qim0Var);
            hzj.A.getClass();
            if (x340Var2.a != null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            idx idxVar2 = new idx();
            uwr uwrVar2 = cbx.a;
            cvx cvxVar4 = cbx.b(x340Var2).b;
            nim0 nim0Var2 = nim0.a;
            qim0 qim0VarB2 = uyn1.B(nim0Var2, 0.0f, 8.0f * f4, 0.0f, 0.0f, 13);
            era eraVar2 = een.Q0;
            qim0 qim0VarM3 = ktd.m(eraVar2, qim0VarB2);
            i4 = i3 & 112;
            if (i4 == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            objT2 = x340Var2.T();
            if (z4) {
                objT2 = new hbs(iu30Var, (byte) 23);
                x340Var2.s0(objT2);
            } else {
                objT2 = new hbs(iu30Var, (byte) 23);
                x340Var2.s0(objT2);
            }
            z50 z50Var2 = z50.c;
            foo1.c(new gbx(z50Var2, (Function0) objT2), idxVar2, qim0VarM3, maxVar, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(315451967, new gst(tstVar, (byte) 0), x340Var2), x340Var2, 0, 48, 2024);
            if (f4 < 1.0f) {
                x340Var2.i0(1321803071);
                cvx cvxVar5 = cbx.b(x340Var2).b;
                f5 = 16.0f * f4;
                x340Var2.r(false);
            } else {
                x340Var2.i0(1321875146);
                f5 = cbx.b(x340Var2).b.e;
                x340Var2.r(false);
            }
            float f7 = f5;
            ldx ldxVar2 = ldx.c;
            cvx cvxVar6 = cbx.b(x340Var2).b;
            qim0 qim0VarM4 = ktd.m(eraVar2, uyn1.B(nim0Var2, 0.0f, 4.0f * f4, 0.0f, f7, 5));
            if (i4 == 32) {
                z5 = true;
            } else {
                z5 = false;
            }
            objT3 = x340Var2.T();
            if (z5) {
                objT3 = new hbs(iu30Var, (byte) 24);
                x340Var2.s0(objT3);
            } else {
                objT3 = new hbs(iu30Var, (byte) 24);
                x340Var2.s0(objT3);
            }
            foo1.c(new gbx(z50Var2, (Function0) objT3), ldxVar2, qim0VarM4, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(1001983286, new gst(tstVar, (byte) 1), x340Var2), x340Var2, 0, 48, 2040);
            x340Var = x340Var2;
            x340Var.r(true);
            f3 = f4;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            f3 = f2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hst(this, tstVar, iu30Var, z, qim0Var, f3, i, i2);
        }
    }

    public void g(String str, Integer num, Integer num2, qim0 qim0Var, b0k b0kVar, int i) {
        String str2;
        int i2;
        x340 x340Var;
        Object obj = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(52696865);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (x340Var2.g(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.g(num) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.g(num2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.i(qim0Var) ? 2048 : 1024;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var2.T();
            if (z || objT == obj) {
                objT = Uri.parse(str2);
                x340Var2.s0(objT);
            }
            Uri uri = (Uri) objT;
            xb10 xb10VarO = x4p1.o(x340Var2);
            boolean z2 = num == null || num2 == null;
            uri.getClass();
            ni7 ni7VarA = oi7.a(uri, (gw70) null, z2 ? xb10VarO : null, z2 ? yqi1.b : null, (jmr0) null, (jmr0) null, false, false, (j6m) null, (iu30) null, (iu30) null, (iu30) null, 0L, x340Var2, 0, 0, 131046);
            boolean zG = x340Var2.g(xb10VarO.a());
            Object objT2 = x340Var2.T();
            if (zG || objT2 == obj) {
                objT2 = ywo1.q(xb10VarO.a());
                x340Var2.s0(objT2);
            }
            u7h u7hVar = (u7h) objT2;
            uwr uwrVar = cbx.a;
            long j = ((yex) zex.a.d).e;
            boolean zG2 = x340Var2.g(u7hVar) | x340Var2.f(j);
            Object objT3 = x340Var2.T();
            float f = 1.0f;
            if (zG2 || objT3 == obj) {
                if (u7hVar != null) {
                    j = u7hVar.a;
                }
                float[] fArr = new float[3];
                Color.colorToHSV(z4p1.G(j), fArr);
                float f2 = fArr[0];
                float f3 = fArr[1];
                float f4 = fArr[2];
                int i3 = u7h.l;
                float f5 = f3 * 1.15f;
                if (f5 <= 1.0f) {
                    f = f5;
                }
                long jT = nfb.t(f2, f, f4 * 0.75f, u7h.c(j));
                float f6 = f3 * 0.85f;
                float f7 = f4 * 1.15f;
                if (f7 > f) {
                    f7 = 1.0f;
                }
                sls0 sls0Var = new sls0(jT, nfb.t(f2, f6, f7, u7h.c(j)));
                x340Var2.s0(sls0Var);
                objT3 = sls0Var;
            } else {
                f = 1.0f;
            }
            sls0 sls0Var2 = (sls0) objT3;
            long jE = num != null ? z4p1.e(num.intValue()) : sls0Var2.a;
            long jE2 = num2 != null ? z4p1.e(num2.intValue()) : sls0Var2.b;
            boolean zF = x340Var2.f(jE) | x340Var2.f(jE2);
            Object objT4 = x340Var2.T();
            if (zF || objT4 == obj) {
                objT4 = v9c.s(p7h.M(new u7h[]{new u7h(jE), new u7h(jE2)}), 0.0f, 0.0f, 14);
                x340Var2.s0(objT4);
            }
            qim0 qim0VarE = dug.e(qim0Var, (Brush) objT4, (hw61) null, 0.0f, 6);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarE);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE2, x340Var2, y580.Y);
            eso1.h(ni7VarA, isl.a, i1p1.q(d7e.r(f, u291.f(nim0.a, 0.515f), false), er31.b(12.0f)), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, x340Var2, 224304, 448);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kyq((byte) 3, i, (Object) this, (Object) str2, (Object) num, (Object) num2, (Object) qim0Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:57:0x009e  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:70:0x0105  */
    /* JADX WARN: Code duplicated, block: B:72:0x010d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0117  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    public void h(String str, sst sstVar, qim0 qim0Var, boolean z, b0k b0kVar, int i, int i2) throws NoWhenBranchMatchedException {
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        h311 h311VarV;
        qim0 qim0VarR;
        boolean z5;
        Object objT;
        int i4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1701418785);
        if ((i & 6) == 0) {
            i3 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? x340Var.g(sstVar) : x340Var.i(sstVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                i3 |= x340Var.h(z2) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if (x340Var.g(this)) {
                    i4 = 16384;
                } else {
                    i4 = 8192;
                }
                i3 |= i4;
            }
            if ((i3 & 9363) != 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i3 & 1, z3)) {
                if (i5 != 0) {
                    z4 = false;
                } else {
                    z4 = z2;
                }
                qim0VarR = d7e.r(1.25f, qim0Var, z4);
                if (sstVar instanceof rst) {
                    x340Var.i0(-2057448741);
                    z5 = (i3 & 14) == 4;
                    objT = x340Var.T();
                    if (z5 || objT == fkj0.X) {
                        objT = Uri.parse(str);
                        x340Var.s0(objT);
                    }
                    Uri uri = (Uri) objT;
                    uri.getClass();
                    eso1.e(uri, isl.a, qim0VarR, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 196656, 0, 4056);
                    x340Var = x340Var;
                    x340Var.r(false);
                } else {
                    if (sstVar instanceof qst) {
                        throw p3d1.k(x340Var, 1319101180, false);
                    }
                    x340Var.i0(1319115651);
                    qst qstVar = (qst) sstVar;
                    g(str, qstVar.a, qstVar.b, qim0VarR, x340Var, i3 & 57358);
                    x340Var.r(false);
                }
            } else {
                x340Var.b0();
                z4 = z2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new oia(this, str, sstVar, qim0Var, z4, i, i2);
            }
        }
        i3 |= 3072;
        z2 = z;
        if ((i & 24576) != 0) {
            if (x340Var.g(this)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
        }
        if ((i3 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (x340Var.Y(i3 & 1, z3)) {
            if (i5 != 0) {
                z4 = false;
            } else {
                z4 = z2;
            }
            qim0VarR = d7e.r(1.25f, qim0Var, z4);
            if (sstVar instanceof rst) {
                x340Var.i0(-2057448741);
                if ((i3 & 14) == 4) {
                }
                objT = x340Var.T();
                if (z5) {
                    objT = Uri.parse(str);
                    x340Var.s0(objT);
                } else {
                    objT = Uri.parse(str);
                    x340Var.s0(objT);
                }
                Uri uri2 = (Uri) objT;
                uri2.getClass();
                eso1.e(uri2, isl.a, qim0VarR, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 196656, 0, 4056);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                if (sstVar instanceof qst) {
                    throw p3d1.k(x340Var, 1319101180, false);
                }
                x340Var.i0(1319115651);
                qst qstVar2 = (qst) sstVar;
                g(str, qstVar2.a, qstVar2.b, qim0VarR, x340Var, i3 & 57358);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
            z4 = z2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new oia(this, str, sstVar, qim0Var, z4, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
    public void i(tst tstVar, qim0 qim0Var, float f, b0k b0kVar, int i, int i2) {
        int i3;
        float f2;
        boolean z;
        b0k b0kVar2;
        qim0 qim0Var2;
        float f3;
        h311 h311VarV;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1310333500);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? b0kVar3.g(tstVar) : b0kVar3.i(tstVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i3 | 48;
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                f2 = f;
                i4 |= b0kVar3.d(f2) ? 256 : 128;
            }
            if ((i4 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i4 & 1, z)) {
                if (i5 != 0) {
                    f2 = 1.0f;
                }
                qim0 qim0Var3 = nim0.a;
                qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(b0kVar3).b;
                float f4 = 16.0f * f2;
                float f5 = cbx.b(b0kVar3).b.d * f2;
                cvx cvxVar2 = cbx.b(b0kVar3).b;
                cvx cvxVar3 = cbx.b(b0kVar3).b;
                b0kVar2 = b0kVar3;
                uwo1.e(cwl1.o0(b0kVar3, 2131954949), uyn1.A(qim0VarF, f4, f5, f4, 8.0f * f2), cbx.d(b0kVar3).e, cbx.a(b0kVar3).b.a, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2016);
                qim0Var2 = qim0Var3;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var2 = qim0Var;
            }
            f3 = f2;
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new ekr(this, tstVar, qim0Var2, f3, i, i2, (byte) 1);
            }
        }
        i4 = i3 | 432;
        f2 = f;
        if ((i4 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar3.Y(i4 & 1, z)) {
            if (i5 != 0) {
                f2 = 1.0f;
            }
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarF2 = u291.f(qim0Var4, 1.0f);
            uwr uwrVar2 = cbx.a;
            cvx cvxVar4 = cbx.b(b0kVar3).b;
            float f6 = 16.0f * f2;
            float f7 = cbx.b(b0kVar3).b.d * f2;
            cvx cvxVar5 = cbx.b(b0kVar3).b;
            cvx cvxVar6 = cbx.b(b0kVar3).b;
            b0kVar2 = b0kVar3;
            uwo1.e(cwl1.o0(b0kVar3, 2131954949), uyn1.A(qim0VarF2, f6, f7, f6, 8.0f * f2), cbx.d(b0kVar3).e, cbx.a(b0kVar3).b.a, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2016);
            qim0Var2 = qim0Var4;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        f3 = f2;
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ekr(this, tstVar, qim0Var2, f3, i, i2, (byte) 1);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void j(tst tstVar, iu30 iu30Var, boolean z, Function0 function0, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        Function0 function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-745501534);
        j06 j06Var = x340Var.a;
        int i2 = (i & 6) == 0 ? ((i & 8) == 0 ? x340Var.g(tstVar) : x340Var.i(tstVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(function0) ? 2048 : 1024;
        }
        int i3 = i & 24576;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.i(nim0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.g(this) ? 131072 : 65536;
        }
        int i4 = i2;
        if (x340Var.Y(i4 & 1, (74899 & i4) != 74898)) {
            float f = ((Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a)).screenHeightDp < 480 ? 0.7f : 1.0f;
            float f2 = 0.33f * f;
            es41 es41VarC = l6o1.C(0, 0, 1, x340Var);
            int i5 = i4 >> 6;
            k(es41VarC, function0, x340Var, (i5 & 112) | ((i4 >> 9) & 896));
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            Function0 function2 = hmb0.t1;
            if (z2) {
                x340Var.l(function2);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            String str = tstVar.a;
            sst sstVar = tstVar.b;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarX = uyn1.x(nim0Var, 16.0f * f);
            if (f2 <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            qim0 qim0VarThen = qim0VarX.then(new wnb0(f2 > Float.MAX_VALUE ? Float.MAX_VALUE : f2, true));
            int i6 = (i4 >> 3) & 57344;
            h(str, sstVar, qim0VarThen, true, x340Var, i6 | 3072, 0);
            qim0 qim0VarC = u291.c(nim0Var, 1.0f);
            float f3 = 1.0f - f2;
            if (f3 <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            if (f3 > Float.MAX_VALUE) {
                f3 = Float.MAX_VALUE;
            }
            qim0 qim0VarThen2 = qim0VarC.then(new wnb0(f3, true));
            era eraVar = een.P0;
            mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarThen2);
            x340Var.m0();
            if (x340Var.S) {
                function1 = function2;
                x340Var.l(function1);
            } else {
                function1 = function2;
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            qim0 qim0VarH = l6o1.H(kx40.h(1.0f, u291.f(nim0Var, 1.0f), true), es41VarC, false, 14);
            mbh mbhVarA2 = jbh.a(h36.e, eraVar, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarH);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            float f4 = f;
            i(tstVar, null, f4, x340Var, (i4 & 14) | (i5 & 7168), 2);
            x340Var.i0(822175784);
            for (pst pstVar : tstVar.c) {
                boolean z3 = (i4 & 112) == 32;
                Object objT = x340Var.T();
                if (z3 || objT == fkj0.X) {
                    objT = new hbs(iu30Var, (byte) 25);
                    x340Var.s0(objT);
                }
                float f5 = f4;
                e(pstVar, (Function0) objT, null, f5, x340Var, 8 | i6, 4);
                f4 = f5;
            }
            x340Var.r(false);
            x340Var.r(true);
            f(tstVar, iu30Var, z, u291.f(nim0Var, 1.0f), f4, x340Var, i4 & 459774, 0);
            x340Var = x340Var;
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ist(this, tstVar, iu30Var, z, function0, i, (byte) 0);
        }
    }

    public void k(es41 es41Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-443401725);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(es41Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean zI = x340Var.i(es41Var) | ((i2 & 112) == 32);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new n5s(function0, es41Var, (lnm) null, (byte) 21);
                x340Var.s0(objT);
            }
            qxd0.t(es41Var, x340Var, (vu30) objT);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x8t((Object) this, (Object) es41Var, (Object) function0, i, (byte) 3);
        }
    }

    public irn0 l(Intent intent, th61 th61Var) {
        return qv3.b(intent, th61Var, nik1.P3);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void m(tst tstVar, iu30 iu30Var, boolean z, Function0 function0, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(727148062);
        j06 j06Var = x340Var.a;
        int i2 = (i & 6) == 0 ? ((i & 8) == 0 ? x340Var.g(tstVar) : x340Var.i(tstVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(function0) ? 2048 : 1024;
        }
        int i3 = i & 24576;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.i(nim0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.g(this) ? 131072 : 65536;
        }
        int i4 = i2;
        if (x340Var.Y(i4 & 1, (74899 & i4) != 74898)) {
            es41 es41VarC = l6o1.C(0, 0, 1, x340Var);
            int i5 = i4 >> 6;
            k(es41VarC, function0, x340Var, ((i4 >> 9) & 896) | (i5 & 112));
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
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
            int i6 = (i4 >> 3) & 57344;
            h(tstVar.a, tstVar.b, u291.f(nim0Var, 1.0f), false, x340Var, i6, 8);
            i(tstVar, null, 0.0f, x340Var, (i4 & 14) | (i5 & 7168), 6);
            boolean z3 = true;
            qim0 qim0VarH = l6o1.H(kx40.h(1.0f, u291.f(nim0Var, 1.0f), true), es41VarC, false, 14);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarH);
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
            x340Var.i0(1176537493);
            for (pst pstVar : tstVar.c) {
                boolean z4 = (i4 & 112) == 32 ? z3 : false;
                Object objT = x340Var.T();
                if (z4 || objT == fkj0.X) {
                    objT = new hbs(iu30Var, (byte) 26);
                    x340Var.s0(objT);
                }
                e(pstVar, (Function0) objT, null, 0.0f, x340Var, 8 | i6, 12);
                z3 = z3;
            }
            boolean z5 = z3;
            x340Var.r(false);
            x340Var.r(z5);
            f(tstVar, iu30Var, z, u291.f(nim0Var, 1.0f), 0.0f, x340Var, i4 & 459774, 16);
            x340Var = x340Var;
            x340Var.r(z5);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ist(this, tstVar, iu30Var, z, function0, i, (byte) 1);
        }
    }

    public void n(tst tstVar, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1898328251);
        int i2 = i | (x340Var.g(tstVar) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.g(this) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object[] objArr = new Object[0];
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = u6t.i;
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) k5p1.s(objArr, (Function0) objT, x340Var, 48);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = new iwr(ven0Var, (byte) 4);
                x340Var.s0(objT2);
            }
            Function0 function0 = (Function0) objT2;
            if (((Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a)).orientation == 2) {
                x340Var.i0(1262934578);
                j(tstVar, iu30Var, ((Boolean) ven0Var.getValue()).booleanValue(), function0, x340Var, ((i2 << 6) & 458752) | (i2 & 14) | 3072 | (i2 & 112) | 24576);
                x340Var.r(false);
            } else {
                x340Var.i0(1263151795);
                m(tstVar, iu30Var, ((Boolean) ven0Var.getValue()).booleanValue(), function0, x340Var, ((i2 << 6) & 458752) | (i2 & 14) | 3072 | (i2 & 112) | 24576);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new won((byte) 20, i, (Object) this, (Object) tstVar, iu30Var);
        }
    }

    public boolean test(Object obj) {
        return !c6b1.a((PlayerState) obj);
    }

    public /* synthetic */ lqc(byte b) {
        this.a = b;
    }

    public void a() {
    }

    public void b(Intent intent) {
    }

    public void d(int i, Object obj) {
    }
}
