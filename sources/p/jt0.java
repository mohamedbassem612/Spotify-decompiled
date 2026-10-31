package p;

import androidx.compose.ui.geometry.Offset;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jt0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public long c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jt0(long j, Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = j;
        this.d = obj;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new jt0((nt0) obj2, lnmVar, (byte) 0);
            case 1:
                return new jt0(this.c, (wo70) obj2, lnmVar, (byte) 1);
            case 2:
                return new jt0(this.c, (i8d1) obj2, lnmVar, (byte) 2);
            default:
                jt0 jt0Var = new jt0((x6e1) obj2, lnmVar, (byte) 3);
                jt0Var.c = ((Offset) obj).a;
                return jt0Var;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return ((jt0) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 1:
                return ((jt0) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 2:
                return ((jt0) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            default:
                Offset offset = (Offset) obj;
                long j = offset.a;
                return ((jt0) create(offset, (lnm) obj2)).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0086, code lost:
    
        if (p.hap1.i(8, r22) == r4) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.jt0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jt0(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
    }
}
