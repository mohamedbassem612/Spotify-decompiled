package p;

import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import com.spotify.userinteractivityservice.usercomments.v1.proto.ReactionListDisplay;
import com.spotify.userinteractivityservice.usercomments.v1.proto.ReactionsRow;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oih {
    public final yqg a;
    public final hwe1 b;
    public final xjh c;
    public final gal d;
    public final f4q e;

    public oih(yqg yqgVar, hwe1 hwe1Var, xjh xjhVar, gal galVar, f4q f4qVar) {
        this.a = yqgVar;
        this.b = hwe1Var;
        this.c = xjhVar;
        this.d = galVar;
        this.e = f4qVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void a(xhh xhhVar, boolean z, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-68248849);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(xhhVar) : x340Var.i(xhhVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(qim0Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            jtr jtrVar = jtr.f;
            boolean z2 = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new z20(iu30Var, z, (byte) 8);
                x340Var.s0(objT);
            }
            qim0 qim0VarN = anm1.N("comment_author_image_button", bin.v(qim0Var, (idn0) null, jtrVar, false, (String) null, (pm31) null, (Function0) objT, 28));
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            boolean z3 = xhhVar instanceof vhh;
            nim0 nim0Var = nim0.a;
            if (z3) {
                x340Var.i0(-2081069229);
                vhh vhhVar = (vhh) xhhVar;
                Uri uri = Uri.parse(vhhVar.b);
                jsl jslVar = new jsl(vhhVar.a);
                mrx mrxVar = mrx.c;
                eso1.e(uri, jslVar, anm1.N("comment_author_image_creator", nim0Var), new p3v(32.0f), (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, new nux(mrxVar, mrxVar), false, false, x340Var, 1073741824, 0, 3568);
                x340Var.r(false);
            } else {
                if (!(xhhVar instanceof whh)) {
                    throw p3d1.k(x340Var, 487056695, false);
                }
                x340Var.i0(-2080710187);
                whh whhVar = (whh) xhhVar;
                bmq0.a(Uri.parse(whhVar.b), anm1.N("comment_author_image_user", u291.m(nim0Var, 32.0f)), hcx.b, whhVar.c, whhVar.a, 0L, 0L, false, x340Var, 384, 224);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sx1((byte) 8, i, this, xhhVar, iu30Var, qim0Var, z);
        }
    }

    public final void b(fih fihVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var;
        tob1 tob1Var;
        byte b;
        x340 x340Var2;
        yr80 yr80Var;
        y9e1 y9e1Var;
        String str = fihVar.b;
        m4c m4cVar = fkj0.X;
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.k0(-160036039);
        int i2 = (i & 6) == 0 ? (x340Var3.i(fihVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= x340Var3.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var3.i(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var3.i(this) ? 2048 : 1024;
        }
        if (x340Var3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean zG = x340Var3.g(str);
            Object objT = x340Var3.T();
            if (zG || objT == m4cVar) {
                objT = v8r.q(null);
                x340Var3.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            Object objT2 = x340Var3.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q(null);
                x340Var3.s0(objT2);
            }
            ven0 ven0Var2 = (ven0) objT2;
            Object objT3 = x340Var3.T();
            if (objT3 == m4cVar) {
                objT3 = v8r.q(null);
                x340Var3.s0(objT3);
            }
            ven0 ven0Var3 = (ven0) objT3;
            Object objT4 = x340Var3.T();
            if (objT4 == m4cVar) {
                objT4 = v8r.q(null);
                x340Var3.s0(objT4);
            }
            tob1 tob1Var2 = (ven0) objT4;
            Object objT5 = x340Var3.T();
            if (objT5 == m4cVar) {
                objT5 = v8r.q(null);
                x340Var3.s0(objT5);
            }
            ven0 ven0Var4 = (ven0) objT5;
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var3.T);
            xos0 xos0VarM = x340Var3.m();
            int i3 = i2;
            qim0 qim0VarE = zr7.E(x340Var3, qim0Var);
            hzj.A.getClass();
            if (x340Var3.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var3.m0();
            if (x340Var3.S) {
                x340Var3.l(hmb0.t1);
            } else {
                x340Var3.v0();
            }
            nko1.H(gfh0VarC, x340Var3, y580.O0);
            nko1.H(xos0VarM, x340Var3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var3, y580.R0);
            nko1.F(x340Var3);
            nko1.H(qim0VarE, x340Var3, y580.Y);
            if (fihVar.n instanceof rwe1) {
                x340Var3.i0(283054877);
                String str2 = (String) ven0Var.getValue();
                if (str2 == null) {
                    str2 = str;
                }
                boolean zI = x340Var3.i(ven0Var2);
                Object objT6 = x340Var3.T();
                if (zI || objT6 == m4cVar) {
                    objT6 = new f4g(ven0Var2, (byte) 4);
                    x340Var3.s0(objT6);
                }
                tob1Var = tob1Var2;
                b = 6;
                e(str2, 2, null, (iu30) objT6, x340Var3, ((i3 << 3) & 57344) | 48, 4);
                x340Var2 = x340Var3;
                x340Var2.r(false);
            } else {
                tob1Var = tob1Var2;
                b = 6;
                x340Var3.i0(283252781);
                boolean z = fihVar.h;
                String str3 = (String) ven0Var.getValue();
                if (str3 == null) {
                    str3 = str;
                }
                int i4 = fihVar.k;
                uwe1 uwe1Var = fihVar.n;
                boolean zI2 = x340Var3.i(ven0Var2);
                Object objT7 = x340Var3.T();
                if (zI2 || objT7 == m4cVar) {
                    objT7 = new f4g(ven0Var2, (byte) 5);
                    x340Var3.s0(objT7);
                }
                f(2, str3, z, i4, uwe1Var, iu30Var, null, (iu30) objT7, x340Var3, ((i3 << 12) & 458752) | 6 | ((i3 << 15) & 234881024), 64);
                x340Var2 = x340Var3;
                x340Var2.r(false);
            }
            StringBuilder sb = new StringBuilder(16);
            ArrayList arrayListM = xvj1.m();
            new ArrayList();
            sb.append("…");
            String string = sb.toString();
            ArrayList arrayList = new ArrayList(arrayListM.size());
            int iG = 0;
            for (int size = arrayListM.size(); iG < size; size = size) {
                iG = c13.g(sb, (xe5) arrayListM.get(iG), arrayList, iG, 1);
            }
            af5 af5Var = new af5(string, arrayList);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var2).j;
            long j = cbx.a(x340Var2).b.a;
            boolean zI3 = x340Var2.i(tob1Var);
            Object objT8 = x340Var2.T();
            if (zI3 || objT8 == m4cVar) {
                objT8 = new f4g(tob1Var, b);
                x340Var2.s0(objT8);
            }
            qim0 qim0VarK = d9y0.k(eqr0.B(nim0.a, (iu30) objT8), ((qr80) tob1Var.getValue()) != null ? 1.0f : 0.0f);
            boolean zI4 = x340Var2.i((Object) 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x024c: ARITH (r7v20 'zI4' boolean) = (wrap boolean:0x0244: INVOKE (r12v6 'x340Var2' p.x340), (wrap java.lang.Object:?: CAST (java.lang.Object) (r18v0 ?? I:??[OBJECT, ARRAY])) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED] (LINE:581)) | (wrap boolean:0x0248: INVOKE (r12v6 'x340Var2' p.x340), (r6v3 'ven0Var4' p.ven0) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED] (LINE:585)) A[DECLARE_VAR] (LINE:589) in method: p.oih.b(p.fih, p.iu30, p.qim0, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes7.dex
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r18v0 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 759
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.oih.b(p.fih, p.iu30, p.qim0, p.b0k, int):void");
        }

        public final void c(fih fihVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
            int i2;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(537354548);
            if ((i & 6) == 0) {
                i2 = (x340Var.i(fihVar) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= x340Var.i(iu30Var) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= x340Var.i(qim0Var) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i2 |= x340Var.i(this) ? 2048 : 1024;
            }
            if (!x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
                x340Var.b0();
            } else if (fihVar.e) {
                x340Var.i0(986341017);
                b(fihVar, iu30Var, qim0Var, x340Var, i2 & 8190);
                x340Var.r(false);
            } else if (fihVar.n instanceof rwe1) {
                x340Var.i0(986496110);
                e(fihVar.b, Integer.MAX_VALUE, qim0Var, null, x340Var, (i2 & 896) | 48 | ((i2 << 3) & 57344), 8);
                x340Var.r(false);
            } else {
                x340Var.i0(986735058);
                int i3 = i2 << 12;
                f(Integer.MAX_VALUE, fihVar.b, fihVar.h, fihVar.k, fihVar.n, iu30Var, qim0Var, null, x340Var, (i3 & 3670016) | (458752 & i3) | 6 | ((i2 << 15) & 234881024), 128);
                x340Var = x340Var;
                x340Var.r(false);
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new gih(this, fihVar, iu30Var, qim0Var, i, (byte) 1);
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Code duplicated, block: B:107:0x03ae  */
        /* JADX WARN: Code duplicated, block: B:110:0x03bf  */
        /* JADX WARN: Code duplicated, block: B:112:0x03cf  */
        /* JADX WARN: Code duplicated, block: B:123:0x03fa  */
        /* JADX WARN: Code duplicated, block: B:126:0x040a  */
        /* JADX WARN: Code duplicated, block: B:127:0x041c  */
        /* JADX WARN: Code duplicated, block: B:129:0x0420  */
        /* JADX WARN: Code duplicated, block: B:133:0x0443 A[LOOP:0: B:131:0x043d->B:133:0x0443, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:136:0x046e  */
        /* JADX WARN: Code duplicated, block: B:137:0x0470  */
        /* JADX WARN: Code duplicated, block: B:141:0x047e  */
        /* JADX WARN: Code duplicated, block: B:145:0x04b8  */
        /* JADX WARN: Code duplicated, block: B:148:0x04eb  */
        /* JADX WARN: Code duplicated, block: B:150:0x04f4  */
        /* JADX WARN: Code duplicated, block: B:151:0x04f8  */
        /* JADX WARN: Code duplicated, block: B:154:0x0575  */
        /* JADX WARN: Code duplicated, block: B:155:0x0579  */
        /* JADX WARN: Code duplicated, block: B:158:0x05a8  */
        /* JADX WARN: Code duplicated, block: B:161:0x05bd  */
        /* JADX WARN: Code duplicated, block: B:164:0x05cf  */
        /* JADX WARN: Code duplicated, block: B:167:0x05e8  */
        /* JADX WARN: Code duplicated, block: B:170:0x05fc  */
        /* JADX WARN: Code duplicated, block: B:172:0x06b7  */
        /* JADX WARN: Code duplicated, block: B:174:0x06bb  */
        /* JADX WARN: Code duplicated, block: B:176:0x06bf  */
        /* JADX WARN: Code duplicated, block: B:93:0x0369  */
        /* JADX WARN: Code duplicated, block: B:96:0x037a  */
        public final void d(fih fihVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i, int i2) throws Throwable {
            qim0 qim0Var2;
            int i3;
            x340 x340Var;
            Throwable th;
            boolean z;
            boolean zI;
            Object objT;
            Function0 function0;
            String strO0;
            boolean zI2;
            Object objT2;
            Function0 function1;
            ArrayList arrayList;
            Iterator it;
            qim0 qim0Var3;
            boolean z2;
            boolean zI3;
            Object objT3;
            Context context;
            boolean zI4;
            Object objT4;
            jw31 jw31VarA;
            int iHashCode;
            xos0 xos0VarM;
            qim0 qim0VarE;
            boolean z3;
            n4k n4kVar;
            wat watVar;
            Object objT5;
            Object objT6;
            xhl xhlVar;
            Object objT7;
            Object objT8;
            Object objT9;
            String strO1;
            boolean zI5;
            Object objT10;
            Function0 function2;
            et90 et90Var;
            fih fihVar2 = fihVar;
            m4c m4cVar = fkj0.X;
            ReactionsRow reactionsRow = fihVar2.l;
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.k0(1143635820);
            j06 j06Var = x340Var2.a;
            int i4 = i | (x340Var2.i(fihVar2) ? 4 : 2) | (x340Var2.i(iu30Var) ? 32 : 16);
            int i5 = i2 & 4;
            if (i5 != 0) {
                i3 = i4 | 384;
                qim0Var2 = qim0Var;
            } else {
                qim0Var2 = qim0Var;
                i3 = i4 | (x340Var2.i(qim0Var2) ? 256 : 128);
            }
            int i6 = (x340Var2.i(this) ? 2048 : 1024) | i3;
            if (x340Var2.Y(i6 & 1, (i6 & 1171) != 1170)) {
                qim0 qim0Var4 = nim0.a;
                qim0 qim0Var5 = i5 != 0 ? qim0Var4 : qim0Var2;
                x340Var2.f0(-477598507, fihVar2.d);
                Context context2 = (Context) x340Var2.k(AndroidCompositionLocals_androidKt.b);
                Object objT11 = x340Var2.T();
                if (objT11 == m4cVar) {
                    objT11 = new PublishSubject();
                    x340Var2.s0(objT11);
                }
                objT11.getClass();
                PublishSubject publishSubject = (PublishSubject) objT11;
                Object objT12 = x340Var2.T();
                if (objT12 == m4cVar) {
                    mmv0.a.getClass();
                    c9 c9Var = lmv0.b;
                    f4q f4qVar = this.e;
                    switch (f4qVar.a) {
                        case 0:
                            v5q v5qVar = f4qVar.b.c;
                            daq daqVar = v5qVar.b;
                            et90Var = new et90(c9Var, new ytp0((Context) daqVar.x1.a, (g4q) v5qVar.c2.get(), (qxz0) v5qVar.d2.get(), (h4q) v5qVar.e2.get(), (zwz0) daqVar.U1.get(), (byte) 23), new h301(new zj1((txz0) v5qVar.f2.get(), (byte) 0), new zj1((txz0) v5qVar.f2.get(), (byte) 1), (t001) v5qVar.m2.get(), new x981((jjz) v5qVar.h2.get(), ((Boolean) v5qVar.b.W2.get()).booleanValue(), (byte) 0)), publishSubject);
                            objT12 = et90Var;
                            break;
                        case 1:
                            s7q s7qVar = f4qVar.b.d;
                            daq daqVar2 = s7qVar.b;
                            et90Var = new et90(c9Var, new ytp0((Context) daqVar2.x1.a, (g4q) s7qVar.If.get(), (qxz0) s7qVar.Jf.get(), (h4q) s7qVar.b8.get(), (zwz0) daqVar2.U1.get(), (byte) 23), new h301(new zj1((txz0) s7qVar.cg.get(), (byte) 0), new zj1((txz0) s7qVar.cg.get(), (byte) 1), (t001) s7qVar.hg.get(), new x981((jjz) s7qVar.g6.get(), ((Boolean) s7qVar.b.W2.get()).booleanValue(), (byte) 0)), publishSubject);
                            objT12 = et90Var;
                            break;
                        default:
                            teq teqVar = f4qVar.b.d;
                            reactionsRow = reactionsRow;
                            j06Var = j06Var;
                            i6 = i6;
                            context2 = context2;
                            objT12 = new et90(c9Var, teqVar.c3(), new h301(new zj1((txz0) teqVar.T1.get(), (byte) 0), new zj1((txz0) teqVar.T1.get(), (byte) 1), (t001) teqVar.a2.get(), new x981((jjz) teqVar.V1.get(), ((Boolean) teqVar.d.W2.get()).booleanValue(), (byte) 0)), publishSubject);
                            break;
                    }
                    x340Var2.s0(objT12);
                } else {
                    reactionsRow = reactionsRow;
                    context2 = context2;
                    j06Var = j06Var;
                    i6 = i6;
                }
                xpw xpwVar = (xpw) objT12;
                boolean z4 = fihVar2.m;
                boolean zI6 = x340Var2.i(publishSubject);
                Object objT13 = x340Var2.T();
                if (zI6 || objT13 == m4cVar) {
                    objT13 = new qka(1, publishSubject, PublishSubject.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, (byte) 28);
                    x340Var2.s0(objT13);
                }
                iu30 iu30Var2 = (iu30) objT13;
                int i7 = i6 & 14;
                int i8 = i6 & 112;
                int i9 = i6 << 3;
                int i10 = i9 & 57344;
                int i11 = (i6 & 126) | i10;
                ArrayList arrayList2 = new ArrayList();
                if ((reactionsRow != null ? reactionsRow.p() : 0) > 0) {
                    x340Var2.i0(-312680533);
                    String strO2 = cwl1.o0(x340Var2, 2131954072);
                    boolean zG = x340Var2.g(iu30Var2);
                    Object objT14 = x340Var2.T();
                    if (zG || objT14 == m4cVar) {
                        objT14 = new thh(iu30Var2, (byte) 4);
                        x340Var2.s0(objT14);
                    }
                    Function0 function3 = (Function0) objT14;
                    if (ihc1.y0(strO2)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return;
                    } else {
                        arrayList2.add(new gbx(new y50(strO2), function3));
                        x340Var2.r(false);
                    }
                } else {
                    x340Var2.i0(-312364364);
                    x340Var2.r(false);
                }
                String strR = reactionsRow != null ? reactionsRow.r() : null;
                if (strR == null || strR.length() == 0) {
                    x340Var2.i0(-312296009);
                    String strO3 = cwl1.o0(x340Var2, 2131954069);
                    boolean zG2 = x340Var2.g(iu30Var2);
                    Object objT15 = x340Var2.T();
                    if (zG2 || objT15 == m4cVar) {
                        objT15 = new thh(iu30Var2, (byte) 3);
                        x340Var2.s0(objT15);
                    }
                    Function0 function4 = (Function0) objT15;
                    if (ihc1.y0(strO3)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return;
                    } else {
                        arrayList2.add(new gbx(new y50(strO3), function4));
                        x340Var2.r(false);
                    }
                } else {
                    x340Var2.i0(-311991372);
                    x340Var2.r(false);
                }
                String strN0 = cwl1.n0(2131954071, new Object[]{fihVar2.a.getName()}, x340Var2);
                int i12 = (i11 & 112) ^ 48;
                if (i12 <= 32 || !x340Var2.g(iu30Var)) {
                    th = null;
                    if ((i11 & 48) != 32) {
                        z = false;
                    }
                    zI = z | x340Var2.i(fihVar2);
                    objT = x340Var2.T();
                    if (zI || objT == m4cVar) {
                        objT = new hih(iu30Var, fihVar2, (byte) 5);
                        x340Var2.s0(objT);
                    }
                    function0 = (Function0) objT;
                    if (!ihc1.y0(strN0)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return;
                    }
                    arrayList2.add(new gbx(new y50(strN0), function0));
                    strO0 = cwl1.o0(x340Var2, 2131954070);
                    zI2 = ((i12 <= 32 && x340Var2.g(iu30Var)) || (i11 & 48) == 32) | x340Var2.i(fihVar2);
                    objT2 = x340Var2.T();
                    if (zI2 || objT2 == m4cVar) {
                        objT2 = new hih(iu30Var, fihVar2, (byte) 4);
                        x340Var2.s0(objT2);
                    }
                    function1 = (Function0) objT2;
                    if (!ihc1.y0(strO0)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return;
                    }
                    arrayList2.add(new gbx(new y50(strO0), function1));
                    if (z4) {
                        x340Var2.i0(-311343534);
                        strO1 = cwl1.o0(x340Var2, 2131954091);
                        zI5 = ((i12 <= 32 && x340Var2.g(iu30Var)) || (i11 & 48) == 32) | x340Var2.i(fihVar2);
                        objT10 = x340Var2.T();
                        if (zI5 || objT10 == m4cVar) {
                            objT10 = new hih(iu30Var, fihVar2, (byte) 6);
                            x340Var2.s0(objT10);
                        }
                        function2 = (Function0) objT10;
                        if (!ihc1.y0(strO1)) {
                            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                            return;
                        } else {
                            arrayList2.add(new gbx(new y50(strO1), function2));
                            x340Var2.r(false);
                        }
                    } else {
                        x340Var2.i0(-311034092);
                        x340Var2.r(false);
                    }
                    c380 c380VarA = mqo1.A(arrayList2);
                    arrayList = new ArrayList(q7h.U(c380VarA, 10));
                    it = c380VarA.iterator();
                    while (it.hasNext()) {
                        arrayList.add((epo) ((gbx) it.next()).d.getValue());
                    }
                    qim0 qim0VarB = uyn1.B(qim0Var5, dsa0.m(x340Var2, 2131165521), 0.0f, 0.0f, 0.0f, 14);
                    qim0Var3 = qim0Var5;
                    if (i8 == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zI3 = z2 | x340Var2.i(fihVar2);
                    objT3 = x340Var2.T();
                    if (zI3 || objT3 == m4cVar) {
                        objT3 = new hih(iu30Var, fihVar2, (byte) 0);
                        x340Var2.s0(objT3);
                    }
                    qim0 qim0VarX = bin.x(qim0VarB, false, (String) null, (pm31) null, (idn0) null, (Function0) objT3, 15);
                    context = context2;
                    zI4 = x340Var2.i(this) | x340Var2.i(context) | x340Var2.i(fihVar2) | x340Var2.i(arrayList);
                    objT4 = x340Var2.T();
                    if (zI4 || objT4 == m4cVar) {
                        ggh gghVar = new ggh(this, context, fihVar2, arrayList, (byte) 1);
                        fihVar2 = fihVar2;
                        x340Var2.s0(gghVar);
                        objT4 = gghVar;
                    }
                    qim0 qim0VarA = s161.a(qim0VarX, (iu30) objT4);
                    jw31VarA = ew31.a(h36.a, een.Z, x340Var2, 0);
                    iHashCode = Long.hashCode(x340Var2.T);
                    xos0VarM = x340Var2.m();
                    qim0VarE = zr7.E(x340Var2, qim0VarA);
                    hzj.A.getClass();
                    if (j06Var != null) {
                        tgp1.p();
                        throw th;
                    }
                    x340Var2.m0();
                    z3 = x340Var2.S;
                    n4kVar = hmb0.t1;
                    if (z3) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    llj lljVar = y580.O0;
                    nko1.H(jw31VarA, x340Var2, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM, x340Var2, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf, x340Var2, lljVar3);
                    nko1.F(x340Var2);
                    llj lljVar4 = y580.Y;
                    nko1.H(qim0VarE, x340Var2, lljVar4);
                    xhh xhhVar = fihVar2.a;
                    boolean z5 = fihVar2.h;
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    cvx cvxVar2 = cbx.b(x340Var2).b;
                    a(xhhVar, z5, iu30Var, uyn1.B(qim0Var4, 0.0f, 8.0f, 12.0f, 0.0f, 9), x340Var2, i9 & 58240);
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
                    int iHashCode2 = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM2 = x340Var2.m();
                    qim0 qim0VarE2 = zr7.E(x340Var2, qim0Var4);
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(mbhVarA, x340Var2, lljVar);
                    nko1.H(xos0VarM2, x340Var2, lljVar2);
                    x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                    nko1.H(qim0VarE2, x340Var2, lljVar4);
                    qim0 qim0VarF = u291.f(qim0Var4, 1.0f);
                    x340Var2.j0(475845883);
                    watVar = (wat) x340Var2.k(t4k.h);
                    x340Var2.j0(-492369756);
                    objT5 = x340Var2.T();
                    if (objT5 == m4cVar) {
                        objT5 = x0d.o(watVar, x340Var2);
                    }
                    x340Var2.r(false);
                    ufh0 ufh0Var = (ufh0) objT5;
                    x340Var2.j0(-492369756);
                    objT6 = x340Var2.T();
                    if (objT6 == m4cVar) {
                        objT6 = x0d.m(x340Var2);
                    }
                    x340Var2.r(false);
                    xhlVar = (xhl) objT6;
                    x340Var2.j0(-492369756);
                    objT7 = x340Var2.T();
                    if (objT7 == m4cVar) {
                        objT7 = v8r.q(Boolean.FALSE);
                        x340Var2.s0(objT7);
                    }
                    x340Var2.r(false);
                    ven0 ven0Var = (ven0) objT7;
                    x340Var2.j0(-492369756);
                    objT8 = x340Var2.T();
                    if (objT8 == m4cVar) {
                        objT8 = x0d.n(xhlVar, x340Var2);
                    }
                    x340Var2.r(false);
                    nil nilVar = (nil) objT8;
                    x340Var2.j0(-492369756);
                    objT9 = x340Var2.T();
                    if (objT9 == m4cVar) {
                        objT9 = bb00.i(rih1.a, f331.X0, x340Var2);
                    }
                    x340Var2.r(false);
                    ven0 ven0Var2 = (ven0) objT9;
                    who1.h(s161.b(qim0VarF, false, new tu(ufh0Var, (byte) 2)), apo.i(x340Var2, -1488813576, new ta5((Object) ven0Var2, (Object) xhlVar, (Object) new su(ven0Var, nilVar, (byte) 2), (Object) x340Var2, (Object) this, (Object) fihVar, iu30Var, (byte) 7)), new ru(ven0Var2, ufh0Var, nilVar, ven0Var, (byte) 2), x340Var2, 48);
                    x340Var2.r(false);
                    cvx cvxVar3 = cbx.b(x340Var2).b;
                    cvx cvxVar4 = cbx.b(x340Var2).b;
                    int i13 = i6;
                    c(fihVar, iu30Var, uyn1.B(qim0Var4, 0.0f, 4.0f, 16.0f, 0.0f, 9), x340Var2, i13 & 7294);
                    qim0 qim0VarF2 = u291.f(qim0Var4, 1.0f);
                    cvx cvxVar5 = cbx.b(x340Var2).b;
                    cvx cvxVar6 = cbx.b(x340Var2).b;
                    qim0 qim0VarB2 = uyn1.B(qim0VarF2, 0.0f, 4.0f, 12.0f, 0.0f, 9);
                    mta mtaVar = cbx.b(x340Var2).d;
                    j(fihVar, xpwVar, u291.b(0.0f, 32.0f, 1, qim0VarB2), iu30Var, x340Var2, i7 | ((i13 << 6) & 7168) | i10);
                    x340Var = x340Var2;
                    us71.m(x340Var, true, true, false);
                    qim0Var2 = qim0Var3;
                } else {
                    th = null;
                }
                z = true;
                zI = z | x340Var2.i(fihVar2);
                objT = x340Var2.T();
                if (zI) {
                    objT = new hih(iu30Var, fihVar2, (byte) 5);
                    x340Var2.s0(objT);
                } else {
                    objT = new hih(iu30Var, fihVar2, (byte) 5);
                    x340Var2.s0(objT);
                }
                function0 = (Function0) objT;
                if (!ihc1.y0(strN0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                arrayList2.add(new gbx(new y50(strN0), function0));
                strO0 = cwl1.o0(x340Var2, 2131954070);
                zI2 = ((i12 <= 32 && x340Var2.g(iu30Var)) || (i11 & 48) == 32) | x340Var2.i(fihVar2);
                objT2 = x340Var2.T();
                if (zI2) {
                    objT2 = new hih(iu30Var, fihVar2, (byte) 4);
                    x340Var2.s0(objT2);
                } else {
                    objT2 = new hih(iu30Var, fihVar2, (byte) 4);
                    x340Var2.s0(objT2);
                }
                function1 = (Function0) objT2;
                if (!ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                arrayList2.add(new gbx(new y50(strO0), function1));
                if (z4) {
                    x340Var2.i0(-311343534);
                    strO1 = cwl1.o0(x340Var2, 2131954091);
                    zI5 = ((i12 <= 32 && x340Var2.g(iu30Var)) || (i11 & 48) == 32) | x340Var2.i(fihVar2);
                    objT10 = x340Var2.T();
                    if (zI5) {
                        objT10 = new hih(iu30Var, fihVar2, (byte) 6);
                        x340Var2.s0(objT10);
                    } else {
                        objT10 = new hih(iu30Var, fihVar2, (byte) 6);
                        x340Var2.s0(objT10);
                    }
                    function2 = (Function0) objT10;
                    if (!ihc1.y0(strO1)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return;
                    } else {
                        arrayList2.add(new gbx(new y50(strO1), function2));
                        x340Var2.r(false);
                    }
                } else {
                    x340Var2.i0(-311034092);
                    x340Var2.r(false);
                }
                c380 c380VarA2 = mqo1.A(arrayList2);
                arrayList = new ArrayList(q7h.U(c380VarA2, 10));
                it = c380VarA2.iterator();
                while (it.hasNext()) {
                    arrayList.add((epo) ((gbx) it.next()).d.getValue());
                }
                qim0 qim0VarB3 = uyn1.B(qim0Var5, dsa0.m(x340Var2, 2131165521), 0.0f, 0.0f, 0.0f, 14);
                qim0Var3 = qim0Var5;
                if (i8 == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zI3 = z2 | x340Var2.i(fihVar2);
                objT3 = x340Var2.T();
                if (zI3) {
                    objT3 = new hih(iu30Var, fihVar2, (byte) 0);
                    x340Var2.s0(objT3);
                } else {
                    objT3 = new hih(iu30Var, fihVar2, (byte) 0);
                    x340Var2.s0(objT3);
                }
                qim0 qim0VarX2 = bin.x(qim0VarB3, false, (String) null, (pm31) null, (idn0) null, (Function0) objT3, 15);
                context = context2;
                zI4 = x340Var2.i(this) | x340Var2.i(context) | x340Var2.i(fihVar2) | x340Var2.i(arrayList);
                objT4 = x340Var2.T();
                if (zI4) {
                    ggh gghVar2 = new ggh(this, context, fihVar2, arrayList, (byte) 1);
                    fihVar2 = fihVar2;
                    x340Var2.s0(gghVar2);
                    objT4 = gghVar2;
                } else {
                    ggh gghVar3 = new ggh(this, context, fihVar2, arrayList, (byte) 1);
                    fihVar2 = fihVar2;
                    x340Var2.s0(gghVar3);
                    objT4 = gghVar3;
                }
                qim0 qim0VarA2 = s161.a(qim0VarX2, (iu30) objT4);
                jw31VarA = ew31.a(h36.a, een.Z, x340Var2, 0);
                iHashCode = Long.hashCode(x340Var2.T);
                xos0VarM = x340Var2.m();
                qim0VarE = zr7.E(x340Var2, qim0VarA2);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw th;
                }
                x340Var2.m0();
                z3 = x340Var2.S;
                n4kVar = hmb0.t1;
                if (z3) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                llj lljVar5 = y580.O0;
                nko1.H(jw31VarA, x340Var2, lljVar5);
                llj lljVar6 = y580.N0;
                nko1.H(xos0VarM, x340Var2, lljVar6);
                Integer numValueOf2 = Integer.valueOf(iHashCode);
                llj lljVar7 = y580.R0;
                nko1.H(numValueOf2, x340Var2, lljVar7);
                nko1.F(x340Var2);
                llj lljVar8 = y580.Y;
                nko1.H(qim0VarE, x340Var2, lljVar8);
                xhh xhhVar2 = fihVar2.a;
                boolean z6 = fihVar2.h;
                uwr uwrVar2 = cbx.a;
                cvx cvxVar7 = cbx.b(x340Var2).b;
                cvx cvxVar8 = cbx.b(x340Var2).b;
                a(xhhVar2, z6, iu30Var, uyn1.B(qim0Var4, 0.0f, 8.0f, 12.0f, 0.0f, 9), x340Var2, i9 & 58240);
                mbh mbhVarA2 = jbh.a(h36.c, een.P0, x340Var2, 0);
                int iHashCode3 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM3 = x340Var2.m();
                qim0 qim0VarE3 = zr7.E(x340Var2, qim0Var4);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(mbhVarA2, x340Var2, lljVar5);
                nko1.H(xos0VarM3, x340Var2, lljVar6);
                x0d.q(iHashCode3, x340Var2, lljVar7, x340Var2);
                nko1.H(qim0VarE3, x340Var2, lljVar8);
                qim0 qim0VarF3 = u291.f(qim0Var4, 1.0f);
                x340Var2.j0(475845883);
                watVar = (wat) x340Var2.k(t4k.h);
                x340Var2.j0(-492369756);
                objT5 = x340Var2.T();
                if (objT5 == m4cVar) {
                    objT5 = x0d.o(watVar, x340Var2);
                }
                x340Var2.r(false);
                ufh0 ufh0Var2 = (ufh0) objT5;
                x340Var2.j0(-492369756);
                objT6 = x340Var2.T();
                if (objT6 == m4cVar) {
                    objT6 = x0d.m(x340Var2);
                }
                x340Var2.r(false);
                xhlVar = (xhl) objT6;
                x340Var2.j0(-492369756);
                objT7 = x340Var2.T();
                if (objT7 == m4cVar) {
                    objT7 = v8r.q(Boolean.FALSE);
                    x340Var2.s0(objT7);
                }
                x340Var2.r(false);
                ven0 ven0Var3 = (ven0) objT7;
                x340Var2.j0(-492369756);
                objT8 = x340Var2.T();
                if (objT8 == m4cVar) {
                    objT8 = x0d.n(xhlVar, x340Var2);
                }
                x340Var2.r(false);
                nil nilVar2 = (nil) objT8;
                x340Var2.j0(-492369756);
                objT9 = x340Var2.T();
                if (objT9 == m4cVar) {
                    objT9 = bb00.i(rih1.a, f331.X0, x340Var2);
                }
                x340Var2.r(false);
                ven0 ven0Var4 = (ven0) objT9;
                who1.h(s161.b(qim0VarF3, false, new tu(ufh0Var2, (byte) 2)), apo.i(x340Var2, -1488813576, new ta5((Object) ven0Var4, (Object) xhlVar, (Object) new su(ven0Var3, nilVar2, (byte) 2), (Object) x340Var2, (Object) this, (Object) fihVar, iu30Var, (byte) 7)), new ru(ven0Var4, ufh0Var2, nilVar2, ven0Var3, (byte) 2), x340Var2, 48);
                x340Var2.r(false);
                cvx cvxVar9 = cbx.b(x340Var2).b;
                cvx cvxVar10 = cbx.b(x340Var2).b;
                int i14 = i6;
                c(fihVar, iu30Var, uyn1.B(qim0Var4, 0.0f, 4.0f, 16.0f, 0.0f, 9), x340Var2, i14 & 7294);
                qim0 qim0VarF4 = u291.f(qim0Var4, 1.0f);
                cvx cvxVar11 = cbx.b(x340Var2).b;
                cvx cvxVar12 = cbx.b(x340Var2).b;
                qim0 qim0VarB4 = uyn1.B(qim0VarF4, 0.0f, 4.0f, 12.0f, 0.0f, 9);
                mta mtaVar2 = cbx.b(x340Var2).d;
                j(fihVar, xpwVar, u291.b(0.0f, 32.0f, 1, qim0VarB4), iu30Var, x340Var2, i7 | ((i14 << 6) & 7168) | i10);
                x340Var = x340Var2;
                us71.m(x340Var, true, true, false);
                qim0Var2 = qim0Var3;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new m82(this, fihVar, iu30Var, qim0Var2, i, i2);
            }
        }

        /* JADX WARN: Code duplicated, block: B:30:0x004f  */
        /* JADX WARN: Code duplicated, block: B:32:0x0054  */
        /* JADX WARN: Code duplicated, block: B:34:0x0058  */
        /* JADX WARN: Code duplicated, block: B:36:0x0060  */
        /* JADX WARN: Code duplicated, block: B:37:0x0063  */
        /* JADX WARN: Code duplicated, block: B:41:0x006c  */
        /* JADX WARN: Code duplicated, block: B:42:0x006e  */
        /* JADX WARN: Code duplicated, block: B:45:0x0077 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:46:0x0079  */
        /* JADX WARN: Code duplicated, block: B:47:0x007c  */
        /* JADX WARN: Code duplicated, block: B:49:0x007f  */
        /* JADX WARN: Code duplicated, block: B:51:0x0087  */
        /* JADX WARN: Code duplicated, block: B:53:0x0090  */
        /* JADX WARN: Code duplicated, block: B:55:0x00ca  */
        /* JADX WARN: Code duplicated, block: B:58:0x00d7  */
        /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
        public final void e(String str, int i, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i2, int i3) {
            int i4;
            qim0 qim0Var2;
            int i5;
            iu30 iu30Var2;
            int i6;
            boolean z;
            b0k b0kVar2;
            qim0 qim0Var3;
            iu30 iu30Var3;
            h311 h311VarV;
            iu30 iu30Var4;
            Object objT;
            b0k b0kVar3 = (x340) b0kVar;
            b0kVar3.k0(-968378842);
            if ((i2 & 6) == 0) {
                i4 = (b0kVar3.g(str) ? 4 : 2) | i2;
            } else {
                i4 = i2;
            }
            if ((i2 & 48) == 0) {
                i4 |= b0kVar3.e(i) ? 32 : 16;
            }
            int i7 = i3 & 4;
            if (i7 == 0) {
                if ((i2 & 384) == 0) {
                    qim0Var2 = qim0Var;
                    i4 |= b0kVar3.i(qim0Var2) ? 256 : 128;
                }
                i5 = i3 & 8;
                if (i5 != 0) {
                    if ((i2 & 3072) == 0) {
                        iu30Var2 = iu30Var;
                        if (b0kVar3.i(iu30Var2)) {
                            i6 = 2048;
                        } else {
                            i6 = 1024;
                        }
                        i4 |= i6;
                    }
                    if ((i4 & 1171) != 1170) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (b0kVar3.Y(i4 & 1, z)) {
                        if (i7 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var2;
                        }
                        if (i5 != 0) {
                            objT = b0kVar3.T();
                            if (objT == fkj0.X) {
                                objT = cgh.S0;
                                b0kVar3.s0(objT);
                            }
                            iu30Var4 = (iu30) objT;
                        } else {
                            iu30Var4 = iu30Var2;
                        }
                        uwr uwrVar = cbx.a;
                        b0kVar2 = b0kVar3;
                        uwo1.e(str, anm1.N("comment_text", qim0Var3), cbx.d(b0kVar3).j, cbx.a(b0kVar3).b.a, (a0e1) null, iu30Var4, 2, false, new cjc0(i), 0, (qx8) null, b0kVar2, (i4 & 14) | ((i4 << 6) & 458752), 0, 1680);
                        iu30Var3 = iu30Var4;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        qim0Var3 = qim0Var2;
                        iu30Var3 = iu30Var2;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new kih(this, str, i, qim0Var3, iu30Var3, i2, i3);
                    }
                }
                i4 |= 3072;
                iu30Var2 = iu30Var;
                if ((i4 & 1171) != 1170) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i4 & 1, z)) {
                    if (i7 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var2;
                    }
                    if (i5 != 0) {
                        objT = b0kVar3.T();
                        if (objT == fkj0.X) {
                            objT = cgh.S0;
                            b0kVar3.s0(objT);
                        }
                        iu30Var4 = (iu30) objT;
                    } else {
                        iu30Var4 = iu30Var2;
                    }
                    uwr uwrVar2 = cbx.a;
                    b0kVar2 = b0kVar3;
                    uwo1.e(str, anm1.N("comment_text", qim0Var3), cbx.d(b0kVar3).j, cbx.a(b0kVar3).b.a, (a0e1) null, iu30Var4, 2, false, new cjc0(i), 0, (qx8) null, b0kVar2, (i4 & 14) | ((i4 << 6) & 458752), 0, 1680);
                    iu30Var3 = iu30Var4;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    qim0Var3 = qim0Var2;
                    iu30Var3 = iu30Var2;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new kih(this, str, i, qim0Var3, iu30Var3, i2, i3);
                }
            }
            i4 |= 384;
            qim0Var2 = qim0Var;
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i2 & 3072) == 0) {
                    iu30Var2 = iu30Var;
                    if (b0kVar3.i(iu30Var2)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i4 |= i6;
                }
                if ((i4 & 1171) != 1170) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i4 & 1, z)) {
                    if (i7 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var2;
                    }
                    if (i5 != 0) {
                        objT = b0kVar3.T();
                        if (objT == fkj0.X) {
                            objT = cgh.S0;
                            b0kVar3.s0(objT);
                        }
                        iu30Var4 = (iu30) objT;
                    } else {
                        iu30Var4 = iu30Var2;
                    }
                    uwr uwrVar3 = cbx.a;
                    b0kVar2 = b0kVar3;
                    uwo1.e(str, anm1.N("comment_text", qim0Var3), cbx.d(b0kVar3).j, cbx.a(b0kVar3).b.a, (a0e1) null, iu30Var4, 2, false, new cjc0(i), 0, (qx8) null, b0kVar2, (i4 & 14) | ((i4 << 6) & 458752), 0, 1680);
                    iu30Var3 = iu30Var4;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    qim0Var3 = qim0Var2;
                    iu30Var3 = iu30Var2;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new kih(this, str, i, qim0Var3, iu30Var3, i2, i3);
                }
            }
            i4 |= 3072;
            iu30Var2 = iu30Var;
            if ((i4 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i4 & 1, z)) {
                if (i7 != 0) {
                    qim0Var3 = nim0.a;
                } else {
                    qim0Var3 = qim0Var2;
                }
                if (i5 != 0) {
                    objT = b0kVar3.T();
                    if (objT == fkj0.X) {
                        objT = cgh.S0;
                        b0kVar3.s0(objT);
                    }
                    iu30Var4 = (iu30) objT;
                } else {
                    iu30Var4 = iu30Var2;
                }
                uwr uwrVar4 = cbx.a;
                b0kVar2 = b0kVar3;
                uwo1.e(str, anm1.N("comment_text", qim0Var3), cbx.d(b0kVar3).j, cbx.a(b0kVar3).b.a, (a0e1) null, iu30Var4, 2, false, new cjc0(i), 0, (qx8) null, b0kVar2, (i4 & 14) | ((i4 << 6) & 458752), 0, 1680);
                iu30Var3 = iu30Var4;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var3 = qim0Var2;
                iu30Var3 = iu30Var2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new kih(this, str, i, qim0Var3, iu30Var3, i2, i3);
            }
        }

        /* JADX WARN: Code duplicated, block: B:101:0x0161  */
        /* JADX WARN: Code duplicated, block: B:102:0x0163  */
        /* JADX WARN: Code duplicated, block: B:104:0x01b1  */
        /* JADX WARN: Code duplicated, block: B:109:0x01ce A[LOOP:2: B:107:0x01c8->B:109:0x01ce, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:113:0x01eb  */
        /* JADX WARN: Code duplicated, block: B:118:0x0201  */
        /* JADX WARN: Code duplicated, block: B:126:0x0231  */
        /* JADX WARN: Code duplicated, block: B:127:0x0233  */
        /* JADX WARN: Code duplicated, block: B:131:0x0243 A[LOOP:4: B:129:0x023d->B:131:0x0243, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:133:0x02d1  */
        /* JADX WARN: Code duplicated, block: B:136:0x02de  */
        /* JADX WARN: Code duplicated, block: B:140:0x013e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:143:0x01b4 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:146:0x01fd A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:147:0x01f5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:148:0x0215 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:149:0x0211 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:150:0x020d A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:156:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:60:0x00a4  */
        /* JADX WARN: Code duplicated, block: B:61:0x00ab  */
        /* JADX WARN: Code duplicated, block: B:63:0x00b3  */
        /* JADX WARN: Code duplicated, block: B:65:0x00b9  */
        /* JADX WARN: Code duplicated, block: B:66:0x00bc  */
        /* JADX WARN: Code duplicated, block: B:70:0x00c6  */
        /* JADX WARN: Code duplicated, block: B:72:0x00cc  */
        /* JADX WARN: Code duplicated, block: B:73:0x00cf  */
        /* JADX WARN: Code duplicated, block: B:77:0x00e3  */
        /* JADX WARN: Code duplicated, block: B:78:0x00e5  */
        /* JADX WARN: Code duplicated, block: B:81:0x00ee A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:82:0x00f0  */
        /* JADX WARN: Code duplicated, block: B:84:0x00f5  */
        /* JADX WARN: Code duplicated, block: B:86:0x00fd  */
        /* JADX WARN: Code duplicated, block: B:88:0x0107  */
        /* JADX WARN: Code duplicated, block: B:92:0x0133  */
        /* JADX WARN: Code duplicated, block: B:94:0x013b  */
        /* JADX WARN: Code duplicated, block: B:99:0x014f  */
        public final void f(int i, String str, boolean z, int i2, uwe1 uwe1Var, iu30 iu30Var, qim0 qim0Var, iu30 iu30Var2, b0k b0kVar, int i3, int i4) {
            qim0 qim0Var2;
            int i5;
            iu30 iu30Var3;
            char c;
            int i6;
            int i7;
            boolean z2;
            b0k b0kVar2;
            iu30 iu30Var4;
            qim0 qim0Var3;
            h311 h311VarV;
            iu30 iu30Var5;
            ArrayList arrayListB;
            yae1 yae1VarQ;
            wat watVar;
            ArrayList<ewe1> arrayList;
            ArrayList<whg> arrayList2;
            boolean z3;
            HashSet hashSet;
            Iterator it;
            ye5 ye5Var;
            int iS;
            int i8;
            LinkedHashMap linkedHashMap;
            String str2;
            String str3;
            dw21 dw21VarA;
            whg whgVar;
            Object objT;
            int i9;
            b0k b0kVar3 = (x340) b0kVar;
            b0kVar3.k0(1872617030);
            int i10 = (i3 & 6) == 0 ? (b0kVar3.e(i) ? 4 : 2) | i3 : i3;
            if ((i3 & 48) == 0) {
                i10 |= b0kVar3.g(str) ? 32 : 16;
            }
            if ((i3 & 384) == 0) {
                i10 |= b0kVar3.h(z) ? 256 : 128;
            }
            if ((i3 & 3072) == 0) {
                i10 |= b0kVar3.e(i2) ? 2048 : 1024;
            }
            if ((i3 & 24576) == 0) {
                i10 |= b0kVar3.i(uwe1Var) ? 16384 : 8192;
            }
            if ((196608 & i3) == 0) {
                i10 |= b0kVar3.i(iu30Var) ? 131072 : 65536;
            }
            int i11 = i4 & 64;
            if (i11 == 0) {
                if ((1572864 & i3) == 0) {
                    qim0Var2 = qim0Var;
                    i10 |= b0kVar3.i(qim0Var2) ? 1048576 : 524288;
                }
                i5 = i4 & 128;
                if (i5 != 0) {
                    i10 |= 12582912;
                    iu30Var3 = iu30Var2;
                    c = ' ';
                } else {
                    iu30Var3 = iu30Var2;
                    c = ' ';
                    if ((i3 & 12582912) == 0) {
                        if (b0kVar3.i(iu30Var3)) {
                            i6 = 8388608;
                        } else {
                            i6 = 4194304;
                        }
                        i10 |= i6;
                    }
                }
                if ((i3 & 100663296) == 0) {
                    if (b0kVar3.i(this)) {
                        i9 = 67108864;
                    } else {
                        i9 = 33554432;
                    }
                    i10 |= i9;
                }
                i7 = i10;
                if ((i7 & 38347923) != 38347922) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (b0kVar3.Y(i7 & 1, z2)) {
                    if (i11 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if (i5 != 0) {
                        objT = b0kVar3.T();
                        if (objT == fkj0.X) {
                            objT = cgh.T0;
                            b0kVar3.s0(objT);
                        }
                        iu30Var5 = (iu30) objT;
                    } else {
                        iu30Var5 = iu30Var3;
                    }
                    this.b.getClass();
                    arrayListB = hwe1.b(i2, str);
                    yae1VarQ = d5p1.q(0, b0kVar3, 1);
                    watVar = (wat) b0kVar3.k(t4k.h);
                    b0kVar3.i0(-6310280);
                    arrayList = new ArrayList();
                    for (Object obj : arrayListB) {
                        if (obj instanceof ewe1) {
                            arrayList.add(obj);
                        }
                    }
                    arrayList2 = new ArrayList();
                    for (ewe1 ewe1Var : arrayList) {
                        dw21VarA = uwe1Var.a(ewe1Var.c);
                        ArrayList arrayList3 = arrayListB;
                        if (dw21VarA instanceof dw21) {
                            String str4 = ewe1Var.b;
                            uwr uwrVar = cbx.a;
                            long j = yae1.a(yae1VarQ, str4, cbx.d(b0kVar3).j, 0, false, 0, 0L, (flb0) null, (xat) null, 1020).c;
                            whgVar = new whg(ewe1Var, dw21VarA.a, new d6t0(4, watVar.L((int) (j >> c)), watVar.L((int) (j & 4294967295L))));
                        } else {
                            whgVar = null;
                        }
                        if (whgVar != null) {
                            arrayList2.add(whgVar);
                        }
                        arrayListB = arrayList3;
                    }
                    ArrayList<ewe1> arrayList4 = arrayListB;
                    z3 = false;
                    b0kVar3.r(false);
                    hashSet = new HashSet();
                    it = arrayList2.iterator();
                    while (it.hasNext()) {
                        hashSet.add(((whg) it.next()).a.a);
                    }
                    ye5Var = new ye5();
                    for (ewe1 ewe1Var2 : arrayList4) {
                        if (ewe1Var2 instanceof dwe1) {
                            ye5Var.g(((dwe1) ewe1Var2).a);
                        } else {
                            if (ewe1Var2 instanceof ewe1) {
                                eg.o();
                                return;
                            }
                            ewe1 ewe1Var3 = ewe1Var2;
                            str2 = ewe1Var3.b;
                            str3 = ewe1Var3.a;
                            if (hashSet.contains(str3)) {
                                z6p1.r(ye5Var, str3, str2);
                            } else {
                                ye5Var.g(str2);
                            }
                        }
                    }
                    af5 af5VarP = ye5Var.p();
                    b0kVar3.i0(-6264598);
                    iS = zno1.s(q7h.U(arrayList2, 10));
                    if (iS < 16) {
                        i8 = 16;
                    } else {
                        i8 = iS;
                    }
                    linkedHashMap = new LinkedHashMap(i8);
                    for (whg whgVar2 : arrayList2) {
                        ewe1 ewe1Var4 = whgVar2.a;
                        LinkedHashMap linkedHashMap2 = linkedHashMap;
                        linkedHashMap2.put(ewe1Var4.a, new gh80(whgVar2.c, apo.r(-846519120, new hh1(this, ewe1Var4, iu30Var, z, whgVar2.b, (byte) 2), b0kVar3)));
                        linkedHashMap = linkedHashMap2;
                        z3 = z3;
                    }
                    b0kVar3.r(z3);
                    cqs0 cqs0VarB = mqo1.B(linkedHashMap);
                    uwr uwrVar2 = cbx.a;
                    b0kVar2 = b0kVar3;
                    uwo1.d(af5VarP, cbx.a(b0kVar3).b.a, anm1.N("comment_text", qim0Var2), cbx.d(b0kVar3).j, (a0e1) null, iu30Var5, 2, false, new cjc0(i), 0, (qx8) null, cqs0VarB, b0kVar2, (i7 >> 6) & 458752, 0, 1680);
                    qim0Var3 = qim0Var2;
                    iu30Var4 = iu30Var5;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    iu30Var4 = iu30Var3;
                    qim0Var3 = qim0Var2;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new lih(this, i, str, z, i2, uwe1Var, iu30Var, qim0Var3, iu30Var4, i3, i4);
                }
            }
            i10 |= 1572864;
            qim0Var2 = qim0Var;
            i5 = i4 & 128;
            if (i5 != 0) {
                i10 |= 12582912;
                iu30Var3 = iu30Var2;
                c = ' ';
            } else {
                iu30Var3 = iu30Var2;
                c = ' ';
                if ((i3 & 12582912) == 0) {
                    if (b0kVar3.i(iu30Var3)) {
                        i6 = 8388608;
                    } else {
                        i6 = 4194304;
                    }
                    i10 |= i6;
                }
            }
            if ((i3 & 100663296) == 0) {
                if (b0kVar3.i(this)) {
                    i9 = 67108864;
                } else {
                    i9 = 33554432;
                }
                i10 |= i9;
            }
            i7 = i10;
            if ((i7 & 38347923) != 38347922) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (b0kVar3.Y(i7 & 1, z2)) {
                if (i11 != 0) {
                    qim0Var2 = nim0.a;
                }
                if (i5 != 0) {
                    objT = b0kVar3.T();
                    if (objT == fkj0.X) {
                        objT = cgh.T0;
                        b0kVar3.s0(objT);
                    }
                    iu30Var5 = (iu30) objT;
                } else {
                    iu30Var5 = iu30Var3;
                }
                this.b.getClass();
                arrayListB = hwe1.b(i2, str);
                yae1VarQ = d5p1.q(0, b0kVar3, 1);
                watVar = (wat) b0kVar3.k(t4k.h);
                b0kVar3.i0(-6310280);
                arrayList = new ArrayList();
                while (r4.hasNext()) {
                    if (obj instanceof ewe1) {
                        arrayList.add(obj);
                    }
                }
                arrayList2 = new ArrayList();
                while (r3.hasNext()) {
                    dw21VarA = uwe1Var.a(ewe1Var.c);
                    ArrayList arrayList5 = arrayListB;
                    if (dw21VarA instanceof dw21) {
                        whgVar = null;
                    } else {
                        String str5 = ewe1Var.b;
                        uwr uwrVar3 = cbx.a;
                        long j2 = yae1.a(yae1VarQ, str5, cbx.d(b0kVar3).j, 0, false, 0, 0L, (flb0) null, (xat) null, 1020).c;
                        whgVar = new whg(ewe1Var, dw21VarA.a, new d6t0(4, watVar.L((int) (j2 >> c)), watVar.L((int) (j2 & 4294967295L))));
                    }
                    if (whgVar != null) {
                        arrayList2.add(whgVar);
                    }
                    arrayListB = arrayList5;
                }
                ArrayList<ewe1> arrayList6 = arrayListB;
                z3 = false;
                b0kVar3.r(false);
                hashSet = new HashSet();
                it = arrayList2.iterator();
                while (it.hasNext()) {
                    hashSet.add(((whg) it.next()).a.a);
                }
                ye5Var = new ye5();
                while (r3.hasNext()) {
                    if (ewe1Var2 instanceof dwe1) {
                        ye5Var.g(((dwe1) ewe1Var2).a);
                    } else {
                        if (ewe1Var2 instanceof ewe1) {
                            eg.o();
                            return;
                        }
                        ewe1 ewe1Var5 = ewe1Var2;
                        str2 = ewe1Var5.b;
                        str3 = ewe1Var5.a;
                        if (hashSet.contains(str3)) {
                            z6p1.r(ye5Var, str3, str2);
                        } else {
                            ye5Var.g(str2);
                        }
                    }
                }
                af5 af5VarP2 = ye5Var.p();
                b0kVar3.i0(-6264598);
                iS = zno1.s(q7h.U(arrayList2, 10));
                if (iS < 16) {
                    i8 = 16;
                } else {
                    i8 = iS;
                }
                linkedHashMap = new LinkedHashMap(i8);
                while (r17.hasNext()) {
                    ewe1 ewe1Var6 = whgVar2.a;
                    LinkedHashMap linkedHashMap3 = linkedHashMap;
                    linkedHashMap3.put(ewe1Var6.a, new gh80(whgVar2.c, apo.r(-846519120, new hh1(this, ewe1Var6, iu30Var, z, whgVar2.b, (byte) 2), b0kVar3)));
                    linkedHashMap = linkedHashMap3;
                    z3 = z3;
                }
                b0kVar3.r(z3);
                cqs0 cqs0VarB2 = mqo1.B(linkedHashMap);
                uwr uwrVar4 = cbx.a;
                b0kVar2 = b0kVar3;
                uwo1.d(af5VarP2, cbx.a(b0kVar3).b.a, anm1.N("comment_text", qim0Var2), cbx.d(b0kVar3).j, (a0e1) null, iu30Var5, 2, false, new cjc0(i), 0, (qx8) null, cqs0VarB2, b0kVar2, (i7 >> 6) & 458752, 0, 1680);
                qim0Var3 = qim0Var2;
                iu30Var4 = iu30Var5;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                iu30Var4 = iu30Var3;
                qim0Var3 = qim0Var2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new lih(this, i, str, z, i2, uwe1Var, iu30Var, qim0Var3, iu30Var4, i3, i4);
            }
        }

        public final void g(fih fihVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(528682773);
            int i2 = i | (x340Var.i(fihVar) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
            if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                qim0 qim0VarN = anm1.N("comment_context_menu", qim0Var);
                gdx gdxVarS = yla.s(x340Var);
                ldx ldxVar = ldx.c;
                boolean zI = x340Var.i(fihVar) | ((i2 & 112) == 32);
                Object objT = x340Var.T();
                if (zI || objT == fkj0.X) {
                    objT = new hih(iu30Var, fihVar, (byte) 1);
                    x340Var.s0(objT);
                }
                wro1.h(new gbx(z50.c, (Function0) objT), ldxVar, qim0VarN, (max) null, gdxVarS, (vzq0) null, false, (idn0) null, (ga80) null, odi.b, x340Var, 0, 6, 984);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new mih(this, fihVar, iu30Var, qim0Var, i, (byte) 0);
            }
        }

        public final void h(int i, String str, String str2, b0k b0kVar, qim0 qim0Var) {
            String str3;
            int i2;
            qim0 qim0Var2;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-1776377920);
            if ((i & 6) == 0) {
                str3 = str;
                i2 = (x340Var.g(str3) ? 4 : 2) | i;
            } else {
                str3 = str;
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= x340Var.g(str2) ? 32 : 16;
            }
            int i3 = i2 | 384;
            if ((i & 3072) == 0) {
                i3 |= x340Var.i(this) ? 2048 : 1024;
            }
            if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
                gfh0 gfh0VarC = t1c.c(een.d, false);
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
                nko1.H(gfh0VarC, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                long jS = ((wat) x340Var.k(t4k.h)).s(dsa0.m(x340Var, 2131165604));
                Object objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = new TextUnit(jS);
                    x340Var.s0(objT);
                }
                long j = ((TextUnit) objT).a;
                int i4 = i3;
                Uri uri = Uri.parse(str3);
                p3v p3vVar = new p3v(dsa0.m(x340Var, 2131165602));
                mrx mrxVar = mrx.c;
                eso1.e(uri, isl.a, (qim0) null, p3vVar, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, new nux(mrxVar, mrxVar), false, false, x340Var, 1073741872, 0, 3572);
                qim0 qim0VarX = lrn1.x(uyn1.B(qim0Var3, dsa0.m(x340Var, 2131165603), dsa0.m(x340Var, 2131165603), 0.0f, 0.0f, 12), 1.0f);
                uwr uwrVar = cbx.a;
                uwo1.e(str2, qim0VarX, lee1.a(cbx.d(x340Var).m, 0L, j, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777213), 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, (i4 >> 3) & 14, 0, 2040);
                x340Var.r(true);
                qim0Var2 = qim0Var3;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new vqa(i, this, str, str2, qim0Var2, (byte) 27);
            }
        }

        /* JADX WARN: Code duplicated, block: B:58:0x014f  */
        /* JADX WARN: Code duplicated, block: B:59:0x01ad  */
        /* JADX WARN: Code duplicated, block: B:62:0x021a  */
        /* JADX WARN: Code duplicated, block: B:64:0x0265  */
        /* JADX WARN: Code duplicated, block: B:65:0x026b  */
        /* JADX WARN: Code duplicated, block: B:67:0x02d6  */
        /* JADX WARN: Code duplicated, block: B:72:0x0335  */
        /* JADX WARN: Code duplicated, block: B:78:0x0369 A[Catch: all -> 0x0381, TryCatch #0 {all -> 0x0381, blocks: (B:76:0x0365, B:78:0x0369, B:85:0x0397, B:86:0x03b7, B:81:0x0384), top: B:106:0x0365 }] */
        /* JADX WARN: Code duplicated, block: B:81:0x0384 A[Catch: all -> 0x0381, TRY_LEAVE, TryCatch #0 {all -> 0x0381, blocks: (B:76:0x0365, B:78:0x0369, B:85:0x0397, B:86:0x03b7, B:81:0x0384), top: B:106:0x0365 }] */
        /* JADX WARN: Code duplicated, block: B:84:0x0394  */
        /* JADX WARN: Code duplicated, block: B:86:0x03b7 A[Catch: all -> 0x0381, TRY_LEAVE, TryCatch #0 {all -> 0x0381, blocks: (B:76:0x0365, B:78:0x0369, B:85:0x0397, B:86:0x03b7, B:81:0x0384), top: B:106:0x0365 }] */
        /* JADX WARN: Code duplicated, block: B:89:0x03cf  */
        /* JADX WARN: Code duplicated, block: B:91:0x041c  */
        /* JADX WARN: Code duplicated, block: B:94:0x0442  */
        /* JADX WARN: Code duplicated, block: B:95:0x0445  */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r2v4 */
        public final void i(fih fihVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
            xhh xhhVar;
            boolean z;
            isl islVar;
            llj lljVar;
            long j;
            c36 c36Var;
            float f;
            ?? r2;
            b0k b0kVar2;
            qim0 qim0Var2;
            boolean z2;
            long j2;
            boolean zF;
            Object objT;
            String str;
            ye5 ye5Var;
            int iO;
            cqs0 cqs0VarT;
            String str2;
            Object obj = fkj0.X;
            b0k b0kVar3 = (x340) b0kVar;
            b0kVar3.k0(-490087717);
            j06 j06Var = ((x340) b0kVar3).a;
            int i2 = i | (b0kVar3.i(fihVar) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16) | (b0kVar3.i(qim0Var) ? 256 : 128) | (b0kVar3.i(this) ? 2048 : 1024);
            if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
                jtr jtrVar = jtr.f;
                boolean zI = ((i2 & 112) == 32) | b0kVar3.i(fihVar);
                Object objT2 = b0kVar3.T();
                if (zI || objT2 == obj) {
                    objT2 = new hih(iu30Var, fihVar, (byte) 2);
                    b0kVar3.s0(objT2);
                }
                qim0 qim0VarV = bin.v(qim0Var, (idn0) null, jtrVar, false, (String) null, (pm31) null, (Function0) objT2, 28);
                mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar3, 0);
                int iHashCode = Long.hashCode(((x340) b0kVar3).T);
                xos0 xos0VarM = b0kVar3.m();
                qim0 qim0VarE = zr7.E(b0kVar3, qim0VarV);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                b0kVar3.m0();
                boolean z3 = ((x340) b0kVar3).S;
                n4k n4kVar = hmb0.t1;
                if (z3) {
                    b0kVar3.l(n4kVar);
                } else {
                    b0kVar3.v0();
                }
                llj lljVar2 = y580.O0;
                nko1.H(mbhVarA, b0kVar3, lljVar2);
                llj lljVar3 = y580.N0;
                nko1.H(xos0VarM, b0kVar3, lljVar3);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar4 = y580.R0;
                nko1.H(numValueOf, b0kVar3, lljVar4);
                nko1.F(b0kVar3);
                llj lljVar5 = y580.Y;
                nko1.H(qim0VarE, b0kVar3, lljVar5);
                fra fraVar = een.N0;
                c36 c36Var2 = h36.a;
                jw31 jw31VarA = ew31.a(c36Var2, fraVar, b0kVar3, 0);
                int iHashCode2 = Long.hashCode(((x340) b0kVar3).T);
                xos0 xos0VarM2 = b0kVar3.m();
                qim0 qim0Var3 = nim0.a;
                qim0 qim0VarE2 = zr7.E(b0kVar3, qim0Var3);
                b0kVar3.m0();
                if (((x340) b0kVar3).S) {
                    b0kVar3.l(n4kVar);
                } else {
                    b0kVar3.v0();
                }
                nko1.H(jw31VarA, b0kVar3, lljVar2);
                nko1.H(xos0VarM2, b0kVar3, lljVar3);
                x0d.q(iHashCode2, b0kVar3, lljVar4, b0kVar3);
                nko1.H(qim0VarE2, b0kVar3, lljVar5);
                xhh xhhVar2 = fihVar.a;
                long j3 = fihVar.i;
                boolean z4 = fihVar.h;
                boolean zG = b0kVar3.g(xhhVar2);
                Object objT3 = b0kVar3.T();
                if (zG || objT3 == obj) {
                    objT3 = Boolean.valueOf(xhhVar2 instanceof vhh);
                    b0kVar3.s0(objT3);
                }
                boolean zBooleanValue = ((Boolean) objT3).booleanValue();
                whh whhVar = xhhVar2 instanceof whh ? (whh) xhhVar2 : null;
                try {
                    if (whhVar != null) {
                        xhhVar = xhhVar2;
                        z = whhVar.d;
                        islVar = isl.a;
                        if (zBooleanValue) {
                            b0kVar3.i0(-1311448553);
                            lrx lrxVar = lrx.c;
                            uwr uwrVar = cbx.a;
                            long j4 = cbx.a(b0kVar3).b.b;
                            zov0 zov0Var = cbx.b(b0kVar3).g;
                            c36Var = c36Var2;
                            j = j3;
                            f = 4.0f;
                            r2 = 0;
                            lljVar = lljVar4;
                            b0kVar3 = b0kVar3;
                            w0h1.a(lrxVar, islVar, u291.m(qim0Var3, 12.0f), j4, 0L, false, b0kVar3, lrx.d | 48, 48);
                            op71.g(b0kVar3, u291.p(qim0Var3, 4.0f));
                            b0kVar3.r(false);
                        } else {
                            lljVar = lljVar4;
                            j = j3;
                            c36Var = c36Var2;
                            f = 4.0f;
                            r2 = 0;
                            b0kVar3.i0(-1311100671);
                            b0kVar3.r(false);
                        }
                        String name = xhhVar.getName();
                        cjc0 cjc0Var = new cjc0(1);
                        uwr uwrVar2 = cbx.a;
                        b0k b0kVar4 = b0kVar3;
                        uwo1.e(name, anm1.N("comment_name", new wnb0(1.0f, (boolean) r2)), cbx.d(b0kVar3).k, cbx.a(b0kVar3).b.a, (a0e1) null, (iu30) null, 2, false, cjc0Var, 0, (qx8) null, b0kVar4, 0, 0, 1712);
                        b0kVar2 = b0kVar4;
                        if (z) {
                            b0kVar2.i0(-1310699717);
                            long j5 = ((wex) ((gmt) zex.a.c).c).h;
                            cvx cvxVar = cbx.b(b0kVar2).b;
                            qim0 qim0VarN = anm1.N("comment_membership_badge", uyn1.B(qim0Var3, 8.0f, 0.0f, 0.0f, 0.0f, 14));
                            jw31 jw31VarA2 = ew31.a(c36Var, fraVar, b0kVar2, (int) r2);
                            int iHashCode3 = Long.hashCode(((x340) b0kVar2).T);
                            xos0 xos0VarM3 = b0kVar2.m();
                            qim0 qim0VarE3 = zr7.E(b0kVar2, qim0VarN);
                            b0kVar2.m0();
                            if (((x340) b0kVar2).S) {
                                b0kVar2.l(n4kVar);
                            } else {
                                b0kVar2.v0();
                            }
                            nko1.H(jw31VarA2, b0kVar2, lljVar2);
                            nko1.H(xos0VarM3, b0kVar2, lljVar3);
                            x0d.q(iHashCode3, b0kVar2, lljVar, b0kVar2);
                            nko1.H(qim0VarE3, b0kVar2, lljVar5);
                            zsx zsxVar = zsx.c;
                            zov0 zov0Var2 = cbx.b(b0kVar2).g;
                            qim0Var2 = qim0Var3;
                            w0h1.a(zsxVar, islVar, u291.m(qim0Var3, 16.0f), j5, j5, true, b0kVar2, zsx.d | 196656, 0);
                            cvx cvxVar2 = cbx.b(b0kVar2).b;
                            op71.g(b0kVar2, u291.p(qim0Var2, f));
                            uwo1.e(cwl1.o0(b0kVar2, 2131954067), (qim0) null, cbx.d(b0kVar2).k, j5, (a0e1) null, (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, b0kVar2, 0, 0, 1778);
                            b0kVar2 = b0kVar2;
                            z2 = true;
                            b0kVar2.r(true);
                            b0kVar2.r((boolean) r2);
                        } else {
                            qim0Var2 = qim0Var3;
                            z2 = true;
                            b0kVar2.i0(-1309709887);
                            b0kVar2.r((boolean) r2);
                        }
                        b0kVar2.r(z2);
                        lee1 lee1VarA = lee1.a(cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777214);
                        j2 = j;
                        zF = b0kVar2.f(j2);
                        objT = b0kVar2.T();
                        if (zF || objT == obj) {
                            objT = this.c.a(j2, this.a.b());
                            b0kVar2.s0(objT);
                        }
                        str = (String) objT;
                        b0kVar2.i0(816415658);
                        ye5Var = new ye5();
                        b0kVar2.i0(816416611);
                        iO = ye5Var.o(lee1VarA.a);
                        if (fihVar.g) {
                            b0kVar2.i0(862836137);
                            ye5Var.g(cwl1.n0(2131954142, new Object[]{str}, b0kVar2));
                            b0kVar2.r((boolean) r2);
                        } else {
                            b0kVar2.i0(862944389);
                            b0kVar2.r((boolean) r2);
                            ye5Var.g(str);
                        }
                        if (
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r16v1 ??
                            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                            */
                        /*
                            Method dump skipped, instruction units count: 1179
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: p.oih.i(p.fih, p.iu30, p.qim0, p.b0k, int):void");
                    }

                    public final void j(fih fihVar, xpw xpwVar, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
                        boolean z;
                        h290 h290VarO;
                        x340 x340Var = (x340) b0kVar;
                        x340Var.k0(-234266118);
                        int i2 = (i & 6) == 0 ? (x340Var.i(fihVar) ? 4 : 2) | i : i;
                        if ((i & 48) == 0) {
                            i2 |= x340Var.i(xpwVar) ? 32 : 16;
                        }
                        if ((i & 384) == 0) {
                            i2 |= x340Var.i(qim0Var) ? 256 : 128;
                        }
                        if ((i & 3072) == 0) {
                            i2 |= x340Var.i(iu30Var) ? 2048 : 1024;
                        }
                        if ((i & 24576) == 0) {
                            i2 |= x340Var.i(this) ? 16384 : 8192;
                        }
                        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
                            int i3 = i2 >> 6;
                            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
                            int iHashCode = Long.hashCode(x340Var.T);
                            xos0 xos0VarM = x340Var.m();
                            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
                            hzj.A.getClass();
                            ReactionListDisplay reactionListDisplay = null;
                            Object obj = null;
                            reactionListDisplay = null;
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
                            ReactionsRow reactionsRow = fihVar.l;
                            if (reactionsRow != null) {
                                x340Var.i0(2043834078);
                                z = false;
                                otw.c(xpwVar, new z301(fihVar.d, mqo1.A(reactionsRow.q()), reactionsRow.p(), reactionsRow.r(), fihVar.j, fihVar.e, fihVar.c, 128), (qim0) null, (ipb1) null, x340Var, (i2 >> 3) & 14, 12);
                                x340Var.r(false);
                            } else {
                                z = false;
                                x340Var.i0(2044362628);
                                x340Var.r(false);
                            }
                            if (fihVar.m) {
                                x340Var.i0(2044399301);
                                k(fihVar, iu30Var, x340Var, (i3 & 896) | (i2 & 14) | (i3 & 112));
                                x340Var.r(z);
                            } else {
                                x340Var.i0(2044459844);
                                x340Var.r(z);
                            }
                            kk0.s(1.0f, true, x340Var);
                            if (reactionsRow != null && (h290VarO = reactionsRow.o()) != null) {
                                for (Object obj2 : h290VarO) {
                                    if (((ReactionListDisplay) obj2).n() == 2) {
                                        obj = obj2;
                                        break;
                                    }
                                }
                                reactionListDisplay = (ReactionListDisplay) obj;
                            }
                            if (reactionListDisplay == null) {
                                x340Var.i0(2044764201);
                                x340Var.r(z);
                            } else {
                                x340Var.i0(2044764202);
                                h((i2 >> 3) & 7168, reactionListDisplay.q().o(), reactionListDisplay.p(), x340Var, null);
                                x340Var.r(z);
                            }
                            x340Var.r(true);
                        } else {
                            x340Var.b0();
                        }
                        h311 h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new hy0(this, fihVar, xpwVar, qim0Var, iu30Var, i, (byte) 21);
                        }
                    }

                    public final void k(fih fihVar, iu30 iu30Var, b0k b0kVar, int i) {
                        int i2;
                        x340 x340Var = (x340) b0kVar;
                        x340Var.k0(-606890340);
                        if ((i & 6) == 0) {
                            i2 = i | (x340Var.i(fihVar) ? 4 : 2);
                        } else {
                            i2 = i;
                        }
                        if ((i & 48) == 0) {
                            i2 |= x340Var.i(iu30Var) ? 32 : 16;
                        }
                        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
                            gdx gdxVarS = yla.s(x340Var);
                            ldx ldxVar = ldx.c;
                            String strO0 = cwl1.o0(x340Var, 2131954091);
                            boolean zI = x340Var.i(fihVar) | ((i2 & 112) == 32);
                            Object objT = x340Var.T();
                            if (zI || objT == fkj0.X) {
                                objT = new hih(iu30Var, fihVar, (byte) 3);
                                x340Var.s0(objT);
                            }
                            Function0 function0 = (Function0) objT;
                            if (ihc1.y0(strO0)) {
                                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                                return;
                            }
                            gbx gbxVar = new gbx(new y50(strO0), function0);
                            uwr uwrVar = cbx.a;
                            cvx cvxVar = cbx.b(x340Var).b;
                            foo1.c(gbxVar, ldxVar, anm1.N("comment_reply_button", uyn1.B(nim0.a, 2.0f, 0.0f, 0.0f, 0.0f, 14)), (max) null, gdxVarS, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, odi.c, x340Var, 0, 48, 2008);
                        } else {
                            x340Var.b0();
                        }
                        h311 h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new p1b(this, fihVar, iu30Var, i, (byte) 26);
                        }
                    }

                    public final void l(ewe1 ewe1Var, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
                        x340 x340Var;
                        qim0 qim0Var2;
                        boolean z;
                        ven0 ven0Var;
                        m4c m4cVar = fkj0.X;
                        x340 x340Var2 = (x340) b0kVar;
                        x340Var2.k0(-749033245);
                        int i2 = i | (x340Var2.i(ewe1Var) ? 4 : 2) | (x340Var2.i(function0) ? 32 : 16) | (x340Var2.i(function1) ? 256 : 128) | 3072;
                        if (x340Var2.Y(i2 & 1, (i2 & 1171) != 1170)) {
                            boolean zG = x340Var2.g(ewe1Var);
                            Object objT = x340Var2.T();
                            if (zG || objT == m4cVar) {
                                objT = v8r.q(Boolean.FALSE);
                                x340Var2.s0(objT);
                            }
                            ven0 ven0Var2 = (ven0) objT;
                            boolean zG2 = x340Var2.g(ewe1Var);
                            Object objT2 = x340Var2.T();
                            if (zG2 || objT2 == m4cVar) {
                                objT2 = v8r.q(Boolean.FALSE);
                                x340Var2.s0(objT2);
                            }
                            ven0 ven0Var3 = (ven0) objT2;
                            kiv kivVar = AndroidCompositionLocals_androidKt.b;
                            int i3 = ((Context) x340Var2.k(kivVar)).getResources().getDisplayMetrics().heightPixels;
                            int i4 = ((Context) x340Var2.k(kivVar)).getResources().getDisplayMetrics().widthPixels;
                            WeakHashMap weakHashMap = osl1.x;
                            u85 u85Var = lhc.g(x340Var2).g;
                            int i5 = u85Var.e().b;
                            int i6 = u85Var.e().d;
                            x340Var2.i0(1733580371);
                            qim0 qim0Var3 = nim0.a;
                            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
                            if (((Boolean) ven0Var2.getValue()).booleanValue()) {
                                z = false;
                                x340Var2.i0(175824005);
                                x340Var2.r(false);
                            } else {
                                x340Var2.i0(174657134);
                                boolean zI = x340Var2.i(ven0Var2) | x340Var2.i(ven0Var3) | x340Var2.e(i5) | x340Var2.e(i4) | x340Var2.e(i3) | x340Var2.e(i6);
                                Object objT3 = x340Var2.T();
                                if (zI || objT3 == m4cVar) {
                                    k8h0 k8h0Var = new k8h0(i5, i4, i3, i6, ven0Var2, ven0Var3);
                                    ven0Var = ven0Var3;
                                    x340Var2.s0(k8h0Var);
                                    objT3 = k8h0Var;
                                } else {
                                    ven0Var = ven0Var3;
                                }
                                qim0 qim0VarX = ern1.x(qim0VarD, (iu30) objT3);
                                boolean zI2 = x340Var2.i(ven0Var) | x340Var2.i(ven0Var2) | ((i2 & 112) == 32);
                                Object objT4 = x340Var2.T();
                                if (zI2 || objT4 == m4cVar) {
                                    z = false;
                                    objT4 = new nih(function0, ven0Var, ven0Var2, (byte) 0);
                                    x340Var2.s0(objT4);
                                } else {
                                    z = false;
                                }
                                qim0VarD = exd0.s(qim0VarX, (iu30) objT4);
                                x340Var2.r(z);
                            }
                            qim0 qim0Var4 = qim0VarD;
                            x340Var2.r(z);
                            jtr jtrVar = jtr.f;
                            boolean z2 = (i2 & 896) == 256;
                            Object objT5 = x340Var2.T();
                            if (z2 || objT5 == m4cVar) {
                                objT5 = new ukf(function1, (byte) 21);
                                x340Var2.s0(objT5);
                            }
                            qim0 qim0VarV = bin.v(qim0Var4, (idn0) null, jtrVar, false, (String) null, (pm31) null, (Function0) objT5, 28);
                            gfh0 gfh0VarC = t1c.c(een.h, false);
                            int iHashCode = Long.hashCode(x340Var2.T);
                            xos0 xos0VarM = x340Var2.m();
                            qim0 qim0VarE = zr7.E(x340Var2, qim0VarV);
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
                            nko1.H(qim0VarE, x340Var2, y580.Y);
                            String str = ewe1Var.b;
                            uwr uwrVar = cbx.a;
                            lee1 lee1VarA = lee1.a(cbx.d(x340Var2).j, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, TextDecoration.c, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16773119);
                            long j = cbx.a(x340Var2).b.c;
                            qim0Var2 = qim0Var3;
                            uwo1.e(str, (qim0) null, lee1VarA, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2034);
                            x340Var = x340Var2;
                            x340Var.r(true);
                        } else {
                            x340Var = x340Var2;
                            x340Var.b0();
                            qim0Var2 = qim0Var;
                        }
                        h311 h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new m(this, ewe1Var, function0, function1, qim0Var2, i);
                        }
                    }
                }
