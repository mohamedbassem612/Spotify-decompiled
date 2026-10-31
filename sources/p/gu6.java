package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gu6 extends hab0 implements iu30 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ czg b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float g;
    public final /* synthetic */ float h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gu6(ArrayList arrayList, czg czgVar, float f, float f2, boolean z, float f3, float f4, float f5) {
        super(1);
        this.a = arrayList;
        this.b = czgVar;
        this.c = f;
        this.d = f2;
        this.e = z;
        this.f = f3;
        this.g = f4;
        this.h = f5;
    }

    public final Object invoke(Object obj) {
        p5t0 p5t0Var = (p5t0) obj;
        int i = 0;
        for (Object obj2 : this.a) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            q5t0 q5t0Var = (q5t0) obj2;
            jcg jcgVar = (jcg) this.b.a.get(i);
            float f = (this.d * jcgVar.b) + this.c;
            if (this.e) {
                f = this.f - f;
            }
            p5t0Var.f(q5t0Var, jch0.U(f - (q5t0Var.a / 2.0f)), jch0.U(((this.h * jcgVar.c) + this.g) - (q5t0Var.b / 2.0f)), 0.0f);
            i = i2;
        }
        return rih1.a;
    }
}
