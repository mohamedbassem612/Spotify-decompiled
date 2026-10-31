package p;

import com.spotify.betamax.player.VideoSurfaceView;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class m45 extends a8d1 implements vu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ byte a = 1;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m45(b9l1 b9l1Var, ven0 ven0Var, clj1 clj1Var, q9l1 q9l1Var, c2u0 c2u0Var, String str, ven0 ven0Var2, ven0 ven0Var3, ven0 ven0Var4, ven0 ven0Var5, m0t m0tVar, lnm lnmVar) {
        super(2, lnmVar);
        this.c = b9l1Var;
        this.d = ven0Var;
        this.e = clj1Var;
        this.f = q9l1Var;
        this.g = c2u0Var;
        this.h = str;
        this.i = ven0Var2;
        this.t = ven0Var3;
        this.X = ven0Var4;
        this.Y = ven0Var5;
        this.Z = m0tVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.Z;
        Object obj3 = this.Y;
        Object obj4 = this.X;
        Object obj5 = this.t;
        Object obj6 = this.i;
        Object obj7 = this.h;
        Object obj8 = this.g;
        Object obj9 = this.f;
        Object obj10 = this.e;
        Object obj11 = this.d;
        switch (b) {
            case 0:
                m45 m45Var = new m45((sen0) obj11, (ggg1) obj10, (aae1) obj9, (xid) obj8, (jx4) obj7, (x180) obj6, (iu30) obj5, (Function0) obj3, (e8k1) obj2, (iu30) obj4, lnmVar);
                m45Var.c = obj;
                return m45Var;
            default:
                return new m45((b9l1) this.c, (ven0) obj11, (clj1) obj10, (q9l1) obj9, (c2u0) obj8, (String) obj7, (ven0) obj6, (ven0) obj5, (ven0) obj4, (ven0) obj3, (m0t) obj2, lnmVar);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invoke(Object obj, Object obj2) throws KotlinNothingValueException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return d9n.a;
            default:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        r091 r091Var;
        byte b = this.a;
        Object obj2 = this.Z;
        Object obj3 = this.t;
        Object obj4 = this.i;
        Object obj5 = this.h;
        d9n d9nVar = d9n.a;
        Object obj6 = this.X;
        Object obj7 = this.Y;
        Object obj8 = this.g;
        Object obj9 = this.d;
        Object obj10 = this.e;
        Object obj11 = this.f;
        switch (b) {
            case 0:
                ggg1 ggg1Var = (ggg1) obj10;
                xid xidVar = (xid) obj8;
                boolean z = this.b;
                if (z) {
                    if (z) {
                        throw l1d.v(obj);
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                c9n c9nVar = (c9n) this.c;
                fn31.T(c9nVar, (o8n) null, 4, new hi2(ggg1Var, xidVar, (lnm) null, (byte) 23), 1);
                sen0 sen0Var = (sen0) obj9;
                if (sen0Var != null) {
                    fn31.T(c9nVar, (o8n) null, 0, new wt(sen0Var, xidVar, (lnm) null, (byte) 9), 3);
                }
                k45 k45Var = new k45((ggg1) obj10, (x180) obj4, (xid) obj8, (iu30) obj3, new ooo(ggg1Var, (aae1) obj11, xidVar, c9nVar), (aae1) obj11, (Function0) obj7, (e8k1) obj2, (iu30) obj6);
                this.b = true;
                ((jx4) obj5).a(k45Var, this);
                return d9nVar;
            default:
                ven0 ven0Var = (ven0) obj7;
                ven0 ven0Var2 = (ven0) obj6;
                clj1 clj1Var = (clj1) obj10;
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1.a;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ven0 ven0Var3 = (ven0) obj9;
                r091 r091VarA = ((b9l1) this.c).a((r091) ven0Var3.getValue());
                if (r091VarA != null) {
                    q9l1 q9l1Var = (q9l1) obj11;
                    c2u0 c2u0Var = (c2u0) obj8;
                    String str = (String) obj5;
                    ven0 ven0Var4 = (ven0) obj3;
                    r091VarA.i((VideoSurfaceView) ((ven0) obj4).getValue());
                    if (!u890.j(ebp1.n(r091VarA), (lsm0) ven0Var4.getValue())) {
                        lsm0 lsm0Var = (lsm0) ven0Var4.getValue();
                        if (lsm0Var == null) {
                            hhg1.n("Required value was null.");
                            return null;
                        }
                        r091VarA.b(lsm0Var);
                    }
                    r091VarA.e((tv80) ((iu30) ven0Var2.getValue()).invoke(n3p1.q(clj1Var)), q9l1Var.f.b, (String) ((Function0) ven0Var.getValue()).invoke(), mky0.a);
                    w590 w590VarA = r091VarA.a();
                    c2u0.a(c2u0Var, "MultiplayerCanvasVideoPlayback.onActive", new mwt0(w590VarA != null ? w590VarA.i() : null, (String) null, str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, "canvas", (String) null, (String) null, (String) null, (String) null, (String) null, 258042), 12);
                    r091Var = r091VarA;
                } else {
                    r091Var = null;
                }
                ven0Var3.setValue(r091Var);
                pwm0 pwm0Var = new pwm0((m0t) obj2, clj1Var, (q9l1) obj11, (ven0) obj9, ven0Var2, ven0Var, (lnm) null, (byte) 0);
                this.b = true;
                if (smo1.s(pwm0Var, this) == d9nVar) {
                    return d9nVar;
                }
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m45(sen0 sen0Var, ggg1 ggg1Var, aae1 aae1Var, xid xidVar, jx4 jx4Var, x180 x180Var, iu30 iu30Var, Function0 function0, e8k1 e8k1Var, iu30 iu30Var2, lnm lnmVar) {
        super(2, lnmVar);
        this.d = sen0Var;
        this.e = ggg1Var;
        this.f = aae1Var;
        this.g = xidVar;
        this.h = jx4Var;
        this.i = x180Var;
        this.t = iu30Var;
        this.Y = function0;
        this.Z = e8k1Var;
        this.X = iu30Var2;
    }
}
