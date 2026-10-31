package p;

import java.io.Serializable;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class idm implements cvl1, xpw {
    public final kdm a;
    public final vgm b;
    public final f8b c;
    public final o241 d;
    public final qns0 e;
    public final js20 f = x3p1.n(new s20(this, 6), xj.c1, new z691(this, (byte) 13), (o8n) null, new v7l(this, (byte) 12), 8);
    public final hy00 g = n3o1.r(this).c(h40.X, ngl.e1);
    public final psw h;

    public idm(kdm kdmVar, vgm vgmVar, f8b f8bVar, o241 o241Var, qns0 qns0Var) {
        this.a = kdmVar;
        this.b = vgmVar;
        this.c = f8bVar;
        this.d = o241Var;
        this.e = qns0Var;
        j2i j2iVar = tfi.a;
        ien0 ien0Var = qsw.a;
        this.h = new psw(j2iVar, (byte) 0);
    }

    @Override // p.avl1
    public final rqw a() {
        return this.g;
    }

    @Override // p.maa
    public final jsw c() {
        return this.h;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable e(String str, onm onmVar) {
        edm edmVar;
        Boolean m231Var;
        if (onmVar instanceof edm) {
            edmVar = (edm) onmVar;
            int i = edmVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                edmVar.d = i - Integer.MIN_VALUE;
            } else {
                edmVar = new edm(this, onmVar);
            }
        } else {
            edmVar = new edm(this, onmVar);
        }
        Object objA = edmVar.b;
        int i2 = edmVar.d;
        Object obj = null;
        boolean z = true;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                qns0 qns0Var = this.e;
                List listX = k4p1.x(str);
                edmVar.a = str;
                edmVar.d = 1;
                objA = qns0Var.a("context_menu_button", listX, edmVar, true);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = edmVar.a;
                hm5.M(objA);
            }
            for (Object obj2 : (Iterable) objA) {
                if (((qfd) obj2).a.equals(str)) {
                    obj = obj2;
                    break;
                }
            }
            qfd qfdVar = (qfd) obj;
            if (qfdVar == null || !qfdVar.b) {
                z = false;
            }
            m231Var = yah0.m(z);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        return m231Var instanceof m231 ? yah0.m(false) : m231Var;
    }

    @Override // p.maa
    public final mqw getBehavior() {
        return this.f;
    }
}
