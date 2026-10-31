package p;

import android.view.View;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.concertcampaignview.v1.CtaType;
import com.spotify.concertview.concertfeedview.v1.Item;
import com.spotify.concertview.concertfeedview.v1.Section;
import com.spotify.concertview.concertfeedview.v1.SectionCta;
import com.spotify.concertview.concertfeedview.v1.SectionMetadata;
import com.spotify.concertview.concertfeedview.v1.SectionTitle;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.Next;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn;
import j$.time.LocalDate;
import j$.time.format.DateTimeFormatter;
import j$.time.format.FormatStyle;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class xto {
    public static final j2i a = new j2i(-1131826196, new n75((byte) 13), false);
    public static b180 b;
    public static b180 c;

    public static final void a(rin0 rin0Var, xfx xfxVar, cce cceVar, sp00 sp00Var, v1k v1kVar, v1k v1kVar2, FlowableObserveOn flowableObserveOn, fbm fbmVar, eyh0 eyh0Var, v1r0 v1r0Var, h72 h72Var, u961 u961Var, FlowableMap flowableMap, oj80 oj80Var, boolean z, kp5 kp5Var, uy2 uy2Var, View view, qim0 qim0Var, es41 es41Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        qim0 qim0Var3;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1040453706);
        int i2 = i | (b0kVar3.i(rin0Var) ? 4 : 2) | (b0kVar3.i(xfxVar) ? 32 : 16) | (b0kVar3.i(cceVar) ? 256 : 128) | (b0kVar3.i(sp00Var) ? 2048 : 1024) | (b0kVar3.i(v1kVar) ? 16384 : 8192) | (b0kVar3.i(v1kVar2) ? 131072 : 65536) | (b0kVar3.i(flowableObserveOn) ? 1048576 : 524288) | (b0kVar3.i(fbmVar) ? 8388608 : 4194304) | (b0kVar3.i(eyh0Var) ? 67108864 : 33554432) | (b0kVar3.i(v1r0Var) ? 536870912 : 268435456);
        if (b0kVar3.Y(i2 & 1, ((i2 & 306783379) == 306783378 && (((((((((((b0kVar3.i(h72Var) ? (char) 4 : (char) 2) | (b0kVar3.i(u961Var) ? ' ' : (char) 16)) | (b0kVar3.i(flowableMap) ? (char) 256 : (char) 128)) | (b0kVar3.i(oj80Var) ? (char) 2048 : (char) 1024)) | (b0kVar3.h(z) ? (char) 16384 : (char) 8192)) | (b0kVar3.i(kp5Var) ? (char) 0 : (char) 0)) | (b0kVar3.i(uy2Var) ? (char) 0 : (char) 0)) | (b0kVar3.i(view) ? (char) 0 : (char) 0)) | 100663296) | (b0kVar3.i(es41Var) ? (char) 0 : (char) 0)) & 306783379) == 306783378) ? false : true)) {
            b0kVar3.d0();
            if ((i & 1) == 0 || b0kVar3.E()) {
                qim0Var3 = nim0.a;
            } else {
                b0kVar3.b0();
                qim0Var3 = qim0Var;
            }
            b0kVar3.s();
            boolean zG = b0kVar3.g(flowableMap);
            Object objT = b0kVar3.T();
            if (zG || objT == fkj0.X) {
                vbm[] vbmVarArr = q601.a;
                objT = rqt0.w(new kge(flowableMap), fw2.b1, rqt0.b);
                b0kVar3.s0(objT);
            }
            ven0 ven0VarJ = f4p1.j((mr20) objT, (Object) null, (iac0) null, b0kVar3, 48, 14);
            WeakHashMap weakHashMap = osl1.x;
            mih1 mih1Var = new mih1(lhc.g(b0kVar3).f, lhc.g(b0kVar3).e);
            float fM = dsa0.m(b0kVar3, 2131166806);
            qim0 qim0Var4 = qim0Var3;
            b0kVar2 = b0kVar3;
            j2i j2iVarR = apo.r(5707317, new n(rin0Var, xfxVar, cceVar, sp00Var, v1kVar, v1kVar2, flowableObserveOn, fbmVar, (byte) 5), b0kVar2);
            j2i j2iVarR2 = apo.r(-1036533996, new oj2((Object) rin0Var, (Object) eyh0Var, (Object) v1r0Var, (byte) 8), b0kVar2);
            j2i j2iVarR3 = apo.r(-2078775309, new ta5(rin0Var, uy2Var, u961Var, oj80Var, h72Var, kp5Var, ven0VarJ, (byte) 1), b0kVar2);
            j2i j2iVarR4 = apo.r(1173950674, new zs((Object) view, z, (Object) rin0Var, (byte) 5), b0kVar2);
            qim0 qim0VarD = u291.d(qim0Var4, 1.0f);
            uwr uwrVar = cbx.a;
            apo.a(mih1Var, fM, j2iVarR, j2iVarR2, j2iVarR3, j2iVarR4, l6o1.H(bmq0.L(dug.f(qim0VarD, cbx.a(b0kVar2).a.c, d4o1.a), k1o1.q(b0kVar2), (g6o0) null), es41Var, false, 14), b0kVar2, 224640);
            qim0Var2 = qim0Var4;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new yz2(rin0Var, xfxVar, cceVar, sp00Var, v1kVar, v1kVar2, flowableObserveOn, fbmVar, eyh0Var, v1r0Var, h72Var, u961Var, flowableMap, oj80Var, z, kp5Var, uy2Var, view, qim0Var2, es41Var, i);
        }
    }

    public static final void b(Function0 function0, Function0 function1, b0k b0kVar, int i) {
        Function0 function2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-62960222);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | (x340Var.i(function1) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            function2 = function0;
            mqo1.e(function2, null, null, jji.a, jji.b, apo.r(482526116, new bvk(function0, (byte) 19), x340Var), apo.r(-557765723, new bvk(function1, (byte) 20), x340Var), x340Var, (i2 & 14) | 1797120, 6);
        } else {
            function2 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n4d(function2, function1, i, (byte) 15);
        }
    }

    public static final void c(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        Function0 function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2020632411);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131957388);
            qim0 qim0Var2 = nim0.a;
            function1 = function0;
            lgo1.c(gti.a, function1, strO0, qim0Var2, 0, null, x340Var, ((i2 << 3) & 112) | 3078, 48);
            qim0Var = qim0Var2;
        } else {
            function1 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bb50(function1, qim0Var, i, (byte) 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01df A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:101:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:104:0x01fa A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:105:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:108:0x021a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:109:0x021c  */
    /* JADX WARN: Code duplicated, block: B:111:0x0226  */
    /* JADX WARN: Code duplicated, block: B:112:0x022d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0241  */
    /* JADX WARN: Code duplicated, block: B:124:0x024b  */
    /* JADX WARN: Code duplicated, block: B:127:0x0252  */
    /* JADX WARN: Code duplicated, block: B:130:0x027e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:133:0x0284  */
    /* JADX WARN: Code duplicated, block: B:136:0x02ae A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:137:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:140:0x02c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:141:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:144:0x02e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:145:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:148:0x0300 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:149:0x0302  */
    /* JADX WARN: Code duplicated, block: B:151:0x032c  */
    /* JADX WARN: Code duplicated, block: B:154:0x033a  */
    /* JADX WARN: Code duplicated, block: B:156:0x0244 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x006e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0072  */
    /* JADX WARN: Code duplicated, block: B:46:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code duplicated, block: B:53:0x008a  */
    /* JADX WARN: Code duplicated, block: B:55:0x008d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x0098  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:90:0x0127  */
    /* JADX WARN: Code duplicated, block: B:91:0x0134  */
    /* JADX WARN: Code duplicated, block: B:94:0x0148 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:97:0x014e  */
    public static final void d(iu30 iu30Var, ksl kslVar, iu30 iu30Var2, Function0 function0, Function0 function1, gm31 gm31Var, b0k b0kVar, int i, int i2) {
        int i3;
        iu30 iu30Var3;
        int i4;
        int i5;
        int i6;
        Function0 function2;
        int i7;
        boolean z;
        x340 x340Var;
        Function0 function3;
        iu30 iu30Var4;
        Function0 function4;
        h311 h311VarV;
        iu30 iu30Var5;
        Function0 function5;
        Function0 function6;
        hm31 hm31Var;
        Object objT;
        m4c m4cVar;
        tob1 tob1Var;
        ven0 ven0VarS;
        ven0 ven0VarS2;
        ven0 ven0VarS3;
        ven0 ven0VarS4;
        ven0 ven0VarS5;
        Object objT2;
        fjw0 fjw0Var;
        boolean zG;
        Object objT3;
        MobiusLoop mobiusLoop;
        boolean zI;
        Object objT4;
        boolean zG2;
        Object objT5;
        iu30 iu30Var6;
        boolean zG3;
        Object objT6;
        oi31 oi31Var;
        zj31 zj31VarA;
        ejw0 ejw0Var;
        Object objT7;
        ven0 ven0Var;
        boolean zI2;
        Object objT8;
        tob1 tob1Var2;
        boolean zI3;
        Object objT9;
        boolean zI4;
        Object objT10;
        boolean zI5;
        Object objT11;
        boolean zI6;
        Object objT12;
        boolean zI7;
        int i8;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(662838956);
        if ((i & 6) == 0) {
            i3 = (x340Var2.i(iu30Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var2.g(kslVar) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= x340Var2.i((Object) null) ? 256 : 128;
        }
        int i9 = i2 & 8;
        if (i9 == 0) {
            if ((i & 3072) == 0) {
                iu30Var3 = iu30Var2;
                i3 |= x340Var2.i(iu30Var3) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    if (x340Var2.i(function0)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((196608 & i) == 0) {
                        function2 = function1;
                        if (x340Var2.i(function2)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    if ((1572864 & i) == 0) {
                        if ((2097152 & i) == 0) {
                            zI7 = x340Var2.g(gm31Var);
                        } else {
                            zI7 = x340Var2.i(gm31Var);
                        }
                        if (zI7) {
                            i8 = 1048576;
                        } else {
                            i8 = 524288;
                        }
                        i3 |= i8;
                    }
                    if ((599187 & i3) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (x340Var2.Y(i3 & 1, z)) {
                        if (i9 != 0) {
                            iu30Var5 = null;
                        } else {
                            iu30Var5 = iu30Var3;
                        }
                        if (i4 != 0) {
                            function5 = null;
                        } else {
                            function5 = function0;
                        }
                        if (i6 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        int i10 = i3 & 4194302;
                        hm31Var = (hm31) gm31Var;
                        x340Var2.i0(1389916494);
                        objT = x340Var2.T();
                        m4cVar = fkj0.X;
                        if (objT == m4cVar) {
                            objT = v8r.q(new xuj1(uuj1.a, null, null, 0, hm31Var.d, false));
                            x340Var2.s0(objT);
                        }
                        tob1Var = (ven0) objT;
                        ven0VarS = v8r.s(iu30Var, x340Var2);
                        ven0VarS2 = v8r.s((Object) null, x340Var2);
                        ven0VarS3 = v8r.s(iu30Var5, x340Var2);
                        ven0VarS4 = v8r.s(function5, x340Var2);
                        ven0VarS5 = v8r.s(function6, x340Var2);
                        objT2 = x340Var2.T();
                        if (objT2 == m4cVar) {
                            objT2 = new fjw0(hm31Var.c);
                            x340Var2.s0(objT2);
                        }
                        fjw0Var = (fjw0) objT2;
                        zG = x340Var2.g(fjw0Var);
                        objT3 = x340Var2.T();
                        Function0 function7 = function5;
                        if (zG || objT3 == m4cVar) {
                            l8t0 l8t0Var = new l8t0(ven0VarS, (lnm) null, (byte) 11);
                            ti31 ti31Var = hm31Var.b;
                            CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
                            CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
                            usj1 usj1Var = new usj1(l8t0Var, fjw0Var);
                            jd11 jd11Var = rc11.a;
                            coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(osj1.class), runSequentially.a(usj1Var));
                            coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(nsj1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new wsj1(ti31Var, fjw0Var)));
                            coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(psj1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ysj1()));
                            objT3 = l1d.g(Mobius.d(gp71.v, new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI))).a((xuj1) tob1Var.getValue(), Collections.singleton(osj1.a));
                            x340Var2.s0(objT3);
                        }
                        mobiusLoop = (MobiusLoop) objT3;
                        zI = x340Var2.i(mobiusLoop) | x340Var2.i(tob1Var) | x340Var2.i(fjw0Var);
                        objT4 = x340Var2.T();
                        if (zI || objT4 == m4cVar) {
                            objT4 = new v721(mobiusLoop, tob1Var, fjw0Var, (byte) 16);
                            x340Var2.s0(objT4);
                        }
                        qxd0.i(mobiusLoop, (iu30) objT4, x340Var2);
                        zG2 = x340Var2.g(mobiusLoop);
                        objT5 = x340Var2.T();
                        if (zG2 || objT5 == m4cVar) {
                            objT5 = new zw11(mobiusLoop, (byte) 17);
                            x340Var2.s0(objT5);
                        }
                        iu30Var6 = (iu30) objT5;
                        zG3 = x340Var2.g(((xuj1) tob1Var.getValue()).c);
                        objT6 = x340Var2.T();
                        if (zG3 || objT6 == m4cVar) {
                            oi31Var = ((xuj1) tob1Var.getValue()).c;
                            if (oi31Var != null) {
                                zj31VarA = hm31Var.a.a(oi31Var);
                            } else {
                                zj31VarA = null;
                            }
                            x340Var2.s0(zj31VarA);
                            objT6 = zj31VarA;
                        }
                        wj31 wj31Var = (wj31) objT6;
                        if (((xuj1) tob1Var.getValue()).a instanceof suj1) {
                            synchronized (fjw0Var.b) {
                                ejw0Var = fjw0Var.c;
                            }
                        } else {
                            ejw0Var = null;
                        }
                        objT7 = x340Var2.T();
                        if (objT7 == m4cVar) {
                            objT7 = v8r.q((Object) null);
                            x340Var2.s0(objT7);
                        }
                        ven0Var = (ven0) objT7;
                        wuj1 wuj1Var = ((xuj1) tob1Var.getValue()).a;
                        zI2 = x340Var2.i(tob1Var) | x340Var2.i(ven0VarS2) | x340Var2.i(ven0Var) | x340Var2.i(ven0VarS3);
                        objT8 = x340Var2.T();
                        if (!zI2 || objT8 == m4cVar) {
                            tob1Var2 = tob1Var;
                            c6h0 c6h0Var = new c6h0(tob1Var2, ven0VarS2, ven0Var, ven0VarS3, (lnm) null, (byte) 23);
                            x340Var2.s0(c6h0Var);
                            objT8 = c6h0Var;
                        } else {
                            tob1Var2 = tob1Var;
                        }
                        qxd0.t(wuj1Var, x340Var2, (vu30) objT8);
                        xuj1 xuj1Var = (xuj1) tob1Var2.getValue();
                        zI3 = x340Var2.i(ven0VarS4);
                        objT9 = x340Var2.T();
                        if (zI3 || objT9 == m4cVar) {
                            objT9 = new g8y0(ven0VarS4, (byte) 10);
                            x340Var2.s0(objT9);
                        }
                        Function0 function8 = (Function0) objT9;
                        zI4 = x340Var2.i(ven0VarS5);
                        objT10 = x340Var2.T();
                        if (zI4 || objT10 == m4cVar) {
                            objT10 = new g8y0(ven0VarS5, (byte) 11);
                            x340Var2.s0(objT10);
                        }
                        Function0 function9 = (Function0) objT10;
                        zI5 = x340Var2.i(ejw0Var) | x340Var2.g(iu30Var6);
                        objT11 = x340Var2.T();
                        if (zI5 || objT11 == m4cVar) {
                            objT11 = new rl21(ejw0Var, iu30Var6);
                            x340Var2.s0(objT11);
                        }
                        Function0 function10 = (Function0) objT11;
                        zI6 = x340Var2.i(ejw0Var) | x340Var2.g(iu30Var6);
                        objT12 = x340Var2.T();
                        if (zI6 || objT12 == m4cVar) {
                            objT12 = new hf31(ejw0Var, iu30Var6, (byte) 2);
                            x340Var2.s0(objT12);
                        }
                        f4p1.b(xuj1Var, wj31Var, iu30Var6, (qim0) null, function8, function9, kslVar, function10, (iu30) objT12, x340Var2, (i10 << 15) & 3670016);
                        x340Var = x340Var2;
                        x340Var.r(false);
                        function4 = function6;
                        iu30Var4 = iu30Var5;
                        function3 = function7;
                    } else {
                        x340Var = x340Var2;
                        x340Var.b0();
                        function3 = function0;
                        iu30Var4 = iu30Var3;
                        function4 = function2;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new bd5(iu30Var, kslVar, iu30Var4, function3, function4, gm31Var, i, i2);
                    }
                }
                i3 |= 196608;
                function2 = function1;
                if ((1572864 & i) == 0) {
                    if ((2097152 & i) == 0) {
                        zI7 = x340Var2.g(gm31Var);
                    } else {
                        zI7 = x340Var2.i(gm31Var);
                    }
                    if (zI7) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i3 |= i8;
                }
                if ((599187 & i3) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var2.Y(i3 & 1, z)) {
                    if (i9 != 0) {
                        iu30Var5 = null;
                    } else {
                        iu30Var5 = iu30Var3;
                    }
                    if (i4 != 0) {
                        function5 = null;
                    } else {
                        function5 = function0;
                    }
                    if (i6 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    int i11 = i3 & 4194302;
                    hm31Var = (hm31) gm31Var;
                    x340Var2.i0(1389916494);
                    objT = x340Var2.T();
                    m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = v8r.q(new xuj1(uuj1.a, null, null, 0, hm31Var.d, false));
                        x340Var2.s0(objT);
                    }
                    tob1Var = (ven0) objT;
                    ven0VarS = v8r.s(iu30Var, x340Var2);
                    ven0VarS2 = v8r.s((Object) null, x340Var2);
                    ven0VarS3 = v8r.s(iu30Var5, x340Var2);
                    ven0VarS4 = v8r.s(function5, x340Var2);
                    ven0VarS5 = v8r.s(function6, x340Var2);
                    objT2 = x340Var2.T();
                    if (objT2 == m4cVar) {
                        objT2 = new fjw0(hm31Var.c);
                        x340Var2.s0(objT2);
                    }
                    fjw0Var = (fjw0) objT2;
                    zG = x340Var2.g(fjw0Var);
                    objT3 = x340Var2.T();
                    Function0 function11 = function5;
                    if (zG) {
                        l8t0 l8t0Var2 = new l8t0(ven0VarS, (lnm) null, (byte) 11);
                        ti31 ti31Var2 = hm31Var.b;
                        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI2 = kk0.i(MobiusCoroutines.a);
                        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially2 = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
                        usj1 usj1Var2 = new usj1(l8t0Var2, fjw0Var);
                        jd11 jd11Var2 = rc11.a;
                        coroutinesSubtypeEffectHandlerBuilderI2.a(jd11Var2.b(osj1.class), runSequentially2.a(usj1Var2));
                        coroutinesSubtypeEffectHandlerBuilderI2.a(jd11Var2.b(nsj1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new wsj1(ti31Var2, fjw0Var)));
                        coroutinesSubtypeEffectHandlerBuilderI2.a(jd11Var2.b(psj1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ysj1()));
                        objT3 = l1d.g(Mobius.d(gp71.v, new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI2))).a((xuj1) tob1Var.getValue(), Collections.singleton(osj1.a));
                        x340Var2.s0(objT3);
                    } else {
                        l8t0 l8t0Var3 = new l8t0(ven0VarS, (lnm) null, (byte) 11);
                        ti31 ti31Var3 = hm31Var.b;
                        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI3 = kk0.i(MobiusCoroutines.a);
                        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially3 = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
                        usj1 usj1Var3 = new usj1(l8t0Var3, fjw0Var);
                        jd11 jd11Var3 = rc11.a;
                        coroutinesSubtypeEffectHandlerBuilderI3.a(jd11Var3.b(osj1.class), runSequentially3.a(usj1Var3));
                        coroutinesSubtypeEffectHandlerBuilderI3.a(jd11Var3.b(nsj1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new wsj1(ti31Var3, fjw0Var)));
                        coroutinesSubtypeEffectHandlerBuilderI3.a(jd11Var3.b(psj1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ysj1()));
                        objT3 = l1d.g(Mobius.d(gp71.v, new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI3))).a((xuj1) tob1Var.getValue(), Collections.singleton(osj1.a));
                        x340Var2.s0(objT3);
                    }
                    mobiusLoop = (MobiusLoop) objT3;
                    zI = x340Var2.i(mobiusLoop) | x340Var2.i(tob1Var) | x340Var2.i(fjw0Var);
                    objT4 = x340Var2.T();
                    if (zI) {
                        objT4 = new v721(mobiusLoop, tob1Var, fjw0Var, (byte) 16);
                        x340Var2.s0(objT4);
                    } else {
                        objT4 = new v721(mobiusLoop, tob1Var, fjw0Var, (byte) 16);
                        x340Var2.s0(objT4);
                    }
                    qxd0.i(mobiusLoop, (iu30) objT4, x340Var2);
                    zG2 = x340Var2.g(mobiusLoop);
                    objT5 = x340Var2.T();
                    if (zG2) {
                        objT5 = new zw11(mobiusLoop, (byte) 17);
                        x340Var2.s0(objT5);
                    } else {
                        objT5 = new zw11(mobiusLoop, (byte) 17);
                        x340Var2.s0(objT5);
                    }
                    iu30Var6 = (iu30) objT5;
                    zG3 = x340Var2.g(((xuj1) tob1Var.getValue()).c);
                    objT6 = x340Var2.T();
                    if (zG3) {
                        oi31Var = ((xuj1) tob1Var.getValue()).c;
                        if (oi31Var != null) {
                            zj31VarA = hm31Var.a.a(oi31Var);
                        } else {
                            zj31VarA = null;
                        }
                        x340Var2.s0(zj31VarA);
                        objT6 = zj31VarA;
                    } else {
                        oi31Var = ((xuj1) tob1Var.getValue()).c;
                        if (oi31Var != null) {
                            zj31VarA = hm31Var.a.a(oi31Var);
                        } else {
                            zj31VarA = null;
                        }
                        x340Var2.s0(zj31VarA);
                        objT6 = zj31VarA;
                    }
                    wj31 wj31Var2 = (wj31) objT6;
                    if (((xuj1) tob1Var.getValue()).a instanceof suj1) {
                        synchronized (fjw0Var.b) {
                            ejw0Var = fjw0Var.c;
                        }
                    } else {
                        ejw0Var = null;
                    }
                    objT7 = x340Var2.T();
                    if (objT7 == m4cVar) {
                        objT7 = v8r.q((Object) null);
                        x340Var2.s0(objT7);
                    }
                    ven0Var = (ven0) objT7;
                    wuj1 wuj1Var2 = ((xuj1) tob1Var.getValue()).a;
                    zI2 = x340Var2.i(tob1Var) | x340Var2.i(ven0VarS2) | x340Var2.i(ven0Var) | x340Var2.i(ven0VarS3);
                    objT8 = x340Var2.T();
                    if (zI2) {
                        tob1Var2 = tob1Var;
                        c6h0 c6h0Var2 = new c6h0(tob1Var2, ven0VarS2, ven0Var, ven0VarS3, (lnm) null, (byte) 23);
                        x340Var2.s0(c6h0Var2);
                        objT8 = c6h0Var2;
                    } else {
                        tob1Var2 = tob1Var;
                        c6h0 c6h0Var3 = new c6h0(tob1Var2, ven0VarS2, ven0Var, ven0VarS3, (lnm) null, (byte) 23);
                        x340Var2.s0(c6h0Var3);
                        objT8 = c6h0Var3;
                    }
                    qxd0.t(wuj1Var2, x340Var2, (vu30) objT8);
                    xuj1 xuj1Var2 = (xuj1) tob1Var2.getValue();
                    zI3 = x340Var2.i(ven0VarS4);
                    objT9 = x340Var2.T();
                    if (zI3) {
                        objT9 = new g8y0(ven0VarS4, (byte) 10);
                        x340Var2.s0(objT9);
                    } else {
                        objT9 = new g8y0(ven0VarS4, (byte) 10);
                        x340Var2.s0(objT9);
                    }
                    Function0 function12 = (Function0) objT9;
                    zI4 = x340Var2.i(ven0VarS5);
                    objT10 = x340Var2.T();
                    if (zI4) {
                        objT10 = new g8y0(ven0VarS5, (byte) 11);
                        x340Var2.s0(objT10);
                    } else {
                        objT10 = new g8y0(ven0VarS5, (byte) 11);
                        x340Var2.s0(objT10);
                    }
                    Function0 function13 = (Function0) objT10;
                    zI5 = x340Var2.i(ejw0Var) | x340Var2.g(iu30Var6);
                    objT11 = x340Var2.T();
                    if (zI5) {
                        objT11 = new rl21(ejw0Var, iu30Var6);
                        x340Var2.s0(objT11);
                    } else {
                        objT11 = new rl21(ejw0Var, iu30Var6);
                        x340Var2.s0(objT11);
                    }
                    Function0 function14 = (Function0) objT11;
                    zI6 = x340Var2.i(ejw0Var) | x340Var2.g(iu30Var6);
                    objT12 = x340Var2.T();
                    if (zI6) {
                        objT12 = new hf31(ejw0Var, iu30Var6, (byte) 2);
                        x340Var2.s0(objT12);
                    } else {
                        objT12 = new hf31(ejw0Var, iu30Var6, (byte) 2);
                        x340Var2.s0(objT12);
                    }
                    f4p1.b(xuj1Var2, wj31Var2, iu30Var6, (qim0) null, function12, function13, kslVar, function14, (iu30) objT12, x340Var2, (i11 << 15) & 3670016);
                    x340Var = x340Var2;
                    x340Var.r(false);
                    function4 = function6;
                    iu30Var4 = iu30Var5;
                    function3 = function11;
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                    function3 = function0;
                    iu30Var4 = iu30Var3;
                    function4 = function2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new bd5(iu30Var, kslVar, iu30Var4, function3, function4, gm31Var, i, i2);
                }
            }
            i3 |= 24576;
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    function2 = function1;
                    if (x340Var2.i(function2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((1572864 & i) == 0) {
                    if ((2097152 & i) == 0) {
                        zI7 = x340Var2.g(gm31Var);
                    } else {
                        zI7 = x340Var2.i(gm31Var);
                    }
                    if (zI7) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i3 |= i8;
                }
                if ((599187 & i3) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var2.Y(i3 & 1, z)) {
                    if (i9 != 0) {
                        iu30Var5 = null;
                    } else {
                        iu30Var5 = iu30Var3;
                    }
                    if (i4 != 0) {
                        function5 = null;
                    } else {
                        function5 = function0;
                    }
                    if (i6 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    int i12 = i3 & 4194302;
                    hm31Var = (hm31) gm31Var;
                    x340Var2.i0(1389916494);
                    objT = x340Var2.T();
                    m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = v8r.q(new xuj1(uuj1.a, null, null, 0, hm31Var.d, false));
                        x340Var2.s0(objT);
                    }
                    tob1Var = (ven0) objT;
                    ven0VarS = v8r.s(iu30Var, x340Var2);
                    ven0VarS2 = v8r.s((Object) null, x340Var2);
                    ven0VarS3 = v8r.s(iu30Var5, x340Var2);
                    ven0VarS4 = v8r.s(function5, x340Var2);
                    ven0VarS5 = v8r.s(function6, x340Var2);
                    objT2 = x340Var2.T();
                    if (objT2 == m4cVar) {
                        objT2 = new fjw0(hm31Var.c);
                        x340Var2.s0(objT2);
                    }
                    fjw0Var = (fjw0) objT2;
                    zG = x340Var2.g(fjw0Var);
                    objT3 = x340Var2.T();
                    Function0 function15 = function5;
                    if (zG) {
                        l8t0 l8t0Var4 = new l8t0(ven0VarS, (lnm) null, (byte) 11);
                        ti31 ti31Var4 = hm31Var.b;
                        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI4 = kk0.i(MobiusCoroutines.a);
                        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially4 = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
                        usj1 usj1Var4 = new usj1(l8t0Var4, fjw0Var);
                        jd11 jd11Var4 = rc11.a;
                        coroutinesSubtypeEffectHandlerBuilderI4.a(jd11Var4.b(osj1.class), runSequentially4.a(usj1Var4));
                        coroutinesSubtypeEffectHandlerBuilderI4.a(jd11Var4.b(nsj1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new wsj1(ti31Var4, fjw0Var)));
                        coroutinesSubtypeEffectHandlerBuilderI4.a(jd11Var4.b(psj1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ysj1()));
                        objT3 = l1d.g(Mobius.d(gp71.v, new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI4))).a((xuj1) tob1Var.getValue(), Collections.singleton(osj1.a));
                        x340Var2.s0(objT3);
                    } else {
                        l8t0 l8t0Var5 = new l8t0(ven0VarS, (lnm) null, (byte) 11);
                        ti31 ti31Var5 = hm31Var.b;
                        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI5 = kk0.i(MobiusCoroutines.a);
                        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially5 = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
                        usj1 usj1Var5 = new usj1(l8t0Var5, fjw0Var);
                        jd11 jd11Var5 = rc11.a;
                        coroutinesSubtypeEffectHandlerBuilderI5.a(jd11Var5.b(osj1.class), runSequentially5.a(usj1Var5));
                        coroutinesSubtypeEffectHandlerBuilderI5.a(jd11Var5.b(nsj1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new wsj1(ti31Var5, fjw0Var)));
                        coroutinesSubtypeEffectHandlerBuilderI5.a(jd11Var5.b(psj1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ysj1()));
                        objT3 = l1d.g(Mobius.d(gp71.v, new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI5))).a((xuj1) tob1Var.getValue(), Collections.singleton(osj1.a));
                        x340Var2.s0(objT3);
                    }
                    mobiusLoop = (MobiusLoop) objT3;
                    zI = x340Var2.i(mobiusLoop) | x340Var2.i(tob1Var) | x340Var2.i(fjw0Var);
                    objT4 = x340Var2.T();
                    if (zI) {
                        objT4 = new v721(mobiusLoop, tob1Var, fjw0Var, (byte) 16);
                        x340Var2.s0(objT4);
                    } else {
                        objT4 = new v721(mobiusLoop, tob1Var, fjw0Var, (byte) 16);
                        x340Var2.s0(objT4);
                    }
                    qxd0.i(mobiusLoop, (iu30) objT4, x340Var2);
                    zG2 = x340Var2.g(mobiusLoop);
                    objT5 = x340Var2.T();
                    if (zG2) {
                        objT5 = new zw11(mobiusLoop, (byte) 17);
                        x340Var2.s0(objT5);
                    } else {
                        objT5 = new zw11(mobiusLoop, (byte) 17);
                        x340Var2.s0(objT5);
                    }
                    iu30Var6 = (iu30) objT5;
                    zG3 = x340Var2.g(((xuj1) tob1Var.getValue()).c);
                    objT6 = x340Var2.T();
                    if (zG3) {
                        oi31Var = ((xuj1) tob1Var.getValue()).c;
                        if (oi31Var != null) {
                            zj31VarA = hm31Var.a.a(oi31Var);
                        } else {
                            zj31VarA = null;
                        }
                        x340Var2.s0(zj31VarA);
                        objT6 = zj31VarA;
                    } else {
                        oi31Var = ((xuj1) tob1Var.getValue()).c;
                        if (oi31Var != null) {
                            zj31VarA = hm31Var.a.a(oi31Var);
                        } else {
                            zj31VarA = null;
                        }
                        x340Var2.s0(zj31VarA);
                        objT6 = zj31VarA;
                    }
                    wj31 wj31Var3 = (wj31) objT6;
                    if (((xuj1) tob1Var.getValue()).a instanceof suj1) {
                        synchronized (fjw0Var.b) {
                            ejw0Var = fjw0Var.c;
                        }
                    } else {
                        ejw0Var = null;
                    }
                    objT7 = x340Var2.T();
                    if (objT7 == m4cVar) {
                        objT7 = v8r.q((Object) null);
                        x340Var2.s0(objT7);
                    }
                    ven0Var = (ven0) objT7;
                    wuj1 wuj1Var3 = ((xuj1) tob1Var.getValue()).a;
                    zI2 = x340Var2.i(tob1Var) | x340Var2.i(ven0VarS2) | x340Var2.i(ven0Var) | x340Var2.i(ven0VarS3);
                    objT8 = x340Var2.T();
                    if (zI2) {
                        tob1Var2 = tob1Var;
                        c6h0 c6h0Var4 = new c6h0(tob1Var2, ven0VarS2, ven0Var, ven0VarS3, (lnm) null, (byte) 23);
                        x340Var2.s0(c6h0Var4);
                        objT8 = c6h0Var4;
                    } else {
                        tob1Var2 = tob1Var;
                        c6h0 c6h0Var5 = new c6h0(tob1Var2, ven0VarS2, ven0Var, ven0VarS3, (lnm) null, (byte) 23);
                        x340Var2.s0(c6h0Var5);
                        objT8 = c6h0Var5;
                    }
                    qxd0.t(wuj1Var3, x340Var2, (vu30) objT8);
                    xuj1 xuj1Var3 = (xuj1) tob1Var2.getValue();
                    zI3 = x340Var2.i(ven0VarS4);
                    objT9 = x340Var2.T();
                    if (zI3) {
                        objT9 = new g8y0(ven0VarS4, (byte) 10);
                        x340Var2.s0(objT9);
                    } else {
                        objT9 = new g8y0(ven0VarS4, (byte) 10);
                        x340Var2.s0(objT9);
                    }
                    Function0 function16 = (Function0) objT9;
                    zI4 = x340Var2.i(ven0VarS5);
                    objT10 = x340Var2.T();
                    if (zI4) {
                        objT10 = new g8y0(ven0VarS5, (byte) 11);
                        x340Var2.s0(objT10);
                    } else {
                        objT10 = new g8y0(ven0VarS5, (byte) 11);
                        x340Var2.s0(objT10);
                    }
                    Function0 function17 = (Function0) objT10;
                    zI5 = x340Var2.i(ejw0Var) | x340Var2.g(iu30Var6);
                    objT11 = x340Var2.T();
                    if (zI5) {
                        objT11 = new rl21(ejw0Var, iu30Var6);
                        x340Var2.s0(objT11);
                    } else {
                        objT11 = new rl21(ejw0Var, iu30Var6);
                        x340Var2.s0(objT11);
                    }
                    Function0 function18 = (Function0) objT11;
                    zI6 = x340Var2.i(ejw0Var) | x340Var2.g(iu30Var6);
                    objT12 = x340Var2.T();
                    if (zI6) {
                        objT12 = new hf31(ejw0Var, iu30Var6, (byte) 2);
                        x340Var2.s0(objT12);
                    } else {
                        objT12 = new hf31(ejw0Var, iu30Var6, (byte) 2);
                        x340Var2.s0(objT12);
                    }
                    f4p1.b(xuj1Var3, wj31Var3, iu30Var6, (qim0) null, function16, function17, kslVar, function18, (iu30) objT12, x340Var2, (i12 << 15) & 3670016);
                    x340Var = x340Var2;
                    x340Var.r(false);
                    function4 = function6;
                    iu30Var4 = iu30Var5;
                    function3 = function15;
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                    function3 = function0;
                    iu30Var4 = iu30Var3;
                    function4 = function2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new bd5(iu30Var, kslVar, iu30Var4, function3, function4, gm31Var, i, i2);
                }
            }
            i3 |= 196608;
            function2 = function1;
            if ((1572864 & i) == 0) {
                if ((2097152 & i) == 0) {
                    zI7 = x340Var2.g(gm31Var);
                } else {
                    zI7 = x340Var2.i(gm31Var);
                }
                if (zI7) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i3 |= i8;
            }
            if ((599187 & i3) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var2.Y(i3 & 1, z)) {
                if (i9 != 0) {
                    iu30Var5 = null;
                } else {
                    iu30Var5 = iu30Var3;
                }
                if (i4 != 0) {
                    function5 = null;
                } else {
                    function5 = function0;
                }
                if (i6 != 0) {
                    function6 = null;
                } else {
                    function6 = function2;
                }
                int i13 = i3 & 4194302;
                hm31Var = (hm31) gm31Var;
                x340Var2.i0(1389916494);
                objT = x340Var2.T();
                m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = v8r.q(new xuj1(uuj1.a, null, null, 0, hm31Var.d, false));
                    x340Var2.s0(objT);
                }
                tob1Var = (ven0) objT;
                ven0VarS = v8r.s(iu30Var, x340Var2);
                ven0VarS2 = v8r.s((Object) null, x340Var2);
                ven0VarS3 = v8r.s(iu30Var5, x340Var2);
                ven0VarS4 = v8r.s(function5, x340Var2);
                ven0VarS5 = v8r.s(function6, x340Var2);
                objT2 = x340Var2.T();
                if (objT2 == m4cVar) {
                    objT2 = new fjw0(hm31Var.c);
                    x340Var2.s0(objT2);
                }
                fjw0Var = (fjw0) objT2;
                zG = x340Var2.g(fjw0Var);
                objT3 = x340Var2.T();
                Function0 function19 = function5;
                if (zG) {
                    l8t0 l8t0Var6 = new l8t0(ven0VarS, (lnm) null, (byte) 11);
                    ti31 ti31Var6 = hm31Var.b;
                    CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI6 = kk0.i(MobiusCoroutines.a);
                    CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially6 = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
                    usj1 usj1Var6 = new usj1(l8t0Var6, fjw0Var);
                    jd11 jd11Var6 = rc11.a;
                    coroutinesSubtypeEffectHandlerBuilderI6.a(jd11Var6.b(osj1.class), runSequentially6.a(usj1Var6));
                    coroutinesSubtypeEffectHandlerBuilderI6.a(jd11Var6.b(nsj1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new wsj1(ti31Var6, fjw0Var)));
                    coroutinesSubtypeEffectHandlerBuilderI6.a(jd11Var6.b(psj1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ysj1()));
                    objT3 = l1d.g(Mobius.d(gp71.v, new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI6))).a((xuj1) tob1Var.getValue(), Collections.singleton(osj1.a));
                    x340Var2.s0(objT3);
                } else {
                    l8t0 l8t0Var7 = new l8t0(ven0VarS, (lnm) null, (byte) 11);
                    ti31 ti31Var7 = hm31Var.b;
                    CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI7 = kk0.i(MobiusCoroutines.a);
                    CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially7 = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
                    usj1 usj1Var7 = new usj1(l8t0Var7, fjw0Var);
                    jd11 jd11Var7 = rc11.a;
                    coroutinesSubtypeEffectHandlerBuilderI7.a(jd11Var7.b(osj1.class), runSequentially7.a(usj1Var7));
                    coroutinesSubtypeEffectHandlerBuilderI7.a(jd11Var7.b(nsj1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new wsj1(ti31Var7, fjw0Var)));
                    coroutinesSubtypeEffectHandlerBuilderI7.a(jd11Var7.b(psj1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ysj1()));
                    objT3 = l1d.g(Mobius.d(gp71.v, new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI7))).a((xuj1) tob1Var.getValue(), Collections.singleton(osj1.a));
                    x340Var2.s0(objT3);
                }
                mobiusLoop = (MobiusLoop) objT3;
                zI = x340Var2.i(mobiusLoop) | x340Var2.i(tob1Var) | x340Var2.i(fjw0Var);
                objT4 = x340Var2.T();
                if (zI) {
                    objT4 = new v721(mobiusLoop, tob1Var, fjw0Var, (byte) 16);
                    x340Var2.s0(objT4);
                } else {
                    objT4 = new v721(mobiusLoop, tob1Var, fjw0Var, (byte) 16);
                    x340Var2.s0(objT4);
                }
                qxd0.i(mobiusLoop, (iu30) objT4, x340Var2);
                zG2 = x340Var2.g(mobiusLoop);
                objT5 = x340Var2.T();
                if (zG2) {
                    objT5 = new zw11(mobiusLoop, (byte) 17);
                    x340Var2.s0(objT5);
                } else {
                    objT5 = new zw11(mobiusLoop, (byte) 17);
                    x340Var2.s0(objT5);
                }
                iu30Var6 = (iu30) objT5;
                zG3 = x340Var2.g(((xuj1) tob1Var.getValue()).c);
                objT6 = x340Var2.T();
                if (zG3) {
                    oi31Var = ((xuj1) tob1Var.getValue()).c;
                    if (oi31Var != null) {
                        zj31VarA = hm31Var.a.a(oi31Var);
                    } else {
                        zj31VarA = null;
                    }
                    x340Var2.s0(zj31VarA);
                    objT6 = zj31VarA;
                } else {
                    oi31Var = ((xuj1) tob1Var.getValue()).c;
                    if (oi31Var != null) {
                        zj31VarA = hm31Var.a.a(oi31Var);
                    } else {
                        zj31VarA = null;
                    }
                    x340Var2.s0(zj31VarA);
                    objT6 = zj31VarA;
                }
                wj31 wj31Var4 = (wj31) objT6;
                if (((xuj1) tob1Var.getValue()).a instanceof suj1) {
                    synchronized (fjw0Var.b) {
                        ejw0Var = fjw0Var.c;
                    }
                } else {
                    ejw0Var = null;
                }
                objT7 = x340Var2.T();
                if (objT7 == m4cVar) {
                    objT7 = v8r.q((Object) null);
                    x340Var2.s0(objT7);
                }
                ven0Var = (ven0) objT7;
                wuj1 wuj1Var4 = ((xuj1) tob1Var.getValue()).a;
                zI2 = x340Var2.i(tob1Var) | x340Var2.i(ven0VarS2) | x340Var2.i(ven0Var) | x340Var2.i(ven0VarS3);
                objT8 = x340Var2.T();
                if (zI2) {
                    tob1Var2 = tob1Var;
                    c6h0 c6h0Var6 = new c6h0(tob1Var2, ven0VarS2, ven0Var, ven0VarS3, (lnm) null, (byte) 23);
                    x340Var2.s0(c6h0Var6);
                    objT8 = c6h0Var6;
                } else {
                    tob1Var2 = tob1Var;
                    c6h0 c6h0Var7 = new c6h0(tob1Var2, ven0VarS2, ven0Var, ven0VarS3, (lnm) null, (byte) 23);
                    x340Var2.s0(c6h0Var7);
                    objT8 = c6h0Var7;
                }
                qxd0.t(wuj1Var4, x340Var2, (vu30) objT8);
                xuj1 xuj1Var4 = (xuj1) tob1Var2.getValue();
                zI3 = x340Var2.i(ven0VarS4);
                objT9 = x340Var2.T();
                if (zI3) {
                    objT9 = new g8y0(ven0VarS4, (byte) 10);
                    x340Var2.s0(objT9);
                } else {
                    objT9 = new g8y0(ven0VarS4, (byte) 10);
                    x340Var2.s0(objT9);
                }
                Function0 function110 = (Function0) objT9;
                zI4 = x340Var2.i(ven0VarS5);
                objT10 = x340Var2.T();
                if (zI4) {
                    objT10 = new g8y0(ven0VarS5, (byte) 11);
                    x340Var2.s0(objT10);
                } else {
                    objT10 = new g8y0(ven0VarS5, (byte) 11);
                    x340Var2.s0(objT10);
                }
                Function0 function111 = (Function0) objT10;
                zI5 = x340Var2.i(ejw0Var) | x340Var2.g(iu30Var6);
                objT11 = x340Var2.T();
                if (zI5) {
                    objT11 = new rl21(ejw0Var, iu30Var6);
                    x340Var2.s0(objT11);
                } else {
                    objT11 = new rl21(ejw0Var, iu30Var6);
                    x340Var2.s0(objT11);
                }
                Function0 function112 = (Function0) objT11;
                zI6 = x340Var2.i(ejw0Var) | x340Var2.g(iu30Var6);
                objT12 = x340Var2.T();
                if (zI6) {
                    objT12 = new hf31(ejw0Var, iu30Var6, (byte) 2);
                    x340Var2.s0(objT12);
                } else {
                    objT12 = new hf31(ejw0Var, iu30Var6, (byte) 2);
                    x340Var2.s0(objT12);
                }
                f4p1.b(xuj1Var4, wj31Var4, iu30Var6, (qim0) null, function110, function111, kslVar, function112, (iu30) objT12, x340Var2, (i13 << 15) & 3670016);
                x340Var = x340Var2;
                x340Var.r(false);
                function4 = function6;
                iu30Var4 = iu30Var5;
                function3 = function19;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                function3 = function0;
                iu30Var4 = iu30Var3;
                function4 = function2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new bd5(iu30Var, kslVar, iu30Var4, function3, function4, gm31Var, i, i2);
            }
        }
        i3 |= 3072;
        iu30Var3 = iu30Var2;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                if (x340Var2.i(function0)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    function2 = function1;
                    if (x340Var2.i(function2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((1572864 & i) == 0) {
                    if ((2097152 & i) == 0) {
                        zI7 = x340Var2.g(gm31Var);
                    } else {
                        zI7 = x340Var2.i(gm31Var);
                    }
                    if (zI7) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i3 |= i8;
                }
                if ((599187 & i3) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var2.Y(i3 & 1, z)) {
                    if (i9 != 0) {
                        iu30Var5 = null;
                    } else {
                        iu30Var5 = iu30Var3;
                    }
                    if (i4 != 0) {
                        function5 = null;
                    } else {
                        function5 = function0;
                    }
                    if (i6 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    int i14 = i3 & 4194302;
                    hm31Var = (hm31) gm31Var;
                    x340Var2.i0(1389916494);
                    objT = x340Var2.T();
                    m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = v8r.q(new xuj1(uuj1.a, null, null, 0, hm31Var.d, false));
                        x340Var2.s0(objT);
                    }
                    tob1Var = (ven0) objT;
                    ven0VarS = v8r.s(iu30Var, x340Var2);
                    ven0VarS2 = v8r.s((Object) null, x340Var2);
                    ven0VarS3 = v8r.s(iu30Var5, x340Var2);
                    ven0VarS4 = v8r.s(function5, x340Var2);
                    ven0VarS5 = v8r.s(function6, x340Var2);
                    objT2 = x340Var2.T();
                    if (objT2 == m4cVar) {
                        objT2 = new fjw0(hm31Var.c);
                        x340Var2.s0(objT2);
                    }
                    fjw0Var = (fjw0) objT2;
                    zG = x340Var2.g(fjw0Var);
                    objT3 = x340Var2.T();
                    Function0 function113 = function5;
                    if (zG) {
                        l8t0 l8t0Var8 = new l8t0(ven0VarS, (lnm) null, (byte) 11);
                        ti31 ti31Var8 = hm31Var.b;
                        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI8 = kk0.i(MobiusCoroutines.a);
                        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially8 = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
                        usj1 usj1Var8 = new usj1(l8t0Var8, fjw0Var);
                        jd11 jd11Var8 = rc11.a;
                        coroutinesSubtypeEffectHandlerBuilderI8.a(jd11Var8.b(osj1.class), runSequentially8.a(usj1Var8));
                        coroutinesSubtypeEffectHandlerBuilderI8.a(jd11Var8.b(nsj1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new wsj1(ti31Var8, fjw0Var)));
                        coroutinesSubtypeEffectHandlerBuilderI8.a(jd11Var8.b(psj1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ysj1()));
                        objT3 = l1d.g(Mobius.d(gp71.v, new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI8))).a((xuj1) tob1Var.getValue(), Collections.singleton(osj1.a));
                        x340Var2.s0(objT3);
                    } else {
                        l8t0 l8t0Var9 = new l8t0(ven0VarS, (lnm) null, (byte) 11);
                        ti31 ti31Var9 = hm31Var.b;
                        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI9 = kk0.i(MobiusCoroutines.a);
                        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially9 = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
                        usj1 usj1Var9 = new usj1(l8t0Var9, fjw0Var);
                        jd11 jd11Var9 = rc11.a;
                        coroutinesSubtypeEffectHandlerBuilderI9.a(jd11Var9.b(osj1.class), runSequentially9.a(usj1Var9));
                        coroutinesSubtypeEffectHandlerBuilderI9.a(jd11Var9.b(nsj1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new wsj1(ti31Var9, fjw0Var)));
                        coroutinesSubtypeEffectHandlerBuilderI9.a(jd11Var9.b(psj1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ysj1()));
                        objT3 = l1d.g(Mobius.d(gp71.v, new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI9))).a((xuj1) tob1Var.getValue(), Collections.singleton(osj1.a));
                        x340Var2.s0(objT3);
                    }
                    mobiusLoop = (MobiusLoop) objT3;
                    zI = x340Var2.i(mobiusLoop) | x340Var2.i(tob1Var) | x340Var2.i(fjw0Var);
                    objT4 = x340Var2.T();
                    if (zI) {
                        objT4 = new v721(mobiusLoop, tob1Var, fjw0Var, (byte) 16);
                        x340Var2.s0(objT4);
                    } else {
                        objT4 = new v721(mobiusLoop, tob1Var, fjw0Var, (byte) 16);
                        x340Var2.s0(objT4);
                    }
                    qxd0.i(mobiusLoop, (iu30) objT4, x340Var2);
                    zG2 = x340Var2.g(mobiusLoop);
                    objT5 = x340Var2.T();
                    if (zG2) {
                        objT5 = new zw11(mobiusLoop, (byte) 17);
                        x340Var2.s0(objT5);
                    } else {
                        objT5 = new zw11(mobiusLoop, (byte) 17);
                        x340Var2.s0(objT5);
                    }
                    iu30Var6 = (iu30) objT5;
                    zG3 = x340Var2.g(((xuj1) tob1Var.getValue()).c);
                    objT6 = x340Var2.T();
                    if (zG3) {
                        oi31Var = ((xuj1) tob1Var.getValue()).c;
                        if (oi31Var != null) {
                            zj31VarA = hm31Var.a.a(oi31Var);
                        } else {
                            zj31VarA = null;
                        }
                        x340Var2.s0(zj31VarA);
                        objT6 = zj31VarA;
                    } else {
                        oi31Var = ((xuj1) tob1Var.getValue()).c;
                        if (oi31Var != null) {
                            zj31VarA = hm31Var.a.a(oi31Var);
                        } else {
                            zj31VarA = null;
                        }
                        x340Var2.s0(zj31VarA);
                        objT6 = zj31VarA;
                    }
                    wj31 wj31Var5 = (wj31) objT6;
                    if (((xuj1) tob1Var.getValue()).a instanceof suj1) {
                        synchronized (fjw0Var.b) {
                            ejw0Var = fjw0Var.c;
                        }
                    } else {
                        ejw0Var = null;
                    }
                    objT7 = x340Var2.T();
                    if (objT7 == m4cVar) {
                        objT7 = v8r.q((Object) null);
                        x340Var2.s0(objT7);
                    }
                    ven0Var = (ven0) objT7;
                    wuj1 wuj1Var5 = ((xuj1) tob1Var.getValue()).a;
                    zI2 = x340Var2.i(tob1Var) | x340Var2.i(ven0VarS2) | x340Var2.i(ven0Var) | x340Var2.i(ven0VarS3);
                    objT8 = x340Var2.T();
                    if (zI2) {
                        tob1Var2 = tob1Var;
                        c6h0 c6h0Var8 = new c6h0(tob1Var2, ven0VarS2, ven0Var, ven0VarS3, (lnm) null, (byte) 23);
                        x340Var2.s0(c6h0Var8);
                        objT8 = c6h0Var8;
                    } else {
                        tob1Var2 = tob1Var;
                        c6h0 c6h0Var9 = new c6h0(tob1Var2, ven0VarS2, ven0Var, ven0VarS3, (lnm) null, (byte) 23);
                        x340Var2.s0(c6h0Var9);
                        objT8 = c6h0Var9;
                    }
                    qxd0.t(wuj1Var5, x340Var2, (vu30) objT8);
                    xuj1 xuj1Var5 = (xuj1) tob1Var2.getValue();
                    zI3 = x340Var2.i(ven0VarS4);
                    objT9 = x340Var2.T();
                    if (zI3) {
                        objT9 = new g8y0(ven0VarS4, (byte) 10);
                        x340Var2.s0(objT9);
                    } else {
                        objT9 = new g8y0(ven0VarS4, (byte) 10);
                        x340Var2.s0(objT9);
                    }
                    Function0 function114 = (Function0) objT9;
                    zI4 = x340Var2.i(ven0VarS5);
                    objT10 = x340Var2.T();
                    if (zI4) {
                        objT10 = new g8y0(ven0VarS5, (byte) 11);
                        x340Var2.s0(objT10);
                    } else {
                        objT10 = new g8y0(ven0VarS5, (byte) 11);
                        x340Var2.s0(objT10);
                    }
                    Function0 function115 = (Function0) objT10;
                    zI5 = x340Var2.i(ejw0Var) | x340Var2.g(iu30Var6);
                    objT11 = x340Var2.T();
                    if (zI5) {
                        objT11 = new rl21(ejw0Var, iu30Var6);
                        x340Var2.s0(objT11);
                    } else {
                        objT11 = new rl21(ejw0Var, iu30Var6);
                        x340Var2.s0(objT11);
                    }
                    Function0 function116 = (Function0) objT11;
                    zI6 = x340Var2.i(ejw0Var) | x340Var2.g(iu30Var6);
                    objT12 = x340Var2.T();
                    if (zI6) {
                        objT12 = new hf31(ejw0Var, iu30Var6, (byte) 2);
                        x340Var2.s0(objT12);
                    } else {
                        objT12 = new hf31(ejw0Var, iu30Var6, (byte) 2);
                        x340Var2.s0(objT12);
                    }
                    f4p1.b(xuj1Var5, wj31Var5, iu30Var6, (qim0) null, function114, function115, kslVar, function116, (iu30) objT12, x340Var2, (i14 << 15) & 3670016);
                    x340Var = x340Var2;
                    x340Var.r(false);
                    function4 = function6;
                    iu30Var4 = iu30Var5;
                    function3 = function113;
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                    function3 = function0;
                    iu30Var4 = iu30Var3;
                    function4 = function2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new bd5(iu30Var, kslVar, iu30Var4, function3, function4, gm31Var, i, i2);
                }
            }
            i3 |= 196608;
            function2 = function1;
            if ((1572864 & i) == 0) {
                if ((2097152 & i) == 0) {
                    zI7 = x340Var2.g(gm31Var);
                } else {
                    zI7 = x340Var2.i(gm31Var);
                }
                if (zI7) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i3 |= i8;
            }
            if ((599187 & i3) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var2.Y(i3 & 1, z)) {
                if (i9 != 0) {
                    iu30Var5 = null;
                } else {
                    iu30Var5 = iu30Var3;
                }
                if (i4 != 0) {
                    function5 = null;
                } else {
                    function5 = function0;
                }
                if (i6 != 0) {
                    function6 = null;
                } else {
                    function6 = function2;
                }
                int i15 = i3 & 4194302;
                hm31Var = (hm31) gm31Var;
                x340Var2.i0(1389916494);
                objT = x340Var2.T();
                m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = v8r.q(new xuj1(uuj1.a, null, null, 0, hm31Var.d, false));
                    x340Var2.s0(objT);
                }
                tob1Var = (ven0) objT;
                ven0VarS = v8r.s(iu30Var, x340Var2);
                ven0VarS2 = v8r.s((Object) null, x340Var2);
                ven0VarS3 = v8r.s(iu30Var5, x340Var2);
                ven0VarS4 = v8r.s(function5, x340Var2);
                ven0VarS5 = v8r.s(function6, x340Var2);
                objT2 = x340Var2.T();
                if (objT2 == m4cVar) {
                    objT2 = new fjw0(hm31Var.c);
                    x340Var2.s0(objT2);
                }
                fjw0Var = (fjw0) objT2;
                zG = x340Var2.g(fjw0Var);
                objT3 = x340Var2.T();
                Function0 function117 = function5;
                if (zG) {
                    l8t0 l8t0Var10 = new l8t0(ven0VarS, (lnm) null, (byte) 11);
                    ti31 ti31Var10 = hm31Var.b;
                    CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI10 = kk0.i(MobiusCoroutines.a);
                    CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially10 = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
                    usj1 usj1Var10 = new usj1(l8t0Var10, fjw0Var);
                    jd11 jd11Var10 = rc11.a;
                    coroutinesSubtypeEffectHandlerBuilderI10.a(jd11Var10.b(osj1.class), runSequentially10.a(usj1Var10));
                    coroutinesSubtypeEffectHandlerBuilderI10.a(jd11Var10.b(nsj1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new wsj1(ti31Var10, fjw0Var)));
                    coroutinesSubtypeEffectHandlerBuilderI10.a(jd11Var10.b(psj1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ysj1()));
                    objT3 = l1d.g(Mobius.d(gp71.v, new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI10))).a((xuj1) tob1Var.getValue(), Collections.singleton(osj1.a));
                    x340Var2.s0(objT3);
                } else {
                    l8t0 l8t0Var11 = new l8t0(ven0VarS, (lnm) null, (byte) 11);
                    ti31 ti31Var11 = hm31Var.b;
                    CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI11 = kk0.i(MobiusCoroutines.a);
                    CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially11 = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
                    usj1 usj1Var11 = new usj1(l8t0Var11, fjw0Var);
                    jd11 jd11Var11 = rc11.a;
                    coroutinesSubtypeEffectHandlerBuilderI11.a(jd11Var11.b(osj1.class), runSequentially11.a(usj1Var11));
                    coroutinesSubtypeEffectHandlerBuilderI11.a(jd11Var11.b(nsj1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new wsj1(ti31Var11, fjw0Var)));
                    coroutinesSubtypeEffectHandlerBuilderI11.a(jd11Var11.b(psj1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ysj1()));
                    objT3 = l1d.g(Mobius.d(gp71.v, new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI11))).a((xuj1) tob1Var.getValue(), Collections.singleton(osj1.a));
                    x340Var2.s0(objT3);
                }
                mobiusLoop = (MobiusLoop) objT3;
                zI = x340Var2.i(mobiusLoop) | x340Var2.i(tob1Var) | x340Var2.i(fjw0Var);
                objT4 = x340Var2.T();
                if (zI) {
                    objT4 = new v721(mobiusLoop, tob1Var, fjw0Var, (byte) 16);
                    x340Var2.s0(objT4);
                } else {
                    objT4 = new v721(mobiusLoop, tob1Var, fjw0Var, (byte) 16);
                    x340Var2.s0(objT4);
                }
                qxd0.i(mobiusLoop, (iu30) objT4, x340Var2);
                zG2 = x340Var2.g(mobiusLoop);
                objT5 = x340Var2.T();
                if (zG2) {
                    objT5 = new zw11(mobiusLoop, (byte) 17);
                    x340Var2.s0(objT5);
                } else {
                    objT5 = new zw11(mobiusLoop, (byte) 17);
                    x340Var2.s0(objT5);
                }
                iu30Var6 = (iu30) objT5;
                zG3 = x340Var2.g(((xuj1) tob1Var.getValue()).c);
                objT6 = x340Var2.T();
                if (zG3) {
                    oi31Var = ((xuj1) tob1Var.getValue()).c;
                    if (oi31Var != null) {
                        zj31VarA = hm31Var.a.a(oi31Var);
                    } else {
                        zj31VarA = null;
                    }
                    x340Var2.s0(zj31VarA);
                    objT6 = zj31VarA;
                } else {
                    oi31Var = ((xuj1) tob1Var.getValue()).c;
                    if (oi31Var != null) {
                        zj31VarA = hm31Var.a.a(oi31Var);
                    } else {
                        zj31VarA = null;
                    }
                    x340Var2.s0(zj31VarA);
                    objT6 = zj31VarA;
                }
                wj31 wj31Var6 = (wj31) objT6;
                if (((xuj1) tob1Var.getValue()).a instanceof suj1) {
                    synchronized (fjw0Var.b) {
                        ejw0Var = fjw0Var.c;
                    }
                } else {
                    ejw0Var = null;
                }
                objT7 = x340Var2.T();
                if (objT7 == m4cVar) {
                    objT7 = v8r.q((Object) null);
                    x340Var2.s0(objT7);
                }
                ven0Var = (ven0) objT7;
                wuj1 wuj1Var6 = ((xuj1) tob1Var.getValue()).a;
                zI2 = x340Var2.i(tob1Var) | x340Var2.i(ven0VarS2) | x340Var2.i(ven0Var) | x340Var2.i(ven0VarS3);
                objT8 = x340Var2.T();
                if (zI2) {
                    tob1Var2 = tob1Var;
                    c6h0 c6h0Var10 = new c6h0(tob1Var2, ven0VarS2, ven0Var, ven0VarS3, (lnm) null, (byte) 23);
                    x340Var2.s0(c6h0Var10);
                    objT8 = c6h0Var10;
                } else {
                    tob1Var2 = tob1Var;
                    c6h0 c6h0Var11 = new c6h0(tob1Var2, ven0VarS2, ven0Var, ven0VarS3, (lnm) null, (byte) 23);
                    x340Var2.s0(c6h0Var11);
                    objT8 = c6h0Var11;
                }
                qxd0.t(wuj1Var6, x340Var2, (vu30) objT8);
                xuj1 xuj1Var6 = (xuj1) tob1Var2.getValue();
                zI3 = x340Var2.i(ven0VarS4);
                objT9 = x340Var2.T();
                if (zI3) {
                    objT9 = new g8y0(ven0VarS4, (byte) 10);
                    x340Var2.s0(objT9);
                } else {
                    objT9 = new g8y0(ven0VarS4, (byte) 10);
                    x340Var2.s0(objT9);
                }
                Function0 function118 = (Function0) objT9;
                zI4 = x340Var2.i(ven0VarS5);
                objT10 = x340Var2.T();
                if (zI4) {
                    objT10 = new g8y0(ven0VarS5, (byte) 11);
                    x340Var2.s0(objT10);
                } else {
                    objT10 = new g8y0(ven0VarS5, (byte) 11);
                    x340Var2.s0(objT10);
                }
                Function0 function119 = (Function0) objT10;
                zI5 = x340Var2.i(ejw0Var) | x340Var2.g(iu30Var6);
                objT11 = x340Var2.T();
                if (zI5) {
                    objT11 = new rl21(ejw0Var, iu30Var6);
                    x340Var2.s0(objT11);
                } else {
                    objT11 = new rl21(ejw0Var, iu30Var6);
                    x340Var2.s0(objT11);
                }
                Function0 function1110 = (Function0) objT11;
                zI6 = x340Var2.i(ejw0Var) | x340Var2.g(iu30Var6);
                objT12 = x340Var2.T();
                if (zI6) {
                    objT12 = new hf31(ejw0Var, iu30Var6, (byte) 2);
                    x340Var2.s0(objT12);
                } else {
                    objT12 = new hf31(ejw0Var, iu30Var6, (byte) 2);
                    x340Var2.s0(objT12);
                }
                f4p1.b(xuj1Var6, wj31Var6, iu30Var6, (qim0) null, function118, function119, kslVar, function1110, (iu30) objT12, x340Var2, (i15 << 15) & 3670016);
                x340Var = x340Var2;
                x340Var.r(false);
                function4 = function6;
                iu30Var4 = iu30Var5;
                function3 = function117;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                function3 = function0;
                iu30Var4 = iu30Var3;
                function4 = function2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new bd5(iu30Var, kslVar, iu30Var4, function3, function4, gm31Var, i, i2);
            }
        }
        i3 |= 24576;
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((196608 & i) == 0) {
                function2 = function1;
                if (x340Var2.i(function2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((1572864 & i) == 0) {
                if ((2097152 & i) == 0) {
                    zI7 = x340Var2.g(gm31Var);
                } else {
                    zI7 = x340Var2.i(gm31Var);
                }
                if (zI7) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i3 |= i8;
            }
            if ((599187 & i3) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var2.Y(i3 & 1, z)) {
                if (i9 != 0) {
                    iu30Var5 = null;
                } else {
                    iu30Var5 = iu30Var3;
                }
                if (i4 != 0) {
                    function5 = null;
                } else {
                    function5 = function0;
                }
                if (i6 != 0) {
                    function6 = null;
                } else {
                    function6 = function2;
                }
                int i16 = i3 & 4194302;
                hm31Var = (hm31) gm31Var;
                x340Var2.i0(1389916494);
                objT = x340Var2.T();
                m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = v8r.q(new xuj1(uuj1.a, null, null, 0, hm31Var.d, false));
                    x340Var2.s0(objT);
                }
                tob1Var = (ven0) objT;
                ven0VarS = v8r.s(iu30Var, x340Var2);
                ven0VarS2 = v8r.s((Object) null, x340Var2);
                ven0VarS3 = v8r.s(iu30Var5, x340Var2);
                ven0VarS4 = v8r.s(function5, x340Var2);
                ven0VarS5 = v8r.s(function6, x340Var2);
                objT2 = x340Var2.T();
                if (objT2 == m4cVar) {
                    objT2 = new fjw0(hm31Var.c);
                    x340Var2.s0(objT2);
                }
                fjw0Var = (fjw0) objT2;
                zG = x340Var2.g(fjw0Var);
                objT3 = x340Var2.T();
                Function0 function1111 = function5;
                if (zG) {
                    l8t0 l8t0Var12 = new l8t0(ven0VarS, (lnm) null, (byte) 11);
                    ti31 ti31Var12 = hm31Var.b;
                    CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI12 = kk0.i(MobiusCoroutines.a);
                    CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially12 = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
                    usj1 usj1Var12 = new usj1(l8t0Var12, fjw0Var);
                    jd11 jd11Var12 = rc11.a;
                    coroutinesSubtypeEffectHandlerBuilderI12.a(jd11Var12.b(osj1.class), runSequentially12.a(usj1Var12));
                    coroutinesSubtypeEffectHandlerBuilderI12.a(jd11Var12.b(nsj1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new wsj1(ti31Var12, fjw0Var)));
                    coroutinesSubtypeEffectHandlerBuilderI12.a(jd11Var12.b(psj1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ysj1()));
                    objT3 = l1d.g(Mobius.d(gp71.v, new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI12))).a((xuj1) tob1Var.getValue(), Collections.singleton(osj1.a));
                    x340Var2.s0(objT3);
                } else {
                    l8t0 l8t0Var13 = new l8t0(ven0VarS, (lnm) null, (byte) 11);
                    ti31 ti31Var13 = hm31Var.b;
                    CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI13 = kk0.i(MobiusCoroutines.a);
                    CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially13 = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
                    usj1 usj1Var13 = new usj1(l8t0Var13, fjw0Var);
                    jd11 jd11Var13 = rc11.a;
                    coroutinesSubtypeEffectHandlerBuilderI13.a(jd11Var13.b(osj1.class), runSequentially13.a(usj1Var13));
                    coroutinesSubtypeEffectHandlerBuilderI13.a(jd11Var13.b(nsj1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new wsj1(ti31Var13, fjw0Var)));
                    coroutinesSubtypeEffectHandlerBuilderI13.a(jd11Var13.b(psj1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ysj1()));
                    objT3 = l1d.g(Mobius.d(gp71.v, new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI13))).a((xuj1) tob1Var.getValue(), Collections.singleton(osj1.a));
                    x340Var2.s0(objT3);
                }
                mobiusLoop = (MobiusLoop) objT3;
                zI = x340Var2.i(mobiusLoop) | x340Var2.i(tob1Var) | x340Var2.i(fjw0Var);
                objT4 = x340Var2.T();
                if (zI) {
                    objT4 = new v721(mobiusLoop, tob1Var, fjw0Var, (byte) 16);
                    x340Var2.s0(objT4);
                } else {
                    objT4 = new v721(mobiusLoop, tob1Var, fjw0Var, (byte) 16);
                    x340Var2.s0(objT4);
                }
                qxd0.i(mobiusLoop, (iu30) objT4, x340Var2);
                zG2 = x340Var2.g(mobiusLoop);
                objT5 = x340Var2.T();
                if (zG2) {
                    objT5 = new zw11(mobiusLoop, (byte) 17);
                    x340Var2.s0(objT5);
                } else {
                    objT5 = new zw11(mobiusLoop, (byte) 17);
                    x340Var2.s0(objT5);
                }
                iu30Var6 = (iu30) objT5;
                zG3 = x340Var2.g(((xuj1) tob1Var.getValue()).c);
                objT6 = x340Var2.T();
                if (zG3) {
                    oi31Var = ((xuj1) tob1Var.getValue()).c;
                    if (oi31Var != null) {
                        zj31VarA = hm31Var.a.a(oi31Var);
                    } else {
                        zj31VarA = null;
                    }
                    x340Var2.s0(zj31VarA);
                    objT6 = zj31VarA;
                } else {
                    oi31Var = ((xuj1) tob1Var.getValue()).c;
                    if (oi31Var != null) {
                        zj31VarA = hm31Var.a.a(oi31Var);
                    } else {
                        zj31VarA = null;
                    }
                    x340Var2.s0(zj31VarA);
                    objT6 = zj31VarA;
                }
                wj31 wj31Var7 = (wj31) objT6;
                if (((xuj1) tob1Var.getValue()).a instanceof suj1) {
                    synchronized (fjw0Var.b) {
                        ejw0Var = fjw0Var.c;
                    }
                } else {
                    ejw0Var = null;
                }
                objT7 = x340Var2.T();
                if (objT7 == m4cVar) {
                    objT7 = v8r.q((Object) null);
                    x340Var2.s0(objT7);
                }
                ven0Var = (ven0) objT7;
                wuj1 wuj1Var7 = ((xuj1) tob1Var.getValue()).a;
                zI2 = x340Var2.i(tob1Var) | x340Var2.i(ven0VarS2) | x340Var2.i(ven0Var) | x340Var2.i(ven0VarS3);
                objT8 = x340Var2.T();
                if (zI2) {
                    tob1Var2 = tob1Var;
                    c6h0 c6h0Var12 = new c6h0(tob1Var2, ven0VarS2, ven0Var, ven0VarS3, (lnm) null, (byte) 23);
                    x340Var2.s0(c6h0Var12);
                    objT8 = c6h0Var12;
                } else {
                    tob1Var2 = tob1Var;
                    c6h0 c6h0Var13 = new c6h0(tob1Var2, ven0VarS2, ven0Var, ven0VarS3, (lnm) null, (byte) 23);
                    x340Var2.s0(c6h0Var13);
                    objT8 = c6h0Var13;
                }
                qxd0.t(wuj1Var7, x340Var2, (vu30) objT8);
                xuj1 xuj1Var7 = (xuj1) tob1Var2.getValue();
                zI3 = x340Var2.i(ven0VarS4);
                objT9 = x340Var2.T();
                if (zI3) {
                    objT9 = new g8y0(ven0VarS4, (byte) 10);
                    x340Var2.s0(objT9);
                } else {
                    objT9 = new g8y0(ven0VarS4, (byte) 10);
                    x340Var2.s0(objT9);
                }
                Function0 function1112 = (Function0) objT9;
                zI4 = x340Var2.i(ven0VarS5);
                objT10 = x340Var2.T();
                if (zI4) {
                    objT10 = new g8y0(ven0VarS5, (byte) 11);
                    x340Var2.s0(objT10);
                } else {
                    objT10 = new g8y0(ven0VarS5, (byte) 11);
                    x340Var2.s0(objT10);
                }
                Function0 function1113 = (Function0) objT10;
                zI5 = x340Var2.i(ejw0Var) | x340Var2.g(iu30Var6);
                objT11 = x340Var2.T();
                if (zI5) {
                    objT11 = new rl21(ejw0Var, iu30Var6);
                    x340Var2.s0(objT11);
                } else {
                    objT11 = new rl21(ejw0Var, iu30Var6);
                    x340Var2.s0(objT11);
                }
                Function0 function1114 = (Function0) objT11;
                zI6 = x340Var2.i(ejw0Var) | x340Var2.g(iu30Var6);
                objT12 = x340Var2.T();
                if (zI6) {
                    objT12 = new hf31(ejw0Var, iu30Var6, (byte) 2);
                    x340Var2.s0(objT12);
                } else {
                    objT12 = new hf31(ejw0Var, iu30Var6, (byte) 2);
                    x340Var2.s0(objT12);
                }
                f4p1.b(xuj1Var7, wj31Var7, iu30Var6, (qim0) null, function1112, function1113, kslVar, function1114, (iu30) objT12, x340Var2, (i16 << 15) & 3670016);
                x340Var = x340Var2;
                x340Var.r(false);
                function4 = function6;
                iu30Var4 = iu30Var5;
                function3 = function1111;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                function3 = function0;
                iu30Var4 = iu30Var3;
                function4 = function2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new bd5(iu30Var, kslVar, iu30Var4, function3, function4, gm31Var, i, i2);
            }
        }
        i3 |= 196608;
        function2 = function1;
        if ((1572864 & i) == 0) {
            if ((2097152 & i) == 0) {
                zI7 = x340Var2.g(gm31Var);
            } else {
                zI7 = x340Var2.i(gm31Var);
            }
            if (zI7) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i3 |= i8;
        }
        if ((599187 & i3) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var2.Y(i3 & 1, z)) {
            if (i9 != 0) {
                iu30Var5 = null;
            } else {
                iu30Var5 = iu30Var3;
            }
            if (i4 != 0) {
                function5 = null;
            } else {
                function5 = function0;
            }
            if (i6 != 0) {
                function6 = null;
            } else {
                function6 = function2;
            }
            int i17 = i3 & 4194302;
            hm31Var = (hm31) gm31Var;
            x340Var2.i0(1389916494);
            objT = x340Var2.T();
            m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(new xuj1(uuj1.a, null, null, 0, hm31Var.d, false));
                x340Var2.s0(objT);
            }
            tob1Var = (ven0) objT;
            ven0VarS = v8r.s(iu30Var, x340Var2);
            ven0VarS2 = v8r.s((Object) null, x340Var2);
            ven0VarS3 = v8r.s(iu30Var5, x340Var2);
            ven0VarS4 = v8r.s(function5, x340Var2);
            ven0VarS5 = v8r.s(function6, x340Var2);
            objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                objT2 = new fjw0(hm31Var.c);
                x340Var2.s0(objT2);
            }
            fjw0Var = (fjw0) objT2;
            zG = x340Var2.g(fjw0Var);
            objT3 = x340Var2.T();
            Function0 function1115 = function5;
            if (zG) {
                l8t0 l8t0Var14 = new l8t0(ven0VarS, (lnm) null, (byte) 11);
                ti31 ti31Var14 = hm31Var.b;
                CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI14 = kk0.i(MobiusCoroutines.a);
                CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially14 = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
                usj1 usj1Var14 = new usj1(l8t0Var14, fjw0Var);
                jd11 jd11Var14 = rc11.a;
                coroutinesSubtypeEffectHandlerBuilderI14.a(jd11Var14.b(osj1.class), runSequentially14.a(usj1Var14));
                coroutinesSubtypeEffectHandlerBuilderI14.a(jd11Var14.b(nsj1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new wsj1(ti31Var14, fjw0Var)));
                coroutinesSubtypeEffectHandlerBuilderI14.a(jd11Var14.b(psj1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ysj1()));
                objT3 = l1d.g(Mobius.d(gp71.v, new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI14))).a((xuj1) tob1Var.getValue(), Collections.singleton(osj1.a));
                x340Var2.s0(objT3);
            } else {
                l8t0 l8t0Var15 = new l8t0(ven0VarS, (lnm) null, (byte) 11);
                ti31 ti31Var15 = hm31Var.b;
                CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI15 = kk0.i(MobiusCoroutines.a);
                CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially15 = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
                usj1 usj1Var15 = new usj1(l8t0Var15, fjw0Var);
                jd11 jd11Var15 = rc11.a;
                coroutinesSubtypeEffectHandlerBuilderI15.a(jd11Var15.b(osj1.class), runSequentially15.a(usj1Var15));
                coroutinesSubtypeEffectHandlerBuilderI15.a(jd11Var15.b(nsj1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new wsj1(ti31Var15, fjw0Var)));
                coroutinesSubtypeEffectHandlerBuilderI15.a(jd11Var15.b(psj1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ysj1()));
                objT3 = l1d.g(Mobius.d(gp71.v, new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI15))).a((xuj1) tob1Var.getValue(), Collections.singleton(osj1.a));
                x340Var2.s0(objT3);
            }
            mobiusLoop = (MobiusLoop) objT3;
            zI = x340Var2.i(mobiusLoop) | x340Var2.i(tob1Var) | x340Var2.i(fjw0Var);
            objT4 = x340Var2.T();
            if (zI) {
                objT4 = new v721(mobiusLoop, tob1Var, fjw0Var, (byte) 16);
                x340Var2.s0(objT4);
            } else {
                objT4 = new v721(mobiusLoop, tob1Var, fjw0Var, (byte) 16);
                x340Var2.s0(objT4);
            }
            qxd0.i(mobiusLoop, (iu30) objT4, x340Var2);
            zG2 = x340Var2.g(mobiusLoop);
            objT5 = x340Var2.T();
            if (zG2) {
                objT5 = new zw11(mobiusLoop, (byte) 17);
                x340Var2.s0(objT5);
            } else {
                objT5 = new zw11(mobiusLoop, (byte) 17);
                x340Var2.s0(objT5);
            }
            iu30Var6 = (iu30) objT5;
            zG3 = x340Var2.g(((xuj1) tob1Var.getValue()).c);
            objT6 = x340Var2.T();
            if (zG3) {
                oi31Var = ((xuj1) tob1Var.getValue()).c;
                if (oi31Var != null) {
                    zj31VarA = hm31Var.a.a(oi31Var);
                } else {
                    zj31VarA = null;
                }
                x340Var2.s0(zj31VarA);
                objT6 = zj31VarA;
            } else {
                oi31Var = ((xuj1) tob1Var.getValue()).c;
                if (oi31Var != null) {
                    zj31VarA = hm31Var.a.a(oi31Var);
                } else {
                    zj31VarA = null;
                }
                x340Var2.s0(zj31VarA);
                objT6 = zj31VarA;
            }
            wj31 wj31Var8 = (wj31) objT6;
            if (((xuj1) tob1Var.getValue()).a instanceof suj1) {
                synchronized (fjw0Var.b) {
                    ejw0Var = fjw0Var.c;
                }
            } else {
                ejw0Var = null;
            }
            objT7 = x340Var2.T();
            if (objT7 == m4cVar) {
                objT7 = v8r.q((Object) null);
                x340Var2.s0(objT7);
            }
            ven0Var = (ven0) objT7;
            wuj1 wuj1Var8 = ((xuj1) tob1Var.getValue()).a;
            zI2 = x340Var2.i(tob1Var) | x340Var2.i(ven0VarS2) | x340Var2.i(ven0Var) | x340Var2.i(ven0VarS3);
            objT8 = x340Var2.T();
            if (zI2) {
                tob1Var2 = tob1Var;
                c6h0 c6h0Var14 = new c6h0(tob1Var2, ven0VarS2, ven0Var, ven0VarS3, (lnm) null, (byte) 23);
                x340Var2.s0(c6h0Var14);
                objT8 = c6h0Var14;
            } else {
                tob1Var2 = tob1Var;
                c6h0 c6h0Var15 = new c6h0(tob1Var2, ven0VarS2, ven0Var, ven0VarS3, (lnm) null, (byte) 23);
                x340Var2.s0(c6h0Var15);
                objT8 = c6h0Var15;
            }
            qxd0.t(wuj1Var8, x340Var2, (vu30) objT8);
            xuj1 xuj1Var8 = (xuj1) tob1Var2.getValue();
            zI3 = x340Var2.i(ven0VarS4);
            objT9 = x340Var2.T();
            if (zI3) {
                objT9 = new g8y0(ven0VarS4, (byte) 10);
                x340Var2.s0(objT9);
            } else {
                objT9 = new g8y0(ven0VarS4, (byte) 10);
                x340Var2.s0(objT9);
            }
            Function0 function1116 = (Function0) objT9;
            zI4 = x340Var2.i(ven0VarS5);
            objT10 = x340Var2.T();
            if (zI4) {
                objT10 = new g8y0(ven0VarS5, (byte) 11);
                x340Var2.s0(objT10);
            } else {
                objT10 = new g8y0(ven0VarS5, (byte) 11);
                x340Var2.s0(objT10);
            }
            Function0 function1117 = (Function0) objT10;
            zI5 = x340Var2.i(ejw0Var) | x340Var2.g(iu30Var6);
            objT11 = x340Var2.T();
            if (zI5) {
                objT11 = new rl21(ejw0Var, iu30Var6);
                x340Var2.s0(objT11);
            } else {
                objT11 = new rl21(ejw0Var, iu30Var6);
                x340Var2.s0(objT11);
            }
            Function0 function1118 = (Function0) objT11;
            zI6 = x340Var2.i(ejw0Var) | x340Var2.g(iu30Var6);
            objT12 = x340Var2.T();
            if (zI6) {
                objT12 = new hf31(ejw0Var, iu30Var6, (byte) 2);
                x340Var2.s0(objT12);
            } else {
                objT12 = new hf31(ejw0Var, iu30Var6, (byte) 2);
                x340Var2.s0(objT12);
            }
            f4p1.b(xuj1Var8, wj31Var8, iu30Var6, (qim0) null, function1116, function1117, kslVar, function1118, (iu30) objT12, x340Var2, (i17 << 15) & 3670016);
            x340Var = x340Var2;
            x340Var.r(false);
            function4 = function6;
            iu30Var4 = iu30Var5;
            function3 = function1115;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            function3 = function0;
            iu30Var4 = iu30Var3;
            function4 = function2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bd5(iu30Var, kslVar, iu30Var4, function3, function4, gm31Var, i, i2);
        }
    }

    public static final void e(View view, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1581724250);
        int i2 = (x340Var.i(view) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarB = uyn1.B(u291.f(nim0.a, 1.0f), 0.0f, dsa0.m(x340Var, 2131165905), 0.0f, 0.0f, 13);
            boolean zI = x340Var.i(view);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new xy2(view, (byte) 1);
                x340Var.s0(objT);
            }
            dm5.a((iu30) objT, qim0VarB, (iu30) null, x340Var, 0, 4);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xb2(view, i, (byte) 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0124  */
    /* JADX WARN: Code duplicated, block: B:101:0x0127  */
    /* JADX WARN: Code duplicated, block: B:104:0x0130  */
    /* JADX WARN: Code duplicated, block: B:105:0x0133  */
    /* JADX WARN: Code duplicated, block: B:108:0x013b  */
    /* JADX WARN: Code duplicated, block: B:109:0x013e  */
    /* JADX WARN: Code duplicated, block: B:111:0x0148  */
    /* JADX WARN: Code duplicated, block: B:112:0x014b  */
    /* JADX WARN: Code duplicated, block: B:116:0x0161  */
    /* JADX WARN: Code duplicated, block: B:120:0x016a  */
    /* JADX WARN: Code duplicated, block: B:123:0x0174  */
    /* JADX WARN: Code duplicated, block: B:125:0x017e  */
    /* JADX WARN: Code duplicated, block: B:133:0x01b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:134:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:135:0x01be  */
    /* JADX WARN: Code duplicated, block: B:138:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:139:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:142:0x01db  */
    /* JADX WARN: Code duplicated, block: B:144:0x01de  */
    /* JADX WARN: Code duplicated, block: B:145:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:147:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:148:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:150:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:151:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:154:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:156:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:158:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:160:0x0214  */
    /* JADX WARN: Code duplicated, block: B:163:0x022f  */
    /* JADX WARN: Code duplicated, block: B:164:0x0232  */
    /* JADX WARN: Code duplicated, block: B:167:0x0239 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:168:0x023b  */
    /* JADX WARN: Code duplicated, block: B:172:0x0251  */
    /* JADX WARN: Code duplicated, block: B:175:0x0259 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:176:0x025b  */
    /* JADX WARN: Code duplicated, block: B:179:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:182:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x009b  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:61:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00be  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:89:0x0100  */
    /* JADX WARN: Code duplicated, block: B:91:0x010a  */
    /* JADX WARN: Code duplicated, block: B:92:0x010d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0117  */
    /* JADX WARN: Code duplicated, block: B:98:0x011c  */
    public static final void f(String str, String str2, String str3, Function0 function0, qim0 qim0Var, hw61 hw61Var, String str4, Float f, boolean z, String str5, String str6, iu30 iu30Var, Function0 function1, b0k b0kVar, int i, int i2) {
        int i3;
        String str7;
        hw61 hw61Var2;
        int i4;
        String str8;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        char c2;
        char c3;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z2;
        b0k b0kVar2;
        Float f2;
        String str9;
        Function0 function2;
        hw61 hw61Var3;
        String str10;
        boolean z3;
        String str11;
        qim0 qim0Var2;
        h311 h311VarV;
        qim0 qim0Var3;
        int i18;
        hw61 hw61VarB;
        Float f3;
        boolean z4;
        String str12;
        String str13;
        int i19;
        String str14;
        String str15;
        Float f4;
        boolean z5;
        String str16;
        Object objT;
        byte b2;
        int i20;
        boolean z6;
        Object objT2;
        boolean z7;
        Object objT3;
        int i21;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(770242120);
        if ((i & 6) == 0) {
            i3 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            str7 = str2;
            i3 |= b0kVar3.g(str7) ? 32 : 16;
        } else {
            str7 = str2;
        }
        if ((i & 384) == 0) {
            i3 |= b0kVar3.g(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= b0kVar3.i(function0) ? 2048 : 1024;
        }
        int i22 = i2 & 16;
        if (i22 == 0) {
            if ((i & 24576) == 0) {
                i3 |= b0kVar3.g(qim0Var) ? 16384 : 8192;
            }
            if ((i & 196608) == 0) {
                hw61Var2 = hw61Var;
                if ((i2 & 32) == 0 || !b0kVar3.g(hw61Var2)) {
                    i21 = 65536;
                } else {
                    i21 = 131072;
                }
                i3 |= i21;
            } else {
                hw61Var2 = hw61Var;
            }
            i4 = i2 & 64;
            if (i4 != 0) {
                i3 |= 1572864;
                str8 = str4;
            } else {
                str8 = str4;
                if ((i & 1572864) == 0) {
                    if (b0kVar3.g(str8)) {
                        i5 = 1048576;
                    } else {
                        i5 = 524288;
                    }
                    i3 |= i5;
                }
            }
            i6 = i2 & 128;
            if (i6 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (b0kVar3.g(f)) {
                    i7 = 8388608;
                } else {
                    i7 = 4194304;
                }
                i3 |= i7;
            }
            i8 = i2 & 256;
            if (i8 != 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (b0kVar3.h(z)) {
                    i9 = 67108864;
                } else {
                    i9 = 33554432;
                }
                i3 |= i9;
            }
            i10 = i2 & 512;
            if (i10 != 0) {
                if ((i & 805306368) == 0) {
                    if (b0kVar3.g(str5)) {
                        i11 = 536870912;
                    } else {
                        i11 = 268435456;
                    }
                    i3 |= i11;
                }
                i12 = i2 & 1024;
                if (i12 != 0) {
                    c2 = 6;
                } else if (b0kVar3.g(str6)) {
                    c2 = 4;
                } else {
                    c2 = 2;
                }
                if (b0kVar3.i(iu30Var)) {
                    c3 = ' ';
                } else {
                    c3 = 16;
                }
                i13 = c2 | c3;
                i14 = i2 & 4096;
                if (i14 != 0) {
                    i16 = i13 | 384;
                } else {
                    if (b0kVar3.i(function1)) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i16 = i13 | i15;
                }
                i17 = i3;
                if ((i3 & 306783379) == 306783378 || (i16 & 147) != 146) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (b0kVar3.Y(i17 & 1, z2)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0 || b0kVar3.E()) {
                        if (i22 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var;
                        }
                        if ((i2 & 32) != 0) {
                            uwr uwrVar = cbx.a;
                            cua cuaVar = cbx.b(b0kVar3).f;
                            hw61VarB = er31.b(8.0f);
                            i18 = i17 & (-458753);
                        } else {
                            i18 = i17;
                            hw61VarB = hw61Var2;
                        }
                        if (i4 != 0) {
                            str8 = null;
                        }
                        if (i6 != 0) {
                            f3 = null;
                        } else {
                            f3 = f;
                        }
                        if (i8 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i10 != 0) {
                            str12 = null;
                        } else {
                            str12 = str5;
                        }
                        str13 = i12 == 0 ? str6 : null;
                        if (i14 != 0) {
                            objT = b0kVar3.T();
                            if (objT == m4cVar) {
                                objT = w3l1.Y;
                                b0kVar3.s0(objT);
                            }
                            function1 = (Function0) objT;
                            str14 = str13;
                            str15 = str8;
                            f4 = f3;
                            z5 = z4;
                            str16 = str12;
                            b2 = 6;
                            i19 = i18;
                            i20 = 256;
                        } else {
                            i19 = i18;
                            str14 = str13;
                            str15 = str8;
                            f4 = f3;
                            z5 = z4;
                            str16 = str12;
                            i20 = 256;
                            b2 = 6;
                        }
                    } else {
                        b0kVar3.b0();
                        if ((i2 & 32) != 0) {
                            f4 = f;
                            z5 = z;
                            str16 = str5;
                            str14 = str6;
                            function1 = function1;
                            i19 = i17 & (-458753);
                            hw61VarB = hw61Var2;
                            str15 = str8;
                            i20 = 256;
                            b2 = 6;
                            qim0Var3 = qim0Var;
                        } else {
                            qim0Var3 = qim0Var;
                            f4 = f;
                            z5 = z;
                            str16 = str5;
                            str14 = str6;
                            i19 = i17;
                            hw61VarB = hw61Var2;
                            str15 = str8;
                            i20 = 256;
                            b2 = 6;
                        }
                    }
                    b0kVar3.s();
                    zzq0 zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                    if ((i19 & 896) == i20) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    objT2 = b0kVar3.T();
                    if (z6 || objT2 == m4cVar) {
                        objT2 = new bek1(str3, b2);
                        b0kVar3.s0(objT2);
                    }
                    qim0 qim0VarB = s161.b(qim0Var3, false, (iu30) objT2);
                    z7 = (i19 & 7168) == 2048;
                    objT3 = b0kVar3.T();
                    if (z7 || objT3 == m4cVar) {
                        objT3 = new tpj1(function0, (byte) 17);
                        b0kVar3.s0(objT3);
                    }
                    gbx gbxVar = new gbx(z50.c, (Function0) objT3);
                    rcl1 rcl1Var = new rcl1(f4, function1, str7, z5, iu30Var, str15, str16, str, str14);
                    qim0Var = qim0Var3;
                    Function0 function3 = function1;
                    b0kVar2 = b0kVar3;
                    hw61 hw61Var4 = hw61VarB;
                    cwl1.b(qim0VarB, (tl3) null, hw61Var4, (pgx) null, zzq0Var, (max) null, false, (idn0) null, (ga80) null, gbxVar, (gbx) null, apo.r(1039538929, rcl1Var, b0kVar3), b0kVar2, ((i19 >> 9) & 896) | 24576, 48, 1514);
                    str9 = str14;
                    f2 = f4;
                    str10 = str15;
                    z3 = z5;
                    str11 = str16;
                    hw61Var3 = hw61Var4;
                    function2 = function3;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    f2 = f;
                    str9 = str6;
                    function2 = function1;
                    hw61Var3 = hw61Var2;
                    str10 = str8;
                    z3 = z;
                    str11 = str5;
                }
                qim0Var2 = qim0Var;
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new scl1(str, str2, str3, function0, qim0Var2, hw61Var3, str10, f2, z3, str11, str9, iu30Var, function2, i, i2);
                }
            }
            i3 |= 805306368;
            i12 = i2 & 1024;
            if (i12 != 0) {
                c2 = 6;
            } else if (b0kVar3.g(str6)) {
                c2 = 4;
            } else {
                c2 = 2;
            }
            if (b0kVar3.i(iu30Var)) {
                c3 = ' ';
            } else {
                c3 = 16;
            }
            i13 = c2 | c3;
            i14 = i2 & 4096;
            if (i14 != 0) {
                i16 = i13 | 384;
            } else {
                if (b0kVar3.i(function1)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i16 = i13 | i15;
            }
            i17 = i3;
            if ((i3 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (b0kVar3.Y(i17 & 1, z2)) {
                b0kVar3.d0();
                if ((i & 1) != 0) {
                    if (i22 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var;
                    }
                    if ((i2 & 32) != 0) {
                        uwr uwrVar2 = cbx.a;
                        cua cuaVar2 = cbx.b(b0kVar3).f;
                        hw61VarB = er31.b(8.0f);
                        i18 = i17 & (-458753);
                    } else {
                        i18 = i17;
                        hw61VarB = hw61Var2;
                    }
                    if (i4 != 0) {
                        str8 = null;
                    }
                    if (i6 != 0) {
                        f3 = null;
                    } else {
                        f3 = f;
                    }
                    if (i8 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i10 != 0) {
                        str12 = null;
                    } else {
                        str12 = str5;
                    }
                    if (i12 == 0) {
                    }
                    if (i14 != 0) {
                        objT = b0kVar3.T();
                        if (objT == m4cVar) {
                            objT = w3l1.Y;
                            b0kVar3.s0(objT);
                        }
                        function1 = (Function0) objT;
                        str14 = str13;
                        str15 = str8;
                        f4 = f3;
                        z5 = z4;
                        str16 = str12;
                        b2 = 6;
                        i19 = i18;
                        i20 = 256;
                    } else {
                        i19 = i18;
                        str14 = str13;
                        str15 = str8;
                        f4 = f3;
                        z5 = z4;
                        str16 = str12;
                        i20 = 256;
                        b2 = 6;
                    }
                } else {
                    if (i22 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var;
                    }
                    if ((i2 & 32) != 0) {
                        uwr uwrVar3 = cbx.a;
                        cua cuaVar3 = cbx.b(b0kVar3).f;
                        hw61VarB = er31.b(8.0f);
                        i18 = i17 & (-458753);
                    } else {
                        i18 = i17;
                        hw61VarB = hw61Var2;
                    }
                    if (i4 != 0) {
                        str8 = null;
                    }
                    if (i6 != 0) {
                        f3 = null;
                    } else {
                        f3 = f;
                    }
                    if (i8 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i10 != 0) {
                        str12 = null;
                    } else {
                        str12 = str5;
                    }
                    if (i12 == 0) {
                    }
                    if (i14 != 0) {
                        objT = b0kVar3.T();
                        if (objT == m4cVar) {
                            objT = w3l1.Y;
                            b0kVar3.s0(objT);
                        }
                        function1 = (Function0) objT;
                        str14 = str13;
                        str15 = str8;
                        f4 = f3;
                        z5 = z4;
                        str16 = str12;
                        b2 = 6;
                        i19 = i18;
                        i20 = 256;
                    } else {
                        i19 = i18;
                        str14 = str13;
                        str15 = str8;
                        f4 = f3;
                        z5 = z4;
                        str16 = str12;
                        i20 = 256;
                        b2 = 6;
                    }
                }
                b0kVar3.s();
                zzq0 zzq0Var2 = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                if ((i19 & 896) == i20) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objT2 = b0kVar3.T();
                if (z6) {
                    objT2 = new bek1(str3, b2);
                    b0kVar3.s0(objT2);
                } else {
                    objT2 = new bek1(str3, b2);
                    b0kVar3.s0(objT2);
                }
                qim0 qim0VarB2 = s161.b(qim0Var3, false, (iu30) objT2);
                if ((i19 & 7168) == 2048) {
                }
                objT3 = b0kVar3.T();
                if (z7) {
                    objT3 = new tpj1(function0, (byte) 17);
                    b0kVar3.s0(objT3);
                } else {
                    objT3 = new tpj1(function0, (byte) 17);
                    b0kVar3.s0(objT3);
                }
                gbx gbxVar2 = new gbx(z50.c, (Function0) objT3);
                rcl1 rcl1Var2 = new rcl1(f4, function1, str7, z5, iu30Var, str15, str16, str, str14);
                qim0Var = qim0Var3;
                Function0 function4 = function1;
                b0kVar2 = b0kVar3;
                hw61 hw61Var5 = hw61VarB;
                cwl1.b(qim0VarB2, (tl3) null, hw61Var5, (pgx) null, zzq0Var2, (max) null, false, (idn0) null, (ga80) null, gbxVar2, (gbx) null, apo.r(1039538929, rcl1Var2, b0kVar3), b0kVar2, ((i19 >> 9) & 896) | 24576, 48, 1514);
                str9 = str14;
                f2 = f4;
                str10 = str15;
                z3 = z5;
                str11 = str16;
                hw61Var3 = hw61Var5;
                function2 = function4;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                f2 = f;
                str9 = str6;
                function2 = function1;
                hw61Var3 = hw61Var2;
                str10 = str8;
                z3 = z;
                str11 = str5;
            }
            qim0Var2 = qim0Var;
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new scl1(str, str2, str3, function0, qim0Var2, hw61Var3, str10, f2, z3, str11, str9, iu30Var, function2, i, i2);
            }
        }
        i3 |= 24576;
        if ((i & 196608) == 0) {
            hw61Var2 = hw61Var;
            if ((i2 & 32) == 0) {
                i21 = 65536;
            } else {
                i21 = 65536;
            }
            i3 |= i21;
        } else {
            hw61Var2 = hw61Var;
        }
        i4 = i2 & 64;
        if (i4 != 0) {
            i3 |= 1572864;
            str8 = str4;
        } else {
            str8 = str4;
            if ((i & 1572864) == 0) {
                if (b0kVar3.g(str8)) {
                    i5 = 1048576;
                } else {
                    i5 = 524288;
                }
                i3 |= i5;
            }
        }
        i6 = i2 & 128;
        if (i6 != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            if (b0kVar3.g(f)) {
                i7 = 8388608;
            } else {
                i7 = 4194304;
            }
            i3 |= i7;
        }
        i8 = i2 & 256;
        if (i8 != 0) {
            i3 |= 100663296;
        } else if ((i & 100663296) == 0) {
            if (b0kVar3.h(z)) {
                i9 = 67108864;
            } else {
                i9 = 33554432;
            }
            i3 |= i9;
        }
        i10 = i2 & 512;
        if (i10 != 0) {
            if ((i & 805306368) == 0) {
                if (b0kVar3.g(str5)) {
                    i11 = 536870912;
                } else {
                    i11 = 268435456;
                }
                i3 |= i11;
            }
            i12 = i2 & 1024;
            if (i12 != 0) {
                c2 = 6;
            } else if (b0kVar3.g(str6)) {
                c2 = 4;
            } else {
                c2 = 2;
            }
            if (b0kVar3.i(iu30Var)) {
                c3 = ' ';
            } else {
                c3 = 16;
            }
            i13 = c2 | c3;
            i14 = i2 & 4096;
            if (i14 != 0) {
                i16 = i13 | 384;
            } else {
                if (b0kVar3.i(function1)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i16 = i13 | i15;
            }
            i17 = i3;
            if ((i3 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (b0kVar3.Y(i17 & 1, z2)) {
                b0kVar3.d0();
                if ((i & 1) != 0) {
                    if (i22 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var;
                    }
                    if ((i2 & 32) != 0) {
                        uwr uwrVar4 = cbx.a;
                        cua cuaVar4 = cbx.b(b0kVar3).f;
                        hw61VarB = er31.b(8.0f);
                        i18 = i17 & (-458753);
                    } else {
                        i18 = i17;
                        hw61VarB = hw61Var2;
                    }
                    if (i4 != 0) {
                        str8 = null;
                    }
                    if (i6 != 0) {
                        f3 = null;
                    } else {
                        f3 = f;
                    }
                    if (i8 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i10 != 0) {
                        str12 = null;
                    } else {
                        str12 = str5;
                    }
                    if (i12 == 0) {
                    }
                    if (i14 != 0) {
                        objT = b0kVar3.T();
                        if (objT == m4cVar) {
                            objT = w3l1.Y;
                            b0kVar3.s0(objT);
                        }
                        function1 = (Function0) objT;
                        str14 = str13;
                        str15 = str8;
                        f4 = f3;
                        z5 = z4;
                        str16 = str12;
                        b2 = 6;
                        i19 = i18;
                        i20 = 256;
                    } else {
                        i19 = i18;
                        str14 = str13;
                        str15 = str8;
                        f4 = f3;
                        z5 = z4;
                        str16 = str12;
                        i20 = 256;
                        b2 = 6;
                    }
                } else {
                    if (i22 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var;
                    }
                    if ((i2 & 32) != 0) {
                        uwr uwrVar5 = cbx.a;
                        cua cuaVar5 = cbx.b(b0kVar3).f;
                        hw61VarB = er31.b(8.0f);
                        i18 = i17 & (-458753);
                    } else {
                        i18 = i17;
                        hw61VarB = hw61Var2;
                    }
                    if (i4 != 0) {
                        str8 = null;
                    }
                    if (i6 != 0) {
                        f3 = null;
                    } else {
                        f3 = f;
                    }
                    if (i8 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i10 != 0) {
                        str12 = null;
                    } else {
                        str12 = str5;
                    }
                    if (i12 == 0) {
                    }
                    if (i14 != 0) {
                        objT = b0kVar3.T();
                        if (objT == m4cVar) {
                            objT = w3l1.Y;
                            b0kVar3.s0(objT);
                        }
                        function1 = (Function0) objT;
                        str14 = str13;
                        str15 = str8;
                        f4 = f3;
                        z5 = z4;
                        str16 = str12;
                        b2 = 6;
                        i19 = i18;
                        i20 = 256;
                    } else {
                        i19 = i18;
                        str14 = str13;
                        str15 = str8;
                        f4 = f3;
                        z5 = z4;
                        str16 = str12;
                        i20 = 256;
                        b2 = 6;
                    }
                }
                b0kVar3.s();
                zzq0 zzq0Var3 = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                if ((i19 & 896) == i20) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objT2 = b0kVar3.T();
                if (z6) {
                    objT2 = new bek1(str3, b2);
                    b0kVar3.s0(objT2);
                } else {
                    objT2 = new bek1(str3, b2);
                    b0kVar3.s0(objT2);
                }
                qim0 qim0VarB3 = s161.b(qim0Var3, false, (iu30) objT2);
                if ((i19 & 7168) == 2048) {
                }
                objT3 = b0kVar3.T();
                if (z7) {
                    objT3 = new tpj1(function0, (byte) 17);
                    b0kVar3.s0(objT3);
                } else {
                    objT3 = new tpj1(function0, (byte) 17);
                    b0kVar3.s0(objT3);
                }
                gbx gbxVar3 = new gbx(z50.c, (Function0) objT3);
                rcl1 rcl1Var3 = new rcl1(f4, function1, str7, z5, iu30Var, str15, str16, str, str14);
                qim0Var = qim0Var3;
                Function0 function5 = function1;
                b0kVar2 = b0kVar3;
                hw61 hw61Var6 = hw61VarB;
                cwl1.b(qim0VarB3, (tl3) null, hw61Var6, (pgx) null, zzq0Var3, (max) null, false, (idn0) null, (ga80) null, gbxVar3, (gbx) null, apo.r(1039538929, rcl1Var3, b0kVar3), b0kVar2, ((i19 >> 9) & 896) | 24576, 48, 1514);
                str9 = str14;
                f2 = f4;
                str10 = str15;
                z3 = z5;
                str11 = str16;
                hw61Var3 = hw61Var6;
                function2 = function5;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                f2 = f;
                str9 = str6;
                function2 = function1;
                hw61Var3 = hw61Var2;
                str10 = str8;
                z3 = z;
                str11 = str5;
            }
            qim0Var2 = qim0Var;
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new scl1(str, str2, str3, function0, qim0Var2, hw61Var3, str10, f2, z3, str11, str9, iu30Var, function2, i, i2);
            }
        }
        i3 |= 805306368;
        i12 = i2 & 1024;
        if (i12 != 0) {
            c2 = 6;
        } else if (b0kVar3.g(str6)) {
            c2 = 4;
        } else {
            c2 = 2;
        }
        if (b0kVar3.i(iu30Var)) {
            c3 = ' ';
        } else {
            c3 = 16;
        }
        i13 = c2 | c3;
        i14 = i2 & 4096;
        if (i14 != 0) {
            i16 = i13 | 384;
        } else {
            if (b0kVar3.i(function1)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i16 = i13 | i15;
        }
        i17 = i3;
        if ((i3 & 306783379) == 306783378) {
            z2 = true;
        } else {
            z2 = true;
        }
        if (b0kVar3.Y(i17 & 1, z2)) {
            b0kVar3.d0();
            if ((i & 1) != 0) {
                if (i22 != 0) {
                    qim0Var3 = nim0.a;
                } else {
                    qim0Var3 = qim0Var;
                }
                if ((i2 & 32) != 0) {
                    uwr uwrVar6 = cbx.a;
                    cua cuaVar6 = cbx.b(b0kVar3).f;
                    hw61VarB = er31.b(8.0f);
                    i18 = i17 & (-458753);
                } else {
                    i18 = i17;
                    hw61VarB = hw61Var2;
                }
                if (i4 != 0) {
                    str8 = null;
                }
                if (i6 != 0) {
                    f3 = null;
                } else {
                    f3 = f;
                }
                if (i8 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if (i10 != 0) {
                    str12 = null;
                } else {
                    str12 = str5;
                }
                if (i12 == 0) {
                }
                if (i14 != 0) {
                    objT = b0kVar3.T();
                    if (objT == m4cVar) {
                        objT = w3l1.Y;
                        b0kVar3.s0(objT);
                    }
                    function1 = (Function0) objT;
                    str14 = str13;
                    str15 = str8;
                    f4 = f3;
                    z5 = z4;
                    str16 = str12;
                    b2 = 6;
                    i19 = i18;
                    i20 = 256;
                } else {
                    i19 = i18;
                    str14 = str13;
                    str15 = str8;
                    f4 = f3;
                    z5 = z4;
                    str16 = str12;
                    i20 = 256;
                    b2 = 6;
                }
            } else {
                if (i22 != 0) {
                    qim0Var3 = nim0.a;
                } else {
                    qim0Var3 = qim0Var;
                }
                if ((i2 & 32) != 0) {
                    uwr uwrVar7 = cbx.a;
                    cua cuaVar7 = cbx.b(b0kVar3).f;
                    hw61VarB = er31.b(8.0f);
                    i18 = i17 & (-458753);
                } else {
                    i18 = i17;
                    hw61VarB = hw61Var2;
                }
                if (i4 != 0) {
                    str8 = null;
                }
                if (i6 != 0) {
                    f3 = null;
                } else {
                    f3 = f;
                }
                if (i8 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if (i10 != 0) {
                    str12 = null;
                } else {
                    str12 = str5;
                }
                if (i12 == 0) {
                }
                if (i14 != 0) {
                    objT = b0kVar3.T();
                    if (objT == m4cVar) {
                        objT = w3l1.Y;
                        b0kVar3.s0(objT);
                    }
                    function1 = (Function0) objT;
                    str14 = str13;
                    str15 = str8;
                    f4 = f3;
                    z5 = z4;
                    str16 = str12;
                    b2 = 6;
                    i19 = i18;
                    i20 = 256;
                } else {
                    i19 = i18;
                    str14 = str13;
                    str15 = str8;
                    f4 = f3;
                    z5 = z4;
                    str16 = str12;
                    i20 = 256;
                    b2 = 6;
                }
            }
            b0kVar3.s();
            zzq0 zzq0Var4 = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
            if ((i19 & 896) == i20) {
                z6 = true;
            } else {
                z6 = false;
            }
            objT2 = b0kVar3.T();
            if (z6) {
                objT2 = new bek1(str3, b2);
                b0kVar3.s0(objT2);
            } else {
                objT2 = new bek1(str3, b2);
                b0kVar3.s0(objT2);
            }
            qim0 qim0VarB4 = s161.b(qim0Var3, false, (iu30) objT2);
            if ((i19 & 7168) == 2048) {
            }
            objT3 = b0kVar3.T();
            if (z7) {
                objT3 = new tpj1(function0, (byte) 17);
                b0kVar3.s0(objT3);
            } else {
                objT3 = new tpj1(function0, (byte) 17);
                b0kVar3.s0(objT3);
            }
            gbx gbxVar4 = new gbx(z50.c, (Function0) objT3);
            rcl1 rcl1Var4 = new rcl1(f4, function1, str7, z5, iu30Var, str15, str16, str, str14);
            qim0Var = qim0Var3;
            Function0 function6 = function1;
            b0kVar2 = b0kVar3;
            hw61 hw61Var7 = hw61VarB;
            cwl1.b(qim0VarB4, (tl3) null, hw61Var7, (pgx) null, zzq0Var4, (max) null, false, (idn0) null, (ga80) null, gbxVar4, (gbx) null, apo.r(1039538929, rcl1Var4, b0kVar3), b0kVar2, ((i19 >> 9) & 896) | 24576, 48, 1514);
            str9 = str14;
            f2 = f4;
            str10 = str15;
            z3 = z5;
            str11 = str16;
            hw61Var3 = hw61Var7;
            function2 = function6;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            f2 = f;
            str9 = str6;
            function2 = function1;
            hw61Var3 = hw61Var2;
            str10 = str8;
            z3 = z;
            str11 = str5;
        }
        qim0Var2 = qim0Var;
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new scl1(str, str2, str3, function0, qim0Var2, hw61Var3, str10, f2, z3, str11, str9, iu30Var, function2, i, i2);
        }
    }

    public static cim0 g(JSONObject jSONObject) {
        float[] fArr;
        float[] fArr2;
        if (jSONObject == null) {
            return null;
        }
        try {
            String string = jSONObject.getString("use_case");
            String string2 = jSONObject.getString("asset_uri");
            String strOptString = jSONObject.optString("rules_uri", null);
            int i = jSONObject.getInt("version_id");
            dim0 dim0Var = dim0.a;
            JSONArray jSONArray = jSONObject.getJSONArray("thresholds");
            Set set = dhn.a;
            if (set.contains(dim0.class)) {
                fArr2 = null;
            } else {
                try {
                    if (set.contains(dim0Var) || jSONArray == null) {
                        fArr = null;
                        fArr2 = fArr;
                    } else {
                        try {
                            fArr = new float[jSONArray.length()];
                            int length = jSONArray.length();
                            for (int i2 = 0; i2 < length; i2++) {
                                try {
                                    fArr[i2] = Float.parseFloat(jSONArray.getString(i2));
                                } catch (JSONException unused) {
                                }
                            }
                        } catch (Throwable th) {
                            dhn.a(dim0Var, th);
                            fArr = null;
                            fArr2 = fArr;
                            return new cim0(string, string2, strOptString, i, fArr2);
                        }
                        fArr2 = fArr;
                    }
                } catch (Throwable th2) {
                    dhn.a(dim0.class, th2);
                    fArr2 = null;
                }
            }
            return new cim0(string, string2, strOptString, i, fArr2);
        } catch (Exception unused2) {
            return null;
        }
    }

    public static final void h(kd31 kd31Var, float f) {
        kd31Var.b(f);
        kd31Var.i(2);
        kd31Var.E(kd31Var.T0.h() * 50.0f * (1.0f - f));
    }

    public static final ven0 i(mr20 mr20Var, Object obj, b0k b0kVar, int i) {
        return rwq.g(mr20Var, obj, null, b0kVar, i, 2);
    }

    public static final ven0 j(zob1 zob1Var, b0k b0kVar) {
        return rwq.h(zob1Var, b0kVar, 0);
    }

    public static final bfn0 k() {
        yt91 yt91Var = yv91.b;
        bfn0 bfn0Var = (bfn0) yt91Var.e();
        if (bfn0Var != null) {
            return bfn0Var;
        }
        bfn0 bfn0Var2 = new bfn0(0, new ndt[0]);
        yt91Var.j(bfn0Var2);
        return bfn0Var2;
    }

    public static final mdt l(Function0 function0) {
        return yv91.a(function0);
    }

    public static final mdt m(Function0 function0) {
        kcx0 kcx0Var = kcx0.R0;
        yt91 yt91Var = yv91.a;
        return new mdt(function0, kcx0Var);
    }

    public static void n(cim0 cim0Var, ArrayList arrayList) {
        File[] fileArrListFiles;
        String str = cim0Var.a;
        int i = cim0Var.d;
        File fileB = mpi1.b();
        if (fileB != null && (fileArrListFiles = fileB.listFiles()) != null && fileArrListFiles.length != 0) {
            String str2 = str + '_' + i;
            for (File file : fileArrListFiles) {
                String name = file.getName();
                if (nhc1.Y(name, str, false) && !nhc1.Y(name, str2, false)) {
                    file.delete();
                }
            }
        }
        String str3 = str + '_' + i;
        String str4 = cim0Var.b;
        p4u p4uVar = new p4u(arrayList);
        File file2 = new File(mpi1.b(), str3);
        if (file2.exists()) {
            p4uVar.b(file2);
        } else {
            new b420(str4, file2, p4uVar).execute(new String[0]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002c  */
    public static String o(v740 v740Var) {
        String strY0;
        u740 u740Var = (u740) o7h.s0(v740Var.a);
        if (u740Var != null) {
            ArrayList arrayList = u740Var.b;
            ArrayList arrayList2 = (arrayList.isEmpty() || arrayList.size() <= 1) ? null : arrayList;
            if (arrayList2 != null) {
                strY0 = o7h.y0(arrayList2, " • ", (String) null, (String) null, r640.g, 30);
            } else {
                strY0 = null;
            }
        } else {
            strY0 = null;
        }
        if (u740Var == null) {
            return null;
        }
        String str = u740Var.c.a;
        return strY0 != null ? f4i1.f(str, "\n", strY0) : str;
    }

    public static final bw91 p() {
        return new bw91();
    }

    public static final bw91 q(Object... objArr) {
        return v8r.p(objArr);
    }

    public static final dw91 r() {
        return new dw91();
    }

    public static final hrr0 s(Object obj, wv91 wv91Var) {
        return new hrr0(obj, wv91Var);
    }

    public static final ven0 u(String str, int i, boolean z, boolean z2, Function0 function0, b0k b0kVar, int i2, int i3) {
        if ((i3 & 16) != 0) {
            x340 x340Var = (x340) b0kVar;
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = orc1.e1;
                x340Var.s0(objT);
            }
            function0 = (Function0) objT;
        }
        Function0 function1 = function0;
        ilv.a.getClass();
        hsi1 hsi1Var = new hsi1(str, Float.valueOf(0.0f), Float.valueOf(1.0f), new pxg1(CtaType.SEE_ALL_SHOWS_FIELD_NUMBER, i, flv.g), rno1.a);
        int i4 = i2 >> 3;
        return zod.S(hsi1Var, z, z2, function1, b0kVar, (i4 & 112) | 8 | (i4 & 896) | (i4 & 7168), 0);
    }

    public static final ven0 v(Object obj, b0k b0kVar) {
        return v8r.s(obj, b0kVar);
    }

    public static final int w(m8w0 m8w0Var) {
        if (m8w0Var instanceof l8w0) {
            return apo.w(((l8w0) m8w0Var).a);
        }
        if (m8w0Var.equals(j8w0.a)) {
            return 2131958854;
        }
        if (m8w0Var.equals(k8w0.a)) {
            return 2131958856;
        }
        eg.o();
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0157  */
    /* JADX WARN: Code duplicated, block: B:52:0x015d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0168  */
    /* JADX WARN: Code duplicated, block: B:56:0x016e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0181  */
    /* JADX WARN: Code duplicated, block: B:60:0x0186  */
    /* JADX WARN: Code duplicated, block: B:63:0x018a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0194 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0196  */
    /* JADX WARN: Code duplicated, block: B:67:0x0199  */
    /* JADX WARN: Code duplicated, block: B:68:0x019c  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b3  */
    public static final uf51 x(Section section) {
        String str;
        t3k1 qf50Var;
        t3k1 t3k1Var;
        SectionCta sectionCtaN;
        String strQ;
        SectionCta sectionCtaN2;
        String strN;
        SectionCta sectionCtaN3;
        gg51 gg51VarO;
        int i;
        int i2;
        SectionMetadata sectionMetadataO;
        String str2;
        String strO;
        String strR;
        SectionTitle sectionTitleP = section.p();
        int iS = sectionTitleP.s();
        int i3 = iS == 0 ? -1 : xlk.b[l1d.C(iS)];
        if (i3 == -1) {
            str = null;
        } else {
            if (i3 == 1) {
                strR = sectionTitleP.r();
            } else if (i3 != 2) {
                if (i3 != 3) {
                    eg.o();
                    return null;
                }
                str = null;
            } else {
                strR = LocalDate.parse(sectionTitleP.o()).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(Locale.getDefault()));
            }
            str = strR;
        }
        String subtitle = section.p().getSubtitle();
        switch (section.n().ordinal()) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
            case 6:
            case 7:
                t3k1Var = null;
                String strQ2 = section.q();
                sectionCtaN = section.p().n();
                if (sectionCtaN != null) {
                    strQ = sectionCtaN.q();
                } else {
                    strQ = null;
                }
                sectionCtaN2 = section.p().n();
                if (sectionCtaN2 != null) {
                    strN = sectionCtaN2.n();
                } else {
                    strN = null;
                }
                boolean zQ = section.p().q();
                sectionCtaN3 = section.p().n();
                if (sectionCtaN3 != null) {
                    gg51VarO = sectionCtaN3.o();
                } else {
                    gg51VarO = null;
                }
                i = gg51VarO != null ? xlk.a[gg51VarO.ordinal()] : -1;
                if (i != 1) {
                    i2 = 2;
                } else if (i != 2) {
                    i2 = 1;
                } else {
                    i2 = 3;
                }
                sectionMetadataO = section.o();
                if (sectionMetadataO != null || (strO = sectionMetadataO.o()) == null || ihc1.y0(strO)) {
                    str2 = null;
                } else {
                    str2 = strO;
                }
                return new uf51(str, subtitle, t3k1Var, strQ2, (pa30) null, (oxc) null, strQ, strN, zQ, i2, str2);
            case 1:
                List itemsList = section.getItemsList();
                ArrayList arrayList = new ArrayList(q7h.U(itemsList, 10));
                Iterator it = itemsList.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Item) it.next()).n());
                }
                qf50Var = new qf50(arrayList);
                t3k1Var = qf50Var;
                String strQ3 = section.q();
                sectionCtaN = section.p().n();
                if (sectionCtaN != null) {
                    strQ = sectionCtaN.q();
                } else {
                    strQ = null;
                }
                sectionCtaN2 = section.p().n();
                if (sectionCtaN2 != null) {
                    strN = sectionCtaN2.n();
                } else {
                    strN = null;
                }
                boolean zQ2 = section.p().q();
                sectionCtaN3 = section.p().n();
                if (sectionCtaN3 != null) {
                    gg51VarO = sectionCtaN3.o();
                } else {
                    gg51VarO = null;
                }
                if (gg51VarO != null) {
                }
                if (i != 1) {
                    i2 = 2;
                } else if (i != 2) {
                    i2 = 1;
                } else {
                    i2 = 3;
                }
                sectionMetadataO = section.o();
                if (sectionMetadataO != null) {
                    str2 = null;
                } else {
                    str2 = null;
                }
                return new uf51(str, subtitle, t3k1Var, strQ3, (pa30) null, (oxc) null, strQ, strN, zQ2, i2, str2);
            case 2:
                List itemsList2 = section.getItemsList();
                ArrayList arrayList2 = new ArrayList(q7h.U(itemsList2, 10));
                Iterator it2 = itemsList2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((Item) it2.next()).n());
                }
                qf50Var = new swd(arrayList2);
                t3k1Var = qf50Var;
                String strQ4 = section.q();
                sectionCtaN = section.p().n();
                if (sectionCtaN != null) {
                    strQ = sectionCtaN.q();
                } else {
                    strQ = null;
                }
                sectionCtaN2 = section.p().n();
                if (sectionCtaN2 != null) {
                    strN = sectionCtaN2.n();
                } else {
                    strN = null;
                }
                boolean zQ3 = section.p().q();
                sectionCtaN3 = section.p().n();
                if (sectionCtaN3 != null) {
                    gg51VarO = sectionCtaN3.o();
                } else {
                    gg51VarO = null;
                }
                if (gg51VarO != null) {
                }
                if (i != 1) {
                    i2 = 2;
                } else if (i != 2) {
                    i2 = 1;
                } else {
                    i2 = 3;
                }
                sectionMetadataO = section.o();
                if (sectionMetadataO != null) {
                    str2 = null;
                } else {
                    str2 = null;
                }
                return new uf51(str, subtitle, t3k1Var, strQ4, (pa30) null, (oxc) null, strQ, strN, zQ3, i2, str2);
            case 3:
                List itemsList3 = section.getItemsList();
                ArrayList arrayList3 = new ArrayList(q7h.U(itemsList3, 10));
                Iterator it3 = itemsList3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((Item) it3.next()).n());
                }
                qf50Var = new pnc0(arrayList3);
                t3k1Var = qf50Var;
                String strQ5 = section.q();
                sectionCtaN = section.p().n();
                if (sectionCtaN != null) {
                    strQ = sectionCtaN.q();
                } else {
                    strQ = null;
                }
                sectionCtaN2 = section.p().n();
                if (sectionCtaN2 != null) {
                    strN = sectionCtaN2.n();
                } else {
                    strN = null;
                }
                boolean zQ4 = section.p().q();
                sectionCtaN3 = section.p().n();
                if (sectionCtaN3 != null) {
                    gg51VarO = sectionCtaN3.o();
                } else {
                    gg51VarO = null;
                }
                if (gg51VarO != null) {
                }
                if (i != 1) {
                    i2 = 2;
                } else if (i != 2) {
                    i2 = 1;
                } else {
                    i2 = 3;
                }
                sectionMetadataO = section.o();
                if (sectionMetadataO != null) {
                    str2 = null;
                } else {
                    str2 = null;
                }
                return new uf51(str, subtitle, t3k1Var, strQ5, (pa30) null, (oxc) null, strQ, strN, zQ4, i2, str2);
            case 4:
                List itemsList4 = section.getItemsList();
                ArrayList arrayList4 = new ArrayList(q7h.U(itemsList4, 10));
                Iterator it4 = itemsList4.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(((Item) it4.next()).n());
                }
                qf50Var = new o660(arrayList4);
                t3k1Var = qf50Var;
                String strQ6 = section.q();
                sectionCtaN = section.p().n();
                if (sectionCtaN != null) {
                    strQ = sectionCtaN.q();
                } else {
                    strQ = null;
                }
                sectionCtaN2 = section.p().n();
                if (sectionCtaN2 != null) {
                    strN = sectionCtaN2.n();
                } else {
                    strN = null;
                }
                boolean zQ5 = section.p().q();
                sectionCtaN3 = section.p().n();
                if (sectionCtaN3 != null) {
                    gg51VarO = sectionCtaN3.o();
                } else {
                    gg51VarO = null;
                }
                if (gg51VarO != null) {
                }
                if (i != 1) {
                    i2 = 2;
                } else if (i != 2) {
                    i2 = 1;
                } else {
                    i2 = 3;
                }
                sectionMetadataO = section.o();
                if (sectionMetadataO != null) {
                    str2 = null;
                } else {
                    str2 = null;
                }
                return new uf51(str, subtitle, t3k1Var, strQ6, (pa30) null, (oxc) null, strQ, strN, zQ5, i2, str2);
            case 5:
                List itemsList5 = section.getItemsList();
                ArrayList arrayList5 = new ArrayList(q7h.U(itemsList5, 10));
                Iterator it5 = itemsList5.iterator();
                while (it5.hasNext()) {
                    arrayList5.add(((Item) it5.next()).n());
                }
                qf50Var = new hol1(arrayList5);
                t3k1Var = qf50Var;
                String strQ7 = section.q();
                sectionCtaN = section.p().n();
                if (sectionCtaN != null) {
                    strQ = sectionCtaN.q();
                } else {
                    strQ = null;
                }
                sectionCtaN2 = section.p().n();
                if (sectionCtaN2 != null) {
                    strN = sectionCtaN2.n();
                } else {
                    strN = null;
                }
                boolean zQ6 = section.p().q();
                sectionCtaN3 = section.p().n();
                if (sectionCtaN3 != null) {
                    gg51VarO = sectionCtaN3.o();
                } else {
                    gg51VarO = null;
                }
                if (gg51VarO != null) {
                }
                if (i != 1) {
                    i2 = 2;
                } else if (i != 2) {
                    i2 = 1;
                } else {
                    i2 = 3;
                }
                sectionMetadataO = section.o();
                if (sectionMetadataO != null) {
                    str2 = null;
                } else {
                    str2 = null;
                }
                return new uf51(str, subtitle, t3k1Var, strQ7, (pa30) null, (oxc) null, strQ, strN, zQ6, i2, str2);
            default:
                eg.o();
                return null;
        }
    }

    public static Next y(kak0 kak0Var, f3k0 f3k0Var) {
        int iC = l1d.C(f3k0Var.a);
        ndm0 ndm0Var = ndm0.a;
        if (iC == 0) {
            return Next.h(kak0.a(kak0Var, ndm0Var, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, (lhg1) null, (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -17, 1048575));
        }
        if (iC == 1) {
            return (kak0Var.a || !l2p1.m(kak0Var)) ? Next.i(kak0.a(kak0Var, ndm0Var, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, (lhg1) null, (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -17, 1048575), Collections.singleton(new k0k0(f3k0Var.b))) : Next.i(kak0.a(kak0Var, ndm0Var, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, (lhg1) null, (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -17, 1048575), Collections.singleton(new d1k0(new s3u(1))));
        }
        eg.o();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00d4  */
    public static final x6b z(l7f0 l7f0Var, x6b x6bVar, ruq0 ruq0Var, Float f) {
        double d;
        Double dValueOf;
        ruq0 ruq0Var2 = ruq0Var;
        double d2 = ruq0Var2.R0;
        x6b x6bVar2 = l7f0Var.b;
        if (x6bVar2 != null) {
            List list = x6bVar2.a;
            if (x6bVar != null) {
                List list2 = x6bVar.a;
                float fP = pqo.p(ruq0Var, f);
                if (!list2.isEmpty() && list2.size() <= list.size()) {
                    List<ekc1> list3 = list2;
                    int i = 0;
                    for (ekc1 ekc1Var : list3) {
                        int i2 = i + 1;
                        float f2 = ekc1Var.b;
                        float f3 = ekc1Var.c;
                        float f4 = ekc1Var.d;
                        int i3 = ruq0Var2.X;
                        Double dValueOf2 = d2 == 0.0d ? Double.valueOf(1.0d) : (Math.abs(d2) > Double.MAX_VALUE || d2 <= 0.0d) ? null : Double.valueOf(d2);
                        if (dValueOf2 != null) {
                            double dDoubleValue = dValueOf2.doubleValue();
                            if (i3 <= 0 || Math.abs(f2) > Float.MAX_VALUE || f2 <= 0.0f) {
                                d = d2;
                            } else {
                                d = d2;
                                double dO = ((double) pqo.o(ruq0Var, f)) * dDoubleValue;
                                if (Math.abs(dO) <= Double.MAX_VALUE) {
                                    Double dValueOf3 = Double.valueOf(dO);
                                    if (50.0d > dO || dO > 300.0d) {
                                        dValueOf3 = null;
                                    }
                                    dValueOf = Double.valueOf((((60000.0d / (dValueOf3 != null ? dValueOf3.doubleValue() : 120.0d)) * ((double) f2)) * dDoubleValue) / ((double) i3));
                                }
                            }
                            dValueOf = null;
                        } else {
                            d = d2;
                            dValueOf = null;
                        }
                        if (dValueOf == null) {
                            return null;
                        }
                        double dDoubleValue2 = dValueOf.doubleValue();
                        if (ekc1Var.a != 1 || Math.abs(f2) > Float.MAX_VALUE || Math.abs(f2 - ((ekc1) list.get(i)).b) > 1.0E-6f || Math.abs(f4) > Float.MAX_VALUE || f3 >= f4 || f4 > 1.0f || !pqo.l(f3, f2, fP) || f3 > (1.0d - dDoubleValue2) + 9.999999974752427E-7d) {
                            return null;
                        }
                        if (i > 0 && f3 < ((ekc1) list2.get(i - 1)).d) {
                            return null;
                        }
                        ruq0Var2 = ruq0Var;
                        i = i2;
                        d2 = d;
                    }
                    if (Math.abs(((ekc1) o7h.A0(list2)).d - 1.0f) > 1.0E-6f) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList(q7h.U(list3, 10));
                    int i4 = 0;
                    for (Object obj : list3) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            p7h.T();
                            throw null;
                        }
                        ekc1 ekc1Var2 = (ekc1) obj;
                        arrayList.add(ekc1.a(ekc1Var2, ((ekc1) list.get(i4)).b, 0.0f, i4 == p7h.L(list2) ? 1.0f : ekc1Var2.d, 5));
                        i4 = i5;
                    }
                    return new x6b(arrayList);
                }
            }
        }
        return null;
    }
}
