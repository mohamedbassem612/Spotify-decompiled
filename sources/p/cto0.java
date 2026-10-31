package p;

import android.view.ViewGroup;
import com.spotify.playback_esperanto.proto.PlaybackEsperanto;
import io.reactivex.rxjava3.core.Flowable;
import java.util.List;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cto0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cto0(boolean z, n811 n811Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 10;
        this.b = z;
        this.d = n811Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                return new cto0((dto0) this.c, (iu30) obj2, lnmVar, (byte) 0);
            case 1:
                return new cto0((ViewGroup) this.c, (m1p0) obj2, lnmVar, (byte) 1);
            case 2:
                return new cto0((o0p0) this.c, (dg30) obj2, lnmVar, (byte) 2);
            case 3:
                return new cto0((swm0) this.c, (iu30) obj2, lnmVar, (byte) 3);
            case 4:
                return new cto0((Flowable) this.c, (bpb1) obj2, lnmVar, (byte) 4);
            case 5:
                return new cto0((kev) this.c, (PlaybackEsperanto.DuckRequest) obj2, lnmVar, (byte) 5);
            case 6:
                cto0 cto0Var = new cto0(obj2, lnmVar, (byte) 6);
                cto0Var.c = obj;
                return cto0Var;
            case 7:
                return new cto0((sip0) this.c, (vzg0) obj2, lnmVar, (byte) 7);
            case 8:
                return new cto0((bfd) this.c, (a9w) obj2, lnmVar, (byte) 8);
            case 9:
                cto0 cto0Var2 = new cto0(obj2, lnmVar, (byte) 9);
                cto0Var2.c = obj;
                return cto0Var2;
            case 10:
                cto0 cto0Var3 = new cto0(this.b, (n811) obj2, lnmVar);
                cto0Var3.c = obj;
                return cto0Var3;
            case 11:
                return new cto0((ai8) this.c, (kly0) obj2, lnmVar, (byte) 11);
            case 12:
                return new cto0((g3q0) this.c, (String) obj2, lnmVar, (byte) 12);
            case 13:
                return new cto0((mbq0) this.c, (YourLibraryDecoratedEntityOuterClass.YourLibraryDecoratedEntity) obj2, lnmVar, (byte) 13);
            case 14:
                cto0 cto0Var4 = new cto0(obj2, lnmVar, (byte) 14);
                cto0Var4.c = obj;
                return cto0Var4;
            case 15:
                return new cto0((dxy) this.c, (c560) obj2, lnmVar, (byte) 15);
            case 16:
                return new cto0((bbr0) this.c, (ven0) obj2, lnmVar, (byte) 16);
            case 17:
                return new cto0((ytp0) this.c, (abu) obj2, lnmVar, (byte) 17);
            case 18:
                return new cto0((mr20) this.c, (tar0) obj2, lnmVar, (byte) 18);
            case 19:
                return new cto0((ven0) this.c, (vu30) obj2, lnmVar, (byte) 19);
            case 20:
                return new cto0((rgb) this.c, (bbc) obj2, lnmVar, (byte) 20);
            case 21:
                return new cto0((bbr0) this.c, (djr0) obj2, lnmVar, (byte) 21);
            case 22:
                return new cto0((jkr0) this.c, (drr0) obj2, lnmVar, (byte) 22);
            case 23:
                return new cto0((b3s0) this.c, (iu30) obj2, lnmVar, (byte) 23);
            case 24:
                return new cto0((vu30) this.c, (i5s0) obj2, lnmVar, (byte) 24);
            case 25:
                return new cto0((g9r) this.c, (Flowable) obj2, lnmVar, (byte) 25);
            case 26:
                return new cto0((qbs0) this.c, (whw) obj2, lnmVar, (byte) 26);
            case 27:
                return new cto0((mr20) this.c, (ven0) obj2, lnmVar, (byte) 27);
            case 28:
                cto0 cto0Var5 = new cto0(obj2, lnmVar, (byte) 28);
                cto0Var5.c = obj;
                return cto0Var5;
            default:
                cto0 cto0Var6 = new cto0(obj2, lnmVar, (byte) 29);
                cto0Var6.c = obj;
                return cto0Var6;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((List) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((jt61) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 17:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 18:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 19:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 20:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 24:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:237:0x0472  */
    /* JADX WARN: Code duplicated, block: B:256:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:257:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:259:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:261:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:443:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:444:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:292:0x0570 -> B:294:0x0574). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v33 java.lang.Object, still in use, count: 2, list:
          (r0v33 java.lang.Object) from 0x04af: PHI (r0 I:??) = (r0v28 java.lang.Object), (r0v33 java.lang.Object) binds: [B:253:0x04ae, B:379:0x04af] A[DONT_GENERATE, DONT_INLINE]
          (r0v33 java.lang.Object) from 0x04a7: CHECK_CAST (p.l820) (r0v33 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 1874
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.cto0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cto0(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cto0(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
    }
}
