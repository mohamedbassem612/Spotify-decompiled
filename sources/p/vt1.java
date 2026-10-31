package p;

import android.view.View;
import com.spotify.accessory.categorizer.BluetoothCategorizer;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vt1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vt1(dke dkeVar, ven0 ven0Var, ss50 ss50Var, xtb0 xtb0Var, ven0 ven0Var2) {
        super(0);
        this.a = (byte) 15;
        this.d = dkeVar;
        this.b = ven0Var;
        this.e = ss50Var;
        this.f = xtb0Var;
        this.c = ven0Var2;
    }

    private final Object a() {
        return new ofb((BluetoothCategorizer) ((tap0) this.b).invoke(), (t141) ((tap0) this.c).invoke(), (Scheduler) ((tap0) this.d).invoke(), (i210) ((tap0) this.e).invoke(), (Observable) ((tap0) this.f).invoke());
    }

    /* JADX WARN: Code duplicated, block: B:198:0x095e  */
    /* JADX WARN: Code duplicated, block: B:265:0x0961 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:? A[LOOP:1: B:184:0x0921->B:269:?, LOOP_END, SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v16 java.lang.Object, still in use, count: 2, list:
          (r5v16 java.lang.Object) from 0x0948: PHI (r5 I:??) = (r5v12 java.lang.Object), (r5v16 java.lang.Object) binds: [B:192:0x0947, B:271:0x0948] A[DONT_GENERATE, DONT_INLINE]
          (r5v16 java.lang.Object) from 0x0940: CHECK_CAST (p.qxm0) (r5v16 java.lang.Object)
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
    public final java.lang.Object invoke() {
        /*
            Method dump skipped, instruction units count: 3080
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.vt1.invoke():java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vt1(Object obj, Object obj2, Object obj3, ven0 ven0Var, ven0 ven0Var2, byte b) {
        super(0);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.b = ven0Var;
        this.c = ven0Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vt1(fyc fycVar, o0i o0iVar, khe kheVar, scx scxVar, ven0 ven0Var) {
        super(0);
        this.a = (byte) 4;
        this.c = fycVar;
        this.d = o0iVar;
        this.e = kheVar;
        this.f = scxVar;
        this.b = ven0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vt1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vt1(ewe eweVar, c9n c9nVar, ven0 ven0Var, ven0 ven0Var2, tbr0 tbr0Var) {
        super(0);
        this.a = (byte) 5;
        this.d = eweVar;
        this.f = c9nVar;
        this.b = ven0Var;
        this.c = ven0Var2;
        this.e = tbr0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vt1(mhh mhhVar, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, ven0 ven0Var4) {
        super(0);
        this.a = (byte) 6;
        this.d = mhhVar;
        this.b = ven0Var;
        this.c = ven0Var2;
        this.e = ven0Var3;
        this.f = ven0Var4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vt1(mtm mtmVar, k3l0 k3l0Var, c9n c9nVar, y7e1 y7e1Var, wm00 wm00Var) {
        super(0);
        this.a = (byte) 9;
        this.b = mtmVar;
        this.c = k3l0Var;
        this.f = c9nVar;
        this.d = y7e1Var;
        this.e = wm00Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vt1(oan oanVar, String str, String str2, ven0 ven0Var, View view) {
        super(0);
        this.a = (byte) 25;
        this.c = oanVar;
        this.d = str;
        this.e = str2;
        this.b = ven0Var;
        this.f = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vt1(b0a0 b0a0Var, kly0 kly0Var, equ equVar, kly0 kly0Var2, kly0 kly0Var3, kly0 kly0Var4) {
        super(0);
        this.a = (byte) 18;
        this.b = b0a0Var;
        this.c = kly0Var;
        this.d = kly0Var2;
        this.e = kly0Var3;
        this.f = kly0Var4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vt1(gfk0 gfk0Var, iu30 iu30Var, c9n c9nVar, ven0 ven0Var, pfk0 pfk0Var) {
        super(0);
        this.a = (byte) 24;
        this.c = gfk0Var;
        this.d = iu30Var;
        this.f = c9nVar;
        this.b = ven0Var;
        this.e = pfk0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vt1(ven0 ven0Var, upo upoVar, Function0 function0, c9n c9nVar, ven0 ven0Var2) {
        super(0);
        this.a = (byte) 0;
        this.b = ven0Var;
        this.d = upoVar;
        this.e = function0;
        this.f = c9nVar;
        this.c = ven0Var2;
    }
}
