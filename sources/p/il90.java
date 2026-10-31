package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class il90 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ bct c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ il90(ArrayList arrayList, bct bctVar, byte b) {
        super(1);
        this.a = b;
        this.b = arrayList;
        this.c = bctVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        bct bctVar = this.c;
        ArrayList<j0v0> arrayList = this.b;
        switch (b) {
            case 0:
                vu30 vu30Var = (vu30) obj;
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                for (j0v0 j0v0Var : arrayList) {
                    arrayList2.add((bl90) vu30Var.invoke(j0v0Var, new hl90(j0v0Var, bctVar, (byte) 0)));
                }
                return arrayList2;
            default:
                vu30 vu30Var2 = (vu30) obj;
                ArrayList arrayList3 = new ArrayList(q7h.U(arrayList, 10));
                for (j0v0 j0v0Var2 : arrayList) {
                    arrayList3.add((bl90) vu30Var2.invoke(j0v0Var2, new hl90(j0v0Var2, bctVar, (byte) 1)));
                }
                return arrayList3;
        }
    }
}
