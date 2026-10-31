package p;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y3w extends a8d1 implements vu30 {
    public final /* synthetic */ ven0 N0;
    public final /* synthetic */ ven0 O0;
    public final /* synthetic */ ven0 X;
    public final /* synthetic */ vu30 Y;
    public final /* synthetic */ ven0 Z;
    public boolean a;
    public final /* synthetic */ q3w b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ zah1 f;
    public final /* synthetic */ ven0 g;
    public final /* synthetic */ ven0 h;
    public final /* synthetic */ ven0 i;
    public final /* synthetic */ c9n t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3w(q3w q3wVar, String str, boolean z, Function0 function0, zah1 zah1Var, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, c9n c9nVar, ven0 ven0Var4, vu30 vu30Var, ven0 ven0Var5, ven0 ven0Var6, ven0 ven0Var7, lnm lnmVar) {
        super(2, lnmVar);
        this.b = q3wVar;
        this.c = str;
        this.d = z;
        this.e = function0;
        this.f = zah1Var;
        this.g = ven0Var;
        this.h = ven0Var2;
        this.i = ven0Var3;
        this.t = c9nVar;
        this.X = ven0Var4;
        this.Y = vu30Var;
        this.Z = ven0Var5;
        this.N0 = ven0Var6;
        this.O0 = ven0Var7;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new y3w(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, this.N0, this.O0, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0060 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:5:0x000c, B:16:0x0030, B:18:0x003a, B:19:0x0047, B:21:0x004b, B:23:0x0055, B:28:0x0062, B:30:0x0073, B:27:0x0060, B:33:0x008c, B:34:0x0091, B:12:0x001d), top: B:37:0x0008 }] */
    public final Object invokeSuspend(Object obj) {
        zah1 zah1Var;
        boolean z = this.a;
        ven0 ven0Var = this.O0;
        String str = this.c;
        try {
            if (!z) {
                hm5.M(obj);
                q3w q3wVar = this.b;
                boolean z2 = this.d;
                this.a = true;
                obj = q3wVar.a.d(str, z2, q3wVar.b, this);
                d9n d9nVar = d9n.a;
                if (obj == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (!z) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            nm81 nm81Var = (nm81) obj;
            if (u890.j(nm81Var, mm81.a)) {
                this.g.setValue(Boolean.TRUE);
                this.e.invoke();
            } else {
                if (!(nm81Var instanceof fm81)) {
                    throw new NoWhenBranchMatchedException();
                }
                ven0 ven0Var2 = this.h;
                zah1 zah1VarA = ((fm81) nm81Var).a();
                if (zah1VarA == null) {
                    zah1Var = this.f;
                } else {
                    zah1Var = ihc1.y0(zah1VarA.a) ? null : zah1VarA;
                    if (zah1Var == null) {
                        zah1Var = this.f;
                    }
                }
                ven0Var2.setValue(zah1Var);
                if (!u890.j((String) this.i.getValue(), str)) {
                    irn1.j(this.t, this.X, this.Y, this.Z, this.N0, this.i, this.c);
                }
            }
            ven0Var.setValue(Boolean.FALSE);
            return rih1.a;
        } catch (Throwable th) {
            ven0Var.setValue(Boolean.FALSE);
            throw th;
        }
    }
}
