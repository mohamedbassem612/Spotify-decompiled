package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class csh extends a8d1 implements vu30 {
    public byte a;
    public /* synthetic */ long b;
    public final /* synthetic */ r7e1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csh(r7e1 r7e1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = r7e1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        csh cshVar = new csh(this.c, lnmVar);
        cshVar.b = ((Offset) obj).a;
        return cshVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        Offset offset = (Offset) obj;
        long j = offset.a;
        return ((csh) create(offset, (lnm) obj2)).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        r7e1 r7e1Var = this.c;
        ggg1 ggg1Var = r7e1Var.a;
        byte b = this.a;
        d9n d9nVar = rih1.a;
        d9n d9nVar2 = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            this.b = this.b;
            this.a = (byte) 1;
            r7e1Var.z();
            if (d9nVar != d9nVar2) {
            }
            return d9nVar2;
        }
        if (b == 1) {
            hm5.M(obj);
        } else {
            if (b != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return d9nVar;
        ndt0 ndt0Var = r7e1Var.f;
        if (ndt0Var != null) {
            CharSequence charSequence = ggg1Var.h().d;
            long j = ggg1Var.h().e;
            this.a = (byte) 2;
            if (ndt0Var.e(charSequence, j, this) == d9nVar2) {
                return d9nVar2;
            }
        }
        return d9nVar;
    }
}
