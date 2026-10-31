package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wxj extends a8d1 implements vu30 {
    public boolean a;
    public boolean b;
    public /* synthetic */ float c;
    public final /* synthetic */ xxj d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wxj(xxj xxjVar, lnm lnmVar) {
        super(2, lnmVar);
        this.d = xxjVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        wxj wxjVar = new wxj(this.d, lnmVar);
        wxjVar.c = ((Number) obj).floatValue();
        return wxjVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create(Float.valueOf(((Number) obj).floatValue()), (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2 = this.b;
        if (!z2) {
            hm5.M(obj);
            float f = this.c;
            xxj xxjVar = this.d;
            Object objG = xxjVar.a.d.a.g(m161.e);
            vu30 vu30Var = (vu30) (objG != null ? objG : null);
            if (vu30Var == null) {
                throw l1d.w("Required value was null.");
            }
            boolean z3 = ((pq41) xxjVar.a.d.d(z161.w)).c;
            if (z3) {
                f = -f;
            }
            Offset offset = new Offset((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
            this.a = z3;
            this.b = true;
            obj = vu30Var.invoke(offset, this);
            d9n d9nVar = d9n.a;
            if (obj == d9nVar) {
                return d9nVar;
            }
            z = z3;
        } else {
            if (!z2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = this.a;
            hm5.M(obj);
        }
        long j = ((Offset) obj).a;
        return new Float(z ? -Float.intBitsToFloat((int) (j & 4294967295L)) : Float.intBitsToFloat((int) (j & 4294967295L)));
    }
}
