package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.highlightsstats.EntityImage;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class foo1 {
    public static final jsg a = new jsg(0.0f, 100.0f);
    public static b180 b;

    public static Integer A(String str) {
        Integer m231Var;
        try {
            m231Var = Integer.valueOf(Color.parseColor(str));
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (m231Var instanceof m231) {
            m231Var = null;
        }
        return m231Var;
    }

    public static rzq B(r2r r2rVar, t701 t701Var, six0 six0Var, n6r0 n6r0Var, iac0 iac0Var, csy csyVar) {
        j3r j3rVar = rzq.y;
        rzq rzqVarF = l2p1.f(r2rVar.a("android-nowplaying-kodiak", new ntf0(t701Var, csyVar, six0Var, n6r0Var, (byte) 18)));
        iac0Var.getLifecycle().a(new lt1(rzqVarF, (byte) 5));
        return rzqVarF;
    }

    public static final c9n C(c9n c9nVar, Function0 function0) {
        return smo1.u(c9nVar) ? c9nVar : smo1.e((o8n) function0.invoke());
    }

    public static final z3i1 D(a4i1 a4i1Var, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        boolean zG = x340Var.g(a4i1Var);
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            objT = new z3i1(a4i1Var);
            x340Var.s0(objT);
        }
        return (z3i1) objT;
    }

    public static final ArrayList E(Map map) {
        String str = (String) map.get("session_control.selected_signals");
        if (str == null) {
            str = "";
        }
        List listQ0 = ihc1.Q0(str, new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listQ0) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static void F(Context context, TextView textView, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        textView.setTextAppearance(resourceId);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002f A[PHI: r5
      0x002f: PHI (r5v1 int) = (r5v0 int), (r5v2 int) binds: [B:9:0x0022, B:13:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0031 A[PHI: r3
      0x0031: PHI (r3v3 int) = (r3v2 int), (r3v4 int) binds: [B:7:0x001f, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    public static k37 G(EntityImage entityImage) {
        String imageUrl = entityImage.getImageUrl();
        int i = 1;
        boolean z = entityImage.o() == vgy.d;
        int i2 = jd60.c[entityImage.o().ordinal()];
        int i3 = 2;
        if (i2 != 1) {
            int i4 = 3;
            if (i2 != 2) {
                i3 = 4;
                if (i2 != 3) {
                    i4 = 5;
                    if (i2 == 4) {
                        i = i4;
                    } else if (i2 == 5) {
                        i = 6;
                    }
                } else {
                    i = i3;
                }
            } else {
                i = i4;
            }
        } else {
            i = i3;
        }
        return new k37(imageUrl, i, z);
    }

    public static byte[] H(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        byte[] bArrI = I(length);
        int length2 = bArrI.length;
        int i = length2 + 1;
        byte[] bArr = new byte[i + length];
        bArr[0] = 2;
        System.arraycopy(bArrI, 0, bArr, 1, length2);
        System.arraycopy(byteArray, 0, bArr, i, length);
        return bArr;
    }

    public static byte[] I(int i) {
        int i2;
        if (i <= 127) {
            return new byte[]{(byte) i};
        }
        int i3 = i;
        int i4 = 0;
        while (true) {
            i2 = i4 + 1;
            if (i3 <= 0) {
                break;
            }
            i3 >>= 8;
            i4 = i2;
        }
        byte[] bArr = new byte[i2];
        bArr[0] = (byte) (i4 | 128);
        while (i4 > 0) {
            bArr[i4] = (byte) (i & 255);
            i >>= 8;
            i4--;
        }
        return bArr;
    }

    public static byte[] J(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        int length = 0;
        while (it.hasNext()) {
            length += ((byte[]) it.next()).length;
        }
        byte[] bArrI = I(length);
        int length2 = bArrI.length;
        int i = length2 + 1;
        byte[] bArr = new byte[length + i];
        bArr[0] = 48;
        System.arraycopy(bArrI, 0, bArr, 1, length2);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            byte[] bArr2 = (byte[]) it2.next();
            int length3 = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i, length3);
            i += length3;
        }
        return bArr;
    }

    public static final void a(boolean z, Function0 function0, Function0 function1, Function0 function2, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1345082172);
        if ((i & 6) == 0) {
            i2 = (x340Var2.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.i(function2) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (x340Var2.Y(i3 & 1, (i3 & 9363) != 9362)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            jw31 jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), een.Z, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var2, qim0Var3);
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
            nko1.H(jw31VarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            boolean z2 = (i3 & 112) == 32;
            Object objT = x340Var2.T();
            if (z2 || objT == m4cVar) {
                objT = new lj2(function0, (byte) 13);
                x340Var2.s0(objT);
            }
            z50 z50Var = z50.c;
            gbx gbxVar = new gbx(z50Var, (Function0) objT);
            jdx jdxVar = jdx.c;
            wro1.h(gbxVar, jdxVar, null, null, yla.s(x340Var2), null, false, null, null, f7i.a, x340Var2, 12582912, 6, 860);
            boolean z3 = (i3 & 896) == 256;
            Object objT2 = x340Var2.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new lj2(function1, (byte) 14);
                x340Var2.s0(objT2);
            }
            wro1.h(new gbx(z50Var, (Function0) objT2), jdxVar, null, null, yla.s(x340Var2), null, false, null, null, f7i.b, x340Var2, 12582912, 6, 860);
            x340Var = x340Var2;
            if (z) {
                x340Var.i0(868882551);
                boolean z4 = (i3 & 7168) == 2048;
                Object objT3 = x340Var.T();
                if (z4 || objT3 == m4cVar) {
                    objT3 = new lj2(function2, (byte) 15);
                    x340Var.s0(objT3);
                }
                wro1.h(new gbx(z50Var, (Function0) objT3), jdxVar, null, null, yla.s(x340Var), null, false, null, null, f7i.c, x340Var, 12582912, 6, 860);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                x340Var.i0(869415906);
                x340Var.r(false);
            }
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sx1(z, function0, function1, (Object) function2, (Object) qim0Var2, i, (byte) 3);
        }
    }

    public static final void b(c380 c380Var, int i, boolean z, vu30 vu30Var, iu30 iu30Var, Function0 function0, Function0 function1, qim0 qim0Var, float f, b0k b0kVar, int i2) throws Throwable {
        b0k b0kVar2;
        qim0 qim0Var2;
        qim0 qim0Var3;
        Integer num;
        jkr0 jkr0Var;
        Throwable th;
        boolean z2;
        c380 c380Var2 = c380Var;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1963767361);
        int i3 = i2 | (b0kVar3.g(c380Var2) ? 4 : 2) | (b0kVar3.e(i) ? 32 : 16) | (b0kVar3.h(z) ? 256 : 128) | (b0kVar3.i(vu30Var) ? 2048 : 1024) | (b0kVar3.i(iu30Var) ? 16384 : 8192) | (b0kVar3.i(function0) ? 131072 : 65536) | (b0kVar3.i(function1) ? 1048576 : 524288) | 12582912 | (b0kVar3.d(f) ? 67108864 : 33554432);
        if (b0kVar3.Y(i3 & 1, (i3 & 38347923) != 38347922)) {
            b0kVar3.d0();
            int i4 = i2 & 1;
            qim0 qim0Var4 = nim0.a;
            if (i4 == 0 || b0kVar3.E()) {
                qim0Var3 = qim0Var4;
            } else {
                b0kVar3.b0();
                qim0Var3 = qim0Var;
            }
            b0kVar3.s();
            int i5 = i3 & 14;
            boolean z3 = i5 == 4;
            Object objT = b0kVar3.T();
            if (z3 || objT == m4cVar) {
                objT = new k27(c380Var2, (byte) 0);
                b0kVar3.s0(objT);
            }
            jkr0 jkr0VarB = lkr0.b(i, (Function0) objT, b0kVar3, (i3 >> 3) & 14, 2);
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = qxd0.M(o6x.a, b0kVar3);
                b0kVar3.s0(objT2);
            }
            c9n c9nVar = (c9n) objT2;
            ven0 ven0VarS = v8r.s(c380Var2, b0kVar3);
            int i6 = i3 >> 9;
            ven0 ven0VarS2 = v8r.s(vu30Var, b0kVar3);
            boolean zI = b0kVar3.i(jkr0VarB) | b0kVar3.i(ven0VarS) | b0kVar3.i(ven0VarS2);
            qim0Var2 = qim0Var3;
            Object objT3 = b0kVar3.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new wc5(jkr0VarB, ven0VarS, ven0VarS2, (lnm) null);
                b0kVar3.s0(objT3);
            }
            qxd0.t(jkr0VarB, b0kVar3, (vu30) objT3);
            Integer numValueOf = Integer.valueOf(c380Var2.size());
            Integer numValueOf2 = Integer.valueOf(i);
            boolean zI2 = (i5 == 4) | ((i3 & 112) == 32) | b0kVar3.i(jkr0VarB);
            Object objT4 = b0kVar3.T();
            if (zI2 || objT4 == m4cVar) {
                num = numValueOf2;
                h27 h27Var = new h27(i, c380Var2, jkr0VarB, null, (byte) 0);
                c380Var2 = c380Var2;
                jkr0Var = jkr0VarB;
                th = null;
                b0kVar3.s0(h27Var);
                objT4 = h27Var;
            } else {
                num = numValueOf2;
                jkr0Var = jkr0VarB;
                th = null;
            }
            qxd0.s(numValueOf, num, (vu30) objT4, b0kVar3);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0Var2);
            hzj.A.getClass();
            if (((x340) b0kVar3).a == null) {
                tgp1.p();
                throw th;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(hmb0.t1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(mbhVarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            qim0 qim0VarX = p3v.b(f, 0.0f) > 0 ? j9k1.x(qim0Var4, new yy2((byte) 2, f)) : 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: ?: TERNARY (r0v36 'qim0VarX' p.qim0) = ((wrap int:0x01bd: INVOKE (r31v0 'f' float), (0.0f float) STATIC call: p.p3v.b(float, float):int A[WRAPPED] (LINE:446)) > (0 int)) ? (wrap ??:0x01cd: INVOKE 
                  (r4v25 'qim0Var4' p.qim0)
                  (wrap p.yy2:0x01c6: CONSTRUCTOR (2 byte), (r31v0 'f' float) A[WRAPPED] (LINE:455) call: p.yy2.<init>(byte, float):void type: CONSTRUCTOR)
                 STATIC call: p.j9k1.x(p.qim0, p.xu30):p.qim0 A[WRAPPED] (LINE:458)) : (r19v0 p.qim0) in method: p.foo1.b(p.c380, int, boolean, p.vu30, p.iu30, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, p.qim0, float, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes4.dex
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r19v0 p.qim0
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 656
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.foo1.b(p.c380, int, boolean, p.vu30, p.iu30, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, p.qim0, float, p.b0k, int):void");
        }

        /* JADX WARN: Code duplicated, block: B:100:0x0118  */
        /* JADX WARN: Code duplicated, block: B:101:0x011b  */
        /* JADX WARN: Code duplicated, block: B:103:0x0120  */
        /* JADX WARN: Code duplicated, block: B:106:0x012c  */
        /* JADX WARN: Code duplicated, block: B:108:0x0132  */
        /* JADX WARN: Code duplicated, block: B:109:0x0135  */
        /* JADX WARN: Code duplicated, block: B:113:0x0144  */
        /* JADX WARN: Code duplicated, block: B:117:0x014d  */
        /* JADX WARN: Code duplicated, block: B:120:0x0156  */
        /* JADX WARN: Code duplicated, block: B:122:0x0169  */
        /* JADX WARN: Code duplicated, block: B:139:0x0197 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:140:0x0199  */
        /* JADX WARN: Code duplicated, block: B:142:0x019e  */
        /* JADX WARN: Code duplicated, block: B:145:0x01a5  */
        /* JADX WARN: Code duplicated, block: B:148:0x01b0  */
        /* JADX WARN: Code duplicated, block: B:151:0x01b9  */
        /* JADX WARN: Code duplicated, block: B:152:0x01c0  */
        /* JADX WARN: Code duplicated, block: B:155:0x01c6  */
        /* JADX WARN: Code duplicated, block: B:156:0x01d6  */
        /* JADX WARN: Code duplicated, block: B:159:0x01db  */
        /* JADX WARN: Code duplicated, block: B:161:0x01de  */
        /* JADX WARN: Code duplicated, block: B:162:0x01e7  */
        /* JADX WARN: Code duplicated, block: B:164:0x0250  */
        /* JADX WARN: Code duplicated, block: B:167:0x0263  */
        /* JADX WARN: Code duplicated, block: B:169:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:30:0x0055  */
        /* JADX WARN: Code duplicated, block: B:32:0x005a  */
        /* JADX WARN: Code duplicated, block: B:34:0x005e  */
        /* JADX WARN: Code duplicated, block: B:36:0x0066  */
        /* JADX WARN: Code duplicated, block: B:37:0x0069  */
        /* JADX WARN: Code duplicated, block: B:41:0x0071  */
        /* JADX WARN: Code duplicated, block: B:43:0x0075  */
        /* JADX WARN: Code duplicated, block: B:45:0x007d  */
        /* JADX WARN: Code duplicated, block: B:46:0x0080  */
        /* JADX WARN: Code duplicated, block: B:49:0x0086  */
        /* JADX WARN: Code duplicated, block: B:52:0x008d  */
        /* JADX WARN: Code duplicated, block: B:54:0x0091  */
        /* JADX WARN: Code duplicated, block: B:56:0x0099  */
        /* JADX WARN: Code duplicated, block: B:57:0x009c  */
        /* JADX WARN: Code duplicated, block: B:60:0x00a3  */
        /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
        /* JADX WARN: Code duplicated, block: B:65:0x00af  */
        /* JADX WARN: Code duplicated, block: B:68:0x00ba A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:71:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:74:0x00c9  */
        /* JADX WARN: Code duplicated, block: B:76:0x00cd  */
        /* JADX WARN: Code duplicated, block: B:79:0x00d8 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:82:0x00df  */
        /* JADX WARN: Code duplicated, block: B:85:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:86:0x00ec  */
        /* JADX WARN: Code duplicated, block: B:88:0x00f2  */
        /* JADX WARN: Code duplicated, block: B:90:0x00f8  */
        /* JADX WARN: Code duplicated, block: B:91:0x00fb  */
        /* JADX WARN: Code duplicated, block: B:95:0x0103  */
        /* JADX WARN: Code duplicated, block: B:96:0x010a  */
        /* JADX WARN: Code duplicated, block: B:98:0x010e  */
        public static final void c(gbx gbxVar, yf yfVar, qim0 qim0Var, max maxVar, gdx gdxVar, vzq0 vzq0Var, idn0 idn0Var, ga80 ga80Var, vu30 vu30Var, vu30 vu30Var2, vu30 vu30Var3, b0k b0kVar, int i, int i2, int i3) {
            int i4;
            qim0 qim0Var2;
            int i5;
            int i6;
            max maxVar2;
            int i7;
            gdx gdxVarR;
            vzq0 vzq0Var2;
            int i8;
            vu30 vu30Var4;
            int i9;
            int i10;
            int i11;
            int i12;
            boolean z;
            vu30 vu30Var5;
            vu30 vu30Var6;
            qim0 qim0Var3;
            gdx gdxVar2;
            vzq0 vzq0Var3;
            idn0 idn0Var2;
            ga80 ga80Var2;
            h311 h311VarV;
            idn0 idn0VarY;
            ga80 vchVar;
            max maxVar3;
            ga80 ga80Var3;
            gdx gdxVar3;
            vzq0 vzq0Var4;
            idn0 idn0Var3;
            vu30 vu30Var7;
            qim0 qim0Var4;
            vu30 vu30Var8;
            int i13;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(1264220424);
            if ((i & 6) == 0) {
                i4 = (x340Var.g(gbxVar) ? 4 : 2) | i;
            } else {
                i4 = i;
            }
            if ((i & 48) == 0) {
                i4 |= x340Var.g(yfVar) ? 32 : 16;
            }
            int i14 = i3 & 4;
            if (i14 == 0) {
                if ((i & 384) == 0) {
                    qim0Var2 = qim0Var;
                    i4 |= x340Var.g(qim0Var2) ? 256 : 128;
                }
                i5 = i4 | 3072;
                i6 = i3 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        maxVar2 = maxVar;
                        if (x340Var.g(maxVar2)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i5 |= i7;
                    }
                    if ((196608 & i) == 0) {
                        if ((i3 & 32) == 0) {
                            gdxVarR = gdxVar;
                            int i15 = x340Var.g(gdxVarR) ? 131072 : 65536;
                            i5 |= i15;
                        } else {
                            gdxVarR = gdxVar;
                        }
                        i5 |= i15;
                    } else {
                        gdxVarR = gdxVar;
                    }
                    if ((1572864 & i) == 0) {
                        if ((i3 & 64) == 0) {
                            vzq0Var2 = vzq0Var;
                            int i16 = x340Var.g(vzq0Var2) ? 1048576 : 524288;
                            i5 |= i16;
                        } else {
                            vzq0Var2 = vzq0Var;
                        }
                        i5 |= i16;
                    } else {
                        vzq0Var2 = vzq0Var;
                    }
                    if ((i & 12582912) != 0) {
                        i5 |= ((i3 & 128) == 0 || !x340Var.g(idn0Var)) ? 4194304 : 8388608;
                    }
                    if ((i & 100663296) != 0) {
                        i5 |= ((i3 & 256) == 0 || !x340Var.g(ga80Var)) ? 33554432 : 67108864;
                    }
                    i8 = i3 & 512;
                    if (i8 != 0) {
                        i5 |= 805306368;
                        vu30Var4 = vu30Var;
                    } else {
                        vu30Var4 = vu30Var;
                        if ((i & 805306368) == 0) {
                            if (x340Var.i(vu30Var4)) {
                                i9 = 536870912;
                            } else {
                                i9 = 268435456;
                            }
                            i5 |= i9;
                        }
                    }
                    i10 = i3 & 1024;
                    if (i10 != 0) {
                        i11 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (x340Var.i(vu30Var2)) {
                            i12 = 4;
                        } else {
                            i12 = 2;
                        }
                        i11 = i2 | i12;
                    } else {
                        i11 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        if (x340Var.i(vu30Var3)) {
                            i13 = 32;
                        } else {
                            i13 = 16;
                        }
                        i11 |= i13;
                    }
                    if ((i5 & 306783379) == 306783378 || (i11 & 19) != 18) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (x340Var.Y(i5 & 1, z)) {
                        x340Var.d0();
                        if ((i & 1) != 0 || x340Var.E()) {
                            if (i14 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if (i6 != 0) {
                                maxVar2 = jax.a;
                            }
                            if ((i3 & 32) != 0) {
                                i5 &= -458753;
                                gdxVarR = yla.r(x340Var);
                            }
                            if ((i3 & 64) != 0) {
                                i5 &= -3670017;
                                vzq0Var2 = gdxVarR.a;
                            }
                            if ((i3 & 128) != 0) {
                                idn0VarY = zso1.Y(x340Var);
                                i5 &= -29360129;
                            } else {
                                idn0VarY = idn0Var;
                            }
                            if ((i3 & 256) != 0) {
                                vchVar = new vch(vno1.o((hw61) yfVar.b, x340Var, 0));
                                i5 = (-234881025) & i5;
                            } else {
                                vchVar = ga80Var;
                            }
                            if (i8 != 0) {
                                vu30Var4 = null;
                            }
                            if (i10 != 0) {
                                ga80Var3 = vchVar;
                                gdxVar3 = gdxVarR;
                                idn0Var3 = idn0VarY;
                                vu30Var7 = vu30Var4;
                                qim0Var4 = qim0Var2;
                                vu30Var8 = null;
                                maxVar3 = maxVar2;
                                vzq0Var4 = vzq0Var2;
                            } else {
                                maxVar3 = maxVar2;
                                ga80Var3 = vchVar;
                                gdxVar3 = gdxVarR;
                                vzq0Var4 = vzq0Var2;
                                idn0Var3 = idn0VarY;
                                vu30Var7 = vu30Var4;
                                qim0Var4 = qim0Var2;
                            }
                            x340Var.s();
                            vu30 vu30Var9 = vu30Var7;
                            vu30 vu30Var10 = vu30Var8;
                            int i17 = i5 >> 3;
                            boo1.a(gbxVar, yfVar, maxVar3, gdxVar3, vzq0Var4, idn0Var3, ga80Var3, qim0Var4, false, null, apo.r(1286175620, new c9o(gdxVar3, vu30Var9, vu30Var3, vu30Var10, (byte) 1), x340Var), x340Var, (i5 & 14) | ((i5 >> 6) & 112) | ((i5 << 3) & 896) | (i17 & 7168) | (57344 & i17) | (458752 & i17) | (3670016 & i17) | (i17 & 29360128) | (234881024 & (i5 << 18)), 1536);
                            idn0 idn0Var4 = idn0Var3;
                            gdxVar2 = gdxVar3;
                            qim0Var3 = qim0Var4;
                            idn0Var2 = idn0Var4;
                            ga80Var2 = ga80Var3;
                            vu30Var6 = vu30Var9;
                            vu30Var5 = vu30Var10;
                            vzq0Var3 = vzq0Var4;
                            maxVar2 = maxVar3;
                        } else {
                            x340Var.b0();
                            if ((i3 & 32) != 0) {
                                i5 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                i5 &= -3670017;
                            }
                            if ((i3 & 128) != 0) {
                                i5 &= -29360129;
                            }
                            if ((i3 & 256) != 0) {
                                i5 &= -234881025;
                            }
                            idn0Var3 = idn0Var;
                            ga80Var3 = ga80Var;
                            maxVar3 = maxVar2;
                            vu30Var7 = vu30Var4;
                            qim0Var4 = qim0Var2;
                            gdxVar3 = gdxVarR;
                            vzq0Var4 = vzq0Var2;
                        }
                        vu30Var8 = vu30Var2;
                        x340Var.s();
                        vu30 vu30Var11 = vu30Var7;
                        vu30 vu30Var12 = vu30Var8;
                        int i18 = i5 >> 3;
                        boo1.a(gbxVar, yfVar, maxVar3, gdxVar3, vzq0Var4, idn0Var3, ga80Var3, qim0Var4, false, null, apo.r(1286175620, new c9o(gdxVar3, vu30Var11, vu30Var3, vu30Var12, (byte) 1), x340Var), x340Var, (i5 & 14) | ((i5 >> 6) & 112) | ((i5 << 3) & 896) | (i18 & 7168) | (57344 & i18) | (458752 & i18) | (3670016 & i18) | (i18 & 29360128) | (234881024 & (i5 << 18)), 1536);
                        idn0 idn0Var5 = idn0Var3;
                        gdxVar2 = gdxVar3;
                        qim0Var3 = qim0Var4;
                        idn0Var2 = idn0Var5;
                        ga80Var2 = ga80Var3;
                        vu30Var6 = vu30Var11;
                        vu30Var5 = vu30Var12;
                        vzq0Var3 = vzq0Var4;
                        maxVar2 = maxVar3;
                    } else {
                        x340Var.b0();
                        vu30Var5 = vu30Var2;
                        vu30Var6 = vu30Var4;
                        qim0Var3 = qim0Var2;
                        gdxVar2 = gdxVarR;
                        vzq0Var3 = vzq0Var2;
                        idn0Var2 = idn0Var;
                        ga80Var2 = ga80Var;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new ddx(gbxVar, yfVar, qim0Var3, maxVar2, gdxVar2, vzq0Var3, idn0Var2, ga80Var2, vu30Var6, vu30Var5, vu30Var3, i, i2, i3);
                    }
                }
                i5 = i4 | 27648;
                maxVar2 = maxVar;
                if ((196608 & i) == 0) {
                    if ((i3 & 32) == 0) {
                        gdxVarR = gdxVar;
                        if (x340Var.g(gdxVarR)) {
                        }
                        i5 |= i15;
                    } else {
                        gdxVarR = gdxVar;
                    }
                    i5 |= i15;
                } else {
                    gdxVarR = gdxVar;
                }
                if ((1572864 & i) == 0) {
                    if ((i3 & 64) == 0) {
                        vzq0Var2 = vzq0Var;
                        if (x340Var.g(vzq0Var2)) {
                        }
                        i5 |= i16;
                    } else {
                        vzq0Var2 = vzq0Var;
                    }
                    i5 |= i16;
                } else {
                    vzq0Var2 = vzq0Var;
                }
                if ((i & 12582912) != 0) {
                    i5 |= ((i3 & 128) == 0 || !x340Var.g(idn0Var)) ? 4194304 : 8388608;
                }
                if ((i & 100663296) != 0) {
                    i5 |= ((i3 & 256) == 0 || !x340Var.g(ga80Var)) ? 33554432 : 67108864;
                }
                i8 = i3 & 512;
                if (i8 != 0) {
                    i5 |= 805306368;
                    vu30Var4 = vu30Var;
                } else {
                    vu30Var4 = vu30Var;
                    if ((i & 805306368) == 0) {
                        if (x340Var.i(vu30Var4)) {
                            i9 = 536870912;
                        } else {
                            i9 = 268435456;
                        }
                        i5 |= i9;
                    }
                }
                i10 = i3 & 1024;
                if (i10 != 0) {
                    i11 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (x340Var.i(vu30Var2)) {
                        i12 = 4;
                    } else {
                        i12 = 2;
                    }
                    i11 = i2 | i12;
                } else {
                    i11 = i2;
                }
                if ((i2 & 48) == 0) {
                    if (x340Var.i(vu30Var3)) {
                        i13 = 32;
                    } else {
                        i13 = 16;
                    }
                    i11 |= i13;
                }
                if ((i5 & 306783379) == 306783378) {
                    z = true;
                } else {
                    z = true;
                }
                if (x340Var.Y(i5 & 1, z)) {
                    x340Var.d0();
                    if ((i & 1) != 0) {
                        if (i14 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i6 != 0) {
                            maxVar2 = jax.a;
                        }
                        if ((i3 & 32) != 0) {
                            i5 &= -458753;
                            gdxVarR = yla.r(x340Var);
                        }
                        if ((i3 & 64) != 0) {
                            i5 &= -3670017;
                            vzq0Var2 = gdxVarR.a;
                        }
                        if ((i3 & 128) != 0) {
                            idn0VarY = zso1.Y(x340Var);
                            i5 &= -29360129;
                        } else {
                            idn0VarY = idn0Var;
                        }
                        if ((i3 & 256) != 0) {
                            vchVar = new vch(vno1.o((hw61) yfVar.b, x340Var, 0));
                            i5 = (-234881025) & i5;
                        } else {
                            vchVar = ga80Var;
                        }
                        if (i8 != 0) {
                            vu30Var4 = null;
                        }
                        if (i10 != 0) {
                            ga80Var3 = vchVar;
                            gdxVar3 = gdxVarR;
                            idn0Var3 = idn0VarY;
                            vu30Var7 = vu30Var4;
                            qim0Var4 = qim0Var2;
                            vu30Var8 = null;
                            maxVar3 = maxVar2;
                            vzq0Var4 = vzq0Var2;
                        } else {
                            maxVar3 = maxVar2;
                            ga80Var3 = vchVar;
                            gdxVar3 = gdxVarR;
                            vzq0Var4 = vzq0Var2;
                            idn0Var3 = idn0VarY;
                            vu30Var7 = vu30Var4;
                            qim0Var4 = qim0Var2;
                            vu30Var8 = vu30Var2;
                        }
                    } else {
                        if (i14 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i6 != 0) {
                            maxVar2 = jax.a;
                        }
                        if ((i3 & 32) != 0) {
                            i5 &= -458753;
                            gdxVarR = yla.r(x340Var);
                        }
                        if ((i3 & 64) != 0) {
                            i5 &= -3670017;
                            vzq0Var2 = gdxVarR.a;
                        }
                        if ((i3 & 128) != 0) {
                            idn0VarY = zso1.Y(x340Var);
                            i5 &= -29360129;
                        } else {
                            idn0VarY = idn0Var;
                        }
                        if ((i3 & 256) != 0) {
                            vchVar = new vch(vno1.o((hw61) yfVar.b, x340Var, 0));
                            i5 = (-234881025) & i5;
                        } else {
                            vchVar = ga80Var;
                        }
                        if (i8 != 0) {
                            vu30Var4 = null;
                        }
                        if (i10 != 0) {
                            ga80Var3 = vchVar;
                            gdxVar3 = gdxVarR;
                            idn0Var3 = idn0VarY;
                            vu30Var7 = vu30Var4;
                            qim0Var4 = qim0Var2;
                            vu30Var8 = null;
                            maxVar3 = maxVar2;
                            vzq0Var4 = vzq0Var2;
                        } else {
                            maxVar3 = maxVar2;
                            ga80Var3 = vchVar;
                            gdxVar3 = gdxVarR;
                            vzq0Var4 = vzq0Var2;
                            idn0Var3 = idn0VarY;
                            vu30Var7 = vu30Var4;
                            qim0Var4 = qim0Var2;
                            vu30Var8 = vu30Var2;
                        }
                    }
                    x340Var.s();
                    vu30 vu30Var13 = vu30Var7;
                    vu30 vu30Var14 = vu30Var8;
                    int i19 = i5 >> 3;
                    boo1.a(gbxVar, yfVar, maxVar3, gdxVar3, vzq0Var4, idn0Var3, ga80Var3, qim0Var4, false, null, apo.r(1286175620, new c9o(gdxVar3, vu30Var13, vu30Var3, vu30Var14, (byte) 1), x340Var), x340Var, (i5 & 14) | ((i5 >> 6) & 112) | ((i5 << 3) & 896) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (3670016 & i19) | (i19 & 29360128) | (234881024 & (i5 << 18)), 1536);
                    idn0 idn0Var6 = idn0Var3;
                    gdxVar2 = gdxVar3;
                    qim0Var3 = qim0Var4;
                    idn0Var2 = idn0Var6;
                    ga80Var2 = ga80Var3;
                    vu30Var6 = vu30Var13;
                    vu30Var5 = vu30Var14;
                    vzq0Var3 = vzq0Var4;
                    maxVar2 = maxVar3;
                } else {
                    x340Var.b0();
                    vu30Var5 = vu30Var2;
                    vu30Var6 = vu30Var4;
                    qim0Var3 = qim0Var2;
                    gdxVar2 = gdxVarR;
                    vzq0Var3 = vzq0Var2;
                    idn0Var2 = idn0Var;
                    ga80Var2 = ga80Var;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new ddx(gbxVar, yfVar, qim0Var3, maxVar2, gdxVar2, vzq0Var3, idn0Var2, ga80Var2, vu30Var6, vu30Var5, vu30Var3, i, i2, i3);
                }
            }
            i4 |= 384;
            qim0Var2 = qim0Var;
            i5 = i4 | 3072;
            i6 = i3 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    maxVar2 = maxVar;
                    if (x340Var.g(maxVar2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i5 |= i7;
                }
                if ((196608 & i) == 0) {
                    if ((i3 & 32) == 0) {
                        gdxVarR = gdxVar;
                        if (x340Var.g(gdxVarR)) {
                        }
                        i5 |= i15;
                    } else {
                        gdxVarR = gdxVar;
                    }
                    i5 |= i15;
                } else {
                    gdxVarR = gdxVar;
                }
                if ((1572864 & i) == 0) {
                    if ((i3 & 64) == 0) {
                        vzq0Var2 = vzq0Var;
                        if (x340Var.g(vzq0Var2)) {
                        }
                        i5 |= i16;
                    } else {
                        vzq0Var2 = vzq0Var;
                    }
                    i5 |= i16;
                } else {
                    vzq0Var2 = vzq0Var;
                }
                if ((i & 12582912) != 0) {
                    i5 |= ((i3 & 128) == 0 || !x340Var.g(idn0Var)) ? 4194304 : 8388608;
                }
                if ((i & 100663296) != 0) {
                    i5 |= ((i3 & 256) == 0 || !x340Var.g(ga80Var)) ? 33554432 : 67108864;
                }
                i8 = i3 & 512;
                if (i8 != 0) {
                    i5 |= 805306368;
                    vu30Var4 = vu30Var;
                } else {
                    vu30Var4 = vu30Var;
                    if ((i & 805306368) == 0) {
                        if (x340Var.i(vu30Var4)) {
                            i9 = 536870912;
                        } else {
                            i9 = 268435456;
                        }
                        i5 |= i9;
                    }
                }
                i10 = i3 & 1024;
                if (i10 != 0) {
                    i11 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (x340Var.i(vu30Var2)) {
                        i12 = 4;
                    } else {
                        i12 = 2;
                    }
                    i11 = i2 | i12;
                } else {
                    i11 = i2;
                }
                if ((i2 & 48) == 0) {
                    if (x340Var.i(vu30Var3)) {
                        i13 = 32;
                    } else {
                        i13 = 16;
                    }
                    i11 |= i13;
                }
                if ((i5 & 306783379) == 306783378) {
                    z = true;
                } else {
                    z = true;
                }
                if (x340Var.Y(i5 & 1, z)) {
                    x340Var.d0();
                    if ((i & 1) != 0) {
                        if (i14 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i6 != 0) {
                            maxVar2 = jax.a;
                        }
                        if ((i3 & 32) != 0) {
                            i5 &= -458753;
                            gdxVarR = yla.r(x340Var);
                        }
                        if ((i3 & 64) != 0) {
                            i5 &= -3670017;
                            vzq0Var2 = gdxVarR.a;
                        }
                        if ((i3 & 128) != 0) {
                            idn0VarY = zso1.Y(x340Var);
                            i5 &= -29360129;
                        } else {
                            idn0VarY = idn0Var;
                        }
                        if ((i3 & 256) != 0) {
                            vchVar = new vch(vno1.o((hw61) yfVar.b, x340Var, 0));
                            i5 = (-234881025) & i5;
                        } else {
                            vchVar = ga80Var;
                        }
                        if (i8 != 0) {
                            vu30Var4 = null;
                        }
                        if (i10 != 0) {
                            ga80Var3 = vchVar;
                            gdxVar3 = gdxVarR;
                            idn0Var3 = idn0VarY;
                            vu30Var7 = vu30Var4;
                            qim0Var4 = qim0Var2;
                            vu30Var8 = null;
                            maxVar3 = maxVar2;
                            vzq0Var4 = vzq0Var2;
                        } else {
                            maxVar3 = maxVar2;
                            ga80Var3 = vchVar;
                            gdxVar3 = gdxVarR;
                            vzq0Var4 = vzq0Var2;
                            idn0Var3 = idn0VarY;
                            vu30Var7 = vu30Var4;
                            qim0Var4 = qim0Var2;
                            vu30Var8 = vu30Var2;
                        }
                    } else {
                        if (i14 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i6 != 0) {
                            maxVar2 = jax.a;
                        }
                        if ((i3 & 32) != 0) {
                            i5 &= -458753;
                            gdxVarR = yla.r(x340Var);
                        }
                        if ((i3 & 64) != 0) {
                            i5 &= -3670017;
                            vzq0Var2 = gdxVarR.a;
                        }
                        if ((i3 & 128) != 0) {
                            idn0VarY = zso1.Y(x340Var);
                            i5 &= -29360129;
                        } else {
                            idn0VarY = idn0Var;
                        }
                        if ((i3 & 256) != 0) {
                            vchVar = new vch(vno1.o((hw61) yfVar.b, x340Var, 0));
                            i5 = (-234881025) & i5;
                        } else {
                            vchVar = ga80Var;
                        }
                        if (i8 != 0) {
                            vu30Var4 = null;
                        }
                        if (i10 != 0) {
                            ga80Var3 = vchVar;
                            gdxVar3 = gdxVarR;
                            idn0Var3 = idn0VarY;
                            vu30Var7 = vu30Var4;
                            qim0Var4 = qim0Var2;
                            vu30Var8 = null;
                            maxVar3 = maxVar2;
                            vzq0Var4 = vzq0Var2;
                        } else {
                            maxVar3 = maxVar2;
                            ga80Var3 = vchVar;
                            gdxVar3 = gdxVarR;
                            vzq0Var4 = vzq0Var2;
                            idn0Var3 = idn0VarY;
                            vu30Var7 = vu30Var4;
                            qim0Var4 = qim0Var2;
                            vu30Var8 = vu30Var2;
                        }
                    }
                    x340Var.s();
                    vu30 vu30Var15 = vu30Var7;
                    vu30 vu30Var16 = vu30Var8;
                    int i110 = i5 >> 3;
                    boo1.a(gbxVar, yfVar, maxVar3, gdxVar3, vzq0Var4, idn0Var3, ga80Var3, qim0Var4, false, null, apo.r(1286175620, new c9o(gdxVar3, vu30Var15, vu30Var3, vu30Var16, (byte) 1), x340Var), x340Var, (i5 & 14) | ((i5 >> 6) & 112) | ((i5 << 3) & 896) | (i110 & 7168) | (57344 & i110) | (458752 & i110) | (3670016 & i110) | (i110 & 29360128) | (234881024 & (i5 << 18)), 1536);
                    idn0 idn0Var7 = idn0Var3;
                    gdxVar2 = gdxVar3;
                    qim0Var3 = qim0Var4;
                    idn0Var2 = idn0Var7;
                    ga80Var2 = ga80Var3;
                    vu30Var6 = vu30Var15;
                    vu30Var5 = vu30Var16;
                    vzq0Var3 = vzq0Var4;
                    maxVar2 = maxVar3;
                } else {
                    x340Var.b0();
                    vu30Var5 = vu30Var2;
                    vu30Var6 = vu30Var4;
                    qim0Var3 = qim0Var2;
                    gdxVar2 = gdxVarR;
                    vzq0Var3 = vzq0Var2;
                    idn0Var2 = idn0Var;
                    ga80Var2 = ga80Var;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new ddx(gbxVar, yfVar, qim0Var3, maxVar2, gdxVar2, vzq0Var3, idn0Var2, ga80Var2, vu30Var6, vu30Var5, vu30Var3, i, i2, i3);
                }
            }
            i5 = i4 | 27648;
            maxVar2 = maxVar;
            if ((196608 & i) == 0) {
                if ((i3 & 32) == 0) {
                    gdxVarR = gdxVar;
                    if (x340Var.g(gdxVarR)) {
                    }
                    i5 |= i15;
                } else {
                    gdxVarR = gdxVar;
                }
                i5 |= i15;
            } else {
                gdxVarR = gdxVar;
            }
            if ((1572864 & i) == 0) {
                if ((i3 & 64) == 0) {
                    vzq0Var2 = vzq0Var;
                    if (x340Var.g(vzq0Var2)) {
                    }
                    i5 |= i16;
                } else {
                    vzq0Var2 = vzq0Var;
                }
                i5 |= i16;
            } else {
                vzq0Var2 = vzq0Var;
            }
            if ((i & 12582912) != 0) {
                i5 |= ((i3 & 128) == 0 || !x340Var.g(idn0Var)) ? 4194304 : 8388608;
            }
            if ((i & 100663296) != 0) {
                i5 |= ((i3 & 256) == 0 || !x340Var.g(ga80Var)) ? 33554432 : 67108864;
            }
            i8 = i3 & 512;
            if (i8 != 0) {
                i5 |= 805306368;
                vu30Var4 = vu30Var;
            } else {
                vu30Var4 = vu30Var;
                if ((i & 805306368) == 0) {
                    if (x340Var.i(vu30Var4)) {
                        i9 = 536870912;
                    } else {
                        i9 = 268435456;
                    }
                    i5 |= i9;
                }
            }
            i10 = i3 & 1024;
            if (i10 != 0) {
                i11 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (x340Var.i(vu30Var2)) {
                    i12 = 4;
                } else {
                    i12 = 2;
                }
                i11 = i2 | i12;
            } else {
                i11 = i2;
            }
            if ((i2 & 48) == 0) {
                if (x340Var.i(vu30Var3)) {
                    i13 = 32;
                } else {
                    i13 = 16;
                }
                i11 |= i13;
            }
            if ((i5 & 306783379) == 306783378) {
                z = true;
            } else {
                z = true;
            }
            if (x340Var.Y(i5 & 1, z)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if (i14 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if (i6 != 0) {
                        maxVar2 = jax.a;
                    }
                    if ((i3 & 32) != 0) {
                        i5 &= -458753;
                        gdxVarR = yla.r(x340Var);
                    }
                    if ((i3 & 64) != 0) {
                        i5 &= -3670017;
                        vzq0Var2 = gdxVarR.a;
                    }
                    if ((i3 & 128) != 0) {
                        idn0VarY = zso1.Y(x340Var);
                        i5 &= -29360129;
                    } else {
                        idn0VarY = idn0Var;
                    }
                    if ((i3 & 256) != 0) {
                        vchVar = new vch(vno1.o((hw61) yfVar.b, x340Var, 0));
                        i5 = (-234881025) & i5;
                    } else {
                        vchVar = ga80Var;
                    }
                    if (i8 != 0) {
                        vu30Var4 = null;
                    }
                    if (i10 != 0) {
                        ga80Var3 = vchVar;
                        gdxVar3 = gdxVarR;
                        idn0Var3 = idn0VarY;
                        vu30Var7 = vu30Var4;
                        qim0Var4 = qim0Var2;
                        vu30Var8 = null;
                        maxVar3 = maxVar2;
                        vzq0Var4 = vzq0Var2;
                    } else {
                        maxVar3 = maxVar2;
                        ga80Var3 = vchVar;
                        gdxVar3 = gdxVarR;
                        vzq0Var4 = vzq0Var2;
                        idn0Var3 = idn0VarY;
                        vu30Var7 = vu30Var4;
                        qim0Var4 = qim0Var2;
                        vu30Var8 = vu30Var2;
                    }
                } else {
                    if (i14 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if (i6 != 0) {
                        maxVar2 = jax.a;
                    }
                    if ((i3 & 32) != 0) {
                        i5 &= -458753;
                        gdxVarR = yla.r(x340Var);
                    }
                    if ((i3 & 64) != 0) {
                        i5 &= -3670017;
                        vzq0Var2 = gdxVarR.a;
                    }
                    if ((i3 & 128) != 0) {
                        idn0VarY = zso1.Y(x340Var);
                        i5 &= -29360129;
                    } else {
                        idn0VarY = idn0Var;
                    }
                    if ((i3 & 256) != 0) {
                        vchVar = new vch(vno1.o((hw61) yfVar.b, x340Var, 0));
                        i5 = (-234881025) & i5;
                    } else {
                        vchVar = ga80Var;
                    }
                    if (i8 != 0) {
                        vu30Var4 = null;
                    }
                    if (i10 != 0) {
                        ga80Var3 = vchVar;
                        gdxVar3 = gdxVarR;
                        idn0Var3 = idn0VarY;
                        vu30Var7 = vu30Var4;
                        qim0Var4 = qim0Var2;
                        vu30Var8 = null;
                        maxVar3 = maxVar2;
                        vzq0Var4 = vzq0Var2;
                    } else {
                        maxVar3 = maxVar2;
                        ga80Var3 = vchVar;
                        gdxVar3 = gdxVarR;
                        vzq0Var4 = vzq0Var2;
                        idn0Var3 = idn0VarY;
                        vu30Var7 = vu30Var4;
                        qim0Var4 = qim0Var2;
                        vu30Var8 = vu30Var2;
                    }
                }
                x340Var.s();
                vu30 vu30Var17 = vu30Var7;
                vu30 vu30Var18 = vu30Var8;
                int i111 = i5 >> 3;
                boo1.a(gbxVar, yfVar, maxVar3, gdxVar3, vzq0Var4, idn0Var3, ga80Var3, qim0Var4, false, null, apo.r(1286175620, new c9o(gdxVar3, vu30Var17, vu30Var3, vu30Var18, (byte) 1), x340Var), x340Var, (i5 & 14) | ((i5 >> 6) & 112) | ((i5 << 3) & 896) | (i111 & 7168) | (57344 & i111) | (458752 & i111) | (3670016 & i111) | (i111 & 29360128) | (234881024 & (i5 << 18)), 1536);
                idn0 idn0Var8 = idn0Var3;
                gdxVar2 = gdxVar3;
                qim0Var3 = qim0Var4;
                idn0Var2 = idn0Var8;
                ga80Var2 = ga80Var3;
                vu30Var6 = vu30Var17;
                vu30Var5 = vu30Var18;
                vzq0Var3 = vzq0Var4;
                maxVar2 = maxVar3;
            } else {
                x340Var.b0();
                vu30Var5 = vu30Var2;
                vu30Var6 = vu30Var4;
                qim0Var3 = qim0Var2;
                gdxVar2 = gdxVarR;
                vzq0Var3 = vzq0Var2;
                idn0Var2 = idn0Var;
                ga80Var2 = ga80Var;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ddx(gbxVar, yfVar, qim0Var3, maxVar2, gdxVar2, vzq0Var3, idn0Var2, ga80Var2, vu30Var6, vu30Var5, vu30Var3, i, i2, i3);
            }
        }

        /* JADX WARN: Code duplicated, block: B:101:0x0116  */
        /* JADX WARN: Code duplicated, block: B:103:0x011d  */
        /* JADX WARN: Code duplicated, block: B:105:0x0121  */
        /* JADX WARN: Code duplicated, block: B:107:0x012b  */
        /* JADX WARN: Code duplicated, block: B:108:0x012e  */
        /* JADX WARN: Code duplicated, block: B:110:0x0133  */
        /* JADX WARN: Code duplicated, block: B:117:0x014e  */
        /* JADX WARN: Code duplicated, block: B:120:0x0157  */
        /* JADX WARN: Code duplicated, block: B:136:0x0197 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:137:0x0199  */
        /* JADX WARN: Code duplicated, block: B:138:0x019c  */
        /* JADX WARN: Code duplicated, block: B:141:0x01a1  */
        /* JADX WARN: Code duplicated, block: B:142:0x01a5  */
        /* JADX WARN: Code duplicated, block: B:144:0x01a9  */
        /* JADX WARN: Code duplicated, block: B:145:0x01ac  */
        /* JADX WARN: Code duplicated, block: B:148:0x01b2  */
        /* JADX WARN: Code duplicated, block: B:149:0x01b7  */
        /* JADX WARN: Code duplicated, block: B:152:0x01bf  */
        /* JADX WARN: Code duplicated, block: B:153:0x01c5  */
        /* JADX WARN: Code duplicated, block: B:156:0x01d8  */
        /* JADX WARN: Code duplicated, block: B:157:0x01da  */
        /* JADX WARN: Code duplicated, block: B:160:0x01e4  */
        /* JADX WARN: Code duplicated, block: B:162:0x0243  */
        /* JADX WARN: Code duplicated, block: B:165:0x0259  */
        /* JADX WARN: Code duplicated, block: B:167:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:37:0x0065  */
        /* JADX WARN: Code duplicated, block: B:39:0x0069  */
        /* JADX WARN: Code duplicated, block: B:41:0x0071  */
        /* JADX WARN: Code duplicated, block: B:42:0x0074  */
        /* JADX WARN: Code duplicated, block: B:45:0x007a  */
        /* JADX WARN: Code duplicated, block: B:48:0x0082  */
        /* JADX WARN: Code duplicated, block: B:49:0x0087  */
        /* JADX WARN: Code duplicated, block: B:51:0x008d  */
        /* JADX WARN: Code duplicated, block: B:53:0x0093  */
        /* JADX WARN: Code duplicated, block: B:54:0x0096  */
        /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
        /* JADX WARN: Code duplicated, block: B:60:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:61:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:65:0x00b3  */
        /* JADX WARN: Code duplicated, block: B:73:0x00c9  */
        /* JADX WARN: Code duplicated, block: B:76:0x00d1  */
        /* JADX WARN: Code duplicated, block: B:78:0x00d5  */
        /* JADX WARN: Code duplicated, block: B:80:0x00dd  */
        /* JADX WARN: Code duplicated, block: B:81:0x00e0  */
        /* JADX WARN: Code duplicated, block: B:84:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:87:0x00ef  */
        /* JADX WARN: Code duplicated, block: B:90:0x00f7  */
        /* JADX WARN: Code duplicated, block: B:91:0x00fc  */
        /* JADX WARN: Code duplicated, block: B:93:0x0102  */
        /* JADX WARN: Code duplicated, block: B:95:0x0108  */
        /* JADX WARN: Code duplicated, block: B:96:0x010b  */
        /* JADX WARN: Code duplicated, block: B:98:0x0110  */
        public static final void d(boolean z, iu30 iu30Var, yf yfVar, qim0 qim0Var, yf yfVar2, max maxVar, gdx gdxVar, vzq0 vzq0Var, idn0 idn0Var, ga80 ga80Var, vu30 vu30Var, vu30 vu30Var2, j2i j2iVar, b0k b0kVar, int i, int i2, int i3) {
            int i4;
            qim0 qim0Var2;
            yf yfVar3;
            int i5;
            int i6;
            idn0 idn0Var2;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            boolean z2;
            max maxVar2;
            ga80 ga80Var2;
            vu30 vu30Var3;
            idn0 idn0Var3;
            qim0 qim0Var3;
            yf yfVar4;
            vzq0 vzq0Var2;
            vu30 vu30Var4;
            h311 h311VarV;
            qim0 qim0Var4;
            int i13;
            max maxVar3;
            vzq0 vzq0Var3;
            idn0 idn0VarY;
            vu30 vu30Var5;
            vu30 vu30Var6;
            idn0 idn0Var4;
            int i14;
            ga80 ga80Var3;
            vu30 vu30Var7;
            int i15;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-1919041334);
            if ((i & 6) == 0) {
                i4 = (x340Var.h(z) ? 4 : 2) | i;
            } else {
                i4 = i;
            }
            if ((i & 48) == 0) {
                i4 |= x340Var.i(iu30Var) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i4 |= x340Var.g(yfVar) ? 256 : 128;
            }
            int i16 = i3 & 8;
            if (i16 == 0) {
                if ((i & 3072) == 0) {
                    qim0Var2 = qim0Var;
                    i4 |= x340Var.g(qim0Var2) ? 2048 : 1024;
                }
                if ((i & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        yfVar3 = yfVar2;
                        int i17 = x340Var.g(yfVar3) ? 16384 : 8192;
                        i4 |= i17;
                    } else {
                        yfVar3 = yfVar2;
                    }
                    i4 |= i17;
                } else {
                    yfVar3 = yfVar2;
                }
                i5 = i3 & 32;
                if (i5 != 0) {
                    i4 |= 196608;
                } else if ((i & 196608) == 0) {
                    if (x340Var.g(maxVar)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i4 |= i6;
                }
                if ((i & 1572864) == 0) {
                    if (x340Var.g(gdxVar)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i4 |= i15;
                }
                if ((i & 12582912) != 0) {
                    i4 |= ((i3 & 128) == 0 || !x340Var.g(vzq0Var)) ? 4194304 : 8388608;
                }
                if ((i & 100663296) == 0) {
                    if ((i3 & 256) == 0) {
                        idn0Var2 = idn0Var;
                        int i18 = x340Var.g(idn0Var2) ? 67108864 : 33554432;
                        i4 |= i18;
                    } else {
                        idn0Var2 = idn0Var;
                    }
                    i4 |= i18;
                } else {
                    idn0Var2 = idn0Var;
                }
                if ((i & 805306368) == 0) {
                    i4 |= 268435456;
                }
                i7 = i3 & 1024;
                if (i7 != 0) {
                    i8 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (x340Var.i(vu30Var)) {
                        i9 = 4;
                    } else {
                        i9 = 2;
                    }
                    i8 = i2 | i9;
                } else {
                    i8 = i2;
                }
                i10 = i3 & 2048;
                if (i10 != 0) {
                    i8 |= 48;
                } else if ((i2 & 48) != 0) {
                    if (x340Var.i(vu30Var2)) {
                        i11 = 32;
                    } else {
                        i11 = 16;
                    }
                    i8 |= i11;
                }
                int i19 = i8;
                i12 = i4;
                if ((i12 & 306783379) == 306783378 || (i19 & 147) != 146) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (x340Var.Y(i12 & 1, z2)) {
                    x340Var.d0();
                    if ((i & 1) != 0 || x340Var.E()) {
                        if (i16 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if ((i3 & 16) != 0) {
                            i13 = i12 & (-57345);
                            yfVar3 = yfVar;
                        } else {
                            i13 = i12;
                        }
                        if (i5 != 0) {
                            maxVar3 = jax.a;
                        } else {
                            maxVar3 = maxVar;
                        }
                        if ((i3 & 128) != 0) {
                            vzq0Var3 = gdxVar.a;
                            i13 &= -29360129;
                        } else {
                            vzq0Var3 = vzq0Var;
                        }
                        if ((i3 & 256) != 0) {
                            idn0VarY = zso1.Y(x340Var);
                            i13 &= -234881025;
                        } else {
                            idn0VarY = idn0Var2;
                        }
                        ga80 vchVar = new vch(vno1.o((hw61) yfVar.b, x340Var, 0));
                        int i20 = i13 & (-1879048193);
                        if (i7 != 0) {
                            vu30Var5 = null;
                        } else {
                            vu30Var5 = vu30Var;
                        }
                        vu30Var6 = i10 == 0 ? vu30Var2 : null;
                        idn0Var4 = idn0VarY;
                        i14 = i20;
                        ga80Var3 = vchVar;
                        vu30Var7 = vu30Var5;
                    } else {
                        x340Var.b0();
                        int i21 = (i3 & 16) != 0 ? i12 & (-57345) : i12;
                        if ((i3 & 128) != 0) {
                            i21 &= -29360129;
                        }
                        if ((i3 & 256) != 0) {
                            i21 &= -234881025;
                        }
                        vzq0Var3 = vzq0Var;
                        ga80Var3 = ga80Var;
                        vu30Var7 = vu30Var;
                        vu30Var6 = vu30Var2;
                        i14 = i21 & (-1879048193);
                        idn0Var4 = idn0Var2;
                        qim0Var4 = qim0Var2;
                        maxVar3 = maxVar;
                    }
                    x340Var.s();
                    int i22 = i14;
                    qim0 qim0Var5 = qim0Var4;
                    vu30 vu30Var8 = vu30Var7;
                    vu30 vu30Var9 = vu30Var6;
                    j2i j2iVarR = apo.r(-517975481, new n7m(gdxVar, vu30Var7, j2iVar, vu30Var6, (byte) 28), x340Var);
                    int i23 = i22 >> 3;
                    int i24 = ((i22 << 18) & 1879048192) | (i22 & 1022) | (i23 & 7168) | (57344 & i23) | (458752 & i23) | (3670016 & i23) | (i23 & 29360128);
                    vzq0 vzq0Var4 = vzq0Var3;
                    ga80 ga80Var4 = ga80Var3;
                    idn0 idn0Var5 = idn0Var4;
                    max maxVar4 = maxVar3;
                    yf yfVar5 = yfVar3;
                    boo1.b(z, iu30Var, yfVar, yfVar5, maxVar4, gdxVar, vzq0Var4, idn0Var5, ga80Var4, qim0Var5, false, null, j2iVarR, x340Var, i24, 384, 3072);
                    yfVar4 = yfVar5;
                    ga80Var2 = ga80Var4;
                    vu30Var3 = vu30Var8;
                    vu30Var4 = vu30Var9;
                    vzq0Var2 = vzq0Var4;
                    maxVar2 = maxVar4;
                    qim0Var3 = qim0Var5;
                    idn0Var3 = idn0Var5;
                } else {
                    x340Var.b0();
                    maxVar2 = maxVar;
                    ga80Var2 = ga80Var;
                    vu30Var3 = vu30Var;
                    idn0Var3 = idn0Var2;
                    qim0Var3 = qim0Var2;
                    yfVar4 = yfVar3;
                    vzq0Var2 = vzq0Var;
                    vu30Var4 = vu30Var2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new edx(z, iu30Var, yfVar, qim0Var3, yfVar4, maxVar2, gdxVar, vzq0Var2, idn0Var3, ga80Var2, vu30Var3, vu30Var4, j2iVar, i, i2, i3);
                }
            }
            i4 |= 3072;
            qim0Var2 = qim0Var;
            if ((i & 24576) == 0) {
                if ((i3 & 16) == 0) {
                    yfVar3 = yfVar2;
                    if (x340Var.g(yfVar3)) {
                    }
                    i4 |= i17;
                } else {
                    yfVar3 = yfVar2;
                }
                i4 |= i17;
            } else {
                yfVar3 = yfVar2;
            }
            i5 = i3 & 32;
            if (i5 != 0) {
                i4 |= 196608;
            } else if ((i & 196608) == 0) {
                if (x340Var.g(maxVar)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i4 |= i6;
            }
            if ((i & 1572864) == 0) {
                if (x340Var.g(gdxVar)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i4 |= i15;
            }
            if ((i & 12582912) != 0) {
                i4 |= ((i3 & 128) == 0 || !x340Var.g(vzq0Var)) ? 4194304 : 8388608;
            }
            if ((i & 100663296) == 0) {
                if ((i3 & 256) == 0) {
                    idn0Var2 = idn0Var;
                    if (x340Var.g(idn0Var2)) {
                    }
                    i4 |= i18;
                } else {
                    idn0Var2 = idn0Var;
                }
                i4 |= i18;
            } else {
                idn0Var2 = idn0Var;
            }
            if ((i & 805306368) == 0) {
                i4 |= 268435456;
            }
            i7 = i3 & 1024;
            if (i7 != 0) {
                i8 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (x340Var.i(vu30Var)) {
                    i9 = 4;
                } else {
                    i9 = 2;
                }
                i8 = i2 | i9;
            } else {
                i8 = i2;
            }
            i10 = i3 & 2048;
            if (i10 != 0) {
                i8 |= 48;
            } else if ((i2 & 48) != 0) {
                if (x340Var.i(vu30Var2)) {
                    i11 = 32;
                } else {
                    i11 = 16;
                }
                i8 |= i11;
            }
            int i110 = i8;
            i12 = i4;
            if ((i12 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (x340Var.Y(i12 & 1, z2)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if ((i3 & 16) != 0) {
                        i13 = i12 & (-57345);
                        yfVar3 = yfVar;
                    } else {
                        i13 = i12;
                    }
                    if (i5 != 0) {
                        maxVar3 = jax.a;
                    } else {
                        maxVar3 = maxVar;
                    }
                    if ((i3 & 128) != 0) {
                        vzq0Var3 = gdxVar.a;
                        i13 &= -29360129;
                    } else {
                        vzq0Var3 = vzq0Var;
                    }
                    if ((i3 & 256) != 0) {
                        idn0VarY = zso1.Y(x340Var);
                        i13 &= -234881025;
                    } else {
                        idn0VarY = idn0Var2;
                    }
                    ga80 vchVar2 = new vch(vno1.o((hw61) yfVar.b, x340Var, 0));
                    int i25 = i13 & (-1879048193);
                    if (i7 != 0) {
                        vu30Var5 = null;
                    } else {
                        vu30Var5 = vu30Var;
                    }
                    if (i10 == 0) {
                    }
                    idn0Var4 = idn0VarY;
                    i14 = i25;
                    ga80Var3 = vchVar2;
                    vu30Var7 = vu30Var5;
                } else {
                    if (i16 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if ((i3 & 16) != 0) {
                        i13 = i12 & (-57345);
                        yfVar3 = yfVar;
                    } else {
                        i13 = i12;
                    }
                    if (i5 != 0) {
                        maxVar3 = jax.a;
                    } else {
                        maxVar3 = maxVar;
                    }
                    if ((i3 & 128) != 0) {
                        vzq0Var3 = gdxVar.a;
                        i13 &= -29360129;
                    } else {
                        vzq0Var3 = vzq0Var;
                    }
                    if ((i3 & 256) != 0) {
                        idn0VarY = zso1.Y(x340Var);
                        i13 &= -234881025;
                    } else {
                        idn0VarY = idn0Var2;
                    }
                    ga80 vchVar3 = new vch(vno1.o((hw61) yfVar.b, x340Var, 0));
                    int i26 = i13 & (-1879048193);
                    if (i7 != 0) {
                        vu30Var5 = null;
                    } else {
                        vu30Var5 = vu30Var;
                    }
                    if (i10 == 0) {
                    }
                    idn0Var4 = idn0VarY;
                    i14 = i26;
                    ga80Var3 = vchVar3;
                    vu30Var7 = vu30Var5;
                }
                x340Var.s();
                int i27 = i14;
                qim0 qim0Var6 = qim0Var4;
                vu30 vu30Var10 = vu30Var7;
                vu30 vu30Var11 = vu30Var6;
                j2i j2iVarR2 = apo.r(-517975481, new n7m(gdxVar, vu30Var7, j2iVar, vu30Var6, (byte) 28), x340Var);
                int i28 = i27 >> 3;
                int i29 = ((i27 << 18) & 1879048192) | (i27 & 1022) | (i28 & 7168) | (57344 & i28) | (458752 & i28) | (3670016 & i28) | (i28 & 29360128);
                vzq0 vzq0Var5 = vzq0Var3;
                ga80 ga80Var5 = ga80Var3;
                idn0 idn0Var6 = idn0Var4;
                max maxVar5 = maxVar3;
                yf yfVar6 = yfVar3;
                boo1.b(z, iu30Var, yfVar, yfVar6, maxVar5, gdxVar, vzq0Var5, idn0Var6, ga80Var5, qim0Var6, false, null, j2iVarR2, x340Var, i29, 384, 3072);
                yfVar4 = yfVar6;
                ga80Var2 = ga80Var5;
                vu30Var3 = vu30Var10;
                vu30Var4 = vu30Var11;
                vzq0Var2 = vzq0Var5;
                maxVar2 = maxVar5;
                qim0Var3 = qim0Var6;
                idn0Var3 = idn0Var6;
            } else {
                x340Var.b0();
                maxVar2 = maxVar;
                ga80Var2 = ga80Var;
                vu30Var3 = vu30Var;
                idn0Var3 = idn0Var2;
                qim0Var3 = qim0Var2;
                yfVar4 = yfVar3;
                vzq0Var2 = vzq0Var;
                vu30Var4 = vu30Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new edx(z, iu30Var, yfVar, qim0Var3, yfVar4, maxVar2, gdxVar, vzq0Var2, idn0Var3, ga80Var2, vu30Var3, vu30Var4, j2iVar, i, i2, i3);
            }
        }

        public static final void e(gdx gdxVar, vu30 vu30Var, vu30 vu30Var2, vu30 vu30Var3, b0k b0kVar, int i) {
            int i2;
            boolean z;
            llj lljVar;
            Function0 function0;
            boolean z2;
            gra graVar = een.d;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(842252781);
            j06 j06Var = x340Var.a;
            int i3 = i | (x340Var.g(gdxVar) ? 4 : 2) | (x340Var.i(vu30Var) ? 32 : 16) | (x340Var.i(vu30Var2) ? 256 : 128) | (x340Var.i(vu30Var3) ? 2048 : 1024);
            if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
                jw31 jw31VarA = ew31.a(new d36(gdxVar.e, true, new um5(false)), een.N0, x340Var, 48);
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
                boolean z3 = x340Var.S;
                Function0 function1 = hmb0.t1;
                if (z3) {
                    x340Var.l(function1);
                } else {
                    x340Var.v0();
                }
                llj lljVar2 = y580.O0;
                nko1.H(jw31VarA, x340Var, lljVar2);
                llj lljVar3 = y580.N0;
                nko1.H(xos0VarM, x340Var, lljVar3);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar4 = y580.R0;
                nko1.H(numValueOf, x340Var, lljVar4);
                nko1.F(x340Var);
                llj lljVar5 = y580.Y;
                nko1.H(qim0VarE, x340Var, lljVar5);
                if (vu30Var != null) {
                    x340Var.i0(-2024764730);
                    float f = gdxVar.d;
                    function0 = function1;
                    qim0 qim0VarU = u291.u(nim0Var, 0.0f, 0.0f, f, f, 3);
                    gfh0 gfh0VarC = t1c.c(graVar, false);
                    int iHashCode2 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM2 = x340Var.m();
                    qim0 qim0VarE2 = zr7.E(x340Var, qim0VarU);
                    x340Var.m0();
                    i2 = i3;
                    if (x340Var.S) {
                        x340Var.l(function0);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC, x340Var, lljVar2);
                    nko1.H(xos0VarM2, x340Var, lljVar3);
                    lljVar = lljVar4;
                    x0d.q(iHashCode2, x340Var, lljVar, x340Var);
                    nko1.H(qim0VarE2, x340Var, lljVar5);
                    z = false;
                    us71.k((i2 >> 3) & 14, vu30Var, x340Var, true, false);
                } else {
                    i2 = i3;
                    z = false;
                    lljVar = lljVar4;
                    function0 = function1;
                    x340Var.i0(-2024600399);
                    x340Var.r(false);
                }
                wnb0 wnb0Var = new wnb0(1.0f, z);
                gfh0 gfh0VarC2 = t1c.c(graVar, z);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, wnb0Var);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(function0);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC2, x340Var, lljVar2);
                nko1.H(xos0VarM3, x340Var, lljVar3);
                x0d.q(iHashCode3, x340Var, lljVar, x340Var);
                nko1.H(qim0VarE3, x340Var, lljVar5);
                us71.j((i2 >> 6) & 14, vu30Var2, x340Var, true);
                if (vu30Var3 != null) {
                    x340Var.i0(-2024491000);
                    float f2 = gdxVar.d;
                    qim0 qim0VarU2 = u291.u(nim0Var, 0.0f, 0.0f, f2, f2, 3);
                    gfh0 gfh0VarC3 = t1c.c(graVar, false);
                    int iHashCode4 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM4 = x340Var.m();
                    qim0 qim0VarE4 = zr7.E(x340Var, qim0VarU2);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(function0);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC3, x340Var, lljVar2);
                    nko1.H(xos0VarM4, x340Var, lljVar3);
                    x0d.q(iHashCode4, x340Var, lljVar, x340Var);
                    nko1.H(qim0VarE4, x340Var, lljVar5);
                    z2 = true;
                    us71.k((i2 >> 9) & 14, vu30Var3, x340Var, true, false);
                } else {
                    z2 = true;
                    x340Var.i0(-2024328591);
                    x340Var.r(false);
                }
                x340Var.r(z2);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new n7m(i, gdxVar, vu30Var, vu30Var2, vu30Var3, (byte) 29);
            }
        }

        /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:19:0x0037  */
        /* JADX WARN: Code duplicated, block: B:21:0x003c  */
        /* JADX WARN: Code duplicated, block: B:23:0x0040  */
        /* JADX WARN: Code duplicated, block: B:25:0x0048  */
        /* JADX WARN: Code duplicated, block: B:26:0x004b  */
        /* JADX WARN: Code duplicated, block: B:30:0x0052  */
        /* JADX WARN: Code duplicated, block: B:32:0x005a  */
        /* JADX WARN: Code duplicated, block: B:33:0x005d  */
        /* JADX WARN: Code duplicated, block: B:37:0x0068  */
        /* JADX WARN: Code duplicated, block: B:39:0x006f  */
        /* JADX WARN: Code duplicated, block: B:41:0x0074  */
        /* JADX WARN: Code duplicated, block: B:43:0x007c  */
        /* JADX WARN: Code duplicated, block: B:44:0x007f  */
        /* JADX WARN: Code duplicated, block: B:48:0x0088  */
        /* JADX WARN: Code duplicated, block: B:50:0x008c  */
        /* JADX WARN: Code duplicated, block: B:52:0x008f  */
        /* JADX WARN: Code duplicated, block: B:54:0x0097  */
        /* JADX WARN: Code duplicated, block: B:55:0x009a  */
        /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
        /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
        /* JADX WARN: Code duplicated, block: B:62:0x00ad  */
        /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
        /* JADX WARN: Code duplicated, block: B:67:0x00bc  */
        /* JADX WARN: Code duplicated, block: B:68:0x00be  */
        /* JADX WARN: Code duplicated, block: B:71:0x00c7  */
        /* JADX WARN: Code duplicated, block: B:73:0x00d1  */
        /* JADX WARN: Code duplicated, block: B:80:0x00ed A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:81:0x00ef  */
        /* JADX WARN: Code duplicated, block: B:82:0x00f2  */
        /* JADX WARN: Code duplicated, block: B:84:0x00f5  */
        /* JADX WARN: Code duplicated, block: B:87:0x00fc  */
        /* JADX WARN: Code duplicated, block: B:90:0x010c  */
        /* JADX WARN: Code duplicated, block: B:93:0x0111  */
        /* JADX WARN: Code duplicated, block: B:94:0x011a  */
        /* JADX WARN: Code duplicated, block: B:96:0x015f  */
        /* JADX WARN: Code duplicated, block: B:99:0x0171  */
        public static final void f(gbx gbxVar, qim0 qim0Var, max maxVar, gdx gdxVar, idn0 idn0Var, vu30 vu30Var, vu30 vu30Var2, vu30 vu30Var3, b0k b0kVar, int i, int i2) {
            qim0 qim0Var2;
            int i3;
            max maxVar2;
            int i4;
            gdx gdxVarR;
            int i5;
            int i6;
            int i7;
            vu30 vu30Var4;
            int i8;
            int i9;
            vu30 vu30Var5;
            int i10;
            boolean z;
            b0k b0kVar2;
            qim0 qim0Var3;
            max maxVar3;
            gdx gdxVar2;
            vu30 vu30Var6;
            idn0 idn0Var2;
            vu30 vu30Var7;
            h311 h311VarV;
            qim0 qim0Var4;
            idn0 idn0VarY;
            int i11;
            vu30 vu30Var8;
            idn0 idn0Var3;
            max maxVar4;
            gdx gdxVar3;
            vu30 vu30Var9;
            qim0 qim0Var5;
            int i12;
            int i13;
            b0k b0kVar3 = (x340) b0kVar;
            b0kVar3.k0(-949073742);
            int i14 = (b0kVar3.g(gbxVar) ? 4 : 2) | i;
            int i15 = i2 & 2;
            if (i15 == 0) {
                if ((i & 48) == 0) {
                    qim0Var2 = qim0Var;
                    i14 |= b0kVar3.g(qim0Var2) ? 32 : 16;
                }
                i3 = i2 & 4;
                if (i3 != 0) {
                    if ((i & 384) == 0) {
                        maxVar2 = maxVar;
                        if (b0kVar3.g(maxVar2)) {
                            i4 = 256;
                        } else {
                            i4 = 128;
                        }
                        i14 |= i4;
                    }
                    if ((i2 & 8) == 0) {
                        gdxVarR = gdxVar;
                        int i16 = b0kVar3.g(gdxVarR) ? 2048 : 1024;
                        i5 = i14 | i16;
                        i6 = i5 | 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            if ((196608 & i) == 0) {
                                vu30Var4 = vu30Var;
                                if (b0kVar3.i(vu30Var4)) {
                                    i8 = 131072;
                                } else {
                                    i8 = 65536;
                                }
                                i6 |= i8;
                            }
                            i9 = i2 & 64;
                            if (i9 != 0) {
                                if ((1572864 & i) == 0) {
                                    vu30Var5 = vu30Var2;
                                    if (b0kVar3.i(vu30Var5)) {
                                        i10 = 1048576;
                                    } else {
                                        i10 = 524288;
                                    }
                                    i6 |= i10;
                                }
                                if ((12582912 & i) != 0) {
                                    if (b0kVar3.i(vu30Var3)) {
                                        i13 = 8388608;
                                    } else {
                                        i13 = 4194304;
                                    }
                                    i6 |= i13;
                                }
                                if ((4793491 & i6) != 4793490) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (b0kVar3.Y(i6 & 1, z)) {
                                    b0kVar3.d0();
                                    if ((i & 1) != 0 || b0kVar3.E()) {
                                        if (i15 != 0) {
                                            qim0Var4 = nim0.a;
                                        } else {
                                            qim0Var4 = qim0Var2;
                                        }
                                        if (i3 != 0) {
                                            maxVar2 = jax.a;
                                        }
                                        if ((i2 & 8) != 0) {
                                            i6 &= -7169;
                                            gdxVarR = yla.r(b0kVar3);
                                        }
                                        idn0VarY = zso1.Y(b0kVar3);
                                        i11 = i6 & (-57345);
                                        if (i7 != 0) {
                                            vu30Var4 = null;
                                        }
                                        vu30Var8 = vu30Var4;
                                        if (i9 != 0) {
                                            qim0Var5 = qim0Var4;
                                            idn0Var3 = idn0VarY;
                                            i12 = i11;
                                            maxVar4 = maxVar2;
                                            gdxVar3 = gdxVarR;
                                            vu30Var9 = null;
                                        } else {
                                            idn0Var3 = idn0VarY;
                                            maxVar4 = maxVar2;
                                            gdxVar3 = gdxVarR;
                                            vu30Var9 = vu30Var5;
                                            qim0Var5 = qim0Var4;
                                            i12 = i11;
                                        }
                                    } else {
                                        b0kVar3.b0();
                                        if ((i2 & 8) != 0) {
                                            i6 &= -7169;
                                        }
                                        i12 = i6 & (-57345);
                                        idn0Var3 = idn0Var;
                                        vu30Var8 = vu30Var4;
                                        maxVar4 = maxVar2;
                                        gdxVar3 = gdxVarR;
                                        vu30Var9 = vu30Var5;
                                        qim0Var5 = qim0Var2;
                                    }
                                    b0kVar3.s();
                                    int i17 = i12 << 6;
                                    b0kVar2 = b0kVar3;
                                    c(gbxVar, new idx(19), qim0Var5, maxVar4, gdxVar3, null, idn0Var3, null, vu30Var8, vu30Var9, vu30Var3, b0kVar2, (i12 & 14) | ((i12 << 3) & 896) | (57344 & i17) | (i17 & 458752) | ((i12 << 12) & 1879048192), (i12 >> 18) & 126, 328);
                                    qim0Var3 = qim0Var5;
                                    maxVar3 = maxVar4;
                                    gdxVar2 = gdxVar3;
                                    idn0Var2 = idn0Var3;
                                    vu30Var7 = vu30Var8;
                                    vu30Var6 = vu30Var9;
                                } else {
                                    b0kVar2 = b0kVar3;
                                    b0kVar2.b0();
                                    qim0Var3 = qim0Var2;
                                    maxVar3 = maxVar2;
                                    gdxVar2 = gdxVarR;
                                    vu30Var6 = vu30Var5;
                                    idn0Var2 = idn0Var;
                                    vu30Var7 = vu30Var4;
                                }
                                h311VarV = b0kVar2.v();
                                if (h311VarV != null) {
                                    h311VarV.d = new fdx(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var7, vu30Var6, vu30Var3, i, i2, (byte) 0);
                                }
                            }
                            i6 |= 1572864;
                            vu30Var5 = vu30Var2;
                            if ((12582912 & i) != 0) {
                                if (b0kVar3.i(vu30Var3)) {
                                    i13 = 8388608;
                                } else {
                                    i13 = 4194304;
                                }
                                i6 |= i13;
                            }
                            if ((4793491 & i6) != 4793490) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (b0kVar3.Y(i6 & 1, z)) {
                                b0kVar3.d0();
                                if ((i & 1) != 0) {
                                    if (i15 != 0) {
                                        qim0Var4 = nim0.a;
                                    } else {
                                        qim0Var4 = qim0Var2;
                                    }
                                    if (i3 != 0) {
                                        maxVar2 = jax.a;
                                    }
                                    if ((i2 & 8) != 0) {
                                        i6 &= -7169;
                                        gdxVarR = yla.r(b0kVar3);
                                    }
                                    idn0VarY = zso1.Y(b0kVar3);
                                    i11 = i6 & (-57345);
                                    if (i7 != 0) {
                                        vu30Var4 = null;
                                    }
                                    vu30Var8 = vu30Var4;
                                    if (i9 != 0) {
                                        qim0Var5 = qim0Var4;
                                        idn0Var3 = idn0VarY;
                                        i12 = i11;
                                        maxVar4 = maxVar2;
                                        gdxVar3 = gdxVarR;
                                        vu30Var9 = null;
                                    } else {
                                        idn0Var3 = idn0VarY;
                                        maxVar4 = maxVar2;
                                        gdxVar3 = gdxVarR;
                                        vu30Var9 = vu30Var5;
                                        qim0Var5 = qim0Var4;
                                        i12 = i11;
                                    }
                                } else {
                                    if (i15 != 0) {
                                        qim0Var4 = nim0.a;
                                    } else {
                                        qim0Var4 = qim0Var2;
                                    }
                                    if (i3 != 0) {
                                        maxVar2 = jax.a;
                                    }
                                    if ((i2 & 8) != 0) {
                                        i6 &= -7169;
                                        gdxVarR = yla.r(b0kVar3);
                                    }
                                    idn0VarY = zso1.Y(b0kVar3);
                                    i11 = i6 & (-57345);
                                    if (i7 != 0) {
                                        vu30Var4 = null;
                                    }
                                    vu30Var8 = vu30Var4;
                                    if (i9 != 0) {
                                        qim0Var5 = qim0Var4;
                                        idn0Var3 = idn0VarY;
                                        i12 = i11;
                                        maxVar4 = maxVar2;
                                        gdxVar3 = gdxVarR;
                                        vu30Var9 = null;
                                    } else {
                                        idn0Var3 = idn0VarY;
                                        maxVar4 = maxVar2;
                                        gdxVar3 = gdxVarR;
                                        vu30Var9 = vu30Var5;
                                        qim0Var5 = qim0Var4;
                                        i12 = i11;
                                    }
                                }
                                b0kVar3.s();
                                int i18 = i12 << 6;
                                b0kVar2 = b0kVar3;
                                c(gbxVar, new idx(19), qim0Var5, maxVar4, gdxVar3, null, idn0Var3, null, vu30Var8, vu30Var9, vu30Var3, b0kVar2, (i12 & 14) | ((i12 << 3) & 896) | (57344 & i18) | (i18 & 458752) | ((i12 << 12) & 1879048192), (i12 >> 18) & 126, 328);
                                qim0Var3 = qim0Var5;
                                maxVar3 = maxVar4;
                                gdxVar2 = gdxVar3;
                                idn0Var2 = idn0Var3;
                                vu30Var7 = vu30Var8;
                                vu30Var6 = vu30Var9;
                            } else {
                                b0kVar2 = b0kVar3;
                                b0kVar2.b0();
                                qim0Var3 = qim0Var2;
                                maxVar3 = maxVar2;
                                gdxVar2 = gdxVarR;
                                vu30Var6 = vu30Var5;
                                idn0Var2 = idn0Var;
                                vu30Var7 = vu30Var4;
                            }
                            h311VarV = b0kVar2.v();
                            if (h311VarV != null) {
                                h311VarV.d = new fdx(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var7, vu30Var6, vu30Var3, i, i2, (byte) 0);
                            }
                        }
                        i6 = 204800 | i5;
                        vu30Var4 = vu30Var;
                        i9 = i2 & 64;
                        if (i9 != 0) {
                            if ((1572864 & i) == 0) {
                                vu30Var5 = vu30Var2;
                                if (b0kVar3.i(vu30Var5)) {
                                    i10 = 1048576;
                                } else {
                                    i10 = 524288;
                                }
                                i6 |= i10;
                            }
                            if ((12582912 & i) != 0) {
                                if (b0kVar3.i(vu30Var3)) {
                                    i13 = 8388608;
                                } else {
                                    i13 = 4194304;
                                }
                                i6 |= i13;
                            }
                            if ((4793491 & i6) != 4793490) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (b0kVar3.Y(i6 & 1, z)) {
                                b0kVar3.d0();
                                if ((i & 1) != 0) {
                                    if (i15 != 0) {
                                        qim0Var4 = nim0.a;
                                    } else {
                                        qim0Var4 = qim0Var2;
                                    }
                                    if (i3 != 0) {
                                        maxVar2 = jax.a;
                                    }
                                    if ((i2 & 8) != 0) {
                                        i6 &= -7169;
                                        gdxVarR = yla.r(b0kVar3);
                                    }
                                    idn0VarY = zso1.Y(b0kVar3);
                                    i11 = i6 & (-57345);
                                    if (i7 != 0) {
                                        vu30Var4 = null;
                                    }
                                    vu30Var8 = vu30Var4;
                                    if (i9 != 0) {
                                        qim0Var5 = qim0Var4;
                                        idn0Var3 = idn0VarY;
                                        i12 = i11;
                                        maxVar4 = maxVar2;
                                        gdxVar3 = gdxVarR;
                                        vu30Var9 = null;
                                    } else {
                                        idn0Var3 = idn0VarY;
                                        maxVar4 = maxVar2;
                                        gdxVar3 = gdxVarR;
                                        vu30Var9 = vu30Var5;
                                        qim0Var5 = qim0Var4;
                                        i12 = i11;
                                    }
                                } else {
                                    if (i15 != 0) {
                                        qim0Var4 = nim0.a;
                                    } else {
                                        qim0Var4 = qim0Var2;
                                    }
                                    if (i3 != 0) {
                                        maxVar2 = jax.a;
                                    }
                                    if ((i2 & 8) != 0) {
                                        i6 &= -7169;
                                        gdxVarR = yla.r(b0kVar3);
                                    }
                                    idn0VarY = zso1.Y(b0kVar3);
                                    i11 = i6 & (-57345);
                                    if (i7 != 0) {
                                        vu30Var4 = null;
                                    }
                                    vu30Var8 = vu30Var4;
                                    if (i9 != 0) {
                                        qim0Var5 = qim0Var4;
                                        idn0Var3 = idn0VarY;
                                        i12 = i11;
                                        maxVar4 = maxVar2;
                                        gdxVar3 = gdxVarR;
                                        vu30Var9 = null;
                                    } else {
                                        idn0Var3 = idn0VarY;
                                        maxVar4 = maxVar2;
                                        gdxVar3 = gdxVarR;
                                        vu30Var9 = vu30Var5;
                                        qim0Var5 = qim0Var4;
                                        i12 = i11;
                                    }
                                }
                                b0kVar3.s();
                                int i19 = i12 << 6;
                                b0kVar2 = b0kVar3;
                                c(gbxVar, new idx(19), qim0Var5, maxVar4, gdxVar3, null, idn0Var3, null, vu30Var8, vu30Var9, vu30Var3, b0kVar2, (i12 & 14) | ((i12 << 3) & 896) | (57344 & i19) | (i19 & 458752) | ((i12 << 12) & 1879048192), (i12 >> 18) & 126, 328);
                                qim0Var3 = qim0Var5;
                                maxVar3 = maxVar4;
                                gdxVar2 = gdxVar3;
                                idn0Var2 = idn0Var3;
                                vu30Var7 = vu30Var8;
                                vu30Var6 = vu30Var9;
                            } else {
                                b0kVar2 = b0kVar3;
                                b0kVar2.b0();
                                qim0Var3 = qim0Var2;
                                maxVar3 = maxVar2;
                                gdxVar2 = gdxVarR;
                                vu30Var6 = vu30Var5;
                                idn0Var2 = idn0Var;
                                vu30Var7 = vu30Var4;
                            }
                            h311VarV = b0kVar2.v();
                            if (h311VarV != null) {
                                h311VarV.d = new fdx(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var7, vu30Var6, vu30Var3, i, i2, (byte) 0);
                            }
                        }
                        i6 |= 1572864;
                        vu30Var5 = vu30Var2;
                        if ((12582912 & i) != 0) {
                            if (b0kVar3.i(vu30Var3)) {
                                i13 = 8388608;
                            } else {
                                i13 = 4194304;
                            }
                            i6 |= i13;
                        }
                        if ((4793491 & i6) != 4793490) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (b0kVar3.Y(i6 & 1, z)) {
                            b0kVar3.d0();
                            if ((i & 1) != 0) {
                                if (i15 != 0) {
                                    qim0Var4 = nim0.a;
                                } else {
                                    qim0Var4 = qim0Var2;
                                }
                                if (i3 != 0) {
                                    maxVar2 = jax.a;
                                }
                                if ((i2 & 8) != 0) {
                                    i6 &= -7169;
                                    gdxVarR = yla.r(b0kVar3);
                                }
                                idn0VarY = zso1.Y(b0kVar3);
                                i11 = i6 & (-57345);
                                if (i7 != 0) {
                                    vu30Var4 = null;
                                }
                                vu30Var8 = vu30Var4;
                                if (i9 != 0) {
                                    qim0Var5 = qim0Var4;
                                    idn0Var3 = idn0VarY;
                                    i12 = i11;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var9 = null;
                                } else {
                                    idn0Var3 = idn0VarY;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var9 = vu30Var5;
                                    qim0Var5 = qim0Var4;
                                    i12 = i11;
                                }
                            } else {
                                if (i15 != 0) {
                                    qim0Var4 = nim0.a;
                                } else {
                                    qim0Var4 = qim0Var2;
                                }
                                if (i3 != 0) {
                                    maxVar2 = jax.a;
                                }
                                if ((i2 & 8) != 0) {
                                    i6 &= -7169;
                                    gdxVarR = yla.r(b0kVar3);
                                }
                                idn0VarY = zso1.Y(b0kVar3);
                                i11 = i6 & (-57345);
                                if (i7 != 0) {
                                    vu30Var4 = null;
                                }
                                vu30Var8 = vu30Var4;
                                if (i9 != 0) {
                                    qim0Var5 = qim0Var4;
                                    idn0Var3 = idn0VarY;
                                    i12 = i11;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var9 = null;
                                } else {
                                    idn0Var3 = idn0VarY;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var9 = vu30Var5;
                                    qim0Var5 = qim0Var4;
                                    i12 = i11;
                                }
                            }
                            b0kVar3.s();
                            int i110 = i12 << 6;
                            b0kVar2 = b0kVar3;
                            c(gbxVar, new idx(19), qim0Var5, maxVar4, gdxVar3, null, idn0Var3, null, vu30Var8, vu30Var9, vu30Var3, b0kVar2, (i12 & 14) | ((i12 << 3) & 896) | (57344 & i110) | (i110 & 458752) | ((i12 << 12) & 1879048192), (i12 >> 18) & 126, 328);
                            qim0Var3 = qim0Var5;
                            maxVar3 = maxVar4;
                            gdxVar2 = gdxVar3;
                            idn0Var2 = idn0Var3;
                            vu30Var7 = vu30Var8;
                            vu30Var6 = vu30Var9;
                        } else {
                            b0kVar2 = b0kVar3;
                            b0kVar2.b0();
                            qim0Var3 = qim0Var2;
                            maxVar3 = maxVar2;
                            gdxVar2 = gdxVarR;
                            vu30Var6 = vu30Var5;
                            idn0Var2 = idn0Var;
                            vu30Var7 = vu30Var4;
                        }
                        h311VarV = b0kVar2.v();
                        if (h311VarV != null) {
                            h311VarV.d = new fdx(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var7, vu30Var6, vu30Var3, i, i2, (byte) 0);
                        }
                    }
                    gdxVarR = gdxVar;
                    i5 = i14 | i16;
                    i6 = i5 | 8192;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                        if ((196608 & i) == 0) {
                            vu30Var4 = vu30Var;
                            if (b0kVar3.i(vu30Var4)) {
                                i8 = 131072;
                            } else {
                                i8 = 65536;
                            }
                            i6 |= i8;
                        }
                        i9 = i2 & 64;
                        if (i9 != 0) {
                            if ((1572864 & i) == 0) {
                                vu30Var5 = vu30Var2;
                                if (b0kVar3.i(vu30Var5)) {
                                    i10 = 1048576;
                                } else {
                                    i10 = 524288;
                                }
                                i6 |= i10;
                            }
                            if ((12582912 & i) != 0) {
                                if (b0kVar3.i(vu30Var3)) {
                                    i13 = 8388608;
                                } else {
                                    i13 = 4194304;
                                }
                                i6 |= i13;
                            }
                            if ((4793491 & i6) != 4793490) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (b0kVar3.Y(i6 & 1, z)) {
                                b0kVar3.d0();
                                if ((i & 1) != 0) {
                                    if (i15 != 0) {
                                        qim0Var4 = nim0.a;
                                    } else {
                                        qim0Var4 = qim0Var2;
                                    }
                                    if (i3 != 0) {
                                        maxVar2 = jax.a;
                                    }
                                    if ((i2 & 8) != 0) {
                                        i6 &= -7169;
                                        gdxVarR = yla.r(b0kVar3);
                                    }
                                    idn0VarY = zso1.Y(b0kVar3);
                                    i11 = i6 & (-57345);
                                    if (i7 != 0) {
                                        vu30Var4 = null;
                                    }
                                    vu30Var8 = vu30Var4;
                                    if (i9 != 0) {
                                        qim0Var5 = qim0Var4;
                                        idn0Var3 = idn0VarY;
                                        i12 = i11;
                                        maxVar4 = maxVar2;
                                        gdxVar3 = gdxVarR;
                                        vu30Var9 = null;
                                    } else {
                                        idn0Var3 = idn0VarY;
                                        maxVar4 = maxVar2;
                                        gdxVar3 = gdxVarR;
                                        vu30Var9 = vu30Var5;
                                        qim0Var5 = qim0Var4;
                                        i12 = i11;
                                    }
                                } else {
                                    if (i15 != 0) {
                                        qim0Var4 = nim0.a;
                                    } else {
                                        qim0Var4 = qim0Var2;
                                    }
                                    if (i3 != 0) {
                                        maxVar2 = jax.a;
                                    }
                                    if ((i2 & 8) != 0) {
                                        i6 &= -7169;
                                        gdxVarR = yla.r(b0kVar3);
                                    }
                                    idn0VarY = zso1.Y(b0kVar3);
                                    i11 = i6 & (-57345);
                                    if (i7 != 0) {
                                        vu30Var4 = null;
                                    }
                                    vu30Var8 = vu30Var4;
                                    if (i9 != 0) {
                                        qim0Var5 = qim0Var4;
                                        idn0Var3 = idn0VarY;
                                        i12 = i11;
                                        maxVar4 = maxVar2;
                                        gdxVar3 = gdxVarR;
                                        vu30Var9 = null;
                                    } else {
                                        idn0Var3 = idn0VarY;
                                        maxVar4 = maxVar2;
                                        gdxVar3 = gdxVarR;
                                        vu30Var9 = vu30Var5;
                                        qim0Var5 = qim0Var4;
                                        i12 = i11;
                                    }
                                }
                                b0kVar3.s();
                                int i111 = i12 << 6;
                                b0kVar2 = b0kVar3;
                                c(gbxVar, new idx(19), qim0Var5, maxVar4, gdxVar3, null, idn0Var3, null, vu30Var8, vu30Var9, vu30Var3, b0kVar2, (i12 & 14) | ((i12 << 3) & 896) | (57344 & i111) | (i111 & 458752) | ((i12 << 12) & 1879048192), (i12 >> 18) & 126, 328);
                                qim0Var3 = qim0Var5;
                                maxVar3 = maxVar4;
                                gdxVar2 = gdxVar3;
                                idn0Var2 = idn0Var3;
                                vu30Var7 = vu30Var8;
                                vu30Var6 = vu30Var9;
                            } else {
                                b0kVar2 = b0kVar3;
                                b0kVar2.b0();
                                qim0Var3 = qim0Var2;
                                maxVar3 = maxVar2;
                                gdxVar2 = gdxVarR;
                                vu30Var6 = vu30Var5;
                                idn0Var2 = idn0Var;
                                vu30Var7 = vu30Var4;
                            }
                            h311VarV = b0kVar2.v();
                            if (h311VarV != null) {
                                h311VarV.d = new fdx(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var7, vu30Var6, vu30Var3, i, i2, (byte) 0);
                            }
                        }
                        i6 |= 1572864;
                        vu30Var5 = vu30Var2;
                        if ((12582912 & i) != 0) {
                            if (b0kVar3.i(vu30Var3)) {
                                i13 = 8388608;
                            } else {
                                i13 = 4194304;
                            }
                            i6 |= i13;
                        }
                        if ((4793491 & i6) != 4793490) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (b0kVar3.Y(i6 & 1, z)) {
                            b0kVar3.d0();
                            if ((i & 1) != 0) {
                                if (i15 != 0) {
                                    qim0Var4 = nim0.a;
                                } else {
                                    qim0Var4 = qim0Var2;
                                }
                                if (i3 != 0) {
                                    maxVar2 = jax.a;
                                }
                                if ((i2 & 8) != 0) {
                                    i6 &= -7169;
                                    gdxVarR = yla.r(b0kVar3);
                                }
                                idn0VarY = zso1.Y(b0kVar3);
                                i11 = i6 & (-57345);
                                if (i7 != 0) {
                                    vu30Var4 = null;
                                }
                                vu30Var8 = vu30Var4;
                                if (i9 != 0) {
                                    qim0Var5 = qim0Var4;
                                    idn0Var3 = idn0VarY;
                                    i12 = i11;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var9 = null;
                                } else {
                                    idn0Var3 = idn0VarY;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var9 = vu30Var5;
                                    qim0Var5 = qim0Var4;
                                    i12 = i11;
                                }
                            } else {
                                if (i15 != 0) {
                                    qim0Var4 = nim0.a;
                                } else {
                                    qim0Var4 = qim0Var2;
                                }
                                if (i3 != 0) {
                                    maxVar2 = jax.a;
                                }
                                if ((i2 & 8) != 0) {
                                    i6 &= -7169;
                                    gdxVarR = yla.r(b0kVar3);
                                }
                                idn0VarY = zso1.Y(b0kVar3);
                                i11 = i6 & (-57345);
                                if (i7 != 0) {
                                    vu30Var4 = null;
                                }
                                vu30Var8 = vu30Var4;
                                if (i9 != 0) {
                                    qim0Var5 = qim0Var4;
                                    idn0Var3 = idn0VarY;
                                    i12 = i11;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var9 = null;
                                } else {
                                    idn0Var3 = idn0VarY;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var9 = vu30Var5;
                                    qim0Var5 = qim0Var4;
                                    i12 = i11;
                                }
                            }
                            b0kVar3.s();
                            int i112 = i12 << 6;
                            b0kVar2 = b0kVar3;
                            c(gbxVar, new idx(19), qim0Var5, maxVar4, gdxVar3, null, idn0Var3, null, vu30Var8, vu30Var9, vu30Var3, b0kVar2, (i12 & 14) | ((i12 << 3) & 896) | (57344 & i112) | (i112 & 458752) | ((i12 << 12) & 1879048192), (i12 >> 18) & 126, 328);
                            qim0Var3 = qim0Var5;
                            maxVar3 = maxVar4;
                            gdxVar2 = gdxVar3;
                            idn0Var2 = idn0Var3;
                            vu30Var7 = vu30Var8;
                            vu30Var6 = vu30Var9;
                        } else {
                            b0kVar2 = b0kVar3;
                            b0kVar2.b0();
                            qim0Var3 = qim0Var2;
                            maxVar3 = maxVar2;
                            gdxVar2 = gdxVarR;
                            vu30Var6 = vu30Var5;
                            idn0Var2 = idn0Var;
                            vu30Var7 = vu30Var4;
                        }
                        h311VarV = b0kVar2.v();
                        if (h311VarV != null) {
                            h311VarV.d = new fdx(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var7, vu30Var6, vu30Var3, i, i2, (byte) 0);
                        }
                    }
                    i6 = 204800 | i5;
                    vu30Var4 = vu30Var;
                    i9 = i2 & 64;
                    if (i9 != 0) {
                        if ((1572864 & i) == 0) {
                            vu30Var5 = vu30Var2;
                            if (b0kVar3.i(vu30Var5)) {
                                i10 = 1048576;
                            } else {
                                i10 = 524288;
                            }
                            i6 |= i10;
                        }
                        if ((12582912 & i) != 0) {
                            if (b0kVar3.i(vu30Var3)) {
                                i13 = 8388608;
                            } else {
                                i13 = 4194304;
                            }
                            i6 |= i13;
                        }
                        if ((4793491 & i6) != 4793490) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (b0kVar3.Y(i6 & 1, z)) {
                            b0kVar3.d0();
                            if ((i & 1) != 0) {
                                if (i15 != 0) {
                                    qim0Var4 = nim0.a;
                                } else {
                                    qim0Var4 = qim0Var2;
                                }
                                if (i3 != 0) {
                                    maxVar2 = jax.a;
                                }
                                if ((i2 & 8) != 0) {
                                    i6 &= -7169;
                                    gdxVarR = yla.r(b0kVar3);
                                }
                                idn0VarY = zso1.Y(b0kVar3);
                                i11 = i6 & (-57345);
                                if (i7 != 0) {
                                    vu30Var4 = null;
                                }
                                vu30Var8 = vu30Var4;
                                if (i9 != 0) {
                                    qim0Var5 = qim0Var4;
                                    idn0Var3 = idn0VarY;
                                    i12 = i11;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var9 = null;
                                } else {
                                    idn0Var3 = idn0VarY;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var9 = vu30Var5;
                                    qim0Var5 = qim0Var4;
                                    i12 = i11;
                                }
                            } else {
                                if (i15 != 0) {
                                    qim0Var4 = nim0.a;
                                } else {
                                    qim0Var4 = qim0Var2;
                                }
                                if (i3 != 0) {
                                    maxVar2 = jax.a;
                                }
                                if ((i2 & 8) != 0) {
                                    i6 &= -7169;
                                    gdxVarR = yla.r(b0kVar3);
                                }
                                idn0VarY = zso1.Y(b0kVar3);
                                i11 = i6 & (-57345);
                                if (i7 != 0) {
                                    vu30Var4 = null;
                                }
                                vu30Var8 = vu30Var4;
                                if (i9 != 0) {
                                    qim0Var5 = qim0Var4;
                                    idn0Var3 = idn0VarY;
                                    i12 = i11;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var9 = null;
                                } else {
                                    idn0Var3 = idn0VarY;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var9 = vu30Var5;
                                    qim0Var5 = qim0Var4;
                                    i12 = i11;
                                }
                            }
                            b0kVar3.s();
                            int i113 = i12 << 6;
                            b0kVar2 = b0kVar3;
                            c(gbxVar, new idx(19), qim0Var5, maxVar4, gdxVar3, null, idn0Var3, null, vu30Var8, vu30Var9, vu30Var3, b0kVar2, (i12 & 14) | ((i12 << 3) & 896) | (57344 & i113) | (i113 & 458752) | ((i12 << 12) & 1879048192), (i12 >> 18) & 126, 328);
                            qim0Var3 = qim0Var5;
                            maxVar3 = maxVar4;
                            gdxVar2 = gdxVar3;
                            idn0Var2 = idn0Var3;
                            vu30Var7 = vu30Var8;
                            vu30Var6 = vu30Var9;
                        } else {
                            b0kVar2 = b0kVar3;
                            b0kVar2.b0();
                            qim0Var3 = qim0Var2;
                            maxVar3 = maxVar2;
                            gdxVar2 = gdxVarR;
                            vu30Var6 = vu30Var5;
                            idn0Var2 = idn0Var;
                            vu30Var7 = vu30Var4;
                        }
                        h311VarV = b0kVar2.v();
                        if (h311VarV != null) {
                            h311VarV.d = new fdx(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var7, vu30Var6, vu30Var3, i, i2, (byte) 0);
                        }
                    }
                    i6 |= 1572864;
                    vu30Var5 = vu30Var2;
                    if ((12582912 & i) != 0) {
                        if (b0kVar3.i(vu30Var3)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i6 |= i13;
                    }
                    if ((4793491 & i6) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (b0kVar3.Y(i6 & 1, z)) {
                        b0kVar3.d0();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i3 != 0) {
                                maxVar2 = jax.a;
                            }
                            if ((i2 & 8) != 0) {
                                i6 &= -7169;
                                gdxVarR = yla.r(b0kVar3);
                            }
                            idn0VarY = zso1.Y(b0kVar3);
                            i11 = i6 & (-57345);
                            if (i7 != 0) {
                                vu30Var4 = null;
                            }
                            vu30Var8 = vu30Var4;
                            if (i9 != 0) {
                                qim0Var5 = qim0Var4;
                                idn0Var3 = idn0VarY;
                                i12 = i11;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var9 = null;
                            } else {
                                idn0Var3 = idn0VarY;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var9 = vu30Var5;
                                qim0Var5 = qim0Var4;
                                i12 = i11;
                            }
                        } else {
                            if (i15 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i3 != 0) {
                                maxVar2 = jax.a;
                            }
                            if ((i2 & 8) != 0) {
                                i6 &= -7169;
                                gdxVarR = yla.r(b0kVar3);
                            }
                            idn0VarY = zso1.Y(b0kVar3);
                            i11 = i6 & (-57345);
                            if (i7 != 0) {
                                vu30Var4 = null;
                            }
                            vu30Var8 = vu30Var4;
                            if (i9 != 0) {
                                qim0Var5 = qim0Var4;
                                idn0Var3 = idn0VarY;
                                i12 = i11;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var9 = null;
                            } else {
                                idn0Var3 = idn0VarY;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var9 = vu30Var5;
                                qim0Var5 = qim0Var4;
                                i12 = i11;
                            }
                        }
                        b0kVar3.s();
                        int i114 = i12 << 6;
                        b0kVar2 = b0kVar3;
                        c(gbxVar, new idx(19), qim0Var5, maxVar4, gdxVar3, null, idn0Var3, null, vu30Var8, vu30Var9, vu30Var3, b0kVar2, (i12 & 14) | ((i12 << 3) & 896) | (57344 & i114) | (i114 & 458752) | ((i12 << 12) & 1879048192), (i12 >> 18) & 126, 328);
                        qim0Var3 = qim0Var5;
                        maxVar3 = maxVar4;
                        gdxVar2 = gdxVar3;
                        idn0Var2 = idn0Var3;
                        vu30Var7 = vu30Var8;
                        vu30Var6 = vu30Var9;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        qim0Var3 = qim0Var2;
                        maxVar3 = maxVar2;
                        gdxVar2 = gdxVarR;
                        vu30Var6 = vu30Var5;
                        idn0Var2 = idn0Var;
                        vu30Var7 = vu30Var4;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new fdx(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var7, vu30Var6, vu30Var3, i, i2, (byte) 0);
                    }
                }
                i14 |= 384;
                maxVar2 = maxVar;
                if ((i2 & 8) == 0) {
                    gdxVarR = gdxVar;
                    if (b0kVar3.g(gdxVarR)) {
                    }
                    i5 = i14 | i16;
                    i6 = i5 | 8192;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                        if ((196608 & i) == 0) {
                            vu30Var4 = vu30Var;
                            if (b0kVar3.i(vu30Var4)) {
                                i8 = 131072;
                            } else {
                                i8 = 65536;
                            }
                            i6 |= i8;
                        }
                        i9 = i2 & 64;
                        if (i9 != 0) {
                            if ((1572864 & i) == 0) {
                                vu30Var5 = vu30Var2;
                                if (b0kVar3.i(vu30Var5)) {
                                    i10 = 1048576;
                                } else {
                                    i10 = 524288;
                                }
                                i6 |= i10;
                            }
                            if ((12582912 & i) != 0) {
                                if (b0kVar3.i(vu30Var3)) {
                                    i13 = 8388608;
                                } else {
                                    i13 = 4194304;
                                }
                                i6 |= i13;
                            }
                            if ((4793491 & i6) != 4793490) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (b0kVar3.Y(i6 & 1, z)) {
                                b0kVar3.d0();
                                if ((i & 1) != 0) {
                                    if (i15 != 0) {
                                        qim0Var4 = nim0.a;
                                    } else {
                                        qim0Var4 = qim0Var2;
                                    }
                                    if (i3 != 0) {
                                        maxVar2 = jax.a;
                                    }
                                    if ((i2 & 8) != 0) {
                                        i6 &= -7169;
                                        gdxVarR = yla.r(b0kVar3);
                                    }
                                    idn0VarY = zso1.Y(b0kVar3);
                                    i11 = i6 & (-57345);
                                    if (i7 != 0) {
                                        vu30Var4 = null;
                                    }
                                    vu30Var8 = vu30Var4;
                                    if (i9 != 0) {
                                        qim0Var5 = qim0Var4;
                                        idn0Var3 = idn0VarY;
                                        i12 = i11;
                                        maxVar4 = maxVar2;
                                        gdxVar3 = gdxVarR;
                                        vu30Var9 = null;
                                    } else {
                                        idn0Var3 = idn0VarY;
                                        maxVar4 = maxVar2;
                                        gdxVar3 = gdxVarR;
                                        vu30Var9 = vu30Var5;
                                        qim0Var5 = qim0Var4;
                                        i12 = i11;
                                    }
                                } else {
                                    if (i15 != 0) {
                                        qim0Var4 = nim0.a;
                                    } else {
                                        qim0Var4 = qim0Var2;
                                    }
                                    if (i3 != 0) {
                                        maxVar2 = jax.a;
                                    }
                                    if ((i2 & 8) != 0) {
                                        i6 &= -7169;
                                        gdxVarR = yla.r(b0kVar3);
                                    }
                                    idn0VarY = zso1.Y(b0kVar3);
                                    i11 = i6 & (-57345);
                                    if (i7 != 0) {
                                        vu30Var4 = null;
                                    }
                                    vu30Var8 = vu30Var4;
                                    if (i9 != 0) {
                                        qim0Var5 = qim0Var4;
                                        idn0Var3 = idn0VarY;
                                        i12 = i11;
                                        maxVar4 = maxVar2;
                                        gdxVar3 = gdxVarR;
                                        vu30Var9 = null;
                                    } else {
                                        idn0Var3 = idn0VarY;
                                        maxVar4 = maxVar2;
                                        gdxVar3 = gdxVarR;
                                        vu30Var9 = vu30Var5;
                                        qim0Var5 = qim0Var4;
                                        i12 = i11;
                                    }
                                }
                                b0kVar3.s();
                                int i115 = i12 << 6;
                                b0kVar2 = b0kVar3;
                                c(gbxVar, new idx(19), qim0Var5, maxVar4, gdxVar3, null, idn0Var3, null, vu30Var8, vu30Var9, vu30Var3, b0kVar2, (i12 & 14) | ((i12 << 3) & 896) | (57344 & i115) | (i115 & 458752) | ((i12 << 12) & 1879048192), (i12 >> 18) & 126, 328);
                                qim0Var3 = qim0Var5;
                                maxVar3 = maxVar4;
                                gdxVar2 = gdxVar3;
                                idn0Var2 = idn0Var3;
                                vu30Var7 = vu30Var8;
                                vu30Var6 = vu30Var9;
                            } else {
                                b0kVar2 = b0kVar3;
                                b0kVar2.b0();
                                qim0Var3 = qim0Var2;
                                maxVar3 = maxVar2;
                                gdxVar2 = gdxVarR;
                                vu30Var6 = vu30Var5;
                                idn0Var2 = idn0Var;
                                vu30Var7 = vu30Var4;
                            }
                            h311VarV = b0kVar2.v();
                            if (h311VarV != null) {
                                h311VarV.d = new fdx(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var7, vu30Var6, vu30Var3, i, i2, (byte) 0);
                            }
                        }
                        i6 |= 1572864;
                        vu30Var5 = vu30Var2;
                        if ((12582912 & i) != 0) {
                            if (b0kVar3.i(vu30Var3)) {
                                i13 = 8388608;
                            } else {
                                i13 = 4194304;
                            }
                            i6 |= i13;
                        }
                        if ((4793491 & i6) != 4793490) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (b0kVar3.Y(i6 & 1, z)) {
                            b0kVar3.d0();
                            if ((i & 1) != 0) {
                                if (i15 != 0) {
                                    qim0Var4 = nim0.a;
                                } else {
                                    qim0Var4 = qim0Var2;
                                }
                                if (i3 != 0) {
                                    maxVar2 = jax.a;
                                }
                                if ((i2 & 8) != 0) {
                                    i6 &= -7169;
                                    gdxVarR = yla.r(b0kVar3);
                                }
                                idn0VarY = zso1.Y(b0kVar3);
                                i11 = i6 & (-57345);
                                if (i7 != 0) {
                                    vu30Var4 = null;
                                }
                                vu30Var8 = vu30Var4;
                                if (i9 != 0) {
                                    qim0Var5 = qim0Var4;
                                    idn0Var3 = idn0VarY;
                                    i12 = i11;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var9 = null;
                                } else {
                                    idn0Var3 = idn0VarY;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var9 = vu30Var5;
                                    qim0Var5 = qim0Var4;
                                    i12 = i11;
                                }
                            } else {
                                if (i15 != 0) {
                                    qim0Var4 = nim0.a;
                                } else {
                                    qim0Var4 = qim0Var2;
                                }
                                if (i3 != 0) {
                                    maxVar2 = jax.a;
                                }
                                if ((i2 & 8) != 0) {
                                    i6 &= -7169;
                                    gdxVarR = yla.r(b0kVar3);
                                }
                                idn0VarY = zso1.Y(b0kVar3);
                                i11 = i6 & (-57345);
                                if (i7 != 0) {
                                    vu30Var4 = null;
                                }
                                vu30Var8 = vu30Var4;
                                if (i9 != 0) {
                                    qim0Var5 = qim0Var4;
                                    idn0Var3 = idn0VarY;
                                    i12 = i11;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var9 = null;
                                } else {
                                    idn0Var3 = idn0VarY;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var9 = vu30Var5;
                                    qim0Var5 = qim0Var4;
                                    i12 = i11;
                                }
                            }
                            b0kVar3.s();
                            int i116 = i12 << 6;
                            b0kVar2 = b0kVar3;
                            c(gbxVar, new idx(19), qim0Var5, maxVar4, gdxVar3, null, idn0Var3, null, vu30Var8, vu30Var9, vu30Var3, b0kVar2, (i12 & 14) | ((i12 << 3) & 896) | (57344 & i116) | (i116 & 458752) | ((i12 << 12) & 1879048192), (i12 >> 18) & 126, 328);
                            qim0Var3 = qim0Var5;
                            maxVar3 = maxVar4;
                            gdxVar2 = gdxVar3;
                            idn0Var2 = idn0Var3;
                            vu30Var7 = vu30Var8;
                            vu30Var6 = vu30Var9;
                        } else {
                            b0kVar2 = b0kVar3;
                            b0kVar2.b0();
                            qim0Var3 = qim0Var2;
                            maxVar3 = maxVar2;
                            gdxVar2 = gdxVarR;
                            vu30Var6 = vu30Var5;
                            idn0Var2 = idn0Var;
                            vu30Var7 = vu30Var4;
                        }
                        h311VarV = b0kVar2.v();
                        if (h311VarV != null) {
                            h311VarV.d = new fdx(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var7, vu30Var6, vu30Var3, i, i2, (byte) 0);
                        }
                    }
                    i6 = 204800 | i5;
                    vu30Var4 = vu30Var;
                    i9 = i2 & 64;
                    if (i9 != 0) {
                        if ((1572864 & i) == 0) {
                            vu30Var5 = vu30Var2;
                            if (b0kVar3.i(vu30Var5)) {
                                i10 = 1048576;
                            } else {
                                i10 = 524288;
                            }
                            i6 |= i10;
                        }
                        if ((12582912 & i) != 0) {
                            if (b0kVar3.i(vu30Var3)) {
                                i13 = 8388608;
                            } else {
                                i13 = 4194304;
                            }
                            i6 |= i13;
                        }
                        if ((4793491 & i6) != 4793490) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (b0kVar3.Y(i6 & 1, z)) {
                            b0kVar3.d0();
                            if ((i & 1) != 0) {
                                if (i15 != 0) {
                                    qim0Var4 = nim0.a;
                                } else {
                                    qim0Var4 = qim0Var2;
                                }
                                if (i3 != 0) {
                                    maxVar2 = jax.a;
                                }
                                if ((i2 & 8) != 0) {
                                    i6 &= -7169;
                                    gdxVarR = yla.r(b0kVar3);
                                }
                                idn0VarY = zso1.Y(b0kVar3);
                                i11 = i6 & (-57345);
                                if (i7 != 0) {
                                    vu30Var4 = null;
                                }
                                vu30Var8 = vu30Var4;
                                if (i9 != 0) {
                                    qim0Var5 = qim0Var4;
                                    idn0Var3 = idn0VarY;
                                    i12 = i11;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var9 = null;
                                } else {
                                    idn0Var3 = idn0VarY;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var9 = vu30Var5;
                                    qim0Var5 = qim0Var4;
                                    i12 = i11;
                                }
                            } else {
                                if (i15 != 0) {
                                    qim0Var4 = nim0.a;
                                } else {
                                    qim0Var4 = qim0Var2;
                                }
                                if (i3 != 0) {
                                    maxVar2 = jax.a;
                                }
                                if ((i2 & 8) != 0) {
                                    i6 &= -7169;
                                    gdxVarR = yla.r(b0kVar3);
                                }
                                idn0VarY = zso1.Y(b0kVar3);
                                i11 = i6 & (-57345);
                                if (i7 != 0) {
                                    vu30Var4 = null;
                                }
                                vu30Var8 = vu30Var4;
                                if (i9 != 0) {
                                    qim0Var5 = qim0Var4;
                                    idn0Var3 = idn0VarY;
                                    i12 = i11;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var9 = null;
                                } else {
                                    idn0Var3 = idn0VarY;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var9 = vu30Var5;
                                    qim0Var5 = qim0Var4;
                                    i12 = i11;
                                }
                            }
                            b0kVar3.s();
                            int i117 = i12 << 6;
                            b0kVar2 = b0kVar3;
                            c(gbxVar, new idx(19), qim0Var5, maxVar4, gdxVar3, null, idn0Var3, null, vu30Var8, vu30Var9, vu30Var3, b0kVar2, (i12 & 14) | ((i12 << 3) & 896) | (57344 & i117) | (i117 & 458752) | ((i12 << 12) & 1879048192), (i12 >> 18) & 126, 328);
                            qim0Var3 = qim0Var5;
                            maxVar3 = maxVar4;
                            gdxVar2 = gdxVar3;
                            idn0Var2 = idn0Var3;
                            vu30Var7 = vu30Var8;
                            vu30Var6 = vu30Var9;
                        } else {
                            b0kVar2 = b0kVar3;
                            b0kVar2.b0();
                            qim0Var3 = qim0Var2;
                            maxVar3 = maxVar2;
                            gdxVar2 = gdxVarR;
                            vu30Var6 = vu30Var5;
                            idn0Var2 = idn0Var;
                            vu30Var7 = vu30Var4;
                        }
                        h311VarV = b0kVar2.v();
                        if (h311VarV != null) {
                            h311VarV.d = new fdx(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var7, vu30Var6, vu30Var3, i, i2, (byte) 0);
                        }
                    }
                    i6 |= 1572864;
                    vu30Var5 = vu30Var2;
                    if ((12582912 & i) != 0) {
                        if (b0kVar3.i(vu30Var3)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i6 |= i13;
                    }
                    if ((4793491 & i6) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (b0kVar3.Y(i6 & 1, z)) {
                        b0kVar3.d0();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i3 != 0) {
                                maxVar2 = jax.a;
                            }
                            if ((i2 & 8) != 0) {
                                i6 &= -7169;
                                gdxVarR = yla.r(b0kVar3);
                            }
                            idn0VarY = zso1.Y(b0kVar3);
                            i11 = i6 & (-57345);
                            if (i7 != 0) {
                                vu30Var4 = null;
                            }
                            vu30Var8 = vu30Var4;
                            if (i9 != 0) {
                                qim0Var5 = qim0Var4;
                                idn0Var3 = idn0VarY;
                                i12 = i11;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var9 = null;
                            } else {
                                idn0Var3 = idn0VarY;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var9 = vu30Var5;
                                qim0Var5 = qim0Var4;
                                i12 = i11;
                            }
                        } else {
                            if (i15 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i3 != 0) {
                                maxVar2 = jax.a;
                            }
                            if ((i2 & 8) != 0) {
                                i6 &= -7169;
                                gdxVarR = yla.r(b0kVar3);
                            }
                            idn0VarY = zso1.Y(b0kVar3);
                            i11 = i6 & (-57345);
                            if (i7 != 0) {
                                vu30Var4 = null;
                            }
                            vu30Var8 = vu30Var4;
                            if (i9 != 0) {
                                qim0Var5 = qim0Var4;
                                idn0Var3 = idn0VarY;
                                i12 = i11;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var9 = null;
                            } else {
                                idn0Var3 = idn0VarY;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var9 = vu30Var5;
                                qim0Var5 = qim0Var4;
                                i12 = i11;
                            }
                        }
                        b0kVar3.s();
                        int i118 = i12 << 6;
                        b0kVar2 = b0kVar3;
                        c(gbxVar, new idx(19), qim0Var5, maxVar4, gdxVar3, null, idn0Var3, null, vu30Var8, vu30Var9, vu30Var3, b0kVar2, (i12 & 14) | ((i12 << 3) & 896) | (57344 & i118) | (i118 & 458752) | ((i12 << 12) & 1879048192), (i12 >> 18) & 126, 328);
                        qim0Var3 = qim0Var5;
                        maxVar3 = maxVar4;
                        gdxVar2 = gdxVar3;
                        idn0Var2 = idn0Var3;
                        vu30Var7 = vu30Var8;
                        vu30Var6 = vu30Var9;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        qim0Var3 = qim0Var2;
                        maxVar3 = maxVar2;
                        gdxVar2 = gdxVarR;
                        vu30Var6 = vu30Var5;
                        idn0Var2 = idn0Var;
                        vu30Var7 = vu30Var4;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new fdx(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var7, vu30Var6, vu30Var3, i, i2, (byte) 0);
                    }
                }
                gdxVarR = gdxVar;
                i5 = i14 | i16;
                i6 = i5 | 8192;
                i7 = i2 & 32;
                if (i7 != 0) {
                    if ((196608 & i) == 0) {
                        vu30Var4 = vu30Var;
                        if (b0kVar3.i(vu30Var4)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i6 |= i8;
                    }
                    i9 = i2 & 64;
                    if (i9 != 0) {
                        if ((1572864 & i) == 0) {
                            vu30Var5 = vu30Var2;
                            if (b0kVar3.i(vu30Var5)) {
                                i10 = 1048576;
                            } else {
                                i10 = 524288;
                            }
                            i6 |= i10;
                        }
                        if ((12582912 & i) != 0) {
                            if (b0kVar3.i(vu30Var3)) {
                                i13 = 8388608;
                            } else {
                                i13 = 4194304;
                            }
                            i6 |= i13;
                        }
                        if ((4793491 & i6) != 4793490) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (b0kVar3.Y(i6 & 1, z)) {
                            b0kVar3.d0();
                            if ((i & 1) != 0) {
                                if (i15 != 0) {
                                    qim0Var4 = nim0.a;
                                } else {
                                    qim0Var4 = qim0Var2;
                                }
                                if (i3 != 0) {
                                    maxVar2 = jax.a;
                                }
                                if ((i2 & 8) != 0) {
                                    i6 &= -7169;
                                    gdxVarR = yla.r(b0kVar3);
                                }
                                idn0VarY = zso1.Y(b0kVar3);
                                i11 = i6 & (-57345);
                                if (i7 != 0) {
                                    vu30Var4 = null;
                                }
                                vu30Var8 = vu30Var4;
                                if (i9 != 0) {
                                    qim0Var5 = qim0Var4;
                                    idn0Var3 = idn0VarY;
                                    i12 = i11;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var9 = null;
                                } else {
                                    idn0Var3 = idn0VarY;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var9 = vu30Var5;
                                    qim0Var5 = qim0Var4;
                                    i12 = i11;
                                }
                            } else {
                                if (i15 != 0) {
                                    qim0Var4 = nim0.a;
                                } else {
                                    qim0Var4 = qim0Var2;
                                }
                                if (i3 != 0) {
                                    maxVar2 = jax.a;
                                }
                                if ((i2 & 8) != 0) {
                                    i6 &= -7169;
                                    gdxVarR = yla.r(b0kVar3);
                                }
                                idn0VarY = zso1.Y(b0kVar3);
                                i11 = i6 & (-57345);
                                if (i7 != 0) {
                                    vu30Var4 = null;
                                }
                                vu30Var8 = vu30Var4;
                                if (i9 != 0) {
                                    qim0Var5 = qim0Var4;
                                    idn0Var3 = idn0VarY;
                                    i12 = i11;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var9 = null;
                                } else {
                                    idn0Var3 = idn0VarY;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var9 = vu30Var5;
                                    qim0Var5 = qim0Var4;
                                    i12 = i11;
                                }
                            }
                            b0kVar3.s();
                            int i119 = i12 << 6;
                            b0kVar2 = b0kVar3;
                            c(gbxVar, new idx(19), qim0Var5, maxVar4, gdxVar3, null, idn0Var3, null, vu30Var8, vu30Var9, vu30Var3, b0kVar2, (i12 & 14) | ((i12 << 3) & 896) | (57344 & i119) | (i119 & 458752) | ((i12 << 12) & 1879048192), (i12 >> 18) & 126, 328);
                            qim0Var3 = qim0Var5;
                            maxVar3 = maxVar4;
                            gdxVar2 = gdxVar3;
                            idn0Var2 = idn0Var3;
                            vu30Var7 = vu30Var8;
                            vu30Var6 = vu30Var9;
                        } else {
                            b0kVar2 = b0kVar3;
                            b0kVar2.b0();
                            qim0Var3 = qim0Var2;
                            maxVar3 = maxVar2;
                            gdxVar2 = gdxVarR;
                            vu30Var6 = vu30Var5;
                            idn0Var2 = idn0Var;
                            vu30Var7 = vu30Var4;
                        }
                        h311VarV = b0kVar2.v();
                        if (h311VarV != null) {
                            h311VarV.d = new fdx(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var7, vu30Var6, vu30Var3, i, i2, (byte) 0);
                        }
                    }
                    i6 |= 1572864;
                    vu30Var5 = vu30Var2;
                    if ((12582912 & i) != 0) {
                        if (b0kVar3.i(vu30Var3)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i6 |= i13;
                    }
                    if ((4793491 & i6) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (b0kVar3.Y(i6 & 1, z)) {
                        b0kVar3.d0();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i3 != 0) {
                                maxVar2 = jax.a;
                            }
                            if ((i2 & 8) != 0) {
                                i6 &= -7169;
                                gdxVarR = yla.r(b0kVar3);
                            }
                            idn0VarY = zso1.Y(b0kVar3);
                            i11 = i6 & (-57345);
                            if (i7 != 0) {
                                vu30Var4 = null;
                            }
                            vu30Var8 = vu30Var4;
                            if (i9 != 0) {
                                qim0Var5 = qim0Var4;
                                idn0Var3 = idn0VarY;
                                i12 = i11;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var9 = null;
                            } else {
                                idn0Var3 = idn0VarY;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var9 = vu30Var5;
                                qim0Var5 = qim0Var4;
                                i12 = i11;
                            }
                        } else {
                            if (i15 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i3 != 0) {
                                maxVar2 = jax.a;
                            }
                            if ((i2 & 8) != 0) {
                                i6 &= -7169;
                                gdxVarR = yla.r(b0kVar3);
                            }
                            idn0VarY = zso1.Y(b0kVar3);
                            i11 = i6 & (-57345);
                            if (i7 != 0) {
                                vu30Var4 = null;
                            }
                            vu30Var8 = vu30Var4;
                            if (i9 != 0) {
                                qim0Var5 = qim0Var4;
                                idn0Var3 = idn0VarY;
                                i12 = i11;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var9 = null;
                            } else {
                                idn0Var3 = idn0VarY;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var9 = vu30Var5;
                                qim0Var5 = qim0Var4;
                                i12 = i11;
                            }
                        }
                        b0kVar3.s();
                        int i1110 = i12 << 6;
                        b0kVar2 = b0kVar3;
                        c(gbxVar, new idx(19), qim0Var5, maxVar4, gdxVar3, null, idn0Var3, null, vu30Var8, vu30Var9, vu30Var3, b0kVar2, (i12 & 14) | ((i12 << 3) & 896) | (57344 & i1110) | (i1110 & 458752) | ((i12 << 12) & 1879048192), (i12 >> 18) & 126, 328);
                        qim0Var3 = qim0Var5;
                        maxVar3 = maxVar4;
                        gdxVar2 = gdxVar3;
                        idn0Var2 = idn0Var3;
                        vu30Var7 = vu30Var8;
                        vu30Var6 = vu30Var9;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        qim0Var3 = qim0Var2;
                        maxVar3 = maxVar2;
                        gdxVar2 = gdxVarR;
                        vu30Var6 = vu30Var5;
                        idn0Var2 = idn0Var;
                        vu30Var7 = vu30Var4;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new fdx(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var7, vu30Var6, vu30Var3, i, i2, (byte) 0);
                    }
                }
                i6 = 204800 | i5;
                vu30Var4 = vu30Var;
                i9 = i2 & 64;
                if (i9 != 0) {
                    if ((1572864 & i) == 0) {
                        vu30Var5 = vu30Var2;
                        if (b0kVar3.i(vu30Var5)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i6 |= i10;
                    }
                    if ((12582912 & i) != 0) {
                        if (b0kVar3.i(vu30Var3)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i6 |= i13;
                    }
                    if ((4793491 & i6) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (b0kVar3.Y(i6 & 1, z)) {
                        b0kVar3.d0();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i3 != 0) {
                                maxVar2 = jax.a;
                            }
                            if ((i2 & 8) != 0) {
                                i6 &= -7169;
                                gdxVarR = yla.r(b0kVar3);
                            }
                            idn0VarY = zso1.Y(b0kVar3);
                            i11 = i6 & (-57345);
                            if (i7 != 0) {
                                vu30Var4 = null;
                            }
                            vu30Var8 = vu30Var4;
                            if (i9 != 0) {
                                qim0Var5 = qim0Var4;
                                idn0Var3 = idn0VarY;
                                i12 = i11;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var9 = null;
                            } else {
                                idn0Var3 = idn0VarY;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var9 = vu30Var5;
                                qim0Var5 = qim0Var4;
                                i12 = i11;
                            }
                        } else {
                            if (i15 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i3 != 0) {
                                maxVar2 = jax.a;
                            }
                            if ((i2 & 8) != 0) {
                                i6 &= -7169;
                                gdxVarR = yla.r(b0kVar3);
                            }
                            idn0VarY = zso1.Y(b0kVar3);
                            i11 = i6 & (-57345);
                            if (i7 != 0) {
                                vu30Var4 = null;
                            }
                            vu30Var8 = vu30Var4;
                            if (i9 != 0) {
                                qim0Var5 = qim0Var4;
                                idn0Var3 = idn0VarY;
                                i12 = i11;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var9 = null;
                            } else {
                                idn0Var3 = idn0VarY;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var9 = vu30Var5;
                                qim0Var5 = qim0Var4;
                                i12 = i11;
                            }
                        }
                        b0kVar3.s();
                        int i1111 = i12 << 6;
                        b0kVar2 = b0kVar3;
                        c(gbxVar, new idx(19), qim0Var5, maxVar4, gdxVar3, null, idn0Var3, null, vu30Var8, vu30Var9, vu30Var3, b0kVar2, (i12 & 14) | ((i12 << 3) & 896) | (57344 & i1111) | (i1111 & 458752) | ((i12 << 12) & 1879048192), (i12 >> 18) & 126, 328);
                        qim0Var3 = qim0Var5;
                        maxVar3 = maxVar4;
                        gdxVar2 = gdxVar3;
                        idn0Var2 = idn0Var3;
                        vu30Var7 = vu30Var8;
                        vu30Var6 = vu30Var9;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        qim0Var3 = qim0Var2;
                        maxVar3 = maxVar2;
                        gdxVar2 = gdxVarR;
                        vu30Var6 = vu30Var5;
                        idn0Var2 = idn0Var;
                        vu30Var7 = vu30Var4;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new fdx(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var7, vu30Var6, vu30Var3, i, i2, (byte) 0);
                    }
                }
                i6 |= 1572864;
                vu30Var5 = vu30Var2;
                if ((12582912 & i) != 0) {
                    if (b0kVar3.i(vu30Var3)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i6 |= i13;
                }
                if ((4793491 & i6) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i6 & 1, z)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i3 != 0) {
                            maxVar2 = jax.a;
                        }
                        if ((i2 & 8) != 0) {
                            i6 &= -7169;
                            gdxVarR = yla.r(b0kVar3);
                        }
                        idn0VarY = zso1.Y(b0kVar3);
                        i11 = i6 & (-57345);
                        if (i7 != 0) {
                            vu30Var4 = null;
                        }
                        vu30Var8 = vu30Var4;
                        if (i9 != 0) {
                            qim0Var5 = qim0Var4;
                            idn0Var3 = idn0VarY;
                            i12 = i11;
                            maxVar4 = maxVar2;
                            gdxVar3 = gdxVarR;
                            vu30Var9 = null;
                        } else {
                            idn0Var3 = idn0VarY;
                            maxVar4 = maxVar2;
                            gdxVar3 = gdxVarR;
                            vu30Var9 = vu30Var5;
                            qim0Var5 = qim0Var4;
                            i12 = i11;
                        }
                    } else {
                        if (i15 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i3 != 0) {
                            maxVar2 = jax.a;
                        }
                        if ((i2 & 8) != 0) {
                            i6 &= -7169;
                            gdxVarR = yla.r(b0kVar3);
                        }
                        idn0VarY = zso1.Y(b0kVar3);
                        i11 = i6 & (-57345);
                        if (i7 != 0) {
                            vu30Var4 = null;
                        }
                        vu30Var8 = vu30Var4;
                        if (i9 != 0) {
                            qim0Var5 = qim0Var4;
                            idn0Var3 = idn0VarY;
                            i12 = i11;
                            maxVar4 = maxVar2;
                            gdxVar3 = gdxVarR;
                            vu30Var9 = null;
                        } else {
                            idn0Var3 = idn0VarY;
                            maxVar4 = maxVar2;
                            gdxVar3 = gdxVarR;
                            vu30Var9 = vu30Var5;
                            qim0Var5 = qim0Var4;
                            i12 = i11;
                        }
                    }
                    b0kVar3.s();
                    int i1112 = i12 << 6;
                    b0kVar2 = b0kVar3;
                    c(gbxVar, new idx(19), qim0Var5, maxVar4, gdxVar3, null, idn0Var3, null, vu30Var8, vu30Var9, vu30Var3, b0kVar2, (i12 & 14) | ((i12 << 3) & 896) | (57344 & i1112) | (i1112 & 458752) | ((i12 << 12) & 1879048192), (i12 >> 18) & 126, 328);
                    qim0Var3 = qim0Var5;
                    maxVar3 = maxVar4;
                    gdxVar2 = gdxVar3;
                    idn0Var2 = idn0Var3;
                    vu30Var7 = vu30Var8;
                    vu30Var6 = vu30Var9;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    qim0Var3 = qim0Var2;
                    maxVar3 = maxVar2;
                    gdxVar2 = gdxVarR;
                    vu30Var6 = vu30Var5;
                    idn0Var2 = idn0Var;
                    vu30Var7 = vu30Var4;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new fdx(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var7, vu30Var6, vu30Var3, i, i2, (byte) 0);
                }
            }
            i14 |= 48;
            qim0Var2 = qim0Var;
            i3 = i2 & 4;
            if (i3 != 0) {
                if ((i & 384) == 0) {
                    maxVar2 = maxVar;
                    if (b0kVar3.g(maxVar2)) {
                        i4 = 256;
                    } else {
                        i4 = 128;
                    }
                    i14 |= i4;
                }
                if ((i2 & 8) == 0) {
                    gdxVarR = gdxVar;
                    if (b0kVar3.g(gdxVarR)) {
                    }
                    i5 = i14 | i16;
                    i6 = i5 | 8192;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                        if ((196608 & i) == 0) {
                            vu30Var4 = vu30Var;
                            if (b0kVar3.i(vu30Var4)) {
                                i8 = 131072;
                            } else {
                                i8 = 65536;
                            }
                            i6 |= i8;
                        }
                        i9 = i2 & 64;
                        if (i9 != 0) {
                            if ((1572864 & i) == 0) {
                                vu30Var5 = vu30Var2;
                                if (b0kVar3.i(vu30Var5)) {
                                    i10 = 1048576;
                                } else {
                                    i10 = 524288;
                                }
                                i6 |= i10;
                            }
                            if ((12582912 & i) != 0) {
                                if (b0kVar3.i(vu30Var3)) {
                                    i13 = 8388608;
                                } else {
                                    i13 = 4194304;
                                }
                                i6 |= i13;
                            }
                            if ((4793491 & i6) != 4793490) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (b0kVar3.Y(i6 & 1, z)) {
                                b0kVar3.d0();
                                if ((i & 1) != 0) {
                                    if (i15 != 0) {
                                        qim0Var4 = nim0.a;
                                    } else {
                                        qim0Var4 = qim0Var2;
                                    }
                                    if (i3 != 0) {
                                        maxVar2 = jax.a;
                                    }
                                    if ((i2 & 8) != 0) {
                                        i6 &= -7169;
                                        gdxVarR = yla.r(b0kVar3);
                                    }
                                    idn0VarY = zso1.Y(b0kVar3);
                                    i11 = i6 & (-57345);
                                    if (i7 != 0) {
                                        vu30Var4 = null;
                                    }
                                    vu30Var8 = vu30Var4;
                                    if (i9 != 0) {
                                        qim0Var5 = qim0Var4;
                                        idn0Var3 = idn0VarY;
                                        i12 = i11;
                                        maxVar4 = maxVar2;
                                        gdxVar3 = gdxVarR;
                                        vu30Var9 = null;
                                    } else {
                                        idn0Var3 = idn0VarY;
                                        maxVar4 = maxVar2;
                                        gdxVar3 = gdxVarR;
                                        vu30Var9 = vu30Var5;
                                        qim0Var5 = qim0Var4;
                                        i12 = i11;
                                    }
                                } else {
                                    if (i15 != 0) {
                                        qim0Var4 = nim0.a;
                                    } else {
                                        qim0Var4 = qim0Var2;
                                    }
                                    if (i3 != 0) {
                                        maxVar2 = jax.a;
                                    }
                                    if ((i2 & 8) != 0) {
                                        i6 &= -7169;
                                        gdxVarR = yla.r(b0kVar3);
                                    }
                                    idn0VarY = zso1.Y(b0kVar3);
                                    i11 = i6 & (-57345);
                                    if (i7 != 0) {
                                        vu30Var4 = null;
                                    }
                                    vu30Var8 = vu30Var4;
                                    if (i9 != 0) {
                                        qim0Var5 = qim0Var4;
                                        idn0Var3 = idn0VarY;
                                        i12 = i11;
                                        maxVar4 = maxVar2;
                                        gdxVar3 = gdxVarR;
                                        vu30Var9 = null;
                                    } else {
                                        idn0Var3 = idn0VarY;
                                        maxVar4 = maxVar2;
                                        gdxVar3 = gdxVarR;
                                        vu30Var9 = vu30Var5;
                                        qim0Var5 = qim0Var4;
                                        i12 = i11;
                                    }
                                }
                                b0kVar3.s();
                                int i1113 = i12 << 6;
                                b0kVar2 = b0kVar3;
                                c(gbxVar, new idx(19), qim0Var5, maxVar4, gdxVar3, null, idn0Var3, null, vu30Var8, vu30Var9, vu30Var3, b0kVar2, (i12 & 14) | ((i12 << 3) & 896) | (57344 & i1113) | (i1113 & 458752) | ((i12 << 12) & 1879048192), (i12 >> 18) & 126, 328);
                                qim0Var3 = qim0Var5;
                                maxVar3 = maxVar4;
                                gdxVar2 = gdxVar3;
                                idn0Var2 = idn0Var3;
                                vu30Var7 = vu30Var8;
                                vu30Var6 = vu30Var9;
                            } else {
                                b0kVar2 = b0kVar3;
                                b0kVar2.b0();
                                qim0Var3 = qim0Var2;
                                maxVar3 = maxVar2;
                                gdxVar2 = gdxVarR;
                                vu30Var6 = vu30Var5;
                                idn0Var2 = idn0Var;
                                vu30Var7 = vu30Var4;
                            }
                            h311VarV = b0kVar2.v();
                            if (h311VarV != null) {
                                h311VarV.d = new fdx(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var7, vu30Var6, vu30Var3, i, i2, (byte) 0);
                            }
                        }
                        i6 |= 1572864;
                        vu30Var5 = vu30Var2;
                        if ((12582912 & i) != 0) {
                            if (b0kVar3.i(vu30Var3)) {
                                i13 = 8388608;
                            } else {
                                i13 = 4194304;
                            }
                            i6 |= i13;
                        }
                        if ((4793491 & i6) != 4793490) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (b0kVar3.Y(i6 & 1, z)) {
                            b0kVar3.d0();
                            if ((i & 1) != 0) {
                                if (i15 != 0) {
                                    qim0Var4 = nim0.a;
                                } else {
                                    qim0Var4 = qim0Var2;
                                }
                                if (i3 != 0) {
                                    maxVar2 = jax.a;
                                }
                                if ((i2 & 8) != 0) {
                                    i6 &= -7169;
                                    gdxVarR = yla.r(b0kVar3);
                                }
                                idn0VarY = zso1.Y(b0kVar3);
                                i11 = i6 & (-57345);
                                if (i7 != 0) {
                                    vu30Var4 = null;
                                }
                                vu30Var8 = vu30Var4;
                                if (i9 != 0) {
                                    qim0Var5 = qim0Var4;
                                    idn0Var3 = idn0VarY;
                                    i12 = i11;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var9 = null;
                                } else {
                                    idn0Var3 = idn0VarY;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var9 = vu30Var5;
                                    qim0Var5 = qim0Var4;
                                    i12 = i11;
                                }
                            } else {
                                if (i15 != 0) {
                                    qim0Var4 = nim0.a;
                                } else {
                                    qim0Var4 = qim0Var2;
                                }
                                if (i3 != 0) {
                                    maxVar2 = jax.a;
                                }
                                if ((i2 & 8) != 0) {
                                    i6 &= -7169;
                                    gdxVarR = yla.r(b0kVar3);
                                }
                                idn0VarY = zso1.Y(b0kVar3);
                                i11 = i6 & (-57345);
                                if (i7 != 0) {
                                    vu30Var4 = null;
                                }
                                vu30Var8 = vu30Var4;
                                if (i9 != 0) {
                                    qim0Var5 = qim0Var4;
                                    idn0Var3 = idn0VarY;
                                    i12 = i11;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var9 = null;
                                } else {
                                    idn0Var3 = idn0VarY;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var9 = vu30Var5;
                                    qim0Var5 = qim0Var4;
                                    i12 = i11;
                                }
                            }
                            b0kVar3.s();
                            int i1114 = i12 << 6;
                            b0kVar2 = b0kVar3;
                            c(gbxVar, new idx(19), qim0Var5, maxVar4, gdxVar3, null, idn0Var3, null, vu30Var8, vu30Var9, vu30Var3, b0kVar2, (i12 & 14) | ((i12 << 3) & 896) | (57344 & i1114) | (i1114 & 458752) | ((i12 << 12) & 1879048192), (i12 >> 18) & 126, 328);
                            qim0Var3 = qim0Var5;
                            maxVar3 = maxVar4;
                            gdxVar2 = gdxVar3;
                            idn0Var2 = idn0Var3;
                            vu30Var7 = vu30Var8;
                            vu30Var6 = vu30Var9;
                        } else {
                            b0kVar2 = b0kVar3;
                            b0kVar2.b0();
                            qim0Var3 = qim0Var2;
                            maxVar3 = maxVar2;
                            gdxVar2 = gdxVarR;
                            vu30Var6 = vu30Var5;
                            idn0Var2 = idn0Var;
                            vu30Var7 = vu30Var4;
                        }
                        h311VarV = b0kVar2.v();
                        if (h311VarV != null) {
                            h311VarV.d = new fdx(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var7, vu30Var6, vu30Var3, i, i2, (byte) 0);
                        }
                    }
                    i6 = 204800 | i5;
                    vu30Var4 = vu30Var;
                    i9 = i2 & 64;
                    if (i9 != 0) {
                        if ((1572864 & i) == 0) {
                            vu30Var5 = vu30Var2;
                            if (b0kVar3.i(vu30Var5)) {
                                i10 = 1048576;
                            } else {
                                i10 = 524288;
                            }
                            i6 |= i10;
                        }
                        if ((12582912 & i) != 0) {
                            if (b0kVar3.i(vu30Var3)) {
                                i13 = 8388608;
                            } else {
                                i13 = 4194304;
                            }
                            i6 |= i13;
                        }
                        if ((4793491 & i6) != 4793490) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (b0kVar3.Y(i6 & 1, z)) {
                            b0kVar3.d0();
                            if ((i & 1) != 0) {
                                if (i15 != 0) {
                                    qim0Var4 = nim0.a;
                                } else {
                                    qim0Var4 = qim0Var2;
                                }
                                if (i3 != 0) {
                                    maxVar2 = jax.a;
                                }
                                if ((i2 & 8) != 0) {
                                    i6 &= -7169;
                                    gdxVarR = yla.r(b0kVar3);
                                }
                                idn0VarY = zso1.Y(b0kVar3);
                                i11 = i6 & (-57345);
                                if (i7 != 0) {
                                    vu30Var4 = null;
                                }
                                vu30Var8 = vu30Var4;
                                if (i9 != 0) {
                                    qim0Var5 = qim0Var4;
                                    idn0Var3 = idn0VarY;
                                    i12 = i11;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var9 = null;
                                } else {
                                    idn0Var3 = idn0VarY;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var9 = vu30Var5;
                                    qim0Var5 = qim0Var4;
                                    i12 = i11;
                                }
                            } else {
                                if (i15 != 0) {
                                    qim0Var4 = nim0.a;
                                } else {
                                    qim0Var4 = qim0Var2;
                                }
                                if (i3 != 0) {
                                    maxVar2 = jax.a;
                                }
                                if ((i2 & 8) != 0) {
                                    i6 &= -7169;
                                    gdxVarR = yla.r(b0kVar3);
                                }
                                idn0VarY = zso1.Y(b0kVar3);
                                i11 = i6 & (-57345);
                                if (i7 != 0) {
                                    vu30Var4 = null;
                                }
                                vu30Var8 = vu30Var4;
                                if (i9 != 0) {
                                    qim0Var5 = qim0Var4;
                                    idn0Var3 = idn0VarY;
                                    i12 = i11;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var9 = null;
                                } else {
                                    idn0Var3 = idn0VarY;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var9 = vu30Var5;
                                    qim0Var5 = qim0Var4;
                                    i12 = i11;
                                }
                            }
                            b0kVar3.s();
                            int i1115 = i12 << 6;
                            b0kVar2 = b0kVar3;
                            c(gbxVar, new idx(19), qim0Var5, maxVar4, gdxVar3, null, idn0Var3, null, vu30Var8, vu30Var9, vu30Var3, b0kVar2, (i12 & 14) | ((i12 << 3) & 896) | (57344 & i1115) | (i1115 & 458752) | ((i12 << 12) & 1879048192), (i12 >> 18) & 126, 328);
                            qim0Var3 = qim0Var5;
                            maxVar3 = maxVar4;
                            gdxVar2 = gdxVar3;
                            idn0Var2 = idn0Var3;
                            vu30Var7 = vu30Var8;
                            vu30Var6 = vu30Var9;
                        } else {
                            b0kVar2 = b0kVar3;
                            b0kVar2.b0();
                            qim0Var3 = qim0Var2;
                            maxVar3 = maxVar2;
                            gdxVar2 = gdxVarR;
                            vu30Var6 = vu30Var5;
                            idn0Var2 = idn0Var;
                            vu30Var7 = vu30Var4;
                        }
                        h311VarV = b0kVar2.v();
                        if (h311VarV != null) {
                            h311VarV.d = new fdx(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var7, vu30Var6, vu30Var3, i, i2, (byte) 0);
                        }
                    }
                    i6 |= 1572864;
                    vu30Var5 = vu30Var2;
                    if ((12582912 & i) != 0) {
                        if (b0kVar3.i(vu30Var3)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i6 |= i13;
                    }
                    if ((4793491 & i6) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (b0kVar3.Y(i6 & 1, z)) {
                        b0kVar3.d0();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i3 != 0) {
                                maxVar2 = jax.a;
                            }
                            if ((i2 & 8) != 0) {
                                i6 &= -7169;
                                gdxVarR = yla.r(b0kVar3);
                            }
                            idn0VarY = zso1.Y(b0kVar3);
                            i11 = i6 & (-57345);
                            if (i7 != 0) {
                                vu30Var4 = null;
                            }
                            vu30Var8 = vu30Var4;
                            if (i9 != 0) {
                                qim0Var5 = qim0Var4;
                                idn0Var3 = idn0VarY;
                                i12 = i11;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var9 = null;
                            } else {
                                idn0Var3 = idn0VarY;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var9 = vu30Var5;
                                qim0Var5 = qim0Var4;
                                i12 = i11;
                            }
                        } else {
                            if (i15 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i3 != 0) {
                                maxVar2 = jax.a;
                            }
                            if ((i2 & 8) != 0) {
                                i6 &= -7169;
                                gdxVarR = yla.r(b0kVar3);
                            }
                            idn0VarY = zso1.Y(b0kVar3);
                            i11 = i6 & (-57345);
                            if (i7 != 0) {
                                vu30Var4 = null;
                            }
                            vu30Var8 = vu30Var4;
                            if (i9 != 0) {
                                qim0Var5 = qim0Var4;
                                idn0Var3 = idn0VarY;
                                i12 = i11;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var9 = null;
                            } else {
                                idn0Var3 = idn0VarY;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var9 = vu30Var5;
                                qim0Var5 = qim0Var4;
                                i12 = i11;
                            }
                        }
                        b0kVar3.s();
                        int i1116 = i12 << 6;
                        b0kVar2 = b0kVar3;
                        c(gbxVar, new idx(19), qim0Var5, maxVar4, gdxVar3, null, idn0Var3, null, vu30Var8, vu30Var9, vu30Var3, b0kVar2, (i12 & 14) | ((i12 << 3) & 896) | (57344 & i1116) | (i1116 & 458752) | ((i12 << 12) & 1879048192), (i12 >> 18) & 126, 328);
                        qim0Var3 = qim0Var5;
                        maxVar3 = maxVar4;
                        gdxVar2 = gdxVar3;
                        idn0Var2 = idn0Var3;
                        vu30Var7 = vu30Var8;
                        vu30Var6 = vu30Var9;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        qim0Var3 = qim0Var2;
                        maxVar3 = maxVar2;
                        gdxVar2 = gdxVarR;
                        vu30Var6 = vu30Var5;
                        idn0Var2 = idn0Var;
                        vu30Var7 = vu30Var4;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new fdx(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var7, vu30Var6, vu30Var3, i, i2, (byte) 0);
                    }
                }
                gdxVarR = gdxVar;
                i5 = i14 | i16;
                i6 = i5 | 8192;
                i7 = i2 & 32;
                if (i7 != 0) {
                    if ((196608 & i) == 0) {
                        vu30Var4 = vu30Var;
                        if (b0kVar3.i(vu30Var4)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i6 |= i8;
                    }
                    i9 = i2 & 64;
                    if (i9 != 0) {
                        if ((1572864 & i) == 0) {
                            vu30Var5 = vu30Var2;
                            if (b0kVar3.i(vu30Var5)) {
                                i10 = 1048576;
                            } else {
                                i10 = 524288;
                            }
                            i6 |= i10;
                        }
                        if ((12582912 & i) != 0) {
                            if (b0kVar3.i(vu30Var3)) {
                                i13 = 8388608;
                            } else {
                                i13 = 4194304;
                            }
                            i6 |= i13;
                        }
                        if ((4793491 & i6) != 4793490) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (b0kVar3.Y(i6 & 1, z)) {
                            b0kVar3.d0();
                            if ((i & 1) != 0) {
                                if (i15 != 0) {
                                    qim0Var4 = nim0.a;
                                } else {
                                    qim0Var4 = qim0Var2;
                                }
                                if (i3 != 0) {
                                    maxVar2 = jax.a;
                                }
                                if ((i2 & 8) != 0) {
                                    i6 &= -7169;
                                    gdxVarR = yla.r(b0kVar3);
                                }
                                idn0VarY = zso1.Y(b0kVar3);
                                i11 = i6 & (-57345);
                                if (i7 != 0) {
                                    vu30Var4 = null;
                                }
                                vu30Var8 = vu30Var4;
                                if (i9 != 0) {
                                    qim0Var5 = qim0Var4;
                                    idn0Var3 = idn0VarY;
                                    i12 = i11;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var9 = null;
                                } else {
                                    idn0Var3 = idn0VarY;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var9 = vu30Var5;
                                    qim0Var5 = qim0Var4;
                                    i12 = i11;
                                }
                            } else {
                                if (i15 != 0) {
                                    qim0Var4 = nim0.a;
                                } else {
                                    qim0Var4 = qim0Var2;
                                }
                                if (i3 != 0) {
                                    maxVar2 = jax.a;
                                }
                                if ((i2 & 8) != 0) {
                                    i6 &= -7169;
                                    gdxVarR = yla.r(b0kVar3);
                                }
                                idn0VarY = zso1.Y(b0kVar3);
                                i11 = i6 & (-57345);
                                if (i7 != 0) {
                                    vu30Var4 = null;
                                }
                                vu30Var8 = vu30Var4;
                                if (i9 != 0) {
                                    qim0Var5 = qim0Var4;
                                    idn0Var3 = idn0VarY;
                                    i12 = i11;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var9 = null;
                                } else {
                                    idn0Var3 = idn0VarY;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var9 = vu30Var5;
                                    qim0Var5 = qim0Var4;
                                    i12 = i11;
                                }
                            }
                            b0kVar3.s();
                            int i1117 = i12 << 6;
                            b0kVar2 = b0kVar3;
                            c(gbxVar, new idx(19), qim0Var5, maxVar4, gdxVar3, null, idn0Var3, null, vu30Var8, vu30Var9, vu30Var3, b0kVar2, (i12 & 14) | ((i12 << 3) & 896) | (57344 & i1117) | (i1117 & 458752) | ((i12 << 12) & 1879048192), (i12 >> 18) & 126, 328);
                            qim0Var3 = qim0Var5;
                            maxVar3 = maxVar4;
                            gdxVar2 = gdxVar3;
                            idn0Var2 = idn0Var3;
                            vu30Var7 = vu30Var8;
                            vu30Var6 = vu30Var9;
                        } else {
                            b0kVar2 = b0kVar3;
                            b0kVar2.b0();
                            qim0Var3 = qim0Var2;
                            maxVar3 = maxVar2;
                            gdxVar2 = gdxVarR;
                            vu30Var6 = vu30Var5;
                            idn0Var2 = idn0Var;
                            vu30Var7 = vu30Var4;
                        }
                        h311VarV = b0kVar2.v();
                        if (h311VarV != null) {
                            h311VarV.d = new fdx(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var7, vu30Var6, vu30Var3, i, i2, (byte) 0);
                        }
                    }
                    i6 |= 1572864;
                    vu30Var5 = vu30Var2;
                    if ((12582912 & i) != 0) {
                        if (b0kVar3.i(vu30Var3)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i6 |= i13;
                    }
                    if ((4793491 & i6) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (b0kVar3.Y(i6 & 1, z)) {
                        b0kVar3.d0();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i3 != 0) {
                                maxVar2 = jax.a;
                            }
                            if ((i2 & 8) != 0) {
                                i6 &= -7169;
                                gdxVarR = yla.r(b0kVar3);
                            }
                            idn0VarY = zso1.Y(b0kVar3);
                            i11 = i6 & (-57345);
                            if (i7 != 0) {
                                vu30Var4 = null;
                            }
                            vu30Var8 = vu30Var4;
                            if (i9 != 0) {
                                qim0Var5 = qim0Var4;
                                idn0Var3 = idn0VarY;
                                i12 = i11;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var9 = null;
                            } else {
                                idn0Var3 = idn0VarY;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var9 = vu30Var5;
                                qim0Var5 = qim0Var4;
                                i12 = i11;
                            }
                        } else {
                            if (i15 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i3 != 0) {
                                maxVar2 = jax.a;
                            }
                            if ((i2 & 8) != 0) {
                                i6 &= -7169;
                                gdxVarR = yla.r(b0kVar3);
                            }
                            idn0VarY = zso1.Y(b0kVar3);
                            i11 = i6 & (-57345);
                            if (i7 != 0) {
                                vu30Var4 = null;
                            }
                            vu30Var8 = vu30Var4;
                            if (i9 != 0) {
                                qim0Var5 = qim0Var4;
                                idn0Var3 = idn0VarY;
                                i12 = i11;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var9 = null;
                            } else {
                                idn0Var3 = idn0VarY;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var9 = vu30Var5;
                                qim0Var5 = qim0Var4;
                                i12 = i11;
                            }
                        }
                        b0kVar3.s();
                        int i1118 = i12 << 6;
                        b0kVar2 = b0kVar3;
                        c(gbxVar, new idx(19), qim0Var5, maxVar4, gdxVar3, null, idn0Var3, null, vu30Var8, vu30Var9, vu30Var3, b0kVar2, (i12 & 14) | ((i12 << 3) & 896) | (57344 & i1118) | (i1118 & 458752) | ((i12 << 12) & 1879048192), (i12 >> 18) & 126, 328);
                        qim0Var3 = qim0Var5;
                        maxVar3 = maxVar4;
                        gdxVar2 = gdxVar3;
                        idn0Var2 = idn0Var3;
                        vu30Var7 = vu30Var8;
                        vu30Var6 = vu30Var9;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        qim0Var3 = qim0Var2;
                        maxVar3 = maxVar2;
                        gdxVar2 = gdxVarR;
                        vu30Var6 = vu30Var5;
                        idn0Var2 = idn0Var;
                        vu30Var7 = vu30Var4;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new fdx(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var7, vu30Var6, vu30Var3, i, i2, (byte) 0);
                    }
                }
                i6 = 204800 | i5;
                vu30Var4 = vu30Var;
                i9 = i2 & 64;
                if (i9 != 0) {
                    if ((1572864 & i) == 0) {
                        vu30Var5 = vu30Var2;
                        if (b0kVar3.i(vu30Var5)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i6 |= i10;
                    }
                    if ((12582912 & i) != 0) {
                        if (b0kVar3.i(vu30Var3)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i6 |= i13;
                    }
                    if ((4793491 & i6) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (b0kVar3.Y(i6 & 1, z)) {
                        b0kVar3.d0();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i3 != 0) {
                                maxVar2 = jax.a;
                            }
                            if ((i2 & 8) != 0) {
                                i6 &= -7169;
                                gdxVarR = yla.r(b0kVar3);
                            }
                            idn0VarY = zso1.Y(b0kVar3);
                            i11 = i6 & (-57345);
                            if (i7 != 0) {
                                vu30Var4 = null;
                            }
                            vu30Var8 = vu30Var4;
                            if (i9 != 0) {
                                qim0Var5 = qim0Var4;
                                idn0Var3 = idn0VarY;
                                i12 = i11;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var9 = null;
                            } else {
                                idn0Var3 = idn0VarY;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var9 = vu30Var5;
                                qim0Var5 = qim0Var4;
                                i12 = i11;
                            }
                        } else {
                            if (i15 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i3 != 0) {
                                maxVar2 = jax.a;
                            }
                            if ((i2 & 8) != 0) {
                                i6 &= -7169;
                                gdxVarR = yla.r(b0kVar3);
                            }
                            idn0VarY = zso1.Y(b0kVar3);
                            i11 = i6 & (-57345);
                            if (i7 != 0) {
                                vu30Var4 = null;
                            }
                            vu30Var8 = vu30Var4;
                            if (i9 != 0) {
                                qim0Var5 = qim0Var4;
                                idn0Var3 = idn0VarY;
                                i12 = i11;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var9 = null;
                            } else {
                                idn0Var3 = idn0VarY;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var9 = vu30Var5;
                                qim0Var5 = qim0Var4;
                                i12 = i11;
                            }
                        }
                        b0kVar3.s();
                        int i1119 = i12 << 6;
                        b0kVar2 = b0kVar3;
                        c(gbxVar, new idx(19), qim0Var5, maxVar4, gdxVar3, null, idn0Var3, null, vu30Var8, vu30Var9, vu30Var3, b0kVar2, (i12 & 14) | ((i12 << 3) & 896) | (57344 & i1119) | (i1119 & 458752) | ((i12 << 12) & 1879048192), (i12 >> 18) & 126, 328);
                        qim0Var3 = qim0Var5;
                        maxVar3 = maxVar4;
                        gdxVar2 = gdxVar3;
                        idn0Var2 = idn0Var3;
                        vu30Var7 = vu30Var8;
                        vu30Var6 = vu30Var9;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        qim0Var3 = qim0Var2;
                        maxVar3 = maxVar2;
                        gdxVar2 = gdxVarR;
                        vu30Var6 = vu30Var5;
                        idn0Var2 = idn0Var;
                        vu30Var7 = vu30Var4;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new fdx(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var7, vu30Var6, vu30Var3, i, i2, (byte) 0);
                    }
                }
                i6 |= 1572864;
                vu30Var5 = vu30Var2;
                if ((12582912 & i) != 0) {
                    if (b0kVar3.i(vu30Var3)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i6 |= i13;
                }
                if ((4793491 & i6) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i6 & 1, z)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i3 != 0) {
                            maxVar2 = jax.a;
                        }
                        if ((i2 & 8) != 0) {
                            i6 &= -7169;
                            gdxVarR = yla.r(b0kVar3);
                        }
                        idn0VarY = zso1.Y(b0kVar3);
                        i11 = i6 & (-57345);
                        if (i7 != 0) {
                            vu30Var4 = null;
                        }
                        vu30Var8 = vu30Var4;
                        if (i9 != 0) {
                            qim0Var5 = qim0Var4;
                            idn0Var3 = idn0VarY;
                            i12 = i11;
                            maxVar4 = maxVar2;
                            gdxVar3 = gdxVarR;
                            vu30Var9 = null;
                        } else {
                            idn0Var3 = idn0VarY;
                            maxVar4 = maxVar2;
                            gdxVar3 = gdxVarR;
                            vu30Var9 = vu30Var5;
                            qim0Var5 = qim0Var4;
                            i12 = i11;
                        }
                    } else {
                        if (i15 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i3 != 0) {
                            maxVar2 = jax.a;
                        }
                        if ((i2 & 8) != 0) {
                            i6 &= -7169;
                            gdxVarR = yla.r(b0kVar3);
                        }
                        idn0VarY = zso1.Y(b0kVar3);
                        i11 = i6 & (-57345);
                        if (i7 != 0) {
                            vu30Var4 = null;
                        }
                        vu30Var8 = vu30Var4;
                        if (i9 != 0) {
                            qim0Var5 = qim0Var4;
                            idn0Var3 = idn0VarY;
                            i12 = i11;
                            maxVar4 = maxVar2;
                            gdxVar3 = gdxVarR;
                            vu30Var9 = null;
                        } else {
                            idn0Var3 = idn0VarY;
                            maxVar4 = maxVar2;
                            gdxVar3 = gdxVarR;
                            vu30Var9 = vu30Var5;
                            qim0Var5 = qim0Var4;
                            i12 = i11;
                        }
                    }
                    b0kVar3.s();
                    int i11110 = i12 << 6;
                    b0kVar2 = b0kVar3;
                    c(gbxVar, new idx(19), qim0Var5, maxVar4, gdxVar3, null, idn0Var3, null, vu30Var8, vu30Var9, vu30Var3, b0kVar2, (i12 & 14) | ((i12 << 3) & 896) | (57344 & i11110) | (i11110 & 458752) | ((i12 << 12) & 1879048192), (i12 >> 18) & 126, 328);
                    qim0Var3 = qim0Var5;
                    maxVar3 = maxVar4;
                    gdxVar2 = gdxVar3;
                    idn0Var2 = idn0Var3;
                    vu30Var7 = vu30Var8;
                    vu30Var6 = vu30Var9;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    qim0Var3 = qim0Var2;
                    maxVar3 = maxVar2;
                    gdxVar2 = gdxVarR;
                    vu30Var6 = vu30Var5;
                    idn0Var2 = idn0Var;
                    vu30Var7 = vu30Var4;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new fdx(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var7, vu30Var6, vu30Var3, i, i2, (byte) 0);
                }
            }
            i14 |= 384;
            maxVar2 = maxVar;
            if ((i2 & 8) == 0) {
                gdxVarR = gdxVar;
                if (b0kVar3.g(gdxVarR)) {
                }
                i5 = i14 | i16;
                i6 = i5 | 8192;
                i7 = i2 & 32;
                if (i7 != 0) {
                    if ((196608 & i) == 0) {
                        vu30Var4 = vu30Var;
                        if (b0kVar3.i(vu30Var4)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i6 |= i8;
                    }
                    i9 = i2 & 64;
                    if (i9 != 0) {
                        if ((1572864 & i) == 0) {
                            vu30Var5 = vu30Var2;
                            if (b0kVar3.i(vu30Var5)) {
                                i10 = 1048576;
                            } else {
                                i10 = 524288;
                            }
                            i6 |= i10;
                        }
                        if ((12582912 & i) != 0) {
                            if (b0kVar3.i(vu30Var3)) {
                                i13 = 8388608;
                            } else {
                                i13 = 4194304;
                            }
                            i6 |= i13;
                        }
                        if ((4793491 & i6) != 4793490) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (b0kVar3.Y(i6 & 1, z)) {
                            b0kVar3.d0();
                            if ((i & 1) != 0) {
                                if (i15 != 0) {
                                    qim0Var4 = nim0.a;
                                } else {
                                    qim0Var4 = qim0Var2;
                                }
                                if (i3 != 0) {
                                    maxVar2 = jax.a;
                                }
                                if ((i2 & 8) != 0) {
                                    i6 &= -7169;
                                    gdxVarR = yla.r(b0kVar3);
                                }
                                idn0VarY = zso1.Y(b0kVar3);
                                i11 = i6 & (-57345);
                                if (i7 != 0) {
                                    vu30Var4 = null;
                                }
                                vu30Var8 = vu30Var4;
                                if (i9 != 0) {
                                    qim0Var5 = qim0Var4;
                                    idn0Var3 = idn0VarY;
                                    i12 = i11;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var9 = null;
                                } else {
                                    idn0Var3 = idn0VarY;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var9 = vu30Var5;
                                    qim0Var5 = qim0Var4;
                                    i12 = i11;
                                }
                            } else {
                                if (i15 != 0) {
                                    qim0Var4 = nim0.a;
                                } else {
                                    qim0Var4 = qim0Var2;
                                }
                                if (i3 != 0) {
                                    maxVar2 = jax.a;
                                }
                                if ((i2 & 8) != 0) {
                                    i6 &= -7169;
                                    gdxVarR = yla.r(b0kVar3);
                                }
                                idn0VarY = zso1.Y(b0kVar3);
                                i11 = i6 & (-57345);
                                if (i7 != 0) {
                                    vu30Var4 = null;
                                }
                                vu30Var8 = vu30Var4;
                                if (i9 != 0) {
                                    qim0Var5 = qim0Var4;
                                    idn0Var3 = idn0VarY;
                                    i12 = i11;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var9 = null;
                                } else {
                                    idn0Var3 = idn0VarY;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var9 = vu30Var5;
                                    qim0Var5 = qim0Var4;
                                    i12 = i11;
                                }
                            }
                            b0kVar3.s();
                            int i11111 = i12 << 6;
                            b0kVar2 = b0kVar3;
                            c(gbxVar, new idx(19), qim0Var5, maxVar4, gdxVar3, null, idn0Var3, null, vu30Var8, vu30Var9, vu30Var3, b0kVar2, (i12 & 14) | ((i12 << 3) & 896) | (57344 & i11111) | (i11111 & 458752) | ((i12 << 12) & 1879048192), (i12 >> 18) & 126, 328);
                            qim0Var3 = qim0Var5;
                            maxVar3 = maxVar4;
                            gdxVar2 = gdxVar3;
                            idn0Var2 = idn0Var3;
                            vu30Var7 = vu30Var8;
                            vu30Var6 = vu30Var9;
                        } else {
                            b0kVar2 = b0kVar3;
                            b0kVar2.b0();
                            qim0Var3 = qim0Var2;
                            maxVar3 = maxVar2;
                            gdxVar2 = gdxVarR;
                            vu30Var6 = vu30Var5;
                            idn0Var2 = idn0Var;
                            vu30Var7 = vu30Var4;
                        }
                        h311VarV = b0kVar2.v();
                        if (h311VarV != null) {
                            h311VarV.d = new fdx(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var7, vu30Var6, vu30Var3, i, i2, (byte) 0);
                        }
                    }
                    i6 |= 1572864;
                    vu30Var5 = vu30Var2;
                    if ((12582912 & i) != 0) {
                        if (b0kVar3.i(vu30Var3)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i6 |= i13;
                    }
                    if ((4793491 & i6) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (b0kVar3.Y(i6 & 1, z)) {
                        b0kVar3.d0();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i3 != 0) {
                                maxVar2 = jax.a;
                            }
                            if ((i2 & 8) != 0) {
                                i6 &= -7169;
                                gdxVarR = yla.r(b0kVar3);
                            }
                            idn0VarY = zso1.Y(b0kVar3);
                            i11 = i6 & (-57345);
                            if (i7 != 0) {
                                vu30Var4 = null;
                            }
                            vu30Var8 = vu30Var4;
                            if (i9 != 0) {
                                qim0Var5 = qim0Var4;
                                idn0Var3 = idn0VarY;
                                i12 = i11;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var9 = null;
                            } else {
                                idn0Var3 = idn0VarY;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var9 = vu30Var5;
                                qim0Var5 = qim0Var4;
                                i12 = i11;
                            }
                        } else {
                            if (i15 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i3 != 0) {
                                maxVar2 = jax.a;
                            }
                            if ((i2 & 8) != 0) {
                                i6 &= -7169;
                                gdxVarR = yla.r(b0kVar3);
                            }
                            idn0VarY = zso1.Y(b0kVar3);
                            i11 = i6 & (-57345);
                            if (i7 != 0) {
                                vu30Var4 = null;
                            }
                            vu30Var8 = vu30Var4;
                            if (i9 != 0) {
                                qim0Var5 = qim0Var4;
                                idn0Var3 = idn0VarY;
                                i12 = i11;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var9 = null;
                            } else {
                                idn0Var3 = idn0VarY;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var9 = vu30Var5;
                                qim0Var5 = qim0Var4;
                                i12 = i11;
                            }
                        }
                        b0kVar3.s();
                        int i11112 = i12 << 6;
                        b0kVar2 = b0kVar3;
                        c(gbxVar, new idx(19), qim0Var5, maxVar4, gdxVar3, null, idn0Var3, null, vu30Var8, vu30Var9, vu30Var3, b0kVar2, (i12 & 14) | ((i12 << 3) & 896) | (57344 & i11112) | (i11112 & 458752) | ((i12 << 12) & 1879048192), (i12 >> 18) & 126, 328);
                        qim0Var3 = qim0Var5;
                        maxVar3 = maxVar4;
                        gdxVar2 = gdxVar3;
                        idn0Var2 = idn0Var3;
                        vu30Var7 = vu30Var8;
                        vu30Var6 = vu30Var9;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        qim0Var3 = qim0Var2;
                        maxVar3 = maxVar2;
                        gdxVar2 = gdxVarR;
                        vu30Var6 = vu30Var5;
                        idn0Var2 = idn0Var;
                        vu30Var7 = vu30Var4;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new fdx(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var7, vu30Var6, vu30Var3, i, i2, (byte) 0);
                    }
                }
                i6 = 204800 | i5;
                vu30Var4 = vu30Var;
                i9 = i2 & 64;
                if (i9 != 0) {
                    if ((1572864 & i) == 0) {
                        vu30Var5 = vu30Var2;
                        if (b0kVar3.i(vu30Var5)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i6 |= i10;
                    }
                    if ((12582912 & i) != 0) {
                        if (b0kVar3.i(vu30Var3)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i6 |= i13;
                    }
                    if ((4793491 & i6) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (b0kVar3.Y(i6 & 1, z)) {
                        b0kVar3.d0();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i3 != 0) {
                                maxVar2 = jax.a;
                            }
                            if ((i2 & 8) != 0) {
                                i6 &= -7169;
                                gdxVarR = yla.r(b0kVar3);
                            }
                            idn0VarY = zso1.Y(b0kVar3);
                            i11 = i6 & (-57345);
                            if (i7 != 0) {
                                vu30Var4 = null;
                            }
                            vu30Var8 = vu30Var4;
                            if (i9 != 0) {
                                qim0Var5 = qim0Var4;
                                idn0Var3 = idn0VarY;
                                i12 = i11;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var9 = null;
                            } else {
                                idn0Var3 = idn0VarY;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var9 = vu30Var5;
                                qim0Var5 = qim0Var4;
                                i12 = i11;
                            }
                        } else {
                            if (i15 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i3 != 0) {
                                maxVar2 = jax.a;
                            }
                            if ((i2 & 8) != 0) {
                                i6 &= -7169;
                                gdxVarR = yla.r(b0kVar3);
                            }
                            idn0VarY = zso1.Y(b0kVar3);
                            i11 = i6 & (-57345);
                            if (i7 != 0) {
                                vu30Var4 = null;
                            }
                            vu30Var8 = vu30Var4;
                            if (i9 != 0) {
                                qim0Var5 = qim0Var4;
                                idn0Var3 = idn0VarY;
                                i12 = i11;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var9 = null;
                            } else {
                                idn0Var3 = idn0VarY;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var9 = vu30Var5;
                                qim0Var5 = qim0Var4;
                                i12 = i11;
                            }
                        }
                        b0kVar3.s();
                        int i11113 = i12 << 6;
                        b0kVar2 = b0kVar3;
                        c(gbxVar, new idx(19), qim0Var5, maxVar4, gdxVar3, null, idn0Var3, null, vu30Var8, vu30Var9, vu30Var3, b0kVar2, (i12 & 14) | ((i12 << 3) & 896) | (57344 & i11113) | (i11113 & 458752) | ((i12 << 12) & 1879048192), (i12 >> 18) & 126, 328);
                        qim0Var3 = qim0Var5;
                        maxVar3 = maxVar4;
                        gdxVar2 = gdxVar3;
                        idn0Var2 = idn0Var3;
                        vu30Var7 = vu30Var8;
                        vu30Var6 = vu30Var9;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        qim0Var3 = qim0Var2;
                        maxVar3 = maxVar2;
                        gdxVar2 = gdxVarR;
                        vu30Var6 = vu30Var5;
                        idn0Var2 = idn0Var;
                        vu30Var7 = vu30Var4;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new fdx(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var7, vu30Var6, vu30Var3, i, i2, (byte) 0);
                    }
                }
                i6 |= 1572864;
                vu30Var5 = vu30Var2;
                if ((12582912 & i) != 0) {
                    if (b0kVar3.i(vu30Var3)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i6 |= i13;
                }
                if ((4793491 & i6) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i6 & 1, z)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i3 != 0) {
                            maxVar2 = jax.a;
                        }
                        if ((i2 & 8) != 0) {
                            i6 &= -7169;
                            gdxVarR = yla.r(b0kVar3);
                        }
                        idn0VarY = zso1.Y(b0kVar3);
                        i11 = i6 & (-57345);
                        if (i7 != 0) {
                            vu30Var4 = null;
                        }
                        vu30Var8 = vu30Var4;
                        if (i9 != 0) {
                            qim0Var5 = qim0Var4;
                            idn0Var3 = idn0VarY;
                            i12 = i11;
                            maxVar4 = maxVar2;
                            gdxVar3 = gdxVarR;
                            vu30Var9 = null;
                        } else {
                            idn0Var3 = idn0VarY;
                            maxVar4 = maxVar2;
                            gdxVar3 = gdxVarR;
                            vu30Var9 = vu30Var5;
                            qim0Var5 = qim0Var4;
                            i12 = i11;
                        }
                    } else {
                        if (i15 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i3 != 0) {
                            maxVar2 = jax.a;
                        }
                        if ((i2 & 8) != 0) {
                            i6 &= -7169;
                            gdxVarR = yla.r(b0kVar3);
                        }
                        idn0VarY = zso1.Y(b0kVar3);
                        i11 = i6 & (-57345);
                        if (i7 != 0) {
                            vu30Var4 = null;
                        }
                        vu30Var8 = vu30Var4;
                        if (i9 != 0) {
                            qim0Var5 = qim0Var4;
                            idn0Var3 = idn0VarY;
                            i12 = i11;
                            maxVar4 = maxVar2;
                            gdxVar3 = gdxVarR;
                            vu30Var9 = null;
                        } else {
                            idn0Var3 = idn0VarY;
                            maxVar4 = maxVar2;
                            gdxVar3 = gdxVarR;
                            vu30Var9 = vu30Var5;
                            qim0Var5 = qim0Var4;
                            i12 = i11;
                        }
                    }
                    b0kVar3.s();
                    int i11114 = i12 << 6;
                    b0kVar2 = b0kVar3;
                    c(gbxVar, new idx(19), qim0Var5, maxVar4, gdxVar3, null, idn0Var3, null, vu30Var8, vu30Var9, vu30Var3, b0kVar2, (i12 & 14) | ((i12 << 3) & 896) | (57344 & i11114) | (i11114 & 458752) | ((i12 << 12) & 1879048192), (i12 >> 18) & 126, 328);
                    qim0Var3 = qim0Var5;
                    maxVar3 = maxVar4;
                    gdxVar2 = gdxVar3;
                    idn0Var2 = idn0Var3;
                    vu30Var7 = vu30Var8;
                    vu30Var6 = vu30Var9;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    qim0Var3 = qim0Var2;
                    maxVar3 = maxVar2;
                    gdxVar2 = gdxVarR;
                    vu30Var6 = vu30Var5;
                    idn0Var2 = idn0Var;
                    vu30Var7 = vu30Var4;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new fdx(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var7, vu30Var6, vu30Var3, i, i2, (byte) 0);
                }
            }
            gdxVarR = gdxVar;
            i5 = i14 | i16;
            i6 = i5 | 8192;
            i7 = i2 & 32;
            if (i7 != 0) {
                if ((196608 & i) == 0) {
                    vu30Var4 = vu30Var;
                    if (b0kVar3.i(vu30Var4)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i6 |= i8;
                }
                i9 = i2 & 64;
                if (i9 != 0) {
                    if ((1572864 & i) == 0) {
                        vu30Var5 = vu30Var2;
                        if (b0kVar3.i(vu30Var5)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i6 |= i10;
                    }
                    if ((12582912 & i) != 0) {
                        if (b0kVar3.i(vu30Var3)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i6 |= i13;
                    }
                    if ((4793491 & i6) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (b0kVar3.Y(i6 & 1, z)) {
                        b0kVar3.d0();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i3 != 0) {
                                maxVar2 = jax.a;
                            }
                            if ((i2 & 8) != 0) {
                                i6 &= -7169;
                                gdxVarR = yla.r(b0kVar3);
                            }
                            idn0VarY = zso1.Y(b0kVar3);
                            i11 = i6 & (-57345);
                            if (i7 != 0) {
                                vu30Var4 = null;
                            }
                            vu30Var8 = vu30Var4;
                            if (i9 != 0) {
                                qim0Var5 = qim0Var4;
                                idn0Var3 = idn0VarY;
                                i12 = i11;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var9 = null;
                            } else {
                                idn0Var3 = idn0VarY;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var9 = vu30Var5;
                                qim0Var5 = qim0Var4;
                                i12 = i11;
                            }
                        } else {
                            if (i15 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i3 != 0) {
                                maxVar2 = jax.a;
                            }
                            if ((i2 & 8) != 0) {
                                i6 &= -7169;
                                gdxVarR = yla.r(b0kVar3);
                            }
                            idn0VarY = zso1.Y(b0kVar3);
                            i11 = i6 & (-57345);
                            if (i7 != 0) {
                                vu30Var4 = null;
                            }
                            vu30Var8 = vu30Var4;
                            if (i9 != 0) {
                                qim0Var5 = qim0Var4;
                                idn0Var3 = idn0VarY;
                                i12 = i11;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var9 = null;
                            } else {
                                idn0Var3 = idn0VarY;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var9 = vu30Var5;
                                qim0Var5 = qim0Var4;
                                i12 = i11;
                            }
                        }
                        b0kVar3.s();
                        int i11115 = i12 << 6;
                        b0kVar2 = b0kVar3;
                        c(gbxVar, new idx(19), qim0Var5, maxVar4, gdxVar3, null, idn0Var3, null, vu30Var8, vu30Var9, vu30Var3, b0kVar2, (i12 & 14) | ((i12 << 3) & 896) | (57344 & i11115) | (i11115 & 458752) | ((i12 << 12) & 1879048192), (i12 >> 18) & 126, 328);
                        qim0Var3 = qim0Var5;
                        maxVar3 = maxVar4;
                        gdxVar2 = gdxVar3;
                        idn0Var2 = idn0Var3;
                        vu30Var7 = vu30Var8;
                        vu30Var6 = vu30Var9;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        qim0Var3 = qim0Var2;
                        maxVar3 = maxVar2;
                        gdxVar2 = gdxVarR;
                        vu30Var6 = vu30Var5;
                        idn0Var2 = idn0Var;
                        vu30Var7 = vu30Var4;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new fdx(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var7, vu30Var6, vu30Var3, i, i2, (byte) 0);
                    }
                }
                i6 |= 1572864;
                vu30Var5 = vu30Var2;
                if ((12582912 & i) != 0) {
                    if (b0kVar3.i(vu30Var3)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i6 |= i13;
                }
                if ((4793491 & i6) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i6 & 1, z)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i3 != 0) {
                            maxVar2 = jax.a;
                        }
                        if ((i2 & 8) != 0) {
                            i6 &= -7169;
                            gdxVarR = yla.r(b0kVar3);
                        }
                        idn0VarY = zso1.Y(b0kVar3);
                        i11 = i6 & (-57345);
                        if (i7 != 0) {
                            vu30Var4 = null;
                        }
                        vu30Var8 = vu30Var4;
                        if (i9 != 0) {
                            qim0Var5 = qim0Var4;
                            idn0Var3 = idn0VarY;
                            i12 = i11;
                            maxVar4 = maxVar2;
                            gdxVar3 = gdxVarR;
                            vu30Var9 = null;
                        } else {
                            idn0Var3 = idn0VarY;
                            maxVar4 = maxVar2;
                            gdxVar3 = gdxVarR;
                            vu30Var9 = vu30Var5;
                            qim0Var5 = qim0Var4;
                            i12 = i11;
                        }
                    } else {
                        if (i15 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i3 != 0) {
                            maxVar2 = jax.a;
                        }
                        if ((i2 & 8) != 0) {
                            i6 &= -7169;
                            gdxVarR = yla.r(b0kVar3);
                        }
                        idn0VarY = zso1.Y(b0kVar3);
                        i11 = i6 & (-57345);
                        if (i7 != 0) {
                            vu30Var4 = null;
                        }
                        vu30Var8 = vu30Var4;
                        if (i9 != 0) {
                            qim0Var5 = qim0Var4;
                            idn0Var3 = idn0VarY;
                            i12 = i11;
                            maxVar4 = maxVar2;
                            gdxVar3 = gdxVarR;
                            vu30Var9 = null;
                        } else {
                            idn0Var3 = idn0VarY;
                            maxVar4 = maxVar2;
                            gdxVar3 = gdxVarR;
                            vu30Var9 = vu30Var5;
                            qim0Var5 = qim0Var4;
                            i12 = i11;
                        }
                    }
                    b0kVar3.s();
                    int i11116 = i12 << 6;
                    b0kVar2 = b0kVar3;
                    c(gbxVar, new idx(19), qim0Var5, maxVar4, gdxVar3, null, idn0Var3, null, vu30Var8, vu30Var9, vu30Var3, b0kVar2, (i12 & 14) | ((i12 << 3) & 896) | (57344 & i11116) | (i11116 & 458752) | ((i12 << 12) & 1879048192), (i12 >> 18) & 126, 328);
                    qim0Var3 = qim0Var5;
                    maxVar3 = maxVar4;
                    gdxVar2 = gdxVar3;
                    idn0Var2 = idn0Var3;
                    vu30Var7 = vu30Var8;
                    vu30Var6 = vu30Var9;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    qim0Var3 = qim0Var2;
                    maxVar3 = maxVar2;
                    gdxVar2 = gdxVarR;
                    vu30Var6 = vu30Var5;
                    idn0Var2 = idn0Var;
                    vu30Var7 = vu30Var4;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new fdx(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var7, vu30Var6, vu30Var3, i, i2, (byte) 0);
                }
            }
            i6 = 204800 | i5;
            vu30Var4 = vu30Var;
            i9 = i2 & 64;
            if (i9 != 0) {
                if ((1572864 & i) == 0) {
                    vu30Var5 = vu30Var2;
                    if (b0kVar3.i(vu30Var5)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i6 |= i10;
                }
                if ((12582912 & i) != 0) {
                    if (b0kVar3.i(vu30Var3)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i6 |= i13;
                }
                if ((4793491 & i6) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i6 & 1, z)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i3 != 0) {
                            maxVar2 = jax.a;
                        }
                        if ((i2 & 8) != 0) {
                            i6 &= -7169;
                            gdxVarR = yla.r(b0kVar3);
                        }
                        idn0VarY = zso1.Y(b0kVar3);
                        i11 = i6 & (-57345);
                        if (i7 != 0) {
                            vu30Var4 = null;
                        }
                        vu30Var8 = vu30Var4;
                        if (i9 != 0) {
                            qim0Var5 = qim0Var4;
                            idn0Var3 = idn0VarY;
                            i12 = i11;
                            maxVar4 = maxVar2;
                            gdxVar3 = gdxVarR;
                            vu30Var9 = null;
                        } else {
                            idn0Var3 = idn0VarY;
                            maxVar4 = maxVar2;
                            gdxVar3 = gdxVarR;
                            vu30Var9 = vu30Var5;
                            qim0Var5 = qim0Var4;
                            i12 = i11;
                        }
                    } else {
                        if (i15 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i3 != 0) {
                            maxVar2 = jax.a;
                        }
                        if ((i2 & 8) != 0) {
                            i6 &= -7169;
                            gdxVarR = yla.r(b0kVar3);
                        }
                        idn0VarY = zso1.Y(b0kVar3);
                        i11 = i6 & (-57345);
                        if (i7 != 0) {
                            vu30Var4 = null;
                        }
                        vu30Var8 = vu30Var4;
                        if (i9 != 0) {
                            qim0Var5 = qim0Var4;
                            idn0Var3 = idn0VarY;
                            i12 = i11;
                            maxVar4 = maxVar2;
                            gdxVar3 = gdxVarR;
                            vu30Var9 = null;
                        } else {
                            idn0Var3 = idn0VarY;
                            maxVar4 = maxVar2;
                            gdxVar3 = gdxVarR;
                            vu30Var9 = vu30Var5;
                            qim0Var5 = qim0Var4;
                            i12 = i11;
                        }
                    }
                    b0kVar3.s();
                    int i11117 = i12 << 6;
                    b0kVar2 = b0kVar3;
                    c(gbxVar, new idx(19), qim0Var5, maxVar4, gdxVar3, null, idn0Var3, null, vu30Var8, vu30Var9, vu30Var3, b0kVar2, (i12 & 14) | ((i12 << 3) & 896) | (57344 & i11117) | (i11117 & 458752) | ((i12 << 12) & 1879048192), (i12 >> 18) & 126, 328);
                    qim0Var3 = qim0Var5;
                    maxVar3 = maxVar4;
                    gdxVar2 = gdxVar3;
                    idn0Var2 = idn0Var3;
                    vu30Var7 = vu30Var8;
                    vu30Var6 = vu30Var9;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    qim0Var3 = qim0Var2;
                    maxVar3 = maxVar2;
                    gdxVar2 = gdxVarR;
                    vu30Var6 = vu30Var5;
                    idn0Var2 = idn0Var;
                    vu30Var7 = vu30Var4;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new fdx(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var7, vu30Var6, vu30Var3, i, i2, (byte) 0);
                }
            }
            i6 |= 1572864;
            vu30Var5 = vu30Var2;
            if ((12582912 & i) != 0) {
                if (b0kVar3.i(vu30Var3)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i6 |= i13;
            }
            if ((4793491 & i6) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i6 & 1, z)) {
                b0kVar3.d0();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i3 != 0) {
                        maxVar2 = jax.a;
                    }
                    if ((i2 & 8) != 0) {
                        i6 &= -7169;
                        gdxVarR = yla.r(b0kVar3);
                    }
                    idn0VarY = zso1.Y(b0kVar3);
                    i11 = i6 & (-57345);
                    if (i7 != 0) {
                        vu30Var4 = null;
                    }
                    vu30Var8 = vu30Var4;
                    if (i9 != 0) {
                        qim0Var5 = qim0Var4;
                        idn0Var3 = idn0VarY;
                        i12 = i11;
                        maxVar4 = maxVar2;
                        gdxVar3 = gdxVarR;
                        vu30Var9 = null;
                    } else {
                        idn0Var3 = idn0VarY;
                        maxVar4 = maxVar2;
                        gdxVar3 = gdxVarR;
                        vu30Var9 = vu30Var5;
                        qim0Var5 = qim0Var4;
                        i12 = i11;
                    }
                } else {
                    if (i15 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i3 != 0) {
                        maxVar2 = jax.a;
                    }
                    if ((i2 & 8) != 0) {
                        i6 &= -7169;
                        gdxVarR = yla.r(b0kVar3);
                    }
                    idn0VarY = zso1.Y(b0kVar3);
                    i11 = i6 & (-57345);
                    if (i7 != 0) {
                        vu30Var4 = null;
                    }
                    vu30Var8 = vu30Var4;
                    if (i9 != 0) {
                        qim0Var5 = qim0Var4;
                        idn0Var3 = idn0VarY;
                        i12 = i11;
                        maxVar4 = maxVar2;
                        gdxVar3 = gdxVarR;
                        vu30Var9 = null;
                    } else {
                        idn0Var3 = idn0VarY;
                        maxVar4 = maxVar2;
                        gdxVar3 = gdxVarR;
                        vu30Var9 = vu30Var5;
                        qim0Var5 = qim0Var4;
                        i12 = i11;
                    }
                }
                b0kVar3.s();
                int i11118 = i12 << 6;
                b0kVar2 = b0kVar3;
                c(gbxVar, new idx(19), qim0Var5, maxVar4, gdxVar3, null, idn0Var3, null, vu30Var8, vu30Var9, vu30Var3, b0kVar2, (i12 & 14) | ((i12 << 3) & 896) | (57344 & i11118) | (i11118 & 458752) | ((i12 << 12) & 1879048192), (i12 >> 18) & 126, 328);
                qim0Var3 = qim0Var5;
                maxVar3 = maxVar4;
                gdxVar2 = gdxVar3;
                idn0Var2 = idn0Var3;
                vu30Var7 = vu30Var8;
                vu30Var6 = vu30Var9;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var3 = qim0Var2;
                maxVar3 = maxVar2;
                gdxVar2 = gdxVarR;
                vu30Var6 = vu30Var5;
                idn0Var2 = idn0Var;
                vu30Var7 = vu30Var4;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new fdx(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var7, vu30Var6, vu30Var3, i, i2, (byte) 0);
            }
        }

        /* JADX WARN: Code duplicated, block: B:101:0x0118  */
        /* JADX WARN: Code duplicated, block: B:103:0x011b  */
        /* JADX WARN: Code duplicated, block: B:104:0x0125  */
        /* JADX WARN: Code duplicated, block: B:106:0x0168  */
        /* JADX WARN: Code duplicated, block: B:109:0x017a  */
        /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:23:0x003d  */
        /* JADX WARN: Code duplicated, block: B:25:0x0042  */
        /* JADX WARN: Code duplicated, block: B:27:0x0046  */
        /* JADX WARN: Code duplicated, block: B:29:0x004e  */
        /* JADX WARN: Code duplicated, block: B:30:0x0051  */
        /* JADX WARN: Code duplicated, block: B:34:0x0058  */
        /* JADX WARN: Code duplicated, block: B:36:0x005c  */
        /* JADX WARN: Code duplicated, block: B:38:0x0064  */
        /* JADX WARN: Code duplicated, block: B:39:0x0067  */
        /* JADX WARN: Code duplicated, block: B:42:0x006d  */
        /* JADX WARN: Code duplicated, block: B:45:0x0073  */
        /* JADX WARN: Code duplicated, block: B:48:0x007b  */
        /* JADX WARN: Code duplicated, block: B:50:0x007f  */
        /* JADX WARN: Code duplicated, block: B:52:0x0082  */
        /* JADX WARN: Code duplicated, block: B:54:0x008a  */
        /* JADX WARN: Code duplicated, block: B:55:0x008d  */
        /* JADX WARN: Code duplicated, block: B:59:0x0096  */
        /* JADX WARN: Code duplicated, block: B:61:0x009a  */
        /* JADX WARN: Code duplicated, block: B:63:0x009d  */
        /* JADX WARN: Code duplicated, block: B:65:0x00a5  */
        /* JADX WARN: Code duplicated, block: B:66:0x00a8  */
        /* JADX WARN: Code duplicated, block: B:70:0x00b0  */
        /* JADX WARN: Code duplicated, block: B:72:0x00b8  */
        /* JADX WARN: Code duplicated, block: B:73:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:75:0x00bf  */
        /* JADX WARN: Code duplicated, block: B:78:0x00ca  */
        /* JADX WARN: Code duplicated, block: B:79:0x00cc  */
        /* JADX WARN: Code duplicated, block: B:82:0x00d5  */
        /* JADX WARN: Code duplicated, block: B:84:0x00df  */
        /* JADX WARN: Code duplicated, block: B:91:0x00fa A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:92:0x00fc  */
        /* JADX WARN: Code duplicated, block: B:93:0x00ff  */
        /* JADX WARN: Code duplicated, block: B:95:0x0102  */
        /* JADX WARN: Code duplicated, block: B:98:0x0109  */
        public static final void g(gbx gbxVar, qim0 qim0Var, max maxVar, gdx gdxVar, idn0 idn0Var, vu30 vu30Var, vu30 vu30Var2, j2i j2iVar, b0k b0kVar, int i, int i2) {
            int i3;
            qim0 qim0Var2;
            int i4;
            max maxVar2;
            int i5;
            gdx gdxVarR;
            int i6;
            vu30 vu30Var3;
            int i7;
            int i8;
            vu30 vu30Var4;
            int i9;
            boolean z;
            b0k b0kVar2;
            qim0 qim0Var3;
            max maxVar3;
            gdx gdxVar2;
            vu30 vu30Var5;
            vu30 vu30Var6;
            idn0 idn0Var2;
            h311 h311VarV;
            qim0 qim0Var4;
            idn0 idn0VarY;
            int i10;
            idn0 idn0Var3;
            max maxVar4;
            gdx gdxVar3;
            vu30 vu30Var7;
            vu30 vu30Var8;
            qim0 qim0Var5;
            int i11;
            b0k b0kVar3 = (x340) b0kVar;
            b0kVar3.k0(194430884);
            if ((i & 6) == 0) {
                i3 = (b0kVar3.g(gbxVar) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
            int i12 = i2 & 2;
            if (i12 == 0) {
                if ((i & 48) == 0) {
                    qim0Var2 = qim0Var;
                    i3 |= b0kVar3.g(qim0Var2) ? 32 : 16;
                }
                i4 = i2 & 4;
                if (i4 != 0) {
                    if ((i & 384) == 0) {
                        maxVar2 = maxVar;
                        if (b0kVar3.g(maxVar2)) {
                            i5 = 256;
                        } else {
                            i5 = 128;
                        }
                        i3 |= i5;
                    }
                    if ((i & 3072) == 0) {
                        if ((i2 & 8) == 0) {
                            gdxVarR = gdxVar;
                            int i13 = b0kVar3.g(gdxVarR) ? 2048 : 1024;
                            i3 |= i13;
                        } else {
                            gdxVarR = gdxVar;
                        }
                        i3 |= i13;
                    } else {
                        gdxVarR = gdxVar;
                    }
                    if ((i & 24576) == 0) {
                        i3 |= 8192;
                    }
                    i6 = i2 & 32;
                    if (i6 != 0) {
                        if ((196608 & i) == 0) {
                            vu30Var3 = vu30Var;
                            if (b0kVar3.i(vu30Var3)) {
                                i7 = 131072;
                            } else {
                                i7 = 65536;
                            }
                            i3 |= i7;
                        }
                        i8 = i2 & 64;
                        if (i8 != 0) {
                            if ((1572864 & i) == 0) {
                                vu30Var4 = vu30Var2;
                                if (b0kVar3.i(vu30Var4)) {
                                    i9 = 1048576;
                                } else {
                                    i9 = 524288;
                                }
                                i3 |= i9;
                            }
                            if ((12582912 & i) != 0) {
                                if (b0kVar3.i(j2iVar)) {
                                    i11 = 8388608;
                                } else {
                                    i11 = 4194304;
                                }
                                i3 |= i11;
                            }
                            if ((4793491 & i3) != 4793490) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (b0kVar3.Y(i3 & 1, z)) {
                                b0kVar3.d0();
                                if ((i & 1) != 0 || b0kVar3.E()) {
                                    if (i12 != 0) {
                                        qim0Var4 = nim0.a;
                                    } else {
                                        qim0Var4 = qim0Var2;
                                    }
                                    if (i4 != 0) {
                                        maxVar2 = jax.a;
                                    }
                                    if ((i2 & 8) != 0) {
                                        i3 &= -7169;
                                        gdxVarR = yla.r(b0kVar3);
                                    }
                                    idn0VarY = zso1.Y(b0kVar3);
                                    i10 = i3 & (-57345);
                                    if (i6 != 0) {
                                        vu30Var3 = null;
                                    }
                                    if (i8 != 0) {
                                        qim0Var5 = qim0Var4;
                                        idn0Var3 = idn0VarY;
                                        vu30Var8 = null;
                                        maxVar4 = maxVar2;
                                        gdxVar3 = gdxVarR;
                                        vu30Var7 = vu30Var3;
                                    } else {
                                        idn0Var3 = idn0VarY;
                                        maxVar4 = maxVar2;
                                        gdxVar3 = gdxVarR;
                                        vu30Var7 = vu30Var3;
                                        vu30Var8 = vu30Var4;
                                        qim0Var5 = qim0Var4;
                                    }
                                } else {
                                    b0kVar3.b0();
                                    if ((i2 & 8) != 0) {
                                        i3 &= -7169;
                                    }
                                    i10 = i3 & (-57345);
                                    idn0Var3 = idn0Var;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var7 = vu30Var3;
                                    vu30Var8 = vu30Var4;
                                    qim0Var5 = qim0Var2;
                                }
                                b0kVar3.s();
                                int i14 = i10 << 6;
                                b0kVar2 = b0kVar3;
                                c(gbxVar, jdx.c, qim0Var5, maxVar4, gdxVar3, null, idn0Var3, null, vu30Var7, vu30Var8, j2iVar, b0kVar2, (i10 & 14) | 48 | ((i10 << 3) & 896) | (57344 & i14) | (i14 & 458752) | ((i10 << 12) & 1879048192), (i10 >> 18) & 126, 328);
                                qim0Var3 = qim0Var5;
                                maxVar3 = maxVar4;
                                gdxVar2 = gdxVar3;
                                idn0Var2 = idn0Var3;
                                vu30Var5 = vu30Var7;
                                vu30Var6 = vu30Var8;
                            } else {
                                b0kVar2 = b0kVar3;
                                b0kVar2.b0();
                                qim0Var3 = qim0Var2;
                                maxVar3 = maxVar2;
                                gdxVar2 = gdxVarR;
                                vu30Var5 = vu30Var3;
                                vu30Var6 = vu30Var4;
                                idn0Var2 = idn0Var;
                            }
                            h311VarV = b0kVar2.v();
                            if (h311VarV != null) {
                                h311VarV.d = new fdx(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var5, vu30Var6, j2iVar, i, i2, (byte) 1);
                            }
                        }
                        i3 |= 1572864;
                        vu30Var4 = vu30Var2;
                        if ((12582912 & i) != 0) {
                            if (b0kVar3.i(j2iVar)) {
                                i11 = 8388608;
                            } else {
                                i11 = 4194304;
                            }
                            i3 |= i11;
                        }
                        if ((4793491 & i3) != 4793490) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (b0kVar3.Y(i3 & 1, z)) {
                            b0kVar3.d0();
                            if ((i & 1) != 0) {
                                if (i12 != 0) {
                                    qim0Var4 = nim0.a;
                                } else {
                                    qim0Var4 = qim0Var2;
                                }
                                if (i4 != 0) {
                                    maxVar2 = jax.a;
                                }
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                    gdxVarR = yla.r(b0kVar3);
                                }
                                idn0VarY = zso1.Y(b0kVar3);
                                i10 = i3 & (-57345);
                                if (i6 != 0) {
                                    vu30Var3 = null;
                                }
                                if (i8 != 0) {
                                    qim0Var5 = qim0Var4;
                                    idn0Var3 = idn0VarY;
                                    vu30Var8 = null;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var7 = vu30Var3;
                                } else {
                                    idn0Var3 = idn0VarY;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var7 = vu30Var3;
                                    vu30Var8 = vu30Var4;
                                    qim0Var5 = qim0Var4;
                                }
                            } else {
                                if (i12 != 0) {
                                    qim0Var4 = nim0.a;
                                } else {
                                    qim0Var4 = qim0Var2;
                                }
                                if (i4 != 0) {
                                    maxVar2 = jax.a;
                                }
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                    gdxVarR = yla.r(b0kVar3);
                                }
                                idn0VarY = zso1.Y(b0kVar3);
                                i10 = i3 & (-57345);
                                if (i6 != 0) {
                                    vu30Var3 = null;
                                }
                                if (i8 != 0) {
                                    qim0Var5 = qim0Var4;
                                    idn0Var3 = idn0VarY;
                                    vu30Var8 = null;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var7 = vu30Var3;
                                } else {
                                    idn0Var3 = idn0VarY;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var7 = vu30Var3;
                                    vu30Var8 = vu30Var4;
                                    qim0Var5 = qim0Var4;
                                }
                            }
                            b0kVar3.s();
                            int i15 = i10 << 6;
                            b0kVar2 = b0kVar3;
                            c(gbxVar, jdx.c, qim0Var5, maxVar4, gdxVar3, null, idn0Var3, null, vu30Var7, vu30Var8, j2iVar, b0kVar2, (i10 & 14) | 48 | ((i10 << 3) & 896) | (57344 & i15) | (i15 & 458752) | ((i10 << 12) & 1879048192), (i10 >> 18) & 126, 328);
                            qim0Var3 = qim0Var5;
                            maxVar3 = maxVar4;
                            gdxVar2 = gdxVar3;
                            idn0Var2 = idn0Var3;
                            vu30Var5 = vu30Var7;
                            vu30Var6 = vu30Var8;
                        } else {
                            b0kVar2 = b0kVar3;
                            b0kVar2.b0();
                            qim0Var3 = qim0Var2;
                            maxVar3 = maxVar2;
                            gdxVar2 = gdxVarR;
                            vu30Var5 = vu30Var3;
                            vu30Var6 = vu30Var4;
                            idn0Var2 = idn0Var;
                        }
                        h311VarV = b0kVar2.v();
                        if (h311VarV != null) {
                            h311VarV.d = new fdx(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var5, vu30Var6, j2iVar, i, i2, (byte) 1);
                        }
                    }
                    i3 |= 196608;
                    vu30Var3 = vu30Var;
                    i8 = i2 & 64;
                    if (i8 != 0) {
                        if ((1572864 & i) == 0) {
                            vu30Var4 = vu30Var2;
                            if (b0kVar3.i(vu30Var4)) {
                                i9 = 1048576;
                            } else {
                                i9 = 524288;
                            }
                            i3 |= i9;
                        }
                        if ((12582912 & i) != 0) {
                            if (b0kVar3.i(j2iVar)) {
                                i11 = 8388608;
                            } else {
                                i11 = 4194304;
                            }
                            i3 |= i11;
                        }
                        if ((4793491 & i3) != 4793490) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (b0kVar3.Y(i3 & 1, z)) {
                            b0kVar3.d0();
                            if ((i & 1) != 0) {
                                if (i12 != 0) {
                                    qim0Var4 = nim0.a;
                                } else {
                                    qim0Var4 = qim0Var2;
                                }
                                if (i4 != 0) {
                                    maxVar2 = jax.a;
                                }
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                    gdxVarR = yla.r(b0kVar3);
                                }
                                idn0VarY = zso1.Y(b0kVar3);
                                i10 = i3 & (-57345);
                                if (i6 != 0) {
                                    vu30Var3 = null;
                                }
                                if (i8 != 0) {
                                    qim0Var5 = qim0Var4;
                                    idn0Var3 = idn0VarY;
                                    vu30Var8 = null;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var7 = vu30Var3;
                                } else {
                                    idn0Var3 = idn0VarY;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var7 = vu30Var3;
                                    vu30Var8 = vu30Var4;
                                    qim0Var5 = qim0Var4;
                                }
                            } else {
                                if (i12 != 0) {
                                    qim0Var4 = nim0.a;
                                } else {
                                    qim0Var4 = qim0Var2;
                                }
                                if (i4 != 0) {
                                    maxVar2 = jax.a;
                                }
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                    gdxVarR = yla.r(b0kVar3);
                                }
                                idn0VarY = zso1.Y(b0kVar3);
                                i10 = i3 & (-57345);
                                if (i6 != 0) {
                                    vu30Var3 = null;
                                }
                                if (i8 != 0) {
                                    qim0Var5 = qim0Var4;
                                    idn0Var3 = idn0VarY;
                                    vu30Var8 = null;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var7 = vu30Var3;
                                } else {
                                    idn0Var3 = idn0VarY;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var7 = vu30Var3;
                                    vu30Var8 = vu30Var4;
                                    qim0Var5 = qim0Var4;
                                }
                            }
                            b0kVar3.s();
                            int i16 = i10 << 6;
                            b0kVar2 = b0kVar3;
                            c(gbxVar, jdx.c, qim0Var5, maxVar4, gdxVar3, null, idn0Var3, null, vu30Var7, vu30Var8, j2iVar, b0kVar2, (i10 & 14) | 48 | ((i10 << 3) & 896) | (57344 & i16) | (i16 & 458752) | ((i10 << 12) & 1879048192), (i10 >> 18) & 126, 328);
                            qim0Var3 = qim0Var5;
                            maxVar3 = maxVar4;
                            gdxVar2 = gdxVar3;
                            idn0Var2 = idn0Var3;
                            vu30Var5 = vu30Var7;
                            vu30Var6 = vu30Var8;
                        } else {
                            b0kVar2 = b0kVar3;
                            b0kVar2.b0();
                            qim0Var3 = qim0Var2;
                            maxVar3 = maxVar2;
                            gdxVar2 = gdxVarR;
                            vu30Var5 = vu30Var3;
                            vu30Var6 = vu30Var4;
                            idn0Var2 = idn0Var;
                        }
                        h311VarV = b0kVar2.v();
                        if (h311VarV != null) {
                            h311VarV.d = new fdx(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var5, vu30Var6, j2iVar, i, i2, (byte) 1);
                        }
                    }
                    i3 |= 1572864;
                    vu30Var4 = vu30Var2;
                    if ((12582912 & i) != 0) {
                        if (b0kVar3.i(j2iVar)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                        i3 |= i11;
                    }
                    if ((4793491 & i3) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (b0kVar3.Y(i3 & 1, z)) {
                        b0kVar3.d0();
                        if ((i & 1) != 0) {
                            if (i12 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i4 != 0) {
                                maxVar2 = jax.a;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                gdxVarR = yla.r(b0kVar3);
                            }
                            idn0VarY = zso1.Y(b0kVar3);
                            i10 = i3 & (-57345);
                            if (i6 != 0) {
                                vu30Var3 = null;
                            }
                            if (i8 != 0) {
                                qim0Var5 = qim0Var4;
                                idn0Var3 = idn0VarY;
                                vu30Var8 = null;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var7 = vu30Var3;
                            } else {
                                idn0Var3 = idn0VarY;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var7 = vu30Var3;
                                vu30Var8 = vu30Var4;
                                qim0Var5 = qim0Var4;
                            }
                        } else {
                            if (i12 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i4 != 0) {
                                maxVar2 = jax.a;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                gdxVarR = yla.r(b0kVar3);
                            }
                            idn0VarY = zso1.Y(b0kVar3);
                            i10 = i3 & (-57345);
                            if (i6 != 0) {
                                vu30Var3 = null;
                            }
                            if (i8 != 0) {
                                qim0Var5 = qim0Var4;
                                idn0Var3 = idn0VarY;
                                vu30Var8 = null;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var7 = vu30Var3;
                            } else {
                                idn0Var3 = idn0VarY;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var7 = vu30Var3;
                                vu30Var8 = vu30Var4;
                                qim0Var5 = qim0Var4;
                            }
                        }
                        b0kVar3.s();
                        int i17 = i10 << 6;
                        b0kVar2 = b0kVar3;
                        c(gbxVar, jdx.c, qim0Var5, maxVar4, gdxVar3, null, idn0Var3, null, vu30Var7, vu30Var8, j2iVar, b0kVar2, (i10 & 14) | 48 | ((i10 << 3) & 896) | (57344 & i17) | (i17 & 458752) | ((i10 << 12) & 1879048192), (i10 >> 18) & 126, 328);
                        qim0Var3 = qim0Var5;
                        maxVar3 = maxVar4;
                        gdxVar2 = gdxVar3;
                        idn0Var2 = idn0Var3;
                        vu30Var5 = vu30Var7;
                        vu30Var6 = vu30Var8;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        qim0Var3 = qim0Var2;
                        maxVar3 = maxVar2;
                        gdxVar2 = gdxVarR;
                        vu30Var5 = vu30Var3;
                        vu30Var6 = vu30Var4;
                        idn0Var2 = idn0Var;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new fdx(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var5, vu30Var6, j2iVar, i, i2, (byte) 1);
                    }
                }
                i3 |= 384;
                maxVar2 = maxVar;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        gdxVarR = gdxVar;
                        if (b0kVar3.g(gdxVarR)) {
                        }
                        i3 |= i13;
                    } else {
                        gdxVarR = gdxVar;
                    }
                    i3 |= i13;
                } else {
                    gdxVarR = gdxVar;
                }
                if ((i & 24576) == 0) {
                    i3 |= 8192;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((196608 & i) == 0) {
                        vu30Var3 = vu30Var;
                        if (b0kVar3.i(vu30Var3)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 64;
                    if (i8 != 0) {
                        if ((1572864 & i) == 0) {
                            vu30Var4 = vu30Var2;
                            if (b0kVar3.i(vu30Var4)) {
                                i9 = 1048576;
                            } else {
                                i9 = 524288;
                            }
                            i3 |= i9;
                        }
                        if ((12582912 & i) != 0) {
                            if (b0kVar3.i(j2iVar)) {
                                i11 = 8388608;
                            } else {
                                i11 = 4194304;
                            }
                            i3 |= i11;
                        }
                        if ((4793491 & i3) != 4793490) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (b0kVar3.Y(i3 & 1, z)) {
                            b0kVar3.d0();
                            if ((i & 1) != 0) {
                                if (i12 != 0) {
                                    qim0Var4 = nim0.a;
                                } else {
                                    qim0Var4 = qim0Var2;
                                }
                                if (i4 != 0) {
                                    maxVar2 = jax.a;
                                }
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                    gdxVarR = yla.r(b0kVar3);
                                }
                                idn0VarY = zso1.Y(b0kVar3);
                                i10 = i3 & (-57345);
                                if (i6 != 0) {
                                    vu30Var3 = null;
                                }
                                if (i8 != 0) {
                                    qim0Var5 = qim0Var4;
                                    idn0Var3 = idn0VarY;
                                    vu30Var8 = null;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var7 = vu30Var3;
                                } else {
                                    idn0Var3 = idn0VarY;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var7 = vu30Var3;
                                    vu30Var8 = vu30Var4;
                                    qim0Var5 = qim0Var4;
                                }
                            } else {
                                if (i12 != 0) {
                                    qim0Var4 = nim0.a;
                                } else {
                                    qim0Var4 = qim0Var2;
                                }
                                if (i4 != 0) {
                                    maxVar2 = jax.a;
                                }
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                    gdxVarR = yla.r(b0kVar3);
                                }
                                idn0VarY = zso1.Y(b0kVar3);
                                i10 = i3 & (-57345);
                                if (i6 != 0) {
                                    vu30Var3 = null;
                                }
                                if (i8 != 0) {
                                    qim0Var5 = qim0Var4;
                                    idn0Var3 = idn0VarY;
                                    vu30Var8 = null;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var7 = vu30Var3;
                                } else {
                                    idn0Var3 = idn0VarY;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var7 = vu30Var3;
                                    vu30Var8 = vu30Var4;
                                    qim0Var5 = qim0Var4;
                                }
                            }
                            b0kVar3.s();
                            int i18 = i10 << 6;
                            b0kVar2 = b0kVar3;
                            c(gbxVar, jdx.c, qim0Var5, maxVar4, gdxVar3, null, idn0Var3, null, vu30Var7, vu30Var8, j2iVar, b0kVar2, (i10 & 14) | 48 | ((i10 << 3) & 896) | (57344 & i18) | (i18 & 458752) | ((i10 << 12) & 1879048192), (i10 >> 18) & 126, 328);
                            qim0Var3 = qim0Var5;
                            maxVar3 = maxVar4;
                            gdxVar2 = gdxVar3;
                            idn0Var2 = idn0Var3;
                            vu30Var5 = vu30Var7;
                            vu30Var6 = vu30Var8;
                        } else {
                            b0kVar2 = b0kVar3;
                            b0kVar2.b0();
                            qim0Var3 = qim0Var2;
                            maxVar3 = maxVar2;
                            gdxVar2 = gdxVarR;
                            vu30Var5 = vu30Var3;
                            vu30Var6 = vu30Var4;
                            idn0Var2 = idn0Var;
                        }
                        h311VarV = b0kVar2.v();
                        if (h311VarV != null) {
                            h311VarV.d = new fdx(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var5, vu30Var6, j2iVar, i, i2, (byte) 1);
                        }
                    }
                    i3 |= 1572864;
                    vu30Var4 = vu30Var2;
                    if ((12582912 & i) != 0) {
                        if (b0kVar3.i(j2iVar)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                        i3 |= i11;
                    }
                    if ((4793491 & i3) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (b0kVar3.Y(i3 & 1, z)) {
                        b0kVar3.d0();
                        if ((i & 1) != 0) {
                            if (i12 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i4 != 0) {
                                maxVar2 = jax.a;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                gdxVarR = yla.r(b0kVar3);
                            }
                            idn0VarY = zso1.Y(b0kVar3);
                            i10 = i3 & (-57345);
                            if (i6 != 0) {
                                vu30Var3 = null;
                            }
                            if (i8 != 0) {
                                qim0Var5 = qim0Var4;
                                idn0Var3 = idn0VarY;
                                vu30Var8 = null;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var7 = vu30Var3;
                            } else {
                                idn0Var3 = idn0VarY;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var7 = vu30Var3;
                                vu30Var8 = vu30Var4;
                                qim0Var5 = qim0Var4;
                            }
                        } else {
                            if (i12 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i4 != 0) {
                                maxVar2 = jax.a;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                gdxVarR = yla.r(b0kVar3);
                            }
                            idn0VarY = zso1.Y(b0kVar3);
                            i10 = i3 & (-57345);
                            if (i6 != 0) {
                                vu30Var3 = null;
                            }
                            if (i8 != 0) {
                                qim0Var5 = qim0Var4;
                                idn0Var3 = idn0VarY;
                                vu30Var8 = null;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var7 = vu30Var3;
                            } else {
                                idn0Var3 = idn0VarY;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var7 = vu30Var3;
                                vu30Var8 = vu30Var4;
                                qim0Var5 = qim0Var4;
                            }
                        }
                        b0kVar3.s();
                        int i19 = i10 << 6;
                        b0kVar2 = b0kVar3;
                        c(gbxVar, jdx.c, qim0Var5, maxVar4, gdxVar3, null, idn0Var3, null, vu30Var7, vu30Var8, j2iVar, b0kVar2, (i10 & 14) | 48 | ((i10 << 3) & 896) | (57344 & i19) | (i19 & 458752) | ((i10 << 12) & 1879048192), (i10 >> 18) & 126, 328);
                        qim0Var3 = qim0Var5;
                        maxVar3 = maxVar4;
                        gdxVar2 = gdxVar3;
                        idn0Var2 = idn0Var3;
                        vu30Var5 = vu30Var7;
                        vu30Var6 = vu30Var8;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        qim0Var3 = qim0Var2;
                        maxVar3 = maxVar2;
                        gdxVar2 = gdxVarR;
                        vu30Var5 = vu30Var3;
                        vu30Var6 = vu30Var4;
                        idn0Var2 = idn0Var;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new fdx(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var5, vu30Var6, j2iVar, i, i2, (byte) 1);
                    }
                }
                i3 |= 196608;
                vu30Var3 = vu30Var;
                i8 = i2 & 64;
                if (i8 != 0) {
                    if ((1572864 & i) == 0) {
                        vu30Var4 = vu30Var2;
                        if (b0kVar3.i(vu30Var4)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    if ((12582912 & i) != 0) {
                        if (b0kVar3.i(j2iVar)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                        i3 |= i11;
                    }
                    if ((4793491 & i3) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (b0kVar3.Y(i3 & 1, z)) {
                        b0kVar3.d0();
                        if ((i & 1) != 0) {
                            if (i12 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i4 != 0) {
                                maxVar2 = jax.a;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                gdxVarR = yla.r(b0kVar3);
                            }
                            idn0VarY = zso1.Y(b0kVar3);
                            i10 = i3 & (-57345);
                            if (i6 != 0) {
                                vu30Var3 = null;
                            }
                            if (i8 != 0) {
                                qim0Var5 = qim0Var4;
                                idn0Var3 = idn0VarY;
                                vu30Var8 = null;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var7 = vu30Var3;
                            } else {
                                idn0Var3 = idn0VarY;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var7 = vu30Var3;
                                vu30Var8 = vu30Var4;
                                qim0Var5 = qim0Var4;
                            }
                        } else {
                            if (i12 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i4 != 0) {
                                maxVar2 = jax.a;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                gdxVarR = yla.r(b0kVar3);
                            }
                            idn0VarY = zso1.Y(b0kVar3);
                            i10 = i3 & (-57345);
                            if (i6 != 0) {
                                vu30Var3 = null;
                            }
                            if (i8 != 0) {
                                qim0Var5 = qim0Var4;
                                idn0Var3 = idn0VarY;
                                vu30Var8 = null;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var7 = vu30Var3;
                            } else {
                                idn0Var3 = idn0VarY;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var7 = vu30Var3;
                                vu30Var8 = vu30Var4;
                                qim0Var5 = qim0Var4;
                            }
                        }
                        b0kVar3.s();
                        int i110 = i10 << 6;
                        b0kVar2 = b0kVar3;
                        c(gbxVar, jdx.c, qim0Var5, maxVar4, gdxVar3, null, idn0Var3, null, vu30Var7, vu30Var8, j2iVar, b0kVar2, (i10 & 14) | 48 | ((i10 << 3) & 896) | (57344 & i110) | (i110 & 458752) | ((i10 << 12) & 1879048192), (i10 >> 18) & 126, 328);
                        qim0Var3 = qim0Var5;
                        maxVar3 = maxVar4;
                        gdxVar2 = gdxVar3;
                        idn0Var2 = idn0Var3;
                        vu30Var5 = vu30Var7;
                        vu30Var6 = vu30Var8;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        qim0Var3 = qim0Var2;
                        maxVar3 = maxVar2;
                        gdxVar2 = gdxVarR;
                        vu30Var5 = vu30Var3;
                        vu30Var6 = vu30Var4;
                        idn0Var2 = idn0Var;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new fdx(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var5, vu30Var6, j2iVar, i, i2, (byte) 1);
                    }
                }
                i3 |= 1572864;
                vu30Var4 = vu30Var2;
                if ((12582912 & i) != 0) {
                    if (b0kVar3.i(j2iVar)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i3 |= i11;
                }
                if ((4793491 & i3) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i3 & 1, z)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i4 != 0) {
                            maxVar2 = jax.a;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            gdxVarR = yla.r(b0kVar3);
                        }
                        idn0VarY = zso1.Y(b0kVar3);
                        i10 = i3 & (-57345);
                        if (i6 != 0) {
                            vu30Var3 = null;
                        }
                        if (i8 != 0) {
                            qim0Var5 = qim0Var4;
                            idn0Var3 = idn0VarY;
                            vu30Var8 = null;
                            maxVar4 = maxVar2;
                            gdxVar3 = gdxVarR;
                            vu30Var7 = vu30Var3;
                        } else {
                            idn0Var3 = idn0VarY;
                            maxVar4 = maxVar2;
                            gdxVar3 = gdxVarR;
                            vu30Var7 = vu30Var3;
                            vu30Var8 = vu30Var4;
                            qim0Var5 = qim0Var4;
                        }
                    } else {
                        if (i12 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i4 != 0) {
                            maxVar2 = jax.a;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            gdxVarR = yla.r(b0kVar3);
                        }
                        idn0VarY = zso1.Y(b0kVar3);
                        i10 = i3 & (-57345);
                        if (i6 != 0) {
                            vu30Var3 = null;
                        }
                        if (i8 != 0) {
                            qim0Var5 = qim0Var4;
                            idn0Var3 = idn0VarY;
                            vu30Var8 = null;
                            maxVar4 = maxVar2;
                            gdxVar3 = gdxVarR;
                            vu30Var7 = vu30Var3;
                        } else {
                            idn0Var3 = idn0VarY;
                            maxVar4 = maxVar2;
                            gdxVar3 = gdxVarR;
                            vu30Var7 = vu30Var3;
                            vu30Var8 = vu30Var4;
                            qim0Var5 = qim0Var4;
                        }
                    }
                    b0kVar3.s();
                    int i111 = i10 << 6;
                    b0kVar2 = b0kVar3;
                    c(gbxVar, jdx.c, qim0Var5, maxVar4, gdxVar3, null, idn0Var3, null, vu30Var7, vu30Var8, j2iVar, b0kVar2, (i10 & 14) | 48 | ((i10 << 3) & 896) | (57344 & i111) | (i111 & 458752) | ((i10 << 12) & 1879048192), (i10 >> 18) & 126, 328);
                    qim0Var3 = qim0Var5;
                    maxVar3 = maxVar4;
                    gdxVar2 = gdxVar3;
                    idn0Var2 = idn0Var3;
                    vu30Var5 = vu30Var7;
                    vu30Var6 = vu30Var8;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    qim0Var3 = qim0Var2;
                    maxVar3 = maxVar2;
                    gdxVar2 = gdxVarR;
                    vu30Var5 = vu30Var3;
                    vu30Var6 = vu30Var4;
                    idn0Var2 = idn0Var;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new fdx(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var5, vu30Var6, j2iVar, i, i2, (byte) 1);
                }
            }
            i3 |= 48;
            qim0Var2 = qim0Var;
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    maxVar2 = maxVar;
                    if (b0kVar3.g(maxVar2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        gdxVarR = gdxVar;
                        if (b0kVar3.g(gdxVarR)) {
                        }
                        i3 |= i13;
                    } else {
                        gdxVarR = gdxVar;
                    }
                    i3 |= i13;
                } else {
                    gdxVarR = gdxVar;
                }
                if ((i & 24576) == 0) {
                    i3 |= 8192;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((196608 & i) == 0) {
                        vu30Var3 = vu30Var;
                        if (b0kVar3.i(vu30Var3)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 64;
                    if (i8 != 0) {
                        if ((1572864 & i) == 0) {
                            vu30Var4 = vu30Var2;
                            if (b0kVar3.i(vu30Var4)) {
                                i9 = 1048576;
                            } else {
                                i9 = 524288;
                            }
                            i3 |= i9;
                        }
                        if ((12582912 & i) != 0) {
                            if (b0kVar3.i(j2iVar)) {
                                i11 = 8388608;
                            } else {
                                i11 = 4194304;
                            }
                            i3 |= i11;
                        }
                        if ((4793491 & i3) != 4793490) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (b0kVar3.Y(i3 & 1, z)) {
                            b0kVar3.d0();
                            if ((i & 1) != 0) {
                                if (i12 != 0) {
                                    qim0Var4 = nim0.a;
                                } else {
                                    qim0Var4 = qim0Var2;
                                }
                                if (i4 != 0) {
                                    maxVar2 = jax.a;
                                }
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                    gdxVarR = yla.r(b0kVar3);
                                }
                                idn0VarY = zso1.Y(b0kVar3);
                                i10 = i3 & (-57345);
                                if (i6 != 0) {
                                    vu30Var3 = null;
                                }
                                if (i8 != 0) {
                                    qim0Var5 = qim0Var4;
                                    idn0Var3 = idn0VarY;
                                    vu30Var8 = null;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var7 = vu30Var3;
                                } else {
                                    idn0Var3 = idn0VarY;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var7 = vu30Var3;
                                    vu30Var8 = vu30Var4;
                                    qim0Var5 = qim0Var4;
                                }
                            } else {
                                if (i12 != 0) {
                                    qim0Var4 = nim0.a;
                                } else {
                                    qim0Var4 = qim0Var2;
                                }
                                if (i4 != 0) {
                                    maxVar2 = jax.a;
                                }
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                    gdxVarR = yla.r(b0kVar3);
                                }
                                idn0VarY = zso1.Y(b0kVar3);
                                i10 = i3 & (-57345);
                                if (i6 != 0) {
                                    vu30Var3 = null;
                                }
                                if (i8 != 0) {
                                    qim0Var5 = qim0Var4;
                                    idn0Var3 = idn0VarY;
                                    vu30Var8 = null;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var7 = vu30Var3;
                                } else {
                                    idn0Var3 = idn0VarY;
                                    maxVar4 = maxVar2;
                                    gdxVar3 = gdxVarR;
                                    vu30Var7 = vu30Var3;
                                    vu30Var8 = vu30Var4;
                                    qim0Var5 = qim0Var4;
                                }
                            }
                            b0kVar3.s();
                            int i112 = i10 << 6;
                            b0kVar2 = b0kVar3;
                            c(gbxVar, jdx.c, qim0Var5, maxVar4, gdxVar3, null, idn0Var3, null, vu30Var7, vu30Var8, j2iVar, b0kVar2, (i10 & 14) | 48 | ((i10 << 3) & 896) | (57344 & i112) | (i112 & 458752) | ((i10 << 12) & 1879048192), (i10 >> 18) & 126, 328);
                            qim0Var3 = qim0Var5;
                            maxVar3 = maxVar4;
                            gdxVar2 = gdxVar3;
                            idn0Var2 = idn0Var3;
                            vu30Var5 = vu30Var7;
                            vu30Var6 = vu30Var8;
                        } else {
                            b0kVar2 = b0kVar3;
                            b0kVar2.b0();
                            qim0Var3 = qim0Var2;
                            maxVar3 = maxVar2;
                            gdxVar2 = gdxVarR;
                            vu30Var5 = vu30Var3;
                            vu30Var6 = vu30Var4;
                            idn0Var2 = idn0Var;
                        }
                        h311VarV = b0kVar2.v();
                        if (h311VarV != null) {
                            h311VarV.d = new fdx(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var5, vu30Var6, j2iVar, i, i2, (byte) 1);
                        }
                    }
                    i3 |= 1572864;
                    vu30Var4 = vu30Var2;
                    if ((12582912 & i) != 0) {
                        if (b0kVar3.i(j2iVar)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                        i3 |= i11;
                    }
                    if ((4793491 & i3) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (b0kVar3.Y(i3 & 1, z)) {
                        b0kVar3.d0();
                        if ((i & 1) != 0) {
                            if (i12 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i4 != 0) {
                                maxVar2 = jax.a;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                gdxVarR = yla.r(b0kVar3);
                            }
                            idn0VarY = zso1.Y(b0kVar3);
                            i10 = i3 & (-57345);
                            if (i6 != 0) {
                                vu30Var3 = null;
                            }
                            if (i8 != 0) {
                                qim0Var5 = qim0Var4;
                                idn0Var3 = idn0VarY;
                                vu30Var8 = null;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var7 = vu30Var3;
                            } else {
                                idn0Var3 = idn0VarY;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var7 = vu30Var3;
                                vu30Var8 = vu30Var4;
                                qim0Var5 = qim0Var4;
                            }
                        } else {
                            if (i12 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i4 != 0) {
                                maxVar2 = jax.a;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                gdxVarR = yla.r(b0kVar3);
                            }
                            idn0VarY = zso1.Y(b0kVar3);
                            i10 = i3 & (-57345);
                            if (i6 != 0) {
                                vu30Var3 = null;
                            }
                            if (i8 != 0) {
                                qim0Var5 = qim0Var4;
                                idn0Var3 = idn0VarY;
                                vu30Var8 = null;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var7 = vu30Var3;
                            } else {
                                idn0Var3 = idn0VarY;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var7 = vu30Var3;
                                vu30Var8 = vu30Var4;
                                qim0Var5 = qim0Var4;
                            }
                        }
                        b0kVar3.s();
                        int i113 = i10 << 6;
                        b0kVar2 = b0kVar3;
                        c(gbxVar, jdx.c, qim0Var5, maxVar4, gdxVar3, null, idn0Var3, null, vu30Var7, vu30Var8, j2iVar, b0kVar2, (i10 & 14) | 48 | ((i10 << 3) & 896) | (57344 & i113) | (i113 & 458752) | ((i10 << 12) & 1879048192), (i10 >> 18) & 126, 328);
                        qim0Var3 = qim0Var5;
                        maxVar3 = maxVar4;
                        gdxVar2 = gdxVar3;
                        idn0Var2 = idn0Var3;
                        vu30Var5 = vu30Var7;
                        vu30Var6 = vu30Var8;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        qim0Var3 = qim0Var2;
                        maxVar3 = maxVar2;
                        gdxVar2 = gdxVarR;
                        vu30Var5 = vu30Var3;
                        vu30Var6 = vu30Var4;
                        idn0Var2 = idn0Var;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new fdx(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var5, vu30Var6, j2iVar, i, i2, (byte) 1);
                    }
                }
                i3 |= 196608;
                vu30Var3 = vu30Var;
                i8 = i2 & 64;
                if (i8 != 0) {
                    if ((1572864 & i) == 0) {
                        vu30Var4 = vu30Var2;
                        if (b0kVar3.i(vu30Var4)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    if ((12582912 & i) != 0) {
                        if (b0kVar3.i(j2iVar)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                        i3 |= i11;
                    }
                    if ((4793491 & i3) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (b0kVar3.Y(i3 & 1, z)) {
                        b0kVar3.d0();
                        if ((i & 1) != 0) {
                            if (i12 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i4 != 0) {
                                maxVar2 = jax.a;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                gdxVarR = yla.r(b0kVar3);
                            }
                            idn0VarY = zso1.Y(b0kVar3);
                            i10 = i3 & (-57345);
                            if (i6 != 0) {
                                vu30Var3 = null;
                            }
                            if (i8 != 0) {
                                qim0Var5 = qim0Var4;
                                idn0Var3 = idn0VarY;
                                vu30Var8 = null;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var7 = vu30Var3;
                            } else {
                                idn0Var3 = idn0VarY;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var7 = vu30Var3;
                                vu30Var8 = vu30Var4;
                                qim0Var5 = qim0Var4;
                            }
                        } else {
                            if (i12 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i4 != 0) {
                                maxVar2 = jax.a;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                gdxVarR = yla.r(b0kVar3);
                            }
                            idn0VarY = zso1.Y(b0kVar3);
                            i10 = i3 & (-57345);
                            if (i6 != 0) {
                                vu30Var3 = null;
                            }
                            if (i8 != 0) {
                                qim0Var5 = qim0Var4;
                                idn0Var3 = idn0VarY;
                                vu30Var8 = null;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var7 = vu30Var3;
                            } else {
                                idn0Var3 = idn0VarY;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var7 = vu30Var3;
                                vu30Var8 = vu30Var4;
                                qim0Var5 = qim0Var4;
                            }
                        }
                        b0kVar3.s();
                        int i114 = i10 << 6;
                        b0kVar2 = b0kVar3;
                        c(gbxVar, jdx.c, qim0Var5, maxVar4, gdxVar3, null, idn0Var3, null, vu30Var7, vu30Var8, j2iVar, b0kVar2, (i10 & 14) | 48 | ((i10 << 3) & 896) | (57344 & i114) | (i114 & 458752) | ((i10 << 12) & 1879048192), (i10 >> 18) & 126, 328);
                        qim0Var3 = qim0Var5;
                        maxVar3 = maxVar4;
                        gdxVar2 = gdxVar3;
                        idn0Var2 = idn0Var3;
                        vu30Var5 = vu30Var7;
                        vu30Var6 = vu30Var8;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        qim0Var3 = qim0Var2;
                        maxVar3 = maxVar2;
                        gdxVar2 = gdxVarR;
                        vu30Var5 = vu30Var3;
                        vu30Var6 = vu30Var4;
                        idn0Var2 = idn0Var;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new fdx(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var5, vu30Var6, j2iVar, i, i2, (byte) 1);
                    }
                }
                i3 |= 1572864;
                vu30Var4 = vu30Var2;
                if ((12582912 & i) != 0) {
                    if (b0kVar3.i(j2iVar)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i3 |= i11;
                }
                if ((4793491 & i3) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i3 & 1, z)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i4 != 0) {
                            maxVar2 = jax.a;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            gdxVarR = yla.r(b0kVar3);
                        }
                        idn0VarY = zso1.Y(b0kVar3);
                        i10 = i3 & (-57345);
                        if (i6 != 0) {
                            vu30Var3 = null;
                        }
                        if (i8 != 0) {
                            qim0Var5 = qim0Var4;
                            idn0Var3 = idn0VarY;
                            vu30Var8 = null;
                            maxVar4 = maxVar2;
                            gdxVar3 = gdxVarR;
                            vu30Var7 = vu30Var3;
                        } else {
                            idn0Var3 = idn0VarY;
                            maxVar4 = maxVar2;
                            gdxVar3 = gdxVarR;
                            vu30Var7 = vu30Var3;
                            vu30Var8 = vu30Var4;
                            qim0Var5 = qim0Var4;
                        }
                    } else {
                        if (i12 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i4 != 0) {
                            maxVar2 = jax.a;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            gdxVarR = yla.r(b0kVar3);
                        }
                        idn0VarY = zso1.Y(b0kVar3);
                        i10 = i3 & (-57345);
                        if (i6 != 0) {
                            vu30Var3 = null;
                        }
                        if (i8 != 0) {
                            qim0Var5 = qim0Var4;
                            idn0Var3 = idn0VarY;
                            vu30Var8 = null;
                            maxVar4 = maxVar2;
                            gdxVar3 = gdxVarR;
                            vu30Var7 = vu30Var3;
                        } else {
                            idn0Var3 = idn0VarY;
                            maxVar4 = maxVar2;
                            gdxVar3 = gdxVarR;
                            vu30Var7 = vu30Var3;
                            vu30Var8 = vu30Var4;
                            qim0Var5 = qim0Var4;
                        }
                    }
                    b0kVar3.s();
                    int i115 = i10 << 6;
                    b0kVar2 = b0kVar3;
                    c(gbxVar, jdx.c, qim0Var5, maxVar4, gdxVar3, null, idn0Var3, null, vu30Var7, vu30Var8, j2iVar, b0kVar2, (i10 & 14) | 48 | ((i10 << 3) & 896) | (57344 & i115) | (i115 & 458752) | ((i10 << 12) & 1879048192), (i10 >> 18) & 126, 328);
                    qim0Var3 = qim0Var5;
                    maxVar3 = maxVar4;
                    gdxVar2 = gdxVar3;
                    idn0Var2 = idn0Var3;
                    vu30Var5 = vu30Var7;
                    vu30Var6 = vu30Var8;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    qim0Var3 = qim0Var2;
                    maxVar3 = maxVar2;
                    gdxVar2 = gdxVarR;
                    vu30Var5 = vu30Var3;
                    vu30Var6 = vu30Var4;
                    idn0Var2 = idn0Var;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new fdx(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var5, vu30Var6, j2iVar, i, i2, (byte) 1);
                }
            }
            i3 |= 384;
            maxVar2 = maxVar;
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    gdxVarR = gdxVar;
                    if (b0kVar3.g(gdxVarR)) {
                    }
                    i3 |= i13;
                } else {
                    gdxVarR = gdxVar;
                }
                i3 |= i13;
            } else {
                gdxVarR = gdxVar;
            }
            if ((i & 24576) == 0) {
                i3 |= 8192;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    vu30Var3 = vu30Var;
                    if (b0kVar3.i(vu30Var3)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    if ((1572864 & i) == 0) {
                        vu30Var4 = vu30Var2;
                        if (b0kVar3.i(vu30Var4)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    if ((12582912 & i) != 0) {
                        if (b0kVar3.i(j2iVar)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                        i3 |= i11;
                    }
                    if ((4793491 & i3) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (b0kVar3.Y(i3 & 1, z)) {
                        b0kVar3.d0();
                        if ((i & 1) != 0) {
                            if (i12 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i4 != 0) {
                                maxVar2 = jax.a;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                gdxVarR = yla.r(b0kVar3);
                            }
                            idn0VarY = zso1.Y(b0kVar3);
                            i10 = i3 & (-57345);
                            if (i6 != 0) {
                                vu30Var3 = null;
                            }
                            if (i8 != 0) {
                                qim0Var5 = qim0Var4;
                                idn0Var3 = idn0VarY;
                                vu30Var8 = null;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var7 = vu30Var3;
                            } else {
                                idn0Var3 = idn0VarY;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var7 = vu30Var3;
                                vu30Var8 = vu30Var4;
                                qim0Var5 = qim0Var4;
                            }
                        } else {
                            if (i12 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i4 != 0) {
                                maxVar2 = jax.a;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                gdxVarR = yla.r(b0kVar3);
                            }
                            idn0VarY = zso1.Y(b0kVar3);
                            i10 = i3 & (-57345);
                            if (i6 != 0) {
                                vu30Var3 = null;
                            }
                            if (i8 != 0) {
                                qim0Var5 = qim0Var4;
                                idn0Var3 = idn0VarY;
                                vu30Var8 = null;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var7 = vu30Var3;
                            } else {
                                idn0Var3 = idn0VarY;
                                maxVar4 = maxVar2;
                                gdxVar3 = gdxVarR;
                                vu30Var7 = vu30Var3;
                                vu30Var8 = vu30Var4;
                                qim0Var5 = qim0Var4;
                            }
                        }
                        b0kVar3.s();
                        int i116 = i10 << 6;
                        b0kVar2 = b0kVar3;
                        c(gbxVar, jdx.c, qim0Var5, maxVar4, gdxVar3, null, idn0Var3, null, vu30Var7, vu30Var8, j2iVar, b0kVar2, (i10 & 14) | 48 | ((i10 << 3) & 896) | (57344 & i116) | (i116 & 458752) | ((i10 << 12) & 1879048192), (i10 >> 18) & 126, 328);
                        qim0Var3 = qim0Var5;
                        maxVar3 = maxVar4;
                        gdxVar2 = gdxVar3;
                        idn0Var2 = idn0Var3;
                        vu30Var5 = vu30Var7;
                        vu30Var6 = vu30Var8;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        qim0Var3 = qim0Var2;
                        maxVar3 = maxVar2;
                        gdxVar2 = gdxVarR;
                        vu30Var5 = vu30Var3;
                        vu30Var6 = vu30Var4;
                        idn0Var2 = idn0Var;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new fdx(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var5, vu30Var6, j2iVar, i, i2, (byte) 1);
                    }
                }
                i3 |= 1572864;
                vu30Var4 = vu30Var2;
                if ((12582912 & i) != 0) {
                    if (b0kVar3.i(j2iVar)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i3 |= i11;
                }
                if ((4793491 & i3) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i3 & 1, z)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i4 != 0) {
                            maxVar2 = jax.a;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            gdxVarR = yla.r(b0kVar3);
                        }
                        idn0VarY = zso1.Y(b0kVar3);
                        i10 = i3 & (-57345);
                        if (i6 != 0) {
                            vu30Var3 = null;
                        }
                        if (i8 != 0) {
                            qim0Var5 = qim0Var4;
                            idn0Var3 = idn0VarY;
                            vu30Var8 = null;
                            maxVar4 = maxVar2;
                            gdxVar3 = gdxVarR;
                            vu30Var7 = vu30Var3;
                        } else {
                            idn0Var3 = idn0VarY;
                            maxVar4 = maxVar2;
                            gdxVar3 = gdxVarR;
                            vu30Var7 = vu30Var3;
                            vu30Var8 = vu30Var4;
                            qim0Var5 = qim0Var4;
                        }
                    } else {
                        if (i12 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i4 != 0) {
                            maxVar2 = jax.a;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            gdxVarR = yla.r(b0kVar3);
                        }
                        idn0VarY = zso1.Y(b0kVar3);
                        i10 = i3 & (-57345);
                        if (i6 != 0) {
                            vu30Var3 = null;
                        }
                        if (i8 != 0) {
                            qim0Var5 = qim0Var4;
                            idn0Var3 = idn0VarY;
                            vu30Var8 = null;
                            maxVar4 = maxVar2;
                            gdxVar3 = gdxVarR;
                            vu30Var7 = vu30Var3;
                        } else {
                            idn0Var3 = idn0VarY;
                            maxVar4 = maxVar2;
                            gdxVar3 = gdxVarR;
                            vu30Var7 = vu30Var3;
                            vu30Var8 = vu30Var4;
                            qim0Var5 = qim0Var4;
                        }
                    }
                    b0kVar3.s();
                    int i117 = i10 << 6;
                    b0kVar2 = b0kVar3;
                    c(gbxVar, jdx.c, qim0Var5, maxVar4, gdxVar3, null, idn0Var3, null, vu30Var7, vu30Var8, j2iVar, b0kVar2, (i10 & 14) | 48 | ((i10 << 3) & 896) | (57344 & i117) | (i117 & 458752) | ((i10 << 12) & 1879048192), (i10 >> 18) & 126, 328);
                    qim0Var3 = qim0Var5;
                    maxVar3 = maxVar4;
                    gdxVar2 = gdxVar3;
                    idn0Var2 = idn0Var3;
                    vu30Var5 = vu30Var7;
                    vu30Var6 = vu30Var8;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    qim0Var3 = qim0Var2;
                    maxVar3 = maxVar2;
                    gdxVar2 = gdxVarR;
                    vu30Var5 = vu30Var3;
                    vu30Var6 = vu30Var4;
                    idn0Var2 = idn0Var;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new fdx(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var5, vu30Var6, j2iVar, i, i2, (byte) 1);
                }
            }
            i3 |= 196608;
            vu30Var3 = vu30Var;
            i8 = i2 & 64;
            if (i8 != 0) {
                if ((1572864 & i) == 0) {
                    vu30Var4 = vu30Var2;
                    if (b0kVar3.i(vu30Var4)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                if ((12582912 & i) != 0) {
                    if (b0kVar3.i(j2iVar)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i3 |= i11;
                }
                if ((4793491 & i3) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i3 & 1, z)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i4 != 0) {
                            maxVar2 = jax.a;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            gdxVarR = yla.r(b0kVar3);
                        }
                        idn0VarY = zso1.Y(b0kVar3);
                        i10 = i3 & (-57345);
                        if (i6 != 0) {
                            vu30Var3 = null;
                        }
                        if (i8 != 0) {
                            qim0Var5 = qim0Var4;
                            idn0Var3 = idn0VarY;
                            vu30Var8 = null;
                            maxVar4 = maxVar2;
                            gdxVar3 = gdxVarR;
                            vu30Var7 = vu30Var3;
                        } else {
                            idn0Var3 = idn0VarY;
                            maxVar4 = maxVar2;
                            gdxVar3 = gdxVarR;
                            vu30Var7 = vu30Var3;
                            vu30Var8 = vu30Var4;
                            qim0Var5 = qim0Var4;
                        }
                    } else {
                        if (i12 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i4 != 0) {
                            maxVar2 = jax.a;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            gdxVarR = yla.r(b0kVar3);
                        }
                        idn0VarY = zso1.Y(b0kVar3);
                        i10 = i3 & (-57345);
                        if (i6 != 0) {
                            vu30Var3 = null;
                        }
                        if (i8 != 0) {
                            qim0Var5 = qim0Var4;
                            idn0Var3 = idn0VarY;
                            vu30Var8 = null;
                            maxVar4 = maxVar2;
                            gdxVar3 = gdxVarR;
                            vu30Var7 = vu30Var3;
                        } else {
                            idn0Var3 = idn0VarY;
                            maxVar4 = maxVar2;
                            gdxVar3 = gdxVarR;
                            vu30Var7 = vu30Var3;
                            vu30Var8 = vu30Var4;
                            qim0Var5 = qim0Var4;
                        }
                    }
                    b0kVar3.s();
                    int i118 = i10 << 6;
                    b0kVar2 = b0kVar3;
                    c(gbxVar, jdx.c, qim0Var5, maxVar4, gdxVar3, null, idn0Var3, null, vu30Var7, vu30Var8, j2iVar, b0kVar2, (i10 & 14) | 48 | ((i10 << 3) & 896) | (57344 & i118) | (i118 & 458752) | ((i10 << 12) & 1879048192), (i10 >> 18) & 126, 328);
                    qim0Var3 = qim0Var5;
                    maxVar3 = maxVar4;
                    gdxVar2 = gdxVar3;
                    idn0Var2 = idn0Var3;
                    vu30Var5 = vu30Var7;
                    vu30Var6 = vu30Var8;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    qim0Var3 = qim0Var2;
                    maxVar3 = maxVar2;
                    gdxVar2 = gdxVarR;
                    vu30Var5 = vu30Var3;
                    vu30Var6 = vu30Var4;
                    idn0Var2 = idn0Var;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new fdx(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var5, vu30Var6, j2iVar, i, i2, (byte) 1);
                }
            }
            i3 |= 1572864;
            vu30Var4 = vu30Var2;
            if ((12582912 & i) != 0) {
                if (b0kVar3.i(j2iVar)) {
                    i11 = 8388608;
                } else {
                    i11 = 4194304;
                }
                i3 |= i11;
            }
            if ((4793491 & i3) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i3 & 1, z)) {
                b0kVar3.d0();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i4 != 0) {
                        maxVar2 = jax.a;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        gdxVarR = yla.r(b0kVar3);
                    }
                    idn0VarY = zso1.Y(b0kVar3);
                    i10 = i3 & (-57345);
                    if (i6 != 0) {
                        vu30Var3 = null;
                    }
                    if (i8 != 0) {
                        qim0Var5 = qim0Var4;
                        idn0Var3 = idn0VarY;
                        vu30Var8 = null;
                        maxVar4 = maxVar2;
                        gdxVar3 = gdxVarR;
                        vu30Var7 = vu30Var3;
                    } else {
                        idn0Var3 = idn0VarY;
                        maxVar4 = maxVar2;
                        gdxVar3 = gdxVarR;
                        vu30Var7 = vu30Var3;
                        vu30Var8 = vu30Var4;
                        qim0Var5 = qim0Var4;
                    }
                } else {
                    if (i12 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i4 != 0) {
                        maxVar2 = jax.a;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        gdxVarR = yla.r(b0kVar3);
                    }
                    idn0VarY = zso1.Y(b0kVar3);
                    i10 = i3 & (-57345);
                    if (i6 != 0) {
                        vu30Var3 = null;
                    }
                    if (i8 != 0) {
                        qim0Var5 = qim0Var4;
                        idn0Var3 = idn0VarY;
                        vu30Var8 = null;
                        maxVar4 = maxVar2;
                        gdxVar3 = gdxVarR;
                        vu30Var7 = vu30Var3;
                    } else {
                        idn0Var3 = idn0VarY;
                        maxVar4 = maxVar2;
                        gdxVar3 = gdxVarR;
                        vu30Var7 = vu30Var3;
                        vu30Var8 = vu30Var4;
                        qim0Var5 = qim0Var4;
                    }
                }
                b0kVar3.s();
                int i119 = i10 << 6;
                b0kVar2 = b0kVar3;
                c(gbxVar, jdx.c, qim0Var5, maxVar4, gdxVar3, null, idn0Var3, null, vu30Var7, vu30Var8, j2iVar, b0kVar2, (i10 & 14) | 48 | ((i10 << 3) & 896) | (57344 & i119) | (i119 & 458752) | ((i10 << 12) & 1879048192), (i10 >> 18) & 126, 328);
                qim0Var3 = qim0Var5;
                maxVar3 = maxVar4;
                gdxVar2 = gdxVar3;
                idn0Var2 = idn0Var3;
                vu30Var5 = vu30Var7;
                vu30Var6 = vu30Var8;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var3 = qim0Var2;
                maxVar3 = maxVar2;
                gdxVar2 = gdxVarR;
                vu30Var5 = vu30Var3;
                vu30Var6 = vu30Var4;
                idn0Var2 = idn0Var;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new fdx(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var5, vu30Var6, j2iVar, i, i2, (byte) 1);
            }
        }

        /* JADX WARN: Code duplicated, block: B:23:0x003d  */
        /* JADX WARN: Code duplicated, block: B:25:0x0042  */
        /* JADX WARN: Code duplicated, block: B:27:0x0046  */
        /* JADX WARN: Code duplicated, block: B:29:0x004e  */
        /* JADX WARN: Code duplicated, block: B:30:0x0051  */
        /* JADX WARN: Code duplicated, block: B:34:0x0058  */
        /* JADX WARN: Code duplicated, block: B:36:0x005c  */
        /* JADX WARN: Code duplicated, block: B:38:0x0064  */
        /* JADX WARN: Code duplicated, block: B:39:0x0067  */
        /* JADX WARN: Code duplicated, block: B:42:0x006d  */
        /* JADX WARN: Code duplicated, block: B:45:0x0073  */
        /* JADX WARN: Code duplicated, block: B:48:0x007c  */
        /* JADX WARN: Code duplicated, block: B:50:0x0082  */
        /* JADX WARN: Code duplicated, block: B:52:0x0087  */
        /* JADX WARN: Code duplicated, block: B:54:0x008f  */
        /* JADX WARN: Code duplicated, block: B:55:0x0092  */
        /* JADX WARN: Code duplicated, block: B:59:0x009a  */
        /* JADX WARN: Code duplicated, block: B:61:0x00a2  */
        /* JADX WARN: Code duplicated, block: B:62:0x00a5  */
        /* JADX WARN: Code duplicated, block: B:64:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:67:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:68:0x00b6  */
        /* JADX WARN: Code duplicated, block: B:71:0x00bf  */
        /* JADX WARN: Code duplicated, block: B:73:0x00c9  */
        /* JADX WARN: Code duplicated, block: B:80:0x00e4 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:81:0x00e6  */
        /* JADX WARN: Code duplicated, block: B:82:0x00e9  */
        /* JADX WARN: Code duplicated, block: B:84:0x00ec  */
        /* JADX WARN: Code duplicated, block: B:85:0x00ef  */
        /* JADX WARN: Code duplicated, block: B:88:0x00f4  */
        /* JADX WARN: Code duplicated, block: B:91:0x0103  */
        /* JADX WARN: Code duplicated, block: B:94:0x0142  */
        /* JADX WARN: Code duplicated, block: B:97:0x0153  */
        /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
        public static final void h(gbx gbxVar, qim0 qim0Var, max maxVar, gdx gdxVar, idn0 idn0Var, vu30 vu30Var, vu30 vu30Var2, b0k b0kVar, int i, int i2) {
            int i3;
            qim0 qim0Var2;
            int i4;
            max maxVar2;
            int i5;
            gdx gdxVarR;
            int i6;
            int i7;
            vu30 vu30Var3;
            int i8;
            vu30 vu30Var4;
            boolean z;
            b0k b0kVar2;
            qim0 qim0Var3;
            max maxVar3;
            gdx gdxVar2;
            idn0 idn0Var2;
            vu30 vu30Var5;
            h311 h311VarV;
            max maxVar4;
            int i9;
            vu30 vu30Var6;
            max maxVar5;
            idn0 idn0Var3;
            gdx gdxVar3;
            int i10;
            b0k b0kVar3 = (x340) b0kVar;
            b0kVar3.k0(-2039433746);
            if ((i & 6) == 0) {
                i3 = (b0kVar3.g(gbxVar) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
            int i11 = i2 & 2;
            if (i11 == 0) {
                if ((i & 48) == 0) {
                    qim0Var2 = qim0Var;
                    i3 |= b0kVar3.g(qim0Var2) ? 32 : 16;
                }
                i4 = i2 & 4;
                if (i4 != 0) {
                    if ((i & 384) == 0) {
                        maxVar2 = maxVar;
                        if (b0kVar3.g(maxVar2)) {
                            i5 = 256;
                        } else {
                            i5 = 128;
                        }
                        i3 |= i5;
                    }
                    if ((i & 3072) == 0) {
                        if ((i2 & 8) == 0) {
                            gdxVarR = gdxVar;
                            int i12 = b0kVar3.g(gdxVarR) ? 2048 : 1024;
                            i3 |= i12;
                        } else {
                            gdxVarR = gdxVar;
                        }
                        i3 |= i12;
                    } else {
                        gdxVarR = gdxVar;
                    }
                    if ((i & 24576) == 0) {
                        i3 |= 8192;
                    }
                    i6 = 196608 | i3;
                    i7 = i2 & 64;
                    if (i7 != 0) {
                        if ((1572864 & i) == 0) {
                            vu30Var3 = vu30Var;
                            if (b0kVar3.i(vu30Var3)) {
                                i8 = 1048576;
                            } else {
                                i8 = 524288;
                            }
                            i6 |= i8;
                        }
                        if ((12582912 & i) == 0) {
                            vu30Var4 = vu30Var2;
                            if (b0kVar3.i(vu30Var4)) {
                                i10 = 8388608;
                            } else {
                                i10 = 4194304;
                            }
                            i6 |= i10;
                        } else {
                            vu30Var4 = vu30Var2;
                        }
                        if ((4793491 & i6) != 4793490) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (b0kVar3.Y(i6 & 1, z)) {
                            b0kVar3.d0();
                            if ((i & 1) != 0 || b0kVar3.E()) {
                                if (i11 != 0) {
                                    qim0Var3 = nim0.a;
                                } else {
                                    qim0Var3 = qim0Var2;
                                }
                                if (i4 != 0) {
                                    maxVar4 = jax.a;
                                } else {
                                    maxVar4 = maxVar2;
                                }
                                if ((i2 & 8) != 0) {
                                    i6 &= -7169;
                                    gdxVarR = yla.r(b0kVar3);
                                }
                                idn0 idn0VarY = zso1.Y(b0kVar3);
                                i9 = i6 & (-57345);
                                if (i7 != 0) {
                                    vu30Var3 = null;
                                }
                                vu30Var6 = vu30Var3;
                                maxVar5 = maxVar4;
                                idn0Var3 = idn0VarY;
                                gdxVar3 = gdxVarR;
                            } else {
                                b0kVar3.b0();
                                if ((i2 & 8) != 0) {
                                    i6 &= -7169;
                                }
                                idn0Var3 = idn0Var;
                                vu30Var6 = vu30Var3;
                                maxVar5 = maxVar2;
                                gdxVar3 = gdxVarR;
                                i9 = i6 & (-57345);
                                qim0Var3 = qim0Var2;
                            }
                            b0kVar3.s();
                            int i13 = i9 << 6;
                            b0kVar2 = b0kVar3;
                            vu30 vu30Var7 = vu30Var4;
                            c(gbxVar, ldx.c, qim0Var3, maxVar5, gdxVar3, null, idn0Var3, null, null, vu30Var6, vu30Var7, b0kVar2, (i9 & 14) | 48 | ((i9 << 3) & 896) | (57344 & i13) | (i13 & 458752) | ((i9 << 12) & 1879048192), (i9 >> 18) & 126, 328);
                            maxVar3 = maxVar5;
                            gdxVar2 = gdxVar3;
                            idn0Var2 = idn0Var3;
                            vu30Var5 = vu30Var6;
                        } else {
                            b0kVar2 = b0kVar3;
                            b0kVar2.b0();
                            qim0Var3 = qim0Var2;
                            maxVar3 = maxVar2;
                            gdxVar2 = gdxVarR;
                            idn0Var2 = idn0Var;
                            vu30Var5 = vu30Var3;
                        }
                        h311VarV = b0kVar2.v();
                        if (h311VarV != null) {
                            h311VarV.d = new ra5(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var5, vu30Var2, i, i2, (byte) 2);
                        }
                    }
                    i6 = 1769472 | i3;
                    vu30Var3 = vu30Var;
                    if ((12582912 & i) == 0) {
                        vu30Var4 = vu30Var2;
                        if (b0kVar3.i(vu30Var4)) {
                            i10 = 8388608;
                        } else {
                            i10 = 4194304;
                        }
                        i6 |= i10;
                    } else {
                        vu30Var4 = vu30Var2;
                    }
                    if ((4793491 & i6) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (b0kVar3.Y(i6 & 1, z)) {
                        b0kVar3.d0();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                                qim0Var3 = nim0.a;
                            } else {
                                qim0Var3 = qim0Var2;
                            }
                            if (i4 != 0) {
                                maxVar4 = jax.a;
                            } else {
                                maxVar4 = maxVar2;
                            }
                            if ((i2 & 8) != 0) {
                                i6 &= -7169;
                                gdxVarR = yla.r(b0kVar3);
                            }
                            idn0 idn0VarY2 = zso1.Y(b0kVar3);
                            i9 = i6 & (-57345);
                            if (i7 != 0) {
                                vu30Var3 = null;
                            }
                            vu30Var6 = vu30Var3;
                            maxVar5 = maxVar4;
                            idn0Var3 = idn0VarY2;
                            gdxVar3 = gdxVarR;
                        } else {
                            if (i11 != 0) {
                                qim0Var3 = nim0.a;
                            } else {
                                qim0Var3 = qim0Var2;
                            }
                            if (i4 != 0) {
                                maxVar4 = jax.a;
                            } else {
                                maxVar4 = maxVar2;
                            }
                            if ((i2 & 8) != 0) {
                                i6 &= -7169;
                                gdxVarR = yla.r(b0kVar3);
                            }
                            idn0 idn0VarY3 = zso1.Y(b0kVar3);
                            i9 = i6 & (-57345);
                            if (i7 != 0) {
                                vu30Var3 = null;
                            }
                            vu30Var6 = vu30Var3;
                            maxVar5 = maxVar4;
                            idn0Var3 = idn0VarY3;
                            gdxVar3 = gdxVarR;
                        }
                        b0kVar3.s();
                        int i14 = i9 << 6;
                        b0kVar2 = b0kVar3;
                        vu30 vu30Var8 = vu30Var4;
                        c(gbxVar, ldx.c, qim0Var3, maxVar5, gdxVar3, null, idn0Var3, null, null, vu30Var6, vu30Var8, b0kVar2, (i9 & 14) | 48 | ((i9 << 3) & 896) | (57344 & i14) | (i14 & 458752) | ((i9 << 12) & 1879048192), (i9 >> 18) & 126, 328);
                        maxVar3 = maxVar5;
                        gdxVar2 = gdxVar3;
                        idn0Var2 = idn0Var3;
                        vu30Var5 = vu30Var6;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        qim0Var3 = qim0Var2;
                        maxVar3 = maxVar2;
                        gdxVar2 = gdxVarR;
                        idn0Var2 = idn0Var;
                        vu30Var5 = vu30Var3;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new ra5(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var5, vu30Var2, i, i2, (byte) 2);
                    }
                }
                i3 |= 384;
                maxVar2 = maxVar;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        gdxVarR = gdxVar;
                        if (b0kVar3.g(gdxVarR)) {
                        }
                        i3 |= i12;
                    } else {
                        gdxVarR = gdxVar;
                    }
                    i3 |= i12;
                } else {
                    gdxVarR = gdxVar;
                }
                if ((i & 24576) == 0) {
                    i3 |= 8192;
                }
                i6 = 196608 | i3;
                i7 = i2 & 64;
                if (i7 != 0) {
                    if ((1572864 & i) == 0) {
                        vu30Var3 = vu30Var;
                        if (b0kVar3.i(vu30Var3)) {
                            i8 = 1048576;
                        } else {
                            i8 = 524288;
                        }
                        i6 |= i8;
                    }
                    if ((12582912 & i) == 0) {
                        vu30Var4 = vu30Var2;
                        if (b0kVar3.i(vu30Var4)) {
                            i10 = 8388608;
                        } else {
                            i10 = 4194304;
                        }
                        i6 |= i10;
                    } else {
                        vu30Var4 = vu30Var2;
                    }
                    if ((4793491 & i6) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (b0kVar3.Y(i6 & 1, z)) {
                        b0kVar3.d0();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                                qim0Var3 = nim0.a;
                            } else {
                                qim0Var3 = qim0Var2;
                            }
                            if (i4 != 0) {
                                maxVar4 = jax.a;
                            } else {
                                maxVar4 = maxVar2;
                            }
                            if ((i2 & 8) != 0) {
                                i6 &= -7169;
                                gdxVarR = yla.r(b0kVar3);
                            }
                            idn0 idn0VarY4 = zso1.Y(b0kVar3);
                            i9 = i6 & (-57345);
                            if (i7 != 0) {
                                vu30Var3 = null;
                            }
                            vu30Var6 = vu30Var3;
                            maxVar5 = maxVar4;
                            idn0Var3 = idn0VarY4;
                            gdxVar3 = gdxVarR;
                        } else {
                            if (i11 != 0) {
                                qim0Var3 = nim0.a;
                            } else {
                                qim0Var3 = qim0Var2;
                            }
                            if (i4 != 0) {
                                maxVar4 = jax.a;
                            } else {
                                maxVar4 = maxVar2;
                            }
                            if ((i2 & 8) != 0) {
                                i6 &= -7169;
                                gdxVarR = yla.r(b0kVar3);
                            }
                            idn0 idn0VarY5 = zso1.Y(b0kVar3);
                            i9 = i6 & (-57345);
                            if (i7 != 0) {
                                vu30Var3 = null;
                            }
                            vu30Var6 = vu30Var3;
                            maxVar5 = maxVar4;
                            idn0Var3 = idn0VarY5;
                            gdxVar3 = gdxVarR;
                        }
                        b0kVar3.s();
                        int i15 = i9 << 6;
                        b0kVar2 = b0kVar3;
                        vu30 vu30Var9 = vu30Var4;
                        c(gbxVar, ldx.c, qim0Var3, maxVar5, gdxVar3, null, idn0Var3, null, null, vu30Var6, vu30Var9, b0kVar2, (i9 & 14) | 48 | ((i9 << 3) & 896) | (57344 & i15) | (i15 & 458752) | ((i9 << 12) & 1879048192), (i9 >> 18) & 126, 328);
                        maxVar3 = maxVar5;
                        gdxVar2 = gdxVar3;
                        idn0Var2 = idn0Var3;
                        vu30Var5 = vu30Var6;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        qim0Var3 = qim0Var2;
                        maxVar3 = maxVar2;
                        gdxVar2 = gdxVarR;
                        idn0Var2 = idn0Var;
                        vu30Var5 = vu30Var3;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new ra5(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var5, vu30Var2, i, i2, (byte) 2);
                    }
                }
                i6 = 1769472 | i3;
                vu30Var3 = vu30Var;
                if ((12582912 & i) == 0) {
                    vu30Var4 = vu30Var2;
                    if (b0kVar3.i(vu30Var4)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i6 |= i10;
                } else {
                    vu30Var4 = vu30Var2;
                }
                if ((4793491 & i6) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i6 & 1, z)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var2;
                        }
                        if (i4 != 0) {
                            maxVar4 = jax.a;
                        } else {
                            maxVar4 = maxVar2;
                        }
                        if ((i2 & 8) != 0) {
                            i6 &= -7169;
                            gdxVarR = yla.r(b0kVar3);
                        }
                        idn0 idn0VarY6 = zso1.Y(b0kVar3);
                        i9 = i6 & (-57345);
                        if (i7 != 0) {
                            vu30Var3 = null;
                        }
                        vu30Var6 = vu30Var3;
                        maxVar5 = maxVar4;
                        idn0Var3 = idn0VarY6;
                        gdxVar3 = gdxVarR;
                    } else {
                        if (i11 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var2;
                        }
                        if (i4 != 0) {
                            maxVar4 = jax.a;
                        } else {
                            maxVar4 = maxVar2;
                        }
                        if ((i2 & 8) != 0) {
                            i6 &= -7169;
                            gdxVarR = yla.r(b0kVar3);
                        }
                        idn0 idn0VarY7 = zso1.Y(b0kVar3);
                        i9 = i6 & (-57345);
                        if (i7 != 0) {
                            vu30Var3 = null;
                        }
                        vu30Var6 = vu30Var3;
                        maxVar5 = maxVar4;
                        idn0Var3 = idn0VarY7;
                        gdxVar3 = gdxVarR;
                    }
                    b0kVar3.s();
                    int i16 = i9 << 6;
                    b0kVar2 = b0kVar3;
                    vu30 vu30Var10 = vu30Var4;
                    c(gbxVar, ldx.c, qim0Var3, maxVar5, gdxVar3, null, idn0Var3, null, null, vu30Var6, vu30Var10, b0kVar2, (i9 & 14) | 48 | ((i9 << 3) & 896) | (57344 & i16) | (i16 & 458752) | ((i9 << 12) & 1879048192), (i9 >> 18) & 126, 328);
                    maxVar3 = maxVar5;
                    gdxVar2 = gdxVar3;
                    idn0Var2 = idn0Var3;
                    vu30Var5 = vu30Var6;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    qim0Var3 = qim0Var2;
                    maxVar3 = maxVar2;
                    gdxVar2 = gdxVarR;
                    idn0Var2 = idn0Var;
                    vu30Var5 = vu30Var3;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new ra5(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var5, vu30Var2, i, i2, (byte) 2);
                }
            }
            i3 |= 48;
            qim0Var2 = qim0Var;
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    maxVar2 = maxVar;
                    if (b0kVar3.g(maxVar2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        gdxVarR = gdxVar;
                        if (b0kVar3.g(gdxVarR)) {
                        }
                        i3 |= i12;
                    } else {
                        gdxVarR = gdxVar;
                    }
                    i3 |= i12;
                } else {
                    gdxVarR = gdxVar;
                }
                if ((i & 24576) == 0) {
                    i3 |= 8192;
                }
                i6 = 196608 | i3;
                i7 = i2 & 64;
                if (i7 != 0) {
                    if ((1572864 & i) == 0) {
                        vu30Var3 = vu30Var;
                        if (b0kVar3.i(vu30Var3)) {
                            i8 = 1048576;
                        } else {
                            i8 = 524288;
                        }
                        i6 |= i8;
                    }
                    if ((12582912 & i) == 0) {
                        vu30Var4 = vu30Var2;
                        if (b0kVar3.i(vu30Var4)) {
                            i10 = 8388608;
                        } else {
                            i10 = 4194304;
                        }
                        i6 |= i10;
                    } else {
                        vu30Var4 = vu30Var2;
                    }
                    if ((4793491 & i6) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (b0kVar3.Y(i6 & 1, z)) {
                        b0kVar3.d0();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                                qim0Var3 = nim0.a;
                            } else {
                                qim0Var3 = qim0Var2;
                            }
                            if (i4 != 0) {
                                maxVar4 = jax.a;
                            } else {
                                maxVar4 = maxVar2;
                            }
                            if ((i2 & 8) != 0) {
                                i6 &= -7169;
                                gdxVarR = yla.r(b0kVar3);
                            }
                            idn0 idn0VarY8 = zso1.Y(b0kVar3);
                            i9 = i6 & (-57345);
                            if (i7 != 0) {
                                vu30Var3 = null;
                            }
                            vu30Var6 = vu30Var3;
                            maxVar5 = maxVar4;
                            idn0Var3 = idn0VarY8;
                            gdxVar3 = gdxVarR;
                        } else {
                            if (i11 != 0) {
                                qim0Var3 = nim0.a;
                            } else {
                                qim0Var3 = qim0Var2;
                            }
                            if (i4 != 0) {
                                maxVar4 = jax.a;
                            } else {
                                maxVar4 = maxVar2;
                            }
                            if ((i2 & 8) != 0) {
                                i6 &= -7169;
                                gdxVarR = yla.r(b0kVar3);
                            }
                            idn0 idn0VarY9 = zso1.Y(b0kVar3);
                            i9 = i6 & (-57345);
                            if (i7 != 0) {
                                vu30Var3 = null;
                            }
                            vu30Var6 = vu30Var3;
                            maxVar5 = maxVar4;
                            idn0Var3 = idn0VarY9;
                            gdxVar3 = gdxVarR;
                        }
                        b0kVar3.s();
                        int i17 = i9 << 6;
                        b0kVar2 = b0kVar3;
                        vu30 vu30Var11 = vu30Var4;
                        c(gbxVar, ldx.c, qim0Var3, maxVar5, gdxVar3, null, idn0Var3, null, null, vu30Var6, vu30Var11, b0kVar2, (i9 & 14) | 48 | ((i9 << 3) & 896) | (57344 & i17) | (i17 & 458752) | ((i9 << 12) & 1879048192), (i9 >> 18) & 126, 328);
                        maxVar3 = maxVar5;
                        gdxVar2 = gdxVar3;
                        idn0Var2 = idn0Var3;
                        vu30Var5 = vu30Var6;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        qim0Var3 = qim0Var2;
                        maxVar3 = maxVar2;
                        gdxVar2 = gdxVarR;
                        idn0Var2 = idn0Var;
                        vu30Var5 = vu30Var3;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new ra5(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var5, vu30Var2, i, i2, (byte) 2);
                    }
                }
                i6 = 1769472 | i3;
                vu30Var3 = vu30Var;
                if ((12582912 & i) == 0) {
                    vu30Var4 = vu30Var2;
                    if (b0kVar3.i(vu30Var4)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i6 |= i10;
                } else {
                    vu30Var4 = vu30Var2;
                }
                if ((4793491 & i6) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i6 & 1, z)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var2;
                        }
                        if (i4 != 0) {
                            maxVar4 = jax.a;
                        } else {
                            maxVar4 = maxVar2;
                        }
                        if ((i2 & 8) != 0) {
                            i6 &= -7169;
                            gdxVarR = yla.r(b0kVar3);
                        }
                        idn0 idn0VarY10 = zso1.Y(b0kVar3);
                        i9 = i6 & (-57345);
                        if (i7 != 0) {
                            vu30Var3 = null;
                        }
                        vu30Var6 = vu30Var3;
                        maxVar5 = maxVar4;
                        idn0Var3 = idn0VarY10;
                        gdxVar3 = gdxVarR;
                    } else {
                        if (i11 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var2;
                        }
                        if (i4 != 0) {
                            maxVar4 = jax.a;
                        } else {
                            maxVar4 = maxVar2;
                        }
                        if ((i2 & 8) != 0) {
                            i6 &= -7169;
                            gdxVarR = yla.r(b0kVar3);
                        }
                        idn0 idn0VarY11 = zso1.Y(b0kVar3);
                        i9 = i6 & (-57345);
                        if (i7 != 0) {
                            vu30Var3 = null;
                        }
                        vu30Var6 = vu30Var3;
                        maxVar5 = maxVar4;
                        idn0Var3 = idn0VarY11;
                        gdxVar3 = gdxVarR;
                    }
                    b0kVar3.s();
                    int i18 = i9 << 6;
                    b0kVar2 = b0kVar3;
                    vu30 vu30Var12 = vu30Var4;
                    c(gbxVar, ldx.c, qim0Var3, maxVar5, gdxVar3, null, idn0Var3, null, null, vu30Var6, vu30Var12, b0kVar2, (i9 & 14) | 48 | ((i9 << 3) & 896) | (57344 & i18) | (i18 & 458752) | ((i9 << 12) & 1879048192), (i9 >> 18) & 126, 328);
                    maxVar3 = maxVar5;
                    gdxVar2 = gdxVar3;
                    idn0Var2 = idn0Var3;
                    vu30Var5 = vu30Var6;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    qim0Var3 = qim0Var2;
                    maxVar3 = maxVar2;
                    gdxVar2 = gdxVarR;
                    idn0Var2 = idn0Var;
                    vu30Var5 = vu30Var3;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new ra5(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var5, vu30Var2, i, i2, (byte) 2);
                }
            }
            i3 |= 384;
            maxVar2 = maxVar;
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    gdxVarR = gdxVar;
                    if (b0kVar3.g(gdxVarR)) {
                    }
                    i3 |= i12;
                } else {
                    gdxVarR = gdxVar;
                }
                i3 |= i12;
            } else {
                gdxVarR = gdxVar;
            }
            if ((i & 24576) == 0) {
                i3 |= 8192;
            }
            i6 = 196608 | i3;
            i7 = i2 & 64;
            if (i7 != 0) {
                if ((1572864 & i) == 0) {
                    vu30Var3 = vu30Var;
                    if (b0kVar3.i(vu30Var3)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i6 |= i8;
                }
                if ((12582912 & i) == 0) {
                    vu30Var4 = vu30Var2;
                    if (b0kVar3.i(vu30Var4)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i6 |= i10;
                } else {
                    vu30Var4 = vu30Var2;
                }
                if ((4793491 & i6) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i6 & 1, z)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var2;
                        }
                        if (i4 != 0) {
                            maxVar4 = jax.a;
                        } else {
                            maxVar4 = maxVar2;
                        }
                        if ((i2 & 8) != 0) {
                            i6 &= -7169;
                            gdxVarR = yla.r(b0kVar3);
                        }
                        idn0 idn0VarY12 = zso1.Y(b0kVar3);
                        i9 = i6 & (-57345);
                        if (i7 != 0) {
                            vu30Var3 = null;
                        }
                        vu30Var6 = vu30Var3;
                        maxVar5 = maxVar4;
                        idn0Var3 = idn0VarY12;
                        gdxVar3 = gdxVarR;
                    } else {
                        if (i11 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var2;
                        }
                        if (i4 != 0) {
                            maxVar4 = jax.a;
                        } else {
                            maxVar4 = maxVar2;
                        }
                        if ((i2 & 8) != 0) {
                            i6 &= -7169;
                            gdxVarR = yla.r(b0kVar3);
                        }
                        idn0 idn0VarY13 = zso1.Y(b0kVar3);
                        i9 = i6 & (-57345);
                        if (i7 != 0) {
                            vu30Var3 = null;
                        }
                        vu30Var6 = vu30Var3;
                        maxVar5 = maxVar4;
                        idn0Var3 = idn0VarY13;
                        gdxVar3 = gdxVarR;
                    }
                    b0kVar3.s();
                    int i19 = i9 << 6;
                    b0kVar2 = b0kVar3;
                    vu30 vu30Var13 = vu30Var4;
                    c(gbxVar, ldx.c, qim0Var3, maxVar5, gdxVar3, null, idn0Var3, null, null, vu30Var6, vu30Var13, b0kVar2, (i9 & 14) | 48 | ((i9 << 3) & 896) | (57344 & i19) | (i19 & 458752) | ((i9 << 12) & 1879048192), (i9 >> 18) & 126, 328);
                    maxVar3 = maxVar5;
                    gdxVar2 = gdxVar3;
                    idn0Var2 = idn0Var3;
                    vu30Var5 = vu30Var6;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    qim0Var3 = qim0Var2;
                    maxVar3 = maxVar2;
                    gdxVar2 = gdxVarR;
                    idn0Var2 = idn0Var;
                    vu30Var5 = vu30Var3;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new ra5(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var5, vu30Var2, i, i2, (byte) 2);
                }
            }
            i6 = 1769472 | i3;
            vu30Var3 = vu30Var;
            if ((12582912 & i) == 0) {
                vu30Var4 = vu30Var2;
                if (b0kVar3.i(vu30Var4)) {
                    i10 = 8388608;
                } else {
                    i10 = 4194304;
                }
                i6 |= i10;
            } else {
                vu30Var4 = vu30Var2;
            }
            if ((4793491 & i6) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i6 & 1, z)) {
                b0kVar3.d0();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var2;
                    }
                    if (i4 != 0) {
                        maxVar4 = jax.a;
                    } else {
                        maxVar4 = maxVar2;
                    }
                    if ((i2 & 8) != 0) {
                        i6 &= -7169;
                        gdxVarR = yla.r(b0kVar3);
                    }
                    idn0 idn0VarY14 = zso1.Y(b0kVar3);
                    i9 = i6 & (-57345);
                    if (i7 != 0) {
                        vu30Var3 = null;
                    }
                    vu30Var6 = vu30Var3;
                    maxVar5 = maxVar4;
                    idn0Var3 = idn0VarY14;
                    gdxVar3 = gdxVarR;
                } else {
                    if (i11 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var2;
                    }
                    if (i4 != 0) {
                        maxVar4 = jax.a;
                    } else {
                        maxVar4 = maxVar2;
                    }
                    if ((i2 & 8) != 0) {
                        i6 &= -7169;
                        gdxVarR = yla.r(b0kVar3);
                    }
                    idn0 idn0VarY15 = zso1.Y(b0kVar3);
                    i9 = i6 & (-57345);
                    if (i7 != 0) {
                        vu30Var3 = null;
                    }
                    vu30Var6 = vu30Var3;
                    maxVar5 = maxVar4;
                    idn0Var3 = idn0VarY15;
                    gdxVar3 = gdxVarR;
                }
                b0kVar3.s();
                int i110 = i9 << 6;
                b0kVar2 = b0kVar3;
                vu30 vu30Var14 = vu30Var4;
                c(gbxVar, ldx.c, qim0Var3, maxVar5, gdxVar3, null, idn0Var3, null, null, vu30Var6, vu30Var14, b0kVar2, (i9 & 14) | 48 | ((i9 << 3) & 896) | (57344 & i110) | (i110 & 458752) | ((i9 << 12) & 1879048192), (i9 >> 18) & 126, 328);
                maxVar3 = maxVar5;
                gdxVar2 = gdxVar3;
                idn0Var2 = idn0Var3;
                vu30Var5 = vu30Var6;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var3 = qim0Var2;
                maxVar3 = maxVar2;
                gdxVar2 = gdxVarR;
                idn0Var2 = idn0Var;
                vu30Var5 = vu30Var3;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new ra5(gbxVar, qim0Var3, maxVar3, gdxVar2, idn0Var2, vu30Var5, vu30Var2, i, i2, (byte) 2);
            }
        }

        public static final void i(fvb0 fvb0Var, final qqq0 qqq0Var, final cvb0 cvb0Var, final qim0 qim0Var, final zzq0 zzq0Var, final iq20 iq20Var, final boolean z, final hxq0 hxq0Var, final float f, final float f2, final iu30 iu30Var, b0k b0kVar, final int i, final int i2) {
            int i3;
            int i4;
            fvb0 fvb0Var2;
            b0k b0kVar2;
            int i5;
            fvb0 fvb0Var3;
            qqq0 qqq0Var2;
            qim0 qim0VarZ;
            m4c m4cVar = fkj0.X;
            b0k b0kVar3 = (x340) b0kVar;
            b0kVar3.k0(-1904835166);
            if ((i & 6) == 0) {
                i3 = (b0kVar3.g(fvb0Var) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
            if ((i & 48) == 0) {
                i3 |= b0kVar3.e(qqq0Var.ordinal()) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i3 |= (i & 512) == 0 ? b0kVar3.g(cvb0Var) : b0kVar3.i(cvb0Var) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i3 |= b0kVar3.g(qim0Var) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                i3 |= b0kVar3.g(zzq0Var) ? 16384 : 8192;
            }
            if ((i & 196608) == 0) {
                i3 |= b0kVar3.h(false) ? 131072 : 65536;
            }
            if ((i & 1572864) == 0) {
                i3 |= b0kVar3.g(iq20Var) ? 1048576 : 524288;
            }
            if ((i & 12582912) == 0) {
                i3 |= b0kVar3.h(z) ? 8388608 : 4194304;
            }
            if ((i & 100663296) == 0) {
                i3 |= b0kVar3.g(hxq0Var) ? 67108864 : 33554432;
            }
            if ((i & 805306368) == 0) {
                i3 |= b0kVar3.d(f) ? 536870912 : 268435456;
            }
            int i6 = i3;
            if ((i2 & 6) == 0) {
                i4 = i2 | (b0kVar3.d(f2) ? 4 : 2);
            } else {
                i4 = i2;
            }
            if ((i2 & 48) == 0) {
                i4 |= b0kVar3.i(iu30Var) ? 32 : 16;
            }
            int i7 = i4;
            if (b0kVar3.Y(i6 & 1, ((i6 & 306783379) == 306783378 && (i7 & 19) == 18) ? false : true)) {
                b0kVar3.d0();
                if ((i & 1) != 0 && !b0kVar3.E()) {
                    b0kVar3.b0();
                }
                b0kVar3.s();
                int i8 = i6 & 14;
                int i9 = i8 | (i7 & 112);
                ven0 ven0VarS = v8r.s(iu30Var, b0kVar3);
                boolean z2 = (((i9 & 14) ^ 6) > 4 && b0kVar3.g(fvb0Var)) || (i9 & 6) == 4;
                Object objT = b0kVar3.T();
                if (z2 || objT == m4cVar) {
                    c4x0 c4x0Var = c4x0.f;
                    e45 e45Var = new e45(ven0VarS, (byte) 9);
                    yt91 yt91Var = yv91.a;
                    objT = new i1w(new mdt(new qga0(new mdt(e45Var, c4x0Var), fvb0Var, (byte) 5), c4x0Var), tob1.class, "value", "getValue()Ljava/lang/Object;", 0, (byte) 9);
                    b0kVar3.s0(objT);
                }
                ima0 ima0Var = (ima0) objT;
                Object objT2 = b0kVar3.T();
                if (objT2 == m4cVar) {
                    objT2 = qxd0.M(o6x.a, b0kVar3);
                    b0kVar3.s0(objT2);
                }
                c9n c9nVar = (c9n) objT2;
                yd50 yd50Var = (yd50) b0kVar3.k(t4k.g);
                int i10 = i6 >> 6;
                int i11 = i6 >> 12;
                int i12 = (i10 & 7168) | i8 | (i10 & 896) | ((i6 << 9) & 57344) | (i11 & 458752) | ((i7 << 18) & 3670016) | ((i6 << 18) & 234881024);
                boolean zG = ((((i12 & 896) ^ 384) > 256 && b0kVar3.g(zzq0Var)) || (i12 & 384) == 256) | ((((i12 & 14) ^ 6) > 4 && b0kVar3.g(fvb0Var)) || (i12 & 6) == 4) | b0kVar3.g(ima0Var) | ((((i12 & 7168) ^ 3072) > 2048 && b0kVar3.h(false)) || (i12 & 3072) == 2048) | ((((i12 & 57344) ^ 24576) > 16384 && b0kVar3.e(qqq0Var.ordinal())) || (i12 & 24576) == 16384) | ((((i12 & 458752) ^ 196608) > 131072 && b0kVar3.d(f)) || (i12 & 196608) == 131072) | ((((i12 & 3670016) ^ 1572864) > 1048576 && b0kVar3.d(f2)) || (i12 & 1572864) == 1048576) | ((((i12 & 234881024) ^ 100663296) > 67108864 && b0kVar3.g(cvb0Var)) || (i12 & 100663296) == 67108864) | b0kVar3.g(yd50Var);
                Object objT3 = b0kVar3.T();
                if (zG || objT3 == m4cVar) {
                    i5 = 4;
                    xub0 xub0Var = new xub0(fvb0Var, qqq0Var, cvb0Var, ima0Var, zzq0Var, f, c9nVar, yd50Var);
                    fvb0Var3 = fvb0Var;
                    b0kVar3.s0(xub0Var);
                    objT3 = xub0Var;
                } else {
                    i5 = 4;
                    fvb0Var3 = fvb0Var;
                }
                hsb0 hsb0Var = (hsb0) objT3;
                int i13 = i8 | (i11 & 112);
                boolean z3 = ((((i13 & 112) ^ 48) > 32 && b0kVar3.h(false)) || (i13 & 48) == 32) | ((((i13 & 14) ^ 6) > i5 && b0kVar3.g(fvb0Var3)) || (i13 & 6) == i5);
                Object objT4 = b0kVar3.T();
                if (z3 || objT4 == m4cVar) {
                    objT4 = new bvb0(fvb0Var3);
                    b0kVar3.s0(objT4);
                }
                bvb0 bvb0Var = (bvb0) objT4;
                if (z) {
                    b0kVar3.i0(-1834596342);
                    boolean z4 = ((i8 ^ 6) > i5 && b0kVar3.g(fvb0Var3)) || (i6 & 6) == i5;
                    Object objT5 = b0kVar3.T();
                    if (z4 || objT5 == m4cVar) {
                        objT5 = new lub0(fvb0Var3);
                        b0kVar3.s0(objT5);
                    }
                    qqq0Var2 = qqq0Var;
                    qim0VarZ = dem1.z((lub0) objT5, fvb0Var3.k, false, qqq0Var2);
                    b0kVar3.r(false);
                } else {
                    qqq0Var2 = qqq0Var;
                    b0kVar3.i0(-1834291488);
                    b0kVar3.r(false);
                    qim0VarZ = nim0.a;
                }
                fvb0 fvb0Var4 = fvb0Var3;
                qim0 qim0VarS = xfo1.s(t4n1.u(kln1.x(qim0Var.then(fvb0Var3.i).then(fvb0Var3.j), ima0Var, bvb0Var, qqq0Var2, z, false).then(qim0VarZ), fvb0Var3.t), fvb0Var4, qqq0Var, hxq0Var, z, false, iq20Var, fvb0Var3.r, null);
                fvb0Var2 = fvb0Var4;
                b0kVar2 = b0kVar3;
                hm5.f(ima0Var, qim0VarS, fvb0Var2.m, hsb0Var, b0kVar2, 0, 0);
            } else {
                fvb0Var2 = fvb0Var;
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
            }
            h311 h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                final fvb0 fvb0Var5 = fvb0Var2;
                h311VarV.d = new vu30() { // from class: p.sub0
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iP = czo1.p(i | 1);
                        int iP2 = czo1.p(i2);
                        foo1.i(fvb0Var5, qqq0Var, cvb0Var, qim0Var, zzq0Var, iq20Var, z, hxq0Var, f, f2, iu30Var, (b0k) obj, iP, iP2);
                        return rih1.a;
                    }
                };
            }
        }

        public static final void j(String str, int i, boolean z, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i2) {
            qim0 qim0Var2;
            boolean z2;
            qim0 qim0Var3;
            b0k b0kVar2 = (x340) b0kVar;
            b0kVar2.k0(1493914777);
            j06 j06Var = ((x340) b0kVar2).a;
            int i3 = i2 | (b0kVar2.g(str) ? 4 : 2) | (b0kVar2.e(i) ? 32 : 16) | (b0kVar2.h(z) ? 256 : 128) | (b0kVar2.i(iu30Var) ? 2048 : 1024) | 24576;
            if (b0kVar2.Y(i3 & 1, (i3 & 9363) != 9362)) {
                era eraVar = een.Q0;
                uwr uwrVar = cbx.a;
                d36 d36Var = new d36(cbx.b(b0kVar2).b.b, true, new um5(false));
                qim0 qim0Var4 = nim0.a;
                qim0 qim0VarN = anm1.N("RatingsPageCard", qim0Var4);
                mbh mbhVarA = jbh.a(d36Var, eraVar, b0kVar2, 0);
                int iHashCode = Long.hashCode(((x340) b0kVar2).T);
                xos0 xos0VarM = b0kVar2.m();
                qim0 qim0VarE = zr7.E(b0kVar2, qim0VarN);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                b0kVar2.m0();
                boolean z3 = ((x340) b0kVar2).S;
                n4k n4kVar = hmb0.t1;
                if (z3) {
                    b0kVar2.l(n4kVar);
                } else {
                    b0kVar2.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(mbhVarA, b0kVar2, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, b0kVar2, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, b0kVar2, lljVar3);
                nko1.F(b0kVar2);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, b0kVar2, lljVar4);
                qim0 qim0VarQ = i1p1.q(sto1.o(u291.r(qim0Var4, 168.0f), 10.0f, er31.b(12.0f), false, 0L, 0L, 28), er31.b(12.0f));
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
                xos0 xos0VarM2 = b0kVar2.m();
                qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarQ);
                b0kVar2.m0();
                if (((x340) b0kVar2).S) {
                    b0kVar2.l(n4kVar);
                } else {
                    b0kVar2.v0();
                }
                nko1.H(gfh0VarC, b0kVar2, lljVar);
                nko1.H(xos0VarM2, b0kVar2, lljVar2);
                x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
                nko1.H(qim0VarE2, b0kVar2, lljVar4);
                eso1.e(Uri.parse(str), isl.a, u291.d(qim0Var4, 1.0f), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, b0kVar2, 3120, 0, 4080);
                b0kVar2.r(true);
                uwo1.e(cwl1.o0(b0kVar2, z ? 2131960850 : 2131960852), anm1.N(z ? "RatingsPageCanRate" : "RatingsPageCannotRate", qim0Var4), cbx.d(b0kVar2).d, cbx.a(b0kVar2).b.a, new a0e1(3), null, 0, false, null, 0, null, b0kVar2, 0, 0, 2016);
                if (z) {
                    b0kVar2.i0(-266201874);
                    int i4 = i3 & 112;
                    String strU = cwl1.U(2131820547, i, new Object[]{Integer.valueOf(i)}, b0kVar2);
                    zov0 zov0Var = cbx.b(b0kVar2).g;
                    qim0 qim0VarN2 = anm1.N("RatingsPageRatingSelector", qim0Var4);
                    boolean zG = (i4 == 32) | b0kVar2.g(strU) | ((i3 & 7168) == 2048);
                    Object objT = b0kVar2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new bc40(strU, i, iu30Var);
                        b0kVar2.s0(objT);
                    }
                    b0kVar2 = b0kVar2;
                    ozn1.j(i, iu30Var, s161.a(qim0VarN2, (iu30) objT), 32.0f, b0kVar2, ((i3 >> 3) & 14) | ((i3 >> 6) & 112), 0);
                    b0kVar2.r(false);
                    qim0Var3 = qim0Var4;
                    z2 = true;
                } else {
                    b0kVar2 = b0kVar2;
                    b0kVar2.i0(-265363355);
                    z2 = true;
                    qim0Var3 = qim0Var4;
                    uwo1.e(cwl1.o0(b0kVar2, 2131960851), u291.v(qim0Var4, 252.0f), cbx.d(b0kVar2).g, cbx.a(b0kVar2).b.a, new a0e1(3), null, 0, false, null, 0, null, b0kVar2, 0, 0, 2016);
                    b0kVar2.r(false);
                }
                b0kVar2.r(z2);
                qim0Var2 = qim0Var3;
            } else {
                b0kVar2.b0();
                qim0Var2 = qim0Var;
            }
            h311 h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new hmy(str, i, z, iu30Var, qim0Var2, i2);
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public static final void k(c380 c380Var, gkc1 gkc1Var, iu30 iu30Var, boolean z, xu30 xu30Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
            c380<fkc1> c380Var2;
            int i2;
            String strO0;
            String strK;
            duk1 duk1Var;
            duk1 duk1Var2;
            String strK2;
            jez jezVar;
            jez jezVar2;
            String strK3;
            ha20 ha20Var;
            ha20 ha20Var2;
            String strK4;
            rx30 rx30Var;
            rx30 rx30Var2;
            String strK5;
            m7f0 m7f0Var;
            m7f0 m7f0Var2;
            String strK6;
            vaa0 vaa0Var;
            vaa0 vaa0Var2;
            xu30 xu30Var2 = xu30Var;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-1031727578);
            if ((i & 6) == 0) {
                c380Var2 = c380Var;
                i2 = (x340Var.g(c380Var2) ? 4 : 2) | i;
            } else {
                c380Var2 = c380Var;
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= x340Var.i(gkc1Var) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= x340Var.i(iu30Var) ? 256 : 128;
            }
            boolean z2 = z;
            if ((i & 3072) == 0) {
                i2 |= x340Var.h(z2) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                i2 |= x340Var.i(xu30Var2) ? 16384 : 8192;
            }
            boolean z3 = true;
            boolean z4 = false;
            if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
                qim0 qim0VarB = uyn1.B(uyn1.z(20.0f, 0.0f, 2, u291.f(nim0.a, 1.0f)), 0.0f, 8.0f, 0.0f, 0.0f, 13);
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
                nko1.H(mbhVarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                x340Var.i0(884490495);
                for (fkc1 fkc1Var : c380Var2) {
                    long jK = f5p1.k(x340Var, fkc1Var.b);
                    String strO1 = cwl1.o0(x340Var, fkc1Var.a);
                    x340Var.i0(-1065234227);
                    boolean z5 = gkc1Var.b;
                    w8w0 w8w0Var = gkc1Var.a;
                    if (z5) {
                        strO0 = x0d.k(x340Var, 1120591642, 2131958671, x340Var, z4);
                    } else {
                        x340Var.i0(1120648341);
                        x340Var.r(z4);
                        String strO2 = cwl1.o0(x340Var, 2131958669);
                        strO0 = cwl1.o0(x340Var, 2131958671);
                        int iOrdinal = fkc1Var.ordinal();
                        if (iOrdinal == 0) {
                            z4 = false;
                            x340Var.i0(-1487863586);
                            if (gkc1Var.i) {
                                x340Var.i0(-1487862600);
                                x340Var.r(false);
                            } else {
                                x340Var.i0(1120935401);
                                buk1 buk1Var = gkc1Var.c;
                                Integer numValueOf = (buk1Var == null || (duk1Var2 = buk1Var.a) == null) ? null : Integer.valueOf(si1.x(duk1Var2));
                                if (numValueOf == null) {
                                    x340Var.i0(1120969562);
                                    x340Var.r(false);
                                    strK = null;
                                } else {
                                    strK = kk0.k(x340Var, 1120969563, numValueOf, x340Var, false);
                                }
                                if (strK == null) {
                                    x340Var.i0(1121052891);
                                    Integer numValueOf2 = (w8w0Var == null || (duk1Var = w8w0Var.a.a) == null) ? null : Integer.valueOf(si1.x(duk1Var));
                                    if (numValueOf2 == null) {
                                        x340Var.i0(1121052890);
                                        z4 = false;
                                        x340Var.r(false);
                                        strK = null;
                                    } else {
                                        z4 = false;
                                        strK = kk0.k(x340Var, 1121052891, numValueOf2, x340Var, false);
                                    }
                                } else {
                                    z4 = false;
                                    x340Var.i0(-1487861470);
                                }
                                x340Var.r(z4);
                                strO2 = strK == null ? strO0 : strK;
                                x340Var.r(z4);
                            }
                            x340Var.r(z4);
                        } else if (iOrdinal == z3) {
                            z4 = false;
                            x340Var.i0(-1487854894);
                            if (gkc1Var.j) {
                                x340Var.i0(-1487854024);
                                x340Var.r(false);
                            } else {
                                x340Var.i0(1121201009);
                                hez hezVar = gkc1Var.d;
                                Integer numValueOf3 = (hezVar == null || (jezVar2 = hezVar.a) == null) ? null : Integer.valueOf(w0h1.M(jezVar2));
                                if (numValueOf3 == null) {
                                    x340Var.i0(1121231450);
                                    x340Var.r(false);
                                    strK2 = null;
                                } else {
                                    strK2 = kk0.k(x340Var, 1121231451, numValueOf3, x340Var, false);
                                }
                                if (strK2 == null) {
                                    x340Var.i0(1121310811);
                                    Integer numValueOf4 = (w8w0Var == null || (jezVar = w8w0Var.b.a) == null) ? null : Integer.valueOf(w0h1.M(jezVar));
                                    if (numValueOf4 == null) {
                                        x340Var.i0(1121310810);
                                        z4 = false;
                                        x340Var.r(false);
                                        strK2 = null;
                                    } else {
                                        z4 = false;
                                        strK2 = kk0.k(x340Var, 1121310811, numValueOf4, x340Var, false);
                                    }
                                } else {
                                    z4 = false;
                                    x340Var.i0(-1487852902);
                                }
                                x340Var.r(z4);
                                strO2 = strK2 == null ? strO0 : strK2;
                                x340Var.r(z4);
                            }
                            x340Var.r(z4);
                        } else if (iOrdinal == 2) {
                            z4 = false;
                            x340Var.i0(-1487846432);
                            if (gkc1Var.k) {
                                x340Var.i0(-1487845448);
                                x340Var.r(false);
                            } else {
                                x340Var.i0(1121467175);
                                fa20 fa20Var = gkc1Var.e;
                                Integer numValueOf5 = (fa20Var == null || (ha20Var2 = fa20Var.a) == null) ? null : Integer.valueOf(h1p1.n(ha20Var2));
                                if (numValueOf5 == null) {
                                    x340Var.i0(1121501274);
                                    x340Var.r(false);
                                    strK3 = null;
                                } else {
                                    strK3 = kk0.k(x340Var, 1121501275, numValueOf5, x340Var, false);
                                }
                                if (strK3 == null) {
                                    x340Var.i0(1121586587);
                                    Integer numValueOf6 = (w8w0Var == null || (ha20Var = w8w0Var.c.a) == null) ? null : Integer.valueOf(h1p1.n(ha20Var));
                                    if (numValueOf6 == null) {
                                        x340Var.i0(1121586586);
                                        z4 = false;
                                        x340Var.r(false);
                                        strK3 = null;
                                    } else {
                                        z4 = false;
                                        strK3 = kk0.k(x340Var, 1121586587, numValueOf6, x340Var, false);
                                    }
                                } else {
                                    z4 = false;
                                    x340Var.i0(-1487844316);
                                }
                                x340Var.r(z4);
                                strO2 = strK3 == null ? strO0 : strK3;
                                x340Var.r(z4);
                            }
                            x340Var.r(z4);
                        } else if (iOrdinal == 3) {
                            z4 = false;
                            x340Var.i0(-1487837518);
                            if (gkc1Var.l) {
                                x340Var.i0(-1487836648);
                                x340Var.r(false);
                            } else {
                                x340Var.i0(1121739665);
                                px30 px30Var = gkc1Var.f;
                                Integer numValueOf7 = (px30Var == null || (rx30Var2 = px30Var.a) == null) ? null : Integer.valueOf(w0h1.N(rx30Var2));
                                if (numValueOf7 == null) {
                                    x340Var.i0(1121770106);
                                    x340Var.r(false);
                                    strK4 = null;
                                } else {
                                    strK4 = kk0.k(x340Var, 1121770107, numValueOf7, x340Var, false);
                                }
                                if (strK4 == null) {
                                    x340Var.i0(1121849467);
                                    Integer numValueOf8 = (w8w0Var == null || (rx30Var = w8w0Var.d.a) == null) ? null : Integer.valueOf(w0h1.N(rx30Var));
                                    if (numValueOf8 == null) {
                                        x340Var.i0(1121849466);
                                        z4 = false;
                                        x340Var.r(false);
                                        strK4 = null;
                                    } else {
                                        z4 = false;
                                        strK4 = kk0.k(x340Var, 1121849467, numValueOf8, x340Var, false);
                                    }
                                } else {
                                    z4 = false;
                                    x340Var.i0(-1487835526);
                                }
                                x340Var.r(z4);
                                strO2 = strK4 == null ? strO0 : strK4;
                                x340Var.r(z4);
                            }
                            x340Var.r(z4);
                        } else if (iOrdinal == 4) {
                            z4 = false;
                            x340Var.i0(-1487829004);
                            if (gkc1Var.m) {
                                x340Var.i0(1121969592);
                                x340Var.r(false);
                            } else {
                                x340Var.i0(1122018727);
                                k7f0 k7f0Var = gkc1Var.g;
                                Integer numValueOf9 = (k7f0Var == null || (m7f0Var2 = k7f0Var.a) == null) ? null : Integer.valueOf(yto.s(m7f0Var2));
                                if (numValueOf9 == null) {
                                    x340Var.i0(1122053818);
                                    x340Var.r(false);
                                    strK5 = null;
                                } else {
                                    strK5 = kk0.k(x340Var, 1122053819, numValueOf9, x340Var, false);
                                }
                                if (strK5 == null) {
                                    x340Var.i0(1122138139);
                                    Integer numValueOf10 = (w8w0Var == null || (m7f0Var = w8w0Var.f.a) == null) ? null : Integer.valueOf(yto.s(m7f0Var));
                                    if (numValueOf10 == null) {
                                        x340Var.i0(1122138138);
                                        z4 = false;
                                        x340Var.r(false);
                                        strK5 = null;
                                    } else {
                                        z4 = false;
                                        strK5 = kk0.k(x340Var, 1122138139, numValueOf10, x340Var, false);
                                    }
                                } else {
                                    z4 = false;
                                    x340Var.i0(-1487826524);
                                }
                                x340Var.r(z4);
                                strO2 = strK5 == null ? strO0 : strK5;
                                x340Var.r(z4);
                            }
                            x340Var.r(z4);
                        } else {
                            if (iOrdinal != 5) {
                                throw p3d1.k(x340Var, -1487863759, false);
                            }
                            x340Var.i0(1122235913);
                            taa0 taa0Var = gkc1Var.h;
                            Integer numValueOf11 = (taa0Var == null || (vaa0Var2 = taa0Var.a) == null) ? null : Integer.valueOf(z1a1.o(vaa0Var2));
                            if (numValueOf11 == null) {
                                x340Var.i0(1122272058);
                                x340Var.r(false);
                                strK6 = null;
                            } else {
                                strK6 = kk0.k(x340Var, 1122272059, numValueOf11, x340Var, false);
                            }
                            if (strK6 == null) {
                                x340Var.i0(1122355387);
                                Integer numValueOf12 = (w8w0Var == null || (vaa0Var = w8w0Var.e.a) == null) ? null : Integer.valueOf(z1a1.o(vaa0Var));
                                if (numValueOf12 == null) {
                                    x340Var.i0(1122355386);
                                    z4 = false;
                                    x340Var.r(false);
                                    strK6 = null;
                                } else {
                                    z4 = false;
                                    strK6 = kk0.k(x340Var, 1122355387, numValueOf12, x340Var, false);
                                }
                            } else {
                                z4 = false;
                                x340Var.i0(-1487819516);
                            }
                            x340Var.r(z4);
                            if (strK6 != null) {
                                strO0 = strK6;
                            }
                            x340Var.r(z4);
                        }
                        strO0 = strO2;
                    }
                    x340Var.r(z4);
                    String str = strO0;
                    boolean zE = ((i2 & 896) == 256 ? z3 : z4) | x340Var.e(fkc1Var.ordinal());
                    Object objT = x340Var.T();
                    if (zE || objT == fkj0.X) {
                        objT = new k7a1(iu30Var, fkc1Var, (byte) 18);
                        x340Var.s0(objT);
                    }
                    l(jK, strO1, str, (Function0) objT, fkc1Var.c, z2, x340Var, (i2 << 6) & 458752);
                    z2 = z;
                    i2 = i2;
                    z4 = z4;
                    z3 = true;
                }
                x340Var.r(z4);
                xu30Var2 = xu30Var;
                xu30Var2.invoke(pbh.a, x340Var, Integer.valueOf(((i2 >> 9) & 112) | 6));
                x340Var.r(true);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new cnr0(c380Var, gkc1Var, iu30Var, z, xu30Var2, i);
            }
        }

        public static final void l(long j, String str, String str2, Function0 function0, String str3, boolean z, b0k b0kVar, int i) {
            int i2;
            b0k b0kVar2;
            gbx gbxVar;
            b0k b0kVar3 = (x340) b0kVar;
            b0kVar3.k0(-1233063179);
            if ((i & 6) == 0) {
                i2 = (b0kVar3.f(j) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= b0kVar3.g(str) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= b0kVar3.g(str2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i2 |= b0kVar3.i(function0) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                i2 |= b0kVar3.g(str3) ? 16384 : 8192;
            }
            if ((196608 & i) == 0) {
                i2 |= b0kVar3.h(z) ? 131072 : 65536;
            }
            if (b0kVar3.Y(i2 & 1, (74899 & i2) != 74898)) {
                z50 z50Var = z50.c;
                if (z) {
                    b0kVar3.i0(437265637);
                    Object objT = b0kVar3.T();
                    if (objT == fkj0.X) {
                        objT = l4b1.Y0;
                        b0kVar3.s0(objT);
                    }
                    gbxVar = new gbx(z50Var, (Function0) objT);
                    b0kVar3.r(false);
                } else {
                    b0kVar3.i0(437266763);
                    b0kVar3.r(false);
                    gbxVar = new gbx(z50Var, function0);
                }
                b0kVar2 = b0kVar3;
                c(gbxVar, new hdx(0, (vu30) null, (vu30) null, (vu30) null, d4o1.a, 15), anm1.N(str3, u291.f(nim0.a, 1.0f)), z ? new hax("User is on a None preset") : jax.a, null, uyn1.h(3, 0.0f, 0.0f), null, null, null, null, apo.r(1284339508, new zoq0(j, str, str2), b0kVar3), b0kVar2, 1572864, 48, 1960);
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
            }
            h311 h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new sc5(j, str, str2, function0, str3, z, i);
            }
        }

        public static final void m(z3i1 z3i1Var, b0k b0kVar, int i) {
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(454211398);
            int i2 = (x340Var.i(z3i1Var) ? 4 : 2) | i;
            if (!x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
                x340Var.b0();
            } else if (((Boolean) z3i1Var.b.getValue()).booleanValue()) {
                x340Var.i0(-2030104177);
                boolean zI = x340Var.i(z3i1Var);
                Object objT = x340Var.T();
                if (zI || objT == fkj0.X) {
                    objT = new dch1(z3i1Var, (byte) 10);
                    x340Var.s0(objT);
                }
                vno1.g((Function0) objT, x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(-2030030180);
                x340Var.r(false);
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new muh1(z3i1Var, i, (byte) 4);
            }
        }

        public static final void n(float f, String str, long j, iu30 iu30Var, Function0 function0, Function0 function1, qim0 qim0Var, boolean z, boolean z2, b0k b0kVar, int i) {
            Function0 function2;
            qim0 qim0Var2;
            long j2;
            boolean z3;
            int i2;
            tob1 tob1Var;
            drr0 drr0Var;
            float f2;
            int i3;
            boolean z4;
            drr0 drr0Var2;
            drr0 drr0Var3;
            tob1 tob1Var2;
            drr0 drr0Var4;
            boolean z5;
            qim0 qim0VarB;
            Function0 function3;
            drr0 drr0Var5;
            long j3;
            drr0 drr0Var6;
            drr0 drr0Var7;
            boolean z6;
            qim0 qim0VarB2;
            m4c m4cVar;
            boolean z7;
            qim0 qim0Var3;
            Object qj40Var;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(1585575062);
            j06 j06Var = x340Var.a;
            int i4 = i | (x340Var.d(f) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.f(j) ? 256 : 128) | (x340Var.i(iu30Var) ? 2048 : 1024) | (x340Var.i(function0) ? 16384 : 8192) | (x340Var.i(function1) ? 131072 : 65536) | 1572864 | (x340Var.h(z) ? 8388608 : 4194304) | (x340Var.h(z2) ? 67108864 : 33554432);
            if (x340Var.Y(i4 & 1, (38347923 & i4) != 38347922)) {
                if (z2) {
                    x340Var.i0(-975744707);
                    uwr uwrVar = cbx.a;
                    j2 = cbx.a(x340Var).b.b;
                } else {
                    x340Var.i0(-975743454);
                    uwr uwrVar2 = cbx.a;
                    j2 = cbx.a(x340Var).c.c;
                }
                x340Var.r(false);
                long j4 = j2;
                long jA = cbx.a(x340Var).a.b.a();
                Object objT = x340Var.T();
                m4c m4cVar2 = fkj0.X;
                if (objT == m4cVar2) {
                    objT = us71.i(f, x340Var);
                }
                drr0 drr0Var8 = (drr0) objT;
                Object objT2 = x340Var.T();
                if (objT2 == m4cVar2) {
                    objT2 = v8r.q(Boolean.FALSE);
                    x340Var.s0(objT2);
                }
                tob1 tob1Var3 = (ven0) objT2;
                Object objT3 = x340Var.T();
                if (objT3 == m4cVar2) {
                    objT3 = us71.i(0.0f, x340Var);
                }
                drr0 drr0Var9 = (drr0) objT3;
                Object objT4 = x340Var.T();
                if (objT4 == m4cVar2) {
                    objT4 = us71.i(0.0f, x340Var);
                }
                drr0 drr0Var10 = (drr0) objT4;
                Object objT5 = x340Var.T();
                if (objT5 == m4cVar2) {
                    objT5 = us71.i(0.0f, x340Var);
                }
                drr0 drr0Var11 = (drr0) objT5;
                tob1 tob1VarA = z95.a(((Boolean) tob1Var3.getValue()).booleanValue() ? 22.0f : 12.0f, (fe5) null, (String) null, x340Var, 0, 14);
                tob1 tob1VarA2 = z95.a(((Boolean) tob1Var3.getValue()).booleanValue() ? 26.0f : 16.0f, (fe5) null, (String) null, x340Var, 0, 14);
                tob1 tob1VarA3 = z95.a(((Boolean) tob1Var3.getValue()).booleanValue() ? 12.0f : 6.0f, (fe5) null, (String) null, x340Var, 0, 14);
                tob1 tob1VarA4 = z95.a(((Boolean) tob1Var3.getValue()).booleanValue() ? 6.0f : 4.0f, (fe5) null, (String) null, x340Var, 0, 14);
                String strN0 = cwl1.n0(2131951703, new Object[]{str}, x340Var);
                String strN1 = cwl1.n0(2131951702, new Object[]{Integer.valueOf((int) drr0Var8.s())}, x340Var);
                View view = (View) x340Var.k(AndroidCompositionLocals_androidKt.f);
                view.setHapticFeedbackEnabled(true);
                Float fValueOf = Float.valueOf(f);
                boolean z8 = (i4 & 14) == 4;
                Object objT6 = x340Var.T();
                if (z8 || objT6 == m4cVar2) {
                    z3 = false;
                    i2 = 2;
                    objT6 = new kxx(f, tob1Var3, drr0Var8, (lnm) null, (byte) 6);
                    tob1Var = tob1Var3;
                    drr0Var = drr0Var8;
                    x340Var.s0(objT6);
                } else {
                    tob1Var = tob1Var3;
                    drr0Var = drr0Var8;
                    z3 = false;
                    i2 = 2;
                }
                qxd0.t(fValueOf, x340Var, (vu30) objT6);
                if (z) {
                    x340Var.i0(-975703558);
                    cvx cvxVar = cbx.b(x340Var).b;
                    x340Var.r(z3);
                    f2 = 16.0f;
                } else {
                    x340Var.i0(-975701986);
                    cvx cvxVar2 = cbx.b(x340Var).b;
                    x340Var.r(z3);
                    f2 = 4.0f;
                }
                cvx cvxVar3 = cbx.b(x340Var).b;
                qim0 qim0Var4 = nim0.a;
                qim0 qim0VarJ = u291.j(28.0f, 0.0f, i2, u291.f(uyn1.y(qim0Var4, f2, 8.0f), 1.0f));
                float fS = drr0Var.s();
                int i5 = i4 & 7168;
                boolean z9 = i5 == 2048;
                Object objT7 = x340Var.T();
                if (z9 || objT7 == m4cVar2) {
                    objT7 = new ht9(iu30Var, drr0Var);
                    x340Var.s0(objT7);
                }
                qim0 qim0Var5 = qim0Var4;
                drr0 drr0Var12 = drr0Var;
                qim0 qim0VarA = s161.a(s161.b(qim0VarJ, true, eak1.U0), new mtk1(strN0, strN1, fS, z2, (iu30) objT7));
                jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 48);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw 0;
                }
                x340Var.m0();
                boolean z10 = x340Var.S;
                Function0 function4 = hmb0.t1;
                if (z10) {
                    x340Var.l(function4);
                } else {
                    x340Var.v0();
                }
                vu30 vu30Var = y580.O0;
                nko1.H(jw31VarA, x340Var, vu30Var);
                vu30 vu30Var2 = y580.N0;
                nko1.H(xos0VarM, x340Var, vu30Var2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar = y580.R0;
                nko1.H(numValueOf, x340Var, lljVar);
                nko1.F(x340Var);
                vu30 vu30Var3 = y580.Y;
                nko1.H(qim0VarE, x340Var, vu30Var3);
                int i6 = i5;
                isl islVar = isl.a;
                if (z) {
                    x340Var.i0(-1201965040);
                    bux buxVar = bux.c;
                    cvx cvxVar4 = cbx.b(x340Var).b;
                    qim0 qim0VarB3 = uyn1.B(qim0Var5, 0.0f, 0.0f, 16.0f, 0.0f, 11);
                    zov0 zov0Var = cbx.b(x340Var).g;
                    qim0 qim0VarV = u291.v(qim0VarB3, 16.0f);
                    zov0 zov0Var2 = cbx.b(x340Var).g;
                    qim0 qim0VarH = u291.h(qim0VarV, 16.0f);
                    boolean z11 = (458752 & i4) == 131072;
                    Object objT8 = x340Var.T();
                    if (z11 || objT8 == m4cVar2) {
                        objT8 = new tpj1(function1, (byte) 14);
                        x340Var.s0(objT8);
                    }
                    i3 = i4;
                    z4 = true;
                    i6 = i6;
                    w0h1.a(buxVar, islVar, anm1.N("volume-icon-start", bin.x(qim0VarH, false, null, null, null, (Function0) objT8, 15)), j, 0L, false, x340Var, bux.d | 48 | ((i4 << 3) & 7168), 48);
                    x340Var = x340Var;
                    x340Var.r(false);
                } else {
                    i3 = i4;
                    z4 = true;
                    x340Var.i0(-1201503760);
                    x340Var.r(false);
                }
                wnb0 wnb0Var = new wnb0(1.0f, z4);
                Object objT9 = x340Var.T();
                if (objT9 == m4cVar2) {
                    drr0Var2 = drr0Var9;
                    objT9 = new qg6(drr0Var2, (byte) 27);
                    x340Var.s0(objT9);
                } else {
                    drr0Var2 = drr0Var9;
                }
                qim0 qim0VarU = lrn1.u(wnb0Var, (iu30) objT9);
                if (z2) {
                    vu30Var3 = vu30Var3;
                    lljVar = lljVar;
                    m4cVar2 = m4cVar2;
                    drr0Var3 = drr0Var2;
                    tob1Var2 = tob1Var;
                    drr0Var4 = drr0Var12;
                    vu30Var2 = vu30Var2;
                    tob1VarA4 = tob1VarA4;
                    z5 = false;
                    vu30Var = vu30Var;
                    x340Var.i0(-1200681206);
                    x340Var.r(false);
                    qim0VarB = qim0Var5;
                } else {
                    x340Var.i0(-1201318752);
                    boolean zI = (i6 == 2048 ? z4 : false) | x340Var.i(view);
                    Object objT10 = x340Var.T();
                    if (zI || objT10 == m4cVar2) {
                        drr0Var3 = drr0Var2;
                        tob1Var2 = tob1Var;
                        qj40Var = new qj40(tob1Var2, view, iu30Var, drr0Var3, drr0Var12, (byte) 1);
                        drr0Var4 = drr0Var12;
                        x340Var.s0(qj40Var);
                    } else {
                        qj40Var = objT10;
                        drr0Var3 = drr0Var2;
                        tob1Var2 = tob1Var;
                        drr0Var4 = drr0Var12;
                    }
                    qim0VarB = f8d1.b(qim0Var5, rih1.a, (PointerInputEventHandler) qj40Var);
                    z5 = false;
                    x340Var.r(false);
                }
                qim0 qim0VarThen = qim0VarU.then(qim0VarB);
                Object objT11 = x340Var.T();
                if (objT11 == m4cVar2) {
                    objT11 = eak1.T0;
                    x340Var.s0(objT11);
                }
                qim0 qim0VarN = anm1.N("volume-slider-container", s161.b(qim0VarThen, z5, (iu30) objT11));
                gra graVar = een.g;
                gfh0 gfh0VarC = t1c.c(graVar, z5);
                tob1 tob1Var4 = tob1Var2;
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarN);
                x340Var.m0();
                if (x340Var.S) {
                    function3 = function4;
                    x340Var.l(function3);
                } else {
                    function3 = function4;
                    x340Var.v0();
                }
                nko1.H(gfh0VarC, x340Var, vu30Var);
                nko1.H(xos0VarM2, x340Var, vu30Var2);
                x0d.q(iHashCode2, x340Var, lljVar, x340Var);
                nko1.H(qim0VarE2, x340Var, vu30Var3);
                qim0 qim0VarH2 = u291.h(qim0Var5, ((p3v) tob1VarA.getValue()).a);
                h2c h2cVar = h2c.a;
                qim0 qim0VarA2 = h2cVar.a(qim0VarH2, graVar);
                gra graVar2 = een.d;
                drr0 drr0Var13 = drr0Var4;
                gfh0 gfh0VarC2 = t1c.c(graVar2, false);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, qim0VarA2);
                x340Var.m0();
                drr0 drr0Var14 = drr0Var3;
                if (x340Var.S) {
                    x340Var.l(function3);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC2, x340Var, vu30Var);
                nko1.H(xos0VarM3, x340Var, vu30Var2);
                x0d.q(iHashCode3, x340Var, lljVar, x340Var);
                nko1.H(qim0VarE3, x340Var, vu30Var3);
                qim0 qim0VarD = u291.d(qim0Var5, 1.0f);
                boolean zG = x340Var.g(tob1VarA3) | x340Var.f(jA) | x340Var.g(tob1VarA4) | x340Var.f(j4);
                Object objT12 = x340Var.T();
                if (zG || objT12 == m4cVar2) {
                    objT12 = new jtk1(jA, j4, tob1VarA3, tob1VarA4, drr0Var13);
                    drr0Var5 = drr0Var13;
                    x340Var.s0(objT12);
                } else {
                    drr0Var5 = drr0Var13;
                }
                j0o1.b(6, x340Var, (iu30) objT12, qim0VarD);
                x340Var.r(true);
                float fS2 = drr0Var5.s() / 100.0f;
                float fS3 = (drr0Var14.s() * fS2) - (drr0Var10.s() / 2.0f);
                if (fS2 > 0.85f) {
                    x340Var.i0(1783407057);
                    x340Var.r(false);
                    j3 = u7h.f;
                } else {
                    x340Var.i0(1783408088);
                    j3 = cbx.a(x340Var).b.c;
                    x340Var.r(false);
                }
                if (fS2 > 0.85f) {
                    x340Var.i0(1783412917);
                    cvx cvxVar5 = cbx.b(x340Var).b;
                    qim0 qim0VarB4 = uyn1.B(qim0Var5, 0.0f, 0.0f, 4.0f, 0.0f, 11);
                    Object objT13 = x340Var.T();
                    if (objT13 == m4cVar2) {
                        drr0Var6 = drr0Var11;
                        drr0Var7 = drr0Var10;
                        objT13 = new crf(drr0Var7, drr0Var6, (byte) 4);
                        x340Var.s0(objT13);
                    } else {
                        drr0Var6 = drr0Var11;
                        drr0Var7 = drr0Var10;
                    }
                    qim0VarB2 = eqr0.B(qim0VarB4, (iu30) objT13);
                    x340Var.r(false);
                    drr0Var5 = drr0Var5;
                    qim0Var5 = qim0Var5;
                } else {
                    j3 = j3;
                    drr0Var6 = drr0Var11;
                    drr0Var7 = drr0Var10;
                    x340Var.i0(1783418996);
                    cvx cvxVar6 = cbx.b(x340Var).b;
                    qim0 qim0VarB5 = uyn1.B(qim0Var5, 4.0f, 0.0f, 0.0f, 0.0f, 14);
                    Object objT14 = x340Var.T();
                    if (objT14 == m4cVar2) {
                        z6 = false;
                        objT14 = new ktk1(drr0Var7, (byte) 0);
                        x340Var.s0(objT14);
                    } else {
                        z6 = false;
                    }
                    qim0VarB2 = eqr0.B(qim0VarB5, (iu30) objT14);
                    x340Var.r(z6);
                }
                if (z2) {
                    m4cVar = m4cVar2;
                    z7 = true;
                    x340Var.i0(-547568426);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-548464078);
                    boolean zD = x340Var.d(fS3);
                    Object objT15 = x340Var.T();
                    if (zD || objT15 == m4cVar2) {
                        objT15 = new waf1((byte) 10, fS3);
                        x340Var.s0(objT15);
                    }
                    qim0 qim0VarA3 = h2cVar.a(eqr0.B(qim0Var5, (iu30) objT15), graVar);
                    gfh0 gfh0VarC3 = t1c.c(graVar2, false);
                    drr0 drr0Var15 = drr0Var6;
                    qim0 qim0Var6 = qim0VarB2;
                    int iHashCode4 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM4 = x340Var.m();
                    qim0 qim0VarE4 = zr7.E(x340Var, qim0VarA3);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(function3);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC3, x340Var, vu30Var);
                    nko1.H(xos0VarM4, x340Var, vu30Var2);
                    x0d.q(iHashCode4, x340Var, lljVar, x340Var);
                    nko1.H(qim0VarE4, x340Var, vu30Var3);
                    Object objT16 = x340Var.T();
                    if (objT16 == m4cVar2) {
                        objT16 = new qg6(drr0Var7, (byte) 28);
                        x340Var.s0(objT16);
                    }
                    t1c.a(h2cVar.a(dug.f(u291.h(u291.v(lrn1.u(qim0Var5, (iu30) objT16), 4.0f), ((p3v) tob1VarA2.getValue()).a), u7h.f, er31.b(2.0f)), graVar), x340Var, 0);
                    String strValueOf = String.valueOf((int) drr0Var5.s());
                    Object objT17 = x340Var.T();
                    if (objT17 == m4cVar2) {
                        objT17 = new qg6(drr0Var15, (byte) 29);
                        x340Var.s0(objT17);
                    }
                    qim0 qim0VarA4 = h2cVar.a(lrn1.u(qim0Var6, (iu30) objT17), graVar);
                    x340 x340Var2 = x340Var;
                    m4cVar = m4cVar2;
                    uwo1.e(strValueOf, anm1.N("volume-percentage", d9y0.k(qim0VarA4, ((Boolean) tob1Var4.getValue()).booleanValue() ? 1.0f : 0.0f)), cbx.d(x340Var).k, j3, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2032);
                    x340Var = x340Var2;
                    z7 = true;
                    x340Var.r(true);
                    x340Var.r(false);
                }
                x340Var.r(z7);
                if (z) {
                    x340Var.i0(-1197604487);
                    ztx ztxVar = ztx.c;
                    cvx cvxVar7 = cbx.b(x340Var).b;
                    qim0Var3 = qim0Var5;
                    qim0 qim0VarB6 = uyn1.B(qim0Var3, 16.0f, 0.0f, 0.0f, 0.0f, 14);
                    zov0 zov0Var3 = cbx.b(x340Var).g;
                    qim0 qim0VarV2 = u291.v(qim0VarB6, 16.0f);
                    zov0 zov0Var4 = cbx.b(x340Var).g;
                    qim0 qim0VarH3 = u291.h(qim0VarV2, 16.0f);
                    boolean z12 = (i3 & 57344) == 16384;
                    Object objT18 = x340Var.T();
                    if (z12 || objT18 == m4cVar) {
                        function2 = function0;
                        objT18 = new tpj1(function2, (byte) 15);
                        x340Var.s0(objT18);
                    } else {
                        function2 = function0;
                    }
                    x340 x340Var3 = x340Var;
                    w0h1.a(ztxVar, islVar, anm1.N("volume-icon-end", bin.x(qim0VarH3, false, null, null, null, (Function0) objT18, 15)), j, 0L, false, x340Var3, ztx.d | 48 | ((i3 << 3) & 7168), 48);
                    x340Var = x340Var3;
                    x340Var.r(false);
                } else {
                    function2 = function0;
                    qim0Var3 = qim0Var5;
                    x340Var.i0(-1197151856);
                    x340Var.r(false);
                }
                x340Var.r(true);
                qim0Var2 = qim0Var3;
            } else {
                function2 = function0;
                x340Var.b0();
                qim0Var2 = qim0Var;
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ltk1(f, str, j, iu30Var, function2, function1, qim0Var2, z, z2, i);
            }
        }

        public static final float p(float f, long j) {
            return 100.0f * (f > 0.0f ? Math.max(0.0f, Math.min(f, Float.intBitsToFloat((int) (j >> 32)))) / f : 0.0f);
        }

        public static final any q(jks jksVar, mr20 mr20Var) {
            return new any(new x010(new huz(new pya(new evz(jksVar.f, rc11.a.b(syc.class), (byte) 12), (byte) 4), (byte) 2), mr20Var, new mnl(3, (lnm) null, (byte) 22), (byte) 1), (byte) 18);
        }

        public static final Set r(Set set) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : set) {
                if (x((ee9) obj)) {
                    arrayList.add(obj);
                }
            }
            return o7h.p1(arrayList);
        }

        public static fen s() {
            List listD1;
            try {
                String strH = y520.H((File) fen.d.getValue());
                int length = strH.length() - 1;
                int i = 0;
                boolean z = false;
                while (i <= length) {
                    boolean z2 = u890.q(strH.charAt(!z ? i : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        }
                        length--;
                    } else if (z2) {
                        i++;
                    } else {
                        z = true;
                    }
                }
                List listH = fen.c.h(strH.subSequence(i, length + 1).toString());
                if (listH.isEmpty()) {
                    listD1 = z6x.a;
                } else {
                    ListIterator listIterator = listH.listIterator(listH.size());
                    while (listIterator.hasPrevious()) {
                        if (((String) listIterator.previous()).length() != 0) {
                            listD1 = o7h.d1(listH, listIterator.nextIndex() + 1);
                        }
                    }
                    listD1 = z6x.a;
                }
                String[] strArr = (String[]) listD1.toArray(new String[0]);
                long j = Long.parseLong(strArr[13]);
                long j2 = Long.parseLong(strArr[14]);
                long j3 = Long.parseLong(strArr[15]);
                long j4 = Long.parseLong(strArr[16]);
                long j5 = Long.parseLong(strArr[21]);
                double dElapsedRealtime = SystemClock.elapsedRealtime() / 1000.0d;
                idd1 idd1Var = fen.e;
                return new fen((((j + j2) + j3) + j4) / ((Number) idd1Var.getValue()).doubleValue(), dElapsedRealtime - (j5 / ((Number) idd1Var.getValue()).doubleValue()));
            } catch (IOException | NumberFormatException unused) {
                return null;
            }
        }

        public static int t(Context context, int i) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
            int color = typedArrayObtainStyledAttributes.getColor(0, 0);
            typedArrayObtainStyledAttributes.recycle();
            return color;
        }

        public static ColorStateList u(Context context, int i) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
            ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
            typedArrayObtainStyledAttributes.recycle();
            return colorStateList;
        }

        public static final void v(qtr qtrVar, lo60 lo60Var, vgm vgmVar, dnc dncVar) {
            qtrVar.b(new jai0(lo60Var, vgmVar, dncVar, (lnm) null));
        }

        public static final boolean w(ee9 ee9Var) {
            return ee9Var.equals(r2a0.c.a);
        }

        public static final boolean x(ee9 ee9Var) {
            r2a0[] r2a0VarArrValues = r2a0.values();
            ArrayList arrayList = new ArrayList(r2a0VarArrValues.length);
            for (r2a0 r2a0Var : r2a0VarArrValues) {
                arrayList.add(r2a0Var.a);
            }
            return arrayList.contains(ee9Var);
        }

        public static final boolean y(be9 be9Var) {
            return be9Var.equals(r2a0.d.a);
        }

        public static final boolean z(ee9 ee9Var) {
            return ee9Var.equals(r2a0.b.a);
        }
    }
