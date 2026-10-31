package p;

import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class s7n extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ nav0 c;
    public final /* synthetic */ b4e1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s7n(nav0 nav0Var, b4e1 b4e1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = nav0Var;
        this.d = b4e1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new s7n(this.c, this.d, lnmVar, (byte) 0);
            case 1:
                return new s7n(this.c, this.d, lnmVar, (byte) 1);
            default:
                return new s7n(this.c, this.d, lnmVar, (byte) 2);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        nav0 nav0Var = this.c;
        final b4e1 b4e1Var = this.d;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        final byte b2 = 1;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    Object objS = smo1.s(new az80(nav0Var, b4e1Var, (lnm) null, (byte) 13), this);
                    if (objS != d9nVar) {
                        objS = rih1Var;
                    }
                    if (objS == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.b = true;
                    Object objD = s9p1.D(nav0Var, new mi6(b4e1Var, null, (byte) 2), this);
                    if (objD != d9nVar) {
                        objD = rih1Var;
                    }
                    if (objD == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            default:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    this.b = true;
                    final byte b3 = 0;
                    Object objH = g5v.h(new Function0() { // from class: p.k5f0
                        public final Object invoke() {
                            byte b4 = b3;
                            rih1 rih1Var2 = rih1.a;
                            b4e1 b4e1Var2 = b4e1Var;
                            switch (b4) {
                                case 0:
                                    b4e1Var2.a();
                                    break;
                                default:
                                    b4e1Var2.onCancel();
                                    break;
                            }
                            return rih1Var2;
                        }
                    }, new Function0() { // from class: p.k5f0
                        public final Object invoke() {
                            byte b4 = b2;
                            rih1 rih1Var2 = rih1.a;
                            b4e1 b4e1Var2 = b4e1Var;
                            switch (b4) {
                                case 0:
                                    b4e1Var2.a();
                                    break;
                                default:
                                    b4e1Var2.onCancel();
                                    break;
                            }
                            return rih1Var2;
                        }
                    }, this, new iu30() { // from class: p.j5f0
                        public final Object invoke(Object obj2) {
                            byte b4 = b3;
                            rih1 rih1Var2 = rih1.a;
                            b4e1 b4e1Var2 = b4e1Var;
                            switch (b4) {
                                case 0:
                                    b4e1Var2.b(((Offset) obj2).a, w1x0.X);
                                    break;
                                case 1:
                                    hav0 hav0Var = (hav0) obj2;
                                    b4e1Var2.e(p8p1.B(hav0Var, false));
                                    hav0Var.a();
                                    break;
                                default:
                                    hav0 hav0Var2 = (hav0) obj2;
                                    b4e1Var2.e(p8p1.B(hav0Var2, false));
                                    hav0Var2.a();
                                    break;
                            }
                            return rih1Var2;
                        }
                    }, new w9(b4e1Var, (byte) 12), this.c);
                    if (objH != d9nVar) {
                        objH = rih1Var;
                    }
                    if (objH == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
        }
    }
}
