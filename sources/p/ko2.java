package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ko2 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a = 1;
    public boolean b;
    public /* synthetic */ vr20 c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Serializable g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ko2(lnm lnmVar, g3q0 g3q0Var, String str, int i) {
        super(3, lnmVar);
        this.f = g3q0Var;
        this.g = str;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        p811 p811Var = this.g;
        Object obj4 = this.f;
        vr20 vr20Var = (vr20) obj;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ko2 ko2Var = new ko2((lo2) obj4, p811Var, (lnm) obj3);
                ko2Var.c = vr20Var;
                ko2Var.e = (w18) obj2;
                return ko2Var.invokeSuspend(rih1Var);
            default:
                ko2 ko2Var2 = new ko2((lnm) obj3, (g3q0) obj4, (String) p811Var, this.d);
                ko2Var2.c = vr20Var;
                ko2Var2.e = obj2;
                return ko2Var2.invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00b3  */
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        m441 huzVar;
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                vr20 vr20Var = this.c;
                w18 w18Var = (w18) this.e;
                d9n d9nVar = d9n.a;
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    faa0 faa0Var = ((lo2) this.f).f;
                    Object obj2 = this.g.a;
                    if (obj2 == null) {
                        u890.C("sessionJob");
                        throw null;
                    }
                    i = faa0Var == ((faa0) obj2) ? 1 : 0;
                    if (i != 0) {
                        this.c = null;
                        this.e = w18Var;
                        this.d = i;
                        this.b = true;
                        if (vr20Var.emit(w18Var, this) == d9nVar) {
                            return d9nVar;
                        }
                        i2 = i;
                    }
                    return Boolean.valueOf((i != 0 || (w18Var instanceof u18) || (w18Var instanceof v18) || (w18Var instanceof s18)) ? false : true);
                }
                if (!z) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = this.d;
                hm5.M(obj);
                i = i2;
                return Boolean.valueOf((i != 0 || (w18Var instanceof u18) || (w18Var instanceof v18) || (w18Var instanceof s18)) ? false : true);
            default:
                vr20 vr20Var2 = this.c;
                Object obj3 = this.e;
                d9n d9nVar2 = d9n.a;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    if (((Boolean) obj3).booleanValue()) {
                        g3q0 g3q0Var = (g3q0) this.f;
                        String str = (String) this.g;
                        int i3 = this.d;
                        huzVar = new m441(new f3q0(g3q0Var, str, i3 * 86400, i3, null));
                    } else {
                        huzVar = new huz(c3q0.a, (byte) 10);
                    }
                    this.c = null;
                    this.e = null;
                    this.b = true;
                    if (l4p1.s(vr20Var2, huzVar, this) == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ko2(lo2 lo2Var, p811 p811Var, lnm lnmVar) {
        super(3, lnmVar);
        this.f = lo2Var;
        this.g = p811Var;
    }
}
