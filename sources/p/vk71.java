package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vk71 extends a8d1 implements vu30 {
    public final /* synthetic */ wat a;
    public final /* synthetic */ hdn0 b;
    public final /* synthetic */ c380 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk71(wat watVar, hdn0 hdn0Var, c380 c380Var, float f, iu30 iu30Var, int i, lnm lnmVar) {
        super(2, lnmVar);
        this.a = watVar;
        this.b = hdn0Var;
        this.c = c380Var;
        this.d = f;
        this.e = iu30Var;
        this.f = i;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new vk71(this.a, this.b, this.c, this.d, this.e, this.f, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        vk71 vk71VarCreate = create((c9n) obj, (lnm) obj2);
        rih1 rih1Var = rih1.a;
        vk71VarCreate.invokeSuspend(rih1Var);
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        hm5.M(obj);
        err0 err0Var = this.b;
        if (err0Var.s() != 0) {
            c380 c380Var = this.c;
            int size = c380Var.size();
            ArrayList arrayList = new ArrayList(size);
            int iMax = 0;
            for (int i = 0; i < size; i++) {
                arrayList.add(new p3v(0.0f));
            }
            wat watVar = this.a;
            int iX0 = ((int) watVar.X0(this.d)) * 2;
            int i2 = 0;
            for (Object obj2 : c380Var) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    p7h.T();
                    throw null;
                }
                float f = ((bb71) obj2).a.b.c.a;
                float fS = err0Var.s() - iX0;
                float f2 = this.f * f;
                if (f2 <= fS) {
                    fS = f2;
                }
                iMax = Math.max((int) (fS / f), iMax);
                arrayList.set(i2, new p3v(watVar.N0(fS)));
                i2 = i3;
            }
            this.e.invoke(new btd(arrayList, watVar.M0(iMax), 16.0f, watVar.N0((err0Var.s() / 2.0f) - (watVar.X0(((p3v) o7h.q0(arrayList)).a) / 2.0f)), watVar.N0((err0Var.s() / 2.0f) - (watVar.X0(((p3v) o7h.A0(arrayList)).a) / 2.0f))));
        }
        return rih1.a;
    }
}
