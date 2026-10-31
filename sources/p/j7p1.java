package p;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.net.Uri;
import android.util.Property;
import android.view.View;
import android.widget.TextView;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.userinteractivityservice.usercomments.v1.proto.AuthorMetadata;
import com.spotify.userinteractivityservice.usercomments.v1.proto.Comment;
import com.spotify.userinteractivityservice.usercomments.v1.proto.Reply;
import com.spotify.userinteractivityservice.usercomments.v1.proto.ShowAuthorMetadata;
import com.spotify.userinteractivityservice.usercomments.v1.proto.UserAuthorMetadata;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class j7p1 {
    public static b180 a;
    public static b180 b;

    public static final k3r A(rla1 rla1Var) {
        if (rla1Var instanceof pla1) {
            return new h3r(new d3r(((pla1) rla1Var).a.toString()));
        }
        if (rla1Var instanceof qla1) {
            return new j3r(((qla1) rla1Var).a);
        }
        eg.o();
        return null;
    }

    public static final phx B(AuthorMetadata authorMetadata) {
        int iN = authorMetadata.n();
        int i = iN == 0 ? -1 : wlh.a[l1d.C(iN)];
        if (i == 1) {
            UserAuthorMetadata userAuthorMetadataP = authorMetadata.p();
            return new phx(8, 0L, userAuthorMetadataP.p(), userAuthorMetadataP.getUsername(), userAuthorMetadataP.q());
        }
        if (i != 2) {
            return null;
        }
        ShowAuthorMetadata showAuthorMetadataO = authorMetadata.o();
        return new phx(10, 0L, showAuthorMetadataO.o(), (String) null, showAuthorMetadataO.p());
    }

    public static final void a(Uri uri, String str, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        qim0 qim0VarR;
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1982664237);
        int i3 = i | (x340Var.g(uri) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | 128;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                qim0VarR = u291.r(nim0.a, 142.0f);
                i2 = i3 & (-897);
            } else {
                x340Var.b0();
                i2 = i3 & (-897);
                qim0VarR = qim0Var;
            }
            x340Var.s();
            hux huxVarR = r(str);
            qim0 qim0Var3 = qim0VarR;
            eso1.e(uri, isl.a, qim0Var3, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, new nux(huxVarR, huxVarR), false, false, x340Var, (i2 & 14) | 1073741872, 0, 3576);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qm71(uri, str, qim0Var2, i, (byte) 6);
        }
    }

    public static final void b(boolean z, Function0 function0, int i, int i2, int i3, int i4, iu30 iu30Var, boolean z2, Function0 function1, qim0 qim0Var, boolean z3, iu30 iu30Var2, gj4 gj4Var, b0k b0kVar, int i5) {
        Function0 function2;
        qim0 qim0Var2;
        int i6;
        qim0 qim0VarB;
        String strN0;
        boolean z4;
        int i7 = i3;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1627878931);
        j06 j06Var = x340Var.a;
        int i8 = i5 | (x340Var.h(z) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.e(i) ? 256 : 128) | (x340Var.e(i2) ? 2048 : 1024) | (x340Var.e(i7) ? 16384 : 8192) | (x340Var.e(i4) ? 131072 : 65536) | (x340Var.i(iu30Var) ? 1048576 : 524288) | (x340Var.h(z2) ? 8388608 : 4194304) | (x340Var.i(function1) ? 67108864 : 33554432) | 805306368;
        int i9 = (x340Var.h(z3) ? 4 : 2) | (x340Var.i(iu30Var2) ? 32 : 16) | (x340Var.e(gj4Var == null ? -1 : gj4Var.ordinal()) ? 256 : 128);
        if (x340Var.Y(i8 & 1, ((i8 & 306783379) == 306783378 && (i9 & 147) == 146) ? false : true)) {
            uwr uwrVar = cbx.a;
            float fFloatValue = ((Number) z95.b(z ? 1.0f : 0.4f, irn1.o0((int) jfv.h(cbx.c(x340Var).b.b), 0, null, 6), "content_alpha", (iu30) null, x340Var, 3072, 20).getValue()).floatValue();
            lee1 lee1VarV = w2g0.v(x340Var);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z5 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z5) {
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
            String strO0 = cwl1.o0(x340Var, 2131963891);
            boolean z6 = (i8 & 112) == 32;
            Object objT = x340Var.T();
            if (z6 || objT == obj) {
                objT = new vj0(function0, (byte) 3);
                x340Var.s0(objT);
            }
            qim0Var2 = qim0Var3;
            n(strO0, z, (iu30) objT, null, null, x340Var, (i8 << 3) & 112, 24);
            cvx cvxVar = cbx.b(x340Var).b;
            rqo1.g(0, 0, x340Var, uyn1.z(16.0f, 0.0f, 2, qim0Var2));
            qim0 qim0VarF2 = u291.f(qim0Var2, 1.0f);
            boolean zD = x340Var.d(fFloatValue);
            Object objT2 = x340Var.T();
            if (zD || objT2 == obj) {
                objT2 = new jc5((byte) 6, fFloatValue);
                x340Var.s0(objT2);
            }
            qim0 qim0VarC = i541.C(qim0VarF2, (iu30) objT2);
            if (z) {
                i6 = 0;
                x340Var.i0(304383269);
                x340Var.r(false);
                qim0VarB = qim0Var2;
            } else {
                x340Var.i0(304052282);
                Object objT3 = x340Var.T();
                if (objT3 == obj) {
                    objT3 = yda.e;
                    x340Var.s0(objT3);
                }
                qim0 qim0VarA = s161.a(qim0Var2, (iu30) objT3);
                Object objT4 = x340Var.T();
                if (objT4 == obj) {
                    objT4 = mia.b;
                    x340Var.s0(objT4);
                }
                qim0VarB = f8d1.b(qim0VarA, rih1.a, (PointerInputEventHandler) objT4);
                i6 = 0;
                x340Var.r(false);
            }
            qim0 qim0VarThen = qim0VarC.then(qim0VarB);
            mbh mbhVarA2 = jbh.a(h36.e, een.Q0, x340Var, i6);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarThen);
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
            String strO1 = cwl1.o0(x340Var, 2131963889);
            String strK = "";
            if (z) {
                x340Var.i0(1907742008);
                strN0 = cwl1.n0(2131963890, new Object[]{Integer.valueOf(i), strO1}, x340Var);
                x340Var.r(false);
            } else {
                x340Var.i0(1907911113);
                x340Var.r(false);
                strN0 = "";
            }
            String strValueOf = z ? String.valueOf(i) : "---";
            long j = cbx.a(x340Var).b.a;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarB2 = uyn1.B(qim0Var2, 0.0f, 12.0f, 0.0f, 0.0f, 13);
            boolean zG = x340Var.g(strN0);
            Object objT5 = x340Var.T();
            if (zG || objT5 == obj) {
                objT5 = new nb9(strN0, (byte) 9);
                x340Var.s0(objT5);
            }
            uwo1.e(strValueOf, s161.b(qim0VarB2, false, (iu30) objT5), lee1VarV, j, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
            lee1 lee1Var = cbx.d(x340Var).g;
            long j2 = cbx.a(x340Var).b.b;
            Object objT6 = x340Var.T();
            if (objT6 == obj) {
                objT6 = yda.f;
                x340Var.s0(objT6);
            }
            uwo1.e(strO1, s161.a(qim0Var2, (iu30) objT6), lee1Var, j2, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
            if (gj4Var == gj4.c) {
                x340Var.i0(1908548039);
                if (z) {
                    strK = x0d.k(x340Var, 1908596585, 2131963892, x340Var, false);
                } else {
                    x340Var.i0(1908688097);
                    x340Var.r(false);
                }
                String str = strK;
                lee1 lee1Var2 = cbx.d(x340Var).k;
                long j3 = cbx.a(x340Var).b.a;
                cjc0 cjc0Var = new cjc0(1);
                qim0 qim0VarF3 = u291.f(qim0Var2, 1.0f);
                cvx cvxVar3 = cbx.b(x340Var).b;
                cvx cvxVar4 = cbx.b(x340Var).b;
                cvx cvxVar5 = cbx.b(x340Var).b;
                uwo1.e(str, uyn1.B(qim0VarF3, 16.0f, 16.0f, 16.0f, 0.0f, 8), lee1Var2, j3, new a0e1(3), null, 2, false, cjc0Var, 0, null, x340Var, 0, 0, 1696);
                z4 = false;
                x340Var.r(false);
            } else {
                z4 = false;
                x340Var.i0(1909226753);
                x340Var.r(false);
            }
            i7 = i3;
            int i10 = i8 >> 6;
            function2 = function1;
            boolean z7 = z4;
            exd0.n(i, new tr80(i2, i7, 1), i4, i4 * 4, iu30Var, uyn1.B(u291.f(qim0Var2, 1.0f), 0.0f, cbx.b(x340Var).b.b, 0.0f, 0.0f, 13), iu30Var2, (iu30) null, x340Var, (i10 & 57344) | (i10 & 14) | ((i8 >> 9) & 896) | ((i9 << 15) & 3670016));
            if (z3) {
                x340Var.i0(1909633845);
                String strO2 = cwl1.o0(x340Var, 2131963882);
                boolean z8 = (i8 & 234881024) == 67108864 ? true : z7;
                Object objT7 = x340Var.T();
                if (z8 || objT7 == obj) {
                    objT7 = new vj0(function2, (byte) 4);
                    x340Var.s0(objT7);
                }
                n(strO2, z2, (iu30) objT7, null, cbx.d(x340Var).j, x340Var, (i8 >> 18) & 112, 8);
                x340Var.r(z7);
            } else {
                x340Var.i0(1909891393);
                x340Var.r(z7);
            }
            x340Var.r((boolean) 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0474: INVOKE 
                  (r5v1 'x340Var' p.x340)
                  (wrap boolean:?: CAST (boolean) (r33v0 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]))
                 VIRTUAL call: p.x340.r(boolean):void (LINE:1141) in method: p.j7p1.b(boolean, kotlin.jvm.functions.Function0, int, int, int, int, p.iu30, boolean, kotlin.jvm.functions.Function0, p.qim0, boolean, p.iu30, p.gj4, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes4.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r33v0 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 1196
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.j7p1.b(boolean, kotlin.jvm.functions.Function0, int, int, int, int, p.iu30, boolean, kotlin.jvm.functions.Function0, p.qim0, boolean, p.iu30, p.gj4, p.b0k, int):void");
        }

        public static final void c(he81 he81Var, j2i j2iVar, b0k b0kVar, int i) {
            int i2;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-1354612899);
            if ((i & 6) == 0) {
                i2 = (x340Var.i(he81Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= x340Var.i(j2iVar) ? 32 : 16;
            }
            if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
                qim0 qim0VarB = uyn1.B(nim0.a, 0.0f, he81Var.H == 1 ? 8.0f : 2.0f, 0.0f, 0.0f, 13);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
                dv20.l((i2 >> 3) & 14, j2iVar, x340Var, true);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new wjz0(he81Var, j2iVar, i, (byte) 21);
            }
        }

        public static final void d(r830 r830Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
            r830 r830Var2;
            qim0 qim0Var2;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-1302119766);
            byte b2 = 16;
            int i2 = i | (x340Var.e(r830Var.ordinal()) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | 384;
            if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                int iOrdinal = r830Var.ordinal();
                r830Var2 = r830Var;
                j2i j2iVarR = apo.r(1701802025, new xh00(r830Var2, iu30Var, b2), x340Var);
                qim0 qim0Var3 = nim0.a;
                jhc1.d(iOrdinal, qim0Var3, 0L, 0, (xu30) null, j2iVarR, x340Var, 196656, 28);
                qim0Var2 = qim0Var3;
            } else {
                r830Var2 = r830Var;
                x340Var.b0();
                qim0Var2 = qim0Var;
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new xx00((byte) 17, i, r830Var2, qim0Var2, iu30Var);
            }
        }

        /* JADX WARN: Code duplicated, block: B:103:0x02e2  */
        /* JADX WARN: Code duplicated, block: B:108:0x0350  */
        /* JADX WARN: Code duplicated, block: B:109:0x0353  */
        /* JADX WARN: Code duplicated, block: B:113:0x035e  */
        /* JADX WARN: Code duplicated, block: B:94:0x02ce  */
        /* JADX WARN: Code duplicated, block: B:95:0x02d0  */
        /* JADX WARN: Code duplicated, block: B:98:0x02d6  */
        /* JADX WARN: Code duplicated, block: B:99:0x02d8  */
        public static final void e(s220 s220Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
            x340 x340Var;
            Integer num;
            int i2;
            vu30 vu30Var;
            boolean z;
            j2i j2iVar;
            j2i j2iVarR;
            boolean z2;
            boolean z3;
            boolean z4;
            Object objT;
            ven0 ven0Var;
            boolean z5;
            boolean z6;
            Object objT2;
            s220 s220Var2 = s220Var;
            m4c m4cVar = fkj0.X;
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.k0(847780714);
            int i3 = i | (x340Var2.g(s220Var2) ? 4 : 2) | (x340Var2.i(iu30Var) ? 32 : 16) | (x340Var2.i(qim0Var) ? 256 : 128);
            if (x340Var2.Y(i3 & 1, (i3 & 147) != 146)) {
                Object objT3 = x340Var2.T();
                if (objT3 == m4cVar) {
                    objT3 = v8r.q(s220Var2.i);
                    x340Var2.s0(objT3);
                }
                ven0 ven0Var2 = (ven0) objT3;
                String str = s220Var2.h;
                String str2 = s220Var2.e;
                az20 az20Var = (az20) x340Var2.k(t4k.i);
                c380 c380Var = s220Var2.f;
                ArrayList arrayList = new ArrayList();
                for (Object obj : c380Var) {
                    if (obj instanceof gk80) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    Integer numValueOf = Integer.valueOf(((gk80) it.next()).a);
                    while (it.hasNext()) {
                        Integer numValueOf2 = Integer.valueOf(((gk80) it.next()).a);
                        if (numValueOf.compareTo(numValueOf2) > 0) {
                            numValueOf = numValueOf2;
                        }
                    }
                    num = numValueOf;
                } else {
                    num = null;
                }
                int iC = l1d.C(s220Var2.c);
                if (iC == 0) {
                    i2 = 1;
                } else if (iC == 1) {
                    i2 = 3;
                } else if (iC == 2) {
                    i2 = 4;
                } else if (iC != 3) {
                    if (iC != 4) {
                        eg.o();
                        return;
                    }
                    i2 = 1;
                } else {
                    i2 = 6;
                }
                qim0 qim0VarF = u291.f(qim0Var, 1.0f);
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
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
                nko1.H(mbhVarA, x340Var2, y580.O0);
                nko1.H(xos0VarM, x340Var2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                nko1.F(x340Var2);
                nko1.H(qim0VarE, x340Var2, y580.Y);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                nim0 nim0Var = nim0.a;
                uwo1.e(s220Var2.b, uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), cbx.d(x340Var2).h, 0L, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2040);
                String str3 = (String) ven0Var2.getValue();
                String str4 = s220Var2.g;
                if (str4 == null) {
                    x340Var2.i0(-1000430286);
                    x340Var2.r(false);
                    vu30Var = null;
                } else {
                    x340Var2.i0(-1000430285);
                    vu30 vu30VarR = apo.r(-549794922, new dz40(str4, (byte) 14), x340Var2);
                    x340Var2.r(false);
                    vu30Var = vu30VarR;
                }
                int i4 = i3 & 112;
                int i5 = i3 & 14;
                boolean zI = (i4 == 32) | (i5 == 4) | x340Var2.i(ven0Var2);
                Object objT4 = x340Var2.T();
                if (zI || objT4 == m4cVar) {
                    objT4 = new lb50(iu30Var, s220Var2, ven0Var2, (byte) 8);
                    x340Var2.s0(objT4);
                }
                qim0 qim0VarF2 = u291.f(cev0.G(nim0Var, (iu30) objT4), 1.0f);
                boolean z7 = str != null;
                kua0 kua0Var = new kua0(0, (Boolean) null, i2, 6, 115);
                boolean zI2 = x340Var2.i(az20Var);
                Object objT5 = x340Var2.T();
                if (zI2 || objT5 == m4cVar) {
                    objT5 = new wt3(az20Var, (byte) 4);
                    x340Var2.s0(objT5);
                }
                bua0 bua0Var = new bua0((iu30) null, (iu30) objT5, (iu30) null, 59);
                j4e1 j4e1VarD = as10.d(cbx.a(x340Var2).b.a, cbx.a(x340Var2).a.c, cbx.a(x340Var2).a.c, cbx.a(x340Var2).c.a, cbx.a(x340Var2).c.b, cbx.a(x340Var2).c.d, x340Var2, 2147461070);
                if (str != null) {
                    x340Var2.i0(-998886175);
                    j2iVarR = apo.r(1352946900, new dz40(str, (byte) 15), x340Var2);
                    z = false;
                    x340Var2.r(false);
                } else {
                    z = false;
                    if (str2 != null) {
                        x340Var2.i0(-998651908);
                        j2iVarR = apo.r(575495805, new dz40(str2, (byte) 16), x340Var2);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-998443340);
                        x340Var2.r(false);
                        j2iVar = null;
                    }
                    boolean zG = x340Var2.g(num) | x340Var2.i(ven0Var2);
                    if (i4 == 32) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    boolean z8 = zG | z2;
                    if (i5 != 4) {
                        z3 = z;
                    } else {
                        z3 = true;
                    }
                    z4 = z8 | z3;
                    objT = x340Var2.T();
                    if (!z4 || objT == m4cVar) {
                        ven0Var = ven0Var2;
                        lhx lhxVar = new lhx(num, ven0Var, iu30Var, s220Var, (byte) 21);
                        s220Var2 = s220Var;
                        x340Var2.s0(lhxVar);
                        objT = lhxVar;
                    } else {
                        s220Var2 = s220Var;
                        ven0Var = ven0Var2;
                    }
                    wpb1.g(str3, (iu30) objT, qim0VarF2, false, false, (lee1) null, apo.r(-620410981, new jb50(s220Var2, (byte) 24), x340Var2), (vu30) null, vu30Var, j2iVar, z7, (elk1) null, kua0Var, bua0Var, true, 0, 0, (hw61) null, j4e1VarD, x340Var2, 12582912, 12582912, 3951480);
                    x340Var = x340Var2;
                    x340Var.r(true);
                    boolean zI3 = x340Var.i(ven0Var);
                    if (i5 != 4) {
                        z5 = z;
                    } else {
                        z5 = true;
                    }
                    z6 = zI3 | z5;
                    objT2 = x340Var.T();
                    if (z6 || objT2 == m4cVar) {
                        objT2 = new y160(ven0Var, s220Var2, (lnm) null);
                        x340Var.s0(objT2);
                    }
                    qxd0.t(rih1.a, x340Var, (vu30) objT2);
                }
                j2iVar = j2iVarR;
                boolean zG2 = x340Var2.g(num) | x340Var2.i(ven0Var2);
                if (i4 == 32) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                boolean z9 = zG2 | z2;
                if (i5 != 4) {
                    z3 = z;
                } else {
                    z3 = true;
                }
                z4 = z9 | z3;
                objT = x340Var2.T();
                if (z4) {
                    ven0Var = ven0Var2;
                    lhx lhxVar2 = new lhx(num, ven0Var, iu30Var, s220Var, (byte) 21);
                    s220Var2 = s220Var;
                    x340Var2.s0(lhxVar2);
                    objT = lhxVar2;
                } else {
                    ven0Var = ven0Var2;
                    lhx lhxVar3 = new lhx(num, ven0Var, iu30Var, s220Var, (byte) 21);
                    s220Var2 = s220Var;
                    x340Var2.s0(lhxVar3);
                    objT = lhxVar3;
                }
                wpb1.g(str3, (iu30) objT, qim0VarF2, false, false, (lee1) null, apo.r(-620410981, new jb50(s220Var2, (byte) 24), x340Var2), (vu30) null, vu30Var, j2iVar, z7, (elk1) null, kua0Var, bua0Var, true, 0, 0, (hw61) null, j4e1VarD, x340Var2, 12582912, 12582912, 3951480);
                x340Var = x340Var2;
                x340Var.r(true);
                boolean zI4 = x340Var.i(ven0Var);
                if (i5 != 4) {
                    z5 = z;
                } else {
                    z5 = true;
                }
                z6 = zI4 | z5;
                objT2 = x340Var.T();
                if (z6) {
                    objT2 = new y160(ven0Var, s220Var2, (lnm) null);
                    x340Var.s0(objT2);
                } else {
                    objT2 = new y160(ven0Var, s220Var2, (lnm) null);
                    x340Var.s0(objT2);
                }
                qxd0.t(rih1.a, x340Var, (vu30) objT2);
            } else {
                x340Var = x340Var2;
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new bp50((Object) s220Var2, (Object) iu30Var, (Object) qim0Var, i, (byte) 24);
            }
        }

        public static final void f(oc21 oc21Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
            int i2;
            x340 x340Var;
            max haxVar;
            String str = oc21Var.b;
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.k0(2119308773);
            j06 j06Var = x340Var2.a;
            if ((i & 6) == 0) {
                i2 = (x340Var2.g(oc21Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= x340Var2.i(qim0Var) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= x340Var2.i(iu30Var) ? 256 : 128;
            }
            if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
                Object objT = x340Var2.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = v8r.q(str);
                    x340Var2.s0(objT);
                }
                ven0 ven0Var = (ven0) objT;
                Object objT2 = x340Var2.T();
                if (objT2 == m4cVar) {
                    objT2 = v8r.q(Boolean.FALSE);
                    x340Var2.s0(objT2);
                }
                ven0 ven0Var2 = (ven0) objT2;
                Object objT3 = x340Var2.T();
                if (objT3 == m4cVar) {
                    objT3 = yv91.a(new zkz0(oc21Var, ven0Var, (byte) 27));
                    x340Var2.s0(objT3);
                }
                tob1 tob1Var = (tob1) objT3;
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var2, qim0Var);
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
                nim0 nim0Var = nim0.a;
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                fra fraVar = een.N0;
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                jw31 jw31VarA = ew31.a(new d36(4.0f, true, new um5(false)), fraVar, x340Var2, 0);
                int iHashCode2 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM2 = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarF);
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
                zzq0 zzq0VarH = uyn1.h(3, 0.0f, 0.0f);
                ldx ldxVar = ldx.c;
                String strO0 = cwl1.o0(x340Var2, 2131964093);
                int i3 = i2 & 896;
                boolean z2 = i3 == 256;
                Object objT4 = x340Var2.T();
                if (z2 || objT4 == m4cVar) {
                    objT4 = new dv11(iu30Var, (byte) 16);
                    x340Var2.s0(objT4);
                }
                Function0 function0 = (Function0) objT4;
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                gbx gbxVar = new gbx(new y50(strO0), function0);
                j2i j2iVar = gdj.b;
                max maxVar = jax.a;
                foo1.c(gbxVar, ldxVar, nim0Var, maxVar, null, zzq0VarH, null, null, null, null, j2iVar, x340Var2, 384, 48, 1960);
                cjc0 cjc0Var = new cjc0(1);
                lee1 lee1Var = cbx.d(x340Var2).h;
                String strO1 = cwl1.o0(x340Var2, 2131964097);
                wnb0 wnb0Var = new wnb0(1.0f, true);
                cvx cvxVar2 = cbx.b(x340Var2).b;
                uwo1.e(strO1, uyn1.w(wnb0Var, uyn1.h(2, 4.0f, 0.0f)), lee1Var, 0L, new a0e1(3), null, 0, false, cjc0Var, 0, null, x340Var2, 0, 0, 1768);
                if (((Boolean) tob1Var.getValue()).booleanValue()) {
                    x340Var2.i0(-723859095);
                    x340Var2.r(false);
                    haxVar = maxVar;
                } else {
                    x340Var2.i0(-723802954);
                    haxVar = new hax(cwl1.o0(x340Var2, 2131964094));
                    x340Var2.r(false);
                }
                zzq0 zzq0VarH2 = uyn1.h(3, 0.0f, 0.0f);
                String strO2 = cwl1.o0(x340Var2, 2131964096);
                boolean zI = x340Var2.i(ven0Var) | (i3 == 256);
                Object objT5 = x340Var2.T();
                if (zI || objT5 == m4cVar) {
                    objT5 = new rc21(iu30Var, ven0Var, (byte) 0);
                    x340Var2.s0(objT5);
                }
                Function0 function1 = (Function0) objT5;
                if (ihc1.y0(strO2)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                foo1.c(new gbx(new y50(strO2), function1), ldxVar, nim0Var, haxVar, null, zzq0VarH2, null, null, null, null, gdj.c, x340Var2, 384, 48, 1960);
                x340Var2.r(true);
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                gne gneVar = new gne(100, 0, false);
                String strO3 = cwl1.o0(x340Var2, 2131964095);
                boolean zI2 = x340Var2.i(ven0Var) | x340Var2.i(ven0Var2) | ((i2 & 14) == 4) | (i3 == 256);
                Object objT6 = x340Var2.T();
                if (zI2 || objT6 == m4cVar) {
                    vvu0 vvu0Var = new vvu0(oc21Var, iu30Var, ven0Var, ven0Var2, (byte) 19);
                    x340Var2.s0(vvu0Var);
                    objT6 = vvu0Var;
                }
                eqn1.d(1, str, strO3, true, true, true, (iu30) objT6, gneVar, qim0VarF2, null, x340Var2, 224262);
                x340Var = x340Var2;
                x340Var.r(true);
            } else {
                x340Var = x340Var2;
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new j5w0(oc21Var, qim0Var, iu30Var, i, (byte) 27);
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v27 */
        /* JADX WARN: Type inference failed for: r12v8 */
        /* JADX WARN: Type inference failed for: r12v9, types: [int] */
        public static final void g(he81 he81Var, j2i j2iVar, j2i j2iVar2, j2i j2iVar3, qim0 qim0Var, VideoSurfaceView videoSurfaceView, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
            j2i j2iVar4;
            j2i j2iVar5;
            qim0 qim0Var2;
            long jA;
            Function0 function0;
            float f;
            ?? r12;
            g36 g36Var;
            boolean z;
            era eraVar = een.P0;
            int i2 = he81Var.H;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-551565649);
            j06 j06Var = x340Var.a;
            Integer num = 6;
            int i3 = i | (x340Var.i(he81Var) ? 4 : 2) | 24576 | (x340Var.i(videoSurfaceView) ? 131072 : 65536);
            if (x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
                cr31 cr31VarB = er31.b(8.0f);
                qim0 qim0Var3 = nim0.a;
                qim0 qim0VarQ = i1p1.q(qim0Var3, cr31VarB);
                u7h u7hVar = he81Var.p;
                if (u7hVar == null) {
                    x340Var.i0(-1773598157);
                    uwr uwrVar = cbx.a;
                    jA = cbx.a(x340Var).a.a.a();
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1773600048);
                    x340Var.r(false);
                    jA = u7hVar.a;
                }
                qim0 qim0VarB = u291.b(0.0f, 142.0f, 1, sgc1.D(1, u291.B(dug.f(qim0VarQ, jA, d4o1.a), (gra) null, 3)));
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                boolean z2 = x340Var.S;
                Function0 function1 = hmb0.t1;
                if (z2) {
                    x340Var.l(function1);
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
                qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
                fra fraVar = een.Z;
                jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 0);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF);
                x340Var.m0();
                if (x340Var.S) {
                    function0 = function1;
                    x340Var.l(function0);
                } else {
                    function0 = function1;
                    x340Var.v0();
                }
                nko1.H(jw31VarA, x340Var, lljVar);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar4);
                int i4 = i3 & 14;
                int iC = l1d.C(he81Var.G);
                g36 g36Var2 = h36.c;
                if (iC != 1) {
                    if (iC != 2) {
                        x340Var.i0(-814296591);
                        z = false;
                        x340Var.r(false);
                        num = num;
                    } else {
                        boolean z3 = false;
                        x340Var.i0(-815204984);
                        mxh mxhVar = he81Var.m;
                        if (mxhVar == null) {
                            x340Var.i0(-815204985);
                            x340Var.r(false);
                        } else {
                            x340Var.i0(-815204984);
                            o(6, apo.r(-1587050785, new nu31(mxhVar, he81Var, videoSurfaceView, (byte) 11), x340Var), x340Var);
                            z3 = false;
                            x340Var.r(false);
                        }
                        x340Var.r(z3);
                        z = z3;
                    }
                    g36Var = g36Var2;
                    r12 = z;
                } else {
                    num = num;
                    x340Var.i0(-814646891);
                    int iC2 = l1d.C(i2);
                    if (iC2 == 0) {
                        f = 0.0f;
                    } else {
                        if (iC2 != 1) {
                            eg.o();
                            return;
                        }
                        f = 12.0f;
                    }
                    qim0 qim0VarB2 = uyn1.B(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x019a: INVOKE (r7v4 'qim0VarB2' p.qim0) = (r19v0 ?? I:??[OBJECT, ARRAY]), (r19v2 'f' float), (r19v2 'f' float), (0.0f float), (r19v2 'f' float), (4 int) STATIC call: p.uyn1.B(p.qim0, float, float, float, float, int):p.qim0 A[DECLARE_VAR, MD:(p.qim0, float, float, float, float, int):p.qim0 (m)] (LINE:411) in method: p.j7p1.g(p.he81, p.j2i, p.j2i, p.j2i, p.qim0, com.spotify.betamax.player.VideoSurfaceView, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes4.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r19v0 ??
                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                        */
                    /*
                        Method dump skipped, instruction units count: 825
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p.j7p1.g(p.he81, p.j2i, p.j2i, p.j2i, p.qim0, com.spotify.betamax.player.VideoSurfaceView, p.b0k, int):void");
                }

                public static final void h(int i, int i2, long j, String str, b0k b0kVar) {
                    x340 x340Var = (x340) b0kVar;
                    x340Var.k0(2080429942);
                    int i3 = i2 | (x340Var.g(str) ? 4 : 2) | (x340Var.e(i) ? 32 : 16) | (x340Var.f(j) ? 256 : 128);
                    if (!x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
                        x340Var.b0();
                    } else if (ihc1.y0(str)) {
                        x340Var.i0(1710719628);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(1710436009);
                        qim0 qim0VarB = uyn1.B(nim0.a, 0.0f, 2.0f, 0.0f, 0.0f, 13);
                        uwr uwrVar = cbx.a;
                        uwo1.e(str, qim0VarB, cbx.d(x340Var).j, j, new a0e1(5), null, 2, false, new cjc0(4 - i), 0, null, x340Var, (i3 & 14) | ((i3 << 3) & 7168), 0, 1696);
                        x340Var.r(false);
                    }
                    h311 h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new n9e0(str, i, j, i2);
                    }
                }

                public static final void i(int i, int i2, String str, b0k b0kVar, iu30 iu30Var, boolean z) {
                    int i3;
                    long j;
                    lee1 lee1Var;
                    x340 x340Var = (x340) b0kVar;
                    x340Var.k0(-1612162097);
                    if ((i2 & 6) == 0) {
                        i3 = (x340Var.g(str) ? 4 : 2) | i2;
                    } else {
                        i3 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i3 |= x340Var.h(z) ? 32 : 16;
                    }
                    if ((i2 & 384) == 0) {
                        i3 |= x340Var.i(iu30Var) ? 256 : 128;
                    }
                    if ((i2 & 3072) == 0) {
                        i3 |= x340Var.e(l1d.C(i)) ? 2048 : 1024;
                    }
                    if (!x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
                        x340Var.b0();
                    } else if (ihc1.y0(str)) {
                        x340Var.i0(-1595996749);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(-1596536955);
                        if (z) {
                            x340Var.i0(1195427611);
                            uwr uwrVar = cbx.a;
                            j = cbx.a(x340Var).b.c;
                            x340Var.r(false);
                        } else {
                            x340Var.i0(1195429107);
                            uwr uwrVar2 = cbx.a;
                            j = cbx.a(x340Var).b.a;
                            x340Var.r(false);
                        }
                        if (i == 1) {
                            x340Var.i0(-1596329410);
                            lee1Var = cbx.d(x340Var).k;
                            x340Var.r(false);
                        } else {
                            x340Var.i0(-1596270851);
                            lee1Var = cbx.d(x340Var).h;
                            x340Var.r(false);
                        }
                        cjc0 cjc0Var = new cjc0(2);
                        a0e1 a0e1Var = new a0e1(5);
                        boolean z2 = (i3 & 896) == 256;
                        Object objT = x340Var.T();
                        if (z2 || objT == fkj0.X) {
                            objT = new et61(iu30Var, (byte) 8);
                            x340Var.s0(objT);
                        }
                        uwo1.e(str, null, lee1Var, j, a0e1Var, (iu30) objT, 2, false, cjc0Var, 0, null, x340Var, i3 & 14, 0, 1666);
                        x340Var.r(false);
                    }
                    h311 h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new nc81(i, i2, str, iu30Var, z);
                    }
                }

                public static final void j(he81 he81Var, b0k b0kVar, int i) {
                    int i2;
                    x340 x340Var;
                    x340 x340Var2 = (x340) b0kVar;
                    x340Var2.k0(-982264295);
                    if ((i & 6) == 0) {
                        i2 = (x340Var2.i(he81Var) ? 4 : 2) | i;
                    } else {
                        i2 = i;
                    }
                    if (x340Var2.Y(i2 & 1, (i2 & 3) != 2)) {
                        Object objT = x340Var2.T();
                        m4c m4cVar = fkj0.X;
                        if (objT == m4cVar) {
                            objT = bb00.h(2, x340Var2);
                        }
                        String str = he81Var.c;
                        String str2 = he81Var.b;
                        err0 err0Var = (hdn0) objT;
                        int iS = err0Var.s();
                        uwr uwrVar = cbx.a;
                        h(iS, 0, ((vex) zex.a.e).m, str, x340Var2);
                        if (he81Var.G == 3) {
                            x340Var2.i0(-1023096746);
                            m(Uri.parse(he81Var.e), str2, false, he81Var.d, err0Var, he81Var.H, x340Var2, 384);
                            x340Var = x340Var2;
                            x340Var.r(false);
                        } else {
                            x340Var2.i0(-1022849862);
                            boolean zI = x340Var2.i(err0Var);
                            Object objT2 = x340Var2.T();
                            if (zI || objT2 == m4cVar) {
                                objT2 = new k5r0(err0Var, (byte) 1);
                                x340Var2.s0(objT2);
                            }
                            i(he81Var.H, 48, str2, x340Var2, (iu30) objT2, false);
                            x340Var = x340Var2;
                            x340Var.r(false);
                        }
                    } else {
                        x340Var = x340Var2;
                        x340Var.b0();
                    }
                    h311 h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new oc81(he81Var, i, (byte) 0);
                    }
                }

                public static final void k(he81 he81Var, b0k b0kVar, int i) {
                    int i2;
                    b0k b0kVar2;
                    hdn0 hdn0Var;
                    b0k b0kVar3;
                    String str = he81Var.b;
                    b0k b0kVar4 = (x340) b0kVar;
                    b0kVar4.k0(-1423903580);
                    if ((i & 6) == 0) {
                        i2 = (b0kVar4.i(he81Var) ? 4 : 2) | i;
                    } else {
                        i2 = i;
                    }
                    if (b0kVar4.Y(i2 & 1, (i2 & 3) != 2)) {
                        Object objT = b0kVar4.T();
                        m4c m4cVar = fkj0.X;
                        if (objT == m4cVar) {
                            objT = bb00.h(2, b0kVar4);
                        }
                        hdn0 hdn0Var2 = (hdn0) objT;
                        if (he81Var.G == 3) {
                            b0kVar4.i0(1880602089);
                            m(Uri.parse(he81Var.e), str, he81Var.g, he81Var.d, hdn0Var2, he81Var.H, b0kVar4, 0);
                            hdn0Var = hdn0Var2;
                            b0kVar4.r(false);
                            b0kVar3 = b0kVar4;
                        } else {
                            hdn0Var = hdn0Var2;
                            b0kVar4.i0(1880819213);
                            boolean z = he81Var.g;
                            boolean zI = b0kVar4.i(hdn0Var);
                            Object objT2 = b0kVar4.T();
                            if (zI || objT2 == m4cVar) {
                                objT2 = new myg0(hdn0Var, (byte) 26);
                                b0kVar4.s0(objT2);
                            }
                            iu30 iu30Var = (iu30) objT2;
                            b0kVar3 = b0kVar4;
                            i(he81Var.H, 0, str, b0kVar3, iu30Var, z);
                            b0kVar4.r(false);
                        }
                        String str2 = he81Var.c;
                        int iS = ((err0) hdn0Var).s();
                        uwr uwrVar = cbx.a;
                        b0k b0kVar5 = b0kVar3;
                        h(iS, 0, cbx.a(b0kVar3).b.b, str2, b0kVar5);
                        b0kVar2 = b0kVar5;
                    } else {
                        b0kVar2 = b0kVar4;
                        b0kVar2.b0();
                    }
                    h311 h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new oc81(he81Var, i, (byte) 1);
                    }
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                public static final void l(he81 he81Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
                    int i2;
                    x340 x340Var = (x340) b0kVar;
                    x340Var.k0(-226181729);
                    if ((i & 6) == 0) {
                        i2 = (x340Var.i(he81Var) ? 4 : 2) | i;
                    } else {
                        i2 = i;
                    }
                    if ((i & 48) == 0) {
                        i2 |= x340Var.i(qim0Var) ? 32 : 16;
                    }
                    if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
                        mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
                        nko1.H(mbhVarA, x340Var, y580.O0);
                        nko1.H(xos0VarM, x340Var, y580.N0);
                        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                        nko1.F(x340Var);
                        nko1.H(qim0VarE, x340Var, y580.Y);
                        int iC = l1d.C(he81Var.H);
                        if (iC == 0) {
                            x340Var.i0(-2049734039);
                            k(he81Var, x340Var, i2 & 14);
                            x340Var.r(false);
                        } else {
                            if (iC != 1) {
                                throw p3d1.k(x340Var, 2012087735, false);
                            }
                            x340Var.i0(-2049645689);
                            j(he81Var, x340Var, i2 & 14);
                            x340Var.r(false);
                        }
                        x340Var.r(true);
                    } else {
                        x340Var.b0();
                    }
                    h311 h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new wjz0(he81Var, qim0Var, i, (byte) 22);
                    }
                }

                public static final void m(Uri uri, String str, boolean z, String str2, hdn0 hdn0Var, int i, b0k b0kVar, int i2) {
                    b0k b0kVar2 = (x340) b0kVar;
                    b0kVar2.k0(-1295161173);
                    int i3 = (b0kVar2.g(uri) ? 4 : 2) | i2 | (b0kVar2.g(str) ? 32 : 16);
                    if ((i2 & 384) == 0) {
                        i3 |= b0kVar2.h(z) ? 256 : 128;
                    }
                    int i4 = i3 | (b0kVar2.g(str2) ? 2048 : 1024) | (b0kVar2.i(hdn0Var) ? 16384 : 8192) | (b0kVar2.e(l1d.C(i)) ? 131072 : 65536);
                    if (b0kVar2.Y(i4 & 1, (74899 & i4) != 74898)) {
                        jw31 jw31VarA = ew31.a(h36.a, een.N0, b0kVar2, 0);
                        int iHashCode = Long.hashCode(((x340) b0kVar2).T);
                        xos0 xos0VarM = b0kVar2.m();
                        nim0 nim0Var = nim0.a;
                        qim0 qim0VarE = zr7.E(b0kVar2, nim0Var);
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
                        nko1.H(jw31VarA, b0kVar2, y580.O0);
                        nko1.H(xos0VarM, b0kVar2, y580.N0);
                        nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
                        nko1.F(b0kVar2);
                        nko1.H(qim0VarE, b0kVar2, y580.Y);
                        hux huxVarR = r(str2);
                        eso1.e(uri, isl.a, u291.r(nim0Var, 24.0f), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, new nux(huxVarR, huxVarR), false, false, b0kVar2, (i4 & 14) | 1073741872, 0, 3576);
                        b0kVar2 = b0kVar2;
                        op71.g(b0kVar2, u291.v(nim0Var, 8.0f));
                        boolean zI = b0kVar2.i(hdn0Var);
                        Object objT = b0kVar2.T();
                        if (zI || objT == fkj0.X) {
                            objT = new myg0(hdn0Var, (byte) 27);
                            b0kVar2.s0(objT);
                        }
                        i(i, ((i4 >> 3) & 126) | ((i4 >> 6) & 7168), str, b0kVar2, (iu30) objT, z);
                        b0kVar2.r(true);
                    } else {
                        b0kVar2.b0();
                    }
                    h311 h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new k3a(uri, str, z, str2, hdn0Var, i, i2);
                    }
                }

                public static final void n(String str, boolean z, iu30 iu30Var, qim0 qim0Var, lee1 lee1Var, b0k b0kVar, int i, int i2) {
                    int i3;
                    boolean z2;
                    iu30 iu30Var2;
                    lee1 lee1Var2;
                    lee1 lee1Var3;
                    qim0 qim0Var2;
                    int i4;
                    qim0 qim0Var3;
                    b0k b0kVar2 = (x340) b0kVar;
                    b0kVar2.k0(-86525315);
                    if ((i & 6) == 0) {
                        i3 = (b0kVar2.g(str) ? 4 : 2) | i;
                    } else {
                        i3 = i;
                    }
                    if ((i & 48) == 0) {
                        z2 = z;
                        i3 |= b0kVar2.h(z2) ? 32 : 16;
                    } else {
                        z2 = z;
                    }
                    if ((i & 384) == 0) {
                        iu30Var2 = iu30Var;
                        i3 |= b0kVar2.i(iu30Var2) ? 256 : 128;
                    } else {
                        iu30Var2 = iu30Var;
                    }
                    int i5 = i3 | 3072;
                    if ((i & 24576) == 0) {
                        if ((i2 & 16) == 0) {
                            lee1Var2 = lee1Var;
                            int i6 = b0kVar2.i(lee1Var2) ? 16384 : 8192;
                            i5 |= i6;
                        } else {
                            lee1Var2 = lee1Var;
                        }
                        i5 |= i6;
                    } else {
                        lee1Var2 = lee1Var;
                    }
                    if (b0kVar2.Y(i5 & 1, (i5 & 9363) != 9362)) {
                        b0kVar2.d0();
                        if ((i & 1) == 0 || b0kVar2.E()) {
                            int i7 = i2 & 16;
                            qim0 qim0Var4 = nim0.a;
                            if (i7 != 0) {
                                uwr uwrVar = cbx.a;
                                lee1Var2 = cbx.d(b0kVar2).g;
                                i5 &= -57345;
                            }
                            i4 = i5;
                            qim0Var3 = qim0Var4;
                        } else {
                            b0kVar2.b0();
                            if ((i2 & 16) != 0) {
                                i5 &= -57345;
                            }
                            i4 = i5;
                            qim0Var3 = qim0Var;
                        }
                        b0kVar2.s();
                        qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
                        uwr uwrVar2 = cbx.a;
                        mta mtaVar = cbx.b(b0kVar2).d;
                        qim0 qim0VarJ = u291.j(48.0f, 0.0f, 2, qim0VarF);
                        cvx cvxVar = cbx.b(b0kVar2).b;
                        qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarJ);
                        jw31 jw31VarA = ew31.a(h36.a, een.N0, b0kVar2, 0);
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
                        nko1.H(jw31VarA, b0kVar2, y580.O0);
                        nko1.H(xos0VarM, b0kVar2, y580.N0);
                        nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
                        nko1.F(b0kVar2);
                        nko1.H(qim0VarE, b0kVar2, y580.Y);
                        uwo1.e(str, new wnb0(1.0f, true), lee1Var2, cbx.a(b0kVar2).b.a, null, null, 0, false, null, 0, null, b0kVar2, (i4 & 14) | ((i4 >> 6) & 896), 0, 2032);
                        b0kVar2 = b0kVar2;
                        anm1.c(z2, iu30Var2, (qim0) null, (max) null, (idn0) null, b0kVar2, (i4 >> 3) & 126, 28);
                        b0kVar2.r(true);
                        lee1Var3 = lee1Var2;
                        qim0Var2 = qim0Var3;
                    } else {
                        b0kVar2.b0();
                        lee1Var3 = lee1Var2;
                        qim0Var2 = qim0Var;
                    }
                    h311 h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new oia(str, z, iu30Var, qim0Var2, lee1Var3, i, i2, (byte) 0);
                    }
                }

                public static final void o(int i, j2i j2iVar, b0k b0kVar) {
                    x340 x340Var = (x340) b0kVar;
                    x340Var.k0(1519001635);
                    if (x340Var.Y(i & 1, (i & 3) != 2)) {
                        Float fValueOf = Float.valueOf(0.8f);
                        uwr uwrVar = cbx.a;
                        mmr0[] mmr0VarArr = {new mmr0(fValueOf, new u7h(((vex) zex.a.e).a)), new mmr0(Float.valueOf(1.0f), new u7h(cbx.a(x340Var).a.a.a()))};
                        Object[] objArr = (Object[]) Array.newInstance(mmr0[].class.getComponentType(), 2);
                        int i2 = 0;
                        while (true) {
                            objArr[1 - i2] = mmr0VarArr[i2];
                            if (i2 == 1) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                        ArrayList arrayList = new ArrayList(objArr.length);
                        for (Object obj : objArr) {
                            mmr0 mmr0Var = (mmr0) obj;
                            float fFloatValue = ((Number) mmr0Var.a).floatValue();
                            u7h u7hVar = (u7h) mmr0Var.b;
                            long j = u7hVar.a;
                            arrayList.add(new mmr0(Float.valueOf(1.0f - fFloatValue), u7hVar));
                        }
                        mmr0[] mmr0VarArr2 = (mmr0[]) arrayList.toArray(new mmr0[0]);
                        qim0 qim0VarD = u291.D(u291.c(nim0.a, 1.0f), (era) null, 3);
                        boolean zI = x340Var.i(mmr0VarArr) | x340Var.i(mmr0VarArr2);
                        Object objT = x340Var.T();
                        if (zI || objT == fkj0.X) {
                            objT = new c861(mmr0VarArr, mmr0VarArr2, (byte) 27);
                            x340Var.s0(objT);
                        }
                        qim0 qim0VarS = exd0.s(qim0VarD, (iu30) objT);
                        gfh0 gfh0VarC = t1c.c(een.d, false);
                        int iHashCode = Long.hashCode(x340Var.T);
                        xos0 xos0VarM = x340Var.m();
                        qim0 qim0VarE = zr7.E(x340Var, qim0VarS);
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
                        ywx0.l(54, j2iVar, h2c.a, x340Var, true);
                    } else {
                        x340Var.b0();
                    }
                    h311 h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new j2r0(j2iVar, i, (byte) 18);
                    }
                }

                public static final frw q(yo50 yo50Var, iu30 iu30Var) {
                    z2s z2sVar = new z2s();
                    iu30Var.invoke(z2sVar);
                    kwr kwrVar = z2sVar.d;
                    return new frw(yo50Var, kwrVar.d, kwrVar.e);
                }

                public static final hux r(String str) {
                    Set set = s4b1.f;
                    if (uic.h(str, new blc0[]{blc0.Pg, blc0.Qg, blc0.Rg, blc0.Ug, blc0.Vg, blc0.z6, blc0.B6, blc0.C6}) || uic.g(str, blc0.fh)) {
                        return mrx.c;
                    }
                    if (uic.h(str, new blc0[]{blc0.g1, blc0.h1, blc0.j1})) {
                        return akx.c;
                    }
                    return (uic.i(str, s4b1.g) || uic.g(str, blc0.Yc)) ? grx.c : box.c;
                }

                public static final r6h1 s(View view) {
                    iu30 iu30Var;
                    r6h1 r6h1Var;
                    Object parent = view.getParent();
                    View view2 = parent instanceof View ? (View) parent : null;
                    if (view2 == null) {
                        n57.s("Called getParentUbiAbsoluteLocation when there's no parent view");
                        return r6h1.c;
                    }
                    ien0 ien0Var = xhk1.a;
                    h3h1 h3h1VarC = j0o1.C(xhk1.a(view2));
                    return (h3h1VarC == null || (iu30Var = h3h1VarC.b) == null || (r6h1Var = (r6h1) iu30Var.invoke(0)) == null) ? r6h1.c : r6h1Var;
                }

                public static final tmv0 t(iu30 iu30Var, kkd1 kkd1Var, Function0 function0) {
                    idd1 idd1Var = new idd1(function0);
                    zjd1 zjd1Var = kkd1Var.a;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new qmv0(kkd1Var, new jwa0(iu30Var, (byte) 22)));
                    arrayList.add(new qmv0(new krb0(zjd1Var, new ac30(idd1Var, (byte) 1)), new jwa0(iu30Var, (byte) 23)));
                    return new tmv0(zjd1Var, o7h.l1(arrayList));
                }

                public static ksk0 u() {
                    return new ksk0((byte) 4);
                }

                public static ObjectAnimator v(Object obj, Property property, Path path) {
                    return ObjectAnimator.ofObject(obj, (Property<Object, V>) property, (TypeConverter) null, path);
                }

                public static final void w(List list) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        TextView textView = (TextView) it.next();
                        Object parent = textView.getParent();
                        View view = parent instanceof View ? (View) parent : null;
                        int measuredHeight = view != null ? view.getMeasuredHeight() : 0;
                        float top = ((measuredHeight - textView.getTop()) - textView.getPaddingTop()) - textView.getPaddingBottom();
                        float lineHeight = top / textView.getLineHeight();
                        boolean z = textView.getBottom() >= measuredHeight;
                        float fFloor = 0.0f;
                        if (textView.getLineHeight() != 0 && top >= 0.0f) {
                            fFloor = (float) (z ? Math.floor(lineHeight) : Math.ceil(lineHeight));
                        }
                        textView.setMaxLines((int) fFloor);
                    }
                }

                public static final void x(View view, iu30 iu30Var) {
                    xhk1.d(view, new gom(iu30Var, (byte) 1));
                }

                public static final void y(View view, Function0 function0) {
                    xhk1.c(view, new h3h1(new izg1(function0, (byte) 13)));
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static final ArrayList z(tkh tkhVar) throws Throwable {
                    Iterator it;
                    Comment comment;
                    int i;
                    Throwable th;
                    int i2;
                    c380 c380Var;
                    int iMax;
                    Iterator it2;
                    Set set = tkhVar.f;
                    skh skhVar = tkhVar.a;
                    c380 c380Var2 = skhVar.a;
                    cqs0 cqs0Var = skhVar.b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : c380Var2) {
                        if (!set.contains(((Comment) obj).r())) {
                            arrayList.add(obj);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        Comment comment2 = (Comment) it3.next();
                        uwe1 uwe1Var = tkhVar.l;
                        boolean z = tkhVar.k;
                        int i3 = tkhVar.i;
                        ArrayList arrayListO = p7h.O(new pkh[]{new ekh(comment2, i3, z && !comment2.w(), uwe1Var)});
                        rkh rkhVar = (rkh) cqs0Var.get(comment2.r());
                        if (rkhVar != null) {
                            th = null;
                            int i4 = rkhVar.e;
                            c380 c380Var3 = rkhVar.a;
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj2 : c380Var3) {
                                Iterator it4 = it3;
                                if (!set.contains(((Reply) obj2).o())) {
                                    arrayList3.add(obj2);
                                }
                                it3 = it4;
                            }
                            it = it3;
                            syf syfVar = new syf(tkhVar, (byte) 24);
                            ArrayList arrayList4 = new ArrayList();
                            comment = comment2;
                            ArrayList arrayList5 = new ArrayList();
                            Iterator it5 = arrayList3.iterator();
                            Object obj3 = null;
                            while (it5.hasNext()) {
                                boolean z2 = z;
                                Object next = it5.next();
                                Iterator it6 = it5;
                                Object objInvoke = syfVar.invoke(next);
                                if (!objInvoke.equals(obj3)) {
                                    if (!arrayList5.isEmpty()) {
                                        arrayList4.add(o7h.l1(arrayList5));
                                        arrayList5.clear();
                                    }
                                    obj3 = objInvoke;
                                }
                                arrayList5.add(next);
                                z = z2;
                                it5 = it6;
                            }
                            boolean z3 = z;
                            if (!arrayList5.isEmpty()) {
                                arrayList4.add(o7h.l1(arrayList5));
                            }
                            Iterator it7 = arrayList4.iterator();
                            int i5 = 0;
                            while (it7.hasNext()) {
                                Object next2 = it7.next();
                                int i6 = i5 + 1;
                                if (i5 < 0) {
                                    p7h.T();
                                    throw null;
                                }
                                List list = (List) next2;
                                Reply reply = (Reply) o7h.s0(list);
                                if (reply == null) {
                                    it2 = it7;
                                } else if (reply.s()) {
                                    it2 = it7;
                                    if (tkhVar.j.contains(reply.o())) {
                                        boolean z4 = i5 < arrayList4.size() + (-1);
                                        String strO = ((Reply) o7h.q0(list)).o();
                                        boolean z5 = z4;
                                        int size = list.size();
                                        strO.getClass();
                                        arrayListO.add(new nkh(size, strO));
                                        Iterator it8 = list.iterator();
                                        while (it8.hasNext()) {
                                            arrayListO.add(new hkh((Reply) it8.next(), i3, uwe1Var));
                                        }
                                        if (z5) {
                                            arrayListO.add(new mkh(strO));
                                        }
                                    } else {
                                        arrayListO.add(new kkh(mqo1.A(list)));
                                    }
                                } else {
                                    List list2 = list;
                                    it2 = it7;
                                    ArrayList arrayList6 = new ArrayList(q7h.U(list2, 10));
                                    Iterator it9 = list2.iterator();
                                    while (it9.hasNext()) {
                                        arrayList6.add(new hkh((Reply) it9.next(), i3, uwe1Var));
                                    }
                                    arrayListO.addAll(arrayList6);
                                }
                                i5 = i6;
                                it7 = it2;
                            }
                            if (rkhVar.d) {
                                arrayListO.add(new gkh(comment.r()));
                            }
                            if (arrayListO.size() <= 1 || rkhVar.c) {
                                i = 0;
                            } else {
                                String strR = comment.r();
                                if (rkhVar.b) {
                                    i = 0;
                                    iMax = Math.max(0, i4 - c380Var3.size());
                                } else {
                                    i = 0;
                                    iMax = 0;
                                }
                                arrayListO.add(new okh(strR, iMax, (!z3 || i4 <= 3) ? i : 1));
                            }
                        } else {
                            it = it3;
                            comment = comment2;
                            i = 0;
                            th = null;
                        }
                        rkh rkhVar2 = (rkh) cqs0Var.get(comment.r());
                        if (rkhVar2 == null || (c380Var = rkhVar2.a) == null || c380Var.isEmpty()) {
                            i2 = i;
                        } else {
                            Iterator it10 = c380Var.iterator();
                            i2 = i;
                            while (it10.hasNext()) {
                                if (set.contains(((Reply) it10.next()).o()) && (i2 = i2 + 1) < 0) {
                                    p7h.S();
                                    throw th;
                                }
                            }
                        }
                        if (arrayListO.size() == 1 && comment.z() - i2 > 0) {
                            h290<AuthorMetadata> h290VarD = comment.D();
                            ArrayList arrayList7 = new ArrayList();
                            for (AuthorMetadata authorMetadata : h290VarD) {
                                authorMetadata.getClass();
                                phx phxVarB = B(authorMetadata);
                                if (phxVarB != null) {
                                    arrayList7.add(phxVarB);
                                }
                            }
                            arrayListO.add(new ikh(comment.z() - i2, comment.r(), mqo1.A(arrayList7)));
                            c380 c380Var4 = (c380) skhVar.c.get(comment.r());
                            if (c380Var4 != null) {
                                ArrayList arrayList8 = new ArrayList(q7h.U(c380Var4, 10));
                                Iterator it11 = c380Var4.iterator();
                                while (it11.hasNext()) {
                                    arrayList8.add(new hkh((Reply) it11.next(), i3, uwe1Var));
                                }
                                arrayListO.addAll(arrayList8);
                            }
                        }
                        r7h.W(arrayListO, arrayList2);
                        it3 = it;
                    }
                    if (tkhVar.d) {
                        return o7h.O0(new gkh(tkhVar.h), arrayList2);
                    }
                    if (tkhVar.e) {
                        return o7h.O0(jkh.b, arrayList2);
                    }
                    if (!tkhVar.g) {
                        return arrayList2;
                    }
                    ArrayList arrayList9 = new ArrayList(arrayList2);
                    Iterator it12 = arrayList2.iterator();
                    int i7 = 0;
                    while (true) {
                        if (!it12.hasNext()) {
                            i7 = -1;
                            break;
                        }
                        ekh ekhVar = (pkh) it12.next();
                        if ((ekhVar instanceof ekh) && ekhVar.b.y()) {
                            break;
                        }
                        i7++;
                    }
                    if (i7 != -1) {
                        arrayList9.add(i7, lkh.b);
                    }
                    return arrayList9;
                }
            }
