package p;

import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kez0 extends hab0 implements vu30 {
    public final /* synthetic */ qim0 a;
    public final /* synthetic */ es41 b;
    public final /* synthetic */ ViewGroup c;
    public final /* synthetic */ j2i d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kez0(qim0 qim0Var, es41 es41Var, ViewGroup viewGroup, j2i j2iVar, int i, int i2, int i3, int i4, int i5, int i6) {
        super(2);
        this.a = qim0Var;
        this.b = es41Var;
        this.c = viewGroup;
        this.d = j2iVar;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = i5;
        this.t = i6;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
        rih1 rih1Var = rih1.a;
        if (!zY) {
            x340Var2.b0();
            return rih1Var;
        }
        qim0 qim0Var = this.a;
        es41 es41Var = this.b;
        qim0 qim0VarT = l6o1.t(qim0Var, es41Var, 14);
        List[] listArr = mez0.a;
        boolean zD = es41Var.d();
        ViewGroup viewGroup = this.c;
        if (zD || es41Var.c()) {
            qim0VarT = f8d1.b(qim0VarT, rih1Var, new jt(viewGroup, (byte) 2));
        } else {
            viewGroup.requestDisallowInterceptTouchEvent(false);
        }
        j2i j2iVar = this.d;
        boolean zG = x340Var2.g(j2iVar) | x340Var2.e(3) | x340Var2.e(this.e) | x340Var2.e(this.f) | x340Var2.e(this.g) | x340Var2.e(this.h) | x340Var2.e(this.i) | x340Var2.e(this.t);
        Object objT = x340Var2.T();
        if (zG || objT == fkj0.X) {
            objT = new jez0(this.e, this.f, this.g, this.h, j2iVar, this.i, this.t);
            x340Var2.s0(objT);
        }
        ejo1.l(0, 0, x340Var2, (vu30) objT, qim0VarT);
        return rih1Var;
    }
}
