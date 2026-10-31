package p;

import app.p000rive.Alignment;
import app.p000rive.Artboard;
import app.p000rive.ArtboardKt;
import app.p000rive.Fit;
import app.p000rive.RiveFile;
import app.p000rive.RiveFrameRate;
import app.p000rive.StateMachine;
import app.p000rive.StateMachineKt;
import app.p000rive.ViewModelInstance;
import app.p000rive.ViewModelInstanceKt;
import app.p000rive.ViewModelInstanceSource;
import app.p000rive.ViewModelSource;
import app.p000rive.core.CommandQueue;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yj31 {
    public final /* synthetic */ jj31 a;
    public final /* synthetic */ zj31 b;
    public final /* synthetic */ CommandQueue c;
    public final /* synthetic */ jj31 d;

    public yj31(jj31 jj31Var, zj31 zj31Var, CommandQueue commandQueue, jj31 jj31Var2) {
        this.a = jj31Var;
        this.b = zj31Var;
        this.c = commandQueue;
        this.d = jj31Var2;
    }

    public final void a(mmr0 mmr0Var, b0k b0kVar, int i) {
        int i2;
        zj31 zj31Var;
        Artboard artboard;
        Object xj31Var;
        Alignment alignment;
        boolean z;
        Fit cover;
        RiveFrameRate capped;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1018797734);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(mmr0Var) : x340Var.i(mmr0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(this) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            RiveFile riveFile = (RiveFile) mmr0Var.a;
            Map map = (Map) mmr0Var.b;
            jj31 jj31Var = this.a;
            x340Var.f0(187927719, Integer.valueOf(jj31Var.b));
            Artboard artboardRememberArtboard = ArtboardKt.rememberArtboard(riveFile, "ArtboardMain", x340Var, 48, 0);
            int i3 = Artboard.$stable;
            StateMachine stateMachineRememberStateMachine = StateMachineKt.rememberStateMachine(artboardRememberArtboard, null, x340Var, i3, 2);
            ViewModelInstance viewModelInstanceRememberViewModelInstance = ViewModelInstanceKt.rememberViewModelInstance(riveFile, ViewModelInstanceSource.Default.m151boximpl(ViewModelInstanceSource.Default.m152constructorimpl(ViewModelSource.Named.m169boximpl(ViewModelSource.Named.m170constructorimpl("ViewModelMain")))), x340Var, 0, 0);
            boolean z2 = jj31Var.j;
            zj31 zj31Var2 = this.b;
            boolean z3 = z2 || !(jj31Var.i || zj31Var2.a);
            viewModelInstanceRememberViewModelInstance.setBoolean("isLowEndDevice", zj31Var2.b);
            viewModelInstanceRememberViewModelInstance.setBoolean("isReducedMotion", z3);
            viewModelInstanceRememberViewModelInstance.setBoolean("isRightToLeft", x340Var.k(t4k.n) == flb0.b);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = new LinkedHashMap();
                x340Var.s0(objT);
            }
            Map map2 = (Map) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = new csb(map2, (byte) 7);
                x340Var.s0(objT2);
            }
            rih1 rih1Var = rih1.a;
            qxd0.i(rih1Var, (iu30) objT2, x340Var);
            jfe jfeVar = jj31Var.e;
            boolean zI = x340Var.i(zj31Var2) | x340Var.i(viewModelInstanceRememberViewModelInstance) | x340Var.i(map) | x340Var.i(jj31Var);
            CommandQueue commandQueue = this.c;
            boolean zI2 = zI | x340Var.i(commandQueue);
            jj31 jj31Var2 = this.d;
            boolean zI3 = zI2 | x340Var.i(jj31Var2);
            Object objT3 = x340Var.T();
            if (zI3 || objT3 == m4cVar) {
                objT3 = new lxu(zj31Var2, viewModelInstanceRememberViewModelInstance, map, jj31Var, jj31Var2, commandQueue, map2, (lnm) null);
                zj31Var = zj31Var2;
                x340Var.s0(objT3);
            } else {
                zj31Var = zj31Var2;
            }
            qxd0.t(jfeVar, x340Var, (vu30) objT3);
            vj31 vj31Var = jj31Var.g;
            if (vj31Var.a.isEmpty() && vj31Var.b.isEmpty() && vj31Var.c.isEmpty() && vj31Var.d.isEmpty() && vj31Var.e.isEmpty()) {
                x340Var.i0(1534400488);
                x340Var.r(false);
                artboard = artboardRememberArtboard;
                m4cVar = m4cVar;
                alignment = null;
            } else {
                x340Var.i0(1534124681);
                boolean zI4 = x340Var.i(zj31Var) | x340Var.i(viewModelInstanceRememberViewModelInstance) | x340Var.i(jj31Var);
                Object objT4 = x340Var.T();
                if (zI4 || objT4 == m4cVar) {
                    artboard = artboardRememberArtboard;
                    alignment = null;
                    xj31Var = new xj31(zj31Var, viewModelInstanceRememberViewModelInstance, jj31Var, alignment, (byte) 0);
                    x340Var.s0(xj31Var);
                } else {
                    xj31Var = objT4;
                    artboard = artboardRememberArtboard;
                    alignment = null;
                }
                qxd0.t(rih1Var, x340Var, (vu30) xj31Var);
                x340Var.r(false);
            }
            if (jj31Var.h.isEmpty()) {
                z = false;
                x340Var.i0(1534811176);
                x340Var.r(false);
            } else {
                x340Var.i0(1534543057);
                boolean zI5 = x340Var.i(zj31Var) | x340Var.i(viewModelInstanceRememberViewModelInstance) | x340Var.i(jj31Var);
                Object objT5 = x340Var.T();
                if (zI5 || objT5 == m4cVar) {
                    objT5 = new xj31(zj31Var, viewModelInstanceRememberViewModelInstance, jj31Var, alignment, (byte) 1);
                    x340Var.s0(objT5);
                }
                qxd0.t(rih1Var, x340Var, (vu30) objT5);
                z = false;
                x340Var.r(false);
            }
            mj31 lj31Var = zj31Var.c;
            mj31 mj31VarB = g961.b(x340Var);
            boolean z4 = lj31Var instanceof lj31;
            if (z4 && (mj31VarB instanceof lj31)) {
                lj31Var = new lj31(Math.min(((lj31) lj31Var).a, ((lj31) mj31VarB).a));
            } else if (!z4) {
                lj31Var = mj31VarB;
            }
            qim0 qim0Var = 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0219: IGET (r8v6 'qim0Var' p.qim0) = (r21v0 ?? I:??[OBJECT, ARRAY]) A[DECLARE_VAR] (LINE:538) p.jj31.c p.qim0 in method: p.yj31.a(p.mmr0, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes3.dex
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r21v0 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 693
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.yj31.a(p.mmr0, p.b0k, int):void");
        }
    }
