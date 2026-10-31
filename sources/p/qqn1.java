package p;

import android.hardware.camera2.CameraCharacteristics;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Parcel;
import androidx.camera.camera2.internal.compat.quirk.AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk;
import androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk;
import androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk;
import androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk;
import androidx.camera.camera2.internal.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.FlashTooSlowQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFlashNotFireQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureWashedOutImageQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import androidx.camera.camera2.internal.compat.quirk.JpegCaptureDownsizingQuirk;
import androidx.camera.camera2.internal.compat.quirk.JpegHalCorruptImageQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk;
import androidx.camera.camera2.internal.compat.quirk.TemporalNoiseQuirk;
import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import androidx.camera.camera2.internal.compat.quirk.YuvImageOnePixelShiftQuirk;
import androidx.compose.ui.unit.TextUnit;
import app.p000rive.semantics.SemanticState;
import com.spotify.base.java.logging.Logger;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class qqn1 {
    public static final int[] a = {13, 15, 14};
    public static b180 b;

    public static long A() {
        return toa0.x;
    }

    public static long B() {
        return toa0.w;
    }

    public static long C() {
        return toa0.d;
    }

    public static long D() {
        return toa0.c;
    }

    public static long E() {
        return toa0.H;
    }

    public static long F() {
        return toa0.I;
    }

    public static long G() {
        return toa0.J;
    }

    public static long H() {
        return toa0.G;
    }

    public static long I() {
        return toa0.F;
    }

    public static long J() {
        return toa0.O;
    }

    public static long K() {
        return toa0.L;
    }

    public static long L() {
        return toa0.K;
    }

    public static long M() {
        return toa0.N;
    }

    public static long N() {
        return toa0.M;
    }

    public static long O() {
        return toa0.E;
    }

    public static long P() {
        return toa0.D;
    }

    public static long Q() {
        return toa0.B;
    }

    public static long R() {
        return toa0.q;
    }

    public static final int[] S(NetworkRequest networkRequest) {
        if (Build.VERSION.SDK_INT >= 31) {
            return mb4.N(networkRequest);
        }
        int[] iArr = {2, 0, 3, 6, 10, 9, 8, 4, 1, 5};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            int i2 = iArr[i];
            if (ph5.H(networkRequest, i2)) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        return o7h.k1(arrayList);
    }

    public static long T() {
        return toa0.m;
    }

    public static long U() {
        return toa0.n;
    }

    public static long V() {
        return toa0.o;
    }

    public static long W() {
        return toa0.p;
    }

    public static final boolean X(mdz mdzVar) {
        List list = mdzVar.p;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r7h.W(((hdz) it.next()).a, arrayList);
        }
        return arrayList.contains("MOGEF-19+");
    }

    public static final mr20 Y(g0l g0lVar, dpb dpbVar, dpb dpbVar2, Set set, Function0 function0, vu30 vu30Var) {
        return !dpbVar.isEnabled() ? new huz(z6x.a, (byte) 10) : new ht20(new rjm(new p3t(yoi1.g(hqq0.K(g0lVar)), (byte) 27), dpbVar2, function0, set, vu30Var, (byte) 1), new pk50(2, (lnm) null, (byte) 0));
    }

    public static final String Z(phc phcVar, blc0 blc0Var) {
        try {
            String strA = f9a.a(phcVar.t());
            int iOrdinal = blc0Var.ordinal();
            if (iOrdinal == 44) {
                return y6b1.b(strA).toString();
            }
            if (iOrdinal != 926) {
                return null;
            }
            return y6b1.m(strA).toString();
        } catch (IllegalArgumentException e) {
            Logger.e(e, "Failed to convert Spotify ID to Base62.", new Object[0]);
            return null;
        }
    }

    public static final void a(int i, String str, String str2, b0k b0kVar, qim0 qim0Var) throws Throwable {
        String str3;
        qim0 qim0Var2;
        Object vs0Var;
        String str4;
        Throwable th;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1259552094);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | 432;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = c97.b(1.0f);
                x340Var.s0(objT);
            }
            o95 o95Var = (o95) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q(str);
                x340Var.s0(objT2);
            }
            ven0 ven0Var = (ven0) objT2;
            boolean zI = ((i2 & 14) == 4) | x340Var.i(ven0Var) | x340Var.i(o95Var);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                vs0Var = new vs0(ven0Var, str, o95Var, (lnm) null, (byte) 3);
                str4 = str;
                th = null;
                x340Var.s0(vs0Var);
            } else {
                vs0Var = objT3;
                th = null;
                str4 = str;
            }
            qxd0.t(str4, x340Var, (vu30) vs0Var);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).d;
            cpr0 cpr0Var = lee1Var.b;
            wat watVar = (wat) x340Var.k(t4k.h);
            boolean zG = x340Var.g(lee1Var) | x340Var.g(watVar);
            Object objT4 = x340Var.T();
            if (zG || objT4 == m4cVar) {
                objT4 = ktd.k((TextUnit.e(cpr0Var.c) ? watVar.y(cpr0Var.c) : TextUnit.c(cpr0Var.c)) * 2.0f, x340Var);
            } else {
                th = th;
                o95Var = o95Var;
            }
            float f = ((p3v) objT4).a;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarThen = u291.h(u291.f(qim0Var3, 1.0f), f).then("".length() > 0 ? anm1.N("", qim0Var3) : qim0Var3);
            boolean zI2 = x340Var.i((Object) 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00f6: INVOKE (r10v4 'zI2' boolean) = (r12v1 'x340Var' p.x340), (wrap java.lang.Object:?: CAST (java.lang.Object) (r1v2 ?? I:??[OBJECT, ARRAY])) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[DECLARE_VAR] (LINE:247) in method: p.qqn1.a(int, java.lang.String, java.lang.String, p.b0k, p.qim0):void, file: /workspace/spotify-analysis/dex-input/classes3.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v2 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 464
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.qqn1.a(int, java.lang.String, java.lang.String, p.b0k, p.qim0):void");
        }

        public static void a0(nsn0 nsn0Var, Parcel parcel) {
            if (nsn0Var instanceof lsn0) {
                parcel.writeString("USER_INTERACTION");
                lsn0 lsn0Var = (lsn0) nsn0Var;
                parcel.writeSerializable(lsn0Var.a);
                parcel.writeString(lsn0Var.b);
                return;
            }
            if (nsn0Var instanceof esn0) {
                parcel.writeString("DEEP_LINK");
                parcel.writeString(((esn0) nsn0Var).a);
                return;
            }
            if (nsn0Var instanceof yrn0) {
                parcel.writeString("BACK");
                parcel.writeSerializable(((yrn0) nsn0Var).a);
                return;
            }
            if (nsn0Var instanceof zrn0) {
                parcel.writeString("BACKEND");
                parcel.writeSerializable(((zrn0) nsn0Var).a);
                return;
            }
            if (nsn0Var.equals(fsn0.a)) {
                parcel.writeString("LAUNCHER");
                return;
            }
            if (nsn0Var.equals(bsn0.a)) {
                parcel.writeString("CLIENT_LOST_FOCUS");
                return;
            }
            if (nsn0Var.equals(asn0.a)) {
                parcel.writeString("CLIENT_GAINED_FOCUS");
                return;
            }
            if (nsn0Var.equals(jsn0.a)) {
                parcel.writeString("UNKNOWN");
                return;
            }
            if (nsn0Var.equals(gsn0.a)) {
                parcel.writeString("PASSTHROUGH");
                return;
            }
            if (nsn0Var.equals(hsn0.a)) {
                parcel.writeString("POLICY_CHECK");
                return;
            }
            if (nsn0Var.equals(isn0.a)) {
                parcel.writeString("TIME_OUT");
            } else if (!(nsn0Var instanceof dsn0)) {
                eg.o();
            } else {
                parcel.writeString("CROSS_USER_HANDOFF");
                parcel.writeSerializable(((dsn0) nsn0Var).a);
            }
        }

        public static final void b(ygg0 ygg0Var, keg0 keg0Var, iu30 iu30Var, b0k b0kVar, int i) {
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(412239564);
            int i2 = (x340Var.i(ygg0Var) ? 4 : 2) | i | (x340Var.i(iu30Var) ? SemanticState.Hidden : SemanticState.Focused);
            if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                irn1.u((qim0) null, (vu30) null, (vu30) null, (erl1) null, apo.r(761828723, new iwf0(iu30Var, ygg0Var, keg0Var, (byte) 11), x340Var), x340Var, 24576, 15);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new qae0(ygg0Var, keg0Var, iu30Var, i, (byte) 24);
            }
        }

        public static final void c(List list, xtb0 xtb0Var, b0k b0kVar, int i) {
            List list2;
            xtb0 xtb0Var2;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-793514188);
            int i2 = (x340Var.g(list) ? 4 : 2) | i | (x340Var.i(xtb0Var) ? 32 : 16);
            if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
                Object objT = x340Var.T();
                Object obj = fkj0.X;
                if (objT == obj) {
                    objT = new LinkedHashSet();
                    x340Var.s0(objT);
                }
                Set set = (Set) objT;
                boolean zI = x340Var.i(xtb0Var) | ((i2 & 14) == 4);
                Object objT2 = x340Var.T();
                if (zI || objT2 == obj) {
                    list2 = list;
                    xtb0Var2 = xtb0Var;
                    n641 n641Var = new n641(list2, set, xtb0Var2, (lnm) null, (byte) 7);
                    x340Var.s0(n641Var);
                    objT2 = n641Var;
                } else {
                    list2 = list;
                    xtb0Var2 = xtb0Var;
                }
                qxd0.t(list2, x340Var, (vu30) objT2);
            } else {
                list2 = list;
                xtb0Var2 = xtb0Var;
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new tc11(list2, xtb0Var2, i, (byte) 28);
            }
        }

        public static final void d(vta1 vta1Var, vta1 vta1Var2, qim0 qim0Var, b0k b0kVar, int i) {
            qim0 qim0Var2;
            b0k b0kVar2 = (x340) b0kVar;
            b0kVar2.k0(973838342);
            int i2 = i | (b0kVar2.i(vta1Var) ? 4 : 2) | (b0kVar2.i(vta1Var2) ? 32 : 16) | 384;
            if (b0kVar2.Y(i2 & 1, (i2 & 147) != 146)) {
                qim0 qim0Var3 = nim0.a;
                qim0 qim0VarZ = uyn1.z(24.0f, 0.0f, 2, voo1.y(u291.f(qim0Var3, 1.0f), voo1.g));
                mbh mbhVarA = jbh.a(h36.c, een.Q0, b0kVar2, 0);
                int iHashCode = Long.hashCode(((x340) b0kVar2).T);
                xos0 xos0VarM = b0kVar2.m();
                qim0 qim0VarE = zr7.E(b0kVar2, qim0VarZ);
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
                String strO0 = cwl1.o0(b0kVar2, 2131962847);
                uwr uwrVar = cbx.a;
                uwo1.e(strO0, uyn1.B(qim0Var3, 0.0f, 16.0f, 0.0f, 0.0f, 13), cbx.d(b0kVar2).d, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2024);
                uwo1.e(cwl1.o0(b0kVar2, 2131962845), uyn1.B(qim0Var3, 0.0f, 8.0f, 0.0f, 0.0f, 13), cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2016);
                b0kVar2 = b0kVar2;
                idx idxVar = new idx(4);
                qim0 qim0VarB = uyn1.B(qim0Var3, 0.0f, 24.0f, 0.0f, 0.0f, 13);
                z50 z50Var = z50.c;
                foo1.c(new gbx(z50Var, vta1Var), idxVar, qim0VarB, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, joj.a, b0kVar2, 0, 48, 2040);
                foo1.c(new gbx(z50Var, vta1Var2), ldx.c, uyn1.B(qim0Var3, 0.0f, 8.0f, 0.0f, 8.0f, 5), (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, joj.b, b0kVar2, 0, 48, 2040);
                b0kVar2.r(true);
                qim0Var2 = qim0Var3;
            } else {
                b0kVar2.b0();
                qim0Var2 = qim0Var;
            }
            h311 h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new wpg1(vta1Var, vta1Var2, qim0Var2, i, (byte) 2);
            }
        }

        public static final void e(List list, qim0 qim0Var, b0k b0kVar, int i) {
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(2140600748);
            int i2 = (x340Var.g(list) ? 4 : 2) | i | 48;
            if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
                boolean z = (i2 & 14) == 4;
                Object objT = x340Var.T();
                if (z || objT == fkj0.X) {
                    objT = new qm0(list, (byte) 7);
                    x340Var.s0(objT);
                }
                qim0 qim0Var2 = nim0.a;
                ejo1.l(6, 0, x340Var, (vu30) objT, qim0Var2);
                qim0Var = qim0Var2;
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new zk6(list, qim0Var, i, (byte) 3);
            }
        }

        public static final mr20 f(war0 war0Var) {
            return o4p1.k(h4p1.f(new k1e0(war0Var, (lnm) null, (byte) 18)), -1, 2);
        }

        public static nsn0 g(Parcel parcel) {
            String string = parcel.readString();
            if (string == null) {
                eg.m("Required value was null.");
                return null;
            }
            int i = 0;
            if (string == null) {
                bhn0.i("Name is null");
            } else if (string.equals("USER_INTERACTION")) {
                i = 1;
            } else if (string.equals("BACK")) {
                i = 2;
            } else if (string.equals("BACKEND")) {
                i = 3;
            } else if (string.equals("LAUNCHER")) {
                i = 4;
            } else if (string.equals("DEEP_LINK")) {
                i = 5;
            } else if (string.equals("CLIENT_LOST_FOCUS")) {
                i = 6;
            } else if (string.equals("CLIENT_GAINED_FOCUS")) {
                i = 7;
            } else if (string.equals("UNKNOWN")) {
                i = 8;
            } else if (string.equals("PASSTHROUGH")) {
                i = 9;
            } else if (string.equals("POLICY_CHECK")) {
                i = 10;
            } else if (string.equals("TIME_OUT")) {
                i = 11;
            } else if (string.equals("CROSS_USER_HANDOFF")) {
                i = 12;
            } else {
                hhg1.n("No enum constant com.spotify.ubi.navigationloggerimpl.mobius.NavigationActionParceler.ActionEnum.".concat(string));
            }
            switch (l1d.C(i)) {
                case 0:
                    return new lsn0(parcel.readString(), parcel.readSerializable());
                case 1:
                    Serializable serializable = parcel.readSerializable();
                    return new yrn0(serializable instanceof ou80 ? (ou80) serializable : null);
                case 2:
                    return new zrn0((UUID) parcel.readSerializable());
                case 3:
                    return fsn0.a;
                case 4:
                    String string2 = parcel.readString();
                    if (string2 != null) {
                        return new esn0(string2);
                    }
                    eg.m("Required value was null.");
                    return null;
                case 5:
                    return bsn0.a;
                case 6:
                    return asn0.a;
                case 7:
                    return jsn0.a;
                case 8:
                    return gsn0.a;
                case 9:
                    return hsn0.a;
                case 10:
                    return isn0.a;
                case 11:
                    return new dsn0(parcel.readSerializable());
                default:
                    eg.o();
                    return null;
            }
        }

        public static final int h(boolean z) {
            return z ? 2131961196 : 2131955233;
        }

        /* JADX WARN: Code duplicated, block: B:271:0x04a1  */
        /* JADX WARN: Code duplicated, block: B:273:0x04a9  */
        /* JADX WARN: Code duplicated, block: B:276:0x04b4  */
        /* JADX WARN: Code duplicated, block: B:278:0x04bc  */
        /* JADX WARN: Code duplicated, block: B:281:0x04c7  */
        /* JADX WARN: Code duplicated, block: B:283:0x04cf  */
        /* JADX WARN: Code duplicated, block: B:286:0x04da  */
        /* JADX WARN: Code duplicated, block: B:288:0x04e4  */
        /* JADX WARN: Code duplicated, block: B:291:0x04e9  */
        /* JADX WARN: Code duplicated, block: B:298:0x04fe  */
        /* JADX WARN: Code duplicated, block: B:300:0x0508  */
        /* JADX WARN: Code duplicated, block: B:302:0x0510 A[PHI: r5
          0x0510: PHI (r5v28 java.lang.String) = 
          (r5v23 java.lang.String)
          (r5v23 java.lang.String)
          (r5v23 java.lang.String)
          (r5v23 java.lang.String)
          (r5v24 java.lang.String)
          (r5v25 java.lang.String)
          (r5v26 java.lang.String)
          (r5v29 java.lang.String)
         binds: [B:299:0x0506, B:301:0x050e, B:294:0x04f5, B:289:0x04e6, B:284:0x04d7, B:279:0x04c4, B:274:0x04b1, B:269:0x049d] A[DONT_GENERATE, DONT_INLINE]] */
        public static g4r i(w2d w2dVar) {
            boolean z;
            boolean z2;
            String str;
            boolean z3;
            String str2;
            Integer num;
            ahz0 ahz0Var = ahz0.c;
            ahz0Var.getClass();
            try {
                try {
                    Object obj = ((AtomicReference) ahz0Var.a.d).get();
                    ygz0 ygz0Var = (ygz0) (obj instanceof d29 ? new e280((Object) null, (byte) 1) : poz0.B(obj)).get();
                    ArrayList arrayList = new ArrayList();
                    CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
                    Integer num2 = (Integer) w2dVar.a(key);
                    if (ygz0Var.a(AeFpsRangeLegacyQuirk.class, num2 != null && num2.intValue() == 2)) {
                        arrayList.add(new AeFpsRangeLegacyQuirk(w2dVar));
                    }
                    if (ygz0Var.a(AspectRatioLegacyApi21Quirk.class, false)) {
                        arrayList.add(new AspectRatioLegacyApi21Quirk());
                    }
                    HashSet hashSet = JpegHalCorruptImageQuirk.a;
                    String str3 = Build.DEVICE;
                    Locale locale = Locale.US;
                    if (ygz0Var.a(JpegHalCorruptImageQuirk.class, hashSet.contains(str3.toLowerCase(locale)))) {
                        arrayList.add(new JpegHalCorruptImageQuirk());
                    }
                    HashSet hashSet2 = JpegCaptureDownsizingQuirk.a;
                    String str4 = Build.MODEL;
                    if (ygz0Var.a(JpegCaptureDownsizingQuirk.class, hashSet2.contains(str4.toLowerCase(locale)) && ((Integer) w2dVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 0)) {
                        arrayList.add(new JpegCaptureDownsizingQuirk());
                    }
                    Integer num3 = (Integer) w2dVar.a(key);
                    if (ygz0Var.a(CamcorderProfileResolutionQuirk.class, num3 != null && num3.intValue() == 2)) {
                        CamcorderProfileResolutionQuirk camcorderProfileResolutionQuirk = new CamcorderProfileResolutionQuirk();
                        w2dVar.b();
                        arrayList.add(camcorderProfileResolutionQuirk);
                    }
                    String str5 = Build.HARDWARE;
                    if (ygz0Var.a(CaptureNoResponseQuirk.class, ("samsungexynos7420".equalsIgnoreCase(str5) || "universal7420".equalsIgnoreCase(str5)) && ((Integer) w2dVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 1)) {
                        arrayList.add(new CaptureNoResponseQuirk());
                    }
                    Integer num4 = (Integer) w2dVar.a(key);
                    if (ygz0Var.a(LegacyCameraOutputConfigNullPointerQuirk.class, num4 != null && num4.intValue() == 2)) {
                        arrayList.add(new LegacyCameraOutputConfigNullPointerQuirk());
                    }
                    if (ygz0Var.a(LegacyCameraSurfaceCleanupQuirk.class, Build.VERSION.SDK_INT < 29 && (num = (Integer) w2dVar.a(key)) != null && num.intValue() == 2)) {
                        arrayList.add(new LegacyCameraSurfaceCleanupQuirk());
                    }
                    if (ygz0Var.a(ImageCaptureWashedOutImageQuirk.class, ImageCaptureWashedOutImageQuirk.a.contains(str4.toUpperCase(locale)) && ((Integer) w2dVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 1)) {
                        arrayList.add(new ImageCaptureWashedOutImageQuirk());
                    }
                    if (ygz0Var.a(CameraNoResponseWhenEnablingFlashQuirk.class, CameraNoResponseWhenEnablingFlashQuirk.a.contains(str4.toUpperCase(locale)) && ((Integer) w2dVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 1)) {
                        arrayList.add(new CameraNoResponseWhenEnablingFlashQuirk());
                    }
                    String str6 = Build.BRAND;
                    if (ygz0Var.a(YuvImageOnePixelShiftQuirk.class, ("motorola".equalsIgnoreCase(str6) && "MotoG3".equalsIgnoreCase(str4)) || ("samsung".equalsIgnoreCase(str6) && "SM-G532F".equalsIgnoreCase(str4)) || (("samsung".equalsIgnoreCase(str6) && "SM-J700F".equalsIgnoreCase(str4)) || (("samsung".equalsIgnoreCase(str6) && "SM-A920F".equalsIgnoreCase(str4)) || (("samsung".equalsIgnoreCase(str6) && "SM-J415F".equalsIgnoreCase(str4)) || ("xiaomi".equalsIgnoreCase(str6) && "Mi A1".equalsIgnoreCase(str4))))))) {
                        arrayList.add(new YuvImageOnePixelShiftQuirk());
                    }
                    Iterator it = FlashTooSlowQuirk.a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (Build.MODEL.toUpperCase(Locale.US).startsWith((String) it.next())) {
                                if (((Integer) w2dVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                                    z = true;
                                    break;
                                }
                            }
                        }
                        z = false;
                        break;
                    }
                    if (ygz0Var.a(FlashTooSlowQuirk.class, z)) {
                        arrayList.add(new FlashTooSlowQuirk());
                    }
                    if (ygz0Var.a(AfRegionFlipHorizontallyQuirk.class, Build.BRAND.equalsIgnoreCase("SAMSUNG") && Build.VERSION.SDK_INT < 33 && ((Integer) w2dVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 0)) {
                        arrayList.add(new AfRegionFlipHorizontallyQuirk());
                    }
                    CameraCharacteristics.Key key2 = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
                    Integer num5 = (Integer) w2dVar.a(key2);
                    if (ygz0Var.a(ConfigureSurfaceToSecondarySessionFailQuirk.class, num5 != null && num5.intValue() == 2)) {
                        arrayList.add(new ConfigureSurfaceToSecondarySessionFailQuirk());
                    }
                    Integer num6 = (Integer) w2dVar.a(key2);
                    if (ygz0Var.a(PreviewOrientationIncorrectQuirk.class, num6 != null && num6.intValue() == 2)) {
                        arrayList.add(new PreviewOrientationIncorrectQuirk());
                    }
                    Integer num7 = (Integer) w2dVar.a(key2);
                    if (ygz0Var.a(CaptureSessionStuckQuirk.class, num7 != null && num7.intValue() == 2)) {
                        arrayList.add(new CaptureSessionStuckQuirk());
                    }
                    List list = ImageCaptureFlashNotFireQuirk.b;
                    String str7 = Build.MODEL;
                    Locale locale2 = Locale.US;
                    if (ygz0Var.a(ImageCaptureFlashNotFireQuirk.class, (list.contains(str7.toLowerCase(locale2)) && ((Integer) w2dVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 0) || ImageCaptureFlashNotFireQuirk.a.contains(str7.toLowerCase(locale2)))) {
                        arrayList.add(new ImageCaptureFlashNotFireQuirk());
                    }
                    if (ygz0Var.a(ImageCaptureWithFlashUnderexposureQuirk.class, ImageCaptureWithFlashUnderexposureQuirk.a.contains(str7.toLowerCase(locale2)) && ((Integer) w2dVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 1)) {
                        arrayList.add(new ImageCaptureWithFlashUnderexposureQuirk());
                    }
                    if (ygz0Var.a(ImageCaptureFailWithAutoFlashQuirk.class, ImageCaptureFailWithAutoFlashQuirk.a.contains(str7.toLowerCase(locale2)) && ((Integer) w2dVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 0)) {
                        arrayList.add(new ImageCaptureFailWithAutoFlashQuirk());
                    }
                    Integer num8 = (Integer) w2dVar.a(key2);
                    if (ygz0Var.a(IncorrectCaptureStateQuirk.class, num8 != null && num8.intValue() == 2)) {
                        arrayList.add(new IncorrectCaptureStateQuirk());
                    }
                    Iterator it2 = TorchFlashRequiredFor3aUpdateQuirk.a.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (Build.MODEL.toUpperCase(Locale.US).equals((String) it2.next())) {
                                if (((Integer) w2dVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                                    z2 = true;
                                    break;
                                }
                            }
                        }
                        z2 = false;
                        break;
                    }
                    if (ygz0Var.a(TorchFlashRequiredFor3aUpdateQuirk.class, z2)) {
                        arrayList.add(new TorchFlashRequiredFor3aUpdateQuirk());
                    }
                    String str8 = Build.MANUFACTURER;
                    if (ygz0Var.a(PreviewStretchWhenVideoCaptureIsBoundQuirk.class, ("HUAWEI".equalsIgnoreCase(str8) && "HUAWEI ALE-L04".equalsIgnoreCase(Build.MODEL)) || ("Samsung".equalsIgnoreCase(str8) && "sm-j320f".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str8) && "sm-j700f".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str8) && "sm-j111f".equalsIgnoreCase(Build.MODEL)) || (("OPPO".equalsIgnoreCase(str8) && "A37F".equalsIgnoreCase(Build.MODEL)) || ("Samsung".equalsIgnoreCase(str8) && "sm-j510fn".equalsIgnoreCase(Build.MODEL))))))) {
                        arrayList.add(new PreviewStretchWhenVideoCaptureIsBoundQuirk());
                    }
                    if (ygz0Var.a(PreviewDelayWhenVideoCaptureIsBoundQuirk.class, "Huawei".equalsIgnoreCase(str8))) {
                        arrayList.add(new PreviewDelayWhenVideoCaptureIsBoundQuirk());
                    }
                    String str9 = Build.BRAND;
                    if ("blu".equalsIgnoreCase(str9)) {
                        str = Build.MODEL;
                        if ("studio x10".equalsIgnoreCase(str)) {
                            z3 = true;
                        } else if ("itel".equalsIgnoreCase(str9)) {
                            str = Build.MODEL;
                            if ("itel w6004".equalsIgnoreCase(str)) {
                                z3 = true;
                            } else if ("vivo".equalsIgnoreCase(str9)) {
                                str = Build.MODEL;
                                if ("vivo 1805".equalsIgnoreCase(str)) {
                                    z3 = true;
                                } else if ("positivo".equalsIgnoreCase(str9)) {
                                    str = Build.MODEL;
                                    if ("twist 2 pro".equalsIgnoreCase(str)) {
                                        z3 = true;
                                    } else {
                                        str = Build.MODEL;
                                        if (("pixel 4 xl".equalsIgnoreCase(str) || Build.VERSION.SDK_INT != 29) && !("motorola".equalsIgnoreCase(str9) && "moto e13".equalsIgnoreCase(str))) {
                                            if ("samsung".equalsIgnoreCase(str9)) {
                                                str2 = Build.DEVICE;
                                                if (!"gta8".equalsIgnoreCase(str2) || "gta8wifi".equalsIgnoreCase(str2)) {
                                                    z3 = true;
                                                }
                                            }
                                            z3 = false;
                                        } else {
                                            z3 = true;
                                        }
                                    }
                                } else {
                                    str = Build.MODEL;
                                    if ("pixel 4 xl".equalsIgnoreCase(str)) {
                                        if ("samsung".equalsIgnoreCase(str9)) {
                                            str2 = Build.DEVICE;
                                            if (!"gta8".equalsIgnoreCase(str2)) {
                                            }
                                            z3 = true;
                                        }
                                        z3 = false;
                                    } else {
                                        if ("samsung".equalsIgnoreCase(str9)) {
                                            str2 = Build.DEVICE;
                                            if (!"gta8".equalsIgnoreCase(str2)) {
                                            }
                                            z3 = true;
                                        }
                                        z3 = false;
                                    }
                                }
                            } else if ("positivo".equalsIgnoreCase(str9)) {
                                str = Build.MODEL;
                                if ("twist 2 pro".equalsIgnoreCase(str)) {
                                    z3 = true;
                                } else {
                                    str = Build.MODEL;
                                    if ("pixel 4 xl".equalsIgnoreCase(str)) {
                                        if ("samsung".equalsIgnoreCase(str9)) {
                                            str2 = Build.DEVICE;
                                            if (!"gta8".equalsIgnoreCase(str2)) {
                                            }
                                            z3 = true;
                                        }
                                        z3 = false;
                                    } else {
                                        if ("samsung".equalsIgnoreCase(str9)) {
                                            str2 = Build.DEVICE;
                                            if (!"gta8".equalsIgnoreCase(str2)) {
                                            }
                                            z3 = true;
                                        }
                                        z3 = false;
                                    }
                                }
                            } else {
                                str = Build.MODEL;
                                if ("pixel 4 xl".equalsIgnoreCase(str)) {
                                    if ("samsung".equalsIgnoreCase(str9)) {
                                        str2 = Build.DEVICE;
                                        if (!"gta8".equalsIgnoreCase(str2)) {
                                        }
                                        z3 = true;
                                    }
                                    z3 = false;
                                } else {
                                    if ("samsung".equalsIgnoreCase(str9)) {
                                        str2 = Build.DEVICE;
                                        if (!"gta8".equalsIgnoreCase(str2)) {
                                        }
                                        z3 = true;
                                    }
                                    z3 = false;
                                }
                            }
                        } else if ("vivo".equalsIgnoreCase(str9)) {
                            str = Build.MODEL;
                            if ("vivo 1805".equalsIgnoreCase(str)) {
                                z3 = true;
                            } else if ("positivo".equalsIgnoreCase(str9)) {
                                str = Build.MODEL;
                                if ("twist 2 pro".equalsIgnoreCase(str)) {
                                    z3 = true;
                                } else {
                                    str = Build.MODEL;
                                    if ("pixel 4 xl".equalsIgnoreCase(str)) {
                                        if ("samsung".equalsIgnoreCase(str9)) {
                                            str2 = Build.DEVICE;
                                            if (!"gta8".equalsIgnoreCase(str2)) {
                                            }
                                            z3 = true;
                                        }
                                        z3 = false;
                                    } else {
                                        if ("samsung".equalsIgnoreCase(str9)) {
                                            str2 = Build.DEVICE;
                                            if (!"gta8".equalsIgnoreCase(str2)) {
                                            }
                                            z3 = true;
                                        }
                                        z3 = false;
                                    }
                                }
                            } else {
                                str = Build.MODEL;
                                if ("pixel 4 xl".equalsIgnoreCase(str)) {
                                    if ("samsung".equalsIgnoreCase(str9)) {
                                        str2 = Build.DEVICE;
                                        if (!"gta8".equalsIgnoreCase(str2)) {
                                        }
                                        z3 = true;
                                    }
                                    z3 = false;
                                } else {
                                    if ("samsung".equalsIgnoreCase(str9)) {
                                        str2 = Build.DEVICE;
                                        if (!"gta8".equalsIgnoreCase(str2)) {
                                        }
                                        z3 = true;
                                    }
                                    z3 = false;
                                }
                            }
                        } else if ("positivo".equalsIgnoreCase(str9)) {
                            str = Build.MODEL;
                            if ("twist 2 pro".equalsIgnoreCase(str)) {
                                z3 = true;
                            } else {
                                str = Build.MODEL;
                                if ("pixel 4 xl".equalsIgnoreCase(str)) {
                                    if ("samsung".equalsIgnoreCase(str9)) {
                                        str2 = Build.DEVICE;
                                        if (!"gta8".equalsIgnoreCase(str2)) {
                                        }
                                        z3 = true;
                                    }
                                    z3 = false;
                                } else {
                                    if ("samsung".equalsIgnoreCase(str9)) {
                                        str2 = Build.DEVICE;
                                        if (!"gta8".equalsIgnoreCase(str2)) {
                                        }
                                        z3 = true;
                                    }
                                    z3 = false;
                                }
                            }
                        } else {
                            str = Build.MODEL;
                            if ("pixel 4 xl".equalsIgnoreCase(str)) {
                                if ("samsung".equalsIgnoreCase(str9)) {
                                    str2 = Build.DEVICE;
                                    if (!"gta8".equalsIgnoreCase(str2)) {
                                    }
                                    z3 = true;
                                }
                                z3 = false;
                            } else {
                                if ("samsung".equalsIgnoreCase(str9)) {
                                    str2 = Build.DEVICE;
                                    if (!"gta8".equalsIgnoreCase(str2)) {
                                    }
                                    z3 = true;
                                }
                                z3 = false;
                            }
                        }
                    } else if ("itel".equalsIgnoreCase(str9)) {
                        str = Build.MODEL;
                        if ("itel w6004".equalsIgnoreCase(str)) {
                            z3 = true;
                        } else if ("vivo".equalsIgnoreCase(str9)) {
                            str = Build.MODEL;
                            if ("vivo 1805".equalsIgnoreCase(str)) {
                                z3 = true;
                            } else if ("positivo".equalsIgnoreCase(str9)) {
                                str = Build.MODEL;
                                if ("twist 2 pro".equalsIgnoreCase(str)) {
                                    z3 = true;
                                } else {
                                    str = Build.MODEL;
                                    if ("pixel 4 xl".equalsIgnoreCase(str)) {
                                        if ("samsung".equalsIgnoreCase(str9)) {
                                            str2 = Build.DEVICE;
                                            if (!"gta8".equalsIgnoreCase(str2)) {
                                            }
                                            z3 = true;
                                        }
                                        z3 = false;
                                    } else {
                                        if ("samsung".equalsIgnoreCase(str9)) {
                                            str2 = Build.DEVICE;
                                            if (!"gta8".equalsIgnoreCase(str2)) {
                                            }
                                            z3 = true;
                                        }
                                        z3 = false;
                                    }
                                }
                            } else {
                                str = Build.MODEL;
                                if ("pixel 4 xl".equalsIgnoreCase(str)) {
                                    if ("samsung".equalsIgnoreCase(str9)) {
                                        str2 = Build.DEVICE;
                                        if (!"gta8".equalsIgnoreCase(str2)) {
                                        }
                                        z3 = true;
                                    }
                                    z3 = false;
                                } else {
                                    if ("samsung".equalsIgnoreCase(str9)) {
                                        str2 = Build.DEVICE;
                                        if (!"gta8".equalsIgnoreCase(str2)) {
                                        }
                                        z3 = true;
                                    }
                                    z3 = false;
                                }
                            }
                        } else if ("positivo".equalsIgnoreCase(str9)) {
                            str = Build.MODEL;
                            if ("twist 2 pro".equalsIgnoreCase(str)) {
                                z3 = true;
                            } else {
                                str = Build.MODEL;
                                if ("pixel 4 xl".equalsIgnoreCase(str)) {
                                    if ("samsung".equalsIgnoreCase(str9)) {
                                        str2 = Build.DEVICE;
                                        if (!"gta8".equalsIgnoreCase(str2)) {
                                        }
                                        z3 = true;
                                    }
                                    z3 = false;
                                } else {
                                    if ("samsung".equalsIgnoreCase(str9)) {
                                        str2 = Build.DEVICE;
                                        if (!"gta8".equalsIgnoreCase(str2)) {
                                        }
                                        z3 = true;
                                    }
                                    z3 = false;
                                }
                            }
                        } else {
                            str = Build.MODEL;
                            if ("pixel 4 xl".equalsIgnoreCase(str)) {
                                if ("samsung".equalsIgnoreCase(str9)) {
                                    str2 = Build.DEVICE;
                                    if (!"gta8".equalsIgnoreCase(str2)) {
                                    }
                                    z3 = true;
                                }
                                z3 = false;
                            } else {
                                if ("samsung".equalsIgnoreCase(str9)) {
                                    str2 = Build.DEVICE;
                                    if (!"gta8".equalsIgnoreCase(str2)) {
                                    }
                                    z3 = true;
                                }
                                z3 = false;
                            }
                        }
                    } else if ("vivo".equalsIgnoreCase(str9)) {
                        str = Build.MODEL;
                        if ("vivo 1805".equalsIgnoreCase(str)) {
                            z3 = true;
                        } else if ("positivo".equalsIgnoreCase(str9)) {
                            str = Build.MODEL;
                            if ("twist 2 pro".equalsIgnoreCase(str)) {
                                z3 = true;
                            } else {
                                str = Build.MODEL;
                                if ("pixel 4 xl".equalsIgnoreCase(str)) {
                                    if ("samsung".equalsIgnoreCase(str9)) {
                                        str2 = Build.DEVICE;
                                        if (!"gta8".equalsIgnoreCase(str2)) {
                                        }
                                        z3 = true;
                                    }
                                    z3 = false;
                                } else {
                                    if ("samsung".equalsIgnoreCase(str9)) {
                                        str2 = Build.DEVICE;
                                        if (!"gta8".equalsIgnoreCase(str2)) {
                                        }
                                        z3 = true;
                                    }
                                    z3 = false;
                                }
                            }
                        } else {
                            str = Build.MODEL;
                            if ("pixel 4 xl".equalsIgnoreCase(str)) {
                                if ("samsung".equalsIgnoreCase(str9)) {
                                    str2 = Build.DEVICE;
                                    if (!"gta8".equalsIgnoreCase(str2)) {
                                    }
                                    z3 = true;
                                }
                                z3 = false;
                            } else {
                                if ("samsung".equalsIgnoreCase(str9)) {
                                    str2 = Build.DEVICE;
                                    if (!"gta8".equalsIgnoreCase(str2)) {
                                    }
                                    z3 = true;
                                }
                                z3 = false;
                            }
                        }
                    } else if ("positivo".equalsIgnoreCase(str9)) {
                        str = Build.MODEL;
                        if ("twist 2 pro".equalsIgnoreCase(str)) {
                            z3 = true;
                        } else {
                            str = Build.MODEL;
                            if ("pixel 4 xl".equalsIgnoreCase(str)) {
                                if ("samsung".equalsIgnoreCase(str9)) {
                                    str2 = Build.DEVICE;
                                    if (!"gta8".equalsIgnoreCase(str2)) {
                                    }
                                    z3 = true;
                                }
                                z3 = false;
                            } else {
                                if ("samsung".equalsIgnoreCase(str9)) {
                                    str2 = Build.DEVICE;
                                    if (!"gta8".equalsIgnoreCase(str2)) {
                                    }
                                    z3 = true;
                                }
                                z3 = false;
                            }
                        }
                    } else {
                        str = Build.MODEL;
                        if ("pixel 4 xl".equalsIgnoreCase(str)) {
                            if ("samsung".equalsIgnoreCase(str9)) {
                                str2 = Build.DEVICE;
                                if (!"gta8".equalsIgnoreCase(str2)) {
                                }
                                z3 = true;
                            }
                            z3 = false;
                        } else {
                            if ("samsung".equalsIgnoreCase(str9)) {
                                str2 = Build.DEVICE;
                                if (!"gta8".equalsIgnoreCase(str2)) {
                                }
                                z3 = true;
                            }
                            z3 = false;
                        }
                    }
                    if (ygz0Var.a(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.class, z3)) {
                        arrayList.add(new ImageCaptureFailedWhenVideoCaptureIsBoundQuirk());
                    }
                    if (ygz0Var.a(TemporalNoiseQuirk.class, "Pixel 8".equalsIgnoreCase(str) && ((Integer) w2dVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 0)) {
                        arrayList.add(new TemporalNoiseQuirk());
                    }
                    if (ygz0Var.a(ImageCaptureFailedForVideoSnapshotQuirk.class, ImageCaptureFailedForVideoSnapshotQuirk.b())) {
                        arrayList.add(new ImageCaptureFailedForVideoSnapshotQuirk());
                    }
                    if (ygz0Var.a(AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk.class, "samsung".equalsIgnoreCase(str9) && str.toLowerCase(Locale.US).startsWith("sm-m556"))) {
                        arrayList.add(new AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk());
                    }
                    g4r g4rVar = new g4r((List) arrayList);
                    "camera2 CameraQuirks = ".concat(g4r.o(g4rVar));
                    j2h1.o("CameraQuirks");
                    return g4rVar;
                } catch (InterruptedException e) {
                    e = e;
                    throw new AssertionError("Unexpected error in QuirkSettings StateObservable", e);
                }
            } catch (InterruptedException | ExecutionException e2) {
                e = e2;
            }
        }

        public static long j() {
            return toa0.j;
        }

        public static long k() {
            return toa0.b;
        }

        public static long l() {
            return toa0.t;
        }

        public static long m() {
            return toa0.k;
        }

        public static final int[] n(NetworkRequest networkRequest) {
            if (Build.VERSION.SDK_INT >= 31) {
                return mb4.e(networkRequest);
            }
            int[] iArr = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 30; i++) {
                int i2 = iArr[i];
                if (ph5.G(networkRequest, i2)) {
                    arrayList.add(Integer.valueOf(i2));
                }
            }
            return o7h.k1(arrayList);
        }

        public static final int o(String str) {
            Object next;
            d7 d7Var = new d7(a131.b, (byte) 0);
            do {
                if (!d7Var.hasNext()) {
                    next = null;
                    break;
                }
                next = d7Var.next();
            } while (!nhc1.S(((a131) next).name(), str, true));
            a131 a131Var = (a131) next;
            int i = a131Var == null ? -1 : c5m.a[a131Var.ordinal()];
            if (i != 1) {
                return i != 2 ? 0 : 1;
            }
            return 2;
        }

        public static long p() {
            return toa0.A;
        }

        public static long q() {
            return toa0.z;
        }

        public static long r() {
            return toa0.u;
        }

        public static long s() {
            return toa0.i;
        }

        public static long t() {
            return toa0.f;
        }

        public static long u() {
            return toa0.g;
        }

        public static long v() {
            return toa0.h;
        }

        public static long w() {
            return toa0.e;
        }

        public static long x() {
            return toa0.s;
        }

        public static long y() {
            return toa0.v;
        }

        public static long z() {
            return toa0.y;
        }
    }
