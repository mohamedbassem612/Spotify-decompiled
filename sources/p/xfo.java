package p;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xfo implements acr0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public xfo(wpv0 wpv0Var) {
        this.a = (byte) 1;
        this.b = sqg0.J(new mmr0[]{new mmr0(blc0.Hd, new nda1(0, wpv0Var, wpv0.class, "isMultiSubsEnabled", "isMultiSubsEnabled()Z", 0, (byte) 15)), new mmr0(blc0.Sd, new nda1(0, wpv0Var, wpv0.class, "isMultiSubsEnabled", "isMultiSubsEnabled()Z", 0, (byte) 16)), new mmr0(blc0.Td, new nda1(0, wpv0Var, wpv0.class, "isMultiSubsEnabled", "isMultiSubsEnabled()Z", 0, (byte) 17)), new mmr0(blc0.Bd, new nda1(0, wpv0Var, wpv0.class, "isAvailablePlansSvsEnabled", "isAvailablePlansSvsEnabled()Z", 0, (byte) 18))});
    }

    public static Object f(lik1 lik1Var, String str, String str2, p6r0 p6r0Var, boolean z, Map map) {
        try {
            if (u890.j(lik1Var.a, str)) {
                return new woc1(lik1Var, str2, p6r0Var, z, map);
            }
            throw new IllegalArgumentException("Failed requirement.");
        } catch (Throwable th) {
            return new m231(th);
        }
    }

    public final Set a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (Set) obj;
            default:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    if (((Boolean) ((Function0) entry.getValue()).invoke()).booleanValue()) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                return linkedHashMap.keySet();
        }
    }

    public final Class b() {
        switch (this.a) {
            case 0:
                return ufo.class;
            default:
                return toc1.class;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v15 java.lang.Object, still in use, count: 2, list:
          (r1v15 java.lang.Object) from 0x00b7: PHI (r1 I:??) = (r1v11 java.lang.Object), (r1v15 java.lang.Object) binds: [B:26:0x00b6, B:73:0x00b7] A[DONT_GENERATE, DONT_INLINE]
          (r1v15 java.lang.Object) from 0x00ad: CHECK_CAST (p.e331) (r1v15 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public final android.os.Parcelable c(android.content.Intent r17, p.s4b1 r18, p.th61 r19) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.xfo.c(android.content.Intent, p.s4b1, p.th61):android.os.Parcelable");
    }

    public final String getDescription() {
        switch (this.a) {
            case 0:
                return "Page that displays cultural moments";
            default:
                return "SubscriptionView Page";
        }
    }

    public final boolean isEnabled() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return !a().isEmpty();
        }
    }

    public xfo() {
        this.a = (byte) 0;
        this.b = Collections.singleton(blc0.U5);
    }
}
