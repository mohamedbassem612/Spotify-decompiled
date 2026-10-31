package p;

import android.view.ViewGroup;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jt implements PointerInputEventHandler {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ jt(ViewGroup viewGroup, byte b) {
        this.a = b;
        this.b = viewGroup;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0061  */
    /* JADX WARN: Code duplicated, block: B:41:0x009e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    public final Object invoke(nav0 nav0Var, lnm lnmVar) {
        ht htVar;
        lcd0 lcd0Var;
        lez0 lez0Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        ViewGroup viewGroup = this.b;
        switch (b) {
            case 0:
                if (lnmVar instanceof ht) {
                    htVar = (ht) lnmVar;
                    int i = htVar.c;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        htVar.c = i - Integer.MIN_VALUE;
                    } else {
                        htVar = new ht(this, lnmVar);
                    }
                } else {
                    htVar = new ht(this, lnmVar);
                }
                Object obj = htVar.a;
                int i2 = htVar.c;
                if (i2 == 0) {
                    hm5.M(obj);
                    gt gtVar = new gt(viewGroup, null, (byte) 0);
                    htVar.c = 1;
                    if (s9p1.D(nav0Var, gtVar, htVar) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i2 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                viewGroup.requestDisallowInterceptTouchEvent(false);
                return rih1Var;
            case 1:
                if (lnmVar instanceof lcd0) {
                    lcd0Var = (lcd0) lnmVar;
                    int i3 = lcd0Var.c;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        lcd0Var.c = i3 - Integer.MIN_VALUE;
                    } else {
                        lcd0Var = new lcd0(this, lnmVar);
                    }
                } else {
                    lcd0Var = new lcd0(this, lnmVar);
                }
                Object obj2 = lcd0Var.a;
                int i4 = lcd0Var.c;
                if (i4 == 0) {
                    hm5.M(obj2);
                    gt gtVar2 = new gt(viewGroup, null, (byte) 1);
                    lcd0Var.c = 1;
                    if (s9p1.D(nav0Var, gtVar2, lcd0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i4 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj2);
                }
                viewGroup.requestDisallowInterceptTouchEvent(false);
                return rih1Var;
            default:
                if (lnmVar instanceof lez0) {
                    lez0Var = (lez0) lnmVar;
                    int i5 = lez0Var.c;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        lez0Var.c = i5 - Integer.MIN_VALUE;
                    } else {
                        lez0Var = new lez0(this, lnmVar);
                    }
                } else {
                    lez0Var = new lez0(this, lnmVar);
                }
                Object obj3 = lez0Var.a;
                int i6 = lez0Var.c;
                if (i6 == 0) {
                    hm5.M(obj3);
                    gt gtVar3 = new gt(viewGroup, null, (byte) 2);
                    lez0Var.c = 1;
                    if (s9p1.D(nav0Var, gtVar3, lez0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i6 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj3);
                }
                viewGroup.requestDisallowInterceptTouchEvent(false);
                return rih1Var;
        }
    }
}
