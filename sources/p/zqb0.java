package p;

import android.app.Activity;
import androidx.media3.exoplayer.ExoTimeoutException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.video.MediaCodecVideoDecoderException;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zqb0 implements iu30 {
    public final /* synthetic */ byte a;
    public static final zqb0 b = new zqb0(0);
    public static final zqb0 c = new zqb0(1);
    public static final zqb0 d = new zqb0(2);
    public static final zqb0 e = new zqb0(3);
    public static final zqb0 f = new zqb0(4);
    public static final zqb0 g = new zqb0(5);
    public static final zqb0 h = new zqb0(6);
    public static final zqb0 i = new zqb0(7);
    public static final zqb0 t = new zqb0(8);
    public static final zqb0 X = new zqb0(9);
    public static final zqb0 Y = new zqb0(10);
    public static final zqb0 Z = new zqb0(11);
    public static final zqb0 N0 = new zqb0(12);
    public static final zqb0 O0 = new zqb0(13);
    public static final zqb0 P0 = new zqb0(14);
    public static final zqb0 Q0 = new zqb0(15);
    public static final zqb0 R0 = new zqb0(16);
    public static final zqb0 S0 = new zqb0(17);
    public static final zqb0 T0 = new zqb0(18);
    public static final zqb0 U0 = new zqb0(19);
    public static final zqb0 V0 = new zqb0(20);
    public static final zqb0 W0 = new zqb0(21);
    public static final zqb0 X0 = new zqb0(22);
    public static final zqb0 Y0 = new zqb0(23);
    public static final zqb0 Z0 = new zqb0(24);
    public static final zqb0 a1 = new zqb0(25);
    public static final zqb0 b1 = new zqb0(26);
    public static final zqb0 c1 = new zqb0(27);
    public static final zqb0 d1 = new zqb0(28);
    public static final zqb0 e1 = new zqb0(29);

    public /* synthetic */ zqb0(byte b2) {
        this.a = b2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj) {
        qx81 qx81VarM;
        gmh1 gmh1VarA;
        a8b0 returnType;
        heg hegVarF;
        a8b0 returnType2;
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        boolean zB = false;
        switch (b2) {
            case 0:
                int i2 = brb0.f4p;
                jfg jfgVarS = ((a8b0) obj).t0().s();
                if (jfgVarS instanceof beg) {
                    return (beg) jfgVarS;
                }
                return null;
            case 1:
                ((Number) obj).intValue();
                return null;
            case 2:
                ((Number) obj).intValue();
                return null;
            case 3:
                return rih1Var;
            case 4:
                rh20 rh20Var = rh20.O0;
                return Boolean.TRUE;
            case 5:
                return Boolean.valueOf(obj instanceof Activity);
            case 6:
                return rih1Var;
            case 7:
                return rih1Var;
            case 8:
                List list = cmq0.a;
                tsi1 tsi1Var = (tsi1) o7h.C0(((ov30) obj).F());
                if (tsi1Var == null || kht.a(tsi1Var) || tsi1Var.X != null) {
                    return "last parameter should not have a default value or be a vararg";
                }
                return null;
            case 9:
                ov30 ov30Var = (ov30) obj;
                List list2 = cmq0.a;
                n9r n9rVarK = ov30Var.k();
                if (n9rVarK instanceof beg) {
                    ajn0 ajn0Var = g6b0.e;
                    if (g6b0.b((beg) n9rVarK, rfb1.a)) {
                        return null;
                    }
                }
                Collection collectionL = ov30Var.l();
                if (!collectionL.isEmpty()) {
                    Iterator it = collectionL.iterator();
                    while (it.hasNext()) {
                        n9r n9rVarK2 = ((ov30) it.next()).k();
                        if (n9rVarK2 instanceof beg) {
                            ajn0 ajn0Var2 = g6b0.e;
                            if (g6b0.b((beg) n9rVarK2, rfb1.a)) {
                                return null;
                            }
                        }
                    }
                }
                n9r n9rVarK3 = ov30Var.k();
                beg begVar = n9rVarK3 instanceof beg ? (beg) n9rVarK3 : null;
                if (begVar != null) {
                    if (!vf80.b(begVar)) {
                        begVar = null;
                    }
                    if (begVar != null && (qx81VarM = begVar.m()) != null && (gmh1VarA = rzn1.A(qx81VarM)) != null && (returnType = ov30Var.getReturnType()) != null && u890.j(((o9r) ov30Var).getName(), dmq0.d)) {
                        ajn0 ajn0Var3 = g6b0.e;
                        if ((g6b0.C(returnType, rfb1.h) || g6b0.F(returnType)) && ov30Var.F().size() == 1 && u890.j(rzn1.A(((tsi1) ov30Var.F().get(0)).getType()), gmh1VarA) && ov30Var.g0().isEmpty() && ov30Var.L() == null) {
                            return null;
                        }
                    }
                }
                StringBuilder sb = new StringBuilder("must override ''equals()'' in Any");
                if (vf80.b(ov30Var.k())) {
                    sb.append(" or define ''equals(other: " + cht.d.U(rzn1.A(((beg) ov30Var.k()).m())) + "): Boolean''");
                }
                return sb.toString();
            case 10:
                ov30 ov30Var2 = (ov30) obj;
                List list3 = cmq0.a;
                rob0 rob0VarI = ov30Var2.I();
                if (rob0VarI == null) {
                    rob0VarI = ov30Var2.L();
                }
                if (rob0VarI != null) {
                    a8b0 returnType3 = ov30Var2.getReturnType();
                    if (returnType3 != null ? c8b0.a.b(returnType3, rob0VarI.getType()) : false) {
                        return null;
                    }
                    yl01 yl01VarX1 = rob0VarI.x1();
                    if (yl01VarX1 instanceof w380) {
                        beg begVar2 = ((w380) yl01VarX1).a;
                        if (begVar2.Z() && (hegVarF = kht.f(begVar2)) != null) {
                            jfg jfgVarI = x1p1.i(iht.c(begVar2), hegVarF);
                            jit jitVar = jfgVarI instanceof jit ? (jit) jfgVarI : null;
                            if (jitVar != null && (returnType2 = ov30Var2.getReturnType()) != null) {
                                zB = c8b0.a.b(returnType2, jitVar.x1());
                            }
                        }
                    }
                    if (zB) {
                        return null;
                    }
                }
                return "receiver must be a supertype of the return type";
            case 11:
                return ((ezq0) ((dzq0) obj)).f;
            case 12:
                return Boolean.valueOf(obj instanceof MediaCodecVideoDecoderException);
            case 13:
                return Boolean.valueOf(obj instanceof MediaCodecRenderer.DecoderInitializationException);
            case 14:
                return Boolean.valueOf(obj instanceof ExoTimeoutException);
            case 15:
                return Boolean.valueOf(obj instanceof wul1);
            case 16:
                return rih1Var;
            case 17:
                return "(raw) ".concat((String) obj);
            case 18:
                List list4 = bb11.a;
                Type ownerType = ((ParameterizedType) obj).getOwnerType();
                if (ownerType instanceof ParameterizedType) {
                    return (ParameterizedType) ownerType;
                }
                return null;
            case 19:
                List list5 = bb11.a;
                return f46.I(((ParameterizedType) obj).getActualTypeArguments());
            case 20:
                return Boolean.valueOf(((Class) obj).getSimpleName().length() == 0);
            case 21:
                String simpleName = ((Class) obj).getSimpleName();
                if (!ajn0.f(simpleName)) {
                    simpleName = null;
                }
                if (simpleName != null) {
                    return ajn0.e(simpleName);
                }
                return null;
            case 22:
                hc11 hc11Var = (hc11) obj;
                String name = hc11Var.getName();
                if (name == null) {
                    name = "_";
                }
                return name + ": " + hc11Var.t();
            case 23:
                return f4x0.r(((hc11) obj).t(), false);
            case 24:
                return f4x0.r(((hc11) obj).t(), false);
            case 25:
                return n8p1.v((ajn0) obj);
            case 26:
                return (String) obj;
            case 27:
                dd31 dd31Var = dd31.c;
                return ((g6b0) obj).t(tnw0.f);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                ed31 ed31Var = ed31.c;
                return ((g6b0) obj).t(tnw0.t);
            default:
                fd31 fd31Var = fd31.c;
                return ((g6b0) obj).x();
        }
    }
}
