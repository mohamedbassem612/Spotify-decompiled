package p;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class jtv {
    public final s061 a;
    public final yzu b;

    public jtv(s061 s061Var, yzu yzuVar) {
        this.a = s061Var;
        this.b = yzuVar;
    }

    /* JADX WARN: Code duplicated, block: B:136:0x0235  */
    /* JADX WARN: Code duplicated, block: B:137:0x0237  */
    /* JADX WARN: Code duplicated, block: B:158:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:21:0x006a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x006c  */
    /* JADX WARN: Code duplicated, block: B:23:0x007b  */
    /* JADX WARN: Code duplicated, block: B:25:0x007f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0088  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00da  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:64:0x0117 A[LOOP:1: B:62:0x0111->B:64:0x0117, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x0127  */
    /* JADX WARN: Code duplicated, block: B:69:0x012c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:70:0x012e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0136  */
    /* JADX WARN: Code duplicated, block: B:75:0x013d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0145  */
    /* JADX WARN: Code duplicated, block: B:81:0x0162 A[LOOP:2: B:79:0x015c->B:81:0x0162, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x016e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0172  */
    /* JADX WARN: Code duplicated, block: B:85:0x017f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0187  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a2 A[LOOP:3: B:90:0x019c->B:92:0x01a2, LOOP_END] */
    public final htv a(htv htvVar, f8e0 f8e0Var) {
        boolean z;
        String str;
        String str2;
        blc0 blc0Var;
        blc0 blc0Var2;
        blc0 blc0Var3;
        ktl ktlVar;
        String str3;
        blc0 blc0Var4;
        z6x z6xVarN;
        jo70 jo70VarA;
        String str4;
        io70 io70Var;
        jo70 jo70VarA2;
        List list;
        z6x arrayList;
        Iterator it;
        Iterator it2;
        boolean z2;
        att0 att0VarA;
        hll hllVarA;
        List list2;
        mtl mtlVarA;
        ktl ktlVar2;
        jo70 jo70VarA3;
        List list3;
        Iterator it3;
        mtl mtlVarA2;
        ktl ktlVar3;
        jo70 jo70VarA4;
        io70 io70Var2;
        xkk1 xkk1VarA;
        String str5;
        mq70 mq70Var;
        up70 up70VarA;
        wsc0 wsc0Var = f8e0Var.a;
        List list4 = wsc0Var.e;
        List list5 = wsc0Var.e;
        kby kbyVar = wsc0Var.f;
        List list6 = list4;
        ArrayList arrayList2 = new ArrayList(q7h.U(list6, 10));
        Iterator it4 = list6.iterator();
        while (it4.hasNext()) {
            zuc0 zuc0Var = (zuc0) it4.next();
            String str6 = zuc0Var.a;
            tu00 tu00Var = zuc0Var.q;
            fjf1 fjf1Var = zuc0Var.p;
            String str7 = zuc0Var.c;
            Set set = s4b1.f;
            blc0 blc0Var5 = uic.x(str7).c;
            blc0 blc0Var6 = blc0.ti;
            String strA = "";
            if (blc0Var5 == blc0Var6 || blc0Var5 == blc0.Pg) {
                str = zuc0Var.i;
            } else {
                jo70 jo70VarA5 = tu00Var.a(jo70.class);
                str = jo70VarA5 != null ? jo70VarA5.a : null;
                if (str == null) {
                    str2 = "";
                }
                int i = zuc0Var.b;
                blc0Var = uic.x(str7).c;
                if (!zuc0Var.m) {
                    if (blc0Var == blc0Var6) {
                        strA = fjf1Var.a.a().a(1);
                    } else if (blc0Var == blc0.Pg) {
                        strA = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0083: INVOKE (r16v4 'strA' java.lang.String) = (r13v0 p.k1z), (1 int) VIRTUAL call: p.k1z.a(int):java.lang.String (LINE:132) in method: p.jtv.a(p.htv, p.f8e0):p.htv, file: /workspace/spotify-analysis/dex-input/classes10.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:226)
                            	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r13v0 p.k1z
                            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                            */
                        /*
                            Method dump skipped, instruction units count: 785
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: p.jtv.a(p.htv, p.f8e0):p.htv");
                    }

                    public final htv b(f8e0 f8e0Var, Bundle bundle, g3d0 g3d0Var, lbr lbrVar) {
                        g3d0 g3d0Var2 = g3d0Var == null ? u2d0.a : g3d0Var;
                        htv htvVarA = a(new htv(bundle != null ? jbr.a : lbrVar, false, false, false, false, g3d0Var2, new x7i1(false, (exc0) null, (rc50) null, false, false, false, false, false, 8191), new gtv(false, false, false, null, 0, 1023), b7x.a, new etv(7, null), z6x.a, fg91.b), f8e0Var);
                        itv itvVar = bundle != null ? (itv) jhc1.t(bundle, "edit_playlist_items_model_state", itv.class) : null;
                        if (itvVar == null) {
                            return htvVarA;
                        }
                        htv htvVarM = oqn1.m(htvVarA, etv.a(htvVarA.j, itvVar.a, itvVar.c, null, 4));
                        Set set = itvVar.b;
                        bpb1 bpb1Var = this.a.a;
                        bpb1Var.getClass();
                        bpb1Var.m((Object) null, set);
                        return htvVarM;
                    }
                }
