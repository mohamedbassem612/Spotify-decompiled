package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ehi0 extends hab0 implements iu30 {
    public final /* synthetic */ igi0 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ hdn0 d;
    public final /* synthetic */ j2i e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehi0(igi0 igi0Var, float f, int i, hdn0 hdn0Var, j2i j2iVar) {
        super(1);
        this.a = igi0Var;
        this.b = f;
        this.c = i;
        this.d = hdn0Var;
        this.e = j2iVar;
    }

    public final Object invoke(Object obj) {
        ArrayList arrayList = this.a.b;
        ((rtb0) obj).e(arrayList.size(), new qbb0(arrayList, (byte) 10), new qbb0(arrayList, (byte) 11), new j2i(2039820996, new dhi0(arrayList, this.b, this.c, this.d, this.e), true));
        return rih1.a;
    }
}
