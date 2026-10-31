package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class g2g1 extends hab0 implements iu30 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2g1(Function0 function0, float f, float f2, float f3, float f4) {
        super(1);
        this.a = function0;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    public final Object invoke(Object obj) {
        float fFloatValue = ((Number) this.a.invoke()).floatValue();
        int iT = (int) dm5.T(this.b, this.c, fFloatValue);
        return new qr80((((long) ((int) dm5.T(this.d, this.e, fFloatValue))) & 4294967295L) | (((long) iT) << 32));
    }
}
